package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19108 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3168 f61837;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14479 f61838;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2596 f61839;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10157 f61840;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        AbstractC22664 abstractC22664M55143;
        boolean z;
        C12863 c12863 = this.f61840.f32523;
        C14479 c14479 = this.f61838;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        AbstractC22664 abstractC22664 = c14479.f45575;
        if (this.f61839.f8340.contains(abstractC22664)) {
            return;
        }
        try {
            abstractC22664M55143 = c12863.f41178.m55143(abstractC22664);
        } catch (C11540 e) {
            interfaceC1013.mo3910(null, e.m29044());
            abstractC22664M55143 = null;
        }
        if (abstractC22664M55143.mo50621().m35551() != c16327.f52999.m35551()) {
            interfaceC1013.mo3910(c16327, c12863.f41179.m45975(C19859.f63887));
        }
        AbstractC22664 abstractC22664Mo31585 = abstractC22664M55143.mo31585();
        boolean zM51067 = abstractC22664Mo31585.m51067(EnumC21172.VOID);
        int i = 1;
        if (c16327.m38748() == EnumC25033.EXPRESSION) {
            if (!zM51067 || C11239.m28336((AbstractC22295) c16327.f53001)) {
                return;
            }
            this.f61838.f45571.mo3910(c16327, c12863.f41179.m45975(new C15515("compiler", "incompatible.ret.type.in.lambda", C19859.m45717(abstractC22664Mo31585))));
            return;
        }
        C7921 c7921 = new C7921();
        c7921.f26309 = true;
        c7921.f26308 = true;
        c16327.f53001.mo2284(c7921);
        boolean z2 = c7921.f26309;
        if (zM51067) {
            if (z2) {
                return;
            }
            this.f61838.f45571.mo3910(c16327, c12863.f41179.m45975(C19859.f63828));
            return;
        }
        if (c7921.f26308) {
            C14769 c14769 = c16327.f52999;
            C7044 c7044 = c12863.f41186;
            c7044.getClass();
            HashMap map = c7044.f23239;
            c7044.f23239 = new HashMap();
            try {
                c16327.f52999 = (C14769) C1170.stream(c16327.f52999).map(new C21264(i, this)).collect(C14769.m35544());
                boolean z3 = c12863.m31897(c16327, this.f61837, c12863.f41176.f1687).f52998;
                c7044.f23239 = map;
                c16327.f52999 = c14769;
                if (z3) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                c7044.f23239 = map;
                c16327.f52999 = c14769;
                throw th;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            C7312 c7312 = c12863.f41183;
            AbstractC8036 abstractC8036 = c16327.f53001;
            abstractC8036.getClass();
            c7312.m34520(abstractC8036, C22843.f74131);
        }
        if (z) {
            return;
        }
        this.f61838.f45571.mo3910(c16327, c12863.f41179.m45975(new C15515("compiler", "incompatible.ret.type.in.lambda", C19859.m45717(abstractC22664Mo31585))));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        mo5474(c10162.f32544);
        mo5474(c10162.f32545);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        m52092(c13256.f42355);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        AbstractC22664 abstractC22664M55143;
        C12863 c12863 = this.f61840.f32523;
        C11972.m30021(c12598.mo6737());
        C14479 c14479 = this.f61838;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        AbstractC22664 abstractC22664 = c14479.f45575;
        if (this.f61839.f8340.contains(abstractC22664)) {
            return;
        }
        try {
            abstractC22664M55143 = c12863.f41178.m55143(abstractC22664);
        } catch (C11540 e) {
            interfaceC1013.mo3910(null, e.m29044());
            abstractC22664M55143 = null;
        }
        C3168 c3168 = this.f61837;
        C3168 c3168M10350 = c3168.m10350(c12598, c3168.f10272);
        AbstractC22295 abstractC22295 = c12598.f40436;
        C14479 c14479M1980 = c12863.f41176.m1980(c12598);
        C7044 c7044 = c12863.f41186;
        c7044.getClass();
        AbstractC22295 abstractC22296 = (AbstractC22295) c12863.m31896(abstractC22295, c3168M10350, c14479M1980, c12863.f41185, null, EnumC23584.SPECULATIVE, new C0332(c7044));
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22665 : abstractC22664M55143.mo50621()) {
            c18499.m43089(AbstractC22664.f73590);
        }
        C12598 c12599 = (C12598) new C8781(c12863.f41181).mo23491((AbstractC8036) c12598, (Object) null);
        c12599.f40436 = abstractC22296;
        C22010 c22010 = c12863.f41188;
        AbstractC22664 abstractC22666 = abstractC22296.f26659;
        AbstractC19728 abstractC19728 = c12598.f40431;
        C14769 c14769M43093 = c18499.m43093();
        C14769 c14769M35543 = C14769.m35543();
        C22010 c22011 = c12863.f41188;
        AbstractC11781 abstractC11781 = (AbstractC11781) c22010.m49761(c3168M10350, c12599, abstractC22666, abstractC19728, c14769M43093, c14769M35543, abstractC22664M55143, c22011.f71020, this.f61839, c22011.f71013).f19300;
        int i = C17616.f57954[abstractC11781.f38066.ordinal()];
        if (i == 1 || i == 2) {
            interfaceC1013.mo3910(c12598, c12863.f41179.m45975(C19859.f63862));
        } else if (i == 3 || i == 4) {
            EnumC22229 enumC22229 = EnumC22229.FRAGMENT;
            AbstractC22664 abstractC22667 = abstractC22296.f26659;
            interfaceC1013.mo3910(c12598, ((AbstractC2335) abstractC11781).mo3799(enumC22229, c12598, abstractC22667.f73596, abstractC22667, c12598.f40431, c18499.m43093(), C14769.m35543()));
        }
    }

    public C19108(C10157 c10157) {
        this.f61840 = c10157;
    }
}
