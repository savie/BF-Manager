package l;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* JADX INFO: renamed from: l.ۧۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RQ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11550 extends ActivityC8896 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ۟ܽܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f36317 = {9356, -18146, -18148, -18157, -18148, -18161, -18172, -18166, -18171, -18152, -18104, -18104, -18100, -18097, -18098, -18108, -18097, -18146, -18101, -18151, -18107, -18099, -18097, -18104, -18108, -18166, -18171, -18152, -18145, -18146, -18098, -18149, -18145, -18145, -18102, -18102, -18103, -18100, -18146, -18100, -18101, -18146, -18152};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static WeakReference f36318;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IWXAPI f36319;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b6 A[PHI: r10
      0x01b6: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:50:0x01b4, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241 A[PHI: r5
      0x0241: PHI (r5v4 char) = (r5v3 char), (r5v2 char) binds: [B:63:0x023f, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x026f A[PHI: r8 r12 r18
      0x026f: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v5 int) binds: [B:67:0x026d, B:35:0x0117, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:67:0x026d, B:35:0x0117, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:67:0x026d, B:35:0x0117, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x029e A[PHI: r2 r6 r7 r9 r13
      0x029e: PHI (r2v5 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v4 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:71:0x029c, B:59:0x0221, B:54:0x01ea, B:39:0x013b, B:31:0x00fa, B:15:0x0064, B:12:0x0059, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:71:0x029c, B:59:0x0221, B:54:0x01ea, B:39:0x013b, B:31:0x00fa, B:15:0x0064, B:12:0x0059, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:71:0x029c, B:59:0x0221, B:54:0x01ea, B:39:0x013b, B:31:0x00fa, B:15:0x0064, B:12:0x0059, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:71:0x029c, B:59:0x0221, B:54:0x01ea, B:39:0x013b, B:31:0x00fa, B:15:0x0064, B:12:0x0059, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:71:0x029c, B:59:0x0221, B:54:0x01ea, B:39:0x013b, B:31:0x00fa, B:15:0x0064, B:12:0x0059, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC8896, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM2761;
        int i;
        int i2;
        String strM4939;
        int i3 = C1080.f3865;
        int i4 = C1542.f5343;
        int iM3169 = C0773.m3169("ܺ᩹") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-13907)) ^ 591817530;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-1578223859);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1883826416;
        String str = null;
        String packageName = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 427) >> 31));
            switch (i12) {
                case -2075436117:
                case -544403327:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ۛ۫") ^ i4;
                        i = ((iM2761 ^ i3) * 27773) ^ 1882812384;
                        i2 = 1637659851;
                    } else {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2064381589:
                case -1776273861:
                    s = sArr[c];
                    i7 = s * s;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۙ") ^ i4) * 87;
                        i = ((iM2761 ^ i3) * (-24653)) ^ (-2049896951);
                        i2 = 466527331;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1740530301:
                case -863746421:
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, str);
                    this.f36319 = iwxapiCreateWXAPI;
                    iwxapiCreateWXAPI.handleIntent(C2485.m8359(this), this);
                    break;
                case -1605849097:
                case 2016569677:
                    strM4939 = C1343.m4939(f36317, 25, 18, i10);
                    str = strM4939;
                    iM2761 = (C0773.m3169("ܿ֨") ^ i3) * (-43);
                    i = ((iM2761 ^ i4) * (-16671)) ^ (-2056897615);
                    i2 = -1115567754;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1549625504:
                case -1070516870:
                    if (C3448.m11238(packageName, AbstractC3624.m11769(sArr2, i11, 6, i10))) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 8339) ^ 288643973;
                        i2 = 827541376;
                    } else {
                        iM2761 = C0619.m2761("ܺܽ") ^ i4;
                        i = ((iM2761 ^ i3) * 12099) ^ (-784844333);
                        i2 = -1528839815;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1454595952:
                case -306256362:
                    strM4939 = C1343.m4939(f36317, 7, 18, i10);
                    str = strM4939;
                    iM2761 = (C0773.m3169("ܿ֨") ^ i3) * (-43);
                    i = ((iM2761 ^ i4) * (-16671)) ^ (-2056897615);
                    i2 = -1115567754;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1167599063:
                case 2077636438:
                    C2310.m7813();
                    break;
                case -281018413:
                case 979645646:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) >= 0) {
                        iM2761 = C0619.m2761("ܳۜ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11389)) ^ 1263261714;
                        i2 = 255179226;
                    } else {
                        iM2761 = (C0773.m3169("᩷᩹") + i4) * (-67);
                        i = ((iM2761 ^ i3) * (-31645)) ^ 1183352440;
                        i2 = 847143243;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -255187054:
                case 595556828:
                    s2 = 6569;
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("ۛ۫") ^ i4;
                        i = ((iM2761 ^ i3) * 27773) ^ 1882812384;
                        i2 = 1637659851;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܶ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i4) * 28679) ^ (-1862205110);
                        i2 = -1904055341;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -118264291:
                case 1357923359:
                    i10 = 32367;
                    iM2761 = (i3 - C0773.m3169("۫۬")) * 49;
                    i = ((iM2761 ^ i4) * 8575) ^ (-1352201425);
                    i2 = -402272563;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -96785544:
                case 2028182154:
                    C0269.m1775();
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = C0619.m2761("ۡ۬") ^ i3;
                        i = ((iM2761 ^ i4) * 23743) ^ 1408180526;
                        i2 = 1627476202;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 260802306:
                case 1713502576:
                    sArr2 = f36317;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۤ᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 14659) ^ (-2045595885);
                        i2 = -852857968;
                    } else {
                        iM2761 = C0619.m2761("֡ۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 25151) ^ (-1039326242);
                        i2 = 989138862;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 376015898:
                case 882430640:
                    super.onCreate(bundle);
                    packageName = getPackageName();
                    if (C23916.m53419() != 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩸᩵")) * 15;
                        i = ((iM2761 ^ i4) * (-9393)) ^ (-227100011);
                        i2 = -716770873;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 449248740:
                case 1939110612:
                    i11 = 1;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = C0619.m2761("᩶ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 13015) ^ (-394959965);
                        i2 = 458512569;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 605957045:
                case 1633522568:
                    sArr = f36317;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ۤ᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 14659) ^ (-2045595885);
                        i2 = -852857968;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۧۤ")) * 89;
                        i = ((iM2761 ^ i3) * (-30941)) ^ 63274539;
                        i2 = -415648060;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 687714199:
                case 983310483:
                    if (C3734.f12817 < 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i3;
                        i = ((iM2761 ^ i4) * 10645) ^ (-1414511576);
                        i2 = 559784102;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 760770675:
                case 1397786526:
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = C0773.m3169("ۛ۠") ^ i4;
                        i = ((iM2761 ^ i3) * 25457) ^ (-1685333665);
                        i2 = 1780376213;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1179951103:
                case 1743120394:
                    i10 = 47485;
                    iM2761 = (i3 - C0773.m3169("۫۬")) * 49;
                    i = ((iM2761 ^ i4) * 8575) ^ (-1352201425);
                    i2 = -402272563;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1332133375:
                case 2055773082:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 18447) ^ (-1389976804);
                        i2 = 854866474;
                    } else {
                        iM2761 = (C0619.m2761("ۗۛ") + i3) * 29;
                        i = ((iM2761 ^ i4) * (-25875)) ^ 799873101;
                        i2 = -22114391;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1704374451:
                case 2033782821:
                    c = 0;
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("֨۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-19107)) ^ (-415500265);
                        i2 = 1296488164;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i3;
                        i = ((iM2761 ^ i4) * 10645) ^ (-1414511576);
                        i2 = 559784102;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1884960942:
                case 2073370554:
                    AbstractC0116.m1243();
                    C3779.m12264();
                    iM2761 = C0619.m2761("ۡ۬") ^ i3;
                    i = ((iM2761 ^ i4) * 23743) ^ 1408180526;
                    i2 = 1627476202;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = 43151761;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ۤ᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 14659) ^ (-2045595885);
                        i2 = -852857968;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܶ᩸")) * 59;
                        i = ((iM2761 ^ i4) * (-675)) ^ 1281498203;
                        i2 = -1022562660;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        int i = 1961149440;
        int i2 = RunnableC3055.f9898;
        int i3 = C3448.f11240;
        int iM2761 = C0619.m2761("ۡܰ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-463)) ^ (-53205634);
        int i5 = -1946101898;
        while (true) {
            i = ((((i ^ i3) * (-29521)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2068686278:
                case -622849290:
                    setIntent(intent);
                    this.f36319.handleIntent(intent, this);
                    break;
                case -1945352800:
                case 1950157549:
                    if (!C2878.f9462) {
                        iM2761 = (C0773.m3169("᩷ۢ") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 31599) ^ (-121364770);
                        i5 = -882372851;
                    } else {
                        iM2761 = C0773.m3169("ܳܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7095) ^ (-759360237);
                        i5 = 2107218121;
                    }
                    break;
                case -1752856274:
                case -239327158:
                    C13473.m33144();
                    RunnableC0334.m2063();
                    iM2761 = (C0619.m2761("ۨۖ") + i3) * (-97);
                    i4 = ((iM2761 ^ i2) * 30389) ^ (-567814688);
                    i5 = 28716010;
                    break;
                case -1415858578:
                case -99752698:
                    C0862.m3503();
                    C0862.m3503();
                    break;
                case -1392104050:
                case -1294950294:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (C0773.m3169("᩷ۢ") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 31599) ^ (-121364770);
                        i5 = -882372851;
                    } else {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23641) ^ (-59018340);
                        i5 = 984189898;
                    }
                    break;
                case -1307925625:
                case 1399280659:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ܳܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7095) ^ (-759360237);
                        i5 = 2107218121;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩸ۜ")) * 93;
                        i4 = ((iM2761 ^ i2) * 31409) ^ 1097098235;
                        i5 = -1921265677;
                    }
                    break;
                case -1047322482:
                case -116636458:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۨۖ") + i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 30389) ^ (-567814688);
                        i5 = 28716010;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۙ") + i2) * (-47);
                        i4 = ((iM2761 ^ i3) * 22635) ^ (-2101669728);
                        i5 = -1458509340;
                    }
                    break;
                case -1022498983:
                case -607879540:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴᩳ")) * (-9);
                        i4 = ((iM2761 ^ i3) * (-28257)) ^ (-84569023);
                        i5 = -812558089;
                    } else {
                        iM2761 = C0773.m3169("۟۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * DilithiumEngine.DilithiumRootOfUnity) ^ 444687626;
                        i5 = 1514390733;
                    }
                    break;
                case -822152390:
                case -756872183:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0619.m2761("ۨۖ") + i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 30389) ^ (-567814688);
                        i5 = 28716010;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡۘ")) * (-79);
                        i4 = ((iM2761 ^ i3) * 10531) ^ (-906818172);
                        i5 = 39742980;
                    }
                    break;
                case -675030578:
                case 176707108:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ܳܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7095) ^ (-759360237);
                        i5 = 2107218121;
                    } else {
                        iM2761 = (C0619.m2761("ۨۖ") + i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 30389) ^ (-567814688);
                        i5 = 28716010;
                    }
                    break;
                case -659607828:
                case -320390391:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("᩷ۢ") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 31599) ^ (-121364770);
                        i5 = -882372851;
                    } else {
                        iM2761 = C0619.m2761("ۜᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19719) ^ 966444108;
                        i5 = -389222135;
                    }
                    break;
                case -369704369:
                case 47245717:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ۨۖ") + i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 30389) ^ (-567814688);
                        i5 = 28716010;
                    } else {
                        iM2761 = C0619.m2761("᩷ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16891) ^ 924435797;
                        i5 = -380372944;
                    }
                    break;
                case -193907610:
                case -193185547:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0773.m3169("᩷ۢ") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 31599) ^ (-121364770);
                        i5 = -882372851;
                    } else {
                        iM2761 = (C0619.m2761("ۤᩳ") + i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-32589)) ^ (-1549329653);
                        i5 = -1576222229;
                    }
                    break;
                case 18448138:
                case 190870037:
                    super.onNewIntent(intent);
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("᩻ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26063) ^ 727935288;
                        i5 = -1669859054;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۧ᩶")) * 85;
                        i4 = ((iM2761 ^ i3) * (-7279)) ^ 2083483395;
                        i5 = 1073480643;
                    }
                    break;
                case 1576763998:
                case 1713175709:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("᩷ۢ") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 31599) ^ (-121364770);
                        i5 = -882372851;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩶") + i2) * 7;
                        i4 = ((iM2761 ^ i3) * (-22883)) ^ (-149688483);
                        i5 = -1834113291;
                    }
                    break;
                default:
                    if (C1783.f6087 > 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴᩳ")) * (-9);
                        i4 = ((iM2761 ^ i3) * (-28257)) ^ (-84569023);
                        i5 = -812558089;
                    } else {
                        iM2761 = C0773.m3169("ܳܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7095) ^ (-759360237);
                        i5 = 2107218121;
                    }
                    break;
            }
            return;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        WeakReference weakReference = null;
        InterfaceC1856 interfaceC1856 = null;
        int i = -2110441558;
        int i2 = C0950.f3488;
        int i3 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("ۘ᩷") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-13443)) ^ (-317044262);
        int i5 = -314171115;
        while (true) {
            i = ((((i ^ i3) * (-4963)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2051581002:
                case -227692444:
                    interfaceC1856 = (InterfaceC1856) weakReference.get();
                    if (interfaceC1856 != null) {
                        iM3169 = C0619.m2761("ܽܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20449) ^ (-1835837034);
                        i5 = -2074689377;
                    } else {
                        iM3169 = C0619.m2761("᩺֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2217)) ^ 171250577;
                        i5 = 1402296056;
                    }
                    break;
                case -1681893030:
                case 858726473:
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0773.m3169("ۖܶ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 29145) ^ 1079092120;
                        i5 = 605763508;
                    } else {
                        iM3169 = (C0619.m2761("ۜᩳ") + i3) * (-81);
                        i4 = ((iM3169 ^ i2) * 25799) ^ (-546175467);
                        i5 = -1807246059;
                    }
                    break;
                case -1624733433:
                case 1584436146:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ۖܶ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 29145) ^ 1079092120;
                        i5 = 605763508;
                    } else {
                        iM3169 = C0773.m3169("ܽܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28969) ^ 1004765825;
                        i5 = 1545736459;
                    }
                    break;
                case -1586673803:
                case 2072824361:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ۜᩳ") + i3) * (-81);
                        i4 = ((iM3169 ^ i2) * 25799) ^ (-546175467);
                        i5 = -1807246059;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                        i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                        i5 = 772443213;
                    }
                    break;
                case -1548035184:
                case -222363978:
                    C1080.m4050();
                    if (C4238.m13540() > 0) {
                        iM3169 = C0619.m2761("ܶ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31693) ^ (-1036775668);
                        i5 = 811665301;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                        i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                        i5 = 772443213;
                    }
                    break;
                case -1215943688:
                case 1105529636:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                        i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                        i5 = 772443213;
                    } else {
                        iM3169 = C0773.m3169("ܽۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-77)) ^ (-1878177193);
                        i5 = 1457603090;
                    }
                    break;
                case -1205382726:
                case 1844372442:
                    C1783.m6232();
                    iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                    i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                    i5 = 772443213;
                    break;
                case -1043713158:
                case -913193877:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۖܶ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 29145) ^ 1079092120;
                        i5 = 605763508;
                    } else {
                        iM3169 = C0773.m3169("᩸᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9635)) ^ (-257603661);
                        i5 = 826945202;
                    }
                    break;
                case -994182477:
                case -606770443:
                    f36318 = null;
                    iM3169 = (i2 - C0619.m2761("᩷ᩴ")) * (-7);
                    i4 = ((iM3169 ^ i3) * 22707) ^ 492859729;
                    i5 = -1207191261;
                    break;
                case -944531998:
                case 1710077428:
                    C4238.m13537(this);
                    break;
                case -809825082:
                case 488099461:
                    interfaceC1856.onResp(baseResp);
                    iM3169 = C0619.m2761("᩺֡") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-2217)) ^ 171250577;
                    i5 = 1402296056;
                    break;
                case -748091762:
                case -396577684:
                    weakReference = f36318;
                    if (weakReference != null) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18545)) ^ (-1367019616);
                        i5 = -1182782170;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩷ᩴ")) * (-7);
                        i4 = ((iM3169 ^ i3) * 22707) ^ 492859729;
                        i5 = -1207191261;
                    }
                    break;
                case -435707239:
                case 91355981:
                    C0773.m3161();
                    break;
                case -151191397:
                case 289243481:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                        i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                        i5 = 772443213;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩸᩺")) * 13;
                        i4 = ((iM3169 ^ i3) * 23201) ^ (-1841394339);
                        i5 = -210039152;
                    }
                    break;
                case -142325606:
                case -56754300:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܳ")) * (-81);
                        i4 = ((iM3169 ^ i3) * 7397) ^ 1003569510;
                        i5 = 772443213;
                    } else {
                        iM3169 = (C0619.m2761("۬ۘ") + i3) * (-123);
                        i4 = ((iM3169 ^ i2) * (-14727)) ^ 282212560;
                        i5 = -1784933801;
                    }
                    break;
                case -748659:
                case 639424337:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (C0773.m3169("ۛۢ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * 23267) ^ 1534223458;
                        i5 = -1075067650;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۙ") + i2) * (-75);
                        i4 = ((iM3169 ^ i3) * 25269) ^ 2055200204;
                        i5 = -189939138;
                    }
                    break;
                case 721003881:
                case 2053986726:
                    if (C13473.m33144()) {
                        iM3169 = (C0619.m2761("֡ܳ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-25547)) ^ 881970100;
                        i5 = -1431736395;
                    } else {
                        iM3169 = (C0773.m3169("ۛۢ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * 23267) ^ 1534223458;
                        i5 = -1075067650;
                    }
                    break;
                case 842099676:
                case 1065822483:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("ܶ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31693) ^ (-1036775668);
                        i5 = 811665301;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32515) ^ (-122671446);
                        i5 = 1807127410;
                    }
                    break;
                case 1541026553:
                case 2057587323:
                    if (C13473.m33144()) {
                        iM3169 = C0773.m3169("ۡ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22341)) ^ 354923305;
                        i5 = 1953164653;
                    } else {
                        iM3169 = (C0773.m3169("ۖܶ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 29145) ^ 1079092120;
                        i5 = 605763508;
                    }
                    break;
                default:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("ۛۢ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * 23267) ^ 1534223458;
                        i5 = -1075067650;
                    } else {
                        iM3169 = C0619.m2761("ۨܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4039)) ^ (-116013685);
                        i5 = -1548664079;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29054(InterfaceC1856 interfaceC1856) {
        f36318 = new WeakReference(interfaceC1856);
    }
}
