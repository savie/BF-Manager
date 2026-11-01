package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17864 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18570 f56560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4603 f56561;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1116 f56562;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19524 f56563;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        AbstractC16579 abstractC16579M52431;
        boolean z;
        C5870 c5870 = this.f56560.f59063;
        C1116 c1116 = this.f56562;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        AbstractC16579 abstractC16579 = c1116.f5036;
        if (this.f56563.f62771.contains(abstractC16579)) {
            return;
        }
        try {
            abstractC16579M52431 = c5870.f20040.m52431(abstractC16579);
        } catch (C23945 e) {
            interfaceC18195.mo2545(null, e.m52780());
            abstractC16579M52431 = null;
        }
        if (abstractC16579M52431.mo33523().m48596() != c22489.f73410.m48596()) {
            interfaceC18195.mo2545(c22489, c5870.f20033.m51910(C14707.f48114));
        }
        AbstractC16579 abstractC16579Mo16235 = abstractC16579M52431.mo16235();
        boolean zM39001 = abstractC16579Mo16235.m39001(EnumC6617.VOID);
        int i = 1;
        if (c22489.m49993() == EnumC9897.EXPRESSION) {
            if (!zM39001 || C3128.m9449((AbstractC5930) c22489.f73408)) {
                return;
            }
            this.f56562.f5037.mo2545(c22489, c5870.f20033.m51910(new C14377("compiler", "incompatible.ret.type.in.lambda", C14707.m35236(abstractC16579Mo16235))));
            return;
        }
        C21392 c21392 = new C21392();
        c21392.f69553 = true;
        c21392.f69552 = true;
        c22489.f73408.mo1802(c21392);
        boolean z2 = c21392.f69553;
        if (zM39001) {
            if (z2) {
                return;
            }
            this.f56562.f5037.mo2545(c22489, c5870.f20033.m51910(C14707.f48084));
            return;
        }
        if (c21392.f69552) {
            C21825 c21825 = c22489.f73410;
            C8528 c8528 = c5870.f20043;
            c8528.getClass();
            HashMap map = c8528.f29526;
            c8528.f29526 = new HashMap();
            try {
                c22489.f73410 = (C21825) C9030.stream(c22489.f73410).map(new C1740(i, this)).collect(C21825.m48587());
                boolean z3 = c5870.m16085(c22489, this.f56561, c5870.f20041.f22809).f73409;
                c8528.f29526 = map;
                c22489.f73410 = c21825;
                if (z3) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                c8528.f29526 = map;
                c22489.f73410 = c21825;
                throw th;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            C20414 c20414 = c5870.f20048;
            AbstractC8774 abstractC8774 = c22489.f73408;
            abstractC8774.getClass();
            c20414.m48199(abstractC8774, C23879.f77296);
        }
        if (z) {
            return;
        }
        this.f56562.f5037.mo2545(c22489, c5870.f20033.m51910(new C14377("compiler", "incompatible.ret.type.in.lambda", C14707.m35236(abstractC16579Mo16235))));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        mo7248(c7341.f24393);
        mo7248(c7341.f24392);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        m49334(c9789.f33505);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        AbstractC16579 abstractC16579M52431;
        C5870 c5870 = this.f56560.f59063;
        C6171.m17171(c6966.mo17205());
        C1116 c1116 = this.f56562;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        AbstractC16579 abstractC16579 = c1116.f5036;
        if (this.f56563.f62771.contains(abstractC16579)) {
            return;
        }
        try {
            abstractC16579M52431 = c5870.f20040.m52431(abstractC16579);
        } catch (C23945 e) {
            interfaceC18195.mo2545(null, e.m52780());
            abstractC16579M52431 = null;
        }
        C4603 c4603 = this.f56561;
        C4603 c4603M12747 = c4603.m12747(c6966, c4603.f16299);
        AbstractC5930 abstractC5930 = c6966.f23408;
        C1116 c1116M18325 = c5870.f20041.m18325(c6966);
        C8528 c8528 = c5870.f20043;
        c8528.getClass();
        AbstractC5930 abstractC5931 = (AbstractC5930) c5870.m16084(abstractC5930, c4603M12747, c1116M18325, c5870.f20047, null, EnumC3377.SPECULATIVE, new C3587(c8528));
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC165710 : abstractC16579M52431.mo33523()) {
            c19003.m43723(AbstractC16579.f53219);
        }
        C6966 c6967 = (C6966) new C0306(c5870.f20045).mo1921((AbstractC8774) c6966, (Object) null);
        c6967.f23408 = abstractC5931;
        C20145 c20145 = c5870.f20046;
        AbstractC16579 abstractC165711 = abstractC5931.f30190;
        AbstractC11242 abstractC11242 = c6966.f23413;
        C21825 c21825M43726 = c19003.m43726();
        C21825 c21825M48588 = C21825.m48588();
        C20145 c20146 = c5870.f20046;
        AbstractC23903 abstractC23903 = (AbstractC23903) c20145.m45523(c4603M12747, c6967, abstractC165711, abstractC11242, c21825M43726, c21825M48588, abstractC16579M52431, c20146.f65443, this.f56563, c20146.f65426).f7664;
        int i = C1966.f7398[abstractC23903.f77452.ordinal()];
        if (i == 1 || i == 2) {
            interfaceC18195.mo2545(c6966, c5870.f20033.m51910(C14707.f48091));
        } else if (i == 3 || i == 4) {
            EnumC17198 enumC17198 = EnumC17198.FRAGMENT;
            AbstractC16579 abstractC165712 = abstractC5931.f30190;
            interfaceC18195.mo2545(c6966, ((AbstractC8856) abstractC23903).mo8964(enumC17198, c6966, abstractC165712.f53222, abstractC165712, c6966.f23413, c19003.m43726(), C21825.m48588()));
        }
    }

    public C17864(C18570 c18570) {
        this.f56560 = c18570;
    }
}
