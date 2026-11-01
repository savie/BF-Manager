package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܶ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 42TB */
/* JADX INFO: loaded from: classes.dex */
public final class C14892 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long f48652;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48653 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f48654;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f48655;

    /* JADX INFO: renamed from: ᩺۫ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f48656;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C21947 m35591(C11986 c11986, JSONObject jSONObject, JSONObject jSONObject2, boolean z);

    /* JADX WARN: Bottom block not found for handler: all -> 0x03c3 */
    /* JADX WARN: Code duplicated, block: B:62:0x0190 A[Catch: all -> 0x0298, TryCatch #18 {all -> 0x0298, blocks: (B:33:0x00e8, B:34:0x00f7, B:36:0x00fd, B:39:0x010a, B:41:0x011d, B:44:0x0132, B:46:0x0141, B:49:0x0155, B:51:0x0159, B:53:0x0169, B:55:0x0179, B:62:0x0190, B:64:0x01a0, B:65:0x01d6, B:66:0x01db, B:68:0x01df, B:69:0x01e9), top: B:254:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0 A[Catch: all -> 0x0298, TryCatch #18 {all -> 0x0298, blocks: (B:33:0x00e8, B:34:0x00f7, B:36:0x00fd, B:39:0x010a, B:41:0x011d, B:44:0x0132, B:46:0x0141, B:49:0x0155, B:51:0x0159, B:53:0x0169, B:55:0x0179, B:62:0x0190, B:64:0x01a0, B:65:0x01d6, B:66:0x01db, B:68:0x01df, B:69:0x01e9), top: B:254:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6 A[Catch: all -> 0x0298, TryCatch #18 {all -> 0x0298, blocks: (B:33:0x00e8, B:34:0x00f7, B:36:0x00fd, B:39:0x010a, B:41:0x011d, B:44:0x0132, B:46:0x0141, B:49:0x0155, B:51:0x0159, B:53:0x0169, B:55:0x0179, B:62:0x0190, B:64:0x01a0, B:65:0x01d6, B:66:0x01db, B:68:0x01df, B:69:0x01e9), top: B:254:0x00e8 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized l.C22653 m35592(l.C11986 r17) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14892.m35592(l.ۨ᩹ۘ):l.᩺֨ۘ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35595(EnumC9493 enumC9493) {
        int i = 1506157240;
        int i2 = C0050.f912;
        int i3 = C3660.f13403;
        int iM45029 = C19806.m45029("᩸ۙ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 7995) ^ (-712981402);
        int i5 = 1900334777;
        while (true) {
            i = ((((i ^ i2) * (-11279)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2130248544:
                case -1338107401:
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("֨ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10891)) ^ (-1673233215);
                        i5 = 1014164740;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ۠")) * (-51);
                        i4 = ((iM45029 ^ i3) * 15697) ^ (-1197149012);
                        i5 = 1642111201;
                    }
                    break;
                case -2064765132:
                case 1254293362:
                    C0216.m1591();
                    AbstractC0464.m2313();
                    iM45029 = (i2 - C19806.m45029("ܰۤ")) * 89;
                    i4 = ((iM45029 ^ i3) * (-4575)) ^ (-1430736025);
                    i5 = 2075103206;
                    break;
                case -2023072645:
                case -1550454528:
                    if (C0671.m3008() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-469)) ^ (-1968500748);
                        i5 = 1716371266;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۟ۚ")) * (-51);
                        i4 = ((iM45029 ^ i3) * 9243) ^ (-1337788906);
                        i5 = -1489290455;
                    }
                    break;
                case -1871079779:
                case 992312952:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ᩴۚ")) * 119;
                        i4 = ((iM45029 ^ i2) * (-19799)) ^ (-844432674);
                        i5 = 77543951;
                    } else {
                        iM45029 = C19806.m45029("ܰ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8011) ^ (-626455813);
                        i5 = 748182587;
                    }
                    break;
                case -1811710242:
                case 1955864385:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6831) ^ (-97037556);
                        i5 = 291098811;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-469)) ^ (-1968500748);
                        i5 = 1716371266;
                    }
                    break;
                case -1471455451:
                case 152506058:
                    if (enumC9493.m24320()) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴۜ")) * 47;
                        i4 = ((iM45029 ^ i3) * 9757) ^ 1941586271;
                        i5 = -480634237;
                    } else {
                        iM45029 = C19806.m45029("۫ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23121) ^ 95859527;
                        i5 = -774387434;
                    }
                    break;
                case -1411614001:
                case 325174854:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-469)) ^ (-1968500748);
                        i5 = 1716371266;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15327)) ^ (-532213393);
                        i5 = 1997477745;
                    }
                    break;
                case -1379683209:
                case -236752430:
                    if (!C3286.f12186) {
                        iM45029 = (i3 - C19806.m45029("ᩴۚ")) * 119;
                        i4 = ((iM45029 ^ i2) * (-19799)) ^ (-844432674);
                        i5 = 77543951;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܰۤ")) * 89;
                        i4 = ((iM45029 ^ i3) * (-4575)) ^ (-1430736025);
                        i5 = 2075103206;
                    }
                    break;
                case -1303406400:
                case -846328210:
                    C0629.m2907();
                    if (C1398.f5802 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-469)) ^ (-1968500748);
                        i5 = 1716371266;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ᩴۚ")) * 119;
                        i4 = ((iM45029 ^ i2) * (-19799)) ^ (-844432674);
                        i5 = 77543951;
                    }
                    break;
                case -591593654:
                case 1484666819:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܰۤ")) * 89;
                        i4 = ((iM45029 ^ i3) * (-4575)) ^ (-1430736025);
                        i5 = 2075103206;
                    } else {
                        iM45029 = C19806.m45029("֡ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18315)) ^ 1058496788;
                        i5 = -2131060215;
                    }
                    break;
                case -537772524:
                case 1567883208:
                    if (C0050.m946() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛᩳ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 14765) ^ (-765060098);
                        i5 = 930953846;
                    } else {
                        iM45029 = C19806.m45029("ۜۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6617) ^ 836682615;
                        i5 = 663806772;
                    }
                    break;
                case -420883301:
                case 843492486:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - C19806.m45029("᩹ۤ")) * (-69);
                        i4 = ((iM45029 ^ i2) * 28681) ^ (-1546359400);
                        i5 = -1717941997;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܰۤ")) * 89;
                        i4 = ((iM45029 ^ i3) * (-4575)) ^ (-1430736025);
                        i5 = 2075103206;
                    }
                    break;
                case -316763535:
                case 1622286755:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܰۤ")) * 89;
                        i4 = ((iM45029 ^ i3) * (-4575)) ^ (-1430736025);
                        i5 = 2075103206;
                    } else {
                        iM45029 = C19806.m45029("᩹ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24421) ^ 1658671913;
                        i5 = 1259464073;
                    }
                    break;
                case 30419889:
                case 1204692802:
                    C1875.m6086();
                    break;
                case 132750218:
                case 391384819:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛᩳ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 14765) ^ (-765060098);
                        i5 = 930953846;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۛ֫")) * (-53);
                        i4 = ((iM45029 ^ i3) * (-8253)) ^ (-1158541703);
                        i5 = 843858235;
                    }
                    break;
                case 408971926:
                case 990237047:
                    break;
                case 1134973122:
                case 1182348798:
                    f48654 = null;
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴۜ")) * 47;
                    i4 = ((iM45029 ^ i3) * 9757) ^ 1941586271;
                    i5 = -480634237;
                    break;
                default:
                    if (!RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-469)) ^ (-1968500748);
                        i5 = 1716371266;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ۠")) * (-51);
                        i4 = ((iM45029 ^ i3) * 15697) ^ (-1197149012);
                        i5 = 1642111201;
                    }
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC6132.m17119(130);
        f48656 = new short[]{5770, -30336, -30311, -30307, 5005, -3776, -3766, -3770, -3769, -3833, -3746, -3764, -3765, -3751, -3776, -3766, -3770, -3769, -3833, -3751, -3769, -3762, -3776, -3766, -3770, -3769, -3833, -3773, -3751, -3762, 253, 4627, 4664, 4640, 4665, 4667, 4664, 4662, 4659, 4727, 4657, 4662, 4670, 4667, 4658, 4659, 4728, 4647, 4667, 4642, 4656, 4670, 4665, 4728, 4728, 4728, 4647, 4667, 4642, 4656, 4670, 4665, 4729, 4666, 4643, 4647, 4662, 4642, 4643, 4671, 7080, 26633, 26708, 26691, 26689, 26703, 26709, 26706, 26691, 26708, 26695, 26707, 26706, 26702, 26696, 26695, 26699, 26691, 4391, 29614, 29681, 29677, 29684, 29670, 29672, 29679, 29614, 29669, 29668, 29687, 29614, 29684, 29681, 29677, 29678, 29664, 29669, 29619, 29669, 29668, 29682, 29666, 29683, 29672, 29681, 29685, 29672, 29678, 29679, 29684, 29681, 29669, 29664, 29685, 29668, 29634, 29678, 29679, 29685, 29668, 29679, 29685, 29684, 29681, 29669, 29664, 29685, 29668, 29681, 29684, 29667, 29677, 29672, 29682, 29673, 29676, 29678, 29669, 29668, 29676, 29669, 29620, 7934, -27587, -27615, -27592, -27606, -27612, -27613, -27630, -27602, -27608, -27613, -27591, -27608, -27585, -27630, -27592, -27587, -27615, -27614, -27604, -27607, -27630, -1202, -7020, -12800, -27529, -27549, -27616, -27591, -27587, -27549, -27616, -27591, -27587, -27586, -27585, -27602, -27550, -27612, -27602, -27614, -27613, -27549, -27590, -27608, -27601, -27587, -27615, -27612, -27601, -27586, -27550, -27624, -27613, -27610, -27613, -27614, -27590, -27613, -27539, -27608, -27585, -27585, -27614, -27585, -27549, -27609, -27604, -27589, -27604, -27612, -27602, -27614, -27613, -27549, -27587, -27613, -27606, -27549, -27609, -27604, -27585, -27612, -27602, -27614, -27613, -27549, -27609, -27587, -27606, -27616, -27604, -27613, -27612, -27605, -27608, -27586, -27591, -27549, -27609, -27586, -27614, -27613, -27612, -27602, -27614, -27613, -27549, -27590, -27608, -27601, -27587, -27612, -27602, -27614, -27613, -27549, -27587, -27613, -27606, -27612, -27602, -27614, -27613, -27549, -27609, -27587, -27606, -27602, -27615, -27604, -27586, -27586, -27608, -27586, -27549, -27607, -27608, -27595, -27607, -27608, -27595, -27648, -27614, -27607, -27608, -27616, -27604, -27613, -27612, -27605, -27608, -27586, -27591, -27549, -27609, -27586, -27614, -27613, 4577, 9799, 9752, 9732, 9757, 9743, 9729, 9734, 9799, 9799, 9799, 9729, 9739, 9735, 9734, 9798, 9752, 9734, 9743, 7055, 18113, 22048, -17389, 8678, 8666, 8643, 8657, 8671, 8664, 8703, 8661, 8665, 8664, 8588, 8588, 4098, -22026, -22103, -22091, -22100, -22082, -22096, -22089, -22026, -22135, -22091, -22100, -22082, -22096, -22089, -22128, -22086, -22090, -22089, -22045, -22045, -22026, -22026, -22096, -22086, -22090, -22089, -22025, -22103, -22089, -22082, 6112, 14709, 14654, 14655, 14636, 14655, 14646, 14645, 14634, 14655, 14632, 14651, 14639, 14638, 14642};
        HashMap map = null;
        int i = 598045569;
        int i2 = C2642.f10294;
        int i3 = C3535.f13026;
        int iM45029 = C19806.m45029("ᩳܿ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 23163) ^ 521060557;
        int i5 = 51534558;
        while (true) {
            i = ((((i ^ i3) * (-26099)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2061110475:
                case 1784244937:
                    if (C1419.m4973()) {
                        iM45029 = (C19806.m45029("ܰ᩺") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9761)) ^ 1441099071;
                        i5 = -488159728;
                    } else {
                        iM45029 = (C19806.m45029("۫ܶ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 2853) ^ (-974360320);
                        i5 = -792925847;
                    }
                    break;
                case -1580856920:
                case 1519167286:
                    C1025.m3864(new RunnableC0779());
                    return;
                case -1530552337:
                case 55432346:
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("ܰ᩺") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9761)) ^ 1441099071;
                        i5 = -488159728;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5327)) ^ (-615771332);
                        i5 = 582660089;
                    }
                    break;
                case -1445598831:
                case 1543500017:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫֫")) * 127;
                        i4 = ((iM45029 ^ i2) * 32021) ^ 437354462;
                        i5 = 1799850225;
                    } else {
                        iM45029 = (C19806.m45029("֨᩷") + i2) * 23;
                        i4 = ((iM45029 ^ i3) * 7513) ^ 1525370957;
                        i5 = 621422923;
                    }
                    break;
                case -1208509031:
                case -234867324:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫֫")) * 127;
                        i4 = ((iM45029 ^ i2) * 32021) ^ 437354462;
                        i5 = 1799850225;
                    } else {
                        iM45029 = C19806.m45029("᩵֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16105) ^ 869700378;
                        i5 = -1698844452;
                    }
                    break;
                case -935435965:
                case -765479500:
                    AbstractC0464.m2313();
                    C1025.m3861();
                    throw new RuntimeException();
                case -760593537:
                case 2103027835:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܿ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 24263) ^ 1980256128;
                        i5 = -1171472529;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۢ") + i2) * 63;
                        i4 = ((iM45029 ^ i3) * (-27841)) ^ 1715395344;
                        i5 = 828272147;
                    }
                    break;
                case -543497054:
                case -164527457:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܿ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 24263) ^ 1980256128;
                        i5 = -1171472529;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۤۜ")) * (-21);
                        i4 = ((iM45029 ^ i2) * (-20527)) ^ (-24407709);
                        i5 = 1736814067;
                    }
                    break;
                case -458993616:
                case 1070383737:
                    C2249.m6915();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ᩴۙ")) * 17;
                        i4 = ((iM45029 ^ i3) * 11483) ^ (-1988213621);
                        i5 = 1664100047;
                    } else {
                        iM45029 = (C19806.m45029("ܰ᩺") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9761)) ^ 1441099071;
                        i5 = -488159728;
                    }
                    break;
                case -436162525:
                case 715186274:
                    if (C2788.m8472() == 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫֫")) * 127;
                        i4 = ((iM45029 ^ i2) * 32021) ^ 437354462;
                        i5 = 1799850225;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩴۙ")) * 17;
                        i4 = ((iM45029 ^ i3) * 11483) ^ (-1988213621);
                        i5 = 1664100047;
                    }
                    break;
                case -129418753:
                case 2049708650:
                    C3286.m9798();
                    if (C2249.f8050 < 0) {
                        iM45029 = (C19806.m45029("ܰ᩺") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9761)) ^ 1441099071;
                        i5 = -488159728;
                    } else {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13547)) ^ 1301951957;
                        i5 = -842533711;
                    }
                    break;
                case 78954675:
                case 1321698510:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("ܰ᩺") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9761)) ^ 1441099071;
                        i5 = -488159728;
                    } else {
                        iM45029 = C19806.m45029("ۗۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2009) ^ (-1382446856);
                        i5 = -1151451355;
                    }
                    break;
                case 172920107:
                case 1077088549:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ᩴۙ")) * 17;
                        i4 = ((iM45029 ^ i3) * 11483) ^ (-1988213621);
                        i5 = 1664100047;
                    } else {
                        iM45029 = (C19806.m45029("ۨ۟") ^ i3) * (-89);
                        i4 = ((iM45029 ^ i2) * (-9129)) ^ 1351784499;
                        i5 = -1369108501;
                    }
                    break;
                case 478813128:
                case 1448994390:
                    map = new HashMap();
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13547)) ^ 1301951957;
                        i5 = -842533711;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ۫")) * (-105);
                        i4 = ((iM45029 ^ i2) * (-8469)) ^ (-508987890);
                        i5 = -157379583;
                    }
                    break;
                case 1175008319:
                case 1700433483:
                    CallableC1627.m5507();
                    C1398.m4895();
                    iM45029 = C19806.m45029("᩷ۖ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-13547)) ^ 1301951957;
                    i5 = -842533711;
                    break;
                default:
                    f48655 = map;
                    if (C1025.m3861() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܿ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 24263) ^ 1980256128;
                        i5 = -1171472529;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25319)) ^ 1210381099;
                        i5 = 1158997972;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x026a A[PHI: r3 r7 r13 r14 r15 r21
      0x026a: PHI (r3v3 short[]) = (r3v2 short[]), (r3v2 short[]), (r3v4 short[]) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r21v16 java.lang.String) = (r21v5 java.lang.String), (r21v15 java.lang.String), (r21v18 java.lang.String) binds: [B:63:0x0268, B:36:0x0124, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c6 A[PHI: r5 r17 r21 r22
      0x02c6: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:71:0x02c4, B:67:0x02a4, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:71:0x02c4, B:67:0x02a4, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r21v22 java.lang.String) = (r21v3 java.lang.String), (r21v4 java.lang.String), (r21v23 java.lang.String) binds: [B:71:0x02c4, B:67:0x02a4, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r22v5 int) = (r22v3 int), (r22v4 int), (r22v3 int) binds: [B:71:0x02c4, B:67:0x02a4, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02f2 A[PHI: r2 r8 r16 r21
      0x02f2: PHI (r2v4 l.ۚ֨ۘ) = (r2v2 l.ۚ֨ۘ), (r2v2 l.ۚ֨ۘ), (r2v3 l.ۚ֨ۘ), (r2v2 l.ۚ֨ۘ) binds: [B:15:0x0076, B:59:0x0243, B:40:0x014e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:15:0x0076, B:59:0x0243, B:40:0x014e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:15:0x0076, B:59:0x0243, B:40:0x014e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r21v25 java.lang.String) = (r21v2 java.lang.String), (r21v6 java.lang.String), (r21v14 java.lang.String), (r21v28 java.lang.String) binds: [B:15:0x0076, B:59:0x0243, B:40:0x014e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21947 m35590(String str) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1148.f5161;
        int i4 = C1461.f5957;
        int iM11307 = (ThreadFactoryC3888.m11306("ܳۤ") ^ i3) * (-103);
        int i5 = ((iM11307 ^ i4) * (-15023)) ^ 1141619987;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM11307 ^ (-574913968);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 918194378;
        int i15 = 0;
        C5013 c5013M13902 = null;
        String str2 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 11163) >> 31));
            switch (i14) {
                case -2120321410:
                case -1303631960:
                    str2 = str2;
                    sArr3 = f48656;
                    i12 = 80;
                    i13 = 4;
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i4) * 9209) ^ (-476020935);
                        i2 = 1140386018;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۤᩳ")) * (-11);
                        i = ((iM11306 ^ i3) * (-9765)) ^ (-124403086);
                        i2 = -282454329;
                    }
                    String str3 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str3;
                    break;
                case -1994924767:
                case 1702050115:
                    ViewTreeObserverOnPreDrawListenerC3327.m9867(c5013M13902, ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr4, i7, 4, i9), str);
                    return c5013M13902.m13910();
                case -1918464697:
                case 44749077:
                    str2 = str2;
                    if (i8 - (s * s2) >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۚۨ")) * (-21);
                        i = ((iM11306 ^ i3) * (-15411)) ^ 1308664005;
                        i2 = -1295155439;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * (-3457)) ^ (-766628376);
                        i2 = -1832708808;
                    }
                    String str4 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str4;
                    break;
                case -1914667466:
                case -957436104:
                    RunnableC1564.m5345();
                    if (!C3743.f13569) {
                        str2 = str2;
                        iM11306 = (C19806.m45029("۬ۜ") + i3) * 19;
                        i = ((iM11306 ^ i4) * (-4621)) ^ (-1286716046);
                        i2 = 1982143664;
                        String str5 = str2;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        str2 = str5;
                    } else {
                        int iM45029 = (C19806.m45029("ۙᩳ") + i3) * 65;
                        i6 = iM45029 ^ (-1931496197);
                        i5 = ((iM45029 ^ i4) * 835) ^ (-2136013934);
                    }
                    break;
                case -1828832776:
                case 578760881:
                    ViewTreeObserverOnPreDrawListenerC3327.m9867(c5013M13902, C2871.m8640(sArr3, i12, i13, i9), str2);
                    sArr4 = f48656;
                    if (C2124.f7782 <= 0) {
                        str2 = str2;
                        iM11306 = (i4 - C19806.m45029("ۤᩳ")) * (-11);
                        i = ((iM11306 ^ i3) * (-9765)) ^ (-124403086);
                        i2 = -282454329;
                    } else {
                        iM11306 = (C19806.m45029("ܳܳ") + i4) * 23;
                        str2 = str2;
                        i = ((iM11306 ^ i3) * 8831) ^ (-1173980817);
                        i2 = 1561809135;
                    }
                    String str6 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str6;
                    break;
                case -1484425152:
                case 2077135023:
                    str2 = str2;
                    c = 'F';
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("۬ۜ") + i3) * 19;
                        i = ((iM11306 ^ i4) * (-4621)) ^ (-1286716046);
                        i2 = 1982143664;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-29851)) ^ 376755241;
                        i2 = 1529372574;
                    }
                    String str7 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str7;
                    break;
                case -1405457238:
                case -541727077:
                    if (C1937.m6279() >= 0) {
                        str2 = str2;
                        i7 = 84;
                        iM11306 = C19806.m45029("ᩴܽ") ^ i3;
                        i = ((iM11306 ^ i4) * 28117) ^ (-195884069);
                        i2 = -1967796161;
                        String str8 = str2;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        str2 = str8;
                    } else {
                        int iM11308 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * (-51);
                        i6 = iM11308 ^ (-358045196);
                        i5 = ((iM11308 ^ i4) * 5701) ^ 1696643590;
                        i7 = 84;
                    }
                    break;
                case -1085431592:
                case -545291910:
                    str2 = str2;
                    i8 = i15 + 142062561;
                    if (C3286.f12186) {
                        iM11306 = (i4 - C19806.m45029("ۤᩳ")) * (-11);
                        i = ((iM11306 ^ i3) * (-9765)) ^ (-124403086);
                        i2 = -282454329;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۜ") + i3) * 51;
                        i = ((iM11306 ^ i4) * (-331)) ^ 2052717584;
                        i2 = -1428073412;
                    }
                    String str9 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str9;
                    break;
                case -985733525:
                case -37531112:
                    String strM35587 = m35587();
                    if (strM35587 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩴ") ^ i4;
                        str2 = strM35587;
                        i = ((iM11306 ^ i3) * (-8541)) ^ 309932917;
                        i2 = 1627323104;
                    } else {
                        str2 = strM35587;
                        iM11306 = C19806.m45029("᩺᩷") ^ i4;
                        i = ((iM11306 ^ i3) * 27753) ^ (-1712221796);
                        i2 = 1750903795;
                    }
                    String str10 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str10;
                    break;
                case -895037122:
                case 535098441:
                    i9 = 27476;
                    iM11306 = (i3 - C19806.m45029("۠ܿ")) * (-97);
                    i = ((iM11306 ^ i4) * 10361) ^ 2031448560;
                    i2 = 1621080416;
                    String str11 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str11;
                    break;
                case -840748594:
                case -535248870:
                    C0278.m1789();
                    RunnableC1606.m5473();
                    return null;
                case -633437670:
                case -164231933:
                    str2 = str2;
                    s2 = 23838;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i4) * (-19);
                        i = ((iM11306 ^ i3) * 4775) ^ (-1856263959);
                        i2 = -40917744;
                    } else {
                        iM11306 = C19806.m45029("ۢ۫") ^ i3;
                        i = ((iM11306 ^ i4) * (-8687)) ^ (-1354457457);
                        i2 = 2098811067;
                    }
                    String str12 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str12;
                    break;
                case -593839005:
                case 1219899200:
                    if (C1148.f5161 <= 0) {
                        str2 = str2;
                        iM11306 = C19806.m45029("ᩴܽ") ^ i3;
                        i = ((iM11306 ^ i4) * 28117) ^ (-195884069);
                        i2 = -1967796161;
                        String str13 = str2;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        str2 = str13;
                    }
                    str2 = str2;
                    iM11306 = (C19806.m45029("۬ۜ") + i3) * 19;
                    i = ((iM11306 ^ i4) * (-4621)) ^ (-1286716046);
                    i2 = 1982143664;
                    String str14 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str14;
                    break;
                case -272839600:
                case 809163117:
                    str2 = str2;
                    sArr2 = f48656;
                    i10 = 71;
                    i11 = 9;
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ᩴܽ") ^ i3;
                        i = ((iM11306 ^ i4) * 28117) ^ (-195884069);
                        i2 = -1967796161;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۙ") ^ i3;
                        i = ((iM11306 ^ i4) * (-9683)) ^ 1689301728;
                        i2 = 237369008;
                    }
                    String str15 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str15;
                    break;
                case -184174959:
                case -48236645:
                    if (C2249.f8050 >= 0) {
                        str2 = str2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i4) * (-19);
                        i = ((iM11306 ^ i3) * 4775) ^ (-1856263959);
                        i2 = -40917744;
                        String str16 = str2;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        str2 = str16;
                    } else {
                        int iM450210 = (C19806.m45029("ۙᩳ") + i3) * 65;
                        i6 = iM450210 ^ (-1931496197);
                        i5 = ((iM450210 ^ i4) * 835) ^ (-2136013934);
                    }
                    break;
                case 55466993:
                case 544974192:
                    str2 = str2;
                    s = sArr[c];
                    i15 = s * s;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("۬ۜ") + i3) * 19;
                        i = ((iM11306 ^ i4) * (-4621)) ^ (-1286716046);
                        i2 = 1982143664;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * (-10823)) ^ (-659111067);
                        i2 = -2028314398;
                    }
                    String str17 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str17;
                    break;
                case 205880261:
                case 1516005781:
                    C1148.m4232();
                    int iM450211 = (C19806.m45029("ۙᩳ") + i3) * 65;
                    i6 = iM450211 ^ (-1931496197);
                    i5 = ((iM450211 ^ i4) * 835) ^ (-2136013934);
                    break;
                case 219058198:
                case 2089938355:
                    i9 = 26662;
                    iM11306 = (i3 - C19806.m45029("۠ܿ")) * (-97);
                    i = ((iM11306 ^ i4) * 10361) ^ 2031448560;
                    i2 = 1621080416;
                    String str18 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str18;
                    break;
                case 643958232:
                case 949520860:
                    return new C21947(2);
                case 1077198763:
                case 1905627537:
                    str2 = str2;
                    c5013M13902 = C5013.m13902(C0629.m2906(sArr2, i10, i11, i9));
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i4) * (-19);
                        i = ((iM11306 ^ i3) * 4775) ^ (-1856263959);
                        i2 = -40917744;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-7523)) ^ 2047640661;
                        i2 = -366349104;
                    }
                    String str19 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str19;
                    break;
                default:
                    str2 = str2;
                    sArr = f48656;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i4) * (-19);
                        i = ((iM11306 ^ i3) * 4775) ^ (-1856263959);
                        i2 = -40917744;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩵") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i4) * 28953) ^ 1649183854;
                        i2 = -128797110;
                    }
                    String str110 = str2;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    str2 = str110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012f A[PHI: r1 r14
      0x012f: PHI (r1v61 long) = (r1v41 long), (r1v1 long), (r1v54 long), (r1v1 long) binds: [B:40:0x012d, B:26:0x00a2, B:22:0x007d, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:40:0x012d, B:26:0x00a2, B:22:0x007d, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0198 A[PHI: r20
      0x0198: PHI (r20v16 long) = (r20v12 long), (r20v17 long) binds: [B:48:0x0181, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ba A[PHI: r5 r8 r9 r20
      0x02ba: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:75:0x02b8, B:63:0x0243, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02ba: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:75:0x02b8, B:63:0x0243, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02ba: PHI (r9v3 short) = (r9v1 short), (r9v2 short), (r9v1 short) binds: [B:75:0x02b8, B:63:0x0243, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02ba: PHI (r20v26 long) = (r20v3 long), (r20v6 long), (r20v27 long) binds: [B:75:0x02b8, B:63:0x0243, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02ed A[PHI: r3 r4 r6 r12 r13 r20
      0x02ed: PHI (r3v4 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r4v4 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r12v4 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r13v4 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r20v30 long) = (r20v2 long), (r20v4 long), (r20v13 long), (r20v31 long) binds: [B:79:0x02eb, B:71:0x029b, B:44:0x0164, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (l.C19806.f63586 == false) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m35587() {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14892.m35587():java.lang.String");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m35596() {
        f48654 = null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011e A[PHI: r2 r5 r14 r15
      0x011e: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:37:0x011c, B:33:0x00f9, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:37:0x011c, B:33:0x00f9, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:37:0x011c, B:33:0x00f9, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:37:0x011c, B:33:0x00f9, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01e0 A[PHI: r4 r10 r11
      0x01e0: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:53:0x01de, B:25:0x00b3, B:12:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:53:0x01de, B:25:0x00b3, B:12:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:53:0x01de, B:25:0x00b3, B:12:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0237 A[PHI: r9 r22
      0x0237: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:61:0x0235, B:57:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r22v5 short) = (r22v4 short), (r22v3 short) binds: [B:61:0x0235, B:57:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x026a A[PHI: r3 r6 r7 r12
      0x026a: PHI (r3v4 l.ۚ֨ۘ) = (r3v2 l.ۚ֨ۘ), (r3v2 l.ۚ֨ۘ), (r3v3 l.ۚ֨ۘ), (r3v2 l.ۚ֨ۘ), (r3v2 l.ۚ֨ۘ), (r3v2 l.ۚ֨ۘ), (r3v2 l.ۚ֨ۘ) binds: [B:65:0x0268, B:49:0x01bd, B:29:0x00d7, B:17:0x008b, B:15:0x0087, B:12:0x007f, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r6v4 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:65:0x0268, B:49:0x01bd, B:29:0x00d7, B:17:0x008b, B:15:0x0087, B:12:0x007f, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:65:0x0268, B:49:0x01bd, B:29:0x00d7, B:17:0x008b, B:15:0x0087, B:12:0x007f, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:65:0x0268, B:49:0x01bd, B:29:0x00d7, B:17:0x008b, B:15:0x0087, B:12:0x007f, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x029e A[PHI: r16 r17
      0x029e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:69:0x029c, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:69:0x029c, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21947 m35598() {
        int iM45029;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = C1977.f7413;
        int iM11306 = (ThreadFactoryC3888.m11306("᩹ܳ") ^ i3) * (-15);
        int i5 = ((iM11306 ^ i4) * 22019) ^ (-1743642268);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 244459569;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -1558019999;
        short s2 = 0;
        short[] sArr3 = null;
        String strM1774 = null;
        C5013 c5013M13902 = null;
        String strM10790 = null;
        String strM35587 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 9543) >> 31));
            switch (i14) {
                case -2007715437:
                case -1439633911:
                    if (i8 - (i11 + i11) > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ᩺")) * (-125);
                        i = ((iM45029 ^ i4) * (-193)) ^ 338377185;
                        i2 = -313129413;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM45029 ^ i3) * (-9867)) ^ 886746102;
                        i2 = 27022975;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1860563492:
                case -1475245165:
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("ᩴ۠") ^ i4;
                        i = ((iM45029 ^ i3) * 18095) ^ 1679343114;
                        i2 = 764445518;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1782577482:
                case 1360356668:
                    C1937.m6279();
                    C19806.m45024();
                    iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                    i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                    i2 = 587830615;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1713261386:
                case -1394077703:
                    strM10790 = C3660.m10790(sArr, i13, i7, i12);
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ᩴ۠") ^ i4;
                        i = ((iM45029 ^ i3) * 18095) ^ 1679343114;
                        i2 = 764445518;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۟") ^ i3) * 53;
                        i = ((iM45029 ^ i4) * 26251) ^ (-1814770774);
                        i2 = 430608306;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1536432638:
                case 926897362:
                    i9 = s * s;
                    i10 = 173606976;
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۖ") + i4) * (-5);
                        i = ((iM45029 ^ i3) * 5721) ^ (-1312823209);
                        i2 = 417777062;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i4;
                        i = ((iM45029 ^ i3) * 16703) ^ 1957692500;
                        i2 = -1588583345;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1512230139:
                case 1362074150:
                    sArr = f48656;
                    i13 = 378;
                    i7 = 10;
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ᩴ۠") ^ i4;
                        i = ((iM45029 ^ i3) * 18095) ^ 1679343114;
                        i2 = 764445518;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-16179)) ^ 30803707;
                        i2 = -17913830;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1324916398:
                case 25415925:
                    i12 = 14682;
                    iM45029 = C19806.m45029("ᩴ۫") ^ i3;
                    i = ((iM45029 ^ i4) * (-2705)) ^ 1358479166;
                    i2 = -650182259;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -880246909:
                case 1218610396:
                    sArr3 = f48656;
                    c = 377;
                    if (C1398.m4895() <= 0) {
                        iM45029 = C19806.m45029("ܳ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 17083) ^ 1140492362;
                        i2 = 1281531896;
                    } else {
                        iM45029 = C19806.m45029("ۜܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-11969)) ^ (-1390021550);
                        i2 = 820271439;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -716101714:
                case 2100626992:
                    i11 = i9 + i10;
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    } else {
                        iM45029 = C19806.m45029("֨᩷") ^ i3;
                        i = ((iM45029 ^ i4) * 5095) ^ 247509806;
                        i2 = -1220074335;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -688574880:
                case 1879178286:
                    i12 = 13064;
                    iM45029 = C19806.m45029("ᩴ۫") ^ i3;
                    i = ((iM45029 ^ i4) * (-2705)) ^ 1358479166;
                    i2 = -650182259;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -535750400:
                case -212434366:
                    if (C2249.m6915() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    } else {
                        iM45029 = C19806.m45029("ܳ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 17083) ^ 1140492362;
                        i2 = 1281531896;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -187917211:
                case 1178220941:
                    int i15 = s + s2;
                    i8 = i15 * i15;
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i3;
                        i = ((iM45029 ^ i4) * (-6445)) ^ (-693771149);
                        i2 = -1251626685;
                    } else {
                        iM45029 = (C19806.m45029("ܽܳ") ^ i4) * (-121);
                        i = ((iM45029 ^ i3) * (-2729)) ^ 900056495;
                        i2 = 206969260;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -24168527:
                case 2093397519:
                    ViewTreeObserverOnPreDrawListenerC3327.m9867(c5013M13902, strM1774, strM35587);
                    return c5013M13902.m13910();
                case 6638279:
                case 1442828726:
                    c5013M13902 = C5013.m13902(strM10790);
                    sArr2 = f48656;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۡۢ")) * 99;
                        i = ((iM45029 ^ i3) * 31029) ^ (-449052131);
                        i2 = -498597168;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 314936985:
                case 764641739:
                    s = sArr3[c];
                    if (C2788.m8472() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۬") ^ i4;
                        i = ((iM45029 ^ i3) * 4007) ^ 306251126;
                        i2 = 1647159128;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 808124751:
                case 1505654825:
                    s2 = 13176;
                    if (C3743.m10966() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i3;
                        i = ((iM45029 ^ i4) * (-6445)) ^ (-693771149);
                        i2 = -1251626685;
                    } else {
                        iM45029 = C19806.m45029("ᩴۘ") ^ i3;
                        i = ((iM45029 ^ i4) * 5225) ^ (-996509897);
                        i2 = 1531838478;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 878257356:
                case 2058980993:
                    return new C21947(2);
                case 1163067709:
                case 1896821377:
                    C1189.m4368();
                    C1668.m5583();
                    return null;
                case 1436470169:
                case 2091667458:
                    strM1774 = C0278.m1774(sArr2, 388, 4, i12);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۬") ^ i3;
                        i = ((iM45029 ^ i4) * 20359) ^ 1968353261;
                        i2 = -470085664;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i4;
                        i = ((iM45029 ^ i3) * 16703) ^ 1957692500;
                        i2 = -1588583345;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 2047203949:
                case 2140546086:
                    C2332.m7079();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i = ((iM45029 ^ i3) * 31901) ^ (-265580751);
                        i2 = 587830615;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i4;
                        i = ((iM45029 ^ i3) * 16703) ^ 1957692500;
                        i2 = -1588583345;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM35587 = m35587();
                    if (strM35587 == null) {
                        iM45029 = C19806.m45029("ۜۨ") ^ i3;
                        i = ((iM45029 ^ i4) * (-2587)) ^ 1725758726;
                        i2 = 690945063;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩸") + i4) * 29;
                        i = ((iM45029 ^ i3) * 21767) ^ (-2086599751);
                        i2 = -287312780;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35593(String str, int i, String str2, WeakReference weakReference) {
        String strM7082 = null;
        Bitmap bitmapM35586 = null;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1363903975;
        int i5 = C1460.f5948;
        int i6 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("۬᩵") ^ i6;
        int i7 = ((iM11306 ^ i5) * (-28905)) ^ 728992202;
        int i8 = -1893418366;
        while (true) {
            i4 = ((((i4 ^ i5) * 25281) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2063466664:
                case 613957918:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("᩶֨") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18205) ^ 1138655021;
                        i8 = 1623190346;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۨܺ")) * 61;
                        i7 = ((iM11306 ^ i6) * 19125) ^ (-1487662870);
                        i8 = -1092476910;
                    }
                    break;
                case -2028586523:
                case 284846217:
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i6 - C19806.m45029("֨ۜ")) * (-93);
                        i7 = ((iM11306 ^ i5) * 9155) ^ (-856395450);
                        i8 = -1055722043;
                    } else {
                        iM11306 = C19806.m45029("᩷ۘ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 14461) ^ 1290542350;
                        i8 = -2116618866;
                    }
                    break;
                case -1894379082:
                case -1501257963:
                    strM7082 = C2332.m7082(f48656, 312, 8, i3);
                    iM11306 = ThreadFactoryC3888.m11306("᩹᩷") ^ i5;
                    i7 = ((iM11306 ^ i6) * 23793) ^ (-1219403048);
                    i8 = -376749025;
                    break;
                case -1808753609:
                case -142444334:
                    C1977.m6356();
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 3829) ^ (-2045777845);
                        i8 = -400062223;
                    } else {
                        iM11306 = C19806.m45029("ۨۗ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-8631)) ^ 512542101;
                        i8 = 388541220;
                    }
                    break;
                case -1666142508:
                case 1451145792:
                    s = f48656[311];
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺᩹") + i5) * 83;
                        i7 = ((iM11306 ^ i6) * (-10037)) ^ 50396114;
                        i8 = 1060281642;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۨ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 8205) ^ (-547833699);
                        i8 = 1423669968;
                    }
                    break;
                case -1478233436:
                case -1410214863:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i5 - C19806.m45029("ۨܺ")) * 61;
                        i7 = ((iM11306 ^ i6) * 19125) ^ (-1487662870);
                        i8 = -1092476910;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") ^ i6) * (-29);
                        i7 = ((iM11306 ^ i5) * 15115) ^ (-85056785);
                        i8 = -2022141230;
                    }
                    break;
                case -1328735885:
                case -858198652:
                    i2 = (s * s) + 13249600;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i6 - C19806.m45029("֨ۜ")) * (-93);
                        i7 = ((iM11306 ^ i5) * 9155) ^ (-856395450);
                        i8 = -1055722043;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۨ") ^ i6) * (-57);
                        i7 = ((iM11306 ^ i5) * (-32347)) ^ 509717706;
                        i8 = 2135651040;
                    }
                    break;
                case -1275362783:
                case -814679669:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 3829) ^ (-2045777845);
                        i8 = -400062223;
                    } else {
                        iM11306 = C19806.m45029("᩵᩹") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-747)) ^ (-598958818);
                        i8 = 642199663;
                    }
                    break;
                case -1262233334:
                case -501620793:
                    if (C2642.m8171() != 0) {
                        iM11306 = (C19806.m45029("ۙܶ") + i5) * (-127);
                        i7 = ((iM11306 ^ i6) * (-15767)) ^ 452974791;
                        i8 = 2139436311;
                    } else {
                        iM11306 = C19806.m45029("ۧܺ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-5849)) ^ 728390684;
                        i8 = -778444105;
                    }
                    break;
                case -1161132229:
                case 1443022074:
                    RunnableC1564.m5345();
                    break;
                case -1128533287:
                case 1707297657:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i5 - C19806.m45029("ۨܺ")) * 61;
                        i7 = ((iM11306 ^ i6) * 19125) ^ (-1487662870);
                        i8 = -1092476910;
                    } else {
                        iM11306 = C19806.m45029("֫ܶ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-15367)) ^ 886340103;
                        i8 = 169271109;
                    }
                    break;
                case -1093748540:
                case 970946082:
                    i3 = 9832;
                    iM11306 = C19806.m45029("ܽܺ") ^ i6;
                    i7 = ((iM11306 ^ i5) * (-17805)) ^ (-1398048499);
                    i8 = -691879239;
                    break;
                case -883780027:
                case 1990563869:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i6 - C19806.m45029("֨ۜ")) * (-93);
                        i7 = ((iM11306 ^ i5) * 9155) ^ (-856395450);
                        i8 = -1055722043;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18763) ^ (-953636025);
                        i8 = 775124572;
                    }
                    break;
                case -780446779:
                case -406110266:
                    if (C2477.f9839 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18763) ^ (-953636025);
                        i8 = 775124572;
                    } else {
                        iM11306 = C19806.m45029("᩵᩹") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-747)) ^ (-598958818);
                        i8 = 642199663;
                    }
                    break;
                case -431896668:
                case 2144158528:
                    if ((s * 7280) - i2 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۙ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-1059)) ^ 1258581929;
                        i8 = -2144066277;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ܶ") + i5) * (-43);
                        i7 = ((iM11306 ^ i6) * 6723) ^ (-197710182);
                        i8 = 291686689;
                    }
                    break;
                case -431748294:
                case -311231938:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18763) ^ (-953636025);
                        i8 = 775124572;
                    } else {
                        iM11306 = (C19806.m45029("ܰ᩻") ^ i6) * 83;
                        i7 = ((iM11306 ^ i5) * 21191) ^ 1655185614;
                        i8 = 1113563536;
                    }
                    break;
                case -227603801:
                case 1584757003:
                    C1937.m6279();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") ^ i6) * (-29);
                        i7 = ((iM11306 ^ i5) * 15115) ^ (-85056785);
                        i8 = -2022141230;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 3829) ^ (-2045777845);
                        i8 = -400062223;
                    }
                    break;
                case -213978499:
                case 1634680640:
                    C1189.m4368();
                    if (C2704.m8255() <= 0) {
                        iM11306 = C19806.m45029("᩵᩹") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-747)) ^ (-598958818);
                        i8 = 642199663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۜ") + i6) * 99;
                        i7 = ((iM11306 ^ i5) * (-20515)) ^ (-281422519);
                        i8 = 605705330;
                    }
                    break;
                case -134965217:
                case 204616905:
                    AbstractC0464.m2313();
                    C1025.m3861();
                    iM11306 = C19806.m45029("᩵᩹") ^ i6;
                    i7 = ((iM11306 ^ i5) * (-747)) ^ (-598958818);
                    i8 = 642199663;
                    break;
                case -99642538:
                case 833659787:
                    if (bitmapM35586 != null) {
                        iM11306 = (C19806.m45029("۠ܰ") + i5) * (-117);
                        i7 = ((iM11306 ^ i6) * (-9105)) ^ (-48927683);
                        i8 = -1441709014;
                    } else {
                        iM11306 = (C19806.m45029("ᩳܿ") ^ i5) * 123;
                        i7 = ((iM11306 ^ i6) * 14047) ^ (-1786439562);
                        i8 = -438429546;
                    }
                    break;
                case -10292806:
                case 2080676018:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺᩹") + i5) * 83;
                        i7 = ((iM11306 ^ i6) * (-10037)) ^ 50396114;
                        i8 = 1060281642;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۙ") + i6) * (-9);
                        i7 = ((iM11306 ^ i5) * 32439) ^ 1022878869;
                        i8 = -1180334892;
                    }
                    break;
                case 187004808:
                case 1799452520:
                    try {
                        C17169.m40093(str2, bitmapM35586);
                        C0797.m3355(new RunnableC19230(weakReference, str, bitmapM35586, 2));
                        break;
                    } catch (IOException unused) {
                    }
                    iM11306 = (C19806.m45029("ᩳܿ") ^ i5) * 123;
                    i7 = ((iM11306 ^ i6) * 14047) ^ (-1786439562);
                    i8 = -438429546;
                    break;
                case 228495031:
                case 634130534:
                    StringBuilder sb = new StringBuilder(strM7082);
                    C2788.m8480(sb, str);
                    C2788.m8480(sb, C1419.m4969(f48656, 320, 1, i3));
                    C0817.m3408(sb, i);
                    C2788.m8480(sb, CallableC1627.m5502(f48656, 321, 9, i3));
                    bitmapM35586 = m35586(BitmapFactory.decodeStream(C5013.m13902(C2124.m6674(sb)).m13905().m42860().m44051()));
                    iM11306 = C19806.m45029("۫۠") ^ i6;
                    i7 = ((iM11306 ^ i5) * 25269) ^ 532411047;
                    i8 = -1974864846;
                    break;
                case 734603569:
                case 1336483371:
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18763) ^ (-953636025);
                        i8 = 775124572;
                    } else {
                        iM11306 = (C19806.m45029("ۙܶ") + i5) * (-127);
                        i7 = ((iM11306 ^ i6) * (-15767)) ^ 452974791;
                        i8 = 2139436311;
                    }
                    break;
                case 898611762:
                case 1293007682:
                    if (CallableC1627.f6528) {
                        iM11306 = (i5 - C19806.m45029("ᩴ֡")) * (-97);
                        i7 = ((iM11306 ^ i6) * (-15095)) ^ 830500050;
                        i8 = 1928608685;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 18763) ^ (-953636025);
                        i8 = 775124572;
                    }
                    break;
                case 1595033492:
                case 2052117407:
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("ۨۗ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-8631)) ^ 512542101;
                        i8 = 388541220;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-21319)) ^ 949167020;
                        i8 = 2024083485;
                    }
                    break;
                case 1852540495:
                case 1940687720:
                    break;
                default:
                    i3 = 51954;
                    iM11306 = C19806.m45029("ܽܺ") ^ i6;
                    i7 = ((iM11306 ^ i5) * (-17805)) ^ (-1398048499);
                    i8 = -691879239;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0414 A[PHI: r8 r11 r23 r51 r55
      0x0414: PHI (r8v77 android.graphics.Bitmap) = (r8v66 android.graphics.Bitmap), (r8v71 android.graphics.Bitmap), (r8v78 android.graphics.Bitmap) binds: [B:92:0x03fb, B:76:0x0354, B:50:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r11v75 java.lang.String) = (r11v61 java.lang.String), (r11v65 java.lang.String), (r11v79 java.lang.String) binds: [B:92:0x03fb, B:76:0x0354, B:50:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r23v75 java.lang.String) = (r23v64 java.lang.String), (r23v68 java.lang.String), (r23v78 java.lang.String) binds: [B:92:0x03fb, B:76:0x0354, B:50:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r51v80 byte[]) = (r51v70 byte[]), (r51v74 byte[]), (r51v81 byte[]) binds: [B:92:0x03fb, B:76:0x0354, B:50:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r55v62 int) = (r55v54 int), (r55v58 int), (r55v63 int) binds: [B:92:0x03fb, B:76:0x0354, B:50:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6424 m35588(C2455 c2455) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iM45029;
        int i5;
        int i6;
        int iM450210;
        int i7;
        int iM450211;
        int i8;
        BitmapFactory.Options options;
        int i9;
        int i10;
        int iM450212;
        int i11;
        int i12;
        byte[] bArr;
        BitmapFactory.Options options2;
        int i13;
        int i14;
        int i15;
        int iM450213;
        int i16;
        int i17;
        int i18;
        BitmapFactory.Options options3;
        int i19;
        int i20;
        BitmapFactory.Options options4;
        int i21;
        int i22;
        int iM11306;
        int i23;
        int i24;
        int iM450214;
        int i25;
        int iM450215;
        int i26;
        int i27;
        int i28;
        int iM11307;
        int i29;
        byte[] byteArray;
        Bitmap bitmapDecodeByteArray = null;
        Bitmap bitmap = null;
        Bitmap.CompressFormat compressFormat = null;
        Throwable th = null;
        boolean zCompress = false;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        boolean zM2315 = false;
        long j = 0;
        boolean zM5058 = false;
        long jMax = 0;
        C6424 c6424M17605 = null;
        boolean zCompress2 = false;
        C6424 c6424M17606 = null;
        C6424 c6424M17607 = null;
        int i30 = 802833975;
        int i31 = C1066.f4915;
        int i32 = ThreadFactoryC3888.f14547;
        int iM11308 = ThreadFactoryC3888.m11306("᩵֫") ^ i31;
        int i33 = ((iM11308 ^ i32) * 4059) ^ (-234868084);
        int i34 = iM11308 ^ (-282225376);
        C12107 c12107M6235 = null;
        byte[] bArr4 = null;
        byte[] bArrM8467 = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] byteArray2 = null;
        String strM10896 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        Bitmap.CompressFormat compressFormat2 = null;
        byte[] bArr5 = null;
        int i35 = 0;
        int length = 0;
        int length2 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        boolean zM2316 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        String strM7604 = null;
        C12107 c12107M2916 = null;
        BitmapFactory.Options options5 = null;
        boolean z = false;
        String strM2906 = null;
        C6424 c6424 = null;
        String str2 = null;
        int i45 = 0;
        while (true) {
            i30 = i34 ^ (i33 & (((i30 ^ i32) * 22377) >> 31));
            switch (i30) {
                case -2131450279:
                case -1858588332:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    length2 = bArrM8467.length;
                    length = byteArray2.length;
                    iM450214 = C19806.m45029("֨ۢ") ^ i32;
                    i21 = ((iM450214 ^ i31) * 17559) ^ (-1047021954);
                    i25 = -113755977;
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -2091967959:
                case -169751720:
                    options = options5;
                    z = true;
                    iM450212 = ThreadFactoryC3888.m11306("ۜ֡") ^ i32;
                    i11 = ((iM450212 ^ i31) * 25125) ^ 2094980328;
                    i12 = -239897361;
                    i17 = iM450212 ^ i12;
                    options5 = options;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i17;
                    i33 = i11;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -2064537270:
                case -1209658845:
                    return c6424;
                case -2029456474:
                case -322851118:
                    bitmap.recycle();
                    throw th;
                case -1947832271:
                case -1391978936:
                    compressFormat2 = Bitmap.CompressFormat.PNG;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    iM450215 = C19806.m45029("ܶ᩺") ^ i32;
                    i26 = ((iM450215 ^ i31) * 32639) ^ (-2030883665);
                    i27 = 321720608;
                    i28 = iM450215 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -1931366674:
                case -997673290:
                    bitmap.recycle();
                    return c6424M17605;
                case -1927269004:
                case 790920288:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    options = options5;
                    strM2906 = strM2906;
                    BitmapFactory.Options options6 = new BitmapFactory.Options();
                    options6.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArrM8467, 0, bArrM8467.length, options6);
                    i40 = options6.outWidth;
                    int i46 = options6.outHeight;
                    if (i40 > 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۗᩳ") ^ i32;
                        i42 = i46;
                        i33 = ((iM11309 ^ i31) * 32303) ^ (-1929201280);
                        strM2906 = strM2906;
                        options5 = options;
                        i35 = i35;
                        i43 = 0;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = iM11309 ^ 1107033019;
                        i41 = 1;
                    } else {
                        i42 = i46;
                        i41 = 1;
                        i43 = 0;
                        int iM113010 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113010 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113010 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -1912554856:
                case 2089913675:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    zM5058 = C1460.m5058(strM2906, strM10896);
                    iM450215 = (C19806.m45029("۬ۚ") + i31) * 83;
                    i26 = ((iM450215 ^ i32) * 28277) ^ (-774645331);
                    i27 = -2064130791;
                    i28 = iM450215 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -1865383391:
                case -795933689:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    strM10896 = C3722.m10896(c12107M2916);
                    zM2315 = AbstractC0464.m2315(strM7604, strM10896);
                    iM450214 = ThreadFactoryC3888.m11306("ۡۢ") ^ i31;
                    i21 = ((iM450214 ^ i32) * (-13429)) ^ 236739437;
                    i25 = 1107551099;
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -1780151797:
                case 84599846:
                    try {
                        c6424M17606 = C6424.m17605(str2, byteArray2);
                        iM11307 = (C19806.m45029("֫ܰ") + i31) * (-25);
                        i26 = ((iM11307 ^ i32) * 30909) ^ (-889253142);
                        i29 = 754084184;
                        i34 = iM11307 ^ i29;
                        i33 = i26;
                    } catch (Throwable th2) {
                        th = th2;
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        strM2906 = strM2906;
                        iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                        i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                        i25 = -542871903;
                        i22 = iM450214 ^ i25;
                        str2 = str2;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -1685534311:
                case -103980579:
                    if (byteArray2 != null) {
                        iM11307 = (i32 - C19806.m45029("᩹ۨ")) * 69;
                        i26 = ((iM11307 ^ i31) * (-16565)) ^ (-271593856);
                        i29 = -770691198;
                    } else {
                        iM11307 = C19806.m45029("᩵ܶ") ^ i31;
                        i26 = ((iM11307 ^ i32) * 5827) ^ 348389412;
                        i29 = 1554224460;
                    }
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case -1628785140:
                case 413895199:
                    if (bArr5 != null) {
                        iM11307 = (i32 - C19806.m45029("ۖᩴ")) * (-83);
                        i26 = ((iM11307 ^ i31) * 21089) ^ (-1144009143);
                        i29 = 996309569;
                    } else {
                        iM11307 = C19806.m45029("ܰ۠") ^ i32;
                        i26 = ((iM11307 ^ i31) * 19173) ^ (-1821323962);
                        i29 = -1347547543;
                    }
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case -1616924959:
                case 400788112:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    byteArray2 = byteArrayOutputStream.toByteArray();
                    iM450214 = C19806.m45029("ۙ᩷") ^ i32;
                    i21 = ((iM450214 ^ i31) * 31649) ^ 1936895363;
                    i25 = 773676668;
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -1564628051:
                case -471993136:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.WEBP;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        try {
                            zCompress = bitmap.compress(compressFormat3, 90, byteArrayOutputStream3);
                            int iM450216 = (i32 - C19806.m45029("ۢۢ")) * (-107);
                            i11 = ((iM450216 ^ i31) * (-8949)) ^ (-514768686);
                            i17 = iM450216 ^ (-663380538);
                            compressFormat = compressFormat3;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            str2 = str2;
                            i35 = i35;
                            bArr = bArr5;
                            i34 = i17;
                            i33 = i11;
                            strM2906 = strM2906;
                            bitmap = bitmap;
                            bArr5 = bArr;
                        } catch (Throwable th3) {
                            th = th3;
                            compressFormat = compressFormat3;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                            i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                            i25 = -542871903;
                            i22 = iM450214 ^ i25;
                            str2 = str2;
                            strM2906 = strM2906;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i22;
                            i33 = i21;
                            i35 = i35;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        compressFormat = compressFormat3;
                        byteArrayOutputStream = null;
                    }
                    break;
                case -1563231875:
                case 1854931834:
                    options = options5;
                    z = false;
                    iM450212 = ThreadFactoryC3888.m11306("ۜ֡") ^ i32;
                    i11 = ((iM450212 ^ i31) * 25125) ^ 2094980328;
                    i12 = -239897361;
                    i17 = iM450212 ^ i12;
                    options5 = options;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i17;
                    i33 = i11;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -1479531346:
                case -792823411:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    i43 = i43;
                    strM2906 = strM2906;
                    options2 = options5;
                    zM2316 = AbstractC0464.m2315(str2, C3722.m10896(c12107M2916));
                    if (z) {
                        options = options2;
                        iM450212 = (ThreadFactoryC3888.m11306("ۢ֡") + i32) * 119;
                        i11 = ((iM450212 ^ i31) * 9411) ^ (-1041542907);
                        i12 = 2040182063;
                    } else {
                        iM450212 = (i31 - C19806.m45029("ۨۡ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        options = options2;
                        i11 = ((iM450212 ^ i32) * 17075) ^ (-1696317696);
                        i12 = -639280448;
                    }
                    i17 = iM450212 ^ i12;
                    options5 = options;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i17;
                    i33 = i11;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -1412010045:
                case -1096982860:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    if (j < jMax) {
                        i35 = i35;
                        str2 = str2;
                        strM2906 = strM2906;
                        iM450214 = (i31 - ThreadFactoryC3888.m11306("֨ۡ")) * 13;
                        i21 = ((iM450214 ^ i32) * (-31839)) ^ 857572458;
                        i25 = 1969237555;
                        i22 = iM450214 ^ i25;
                        str2 = str2;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    } else {
                        iM450215 = ThreadFactoryC3888.m11306("ܳۡ") ^ i32;
                        i26 = ((iM450215 ^ i31) * 15331) ^ 2143221234;
                        i27 = 1217381010;
                        i28 = iM450215 ^ i27;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i28;
                        i33 = i26;
                    }
                    break;
                case -1366670985:
                case 70482889:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i13 = i42;
                    i19 = i43;
                    strM2906 = strM2906;
                    options3 = options5;
                    if (i13 <= i45) {
                        bArr2 = bArr4;
                        iM11306 = C19806.m45029("ۨܽ") ^ i31;
                        i43 = i19;
                        i23 = ((iM11306 ^ i32) * (-709)) ^ (-1650343220);
                        i24 = 1220629537;
                        int i47 = iM11306 ^ i24;
                        options5 = options3;
                        strM2906 = strM2906;
                        i43 = i43;
                        i42 = i13;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i35 = i35;
                        i34 = i47;
                        i33 = i23;
                        str2 = str2;
                    } else {
                        i14 = i19;
                        options5 = options3;
                        i15 = i40;
                        iM450213 = (i32 - ThreadFactoryC3888.m11306("ۛ֫")) * (-25);
                        i11 = ((iM450213 ^ i31) * (-29855)) ^ (-814085263);
                        i16 = 1308314380;
                        i17 = iM450213 ^ i16;
                        i40 = i15;
                        str2 = str2;
                        i43 = i14;
                        i42 = i13;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i17;
                        i33 = i11;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    }
                    break;
                case -1352989559:
                case -1259183929:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (length >= length2) {
                        iM450214 = (i31 - ThreadFactoryC3888.m11306("֨ۡ")) * 13;
                        i21 = ((iM450214 ^ i32) * (-31839)) ^ 857572458;
                        i25 = 1969237555;
                    } else {
                        iM450214 = (C19806.m45029("ܳᩴ") ^ i31) * 27;
                        i21 = ((iM450214 ^ i32) * 13085) ^ (-2041318000);
                        i25 = 1356492572;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -1347357707:
                case -698101827:
                    i35 = i35;
                    String str3 = str2;
                    String str4 = strM2906;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i48 = i40;
                    options5 = options5;
                    i42 = i42;
                    i = i43;
                    c12107M6235 = ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455, str4);
                    strM2906 = str4;
                    i40 = i48;
                    str = str3;
                    i4 = i44;
                    iM45029 = (C19806.m45029("ۡ᩺") ^ i31) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i2 = ((iM45029 ^ i32) * 14439) ^ 1775595426;
                    i5 = 1760154945;
                    i3 = iM45029 ^ i5;
                    i44 = i4;
                    str2 = str;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i49 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i49;
                    break;
                case -1345915311:
                case 1949557368:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i50 = i40;
                    options5 = options5;
                    i42 = i42;
                    i = i43;
                    strM2906 = strM2906;
                    i40 = i50;
                    i6 = i44;
                    strM7604 = C2477.m7604(f48656, 22, 8, i6);
                    if (c12107M6235 == null) {
                        iM450210 = C19806.m45029("۠۬") ^ i32;
                        i2 = ((iM450210 ^ i31) * (-30353)) ^ (-576478555);
                        i7 = -1434615326;
                    } else {
                        c12107M2916 = c12107M6235;
                        iM450210 = C19806.m45029("ۗ᩺") ^ i31;
                        i2 = ((iM450210 ^ i32) * 26365) ^ (-1098625583);
                        i7 = 123331844;
                    }
                    i3 = iM450210 ^ i7;
                    i44 = i6;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i410 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i410;
                    break;
                case -1303568768:
                case 1053826322:
                    i = i43;
                    i44 = 61737;
                    int iM450217 = (C19806.m45029("᩸᩷") ^ i32) * 95;
                    i2 = ((iM450217 ^ i31) * 10531) ^ 2057737991;
                    i3 = iM450217 ^ (-1151549465);
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i411 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i411;
                    break;
                case -1261114562:
                case 1018479314:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (zCompress) {
                        iM450214 = C19806.m45029("᩸᩻") ^ i31;
                        i21 = ((iM450214 ^ i32) * 7581) ^ 1564001556;
                        i25 = 1918692605;
                    } else {
                        byteArray2 = bArr2;
                        iM450214 = C19806.m45029("ۙ᩷") ^ i32;
                        i21 = ((iM450214 ^ i31) * 31649) ^ 1936895363;
                        i25 = 773676668;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -1229609278:
                case 611495044:
                    i35 = i35;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i4 = i44;
                    int i51 = i43;
                    i40 = i40;
                    options5 = options5;
                    i42 = i42;
                    i = i51;
                    String strM5577 = C1668.m5577(f48656, 5, 9, i4);
                    C12107 c12107M6236 = ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455, strM5577);
                    str = strM5577;
                    strM2906 = C0629.m2906(f48656, 14, 8, i4);
                    if (c12107M6236 == null) {
                        iM45029 = (i32 - C19806.m45029("֡ۜ")) * (-121);
                        i2 = ((iM45029 ^ i31) * 31721) ^ (-997510511);
                        i5 = -2064019478;
                    } else {
                        c12107M6235 = c12107M6236;
                        iM45029 = (C19806.m45029("ۡ᩺") ^ i31) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM45029 ^ i32) * 14439) ^ 1775595426;
                        i5 = 1760154945;
                    }
                    i3 = iM45029 ^ i5;
                    i44 = i4;
                    str2 = str;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i412 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i412;
                    break;
                case -1208127888:
                case 2025776205:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    if (zM5058) {
                        iM450215 = (ThreadFactoryC3888.m11306("᩺᩹") ^ i31) * (-91);
                        i26 = ((iM450215 ^ i32) * 13177) ^ 1458719568;
                        i27 = 1594937604;
                    } else {
                        compressFormat2 = compressFormat;
                        iM450215 = C19806.m45029("ܶ᩺") ^ i32;
                        i26 = ((iM450215 ^ i31) * 32639) ^ (-2030883665);
                        i27 = 321720608;
                    }
                    i28 = iM450215 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -1206737291:
                case -65087510:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i52 = i40;
                    options5 = options5;
                    strM2906 = strM2906;
                    i42 = i42;
                    i = i43;
                    c12107M2916 = C0629.m2916(c2455, strM7604);
                    i40 = i52;
                    i6 = i44;
                    iM450210 = C19806.m45029("ۗ᩺") ^ i31;
                    i2 = ((iM450210 ^ i32) * 26365) ^ (-1098625583);
                    i7 = 123331844;
                    i3 = iM450210 ^ i7;
                    i44 = i6;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i413 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i413;
                    break;
                case -1145450346:
                case 1914155483:
                    bitmap.recycle();
                    return c6424M17607;
                case -1140509041:
                case 1220976595:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i20 = i43;
                    strM2906 = strM2906;
                    options4 = options5;
                    options4.inSampleSize *= 2;
                    int i53 = i36 / 2;
                    i35 = i38 / 2;
                    if (i53 <= i45) {
                        int iM450218 = C19806.m45029("֫ۙ") ^ i31;
                        i33 = ((iM450218 ^ i32) * 20583) ^ (-51968247);
                        i43 = i20;
                        str2 = str2;
                        options5 = options4;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = iM450218 ^ 984734872;
                        i37 = i53;
                    } else {
                        i37 = i53;
                        int iM113011 = (ThreadFactoryC3888.m11306("֨᩻") ^ i32) * 19;
                        i43 = i20;
                        str2 = str2;
                        bArr = bArr5;
                        i34 = iM113011 ^ 315834123;
                        i33 = ((iM113011 ^ i31) * (-29179)) ^ (-841574695);
                        i35 = i35;
                        options5 = options4;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    }
                    break;
                case -990887736:
                case 205082313:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options = options5;
                    int i54 = i43;
                    strM2906 = strM2906;
                    bArrM8467 = C2788.m8467(c2455, c12107M2916, null);
                    if (bArrM8467.length != 0) {
                        int iM450219 = (C19806.m45029("᩷᩸") ^ i32) * (-111);
                        i9 = ((iM450219 ^ i31) * (-24373)) ^ 1107917245;
                        i10 = iM450219 ^ (-1557209899);
                        strM2906 = strM2906;
                        i43 = i54;
                        i42 = i42;
                        bArr4 = null;
                        bitmap = bitmap;
                        options5 = options;
                        bArr5 = bArr5;
                        i34 = i10;
                        i33 = i9;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                    } else {
                        i43 = i54;
                        bArr4 = null;
                        i42 = i42;
                        int iM113012 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113012 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113012 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -983174289:
                case 1707476326:
                    c6424M17607 = C6424.m17605(C3722.m10896(c12107M2916), bArr5);
                    iM11307 = (i32 - ThreadFactoryC3888.m11306("۬ܽ")) * (-35);
                    i26 = ((iM11307 ^ i31) * 10423) ^ 1739200066;
                    i29 = 1117111516;
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case -975995781:
                case 1330005238:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i42 = i42;
                    i43 = i43;
                    strM2906 = strM2906;
                    options2 = options5;
                    i40 = i40;
                    if (!zM2316) {
                        options = options2;
                        iM450212 = (ThreadFactoryC3888.m11306("ۢ֡") + i32) * 119;
                        i11 = ((iM450212 ^ i31) * 9411) ^ (-1041542907);
                        i12 = 2040182063;
                        i17 = iM450212 ^ i12;
                        options5 = options;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i17;
                        i33 = i11;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i43 = i43;
                        i42 = i42;
                        options = options2;
                        int iM113013 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113013 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113013 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -849552416:
                case 666834484:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (zM2315) {
                        iM450214 = ThreadFactoryC3888.m11306("ۚܶ") ^ i32;
                        i21 = ((iM450214 ^ i31) * 2243) ^ 1594934578;
                        i25 = 1999902868;
                    } else {
                        iM450214 = (C19806.m45029("᩵᩹") + i32) * 53;
                        i21 = ((iM450214 ^ i31) * (-14631)) ^ (-2035164059);
                        i25 = 1833590864;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -816559147:
                case 1104562858:
                    i = i43;
                    i44 = 47878;
                    int iM4502110 = (C19806.m45029("᩸᩷") ^ i32) * 95;
                    i2 = ((iM4502110 ^ i31) * 10531) ^ 2057737991;
                    i3 = iM4502110 ^ (-1151549465);
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i414 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i414;
                    break;
                case -576217280:
                case 1146276819:
                    i35 = i35;
                    i18 = i41;
                    i13 = i42;
                    options3 = options5;
                    options3.inSampleSize = i18;
                    options3.inPreferredConfig = Bitmap.Config.RGB_565;
                    i38 = i13;
                    bArr3 = bArr4;
                    i36 = i40;
                    iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i32;
                    i41 = i18;
                    i23 = ((iM11306 ^ i31) * (-21071)) ^ (-1823131121);
                    i24 = -362389086;
                    int i415 = iM11306 ^ i24;
                    options5 = options3;
                    strM2906 = strM2906;
                    i43 = i43;
                    i42 = i13;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i35 = i35;
                    i34 = i415;
                    i33 = i23;
                    str2 = str2;
                    break;
                case -533622846:
                case 954050493:
                    bitmap.recycle();
                    return c6424;
                case -522470787:
                case 1659183849:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    options = options5;
                    strM2906 = strM2906;
                    int i55 = i42;
                    int i56 = i43;
                    c6424 = C6424.f21760;
                    if (c12107M2916 != null) {
                        int iM450220 = (i31 - C19806.m45029("ۗۧ")) * 13;
                        i9 = ((iM450220 ^ i32) * (-11271)) ^ 498459987;
                        i10 = iM450220 ^ (-294470482);
                        strM2906 = strM2906;
                        i43 = i56;
                        i42 = i55;
                        bitmap = bitmap;
                        options5 = options;
                        bArr5 = bArr5;
                        i34 = i10;
                        i33 = i9;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                    } else {
                        i43 = i56;
                        i42 = i55;
                        int iM113014 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113014 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113014 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -489137903:
                case 2021538502:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (byteArray2 != null) {
                        iM450214 = (i32 - C19806.m45029("᩻ܰ")) * 123;
                        i21 = ((iM450214 ^ i31) * 14241) ^ 573336982;
                        i25 = 11655052;
                    } else {
                        iM450214 = (i31 - ThreadFactoryC3888.m11306("֨ۡ")) * 13;
                        i21 = ((iM450214 ^ i32) * (-31839)) ^ 857572458;
                        i25 = 1969237555;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -423609981:
                case 1786657693:
                    if (zCompress2) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i32;
                        i26 = ((iM11307 ^ i31) * (-2657)) ^ (-864163495);
                        i29 = 1625305433;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿۤ") ^ i31;
                        i26 = ((iM11307 ^ i32) * (-24393)) ^ (-1870086118);
                        i29 = -1851291368;
                    }
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case -421840557:
                case 763207706:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    options2 = options5;
                    int i57 = i43;
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM8467, i57, bArrM8467.length, options2);
                    if (bitmapDecodeByteArray != null) {
                        int iM113015 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i31;
                        i35 = i35;
                        i21 = ((iM113015 ^ i32) * 19145) ^ (-753372857);
                        i22 = iM113015 ^ 399075588;
                        i43 = i57;
                        options5 = options2;
                        str2 = str2;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    } else {
                        i35 = i35;
                        i43 = i57;
                        i40 = i40;
                        options = options2;
                        int iM113016 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113016 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113016 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case -365925687:
                case 1599632116:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    long j2 = length2;
                    i35 = i35;
                    j = j2 - ((long) length);
                    try {
                        jMax = Math.max((j2 + 19) / 20, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                        iM450214 = (i31 - C19806.m45029("ܰۧ")) * (-87);
                        i21 = ((iM450214 ^ i32) * (-24333)) ^ 524784582;
                        i25 = -741956997;
                    } catch (Throwable th5) {
                        th = th5;
                        iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                        i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                        i25 = -542871903;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -346519161:
                case 1920318056:
                    i35 = i35;
                    str2 = str2;
                    Bitmap bitmapM35586 = m35586(bitmapDecodeByteArray);
                    int iM113017 = ThreadFactoryC3888.m11306("֨ۖ") ^ i32;
                    strM2906 = strM2906;
                    bArr5 = bArr5;
                    bitmap = bitmapM35586;
                    i34 = iM113017 ^ (-1245787910);
                    i33 = ((iM113017 ^ i31) * (-23237)) ^ (-423959087);
                    str2 = str2;
                    i35 = i35;
                    break;
                case -346234036:
                case -62371485:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options = options5;
                    i43 = i43;
                    strM2906 = strM2906;
                    int i58 = i39;
                    if (i42 > i58) {
                        i39 = i58;
                        iM450212 = ThreadFactoryC3888.m11306("ۡᩴ") ^ i31;
                        i11 = ((iM450212 ^ i32) * 9507) ^ 722210778;
                        i12 = -1872949883;
                    } else {
                        iM450212 = (C19806.m45029("֫ۚ") + i31) * (-83);
                        i39 = i58;
                        i11 = ((iM450212 ^ i32) * 4473) ^ (-454351726);
                        i12 = 1834181507;
                    }
                    i17 = iM450212 ^ i12;
                    options5 = options;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i17;
                    i33 = i11;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -199538701:
                case 1045635376:
                    byteArray = null;
                    bArr5 = byteArray;
                    iM11307 = C19806.m45029("ۘ֡") ^ i31;
                    i26 = ((iM11307 ^ i32) * 7033) ^ (-1865346024);
                    i29 = -78231893;
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case -177917891:
                case 1608841090:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (z) {
                        iM450214 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i31;
                        i21 = ((iM450214 ^ i32) * (-8781)) ^ 1330667657;
                        i25 = -1255120106;
                    } else {
                        iM450214 = (i32 - C19806.m45029("ܿ۠")) * (-107);
                        i21 = ((iM450214 ^ i31) * (-12199)) ^ (-1067237802);
                        i25 = -602164094;
                    }
                    i22 = iM450214 ^ i25;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i22;
                    i33 = i21;
                    i35 = i35;
                    break;
                case -143270583:
                case 395878339:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options = options5;
                    i43 = i43;
                    strM2906 = strM2906;
                    if (i42 > 0) {
                        iM450212 = (i31 - C19806.m45029("ܰۤ")) * (-71);
                        i11 = ((iM450212 ^ i32) * (-15099)) ^ 263520595;
                        i12 = -460407939;
                        i17 = iM450212 ^ i12;
                        options5 = options;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i17;
                        i33 = i11;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i43 = i43;
                        i42 = i42;
                        int iM113018 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i31;
                        i21 = ((iM113018 ^ i32) * 27865) ^ 428651485;
                        i22 = iM113018 ^ (-514928998);
                        strM2906 = strM2906;
                        options5 = options;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case 21454684:
                case 559368460:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    try {
                        compressFormat2 = Bitmap.CompressFormat.JPEG;
                        iM450215 = C19806.m45029("ܶ᩺") ^ i32;
                        i26 = ((iM450215 ^ i31) * 32639) ^ (-2030883665);
                        i27 = 321720608;
                        i28 = iM450215 ^ i27;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i28;
                        i33 = i26;
                    } catch (Throwable th6) {
                        th = th6;
                        strM2906 = strM2906;
                        iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                        i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                        i25 = -542871903;
                        i22 = iM450214 ^ i25;
                        str2 = str2;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case 313182406:
                case 518827672:
                    c6424M17605 = C6424.m17605(str2, byteArray2);
                    iM11307 = ThreadFactoryC3888.m11306("۫ܶ") ^ i31;
                    i26 = ((iM11307 ^ i32) * 27397) ^ 623983773;
                    i29 = -1590410637;
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case 765365271:
                case 1387385954:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options = options5;
                    i43 = i43;
                    strM2906 = strM2906;
                    if (i40 <= 512) {
                        int iM113019 = (ThreadFactoryC3888.m11306("֨ۧ") + i32) * 21;
                        i33 = ((iM113019 ^ i31) * 27463) ^ (-650593896);
                        options5 = options;
                        i43 = i43;
                        i39 = 512;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = iM113019 ^ (-43669965);
                    } else {
                        i39 = 512;
                        iM450212 = ThreadFactoryC3888.m11306("ۡᩴ") ^ i31;
                        i11 = ((iM450212 ^ i32) * 9507) ^ 722210778;
                        i12 = -1872949883;
                        i17 = iM450212 ^ i12;
                        options5 = options;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i17;
                        i33 = i11;
                    }
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case 913525453:
                case 1594704760:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM2906 = strM2906;
                    if (i35 > i45) {
                        options4 = options5;
                        i20 = i43;
                        int iM1130110 = (ThreadFactoryC3888.m11306("֨᩻") ^ i32) * 19;
                        i43 = i20;
                        str2 = str2;
                        bArr = bArr5;
                        i34 = iM1130110 ^ 315834123;
                        i33 = ((iM1130110 ^ i31) * (-29179)) ^ (-841574695);
                        i35 = i35;
                        options5 = options4;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i35 = i35;
                        bArr2 = bArr3;
                        i13 = i42;
                        options3 = options5;
                        i19 = i43;
                        iM11306 = C19806.m45029("ۨܽ") ^ i31;
                        i43 = i19;
                        i23 = ((iM11306 ^ i32) * (-709)) ^ (-1650343220);
                        i24 = 1220629537;
                        int i416 = iM11306 ^ i24;
                        options5 = options3;
                        strM2906 = strM2906;
                        i43 = i43;
                        i42 = i13;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i35 = i35;
                        i34 = i416;
                        i33 = i23;
                        str2 = str2;
                    }
                    break;
                case 914391060:
                case 1099273712:
                    byteArray = byteArrayOutputStream2.toByteArray();
                    bArr5 = byteArray;
                    iM11307 = C19806.m45029("ۘ֡") ^ i31;
                    i26 = ((iM11307 ^ i32) * 7033) ^ (-1865346024);
                    i29 = -78231893;
                    i34 = iM11307 ^ i29;
                    i33 = i26;
                    break;
                case 958170947:
                case 1539327238:
                    bitmap.recycle();
                    return c6424;
                case 992477984:
                case 2072852478:
                    bArr3 = null;
                    i38 = i35;
                    i35 = i38;
                    i36 = i37;
                    i18 = i41;
                    i13 = i42;
                    options3 = options5;
                    iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i32;
                    i41 = i18;
                    i23 = ((iM11306 ^ i31) * (-21071)) ^ (-1823131121);
                    i24 = -362389086;
                    int i417 = iM11306 ^ i24;
                    options5 = options3;
                    strM2906 = strM2906;
                    i43 = i43;
                    i42 = i13;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i35 = i35;
                    i34 = i417;
                    i33 = i23;
                    str2 = str2;
                    break;
                case 1014791869:
                case 1240230730:
                    bitmap.recycle();
                    return c6424M17606;
                case 1162764576:
                case 1251451421:
                    try {
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        try {
                            zCompress2 = bitmap.compress(compressFormat2, 90, byteArrayOutputStream4);
                            int iM113020 = ThreadFactoryC3888.m11306("֡᩵") ^ i32;
                            i26 = ((iM113020 ^ i31) * 24215) ^ 787643436;
                            i28 = iM113020 ^ 1008564589;
                            byteArrayOutputStream2 = byteArrayOutputStream4;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i28;
                            i33 = i26;
                        } catch (Throwable th7) {
                            th = th7;
                            byteArrayOutputStream2 = byteArrayOutputStream4;
                            strM2906 = strM2906;
                            iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                            i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                            i25 = -542871903;
                            i22 = iM450214 ^ i25;
                            str2 = str2;
                            strM2906 = strM2906;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i22;
                            i33 = i21;
                            i35 = i35;
                        }
                    } catch (Throwable th8) {
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        th = th8;
                        i35 = i35;
                        str2 = str2;
                        strM2906 = strM2906;
                        byteArrayOutputStream2 = null;
                        iM450214 = (C19806.m45029("ᩳۘ") ^ i31) * 21;
                        i21 = ((iM450214 ^ i32) * 13531) ^ (-803465499);
                        i25 = -542871903;
                        i22 = iM450214 ^ i25;
                        str2 = str2;
                        strM2906 = strM2906;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i22;
                        i33 = i21;
                        i35 = i35;
                    }
                    break;
                case 1362116938:
                case 2141518638:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i13 = i42;
                    i14 = i43;
                    strM2906 = strM2906;
                    options5 = new BitmapFactory.Options();
                    i45 = 600;
                    i15 = i40;
                    if (i15 <= 600) {
                        iM450213 = (C19806.m45029("ۜۤ") ^ i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i11 = ((iM450213 ^ i32) * 17471) ^ (-1355280320);
                        i16 = 1189967601;
                    } else {
                        iM450213 = (i32 - ThreadFactoryC3888.m11306("ۛ֫")) * (-25);
                        i11 = ((iM450213 ^ i31) * (-29855)) ^ (-814085263);
                        i16 = 1308314380;
                    }
                    i17 = iM450213 ^ i16;
                    i40 = i15;
                    str2 = str2;
                    i43 = i14;
                    i42 = i13;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i17;
                    i33 = i11;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                default:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i6 = i44;
                    strM2906 = strM2906;
                    int i59 = i43;
                    i40 = i40;
                    options5 = options5;
                    i42 = i42;
                    i = i59;
                    short s = f48656[4];
                    int i60 = s + 9662;
                    int i61 = (s * s) + 93354244;
                    if ((i60 * i60) - (i61 + i61) > 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i31) * (-85);
                        i2 = ((iM450211 ^ i32) * 15605) ^ 1623092350;
                        i8 = 2039867635;
                    } else {
                        iM450211 = C19806.m45029("ۘ᩵") ^ i32;
                        i2 = ((iM450211 ^ i31) * (-27091)) ^ 728067577;
                        i8 = -466716135;
                    }
                    i3 = iM450211 ^ i8;
                    i44 = i6;
                    str2 = str2;
                    strM2906 = strM2906;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i3;
                    i33 = i2;
                    i35 = i35;
                    int i418 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i;
                    i42 = i418;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0420 A[PHI: r6 r7 r21 r25 r26 r28
      0x0420: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r7v4 java.nio.charset.Charset) = (r7v2 java.nio.charset.Charset), (r7v3 java.nio.charset.Charset), (r7v2 java.nio.charset.Charset) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r21v4 short[]) = (r21v3 short[]), (r21v2 short[]), (r21v2 short[]) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r25v29 java.lang.String) = (r25v9 java.lang.String), (r25v21 java.lang.String), (r25v30 java.lang.String) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r26v5 char) = (r26v4 char), (r26v3 char), (r26v3 char) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r28v19 java.lang.String) = (r28v1 java.lang.String), (r28v12 java.lang.String), (r28v20 java.lang.String) binds: [B:104:0x041e, B:63:0x0224, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x029d A[PHI: r5 r8 r13 r25 r28
      0x029d: PHI (r5v5 java.security.MessageDigest) = (r5v3 java.security.MessageDigest), (r5v2 java.security.MessageDigest), (r5v2 java.security.MessageDigest) binds: [B:75:0x029b, B:71:0x0273, B:59:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r8v3 byte[]) = (r8v2 byte[]), (r8v2 byte[]), (r8v4 byte[]) binds: [B:75:0x029b, B:71:0x0273, B:59:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:75:0x029b, B:71:0x0273, B:59:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r25v22 java.lang.String) = (r25v17 java.lang.String), (r25v18 java.lang.String), (r25v23 java.lang.String) binds: [B:75:0x029b, B:71:0x0273, B:59:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r28v13 java.lang.String) = (r28v8 java.lang.String), (r28v9 java.lang.String), (r28v14 java.lang.String) binds: [B:75:0x029b, B:71:0x0273, B:59:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02c5 A[PHI: r5 r14 r25 r28
      0x02c5: PHI (r5v4 java.security.MessageDigest) = (r5v2 java.security.MessageDigest), (r5v3 java.security.MessageDigest), (r5v2 java.security.MessageDigest) binds: [B:15:0x0092, B:78:0x02c3, B:67:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r14v4 java.lang.StringBuilder) = (r14v2 java.lang.StringBuilder), (r14v3 java.lang.StringBuilder), (r14v2 java.lang.StringBuilder) binds: [B:15:0x0092, B:78:0x02c3, B:67:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r25v19 java.lang.String) = (r25v8 java.lang.String), (r25v17 java.lang.String), (r25v20 java.lang.String) binds: [B:15:0x0092, B:78:0x02c3, B:67:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r28v10 java.lang.String) = (r28v0 java.lang.String), (r28v8 java.lang.String), (r28v11 java.lang.String) binds: [B:15:0x0092, B:78:0x02c3, B:67:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (l.C2477.f9839 <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m35597(int r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14892.m35597(int, java.lang.String):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35594(final String str, final int i, boolean z, ImageView imageView) {
        int iM45029;
        int i2;
        int i3;
        int i4;
        short s;
        int i5;
        int iM11306;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int iM11307;
        int i10;
        int i11;
        int i12;
        int i13;
        StringBuilder sb;
        String strM3407;
        i = i;
        ImageView imageView2 = imageView;
        int i14 = C0278.f1572;
        int i15 = C7105.f23796;
        int iM11308 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i14;
        int i16 = ((iM11308 ^ i15) * 26721) ^ (-841384843);
        String strM8240 = null;
        short[] sArr = null;
        int i17 = iM11308 ^ (-1920505139);
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s2 = 0;
        int i21 = -26261853;
        int i22 = 0;
        StringBuilder sb2 = null;
        Bitmap bitmapM35586 = null;
        final WeakReference weakReference = null;
        Bitmap bitmapM40091 = null;
        final String strM1441 = null;
        Charset charset = null;
        String str2 = null;
        MessageDigest messageDigestM49416 = null;
        int iM450211 = 0;
        while (true) {
            i21 = i17 ^ (i16 & (((i21 ^ i15) * (-24931)) >> 31));
            switch (i21) {
                case -2045674912:
                case 1924174096:
                    i4 = iM450211;
                    s = s2;
                    i5 = i22;
                    i20 = (s * s) + 33212169;
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i15;
                        i6 = ((iM11306 ^ i14) * (-16149)) ^ 1793521316;
                        i7 = 1984695952;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۜ") ^ i14) * (-47);
                        i6 = ((iM11306 ^ i15) * 15355) ^ (-1475939773);
                        i7 = -430768006;
                    }
                    i12 = iM11306 ^ i7;
                    s2 = s;
                    i22 = i5;
                    i16 = i6;
                    iM450211 = i4;
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case -2038748647:
                case -1138007936:
                    C3743.m10966();
                    if (!RunnableC1564.f6300) {
                        strM3407 = str2;
                        i13 = i22;
                        sb = sb2;
                        int iM11309 = (ThreadFactoryC3888.m11306("᩸᩻") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i23 = ((iM11309 ^ i15) * 32051) ^ (-171507121);
                        i17 = iM11309 ^ 151950800;
                        i22 = i13;
                        sb2 = sb;
                        i16 = i23;
                        str2 = strM3407;
                        i = i;
                    } else {
                        i4 = iM450211;
                        s = s2;
                        i5 = i22;
                        int iM113010 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i15;
                        int i24 = ((iM113010 ^ i14) * (-24101)) ^ 1625245687;
                        i12 = iM113010 ^ (-435504542);
                        s2 = s;
                        i22 = i5;
                        i16 = i24;
                        iM450211 = i4;
                        sb2 = null;
                        i17 = i12;
                        imageView2 = imageView;
                    }
                    break;
                case -1928667884:
                case 1802780754:
                    weakReference = new WeakReference(imageView2);
                    imageView2.setImageResource(iM450211);
                    RunnableC0195.m1428(imageView2, str);
                    if (!CallableC1627.f6528) {
                        strM3407 = str2;
                        i13 = i22;
                        sb = sb2;
                        int iM113011 = (ThreadFactoryC3888.m11306("᩸᩻") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i25 = ((iM113011 ^ i15) * 32051) ^ (-171507121);
                        i17 = iM113011 ^ 151950800;
                        i22 = i13;
                        sb2 = sb;
                        i16 = i25;
                        str2 = strM3407;
                        i = i;
                    } else {
                        iM45029 = C19806.m45029("ܿۛ") ^ i15;
                        i2 = ((iM45029 ^ i14) * 9701) ^ 117677294;
                        i3 = 1516259164;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    }
                    break;
                case -1878723313:
                case -1438814619:
                    ThreadFactoryC3888.m11308(AsyncTask.THREAD_POOL_EXECUTOR, new Runnable() { // from class: l.ۘ֨ۘ
                        {
                            int i26 = 158275146;
                            int i27 = C1066.f4915;
                            int i28 = ThreadFactoryC3888.f14547;
                            int iM450212 = C19806.m45029("᩺᩻") ^ i28;
                            int i29 = ((iM450212 ^ i27) * (-14891)) ^ (-972120040);
                            int i30 = 496502973;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 26331) >> 31) & i29) ^ (iM450212 ^ i30);
                                switch (i26) {
                                    case -2083071881:
                                    case 628764480:
                                        RunnableC1564.m5345();
                                        iM450212 = C19806.m45029("᩺ܳ") ^ i28;
                                        i29 = ((iM450212 ^ i27) * (-15515)) ^ (-762550301);
                                        i30 = 1127201717;
                                        break;
                                    case -1809910443:
                                    case 1999960351:
                                        if (C0629.f2722 <= 0) {
                                            iM450212 = (i27 - ThreadFactoryC3888.m11306("ܰ۠")) * 57;
                                            i29 = ((iM450212 ^ i28) * (-24803)) ^ (-2026698448);
                                            i30 = -526810934;
                                        } else {
                                            iM450212 = (C19806.m45029("᩷֫") + i28) * (-93);
                                            i29 = ((iM450212 ^ i27) * (-29961)) ^ (-337569422);
                                            i30 = 152659051;
                                        }
                                        break;
                                    case -1783388381:
                                    case -1149445893:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("֨֨")) * 75;
                                            i29 = ((iM450212 ^ i27) * (-22313)) ^ (-1546317188);
                                            i30 = -1917150167;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("֡۬") ^ i28) * (-37);
                                            i29 = ((iM450212 ^ i27) * (-2277)) ^ 1141568007;
                                            i30 = -103021594;
                                        }
                                        break;
                                    case -1672999417:
                                    case 152286458:
                                        if (C3660.f13403 >= 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("֨֨")) * 75;
                                            i29 = ((iM450212 ^ i27) * (-22313)) ^ (-1546317188);
                                            i30 = -1917150167;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i27;
                                            i29 = ((iM450212 ^ i28) * 15219) ^ (-723713029);
                                            i30 = -1155987398;
                                        }
                                        break;
                                    case -1315636441:
                                    case 1274596856:
                                        if (C1148.f5161 <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-11657)) ^ 1544317810;
                                            i30 = -429258672;
                                        } else {
                                            iM450212 = (C19806.m45029("᩺ۜ") + i28) * 27;
                                            i29 = ((iM450212 ^ i27) * 8883) ^ (-403002435);
                                            i30 = 1530322165;
                                        }
                                        break;
                                    case -1175310386:
                                    case 1205863543:
                                        if (C0962.f3784) {
                                            iM450212 = (i27 - ThreadFactoryC3888.m11306("ܰ۠")) * 57;
                                            i29 = ((iM450212 ^ i28) * (-24803)) ^ (-2026698448);
                                            i30 = -526810934;
                                        } else {
                                            iM450212 = (C19806.m45029("ۘ۬") ^ i27) * 61;
                                            i29 = ((iM450212 ^ i28) * (-19201)) ^ 1008183777;
                                            i30 = 1513230913;
                                        }
                                        break;
                                    case -1118421491:
                                    case 1510433337:
                                        if (C3722.f13525 <= 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("֨֨")) * 75;
                                            i29 = ((iM450212 ^ i27) * (-22313)) ^ (-1546317188);
                                            i30 = -1917150167;
                                        } else {
                                            iM450212 = (C19806.m45029("۠֫") ^ i27) * 73;
                                            i29 = ((iM450212 ^ i28) * 20597) ^ 1777371223;
                                            i30 = 1976926994;
                                        }
                                        break;
                                    case -1030963465:
                                    case 1711156005:
                                        return;
                                    case -1018235899:
                                    case -472123369:
                                        C0050.m946();
                                        if (C2642.f10294 <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-11657)) ^ 1544317810;
                                            i30 = -429258672;
                                        } else {
                                            iM450212 = C19806.m45029("᩺ܳ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * (-15515)) ^ (-762550301);
                                            i30 = 1127201717;
                                        }
                                        break;
                                    case -953926568:
                                    case 1681380691:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-11657)) ^ 1544317810;
                                            i30 = -429258672;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("֨᩺") ^ i27) * (-21);
                                            i29 = ((iM450212 ^ i28) * 2471) ^ 984615630;
                                            i30 = 1381884583;
                                        }
                                        break;
                                    case -559539695:
                                    case 693119991:
                                        if (C19806.f63586) {
                                            iM450212 = C19806.m45029("ܶ᩵") ^ i28;
                                            i29 = ((iM450212 ^ i27) * (-5937)) ^ (-1780837965);
                                            i30 = 736085123;
                                        } else {
                                            iM450212 = (C19806.m45029("ۢۢ") + i28) * (-25);
                                            i29 = ((iM450212 ^ i27) * 29865) ^ 579475152;
                                            i30 = 1388232107;
                                        }
                                        break;
                                    case -170102221:
                                    case 1912740621:
                                        if (RunnableC1895.f7152) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩻۫") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 19441) ^ (-1808066258);
                                            i30 = 208131053;
                                        } else {
                                            iM450212 = (i27 - ThreadFactoryC3888.m11306("ܰ۠")) * 57;
                                            i29 = ((iM450212 ^ i28) * (-24803)) ^ (-2026698448);
                                            i30 = -526810934;
                                        }
                                        break;
                                    case 357501512:
                                    case 577652564:
                                        C2124.m6673();
                                        throw new RuntimeException();
                                    case 461151702:
                                    case 1177261444:
                                        if (C3722.m10894() > 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("֨֨")) * 75;
                                            i29 = ((iM450212 ^ i27) * (-22313)) ^ (-1546317188);
                                            i30 = -1917150167;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-11657)) ^ 1544317810;
                                            i30 = -429258672;
                                        }
                                        break;
                                    case 2004379981:
                                    case 2054936339:
                                        if (C10634.f36300 >= 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("֨֨")) * 75;
                                            i29 = ((iM450212 ^ i27) * (-22313)) ^ (-1546317188);
                                            i30 = -1917150167;
                                        } else {
                                            iM450212 = C19806.m45029("֫᩸") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-13829)) ^ 1228295520;
                                            i30 = -101388988;
                                        }
                                        break;
                                    default:
                                        C3535.m10431();
                                        if (C3535.f13026 > 0) {
                                            iM450212 = (i27 - ThreadFactoryC3888.m11306("ܰ۠")) * 57;
                                            i29 = ((iM450212 ^ i28) * (-24803)) ^ (-2026698448);
                                            i30 = -526810934;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-11657)) ^ 1544317810;
                                            i30 = -429258672;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = null;
                            WeakReference weakReference2 = null;
                            int i26 = 1408225673;
                            int i27 = C0050.f912;
                            int i28 = AbstractC0464.f2088;
                            int iM450212 = (i27 - C19806.m45029("᩵ۢ")) * (-73);
                            int i29 = ((iM450212 ^ i28) * (-18931)) ^ (-1655636826);
                            int i30 = 447303754;
                            while (true) {
                                i26 = ((((i26 ^ i28) * 11399) >> 31) & i29) ^ (iM450212 ^ i30);
                                switch (i26) {
                                    case -2003382675:
                                    case -1795846989:
                                        RunnableC1564.m5345();
                                        if (!C2704.f10408) {
                                            iM450212 = ThreadFactoryC3888.m11306("ۢܳ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 4525) ^ (-579630097);
                                            i30 = 310117552;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܽ֨") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-7297)) ^ (-1837840482);
                                            i30 = 108301686;
                                        }
                                        break;
                                    case -1951834442:
                                    case -461624839:
                                        if (C0629.m2907()) {
                                            iM450212 = ThreadFactoryC3888.m11306("ۛ֫") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 14809) ^ 1743583316;
                                            i30 = -2119359858;
                                        } else {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("ۨ᩵")) * 119;
                                            i29 = ((iM450212 ^ i27) * (-9053)) ^ 1603890337;
                                            i30 = -1645895685;
                                        }
                                        break;
                                    case -1801294615:
                                    case -364587384:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM450212 = (i27 - C19806.m45029("ܳܽ")) * 97;
                                            i29 = ((iM450212 ^ i28) * 17077) ^ 1322425700;
                                            i30 = -951736110;
                                        } else {
                                            iM450212 = C19806.m45029("ܶ᩺") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 28467) ^ 1118525993;
                                            i30 = 893787389;
                                        }
                                        break;
                                    case -1606283770:
                                    case -350405952:
                                        C14892.m35593(str, i, str3, weakReference2);
                                        break;
                                    case -1320244809:
                                    case 1831096798:
                                        weakReference2 = weakReference;
                                        if (C2871.f10837 >= 0) {
                                            iM450212 = C19806.m45029("ۤܶ") ^ i27;
                                            i29 = ((iM450212 ^ i28) * 2469) ^ 1774159841;
                                            i30 = 803615946;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܶᩴ") ^ i27;
                                            i29 = ((iM450212 ^ i28) * 21113) ^ (-1610515796);
                                            i30 = -328700389;
                                        }
                                        break;
                                    case -1310930897:
                                    case 1382851760:
                                        str3 = strM1441;
                                        if (C1148.f5161 <= 0) {
                                            iM450212 = C19806.m45029("ۤܶ") ^ i27;
                                            i29 = ((iM450212 ^ i28) * 2469) ^ 1774159841;
                                            i30 = 803615946;
                                        } else {
                                            iM450212 = (C19806.m45029("ۛܽ") ^ i27) * 73;
                                            i29 = ((iM450212 ^ i28) * 17987) ^ (-2125014235);
                                            i30 = 1550906000;
                                        }
                                        break;
                                    case -1310482563:
                                    case -836731858:
                                        if (C0216.f1393 != 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("ۨ᩵")) * 119;
                                            i29 = ((iM450212 ^ i27) * (-9053)) ^ 1603890337;
                                            i30 = -1645895685;
                                        } else {
                                            iM450212 = C19806.m45029("۬ۙ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 11069) ^ 1713802463;
                                            i30 = 1522881844;
                                        }
                                        break;
                                    case -1186531745:
                                    case 1183169829:
                                        if (RunnableC1606.m5473() != 0) {
                                            iM450212 = (i27 - C19806.m45029("ܳܽ")) * 97;
                                            i29 = ((iM450212 ^ i28) * 17077) ^ 1322425700;
                                            i30 = -951736110;
                                        } else {
                                            iM450212 = C19806.m45029("ۤܽ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * (-15325)) ^ (-740493418);
                                            i30 = -859830505;
                                        }
                                        break;
                                    case -834518759:
                                    case -640725095:
                                        if (C10634.f36300 >= 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("ۨ᩵")) * 119;
                                            i29 = ((iM450212 ^ i27) * (-9053)) ^ 1603890337;
                                            i30 = -1645895685;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i27;
                                            i29 = ((iM450212 ^ i28) * 26111) ^ 788632501;
                                            i30 = -1109215206;
                                        }
                                        break;
                                    case -555838932:
                                    case 1192813659:
                                        if (C0797.f3386) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("ۨ᩵")) * 119;
                                            i29 = ((iM450212 ^ i27) * (-9053)) ^ 1603890337;
                                            i30 = -1645895685;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ۨ֫") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-5473)) ^ 729970186;
                                            i30 = -2113257970;
                                        }
                                        break;
                                    case -238494855:
                                    case 780340080:
                                        if (C3722.m10894() <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("ܽ֨") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-7297)) ^ (-1837840482);
                                            i30 = 108301686;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 17229) ^ 1486181268;
                                            i30 = 528050263;
                                        }
                                        break;
                                    case 44515198:
                                    case 1926152676:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                                            iM450212 = (i27 - C19806.m45029("ܳܽ")) * 97;
                                            i29 = ((iM450212 ^ i28) * 17077) ^ 1322425700;
                                            i30 = -951736110;
                                        } else {
                                            iM450212 = (i27 - C19806.m45029("᩷֨")) * (-45);
                                            i29 = ((iM450212 ^ i28) * (-18325)) ^ (-737310207);
                                            i30 = -611216077;
                                        }
                                        break;
                                    case 158736049:
                                    case 1247736478:
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("ۢܳ") ^ i28;
                                            i29 = ((iM450212 ^ i27) * 4525) ^ (-579630097);
                                            i30 = 310117552;
                                        } else {
                                            iM450212 = (i27 - C19806.m45029("ܳܽ")) * 97;
                                            i29 = ((iM450212 ^ i28) * 17077) ^ 1322425700;
                                            i30 = -951736110;
                                        }
                                        break;
                                    case 437161112:
                                    case 1243508486:
                                        C3660.m10791();
                                        iM450212 = (i27 - C19806.m45029("ܳܽ")) * 97;
                                        i29 = ((iM450212 ^ i28) * 17077) ^ 1322425700;
                                        i30 = -951736110;
                                        break;
                                    case 478717963:
                                    case 989243385:
                                        C2124.m6673();
                                        break;
                                    default:
                                        if (C0216.f1393 == 0) {
                                            iM450212 = (i28 - ThreadFactoryC3888.m11306("ۨ᩵")) * 119;
                                            i29 = ((iM450212 ^ i27) * (-9053)) ^ 1603890337;
                                            i30 = -1645895685;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ܽ֨") ^ i27;
                                            i29 = ((iM450212 ^ i28) * (-7297)) ^ (-1837840482);
                                            i30 = 108301686;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1863112758:
                case 1539521687:
                    i4 = iM450211;
                    s = s2;
                    i5 = i22;
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܳ") ^ i14;
                        i6 = ((iM11306 ^ i15) * (-9387)) ^ 1150118721;
                        i7 = -1968844923;
                        i12 = iM11306 ^ i7;
                        s2 = s;
                        i22 = i5;
                        i16 = i6;
                        iM450211 = i4;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i15;
                        int i26 = ((iM113012 ^ i14) * (-24101)) ^ 1625245687;
                        i12 = iM113012 ^ (-435504542);
                        s2 = s;
                        i22 = i5;
                        i16 = i26;
                        iM450211 = i4;
                        sb2 = null;
                    }
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case -1754556374:
                case 4091851:
                    bitmapM35586 = m35586(bitmapM40091);
                    if (bitmapM35586 != bitmapM40091) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i14;
                        i2 = ((iM45029 ^ i15) * (-2787)) ^ 1316255990;
                        i3 = -1033920590;
                    } else {
                        iM45029 = (C19806.m45029("ۧ۬") ^ i14) * 11;
                        i2 = ((iM45029 ^ i15) * 43) ^ 1142656961;
                        i3 = -638845703;
                    }
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    break;
                case -1747838977:
                case 1162860679:
                    i4 = iM450211;
                    i5 = i22;
                    s2 = f48656[330];
                    if (C10634.m26820()) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("֡᩷")) * 15;
                        i8 = ((iM450210 ^ i15) * 32547) ^ (-1516652156);
                        i9 = -1178735430;
                    } else {
                        iM450210 = (C19806.m45029("᩵ۜ") + i15) * (-97);
                        i8 = ((iM450210 ^ i14) * (-17391)) ^ (-1748363059);
                        i9 = 1014155930;
                    }
                    int i27 = iM450210 ^ i9;
                    i22 = i5;
                    iM450211 = i4;
                    i17 = i27;
                    i16 = i8;
                    imageView2 = imageView;
                    break;
                case -1647483281:
                case 1022234045:
                    imageView2.setImageBitmap(bitmapM35586);
                    break;
                case -1250079015:
                case 1999673348:
                    imageView2.setImageResource(iM450211);
                    break;
                case -1215249142:
                case 498974932:
                    C1461.m5080();
                    i4 = iM450211;
                    s = s2;
                    i5 = i22;
                    int iM113013 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i15;
                    int i28 = ((iM113013 ^ i14) * (-24101)) ^ 1625245687;
                    i12 = iM113013 ^ (-435504542);
                    s2 = s;
                    i22 = i5;
                    i16 = i28;
                    iM450211 = i4;
                    sb2 = null;
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case -1157341419:
                case 488149081:
                    i5 = i22;
                    i19 = 345;
                    i18 = 1;
                    if (C2871.f10837 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۧ֡") ^ i14;
                        i10 = ((iM11307 ^ i15) * 2647) ^ (-2046242643);
                        i11 = 1402679924;
                        i17 = iM11307 ^ i11;
                        i22 = i5;
                        i16 = i10;
                        imageView2 = imageView;
                    } else {
                        i4 = iM450211;
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("֡᩷")) * 15;
                        i8 = ((iM450210 ^ i15) * 32547) ^ (-1516652156);
                        i9 = -1178735430;
                        int i29 = iM450210 ^ i9;
                        i22 = i5;
                        iM450211 = i4;
                        i17 = i29;
                        i16 = i8;
                        imageView2 = imageView;
                    }
                    break;
                case -888279736:
                case -16460494:
                    i5 = i22;
                    iM450211 = C19806.m45029(strM8240) ^ 2124119069;
                    if (z) {
                        iM11307 = (ThreadFactoryC3888.m11306("۬۠") + i15) * (-57);
                        i10 = ((iM11307 ^ i14) * 13087) ^ (-1822515462);
                        i11 = -737161920;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۫֫") ^ i14;
                        i10 = ((iM11307 ^ i15) * 15693) ^ (-1701396587);
                        i11 = 1783056195;
                    }
                    i17 = iM11307 ^ i11;
                    i22 = i5;
                    i16 = i10;
                    imageView2 = imageView;
                    break;
                case -742314284:
                case 1126584078:
                    C2788.m8472();
                    if (!RunnableC1895.f7152) {
                        i4 = iM450211;
                        s = s2;
                        i5 = i22;
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i15;
                        i6 = ((iM11306 ^ i14) * (-16149)) ^ 1793521316;
                        i7 = 1984695952;
                        i12 = iM11306 ^ i7;
                        s2 = s;
                        i22 = i5;
                        i16 = i6;
                        iM450211 = i4;
                        i17 = i12;
                        imageView2 = imageView;
                    } else {
                        strM3407 = str2;
                        i13 = i22;
                        sb = sb2;
                        int iM113014 = (ThreadFactoryC3888.m11306("᩸᩻") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i210 = ((iM113014 ^ i15) * 32051) ^ (-171507121);
                        i17 = iM113014 ^ 151950800;
                        i22 = i13;
                        sb2 = sb;
                        i16 = i210;
                        str2 = strM3407;
                        i = i;
                    }
                    break;
                case -613900447:
                case 997750005:
                    i5 = i22;
                    messageDigestM49416 = C22253.m49416();
                    short[] sArr2 = f48656;
                    if (C0629.f2722 > 0) {
                        i4 = iM450211;
                        String strM3009 = C0671.m3009(sArr2, 334, 11, i5);
                        if (C3743.m10966() > 0) {
                            StringBuilder sb3 = new StringBuilder(strM3009);
                            C2788.m8480(sb3, str);
                            sArr = f48656;
                            if (C1066.m4023() > 0) {
                                int iM450212 = (C19806.m45029("᩵ܰ") + i15) * 65;
                                i6 = ((iM450212 ^ i14) * 26611) ^ (-645161669);
                                i12 = iM450212 ^ 2035491667;
                                sb2 = sb3;
                                i22 = i5;
                                i16 = i6;
                                iM450211 = i4;
                                i17 = i12;
                                imageView2 = imageView;
                            } else {
                                sb2 = sb3;
                                iM450210 = (i15 - C19806.m45029("ۚ֫")) * (-13);
                                i8 = ((iM450210 ^ i14) * 1181) ^ 152285203;
                                i9 = 1798541742;
                                int i211 = iM450210 ^ i9;
                                i22 = i5;
                                iM450211 = i4;
                                i17 = i211;
                                i16 = i8;
                                imageView2 = imageView;
                            }
                        }
                    } else {
                        i4 = iM450211;
                    }
                    s = s2;
                    int iM113015 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i15;
                    int i212 = ((iM113015 ^ i14) * (-24101)) ^ 1625245687;
                    i12 = iM113015 ^ (-435504542);
                    s2 = s;
                    i22 = i5;
                    i16 = i212;
                    iM450211 = i4;
                    sb2 = null;
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case -550787084:
                case 964116199:
                    C17169.m40093(strM1441, bitmapM35586);
                    iM45029 = (C19806.m45029("ۧ۬") ^ i14) * 11;
                    i2 = ((iM45029 ^ i15) * 43) ^ 1142656961;
                    i3 = -638845703;
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    break;
                case -503251542:
                case 1203082164:
                    i22 = 39714;
                    int iM450213 = C19806.m45029("ۤᩳ") ^ i14;
                    i16 = 327196614 ^ ((iM450213 ^ i15) * 13459);
                    imageView2 = imageView;
                    iM450211 = iM450211;
                    i17 = iM450213 ^ 797159566;
                    i = i;
                    break;
                case -484363678:
                case 745412333:
                    C1377.m4833();
                    break;
                case 5275685:
                case 2057833137:
                    if (C2249.f8050 >= 0) {
                        i4 = iM450211;
                        i5 = i22;
                        iM450210 = (i15 - C19806.m45029("ۚ֫")) * (-13);
                        i8 = ((iM450210 ^ i14) * 1181) ^ 152285203;
                        i9 = 1798541742;
                        int i213 = iM450210 ^ i9;
                        i22 = i5;
                        iM450211 = i4;
                        i17 = i213;
                        i16 = i8;
                        imageView2 = imageView;
                    }
                    i4 = iM450211;
                    s = s2;
                    i5 = i22;
                    iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i15;
                    i6 = ((iM11306 ^ i14) * (-16149)) ^ 1793521316;
                    i7 = 1984695952;
                    i12 = iM11306 ^ i7;
                    s2 = s;
                    i22 = i5;
                    i16 = i6;
                    iM450211 = i4;
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case 304443497:
                case 437280140:
                    i22 = 8630;
                    int iM450214 = C19806.m45029("ۤᩳ") ^ i14;
                    i16 = 327196614 ^ ((iM450214 ^ i15) * 13459);
                    imageView2 = imageView;
                    iM450211 = iM450211;
                    i17 = iM450214 ^ 797159566;
                    i = i;
                    break;
                case 332094586:
                case 1324149385:
                    i13 = i22;
                    sb = sb2;
                    C1148.m4223(sb, C2788.m8470(sArr, i19, i18, i13));
                    C2124.m6683(sb, i);
                    strM3407 = C0817.m3407(sb);
                    charset = StandardCharsets.UTF_8;
                    if (C1189.f5284 > 0) {
                        int iM113016 = ThreadFactoryC3888.m11306("ۗ᩹") ^ i15;
                        i17 = iM113016 ^ (-1483398800);
                        i22 = i13;
                        sb2 = sb;
                        i16 = ((iM113016 ^ i14) * 19613) ^ (-1831615194);
                        str2 = strM3407;
                        imageView2 = imageView;
                    } else {
                        int iM113017 = (ThreadFactoryC3888.m11306("᩸᩻") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i214 = ((iM113017 ^ i15) * 32051) ^ (-171507121);
                        i17 = iM113017 ^ 151950800;
                        i22 = i13;
                        sb2 = sb;
                        i16 = i214;
                        str2 = strM3407;
                        i = i;
                    }
                    break;
                case 588004460:
                case 1890574516:
                    i4 = iM450211;
                    i5 = i22;
                    s = s2;
                    if (i20 - (s * 11526) < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩵") + i15) * (-89);
                        i6 = ((iM11306 ^ i14) * (-14439)) ^ 1444688901;
                        i7 = -431849728;
                    } else {
                        iM11306 = C19806.m45029("ܽۛ") ^ i15;
                        i6 = ((iM11306 ^ i14) * (-7859)) ^ 1180318619;
                        i7 = -666779016;
                    }
                    i12 = iM11306 ^ i7;
                    s2 = s;
                    i22 = i5;
                    i16 = i6;
                    iM450211 = i4;
                    i17 = i12;
                    imageView2 = imageView;
                    break;
                case 854868966:
                case 1601845989:
                    i4 = iM450211;
                    i5 = i22;
                    strM8240 = C2704.m8240(f48656, 331, 3, i5);
                    if (C0526.m2437() < 0) {
                        iM450210 = C19806.m45029("֫֫") ^ i14;
                        i8 = ((iM450210 ^ i15) * (-1455)) ^ (-1577134126);
                        i9 = -495754443;
                        int i215 = iM450210 ^ i9;
                        i22 = i5;
                        iM450211 = i4;
                        i17 = i215;
                        i16 = i8;
                        imageView2 = imageView;
                    } else {
                        s = s2;
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i15;
                        i6 = ((iM11306 ^ i14) * (-16149)) ^ 1793521316;
                        i7 = 1984695952;
                        i12 = iM11306 ^ i7;
                        s2 = s;
                        i22 = i5;
                        i16 = i6;
                        iM450211 = i4;
                        i17 = i12;
                        imageView2 = imageView;
                    }
                    break;
                default:
                    messageDigestM49416.update(C0962.m3742(str2, charset));
                    strM1441 = RunnableC0195.m1441(messageDigestM49416.digest());
                    bitmapM40091 = C17169.m40091(strM1441);
                    if (bitmapM40091 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۨ") ^ i15;
                        i2 = ((iM45029 ^ i14) * 20369) ^ 1922226258;
                        i3 = 1561274958;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩴ") ^ i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = ((iM45029 ^ i15) * 1601) ^ (-2013598313);
                        i3 = -80875862;
                    }
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01b3 A[PHI: r1 r4 r17
      0x01b3: PHI (r1v35 int) = (r1v31 int), (r1v37 int) binds: [B:53:0x019a, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:53:0x019a, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r17v20 int) = (r17v17 int), (r17v22 int) binds: [B:53:0x019a, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0246 A[PHI: r3 r10 r13 r18
      0x0246: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:65:0x0244, B:35:0x00d9, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:65:0x0244, B:35:0x00d9, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:65:0x0244, B:35:0x00d9, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r18v5 int) = (r18v4 int), (r18v3 int), (r18v3 int) binds: [B:65:0x0244, B:35:0x00d9, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x028d A[PHI: r1 r17
      0x028d: PHI (r1v36 int) = (r1v28 int), (r1v37 int) binds: [B:71:0x0277, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r17v21 int) = (r17v14 int), (r17v22 int) binds: [B:71:0x0277, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m35586(Bitmap bitmap) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        int i7 = C2124.f7782;
        int i8 = C2642.f10294;
        int iM11306 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i8;
        int i9 = ((iM11306 ^ i7) * 2475) ^ (-1811738634);
        int i10 = iM11306 ^ 2054282925;
        int height = 0;
        int i11 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float fMin = 0.0f;
        float f5 = 0.0f;
        int iRound = 0;
        float f6 = 0.0f;
        int iRound2 = 0;
        int i12 = 1331241043;
        int width = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 7179) >> 31));
            switch (i12) {
                case -2106799702:
                case -585301085:
                    C2642.m8171();
                    iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i8;
                    i = ((iM45029 ^ i7) * 28123) ^ (-1184414270);
                    i2 = -1904630009;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1945444791:
                case 1984297210:
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i7;
                        i = ((iM45029 ^ i8) * 11943) ^ (-225827148);
                        i2 = -866806813;
                    } else {
                        iM45029 = C19806.m45029("֨ۗ") ^ i7;
                        i = ((iM45029 ^ i8) * (-30749)) ^ 798216335;
                        i2 = 1524959937;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1872364517:
                case -1144066070:
                    if (C0526.m2437() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܶ") ^ i7;
                        i = ((iM45029 ^ i8) * (-133)) ^ (-360757038);
                        i2 = -1393469597;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        i3 = height;
                        i4 = width;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۜܿ")) * 7;
                        i5 = ((iM450210 ^ i7) * (-4627)) ^ (-1429503973);
                        i6 = -73868295;
                        int i13 = iM450210 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i13;
                    }
                    break;
                case -1847459481:
                case 762056236:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return null;
                case -1702520549:
                case 859148939:
                    return bitmap;
                case -1628458084:
                case 37794801:
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true);
                    bitmap.recycle();
                    return bitmapCreateScaledBitmap;
                case -1598830706:
                case 193455865:
                    f = i11;
                    i4 = width;
                    f2 = i4;
                    if (C0629.f2722 <= 0) {
                        i3 = height;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۜܿ")) * 7;
                        i5 = ((iM450210 ^ i7) * (-4627)) ^ (-1429503973);
                        i6 = -73868295;
                    } else {
                        iM450210 = C19806.m45029("᩷ۛ") ^ i7;
                        i3 = height;
                        i5 = ((iM450210 ^ i8) * (-16533)) ^ 841708210;
                        i6 = -1513766370;
                    }
                    int i14 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i14;
                    break;
                case -1093799568:
                case -962428033:
                    fMin = Math.min(f3, f / f4);
                    if (RunnableC1606.m5473() == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴܳ") ^ i7) * 37;
                        i = ((iM45029 ^ i8) * 26055) ^ 1829734878;
                        i2 = 1062613890;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        i3 = height;
                        i4 = width;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۜܿ")) * 7;
                        i5 = ((iM450210 ^ i7) * (-4627)) ^ (-1429503973);
                        i6 = -73868295;
                        int i15 = iM450210 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i15;
                    }
                    break;
                case -957931823:
                case -613795986:
                    C1148.m4232();
                    if (C3660.m10791() == 0) {
                        i3 = height;
                        i4 = width;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۜܿ")) * 7;
                        i5 = ((iM450210 ^ i7) * (-4627)) ^ (-1429503973);
                        i6 = -73868295;
                        int i16 = iM450210 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i16;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i8;
                        i = ((iM45029 ^ i7) * 28123) ^ (-1184414270);
                        i2 = -1904630009;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case -765624495:
                case 1671013636:
                    f3 = f / f2;
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ܿ۟") ^ i8;
                        i = ((iM45029 ^ i7) * 19523) ^ 1433613497;
                        i2 = -485965371;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i8;
                        i = ((iM45029 ^ i7) * 28123) ^ (-1184414270);
                        i2 = -1904630009;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -489876118:
                case 1984260870:
                    f5 = f2 * fMin;
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i7;
                        i = ((iM45029 ^ i8) * 11943) ^ (-225827148);
                        i2 = -866806813;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧܺ") ^ i7;
                        i = ((iM45029 ^ i8) * 12133) ^ 139333802;
                        i2 = 619583084;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -252223475:
                case -180653025:
                    iRound2 = Math.round(f6);
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i7;
                        i = ((iM45029 ^ i8) * 11943) ^ (-225827148);
                        i2 = -866806813;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩻") ^ i8;
                        i = ((iM45029 ^ i7) * (-28673)) ^ 324283841;
                        i2 = 500901806;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case 399794416:
                case 763247333:
                    i3 = height;
                    i4 = width;
                    if (C0797.f3386) {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۜܿ")) * 7;
                        i5 = ((iM450210 ^ i7) * (-4627)) ^ (-1429503973);
                        i6 = -73868295;
                    } else {
                        iM450210 = (C19806.m45029("ۖ֡") ^ i8) * 61;
                        i5 = ((iM450210 ^ i7) * (-23711)) ^ 1583250324;
                        i6 = -871866930;
                    }
                    int i17 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i17;
                    break;
                case 426842962:
                case 1390694914:
                    i3 = height;
                    i4 = width;
                    if (height > i11) {
                        iM450210 = (i7 - C19806.m45029("᩹ۚ")) * (-63);
                        i5 = ((iM450210 ^ i8) * 13917) ^ (-1967367673);
                        i6 = 825651076;
                    } else {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("۫᩺")) * 23;
                        i5 = ((iM450210 ^ i7) * 18269) ^ (-615946098);
                        i6 = 1281871014;
                    }
                    int i18 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i18;
                    break;
                case 648187800:
                case 2035868065:
                    C2249.m6915();
                    if (C2477.m7593() < 0) {
                        i3 = height;
                        i4 = width;
                        iM450210 = (C19806.m45029("ܰܳ") + i7) * 9;
                        i5 = ((iM450210 ^ i8) * 2407) ^ (-333679787);
                        i6 = -1240267308;
                        int i19 = iM450210 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i19;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i8;
                        i = ((iM45029 ^ i7) * 28123) ^ (-1184414270);
                        i2 = -1904630009;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1099619223:
                case 1615463125:
                    i3 = height;
                    i4 = width;
                    i11 = 512;
                    if (i4 <= 512) {
                        iM450210 = (C19806.m45029("۠ۜ") + i7) * (-113);
                        i5 = ((iM450210 ^ i8) * (-3983)) ^ 275752051;
                        i6 = 1629284587;
                    } else {
                        iM450210 = (i7 - C19806.m45029("᩹ۚ")) * (-63);
                        i5 = ((iM450210 ^ i8) * 13917) ^ (-1967367673);
                        i6 = 825651076;
                    }
                    int i110 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i110;
                    break;
                case 1142840547:
                case 1892106257:
                    i3 = height;
                    i4 = width;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM450210 = (C19806.m45029("ܰܳ") + i7) * 9;
                        i5 = ((iM450210 ^ i8) * 2407) ^ (-333679787);
                        i6 = -1240267308;
                    } else {
                        iM450210 = (i8 - C19806.m45029("ۜܽ")) * (-85);
                        i5 = ((iM450210 ^ i7) * 31693) ^ (-1129467046);
                        i6 = -1071400988;
                    }
                    int i111 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i111;
                    break;
                case 1400196436:
                case 1428635188:
                    iRound = Math.round(f5);
                    f6 = f4 * fMin;
                    if (!C2704.f10408) {
                        i3 = height;
                        i4 = width;
                        iM450210 = (C19806.m45029("ܰܳ") + i7) * 9;
                        i5 = ((iM450210 ^ i8) * 2407) ^ (-333679787);
                        i6 = -1240267308;
                        int i112 = iM450210 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i112;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") + i8) * (-17);
                        i = ((iM45029 ^ i7) * (-13205)) ^ (-1999038134);
                        i2 = 323914780;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1709809485:
                case 1835490370:
                    i3 = height;
                    i4 = width;
                    if (bitmap != null) {
                        iM450210 = C19806.m45029("֫᩵") ^ i7;
                        i5 = ((iM450210 ^ i8) * 22199) ^ (-1877173762);
                        i6 = 31372507;
                    } else {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("۫᩺")) * 23;
                        i5 = ((iM450210 ^ i7) * 18269) ^ (-615946098);
                        i6 = 1281871014;
                    }
                    int i113 = iM450210 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i113;
                    break;
                default:
                    f4 = height;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܶ") ^ i7;
                        i = ((iM45029 ^ i8) * (-133)) ^ (-360757038);
                        i2 = -1393469597;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۜ") ^ i8;
                        i = ((iM45029 ^ i7) * 13375) ^ (-410784733);
                        i2 = -650566752;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (l.C1148.f5161 > 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18485 m35589(int r22, java.lang.String r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14892.m35589(int, java.lang.String):l.ᩴۗ۠");
    }
}
