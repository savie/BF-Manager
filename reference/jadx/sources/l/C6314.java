package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۛۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6314 extends EnumC4076 {
    public /* synthetic */ C6314() {
        this("ODD", 1);
    }

    public C6314(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC4076
    /* JADX INFO: renamed from: ۙ */
    public int mo13160(BitSet bitSet, int i) {
        int iNextClearBit = bitSet.nextClearBit(i);
        while (C21230.m48389(iNextClearBit)) {
            iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
        }
        return iNextClearBit;
    }
}
