package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۜۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22013 = ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3715[] f22014 = new C3715[16384];

    public C6538() {
        m17770(0, 4, 1185263, "$ref");
        m17770(0, 5, 62680954, "@type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17771(char[] cArr, int i, int i2) {
        int i3 = this.f22013 & i2;
        C3715[] c3715Arr = this.f22014;
        C3715 c3715 = c3715Arr[i3];
        if (c3715 != null) {
            char[] cArr2 = c3715.f13512;
            if (i2 == c3715.f13514 && i == cArr2.length) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (cArr[i4] == cArr2[i4]) {
                    }
                }
                return c3715.f13513;
            }
            return new String(cArr, 0, i);
        }
        String strIntern = new String(cArr, 0, i).intern();
        c3715Arr[i3] = new C3715(strIntern, i2);
        return strIntern;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17770(int i, int i2, int i3, String str) {
        int i4 = this.f22013 & i3;
        C3715[] c3715Arr = this.f22014;
        C3715 c3715 = c3715Arr[i4];
        if (c3715 != null) {
            String str2 = c3715.f13513;
            if (i3 == c3715.f13514 && i2 == c3715.f13512.length && str.regionMatches(i, str2, 0, i2)) {
                return str2;
            }
            char[] cArr = new char[i2];
            str.getChars(i, i2 + i, cArr, 0);
            return new String(cArr);
        }
        if (i2 != str.length()) {
            char[] cArr2 = new char[i2];
            str.getChars(i, i2 + i, cArr2, 0);
            str = new String(cArr2);
        }
        String strIntern = str.intern();
        c3715Arr[i4] = new C3715(strIntern, i3);
        return strIntern;
    }
}
