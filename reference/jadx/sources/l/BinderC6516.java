package l;

/* JADX INFO: renamed from: l.ۛܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC6516 extends AbstractBinderC16210 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC24416 f21921;

    public BinderC6516(ServiceC24416 serviceC24416) {
        this.f21921 = serviceC24416;
        attachInterface(this, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
    }

    @Override // l.InterfaceC23670
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo18392() {
        ServiceC24416 serviceC24416 = this.f21921;
        serviceC24416.f79283 = null;
        try {
            C12481.m31016();
            return true;
        } catch (Throwable th) {
            serviceC24416.f79283 = th;
            return false;
        }
    }

    @Override // l.InterfaceC23670
    public final void exit() {
        this.f21921.stopSelf();
        System.exit(0);
    }
}
