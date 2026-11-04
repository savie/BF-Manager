package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.Main;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۜۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6961 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ܳۙ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f22984 = {7048, -24429, -24420, -24426, -24448, -24419, -24421, -24426, -24356, -24421, -24420, -24442, -24425, -24420, -24442, -24356, -24429, -24431, -24442, -24421, -24419, -24420, -24356, -24385, -24393, -24394, -24389, -24397, -24403, -24385, -24387, -24409, -24388, -24410, -24393, -24394, -24429, -24420, -24426, -24448, -24419, -24421, -24426, -24356, -24421, -24420, -24442, -24425, -24420, -24442, -24356, -24429, -24431, -24442, -24421, -24419, -24420, -24356, -24385, -24393, -24394, -24389, -24397, -24403, -24393, -24392, -24393, -24399, -24410};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f22985;

    /* JADX WARN: Code duplicated, block: B:31:0x00fc A[PHI: r12 r13 r14
      0x00fc: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:30:0x00fa, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:30:0x00fa, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:30:0x00fa, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x029a A[PHI: r6 r7 r8
      0x029a: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:70:0x0298, B:53:0x0200, B:49:0x01df, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:70:0x0298, B:53:0x0200, B:49:0x01df, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:70:0x0298, B:53:0x0200, B:49:0x01df, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02ca A[PHI: r1 r10 r11
      0x02ca: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v2 java.lang.String) binds: [B:74:0x02c8, B:66:0x027e, B:38:0x016c, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:74:0x02c8, B:66:0x027e, B:38:0x016c, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:74:0x02c8, B:66:0x027e, B:38:0x016c, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02fb  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        int iM2761;
        int i;
        int i2;
        short[] sArr;
        int iM3169;
        int i3;
        int i4 = C1321.f4751;
        int i5 = C23916.f77426;
        int iM2762 = C0619.m2761("۟۫") ^ i4;
        int i6 = ((iM2762 ^ i5) * 31573) ^ (-203477470);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i7 = iM2762 ^ 2031815631;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1654250073;
        Main main = null;
        String action = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * 23189) >> 31));
            switch (i15) {
                case -2063690032:
                case 243152829:
                    C17743.m41557(intent.getData().getPath());
                    iM2761 = (C0619.m2761("ۨ֫") ^ i4) * 33;
                    i = ((iM2761 ^ i5) * 73) ^ (-134902684);
                    i2 = -1094669534;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -2016928034:
                case -1845876806:
                    i10 = 1046529;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                        i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                        i2 = 1189026208;
                    } else {
                        iM2761 = C0619.m2761("ܰ۟") ^ i4;
                        i = ((iM2761 ^ i5) * 12943) ^ 737916539;
                        i2 = 872447378;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -2000148887:
                case -396235279:
                    C3690.m11987();
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                        i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                        i2 = 1189026208;
                    } else {
                        iM2761 = C0619.m2761("ۙ֡") ^ i5;
                        i = ((iM2761 ^ i4) * (-28729)) ^ (-209753035);
                        i2 = -484608339;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1998617325:
                case -364247224:
                    C2310.m7813();
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۙ֡") ^ i5;
                        i = ((iM2761 ^ i4) * (-28729)) ^ (-209753035);
                        i2 = -484608339;
                    } else {
                        iM2761 = C0619.m2761("ۤۡ") ^ i5;
                        i = ((iM2761 ^ i4) * 2341) ^ 1910125072;
                        i2 = -1497474393;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1976786596:
                case 549315441:
                    s = sArr2[0];
                    s2 = 1023;
                    if (C23916.f77426 > 0) {
                        iM2761 = C0773.m3169("ۤܶ") ^ i5;
                        i = ((iM2761 ^ i4) * (-18615)) ^ 872851192;
                        i2 = -845987315;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        iM3169 = (C0773.m3169("᩺۬") + i4) * (-81);
                        sArr2 = sArr;
                        i6 = ((iM3169 ^ i5) * 31569) ^ (-1690487618);
                        i3 = -1563336309;
                        i7 = iM3169 ^ i3;
                    }
                    break;
                case -1840003942:
                case 364956544:
                    if (C17202.f56030) {
                        iM2761 = (C0619.m2761("ۨܳ") + i4) * (-17);
                        i = ((iM2761 ^ i5) * (-23425)) ^ (-1253080406);
                        i2 = -1241999250;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩳ۠")) * 43;
                        i = ((iM2761 ^ i5) * 5983) ^ 875082316;
                        i2 = 323175627;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1835514042:
                case 975003363:
                    int i16 = i9 + i10;
                    if (i8 - (i16 + i16) <= 0) {
                        iM2761 = (C0773.m3169("ۘ۠") + i5) * 127;
                        i = ((iM2761 ^ i4) * 30043) ^ (-1162795351);
                        i2 = 1170245219;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩸") ^ i4;
                        i = ((iM2761 ^ i5) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 666559976;
                        i2 = -805963155;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1785060727:
                case 2113768195:
                    sArr = f22984;
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0773.m3169("᩺۬") + i4) * (-81);
                        sArr2 = sArr;
                        i6 = ((iM3169 ^ i5) * 31569) ^ (-1690487618);
                        i3 = -1563336309;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۜۤ")) * (-45);
                        sArr2 = sArr;
                        i6 = ((iM3169 ^ i5) * 1853) ^ (-1770162930);
                        i3 = -1745179336;
                    }
                    i7 = iM3169 ^ i3;
                    break;
                case -1671572148:
                case 505435020:
                    if (C0950.f3488 < 0) {
                        iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                        i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                        i2 = 1189026208;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩳ۠")) * 43;
                        i = ((iM2761 ^ i5) * 5983) ^ 875082316;
                        i2 = 323175627;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1446856489:
                case -1351226320:
                    C17743.m41557(null);
                    iM2761 = (C0619.m2761("ۨ֫") ^ i4) * 33;
                    i = ((iM2761 ^ i5) * 73) ^ (-134902684);
                    i2 = -1094669534;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1409770933:
                case 1928570369:
                    i11 = 41202;
                    iM2761 = C0773.m3169("᩺ۘ") ^ i4;
                    i = ((iM2761 ^ i5) * (-27953)) ^ 1792816400;
                    i2 = -1752353870;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1238269626:
                case -143602359:
                    int i17 = s + s2;
                    i8 = i17 * i17;
                    i9 = s * s;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                        i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                        i2 = 1189026208;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۖۘ")) * (-39);
                        i = ((iM2761 ^ i4) * 19555) ^ 1346151785;
                        i2 = -1769623538;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -950521702:
                case 249670112:
                    main = this.f22985;
                    if (main.f46 == null) {
                        iM2761 = C0773.m3169("ۖ۠") ^ i4;
                        i = ((iM2761 ^ i5) * (-2815)) ^ (-1340113968);
                        i2 = 2016673106;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i5) * (-9);
                        i6 = ((iM3169 ^ i4) * (-14221)) ^ 527265965;
                        i3 = -1749073886;
                        i7 = iM3169 ^ i3;
                    }
                    break;
                case -637600557:
                case 433484037:
                    C2878.m9491();
                    iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                    i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                    i2 = 1189026208;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -559154973:
                case 561195540:
                    break;
                case -545058984:
                case 463306543:
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("ۘ֫") ^ i5;
                        i = ((iM2761 ^ i4) * (-13651)) ^ 1020168700;
                        i2 = 790839749;
                    } else {
                        iM2761 = C0619.m2761("ۙ֡") ^ i5;
                        i = ((iM2761 ^ i4) * (-28729)) ^ (-209753035);
                        i2 = -484608339;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -50198086:
                case 823580503:
                    action = intent.getAction();
                    sArr3 = f22984;
                    i12 = 1;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ᩳ۠")) * 43;
                        i = ((iM2761 ^ i5) * 5983) ^ 875082316;
                        i2 = 323175627;
                    } else {
                        iM2761 = C0773.m3169("ۚܺ") ^ i5;
                        i = ((iM2761 ^ i4) * (-1233)) ^ 411628208;
                        i2 = 271096031;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 257340395:
                case 1768807951:
                    i11 = 30854;
                    iM2761 = C0773.m3169("᩺ۘ") ^ i4;
                    i = ((iM2761 ^ i5) * (-27953)) ^ 1792816400;
                    i2 = -1752353870;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 427777194:
                case 1513287348:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("֡ۧ") + i4) * 51;
                        i = ((iM2761 ^ i5) * (-17005)) ^ (-699456968);
                        i2 = 1189026208;
                    } else {
                        iM2761 = C0619.m2761("ۙ֫") ^ i5;
                        i = ((iM2761 ^ i4) * 30607) ^ (-1072185369);
                        i2 = 32026156;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 717951209:
                case 1672701050:
                    if (C2419.m8175(C1826.m6310(sArr3, i12, 35, i11), action)) {
                        iM2761 = (C0773.m3169("֡ۚ") ^ i5) * (-27);
                        i = ((iM2761 ^ i4) * 3419) ^ 1055141271;
                        i2 = 1719878683;
                    } else {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i5) * (-41);
                        i = ((iM2761 ^ i4) * 5499) ^ 643740742;
                        i2 = -195435251;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 788367402:
                case 1708581137:
                    sArr4 = f22984;
                    i13 = 36;
                    i14 = 33;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ۤۡ") ^ i5;
                        i = ((iM2761 ^ i4) * 2341) ^ 1910125072;
                        i2 = -1497474393;
                    } else {
                        iM2761 = C0773.m3169("֫᩶") ^ i4;
                        i = ((iM2761 ^ i5) * 13643) ^ (-1677035390);
                        i2 = -1215903192;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 845589204:
                case 1984409971:
                    RunnableC1848.m6360();
                    break;
                case 990585928:
                case 1181314814:
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i4;
                        i = ((iM2761 ^ i5) * (-8665)) ^ (-1651529583);
                        i2 = -614102664;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩳ۠")) * 43;
                        i = ((iM2761 ^ i5) * 5983) ^ 875082316;
                        i2 = 323175627;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 1318039942:
                case 2042589286:
                    main.f46.m46156();
                    iM2761 = C0773.m3169("ۖ۠") ^ i4;
                    i = ((iM2761 ^ i5) * (-2815)) ^ (-1340113968);
                    i2 = 2016673106;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                default:
                    if (C2419.m8175(C3492.m11486(sArr4, i13, i14, i11), action)) {
                        iM2761 = C0619.m2761("᩸ۗ") ^ i5;
                        i = ((iM2761 ^ i4) * (-1091)) ^ (-1559657209);
                        i2 = -1105265127;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֫") ^ i4) * 33;
                        i = ((iM2761 ^ i5) * 73) ^ (-134902684);
                        i2 = -1094669534;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    public C6961(Main main) {
        this.f22985 = main;
    }
}
