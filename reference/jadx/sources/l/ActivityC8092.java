package l;

import android.content.Intent;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y62B */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC8092 extends AbstractActivityC5788 {

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f28345;

    /* JADX INFO: renamed from: ۡᩳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f28346 = {3762, -27524, -27526, -27543, -27546, -27525, -27591, 7695, -28005, -28022, -28024, -28032, -28022, -28020, -28018, -27995, -28022, -28026, -28018, 2361, -11070, -11045, -11026, -11025, -11049, -11023, -11038, -11027, -11024, -11025, -11038, -11017, -11030, -11028, -11027, -11058, -11028, -11033, -11034};

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28347 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f28348;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28349;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public String f28350;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
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
        int i7 = 1317480291;
        int i8 = C1977.f7413;
        int i9 = C1937.f7317;
        int iM45029 = (C19806.m45029("ۢᩳ") + i8) * 59;
        int i10 = ((iM45029 ^ i9) * (-15059)) ^ (-1801765667);
        int i11 = 2023424202;
        while (true) {
            i7 = ((((i7 ^ i9) * (-25213)) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -2005281762:
                case 736929202:
                    i2 = i * i;
                    i3 = s * s;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i8) * (-125);
                        i10 = ((iM45029 ^ i9) * (-32561)) ^ 1841647534;
                        i11 = -941464549;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۨܿ")) * (-63);
                        i10 = ((iM45029 ^ i8) * (-16221)) ^ (-1628750100);
                        i11 = -1724493386;
                    }
                    break;
                case -1968400081:
                case -203728876:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("֡ܶ") ^ i8) * 7;
                        i10 = ((iM45029 ^ i9) * 18717) ^ 1850027449;
                        i11 = -65405199;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") ^ i9) * (-113);
                        i10 = ((iM45029 ^ i8) * (-9071)) ^ 1295002579;
                        i11 = -371433624;
                    }
                    break;
                case -1668261717:
                case 692238767:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 >= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("۟ۤ")) * (-89);
                        i10 = ((iM45029 ^ i8) * (-18025)) ^ 634793400;
                        i11 = 390897093;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܿ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 2525) ^ 1884137139;
                        i11 = -1718991959;
                    }
                    break;
                case -1625714083:
                case -1407547790:
                    sArr = f28346;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ۘ۫") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-24401)) ^ (-2011403266);
                        i11 = -1263330815;
                    } else {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 31733) ^ (-100139972);
                        i11 = 409212443;
                    }
                    break;
                case -1513692279:
                case 755685006:
                    return C1419.m4969(sArr2, i6, 19, i5);
                case -1371997465:
                case -1108181086:
                    C1066.m4023();
                    if (!C1977.m6356()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") ^ i9) * (-113);
                        i10 = ((iM45029 ^ i8) * (-9071)) ^ 1295002579;
                        i11 = -371433624;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i8) * (-125);
                        i10 = ((iM45029 ^ i9) * (-32561)) ^ 1841647534;
                        i11 = -941464549;
                    }
                    break;
                case -1312954950:
                case 1709425440:
                    i4 = 564001;
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 31733) ^ (-100139972);
                        i11 = 409212443;
                    } else {
                        iM45029 = (C19806.m45029("ۙۧ") + i8) * 49;
                        i10 = ((iM45029 ^ i9) * 12443) ^ 1855238369;
                        i11 = -1702911043;
                    }
                    break;
                case -1286093424:
                case -778396264:
                    s = sArr[c];
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ۧۜ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-14195)) ^ (-732028855);
                        i11 = 1448007194;
                    } else {
                        iM45029 = (i9 - C19806.m45029("᩷ۡ")) * (-55);
                        i10 = ((iM45029 ^ i8) * (-5533)) ^ 1140907054;
                        i11 = 674758125;
                    }
                    break;
                case -1115696528:
                case 516348639:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i8) * (-125);
                        i10 = ((iM45029 ^ i9) * (-32561)) ^ 1841647534;
                        i11 = -941464549;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۗܿ")) * 3;
                        i10 = ((iM45029 ^ i8) * (-21103)) ^ 1796803660;
                        i11 = 822865662;
                    }
                    break;
                case -1036130394:
                case 89654925:
                    C1875.m6086();
                    iM45029 = (ThreadFactoryC3888.m11306("᩹۟") ^ i9) * (-113);
                    i10 = ((iM45029 ^ i8) * (-9071)) ^ 1295002579;
                    i11 = -371433624;
                    break;
                case -932971175:
                case 2110938455:
                    sArr2 = f28346;
                    i6 = 20;
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 31733) ^ (-100139972);
                        i11 = 409212443;
                    } else {
                        iM45029 = C19806.m45029("۬ܶ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 11315) ^ 1573629182;
                        i11 = -138173497;
                    }
                    break;
                case -707412146:
                case 1916202337:
                    i5 = 1465;
                    iM45029 = (i8 - ThreadFactoryC3888.m11306("᩻ۡ")) * 13;
                    i10 = ((iM45029 ^ i9) * (-8295)) ^ 1922185565;
                    i11 = -495121409;
                    break;
                case 193467857:
                case 754069117:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 31733) ^ (-100139972);
                        i11 = 409212443;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۟") ^ i8) * (-11);
                        i10 = ((iM45029 ^ i9) * (-26621)) ^ (-1607401073);
                        i11 = 1728116690;
                    }
                    break;
                case 402791768:
                case 882613686:
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 31733) ^ (-100139972);
                        i11 = 409212443;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") ^ i9) * (-113);
                        i10 = ((iM45029 ^ i8) * (-9071)) ^ 1295002579;
                        i11 = -371433624;
                    }
                    break;
                case 424834349:
                case 1059696303:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    RunnableC1606.m5473();
                    return null;
                case 462258849:
                case 478872189:
                    i5 = 54403;
                    iM45029 = (i8 - ThreadFactoryC3888.m11306("᩻ۡ")) * 13;
                    i10 = ((iM45029 ^ i9) * (-8295)) ^ 1922185565;
                    i11 = -495121409;
                    break;
                case 1427052647:
                case 1594864767:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") ^ i9) * (-113);
                        i10 = ((iM45029 ^ i8) * (-9071)) ^ 1295002579;
                        i11 = -371433624;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 6133) ^ (-1347095800);
                        i11 = 2129954948;
                    }
                    break;
                case 1648154149:
                case 1929609110:
                    i = s + 751;
                    if (C3743.f13569) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܳ֨")) * (-97);
                        i10 = ((iM45029 ^ i9) * (-20315)) ^ 996183136;
                        i11 = 1682952623;
                    } else {
                        iM45029 = C19806.m45029("ۧۜ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-14195)) ^ (-732028855);
                        i11 = 1448007194;
                    }
                    break;
                default:
                    c = 19;
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i8;
                        i10 = ((iM45029 ^ i9) * 19273) ^ 1210865026;
                        i11 = -2086670385;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i8) * (-125);
                        i10 = ((iM45029 ^ i9) * (-32561)) ^ 1841647534;
                        i11 = -941464549;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۙ */
    public final void mo1989(final RunnableC18488 runnableC18488) {
        final ArrayList arrayListM15958 = null;
        String str = null;
        int i = 1978042574;
        int i2 = C1066.f4915;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("ۜܿ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-19257)) ^ (-953310490);
        int i5 = -952669357;
        while (true) {
            i = ((((i ^ i3) * 21883) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2136027920:
                case -748752443:
                    arrayListM15958 = m15958();
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27057) ^ (-468935713);
                        i5 = 1646245249;
                    }
                    break;
                case -2009824016:
                case -1666321526:
                    C2788.m8472();
                    if (!RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28243)) ^ (-745721304);
                        i5 = 81500172;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۨ") ^ i3) * (-3);
                        i4 = ((iM45029 ^ i2) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ 76460499;
                        i5 = 1357105162;
                    }
                    break;
                case -2008224937:
                case -1486599840:
                    if (!C3743.f13569) {
                        iM45029 = (C19806.m45029("᩻ۨ") ^ i3) * (-3);
                        i4 = ((iM45029 ^ i2) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ 76460499;
                        i5 = 1357105162;
                    } else {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    }
                    break;
                case -1567909410:
                case -718024315:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    } else {
                        iM45029 = C19806.m45029("ܳ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19997) ^ (-1791986995);
                        i5 = 833243197;
                    }
                    break;
                case -1525824550:
                case 266781322:
                    C11005.m27761(new InterfaceC17354(this) { // from class: l.ۘۢۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ActivityC8092 f14412;

                        {
                            int i6 = -261181993;
                            int i7 = C3577.f13150;
                            int i8 = C1937.f7317;
                            int iM450210 = C19806.m45029("ۧۜ") ^ i8;
                            int i9 = ((iM450210 ^ i7) * 8275) ^ (-460893458);
                            int i10 = 1696862051;
                            while (true) {
                                i6 = ((((i6 ^ i7) * (-19253)) >> 31) & i9) ^ (iM450210 ^ i10);
                                switch (i6) {
                                    case -2125922007:
                                    case 1677342022:
                                        if (C2642.m8171() == 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("۫ۧ") + i8) * (-27);
                                            i9 = ((iM450210 ^ i7) * 31505) ^ (-815041098);
                                            i10 = 1009018452;
                                        } else {
                                            iM450210 = C19806.m45029("ۤ᩻") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-12165)) ^ 389123717;
                                            i10 = 1474434331;
                                        }
                                        break;
                                    case -1902598437:
                                    case 1869818116:
                                        this.f14412 = this;
                                        if (C3660.f13403 >= 0) {
                                            iM450210 = C19806.m45029("ܰ֨") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-27321)) ^ 2147200251;
                                            i10 = -1142443023;
                                        } else {
                                            iM450210 = (i8 - C19806.m45029("ܽۡ")) * 55;
                                            i9 = ((iM450210 ^ i7) * (-5585)) ^ 2138980466;
                                            i10 = 177230562;
                                        }
                                        break;
                                    case -1865822691:
                                    case -95086255:
                                        if (C7105.f23796 >= 0) {
                                            iM450210 = (C19806.m45029("ܶ۟") + i7) * 19;
                                            i9 = ((iM450210 ^ i8) * 20597) ^ (-1867390043);
                                            i10 = 1508500426;
                                        } else {
                                            iM450210 = C19806.m45029("ᩴ᩸") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-4463)) ^ (-333096363);
                                            i10 = 1938325401;
                                        }
                                        break;
                                    case -1741208464:
                                    case 1096138879:
                                        return;
                                    case -1535248905:
                                    case 1587366579:
                                        if (C0278.f1572 <= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        } else {
                                            iM450210 = (i7 - C19806.m45029("ܺ᩵")) * 59;
                                            i9 = ((iM450210 ^ i8) * 3183) ^ (-1774198062);
                                            i10 = -1707363661;
                                        }
                                        break;
                                    case -1420330460:
                                    case -806136662:
                                        if (CallableC1627.f6528) {
                                            iM450210 = (i7 - ThreadFactoryC3888.m11306("֡۫")) * 65;
                                            i9 = ((iM450210 ^ i8) * (-17389)) ^ 1983970368;
                                            i10 = -1212490120;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        }
                                        break;
                                    case -1344546771:
                                    case -1004210949:
                                        if (C3577.m10565()) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۙܺ") + i7) * (-67);
                                            i9 = ((iM450210 ^ i8) * (-27647)) ^ 1775663139;
                                            i10 = 503906974;
                                        } else {
                                            iM450210 = C19806.m45029("ܰ֨") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-27321)) ^ 2147200251;
                                            i10 = -1142443023;
                                        }
                                        break;
                                    case -1114443957:
                                    case 556406234:
                                        C0629.m2907();
                                        if (C1377.m4833() == 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("۫ۧ") + i8) * (-27);
                                            i9 = ((iM450210 ^ i7) * 31505) ^ (-815041098);
                                            i10 = 1009018452;
                                        }
                                        break;
                                    case -931370010:
                                    case -548008814:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM450210 = C19806.m45029("ܰ֨") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-27321)) ^ 2147200251;
                                            i10 = -1142443023;
                                        } else {
                                            iM450210 = C19806.m45029("ᩴᩳ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 19753) ^ 1663911725;
                                            i10 = -1256033887;
                                        }
                                        break;
                                    case -852514977:
                                    case -162715287:
                                        RunnableC1606.m5473();
                                        C10634.m26820();
                                        throw new RuntimeException();
                                    case -805040815:
                                    case 522986137:
                                        C19806.m45024();
                                        iM450210 = C19806.m45029("ۤ᩻") ^ i7;
                                        i9 = ((iM450210 ^ i8) * (-12165)) ^ 389123717;
                                        i10 = 1474434331;
                                        break;
                                    case -610451338:
                                    case 614786622:
                                        C10634.m26820();
                                        if (!C1977.m6356()) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        } else {
                                            iM450210 = C19806.m45029("ܰ֨") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-27321)) ^ 2147200251;
                                            i10 = -1142443023;
                                        }
                                        break;
                                    case 375385667:
                                    case 1358186757:
                                        if (C2704.m8255() <= 0) {
                                            iM450210 = C19806.m45029("ܰ֨") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-27321)) ^ 2147200251;
                                            i10 = -1142443023;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("۠ᩳ") ^ i8) * 37;
                                            i9 = ((iM450210 ^ i7) * 15067) ^ 1476007571;
                                            i10 = -633467568;
                                        }
                                        break;
                                    case 542713309:
                                    case 1866599827:
                                        if (C1377.f5749) {
                                            iM450210 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-23041)) ^ (-395501739);
                                            i10 = 609213148;
                                        } else {
                                            iM450210 = (C19806.m45029("ܶ۟") + i7) * 19;
                                            i9 = ((iM450210 ^ i8) * 20597) ^ (-1867390043);
                                            i10 = 1508500426;
                                        }
                                        break;
                                    case 771753506:
                                    case 925842555:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("᩷᩸") ^ i7;
                                            i9 = ((iM450210 ^ i8) * 27843) ^ (-91766637);
                                            i10 = -1164498577;
                                        }
                                        break;
                                    default:
                                        if (C3660.f13403 >= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * 69;
                                            i9 = ((iM450210 ^ i7) * (-14751)) ^ (-678981507);
                                            i10 = -369308089;
                                        } else {
                                            iM450210 = C19806.m45029("ܶ᩹") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-13929)) ^ 833377469;
                                            i10 = -1936566765;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC17354
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo6537(Exception exc) {
                            return false;
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6536(C14558 c14558, boolean z) {
                            int i6 = 1876256937;
                            int i7 = C1460.f5948;
                            int i8 = C1977.f7413;
                            int iM450210 = (C19806.m45029("֡᩶") + i8) * 43;
                            int i9 = ((iM450210 ^ i7) * 10029) ^ (-68554039);
                            int i10 = 818879018;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 31257) >> 31) & i9) ^ (iM450210 ^ i10);
                                switch (i6) {
                                    case -2072819463:
                                    case -1175974893:
                                        C19806.m45024();
                                        break;
                                    case -1426617113:
                                    case -990127080:
                                        if (!C0797.f3386) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = C19806.m45029("᩺᩵") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-8847)) ^ 483093267;
                                            i10 = -696935866;
                                        }
                                        break;
                                    case -1377566717:
                                    case 980006414:
                                        if (C1066.m4023() <= 0) {
                                            iM450210 = (C19806.m45029("֡᩷") ^ i7) * 7;
                                            i9 = ((iM450210 ^ i8) * 2081) ^ (-805900079);
                                            i10 = 1120783656;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("᩺֡") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-31019)) ^ 1267840894;
                                            i10 = 1765638351;
                                        }
                                        break;
                                    case -1145397525:
                                    case 993732396:
                                        if (C3660.f13403 >= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = (C19806.m45029("ᩳ۫") + i8) * (-87);
                                            i9 = ((iM450210 ^ i7) * 29519) ^ 463734352;
                                            i10 = 1786915105;
                                        }
                                        break;
                                    case -1133188867:
                                    case 2119291368:
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        C3660.m10791();
                                        iM450210 = C19806.m45029("᩺᩵") ^ i8;
                                        i9 = ((iM450210 ^ i7) * (-8847)) ^ 483093267;
                                        i10 = -696935866;
                                        break;
                                    case -458734784:
                                    case 220010874:
                                        if (C0817.f3443) {
                                            iM450210 = (i7 - ThreadFactoryC3888.m11306("ܿ᩵")) * (-5);
                                            i9 = ((iM450210 ^ i8) * (-10787)) ^ (-1003187367);
                                            i10 = 644893411;
                                        } else {
                                            iM450210 = (C19806.m45029("֡᩷") ^ i7) * 7;
                                            i9 = ((iM450210 ^ i8) * 2081) ^ (-805900079);
                                            i10 = 1120783656;
                                        }
                                        break;
                                    case -379689676:
                                    case 1321752109:
                                        if (C1977.f7413 <= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ܳۘ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 4811) ^ (-401211460);
                                            i10 = 482579344;
                                        }
                                        break;
                                    case -136565639:
                                    case 173890801:
                                        if (C2477.f9839 <= 0) {
                                            iM450210 = (C19806.m45029("֡᩷") ^ i7) * 7;
                                            i9 = ((iM450210 ^ i8) * 2081) ^ (-805900079);
                                            i10 = 1120783656;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۚ۬") ^ i8) * 63;
                                            i9 = ((iM450210 ^ i7) * (-27609)) ^ (-940728315);
                                            i10 = 1191162957;
                                        }
                                        break;
                                    case 102945708:
                                    case 2139024184:
                                        C1419.m4973();
                                        if (C3660.f13403 >= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = (C19806.m45029("ۧۡ") ^ i7) * 89;
                                            i9 = ((iM450210 ^ i8) * (-11375)) ^ (-745404553);
                                            i10 = -516777365;
                                        }
                                        break;
                                    case 838106022:
                                    case 1773394663:
                                        if (C2477.m7593() >= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i7;
                                            i9 = ((iM450210 ^ i8) * 19753) ^ (-1009081103);
                                            i10 = -385125843;
                                        }
                                        break;
                                    case 1220373710:
                                    case 1315814297:
                                        int i11 = ActivityC8092.f28347;
                                        if (C1937.f7317 < 0) {
                                            ActivityC8092 activityC8092 = this.f14412;
                                            List list = arrayListM15958;
                                            RunnableC18488 runnableC18489 = runnableC18488;
                                            if (!C0526.f2219) {
                                                C2332.m7081(new C15148(activityC8092, list, c14558, z, runnableC18489));
                                            }
                                        }
                                        iM450210 = (C19806.m45029("ܳܿ") ^ i7) * (-97);
                                        i9 = ((iM450210 ^ i8) * 20145) ^ 703252438;
                                        i10 = -319110818;
                                        break;
                                    case 1321658385:
                                    case 1869177904:
                                        if (C0962.f3784) {
                                            iM450210 = (C19806.m45029("֡᩷") ^ i7) * 7;
                                            i9 = ((iM450210 ^ i8) * 2081) ^ (-805900079);
                                            i10 = 1120783656;
                                        } else {
                                            iM450210 = (i7 - C19806.m45029("ۨ֡")) * (-107);
                                            i9 = ((iM450210 ^ i8) * (-30705)) ^ 79098588;
                                            i10 = -498294897;
                                        }
                                        break;
                                    case 1954304413:
                                    case 2018100187:
                                        if (C3535.m10431() <= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-1903)) ^ (-1486745271);
                                            i10 = -2086879227;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ܽ۠") + i7) * (-69);
                                            i9 = ((iM450210 ^ i8) * (-23649)) ^ (-1107589920);
                                            i10 = -882379058;
                                        }
                                        break;
                                    default:
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            iM450210 = (C19806.m45029("֡᩷") ^ i7) * 7;
                                            i9 = ((iM450210 ^ i8) * 2081) ^ (-805900079);
                                            i10 = 1120783656;
                                        } else {
                                            iM450210 = C19806.m45029("᩺᩵") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-8847)) ^ 483093267;
                                            i10 = -696935866;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }, this, str);
                    break;
                case -1295157935:
                case -306259650:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (C19806.m45029("᩻ۨ") ^ i3) * (-3);
                        i4 = ((iM45029 ^ i2) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ 76460499;
                        i5 = 1357105162;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31251)) ^ (-1659933205);
                        i5 = -368083188;
                    }
                    break;
                case -1208897048:
                case -827053344:
                    str = this.f28350;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۨᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18435)) ^ (-7707565);
                        i5 = -1025994622;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29611)) ^ (-870278670);
                        i5 = 1784270918;
                    }
                    break;
                case -1065919982:
                case 1410762118:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۤ") + i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-18341)) ^ (-967556484);
                        i5 = 1560374663;
                    }
                    break;
                case -679407490:
                case -276880746:
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4513)) ^ (-314989299);
                        i5 = -2013151690;
                    }
                    break;
                case -589164754:
                case 1333329662:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28243)) ^ (-745721304);
                        i5 = 81500172;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6333) ^ (-435301766);
                        i5 = 40837610;
                    }
                    break;
                case -370304716:
                case 787942268:
                    CallableC1627.m5507();
                    iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-28243)) ^ (-745721304);
                    i5 = 81500172;
                    break;
                case 44019608:
                case 660967463:
                    if (C3577.m10565()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8183)) ^ 1635192176;
                        i5 = -1185080744;
                    } else {
                        iM45029 = C19806.m45029("ۨᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18435)) ^ (-7707565);
                        i5 = -1025994622;
                    }
                    break;
                case 108456711:
                case 1257749716:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28243)) ^ (-745721304);
                        i5 = 81500172;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۡ") + i3) * (-83);
                        i4 = ((iM45029 ^ i2) * (-30451)) ^ 375429718;
                        i5 = -1580111941;
                    }
                    break;
                case 785728677:
                case 1927116271:
                    if (C1668.f6641 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28243)) ^ (-745721304);
                        i5 = 81500172;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۟") ^ i2) * 15;
                        i4 = ((iM45029 ^ i3) * (-15187)) ^ (-911309729);
                        i5 = 536848817;
                    }
                    break;
                case 1071820541:
                case 2072184101:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i2) * 75;
                        i4 = ((iM45029 ^ i3) * (-99)) ^ 1131222800;
                        i5 = 1179924692;
                    } else {
                        iM45029 = C19806.m45029("֡ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16139)) ^ 1922682081;
                        i5 = -1226674921;
                    }
                    break;
                default:
                    C1148.m4232();
                    break;
            }
            return;
        }
    }

    public ActivityC8092() {
        ArrayList arrayList = null;
        int i = -1125857374;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C2642.f10294;
        int iM45029 = C19806.m45029("᩹ᩳ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 24443) ^ (-8749657);
        int i5 = -720829371;
        while (true) {
            i = ((((i ^ i2) * (-8453)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1972638916:
                case 208383244:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25529)) ^ 1693903070;
                        i5 = -2126749298;
                    } else {
                        iM45029 = (C19806.m45029("۠ۙ") ^ i3) * 55;
                        i4 = ((iM45029 ^ i2) * (-32477)) ^ (-2120711814);
                        i5 = 1419470464;
                    }
                    break;
                case -1865714578:
                case 2090767787:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩺ۛ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-30125)) ^ 2049503078;
                        i5 = 1759330662;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28397) ^ (-1684196898);
                        i5 = 1510538448;
                    }
                    break;
                case -1720075668:
                case 401840851:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25865)) ^ (-1864741841);
                        i5 = 1661285193;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4413) ^ (-70881222);
                        i5 = -115723425;
                    }
                    break;
                case -1704117133:
                case 835194472:
                    C1025.m3861();
                    C0629.m2907();
                    iM45029 = (i3 - C19806.m45029("᩺ۛ")) * (-29);
                    i4 = ((iM45029 ^ i2) * (-30125)) ^ 2049503078;
                    i5 = 1759330662;
                    break;
                case -1633173459:
                case 1754789794:
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    } else {
                        iM45029 = (C19806.m45029("ܰ۬") + i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-16545)) ^ (-255891163);
                        i5 = -1736862925;
                    }
                    break;
                case -1630376459:
                case 45886690:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25529)) ^ 1693903070;
                        i5 = -2126749298;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩳۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-16407)) ^ (-1943190395);
                        i5 = 2090209016;
                    }
                    break;
                case -1628133787:
                case 602192604:
                    this.f28349 = arrayList;
                    return;
                case -1354368909:
                case -176876784:
                    C2124.m6673();
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4413) ^ (-70881222);
                        i5 = -115723425;
                    } else {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    }
                    break;
                case -1209454343:
                case -1002887779:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩺") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * (-8649)) ^ 1814329939;
                        i5 = 930050589;
                    } else {
                        iM45029 = (C19806.m45029("ܰ۬") + i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-16545)) ^ (-255891163);
                        i5 = -1736862925;
                    }
                    break;
                case -1039630706:
                case -896454299:
                    arrayList = new ArrayList();
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    } else {
                        iM45029 = (C19806.m45029("ۢۨ") + i2) * 101;
                        i4 = ((iM45029 ^ i3) * 2443) ^ 589982273;
                        i5 = 1758835153;
                    }
                    break;
                case -839620877:
                case 247299080:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ۟")) * 101;
                        i4 = ((iM45029 ^ i2) * (-32609)) ^ (-654291138);
                        i5 = -422382650;
                    }
                    break;
                case -716631530:
                case 52275661:
                    CallableC1627.m5507();
                    C1066.m4023();
                    throw new RuntimeException();
                case -427658516:
                case 1153610573:
                    C3722.m10894();
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺ۛ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-30125)) ^ 2049503078;
                        i5 = 1759330662;
                    }
                    break;
                case -328484870:
                case 2101996259:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 14295) ^ 1959231178;
                        i5 = -1236546661;
                    } else {
                        iM45029 = C19806.m45029("ܺ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22237) ^ (-1720646649);
                        i5 = 1739285150;
                    }
                    break;
                case -177653764:
                case 587263906:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i3 - C19806.m45029("᩺ۛ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-30125)) ^ 2049503078;
                        i5 = 1759330662;
                    } else {
                        iM45029 = (C19806.m45029("᩷۫") + i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-7041)) ^ 157887261;
                        i5 = 739538198;
                    }
                    break;
                default:
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۢ") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 7601) ^ 2088618072;
                        i5 = 19562238;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺ۛ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-30125)) ^ 2049503078;
                        i5 = 1759330662;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0116 A[PHI: r1 r6 r8
      0x0116: PHI (r1v3 short[]) = (r1v1 short[]), (r1v4 short[]) binds: [B:32:0x0114, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r6v5 l.᩷۠ۚ) = (r6v3 l.᩷۠ۚ), (r6v6 l.᩷۠ۚ) binds: [B:32:0x0114, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r8v4 short) = (r8v2 short), (r8v1 short) binds: [B:32:0x0114, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea A[PHI: r9
      0x01ea: PHI (r9v2 short) = (r9v1 short), (r9v3 short) binds: [B:57:0x01e6, B:28:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x021c A[PHI: r10 r14
      0x021c: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:65:0x021a, B:61:0x0201, B:50:0x01bc, B:46:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:65:0x021a, B:61:0x0201, B:50:0x01bc, B:46:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0246 A[PHI: r13
      0x0246: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:50:0x01bc, B:35:0x012d, B:14:0x007a, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x025b A[PHI: r0 r7
      0x025b: PHI (r0v9 short[]) = (r0v3 short[]), (r0v7 short[]), (r0v3 short[]) binds: [B:57:0x01e6, B:53:0x01c7, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r7v4 char) = (r7v1 char), (r7v2 char), (r7v1 char) binds: [B:57:0x01e6, B:53:0x01c7, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM11306;
        int i;
        int i2;
        int i3;
        short[] sArr = null;
        short[] sArr2 = null;
        int i4 = C10634.f36300;
        int i5 = C1025.f4800;
        int iM45029 = (C19806.m45029("ۚܰ") ^ i5) * (-121);
        int i6 = ((iM45029 ^ i4) * 21299) ^ 682614802;
        int i7 = iM45029 ^ (-1971266464);
        AbstractC20745 abstractC20745 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1267253050;
        int i12 = 0;
        int i13 = 0;
        short s3 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i11 = i7 ^ (i6 & (((i11 ^ i4) * (-6795)) >> 31));
            switch (i11) {
                case -2086587972:
                case 1591453640:
                    i12 = 6;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("֡ۢ") ^ i5) * (-5);
                        i6 = ((iM11306 ^ i4) * (-11629)) ^ 499638010;
                        i = -615974042;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ۫") ^ i5) * (-45);
                        i6 = ((iM11306 ^ i4) * 17471) ^ (-520310071);
                        i = 1077417135;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1936217235:
                case 928922065:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("֡ۢ") ^ i5) * (-5);
                        i6 = ((iM11306 ^ i4) * (-11629)) ^ 499638010;
                        i = -615974042;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-14673)) ^ (-1131945675);
                        i = -331385738;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1935426641:
                case -501806029:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("᩵᩶") ^ i4;
                        i6 = ((iM11306 ^ i5) * 21035) ^ (-462546794);
                        i = -1098816776;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۜ") ^ i5) * (-55);
                        i6 = ((iM11306 ^ i4) * 22793) ^ 899625987;
                        i = -2005466725;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1929392431:
                case -692043121:
                    sArr = f28346;
                    c = 0;
                    if (C0050.m946() <= 0) {
                        iM11306 = C19806.m45029("᩵᩶") ^ i4;
                        i6 = ((iM11306 ^ i5) * 21035) ^ (-462546794);
                        i = -1098816776;
                    } else {
                        iM11306 = (C19806.m45029("ۚۤ") ^ i5) * 15;
                        i6 = ((iM11306 ^ i4) * 10931) ^ 1538234716;
                        i = -1225366618;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1583753316:
                case 587065939:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚᩴ") + i4) * 35;
                        i6 = ((iM11306 ^ i5) * (-5233)) ^ 1691754028;
                        i = 194256048;
                    } else {
                        iM11306 = (C19806.m45029("֡ۢ") ^ i5) * (-5);
                        i6 = ((iM11306 ^ i4) * (-11629)) ^ 499638010;
                        i = -615974042;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1505643538:
                case 736342863:
                    i9 = s + s3;
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27379) ^ (-1936998605);
                        i = 903337931;
                    } else {
                        iM11306 = (C19806.m45029("֡ۢ") ^ i5) * (-5);
                        i6 = ((iM11306 ^ i4) * (-11629)) ^ 499638010;
                        i = -615974042;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1458803485:
                case -307352837:
                    i8 = i14 + i15;
                    if (C3577.f13150 >= 0) {
                        i2 = i15;
                        s3 = 1;
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 5145) ^ 1247858735;
                        i15 = i2;
                        i = 866417867;
                    } else {
                        int iM450210 = (i4 - C19806.m45029("ܳ۠")) * 71;
                        iM11306 = iM450210;
                        i6 = ((iM450210 ^ i5) * (-9235)) ^ (-2108974280);
                        i = 1550026748;
                        s3 = 1;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -1438398670:
                case -910896818:
                    i3 = 35967;
                    int iM11307 = ThreadFactoryC3888.m11306("ܺۡ") ^ i5;
                    i10 = i3;
                    iM11306 = iM11307;
                    i6 = ((iM11307 ^ i4) * 32469) ^ 1388947366;
                    i = -1800655982;
                    i7 = iM11306 ^ i;
                    break;
                case -1313356365:
                case 283631541:
                    f28345 = C1189.m4364(abstractC20745, C1025.m3859(sArr2, i13, i12, i10));
                    return;
                case -1008495501:
                case 25612338:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (ThreadFactoryC3888.m11306("ۚᩴ") + i4) * 35;
                    i6 = ((iM11306 ^ i5) * (-5233)) ^ 1691754028;
                    i = 194256048;
                    i7 = iM11306 ^ i;
                    break;
                case -991459588:
                case 1396396833:
                    s = sArr[c];
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("۬᩺") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-20575)) ^ 1605639589;
                        i = -2121737379;
                    } else {
                        i2 = i15;
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 5145) ^ 1247858735;
                        i15 = i2;
                        i = 866417867;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -867437961:
                case 1049417272:
                    s2 = 2;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۜ") ^ i5) * (-55);
                        i6 = ((iM11306 ^ i4) * 22793) ^ 899625987;
                        i = -2005466725;
                    } else {
                        iM11306 = C19806.m45029("ۤ᩵") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-5197)) ^ 2016772840;
                        i = -536323526;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case -446359357:
                case 316105481:
                    if ((i9 * i9) - i8 >= 0) {
                        iM11306 = (C19806.m45029("ۢۖ") ^ i4) * (-99);
                        i6 = ((iM11306 ^ i5) * 22773) ^ 656344155;
                        i = 1744963256;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-30201)) ^ 1373697225;
                        i = 1991298018;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case 320213907:
                case 375076575:
                    C0278.m1789();
                    throw new RuntimeException();
                case 817454820:
                case 1717227907:
                    int i16 = s * s2;
                    if (C1875.m6086() != 0) {
                        i14 = i16;
                        i2 = 1;
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 5145) ^ 1247858735;
                        i15 = i2;
                        i = 866417867;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i5;
                        i14 = i16;
                        iM11306 = iM11308;
                        i6 = ((iM11308 ^ i4) * (-1115)) ^ 934446869;
                        i = 1025443289;
                        i15 = 1;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case 1017829164:
                case 2106647133:
                    i13 = 1;
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-9405)) ^ 770019547;
                        i = 1393573874;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚᩴ") + i4) * 35;
                        i6 = ((iM11306 ^ i5) * (-5233)) ^ 1691754028;
                        i = 194256048;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case 1142766010:
                case 1802545571:
                    abstractC20745 = C11904.f39938;
                    sArr2 = f28346;
                    if (C3660.f13403 >= 0) {
                        i2 = i15;
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 5145) ^ 1247858735;
                        i15 = i2;
                        i = 866417867;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩶ۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM11306 ^ i5) * (-19857)) ^ (-1025624077);
                        i = -311943811;
                    }
                    i7 = iM11306 ^ i;
                    break;
                case 1231388155:
                case 1574304092:
                    i3 = 37896;
                    int iM11309 = ThreadFactoryC3888.m11306("ܺۡ") ^ i5;
                    i10 = i3;
                    iM11306 = iM11309;
                    i6 = ((iM11309 ^ i4) * 32469) ^ 1388947366;
                    i = -1800655982;
                    i7 = iM11306 ^ i;
                    break;
                default:
                    if (C3577.m10565()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚᩴ") + i4) * 35;
                        i6 = ((iM11306 ^ i5) * (-5233)) ^ 1691754028;
                        i = 194256048;
                    } else {
                        iM11306 = C19806.m45029("᩵᩶") ^ i4;
                        i6 = ((iM11306 ^ i5) * 21035) ^ (-462546794);
                        i = -1098816776;
                    }
                    i7 = iM11306 ^ i;
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۢ */
    public final String mo15956() {
        return this.f28350;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۙ */
    public final void mo1990(boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        Intent intent;
        int i4;
        int iM11306;
        int i5;
        int i6;
        short s;
        int i7;
        int i8;
        int i9;
        short s2;
        int i10;
        int i11;
        int iM11307;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM45029;
        int i16;
        char c;
        short s3;
        int i17;
        int i18;
        int i19;
        int i20;
        short s4;
        int iM11308;
        int i21;
        int i22 = C10634.f36300;
        int i23 = ThreadFactoryC3888.f14547;
        int iM11309 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i22;
        int i24 = ((iM11309 ^ i23) * (-22415)) ^ 1916821655;
        short[] sArr = null;
        short[] sArr2 = null;
        int i25 = iM11309 ^ (-1449866597);
        char c2 = 0;
        short s5 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        short s6 = 0;
        int i29 = 0;
        int i30 = 499753163;
        C17367 c17367M40441 = null;
        Intent intentM18982 = null;
        while (true) {
            int i31 = i25 ^ (i24 & (((i30 ^ i23) * 31295) >> 31));
            switch (i31) {
                case -2054175542:
                case -1806863428:
                    sArr = sArr;
                    c2 = c2;
                    i2 = i28;
                    s6 = s6;
                    i3 = i29;
                    i31 = i31;
                    s5 = sArr[c2];
                    i26 = s5 * s5;
                    i27 = 309548836;
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۢ") ^ i23;
                        i15 = ((iM45029 ^ i22) * (-24659)) ^ 145585972;
                        i14 = -2146597634;
                    } else {
                        iM45029 = C19806.m45029("᩸᩵") ^ i23;
                        i15 = ((iM45029 ^ i22) * 8203) ^ (-1825263182);
                        i14 = -1298367760;
                    }
                    i16 = iM45029 ^ i14;
                    i29 = i3;
                    i30 = i31;
                    c2 = c2;
                    i28 = i2;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -1815614483:
                case -63665823:
                    if (C2871.f10837 >= 0) {
                        sArr = sArr;
                        c2 = c2;
                        s5 = s5;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s6 = s6;
                        i = i29;
                        i31 = i31;
                        iM11308 = (i22 - C19806.m45029("ܺ᩺")) * (-69);
                        i15 = ((iM11308 ^ i23) * (-1411)) ^ 418650144;
                        i21 = 1939706702;
                        i16 = iM11308 ^ i21;
                        i29 = i;
                        i30 = i31;
                        c2 = c2;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s5 = s5;
                        s6 = s6;
                        i25 = i16;
                        i24 = i15;
                        sArr = sArr;
                    } else {
                        s = s5;
                        i7 = i26;
                        i8 = i27;
                        i9 = i28;
                        s2 = s6;
                        i10 = i29;
                        i11 = i31;
                        iM11307 = C19806.m45029("᩸ۖ") ^ i23;
                        i12 = ((iM11307 ^ i22) * 14165) ^ (-790004363);
                        i13 = -2135805144;
                        int i32 = iM11307 ^ i13;
                        i29 = i10;
                        i30 = i11;
                        i26 = i7;
                        i27 = i8;
                        i28 = i9;
                        s6 = s2;
                        i25 = i32;
                        i24 = i12;
                        s5 = s;
                    }
                    break;
                case -1656450693:
                case 1122221592:
                    i29 = 37611;
                    int iM450210 = C19806.m45029("ۤᩳ") ^ i22;
                    i15 = ((iM450210 ^ i23) * 28113) ^ 838318914;
                    i16 = iM450210 ^ (-1667951060);
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -1549225819:
                case -697374570:
                    sArr = sArr;
                    c = c2;
                    s3 = s5;
                    i17 = i26;
                    i18 = i27;
                    i19 = i29;
                    i20 = i31;
                    int i33 = i17 + i18;
                    i28 = i33 + i33;
                    s4 = 17594;
                    if (RunnableC1606.f6488 >= 0) {
                        int iM113010 = (i23 - ThreadFactoryC3888.m11306("ۛ᩻")) * 39;
                        i29 = i19;
                        i30 = i20;
                        i26 = i17;
                        i27 = i18;
                        s5 = s3;
                        s6 = s4;
                        i25 = iM113010 ^ (-1161660815);
                        i24 = ((iM113010 ^ i22) * (-24837)) ^ (-467067487);
                        c2 = c;
                    } else {
                        int iM450211 = C19806.m45029("᩶ۡ") ^ i23;
                        i24 = ((iM450211 ^ i22) * 439) ^ 584983119;
                        i29 = i19;
                        i30 = i20;
                        c2 = c;
                        i26 = i17;
                        i27 = i18;
                        s5 = s3;
                        s6 = 17594;
                        i25 = iM450211 ^ 1264051400;
                    }
                    sArr = sArr;
                    break;
                case -1291104987:
                case -1224153533:
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i31 = i31;
                    i = i29;
                    intentM18982 = intentM18982;
                    this.f28350 = RunnableC3388.m10060(intentM18982, ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr2, 8, 11, i));
                    if (z) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۨ۬") + i23) * 45;
                        i15 = ((iM11308 ^ i22) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ (-1480639886);
                        i21 = -1718003162;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩺۟") + i22) * 15;
                        i15 = ((iM11308 ^ i23) * (-24055)) ^ 1003476589;
                        i21 = -734032565;
                    }
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -1277348502:
                case 596712008:
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i = i29;
                    i31 = i31;
                    int i34 = C5553.f19060;
                    this.f28348 = C5553.m15309(C7105.m18982(this));
                    if (C0629.f2722 <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۧۗ") ^ i22;
                        i15 = ((iM11308 ^ i23) * 22521) ^ 1649773026;
                        i21 = -253218435;
                    } else {
                        iM11308 = C19806.m45029("᩶᩷") ^ i22;
                        i15 = ((iM11308 ^ i23) * 21343) ^ 331864866;
                        i21 = 1503145718;
                    }
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -1237367218:
                case 2071013647:
                    intent = intentM18982;
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i4 = i29;
                    i31 = i31;
                    c17367M40441 = C17367.m40441(AbstractC0464.m2302(f28345));
                    iM11306 = C19806.m45029("ۗ֡") ^ i22;
                    i5 = ((iM11306 ^ i23) * (-12701)) ^ (-1032556814);
                    i6 = 1425297994;
                    int i35 = iM11306 ^ i6;
                    i30 = i31;
                    c2 = c2;
                    sArr = sArr;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i29 = i4;
                    i25 = i35;
                    i24 = i5;
                    intentM18982 = intent;
                    break;
                case -690847118:
                case 215537474:
                    RunnableC1564.m5345();
                    C1977.m6356();
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i = i29;
                    i31 = i31;
                    iM11308 = ThreadFactoryC3888.m11306("ۧۗ") ^ i22;
                    i15 = ((iM11308 ^ i23) * 22521) ^ 1649773026;
                    i21 = -253218435;
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -453198327:
                case -106388995:
                    C1189.m4368();
                    if (C1977.f7413 <= 0) {
                        sArr = sArr;
                        c = c2;
                        s3 = s5;
                        i17 = i26;
                        i18 = i27;
                        s4 = s6;
                        i19 = i29;
                        i20 = i31;
                        int iM113011 = (i23 - ThreadFactoryC3888.m11306("ۛ᩻")) * 39;
                        i29 = i19;
                        i30 = i20;
                        i26 = i17;
                        i27 = i18;
                        s5 = s3;
                        s6 = s4;
                        i25 = iM113011 ^ (-1161660815);
                        i24 = ((iM113011 ^ i22) * (-24837)) ^ (-467067487);
                        c2 = c;
                        sArr = sArr;
                    } else {
                        s = s5;
                        i7 = i26;
                        i8 = i27;
                        i9 = i28;
                        s2 = s6;
                        i10 = i29;
                        i11 = i31;
                        iM11307 = C19806.m45029("᩸ۖ") ^ i23;
                        i12 = ((iM11307 ^ i22) * 14165) ^ (-790004363);
                        i13 = -2135805144;
                        int i36 = iM11307 ^ i13;
                        i29 = i10;
                        i30 = i11;
                        i26 = i7;
                        i27 = i8;
                        i28 = i9;
                        s6 = s2;
                        i25 = i36;
                        i24 = i12;
                        s5 = s;
                    }
                    break;
                case -448477765:
                case 1455575362:
                    break;
                case -425747364:
                case -272026132:
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i = i29;
                    i31 = i31;
                    intentM18982 = C7105.m18982(this);
                    sArr2 = f28346;
                    if (RunnableC1895.f7152) {
                        iM11308 = C19806.m45029("۟ܽ") ^ i23;
                        i15 = ((iM11308 ^ i22) * (-29365)) ^ (-874567203);
                        i21 = -513036167;
                    } else {
                        iM11308 = (i22 - C19806.m45029("ܺ᩺")) * (-69);
                        i15 = ((iM11308 ^ i23) * (-1411)) ^ 418650144;
                        i21 = 1939706702;
                    }
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case -424606786:
                case -260642585:
                    if (!RunnableC1564.m5345()) {
                        s = s5;
                        i7 = i26;
                        i8 = i27;
                        i9 = i28;
                        s2 = s6;
                        i10 = i29;
                        i11 = i31;
                        iM11307 = C19806.m45029("᩸ۖ") ^ i23;
                        i12 = ((iM11307 ^ i22) * 14165) ^ (-790004363);
                        i13 = -2135805144;
                        int i37 = iM11307 ^ i13;
                        i29 = i10;
                        i30 = i11;
                        i26 = i7;
                        i27 = i8;
                        i28 = i9;
                        s6 = s2;
                        i25 = i37;
                        i24 = i12;
                        s5 = s;
                    } else {
                        sArr = sArr;
                        c2 = c2;
                        s5 = s5;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s6 = s6;
                        i = i29;
                        i31 = i31;
                        iM11308 = ThreadFactoryC3888.m11306("ۧۗ") ^ i22;
                        i15 = ((iM11308 ^ i23) * 22521) ^ 1649773026;
                        i21 = -253218435;
                        i16 = iM11308 ^ i21;
                        i29 = i;
                        i30 = i31;
                        c2 = c2;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s5 = s5;
                        s6 = s6;
                        i25 = i16;
                        i24 = i15;
                        sArr = sArr;
                    }
                    break;
                case -295367112:
                case 378736090:
                    s = s5;
                    i7 = i26;
                    i8 = i27;
                    i9 = i28;
                    s2 = s6;
                    i10 = i29;
                    i11 = i31;
                    sArr = f28346;
                    c2 = 7;
                    if (C0526.f2219) {
                        iM11307 = C19806.m45029("᩸ۖ") ^ i23;
                        i12 = ((iM11307 ^ i22) * 14165) ^ (-790004363);
                        i13 = -2135805144;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚۜ") ^ i22) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM11307 ^ i23) * (-25989)) ^ 2043709337;
                        i13 = -715485741;
                    }
                    int i38 = iM11307 ^ i13;
                    i29 = i10;
                    i30 = i11;
                    i26 = i7;
                    i27 = i8;
                    i28 = i9;
                    s6 = s2;
                    i25 = i38;
                    i24 = i12;
                    s5 = s;
                    break;
                case -170317282:
                case 865287395:
                    i31 = i31;
                    String strM40442 = c17367M40441.m40442();
                    byte[] bArrM40451 = c17367M40441.m40451();
                    if (C0817.f3443) {
                        sArr = sArr;
                        C20945 c20945M47103 = C20945.m47103(bArrM40451);
                        c2 = c2;
                        int iM4036 = C1066.m4036(c17367M40441);
                        if (C0671.f2816 != 0) {
                            i2 = i28;
                            s6 = s6;
                            i3 = i29;
                            iM45029 = C19806.m45029("᩸᩵") ^ i23;
                            i15 = ((iM45029 ^ i22) * 8203) ^ (-1825263182);
                            i14 = -1298367760;
                            i16 = iM45029 ^ i14;
                            i29 = i3;
                            i30 = i31;
                            c2 = c2;
                            i28 = i2;
                            s6 = s6;
                            i25 = i16;
                            i24 = i15;
                            sArr = sArr;
                            break;
                        } else {
                            i26 = i26;
                            ArrayList arrayList = new ArrayList(iM4036);
                            i27 = i27;
                            int i39 = 0;
                            while (true) {
                                if (i39 >= iM4036) {
                                    intent = intentM18982;
                                    s5 = s5;
                                    i28 = i28;
                                    s6 = s6;
                                    i4 = i29;
                                    C2249.m6905(this.f28349, new C18675(strM40442, c20945M47103, arrayList));
                                    iM11306 = C19806.m45029("ۗ֡") ^ i22;
                                    i5 = ((iM11306 ^ i23) * (-12701)) ^ (-1032556814);
                                    i6 = 1425297994;
                                    int i310 = iM11306 ^ i6;
                                    i30 = i31;
                                    c2 = c2;
                                    sArr = sArr;
                                    i26 = i26;
                                    i27 = i27;
                                    i28 = i28;
                                    s5 = s5;
                                    s6 = s6;
                                    i29 = i4;
                                    i25 = i310;
                                    i24 = i5;
                                    intentM18982 = intent;
                                    break;
                                } else {
                                    int i40 = iM4036;
                                    int iM4037 = C1066.m4036(c17367M40441);
                                    i28 = i28;
                                    int[] iArrM40460 = c17367M40441.m40460();
                                    s5 = s5;
                                    boolean zM6907 = C2249.m6907(c17367M40441);
                                    s6 = s6;
                                    if (C1461.f5957 > 0) {
                                        C1035 c1035 = new C1035(iM4037);
                                        C15070 c15070 = c1035.f4823;
                                        RunnableC3388.m10051(c15070);
                                        if (C1148.m4232() > 0) {
                                            Intent intent2 = intentM18982;
                                            int i41 = i29;
                                            c15070.mo3177(0, iArrM40460.length, iArrM40460);
                                            c1035.f4822 = zM6907;
                                            if (C2124.f7782 <= 0) {
                                                intentM18982 = intent2;
                                                i = i41;
                                                iM11308 = (i22 - C19806.m45029("ܺ᩺")) * (-69);
                                                i15 = ((iM11308 ^ i23) * (-1411)) ^ 418650144;
                                                i21 = 1939706702;
                                                i16 = iM11308 ^ i21;
                                                i29 = i;
                                                i30 = i31;
                                                c2 = c2;
                                                i26 = i26;
                                                i27 = i27;
                                                i28 = i28;
                                                s5 = s5;
                                                s6 = s6;
                                                i25 = i16;
                                                i24 = i15;
                                                sArr = sArr;
                                            } else {
                                                C2249.m6905(arrayList, c1035);
                                                i39++;
                                                iM4036 = i40;
                                                i28 = i28;
                                                s5 = s5;
                                                s6 = s6;
                                                intentM18982 = intent2;
                                                i29 = i41;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        sArr = sArr;
                        c2 = c2;
                        s5 = s5;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s6 = s6;
                    }
                    i = i29;
                    iM11308 = ThreadFactoryC3888.m11306("ۧۗ") ^ i22;
                    i15 = ((iM11308 ^ i23) * 22521) ^ 1649773026;
                    i21 = -253218435;
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case 82380852:
                case 490165735:
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i = i29;
                    i31 = i31;
                    int i42 = s5 + s6;
                    if (i28 - (i42 * i42) < 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۛۤ") ^ i23;
                        i15 = ((iM11308 ^ i22) * (-13543)) ^ 407739899;
                        i21 = 687175629;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۨۨ") + i22) * (-33);
                        i15 = ((iM11308 ^ i23) * 9547) ^ (-1331561672);
                        i21 = -42309554;
                    }
                    i16 = iM11308 ^ i21;
                    i29 = i;
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case 848698573:
                case 2123769504:
                    i29 = 14863;
                    int iM450212 = C19806.m45029("ۤᩳ") ^ i22;
                    i15 = ((iM450212 ^ i23) * 28113) ^ 838318914;
                    i16 = iM450212 ^ (-1667951060);
                    i30 = i31;
                    c2 = c2;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s5 = s5;
                    s6 = s6;
                    i25 = i16;
                    i24 = i15;
                    sArr = sArr;
                    break;
                case 1340871110:
                case 1835164899:
                    C7105.m18985();
                    C1977.m6356();
                    break;
                default:
                    intent = intentM18982;
                    sArr = sArr;
                    c2 = c2;
                    s5 = s5;
                    i26 = i26;
                    i27 = i27;
                    i28 = i28;
                    s6 = s6;
                    i4 = i29;
                    i31 = i31;
                    if (c17367M40441.available() <= 0) {
                        intentM18982 = intent;
                        i = i4;
                        iM11308 = (ThreadFactoryC3888.m11306("᩺۟") + i22) * 15;
                        i15 = ((iM11308 ^ i23) * (-24055)) ^ 1003476589;
                        i21 = -734032565;
                        i16 = iM11308 ^ i21;
                        i29 = i;
                        i30 = i31;
                        c2 = c2;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s5 = s5;
                        s6 = s6;
                        i25 = i16;
                        i24 = i15;
                        sArr = sArr;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i23;
                        i5 = ((iM11306 ^ i22) * 29173) ^ (-804807729);
                        i6 = 1710247842;
                        int i311 = iM11306 ^ i6;
                        i30 = i31;
                        c2 = c2;
                        sArr = sArr;
                        i26 = i26;
                        i27 = i27;
                        i28 = i28;
                        s5 = s5;
                        s6 = s6;
                        i29 = i4;
                        i25 = i311;
                        i24 = i5;
                        intentM18982 = intent;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ᩹ۙ */
    public final void mo1991() {
        C2332.m7081(new C6680(this));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d A[PHI: r3
      0x014d: PHI (r3v3 l.ᩴۢۨ) = (r3v2 l.ᩴۢۨ), (r3v2 l.ᩴۢۨ), (r3v6 l.ᩴۢۨ) binds: [B:52:0x014b, B:14:0x0053, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2 A[PHI: r2
      0x01c2: PHI (r2v3 java.lang.Object) = (r2v2 java.lang.Object), (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:64:0x01c0, B:60:0x01a8, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۖ */
    public final void mo15951(int i) {
        int iM11306;
        int i2;
        int i3 = 0;
        int i4 = 0;
        Object objM9796 = null;
        C18675 c18675 = null;
        int i5 = -1983134255;
        int i6 = ThreadFactoryC3888.f14547;
        int i7 = C3577.f13150;
        int iM11307 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i7;
        int i8 = ((iM11307 ^ i6) * (-22775)) ^ 384312288;
        int i9 = 696467911;
        while (true) {
            int i10 = iM11307 ^ i9;
            RunnableC21497 runnableC21497 = null;
            while (true) {
                i5 = ((((i5 ^ i6) * 28127) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2022414954:
                    case 1827718536:
                        C1148.m4232();
                        C0797.m3359();
                        iM11306 = C19806.m45029("ܽ᩻") ^ i7;
                        i8 = ((iM11306 ^ i6) * 2591) ^ (-677019650);
                        i2 = -1192819019;
                        i10 = iM11306 ^ i2;
                        break;
                    case -2009762085:
                    case 1084739913:
                        i3 = 65535;
                        if (C2124.m6673() > 0) {
                            iM11306 = (i6 - ThreadFactoryC3888.m11306("۠᩺")) * 5;
                            i8 = ((iM11306 ^ i7) * 11499) ^ 14040858;
                            i2 = -1832068288;
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    case -1624148696:
                    case 2069009480:
                        if (AbstractC0464.f2088 <= 0) {
                        }
                        iM11306 = C19806.m45029("ܽ᩻") ^ i7;
                        i8 = ((iM11306 ^ i6) * 2591) ^ (-677019650);
                        i2 = -1192819019;
                        i10 = iM11306 ^ i2;
                        break;
                    case -1321063352:
                    case 1752807760:
                        if (C7105.f23796 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۛ۟") + i7) * (-39);
                            i8 = ((iM11306 ^ i6) * 12689) ^ (-1028863034);
                            i2 = 654499038;
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    case -1286784656:
                    case 488134619:
                        if (C1148.f5161 <= 0) {
                            iM11306 = C19806.m45029("֡ܺ") ^ i7;
                            i8 = ((iM11306 ^ i6) * 1619) ^ (-1377886332);
                            i2 = 2145676165;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ܳ") + i6) * (-41);
                            i8 = ((iM11306 ^ i7) * (-19565)) ^ (-225417098);
                            i2 = 1088920511;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case -1256315183:
                    case -180683245:
                        objM9796 = C3286.m9796(this.f28349, i4);
                        if (C2642.f10294 <= 0) {
                            iM11306 = C19806.m45029("֡ܺ") ^ i7;
                            i8 = ((iM11306 ^ i6) * 1619) ^ (-1377886332);
                            i2 = 2145676165;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i6;
                            i8 = ((iM11306 ^ i7) * 14101) ^ (-2115248355);
                            i2 = -1188169198;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case -1192467144:
                    case 605884435:
                        if (C1398.f5802 <= 0) {
                            iM11306 = C19806.m45029("ܽ᩻") ^ i7;
                            i8 = ((iM11306 ^ i6) * 2591) ^ (-677019650);
                            i2 = -1192819019;
                        } else {
                            iM11306 = (C19806.m45029("֫ۙ") + i6) * (-21);
                            i8 = ((iM11306 ^ i7) * (-13719)) ^ 1301412797;
                            i2 = 1995948334;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case -696763400:
                    case -383916459:
                        runnableC21497.run();
                        break;
                    case -450257809:
                    case 997256129:
                        if (C10634.f36300 >= 0) {
                            iM11306 = C19806.m45029("ܽ᩻") ^ i7;
                            i8 = ((iM11306 ^ i6) * 2591) ^ (-677019650);
                            i2 = -1192819019;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙ֨") ^ i6) * (-95);
                            i8 = ((iM11306 ^ i7) * 28719) ^ (-1460549693);
                            i2 = 1238351603;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case -278492048:
                    case 1197094166:
                        if (RunnableC0195.f1321 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰܰ") ^ i7;
                            i8 = ((iM11306 ^ i6) * 16645) ^ (-239576799);
                            i2 = -630557414;
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    case 262676298:
                    case 1768804804:
                        if (C0671.f2816 != 0) {
                            iM11306 = C19806.m45029("֡ܺ") ^ i7;
                            i8 = ((iM11306 ^ i6) * 1619) ^ (-1377886332);
                            i2 = 2145676165;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i7;
                            i8 = ((iM11306 ^ i6) * (-16049)) ^ (-2081793222);
                            i2 = 730617202;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case 396021938:
                    case 448329623:
                        if (C3722.f13525 > 0) {
                            runnableC21497 = new RunnableC21497(c18675, this);
                            if (c18675.f60615) {
                                iM11306 = C19806.m45029("ۖ᩶") ^ i6;
                                i8 = ((iM11306 ^ i7) * 29637) ^ (-2108964610);
                                i2 = -2145689700;
                            } else {
                                iM11306 = C19806.m45029("ܳܿ") ^ i6;
                                i8 = ((iM11306 ^ i7) * 2191) ^ (-604417845);
                                i2 = 1769401368;
                            }
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    case 496808780:
                    case 1302046145:
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = (C19806.m45029("֫ۙ") + i6) * (-21);
                            i8 = ((iM11306 ^ i7) * (-13719)) ^ 1301412797;
                            i2 = 1995948334;
                        } else {
                            iM11306 = C19806.m45029("ۗᩴ") ^ i6;
                            i8 = ((iM11306 ^ i7) * 31727) ^ 1792505424;
                            i2 = -1190795255;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                    case 573226552:
                    case 1654569297:
                        C0526.m2437();
                        break;
                    case 575765070:
                    case 1058373744:
                        C2332.m7081(new C17969(c18675, this, runnableC21497));
                        break;
                    case 1025630034:
                    case 1833191907:
                        i4 = i & i3;
                        if (AbstractC0464.f2088 > 0) {
                            iM11306 = C19806.m45029("ۤ۟") ^ i7;
                            i8 = ((iM11306 ^ i6) * (-15219)) ^ (-1358818050);
                            i2 = 1878483003;
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    default:
                        c18675 = (C18675) objM9796;
                        RunnableC3388.m10051(c18675);
                        if (C2124.f7782 <= 0) {
                            iM11306 = (C19806.m45029("֫ۙ") + i6) * (-21);
                            i8 = ((iM11306 ^ i7) * (-13719)) ^ 1301412797;
                            i2 = 1995948334;
                        } else {
                            iM11306 = (C19806.m45029("ۤۧ") ^ i7) * (-19);
                            i8 = ((iM11306 ^ i6) * 2259) ^ 1683499737;
                            i2 = -1792547294;
                        }
                        i10 = iM11306 ^ i2;
                        break;
                }
                return;
            }
            iM11307 = (C19806.m45029("᩵ܺ") ^ i7) * 93;
            i8 = ((iM11307 ^ i6) * 24701) ^ 336733484;
            i9 = 1374866710;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        f28345.mo24644();
    }
}
