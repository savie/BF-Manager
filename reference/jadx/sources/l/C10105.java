package l;

import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import java.util.zip.CRC32;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۤۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10105 {

    /* JADX INFO: renamed from: ۨ᩷ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f34499 = {1291, 26568, 26585, 26562, 26614, 26586, 26560, 26574, 26567, 26568, 26589, 26588, 26587, 26572, 26614, 26560, 26567, 26575, 26566, 26614, 26568, 26573, 26573, 26614, 26570, 26566, 26565, 26566, 26567, 26568, 26585, 26562, 26614, 26586, 26560, 26574, 26567, 26568, 26589, 26588, 26587, 26572, 26614, 26560, 26567, 26575, 26566, 26614, 26588, 26585, 26585, 26572, 26587, 26614, 26570, 26568, 26586, 26572, 26521, 26577, 26508, 26521, 26513, 26577, 26505, 26497, 26508, 26573, 26496, 26521, 26577, 26508, 26521, 26513, 26609, 26505, 26497, 26508, 26573, 26496};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f34500;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34501;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f34502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f34503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34504;

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d A[PHI: r1 r4 r11
      0x018d: PHI (r1v4 long) = (r1v2 long), (r1v3 long), (r1v2 long), (r1v2 long) binds: [B:52:0x018b, B:45:0x014f, B:33:0x00db, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r4v3 byte[]) = (r4v2 byte[]), (r4v2 byte[]), (r4v2 byte[]), (r4v5 byte[]) binds: [B:52:0x018b, B:45:0x014f, B:33:0x00db, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r11v6 java.util.zip.CRC32) = (r11v5 java.util.zip.CRC32), (r11v4 java.util.zip.CRC32), (r11v4 java.util.zip.CRC32), (r11v4 java.util.zip.CRC32) binds: [B:52:0x018b, B:45:0x014f, B:33:0x00db, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bc A[PHI: r3
      0x01bc: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:56:0x01ba, B:37:0x00fb, B:15:0x0047, B:13:0x0043, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25717(byte[] bArr) {
        int iM11306;
        int i;
        long value = 0;
        int iHashCode = 0;
        byte[] bArrDigest = null;
        byte[] bArrDigest2 = null;
        int i2 = 2014525325;
        int i3 = C1668.f6641;
        int i4 = C1419.f5860;
        int iM45029 = (C19806.m45029("ܳۢ") ^ i3) * 69;
        int i5 = ((iM45029 ^ i4) * 12279) ^ 2035867678;
        int i6 = -1773113794;
        while (true) {
            int i7 = iM45029 ^ i6;
            CRC32 crc32 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 3955) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2113583752:
                    case -1863250805:
                        crc32.update(bArr);
                        value = crc32.getValue();
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = (C19806.m45029("ܿ᩶") + i3) * (-95);
                            i5 = ((iM11306 ^ i4) * 32591) ^ 141651970;
                            i = -1873948270;
                        } else {
                            iM11306 = (i4 - C19806.m45029("ᩴ۫")) * (-99);
                            i5 = ((iM11306 ^ i3) * (-20521)) ^ (-246298285);
                            i = 326399152;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1844914186:
                    case 1169471214:
                        if (C1377.f5749) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܺۖ") + i4) * 57;
                            i5 = ((iM11306 ^ i3) * 19159) ^ 963961172;
                            i = 850564956;
                        } else {
                            iM11306 = (C19806.m45029("ۚܽ") + i4) * (-69);
                            i5 = ((iM11306 ^ i3) * 9493) ^ (-1849597358);
                            i = -1278472187;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1570302854:
                    case -1313752207:
                        if (RunnableC1895.m6170() == 0) {
                            crc32 = new CRC32();
                            if (C0526.m2437() >= 0) {
                                iM11306 = (i4 - C19806.m45029("ᩴ۫")) * (-99);
                                i5 = ((iM11306 ^ i3) * (-20521)) ^ (-246298285);
                                i = 326399152;
                            } else {
                                iM11306 = (C19806.m45029("᩸ۢ") ^ i3) * (-117);
                                i5 = ((iM11306 ^ i4) * (-10211)) ^ 1919972314;
                                i = 1196755071;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -663867606:
                    case 1573814280:
                        C1066.m4023();
                        break;
                    case -405557422:
                    case 1497944804:
                        this.f34501 = (int) value;
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                            iM11306 = C19806.m45029("᩺᩷") ^ i3;
                            i5 = ((iM11306 ^ i4) * 11181) ^ 606882956;
                            i = -1205618040;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܶ᩸") + i4) * (-99);
                            i5 = ((iM11306 ^ i3) * (-3313)) ^ (-1815863387);
                            i = 1057217414;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -393246986:
                    case 1739485870:
                        this.f34500 = bArrDigest2;
                        this.f34502 = C22253.m49421().digest(bArr);
                        break;
                    case -180960212:
                    case 2140632632:
                        C2871.m8646();
                        if (C1148.f5161 <= 0) {
                            iM11306 = (C19806.m45029("ۚܽ") + i4) * (-69);
                            i5 = ((iM11306 ^ i3) * 9493) ^ (-1849597358);
                            i = -1278472187;
                        } else {
                            iM11306 = C19806.m45029("۟۫") ^ i3;
                            i5 = ((iM11306 ^ i4) * 9589) ^ 151201357;
                            i = -712880039;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 31001059:
                    case 1374921310:
                        bArrDigest = C22253.m49416().digest(bArr);
                        if (C7105.m18985()) {
                            iM11306 = (i4 - C19806.m45029("ᩴ۫")) * (-99);
                            i5 = ((iM11306 ^ i3) * (-20521)) ^ (-246298285);
                            i = 326399152;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۖ")) * 87;
                            i5 = ((iM11306 ^ i3) * (-17751)) ^ (-1967646230);
                            i = -471057336;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 605791919:
                    case 1511494165:
                        bArrDigest2 = C22253.m49425().digest(bArr);
                        if (RunnableC0195.f1321 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙᩴ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 16217) ^ 1773920758;
                            i = 2146796754;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case 917584666:
                    case 2098897711:
                        this.f34504 = iHashCode;
                        if (C3535.f13026 <= 0) {
                            iM11306 = (i4 - C19806.m45029("ᩴ۫")) * (-99);
                            i5 = ((iM11306 ^ i3) * (-20521)) ^ (-246298285);
                            i = 326399152;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۫ܰ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-31743)) ^ (-542010371);
                            i = -964062364;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1123575594:
                    case 1397679738:
                        C10634.m26820();
                        C0526.m2437();
                        iM11306 = (C19806.m45029("ۚܽ") + i4) * (-69);
                        i5 = ((iM11306 ^ i3) * 9493) ^ (-1849597358);
                        i = -1278472187;
                        i7 = iM11306 ^ i;
                        break;
                    case 1503170805:
                    case 2062872684:
                        this.f34503 = bArrDigest;
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = C19806.m45029("ۘۧ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 16969) ^ 712536064;
                            i = -1285451457;
                        } else {
                            iM11306 = C19806.m45029("۟۫") ^ i3;
                            i5 = ((iM11306 ^ i4) * 9589) ^ 151201357;
                            i = -712880039;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1526764978:
                    case 1572371594:
                        iHashCode = Arrays.hashCode(bArr);
                        if (RunnableC1564.m5345()) {
                            iM11306 = (C19806.m45029("ۚܽ") + i4) * (-69);
                            i5 = ((iM11306 ^ i3) * 9493) ^ (-1849597358);
                            i = -1278472187;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۜۤ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-4129)) ^ (-161694778);
                            i = -485365272;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1805887052:
                    case 1999132647:
                        C1875.m6086();
                        if (C1977.f7413 <= 0) {
                            iM11306 = (C19806.m45029("ۚܽ") + i4) * (-69);
                            i5 = ((iM11306 ^ i3) * 9493) ^ (-1849597358);
                            i = -1278472187;
                        } else {
                            iM11306 = C19806.m45029("᩺᩷") ^ i3;
                            i5 = ((iM11306 ^ i4) * 11181) ^ 606882956;
                            i = -1205618040;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        C1419.m4973();
                        if (C1977.f7413 > 0) {
                        }
                        iM11306 = C19806.m45029("۟۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9589) ^ 151201357;
                        i = -712880039;
                        i7 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM45029 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i4;
            i5 = ((iM45029 ^ i3) * 1013) ^ 44709974;
            i6 = -1439415459;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x05a7 A[PHI: r2 r4 r6 r27 r28 r30 r31 r35 r36
      0x05a7: PHI (r2v13 int) = (r2v12 int), (r2v14 int) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r4v12 int) = (r4v11 int), (r4v13 int) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r6v12 int) = (r6v11 int), (r6v13 int) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r27v3 short[]) = (r27v2 short[]), (r27v4 short[]) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r28v3 char) = (r28v2 char), (r28v4 char) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r30v11 java.lang.String) = (r30v10 java.lang.String), (r30v12 java.lang.String) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r31v10 java.lang.String) = (r31v9 java.lang.String), (r31v11 java.lang.String) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r35v15 java.lang.String) = (r35v14 java.lang.String), (r35v16 java.lang.String) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]
      0x05a7: PHI (r36v4 short[]) = (r36v3 short[]), (r36v5 short[]) binds: [B:108:0x05a5, B:104:0x0578] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25716(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        String str;
        int i;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM11306;
        int i6;
        InterfaceC6025 interfaceC6025;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int i10;
        String strM7071;
        int iM11307;
        int i11;
        int i12;
        int iM11308;
        int i13;
        String strM7072;
        String strM7073;
        String str2;
        int iM11309;
        int i14;
        C10105 c10105 = this;
        int i15 = -971350854;
        int i16 = C0278.f1572;
        int i17 = C1419.f5860;
        int iM113010 = (ThreadFactoryC3888.m11306("ۜܽ") + i16) * (-29);
        int i18 = ((iM113010 ^ i17) * (-8661)) ^ 1388794144;
        int i19 = iM113010 ^ 1649222965;
        Integer numM8476 = null;
        String str3 = null;
        String upperCase = null;
        short[] sArr = null;
        short[] sArr2 = null;
        boolean z = false;
        int i20 = 0;
        char c = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        byte[] bArr = null;
        String strM10056 = null;
        Integer numM4234 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        char c2 = 0;
        InterfaceC6025 interfaceC6026 = null;
        Integer numM8477 = null;
        String str9 = null;
        Integer numM4235 = null;
        String str10 = null;
        boolean zM4371 = false;
        String strM2906 = null;
        Locale locale = null;
        String upperCase2 = null;
        byte[] bArr2 = null;
        boolean zM5579 = false;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * 4379) >> 31));
            switch (i15) {
                case -2011937870:
                case 471156116:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    sArr = f34499;
                    c = 0;
                    if (C2332.f8260) {
                        iM45029 = (i17 - C19806.m45029("ۡ۬")) * (-93);
                        i18 = ((iM45029 ^ i16) * (-4027)) ^ 1617201433;
                        i4 = -726454118;
                    } else {
                        iM45029 = (i17 - C19806.m45029("۠ۡ")) * 45;
                        i18 = ((iM45029 ^ i16) * 22995) ^ 2059412861;
                        i4 = -456042554;
                    }
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -1864179332:
                case -1692095949:
                    strM7071 = C2332.m7071(bArr2);
                    str10 = strM7071;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖܿ") ^ i17) * (-103);
                    i11 = ((iM11307 ^ i16) * 30237) ^ 881603924;
                    i12 = 981062760;
                    int i24 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i24;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -1771327107:
                case 1255972762:
                    strM7072 = C2332.m7071(bArr);
                    str9 = strM7072;
                    iM11307 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i16;
                    i11 = ((iM11307 ^ i17) * 23891) ^ (-789981723);
                    i12 = 1311103155;
                    int i25 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i25;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -1664242930:
                case 1928309098:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    interfaceC6026 = ApplicationC0716.f2992;
                    sArr2 = f34499;
                    i22 = 1;
                    i23 = 28;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩹") ^ i17) * 41;
                        i18 = ((iM11306 ^ i16) * 14569) ^ 40012713;
                        i6 = -1863863849;
                    } else {
                        iM11306 = (i17 - ThreadFactoryC3888.m11306("ۤۨ")) * (-111);
                        i18 = ((iM11306 ^ i16) * (-15835)) ^ 587602968;
                        i6 = -484591938;
                    }
                    i5 = iM11306 ^ i6;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -1641683330:
                case -826239564:
                    strM7073 = C22253.m49420(c10105.f34502);
                    str8 = strM7073;
                    iM11307 = ThreadFactoryC3888.m11306("ܺܶ") ^ i16;
                    i11 = ((iM11307 ^ i17) * 22503) ^ 1377858624;
                    i12 = 972613647;
                    int i26 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i26;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -1554670021:
                case -1456039381:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i17 - C19806.m45029("۠ۡ")) * 45;
                        i18 = ((iM45029 ^ i16) * 22995) ^ 2059412861;
                        i4 = -456042554;
                    } else {
                        iM45029 = C19806.m45029("ܶܿ") ^ i17;
                        i18 = ((iM45029 ^ i16) * 8305) ^ 820711346;
                        i4 = 1572121601;
                    }
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -1480488429:
                case -302828063:
                    C2249.m6915();
                    if (!C0629.m2907()) {
                        str3 = str3;
                        str2 = str4;
                        iM11309 = (ThreadFactoryC3888.m11306("ܽۤ") + i16) * 91;
                        str4 = str2;
                        i11 = ((iM11309 ^ i17) * (-28759)) ^ 484451407;
                        i14 = 806972056;
                        i19 = iM11309 ^ i14;
                        i18 = i11;
                        str3 = str3;
                    } else {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        interfaceC6025 = interfaceC6026;
                        i = i21;
                        sArr2 = sArr2;
                        i2 = i22;
                        i3 = i23;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۧ") ^ i17;
                        interfaceC6026 = interfaceC6025;
                        i18 = ((iM45029 ^ i16) * (-30155)) ^ (-188101708);
                        i4 = -384735922;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    }
                    break;
                case -1314932009:
                case 1776446364:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    short s = sArr[c];
                    int i27 = s + 4382;
                    if ((i27 * i27) - (s * 17528) < 0) {
                        iM45029 = C19806.m45029("ܿ᩺") ^ i16;
                        i18 = ((iM45029 ^ i17) * 20161) ^ 914892116;
                        i4 = 1616409587;
                    } else {
                        iM45029 = (i16 - C19806.m45029("֨᩸")) * (-57);
                        i18 = ((iM45029 ^ i17) * 7789) ^ (-1953504147);
                        i4 = 365190504;
                    }
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -1255389758:
                case 1739353488:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    if (C0797.m3359()) {
                        iM45029 = (C19806.m45029("۟᩺") ^ i17) * (-37);
                        i18 = ((iM45029 ^ i16) * (-15729)) ^ 1271800947;
                        i4 = 748074271;
                    } else {
                        iM45029 = C19806.m45029("۫۠") ^ i17;
                        i18 = ((iM45029 ^ i16) * 23221) ^ (-849481907);
                        i4 = -1861507599;
                    }
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -1253080519:
                case -375071028:
                    i7 = i21;
                    zM5579 = C1668.m5579(ApplicationC0716.f2992, RunnableC1895.m6164(f34499, 29, 29, i7), z);
                    byte[] bArr3 = c10105.f34503;
                    if (zM4371) {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩴܺ") + i16) * (-127);
                        i8 = ((iM450210 ^ i17) * 32617) ^ 1698171600;
                        i9 = 572198051;
                    } else {
                        iM450210 = C19806.m45029("ᩳۚ") ^ i17;
                        i8 = ((iM450210 ^ i16) * 9039) ^ (-135353847);
                        i9 = 1317509518;
                    }
                    i10 = iM450210 ^ i9;
                    bArr2 = bArr3;
                    i18 = i8;
                    i21 = i7;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i10;
                    str3 = str3;
                    break;
                case -1157294389:
                case 1944450534:
                    str3 = str3;
                    str2 = str4;
                    numM4234 = C1148.m4234(c10105.f34504);
                    numM8476 = C2788.m8476(c10105.f34504);
                    i20 = 2;
                    if (RunnableC1564.f6300) {
                        iM11309 = (ThreadFactoryC3888.m11306("ܽۤ") + i16) * 91;
                        str4 = str2;
                        i11 = ((iM11309 ^ i17) * (-28759)) ^ 484451407;
                        i14 = 806972056;
                    } else {
                        str4 = str2;
                        iM11309 = (ThreadFactoryC3888.m11306("᩹ܿ") + i16) * 59;
                        i11 = ((iM11309 ^ i17) * 7097) ^ (-1350178130);
                        i14 = -1363196112;
                    }
                    i19 = iM11309 ^ i14;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -1125763096:
                case 153540837:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    short[] sArr3 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    String strM2424 = C0526.m2424(sArr3, i2, i3, i);
                    sArr2 = sArr3;
                    interfaceC6025 = interfaceC6026;
                    zM4371 = C1189.m4371(interfaceC6025, strM2424, true);
                    if (C1977.m6356()) {
                        z = true;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۧ") ^ i17;
                        interfaceC6026 = interfaceC6025;
                        i18 = ((iM45029 ^ i16) * (-30155)) ^ (-188101708);
                        i4 = -384735922;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    } else {
                        interfaceC6026 = interfaceC6025;
                        int iM113011 = ThreadFactoryC3888.m11306("۠۫") ^ i16;
                        c10105 = this;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = iM113011 ^ (-1472701099);
                        i18 = ((iM113011 ^ i17) * (-16891)) ^ 468639387;
                        z = true;
                    }
                    break;
                case -977114195:
                case 1018268229:
                    if (RunnableC1564.f6300) {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i = i21;
                        sArr2 = sArr2;
                        i2 = i22;
                        i3 = i23;
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩴ") + i16) * (-75);
                        i18 = ((iM45029 ^ i17) * (-28043)) ^ 732292824;
                        i4 = 704419858;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    }
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    iM45029 = C19806.m45029("۫۠") ^ i17;
                    i18 = ((iM45029 ^ i16) * 23221) ^ (-849481907);
                    i4 = -1861507599;
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -915640397:
                case 858289348:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩴ") + i16) * (-75);
                        i18 = ((iM45029 ^ i17) * (-28043)) ^ 732292824;
                        i4 = 704419858;
                    } else {
                        iM45029 = (i16 - ThreadFactoryC3888.m11306("᩺ܰ")) * 69;
                        i18 = ((iM45029 ^ i17) * (-32529)) ^ (-1145290223);
                        i4 = 1493326686;
                    }
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case -886664723:
                case 2129172219:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i22 = i2;
                        i23 = i3;
                        sArr2 = sArr2;
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩹") ^ i17) * 41;
                        i18 = ((iM11306 ^ i16) * 14569) ^ 40012713;
                        i6 = -1863863849;
                        i5 = iM11306 ^ i6;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i19 = i5;
                        c10105 = this;
                    } else {
                        iM45029 = (i16 - C19806.m45029("ۤ᩹")) * (-119);
                        i18 = ((iM45029 ^ i17) * (-749)) ^ (-2057367014);
                        i4 = 699492722;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    }
                    break;
                case -883688917:
                case 909292787:
                    i7 = i21;
                    byte[] bArr4 = c10105.f34500;
                    if (zM4371) {
                        iM11308 = (i17 - ThreadFactoryC3888.m11306("ܺۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i8 = ((iM11308 ^ i16) * (-26151)) ^ 1246947027;
                        i13 = -1929275372;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۛۗ") ^ i16;
                        i8 = ((iM11308 ^ i17) * (-14337)) ^ (-573122472);
                        i13 = -1961072314;
                    }
                    i10 = iM11308 ^ i13;
                    bArr = bArr4;
                    i18 = i8;
                    i21 = i7;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i10;
                    str3 = str3;
                    break;
                case -821523796:
                case -687270199:
                    strM7073 = C2332.m7071(c10105.f34502);
                    str8 = strM7073;
                    iM11307 = ThreadFactoryC3888.m11306("ܺܶ") ^ i16;
                    i11 = ((iM11307 ^ i17) * 22503) ^ 1377858624;
                    i12 = 972613647;
                    int i28 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i28;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -771473594:
                case 1041934891:
                    numM4235 = C1148.m4234(c10105.f34501);
                    numM8477 = C2788.m8476(c10105.f34501);
                    if (RunnableC0195.f1321 >= 0) {
                        str3 = str3;
                        str2 = str4;
                        iM11309 = (ThreadFactoryC3888.m11306("ܽۤ") + i16) * 91;
                        str4 = str2;
                        i11 = ((iM11309 ^ i17) * (-28759)) ^ 484451407;
                        i14 = 806972056;
                    } else {
                        iM11309 = C19806.m45029("᩵ܶ") ^ i16;
                        str3 = str3;
                        i11 = ((iM11309 ^ i17) * 2807) ^ 1359738212;
                        i14 = 907197074;
                    }
                    i19 = iM11309 ^ i14;
                    i18 = i11;
                    str3 = str3;
                    break;
                case -474434350:
                case -135504736:
                    C1461.m5083(textView, str5);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView2, str3);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView3, str7);
                    C1461.m5083(textView4, upperCase2);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView5, upperCase);
                    break;
                case -356362285:
                case 613354580:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i21 = i21;
                    locale = Locale.ENGLISH;
                    strM2906 = C0629.m2906(f34499, 58, 11, i21);
                    if (C2249.f8050 >= 0) {
                        iM11307 = C19806.m45029("ۤۡ") ^ i16;
                        i11 = ((iM11307 ^ i17) * (-27783)) ^ 1521723315;
                        i12 = 198923178;
                    } else {
                        iM11307 = (i17 - ThreadFactoryC3888.m11306("᩷ۧ")) * (-9);
                        i11 = ((iM11307 ^ i16) * (-11515)) ^ (-745224966);
                        i12 = 474934828;
                    }
                    int i29 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i29;
                    i18 = i11;
                    str3 = str3;
                    break;
                case 315741592:
                case 1397891743:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i21 = i21;
                    if (zM4371) {
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i17;
                        i11 = ((iM11307 ^ i16) * Scalar25519.L4) ^ (-2130515308);
                        i12 = 1267007867;
                    } else {
                        iM11307 = C19806.m45029("ܿۚ") ^ i16;
                        i11 = ((iM11307 ^ i17) * (-16173)) ^ (-1767983241);
                        i12 = -763400528;
                    }
                    int i210 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i210;
                    i18 = i11;
                    str3 = str3;
                    break;
                case 379882428:
                case 1948721117:
                    C2704.m8255();
                    if (!C2332.f8260) {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i21 = i21;
                        iM11307 = C19806.m45029("ۤۡ") ^ i16;
                        i11 = ((iM11307 ^ i17) * (-27783)) ^ 1521723315;
                        i12 = 198923178;
                        int i211 = iM11307 ^ i12;
                        i21 = i21;
                        upperCase = upperCase;
                        str7 = str7;
                        i19 = i211;
                        i18 = i11;
                        str3 = str3;
                    } else {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i = i21;
                        sArr2 = sArr2;
                        i2 = i22;
                        i3 = i23;
                        iM45029 = C19806.m45029("۫۠") ^ i17;
                        i18 = ((iM45029 ^ i16) * 23221) ^ (-849481907);
                        i4 = -1861507599;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    }
                    break;
                case 380406960:
                case 1268930659:
                    C10634.m26820();
                    CallableC1627.m5507();
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i = i21;
                    sArr2 = sArr2;
                    i2 = i22;
                    i3 = i23;
                    iM45029 = C19806.m45029("۫۠") ^ i17;
                    i18 = ((iM45029 ^ i16) * 23221) ^ (-849481907);
                    i4 = -1861507599;
                    i5 = iM45029 ^ i4;
                    i22 = i2;
                    i23 = i3;
                    i21 = i;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case 458273450:
                case 1183187333:
                    String upperCase3 = str10.toUpperCase();
                    str = str3;
                    upperCase2 = str9.toUpperCase();
                    upperCase = str8.toUpperCase();
                    str7 = upperCase3;
                    int iM450211 = (C19806.m45029("۠ۖ") ^ i16) * 13;
                    i19 = iM450211 ^ (-1666364529);
                    i18 = ((iM450211 ^ i17) * 2513) ^ (-798901083);
                    str3 = str;
                    break;
                case 577701756:
                case 1704186255:
                    String str11 = str3;
                    Object[] objArr = new Object[i20];
                    objArr[0] = numM4234;
                    objArr[z ? 1 : 0] = numM8476;
                    String str12 = str4;
                    str5 = String.format(locale, str12, objArr);
                    str6 = zM5579 ? strM10056 : strM2906;
                    int iM113012 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i17) * 81;
                    i19 = iM113012 ^ (-1443310669);
                    str4 = str12;
                    i18 = ((iM113012 ^ i16) * 9191) ^ (-1867756428);
                    str3 = str11;
                    c2 = 0;
                    break;
                case 903962285:
                case 1236861250:
                    if (!C19806.f63586) {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i21 = i21;
                        iM11307 = C19806.m45029("ۤۡ") ^ i16;
                        i11 = ((iM11307 ^ i17) * (-27783)) ^ 1521723315;
                        i12 = 198923178;
                        int i212 = iM11307 ^ i12;
                        i21 = i21;
                        upperCase = upperCase;
                        str7 = str7;
                        i19 = i212;
                        i18 = i11;
                        str3 = str3;
                    } else {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        interfaceC6025 = interfaceC6026;
                        i = i21;
                        sArr2 = sArr2;
                        i2 = i22;
                        i3 = i23;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۧ") ^ i17;
                        interfaceC6026 = interfaceC6025;
                        i18 = ((iM45029 ^ i16) * (-30155)) ^ (-188101708);
                        i4 = -384735922;
                        i5 = iM45029 ^ i4;
                        i22 = i2;
                        i23 = i3;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        sArr2 = sArr2;
                        i19 = i5;
                        c10105 = this;
                    }
                    break;
                case 1043668251:
                case 1701408777:
                    i21 = 26537;
                    int iM450212 = C19806.m45029("᩻ᩴ") ^ i17;
                    i18 = ((iM450212 ^ i16) * 27517) ^ 649804880;
                    i5 = iM450212 ^ 1232006445;
                    i22 = i22;
                    i23 = i23;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case 1053391857:
                case 1111614606:
                    strM7071 = C22253.m49420(bArr2);
                    str10 = strM7071;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖܿ") ^ i17) * (-103);
                    i11 = ((iM11307 ^ i16) * 30237) ^ 881603924;
                    i12 = 981062760;
                    int i213 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i213;
                    i18 = i11;
                    str3 = str3;
                    break;
                case 1152086494:
                case 1807489915:
                    C2642.m8171();
                    C1066.m4023();
                    break;
                case 1206123000:
                case 1747691907:
                    if (RunnableC3388.f12514 >= 0) {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i = i21;
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩹") ^ i17) * 41;
                        i18 = ((iM11306 ^ i16) * 14569) ^ 40012713;
                        i6 = -1863863849;
                        i5 = iM11306 ^ i6;
                        i21 = i;
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i19 = i5;
                        c10105 = this;
                    } else {
                        str3 = str3;
                        upperCase = upperCase;
                        str7 = str7;
                        i21 = i21;
                        iM11307 = C19806.m45029("ۤۡ") ^ i16;
                        i11 = ((iM11307 ^ i17) * (-27783)) ^ 1521723315;
                        i12 = 198923178;
                        int i214 = iM11307 ^ i12;
                        i21 = i21;
                        upperCase = upperCase;
                        str7 = str7;
                        i19 = i214;
                        i18 = i11;
                        str3 = str3;
                    }
                    break;
                case 1630678698:
                case 2087365685:
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    i21 = i21;
                    strM10056 = RunnableC3388.m10056(f34499, 69, 11, i21);
                    str4 = zM5579 ? strM10056 : strM2906;
                    iM11307 = ThreadFactoryC3888.m11306("ۢۢ") ^ i17;
                    i11 = ((iM11307 ^ i16) * (-7911)) ^ (-1291956424);
                    i12 = -1505419044;
                    int i215 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i215;
                    i18 = i11;
                    str3 = str3;
                    break;
                case 2100267919:
                case 2107320157:
                    i21 = 36874;
                    int iM450213 = C19806.m45029("᩻ᩴ") ^ i17;
                    i18 = ((iM450213 ^ i16) * 27517) ^ 649804880;
                    i5 = iM450213 ^ 1232006445;
                    i22 = i22;
                    i23 = i23;
                    str3 = str3;
                    upperCase = upperCase;
                    str7 = str7;
                    sArr2 = sArr2;
                    i19 = i5;
                    c10105 = this;
                    break;
                case 2114420708:
                case 2143787976:
                    strM7072 = C22253.m49420(bArr);
                    str9 = strM7072;
                    iM11307 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i16;
                    i11 = ((iM11307 ^ i17) * 23891) ^ (-789981723);
                    i12 = 1311103155;
                    int i216 = iM11307 ^ i12;
                    i21 = i21;
                    upperCase = upperCase;
                    str7 = str7;
                    i19 = i216;
                    i18 = i11;
                    str3 = str3;
                    break;
                default:
                    Object[] objArr2 = new Object[i20];
                    objArr2[c2] = numM4235;
                    objArr2[z ? 1 : 0] = numM8477;
                    String str13 = String.format(locale, str6, objArr2);
                    if (zM5579) {
                        int iM113013 = (i17 - ThreadFactoryC3888.m11306("ܺܿ")) * 63;
                        str = str13;
                        i18 = ((iM113013 ^ i16) * 24435) ^ 771641259;
                        i19 = iM113013 ^ (-1988503135);
                    } else {
                        str = str13;
                        str7 = str10;
                        upperCase2 = str9;
                        upperCase = str8;
                        int iM450214 = (C19806.m45029("۠ۖ") ^ i16) * 13;
                        i19 = iM450214 ^ (-1666364529);
                        i18 = ((iM450214 ^ i17) * 2513) ^ (-798901083);
                    }
                    str3 = str;
                    break;
            }
            return;
        }
    }
}
