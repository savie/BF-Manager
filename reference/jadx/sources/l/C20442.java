package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20442 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BitSet f66272;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0685 f66274;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4108 f66275;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0685 m46240(C4108 c4108) {
        C20442 c20442;
        C20442 c20443;
        C20442 c20444 = new C20442(c4108);
        C4108 c4109 = c20444.f66275;
        int iM11685 = c4109.m11685();
        C0685 c0685 = c20444.f66274;
        if (iM11685 > 0) {
            int iM11666 = c4109.m11666();
            while (iM11666 >= 0) {
                BitSet bitSet = c20444.f66272;
                bitSet.clear(iM11666);
                C16956 c16956M3064 = c0685.m3064(iM11666);
                C11871 c11871 = (C11871) c20444.f66273.get(iM11666);
                ArrayList arrayListM29613 = c11871.m29613();
                int size = arrayListM29613.size();
                if (iM11666 == c4109.m11693()) {
                    c20442 = c20444;
                } else {
                    int i = size - 1;
                    AbstractC22454 abstractC22454 = (AbstractC22454) arrayListM29613.get(i);
                    boolean z = (abstractC22454.mo17428().mo6700().size() == 0 || abstractC22454.m49955() == null) ? false : true;
                    int i2 = 0;
                    C16956 c16956M39744 = c16956M3064;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c16956M39744.mo9637();
                            c16956M39744 = c16956M39744.m39744();
                        }
                        AbstractC22454 abstractC22455 = (AbstractC22454) arrayListM29613.get(i2);
                        C16251 c16251Mo17432 = abstractC22455.mo17432();
                        if (c16251Mo17432 == null) {
                            C16251 c16251M49955 = abstractC22455.m49955();
                            if (c16251M49955 != null && c16956M39744.get(c16251M49955.m38400()) != null) {
                                c16956M39744.m39745(c16956M39744.get(c16251M49955.m38400()));
                            }
                        } else {
                            C16251 c16251M38402 = c16251Mo17432.m38402();
                            c16956M39744.getClass();
                            if (!c16251M38402.equals(c16956M39744.get(c16251M38402.m38400()))) {
                                C16251 c16251M39740 = c16956M39744.m39740(c16251M38402.m38386());
                                if (c16251M39740 != null) {
                                    c20443 = c20444;
                                    if (c16251M39740.m38400() != c16251M38402.m38400()) {
                                        c16956M39744.m39745(c16251M39740);
                                    }
                                } else {
                                    c20443 = c20444;
                                }
                                c0685.m3062(abstractC22455, c16251M38402);
                                c16956M39744.m39746(c16251M38402);
                            }
                            i2++;
                            c20444 = c20443;
                        }
                        c20443 = c20444;
                        i2++;
                        c20444 = c20443;
                    }
                    c20442 = c20444;
                    c16956M39744.mo9637();
                    C4129 c4129M29625 = c11871.m29625();
                    int size2 = c4129M29625.size();
                    int iM29599 = c11871.m29599();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c4129M29625.get(i3);
                        if (c0685.m3063(i4, i4 == iM29599 ? c16956M39744 : c16956M3064)) {
                            bitSet.set(i4);
                        }
                    }
                }
                iM11666 = bitSet.nextSetBit(0);
                c20444 = c20442;
            }
        }
        c0685.mo9637();
        return c0685;
    }

    public C20442(C4108 c4108) {
        ArrayList arrayListM11687 = c4108.m11687();
        this.f66275 = c4108;
        this.f66273 = arrayListM11687;
        this.f66274 = new C0685(c4108);
        this.f66272 = new BitSet(arrayListM11687.size());
    }
}
