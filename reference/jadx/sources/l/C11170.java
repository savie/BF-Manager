package l;

import android.content.Intent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 42S7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11170 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۢۜᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f35167 = {8899, 10979, 11007, 10982, 10996, 11002, 11005, 10970, 10999, 11006, 11004, 10999, 10998, 10981, 10998, 10977, 10976, 11002, 11004, 11005, 10973, 10994, 11006, 10998, 10945, 10998, 10979, 11007, 10994, 10992, 10998, 11006, 10998, 11005, 10983, 10982, 10979, 10999, 10994, 10983, 10998, 10960, 11004, 11005, 10983, 10998, 11005, 10983, 408, 24531, 24460, 24464, 24457, 24475, 24469, 24466, 24531, 24472, 24473, 24458, 24531, 24479, 24468, 24473, 24479, 24471, 24531, 24457, 24460, 24472, 24477, 24456, 24473, 24526, 24457, 24460, 24472, 24477, 24456, 24473, 24511, 24467, 24466, 24456, 24473, 24466, 24456, 24460, 24464, 24457, 24475, 24469, 24466, 24501, 24472, 24460, 24477, 24479, 24471, 24477, 24475, 24473, 24495, 24469, 24454, 24473, 24458, 24473, 24462, 24463, 24469, 24467, 24466, 24511, 24467, 24472, 24473};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18300 f35169;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f35170;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public JSONObject f35171;

    /* JADX WARN: Code duplicated, block: B:108:0x047e A[PHI: r4 r15 r18 r20 r21 r22
      0x047e: PHI (r4v30 short[]) = (r4v4 short[]), (r4v28 short[]), (r4v34 short[]) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r15v41 int) = (r15v16 int), (r15v39 int), (r15v45 int) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r18v36 int) = (r18v12 int), (r18v34 int), (r18v40 int) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r20v34 l.ۢۛ֫) = (r20v10 l.ۢۛ֫), (r20v32 l.ۢۛ֫), (r20v37 l.ۢۛ֫) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r21v26 org.json.JSONObject) = (r21v2 org.json.JSONObject), (r21v24 org.json.JSONObject), (r21v28 org.json.JSONObject) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x047e: PHI (r22v25 java.lang.String) = (r22v2 java.lang.String), (r22v23 java.lang.String), (r22v27 java.lang.String) binds: [B:107:0x047c, B:22:0x0099, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x04ba A[PHI: r4 r5 r7 r9 r10 r15 r18 r20 r21 r22
      0x04ba: PHI (r4v22 short[]) = (r4v3 short[]), (r4v6 short[]), (r4v8 short[]), (r13v1 short[]) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r15v34 int) = (r15v15 int), (r15v18 int), (r15v20 int), (r15v35 int) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r18v26 int) = (r18v11 int), (r18v14 int), (r18v16 int), (r18v27 int) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r20v26 l.ۢۛ֫) = (r20v9 l.ۢۛ֫), (r20v12 l.ۢۛ֫), (r20v14 l.ۢۛ֫), (r2v1 l.ۢۛ֫) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r21v18 org.json.JSONObject) = (r21v1 org.json.JSONObject), (r21v4 org.json.JSONObject), (r21v6 org.json.JSONObject), (r3v1 org.json.JSONObject) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r22v17 java.lang.String) = (r22v1 java.lang.String), (r22v4 java.lang.String), (r22v6 java.lang.String), (r4v1 java.lang.String) binds: [B:111:0x04b8, B:98:0x0404, B:90:0x039f, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if (l.C3690.f12684 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (l.C2287.f7432 >= 0) goto L22;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1136() throws l.C4866 {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11170.mo1136():void");
    }

    public C11170(AbstractActivityC17204 abstractActivityC17204, C18300 c18300, String str) {
        int i = 1593597255;
        int i2 = C3033.f9831;
        int i3 = AbstractC0116.f1064;
        this.f35170 = abstractActivityC17204;
        this.f35169 = c18300;
        this.f35168 = str;
        int iM2761 = C0619.m2761("᩹ۧ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-17811)) ^ (-1414957487);
        int i5 = 1564147896;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i2) * (-20001)) >> 31));
            switch (i) {
                case -1694518149:
                case 1415056393:
                    C23916.m53419();
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("֡᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10181) ^ 1422192139;
                        i5 = -1006187735;
                    } else {
                        iM2761 = C0619.m2761("۠۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14823)) ^ (-1739923912);
                        i5 = -1625071777;
                    }
                    break;
                case -1370979997:
                case 1495713418:
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("ۜܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25773)) ^ (-329440100);
                        i5 = -1772750120;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܳۛ")) * (-33);
                        i4 = ((iM2761 ^ i3) * 32385) ^ (-493363025);
                        i5 = -1390474696;
                    }
                    break;
                case -1072103825:
                case 1761970168:
                    C1146.m4231();
                    C3448.m11248();
                    throw new RuntimeException();
                case -544281984:
                case -242073639:
                    C1146.m4231();
                    C3099.m10095();
                    iM2761 = C0619.m2761("֡᩻") ^ i3;
                    i4 = ((iM2761 ^ i2) * 10181) ^ 1422192139;
                    i5 = -1006187735;
                    break;
                case -104053013:
                case 1895801077:
                    C17202.m40372();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13843)) ^ (-1543447195);
                        i5 = -175362593;
                    } else {
                        iM2761 = C0619.m2761("֡᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10181) ^ 1422192139;
                        i5 = -1006187735;
                    }
                    break;
                case 1987474908:
                case 2039022246:
                    return;
                default:
                    C1321.m4852();
                    if (AbstractC0116.m1243() == 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13843)) ^ (-1543447195);
                        i5 = -175362593;
                    } else {
                        iM2761 = (C0773.m3169("֡᩷") + i3) * (-41);
                        i4 = ((iM2761 ^ i2) * (-27041)) ^ 204144862;
                        i5 = -870934267;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C3779.m12267(this, this.f35170);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014d A[PHI: r8 r11
      0x014d: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:100:0x014d, B:38:0x014b, B:34:0x0127, B:17:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:100:0x014d, B:38:0x014b, B:34:0x0127, B:17:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02fb A[PHI: r6 r7 r16 r17 r18 r19 r20 r25
      0x02fb: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r16v6 short[]) = (r16v4 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r17v6 char) = (r17v4 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r18v6 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r19v6 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r20v3 short[]) = (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v6 short[]) binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r25v25 java.lang.String) = 
      (r25v6 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
      (r25v28 java.lang.String)
     binds: [B:69:0x02d8, B:42:0x0187, B:19:0x00a8, B:17:0x00a4, B:13:0x0085, B:6:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        String strM8350;
        short[] sArr;
        String str;
        int iM31610;
        int i3;
        int i4;
        String str2;
        int iM31611;
        int i5 = C11235.f35427;
        int i6 = C3099.f10023;
        int iM2761 = (i5 - C0619.m2761("ۚۨ")) * 99;
        int i7 = ((iM2761 ^ i6) * 1067) ^ 1903902730;
        String strM1784 = null;
        String strM9670 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i8 = iM2761 ^ 132997716;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 1480119138;
        AbstractActivityC17204 abstractActivityC17204 = null;
        String str3 = null;
        short[] sArr6 = null;
        Intent intent = null;
        JSONObject jSONObject = null;
        String strM13650 = null;
        int i13 = 0;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i6) * 11473) >> 31));
            switch (i12) {
                case -1946004399:
                case 558218164:
                    strM13650 = C4282.m13650(sArr4, 13, 22, i10);
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("᩹ܽ") ^ i6) * (-59);
                        i = ((iM3169 ^ i5) * (-10381)) ^ 1014600630;
                        i2 = -1518023614;
                    } else {
                        iM3169 = (C0619.m2761("֨ۡ") ^ i5) * 41;
                        i = ((iM3169 ^ i6) * (-32023)) ^ 2082579856;
                        i2 = 1066837610;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1856347872:
                case 1579581438:
                    strM1784 = strM1784;
                    if ((s * s2) - ((s * s) + 173343556) > 0) {
                        iM31610 = (i5 - C0773.m3169("֡ۡ")) * (-97);
                        i = ((iM31610 ^ i6) * 30863) ^ 209852929;
                        i3 = 2095271046;
                    } else {
                        iM31610 = C0773.m3169("۠ᩴ") ^ i6;
                        i = ((iM31610 ^ i5) * 24423) ^ (-487116459);
                        i3 = 906331250;
                    }
                    int i14 = iM31610 ^ i3;
                    strM1784 = strM1784;
                    i8 = i14;
                    i7 = i;
                    break;
                case -1708276412:
                case 11313704:
                    C3077.m10041();
                    iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                    i2 = -396599011;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1177421793:
                case -1082926428:
                    C3492.m11491(intent, strM13650, this.f35168);
                    jSONObject = this.f35171;
                    if (jSONObject != null) {
                        iM3169 = C0773.m3169("ۘۗ") ^ i6;
                        i = ((iM3169 ^ i5) * 13129) ^ 142666468;
                        i2 = 1706899366;
                    } else {
                        iM3169 = (C0773.m3169("۟۟") + i5) * 33;
                        i = ((iM3169 ^ i6) * 18505) ^ (-506313840);
                        i2 = 1408506520;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1129255124:
                case 888326654:
                    RunnableC1848.m6363(abstractActivityC17204, intent);
                    break;
                case -892835834:
                case 1096543120:
                    strM1784 = strM1784;
                    sArr6 = f35167;
                    c = 0;
                    if (C3099.f10023 > 0) {
                        iM31610 = C0773.m3169("ۗ᩺") ^ i5;
                        i = ((iM31610 ^ i6) * 4925) ^ (-1497355164);
                        i3 = 1335569214;
                        int i15 = iM31610 ^ i3;
                        strM1784 = strM1784;
                        i8 = i15;
                        i7 = i;
                    }
                    strM1784 = strM1784;
                    iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                    i2 = -396599011;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -714566674:
                case 1039079391:
                    sArr5 = f35167;
                    i9 = 35;
                    i11 = 13;
                    if (AbstractC0641.m2813() > 0) {
                        iM3169 = (C0773.m3169("᩹᩸") ^ i6) * (-97);
                        i = ((iM3169 ^ i5) * (-26019)) ^ 1035258173;
                        i2 = -590839414;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        strM8350 = str3;
                        sArr = sArr2;
                        str = strM1784;
                        iM31611 = C0773.m3169("֡ܰ") ^ i5;
                        str2 = strM8350;
                        i7 = ((iM31611 ^ i6) * 24741) ^ (-2072313801);
                        i4 = -1046126616;
                        int i16 = iM31611 ^ i4;
                        strM1784 = str;
                        i8 = i16;
                        String str4 = str2;
                        sArr2 = sArr;
                        str3 = str4;
                    }
                    break;
                case -704261706:
                case 259163574:
                    strM1784 = strM1784;
                    abstractActivityC17204 = this.f35170;
                    intent = new Intent(abstractActivityC17204, (Class<?>) ViewOnClickListenerC13408.class);
                    if (C1783.f6087 <= 0) {
                        iM31610 = (C0619.m2761("ܶۙ") ^ i6) * (-77);
                        i = ((iM31610 ^ i5) * (-1695)) ^ 1367496212;
                        i3 = 540200408;
                    } else {
                        iM31610 = (C0773.m3169("ᩳ᩸") ^ i6) * 23;
                        i = ((iM31610 ^ i5) * (-16993)) ^ 279945958;
                        i3 = 1719380020;
                    }
                    int i17 = iM31610 ^ i3;
                    strM1784 = strM1784;
                    i8 = i17;
                    i7 = i;
                    break;
                case -634536041:
                case 1438822541:
                    C2419.m8169(intent, C3492.m11486(sArr5, i9, i11, i10), C1080.m4058(jSONObject));
                    iM3169 = (C0773.m3169("۟۟") + i5) * 33;
                    i = ((iM3169 ^ i6) * 18505) ^ (-506313840);
                    i2 = 1408506520;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -579209495:
                case 626899904:
                    strM1784 = strM1784;
                    s = sArr6[c];
                    s2 = 26332;
                    if (C2702.f8586 > 0) {
                        iM31610 = C0619.m2761("ۜۘ") ^ i6;
                        i = ((iM31610 ^ i5) * 21949) ^ (-716337496);
                        i3 = -922205990;
                        int i18 = iM31610 ^ i3;
                        strM1784 = strM1784;
                        i8 = i18;
                        i7 = i;
                    }
                    strM1784 = strM1784;
                    iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                    i2 = -396599011;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -563324124:
                case 2044353682:
                    intent.putExtra(strM9670, i13);
                    sArr4 = f35167;
                    if (C3492.m11488()) {
                        iM3169 = (C0619.m2761("ۗ۟") ^ i6) * (-99);
                        i = ((iM3169 ^ i5) * 21499) ^ 1642145459;
                        i2 = -109523262;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܽ") ^ i6) * (-59);
                        i = ((iM3169 ^ i5) * (-10381)) ^ 1014600630;
                        i2 = -1518023614;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -448824791:
                case 210622554:
                    String str5 = strM1784;
                    C2419.m8169(intent, str3, str5);
                    sArr3 = f35167;
                    if (C23916.f77426 <= 0) {
                        strM1784 = str5;
                        iM31610 = (C0619.m2761("ܶۙ") ^ i6) * (-77);
                        i = ((iM31610 ^ i5) * (-1695)) ^ 1367496212;
                        i3 = 540200408;
                        int i19 = iM31610 ^ i3;
                        strM1784 = strM1784;
                        i8 = i19;
                        i7 = i;
                    } else {
                        int iM31612 = C0773.m3169("ۧ᩻") ^ i6;
                        i7 = ((iM31612 ^ i5) * 23737) ^ (-178274716);
                        strM1784 = str5;
                        i8 = iM31612 ^ 826408705;
                    }
                    break;
                case 70731399:
                case 1345947615:
                    str = strM1784;
                    sArr = sArr2;
                    strM8350 = C2485.m8350(sArr, 1, 8, i10);
                    if (C3998.f13671 != 0) {
                        iM31611 = C0773.m3169("֡ܰ") ^ i5;
                        str2 = strM8350;
                        i7 = ((iM31611 ^ i6) * 24741) ^ (-2072313801);
                        i4 = -1046126616;
                    } else {
                        iM31611 = (C0619.m2761("֫ۡ") ^ i5) * (-11);
                        str2 = strM8350;
                        i7 = ((iM31611 ^ i6) * (-11883)) ^ 12510703;
                        i4 = 1434139267;
                    }
                    int i110 = iM31611 ^ i4;
                    strM1784 = str;
                    i8 = i110;
                    String str6 = str2;
                    sArr2 = sArr;
                    str3 = str6;
                    break;
                case 89376181:
                case 1397217555:
                    if (C20932.f66974 > 0) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                        i2 = -396599011;
                    } else {
                        iM3169 = C0619.m2761("ܳ۫") ^ i5;
                        i = ((iM3169 ^ i6) * (-31507)) ^ 972750402;
                        i2 = -819409986;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 611060234:
                case 1156491677:
                    i10 = 10198;
                    iM31610 = C0619.m2761("᩶ܰ") ^ i5;
                    i = ((iM31610 ^ i6) * (-1189)) ^ 1397665208;
                    i3 = -1651274344;
                    int i111 = iM31610 ^ i3;
                    strM1784 = strM1784;
                    i8 = i111;
                    i7 = i;
                    break;
                case 683542326:
                case 1048324944:
                    C2023.m6964();
                    break;
                case 700876466:
                case 1573527282:
                    C1783.m6232();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                        i2 = -396599011;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܽ") ^ i6) * (-59);
                        i = ((iM3169 ^ i5) * (-10381)) ^ 1014600630;
                        i2 = -1518023614;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 1306910648:
                case 1333756615:
                    C1542.m5459();
                    if (!C3492.m11488()) {
                        iM3169 = (C0773.m3169("᩹ܽ") ^ i6) * (-59);
                        i = ((iM3169 ^ i5) * (-10381)) ^ 1014600630;
                        i2 = -1518023614;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        strM8350 = str3;
                        sArr = sArr2;
                        str = strM1784;
                        iM31611 = C0773.m3169("֡ܰ") ^ i5;
                        str2 = strM8350;
                        i7 = ((iM31611 ^ i6) * 24741) ^ (-2072313801);
                        i4 = -1046126616;
                        int i112 = iM31611 ^ i4;
                        strM1784 = str;
                        i8 = i112;
                        String str7 = str2;
                        sArr2 = sArr;
                        str3 = str7;
                    }
                    break;
                case 1381833569:
                case 1762915827:
                    strM9670 = C2966.m9670(sArr3, 9, 4, i10);
                    i13 = 1;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                        i2 = -396599011;
                    } else {
                        iM3169 = C0773.m3169("ܰ۟") ^ i5;
                        i = ((iM3169 ^ i6) * 24713) ^ 792766803;
                        i2 = -348616087;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 1739833375:
                case 1851232608:
                    i10 = 10899;
                    iM31610 = C0619.m2761("᩶ܰ") ^ i5;
                    i = ((iM31610 ^ i6) * (-1189)) ^ 1397665208;
                    i3 = -1651274344;
                    int i113 = iM31610 ^ i3;
                    strM1784 = strM1784;
                    i8 = i113;
                    i7 = i;
                    break;
                default:
                    strM1784 = C0269.m1784(this.f35169);
                    sArr2 = f35167;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i6) * (-29317)) ^ (-43127569);
                        i2 = -396599011;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩻") ^ i6;
                        i = ((iM3169 ^ i5) * 645) ^ (-99660799);
                        i2 = 1550142486;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int i = 179468646;
        int i2 = C0773.f2792;
        int i3 = C11235.f35427;
        int iM3169 = C0773.m3169("۠֨") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-17577)) ^ (-397725546);
        int i5 = -808025809;
        while (true) {
            i = ((((i ^ i2) * 12763) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2083787800:
                case -1817775656:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16511)) ^ (-1819723391);
                        i5 = 467239052;
                    } else {
                        iM3169 = C0619.m2761("᩷۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2325) ^ (-1956452690);
                        i5 = -1275194398;
                    }
                    break;
                case -2045803169:
                case 1756075623:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0619.m2761("֨֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5659) ^ 405079494;
                        i5 = -1086257638;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۠ۖ")) * 69;
                        i4 = ((iM3169 ^ i3) * (-16015)) ^ 1366493730;
                        i5 = 1014791294;
                    }
                    break;
                case -1992593771:
                case 1714907556:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21047) ^ 1366294542;
                        i5 = -1031998369;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩻") ^ i3) * 33;
                        i4 = ((iM3169 ^ i2) * 23491) ^ (-1601868524);
                        i5 = 868209823;
                    }
                    break;
                case -1917854040:
                case -592516947:
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0773.m3169("᩻۫") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 2335) ^ (-734017855);
                        i5 = 1204954790;
                    } else {
                        iM3169 = C0619.m2761("֨֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5659) ^ 405079494;
                        i5 = -1086257638;
                    }
                    break;
                case -1570443723:
                case 1172918245:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21047) ^ 1366294542;
                        i5 = -1031998369;
                    } else {
                        iM3169 = C0773.m3169("᩶۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9083)) ^ 576174765;
                        i5 = 42137920;
                    }
                    break;
                case -1327334173:
                case -814820811:
                    RunnableC3646.m11813();
                    if (C23916.m53419() == 0) {
                        iM3169 = (C0773.m3169("᩵᩻") ^ i3) * 33;
                        i4 = ((iM3169 ^ i2) * 23491) ^ (-1601868524);
                        i5 = 868209823;
                    } else {
                        iM3169 = (C0773.m3169("᩻۫") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 2335) ^ (-734017855);
                        i5 = 1204954790;
                    }
                    break;
                case -1315597031:
                case 632671370:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("᩻۫") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 2335) ^ (-734017855);
                        i5 = 1204954790;
                    } else {
                        iM3169 = C0773.m3169("۠ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20799) ^ (-1202447349);
                        i5 = -246069063;
                    }
                    break;
                case -1258306390:
                case 1710195856:
                    C13473.m33144();
                    iM3169 = C0619.m2761("֨֡") ^ i2;
                    i4 = ((iM3169 ^ i3) * 5659) ^ 405079494;
                    i5 = -1086257638;
                    break;
                case -1092357408:
                case -840971702:
                    C2966.m9664();
                    break;
                case -1026560901:
                case 1217735745:
                    C22673.m51160(C1783.m6243(exc));
                    break;
                case -947655467:
                case -896119430:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("֨֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5659) ^ 405079494;
                        i5 = -1086257638;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") ^ i3) * (-5);
                        i4 = ((iM3169 ^ i2) * 5231) ^ (-1459337963);
                        i5 = -1878767766;
                    }
                    break;
                case -917364273:
                case -535908174:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16511)) ^ (-1819723391);
                        i5 = 467239052;
                    } else {
                        iM3169 = C0619.m2761("֫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 591) ^ (-656275053);
                        i5 = 814094161;
                    }
                    break;
                case -670613439:
                case 665858904:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16511)) ^ (-1819723391);
                        i5 = 467239052;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 83;
                        i4 = ((iM3169 ^ i3) * 16869) ^ 1480179552;
                        i5 = -496329587;
                    }
                    break;
                case -468644603:
                case 1881127647:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16511)) ^ (-1819723391);
                        i5 = 467239052;
                    } else {
                        iM3169 = (C0619.m2761("ۢ᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-11611)) ^ 2125382107;
                        i5 = 1911369257;
                    }
                    break;
                case 172865775:
                case 839021599:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("᩻۫") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 2335) ^ (-734017855);
                        i5 = 1204954790;
                    } else {
                        iM3169 = C0773.m3169("۠۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16137)) ^ 1533801574;
                        i5 = 1538313883;
                    }
                    break;
                case 555686883:
                case 1326962821:
                    if (exc instanceof C4866) {
                        iM3169 = (C0619.m2761("᩺֫") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * 14959) ^ (-1463524468);
                        i5 = 1392481727;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۛᩴ")) * (-109);
                        i4 = ((iM3169 ^ i2) * (-28299)) ^ (-337201810);
                        i5 = 676516964;
                    }
                    break;
                case 1073092419:
                case 1581723941:
                    AbstractC0641.m2814(this.f35170, exc, null);
                    break;
                default:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ۙۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11589)) ^ (-1598454716);
                        i5 = 1084020631;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩻") ^ i3) * 33;
                        i4 = ((iM3169 ^ i2) * 23491) ^ (-1601868524);
                        i5 = 868209823;
                    }
                    break;
            }
            return;
        }
    }
}
