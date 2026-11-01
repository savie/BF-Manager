package l;

/* JADX INFO: renamed from: l.᩸ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21682 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23800 f70323;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27876(char c);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27877(AbstractC11242 abstractC11242);

    /* JADX INFO: renamed from: ۙ */
    public void mo30441(C22492 c22492) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27878(byte[] bArr);

    public AbstractC21682(C23800 c23800) {
        this.f70323 = c23800;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo27879(AbstractC16579 abstractC16579) {
        throw new C15333(abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo30442(AbstractC16579 abstractC16579) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i == 14) {
            C0350 c0350 = (C0350) abstractC16579;
            EnumC15395 enumC15395 = c0350.f1776;
            int i2 = C14068.f46212[enumC15395.ordinal()];
            if (i2 == 1) {
                mo27876('+');
                mo30442(c0350.f1774);
                return;
            } else if (i2 == 2) {
                mo27876('-');
                mo30442(c0350.f1774);
                return;
            } else {
                if (i2 == 3) {
                    mo27876('*');
                    return;
                }
                throw new AssertionError(enumC15395);
            }
        }
        if (i == 18) {
            C10894 c10894 = (C10894) abstractC16579;
            m48425(c10894.f37076);
            mo30442(c10894.f53121);
            return;
        }
        if (i != 19) {
            switch (i) {
                case 1:
                    mo27876('[');
                    mo30442(((C8777) abstractC16579).f30194);
                    return;
                case 2:
                    if (abstractC16579.mo12731()) {
                        mo27879(abstractC16579);
                    }
                    mo27876('L');
                    m48424(abstractC16579);
                    mo27876(';');
                    return;
                case 3:
                    mo27876('B');
                    return;
                case 4:
                    mo27876('C');
                    return;
                case 5:
                    mo27876('S');
                    return;
                case 6:
                    mo27876('I');
                    return;
                case 7:
                    mo27876('J');
                    return;
                case 8:
                    mo27876('F');
                    return;
                case 9:
                    mo27876('D');
                    return;
                case 10:
                    mo27876('Z');
                    return;
                case 11:
                    mo27876('V');
                    return;
                case 12:
                    if (((C22929) abstractC16579).mo46762()) {
                        mo27879(abstractC16579);
                    }
                    mo27876('T');
                    mo27877(abstractC16579.f53222.f77453);
                    mo27876(';');
                    return;
                default:
                    throw new AssertionError("typeSig " + abstractC16579.mo1933());
            }
        }
        C13757 c13757 = (C13757) abstractC16579;
        mo27876('(');
        for (C21825 c21825 = c13757.f45367; c21825.m48595(); c21825 = c21825.f70877) {
            mo30442((AbstractC16579) c21825.f70876);
        }
        mo27876(')');
        mo30442(c13757.f45368);
        for (C21825 c21826 = c13757.f45366; c21826.m48595(); c21826 = c21826.f70877) {
            if (((AbstractC16579) c21826.f70876).m39001(EnumC6617.TYPEVAR)) {
                for (C21825 c21827 = c13757.f45366; c21827.m48595(); c21827 = c21827.f70877) {
                    mo27876('^');
                    mo30442((AbstractC16579) c21827.f70876);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48424(AbstractC16579 abstractC16579) {
        AbstractC11242 abstractC11242M28210;
        C0309 c0309 = (C0309) abstractC16579;
        C22492 c22492 = (C22492) c0309.f53222;
        mo30441(c22492);
        AbstractC16579 abstractC16579Mo1934 = c0309.mo1934();
        if (abstractC16579Mo1934.mo1943().m48595()) {
            EnumC10477 enumC10477 = c22492.f77448.f77452;
            EnumC10477 enumC10478 = EnumC10477.f35879;
            C23800 c23800 = this.f70323;
            boolean z = enumC10477 == enumC10478 || c22492.f77453 == c23800.f76940.f77594;
            if (z) {
                abstractC16579Mo1934 = c23800.m52402(abstractC16579Mo1934);
            }
            m48424(abstractC16579Mo1934);
            mo27876(z ? '$' : '.');
            C6171.m17176(c22492.f73414.m28218(c22492.f77448.m52720().f73414));
            if (z) {
                abstractC11242M28210 = c22492.f73414.m28210(c22492.f77448.m52720().f73414.mo28217() + 1, c22492.f73414.mo28217());
            } else {
                abstractC11242M28210 = c22492.f77453;
            }
            mo27877(abstractC11242M28210);
        } else {
            mo27878(C2194.m6809(c22492.f73414));
        }
        if (c0309.mo1938().m48595()) {
            mo27876('<');
            for (C21825 c21825Mo1938 = c0309.mo1938(); c21825Mo1938.m48595(); c21825Mo1938 = c21825Mo1938.f70877) {
                mo30442((AbstractC16579) c21825Mo1938.f70876);
            }
            mo27876('>');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48425(C21825 c21825) {
        mo27876('<');
        while (c21825.m48595()) {
            C22929 c22929 = (C22929) c21825.f70876;
            mo27877(c22929.f53222.f77453);
            C21825 c21825M52381 = this.f70323.m52381(c22929);
            if ((((AbstractC16579) c21825M52381.f70876).f53222.mo20276() & 512) != 0) {
                mo27876(':');
            }
            while (c21825M52381.m48595()) {
                mo27876(':');
                mo30442((AbstractC16579) c21825M52381.f70876);
                c21825M52381 = c21825M52381.f70877;
            }
            c21825 = c21825.f70877;
        }
        mo27876('>');
    }
}
