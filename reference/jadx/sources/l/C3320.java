package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3320 extends AbstractC1584 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21220 f10830;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        c2832.f9333.mo9324(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4102(C5291 c5291, Object obj) {
        m10938(c5291.f18620);
        c5291.f72657.mo9324(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        C10510 c10511;
        AbstractC22664 abstractC22664;
        boolean zMo18914 = c10510.mo18914();
        C21220 c21220 = this.f10830;
        if (zMo18914) {
            EnumC14506 enumC14506 = EnumC14506.INTERSECTION;
            int iM48376 = C21220.m48376(c21220, c10510, enumC14506);
            C24705 c24705 = c21220.f67725;
            if (iM48376 == -1) {
                AbstractC22664 abstractC22664M55137 = c24705.m55137(c10510);
                C14769 c14769M55144 = c24705.m55144(c10510);
                C19991 c19991 = c21220.f67726;
                c14769M55144.getClass();
                C14769 c14769 = new C14769(abstractC22664M55137, c14769M55144);
                C15515 c15515 = C19859.f63823;
                ((Map) c21220.f67724.get(enumC14506)).put(c10510, c19991.m45975(new C15515("compiler", "where.intersection", c10510, c14769)));
                abstractC22664M55137.mo9324(this, (Object) null);
                m10938(c14769M55144);
            }
        } else if (c10510.f73596.f38072.isEmpty() && (c10511 = (C10510) c10510.f73596.f38067) != null) {
            C14769 c147610 = c10511.f33437;
            if (c147610 != null && c147610.m35550()) {
                abstractC22664 = (AbstractC22664) c10511.f33437.f48335;
            } else {
                abstractC22664 = c10511.f33442;
            }
            abstractC22664.mo9324(this, (Object) null);
        }
        c21220.f67730.m30648(c10510.f73596);
        m10938(c10510.mo15882());
        try {
            if (c10510.mo23449() != AbstractC22664.f73590) {
                c10510.mo23449().mo9324(this, (Object) null);
            }
        } catch (C21566 unused) {
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        c10729.f34074.mo9324(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        AbstractC22664 abstractC22664Mo31584 = c12748.mo31584();
        if (abstractC22664Mo31584 != null) {
            abstractC22664Mo31584.mo9324(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1770(C14018 c14018, Object obj) {
        EnumC14506 enumC14506 = EnumC14506.CAPTURED;
        C21220 c21220 = this.f10830;
        if (C21220.m48376(c21220, c14018, enumC14506) == -1) {
            AbstractC22664 abstractC22664 = c14018.f58893;
            C10729 c10729 = c14018.f44410;
            ((Map) c21220.f67724.get(enumC14506)).put(c14018, c21220.f67726.m45980("where.captured".concat(abstractC22664 == c21220.f67728.f48241 ? ".1" : ""), c14018, c14018.mo19992(), c14018.f58893, c10729));
            c10729.mo9324(this, (Object) null);
            c14018.f58893.mo9324(this, (Object) null);
            c14018.mo19992().mo9324(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        C14769 c14769M35543;
        C17969 c179610 = (C17969) c17969.m51068();
        EnumC14506 enumC14506 = EnumC14506.TYPEVAR;
        C21220 c21220 = this.f10830;
        int iM48376 = C21220.m48376(c21220, c179610, enumC14506);
        EnumMap enumMap = c21220.f67724;
        C19991 c19991 = c21220.f67726;
        if (iM48376 == -1) {
            AbstractC22664 abstractC22664Mo19992 = c179610.mo19992();
            while (abstractC22664Mo19992 instanceof C12748) {
                abstractC22664Mo19992 = ((C12748) abstractC22664Mo19992).mo31584();
            }
            if (abstractC22664Mo19992 == null || (!abstractC22664Mo19992.m51067(EnumC21172.CLASS) && !abstractC22664Mo19992.m51067(EnumC21172.TYPEVAR))) {
                c14769M35543 = C14769.m35543();
            } else {
                c14769M35543 = abstractC22664Mo19992.mo18914() ? c21220.f67725.m55135(abstractC22664Mo19992) : C14769.of((Object) abstractC22664Mo19992);
            }
            c21220.f67730.m30648(c179610.f73596);
            Object obj2 = c14769M35543.f48335;
            boolean z = obj2 == null || ((AbstractC22664) obj2).m51067(EnumC21172.NONE) || ((AbstractC22664) c14769M35543.f48335).m51067(EnumC21172.ERROR);
            if ((c179610.f73596.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                ((Map) enumMap.get(EnumC14506.TYPEVAR)).put(c179610, c19991.m45980("where.typevar".concat(z ? ".1" : ""), c179610, c14769M35543, C10925.m27726(c179610.f73596.m29579()), c179610.f73596.m29579()));
                AbstractC7329 abstractC7329 = c21220.f67729;
                AbstractC11781 abstractC11781M29579 = c179610.f73596.m29579();
                abstractC7329.getClass();
                abstractC11781M29579.mo16953(abstractC7329, (Locale) null);
                m10938(c14769M35543);
                return null;
            }
            C11972.m30026(!z);
            C15515 c15515 = C19859.f63823;
            ((Map) enumMap.get(EnumC14506.TYPEVAR)).put(c179610, c19991.m45975(new C15515("compiler", "where.fresh.typevar", c179610, c14769M35543)));
            m10938(c14769M35543);
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2231(C23191 c23191, Object obj) {
        m10938(c23191.f75155);
        c23191.f75156.mo9324(this, (Object) null);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10938(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            ((AbstractC22664) it.next()).mo9324(this, (Object) null);
        }
    }

    public C3320(C21220 c21220) {
        this.f10830 = c21220;
    }
}
