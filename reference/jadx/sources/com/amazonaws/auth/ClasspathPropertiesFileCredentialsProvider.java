package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import l.C16523;
import l.C22697;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f149 = "/".concat("AwsCredentials.properties");

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ۙ */
    public final AWSCredentials mo208() {
        Class<?> cls = getClass();
        String str = this.f149;
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new AmazonClientException(C16523.m38890("Unable to load AWS credentials from the ", str, " file on the classpath"));
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException(C16523.m38890("Unable to load AWS credentials from the ", str, " file on the classpath"), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        return C22697.m50267(sb, this.f149, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
