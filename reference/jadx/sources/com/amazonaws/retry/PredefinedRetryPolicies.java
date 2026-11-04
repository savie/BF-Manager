package com.amazonaws.retry;

import com.alipay.sdk.m.o.b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class PredefinedRetryPolicies {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final SDKDefaultRetryCondition f441;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy.BackoffStrategy f442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f443 = new RetryPolicy(RetryPolicy.RetryCondition.f451, RetryPolicy.BackoffStrategy.f450, 0, false);

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f441 = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f442 = sDKDefaultBackoffStrategy;
        f440 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }

    public class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean mo422(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int iM143 = amazonServiceException.m143();
            if (iM143 == 500 || iM143 == 503 || iM143 == 502 || iM143 == 504) {
                return true;
            }
            String strM136 = amazonServiceException.m136();
            return "Throttling".equals(strM136) || "ThrottlingException".equals(strM136) || "ProvisionedThroughputExceededException".equals(strM136) || RetryUtils.m426(amazonServiceException);
        }
    }

    public final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public final Random f446 = new Random();

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final int f445 = 100;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final int f444 = b.j0;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final long mo421(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f446.nextInt(Math.min(this.f444, (1 << i) * this.f445));
        }
    }
}
