package com.amazonaws.services.s3.model;

import java.io.Serializable;
import l.C3188;

/* JADX INFO: loaded from: classes.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f535 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f536 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m528(String str) {
        if (str == null) {
            str = "";
        }
        this.f536 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m527(String str) {
        this.f535 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f535 == null || this.f536 == null) ? false : true);
        String string = sb.toString();
        if (this.f535 == null || this.f536 == null) {
            return string;
        }
        StringBuilder sbM10405 = C3188.m10405(string, ", destinationBucketName=");
        sbM10405.append(this.f535);
        sbM10405.append(", logFilePrefix=");
        sbM10405.append(this.f536);
        return sbM10405.toString();
    }
}
