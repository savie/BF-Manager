package l;

/* JADX INFO: renamed from: l.ۨ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12704 implements InterfaceC18671 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21655 f40693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21655 f40695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40691 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21655 f40692 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40694 = false;

    public C12704(C21655 c21655, C21655 c21656) {
        this.f40693 = c21655;
        this.f40695 = c21656;
    }

    @Override // l.InterfaceC18671
    /* JADX INFO: renamed from: ۙ */
    public final void mo18830(C21655 c21655) {
        if (this.f40694) {
            return;
        }
        if (this.f40691) {
            C21655 c21656 = this.f40695;
            C21655 c21657 = this.f40693;
            if (c21655 == c21657) {
                this.f40691 = false;
                this.f40692 = c21656;
            } else {
                if (c21655 != c21656) {
                    return;
                }
                this.f40691 = false;
                this.f40692 = c21657;
            }
        }
        if (c21655.m49186()) {
            c21655.m49190();
        }
        if (c21655 == this.f40692) {
            this.f40694 = true;
        }
    }

    @Override // l.InterfaceC18671
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18831() {
        return this.f40692 == null;
    }
}
