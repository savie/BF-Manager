package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܺ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17065 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f55721;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21287 f55723;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f55724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f55725;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18010 f55726;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f55727;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f55728;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f55729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f55730 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f55731;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f55732;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f55733;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f55734;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
    }

    public C17065(String str, int i, String str2) {
        C21287 c21287 = new C21287(4);
        this.f55723 = c21287;
        c21287.m48497()[0] = -1;
        this.f55726 = new C18010();
        this.f55728 = -9223372036854775807L;
        this.f55721 = str;
        this.f55729 = i;
        this.f55722 = str2;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f55730 = 0;
        this.f55724 = 0;
        this.f55725 = false;
        this.f55728 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f55732 = c10857.m27596();
        this.f55734 = interfaceC12789.mo16658(c10857.m27595(), 1);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f55728 = j;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        C20782.m47566(this.f55734);
        while (c21287.m48486() > 0) {
            int i = this.f55730;
            C21287 c21288 = this.f55723;
            if (i == 0) {
                byte[] bArrM48497 = c21287.m48497();
                int iM48516 = c21287.m48516();
                int iM48509 = c21287.m48509();
                while (true) {
                    if (iM48516 < iM48509) {
                        byte b = bArrM48497[iM48516];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f55725 && (b & bo.k) == 224;
                        this.f55725 = z;
                        if (z2) {
                            c21287.m48510(iM48516 + 1);
                            this.f55725 = false;
                            c21288.m48497()[1] = bArrM48497[iM48516];
                            this.f55724 = 2;
                            this.f55730 = 1;
                            break;
                        }
                        iM48516++;
                    } else {
                        c21287.m48510(iM48509);
                        break;
                    }
                }
            } else if (i == 1) {
                int iMin = Math.min(c21287.m48486(), 4 - this.f55724);
                c21287.m48490(this.f55724, iMin, c21288.m48497());
                int i2 = this.f55724 + iMin;
                this.f55724 = i2;
                if (i2 >= 4) {
                    c21288.m48510(0);
                    int iM48500 = c21288.m48500();
                    C18010 c18010 = this.f55726;
                    if (!c18010.m41989(iM48500)) {
                        this.f55724 = 0;
                        this.f55730 = 1;
                    } else {
                        this.f55731 = c18010.f58964;
                        if (!this.f55727) {
                            this.f55733 = (((long) c18010.f58966) * 1000000) / ((long) c18010.f58967);
                            C20124 c20124 = new C20124();
                            c20124.m46309(this.f55732);
                            c20124.m46327(this.f55722);
                            c20124.m46315(c18010.f58969);
                            c20124.m46318(4096);
                            c20124.m46329(c18010.f58968);
                            c20124.m46332(c18010.f58967);
                            c20124.m46321(this.f55721);
                            c20124.m46311(this.f55729);
                            this.f55734.mo14384(c20124.m46295());
                            this.f55727 = true;
                        }
                        c21288.m48510(0);
                        this.f55734.mo14381(4, c21288);
                        this.f55730 = 2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c21287.m48486(), this.f55731 - this.f55724);
                this.f55734.mo14381(iMin2, c21287);
                int i3 = this.f55724 + iMin2;
                this.f55724 = i3;
                if (i3 >= this.f55731) {
                    C20782.m47568(this.f55728 != -9223372036854775807L);
                    this.f55734.mo14383(this.f55728, 1, this.f55731, 0, null);
                    this.f55728 += this.f55733;
                    this.f55724 = 0;
                    this.f55730 = 0;
                }
            }
        }
    }
}
