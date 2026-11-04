package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.AmazonS3;
import l.ConcurrentMapC17249;

/* JADX INFO: loaded from: classes.dex */
public class S3ClientReference {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC17249 f271 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AmazonS3 m347(Integer num) {
        return (AmazonS3) f271.get(num);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m348(Integer num) {
        f271.remove(num);
    }
}
