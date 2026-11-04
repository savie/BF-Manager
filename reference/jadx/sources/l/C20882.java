package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩵᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20882 implements InterfaceC24612 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14168 f66831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3728 f66832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3728 f66833;

    public C20882(C14168 c14168) {
        this.f66831 = c14168;
        this.f66832 = new C3728("JmDNS(" + c14168.getName() + ").Timer", true);
        this.f66833 = new C3728("JmDNS(" + c14168.getName() + ").State.Timer", false);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۫ */
    public final void mo34436() {
        this.f66832.purge();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ᩹ */
    public final void mo34459() {
        this.f66833.purge();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34449() {
        this.f66832.cancel();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ */
    public final void mo34415() {
        this.f66833.cancel();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۤ */
    public final void mo34435() {
        C6866 c6866 = new C6866(this.f66831);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c6866.m42076().m34444() < 5000) {
            c6866.m42076().m34416(c6866.m42076().m34434() + 1);
        } else {
            c6866.m42076().m34416(1);
        }
        c6866.m42076().m34450(jCurrentTimeMillis);
        boolean zM34432 = c6866.m42076().m34432();
        C3728 c3728 = this.f66833;
        if (zM34432 && c6866.m42076().m34434() < 10) {
            c3728.schedule(c6866, C14168.m34400().nextInt(251), 250L);
        } else {
            if (c6866.m42076().m34457() || c6866.m42076().m34438()) {
                return;
            }
            c3728.schedule(c6866, 1000L, 1000L);
        }
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܶ */
    public final void mo34442() {
        C9102 c9102 = new C9102(this.f66831);
        if (c9102.m42076().m34457() || c9102.m42076().m34438()) {
            return;
        }
        this.f66833.schedule(c9102, 1000L, 1000L);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܳ */
    public final void mo34440() {
        C13577 c13577 = new C13577(this.f66831);
        if (c13577.m42076().m34457() || c13577.m42076().m34438()) {
            return;
        }
        long j = C3137.f10164;
        this.f66833.schedule(c13577, j, j);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۚ */
    public final void mo34431() {
        this.f66833.schedule(new C2391(this.f66831), 0L, 1000L);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܽ */
    public final void mo34443() {
        C0154 c0154 = new C0154(this.f66831);
        if (c0154.m42076().m34457() || c0154.m42076().m34438()) {
            return;
        }
        this.f66832.schedule(c0154, 10000L, 10000L);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ */
    public final void mo34428(C17307 c17307) {
        C9848 c9848 = new C9848(this.f66831, c17307);
        if (c9848.m42076().m34457() || c9848.m42076().m34438()) {
            return;
        }
        this.f66832.schedule(c9848, 225L, 225L);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ */
    public final void mo34418(String str) {
        C0900 c0900 = new C0900(this.f66831, str);
        if (c0900.m42076().m34457() || c0900.m42076().m34438()) {
            return;
        }
        this.f66832.schedule(c0900, 225L, 225L);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ */
    public final void mo34421(C0525 c0525, InetAddress inetAddress, int i) {
        new C7612(this.f66831, c0525, inetAddress, i).m20812(this.f66832);
    }
}
