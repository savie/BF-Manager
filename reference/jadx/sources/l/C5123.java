package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5123 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13591 f17832;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f17833;

    public C5123(int i, int i2) {
        this.f17832 = EnumC13591.values()[i];
        this.f17833 = i2;
    }

    public C5123(EnumC13591 enumC13591, int i) {
        this.f17832 = enumC13591;
        this.f17833 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m14275() {
        return this.f17832.m33214();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14274() {
        return this.f17833;
    }

    public final String toString() {
        String strM30911;
        StringBuilder sb = new StringBuilder();
        EnumC13591 enumC13591 = this.f17832;
        sb.append(enumC13591.m33213());
        if (enumC13591.f44819 == 3) {
            strM30911 = C12441.m30911(this.f17833, l.d, new StringBuilder("{"));
        } else {
            strM30911 = "";
        }
        sb.append(strM30911);
        return sb.toString();
    }
}
