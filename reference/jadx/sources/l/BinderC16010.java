package l;

/* JADX INFO: renamed from: l.ܺܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC16010 extends AbstractBinderC19537 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC20243 f51828;

    public BinderC16010(ServiceC20243 serviceC20243) {
        this.f51828 = serviceC20243;
        attachInterface(this, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
    }

    @Override // l.InterfaceC8954
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo21638() {
        ServiceC20243 serviceC20243 = this.f51828;
        serviceC20243.f65680 = null;
        try {
            C20948.m47125();
            return true;
        } catch (Throwable th) {
            serviceC20243.f65680 = th;
            return false;
        }
    }

    @Override // l.InterfaceC8954
    public final void exit() {
        this.f51828.stopSelf();
        System.exit(0);
    }
}
