package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import l.C14442;
import l.C8947;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f139 = "/".concat("AwsCredentials.properties");

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ۙ */
    public final AWSCredentials mo202() {
        Class<?> cls = getClass();
        String str = this.f139;
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new AmazonClientException(C14442.m34865("Unable to load AWS credentials from the ", str, " file on the classpath"));
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException(C14442.m34865("Unable to load AWS credentials from the ", str, " file on the classpath"), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        return C8947.m23910(sb, this.f139, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
