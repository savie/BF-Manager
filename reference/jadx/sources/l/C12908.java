package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۬ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final class C12908 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f42903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BitSet f42904;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m31985(C5032 c5032) {
        String str;
        if (c5032.f17546 < 0) {
            return null;
        }
        String str2 = c5032.f17547;
        if (this.f42904 != null && (str2 == (str = this.f42903) || (str2 != null && str2.equals(str)))) {
            return this.f42904;
        }
        this.f42903 = str2;
        BitSet bitSet = new BitSet();
        this.f42904 = bitSet;
        return bitSet;
    }
}
