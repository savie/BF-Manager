package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC24449 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f79374 = 0;

    /* JADX INFO: renamed from: ܿ֡ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f79375 = {2060, -16023, -11929, -4433, 15240, -10772, -4515, 14872, -180, -8867, 4595, 18556, -28381, -17011, 7734, -3872, 1530, -7207, -7861, 6090, 4008, 5889, 17547, -20116, -30833, -32507, 23981, -24334, 6679, 3032, 3061, 3071, 3048, 3061, 3059, 3058, 3069, 3054, 3045, 3025, 3069, 3058, 3069, 3067, 3065, 3054};

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public List f79376 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C6549 f79377;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 1176002848;
        int i6 = C2419.f7754;
        int i7 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("ۤ᩶") ^ i7;
        int i8 = ((iM3169 ^ i6) * (-17557)) ^ 1454404875;
        int i9 = 845226600;
        while (true) {
            i5 = ((((i5 ^ i6) * (-25295)) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -1941704025:
                case 1683415790:
                    i3 = 2972;
                    iM3169 = C0619.m2761("ۖܶ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-14059)) ^ (-1659484251);
                    i9 = 328551238;
                    break;
                case -1690339579:
                case 1744950812:
                    if ((s * s2) - i2 > 0) {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-1987)) ^ (-1877259152);
                        i9 = -713772426;
                    } else {
                        iM3169 = C0619.m2761("ܿ֡") ^ i7;
                        i8 = ((iM3169 ^ i6) * 20255) ^ (-783744393);
                        i9 = 800796518;
                    }
                    break;
                case -1585133452:
                case 1379558734:
                    C2419.m8174();
                    C0619.m2763();
                    return null;
                case -1403734137:
                case -377610570:
                    C13473.m33144();
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۘۜ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 12903) ^ 702504133;
                        i9 = 552633992;
                    } else {
                        iM3169 = (C0619.m2761("۬ۤ") + i7) * 53;
                        i8 = ((iM3169 ^ i6) * (-19255)) ^ 2059071770;
                        i9 = 432218846;
                    }
                    break;
                case -1217021269:
                case 2031385166:
                    s = sArr[c];
                    i = s * s;
                    if (C2485.f7950 != 0) {
                        iM3169 = (i7 - C0619.m2761("ۚۛ")) * 77;
                        i8 = ((iM3169 ^ i6) * 885) ^ 141079471;
                        i9 = -629568570;
                    } else {
                        iM3169 = C0773.m3169("᩵᩵") ^ i7;
                        i8 = ((iM3169 ^ i6) * 13337) ^ (-1298321847);
                        i9 = -1182033687;
                    }
                    break;
                case -1165192290:
                case -664419456:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i6 - C0773.m3169("۟᩵")) * 91;
                        i8 = ((iM3169 ^ i7) * 14705) ^ (-106396857);
                        i9 = 1799533482;
                    } else {
                        iM3169 = (C0619.m2761("۬ۤ") + i7) * 53;
                        i8 = ((iM3169 ^ i6) * (-19255)) ^ 2059071770;
                        i9 = 432218846;
                    }
                    break;
                case -1160829718:
                case -306972041:
                    C2310.m7813();
                    C2354.m7983();
                    iM3169 = (C0619.m2761("۬ۤ") + i7) * 53;
                    i8 = ((iM3169 ^ i6) * (-19255)) ^ 2059071770;
                    i9 = 432218846;
                    break;
                case -1002967503:
                case 1020675744:
                    return C0269.m1785(sArr2, i4, 17, i3);
                case -966574951:
                case 1479452835:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i6) * (-73);
                        i8 = ((iM3169 ^ i7) * 25975) ^ (-1151403381);
                        i9 = -1400562937;
                    } else {
                        iM3169 = C0619.m2761("۟ۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-21769)) ^ 107242431;
                        i9 = 1906154418;
                    }
                    break;
                case -856197030:
                case 142962413:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۘۜ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 12903) ^ 702504133;
                        i9 = 552633992;
                    } else {
                        iM3169 = C0773.m3169("ۨۜ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-26439)) ^ (-259970597);
                        i9 = 212340836;
                    }
                    break;
                case -228196989:
                case 260459050:
                    i2 = 394379881 + i;
                    if (C0619.f2439) {
                        iM3169 = (i6 - C0773.m3169("۟᩵")) * 91;
                        i8 = ((iM3169 ^ i7) * 14705) ^ (-106396857);
                        i9 = 1799533482;
                    } else {
                        iM3169 = C0619.m2761("ۜۢ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 3519) ^ (-2074180324);
                        i9 = -1705155980;
                    }
                    break;
                case -102071835:
                case 311804449:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i6) * (-73);
                        i8 = ((iM3169 ^ i7) * 25975) ^ (-1151403381);
                        i9 = -1400562937;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۨܰ")) * (-59);
                        i8 = ((iM3169 ^ i6) * 22693) ^ 1567524602;
                        i9 = -348847634;
                    }
                    break;
                case 66889365:
                case 1195763546:
                    c = 28;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i6 - C0773.m3169("۟᩵")) * 91;
                        i8 = ((iM3169 ^ i7) * 14705) ^ (-106396857);
                        i9 = 1799533482;
                    } else {
                        iM3169 = C0773.m3169("۟۟") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-20427)) ^ (-2129951035);
                        i9 = -245145564;
                    }
                    break;
                case 103490288:
                case 1560512899:
                    i3 = 62484;
                    iM3169 = C0619.m2761("ۖܶ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-14059)) ^ (-1659484251);
                    i9 = 328551238;
                    break;
                case 208515827:
                case 1268772119:
                    C1783.m6232();
                    if (!C3077.f9998) {
                        iM3169 = (C0619.m2761("۬ۤ") + i7) * 53;
                        i8 = ((iM3169 ^ i6) * (-19255)) ^ 2059071770;
                        i9 = 432218846;
                    } else {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i6) * (-73);
                        i8 = ((iM3169 ^ i7) * 25975) ^ (-1151403381);
                        i9 = -1400562937;
                    }
                    break;
                case 392981245:
                case 2039282096:
                    sArr = f79375;
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۘۜ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 12903) ^ 702504133;
                        i9 = 552633992;
                    } else {
                        iM3169 = (C0773.m3169("ܰ۟") ^ i7) * 7;
                        i8 = ((iM3169 ^ i6) * 21957) ^ (-1269843433);
                        i9 = -706504614;
                    }
                    break;
                case 482791582:
                case 1807542756:
                    if (C0773.m3161() != 0) {
                        iM3169 = (C0773.m3169("ۘۜ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 12903) ^ 702504133;
                        i9 = 552633992;
                    } else {
                        iM3169 = C0773.m3169("ۧۖ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 18673) ^ 1207403048;
                        i9 = 1149265183;
                    }
                    break;
                case 778342633:
                case 1484307372:
                    sArr2 = f79375;
                    i4 = 29;
                    if (C2878.f9462) {
                        iM3169 = (i6 - C0773.m3169("۟᩵")) * 91;
                        i8 = ((iM3169 ^ i7) * 14705) ^ (-106396857);
                        i9 = 1799533482;
                    } else {
                        iM3169 = (C0619.m2761("ۙ۫") + i6) * 85;
                        i8 = ((iM3169 ^ i7) * 625) ^ (-398291241);
                        i9 = 1826245836;
                    }
                    break;
                default:
                    s2 = 39718;
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("ۘۜ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 12903) ^ 702504133;
                        i9 = 552633992;
                    } else {
                        iM3169 = C0773.m3169("ۚ֫") ^ i6;
                        i8 = ((iM3169 ^ i7) * 17063) ^ (-1456158770);
                        i9 = 323513502;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b A[PHI: r1 r8 r9 r10 r13 r14
      0x018b: PHI (r1v3 android.view.MenuInflater) = (r1v2 android.view.MenuInflater), (r1v2 android.view.MenuInflater), (r1v4 android.view.MenuInflater) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:48:0x0189, B:44:0x016d, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e0 A[PHI: r2 r5 r11
      0x01e0: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:56:0x01de, B:40:0x014b, B:17:0x0077, B:14:0x005d, B:87:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:56:0x01de, B:40:0x014b, B:17:0x0077, B:14:0x005d, B:87:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:56:0x01de, B:40:0x014b, B:17:0x0077, B:14:0x005d, B:87:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0211 A[PHI: r3 r6 r7 r19
      0x0211: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:60:0x020f, B:52:0x01c1, B:25:0x00b3, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:60:0x020f, B:52:0x01c1, B:25:0x00b3, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:60:0x020f, B:52:0x01c1, B:25:0x00b3, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:60:0x020f, B:52:0x01c1, B:25:0x00b3, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0240  */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2419.f7754;
        int i4 = C20932.f66974;
        int iM31610 = C0773.m3169("ۧۙ") ^ i3;
        int i5 = ((iM31610 ^ i4) * 20509) ^ (-1987934932);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-1409629706);
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 947645752;
        String strM7761 = null;
        int iM2761 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-9969)) >> 31));
            switch (i13) {
                case -2139169559:
                case -224278131:
                    sArr = f79375;
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ܰۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 26895) ^ 1222485046;
                        i2 = 1591730599;
                    } else {
                        iM3169 = C0773.m3169("ܳ֫") ^ i3;
                        i = ((iM3169 ^ i4) * 24529) ^ (-1154845395);
                        i2 = -1586139874;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2012015733:
                case 596499630:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-6635)) ^ (-1372078964);
                        i2 = -349458338;
                    } else {
                        iM3169 = (C0773.m3169("ܿ᩸") ^ i4) * 63;
                        i = ((iM3169 ^ i3) * 2773) ^ 708901218;
                        i2 = 138309517;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1974729891:
                case 1106021980:
                    i7 = s + s2;
                    if (C2878.f9462) {
                        iM3169 = (i3 - C0619.m2761("֡ۤ")) * (-75);
                        i = ((iM3169 ^ i4) * (-8199)) ^ (-1525572618);
                        i2 = 296957072;
                    } else {
                        iM3169 = (C0619.m2761("ۛۚ") + i4) * (-99);
                        i = ((iM3169 ^ i3) * (-19069)) ^ (-1652209704);
                        i2 = 1956397705;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1970808608:
                case 1569268315:
                    menuInflater.inflate(iM2761, menu);
                    return true;
                case -1969364909:
                case 234198665:
                    i11 = 50362;
                    iM3169 = (i3 - C0619.m2761("۬ܰ")) * (-53);
                    i = ((iM3169 ^ i4) * 2651) ^ (-1554830875);
                    i2 = 214876899;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1956365185:
                case 1667017449:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12773)) ^ 440288104;
                        i2 = -1637842382;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 3197) ^ (-1437986426);
                        i2 = 1423416879;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1953568621:
                case 346833923:
                    if (C3779.m12264()) {
                        iM3169 = C0773.m3169("ܰۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 26895) ^ 1222485046;
                        i2 = 1591730599;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 3197) ^ (-1437986426);
                        i2 = 1423416879;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1896921409:
                case -1170593889:
                    s = sArr[c];
                    s2 = 3526;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ܰۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 26895) ^ 1222485046;
                        i2 = 1591730599;
                    } else {
                        iM3169 = C0619.m2761("۫ܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 24107) ^ (-2046580337);
                        i2 = 1797299068;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1865653513:
                case 2115745896:
                    C11235.m28309();
                    iM3169 = C0619.m2761("ܿۚ") ^ i3;
                    i = ((iM3169 ^ i4) * (-12773)) ^ 440288104;
                    i2 = -1637842382;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1579307669:
                case 1947454597:
                    if (C4238.f15451 < 0) {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 3197) ^ (-1437986426);
                        i2 = 1423416879;
                    } else {
                        iM3169 = C0619.m2761("ۚۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-6635)) ^ (-1372078964);
                        i2 = -349458338;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1280566559:
                case 293213945:
                    menuInflater = getMenuInflater();
                    sArr2 = f79375;
                    i12 = 11;
                    if (C2702.m8876()) {
                        iM3169 = C0773.m3169("ۘܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5751)) ^ (-2065672731);
                        i2 = 654306902;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֡ۤ")) * (-75);
                        i = ((iM3169 ^ i4) * (-8199)) ^ (-1525572618);
                        i2 = 296957072;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1102070551:
                case 204733878:
                    strM7761 = C2288.m7761(sArr2, i12, 3, i11);
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ܰۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 26895) ^ 1222485046;
                        i2 = 1591730599;
                    } else {
                        iM3169 = C0773.m3169("ۜᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30647)) ^ 1603522143;
                        i2 = -1207935995;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -324451271:
                case 1280660808:
                    i10 = 12432676;
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12773)) ^ 440288104;
                        i2 = -1637842382;
                    } else {
                        iM3169 = (C0773.m3169("ܳۘ") + i4) * (-7);
                        i = ((iM3169 ^ i3) * (-17457)) ^ 1173712473;
                        i2 = -315119996;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -28884022:
                case 758904898:
                    i11 = 1946;
                    iM3169 = (i3 - C0619.m2761("۬ܰ")) * (-53);
                    i = ((iM3169 ^ i4) * 2651) ^ (-1554830875);
                    i2 = 214876899;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 115727453:
                case 604690591:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i3 - C0619.m2761("֡ۤ")) * (-75);
                        i = ((iM3169 ^ i4) * (-8199)) ^ (-1525572618);
                        i2 = 296957072;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-8753)) ^ 1253114056;
                        i2 = -1004381126;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 176670950:
                case 688015436:
                    c = '\n';
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12773)) ^ 440288104;
                        i2 = -1637842382;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩺") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * 25753) ^ (-1746171707);
                        i2 = 1875254327;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 813134488:
                case 1012785183:
                    iM2761 = C0619.m2761(strM7761) ^ 2098481677;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12773)) ^ 440288104;
                        i2 = -1637842382;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = (C0773.m3169("ۜ۫") ^ i4) * (-9);
                        i5 = ((iM31611 ^ i3) * (-25477)) ^ (-507476321);
                        i6 = iM31611 ^ (-195785658);
                    }
                    break;
                case 962043070:
                case 2083316151:
                    int i14 = i9 + i10;
                    if ((i14 + i14) - i8 >= 0) {
                        iM3169 = C0773.m3169("ᩴۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 18233) ^ (-704525687);
                        i2 = -2055115289;
                    } else {
                        iM3169 = C0619.m2761("ۧ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 169) ^ (-1115910926);
                        i2 = -729065558;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    RunnableC3646.m11813();
                    return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (l.C2702.f8586 > 0) goto L18;
     */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC24449.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x022d A[PHI: r7 r9 r11 r23
      0x022d: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:62:0x022b, B:33:0x00f7, B:19:0x0091, B:12:0x006a, B:9:0x0064, B:98:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:62:0x022b, B:33:0x00f7, B:19:0x0091, B:12:0x006a, B:9:0x0064, B:98:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r11v5 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:62:0x022b, B:33:0x00f7, B:19:0x0091, B:12:0x006a, B:9:0x0064, B:98:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r23v6 int) = (r23v4 int), (r23v3 int), (r23v3 int), (r23v3 int), (r23v3 int), (r23v3 int) binds: [B:62:0x022b, B:33:0x00f7, B:19:0x0091, B:12:0x006a, B:9:0x0064, B:98:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0281 A[PHI: r1 r8 r13 r14 r17 r18
      0x0281: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:70:0x027f, B:66:0x0261, B:51:0x01b3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02ad A[PHI: r4 r5 r15 r16
      0x02ad: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:47:0x018d, B:29:0x00d4, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:47:0x018d, B:29:0x00d4, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:47:0x018d, B:29:0x00d4, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v4 short[]) binds: [B:47:0x018d, B:29:0x00d4, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3690.f12684;
        int i4 = C11235.f35427;
        int iM2761 = C0619.m2761("ۢ᩵") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-19771)) ^ 157287515;
        C20719 c20719 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ 2116081670;
        int iM33146 = 0;
        int i7 = 0;
        int iM31610 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = -1538232254;
        int i16 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 19333) >> 31));
            switch (i15) {
                case -2120617681:
                case 1540043506:
                    C1542.m5459();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                        i2 = -181147803;
                    } else {
                        iM3169 = (C0619.m2761("ۖ֨") + i4) * (-15);
                        i = ((iM3169 ^ i3) * (-2763)) ^ (-715752126);
                        i2 = -1220478298;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2012321924:
                case -824401788:
                    c20719 = new C20719(this, this);
                    sArr3 = f79375;
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0619.m2761("ܺۧ") + i3) * (-77);
                        i = ((iM3169 ^ i4) * (-17455)) ^ (-1610519918);
                        i2 = -1089586973;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = C0773.m3169("ܳᩴ") ^ i4;
                        i5 = ((iM31611 ^ i3) * 7381) ^ 458277662;
                        i6 = iM31611 ^ (-1470195824);
                    }
                    break;
                case -1897915050:
                case 448215409:
                    s = sArr[c];
                    i14 = s * 2;
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ۖ֨") + i4) * (-15);
                        i = ((iM3169 ^ i3) * (-2763)) ^ (-715752126);
                        i2 = -1220478298;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠ܺ")) * (-15);
                        i = ((iM3169 ^ i4) * (-17271)) ^ 937560443;
                        i2 = 914364689;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1751305974:
                case 193249932:
                    c20719.m22957(i7);
                    c20719.m22955(true);
                    return true;
                case -1603223351:
                case -1588711462:
                    c20719.m22945(iM31610 ^ i8);
                    c20719.m22918();
                    i7 = 6;
                    if (!C2023.f6737) {
                        iM3169 = C0773.m3169("ۙܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 19667) ^ (-1929973866);
                        i2 = -1452364818;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31612 = C0773.m3169("ܳᩴ") ^ i4;
                        i5 = ((iM31612 ^ i3) * 7381) ^ 458277662;
                        i6 = iM31612 ^ (-1470195824);
                    }
                    break;
                case -1513426616:
                case 698228925:
                    iM33146 = C13473.m33146(menuItem);
                    sArr2 = f79375;
                    i12 = 22;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ۖ֨") + i4) * (-15);
                        i = ((iM3169 ^ i3) * (-2763)) ^ (-715752126);
                        i2 = -1220478298;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܳ") + i3) * (-5);
                        i = ((iM3169 ^ i4) * (-4853)) ^ (-667271253);
                        i2 = -2095872919;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1350445004:
                case -299373483:
                    i9 = 25;
                    i10 = 3;
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                        i2 = -181147803;
                    } else {
                        iM3169 = C0619.m2761("᩸ۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 10121) ^ (-2017573528);
                        i2 = -2030725080;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1207573976:
                case -514937164:
                    iM31610 = C0773.m3169(AbstractC3624.m11769(sArr3, i9, i10, i11));
                    i8 = 2120556393;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("ܿ֨") + i3) * 51;
                        i = ((iM3169 ^ i4) * (-7709)) ^ 1394877376;
                        i2 = -781659047;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۤ") ^ i4) * 89;
                        i = ((iM3169 ^ i3) * (-11711)) ^ (-1643149379);
                        i2 = -1317924972;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1121476845:
                case 325057897:
                    c = 21;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("ۖ֨") + i4) * (-15);
                        i = ((iM3169 ^ i3) * (-2763)) ^ (-715752126);
                        i2 = -1220478298;
                    } else {
                        iM3169 = C0773.m3169("ۨۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-29777)) ^ 528176274;
                        i2 = -2007640374;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1102465200:
                case 1824302147:
                    C2702.m8876();
                    return false;
                case -800868291:
                case 1539660570:
                    i11 = 9802;
                    iM3169 = C0619.m2761("۠ۨ") ^ i4;
                    i = ((iM3169 ^ i3) * (-24073)) ^ (-114162159);
                    i2 = 925376020;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -739064800:
                case -642506244:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                        i2 = -181147803;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 22159) ^ 102203323;
                        i2 = 474566928;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -597839956:
                case 1456623571:
                    i11 = 56970;
                    iM3169 = C0619.m2761("۠ۨ") ^ i4;
                    i = ((iM3169 ^ i3) * (-24073)) ^ (-114162159);
                    i2 = 925376020;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -299871923:
                case 1410789926:
                    int i17 = s + s2;
                    if ((i17 * i17) - i16 >= 0) {
                        iM3169 = (C0773.m3169("ۡۤ") + i3) * (-87);
                        i = ((iM3169 ^ i4) * 14797) ^ (-125776932);
                        i2 = -841238616;
                    } else {
                        iM3169 = C0619.m2761("֨۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-24645)) ^ 2114645751;
                        i2 = 1117863213;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 285982160:
                case 1419677694:
                    return false;
                case 436674961:
                case 582573749:
                    C2354.m7983();
                    if (C13473.f42873 == 0) {
                        int iM31613 = C0773.m3169("ܳᩴ") ^ i4;
                        i5 = ((iM31613 ^ i3) * 7381) ^ 458277662;
                        i6 = iM31613 ^ (-1470195824);
                    } else {
                        iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                        i2 = -181147803;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case 515720060:
                case 1178339626:
                    i13 = 3;
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("ܿ֨") + i3) * 51;
                        i = ((iM3169 ^ i4) * (-7709)) ^ 1394877376;
                        i2 = -781659047;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۡ᩻")) * 47;
                        i = ((iM3169 ^ i3) * 5289) ^ 831818647;
                        i2 = -1547378502;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 640580477:
                case 1419741692:
                    if (iM33146 == (C0619.m2761(C0619.m2756(sArr2, i12, i13, i11)) ^ 2103051258)) {
                        iM3169 = C0619.m2761("ܽۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-15617)) ^ 1706640640;
                        i2 = 1547597036;
                    } else {
                        iM3169 = C0773.m3169("ۚ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-6131)) ^ 1351684111;
                        i2 = 804792289;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 875688066:
                case 985423205:
                    C1826.m6301();
                    iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                    i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                    i2 = -181147803;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1438194766:
                case 2035027383:
                    i16 = i14 + 1;
                    s2 = 1;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۙܰ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * (-15557)) ^ (-1082085756);
                        i2 = -181147803;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * 29153) ^ 1277254673;
                        i2 = 2093126295;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f79375;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ܿ֨") + i3) * 51;
                        i = ((iM3169 ^ i4) * (-7709)) ^ 1394877376;
                        i2 = -781659047;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۫ۧ")) * (-127);
                        i = ((iM3169 ^ i4) * (-20593)) ^ 2114550218;
                        i2 = 2028469527;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54695(ActivityC24449 activityC24449, C18099 c18099) {
        AbstractC22044 abstractC22044M42219 = null;
        int i = 1713457538;
        int i2 = C4282.f15546;
        int i3 = C2375.f7641;
        int iM2761 = (C0619.m2761("ܽۢ") + i3) * 109;
        int i4 = ((iM2761 ^ i2) * 18577) ^ (-738675970);
        int i5 = 313754646;
        while (true) {
            i = ((((i ^ i2) * (-13217)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2107168480:
                case 2055408067:
                    C1826.m6301();
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15561) ^ (-275516528);
                        i5 = -1228664389;
                    } else {
                        iM2761 = C0619.m2761("ܽۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24149) ^ 610193239;
                        i5 = 2092228740;
                    }
                    break;
                case -1934682580:
                case 583353297:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("۬᩶") ^ i3) * 9;
                        i4 = ((iM2761 ^ i2) * 17161) ^ (-1854315310);
                        i5 = 1448529493;
                    } else {
                        iM2761 = C0619.m2761("ܰ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12223)) ^ 343953284;
                        i5 = -1748889849;
                    }
                    break;
                case -1849648215:
                case 565813729:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18019) ^ 1951020631;
                        i5 = -155618167;
                    } else {
                        iM2761 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16685) ^ 1465774677;
                        i5 = 1157323437;
                    }
                    break;
                case -1809047327:
                case -206825434:
                    RunnableC1848.m6360();
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18019) ^ 1951020631;
                        i5 = -155618167;
                    } else {
                        iM2761 = C0619.m2761("ܽۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24149) ^ 610193239;
                        i5 = 2092228740;
                    }
                    break;
                case -1285469865:
                case 2137762490:
                    abstractC22044M42219 = c18099.m42219();
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15561) ^ (-275516528);
                        i5 = -1228664389;
                    } else {
                        iM2761 = C0619.m2761("᩷ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1937)) ^ (-1901104827);
                        i5 = 763905385;
                    }
                    break;
                case -1106596401:
                case -28868813:
                    activityC24449.f79376 = C6912.m19190();
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15561) ^ (-275516528);
                        i5 = -1228664389;
                    } else {
                        iM2761 = C0619.m2761("ۘۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19235) ^ 481659703;
                        i5 = 1799699590;
                    }
                    break;
                case -1041546622:
                case 1300717406:
                    C0269.m1775();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ۢۚ") + i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2869)) ^ 1145828461;
                        i5 = -670820639;
                    } else {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15561) ^ (-275516528);
                        i5 = -1228664389;
                    }
                    break;
                case -956363494:
                case 141202370:
                    RunnableC1848.m6360();
                    C23916.m53419();
                    break;
                case -778818576:
                case 1157458093:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("۬᩶") ^ i3) * 9;
                        i4 = ((iM2761 ^ i2) * 17161) ^ (-1854315310);
                        i5 = 1448529493;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3775) ^ 1590748807;
                        i5 = -450961075;
                    }
                    break;
                case -444412884:
                case 530281455:
                    activityC24449.f79377.notifyDataSetChanged();
                    break;
                case -309758799:
                case 1034946695:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("۬᩶") ^ i3) * 9;
                        i4 = ((iM2761 ^ i2) * 17161) ^ (-1854315310);
                        i5 = 1448529493;
                    } else {
                        iM2761 = (C0619.m2761("ܺۧ") + i3) * (-89);
                        i4 = ((iM2761 ^ i2) * (-2891)) ^ (-422553983);
                        i5 = 1596950451;
                    }
                    break;
                case -67150344:
                case 2023407437:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0773.m3169("ۢۚ") + i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2869)) ^ 1145828461;
                        i5 = -670820639;
                    } else {
                        iM2761 = (C0773.m3169("ۘۛ") ^ i2) * (-47);
                        i4 = ((iM2761 ^ i3) * 2277) ^ (-560555242);
                        i5 = 1690688551;
                    }
                    break;
                case 23174713:
                case 562467539:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15561) ^ (-275516528);
                        i5 = -1228664389;
                    } else {
                        iM2761 = C0773.m3169("ۛ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 557) ^ (-1587296359);
                        i5 = 205844740;
                    }
                    break;
                case 568137591:
                case 1498802771:
                    C17202.m40378(abstractC22044M42219);
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("۬᩶") ^ i3) * 9;
                        i4 = ((iM2761 ^ i2) * 17161) ^ (-1854315310);
                        i5 = 1448529493;
                    } else {
                        iM2761 = (C0619.m2761("ۛۗ") ^ i2) * 87;
                        i4 = ((iM2761 ^ i3) * (-19837)) ^ 1037614046;
                        i5 = -1916769284;
                    }
                    break;
                case 769021061:
                case 1616385463:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18019) ^ 1951020631;
                        i5 = -155618167;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩹") + i2) * (-41);
                        i4 = ((iM2761 ^ i3) * (-24967)) ^ 1691413184;
                        i5 = 479118808;
                    }
                    break;
                default:
                    C2310.m7813();
                    iM2761 = C0619.m2761("ܽۜ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 24149) ^ 610193239;
                    i5 = 2092228740;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        List listM19190 = null;
        int i = 392462318;
        int i2 = C1080.f3865;
        int i3 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("ۜ᩶") ^ i2;
        int i4 = ((iM2761 ^ i3) * 30817) ^ (-494299778);
        int i5 = -1589532799;
        while (true) {
            i = ((((i ^ i3) * (-26837)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1934523973:
                case 2049384051:
                    super.onResume();
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * 8355) ^ (-357359386);
                        i5 = 1101690890;
                    }
                    break;
                case -1835010298:
                case -934046721:
                    C23916.m53419();
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = (i2 - C0619.m2761("ۛ᩵")) * 109;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-1969655873);
                        i5 = 2146264594;
                    } else {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    }
                    break;
                case -1833767663:
                case -417036614:
                    C1080.m4050();
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("᩵ۖ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * (-32375)) ^ (-2034532294);
                        i5 = -885622640;
                    } else {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    }
                    break;
                case -1739496891:
                case 2022148834:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    } else {
                        iM2761 = C0619.m2761("ۤ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21227)) ^ (-1475665912);
                        i5 = 217628654;
                    }
                    break;
                case -1520287193:
                case 1903200751:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    } else {
                        iM2761 = C0619.m2761("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18101)) ^ (-563827076);
                        i5 = 261816359;
                    }
                    break;
                case -1492908555:
                case -721544716:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("᩵ۖ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * (-32375)) ^ (-2034532294);
                        i5 = -885622640;
                    } else {
                        iM2761 = C0773.m3169("ܳ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14909) ^ 586527420;
                        i5 = 1077064012;
                    }
                    break;
                case -1481987324:
                case 937344958:
                    listM19190 = C6912.m19190();
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("ۨۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22737)) ^ (-1283836739);
                        i5 = -42401696;
                    } else {
                        iM2761 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26797) ^ 1116885506;
                        i5 = 698328386;
                    }
                    break;
                case -1396100544:
                case -218557019:
                    this.f79376 = listM19190;
                    this.f79377.notifyDataSetChanged();
                    break;
                case -421227503:
                case 378698234:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                        i5 = -1949188557;
                    } else {
                        iM2761 = (C0773.m3169("ۧۚ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * (-20307)) ^ (-1462037684);
                        i5 = -2049116477;
                    }
                    break;
                case -392090185:
                case 381421504:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۢۛ") ^ i3) * (-117);
                        i4 = ((iM2761 ^ i2) * (-26193)) ^ (-1618888718);
                        i5 = -435911643;
                    } else {
                        iM2761 = (C0619.m2761("ۖۨ") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-15087)) ^ 1521729592;
                        i5 = -1740287616;
                    }
                    break;
                case -356555259:
                case 639601254:
                    C2878.m9491();
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("ۢۛ") ^ i3) * (-117);
                        i4 = ((iM2761 ^ i2) * (-26193)) ^ (-1618888718);
                        i5 = -435911643;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛ᩵")) * 109;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-1969655873);
                        i5 = 2146264594;
                    }
                    break;
                case -102473171:
                case 2029780634:
                    C1321.m4852();
                    break;
                case 149697900:
                case 2110948421:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ۛ᩵")) * 109;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-1969655873);
                        i5 = 2146264594;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * (-123);
                        i4 = ((iM2761 ^ i2) * 23809) ^ (-138012978);
                        i5 = 623715224;
                    }
                    break;
                case 364914244:
                case 857400789:
                    C4238.m13540();
                    C0862.m3503();
                    iM2761 = (C0619.m2761("ۛܺ") + i3) * (-93);
                    i4 = ((iM2761 ^ i2) * 11925) ^ (-1588118174);
                    i5 = -1949188557;
                    break;
                case 399915450:
                case 1403731056:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۛ᩵")) * 109;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-1969655873);
                        i5 = 2146264594;
                    } else {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22909) ^ (-1148169940);
                        i5 = 1333628795;
                    }
                    break;
                default:
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("ۛ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21407)) ^ (-70652280);
                        i5 = -1498150784;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛ᩵")) * 109;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-1969655873);
                        i5 = 2146264594;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54696(ActivityC24449 activityC24449) {
        List listM19190 = null;
        int i = -863291587;
        int i2 = C3492.f12043;
        int i3 = C20932.f66974;
        int iM3169 = (C0773.m3169("ᩳ۠") + i3) * (-85);
        int i4 = ((iM3169 ^ i2) * 23809) ^ (-1297466219);
        int i5 = 669036875;
        while (true) {
            i = ((((i ^ i2) * (-11391)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2058066456:
                case -868167239:
                    C20932.m47848();
                    if (C2419.f7754 >= 0) {
                        iM3169 = (i3 - C0619.m2761("᩸ۖ")) * (-69);
                        i4 = ((iM3169 ^ i2) * 14873) ^ (-631827296);
                        i5 = 874342279;
                    } else {
                        iM3169 = C0619.m2761("ۤܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10593)) ^ (-1097461827);
                        i5 = -2064063839;
                    }
                    break;
                case -2050782759:
                case 1133941590:
                    activityC24449.f79377.notifyDataSetChanged();
                    break;
                case -1957870861:
                case 1049812517:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ۘۖ")) * 35;
                        i4 = ((iM3169 ^ i3) * 31675) ^ (-734364675);
                        i5 = 1070406441;
                    } else {
                        iM3169 = C0619.m2761("ۨۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27077) ^ (-2076763297);
                        i5 = 72039133;
                    }
                    break;
                case -1617638361:
                case 398293728:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i3 - C0619.m2761("᩸ۖ")) * (-69);
                        i4 = ((iM3169 ^ i2) * 14873) ^ (-631827296);
                        i5 = 874342279;
                    } else {
                        iM3169 = C0773.m3169("ᩴᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7331)) ^ (-256043343);
                        i5 = 661048359;
                    }
                    break;
                case -1395465749:
                case 229198557:
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19465) ^ 2126469218;
                        i5 = 796696690;
                    } else {
                        iM3169 = C0773.m3169("ۗᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7995) ^ (-388929504);
                        i5 = -865305202;
                    }
                    break;
                case -1372260622:
                case -531404055:
                    RunnableC3055.m9933();
                    C2966.m9664();
                    break;
                case -1277997431:
                case 467836832:
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("ܶۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11493)) ^ (-1251976130);
                        i5 = 1084426524;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12921) ^ (-877726679);
                        i5 = 271331779;
                    }
                    break;
                case -781482290:
                case 1135711226:
                    C0862.m3503();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12921) ^ (-877726679);
                        i5 = 271331779;
                    } else {
                        iM3169 = C0619.m2761("ۤܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10593)) ^ (-1097461827);
                        i5 = -2064063839;
                    }
                    break;
                case -543551685:
                case 2053103115:
                    activityC24449.f79376 = listM19190;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19465) ^ 2126469218;
                        i5 = 796696690;
                    } else {
                        iM3169 = C0619.m2761("ۡܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17427)) ^ (-231850241);
                        i5 = 1767540655;
                    }
                    break;
                case -491355113:
                case -284273523:
                    listM19190 = C6912.m19190();
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19465) ^ 2126469218;
                        i5 = 796696690;
                    } else {
                        iM3169 = C0619.m2761("᩶ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3641) ^ (-500313542);
                        i5 = 1873771392;
                    }
                    break;
                case -76642657:
                case 64611180:
                    C2288.m7767();
                    iM3169 = C0619.m2761("ۤܺ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-10593)) ^ (-1097461827);
                    i5 = -2064063839;
                    break;
                case 525399298:
                case 643833648:
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12921) ^ (-877726679);
                        i5 = 271331779;
                    } else {
                        iM3169 = (C0773.m3169("ܳ۬") ^ i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-9645)) ^ (-533383850);
                        i5 = -1407210011;
                    }
                    break;
                case 1015613235:
                case 1376076469:
                    if (C2287.f7432 < 0) {
                        iM3169 = (i2 - C0773.m3169("ۘۖ")) * 35;
                        i4 = ((iM3169 ^ i3) * 31675) ^ (-734364675);
                        i5 = 1070406441;
                    } else {
                        iM3169 = C0619.m2761("ۤܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10593)) ^ (-1097461827);
                        i5 = -2064063839;
                    }
                    break;
                case 1374603539:
                case 1398109095:
                    if (C3448.m11248() != 0) {
                        iM3169 = (i2 - C0773.m3169("ۘۖ")) * 35;
                        i4 = ((iM3169 ^ i3) * 31675) ^ (-734364675);
                        i5 = 1070406441;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿ᩻")) * (-11);
                        i4 = ((iM3169 ^ i3) * (-4205)) ^ 440667553;
                        i5 = -1387985709;
                    }
                    break;
                case 2086329467:
                case 2140518735:
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12921) ^ (-877726679);
                        i5 = 271331779;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20267) ^ (-2119370718);
                        i5 = 212610505;
                    }
                    break;
                default:
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12921) ^ (-877726679);
                        i5 = 271331779;
                    } else {
                        iM3169 = C0773.m3169("֫ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22875) ^ 1695995293;
                        i5 = 341745725;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = null;
        AbstractC22044 abstractC22044M42219 = null;
        int i2 = 542936986;
        int i3 = C2375.f7641;
        int i4 = C1146.f4234;
        int iM3169 = (C0773.m3169("ۚۜ") + i3) * (-119);
        int i5 = ((iM3169 ^ i4) * 31259) ^ (-1661306277);
        int i6 = -342073437;
        while (true) {
            i2 = ((((i2 ^ i4) * 13615) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1922468407:
                case 641454389:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳ᩺")) * (-119);
                        i5 = ((iM3169 ^ i3) * (-2123)) ^ (-2001651011);
                        i6 = 989696440;
                    } else {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    }
                    break;
                case -1649995508:
                case 1517225098:
                    C0487.m2356();
                    if (C2375.f7641 > 0) {
                        iM3169 = C0619.m2761("۬ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10209) ^ 59513754;
                        i6 = -1666394624;
                    } else {
                        iM3169 = C0773.m3169("ۢ۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14341) ^ (-1459226473);
                        i6 = -482586253;
                    }
                    break;
                case -1640575799:
                case -580393129:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    } else {
                        iM3169 = C0619.m2761("ۙۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10031) ^ 1065088963;
                        i6 = 2098301340;
                    }
                    break;
                case -1638003367:
                case 1397084987:
                    C1783.m6232();
                    break;
                case -1614286005:
                case -693400778:
                    abstractC22044M42219 = ((C18099) C1542.m5473(this.f79376, i)).m42219();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    } else {
                        iM3169 = C0619.m2761("ۚ֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22303) ^ (-1659479588);
                        i6 = 1161419624;
                    }
                    break;
                case -1600104328:
                case -395141357:
                    C0487.m2356();
                    C3998.m12920();
                    iM3169 = C0773.m3169("ۢ۬") ^ i4;
                    i5 = ((iM3169 ^ i3) * 14341) ^ (-1459226473);
                    i6 = -482586253;
                    break;
                case -1506477955:
                case 1432605013:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳ᩺")) * (-119);
                        i5 = ((iM3169 ^ i3) * (-2123)) ^ (-2001651011);
                        i6 = 989696440;
                    } else {
                        iM3169 = C0619.m2761("ۧۢ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 3351) ^ 1685586942;
                        i6 = 1830708622;
                    }
                    break;
                case -1439639867:
                case 1894021581:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۬ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10209) ^ 59513754;
                        i6 = -1666394624;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28957)) ^ 952354225;
                        i6 = -563699234;
                    }
                    break;
                case -1430748366:
                case 1486523785:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14341) ^ (-1459226473);
                        i6 = -482586253;
                    } else {
                        iM3169 = C0619.m2761("ܿۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-2185)) ^ 1974223309;
                        i6 = -1415041081;
                    }
                    break;
                case -1259238510:
                case 607919885:
                    intent = new Intent(this, (Class<?>) ActivityC16243.class);
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0619.m2761("۠ۜ") ^ i4) * (-19);
                        i5 = ((iM3169 ^ i3) * 795) ^ 1905574393;
                        i6 = -1061101805;
                    } else {
                        iM3169 = (C0619.m2761("ۗ᩷") ^ i4) * (-33);
                        i5 = ((iM3169 ^ i3) * 4679) ^ (-756021556);
                        i6 = -543699851;
                    }
                    break;
                case -1192974803:
                case 164611782:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    } else {
                        iM3169 = (C0619.m2761("֨ۧ") ^ i4) * (-3);
                        i5 = ((iM3169 ^ i3) * (-20755)) ^ (-1380468753);
                        i6 = -894543804;
                    }
                    break;
                case -1008521397:
                case 1007496292:
                    C2834.m9344();
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    } else {
                        iM3169 = C0773.m3169("ۢ۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14341) ^ (-1459226473);
                        i6 = -482586253;
                    }
                    break;
                case -570466272:
                case 1203720112:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * 95;
                        i5 = ((iM3169 ^ i4) * (-26869)) ^ (-1041488763);
                        i6 = -1021286425;
                    } else {
                        iM3169 = C0619.m2761("۬ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 23153) ^ 1455489065;
                        i6 = -1063388667;
                    }
                    break;
                case -412769121:
                case 466720320:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳ᩺")) * (-119);
                        i5 = ((iM3169 ^ i3) * (-2123)) ^ (-2001651011);
                        i6 = 989696440;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܺ") ^ i3) * 77;
                        i5 = ((iM3169 ^ i4) * (-32455)) ^ 936788011;
                        i6 = 574785495;
                    }
                    break;
                case 82794351:
                case 297571886:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14341) ^ (-1459226473);
                        i6 = -482586253;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۖ") + i3) * 49;
                        i5 = ((iM3169 ^ i4) * (-12609)) ^ 1202172945;
                        i6 = 173737296;
                    }
                    break;
                default:
                    intent.setData(abstractC22044M42219.m49836());
                    C3033.m9858(this, intent);
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM2761;
        int i2;
        int i3;
        C18099 c18099;
        short s;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2762;
        int i9;
        String str;
        C18099 c180910;
        final ActivityC24449 activityC24449 = this;
        int i10 = -1200366433;
        int i11 = C0773.f2792;
        int i12 = C1519.f5300;
        int iM3169 = C0773.m3169("ۡۗ") ^ i11;
        int i13 = ((iM3169 ^ i12) * 21893) ^ (-1157351903);
        int i14 = iM3169 ^ 37321866;
        final String strM42221 = null;
        C9898 c9898M42995 = null;
        short[] sArr = null;
        int i15 = 0;
        short s2 = 0;
        final C18099 c180911 = null;
        int i16 = 0;
        int i17 = 0;
        C18452 c18452 = null;
        int i18 = 0;
        int iM2763 = 0;
        int i19 = 0;
        int i20 = 0;
        short s3 = 0;
        int iM2764 = 0;
        String strM6366 = null;
        InterfaceC21436 interfaceC21436 = null;
        C9898 c9898M42996 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 24599) >> 31));
            switch (i10) {
                case -2128903482:
                case -2868637:
                    i16 = 34909;
                    iM2762 = C0619.m2761("֫ۛ") ^ i12;
                    i4 = ((iM2762 ^ i11) * 13883) ^ (-979001546);
                    i9 = -1353943315;
                    i5 = iM2762 ^ i9;
                    c180911 = c180911;
                    iM2764 = iM2764;
                    str = strM42221;
                    i14 = i5;
                    i13 = i4;
                    strM42221 = str;
                    break;
                case -2078802246:
                case -1751928541:
                    strM42221 = strM42221;
                    iM2764 = iM2764;
                    c18099 = c180911;
                    s = f79375[14];
                    if (!C3690.m11987()) {
                        int iM31610 = (C0773.m3169("ۤۛ") ^ i11) * (-83);
                        i4 = ((iM31610 ^ i12) * 11809) ^ (-185053377);
                        i5 = iM31610 ^ 961595917;
                        s2 = s;
                        c180911 = c18099;
                        activityC24449 = this;
                        iM2764 = iM2764;
                        str = strM42221;
                        i14 = i5;
                        i13 = i4;
                        strM42221 = str;
                    }
                    i6 = i15;
                    int iM31611 = C0773.m3169("᩷ܰ") ^ i12;
                    short s4 = s;
                    i7 = ((iM31611 ^ i11) * (-6897)) ^ 1718858416;
                    i8 = iM31611 ^ 1765757532;
                    s2 = s4;
                    i15 = i6;
                    c180911 = c18099;
                    i13 = i7;
                    iM2764 = iM2764;
                    activityC24449 = this;
                    str = strM42221;
                    i14 = i8;
                    strM42221 = str;
                    break;
                case -1907236927:
                case 1435203894:
                    C2702.m8876();
                    i6 = i15;
                    s = s2;
                    strM42221 = strM42221;
                    iM2764 = iM2764;
                    c18099 = c180911;
                    int iM31612 = C0773.m3169("᩷ܰ") ^ i12;
                    short s5 = s;
                    i7 = ((iM31612 ^ i11) * (-6897)) ^ 1718858416;
                    i8 = iM31612 ^ 1765757532;
                    s2 = s5;
                    i15 = i6;
                    c180911 = c18099;
                    i13 = i7;
                    iM2764 = iM2764;
                    activityC24449 = this;
                    str = strM42221;
                    i14 = i8;
                    strM42221 = str;
                    break;
                case -1865677829:
                case -1231211411:
                    int i21 = iM2763 ^ i19;
                    C0950.m3793(c9898M42996, i17, i21, i17, i21);
                    interfaceC21436 = new InterfaceC21436() { // from class: l.᩹ܿۤ
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // l.InterfaceC21436
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i22 = ActivityC24449.f79374;
                            int itemId = menuItem.getItemId();
                            ActivityC24449 activityC244410 = this.f76830;
                            String str2 = strM42221;
                            C18099 c180912 = c180911;
                            if (itemId == R.string.MT_Protector) {
                                C12514 c12514 = new C12514(activityC244410, activityC244410, str2, c180912);
                                c12514.m22945(R.string.MT_Protector);
                                c12514.m22924((CharSequence) str2);
                                c12514.m22918();
                                c12514.m22957(6);
                                c12514.m22959();
                                c12514.m22955(true);
                                return true;
                            }
                            int i23 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(activityC244410);
                            c2361.m8021(R.string.MT_Protector);
                            c2361.m8008(activityC244410.getString(R.string.MT_Protector, str2));
                            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3565(0, activityC244410, c180912));
                            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361.m8016();
                            return true;
                        }
                    };
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ܰ᩸") ^ i11;
                        i2 = ((iM2761 ^ i12) * (-8657)) ^ (-1356475019);
                        i3 = -810164787;
                        i14 = iM2761 ^ i3;
                        i13 = i2;
                    }
                    c180910 = c180911;
                    int iM31613 = C0773.m3169("۠᩷") ^ i12;
                    i2 = ((iM31613 ^ i11) * (-369)) ^ (-830479907);
                    i14 = iM31613 ^ (-524460983);
                    activityC24449 = this;
                    c180911 = c180910;
                    i13 = i2;
                    break;
                case -1851185741:
                case 1069753313:
                    if (!C2966.m9664()) {
                        iM2761 = C0773.m3169("۬ܶ") ^ i12;
                        i2 = ((iM2761 ^ i11) * 8083) ^ 1589738605;
                        i3 = -1085572634;
                        i14 = iM2761 ^ i3;
                        i13 = i2;
                    } else {
                        i6 = i15;
                        s = s2;
                        strM42221 = strM42221;
                        iM2764 = iM2764;
                        c18099 = c180911;
                        int iM31614 = C0773.m3169("᩷ܰ") ^ i12;
                        short s6 = s;
                        i7 = ((iM31614 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM31614 ^ 1765757532;
                        s2 = s6;
                        i15 = i6;
                        c180911 = c18099;
                        i13 = i7;
                        iM2764 = iM2764;
                        activityC24449 = this;
                        str = strM42221;
                        i14 = i8;
                        strM42221 = str;
                    }
                    break;
                case -1517767074:
                case -1480631174:
                    iM2764 = iM2764;
                    c18099 = c180911;
                    strM42221 = strM42221;
                    strM6366 = RunnableC1848.m6366(f79375, 15, 3, i16);
                    if (!C2966.m9664()) {
                        i6 = i15;
                        s = s2;
                        int iM31615 = C0773.m3169("᩷ܰ") ^ i12;
                        short s7 = s;
                        i7 = ((iM31615 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM31615 ^ 1765757532;
                        s2 = s7;
                        i15 = i6;
                        c180911 = c18099;
                        i13 = i7;
                        iM2764 = iM2764;
                        activityC24449 = this;
                        str = strM42221;
                        i14 = i8;
                        strM42221 = str;
                    } else {
                        int iM2765 = C0619.m2761("ܽۤ") ^ i12;
                        strM42221 = strM42221;
                        i14 = iM2765 ^ (-1851446271);
                        i13 = ((iM2765 ^ i11) * (-19889)) ^ (-756902862);
                        c180911 = c18099;
                        iM2764 = iM2764;
                    }
                    break;
                case -1488898416:
                case -453219866:
                    strM42221 = strM42221;
                    iM2764 = iM2764;
                    c180911 = c180911;
                    if (i15 - ((s2 * s3) + 1) < 0) {
                        iM2762 = (C0619.m2761("ܿ᩸") ^ i11) * 73;
                        i4 = ((iM2762 ^ i12) * 14445) ^ 509832034;
                        i9 = 102868458;
                    } else {
                        iM2762 = C0619.m2761("ۛ᩶") ^ i11;
                        i4 = ((iM2762 ^ i12) * 6755) ^ (-2138687870);
                        i9 = -1924486095;
                    }
                    i5 = iM2762 ^ i9;
                    c180911 = c180911;
                    iM2764 = iM2764;
                    str = strM42221;
                    i14 = i5;
                    i13 = i4;
                    strM42221 = str;
                    break;
                case -1458427686:
                case 406971611:
                    i16 = 38829;
                    iM2762 = C0619.m2761("֫ۛ") ^ i12;
                    i4 = ((iM2762 ^ i11) * 13883) ^ (-979001546);
                    i9 = -1353943315;
                    i5 = iM2762 ^ i9;
                    c180911 = c180911;
                    iM2764 = iM2764;
                    str = strM42221;
                    i14 = i5;
                    i13 = i4;
                    strM42221 = str;
                    break;
                case -1409045771:
                case -576139889:
                    C2310.m7813();
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ܳܳ") ^ i11) * 33;
                        i2 = ((iM2761 ^ i12) * (-24749)) ^ (-527584619);
                        i3 = 1210296360;
                        i14 = iM2761 ^ i3;
                        i13 = i2;
                    } else {
                        i6 = i15;
                        s = s2;
                        strM42221 = strM42221;
                        iM2764 = iM2764;
                        c18099 = c180911;
                        int iM31616 = C0773.m3169("᩷ܰ") ^ i12;
                        short s8 = s;
                        i7 = ((iM31616 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM31616 ^ 1765757532;
                        s2 = s8;
                        i15 = i6;
                        c180911 = c18099;
                        i13 = i7;
                        iM2764 = iM2764;
                        activityC24449 = this;
                        str = strM42221;
                        i14 = i8;
                        strM42221 = str;
                    }
                    break;
                case -1121231828:
                case 1003307675:
                    c18452.m42994(interfaceC21436);
                    C22744.m51282(view, c18452);
                    return true;
                case -1061122134:
                case 1614099475:
                    C0619.m2763();
                    if (C11235.m28309() == 0) {
                        c180910 = c180911;
                        iM2764 = iM2764;
                        int iM2766 = C0619.m2761("۟ۗ") ^ i11;
                        C18099 c180912 = c180910;
                        i13 = ((iM2766 ^ i12) * (-28877)) ^ (-592466448);
                        i14 = iM2766 ^ (-560133756);
                        c180911 = c180912;
                        c18452 = null;
                        iM2764 = iM2764;
                    } else {
                        i6 = i15;
                        s = s2;
                        strM42221 = strM42221;
                        iM2764 = iM2764;
                        c18099 = c180911;
                        int iM31617 = C0773.m3169("᩷ܰ") ^ i12;
                        short s9 = s;
                        i7 = ((iM31617 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM31617 ^ 1765757532;
                        s2 = s9;
                        i15 = i6;
                        c180911 = c18099;
                        i13 = i7;
                        iM2764 = iM2764;
                        activityC24449 = this;
                        str = strM42221;
                        i14 = i8;
                        strM42221 = str;
                    }
                    break;
                case -753065962:
                case 1882345538:
                    iM2764 = iM2764;
                    c180910 = (C18099) C3690.m11998(activityC24449.f79376, i);
                    strM42221 = c180910.m42221();
                    if (C1146.f4234 >= 0) {
                        int iM2767 = C0619.m2761("۟ۗ") ^ i11;
                        C18099 c180913 = c180910;
                        i13 = ((iM2767 ^ i12) * (-28877)) ^ (-592466448);
                        i14 = iM2767 ^ (-560133756);
                        c180911 = c180913;
                        c18452 = null;
                    } else {
                        i17 = 0;
                        c18452 = new C18452(activityC24449, view, 0);
                        c9898M42995 = c18452.m42995();
                        if (C23916.m53419() != 0) {
                            iM2764 = iM2764;
                            int iM31618 = C0773.m3169("۠᩷") ^ i12;
                            i2 = ((iM31618 ^ i11) * (-369)) ^ (-830479907);
                            i14 = iM31618 ^ (-524460983);
                            activityC24449 = this;
                            c180911 = c180910;
                            i13 = i2;
                        } else {
                            int iM31619 = (C0773.m3169("᩶᩸") ^ i11) * (-47);
                            c180911 = c180910;
                            i13 = ((iM31619 ^ i12) * (-3011)) ^ (-1218913296);
                            i14 = iM31619 ^ 1353430021;
                            i17 = 0;
                        }
                    }
                    iM2764 = iM2764;
                    break;
                case -272611829:
                case 201058413:
                    strM42221 = strM42221;
                    iM2764 = iM2764;
                    c18099 = c180911;
                    int i22 = s2 + 1;
                    i6 = i22 * i22;
                    s3 = 2;
                    if (C2023.f6737) {
                        s = s2;
                        int iM316110 = C0773.m3169("᩷ܰ") ^ i12;
                        short s10 = s;
                        i7 = ((iM316110 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM316110 ^ 1765757532;
                        s2 = s10;
                    } else {
                        int iM31620 = C0773.m3169("᩶ۙ") ^ i12;
                        i7 = ((iM31620 ^ i11) * 18927) ^ 212606349;
                        i8 = iM31620 ^ 998359802;
                    }
                    i15 = i6;
                    c180911 = c18099;
                    i13 = i7;
                    iM2764 = iM2764;
                    activityC24449 = this;
                    str = strM42221;
                    i14 = i8;
                    strM42221 = str;
                    break;
                case -194734556:
                case 910588632:
                    C9898 c9898 = c9898M42995;
                    iM2764 = iM2764;
                    C4238.m13541(c9898, i17, iM2764, i17, iM2764);
                    c9898M42996 = c18452.m42995();
                    sArr = f79375;
                    i20 = 18;
                    if (C2485.f7950 != 0) {
                        s = s2;
                        c9898M42995 = c9898;
                        c18099 = c180911;
                        strM42221 = strM42221;
                        i18 = 3;
                        i6 = i15;
                        int iM316111 = C0773.m3169("᩷ܰ") ^ i12;
                        short s11 = s;
                        i7 = ((iM316111 ^ i11) * (-6897)) ^ 1718858416;
                        i8 = iM316111 ^ 1765757532;
                        s2 = s11;
                        i15 = i6;
                        c180911 = c18099;
                        i13 = i7;
                        iM2764 = iM2764;
                        activityC24449 = this;
                        str = strM42221;
                        i14 = i8;
                        strM42221 = str;
                    } else {
                        int iM31621 = (C0773.m3169("ܰܺ") ^ i12) * (-53);
                        int i23 = ((iM31621 ^ i11) * (-29997)) ^ 1331523776;
                        i14 = iM31621 ^ (-612154576);
                        c9898M42995 = c9898;
                        iM2764 = iM2764;
                        i13 = i23;
                        i18 = 3;
                    }
                    break;
                case -9765836:
                case 1322998649:
                    C9898 c9899 = c9898M42995;
                    iM2764 = C0619.m2761(strM6366) ^ 2126829452;
                    if (C13473.f42873 != 0) {
                        c9898M42995 = c9899;
                        c180910 = c180911;
                        int iM316112 = C0773.m3169("۠᩷") ^ i12;
                        i2 = ((iM316112 ^ i11) * (-369)) ^ (-830479907);
                        i14 = iM316112 ^ (-524460983);
                        activityC24449 = this;
                        c180911 = c180910;
                        i13 = i2;
                    } else {
                        int iM31622 = (i11 - C0773.m3169("ۙۖ")) * (-101);
                        c9898M42995 = c9899;
                        i13 = ((iM31622 ^ i12) * 11137) ^ 2009825927;
                        i14 = iM31622 ^ 867451360;
                    }
                    break;
                case 222963860:
                case 1890048053:
                    String str2 = strM42221;
                    iM2764 = iM2764;
                    C18099 c180914 = c180911;
                    if (C2834.m9344() >= 0) {
                        c180910 = c180914;
                        strM42221 = str2;
                        iM2764 = iM2764;
                        int iM316113 = C0773.m3169("۠᩷") ^ i12;
                        i2 = ((iM316113 ^ i11) * (-369)) ^ (-830479907);
                        i14 = iM316113 ^ (-524460983);
                        activityC24449 = this;
                        c180911 = c180910;
                        i13 = i2;
                    } else {
                        int iM2768 = C0619.m2761("᩺᩶") ^ i12;
                        i13 = ((iM2768 ^ i11) * 24589) ^ 552275003;
                        c180911 = c180914;
                        strM42221 = str2;
                        i14 = iM2768 ^ 1223585312;
                        iM2764 = iM2764;
                        activityC24449 = this;
                    }
                    break;
                case 337263773:
                case 1632814135:
                    iM2763 = C0619.m2761(C2419.m8166(sArr, i20, i18, i16));
                    i19 = 2123125075;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("۬ܶ") ^ i12;
                        i2 = ((iM2761 ^ i11) * 8083) ^ 1589738605;
                        i3 = -1085572634;
                    } else {
                        iM2761 = (C0619.m2761("᩺۬") + i12) * 87;
                        i2 = ((iM2761 ^ i11) * (-29521)) ^ (-2026442556);
                        i3 = 1708150044;
                    }
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    break;
                default:
                    C3734.m12152();
                    C2485.m8357();
                    return false;
            }
        }
    }
}
