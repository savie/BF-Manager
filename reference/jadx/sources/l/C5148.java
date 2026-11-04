package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.ۙ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes2.dex */
public final class C5148 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f17947;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f17948;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f17949;

    public C5148(String str) {
        this.f17947 = str;
        this.f17948 = null;
        if (str.endsWith("/")) {
            this.f17949 = C1402.m5124(1, str.lastIndexOf(47, str.length() - 2) + 1, str);
        } else {
            this.f17949 = C18063.m42088(47, 1, str);
        }
    }

    public C5148(S3ObjectSummary s3ObjectSummary) {
        this.f17947 = null;
        this.f17948 = s3ObjectSummary;
        this.f17949 = C18063.m42088(47, 1, s3ObjectSummary.m653());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14644 m15560() {
        String str = this.f17947;
        if (str == null) {
            return C14644.m35274(this.f17948);
        }
        return C14644.m35275(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m15561() {
        return this.f17947 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15562() {
        return this.f17949;
    }
}
