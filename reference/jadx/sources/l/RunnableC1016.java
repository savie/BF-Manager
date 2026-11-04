package l;

import android.widget.TextView;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1016 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3680;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f3683;

    public /* synthetic */ RunnableC1016(String str, DialogInterfaceC8327 dialogInterfaceC8327, TextView textView) {
        int i = -2084207529;
        int i2 = RunnableC3055.f9898;
        int i3 = AbstractC3624.f12429;
        this.f3681 = 0;
        int iM2761 = (C0619.m2761("ܳ۫") + i3) * 5;
        int i4 = ((iM2761 ^ i2) * (-803)) ^ (-1683522030);
        int i5 = -2105879748;
        while (true) {
            i = ((((i ^ i2) * (-19983)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2129215694:
                case -102987178:
                    this.f3683 = str;
                    this.f3682 = dialogInterfaceC8327;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4947)) ^ 1156203048;
                        i5 = -289489685;
                    } else {
                        iM2761 = (C0619.m2761("ᩳܶ") ^ i3) * (-57);
                        i4 = ((iM2761 ^ i2) * 5129) ^ (-725930073);
                        i5 = -1084085530;
                    }
                    break;
                case -2070605454:
                case 654374684:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4947)) ^ 1156203048;
                        i5 = -289489685;
                    } else {
                        iM2761 = C0773.m3169("ۡۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29047) ^ 516437017;
                        i5 = -1751475137;
                    }
                    break;
                case -2021082968:
                case -1193495397:
                    if (C3734.f12817 < 0) {
                        iM2761 = C0773.m3169("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4947)) ^ 1156203048;
                        i5 = -289489685;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۛܰ")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-19945)) ^ 161543041;
                        i5 = 1453132303;
                    }
                    break;
                case -1899670636:
                case -609596312:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28859)) ^ 1363596678;
                        i5 = -1736435085;
                    } else {
                        iM2761 = (C0619.m2761("᩹ܽ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-10003)) ^ 590826278;
                        i5 = -667292646;
                    }
                    break;
                case -1466165511:
                case -658080467:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۛܰ")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-19945)) ^ 161543041;
                        i5 = 1453132303;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩺")) * 73;
                        i4 = ((iM2761 ^ i3) * 587) ^ 465821440;
                        i5 = 1930411549;
                    }
                    break;
                case -1340310864:
                case 19412942:
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0619.m2761("᩹ܽ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-10003)) ^ 590826278;
                        i5 = -667292646;
                    } else {
                        iM2761 = C0773.m3169("ۘ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17337)) ^ 2021194244;
                        i5 = 641525281;
                    }
                    break;
                case -1302425997:
                case -1261555585:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("᩹ܽ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-10003)) ^ 590826278;
                        i5 = -667292646;
                    } else {
                        iM2761 = (C0619.m2761("ۖۛ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-30539)) ^ (-384010764);
                        i5 = -1066041589;
                    }
                    break;
                case -1145752168:
                case -65217454:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("᩹ܽ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-10003)) ^ 590826278;
                        i5 = -667292646;
                    } else {
                        iM2761 = C0773.m3169("ۜܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7731) ^ 819938467;
                        i5 = -348906581;
                    }
                    break;
                case -1114845904:
                case 1235625880:
                    if (C1321.f4751 < 0) {
                        iM2761 = C0619.m2761("ᩴ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9131) ^ 1575265376;
                        i5 = 1838642843;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۨ᩸")) * 77;
                        i4 = ((iM2761 ^ i2) * (-11031)) ^ 1962357643;
                        i5 = 202493240;
                    }
                    break;
                case -956455507:
                case -747770446:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4947)) ^ 1156203048;
                        i5 = -289489685;
                    } else {
                        iM2761 = (C0619.m2761("ۢۖ") ^ i2) * (-95);
                        i4 = ((iM2761 ^ i3) * 12343) ^ (-821793192);
                        i5 = -1692477246;
                    }
                    break;
                case -635691702:
                case 374618151:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ᩴ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9131) ^ 1575265376;
                        i5 = 1838642843;
                    } else {
                        iM2761 = C0773.m3169("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4947)) ^ 1156203048;
                        i5 = -289489685;
                    }
                    break;
                case -596153376:
                case 1787824820:
                    if (RunnableC3646.f12471) {
                        iM2761 = (i3 - C0619.m2761("ۛܰ")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-19945)) ^ 161543041;
                        i5 = 1453132303;
                    } else {
                        iM2761 = C0619.m2761("ܶᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4609) ^ (-784438150);
                        i5 = 369152552;
                    }
                    break;
                case -474231758:
                case 957294124:
                    C1826.m6301();
                    throw new RuntimeException();
                case -162678217:
                case 1842419448:
                    this.f3680 = textView;
                    return;
                case 77689321:
                case 928343785:
                    C2354.m7983();
                    iM2761 = (i3 - C0619.m2761("ۛܰ")) * (-119);
                    i4 = ((iM2761 ^ i2) * (-19945)) ^ 161543041;
                    i5 = 1453132303;
                    break;
                default:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("᩹ܽ") + i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-10003)) ^ 590826278;
                        i5 = -667292646;
                    } else {
                        iM2761 = C0619.m2761("ܽܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8253)) ^ 392816566;
                        i5 = -987193346;
                    }
                    break;
            }
        }
    }

    public /* synthetic */ RunnableC1016(C13529 c13529, C2343 c2343, String str) {
        int i = 1975926281;
        int i2 = RunnableC0334.f1808;
        int i3 = C0773.f2792;
        this.f3681 = 1;
        int iM3169 = C0773.m3169("ܰۘ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-483)) ^ 213553702;
        int i5 = -42563041;
        while (true) {
            i = ((((i ^ i2) * o.a.u) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1908553440:
                case -1367468704:
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ۜ۫") + i2) * 13;
                        i4 = ((iM3169 ^ i3) * 10229) ^ 2112246907;
                        i5 = 1672087947;
                    } else {
                        iM3169 = (C0619.m2761("ܶۖ") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 6885) ^ (-869850981);
                        i5 = -1925474537;
                    }
                    break;
                case -1880615138:
                case 1330788206:
                    this.f3682 = c13529;
                    this.f3680 = c2343;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    } else {
                        iM3169 = C0619.m2761("ܽ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16825) ^ 1417727834;
                        i5 = -1361410786;
                    }
                    break;
                case -1793087438:
                case -1362872707:
                    if (C1783.f6087 > 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    } else {
                        iM3169 = (C0773.m3169("᩸۠") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-14841)) ^ (-1397409546);
                        i5 = 1268181458;
                    }
                    break;
                case -1687839597:
                case 791413965:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۫ܰ")) * (-121);
                        i4 = ((iM3169 ^ i2) * (-13197)) ^ (-1797288413);
                        i5 = -23906894;
                    }
                    break;
                case -1569169827:
                case -1419756492:
                    C13473.m33144();
                    iM3169 = (C0773.m3169("᩸۠") + i2) * 77;
                    i4 = ((iM3169 ^ i3) * (-14841)) ^ (-1397409546);
                    i5 = 1268181458;
                    break;
                case -1538805415:
                case 1601707197:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("ܶۖ") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 6885) ^ (-869850981);
                        i5 = -1925474537;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۤ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * 7951) ^ 2067523981;
                        i5 = -2026716078;
                    }
                    break;
                case -924761770:
                case 1861379141:
                    RunnableC0334.m2063();
                    if (C2419.m8174() < 0) {
                        iM3169 = (C0773.m3169("᩸۠") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-14841)) ^ (-1397409546);
                        i5 = 1268181458;
                    } else {
                        iM3169 = (C0619.m2761("ۨۢ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 26983) ^ 149784591;
                        i5 = 661206087;
                    }
                    break;
                case -808026641:
                case 787242674:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("ܶۖ") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 6885) ^ (-869850981);
                        i5 = -1925474537;
                    } else {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * 2793) ^ (-346918987);
                        i5 = 1753327050;
                    }
                    break;
                case -742245133:
                case 1986301215:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ܶۖ") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 6885) ^ (-869850981);
                        i5 = -1925474537;
                    } else {
                        iM3169 = C0619.m2761("۫ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 679) ^ 1380410089;
                        i5 = 1791442751;
                    }
                    break;
                case -647946419:
                case 420663821:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ۗܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22151) ^ (-1942416692);
                        i5 = -1686432783;
                    } else {
                        iM3169 = C0619.m2761("᩷᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8841)) ^ (-362392154);
                        i5 = -1587606854;
                    }
                    break;
                case -356629984:
                case 810035639:
                    C2419.m8174();
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۗܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22151) ^ (-1942416692);
                        i5 = -1686432783;
                    } else {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    }
                    break;
                case -228158449:
                case -189188018:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    } else {
                        iM3169 = C0619.m2761("ۖۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7089)) ^ 1835671053;
                        i5 = -1149047510;
                    }
                    break;
                case 423501118:
                case 889360552:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ܶۖ") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 6885) ^ (-869850981);
                        i5 = -1925474537;
                    } else {
                        iM3169 = C0773.m3169("ܰۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13639) ^ 1121172698;
                        i5 = -93755769;
                    }
                    break;
                case 756190894:
                case 2114421060:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3573) ^ (-821049317);
                        i5 = -637618799;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܶ") ^ i3) * 99;
                        i4 = ((iM3169 ^ i2) * (-9419)) ^ 1850353863;
                        i5 = -1503102033;
                    }
                    break;
                case 1476292929:
                case 1613654873:
                    C0619.m2763();
                    C1519.m5403();
                    throw new RuntimeException();
                default:
                    this.f3683 = str;
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131 A[PHI: r8 r9
      0x0131: PHI (r8v4 l.۬֫ܳ) = (r8v3 l.۬֫ܳ), (r8v1 l.۬֫ܳ) binds: [B:43:0x012f, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r9v4 l.ۖ֫ܳ) = (r9v3 l.ۖ֫ܳ), (r9v1 l.ۖ֫ܳ) binds: [B:43:0x012f, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x026f  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0309 A[PHI: r16
      0x0309: PHI (r16v3 int) = (r16v1 int), (r16v1 int), (r16v1 int), (r16v1 int), (r16v1 int), (r16v5 int) binds: [B:68:0x0252, B:18:0x0056, B:15:0x0050, B:9:0x0042, B:6:0x003d, B:86:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() {
        int iM3169;
        int i;
        int i2;
        RunnableC1016 runnableC1016 = this;
        int i3 = 0;
        String str = null;
        Object obj = null;
        Object obj2 = null;
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        final TextView textView = null;
        C13529 c13529 = null;
        C2343 c2343 = null;
        final String strM52463 = null;
        boolean zM5465 = false;
        int i4 = 930990056;
        int i5 = RunnableC3055.f9898;
        int i6 = C2288.f7433;
        int iM2761 = (i6 - C0619.m2761("᩸ۛ")) * 85;
        int i7 = ((iM2761 ^ i5) * 14469) ^ 1012836331;
        int i8 = iM2761 ^ 1667795133;
        int i9 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 8167) >> 31));
            switch (i4) {
                case -2049116898:
                case 1288868753:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩸ᩳ")) * 15;
                        i = ((iM3169 ^ i6) * (-359)) ^ 927505267;
                        i2 = 1934014420;
                        i3 = i3;
                    }
                    int i10 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i10;
                    break;
                case -1920454557:
                case -1295498403:
                    if (C3998.m12920()) {
                        iM3169 = C0773.m3169("֨ۚ") ^ i5;
                        i = ((iM3169 ^ i6) * (-20065)) ^ 842067797;
                        i2 = -1386559126;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("۠۫") ^ i6;
                        i = ((iM3169 ^ i5) * 21035) ^ (-198286191);
                        i2 = -2077718863;
                        i3 = i3;
                    }
                    int i11 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i11;
                    break;
                case -1835068418:
                case 1912923831:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("᩵۬") ^ i5;
                        i = ((iM3169 ^ i6) * 17079) ^ 1332792013;
                        i2 = -1496490238;
                        i3 = i3;
                    }
                    int i12 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i12;
                    break;
                case -1671770289:
                case 1683583234:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i6 - C0773.m3169("ܽۘ")) * (-119);
                        i = ((iM3169 ^ i5) * 21577) ^ (-1908121681);
                        i2 = -559668276;
                        i3 = i3;
                    } else {
                        iM3169 = (C0619.m2761("ۡۖ") + i5) * 23;
                        i = ((iM3169 ^ i6) * (-29783)) ^ (-582778985);
                        i2 = -919655575;
                        i3 = i3;
                    }
                    int i13 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i13;
                    break;
                case -1593695803:
                case -824630670:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۛۢ") ^ i6;
                        i = ((iM3169 ^ i5) * (-23643)) ^ 976509563;
                        i2 = -550026259;
                        i3 = i3;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩵") ^ i5;
                        i = ((iM3169 ^ i6) * 18089) ^ 1421837910;
                        i2 = -603742569;
                        i3 = i3;
                    }
                    int i14 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i14;
                    break;
                case -1589833902:
                case 360617829:
                    if (C1542.m5465(dialogInterfaceC8327)) {
                        iM3169 = (C0619.m2761("ۤܶ") ^ i5) * (-3);
                        i = ((iM3169 ^ i6) * 15361) ^ (-1649073882);
                        i2 = -158778909;
                        i3 = i3;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۚ᩵")) * (-47);
                        i = ((iM3169 ^ i5) * (-20465)) ^ 1125514078;
                        i2 = -1640810319;
                        i3 = i3;
                    }
                    int i15 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i15;
                    break;
                case -1366905786:
                case 772186829:
                    C2834.m9344();
                    AbstractC0641.m2813();
                    iM3169 = C0773.m3169("ᩳ֡") ^ i6;
                    i = ((iM3169 ^ i5) * 2099) ^ 2109806455;
                    i2 = -1725900843;
                    i3 = i3;
                    int i16 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i16;
                    break;
                case -1236855623:
                case 889242724:
                    if (C13473.m33144()) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i6;
                        i = ((iM3169 ^ i5) * 5613) ^ (-1528573197);
                        i2 = -270862202;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                    }
                    int i17 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i17;
                    break;
                case -1222491107:
                case -1079972968:
                    C2288.m7754(new Runnable() { // from class: l.۬۟֫

                        /* JADX INFO: renamed from: ۤ۟ܶ, reason: not valid java name and contains not printable characters */
                        private static final short[] f43437 = {4908, 28375, -29402, 18099};

                        /* JADX WARN: Code duplicated, block: B:45:0x0161 A[PHI: r9 r12 r16
                          0x0161: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:44:0x015f, B:30:0x00ce, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x0161: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:44:0x015f, B:30:0x00ce, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x0161: PHI (r16v16 int) = (r16v8 int), (r16v12 int), (r16v17 int) binds: [B:44:0x015f, B:30:0x00ce, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:57:0x01e8 A[PHI: r5 r7 r8 r16
                          0x01e8: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:56:0x01e6, B:48:0x0192] A[DONT_GENERATE, DONT_INLINE]
                          0x01e8: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:56:0x01e6, B:48:0x0192] A[DONT_GENERATE, DONT_INLINE]
                          0x01e8: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:56:0x01e6, B:48:0x0192] A[DONT_GENERATE, DONT_INLINE]
                          0x01e8: PHI (r16v6 int) = (r16v4 int), (r16v7 int) binds: [B:56:0x01e6, B:48:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:62:0x021f A[PHI: r4 r11 r16
                          0x021f: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:61:0x021d, B:34:0x00ef, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
                          0x021f: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:61:0x021d, B:34:0x00ef, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
                          0x021f: PHI (r16v19 int) = (r16v3 int), (r16v11 int), (r16v20 int) binds: [B:61:0x021d, B:34:0x00ef, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
                        
                            if (l.C3099.f10023 > 0) goto L8;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 796
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC13693.run():void");
                        }
                    });
                    iM3169 = (i6 - C0773.m3169("ۚ᩵")) * (-47);
                    i = ((iM3169 ^ i5) * (-20465)) ^ 1125514078;
                    i2 = -1640810319;
                    i3 = i3;
                    int i18 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i18;
                    break;
                case -1117405225:
                case 123236058:
                    C1783.m6232();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 2099) ^ 2109806455;
                        i2 = -1725900843;
                        i3 = i3;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ܽۘ")) * (-119);
                        i = ((iM3169 ^ i5) * 21577) ^ (-1908121681);
                        i2 = -559668276;
                        i3 = i3;
                    }
                    int i19 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i19;
                    break;
                case -1048499754:
                case 2145840755:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("۠۫") ^ i6;
                        i = ((iM3169 ^ i5) * 21035) ^ (-198286191);
                        i2 = -2077718863;
                        i3 = i3;
                    } else {
                        iM3169 = (C0773.m3169("᩺۫") ^ i6) * 13;
                        i = ((iM3169 ^ i5) * (-20309)) ^ 381780213;
                        i2 = -887180392;
                        i3 = i3;
                    }
                    int i110 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i110;
                    break;
                case -993634349:
                case -689652630:
                    if (C2288.m7767()) {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 2099) ^ 2109806455;
                        i2 = -1725900843;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("۠۫") ^ i6;
                        i = ((iM3169 ^ i5) * 21035) ^ (-198286191);
                        i2 = -2077718863;
                        i3 = i3;
                    }
                    int i111 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i111;
                    break;
                case -950218049:
                case 2048197578:
                    int i20 = runnableC1016.f3681;
                    if (C13473.f42873 != 0) {
                        i9 = i20;
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                        int i112 = i;
                        i8 = iM3169 ^ i2;
                        i7 = i112;
                    } else {
                        int iM2762 = C0619.m2761("ۧ᩷") ^ i6;
                        int i21 = ((iM2762 ^ i5) * (-249)) ^ (-1792681898);
                        i8 = iM2762 ^ (-1702337311);
                        i9 = i20;
                        i7 = i21;
                        runnableC1016 = this;
                    }
                    break;
                case -769948683:
                case 372594306:
                    c13529 = (C13529) obj2;
                    c2343 = (C2343) obj;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i5 - C0773.m3169("᩸ᩳ")) * 15;
                        i = ((iM3169 ^ i6) * (-359)) ^ 927505267;
                        i2 = 1934014420;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("ۤۤ") ^ i5;
                        i = ((iM3169 ^ i6) * (-26201)) ^ (-1871466450);
                        i2 = -1585918610;
                        i3 = i3;
                    }
                    int i113 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i113;
                    break;
                case -571277245:
                case 1193061874:
                    if (zM5465) {
                        iM3169 = (C0773.m3169("ܰ᩺") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i5) * (-139)) ^ 1739494559;
                        i2 = -1969124898;
                        i3 = i3;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۚ᩵")) * (-47);
                        i = ((iM3169 ^ i5) * (-20465)) ^ 1125514078;
                        i2 = -1640810319;
                        i3 = i3;
                    }
                    int i114 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i114;
                    break;
                case -487236626:
                case 1147698056:
                    strM52463 = C23316.m52463(C1321.m4846(str, new String[i3]));
                    zM5465 = C1542.m5465(dialogInterfaceC8327);
                    iM3169 = (i5 - C0773.m3169("۫ܰ")) * 109;
                    i = ((iM3169 ^ i6) * (-10393)) ^ (-2105652813);
                    i2 = 1879311280;
                    i3 = i3;
                    int i115 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i115;
                    break;
                case -202643663:
                case 1807728969:
                    try {
                        C2702.m8872(new Runnable() { // from class: l.ۜ۟֫
                            {
                                int i22 = -1392235824;
                                int i23 = C0773.f2792;
                                int i24 = C2310.f7472;
                                int iM31610 = (C0773.m3169("ۘۢ") + i24) * (-71);
                                int i25 = ((iM31610 ^ i23) * (-1613)) ^ (-2034063202);
                                int i26 = 197727204;
                                while (true) {
                                    i22 = ((((i22 ^ i23) * 2811) >> 31) & i25) ^ (iM31610 ^ i26);
                                    switch (i22) {
                                        case -2052825933:
                                        case -1892056421:
                                            return;
                                        case -1674901137:
                                        case 362810935:
                                            if (C11235.m28309() != 0) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = C0773.m3169("ۖᩴ") ^ i23;
                                                i25 = ((iM31610 ^ i24) * 4777) ^ 657650040;
                                                i26 = 1344101744;
                                            }
                                            break;
                                        case -1372005917:
                                        case -559612926:
                                            if (C1343.f4799 != 0) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = C0773.m3169("۫֡") ^ i23;
                                                i25 = ((iM31610 ^ i24) * (-20781)) ^ 2026158375;
                                                i26 = 1901313923;
                                            }
                                            break;
                                        case -1336511779:
                                        case 457421460:
                                            if (C3033.m9845() <= 0) {
                                                iM31610 = (i24 - C0773.m3169("ܶۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i25 = ((iM31610 ^ i23) * (-20751)) ^ 929468065;
                                                i26 = 2071122258;
                                            } else {
                                                iM31610 = C0619.m2761("᩶᩺") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-30613)) ^ (-1047447893);
                                                i26 = -894263505;
                                            }
                                            break;
                                        case -819547480:
                                        case -501715717:
                                            if (C0619.f2439) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = (C0619.m2761("֫ܿ") + i24) * (-49);
                                                i25 = ((iM31610 ^ i23) * (-19341)) ^ (-778741025);
                                                i26 = 682957316;
                                            }
                                            break;
                                        case -591697631:
                                        case 579062663:
                                            if (C2966.f9654 >= 0) {
                                                iM31610 = C0619.m2761("֫֨") ^ i24;
                                                i25 = ((iM31610 ^ i23) * 6221) ^ (-1487610864);
                                                i26 = -1278510153;
                                            } else {
                                                iM31610 = (C0619.m2761("ܿ᩺") + i24) * (-69);
                                                i25 = ((iM31610 ^ i23) * (-9123)) ^ 1559953472;
                                                i26 = -1701069122;
                                            }
                                            break;
                                        case -245086072:
                                        case 668178587:
                                            if (C3779.f12953 <= 0) {
                                                iM31610 = C0619.m2761("֫֨") ^ i24;
                                                i25 = ((iM31610 ^ i23) * 6221) ^ (-1487610864);
                                                i26 = -1278510153;
                                            } else {
                                                iM31610 = (i23 - C0619.m2761("۟ۙ")) * (-71);
                                                i25 = ((iM31610 ^ i24) * 31975) ^ 1822752458;
                                                i26 = -1183842292;
                                            }
                                            break;
                                        case -224294540:
                                        case 1483079788:
                                            C11235.m28309();
                                            if (C3998.f13671 == 0) {
                                                iM31610 = (i24 - C0773.m3169("ܶۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i25 = ((iM31610 ^ i23) * (-20751)) ^ 929468065;
                                                i26 = 2071122258;
                                            } else {
                                                iM31610 = C0773.m3169("۫ᩴ") ^ i23;
                                                i25 = ((iM31610 ^ i24) * (-10003)) ^ (-1620170404);
                                                i26 = 1612670063;
                                            }
                                            break;
                                        case -220810410:
                                        case 310504495:
                                            C0487.m2356();
                                            C2354.m7983();
                                            throw new RuntimeException();
                                        case -176361625:
                                        case 1895872112:
                                            if (C3690.f12684 <= 0) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = (i23 - C0773.m3169("۬֡")) * (-69);
                                                i25 = ((iM31610 ^ i24) * (-23509)) ^ 2119470910;
                                                i26 = 13067816;
                                            }
                                            break;
                                        case 29609668:
                                        case 1271989153:
                                            C0487.m2356();
                                            if (C1564.f5401 > 0) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = (i24 - C0773.m3169("ܶۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i25 = ((iM31610 ^ i23) * (-20751)) ^ 929468065;
                                                i26 = 2071122258;
                                            }
                                            break;
                                        case 63773500:
                                        case 318041225:
                                            if (C1783.f6087 <= 0) {
                                                iM31610 = C0773.m3169("᩹ۚ") ^ i23;
                                                i25 = ((iM31610 ^ i24) * (-9279)) ^ (-1732278956);
                                                i26 = 961298569;
                                            } else {
                                                iM31610 = (C0773.m3169("ۨܽ") + i24) * (-91);
                                                i25 = ((iM31610 ^ i23) * (-18565)) ^ 1504500386;
                                                i26 = 781952321;
                                            }
                                            break;
                                        case 171197914:
                                        case 1454836131:
                                            C2419.m8174();
                                            C1343.m4943();
                                            iM31610 = C0773.m3169("۫ᩴ") ^ i23;
                                            i25 = ((iM31610 ^ i24) * (-10003)) ^ (-1620170404);
                                            i26 = 1612670063;
                                            break;
                                        case 478403250:
                                        case 1838995621:
                                            if (C1080.f3865 >= 0) {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            } else {
                                                iM31610 = (i23 - C0773.m3169("۟᩵")) * (-29);
                                                i25 = ((iM31610 ^ i24) * (-23751)) ^ (-622944973);
                                                i26 = -889075823;
                                            }
                                            break;
                                        case 687723847:
                                        case 783526278:
                                            if (C0773.f2792 <= 0) {
                                                iM31610 = (i24 - C0773.m3169("ܶۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i25 = ((iM31610 ^ i23) * (-20751)) ^ 929468065;
                                                i26 = 2071122258;
                                            } else {
                                                iM31610 = C0773.m3169("۟ۖ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-31029)) ^ (-1703866114);
                                                i26 = -236894187;
                                            }
                                            break;
                                        default:
                                            C3077.m10041();
                                            if (C20932.f66974 > 0) {
                                                iM31610 = C0773.m3169("᩹ۚ") ^ i23;
                                                i25 = ((iM31610 ^ i24) * (-9279)) ^ (-1732278956);
                                                i26 = 961298569;
                                            } else {
                                                iM31610 = C0773.m3169("۫ۘ") ^ i24;
                                                i25 = ((iM31610 ^ i23) * (-13499)) ^ 144342761;
                                                i26 = 613637984;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                TextView textView2 = null;
                                int i22 = 1381940451;
                                int i23 = C20932.f66974;
                                int i24 = C0950.f3488;
                                int iM2763 = (C0619.m2761("᩻֫") ^ i23) * (-3);
                                int i25 = ((iM2763 ^ i24) * (-30379)) ^ 706004908;
                                int i26 = -82600192;
                                while (true) {
                                    i22 = ((((i22 ^ i24) * (-7107)) >> 31) & i25) ^ (iM2763 ^ i26);
                                    switch (i22) {
                                        case -2114327396:
                                        case 744775702:
                                            if (C2375.f7641 <= 0) {
                                                iM2763 = (C0773.m3169("ܳۖ") ^ i23) * (-105);
                                                i25 = ((iM2763 ^ i24) * (-11101)) ^ (-1158894553);
                                                i26 = 157111203;
                                            } else {
                                                iM2763 = (i23 - C0773.m3169("ۨ᩶")) * (-101);
                                                i25 = ((iM2763 ^ i24) * 31343) ^ (-1826081456);
                                                i26 = -333513944;
                                            }
                                            break;
                                        case -2071742783:
                                        case -1366753316:
                                            int i27 = ViewOnClickListenerC7793.f25871;
                                            if (C11235.f35427 >= 0) {
                                                iM2763 = (C0773.m3169("ۖۤ") ^ i24) * (-59);
                                                i25 = ((iM2763 ^ i23) * (-16379)) ^ (-1518343922);
                                                i26 = 1870090480;
                                            } else {
                                                iM2763 = C0773.m3169("ۡۢ") ^ i24;
                                                i25 = ((iM2763 ^ i23) * 1481) ^ 231712834;
                                                i26 = 382903953;
                                            }
                                            break;
                                        case -1787406724:
                                        case 754355206:
                                            textView2 = textView;
                                            if (C1564.f5401 <= 0) {
                                                iM2763 = (C0619.m2761("᩷᩵") + i24) * (-45);
                                                i25 = ((iM2763 ^ i23) * 10169) ^ (-1633957081);
                                                i26 = 1590090930;
                                            } else {
                                                iM2763 = (i23 - C0619.m2761("ܰܺ")) * 69;
                                                i25 = ((iM2763 ^ i24) * (-18215)) ^ 1554610724;
                                                i26 = 1087543017;
                                            }
                                            break;
                                        case -1673821200:
                                        case -1179484181:
                                            if (C1321.m4852()) {
                                                iM2763 = C0773.m3169("᩹᩹") ^ i24;
                                                i25 = ((iM2763 ^ i23) * (-15253)) ^ (-335016012);
                                                i26 = -513797652;
                                            } else {
                                                iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                                i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                                i26 = 799965370;
                                            }
                                            break;
                                        case -1643357990:
                                        case -438263126:
                                            if (C3779.f12953 <= 0) {
                                                iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                                i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                                i26 = 799965370;
                                            } else {
                                                iM2763 = (i24 - C0773.m3169("ۜۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i25 = ((iM2763 ^ i23) * 11313) ^ 1712502744;
                                                i26 = 745545153;
                                            }
                                            break;
                                        case -1259413063:
                                        case -936993330:
                                            C23916.m53425(textView2, strM52463);
                                            break;
                                        case -1044920329:
                                        case -711487268:
                                            C20932.m47848();
                                            if (!C3077.f9998) {
                                                iM2763 = (C0773.m3169("ۖۤ") ^ i24) * (-59);
                                                i25 = ((iM2763 ^ i23) * (-16379)) ^ (-1518343922);
                                                i26 = 1870090480;
                                            } else {
                                                iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                                i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                                i26 = 799965370;
                                            }
                                            break;
                                        case -728646806:
                                        case 1938023258:
                                            if (C0487.f2131 <= 0) {
                                                iM2763 = C0619.m2761("ۙ᩶") ^ i24;
                                                i25 = ((iM2763 ^ i23) * (-22739)) ^ (-1046304593);
                                                i26 = 1453113190;
                                            } else {
                                                iM2763 = (C0619.m2761("ۙܿ") ^ i24) * (-83);
                                                i25 = ((iM2763 ^ i23) * 1983) ^ (-1692119917);
                                                i26 = 503733986;
                                            }
                                            break;
                                        case -487354624:
                                        case 496764746:
                                            if (C2702.f8586 <= 0) {
                                                iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                                i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                                i26 = 799965370;
                                            } else {
                                                iM2763 = C0773.m3169("ۖ֨") ^ i23;
                                                i25 = ((iM2763 ^ i24) * (-1997)) ^ (-485825871);
                                                i26 = -819153987;
                                            }
                                            break;
                                        case -242405211:
                                        case 1613387578:
                                            if (C3033.f9831 >= 0) {
                                                iM2763 = C0619.m2761("ۙ᩶") ^ i24;
                                                i25 = ((iM2763 ^ i23) * (-22739)) ^ (-1046304593);
                                                i26 = 1453113190;
                                            } else {
                                                iM2763 = C0773.m3169("ܿۤ") ^ i23;
                                                i25 = ((iM2763 ^ i24) * (-9541)) ^ 2001618751;
                                                i26 = -1225282320;
                                            }
                                            break;
                                        case 3488648:
                                        case 839344524:
                                            C2966.m9664();
                                            if (AbstractC3624.f12429 <= 0) {
                                                iM2763 = (C0773.m3169("ܳۖ") ^ i23) * (-105);
                                                i25 = ((iM2763 ^ i24) * (-11101)) ^ (-1158894553);
                                                i26 = 157111203;
                                            } else {
                                                iM2763 = (C0773.m3169("ۖۤ") ^ i24) * (-59);
                                                i25 = ((iM2763 ^ i23) * (-16379)) ^ (-1518343922);
                                                i26 = 1870090480;
                                            }
                                            break;
                                        case 90351296:
                                        case 2091014912:
                                            C13473.m33144();
                                            break;
                                        case 1181882138:
                                        case 1276769087:
                                            C0487.m2356();
                                            iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                            i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                            i26 = 799965370;
                                            break;
                                        case 1478439868:
                                        case 2065545385:
                                            if (!RunnableC0334.m2063()) {
                                                iM2763 = C0619.m2761("ۙ᩶") ^ i24;
                                                i25 = ((iM2763 ^ i23) * (-22739)) ^ (-1046304593);
                                                i26 = 1453113190;
                                            } else {
                                                iM2763 = (C0773.m3169("ۖۤ") ^ i24) * (-59);
                                                i25 = ((iM2763 ^ i23) * (-16379)) ^ (-1518343922);
                                                i26 = 1870090480;
                                            }
                                            break;
                                        case 1886912279:
                                        case 1984481504:
                                            if (C2419.f7754 >= 0) {
                                                iM2763 = C0773.m3169("ۛ᩺") ^ i23;
                                                i25 = ((iM2763 ^ i24) * 21383) ^ 983114394;
                                                i26 = 799965370;
                                            } else {
                                                iM2763 = (i23 - C0619.m2761("᩵ᩴ")) * (-37);
                                                i25 = ((iM2763 ^ i24) * 24185) ^ (-2008708024);
                                                i26 = 1382719375;
                                            }
                                            break;
                                        default:
                                            if (C4282.f15546 <= 0) {
                                                iM2763 = (C0773.m3169("ܳۖ") ^ i23) * (-105);
                                                i25 = ((iM2763 ^ i24) * (-11101)) ^ (-1158894553);
                                                i26 = 157111203;
                                            } else {
                                                iM2763 = (i24 - C0773.m3169("ۙ᩺")) * 27;
                                                i25 = ((iM2763 ^ i23) * 12559) ^ (-1843662908);
                                                i26 = -2097394925;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM3169 = (i6 - C0773.m3169("ۚ᩵")) * (-47);
                        i = ((iM3169 ^ i5) * (-20465)) ^ 1125514078;
                        i2 = -1640810319;
                        i3 = i3;
                    } catch (IOException unused) {
                        iM3169 = (C0619.m2761("ۜܰ") ^ i6) * (-79);
                        i = ((iM3169 ^ i5) * (-10285)) ^ (-662280336);
                        i2 = 156835563;
                        i3 = i3;
                    }
                    int i116 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i116;
                    break;
                case -119884852:
                case 33378309:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("᩵۬") ^ i5;
                        i = ((iM3169 ^ i6) * 17079) ^ 1332792013;
                        i2 = -1496490238;
                        i3 = i3;
                    } else {
                        iM3169 = C0773.m3169("֡ܺ") ^ i5;
                        i = ((iM3169 ^ i6) * (-13661)) ^ (-1198787987);
                        i2 = -1908067521;
                        i3 = i3;
                    }
                    int i117 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i117;
                    break;
                case -76429050:
                case 274786852:
                    C1542.m5459();
                    C20932.m47848();
                    break;
                case 60359036:
                case 1195804892:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("᩵۬") ^ i5;
                        i = ((iM3169 ^ i6) * 17079) ^ 1332792013;
                        i2 = -1496490238;
                        i3 = i3;
                    } else {
                        iM3169 = (C0773.m3169("ܺܶ") + i6) * 65;
                        i = ((iM3169 ^ i5) * 25991) ^ 858141884;
                        i2 = 1444189468;
                        i3 = i3;
                    }
                    int i118 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i118;
                    break;
                case 302457207:
                case 1831180435:
                    break;
                case 355271436:
                case 1357692813:
                    str = runnableC1016.f3683;
                    obj = runnableC1016.f3680;
                    obj2 = runnableC1016.f3682;
                    switch (i9) {
                        case 0:
                            iM3169 = (i6 - C0773.m3169("۠ۢ")) * (-87);
                            i = ((iM3169 ^ i5) * (-22439)) ^ (-496701662);
                            i2 = -325412295;
                            i3 = i3;
                            break;
                        default:
                            iM3169 = C0773.m3169("۫֨") ^ i6;
                            i = ((iM3169 ^ i5) * 4131) ^ 1197026235;
                            i2 = 1952951746;
                            i3 = i3;
                            break;
                    }
                    int i119 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i119;
                    break;
                case 908038230:
                case 945424892:
                    i3 = 0;
                    i3 = 0;
                    if (C3077.m10041()) {
                        iM3169 = (C0773.m3169("۟᩹") + i5) * 109;
                        i = ((iM3169 ^ i6) * 23625) ^ 1863262481;
                        i2 = -251870403;
                    } else {
                        iM3169 = C0619.m2761("ۢ֡") ^ i5;
                        i = ((iM3169 ^ i6) * (-25643)) ^ (-617820385);
                        i2 = -13554057;
                    }
                    int i1110 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i1110;
                    break;
                case 1264903786:
                case 1491429707:
                    C3100 c3100 = ActivityC3846.f13105;
                    c13529.m33235(c2343, str, i3);
                    break;
                case 1581750555:
                case 1726235673:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("ۛۢ") ^ i6;
                        i = ((iM3169 ^ i5) * (-23643)) ^ 976509563;
                        i2 = -550026259;
                        i3 = i3;
                    }
                    int i1111 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i1111;
                    break;
                case 1617131127:
                case 2059796010:
                    dialogInterfaceC8327 = (DialogInterfaceC8327) obj2;
                    textView = (TextView) obj;
                    int i22 = ViewOnClickListenerC7793.f25871;
                    iM3169 = (i5 - C0773.m3169("᩶֡")) * (-113);
                    i = ((iM3169 ^ i6) * 31699) ^ 983050488;
                    i2 = 1213600921;
                    i3 = i3;
                    int i1112 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i1112;
                    break;
                default:
                    C1343.m4943();
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 2099) ^ 2109806455;
                        i2 = -1725900843;
                        i3 = i3;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-31385)) ^ (-1076340764);
                        i2 = -1004881111;
                        i3 = i3;
                    }
                    int i1113 = i;
                    i8 = iM3169 ^ i2;
                    i7 = i1113;
                    break;
            }
            return;
        }
    }
}
