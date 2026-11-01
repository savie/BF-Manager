package l;

import android.graphics.Bitmap;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2707 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩻ۚۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f10413 = {35, -23721, 30079, -27857, -26199, -25708, 30616, -30583, -21423, 27730, -24270, -21257, 24827, 706, -6749, 1055, 2282};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC4514 f10414;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f10415;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10416;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16819 f10417;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bitmap f10418;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        Object obj = null;
        int i = 1856345727;
        int i2 = C1148.f5161;
        int i3 = C2871.f10837;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-25219)) ^ 1941387588;
        int i5 = 1273606984;
        while (true) {
            i = ((((i ^ i3) * 27663) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1898592885:
                case 1242695916:
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9747) ^ (-899213036);
                        i5 = -1785721062;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22387)) ^ 1441937078;
                        i5 = -449152927;
                    }
                    break;
                case -1702232403:
                case 473526107:
                    if (!RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19305) ^ 990223908;
                        i5 = -341107874;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9313)) ^ (-1316905051);
                        i5 = 1614553315;
                    }
                    break;
                case -1469996816:
                case 488054092:
                    viewOnClickListenerC4514 = this.f10414;
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("ۤܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30931) ^ (-1437020121);
                        i5 = 1911964631;
                    } else {
                        iM11306 = C19806.m45029("ۖۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30829)) ^ 980794679;
                        i5 = -1461666618;
                    }
                    break;
                case -1360296373:
                case 660652394:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22387)) ^ 1441937078;
                        i5 = -449152927;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۬") ^ i2) * 67;
                        i4 = ((iM11306 ^ i3) * (-19091)) ^ (-2086489740);
                        i5 = 1995302184;
                    }
                    break;
                case -856251627:
                case -719559936:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("۟֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9313)) ^ (-1316905051);
                        i5 = 1614553315;
                    } else {
                        iM11306 = (C19806.m45029("ܳ۫") ^ i2) * 123;
                        i4 = ((iM11306 ^ i3) * 11205) ^ 1659156005;
                        i5 = -1372788813;
                    }
                    break;
                case -682411036:
                case 19477049:
                    obj = null;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22387)) ^ 1441937078;
                        i5 = -449152927;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩸") ^ i3) * 39;
                        i4 = ((iM11306 ^ i2) * (-21371)) ^ (-224637314);
                        i5 = 607743084;
                    }
                    break;
                case -176704458:
                case 52858110:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19305) ^ 990223908;
                        i5 = -341107874;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܽܺ")) * 13;
                        i4 = ((iM11306 ^ i2) * 17227) ^ (-642650224);
                        i5 = 168152433;
                    }
                    break;
                case -155885898:
                case 1817870312:
                    if (C1461.m5080()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22387)) ^ 1441937078;
                        i5 = -449152927;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨ۗ")) * 9;
                        i4 = ((iM11306 ^ i2) * 16591) ^ (-91914005);
                        i5 = -1619633083;
                    }
                    break;
                case 50048683:
                case 1661110872:
                    RunnableC1895.m6170();
                    break;
                case 158637547:
                case 961612577:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۨ") + i3) * 79;
                        i4 = ((iM11306 ^ i2) * (-12817)) ^ (-972190590);
                        i5 = 983678163;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7585) ^ (-128128699);
                        i5 = -559327692;
                    }
                    break;
                case 239452898:
                case 2146200510:
                    C2332.m7079();
                    C0797.m3359();
                    iM11306 = (ThreadFactoryC3888.m11306("۬ۨ") + i3) * 79;
                    i4 = ((iM11306 ^ i2) * (-12817)) ^ (-972190590);
                    i5 = 983678163;
                    break;
                case 375243476:
                case 529508262:
                    C2124.m6673();
                    if (!C3286.f12186) {
                        iM11306 = C19806.m45029("ۤܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30931) ^ (-1437020121);
                        i5 = 1911964631;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19305) ^ 990223908;
                        i5 = -341107874;
                    }
                    break;
                case 808776032:
                case 878289100:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i2 - C19806.m45029("ۜۜ")) * (-107);
                        i4 = ((iM11306 ^ i3) * 9989) ^ (-498212431);
                        i5 = -1458052328;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9313)) ^ (-1316905051);
                        i5 = 1614553315;
                    }
                    break;
                case 1443298501:
                case 1720704063:
                    C1875.m6102(viewOnClickListenerC4514, exc, obj);
                    C0526.m2436(this.f10415);
                    break;
                case 1499194881:
                case 1653386077:
                    C1461.m5080();
                    if (C1148.f5161 > 0) {
                        iM11306 = C19806.m45029("ۤܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30931) ^ (-1437020121);
                        i5 = 1911964631;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۨ") + i3) * 79;
                        i4 = ((iM11306 ^ i2) * (-12817)) ^ (-972190590);
                        i5 = 983678163;
                    }
                    break;
                default:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19305) ^ 990223908;
                        i5 = -341107874;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳ᩻")) * (-17);
                        i4 = ((iM11306 ^ i3) * (-4189)) ^ (-2035142576);
                        i5 = 200446554;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        int iM45029;
        int i;
        AbstractC20745 abstractC20745 = null;
        OutputStream outputStreamMo33976 = null;
        int i2 = 0;
        int i3 = 0;
        Throwable th = null;
        Object th2 = null;
        int i4 = -646531562;
        int i5 = C1419.f5860;
        int i6 = C1189.f5284;
        int iM450210 = (C19806.m45029("ᩴܰ") ^ i6) * (-19);
        int i7 = ((iM450210 ^ i5) * (-5607)) ^ 495823566;
        int i8 = 938403707;
        while (true) {
            int i9 = iM450210 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i5) * (-8299)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2135413989:
                    case -2029793972:
                        if (!C0526.f2219) {
                            iM450210 = (i5 - C19806.m45029("ܿۧ")) * 73;
                            i7 = ((iM450210 ^ i6) * (-1727)) ^ 1404710278;
                            i8 = -2120603298;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("֫ܺ") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-13341)) ^ 1257858197;
                            i8 = 1447777684;
                        }
                        break;
                    case -2081691135:
                    case -1294040328:
                        C2788.m8472();
                        if (C1148.m4232() <= 0) {
                            iM450210 = (i5 - C19806.m45029("ܿۧ")) * 73;
                            i7 = ((iM450210 ^ i6) * (-1727)) ^ 1404710278;
                            i8 = -2120603298;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                        i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                        i8 = -443147666;
                    case -2016563408:
                    case 1020837954:
                        C1668.m5583();
                        if (C1460.m5050() != 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۗܿ") ^ i6) * 123;
                            i7 = ((iM450210 ^ i5) * (-25529)) ^ 1875455189;
                            i8 = -987808674;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                            i8 = -443147666;
                        }
                        break;
                    case -1810514567:
                    case -1121444095:
                        if (C2642.m8171() == 0) {
                            iM450210 = (i6 - C19806.m45029("۟֡")) * 57;
                            i7 = ((iM450210 ^ i5) * (-27243)) ^ 555647435;
                            i8 = -612968267;
                        } else {
                            iM450210 = (i5 - C19806.m45029("ܿۧ")) * 73;
                            i7 = ((iM450210 ^ i6) * (-1727)) ^ 1404710278;
                            i8 = -2120603298;
                        }
                        break;
                    case -1780817584:
                    case -27131938:
                        throw th;
                    case -1657173134:
                    case -1354422393:
                        abstractC20745 = this.f10415;
                        if (!C2871.m8646()) {
                            iM450210 = C19806.m45029("ܺۙ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 23387) ^ (-554180149);
                            i8 = -251758603;
                        } else {
                            iM450210 = C19806.m45029("᩶֡") ^ i6;
                            i7 = ((iM450210 ^ i5) * 2121) ^ 991943103;
                            i8 = 25361422;
                        }
                        break;
                    case -1648273571:
                    case 1407481023:
                        if (outputStreamMo33976 == null) {
                            iM450210 = (C19806.m45029("ۤ᩻") ^ i5) * 71;
                            i7 = ((iM450210 ^ i6) * (-4845)) ^ 1645570352;
                            i8 = -1044065563;
                        } else {
                            iM450210 = (C19806.m45029("ۧ᩹") ^ i5) * (-51);
                            i7 = ((iM450210 ^ i6) * (-18713)) ^ 767772664;
                            i8 = 1850333280;
                        }
                        break;
                    case -1621488497:
                    case -1563783626:
                        if (outputStreamMo33976 == null) {
                            iM450210 = (C19806.m45029("֨ۤ") ^ i6) * (-83);
                            i7 = ((iM450210 ^ i5) * (-1971)) ^ 2120207073;
                            i8 = 1317654991;
                        } else {
                            iM450210 = (C19806.m45029("ۤۖ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i7 = ((iM450210 ^ i6) * 263) ^ 1298956377;
                            i8 = 1001597685;
                        }
                        break;
                    case -1521653959:
                    case -1473830005:
                        C3286.m9794(outputStreamMo33976);
                        iM450210 = (C19806.m45029("֨ۤ") ^ i6) * (-83);
                        i7 = ((iM450210 ^ i5) * (-1971)) ^ 2120207073;
                        i8 = 1317654991;
                        break;
                    case -1500353444:
                    case -942176492:
                        C2704.m8255();
                        return;
                    case -1497894135:
                    case -420817250:
                        if (!C0962.f3784) {
                            iM450210 = (i5 - C19806.m45029("ۖۨ")) * (-13);
                            i7 = ((iM450210 ^ i6) * 8849) ^ 430474524;
                            i8 = -1006803118;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۙܿ") ^ i6;
                            i7 = ((iM450210 ^ i5) * (-28769)) ^ 882733339;
                            i8 = -1215175005;
                        }
                        break;
                    case -1346136655:
                    case 722320521:
                        try {
                            this.f10418.compress(Bitmap.CompressFormat.WEBP, i3, outputStreamMo33976);
                            iM450210 = (ThreadFactoryC3888.m11306("ܰܰ") + i6) * (-103);
                            i7 = ((iM450210 ^ i5) * (-947)) ^ (-2091268370);
                            i8 = 1282703558;
                        } catch (Throwable th3) {
                            th = th3;
                            iM450210 = C19806.m45029("۬ۤ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 9269) ^ 236380013;
                            i8 = -309907436;
                        }
                        break;
                    case -1307705764:
                    case 843899177:
                        outputStreamMo33976 = abstractC20745.mo33976(false);
                        iM450210 = (i5 - ThreadFactoryC3888.m11306("ۚ᩶")) * (-61);
                        i7 = ((iM450210 ^ i6) * 23463) ^ (-1362073865);
                        i8 = -1533789639;
                        break;
                    case -1278716009:
                    case 808672259:
                        if (i2 == 2) {
                            iM450210 = (i6 - C19806.m45029("ۛۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i7 = ((iM450210 ^ i5) * 13487) ^ (-1218804577);
                            i8 = 973861242;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("ܰܰ") + i6) * (-103);
                            i7 = ((iM450210 ^ i5) * (-947)) ^ (-2091268370);
                            i8 = 1282703558;
                        }
                        break;
                    case -1181019605:
                    case 1791186471:
                        if (C1461.f5957 > 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ۖۜ") ^ i6;
                            i7 = ((iM450210 ^ i5) * (-18585)) ^ 581361859;
                            i8 = -848396298;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                            i8 = -443147666;
                        }
                        break;
                    case -1115516317:
                    case 983234649:
                        i2 = this.f10416;
                        iM450210 = C19806.m45029("ۨ֡") ^ i6;
                        i7 = ((iM450210 ^ i5) * 11929) ^ 109986429;
                        i8 = -1243903891;
                        break;
                    case -979506715:
                    case 1317248826:
                        if (i2 != 1) {
                            iM45029 = C19806.m45029("ۛ᩸") ^ i6;
                            i7 = ((iM45029 ^ i5) * 6201) ^ 183035410;
                            i = -1014103205;
                        } else {
                            iM45029 = (C19806.m45029("᩵ۜ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i7 = ((iM45029 ^ i6) * 3745) ^ (-1069821464);
                            i = -1240877379;
                        }
                        i9 = iM45029 ^ i;
                        i3 = 90;
                        break;
                    case -806071802:
                    case -221882233:
                        C0817.m3399();
                        if (C0278.f1572 <= 0) {
                            iM450210 = C19806.m45029("ܺۙ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 23387) ^ (-554180149);
                            i8 = -251758603;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i6;
                        i7 = ((iM450210 ^ i5) * (-32203)) ^ (-254887209);
                        i8 = 2135650020;
                    case -675035642:
                    case 2028580656:
                        return;
                    case -619108028:
                    case 808905165:
                        C3660.m10791();
                        iM450210 = ThreadFactoryC3888.m11306("ۙܿ") ^ i6;
                        i7 = ((iM450210 ^ i5) * (-28769)) ^ 882733339;
                        i8 = -1215175005;
                        break;
                    case -564847249:
                    case 781915396:
                        C0629.m2911(th, th2);
                        iM450210 = (C19806.m45029("ۤ᩻") ^ i5) * 71;
                        i7 = ((iM450210 ^ i6) * (-4845)) ^ 1645570352;
                        i8 = -1044065563;
                        break;
                    case -451426774:
                    case 262432111:
                        if (C10634.f36300 < 0) {
                            iM450210 = C19806.m45029("ܰܶ") ^ i6;
                            i7 = ((iM450210 ^ i5) * (-26283)) ^ 2105941664;
                            i8 = 2034468930;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("֫ۢ") ^ i5;
                            i7 = ((iM450210 ^ i6) * 16475) ^ 1317223224;
                            i8 = 1173699530;
                        }
                        break;
                    case -153063458:
                    case -46131111:
                        if (C2788.f10625 < 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۧܿ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i7 = ((iM450210 ^ i6) * (-16959)) ^ (-563508913);
                            i8 = -883333216;
                        } else {
                            iM450210 = C19806.m45029("ܺۙ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 23387) ^ (-554180149);
                            i8 = -251758603;
                        }
                        break;
                    case -107540712:
                    case 620240482:
                        abstractC20745.mo46720();
                        if (!C0817.f3443) {
                            iM450210 = ThreadFactoryC3888.m11306("֫ۢ") ^ i5;
                            i7 = ((iM450210 ^ i6) * 16475) ^ 1317223224;
                            i8 = 1173699530;
                            break;
                        }
                        iM450210 = (i5 - ThreadFactoryC3888.m11306("ܶ᩷")) * (-29);
                        i7 = ((iM450210 ^ i6) * 18577) ^ (-1264323217);
                        i8 = -21504414;
                        break;
                    case -85157441:
                    case 514308872:
                        try {
                            C3286.m9794(outputStreamMo33976);
                            iM450210 = (C19806.m45029("ۤ᩻") ^ i5) * 71;
                            i7 = ((iM450210 ^ i6) * (-4845)) ^ 1645570352;
                            i8 = -1044065563;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM450210 = C19806.m45029("ܿۢ") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-9107)) ^ (-806620861);
                            i8 = -79954947;
                        }
                        break;
                    case -82277812:
                    case 1716086116:
                        this.f10418.compress(Bitmap.CompressFormat.PNG, i3, outputStreamMo33976);
                        iM450210 = (ThreadFactoryC3888.m11306("ܰܰ") + i6) * (-103);
                        i7 = ((iM450210 ^ i5) * (-947)) ^ (-2091268370);
                        i8 = 1282703558;
                        break;
                    case -58336059:
                    case 252519493:
                        C3743.m10966();
                        if (C1066.m4023() > 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                            i8 = -443147666;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ۙܿ") ^ i6;
                        i7 = ((iM450210 ^ i5) * (-28769)) ^ 882733339;
                        i8 = -1215175005;
                        break;
                    case 151377013:
                    case 497786180:
                        if (C1875.f7103 < 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ܿܽ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 787) ^ 146174344;
                            i8 = -2035928527;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("֫ۢ") ^ i5;
                            i7 = ((iM450210 ^ i6) * 16475) ^ 1317223224;
                            i8 = 1173699530;
                        }
                        break;
                    case 559747369:
                    case 1811580764:
                        if (C2871.f10837 < 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i6;
                            i7 = ((iM450210 ^ i5) * (-32203)) ^ (-254887209);
                            i8 = 2135650020;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                        i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                        i8 = -443147666;
                        break;
                    case 806429131:
                    case 1908899796:
                        if (C3722.f13525 > 0) {
                            iM450210 = (C19806.m45029("ܶܿ") + i5) * 7;
                            i7 = ((iM450210 ^ i6) * 22661) ^ (-1567618845);
                            i8 = 831276875;
                        } else {
                            iM450210 = C19806.m45029("ۙ֫") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-20161)) ^ (-2047400442);
                            i8 = 441746062;
                        }
                        break;
                    case 886040957:
                    case 1581030663:
                        RunnableC3388.m10064();
                        if (C2124.f7782 <= 0) {
                            iM450210 = C19806.m45029("ۙ֫") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-20161)) ^ (-2047400442);
                            i8 = 441746062;
                            break;
                        }
                        iM450210 = C19806.m45029("ܺۙ") ^ i6;
                        i7 = ((iM450210 ^ i5) * 23387) ^ (-554180149);
                        i8 = -251758603;
                        break;
                    case 1323671198:
                    case 1805475982:
                        if (C0629.f2722 > 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۙᩴ") + i5) * 109;
                            i7 = ((iM450210 ^ i6) * (-20757)) ^ 1394928364;
                            i8 = -1622476618;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i5;
                            i7 = ((iM450210 ^ i6) * (-13005)) ^ (-954772833);
                            i8 = -443147666;
                        }
                        break;
                    default:
                        C1066.m4023();
                        if (C0050.f912 <= 0) {
                            iM450210 = ThreadFactoryC3888.m11306("۬ۡ") ^ i6;
                            i7 = ((iM450210 ^ i5) * 1939) ^ 725717224;
                            i8 = -141834124;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i6;
                            i7 = ((iM450210 ^ i5) * (-32203)) ^ (-254887209);
                            i8 = 2135650020;
                        }
                        break;
                }
            }
        }
    }

    public C2707(ViewOnClickListenerC4514 viewOnClickListenerC4514, C16819 c16819, AbstractC20745 abstractC20745, int i) {
        int i2 = 1955605771;
        int i3 = C1189.f5284;
        int i4 = C3577.f13150;
        this.f10414 = viewOnClickListenerC4514;
        this.f10417 = c16819;
        this.f10415 = abstractC20745;
        this.f10416 = i;
        int iM11306 = (ThreadFactoryC3888.m11306("۠᩸") + i4) * (-81);
        int i5 = ((iM11306 ^ i3) * (-5125)) ^ 466120589;
        int i6 = 1324071879;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i3) * (-32085)) >> 31));
            switch (i2) {
                case -1609616161:
                case -492455986:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = C19806.m45029("ۢܶ") ^ i4;
                    i5 = ((iM11306 ^ i3) * (-1249)) ^ 761181126;
                    i6 = -916707570;
                    break;
                case -1287947802:
                case 1588808662:
                    C0797.m3359();
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18513)) ^ (-357571046);
                        i6 = 985836939;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1249)) ^ 761181126;
                        i6 = -916707570;
                    }
                    break;
                case -772824635:
                case 1402059209:
                    C1668.m5583();
                    throw new RuntimeException();
                case -601371488:
                case 2005086116:
                    RunnableC1606.m5473();
                    if (C1937.f7317 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-39);
                        i5 = ((iM11306 ^ i4) * (-12455)) ^ 1208998838;
                        i6 = 1449558339;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1249)) ^ 761181126;
                        i6 = -916707570;
                    }
                    break;
                case -199522769:
                case 1478418473:
                    return;
                case 268669476:
                case 1666879289:
                    RunnableC1606.m5473();
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ܺ᩹") ^ i4) * (-23);
                        i5 = ((iM11306 ^ i3) * 1671) ^ (-483077329);
                        i6 = -878462804;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-39);
                        i5 = ((iM11306 ^ i4) * (-12455)) ^ 1208998838;
                        i6 = 1449558339;
                    }
                    break;
                default:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("֨֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26631) ^ 1919414451;
                        i6 = 1615174933;
                    } else {
                        iM11306 = C19806.m45029("۬᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29969)) ^ 1299218356;
                        i6 = -2074227438;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098 A[PHI: r4
      0x0098: PHI (r4v4 l.᩵֨) = (r4v3 l.᩵֨), (r4v2 l.᩵֨) binds: [B:23:0x0096, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x012e A[PHI: r2 r14 r15
      0x012e: PHI (r2v4 l.ۙ۠ۘ) = (r2v3 l.ۙ۠ۘ), (r2v2 l.ۙ۠ۘ) binds: [B:36:0x012c, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:36:0x012c, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:36:0x012c, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r5 r6 r9 r10
      0x0202: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:55:0x0200, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:55:0x0200, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:55:0x0200, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:55:0x0200, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0235 A[PHI: r7 r11 r12 r21
      0x0235: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0233, B:51:0x01dd, B:47:0x01ba, B:32:0x0108, B:17:0x007b, B:15:0x0077, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:59:0x0233, B:51:0x01dd, B:47:0x01ba, B:32:0x0108, B:17:0x007b, B:15:0x0077, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r12v4 short) = (r12v2 short), (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:59:0x0233, B:51:0x01dd, B:47:0x01ba, B:32:0x0108, B:17:0x007b, B:15:0x0077, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:59:0x0233, B:51:0x01dd, B:47:0x01ba, B:32:0x0108, B:17:0x007b, B:15:0x0077, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0265 A[PHI: r3 r16
      0x0265: PHI (r3v4 l.ܽᩴۘ) = (r3v2 l.ܽᩴۘ), (r3v3 l.ܽᩴۘ), (r3v2 l.ܽᩴۘ), (r3v2 l.ܽᩴۘ) binds: [B:63:0x0263, B:27:0x00cf, B:15:0x0077, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0263, B:27:0x00cf, B:15:0x0077, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM45029;
        int i;
        int i2;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C3577.f13150;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("᩻ᩳ")) * 55;
        int i5 = ((iM11306 ^ i3) * (-8683)) ^ 1677555424;
        C19122 c19122 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ (-461071774);
        int iM11307 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 895219679;
        char c = 0;
        C16819 c16819 = null;
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-26491)) >> 31));
            switch (i13) {
                case -2138668422:
                case -1598959548:
                    c19122 = c16819.f53829;
                    if (C0050.f912 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ᩴܳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM45029 ^ i4) * 9079) ^ 1596539512;
                        i2 = 102920179;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 10271) ^ (-373706904);
                        i2 = -1611850401;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2118731426:
                case -1496168889:
                    if (C1977.f7413 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = C19806.m45029("᩷ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20189)) ^ (-1765015787);
                        i2 = -1377062171;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1988385855:
                case 667181432:
                    i11 = 29472;
                    iM45029 = (C19806.m45029("᩷ܿ") + i3) * 19;
                    i = ((iM45029 ^ i4) * 4287) ^ (-179386638);
                    i2 = 633531153;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1977153377:
                case 1633484732:
                    if (C2642.m8171() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i3) * (-29673)) ^ (-647173554);
                        i2 = -401107858;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1766304871:
                case 586032939:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩷ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20189)) ^ (-1765015787);
                        i2 = -1377062171;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ᩴܳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM45029 ^ i4) * 9079) ^ 1596539512;
                        i2 = 102920179;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1574874458:
                case 114282263:
                    i10 = i9 + 273273961;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") + i3) * (-85);
                        i = ((iM45029 ^ i4) * 32647) ^ 681920114;
                        i2 = -541091081;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1570799339:
                case 1192800592:
                    i8 = 3;
                    if (C0216.m1591() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵᩹")) * (-79);
                        i = ((iM45029 ^ i4) * (-25357)) ^ (-412296800);
                        i2 = 1550580466;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1511544433:
                case 1498151737:
                    sArr = f10413;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("᩷ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20189)) ^ (-1765015787);
                        i2 = -1377062171;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i4;
                        i = ((iM45029 ^ i3) * (-19505)) ^ (-472451747);
                        i2 = -1122906529;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1340795760:
                case 830202402:
                    m10246(viewOnClickListenerC4514, iM11307 ^ i7);
                    c16819 = this.f10417;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩷ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20189)) ^ (-1765015787);
                        i2 = -1377062171;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡۡ")) * (-61);
                        i = ((iM45029 ^ i4) * (-9671)) ^ 969977796;
                        i2 = 719628253;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -693433458:
                case 1543581528:
                    this.f10418 = DialogInterfaceOnClickListenerC8128.m21396(c19122.getDrawable());
                    break;
                case -552085619:
                case 668759366:
                    c = '\r';
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = C19806.m45029("ܺܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24631)) ^ (-265156251);
                        i2 = 190978484;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -137539110:
                case 1109668708:
                    s = sArr[c];
                    i9 = s * s;
                    if (C1398.m4895() <= 0) {
                        iM45029 = C19806.m45029("֫᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 6891) ^ (-1098336852);
                        i2 = 672856066;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۘ") ^ i4) * (-113);
                        i = ((iM45029 ^ i3) * (-21475)) ^ (-2113005702);
                        i2 = 150851890;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -68969780:
                case 1438401648:
                    viewOnClickListenerC4514 = this.f10414;
                    sArr2 = f10413;
                    i12 = 14;
                    if (RunnableC1895.f7152) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴۛ")) * (-117);
                        i = ((iM45029 ^ i3) * (-23305)) ^ 1212963668;
                        i2 = -470476111;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i3) * (-29673)) ^ (-647173554);
                        i2 = -401107858;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 34473837:
                case 436463955:
                    CallableC1627.m5507();
                    break;
                case 164290084:
                case 1995127819:
                    if (i10 - (s * s2) >= 0) {
                        iM45029 = (C19806.m45029("֫֨") ^ i3) * (-51);
                        i = ((iM45029 ^ i4) * 11619) ^ (-1202400453);
                        i2 = 2137532784;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩺") ^ i4) * 91;
                        i = ((iM45029 ^ i3) * 14795) ^ (-66158305);
                        i2 = 551027417;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 281978550:
                case 1955270484:
                    s2 = 33062;
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                        i2 = -2133963714;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۜ᩶")) * 23;
                        i = ((iM45029 ^ i3) * (-31835)) ^ 715526931;
                        i2 = -1632614892;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 429770630:
                case 562745458:
                    i11 = 31052;
                    iM45029 = (C19806.m45029("᩷ܿ") + i3) * 19;
                    i = ((iM45029 ^ i4) * 4287) ^ (-179386638);
                    i2 = 633531153;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 437896225:
                case 925223911:
                    C3722.m10894();
                    C2788.m8472();
                    iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i4;
                    i = ((iM45029 ^ i3) * (-2597)) ^ (-491648652);
                    i2 = -2133963714;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    iM11307 = ThreadFactoryC3888.m11306(C1189.m4365(sArr2, i12, i8, i11));
                    i7 = 2102311065;
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("֫᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 6891) ^ (-1098336852);
                        i2 = 672856066;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۗ᩻")) * 57;
                        i = ((iM45029 ^ i3) * 17543) ^ 1260316462;
                        i2 = 1174752053;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2707.mo1157():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C0797.m3353(this);
        C2788.m8475();
    }
}
