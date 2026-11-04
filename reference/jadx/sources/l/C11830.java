package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11830 extends AbstractC2136 {
    @Override // l.AbstractC2136
    /* JADX INFO: renamed from: ۙ */
    public final void mo7379(AbstractC19311 abstractC19311, C14769 c14769, boolean z, AbstractC22664 abstractC22664) {
        int i;
        C14764 c14764;
        C14769 c14769M7376 = AbstractC2136.m7376(c14769);
        Iterator it = c14769M7376.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c14764 = this.f58414;
            if (!zHasNext) {
                break;
            }
            C14769<AbstractC8036> c147610 = (C14769) it.next();
            C11972.m30025("Arguments list is empty", !c147610.isEmpty());
            StringBuilder sb = new StringBuilder(c147610.m35551());
            C18499 c18499 = new C18499();
            C18499 c184910 = new C18499();
            boolean z3 = z2;
            for (AbstractC8036 abstractC8036 : c147610) {
                Object objMo39105 = abstractC8036.f26659.mo39105();
                if (!"".equals(objMo39105)) {
                    AbstractC22664 abstractC22665 = abstractC8036.f26659;
                    if (abstractC22665 == c14764.f48241) {
                        sb.append((String) null);
                    } else if (objMo39105 != null) {
                        String strMo23625 = abstractC22665.mo23625();
                        if (strMo23625.indexOf(2) != -1 || strMo23625.indexOf(1) != -1) {
                            sb.append((char) 2);
                            c184910.m43089(C9089.m24226(strMo23625));
                        } else {
                            sb.append(strMo23625);
                        }
                    } else {
                        sb.append((char) 1);
                        AbstractC22664 abstractC22666 = abstractC8036.f26659;
                        if (!z3 || z) {
                            this.f58411.m36234(abstractC22666, abstractC8036).mo5785();
                        }
                        if (!this.f58413.m55145(abstractC22666).mo40452() && abstractC22666.f73596 != c14764.f48282.f73596) {
                            this.f58411.m36242((AbstractC8036) abstractC19311, c14764.f48282, this.f58412.f49817, C14769.of((Object) c14764.f48286), true);
                            abstractC22666 = c14764.f48282;
                        }
                        c18499.m43089(abstractC22666);
                        z3 = false;
                    }
                }
            }
            m29679(abstractC22664, abstractC19311, sb.toString(), c184910.m43093(), c18499.m43093());
            z2 = z3;
        }
        if (c14769M7376.m35551() > 1) {
            C18499 c184911 = new C18499();
            StringBuilder sb2 = new StringBuilder();
            for (i = 0; i < c14769M7376.m35551(); i++) {
                c184911.m43089(c14764.f48282);
                sb2.append((char) 1);
            }
            m29679(abstractC22664, abstractC19311, sb2.toString(), C14769.m35543(), c184911.m43093());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29679(AbstractC22664 abstractC22664, AbstractC19311 abstractC19311, String str, C14769 c14769, C14769 c147610) {
        C15252 c15252 = this.f58412;
        C15056 c15056 = this.f58411;
        C14769 c14769M35543 = C14769.m35543();
        C14764 c14764 = this.f58414;
        C24550 c24550 = c14764.f48275;
        AbstractC22664 abstractC22665 = c14764.f48282;
        C23191 c23191 = new C23191(c147610, abstractC22664, c14769M35543, c24550);
        C15714 c15714 = this.f58416;
        int i = c15714.f51040;
        try {
            c15714.m37552((InterfaceC5075) abstractC19311);
            C18499 c18499 = new C18499();
            C18499 c184910 = new C18499();
            Iterator it = c14769.iterator();
            while (it.hasNext()) {
                c184910.m43089((InterfaceC8344) it.next());
                c18499.m43089(abstractC22665);
            }
            C14769 c14769M35546 = C14769.of((Object) c14764.f48324, (Object) abstractC22665, (Object) c14764.f48297).m35546(abstractC22665);
            c14769M35546.getClass();
            C18582 c18582 = new C18582(c15252.f49795, c14764.f48321, this.f58417.m49762(abstractC19311, c15056.m36250(), c14764.f48289, c15252.f49795, c18499.m43093().m35549(c14769M35546), (C14769) null).mo22021(), c23191, (InterfaceC8344[]) c184910.m43093().m35549(C14769.of((Object) C9089.m24226(str))).toArray(new InterfaceC8344[c184910.size()]));
            C6108 c6108M36246 = c15056.m36246();
            c6108M36246.getClass();
            C24705 c24705 = c6108M36246.f20853;
            C8935.m23847(c18582.mo29576(c24705));
            C11972.m30026(c18582.f38066 == EnumC13603.f43218);
            C23191 c23192 = (C23191) c18582.mo29576(c24705);
            int iM23847 = C8935.m23847(c23192.f75156);
            c6108M36246.f20850.m23877(c18582, c23192);
            AbstractC17294 abstractC17294 = c6108M36246.f20855[iM23847];
        } finally {
            c15714.f51040 = i;
        }
    }
}
