package l;

/* JADX INFO: renamed from: l.᩻ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes.dex */
public final class C24799 implements InterfaceC20449 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23307 f80249;

    public C24799(C23307 c23307) {
        this.f80249 = c23307;
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27314(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo27315();
        this.f80249.m52447((int) f);
        return true;
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27315() {
        this.f80249.f75487.abortAnimation();
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ۙ */
    public final float mo27313() {
        return -this.f80249.m52446();
    }
}
