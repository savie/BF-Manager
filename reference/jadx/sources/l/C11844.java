package l;

/* JADX INFO: renamed from: l.ۧ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8HW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11844 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38172;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38173;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f38175;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f38171 = new C21287(10);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f38174 = -9223372036854775807L;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f38173 = false;
        this.f38174 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 5);
        this.f38175 = interfaceC22024Mo16658;
        C20124 c20124 = new C20124();
        c20124.m46309(c10857.m27596());
        c20124.m46327("video/mp2t");
        c20124.m46315("application/id3");
        interfaceC22024Mo16658.mo14384(c20124.m46295());
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f38173 = true;
        this.f38174 = j;
        this.f38176 = 0;
        this.f38172 = 0;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        C20782.m47566(this.f38175);
        if (this.f38173) {
            int iM48486 = c21287.m48486();
            int i = this.f38172;
            if (i < 10) {
                int iMin = Math.min(iM48486, 10 - i);
                byte[] bArrM48497 = c21287.m48497();
                int iM48516 = c21287.m48516();
                C21287 c21288 = this.f38171;
                System.arraycopy(bArrM48497, iM48516, c21288.m48497(), this.f38172, iMin);
                if (this.f38172 + iMin == 10) {
                    c21288.m48510(0);
                    if (73 != c21288.m48493() || 68 != c21288.m48493() || 51 != c21288.m48493()) {
                        C1896.m6517("Discarding invalid ID3 tag");
                        this.f38173 = false;
                        return;
                    } else {
                        c21288.m48503(3);
                        this.f38176 = c21288.m48499() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM48486, this.f38176 - this.f38172);
            this.f38175.mo14381(iMin2, c21287);
            this.f38172 += iMin2;
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        int i;
        C20782.m47566(this.f38175);
        if (this.f38173 && (i = this.f38176) != 0 && this.f38172 == i) {
            C20782.m47568(this.f38174 != -9223372036854775807L);
            this.f38175.mo14383(this.f38174, 1, this.f38176, 0, null);
            this.f38173 = false;
        }
    }
}
