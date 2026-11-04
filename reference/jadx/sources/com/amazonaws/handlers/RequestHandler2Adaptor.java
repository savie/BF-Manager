package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes.dex */
public final class RequestHandler2Adaptor extends RequestHandler2 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RequestHandler f167;

    public RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler == null) {
            throw new IllegalArgumentException();
        }
        this.f167 = requestHandler;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ۙ */
    public final void mo235(DefaultRequest defaultRequest) {
        this.f167.m232();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ۙ */
    public final void mo237(DefaultRequest defaultRequest, Response response) {
        this.f167.m234();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ۙ */
    public final void mo236(DefaultRequest defaultRequest, AmazonClientException amazonClientException) {
        this.f167.m233();
    }

    public final int hashCode() {
        return this.f167.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestHandler2Adaptor) {
            return this.f167.equals(((RequestHandler2Adaptor) obj).f167);
        }
        return false;
    }
}
