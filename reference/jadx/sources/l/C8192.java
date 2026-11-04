package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۟᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8192 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f27011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public BitSet f27012;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m22105(C23330 c23330) {
        String str;
        if (c23330.f75563 < 0) {
            return null;
        }
        String str2 = c23330.f75564;
        if (this.f27012 != null && (str2 == (str = this.f27011) || (str2 != null && str2.equals(str)))) {
            return this.f27012;
        }
        this.f27011 = str2;
        BitSet bitSet = new BitSet();
        this.f27012 = bitSet;
        return bitSet;
    }
}
