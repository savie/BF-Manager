package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.۫ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 359G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12800 extends AbstractC15037 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f40964 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20455[] f40965;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20455 f40966;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4047 f40967;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C4047 f40968;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4047 f40969;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f40970;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f40971;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20455 f40972;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C4047 f40973;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f40974;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f40975;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10562 f40976;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4047 f40977;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20455 f40978;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f40979;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7776 f40980;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20455[] f40981;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f40982;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f40983;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f40984;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f40985;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40986;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f40987;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f40988;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int f40989;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f40990;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20455 f40991;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10562 f40992;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final String f40993;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C10562 f40994;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int f40995;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f40996;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f40997;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C24185 f40998;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f40999;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20455 f41000;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20455 f41001;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f41002;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f41003;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f41004;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C23243 f41005;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21751 f41006;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f41007;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4047 f41008;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f41009;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21751 f41010;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C4047 f41011;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f41012;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f41013;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int[] f41014;

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final void mo10806() {
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10810() {
    }

    public C12800(C23243 c23243, int i, String str, String str2, String str3, String[] strArr, int i2, C7776 c7776) {
        super(589824, null);
        this.f41008 = new C4047();
        this.f41005 = c23243;
        this.f40982 = "<init>".equals(str) ? 262144 | i : i;
        this.f40989 = c23243.m52265(str);
        this.f40993 = str;
        this.f41013 = c23243.m52265(str2);
        this.f40984 = str2;
        this.f40995 = str3 == null ? 0 : c23243.m52265(str3);
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f40975 = length;
            this.f40996 = new int[length];
            for (int i3 = 0; i3 < this.f40975; i3++) {
                this.f40996[i3] = c23243.m52248(strArr[i3]).f53507;
            }
        } else {
            this.f40975 = 0;
            this.f40996 = null;
        }
        this.f41002 = i2;
        this.f40980 = c7776;
        if (i2 != 0) {
            int iM10131 = C3105.m10131(str2) >> 2;
            iM10131 = (i & 8) != 0 ? iM10131 - 1 : iM10131;
            this.f40983 = iM10131;
            this.f40974 = iM10131;
            C10562 c10562 = new C10562();
            this.f40994 = c10562;
            mo10800(c10562);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m31743() {
        return this.f40971 > 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31744() {
        return this.f40970;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10812(int i, String str) {
        if (this.f40968 == null) {
            this.f40968 = new C4047();
        }
        this.f40985++;
        C4047 c4047 = this.f40968;
        c4047.m13021(str == null ? 0 : this.f41005.m52265(str));
        c4047.m13021(i);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10782() {
        C4047 c4047 = new C4047();
        this.f40967 = c4047;
        return new C20455(this.f41005, false, c4047, null);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10786(String str, boolean z) {
        if (z) {
            C20455 c20455M46878 = C20455.m46878(this.f41005, str, this.f41001);
            this.f41001 = c20455M46878;
            return c20455M46878;
        }
        C20455 c20455M46879 = C20455.m46878(this.f41005, str, this.f41000);
        this.f41000 = c20455M46879;
        return c20455M46879;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC3301 mo10805(int i, C20259 c20259, String str, boolean z) {
        if (z) {
            C20455 c20455M46877 = C20455.m46877(this.f41005, i, c20259, str, this.f40966);
            this.f40966 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(this.f41005, i, c20259, str, this.f40978);
        this.f40978 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10794(int i, boolean z) {
        if (z) {
            this.f40987 = i;
        } else {
            this.f40986 = i;
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10783(int i, String str, boolean z) {
        String str2 = this.f40984;
        if (z) {
            if (this.f40981 == null) {
                this.f40981 = new C20455[C3105.m10128(str2)];
            }
            C20455[] c20455Arr = this.f40981;
            C20455 c20455M46878 = C20455.m46878(this.f41005, str, c20455Arr[i]);
            c20455Arr[i] = c20455M46878;
            return c20455M46878;
        }
        if (this.f40965 == null) {
            this.f40965 = new C20455[C3105.m10128(str2)];
        }
        C20455[] c20455Arr2 = this.f40965;
        C20455 c20455M46879 = C20455.m46878(this.f41005, str, c20455Arr2[i]);
        c20455Arr2[i] = c20455M46879;
        return c20455M46879;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10804(C24185 c24185) {
        c24185.getClass();
        c24185.f78328 = this.f40998;
        this.f40998 = c24185;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10789(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        int i4;
        int i5 = this.f41002;
        if (i5 == 4) {
            return;
        }
        int i6 = this.f40982;
        C7776 c7776 = this.f40980;
        String str = this.f40984;
        if (i5 == 3) {
            C10562 c10562 = this.f40992;
            C13741 c13741 = c10562.f33561;
            if (c13741 == null) {
                C9266 c9266 = new C9266(c10562, c7776);
                c10562.f33561 = c9266;
                c9266.m33589(this.f41005, i6, str, i2);
                this.f40992.f33561.m33587(this);
            } else {
                if (i == -1) {
                    c13741.m33590(this.f41005, i2, objArr, i3, objArr2);
                }
                this.f40992.f33561.m33587(this);
            }
        } else {
            C4047 c4047 = this.f41008;
            if (i == -1) {
                if (this.f41014 == null) {
                    int iM10131 = C3105.m10131(str) >> 2;
                    C13741 c13742 = new C13741(new C10562(), c7776);
                    c13742.m33589(this.f41005, i6, str, iM10131);
                    c13742.m33587(this);
                }
                this.f40974 = i2;
                m31738(c4047.f13788, i2, i3);
                int i7 = 0;
                int i8 = 3;
                while (i7 < i2) {
                    this.f40988[i8] = C13741.m33577(this.f41005, objArr[i7]);
                    i7++;
                    i8++;
                }
                int i9 = 0;
                while (i9 < i3) {
                    this.f40988[i8] = C13741.m33577(this.f41005, objArr2[i9]);
                    i9++;
                    i8++;
                }
                m31742();
            } else {
                if (this.f41005.m52257() < 50) {
                    throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
                }
                if (this.f41011 == null) {
                    this.f41011 = new C4047();
                    i4 = c4047.f13788;
                } else {
                    i4 = (c4047.f13788 - this.f40997) - 1;
                    if (i4 < 0) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                }
                if (i == 0) {
                    this.f40974 = i2;
                    C4047 c4048 = this.f41011;
                    c4048.m13014(255);
                    c4048.m13021(i4);
                    c4048.m13021(i2);
                    for (int i10 = 0; i10 < i2; i10++) {
                        m31737(objArr[i10]);
                    }
                    this.f41011.m13021(i3);
                    for (int i11 = 0; i11 < i3; i11++) {
                        m31737(objArr2[i11]);
                    }
                } else if (i == 1) {
                    this.f40974 += i2;
                    C4047 c4049 = this.f41011;
                    c4049.m13014(i2 + 251);
                    c4049.m13021(i4);
                    for (int i12 = 0; i12 < i2; i12++) {
                        m31737(objArr[i12]);
                    }
                } else if (i == 2) {
                    this.f40974 -= i2;
                    C4047 c40410 = this.f41011;
                    c40410.m13014(251 - i2);
                    c40410.m13021(i4);
                } else if (i != 3) {
                    if (i == 4) {
                        if (i4 < 64) {
                            this.f41011.m13014(i4 + 64);
                        } else {
                            C4047 c40411 = this.f41011;
                            c40411.m13014(247);
                            c40411.m13021(i4);
                        }
                        m31737(objArr2[0]);
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (i4 < 64) {
                    this.f41011.m13014(i4);
                } else {
                    C4047 c40412 = this.f41011;
                    c40412.m13014(251);
                    c40412.m13021(i4);
                }
                this.f40997 = c4047.f13788;
                this.f40971++;
            }
        }
        if (i5 == 2) {
            this.f40999 = i3;
            for (int i13 = 0; i13 < i3; i13++) {
                if (objArr2[i13] == 4 || objArr2[i13] == 3) {
                    this.f40999++;
                }
            }
            int i14 = this.f40999;
            if (i14 > this.f41009) {
                this.f41009 = i14;
            }
        }
        this.f41003 = Math.max(this.f41003, i3);
        this.f40983 = Math.max(this.f40983, this.f40974);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10787(int i) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        c4047.m13014(i);
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i2 = this.f41002;
            if (i2 == 4 || i2 == 3) {
                c10562.f33561.mo24455(i, 0, (AbstractC16529) null, (C23243) null);
            } else {
                int i3 = this.f40999 + f40964[i];
                if (i3 > this.f41009) {
                    this.f41009 = i3;
                }
                this.f40999 = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m31732();
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10811(int i, int i2) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        if (i == 17) {
            c4047.m13022(i, i2);
        } else {
            c4047.m13015(i, i2);
        }
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i3 = this.f41002;
            if (i3 == 4 || i3 == 3) {
                c10562.f33561.mo24455(i, i2, (AbstractC16529) null, (C23243) null);
            } else if (i != 188) {
                int i4 = this.f40999 + 1;
                if (i4 > this.f41009) {
                    this.f41009 = i4;
                }
                this.f40999 = i4;
            }
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩸ */
    public final void mo10814(int i, int i2) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        if (i2 < 4 && i != 169) {
            c4047.m13014((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c4047.m13014(196);
            c4047.m13022(i, i2);
        } else {
            c4047.m13015(i, i2);
        }
        C10562 c10562 = this.f40992;
        int i3 = this.f41002;
        if (c10562 != null) {
            if (i3 == 4 || i3 == 3) {
                c10562.f33561.mo24455(i, i2, (AbstractC16529) null, (C23243) null);
            } else if (i == 169) {
                c10562.f33569 = (short) (c10562.f33569 | 64);
                c10562.f33571 = (short) this.f40999;
                m31732();
            } else {
                int i4 = this.f40999 + f40964[i];
                if (i4 > this.f41009) {
                    this.f41009 = i4;
                }
                this.f40999 = i4;
            }
        }
        if (i3 != 0) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f40983) {
                this.f40983 = i5;
            }
        }
        if (i < 54 || i3 != 4 || this.f41010 == null) {
            return;
        }
        mo10800(new C10562());
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final void mo10808(int i, String str) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52248 = this.f41005.m52248(str);
        c4047.m13022(i, c17275M52248.f53507);
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i2 = this.f41002;
            if (i2 == 4 || i2 == 3) {
                c10562.f33561.mo24455(i, this.f41012, c17275M52248, this.f41005);
            } else if (i == 187) {
                int i3 = this.f40999 + 1;
                if (i3 > this.f41009) {
                    this.f41009 = i3;
                }
                this.f40999 = i3;
            }
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10796(String str, int i, String str2, String str3) {
        int i2;
        int i3;
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52249 = this.f41005.m52249(str, str2, str3);
        c4047.m13022(i, c17275M52249.f53507);
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i4 = this.f41002;
            if (i4 == 4 || i4 == 3) {
                c10562.f33561.mo24455(i, 0, c17275M52249, this.f41005);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case 178:
                    i2 = this.f40999 + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case 179:
                    i3 = this.f40999;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case 180:
                    i2 = this.f40999 + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.f40999;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.f41009) {
                this.f41009 = i2;
            }
            this.f40999 = i2;
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10792(int i, String str, String str2, String str3, boolean z) {
        int i2;
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52250 = this.f41005.m52250(str, str2, str3, z);
        String str4 = c17275M52250.f53504;
        int i3 = c17275M52250.f53507;
        if (i == 185) {
            c4047.m13022(185, i3);
            if (c17275M52250.f53503 == 0) {
                c17275M52250.f53503 = C3105.m10131(str4);
            }
            c4047.m13015(c17275M52250.f53503 >> 2, 0);
        } else {
            c4047.m13022(i, i3);
        }
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i4 = this.f41002;
            if (i4 != 4 && i4 != 3) {
                if (c17275M52250.f53503 == 0) {
                    c17275M52250.f53503 = C3105.m10131(str4);
                }
                int i5 = c17275M52250.f53503;
                int i6 = (i5 & 3) - (i5 >> 2);
                if (i == 184) {
                    i2 = this.f40999 + i6 + 1;
                } else {
                    i2 = this.f40999 + i6;
                }
                if (i2 > this.f41009) {
                    this.f41009 = i2;
                }
                this.f40999 = i2;
                return;
            }
            c10562.f33561.mo24455(i, 0, c17275M52250, this.f41005);
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10798(String str, String str2, C4597 c4597, Object... objArr) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52251 = this.f41005.m52251(str, str2, c4597, objArr);
        c4047.m13022(186, c17275M52251.f53507);
        c4047.m13021(0);
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i = this.f41002;
            if (i != 4 && i != 3) {
                if (c17275M52251.f53503 == 0) {
                    c17275M52251.f53503 = C3105.m10131(c17275M52251.f53504);
                }
                int i2 = c17275M52251.f53503;
                int i3 = this.f40999 + ((i2 & 3) - (i2 >> 2)) + 1;
                if (i3 > this.f41009) {
                    this.f41009 = i3;
                }
                this.f40999 = i3;
                return;
            }
            c10562.f33561.mo24455(186, 0, c17275M52251, this.f41005);
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10793(int i, C10562 c10562) {
        boolean z;
        C4047 c4047 = this.f41008;
        int i2 = c4047.f13788;
        this.f41012 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c10562.f33569 & 4) == 0 || c10562.f33559 - i2 >= -32768) {
            if (i3 != i) {
                c4047.m13014(i);
                c10562.m27020(c4047, c4047.f13788 - 1, true);
            } else {
                c4047.m13014(i3);
                c10562.m27020(c4047, c4047.f13788 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c4047.m13014(200);
            } else {
                if (i3 == 168) {
                    c4047.m13014(201);
                } else {
                    c4047.m13014(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                    c4047.m13021(8);
                    c4047.m13014(220);
                    this.f40970 = true;
                    z = true;
                }
                c10562.m27020(c4047, c4047.f13788 - 1, true);
            }
            z = false;
            c10562.m27020(c4047, c4047.f13788 - 1, true);
        }
        C10562 c10563 = this.f40992;
        if (c10563 != null) {
            C10562 c10564 = null;
            int i4 = this.f41002;
            if (i4 == 4) {
                c10563.f33561.mo24455(i3, 0, (AbstractC16529) null, (C23243) null);
                C10562 c10562M27017 = c10562.m27017();
                c10562M27017.f33569 = (short) (c10562M27017.f33569 | 2);
                m31734(0, c10562);
                if (i3 != 167) {
                    c10564 = new C10562();
                }
            } else if (i4 == 3) {
                c10563.f33561.mo24455(i3, 0, (AbstractC16529) null, (C23243) null);
            } else {
                int[] iArr = f40964;
                if (i4 == 2) {
                    this.f40999 += iArr[i3];
                } else if (i3 == 168) {
                    short s = c10562.f33569;
                    if ((s & 32) == 0) {
                        c10562.f33569 = (short) (s | 32);
                        this.f41004 = true;
                    }
                    c10563.f33569 = (short) (c10563.f33569 | 16);
                    m31734(this.f40999 + 1, c10562);
                    c10564 = new C10562();
                } else {
                    int i5 = this.f40999 + iArr[i3];
                    this.f40999 = i5;
                    m31734(i5, c10562);
                }
            }
            if (c10564 != null) {
                if (z) {
                    c10564.f33569 = (short) (c10564.f33569 | 2);
                }
                mo10800(c10564);
            }
            if (i3 == 167) {
                m31732();
            }
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10800(C10562 c10562) {
        boolean z = this.f40970;
        C4047 c4047 = this.f41008;
        this.f40970 = z | c10562.m27024(c4047.f13787, this.f41011, c4047.f13788);
        short s = c10562.f33569;
        if ((s & 1) != 0) {
            return;
        }
        int i = this.f41002;
        if (i == 4) {
            C10562 c10563 = this.f40992;
            if (c10563 != null) {
                if (c10562.f33559 == c10563.f33559) {
                    c10563.f33569 = (short) ((s & 2) | c10563.f33569);
                    c10562.f33561 = c10563.f33561;
                    return;
                }
                m31734(0, c10562);
            }
            C10562 c10564 = this.f40976;
            if (c10564 != null) {
                if (c10562.f33559 == c10564.f33559) {
                    c10564.f33569 = (short) (c10564.f33569 | (c10562.f33569 & 2));
                    c10562.f33561 = c10564.f33561;
                    this.f40992 = c10564;
                    return;
                }
                c10564.f33562 = c10562;
            }
            this.f40976 = c10562;
            this.f40992 = c10562;
            c10562.f33561 = new C13741(c10562, this.f40980);
            return;
        }
        if (i == 3) {
            C10562 c10565 = this.f40992;
            if (c10565 == null) {
                this.f40992 = c10562;
                return;
            } else {
                c10565.f33561.f43603 = c10562;
                return;
            }
        }
        if (i == 1) {
            C10562 c10566 = this.f40992;
            if (c10566 != null) {
                c10566.f33565 = (short) this.f41009;
                m31734(this.f40999, c10562);
            }
            this.f40992 = c10562;
            this.f40999 = 0;
            this.f41009 = 0;
            C10562 c10567 = this.f40976;
            if (c10567 != null) {
                c10567.f33562 = c10562;
            }
            this.f40976 = c10562;
            return;
        }
        if (i == 2 && this.f40992 == null) {
            this.f40992 = c10562;
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10795(Object obj) {
        char cCharAt;
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52247 = this.f41005.m52247(obj);
        int i = c17275M52247.f53507;
        int i2 = c17275M52247.f53505;
        boolean z = i2 == 5 || i2 == 6 || (i2 == 17 && ((cCharAt = c17275M52247.f53504.charAt(0)) == 'J' || cCharAt == 'D'));
        if (z) {
            c4047.m13022(20, i);
        } else if (i >= 256) {
            c4047.m13022(19, i);
        } else {
            c4047.m13015(18, i);
        }
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i3 = this.f41002;
            if (i3 == 4 || i3 == 3) {
                c10562.f33561.mo24455(18, 0, c17275M52247, this.f41005);
                return;
            }
            int i4 = this.f40999 + (z ? 2 : 1);
            if (i4 > this.f41009) {
                this.f41009 = i4;
            }
            this.f40999 = i4;
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10788(int i, int i2) {
        int i3;
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        if (i > 255 || i2 > 127 || i2 < -128) {
            c4047.m13014(196);
            c4047.m13022(132, i);
            c4047.m13021(i2);
        } else {
            c4047.m13014(132);
            c4047.m13015(i, i2);
        }
        C10562 c10562 = this.f40992;
        int i4 = this.f41002;
        if (c10562 != null && (i4 == 4 || i4 == 3)) {
            c10562.f33561.mo24455(132, i, (AbstractC16529) null, (C23243) null);
        }
        if (i4 == 0 || (i3 = i + 1) <= this.f40983) {
            return;
        }
        this.f40983 = i3;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10790(int i, int i2, C10562 c10562, C10562... c10562Arr) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        c4047.m13014(170);
        c4047.m13018(0, (4 - (c4047.f13788 % 4)) % 4, (byte[]) null);
        c10562.m27020(c4047, this.f41012, true);
        c4047.m13023(i);
        c4047.m13023(i2);
        for (C10562 c10563 : c10562Arr) {
            c10563.m27020(c4047, this.f41012, true);
        }
        m31733(c10562, c10562Arr);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10802(C10562 c10562, int[] iArr, C10562[] c10562Arr) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        c4047.m13014(171);
        c4047.m13018(0, (4 - (c4047.f13788 % 4)) % 4, (byte[]) null);
        c10562.m27020(c4047, this.f41012, true);
        c4047.m13023(c10562Arr.length);
        for (int i = 0; i < c10562Arr.length; i++) {
            c4047.m13023(iArr[i]);
            c10562Arr[i].m27020(c4047, this.f41012, true);
        }
        m31733(c10562, c10562Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31733(C10562 c10562, C10562[] c10562Arr) {
        C10562 c10563 = this.f40992;
        if (c10563 != null) {
            int i = this.f41002;
            if (i == 4) {
                c10563.f33561.mo24455(171, 0, (AbstractC16529) null, (C23243) null);
                m31734(0, c10562);
                C10562 c10562M27017 = c10562.m27017();
                c10562M27017.f33569 = (short) (c10562M27017.f33569 | 2);
                for (C10562 c10564 : c10562Arr) {
                    m31734(0, c10564);
                    C10562 c10562M27018 = c10564.m27017();
                    c10562M27018.f33569 = (short) (c10562M27018.f33569 | 2);
                }
            } else if (i == 1) {
                int i2 = this.f40999 - 1;
                this.f40999 = i2;
                m31734(i2, c10562);
                for (C10562 c10565 : c10562Arr) {
                    m31734(this.f40999, c10565);
                }
            }
            m31732();
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10791(int i, String str) {
        C4047 c4047 = this.f41008;
        this.f41012 = c4047.f13788;
        C17275 c17275M52248 = this.f41005.m52248(str);
        c4047.m13022(197, c17275M52248.f53507);
        c4047.m13014(i);
        C10562 c10562 = this.f40992;
        if (c10562 != null) {
            int i2 = this.f41002;
            if (i2 == 4 || i2 == 3) {
                c10562.f33561.mo24455(197, i, c17275M52248, this.f41005);
            } else {
                this.f40999 = (1 - i) + this.f40999;
            }
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10784(int i, C20259 c20259, String str, boolean z) {
        if (z) {
            C20455 c20455M46877 = C20455.m46877(this.f41005, (i & (-16776961)) | (this.f41012 << 8), c20259, str, this.f40991);
            this.f40991 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(this.f41005, (i & (-16776961)) | (this.f41012 << 8), c20259, str, this.f40972);
        this.f40972 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10801(C10562 c10562, C10562 c10563, C10562 c10564, String str) {
        C21751 c21751 = new C21751(c10562, c10563, c10564, str != null ? this.f41005.m52248(str).f53507 : 0, str);
        if (this.f41010 == null) {
            this.f41010 = c21751;
        } else {
            this.f41006.f69370 = c21751;
        }
        this.f41006 = c21751;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC3301 mo10809(int i, C20259 c20259, String str, boolean z) {
        if (z) {
            C20455 c20455M46877 = C20455.m46877(this.f41005, i, c20259, str, this.f40991);
            this.f40991 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(this.f41005, i, c20259, str, this.f40972);
        this.f40972 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10797(String str, String str2, String str3, C10562 c10562, C10562 c10563, int i) {
        if (str3 != null) {
            if (this.f40973 == null) {
                this.f40973 = new C4047();
            }
            this.f41007++;
            C4047 c4047 = this.f40973;
            c4047.m13021(c10562.f33559);
            c4047.m13021(c10563.f33559 - c10562.f33559);
            c4047.m13021(this.f41005.m52265(str));
            c4047.m13021(this.f41005.m52265(str3));
            c4047.m13021(i);
        }
        if (this.f40977 == null) {
            this.f40977 = new C4047();
        }
        this.f40990++;
        C4047 c4048 = this.f40977;
        c4048.m13021(c10562.f33559);
        c4048.m13021(c10563.f33559 - c10562.f33559);
        c4048.m13021(this.f41005.m52265(str));
        c4048.m13021(this.f41005.m52265(str2));
        c4048.m13021(i);
        if (this.f41002 != 0) {
            char cCharAt = str2.charAt(0);
            int i2 = i + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i2 > this.f40983) {
                this.f40983 = i2;
            }
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10785(int i, C20259 c20259, C10562[] c10562Arr, C10562[] c10562Arr2, int[] iArr, String str, boolean z) {
        C4047 c4047 = new C4047();
        c4047.m13014(i >>> 24);
        c4047.m13021(c10562Arr.length);
        for (int i2 = 0; i2 < c10562Arr.length; i2++) {
            c4047.m13021(c10562Arr[i2].f33559);
            c4047.m13021(c10562Arr2[i2].f33559 - c10562Arr[i2].f33559);
            c4047.m13021(iArr[i2]);
        }
        C20259.m46532(c20259, c4047);
        c4047.m13021(this.f41005.m52265(str));
        c4047.m13021(0);
        if (z) {
            C20455 c20455 = new C20455(this.f41005, true, c4047, this.f40991);
            this.f40991 = c20455;
            return c20455;
        }
        C20455 c20456 = new C20455(this.f41005, true, c4047, this.f40972);
        this.f40972 = c20456;
        return c20456;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10813(int i, C10562 c10562) {
        if (this.f40969 == null) {
            this.f40969 = new C4047();
        }
        this.f40979++;
        this.f40969.m13021(c10562.f33559);
        this.f40969.m13021(i);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final void mo10807(int i, int i2) {
        C4047 c4047;
        C21751 c21751;
        C21751 c21752;
        C4047 c4048 = this.f41008;
        if (c4048.f13788 > 65535) {
            return;
        }
        C7776 c7776 = this.f40980;
        C10562 c10562 = this.f40994;
        int i3 = this.f41002;
        if (i3 != 4) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f41003 = this.f41009;
                    return;
                } else {
                    this.f41003 = i;
                    this.f40983 = i2;
                    return;
                }
            }
            if (this.f41004) {
                c10562.m27023((short) 1, this.f41010, c7776);
                short s = 1;
                for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                    for (C10562 c10563 = c10562; c10563 != null; c10563 = c10563.f33562) {
                        if ((c10563.f33569 & 16) != 0 && c10563.f33558 == s2) {
                            C10562 c10564 = c10563.f33567.f8206.f8207;
                            if (c10564.f33558 == 0) {
                                s = (short) (s + 1);
                                c10564.m27023(s, this.f41010, c7776);
                            }
                        }
                    }
                }
                for (C10562 c10565 = c10562; c10565 != null; c10565 = c10565.f33562) {
                    if ((c10565.f33569 & 16) != 0) {
                        c10565.f33567.f8206.f8207.m27021(c10565, this.f41010, c7776);
                    }
                }
            }
            c10562.f33572 = C10562.f33556;
            int i4 = this.f41003;
            while (c10562 != C10562.f33556) {
                C10562 c10566 = c10562.f33572;
                short s3 = c10562.f33568;
                int i5 = c10562.f33565 + s3;
                if (i5 > i4) {
                    i4 = i5;
                }
                C2555 c2555 = c10562.f33567;
                if ((c10562.f33569 & 16) != 0) {
                    c2555 = c2555.f8206;
                }
                int i6 = 10;
                while (c2555 != null) {
                    C10562 c10567 = c2555.f8207;
                    if (c10567.f33572 == null) {
                        c10567.f33568 = (short) Math.max((int) c10567.f33568, c2555.f8208 + s3);
                        c10567.f33572 = c10566;
                        c10566 = c10567;
                    }
                    c2555 = c2555.f8206;
                    i6 += 5;
                }
                int i7 = c10562.f33559;
                C21751 c21753 = this.f41010;
                while (c21753 != null) {
                    int i8 = c21753.f69369.f33559;
                    int i9 = c21753.f69368.f33559;
                    if (i7 >= i8 && i7 < i9) {
                        C10562 c10568 = c21753.f69372;
                        if (c10568.f33572 == null) {
                            c10568.f33568 = (short) Math.max((int) c10568.f33568, 1);
                            c10568.f33572 = c10566;
                            c10566 = c10568;
                        }
                    }
                    c21753 = c21753.f69370;
                    i6 += 10;
                }
                c7776.m21148(i6);
                c10562 = c10566;
            }
            this.f41003 = i4;
            return;
        }
        for (C21751 c21754 = this.f41010; c21754 != null; c21754 = c21754.f69370) {
            C10562 c10562M27017 = c21754.f69372.m27017();
            c10562M27017.f33569 = (short) (c10562M27017.f33569 | 2);
        }
        C13741 c13741 = c10562.f33561;
        c13741.m33589(this.f41005, this.f40982, this.f40984, this.f40983);
        c13741.m33587(this);
        c10562.f33572 = C10562.f33556;
        int i10 = 0;
        int iMax = 0;
        C10562 c10569 = c10562;
        C10562 c105610 = c10569;
        while (c10569 != C10562.f33556) {
            C10562 c105611 = c10569.f33572;
            c10569.f33572 = null;
            c10569.f33569 = (short) (c10569.f33569 | 8);
            int iM33586 = c10569.f33561.m33586() + c10569.f33565;
            if (iM33586 > iMax) {
                iMax = iM33586;
            }
            C2555 c2556 = c10569.f33567;
            int i11 = 0;
            while (c2556 != null) {
                C10562 c10562M27018 = c2556.f8207.m27017();
                if (c10569.f33561.m33591(this.f41005, c10562M27018.f33561, i10) && c10562M27018.f33572 == null) {
                    C10562 c105612 = C10562.f33556;
                    c10562M27018.f33572 = c105612;
                    if (c105611 == c105612) {
                        c105611 = c10562M27018;
                    } else {
                        c105610.f33572 = c10562M27018;
                    }
                    c105610 = c10562M27018;
                }
                c2556 = c2556.f8206;
                i11 += 55;
            }
            int i12 = 8388608;
            int i13 = c10569.f33559;
            C21751 c21755 = this.f41010;
            while (c21755 != null) {
                int i14 = c21755.f69369.f33559;
                int i15 = c21755.f69368.f33559;
                if (i13 >= i14 && i13 < i15) {
                    String str = c21755.f69371;
                    if (str == null) {
                        str = "java/lang/Throwable";
                    }
                    int iM52258 = this.f41005.m52258(str) | i12;
                    C10562 c10562M27019 = c21755.f69372.m27017();
                    if (c10569.f33561.m33591(this.f41005, c10562M27019.f33561, iM52258) && c10562M27019.f33572 == null) {
                        C10562 c105613 = C10562.f33556;
                        c10562M27019.f33572 = c105613;
                        if (c105611 == c105613) {
                            c105611 = c10562M27019;
                        } else {
                            c105610.f33572 = c10562M27019;
                        }
                        c105610 = c10562M27019;
                    }
                    i11 += 55;
                }
                i11 += 3;
                c21755 = c21755.f69370;
                iMax = iMax;
                i12 = 8388608;
            }
            c7776.m21148(i11);
            i10 = 0;
            c10569 = c105611;
        }
        while (c10562 != null) {
            if ((c10562.f33569 & 10) == 10) {
                c10562.f33561.m33587(this);
            }
            if ((c10562.f33569 & 8) == 0) {
                C10562 c105614 = c10562.f33562;
                int i16 = c10562.f33559;
                int i17 = (c105614 == null ? c4048.f13788 : c105614.f33559) - 1;
                if (i17 >= i16) {
                    for (int i18 = i16; i18 < i17; i18++) {
                        c4048.f13787[i18] = 0;
                    }
                    c4048.f13787[i17] = -65;
                    m31738(i16, 0, 1);
                    this.f40988[3] = this.f41005.m52258("java/lang/Throwable") | 8388608;
                    m31742();
                    C21751 c21756 = this.f41010;
                    if (c21756 == null) {
                        c4047 = c4048;
                        c21751 = null;
                    } else {
                        int i19 = c10562.f33559;
                        int i20 = c105614 == null ? Integer.MAX_VALUE : c105614.f33559;
                        C21751 c21757 = new C21751(c21756, null, null);
                        C21751 c21758 = c21757;
                        while (c21756 != null) {
                            C10562 c105615 = c21756.f69368;
                            C10562 c105616 = c21756.f69369;
                            int i21 = c105616.f33559;
                            int i22 = c105615.f33559;
                            C4047 c4049 = c4048;
                            C21751 c21759 = c21756.f69370;
                            c21756.f69370 = null;
                            if (i19 >= i22 || i20 <= i21) {
                                c21758.f69370 = c21756;
                            } else {
                                if (i19 <= i21) {
                                    if (i20 < i22) {
                                        c21752 = new C21751(c21756, c105614, c105615);
                                        c21758.f69370 = c21752;
                                        c21756 = c21752;
                                    }
                                } else if (i20 >= i22) {
                                    c21752 = new C21751(c21756, c105616, c10562);
                                    c21758.f69370 = c21752;
                                    c21756 = c21752;
                                } else {
                                    C21751 c217510 = new C21751(c21756, c105616, c10562);
                                    c21758.f69370 = c217510;
                                    C21751 c217511 = new C21751(c21756, c105614, c105615);
                                    c217510.f69370 = c217511;
                                    c21758 = c217511;
                                }
                                c21756 = c21759;
                                c4048 = c4049;
                            }
                            c21758 = c21756;
                            c21756 = c21759;
                            c4048 = c4049;
                        }
                        c4047 = c4048;
                        c21751 = c21757.f69370;
                    }
                    this.f41010 = c21751;
                    iMax = Math.max(iMax, 1);
                } else {
                    c4047 = c4048;
                }
            } else {
                c4047 = c4048;
            }
            c10562 = c10562.f33562;
            c4048 = c4047;
        }
        this.f41003 = iMax;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m31734(int i, C10562 c10562) {
        C10562 c10563 = this.f40992;
        c10563.f33567 = new C2555(i, c10562, c10563.f33567);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31732() {
        int i = this.f41002;
        if (i != 4) {
            if (i == 1) {
                this.f40992.f33565 = (short) this.f41009;
                this.f40992 = null;
                return;
            }
            return;
        }
        C10562 c10562 = new C10562();
        c10562.f33561 = new C13741(c10562, this.f40980);
        C4047 c4047 = this.f41008;
        c10562.m27024(c4047.f13787, this.f41011, c4047.f13788);
        this.f40976.f33562 = c10562;
        this.f40976 = c10562;
        this.f40992 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31738(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f40988;
        if (iArr == null || iArr.length < i4) {
            this.f40988 = this.f40980.m21147(i4);
        }
        int[] iArr2 = this.f40988;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31746(int i, int i2) {
        this.f40988[i] = i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31742() {
        int i;
        char c;
        if (this.f41014 != null) {
            if (this.f41011 == null) {
                this.f41011 = new C4047();
            }
            int[] iArr = this.f40988;
            int i2 = iArr[1];
            int i3 = iArr[2];
            if (this.f41005.m52257() < 50) {
                C4047 c4047 = this.f41011;
                c4047.m13021(this.f40988[0]);
                c4047.m13021(i2);
                int i4 = i2 + 3;
                m31735(3, i4);
                this.f41011.m13021(i3);
                m31735(i4, i3 + i4);
            } else {
                if (this.f40971 == 0) {
                    i = this.f40988[0];
                } else {
                    i = (this.f40988[0] - this.f41014[0]) - 1;
                }
                int i5 = this.f41014[1];
                int i6 = i2 - i5;
                if (i3 == 0) {
                    switch (i6) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = i < 64 ? (char) 0 : (char) 251;
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                        default:
                            c = 255;
                            break;
                    }
                } else if (i6 == 0 && i3 == 1) {
                    c = i < 63 ? '@' : (char) 247;
                } else {
                    c = 255;
                }
                if (c != 255) {
                    int i7 = 3;
                    for (int i8 = 0; i8 < i5 && i8 < i2; i8++) {
                        if (this.f40988[i7] != this.f41014[i7]) {
                            c = 255;
                        } else {
                            i7++;
                        }
                    }
                }
                if (c == 0) {
                    this.f41011.m13014(i);
                } else if (c == '@') {
                    this.f41011.m13014(i + 64);
                    m31735(i2 + 3, i2 + 4);
                } else if (c == 247) {
                    C4047 c4048 = this.f41011;
                    c4048.m13014(247);
                    c4048.m13021(i);
                    m31735(i2 + 3, i2 + 4);
                } else if (c == 248) {
                    C4047 c4049 = this.f41011;
                    c4049.m13014(i6 + 251);
                    c4049.m13021(i);
                } else if (c == 251) {
                    C4047 c40410 = this.f41011;
                    c40410.m13014(251);
                    c40410.m13021(i);
                } else if (c == 252) {
                    C4047 c40411 = this.f41011;
                    c40411.m13014(i6 + 251);
                    c40411.m13021(i);
                    m31735(i5 + 3, i2 + 3);
                } else {
                    C4047 c40412 = this.f41011;
                    c40412.m13014(255);
                    c40412.m13021(i);
                    c40412.m13021(i2);
                    int i9 = i2 + 3;
                    m31735(3, i9);
                    this.f41011.m13021(i3);
                    m31735(i9, i3 + i9);
                }
            }
            this.f40971++;
        }
        this.f41014 = this.f40988;
        this.f40988 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m31735(int i, int i2) {
        while (i < i2) {
            C23243 c23243 = this.f41005;
            int i3 = this.f40988[i];
            C4047 c4047 = this.f41011;
            int i4 = ((-67108864) & i3) >> 26;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 62914560;
                if (i6 == 4194304) {
                    c4047.m13014(i5);
                } else if (i6 == 8388608) {
                    c4047.m13014(7);
                    c4047.m13021(c23243.m52248(c23243.m52255(i5).f53504).f53507);
                } else if (i6 == 12582912) {
                    c4047.m13014(8);
                    c4047.m13021((int) c23243.m52255(i5).f53502);
                } else if (i6 == 16777216) {
                    c4047.m13014(8);
                    c23243.m52261(i5).m27019(c4047);
                } else {
                    throw new AssertionError();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i7 = i4 - 1;
                    if (i4 > 0) {
                        sb.append('[');
                        i4 = i7;
                    } else {
                        if ((i3 & 62914560) == 8388608) {
                            sb.append('L');
                            sb.append(c23243.m52255(i3 & 1048575).f53504);
                            sb.append(';');
                        } else {
                            int i8 = i3 & 1048575;
                            if (i8 == 1) {
                                sb.append('I');
                            } else if (i8 == 2) {
                                sb.append('F');
                            } else if (i8 == 3) {
                                sb.append('D');
                            } else if (i8 != 4) {
                                switch (i8) {
                                    case 9:
                                        sb.append('Z');
                                        break;
                                    case 10:
                                        sb.append('B');
                                        break;
                                    case 11:
                                        sb.append('C');
                                        break;
                                    case 12:
                                        sb.append('S');
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c4047.m13014(7);
                        c4047.m13021(c23243.m52248(sb.toString()).f53507);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31737(Object obj) {
        if (obj instanceof Integer) {
            this.f41011.m13014(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof String) {
            C4047 c4047 = this.f41011;
            c4047.m13014(7);
            c4047.m13021(this.f41005.m52248((String) obj).f53507);
        } else {
            this.f41011.m13014(8);
            ((C10562) obj).m27019(this.f41011);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31747() {
        int i;
        int i2;
        C4047 c4047 = this.f41008;
        int i3 = c4047.f13788;
        int i4 = i3 / 3;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        byte[] bArr = c4047.f13787;
        int iM31736 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = EnumC6121.f20881;
            if (iM31736 >= i3) {
                while (i5 > 0) {
                    i5--;
                    int i8 = iArr[i5];
                    int i9 = bArr[i8] & 255;
                    if (i9 == 170 || i9 == 171) {
                        i = i8 & 3;
                    } else {
                        i = (i9 == 216 || i9 == 217) ? 2 : 5;
                    }
                    int i10 = 0;
                    while (i10 < i6) {
                        int i11 = iArr2[i10];
                        if (i11 < i8 && i8 < iArr3[i10]) {
                            iArr4[i10] = iArr4[i10] + i;
                        } else if (iArr3[i10] < i8 && i8 < i11) {
                            iArr4[i10] = iArr4[i10] - i;
                        }
                        int i12 = iArr4[i10];
                        if (i12 < -32768 || i12 > i7) {
                            int i13 = iArr2[i10];
                            int i14 = bArr[i13] & 255;
                            bArr[i13] = (byte) (i14 + (i14 < 198 ? 49 : 20));
                            iArr[i5] = i13;
                            i6--;
                            iArr2[i10] = iArr2[i6];
                            iArr3[i10] = iArr3[i6];
                            iArr4[i10] = iArr4[i6];
                            i7 = EnumC6121.f20881;
                            i5++;
                        } else {
                            i10++;
                        }
                    }
                }
                return;
            }
            switch (bArr[iM31736] & 255) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                case 84:
                case 85:
                case HRSS1373Polynomial.K /* 86 */:
                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                case 96:
                case 97:
                case 98:
                case q.f /* 99 */:
                case 100:
                case 101:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                case 108:
                case 109:
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 114:
                case 115:
                case 116:
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                case 118:
                case 119:
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                case 122:
                case 123:
                case 124:
                case q.h /* 125 */:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 172:
                case 173:
                case 174:
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                case 177:
                case 190:
                case 191:
                case 194:
                case 195:
                    iM31736++;
                    break;
                case 16:
                case 18:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case 56:
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case 169:
                case 188:
                    iM31736 += 2;
                    break;
                case 17:
                case 19:
                case 20:
                case 132:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    iM31736 += 3;
                    break;
                case 153:
                case EnumC24309.f78687 /* 154 */:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    byte[] bArr2 = c4047.f13787;
                    short s = (short) (((bArr2[iM31736 + 1] & 255) << 8) | (bArr2[iM31736 + 2] & 255));
                    int i15 = ((s / 3) * 5) + s;
                    if (i15 < -32768 || i15 > 32767) {
                        iArr2[i6] = iM31736;
                        iArr3[i6] = iM31736 + s;
                        iArr4[i6] = s;
                        i6++;
                    }
                    iM31736 += 3;
                    break;
                case 170:
                    i2 = i5 + 1;
                    iArr[i5] = iM31736;
                    int i16 = (4 - (iM31736 & 3)) + iM31736;
                    iM31736 = (((m31736(i16 + 8) - m31736(i16 + 4)) + 1) * 4) + 12 + i16;
                    i5 = i2;
                    break;
                case 171:
                    i2 = i5 + 1;
                    iArr[i5] = iM31736;
                    int i17 = (4 - (iM31736 & 3)) + iM31736;
                    iM31736 = C12669.m31436(m31736(i17 + 4), 8, 8, i17);
                    i5 = i2;
                    break;
                case 185:
                case 186:
                case 200:
                case 201:
                    iM31736 += 5;
                    break;
                case 196:
                    iM31736 += (bArr[iM31736 + 1] & 255) == 132 ? 6 : 4;
                    break;
                case 197:
                    iM31736 += 4;
                    break;
                case 202:
                case 203:
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                case 210:
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                case 218:
                case 219:
                    i2 = i5 + 1;
                    iArr[i5] = iM31736;
                    iM31736 += 3;
                    i5 = i2;
                    break;
                case 220:
                    i2 = i5 + 1;
                    iArr[i5] = iM31736;
                    iM31736 += 5;
                    i5 = i2;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m31736(int i) {
        byte[] bArr = this.f41008.f13787;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31741(C14487 c14487, boolean z, boolean z2, int i, int i2, int i3) {
        this.f41005.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m31745() {
        int iM31436;
        C4047 c4047 = this.f41008;
        int i = c4047.f13788;
        if (i <= 0) {
            iM31436 = 8;
        } else {
            if (i > 65535) {
                StringBuilder sbM10406 = C3188.m10406("Method too large: ", this.f41005.m52260(), ".", this.f40993, " ");
                sbM10406.append(this.f40984);
                throw new C19513(sbM10406.toString());
            }
            this.f41005.m52265("Code");
            int i2 = c4047.f13788 + 16;
            int i3 = 0;
            for (C21751 c21751 = this.f41010; c21751 != null; c21751 = c21751.f69370) {
                i3++;
            }
            iM31436 = (i3 * 8) + 2 + i2 + 8;
            if (this.f41011 != null) {
                this.f41005.m52265(this.f41005.m52257() >= 50 ? "StackMapTable" : "StackMap");
                iM31436 += this.f41011.f13788 + 8;
            }
            if (this.f40969 != null) {
                this.f41005.m52265("LineNumberTable");
                iM31436 += this.f40969.f13788 + 8;
            }
            if (this.f40977 != null) {
                this.f41005.m52265("LocalVariableTable");
                iM31436 += this.f40977.f13788 + 8;
            }
            if (this.f40973 != null) {
                this.f41005.m52265("LocalVariableTypeTable");
                iM31436 += this.f40973.f13788 + 8;
            }
            C20455 c20455 = this.f40991;
            if (c20455 != null) {
                iM31436 += c20455.m46882("RuntimeVisibleTypeAnnotations");
            }
            C20455 c20456 = this.f40972;
            if (c20456 != null) {
                iM31436 += c20456.m46882("RuntimeInvisibleTypeAnnotations");
            }
        }
        int i4 = this.f40975;
        if (i4 > 0) {
            this.f41005.m52265("Exceptions");
            iM31436 = C12669.m31436(i4, 2, 8, iM31436);
        }
        int iM54158 = iM31436 + C24185.m54158(this.f41005, this.f40982, this.f40995) + C20455.m46876(this.f41001, this.f41000, this.f40966, this.f40978);
        C20455[] c20455Arr = this.f40981;
        if (c20455Arr != null) {
            int length = this.f40987;
            if (length == 0) {
                length = c20455Arr.length;
            }
            iM54158 += C20455.m46875("RuntimeVisibleParameterAnnotations", c20455Arr, length);
        }
        C20455[] c20455Arr2 = this.f40965;
        if (c20455Arr2 != null) {
            int length2 = this.f40986;
            if (length2 == 0) {
                length2 = c20455Arr2.length;
            }
            iM54158 += C20455.m46875("RuntimeInvisibleParameterAnnotations", c20455Arr2, length2);
        }
        if (this.f40967 != null) {
            this.f41005.m52265("AnnotationDefault");
            iM54158 += this.f40967.f13788 + 6;
        }
        if (this.f40968 != null) {
            this.f41005.m52265("MethodParameters");
            iM54158 += this.f40968.f13788 + 7;
        }
        C24185 c24185 = this.f40998;
        return c24185 != null ? iM54158 + c24185.m54160(this.f41005) : iM54158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31739(C4047 c4047) {
        int i;
        boolean z = this.f41005.m52257() < 49;
        int i2 = ~(z ? 4096 : 0);
        int i3 = this.f40982;
        c4047.m13021(i2 & i3);
        c4047.m13021(this.f40989);
        c4047.m13021(this.f41013);
        C4047 c4048 = this.f41008;
        int i4 = c4048.f13788 > 0 ? 1 : 0;
        int i5 = this.f40975;
        if (i5 > 0) {
            i4++;
        }
        if ((i3 & 4096) != 0 && z) {
            i4++;
        }
        int i6 = this.f40995;
        if (i6 != 0) {
            i4++;
        }
        if ((131072 & i3) != 0) {
            i4++;
        }
        if (this.f41001 != null) {
            i4++;
        }
        if (this.f41000 != null) {
            i4++;
        }
        if (this.f40981 != null) {
            i4++;
        }
        if (this.f40965 != null) {
            i4++;
        }
        if (this.f40966 != null) {
            i4++;
        }
        if (this.f40978 != null) {
            i4++;
        }
        if (this.f40967 != null) {
            i4++;
        }
        if (this.f40968 != null) {
            i4++;
        }
        C24185 c24185 = this.f40998;
        if (c24185 != null) {
            int i7 = 0;
            while (c24185 != null) {
                i7++;
                c24185 = c24185.f78328;
            }
            i4 += i7;
        }
        c4047.m13021(i4);
        int i8 = c4048.f13788;
        if (i8 > 0) {
            int i9 = i8 + 10;
            int i10 = 0;
            for (C21751 c21751 = this.f41010; c21751 != null; c21751 = c21751.f69370) {
                i10++;
            }
            int iM31436 = C12669.m31436(i10, 8, 2, i9);
            C4047 c4049 = this.f41011;
            if (c4049 != null) {
                iM31436 += c4049.f13788 + 8;
                i = 1;
            } else {
                i = 0;
            }
            C4047 c40410 = this.f40969;
            if (c40410 != null) {
                iM31436 += c40410.f13788 + 8;
                i++;
            }
            C4047 c40411 = this.f40977;
            if (c40411 != null) {
                iM31436 += c40411.f13788 + 8;
                i++;
            }
            C4047 c40412 = this.f40973;
            if (c40412 != null) {
                iM31436 += c40412.f13788 + 8;
                i++;
            }
            C20455 c20455 = this.f40991;
            if (c20455 != null) {
                iM31436 += c20455.m46882("RuntimeVisibleTypeAnnotations");
                i++;
            }
            C20455 c20456 = this.f40972;
            if (c20456 != null) {
                iM31436 += c20456.m46882("RuntimeInvisibleTypeAnnotations");
                i++;
            }
            c4047.m13021(this.f41005.m52265("Code"));
            c4047.m13023(iM31436);
            c4047.m13021(this.f41003);
            c4047.m13021(this.f40983);
            c4047.m13023(c4048.f13788);
            c4047.m13018(0, c4048.f13788, c4048.f13787);
            C21751 c21752 = this.f41010;
            int i11 = 0;
            for (C21751 c21753 = c21752; c21753 != null; c21753 = c21753.f69370) {
                i11++;
            }
            c4047.m13021(i11);
            while (c21752 != null) {
                c4047.m13021(c21752.f69369.f33559);
                c4047.m13021(c21752.f69368.f33559);
                c4047.m13021(c21752.f69372.f33559);
                c4047.m13021(c21752.f69367);
                c21752 = c21752.f69370;
            }
            c4047.m13021(i);
            if (this.f41011 != null) {
                c4047.m13021(this.f41005.m52265(this.f41005.m52257() >= 50 ? "StackMapTable" : "StackMap"));
                c4047.m13023(this.f41011.f13788 + 2);
                c4047.m13021(this.f40971);
                C4047 c40413 = this.f41011;
                c4047.m13018(0, c40413.f13788, c40413.f13787);
            }
            if (this.f40969 != null) {
                c4047.m13021(this.f41005.m52265("LineNumberTable"));
                c4047.m13023(this.f40969.f13788 + 2);
                c4047.m13021(this.f40979);
                C4047 c40414 = this.f40969;
                c4047.m13018(0, c40414.f13788, c40414.f13787);
            }
            if (this.f40977 != null) {
                c4047.m13021(this.f41005.m52265("LocalVariableTable"));
                c4047.m13023(this.f40977.f13788 + 2);
                c4047.m13021(this.f40990);
                C4047 c40415 = this.f40977;
                c4047.m13018(0, c40415.f13788, c40415.f13787);
            }
            if (this.f40973 != null) {
                c4047.m13021(this.f41005.m52265("LocalVariableTypeTable"));
                c4047.m13023(this.f40973.f13788 + 2);
                c4047.m13021(this.f41007);
                C4047 c40416 = this.f40973;
                c4047.m13018(0, c40416.f13788, c40416.f13787);
            }
            C20455 c20457 = this.f40991;
            if (c20457 != null) {
                c20457.m46881(this.f41005.m52265("RuntimeVisibleTypeAnnotations"), c4047);
            }
            C20455 c20458 = this.f40972;
            if (c20458 != null) {
                c20458.m46881(this.f41005.m52265("RuntimeInvisibleTypeAnnotations"), c4047);
            }
        }
        if (i5 > 0) {
            c4047.m13021(this.f41005.m52265("Exceptions"));
            c4047.m13023((i5 * 2) + 2);
            c4047.m13021(i5);
            for (int i12 : this.f40996) {
                c4047.m13021(i12);
            }
        }
        C24185.m54159(this.f41005, i3, i6, c4047);
        C20455.m46880(this.f41005, this.f41001, this.f41000, this.f40966, this.f40978, c4047);
        if (this.f40981 != null) {
            int iM52265 = this.f41005.m52265("RuntimeVisibleParameterAnnotations");
            C20455[] c20455Arr = this.f40981;
            int length = this.f40987;
            if (length == 0) {
                length = c20455Arr.length;
            }
            C20455.m46879(iM52265, c20455Arr, length, c4047);
        }
        if (this.f40965 != null) {
            int iM52266 = this.f41005.m52265("RuntimeInvisibleParameterAnnotations");
            C20455[] c20455Arr2 = this.f40965;
            int length2 = this.f40986;
            if (length2 == 0) {
                length2 = c20455Arr2.length;
            }
            C20455.m46879(iM52266, c20455Arr2, length2, c4047);
        }
        if (this.f40967 != null) {
            c4047.m13021(this.f41005.m52265("AnnotationDefault"));
            c4047.m13023(this.f40967.f13788);
            C4047 c40417 = this.f40967;
            c4047.m13018(0, c40417.f13788, c40417.f13787);
        }
        if (this.f40968 != null) {
            c4047.m13021(this.f41005.m52265("MethodParameters"));
            c4047.m13023(this.f40968.f13788 + 1);
            c4047.m13014(this.f40985);
            C4047 c40418 = this.f40968;
            c4047.m13018(0, c40418.f13788, c40418.f13787);
        }
        C24185 c24186 = this.f40998;
        if (c24186 != null) {
            c24186.m54163(this.f41005, c4047);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31740(C6285 c6285) {
        c6285.m17968(this.f40998);
        c6285.m17968(null);
    }
}
