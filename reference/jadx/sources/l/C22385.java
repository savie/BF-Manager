package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22385 extends AbstractC6160 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21679 f73090;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        C0309 c03010;
        AbstractC16579 abstractC16579;
        boolean zMo12731 = c0309.mo12731();
        C21679 c21679 = this.f73090;
        if (zMo12731) {
            EnumC15330 enumC15330 = EnumC15330.INTERSECTION;
            int iM48419 = C21679.m48419(c21679, c0309, enumC15330);
            C23800 c23800 = c21679.f70319;
            if (iM48419 == -1) {
                AbstractC16579 abstractC16579M52432 = c23800.m52432(c0309);
                C21825 c21825M52439 = c23800.m52439(c0309);
                C23549 c23549 = c21679.f70318;
                c21825M52439.getClass();
                C21825 c21825 = new C21825(abstractC16579M52432, c21825M52439);
                C14377 c14377 = C14707.f48054;
                ((Map) c21679.f70316.get(enumC15330)).put(c0309, c23549.m51910(new C14377("compiler", "where.intersection", c0309, c21825)));
                abstractC16579M52432.mo1928(this, (Object) null);
                m49660(c21825M52439);
            }
        } else if (c0309.f53222.f77453.isEmpty() && (c03010 = (C0309) c0309.f53222.f77449) != null) {
            C21825 c21826 = c03010.f1658;
            if (c21826 != null && c21826.m48595()) {
                abstractC16579 = (AbstractC16579) c03010.f1658.f70876;
            } else {
                abstractC16579 = c03010.f1654;
            }
            abstractC16579.mo1928(this, (Object) null);
        }
        c21679.f70315.m32700(c0309.f53222);
        m49660(c0309.mo1938());
        try {
            if (c0309.mo1934() != AbstractC16579.f53219) {
                c0309.mo1934().mo1928(this, (Object) null);
            }
        } catch (C4146 unused) {
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        c0350.f1774.mo1928(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        AbstractC16579 abstractC16579Mo16234 = c5954.mo16234();
        if (abstractC16579Mo16234 != null) {
            abstractC16579Mo16234.mo1928(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        c8777.f30194.mo1928(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9280(C10894 c10894, Object obj) {
        m49660(c10894.f37076);
        c10894.f53121.mo1928(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6581(C13757 c13757, Object obj) {
        m49660(c13757.f45367);
        c13757.f45368.mo1928(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11014(C20771 c20771, Object obj) {
        EnumC15330 enumC15330 = EnumC15330.CAPTURED;
        C21679 c21679 = this.f73090;
        if (C21679.m48419(c21679, c20771, enumC15330) == -1) {
            AbstractC16579 abstractC16579 = c20771.f74536;
            C0350 c0350 = c20771.f67572;
            ((Map) c21679.f70316.get(enumC15330)).put(c20771, c21679.f70318.m51914("where.captured".concat(abstractC16579 == c21679.f70320.f14228 ? ".1" : ""), c20771, c20771.mo18112(), c20771.f74536, c0350));
            c0350.mo1928(this, (Object) null);
            c20771.f74536.mo1928(this, (Object) null);
            c20771.mo18112().mo1928(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        C21825 c21825M48588;
        C22929 c229210 = (C22929) c22929.m39003();
        EnumC15330 enumC15330 = EnumC15330.TYPEVAR;
        C21679 c21679 = this.f73090;
        int iM48419 = C21679.m48419(c21679, c229210, enumC15330);
        EnumMap enumMap = c21679.f70316;
        C23549 c23549 = c21679.f70318;
        if (iM48419 == -1) {
            AbstractC16579 abstractC16579Mo18112 = c229210.mo18112();
            while (abstractC16579Mo18112 instanceof C5954) {
                abstractC16579Mo18112 = ((C5954) abstractC16579Mo18112).mo16234();
            }
            if (abstractC16579Mo18112 == null || (!abstractC16579Mo18112.m39001(EnumC6617.CLASS) && !abstractC16579Mo18112.m39001(EnumC6617.TYPEVAR))) {
                c21825M48588 = C21825.m48588();
            } else {
                c21825M48588 = abstractC16579Mo18112.mo12731() ? c21679.f70319.m52356(abstractC16579Mo18112) : C21825.of((Object) abstractC16579Mo18112);
            }
            c21679.f70315.m32700(c229210.f53222);
            Object obj2 = c21825M48588.f70876;
            boolean z = obj2 == null || ((AbstractC16579) obj2).m39001(EnumC6617.NONE) || ((AbstractC16579) c21825M48588.f70876).m39001(EnumC6617.ERROR);
            if ((c229210.f53222.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                ((Map) enumMap.get(EnumC15330.TYPEVAR)).put(c229210, c23549.m51914("where.typevar".concat(z ? ".1" : ""), c229210, c21825M48588, C16121.m38160(c229210.f53222.m52708()), c229210.f53222.m52708()));
                AbstractC10540 abstractC10540 = c21679.f70317;
                AbstractC23903 abstractC23903M52708 = c229210.f53222.m52708();
                abstractC10540.getClass();
                abstractC23903M52708.mo2879(abstractC10540, (Locale) null);
                m49660(c21825M48588);
                return null;
            }
            C6171.m17176(!z);
            C14377 c14377 = C14707.f48054;
            ((Map) enumMap.get(EnumC15330.TYPEVAR)).put(c229210, c23549.m51910(new C14377("compiler", "where.fresh.typevar", c229210, c21825M48588)));
            m49660(c21825M48588);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49660(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            ((AbstractC16579) it.next()).mo1928(this, (Object) null);
        }
    }

    public C22385(C21679 c21679) {
        this.f73090 = c21679;
    }
}
