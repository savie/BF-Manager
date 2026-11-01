package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RetryUtils {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m432(AmazonServiceException amazonServiceException) {
        String strM144 = amazonServiceException.m144();
        return "RequestTimeTooSkewed".equals(strM144) || "RequestExpired".equals(strM144) || "InvalidSignatureException".equals(strM144) || "SignatureDoesNotMatch".equals(strM144);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m433(Exception exc) {
        if (exc instanceof AbortedException) {
            return true;
        }
        if (exc.getCause() == null) {
            return false;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof InterruptedException) {
            return true;
        }
        return (cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException);
    }
}
