package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۘۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3653 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22705 f13388;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BitSet f13389;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13390;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BitSet f13391;

    public C3653(C22705 c22705, int i) {
        this.f13388 = c22705;
        this.f13390 = i;
        this.f13391 = new BitSet(c22705.f73960);
        this.f13389 = new BitSet(c22705.f73960);
        c22705.f73949 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10763() {
        return this.f13390;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10767(int i) {
        this.f13391.set(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10764(int i) {
        this.f13389.set(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4129 m10766() {
        BitSet bitSet = this.f13389;
        C4129 c4129 = new C4129(bitSet.size());
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            c4129.add(this.f13388.m50338(iNextSetBit).m29916().get(0));
        }
        c4129.mo9637();
        return c4129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10765(C6040 c6040, int[] iArr) {
        BitSet bitSet = this.f13389;
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            C22705 c22705 = this.f13388;
            int i = c22705.m50338(iNextSetBit).m29916().get(0);
            C6040 c6040M16390 = c6040.m16390(this.f13390, iNextSetBit);
            if (c6040M16390 != null) {
                c22705.m50325(i, -1, null, c6040M16390, iArr);
            } else {
                C9754.m24734(iNextSetBit, iArr);
            }
        }
    }
}
