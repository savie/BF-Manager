package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.ۢ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9846 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f33629;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f33630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f33631;

    public C9846(String str) {
        this.f33629 = str;
        this.f33630 = null;
        if (str.endsWith("/")) {
            this.f33631 = C20630.m46498(1, str.lastIndexOf(47, str.length() - 2) + 1, str);
        } else {
            this.f33631 = str.substring(str.lastIndexOf(47) + 1);
        }
    }

    public C9846(S3ObjectSummary s3ObjectSummary) {
        this.f33629 = null;
        this.f33630 = s3ObjectSummary;
        String strM660 = s3ObjectSummary.m660();
        this.f33631 = strM660.substring(strM660.lastIndexOf(47) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7729 m24949() {
        String str = this.f33629;
        if (str == null) {
            return C7729.m20376(this.f33630);
        }
        return C7729.m20377(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24950() {
        return this.f33629 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m24951() {
        return this.f33631;
    }
}
