package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12205 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12205 m30303(ArrayList arrayList, int i) {
        int size = arrayList.size();
        C12205 c12205 = new C12205(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c12205.m15252(i2, (AbstractC16438) arrayList.get(i2));
        }
        c12205.mo9637();
        return c12205;
    }

    public C12205(int i, int i2) {
        super(i);
        this.f40811 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m30306() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        AbstractC16438 abstractC16438 = (AbstractC16438) m15249(size - 1);
        return abstractC16438.mo15536() + abstractC16438.m38698();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30304(C2718 c2718) {
        int iM8296 = c2718.m8296();
        int size = size();
        if (c2718.m8288()) {
            for (int i = 0; i < size; i++) {
                AbstractC16438 abstractC16438 = (AbstractC16438) m15249(i);
                int iMo15536 = abstractC16438.mo15536() * 2;
                String strM23403 = null;
                if (iMo15536 != 0) {
                    int iM8279 = c2718.m8279();
                    String strMo15537 = abstractC16438.mo15537();
                    if (strMo15537 != null) {
                        String str = EnumC19730.f63352 + abstractC16438.m38704() + ": ";
                        int length = str.length();
                        strM23403 = C9070.m23403(str, length, iM8279 == 0 ? strMo15537.length() : iM8279 - length, strMo15537);
                    }
                }
                if (strM23403 != null) {
                    c2718.m8283(iMo15536, strM23403);
                } else if (iMo15536 != 0) {
                    c2718.m8283(iMo15536, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC16438 abstractC16439 = (AbstractC16438) m15249(i2);
            try {
                abstractC16439.mo15535(c2718);
            } catch (RuntimeException e) {
                throw C7513.m20020("...while writing " + abstractC16439, e);
            }
        }
        int iM8297 = (c2718.m8296() - iM8296) / 2;
        if (iM8297 == m30306()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m30306() + " but actually wrote " + iM8297);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30307() {
        return this.f40811;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m30305() {
        int iM24602;
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC16438 abstractC16438 = (AbstractC16438) m15249(i2);
            if (abstractC16438 instanceof C15733) {
                AbstractC9901 abstractC9901M37458 = ((C15733) abstractC16438).m37458();
                if (abstractC9901M37458 instanceof AbstractC11788) {
                    iM24602 = ((AbstractC11788) abstractC9901M37458).m29453(abstractC16438.m38693().m40070() == 113).m6222().m24602();
                } else {
                    iM24602 = abstractC9901M37458 instanceof C1203 ? ((C1203) abstractC9901M37458).m4400().m6222().m24602() : 0;
                }
            } else {
                if (!(abstractC16438 instanceof C2823)) {
                    continue;
                } else {
                    if (abstractC16438.m38693().m40070() != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM24602 = ((C16727) ((C2823) abstractC16438).m8574(1)).m39215().m6222().m24602() + 1;
                }
            }
            if (iM24602 > i) {
                i = iM24602;
            }
        }
        return i;
    }
}
