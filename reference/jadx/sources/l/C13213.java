package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13213 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f43968 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32700(AbstractC23903 abstractC23903) {
        AbstractC11242 abstractC11242Mo2883 = abstractC23903.mo2883();
        HashMap map = this.f43968;
        C21825 c21825M48588 = (C21825) map.get(abstractC11242Mo2883);
        if (c21825M48588 == null) {
            c21825M48588 = C21825.m48588();
        }
        if (c21825M48588.contains(abstractC23903)) {
            return;
        }
        map.put(abstractC11242Mo2883, c21825M48588.m48591(abstractC23903));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m32701(AbstractC23903 abstractC23903) {
        C21825 c21825;
        String string = abstractC23903.mo20270().toString();
        if (abstractC23903.f77449.mo12731() || abstractC23903.f77449.mo9481() || !((c21825 = (C21825) this.f43968.get(abstractC23903.mo2883())) == null || (c21825.m48596() == 1 && c21825.contains(abstractC23903)))) {
            return string;
        }
        C21825 c21825M48588 = C21825.m48588();
        while (true) {
            AbstractC16579 abstractC16579 = abstractC23903.f77449;
            EnumC6617 enumC6617 = EnumC6617.CLASS;
            if (!abstractC16579.m39001(enumC6617) || !abstractC23903.f77449.mo1934().m39001(enumC6617) || abstractC23903.f77448.f77452 != EnumC10477.f35865) {
                break;
            }
            AbstractC11242 abstractC11242Mo2883 = abstractC23903.mo2883();
            c21825M48588.getClass();
            C21825 c21826 = new C21825(abstractC11242Mo2883, c21825M48588);
            abstractC23903 = abstractC23903.f77448;
            c21825M48588 = c21826;
        }
        AbstractC11242 abstractC11242Mo2884 = abstractC23903.mo2883();
        c21825M48588.getClass();
        C21825<AbstractC11242> c21827 = new C21825(abstractC11242Mo2884, c21825M48588);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (AbstractC11242 abstractC11242 : c21827) {
            sb.append(str);
            sb.append((CharSequence) abstractC11242);
            str = ".";
        }
        return sb.toString();
    }
}
