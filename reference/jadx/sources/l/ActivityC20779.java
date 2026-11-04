package l;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩵᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20779 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ᩶ۙ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f66564 = {3564, -31623, -31643, -31620, -31634, -31648, -31641, -31658, -31648, -31638, -31642, -31641, -31623, -31643, -31620, -31634, -31648, -31641, -31680, -31635, -31621, -31636, -31643, -31642, -31640, -31635, -31680, -31638, -31642, -31641, -31633, -31621, -31642, -31644, -31667, -31636, -31617, -31636, -31643, -31642, -31623, -31636, -31621, -31675, -31648, -31622, -31619, 5151, -29868, 16755, 28670, 4592, 4595, 4528, 4521, 4525, 4917, -16908, -27460, 22979, 430, -31876, 32651, -31494, 31511, 31702, 21190, 30939, 27405, 28997, 8586, -22851, 26499, 19704, -20667, 27822, 25607, 23256, 19059, -21618, 22645, 20709, -22752, 15296, 15324, 15301, 15319, 15321, 15326, 15353, 15316, 15298, 15317, 15324, 15327, 15313, 15316, 15353, 15315, 15327, 15326, 15325, 15300, 15296, 15324, 15301, 15319, 15321, 15326, 17318, -18631, 21325, 19793, -18912, 18381, -23407, -16878, -17554, 16825, 23806, -18333, -17819, 19172, -22149, 28473, -23903, -17450, -20997, -22381, 24110, 21049, 21292, 24024, -20239, -23520, -20993, 26754, 19623, 23476, -22588, -17403, 23305, 20117, -17494, 24871, 16651, -24373, 17506, 15296, 15324, 15301, 15319, 15321, 15326, 15343, 15321, 15315, 15327, 15326, 5624, 25301, 21312, 19346, 18473, -26724, 31079, 7901, 25407, -17319, 25194, -21404, -17113, -17865, -17281, 27042, -21644, 18462, -20191, 27676, -16879, 20860, -20147, 15118, 15122, 15115, 15129, 15127, 15120, 15159, 15130, 28441, -23170, 21379, 20673, 22913, -20656, 23699, 19915, -20470, 24657, 17472, -18680, 3983, 4176, 4204, 4213, 4199, 4201, 4206, 4169, 4206, 4198, 4207, 4161, 4195, 4212, 4201, 4214, 4201, 4212, 4217};

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66565 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public Button f66566;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66567;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public ImageView f66568;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66569;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66570;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66571;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public ViewGroup f66572;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66573;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public String f66574;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public View f66575;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C11192 f66576;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public TextView f66577;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f66578;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public TextView f66579;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public TextView f66580;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final C24720 f66581 = C24720.m55197();

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -268514383;
        int i8 = C11235.f35427;
        int i9 = C2834.f9334;
        int iM3169 = C0773.m3169("۬֨") ^ i8;
        int i10 = ((iM3169 ^ i9) * 23747) ^ 849238100;
        int i11 = -94584924;
        while (true) {
            i7 = ((((i7 ^ i9) * 9667) >> 31) & i10) ^ (iM3169 ^ i11);
            switch (i7) {
                case -2092433926:
                case -245525660:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("ۚܿ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-28353)) ^ (-242025142);
                        i11 = -210593698;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    }
                    break;
                case -2038060467:
                case -424452631:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (i9 - C0619.m2761("᩺ۙ")) * (-27);
                        i10 = ((iM3169 ^ i8) * 3519) ^ 992913864;
                        i11 = -124616228;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩺") + i9) * (-79);
                        i10 = ((iM3169 ^ i8) * (-22611)) ^ (-2050910403);
                        i11 = 707542418;
                    }
                    break;
                case -1854364205:
                case 1245423607:
                    C1343.m4943();
                    return null;
                case -1764026429:
                case -945630439:
                    sArr2 = f66564;
                    i6 = 203;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ۙ᩸") ^ i8) * 75;
                        i10 = ((iM3169 ^ i9) * (-11723)) ^ (-1815505149);
                        i11 = -1368152516;
                    } else {
                        iM3169 = C0773.m3169("᩵ܶ") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-21745)) ^ 1428680477;
                        i11 = -767466466;
                    }
                    break;
                case -1660163409:
                case 1039799001:
                    return C2878.m9486(sArr2, i6, 18, i5);
                case -1509644827:
                case 1317741371:
                    C3033.m9845();
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i9 - C0619.m2761("᩺ۙ")) * (-27);
                        i10 = ((iM3169 ^ i8) * 3519) ^ 992913864;
                        i11 = -124616228;
                    } else {
                        iM3169 = C0773.m3169("ۚܿ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-28353)) ^ (-242025142);
                        i11 = -210593698;
                    }
                    break;
                case -1378146532:
                case -874852749:
                    c = 202;
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩶") ^ i8) * (-107);
                        i10 = ((iM3169 ^ i9) * 20347) ^ 2100459843;
                        i11 = -1236657933;
                    }
                    break;
                case -1345842694:
                case 1636855983:
                    C3734.m12152();
                    iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                    i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                    i11 = 1730853499;
                    break;
                case -1115280681:
                case -145981539:
                    i5 = 22226;
                    iM3169 = C0619.m2761("ᩳ۬") ^ i9;
                    i10 = ((iM3169 ^ i8) * 22699) ^ 1091309253;
                    i11 = -644769590;
                    break;
                case -927156231:
                case 1361706594:
                    i5 = 4096;
                    iM3169 = C0619.m2761("ᩳ۬") ^ i9;
                    i10 = ((iM3169 ^ i8) * 22699) ^ 1091309253;
                    i11 = -644769590;
                    break;
                case -800930198:
                case -315190080:
                    if (C3690.m11987()) {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    } else {
                        iM3169 = C0619.m2761("ۖܺ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 18407) ^ 2049218427;
                        i11 = -457041962;
                    }
                    break;
                case -635281517:
                case 779450270:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) <= 0) {
                        iM3169 = C0619.m2761("ۤۨ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 4627) ^ 429844379;
                        i11 = 1516132393;
                    } else {
                        iM3169 = (C0619.m2761("ܺۘ") ^ i8) * (-91);
                        i10 = ((iM3169 ^ i9) * 5779) ^ 1296781516;
                        i11 = 1960328485;
                    }
                    break;
                case -562771202:
                case 1526963465:
                    C3492.m11488();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۚܿ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-28353)) ^ (-242025142);
                        i11 = -210593698;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") ^ i9) * 79;
                        i10 = ((iM3169 ^ i8) * 24991) ^ (-1246512444);
                        i11 = -187072568;
                    }
                    break;
                case -389849906:
                case -2158632:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3998.f13671 != 0) {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ᩴۛ")) * 115;
                        i10 = ((iM3169 ^ i9) * 11771) ^ 418306539;
                        i11 = -1460131196;
                    }
                    break;
                case -150778971:
                case 1389474419:
                    i4 = 1527696;
                    if (C3077.f9998) {
                        iM3169 = (i9 - C0619.m2761("ܳܺ")) * (-33);
                        i10 = ((iM3169 ^ i8) * 13787) ^ 1919616252;
                        i11 = 499064036;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    }
                    break;
                case 762478244:
                case 1656180026:
                    s = sArr[c];
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i9 - C0619.m2761("᩺ۙ")) * (-27);
                        i10 = ((iM3169 ^ i8) * 3519) ^ 992913864;
                        i11 = -124616228;
                    } else {
                        iM3169 = (C0619.m2761("۬۬") ^ i9) * 17;
                        i10 = ((iM3169 ^ i8) * 25661) ^ 1620835359;
                        i11 = 508041661;
                    }
                    break;
                case 872428208:
                case 1757302988:
                    sArr = f66564;
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i8 - C0773.m3169("ᩳ֫")) * 77;
                        i10 = ((iM3169 ^ i9) * (-1353)) ^ (-500354080);
                        i11 = 1730853499;
                    } else {
                        iM3169 = C0773.m3169("ۚ֨") ^ i9;
                        i10 = ((iM3169 ^ i8) * 8367) ^ (-826158852);
                        i11 = -1568670946;
                    }
                    break;
                case 997948934:
                case 1570239725:
                    i = s + 1236;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۙ᩸") ^ i8) * 75;
                        i10 = ((iM3169 ^ i9) * (-11723)) ^ (-1815505149);
                        i11 = -1368152516;
                    } else {
                        iM3169 = (C0773.m3169("ܿۧ") ^ i9) * 61;
                        i10 = ((iM3169 ^ i8) * (-10301)) ^ (-2061636334);
                        i11 = 213631542;
                    }
                    break;
                default:
                    if (RunnableC1848.f6235) {
                        iM3169 = (i9 - C0619.m2761("᩺ۙ")) * (-27);
                        i10 = ((iM3169 ^ i8) * 3519) ^ 992913864;
                        i11 = -124616228;
                    } else {
                        iM3169 = (C0619.m2761("ۜ᩵") + i8) * 81;
                        i10 = ((iM3169 ^ i9) * 1477) ^ (-2054304635);
                        i11 = -10990032;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0177 A[PHI: r2 r16
      0x0177: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:39:0x0175, B:35:0x0146, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r16v21 int) = (r16v12 int), (r16v13 int), (r16v22 int) binds: [B:39:0x0175, B:35:0x0146, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02e6 A[PHI: r4 r5 r6 r7 r16
      0x02e6: PHI (r4v6 short[]) = (r4v1 short[]), (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:66:0x02e4, B:54:0x0249, B:50:0x0220, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r5v6 char) = (r5v1 char), (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:66:0x02e4, B:54:0x0249, B:50:0x0220, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r6v6 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:66:0x02e4, B:54:0x0249, B:50:0x0220, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r7v6 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:66:0x02e4, B:54:0x0249, B:50:0x0220, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r16v25 int) = (r16v3 int), (r16v6 int), (r16v7 int), (r16v26 int) binds: [B:66:0x02e4, B:54:0x0249, B:50:0x0220, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (l.C1564.f5401 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (l.C3099.f10023 <= 0) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47538(l.AbstractActivityC17204 r18, java.lang.String r19, android.graphics.drawable.Drawable r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC20779.m47538(l.ܽ֡֫, java.lang.String, android.graphics.drawable.Drawable, boolean, java.lang.String):void");
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        TextView textView = null;
        int i = 0;
        int i2 = 960276408;
        int i3 = AbstractC3624.f12429;
        int i4 = C1826.f6190;
        int iM2761 = (C0619.m2761("۫۠") + i3) * (-31);
        int i5 = ((iM2761 ^ i4) * 21439) ^ 836114800;
        int i6 = -520235694;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-2401)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1940765133:
                    case 28814826:
                        RunnableC1848.m6360();
                        break;
                    case -1897374046:
                    case 584844392:
                        if (AbstractC0641.m2813() > 0) {
                            iM2761 = (C0619.m2761("᩸ܶ") ^ i3) * (-83);
                            i5 = ((iM2761 ^ i4) * (-11861)) ^ (-1266931491);
                            i6 = -1091803569;
                        } else {
                            iM2761 = (i3 - C0619.m2761("᩹ܰ")) * 123;
                            i5 = ((iM2761 ^ i4) * (-31283)) ^ (-23165172);
                            i6 = 30352226;
                        }
                        break;
                    case -1820782232:
                    case 914052524:
                        C2966.m9664();
                        if (C1826.f6190 <= 0) {
                            iM2761 = C0773.m3169("֡۫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-5897)) ^ 548212056;
                            i6 = -2145933852;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܺ֨")) * (-11);
                            i5 = ((iM2761 ^ i3) * (-15201)) ^ (-784143424);
                            i6 = 644015550;
                        }
                        break;
                    case -1594951028:
                    case 1132211604:
                        C4238.m13540();
                        if (C3492.f12043 <= 0) {
                            iM2761 = C0619.m2761("᩷۫") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20461) ^ 1480616641;
                            i6 = -140568101;
                        } else {
                            iM2761 = C0773.m3169("֡۫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-5897)) ^ 548212056;
                            i6 = -2145933852;
                        }
                        break;
                    case -1591137467:
                    case 1076040297:
                        if (!RunnableC1848.f6235) {
                            iM2761 = C0773.m3169("ۜᩴ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 14283) ^ (-1425566086);
                            i6 = -292876985;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܺ֨")) * (-11);
                            i5 = ((iM2761 ^ i3) * (-15201)) ^ (-784143424);
                            i6 = 644015550;
                        }
                        break;
                    case -1563421218:
                    case -922018290:
                        m47556();
                        iM2761 = (C0619.m2761("۟۠") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2761 ^ i3) * 5655) ^ 465470320;
                        i6 = -1427209750;
                    case -1519990379:
                    case 928593384:
                        textView = this.f66573;
                        if (C3448.f11240 < 0) {
                            iM2761 = (C0619.m2761("֫ۡ") ^ i4) * (-29);
                            i5 = ((iM2761 ^ i3) * (-8037)) ^ 493263777;
                            i6 = 1238221205;
                        } else {
                            iM2761 = (i3 - C0619.m2761("᩹ܰ")) * 123;
                            i5 = ((iM2761 ^ i4) * (-31283)) ^ (-23165172);
                            i6 = 30352226;
                        }
                        break;
                    case -1501137122:
                    case -854698852:
                        if (C1826.f6190 > 0) {
                            iM2761 = C0619.m2761("۟ۙ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 15393) ^ (-1304724451);
                            i6 = -368200033;
                        } else {
                            iM2761 = C0619.m2761("᩷۫") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20461) ^ 1480616641;
                            i6 = -140568101;
                        }
                        break;
                    case -1039521150:
                    case 1466228530:
                        if (!C1321.m4852()) {
                            iM2761 = (i4 - C0619.m2761("ܺ֨")) * (-11);
                            i5 = ((iM2761 ^ i3) * (-15201)) ^ (-784143424);
                            i6 = 644015550;
                            break;
                        }
                        iM2761 = (C0619.m2761("۫ۚ") + i4) * 93;
                        i5 = ((iM2761 ^ i3) * (-22347)) ^ 1101091794;
                        i6 = 1667290661;
                        break;
                    case -1036486091:
                    case 785461357:
                        super.onResume();
                        if (C2310.f7472 < 0) {
                            iM2761 = (C0773.m3169("֫۟") ^ i4) * (-15);
                            i5 = ((iM2761 ^ i3) * 29659) ^ (-2001614765);
                            i6 = -460099491;
                        } else {
                            iM2761 = C0619.m2761("᩷۫") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20461) ^ 1480616641;
                            i6 = -140568101;
                        }
                        break;
                    case -990603589:
                    case -241055987:
                        if (!C1783.m6232()) {
                            iM2761 = (i3 - C0619.m2761("᩹ܰ")) * 123;
                            i5 = ((iM2761 ^ i4) * (-31283)) ^ (-23165172);
                            i6 = 30352226;
                            break;
                        }
                        iM2761 = (i3 - C0773.m3169("ᩳ᩷")) * (-69);
                        i5 = ((iM2761 ^ i4) * 21809) ^ 286121943;
                        i6 = 795944092;
                        break;
                    case -872793276:
                    case 2054664605:
                        C0619.m2763();
                        C4238.m13540();
                        iM2761 = (i4 - C0619.m2761("ܺ֨")) * (-11);
                        i5 = ((iM2761 ^ i3) * (-15201)) ^ (-784143424);
                        i6 = 644015550;
                        break;
                    case -843130408:
                    case 1467781253:
                        if (this.f66575.getVisibility() != i) {
                            iM2761 = (C0619.m2761("۟۠") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2761 ^ i3) * 5655) ^ 465470320;
                            i6 = -1427209750;
                            break;
                        }
                        iM2761 = (C0619.m2761("۟ۢ") ^ i3) * 23;
                        i5 = ((iM2761 ^ i4) * (-1943)) ^ (-1005095336);
                        i6 = 1890616945;
                        break;
                    case -667802714:
                    case 1970639300:
                        if (textView.getVisibility() != 8) {
                            i = 8;
                            iM2761 = (C0619.m2761("۟۠") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2761 ^ i3) * 5655) ^ 465470320;
                            i6 = -1427209750;
                        }
                        int iM2762 = C0619.m2761("᩸ۤ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-16645)) ^ (-636057626);
                        i7 = iM2762 ^ (-2041525890);
                        i = 8;
                        break;
                        break;
                    case -492872035:
                    case 1986928822:
                        if (C2287.f7432 < 0) {
                            iM2761 = (i3 - C0619.m2761("ۡܽ")) * (-7);
                            i5 = ((iM2761 ^ i4) * (-4609)) ^ 1514136439;
                            i6 = 780402268;
                        } else {
                            iM2761 = (C0619.m2761("ܳܶ") + i4) * (-113);
                            i5 = ((iM2761 ^ i3) * 7647) ^ (-1763970308);
                            i6 = 890390722;
                        }
                        break;
                    case -413069700:
                    case 593655458:
                        break;
                    case -256941119:
                    case 2024368803:
                        if (C3779.f12953 > 0) {
                            iM2761 = (C0619.m2761("ܳܶ") + i4) * (-113);
                            i5 = ((iM2761 ^ i3) * 7647) ^ (-1763970308);
                            i6 = 890390722;
                            break;
                        }
                        iM2761 = (i4 - C0619.m2761("ܺ֨")) * (-11);
                        i5 = ((iM2761 ^ i3) * (-15201)) ^ (-784143424);
                        i6 = 644015550;
                        break;
                    case -232890850:
                    case 2031014270:
                        if (C2419.m8174() < 0) {
                            iM2761 = C0773.m3169("ᩴۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 13029) ^ (-718213991);
                            i6 = 1031811483;
                        } else {
                            iM2761 = (C0619.m2761("ܳܶ") + i4) * (-113);
                            i5 = ((iM2761 ^ i3) * 7647) ^ (-1763970308);
                            i6 = 890390722;
                        }
                        break;
                    default:
                        if (C23916.m53419() == 0) {
                            iM2761 = (C0619.m2761("۠ᩴ") ^ i4) * 59;
                            i5 = ((iM2761 ^ i3) * (-30893)) ^ 1450171773;
                            i6 = 14343400;
                        } else {
                            iM2761 = C0773.m3169("֡۫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-5897)) ^ 548212056;
                            i6 = -2145933852;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x020c A[PHI: r4 r5 r6 r7 r16
      0x020c: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:60:0x020a, B:56:0x01e8, B:52:0x01c3, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:60:0x020a, B:56:0x01e8, B:52:0x01c3, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:60:0x020a, B:56:0x01e8, B:52:0x01c3, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:60:0x020a, B:56:0x01e8, B:52:0x01c3, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r16v26 int) = (r16v12 int), (r16v13 int), (r16v14 int), (r16v28 int) binds: [B:60:0x020a, B:56:0x01e8, B:52:0x01c3, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[PHI: r2 r3 r9 r16
      0x0254: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:65:0x0252, B:11:0x0041, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r3v3 char) = (r3v2 char), (r3v2 char), (r3v6 char) binds: [B:65:0x0252, B:11:0x0041, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r9v6 short[]) = (r9v2 short[]), (r9v5 short[]), (r9v2 short[]) binds: [B:65:0x0252, B:11:0x0041, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r16v29 int) = (r16v11 int), (r16v27 int), (r16v32 int) binds: [B:65:0x0252, B:11:0x0041, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (l.C2702.f8586 <= 0) goto L15;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m47545(l.ActivityC20779 r18) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC20779.m47545(l.᩵᩵֫):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01d1 A[PHI: r14
      0x01d1: PHI (r14v44 int) = (r14v43 int), (r14v2 int) binds: [B:41:0x01cf, B:18:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02e7 A[PHI: r13 r25
      0x02e7: PHI (r13v5 android.view.View) = (r13v4 android.view.View), (r13v2 android.view.View), (r13v2 android.view.View), (r13v2 android.view.View) binds: [B:54:0x02e5, B:46:0x0236, B:38:0x0197, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r25v38 int) = (r25v20 int), (r25v22 int), (r25v23 int), (r25v39 int) binds: [B:54:0x02e5, B:46:0x0236, B:38:0x0197, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0441 A[PHI: r11 r25
      0x0441: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:77:0x0428, B:70:0x03fa] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r25v15 int) = (r25v12 int), (r25v16 int) binds: [B:77:0x0428, B:70:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (l.C1783.f6087 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0068, code lost:
    
        if (l.C3779.f12953 <= 0) goto L7;
     */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC20779.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47541(ActivityC20779 activityC20779, View view, C3977 c3977) {
        C13275 c13275M12817 = null;
        C13275 c13275M12818 = null;
        int i = 0;
        C13275 c13275M12819 = null;
        ViewGroup viewGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = -687811645;
        int i5 = C3448.f11240;
        int i6 = C1080.f3865;
        int iM2761 = (C0619.m2761("ۖ᩸") + i5) * 53;
        int i7 = ((iM2761 ^ i6) * (-31277)) ^ (-956024213);
        int i8 = -63491932;
        while (true) {
            i4 = ((((i4 ^ i6) * 9891) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -1441507468:
                case 1905030301:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ۢ֫") ^ i5) * (-7);
                        i7 = ((iM2761 ^ i6) * 12269) ^ 107607070;
                        i8 = -1500806255;
                    } else {
                        iM2761 = C0773.m3169("ۤۗ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13655) ^ (-1522582455);
                        i8 = 580770978;
                    }
                    break;
                case -1249954578:
                case 295011182:
                    c13275M12819 = c3977.m12817(i);
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-29823)) ^ 1728034268;
                        i8 = -48028200;
                    } else {
                        iM2761 = (C0773.m3169("ۢ֫") ^ i5) * (-7);
                        i7 = ((iM2761 ^ i6) * 12269) ^ 107607070;
                        i8 = -1500806255;
                    }
                    break;
                case -1180876547:
                case 1851700139:
                    C3690.m11987();
                    C2966.m9664();
                    iM2761 = C0773.m3169("ۗ۠") ^ i6;
                    i7 = ((iM2761 ^ i5) * 32431) ^ 1534523128;
                    i8 = 175430399;
                    break;
                case -1147792907:
                case -968036051:
                    C3033.m9845();
                    if (C1519.f5300 < 0) {
                        iM2761 = (i5 - C0619.m2761("᩶ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * 23405) ^ (-1185611313);
                        i8 = -292262385;
                    } else {
                        iM2761 = (C0773.m3169("۠ۢ") ^ i5) * (-75);
                        i7 = ((iM2761 ^ i6) * (-5053)) ^ 1010757890;
                        i8 = -1663165345;
                    }
                    break;
                case -1118776273:
                case -787327234:
                    C4238.m13540();
                    C1080.m4050();
                    break;
                case -1013003201:
                case -175512289:
                    viewGroup.setPadding(i3, i2, i3, i3);
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 32431) ^ 1534523128;
                        i8 = 175430399;
                    } else {
                        iM2761 = C0773.m3169("ۛ֫") ^ i6;
                        i7 = ((iM2761 ^ i5) * 25169) ^ 539979264;
                        i8 = -1840627019;
                    }
                    break;
                case -659166041:
                case -347973620:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩶ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * 23405) ^ (-1185611313);
                        i8 = -292262385;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-199)) ^ 1781960188;
                        i8 = -1658151719;
                    }
                    break;
                case -491439943:
                case 1285933528:
                    c13275M12817 = c3977.m12817(1);
                    if (C4282.m13644()) {
                        iM2761 = (C0619.m2761("᩸᩻") ^ i6) * 77;
                        i7 = ((iM2761 ^ i5) * (-12499)) ^ 667122825;
                        i8 = -316392703;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۗ") ^ i6) * (-29);
                        i7 = ((iM2761 ^ i5) * 14331) ^ 280904690;
                        i8 = -1642823155;
                    }
                    break;
                case -100968903:
                case 2005034443:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩶ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * 23405) ^ (-1185611313);
                        i8 = -292262385;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۗۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM2761 ^ i6) * 28955) ^ 446632102;
                        i8 = 1523816437;
                    }
                    break;
                case 58042790:
                case 923064011:
                    RunnableC3055.m9933();
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0773.m3169("᩷ۗ") ^ i6) * (-29);
                        i7 = ((iM2761 ^ i5) * 14331) ^ 280904690;
                        i8 = -1642823155;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩶ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * 23405) ^ (-1185611313);
                        i8 = -292262385;
                    }
                    break;
                case 273477806:
                case 2023145394:
                    c13275M12818 = c3977.m12817(2);
                    i = 8;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩶ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * 23405) ^ (-1185611313);
                        i8 = -292262385;
                    } else {
                        iM2761 = (C0773.m3169("۟ۨ") + i6) * 81;
                        i7 = ((iM2761 ^ i5) * (-24197)) ^ 2009753693;
                        i8 = -556261169;
                    }
                    break;
                case 359244011:
                case 1062584172:
                    viewGroup = activityC20779.f66572;
                    i2 = c13275M12817.f42408;
                    i3 = 0;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 32431) ^ 1534523128;
                        i8 = 175430399;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۤۚ")) * (-11);
                        i7 = ((iM2761 ^ i6) * (-28673)) ^ (-1384489528);
                        i8 = -952069681;
                    }
                    break;
                case 388721219:
                case 1625839221:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 32431) ^ 1534523128;
                        i8 = 175430399;
                    } else {
                        iM2761 = (C0773.m3169("᩷۬") + i5) * 61;
                        i7 = ((iM2761 ^ i6) * (-23277)) ^ (-817773044);
                        i8 = -264027717;
                    }
                    break;
                case 688252637:
                case 1969486659:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("۠ۢ") ^ i5) * (-75);
                        i7 = ((iM2761 ^ i6) * (-5053)) ^ 1010757890;
                        i8 = -1663165345;
                    } else {
                        iM2761 = C0619.m2761("᩷۟") ^ i6;
                        i7 = ((iM2761 ^ i5) * 19977) ^ 58724608;
                        i8 = -867301405;
                    }
                    break;
                case 729625523:
                case 1227673197:
                    view.setPadding(i3, i3, i3, C2288.m7764(c13275M12818.f42405, c13275M12819.f42405));
                    break;
                default:
                    if (C3998.f13671 == 0) {
                        iM2761 = (C0773.m3169("۠ۢ") ^ i5) * (-75);
                        i7 = ((iM2761 ^ i6) * (-5053)) ^ 1010757890;
                        i8 = -1663165345;
                    } else {
                        iM2761 = C0773.m3169("ۗ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 32431) ^ 1534523128;
                        i8 = 175430399;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static void m47544(ActivityC20779 activityC20779) {
        C24720 c24720 = null;
        int i = 775538783;
        int i2 = C2375.f7641;
        int i3 = C20932.f66974;
        int iM2761 = C0619.m2761("ۚۨ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 20947) ^ 1122598840;
        int i5 = 2049854621;
        while (true) {
            i = ((((i ^ i3) * 13643) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1944937430:
                case -1007873433:
                    C2702.m8876();
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("᩹֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28797)) ^ (-1918626637);
                        i5 = 856249352;
                    } else {
                        iM2761 = (C0619.m2761("۟᩶") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-11391)) ^ (-1200911767);
                        i5 = 330672521;
                    }
                    break;
                case -1521530919:
                case 959264817:
                    RunnableC0334.m2063();
                    if (!C17202.m40372()) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20889) ^ 1510940583;
                        i5 = -383712924;
                    } else {
                        iM2761 = C0619.m2761("᩹֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28797)) ^ (-1918626637);
                        i5 = 856249352;
                    }
                    break;
                case -1505115347:
                case -1239787987:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("᩹֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28797)) ^ (-1918626637);
                        i5 = 856249352;
                    } else {
                        iM2761 = (C0773.m3169("۬ᩴ") ^ i3) * (-105);
                        i4 = ((iM2761 ^ i2) * (-707)) ^ (-662621100);
                        i5 = -1606838923;
                    }
                    break;
                case -521127704:
                case 432449218:
                    C0269.m1775();
                    C2419.m8174();
                    iM2761 = (C0619.m2761("۟᩶") ^ i2) * (-33);
                    i4 = ((iM2761 ^ i3) * (-11391)) ^ (-1200911767);
                    i5 = 330672521;
                    break;
                case -517366555:
                case -51934533:
                    C4238.m13540();
                    C2702.m8876();
                    break;
                case -497560045:
                case 519154421:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("᩹֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28797)) ^ (-1918626637);
                        i5 = 856249352;
                    } else {
                        iM2761 = C0619.m2761("ܰᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29947)) ^ 759109003;
                        i5 = 2142040777;
                    }
                    break;
                case -302388793:
                case 684211468:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("۟᩶") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-11391)) ^ (-1200911767);
                        i5 = 330672521;
                    } else {
                        iM2761 = C0773.m3169("᩷᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20117)) ^ (-265474964);
                        i5 = -929542028;
                    }
                    break;
                case -279718788:
                case 227882980:
                    if (c24720.m55199()) {
                        iM2761 = C0773.m3169("ۡۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1567) ^ (-993046115);
                        i5 = 373962921;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۙ") + i2) * (-121);
                        i4 = ((iM2761 ^ i3) * 11775) ^ (-1369471865);
                        i5 = -811036556;
                    }
                    break;
                case 192061428:
                case 1995288295:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("۟᩶") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-11391)) ^ (-1200911767);
                        i5 = 330672521;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰۧ")) * 69;
                        i4 = ((iM2761 ^ i2) * 4783) ^ 1907212881;
                        i5 = 784196267;
                    }
                    break;
                case 249222287:
                case 1034484866:
                    C1146.m4231();
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0773.m3169("᩻ۖ") ^ i2) * (-97);
                        i4 = ((iM2761 ^ i3) * (-22793)) ^ 838726341;
                        i5 = 491724967;
                    } else {
                        iM2761 = C0619.m2761("ۙܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20889) ^ 1510940583;
                        i5 = -383712924;
                    }
                    break;
                case 250364137:
                case 679474054:
                    break;
                case 250610602:
                case 707548580:
                    c24720 = activityC20779.f66581;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۖ") ^ i2) * (-97);
                        i4 = ((iM2761 ^ i3) * (-22793)) ^ 838726341;
                        i5 = 491724967;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡ᩻")) * (-27);
                        i4 = ((iM2761 ^ i2) * 6653) ^ (-1336152511);
                        i5 = 97263109;
                    }
                    break;
                case 645940931:
                case 1674228904:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("᩹֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28797)) ^ (-1918626637);
                        i5 = 856249352;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۨ")) * (-83);
                        i4 = ((iM2761 ^ i3) * 25793) ^ (-1790729890);
                        i5 = 886379612;
                    }
                    break;
                case 722104211:
                case 1015426105:
                    C11192 c11192 = activityC20779.f66576;
                    if (C2702.f8586 > 0) {
                        int i6 = 4;
                        if (C0773.m3161() == 0) {
                            m47539(activityC20779, c11192, new RunnableC20330(i6, activityC20779));
                            iM2761 = (C0619.m2761("᩷ۙ") + i2) * (-121);
                            i4 = ((iM2761 ^ i3) * 11775) ^ (-1369471865);
                            i5 = -811036556;
                            break;
                        }
                    }
                    iM2761 = C0773.m3169("ۘۘ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 14637) ^ (-1694815423);
                    i5 = 605472522;
                    break;
                case 1282397669:
                case 2035039378:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("۟᩶") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-11391)) ^ (-1200911767);
                        i5 = 330672521;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡ֫")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-32197)) ^ 331883419;
                        i5 = 1031039126;
                    }
                    break;
                default:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۚۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8385) ^ (-567675986);
                        i5 = 2034989271;
                    } else {
                        iM2761 = C0773.m3169("ۘۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14637) ^ (-1694815423);
                        i5 = 605472522;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM3169;
        int i;
        int i2;
        String str;
        short[] sArr;
        int i3;
        short[] sArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short[] sArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        ?? r7;
        int iM2761;
        int i14;
        int i15;
        int iM2762;
        int i16;
        int i17;
        int i18;
        int iM31610;
        int i19;
        int i20;
        int iM2763;
        int i21;
        int i22;
        String str2;
        boolean z;
        MenuItem menuItem2;
        int i23;
        C2361 c2361;
        int i24;
        int iM31611;
        SubMenu subMenu;
        short[] sArr4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str3;
        int i30;
        SubMenu subMenu2;
        short[] sArr5;
        int i31;
        int i32;
        int i33;
        int i34;
        int iM2764;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int iM2765;
        String str4;
        MenuItem menuItem3;
        int i40;
        SubMenu subMenu3;
        String strM42687;
        int iM2766;
        int i41;
        int i42;
        ActivityC20779 activityC20779 = this;
        int i43 = 2088216132;
        int i44 = C23916.f77426;
        int i45 = C3492.f12043;
        int iM31612 = C0773.m3169("ۤ۫") ^ i44;
        int i46 = ((iM31612 ^ i45) * 219) ^ 998040870;
        int i47 = iM31612 ^ (-1501851690);
        SubMenu subMenu4 = null;
        C2361 c2362 = null;
        C11192 c11192 = null;
        String strM8354 = null;
        String strM12149 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        boolean z2 = false;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        short s = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        MenuItem menuItem4 = null;
        MenuItem menuItemM2062 = null;
        String str5 = null;
        boolean z3 = false;
        C2361 c2363 = null;
        boolean z4 = false;
        while (true) {
            i43 = i47 ^ (i46 & (((i43 ^ i45) * 26477) >> 31));
            switch (i43) {
                case -2099045335:
                case -1667759929:
                    strM8354 = strM8354;
                    z2 = z2 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i52 = i52;
                    i56 = i56;
                    c2362 = c2362;
                    i57 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    sArr6 = sArr6;
                    i59 = i59;
                    sArr7 = sArr7;
                    i61 = i61;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    i60 = i60;
                    s = f66564[166];
                    i55 = s * 2;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (i45 - C0773.m3169("ܺ᩹")) * (-87);
                        i46 = ((iM3169 ^ i44) * 10635) ^ (-62231403);
                        i = -891204277;
                    } else {
                        iM3169 = (C0773.m3169("ۜܰ") ^ i45) * (-55);
                        i46 = ((iM3169 ^ i44) * 15205) ^ 650793271;
                        i = -1742649153;
                    }
                    int i63 = iM3169 ^ i;
                    i59 = i59;
                    i60 = i60;
                    sArr6 = sArr6;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    strM8354 = strM8354;
                    i61 = i61;
                    sArr7 = sArr7;
                    i57 = i57;
                    i56 = i56;
                    i47 = i63;
                    i52 = i52;
                    subMenu4 = subMenu4;
                    z2 = z2;
                    activityC20779 = this;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -2054267023:
                case -1128282275:
                    C1080.m4050();
                    strM8354 = strM8354;
                    z2 = z2 ? 1 : 0;
                    menuItem4 = menuItem4;
                    strM12149 = strM12149;
                    c2362 = c2362;
                    i13 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    i59 = i59;
                    i10 = i48;
                    i11 = i49;
                    i12 = i52;
                    i56 = i56;
                    sArr3 = sArr6;
                    i60 = i60;
                    int iM2767 = (C0619.m2761("֨᩸") ^ i44) * 47;
                    i56 = i56;
                    i59 = i59;
                    i60 = i60;
                    sArr6 = sArr3;
                    i52 = i12;
                    i48 = i10;
                    i49 = i11;
                    strM8354 = strM8354;
                    i57 = i13;
                    strM12149 = strM12149;
                    i47 = iM2767 ^ 1877452992;
                    i46 = ((iM2767 ^ i45) * 20615) ^ (-1373286773);
                    subMenu4 = subMenu4;
                    z2 = z2;
                    activityC20779 = this;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -1912797436:
                case -647653138:
                    String str6 = activityC20779.f66574;
                    Intent intent = new Intent(activityC20779, (Class<?>) ActivityC5863.class);
                    C3492.m11491(intent, C0862.m3500(f66564, 182, 8, i50), str6);
                    C3033.m9858(activityC20779, intent);
                    return i51;
                case -1799442239:
                case 2113093908:
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    C2485.m8345(c2363, C0773.m3169(AbstractC0116.m1236(sArr8, i48, i49, i50)) ^ 2118282464);
                    if (!C1146.m4231()) {
                        menuItem4 = menuItem4;
                        sArr6 = sArr6;
                        i59 = i59;
                        sArr7 = sArr7;
                        i61 = i61;
                        i62 = i62;
                        i48 = i48;
                        i49 = i49;
                        i60 = i60;
                        iM3169 = (i45 - C0773.m3169("ܺ᩹")) * (-87);
                        i46 = ((iM3169 ^ i44) * 10635) ^ (-62231403);
                        i = -891204277;
                        int i64 = iM3169 ^ i;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr6;
                        i62 = i62;
                        i48 = i48;
                        i49 = i49;
                        strM8354 = strM8354;
                        i61 = i61;
                        sArr7 = sArr7;
                        i57 = i57;
                        i56 = i56;
                        i47 = i64;
                        i52 = i52;
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        iM2763 = C0773.m3169("ۨۡ") ^ i44;
                        i21 = ((iM2763 ^ i45) * 9417) ^ 338283399;
                        i22 = 213057651;
                        i47 = iM2763 ^ i22;
                        i46 = i21;
                        strM8354 = strM8354;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -1649000026:
                case -84622876:
                    C1519.m5410(c2363, strM8354);
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    C3492.m11487(c2363, C0619.m2761(RunnableC3646.m11809(f66564, 196, 3, i50)) ^ 2122777797, new DialogInterfaceOnClickListenerC4353(i51, activityC20779));
                    if (!C3998.m12920()) {
                        strM8354 = strM8354;
                        iM2766 = (C0619.m2761("ܶ᩵") ^ i45) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i41 = ((iM2766 ^ i44) * (-7925)) ^ 179293797;
                        i42 = 372007966;
                        i47 = iM2766 ^ i42;
                        i46 = i41;
                        menuItem4 = menuItem4;
                    } else {
                        iM2763 = (C0619.m2761("ۖܿ") ^ i45) * 61;
                        i21 = ((iM2763 ^ i44) * 19389) ^ 991319778;
                        i22 = 453392097;
                        i47 = iM2763 ^ i22;
                        i46 = i21;
                        strM8354 = strM8354;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -1607534054:
                case 402663572:
                    C2834.m9344();
                    C2310.m7813();
                    return false;
                case -1475447882:
                case 1865039620:
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    int i65 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    i10 = i48;
                    i11 = i49;
                    int i66 = DialogInterfaceC8327.f27315;
                    C2361 c2364 = new C2361(activityC20779);
                    sArr7 = f66564;
                    i61 = 179;
                    i62 = 3;
                    if (C1783.f6087 > 0) {
                        int iM31613 = (i45 - C0773.m3169("ۢۙ")) * (-57);
                        int i67 = ((iM31613 ^ i44) * 24749) ^ (-694736190);
                        i47 = iM31613 ^ 1510175361;
                        menuItem4 = menuItem4;
                        strM8354 = strM8354;
                        i18 = i10;
                        i57 = i65;
                        i46 = i67;
                        i49 = i11;
                        subMenu4 = subMenu4;
                        i58 = i58;
                        c2362 = c2364;
                        i48 = i18;
                    } else {
                        i13 = i65;
                        c2362 = c2364;
                        i12 = i52;
                        sArr3 = sArr6;
                        int iM2768 = (C0619.m2761("֨᩸") ^ i44) * 47;
                        i56 = i56;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i48 = i10;
                        i49 = i11;
                        strM8354 = strM8354;
                        i57 = i13;
                        strM12149 = strM12149;
                        i47 = iM2768 ^ 1877452992;
                        i46 = ((iM2768 ^ i45) * 20615) ^ (-1373286773);
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -1455505998:
                case 1526808897:
                    i50 = 30587;
                    iM3169 = (C0619.m2761("ۚܺ") ^ i45) * 95;
                    i46 = ((iM3169 ^ i44) * 30407) ^ (-812259387);
                    i = -753221936;
                    int i68 = iM3169 ^ i;
                    i59 = i59;
                    i60 = i60;
                    sArr6 = sArr6;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    strM8354 = strM8354;
                    i61 = i61;
                    sArr7 = sArr7;
                    i57 = i57;
                    i56 = i56;
                    i47 = i68;
                    i52 = i52;
                    subMenu4 = subMenu4;
                    z2 = z2;
                    activityC20779 = this;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -1337772973:
                case -1272974225:
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    i57 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    if (i57 != i58) {
                        i48 = i48;
                        iM31610 = (i44 - C0619.m2761("ܳۤ")) * (-27);
                        i19 = ((iM31610 ^ i45) * (-20535)) ^ 1062598056;
                        i20 = -1837181243;
                        i47 = iM31610 ^ i20;
                        i48 = i48;
                        subMenu4 = subMenu4;
                        i57 = i57;
                        i58 = i58;
                        i46 = i19;
                        strM8354 = strM8354;
                        i51 = i51;
                        menuItem4 = menuItem4;
                    } else {
                        int iM31614 = (C0773.m3169("ۜۜ") + i45) * (-81);
                        int i69 = i48;
                        int i70 = ((iM31614 ^ i44) * 7457) ^ (-1022434812);
                        i47 = iM31614 ^ (-75156541);
                        menuItem4 = menuItem4;
                        subMenu4 = subMenu4;
                        i58 = i58;
                        strM8354 = strM8354;
                        i18 = i69;
                        i57 = i57;
                        i46 = i70;
                        i48 = i18;
                    }
                    break;
                case -1278068928:
                case -43739759:
                    C2419.m8174();
                    if (!C1519.m5403()) {
                        str = strM8354;
                        z2 = z2 ? 1 : 0;
                        menuItem4 = menuItem4;
                        i52 = i52;
                        i8 = i56;
                        c2362 = c2362;
                        i9 = i57;
                        i58 = i58;
                        subMenu4 = subMenu4;
                        sArr = sArr6;
                        i3 = i59;
                        sArr2 = sArr7;
                        i4 = i61;
                        i5 = i62;
                        i2 = i48;
                        i6 = i49;
                        i7 = i60;
                        int iM31615 = (i45 - C0773.m3169("۟ۨ")) * 95;
                        i47 = iM31615 ^ 993803183;
                        i46 = ((iM31615 ^ i44) * (-31323)) ^ 991897683;
                        i59 = i3;
                        i60 = i7;
                        sArr6 = sArr;
                        i62 = i5;
                        i48 = i2;
                        i49 = i6;
                        strM8354 = str;
                        i61 = i4;
                        sArr7 = sArr2;
                        i56 = i8;
                        i57 = i9;
                        i52 = i52;
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        str2 = strM8354;
                        z = z2 ? 1 : 0;
                        menuItem2 = menuItem4;
                        i23 = i52;
                        c2361 = c2362;
                        i24 = i57;
                        iM31611 = i58;
                        subMenu = subMenu4;
                        sArr4 = sArr7;
                        i25 = i61;
                        i26 = i48;
                        i27 = i49;
                        i28 = i56;
                        i29 = i62;
                        iM2765 = (C0619.m2761("ܰ᩶") ^ i44) * 109;
                        i39 = ((iM2765 ^ i45) * 7771) ^ 1868470159;
                        i38 = -1755191839;
                        i47 = iM2765 ^ i38;
                        i52 = i23;
                        c2362 = c2361;
                        i62 = i29;
                        strM8354 = str2;
                        i61 = i25;
                        z2 = z;
                        sArr7 = sArr4;
                        i56 = i28;
                        menuItem4 = menuItem2;
                        i48 = i26;
                        i57 = i24;
                        i46 = i39;
                        i49 = i27;
                        subMenu4 = subMenu;
                        i58 = iM31611;
                        activityC20779 = this;
                    }
                    break;
                case -1177800339:
                case -638662456:
                    C11235.m28309();
                    if (C0773.f2792 <= 0) {
                        strM8354 = strM8354;
                        z2 = z2 ? 1 : 0;
                        menuItem4 = menuItem4;
                        strM12149 = strM12149;
                        c2362 = c2362;
                        i13 = i57;
                        i58 = i58;
                        subMenu4 = subMenu4;
                        i59 = i59;
                        i10 = i48;
                        i11 = i49;
                        i12 = i52;
                        i56 = i56;
                        sArr3 = sArr6;
                        i60 = i60;
                        int iM2769 = (C0619.m2761("֨᩸") ^ i44) * 47;
                        i56 = i56;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i48 = i10;
                        i49 = i11;
                        strM8354 = strM8354;
                        i57 = i13;
                        strM12149 = strM12149;
                        i47 = iM2769 ^ 1877452992;
                        i46 = ((iM2769 ^ i45) * 20615) ^ (-1373286773);
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        int iM31616 = (i44 - C0773.m3169("᩶ܺ")) * (-81);
                        i47 = iM31616 ^ 1205789558;
                        i46 = ((iM31616 ^ i45) * (-10365)) ^ 1634439365;
                    }
                    break;
                case -1149320921:
                case 23270277:
                    i2 = i48;
                    str = strM8354;
                    z2 = z2 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i52 = i52;
                    int i71 = i56;
                    c2362 = c2362;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    sArr = sArr6;
                    i3 = i59;
                    sArr2 = sArr7;
                    i4 = i61;
                    i5 = i62;
                    i6 = i49;
                    i7 = i60;
                    int iM33146 = C13473.m33146(menuItem);
                    i8 = i71;
                    int iM31617 = C0773.m3169(C2878.m9486(f66564, 167, 3, i50));
                    i54 = 2119565630;
                    if (C0619.f2439) {
                        i53 = iM31617;
                        i9 = iM33146;
                        int iM31618 = (i45 - C0773.m3169("۟ۨ")) * 95;
                        i47 = iM31618 ^ 993803183;
                        i46 = ((iM31618 ^ i44) * (-31323)) ^ 991897683;
                        i59 = i3;
                        i60 = i7;
                        sArr6 = sArr;
                        i62 = i5;
                        i48 = i2;
                        i49 = i6;
                        strM8354 = str;
                        i61 = i4;
                        sArr7 = sArr2;
                        i56 = i8;
                        i57 = i9;
                        i52 = i52;
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                    } else {
                        int iM27610 = C0619.m2761("֫۠") ^ i45;
                        i47 = iM27610 ^ (-527016307);
                        i46 = ((iM27610 ^ i44) * (-14305)) ^ (-1733281146);
                        i59 = i3;
                        i60 = i7;
                        sArr6 = sArr;
                        i62 = i5;
                        i48 = i2;
                        i49 = i6;
                        strM8354 = str;
                        i61 = i4;
                        sArr7 = sArr2;
                        i56 = i8;
                        i52 = i52;
                        i57 = iM33146;
                        subMenu4 = subMenu4;
                        z2 = z2 ? 1 : 0;
                        i53 = iM31617;
                        i58 = i58;
                        activityC20779 = this;
                        r7 = i51;
                    }
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -980732343:
                case -295441752:
                    C18300 c18300M52717 = C23522.m52717(activityC20779.f66574);
                    C1321.m4848(c18300M52717);
                    strM42687 = c18300M52717.m42687();
                    str5 = strM42687;
                    iM2763 = C0619.m2761("᩷ۖ") ^ i44;
                    i21 = ((iM2763 ^ i45) * 27263) ^ 1987850648;
                    i22 = -166319815;
                    i47 = iM2763 ^ i22;
                    i46 = i21;
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    break;
                case -936312911:
                case 1429717796:
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    c11192 = activityC20779.f66576;
                    if (c11192 != null) {
                        iM2763 = (i45 - C0619.m2761("ۛᩴ")) * 13;
                        i21 = ((iM2763 ^ i44) * 12727) ^ (-1064309333);
                        i22 = 2050890986;
                    } else {
                        iM2763 = C0619.m2761("ۧ᩵") ^ i44;
                        i21 = ((iM2763 ^ i45) * (-31267)) ^ 1779687084;
                        i22 = -729790128;
                    }
                    i47 = iM2763 ^ i22;
                    i46 = i21;
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    break;
                case -856276592:
                case 1494780840:
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    int i72 = DialogInterfaceC8327.f27315;
                    c2363 = new C2361(activityC20779);
                    sArr8 = f66564;
                    i48 = 190;
                    i49 = 3;
                    if (C20932.f66974 > 0) {
                        iM2763 = (C0619.m2761("ܺ۬") ^ i45) * (-109);
                        i21 = ((iM2763 ^ i44) * 13243) ^ (-16975560);
                        i22 = -33638923;
                        i47 = iM2763 ^ i22;
                        i46 = i21;
                        strM8354 = strM8354;
                        menuItem4 = menuItem4;
                    } else {
                        c2362 = c2362;
                        i13 = i57;
                        i58 = i58;
                        subMenu4 = subMenu4;
                        menuItem4 = menuItem4;
                        i10 = 190;
                        i11 = 3;
                        i12 = i52;
                        sArr3 = sArr6;
                        int iM27611 = (C0619.m2761("֨᩸") ^ i44) * 47;
                        i56 = i56;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i48 = i10;
                        i49 = i11;
                        strM8354 = strM8354;
                        i57 = i13;
                        strM12149 = strM12149;
                        i47 = iM27611 ^ 1877452992;
                        i46 = ((iM27611 ^ i45) * 20615) ^ (-1373286773);
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -765493784:
                case -586289058:
                    z3 = false;
                    iM31610 = C0773.m3169("ۚܽ") ^ i45;
                    i19 = ((iM31610 ^ i44) * 8341) ^ 1196101422;
                    i20 = 823795620;
                    i47 = iM31610 ^ i20;
                    i48 = i48;
                    subMenu4 = subMenu4;
                    i57 = i57;
                    i58 = i58;
                    i46 = i19;
                    strM8354 = strM8354;
                    i51 = i51;
                    menuItem4 = menuItem4;
                    break;
                case -747018742:
                case -213326518:
                    String str7 = strM8354;
                    menuItem4 = menuItem4;
                    c2362 = c2362;
                    int i73 = i57;
                    int i74 = i58;
                    SubMenu subMenu5 = subMenu4;
                    short[] sArr9 = sArr6;
                    int i75 = i59;
                    short[] sArr10 = sArr7;
                    int i76 = i61;
                    int i77 = i62;
                    int i78 = i48;
                    int i79 = i49;
                    int i80 = i60;
                    int iM27612 = C0619.m2761(C0862.m3500(sArr9, i75, i80, i50)) ^ 2098159843;
                    int i81 = i52;
                    if (i73 == i81) {
                        int iM27613 = C0619.m2761("۟֨") ^ i44;
                        int i82 = ((iM27613 ^ i45) * (-22621)) ^ 1162418584;
                        sArr6 = sArr9;
                        i59 = i75;
                        i60 = i80;
                        i47 = iM27613 ^ 1983099762;
                        i62 = i77;
                        i49 = i79;
                        strM8354 = str7;
                        i61 = i76;
                        sArr7 = sArr10;
                        activityC20779 = this;
                        i56 = iM27612;
                        i52 = i81;
                        i48 = i78;
                        subMenu4 = subMenu5;
                        z2 = false;
                        i57 = i73;
                        i46 = i82;
                        i58 = i74;
                        r7 = 1;
                        c2362 = c2362;
                        i51 = r7;
                    } else {
                        int iM27614 = (C0619.m2761("ۢۡ") + i45) * 109;
                        int i83 = ((iM27614 ^ i44) * 31369) ^ (-1804081064);
                        i59 = i75;
                        i60 = i80;
                        i47 = iM27614 ^ 1882930640;
                        sArr6 = sArr9;
                        i62 = i77;
                        i49 = i79;
                        strM8354 = str7;
                        i61 = i76;
                        sArr7 = sArr10;
                        i51 = 1;
                        i56 = iM27612;
                        i52 = i81;
                        i48 = i78;
                        subMenu4 = subMenu5;
                        z2 = false;
                        i57 = i73;
                        i58 = i74;
                        i46 = i83;
                        c2362 = c2362;
                        activityC20779 = this;
                    }
                    menuItem4 = menuItem4;
                    break;
                case -632072585:
                case 1288714829:
                    str4 = strM8354;
                    int i84 = i49;
                    C2361 c2365 = c2362;
                    int i85 = i57;
                    int i86 = i58;
                    short[] sArr11 = sArr7;
                    int i87 = i61;
                    int i88 = i48;
                    int i89 = i56;
                    int i90 = i62;
                    SubMenu subMenu6 = menuItem.getSubMenu();
                    C3099.m10086(subMenu6);
                    MenuItem menuItemM2063 = RunnableC0334.m2062(subMenu6, i89);
                    if (activityC20779.f66576 == null) {
                        int iM31619 = C0773.m3169("۠ܳ") ^ i45;
                        int i91 = ((iM31619 ^ i44) * (-11675)) ^ 1689703946;
                        i47 = iM31619 ^ (-822366012);
                        activityC20779 = this;
                        i62 = i90;
                        i58 = i86;
                        i61 = i87;
                        sArr7 = sArr11;
                        i56 = i89;
                        c2362 = c2365;
                        i48 = i88;
                        i57 = i85;
                        menuItem4 = menuItemM2063;
                        i46 = i91;
                        i49 = i84;
                        subMenu4 = subMenu6;
                        strM8354 = str4;
                    } else {
                        int iM31620 = (C0773.m3169("ۜۖ") ^ i44) * 19;
                        i47 = iM31620 ^ 458938877;
                        i62 = i90;
                        i58 = i86;
                        i61 = i87;
                        sArr7 = sArr11;
                        i56 = i89;
                        c2362 = c2365;
                        i48 = i88;
                        i57 = i85;
                        menuItem4 = menuItemM2063;
                        i49 = i84;
                        i46 = ((iM31620 ^ i45) * 18709) ^ (-164249328);
                        subMenu4 = subMenu6;
                        strM8354 = str4;
                        activityC20779 = this;
                    }
                    break;
                case -626452863:
                case 215346941:
                    RunnableC1848.m6359(c2363, C0773.m3169(C0950.m3780(f66564, 199, 3, i50)) ^ 2121548038, null);
                    C3099.m10090(c2363);
                    return i51;
                case -623407288:
                case 1030105058:
                    str2 = strM8354;
                    z = z2 ? 1 : 0;
                    menuItem2 = menuItem4;
                    i23 = i52;
                    c2361 = c2362;
                    i24 = i57;
                    subMenu = subMenu4;
                    sArr4 = sArr7;
                    i25 = i61;
                    i26 = i48;
                    i27 = i49;
                    i28 = i56;
                    i29 = i62;
                    iM31611 = C0773.m3169(strM12149) ^ 2102263166;
                    sArr6 = f66564;
                    i59 = 173;
                    i60 = 3;
                    if (C1343.f4799 != 0) {
                        iM2765 = (C0619.m2761("ܰ᩶") ^ i44) * 109;
                        i39 = ((iM2765 ^ i45) * 7771) ^ 1868470159;
                        i38 = -1755191839;
                    } else {
                        iM2765 = (C0773.m3169("᩸᩺") ^ i44) * 69;
                        i39 = ((iM2765 ^ i45) * 25857) ^ 891057005;
                        i38 = 220124654;
                    }
                    i47 = iM2765 ^ i38;
                    i52 = i23;
                    c2362 = c2361;
                    i62 = i29;
                    strM8354 = str2;
                    i61 = i25;
                    z2 = z;
                    sArr7 = sArr4;
                    i56 = i28;
                    menuItem4 = menuItem2;
                    i48 = i26;
                    i57 = i24;
                    i46 = i39;
                    i49 = i27;
                    subMenu4 = subMenu;
                    i58 = iM31611;
                    activityC20779 = this;
                    break;
                case -297541300:
                case 585914574:
                    str4 = strM8354;
                    menuItem3 = menuItem4;
                    C3690.m11992(menuItem3, z3);
                    i40 = i58;
                    SubMenu subMenu7 = subMenu4;
                    menuItemM2062 = RunnableC0334.m2062(subMenu7, i40);
                    if (C23522.m52717(activityC20779.f66574) != null) {
                        int iM31621 = (C0773.m3169("ۗ֡") ^ i44) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i46 = ((iM31621 ^ i45) * 11211) ^ 1267214106;
                        i47 = iM31621 ^ 1845642243;
                        menuItem4 = menuItem3;
                        subMenu4 = subMenu7;
                        i58 = i40;
                    } else {
                        subMenu3 = subMenu7;
                        z4 = z2 ? 1 : 0;
                        int iM31622 = C0773.m3169("ܽܿ") ^ i45;
                        i47 = iM31622 ^ 1805887125;
                        i46 = ((iM31622 ^ i44) * (-15689)) ^ 2135068653;
                        subMenu4 = subMenu3;
                        i58 = i40;
                        menuItem4 = menuItem3;
                    }
                    strM8354 = str4;
                    break;
                case -261769800:
                case 241408782:
                    String str8 = strM8354;
                    menuItem4 = menuItem4;
                    c2362 = c2362;
                    int i92 = i57;
                    int i93 = i58;
                    SubMenu subMenu8 = subMenu4;
                    short[] sArr12 = sArr7;
                    int i94 = i61;
                    int i95 = i48;
                    int i96 = i49;
                    int i97 = i56;
                    int i98 = i62;
                    if (i92 == (C0619.m2761(C2834.m9343(f66564, PicnicEngine.MAX_AUX_BYTES, 3, i50)) ^ 2127050725)) {
                        iM2761 = C0773.m3169("ۗܿ") ^ i44;
                        i14 = ((iM2761 ^ i45) * (-24845)) ^ 712314727;
                        i15 = 1439283162;
                    } else {
                        iM2761 = (C0619.m2761("۠ᩴ") ^ i45) * 45;
                        i14 = ((iM2761 ^ i44) * 31787) ^ (-1874311030);
                        i15 = -780090567;
                    }
                    i47 = iM2761 ^ i15;
                    activityC20779 = this;
                    i62 = i98;
                    i49 = i96;
                    i61 = i94;
                    sArr7 = sArr12;
                    i56 = i97;
                    i48 = i95;
                    subMenu4 = subMenu8;
                    i57 = i92;
                    i46 = i14;
                    i58 = i93;
                    strM8354 = str8;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -242728046:
                case 1393469583:
                    if (!C1343.m4943()) {
                        str2 = strM8354;
                        z = z2 ? 1 : 0;
                        menuItem2 = menuItem4;
                        i23 = i52;
                        c2361 = c2362;
                        i24 = i57;
                        iM31611 = i58;
                        subMenu = subMenu4;
                        sArr4 = sArr7;
                        i25 = i61;
                        i26 = i48;
                        i27 = i49;
                        i28 = i56;
                        i29 = i62;
                        iM2765 = (C0619.m2761("ܰ᩶") ^ i44) * 109;
                        i39 = ((iM2765 ^ i45) * 7771) ^ 1868470159;
                        i38 = -1755191839;
                        i47 = iM2765 ^ i38;
                        i52 = i23;
                        c2362 = c2361;
                        i62 = i29;
                        strM8354 = str2;
                        i61 = i25;
                        z2 = z;
                        sArr7 = sArr4;
                        i56 = i28;
                        menuItem4 = menuItem2;
                        i48 = i26;
                        i57 = i24;
                        i46 = i39;
                        i49 = i27;
                        subMenu4 = subMenu;
                        i58 = iM31611;
                        activityC20779 = this;
                    } else {
                        strM8354 = strM8354;
                        z2 = z2 ? 1 : 0;
                        menuItem4 = menuItem4;
                        strM12149 = strM12149;
                        c2362 = c2362;
                        i13 = i57;
                        i58 = i58;
                        subMenu4 = subMenu4;
                        i59 = i59;
                        i10 = i48;
                        i11 = i49;
                        i12 = i52;
                        i56 = i56;
                        sArr3 = sArr6;
                        i60 = i60;
                        int iM27615 = (C0619.m2761("֨᩸") ^ i44) * 47;
                        i56 = i56;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i48 = i10;
                        i49 = i11;
                        strM8354 = strM8354;
                        i57 = i13;
                        strM12149 = strM12149;
                        i47 = iM27615 ^ 1877452992;
                        i46 = ((iM27615 ^ i45) * 20615) ^ (-1373286773);
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -211782447:
                case 757448993:
                    strM8354 = strM8354;
                    z2 = z2 ? 1 : 0;
                    menuItem4 = menuItem4;
                    c2362 = c2362;
                    int i99 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    sArr3 = sArr6;
                    i59 = i59;
                    short[] sArr13 = sArr7;
                    int i100 = i61;
                    i10 = i48;
                    i11 = i49;
                    i56 = i56;
                    i60 = i60;
                    int i101 = i62;
                    i12 = i53 ^ i54;
                    i13 = i99;
                    strM12149 = C3734.m12149(f66564, 170, 3, i50);
                    if (AbstractC0641.f2496 >= 0) {
                        i62 = i101;
                        i61 = i100;
                        sArr7 = sArr13;
                        int iM27616 = (C0619.m2761("֨᩸") ^ i44) * 47;
                        i56 = i56;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i48 = i10;
                        i49 = i11;
                        strM8354 = strM8354;
                        i57 = i13;
                        strM12149 = strM12149;
                        i47 = iM27616 ^ 1877452992;
                        i46 = ((iM27616 ^ i45) * 20615) ^ (-1373286773);
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                    } else {
                        int iM31623 = C0773.m3169("ۨ۟") ^ i44;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr3;
                        i52 = i12;
                        i62 = i101;
                        i49 = i11;
                        strM8354 = strM8354;
                        i61 = i100;
                        sArr7 = sArr13;
                        strM12149 = strM12149;
                        i56 = i56;
                        i48 = i10;
                        subMenu4 = subMenu4;
                        i57 = i13;
                        activityC20779 = this;
                        i47 = iM31623 ^ (-533462999);
                        i46 = ((iM31623 ^ i45) * 19753) ^ 217580866;
                        i58 = i58;
                        z2 = z2 ? 1 : 0;
                        r7 = i51;
                    }
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case 61899300:
                case 1482728508:
                    return z2;
                case 104499355:
                case 2034749306:
                    strM42687 = c11192.m28216();
                    str5 = strM42687;
                    iM2763 = C0619.m2761("᩷ۖ") ^ i44;
                    i21 = ((iM2763 ^ i45) * 27263) ^ 1987850648;
                    i22 = -166319815;
                    i47 = iM2763 ^ i22;
                    i46 = i21;
                    strM8354 = strM8354;
                    menuItem4 = menuItem4;
                    break;
                case 138939951:
                case 1406305376:
                    String str9 = strM8354;
                    menuItem4 = menuItem4;
                    c2362 = c2362;
                    int i102 = i57;
                    i58 = i58;
                    SubMenu subMenu9 = subMenu4;
                    short[] sArr14 = sArr7;
                    int i103 = i61;
                    int i104 = i48;
                    int i105 = i49;
                    int i106 = i56;
                    int i107 = i62;
                    if (i102 == i106) {
                        iM2762 = (C0619.m2761("۠ۖ") + i44) * (-103);
                        i16 = ((iM2762 ^ i45) * 16413) ^ 1687575195;
                        i17 = -1009919576;
                    } else {
                        iM2762 = (C0619.m2761("ۡۘ") ^ i45) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i16 = ((iM2762 ^ i44) * 23275) ^ 1749359520;
                        i17 = 394597393;
                    }
                    i47 = iM2762 ^ i17;
                    i62 = i107;
                    strM8354 = str9;
                    i61 = i103;
                    sArr7 = sArr14;
                    i56 = i106;
                    i48 = i104;
                    i57 = i102;
                    i46 = i16;
                    i49 = i105;
                    subMenu4 = subMenu9;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case 415662392:
                case 1847964136:
                    C1080.m4050();
                    if (C3492.f12043 <= 0) {
                        str3 = strM8354;
                        menuItem4 = menuItem4;
                        c2362 = c2362;
                        i30 = i57;
                        i58 = i58;
                        subMenu2 = subMenu4;
                        sArr5 = sArr7;
                        i31 = i61;
                        i32 = i48;
                        i33 = i49;
                        i34 = i62;
                        iM2764 = (C0619.m2761("ۚᩴ") ^ i44) * (-93);
                        i35 = i31;
                        i36 = ((iM2764 ^ i45) * 26253) ^ 719778964;
                        i37 = -42763102;
                        i47 = iM2764 ^ i37;
                        i62 = i34;
                        i48 = i32;
                        i49 = i33;
                        i61 = i35;
                        sArr7 = sArr5;
                        i57 = i30;
                        i46 = i36;
                        subMenu4 = subMenu2;
                        strM8354 = str3;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        str2 = strM8354;
                        z = z2 ? 1 : 0;
                        menuItem2 = menuItem4;
                        i23 = i52;
                        c2361 = c2362;
                        i24 = i57;
                        iM31611 = i58;
                        subMenu = subMenu4;
                        sArr4 = sArr7;
                        i25 = i61;
                        i26 = i48;
                        i27 = i49;
                        i28 = i56;
                        i29 = i62;
                        iM2765 = (C0619.m2761("ܰ᩶") ^ i44) * 109;
                        i39 = ((iM2765 ^ i45) * 7771) ^ 1868470159;
                        i38 = -1755191839;
                        i47 = iM2765 ^ i38;
                        i52 = i23;
                        c2362 = c2361;
                        i62 = i29;
                        strM8354 = str2;
                        i61 = i25;
                        z2 = z;
                        sArr7 = sArr4;
                        i56 = i28;
                        menuItem4 = menuItem2;
                        i48 = i26;
                        i57 = i24;
                        i46 = i39;
                        i49 = i27;
                        subMenu4 = subMenu;
                        i58 = iM31611;
                        activityC20779 = this;
                    }
                    break;
                case 439779789:
                case 911249180:
                    menuItem4 = menuItem4;
                    Object[] objArr = new Object[i51];
                    objArr[z2 ? 1 : 0] = str5;
                    strM8354 = C2485.m8354(activityC20779, C0619.m2761(C11235.m28300(f66564, 193, 3, i50)) ^ 2125661559, objArr);
                    if (C1542.m5459() >= 0) {
                        iM2766 = (C0619.m2761("ܶ᩵") ^ i45) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i41 = ((iM2766 ^ i44) * (-7925)) ^ 179293797;
                        i42 = 372007966;
                    } else {
                        iM2766 = C0619.m2761("ܰ᩺") ^ i45;
                        i41 = ((iM2766 ^ i44) * (-8371)) ^ (-131461357);
                        i42 = -1908399067;
                    }
                    i47 = iM2766 ^ i42;
                    i46 = i41;
                    menuItem4 = menuItem4;
                    break;
                case 677335964:
                case 1747796469:
                    C2361 c2366 = c2362;
                    RunnableC0334.m2055(c2366, activityC20779.f66574);
                    TextView textView = (TextView) C1321.m4860(c2366).m22423(R.id.message);
                    C17423.m40915(textView);
                    C2375.m8070(textView, new ViewOnClickListenerC15110());
                    return i51;
                case 775417978:
                case 1119640050:
                    strM8354 = strM8354;
                    z2 = z2 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i52 = i52;
                    i56 = i56;
                    c2362 = c2362;
                    i57 = i57;
                    i58 = i58;
                    subMenu4 = subMenu4;
                    sArr6 = sArr6;
                    i59 = i59;
                    sArr7 = sArr7;
                    i61 = i61;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    i60 = i60;
                    int i108 = s + 1;
                    if ((i108 * i108) - (i55 + 1) >= 0) {
                        iM3169 = (C0773.m3169("۬᩶") ^ i44) * (-81);
                        i46 = ((iM3169 ^ i45) * (-4517)) ^ (-1994191842);
                        i = 792847951;
                    } else {
                        iM3169 = (C0773.m3169("֨ۙ") + i44) * 93;
                        i46 = ((iM3169 ^ i45) * 18649) ^ (-1244947519);
                        i = 1071041546;
                    }
                    int i610 = iM3169 ^ i;
                    i59 = i59;
                    i60 = i60;
                    sArr6 = sArr6;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    strM8354 = strM8354;
                    i61 = i61;
                    sArr7 = sArr7;
                    i57 = i57;
                    i56 = i56;
                    i47 = i610;
                    i52 = i52;
                    subMenu4 = subMenu4;
                    z2 = z2;
                    activityC20779 = this;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                case 821486904:
                case 1169813625:
                    z3 = true;
                    iM31610 = C0773.m3169("ۚܽ") ^ i45;
                    i19 = ((iM31610 ^ i44) * 8341) ^ 1196101422;
                    i20 = 823795620;
                    i47 = iM31610 ^ i20;
                    i48 = i48;
                    subMenu4 = subMenu4;
                    i57 = i57;
                    i58 = i58;
                    i46 = i19;
                    strM8354 = strM8354;
                    i51 = i51;
                    menuItem4 = menuItem4;
                    break;
                case 904198939:
                case 1714898886:
                    C1564.m5509();
                    if (C2375.f7641 <= 0) {
                        strM8354 = strM8354;
                        menuItem4 = menuItem4;
                        sArr6 = sArr6;
                        i59 = i59;
                        sArr7 = sArr7;
                        i61 = i61;
                        i62 = i62;
                        i48 = i48;
                        i49 = i49;
                        i60 = i60;
                        iM3169 = (i45 - C0773.m3169("ܺ᩹")) * (-87);
                        i46 = ((iM3169 ^ i44) * 10635) ^ (-62231403);
                        i = -891204277;
                        int i611 = iM3169 ^ i;
                        i59 = i59;
                        i60 = i60;
                        sArr6 = sArr6;
                        i62 = i62;
                        i48 = i48;
                        i49 = i49;
                        strM8354 = strM8354;
                        i61 = i61;
                        sArr7 = sArr7;
                        i57 = i57;
                        i56 = i56;
                        i47 = i611;
                        i52 = i52;
                        subMenu4 = subMenu4;
                        z2 = z2;
                        activityC20779 = this;
                        i58 = i58;
                        r7 = i51;
                        c2362 = c2362;
                        i51 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        str2 = strM8354;
                        z = z2 ? 1 : 0;
                        menuItem2 = menuItem4;
                        i23 = i52;
                        c2361 = c2362;
                        i24 = i57;
                        iM31611 = i58;
                        subMenu = subMenu4;
                        sArr4 = sArr7;
                        i25 = i61;
                        i26 = i48;
                        i27 = i49;
                        i28 = i56;
                        i29 = i62;
                        iM2765 = (C0619.m2761("ܰ᩶") ^ i44) * 109;
                        i39 = ((iM2765 ^ i45) * 7771) ^ 1868470159;
                        i38 = -1755191839;
                        i47 = iM2765 ^ i38;
                        i52 = i23;
                        c2362 = c2361;
                        i62 = i29;
                        strM8354 = str2;
                        i61 = i25;
                        z2 = z;
                        sArr7 = sArr4;
                        i56 = i28;
                        menuItem4 = menuItem2;
                        i48 = i26;
                        i57 = i24;
                        i46 = i39;
                        i49 = i27;
                        subMenu4 = subMenu;
                        i58 = iM31611;
                        activityC20779 = this;
                    }
                    break;
                case 958682312:
                case 2018893310:
                    C3690.m11992(menuItemM2062, z4);
                    return i51;
                case 1230108319:
                case 2132661730:
                    str4 = strM8354;
                    i40 = i58;
                    subMenu3 = subMenu4;
                    menuItem3 = menuItem4;
                    z4 = true;
                    int iM31624 = C0773.m3169("ܽܿ") ^ i45;
                    i47 = iM31624 ^ 1805887125;
                    i46 = ((iM31624 ^ i44) * (-15689)) ^ 2135068653;
                    subMenu4 = subMenu3;
                    i58 = i40;
                    menuItem4 = menuItem3;
                    strM8354 = str4;
                    break;
                case 1269320266:
                case 1924688619:
                    i50 = 15230;
                    iM3169 = (C0619.m2761("ۚܺ") ^ i45) * 95;
                    i46 = ((iM3169 ^ i44) * 30407) ^ (-812259387);
                    i = -753221936;
                    int i612 = iM3169 ^ i;
                    i59 = i59;
                    i60 = i60;
                    sArr6 = sArr6;
                    i62 = i62;
                    i48 = i48;
                    i49 = i49;
                    strM8354 = strM8354;
                    i61 = i61;
                    sArr7 = sArr7;
                    i57 = i57;
                    i56 = i56;
                    i47 = i612;
                    i52 = i52;
                    subMenu4 = subMenu4;
                    z2 = z2;
                    activityC20779 = this;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
                default:
                    str3 = strM8354;
                    menuItem4 = menuItem4;
                    c2362 = c2362;
                    i30 = i57;
                    i58 = i58;
                    subMenu2 = subMenu4;
                    i31 = i61;
                    i32 = i48;
                    i33 = i49;
                    short[] sArr15 = sArr7;
                    i34 = i62;
                    sArr5 = sArr15;
                    C13473.m33136(c2362, C0619.m2761(C3492.m11486(sArr15, i31, i34, i50)) ^ 2098220803);
                    if (RunnableC1848.f6235) {
                        iM2764 = (C0619.m2761("ۚᩴ") ^ i44) * (-93);
                        i35 = i31;
                        i36 = ((iM2764 ^ i45) * 26253) ^ 719778964;
                        i37 = -42763102;
                    } else {
                        i35 = i31;
                        iM2764 = (C0773.m3169("᩻ᩴ") ^ i44) * (-119);
                        i36 = ((iM2764 ^ i45) * (-26597)) ^ 1721572371;
                        i37 = -1987196837;
                    }
                    i47 = iM2764 ^ i37;
                    i62 = i34;
                    i48 = i32;
                    i49 = i33;
                    i61 = i35;
                    sArr7 = sArr5;
                    i57 = i30;
                    i46 = i36;
                    subMenu4 = subMenu2;
                    strM8354 = str3;
                    i58 = i58;
                    r7 = i51;
                    c2362 = c2362;
                    i51 = r7;
                    menuItem4 = menuItem4;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0136 A[PHI: r3 r5 r6 r9
      0x0136: PHI (r3v5 android.view.MenuItem) = (r3v2 android.view.MenuItem), (r3v4 android.view.MenuItem), (r3v2 android.view.MenuItem) binds: [B:34:0x0134, B:30:0x0110, B:105:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r5v3 android.graphics.drawable.Drawable) = 
      (r5v2 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
      (r5v4 android.graphics.drawable.Drawable)
     binds: [B:34:0x0134, B:30:0x0110, B:105:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r6v3 android.content.res.ColorStateList) = 
      (r6v2 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
      (r6v5 android.content.res.ColorStateList)
     binds: [B:34:0x0134, B:30:0x0110, B:105:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:34:0x0134, B:30:0x0110, B:105:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        short[] sArr;
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        Menu menu2 = menu;
        int i4 = C2375.f7641;
        int i5 = C3448.f11240;
        int iM31610 = (C0773.m3169("ᩳۗ") + i5) * (-61);
        int i6 = ((iM31610 ^ i4) * 7205) ^ (-218849135);
        ColorStateList textColors = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM31610 ^ (-1717918162);
        int iM2762 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1946575987;
        Drawable drawableMutate = null;
        short[] sArr4 = null;
        Drawable icon = null;
        String strM11486 = null;
        int i17 = 0;
        MenuItem menuItemM2062 = null;
        MenuInflater menuInflater = null;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-26707)) >> 31));
            switch (i16) {
                case -2011848439:
                case 1736398160:
                    drawableMutate = icon.mutate();
                    textColors = this.f66567.getTextColors();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("۟᩺") ^ i5;
                        i = ((iM3169 ^ i4) * (-8067)) ^ (-1624615606);
                        i3 = -1148940211;
                        i7 = iM3169 ^ i3;
                        i6 = i;
                    } else {
                        int iM2763 = C0619.m2761("ᩴۧ") ^ i5;
                        i6 = ((iM2763 ^ i4) * 3357) ^ (-1766045952);
                        i7 = iM2763 ^ (-151916272);
                    }
                    break;
                case -1794844990:
                case 1010019728:
                    sArr = sArr2;
                    sArr4 = f66564;
                    c = 159;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("᩸᩻") ^ i4;
                        i = ((iM2761 ^ i5) * 6935) ^ 176741179;
                        i2 = 937400698;
                    } else {
                        iM2761 = C0619.m2761("ۤܿ") ^ i5;
                        i = ((iM2761 ^ i4) * 21871) ^ 1956483766;
                        i2 = -629538921;
                    }
                    i7 = iM2761 ^ i2;
                    menu2 = menu;
                    sArr2 = sArr;
                    i6 = i;
                    break;
                case -1775366337:
                case 1330569214:
                    if (C2354.f7599 >= 0) {
                        sArr = sArr2;
                        iM2761 = C0619.m2761("᩸᩻") ^ i4;
                        i = ((iM2761 ^ i5) * 6935) ^ 176741179;
                        i2 = 937400698;
                        i7 = iM2761 ^ i2;
                        menu2 = menu;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM31611 = (C0773.m3169("᩻ۡ") + i4) * 81;
                        i6 = ((iM31611 ^ i5) * (-30773)) ^ 1845444603;
                        i7 = iM31611 ^ 130929628;
                        menu2 = menu;
                    }
                    break;
                case -1751786793:
                case -1439465450:
                    i8 = 7415;
                    int iM2764 = (i5 - C0619.m2761("ᩴܺ")) * 31;
                    i7 = iM2764 ^ (-140333864);
                    sArr2 = sArr2;
                    i6 = ((iM2764 ^ i4) * 16801) ^ 130174989;
                    menu2 = menu;
                    break;
                case -1598993226:
                case -980324954:
                    C2419.m8174();
                    if (C1321.f4751 < 0) {
                        sArr = sArr2;
                        iM2761 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM2761 ^ i4) * 17653) ^ (-525159889);
                        i2 = 2120706352;
                        i7 = iM2761 ^ i2;
                        menu2 = menu;
                        sArr2 = sArr;
                        i6 = i;
                    }
                    sArr = sArr2;
                    iM2761 = C0619.m2761("᩸᩻") ^ i4;
                    i = ((iM2761 ^ i5) * 6935) ^ 176741179;
                    i2 = 937400698;
                    i7 = iM2761 ^ i2;
                    menu2 = menu;
                    sArr2 = sArr;
                    i6 = i;
                    break;
                case -1588919765:
                case -54579149:
                    C1321.m4852();
                    C1519.m5403();
                    return false;
                case -1323817204:
                case 214121340:
                    menuInflater.inflate(iM2762 ^ i17, menu2);
                    sArr3 = f66564;
                    i11 = 163;
                    if (!C3690.m11987()) {
                        iM3169 = (i5 - C0619.m2761("۠ۚ")) * 51;
                        i = ((iM3169 ^ i4) * (-3927)) ^ (-883032147);
                        i3 = 796224463;
                        i7 = iM3169 ^ i3;
                        i6 = i;
                    } else {
                        int iM31612 = (C0773.m3169("᩻ۡ") + i4) * 81;
                        i6 = ((iM31612 ^ i5) * (-30773)) ^ 1845444603;
                        i7 = iM31612 ^ 130929628;
                        menu2 = menu;
                    }
                    break;
                case -1312789042:
                case 1405993872:
                    C2834.m9344();
                    if (C2834.m9344() < 0) {
                        iM3169 = (C0773.m3169("᩵᩶") ^ i4) * (-109);
                        i = ((iM3169 ^ i5) * (-5201)) ^ 811025378;
                        i3 = -132595794;
                        i7 = iM3169 ^ i3;
                        i6 = i;
                    }
                    sArr = sArr2;
                    iM2761 = C0619.m2761("᩸᩻") ^ i4;
                    i = ((iM2761 ^ i5) * 6935) ^ 176741179;
                    i2 = 937400698;
                    i7 = iM2761 ^ i2;
                    menu2 = menu;
                    sArr2 = sArr;
                    i6 = i;
                    break;
                case -1061227807:
                case -843672334:
                    menuItemM2062 = RunnableC0334.m2062(menu2, C0773.m3169(strM11486) ^ 2118508307);
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("۟᩺") ^ i5;
                        i = ((iM3169 ^ i4) * (-8067)) ^ (-1624615606);
                        i3 = -1148940211;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۟۠")) * 81;
                        i = ((iM3169 ^ i5) * (-17807)) ^ (-1217882936);
                        i3 = -909179319;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i;
                    break;
                case -910853447:
                case 515602245:
                    drawableMutate.setTintList(textColors);
                    menuItemM2062.setIcon(drawableMutate);
                    return true;
                case -685046152:
                case -516241140:
                    menuInflater = getMenuInflater();
                    sArr2 = f66564;
                    i9 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i10 = 3;
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("ۨۧ") ^ i5;
                        i = ((iM3169 ^ i4) * (-3657)) ^ 207018167;
                        i3 = -2122016284;
                        i7 = iM3169 ^ i3;
                        i6 = i;
                    } else {
                        int iM31613 = (C0773.m3169("᩻ۡ") + i4) * 81;
                        i6 = ((iM31613 ^ i5) * (-30773)) ^ 1845444603;
                        i7 = iM31613 ^ 130929628;
                        menu2 = menu;
                    }
                    break;
                case -370482944:
                case 1051571834:
                    sArr = sArr2;
                    int i18 = i15 + i12;
                    if (i14 - (i18 + i18) > 0) {
                        iM2761 = C0619.m2761("᩹ܶ") ^ i4;
                        i = ((iM2761 ^ i5) * (-18591)) ^ 841667782;
                        i2 = 718882228;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۘ") ^ i4) * 9;
                        i = ((iM2761 ^ i5) * (-21123)) ^ (-1408311813);
                        i2 = -1939933389;
                    }
                    i7 = iM2761 ^ i2;
                    menu2 = menu;
                    sArr2 = sArr;
                    i6 = i;
                    break;
                case -342418939:
                case 1993895755:
                    sArr = sArr2;
                    i14 = i13 * i13;
                    i15 = s * s;
                    i12 = 40398736;
                    if (C3448.f11240 < 0) {
                        iM2761 = C0619.m2761("᩻ۗ") ^ i5;
                        i = ((iM2761 ^ i4) * (-5623)) ^ 281901825;
                        i2 = 27289114;
                        i7 = iM2761 ^ i2;
                        menu2 = menu;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        sArr2 = sArr;
                        int iM31614 = (C0773.m3169("᩻ۡ") + i4) * 81;
                        i6 = ((iM31614 ^ i5) * (-30773)) ^ 1845444603;
                        i7 = iM31614 ^ 130929628;
                        menu2 = menu;
                    }
                    break;
                case 524627168:
                case 842047466:
                    sArr = sArr2;
                    short s2 = sArr4[c];
                    int i19 = s2 + 6356;
                    if (C3099.f10023 > 0) {
                        int iM2765 = (i4 - C0619.m2761("᩻֫")) * 85;
                        int i20 = ((iM2765 ^ i5) * (-25325)) ^ 1167386351;
                        i7 = iM2765 ^ (-1173572330);
                        sArr2 = sArr;
                        s = s2;
                        i6 = i20;
                        i13 = i19;
                        menu2 = menu;
                    } else {
                        s = s2;
                        i13 = i19;
                        iM2761 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM2761 ^ i4) * 17653) ^ (-525159889);
                        i2 = 2120706352;
                        i7 = iM2761 ^ i2;
                        menu2 = menu;
                        sArr2 = sArr;
                        i6 = i;
                    }
                    break;
                case 870870609:
                case 1346308423:
                    icon = menuItemM2062.getIcon();
                    C1321.m4848(icon);
                    if (C2485.f7950 == 0) {
                        iM3169 = (C0773.m3169("ۘ᩻") + i5) * (-63);
                        i = ((iM3169 ^ i4) * 17367) ^ 1786162505;
                        i3 = 1569355776;
                        i7 = iM3169 ^ i3;
                        i6 = i;
                    }
                    sArr = sArr2;
                    iM2761 = C0619.m2761("᩸᩻") ^ i4;
                    i = ((iM2761 ^ i5) * 6935) ^ 176741179;
                    i2 = 937400698;
                    i7 = iM2761 ^ i2;
                    menu2 = menu;
                    sArr2 = sArr;
                    i6 = i;
                    break;
                case 982730851:
                case 1777445259:
                    strM11486 = C3492.m11486(sArr3, i11, 3, i8);
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("֫۠") ^ i4;
                        i = ((iM3169 ^ i5) * (-10571)) ^ (-634216383);
                        i3 = -1268723699;
                    } else {
                        iM3169 = C0773.m3169("۟᩺") ^ i5;
                        i = ((iM3169 ^ i4) * (-8067)) ^ (-1624615606);
                        i3 = -1148940211;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i;
                    break;
                case 1577380368:
                case 1988206356:
                    i8 = 54958;
                    int iM2766 = (i5 - C0619.m2761("ᩴܺ")) * 31;
                    i7 = iM2766 ^ (-140333864);
                    sArr2 = sArr2;
                    i6 = ((iM2766 ^ i4) * 16801) ^ 130174989;
                    menu2 = menu;
                    break;
                case 1775106493:
                case 1825211370:
                    sArr = sArr2;
                    iM2762 = C0619.m2761(C3099.m10092(sArr, i9, i10, i8));
                    if (AbstractC0116.f1064 <= 0) {
                        i17 = 2129427494;
                        iM2761 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM2761 ^ i4) * 17653) ^ (-525159889);
                        i2 = 2120706352;
                        i7 = iM2761 ^ i2;
                        menu2 = menu;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM31615 = (C0773.m3169("᩹ܺ") ^ i4) * (-25);
                        sArr2 = sArr;
                        i6 = ((iM31615 ^ i5) * (-29149)) ^ 1397347610;
                        i7 = iM31615 ^ (-1701125804);
                        i17 = 2129427494;
                    }
                    break;
                default:
                    C2834.m9344();
                    int iM31616 = (C0773.m3169("᩻ۡ") + i4) * 81;
                    i6 = ((iM31616 ^ i5) * (-30773)) ^ 1845444603;
                    i7 = iM31616 ^ 130929628;
                    menu2 = menu;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x015a A[PHI: r3 r4 r5 r11 r12
      0x015a: PHI (r3v6 android.widget.Button) = (r3v3 android.widget.Button), (r3v1 android.widget.Button), (r3v1 android.widget.Button) binds: [B:43:0x0158, B:33:0x0104, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r4v6 android.widget.Button) = (r4v1 android.widget.Button), (r4v3 android.widget.Button), (r4v1 android.widget.Button) binds: [B:43:0x0158, B:33:0x0104, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r5v5 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:43:0x0158, B:33:0x0104, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r11v6 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:43:0x0158, B:33:0x0104, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r12v6 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:43:0x0158, B:33:0x0104, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x029c A[PHI: r10 r23 r24
      0x029c: PHI (r10v11 int) = (r10v9 int), (r10v12 int) binds: [B:67:0x0283, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r23v11 android.widget.Button) = (r23v9 android.widget.Button), (r23v12 android.widget.Button) binds: [B:67:0x0283, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r24v3 l.ܿۨ֫) = (r24v2 l.ܿۨ֫), (r24v1 l.ܿۨ֫) binds: [B:67:0x0283, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m47556() {
        int iM2761;
        int i;
        int i2;
        short s;
        int iM2762;
        int i3;
        int i4;
        int iM2763;
        int i5;
        int i6;
        ActivityC20779 activityC20779 = this;
        Button button = null;
        Button button2 = null;
        Button button3 = null;
        int i7 = 0;
        Button button4 = null;
        String strM11252 = null;
        String strM7749 = null;
        int iM2764 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = -678928262;
        int i10 = C20932.f66974;
        int i11 = C4282.f15546;
        int iM2765 = C0619.m2761("ۖ᩻") ^ i10;
        int i12 = ((iM2765 ^ i11) * 27303) ^ 1847025497;
        int i13 = iM2765 ^ 1081190503;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i14 = 0;
        char c = 0;
        short s2 = 0;
        int i15 = 0;
        C18300 c18300M52717 = null;
        int i16 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-10995)) >> 31));
            switch (i9) {
                case -1758347984:
                case 786581872:
                    i8 = 32333;
                    iM2761 = C0773.m3169("᩶ۗ") ^ i10;
                    i = ((iM2761 ^ i11) * 25127) ^ (-769102645);
                    i2 = 1986148805;
                    int i17 = iM2761 ^ i2;
                    i16 = i16;
                    Button button5 = button;
                    i13 = i17;
                    i12 = i;
                    button = button5;
                    break;
                case -1674749056:
                case 1433073309:
                    if (C0619.f2439) {
                        iM2763 = (C0773.m3169("ܽܰ") + i10) * (-87);
                        i5 = ((iM2763 ^ i11) * (-31503)) ^ (-1939131591);
                        i6 = -1053802328;
                    } else {
                        iM2763 = C0619.m2761("᩻᩷") ^ i11;
                        i5 = ((iM2763 ^ i10) * 23197) ^ 355052563;
                        i6 = 2111915534;
                    }
                    i13 = iM2763 ^ i6;
                    i12 = i5;
                    break;
                case -1561600148:
                case 2106867644:
                    C23916.m53431(activityC20779.f66566, false);
                    button3 = activityC20779.f66566;
                    i7 = -855638017;
                    if (C2485.f7950 != 0) {
                        iM2763 = (C0773.m3169("ܽܰ") + i10) * (-87);
                        i5 = ((iM2763 ^ i11) * (-31503)) ^ (-1939131591);
                        i6 = -1053802328;
                    } else {
                        iM2763 = (i11 - C0619.m2761("ܿۙ")) * (-71);
                        i5 = ((iM2763 ^ i10) * (-15623)) ^ (-1599168810);
                        i6 = -901789963;
                    }
                    i13 = iM2763 ^ i6;
                    i12 = i5;
                    break;
                case -1541000947:
                case 1790807687:
                    button = button;
                    s = s2;
                    i16 = i16;
                    sArr2 = f66564;
                    c = '<';
                    if (C2287.f7432 >= 0) {
                        iM2762 = (C0773.m3169("۟᩸") ^ i11) * (-13);
                        i12 = ((iM2762 ^ i10) * 12129) ^ (-1638697457);
                        i3 = -137817414;
                    } else {
                        iM2762 = C0619.m2761("ۗۧ") ^ i10;
                        i12 = ((iM2762 ^ i11) * 17321) ^ 1100218502;
                        i3 = 1243060403;
                    }
                    i4 = iM2762 ^ i3;
                    s2 = s;
                    i16 = i16;
                    button = button;
                    i13 = i4;
                    activityC20779 = this;
                    break;
                case -1528506188:
                case -1255577744:
                    C1321.m4852();
                    if (C0950.f3488 < 0) {
                        iM2763 = C0619.m2761("᩻᩷") ^ i11;
                        i5 = ((iM2763 ^ i10) * 23197) ^ 355052563;
                        i6 = 2111915534;
                        i13 = iM2763 ^ i6;
                        i12 = i5;
                    } else {
                        button = button;
                        s = s2;
                        i16 = i16;
                        iM2762 = (C0773.m3169("۟᩸") ^ i11) * (-13);
                        i12 = ((iM2762 ^ i10) * 12129) ^ (-1638697457);
                        i3 = -137817414;
                        i4 = iM2762 ^ i3;
                        s2 = s;
                        i16 = i16;
                        button = button;
                        i13 = i4;
                        activityC20779 = this;
                    }
                    break;
                case -1472293048:
                case 1497478727:
                    if (C2485.m8357() <= 0) {
                        i16 = i16;
                        iM2761 = (C0773.m3169("֫ᩴ") ^ i10) * (-37);
                        button = button;
                        i = ((iM2761 ^ i11) * (-7515)) ^ 393614674;
                        i2 = 95031482;
                        int i18 = iM2761 ^ i2;
                        i16 = i16;
                        Button button6 = button;
                        i13 = i18;
                        i12 = i;
                        button = button6;
                    } else {
                        button = button;
                        s = s2;
                        i16 = i16;
                        iM2762 = (C0773.m3169("۟᩸") ^ i11) * (-13);
                        i12 = ((iM2762 ^ i10) * 12129) ^ (-1638697457);
                        i3 = -137817414;
                        i4 = iM2762 ^ i3;
                        s2 = s;
                        i16 = i16;
                        button = button;
                        i13 = i4;
                        activityC20779 = this;
                    }
                    break;
                case -1369264593:
                case 588743107:
                    button = button;
                    i16 = i16;
                    if (c18300M52717.m42650() >= activityC20779.f66576.m28200()) {
                        iM2761 = (i10 - C0619.m2761("ۛۜ")) * (-103);
                        i = ((iM2761 ^ i11) * 21267) ^ 51574803;
                        i2 = -1167611592;
                    } else {
                        iM2761 = C0619.m2761("ܰۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 32301) ^ (-720732039);
                        i2 = 932689578;
                    }
                    int i19 = iM2761 ^ i2;
                    i16 = i16;
                    Button button7 = button;
                    i13 = i19;
                    i12 = i;
                    button = button7;
                    break;
                case -1246296178:
                case 322235405:
                    button = button;
                    i16 = i16;
                    C23916.m53431(activityC20779.f66566, true);
                    if (C2702.f8586 > 0) {
                        iM2761 = (C0619.m2761("ۖۖ") ^ i10) * (-93);
                        i = ((iM2761 ^ i11) * 9369) ^ (-1204747762);
                        i2 = -1422059385;
                        int i110 = iM2761 ^ i2;
                        i16 = i16;
                        Button button8 = button;
                        i13 = i110;
                        i12 = i;
                        button = button8;
                    } else {
                        i16 = i16;
                        button = button;
                        int iM3169 = C0773.m3169("۬ܳ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 18989) ^ 429505110;
                        i13 = iM3169 ^ 1909036111;
                        activityC20779 = this;
                    }
                    break;
                case -893064950:
                case 59731299:
                    i8 = 2919;
                    iM2761 = C0773.m3169("᩶ۗ") ^ i10;
                    i = ((iM2761 ^ i11) * 25127) ^ (-769102645);
                    i2 = 1986148805;
                    int i111 = iM2761 ^ i2;
                    i16 = i16;
                    Button button9 = button;
                    i13 = i111;
                    i12 = i;
                    button = button9;
                    break;
                case -823181623:
                case 1615832603:
                    button = button;
                    i16 = i16;
                    s = s2;
                    if ((s * 27344) - (i15 + 186923584) <= 0) {
                        iM2762 = (C0619.m2761("ᩳ᩷") ^ i10) * 61;
                        i12 = ((iM2762 ^ i11) * (-29575)) ^ 1944573985;
                        i3 = 821841662;
                    } else {
                        iM2762 = (C0773.m3169("֡ܶ") + i11) * 101;
                        i12 = ((iM2762 ^ i10) * (-28057)) ^ 2071684449;
                        i3 = -472666494;
                    }
                    i4 = iM2762 ^ i3;
                    s2 = s;
                    i16 = i16;
                    button = button;
                    i13 = i4;
                    activityC20779 = this;
                    break;
                case -729941954:
                case -286417072:
                    AbstractC3624.m11755();
                    break;
                case -718697058:
                case 1458295641:
                    C23916.m53419();
                    RunnableC0334.m2063();
                    button = button;
                    s = s2;
                    i16 = i16;
                    iM2762 = (C0773.m3169("۟᩸") ^ i11) * (-13);
                    i12 = ((iM2762 ^ i10) * 12129) ^ (-1638697457);
                    i3 = -137817414;
                    i4 = iM2762 ^ i3;
                    s2 = s;
                    i16 = i16;
                    button = button;
                    i13 = i4;
                    activityC20779 = this;
                    break;
                case -663752785:
                case 1617346889:
                    button2 = activityC20779.f66566;
                    sArr3 = f66564;
                    i14 = 64;
                    if (C0269.f1558 <= 0) {
                        iM2763 = (C0773.m3169("ܽܰ") + i10) * (-87);
                        i5 = ((iM2763 ^ i11) * (-31503)) ^ (-1939131591);
                        i6 = -1053802328;
                    } else {
                        iM2763 = (i11 - C0619.m2761("᩻֨")) * 123;
                        i5 = ((iM2763 ^ i10) * 24483) ^ 1864969690;
                        i6 = 2126135717;
                    }
                    i13 = iM2763 ^ i6;
                    i12 = i5;
                    break;
                case -656391064:
                case 1110715916:
                    button = button;
                    i16 = i16;
                    C3077.m10043(activityC20779.f66566, -1);
                    if (c18300M52717 != null) {
                        iM2761 = C0773.m3169("ۘܿ") ^ i10;
                        i = ((iM2761 ^ i11) * 31619) ^ (-1287061117);
                        i2 = 1252709035;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܳۤ")) * 53;
                        i = ((iM2761 ^ i10) * (-31251)) ^ (-1713000966);
                        i2 = -46259273;
                    }
                    int i112 = iM2761 ^ i2;
                    i16 = i16;
                    Button button10 = button;
                    i13 = i112;
                    i12 = i;
                    button = button10;
                    break;
                case -491905151:
                case 870429275:
                    C1080.m4060(button2, C0619.m2761(strM7749) ^ 2124816382);
                    break;
                case -480895456:
                case 1625000646:
                    button = button;
                    i16 = i16;
                    s2 = sArr2[c];
                    i15 = s2 * s2;
                    if (!RunnableC1848.f6235) {
                        int iM2766 = (C0619.m2761("ۙ֡") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i12 = ((iM2766 ^ i10) * (-2411)) ^ 813762236;
                        i4 = iM2766 ^ (-2104098392);
                        i16 = i16;
                        button = button;
                        i13 = i4;
                        activityC20779 = this;
                    }
                    i16 = i16;
                    button = button;
                    int iM31610 = C0773.m3169("۬ܳ") ^ i11;
                    i12 = ((iM31610 ^ i10) * 18989) ^ 429505110;
                    i13 = iM31610 ^ 1909036111;
                    activityC20779 = this;
                    break;
                case -408556291:
                case 2062163856:
                    strM7749 = C2287.m7749(sArr3, i14, 3, i8);
                    if (C1564.m5509() > 0) {
                        iM2763 = (C0773.m3169("ۗۙ") + i10) * (-65);
                        i5 = ((iM2763 ^ i11) * 5623) ^ 568129038;
                        i6 = -1016619688;
                        i13 = iM2763 ^ i6;
                        i12 = i5;
                    } else {
                        int iM31611 = C0773.m3169("۬ܳ") ^ i11;
                        i12 = ((iM31611 ^ i10) * 18989) ^ 429505110;
                        i13 = iM31611 ^ 1909036111;
                        activityC20779 = this;
                    }
                    break;
                case -297001190:
                case 311989620:
                    C2023.m6954(button4, 2125242207 ^ iM2764);
                    break;
                case -22373244:
                case 1334470208:
                    iM2764 = C0619.m2761(C3998.m12925(sArr4, 67, 3, i8));
                    if (AbstractC0641.f2496 < 0) {
                        iM2763 = (C0619.m2761("ۡۡ") + i10) * (-41);
                        i5 = ((iM2763 ^ i11) * (-9751)) ^ (-1095444584);
                        i6 = -883114359;
                        i13 = iM2763 ^ i6;
                        i12 = i5;
                    } else {
                        int iM31612 = C0773.m3169("۬ܳ") ^ i11;
                        i12 = ((iM31612 ^ i10) * 18989) ^ 429505110;
                        i13 = iM31612 ^ 1909036111;
                        activityC20779 = this;
                    }
                    break;
                case 290473590:
                case 485094134:
                    C3077.m10043(button3, i7);
                    button4 = activityC20779.f66566;
                    sArr4 = f66564;
                    if (C11235.m28309() == 0) {
                        iM2763 = (C0773.m3169("ᩳۙ") + i11) * 83;
                        i5 = ((iM2763 ^ i10) * (-30207)) ^ (-256505792);
                        i6 = -1381407679;
                        i13 = iM2763 ^ i6;
                        i12 = i5;
                    } else {
                        int iM31613 = C0773.m3169("۬ܳ") ^ i11;
                        i12 = ((iM31613 ^ i10) * 18989) ^ 429505110;
                        i13 = iM31613 ^ 1909036111;
                        activityC20779 = this;
                    }
                    break;
                case 694081117:
                case 1554893409:
                    button = button;
                    i16 = i16;
                    c18300M52717 = C23522.m52717(activityC20779.f66574);
                    if (c18300M52717 != null) {
                        iM2761 = (i11 - C0773.m3169("ܳۙ")) * (-121);
                        i = ((iM2761 ^ i10) * (-16025)) ^ 968699800;
                        i2 = 23448006;
                    } else {
                        iM2761 = C0619.m2761("ܰۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 32301) ^ (-720732039);
                        i2 = 932689578;
                    }
                    int i113 = iM2761 ^ i2;
                    i16 = i16;
                    Button button11 = button;
                    i13 = i113;
                    i12 = i;
                    button = button11;
                    break;
                case 756768116:
                case 929472598:
                    C1080.m4060(button, C0773.m3169(strM11252) ^ 2099224942);
                    break;
                case 1699464036:
                case 1753796195:
                    button = activityC20779.f66566;
                    sArr = f66564;
                    i16 = 61;
                    if (AbstractC0641.f2496 < 0) {
                        iM2763 = (C0619.m2761("ۨ۟") ^ i10) * 29;
                        i5 = ((iM2763 ^ i11) * 12475) ^ (-412263583);
                        i6 = -1631315010;
                        i13 = iM2763 ^ i6;
                        i12 = i5;
                    } else {
                        int iM31614 = C0773.m3169("۬ܳ") ^ i11;
                        i12 = ((iM31614 ^ i10) * 18989) ^ 429505110;
                        i13 = iM31614 ^ 1909036111;
                        activityC20779 = this;
                    }
                    break;
                default:
                    i16 = i16;
                    strM11252 = C3448.m11252(sArr, i16, 3, i8);
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("֫ᩴ") ^ i10) * (-37);
                        button = button;
                        i = ((iM2761 ^ i11) * (-7515)) ^ 393614674;
                        i2 = 95031482;
                    } else {
                        button = button;
                        iM2761 = (C0773.m3169("ܺ᩻") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i10) * (-29903)) ^ 883281805;
                        i2 = -1994388724;
                    }
                    int i114 = iM2761 ^ i2;
                    i16 = i16;
                    Button button12 = button;
                    i13 = i114;
                    i12 = i;
                    button = button12;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x026c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47537(ImageView imageView, Button button, ViewGroup viewGroup) {
        int i;
        int i2;
        int pixel;
        int i3;
        C20905 c20905;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C20905 c20906;
        int i11;
        int i12;
        int i13;
        int i14;
        Bitmap.Config config;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C20905 c20907;
        Bitmap.Config config2;
        C20905 c20908;
        int i26;
        Rect rect;
        int iM2761;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        C20905 c20909;
        int i32;
        int i33;
        int i34;
        int i35;
        int iM2762;
        int i36;
        int i37;
        int i38;
        int iM3169;
        int i39;
        int i40;
        int iM2763;
        int i41;
        int i42;
        int iM31610;
        int i43;
        int i44;
        int iM31611;
        int i45;
        int i46;
        int iM2764;
        int i47;
        int i48;
        C20905 c209010;
        int iM2765;
        int i49;
        int i50;
        int i51;
        C20905 c209011;
        int i52;
        int i53;
        Drawable drawable;
        Rect rect2;
        Bitmap bitmap;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int iM2766;
        int i59;
        int i60;
        int iM31612;
        int i61;
        int i62;
        int iM31613;
        int i63;
        int i64;
        Rect rect3;
        int i65;
        int iM2767;
        int i66;
        int i67;
        int iM31614;
        int i68;
        int iM2768;
        int i69;
        int i70 = C3779.f12953;
        int i71 = AbstractC0116.f1064;
        int iM31615 = (C0773.m3169("ۧܿ") ^ i71) * 43;
        int i72 = ((iM31615 ^ i70) * (-25943)) ^ (-827993210);
        Bitmap.Config config3 = null;
        C20905 c209012 = null;
        C3751 c3751M47764 = null;
        C3751 c3751M47765 = null;
        int[] iArr = null;
        double d = 0.0d;
        Bitmap bitmapCreateBitmap = null;
        C3751 c3751M47766 = null;
        float[] fArr = null;
        int i73 = iM31615 ^ 1354530110;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        int iM47767 = 0;
        int i79 = 0;
        int i80 = 0;
        int intrinsicWidth = 0;
        int intrinsicHeight = 0;
        int iM12187 = 0;
        int i81 = 0;
        int i82 = 0;
        int iRed = 0;
        int i83 = 0;
        int iGreen = 0;
        int i84 = 0;
        int iBlue = 0;
        int i85 = 0;
        int iRgb = 0;
        int iM47768 = 0;
        int i86 = 0;
        int iRgb2 = 0;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        int pixel2 = 0;
        int iRed2 = 0;
        int iGreen2 = 0;
        int iBlue2 = 0;
        int i90 = 0;
        char c = 0;
        boolean z = false;
        boolean z2 = false;
        int i91 = 0;
        int iM12188 = 0;
        int i92 = 0;
        int iRgb3 = 0;
        int iM12189 = 0;
        int pixel3 = 0;
        int width = 0;
        int height = 0;
        int i93 = 0;
        int i94 = 0;
        int i95 = 0;
        int iM7976 = 0;
        int i96 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i97 = -699123462;
        int i98 = 0;
        Canvas canvas = null;
        C3751 c3751M47767 = null;
        double dM22610 = 0.0d;
        C20905 c209013 = null;
        C3751 c3751M47768 = null;
        int i99 = 0;
        int pixel4 = 0;
        Drawable drawable2 = null;
        Rect rect4 = null;
        Bitmap bitmapCreateBitmap2 = null;
        int i100 = 0;
        int i101 = 0;
        while (true) {
            i97 = i73 ^ (i72 & (((i97 ^ i70) * (-31761)) >> 31));
            switch (i97) {
                case -2125853637:
                case -297277713:
                    i78 = i78;
                    pixel4 = pixel4;
                    i74 = i74;
                    i87 = i87;
                    drawable2 = drawable2;
                    i82 = i82;
                    i95 = i95;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    C20905 c209014 = c209013;
                    i100 = i100;
                    c209012 = c209012;
                    pixel2 = pixel2;
                    iM7976 = iM7976;
                    i98 = i98;
                    i75 = i75;
                    pixel3 = pixel3;
                    c209010 = c209014;
                    c3751M47767 = c209012.m47764(C12700.f40683);
                    if (c3751M47767 != null) {
                        iM2765 = (C0773.m3169("۬ᩴ") + i70) * 101;
                        i49 = ((iM2765 ^ i71) * 28807) ^ (-1602183953);
                        i50 = -857862804;
                    } else {
                        iM2765 = C0619.m2761("ۢܶ") ^ i71;
                        i49 = ((iM2765 ^ i70) * (-20319)) ^ 1513395493;
                        i50 = 711420324;
                    }
                    int i102 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i103 = i78;
                    i73 = i102;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i103;
                    int i104 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i104;
                    break;
                case -2106545896:
                case -857147362:
                    i38 = 939524096;
                    i92 = i91;
                    iM3169 = (C0773.m3169("ᩳ᩵") + i70) * (-81);
                    i39 = i38;
                    i72 = ((iM3169 ^ i71) * (-25169)) ^ 1918673481;
                    i40 = 1087969619;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i39;
                    i73 = iM3169 ^ i40;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -2080229292:
                case -88146459:
                    i78 = i78;
                    c20909 = c209013;
                    i100 = i100;
                    i74 = i74;
                    int i105 = i75;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i32 = iM7976;
                    iRgb3 = Color.rgb(i32, C23916.m53427(i88 / i89, i80), C2354.m7976((i85 * 5) / 4, i80));
                    i75 = i105;
                    i34 = iRgb;
                    i33 = i34;
                    i91 = iRgb2;
                    i95 = i95;
                    int iM2769 = (C0619.m2761("ۛۙ") ^ i70) * 75;
                    int i106 = i34;
                    i72 = ((iM2769 ^ i71) * (-5163)) ^ 53390395;
                    iM7976 = i32;
                    i75 = i75;
                    i98 = i33;
                    i100 = i100;
                    c209013 = c20909;
                    Rect rect5 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = iM2769 ^ (-1141370175);
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect5;
                    i95 = i95;
                    i82 = i106;
                    break;
                case -2071134702:
                case -1186633504:
                    i78 = i78;
                    c20909 = c209013;
                    i100 = i100;
                    i74 = i74;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i107 = i82;
                    i95 = i95;
                    int i108 = i98;
                    i75 = i75;
                    i32 = iM7976;
                    i98 = i108;
                    if (iM12187 != 0) {
                        i33 = iM12187;
                        i34 = iM47768;
                        i91 = iM12188;
                        iRgb3 = iM12189;
                        int iM27610 = (C0619.m2761("ۛۙ") ^ i70) * 75;
                        int i109 = i34;
                        i72 = ((iM27610 ^ i71) * (-5163)) ^ 53390395;
                        iM7976 = i32;
                        i75 = i75;
                        i98 = i33;
                        i100 = i100;
                        c209013 = c20909;
                        Rect rect6 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = iM27610 ^ (-1141370175);
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect6;
                        i95 = i95;
                        i82 = i109;
                    } else {
                        int i110 = i87;
                        i82 = i107;
                        pixel2 = pixel2;
                        iM7976 = i32;
                        pixel3 = pixel3;
                        c209013 = c20909;
                        pixel4 = pixel4;
                        i87 = i110;
                        iM2761 = C0619.m2761("᩸ۗ") ^ i70;
                        i27 = ((iM2761 ^ i71) * 2967) ^ (-110925222);
                        i28 = 331288350;
                        int i111 = iM2761 ^ i28;
                        i95 = i95;
                        i82 = i82;
                        i87 = i87;
                        pixel4 = pixel4;
                        i26 = i78;
                        i73 = i111;
                        i72 = i27;
                        i100 = i100;
                        c209013 = c209013;
                        pixel3 = pixel3;
                        i75 = i75;
                        i98 = i98;
                        iM7976 = iM7976;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
                case -1985494394:
                case -715904253:
                    fArr[c] = f - f2;
                    iM2767 = (i70 - C0773.m3169("ۢۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i66 = ((iM2767 ^ i71) * (-17803)) ^ 1041307632;
                    i67 = 1287765412;
                    int i112 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i112;
                    i72 = i66;
                    break;
                case -1893260861:
                case -775136042:
                    C3448.m11248();
                    if (C3492.f12043 > 0) {
                        iM2768 = (C0773.m3169("۠ۡ") + i71) * 119;
                        i66 = ((iM2768 ^ i70) * 29467) ^ (-1715422123);
                        i69 = 252936798;
                    } else {
                        iM2768 = C0773.m3169("۟ۡ") ^ i70;
                        i66 = ((iM2768 ^ i71) * 17261) ^ 212596491;
                        i69 = -1840957970;
                    }
                    i73 = iM2768 ^ i69;
                    i72 = i66;
                    break;
                case -1882503429:
                case -149139487:
                    z = false;
                    iM31612 = (C0773.m3169("ۨܿ") + i71) * (-79);
                    i61 = ((iM31612 ^ i70) * (-9919)) ^ (-1924723380);
                    i62 = 497192291;
                    int i113 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i113;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case -1878179052:
                case 1445783288:
                    i78 = i78;
                    c209013 = c209013;
                    if (c3751M47766 == null) {
                        iM31610 = C0773.m3169("᩶᩺") ^ i71;
                        i43 = ((iM31610 ^ i70) * 13329) ^ 1823752690;
                        i44 = 1107719660;
                    } else {
                        c3751M47768 = c3751M47766;
                        iM31610 = C0619.m2761("ۨۢ") ^ i70;
                        i43 = ((iM31610 ^ i71) * 28851) ^ 1187875427;
                        i44 = 1704454224;
                    }
                    int i114 = iM31610 ^ i44;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i114;
                    i72 = i43;
                    i78 = i26;
                    break;
                case -1876736528:
                case -1634179058:
                    i74 = i74;
                    c209013 = c209013;
                    i100 = i100;
                    i38 = 553648127;
                    i92 = i98;
                    iM3169 = (C0773.m3169("ᩳ᩵") + i70) * (-81);
                    i39 = i38;
                    i72 = ((iM3169 ^ i71) * (-25169)) ^ 1918673481;
                    i40 = 1087969619;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i39;
                    i73 = iM3169 ^ i40;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -1855847076:
                case -574008465:
                    i51 = i78;
                    c209011 = c209013;
                    i52 = i100;
                    i53 = i74;
                    int i115 = i95;
                    drawable = drawable2;
                    rect2 = rect4;
                    bitmap = bitmapCreateBitmap;
                    int i116 = i82;
                    int i117 = i98;
                    i54 = i75;
                    i55 = iM7976;
                    i56 = i117;
                    int i118 = i96;
                    if (i118 < 5) {
                        int iM31616 = C0773.m3169("ۙܳ") ^ i70;
                        i72 = ((iM31616 ^ i71) * (-27699)) ^ (-1732545968);
                        i96 = i118;
                        i95 = i115;
                        i100 = i52;
                        i82 = i116;
                        c209013 = c209011;
                        bitmapCreateBitmap = bitmap;
                        rect4 = rect2;
                        drawable2 = drawable;
                        i74 = i53;
                        i78 = i51;
                        i73 = iM31616 ^ 585973200;
                        i81 = 5;
                    } else {
                        int iM31617 = C0773.m3169("ܿᩴ") ^ i71;
                        i96 = i118;
                        i57 = ((iM31617 ^ i70) * 18089) ^ (-397151081);
                        i58 = iM31617 ^ (-1666362047);
                        i95 = i115;
                        i81 = 5;
                        i82 = i116;
                        bitmapCreateBitmap = bitmap;
                        rect4 = rect2;
                        drawable2 = drawable;
                        i74 = i53;
                        i78 = i51;
                        i73 = i58;
                        i72 = i57;
                        i100 = i52;
                        c209013 = c209011;
                    }
                    int i119 = i56;
                    iM7976 = i55;
                    i75 = i54;
                    i98 = i119;
                    break;
                case -1806293319:
                case 1324500630:
                    int i120 = i78;
                    C20905 c209015 = c209013;
                    int i121 = i100;
                    int i122 = i74;
                    int i123 = i95;
                    Drawable drawable3 = drawable2;
                    Rect rect7 = rect4;
                    Bitmap bitmap2 = bitmapCreateBitmap;
                    int i124 = i98;
                    i54 = i75;
                    i55 = iM7976;
                    i56 = i124;
                    float[] fArr2 = new float[3];
                    int i125 = i82;
                    C8420.m22613(i125, fArr2);
                    if (fArr2[2] < 0.33f) {
                        iM2766 = C0619.m2761("᩺ۡ") ^ i71;
                        i59 = ((iM2766 ^ i70) * (-17463)) ^ (-2015514013);
                        i60 = 591945316;
                    } else {
                        iM2766 = C0619.m2761("ܳ᩷") ^ i70;
                        i59 = ((iM2766 ^ i71) * 7683) ^ 1068069520;
                        i60 = -1504450967;
                    }
                    int i126 = iM2766 ^ i60;
                    i95 = i123;
                    i82 = i125;
                    bitmapCreateBitmap = bitmap2;
                    i100 = i121;
                    rect4 = rect7;
                    drawable2 = drawable3;
                    c209013 = c209015;
                    i74 = i122;
                    i78 = i120;
                    i73 = i126;
                    i72 = i59;
                    i79 = 3;
                    int i1110 = i56;
                    iM7976 = i55;
                    i75 = i54;
                    i98 = i1110;
                    break;
                case -1788419653:
                case -281449570:
                    int i127 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    canvas.drawColor(i92 & 1157627903);
                    C8398.m22563(bitmapCreateBitmap2);
                    canvas.drawColor(i127);
                    if (!C3296.m10878()) {
                        i78 = i127;
                        iM2762 = C0773.m3169("ܿ᩺") ^ i71;
                        i36 = ((iM2762 ^ i70) * 20125) ^ (-1565426859);
                        i37 = -1041704997;
                        i42 = iM2762 ^ i37;
                        i100 = i100;
                        c209013 = c209013;
                        i26 = i78;
                        i73 = i42;
                        i72 = i36;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        iM3169 = C0619.m2761("ܿۢ") ^ i70;
                        i39 = i127;
                        i72 = ((iM3169 ^ i71) * (-1513)) ^ 118053391;
                        i40 = 898465163;
                        i100 = i100;
                        c209013 = c209013;
                        i26 = i39;
                        i73 = iM3169 ^ i40;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
                case -1771388455:
                case 952755325:
                    i78 = i78;
                    c209013 = c209013;
                    float[] fArr3 = new float[i79];
                    C8420.m22613(i101, fArr3);
                    float f3 = fArr3[c];
                    C8420.m22613(iM47767, fArr3);
                    i100 = i100;
                    i74 = i74;
                    int i128 = (int) (((d - dM22610) / d) * 32.0d);
                    if (f3 < fArr3[c]) {
                        iM2763 = C0619.m2761("ۘ᩵") ^ i71;
                        i36 = ((iM2763 ^ i70) * (-18677)) ^ (-1651214991);
                        i41 = 541014327;
                    } else {
                        iM2763 = (C0619.m2761("ۗ᩷") ^ i71) * 69;
                        i36 = ((iM2763 ^ i70) * (-7089)) ^ (-999196184);
                        i41 = -1148664977;
                    }
                    i42 = iM2763 ^ i41;
                    i76 = i128;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -1733078040:
                case -1153810808:
                    i51 = i78;
                    c209011 = c209013;
                    i52 = i100;
                    i53 = i74;
                    drawable = drawable2;
                    rect2 = rect4;
                    bitmap = bitmapCreateBitmap;
                    int i129 = i98;
                    i54 = i75;
                    i55 = iM7976;
                    i56 = i129;
                    int i130 = iRed / i81;
                    int i131 = iGreen / i81;
                    int i132 = iBlue / i81;
                    iRgb = Color.rgb(i130, i131, i132);
                    i95 = (i130 * 3) / 4;
                    i86 = 3;
                    if (C1321.f4751 >= 0) {
                        i83 = i130;
                        i84 = i131;
                        i85 = i132;
                        int iM27611 = (i71 - C0619.m2761("֨ܶ")) * 49;
                        i57 = ((iM27611 ^ i70) * 11533) ^ (-1575315143);
                        i58 = iM27611 ^ (-1386757422);
                        bitmapCreateBitmap = bitmap;
                        rect4 = rect2;
                        drawable2 = drawable;
                        i74 = i53;
                        i78 = i51;
                        i73 = i58;
                        i72 = i57;
                    } else {
                        int iM31618 = C0773.m3169("ܶ֨") ^ i70;
                        i72 = ((iM31618 ^ i71) * (-24293)) ^ 126675165;
                        i85 = i132;
                        bitmapCreateBitmap = bitmap;
                        rect4 = rect2;
                        drawable2 = drawable;
                        i74 = i53;
                        i78 = i51;
                        i73 = iM31618 ^ 843198095;
                        i83 = i130;
                        i84 = i131;
                    }
                    i100 = i52;
                    c209013 = c209011;
                    int i1111 = i56;
                    iM7976 = i55;
                    i75 = i54;
                    i98 = i1111;
                    break;
                case -1552559697:
                case 1276079516:
                    i78 = i78;
                    if (c3751M47768 != null) {
                        iM2767 = (i70 - C0773.m3169("ܽ᩺")) * (-21);
                        i66 = ((iM2767 ^ i71) * 3373) ^ (-2010627231);
                        i67 = 1990523723;
                    } else {
                        iM2767 = (C0619.m2761("۬ۡ") + i71) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i66 = ((iM2767 ^ i70) * (-28231)) ^ 1907806178;
                        i67 = 1236744331;
                    }
                    int i1112 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i1112;
                    i72 = i66;
                    break;
                case -1544188164:
                case 192266140:
                    int i133 = i98;
                    int i134 = iArr[i96];
                    iRed += Color.red(i134);
                    iGreen += Color.green(i134);
                    iBlue += Color.blue(i134);
                    i96++;
                    i75 = i75;
                    pixel2 = pixel2;
                    pixel3 = pixel3;
                    iM7976 = iM7976;
                    i98 = i133;
                    c209013 = c209013;
                    i29 = i87;
                    i31 = pixel4;
                    i30 = i82;
                    int iM27612 = C0619.m2761("ۗ᩹") ^ i70;
                    int i135 = i29;
                    i72 = ((iM27612 ^ i71) * (-17997)) ^ (-621355605);
                    i35 = iM27612 ^ (-1191529752);
                    i95 = i95;
                    i82 = i30;
                    i87 = i135;
                    pixel4 = i31;
                    i26 = i78;
                    i73 = i35;
                    i100 = i100;
                    c209013 = c209013;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -1534143907:
                case 1383240878:
                    i78 = i78;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    c = 2;
                    i75 = i75;
                    if (((int) Math.sqrt((iBlue2 * iBlue2) + (iGreen2 * iGreen2) + i90)) < 70) {
                        iM31612 = C0619.m2761("᩸ܳ") ^ i70;
                        i61 = ((iM31612 ^ i71) * 18957) ^ (-1765234711);
                        i62 = -2137116329;
                    } else {
                        iM31612 = (C0619.m2761("᩻ۙ") ^ i70) * (-41);
                        i61 = ((iM31612 ^ i71) * 20919) ^ (-2071159380);
                        i62 = 349352126;
                    }
                    int i1113 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i1113;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case -1515960550:
                case -979267469:
                    c209010 = c209013;
                    iM12188 = c3751M47767.m12187();
                    iM2765 = C0773.m3169("ۡ᩵") ^ i71;
                    i49 = ((iM2765 ^ i70) * 26435) ^ (-1369671089);
                    i50 = 845490174;
                    int i1010 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i1011 = i78;
                    i73 = i1010;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i1011;
                    int i1012 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i1012;
                    break;
                case -1484134336:
                case 412478297:
                    i78 = i78;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    i75 = i75;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iRed2 = Color.red(i82) - Color.red(i98);
                    iGreen2 = Color.green(i82) - Color.green(i98);
                    if (C0487.f2131 <= 0) {
                        iM31612 = (C0619.m2761("ۡۨ") + i71) * (-41);
                        i61 = ((iM31612 ^ i70) * 11897) ^ (-1405540498);
                        i62 = -641647770;
                    } else {
                        iM31612 = C0619.m2761("ܺ۟") ^ i70;
                        i61 = ((iM31612 ^ i71) * 22669) ^ (-160905236);
                        i62 = 866419620;
                    }
                    int i1114 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i1114;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case -1483477949:
                case 1094979501:
                    canvas.drawColor(Color.argb(i76, i99, i99, i99));
                    i100 = i100;
                    i74 = i74;
                    iM2762 = C0619.m2761("ᩴۗ") ^ i71;
                    i36 = ((iM2762 ^ i70) * (-5083)) ^ (-144102726);
                    i37 = -1238501173;
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -1459268646:
                case -805254322:
                    z2 = true;
                    iM31613 = C0773.m3169("ۤ᩸") ^ i71;
                    i63 = ((iM31613 ^ i70) * (-20921)) ^ 555964457;
                    i64 = -1373266884;
                    int i136 = iM31613 ^ i64;
                    i98 = i98;
                    i72 = i63;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i136;
                    i100 = i100;
                    c209013 = c209013;
                    break;
                case -1438936684:
                case 306057839:
                    i78 = i78;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    canvas.drawColor(i98);
                    drawable2 = drawable2;
                    drawable2.draw(canvas);
                    Rect rect8 = rect4;
                    drawable2.setBounds(rect8);
                    if (!z) {
                        rect4 = rect8;
                        iM31613 = C0773.m3169("ۗۧ") ^ i70;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i63 = ((iM31613 ^ i71) * 3885) ^ (-94290947);
                        i64 = 991397581;
                        int i137 = iM31613 ^ i64;
                        i98 = i98;
                        i72 = i63;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = i137;
                        i100 = i100;
                        c209013 = c209013;
                    } else {
                        int iM27613 = C0619.m2761("ܳۜ") ^ i71;
                        i98 = i98;
                        i72 = ((iM27613 ^ i70) * 2489) ^ (-192016806);
                        i100 = i100;
                        c209013 = c209013;
                        rect3 = rect8;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = iM27613 ^ 1477631935;
                        rect4 = rect3;
                    }
                    break;
                case -1305460844:
                case 1723245571:
                    i78 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    viewGroup.setBackground(new BitmapDrawable(imageView.getResources(), bitmapCreateBitmap2));
                    width = (bitmapCreateBitmap2.getWidth() / 4) * 3;
                    height = bitmapCreateBitmap2.getHeight();
                    if (!C17202.f56030) {
                        i13 = intrinsicWidth;
                        config = config3;
                        c20905 = c209012;
                        i4 = pixel2;
                        i6 = iM7976;
                        drawable2 = drawable2;
                        i7 = i98;
                        i8 = i75;
                        i10 = pixel3;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        c20906 = c209013;
                        i14 = intrinsicHeight;
                        i5 = pixel4;
                        i9 = i87;
                        i11 = i82;
                        i12 = i95;
                        int iM27614 = C0619.m2761("ۖ᩸") ^ i71;
                        int i138 = i13;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i26 = i78;
                        i73 = iM27614 ^ (-955182201);
                        i72 = ((iM27614 ^ i70) * 29851) ^ 1604082038;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i138;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        iM2762 = C0619.m2761("᩻᩷") ^ i71;
                        i36 = ((iM2762 ^ i70) * (-2141)) ^ (-816653803);
                        i37 = 964678819;
                        i42 = iM2762 ^ i37;
                        i100 = i100;
                        c209013 = c209013;
                        i26 = i78;
                        i73 = i42;
                        i72 = i36;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
                case -1285709254:
                case -533612040:
                    i78 = i78;
                    float[] fArr4 = new float[i79];
                    C8420.m22613(c3751M47768.m12187(), fArr4);
                    f = fArr4[c];
                    f2 = 0.08f;
                    if (f < 0.7f) {
                        iM31614 = (i70 - C0773.m3169("ۡܿ")) * (-125);
                        i65 = ((iM31614 ^ i71) * 20775) ^ 997561809;
                        i68 = -1311604376;
                    } else {
                        iM31614 = C0773.m3169("ۙ᩵") ^ i71;
                        i65 = ((iM31614 ^ i70) * 14173) ^ 1061774875;
                        i68 = -1917202042;
                    }
                    i3 = iM31614 ^ i68;
                    fArr = fArr4;
                    i72 = i65;
                    i78 = i78;
                    i73 = i3;
                    break;
                case -1261822188:
                case 1029858883:
                    int i139 = height / 2;
                    int width2 = bitmapCreateBitmap2.getWidth() - width;
                    int height2 = bitmapCreateBitmap2.getHeight() - i139;
                    bitmapCreateBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                    i93 = i139;
                    i75 = width2;
                    i77 = height2;
                    i74 = 0;
                    int iM31619 = (C0773.m3169("ᩳۛ") ^ i70) * 7;
                    i78 = i78;
                    i73 = iM31619 ^ 233163542;
                    i72 = ((iM31619 ^ i71) * (-30219)) ^ 252395790;
                    i100 = i100;
                    c209013 = c209013;
                    break;
                case -1231089337:
                case -729151657:
                    C2023.m6964();
                    C2354.m7983();
                    iM2768 = (C0773.m3169("۠ۡ") + i71) * 119;
                    i66 = ((iM2768 ^ i70) * 29467) ^ (-1715422123);
                    i69 = 252936798;
                    i73 = iM2768 ^ i69;
                    i72 = i66;
                    break;
                case -1175766562:
                case -1025618479:
                    i78 = i78;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    i75 = i75;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iM7976 = C2354.m7976((i83 * 5) / 4, i80);
                    i88 = i84 * 5;
                    i89 = 4;
                    if (C0619.m2763()) {
                        iM31612 = C0619.m2761("ۨ۠") ^ i71;
                        i61 = ((iM31612 ^ i70) * 5465) ^ (-52439804);
                        i62 = -974333204;
                    } else {
                        iM31612 = C0773.m3169("ۜ᩻") ^ i71;
                        i61 = ((iM31612 ^ i70) * 15455) ^ 540032506;
                        i62 = -23007418;
                    }
                    int i1115 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i1115;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case -1144953916:
                case -973680260:
                    i78 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    iM47767 = new C16429(bitmapCreateBitmap2).m38992().m47767();
                    dM22610 = C8420.m22610(i101, iM47767);
                    d = 10.0d;
                    if (dM22610 < 10.0d) {
                        iM2762 = C0619.m2761("ܰۜ") ^ i70;
                        i36 = ((iM2762 ^ i71) * 16581) ^ 909805466;
                        i37 = -1074627261;
                    } else {
                        iM2762 = C0619.m2761("ᩴۗ") ^ i71;
                        i36 = ((iM2762 ^ i70) * (-5083)) ^ (-144102726);
                        i37 = -1238501173;
                    }
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -1143097542:
                case 585774969:
                    if (C11235.f35427 < 0) {
                        i51 = i78;
                        c209011 = c209013;
                        i52 = i100;
                        i53 = i74;
                        drawable = drawable2;
                        rect2 = rect4;
                        bitmap = bitmapCreateBitmap;
                        int i140 = i98;
                        i54 = i75;
                        i55 = iM7976;
                        i56 = i140;
                        int iM27615 = (i71 - C0619.m2761("֨ܶ")) * 49;
                        i57 = ((iM27615 ^ i70) * 11533) ^ (-1575315143);
                        i58 = iM27615 ^ (-1386757422);
                        bitmapCreateBitmap = bitmap;
                        rect4 = rect2;
                        drawable2 = drawable;
                        i74 = i53;
                        i78 = i51;
                        i73 = i58;
                        i72 = i57;
                        i100 = i52;
                        c209013 = c209011;
                        int i1116 = i56;
                        iM7976 = i55;
                        i75 = i54;
                        i98 = i1116;
                    } else {
                        iM2768 = (i70 - C0619.m2761("᩶᩹")) * (-13);
                        i66 = ((iM2768 ^ i71) * (-29743)) ^ (-405085259);
                        i69 = 937721726;
                        i73 = iM2768 ^ i69;
                        i72 = i66;
                    }
                    break;
                case -1123944408:
                case -221220824:
                    i74++;
                    int iM316110 = (C0773.m3169("ᩳۛ") ^ i70) * 7;
                    i78 = i78;
                    i73 = iM316110 ^ 233163542;
                    i72 = ((iM316110 ^ i71) * (-30219)) ^ 252395790;
                    i100 = i100;
                    c209013 = c209013;
                    break;
                case -1123288323:
                case 1561431482:
                    i78 = i78;
                    c3751M47766 = c209013.m47764(C12700.f40681);
                    iM2767 = (C0619.m2761("ۜ֨") + i70) * (-67);
                    i66 = ((iM2767 ^ i71) * (-30395)) ^ 100630578;
                    i67 = 1254842882;
                    int i1117 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i1117;
                    i72 = i66;
                    break;
                case -1041040472:
                case -427026674:
                    RunnableC3055.m9933();
                    if (RunnableC0334.f1808 <= 0) {
                        i15 = i78;
                        i16 = pixel4;
                        rect = rect4;
                        i74 = i74;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        config2 = config3;
                        c20908 = c209012;
                        i17 = i87;
                        i21 = pixel2;
                        i22 = iM7976;
                        i23 = i98;
                        i24 = i75;
                        i18 = i82;
                        i25 = pixel3;
                        i19 = i95;
                        c20907 = c209013;
                        i20 = i100;
                        iM31611 = (C0619.m2761("۠ܰ") + i70) * (-11);
                        i45 = ((iM31611 ^ i71) * 355) ^ (-520876647);
                        i46 = 46660426;
                        int i141 = iM31611 ^ i46;
                        i95 = i19;
                        i82 = i18;
                        i87 = i17;
                        pixel4 = i16;
                        Bitmap bitmap3 = bitmapCreateBitmap;
                        rect4 = rect;
                        i72 = i45;
                        i74 = i74;
                        i78 = i15;
                        i73 = i141;
                        i100 = i20;
                        c209013 = c20907;
                        pixel3 = i25;
                        i75 = i24;
                        i98 = i23;
                        iM7976 = i22;
                        pixel2 = i21;
                        c209012 = c20908;
                        config3 = config2;
                        bitmapCreateBitmap = bitmap3;
                    } else {
                        i78 = i78;
                        i5 = pixel4;
                        i74 = i74;
                        i9 = i87;
                        drawable2 = drawable2;
                        i11 = i82;
                        i12 = i95;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i14 = intrinsicHeight;
                        C20905 c209016 = c209013;
                        i100 = i100;
                        i13 = intrinsicWidth;
                        config = config3;
                        c20905 = c209012;
                        i4 = pixel2;
                        i6 = iM7976;
                        i7 = i98;
                        i8 = i75;
                        i10 = pixel3;
                        c20906 = c209016;
                        int iM27616 = C0619.m2761("ۖ᩸") ^ i71;
                        int i1310 = i13;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i26 = i78;
                        i73 = iM27616 ^ (-955182201);
                        i72 = ((iM27616 ^ i70) * 29851) ^ 1604082038;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i1310;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
                case -1022427047:
                case -153935017:
                    C1321.m4852();
                    if (C2702.f8586 <= 0) {
                        iM2768 = (C0773.m3169("۠ۡ") + i71) * 119;
                        i66 = ((iM2768 ^ i70) * 29467) ^ (-1715422123);
                        i69 = 252936798;
                    } else {
                        iM2768 = (i70 - C0619.m2761("᩶᩹")) * (-13);
                        i66 = ((iM2768 ^ i71) * (-29743)) ^ (-405085259);
                        i69 = 937721726;
                    }
                    i73 = iM2768 ^ i69;
                    i72 = i66;
                    break;
                case -997252266:
                case 1807300954:
                    C1542.m5459();
                    if (RunnableC0334.f1808 <= 0) {
                        i78 = i78;
                        c209013 = c209013;
                        i98 = i98;
                        i100 = i100;
                        i74 = i74;
                        i75 = i75;
                        drawable2 = drawable2;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM31612 = C0619.m2761("ۨ۠") ^ i71;
                        i61 = ((iM31612 ^ i70) * 5465) ^ (-52439804);
                        i62 = -974333204;
                        int i1118 = iM31612 ^ i62;
                        i98 = i98;
                        i72 = i61;
                        i75 = i75;
                        i100 = i100;
                        c209013 = c209013;
                        rect3 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = i1118;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect3;
                    } else {
                        i15 = i78;
                        i16 = pixel4;
                        rect = rect4;
                        i74 = i74;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        config2 = config3;
                        c20908 = c209012;
                        i17 = i87;
                        i21 = pixel2;
                        i22 = iM7976;
                        i23 = i98;
                        i24 = i75;
                        i18 = i82;
                        i25 = pixel3;
                        i19 = i95;
                        c20907 = c209013;
                        i20 = i100;
                        iM31611 = (C0619.m2761("۠ܰ") + i70) * (-11);
                        i45 = ((iM31611 ^ i71) * 355) ^ (-520876647);
                        i46 = 46660426;
                        int i142 = iM31611 ^ i46;
                        i95 = i19;
                        i82 = i18;
                        i87 = i17;
                        pixel4 = i16;
                        Bitmap bitmap4 = bitmapCreateBitmap;
                        rect4 = rect;
                        i72 = i45;
                        i74 = i74;
                        i78 = i15;
                        i73 = i142;
                        i100 = i20;
                        c209013 = c20907;
                        pixel3 = i25;
                        i75 = i24;
                        i98 = i23;
                        iM7976 = i22;
                        pixel2 = i21;
                        c209012 = c20908;
                        config3 = config2;
                        bitmapCreateBitmap = bitmap4;
                    }
                    break;
                case -745196733:
                case 864684517:
                    int i143 = i94;
                    int i144 = i98;
                    i75 = i75;
                    int i145 = iM7976;
                    i98 = i144;
                    int pixel5 = bitmapCreateBitmap2.getPixel(i143, i143);
                    i29 = i87;
                    i30 = i82;
                    pixel2 = pixel2;
                    iM7976 = i145;
                    pixel3 = pixel3;
                    c209013 = c209013;
                    i31 = pixel4;
                    iRed = 0;
                    iGreen = 0;
                    iBlue = 0;
                    iArr = new int[]{i29, pixel2, pixel3, i31, pixel5};
                    i96 = 0;
                    int iM27617 = C0619.m2761("ۗ᩹") ^ i70;
                    int i1311 = i29;
                    i72 = ((iM27617 ^ i71) * (-17997)) ^ (-621355605);
                    i35 = iM27617 ^ (-1191529752);
                    i95 = i95;
                    i82 = i30;
                    i87 = i1311;
                    pixel4 = i31;
                    i26 = i78;
                    i73 = i35;
                    i100 = i100;
                    c209013 = c209013;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -711179080:
                case 440155255:
                    i78 = i78;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    i75 = i75;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iBlue2 = Color.blue(i82) - Color.blue(i98);
                    i90 = iRed2 * iRed2;
                    if (RunnableC3055.f9898 >= 0) {
                        iM31612 = C0619.m2761("۟ܽ") ^ i70;
                        i61 = ((iM31612 ^ i71) * (-17675)) ^ 1669748296;
                        i62 = -317217186;
                    } else {
                        iM31612 = C0773.m3169("۬ۤ") ^ i71;
                        i61 = ((iM31612 ^ i70) * 9213) ^ (-1771119399);
                        i62 = 1449964650;
                    }
                    int i1119 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i1119;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case -697161380:
                case 175492676:
                    i78 = i78;
                    if (i100 < i77) {
                        iM2767 = C0773.m3169("ᩳܶ") ^ i70;
                        i66 = ((iM2767 ^ i71) * (-11805)) ^ (-202606298);
                        i67 = 1252162328;
                    } else {
                        iM2767 = (i71 - C0773.m3169("֫᩷")) * (-43);
                        i66 = ((iM2767 ^ i70) * 26945) ^ 133158758;
                        i67 = -1136843016;
                    }
                    int i11110 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i11110;
                    i72 = i66;
                    break;
                case -658737475:
                case 1687969052:
                    C3077.m10041();
                    if (C2287.f7432 < 0) {
                        i78 = i78;
                        i5 = pixel4;
                        i74 = i74;
                        i9 = i87;
                        drawable2 = drawable2;
                        i11 = i82;
                        i12 = i95;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i14 = intrinsicHeight;
                        C20905 c209017 = c209013;
                        i100 = i100;
                        i13 = intrinsicWidth;
                        config = config3;
                        c20905 = c209012;
                        i4 = pixel2;
                        i6 = iM7976;
                        i7 = i98;
                        i8 = i75;
                        i10 = pixel3;
                        c20906 = c209017;
                        int iM27618 = C0619.m2761("ۖ᩸") ^ i71;
                        int i1312 = i13;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i26 = i78;
                        i73 = iM27618 ^ (-955182201);
                        i72 = ((iM27618 ^ i70) * 29851) ^ 1604082038;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i1312;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        iM2768 = (C0773.m3169("۠ۡ") + i71) * 119;
                        i66 = ((iM2768 ^ i70) * 29467) ^ (-1715422123);
                        i69 = 252936798;
                        i73 = iM2768 ^ i69;
                        i72 = i66;
                    }
                    break;
                case -621070516:
                case 786067684:
                    i78 = i78;
                    c209013 = c209013;
                    if (i74 < i75) {
                        iM31610 = C0619.m2761("ۨ֫") ^ i71;
                        i43 = ((iM31610 ^ i70) * 17773) ^ (-1168497715);
                        i44 = 1383183976;
                    } else {
                        iM31610 = (C0773.m3169("ۡ֫") ^ i70) * (-125);
                        i43 = ((iM31610 ^ i71) * (-5539)) ^ (-1141871612);
                        i44 = -2013673349;
                    }
                    int i1120 = iM31610 ^ i44;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i1120;
                    i72 = i43;
                    i78 = i26;
                    break;
                case -582910791:
                case -497504546:
                    iM12189 = c3751M47765.m12187();
                    iM2761 = (C0619.m2761("᩹᩻") ^ i70) * (-91);
                    i27 = ((iM2761 ^ i71) * (-26485)) ^ 2044873171;
                    i28 = 1878991256;
                    int i1121 = iM2761 ^ i28;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    i26 = i78;
                    i73 = i1121;
                    i72 = i27;
                    i100 = i100;
                    c209013 = c209013;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -568168720:
                case 722240542:
                    i78 = i78;
                    c20905 = c209012;
                    i4 = pixel2;
                    i5 = pixel4;
                    i6 = iM7976;
                    i7 = i98;
                    i74 = i74;
                    i8 = i75;
                    i9 = i87;
                    i10 = pixel3;
                    c20906 = c209013;
                    drawable2 = drawable2;
                    i100 = i100;
                    i11 = i82;
                    i12 = i95;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    Bitmap.Config config4 = Bitmap.Config.ARGB_8888;
                    i13 = intrinsicWidth;
                    i14 = intrinsicHeight;
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i13, i14, config4);
                    config = config4;
                    drawable2.draw(new Canvas(bitmapCreateBitmap3));
                    int iM22612 = C8420.m22612(bitmapCreateBitmap3);
                    bitmapCreateBitmap3.recycle();
                    if (C3448.f11240 >= 0) {
                        i101 = iM22612;
                        int iM27619 = C0619.m2761("ۖ᩸") ^ i71;
                        int i1313 = i13;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i26 = i78;
                        i73 = iM27619 ^ (-955182201);
                        i72 = ((iM27619 ^ i70) * 29851) ^ 1604082038;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i1313;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        int iM27620 = C0619.m2761("ᩴ᩵") ^ i70;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i101 = iM22612;
                        i72 = ((iM27620 ^ i71) * (-6961)) ^ 218278121;
                        i73 = iM27620 ^ 1069124932;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i13;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                    }
                    break;
                case -555270424:
                case -137620745:
                    iM12189 = 0;
                    iM2761 = (C0619.m2761("᩹᩻") ^ i70) * (-91);
                    i27 = ((iM2761 ^ i71) * (-26485)) ^ 2044873171;
                    i28 = 1878991256;
                    int i1122 = iM2761 ^ i28;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    i26 = i78;
                    i73 = i1122;
                    i72 = i27;
                    i100 = i100;
                    c209013 = c209013;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -513406916:
                case 161384679:
                    break;
                case -508359918:
                case 1344234686:
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i15 = i78;
                    config2 = config3;
                    c20908 = c209012;
                    i21 = pixel2;
                    i16 = pixel4;
                    i22 = iM7976;
                    i23 = i98;
                    i74 = i74;
                    i24 = i75;
                    i17 = i87;
                    i25 = pixel3;
                    c20907 = c209013;
                    i20 = i100;
                    i18 = i82;
                    i19 = i95;
                    drawable2 = imageView.getDrawable();
                    rect = new Rect(drawable2.getBounds());
                    intrinsicWidth = drawable2.getIntrinsicWidth();
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                    if (RunnableC0334.f1808 <= 0) {
                        iM31611 = (C0619.m2761("۠ܰ") + i70) * (-11);
                        i45 = ((iM31611 ^ i71) * 355) ^ (-520876647);
                        i46 = 46660426;
                    } else {
                        iM31611 = C0773.m3169("᩶ܿ") ^ i71;
                        i45 = ((iM31611 ^ i70) * 29709) ^ 788039113;
                        i46 = 789660203;
                    }
                    int i146 = iM31611 ^ i46;
                    i95 = i19;
                    i82 = i18;
                    i87 = i17;
                    pixel4 = i16;
                    Bitmap bitmap5 = bitmapCreateBitmap;
                    rect4 = rect;
                    i72 = i45;
                    i74 = i74;
                    i78 = i15;
                    i73 = i146;
                    i100 = i20;
                    c209013 = c20907;
                    pixel3 = i25;
                    i75 = i24;
                    i98 = i23;
                    iM7976 = i22;
                    pixel2 = i21;
                    c209012 = c20908;
                    config3 = config2;
                    bitmapCreateBitmap = bitmap5;
                    break;
                case -503691421:
                case 931026415:
                    i78 = i78;
                    C8398.m22563(bitmapCreateBitmap);
                    C20905 c20905M38992 = new C16429(bitmapCreateBitmap).m38992();
                    C3751 c3751M47769 = c20905M38992.m47764(C12700.f40680);
                    if (c3751M47769 != null) {
                        c209013 = c20905M38992;
                        c3751M47766 = c3751M47769;
                        iM2767 = (C0619.m2761("ۜ֨") + i70) * (-67);
                        i66 = ((iM2767 ^ i71) * (-30395)) ^ 100630578;
                        i67 = 1254842882;
                        int i11111 = iM2767 ^ i67;
                        i78 = i78;
                        i73 = i11111;
                        i72 = i66;
                    } else {
                        int iM27621 = (C0619.m2761("᩹۬") ^ i70) * (-41);
                        i65 = ((iM27621 ^ i71) * (-25387)) ^ 549078620;
                        i3 = iM27621 ^ (-350828178);
                        c209013 = c20905M38992;
                        i72 = i65;
                        i78 = i78;
                        i73 = i3;
                    }
                    break;
                case -438455163:
                case 309873711:
                    C1826.m6301();
                    C3033.m9845();
                    break;
                case -426517442:
                case 467309195:
                    i78 = i78;
                    C20905 c209018 = c209013;
                    i100 = i100;
                    i74 = i74;
                    int i147 = i75;
                    int i148 = iM7976;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i98 = i98;
                    i75 = i147;
                    int i149 = i95;
                    iRgb2 = Color.rgb(i149, (i84 * i86) / 4, (i85 * 3) / 4);
                    if (AbstractC3624.f12429 <= 0) {
                        pixel = i87;
                        pixel2 = pixel2;
                        iM7976 = i148;
                        i = i82;
                        pixel3 = pixel3;
                        i2 = i149;
                        c209013 = c209018;
                        int iM31620 = (i71 - C0773.m3169("ܰۛ")) * (-107);
                        int i150 = ((iM31620 ^ i70) * 73) ^ 892510543;
                        i35 = iM31620 ^ 668801642;
                        i95 = i2;
                        i82 = i;
                        i87 = pixel;
                        i72 = i150;
                        i26 = i78;
                        i73 = i35;
                        i100 = i100;
                        c209013 = c209013;
                        pixel3 = pixel3;
                        i75 = i75;
                        i98 = i98;
                        iM7976 = iM7976;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        int iM27622 = (C0619.m2761("ܰ۟") ^ i71) * 41;
                        i95 = i149;
                        i100 = i100;
                        c209013 = c209018;
                        i73 = iM27622 ^ 289071829;
                        i72 = ((iM27622 ^ i70) * (-5917)) ^ (-993153000);
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        iM7976 = i148;
                        i75 = i75;
                        i98 = i98;
                    }
                    break;
                case -398067849:
                case 779700364:
                    c209010 = c209013;
                    iM12188 = 0;
                    iM2765 = C0773.m3169("ۡ᩵") ^ i71;
                    i49 = ((iM2765 ^ i70) * 26435) ^ (-1369671089);
                    i50 = 845490174;
                    int i1013 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i1014 = i78;
                    i73 = i1013;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i1014;
                    int i1015 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i1015;
                    break;
                case -362719490:
                case 471188286:
                    i78 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    canvas.drawColor(855638016);
                    iM2762 = C0773.m3169("ܿ᩺") ^ i71;
                    i36 = ((iM2762 ^ i70) * 20125) ^ (-1565426859);
                    i37 = -1041704997;
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -294906595:
                case 14326592:
                    fArr[c] = f + f2;
                    iM2767 = (i70 - C0773.m3169("ۢۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i66 = ((iM2767 ^ i71) * (-17803)) ^ 1041307632;
                    i67 = 1287765412;
                    int i11112 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i11112;
                    i72 = i66;
                    break;
                case -212817546:
                case 1877509437:
                    i38 = 520093696;
                    i92 = i91;
                    iM3169 = (C0773.m3169("ᩳ᩵") + i70) * (-81);
                    i39 = i38;
                    i72 = ((iM3169 ^ i71) * (-25169)) ^ 1918673481;
                    i40 = 1087969619;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i39;
                    i73 = iM3169 ^ i40;
                    i74 = i74;
                    i78 = i26;
                    break;
                case -208563132:
                case 147977115:
                    c209010 = c209013;
                    iM12187 = 0;
                    iM2765 = (C0619.m2761("ܳ᩺") + i70) * 47;
                    i49 = ((iM2765 ^ i71) * (-20197)) ^ 1933837857;
                    i50 = 577518248;
                    int i1016 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i1017 = i78;
                    i73 = i1016;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i1017;
                    int i1018 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i1018;
                    break;
                case -151050517:
                case 1622600335:
                    C2702.m8876();
                    if (!C2878.f9462) {
                        i78 = i78;
                        c209013 = c209013;
                        i98 = i98;
                        i100 = i100;
                        i74 = i74;
                        i75 = i75;
                        drawable2 = drawable2;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM31612 = C0619.m2761("۟ܽ") ^ i70;
                        i61 = ((iM31612 ^ i71) * (-17675)) ^ 1669748296;
                        i62 = -317217186;
                        int i11113 = iM31612 ^ i62;
                        i98 = i98;
                        i72 = i61;
                        i75 = i75;
                        i100 = i100;
                        c209013 = c209013;
                        rect3 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = i11113;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect3;
                    } else {
                        iM2768 = (C0773.m3169("۠ۡ") + i71) * 119;
                        i66 = ((iM2768 ^ i70) * 29467) ^ (-1715422123);
                        i69 = 252936798;
                        i73 = iM2768 ^ i69;
                        i72 = i66;
                    }
                    break;
                case -147653752:
                case 2139010216:
                    i78 = i78;
                    fArr[1] = Math.min(1.0f, fArr[1] * 1.2f);
                    button.getBackground().setColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN);
                    iM2767 = (C0619.m2761("۬ۡ") + i71) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i66 = ((iM2767 ^ i70) * (-28231)) ^ 1907806178;
                    i67 = 1236744331;
                    int i11114 = iM2767 ^ i67;
                    i78 = i78;
                    i73 = i11114;
                    i72 = i66;
                    break;
                case 182673284:
                case 311362827:
                    i78 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    if (z2) {
                        iM2762 = (i70 - C0773.m3169("ۘ֫")) * (-101);
                        i36 = ((iM2762 ^ i71) * (-29111)) ^ (-1641260301);
                        i37 = 1540507119;
                    } else {
                        iM2762 = C0619.m2761("ܰᩴ") ^ i71;
                        i36 = ((iM2762 ^ i70) * (-25471)) ^ (-391585659);
                        i37 = -145838706;
                    }
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case 240171441:
                case 2117736217:
                    c209010 = c209013;
                    iM12187 = c3751M47764.m12187();
                    iM2765 = (C0619.m2761("ܳ᩺") + i70) * 47;
                    i49 = ((iM2765 ^ i71) * (-20197)) ^ 1933837857;
                    i50 = 577518248;
                    int i1019 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i10110 = i78;
                    i73 = i1019;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i10110;
                    int i10111 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i10111;
                    break;
                case 269598874:
                case 606153238:
                    canvas.drawColor(Color.argb(i76, i80, i80, i80));
                    i100 = i100;
                    i74 = i74;
                    iM2762 = C0619.m2761("ᩴۗ") ^ i71;
                    i36 = ((iM2762 ^ i70) * (-5083)) ^ (-144102726);
                    i37 = -1238501173;
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case 332652616:
                case 1176225428:
                    i78 = i78;
                    c3751M47768 = c209013.m47766();
                    c209013 = c209013;
                    iM31610 = C0619.m2761("ۨۢ") ^ i70;
                    i43 = ((iM31610 ^ i71) * 28851) ^ 1187875427;
                    i44 = 1704454224;
                    int i1123 = iM31610 ^ i44;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i1123;
                    i72 = i43;
                    i78 = i26;
                    break;
                case 343138422:
                case 1120897158:
                    z2 = false;
                    iM31613 = C0773.m3169("ۤ᩸") ^ i71;
                    i63 = ((iM31613 ^ i70) * (-20921)) ^ 555964457;
                    i64 = -1373266884;
                    int i1314 = iM31613 ^ i64;
                    i98 = i98;
                    i72 = i63;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i1314;
                    i100 = i100;
                    c209013 = c209013;
                    break;
                case 371366643:
                case 848247039:
                    i15 = i78;
                    i16 = pixel4;
                    i74 = i74;
                    i17 = i87;
                    drawable2 = drawable2;
                    i18 = i82;
                    i19 = i95;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    C20905 c209019 = c209013;
                    i20 = i100;
                    C20905 c209020 = c209012;
                    i21 = pixel2;
                    i22 = iM7976;
                    i23 = i98;
                    i24 = i75;
                    i25 = pixel3;
                    c20907 = c209019;
                    config2 = config3;
                    bitmapCreateBitmap2 = Bitmap.createBitmap(100, 100, config2);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    c20908 = c209020;
                    drawable2.setBounds(-16, -16, 116, 116);
                    drawable2.draw(canvas);
                    if (C1542.f5343 > 0) {
                        int iM27623 = (i70 - C0619.m2761("ۜۗ")) * (-39);
                        i95 = i19;
                        i82 = i18;
                        i87 = i17;
                        pixel4 = i16;
                        i26 = i15;
                        i73 = iM27623 ^ (-109424133);
                        i72 = ((iM27623 ^ i71) * (-6185)) ^ 790196478;
                        i100 = i20;
                        c209013 = c20907;
                        pixel3 = i25;
                        i75 = i24;
                        i98 = i23;
                        iM7976 = i22;
                        pixel2 = i21;
                        c209012 = c20908;
                        config3 = config2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    } else {
                        rect = rect4;
                        drawable2 = drawable2;
                        iM31611 = (C0619.m2761("۠ܰ") + i70) * (-11);
                        i45 = ((iM31611 ^ i71) * 355) ^ (-520876647);
                        i46 = 46660426;
                        int i1410 = iM31611 ^ i46;
                        i95 = i19;
                        i82 = i18;
                        i87 = i17;
                        pixel4 = i16;
                        Bitmap bitmap6 = bitmapCreateBitmap;
                        rect4 = rect;
                        i72 = i45;
                        i74 = i74;
                        i78 = i15;
                        i73 = i1410;
                        i100 = i20;
                        c209013 = c20907;
                        pixel3 = i25;
                        i75 = i24;
                        i98 = i23;
                        iM7976 = i22;
                        pixel2 = i21;
                        c209012 = c20908;
                        config3 = config2;
                        bitmapCreateBitmap = bitmap6;
                    }
                    break;
                case 445313865:
                case 659921023:
                    z = true;
                    iM31612 = (C0773.m3169("ۨܿ") + i71) * (-79);
                    i61 = ((iM31612 ^ i70) * (-9919)) ^ (-1924723380);
                    i62 = 497192291;
                    int i11115 = iM31612 ^ i62;
                    i98 = i98;
                    i72 = i61;
                    i75 = i75;
                    i100 = i100;
                    c209013 = c209013;
                    rect3 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i78;
                    i73 = i11115;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect3;
                    break;
                case 588356523:
                case 883771508:
                    C1519.m5403();
                    if (RunnableC0334.f1808 <= 0) {
                        i78 = i78;
                        c209013 = c209013;
                        i98 = i98;
                        i100 = i100;
                        i74 = i74;
                        i75 = i75;
                        drawable2 = drawable2;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM31612 = (C0619.m2761("ۡۨ") + i71) * (-41);
                        i61 = ((iM31612 ^ i70) * 11897) ^ (-1405540498);
                        i62 = -641647770;
                        int i11116 = iM31612 ^ i62;
                        i98 = i98;
                        i72 = i61;
                        i75 = i75;
                        i100 = i100;
                        c209013 = c209013;
                        rect3 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = i11116;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect3;
                    } else {
                        i78 = i78;
                        i5 = pixel4;
                        i74 = i74;
                        i9 = i87;
                        drawable2 = drawable2;
                        i11 = i82;
                        i12 = i95;
                        rect4 = rect4;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i14 = intrinsicHeight;
                        C20905 c2090110 = c209013;
                        i100 = i100;
                        i13 = intrinsicWidth;
                        config = config3;
                        c20905 = c209012;
                        i4 = pixel2;
                        i6 = iM7976;
                        i7 = i98;
                        i8 = i75;
                        i10 = pixel3;
                        c20906 = c2090110;
                        int iM276110 = C0619.m2761("ۖ᩸") ^ i71;
                        int i1315 = i13;
                        i95 = i12;
                        i82 = i11;
                        i87 = i9;
                        pixel4 = i5;
                        i26 = i78;
                        i73 = iM276110 ^ (-955182201);
                        i72 = ((iM276110 ^ i70) * 29851) ^ 1604082038;
                        i100 = i100;
                        c209013 = c20906;
                        pixel3 = i10;
                        i75 = i8;
                        i98 = i7;
                        iM7976 = i6;
                        pixel2 = i4;
                        c209012 = c20905;
                        config3 = config;
                        intrinsicWidth = i1315;
                        intrinsicHeight = i14;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
                case 914044406:
                case 1783426179:
                    i78 = i78;
                    pixel4 = pixel4;
                    i74 = i74;
                    i87 = i87;
                    drawable2 = drawable2;
                    i82 = i82;
                    i95 = i95;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i151 = pixel2;
                    iM7976 = iM7976;
                    i98 = i98;
                    i75 = i75;
                    pixel3 = pixel3;
                    c209010 = c209013;
                    i100 = i100;
                    c209012 = c209012;
                    c3751M47765 = c209012.m47764(C12700.f40681);
                    if (c3751M47765 != null) {
                        iM2765 = (C0773.m3169("۠ۢ") ^ i71) * 109;
                        pixel2 = i151;
                        i49 = ((iM2765 ^ i70) * (-2495)) ^ 2063911607;
                        i50 = 496312671;
                    } else {
                        pixel2 = i151;
                        iM2765 = (i70 - C0619.m2761("۠ۙ")) * 35;
                        i49 = ((iM2765 ^ i71) * 5651) ^ 1747068270;
                        i50 = 1901142463;
                    }
                    int i10112 = iM2765 ^ i50;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    int i10113 = i78;
                    i73 = i10112;
                    i72 = i49;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i10113;
                    int i10114 = pixel2;
                    c209012 = c209012;
                    i100 = i100;
                    c209013 = c209010;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = i10114;
                    break;
                case 920543739:
                case 1544340490:
                    i78 = i78;
                    c209013 = c209013;
                    i100 = i100;
                    i74 = i74;
                    if (z2) {
                        iM2762 = C0619.m2761("ܺ۬") ^ i70;
                        i36 = ((iM2762 ^ i71) * (-17107)) ^ (-1693874186);
                        i37 = 334774713;
                    } else {
                        iM2762 = (i71 - C0619.m2761("᩹ܰ")) * 85;
                        i36 = ((iM2762 ^ i70) * (-1061)) ^ 1802555163;
                        i37 = -1011939065;
                    }
                    i42 = iM2762 ^ i37;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i42;
                    i72 = i36;
                    i74 = i74;
                    i78 = i26;
                    break;
                case 980221565:
                case 2085699219:
                    i74 = i74;
                    c209013 = c209013;
                    i100 = i100;
                    i38 = 687865855;
                    i92 = iRgb3;
                    iM3169 = (C0773.m3169("ᩳ᩵") + i70) * (-81);
                    i39 = i38;
                    i72 = ((iM3169 ^ i71) * (-25169)) ^ 1918673481;
                    i40 = 1087969619;
                    i100 = i100;
                    c209013 = c209013;
                    i26 = i39;
                    i73 = iM3169 ^ i40;
                    i74 = i74;
                    i78 = i26;
                    break;
                case 1174006768:
                case 1664686349:
                    bitmapCreateBitmap.setPixel(i74, i100, bitmapCreateBitmap2.getPixel(width + i74, i93 + i100));
                    i100++;
                    iM31610 = (i71 - C0619.m2761("ۚ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i43 = ((iM31610 ^ i70) * (-9805)) ^ (-2092079656);
                    i44 = -339147470;
                    int i1124 = iM31610 ^ i44;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i1124;
                    i72 = i43;
                    i78 = i26;
                    break;
                case 1319595215:
                case 1450151959:
                    i100 = 0;
                    iM31610 = (i71 - C0619.m2761("ۚ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i43 = ((iM31610 ^ i70) * (-9805)) ^ (-2092079656);
                    i44 = -339147470;
                    int i1125 = iM31610 ^ i44;
                    c209013 = c209013;
                    i26 = i78;
                    i73 = i1125;
                    i72 = i43;
                    i78 = i26;
                    break;
                case 1351715192:
                case 1471666543:
                    int i152 = i78;
                    int i153 = pixel2;
                    int i154 = pixel4;
                    int i155 = iM7976;
                    int i156 = i98;
                    int i157 = i74;
                    int i158 = i75;
                    int i159 = i87;
                    int i160 = pixel3;
                    C20905 c209021 = c209013;
                    Drawable drawable4 = drawable2;
                    int i161 = i100;
                    int i162 = i82;
                    int i163 = i95;
                    Rect rect9 = rect4;
                    Bitmap bitmap7 = bitmapCreateBitmap;
                    C20905 c20905M38993 = new C16429(bitmapCreateBitmap2).m38992();
                    iM47768 = c20905M38993.m47767();
                    c3751M47764 = c20905M38993.m47764(C12700.f40679);
                    i99 = 0;
                    if (c3751M47764 != null) {
                        iM2764 = (C0619.m2761("ܽܿ") ^ i71) * (-103);
                        i47 = ((iM2764 ^ i70) * (-2447)) ^ 1954577904;
                        i48 = 1504953439;
                    } else {
                        iM2764 = (i71 - C0619.m2761("ᩴ۠")) * 33;
                        i47 = ((iM2764 ^ i70) * (-473)) ^ (-1877819947);
                        i48 = 1946519700;
                    }
                    int i164 = iM2764 ^ i48;
                    i95 = i163;
                    i82 = i162;
                    i87 = i159;
                    pixel4 = i154;
                    c209012 = c20905M38993;
                    i72 = i47;
                    bitmapCreateBitmap = bitmap7;
                    rect4 = rect9;
                    drawable2 = drawable4;
                    i74 = i157;
                    i78 = i152;
                    i73 = i164;
                    i100 = i161;
                    c209013 = c209021;
                    pixel3 = i160;
                    i75 = i158;
                    i98 = i156;
                    iM7976 = i155;
                    pixel2 = i153;
                    break;
                case 1512048508:
                case 1625560679:
                    i78 = i78;
                    pixel4 = pixel4;
                    i74 = i74;
                    i87 = i87;
                    drawable2 = drawable2;
                    i82 = i82;
                    i95 = i95;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    pixel2 = pixel2;
                    iM7976 = iM7976;
                    i98 = i98;
                    i75 = i75;
                    pixel3 = pixel3;
                    c209013 = c209013;
                    i100 = i100;
                    i80 = 255;
                    if (iM47768 != 0) {
                        iM2761 = C0619.m2761("ۙᩳ") ^ i71;
                        i27 = ((iM2761 ^ i70) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) ^ (-1847723198);
                        i28 = -1118077978;
                    } else {
                        iM2761 = C0619.m2761("᩸ۗ") ^ i70;
                        i27 = ((iM2761 ^ i71) * 2967) ^ (-110925222);
                        i28 = 331288350;
                    }
                    int i1126 = iM2761 ^ i28;
                    i95 = i95;
                    i82 = i82;
                    i87 = i87;
                    pixel4 = pixel4;
                    i26 = i78;
                    i73 = i1126;
                    i72 = i27;
                    i100 = i100;
                    c209013 = c209013;
                    pixel3 = pixel3;
                    i75 = i75;
                    i98 = i98;
                    iM7976 = iM7976;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect4 = rect4;
                    drawable2 = drawable2;
                    i74 = i74;
                    i78 = i26;
                    break;
                default:
                    i78 = i78;
                    i = i82;
                    i2 = i95;
                    iM7976 = iM7976;
                    c209013 = c209013;
                    i98 = i98;
                    i100 = i100;
                    i74 = i74;
                    i75 = i75;
                    drawable2 = drawable2;
                    rect4 = rect4;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    pixel = bitmapCreateBitmap2.getPixel(i99, i99);
                    pixel2 = bitmapCreateBitmap2.getPixel(i99, 99);
                    pixel3 = bitmapCreateBitmap2.getPixel(50, 50);
                    pixel4 = bitmapCreateBitmap2.getPixel(99, i99);
                    if (C0773.m3161() == 0) {
                        int iM31621 = C0773.m3169("ܳۤ") ^ i71;
                        int i165 = ((iM31621 ^ i70) * (-29733)) ^ 1970608447;
                        i3 = iM31621 ^ (-678745874);
                        i95 = i2;
                        i82 = i;
                        i94 = 99;
                        i87 = pixel;
                        i72 = i165;
                        i100 = i100;
                        c209013 = c209013;
                        pixel3 = pixel3;
                        i75 = i75;
                        i98 = i98;
                        iM7976 = iM7976;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i78;
                        i73 = i3;
                    } else {
                        i94 = 99;
                        int iM31622 = (i71 - C0773.m3169("ܰۛ")) * (-107);
                        int i1510 = ((iM31622 ^ i70) * 73) ^ 892510543;
                        i35 = iM31622 ^ 668801642;
                        i95 = i2;
                        i82 = i;
                        i87 = pixel;
                        i72 = i1510;
                        i26 = i78;
                        i73 = i35;
                        i100 = i100;
                        c209013 = c209013;
                        pixel3 = pixel3;
                        i75 = i75;
                        i98 = i98;
                        iM7976 = iM7976;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect4 = rect4;
                        drawable2 = drawable2;
                        i74 = i74;
                        i78 = i26;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x029f A[PHI: r21
      0x029f: PHI (r21v11 l.᩷ۨᩴ) = (r21v9 l.᩷ۨᩴ), (r21v12 l.᩷ۨᩴ) binds: [B:63:0x0285, B:53:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x034e A[PHI: r5 r10 r11 r12 r17 r21 r22
      0x034e: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r21v16 l.᩷ۨᩴ) = (r21v3 l.᩷ۨᩴ), (r21v4 l.᩷ۨᩴ), (r21v17 l.᩷ۨᩴ) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:78:0x034c, B:74:0x0325, B:36:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0388 A[PHI: r7 r8 r15 r16 r21
      0x0388: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:82:0x0386, B:32:0x010b, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:82:0x0386, B:32:0x010b, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:82:0x0386, B:32:0x010b, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:82:0x0386, B:32:0x010b, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r21v24 l.᩷ۨᩴ) = (r21v2 l.᩷ۨᩴ), (r21v18 l.᩷ۨᩴ), (r21v25 l.᩷ۨᩴ) binds: [B:82:0x0386, B:32:0x010b, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (l.C0862.f3233 != 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47539(l.AbstractActivityC17204 r25, l.C11192 r26, java.lang.Runnable r27) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC20779.m47539(l.ܽ֡֫, l.ۤ᩺֫, java.lang.Runnable):void");
    }
}
