package com.amazonaws.services.s3.model;

import com.alipay.sdk.m.y.l;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f538;

    public BucketTaggingConfiguration() {
        this.f538 = null;
        this.f538 = new ArrayList(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m530() {
        return this.f538;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("TagSets: " + this.f538);
        stringBuffer.append(l.d);
        return stringBuffer.toString();
    }
}
