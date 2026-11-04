package l;

/* JADX INFO: renamed from: l.֡ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F8S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0155 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f1157;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1158;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f1159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15648 f1160;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f1161;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f1162;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21287 f1163;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f1164;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1165;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1166;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14573 f1167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f1168;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1169;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f1170;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1353(boolean z) {
    }

    public C0155(String str) {
        this(null, 0, str);
    }

    public C0155(String str, int i, String str2) {
        C14573 c14573 = new C14573(new byte[128], 128);
        this.f1167 = c14573;
        this.f1163 = new C21287(c14573.f45926);
        this.f1166 = 0;
        this.f1164 = -9223372036854775807L;
        this.f1162 = str;
        this.f1161 = i;
        this.f1168 = str2;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1349() {
        this.f1166 = 0;
        this.f1158 = 0;
        this.f1159 = false;
        this.f1164 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f1169 = c10857.m27596();
        this.f1157 = interfaceC12789.mo16658(c10857.m27595(), 1);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1350(int i, long j) {
        this.f1164 = j;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1352(C21287 c21287) {
        C20782.m47566(this.f1157);
        while (c21287.m48486() > 0) {
            int i = this.f1166;
            C21287 c21288 = this.f1163;
            if (i == 0) {
                while (c21287.m48486() > 0) {
                    if (!this.f1159) {
                        this.f1159 = c21287.m48493() == 11;
                    } else {
                        int iM48493 = c21287.m48493();
                        if (iM48493 == 119) {
                            this.f1159 = false;
                            this.f1166 = 1;
                            c21288.m48497()[0] = 11;
                            c21288.m48497()[1] = 119;
                            this.f1158 = 2;
                            break;
                        }
                        this.f1159 = iM48493 == 11;
                    }
                }
            } else if (i == 1) {
                byte[] bArrM48497 = c21288.m48497();
                int iMin = Math.min(c21287.m48486(), 128 - this.f1158);
                c21287.m48490(this.f1158, iMin, bArrM48497);
                int i2 = this.f1158 + iMin;
                this.f1158 = i2;
                if (i2 == 128) {
                    C14573 c14573 = this.f1167;
                    c14573.m35167(0);
                    C17374 c17374M37861 = C15882.m37861(c14573);
                    int i3 = c17374M37861.f56515;
                    int i4 = c17374M37861.f56517;
                    int i5 = c17374M37861.f56519;
                    String str = c17374M37861.f56520;
                    C15648 c15648 = this.f1160;
                    if (c15648 == null || i5 != c15648.f50843 || i4 != c15648.f50829 || !C17359.equals(str, c15648.f50848)) {
                        C20124 c20124 = new C20124();
                        c20124.m46309(this.f1169);
                        c20124.m46327(this.f1168);
                        c20124.m46315(str);
                        c20124.m46329(i5);
                        c20124.m46332(i4);
                        c20124.m46321(this.f1162);
                        c20124.m46311(this.f1161);
                        c20124.m46322(i3);
                        if ("audio/ac3".equals(str)) {
                            c20124.m46308(i3);
                        }
                        C15648 c15648M46295 = c20124.m46295();
                        this.f1160 = c15648M46295;
                        this.f1157.mo14384(c15648M46295);
                    }
                    this.f1165 = c17374M37861.f56516;
                    this.f1170 = (((long) c17374M37861.f56518) * 1000000) / ((long) this.f1160.f50829);
                    c21288.m48510(0);
                    this.f1157.mo14381(128, c21288);
                    this.f1166 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c21287.m48486(), this.f1165 - this.f1158);
                this.f1157.mo14381(iMin2, c21287);
                int i6 = this.f1158 + iMin2;
                this.f1158 = i6;
                if (i6 == this.f1165) {
                    C20782.m47568(this.f1164 != -9223372036854775807L);
                    this.f1157.mo14383(this.f1164, 1, this.f1165, 0, null);
                    this.f1164 += this.f1170;
                    this.f1166 = 0;
                }
            }
        }
    }
}
