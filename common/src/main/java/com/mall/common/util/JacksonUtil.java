package com.mall.common.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.List;

public class JacksonUtil {

    private static final Log logger = LogFactory.getLog(JacksonUtil.class);

    public static String parseString(String body, String field) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node;
        try {
            node = mapper.readTree(body);
            JsonNode leaf = node.get(field);
            if (leaf != null)
                return leaf.asText();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static Integer parseInteger(String body, String field) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node;
        try {
            node = mapper.readTree(body);
            JsonNode leaf = node.get(field);
            if (leaf != null)
                return leaf.asInt();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static List<Integer> parseIntegerList(String body, String field) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node;
        try {
            node = mapper.readTree(body);
            JsonNode leaf = node.get(field);

            if (leaf != null)
                return mapper.convertValue(leaf, new TypeReference<List<Integer>>() {
                });
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static Short parseShort(String body, String field) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node;
        try {
            node = mapper.readTree(body);
            JsonNode leaf = node.get(field);
            if (leaf != null) {
                Integer value = leaf.asInt();
                return value.shortValue();
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static Byte parseByte(String body, String field) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node;
        try {
            node = mapper.readTree(body);
            JsonNode leaf = node.get(field);
            if (leaf != null) {
                Integer value = leaf.asInt();
                return value.byteValue();
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

}
