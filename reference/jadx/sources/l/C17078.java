package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܺ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17078 implements InterfaceC17583 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC0848 f55758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f55759;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f55760;

    public C17078(ActivityC0848 activityC0848, C16332 c16332, boolean z) {
        this.f55760 = c16332;
        this.f55758 = activityC0848;
        this.f55759 = z;
        if (c16332.f53033 == null) {
            C20283 c20283 = (C20283) ((C22761) new C16196(activityC0848).m38422(C22761.class)).m51321().m40346();
            C17359.requireNonNull(c20283);
            c16332.f53033 = c20283;
        }
        if (c16332.f53041 == null) {
            c16332.f53041 = (C12318) new C16196(activityC0848).m38422(C12318.class);
        }
    }

    @Override // l.InterfaceC17583
    public final String getTitle() {
        return this.f55760.mo1445();
    }

    @Override // l.InterfaceC17583
    /* JADX INFO: renamed from: ۙ */
    public final void mo29882() {
        if (this.f55760.f53026) {
            C24132 c24132 = this.f55760.f53032;
            m40214(c24132.m54021().toString());
            if (this.f55759) {
                this.f55760.f29441.putBoolean("changed", false);
                C16332 c16332 = this.f55760;
                c16332.m24172(c16332.f53033.m11163());
                InterfaceC19777 interfaceC19777Mo1447 = this.f55760.mo1447();
                if (interfaceC19777Mo1447 != null) {
                    C20062 c20062 = (C20062) interfaceC19777Mo1447;
                    c20062.mo34769();
                    c20062.mo34768();
                }
            }
            c24132.m54103();
            return;
        }
        this.f55760.f53041.m30724();
        C16332 c16333 = this.f55760;
        C9378 c9378M24173 = c16333.m24173(c16333.f53033.m11163());
        C20348 c20348M46740 = C20348.m46740(c9378M24173.m24700());
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253409);
        int i = c20348M46740.readInt();
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253409);
        if (i == this.f55760.f53033.m46607(this.f55760.m38820())) {
            C16332 c16334 = this.f55760;
            m40214(C13731.m33555(c20348M46740, c16334.m24166(c16334.f53033.m11163()).m24699()));
        } else {
            m40214(this.f55760.f53033.m46622(this.f55760.m38820()));
        }
        if (this.f55759) {
            this.f55760.f29441.putBoolean("changed", false);
            C16332 c16335 = this.f55760;
            c16335.m24172(c16335.f53033.m11163());
            C13731.m33552(c20348M46740);
            C6929.m19210(4, this.f55760.f53033.m46607(this.f55760.m38820()), c20348M46740.f65270);
            synchronized (this.f55760) {
                byte[] bArr = c20348M46740.f65270;
                int i2 = C15768.f51344;
                c9378M24173.m24696(C15768.m37706(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40214(String str) throws Exception {
        C16332 c16332 = this.f55760;
        C7118 c7118M46609 = c16332.f53033.m46609(c16332.f53033.m46600(c16332.m38820()));
        if (C19051.m44161(str, c7118M46609.m19516(), c7118M46609) == null) {
            throw new Exception("Unknown error");
        }
        c16332.f53033.m46615(c16332.m38820(), str);
    }

    @Override // l.InterfaceC17583
    /* JADX INFO: renamed from: ۙ */
    public final Exception mo29881(Exception exc) {
        C16332 c16332 = this.f55760;
        if (!c16332.f53026) {
            return exc instanceof C4511 ? new C18636(c16332.m38820(), (C4511) exc) : exc;
        }
        ActivityC0848 activityC0848 = this.f55758;
        activityC0848.m40401(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C4511) {
            C4511 c4511 = (C4511) exc;
            activityC0848.m3457();
            C15301 c15301M36736 = C15301.m36736(c4511.f16093, c4511.f16098);
            c15301M36736.f50017 = false;
            activityC0848.m3431(c16332.m38820(), c15301M36736);
            c16332.f53033.m46575(c16332.m38820());
        }
        return null;
    }
}
