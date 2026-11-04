package l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBA0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18992 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19738 f61537;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final BitSet f61538;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BitSet f61539;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61540;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24960 f61541;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f61542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0347 f61543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC7805 f61544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0347 m44093(C24960 c24960) {
        int iM55737 = c24960.m55737();
        C0347 c0347 = new C0347(iM55737);
        for (int i = 0; i < iM55737; i++) {
            C18992 c18992 = new C18992(c24960, i, c0347);
            C24960 c24961 = c18992.f61541;
            int i2 = c18992.f61542;
            for (AbstractC5568 abstractC5568 : c24961.m55752(i2)) {
                c18992.f61544 = EnumC7805.DONE;
                if (abstractC5568 instanceof C14033) {
                    Iterator it = ((C14033) abstractC5568).m34182(i2, c24961).iterator();
                    while (it.hasNext()) {
                        c18992.f61537 = (C19738) it.next();
                        c18992.f61544 = EnumC7805.LIVE_OUT_AT_BLOCK;
                        c18992.m44094();
                    }
                } else {
                    C19738 c19738M16506 = abstractC5568.m16506();
                    c18992.f61537 = c19738M16506;
                    int iIndexOf = c19738M16506.m45460().indexOf(abstractC5568);
                    c18992.f61540 = iIndexOf;
                    if (iIndexOf < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c18992.f61544 = EnumC7805.LIVE_IN_AT_STATEMENT;
                    c18992.m44094();
                }
            }
            while (true) {
                BitSet bitSet = c18992.f61539;
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    c18992.f61537 = (C19738) c24961.m55749().get(iNextSetBit);
                    bitSet.clear(iNextSetBit);
                    c18992.f61544 = EnumC7805.LIVE_OUT_AT_BLOCK;
                    c18992.m44094();
                }
            }
        }
        Iterator it2 = c24960.m55749().iterator();
        while (it2.hasNext()) {
            List listM45466 = ((C19738) it2.next()).m45466();
            int size = listM45466.size();
            for (int i3 = 0; i3 < size; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    if (i3 != i4) {
                        AbstractC5568 abstractC5569 = (AbstractC5568) listM45466.get(i3);
                        AbstractC5568 abstractC55610 = (AbstractC5568) listM45466.get(i4);
                        C20946 c20946M16508 = abstractC5569.m16508();
                        C0063 c0063Mo4992 = abstractC55610.mo4992();
                        int iM47903 = c20946M16508.m47903();
                        for (int i5 = 0; i5 < c0063Mo4992.size(); i5++) {
                            c0347.m2092(iM47903, c0063Mo4992.m31619get(i5).m47903());
                        }
                        C20946 c20946M16509 = abstractC55610.m16508();
                        C0063 c0063Mo4993 = abstractC5569.mo4992();
                        int iM47904 = c20946M16509.m47903();
                        for (int i6 = 0; i6 < c0063Mo4993.size(); i6++) {
                            c0347.m2092(iM47904, c0063Mo4993.m31619get(i6).m47903());
                        }
                        c0347.m2092(abstractC5569.m16508().m47903(), abstractC55610.m16508().m47903());
                    }
                }
            }
        }
        return c0347;
    }

    public C18992(C24960 c24960, int i, C0347 c0347) {
        int size = c24960.m55749().size();
        this.f61541 = c24960;
        this.f61542 = i;
        this.f61538 = new BitSet(size);
        this.f61539 = new BitSet(size);
        this.f61543 = c0347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44094() {
        while (true) {
            EnumC7805 enumC7805 = this.f61544;
            EnumC7805 enumC7806 = EnumC7805.DONE;
            if (enumC7805 == enumC7806) {
                return;
            }
            int iOrdinal = enumC7805.ordinal();
            int i = this.f61542;
            if (iOrdinal == 0) {
                this.f61544 = enumC7806;
                int i2 = this.f61540;
                if (i2 == 0) {
                    this.f61537.m45451(i);
                    this.f61539.or(this.f61537.m45465());
                } else {
                    this.f61540 = i2 - 1;
                    this.f61544 = EnumC7805.LIVE_OUT_AT_STATEMENT;
                }
            } else if (iOrdinal == 1) {
                this.f61544 = enumC7806;
                AbstractC5568 abstractC5568 = (AbstractC5568) this.f61537.m45460().get(this.f61540);
                C20946 c20946M16508 = abstractC5568.m16508();
                if (!abstractC5568.m16507(i)) {
                    if (c20946M16508 != null) {
                        this.f61543.m2092(i, c20946M16508.m47903());
                    }
                    this.f61544 = EnumC7805.LIVE_IN_AT_STATEMENT;
                }
            } else if (iOrdinal == 2) {
                this.f61544 = enumC7806;
                int iM45472 = this.f61537.m45472();
                BitSet bitSet = this.f61538;
                if (!bitSet.get(iM45472)) {
                    bitSet.set(this.f61537.m45472());
                    this.f61537.m45473(i);
                    this.f61540 = this.f61537.m45460().size() - 1;
                    this.f61544 = EnumC7805.LIVE_OUT_AT_STATEMENT;
                }
            }
        }
    }
}
