package l;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9LN */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23311 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75516 = 0;

    /* JADX INFO: renamed from: ᩷᩺ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f75517 = {2057, -24288, -26022, -20605, 21755, 21472, -28540, -31597, -23109, -27849, -23703, -24250, -26876, -21736, -17676, -26876, 22238, 24236, 22417, -13699, -13728, -13699, -13723, -13716, 1568, 30931, 24556, 24939, -26744, 23538, -31637, 3295, -30411, 20553, -30449, 6552, 16646, 16673, 16678, 16685, 16664, 16681, 16700, 16683, 16672, 16664, 16698, 16685, 16702, 16673, 16685, 16703, 16685, 16698};

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C7266 f75518;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f75519;

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
        int i5 = 1980877368;
        int i6 = C3492.f12043;
        int i7 = AbstractC0116.f1064;
        int iM3169 = (C0773.m3169("ܺ᩺") ^ i7) * 39;
        int i8 = ((iM3169 ^ i6) * 15779) ^ (-1121970011);
        int i9 = 642087503;
        while (true) {
            i5 = ((((i5 ^ i6) * (-27677)) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2105927908:
                case -1332156618:
                    if (C2354.m7983()) {
                        iM3169 = (C0619.m2761("ۖ۬") ^ i7) * 101;
                        i8 = ((iM3169 ^ i6) * 14639) ^ 607581289;
                        i9 = 117980226;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩵") ^ i6) * (-31);
                        i8 = ((iM3169 ^ i7) * (-9077)) ^ (-631286376);
                        i9 = 615516878;
                    }
                    break;
                case -2075988859:
                case -1973421711:
                    return C0487.m2361(sArr2, i4, 18, i3);
                case -2032770965:
                case 1362958633:
                    sArr = f75517;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۜۖ") + i7) * 81;
                        i8 = ((iM3169 ^ i6) * (-19799)) ^ 1608431932;
                        i9 = 560183310;
                    } else {
                        iM3169 = (C0619.m2761("ۚۖ") ^ i6) * (-73);
                        i8 = ((iM3169 ^ i7) * (-2919)) ^ (-355157512);
                        i9 = 967240891;
                    }
                    break;
                case -2006833688:
                case -1469169261:
                    i3 = 26473;
                    iM3169 = C0773.m3169("ᩴܳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * 7119) ^ (-513279118);
                    i9 = 2023706332;
                    break;
                case -1875700558:
                case 1080820329:
                    i2 = 5363856 + i;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("۫ᩳ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 28013) ^ (-1966690771);
                        i9 = -1958765480;
                    } else {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i6) * 73;
                        i8 = ((iM3169 ^ i7) * 24777) ^ 491128651;
                        i9 = -1727735596;
                    }
                    break;
                case -1729253232:
                case 1255060236:
                    c = '#';
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("᩹᩵") ^ i6) * (-31);
                        i8 = ((iM3169 ^ i7) * (-9077)) ^ (-631286376);
                        i9 = 615516878;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۤۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM3169 ^ i7) * (-23787)) ^ (-1577105647);
                        i9 = 1961819201;
                    }
                    break;
                case -1316269061:
                case -275180544:
                    C3779.m12264();
                    if (!C17202.m40372()) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i7) * (-121);
                        i8 = ((iM3169 ^ i6) * (-13229)) ^ (-1692852079);
                        i9 = 645334836;
                    } else {
                        iM3169 = C0619.m2761("ۢ۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * 5897) ^ 548934184;
                        i9 = -714023268;
                    }
                    break;
                case -1271481093:
                case 2088929375:
                    sArr2 = f75517;
                    i4 = 36;
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i7) * (-121);
                        i8 = ((iM3169 ^ i6) * (-13229)) ^ (-1692852079);
                        i9 = 645334836;
                    } else {
                        iM3169 = C0619.m2761("ۤ۬") ^ i7;
                        i8 = ((iM3169 ^ i6) * 24343) ^ (-1972051633);
                        i9 = -1908287419;
                    }
                    break;
                case -1268485653:
                case -974809124:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۜۖ") + i7) * 81;
                        i8 = ((iM3169 ^ i6) * (-19799)) ^ 1608431932;
                        i9 = 560183310;
                    } else {
                        iM3169 = (C0619.m2761("۟᩷") ^ i7) * (-61);
                        i8 = ((iM3169 ^ i6) * (-15681)) ^ (-2070342207);
                        i9 = 1791300289;
                    }
                    break;
                case -1078299935:
                case 2002912328:
                    i3 = 16712;
                    iM3169 = C0773.m3169("ᩴܳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * 7119) ^ (-513279118);
                    i9 = 2023706332;
                    break;
                case -964256225:
                case 638704640:
                    C2023.m6964();
                    C17202.m40372();
                    return null;
                case -550029165:
                case 675194066:
                    s2 = 4632;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("۫ᩳ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 28013) ^ (-1966690771);
                        i9 = -1958765480;
                    } else {
                        iM3169 = C0619.m2761("ۨܳ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-1457)) ^ (-1759379924);
                        i9 = 299189522;
                    }
                    break;
                case -279761049:
                case 2003015576:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i7) * (-121);
                        i8 = ((iM3169 ^ i6) * (-13229)) ^ (-1692852079);
                        i9 = 645334836;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ᩳۙ")) * (-95);
                        i8 = ((iM3169 ^ i6) * (-12259)) ^ 1329804884;
                        i9 = -841558179;
                    }
                    break;
                case 365651429:
                case 1854028011:
                    if (i2 - (s * s2) < 0) {
                        iM3169 = (C0619.m2761("ۧܽ") + i6) * 77;
                        i8 = ((iM3169 ^ i7) * (-7915)) ^ (-1709635520);
                        i9 = -1995598757;
                    } else {
                        iM3169 = (i6 - C0773.m3169("֡ܰ")) * (-53);
                        i8 = ((iM3169 ^ i7) * 14109) ^ 404977011;
                        i9 = -1451940906;
                    }
                    break;
                case 389403584:
                case 1807620760:
                    s = sArr[c];
                    i = s * s;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("۫ᩳ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 28013) ^ (-1966690771);
                        i9 = -1958765480;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩸᩻")) * (-85);
                        i8 = ((iM3169 ^ i6) * (-24829)) ^ 1735922133;
                        i9 = -492634374;
                    }
                    break;
                case 448793619:
                case 1869611544:
                    if (C2375.f7641 > 0) {
                        iM3169 = (C0619.m2761("᩹᩵") ^ i6) * (-31);
                        i8 = ((iM3169 ^ i7) * (-9077)) ^ (-631286376);
                        i9 = 615516878;
                    } else {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i7) * (-121);
                        i8 = ((iM3169 ^ i6) * (-13229)) ^ (-1692852079);
                        i9 = 645334836;
                    }
                    break;
                case 672060023:
                case 1846580621:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("۫ᩳ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 28013) ^ (-1966690771);
                        i9 = -1958765480;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ܶۡ")) * 25;
                        i8 = ((iM3169 ^ i7) * (-27439)) ^ (-984530664);
                        i9 = 1113991192;
                    }
                    break;
                case 767478939:
                case 1215263256:
                    C1542.m5459();
                    C23916.m53419();
                    iM3169 = C0619.m2761("ۢ۬") ^ i6;
                    i8 = ((iM3169 ^ i7) * 5897) ^ 548934184;
                    i9 = -714023268;
                    break;
                default:
                    RunnableC3055.m9933();
                    if (C20932.m47848() == 0) {
                        iM3169 = (C0773.m3169("ۜۖ") + i7) * 81;
                        i8 = ((iM3169 ^ i6) * (-19799)) ^ 1608431932;
                        i9 = 560183310;
                    } else {
                        iM3169 = C0619.m2761("ۢ۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * 5897) ^ 548934184;
                        i9 = -714023268;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x03eb A[PHI: r2 r4 r7 r9 r10 r19 r20 r25 r27 r28
      0x03eb: PHI (r2v7 android.widget.SeekBar) = 
      (r2v2 android.widget.SeekBar)
      (r2v2 android.widget.SeekBar)
      (r2v5 android.widget.SeekBar)
      (r2v2 android.widget.SeekBar)
     binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r4v48 short[]) = (r4v15 short[]), (r4v16 short[]), (r4v25 short[]), (r4v49 short[]) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r9v5 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r19v10 short[]) = (r19v4 short[]), (r19v8 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r20v8 int) = (r20v4 int), (r20v6 int), (r20v2 int), (r20v2 int) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r25v36 android.widget.CheckBox) = 
      (r25v14 android.widget.CheckBox)
      (r25v15 android.widget.CheckBox)
      (r25v21 android.widget.CheckBox)
      (r25v37 android.widget.CheckBox)
     binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r27v25 android.widget.CompoundButton$OnCheckedChangeListener) = 
      (r27v11 android.widget.CompoundButton$OnCheckedChangeListener)
      (r27v12 android.widget.CompoundButton$OnCheckedChangeListener)
      (r27v17 android.widget.CompoundButton$OnCheckedChangeListener)
      (r27v26 android.widget.CompoundButton$OnCheckedChangeListener)
     binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r28v28 java.io.IOException) = (r28v11 java.io.IOException), (r28v12 java.io.IOException), (r28v17 java.io.IOException), (r28v29 java.io.IOException) binds: [B:79:0x03e9, B:75:0x03a5, B:56:0x0291, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        int i2;
        CheckBox checkBox;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        IOException iOException;
        short[] sArr;
        int iM2761;
        int i3;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int iM2762;
        int i8;
        int i9;
        int iM31611;
        int i10;
        final ActivityC23311 activityC23311 = this;
        int i11 = C0487.f2131;
        int i12 = C20932.f66974;
        int iM2763 = C0619.m2761("᩵ۛ") ^ i12;
        int i13 = ((iM2763 ^ i11) * (-13165)) ^ 229450412;
        IOException iOException2 = null;
        String strM9486 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i14 = iM2763 ^ 864970352;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        int iM2764 = 0;
        int i21 = 0;
        int i22 = 1863133248;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = null;
        CheckBox checkBox2 = null;
        SeekBar seekBar = null;
        SeekBar seekBar2 = null;
        while (true) {
            i22 = i14 ^ (i13 & (((i22 ^ i11) * 18167) >> 31));
            switch (i22) {
                case -2124510842:
                case 576318839:
                    if (C2310.f7472 < 0) {
                        iM31611 = C0773.m3169("۟ܶ") ^ i11;
                        i5 = ((iM31611 ^ i12) * (-5347)) ^ (-1618213331);
                        i10 = -1982547742;
                    } else {
                        iM31611 = (C0619.m2761("ܺܽ") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM31611 ^ i12) * (-31153)) ^ 616375824;
                        i10 = -535576591;
                    }
                    i14 = iM31611 ^ i10;
                    i13 = i5;
                    break;
                case -2083000176:
                case 990778566:
                    C17202.m40372();
                    C0862.m3503();
                    break;
                case -2080167742:
                case -1635175045:
                    iOException = iOException2;
                    checkBox2 = (CheckBox) C1564.m5518(activityC23311, C0619.m2761(C0269.m1785(sArr5, i19, i16, i18)) ^ 2102747211);
                    activityC23311.f75518.m19906(seekBar2, seekBar);
                    onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܶۙۧ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            int i23 = 1476479030;
                            int i24 = C2419.f7754;
                            int i25 = C0487.f2131;
                            int iM2765 = C0619.m2761("ۗ֡") ^ i25;
                            int i26 = ((iM2765 ^ i24) * 31199) ^ 495649257;
                            int i27 = -1183427353;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-23077)) >> 31) & i26) ^ (iM2765 ^ i27);
                                switch (i23) {
                                    case -1907603153:
                                    case -979944596:
                                        if (C4238.f15451 >= 0) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = C0619.m2761("ۛ֨") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 22275) ^ (-2040519590);
                                            i27 = -1415566359;
                                        }
                                        break;
                                    case -1755768307:
                                    case 1525635030:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = (C0773.m3169("ܶܶ") ^ i25) * 15;
                                            i26 = ((iM2765 ^ i24) * (-31713)) ^ (-333749254);
                                            i27 = 1530152466;
                                        }
                                        break;
                                    case -1575697419:
                                    case 1241740862:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = (C0619.m2761("᩵۠") + i25) * 51;
                                            i26 = ((iM2765 ^ i24) * 30939) ^ (-665252027);
                                            i27 = 1828723434;
                                        }
                                        break;
                                    case -1375221163:
                                    case 973251188:
                                        if (C3779.f12953 <= 0) {
                                            iM2765 = C0619.m2761("ۛ֨") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 22275) ^ (-2040519590);
                                            i27 = -1415566359;
                                        } else {
                                            iM2765 = (C0619.m2761("ۖ۠") ^ i24) * (-117);
                                            i26 = ((iM2765 ^ i25) * 13271) ^ 2070258851;
                                            i27 = -342622722;
                                        }
                                        break;
                                    case -1343061681:
                                    case 1417882050:
                                        this.f51548.f75518.m19907(z);
                                        break;
                                    case -1311552925:
                                    case -645213110:
                                        if (C4282.f15546 <= 0) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = C0773.m3169("ۖ۫") ^ i25;
                                            i26 = ((iM2765 ^ i24) * (-30413)) ^ (-226225306);
                                            i27 = -756635999;
                                        }
                                        break;
                                    case -1200241193:
                                    case 1678619240:
                                        if (C4238.f15451 >= 0) {
                                            iM2765 = C0773.m3169("֨۠") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 8885) ^ (-580734680);
                                            i27 = -52504544;
                                        } else {
                                            iM2765 = C0773.m3169("᩵᩷") ^ i25;
                                            i26 = ((iM2765 ^ i24) * (-32609)) ^ (-1448348159);
                                            i27 = 689871835;
                                        }
                                        break;
                                    case -1127106852:
                                    case 1009151419:
                                        C2354.m7983();
                                        C23916.m53419();
                                        break;
                                    case -920173597:
                                    case 555789188:
                                        if (C1146.f4234 >= 0) {
                                            iM2765 = C0619.m2761("ۛ֨") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 22275) ^ (-2040519590);
                                            i27 = -1415566359;
                                        } else {
                                            iM2765 = C0619.m2761("ܽ۟") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 21435) ^ (-620349812);
                                            i27 = -55243855;
                                        }
                                        break;
                                    case -350202240:
                                    case -41353793:
                                        C2834.m9344();
                                        C1564.m5509();
                                        iM2765 = C0619.m2761("ۛ֨") ^ i25;
                                        i26 = ((iM2765 ^ i24) * 22275) ^ (-2040519590);
                                        i27 = -1415566359;
                                        break;
                                    case -340842240:
                                    case 1998283802:
                                        C0269.m1775();
                                        if (!C2878.f9462) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = C0773.m3169("۫ܽ") ^ i24;
                                            i26 = ((iM2765 ^ i25) * 20217) ^ (-190055415);
                                            i27 = 967071323;
                                        }
                                        break;
                                    case -339432469:
                                    case 194871191:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM2765 = (C0773.m3169("ۨ۠") ^ i24) * (-9);
                                            i26 = ((iM2765 ^ i25) * 25817) ^ (-1249244983);
                                            i27 = -655384450;
                                        } else {
                                            iM2765 = C0619.m2761("᩺᩵") ^ i24;
                                            i26 = ((iM2765 ^ i25) * 22285) ^ (-693380310);
                                            i27 = -327598887;
                                        }
                                        break;
                                    case 77348282:
                                    case 761810014:
                                        if (RunnableC3646.f12471) {
                                            iM2765 = C0773.m3169("֨۠") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 8885) ^ (-580734680);
                                            i27 = -52504544;
                                        } else {
                                            iM2765 = (C0773.m3169("۟ۖ") ^ i24) * (-45);
                                            i26 = ((iM2765 ^ i25) * (-15501)) ^ 1914991933;
                                            i27 = 2016099689;
                                        }
                                        break;
                                    case 220239166:
                                    case 2067488974:
                                        if (C1826.f6190 <= 0) {
                                            iM2765 = C0773.m3169("۫ܽ") ^ i24;
                                            i26 = ((iM2765 ^ i25) * 20217) ^ (-190055415);
                                            i27 = 967071323;
                                        } else {
                                            iM2765 = C0619.m2761("ܳ۬") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 1709) ^ 1972737928;
                                            i27 = 911280773;
                                        }
                                        break;
                                    case 1047302753:
                                    case 2008560048:
                                        if (C2702.f8586 <= 0) {
                                            iM2765 = C0773.m3169("֨۠") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 8885) ^ (-580734680);
                                            i27 = -52504544;
                                        } else {
                                            iM2765 = (i24 - C0619.m2761("ܽܺ")) * (-15);
                                            i26 = ((iM2765 ^ i25) * 5179) ^ 1812287914;
                                            i27 = 1435112159;
                                        }
                                        break;
                                    default:
                                        if (C1146.f4234 >= 0) {
                                            iM2765 = C0619.m2761("ۛ֨") ^ i25;
                                            i26 = ((iM2765 ^ i24) * 22275) ^ (-2040519590);
                                            i27 = -1415566359;
                                        } else {
                                            iM2765 = (C0619.m2761("ᩴ۬") ^ i24) * (-53);
                                            i26 = ((iM2765 ^ i25) * (-16777)) ^ (-1672211127);
                                            i27 = 681503595;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C4238.f15451 >= 0) {
                        iM2762 = C0619.m2761("ۙۚ") ^ i12;
                        i8 = ((iM2762 ^ i11) * (-29545)) ^ 54570517;
                        i9 = -1416455646;
                    } else {
                        iM2762 = (C0619.m2761("֫ۚ") + i11) * 67;
                        i8 = ((iM2762 ^ i12) * (-23317)) ^ (-157393796);
                        i9 = 1497945716;
                    }
                    i14 = iM2762 ^ i9;
                    i13 = i8;
                    iOException2 = iOException;
                    break;
                case -2035063118:
                case -993364264:
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    super.onCreate(bundle);
                    iM2764 = C0619.m2761(C3492.m11486(f75517, 1, 3, i18));
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("᩸ܳ") ^ i12) * 97;
                        i = ((iM3169 ^ i11) * 26611) ^ (-1481567862);
                        i2 = 1013864705;
                    } else {
                        iM3169 = C0619.m2761("ۘ۬") ^ i11;
                        i = ((iM3169 ^ i12) * 14733) ^ 1812440871;
                        i2 = 489464557;
                    }
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                case -1897719444:
                case -395266540:
                    C1080.m4050();
                    if (C4238.f15451 < 0) {
                        checkBox = checkBox2;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        iOException = iOException2;
                        sArr = sArr3;
                        iM2761 = (C0619.m2761("ܽۙ") + i11) * (-75);
                        i3 = ((iM2761 ^ i12) * 15991) ^ (-117650567);
                        i4 = 997888345;
                        int i23 = iM2761 ^ i4;
                        sArr3 = sArr;
                        checkBox2 = checkBox;
                        iOException2 = iOException;
                        i14 = i23;
                        i13 = i3;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                    }
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    iM2761 = (C0773.m3169("֫ܳ") + i11) * 55;
                    i3 = ((iM2761 ^ i12) * (-5369)) ^ 1932683441;
                    i4 = 1790068442;
                    int i24 = iM2761 ^ i4;
                    sArr3 = sArr;
                    checkBox2 = checkBox;
                    iOException2 = iOException;
                    i14 = i24;
                    i13 = i3;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    break;
                case -1556181410:
                case 423728627:
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    s = f75517[0];
                    s2 = 11920;
                    if (C1783.m6232()) {
                        iM3169 = (i12 - C0773.m3169("ᩳܿ")) * 73;
                        i = ((iM3169 ^ i11) * 10189) ^ 108074614;
                        i2 = -554016008;
                    } else {
                        iM3169 = C0619.m2761("ۜܳ") ^ i12;
                        i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                        i2 = 297928596;
                    }
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                case -1507291850:
                case 981472082:
                    try {
                        AbstractC22044 abstractC22044M35190 = C14584.m35190(C2485.m8359(this));
                        activityC23311.f75519 = abstractC22044M35190;
                        C15425 c15425 = new C15425(C2485.m8348(abstractC22044M35190));
                        Bitmap bitmapM36951 = c15425.m36951();
                        byte[] ninePatchChunk = bitmapM36951.getNinePatchChunk();
                        C18453 c18453M36955 = c15425.m36955();
                        C3099.m10086(c18453M36955);
                        activityC23311.f75518.m19905(new NinePatchDrawable(getResources(), bitmapM36951, ninePatchChunk, c18453M36955.f60075, null));
                        iM31611 = C0773.m3169("ۧ֨") ^ i11;
                        i5 = ((iM31611 ^ i12) * 5797) ^ (-1438149350);
                        i10 = 1859253162;
                    } catch (IOException e) {
                        iOException2 = e;
                        iM31611 = (C0619.m2761("ᩳۤ") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM31611 ^ i11) * 1067) ^ 1248312608;
                        i10 = 1653493975;
                    }
                    i14 = iM31611 ^ i10;
                    i13 = i5;
                    break;
                case -1458025645:
                case -763270579:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    strM9486 = C2878.m9486(f75517, 7, 3, i18);
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ܽۙ") + i11) * (-75);
                        i3 = ((iM2761 ^ i12) * 15991) ^ (-117650567);
                        i4 = 997888345;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩹") ^ i11;
                        i3 = ((iM2761 ^ i12) * 27285) ^ (-580412741);
                        i4 = 11028717;
                    }
                    int i25 = iM2761 ^ i4;
                    sArr3 = sArr;
                    checkBox2 = checkBox;
                    iOException2 = iOException;
                    i14 = i25;
                    i13 = i3;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    break;
                case -1423766704:
                case 294549397:
                    i18 = 51721;
                    iM3169 = (C0619.m2761("ۘ᩷") ^ i11) * (-29);
                    i = ((iM3169 ^ i12) * (-18279)) ^ 89028570;
                    i2 = -1663713939;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                case -1352954845:
                case 400162660:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    activityC23311.f75518 = (C7266) C1564.m5518(activityC23311, C0773.m3169(strM9486) ^ 2118052800);
                    sArr3 = f75517;
                    i20 = 10;
                    if (C1080.f3865 < 0) {
                        iM31610 = (C0773.m3169("᩷ۚ") + i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM31610 ^ i11) * (-6663)) ^ 2013939560;
                        i7 = 684146407;
                        int i26 = iM31610 ^ i7;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iOException2 = iOException;
                        CheckBox checkBox3 = checkBox;
                        i14 = i26;
                        i13 = i6;
                        checkBox2 = checkBox3;
                    } else {
                        checkBox2 = checkBox;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iM2762 = C0619.m2761("ۙۚ") ^ i12;
                        i8 = ((iM2762 ^ i11) * (-29545)) ^ 54570517;
                        i9 = -1416455646;
                        i14 = iM2762 ^ i9;
                        i13 = i8;
                        iOException2 = iOException;
                    }
                    break;
                case -1263849943:
                case 680792317:
                    C1519.m5403();
                    if (C13473.f42873 == 0) {
                        iM31611 = C0773.m3169("۟ܶ") ^ i11;
                        i5 = ((iM31611 ^ i12) * (-5347)) ^ (-1618213331);
                        i10 = -1982547742;
                        i14 = iM31611 ^ i10;
                        i13 = i5;
                    } else {
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i21 = i21;
                        sArr3 = sArr3;
                        iM3169 = C0619.m2761("ۜܳ") ^ i12;
                        i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                        i2 = 297928596;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i21 = i21;
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        activityC23311 = this;
                    }
                    break;
                case -1182259031:
                case 976594638:
                    C1080.m4050();
                    if (!C13473.m33144()) {
                        checkBox = checkBox2;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        iOException = iOException2;
                        sArr = sArr3;
                        iM2761 = (C0773.m3169("֫ܳ") + i11) * 55;
                        i3 = ((iM2761 ^ i12) * (-5369)) ^ 1932683441;
                        i4 = 1790068442;
                        int i27 = iM2761 ^ i4;
                        sArr3 = sArr;
                        checkBox2 = checkBox;
                        iOException2 = iOException;
                        i14 = i27;
                        i13 = i3;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                    } else {
                        checkBox = checkBox2;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        iOException = iOException2;
                        iM31610 = (i11 - C0619.m2761("ۨۡ")) * 77;
                        i6 = ((iM31610 ^ i12) * (-5951)) ^ (-1362581139);
                        i7 = -505999022;
                        int i28 = iM31610 ^ i7;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iOException2 = iOException;
                        CheckBox checkBox4 = checkBox;
                        i14 = i28;
                        i13 = i6;
                        checkBox2 = checkBox4;
                    }
                    break;
                case -1150938451:
                case 2073932993:
                    AbstractC0641.m2810(checkBox2, onCheckedChangeListener2);
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    activityC23311.f56046.setSubtitle(C0773.m3168(C13473.m33143(this), C3779.m12266(f75517, 19, 5, i18)));
                    iM31610 = C0619.m2761("᩶ᩳ") ^ i12;
                    i6 = ((iM31610 ^ i11) * (-8979)) ^ (-891759420);
                    i7 = -1931015410;
                    int i29 = iM31610 ^ i7;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    iOException2 = iOException;
                    CheckBox checkBox5 = checkBox;
                    i14 = i29;
                    i13 = i6;
                    checkBox2 = checkBox5;
                    break;
                case -1044603833:
                case -209219405:
                    activityC23311.m40402((Throwable) iOException2, true);
                    break;
                case -1012692827:
                case 2040557331:
                    break;
                case -993093717:
                case 1764494437:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    AbstractC0116.m1238(this);
                    C1321.m4850(activityC23311.f56046, new ViewOnClickListenerC17343(activityC23311, 0));
                    if (C4282.f15546 > 0) {
                        iM2761 = C0619.m2761("ۛۡ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-13703)) ^ 1158224317;
                        i4 = -974064077;
                        int i210 = iM2761 ^ i4;
                        sArr3 = sArr;
                        checkBox2 = checkBox;
                        iOException2 = iOException;
                        i14 = i210;
                        i13 = i3;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                    } else {
                        sArr3 = sArr;
                        checkBox2 = checkBox;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iM2762 = C0619.m2761("ۙۚ") ^ i12;
                        i8 = ((iM2762 ^ i11) * (-29545)) ^ 54570517;
                        i9 = -1416455646;
                        i14 = iM2762 ^ i9;
                        i13 = i8;
                        iOException2 = iOException;
                    }
                    break;
                case -868832641:
                case -171713897:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    seekBar2 = (SeekBar) C2878.m9476(activityC23311, C0773.m3169(C3690.m11996(sArr, i20, 3, i18)) ^ 2123557309);
                    sArr4 = f75517;
                    i17 = 13;
                    i15 = 3;
                    if (C13473.m33144()) {
                        iM2761 = (C0619.m2761("۬۟") ^ i12) * (-37);
                        i3 = ((iM2761 ^ i11) * (-12603)) ^ 1908175890;
                        i4 = 693032394;
                    } else {
                        iM2761 = (C0773.m3169("֫ܳ") + i11) * 55;
                        i3 = ((iM2761 ^ i12) * (-5369)) ^ 1932683441;
                        i4 = 1790068442;
                    }
                    int i211 = iM2761 ^ i4;
                    sArr3 = sArr;
                    checkBox2 = checkBox;
                    iOException2 = iOException;
                    i14 = i211;
                    i13 = i3;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    break;
                case -807972115:
                case -97168485:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    short[] sArr6 = sArr2;
                    int i30 = i21;
                    C16390 c16390 = (C16390) C2878.m9476(activityC23311, C0773.m3169(C1321.m4861(sArr6, i30, 3, i18)) ^ 2104340156);
                    activityC23311.f56046 = c16390;
                    C2375.m8067(activityC23311, c16390);
                    if (!C3099.m10095()) {
                        int iM2765 = (i12 - C0619.m2761("᩹᩺")) * 99;
                        i5 = ((iM2765 ^ i11) * (-23993)) ^ (-156891102);
                        sArr3 = sArr;
                        sArr2 = sArr6;
                        i21 = i30;
                        checkBox2 = checkBox;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iOException2 = iOException;
                        i14 = iM2765 ^ (-490340919);
                        i13 = i5;
                    } else {
                        sArr2 = sArr6;
                        i21 = i30;
                        iM2761 = (C0773.m3169("֫ܳ") + i11) * 55;
                        i3 = ((iM2761 ^ i12) * (-5369)) ^ 1932683441;
                        i4 = 1790068442;
                        int i212 = iM2761 ^ i4;
                        sArr3 = sArr;
                        checkBox2 = checkBox;
                        iOException2 = iOException;
                        i14 = i212;
                        i13 = i3;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                    }
                    break;
                case -666755526:
                case 757209506:
                    i18 = 8760;
                    iM3169 = (C0619.m2761("ۘ᩷") ^ i11) * (-29);
                    i = ((iM3169 ^ i12) * (-18279)) ^ 89028570;
                    i2 = -1663713939;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                case -319978713:
                case 77951871:
                    if (!RunnableC1848.f6235) {
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i21 = i21;
                        sArr3 = sArr3;
                        iM3169 = C0619.m2761("ۜܳ") ^ i12;
                        i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                        i2 = 297928596;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i21 = i21;
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        activityC23311 = this;
                    } else {
                        checkBox = checkBox2;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        iOException = iOException2;
                        iM31610 = (i11 - C0619.m2761("ۨۡ")) * 77;
                        i6 = ((iM31610 ^ i12) * (-5951)) ^ (-1362581139);
                        i7 = -505999022;
                        int i213 = iM31610 ^ i7;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        iOException2 = iOException;
                        CheckBox checkBox6 = checkBox;
                        i14 = i213;
                        i13 = i6;
                        checkBox2 = checkBox6;
                    }
                    break;
                case -317130239:
                case 517056314:
                    C1783.m6232();
                    if (C3690.f12684 <= 0) {
                        iM31611 = C0773.m3169("ۜ᩸") ^ i12;
                        i5 = ((iM31611 ^ i11) * (-10389)) ^ (-443706817);
                        i10 = -1637414480;
                        i14 = iM31611 ^ i10;
                        i13 = i5;
                    } else {
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i21 = i21;
                        sArr3 = sArr3;
                        iM3169 = C0619.m2761("ۜܳ") ^ i12;
                        i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                        i2 = 297928596;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i21 = i21;
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        activityC23311 = this;
                    }
                    break;
                case -310170471:
                case -132956662:
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    if ((s * s2) - ((s * s) + 35521600) > 0) {
                        iM3169 = (C0619.m2761("ܶܿ") ^ i12) * (-35);
                        i = ((iM3169 ^ i11) * (-3781)) ^ (-1928936972);
                        i2 = -27806298;
                    } else {
                        iM3169 = (C0773.m3169("֫ۜ") + i11) * 81;
                        i = ((iM3169 ^ i12) * 12489) ^ (-72604903);
                        i2 = -1070446295;
                    }
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                case -103938376:
                case 630780728:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    seekBar = (SeekBar) C2878.m9476(activityC23311, C0773.m3169(C1542.m5471(sArr4, i17, i15, i18)) ^ 2121296325);
                    sArr5 = f75517;
                    i19 = 16;
                    i16 = 3;
                    if (C11235.f35427 >= 0) {
                        iM31610 = (i11 - C0619.m2761("ۨۡ")) * 77;
                        i6 = ((iM31610 ^ i12) * (-5951)) ^ (-1362581139);
                        i7 = -505999022;
                    } else {
                        iM31610 = C0619.m2761("۠֫") ^ i11;
                        i6 = ((iM31610 ^ i12) * 9633) ^ 736232623;
                        i7 = -1980192600;
                    }
                    int i214 = iM31610 ^ i7;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    iOException2 = iOException;
                    CheckBox checkBox7 = checkBox;
                    i14 = i214;
                    i13 = i6;
                    checkBox2 = checkBox7;
                    break;
                case 20164307:
                case 452394045:
                    if (RunnableC0334.f1808 > 0) {
                        iM31611 = C0773.m3169("ۜ᩸") ^ i12;
                        i5 = ((iM31611 ^ i11) * (-10389)) ^ (-443706817);
                        i10 = -1637414480;
                    } else {
                        iM31611 = C0619.m2761("ܿᩴ") ^ i12;
                        i5 = ((iM31611 ^ i11) * (-17301)) ^ (-125429057);
                        i10 = -1824253127;
                    }
                    i14 = iM31611 ^ i10;
                    i13 = i5;
                    break;
                case 173883105:
                case 1329629619:
                    checkBox = checkBox2;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException = iOException2;
                    sArr = sArr3;
                    C1564.m5518(activityC23311, iM2764 ^ 2123457722);
                    sArr2 = f75517;
                    i21 = 4;
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("֫ܳ") + i11) * 55;
                        i3 = ((iM2761 ^ i12) * (-5369)) ^ 1932683441;
                        i4 = 1790068442;
                    } else {
                        iM2761 = C0619.m2761("ۗ᩹") ^ i12;
                        i3 = ((iM2761 ^ i11) * 17387) ^ 144786691;
                        i4 = -788957796;
                    }
                    int i215 = iM2761 ^ i4;
                    sArr3 = sArr;
                    checkBox2 = checkBox;
                    iOException2 = iOException;
                    i14 = i215;
                    i13 = i3;
                    onCheckedChangeListener2 = onCheckedChangeListener;
                    break;
                case 1674564826:
                case 2106666184:
                    C2878.m9491();
                    if (C20932.f66974 <= 0) {
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i21 = i21;
                        sArr3 = sArr3;
                        iM3169 = (C0619.m2761("᩸ܳ") ^ i12) * 97;
                        i = ((iM3169 ^ i11) * 26611) ^ (-1481567862);
                        i2 = 1013864705;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i21 = i21;
                        checkBox2 = checkBox2;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        iOException2 = iOException2;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        activityC23311 = this;
                    }
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    iM3169 = C0619.m2761("ۜܳ") ^ i12;
                    i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                    i2 = 297928596;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
                default:
                    AbstractC3624.m11755();
                    C2354.m7983();
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    iM3169 = C0619.m2761("ۜܳ") ^ i12;
                    i = ((iM3169 ^ i11) * 8135) ^ 1404608464;
                    i2 = 297928596;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i21 = i21;
                    checkBox2 = checkBox2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    iOException2 = iOException2;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    activityC23311 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0295 A[PHI: r2 r3 r4 r9 r17 r22
      0x0295: PHI (r2v3 android.view.MenuItem) = (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v4 android.view.MenuItem) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r22v20 int) = (r22v11 int), (r22v19 int), (r22v21 int) binds: [B:64:0x0293, B:37:0x0142, B:34:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02cd A[PHI: r8 r16 r18 r22 r23
      0x02cd: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:68:0x02cb, B:61:0x0260, B:41:0x0165, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:68:0x02cb, B:61:0x0260, B:41:0x0165, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r18v10 short) = (r18v2 short), (r18v4 short), (r18v2 short), (r18v2 short) binds: [B:68:0x02cb, B:61:0x0260, B:41:0x0165, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r22v24 int) = (r22v10 int), (r22v12 int), (r22v18 int), (r22v27 int) binds: [B:68:0x02cb, B:61:0x0260, B:41:0x0165, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r23v7 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:68:0x02cb, B:61:0x0260, B:41:0x0165, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5 = C1564.f5401;
        int i6 = C2288.f7433;
        int iM2762 = C0619.m2761("ۢܰ") ^ i5;
        int i7 = ((iM2762 ^ i6) * 28095) ^ (-1822768734);
        MenuItem menuItemM13541 = null;
        String strM8069 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM2762 ^ (-1546774016);
        int i9 = 0;
        int iM2763 = 0;
        int iM31610 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 1482403534;
        int i18 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * (-9651)) >> 31));
            switch (i17) {
                case -1849127658:
                case -87477213:
                    C3998.m12920();
                    i9 = i9;
                    iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                    i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                    i4 = -1151625588;
                    int i19 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i19;
                    break;
                case -1652126765:
                case -1446356711:
                    i9 = i9;
                    int i20 = i14 + i15;
                    if (i13 - (i20 + i20) > 0) {
                        iM2761 = (C0773.m3169("۟᩵") ^ i6) * (-57);
                        i3 = ((iM2761 ^ i5) * 951) ^ (-14410441);
                        i4 = -1455367406;
                    } else {
                        iM2761 = C0619.m2761("ۢܽ") ^ i5;
                        i3 = ((iM2761 ^ i6) * (-26267)) ^ (-1767772909);
                        i4 = -454320907;
                    }
                    int i110 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i110;
                    break;
                case -1635999267:
                case 1891832295:
                    i16 = 1375;
                    iM2761 = C0773.m3169("ۖܰ") ^ i5;
                    i3 = ((iM2761 ^ i6) * (-4239)) ^ 93079712;
                    i4 = 1855522862;
                    int i111 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i111;
                    break;
                case -1524742814:
                case -830575073:
                    C0269.m1775();
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("֨۠") ^ i5;
                        i9 = i9;
                        i3 = ((iM2761 ^ i6) * (-12557)) ^ 416340724;
                        i4 = -1669791491;
                        int i112 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i112;
                    }
                    i9 = i9;
                    iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                    i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                    i4 = -1151625588;
                    int i113 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i113;
                    break;
                case -1510846621:
                case -653702393:
                    C3448.m11248();
                    C3734.m12152();
                    return false;
                case -1331960186:
                case -1050346219:
                    iM31610 = C0773.m3169(strM8069);
                    i10 = 2101031900;
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("ۙܺ") ^ i5;
                        i = ((iM3169 ^ i6) * (-22127)) ^ 2144369624;
                        i2 = 1172981766;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                        i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                        i4 = -1151625588;
                        int i114 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i114;
                    }
                    break;
                case -1119354179:
                case 273417727:
                    i9 = i9;
                    c = 24;
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0619.m2761("ۛۜ") + i6) * (-111);
                        i3 = ((iM2761 ^ i5) * 28293) ^ 632614407;
                        i4 = 209483791;
                    } else {
                        iM2761 = C0773.m3169("ᩴۤ") ^ i5;
                        i3 = ((iM2761 ^ i6) * (-1815)) ^ 584606683;
                        i4 = 1158158649;
                    }
                    int i115 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i115;
                    break;
                case -927052251:
                case 989515001:
                    i9 = i9;
                    iM2763 = C0619.m2761(C4282.m13650(sArr2, i11, i12, i16));
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("ۛۜ") + i6) * (-111);
                        i3 = ((iM2761 ^ i5) * 28293) ^ 632614407;
                        i4 = 209483791;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۖ۬")) * 55;
                        i3 = ((iM2761 ^ i6) * 20819) ^ 623980822;
                        i4 = -1662968665;
                    }
                    int i116 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i116;
                    break;
                case -913867117:
                case 336474759:
                    sArr2 = f75517;
                    i11 = 25;
                    if (C3998.f13671 != 0) {
                        i9 = 0;
                        iM2761 = C0773.m3169("֨۠") ^ i5;
                        i9 = i9;
                        i3 = ((iM2761 ^ i6) * (-12557)) ^ 416340724;
                        i4 = -1669791491;
                        int i117 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i117;
                    } else {
                        int iM31611 = C0773.m3169("᩶۫") ^ i6;
                        i8 = iM31611 ^ (-1636167281);
                        i7 = ((iM31611 ^ i5) * (-11501)) ^ (-1017835271);
                        i9 = 0;
                    }
                    break;
                case -896309796:
                case -873801576:
                    int i21 = 2129702304 ^ iM2763;
                    menuItemM13541 = C4238.m13541(menu, i9, i21, i9, i21);
                    sArr3 = f75517;
                    if (C4238.f15451 >= 0) {
                        i9 = i9;
                        iM2761 = (C0619.m2761("ۛۜ") + i6) * (-111);
                        i3 = ((iM2761 ^ i5) * 28293) ^ 632614407;
                        i4 = 209483791;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۚᩴ")) * (-23);
                        i9 = i9;
                        i3 = ((iM2761 ^ i6) * (-16877)) ^ 396688794;
                        i4 = -793011158;
                    }
                    int i118 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i118;
                    break;
                case -829207451:
                case 751547051:
                    strM8069 = C2375.m8069(sArr3, 28, 3, i16);
                    if (C0862.f3233 == 0) {
                        iM3169 = (i6 - C0773.m3169("ܽۗ")) * (-35);
                        i = ((iM3169 ^ i5) * (-22413)) ^ (-1928146209);
                        i2 = 1333839394;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2761 = (C0619.m2761("ۛۜ") + i6) * (-111);
                        i3 = ((iM2761 ^ i5) * 28293) ^ 632614407;
                        i4 = 209483791;
                        int i119 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i119;
                    }
                    break;
                case -648468675:
                case 759851839:
                    i9 = i9;
                    sArr = f75517;
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i5) * 43;
                        i3 = ((iM2761 ^ i6) * (-12337)) ^ (-1466971699);
                        i4 = 843058287;
                    } else {
                        iM2761 = C0619.m2761("ۚۨ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 23799) ^ 298914338;
                        i4 = -551878994;
                    }
                    int i1110 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1110;
                    break;
                case -480557729:
                case -64287257:
                    i9 = i9;
                    i12 = 3;
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i5) * 43;
                        i3 = ((iM2761 ^ i6) * (-12337)) ^ (-1466971699);
                        i4 = 843058287;
                    } else {
                        iM2761 = (C0773.m3169("ۗ᩵") + i6) * (-15);
                        i3 = ((iM2761 ^ i5) * (-19701)) ^ (-911760556);
                        i4 = 131822802;
                    }
                    int i1111 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1111;
                    break;
                case -420587658:
                case 224314016:
                    C2023.m6964();
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۢ۬")) * 37;
                        i = ((iM3169 ^ i5) * 16331) ^ (-1045504847);
                        i2 = -814289508;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                        i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                        i4 = -1151625588;
                        int i1112 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i1112;
                    }
                    break;
                case -168724413:
                case 325224266:
                    i9 = i9;
                    i13 = i18 * i18;
                    i14 = s * s;
                    i15 = 279658729;
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                        i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                        i4 = -1151625588;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۙۨ")) * 73;
                        i3 = ((iM2761 ^ i5) * 18129) ^ 484205047;
                        i4 = -1595613177;
                    }
                    int i1113 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1113;
                    break;
                case -32240905:
                case 1383970705:
                    RunnableC3646.m11813();
                    if (C1146.m4231()) {
                        i9 = i9;
                        iM2761 = (C0619.m2761("ܳۧ") ^ i5) * 43;
                        i3 = ((iM2761 ^ i6) * (-12337)) ^ (-1466971699);
                        i4 = 843058287;
                        int i1114 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i1114;
                    }
                    i9 = i9;
                    iM2761 = C0773.m3169("ܽᩳ") ^ i6;
                    i3 = ((iM2761 ^ i5) * (-25709)) ^ 344225868;
                    i4 = -1151625588;
                    int i1115 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1115;
                    break;
                case 1065185844:
                case 1242168115:
                    C1080.m4061(menuItemM13541, iM31610 ^ i10).setShowAsAction(2);
                    return true;
                case 1067238010:
                case 1216227055:
                    i9 = i9;
                    short s2 = sArr[c];
                    int i22 = s2 + 16723;
                    if (C2485.f7950 != 0) {
                        s = s2;
                        i18 = i22;
                        iM2761 = (C0619.m2761("ܳۧ") ^ i5) * 43;
                        i3 = ((iM2761 ^ i6) * (-12337)) ^ (-1466971699);
                        i4 = 843058287;
                        int i1116 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i1116;
                    } else {
                        int iM2764 = C0619.m2761("ܺ۫") ^ i5;
                        i7 = ((iM2764 ^ i6) * (-11171)) ^ (-125523894);
                        i18 = i22;
                        i9 = i9;
                        i8 = iM2764 ^ 1777696776;
                        s = s2;
                    }
                    break;
                default:
                    i16 = 47440;
                    iM2761 = C0773.m3169("ۖܰ") ^ i5;
                    i3 = ((iM2761 ^ i6) * (-4239)) ^ 93079712;
                    i4 = 1855522862;
                    int i1117 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1117;
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        AbstractC22044 abstractC22044 = null;
        int i = -1127000944;
        int i2 = C2288.f7433;
        int i3 = C2419.f7754;
        int iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
        int i4 = ((iM3169 ^ i2) * 18697) ^ (-1766777853);
        int i5 = 1303659757;
        while (true) {
            i = ((((i ^ i2) * (-30947)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2009322691:
                case -1830449243:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۧۘ") ^ i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-4209)) ^ (-503197644);
                        i5 = 1347333859;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩸") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * 9573) ^ (-548973058);
                        i5 = 509117897;
                    }
                    break;
                case -1910610169:
                case 2048783266:
                    C1783.m6232();
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4441)) ^ (-1901676074);
                        i5 = -1180075394;
                    } else {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    }
                    break;
                case -1687447773:
                case -580091999:
                    C2023.m6964();
                    C2288.m7767();
                    iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                    i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                    i5 = -933864984;
                    break;
                case -1491450588:
                case 1458236398:
                    if (C3998.m12920()) {
                        iM3169 = C0619.m2761("᩻᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31445) ^ (-1084863544);
                        i5 = 315958341;
                    } else {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12405) ^ (-1199244347);
                        i5 = -113677342;
                    }
                    break;
                case -1051124060:
                case 2004697600:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤۙ")) * (-45);
                        i4 = ((iM3169 ^ i2) * 23675) ^ (-239873986);
                        i5 = -1845742358;
                    }
                    break;
                case -977220634:
                case 304981731:
                    super.finish();
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    } else {
                        iM3169 = C0773.m3169("᩷ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1823)) ^ 1732890112;
                        i5 = 795789939;
                    }
                    break;
                case -623967662:
                case 959360690:
                    C0773.m3161();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4441)) ^ (-1901676074);
                        i5 = -1180075394;
                    } else {
                        iM3169 = C0619.m2761("۬۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28807) ^ 934914009;
                        i5 = -227872933;
                    }
                    break;
                case -604263377:
                case 2010659876:
                    if (C3779.f12953 > 0) {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12405) ^ (-1199244347);
                        i5 = -113677342;
                    } else {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    }
                    break;
                case -426406665:
                case 1479772323:
                    break;
                case -249214677:
                case 1887718468:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12405) ^ (-1199244347);
                        i5 = -113677342;
                    } else {
                        iM3169 = C0619.m2761("ܳ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1813) ^ 534001660;
                        i5 = 1655211510;
                    }
                    break;
                case -60544549:
                case 499005159:
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("ܳ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26729) ^ 1528797266;
                        i5 = -303335216;
                    } else {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    }
                    break;
                case 16402046:
                case 658065832:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    } else {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * 97;
                        i4 = ((iM3169 ^ i2) * (-22371)) ^ 1440987952;
                        i5 = -283490973;
                    }
                    break;
                case 18880633:
                case 1875129793:
                    abstractC22044.mo4287();
                    iM3169 = (C0619.m2761("֡ۚ") ^ i2) * (-23);
                    i4 = ((iM3169 ^ i3) * (-32093)) ^ 1382079774;
                    i5 = -872321709;
                    break;
                case 249290593:
                case 710618637:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12405) ^ (-1199244347);
                        i5 = -113677342;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩹᩷")) * (-107);
                        i4 = ((iM3169 ^ i2) * (-20687)) ^ 715144725;
                        i5 = 906834552;
                    }
                    break;
                case 661077317:
                case 2044826569:
                    abstractC22044 = this.f75519;
                    if (abstractC22044 != null) {
                        iM3169 = (i3 - C0773.m3169("ۢ֫")) * (-15);
                        i4 = ((iM3169 ^ i2) * 23893) ^ (-1585399260);
                        i5 = 1858882480;
                    } else {
                        iM3169 = (C0619.m2761("֡ۚ") ^ i2) * (-23);
                        i4 = ((iM3169 ^ i3) * (-32093)) ^ 1382079774;
                        i5 = -872321709;
                    }
                    break;
                case 1221136667:
                case 1362359211:
                    C0619.m2763();
                    C2023.m6964();
                    break;
                case 1389728634:
                case 1514077461:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12405) ^ (-1199244347);
                        i5 = -113677342;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i2) * 33;
                        i4 = ((iM3169 ^ i3) * 26313) ^ 595652427;
                        i5 = 1356207470;
                    }
                    break;
                default:
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0619.m2761("ܰ᩻") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 12755) ^ (-1456017654);
                        i5 = -933864984;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩷") + i2) * 71;
                        i4 = ((iM3169 ^ i3) * (-1613)) ^ 1930389358;
                        i5 = 1867850609;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[PHI: r1 r10 r12
      0x0115: PHI (r1v59 int) = (r1v36 int), (r1v46 int), (r1v2 int) binds: [B:38:0x0113, B:31:0x00d2, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:38:0x0113, B:31:0x00d2, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:38:0x0113, B:31:0x00d2, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0200 A[PHI: r4 r5 r7 r11 r16
      0x0200: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:61:0x01fe, B:53:0x01bd, B:34:0x00f2, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:61:0x01fe, B:53:0x01bd, B:34:0x00f2, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:61:0x01fe, B:53:0x01bd, B:34:0x00f2, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:61:0x01fe, B:53:0x01bd, B:34:0x00f2, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r16v21 int) = (r16v4 int), (r16v7 int), (r16v14 int), (r16v22 int) binds: [B:61:0x01fe, B:53:0x01bd, B:34:0x00f2, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0236 A[PHI: r3 r6 r16
      0x0236: PHI (r3v4 char) = (r3v3 char), (r3v2 char) binds: [B:65:0x0234, B:57:0x01dd] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:65:0x0234, B:57:0x01dd] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r16v5 int) = (r16v3 int), (r16v6 int) binds: [B:65:0x0234, B:57:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0266 A[PHI: r2 r8 r16
      0x0266: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:69:0x0264, B:49:0x019e, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:69:0x0264, B:49:0x019e, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r16v20 int) = (r16v2 int), (r16v8 int), (r16v23 int) binds: [B:69:0x0264, B:49:0x019e, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (l.C2310.f7472 < 0) goto L10;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r20) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC23311.onOptionsItemSelected(android.view.MenuItem):boolean");
    }
}
