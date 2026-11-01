package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BBQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6435 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C6435 f21782 = new C6435();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 4;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34574(m17617(abstractC10794.m38695())) + ", " + abstractC10794.mo8567();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return abstractC10794.mo8573();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        if (!(abstractC16438 instanceof C2823)) {
            return false;
        }
        C2823 c2823 = (C2823) abstractC16438;
        if (c2823.m8575() != 2) {
            return false;
        }
        return AbstractC14322.m34572(c2823.m8566(0)) && AbstractC14322.m34572(c2823.m8566(1)) && (c2823.m8574(0) instanceof C20255) && (c2823.m8574(1) instanceof C16727) && m17618(c2823.m38695()) >= 0;
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
        C2823 c2823 = (C2823) abstractC10794;
        short sM8566 = (short) c2823.m8566(0);
        short sM8567 = (short) c2823.m8566(1);
        C0727 c0727M17617 = m17617(abstractC10794.m38695());
        int size = c0727M17617.size();
        int iM38400 = size > 0 ? c0727M17617.m15275get(0).m38400() : 0;
        int iM38401 = size > 1 ? c0727M17617.m15275get(1).m38400() : 0;
        int iM38402 = size > 2 ? c0727M17617.m15275get(2).m38400() : 0;
        int iM38403 = size > 3 ? c0727M17617.m15275get(3).m38400() : 0;
        short sM34565 = AbstractC14322.m34565(abstractC10794, AbstractC14322.m34573(size > 4 ? c0727M17617.m15275get(4).m38400() : 0, size));
        short sM34564 = AbstractC14322.m34564(iM38400, iM38401, iM38402, iM38403);
        c2718.m8297(sM34565);
        c2718.m8297(sM8566);
        c2718.m8297(sM34564);
        c2718.m8297(sM8567);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m17618(C0727 c0727) {
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
    public static C0727 m17617(C0727 c0727) {
        int iM17618 = m17618(c0727);
        int size = c0727.size();
        if (iM17618 == size) {
            return c0727;
        }
        C0727 c0728 = new C0727(iM17618);
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
