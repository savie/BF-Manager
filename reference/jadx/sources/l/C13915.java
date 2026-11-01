package l;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13915 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ᩷ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f45835 = {1160, -26308, 20418, 17295, 21836, 21843, -30417, 7144, 3839, 30386, 30398, 30389, 30388, 30390, 30388, 30373, 30338, 30373, 30371, 30392, 30399, 30390, 30457, 30463, 30463, 30463, 30456};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13209 f45836;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45837;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45838;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45839;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f45840;

    /* JADX WARN: Code duplicated, block: B:40:0x0140 A[PHI: r3
      0x0140: PHI (r3v4 l.ۖᩴ᩺) = (r3v3 l.ۖᩴ᩺), (r3v2 l.ۖᩴ᩺), (r3v2 l.ۖᩴ᩺), (r3v2 l.ۖᩴ᩺), (r3v2 l.ۖᩴ᩺) binds: [B:39:0x013e, B:14:0x0076, B:12:0x0072, B:9:0x0067, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0203 A[PHI: r12
      0x0203: PHI (r12v5 short) = (r12v3 short), (r12v2 short) binds: [B:54:0x0201, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025a A[PHI: r9 r10 r18
      0x025a: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:62:0x0258, B:23:0x00b0, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:62:0x0258, B:23:0x00b0, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:62:0x0258, B:23:0x00b0, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x028f A[PHI: r5 r8 r17 r23
      0x028f: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:66:0x028d, B:58:0x0237, B:27:0x00d6, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:66:0x028d, B:58:0x0237, B:27:0x00d6, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:66:0x028d, B:58:0x0237, B:27:0x00d6, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:66:0x028d, B:58:0x0237, B:27:0x00d6, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02c1 A[PHI: r4 r7 r14 r15 r16
      0x02c1: PHI (r4v4 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v3 org.json.JSONObject), (r4v2 org.json.JSONObject) binds: [B:70:0x02bf, B:35:0x0119, B:31:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:70:0x02bf, B:35:0x0119, B:31:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:70:0x02bf, B:35:0x0119, B:31:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:70:0x02bf, B:35:0x0119, B:31:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02bf, B:35:0x0119, B:31:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1977.f7413;
        int i4 = AbstractC0464.f2088;
        int iM450210 = (C19806.m45029("᩷ᩴ") + i4) * (-95);
        int i5 = ((iM450210 ^ i3) * (-16343)) ^ 643311136;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-337279868);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        short s3 = 0;
        int i11 = -727296260;
        int i12 = 0;
        short[] sArr3 = null;
        String str = null;
        String strM5479 = null;
        JSONObject jSONObjectM6501 = null;
        C2724 c2724M4222 = null;
        String str2 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 12621) >> 31));
            switch (i11) {
                case -1872851162:
                case -163078642:
                    i9 = 30417;
                    iM45029 = (C19806.m45029("ۚ֨") + i4) * (-7);
                    i = ((iM45029 ^ i3) * 16721) ^ 1491780192;
                    i2 = 589744513;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1852443895:
                case -1642491719:
                    c2724M4222 = C1148.m4222(4372);
                    RunnableC1564.m5349(c2724M4222, str2);
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩷") + i4) * 55;
                        i = ((iM45029 ^ i3) * 15289) ^ (-1141823626);
                        i2 = 90875541;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۡ")) * (-39);
                        i = ((iM45029 ^ i4) * 12453) ^ (-785044809);
                        i2 = -1293511958;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1817122851:
                case -1482041315:
                    s = sArr3[c];
                    s3 = 3270;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۖ")) * 29;
                        i = ((iM45029 ^ i4) * 23043) ^ 429276781;
                        i2 = 362716440;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۬") + i4) * (-105);
                        i = ((iM45029 ^ i3) * 18155) ^ (-1542753775);
                        i2 = -403903122;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1400144127:
                case 249064157:
                    C1937.m6286(strM5479, AbstractC0464.m2308(sArr2, i8, 14, i9));
                    str = strM5479;
                    iM45029 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-7859)) ^ (-297777510);
                    i2 = -352675438;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1354219757:
                case 1025694259:
                    C1668.m5583();
                    C2871.m8646();
                    iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩷") + i4) * 55;
                    i = ((iM45029 ^ i3) * 15289) ^ (-1141823626);
                    i2 = 90875541;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1298612181:
                case -861264408:
                    this.f45840 = str;
                    break;
                case -1235104244:
                case 463735221:
                    str2 = this.f45839;
                    if (C1977.m6360(str2) == 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ܽ")) * (-113);
                        i = ((iM45029 ^ i4) * (-4503)) ^ (-1493738253);
                        i2 = -1223230598;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩶") ^ i4;
                        i = ((iM45029 ^ i3) * 16471) ^ (-1918506565);
                        i2 = -906523168;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1058196545:
                case 523008026:
                    CallableC1627.m5507();
                    if (C0629.m2907()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩷") + i4) * 55;
                        i = ((iM45029 ^ i3) * 15289) ^ (-1141823626);
                        i2 = 90875541;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۖ")) * 29;
                        i = ((iM45029 ^ i4) * 23043) ^ 429276781;
                        i2 = 362716440;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -657882979:
                case -21915507:
                    i9 = 34366;
                    iM45029 = (C19806.m45029("ۚ֨") + i4) * (-7);
                    i = ((iM45029 ^ i3) * 16721) ^ 1491780192;
                    i2 = 589744513;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -641318912:
                case 813311776:
                    sArr3 = f45835;
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") ^ i3) * (-11);
                        i = ((iM45029 ^ i4) * 24645) ^ (-470111905);
                        i2 = 967514686;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 18605) ^ (-1028395615);
                        i2 = -1423124656;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -167702875:
                case 1677202041:
                    if (i12 - (s * s2) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9063)) ^ (-1087894405);
                        i2 = -1397434359;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") ^ i4) * 71;
                        i = ((iM45029 ^ i3) * 21037) ^ 375781099;
                        i2 = 1967752229;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -125725112:
                case 1713273199:
                    RunnableC0195.m1431();
                    RunnableC0195.m1431();
                    break;
                case -114705830:
                case 101797778:
                    c = '\b';
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ۚ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 11341) ^ 559986223;
                        i2 = 1196299564;
                    } else {
                        iM45029 = C19806.m45029("ۢܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 18165) ^ 1456207799;
                        i2 = -875393950;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -80971875:
                case 1123268414:
                    i8 = 13;
                    if (C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۖ")) * 29;
                        i = ((iM45029 ^ i4) * 23043) ^ 429276781;
                        i2 = 362716440;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30483)) ^ 346229045;
                        i2 = -24258485;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 16603420:
                case 492857381:
                    strM5479 = RunnableC1606.m5479(jSONObjectM6501, RunnableC1564.m5344(sArr, i10, i7, i9));
                    sArr2 = f45835;
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۚ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 11341) ^ 559986223;
                        i2 = 1196299564;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i4;
                        i = ((iM45029 ^ i3) * (-15939)) ^ (-1302825121);
                        i2 = -1555170379;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 446372798:
                case 2078548427:
                    str = "";
                    iM45029 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-7859)) ^ (-297777510);
                    i2 = -352675438;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 493208014:
                case 861906425:
                    sArr = f45835;
                    i10 = 9;
                    i7 = 4;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") ^ i3) * (-11);
                        i = ((iM45029 ^ i4) * 24645) ^ (-470111905);
                        i2 = 967514686;
                    } else {
                        iM45029 = (C19806.m45029("ܳ᩺") + i3) * (-121);
                        i = ((iM45029 ^ i4) * 20111) ^ 173571887;
                        i2 = 975164849;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 725816970:
                case 1899874905:
                    s2 = 13080;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۨۖ")) * 75;
                        i = ((iM45029 ^ i4) * 7691) ^ 1900451335;
                        i2 = 977711553;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۚ") ^ i3;
                        i = ((iM45029 ^ i4) * (-5463)) ^ 2049159573;
                        i2 = 838685951;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 860192886:
                case 1251101510:
                    jSONObjectM6501 = C2018.m6501(c2724M4222);
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") ^ i3) * (-11);
                        i = ((iM45029 ^ i4) * 24645) ^ (-470111905);
                        i2 = 967514686;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩶") ^ i4;
                        i = ((iM45029 ^ i3) * 14169) ^ (-976362832);
                        i2 = 1158122645;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1081011970:
                case 1766504218:
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩷") + i4) * 55;
                        i = ((iM45029 ^ i3) * 15289) ^ (-1141823626);
                        i2 = 90875541;
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 11341) ^ 559986223;
                        i2 = 1196299564;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1505989379:
                case 2021133809:
                    int i13 = s + s3;
                    i12 = i13 * i13;
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ۚ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 11341) ^ 559986223;
                        i2 = 1196299564;
                    } else {
                        iM45029 = (C19806.m45029("ۖ۠") ^ i3) * 65;
                        i = ((iM45029 ^ i4) * 16177) ^ (-2123596726);
                        i2 = -1570058089;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0216.m1591();
                    if (C1460.m5050() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩷") + i4) * 55;
                        i = ((iM45029 ^ i3) * 15289) ^ (-1141823626);
                        i2 = 90875541;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۨۖ")) * 75;
                        i = ((iM45029 ^ i4) * 7691) ^ 1900451335;
                        i2 = 977711553;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e0 A[PHI: r8 r9 r14
      0x00e0: PHI (r8v4 android.widget.TextView) = (r8v2 android.widget.TextView), (r8v8 android.widget.TextView) binds: [B:9:0x0084, B:26:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:9:0x0084, B:26:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r14v4 java.lang.StringBuilder) = (r14v2 java.lang.StringBuilder), (r14v10 java.lang.StringBuilder) binds: [B:9:0x0084, B:26:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0117 A[PHI: r12 r13
      0x0117: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:30:0x0115, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:30:0x0115, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x030d A[PHI: r6 r16 r17 r18 r19 r20
      0x030d: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r16v4 short) = (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:75:0x030b, B:71:0x02e8, B:46:0x01c2, B:17:0x009c, B:15:0x0098, B:9:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0345 A[PHI: r10 r26 r27
      0x0345: PHI (r10v5 int) = (r10v2 int), (r10v4 int), (r10v2 int), (r10v2 int) binds: [B:79:0x0343, B:54:0x0225, B:15:0x0098, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0345: PHI (r26v5 short[]) = (r26v4 short[]), (r26v3 short[]), (r26v3 short[]), (r26v3 short[]) binds: [B:79:0x0343, B:54:0x0225, B:15:0x0098, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0345: PHI (r27v3 char) = (r27v2 char), (r27v1 char), (r27v1 char), (r27v1 char) binds: [B:79:0x0343, B:54:0x0225, B:15:0x0098, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM45029;
        int i;
        int i2;
        int i3 = C1148.f5161;
        int i4 = C3660.f13403;
        int iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 17627) ^ 407268585;
        String strM10415 = null;
        String strM6685 = null;
        short[] sArr = null;
        int i6 = iM11306 ^ 695375934;
        int i7 = 0;
        int iM11307 = 0;
        int iM450210 = 0;
        int i8 = 0;
        StringBuilder sb = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 48099499;
        char c = 0;
        TextView textView = null;
        String strM18991 = null;
        View viewM7083 = null;
        ViewOnClickListenerC13209 viewOnClickListenerC13209 = null;
        Object obj = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 28621) >> 31));
            switch (i12) {
                case -2067383598:
                case 1352580357:
                    strM6685 = C2124.m6685(f45835, 4, 3, i7);
                    if (C2332.m7079() > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۨ")) * (-87);
                        i = ((iM45029 ^ i4) * 14209) ^ 1227075956;
                        i2 = 2105107699;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ܰۛ") ^ i4;
                        i6 = iM11308 ^ (-1496046853);
                        i5 = ((iM11308 ^ i3) * 27803) ^ (-317654954);
                        sb = null;
                    }
                    break;
                case -1904658028:
                case 1918283784:
                    C0817.m3399();
                    if (C2249.f8050 < 0) {
                        iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                        i2 = 1641891309;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16807)) ^ (-512735155);
                        i2 = -1223526733;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1820549138:
                case -41258045:
                    if (AbstractC0464.m2315(this.f45839, strM18991.toUpperCase(Locale.ROOT))) {
                        iM45029 = C19806.m45029("۠ۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-19609)) ^ (-1395768338);
                        i2 = -953137219;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢ᩷")) * 27;
                        i = ((iM45029 ^ i4) * (-4661)) ^ (-11303532);
                        i2 = 898096665;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1593658215:
                case 693825119:
                    C2788.m8480(sb, strM10415);
                    C1461.m5083(textView, C0817.m3407(sb));
                    RunnableC1895.m6165(textView, 0);
                    break;
                case -1573021055:
                case -1317890364:
                    break;
                case -1528611521:
                case 1732615530:
                    if (m33756()) {
                        iM45029 = C19806.m45029("ۘۚ") ^ i3;
                        i = ((iM45029 ^ i4) * 3927) ^ 216246095;
                        i2 = -910033587;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩷") + i4) * 101;
                        i = ((iM45029 ^ i3) * (-9307)) ^ (-405608943);
                        i2 = 2049443746;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1234011224:
                case 611807117:
                    boolean z = exc instanceof C4987;
                    obj = null;
                    viewOnClickListenerC13209 = this.f45836;
                    if (z) {
                        iM45029 = C19806.m45029("ۚᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * 13013) ^ (-427575280);
                        i2 = 750923473;
                    } else {
                        iM45029 = C19806.m45029("ܰۢ") ^ i4;
                        i = ((iM45029 ^ i3) * (-27915)) ^ 2099591190;
                        i2 = -822767887;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1092853123:
                case -679479336:
                    sArr = f45835;
                    c = 0;
                    if (C1148.m4232() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16807)) ^ (-512735155);
                        i2 = -1223526733;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩷") ^ i3;
                        i = ((iM45029 ^ i4) * 23335) ^ 1693263438;
                        i2 = -1169934931;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1009068582:
                case -511830021:
                    viewM7083 = C2332.m7083(viewOnClickListenerC13209, 2130693925 ^ iM11307);
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("᩸ۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 28377) ^ 1649935705;
                        i2 = -458861318;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ܰۛ") ^ i4;
                        i6 = iM11309 ^ (-1496046853);
                        i5 = ((iM11309 ^ i3) * 27803) ^ (-317654954);
                        sb = null;
                    }
                    break;
                case -973630921:
                case 2054429302:
                    s = sArr[c];
                    i9 = s * s;
                    i10 = 13564489;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                        i2 = 1641891309;
                    } else {
                        iM45029 = (C19806.m45029("ܳۜ") + i4) * 51;
                        i = ((iM45029 ^ i3) * (-16197)) ^ 5481206;
                        i2 = 1648571087;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -930994836:
                case 1436370667:
                    int i13 = i9 + i10;
                    i11 = i13 + i13;
                    s2 = 3683;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                        i2 = 1641891309;
                    } else {
                        iM45029 = (C19806.m45029("ۗ۬") + i3) * (-93);
                        i = ((iM45029 ^ i4) * (-12897)) ^ (-343724688);
                        i2 = 802277873;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -707384812:
                case 1930120915:
                    strM18991 = C7105.m18991(C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864((EditText) viewM7083)));
                    if (C0671.m3008() >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                        i2 = 1641891309;
                    } else {
                        iM45029 = C19806.m45029("۫᩷") ^ i3;
                        i = ((iM45029 ^ i4) * 14999) ^ (-171908523);
                        i2 = -2110136632;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -636215728:
                case 830137875:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                        i2 = 1641891309;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-29535)) ^ 990227351;
                        i2 = -872801811;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -416163725:
                case 587730244:
                    iM450210 = C19806.m45029(strM6685);
                    i8 = 2117824999;
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܰ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 24941) ^ (-139211100);
                        i2 = -238386737;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-6635)) ^ (-851588227);
                        i2 = 787901608;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -309256291:
                case 1549067146:
                    C2642.m8171();
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("ܰ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 24941) ^ (-139211100);
                        i2 = -238386737;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16807)) ^ (-512735155);
                        i2 = -1223526733;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 84426919:
                case 392299832:
                    C3722.m10894();
                    RunnableC0195.m1431();
                    break;
                case 537936492:
                case 1152423746:
                    i7 = 7138;
                    iM45029 = C19806.m45029("ۖ᩻") ^ i4;
                    i = ((iM45029 ^ i3) * 25731) ^ (-1747723114);
                    i2 = -253013428;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 549416079:
                case 634364385:
                    C10634.m26820();
                    C2332.m7079();
                    iM45029 = (i3 - C19806.m45029("᩹᩺")) * 87;
                    i = ((iM45029 ^ i4) * (-30043)) ^ 967333458;
                    i2 = 1641891309;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 929759676:
                case 1112950271:
                    C0671.m3019(viewOnClickListenerC13209, exc, obj);
                    break;
                case 1223851032:
                case 1499154944:
                    C0671.m3019(viewOnClickListenerC13209, exc, obj);
                    break;
                case 1363574670:
                case 1696617658:
                    textView = (TextView) RunnableC0195.m1436(viewOnClickListenerC13209, iM450210 ^ i8);
                    short[] sArr2 = f45835;
                    if (C0671.f2816 == 0) {
                        sb = new StringBuilder(C1189.m4365(sArr2, 7, 1, i7));
                        strM10415 = C3535.m10415(exc);
                        if (C3577.m10565()) {
                            iM45029 = C19806.m45029("ۖ֨") ^ i4;
                            i = ((iM45029 ^ i3) * (-2599)) ^ (-211820032);
                            i2 = 917261384;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i4;
                            i = ((iM45029 ^ i3) * (-29535)) ^ 990227351;
                            i2 = -872801811;
                        }
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM113010 = ThreadFactoryC3888.m11306("ܰۛ") ^ i4;
                        i6 = iM113010 ^ (-1496046853);
                        i5 = ((iM113010 ^ i3) * 27803) ^ (-317654954);
                        sb = null;
                    }
                    break;
                case 1388665642:
                case 1399954924:
                    iM11307 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(f45835, 1, 3, i7));
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16807)) ^ (-512735155);
                        i2 = -1223526733;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۘ") ^ i4) * (-23);
                        i = ((iM45029 ^ i3) * 15341) ^ (-638687882);
                        i2 = -1104239153;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1532712218:
                case 1554124983:
                    i7 = 40066;
                    iM45029 = C19806.m45029("ۖ᩻") ^ i4;
                    i = ((iM45029 ^ i3) * 25731) ^ (-1747723114);
                    i2 = -253013428;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i14 = s + s2;
                    if (i11 - (i14 * i14) >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩸") ^ i4) * 3;
                        i = ((iM45029 ^ i3) * 16677) ^ 1466173438;
                        i2 = -417855205;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 10999) ^ (-704648032);
                        i2 = 619238210;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C13915(ViewOnClickListenerC13209 viewOnClickListenerC13209, String str, String str2, int i) {
        int i2 = 2008262214;
        int i3 = C7105.f23796;
        int i4 = C0278.f1572;
        this.f45836 = viewOnClickListenerC13209;
        this.f45839 = str;
        this.f45838 = str2;
        this.f45837 = i;
        int iM45029 = C19806.m45029("ۢ۟") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-6891)) ^ 2074548073;
        int i6 = -900092403;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-25547)) >> 31));
            switch (i2) {
                case -1807094306:
                case -485598006:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡۗ")) * (-91);
                    i5 = ((iM45029 ^ i4) * (-8105)) ^ (-212801928);
                    i6 = 978868454;
                    break;
                case -1537185255:
                case 555700151:
                    return;
                case -1422047048:
                case -229986452:
                    C1377.m4833();
                    if (C2788.f10625 < 0) {
                        iM45029 = (C19806.m45029("ۤܰ") + i4) * 91;
                        i5 = ((iM45029 ^ i3) * 14283) ^ 1748330071;
                        i6 = 1522354273;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۨ") + i3) * (-99);
                        i5 = ((iM45029 ^ i4) * 27537) ^ (-180325147);
                        i6 = 1314890689;
                    }
                    break;
                case -291883793:
                case 4007711:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ۙܳ") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-18363)) ^ (-498566710);
                        i6 = 1439881413;
                    } else {
                        iM45029 = (C19806.m45029("ܶۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM45029 ^ i3) * 3549) ^ 1499301824;
                        i6 = -1303607440;
                    }
                    break;
                case -192528621:
                case -143698061:
                    C3577.m10565();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("ۤܰ") + i4) * 91;
                        i5 = ((iM45029 ^ i3) * 14283) ^ 1748330071;
                        i6 = 1522354273;
                    } else {
                        iM45029 = (C19806.m45029("ܳ֨") ^ i3) * 85;
                        i5 = ((iM45029 ^ i4) * (-25805)) ^ (-591844085);
                        i6 = -1490618916;
                    }
                    break;
                case 589429312:
                case 2065147405:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (C19806.m45029("ܳ֨") ^ i3) * 85;
                        i5 = ((iM45029 ^ i4) * (-25805)) ^ (-591844085);
                        i6 = -1490618916;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡۗ")) * (-91);
                        i5 = ((iM45029 ^ i4) * (-8105)) ^ (-212801928);
                        i6 = 978868454;
                    }
                    break;
                default:
                    C1668.m5583();
                    RunnableC1564.m5345();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1875.m6110(this, this.f45836);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m33756() {
        ViewOnClickListenerC13209 viewOnClickListenerC13209 = null;
        EnumC9414 enumC9414Mo9170 = null;
        int i = -294611960;
        int i2 = C3722.f13525;
        int i3 = C1668.f6641;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩷") ^ i2) * (-55);
        int i4 = ((iM11306 ^ i3) * (-29157)) ^ (-345343818);
        int i5 = 1562679204;
        while (true) {
            i = ((((i ^ i3) * (-25299)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2135057055:
                case -1912010187:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۘ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-25849)) ^ (-989220195);
                        i5 = -218094268;
                    }
                    break;
                case -2056139575:
                case 1473832772:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25581) ^ 1073873582;
                        i5 = 1766654124;
                    }
                    break;
                case -1771958599:
                case -1355908539:
                    viewOnClickListenerC13209 = this.f45836;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    } else {
                        iM11306 = C19806.m45029("ۚ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8191)) ^ 1562021859;
                        i5 = -1853928887;
                    }
                    break;
                case -1617639089:
                case 51882039:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("۟۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12285) ^ (-1536622957);
                        i5 = -1696118264;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ᩳ") ^ i3) * 93;
                        i4 = ((iM11306 ^ i2) * 1403) ^ 1205379506;
                        i5 = 1907484358;
                    }
                    break;
                case -1573183764:
                case 372532051:
                    return false;
                case -1316440973:
                case -75272689:
                    return true;
                case -1310579036:
                case -1080449473:
                    C0817.m3399();
                    if (C1398.f5802 > 0) {
                        iM11306 = (i2 - C19806.m45029("ܽᩴ")) * (-41);
                        i4 = ((iM11306 ^ i3) * (-2131)) ^ (-1987271530);
                        i5 = 962978660;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    }
                    break;
                case -1013834205:
                case -507889381:
                    if (C1460.m5058(this.f45838, C1875.m6109())) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܽ")) * 33;
                        i4 = ((iM11306 ^ i3) * 10277) ^ 744743275;
                        i5 = 782991643;
                    } else {
                        iM11306 = (C19806.m45029("ۡۧ") ^ i3) * (-67);
                        i4 = ((iM11306 ^ i2) * (-6541)) ^ (-429668158);
                        i5 = -113368711;
                    }
                    break;
                case -946546207:
                case 652261605:
                    C1977.m6356();
                    iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                    i5 = 1938029633;
                    break;
                case -636745791:
                case 1106159315:
                    C1977.m6356();
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = (C19806.m45029("ܿ᩹") ^ i3) * 115;
                        i4 = ((iM11306 ^ i2) * 14699) ^ (-722044089);
                        i5 = 2094899975;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    }
                    break;
                case -453391389:
                case -45436937:
                    C10634.m26820();
                    C1066.m4023();
                    return false;
                case -215896092:
                case -205697443:
                    enumC9414Mo9170 = RunnableC1564.m5341(viewOnClickListenerC13209).mo9170();
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13517) ^ (-984351305);
                        i5 = 1299592994;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-9059)) ^ 2035665834;
                        i5 = 1683846695;
                    }
                    break;
                case 101022929:
                case 1791242864:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܽᩴ")) * (-41);
                        i4 = ((iM11306 ^ i3) * (-2131)) ^ (-1987271530);
                        i5 = 962978660;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֡ۘ")) * (-119);
                        i4 = ((iM11306 ^ i3) * (-11047)) ^ (-343203744);
                        i5 = -2027049398;
                    }
                    break;
                case 361102161:
                case 1236421589:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6967) ^ (-1009165741);
                        i5 = 219674341;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩹") ^ i3) * 115;
                        i4 = ((iM11306 ^ i2) * 14699) ^ (-722044089);
                        i5 = 2094899975;
                    }
                    break;
                case 662512666:
                case 1990072466:
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("۟۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12285) ^ (-1536622957);
                        i5 = -1696118264;
                    } else {
                        iM11306 = C19806.m45029("۬ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3839) ^ 1492245824;
                        i5 = -1609619867;
                    }
                    break;
                case 677977403:
                case 1074867871:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("۟۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12285) ^ (-1536622957);
                        i5 = -1696118264;
                    } else {
                        iM11306 = C19806.m45029("ܳܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2265)) ^ 1694269270;
                        i5 = 149865399;
                    }
                    break;
                case 789106567:
                case 1799523529:
                    if (enumC9414Mo9170.m24173(EnumC9414.CREATED)) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15031)) ^ (-139868689);
                        i5 = 1992296926;
                    } else {
                        iM11306 = (C19806.m45029("ۡۧ") ^ i3) * (-67);
                        i4 = ((iM11306 ^ i2) * (-6541)) ^ (-429668158);
                        i5 = -113368711;
                    }
                    break;
                case 958282952:
                case 1996829624:
                    C0797.m3359();
                    if (!C2332.f8260) {
                        iM11306 = C19806.m45029("۟۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12285) ^ (-1536622957);
                        i5 = -1696118264;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    }
                    break;
                case 1278466275:
                case 1650495197:
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14505) ^ 2098064172;
                        i5 = 1938029633;
                    } else {
                        iM11306 = C19806.m45029("ۛۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12577) ^ (-1204024244);
                        i5 = 426982903;
                    }
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9870(viewOnClickListenerC13209)) {
                        iM11306 = (C19806.m45029("ۡۧ") ^ i3) * (-67);
                        i4 = ((iM11306 ^ i2) * (-6541)) ^ (-429668158);
                        i5 = -113368711;
                    } else {
                        iM11306 = C19806.m45029("۫᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19471) ^ (-1415016607);
                        i5 = -698390317;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int i = 0;
        String str = null;
        String strM4767 = null;
        int i2 = 1244534115;
        int i3 = C2788.f10625;
        int i4 = C3722.f13525;
        int iM45029 = C19806.m45029("᩻᩶") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-4537)) ^ (-777078063);
        int i6 = 1413852503;
        while (true) {
            i2 = ((((i2 ^ i4) * 14725) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2119694118:
                case 145082922:
                    if (m33756()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۚ") ^ i3) * (-75);
                        i5 = ((iM45029 ^ i4) * 39) ^ 1138354144;
                        i6 = 612756934;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩷") + i4) * 51;
                        i5 = ((iM45029 ^ i3) * 2391) ^ (-1419373267);
                        i6 = 394874762;
                    }
                    break;
                case -1782294805:
                case 1613863687:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31531) ^ 879228819;
                        i6 = -2120037190;
                    } else {
                        iM45029 = C19806.m45029("ۙۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-28253)) ^ 1116003800;
                        i6 = 2042388502;
                    }
                    break;
                case -1529077520:
                case 199608151:
                    if (C0278.f1572 > 0) {
                        iM45029 = C19806.m45029("ܳۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27195)) ^ 1881483167;
                        i6 = 1798432467;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27673) ^ 1470755193;
                        i6 = 840705366;
                    }
                    break;
                case -1498608968:
                case 708700410:
                    strM4767 = C1355.m4767(i, str);
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31531) ^ 879228819;
                        i6 = -2120037190;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܶ᩺")) * 101;
                        i5 = ((iM45029 ^ i3) * (-11141)) ^ 1980561600;
                        i6 = -1444758504;
                    }
                    break;
                case -1403891233:
                case 1472671006:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27673) ^ 1470755193;
                        i6 = 840705366;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5665)) ^ (-1363755619);
                        i6 = 240745595;
                    }
                    break;
                case -1396023362:
                case 144890172:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ۖ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6229) ^ 1617901020;
                        i6 = 136332431;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27673) ^ 1470755193;
                        i6 = 840705366;
                    }
                    break;
                case -1363014366:
                case 640020550:
                    if (C2871.m8646()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۫") + i3) * 79;
                        i5 = ((iM45029 ^ i4) * (-25253)) ^ (-616612140);
                        i6 = 784594050;
                    } else {
                        iM45029 = C19806.m45029("ܳۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27195)) ^ 1881483167;
                        i6 = 1798432467;
                    }
                    break;
                case -1170097168:
                case 1042544398:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i4) * (-37);
                        i5 = ((iM45029 ^ i3) * (-28143)) ^ 1880020430;
                        i6 = 946726884;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۘ᩹")) * 85;
                        i5 = ((iM45029 ^ i3) * 5787) ^ 461008299;
                        i6 = -1573136848;
                    }
                    break;
                case -1160386044:
                case -566167152:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i4) * (-37);
                        i5 = ((iM45029 ^ i3) * (-28143)) ^ 1880020430;
                        i6 = 946726884;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11075)) ^ (-1675245740);
                        i6 = 227751151;
                    }
                    break;
                case -1092621818:
                case 414507026:
                    if (!CallableC1627.f6528) {
                        iM45029 = C19806.m45029("ۖ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6229) ^ 1617901020;
                        i6 = 136332431;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i4) * (-37);
                        i5 = ((iM45029 ^ i3) * (-28143)) ^ 1880020430;
                        i6 = 946726884;
                    }
                    break;
                case -794650147:
                case 1719462095:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27673) ^ 1470755193;
                        i6 = 840705366;
                    } else {
                        iM45029 = C19806.m45029("ܰ֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-23583)) ^ (-65679311);
                        i6 = -1329953472;
                    }
                    break;
                case -403565478:
                case -257353787:
                    C1066.m4023();
                    RunnableC1606.m5473();
                    break;
                case 500100334:
                case 724020284:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ܳۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27195)) ^ 1881483167;
                        i6 = 1798432467;
                    } else {
                        iM45029 = C19806.m45029("ۨۡ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-6109)) ^ 118775787;
                        i6 = 196005823;
                    }
                    break;
                case 686681450:
                case 1701546617:
                    if (C3743.f13569) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۢ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-14745)) ^ 471340896;
                        i6 = -2045141824;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31531) ^ 879228819;
                        i6 = -2120037190;
                    }
                    break;
                case 761178496:
                case 767520593:
                    C2332.m7079();
                    iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 27673) ^ 1470755193;
                    i6 = 840705366;
                    break;
                case 837629104:
                case 2008039646:
                    i = this.f45837;
                    str = this.f45840;
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31531) ^ 879228819;
                        i6 = -2120037190;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18639)) ^ 1755870431;
                        i6 = -338824411;
                    }
                    break;
                case 1654039361:
                case 1876707636:
                    break;
                default:
                    CallableC1627.m5511(this.f45836, strM4767);
                    iM45029 = (ThreadFactoryC3888.m11306("ۧ᩷") + i4) * 51;
                    i5 = ((iM45029 ^ i3) * 2391) ^ (-1419373267);
                    i6 = 394874762;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f45836.f43955 = false;
        C1025.m3860(this);
    }
}
