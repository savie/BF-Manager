package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17051 extends AbstractC17797 {
    @Override // l.AbstractC17797
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17294 mo7378(C12400 c12400) {
        m40175((AbstractC19311) c12400);
        AbstractC22295 abstractC22295 = c12400.f39896;
        AbstractC22664 abstractC22664 = abstractC22295.f26659;
        C15056 c15056 = this.f58411;
        AbstractC17294 abstractC17294M36234 = c15056.m36234(abstractC22664, abstractC22295);
        if (abstractC17294M36234.mo5781() > 0) {
            c15056.m36247().m23883(((abstractC17294M36234.mo5781() - 1) * 3) + 90);
        }
        abstractC17294M36234.mo5785();
        m40176(c12400.f39896);
        for (AbstractC8036 abstractC8036 : AbstractC17797.m41652(c12400.f39895)) {
            c15056.m36234(abstractC8036.f26659, abstractC8036).mo5785();
            m40176(abstractC8036);
        }
        this.f58411.m36242((AbstractC8036) c12400, this.f58414.f48305, this.f58412.f49848, C14769.m35543(), false);
        return abstractC17294M36234;
    }

    @Override // l.AbstractC17797
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17294 mo7377(C6435 c6435) {
        m40175((AbstractC19311) c6435);
        Iterator it = AbstractC17797.m41652((AbstractC8036) c6435).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C15056 c15056 = this.f58411;
            if (zHasNext) {
                AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
                c15056.m36234(abstractC8036.f26659, abstractC8036).mo5785();
                m40176(abstractC8036);
            } else {
                C14764 c14764 = this.f58414;
                this.f58411.m36242((AbstractC8036) c6435, c14764.f48305, this.f58412.f49848, C14769.m35543(), false);
                return c15056.m36246().m17627(c14764.f48282);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40175(AbstractC19311 abstractC19311) {
        C15056 c15056 = this.f58411;
        C8935 c8935M36247 = c15056.m36247();
        C14764 c14764 = this.f58414;
        c8935M36247.m23870(187, c15056.m36226((InterfaceC5075) abstractC19311, c14764.f48305), (InterfaceC13564) c14764.f48305);
        c15056.m36247().m23883(89);
        this.f58411.m36242((AbstractC8036) abstractC19311, c14764.f48305, this.f58412.f49865, C14769.m35543(), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40176(AbstractC8036 abstractC8036) {
        AbstractC22664 abstractC22664Mo4935 = abstractC8036.f26659.mo4935();
        boolean zMo40452 = abstractC22664Mo4935.mo40452();
        C14764 c14764 = this.f58414;
        if (!zMo40452 && abstractC22664Mo4935.f73596 != c14764.f48282.f73596) {
            abstractC22664Mo4935 = c14764.f48286;
        }
        C11972.m30030(abstractC22664Mo4935.mo39105());
        HashMap map = this.f58415;
        AbstractC11781 abstractC11781M49762 = (AbstractC11781) map.get(abstractC22664Mo4935);
        C15056 c15056 = this.f58411;
        if (abstractC11781M49762 == null) {
            abstractC11781M49762 = this.f58417.m49762(abstractC8036, c15056.m36250(), c14764.f48305, this.f58412.f49794, C14769.of((Object) abstractC22664Mo4935), (C14769) null);
            map.put(abstractC22664Mo4935, abstractC11781M49762);
        }
        C6108 c6108M36246 = c15056.m36246();
        c6108M36246.getClass();
        C8935 c8935 = c6108M36246.f20850;
        C24705 c24705 = c6108M36246.f20853;
        C8935.m23847(abstractC11781M49762.mo29576(c24705));
        C23191 c23191 = (C23191) abstractC11781M49762.m29598(c24705);
        int iM23847 = C8935.m23847(c23191.f75156);
        if ((abstractC11781M49762.f38069.mo29591() & 512) != 0) {
            c8935.m23876(abstractC11781M49762, c23191);
        } else {
            c8935.m23898(abstractC11781M49762, c23191);
        }
        AbstractC17294 abstractC17294 = c6108M36246.f20855[iM23847];
    }
}
