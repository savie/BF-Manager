package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧ᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11899 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38325;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f38326;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38327;

    public C11899(C3696 c3696, AbstractC2205 abstractC2205) {
        this.f38326 = c3696;
        int iMo7533 = abstractC2205.mo7533();
        this.f38325 = iMo7533;
        int iMo7531 = abstractC2205.mo7531();
        this.f38327 = iMo7531;
        if (iMo7533 + iMo7531 > c3696.length()) {
            throw new C11153("String table extends past end of file");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29782(int i) {
        int i2 = this.f38327;
        if (i >= i2) {
            throw new C11153("String index is out of bounds");
        }
        int i3 = this.f38325;
        int i4 = i + i3;
        int i5 = i4;
        do {
            C3696 c3696 = this.f38326;
            if (c3696.mo8717(i5) == 0) {
                return c3696.m11964(i4, i5 - i4, Charset.forName("US-ASCII"));
            }
            i5++;
        } while (i5 < i3 + i2);
        throw new C11153("String extends past end of string table");
    }
}
