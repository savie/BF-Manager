package l;

/* JADX INFO: renamed from: l.ܳܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14581 implements InterfaceC18739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47706 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f47707;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5035 f47708;

    public C14581(C5035 c5035, int i) {
        this.f47708 = c5035;
        this.f47707 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35054() {
        C2023.m6507(this.f47706 == -1);
        this.f47706 = this.f47708.m14036(this.f47707);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35053() {
        if (this.f47706 != -1) {
            this.f47708.m14035(this.f47707);
            this.f47706 = -1;
        }
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12778() {
        if (this.f47706 != -3) {
            return m35052() && this.f47708.m14050(this.f47706);
        }
        return true;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final void mo12777() throws C12797 {
        int i = this.f47706;
        C5035 c5035 = this.f47708;
        if (i == -2) {
            throw new C12797(C16523.m38890("Unable to bind a sample queue to TrackGroup with MIME type ", c5035.m14034().m52136(this.f47707).m40159(0).f25265, "."));
        }
        if (i == -1) {
            c5035.m14052();
        } else if (i != -3) {
            c5035.m14048(i);
        }
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12776(C12526 c12526, C16033 c16033, int i) {
        if (this.f47706 == -3) {
            c16033.m42270(4);
            return -4;
        }
        if (m35052()) {
            return this.f47708.m14038(this.f47706, c12526, c16033, i);
        }
        return -3;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12775(long j) {
        if (m35052()) {
            return this.f47708.m14037(this.f47706, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m35052() {
        int i = this.f47706;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
