package l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBA0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16809 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53806;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC0580 f53807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11871 f53808;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f53809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BitSet f53810;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final BitSet f53811;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20337 f53812;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4108 f53813;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20337 m39453(C4108 c4108) {
        int iM11685 = c4108.m11685();
        C20337 c20337 = new C20337(iM11685);
        for (int i = 0; i < iM11685; i++) {
            C16809 c16809 = new C16809(c4108, i, c20337);
            C4108 c4109 = c16809.f53813;
            int i2 = c16809.f53809;
            for (AbstractC22454 abstractC22454 : c4109.m11667(i2)) {
                c16809.f53807 = EnumC0580.DONE;
                if (abstractC22454 instanceof C9859) {
                    Iterator it = ((C9859) abstractC22454).m24961(i2, c4109).iterator();
                    while (it.hasNext()) {
                        c16809.f53808 = (C11871) it.next();
                        c16809.f53807 = EnumC0580.LIVE_OUT_AT_BLOCK;
                        c16809.m39454();
                    }
                } else {
                    C11871 c11871M49949 = abstractC22454.m49949();
                    c16809.f53808 = c11871M49949;
                    int iIndexOf = c11871M49949.m29613().indexOf(abstractC22454);
                    c16809.f53806 = iIndexOf;
                    if (iIndexOf < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c16809.f53807 = EnumC0580.LIVE_IN_AT_STATEMENT;
                    c16809.m39454();
                }
            }
            while (true) {
                BitSet bitSet = c16809.f53810;
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    c16809.f53808 = (C11871) c4109.m11687().get(iNextSetBit);
                    bitSet.clear(iNextSetBit);
                    c16809.f53807 = EnumC0580.LIVE_OUT_AT_BLOCK;
                    c16809.m39454();
                }
            }
        }
        Iterator it2 = c4108.m11687().iterator();
        while (it2.hasNext()) {
            List listM29626 = ((C11871) it2.next()).m29626();
            int size = listM29626.size();
            for (int i3 = 0; i3 < size; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    if (i3 != i4) {
                        AbstractC22454 abstractC22455 = (AbstractC22454) listM29626.get(i3);
                        AbstractC22454 abstractC22456 = (AbstractC22454) listM29626.get(i4);
                        C16251 c16251M49955 = abstractC22455.m49955();
                        C0727 c0727Mo17429 = abstractC22456.mo17429();
                        int iM38400 = c16251M49955.m38400();
                        for (int i5 = 0; i5 < c0727Mo17429.size(); i5++) {
                            c20337.m45902(iM38400, c0727Mo17429.m15275get(i5).m38400());
                        }
                        C16251 c16251M49956 = abstractC22456.m49955();
                        C0727 c0727Mo174210 = abstractC22455.mo17429();
                        int iM38401 = c16251M49956.m38400();
                        for (int i6 = 0; i6 < c0727Mo174210.size(); i6++) {
                            c20337.m45902(iM38401, c0727Mo174210.m15275get(i6).m38400());
                        }
                        c20337.m45902(abstractC22455.m49955().m38400(), abstractC22456.m49955().m38400());
                    }
                }
            }
        }
        return c20337;
    }

    public C16809(C4108 c4108, int i, C20337 c20337) {
        int size = c4108.m11687().size();
        this.f53813 = c4108;
        this.f53809 = i;
        this.f53811 = new BitSet(size);
        this.f53810 = new BitSet(size);
        this.f53812 = c20337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39454() {
        while (true) {
            EnumC0580 enumC0580 = this.f53807;
            EnumC0580 enumC0581 = EnumC0580.DONE;
            if (enumC0580 == enumC0581) {
                return;
            }
            int iOrdinal = enumC0580.ordinal();
            int i = this.f53809;
            if (iOrdinal == 0) {
                this.f53807 = enumC0581;
                int i2 = this.f53806;
                if (i2 == 0) {
                    this.f53808.m29601(i);
                    this.f53810.or(this.f53808.m29596());
                } else {
                    this.f53806 = i2 - 1;
                    this.f53807 = EnumC0580.LIVE_OUT_AT_STATEMENT;
                }
            } else if (iOrdinal == 1) {
                this.f53807 = enumC0581;
                AbstractC22454 abstractC22454 = (AbstractC22454) this.f53808.m29613().get(this.f53806);
                C16251 c16251M49955 = abstractC22454.m49955();
                if (!abstractC22454.m49954(i)) {
                    if (c16251M49955 != null) {
                        this.f53812.m45902(i, c16251M49955.m38400());
                    }
                    this.f53807 = EnumC0580.LIVE_IN_AT_STATEMENT;
                }
            } else if (iOrdinal == 2) {
                this.f53807 = enumC0581;
                int iM29617 = this.f53808.m29617();
                BitSet bitSet = this.f53811;
                if (!bitSet.get(iM29617)) {
                    bitSet.set(this.f53808.m29617());
                    this.f53808.m29618(i);
                    this.f53806 = this.f53808.m29613().size() - 1;
                    this.f53807 = EnumC0580.LIVE_OUT_AT_STATEMENT;
                }
            }
        }
    }
}
