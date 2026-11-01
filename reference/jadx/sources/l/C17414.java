package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܿܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55410;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f55411;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f55412;

    public C17414(C9654 c9654, AbstractC12476 abstractC12476) {
        this.f55411 = c9654;
        int iMo2349 = abstractC12476.mo2349();
        this.f55410 = iMo2349;
        int iMo2351 = abstractC12476.mo2351();
        this.f55412 = iMo2351;
        if (iMo2349 + iMo2351 > c9654.length()) {
            throw new C7536("String table extends past end of file");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40579(int i) {
        int i2 = this.f55412;
        if (i >= i2) {
            throw new C7536("String index is out of bounds");
        }
        int i3 = this.f55410;
        int i4 = i + i3;
        int i5 = i4;
        do {
            C9654 c9654 = this.f55411;
            if (c9654.mo5855(i5) == 0) {
                return c9654.m5856(i4, i5 - i4, Charset.forName("US-ASCII"));
            }
            i5++;
        } while (i5 < i3 + i2);
        throw new C7536("String extends past end of string table");
    }
}
