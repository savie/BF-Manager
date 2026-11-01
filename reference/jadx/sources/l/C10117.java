package l;

/* JADX INFO: renamed from: l.ۤۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10117 implements InterfaceC8706 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34525 = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC8706 f34527;

    public C10117(InterfaceC8706 interfaceC8706) {
        this.f34527 = interfaceC8706;
    }

    @Override // l.InterfaceC8706
    /* JADX INFO: renamed from: ۡۙ */
    public final void mo22531() {
        this.f34527.mo22531();
    }

    @Override // l.InterfaceC8706
    /* JADX INFO: renamed from: ۟ۙ */
    public final void mo22530() {
        this.f34527.mo22530();
    }

    @Override // l.InterfaceC8706
    /* JADX INFO: renamed from: ۫ */
    public final void mo22532() {
        this.f34527.mo22532();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m25744(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f34525 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25743(int i) {
        this.f34526 += i;
    }

    @Override // l.InterfaceC8706
    /* JADX INFO: renamed from: ܰ */
    public final void mo22533(int i) {
        this.f34527.mo22533((i / this.f34525) + this.f34526);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f34527.mo2357();
    }
}
