package l;

/* JADX INFO: renamed from: l.ۢ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C9592 implements InterfaceC12414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13970 f32331;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f32332;

    public C9592(C13970 c13970, boolean[] zArr) {
        this.f32331 = c13970;
        this.f32332 = zArr;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۨ */
    public final void mo1609(int i) {
        if (i < this.f32331.f45945) {
            this.f32332[i] = false;
        }
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۙ */
    public final void mo1606(int i) {
        if (i < this.f32331.f45945) {
            this.f32332[i] = false;
        }
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ܰ */
    public final void mo1610(int i) {
        mo1609(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۖ */
    public final void mo1605(int i) {
        mo1606(i);
    }
}
