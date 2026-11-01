package l;

/* JADX INFO: renamed from: l.᩸ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21345 implements InterfaceC8497 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19229 f69462;

    public C21345(C19229 c19229) {
        this.f69462 = c19229;
    }

    @Override // l.InterfaceC8497
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22204(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo22205();
        this.f69462.m44186((int) f);
        return true;
    }

    @Override // l.InterfaceC8497
    /* JADX INFO: renamed from: ܰ */
    public final void mo22205() {
        this.f69462.f62136.abortAnimation();
    }

    @Override // l.InterfaceC8497
    /* JADX INFO: renamed from: ۙ */
    public final float mo22203() {
        return -this.f69462.m44185();
    }
}
