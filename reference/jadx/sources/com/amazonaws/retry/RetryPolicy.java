package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes.dex */
public final class RetryPolicy {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BackoffStrategy f447;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RetryCondition f448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f449;

    public interface BackoffStrategy {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public static final BackoffStrategy f450 = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            /* JADX INFO: renamed from: ۙ */
            public final long mo421(int i) {
                return 0L;
            }
        };

        /* JADX INFO: renamed from: ۙ */
        long mo421(int i);
    }

    public interface RetryCondition {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public static final RetryCondition f451 = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo422(AmazonClientException amazonClientException, int i) {
                return false;
            }
        };

        /* JADX INFO: renamed from: ۙ */
        boolean mo422(AmazonClientException amazonClientException, int i);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i, boolean z) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f441 : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f442 : backoffStrategy;
        if (i < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f448 = retryCondition;
        this.f447 = backoffStrategy;
        this.f449 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RetryCondition m424() {
        return this.f448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BackoffStrategy m423() {
        return this.f447;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m425() {
        return this.f449;
    }
}
