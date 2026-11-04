package l;

/* JADX INFO: renamed from: l.ᩳۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18800 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f61045;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61046;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f61047;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15648 f61048;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f61049;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21287 f61050;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14573 f61051;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f61052;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f61053;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f61054;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f61055;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f61056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f61057;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f61058;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f61059;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
    }

    public C18800(String str, int i, String str2) {
        C14573 c14573 = new C14573(new byte[16], 16);
        this.f61051 = c14573;
        this.f61050 = new C21287(c14573.f45926);
        this.f61052 = 0;
        this.f61046 = 0;
        this.f61045 = false;
        this.f61055 = false;
        this.f61058 = -9223372036854775807L;
        this.f61047 = str;
        this.f61059 = i;
        this.f61056 = str2;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f61052 = 0;
        this.f61046 = 0;
        this.f61045 = false;
        this.f61055 = false;
        this.f61058 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f61057 = c10857.m27596();
        this.f61049 = interfaceC12789.mo16658(c10857.m27595(), 1);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f61058 = j;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        C20782.m47566(this.f61049);
        while (c21287.m48486() > 0) {
            int i = this.f61052;
            C21287 c21288 = this.f61050;
            if (i == 0) {
                while (c21287.m48486() > 0) {
                    if (!this.f61045) {
                        this.f61045 = c21287.m48493() == 172;
                    } else {
                        int iM48493 = c21287.m48493();
                        this.f61045 = iM48493 == 172;
                        if (iM48493 == 64 || iM48493 == 65) {
                            this.f61055 = iM48493 == 65;
                            this.f61052 = 1;
                            c21288.m48497()[0] = -84;
                            c21288.m48497()[1] = (byte) (this.f61055 ? 65 : 64);
                            this.f61046 = 2;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArrM48497 = c21288.m48497();
                int iMin = Math.min(c21287.m48486(), 16 - this.f61046);
                c21287.m48490(this.f61046, iMin, bArrM48497);
                int i2 = this.f61046 + iMin;
                this.f61046 = i2;
                if (i2 == 16) {
                    C14573 c14573 = this.f61051;
                    c14573.m35167(0);
                    C3204 c3204M46773 = C20358.m46773(c14573);
                    int i3 = c3204M46773.f10448;
                    C15648 c15648 = this.f61048;
                    if (c15648 == null || 2 != c15648.f50843 || i3 != c15648.f50829 || !"audio/ac4".equals(c15648.f50848)) {
                        C20124 c20124 = new C20124();
                        c20124.m46309(this.f61057);
                        c20124.m46327(this.f61056);
                        c20124.m46315("audio/ac4");
                        c20124.m46329(2);
                        c20124.m46332(i3);
                        c20124.m46321(this.f61047);
                        c20124.m46311(this.f61059);
                        C15648 c15648M46295 = c20124.m46295();
                        this.f61048 = c15648M46295;
                        this.f61049.mo14384(c15648M46295);
                    }
                    this.f61054 = c3204M46773.f10447;
                    this.f61053 = (((long) c3204M46773.f10449) * 1000000) / ((long) this.f61048.f50829);
                    c21288.m48510(0);
                    this.f61049.mo14381(16, c21288);
                    this.f61052 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c21287.m48486(), this.f61054 - this.f61046);
                this.f61049.mo14381(iMin2, c21287);
                int i4 = this.f61046 + iMin2;
                this.f61046 = i4;
                if (i4 == this.f61054) {
                    C20782.m47568(this.f61058 != -9223372036854775807L);
                    this.f61049.mo14383(this.f61058, 1, this.f61054, 0, null);
                    this.f61058 += this.f61053;
                    this.f61052 = 0;
                }
            }
        }
    }
}
