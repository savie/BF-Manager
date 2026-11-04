package l;

import bin.mt.plus.Features;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۛ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f20713;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f20714;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String[] f20715;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final short f20716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f20717;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f20718;

    public C6068(C20238 c20238, int i) {
        C17254 c17254;
        int i2 = c20238.f64942;
        c20238.f64942 = i;
        int iM46508 = c20238.m46508() - 2;
        this.f20716 = c20238.m46510();
        if (C3084.f10005 != null) {
            Object[] objArrAnalyze = Features.analyze(c20238.m46509(iM46508));
            int i3 = 0;
            byte[] bArr = (byte[]) objArrAnalyze[0];
            byte[] bArr2 = (byte[]) objArrAnalyze[1];
            byte[] bArr3 = (byte[]) objArrAnalyze[2];
            byte[] bArr4 = (byte[]) objArrAnalyze[3];
            int length = bArr3.length / 10;
            int[] iArr = new int[length];
            int[] iArr2 = new int[length];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
            int i4 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
            String[] strArr = new String[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
                byte[] bArr5 = new byte[i6];
                byteArrayInputStream.read(bArr5, i3, i6);
                strArr[i5] = new String(bArr5, StandardCharsets.UTF_8);
                i5++;
                i3 = 0;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3);
            for (int i7 = 0; i7 < length; i7++) {
                byteArrayInputStream2.skip(2L);
                iArr[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
                iArr2[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
            }
            c17254 = new C17254(bArr2, bArr, iArr, iArr2, strArr);
        } else {
            c17254 = new C17254(new C15762(c20238.m46509(iM46508)));
        }
        this.f20717 = c17254.f56207;
        this.f20713 = c17254.f56204;
        this.f20714 = c17254.f56205;
        this.f20718 = c17254.f56208;
        this.f20715 = c17254.f56206;
        c20238.f64942 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17575(C23222 c23222, boolean z) {
        C12033 c12033 = new C12033(this, c23222, z);
        while (true) {
            int i = c12033.f38769;
            c12033.f38769 = i + 1;
            byte b = this.f20717[i];
            byte[] bArr = this.f20713;
            int[] iArr = this.f20718;
            int[] iArr2 = this.f20714;
            C6068 c6068 = c12033.f38771;
            C14270[] c14270Arr = c12033.f38774;
            C14270[] c14270Arr2 = c12033.f38773;
            C19929 c19929 = c12033.f38772;
            switch (b) {
                case 0:
                    short sM30222 = c12033.m30222();
                    C14270 c14270 = (C14270) c19929.m45856();
                    c14270Arr[sM30222] = c14270;
                    c14270.f45086 = false;
                    break;
                case 1:
                    C14270 c14271 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34610(c14271);
                    if (c14271.f45086) {
                        c14271.m34665();
                        c12033.f38770 = c14271;
                    }
                    break;
                case 2:
                    int iM30221 = c12033.m30221();
                    if (!((C14270) c19929.m45856()).m34633()) {
                        c12033.f38768 = iArr2[iM30221];
                        c12033.f38769 = iArr[iM30221];
                    } else if (c12033.f38770 == null) {
                        C14270 c14272 = (C14270) c19929.m45858();
                        if (c14272.f45086) {
                            c14272.m34665();
                            c12033.f38770 = c14272;
                        }
                    } else {
                        c19929.m45858();
                    }
                    break;
                case 3:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c14273 = (C14270) c19929.m45856();
                        c14273.m34663(c14273);
                    } else {
                        C14270 c14274 = (C14270) c19929.m45858();
                        C14270 c14275 = c12033.f38770;
                        if (c14275 == null) {
                            c14275 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c14274.m34663(c14275);
                        c19929.m45857(c14275);
                    }
                    break;
                case 4:
                    C14270 c14276 = c12033.f38770;
                    if (c14276 == null) {
                        c14276 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c14277 = (C14270) c19929.m45858();
                    C14270 c14278 = (C14270) c19929.m45858();
                    c14278.m34643(c14277, c14276);
                    c19929.m45857(c14276);
                    if (c14278.f45086) {
                        c14278.m34665();
                        c12033.f38770 = c14278;
                    } else if (c14277.f45086) {
                        c14277.m34665();
                        c12033.f38770 = c14277;
                    }
                    break;
                case 5:
                    int iM34627 = ((C14270) c19929.m45858()).m34627();
                    C14270 c14279 = c12033.f38770;
                    if (c14279 == null) {
                        c14279 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c14279.m34620(new long[iM34627]);
                    c19929.m45857(c14279);
                    break;
                case 6:
                    int i2 = c12033.f38768;
                    int i3 = i2 + 1;
                    c12033.f38768 = i3;
                    if (bArr[i2] == 0) {
                        int iM52135 = c23222.m52135(new String(bArr, i3, 32));
                        int i4 = c12033.f38768;
                        bArr[i4 - 1] = 1;
                        bArr[i4] = (byte) (iM52135 & 255);
                        bArr[i4 + 1] = (byte) ((iM52135 >>> 8) & 255);
                        bArr[i4 + 2] = (byte) ((iM52135 >>> 16) & 255);
                        bArr[i4 + 3] = (byte) ((iM52135 >>> 24) & 255);
                    }
                    c23222.m52136(c12033.m30221());
                    c12033.f38768 += 28;
                    break;
                case 7:
                    int iM34628 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142710 = c12033.f38770;
                    if (c142710 == null) {
                        c142710 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142710.m34620(new int[iM34628]);
                    c19929.m45857(c142710);
                    break;
                case 8:
                    C14270 c142711 = c12033.f38770;
                    if (c142711 == null) {
                        c142711 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    byte[] bArr2 = c6068.f20713;
                    int i5 = c12033.f38768;
                    c12033.f38768 = i5 + 1;
                    c142711.m34626(bArr2[i5] != 0);
                    c19929.m45857(c142711);
                    break;
                case 9:
                    int iM34629 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142712 = c12033.f38770;
                    if (c142712 == null) {
                        c142712 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142712.m34620(new String[iM34629]);
                    c19929.m45857(c142712);
                    break;
                case 10:
                    C14270 c142713 = c12033.f38770;
                    if (c142713 == null) {
                        c142713 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    int i6 = (c6068.f20713[c12033.f38768 + 1] & 255) << 8;
                    byte[] bArr3 = c6068.f20713;
                    int i7 = c12033.f38768;
                    char c = (char) (i6 | (bArr3[i7] & 255));
                    c12033.f38768 = i7 + 2;
                    c142713.m34615(c);
                    c19929.m45857(c142713);
                    break;
                case 11:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142714 = (C14270) c19929.m45856();
                        c142714.m34635(c142714);
                    } else {
                        C14270 c142715 = (C14270) c19929.m45858();
                        C14270 c142716 = c12033.f38770;
                        if (c142716 == null) {
                            c142716 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142715.m34635(c142716);
                        c19929.m45857(c142716);
                    }
                    break;
                case 12:
                    C14270 c142717 = c12033.f38770;
                    if (c142717 == null) {
                        c142717 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142718 = (C14270) c19929.m45858();
                    C14270 c142719 = (C14270) c19929.m45858();
                    c142719.m34636(c142718, c142717);
                    c19929.m45857(c142717);
                    if (c142719.f45086) {
                        c142719.m34665();
                        c12033.f38770 = c142719;
                    } else if (c142718.f45086) {
                        c142718.m34665();
                        c12033.f38770 = c142718;
                    }
                    break;
                case 13:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142720 = (C14270) c19929.m45856();
                        c142720.m34654(c142720);
                    } else {
                        C14270 c142721 = (C14270) c19929.m45858();
                        C14270 c142722 = c12033.f38770;
                        if (c142722 == null) {
                            c142722 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142721.m34654(c142722);
                        c19929.m45857(c142722);
                    }
                    break;
                case 14:
                    C14270 c142723 = c12033.f38770;
                    if (c142723 == null) {
                        c142723 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142723.m34618(c12033.m30221());
                    c19929.m45857(c142723);
                    break;
                case 15:
                    int iM346210 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142724 = c12033.f38770;
                    if (c142724 == null) {
                        c142724 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142724.m34620(new boolean[iM346210]);
                    c19929.m45857(c142724);
                    break;
                case 16:
                    C14270 c142725 = c12033.f38770;
                    if (c142725 == null) {
                        c142725 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142726 = (C14270) c19929.m45858();
                    c142726.m34644(c142725);
                    c19929.m45857(c142725);
                    if (c142726.f45086) {
                        c142726.m34665();
                        c12033.f38770 = c142726;
                    }
                    break;
                case 17:
                    c19929.m45857(c14270Arr2[c12033.m30222()]);
                    break;
                case 18:
                    int iM30222 = c12033.m30221();
                    c12033.f38768 = iArr2[iM30222];
                    c12033.f38769 = iArr[iM30222];
                    break;
                case 19:
                    int iM346211 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142727 = c12033.f38770;
                    if (c142727 == null) {
                        c142727 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142727.m34620(new float[iM346211]);
                    c19929.m45857(c142727);
                    break;
                case 20:
                    C14270 c142728 = c12033.f38770;
                    if (c142728 == null) {
                        c142728 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142729 = (C14270) c19929.m45858();
                    C14270 c142730 = (C14270) c19929.m45858();
                    c142730.m34611(c142729, c142728);
                    c19929.m45857(c142728);
                    if (c142730.f45086) {
                        c142730.m34665();
                        c12033.f38770 = c142730;
                    } else if (c142729.f45086) {
                        c142729.m34665();
                        c12033.f38770 = c142729;
                    }
                    break;
                case 21:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142731 = (C14270) c19929.m45856();
                        c142731.m34631(c142731);
                    } else {
                        C14270 c142732 = (C14270) c19929.m45858();
                        C14270 c142733 = c12033.f38770;
                        if (c142733 == null) {
                            c142733 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142732.m34631(c142733);
                        c19929.m45857(c142733);
                    }
                    break;
                case 22:
                    C14270 c142734 = c12033.f38770;
                    if (c142734 == null) {
                        c142734 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c14270Arr[c12033.m30222()].m34623(c142734, ((C14270) c19929.m45858()).m34627());
                    c19929.m45857(c142734);
                    break;
                case 23:
                    C14270 c142735 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34656(c142735);
                    if (c142735.f45086) {
                        c142735.m34665();
                        c12033.f38770 = c142735;
                    }
                    break;
                case 24:
                    int i8 = c12033.f38768;
                    int i9 = i8 + 1;
                    c12033.f38768 = i9;
                    if (bArr[i8] == 0) {
                        int iM52137 = c23222.m52137(new String(bArr, i9, 32));
                        int i10 = c12033.f38768;
                        bArr[i10 - 1] = 1;
                        bArr[i10] = (byte) (iM52137 & 255);
                        bArr[i10 + 1] = (byte) ((iM52137 >>> 8) & 255);
                        bArr[i10 + 2] = (byte) ((iM52137 >>> 16) & 255);
                        bArr[i10 + 3] = (byte) ((iM52137 >>> 24) & 255);
                    }
                    c23222.m52138(c12033.m30221());
                    c12033.f38768 += 28;
                    break;
                case 25:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142736 = (C14270) c19929.m45856();
                        c142736.m34642(c142736);
                    } else {
                        C14270 c142737 = (C14270) c19929.m45858();
                        C14270 c142738 = c12033.f38770;
                        if (c142738 == null) {
                            c142738 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142737.m34642(c142738);
                        c19929.m45857(c142738);
                    }
                    break;
                case 26:
                    c19929.m45858();
                    break;
                case 27:
                    int iM346212 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142739 = c12033.f38770;
                    if (c142739 == null) {
                        c142739 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142739.m34620(new char[iM346212]);
                    c19929.m45857(c142739);
                    break;
                case 28:
                    C14270 c142740 = c12033.f38770;
                    if (c142740 == null) {
                        c142740 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142741 = (C14270) c19929.m45858();
                    C14270 c142742 = (C14270) c19929.m45858();
                    c142742.m34664(c142741, c142740);
                    c19929.m45857(c142740);
                    if (c142742.f45086) {
                        c142742.m34665();
                        c12033.f38770 = c142742;
                    } else if (c142741.f45086) {
                        c142741.m34665();
                        c12033.f38770 = c142741;
                    }
                    break;
                case 29:
                    c14270Arr2[c12033.m30222()].m34650();
                    break;
                case 30:
                    C14270 c142743 = c12033.f38770;
                    if (c142743 == null) {
                        c142743 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142744 = (C14270) c19929.m45858();
                    C14270 c142745 = (C14270) c19929.m45858();
                    c142745.m34671(c142744, c142743);
                    c19929.m45857(c142743);
                    if (c142745.f45086) {
                        c142745.m34665();
                        c12033.f38770 = c142745;
                    } else if (c142744.f45086) {
                        c142744.m34665();
                        c12033.f38770 = c142744;
                    }
                    break;
                case 31:
                    C14270 c142746 = c12033.f38770;
                    if (c142746 == null) {
                        c142746 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142746.m34617(Float.intBitsToFloat(c12033.m30221()));
                    c19929.m45857(c142746);
                    break;
                case 32:
                    int iM30223 = c12033.m30221();
                    if (((C14270) c19929.m45856()).m34633()) {
                        c12033.f38768 = iArr2[iM30223];
                        c12033.f38769 = iArr[iM30223];
                    } else if (c12033.f38770 == null) {
                        C14270 c142747 = (C14270) c19929.m45858();
                        if (c142747.f45086) {
                            c142747.m34665();
                            c12033.f38770 = c142747;
                        }
                    } else {
                        c19929.m45858();
                    }
                    break;
                case 33:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142748 = (C14270) c19929.m45856();
                        c142748.m34628(c142748);
                    } else {
                        C14270 c142749 = (C14270) c19929.m45858();
                        C14270 c142750 = c12033.f38770;
                        if (c142750 == null) {
                            c142750 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142749.m34628(c142750);
                        c19929.m45857(c142750);
                    }
                    break;
                case 34:
                    C14270 c142751 = c12033.f38770;
                    if (c142751 == null) {
                        c142751 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142752 = (C14270) c19929.m45858();
                    c142752.m34651(c142751);
                    c19929.m45857(c142751);
                    if (c142752.f45086) {
                        c142752.m34665();
                        c12033.f38770 = c142752;
                    }
                    break;
                case 35:
                    int iM346213 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142753 = c12033.f38770;
                    if (c142753 == null) {
                        c142753 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142753.m34620(new double[iM346213]);
                    c19929.m45857(c142753);
                    break;
                case 36:
                    C14270 c142754 = c12033.f38770;
                    if (c142754 == null) {
                        c142754 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142754.m34618(c14270Arr[c12033.m30222()].m34658());
                    c19929.m45857(c142754);
                    break;
                case 37:
                    c14270Arr2[c12033.m30222()].m34613();
                    break;
                case 38:
                    C14270 c142755 = c12033.f38770;
                    if (c142755 == null) {
                        c142755 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142756 = (C14270) c19929.m45858();
                    C14270 c142757 = (C14270) c19929.m45858();
                    c142757.m34661(c142756, c142755);
                    c19929.m45857(c142755);
                    if (c142757.f45086) {
                        c142757.m34665();
                        c12033.f38770 = c142757;
                    } else if (c142756.f45086) {
                        c142756.m34665();
                        c12033.f38770 = c142756;
                    }
                    break;
                case 39:
                    C14270 c142758 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34670(c142758);
                    if (c142758.f45086) {
                        c142758.m34665();
                        c12033.f38770 = c142758;
                    }
                    break;
                case 40:
                    c14270Arr[c12033.m30222()].m34650();
                    break;
                case 41:
                    C14270 c142759 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34666(c142759);
                    if (c142759.f45086) {
                        c142759.m34665();
                        c12033.f38770 = c142759;
                    }
                    break;
                case 42:
                    C14270 c142760 = c12033.f38770;
                    if (c142760 == null) {
                        c142760 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142761 = (C14270) c19929.m45858();
                    C14270 c142762 = (C14270) c19929.m45858();
                    c142762.m34624(c142761, c142760);
                    c19929.m45857(c142760);
                    if (c142762.f45086) {
                        c142762.m34665();
                        c12033.f38770 = c142762;
                    } else if (c142761.f45086) {
                        c142761.m34665();
                        c12033.f38770 = c142761;
                    }
                    break;
                case 43:
                    C14270 c142763 = c12033.f38770;
                    if (c142763 == null) {
                        c142763 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142763.m34621(this.f20715[c12033.m30221()]);
                    c19929.m45857(c142763);
                    break;
                case 44:
                    C14270 c142764 = c12033.f38770;
                    if (c142764 == null) {
                        c142764 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142765 = (C14270) c19929.m45858();
                    C14270 c142766 = (C14270) c19929.m45858();
                    c142766.m34649(c142765, c142764);
                    c19929.m45857(c142764);
                    if (c142766.f45086) {
                        c142766.m34665();
                        c12033.f38770 = c142766;
                    } else if (c142765.f45086) {
                        c142765.m34665();
                        c12033.f38770 = c142765;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C14270 c142767 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34637(c142767);
                    if (c142767.f45086) {
                        c142767.m34665();
                        c12033.f38770 = c142767;
                    }
                    break;
                case 46:
                    return;
                case 47:
                    short sM30223 = c12033.m30222();
                    C14270 c142768 = (C14270) c19929.m45856();
                    c14270Arr2[sM30223] = c142768;
                    c142768.f45086 = false;
                    break;
                case 48:
                    C14270 c142769 = c12033.f38770;
                    if (c142769 == null) {
                        c142769 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142770 = (C14270) c19929.m45858();
                    C14270 c142771 = (C14270) c19929.m45858();
                    c142771.m34655(c142770, c142769);
                    c19929.m45857(c142769);
                    if (c142771.f45086) {
                        c142771.m34665();
                        c12033.f38770 = c142771;
                    } else if (c142770.f45086) {
                        c142770.m34665();
                        c12033.f38770 = c142770;
                    }
                    break;
                case 49:
                    short sM30224 = c12033.m30222();
                    C14270 c142772 = (C14270) c19929.m45858();
                    c14270Arr2[sM30224] = c142772;
                    c142772.f45086 = false;
                    break;
                case 50:
                    if (((C14270) c19929.m45858()).m34633()) {
                        int iM30224 = c12033.m30221();
                        c12033.f38768 = iArr2[iM30224];
                        c12033.f38769 = iArr[iM30224];
                    } else {
                        c12033.f38768 += 4;
                    }
                    break;
                case 51:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142773 = (C14270) c19929.m45856();
                        c142773.m34639(c142773);
                    } else {
                        C14270 c142774 = (C14270) c19929.m45858();
                        C14270 c142775 = c12033.f38770;
                        if (c142775 == null) {
                            c142775 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c142774.m34639(c142775);
                        c19929.m45857(c142775);
                    }
                    break;
                case 52:
                    if (!((C14270) c19929.m45858()).m34633()) {
                        int iM30225 = c12033.m30221();
                        c12033.f38768 = iArr2[iM30225];
                        c12033.f38769 = iArr[iM30225];
                    } else {
                        c12033.f38768 += 4;
                    }
                    break;
                case 53:
                    C14270 c142776 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34648(c142776);
                    if (c142776.f45086) {
                        c142776.m34665();
                        c12033.f38770 = c142776;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    C14270 c142777 = c12033.f38770;
                    if (c142777 == null) {
                        c142777 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142778 = (C14270) c19929.m45858();
                    C14270 c142779 = (C14270) c19929.m45858();
                    c142779.m34640(c142778, c142777);
                    c19929.m45857(c142777);
                    if (c142779.f45086) {
                        c142779.m34665();
                        c12033.f38770 = c142779;
                    } else if (c142778.f45086) {
                        c142778.m34665();
                        c12033.f38770 = c142778;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    C14270 c142780 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34622(c142780);
                    if (c142780.f45086) {
                        c142780.m34665();
                        c12033.f38770 = c142780;
                    }
                    break;
                case 56:
                    C14270 c142781 = c12033.f38770;
                    if (c142781 == null) {
                        c142781 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142782 = (C14270) c19929.m45858();
                    C14270 c142783 = (C14270) c19929.m45858();
                    c142783.m34667(c142782, c142781);
                    c19929.m45857(c142781);
                    if (c142783.f45086) {
                        c142783.m34665();
                        c12033.f38770 = c142783;
                    } else if (c142782.f45086) {
                        c142782.m34665();
                        c12033.f38770 = c142782;
                    }
                    break;
                case 57:
                    C14270 c142784 = c12033.f38770;
                    if (c142784 == null) {
                        c142784 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c14270Arr2[c12033.m30222()].m34623(c142784, ((C14270) c19929.m45858()).m34627());
                    c19929.m45857(c142784);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    C14270 c142785 = c12033.f38770;
                    if (c142785 == null) {
                        c142785 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142786 = (C14270) c19929.m45858();
                    C14270 c142787 = (C14270) c19929.m45858();
                    c142787.m34632(c142786, c142785);
                    c19929.m45857(c142785);
                    if (c142787.f45086) {
                        c142787.m34665();
                        c12033.f38770 = c142787;
                    } else if (c142786.f45086) {
                        c142786.m34665();
                        c12033.f38770 = c142786;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    C14270 c142788 = c12033.f38770;
                    if (c142788 == null) {
                        c142788 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142788.m34616(Double.longBitsToDouble(c12033.m30223()));
                    c19929.m45857(c142788);
                    break;
                case 60:
                    C14270 c142789 = c12033.f38770;
                    if (c142789 == null) {
                        c142789 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142790 = (C14270) c19929.m45858();
                    C14270 c142791 = (C14270) c19929.m45858();
                    c142791.m34645(c142790, c142789);
                    c19929.m45857(c142789);
                    if (c142791.f45086) {
                        c142791.m34665();
                        c12033.f38770 = c142791;
                    } else if (c142790.f45086) {
                        c142790.m34665();
                        c12033.f38770 = c142790;
                    }
                    break;
                case 61:
                    C14270 c142792 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34630(c142792);
                    if (c142792.f45086) {
                        c142792.m34665();
                        c12033.f38770 = c142792;
                    }
                    break;
                case 62:
                    C14270 c142793 = c12033.f38770;
                    if (c142793 == null) {
                        c142793 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142793.m34619(c12033.m30223());
                    c19929.m45857(c142793);
                    break;
                case 63:
                    C14270 c142794 = c12033.f38770;
                    if (c142794 == null) {
                        c142794 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142794.m34625(c12033.m30222());
                    c19929.m45857(c142794);
                    break;
                case 64:
                    c19929.m45857(c14270Arr[c12033.m30222()]);
                    break;
                case 65:
                    int iM346214 = ((C14270) c19929.m45858()).m34627();
                    C14270 c142795 = c12033.f38770;
                    if (c142795 == null) {
                        c142795 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c142795.m34620(new Object[iM346214]);
                    c19929.m45857(c142795);
                    break;
                case 66:
                    C14270 c142796 = c12033.f38770;
                    if (c142796 == null) {
                        c142796 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c142797 = (C14270) c19929.m45858();
                    C14270 c142798 = (C14270) c19929.m45858();
                    c142798.m34609(c142797, c142796);
                    c19929.m45857(c142796);
                    if (c142798.f45086) {
                        c142798.m34665();
                        c12033.f38770 = c142798;
                    } else if (c142797.f45086) {
                        c142797.m34665();
                        c12033.f38770 = c142797;
                    }
                    break;
                case 67:
                    if (((C14270) c19929.m45856()).f45086) {
                        C14270 c142799 = (C14270) c19929.m45856();
                        c142799.m34608(c142799);
                    } else {
                        C14270 c1427100 = (C14270) c19929.m45858();
                        C14270 c1427101 = c12033.f38770;
                        if (c1427101 == null) {
                            c1427101 = new C14270();
                        } else {
                            c12033.f38770 = null;
                        }
                        c1427100.m34608(c1427101);
                        c19929.m45857(c1427101);
                    }
                    break;
                case 68:
                    C14270 c1427102 = c12033.f38770;
                    if (c1427102 == null) {
                        c1427102 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c1427103 = (C14270) c19929.m45858();
                    C14270 c1427104 = (C14270) c19929.m45858();
                    c1427104.m34629(c1427103, c1427102);
                    c19929.m45857(c1427102);
                    if (c1427104.f45086) {
                        c1427104.m34665();
                        c12033.f38770 = c1427104;
                    } else if (c1427103.f45086) {
                        c1427103.m34665();
                        c12033.f38770 = c1427103;
                    }
                    break;
                case 69:
                    c14270Arr2[c12033.m30222()].m34660((C14270) c19929.m45858(), ((C14270) c19929.m45858()).m34627());
                    break;
                case 70:
                    c14270Arr[c12033.m30222()].m34613();
                    break;
                case 71:
                    int iM346215 = ((C14270) c19929.m45858()).m34627();
                    C14270 c1427105 = c12033.f38770;
                    if (c1427105 == null) {
                        c1427105 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c1427105.m34620(new byte[iM346215]);
                    c19929.m45857(c1427105);
                    break;
                case 72:
                    c14270Arr[c12033.m30222()].m34660((C14270) c19929.m45858(), ((C14270) c19929.m45858()).m34627());
                    break;
                case 73:
                    C14270 c1427106 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34612(c1427106);
                    if (c1427106.f45086) {
                        c1427106.m34665();
                        c12033.f38770 = c1427106;
                    }
                    break;
                case 74:
                    C14270 c1427107 = c12033.f38770;
                    if (c1427107 == null) {
                        c1427107 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c1427108 = (C14270) c19929.m45858();
                    C14270 c1427109 = (C14270) c19929.m45858();
                    c1427109.m34657(c1427108, c1427107);
                    c19929.m45857(c1427107);
                    if (c1427109.f45086) {
                        c1427109.m34665();
                        c12033.f38770 = c1427109;
                    } else if (c1427108.f45086) {
                        c1427108.m34665();
                        c12033.f38770 = c1427108;
                    }
                    break;
                case 75:
                    C14270 c1427110 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34659(c1427110);
                    if (c1427110.f45086) {
                        c1427110.m34665();
                        c12033.f38770 = c1427110;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    C14270 c1427111 = c12033.f38770;
                    if (c1427111 == null) {
                        c1427111 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    byte[] bArr4 = c6068.f20713;
                    int i11 = c12033.f38768;
                    c12033.f38768 = i11 + 1;
                    c1427111.m34614(bArr4[i11]);
                    c19929.m45857(c1427111);
                    break;
                case 77:
                    C14270 c1427112 = (C14270) c19929.m45858();
                    ((C14270) c19929.m45858()).m34668(c1427112);
                    if (c1427112.f45086) {
                        c1427112.m34665();
                        c12033.f38770 = c1427112;
                    }
                    break;
                case 78:
                    short sM30225 = c12033.m30222();
                    C14270 c1427113 = (C14270) c19929.m45858();
                    c14270Arr[sM30225] = c1427113;
                    c1427113.f45086 = false;
                    break;
                case 79:
                    int iM346216 = ((C14270) c19929.m45858()).m34627();
                    C14270 c1427114 = c12033.f38770;
                    if (c1427114 == null) {
                        c1427114 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c1427114.m34620(new short[iM346216]);
                    c19929.m45857(c1427114);
                    break;
                case 80:
                    C14270 c1427115 = c12033.f38770;
                    if (c1427115 == null) {
                        c1427115 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    C14270 c1427116 = (C14270) c19929.m45858();
                    C14270 c1427117 = (C14270) c19929.m45858();
                    c1427117.m34652(c1427116, c1427115);
                    c19929.m45857(c1427115);
                    if (c1427117.f45086) {
                        c1427117.m34665();
                        c12033.f38770 = c1427117;
                    } else if (c1427116.f45086) {
                        c1427116.m34665();
                        c12033.f38770 = c1427116;
                    }
                    break;
                case 81:
                    C14270 c1427118 = c12033.f38770;
                    if (c1427118 == null) {
                        c1427118 = new C14270();
                    } else {
                        c12033.f38770 = null;
                    }
                    c1427118.m34618(c14270Arr2[c12033.m30222()].m34658());
                    c19929.m45857(c1427118);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
