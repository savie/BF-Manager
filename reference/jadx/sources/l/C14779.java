package l;

/* JADX INFO: renamed from: l.ܰᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14779 implements InterfaceC13025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21493 f48354;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5284 f48355;

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6341(C1356 c1356) {
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6342(C14033 c14033) {
    }

    public C14779(C21493 c21493, C5284 c5284) {
        this.f48354 = c21493;
        this.f48355 = c5284;
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6343(C1356 c1356) {
        C18708 c18708M40434 = c1356.mo4993().m40434();
        C0063 c0063Mo4992 = c1356.mo4992();
        C21493 c21493 = this.f48354;
        if (!C21493.m48899(c21493, c1356) && c0063Mo4992.size() == 2) {
            if (c18708M40434.m43508() != 4) {
                C20946 c20946M31619get = c0063Mo4992.m31619get(0);
                C20946 c20946M31619get2 = c0063Mo4992.m31619get(1);
                C5284 c5284 = this.f48355;
                if (c5284.m15881(c18708M40434, c20946M31619get, c20946M31619get2)) {
                    c1356.m4984();
                    return;
                } else {
                    if (c18708M40434.m43503() && c5284.m15881(c18708M40434, c0063Mo4992.m31619get(1), c0063Mo4992.m31619get(0))) {
                        c1356.m4986(C0063.m1031(c0063Mo4992.m31619get(1), c0063Mo4992.m31619get(0)));
                        c1356.m4984();
                        return;
                    }
                    return;
                }
            }
            InterfaceC22239 interfaceC22239M47898 = c0063Mo4992.m31619get(0).m47898();
            if (!(interfaceC22239M47898 instanceof AbstractC24149) || ((AbstractC24149) interfaceC22239M47898).mo17876() != 0) {
                InterfaceC22239 interfaceC22239M47899 = c0063Mo4992.m31619get(1).m47898();
                if ((interfaceC22239M47899 instanceof AbstractC24149) && ((AbstractC24149) interfaceC22239M47899).mo17876() == 0) {
                    c21493.m48896(c1356, c0063Mo4992.m1034(), c18708M40434.m43509(), (AbstractC13487) null);
                    return;
                }
                return;
            }
            C0063 c0063M1042 = c0063Mo4992.m1042();
            int iM43509 = c18708M40434.m43509();
            switch (iM43509) {
                case 7:
                case 8:
                    break;
                case 9:
                    iM43509 = 12;
                    break;
                case 10:
                    iM43509 = 11;
                    break;
                case 11:
                    iM43509 = 10;
                    break;
                case 12:
                    iM43509 = 9;
                    break;
                default:
                    throw new RuntimeException(C13645.m33382(iM43509, "Unrecognized IF regop: "));
            }
            c21493.m48896(c1356, c0063M1042, iM43509, (AbstractC13487) null);
        }
    }
}
