package l;

import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.۟᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8116 implements InterfaceC22792 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26785;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f26786 = new C21287(32);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f26787;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26788;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC0658 f26789;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26790;

    public C8116(InterfaceC0658 interfaceC0658) {
        this.f26789 = interfaceC0658;
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ */
    public final void mo18563(C1150 c1150, InterfaceC12789 interfaceC12789, C10857 c10857) {
        this.f26789.mo2878(c1150, interfaceC12789, c10857);
        this.f26787 = true;
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ */
    public final void mo18561() {
        this.f26787 = true;
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ */
    public final void mo18562(int i, C21287 c21287) {
        int iM48516;
        boolean z = (i & 1) != 0;
        if (z) {
            iM48516 = c21287.m48516() + c21287.m48493();
        } else {
            iM48516 = -1;
        }
        if (this.f26787) {
            if (!z) {
                return;
            }
            this.f26787 = false;
            c21287.m48510(iM48516);
            this.f26785 = 0;
        }
        while (c21287.m48486() > 0) {
            int i2 = this.f26785;
            C21287 c21288 = this.f26786;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM48493 = c21287.m48493();
                    c21287.m48510(c21287.m48516() - 1);
                    if (iM48493 == 255) {
                        this.f26787 = true;
                        return;
                    }
                }
                int iMin = Math.min(c21287.m48486(), 3 - this.f26785);
                c21287.m48490(this.f26785, iMin, c21288.m48497());
                int i3 = this.f26785 + iMin;
                this.f26785 = i3;
                if (i3 == 3) {
                    c21288.m48510(0);
                    c21288.m48517(3);
                    c21288.m48503(1);
                    int iM48494 = c21288.m48493();
                    int iM48495 = c21288.m48493();
                    this.f26790 = (iM48494 & 128) != 0;
                    this.f26788 = (((iM48494 & 15) << 8) | iM48495) + 3;
                    int iM48513 = c21288.m48513();
                    int i4 = this.f26788;
                    if (iM48513 < i4) {
                        c21288.m48489(Math.min(o.a.b, Math.max(i4, c21288.m48513() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c21287.m48486(), this.f26788 - this.f26785);
                c21287.m48490(this.f26785, iMin2, c21288.m48497());
                int i5 = this.f26785 + iMin2;
                this.f26785 = i5;
                int i6 = this.f26788;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f26790) {
                        if (C7116.m19465(0, c21288.m48497(), this.f26788, -1) != 0) {
                            this.f26787 = true;
                            return;
                        }
                        c21288.m48517(this.f26788 - 4);
                    } else {
                        c21288.m48517(i6);
                    }
                    c21288.m48510(0);
                    this.f26789.mo2879(c21288);
                    this.f26785 = 0;
                }
            }
        }
    }
}
