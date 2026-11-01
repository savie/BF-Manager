package com.amazonaws.retry;

import com.alipay.sdk.m.o.b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class PredefinedRetryPolicies {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f450 = new RetryPolicy(RetryPolicy.RetryCondition.f461, RetryPolicy.BackoffStrategy.f460, 0, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f451;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final SDKDefaultRetryCondition f452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy.BackoffStrategy f453;

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f452 = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f453 = sDKDefaultBackoffStrategy;
        f451 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }

    public class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean mo428(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int iM142 = amazonServiceException.m142();
            if (iM142 == 500 || iM142 == 503 || iM142 == 502 || iM142 == 504) {
                return true;
            }
            String strM144 = amazonServiceException.m144();
            return "Throttling".equals(strM144) || "ThrottlingException".equals(strM144) || "ProvisionedThroughputExceededException".equals(strM144) || RetryUtils.m432(amazonServiceException);
        }
    }

    public final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
        public final Random f454 = new Random();

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final int f456 = 100;

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public final int f455 = b.j0;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final long mo427(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f454.nextInt(Math.min(this.f455, (1 << i) * this.f456));
        }
    }
}
