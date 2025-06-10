package com.mall.order.controller;

import com.mall.common.annotation.LoginUser;
import com.mall.common.util.ResponseUtil;
import com.mall.order.entity.MallAddress;
import com.mall.order.entity.MallCart;
import com.mall.order.service.MallCartService;
import com.mall.order.service.MallOrderService;
import com.mall.order.service.MallAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
@Validated
public class OrderController {

    @Autowired
    private MallAddressService addressService;

    @Autowired
    private MallOrderService orderService;

    @Autowired
    private MallCartService cartService;

    @GetMapping("list")
    public Object list(@LoginUser Integer userId,
                       @RequestParam(defaultValue = "0") Integer showType,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        return orderService.list(userId, showType, page, limit, "add_time", "desc");
    }

    @GetMapping("detail")
    public Object detail(@LoginUser Integer userId, @NotNull Integer orderId) {
        return orderService.detail(userId, orderId);
    }

    @PostMapping("submit")
    public Object submit(@LoginUser Integer userId, @RequestBody String body) {
        return orderService.submit(userId, body);
    }

    @PostMapping("cancel")
    public Object cancel(@LoginUser Integer userId, @RequestBody String body) {
        return orderService.cancel(userId, body);
    }

    @PostMapping("prepay")
    public Object prepay(@LoginUser Integer userId, @RequestBody String body, HttpServletRequest request) {
        return orderService.prepay(userId, body, request);
    }

    @PostMapping("h5pay")
    public Object h5pay(@LoginUser Integer userId, @RequestBody String body, HttpServletRequest request) {
        return orderService.h5pay(userId, body, request);
    }

    @PostMapping("refund")
    public Object refund(@LoginUser Integer userId, @RequestBody String body) {
        return orderService.refund(userId, body);
    }

    @PostMapping("confirm")
    public Object confirm(@LoginUser Integer userId, @RequestBody String body) {
        return orderService.confirm(userId, body);
    }

    @PostMapping("delete")
    public Object delete(@LoginUser Integer userId, @RequestBody String body) {
        return orderService.delete(userId, body);
    }

    @GetMapping("goods")
    public Object goods(@LoginUser Integer userId,
                        @NotNull Integer orderId,
                        @NotNull Integer goodsId) {
        return orderService.goods(userId, orderId, goodsId);
    }

    @GetMapping("checkout")
    public Object checkout(@LoginUser Integer userId, Integer cartId, Integer addressId, Integer couponId, Integer userCouponId, Integer grouponRulesId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }

        // 收货地址
        MallAddress checkedAddress = null;
        if (addressId == null || addressId.equals(0)) {
            checkedAddress = addressService.findDefault(userId);
            // 如果仍然没有地址，则是没有收货地址
            // 返回一个空的地址id=0，这样前端则会提醒添加地址
            if (checkedAddress == null) {
                checkedAddress = new MallAddress();
                checkedAddress.setId(0);
                addressId = 0;
            } else {
                addressId = checkedAddress.getId();
            }

        } else {
            checkedAddress = addressService.query(userId, addressId);
            // 如果null, 则报错
            if (checkedAddress == null) {
                return ResponseUtil.badArgumentValue();
            }
        }

        // 商品价格
        List<MallCart> checkedGoodsList = null;
        if (cartId == null || cartId.equals(0)) {
            checkedGoodsList = cartService.queryByUidAndChecked(userId);
        } else {
            MallCart cart = cartService.findById(userId, cartId);
            if (cart == null) {
                return ResponseUtil.badArgumentValue();
            }
            checkedGoodsList = new ArrayList<>(1);
            checkedGoodsList.add(cart);
        }

        BigDecimal checkedGoodsPrice = new BigDecimal(0);
        for (MallCart checkGoods : checkedGoodsList) {
            checkedGoodsPrice = checkedGoodsPrice.add(checkGoods.getPrice().multiply(new BigDecimal(checkGoods.getNumber())));
        }

        // 订单费用
        BigDecimal orderTotalPrice = checkedGoodsPrice.add(new BigDecimal(0)).subtract(new BigDecimal(0)).max(new BigDecimal(0.00));

        BigDecimal actualPrice = orderTotalPrice.subtract(new BigDecimal(0));

        Map<String, Object> data = new HashMap<>();
        data.put("addressId", addressId);
        data.put("couponId", couponId);
        data.put("userCouponId", userCouponId);
        data.put("cartId", cartId);
        data.put("grouponRulesId", grouponRulesId);
        data.put("grouponPrice", 0);
        data.put("checkedAddress", checkedAddress);
        data.put("availableCouponLength", 0);
        data.put("goodsTotalPrice", checkedGoodsPrice);
        data.put("freightPrice", 0);
        data.put("couponPrice", 0);
        data.put("orderTotalPrice", orderTotalPrice);
        data.put("actualPrice", actualPrice);
        data.put("checkedGoodsList", checkedGoodsList);
        return ResponseUtil.ok(data);
    }

    @GetMapping("index")
    public Object list(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }

        Map<Object, Object> data = new HashMap<Object, Object>();
        data.put("order", orderService.orderInfo(userId));
        return ResponseUtil.ok(data);
    }

}