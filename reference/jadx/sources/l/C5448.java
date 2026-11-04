package l;

import android.annotation.SuppressLint;
import bin.mt.plugin.api.LocalString;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;

/* JADX INFO: renamed from: l.ۚۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B3Z3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5448 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f19031;

    /* JADX INFO: renamed from: ۜ᩻ۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f19032 = {2588, -28855, -28855, -28869, -28820, -28820, -28869, -28814, -28814, -28881, -28846, -28846, -28846, 4541, 26445, 26449, 26440, 26458, 26452, 26451, 26387, 26449, 26450, 26458, 9434, -24330, -24406, -24330, 4422, 6328, 6323, 6324, 6388, 6327, 6318, 6388, 6314, 6326, 6319, 6333, 6323, 6324, 6388, 6313, 6307, 6313, 6318, 6335, 6327, 8775, -11733, -11738, -11733, 5759, 12116, 12092, 12073, 12157, 12046, 12072, 12077, 12077, 12079, 12088, 12078, 12078, 12088, 12089, 12135, 12157, 12116, 12062, 12092, 12072, 12078, 12088, 12089, 12157, 12095, 12068, 12135, 12157, 10635, 10634, 10629, 10628, 10631, 10630, 10625, 10626, 10685, 10684, 10687, 10681, 10680, 10683, 10682, 10677, 10678, 10673, 2913, 6481, 6403, 6427, 6417, 6410, 6427, 6413, 6420, 6425, 6410, 6520, 6410, 6429, 6430, 6429, 6410, 6429, 6422, 6427, 6429, 6498, 6405, 6481, 6518, 6518, 6518, 6520, 6520, 6453, 6455, 6442, 6461, 6481, 6457, 6444, 6520, 6481, 6411, 6445, 6440, 6440, 6442, 6461, 6443, 6443, 6461, 6460, 6498, 6520, 8078, 8079, 8064, 8065, 8066, 8067, 8068, 8071, 8120, 8121, 8122, 8124, 8125, 8126, 8127, 8112, 8115, 8116, 6427, 6457, 6445, 6443, 6461, 6460, 6520, 6458, 6433, 6498, 6520, 8800, -4495, -4499, -4492, -4506, -4504, -4497, -4561, -4499, -4498, -4506, 7183, 16793, 16788, 16795, 16786, 8498, 21092};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final StringBuilder f19033;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Writer f19034;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17159 f19035;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String f19036;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17159 f19037;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String f19038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m16276() {
        short s = f19032[13];
        int i = ((s * s) + 291180096) - (s * 34128) >= 0 ? 26429 : 53537;
        synchronized (C5448.class) {
            new File(C21576.m49072(), C3690.m11996(f19032, 14, 10, i)).delete();
            f19034 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m16279(String str, String str2) {
        short s = f19032[49];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = i - (i2 * i2) > 0 ? 61111 : 53771;
        synchronized (C5448.class) {
            if (f19034 == null) {
                m16284();
                if (f19034 == null) {
                    return;
                }
            }
            StringBuilder sb = f19033;
            int i4 = 0;
            sb.setLength(0);
            C1783.m6234(sb, f19031.format(C3690.m12001(C2834.m9342())));
            C1783.m6234(sb, C3448.m11252(f19032, 50, 3, i3));
            C3779.m12258(sb, str);
            int iM7738 = C2287.m7738(sb);
            int iM8073 = C2375.m8073(str2, 10);
            boolean z = true;
            int i5 = 0;
            while (iM8073 != -1) {
                m16277(i5, iM8073, z ? 0 : iM7738, str2);
                i5 = iM8073 + 1;
                iM8073 = str2.indexOf(10, i5);
                z = false;
            }
            if (z || i5 != C2966.m9671(str2)) {
                int iM10045 = C3077.m10045(str2);
                if (!z) {
                    i4 = iM7738;
                }
                m16277(i5, iM10045, i4, str2);
            }
            try {
                f19034.write(C1080.m4058(f19033));
                f19034.flush();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static LocalString m16285() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1817877569;
        int i6 = C2354.f7599;
        int i7 = C3779.f12953;
        int iM2761 = (C0619.m2761("ۡ᩻") + i6) * (-73);
        int i8 = ((iM2761 ^ i7) * 733) ^ 806572117;
        int i9 = -931050828;
        while (true) {
            i5 = ((((i5 ^ i7) * 30459) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2108215525:
                case -1976688703:
                    if (!C2023.f6737) {
                        iM2761 = C0619.m2761("۟۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10697) ^ (-1193851110);
                        i9 = -1863868707;
                    } else {
                        iM2761 = C0773.m3169("ܺۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5485) ^ (-118070333);
                        i9 = -861926388;
                    }
                    break;
                case -2096389282:
                case 720368718:
                    i3 = 1;
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ܺۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5485) ^ (-118070333);
                        i9 = -861926388;
                    } else {
                        iM2761 = C0619.m2761("֫֡") ^ i7;
                        i8 = ((iM2761 ^ i6) * 25305) ^ (-1908779989);
                        i9 = 1063548044;
                    }
                    break;
                case -2035365764:
                case -723178863:
                    if (f19035 == null) {
                        iM2761 = C0619.m2761("ܶ֡") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-24641)) ^ 80890654;
                        i9 = -659062049;
                    } else {
                        iM2761 = C0619.m2761("ܺۢ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-25175)) ^ 2049709466;
                        i9 = 1636005760;
                    }
                    break;
                case -2024312433:
                case 1684190087:
                    C3033.m9845();
                    if (C0773.f2792 > 0) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-12725)) ^ (-1012664265);
                        i9 = 1095881022;
                    } else {
                        iM2761 = C0773.m3169("ܺۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5485) ^ (-118070333);
                        i9 = -861926388;
                    }
                    break;
                case -2011736897:
                case -449268780:
                    C0619.m2763();
                    iM2761 = C0619.m2761("۟۠") ^ i6;
                    i8 = ((iM2761 ^ i7) * 10697) ^ (-1193851110);
                    i9 = -1863868707;
                    break;
                case -1612891916:
                case 1617576303:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-12725)) ^ (-1012664265);
                        i9 = 1095881022;
                    } else {
                        iM2761 = (i7 - C0619.m2761("۟ۛ")) * (-15);
                        i8 = ((iM2761 ^ i6) * 3473) ^ 1342766213;
                        i9 = -1312705710;
                    }
                    break;
                case -1393049960:
                case 786374024:
                    s2 = 1;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-12725)) ^ (-1012664265);
                        i9 = 1095881022;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۖۙ")) * (-17);
                        i8 = ((iM2761 ^ i6) * (-11451)) ^ (-467110313);
                        i9 = 269961462;
                    }
                    break;
                case -1241567321:
                case 568202472:
                    s = sArr[c];
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i6) * 55;
                        i8 = ((iM2761 ^ i7) * (-31333)) ^ 1364918709;
                        i9 = -1897673654;
                    } else {
                        iM2761 = C0773.m3169("᩹᩸") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-20957)) ^ 2131015515;
                        i9 = 1016395799;
                    }
                    break;
                case -1133465449:
                case 484025170:
                    sArr = f19032;
                    c = 190;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("۟۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10697) ^ (-1193851110);
                        i9 = -1863868707;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۟") ^ i6) * 7;
                        i8 = ((iM2761 ^ i7) * (-11867)) ^ 15971074;
                        i9 = 1836645159;
                    }
                    break;
                case -801936963:
                case 753390251:
                    int i10 = s + s2;
                    i = i10 * i10;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩻ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-14507)) ^ 644339490;
                        i9 = -201226701;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۤ᩻")) * (-83);
                        i8 = ((iM2761 ^ i7) * (-24679)) ^ (-370325718);
                        i9 = -892925616;
                    }
                    break;
                case -675717600:
                case 293720326:
                    i4 = 36727;
                    iM2761 = C0773.m3169("֨֡") ^ i6;
                    i8 = ((iM2761 ^ i7) * 29833) ^ 535207994;
                    i9 = 1149605880;
                    break;
                case -585466713:
                case 1263005005:
                    i4 = 16885;
                    iM2761 = C0773.m3169("֨֡") ^ i6;
                    i8 = ((iM2761 ^ i7) * 29833) ^ 535207994;
                    i9 = 1149605880;
                    break;
                case -399887996:
                case -68307819:
                    i2 = s * 2;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i6) * 55;
                        i8 = ((iM2761 ^ i7) * (-31333)) ^ 1364918709;
                        i9 = -1897673654;
                    } else {
                        iM2761 = (C0619.m2761("ܰۡ") + i7) * 127;
                        i8 = ((iM2761 ^ i6) * 17391) ^ 394789239;
                        i9 = -1981169449;
                    }
                    break;
                case -248561982:
                case 1983410927:
                    short[] sArr2 = f19032;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("۟۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10697) ^ (-1193851110);
                        i9 = -1863868707;
                    } else if (!C4282.m13644()) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-12725)) ^ (-1012664265);
                        i9 = 1095881022;
                    } else if (C2485.f7950 == 0) {
                        f19035 = new C17159(C3077.m10047(sArr2, 191, 4, i4));
                        iM2761 = C0619.m2761("ܺۢ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-25175)) ^ 2049709466;
                        i9 = 1636005760;
                    } else {
                        iM2761 = C0773.m3169("᩻ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-14507)) ^ 644339490;
                        i9 = -201226701;
                    }
                    break;
                case -236742408:
                case 494903836:
                    return f19035;
                case 385652972:
                case 1959134391:
                    if ((i2 + i3) - i <= 0) {
                        iM2761 = (i6 - C0773.m3169("ۨۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i7) * 27295) ^ 1675747502;
                        i9 = -771508153;
                    } else {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-7675)) ^ (-311008620);
                        i9 = -31310790;
                    }
                    break;
                case 1292322909:
                case 1758029588:
                    AbstractC3624.m11755();
                    if (C1826.f6190 > 0) {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i6) * 55;
                        i8 = ((iM2761 ^ i7) * (-31333)) ^ 1364918709;
                        i9 = -1897673654;
                    } else {
                        iM2761 = C0619.m2761("۟۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10697) ^ (-1193851110);
                        i9 = -1863868707;
                    }
                    break;
                default:
                    C3448.m11248();
                    C1542.m5459();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16282() {
        String str = null;
        String str2 = null;
        int i = -156934378;
        int i2 = C1321.f4751;
        int i3 = C2288.f7433;
        int iM3169 = (C0773.m3169("᩹ܶ") + i3) * 51;
        int i4 = ((iM3169 ^ i2) * (-25651)) ^ 626801455;
        int i5 = 1722972277;
        while (true) {
            i = ((((i ^ i2) * 28279) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2101400463:
                case -1203258510:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۨܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1643) ^ (-2112448309);
                        i5 = 1686020284;
                    } else {
                        iM3169 = C0773.m3169("ۙۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2255) ^ (-1221661710);
                        i5 = -1771326482;
                    }
                    break;
                case -1984746325:
                case 283266271:
                    C3779.m12264();
                    C0619.m2763();
                    iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 9;
                    i4 = ((iM3169 ^ i2) * (-21931)) ^ 966691481;
                    i5 = 1644349346;
                    break;
                case -1983189711:
                case 530791707:
                    return str2;
                case -1780374112:
                case 1329454038:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("۫᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3841) ^ 494918678;
                        i5 = 1184413729;
                    } else {
                        iM3169 = C0619.m2761("᩸֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8771)) ^ 1788504106;
                        i5 = -565764353;
                    }
                    break;
                case -1599557474:
                case 1229013227:
                    C3998.m12920();
                    if (C0950.f3488 < 0) {
                        iM3169 = C0619.m2761("۫᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3841) ^ 494918678;
                        i5 = 1184413729;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 9;
                        i4 = ((iM3169 ^ i2) * (-21931)) ^ 966691481;
                        i5 = 1644349346;
                    }
                    break;
                case -1591039084:
                case 2027748269:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("᩵ۤ") ^ i3) * (-85);
                        i4 = ((iM3169 ^ i2) * (-4849)) ^ 1129438566;
                        i5 = 307288109;
                    } else {
                        iM3169 = C0773.m3169("᩵۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29735) ^ 952706290;
                        i5 = -1994478906;
                    }
                    break;
                case -1361584626:
                case 1919328413:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩵ܿ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 30607) ^ 724506708;
                        i5 = 727186966;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۢ") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 1625) ^ (-1095393067);
                        i5 = 1190750118;
                    }
                    break;
                case -1263912489:
                case -347097455:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("ۨܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1643) ^ (-2112448309);
                        i5 = 1686020284;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩺") ^ i3) * (-93);
                        i4 = ((iM3169 ^ i2) * (-32191)) ^ 697138905;
                        i5 = 1465349533;
                    }
                    break;
                case -1060849151:
                case 700914343:
                    str2 = "";
                    iM3169 = (C0773.m3169("ᩴۙ") ^ i3) * 55;
                    i4 = ((iM3169 ^ i2) * 23569) ^ 1073553673;
                    i5 = 13524883;
                    break;
                case -801284414:
                case 779443178:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 9;
                        i4 = ((iM3169 ^ i2) * (-21931)) ^ 966691481;
                        i5 = 1644349346;
                    } else {
                        iM3169 = C0619.m2761("ۤۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25949) ^ 1002678644;
                        i5 = 330637268;
                    }
                    break;
                case -536832080:
                case 1714599786:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩵ܿ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 30607) ^ 724506708;
                        i5 = 727186966;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 9;
                        i4 = ((iM3169 ^ i2) * (-21931)) ^ 966691481;
                        i5 = 1644349346;
                    }
                    break;
                case -240075525:
                case 1066155493:
                    str = f19036;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۨܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1643) ^ (-2112448309);
                        i5 = 1686020284;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩴ֨")) * 51;
                        i4 = ((iM3169 ^ i2) * 18257) ^ (-1493707197);
                        i5 = 997099173;
                    }
                    break;
                case -197570672:
                case 865983849:
                    if (str == null) {
                        iM3169 = C0773.m3169("۟ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13815)) ^ (-1366822539);
                        i5 = 1717354151;
                    } else {
                        str2 = str;
                        iM3169 = (C0773.m3169("ᩴۙ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * 23569) ^ 1073553673;
                        i5 = 13524883;
                    }
                    break;
                case 57773503:
                case 280644148:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩵ܿ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 30607) ^ 724506708;
                        i5 = 727186966;
                    } else {
                        iM3169 = C0619.m2761("۬᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22415) ^ 1806698959;
                        i5 = -1997703778;
                    }
                    break;
                case 103570099:
                case 2036636932:
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("᩵ۤ") ^ i3) * (-85);
                        i4 = ((iM3169 ^ i2) * (-4849)) ^ 1129438566;
                        i5 = 307288109;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩵ܿ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 30607) ^ 724506708;
                        i5 = 727186966;
                    }
                    break;
                case 648337023:
                case 2118892477:
                    if (C0619.m2763()) {
                        iM3169 = (i2 - C0773.m3169("᩵ܿ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 30607) ^ 724506708;
                        i5 = 727186966;
                    } else {
                        iM3169 = C0773.m3169("ۗۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18969)) ^ 1624081298;
                        i5 = 517979880;
                    }
                    break;
                case 1911022842:
                case 2011231855:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("۫᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3841) ^ 494918678;
                        i5 = 1184413729;
                    } else {
                        iM3169 = C0619.m2761("ۤۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29467)) ^ 682820326;
                        i5 = -657213260;
                    }
                    break;
                default:
                    C1343.m4943();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m16283(String str) {
        f19036 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m16286() {
        String str = null;
        String str2 = null;
        int i = 2054719868;
        int i2 = C1564.f5401;
        int i3 = C0487.f2131;
        int iM2761 = (C0619.m2761("۠᩶") ^ i3) * 61;
        int i4 = ((iM2761 ^ i2) * 2991) ^ 1457439720;
        int i5 = -1629709681;
        while (true) {
            i = ((((i ^ i2) * (-19133)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1777142033:
                case -790697764:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۖᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 25685) ^ 1613597715;
                        i5 = 997625945;
                    } else {
                        iM2761 = (C0619.m2761("᩹۬") + i3) * 89;
                        i4 = ((iM2761 ^ i2) * (-29215)) ^ (-2101161711);
                        i5 = 1976255891;
                    }
                    break;
                case -1724447006:
                case 1142199548:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25255)) ^ (-522806887);
                        i5 = -1664398886;
                    } else {
                        iM2761 = C0773.m3169("ۜ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 867) ^ 1968554059;
                        i5 = -2124191116;
                    }
                    break;
                case -1638137764:
                case 1085596639:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3601)) ^ (-1402194032);
                        i5 = 441765424;
                    } else {
                        iM2761 = C0773.m3169("᩶ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18491)) ^ (-342613621);
                        i5 = 16417173;
                    }
                    break;
                case -1532337032:
                case 1931063445:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3601)) ^ (-1402194032);
                        i5 = 441765424;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֡ۢ")) * (-33);
                        i4 = ((iM2761 ^ i3) * 16649) ^ 370010680;
                        i5 = 1989664146;
                    }
                    break;
                case -1488259384:
                case -1017433180:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ᩳۨ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-22065)) ^ (-821495746);
                        i5 = -346891916;
                    } else {
                        iM2761 = (C0619.m2761("ۙۙ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * 26473) ^ (-659107618);
                        i5 = -512063971;
                    }
                    break;
                case -1179478806:
                case 1281979961:
                    if (str == null) {
                        iM2761 = C0773.m3169("֨ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15453)) ^ 1491700835;
                        i5 = 1243875027;
                    } else {
                        str2 = str;
                        iM2761 = (C0619.m2761("ܽۛ") + i3) * 55;
                        i4 = ((iM2761 ^ i2) * 26519) ^ (-656628933);
                        i5 = -891721303;
                    }
                    break;
                case -1144818652:
                case 1795453924:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۢܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13779)) ^ 1834244980;
                        i5 = 975429364;
                    } else {
                        iM2761 = (C0619.m2761("ᩳۨ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-22065)) ^ (-821495746);
                        i5 = -346891916;
                    }
                    break;
                case -1017209389:
                case 1287816807:
                    return str2;
                case -729811850:
                case 1623454969:
                    C3077.m10041();
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25255)) ^ (-522806887);
                        i5 = -1664398886;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿۢ")) * 69;
                        i4 = ((iM2761 ^ i2) * (-12791)) ^ 2086186799;
                        i5 = 1482099139;
                    }
                    break;
                case -547750756:
                case 134706354:
                    C4282.m13644();
                    C3448.m11248();
                    iM2761 = (i3 - C0619.m2761("ܿۢ")) * 69;
                    i4 = ((iM2761 ^ i2) * (-12791)) ^ 2086186799;
                    i5 = 1482099139;
                    break;
                case -429943733:
                case 1820767091:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۖᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 25685) ^ 1613597715;
                        i5 = 997625945;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿۢ")) * 69;
                        i4 = ((iM2761 ^ i2) * (-12791)) ^ 2086186799;
                        i5 = 1482099139;
                    }
                    break;
                case -335776879:
                case 394853645:
                    if (C4282.m13644()) {
                        iM2761 = (C0619.m2761("۫۠") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-25831)) ^ (-1691350788);
                        i5 = -1988899392;
                    } else {
                        iM2761 = (C0619.m2761("ᩳۨ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-22065)) ^ (-821495746);
                        i5 = -346891916;
                    }
                    break;
                case 147436377:
                case 303310010:
                    str = f19038;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("ᩳۨ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-22065)) ^ (-821495746);
                        i5 = -346891916;
                    } else {
                        iM2761 = (C0619.m2761("᩶ܺ") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-12385)) ^ (-1982789128);
                        i5 = 1636645770;
                    }
                    break;
                case 379686367:
                case 1532915222:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۖᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 25685) ^ 1613597715;
                        i5 = 997625945;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩸ܺ")) * (-117);
                        i4 = ((iM2761 ^ i3) * (-23395)) ^ 1079013719;
                        i5 = 1104370943;
                    }
                    break;
                case 817058283:
                case 1342077416:
                    str2 = "";
                    iM2761 = (C0619.m2761("ܽۛ") + i3) * 55;
                    i4 = ((iM2761 ^ i2) * 26519) ^ (-656628933);
                    i5 = -891721303;
                    break;
                case 1045137941:
                case 1430594191:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ᩳۨ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-22065)) ^ (-821495746);
                        i5 = -346891916;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿۢ")) * 69;
                        i4 = ((iM2761 ^ i2) * (-12791)) ^ 2086186799;
                        i5 = 1482099139;
                    }
                    break;
                case 1380591840:
                case 2132774193:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3601)) ^ (-1402194032);
                        i5 = 441765424;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ᩵") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 10477) ^ 244360794;
                        i5 = -1800294017;
                    }
                    break;
                default:
                    C0269.m1775();
                    C2834.m9344();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16287(String str) {
        f19038 = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0 A[PHI: r12 r13 r17
      0x00f0: PHI (r12v2 short[]) = (r12v1 short[]), (r12v3 short[]) binds: [B:36:0x00ee, B:32:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:36:0x00ee, B:32:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r17v17 java.lang.String) = (r17v16 java.lang.String), (r17v18 java.lang.String) binds: [B:36:0x00ee, B:32:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0194 A[PHI: r17 r18
      0x0194: PHI (r17v13 java.lang.String) = (r17v12 java.lang.String), (r17v14 java.lang.String) binds: [B:51:0x017d, B:45:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String) binds: [B:51:0x017d, B:45:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (l.C2023.f6737 != false) goto L13;
     */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m16288() {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5448.m16288():java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m16284() {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5448.m16284():void");
    }

    static {
        int iM2761;
        int i;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 429706449;
        int i6 = C23916.f77426;
        int i7 = C1783.f6087;
        int iM2762 = C0619.m2761("ۙ᩷") ^ i6;
        int i8 = ((iM2762 ^ i7) * 9673) ^ 12458249;
        int i9 = -758856845;
        while (true) {
            int i10 = iM2762 ^ i9;
            SimpleDateFormat simpleDateFormat = null;
            while (true) {
                i5 = ((((i5 ^ i7) * (-4917)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2096659842:
                    case 237518738:
                        i2 = s + 5780;
                        if (RunnableC0334.m2063()) {
                            iM2761 = C0773.m3169("۫ۘ") ^ i7;
                            i8 = ((iM2761 ^ i6) * (-3629)) ^ (-147777828);
                            i = 26746690;
                        } else {
                            iM2761 = C0619.m2761("᩹ۧ") ^ i6;
                            i8 = ((iM2761 ^ i7) * (-2523)) ^ 464158440;
                            i = 634984746;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case -1741242338:
                    case 1625045448:
                        short[] sArr2 = f19032;
                        if (C0862.f3233 == 0) {
                            if (C11235.m28309() == 0) {
                                if (C3033.m9845() <= 0) {
                                    iM2762 = (i6 - C0619.m2761("֫ܽ")) * (-31);
                                    i8 = ((iM2762 ^ i7) * 23127) ^ (-962736145);
                                    i9 = -1724030598;
                                    break;
                                } else {
                                    simpleDateFormat = new SimpleDateFormat(C1146.m4222(sArr2, 1, 12, i4));
                                    if (C1080.f3865 < 0) {
                                        iM2761 = C0619.m2761("۫ᩴ") ^ i7;
                                        i8 = ((iM2761 ^ i6) * (-28443)) ^ (-2100091952);
                                        i = 1496367461;
                                        i10 = iM2761 ^ i;
                                        break;
                                    }
                                }
                            }
                            iM2762 = C0773.m3169("ۗۜ") ^ i7;
                            i8 = ((iM2762 ^ i6) * (-14095)) ^ (-768242976);
                            i9 = -1199467673;
                        } else {
                            iM2762 = (i6 - C0619.m2761("ۤܽ")) * (-101);
                            i8 = ((iM2762 ^ i7) * (-7501)) ^ 918611792;
                            i9 = -1761917583;
                        }
                        break;
                    case -1506096023:
                    case 10013991:
                        i4 = 45130;
                        iM2761 = (i6 - C0619.m2761("ܶ۫")) * 127;
                        i8 = ((iM2761 ^ i7) * 11245) ^ (-1455064925);
                        i = -1369251007;
                        i10 = iM2761 ^ i;
                        break;
                    case -816374124:
                    case -345638147:
                        s = sArr[c];
                        if (C0269.f1558 > 0) {
                            iM2761 = C0619.m2761("ܰ֡") ^ i6;
                            i8 = ((iM2761 ^ i7) * (-11179)) ^ (-793873847);
                            i = -1176226407;
                            i10 = iM2761 ^ i;
                        } else {
                            iM2762 = (i6 - C0619.m2761("ۤܽ")) * (-101);
                            i8 = ((iM2762 ^ i7) * (-7501)) ^ 918611792;
                            i9 = -1761917583;
                        }
                        break;
                    case -403023310:
                    case 1269607417:
                        C13473.m33144();
                        if (C1542.f5343 > 0) {
                            iM2762 = (i6 - C0619.m2761("֫ܽ")) * (-31);
                            i8 = ((iM2762 ^ i7) * 23127) ^ (-962736145);
                            i9 = -1724030598;
                        }
                        iM2761 = C0773.m3169("᩺۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-30013)) ^ (-47009314);
                        i = 1567227357;
                        i10 = iM2761 ^ i;
                        break;
                    case -400064933:
                    case 597909276:
                        sArr = f19032;
                        c = 0;
                        if (C20932.f66974 > 0) {
                            iM2761 = C0773.m3169("ܽ᩶") ^ i7;
                            i8 = ((iM2761 ^ i6) * 12313) ^ 1560700536;
                            i = -1588500014;
                            i10 = iM2761 ^ i;
                        } else {
                            iM2762 = (i6 - C0619.m2761("ۤܽ")) * (-101);
                            i8 = ((iM2762 ^ i7) * (-7501)) ^ 918611792;
                            i9 = -1761917583;
                        }
                        break;
                    case -314723089:
                    case 1202874718:
                        C0619.m2763();
                        if (C3033.f9831 < 0) {
                            iM2762 = (i6 - C0619.m2761("ۤܽ")) * (-101);
                            i8 = ((iM2762 ^ i7) * (-7501)) ^ 918611792;
                            i9 = -1761917583;
                        }
                        iM2761 = C0773.m3169("᩺۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-30013)) ^ (-47009314);
                        i = 1567227357;
                        i10 = iM2761 ^ i;
                        break;
                    case -293762618:
                    case 378331341:
                        i4 = 36609;
                        iM2761 = (i6 - C0619.m2761("ܶ۫")) * 127;
                        i8 = ((iM2761 ^ i7) * 11245) ^ (-1455064925);
                        i = -1369251007;
                        i10 = iM2761 ^ i;
                        break;
                    case -223010700:
                    case 580775841:
                        C3998.m12920();
                        if (C3448.m11248() != 0) {
                            iM2762 = (i6 - C0619.m2761("ۤܽ")) * (-101);
                            i8 = ((iM2762 ^ i7) * (-7501)) ^ 918611792;
                            i9 = -1761917583;
                        }
                        iM2761 = C0773.m3169("۫ۘ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-3629)) ^ (-147777828);
                        i = 26746690;
                        i10 = iM2761 ^ i;
                        break;
                    case 33813692:
                    case 523858226:
                        i3 = i2 * i2;
                        s2 = 23120;
                        if (C3492.f12043 <= 0) {
                            iM2761 = C0773.m3169("᩺۟") ^ i7;
                            i8 = ((iM2761 ^ i6) * (-30013)) ^ (-47009314);
                            i = 1567227357;
                        } else {
                            iM2761 = C0773.m3169("ۖۧ") ^ i7;
                            i8 = ((iM2761 ^ i6) * 7925) ^ 2051084967;
                            i = 1315802750;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case 72957273:
                    case 888596635:
                        if (i3 - (s * s2) < 0) {
                            iM2761 = (C0773.m3169("۟᩷") + i6) * 9;
                            i8 = ((iM2761 ^ i7) * (-20363)) ^ 964991334;
                            i = -1271097577;
                        } else {
                            iM2761 = (i7 - C0619.m2761("ܽ֫")) * 25;
                            i8 = ((iM2761 ^ i6) * (-8101)) ^ 2062742785;
                            i = -780507026;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case 156664757:
                    case 1381786142:
                        C2966.m9664();
                        iM2761 = C0773.m3169("᩺۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-30013)) ^ (-47009314);
                        i = 1567227357;
                        i10 = iM2761 ^ i;
                        break;
                    case 319051898:
                    case 431703847:
                        f19031 = simpleDateFormat;
                        if (C2834.f9334 > 0) {
                            if (C0269.f1558 > 0) {
                                f19033 = new StringBuilder(128);
                                return;
                            }
                            iM2762 = C0773.m3169("ۗۜ") ^ i7;
                            i8 = ((iM2762 ^ i6) * (-14095)) ^ (-768242976);
                            i9 = -1199467673;
                        }
                        iM2761 = C0773.m3169("۫ۘ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-3629)) ^ (-147777828);
                        i = 26746690;
                        i10 = iM2761 ^ i;
                        break;
                    default:
                        RunnableC1848.m6360();
                        throw new RuntimeException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16278(String str) {
        short s = f19032[28];
        String strM7749 = C2287.m7749(f19032, 29, 20, (36630 * s) - ((s * s) + 335439225) <= 0 ? 6362 : 49640);
        synchronized (C5448.class) {
            m16279(strM7749, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0848 A[PHI: r0 r2 r3 r7 r25 r26 r28 r31 r38 r39 r40 r41
      0x0848: PHI (r0v54 int) = (r0v47 int), (r0v49 int), (r0v58 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r2v71 java.lang.StringBuilder) = (r2v64 java.lang.StringBuilder), (r2v66 java.lang.StringBuilder), (r2v74 java.lang.StringBuilder) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r3v49 char) = (r3v42 char), (r3v44 char), (r3v52 char) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r7v42 java.lang.String) = (r7v35 java.lang.String), (r7v37 java.lang.String), (r7v46 java.lang.String) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r25v36 int) = (r25v29 int), (r25v31 int), (r25v40 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r26v38 int) = (r26v31 int), (r26v33 int), (r26v41 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r28v39 int) = (r28v31 int), (r28v34 int), (r28v42 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r31v45 short[]) = (r31v38 short[]), (r31v40 short[]), (r31v49 short[]) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r38v36 int) = (r38v29 int), (r38v31 int), (r38v39 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r39v36 java.lang.String) = (r39v29 java.lang.String), (r39v31 java.lang.String), (r39v39 java.lang.String) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r40v36 int) = (r40v29 int), (r40v31 int), (r40v39 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]
      0x0848: PHI (r41v35 int) = (r41v28 int), (r41v30 int), (r41v38 int) binds: [B:135:0x0831, B:127:0x07aa, B:119:0x071e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x01ca  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16281(Throwable th, StringBuilder sb, StackTraceElement[] stackTraceElementArr, String str, String str2, Set set) {
        String str3;
        int i;
        StringBuilder sb2;
        int i2;
        String str4;
        int iM2761;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2762;
        int i7;
        int i8;
        int iM2763;
        int i9;
        int i10;
        char c;
        int iM2764;
        int i11;
        StringBuilder sb3;
        int iM2765;
        int i12;
        int i13;
        StringBuilder sb4;
        int i14;
        int i15;
        int i16;
        short[] sArr;
        short[] sArr2;
        char c2;
        int i17;
        int i18;
        int length;
        String str5;
        int i19;
        int i20;
        StringBuilder sb5;
        int i21;
        short[] sArr3;
        String str6;
        int i22;
        int i23;
        char c3;
        int iM2766;
        int i24;
        int i25;
        StringBuilder sb6;
        int i26;
        char c4;
        int iM3169;
        int i27;
        int i28;
        int i29;
        int iM31610;
        int i30;
        StringBuilder sb7;
        int length2;
        StringBuilder sb8;
        int i31;
        char c5;
        int iM2767;
        int i32;
        int i33;
        StringBuilder sb9 = sb;
        int i34 = 0;
        Throwable thM53430 = null;
        Throwable th2 = null;
        String strM34972 = null;
        short s = 0;
        int i35 = 0;
        int i36 = -769880247;
        int i37 = C2354.f7599;
        int i38 = C2288.f7433;
        int iM31611 = (i38 - C0773.m3169("ᩴۡ")) * 93;
        int i39 = ((iM31611 ^ i37) * 4877) ^ 1823586675;
        int i40 = iM31611 ^ 152763354;
        Throwable[] thArr = null;
        String strM5510 = null;
        String str7 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int length3 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        char c6 = 0;
        int iM10045 = 0;
        StackTraceElement[] stackTraceElementArr2 = null;
        while (true) {
            i36 = i40 ^ (i39 & (((i36 ^ i37) * 18457) >> 31));
            switch (i36) {
                case -2093899746:
                case -579807229:
                    sb6 = sb9;
                    i26 = iM10045;
                    c4 = c6;
                    C3779.m12258(sb6, str2);
                    C1783.m6234(sb6, str);
                    C1146.m4235(sb6, th);
                    C1080.m4046(sb6, c4);
                    i42 = 0;
                    int iM31612 = C0773.m3169("۫ᩳ") ^ i38;
                    i39 = ((iM31612 ^ i37) * 16109) ^ 16297666;
                    i40 = iM31612 ^ 225649336;
                    c6 = c4;
                    str7 = str7;
                    i52 = i52;
                    i51 = i51;
                    strM5510 = strM5510;
                    i49 = i49;
                    sb9 = sb6;
                    i50 = i50;
                    sArr5 = sArr5;
                    iM10045 = i26;
                    i41 = i41;
                    break;
                case -2058856421:
                case 137930314:
                    if (C3099.f10023 > 0) {
                        str7 = str7;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        c6 = c6;
                        iM10045 = iM10045;
                        sArr5 = sArr5;
                        int i53 = i52;
                        i49 = i49;
                        i5 = i53;
                        int i54 = i51;
                        i50 = i50;
                        i6 = i54;
                        iM2762 = C0773.m3169("᩻֨") ^ i37;
                        i7 = ((iM2762 ^ i38) * 24133) ^ 1677779549;
                        i8 = 1114984287;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i55 = i49;
                        i52 = i5;
                        i49 = i55;
                        int i56 = i50;
                        i51 = i6;
                        i50 = i56;
                    }
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i57 = i52;
                    i49 = i49;
                    i5 = i57;
                    int i58 = i51;
                    i50 = i50;
                    i6 = i58;
                    iM2762 = C0773.m3169("֨۫") ^ i38;
                    i7 = ((iM2762 ^ i37) * 28955) ^ (-583413238);
                    i8 = -1551360459;
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i59 = i49;
                    i52 = i5;
                    i49 = i59;
                    int i510 = i50;
                    i51 = i6;
                    i50 = i510;
                    break;
                case -1956326627:
                case 1149064866:
                    i2 = iM10045;
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    m16281(thM53430, sb, stackTraceElementArr2, C1826.m6310(f19032, 168, 11, i43), str2, set);
                    iM2765 = (i37 - C0619.m2761("ܶᩴ")) * 3;
                    i12 = ((iM2765 ^ i38) * (-23995)) ^ (-818501820);
                    i13 = 48809698;
                    i40 = iM2765 ^ i13;
                    i39 = i12;
                    str7 = str4;
                    iM10045 = i2;
                    strM5510 = str3;
                    i41 = i41;
                    i42 = i;
                    sb9 = sb;
                    break;
                case -1871443755:
                case -1519986561:
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    i2 = iM10045;
                    if (C2375.m8073(AbstractC3624.m11769(f19032, 150, 18, i43), C4282.m13656(str4, i45)) == -1) {
                        iM2765 = (i37 - C0773.m3169("֡ۚ")) * (-19);
                        i12 = ((iM2765 ^ i38) * (-24609)) ^ 172112975;
                        i13 = -189454900;
                        i40 = iM2765 ^ i13;
                        i39 = i12;
                        str7 = str4;
                        iM10045 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb;
                    } else {
                        sb8 = sb;
                        c5 = c6;
                        i31 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        int iM2768 = C0619.m2761("᩵ۨ") ^ i38;
                        short[] sArr7 = sArr5;
                        int i60 = ((iM2768 ^ i37) * (-28451)) ^ (-1161758886);
                        i40 = iM2768 ^ (-1409949579);
                        c6 = c5;
                        str7 = str4;
                        sb9 = sb8;
                        int i61 = i31;
                        i39 = i60;
                        sArr5 = sArr7;
                        iM10045 = i61;
                    }
                    break;
                case -1869088113:
                case 339558994:
                    str5 = strM5510;
                    i19 = i41;
                    i20 = i42;
                    sb5 = sb9;
                    i18 = i51;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    int length4 = (stackTraceElementArr2.length - i48) - i22;
                    if (th instanceof JSONException) {
                        i17 = length4;
                        iM2766 = C0773.m3169("᩺ۙ") ^ i38;
                        i24 = ((iM2766 ^ i37) * 30039) ^ (-1169539693);
                        i25 = 74892952;
                        i40 = iM2766 ^ i25;
                        c6 = c3;
                        i39 = i24;
                    } else {
                        int iM31613 = C0773.m3169("ܿ۠") ^ i38;
                        i17 = length4;
                        i39 = ((iM31613 ^ i37) * (-27907)) ^ 485966774;
                        i40 = iM31613 ^ 1836588212;
                        c6 = c3;
                    }
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i62 = i17;
                    i51 = i18;
                    i50 = i62;
                    break;
                case -1866765237:
                case -1072474201:
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    i2 = iM10045;
                    strM34972 = C14483.m34972(str2, C2966.m9670(sArr5, i46, i47, i43));
                    sArr6 = f19032;
                    if (C20932.f66974 > 0) {
                        iM2765 = C0619.m2761("᩺᩹") ^ i37;
                        i12 = ((iM2765 ^ i38) * 31267) ^ (-1493052192);
                        i13 = -863961553;
                        i40 = iM2765 ^ i13;
                        i39 = i12;
                        str7 = str4;
                        iM10045 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb;
                    } else {
                        sb2 = sb;
                        c = c6;
                        int i63 = i52;
                        i49 = i49;
                        i5 = i63;
                        int i64 = i51;
                        i50 = i50;
                        i6 = i64;
                        iM2764 = C0619.m2761("ۚ᩻") ^ i38;
                        i39 = ((iM2764 ^ i37) * 30437) ^ (-1262600529);
                        i11 = 609485092;
                        i40 = iM2764 ^ i11;
                        c6 = c;
                        str7 = str4;
                        sArr5 = sArr5;
                        iM10045 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb2;
                        int i511 = i49;
                        i52 = i5;
                        i49 = i511;
                        int i512 = i50;
                        i51 = i6;
                        i50 = i512;
                    }
                    break;
                case -1838535353:
                case -1275729836:
                    break;
                case -1809365009:
                case 557484887:
                    String str8 = str7;
                    String str9 = strM5510;
                    int i65 = iM10045;
                    if (i44 < i41) {
                        iM2767 = (C0619.m2761("ܰ֨") ^ i37) * 109;
                        i32 = ((iM2767 ^ i38) * 26103) ^ (-677466179);
                        i33 = 952788970;
                    } else {
                        iM2767 = C0619.m2761("ۙ֨") ^ i37;
                        i32 = ((iM2767 ^ i38) * 30377) ^ 1698309516;
                        i33 = 861836836;
                    }
                    i40 = iM2767 ^ i33;
                    iM10045 = i65;
                    i39 = i32;
                    str7 = str8;
                    strM5510 = str9;
                    sb9 = sb;
                    break;
                case -1789348749:
                case -1151260475:
                    str5 = strM5510;
                    i19 = i41;
                    i20 = i42;
                    sb5 = sb9;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    int i66 = i51;
                    i17 = i50;
                    i18 = i66;
                    if (i22 >= 0) {
                        iM2766 = C0619.m2761("ܺ᩷") ^ i37;
                        i24 = ((iM2766 ^ i38) * (-2135)) ^ 1669370047;
                        i25 = -352421120;
                    } else {
                        iM2766 = (C0619.m2761("ۘ۫") ^ i38) * 41;
                        i24 = ((iM2766 ^ i37) * (-24549)) ^ (-1877627705);
                        i25 = 803050225;
                    }
                    i40 = iM2766 ^ i25;
                    c6 = c3;
                    i39 = i24;
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i67 = i17;
                    i51 = i18;
                    i50 = i67;
                    break;
                case -1703946302:
                case 254467176:
                    str5 = strM5510;
                    i19 = i41;
                    i20 = i42;
                    sb5 = sb9;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    int i68 = i51;
                    i17 = i50;
                    i18 = i68;
                    if (th instanceof C4866) {
                        iM2766 = C0773.m3169("᩺ۙ") ^ i38;
                        i24 = ((iM2766 ^ i37) * 30039) ^ (-1169539693);
                        i25 = 74892952;
                    } else {
                        i34 = i48;
                        iM2766 = C0619.m2761("ᩴۨ") ^ i37;
                        i24 = ((iM2766 ^ i38) * (-26323)) ^ (-1925388520);
                        i25 = 324178810;
                    }
                    i40 = iM2766 ^ i25;
                    c6 = c3;
                    i39 = i24;
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i69 = i17;
                    i51 = i18;
                    i50 = i69;
                    break;
                case -1627429630:
                case -1034196627:
                    str5 = strM5510;
                    i19 = i41;
                    sb5 = sb9;
                    int i70 = i50;
                    i18 = i51;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    i17 = i70;
                    i20 = i42;
                    if (C2419.m8175(stackTraceElementArr2[i22], stackTraceElementArr[length3])) {
                        iM2766 = C0773.m3169("۠ۨ") ^ i38;
                        i24 = ((iM2766 ^ i37) * 10201) ^ 1994357173;
                        i25 = 274803340;
                    } else {
                        iM2766 = (C0619.m2761("ۘ۫") ^ i38) * 41;
                        i24 = ((iM2766 ^ i37) * (-24549)) ^ (-1877627705);
                        i25 = 803050225;
                    }
                    i40 = iM2766 ^ i25;
                    c6 = c3;
                    i39 = i24;
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i610 = i17;
                    i51 = i18;
                    i50 = i610;
                    break;
                case -1621553267:
                case 1669207767:
                    String className = stackTraceElementArr2[i42].getClassName();
                    str7 = className;
                    iM10045 = C3077.m10045(className);
                    i45 = 0;
                    int iM31614 = (C0773.m3169("۠᩷") + i38) * 95;
                    i40 = iM31614 ^ (-544936075);
                    sb9 = sb;
                    i39 = ((iM31614 ^ i37) * (-22165)) ^ (-933929333);
                    strM5510 = strM5510;
                    break;
                case -1581175407:
                case 2003035933:
                    C1519.m5403();
                    RunnableC3646.m11813();
                    iM2761 = (C0619.m2761("ᩴۙ") ^ i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i3 = ((iM2761 ^ i37) * 28685) ^ (-1564657211);
                    i4 = -1527147872;
                    i40 = iM2761 ^ i4;
                    i39 = i3;
                    break;
                case -1556199845:
                case -1484082523:
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    i2 = iM10045;
                    thM53430 = C23916.m53430(th);
                    if (thM53430 != null) {
                        iM2765 = C0619.m2761("ۨۗ") ^ i38;
                        i12 = ((iM2765 ^ i37) * 4527) ^ 1040073345;
                        i13 = -382326609;
                    } else {
                        iM2765 = (i37 - C0619.m2761("ܶᩴ")) * 3;
                        i12 = ((iM2765 ^ i38) * (-23995)) ^ (-818501820);
                        i13 = 48809698;
                    }
                    i40 = iM2765 ^ i13;
                    i39 = i12;
                    str7 = str4;
                    iM10045 = i2;
                    strM5510 = str3;
                    i41 = i41;
                    i42 = i;
                    sb9 = sb;
                    break;
                case -1554945031:
                case 1474905030:
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    int i71 = iM10045;
                    if (i45 >= i71) {
                        sb4 = sb;
                        sArr = sArr5;
                        i2 = i71;
                        i14 = i50;
                        i29 = i51;
                        i16 = i52;
                        c2 = c6;
                        i42 = i;
                        iM31610 = C0773.m3169("ۗۖ") ^ i38;
                        i39 = ((iM31610 ^ i37) * 5997) ^ (-953436986);
                        i30 = 1218594749;
                        i40 = iM31610 ^ i30;
                        c6 = c2;
                        i52 = i16;
                        str7 = str4;
                        i51 = i29;
                        sArr5 = sArr;
                        iM10045 = i2;
                        strM5510 = str3;
                        sb9 = sb4;
                        i50 = i14;
                        i41 = i41;
                    } else {
                        int iM2769 = C0619.m2761("᩺֡") ^ i38;
                        i40 = iM2769 ^ (-952646331);
                        iM10045 = i71;
                        i39 = ((iM2769 ^ i37) * 1947) ^ (-832899004);
                        str7 = str4;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb;
                    }
                    break;
                case -1415189382:
                case 689124583:
                    int i72 = i51;
                    i17 = i50;
                    i18 = i72;
                    AbstractC0116.m1230(set, th);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    length = stackTrace.length - 1;
                    stackTraceElementArr2 = stackTrace;
                    i48 = 1;
                    length3 = stackTraceElementArr.length - 1;
                    int iM31615 = (i37 - C0773.m3169("ۛۗ")) * (-15);
                    i40 = iM31615 ^ 822960689;
                    i39 = ((iM31615 ^ i38) * (-13401)) ^ (-1170468727);
                    c6 = c6;
                    str7 = str7;
                    i52 = i52;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    sb9 = sb;
                    i49 = length;
                    i42 = i42;
                    int i611 = i17;
                    i51 = i18;
                    i50 = i611;
                    break;
                case -1390323319:
                case -1362499995:
                    i5 = i52;
                    i6 = i51;
                    i43 = 52023;
                    iM2762 = (C0773.m3169("ۜۚ") + i37) * (-21);
                    i7 = ((iM2762 ^ i38) * (-23633)) ^ 1815059006;
                    i8 = 1540575720;
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i513 = i49;
                    i52 = i5;
                    i49 = i513;
                    int i514 = i50;
                    i51 = i6;
                    i50 = i514;
                    break;
                case -1363653648:
                case 1865894211:
                    if (C3033.m9845() > 0) {
                        str7 = str7;
                        strM5510 = strM5510;
                        c6 = c6;
                        iM10045 = iM10045;
                        sArr5 = sArr5;
                        int i73 = i52;
                        i49 = i49;
                        i5 = i73;
                        int i74 = i51;
                        i50 = i50;
                        i6 = i74;
                        iM2762 = C0773.m3169("۠᩹") ^ i37;
                        i7 = ((iM2762 ^ i38) * (-26897)) ^ (-1238714114);
                        i8 = -373593232;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i515 = i49;
                        i52 = i5;
                        i49 = i515;
                        int i516 = i50;
                        i51 = i6;
                        i50 = i516;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۙ") ^ i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2761 ^ i37) * 28685) ^ (-1564657211);
                        i4 = -1527147872;
                        i40 = iM2761 ^ i4;
                        i39 = i3;
                    }
                    break;
                case -1305364766:
                case -1134978521:
                    i45++;
                    int iM31616 = (C0773.m3169("۠᩷") + i38) * 95;
                    i40 = iM31616 ^ (-544936075);
                    sb9 = sb;
                    i39 = ((iM31616 ^ i37) * (-22165)) ^ (-933929333);
                    strM5510 = strM5510;
                    break;
                case -1289815736:
                case 223821973:
                    C2702.m8876();
                    break;
                case -1274223690:
                case 1477172821:
                    str3 = strM5510;
                    i41 = i41;
                    sb4 = sb9;
                    i14 = i50;
                    i29 = i51;
                    i16 = i52;
                    i2 = iM10045;
                    sArr = sArr5;
                    str4 = str7;
                    c2 = c6;
                    if (i34 != 0) {
                        iM31610 = C0619.m2761("᩺֫") ^ i38;
                        i39 = ((iM31610 ^ i37) * (-24245)) ^ 1099454030;
                        i30 = 19860475;
                    } else {
                        iM31610 = C0773.m3169("ۗۖ") ^ i38;
                        i39 = ((iM31610 ^ i37) * 5997) ^ (-953436986);
                        i30 = 1218594749;
                    }
                    i40 = iM31610 ^ i30;
                    c6 = c2;
                    i52 = i16;
                    str7 = str4;
                    i51 = i29;
                    sArr5 = sArr;
                    iM10045 = i2;
                    strM5510 = str3;
                    sb9 = sb4;
                    i50 = i14;
                    i41 = i41;
                    break;
                case -1232258762:
                case 1748992907:
                    sb7 = sb9;
                    Throwable[] suppressed = th.getSuppressed();
                    length2 = suppressed.length;
                    i44 = 0;
                    thArr = suppressed;
                    int iM31617 = C0773.m3169("ۤۡ") ^ i37;
                    int i75 = length2;
                    i39 = ((iM31617 ^ i38) * 27847) ^ 1994467944;
                    i40 = iM31617 ^ 71799298;
                    c6 = c6;
                    i52 = i52;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    sb9 = sb7;
                    i50 = i50;
                    i41 = i75;
                    i51 = i51;
                    break;
                case -1128086176:
                case 610585589:
                    StringBuilder sb10 = sb9;
                    C1783.m6234(sb10, AbstractC0641.m2820(f19032, 122, 1, i43));
                    C1080.m4046(sb10, c6);
                    break;
                case -1078911126:
                case -906703687:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i76 = i52;
                    i49 = i49;
                    i5 = i76;
                    int i77 = i51;
                    i50 = i50;
                    i6 = i77;
                    if (C1343.f4799 != 0) {
                        iM2762 = C0773.m3169("֨۫") ^ i38;
                        i7 = ((iM2762 ^ i37) * 28955) ^ (-583413238);
                        i8 = -1551360459;
                    } else {
                        iM2762 = (i38 - C0619.m2761("ܰۢ")) * (-89);
                        i7 = ((iM2762 ^ i37) * (-26489)) ^ (-1641511102);
                        i8 = -1260846385;
                    }
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i517 = i49;
                    i52 = i5;
                    i49 = i517;
                    int i518 = i50;
                    i51 = i6;
                    i50 = i518;
                    break;
                case -1042641109:
                case -61892133:
                    if (C0619.m2763()) {
                        iM2761 = (i37 - C0773.m3169("ܰۜ")) * (-65);
                        i3 = ((iM2761 ^ i38) * 11163) ^ 156660951;
                        i4 = 548668417;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۙ") ^ i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2761 ^ i37) * 28685) ^ (-1564657211);
                        i4 = -1527147872;
                    }
                    i40 = iM2761 ^ i4;
                    i39 = i3;
                    break;
                case -1031737973:
                case 1866693783:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i78 = i52;
                    i49 = i49;
                    i5 = i78;
                    int i79 = i51;
                    i50 = i50;
                    i6 = i79;
                    s = f19032[100];
                    if (C0862.f3233 != 0) {
                        iM2762 = (C0773.m3169("ܶ᩷") + i37) * (-7);
                        i7 = ((iM2762 ^ i38) * (-30767)) ^ 174581579;
                        i8 = 1870598257;
                    } else {
                        iM2762 = C0773.m3169("ۜۤ") ^ i37;
                        i7 = ((iM2762 ^ i38) * (-12989)) ^ 95753456;
                        i8 = 761468624;
                    }
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i519 = i49;
                    i52 = i5;
                    i49 = i519;
                    int i5110 = i50;
                    i51 = i6;
                    i50 = i5110;
                    break;
                case -911934405:
                case -374682681:
                    i42++;
                    sb6 = sb;
                    i26 = iM10045;
                    c4 = c6;
                    int iM31618 = C0773.m3169("۫ᩳ") ^ i38;
                    i39 = ((iM31618 ^ i37) * 16109) ^ 16297666;
                    i40 = iM31618 ^ 225649336;
                    c6 = c4;
                    str7 = str7;
                    i52 = i52;
                    i51 = i51;
                    strM5510 = strM5510;
                    i49 = i49;
                    sb9 = sb6;
                    i50 = i50;
                    sArr5 = sArr5;
                    iM10045 = i26;
                    i41 = i41;
                    break;
                case -770278334:
                case -88118433:
                    C4282.m13644();
                    if (RunnableC3055.f9898 >= 0) {
                        str3 = strM5510;
                        i41 = i41;
                        i = i42;
                        sb2 = sb9;
                        i2 = iM10045;
                        str4 = str7;
                        c = c6;
                        int i612 = i52;
                        i49 = i49;
                        i5 = i612;
                        int i613 = i51;
                        i50 = i50;
                        i6 = i613;
                        iM2764 = C0619.m2761("ۚ᩻") ^ i38;
                        i39 = ((iM2764 ^ i37) * 30437) ^ (-1262600529);
                        i11 = 609485092;
                        i40 = iM2764 ^ i11;
                        c6 = c;
                        str7 = str4;
                        sArr5 = sArr5;
                        iM10045 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb2;
                        int i5111 = i49;
                        i52 = i5;
                        i49 = i5111;
                        int i5112 = i50;
                        i51 = i6;
                        i50 = i5112;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۙ") ^ i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2761 ^ i37) * 28685) ^ (-1564657211);
                        i4 = -1527147872;
                        i40 = iM2761 ^ i4;
                        i39 = i3;
                    }
                    break;
                case -693862165:
                case 2044431737:
                    AbstractC0116.m1243();
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ۨۨ") + i38) * 11;
                        i3 = ((iM2761 ^ i37) * (-20717)) ^ (-1026800276);
                        i4 = -1126598684;
                        i40 = iM2761 ^ i4;
                        i39 = i3;
                    } else {
                        str7 = str7;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        c6 = c6;
                        iM10045 = iM10045;
                        sArr5 = sArr5;
                        int i520 = i52;
                        i49 = i49;
                        i5 = i520;
                        int i521 = i51;
                        i50 = i50;
                        i6 = i521;
                        iM2762 = C0773.m3169("֨۫") ^ i38;
                        i7 = ((iM2762 ^ i37) * 28955) ^ (-583413238);
                        i8 = -1551360459;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i5113 = i49;
                        i52 = i5;
                        i49 = i5113;
                        int i5114 = i50;
                        i51 = i6;
                        i50 = i5114;
                    }
                    break;
                case -690056533:
                case 1254085312:
                    str3 = strM5510;
                    i41 = i41;
                    sb4 = sb9;
                    i15 = i51;
                    i16 = i52;
                    i2 = iM10045;
                    sArr = sArr5;
                    str4 = str7;
                    sArr2 = sArr4;
                    c2 = c6;
                    C1783.m6234(sb4, C0269.m1785(sArr2, i15, i16, i43));
                    i14 = i50;
                    C1783.m6237(sb4, i14);
                    if (C1542.f5343 > 0) {
                        sArr4 = sArr2;
                        iM31610 = C0773.m3169("ۖ۠") ^ i37;
                        i29 = i15;
                        i39 = ((iM31610 ^ i38) * 12865) ^ 1144132004;
                        i30 = 2081705492;
                        i40 = iM31610 ^ i30;
                        c6 = c2;
                        i52 = i16;
                        str7 = str4;
                        i51 = i29;
                        sArr5 = sArr;
                        iM10045 = i2;
                        strM5510 = str3;
                        sb9 = sb4;
                        i50 = i14;
                        i41 = i41;
                    } else {
                        int iM27610 = C0619.m2761("֨᩺") ^ i37;
                        sArr4 = sArr2;
                        int i80 = ((iM27610 ^ i38) * 29653) ^ (-1090021760);
                        i40 = iM27610 ^ (-1136727984);
                        i51 = i15;
                        c6 = c2;
                        i52 = i16;
                        i50 = i14;
                        str7 = str4;
                        strM5510 = str3;
                        i41 = i41;
                        i39 = i80;
                        sb9 = sb4;
                        sArr5 = sArr;
                        iM10045 = i2;
                    }
                    break;
                case -622862547:
                case -327901874:
                    sb4 = sb9;
                    i2 = iM10045;
                    sArr = sArr5;
                    str4 = str7;
                    c2 = c6;
                    str3 = strM5510;
                    C1783.m6234(sb4, C4238.m13530(f19032, 128, 5, i43));
                    C1080.m4046(sb4, c2);
                    i41 = i41;
                    i14 = i50;
                    i29 = i51;
                    i16 = i52;
                    iM31610 = (i38 - C0619.m2761("᩸֡")) * (-85);
                    i39 = ((iM31610 ^ i37) * 23221) ^ (-288235103);
                    i30 = 871677495;
                    i40 = iM31610 ^ i30;
                    c6 = c2;
                    i52 = i16;
                    str7 = str4;
                    i51 = i29;
                    sArr5 = sArr;
                    iM10045 = i2;
                    strM5510 = str3;
                    sb9 = sb4;
                    i50 = i14;
                    i41 = i41;
                    break;
                case -448936562:
                case 1864496397:
                    strM5510 = strM5510;
                    i41 = i41;
                    sb6 = sb9;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i26 = iM10045;
                    sArr5 = sArr5;
                    str7 = str7;
                    i49 = i49;
                    char c7 = c6;
                    if (i42 <= i49) {
                        iM3169 = C0773.m3169("ۧۨ") ^ i37;
                        i27 = ((iM3169 ^ i38) * (-23451)) ^ (-753498433);
                        i28 = 611071687;
                    } else {
                        iM3169 = C0773.m3169("ۨ۫") ^ i37;
                        i27 = ((iM3169 ^ i38) * (-30933)) ^ (-868606851);
                        i28 = -1771043610;
                    }
                    i40 = iM3169 ^ i28;
                    c6 = c7;
                    i39 = i27;
                    str7 = str7;
                    i52 = i52;
                    i51 = i51;
                    strM5510 = strM5510;
                    i49 = i49;
                    sb9 = sb6;
                    i50 = i50;
                    sArr5 = sArr5;
                    iM10045 = i26;
                    i41 = i41;
                    break;
                case -427248267:
                case 255840309:
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    sb2 = sb9;
                    i2 = iM10045;
                    sArr5 = sArr5;
                    str4 = str7;
                    int i81 = i49;
                    i5 = i52;
                    c = c6;
                    int i82 = i51;
                    i50 = i50;
                    i6 = i82;
                    i49 = i81;
                    C3779.m12258(sb2, C1783.m6233(f19032, 101, 21, i43));
                    C1146.m4235(sb2, th);
                    if (C3734.f12817 >= 0) {
                        iM2764 = C0619.m2761("ۚ᩻") ^ i38;
                        i39 = ((iM2764 ^ i37) * 30437) ^ (-1262600529);
                        i11 = 609485092;
                    } else {
                        iM2764 = (C0619.m2761("᩷ۧ") ^ i37) * 63;
                        i39 = ((iM2764 ^ i38) * (-14005)) ^ 1201743338;
                        i11 = 883669024;
                    }
                    i40 = iM2764 ^ i11;
                    c6 = c;
                    str7 = str4;
                    sArr5 = sArr5;
                    iM10045 = i2;
                    strM5510 = str3;
                    i41 = i41;
                    i42 = i;
                    sb9 = sb2;
                    int i5115 = i49;
                    i52 = i5;
                    i49 = i5115;
                    int i5116 = i50;
                    i51 = i6;
                    i50 = i5116;
                    break;
                case -244021415:
                case 744368146:
                    if (C2310.f7472 >= 0) {
                        str7 = str7;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        c6 = c6;
                        iM10045 = iM10045;
                        sArr5 = sArr5;
                        int i522 = i52;
                        i49 = i49;
                        i5 = i522;
                        int i523 = i51;
                        i50 = i50;
                        i6 = i523;
                        iM2762 = C0773.m3169("֨۫") ^ i38;
                        i7 = ((iM2762 ^ i37) * 28955) ^ (-583413238);
                        i8 = -1551360459;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i5117 = i49;
                        i52 = i5;
                        i49 = i5117;
                        int i5118 = i50;
                        i51 = i6;
                        i50 = i5118;
                    } else {
                        iM2761 = (i37 - C0773.m3169("ܰۜ")) * (-65);
                        i3 = ((iM2761 ^ i38) * 11163) ^ 156660951;
                        i4 = 548668417;
                        i40 = iM2761 ^ i4;
                        i39 = i3;
                    }
                    break;
                case -144634020:
                case 1099901986:
                    str4 = str7;
                    str3 = strM5510;
                    i41 = i41;
                    i = i42;
                    i2 = iM10045;
                    th2 = thArr[i44];
                    sArr5 = f19032;
                    i46 = 137;
                    i47 = 1;
                    if (C0950.f3488 < 0) {
                        iM2765 = (C0619.m2761("֫ܳ") ^ i38) * 85;
                        i12 = ((iM2765 ^ i37) * 24381) ^ (-789740471);
                        i13 = 1702442686;
                        i40 = iM2765 ^ i13;
                        i39 = i12;
                        str7 = str4;
                        iM10045 = i2;
                        strM5510 = str3;
                        i41 = i41;
                        i42 = i;
                        sb9 = sb;
                    } else {
                        sb4 = sb;
                        sArr = sArr5;
                        i14 = i50;
                        sArr2 = sArr4;
                        i15 = i51;
                        i16 = i52;
                        c2 = c6;
                        i42 = i;
                        int iM27611 = C0619.m2761("֨᩺") ^ i37;
                        sArr4 = sArr2;
                        int i83 = ((iM27611 ^ i38) * 29653) ^ (-1090021760);
                        i40 = iM27611 ^ (-1136727984);
                        i51 = i15;
                        c6 = c2;
                        i52 = i16;
                        i50 = i14;
                        str7 = str4;
                        strM5510 = str3;
                        i41 = i41;
                        i39 = i83;
                        sb9 = sb4;
                        sArr5 = sArr;
                        iM10045 = i2;
                    }
                    break;
                case -113059477:
                case 1174849688:
                    C0773.m3161();
                    if (!RunnableC1848.f6235) {
                        str7 = str7;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        c6 = c6;
                        iM10045 = iM10045;
                        sArr5 = sArr5;
                        int i524 = i52;
                        i49 = i49;
                        i5 = i524;
                        int i525 = i51;
                        i50 = i50;
                        i6 = i525;
                        iM2762 = C0773.m3169("֨۫") ^ i38;
                        i7 = ((iM2762 ^ i37) * 28955) ^ (-583413238);
                        i8 = -1551360459;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i5119 = i49;
                        i52 = i5;
                        i49 = i5119;
                        int i51110 = i50;
                        i51 = i6;
                        i50 = i51110;
                    } else {
                        str3 = strM5510;
                        i41 = i41;
                        sb4 = sb9;
                        i14 = i50;
                        i15 = i51;
                        i16 = i52;
                        i2 = iM10045;
                        sArr = sArr5;
                        str4 = str7;
                        sArr2 = sArr4;
                        c2 = c6;
                        int iM27612 = C0619.m2761("֨᩺") ^ i37;
                        sArr4 = sArr2;
                        int i84 = ((iM27612 ^ i38) * 29653) ^ (-1090021760);
                        i40 = iM27612 ^ (-1136727984);
                        i51 = i15;
                        c6 = c2;
                        i52 = i16;
                        i50 = i14;
                        str7 = str4;
                        strM5510 = str3;
                        i41 = i41;
                        i39 = i84;
                        sb9 = sb4;
                        sArr5 = sArr;
                        iM10045 = i2;
                    }
                    break;
                case -90226521:
                case 1646786424:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۨ᩵") ^ i38;
                        i3 = ((iM2761 ^ i37) * 29163) ^ 155403891;
                        i4 = 224763539;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۙ") ^ i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2761 ^ i37) * 28685) ^ (-1564657211);
                        i4 = -1527147872;
                    }
                    i40 = iM2761 ^ i4;
                    i39 = i3;
                    break;
                case 50995298:
                case 2057210093:
                    str5 = strM5510;
                    i19 = i41;
                    i20 = i42;
                    sb5 = sb9;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    int i85 = i51;
                    i17 = i50;
                    i18 = i85;
                    if (length3 >= 0) {
                        iM2766 = C0619.m2761("ۗ۬") ^ i37;
                        i24 = ((iM2766 ^ i38) * 25533) ^ (-659818185);
                        i25 = 245347943;
                    } else {
                        iM2766 = (C0619.m2761("ۘ۫") ^ i38) * 41;
                        i24 = ((iM2766 ^ i37) * (-24549)) ^ (-1877627705);
                        i25 = 803050225;
                    }
                    i40 = iM2766 ^ i25;
                    c6 = c3;
                    i39 = i24;
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i614 = i17;
                    i51 = i18;
                    i50 = i614;
                    break;
                case 101765237:
                case 1400396178:
                    str3 = strM5510;
                    i41 = i41;
                    sb4 = sb9;
                    i14 = i50;
                    i29 = i51;
                    i16 = i52;
                    i2 = iM10045;
                    sArr = sArr5;
                    str4 = str7;
                    c2 = c6;
                    if (i14 != 0) {
                        iM31610 = (C0773.m3169("ۧ֫") ^ i37) * 55;
                        i39 = ((iM31610 ^ i38) * 10557) ^ (-1250971910);
                        i30 = 1408811623;
                    } else {
                        iM31610 = (i38 - C0619.m2761("᩸֡")) * (-85);
                        i39 = ((iM31610 ^ i37) * 23221) ^ (-288235103);
                        i30 = 871677495;
                    }
                    i40 = iM31610 ^ i30;
                    c6 = c2;
                    i52 = i16;
                    str7 = str4;
                    i51 = i29;
                    sArr5 = sArr;
                    iM10045 = i2;
                    strM5510 = str3;
                    sb9 = sb4;
                    i50 = i14;
                    i41 = i41;
                    break;
                case 258788444:
                case 1463151435:
                    strM5510 = strM5510;
                    i41 = i41;
                    sb3 = sb9;
                    int i86 = i50;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    str7 = str7;
                    c6 = c6;
                    C1783.m6234(sb3, str2);
                    sArr4 = f19032;
                    i51 = 123;
                    i52 = 5;
                    if (AbstractC0116.f1064 > 0) {
                        int iM31619 = C0773.m3169("ܿۡ") ^ i38;
                        i39 = ((iM31619 ^ i37) * (-9543)) ^ (-525303684);
                        i40 = iM31619 ^ (-1265872268);
                        c6 = c6;
                        i50 = i86;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        sb9 = sb3;
                    } else {
                        i50 = i86;
                        i42 = i42;
                        i49 = i49;
                        i5 = 5;
                        i6 = 123;
                        iM2762 = (C0773.m3169("ܶ᩷") + i37) * (-7);
                        i7 = ((iM2762 ^ i38) * (-30767)) ^ 174581579;
                        i8 = 1870598257;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i51111 = i49;
                        i52 = i5;
                        i49 = i51111;
                        int i51112 = i50;
                        i51 = i6;
                        i50 = i51112;
                    }
                    break;
                case 348611473:
                case 1915998681:
                    int i87 = i50;
                    i18 = i51;
                    length3--;
                    i17 = i87;
                    length = i49 - 1;
                    int iM316110 = (i37 - C0773.m3169("ۛۗ")) * (-15);
                    i40 = iM316110 ^ 822960689;
                    i39 = ((iM316110 ^ i38) * (-13401)) ^ (-1170468727);
                    c6 = c6;
                    str7 = str7;
                    i52 = i52;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    sb9 = sb;
                    i49 = length;
                    i42 = i42;
                    int i615 = i17;
                    i51 = i18;
                    i50 = i615;
                    break;
                case 440575257:
                case 2113146618:
                    sb8 = sb9;
                    i31 = iM10045;
                    str4 = str7;
                    C3779.m12258(sb8, strM5510);
                    C1146.m4235(sb8, stackTraceElementArr2[i42]);
                    c5 = c6;
                    C1080.m4046(sb8, c5);
                    int iM27613 = C0619.m2761("᩵ۨ") ^ i38;
                    short[] sArr8 = sArr5;
                    int i616 = ((iM27613 ^ i37) * (-28451)) ^ (-1161758886);
                    i40 = iM27613 ^ (-1409949579);
                    c6 = c5;
                    str7 = str4;
                    sb9 = sb8;
                    int i617 = i31;
                    i39 = i616;
                    sArr5 = sArr8;
                    iM10045 = i617;
                    break;
                case 720419391:
                case 1581549395:
                    sb3 = sb9;
                    int i88 = iM10045;
                    sArr5 = sArr5;
                    str7 = str7;
                    c6 = c6;
                    C1783.m6234(sb3, str2);
                    iM10045 = i88;
                    strM5510 = C1564.m5510(f19032, 133, 4, i43);
                    if (C3033.m9845() > 0) {
                        int iM27614 = C0619.m2761("᩹ܽ") ^ i37;
                        i39 = ((iM27614 ^ i38) * (-8827)) ^ 2049820846;
                        i40 = iM27614 ^ (-308855666);
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        sb9 = sb3;
                    } else {
                        strM5510 = strM5510;
                        int i710 = i52;
                        i49 = i49;
                        i5 = i710;
                        int i711 = i51;
                        i50 = i50;
                        i6 = i711;
                        iM2762 = C0773.m3169("۠᩹") ^ i37;
                        i7 = ((iM2762 ^ i38) * (-26897)) ^ (-1238714114);
                        i8 = -373593232;
                        i40 = iM2762 ^ i8;
                        i39 = i7;
                        c6 = c6;
                        str7 = str7;
                        sArr5 = sArr5;
                        iM10045 = iM10045;
                        strM5510 = strM5510;
                        i41 = i41;
                        i42 = i42;
                        sb9 = sb;
                        int i51113 = i49;
                        i52 = i5;
                        i49 = i51113;
                        int i51114 = i50;
                        i51 = i6;
                        i50 = i51114;
                    }
                    break;
                case 805932691:
                case 1767770141:
                    i5 = i52;
                    i6 = i51;
                    i43 = 6488;
                    iM2762 = (C0773.m3169("ۜۚ") + i37) * (-21);
                    i7 = ((iM2762 ^ i38) * (-23633)) ^ 1815059006;
                    i8 = 1540575720;
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i51115 = i49;
                    i52 = i5;
                    i49 = i51115;
                    int i51116 = i50;
                    i51 = i6;
                    i50 = i51116;
                    break;
                case 1387487557:
                case 1943954482:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i89 = i52;
                    i49 = i49;
                    i5 = i89;
                    int i90 = i51;
                    i50 = i50;
                    i6 = i90;
                    c6 = '\n';
                    if (set.contains(th)) {
                        iM2763 = C0773.m3169("ᩴۗ") ^ i38;
                        i9 = ((iM2763 ^ i37) * (-25131)) ^ 1639933190;
                        i10 = -2066110261;
                    } else {
                        iM2763 = (i38 - C0619.m2761("ۙ᩻")) * 19;
                        i9 = ((iM2763 ^ i37) * 32581) ^ 521653512;
                        i10 = 1695811430;
                    }
                    i40 = iM2763 ^ i10;
                    i39 = i9;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i51117 = i49;
                    i52 = i5;
                    i49 = i51117;
                    int i51118 = i50;
                    i51 = i6;
                    i50 = i51118;
                    break;
                case 1434357800:
                case 1656684767:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i91 = i52;
                    i49 = i49;
                    i5 = i91;
                    int i92 = i51;
                    i50 = i50;
                    i6 = i92;
                    int i93 = s + 1;
                    if ((i93 * i93) - i35 < 0) {
                        iM2762 = C0619.m2761("ܿۜ") ^ i37;
                        i7 = ((iM2762 ^ i38) * (-3063)) ^ 565995740;
                        i8 = 1027716964;
                    } else {
                        iM2762 = (C0619.m2761("ۨۧ") ^ i38) * (-3);
                        i7 = ((iM2762 ^ i37) * 617) ^ (-1340180972);
                        i8 = -1336343289;
                    }
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i51119 = i49;
                    i52 = i5;
                    i49 = i51119;
                    int i511110 = i50;
                    i51 = i6;
                    i50 = i511110;
                    break;
                case 1558427776:
                case 1586484342:
                    sb7 = sb;
                    m16281(th2, sb7, stackTraceElementArr2, C2878.m9486(sArr6, 138, 12, i43), strM34972, set);
                    i44++;
                    length2 = i41;
                    i42 = i42;
                    int iM316111 = C0773.m3169("ۤۡ") ^ i37;
                    int i712 = length2;
                    i39 = ((iM316111 ^ i38) * 27847) ^ 1994467944;
                    i40 = iM316111 ^ 71799298;
                    c6 = c6;
                    i52 = i52;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    sb9 = sb7;
                    i50 = i50;
                    i41 = i712;
                    i51 = i51;
                    break;
                case 1627479831:
                case 1713887834:
                    str5 = strM5510;
                    i19 = i41;
                    i20 = i42;
                    sb5 = sb9;
                    i21 = iM10045;
                    sArr3 = sArr5;
                    str6 = str7;
                    i22 = i49;
                    i23 = i52;
                    c3 = c6;
                    int i94 = i51;
                    i17 = i50;
                    i18 = i94;
                    i34 = 0;
                    iM2766 = C0619.m2761("ᩴۨ") ^ i37;
                    i24 = ((iM2766 ^ i38) * (-26323)) ^ (-1925388520);
                    i25 = 324178810;
                    i40 = iM2766 ^ i25;
                    c6 = c3;
                    i39 = i24;
                    str7 = str6;
                    i52 = i23;
                    strM5510 = str5;
                    i41 = i19;
                    i42 = i20;
                    i49 = i22;
                    sb9 = sb5;
                    sArr5 = sArr3;
                    iM10045 = i21;
                    int i618 = i17;
                    i51 = i18;
                    i50 = i618;
                    break;
                case 1696147778:
                case 1990695755:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i95 = i52;
                    i49 = i49;
                    i5 = i95;
                    int i96 = i51;
                    i50 = i50;
                    i6 = i96;
                    if (C2310.f7472 >= 0) {
                        iM2762 = C0773.m3169("۠᩹") ^ i37;
                        i7 = ((iM2762 ^ i38) * (-26897)) ^ (-1238714114);
                        i8 = -373593232;
                    } else {
                        iM2762 = (C0619.m2761("ۘۗ") + i37) * 13;
                        i7 = ((iM2762 ^ i38) * 19065) ^ 602474290;
                        i8 = -1771342136;
                    }
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i511111 = i49;
                    i52 = i5;
                    i49 = i511111;
                    int i511112 = i50;
                    i51 = i6;
                    i50 = i511112;
                    break;
                default:
                    str7 = str7;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    c6 = c6;
                    iM10045 = iM10045;
                    sArr5 = sArr5;
                    int i97 = i52;
                    i49 = i49;
                    i5 = i97;
                    int i98 = i51;
                    i50 = i50;
                    i6 = i98;
                    i35 = (s * 2) + 1;
                    if (RunnableC0334.m2063()) {
                        iM2762 = C0773.m3169("᩻֨") ^ i37;
                        i7 = ((iM2762 ^ i38) * 24133) ^ 1677779549;
                        i8 = 1114984287;
                    } else {
                        iM2762 = C0773.m3169("ܿ᩸") ^ i38;
                        i7 = ((iM2762 ^ i37) * 15905) ^ (-1080592221);
                        i8 = 15588507;
                    }
                    i40 = iM2762 ^ i8;
                    i39 = i7;
                    c6 = c6;
                    str7 = str7;
                    sArr5 = sArr5;
                    iM10045 = iM10045;
                    strM5510 = strM5510;
                    i41 = i41;
                    i42 = i42;
                    sb9 = sb;
                    int i511113 = i49;
                    i52 = i5;
                    i49 = i511113;
                    int i511114 = i50;
                    i51 = i6;
                    i50 = i511114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03e2 A[PHI: r18 r24
      0x03e2: PHI (r18v3 short) = (r18v2 short), (r18v2 short), (r18v4 short) binds: [B:100:0x03e0, B:92:0x0392, B:72:0x02d1] A[DONT_GENERATE, DONT_INLINE]
      0x03e2: PHI (r24v4 short) = (r24v3 short), (r24v3 short), (r24v5 short) binds: [B:100:0x03e0, B:92:0x0392, B:72:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f1 A[PHI: r11 r13 r14 r15 r17 r19
      0x02f1: PHI (r11v5 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r15v5 short) = (r15v2 short), (r15v3 short), (r15v2 short), (r15v2 short) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r17v5 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r19v5 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:76:0x02ef, B:68:0x02ae, B:49:0x01d8, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0360  */
    /* JADX WARN: Code duplicated, block: B:97:0x03b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16277(int i, int i2, int i3, String str) {
        int iM2761;
        int i4;
        int i5;
        int iM3169;
        int i6;
        int i7 = C2966.f9654;
        int i8 = C23916.f77426;
        int iM2762 = (C0619.m2761("ۤ᩷") + i8) * 43;
        int i9 = ((iM2762 ^ i7) * (-12989)) ^ (-878966544);
        StringBuilder sb = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2762 ^ (-1589896691);
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char cM4937 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c2 = 0;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 87569279;
        short s3 = 0;
        while (true) {
            i21 = i10 ^ (i9 & (((i21 ^ i7) * (-30913)) >> 31));
            switch (i21) {
                case -2028547154:
                case 1780033080:
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("ۙ᩷") ^ i7) * (-45);
                        i4 = ((iM2761 ^ i8) * (-14799)) ^ 1636294364;
                        i5 = -1966781838;
                    } else {
                        iM2761 = C0619.m2761("۟ۤ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-8049)) ^ 1948029188;
                        i5 = 452246021;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -2014600157:
                case -1076998025:
                    C17202.m40372();
                    iM2761 = (C0619.m2761("֨ᩳ") + i8) * 73;
                    i4 = ((iM2761 ^ i7) * (-27433)) ^ 900646939;
                    i5 = -300678968;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1874113592:
                case 568346255:
                    C2023.m6955(sb, c);
                    i11++;
                    iM3169 = C0773.m3169("֨᩸") ^ i8;
                    i9 = ((iM3169 ^ i7) * 901) ^ 1838783642;
                    i6 = -845980018;
                    i10 = iM3169 ^ i6;
                    break;
                case -1702482124:
                case 1891473105:
                    i13 = 41174;
                    iM2761 = (C0773.m3169("ᩴ᩷") + i7) * (-95);
                    i4 = ((iM2761 ^ i8) * 30861) ^ 629719084;
                    i5 = 340211471;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1697445642:
                case 532026192:
                    C1080.m4046(sb, c);
                    i16++;
                    iM2761 = C0619.m2761("᩻֫") ^ i8;
                    i4 = ((iM2761 ^ i7) * 19131) ^ 1176787196;
                    i5 = -1926638171;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1687643231:
                case 877332524:
                    if (i12 >= i2) {
                        iM2761 = C0619.m2761("᩺֫") ^ i8;
                        i4 = ((iM2761 ^ i7) * 25767) ^ 348883906;
                        i5 = 1073851053;
                        i10 = iM2761 ^ i5;
                        i9 = i4;
                    } else {
                        iM3169 = (i7 - C0773.m3169("᩷ۤ")) * (-45);
                        i9 = ((iM3169 ^ i8) * 17245) ^ 842835653;
                        i6 = -1627337518;
                        i10 = iM3169 ^ i6;
                    }
                    break;
                case -1579845813:
                case -143604536:
                    sb = f19033;
                    if (i11 < i3) {
                        int iM31610 = C0773.m3169("ۛۛ") ^ i7;
                        i9 = ((iM31610 ^ i8) * 28541) ^ (-637493082);
                        i10 = iM31610 ^ 223630699;
                    } else {
                        int iM31611 = (C0773.m3169("ۜۜ") ^ i7) * (-39);
                        i10 = iM31611 ^ 850837108;
                        i9 = ((iM31611 ^ i8) * 27881) ^ (-139234623);
                    }
                    c = ' ';
                    break;
                case -1313431352:
                case 653029871:
                    C2023.m6955(sb, c2);
                    i14++;
                    i12 = i19;
                    iM2761 = (C0619.m2761("ܶܳ") ^ i7) * 37;
                    i4 = ((iM2761 ^ i8) * 6537) ^ (-582327251);
                    i5 = -2117392102;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1211515741:
                case 1851376056:
                    if (i16 < i15) {
                        iM2761 = C0619.m2761("ۢᩴ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-27089)) ^ (-932351377);
                        i5 = -2102838975;
                    } else {
                        i12 = i19;
                        iM2761 = (C0619.m2761("ܶܳ") ^ i7) * 37;
                        i4 = ((iM2761 ^ i8) * 6537) ^ (-582327251);
                        i5 = -2117392102;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1168193595:
                case -758396884:
                    i20 = (s3 * s2) + 1;
                    s = 1;
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") + i7) * (-67);
                        i4 = ((iM2761 ^ i8) * 3461) ^ 1127721095;
                        i5 = -342764261;
                    } else {
                        iM2761 = (C0619.m2761("ۛܶ") ^ i8) * 95;
                        i4 = ((iM2761 ^ i7) * (-30419)) ^ (-1447098151);
                        i5 = -667277570;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1159851370:
                case 877075656:
                    C3690.m11987();
                    if (C3033.m9845() > 0) {
                        iM2761 = C0619.m2761("ܺ۬") ^ i8;
                        i4 = ((iM2761 ^ i7) * 20673) ^ (-1435994504);
                        i5 = 647768453;
                    } else {
                        iM2761 = C0619.m2761("᩷ܺ") ^ i8;
                        i4 = ((iM2761 ^ i7) * 24537) ^ 1446251275;
                        i5 = 1465180435;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -1145287415:
                case -268506763:
                    i11 = 0;
                    iM3169 = C0773.m3169("֨᩸") ^ i8;
                    i9 = ((iM3169 ^ i7) * 901) ^ 1838783642;
                    i6 = -845980018;
                    i10 = iM3169 ^ i6;
                    break;
                case -1131958534:
                case 808125264:
                    sArr = f19032;
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") + i7) * (-67);
                        i4 = ((iM2761 ^ i8) * 3461) ^ 1127721095;
                        i5 = -342764261;
                    } else {
                        iM2761 = C0619.m2761("ۖۚ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-25463)) ^ (-1338644154);
                        i5 = 1747189632;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -915448194:
                case 1164658542:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i8;
                        i4 = ((iM2761 ^ i7) * 11431) ^ 97730214;
                        i5 = -941255513;
                    } else {
                        iM2761 = C0773.m3169("ᩴ֫") ^ i8;
                        i4 = ((iM2761 ^ i7) * 20999) ^ (-1822701896);
                        i5 = 1358515225;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -802321148:
                case -431336399:
                    c2 = ' ';
                    iM2761 = C0773.m3169("᩸ܳ") ^ i8;
                    i4 = ((iM2761 ^ i7) * (-11911)) ^ (-508538279);
                    i5 = 470555074;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -747405896:
                case 1947278892:
                    i15 = 4 - (i14 % 4);
                    i16 = 0;
                    iM2761 = C0619.m2761("᩻֫") ^ i8;
                    i4 = ((iM2761 ^ i7) * 19131) ^ 1176787196;
                    i5 = -1926638171;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -585839841:
                case 1498481968:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("֨ᩳ") + i8) * 73;
                        i4 = ((iM2761 ^ i7) * (-27433)) ^ 900646939;
                        i5 = -300678968;
                    } else {
                        iM2761 = (C0619.m2761("ܿܳ") + i7) * (-119);
                        i4 = ((iM2761 ^ i8) * 29479) ^ (-119687545);
                        i5 = -2073012857;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -488646524:
                case 2043398217:
                    C1783.m6234(sb, AbstractC0116.m1236(sArr2, i17, i18, i13));
                    i14 = 0;
                    i12 = i;
                    iM2761 = (C0619.m2761("ܶܳ") ^ i7) * 37;
                    i4 = ((iM2761 ^ i8) * 6537) ^ (-582327251);
                    i5 = -2117392102;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -377102784:
                case 1908349768:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("۟ۤ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-8049)) ^ 1948029188;
                        i5 = 452246021;
                    } else {
                        iM2761 = (C0773.m3169("ۡۤ") ^ i8) * (-123);
                        i4 = ((iM2761 ^ i7) * (-9591)) ^ (-877656912);
                        i5 = -2071791783;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -363788696:
                case -348122763:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i8;
                        i4 = ((iM2761 ^ i7) * 11431) ^ 97730214;
                        i5 = -941255513;
                    } else {
                        iM2761 = (C0619.m2761("۟ۙ") + i7) * (-39);
                        i4 = ((iM2761 ^ i8) * (-27437)) ^ 1990876866;
                        i5 = 371760422;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -246142428:
                case 39169613:
                    int i22 = s3 + s;
                    if (i20 - (i22 * i22) > 0) {
                        iM2761 = (i8 - C0773.m3169("۠᩻")) * (-85);
                        i4 = ((iM2761 ^ i7) * 1995) ^ (-1902084228);
                        i5 = 1162094052;
                    } else {
                        iM2761 = C0619.m2761("᩵᩸") ^ i7;
                        i4 = ((iM2761 ^ i8) * 11823) ^ 986624207;
                        i5 = 127575124;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -180559737:
                case 487939160:
                    s3 = sArr[24];
                    s2 = 2;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i8;
                        i4 = ((iM2761 ^ i7) * 11431) ^ 97730214;
                        i5 = -941255513;
                    } else {
                        iM2761 = C0773.m3169("֫ۤ") ^ i8;
                        i4 = ((iM2761 ^ i7) * (-20141)) ^ (-1073045043);
                        i5 = -2135088438;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -150889968:
                case 417484943:
                    if (cM4937 == '\r') {
                        iM2761 = C0619.m2761("᩶ܰ") ^ i7;
                        i4 = ((iM2761 ^ i8) * 14771) ^ 1395808232;
                        i5 = 2069277320;
                    } else {
                        c2 = cM4937;
                        iM2761 = C0773.m3169("᩸ܳ") ^ i8;
                        i4 = ((iM2761 ^ i7) * (-11911)) ^ (-508538279);
                        i5 = 470555074;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -49931504:
                case 179676186:
                    C1564.m5509();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("֨ᩳ") + i8) * 73;
                        i4 = ((iM2761 ^ i7) * (-27433)) ^ 900646939;
                        i5 = -300678968;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۡ") + i7) * (-67);
                        i4 = ((iM2761 ^ i8) * 3461) ^ 1127721095;
                        i5 = -342764261;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case -17078896:
                case 1837062225:
                    i19 = i12 + 1;
                    cM4937 = C1343.m4937(str, i12);
                    if (cM4937 == '\t') {
                        iM2761 = C0773.m3169("ۛܽ") ^ i8;
                        i4 = ((iM2761 ^ i7) * (-26799)) ^ 207879763;
                        i5 = 1324521080;
                        i10 = iM2761 ^ i5;
                        i9 = i4;
                    } else {
                        iM3169 = C0773.m3169("ۤۤ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-3221)) ^ (-1991918440);
                        i6 = 1780384595;
                        i10 = iM3169 ^ i6;
                    }
                    break;
                case 103808051:
                case 1682177800:
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0619.m2761("֨ᩳ") + i8) * 73;
                        i4 = ((iM2761 ^ i7) * (-27433)) ^ 900646939;
                        i5 = -300678968;
                    } else {
                        iM2761 = (C0773.m3169("ۧ۬") ^ i8) * 39;
                        i4 = ((iM2761 ^ i7) * 14851) ^ (-1099892739);
                        i5 = 633213338;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case 168428863:
                case 932243533:
                    i13 = 51196;
                    iM2761 = (C0773.m3169("ᩴ᩷") + i7) * (-95);
                    i4 = ((iM2761 ^ i8) * 30861) ^ 629719084;
                    i5 = 340211471;
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case 408678363:
                case 586472895:
                    sArr2 = f19032;
                    i17 = 25;
                    i18 = 3;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") + i7) * (-67);
                        i4 = ((iM2761 ^ i8) * 3461) ^ 1127721095;
                        i5 = -342764261;
                    } else {
                        iM2761 = C0773.m3169("ۡᩴ") ^ i8;
                        i4 = ((iM2761 ^ i7) * 26071) ^ 708185831;
                        i5 = 1126724716;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case 422384628:
                case 2061615946:
                    C1080.m4046(sb, '\n');
                    break;
                case 478125281:
                case 1049819006:
                    C1080.m4050();
                    if (C1826.f6190 > 0) {
                        iM2761 = (C0619.m2761("֨ᩳ") + i8) * 73;
                        i4 = ((iM2761 ^ i7) * (-27433)) ^ 900646939;
                        i5 = -300678968;
                    } else {
                        iM2761 = C0619.m2761("۟ۤ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-8049)) ^ 1948029188;
                        i5 = 452246021;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                case 1840548134:
                case 1925725611:
                    if (C2375.m8065() > 0) {
                        iM2761 = C0619.m2761("۟ۤ") ^ i7;
                        i4 = ((iM2761 ^ i8) * (-8049)) ^ 1948029188;
                        i5 = 452246021;
                    } else {
                        iM2761 = C0619.m2761("ܺ۬") ^ i8;
                        i4 = ((iM2761 ^ i7) * 20673) ^ (-1435994504);
                        i5 = 647768453;
                    }
                    i10 = iM2761 ^ i5;
                    i9 = i4;
                    break;
                default:
                    C23916.m53419();
                    C3448.m11248();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0c21 A[PHI: r3 r4 r5 r6 r7 r8 r10 r14 r15 r21 r25 r26 r27 r28 r30 r31 r35 r39 r40 r41 r42
      0x0c21: PHI (r3v8 short[]) = (r3v4 short[]), (r3v5 short[]), (r3v9 short[]) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r4v7 int) = (r4v3 int), (r4v4 int), (r4v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r5v8 short[]) = (r5v3 short[]), (r5v4 short[]), (r5v9 short[]) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r6v7 int) = (r6v3 int), (r6v4 int), (r6v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r7v7 char) = (r7v3 char), (r7v4 char), (r7v8 char) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r8v7 int) = (r8v3 int), (r8v4 int), (r8v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r10v7 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String), (r10v8 java.lang.String) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r14v7 int) = (r14v3 int), (r14v4 int), (r14v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r15v7 int) = (r15v3 int), (r15v4 int), (r15v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r21v7 int) = (r21v3 int), (r21v4 int), (r21v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r25v2 int) = (r25v1 int), (r25v1 int), (r25v3 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v3 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r27v2 int) = (r27v1 int), (r27v1 int), (r27v3 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r28v7 int) = (r28v3 int), (r28v4 int), (r28v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r30v7 int) = (r30v3 int), (r30v4 int), (r30v8 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r31v6 java.lang.StackTraceElement) = (r31v2 java.lang.StackTraceElement), (r31v3 java.lang.StackTraceElement), (r31v7 java.lang.StackTraceElement) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r35v7 java.lang.String) = (r35v3 java.lang.String), (r35v4 java.lang.String), (r35v8 java.lang.String) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r39v10 short[]) = (r39v6 short[]), (r39v7 short[]), (r39v11 short[]) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r40v4 java.lang.String) = (r40v0 java.lang.String), (r40v1 java.lang.String), (r40v5 java.lang.String) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r41v6 int) = (r41v2 int), (r41v3 int), (r41v7 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r42v4 int) = (r42v0 int), (r42v1 int), (r42v5 int) binds: [B:16:0x0100, B:152:0x0c1f, B:139:0x0b22] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0166  */
    /* JADX WARN: Code duplicated, block: B:45:0x0220 A[PHI: r1
      0x0220: PHI (r1v98 java.lang.String) = (r1v81 java.lang.String), (r1v2 java.lang.String) binds: [B:44:0x021e, B:7:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16280(String str, String str2, Throwable th) {
        int iM3169;
        int i;
        int i2;
        String str3;
        int i3;
        short[] sArr;
        String str4;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        String str5;
        StackTraceElement stackTraceElement;
        int i8;
        char c;
        StackTraceElement stackTraceElement2;
        int iM2761;
        int i9;
        int i10;
        short[] sArr3;
        StackTraceElement stackTraceElement3;
        int i11;
        int i12;
        String str6;
        short[] sArr4;
        int i13;
        String str7;
        int i14;
        int i15;
        String str8;
        int i16;
        int i17;
        char c2;
        int i18;
        int length;
        String str9;
        int i19;
        int i20;
        int i21;
        short[] sArr5;
        char c3;
        short[] sArr6;
        int i22;
        int i23;
        String str10;
        String str11;
        int i24;
        int i25;
        int i26;
        short[] sArr7;
        StackTraceElement stackTraceElement4;
        int iM31610;
        int i27;
        int i28;
        int iM2762;
        int i29;
        int i30;
        StackTraceElement stackTraceElement5;
        String str12;
        char c4;
        StackTraceElement stackTraceElement6;
        String str13;
        int i31;
        int i32;
        short[] sArr8;
        int i33;
        String str14;
        String str15;
        int i34;
        int i35;
        int i36;
        short[] sArr9;
        int iM31611;
        int i37;
        int i38;
        StackTraceElement stackTraceElement7;
        short[] sArr10;
        int iM2763;
        int i39;
        int i40;
        short[] sArr11;
        int i41;
        int i42;
        int iM2764;
        int i43;
        int i44;
        short[] sArr12 = null;
        short s = 0;
        short s2 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = -80222474;
        int i50 = C3033.f9831;
        int i51 = C2310.f7472;
        int iM2765 = (i50 - C0619.m2761("ܳۨ")) * (-39);
        int i52 = ((iM2765 ^ i51) * (-30295)) ^ 1535583476;
        int i53 = iM2765 ^ 1017398454;
        Set setNewSetFromMap = null;
        StackTraceElement stackTraceElement8 = null;
        String str16 = null;
        String strM8881 = null;
        String strM13530 = null;
        short[] sArr13 = null;
        int i54 = 0;
        int i55 = 0;
        StringBuilder sb = null;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        boolean z = false;
        int i59 = 0;
        char c5 = 0;
        int i60 = 0;
        int iM9671 = 0;
        Throwable[] thArr = null;
        String strM5399 = null;
        int length2 = 0;
        Throwable th2 = null;
        Throwable thM7969 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        int i61 = 0;
        StackTraceElement[] stackTraceElementArr = null;
        String str17 = null;
        while (true) {
            i49 = i53 ^ (i52 & (((i49 ^ i51) * 11879) >> 31));
            switch (i49) {
                case -2093216434:
                case -1630702960:
                    strM13530 = strM13530;
                    StackTraceElement stackTraceElement9 = stackTraceElement8;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    c5 = c5;
                    sArr13 = sArr13;
                    i54 = i54;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    i61 = i61;
                    if (!(th instanceof C4866)) {
                        iM2761 = C0619.m2761("ܺ֫") ^ i51;
                        stackTraceElement2 = stackTraceElement9;
                        i52 = ((iM2761 ^ i50) * 30723) ^ (-558672244);
                        i9 = 1395641694;
                        int i62 = iM2761 ^ i9;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        i54 = i54;
                        str16 = str16;
                        sArr14 = sArr14;
                        i56 = i56;
                        i53 = i62;
                        c5 = c5;
                        iM9671 = iM9671;
                        i59 = i59;
                        stackTraceElement8 = stackTraceElement2;
                        strM13530 = strM13530;
                        sArr13 = sArr13;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    } else {
                        stackTraceElement8 = stackTraceElement9;
                        iM3169 = C0773.m3169("֡֫") ^ i51;
                        i52 = ((iM3169 ^ i50) * (-22187)) ^ 750982956;
                        i = 1245755782;
                        i12 = iM3169 ^ i;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    }
                    break;
                case -2084003400:
                case -229609382:
                    str9 = strM13530;
                    StackTraceElement stackTraceElement10 = stackTraceElement8;
                    i20 = i56;
                    i21 = i58;
                    sArr5 = sArr14;
                    i22 = iM9671;
                    str10 = str16;
                    str11 = str17;
                    i24 = i55;
                    length2 = length2;
                    if (i54 >= i22) {
                        c3 = c5;
                        sArr6 = sArr13;
                        i25 = i48;
                        i26 = i61;
                        sArr7 = sArr15;
                        i23 = i54;
                        stackTraceElement4 = stackTraceElement10;
                        iM31610 = (C0619.m2761("ᩳۧ") ^ i50) * 57;
                        i27 = ((iM31610 ^ i51) * 17257) ^ 798092769;
                        i28 = 781441500;
                        int i63 = iM31610 ^ i28;
                        sArr13 = sArr6;
                        i61 = i26;
                        sArr15 = sArr7;
                        i48 = i25;
                        str17 = str11;
                        i55 = i24;
                        str16 = str10;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        strM13530 = str9;
                        char c6 = c3;
                        stackTraceElement8 = stackTraceElement4;
                        i54 = i23;
                        c5 = c6;
                        sArr11 = sArr5;
                        i53 = i63;
                        i52 = i27;
                        length2 = length2;
                        sArr14 = sArr11;
                    } else {
                        int iM31612 = (C0773.m3169("᩸ۙ") ^ i51) * (-41);
                        int i64 = ((iM31612 ^ i50) * (-27663)) ^ (-1435316361);
                        i41 = iM31612 ^ (-365015606);
                        stackTraceElement8 = stackTraceElement10;
                        i52 = i64;
                        str17 = str11;
                        i55 = i24;
                        length2 = length2;
                        str16 = str10;
                        sArr14 = sArr5;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        i53 = i41;
                        strM13530 = str9;
                    }
                    break;
                case -2061687882:
                case -978509060:
                    stackTraceElement2 = stackTraceElement8;
                    z = true;
                    iM2761 = (C0619.m2761("۫ܶ") + i51) * (-105);
                    i52 = ((iM2761 ^ i50) * 7061) ^ 1981299256;
                    i9 = 484896266;
                    int i65 = iM2761 ^ i9;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    i54 = i54;
                    str16 = str16;
                    sArr14 = sArr14;
                    i56 = i56;
                    i53 = i65;
                    c5 = c5;
                    iM9671 = iM9671;
                    i59 = i59;
                    stackTraceElement8 = stackTraceElement2;
                    strM13530 = strM13530;
                    sArr13 = sArr13;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -1994103726:
                case -595689715:
                    strM13530 = strM13530;
                    stackTraceElement6 = stackTraceElement8;
                    i31 = i56;
                    i32 = i58;
                    sArr14 = sArr14;
                    sArr8 = sArr13;
                    i33 = iM9671;
                    str14 = str16;
                    str15 = str17;
                    i34 = i55;
                    length2 = length2;
                    i35 = i48;
                    i36 = i61;
                    sArr9 = sArr15;
                    thM7969 = C2354.m7969(th);
                    if (thM7969 != null) {
                        iM31611 = C0773.m3169("֫ᩳ") ^ i50;
                        i37 = ((iM31611 ^ i51) * (-6777)) ^ (-126481702);
                        i38 = -1973683701;
                    } else {
                        iM31611 = C0619.m2761("֨֡") ^ i51;
                        i37 = ((iM31611 ^ i50) * (-9893)) ^ 383781276;
                        i38 = -2091898948;
                    }
                    i42 = iM31611 ^ i38;
                    sArr13 = sArr8;
                    i61 = i36;
                    sArr15 = sArr9;
                    i48 = i35;
                    str17 = str15;
                    i55 = i34;
                    str16 = str14;
                    i56 = i31;
                    i58 = i32;
                    iM9671 = i33;
                    strM13530 = strM13530;
                    int i66 = i42;
                    stackTraceElement8 = stackTraceElement6;
                    i52 = i37;
                    length2 = length2;
                    sArr14 = sArr14;
                    i53 = i66;
                    break;
                case -1910408357:
                case -619049687:
                    str9 = strM13530;
                    i20 = i56;
                    i21 = i58;
                    sArr5 = sArr14;
                    c3 = c5;
                    sArr6 = sArr13;
                    i22 = iM9671;
                    i23 = i54;
                    str10 = str16;
                    str11 = str17;
                    i24 = i55;
                    length2 = length2;
                    i25 = i48;
                    i26 = i61;
                    sArr7 = sArr15;
                    stackTraceElement4 = stackTraceElementArr[i60];
                    if (z) {
                        iM31610 = (i51 - C0773.m3169("ۤۘ")) * (-51);
                        i27 = ((iM31610 ^ i50) * 23457) ^ 1996674309;
                        i28 = 372502337;
                    } else {
                        iM31610 = (C0619.m2761("ᩳۧ") ^ i50) * 57;
                        i27 = ((iM31610 ^ i51) * 17257) ^ 798092769;
                        i28 = 781441500;
                    }
                    int i67 = iM31610 ^ i28;
                    sArr13 = sArr6;
                    i61 = i26;
                    sArr15 = sArr7;
                    i48 = i25;
                    str17 = str11;
                    i55 = i24;
                    str16 = str10;
                    i56 = i20;
                    i58 = i21;
                    iM9671 = i22;
                    strM13530 = str9;
                    char c7 = c3;
                    stackTraceElement8 = stackTraceElement4;
                    i54 = i23;
                    c5 = c7;
                    sArr11 = sArr5;
                    i53 = i67;
                    i52 = i27;
                    length2 = length2;
                    sArr14 = sArr11;
                    break;
                case -1870452941:
                case 1635925246:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    int i68 = s + s2;
                    i45 = i68 * i68;
                    i46 = s * s;
                    i47 = 204175521;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("᩹᩷") + i51) * (-51);
                        i52 = ((iM3169 ^ i50) * 17881) ^ 1761859981;
                        i = 1908760504;
                    } else {
                        iM3169 = (i50 - C0619.m2761("ۖۛ")) * (-83);
                        i52 = ((iM3169 ^ i51) * 13791) ^ (-1108438955);
                        i = 286049127;
                    }
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -1855214775:
                case -862878539:
                    stackTraceElement5 = stackTraceElement8;
                    str12 = str17;
                    C3779.m12258(sb, str12);
                    C1146.m4235(sb, stackTraceElement5);
                    c4 = c5;
                    C2023.m6955(sb, c4);
                    int iM31613 = C0773.m3169("ܽۚ") ^ i50;
                    sArr13 = sArr13;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str12;
                    i55 = i55;
                    str16 = str16;
                    i56 = i56;
                    i58 = i58;
                    iM9671 = iM9671;
                    strM13530 = strM13530;
                    StackTraceElement stackTraceElement11 = stackTraceElement5;
                    i52 = ((iM31613 ^ i51) * 29207) ^ 1004528231;
                    i54 = i54;
                    c5 = c4;
                    stackTraceElement8 = stackTraceElement11;
                    sArr11 = sArr14;
                    i53 = iM31613 ^ 1220821227;
                    length2 = length2;
                    sArr14 = sArr11;
                    break;
                case -1805826860:
                case -1670248715:
                    stackTraceElement2 = stackTraceElement8;
                    z = false;
                    iM2761 = (C0619.m2761("۫ܶ") + i51) * (-105);
                    i52 = ((iM2761 ^ i50) * 7061) ^ 1981299256;
                    i9 = 484896266;
                    int i69 = iM2761 ^ i9;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    i54 = i54;
                    str16 = str16;
                    sArr14 = sArr14;
                    i56 = i56;
                    i53 = i69;
                    c5 = c5;
                    iM9671 = iM9671;
                    i59 = i59;
                    stackTraceElement8 = stackTraceElement2;
                    strM13530 = strM13530;
                    sArr13 = sArr13;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -1731620873:
                case 634900640:
                    i54++;
                    str13 = str16;
                    stackTraceElement6 = stackTraceElement8;
                    int iM31614 = C0773.m3169("᩶ܺ") ^ i50;
                    i37 = ((iM31614 ^ i51) * 27611) ^ (-714427857);
                    i42 = iM31614 ^ 1813494166;
                    sArr13 = sArr13;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i55;
                    i56 = i56;
                    i58 = i58;
                    str16 = str13;
                    strM13530 = strM13530;
                    int i610 = i42;
                    stackTraceElement8 = stackTraceElement6;
                    i52 = i37;
                    length2 = length2;
                    sArr14 = sArr14;
                    i53 = i610;
                    break;
                case -1697563022:
                case -1088199603:
                    str3 = strM13530;
                    i3 = i56;
                    i58 = i58;
                    sArr = sArr14;
                    sArr13 = sArr13;
                    str4 = str17;
                    i55 = i55;
                    i4 = length2;
                    i5 = i59;
                    i48 = i48;
                    sArr2 = sArr15;
                    i6 = i60;
                    i7 = iM9671;
                    str5 = str16;
                    stackTraceElement = stackTraceElement8;
                    char c8 = c5;
                    i8 = i61;
                    i2 = i54;
                    C1783.m6234(sb, str2);
                    C1080.m4046(sb, c8);
                    c = c8;
                    int iM2766 = C0619.m2761("ۨ᩶") ^ i51;
                    i61 = i8;
                    sArr15 = sArr2;
                    i60 = i6;
                    str17 = str4;
                    length2 = i4;
                    str16 = str5;
                    sArr14 = sArr;
                    strM13530 = str3;
                    i56 = i3;
                    i53 = iM2766 ^ (-2047584509);
                    i52 = ((iM2766 ^ i50) * 16025) ^ (-2137403259);
                    iM9671 = i7;
                    i59 = i5;
                    stackTraceElement8 = stackTraceElement;
                    sArr13 = sArr13;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    int i70 = i2;
                    c5 = c;
                    i54 = i70;
                    break;
                case -1643273451:
                case 1543924279:
                    i2 = i54;
                    str3 = strM13530;
                    i3 = i56;
                    i58 = i58;
                    sArr = sArr14;
                    sArr13 = sArr13;
                    str4 = str17;
                    i55 = i55;
                    i4 = length2;
                    i5 = i59;
                    i48 = i48;
                    sArr2 = sArr15;
                    i6 = i60;
                    i7 = iM9671;
                    str5 = str16;
                    stackTraceElement = stackTraceElement8;
                    i8 = i61;
                    sb = new StringBuilder();
                    c = '\n';
                    if (str2 == null) {
                        int iM2767 = C0619.m2761("ۨ᩶") ^ i51;
                        i61 = i8;
                        sArr15 = sArr2;
                        i60 = i6;
                        str17 = str4;
                        length2 = i4;
                        str16 = str5;
                        sArr14 = sArr;
                        strM13530 = str3;
                        i56 = i3;
                        i53 = iM2767 ^ (-2047584509);
                        i52 = ((iM2767 ^ i50) * 16025) ^ (-2137403259);
                        iM9671 = i7;
                        i59 = i5;
                        stackTraceElement8 = stackTraceElement;
                        sArr13 = sArr13;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                        int i71 = i2;
                        c5 = c;
                        i54 = i71;
                    } else {
                        int iM31615 = C0773.m3169("᩷ۧ") ^ i50;
                        i61 = i8;
                        sArr15 = sArr2;
                        i60 = i6;
                        str17 = str4;
                        length2 = i4;
                        i54 = i2;
                        str16 = str5;
                        sArr14 = sArr;
                        strM13530 = str3;
                        i56 = i3;
                        c5 = '\n';
                        i53 = iM31615 ^ 1358724279;
                        i52 = ((iM31615 ^ i51) * 2141) ^ 1448042504;
                        iM9671 = i7;
                        i59 = i5;
                        stackTraceElement8 = stackTraceElement;
                        sArr13 = sArr13;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    }
                    break;
                case -1617676659:
                case 1105632681:
                    str9 = strM13530;
                    stackTraceElement7 = stackTraceElement8;
                    i20 = i56;
                    i21 = i58;
                    sArr5 = sArr14;
                    i22 = iM9671;
                    str10 = str16;
                    str11 = str17;
                    i24 = i55;
                    length2 = length2;
                    sArr10 = sArr15;
                    strM8881 = C2702.m8881(sArr10, 70, 1, i57);
                    if (C2878.f9462) {
                        iM2763 = (i50 - C0619.m2761("֫ۙ")) * 83;
                        i39 = ((iM2763 ^ i51) * (-12523)) ^ (-619300038);
                        i40 = 2129642102;
                    } else {
                        iM2763 = C0773.m3169("۫֨") ^ i51;
                        i39 = ((iM2763 ^ i50) * (-591)) ^ 1620315942;
                        i40 = -808191712;
                    }
                    i41 = iM2763 ^ i40;
                    stackTraceElement8 = stackTraceElement7;
                    i52 = i39;
                    sArr15 = sArr10;
                    str17 = str11;
                    i55 = i24;
                    length2 = length2;
                    str16 = str10;
                    sArr14 = sArr5;
                    i56 = i20;
                    i58 = i21;
                    iM9671 = i22;
                    i53 = i41;
                    strM13530 = str9;
                    break;
                case -1522799646:
                case -1437770360:
                    C0619.m2763();
                    break;
                case -1491565444:
                case 272171417:
                    i60++;
                    length = i59;
                    c2 = c5;
                    i18 = iM9671;
                    strM13530 = strM13530;
                    int iM2768 = (C0619.m2761("ܳ۫") + i50) * 69;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i55;
                    i54 = i54;
                    str16 = str16;
                    i56 = i56;
                    i58 = i58;
                    c5 = c2;
                    iM9671 = i18;
                    stackTraceElement8 = stackTraceElement8;
                    i59 = length;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = ((iM2768 ^ i51) * 23579) ^ (-1635532151);
                    i53 = iM2768 ^ 512122240;
                    strM13530 = strM13530;
                    sArr13 = sArr13;
                    break;
                case -1418537756:
                case 1405529300:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    AbstractC0116.m1230(setNewSetFromMap, th);
                    if (th instanceof JSONException) {
                        iM3169 = C0773.m3169("֡֫") ^ i51;
                        i52 = ((iM3169 ^ i50) * (-22187)) ^ 750982956;
                        i = 1245755782;
                        i12 = iM3169 ^ i;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                    } else {
                        int iM2769 = (C0619.m2761("ۘ۟") + i50) * 3;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = iM2769 ^ 1286271325;
                        iM9671 = iM9671;
                        i59 = i59;
                        i52 = ((iM2769 ^ i51) * (-31567)) ^ (-826909196);
                        sArr13 = sArr13;
                        i54 = i54;
                    }
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -1325743479:
                case 264731378:
                    String strM2820 = AbstractC0641.m2820(sArr14, i56, i58, i57);
                    strM13530 = strM13530;
                    i33 = iM9671;
                    str14 = str16;
                    i31 = i56;
                    str15 = str17;
                    i32 = i58;
                    i34 = i55;
                    stackTraceElement6 = stackTraceElement8;
                    sArr14 = sArr14;
                    length2 = length2;
                    m16281(thM7969, sb, stackTraceElementArr, strM2820, "", setNewSetFromMap);
                    sArr8 = sArr13;
                    i35 = i48;
                    i36 = i61;
                    sArr9 = sArr15;
                    iM31611 = C0619.m2761("֨֡") ^ i51;
                    i37 = ((iM31611 ^ i50) * (-9893)) ^ 383781276;
                    i38 = -2091898948;
                    i42 = iM31611 ^ i38;
                    sArr13 = sArr8;
                    i61 = i36;
                    sArr15 = sArr9;
                    i48 = i35;
                    str17 = str15;
                    i55 = i34;
                    str16 = str14;
                    i56 = i31;
                    i58 = i32;
                    iM9671 = i33;
                    strM13530 = strM13530;
                    int i611 = i42;
                    stackTraceElement8 = stackTraceElement6;
                    i52 = i37;
                    length2 = length2;
                    sArr14 = sArr14;
                    i53 = i611;
                    break;
                case -1221036774:
                case 1960637421:
                    C1783.m6232();
                    if (!C3998.m12920()) {
                        iM2764 = (C0773.m3169("ۨۤ") ^ i50) * 57;
                        i43 = ((iM2764 ^ i51) * (-13741)) ^ 596415380;
                        i44 = 1797249450;
                        i53 = iM2764 ^ i44;
                        i52 = i43;
                    } else {
                        str9 = strM13530;
                        stackTraceElement7 = stackTraceElement8;
                        i20 = i56;
                        i21 = i58;
                        sArr5 = sArr14;
                        i22 = iM9671;
                        str10 = str16;
                        str11 = str17;
                        i24 = i55;
                        length2 = length2;
                        sArr10 = sArr15;
                        iM2763 = (i50 - C0619.m2761("֫ۙ")) * 83;
                        i39 = ((iM2763 ^ i51) * (-12523)) ^ (-619300038);
                        i40 = 2129642102;
                        i41 = iM2763 ^ i40;
                        stackTraceElement8 = stackTraceElement7;
                        i52 = i39;
                        sArr15 = sArr10;
                        str17 = str11;
                        i55 = i24;
                        length2 = length2;
                        str16 = str10;
                        sArr14 = sArr5;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        i53 = i41;
                        strM13530 = str9;
                    }
                    break;
                case -1206518582:
                case -591529406:
                    str9 = strM13530;
                    StackTraceElement stackTraceElement12 = stackTraceElement8;
                    int i72 = i56;
                    int i73 = i58;
                    short[] sArr16 = sArr14;
                    char c9 = c5;
                    short[] sArr17 = sArr13;
                    int i74 = iM9671;
                    int i75 = i54;
                    String str18 = str16;
                    String str19 = str17;
                    int i76 = i55;
                    int i77 = length2;
                    int i78 = i59;
                    int i79 = i48;
                    int i80 = i61;
                    short[] sArr18 = sArr15;
                    int i81 = i60;
                    if (i81 < i78) {
                        int iM27610 = C0619.m2761("ܳۢ") ^ i50;
                        int i82 = ((iM27610 ^ i51) * (-22053)) ^ 868752358;
                        i61 = i80;
                        sArr15 = sArr18;
                        i48 = i79;
                        i60 = i81;
                        str17 = str19;
                        i55 = i76;
                        length2 = i77;
                        str16 = str18;
                        sArr14 = sArr16;
                        i56 = i72;
                        i58 = i73;
                        iM9671 = i74;
                        i53 = iM27610 ^ 1644019454;
                        i59 = i78;
                        strM13530 = str9;
                        sArr13 = sArr17;
                        i52 = i82;
                        i54 = i75;
                        c5 = c9;
                        stackTraceElement8 = stackTraceElement12;
                    } else {
                        int iM27611 = C0619.m2761("ܳ᩸") ^ i51;
                        int i83 = ((iM27611 ^ i50) * 26629) ^ 1058324042;
                        i61 = i80;
                        sArr15 = sArr18;
                        i48 = i79;
                        i60 = i81;
                        str17 = str19;
                        i55 = i76;
                        length2 = i77;
                        str16 = str18;
                        sArr14 = sArr16;
                        i56 = i72;
                        i58 = i73;
                        i53 = iM27611 ^ (-1077315331);
                        iM9671 = i74;
                        i54 = i75;
                        i59 = i78;
                        sArr13 = sArr17;
                        c5 = c9;
                        stackTraceElement8 = stackTraceElement12;
                        i52 = i83;
                        strM13530 = str9;
                    }
                    break;
                case -1165305550:
                case -185831247:
                    if (C2375.m8073(strM13530, C4282.m13656(str16, i54)) == -1) {
                        iM2764 = (C0619.m2761("۬ۡ") + i51) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i43 = ((iM2764 ^ i50) * 12467) ^ 1828463119;
                        i44 = -1229839083;
                        i53 = iM2764 ^ i44;
                        i52 = i43;
                    } else {
                        stackTraceElement5 = stackTraceElement8;
                        c4 = c5;
                        str12 = str17;
                        int iM31616 = C0773.m3169("ܽۚ") ^ i50;
                        sArr13 = sArr13;
                        i61 = i61;
                        sArr15 = sArr15;
                        i48 = i48;
                        str17 = str12;
                        i55 = i55;
                        str16 = str16;
                        i56 = i56;
                        i58 = i58;
                        iM9671 = iM9671;
                        strM13530 = strM13530;
                        StackTraceElement stackTraceElement13 = stackTraceElement5;
                        i52 = ((iM31616 ^ i51) * 29207) ^ 1004528231;
                        i54 = i54;
                        c5 = c4;
                        stackTraceElement8 = stackTraceElement13;
                        sArr11 = sArr14;
                        i53 = iM31616 ^ 1220821227;
                        length2 = length2;
                        sArr14 = sArr11;
                    }
                    break;
                case -1161059742:
                case 1351649545:
                    if (!C17202.m40372()) {
                        str9 = strM13530;
                        stackTraceElement7 = stackTraceElement8;
                        i20 = i56;
                        i21 = i58;
                        sArr5 = sArr14;
                        i22 = iM9671;
                        str10 = str16;
                        str11 = str17;
                        i24 = i55;
                        length2 = length2;
                        sArr10 = sArr15;
                        iM2763 = (i50 - C0619.m2761("ۛ۫")) * (-7);
                        i39 = ((iM2763 ^ i51) * (-3873)) ^ 2077489415;
                        i40 = -734335608;
                        i41 = iM2763 ^ i40;
                        stackTraceElement8 = stackTraceElement7;
                        i52 = i39;
                        sArr15 = sArr10;
                        str17 = str11;
                        i55 = i24;
                        length2 = length2;
                        str16 = str10;
                        sArr14 = sArr5;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        i53 = i41;
                        strM13530 = str9;
                    } else {
                        iM2764 = (C0619.m2761("᩵ܿ") + i51) * (-57);
                        i43 = ((iM2764 ^ i50) * 6495) ^ (-540848116);
                        i44 = -1465800388;
                        i53 = iM2764 ^ i44;
                        i52 = i43;
                    }
                    break;
                case -1060706149:
                case 720084646:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    int i84 = i46 + i47;
                    if ((i84 + i84) - i45 < 0) {
                        iM3169 = (C0773.m3169("ۤۗ") ^ i50) * (-95);
                        i52 = ((iM3169 ^ i51) * (-24453)) ^ 1999900217;
                        i = -1157487572;
                    } else {
                        iM3169 = (i51 - C0773.m3169("ۜ᩷")) * 3;
                        i52 = ((iM3169 ^ i50) * (-15265)) ^ 112899429;
                        i = 1501981120;
                    }
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -956460754:
                case 1703351177:
                    str6 = strM13530;
                    str8 = str17;
                    i17 = i55;
                    stackTraceElement3 = stackTraceElement8;
                    i14 = length2;
                    i13 = iM9671;
                    str7 = str16;
                    sArr4 = f19032;
                    i15 = 71;
                    i16 = 11;
                    if (C2834.m9344() >= 0) {
                        int iM31617 = (C0773.m3169("ۛ۟") ^ i50) * (-57);
                        i11 = ((iM31617 ^ i51) * 4153) ^ (-1493488262);
                        i53 = iM31617 ^ (-363300642);
                        i55 = i17;
                        length2 = i14;
                        sArr14 = sArr4;
                        i58 = i16;
                        str17 = str8;
                        i56 = i15;
                        str16 = str7;
                        iM9671 = i13;
                    } else {
                        int iM27612 = C0619.m2761("ۘ᩶") ^ i51;
                        i11 = ((iM27612 ^ i50) * (-7645)) ^ 1331290780;
                        i53 = iM27612 ^ (-638214347);
                        str17 = str8;
                        i55 = i17;
                        length2 = i14;
                        str16 = str7;
                        i56 = 71;
                        i58 = 11;
                        iM9671 = i13;
                        sArr14 = sArr4;
                    }
                    strM13530 = str6;
                    int i85 = i11;
                    stackTraceElement8 = stackTraceElement3;
                    i52 = i85;
                    break;
                case -832027984:
                case 2137996357:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    sArr12 = f19032;
                    if (!C3690.m11987()) {
                        iM3169 = (C0773.m3169("᩺ۖ") + i51) * 53;
                        i52 = ((iM3169 ^ i50) * (-8033)) ^ 766419281;
                        i = 294123085;
                        i12 = iM3169 ^ i;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    } else {
                        sArr15 = sArr15;
                        str17 = str17;
                        int iM31618 = (C0773.m3169("ۚ֫") + i51) * 53;
                        i52 = ((iM31618 ^ i50) * 22563) ^ 480514055;
                        i12 = iM31618 ^ 1003654077;
                        i61 = i61;
                        i60 = i60;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    }
                    break;
                case -829727168:
                case 972587862:
                    c2 = c5;
                    i18 = iM9671;
                    RunnableC3646.m11798(sb, th);
                    C2023.m6955(sb, c2);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    i60 = 0;
                    stackTraceElementArr = stackTrace;
                    length = stackTrace.length;
                    int iM27613 = (C0619.m2761("ܳ۫") + i50) * 69;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i55;
                    i54 = i54;
                    str16 = str16;
                    i56 = i56;
                    i58 = i58;
                    c5 = c2;
                    iM9671 = i18;
                    stackTraceElement8 = stackTraceElement8;
                    i59 = length;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = ((iM27613 ^ i51) * 23579) ^ (-1635532151);
                    i53 = iM27613 ^ 512122240;
                    strM13530 = strM13530;
                    sArr13 = sArr13;
                    break;
                case -645237451:
                case 1473289030:
                    if (C3998.m12920()) {
                        iM2764 = C0773.m3169("֨ۚ") ^ i50;
                        i43 = ((iM2764 ^ i51) * (-32051)) ^ (-11303446);
                        i44 = -71621934;
                    } else {
                        iM2764 = (C0619.m2761("۠᩵") ^ i51) * 91;
                        i43 = ((iM2764 ^ i50) * (-32225)) ^ 1260276837;
                        i44 = 1355523945;
                    }
                    i53 = iM2764 ^ i44;
                    i52 = i43;
                    break;
                case -619364998:
                case 758834927:
                    i57 = 12125;
                    iM3169 = (C0773.m3169("᩸ۡ") + i50) * (-99);
                    i52 = ((iM3169 ^ i51) * 25927) ^ (-954333872);
                    i = 1620595088;
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case -583768164:
                case 1178563794:
                    strM13530 = strM13530;
                    StackTraceElement stackTraceElement14 = stackTraceElement8;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    c5 = c5;
                    sArr13 = sArr13;
                    short[] sArr19 = sArr15;
                    i10 = iM9671;
                    i54 = i54;
                    str16 = str16;
                    i55 = i55;
                    length2 = length2;
                    i48 = i48;
                    i61 = i61;
                    String strM10092 = C3099.m10092(f19032, 54, 4, i57);
                    if (C3734.f12817 < 0) {
                        int iM31619 = (C0773.m3169("ܳܳ") ^ i50) * (-11);
                        sArr13 = sArr13;
                        i61 = i61;
                        sArr15 = sArr19;
                        i48 = i48;
                        i55 = i55;
                        str16 = str16;
                        i58 = i58;
                        str17 = strM10092;
                        iM9671 = i10;
                        i54 = i54;
                        strM13530 = strM13530;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement14;
                        i52 = ((iM31619 ^ i51) * (-30517)) ^ 1566979653;
                        i56 = i56;
                        sArr3 = sArr14;
                        i53 = iM31619 ^ 552086299;
                        length2 = length2;
                        sArr14 = sArr3;
                    } else {
                        stackTraceElement8 = stackTraceElement14;
                        sArr15 = sArr19;
                        str17 = strM10092;
                        iM9671 = i10;
                        int iM316110 = (C0773.m3169("ۚ֫") + i51) * 53;
                        i52 = ((iM316110 ^ i50) * 22563) ^ 480514055;
                        i12 = iM316110 ^ 1003654077;
                        i61 = i61;
                        i60 = i60;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    }
                    break;
                case -515176649:
                case 1478560450:
                    strM13530 = C4238.m13530(f19032, 82, 18, i57);
                    if (C0773.f2792 <= 0) {
                        iM2764 = (C0619.m2761("۠᩵") ^ i51) * 91;
                        i43 = ((iM2764 ^ i50) * (-32225)) ^ 1260276837;
                        i44 = 1355523945;
                    } else {
                        iM2764 = C0619.m2761("ᩴܽ") ^ i50;
                        i43 = ((iM2764 ^ i51) * (-12453)) ^ 2014953629;
                        i44 = 1431683537;
                    }
                    i53 = iM2764 ^ i44;
                    i52 = i43;
                    break;
                case -427649111:
                case 1053214404:
                    C3779.m12264();
                    str9 = strM13530;
                    stackTraceElement7 = stackTraceElement8;
                    i20 = i56;
                    i21 = i58;
                    sArr5 = sArr14;
                    i22 = iM9671;
                    str10 = str16;
                    str11 = str17;
                    i24 = i55;
                    length2 = length2;
                    sArr10 = sArr15;
                    iM2763 = (i50 - C0619.m2761("ۛ۫")) * (-7);
                    i39 = ((iM2763 ^ i51) * (-3873)) ^ 2077489415;
                    i40 = -734335608;
                    i41 = iM2763 ^ i40;
                    stackTraceElement8 = stackTraceElement7;
                    i52 = i39;
                    sArr15 = sArr10;
                    str17 = str11;
                    i55 = i24;
                    length2 = length2;
                    str16 = str10;
                    sArr14 = sArr5;
                    i56 = i20;
                    i58 = i21;
                    iM9671 = i22;
                    i53 = i41;
                    strM13530 = str9;
                    break;
                case 53150604:
                case 211989045:
                    if (C11235.m28309() != 0) {
                        strM13530 = strM13530;
                        i56 = i56;
                        i58 = i58;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i55 = i55;
                        length2 = length2;
                        i59 = i59;
                        i48 = i48;
                        sArr15 = sArr15;
                        i60 = i60;
                        iM9671 = iM9671;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c5 = c5;
                        i61 = i61;
                        i54 = i54;
                        iM3169 = (C0619.m2761("᩹᩷") + i51) * (-51);
                        i52 = ((iM3169 ^ i50) * 17881) ^ 1761859981;
                        i = 1908760504;
                        i12 = iM3169 ^ i;
                        i61 = i61;
                        sArr15 = sArr15;
                        i60 = i60;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    } else {
                        str9 = strM13530;
                        stackTraceElement7 = stackTraceElement8;
                        i20 = i56;
                        i21 = i58;
                        sArr5 = sArr14;
                        i22 = iM9671;
                        str10 = str16;
                        str11 = str17;
                        i24 = i55;
                        length2 = length2;
                        sArr10 = sArr15;
                        iM2763 = (i50 - C0619.m2761("֫ۙ")) * 83;
                        i39 = ((iM2763 ^ i51) * (-12523)) ^ (-619300038);
                        i40 = 2129642102;
                        i41 = iM2763 ^ i40;
                        stackTraceElement8 = stackTraceElement7;
                        i52 = i39;
                        sArr15 = sArr10;
                        str17 = str11;
                        i55 = i24;
                        length2 = length2;
                        str16 = str10;
                        sArr14 = sArr5;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        i53 = i41;
                        strM13530 = str9;
                    }
                    break;
                case 277909496:
                case 1912799783:
                    str9 = strM13530;
                    stackTraceElement7 = stackTraceElement8;
                    i20 = i56;
                    i21 = i58;
                    sArr5 = sArr14;
                    i22 = iM9671;
                    str10 = str16;
                    str11 = str17;
                    i24 = i55;
                    length2 = length2;
                    sArr10 = sArr15;
                    th2 = thArr[i24];
                    sArr13 = f19032;
                    i61 = 58;
                    i48 = 12;
                    if (C3690.f12684 <= 0) {
                        iM2763 = (i50 - C0619.m2761("ۛ۫")) * (-7);
                        i39 = ((iM2763 ^ i51) * (-3873)) ^ 2077489415;
                        i40 = -734335608;
                    } else {
                        iM2763 = (i50 - C0619.m2761("ۙۚ")) * (-79);
                        i39 = ((iM2763 ^ i51) * 15757) ^ 2038672377;
                        i40 = -823427622;
                    }
                    i41 = iM2763 ^ i40;
                    stackTraceElement8 = stackTraceElement7;
                    i52 = i39;
                    sArr15 = sArr10;
                    str17 = str11;
                    i55 = i24;
                    length2 = length2;
                    str16 = str10;
                    sArr14 = sArr5;
                    i56 = i20;
                    i58 = i21;
                    iM9671 = i22;
                    i53 = i41;
                    strM13530 = str9;
                    break;
                case 342341450:
                case 449187885:
                    if (C4282.f15546 > 0) {
                        str9 = strM13530;
                        stackTraceElement7 = stackTraceElement8;
                        i20 = i56;
                        i21 = i58;
                        sArr5 = sArr14;
                        i22 = iM9671;
                        str10 = str16;
                        str11 = str17;
                        i24 = i55;
                        length2 = length2;
                        sArr10 = sArr15;
                        iM2763 = (i50 - C0619.m2761("֫ۙ")) * 83;
                        i39 = ((iM2763 ^ i51) * (-12523)) ^ (-619300038);
                        i40 = 2129642102;
                        i41 = iM2763 ^ i40;
                        stackTraceElement8 = stackTraceElement7;
                        i52 = i39;
                        sArr15 = sArr10;
                        str17 = str11;
                        i55 = i24;
                        length2 = length2;
                        str16 = str10;
                        sArr14 = sArr5;
                        i56 = i20;
                        i58 = i21;
                        iM9671 = i22;
                        i53 = i41;
                        strM13530 = str9;
                    } else {
                        iM2764 = (C0619.m2761("᩵ܿ") + i51) * (-57);
                        i43 = ((iM2764 ^ i50) * 6495) ^ (-540848116);
                        i44 = -1465800388;
                        i53 = iM2764 ^ i44;
                        i52 = i43;
                    }
                    break;
                case 389932608:
                case 1666970959:
                    if (C2485.m8357() <= 0) {
                        iM2764 = (C0619.m2761("᩵ܿ") + i51) * (-57);
                        i43 = ((iM2764 ^ i50) * 6495) ^ (-540848116);
                        i44 = -1465800388;
                    } else {
                        iM2764 = C0773.m3169("֨ۚ") ^ i50;
                        i43 = ((iM2764 ^ i51) * (-32051)) ^ (-11303446);
                        i44 = -71621934;
                    }
                    i53 = iM2764 ^ i44;
                    i52 = i43;
                    break;
                case 434187876:
                case 942518220:
                    m16281(th2, sb, stackTraceElementArr, strM5399, strM8881, setNewSetFromMap);
                    i19 = i55 + 1;
                    length2 = length2;
                    int iM27614 = (i51 - C0619.m2761("ۖ᩵")) * 87;
                    int i86 = ((iM27614 ^ i50) * (-16825)) ^ 662408343;
                    sArr13 = sArr13;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i19;
                    str16 = str16;
                    i56 = i56;
                    i58 = i58;
                    iM9671 = iM9671;
                    strM13530 = strM13530;
                    sArr3 = sArr14;
                    i53 = iM27614 ^ (-369898417);
                    i54 = i54;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i52 = i86;
                    sArr14 = sArr3;
                    break;
                case 580625907:
                case 1144793287:
                    if (C3448.f11240 >= 0) {
                        str6 = strM13530;
                        stackTraceElement3 = stackTraceElement8;
                        sArr4 = sArr14;
                        i13 = iM9671;
                        str7 = str16;
                        i14 = length2;
                        i15 = i56;
                        str8 = str17;
                        i16 = i58;
                        i17 = i55;
                        int iM316111 = (C0773.m3169("ۛ۟") ^ i50) * (-57);
                        i11 = ((iM316111 ^ i51) * 4153) ^ (-1493488262);
                        i53 = iM316111 ^ (-363300642);
                        i55 = i17;
                        length2 = i14;
                        sArr14 = sArr4;
                        i58 = i16;
                        str17 = str8;
                        i56 = i15;
                        str16 = str7;
                        iM9671 = i13;
                        strM13530 = str6;
                        int i87 = i11;
                        stackTraceElement8 = stackTraceElement3;
                        i52 = i87;
                    } else {
                        strM13530 = strM13530;
                        i56 = i56;
                        i58 = i58;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        i55 = i55;
                        length2 = length2;
                        i59 = i59;
                        i48 = i48;
                        i60 = i60;
                        iM9671 = iM9671;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c5 = c5;
                        i61 = i61;
                        i54 = i54;
                        int iM316112 = (C0773.m3169("ۚ֫") + i51) * 53;
                        i52 = ((iM316112 ^ i50) * 22563) ^ 480514055;
                        i12 = iM316112 ^ 1003654077;
                        i61 = i61;
                        i60 = i60;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    }
                    break;
                case 591598777:
                case 1280534186:
                    String str20 = strM13530;
                    StackTraceElement stackTraceElement15 = stackTraceElement8;
                    int i88 = i56;
                    int i89 = i58;
                    short[] sArr20 = sArr14;
                    char c10 = c5;
                    short[] sArr21 = sArr13;
                    int i90 = iM9671;
                    int i91 = i54;
                    String str21 = str16;
                    String str22 = str17;
                    int i92 = i55;
                    length2 = length2;
                    int i93 = i48;
                    int i94 = i61;
                    short[] sArr22 = sArr15;
                    if (i92 < length2) {
                        iM2762 = C0619.m2761("ۙ᩻") ^ i51;
                        i29 = ((iM2762 ^ i50) * (-17919)) ^ (-1926304274);
                        i30 = -1540233284;
                    } else {
                        iM2762 = C0619.m2761("ܽۙ") ^ i50;
                        i29 = ((iM2762 ^ i51) * 8889) ^ (-1065897528);
                        i30 = 1727570116;
                    }
                    int i95 = iM2762 ^ i30;
                    sArr13 = sArr21;
                    i61 = i94;
                    sArr15 = sArr22;
                    i48 = i93;
                    str17 = str22;
                    i55 = i92;
                    str16 = str21;
                    i56 = i88;
                    i58 = i89;
                    iM9671 = i90;
                    strM13530 = str20;
                    sArr3 = sArr20;
                    i53 = i95;
                    i54 = i91;
                    c5 = c10;
                    stackTraceElement8 = stackTraceElement15;
                    i52 = i29;
                    length2 = length2;
                    sArr14 = sArr3;
                    break;
                case 901767267:
                case 1061696250:
                    strM13530 = strM13530;
                    stackTraceElement3 = stackTraceElement8;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    i10 = iM9671;
                    str16 = str16;
                    String str23 = str17;
                    i55 = i55;
                    length2 = length2;
                    i48 = i48;
                    i61 = i61;
                    strM5399 = C1519.m5399(sArr13, i61, i48, i57);
                    sArr15 = f19032;
                    if (!C2966.m9664()) {
                        stackTraceElement8 = stackTraceElement3;
                        str17 = str23;
                        c5 = c5;
                        i54 = i54;
                        iM9671 = i10;
                        int iM316113 = (C0773.m3169("ۚ֫") + i51) * 53;
                        i52 = ((iM316113 ^ i50) * 22563) ^ 480514055;
                        i12 = iM316113 ^ 1003654077;
                        i61 = i61;
                        i60 = i60;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    } else {
                        int iM27615 = (C0619.m2761("֡᩸") + i51) * (-45);
                        i11 = ((iM27615 ^ i50) * (-4623)) ^ 913571742;
                        sArr13 = sArr13;
                        i61 = i61;
                        i48 = i48;
                        i55 = i55;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        i58 = i58;
                        iM9671 = i10;
                        i53 = iM27615 ^ (-964387971);
                        str17 = str23;
                        strM13530 = strM13530;
                        i56 = i56;
                        int i810 = i11;
                        stackTraceElement8 = stackTraceElement3;
                        i52 = i810;
                    }
                    break;
                case 1101650917:
                case 2106909436:
                    if (!C3077.f9998) {
                        strM13530 = strM13530;
                        i56 = i56;
                        i58 = i58;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        i55 = i55;
                        length2 = length2;
                        i59 = i59;
                        i48 = i48;
                        i60 = i60;
                        iM9671 = iM9671;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c5 = c5;
                        i61 = i61;
                        i54 = i54;
                        int iM316114 = (C0773.m3169("ۚ֫") + i51) * 53;
                        i52 = ((iM316114 ^ i50) * 22563) ^ 480514055;
                        i12 = iM316114 ^ 1003654077;
                        i61 = i61;
                        i60 = i60;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM13530 = strM13530;
                        i56 = i56;
                        i53 = i12;
                        iM9671 = iM9671;
                        i54 = i54;
                        i59 = i59;
                        sArr13 = sArr13;
                        c5 = c5;
                        stackTraceElement8 = stackTraceElement8;
                        i48 = i48;
                        i55 = i55;
                        i58 = i58;
                    } else {
                        iM2764 = C0773.m3169("֨ۚ") ^ i50;
                        i43 = ((iM2764 ^ i51) * (-32051)) ^ (-11303446);
                        i44 = -71621934;
                        i53 = iM2764 ^ i44;
                        i52 = i43;
                    }
                    break;
                case 1107314464:
                case 1834647950:
                    stackTraceElement6 = stackTraceElement8;
                    String className = stackTraceElement6.getClassName();
                    iM9671 = C2966.m9671(className);
                    str13 = className;
                    i54 = 0;
                    int iM316115 = C0773.m3169("᩶ܺ") ^ i50;
                    i37 = ((iM316115 ^ i51) * 27611) ^ (-714427857);
                    i42 = iM316115 ^ 1813494166;
                    sArr13 = sArr13;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i55;
                    i56 = i56;
                    i58 = i58;
                    str16 = str13;
                    strM13530 = strM13530;
                    int i612 = i42;
                    stackTraceElement8 = stackTraceElement6;
                    i52 = i37;
                    length2 = length2;
                    sArr14 = sArr14;
                    i53 = i612;
                    break;
                case 1216366324:
                case 2060656488:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    s = sArr12[53];
                    s2 = 14289;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i50 - C0619.m2761("᩵۟")) * 45;
                        i52 = ((iM3169 ^ i51) * (-24645)) ^ (-1472005616);
                        i = -257257195;
                    } else {
                        iM3169 = C0773.m3169("ۡܺ") ^ i51;
                        i52 = ((iM3169 ^ i50) * (-25855)) ^ 41261383;
                        i = -1213142050;
                    }
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case 1228790523:
                case 1531174971:
                    strM13530 = strM13530;
                    i56 = i56;
                    i58 = i58;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i55 = i55;
                    length2 = length2;
                    i59 = i59;
                    i48 = i48;
                    sArr15 = sArr15;
                    i60 = i60;
                    iM9671 = iM9671;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c5 = c5;
                    i61 = i61;
                    i54 = i54;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("᩹᩷") + i51) * (-51);
                        i52 = ((iM3169 ^ i50) * 17881) ^ 1761859981;
                        i = 1908760504;
                    } else {
                        iM3169 = (i50 - C0773.m3169("ᩳܽ")) * (-87);
                        i52 = ((iM3169 ^ i51) * (-12315)) ^ 1787319016;
                        i = -1289699792;
                    }
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
                case 1432524828:
                case 2106155022:
                    m16279(str, C1080.m4058(sb));
                    break;
                case 1778092545:
                case 1884959461:
                    Throwable[] suppressed = th.getSuppressed();
                    length2 = suppressed.length;
                    i19 = 0;
                    thArr = suppressed;
                    int iM27616 = (i51 - C0619.m2761("ۖ᩵")) * 87;
                    int i811 = ((iM27616 ^ i50) * (-16825)) ^ 662408343;
                    sArr13 = sArr13;
                    i61 = i61;
                    sArr15 = sArr15;
                    i48 = i48;
                    str17 = str17;
                    i55 = i19;
                    str16 = str16;
                    i56 = i56;
                    i58 = i58;
                    iM9671 = iM9671;
                    strM13530 = strM13530;
                    sArr3 = sArr14;
                    i53 = iM27616 ^ (-369898417);
                    i54 = i54;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i52 = i811;
                    sArr14 = sArr3;
                    break;
                default:
                    i57 = 45571;
                    iM3169 = (C0773.m3169("᩸ۡ") + i50) * (-99);
                    i52 = ((iM3169 ^ i51) * 25927) ^ (-954333872);
                    i = 1620595088;
                    i12 = iM3169 ^ i;
                    i61 = i61;
                    sArr15 = sArr15;
                    i60 = i60;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM13530 = strM13530;
                    i56 = i56;
                    i53 = i12;
                    iM9671 = iM9671;
                    i54 = i54;
                    i59 = i59;
                    sArr13 = sArr13;
                    c5 = c5;
                    stackTraceElement8 = stackTraceElement8;
                    i48 = i48;
                    i55 = i55;
                    i58 = i58;
                    break;
            }
            return;
        }
    }
}
