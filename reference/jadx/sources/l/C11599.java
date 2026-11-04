package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۧۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BitSet f36419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f36420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public BitSet f36421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16820 f36422;

    public C11599(C16820 c16820, int i) {
        this.f36422 = c16820;
        this.f36420 = i;
        this.f36421 = new BitSet(c16820.f54270);
        this.f36419 = new BitSet(c16820.f54270);
        c16820.f54276 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29155() {
        return this.f36420;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29159(int i) {
        this.f36421.set(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29156(int i) {
        this.f36419.set(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24698 m29158() {
        BitSet bitSet = this.f36419;
        C24698 c24698 = new C24698(bitSet.size());
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            c24698.add(this.f36422.m39737(iNextSetBit).m50590().get(0));
        }
        c24698.mo15005();
        return c24698;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29157(C1400 c1400, int[] iArr) {
        BitSet bitSet = this.f36419;
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            C16820 c16820 = this.f36422;
            int i = c16820.m39737(iNextSetBit).m50590().get(0);
            C1400 c1400M5120 = c1400.m5120(this.f36420, iNextSetBit);
            if (c1400M5120 != null) {
                c16820.m39724(i, -1, null, c1400M5120, iArr);
            } else {
                C4560.m14326(iNextSetBit, iArr);
            }
        }
    }
}
