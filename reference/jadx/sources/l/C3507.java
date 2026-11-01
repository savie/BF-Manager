package l;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f12861;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10331(C4108 c4108) {
        BitSet bitSet;
        C19073 c19073M38386;
        C19073 c19073M38387;
        C3507 c3507 = new C3507(c4108);
        int iM11685 = c4108.m11685();
        int i = 0;
        while (true) {
            bitSet = c3507.f12861;
            if (i >= iM11685) {
                break;
            }
            AbstractC22454 abstractC22454M11684 = c4108.m11684(i);
            if (abstractC22454M11684 != null && abstractC22454M11684.m49955().mo9834() == 0) {
                bitSet.set(i);
            }
            i++;
        }
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            bitSet.clear(iNextSetBit);
            C9859 c9859 = (C9859) c4108.m11684(iNextSetBit);
            c9859.m24962(c4108);
            C0727 c0727Mo17429 = c9859.mo17429();
            int size = c0727Mo17429.size();
            int i2 = -1;
            C16251 c16251 = null;
            for (int i3 = 0; i3 < size; i3++) {
                C16251 c16251M15275get = c0727Mo17429.m15275get(i3);
                if (c16251M15275get.mo9834() != 0) {
                    i2 = i3;
                    c16251 = c16251M15275get;
                }
            }
            if (c16251 != null) {
                C19073 c19073M38388 = c16251.m38386();
                InterfaceC4919 type = c16251.getType();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 != i2) {
                        C16251 c16251M15275get2 = c0727Mo17429.m15275get(i4);
                        if (c16251M15275get2.mo9834() != 0) {
                            z = z && (c19073M38388 == (c19073M38387 = c16251M15275get2.m38386()) || (c19073M38388 != null && c19073M38388.equals(c19073M38387)));
                            type = C1791.m5875(type, c16251M15275get2.getType());
                        }
                    }
                }
                if (type == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < size; i5++) {
                        sb.append(c0727Mo17429.m15275get(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C19073 c19073 = z ? c19073M38388 : null;
                C16251 c16251M49955 = c9859.m49955();
                if (c16251M49955.m38401() != type || (c19073 != (c19073M38386 = c16251M49955.m38386()) && (c19073 == null || !c19073.equals(c19073M38386)))) {
                    c9859.m49952(C16251.m38384(c9859.m49955().m38400(), type, c19073));
                    List listM11667 = c4108.m11667(iNextSetBit);
                    int size2 = listM11667.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        AbstractC22454 abstractC22454 = (AbstractC22454) listM11667.get(i6);
                        C16251 c16251M49956 = abstractC22454.m49955();
                        if (c16251M49956 != null && (abstractC22454 instanceof C9859)) {
                            bitSet.set(c16251M49956.m38400());
                        }
                    }
                }
            }
        }
    }

    public C3507(C4108 c4108) {
        this.f12861 = new BitSet(c4108.m11685());
    }
}
