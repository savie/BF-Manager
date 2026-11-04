package l;

/* JADX INFO: renamed from: l.ۖ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C2895 implements InterfaceC0658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14573 f9486 = new C14573(new byte[4], 4);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7370 f9487;

    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2878(C1150 c1150, InterfaceC12789 interfaceC12789, C10857 c10857) {
    }

    public C2895(C7370 c7370) {
        this.f9487 = c7370;
    }

    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2879(C21287 c21287) {
        C7370 c7370;
        if (c21287.m48493() == 0 && (c21287.m48493() & 128) != 0) {
            c21287.m48503(6);
            int iM48486 = c21287.m48486() / 4;
            int i = 0;
            while (true) {
                c7370 = this.f9487;
                if (i >= iM48486) {
                    break;
                }
                C14573 c14573 = this.f9486;
                c21287.m48490(0, 4, c14573.f45926);
                c14573.m35167(0);
                int iM35163 = c14573.m35163(16);
                c14573.m35161(3);
                if (iM35163 == 0) {
                    c14573.m35161(13);
                } else {
                    int iM35164 = c14573.m35163(13);
                    if (c7370.f24261.get(iM35164) == null) {
                        c7370.f24261.put(iM35164, new C8116(new C8861(c7370, iM35164)));
                        c7370.f24254++;
                    }
                }
                i++;
            }
            if (c7370.f24251 != 2) {
                c7370.f24261.remove(0);
            }
        }
    }
}
