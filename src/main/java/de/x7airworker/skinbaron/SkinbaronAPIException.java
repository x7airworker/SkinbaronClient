package de.x7airworker.skinbaron;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javawebstack.httpclient.HTTPRequest;

@AllArgsConstructor
@Getter
public class SkinbaronAPIException extends Throwable {
    private final HTTPRequest request;
}
