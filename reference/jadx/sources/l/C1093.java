package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1093 extends AbstractC20912 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f4991;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13089 f4992;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1093(C13089 c13089, C12926 c12926, C10391 c10391, AbstractC16579 abstractC16579) {
        super(c13089.f43597, true, c12926, c10391);
        this.f4992 = c13089;
        this.f4991 = abstractC16579;
    }

    @Override // l.AbstractC20912, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        AbstractC16579 abstractC165711;
        AbstractC8774 abstractC8774Mo25712;
        C20145 c20145 = this.f4992.f43597;
        if (c20145.f65430 && m4098(abstractC16579, abstractC165710) && (abstractC165711 = this.f4991) != null && abstractC165711.mo1933() == EnumC6617.DEFERRED && (abstractC8774Mo25712 = ((C10104) abstractC165711).mo25712(this.f67949)) != c20145.f65438.f20039) {
            return m4095(abstractC16579, abstractC165710, abstractC8774Mo25712);
        }
        return m4094(abstractC16579, abstractC165710);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m4094(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C20145 c20145 = this.f4992.f43597;
        if (!this.f67950 && abstractC16579.mo9481() != abstractC165710.mo9481()) {
            abstractC16579 = abstractC16579.mo9481() ? c20145.f65444.m52383(abstractC16579).f77449 : c20145.f65444.m52437(abstractC16579);
        }
        return c20145.f65444.m52413(abstractC16579, this.f67949.f42956.m44602(abstractC165710), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m4098(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C20145 c20145 = this.f4992.f43597;
        C23800 c23800 = c20145.f65444;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        c23800.getClass();
        try {
            c23800.m52385(abstractC0618);
            C23800 c23801 = c20145.f65444;
            AbstractC0618 abstractC0619 = abstractC165710.f53222;
            c23801.getClass();
            c23801.m52385(abstractC0619);
            return m4096(abstractC16579, abstractC165710);
        } catch (C23945 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m4096(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        boolean zMo12731 = abstractC16579.mo12731();
        C13089 c13089 = this.f4992;
        if (zMo12731) {
            Iterator it = c13089.f43597.f65444.m52439(abstractC16579).iterator();
            while (it.hasNext()) {
                if (!m4096((AbstractC16579) it.next(), abstractC165710)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC165710.mo12731()) {
            return c13089.f43597.f65444.m52423(abstractC165710.f53222, abstractC16579) == null && c13089.f43597.f65444.m52423(abstractC16579.f53222, abstractC165710) == null;
        }
        Iterator it2 = c13089.f43597.f65444.m52439(abstractC165710).iterator();
        while (it2.hasNext()) {
            if (!m4096(abstractC16579, (AbstractC16579) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m4095(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, AbstractC8774 abstractC8774) {
        C19524 c19524 = this.f67949.f42956;
        C20145 c20145 = this.f4992.f43597;
        C23800 c23800 = c20145.f65444;
        AbstractC16579 abstractC16579M52431 = c23800.m52431(c23800.m52419(abstractC16579));
        AbstractC16579 abstractC16579M52432 = c20145.f65444.m52431(abstractC16579);
        AbstractC16579 abstractC16579M52433 = c20145.f65444.m52431(abstractC165710);
        C21825 c21825Mo1938 = abstractC16579M52431.mo1938();
        C21825 c21825Mo1939 = abstractC16579M52432.mo1938();
        C21825 c21825Mo19310 = abstractC16579M52433.mo1938();
        if (abstractC16579M52431.m39001(EnumC6617.FORALL) && !c20145.f65444.m52391((C10894) abstractC16579M52431, (C10894) abstractC16579M52432)) {
            return false;
        }
        C21825 c21825 = c21825Mo1938;
        C21825 c21826 = c21825Mo19310;
        while (c21825.m48595() && c21826.m48595()) {
            AbstractC16579 abstractC16579Mo18112 = ((AbstractC16579) c21825.f70876).mo18112();
            AbstractC16579 abstractC16579M52371 = c20145.f65444.m52371(((AbstractC16579) c21826.f70876).mo18112(), c21825Mo19310, c21825Mo1938);
            if ((abstractC16579Mo18112.m39005(c21825Mo1938) && abstractC16579M52371.m39005(c19524.f62771)) || !c20145.f65444.m52399(abstractC16579Mo18112, c19524.m44602(abstractC16579M52371))) {
                return false;
            }
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
        if (!c21825.isEmpty() || !c21826.isEmpty()) {
            return false;
        }
        C21825 c21825Mo33523 = abstractC16579M52431.mo33523();
        C21825 c21825Mo33524 = abstractC16579M52432.mo33523();
        C21825 c21825Mo33525 = abstractC16579M52433.mo33523();
        while (c21825Mo33523.m48595() && c21825Mo33524.m48595() && c21825Mo33525.m48595()) {
            AbstractC16579 abstractC165711 = (AbstractC16579) c21825Mo33523.f70876;
            AbstractC16579 abstractC16579M52372 = c20145.f65444.m52371((AbstractC16579) c21825Mo33524.f70876, c21825Mo1939, c21825Mo1938);
            AbstractC16579 abstractC16579M52373 = c20145.f65444.m52371((AbstractC16579) c21825Mo33525.f70876, c21825Mo19310, c21825Mo1938);
            if (abstractC165711.m39005(c21825Mo1938) && abstractC16579M52373.m39005(c19524.f62771)) {
                return false;
            }
            C21825 c21827 = c21825Mo1939;
            if (!c20145.f65444.m52413(c19524.m44602(abstractC16579M52373), abstractC165711, true) || !c20145.f65444.m52399(abstractC16579M52372, c19524.m44602(abstractC16579M52373))) {
                return false;
            }
            c21825Mo33523 = c21825Mo33523.f70877;
            c21825Mo33524 = c21825Mo33524.f70877;
            c21825Mo33525 = c21825Mo33525.f70877;
            c21825Mo1939 = c21827;
        }
        if (!c21825Mo33523.isEmpty() || !c21825Mo33524.isEmpty() || !c21825Mo33525.isEmpty()) {
            return false;
        }
        AbstractC16579 abstractC16579Mo16235 = abstractC16579M52431.mo16235();
        AbstractC16579 abstractC16579M52374 = c20145.f65444.m52371(abstractC16579M52433.mo16235(), c21825Mo19310, c21825Mo1938);
        if (abstractC16579Mo16235.m39005(c21825Mo1938) && abstractC16579M52374.m39005(c19524.f62771)) {
            return false;
        }
        C22261 c22261 = new C22261(this, abstractC16579Mo16235, abstractC16579M52374);
        c22261.mo7248(abstractC8774);
        return c22261.f72769;
    }
}
