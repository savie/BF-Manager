package l;

/* JADX INFO: renamed from: l.ۧ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11297 implements InterfaceC4324 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3534 f38135;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3534 f38137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38136 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3534 f38138 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38139 = false;

    public C11297(C3534 c3534, C3534 c3535) {
        this.f38137 = c3534;
        this.f38135 = c3535;
    }

    @Override // l.InterfaceC4324
    /* JADX INFO: renamed from: ۙ */
    public final void mo12161(C3534 c3534) {
        if (this.f38139) {
            return;
        }
        if (this.f38136) {
            C3534 c3535 = this.f38135;
            C3534 c3536 = this.f38137;
            if (c3534 == c3536) {
                this.f38136 = false;
                this.f38138 = c3535;
            } else {
                if (c3534 != c3535) {
                    return;
                }
                this.f38136 = false;
                this.f38138 = c3536;
            }
        }
        if (c3534.m10396()) {
            c3534.m10410();
        }
        if (c3534 == this.f38138) {
            this.f38139 = true;
        }
    }

    @Override // l.InterfaceC4324
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12162() {
        return this.f38138 == null;
    }
}
