package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩳۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f60942;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f60943;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f60944;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f60945;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f60946;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f60947;

    public C18765(int i, int i2, String str, String str2, String str3, String str4) {
        this.f60946 = i;
        this.f60947 = i2;
        this.f60944 = str;
        this.f60942 = str2;
        this.f60945 = str3;
        this.f60943 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18765.class == obj.getClass()) {
            C18765 c18765 = (C18765) obj;
            if (this.f60946 == c18765.f60946 && this.f60947 == c18765.f60947 && TextUtils.equals(this.f60944, c18765.f60944) && TextUtils.equals(this.f60942, c18765.f60942) && TextUtils.equals(this.f60945, c18765.f60945) && TextUtils.equals(this.f60943, c18765.f60943)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f60946 * 31) + this.f60947) * 31;
        String str = this.f60944;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f60942;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f60945;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f60943;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
