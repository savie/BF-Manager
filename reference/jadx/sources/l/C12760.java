package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.۬֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12760 extends AbstractC0764 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2175 f42518;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f42519;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23344 f42520;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42521;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f42522;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18404 f42523;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C2175 f42524;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2175 f42525;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15583 f42526;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3460 f42527;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C15583 f42528;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C3460 f42529;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f42530;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3460 f42531;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f42532;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42533;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f42534;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11349 f42535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f42536;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C2175 f42537;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0059 f42538;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42539;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42540;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f42541;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C18404 f42542;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C12055 f42543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42544;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3460 f42545;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42546;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42547;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12055 f42548;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f42549;

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3284() {
    }

    public C12760(int i) {
        super(null);
        this.f42520 = new C23344(this);
        if ((i & 2) != 0) {
            this.f42521 = 4;
        } else if ((i & 1) != 0) {
            this.f42521 = 1;
        } else {
            this.f42521 = 0;
        }
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3285(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f42522 = i;
        this.f42533 = i2;
        int i3 = i & 65535;
        C23344 c23344 = this.f42520;
        this.f42530 = c23344.m51464(i3, str);
        if (str2 != null) {
            this.f42532 = c23344.m51441(str2);
        }
        this.f42536 = str3 == null ? 0 : c23344.m51453(str3).f54335;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f42546 = length;
            this.f42541 = new int[length];
            for (int i4 = 0; i4 < this.f42546; i4++) {
                this.f42541[i4] = c23344.m51453(strArr[i4]).f54335;
            }
        }
        if (this.f42521 != 1 || i3 < 51) {
            return;
        }
        this.f42521 = 2;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3288(String str, String str2) {
        if (str != null) {
            this.f42549 = this.f42520.m51441(str);
        }
        if (str2 != null) {
            C2175 c2175 = new C2175();
            c2175.m6767(0, Integer.MAX_VALUE, str2);
            this.f42524 = c2175;
        }
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19816 mo3282(int i, String str, String str2) {
        C23344 c23344 = this.f42520;
        C0059 c0059 = new C0059(c23344, c23344.m51466(str).f54335, i, str2 == null ? 0 : c23344.m51441(str2));
        this.f42538 = c0059;
        return c0059;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3286(String str) {
        this.f42544 = this.f42520.m51453(str).f54335;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3289(String str, String str2, String str3) {
        C23344 c23344 = this.f42520;
        this.f42547 = c23344.m51453(str).f54335;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f42519 = c23344.m51445(str2, str3);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo3280(String str, boolean z) {
        C23344 c23344 = this.f42520;
        if (z) {
            C3460 c3460M10172 = C3460.m10172(c23344, str, this.f42527);
            this.f42527 = c3460M10172;
            return c3460M10172;
        }
        C3460 c3460M10173 = C3460.m10172(c23344, str, this.f42529);
        this.f42529 = c3460M10173;
        return c3460M10173;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo3279(int i, C1470 c1470, String str, boolean z) {
        C23344 c23344 = this.f42520;
        if (z) {
            C3460 c3460M10171 = C3460.m10171(c23344, i, c1470, str, this.f42545);
            this.f42545 = c3460M10171;
            return c3460M10171;
        }
        C3460 c3460M10172 = C3460.m10171(c23344, i, c1470, str, this.f42531);
        this.f42531 = c3460M10172;
        return c3460M10172;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3290(C11349 c11349) {
        c11349.f38290 = this.f42535;
        this.f42535 = c11349;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ܰ */
    public final void mo3293(String str) {
        if (this.f42518 == null) {
            this.f42518 = new C2175();
        }
        this.f42534++;
        this.f42518.m6771(this.f42520.m51453(str).f54335);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۨ */
    public final void mo3291(String str) {
        if (this.f42525 == null) {
            this.f42525 = new C2175();
        }
        this.f42540++;
        this.f42525.m6771(this.f42520.m51453(str).f54335);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3287(String str, int i, String str2, String str3) {
        if (this.f42537 == null) {
            this.f42537 = new C2175();
        }
        C23344 c23344 = this.f42520;
        C5704 c5704M51453 = c23344.m51453(str);
        if (c5704M51453.f54334 == 0) {
            this.f42539++;
            this.f42537.m6771(c5704M51453.f54335);
            this.f42537.m6771(str2 == null ? 0 : c23344.m51453(str2).f54335);
            this.f42537.m6771(str3 != null ? c23344.m51441(str3) : 0);
            this.f42537.m6771(i);
            c5704M51453.f54334 = this.f42539;
        }
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16288 mo3292(String str, String str2, String str3) {
        C12055 c12055 = new C12055(this.f42520, str, str2, str3);
        if (this.f42548 == null) {
            this.f42548 = c12055;
        } else {
            this.f42543.f52465 = c12055;
        }
        this.f42543 = c12055;
        return c12055;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17698 mo3281(int i, String str, String str2, String str3, Object obj) {
        C18404 c18404 = new C18404(this.f42520, i, str, str2, str3, obj);
        if (this.f42523 == null) {
            this.f42523 = c18404;
        } else {
            this.f42542.f56195 = c18404;
        }
        this.f42542 = c18404;
        return c18404;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20521 mo3283(int i, String str, String str2, String str3, String[] strArr) {
        C15583 c15583 = new C15583(this.f42520, i, str, str2, str3, strArr, this.f42521);
        if (this.f42526 == null) {
            this.f42526 = c15583;
        } else {
            this.f42528.f66498 = c15583;
        }
        this.f42528 = c15583;
        return c15583;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m31713() {
        int iM964;
        int iM29959;
        int i;
        int i2;
        int i3;
        int i4;
        int iM28427 = (this.f42546 * 2) + 24;
        int i5 = 0;
        for (C18404 c18404 = this.f42523; c18404 != null; c18404 = (C18404) c18404.f56195) {
            i5++;
            iM28427 += c18404.m42690();
        }
        int i6 = 0;
        for (C15583 c15583 = this.f42526; c15583 != null; c15583 = (C15583) c15583.f66498) {
            i6++;
            iM28427 += c15583.m37231();
        }
        C2175 c2175 = this.f42537;
        C23344 c23344 = this.f42520;
        if (c2175 != null) {
            iM28427 += c2175.f7888 + 8;
            c23344.m51441("InnerClasses");
            iM964 = 1;
        } else {
            iM964 = 0;
        }
        if (this.f42547 != 0) {
            iM964++;
            iM28427 += 10;
            c23344.m51441("EnclosingMethod");
        }
        if ((this.f42533 & 4096) != 0 && (this.f42522 & 65535) < 49) {
            iM964++;
            iM28427 += 6;
            c23344.m51441("Synthetic");
        }
        if (this.f42532 != 0) {
            iM964++;
            iM28427 += 8;
            c23344.m51441("Signature");
        }
        if (this.f42549 != 0) {
            iM964++;
            iM28427 += 8;
            c23344.m51441("SourceFile");
        }
        C2175 c2176 = this.f42524;
        if (c2176 != null) {
            iM964++;
            iM28427 += c2176.f7888 + 6;
            c23344.m51441("SourceDebugExtension");
        }
        if ((this.f42533 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM964++;
            iM28427 += 6;
            c23344.m51441("Deprecated");
        }
        C3460 c3460 = this.f42527;
        if (c3460 != null) {
            iM964++;
            iM28427 += c3460.m10181("RuntimeVisibleAnnotations");
        }
        C3460 c3461 = this.f42529;
        if (c3461 != null) {
            iM964++;
            iM28427 += c3461.m10181("RuntimeInvisibleAnnotations");
        }
        C3460 c3462 = this.f42545;
        if (c3462 != null) {
            iM964++;
            iM28427 += c3462.m10181("RuntimeVisibleTypeAnnotations");
        }
        C3460 c3463 = this.f42531;
        if (c3463 != null) {
            iM964++;
            iM28427 += c3463.m10181("RuntimeInvisibleTypeAnnotations");
        }
        if (c23344.m51442() > 0) {
            iM964++;
            iM28427 += c23344.m51442();
        }
        C0059 c0059 = this.f42538;
        if (c0059 != null) {
            iM964 += c0059.m964();
            iM28427 += this.f42538.m966();
        }
        if (this.f42544 != 0) {
            iM964++;
            iM28427 += 8;
            c23344.m51441("NestHost");
        }
        C2175 c2177 = this.f42518;
        if (c2177 != null) {
            iM964++;
            iM28427 += c2177.f7888 + 8;
            c23344.m51441("NestMembers");
        }
        C2175 c2178 = this.f42525;
        if (c2178 != null) {
            iM964++;
            iM28427 += c2178.f7888 + 8;
            c23344.m51441("PermittedSubclasses");
        }
        if ((this.f42533 & 65536) == 0 && this.f42548 == null) {
            iM29959 = 0;
            i = 0;
        } else {
            iM29959 = 0;
            int i7 = 0;
            for (C12055 c12055 = this.f42548; c12055 != null; c12055 = (C12055) c12055.f52465) {
                i7++;
                iM29959 += c12055.m29959();
            }
            iM964++;
            iM28427 += iM29959 + 8;
            c23344.m51441("Record");
            i = i7;
        }
        C11349 c11349 = this.f42535;
        if (c11349 != null) {
            int i8 = 0;
            while (c11349 != null) {
                i8++;
                c11349 = c11349.f38290;
            }
            iM964 += i8;
            iM28427 += this.f42535.m28427(c23344);
        }
        int iM51440 = iM28427 + c23344.m51440();
        if (c23344.m51461() > 65535) {
            throw new C21932(C0252.m1693("Class too large: ", c23344.m51465()));
        }
        C2175 c2179 = new C2175();
        c2179.f7887 = new byte[iM51440];
        c2179.m6773(-889275714);
        c2179.m6773(this.f42522);
        c23344.m51468(c2179);
        c2179.m6771((~((this.f42522 & 65535) < 49 ? 4096 : 0)) & this.f42533);
        c2179.m6771(this.f42530);
        c2179.m6771(this.f42536);
        c2179.m6771(this.f42546);
        for (int i9 = 0; i9 < this.f42546; i9++) {
            c2179.m6771(this.f42541[i9]);
        }
        c2179.m6771(i5);
        for (C18404 c18405 = this.f42523; c18405 != null; c18405 = (C18404) c18405.f56195) {
            c18405.m42688(c2179);
        }
        c2179.m6771(i6);
        boolean zM37238 = false;
        boolean zM37237 = false;
        for (C15583 c15584 = this.f42526; c15584 != null; c15584 = (C15583) c15584.f66498) {
            zM37238 |= c15584.m37238();
            zM37237 |= c15584.m37237();
            c15584.m37233(c2179);
        }
        c2179.m6771(iM964);
        if (this.f42537 != null) {
            c2179.m6771(c23344.m51441("InnerClasses"));
            c2179.m6773(this.f42537.f7888 + 2);
            c2179.m6771(this.f42539);
            C2175 c21710 = this.f42537;
            c2179.m6768(0, c21710.f7888, c21710.f7887);
        }
        if (this.f42547 != 0) {
            c2179.m6771(c23344.m51441("EnclosingMethod"));
            c2179.m6773(4);
            c2179.m6771(this.f42547);
            c2179.m6771(this.f42519);
        }
        if ((this.f42533 & 4096) != 0 && (this.f42522 & 65535) < 49) {
            c2179.m6771(c23344.m51441("Synthetic"));
            c2179.m6773(0);
        }
        if (this.f42532 != 0) {
            c2179.m6771(c23344.m51441("Signature"));
            i2 = 2;
            c2179.m6773(2);
            c2179.m6771(this.f42532);
        } else {
            i2 = 2;
        }
        if (this.f42549 != 0) {
            c2179.m6771(c23344.m51441("SourceFile"));
            c2179.m6773(i2);
            c2179.m6771(this.f42549);
        }
        C2175 c21711 = this.f42524;
        if (c21711 != null) {
            int i10 = c21711.f7888;
            c2179.m6771(c23344.m51441("SourceDebugExtension"));
            c2179.m6773(i10);
            i3 = 0;
            c2179.m6768(0, i10, this.f42524.f7887);
        } else {
            i3 = 0;
        }
        if ((this.f42533 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c2179.m6771(c23344.m51441("Deprecated"));
            c2179.m6773(i3);
        }
        C3460.m10174(this.f42520, this.f42527, this.f42529, this.f42545, this.f42531, c2179);
        c23344.m51458(c2179);
        C0059 c00510 = this.f42538;
        if (c00510 != null) {
            c00510.m963(c2179);
        }
        if (this.f42544 != 0) {
            c2179.m6771(c23344.m51441("NestHost"));
            i4 = 2;
            c2179.m6773(2);
            c2179.m6771(this.f42544);
        } else {
            i4 = 2;
        }
        if (this.f42518 != null) {
            c2179.m6771(c23344.m51441("NestMembers"));
            c2179.m6773(this.f42518.f7888 + i4);
            c2179.m6771(this.f42534);
            C2175 c21712 = this.f42518;
            c2179.m6768(0, c21712.f7888, c21712.f7887);
        }
        if (this.f42525 != null) {
            c2179.m6771(c23344.m51441("PermittedSubclasses"));
            c2179.m6773(this.f42525.f7888 + 2);
            c2179.m6771(this.f42540);
            C2175 c21713 = this.f42525;
            c2179.m6768(0, c21713.f7888, c21713.f7887);
        }
        if ((this.f42533 & 65536) != 0 || this.f42548 != null) {
            c2179.m6771(c23344.m51441("Record"));
            c2179.m6773(iM29959 + 2);
            c2179.m6771(i);
            for (C12055 c12056 = this.f42548; c12056 != null; c12056 = (C12055) c12056.f52465) {
                c12056.m29956(c2179);
            }
        }
        C11349 c113410 = this.f42535;
        if (c113410 != null) {
            c113410.m28430(c23344, c2179);
        }
        if (!zM37237) {
            return c2179.f7887;
        }
        byte[] bArr = c2179.f7887;
        C13466 c13466 = new C13466();
        c13466.m32969(this.f42535);
        for (C18404 c18406 = this.f42523; c18406 != null; c18406 = (C18404) c18406.f56195) {
            c18406.m42689(c13466);
        }
        for (C15583 c15585 = this.f42526; c15585 != null; c15585 = (C15583) c15585.f66498) {
            c15585.m37234(c13466);
        }
        for (C12055 c12057 = this.f42548; c12057 != null; c12057 = (C12055) c12057.f52465) {
            c12057.m29958(c13466);
        }
        C11349[] c11349ArrM32970 = c13466.m32970();
        this.f42523 = null;
        this.f42542 = null;
        this.f42526 = null;
        this.f42528 = null;
        this.f42527 = null;
        this.f42529 = null;
        this.f42545 = null;
        this.f42531 = null;
        this.f42538 = null;
        this.f42544 = 0;
        this.f42534 = 0;
        this.f42518 = null;
        this.f42540 = 0;
        this.f42525 = null;
        this.f42548 = null;
        this.f42543 = null;
        this.f42535 = null;
        this.f42521 = zM37238 ? 3 : 0;
        new C4998(bArr, false).m13868(this, c11349ArrM32970, (zM37238 ? 8 : 0) | 256);
        return m31713();
    }
}
