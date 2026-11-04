package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes.dex */
public final enum C24214 extends EnumC4076 {
    public /* synthetic */ C24214() {
        this("UNSPECIFIED", 2);
    }

    public C24214(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC4076
    /* JADX INFO: renamed from: ۙ */
    public int mo13160(BitSet bitSet, int i) {
        return bitSet.nextClearBit(i);
    }
}
