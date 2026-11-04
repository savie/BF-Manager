package l;

import android.os.Build;
import android.util.SparseIntArray;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4EN */
/* JADX INFO: loaded from: classes.dex */
public class C2592 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C3084 f8315;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f8316;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f8317;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int f8318;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String f8319;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ReentrantReadWriteLock f8320;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f8321;

    /* JADX INFO: renamed from: ᩷ۜܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f8322;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C24363 f8323;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C16157 f8324;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21962 f8325;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6184 f8326;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f8327;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f8328;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Lock f8329;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f8330;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6178 f8331;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f8332;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f8333;

    public native C2592(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native synchronized String m8667(String str, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native C13778 m8668(String str, int i);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private native C13778 m8671(String str);

    /* JADX WARN: Code duplicated, block: B:101:0x0352 A[PHI: r16
      0x0352: PHI (r16v44 int) = (r16v11 int), (r16v33 int), (r16v34 int), (r16v46 int) binds: [B:100:0x0350, B:30:0x00b3, B:26:0x0093, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x03a5 A[PHI: r16
      0x03a5: PHI (r16v47 int) = (r16v9 int), (r16v32 int), (r16v33 int), (r16v38 int), (r16v40 int), (r16v52 int) binds: [B:108:0x03a3, B:32:0x00b7, B:30:0x00b3, B:20:0x0081, B:17:0x0079, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x03d6 A[PHI: r16
      0x03d6: PHI (r16v39 int) = (r16v8 int), (r16v40 int) binds: [B:112:0x03d4, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0406 A[PHI: r16
      0x0406: PHI (r16v37 int) = (r16v7 int), (r16v12 int), (r16v38 int) binds: [B:116:0x0404, B:96:0x0333, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x043f A[PHI: r16 r17
      0x043f: PHI (r16v35 int) = (r16v5 int), (r16v10 int), (r16v36 int) binds: [B:122:0x043d, B:104:0x0384, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x043f: PHI (r17v6 boolean) = (r17v5 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:122:0x043d, B:104:0x0384, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[PHI: r16
      0x0097: PHI (r16v41 int) = (r16v34 int), (r16v36 int), (r16v43 int) binds: [B:26:0x0093, B:23:0x008c, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x018f A[PHI: r16
      0x018f: PHI (r16v26 int) = (r16v23 int), (r16v27 int) binds: [B:57:0x0175, B:46:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x024d A[PHI: r9 r16
      0x024d: PHI (r9v4 long) = (r9v1 long), (r9v1 long), (r9v2 long), (r9v1 long) binds: [B:61:0x01a6, B:43:0x0101, B:126:0x024d, B:37:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r16v30 int) = (r16v22 int), (r16v28 int), (r16v29 int), (r16v31 int) binds: [B:61:0x01a6, B:43:0x0101, B:126:0x024d, B:37:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x027f A[PHI: r2 r4 r16
      0x027f: PHI (r2v3 boolean) = (r2v2 boolean), (r2v1 boolean), (r2v1 boolean) binds: [B:80:0x0268, B:73:0x0215, B:70:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:80:0x0268, B:73:0x0215, B:70:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r16v19 int) = (r16v16 int), (r16v18 int), (r16v20 int) binds: [B:80:0x0268, B:73:0x0215, B:70:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x02cf A[PHI: r16
      0x02cf: PHI (r16v51 int) = (r16v14 int), (r16v52 int) binds: [B:88:0x02cd, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0301 A[PHI: r16
      0x0301: PHI (r16v42 int) = (r16v13 int), (r16v43 int) binds: [B:92:0x02ff, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8679() {
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        C2592 c2592 = this;
        boolean z = false;
        C21962 c21962M8361 = null;
        int i5 = 0;
        C21962 c21962 = null;
        boolean z2 = false;
        boolean zM9480 = false;
        boolean zM8175 = false;
        long j = 0;
        long j2 = 0;
        int i6 = 1536301804;
        int i7 = C3448.f11240;
        int i8 = C3099.f10023;
        int iM31610 = C0773.m3169("ܺ᩹") ^ i8;
        int i9 = ((iM31610 ^ i7) * 3551) ^ 1417692241;
        int i10 = iM31610 ^ 1123262976;
        boolean z3 = false;
        while (true) {
            int i11 = i10 ^ (i9 & (((i6 ^ i7) * 201) >> 31));
            switch (i11) {
                case -2128557957:
                case 453042811:
                    return z;
                case -2043881616:
                case -240433280:
                    i = i11;
                    C3998.m12920();
                    if (C0773.f2792 > 0) {
                        iM3169 = (i8 - C0773.m3169("ܺܺ")) * 33;
                        i3 = ((iM3169 ^ i7) * 25793) ^ (-712391693);
                        i4 = -1491438494;
                    } else {
                        iM3169 = (C0773.m3169("ۙ۠") + i7) * (-105);
                        i3 = ((iM3169 ^ i8) * (-8473)) ^ (-2133377786);
                        i4 = 2024954351;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -2027531551:
                case -20001546:
                    i = i11;
                    z = false;
                    if (z3) {
                        iM3169 = (C0619.m2761("ۘ᩻") + i8) * 7;
                        i3 = ((iM3169 ^ i7) * 26821) ^ 988363826;
                        i4 = 1140947456;
                    } else {
                        iM3169 = C0619.m2761("ۘۤ") ^ i7;
                        i3 = ((iM3169 ^ i8) * (-6129)) ^ 1125369186;
                        i4 = 773724855;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1818853789:
                case 896586911:
                    i = i11;
                    if (j == j2) {
                        iM3169 = C0773.m3169("ܶܰ") ^ i8;
                        i3 = ((iM3169 ^ i7) * (-12169)) ^ (-1496305728);
                        i4 = -190009315;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩷ۚ")) * q.h;
                        i3 = ((iM3169 ^ i8) * 3545) ^ 76758718;
                        i4 = 1946718088;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1788632848:
                case 317980090:
                    i = i11;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۙۙ") ^ i8;
                        i3 = ((iM3169 ^ i7) * 16063) ^ 1619667510;
                        i4 = 2056629998;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۧۜ")) * 73;
                        i3 = ((iM3169 ^ i8) * (-23805)) ^ (-2017154230);
                        i4 = -1142849416;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1634201751:
                case 446800633:
                    i = i11;
                    boolean z4 = c2592.f8328;
                    if (C2023.f6737) {
                        z3 = z4;
                        iM3169 = (C0773.m3169("ۙ۠") + i7) * (-105);
                        i3 = ((iM3169 ^ i8) * (-8473)) ^ (-2133377786);
                        i4 = 2024954351;
                        i2 = i;
                        i10 = iM3169 ^ i4;
                        i9 = i3;
                    } else {
                        int iM31611 = C0773.m3169("ۨܽ") ^ i7;
                        z3 = z4;
                        i9 = ((iM31611 ^ i8) * 29079) ^ 778028654;
                        c2592 = this;
                        i2 = i;
                        i10 = iM31611 ^ (-1810541258);
                    }
                    i6 = i2;
                    break;
                case -1598818570:
                case 1794286410:
                    i = i11;
                    if (C0950.m3785() == 0) {
                        iM3169 = (i8 - C0773.m3169("ܺܺ")) * 33;
                        i3 = ((iM3169 ^ i7) * 25793) ^ (-712391693);
                        i4 = -1491438494;
                    } else {
                        iM3169 = (C0773.m3169("۫۬") + i8) * (-27);
                        i3 = ((iM3169 ^ i7) * 30849) ^ 194903763;
                        i4 = 1949522693;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1533787017:
                case -1392595935:
                    return z2;
                case -1474640964:
                case 1444106394:
                    i = i11;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("᩻۟") ^ i8;
                        i3 = ((iM3169 ^ i7) * 21197) ^ (-1402452124);
                        i4 = -562227662;
                    } else {
                        iM3169 = C0619.m2761("ܳۧ") ^ i8;
                        i3 = ((iM3169 ^ i7) * (-20875)) ^ (-630400942);
                        i4 = 1690980605;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1416694303:
                case 1338115903:
                    C1783.m6232();
                    return false;
                case -1349588719:
                case 1355456891:
                    i = i11;
                    try {
                        j = c21962M8361.f70883;
                        j2 = c2592.f8325.f70883;
                        iM3169 = C0773.m3169("ܿۛ") ^ i8;
                        i3 = ((iM3169 ^ i7) * (-19345)) ^ (-1896543208);
                        i4 = -876321895;
                    } catch (IOException unused) {
                        iM3169 = (i7 - C0619.m2761("᩷ۚ")) * q.h;
                        i3 = ((iM3169 ^ i8) * 3545) ^ 76758718;
                        i4 = 1946718088;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1247953048:
                case 827834718:
                    i = i11;
                    if (i5 != 4099) {
                        iM3169 = (C0619.m2761("ܳ۠") + i7) * (-61);
                        i3 = ((iM3169 ^ i8) * 12261) ^ (-1514244229);
                        i4 = -1120413406;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩻") + i8) * 7;
                        i3 = ((iM3169 ^ i7) * 26821) ^ 988363826;
                        i4 = 1140947456;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1118466344:
                case 233518410:
                    i = i11;
                    if (c21962M8361 != null) {
                        iM3169 = C0773.m3169("ܳ֨") ^ i7;
                        i3 = ((iM3169 ^ i8) * (-15901)) ^ 508913293;
                        i4 = -1420939586;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩷ۚ")) * q.h;
                        i3 = ((iM3169 ^ i8) * 3545) ^ 76758718;
                        i4 = 1946718088;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -1042946812:
                case 1656408665:
                    i = i11;
                    if (C23916.f77426 > 0) {
                        iM3169 = (C0619.m2761("ۚۧ") ^ i7) * 3;
                        i3 = ((iM3169 ^ i8) * (-5043)) ^ (-858812117);
                        i4 = 1213784723;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ܺܺ")) * 33;
                        i3 = ((iM3169 ^ i7) * 25793) ^ (-712391693);
                        i4 = -1491438494;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -980547484:
                case 1080783671:
                    i = i11;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                        i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                        i4 = -324090981;
                    } else {
                        iM3169 = (C0619.m2761("ۚۧ") ^ i7) * 3;
                        i3 = ((iM3169 ^ i8) * (-5043)) ^ (-858812117);
                        i4 = 1213784723;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -968184628:
                case 1404478091:
                    i = i11;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ܿۨ") ^ i8;
                        i3 = ((iM3169 ^ i7) * 7685) ^ 1980770017;
                        i4 = -1602934851;
                    } else {
                        iM3169 = (C0619.m2761("ۜܰ") ^ i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM3169 ^ i7) * 10211) ^ 1482679530;
                        i4 = -123727620;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -967344867:
                case 1067888107:
                    i = i11;
                    i5 = c2592.f8333;
                    if (i5 != 4352) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i8) * 75;
                        i3 = ((iM3169 ^ i7) * 12475) ^ (-1151594431);
                        i4 = -782756211;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩻") + i8) * 7;
                        i3 = ((iM3169 ^ i7) * 26821) ^ 988363826;
                        i4 = 1140947456;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -947181955:
                case -859167951:
                    i = i11;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                        i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                        i4 = -324090981;
                    } else {
                        iM3169 = C0619.m2761("᩻۟") ^ i8;
                        i3 = ((iM3169 ^ i7) * 21197) ^ (-1402452124);
                        i4 = -562227662;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -857403064:
                case 509977311:
                    return z;
                case -618962522:
                case 2121302000:
                    i = i11;
                    C3033.m9845();
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                        i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                        i4 = -324090981;
                    } else {
                        iM3169 = C0619.m2761("۫ۗ") ^ i7;
                        i3 = ((iM3169 ^ i8) * 10705) ^ 959392352;
                        i4 = 801261463;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -515308694:
                case 1582503973:
                    i = i11;
                    if (zM8175) {
                        iM3169 = C0773.m3169("᩷᩸") ^ i7;
                        i3 = ((iM3169 ^ i8) * (-32323)) ^ (-366805225);
                        i4 = -1199549636;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩷ۚ")) * q.h;
                        i3 = ((iM3169 ^ i8) * 3545) ^ 76758718;
                        i4 = 1946718088;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -259730094:
                case 1587639842:
                    i = i11;
                    C1321.m4852();
                    RunnableC3055.m9933();
                    iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                    i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                    i4 = -324090981;
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -224736213:
                case -42202847:
                    i = i11;
                    zM9480 = C2878.m9480(c21962M8361.f70886);
                    iM3169 = C0773.m3169("᩻۠") ^ i8;
                    i3 = ((iM3169 ^ i7) * (-11623)) ^ (-521355684);
                    i4 = 973374169;
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -140054127:
                case 1816625838:
                    i = i11;
                    z2 = true;
                    if (c21962 == null) {
                        iM3169 = (C0619.m2761("֡ۢ") + i8) * 75;
                        i3 = ((iM3169 ^ i7) * 29703) ^ 410129500;
                        i4 = -315343338;
                    } else {
                        iM3169 = (C0619.m2761("ۙ۟") ^ i7) * (-109);
                        i3 = ((iM3169 ^ i8) * (-19429)) ^ 1917513520;
                        i4 = 357948362;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -131646798:
                case 592243230:
                    C0487.m2356();
                    if (C2354.f7599 >= 0) {
                        i = i11;
                        iM3169 = (C0619.m2761("ۚۧ") ^ i7) * 3;
                        i3 = ((iM3169 ^ i8) * (-5043)) ^ (-858812117);
                        i4 = 1213784723;
                    } else {
                        iM3169 = (C0773.m3169("ۖۨ") + i7) * (-95);
                        i = i11;
                        i3 = ((iM3169 ^ i8) * (-18903)) ^ 35141906;
                        i4 = -1499240142;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case -123630594:
                case 1739367712:
                    return z2;
                case 104146047:
                case 1124562637:
                    i = i11;
                    zM8175 = C2419.m8175(c21962M8361.f70886, c21962.f70886);
                    iM3169 = (C0773.m3169("᩷ۗ") ^ i7) * 99;
                    i3 = ((iM3169 ^ i8) * (-24997)) ^ 2095715699;
                    i4 = 899387032;
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 229684923:
                case 754174634:
                    i = i11;
                    if (c21962M8361 != null) {
                        iM3169 = (i7 - C0773.m3169("᩶ܳ")) * 71;
                        i3 = ((iM3169 ^ i8) * (-20029)) ^ (-1433935039);
                        i4 = -1726538124;
                    } else {
                        iM3169 = C0619.m2761("ۨܿ") ^ i8;
                        i3 = ((iM3169 ^ i7) * 26961) ^ (-1804414599);
                        i4 = 1073644273;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 561783920:
                case 776608287:
                    i = i11;
                    c21962M8361 = C2485.m8361();
                    c21962 = c2592.f8325;
                    iM3169 = (C0619.m2761("ܰ᩷") + i8) * 123;
                    i3 = ((iM3169 ^ i7) * 14653) ^ (-775875446);
                    i4 = -2014260498;
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 583503688:
                case 1458407038:
                    C4282.m13644();
                    i = i11;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                        i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                        i4 = -324090981;
                    } else {
                        iM3169 = C0619.m2761("ܿۨ") ^ i8;
                        i3 = ((iM3169 ^ i7) * 7685) ^ 1980770017;
                        i4 = -1602934851;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 612714365:
                case 793202717:
                    i = i11;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ۙ۠") + i7) * (-105);
                        i3 = ((iM3169 ^ i8) * (-8473)) ^ (-2133377786);
                        i4 = 2024954351;
                    } else {
                        iM3169 = (C0773.m3169("֨۟") + i7) * 99;
                        i3 = ((iM3169 ^ i8) * (-29025)) ^ 1488711876;
                        i4 = -1134992685;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 718292331:
                case 2100510038:
                    i = i11;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("۟ۛ") + i7) * (-3);
                        i3 = ((iM3169 ^ i8) * (-28593)) ^ (-1628179686);
                        i4 = -324090981;
                    } else {
                        iM3169 = C0773.m3169("ۗۚ") ^ i8;
                        i3 = ((iM3169 ^ i7) * (-28305)) ^ 1757576429;
                        i4 = 1997893752;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 917860852:
                case 1254441746:
                    i = i11;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("۫ۗ") ^ i7;
                        i3 = ((iM3169 ^ i8) * 10705) ^ 959392352;
                        i4 = 801261463;
                    } else {
                        iM3169 = (C0773.m3169("֡֫") + i7) * 119;
                        i3 = ((iM3169 ^ i8) * 2099) ^ (-442089217);
                        i4 = -800442917;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 1016613999:
                case 1169890297:
                    i = i11;
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("۫۬") + i8) * (-27);
                        i3 = ((iM3169 ^ i7) * 30849) ^ 194903763;
                        i4 = 1949522693;
                    } else {
                        iM3169 = (C0773.m3169("۬ܳ") + i7) * 85;
                        i3 = ((iM3169 ^ i8) * 11583) ^ (-864054706);
                        i4 = 1936975034;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 1374530511:
                case 1754466724:
                    i = i11;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ۚۧ") ^ i7) * 3;
                        i3 = ((iM3169 ^ i8) * (-5043)) ^ (-858812117);
                        i4 = 1213784723;
                    } else {
                        iM3169 = (C0773.m3169("ܿۢ") + i8) * (-97);
                        i3 = ((iM3169 ^ i7) * 2759) ^ 162220337;
                        i4 = -568063475;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 1522395675:
                case 1649755034:
                    i = i11;
                    if (zM9480) {
                        iM3169 = C0619.m2761("ۨܿ") ^ i8;
                        i3 = ((iM3169 ^ i7) * 26961) ^ (-1804414599);
                        i4 = 1073644273;
                    } else {
                        iM3169 = (C0619.m2761("ۜܽ") ^ i8) * 5;
                        i3 = ((iM3169 ^ i7) * 14737) ^ 130452416;
                        i4 = -1538256828;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                case 1575265704:
                case 2086417605:
                    i = i11;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("᩻۟") ^ i8;
                        i3 = ((iM3169 ^ i7) * 21197) ^ (-1402452124);
                        i4 = -562227662;
                    } else {
                        iM3169 = C0773.m3169("ۡ۫") ^ i8;
                        i3 = ((iM3169 ^ i7) * 10009) ^ 458859036;
                        i4 = 1860654936;
                    }
                    i2 = i;
                    i10 = iM3169 ^ i4;
                    i9 = i3;
                    i6 = i2;
                    break;
                default:
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m8666() {
        MessageDigest messageDigestM36179 = null;
        C6178 c6178 = null;
        byte[] bArrM17796 = null;
        int i = 0;
        byte[] bArrCopyOfRange = null;
        int i2 = -1403961002;
        int i3 = C2834.f9334;
        int i4 = C1519.f5300;
        int iM2761 = (C0619.m2761("ܰۙ") + i3) * 97;
        int i5 = ((iM2761 ^ i4) * (-17015)) ^ 550340094;
        int i6 = -1648292314;
        while (true) {
            i2 = ((((i2 ^ i4) * (-18481)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2049660474:
                case 303720016:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۤᩳ")) * q.h;
                        i5 = ((iM2761 ^ i3) * (-5281)) ^ (-1114314644);
                        i6 = 31567529;
                    } else {
                        iM2761 = (C0773.m3169("ۖܿ") ^ i3) * 3;
                        i5 = ((iM2761 ^ i4) * 22565) ^ (-685946099);
                        i6 = 1589341455;
                    }
                    break;
                case -1948637202:
                case -1218886014:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۤᩳ")) * q.h;
                        i5 = ((iM2761 ^ i3) * (-5281)) ^ (-1114314644);
                        i6 = 31567529;
                    } else {
                        iM2761 = C0773.m3169("֡᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23627)) ^ 833040719;
                        i6 = 1521152259;
                    }
                    break;
                case -1769609473:
                case -202448361:
                    messageDigestM36179 = C15022.m36179();
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * 51;
                        i5 = ((iM2761 ^ i4) * 18917) ^ 1148655055;
                        i6 = -786309115;
                    } else {
                        iM2761 = (C0619.m2761("۠ܿ") ^ i4) * (-35);
                        i5 = ((iM2761 ^ i3) * 16063) ^ (-1521815674);
                        i6 = 805361757;
                    }
                    break;
                case -1751057525:
                case 2071086509:
                    c6178 = this.f8331;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0773.m3169("᩷ܶ") ^ i4) * 33;
                        i5 = ((iM2761 ^ i3) * 28965) ^ (-718866046);
                        i6 = 284884245;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-45);
                        i5 = ((iM2761 ^ i4) * 24757) ^ 138410485;
                        i6 = 1253391196;
                    }
                    break;
                case -1285086748:
                case 688431181:
                    if (C0619.m2763()) {
                        iM2761 = (C0773.m3169("᩷ܶ") ^ i4) * 33;
                        i5 = ((iM2761 ^ i3) * 28965) ^ (-718866046);
                        i6 = 284884245;
                    } else {
                        iM2761 = (C0773.m3169("۫ۛ") + i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-7827)) ^ 313224229;
                        i6 = -2145417868;
                    }
                    break;
                case -1176427813:
                case -216162898:
                    if (!C3492.m11488()) {
                        iM2761 = (i4 - C0773.m3169("ۤᩳ")) * q.h;
                        i5 = ((iM2761 ^ i3) * (-5281)) ^ (-1114314644);
                        i6 = 31567529;
                    } else {
                        iM2761 = (C0619.m2761("ܽܺ") ^ i3) * 11;
                        i5 = ((iM2761 ^ i4) * 9319) ^ (-1981742058);
                        i6 = 347008907;
                    }
                    break;
                case -1139209977:
                case -540417355:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * 51;
                        i5 = ((iM2761 ^ i4) * 18917) ^ 1148655055;
                        i6 = -786309115;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۤᩳ")) * q.h;
                        i5 = ((iM2761 ^ i3) * (-5281)) ^ (-1114314644);
                        i6 = 31567529;
                    }
                    break;
                case -1134146761:
                case -871881125:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * 51;
                        i5 = ((iM2761 ^ i4) * 18917) ^ 1148655055;
                        i6 = -786309115;
                    } else {
                        iM2761 = (C0773.m3169("ۘۘ") + i4) * 17;
                        i5 = ((iM2761 ^ i3) * 3791) ^ (-1437182115);
                        i6 = 1554790593;
                    }
                    break;
                case -637638511:
                case 380874678:
                    bArrCopyOfRange = Arrays.copyOfRange(bArrM17796, i, c6178.size());
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ܽܺ") ^ i3) * 11;
                        i5 = ((iM2761 ^ i4) * 9319) ^ (-1981742058);
                        i6 = 347008907;
                    } else {
                        iM2761 = C0773.m3169("᩷ۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-14535)) ^ (-795330318);
                        i6 = 1492934849;
                    }
                    break;
                case 355634558:
                case 1170414241:
                    bArrM17796 = c6178.m17796();
                    i = 42;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("᩷ܶ") ^ i4) * 33;
                        i5 = ((iM2761 ^ i3) * 28965) ^ (-718866046);
                        i6 = 284884245;
                    } else {
                        iM2761 = C0619.m2761("ܽ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-1189)) ^ (-474821970);
                        i6 = -909256307;
                    }
                    break;
                case 397864531:
                case 1206425892:
                    return C11235.m28310(messageDigestM36179.digest(bArrCopyOfRange));
                case 452783268:
                case 1083170365:
                    RunnableC0334.m2063();
                    if (C0950.f3488 < 0) {
                        iM2761 = (C0619.m2761("ܽܺ") ^ i3) * 11;
                        i5 = ((iM2761 ^ i4) * 9319) ^ (-1981742058);
                        i6 = 347008907;
                    } else {
                        iM2761 = (C0773.m3169("֫᩻") + i4) * (-127);
                        i5 = ((iM2761 ^ i3) * 19647) ^ 503329652;
                        i6 = -321929407;
                    }
                    break;
                case 565615065:
                case 666446037:
                    C3734.m12152();
                    return null;
                case 1102796477:
                case 1174303211:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("᩷ܶ") ^ i4) * 33;
                        i5 = ((iM2761 ^ i3) * 28965) ^ (-718866046);
                        i6 = 284884245;
                    } else {
                        iM2761 = C0773.m3169("֨۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 9067) ^ (-44257685);
                        i6 = 65792278;
                    }
                    break;
                case 1285745285:
                case 1368750090:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0619.m2761("ܽܺ") ^ i3) * 11;
                        i5 = ((iM2761 ^ i4) * 9319) ^ (-1981742058);
                        i6 = 347008907;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۖ") ^ i3) * (-7);
                        i5 = ((iM2761 ^ i4) * (-30973)) ^ (-350472517);
                        i6 = 419312633;
                    }
                    break;
                default:
                    C2288.m7767();
                    iM2761 = (i4 - C0773.m3169("ۤᩳ")) * q.h;
                    i5 = ((iM2761 ^ i3) * (-5281)) ^ (-1114314644);
                    i6 = 31567529;
                    break;
            }
        }
    }

    static {
        ApplicationC23172.m52091(38);
        f8322 = new short[]{2157, 5460, 5445, 5445, 5465, 5468, 5462, 5460, 5441, 5468, 5466, 5467, 5402, 5466, 5462, 5441, 5456, 5441, 5400, 5446, 5441, 5447, 5456, 5460, 5464, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 5381, 6963, 15950, 15992, 15950, 15950, 15950, 15947, 15966, 15938, 15947, 15931, 15969, 15930, 15963, 15947, 15993, 15963, 15934, 15995, 15978, 15989, 15998, 15979, 15995, 15926, 15964, 15950, 15975, 15989, 15978, 15991, 15961, 15978, 15957, 15946, 15958, 15949, 15931, 15990, 15998, 15940, 15933, 15968, 15948, 15974, 15930, 15989, 15945, 15969, 15989, 15967, 15968, 15950, 15950, 15941, 15974, 15978, 15977, 15976, 15934, 15969, 15960, 15990, 15967, 15976, 15980, 15947, 15946, 15973, 15937, 15935, 15950, 15950, 15950, 15950, 15949, 15978, 15950, 15950, 15950, 15950, 15966, 15976, 15946, 15950, 15950, 15949, 15968, 15950, 15950, 15950, 15950, 15949, 15950, 15950, 15931, 15949, 15980, 15932, 15996, 15961, 15959, 15970, 15965, 15944, 15950, 15978, 15938, 15998, 15974, 15995, 15998, 15950, 15968, 15994, 15980, 15991, 15957, 15992, 15946, 15949, 15950, 15942, 15950, 15967, 15950, 15978, 15950, 15950, 15950, 15950, 15950, 15946, 15950, 15950, 15938, 15947, 15950, 15950, 15946, 15950, 15950, 15950, 15938, 15946, 15950, 15966, 15946, 15950, 15950, 15950, 15938, 15947, 15950, 15950, 15950, 15950, 15950, 15950, 15946, 15949, 15950, 15966, 15950, 15946, 15950, 15966, 15950, 15950, 15950, 15950, 15946, 15949, 15950, 15950, 15938, 15947, 15950, 15950, 15946, 15950, 15950, 15950, 15958, 15948, 15949, 15992, 15946, 15949, 15950, 15950, 15950, 15949, 15950, 15966, 15950, 15949, 15950, 15966, 15942, 15950, 15950, 15992, 15938, 15950, 15950, 15950, 15950, 15950, 15950, 15966, 15946, 15947, 15950, 15950, 15966, 15949, 15950, 15976, 15950, 15950, 15950, 15966, 15938, 15950, 15950, 15992, 15938, 15942, 15950, 15950, 15950, 15950, 15949, 15976, 15942, 15943, 15950, 15966, 15938, 15950, 15950, 15950, 15946, 15948, 15950, 15950, 15938, 15947, 15950, 15966, 15950, 15950, 15950, 15950, 15935, 15948, 15950, 15992, 15938, 15950, 15950, 15950, 15950, 15950, 15948, 15976, 15942, 15943, 15950, 15966, 15962, 15950, 15950, 15992, 15938, 15976, 15976, 15928, 15973, 15995, 15950, 15950, 15946, 15948, 15950, 15950, 15938, 15947, 15950, 15966, 15950, 15950, 15950, 15949, 15942, 15948, 15947, 15992, 15942, 15949, 15950, 15966, 15942, 15950, 15949, 15966, 15946, 15946, 15950, 15950, 15966, 15949, 15949, 15966, 15950, 15950, 15950, 15966, 15942, 15950, 15950, 15992, 15938, 15949, 15950, 15950, 15950, 15950, 15946, 15976, 15942, 15949, 15950, 15966, 15942, 15950, 15949, 15950, 15946, 15946, 15950, 15950, 15950, 15949, 15950, 15992, 15950, 15947, 15950, 15992, 15946, 15950, 15950, 15950, 15950, 15950, 15950, 15976, 15946, 15949, 15950, 15992, 15950, 15945, 15950, 15966, 15942, 15950, 15949, 15950, 15946, 15947, 15950, 15950, 15950, 15949, 15950, 15976, 15950, 15950, 15950, 15966, 15946, 15950, 15948, 15950, 15946, 15950, 15950, 15950, 15950, 15949, 15950, 15966, 15950, 15947, 15950, 15992, 15946, 15950, 15950, 15950, 15950, 15950, 15950, 15976, 15946, 15949, 15950, 15966, 15950, 15945, 15950, 15966, 15950, 15950, 15949, 15950, 15946, 15949, 15950, 15950, 15950, 15949, 15950, 15950, 15950, 15967, 15950, 15962, 15976, 15947, 15950, 15950, 15950, 15942, 15950, 15950, 15946, 15949, 15950, 15976, 15950, 15949, 15950, 15966, 15946, 15950, 15950, 15966, 15946, 15950, 15950, 15950, 15950, 15949, 15950, 15942, 15950, 15949, 15950, 15966, 15938, 15950, 15950, 15992, 15967, 15904, 15904, 15904, 15904, 15904, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15937, 15976, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15936, 15950, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15938, 15992, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15966, 15946, 15946, 15950, 15950, 15968, 15949, 15950, 15950, 15950, 15949, 15950, 15966, 15962, 15950, 15950, 15992, 15938, 15950, 15950, 15950, 15950, 15950, 15950, 15966, 15946, 15943, 15950, 15950, 15966, 15949, 15949, 15976, 15950, 15950, 15950, 15966, 15980, 15950, 15950, 15950, 15946, 15945, 15950, 15950, 15958, 15948, 15949, 15992, 15946, 15943, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15950, 15950, 15966, 15980, 15950, 15948, 15966, 15946, 15950, 15950, 15950, 15927, 15948, 15950, 15992, 15967, 15904, 15950, 15950, 15950, 15950, 15947, 15966, 15942, 15941, 15950, 15966, 15938, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15938, 15947, 15948, 15950, 15950, 15950, 15950, 15949, 15942, 15948, 15947, 15992, 15942, 15949, 15950, 15966, 15966, 15950, 15950, 15950, 15946, 15943, 15950, 15950, 15938, 15947, 15950, 15966, 15950, 15950, 15950, 15950, 15950, 15948, 15950, 15966, 15946, 15943, 15950, 15950, 15962, 15949, 15949, 15976, 15950, 15946, 15950, 15966, 15980, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15942, 15947, 15937, 15950, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15937, 15976, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15938, 15992, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15966, 15946, 15946, 15950, 15950, 15968, 15949, 15950, 15966, 15950, 15949, 15950, 15966, 15962, 15950, 15950, 15992, 15938, 15950, 15950, 15950, 15950, 15950, 15950, 15966, 15946, 15943, 15950, 15950, 15966, 15949, 15948, 15950, 15950, 15950, 15950, 15966, 
        15980, 15950, 15950, 15950, 15946, 15945, 15950, 15950, 15958, 15948, 15949, 15992, 15946, 15941, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15950, 15950, 15966, 15980, 15950, 15948, 15966, 15946, 15949, 15950, 15950, 15927, 15948, 15950, 15992, 15967, 15904, 15950, 15950, 15950, 15950, 15947, 15966, 15942, 15941, 15950, 15966, 15938, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15938, 15947, 15948, 15950, 15950, 15950, 15950, 15949, 15942, 15948, 15947, 15992, 15942, 15949, 15950, 15966, 15966, 15950, 15950, 15950, 15946, 15943, 15950, 15950, 15938, 15947, 15950, 15966, 15950, 15950, 15950, 15950, 15950, 15948, 15950, 15966, 15946, 15943, 15950, 15950, 15962, 15949, 15948, 15950, 15950, 15946, 15950, 15966, 15972, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15942, 15947, 15938, 15976, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15937, 15992, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15950, 15942, 15947, 15937, 15950, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15966, 15946, 15946, 15950, 15950, 15968, 15949, 15950, 15976, 15950, 15947, 15950, 15966, 15962, 15950, 15950, 15992, 15967, 15904, 15950, 15950, 15950, 15950, 15947, 15966, 15942, 15949, 15950, 15966, 15958, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15950, 15949, 15949, 15976, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15966, 15946, 15946, 15950, 15950, 15950, 15949, 15949, 15966, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15950, 15966, 15946, 15944, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15950, 15950, 15966, 15958, 15950, 15947, 15992, 15942, 15947, 15950, 15904, 15927, 15950, 15950, 15950, 15950, 15937, 15950, 15976, 15972, 15949, 15950, 15992, 15950, 15950, 15950, 15966, 15966, 15950, 15950, 15992, 15938, 15942, 15950, 15950, 15950, 15950, 15946, 15976, 15942, 15967, 15950, 15976, 15946, 15949, 15949, 15950, 15950, 15950, 15950, 15966, 15962, 15950, 15950, 15992, 15938, 15966, 15950, 15950, 15950, 15950, 15946, 15976, 15942, 15947, 15950, 15904, 15927, 15950, 15950, 15950, 15950, 15937, 15950, 15976, 15946, 15949, 15949, 15976, 15950, 15950, 15950, 15966, 15966, 15950, 15950, 15950, 15946, 15944, 15950, 15950, 15927, 15948, 15950, 15992, 15967, 15904, 15950, 15950, 15950, 15950, 15947, 15966, 15942, 15941, 15950, 15966, 15938, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15938, 15947, 15948, 15950, 15950, 15950, 15950, 15949, 15942, 15948, 15947, 15992, 15942, 15949, 15950, 15966, 15966, 15950, 15950, 15950, 15946, 15945, 15950, 15950, 15938, 15947, 15944, 15950, 15950, 15950, 15950, 15949, 15942, 15948, 15950, 15992, 15967, 15904, 15950, 15950, 15950, 15950, 15947, 15966, 15942, 15949, 15950, 15966, 15958, 15950, 15950, 15950, 15946, 15946, 15950, 15950, 15950, 15949, 15949, 15976, 15950, 15967, 15950, 15976, 15938, 15947, 15904, 15992, 15950, 15950, 15950, 15950, 15935, 15948, 15948, 15966, 15946, 15947, 15950, 15950, 15950, 15949, 15949, 15950, 15950, 15947, 15950, 15992, 15976, 15950, 15950, 15950, 15950, 15964, 15950, 15976, 15927, 15948, 15950, 15992, 15946, 15946, 15950, 15949, 15938, 15948, 15949, 15950, 15967, 15904, 15904, 15904, 15904, 15904, 15950, 15950, 15950, 15950, 15950, 15950, 15935, 15948, 15947, 15992, 15946, 15922, 15993, 15957, 15977, 15929, 15950, 15982, 15950, 15982, 15971, 15963, 15969, 15963, 15997, 15967, 15938, 15949, 15971, 15970, 15966, 15939, 15975, 15978, 15927, 15935, 15935, 15968, 15991, 15976, 15975, 15978, 15997, 15976, 5073, -9140, -9093, -9093, -9114, -9093, -9178, -9112, -9137, -9112, -9120, -9115, -9175, -9094, -9108, -9093, -9089, -9108, -9093, -9175, -9145, -9108, -9091, -9090, -9114, -9093, -9118, -9175, -9113, -9114, -9091, -9175, -9112, -9089, -9112, -9120, -9115, -9112, -9109, -9115, -9108, -9140, -9093, -9093, -9114, -9093, -9175, -9142, -9127, -9112, -9110, -9118, -9112, -9106, -9108, -9180, -9145, -9112, -9116, -9108, -9135, -9180, -9148, -9123, -9180, -9125, -9135, -9180, -9148, -9123, -9180, -9142, -9135, -9180, -9148, -9123, -9180, -9144, -9127, -9146, -9126, -9123, -9092, -9093, -9115, -9110, -9114, -9107, -9108, -9116, -9108, -9094, -9094, -9112, -9106, -9108, -9119, -9108, -9112, -9107, -9108, -9093, -9094, -9110, -9114, -9113, -9091, -9108, -9113, -9091, 6627, -15399, -15398, -15406, -15396, -15397, -15404, -15402, -15394, -15417, -15398, -15423, -15404, -15423, -15408, 7512, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 31306, 9698, -14950, -14892, -14888, -14884, -14894, -14905, -14892, -14911, -14896, 6416, 5539, 5615, 8135, -31489, -31565, 297, -19711, -19636};
        SparseIntArray sparseIntArray = null;
        String strM6966 = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        int i6 = -1132994943;
        int i7 = C0950.f3488;
        int i8 = C2834.f9334;
        int iM2761 = C0619.m2761("۫ᩳ") ^ i8;
        int i9 = ((iM2761 ^ i7) * (-473)) ^ 1614869079;
        int i10 = -1794763348;
        while (true) {
            i6 = ((((i6 ^ i7) * 27269) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2123422815:
                case 672665975:
                    f8319 = C21576.m49092();
                    if (C17202.f56030) {
                        iM2761 = (C0619.m2761("ۨ᩻") + i8) * (-55);
                        i9 = ((iM2761 ^ i7) * 1809) ^ 1435666666;
                        i10 = -1214658861;
                    } else {
                        iM2761 = C0773.m3169("᩺᩹") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32401)) ^ (-919084);
                        i10 = 642754458;
                    }
                    break;
                case -2092474552:
                case 926610933:
                    AbstractC3624.m11755();
                    AbstractC3624.m11755();
                    iM2761 = C0773.m3169("ۡۢ") ^ i7;
                    i9 = ((iM2761 ^ i8) * 12065) ^ (-285707181);
                    i10 = -201727329;
                    break;
                case -2073792635:
                case 1097827944:
                    f8320 = new ReentrantReadWriteLock();
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ۡۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12065) ^ (-285707181);
                        i10 = -201727329;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۙ֫")) * 99;
                        i9 = ((iM2761 ^ i8) * 27353) ^ 1634890263;
                        i10 = -2114969246;
                    }
                    break;
                case -1956142385:
                case -632336236:
                    s = f8322[0];
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩺᩹") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32401)) ^ (-919084);
                        i10 = 642754458;
                    } else {
                        iM2761 = C0773.m3169("֨ۖ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 9983) ^ 339422626;
                        i10 = 1112177665;
                    }
                    break;
                case -1684647236:
                case 1691527314:
                    C3448.m11248();
                    throw new RuntimeException();
                case -1566103958:
                case -224708553:
                    f8321 = new byte[4];
                    i = Build.VERSION.SDK_INT;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۡۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12065) ^ (-285707181);
                        i10 = -201727329;
                    } else {
                        iM2761 = C0773.m3169("᩻ۢ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 29621) ^ 422859415;
                        i10 = -108445308;
                    }
                    break;
                case -1228681325:
                case 897531827:
                    f8318 = i;
                    sArr = f8322;
                    i5 = 25;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i8 - C0773.m3169("᩹᩶")) * (-115);
                        i9 = ((iM2761 ^ i7) * (-16943)) ^ (-1871740582);
                        i10 = -1159540358;
                    } else {
                        iM2761 = C0773.m3169("᩶ۘ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-9687)) ^ 95418940;
                        i10 = -833869763;
                    }
                    break;
                case -1135602914:
                case 1798491956:
                    sparseIntArray.put(4117, 350);
                    return;
                case -1012585465:
                case 32942687:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (i8 - C0773.m3169("᩹᩶")) * (-115);
                        i9 = ((iM2761 ^ i7) * (-16943)) ^ (-1871740582);
                        i10 = -1159540358;
                    } else {
                        iM2761 = C0773.m3169("᩺᩹") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32401)) ^ (-919084);
                        i10 = 642754458;
                    }
                    break;
                case -737606769:
                case 1010294940:
                    f8324 = C16157.m38331(strM6966);
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ᩴۢ") ^ i7) * (-7);
                        i9 = ((iM2761 ^ i8) * (-26411)) ^ 1460614866;
                        i10 = -602542867;
                    } else {
                        iM2761 = (C0773.m3169("ᩳܰ") + i8) * 71;
                        i9 = ((iM2761 ^ i7) * 21893) ^ 921127470;
                        i10 = 1559361489;
                    }
                    break;
                case -641921811:
                case 1791848220:
                    C0487.m2356();
                    if (!C3077.f9998) {
                        iM2761 = (C0619.m2761("᩵۫") ^ i7) * 11;
                        i9 = ((iM2761 ^ i8) * (-24103)) ^ 1934462915;
                        i10 = 1233486987;
                    } else {
                        iM2761 = C0773.m3169("᩺᩹") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32401)) ^ (-919084);
                        i10 = 642754458;
                    }
                    break;
                case -339882196:
                case 1761959285:
                    C23916.m53419();
                    if (C3779.f12953 > 0) {
                        iM2761 = (C0619.m2761("᩵۫") ^ i7) * 11;
                        i9 = ((iM2761 ^ i8) * (-24103)) ^ 1934462915;
                        i10 = 1233486987;
                    } else {
                        iM2761 = C0773.m3169("ۡۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12065) ^ (-285707181);
                        i10 = -201727329;
                    }
                    break;
                case -193533172:
                case 1371761941:
                    strM6966 = C2023.m6966(f8322, 1, 24, i4);
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۡۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12065) ^ (-285707181);
                        i10 = -201727329;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-227)) ^ (-908489951);
                        i10 = 1126280709;
                    }
                    break;
                case -36530872:
                case 208626326:
                    if ((s * 3244) - (i2 + i3) <= 0) {
                        iM2761 = C0773.m3169("۠۬") ^ i7;
                        i9 = ((iM2761 ^ i8) * 16151) ^ (-442375415);
                        i10 = -1553304877;
                    } else {
                        iM2761 = (C0619.m2761("ۙ۫") ^ i8) * (-19);
                        i9 = ((iM2761 ^ i7) * (-6241)) ^ (-688620544);
                        i10 = 1127403598;
                    }
                    break;
                case 469882218:
                case 876689651:
                    i4 = 5429;
                    iM2761 = C0619.m2761("ܺۘ") ^ i8;
                    i9 = ((iM2761 ^ i7) * (-8421)) ^ 1429475201;
                    i10 = 2123576103;
                    break;
                case 836395049:
                case 1945044798:
                    sparseIntArray = new SparseIntArray();
                    f8316 = sparseIntArray;
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0619.m2761("ᩴۢ") ^ i7) * (-7);
                        i9 = ((iM2761 ^ i8) * (-26411)) ^ 1460614866;
                        i10 = -602542867;
                    } else {
                        iM2761 = C0619.m2761("۬ۨ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 19463) ^ (-415905962);
                        i10 = -1087153625;
                    }
                    break;
                case 1317346782:
                case 1589515636:
                    i4 = 50516;
                    iM2761 = C0619.m2761("ܺۘ") ^ i8;
                    i9 = ((iM2761 ^ i7) * (-8421)) ^ 1429475201;
                    i10 = 2123576103;
                    break;
                case 1499759923:
                case 1628928129:
                    f8317 = C1564.m5510(sArr, i5, 32, i4);
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩺᩹") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32401)) ^ (-919084);
                        i10 = 642754458;
                    } else {
                        iM2761 = C0773.m3169("᩷ۙ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 21545) ^ 1422496324;
                        i10 = -216359540;
                    }
                    break;
                default:
                    i2 = s * s;
                    i3 = 2630884;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i8 - C0773.m3169("᩹᩶")) * (-115);
                        i9 = ((iM2761 ^ i7) * (-16943)) ^ (-1871740582);
                        i10 = -1159540358;
                    } else {
                        iM2761 = C0773.m3169("ۖ֡") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-17245)) ^ (-1916786149);
                        i10 = 1794759407;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8676(String str) {
        int i = 1351540735;
        int i2 = C1321.f4751;
        int i3 = C3033.f9831;
        int iM3169 = (C0773.m3169("ۧ֫") + i3) * 47;
        int i4 = ((iM3169 ^ i2) * 16305) ^ (-1666301744);
        int i5 = -965682104;
        while (true) {
            i = ((((i ^ i2) * (-9833)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1578587252:
                case 1393807335:
                    C2354.m7983();
                    iM3169 = C0773.m3169("ܺܿ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-913)) ^ (-339483656);
                    i5 = 1259749923;
                    break;
                case -1303102263:
                case -309429731:
                    C0619.m2763();
                    C3099.m10095();
                    break;
                case -1293769028:
                case -636118067:
                    this.f8330 = true;
                    break;
                case -1049298079:
                case 479564048:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0773.m3169("ܺܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-913)) ^ (-339483656);
                        i5 = 1259749923;
                    } else {
                        iM3169 = (C0619.m2761("۫ۜ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 2891) ^ (-998310967);
                        i5 = -1973078675;
                    }
                    break;
                case -931300227:
                case -455812411:
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0773.m3169("ܰ᩶") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-18519)) ^ 1528737756;
                        i5 = 1312497464;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩵᩷")) * (-85);
                        i4 = ((iM3169 ^ i2) * (-30083)) ^ 1788051416;
                        i5 = 1189187080;
                    }
                    break;
                case -846590796:
                case 1023242251:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܺܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-913)) ^ (-339483656);
                        i5 = 1259749923;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֡۬")) * (-119);
                        i4 = ((iM3169 ^ i2) * (-31103)) ^ (-1330134778);
                        i5 = -355279927;
                    }
                    break;
                case -807271654:
                case 683176083:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17537)) ^ (-1148535216);
                        i5 = 311974834;
                    } else {
                        iM3169 = C0619.m2761("ۘ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3847) ^ 1941319205;
                        i5 = 1938894999;
                    }
                    break;
                case -752169510:
                case 590055327:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܰ᩶") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-18519)) ^ 1528737756;
                        i5 = 1312497464;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۗ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17537)) ^ (-1148535216);
                        i5 = 311974834;
                    }
                    break;
                case -720816603:
                case 1505129384:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۜ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19273)) ^ 90220282;
                        i5 = 185079408;
                    } else {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13723)) ^ 967683715;
                        i5 = -856364374;
                    }
                    break;
                case -650695659:
                case -292689450:
                    C3033.m9845();
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17537)) ^ (-1148535216);
                        i5 = 311974834;
                    } else {
                        iM3169 = C0773.m3169("ܺܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-913)) ^ (-339483656);
                        i5 = 1259749923;
                    }
                    break;
                case -579020117:
                case 1491576993:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (C0773.m3169("ܰ᩶") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-18519)) ^ 1528737756;
                        i5 = 1312497464;
                    } else {
                        iM3169 = C0619.m2761("ܰܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31937)) ^ (-708645023);
                        i5 = -916794684;
                    }
                    break;
                case -296413260:
                case 1781341054:
                    this.f8332 = str;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܽܰ") + i2) * 31;
                        i4 = ((iM3169 ^ i3) * (-27795)) ^ (-908972200);
                        i5 = 1169149687;
                    } else {
                        iM3169 = C0619.m2761("ۚۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4325) ^ (-1534612722);
                        i5 = 343581317;
                    }
                    break;
                case 467716688:
                case 2098015135:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ܰ᩶") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-18519)) ^ 1528737756;
                        i5 = 1312497464;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܺܳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 18731) ^ 1993460916;
                        i5 = -1583055704;
                    }
                    break;
                case 615705637:
                case 1764807749:
                    C11235.m28309();
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13723)) ^ 967683715;
                        i5 = -856364374;
                    } else {
                        iM3169 = C0773.m3169("ܺܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-913)) ^ (-339483656);
                        i5 = 1259749923;
                    }
                    break;
                case 646322024:
                case 904095712:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17537)) ^ (-1148535216);
                        i5 = 311974834;
                    } else {
                        iM3169 = C0619.m2761("ۖᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31425) ^ 1892276733;
                        i5 = -1173512138;
                    }
                    break;
                default:
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17537)) ^ (-1148535216);
                        i5 = 311974834;
                    } else {
                        iM3169 = C0773.m3169("ۜۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24699)) ^ (-1191558312);
                        i5 = -25187167;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8669(Locale locale) {
        int iM3169;
        int i;
        String language = null;
        int iM10045 = 0;
        int i2 = 0;
        byte[] bArr = null;
        byte b = 0;
        int i3 = 0;
        byte bM4937 = 0;
        String country = null;
        char c = 0;
        byte bM4938 = 0;
        int i4 = -352832166;
        int i5 = C0269.f1558;
        int i6 = C3099.f10023;
        int iM2761 = C0619.m2761("᩹ۙ") ^ i5;
        int i7 = ((iM2761 ^ i6) * (-3297)) ^ 1901221452;
        int i8 = -349018147;
        while (true) {
            int i9 = iM2761 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i6) * 11221) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2039964133:
                    case 544784691:
                        C17202.m40372();
                        if (C2834.f9334 > 0) {
                            iM2761 = (C0619.m2761("᩹᩺") + i5) * 21;
                            i7 = ((iM2761 ^ i6) * (-13935)) ^ (-611681380);
                            i8 = 1855422111;
                        } else {
                            iM2761 = (i6 - C0773.m3169("᩹۫")) * 43;
                            i7 = ((iM2761 ^ i5) * 8731) ^ 93537209;
                            i8 = -1948101694;
                        }
                        break;
                    case -2003360687:
                    case -1800522747:
                        bArr[i2] = (byte) C1343.m4937(language, i2);
                        iM2761 = (C0773.m3169("۫᩻") + i6) * (-53);
                        i7 = ((iM2761 ^ i5) * (-9629)) ^ (-1027843482);
                        i8 = 1073029191;
                        break;
                    case -1990893355:
                    case 197782068:
                        country = locale.getCountry();
                        if (C2966.m9671(country) == i3) {
                            iM3169 = (C0619.m2761("۬ܳ") + i5) * (-55);
                            i7 = ((iM3169 ^ i6) * (-31409)) ^ 892349299;
                            i = -1967229140;
                        } else {
                            iM3169 = (C0773.m3169("۠᩵") ^ i5) * 25;
                            i7 = ((iM3169 ^ i6) * 9349) ^ (-1764645691);
                            i = -1113161404;
                        }
                        i9 = iM3169 ^ i;
                        c = 3;
                        break;
                    case -1989667063:
                    case -998783934:
                        language = locale.getLanguage();
                        if (C2288.f7433 > 0) {
                            iM2761 = C0773.m3169("֡᩶") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-23701)) ^ (-534900789);
                            i8 = -749424943;
                        } else {
                            iM2761 = C0619.m2761("ۨۚ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-30637)) ^ (-381443138);
                            i8 = -154558316;
                        }
                        break;
                    case -1978901889:
                    case -870720744:
                        bArr[c] = (byte) C1343.m4937(country, i2);
                        break;
                    case -1885829409:
                    case 1443165541:
                        C13473.m33144();
                        RunnableC3055.m9933();
                        iM2761 = (i6 - C0773.m3169("᩹۫")) * 43;
                        i7 = ((iM2761 ^ i5) * 8731) ^ 93537209;
                        i8 = -1948101694;
                        break;
                    case -1885778019:
                    case 1762397836:
                        if (C4238.f15451 < 0) {
                            iM2761 = C0619.m2761("ۨۚ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-30637)) ^ (-381443138);
                            i8 = -154558316;
                            break;
                        }
                        iM2761 = (C0619.m2761("᩹᩺") + i5) * 21;
                        i7 = ((iM2761 ^ i6) * (-13935)) ^ (-611681380);
                        i8 = 1855422111;
                        break;
                    case -1689243570:
                    case -1074340960:
                        bArr = f8321;
                        b = 0;
                        i3 = 2;
                        if (iM10045 != 2) {
                            iM2761 = C0773.m3169("ۨۛ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-25237)) ^ (-642894759);
                            i8 = -1946939891;
                        } else {
                            iM2761 = C0619.m2761("ᩳܺ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-17645)) ^ 645861519;
                            i8 = -304550410;
                        }
                        break;
                    case -1531819295:
                    case -1122703626:
                        bArr[b] = b;
                        bArr[i2] = b;
                        iM2761 = (C0773.m3169("۫᩻") + i6) * (-53);
                        i7 = ((iM2761 ^ i5) * (-9629)) ^ (-1027843482);
                        i8 = 1073029191;
                        break;
                        break;
                    case -1279459082:
                    case 1225721973:
                        if (AbstractC0116.f1064 > 0) {
                            iM2761 = C0619.m2761("۬۫") ^ i6;
                            i7 = ((iM2761 ^ i5) * 27127) ^ 2036539142;
                            i8 = 1486205125;
                        } else {
                            iM2761 = C0619.m2761("ۨۚ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-30637)) ^ (-381443138);
                            i8 = -154558316;
                        }
                        break;
                    case -1249301417:
                    case 410865602:
                        bM4937 = (byte) C1343.m4937(language, b);
                        if (C2287.f7432 < 0) {
                            iM2761 = (C0773.m3169("֡ܳ") + i5) * 43;
                            i7 = ((iM2761 ^ i6) * 10475) ^ (-1210171863);
                            i8 = 189044200;
                        } else {
                            iM2761 = C0773.m3169("ܿ᩻") ^ i6;
                            i7 = ((iM2761 ^ i5) * 28207) ^ 279906883;
                            i8 = -566583423;
                        }
                        break;
                    case -1215105616:
                    case 763006023:
                        i2 = 1;
                        if (C0487.f2131 > 0) {
                            iM2761 = (i5 - C0773.m3169("۟۠")) * (-13);
                            i7 = ((iM2761 ^ i6) * (-4365)) ^ (-1268042054);
                            i8 = 35995796;
                        } else {
                            iM2761 = C0619.m2761("ۨۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 30495) ^ (-158324855);
                            i8 = 828254459;
                        }
                        break;
                    case -992544058:
                    case 941036021:
                        bArr[i3] = bM4938;
                        if (C0487.f2131 > 0) {
                            iM2761 = (C0773.m3169("ܰۤ") ^ i5) * (-21);
                            i7 = ((iM2761 ^ i6) * 263) ^ 521799966;
                            i8 = -751932447;
                        } else {
                            iM2761 = C0773.m3169("ܿ᩻") ^ i6;
                            i7 = ((iM2761 ^ i5) * 28207) ^ 279906883;
                            i8 = -566583423;
                        }
                        break;
                    case -759442570:
                    case -644881287:
                        if (C3448.f11240 >= 0) {
                            iM2761 = C0773.m3169("ܿ᩻") ^ i6;
                            i7 = ((iM2761 ^ i5) * 28207) ^ 279906883;
                            i8 = -566583423;
                            break;
                        }
                        iM2761 = (C0619.m2761("᩹᩺") + i5) * 21;
                        i7 = ((iM2761 ^ i6) * (-13935)) ^ (-611681380);
                        i8 = 1855422111;
                        break;
                    case -244014023:
                    case 1562107066:
                        bM4938 = (byte) C1343.m4937(country, b);
                        if (C1343.f4799 == 0) {
                            iM2761 = C0619.m2761("᩹ۢ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-2689)) ^ (-285174333);
                            i8 = -1668858935;
                        } else {
                            iM2761 = (C0619.m2761("᩹᩺") + i5) * 21;
                            i7 = ((iM2761 ^ i6) * (-13935)) ^ (-611681380);
                            i8 = 1855422111;
                        }
                        break;
                    case -71399437:
                    case 2064034245:
                        bArr[b] = bM4937;
                        if (RunnableC0334.f1808 > 0) {
                            iM2761 = C0619.m2761("ۢᩳ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 16443) ^ (-1992843316);
                            i8 = -855891630;
                        } else {
                            iM2761 = C0773.m3169("ܿ᩻") ^ i6;
                            i7 = ((iM2761 ^ i5) * 28207) ^ 279906883;
                            i8 = -566583423;
                        }
                        break;
                    case -65864133:
                    case 1605701332:
                        if (C2375.m8065() > 0) {
                            iM2761 = C0773.m3169("ܶۧ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-2189)) ^ (-944186841);
                            i8 = -1021356937;
                        } else {
                            iM2761 = C0619.m2761("ۨۚ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-30637)) ^ (-381443138);
                            i8 = -154558316;
                        }
                        break;
                    case 13080380:
                    case 505345232:
                        iM10045 = C3077.m10045(language);
                        if (C0862.f3233 == 0) {
                            iM2761 = (i6 - C0619.m2761("ܳۙ")) * (-73);
                            i7 = ((iM2761 ^ i5) * (-27497)) ^ 1768131390;
                            i8 = 1728762416;
                        } else {
                            iM2761 = (i6 - C0773.m3169("᩹۫")) * 43;
                            i7 = ((iM2761 ^ i5) * 8731) ^ 93537209;
                            i8 = -1948101694;
                        }
                        break;
                    case 541535550:
                    case 1492199703:
                        bArr[i3] = b;
                        bArr[c] = b;
                        break;
                    case 1092995446:
                    case 1585922366:
                        AbstractC0116.m1243();
                        C17202.m40372();
                        break;
                    default:
                        if (C3448.f11240 < 0) {
                            iM2761 = (C0773.m3169("᩵ܰ") + i5) * 67;
                            i7 = ((iM2761 ^ i6) * 20717) ^ (-236662069);
                            i8 = -739289064;
                        } else {
                            iM2761 = C0773.m3169("ܿ᩻") ^ i6;
                            i7 = ((iM2761 ^ i5) * 28207) ^ 279906883;
                            i8 = -566583423;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0159 A[PHI: r2 r4 r12
      0x0159: PHI (r2v4 long) = (r2v2 long), (r2v3 long), (r2v2 long), (r2v2 long), (r2v2 long), (r2v2 long), (r2v2 long) binds: [B:49:0x0157, B:45:0x013e, B:37:0x0104, B:27:0x0097, B:16:0x004d, B:13:0x0044, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r4v4 long) = (r4v2 long), (r4v2 long), (r4v3 long), (r4v2 long), (r4v2 long), (r4v2 long), (r4v2 long) binds: [B:49:0x0157, B:45:0x013e, B:37:0x0104, B:27:0x0097, B:16:0x004d, B:13:0x0044, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r12v8 l.۫۠֫) = (r12v4 l.۫۠֫), (r12v4 l.۫۠֫), (r12v4 l.۫۠֫), (r12v5 l.۫۠֫), (r12v4 l.۫۠֫), (r12v4 l.۫۠֫), (r12v4 l.۫۠֫) binds: [B:49:0x0157, B:45:0x013e, B:37:0x0104, B:27:0x0097, B:16:0x004d, B:13:0x0044, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac A[PHI: r0 r1
      0x01ac: PHI (r0v6 l.ۛܳۨ) = (r0v5 l.ۛܳۨ), (r0v2 l.ۛܳۨ), (r0v2 l.ۛܳۨ), (r0v2 l.ۛܳۨ) binds: [B:57:0x01aa, B:53:0x018a, B:41:0x0120, B:33:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r1v4 java.util.concurrent.TimeUnit) = 
      (r1v3 java.util.concurrent.TimeUnit)
      (r1v2 java.util.concurrent.TimeUnit)
      (r1v2 java.util.concurrent.TimeUnit)
      (r1v2 java.util.concurrent.TimeUnit)
     binds: [B:57:0x01aa, B:53:0x018a, B:41:0x0120, B:33:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C24363 m8670() {
        int iM2761;
        int i;
        C6463 c6463M54267 = null;
        TimeUnit timeUnit = null;
        long j = 0;
        long j2 = 0;
        int i2 = -312615555;
        int i3 = C0950.f3488;
        int i4 = C2375.f7641;
        int iM3169 = C0773.m3169("۬ۚ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 24555) ^ (-1849574815);
        int i6 = 1114672898;
        while (true) {
            int i7 = iM3169 ^ i6;
            C12970 c12970 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 26505) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2126606686:
                    case 532569860:
                        if (C3033.f9831 >= 0) {
                            iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                            i = 1539051596;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ܿ᩸")) * (-55);
                            i5 = ((iM2761 ^ i4) * (-4157)) ^ (-1729954202);
                            i = 110059687;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -2091397556:
                    case 913300252:
                        j = 15;
                        if (C2375.m8065() <= 0) {
                            iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                            i = 1539051596;
                        } else {
                            iM2761 = C0773.m3169("ۗۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-31835)) ^ 2071779498;
                            i = 637076837;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -2050158165:
                    case -1081212065:
                        c6463M54267.m18273(c12970);
                        f8323 = c6463M54267.m18265();
                        iM2761 = C0773.m3169("᩷֨") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-793)) ^ 104378130;
                        i = 680820995;
                        i7 = iM2761 ^ i;
                        break;
                    case -1965705677:
                    case 2135915327:
                        if (C3492.f12043 > 0) {
                            c12970 = new C12970();
                            if (C1080.f3865 >= 0) {
                                iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                                i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                                i = 1539051596;
                            } else {
                                iM2761 = (C0619.m2761("ۘ᩺") + i3) * (-63);
                                i5 = ((iM2761 ^ i4) * (-32735)) ^ (-894304541);
                                i = 1938117137;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1621746294:
                    case -803595689:
                        if (RunnableC3646.m11813() == 0) {
                            iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                            i = 1539051596;
                        } else {
                            iM2761 = (C0619.m2761("֫۟") ^ i3) * 5;
                            i5 = ((iM2761 ^ i4) * 29597) ^ 1670450885;
                            i = 537322271;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1590888238:
                    case -1417023062:
                        C1343.m4943();
                        iM2761 = C0619.m2761("۠᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 27903) ^ (-1945771040);
                        i = -2133271244;
                        i7 = iM2761 ^ i;
                        break;
                    case -1438193404:
                    case -200890662:
                        C2419.m8174();
                        return null;
                    case -1078186690:
                    case 1674524528:
                        return f8323;
                    case -1005539832:
                    case -715406272:
                        if (f8323 == null) {
                            iM2761 = (C0619.m2761("ۘ᩻") ^ i4) * (-45);
                            i5 = ((iM2761 ^ i3) * 18253) ^ 536430319;
                            i = 178409718;
                        } else {
                            iM2761 = C0773.m3169("᩷֨") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-793)) ^ 104378130;
                            i = 680820995;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -926620857:
                    case 1361529846:
                        c6463M54267.m18267(j, timeUnit);
                        if (C3690.f12684 <= 0) {
                            iM2761 = (C0619.m2761("ۖۧ") ^ i4) * 127;
                            i5 = ((iM2761 ^ i3) * 16307) ^ (-2000397976);
                            i = 449863851;
                        } else {
                            iM2761 = C0773.m3169("᩵᩶") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-28899)) ^ (-765359822);
                            i = 1884626084;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -771420800:
                    case 225327999:
                        if (C4282.m13644()) {
                            iM2761 = (C0619.m2761("ۨ۟") + i4) * 11;
                            i5 = ((iM2761 ^ i3) * 6677) ^ (-1163692022);
                            i = 438796500;
                        } else {
                            iM2761 = (C0619.m2761("ۖۧ") ^ i4) * 127;
                            i5 = ((iM2761 ^ i3) * 16307) ^ (-2000397976);
                            i = 449863851;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -741261177:
                    case 1149311423:
                        AbstractC0116.m1243();
                        if (C2375.f7641 > 0) {
                            iM2761 = C0619.m2761("۠᩷") ^ i4;
                            i5 = ((iM2761 ^ i3) * 27903) ^ (-1945771040);
                            i = -2133271244;
                        } else {
                            iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                            i = 1539051596;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -697591161:
                    case -526817805:
                        AbstractC0641.m2813();
                        if (!C3077.f9998) {
                        }
                        iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                        i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                        i = 1539051596;
                        i7 = iM2761 ^ i;
                        break;
                    case -411188183:
                    case 804474559:
                        c6463M54267.m18276(j, timeUnit);
                        j2 = 20;
                        if (C3033.f9831 >= 0) {
                            iM2761 = (C0619.m2761("۟ܶ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * 15735) ^ (-1510127674);
                            i = 1539051596;
                        } else {
                            iM2761 = C0773.m3169("ۨ֨") ^ i4;
                            i5 = ((iM2761 ^ i3) * 7133) ^ (-1891228207);
                            i = 764452450;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1345962925:
                    case 2118530904:
                        c6463M54267 = C24258.m54267();
                        timeUnit = TimeUnit.SECONDS;
                        if (C3492.f12043 <= 0) {
                            iM2761 = (C0619.m2761("ۖۧ") ^ i4) * 127;
                            i5 = ((iM2761 ^ i3) * 16307) ^ (-2000397976);
                            i = 449863851;
                        } else {
                            iM2761 = (C0773.m3169("᩷ۚ") + i3) * (-115);
                            i5 = ((iM2761 ^ i4) * 28137) ^ (-963310571);
                            i = -940382557;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1498337755:
                    case 1864857771:
                        c6463M54267.m18278(j2, timeUnit);
                        if (C2834.f9334 <= 0) {
                            iM2761 = (C0619.m2761("ۖۧ") ^ i4) * 127;
                            i5 = ((iM2761 ^ i3) * 16307) ^ (-2000397976);
                            i = 449863851;
                        } else {
                            iM2761 = (C0619.m2761("ܰ᩹") ^ i4) * (-51);
                            i5 = ((iM2761 ^ i3) * (-24019)) ^ (-1205818073);
                            i = 648101093;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        c6463M54267.m18266(30L);
                        if (C1826.f6190 <= 0) {
                            iM2761 = (C0619.m2761("֫۟") ^ i3) * 5;
                            i5 = ((iM2761 ^ i4) * 29597) ^ 1670450885;
                            i = 537322271;
                        } else {
                            iM2761 = (i3 - C0619.m2761("۬ܰ")) * 99;
                            i5 = ((iM2761 ^ i4) * (-17403)) ^ 1395874889;
                            i = -11475445;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
            }
            iM3169 = (C0619.m2761("᩵ۨ") + i3) * (-7);
            i5 = ((iM3169 ^ i4) * (-25167)) ^ 321590275;
            i6 = 1122917069;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[PHI: r4 r5 r6 r16
      0x01b4: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:50:0x01b2, B:46:0x0190, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:50:0x01b2, B:46:0x0190, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:50:0x01b2, B:46:0x0190, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r16v19 int) = (r16v10 int), (r16v11 int), (r16v20 int) binds: [B:50:0x01b2, B:46:0x0190, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x028c A[PHI: r0 r1 r2 r3 r16
      0x028c: PHI (r0v8 short[]) = (r0v7 short[]), (r0v2 short[]), (r0v2 short[]), (r0v2 short[]), (r0v2 short[]), (r0v2 short[]) binds: [B:74:0x028a, B:70:0x026b, B:66:0x024b, B:62:0x0228, B:58:0x0207, B:54:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r1v5 char) = (r1v2 char), (r1v2 char), (r1v2 char), (r1v4 char), (r1v2 char), (r1v2 char) binds: [B:74:0x028a, B:70:0x026b, B:66:0x024b, B:62:0x0228, B:58:0x0207, B:54:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r2v4 short) = (r2v2 short), (r2v2 short), (r2v2 short), (r2v2 short), (r2v3 short), (r2v2 short) binds: [B:74:0x028a, B:70:0x026b, B:66:0x024b, B:62:0x0228, B:58:0x0207, B:54:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:74:0x028a, B:70:0x026b, B:66:0x024b, B:62:0x0228, B:58:0x0207, B:54:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r16v8 int) = (r16v3 int), (r16v4 int), (r16v5 int), (r16v6 int), (r16v7 int), (r16v9 int) binds: [B:74:0x028a, B:70:0x026b, B:66:0x024b, B:62:0x0228, B:58:0x0207, B:54:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13778 m8688() {
        int i;
        int iM2761;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1042484317;
        int i14 = C0487.f2131;
        int i15 = C0773.f2792;
        int iM2762 = (i15 - C0619.m2761("ۡܽ")) * (-109);
        int i16 = ((iM2762 ^ i14) * (-797)) ^ (-305148007);
        int i17 = 368726301;
        while (true) {
            int i18 = iM2762 ^ i17;
            while (true) {
                i13 = ((((i13 ^ i14) * (-9307)) >> 31) & i16) ^ i18;
                switch (i13) {
                    case -2096264837:
                    case -1981731681:
                        return new C13778(4);
                    case -1831330312:
                    case 2004174709:
                        i = i10;
                        if (C1564.f5401 <= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = C0619.m2761("ۜ֨") ^ i14;
                            i16 = ((iM2761 ^ i15) * (-3983)) ^ 1909982930;
                            i2 = -632896777;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1745855357:
                    case 1047133482:
                        i3 = 24218;
                        iM3169 = C0773.m3169("᩵۟") ^ i15;
                        i = i3;
                        i4 = ((iM3169 ^ i14) * 29297) ^ 215809801;
                        i5 = 2044759216;
                        i18 = iM3169 ^ i5;
                        i16 = i4;
                        i10 = i;
                        break;
                    case -1733464334:
                    case 1086820517:
                        C1343.m4943();
                        i = i10;
                        iM2761 = C0773.m3169("ᩳܰ") ^ i14;
                        i16 = ((iM2761 ^ i15) * 12655) ^ 918998467;
                        i2 = 105136567;
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1614464642:
                    case -1018368383:
                        i = i10;
                        sArr2 = f8322;
                        i11 = 1821;
                        if (AbstractC0641.m2813() <= 0) {
                            iM2761 = C0773.m3169("ۖۤ") ^ i14;
                            i16 = ((iM2761 ^ i15) * 19431) ^ 2093474648;
                            i2 = 1929340848;
                        } else {
                            iM2761 = (i15 - C0619.m2761("ᩳ᩵")) * 51;
                            i16 = ((iM2761 ^ i14) * 26585) ^ 468246573;
                            i2 = 2043600889;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1389906980:
                    case -1280482748:
                        i12 = 2;
                        if (C3779.f12953 > 0) {
                            i = i10;
                            iM2761 = C0619.m2761("ۗ᩶") ^ i14;
                            i16 = ((iM2761 ^ i15) * (-3443)) ^ 1984898335;
                            i2 = 1085883044;
                            i18 = iM2761 ^ i2;
                            i10 = i;
                        }
                        iM3169 = C0773.m3169("ᩳᩴ") ^ i14;
                        i = i10;
                        i4 = ((iM3169 ^ i15) * (-15727)) ^ (-801820564);
                        i5 = -691255268;
                        i18 = iM3169 ^ i5;
                        i16 = i4;
                        i10 = i;
                        break;
                    case -1156779876:
                    case -255204977:
                        i = i10;
                        i9 = 10679824;
                        if (C20932.f66974 <= 0) {
                            iM2761 = C0773.m3169("ᩳܰ") ^ i14;
                            i16 = ((iM2761 ^ i15) * 12655) ^ 918998467;
                            i2 = 105136567;
                        } else {
                            iM2761 = C0773.m3169("ۡ۟") ^ i14;
                            i16 = ((iM2761 ^ i15) * 7349) ^ (-2081529607);
                            i2 = 66693019;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1133777444:
                    case -852009053:
                        i = i10;
                        if (C2419.m8174() >= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = (i15 - C0773.m3169("ۗܺ")) * (-25);
                            i16 = ((iM2761 ^ i14) * (-14655)) ^ (-1601244194);
                            i2 = -1854995885;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1069855925:
                    case -949986676:
                        if (C1519.f5300 < 0) {
                            iM3169 = C0773.m3169("ᩳᩴ") ^ i14;
                            i = i10;
                            i4 = ((iM3169 ^ i15) * (-15727)) ^ (-801820564);
                            i5 = -691255268;
                            i18 = iM3169 ^ i5;
                            i16 = i4;
                            i10 = i;
                        }
                        i = i10;
                        iM2761 = C0773.m3169("ᩳܰ") ^ i14;
                        i16 = ((iM2761 ^ i15) * 12655) ^ 918998467;
                        i2 = 105136567;
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -1037755289:
                    case -107487419:
                        i = i10;
                        i7 = i6 * i6;
                        i8 = s * s;
                        if (C1146.f4234 >= 0) {
                            iM2761 = C0773.m3169("ᩳܰ") ^ i14;
                            i16 = ((iM2761 ^ i15) * 12655) ^ 918998467;
                            i2 = 105136567;
                        } else {
                            iM2761 = C0619.m2761("ۙۧ") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-13)) ^ (-1726713090);
                            i2 = -913157349;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -737057866:
                    case -44739157:
                        i = i10;
                        s = sArr[c];
                        if (C11235.f35427 >= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = C0619.m2761("۠ۖ") ^ i14;
                            i16 = ((iM2761 ^ i15) * (-77)) ^ 1726357543;
                            i2 = -73963161;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -656063777:
                    case 344472733:
                        i = i10;
                        int i19 = i8 + i9;
                        if ((i19 + i19) - i7 < 0) {
                            iM2761 = (C0619.m2761("۠ܳ") ^ i14) * (-99);
                            i16 = ((iM2761 ^ i15) * (-25461)) ^ 1999067163;
                            i2 = 2027990396;
                        } else {
                            iM2761 = (C0773.m3169("᩷᩺") ^ i15) * (-47);
                            i16 = ((iM2761 ^ i14) * (-29835)) ^ (-682050400);
                            i2 = 347355826;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -589790453:
                    case -320408183:
                        i = i10;
                        i6 = s + 3268;
                        if (C2287.f7432 >= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = C0773.m3169("ۘ᩺") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-127)) ^ 1437959345;
                            i2 = -1329886612;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case -510184744:
                    case -410993822:
                        i3 = 45870;
                        iM3169 = C0773.m3169("᩵۟") ^ i15;
                        i = i3;
                        i4 = ((iM3169 ^ i14) * 29297) ^ 215809801;
                        i5 = 2044759216;
                        i18 = iM3169 ^ i5;
                        i16 = i4;
                        i10 = i;
                        break;
                    case -292745451:
                    case 1609868121:
                        i = i10;
                        c = 1820;
                        if (C1783.f6087 <= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = (i14 - C0619.m2761("᩵ۜ")) * 55;
                            i16 = ((iM2761 ^ i15) * (-20907)) ^ (-1648699973);
                            i2 = -168705524;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case 192794387:
                    case 283667601:
                        i = i10;
                        if (C2702.m8873()) {
                            iM2761 = C0619.m2761("ۜܶ") ^ i14;
                            i16 = ((iM2761 ^ i15) * (-15011)) ^ (-502757856);
                            i2 = -734170557;
                        } else {
                            iM2761 = (i15 - C0619.m2761("ۗۘ")) * (-5);
                            i16 = ((iM2761 ^ i14) * (-32697)) ^ (-318172700);
                            i2 = 1105617507;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case 288767410:
                    case 2043282149:
                        C1343.m4943();
                        AbstractC0641.m2813();
                        return null;
                    case 639272106:
                    case 1472785347:
                        return m8671(C0619.m2756(sArr2, i11, i12, i10));
                    case 656331210:
                    case 912387806:
                        i = i10;
                        sArr = f8322;
                        if (C4282.f15546 <= 0) {
                            iM2761 = C0773.m3169("᩹֫") ^ i15;
                            i16 = ((iM2761 ^ i14) * (-29637)) ^ (-1914605930);
                            i2 = -1297741392;
                        } else {
                            iM2761 = C0619.m2761("᩺ۗ") ^ i15;
                            i16 = ((iM2761 ^ i14) * 19999) ^ (-1519078439);
                            i2 = -532324660;
                        }
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    case 1526551463:
                    case 1703869030:
                        if (C2966.f9654 < 0) {
                        }
                        i = i10;
                        iM2761 = C0773.m3169("ᩳܰ") ^ i14;
                        i16 = ((iM2761 ^ i15) * 12655) ^ 918998467;
                        i2 = 105136567;
                        i18 = iM2761 ^ i2;
                        i10 = i;
                        break;
                    default:
                        if (C2310.f7472 < 0) {
                            i = i10;
                            iM2761 = C0773.m3169("ۖۤ") ^ i14;
                            i16 = ((iM2761 ^ i15) * 19431) ^ 2093474648;
                            i2 = 1929340848;
                            i18 = iM2761 ^ i2;
                            i10 = i;
                        }
                        break;
                }
            }
            iM2762 = C0619.m2761("۬᩶") ^ i15;
            i16 = ((iM2762 ^ i14) * 19347) ^ 305037366;
            i17 = 844699910;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m8673(String str) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 434466081;
        int i7 = C2354.f7599;
        int i8 = C1826.f6190;
        int iM2761 = (C0619.m2761("᩺ܶ") + i8) * 71;
        int i9 = ((iM2761 ^ i7) * (-9651)) ^ 1956896780;
        int i10 = 795624945;
        while (true) {
            i6 = ((((i6 ^ i7) * (-12311)) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2082395076:
                case 1064551371:
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("۠֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 26405) ^ 45662475;
                        i10 = 1240035452;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۧܰ")) * 51;
                        i9 = ((iM2761 ^ i7) * 13131) ^ (-572330874);
                        i10 = -248822983;
                    }
                    break;
                case -2006872352:
                case -1705052297:
                    if (str != null) {
                        iM2761 = C0773.m3169("᩻ۘ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-11487)) ^ (-190446813);
                        i10 = -1915363174;
                    } else {
                        iM2761 = C0773.m3169("֡ᩳ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-22449)) ^ 669435078;
                        i10 = 752348998;
                    }
                    break;
                case -1824507183:
                case 799496435:
                    c = 1771;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ܿܳ") ^ i7) * (-105);
                        i9 = ((iM2761 ^ i8) * (-8729)) ^ 288702880;
                        i10 = 1822644749;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-24123)) ^ 152022440;
                        i10 = -374160492;
                    }
                    break;
                case -1802165305:
                case -1254921257:
                    if ((i2 * i2) - i < 0) {
                        iM2761 = (C0619.m2761("᩹᩹") ^ i7) * 127;
                        i9 = ((iM2761 ^ i8) * 24107) ^ (-242415754);
                        i10 = 1059325213;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i8;
                        i9 = ((iM2761 ^ i7) * 4985) ^ (-1300030774);
                        i10 = 2113771820;
                    }
                    break;
                case -1707303982:
                case 2082026238:
                    i = s * s2;
                    s3 = 19715;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("᩷ۚ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 23203) ^ (-110106064);
                        i10 = 2147087880;
                    } else {
                        iM2761 = (C0619.m2761("֫ۤ") ^ i7) * 89;
                        i9 = ((iM2761 ^ i8) * 14625) ^ (-433698780);
                        i10 = 1237491730;
                    }
                    break;
                case -1637608371:
                case -1164634746:
                    i3 = 35000;
                    iM2761 = C0619.m2761("ۤܳ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 15265) ^ (-1235355601);
                    i10 = -21292961;
                    break;
                case -1533207535:
                case 1296988620:
                    if (C2878.m9491() > 0) {
                        iM2761 = C0619.m2761("᩷ۚ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 23203) ^ (-110106064);
                        i10 = 2147087880;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    }
                    break;
                case -1317735319:
                case -753188348:
                    sArr = f8322;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("᩷ۚ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 23203) ^ (-110106064);
                        i10 = 2147087880;
                    } else {
                        iM2761 = C0619.m2761("ۗ᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * 26083) ^ 645726803;
                        i10 = 1419440255;
                    }
                    break;
                case -1168200486:
                case -427960886:
                    i5 = 32;
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("᩸ܽ") ^ i8) * (-73);
                        i9 = ((iM2761 ^ i7) * (-5801)) ^ (-1359347957);
                        i10 = 1325037212;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    }
                    break;
                case -1128845788:
                case -223742487:
                    sArr2 = f8322;
                    i4 = 1772;
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    } else {
                        iM2761 = C0619.m2761("ۚܳ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 6717) ^ (-2131068762);
                        i10 = 1981614019;
                    }
                    break;
                case -1025426005:
                case 1956501714:
                    f8317 = C20932.m47853(sArr2, i4, i5, i3);
                    break;
                case -397015837:
                case 932857291:
                    C3779.m12264();
                    break;
                case -382474048:
                case -346008855:
                    if (C2966.m9671(str) == 32) {
                        iM2761 = C0773.m3169("ۡۨ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 2685) ^ (-1527978832);
                        i10 = -953799037;
                    } else {
                        iM2761 = C0773.m3169("֡ᩳ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-22449)) ^ 669435078;
                        i10 = 752348998;
                    }
                    break;
                case -330060860:
                case 383784503:
                    if (C0862.f3233 != 0) {
                        iM2761 = (i7 - C0619.m2761("ܰ᩻")) * (-115);
                        i9 = ((iM2761 ^ i8) * (-22131)) ^ 1475947276;
                        i10 = -608036659;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۧܰ")) * 51;
                        i9 = ((iM2761 ^ i7) * 13131) ^ (-572330874);
                        i10 = -248822983;
                    }
                    break;
                case -193019909:
                case 2043820683:
                    s = sArr[c];
                    s2 = 78860;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("ܿܳ") ^ i7) * (-105);
                        i9 = ((iM2761 ^ i8) * (-8729)) ^ 288702880;
                        i10 = 1822644749;
                    } else {
                        iM2761 = C0773.m3169("ᩴ۬") ^ i8;
                        i9 = ((iM2761 ^ i7) * 27565) ^ (-1494250353);
                        i10 = -19230003;
                    }
                    break;
                case -24532532:
                case 2010213486:
                    C0773.m3161();
                    C4282.m13644();
                    iM2761 = (i8 - C0619.m2761("ۧܰ")) * 51;
                    i9 = ((iM2761 ^ i7) * 13131) ^ (-572330874);
                    i10 = -248822983;
                    break;
                case 421021140:
                case 696502582:
                    i3 = 31354;
                    iM2761 = C0619.m2761("ۤܳ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 15265) ^ (-1235355601);
                    i10 = -21292961;
                    break;
                case 455081644:
                case 802101376:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۧܰ")) * 51;
                        i9 = ((iM2761 ^ i7) * 13131) ^ (-572330874);
                        i10 = -248822983;
                    }
                    break;
                case 460778527:
                case 755800410:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩳ") + i7) * 97;
                        i9 = ((iM2761 ^ i8) * 6363) ^ 1870763963;
                        i10 = 670991021;
                    }
                    break;
                case 1405782676:
                case 1464269620:
                    f8317 = str;
                    break;
                case 2019609139:
                case 2137598609:
                    i2 = s + s3;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ܰ᩻")) * (-115);
                        i9 = ((iM2761 ^ i8) * (-22131)) ^ 1475947276;
                        i10 = -608036659;
                    } else {
                        iM2761 = C0619.m2761("ܿᩴ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9689)) ^ 1141744126;
                        i10 = -774462683;
                    }
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-32357)) ^ 1211318401;
                        i10 = -2038372954;
                    } else {
                        iM2761 = (C0619.m2761("ܳۨ") ^ i8) * (-109);
                        i9 = ((iM2761 ^ i7) * (-7503)) ^ 261427057;
                        i10 = -1983722550;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m8685() {
        return this.f8332;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C2592 m8672(int i) {
        return new C2592(i);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03fd A[PHI: r15 r20
      0x03fd: PHI (r15v3 short) = (r15v2 short), (r15v1 short), (r15v1 short) binds: [B:132:0x03fb, B:121:0x0382, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x03fd: PHI (r20v67 int) = (r20v13 int), (r20v18 int), (r20v68 int) binds: [B:132:0x03fb, B:121:0x0382, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x04a5 A[PHI: r12 r13 r20 r22
      0x04a5: PHI (r12v2 short) = (r12v1 short), (r12v1 short), (r12v3 short) binds: [B:148:0x04a3, B:144:0x0485, B:140:0x0465] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r13v2 short) = (r13v1 short), (r13v1 short), (r13v3 short) binds: [B:148:0x04a3, B:144:0x0485, B:140:0x0465] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r20v10 int) = (r20v8 int), (r20v9 int), (r20v11 int) binds: [B:148:0x04a3, B:144:0x0485, B:140:0x0465] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r22v5 char) = (r22v3 char), (r22v4 char), (r22v3 char) binds: [B:148:0x04a3, B:144:0x0485, B:140:0x0465] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C13778 m8682() {
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        C13778 c13778M8668 = null;
        IOException iOException = null;
        Throwable th = null;
        C13778 c13778M33664 = null;
        boolean zM5516 = false;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 1882873865;
        int i10 = C1826.f6190;
        int i11 = C0950.f3488;
        int iM2762 = C0619.m2761("ܽܺ") ^ i10;
        int i12 = ((iM2762 ^ i11) * (-24825)) ^ 663237712;
        int i13 = iM2762 ^ 222360249;
        short[] sArr = null;
        int i14 = 0;
        Lock lock = null;
        char c = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-20379)) >> 31));
            switch (i9) {
                case -2142392788:
                case -1225548947:
                    i6 = i6;
                    s3 = 43580;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ܰۜ") ^ i10;
                        i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                        i2 = 1452122096;
                    } else {
                        iM2761 = C0773.m3169("ᩴܿ") ^ i10;
                        i = ((iM2761 ^ i11) * (-21417)) ^ 983280737;
                        i2 = 1023353588;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -2073322628:
                case -383723954:
                    C2966.m9664();
                    if (C2287.f7432 < 0) {
                        i6 = i6;
                        iM2761 = (i10 - C0773.m3169("ۨۧ")) * 91;
                        i = ((iM2761 ^ i11) * 20761) ^ 133323024;
                        i2 = -1068020362;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    i6 = i6;
                    iM2761 = (C0773.m3169("ۤᩴ") ^ i10) * (-5);
                    i = ((iM2761 ^ i11) * 19587) ^ 816779993;
                    i2 = 915197448;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -2006208748:
                case 1392565732:
                    c13778M33664 = C13778.m33664(iOException);
                    iM3169 = C0773.m3169("֨֫") ^ i11;
                    i4 = ((iM3169 ^ i10) * (-7763)) ^ 1652452151;
                    i5 = 50847753;
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -1926401265:
                case 845695419:
                    RunnableC3646.m11813();
                    return null;
                case -1901704046:
                case 792096527:
                    i6 = i6;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("֨ᩴ") ^ i11) * (-11);
                        i = ((iM2761 ^ i10) * 19613) ^ 755195340;
                        i2 = -727783517;
                    } else {
                        iM2761 = (i11 - C0773.m3169("۫ܰ")) * 73;
                        i = ((iM2761 ^ i10) * 17753) ^ 729909495;
                        i2 = -652272367;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1888712368:
                case 121426246:
                    try {
                        try {
                            C11650.m29310(c13778M8668);
                            iM3169 = (i11 - C0619.m2761("ۨۙ")) * (-63);
                            i4 = ((iM3169 ^ i10) * (-2555)) ^ (-11536819);
                            i5 = 646763950;
                            i13 = iM3169 ^ i5;
                            i12 = i4;
                        } catch (IOException e) {
                            iOException = e;
                            i6 = i6;
                            iM2761 = C0773.m3169("۟᩶") ^ i11;
                            i = ((iM2761 ^ i10) * 1201) ^ 296216844;
                            i2 = 524342863;
                            i3 = i6;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            i6 = i3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i6 = i6;
                        iM2761 = C0619.m2761("ܿ᩻") ^ i10;
                        i = ((iM2761 ^ i11) * 4731) ^ 20374369;
                        i2 = 2029257930;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case -1835623960:
                case -1242095184:
                    i14 = 50613;
                    iM2761 = C0619.m2761("֨ܿ") ^ i10;
                    i = ((iM2761 ^ i11) * 24901) ^ (-1246883779);
                    i2 = 1835900433;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1822902288:
                case 646234986:
                    i6 = i6;
                    c13778M8668 = m8668(RunnableC1848.m6366(f8322, 1805, 2, i14), 3);
                    iM2761 = C0773.m3169("ۤܺ") ^ i11;
                    i = ((iM2761 ^ i10) * 14623) ^ (-584260882);
                    i2 = -915924135;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1809005786:
                case 946583353:
                    C1343.m4945(lock);
                    return c13778M33664;
                case -1806955175:
                case 1101039376:
                    i6 = i6;
                    if (C2485.m8357() <= 0) {
                        iM2761 = (i10 - C0773.m3169("ۨۧ")) * 91;
                        i = ((iM2761 ^ i11) * 20761) ^ 133323024;
                        i2 = -1068020362;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i10;
                        i = ((iM2761 ^ i11) * 16409) ^ (-814217854);
                        i2 = 1272154068;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1786034713:
                case -1480035048:
                    C1343.m4943();
                    if (!C2354.m7983()) {
                        iM3169 = (i11 - C0619.m2761("ᩳ۟")) * (-75);
                        i4 = ((iM3169 ^ i10) * (-29789)) ^ 1396193289;
                        i5 = -75627695;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i6 = i6;
                        iM2761 = (C0773.m3169("ۤᩴ") ^ i10) * (-5);
                        i = ((iM2761 ^ i11) * 19587) ^ 816779993;
                        i2 = 915197448;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case -1774136074:
                case 635706516:
                    i6 = i6;
                    s = sArr[c];
                    s2 = 10895;
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0619.m2761("ܿۙ") ^ i11) * 93;
                        i = ((iM2761 ^ i10) * (-28641)) ^ 1623096780;
                        i2 = 821051495;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۗ") ^ i10) * 55;
                        i = ((iM2761 ^ i11) * (-17599)) ^ 753751904;
                        i2 = -1617156977;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1732878374:
                case -1058667820:
                    zM5516 = C1564.m5516(c13778M8668);
                    iM3169 = C0773.m3169("ܽۗ") ^ i10;
                    i4 = ((iM3169 ^ i11) * (-16225)) ^ 211828477;
                    i5 = -1476085591;
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -1641812142:
                case -1526018810:
                    i6 = i6;
                    Lock lock2 = this.f8329;
                    if (C3690.f12684 <= 0) {
                        lock = lock2;
                        iM2761 = (C0773.m3169("ۤᩴ") ^ i10) * (-5);
                        i = ((iM2761 ^ i11) * 19587) ^ 816779993;
                        i2 = 915197448;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                    } else {
                        int iM2763 = C0619.m2761("۫ۧ") ^ i11;
                        lock = lock2;
                        i12 = ((iM2763 ^ i10) * 20901) ^ (-1272754374);
                        i3 = i6;
                        i13 = iM2763 ^ 1351773249;
                    }
                    i6 = i3;
                    break;
                case -1243656662:
                case 494774542:
                    C4282.m13644();
                    if (!C1519.m5403()) {
                        iM3169 = (i11 - C0773.m3169("ܳܽ")) * (-73);
                        i4 = ((iM3169 ^ i10) * (-19955)) ^ (-1227428510);
                        i5 = -1706705324;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i6 = i6;
                        iM2761 = (C0619.m2761("֨ᩴ") ^ i11) * (-11);
                        i = ((iM2761 ^ i10) * 19613) ^ 755195340;
                        i2 = -727783517;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case -1171695039:
                case -1036942482:
                    i6 = i6;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ܿۙ") ^ i11) * 93;
                        i = ((iM2761 ^ i10) * (-28641)) ^ 1623096780;
                        i2 = 821051495;
                    } else {
                        iM2761 = (i10 - C0619.m2761("ۙ᩷")) * 87;
                        i = ((iM2761 ^ i11) * (-19481)) ^ 319564192;
                        i2 = -1631115177;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -1141538787:
                case 470928433:
                    C4282.m13645(lock);
                    throw th;
                case -1023280430:
                case -633836455:
                    AbstractC0116.m1243();
                    if (C0773.f2792 <= 0) {
                        i6 = i6;
                        iM2761 = (C0773.m3169("ۜ۬") + i10) * 73;
                        i = ((iM2761 ^ i11) * 29587) ^ 485339083;
                        i2 = 750436001;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    i6 = i6;
                    iM2761 = C0773.m3169("ܰۜ") ^ i10;
                    i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                    i2 = 1452122096;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -944167119:
                case 195160152:
                    lock.lock();
                    i6 = o.a.c;
                    i7 = this.f8333;
                    if (i7 == 4099) {
                        iM3169 = C0773.m3169("᩶᩻") ^ i10;
                        i4 = ((iM3169 ^ i11) * (-11781)) ^ 1010299409;
                        i5 = 2136064588;
                    } else {
                        iM3169 = (C0773.m3169("ۜۜ") ^ i10) * (-17);
                        i4 = ((iM3169 ^ i11) * 29207) ^ 1758244841;
                        i5 = 1782534723;
                    }
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -857641868:
                case 471728422:
                    if (zM5516) {
                        iM3169 = C0619.m2761("ۖ۠") ^ i11;
                        i4 = ((iM3169 ^ i10) * (-1955)) ^ (-1772338357);
                        i5 = -1877500512;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ۨۙ")) * (-63);
                        i4 = ((iM3169 ^ i10) * (-2555)) ^ (-11536819);
                        i5 = 646763950;
                    }
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -844355383:
                case 1772431043:
                    i6 = i6;
                    sArr = f8322;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ۜ۬") + i10) * 73;
                        i = ((iM2761 ^ i11) * 29587) ^ 485339083;
                        i2 = 750436001;
                    } else {
                        iM2761 = (C0619.m2761("۟۫") + i11) * (-61);
                        i = ((iM2761 ^ i10) * 29831) ^ 840095488;
                        i2 = -1144498344;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -682317640:
                case 1562076141:
                    i6 = i6;
                    c = 1804;
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("ܿۙ") ^ i11) * 93;
                        i = ((iM2761 ^ i10) * (-28641)) ^ 1623096780;
                        i2 = 821051495;
                    } else {
                        iM2761 = (C0773.m3169("۟ܺ") ^ i11) * 29;
                        i = ((iM2761 ^ i10) * (-25255)) ^ 1751105150;
                        i2 = 973305871;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -658504026:
                case -339880859:
                    if (i7 == 4355) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = C0619.m2761("۬۫") ^ i11;
                        i4 = ((iM3169 ^ i10) * 3231) ^ (-649799272);
                        i5 = -1267798087;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case -521921858:
                case 591766762:
                    if (i7 != 4352) {
                        iM3169 = (i11 - C0619.m2761("ۨۙ")) * (-63);
                        i4 = ((iM3169 ^ i10) * (-2555)) ^ (-11536819);
                        i5 = 646763950;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case -353321003:
                case 1489101204:
                    C4282.m13645(lock);
                    return c13778M8668;
                case -303360036:
                case -30841881:
                    try {
                        i6 = i6;
                        try {
                            this.f8332 = C10773.m27441(C3779.m12266(f8322, 1807, 7, i14), m8666());
                            i6 = i6;
                            iM3169 = (C0773.m3169("ۜۜ") ^ i10) * (-17);
                            i4 = ((iM3169 ^ i11) * 29207) ^ 1758244841;
                            i5 = 1782534723;
                            i13 = iM3169 ^ i5;
                            i12 = i4;
                        } catch (IOException e2) {
                            e = e2;
                            iOException = e;
                            iM2761 = C0773.m3169("۟᩶") ^ i11;
                            i = ((iM2761 ^ i10) * 1201) ^ 296216844;
                            i2 = 524342863;
                            i3 = i6;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            i6 = i3;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            iM2761 = C0619.m2761("ܿ᩻") ^ i10;
                            i = ((iM2761 ^ i11) * 4731) ^ 20374369;
                            i2 = 2029257930;
                            i3 = i6;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            i6 = i3;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        i6 = i6;
                    } catch (Throwable th4) {
                        th = th4;
                        i6 = i6;
                    }
                    break;
                case -53907596:
                case 1492326735:
                    AbstractC0116.m1243();
                    C2485.m8357();
                    i6 = i6;
                    iM2761 = C0773.m3169("ܰۜ") ^ i10;
                    i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                    i2 = 1452122096;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case -40391474:
                case 1581470115:
                    i6 = i6;
                    if (i7 != 4097) {
                        iM2761 = (C0773.m3169("ۙ᩺") ^ i10) * (-17);
                        i = ((iM2761 ^ i11) * (-7457)) ^ 925908287;
                        i2 = 979131679;
                    } else {
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 6052793:
                case 1478044248:
                    i6 = i6;
                    if ((s * s3) - i8 <= 0) {
                        iM2761 = (C0619.m2761("ۛ֫") ^ i10) * (-103);
                        i = ((iM2761 ^ i11) * 8971) ^ 617220297;
                        i2 = -762721329;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ᩴᩴ")) * (-61);
                        i = ((iM2761 ^ i10) * (-6863)) ^ (-286155356);
                        i2 = -250505514;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 22124812:
                case 1375573021:
                    if (i7 == 4137) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = C0773.m3169("᩻ۜ") ^ i10;
                        i4 = ((iM3169 ^ i11) * (-8853)) ^ (-1183021775);
                        i5 = 1286956652;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 159914849:
                case 2009536656:
                    i6 = i6;
                    this.f8326.m17825();
                    if (RunnableC1848.m6360()) {
                        iM2761 = C0773.m3169("ܰۜ") ^ i10;
                        i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                        i2 = 1452122096;
                    } else {
                        iM2761 = C0773.m3169("ܰܶ") ^ i11;
                        i = ((iM2761 ^ i10) * (-12429)) ^ 830937667;
                        i2 = 151560056;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 175602386:
                case 2066091525:
                    i14 = 10114;
                    iM2761 = C0619.m2761("֨ܿ") ^ i10;
                    i = ((iM2761 ^ i11) * 24901) ^ (-1246883779);
                    i2 = 1835900433;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 196973048:
                case 600823609:
                    if (i7 != i6) {
                        iM3169 = (C0619.m2761("۠۬") ^ i10) * 37;
                        i4 = ((iM3169 ^ i11) * 24995) ^ 1172285106;
                        i5 = 1308338769;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case 344061556:
                case 1142519426:
                    if (i7 == 4145) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩺") ^ i10) * (-57);
                        i4 = ((iM3169 ^ i11) * (-12039)) ^ (-1294500009);
                        i5 = -2095864302;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 457025989:
                case 465026926:
                    i6 = i6;
                    z = this.f8330;
                    iM2761 = C0773.m3169("ۚۢ") ^ i11;
                    i = ((iM2761 ^ i10) * 2909) ^ 1849187918;
                    i2 = -1094395162;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 472877695:
                case 823124517:
                    C2023.m6964();
                    if (C0773.f2792 > 0) {
                        iM3169 = (i11 - C0619.m2761("۠᩹")) * (-59);
                        i4 = ((iM3169 ^ i10) * (-28187)) ^ 1605146339;
                        i5 = -706546837;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i6 = i6;
                        iM2761 = C0773.m3169("ܰۜ") ^ i10;
                        i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                        i2 = 1452122096;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    break;
                case 676556362:
                case 1534745429:
                    if (i7 == 4144) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = (C0773.m3169("ۘܶ") ^ i11) * (-93);
                        i4 = ((iM3169 ^ i10) * 551) ^ (-1022315071);
                        i5 = 29699042;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 703567746:
                case 916741979:
                    i6 = i6;
                    if (!z) {
                        iM2761 = C0773.m3169("۬ۢ") ^ i10;
                        i = ((iM2761 ^ i11) * (-27601)) ^ (-1271260536);
                        i2 = -1995507379;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        i6 = i6;
                        iM3169 = (C0773.m3169("ۜۜ") ^ i10) * (-17);
                        i4 = ((iM3169 ^ i11) * 29207) ^ 1758244841;
                        i5 = 1782534723;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 855112784:
                case 1796614019:
                    i6 = i6;
                    int i15 = s + s2;
                    i8 = i15 * i15;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ܶ֨") ^ i10;
                        i = ((iM2761 ^ i11) * (-16647)) ^ (-996265778);
                        i2 = -244411598;
                    } else {
                        iM2761 = C0619.m2761("ۤۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 29275) ^ (-1440094186);
                        i2 = 392619134;
                    }
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 1042776240:
                case 1994394981:
                    if (i7 == 4136) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ᩴ֫") ^ i11;
                        i = ((iM2761 ^ i10) * (-5947)) ^ 249402978;
                        i2 = 1473162575;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = (i10 - C0619.m2761("᩷ܿ")) * 75;
                        i4 = ((iM3169 ^ i11) * 29673) ^ (-499100400);
                        i5 = -1889393799;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 1186163652:
                case 1438385859:
                    C3099.m10095();
                    if (C0773.m3161() != 0) {
                        i6 = i6;
                        iM2761 = C0619.m2761("ܶ֨") ^ i10;
                        i = ((iM2761 ^ i11) * (-16647)) ^ (-996265778);
                        i2 = -244411598;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    }
                    i6 = i6;
                    iM2761 = C0773.m3169("ܰۜ") ^ i10;
                    i = ((iM2761 ^ i11) * (-23841)) ^ 440499469;
                    i2 = 1452122096;
                    i3 = i6;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i6 = i3;
                    break;
                case 1280522673:
                case 1935052237:
                    if (C0950.m3785() != 0) {
                        iM3169 = (i11 - C0619.m2761("۠᩹")) * (-59);
                        i4 = ((iM3169 ^ i10) * (-28187)) ^ 1605146339;
                        i5 = -706546837;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ܳܽ")) * (-73);
                        i4 = ((iM3169 ^ i10) * (-19955)) ^ (-1227428510);
                        i5 = -1706705324;
                    }
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                default:
                    C3779.m12264();
                    if (C2375.f7641 > 0) {
                        i6 = i6;
                        iM2761 = (C0773.m3169("ۤᩴ") ^ i10) * (-5);
                        i = ((iM2761 ^ i11) * 19587) ^ 816779993;
                        i2 = 915197448;
                        i3 = i6;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        i6 = i3;
                    } else {
                        iM3169 = (i11 - C0619.m2761("۠᩹")) * (-59);
                        i4 = ((iM3169 ^ i10) * (-28187)) ^ 1605146339;
                        i5 = -706546837;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m8680() {
        return this.f8327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8674(int i) {
        AbstractC3624.m11762(this.f8331, i);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0226 A[PHI: r1 r4 r5 r16
      0x0226: PHI (r1v4 char) = (r1v1 char), (r1v1 char), (r1v7 char) binds: [B:57:0x01e5, B:11:0x0049, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:57:0x01e5, B:11:0x0049, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:57:0x01e5, B:11:0x0049, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r16v23 int) = (r16v7 int), (r16v22 int), (r16v26 int) binds: [B:57:0x01e5, B:11:0x0049, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ad A[PHI: r16
      0x02ad: PHI (r16v16 int) = (r16v3 int), (r16v5 int), (r16v17 int) binds: [B:75:0x02ab, B:67:0x025a, B:18:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02e1 A[PHI: r0 r2 r3 r6 r8 r9 r16
      0x02e1: PHI (r0v8 short[]) = (r0v7 short[]), (r0v1 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short), (r2v1 short) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r8v2 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v3 short[]) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r16v13 int) = (r16v2 int), (r16v6 int), (r16v8 int), (r16v14 int) binds: [B:79:0x02df, B:61:0x020a, B:53:0x01c0, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (l.C2702.f8586 <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C13778 m8684() {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2592.m8684():l.۬ۢ᩻");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8686(int i) {
        C0487.m2363(this.f8331, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8675(long j) {
        this.f8331.m17803(j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8681(int i) {
        this.f8331.mo17812(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8687(String str) {
        this.f8331.m17800(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8678(byte[] bArr) {
        this.f8331.m17806(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fd A[PHI: r1 r16
      0x01fd: PHI (r1v3 char) = (r1v1 char), (r1v2 char), (r1v1 char) binds: [B:61:0x01fb, B:53:0x01bb, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r16v15 int) = (r16v3 int), (r16v5 int), (r16v16 int) binds: [B:61:0x01fb, B:53:0x01bb, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0228 A[PHI: r2 r3 r16
      0x0228: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:57:0x01db, B:49:0x0198, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:57:0x01db, B:49:0x0198, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r16v21 int) = (r16v4 int), (r16v6 int), (r16v24 int) binds: [B:57:0x01db, B:49:0x0198, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025f A[PHI: r0 r6 r8 r9 r16
      0x025f: PHI (r0v6 short[]) = (r0v5 short[]), (r0v1 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:67:0x025d, B:41:0x0136, B:29:0x00bc, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:67:0x025d, B:41:0x0136, B:29:0x00bc, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:67:0x025d, B:41:0x0136, B:29:0x00bc, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:67:0x025d, B:41:0x0136, B:29:0x00bc, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r16v18 int) = (r16v2 int), (r16v8 int), (r16v11 int), (r16v19 int) binds: [B:67:0x025d, B:41:0x0136, B:29:0x00bc, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (l.C0487.f2131 <= 0) goto L14;
     */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C13778 m8683() {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2592.m8683():l.۬ۢ᩻");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8677(boolean z) {
        this.f8331.m17789(z);
    }
}
