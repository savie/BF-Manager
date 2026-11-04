package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.֡ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0318 extends AbstractC18217 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4047 f1722;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4047 f1723;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7030 f1724;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1725;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12800 f1726;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20455 f1727;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f1728;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24185 f1729;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C20455 f1730;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23243 f1731;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f1732;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f1733;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f1734;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1735;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1736;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12800 f1737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20455 f1738;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f1739;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1740;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7776 f1741;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f1742;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f1743;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4047 f1744;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1745;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1746;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f1747;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4047 f1748;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C24735 f1749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1614 f1750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1751;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7030 f1752;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20455 f1753;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C24735 f1754;

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2000() {
    }

    public C0318(int i) {
        super(null);
        this.f1741 = new C7776(10485760, 100000000L);
        this.f1731 = new C23243(this);
        if ((i & 2) != 0) {
            this.f1751 = 4;
        } else if ((i & 1) != 0) {
            this.f1751 = 1;
        } else {
            this.f1751 = 0;
        }
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2001(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f1728 = i;
        this.f1736 = i2;
        int i3 = i & 65535;
        C23243 c23243 = this.f1731;
        this.f1740 = c23243.m52259(i3, str);
        if (str2 != null) {
            this.f1734 = c23243.m52265(str2);
        }
        this.f1733 = str3 == null ? 0 : c23243.m52248(str3).f53507;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f1745 = length;
            this.f1743 = new int[length];
            for (int i4 = 0; i4 < this.f1745; i4++) {
                this.f1743[i4] = c23243.m52248(strArr[i4]).f53507;
            }
        }
        if (this.f1751 != 1 || i3 < 51) {
            return;
        }
        this.f1751 = 2;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2004(String str, String str2) {
        if (str != null) {
            this.f1725 = this.f1731.m52265(str);
        }
        if (str2 != null) {
            C4047 c4047 = new C4047();
            c4047.m13017(0, Integer.MAX_VALUE, str2);
            this.f1748 = c4047;
        }
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5343 mo1997(int i, String str, String str2) {
        C23243 c23243 = this.f1731;
        C1614 c1614 = new C1614(c23243, c23243.m52262(str).f53507, i, str2 == null ? 0 : c23243.m52265(str2));
        this.f1750 = c1614;
        return c1614;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2002(String str) {
        this.f1746 = this.f1731.m52248(str).f53507;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2005(String str, String str2, String str3) {
        C23243 c23243 = this.f1731;
        this.f1742 = c23243.m52248(str).f53507;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f1739 = c23243.m52240(str2, str3);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo1996(String str, boolean z) {
        C23243 c23243 = this.f1731;
        if (z) {
            C20455 c20455M46878 = C20455.m46878(c23243, str, this.f1753);
            this.f1753 = c20455M46878;
            return c20455M46878;
        }
        C20455 c20455M46879 = C20455.m46878(c23243, str, this.f1738);
        this.f1738 = c20455M46879;
        return c20455M46879;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo1995(int i, C20259 c20259, String str, boolean z) {
        C23243 c23243 = this.f1731;
        if (z) {
            C20455 c20455M46877 = C20455.m46877(c23243, i, c20259, str, this.f1727);
            this.f1727 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(c23243, i, c20259, str, this.f1730);
        this.f1730 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2006(C24185 c24185) {
        c24185.f78328 = this.f1729;
        this.f1729 = c24185;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2009(String str) {
        if (this.f1722 == null) {
            this.f1722 = new C4047();
        }
        this.f1747++;
        this.f1722.m13021(this.f1731.m52248(str).f53507);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo2007(String str) {
        if (this.f1723 == null) {
            this.f1723 = new C4047();
        }
        this.f1735++;
        this.f1723.m13021(this.f1731.m52248(str).f53507);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2003(String str, int i, String str2, String str3) {
        if (this.f1744 == null) {
            this.f1744 = new C4047();
        }
        C23243 c23243 = this.f1731;
        C17275 c17275M52248 = c23243.m52248(str);
        if (c17275M52248.f53503 == 0) {
            this.f1732++;
            this.f1744.m13021(c17275M52248.f53507);
            this.f1744.m13021(str2 == null ? 0 : c23243.m52248(str2).f53507);
            this.f1744.m13021(str3 != null ? c23243.m52265(str3) : 0);
            this.f1744.m13021(i);
            c17275M52248.f53503 = this.f1732;
        }
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11308 mo2008(String str, String str2, String str3) {
        C24735 c24735 = new C24735(this.f1731, str, str2, str3);
        if (this.f1754 == null) {
            this.f1754 = c24735;
        } else {
            this.f1749.f35647 = c24735;
        }
        this.f1749 = c24735;
        return c24735;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8521 mo1998(int i, String str, String str2, String str3, Object obj) {
        C7030 c7030 = new C7030(this.f1731, i, str, str2, str3, obj);
        if (this.f1724 == null) {
            this.f1724 = c7030;
        } else {
            this.f1752.f27848 = c7030;
        }
        this.f1752 = c7030;
        return c7030;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15037 mo1999(int i, String str, String str2, String str3, String[] strArr) {
        C12800 c12800 = new C12800(this.f1731, i, str, str2, str3, strArr, this.f1751, new C7776(this.f1741));
        if (this.f1737 == null) {
            this.f1737 = c12800;
        } else {
            this.f1726.f49090 = c12800;
        }
        this.f1726 = c12800;
        return c12800;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m2010() {
        int iM5702;
        int iM55231;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < 2) {
            int iM54160 = (this.f1745 * 2) + 24;
            int i6 = 0;
            for (C7030 c7030 = this.f1724; c7030 != null; c7030 = (C7030) c7030.f27848) {
                i6++;
                iM54160 += c7030.m19354();
            }
            int i7 = 0;
            for (C12800 c12800 = this.f1737; c12800 != null; c12800 = (C12800) c12800.f49090) {
                i7++;
                iM54160 += c12800.m31745();
            }
            C4047 c4047 = this.f1744;
            C23243 c23243 = this.f1731;
            if (c4047 != null) {
                iM54160 += c4047.f13788 + 8;
                c23243.m52265("InnerClasses");
                iM5702 = 1;
            } else {
                iM5702 = 0;
            }
            if (this.f1742 != 0) {
                iM5702++;
                iM54160 += 10;
                c23243.m52265("EnclosingMethod");
            }
            if ((this.f1736 & 4096) != 0 && (this.f1728 & 65535) < 49) {
                iM5702++;
                iM54160 += 6;
                c23243.m52265("Synthetic");
            }
            if (this.f1734 != 0) {
                iM5702++;
                iM54160 += 8;
                c23243.m52265("Signature");
            }
            if (this.f1725 != 0) {
                iM5702++;
                iM54160 += 8;
                c23243.m52265("SourceFile");
            }
            C4047 c4048 = this.f1748;
            if (c4048 != null) {
                iM5702++;
                iM54160 += c4048.f13788 + 6;
                c23243.m52265("SourceDebugExtension");
            }
            if ((this.f1736 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                iM5702++;
                iM54160 += 6;
                c23243.m52265("Deprecated");
            }
            C20455 c20455 = this.f1753;
            if (c20455 != null) {
                iM5702++;
                iM54160 += c20455.m46882("RuntimeVisibleAnnotations");
            }
            C20455 c20456 = this.f1738;
            if (c20456 != null) {
                iM5702++;
                iM54160 += c20456.m46882("RuntimeInvisibleAnnotations");
            }
            C20455 c20457 = this.f1727;
            if (c20457 != null) {
                iM5702++;
                iM54160 += c20457.m46882("RuntimeVisibleTypeAnnotations");
            }
            C20455 c20458 = this.f1730;
            if (c20458 != null) {
                iM5702++;
                iM54160 += c20458.m46882("RuntimeInvisibleTypeAnnotations");
            }
            if (c23243.m52237() > 0) {
                iM5702++;
                iM54160 += c23243.m52237();
            }
            C1614 c1614 = this.f1750;
            if (c1614 != null) {
                iM5702 += c1614.m5702();
                iM54160 += this.f1750.m5704();
            }
            if (this.f1746 != 0) {
                iM5702++;
                iM54160 += 8;
                c23243.m52265("NestHost");
            }
            C4047 c4049 = this.f1722;
            int i8 = i5;
            if (c4049 != null) {
                iM5702++;
                iM54160 += c4049.f13788 + 8;
                c23243.m52265("NestMembers");
            }
            C4047 c40410 = this.f1723;
            if (c40410 != null) {
                iM5702++;
                iM54160 += c40410.f13788 + 8;
                c23243.m52265("PermittedSubclasses");
            }
            if ((this.f1736 & 65536) == 0 && this.f1754 == null) {
                iM55231 = 0;
                i = 0;
            } else {
                iM55231 = 0;
                int i9 = 0;
                for (C24735 c24735 = this.f1754; c24735 != null; c24735 = (C24735) c24735.f35647) {
                    i9++;
                    iM55231 += c24735.m55231();
                }
                iM5702++;
                iM54160 += iM55231 + 8;
                c23243.m52265("Record");
                i = i9;
            }
            C24185 c24185 = this.f1729;
            if (c24185 != null) {
                int i10 = 0;
                while (c24185 != null) {
                    i10++;
                    c24185 = c24185.f78328;
                }
                iM5702 += i10;
                iM54160 += this.f1729.m54160(c23243);
            }
            int iM52264 = iM54160 + c23243.m52264();
            if (c23243.m52254() > 65535) {
                throw new C21201(C25272.m56409("Class too large: ", c23243.m52260()));
            }
            C4047 c40411 = new C4047();
            c40411.f13787 = new byte[iM52264];
            c40411.m13023(-889275714);
            c40411.m13023(this.f1728);
            c23243.m52263(c40411);
            c40411.m13021((~((65535 & this.f1728) < 49 ? 4096 : 0)) & this.f1736);
            c40411.m13021(this.f1740);
            c40411.m13021(this.f1733);
            c40411.m13021(this.f1745);
            for (int i11 = 0; i11 < this.f1745; i11++) {
                c40411.m13021(this.f1743[i11]);
            }
            c40411.m13021(i6);
            for (C7030 c7031 = this.f1724; c7031 != null; c7031 = (C7030) c7031.f27848) {
                c7031.m19351(c40411);
            }
            c40411.m13021(i7);
            boolean zM31743 = false;
            boolean z = false;
            for (C12800 c12801 = this.f1737; c12801 != null; c12801 = (C12800) c12801.f49090) {
                zM31743 |= c12801.m31743();
                if (c12801.m31744()) {
                    c12801.m31747();
                    z = true;
                }
                c12801.m31739(c40411);
            }
            c40411.m13021(iM5702);
            if (this.f1744 != null) {
                c40411.m13021(c23243.m52265("InnerClasses"));
                c40411.m13023(this.f1744.f13788 + 2);
                c40411.m13021(this.f1732);
                C4047 c40412 = this.f1744;
                c40411.m13018(0, c40412.f13788, c40412.f13787);
            }
            if (this.f1742 != 0) {
                c40411.m13021(c23243.m52265("EnclosingMethod"));
                c40411.m13023(4);
                c40411.m13021(this.f1742);
                c40411.m13021(this.f1739);
            }
            if ((this.f1736 & 4096) != 0 && (this.f1728 & 65535) < 49) {
                c40411.m13021(c23243.m52265("Synthetic"));
                c40411.m13023(0);
            }
            if (this.f1734 != 0) {
                c40411.m13021(c23243.m52265("Signature"));
                i2 = 2;
                c40411.m13023(2);
                c40411.m13021(this.f1734);
            } else {
                i2 = 2;
            }
            if (this.f1725 != 0) {
                c40411.m13021(c23243.m52265("SourceFile"));
                c40411.m13023(i2);
                c40411.m13021(this.f1725);
            }
            C4047 c40413 = this.f1748;
            if (c40413 != null) {
                int i12 = c40413.f13788;
                c40411.m13021(c23243.m52265("SourceDebugExtension"));
                c40411.m13023(i12);
                i3 = 0;
                c40411.m13018(0, i12, this.f1748.f13787);
            } else {
                i3 = 0;
            }
            if ((this.f1736 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                c40411.m13021(c23243.m52265("Deprecated"));
                c40411.m13023(i3);
            }
            C20455.m46880(this.f1731, this.f1753, this.f1738, this.f1727, this.f1730, c40411);
            c23243.m52253(c40411);
            C1614 c1615 = this.f1750;
            if (c1615 != null) {
                c1615.m5701(c40411);
            }
            if (this.f1746 != 0) {
                c40411.m13021(c23243.m52265("NestHost"));
                i4 = 2;
                c40411.m13023(2);
                c40411.m13021(this.f1746);
            } else {
                i4 = 2;
            }
            if (this.f1722 != null) {
                c40411.m13021(c23243.m52265("NestMembers"));
                c40411.m13023(this.f1722.f13788 + i4);
                c40411.m13021(this.f1747);
                C4047 c40414 = this.f1722;
                c40411.m13018(0, c40414.f13788, c40414.f13787);
            }
            if (this.f1723 != null) {
                c40411.m13021(c23243.m52265("PermittedSubclasses"));
                c40411.m13023(this.f1723.f13788 + 2);
                c40411.m13021(this.f1735);
                C4047 c40415 = this.f1723;
                c40411.m13018(0, c40415.f13788, c40415.f13787);
            }
            if ((this.f1736 & 65536) != 0 || this.f1754 != null) {
                c40411.m13021(c23243.m52265("Record"));
                c40411.m13023(iM55231 + 2);
                c40411.m13021(i);
                for (C24735 c24736 = this.f1754; c24736 != null; c24736 = (C24735) c24736.f35647) {
                    c24736.m55229(c40411);
                }
            }
            C24185 c24186 = this.f1729;
            if (c24186 != null) {
                c24186.m54163(c23243, c40411);
            }
            if (!z) {
                return c40411.f13787;
            }
            byte[] bArr = c40411.f13787;
            C6285 c6285 = new C6285();
            c6285.m17968(this.f1729);
            for (C7030 c7032 = this.f1724; c7032 != null; c7032 = (C7030) c7032.f27848) {
                c7032.m19352(c6285);
            }
            for (C12800 c12802 = this.f1737; c12802 != null; c12802 = (C12800) c12802.f49090) {
                c12802.m31740(c6285);
            }
            for (C24735 c24737 = this.f1754; c24737 != null; c24737 = (C24735) c24737.f35647) {
                c24737.m55230(c6285);
            }
            C24185[] c24185ArrM17969 = c6285.m17969();
            this.f1724 = null;
            this.f1752 = null;
            this.f1737 = null;
            this.f1726 = null;
            this.f1753 = null;
            this.f1738 = null;
            this.f1727 = null;
            this.f1730 = null;
            this.f1750 = null;
            this.f1746 = 0;
            this.f1747 = 0;
            this.f1722 = null;
            this.f1735 = 0;
            this.f1723 = null;
            this.f1754 = null;
            this.f1749 = null;
            this.f1729 = null;
            this.f1751 = zM31743 ? 3 : 0;
            new C14487(bArr, false).m34994(this, c24185ArrM17969, (zM31743 ? 8 : 0) | 256);
            i5 = i8 + 1;
        }
        throw new AssertionError();
    }
}
