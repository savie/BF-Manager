package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۬֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBAX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12786 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12786 f42606 = new C12786();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 3;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34574(m31769(abstractC10794.m38695())) + ", " + abstractC10794.mo8567();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return abstractC10794.mo8573();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        if (!(abstractC16438 instanceof C15733)) {
            return false;
        }
        C15733 c15733 = (C15733) abstractC16438;
        if (!AbstractC14322.m34572(c15733.m37457())) {
            return false;
        }
        AbstractC9901 abstractC9901M37458 = c15733.m37458();
        return ((abstractC9901M37458 instanceof C20255) || (abstractC9901M37458 instanceof C6143) || (abstractC9901M37458 instanceof C1203)) && m31770(c15733.m38695()) >= 0;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        int size = c0727M38695.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            C16251 c16251M15275get = c0727M38695.m15275get(i);
            bitSet.set(i, AbstractC14322.m34575((c16251M15275get.m38396() + c16251M15275get.m38400()) - 1));
        }
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        int iM37457 = ((C15733) abstractC10794).m37457();
        C0727 c0727M31769 = m31769(abstractC10794.m38695());
        int size = c0727M31769.size();
        int iM38400 = size > 0 ? c0727M31769.m15275get(0).m38400() : 0;
        int iM38401 = size > 1 ? c0727M31769.m15275get(1).m38400() : 0;
        int iM38402 = size > 2 ? c0727M31769.m15275get(2).m38400() : 0;
        int iM38403 = size > 3 ? c0727M31769.m15275get(3).m38400() : 0;
        short sM34565 = AbstractC14322.m34565(abstractC10794, AbstractC14322.m34573(size > 4 ? c0727M31769.m15275get(4).m38400() : 0, size));
        short sM34564 = AbstractC14322.m34564(iM38400, iM38401, iM38402, iM38403);
        c2718.m8297(sM34565);
        c2718.m8297((short) iM37457);
        c2718.m8297(sM34564);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m31770(C0727 c0727) {
        int size = c0727.size();
        if (size > 5) {
            return -1;
        }
        int iM38396 = 0;
        for (int i = 0; i < size; i++) {
            C16251 c16251M15275get = c0727.m15275get(i);
            iM38396 += c16251M15275get.m38396();
            if (!AbstractC14322.m34575((c16251M15275get.m38396() + c16251M15275get.m38400()) - 1)) {
                return -1;
            }
        }
        if (iM38396 <= 5) {
            return iM38396;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C0727 m31769(C0727 c0727) {
        int iM31770 = m31770(c0727);
        int size = c0727.size();
        if (iM31770 == size) {
            return c0727;
        }
        C0727 c0728 = new C0727(iM31770);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C16251 c16251M15275get = c0727.m15275get(i2);
            c0728.m15261(i, c16251M15275get);
            if (c16251M15275get.m38396() == 2) {
                c0728.m15261(i + 1, C16251.m38381(c16251M15275get.m38400() + 1, C3320.f12280));
                i += 2;
            } else {
                i++;
            }
        }
        c0728.mo9637();
        return c0728;
    }
}
