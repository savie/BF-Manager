package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A97T */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15207 extends ActivityC7405 {

    /* JADX INFO: renamed from: ۠ۚۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f49636 = {7787, 29422, 29409, 29419, 29437, 29408, 29414, 29419, 29345, 29414, 29409, 29435, 29418, 29409, 29435, 29345, 29422, 29420, 29435, 29414, 29408, 29409, 29345, 29401, 29382, 29386, 29400, 29417, 29437, 29408, 29410, 29386, 29431, 29435, 29418, 29437, 29409, 29422, 29411, 29390, 29439, 29439};

    /* JADX WARN: Code duplicated, block: B:104:0x039b  */
    /* JADX WARN: Code duplicated, block: B:108:0x03c7 A[PHI: r22
      0x03c7: PHI (r22v3 short[]) = (r22v1 short[]), (r22v1 short[]), (r22v2 short[]), (r22v1 short[]) binds: [B:107:0x03c5, B:99:0x037d, B:95:0x0361, B:157:0x03c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x026e A[PHI: r14
      0x026e: PHI (r14v2 int) = (r14v1 int), (r14v3 int) binds: [B:15:0x005d, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x029f A[PHI: r12 r13
      0x029f: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:79:0x029d, B:25:0x0086, B:22:0x0080, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short), (r13v1 short) binds: [B:79:0x029d, B:25:0x0086, B:22:0x0080, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0302 A[PHI: r9 r10
      0x0302: PHI (r9v3 short) = (r9v2 short), (r9v1 short) binds: [B:87:0x0300, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r10v3 short) = (r10v2 short), (r10v1 short) binds: [B:87:0x0300, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0333 A[PHI: r8
      0x0333: PHI (r8v3 char) = (r8v2 char), (r8v1 char) binds: [B:91:0x0331, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        int i2;
        Uri uriM49836;
        int iM2761;
        int i3;
        int i4;
        ActivityC15207 activityC15207 = this;
        boolean zM49833 = false;
        Uri uri = null;
        SecurityException securityException = null;
        int flags = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -845710117;
        int i10 = C1783.f6087;
        int i11 = C4282.f15546;
        int iM2762 = (C0619.m2761("ۧ֨") + i10) * 29;
        int i12 = ((iM2762 ^ i11) * 2747) ^ (-966389769);
        int i13 = iM2762 ^ (-87707318);
        short[] sArr = null;
        Intent intent = null;
        AbstractC22044 abstractC22044M13271 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-17241)) >> 31));
            switch (i9) {
                case -2127560351:
                case 318228675:
                    sArr = f49636;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩺") ^ i11;
                        i = ((iM3169 ^ i10) * 19479) ^ (-129253888);
                        i2 = -406623132;
                    } else {
                        iM3169 = (i10 - C0619.m2761("֨֨")) * (-87);
                        i = ((iM3169 ^ i11) * (-7331)) ^ 1971372295;
                        i2 = -130440617;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1931140058:
                case -1619305687:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩺") ^ i11;
                        i = ((iM3169 ^ i10) * 19479) ^ (-129253888);
                        i2 = -406623132;
                    } else {
                        iM3169 = C0773.m3169("ۢܽ") ^ i11;
                        i = ((iM3169 ^ i10) * (-4965)) ^ (-925618231);
                        i2 = -1840556847;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1832037551:
                case -429598308:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("᩺ۙ") ^ i10) * 101;
                        i = ((iM3169 ^ i11) * (-2533)) ^ 1599492053;
                        i2 = -496699157;
                    } else {
                        iM3169 = C0773.m3169("ۜܶ") ^ i10;
                        i = ((iM3169 ^ i11) * (-8849)) ^ 1597083576;
                        i2 = -959343094;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1770880898:
                case 54574304:
                    super.onCreate(bundle);
                    iM3169 = C0619.m2761("ܿ᩸") ^ i11;
                    i = ((iM3169 ^ i10) * 28291) ^ 443609715;
                    i2 = -1958093836;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1620473003:
                case -712022391:
                    try {
                        intent.setFlags(flags & (-4));
                        C1564.m5513(activityC15207, intent);
                    } catch (Exception unused) {
                    }
                    iM3169 = C0619.m2761("۫ۤ") ^ i10;
                    i = ((iM3169 ^ i11) * 7611) ^ (-839441161);
                    i2 = 488409062;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1553986474:
                case 697666585:
                    try {
                        int i14 = C1663.f5756;
                        intent = new Intent(activityC15207, (Class<?>) ActivityC18143.class);
                        AbstractC0116.m1232(intent, 268435456);
                        AbstractC3624.m11767(intent, 67108864);
                        C1112.m4126(intent, uri);
                        intent.setAction(C1080.m4056(f49636, 1, 26, i8));
                        intent.setData(uri);
                        intent.putExtra(C2834.m9343(f49636, 27, 15, i8), true);
                        iM3169 = C0773.m3169("֫᩸") ^ i10;
                        i = ((iM3169 ^ i11) * (-32397)) ^ 732430950;
                        i2 = 916429168;
                    } catch (Exception unused2) {
                        intent = null;
                        iM3169 = C0619.m2761("۫ۤ") ^ i10;
                        i = ((iM3169 ^ i11) * 7611) ^ (-839441161);
                        i2 = 488409062;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1514701946:
                case -526875397:
                    if (!C17202.m40372()) {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                        i3 = ((iM2761 ^ i11) * 9337) ^ (-729785594);
                        i4 = 2003484511;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩺") ^ i11;
                        i = ((iM3169 ^ i10) * 19479) ^ (-129253888);
                        i2 = -406623132;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        activityC15207 = this;
                    }
                    break;
                case -1487491678:
                case 177939613:
                    if (zM49833) {
                        iM3169 = (C0773.m3169("᩸ۗ") + i11) * 15;
                        i = ((iM3169 ^ i10) * (-12561)) ^ 191531062;
                        i2 = 1088849509;
                    } else {
                        iM3169 = (i10 - C0619.m2761("᩵ᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i11) * (-19273)) ^ 2067010116;
                        i2 = -1386523159;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1344456671:
                case -560384610:
                    uriM49836 = abstractC22044M13271.m49836();
                    uri = uriM49836;
                    iM3169 = C0619.m2761("֡ܰ") ^ i11;
                    i = ((iM3169 ^ i10) * 16961) ^ (-1761849853);
                    i2 = 221677219;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1343578120:
                case 948412261:
                    int i15 = C14584.f45961;
                    abstractC22044M13271 = C14584.m35208(C2485.m8359(this)).m13271();
                    zM49833 = abstractC22044M13271.m49833();
                    iM3169 = C0773.m3169("۬ܶ") ^ i11;
                    i = ((iM3169 ^ i10) * (-2947)) ^ 1190596154;
                    i2 = -2081042563;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1226295457:
                case 1453190718:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("᩶᩸") ^ i11;
                        i = ((iM3169 ^ i10) * 31273) ^ (-2138120430);
                        i2 = 1692039593;
                    } else {
                        iM3169 = C0619.m2761("ܽᩳ") ^ i11;
                        i = ((iM3169 ^ i10) * (-3055)) ^ 2033846775;
                        i2 = 1491739621;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1216687386:
                case 518336467:
                    RunnableC3055.m9933();
                    if (C3779.f12953 > 0) {
                        iM3169 = C0619.m2761("᩶᩸") ^ i11;
                        i = ((iM3169 ^ i10) * 31273) ^ (-2138120430);
                        i2 = 1692039593;
                    } else {
                        iM3169 = C0773.m3169("ۘ۫") ^ i10;
                        i = ((iM3169 ^ i11) * (-20985)) ^ (-2134380702);
                        i2 = 1421627751;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -1017102928:
                case -278159170:
                    C1321.m4852();
                    C2485.m8357();
                    iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                    i3 = ((iM2761 ^ i11) * 9337) ^ (-729785594);
                    i4 = 2003484511;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -891525852:
                case 840288725:
                    if ((flags & 1) != 0) {
                        iM2761 = (C0773.m3169("ۗ֫") ^ i11) * 51;
                        i3 = ((iM2761 ^ i10) * (-28905)) ^ (-1346928305);
                        i4 = -739968698;
                    } else {
                        iM2761 = C0619.m2761("֫᩵") ^ i10;
                        i3 = ((iM2761 ^ i11) * 19605) ^ (-156362176);
                        i4 = 1661241805;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -770391695:
                case -300236121:
                    i5 = s + s2;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ܺۙ") ^ i10) * (-3);
                        i = ((iM3169 ^ i11) * (-21393)) ^ (-675907753);
                        i2 = 1944190909;
                    } else {
                        iM3169 = C0773.m3169("ۤۙ") ^ i11;
                        i = ((iM3169 ^ i10) * (-12451)) ^ (-886361381);
                        i2 = -50296784;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -758236049:
                case -136711232:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                        i3 = ((iM2761 ^ i11) * 9337) ^ (-729785594);
                        i4 = 2003484511;
                    } else {
                        iM2761 = C0773.m3169("۟ۧ") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-17053)) ^ (-1432576920);
                        i4 = -1415807918;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -643568816:
                case 1364261877:
                    i6 = i5 * i5;
                    s3 = 2;
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("ۜ᩸") ^ i11;
                        i = ((iM3169 ^ i10) * (-14229)) ^ (-185021874);
                        i2 = 691124131;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩵") ^ i10;
                        i = ((iM3169 ^ i11) * (-8513)) ^ 1797951220;
                        i2 = -1296699474;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -571516815:
                case 227731370:
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0619.m2761("᩺ۙ") ^ i10) * 101;
                        i = ((iM3169 ^ i11) * (-2533)) ^ 1599492053;
                        i2 = -496699157;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        activityC15207 = this;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                        i3 = ((iM2761 ^ i11) * 9337) ^ (-729785594);
                        i4 = 2003484511;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -510359993:
                case 2091596459:
                    try {
                        C1564.m5513(activityC15207, intent);
                        iM3169 = C0619.m2761("۫ۤ") ^ i10;
                        i = ((iM3169 ^ i11) * 7611) ^ (-839441161);
                        i2 = 488409062;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        activityC15207 = this;
                    } catch (SecurityException e) {
                        int iM2763 = (i11 - C0619.m2761("ܺ᩶")) * 25;
                        i3 = ((iM2763 ^ i10) * 30185) ^ 255853662;
                        i13 = iM2763 ^ (-1666251826);
                        securityException = e;
                        i12 = i3;
                    }
                    break;
                case -509030836:
                case 1999927397:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ۜ᩸") ^ i11;
                        i = ((iM3169 ^ i10) * (-14229)) ^ (-185021874);
                        i2 = 691124131;
                    } else {
                        iM3169 = C0619.m2761("᩶᩸") ^ i11;
                        i = ((iM3169 ^ i10) * 31273) ^ (-2138120430);
                        i2 = 1692039593;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -438215508:
                case 691022353:
                    throw securityException;
                case -328603919:
                case 810820145:
                    c = 0;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۘ۫") ^ i10;
                        i = ((iM3169 ^ i11) * (-20985)) ^ (-2134380702);
                        i2 = 1421627751;
                    } else {
                        iM3169 = C0773.m3169("ۗۜ") ^ i11;
                        i = ((iM3169 ^ i10) * (-1979)) ^ 1103828920;
                        i2 = 1595170892;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -325087791:
                case 483221845:
                    if ((i7 + 1) - i6 <= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i11;
                        i = ((iM3169 ^ i10) * (-19679)) ^ 967285234;
                        i2 = 1630599686;
                    } else {
                        iM3169 = C0619.m2761("֡᩸") ^ i10;
                        i = ((iM3169 ^ i11) * (-7751)) ^ 196065277;
                        i2 = 559428263;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case -299091650:
                case 256520511:
                    flags = intent.getFlags();
                    iM2761 = (C0619.m2761("᩺ۤ") + i10) * (-29);
                    i3 = ((iM2761 ^ i11) * (-22611)) ^ 322720608;
                    i4 = 1567513028;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -28085201:
                case 1802277798:
                    i8 = 2886;
                    iM3169 = C0773.m3169("᩷ۧ") ^ i10;
                    i = ((iM3169 ^ i11) * (-6471)) ^ 1548330181;
                    i2 = 1232596550;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 165884834:
                case 1167097525:
                    i8 = 29327;
                    iM3169 = C0773.m3169("᩷ۧ") ^ i10;
                    i = ((iM3169 ^ i11) * (-6471)) ^ 1548330181;
                    i2 = 1232596550;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 512287618:
                case 1038454128:
                    if (C1783.m6232()) {
                        iM3169 = C0773.m3169("ۜ᩸") ^ i11;
                        i = ((iM3169 ^ i10) * (-14229)) ^ (-185021874);
                        i2 = 691124131;
                    } else {
                        iM3169 = C0619.m2761("۫ᩴ") ^ i11;
                        i = ((iM3169 ^ i10) * (-23329)) ^ 652821785;
                        i2 = -160599149;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 740958106:
                case 2075592124:
                    s = sArr[c];
                    s2 = 1;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("۟᩻") ^ i11) * 81;
                        i = ((iM3169 ^ i10) * 29177) ^ 41712994;
                        i2 = 550937567;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩵") ^ i10;
                        i = ((iM3169 ^ i11) * 20065) ^ (-878659977);
                        i2 = -1742712539;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 1029585334:
                case 1618983596:
                    AbstractC0641.m2813();
                    return;
                case 1077047225:
                case 1697524393:
                    uriM49836 = abstractC22044M13271.mo42888();
                    uri = uriM49836;
                    iM3169 = C0619.m2761("֡ܰ") ^ i11;
                    i = ((iM3169 ^ i10) * 16961) ^ (-1761849853);
                    i2 = 221677219;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 1081772158:
                case 1186480165:
                    if (C4238.f15451 < 0) {
                        iM3169 = (C0619.m2761("᩺ۙ") ^ i10) * 101;
                        i = ((iM3169 ^ i11) * (-2533)) ^ 1599492053;
                        i2 = -496699157;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩸") ^ i11;
                        i = ((iM3169 ^ i10) * (-14229)) ^ (-185021874);
                        i2 = 691124131;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 1149508692:
                case 2085185062:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩺") ^ i11;
                        i = ((iM3169 ^ i10) * 19479) ^ (-129253888);
                        i2 = -406623132;
                    } else {
                        iM3169 = (C0619.m2761("۬ۡ") ^ i10) * 7;
                        i = ((iM3169 ^ i11) * 22007) ^ 693821986;
                        i2 = 361178966;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 1384361272:
                case 1477909279:
                    C3734.m12152();
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("᩶᩸") ^ i11;
                        i = ((iM3169 ^ i10) * 31273) ^ (-2138120430);
                        i2 = 1692039593;
                    } else {
                        iM3169 = (C0773.m3169("۟᩻") ^ i11) * 81;
                        i = ((iM3169 ^ i10) * 29177) ^ 41712994;
                        i2 = 550937567;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
                case 1462252361:
                case 2121708896:
                    C4238.m13537(this);
                    return;
                default:
                    i7 = s * s3;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("۫ᩴ") ^ i11;
                        i = ((iM3169 ^ i10) * (-23329)) ^ 652821785;
                        i2 = -160599149;
                    } else {
                        iM3169 = C0619.m2761("ۖۚ") ^ i11;
                        i = ((iM3169 ^ i10) * 12217) ^ 1445993899;
                        i2 = -935532544;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    activityC15207 = this;
                    break;
            }
        }
    }
}
