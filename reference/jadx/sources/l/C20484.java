package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20484 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0727 f66427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66428 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0727 f66429;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f66430;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BitSet f66431;

    public C20484(C0727 c0727, BitSet bitSet, boolean z) {
        this.f66427 = c0727;
        this.f66431 = bitSet;
        this.f66429 = new C0727(c0727.size());
        this.f66430 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46287(C20484 c20484, int i) {
        C16251 c16251M38397 = (C16251) c20484.f66427.m15249(i);
        BitSet bitSet = c20484.f66431;
        if (bitSet == null || !bitSet.get(i)) {
            c16251M38397 = c16251M38397.m38397(c20484.f66428);
            if (!c20484.f66430) {
                c20484.f66428 = c16251M38397.m38396() + c20484.f66428;
            }
        }
        c20484.f66430 = false;
        c20484.f66429.m15252(i, (Object) c16251M38397);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0727 m46286(C20484 c20484) {
        C0727 c0727 = c20484.f66429;
        if (c20484.f66427.m43639()) {
            c0727.mo9637();
        }
        return c0727;
    }
}
