package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14603 implements InterfaceC7343 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f46006;

    public C14603(HashMap map) {
        this.f46006 = map;
    }

    @Override // l.InterfaceC7343
    /* JADX INFO: renamed from: ۙ */
    public final void mo20160(AbstractC12563 abstractC12563) {
        C18333 c18333;
        int iIntValue;
        EnumC20768 enumC20768 = abstractC12563.f40344;
        EnumC20768 enumC20769 = EnumC20768.ASSIGN;
        HashMap map = this.f46006;
        if (enumC20768 == enumC20769) {
            if (abstractC12563.mo11728().f34921 == EnumC22260.NEW_ARRAY && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                C1465 c1465 = (C1465) abstractC12563.mo11728();
                AbstractC11071 abstractC11071 = c1465.f24464;
                if (abstractC11071.f34921 != EnumC22260.CONSTANT || (iIntValue = ((Number) ((C16380) abstractC11071).f53172).intValue()) < 0) {
                    return;
                }
                C4448 c4448 = (C4448) abstractC12563.mo11730();
                String str = c1465.f5117;
                C18333 c18334 = new C18333();
                c18334.f59800 = new ArrayList();
                c18334.f59799 = new ArrayList();
                c18334.f59798 = iIntValue;
                c18334.f59801 = str;
                c18334.f59797 = (C20022) abstractC12563;
                map.put(c4448, c18334);
                return;
            }
            if (abstractC12563.mo11730().f34921 == EnumC22260.ARRAY) {
                C25332 c25332 = (C25332) abstractC12563.mo11730();
                AbstractC11071 abstractC11072 = c25332.f44724;
                if (abstractC11072.f34921 == EnumC22260.LOCAL) {
                    C4448 c4449 = (C4448) abstractC11072;
                    C18333 c18335 = (C18333) map.get(c4449);
                    if (c18335 != null) {
                        if (c25332.f44725.f34921 == EnumC22260.CONSTANT) {
                            c18335.f59800.add(abstractC12563);
                            return;
                        } else {
                            map.remove(c4449);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC20768 == EnumC20768.FILL_ARRAY_DATA && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL && (c18333 = (C18333) map.get((C4448) abstractC12563.mo11730())) != null) {
            c18333.f59800.add(abstractC12563);
        }
    }
}
