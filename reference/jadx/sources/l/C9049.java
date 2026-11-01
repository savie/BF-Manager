package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۡᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9049 extends EnumC10460 {
    public /* synthetic */ C9049() {
        this("UNSPECIFIED", 2);
    }

    public C9049(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC10460
    /* JADX INFO: renamed from: ۙ */
    public int mo21792(BitSet bitSet, int i) {
        return bitSet.nextClearBit(i);
    }
}
