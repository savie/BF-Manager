package l;

/* JADX INFO: renamed from: l.᩷᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21147 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16209 f68876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1433 f68877;

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
    }

    public C21147(C16209 c16209, C1433 c1433) {
        this.f68876 = c16209;
        this.f68877 = c1433;
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        C12723 c12723M37181 = c6330.mo17428().m37181();
        C0727 c0727Mo17429 = c6330.mo17429();
        C16209 c16209 = this.f68876;
        if (!C16209.m38323(c16209, c6330) && c0727Mo17429.size() == 2) {
            if (c12723M37181.m31577() != 4) {
                C16251 c16251M15275get = c0727Mo17429.m15275get(0);
                C16251 c16251M15275get2 = c0727Mo17429.m15275get(1);
                C1433 c1433 = this.f68877;
                if (c1433.m5008(c12723M37181, c16251M15275get, c16251M15275get2)) {
                    c6330.m17431();
                    return;
                } else {
                    if (c12723M37181.m31576() && c1433.m5008(c12723M37181, c0727Mo17429.m15275get(1), c0727Mo17429.m15275get(0))) {
                        c6330.m17419(C0727.m3149(c0727Mo17429.m15275get(1), c0727Mo17429.m15275get(0)));
                        c6330.m17431();
                        return;
                    }
                    return;
                }
            }
            InterfaceC4919 interfaceC4919M38401 = c0727Mo17429.m15275get(0).m38401();
            if (!(interfaceC4919M38401 instanceof AbstractC10377) || ((AbstractC10377) interfaceC4919M38401).mo21659() != 0) {
                InterfaceC4919 interfaceC4919M38402 = c0727Mo17429.m15275get(1).m38401();
                if ((interfaceC4919M38402 instanceof AbstractC10377) && ((AbstractC10377) interfaceC4919M38402).mo21659() == 0) {
                    c16209.m38321(c6330, c0727Mo17429.m3160(), c12723M37181.m31572(), (AbstractC9901) null);
                    return;
                }
                return;
            }
            C0727 c0727M3158 = c0727Mo17429.m3158();
            int iM31572 = c12723M37181.m31572();
            switch (iM31572) {
                case 7:
                case 8:
                    break;
                case 9:
                    iM31572 = 12;
                    break;
                case 10:
                    iM31572 = 11;
                    break;
                case 11:
                    iM31572 = 10;
                    break;
                case 12:
                    iM31572 = 9;
                    break;
                default:
                    throw new RuntimeException(C8479.m22141(iM31572, "Unrecognized IF regop: "));
            }
            c16209.m38321(c6330, c0727M3158, iM31572, (AbstractC9901) null);
        }
    }
}
