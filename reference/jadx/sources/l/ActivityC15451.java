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

/* JADX INFO: renamed from: l.ܶ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RQ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC15451 extends ActivityC3330 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ֫ۙܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f50352 = {7217, -8472, -8470, -8475, -8470, -8455, -8462, -8452, -8461, -8466, -8514, -8514, -8518, -8519, -8520, -8526, -8519, -8472, -8515, -8465, -8525, -8517, -8519, -8514, -8526, -8452, -8461, -8466, -8471, -8472, -8520, -8467, -8471, -8471, -8516, -8516, -8513, -8518, -8472, -8518, -8515, -8472, -8466};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static WeakReference f50353;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public IWXAPI f50354;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        int i = -156345413;
        int i2 = C2124.f7782;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 14331) ^ 930461804;
        int i5 = 2011912955;
        while (true) {
            i = ((((i ^ i3) * 14675) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1462539611:
                case 1785107052:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                        i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                        i5 = -1637829165;
                    } else {
                        iM11306 = C19806.m45029("۬۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17341) ^ (-726847509);
                        i5 = -1062855339;
                    }
                    break;
                case -1403316069:
                case 1610079511:
                    setIntent(intent);
                    this.f50354.handleIntent(intent, this);
                    break;
                case -946455530:
                case 239653654:
                    C1398.m4895();
                    iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                    i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                    i5 = -1637829165;
                    break;
                case -591182741:
                case 908810042:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                        i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                        i5 = -1637829165;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨ܰ")) * 57;
                        i4 = ((iM11306 ^ i2) * (-12407)) ^ (-98157145);
                        i5 = 666975506;
                    }
                    break;
                case -518947047:
                case 615531927:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (i2 - C19806.m45029("ܳۚ")) * (-105);
                        i4 = ((iM11306 ^ i3) * (-26411)) ^ (-1335880106);
                        i5 = 66951808;
                    } else {
                        iM11306 = C19806.m45029("ܽۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20281) ^ 1438613300;
                        i5 = 2137818235;
                    }
                    break;
                case -324765738:
                case -283501524:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("᩷۟") + i3) * 73;
                        i4 = ((iM11306 ^ i2) * (-27719)) ^ (-738595860);
                        i5 = 1383140461;
                    } else {
                        iM11306 = C19806.m45029("ܺܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22523) ^ (-872998926);
                        i5 = 1282656942;
                    }
                    break;
                case -227949348:
                case -25150664:
                    C1977.m6356();
                    if (!RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30861) ^ (-1486362385);
                        i5 = 514747534;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                        i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                        i5 = -1637829165;
                    }
                    break;
                case -116802647:
                case 150463799:
                    super.onNewIntent(intent);
                    if (C1189.m4368() <= 0) {
                        iM11306 = (i2 - C19806.m45029("ܳۚ")) * (-105);
                        i4 = ((iM11306 ^ i3) * (-26411)) ^ (-1335880106);
                        i5 = 66951808;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19743) ^ 2144240546;
                        i5 = 1213036674;
                    }
                    break;
                case -91484148:
                case 270658081:
                    if (RunnableC0195.m1431()) {
                        iM11306 = (i2 - C19806.m45029("۬ۡ")) * (-73);
                        i4 = ((iM11306 ^ i3) * (-28925)) ^ (-1993597643);
                        i5 = -1952131529;
                    } else {
                        iM11306 = C19806.m45029("ۖۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30861) ^ (-1486362385);
                        i5 = 514747534;
                    }
                    break;
                case 7351453:
                case 478816257:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17537) ^ 554760503;
                        i5 = 344184345;
                    } else {
                        iM11306 = C19806.m45029("ۖۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30861) ^ (-1486362385);
                        i5 = 514747534;
                    }
                    break;
                case 222411123:
                case 1765093445:
                    C1668.m5583();
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("᩷۟") + i3) * 73;
                        i4 = ((iM11306 ^ i2) * (-27719)) ^ (-738595860);
                        i5 = 1383140461;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                        i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                        i5 = -1637829165;
                    }
                    break;
                case 284399932:
                case 596905366:
                    RunnableC3388.m10064();
                    break;
                case 351304506:
                case 1005104096:
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30861) ^ (-1486362385);
                        i5 = 514747534;
                    } else {
                        iM11306 = (C19806.m45029("֡֫") + i3) * 61;
                        i4 = ((iM11306 ^ i2) * (-21911)) ^ (-2137808946);
                        i5 = -1559963028;
                    }
                    break;
                case 1177592472:
                case 1662556639:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (C19806.m45029("ۢۙ") + i2) * 81;
                        i4 = ((iM11306 ^ i3) * 4897) ^ 634509012;
                        i5 = 535636724;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18651)) ^ 237669983;
                        i5 = -767747257;
                    }
                    break;
                case 1495860227:
                case 1868565010:
                    C2871.m8646();
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ۢۙ") + i2) * 81;
                        i4 = ((iM11306 ^ i3) * 4897) ^ 634509012;
                        i5 = 535636724;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i3) * (-71);
                        i4 = ((iM11306 ^ i2) * 7321) ^ 338382900;
                        i5 = -1637829165;
                    }
                    break;
                default:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("ۢۙ") + i2) * 81;
                        i4 = ((iM11306 ^ i3) * 4897) ^ 634509012;
                        i5 = 535636724;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۖۤ")) * 123;
                        i4 = ((iM11306 ^ i3) * 12921) ^ (-1408451976);
                        i5 = 490132515;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c6 A[PHI: r2 r9
      0x01c6: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:51:0x01c4, B:15:0x0064, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01c4, B:15:0x0064, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0233 A[PHI: r5 r10 r13
      0x0233: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:63:0x0231, B:47:0x01a3, B:31:0x00f6, B:12:0x005f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:63:0x0231, B:47:0x01a3, B:31:0x00f6, B:12:0x005f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:63:0x0231, B:47:0x01a3, B:31:0x00f6, B:12:0x005f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0263 A[PHI: r6 r7 r12 r18
      0x0263: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:67:0x0261, B:59:0x0216, B:35:0x0115, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:67:0x0261, B:59:0x0216, B:35:0x0115, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:67:0x0261, B:59:0x0216, B:35:0x0115, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:67:0x0261, B:59:0x0216, B:35:0x0115, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0291 A[PHI: r8
      0x0291: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:71:0x028f, B:55:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC3330, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        String strM6288;
        int i3 = C3577.f13150;
        int i4 = C1419.f5860;
        int iM45029 = C19806.m45029("᩶ۛ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 16637) ^ 1155755675;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 31624318;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1538966638;
        String str = null;
        String packageName = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 15535) >> 31));
            switch (i12) {
                case -2057359703:
                case 557567498:
                    sArr2 = f50352;
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-11135)) ^ 2011691182;
                        i2 = -658892648;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i4;
                        i = ((iM11306 ^ i3) * (-16945)) ^ (-635975511);
                        i2 = -682818190;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2010920286:
                case -905533559:
                    if (C1419.f5860 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 29717) ^ (-32535111);
                        i2 = -1425554347;
                    } else {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-11135)) ^ 2011691182;
                        i2 = -658892648;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1937413274:
                case -733888991:
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩵ᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6429)) ^ 65009993;
                        i2 = 317572718;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i3;
                        i = ((iM11306 ^ i4) * (-28065)) ^ 550284381;
                        i2 = -707978007;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1793901779:
                case 233312200:
                    s2 = 1427;
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 29717) ^ (-32535111);
                        i2 = -1425554347;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺᩻") ^ i3) * (-89);
                        i = ((iM11306 ^ i4) * (-27305)) ^ (-1682880926);
                        i2 = 1520805851;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1667024244:
                case 1572078517:
                    int i13 = i7 + i8;
                    i9 = i13 + i13;
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM11306 ^ i4) * 4289) ^ (-1496444060);
                        i2 = 1282338126;
                    } else {
                        iM11306 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM11306 ^ i3) * (-1765)) ^ (-110982526);
                        i2 = -666313410;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1413440256:
                case 39068509:
                    i10 = 18172;
                    iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * 23;
                    i = ((iM11306 ^ i4) * (-20601)) ^ 1131121944;
                    i2 = 1214253973;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1307415899:
                case 1676747549:
                    strM6288 = C1937.m6288(f50352, 7, 18, i10);
                    str = strM6288;
                    iM11306 = ThreadFactoryC3888.m11306("ܺ۫") ^ i4;
                    i = ((iM11306 ^ i3) * 24653) ^ 232751193;
                    i2 = -1132557128;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1240156305:
                case 2124884930:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۙ") ^ i4;
                        i = ((iM11306 ^ i3) * (-32719)) ^ 1032253214;
                        i2 = -1767739294;
                    } else {
                        iM11306 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM11306 ^ i4) * 4289) ^ (-1496444060);
                        i2 = 1282338126;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1179035831:
                case 1523284212:
                    i10 = 56971;
                    iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * 23;
                    i = ((iM11306 ^ i4) * (-20601)) ^ 1131121944;
                    i2 = 1214253973;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -892668208:
                case -693930782:
                    C3743.m10966();
                    iM11306 = ThreadFactoryC3888.m11306("ۡۙ") ^ i4;
                    i = ((iM11306 ^ i3) * (-32719)) ^ 1032253214;
                    i2 = -1767739294;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -818542436:
                case 479385668:
                    strM6288 = C1419.m4969(f50352, 25, 18, i10);
                    str = strM6288;
                    iM11306 = ThreadFactoryC3888.m11306("ܺ۫") ^ i4;
                    i = ((iM11306 ^ i3) * 24653) ^ 232751193;
                    i2 = -1132557128;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -147673380:
                case 2021095055:
                    s = sArr[c];
                    i7 = s * s;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-11135)) ^ 2011691182;
                        i2 = -658892648;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-22637)) ^ 2129701811;
                        i2 = -476160094;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 49139828:
                case 1408763494:
                    i11 = 1;
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 29717) ^ (-32535111);
                        i2 = -1425554347;
                    } else {
                        iM11306 = (C19806.m45029("᩸ᩴ") + i4) * 63;
                        i = ((iM11306 ^ i3) * (-4823)) ^ (-823305514);
                        i2 = -640464322;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 91641808:
                case 1631987187:
                    c = 0;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 29717) ^ (-32535111);
                        i2 = -1425554347;
                    } else {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * 21693) ^ 853301433;
                        i2 = -491160633;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 351895000:
                case 909973594:
                    i8 = 2036329;
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("᩵ᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6429)) ^ 65009993;
                        i2 = 317572718;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-32257)) ^ 1286307687;
                        i2 = 107925076;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 384121471:
                case 1124246784:
                    C1025.m3861();
                    C0526.m2437();
                    break;
                case 653117347:
                case 1256296244:
                    if (C2124.m6675(packageName, C0629.m2906(sArr2, i11, 6, i10))) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i3;
                        i = ((iM11306 ^ i4) * 4641) ^ (-759615986);
                        i2 = 1442345456;
                    } else {
                        iM11306 = C19806.m45029("ۛܽ") ^ i3;
                        i = ((iM11306 ^ i4) * 7693) ^ 241740887;
                        i2 = -113460596;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 736506188:
                case 1115156018:
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۙ") ^ i4;
                        i = ((iM11306 ^ i3) * (-32719)) ^ 1032253214;
                        i2 = -1767739294;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 29717) ^ (-32535111);
                        i2 = -1425554347;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1088242843:
                case 1962464101:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ֡") + i4) * (-69);
                        i = ((iM11306 ^ i3) * (-23117)) ^ (-750680021);
                        i2 = -769954296;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۠ۨ")) * 9;
                        i = ((iM11306 ^ i3) * (-12759)) ^ (-1988168796);
                        i2 = -2134066593;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1325622736:
                case 1785796432:
                    sArr = f50352;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-11135)) ^ 2011691182;
                        i2 = -658892648;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۤ") ^ i4) * (-3);
                        i = ((iM11306 ^ i3) * (-31977)) ^ (-1051612559);
                        i2 = 2053124349;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1630513810:
                case 1776182067:
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, str);
                    this.f50354 = iwxapiCreateWXAPI;
                    iwxapiCreateWXAPI.handleIntent(C7105.m18982(this), this);
                    break;
                default:
                    super.onCreate(bundle);
                    packageName = getPackageName();
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM11306 ^ i4) * 4289) ^ (-1496444060);
                        i2 = 1282338126;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜ۟")) * (-91);
                        i = ((iM11306 ^ i4) * (-23733)) ^ (-409543507);
                        i2 = 2080922297;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        WeakReference weakReference = null;
        InterfaceC23212 interfaceC23212 = null;
        int i = 767433414;
        int i2 = C1461.f5957;
        int i3 = RunnableC0195.f1321;
        int iM11306 = ThreadFactoryC3888.m11306("ܺ֡") ^ i3;
        int i4 = ((iM11306 ^ i2) * 20291) ^ 1432105634;
        int i5 = 1591616060;
        while (true) {
            i = ((((i ^ i2) * 30743) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2063853896:
                case -1740958565:
                    f50353 = null;
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨܿ")) * (-51);
                    i4 = ((iM11306 ^ i3) * 24241) ^ (-203355550);
                    i5 = 510553149;
                    break;
                case -2015580858:
                case -1120919406:
                    weakReference = f50353;
                    if (weakReference != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۚ") ^ i3) * (-65);
                        i4 = ((iM11306 ^ i2) * 5025) ^ 103226900;
                        i5 = -898121674;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨܿ")) * (-51);
                        i4 = ((iM11306 ^ i3) * 24241) ^ (-203355550);
                        i5 = 510553149;
                    }
                    break;
                case -1909299163:
                case 1528790069:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i2) * 69;
                        i4 = ((iM11306 ^ i3) * 9577) ^ 539838125;
                        i5 = -361318225;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24709) ^ (-1872631196);
                        i5 = 1690539018;
                    }
                    break;
                case -1680360785:
                case -49606200:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24709) ^ (-1872631196);
                        i5 = 1690539018;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩶") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-4513)) ^ (-187123813);
                        i5 = 1648375629;
                    }
                    break;
                case -1595237319:
                case -602391281:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ֡") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 20437) ^ 2049931602;
                        i5 = -1845557420;
                    } else {
                        iM11306 = C19806.m45029("۬ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24709)) ^ (-1223231570);
                        i5 = -1976371409;
                    }
                    break;
                case -1566660671:
                case -1399845473:
                    interfaceC23212 = (InterfaceC23212) weakReference.get();
                    if (interfaceC23212 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛᩳ") ^ i3) * (-97);
                        i4 = ((iM11306 ^ i2) * 30751) ^ 839038749;
                        i5 = 595097206;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܰ۠")) * 65;
                        i4 = ((iM11306 ^ i3) * 29891) ^ 507064963;
                        i5 = -381599704;
                    }
                    break;
                case -1463925265:
                case 1277137589:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                        i5 = 1523323632;
                    } else {
                        iM11306 = C19806.m45029("ۨ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29181) ^ (-319231879);
                        i5 = 1897644513;
                    }
                    break;
                case -1240978614:
                case 703069200:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۡܺ") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * 26141) ^ (-1831985192);
                        i5 = -329341507;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14845) ^ 696080435;
                        i5 = -2092419426;
                    }
                    break;
                case -954921926:
                case 1964557057:
                    C3660.m10791();
                    RunnableC0195.m1431();
                    iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                    i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                    i5 = 1523323632;
                    break;
                case -816975549:
                case 1349758580:
                    interfaceC23212.onResp(baseResp);
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ܰ۠")) * 65;
                    i4 = ((iM11306 ^ i3) * 29891) ^ 507064963;
                    i5 = -381599704;
                    break;
                case -617754579:
                case 173188478:
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7143) ^ (-1010523265);
                        i5 = 671203665;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27385) ^ (-1567272781);
                        i5 = -272007321;
                    }
                    break;
                case -465142599:
                case 906853468:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7143) ^ (-1010523265);
                        i5 = 671203665;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ֫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-1199)) ^ 1993136164;
                        i5 = 791998146;
                    }
                    break;
                case -455586427:
                case 2117659189:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ۡܺ") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * 26141) ^ (-1831985192);
                        i5 = -329341507;
                    } else {
                        iM11306 = C19806.m45029("ۗۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3019) ^ (-201358432);
                        i5 = -120950650;
                    }
                    break;
                case -348275620:
                case 2054077665:
                    C0278.m1783(this);
                    break;
                case -327104563:
                case 1182203865:
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("ۡܺ") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * 26141) ^ (-1831985192);
                        i5 = -329341507;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                        i5 = 1523323632;
                    }
                    break;
                case 375943546:
                case 435850577:
                    C3535.m10431();
                    if (!C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                        i5 = 1523323632;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7143) ^ (-1010523265);
                        i5 = 671203665;
                    }
                    break;
                case 587920425:
                case 956652011:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                        i5 = 1523323632;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16323) ^ (-2034242818);
                        i5 = -2072101948;
                    }
                    break;
                case 696133506:
                case 1205993611:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ֡") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 20437) ^ 2049931602;
                        i5 = -1845557420;
                    } else {
                        iM11306 = C19806.m45029("ᩳۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22949)) ^ 2072566771;
                        i5 = 604651968;
                    }
                    break;
                case 1787464963:
                case 1975034244:
                    C0817.m3399();
                    C1668.m5583();
                    break;
                default:
                    C0050.m946();
                    if (AbstractC0464.m2313() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24709) ^ (-1872631196);
                        i5 = 1690539018;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * 8529) ^ 1378428112;
                        i5 = 1523323632;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36974(InterfaceC23212 interfaceC23212) {
        f50353 = new WeakReference(interfaceC23212);
    }
}
