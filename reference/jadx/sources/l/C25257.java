package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes.dex */
public final class C25257 extends AbstractC2136 {
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
            C18499 c18499 = new C18499();
            for (AbstractC8036 abstractC8036 : c147610) {
                if (!"".equals(abstractC8036.f26659.mo39105())) {
                    AbstractC22664 abstractC22665 = abstractC8036.f26659;
                    AbstractC22664 abstractC22666 = c14764.f48241;
                    C24705 c24705 = this.f58413;
                    if (abstractC22665 == abstractC22666) {
                        abstractC22665 = c24705.m55108(c14764.f48251).f38067;
                    }
                    if (!z2 || z) {
                        this.f58411.m36234(abstractC8036.f26659, abstractC8036).mo5785();
                    }
                    if (!c24705.m55145(abstractC22665).mo40452() && abstractC22665.f73596 != c14764.f48282.f73596) {
                        this.f58411.m36242((AbstractC8036) abstractC19311, c14764.f48282, this.f58412.f49817, C14769.of((Object) c14764.f48286), true);
                        abstractC22665 = c14764.f48282;
                    }
                    c18499.m43089(abstractC22665);
                    z2 = false;
                }
            }
            m56393(abstractC22664, abstractC19311, c18499.m43093());
        }
        if (c14769M7376.m35551() > 1) {
            C18499 c184910 = new C18499();
            for (i = 0; i < c14769M7376.m35551(); i++) {
                c184910.m43089(c14764.f48282);
            }
            m56393(abstractC22664, abstractC19311, c184910.m43093());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56393(AbstractC22664 abstractC22664, AbstractC19311 abstractC19311, C14769 c14769) {
        C15252 c15252 = this.f58412;
        C15056 c15056 = this.f58411;
        C14769 c14769M35543 = C14769.m35543();
        C14764 c14764 = this.f58414;
        C23191 c23191 = new C23191(c14769, abstractC22664, c14769M35543, c14764.f48275);
        C15714 c15714 = this.f58416;
        int i = c15714.f51040;
        try {
            c15714.m37552((InterfaceC5075) abstractC19311);
            C18582 c18582 = new C18582(c15252.f49841, c14764.f48321, this.f58417.m49762(abstractC19311, c15056.m36250(), c14764.f48289, c15252.f49841, C14769.of((Object) c14764.f48324, (Object) c14764.f48282, (Object) c14764.f48297), (C14769) null).mo22021(), c23191, (InterfaceC8344[]) C14769.m35543().toArray(new InterfaceC8344[0]));
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
