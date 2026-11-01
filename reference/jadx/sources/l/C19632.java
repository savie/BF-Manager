package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩵ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19632 extends EnumC10460 {
    public /* synthetic */ C19632() {
        this("ODD", 1);
    }

    public C19632(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC10460
    /* JADX INFO: renamed from: ۙ */
    public int mo21792(BitSet bitSet, int i) {
        int iNextClearBit = bitSet.nextClearBit(i);
        while (C21042.m47453(iNextClearBit)) {
            iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
        }
        return iNextClearBit;
    }
}
