package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۧ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11928 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38423 = ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2234[] f38424 = new C2234[16384];

    public C11928() {
        m29884(0, 4, 1185263, "$ref");
        m29884(0, 5, 62680954, "@type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29885(char[] cArr, int i, int i2) {
        int i3 = this.f38423 & i2;
        C2234[] c2234Arr = this.f38424;
        C2234 c2234 = c2234Arr[i3];
        if (c2234 != null) {
            char[] cArr2 = c2234.f7321;
            if (i2 == c2234.f7323 && i == cArr2.length) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (cArr[i4] == cArr2[i4]) {
                    }
                }
                return c2234.f7322;
            }
            return new String(cArr, 0, i);
        }
        String strIntern = new String(cArr, 0, i).intern();
        c2234Arr[i3] = new C2234(strIntern, i2);
        return strIntern;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29884(int i, int i2, int i3, String str) {
        int i4 = this.f38423 & i3;
        C2234[] c2234Arr = this.f38424;
        C2234 c2234 = c2234Arr[i4];
        if (c2234 != null) {
            String str2 = c2234.f7322;
            if (i3 == c2234.f7323 && i2 == c2234.f7321.length && str.regionMatches(i, str2, 0, i2)) {
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
        c2234Arr[i4] = new C2234(strIntern, i3);
        return strIntern;
    }
}
