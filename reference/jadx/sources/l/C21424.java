package l;

import com.alipay.sdk.m.y.l;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21424 extends C17191 {

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f69672 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f69671 = true;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public int f69674 = 0;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public boolean f69673 = false;

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30462() {
        return true;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int m47994() {
        return this.f69672;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47996(int i) {
        this.f69672 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47998(boolean z) {
        this.f69671 = z;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47993() {
        return this.f69671;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo30473() {
        return this.f69673;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo30469() {
        return this.f69673;
    }

    @Override // l.C17191, l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final void mo1745(C20719 c20719, HashMap map) {
        super.mo1745(c20719, map);
        C21424 c21424 = (C21424) c20719;
        this.f69672 = c21424.f69672;
        this.f69671 = c21424.f69671;
        this.f69674 = c21424.f69674;
    }

    @Override // l.C20719
    public final String toString() {
        String string = "[Barrier] " + m46643() + " {";
        for (int i = 0; i < this.f54816; i++) {
            C20719 c20719 = this.f54815[i];
            if (i > 0) {
                string = C15489.m37076(string, ", ");
            }
            StringBuilder sbM23356 = C9023.m23356(string);
            sbM23356.append(c20719.m46643());
            string = sbM23356.toString();
        }
        return C15489.m37076(string, l.d);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m48000() {
        for (int i = 0; i < this.f54816; i++) {
            C20719 c20719 = this.f54815[i];
            int i2 = this.f69672;
            if (i2 == 0 || i2 == 1) {
                c20719.m46587(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c20719.m46587(1, true);
            }
        }
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final void mo1744(C5196 c5196, boolean z) {
        boolean z2;
        int i;
        int i2;
        C8725[] c8725Arr = this.f67398;
        C8725 c8725 = this.f67385;
        c8725Arr[0] = c8725;
        int i3 = 2;
        C8725 c8726 = this.f67392;
        c8725Arr[2] = c8726;
        C8725 c8727 = this.f67421;
        c8725Arr[1] = c8727;
        C8725 c8728 = this.f67387;
        c8725Arr[3] = c8728;
        for (C8725 c8729 : c8725Arr) {
            c8729.f29975 = c5196.m14364(c8729);
        }
        int i4 = this.f69672;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C8725 c87210 = c8725Arr[i4];
        if (!this.f69673) {
            m47997();
        }
        if (this.f69673) {
            this.f69673 = false;
            int i5 = this.f69672;
            if (i5 == 0 || i5 == 1) {
                c5196.m14367(c8725.f29975, this.f67372);
                c5196.m14367(c8727.f29975, this.f67372);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c5196.m14367(c8726.f29975, this.f67415);
                    c5196.m14367(c8728.f29975, this.f67415);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f54816) {
                z2 = false;
                break;
            }
            C20719 c20719 = this.f54815[i6];
            if ((this.f69671 || c20719.mo30462()) && ((((i2 = this.f69672) == 0 || i2 == 1) && c20719.f67434[0] == EnumC7313.MATCH_CONSTRAINT && c20719.f67385.f29981 != null && c20719.f67421.f29981 != null) || ((i2 == 2 || i2 == 3) && c20719.f67434[1] == EnumC7313.MATCH_CONSTRAINT && c20719.f67392.f29981 != null && c20719.f67387.f29981 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c8725.m22581() || c8727.m22581();
        boolean z4 = c8726.m22581() || c8728.m22581();
        int i7 = !(!z2 && (((i = this.f69672) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f54816) {
            C20719 c207110 = this.f54815[i8];
            if (this.f69671 || c207110.mo30462()) {
                C15075 c15075M14364 = c5196.m14364(c207110.f67398[this.f69672]);
                C8725[] c8725Arr2 = c207110.f67398;
                int i9 = this.f69672;
                C8725 c87211 = c8725Arr2[i9];
                c87211.f29975 = c15075M14364;
                C8725 c87212 = c87211.f29981;
                int i10 = (c87212 == null || c87212.f29983 != this) ? 0 : c87211.f29979;
                if (i9 == 0 || i9 == i3) {
                    C15075 c15075 = c87210.f29975;
                    int i11 = this.f69674 - i10;
                    C13664 c13664M14362 = c5196.m14362();
                    C15075 c15075M14373 = c5196.m14373();
                    c15075M14373.f49150 = 0;
                    c13664M14362.m33376(c15075, c15075M14364, c15075M14373, i11);
                    c5196.m14366(c13664M14362);
                } else {
                    C15075 c15076 = c87210.f29975;
                    int i12 = this.f69674 + i10;
                    C13664 c13664M14363 = c5196.m14362();
                    C15075 c15075M14374 = c5196.m14373();
                    c15075M14374.f49150 = 0;
                    c13664M14363.m33373(c15076, c15075M14364, c15075M14374, i12);
                    c5196.m14366(c13664M14363);
                }
                c5196.m14369(c87210.f29975, c15075M14364, this.f69674 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f69672;
        if (i13 == 0) {
            c5196.m14369(c8727.f29975, c8725.f29975, 0, 8);
            c5196.m14369(c8725.f29975, this.f67433.f67421.f29975, 0, 4);
            c5196.m14369(c8725.f29975, this.f67433.f67385.f29975, 0, 0);
            return;
        }
        if (i13 == 1) {
            c5196.m14369(c8725.f29975, c8727.f29975, 0, 8);
            c5196.m14369(c8725.f29975, this.f67433.f67385.f29975, 0, 4);
            c5196.m14369(c8725.f29975, this.f67433.f67421.f29975, 0, 0);
        } else if (i13 == 2) {
            c5196.m14369(c8728.f29975, c8726.f29975, 0, 8);
            c5196.m14369(c8726.f29975, this.f67433.f67387.f29975, 0, 4);
            c5196.m14369(c8726.f29975, this.f67433.f67392.f29975, 0, 0);
        } else if (i13 == 3) {
            c5196.m14369(c8726.f29975, c8728.f29975, 0, 8);
            c5196.m14369(c8726.f29975, this.f67433.f67392.f29975, 0, 4);
            c5196.m14369(c8726.f29975, this.f67433.f67387.f29975, 0, 0);
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m47995(int i) {
        this.f69674 = i;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m48001() {
        return this.f69674;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m47999() {
        int i = this.f69672;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47997() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f54816;
            if (i4 >= i) {
                break;
            }
            C20719 c20719 = this.f54815[i4];
            if ((this.f69671 || c20719.mo30462()) && ((((i2 = this.f69672) == 0 || i2 == 1) && !c20719.mo30473()) || (((i3 = this.f69672) == 2 || i3 == 3) && !c20719.mo30469()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f54816; i5++) {
            C20719 c207110 = this.f54815[i5];
            if (this.f69671 || c207110.mo30462()) {
                if (!z2) {
                    int i6 = this.f69672;
                    if (i6 == 0) {
                        iMax = c207110.mo30461(EnumC19308.LEFT).m22579();
                    } else if (i6 == 1) {
                        iMax = c207110.mo30461(EnumC19308.RIGHT).m22579();
                    } else if (i6 == 2) {
                        iMax = c207110.mo30461(EnumC19308.TOP).m22579();
                    } else if (i6 == 3) {
                        iMax = c207110.mo30461(EnumC19308.BOTTOM).m22579();
                    }
                    z2 = true;
                }
                int i7 = this.f69672;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c207110.mo30461(EnumC19308.LEFT).m22579());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c207110.mo30461(EnumC19308.RIGHT).m22579());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c207110.mo30461(EnumC19308.TOP).m22579());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c207110.mo30461(EnumC19308.BOTTOM).m22579());
                }
            }
        }
        int i8 = iMax + this.f69674;
        int i9 = this.f69672;
        if (i9 == 0 || i9 == 1) {
            m46586(i8, i8);
        } else {
            m46624(i8, i8);
        }
        this.f69673 = true;
        return true;
    }
}
