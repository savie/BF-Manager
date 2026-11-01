package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܺۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H20Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15752 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51057;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20690 f51058 = new C20690();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19985 f51059;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37492(Bundle bundle) {
        C13465.m32966(bundle, "outBundle");
        this.f51058.m46528(bundle);
    }

    public C15752(InterfaceC19985 interfaceC19985) {
        this.f51059 = interfaceC19985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20690 m37489() {
        return this.f51058;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37491() {
        InterfaceC19985 interfaceC19985 = this.f51059;
        AbstractC3062 lifecycle = interfaceC19985.getLifecycle();
        if (lifecycle.mo9170() != EnumC9414.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo9171(new C8696(interfaceC19985));
        this.f51058.m46526(lifecycle);
        this.f51057 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37490(Bundle bundle) {
        if (!this.f51057) {
            m37491();
        }
        AbstractC3062 lifecycle = this.f51059.getLifecycle();
        if (lifecycle.mo9170().m24173(EnumC9414.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo9170()).toString());
        }
        this.f51058.m46524(bundle);
    }
}
