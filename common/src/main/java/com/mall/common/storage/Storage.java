package com.mall.common.storage;

import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.nio.file.Path;

public interface Storage {

    void store(InputStream inputStream, long contentLength, String contentType, String keyName);

    Path load(String keyName);

    Resource loadAsResource(String keyName);

    void delete(String keyName);

    String generateUrl(String keyName);
}