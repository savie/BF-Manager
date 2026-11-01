package l;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩷᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21135 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68820 = 0;

    /* JADX INFO: renamed from: ᩹ۛ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f68821 = {2165, -933, -950, -937, -933, -903, -954, -950, -936, -950, -931, -912, -949, -950, -948, -958, -950, -933, -953, -960, -949, -933, -954, -933, -957, -950, 9907, 15045, 15060, 15049, 15045, 15079, 15064, 15060, 15046, 15060, 15043, 15086, 15042, 15043, 15058, 15068, 15060, 15045, 15065, 15070, 15061, 15045, 15064, 15045, 15069, 15060, 15042, 15056, 15047, 15060, 15061, 15088, 15042, 15073, 15056, 15045, 15065, 15042, 15048, 15071, 15045, 15056, 15049, 15095, 15064, 15069, 15060, 15103, 15056, 15068, 15060, 15042, 15044, 15041, 15041, 15070, 15043, 15045, 15101, 15070, 15058, 15056, 15045, 15060, 5244, 16924, 16925, 16896, 16935, 16924, 16925, 16923, 16919, 16917, 16904, 16913, 16916, 16925, 16935, 16925, 16918, 16927, 16913, 16918, 16925, 587, -4574, -4569, -4558, -4569, 4889, -13511, -11708, -2611, 12673, -5617, 10218, -12092, -12088, -15532, -23409, -23421, -23416, -23415, -23415, -23416, -23419, -23400, -23373, -23397, -23421, -23394, -23416, -23373, -23397, -23394, -23411, -23396, -23373, -23398, -23419, -23415, -23397, -23415, -23394, -2666, 11760, -10213, -23393, -23411, -23398, -23415, -23361, -23400, -23411, -23400, -23415, -23389, -23422, -23362, -23415, -23393, -23399, -23424, -23400, -23400, -23419, -23400, -23424, -23415, -23393, -23403, -23422, -23400, -23411, -23404, -23382, -23419, -23424, -23415, -23390, -23411, -23423, -23415, -23393, -23399, -23396, -23396, -23421, -23394, -23400, -23392, -23421, -23409, -23411, -23400, -23415, -23393, -23411, -23398, -23415, -23416, -23379, -23393, -23364, -23411, -23400, -23420, -23400, -23415, -23404, -23400, -23373, -23398, -23419, -23415, -23397, -23415, -23394, -23373, -23393, -23411, -23398, -23415, -23373, -23411, -23393, -23373, -23396, -23411, -23400, -23420, -23423, -23415, -23400, -23420, -23421, -23416, -23423, -23415, -23423, -23421, -23394, -23403, -23366, -23419, -23415, -23397, -23415, -23394, -23400, -23415, -23404, -23400, -23366, -23419, -23415, -23397, -23415, -23394, -23373, -23393, -23394, -23409, -23400, -23415, -23404, -23400, -23366, -23419, -23415, -23397, -23415, -23394, -23373, -23416, -23411, -23400, -23411, 13537, -12620, 8573, -23400, -23415, -23404, -23400, -23366, -23419, -23415, -23397, -23415, -23394, -23373, -23416, -23415, -23409, -23356, -23341, -23423, -23355, -23374, -23369, -23348, -23323, -23375, -23354, -23357, -23357, -23348, -23391, -23379, -23362, -23385, -23373, -23356, -23377, -23392, -23379, -23361, -23361, -23408, -23382, -23387, -23383, -23392, -23384, -23408, -23391, -23383, -23368, -23388, -23389, -23384, -23355, -23373, -23356, -23361, -23368, -23379, -23362, -23368, -23408, -23383, -23390, -23384, -23355, -23358, -23354, -23341, -23322, 3203, 14253, 3903, 6495, 887, 14126, 5059, -107, 7076, 5615, -2472, 2431, 6188, 2162, 17682, -19792, -20042, 26392, -21486, 31374, -17401, 16565, 21373, -23398, -23982, 18160, 27049, 16558, 17034, 23055, 17356, -22757, 20924, 17022, 28512, 31680, -20153, 26453, 26006, 20132, -19944, 23848, 17486, 25688, 22270, 17040, 23029, 24832, 17082, 18853, 3171, 31299, 31307, 31299, 31297, 31324, 31319, 31352, 31303, 31307, 31321, 31307, 31324, 31358, 31311, 31322, 31302, 31299, 31307, 31299, 31297, 31324, 31319, 31352, 31303, 31307, 31321, 31307, 31324, 31232, 31299, 31307, 31299, 31297, 31324, 31319, 31235, 31325, 31322, 31311, 31322, 31307, 7045, -14479, -14528, -14499, -14511, -14477, -14516, -14528, -14510, -14528, -14505};

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68822;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f68823 = false;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f68824;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C20556 f68825;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public boolean f68826;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C23566 f68827;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public String f68828;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C6111 f68829;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68830;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public byte f68831;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public String f68832;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1785305879;
        int i7 = C1977.f7413;
        int i8 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i7;
        int i9 = ((iM11306 ^ i8) * (-1085)) ^ 1001235702;
        int i10 = 126046506;
        while (true) {
            i6 = ((((i6 ^ i8) * 24395) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2004687224:
                case 811375327:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = (C19806.m45029("ۤۚ") + i7) * 75;
                        i9 = ((iM11306 ^ i8) * (-32329)) ^ (-542625981);
                        i10 = -472817146;
                    }
                    break;
                case -1990776165:
                case -1526601532:
                    if (C2871.m8646()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-30175)) ^ 366501684;
                        i10 = -1375756785;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ᩴ᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * (-14411)) ^ (-145265185);
                        i10 = 742333105;
                    }
                    break;
                case -1878301095:
                case -516526944:
                    s2 = 990;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = C19806.m45029("ۤܿ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 19677) ^ 2063895176;
                        i10 = -1183535844;
                    }
                    break;
                case -1556129133:
                case 920431892:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 21357) ^ 1968035471;
                        i10 = -587741555;
                    }
                    break;
                case -1465845284:
                case 309507910:
                    return ThreadFactoryC3888.m11312(sArr2, i5, 10, i4);
                case -1453976953:
                case -466297288:
                    c = 448;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩵ۛ")) * 57;
                        i9 = ((iM11306 ^ i8) * (-21617)) ^ (-1638037382);
                        i10 = -1513901490;
                    } else {
                        iM11306 = C19806.m45029("ᩳۙ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 31431) ^ 833481842;
                        i10 = -435908838;
                    }
                    break;
                case -1391771608:
                case -1340366847:
                    i4 = 64772;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i7) * (-71);
                    i9 = ((iM11306 ^ i8) * (-19709)) ^ 1540190945;
                    i10 = 1184766340;
                    break;
                case -862434425:
                case 326904632:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ᩴ᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * (-14411)) ^ (-145265185);
                        i10 = 742333105;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    }
                    break;
                case -840689013:
                case 326501541:
                    C2249.m6915();
                    iM11306 = ThreadFactoryC3888.m11306("ۨܽ") ^ i8;
                    i9 = ((iM11306 ^ i7) * 21357) ^ 1968035471;
                    i10 = -587741555;
                    break;
                case -815627572:
                case 1745739475:
                    i = s * s;
                    i2 = 980100;
                    if (C19806.m45024()) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩵ۛ")) * 57;
                        i9 = ((iM11306 ^ i8) * (-21617)) ^ (-1638037382);
                        i10 = -1513901490;
                    } else {
                        iM11306 = C19806.m45029("ۛۙ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 8137) ^ 1170405445;
                        i10 = -1321445662;
                    }
                    break;
                case -482799560:
                case 1684099453:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩵ۛ")) * 57;
                        i9 = ((iM11306 ^ i8) * (-21617)) ^ (-1638037382);
                        i10 = -1513901490;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 12879) ^ (-1978660599);
                        i10 = -1001881548;
                    }
                    break;
                case -414950336:
                case 1713675606:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۙ") + i8) * (-73);
                        i9 = ((iM11306 ^ i7) * 5139) ^ 1104229821;
                        i10 = -2104593099;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 21357) ^ 1968035471;
                        i10 = -587741555;
                    }
                    break;
                case -344855485:
                case 1555147290:
                    int i12 = s + s2;
                    if ((i12 * i12) - i3 > 0) {
                        iM11306 = C19806.m45029("ۚۢ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-7561)) ^ 238034195;
                        i10 = -1788523373;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷۬") + i8) * (-49);
                        i9 = ((iM11306 ^ i7) * 15077) ^ (-50434156);
                        i10 = -661018819;
                    }
                    break;
                case -296045907:
                case 109409063:
                    sArr2 = f68821;
                    i5 = 449;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۙ") + i8) * (-73);
                        i9 = ((iM11306 ^ i7) * 5139) ^ 1104229821;
                        i10 = -2104593099;
                    } else {
                        iM11306 = C19806.m45029("ܶۛ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 17697) ^ 413332481;
                        i10 = 1081592999;
                    }
                    break;
                case -199556318:
                case 1434860610:
                    sArr = f68821;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۡ") + i8) * 87;
                        i9 = ((iM11306 ^ i7) * 32341) ^ 1514980270;
                        i10 = -1321106714;
                    }
                    break;
                case -158229604:
                case 264227206:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 21715) ^ (-855705792);
                        i10 = -150683621;
                    }
                    break;
                case -108450814:
                case 1810807330:
                    RunnableC1564.m5345();
                    return null;
                case 178344764:
                case 1451800913:
                    i4 = 50981;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i7) * (-71);
                    i9 = ((iM11306 ^ i8) * (-19709)) ^ 1540190945;
                    i10 = 1184766340;
                    break;
                default:
                    s = sArr[c];
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18511) ^ 1394695973;
                        i10 = -392505462;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-1639)) ^ (-1370295309);
                        i10 = 1299388827;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e3 A[PHI: r4
      0x00e3: PHI (r4v4 byte) = (r4v3 byte), (r4v2 byte) binds: [B:31:0x00e1, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x011f A[PHI: r2 r3
      0x011f: PHI (r2v4 l.ܿۧ᩺) = (r2v3 l.ܿۧ᩺), (r2v2 l.ܿۧ᩺), (r2v2 l.ܿۧ᩺) binds: [B:35:0x011d, B:15:0x007e, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:35:0x011d, B:15:0x007e, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r7 r8 r11 r13 r14 r15
      0x0202: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:55:0x0200, B:47:0x01bd, B:27:0x00c4, B:23:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0238 A[PHI: r6
      0x0238: PHI (r6v4 char) = (r6v3 char), (r6v2 char) binds: [B:59:0x0236, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0282 A[PHI: r9 r10 r20
      0x0282: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:67:0x0280, B:63:0x0266, B:51:0x01de, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:67:0x0280, B:63:0x0266, B:51:0x01de, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r20v5 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:67:0x0280, B:63:0x0266, B:51:0x01de, B:17:0x0082, B:15:0x007e, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47565(ActivityC21135 activityC21135, DialogInterfaceC19356 dialogInterfaceC19356) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C2249.f8050;
        int iM450210 = C19806.m45029("ܽᩴ") ^ i3;
        int i5 = ((iM450210 ^ i4) * 29455) ^ 26369167;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ 346735854;
        InterfaceC17314 interfaceC17314M8257 = null;
        int i7 = 0;
        byte b = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 314439764;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-16803)) >> 31));
            switch (i13) {
                case -1961862843:
                case -830914291:
                    sArr2 = f68821;
                    i11 = 91;
                    i12 = 20;
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i4) * 65;
                        i = ((iM45029 ^ i3) * 2161) ^ 607189123;
                        i2 = -1635301654;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13263)) ^ 1964793352;
                        i2 = -274598152;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1938069292:
                case -1591235975:
                    i9 = s + s3;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i4) * 65;
                        i = ((iM45029 ^ i3) * 2161) ^ 607189123;
                        i2 = -1635301654;
                    } else {
                        iM45029 = C19806.m45029("ܳۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 32151) ^ (-1071215898);
                        i2 = -18992322;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1935482137:
                case 1577711608:
                    i10 = 17016;
                    iM45029 = C19806.m45029("ۡ᩵") ^ i4;
                    i = ((iM45029 ^ i3) * (-30141)) ^ 585307394;
                    i2 = -1288685702;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1698935618:
                case -1343396867:
                    i8 = s * s2;
                    s3 = 7103;
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                        i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                        i2 = 994114695;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ᩴ")) * (-57);
                        i = ((iM45029 ^ i4) * (-31837)) ^ 319047191;
                        i2 = -2026161595;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1613431129:
                case -887459641:
                    i10 = 52616;
                    iM45029 = C19806.m45029("ۡ᩵") ^ i4;
                    i = ((iM45029 ^ i3) * (-30141)) ^ 585307394;
                    i2 = -1288685702;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1551346897:
                case 3689442:
                    s = sArr[c];
                    s2 = 28412;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i4) * 65;
                        i = ((iM45029 ^ i3) * 2161) ^ 607189123;
                        i2 = -1635301654;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * 15083) ^ 1821739591;
                        i2 = 1871633426;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1551138333:
                case 682038239:
                    C2249.m6906(interfaceC17314M8257.mo4064(b, C0216.m1588(sArr2, i11, i12, i10)));
                    if (C0216.m1591() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i4) * 65;
                        i = ((iM45029 ^ i3) * 2161) ^ 607189123;
                        i2 = -1635301654;
                    } else {
                        iM45029 = C19806.m45029("᩹ۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 377) ^ (-1577221862);
                        i2 = -2118155299;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1503118594:
                case 2066391338:
                    break;
                case -1425341464:
                case 814679240:
                    c = 'Z';
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("ܺۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 14891) ^ (-2021693822);
                        i2 = 1276261600;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 19159) ^ 1632109417;
                        i2 = -177806840;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1369715890:
                case 889538917:
                    C1066.m4023();
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                        i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                        i2 = 994114695;
                    } else {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 57;
                        i = ((iM45029 ^ i4) * (-13453)) ^ 1061502456;
                        i2 = -1614085771;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1365119221:
                case 1934854561:
                    C1668.m5572(dialogInterfaceC19356);
                    if (activityC21135.f68831 == activityC21135.f68824) {
                        iM45029 = C19806.m45029("۟۫") ^ i3;
                        i = ((iM45029 ^ i4) * 25839) ^ 1585974644;
                        i2 = 922805029;
                    } else {
                        iM45029 = C19806.m45029("֡ܳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-12785)) ^ (-709403185);
                        i2 = 1753700555;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1224366007:
                case 958962520:
                    C2788.m8472();
                    if (C1189.m4368() <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                        i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                        i2 = 994114695;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 19159) ^ 1632109417;
                        i2 = -177806840;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -600795848:
                case 1786420713:
                    C0526.m2437();
                    iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                    i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                    i2 = 994114695;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -579651071:
                case 1831090841:
                    b = (byte) i7;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * 57;
                        i = ((iM45029 ^ i4) * 18551) ^ (-1444446295);
                        i2 = -866601665;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-10677)) ^ (-1694781805);
                        i2 = -952528997;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 212719318:
                case 1748023464:
                    C2477.m7593();
                    break;
                case 615347354:
                case 750916599:
                    interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                    i7 = activityC21135.f68824;
                    if (C7105.m18985()) {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 57;
                        i = ((iM45029 ^ i4) * (-13453)) ^ 1061502456;
                        i2 = -1614085771;
                    } else {
                        iM45029 = C19806.m45029("ۙܿ") ^ i4;
                        i = ((iM45029 ^ i3) * (-23017)) ^ 1502097790;
                        i2 = 487633128;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1090137856:
                case 1484826586:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                        i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                        i2 = 994114695;
                    } else {
                        iM45029 = (C19806.m45029("ܽۙ") + i3) * (-45);
                        i = ((iM45029 ^ i4) * (-23131)) ^ 962014807;
                        i2 = -132887583;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1105193264:
                case 2055047092:
                    activityC21135.setResult(2);
                    super.finish();
                    break;
                case 1206431439:
                case 1827487274:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 57;
                        i = ((iM45029 ^ i4) * (-13453)) ^ 1061502456;
                        i2 = -1614085771;
                    } else {
                        iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * 57;
                        i = ((iM45029 ^ i4) * 18551) ^ (-1444446295);
                        i2 = -866601665;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1682835052:
                case 2123526033:
                    sArr = f68821;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܰ۬")) * (-21);
                        i = ((iM45029 ^ i3) * 26259) ^ (-1042778808);
                        i2 = 994114695;
                    } else {
                        iM45029 = C19806.m45029("۫ܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6101)) ^ 768394826;
                        i2 = 1802014517;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (i8 - (i9 * i9) > 0) {
                        iM45029 = C19806.m45029("ܽۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 12443) ^ (-41176291);
                        i2 = -2026893713;
                    } else {
                        iM45029 = C19806.m45029("۠ܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-12067)) ^ (-1249454861);
                        i2 = 1287745496;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m47571() {
        int iM11306;
        int i;
        C6111 c6111 = null;
        boolean z = false;
        int i2 = 84332173;
        int i3 = C3535.f13026;
        int i4 = C1937.f7317;
        int iM45029 = (C19806.m45029("᩷ۤ") + i3) * 13;
        int i5 = ((iM45029 ^ i4) * 28965) ^ 1536819891;
        int i6 = 2104611425;
        while (true) {
            int i7 = iM45029 ^ i6;
            C11018 c11018 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 30059) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2121083542:
                    case -372315243:
                        C2871.m8644(c11018, this.f68831);
                        iM11306 = C19806.m45029("ۚۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 26179) ^ (-2064911827);
                        i = -1197572507;
                        i7 = iM11306 ^ i;
                        break;
                    case -2052662053:
                    case -1543716323:
                        if (C2124.f7782 > 0 && C2788.f10625 < 0) {
                            if (!RunnableC0195.m1431()) {
                                iM45029 = C19806.m45029("ᩴۘ") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-23179)) ^ 1317366856;
                                i6 = 970933239;
                            } else if (C2788.f10625 < 0) {
                                if (C1977.f7413 > 0) {
                                    if (C1025.f4800 < 0) {
                                        if (C3286.f12186) {
                                            iM45029 = (i4 - C19806.m45029("᩵ۢ")) * (-49);
                                            i5 = ((iM45029 ^ i3) * 12343) ^ (-925206147);
                                            i6 = 1325522979;
                                            break;
                                        } else if (CallableC1627.f6528) {
                                            c11018 = new C11018();
                                            if (C1875.f7103 < 0) {
                                                iM11306 = (ThreadFactoryC3888.m11306("᩵ۛ") ^ i3) * 67;
                                                i5 = ((iM11306 ^ i4) * (-30103)) ^ (-254271259);
                                                i = 877189902;
                                                i7 = iM11306 ^ i;
                                                break;
                                            }
                                        }
                                    }
                                }
                                iM45029 = (ThreadFactoryC3888.m11306("᩻᩶") + i4) * 13;
                                i5 = ((iM45029 ^ i3) * 3711) ^ 1313447190;
                                i6 = 1345911487;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-19081)) ^ (-85604807);
                                i6 = -176507508;
                            }
                            break;
                        }
                        iM45029 = (C19806.m45029("ۘۤ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM45029 ^ i4) * 28829) ^ (-66155556);
                        i6 = 1885230510;
                        break;
                    case -1499206301:
                    case -1184161072:
                        c6111.m16870(c11018, z);
                        return c11018.m27798();
                    case -1467743081:
                    case -9518392:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (!CallableC1627.f6528) {
                            iM45029 = (i4 - C19806.m45029("᩵ۢ")) * (-49);
                            i5 = ((iM45029 ^ i3) * 12343) ^ (-925206147);
                            i6 = 1325522979;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19081)) ^ (-85604807);
                            i6 = -176507508;
                        }
                        break;
                    case -1432767947:
                    case -1312411520:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (i4 - C19806.m45029("᩵ۢ")) * (-49);
                            i5 = ((iM45029 ^ i3) * 12343) ^ (-925206147);
                            i6 = 1325522979;
                        } else {
                            iM45029 = C19806.m45029("ᩴۘ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-23179)) ^ 1317366856;
                            i6 = 970933239;
                        }
                        break;
                    case -1366674557:
                    case 1081350391:
                        C2332.m7079();
                        return null;
                    case -1059382961:
                    case 1665858391:
                        C3286.m9798();
                        if (C2642.m8171() == 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻᩶") + i4) * 13;
                            i5 = ((iM45029 ^ i3) * 3711) ^ 1313447190;
                            i6 = 1345911487;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19081)) ^ (-85604807);
                            i6 = -176507508;
                        }
                        break;
                    case -1045055801:
                    case 1394790466:
                        c6111 = this.f68829;
                        z = false;
                        if (RunnableC1606.f6488 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۗᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 29727) ^ (-853385983);
                            i = -427036493;
                            i7 = iM11306 ^ i;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻᩶") + i4) * 13;
                            i5 = ((iM45029 ^ i3) * 3711) ^ 1313447190;
                            i6 = 1345911487;
                        }
                        break;
                    case -761948106:
                    case 740425861:
                        c11018.m27784(this.f68822);
                        if (this.f68822) {
                            iM11306 = ThreadFactoryC3888.m11306("᩻᩸") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16151)) ^ 11329080;
                            i = 41013669;
                        } else {
                            iM11306 = C19806.m45029("ۚۤ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 26179) ^ (-2064911827);
                            i = -1197572507;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        C3743.m10966();
                        C1460.m5050();
                        iM45029 = (i4 - C19806.m45029("᩵ۢ")) * (-49);
                        i5 = ((iM45029 ^ i3) * 12343) ^ (-925206147);
                        i6 = 1325522979;
                        break;
                }
            }
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        C6111 c6111 = null;
        C20556 c20556 = null;
        int i = 1392936909;
        int i2 = C10634.f36300;
        int i3 = C1875.f7103;
        int iM11306 = (ThreadFactoryC3888.m11306("ܽ֨") ^ i2) * 115;
        int i4 = ((iM11306 ^ i3) * (-6543)) ^ (-602942059);
        int i5 = 1050631358;
        while (true) {
            i = ((((i ^ i3) * 17019) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2061898600:
                case -1748173746:
                    c20556.m46365();
                    iM11306 = C19806.m45029("۫ۚ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 27587) ^ 1708153498;
                    i5 = 1945699451;
                    break;
                case -1954380857:
                case 264540293:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17849) ^ 1823820795;
                        i5 = -1071505267;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩴۡ")) * 31;
                        i4 = ((iM11306 ^ i2) * 6139) ^ (-1332436975);
                        i5 = -569332996;
                    }
                    break;
                case -1760639731:
                case 1861477341:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17849) ^ 1823820795;
                        i5 = -1071505267;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19085) ^ 1190536713;
                        i5 = 1622362779;
                    }
                    break;
                case -1678167013:
                case -1533497871:
                    super.onDestroy();
                    c20556 = this.f68825;
                    if (c20556 != null) {
                        iM11306 = C19806.m45029("ܰۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8907)) ^ 1012593603;
                        i5 = 2096958020;
                    } else {
                        iM11306 = C19806.m45029("۫ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27587) ^ 1708153498;
                        i5 = 1945699451;
                    }
                    break;
                case -1656744265:
                case -363840222:
                    RunnableC1564.m5345();
                    break;
                case -1586097934:
                case 2037231617:
                    c6111.m16940();
                    iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i2) * 45;
                    i4 = ((iM11306 ^ i3) * 5157) ^ (-24810016);
                    i5 = 268425076;
                    break;
                case -1584165503:
                case -580173792:
                    C1398.m4895();
                    C0671.m3008();
                    iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                    i5 = 23196365;
                    break;
                case -1533176388:
                case 445779332:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                        i5 = 23196365;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۬ۗ")) * 43;
                        i4 = ((iM11306 ^ i3) * 25303) ^ (-1103891943);
                        i5 = 114987970;
                    }
                    break;
                case -1499918445:
                case -1074667928:
                    C1977.m6356();
                    if (!C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17849) ^ 1823820795;
                        i5 = -1071505267;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                        i5 = 23196365;
                    }
                    break;
                case -913719650:
                case -855825057:
                    break;
                case -882323986:
                case 1270793143:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15469) ^ 633129499;
                        i5 = 1423469746;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳۧ")) * 59;
                        i4 = ((iM11306 ^ i3) * (-9157)) ^ (-295971922);
                        i5 = -245275553;
                    }
                    break;
                case -609191396:
                case -200869486:
                    c6111 = this.f68829;
                    if (c6111 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16215)) ^ 991311352;
                        i5 = -1839228679;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * 5157) ^ (-24810016);
                        i5 = 268425076;
                    }
                    break;
                case -554577776:
                case 1721840763:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۢۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11343)) ^ 660278521;
                        i5 = 671802713;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17849) ^ 1823820795;
                        i5 = -1071505267;
                    }
                    break;
                case -507165707:
                case 1129036515:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                        i5 = 23196365;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27549) ^ 1532330791;
                        i5 = 542709651;
                    }
                    break;
                case -263682658:
                case 1711949366:
                    if (C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("ۙ᩶")) * 127;
                        i4 = ((iM11306 ^ i2) * (-22597)) ^ 730845388;
                        i5 = -518200721;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۡܰ")) * 95;
                        i4 = ((iM11306 ^ i3) * 18943) ^ (-721429204);
                        i5 = 1568014572;
                    }
                    break;
                case 325822146:
                case 1630986640:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                        i5 = 23196365;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ᩳܳ")) * (-5);
                        i4 = ((iM11306 ^ i3) * 14621) ^ 348409419;
                        i5 = 692225455;
                    }
                    break;
                case 722729942:
                case 1784672669:
                    if (C1066.f4915 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6475) ^ (-1518010249);
                        i5 = 1651464783;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27583)) ^ (-1730785519);
                        i5 = 23196365;
                    }
                    break;
                case 821103210:
                case 1308537215:
                    if (C1668.m5583()) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹᩻")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-11571)) ^ 1727438313;
                        i5 = 256635447;
                    } else {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15469) ^ 633129499;
                        i5 = 1423469746;
                    }
                    break;
                case 1840626726:
                case 1906653305:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6475) ^ (-1518010249);
                        i5 = 1651464783;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9123) ^ 1272225958;
                        i5 = -1468392424;
                    }
                    break;
                default:
                    C3722.m10894();
                    if (!C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17849) ^ 1823820795;
                        i5 = -1071505267;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۡܰ")) * 95;
                        i4 = ((iM11306 ^ i3) * 18943) ^ (-721429204);
                        i5 = 1568014572;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        C20556 c20556 = null;
        int i = 1419809256;
        int i2 = C2477.f9839;
        int i3 = C2788.f10625;
        int iM45029 = (C19806.m45029("᩵ۘ") + i2) * 115;
        int i4 = ((iM45029 ^ i3) * 19501) ^ 139859353;
        int i5 = 1402461562;
        while (true) {
            i = ((((i ^ i3) * 28991) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2130957134:
                case 1308371314:
                    C3743.m10966();
                    iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                    i5 = 794105865;
                    break;
                case -1948419830:
                case 960080348:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10059)) ^ (-1124000871);
                        i5 = 1206308086;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜᩳ")) * (-97);
                        i4 = ((iM45029 ^ i3) * (-10369)) ^ 2098255730;
                        i5 = -1525955308;
                    }
                    break;
                case -1924004170:
                case -429721077:
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10059)) ^ (-1124000871);
                        i5 = 1206308086;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26547)) ^ (-943308988);
                        i5 = -2017269267;
                    }
                    break;
                case -1575959069:
                case 1378672286:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19773)) ^ (-322012561);
                        i5 = 1225285593;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                        i5 = 794105865;
                    }
                    break;
                case -1492709520:
                case 165942389:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19209)) ^ (-1172561355);
                        i5 = 1800281363;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩵")) * (-93);
                        i4 = ((iM45029 ^ i2) * (-20831)) ^ 2087510460;
                        i5 = -1694516073;
                    }
                    break;
                case -866781404:
                case 1673458483:
                    C0216.m1591();
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10059)) ^ (-1124000871);
                        i5 = 1206308086;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                        i5 = 794105865;
                    }
                    break;
                case -745524952:
                case 1339525219:
                    break;
                case -690462101:
                case 763672993:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ֨")) * 37;
                        i4 = ((iM45029 ^ i2) * (-15569)) ^ (-1951875456);
                        i5 = -1500248228;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩵") + i3) * (-69);
                        i4 = ((iM45029 ^ i2) * 12901) ^ (-363577480);
                        i5 = -223251033;
                    }
                    break;
                case -657640803:
                case 1525661390:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28729) ^ 955607367;
                        i5 = 328150581;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶᩹")) * 67;
                        i4 = ((iM45029 ^ i2) * 4589) ^ 458956466;
                        i5 = -616186036;
                    }
                    break;
                case -528107923:
                case 936852073:
                    if (C2249.f8050 < 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩵")) * (-93);
                        i4 = ((iM45029 ^ i2) * (-20831)) ^ 2087510460;
                        i5 = -1694516073;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ֨")) * 37;
                        i4 = ((iM45029 ^ i2) * (-15569)) ^ (-1951875456);
                        i5 = -1500248228;
                    }
                    break;
                case -60644360:
                case 659099599:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                        i5 = 794105865;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֨֫")) * (-65);
                        i4 = ((iM45029 ^ i3) * (-22111)) ^ (-464609879);
                        i5 = 1432572222;
                    }
                    break;
                case 73877174:
                case 1600595201:
                    C2249.m6915();
                    C2332.m7079();
                    break;
                case 461357294:
                case 1688114342:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ֨")) * 37;
                        i4 = ((iM45029 ^ i2) * (-15569)) ^ (-1951875456);
                        i5 = -1500248228;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30015)) ^ 1561711272;
                        i5 = 1488722957;
                    }
                    break;
                case 495174990:
                case 1845993847:
                    c20556.m46379();
                    iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i2;
                    i4 = ((iM45029 ^ i3) * 7715) ^ 1284627561;
                    i5 = 1072064963;
                    break;
                case 669804469:
                case 1827822412:
                    c20556 = this.f68825;
                    if (c20556 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۛ") + i3) * 77;
                        i4 = ((iM45029 ^ i2) * 22451) ^ (-1967985335);
                        i5 = 1151163248;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7715) ^ 1284627561;
                        i5 = 1072064963;
                    }
                    break;
                case 888029753:
                case 1732227217:
                    super.onResume();
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                        i5 = 794105865;
                    } else {
                        iM45029 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13099) ^ 190658696;
                        i5 = -472216125;
                    }
                    break;
                case 909410663:
                case 1995096449:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28729) ^ 955607367;
                        i5 = 328150581;
                    } else {
                        iM45029 = C19806.m45029("ܰۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2019) ^ (-182202630);
                        i5 = 1467542678;
                    }
                    break;
                default:
                    if (!C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30703) ^ (-628762123);
                        i5 = 794105865;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ֨")) * 37;
                        i4 = ((iM45029 ^ i2) * (-15569)) ^ (-1951875456);
                        i5 = -1500248228;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0263 A[PHI: r2 r8 r9 r12 r16 r18 r19
      0x0263: PHI (r2v5 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v4 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]), (r12v2 short[]) binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r16v21 int) = (r16v6 int), (r16v11 int), (r16v12 int), (r16v17 int), (r16v22 int) binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r18v20 java.lang.String) = 
      (r18v4 java.lang.String)
      (r18v9 java.lang.String)
      (r18v10 java.lang.String)
      (r18v17 java.lang.String)
      (r18v21 java.lang.String)
     binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r19v17 android.content.Intent) = 
      (r19v3 android.content.Intent)
      (r19v8 android.content.Intent)
      (r19v10 android.content.Intent)
      (r19v16 android.content.Intent)
      (r19v18 android.content.Intent)
     binds: [B:55:0x0261, B:44:0x01be, B:41:0x018c, B:18:0x00a0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x02ce A[PHI: r4 r5 r6 r7 r16 r18 r19
      0x02ce: PHI (r4v9 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r5v5 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r6v5 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r7v5 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r16v25 int) = (r16v4 int), (r16v5 int), (r16v13 int), (r16v26 int) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r18v23 java.lang.String) = (r18v2 java.lang.String), (r18v3 java.lang.String), (r18v11 java.lang.String), (r18v24 java.lang.String) binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r19v20 android.content.Intent) = 
      (r19v1 android.content.Intent)
      (r19v2 android.content.Intent)
      (r19v11 android.content.Intent)
      (r19v21 android.content.Intent)
     binds: [B:63:0x02cc, B:59:0x02a4, B:29:0x00fe, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47561(C9101 c9101, C2414 c2414, String str) {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int i5 = C1977.f7413;
        int i6 = C1148.f5161;
        int iM11307 = ThreadFactoryC3888.m11306("᩷ۙ") ^ i5;
        int i7 = ((iM11307 ^ i6) * 1157) ^ (-982530064);
        String strM5481 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM11307 ^ 211155056;
        Intent intent = null;
        String strM3859 = null;
        int i9 = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        short s3 = 0;
        int i11 = 1323079792;
        short[] sArr3 = null;
        int i12 = 0;
        while (true) {
            int i13 = i8 ^ (i7 & (((i11 ^ i6) * (-19927)) >> 31));
            switch (i13) {
                case -2119006548:
                case -1392923801:
                    C2477.m7593();
                    if (C1066.m4023() <= 0) {
                        intent = intent;
                        strM5481 = strM5481;
                        i13 = i13;
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    } else {
                        int iM450210 = C19806.m45029("ۧܺ") ^ i6;
                        i8 = iM450210 ^ 1221804190;
                        i7 = ((iM450210 ^ i5) * (-28285)) ^ 1895996960;
                        i11 = i13;
                    }
                    break;
                case -1494961988:
                case 1195306949:
                    i13 = i13;
                    strM5481 = RunnableC1606.m5481(sArr3, 15, 6, i12);
                    if (C2788.f10625 >= 0) {
                        intent = intent;
                        strM5481 = strM5481;
                        i9 = 2;
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("᩷۬")) * 29;
                        i = ((iM11306 ^ i5) * 22843) ^ 427451377;
                        i2 = -146707418;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    } else {
                        int iM450211 = C19806.m45029("ܺ᩶") ^ i6;
                        i11 = i13;
                        i8 = iM450211 ^ 986135052;
                        i7 = ((iM450211 ^ i5) * 25983) ^ (-184881607);
                        i9 = 2;
                    }
                    break;
                case -1303209031:
                case -1256525471:
                    i12 = 50210;
                    iM11306 = (ThreadFactoryC3888.m11306("᩷ۡ") + i6) * (-55);
                    i = ((iM11306 ^ i5) * 21097) ^ (-808932162);
                    i2 = 1575995188;
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case -1120794314:
                case -768945843:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    strM3859 = C1025.m3859(f68821, 1, 14, i12);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                    } else {
                        iM11306 = C19806.m45029("ܺۤ") ^ i5;
                        i = ((iM11306 ^ i6) * 26693) ^ (-942982541);
                        i2 = -1738091156;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case -899437054:
                case 1550360220:
                    strM5481 = strM5481;
                    i13 = i13;
                    C12670.m31503(ActivityC11632.class, c2414, strM3859);
                    if (C1461.f5957 <= 0) {
                        intent = intent;
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                    } else {
                        iM11306 = C19806.m45029("ۧۨ") ^ i6;
                        intent = intent;
                        i = ((iM11306 ^ i5) * 24565) ^ 1399228650;
                        i2 = 10516383;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case -821539074:
                case 1351822153:
                    C1189.m4372(intent, C0216.m1588(sArr2, 21, 5, i12), str);
                    c9101.m23450(intent);
                    break;
                case -390468156:
                case 751911941:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    sArr = f68821;
                    if (C1148.m4232() <= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("᩷۬")) * 29;
                        i = ((iM11306 ^ i5) * 22843) ^ 427451377;
                        i2 = -146707418;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۘ") ^ i5;
                        i = ((iM11306 ^ i6) * 14121) ^ 1387606970;
                        i2 = 1798652033;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case -183657203:
                case -53477187:
                    i12 = 64559;
                    iM11306 = (ThreadFactoryC3888.m11306("᩷ۡ") + i6) * (-55);
                    i = ((iM11306 ^ i5) * 21097) ^ (-808932162);
                    i2 = 1575995188;
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case -134045180:
                case 251366592:
                    C2704.m8255();
                    C3535.m10431();
                    break;
                case -95318500:
                case 1820732443:
                    RunnableC1564.m5345();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        strM5481 = strM5481;
                        i13 = i13;
                        int iM11308 = (ThreadFactoryC3888.m11306("᩺᩹") ^ i5) * (-113);
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11308 ^ (-1558280177);
                        i7 = ((iM11308 ^ i6) * 24591) ^ 1734629544;
                        intent = null;
                    } else {
                        intent = intent;
                        strM5481 = strM5481;
                        i13 = i13;
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    }
                    break;
                case 210462051:
                case 1586716342:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    if (!C3577.m10565()) {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩺᩹") ^ i5) * (-113);
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11309 ^ (-1558280177);
                        i7 = ((iM11309 ^ i6) * 24591) ^ 1734629544;
                        intent = null;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܳ") + i6) * 47;
                        i = ((iM11306 ^ i5) * 22557) ^ 1714643512;
                        i2 = -1700698931;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    }
                    break;
                case 393485895:
                case 488955368:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    int i14 = s + s3;
                    if ((i14 * i14) - i10 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۨ") + i5) * 27;
                        i = ((iM11306 ^ i6) * 13851) ^ (-1876512592);
                        i2 = 350393318;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩻") ^ i6) * 29;
                        i = ((iM11306 ^ i5) * 17043) ^ 11128014;
                        i2 = -2080407101;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case 508467281:
                case 1554925460:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    i10 = (s * s2) + 1;
                    s3 = 1;
                    if (RunnableC0195.m1431()) {
                        iM11306 = (C19806.m45029("ۨۛ") + i5) * (-39);
                        i = ((iM11306 ^ i6) * (-25987)) ^ 1035103991;
                        i2 = -1675130313;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case 535369964:
                case 959462144:
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    s = sArr[0];
                    s2 = 2;
                    if (C1148.m4232() <= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("᩷۬")) * 29;
                        i = ((iM11306 ^ i5) * 22843) ^ 427451377;
                        i2 = -146707418;
                    } else {
                        iM11306 = C19806.m45029("ۜܿ") ^ i6;
                        i = ((iM11306 ^ i5) * (-12109)) ^ (-1815222971);
                        i2 = 589152656;
                    }
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case 601580495:
                case 1165270423:
                    i13 = i13;
                    intent.putExtra(strM5481, i9);
                    sArr2 = f68821;
                    if (C0526.m2437() >= 0) {
                        intent = intent;
                        strM5481 = strM5481;
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                        i2 = -335869990;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    } else {
                        int iM113010 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i7 = ((iM113010 ^ i6) * (-14533)) ^ (-1684017895);
                        i11 = i13;
                        i8 = iM113010 ^ (-1659967437);
                    }
                    break;
                case 723063194:
                case 929087562:
                    i13 = i13;
                    C1937.m6279();
                    intent = intent;
                    strM5481 = strM5481;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                    i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                    i2 = -335869990;
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
                case 2132014745:
                case 2141779993:
                    i13 = i13;
                    Application applicationM4826 = C1377.m4826();
                    strM5481 = strM5481;
                    if (C2788.m8472() != 0) {
                        int iM113011 = (ThreadFactoryC3888.m11306("᩺᩹") ^ i5) * (-113);
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM113011 ^ (-1558280177);
                        i7 = ((iM113011 ^ i6) * 24591) ^ 1734629544;
                        intent = null;
                    } else {
                        intent = new Intent(applicationM4826, (Class<?>) ActivityC21135.class);
                        sArr3 = f68821;
                        if (RunnableC1564.m5345()) {
                            iM45029 = ThreadFactoryC3888.m11306("۠۠") ^ i5;
                            i3 = ((iM45029 ^ i6) * (-20175)) ^ 466568180;
                            i4 = 1048800671;
                        } else {
                            iM45029 = (C19806.m45029("ۗ᩻") + i5) * 109;
                            i3 = ((iM45029 ^ i6) * (-6333)) ^ 2113579796;
                            i4 = 1244475348;
                        }
                        i11 = i13;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                        strM5481 = strM5481;
                    }
                    break;
                default:
                    if (!C0526.f2219) {
                        intent = intent;
                        strM5481 = strM5481;
                        i13 = i13;
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("᩷۬")) * 29;
                        i = ((iM11306 ^ i5) * 22843) ^ 427451377;
                        i2 = -146707418;
                        i11 = i13;
                        strM5481 = strM5481;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        intent = intent;
                    }
                    intent = intent;
                    strM5481 = strM5481;
                    i13 = i13;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                    i = ((iM11306 ^ i6) * (-4971)) ^ (-624481303);
                    i2 = -335869990;
                    i11 = i13;
                    strM5481 = strM5481;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    intent = intent;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01c6 A[PHI: r3 r10 r11 r12 r16 r17
      0x01c6: PHI (r3v4 android.content.Intent) = (r3v3 android.content.Intent), (r3v2 android.content.Intent) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r16v29 int) = (r16v28 int), (r16v30 int) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r17v23 short[]) = (r17v22 short[]), (r17v24 short[]) binds: [B:42:0x01c4, B:38:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x034a A[PHI: r6 r7 r8 r16 r17
      0x034a: PHI (r6v6 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:72:0x0348, B:63:0x02da, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r7v6 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:72:0x0348, B:63:0x02da, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r8v6 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:72:0x0348, B:63:0x02da, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r16v26 int) = (r16v7 int), (r16v8 int), (r16v27 int) binds: [B:72:0x0348, B:63:0x02da, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r17v20 short[]) = (r17v5 short[]), (r17v6 short[]), (r17v21 short[]) binds: [B:72:0x0348, B:63:0x02da, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x03a7 A[PHI: r16 r17
      0x03a7: PHI (r16v17 int) = (r16v5 int), (r16v6 int), (r16v14 int), (r16v22 int) binds: [B:80:0x03a5, B:76:0x0381, B:47:0x020b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x03a7: PHI (r17v15 short[]) = (r17v3 short[]), (r17v4 short[]), (r17v12 short[]), (r17v18 short[]) binds: [B:80:0x03a5, B:76:0x0381, B:47:0x020b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (l.C3286.m9798() <= 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47562(l.AbstractActivityC12483 r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC21135.m47562(l.۫ܶۘ, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0175 A[PHI: r7 r9 r10
      0x0175: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:103:0x0175, B:39:0x0173, B:32:0x012a, B:19:0x00b4, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:103:0x0175, B:39:0x0173, B:32:0x012a, B:19:0x00b4, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:103:0x0175, B:39:0x0173, B:32:0x012a, B:19:0x00b4, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM11306;
        int i;
        int i2;
        short s;
        short[] sArr;
        MenuInflater menuInflater;
        int iM11307;
        int i3;
        short[] sArr2;
        MenuInflater menuInflater2;
        short s2;
        int iM11308;
        int i4;
        int i5;
        int iM11309;
        MenuInflater menuInflater3;
        this = this;
        Menu menu2 = menu;
        int i6 = C1148.f5161;
        int i7 = C3577.f13150;
        int iM113010 = (ThreadFactoryC3888.m11306("۫᩵") + i7) * (-69);
        int i8 = ((iM113010 ^ i6) * (-13385)) ^ (-1803428498);
        C20556 c20556 = null;
        String str = null;
        String strM6685 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = iM113010 ^ 2125729650;
        boolean z = false;
        int iM113011 = 0;
        int iM113012 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s3 = 0;
        short s4 = 0;
        int i14 = 0;
        int i15 = 1204422440;
        MenuInflater menuInflater4 = null;
        short[] sArr5 = null;
        int iM45029 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i6) * 31807) >> 31));
            switch (i15) {
                case -2052896290:
                case 1432012603:
                    C2704.m8255();
                    C0526.m2437();
                    return false;
                case -1962759207:
                case -124436960:
                    menuInflater = menuInflater4;
                    short[] sArr6 = sArr3;
                    int i16 = i14;
                    String strM3009 = C0671.m3009(sArr6, i16, 3, i11);
                    if (CallableC1627.m5507() != 0) {
                        i14 = i16;
                        s = s3;
                        str = strM3009;
                        sArr = sArr6;
                        iM11307 = (C19806.m45029("֡᩷") + i6) * (-35);
                        i8 = ((iM11307 ^ i7) * (-807)) ^ 1594101505;
                        i3 = -665414393;
                        i9 = iM11307 ^ i3;
                        menuInflater4 = menuInflater;
                        sArr3 = sArr;
                        s3 = s;
                        menu2 = menu;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i7;
                        int i17 = ((iM113013 ^ i6) * (-6725)) ^ 566574558;
                        i9 = iM113013 ^ (-1217961603);
                        sArr3 = sArr6;
                        menuInflater4 = menuInflater;
                        i8 = i17;
                        this = this;
                        i14 = i16;
                        str = strM3009;
                    }
                    break;
                case -1776781127:
                case 1178345178:
                    C0050.m946();
                    if (C1189.f5284 <= 0) {
                        s = s3;
                        sArr = sArr3;
                        menuInflater = menuInflater4;
                        iM11307 = (C19806.m45029("֡᩷") + i6) * (-35);
                        i8 = ((iM11307 ^ i7) * (-807)) ^ 1594101505;
                        i3 = -665414393;
                        i9 = iM11307 ^ i3;
                        menuInflater4 = menuInflater;
                        sArr3 = sArr;
                        s3 = s;
                        menu2 = menu;
                    } else {
                        s2 = s3;
                        sArr2 = sArr3;
                        menuInflater2 = menuInflater4;
                        iM11308 = C19806.m45029("ۧ᩷") ^ i7;
                        i8 = ((iM11308 ^ i6) * (-21329)) ^ 265386640;
                        i4 = -1618263005;
                        i9 = iM11308 ^ i4;
                        menu2 = menu;
                        menuInflater4 = menuInflater2;
                        sArr3 = sArr2;
                        s3 = s2;
                        this = this;
                    }
                    break;
                case -1482889150:
                case 977932275:
                    menuInflater4 = getMenuInflater();
                    sArr3 = f68821;
                    i14 = 357;
                    if (C1668.f6641 >= 0) {
                        iM11309 = (i7 - ThreadFactoryC3888.m11306("᩵֨")) * (-127);
                        i8 = ((iM11309 ^ i6) * (-7223)) ^ 1938081161;
                        i5 = 2112434783;
                    } else {
                        iM11309 = C19806.m45029("ܺ֨") ^ i7;
                        i8 = ((iM11309 ^ i6) * (-28639)) ^ 1952794787;
                        i5 = 1649973725;
                    }
                    i9 = iM11309 ^ i5;
                    this = this;
                    break;
                case -1391323162:
                case 295730630:
                    iM113012 = ThreadFactoryC3888.m11306(strM6685);
                    i10 = 2104027858;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡܿ")) * 79;
                        i = ((iM11306 ^ i7) * 12359) ^ 711477129;
                        i2 = -306796871;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۢ᩷")) * 127;
                        i = ((iM11306 ^ i7) * (-2247)) ^ (-1791507500);
                        i2 = 1183627728;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1379591366:
                case 1618964789:
                    sArr2 = sArr3;
                    menuInflater2 = menuInflater4;
                    s2 = sArr5[c];
                    s4 = 54352;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11308 = C19806.m45029("ۧ᩷") ^ i7;
                        i8 = ((iM11308 ^ i6) * (-21329)) ^ 265386640;
                        i4 = -1618263005;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("۫۬") + i6) * 11;
                        i8 = ((iM11308 ^ i7) * (-20803)) ^ 51495306;
                        i4 = 2046956079;
                    }
                    i9 = iM11308 ^ i4;
                    menu2 = menu;
                    menuInflater4 = menuInflater2;
                    sArr3 = sArr2;
                    s3 = s2;
                    this = this;
                    break;
                case -1331574203:
                case 1376271054:
                    if (!C0797.f3386) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡܿ")) * 79;
                        i = ((iM11306 ^ i7) * 12359) ^ 711477129;
                        i2 = -306796871;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        s2 = s3;
                        sArr2 = sArr3;
                        menuInflater2 = menuInflater4;
                        iM11308 = C19806.m45029("ۧ᩷") ^ i7;
                        i8 = ((iM11308 ^ i6) * (-21329)) ^ 265386640;
                        i4 = -1618263005;
                        i9 = iM11308 ^ i4;
                        menu2 = menu;
                        menuInflater4 = menuInflater2;
                        sArr3 = sArr2;
                        s3 = s2;
                        this = this;
                    }
                    break;
                case -1320595509:
                case 953696253:
                    s = s3;
                    sArr = sArr3;
                    menuInflater = menuInflater4;
                    sArr5 = f68821;
                    c = 356;
                    if (C0962.f3784) {
                        iM11307 = (C19806.m45029("֡᩷") + i6) * (-35);
                        i8 = ((iM11307 ^ i7) * (-807)) ^ 1594101505;
                        i3 = -665414393;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۚ") ^ i7;
                        i8 = ((iM11307 ^ i6) * 6353) ^ (-211813983);
                        i3 = 923304595;
                    }
                    i9 = iM11307 ^ i3;
                    menuInflater4 = menuInflater;
                    sArr3 = sArr;
                    s3 = s;
                    menu2 = menu;
                    break;
                case -1197478198:
                case 647980221:
                    iM45029 = C19806.m45029(C3722.m10901(f68821, 366, 3, i11));
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܰ") ^ i7) * (-19);
                        i = ((iM11306 ^ i6) * (-16371)) ^ 1233009978;
                        i2 = -1662907339;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        iM11309 = (i7 - ThreadFactoryC3888.m11306("᩵֨")) * (-127);
                        i8 = ((iM11309 ^ i6) * (-7223)) ^ 1938081161;
                        i5 = 2112434783;
                        i9 = iM11309 ^ i5;
                        this = this;
                    }
                    break;
                case -1037972282:
                case 1365844248:
                    iM113011 = ThreadFactoryC3888.m11306(C2704.m8240(sArr4, i12, i13, i11));
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡܿ")) * 79;
                        i = ((iM11306 ^ i7) * 12359) ^ 711477129;
                        i2 = -306796871;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ۬") ^ i7) * 9;
                        i = ((iM11306 ^ i6) * (-10633)) ^ 804033597;
                        i2 = 254988106;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 88536576:
                case 831396460:
                    C0278.m1789();
                    iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡܿ")) * 79;
                    i = ((iM11306 ^ i7) * 12359) ^ 711477129;
                    i2 = -306796871;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 113024567:
                case 247863522:
                    menuInflater = menuInflater4;
                    int i18 = s3 * s4;
                    s = s3;
                    sArr = sArr3;
                    int i19 = s + 13588;
                    if (i18 - (i19 * i19) > 0) {
                        iM11307 = (C19806.m45029("ۨܽ") ^ i6) * 37;
                        i8 = ((iM11307 ^ i7) * (-3933)) ^ (-1855348153);
                        i3 = 847961730;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ۠") ^ i7) * (-85);
                        i8 = ((iM11307 ^ i6) * 4313) ^ (-1919717736);
                        i3 = -687355383;
                    }
                    i9 = iM11307 ^ i3;
                    menuInflater4 = menuInflater;
                    sArr3 = sArr;
                    s3 = s;
                    menu2 = menu;
                    break;
                case 165435126:
                case 2121331600:
                    c20556.m46367(C3660.m10785(menu2, 2121387225 ^ iM113011));
                    return true;
                case 290730301:
                case 344970926:
                    c20556 = this.f68825;
                    sArr4 = f68821;
                    i12 = 360;
                    i13 = 3;
                    if (C0050.m946() > 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i6) * 31;
                        i = ((iM11306 ^ i7) * 8581) ^ 1460248386;
                        i2 = -1259040135;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        s = s3;
                        sArr = sArr3;
                        menuInflater = menuInflater4;
                        iM11307 = (C19806.m45029("֡᩷") + i6) * (-35);
                        i8 = ((iM11307 ^ i7) * (-807)) ^ 1594101505;
                        i3 = -665414393;
                        i9 = iM11307 ^ i3;
                        menuInflater4 = menuInflater;
                        sArr3 = sArr;
                        s3 = s;
                        menu2 = menu;
                    }
                    break;
                case 509581006:
                case 1893250968:
                    C0817.m3411(C3660.m10785(menu2, 2102358515 ^ iM45029), z);
                    menuInflater3 = menuInflater4;
                    int iM113014 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                    i8 = ((iM113014 ^ i7) * 15035) ^ 1709349460;
                    i9 = iM113014 ^ 1860674827;
                    this = this;
                    menuInflater4 = menuInflater3;
                    break;
                case 520627006:
                case 1760394751:
                    z = false;
                    C2124.m6680(C2249.m6916(menu2, iM113012 ^ i10), false);
                    if (C2477.f9839 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܰ") ^ i7;
                        i = ((iM11306 ^ i6) * 31579) ^ 705289775;
                        i2 = -1135534638;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        iM11309 = (i7 - ThreadFactoryC3888.m11306("᩵֨")) * (-127);
                        i8 = ((iM11309 ^ i6) * (-7223)) ^ 1938081161;
                        i5 = 2112434783;
                        i9 = iM11309 ^ i5;
                        this = this;
                    }
                    break;
                case 766056674:
                case 1677516436:
                    menuInflater3 = menuInflater4;
                    menuInflater3.inflate(C19806.m45029(str) ^ 2120074323, menu2);
                    if (!this.f68822) {
                        int iM113015 = ThreadFactoryC3888.m11306("ܶۜ") ^ i6;
                        i9 = iM113015 ^ (-462717401);
                        i8 = ((iM113015 ^ i7) * 14537) ^ (-2114832231);
                        menuInflater4 = menuInflater3;
                        this = this;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                        i8 = ((iM113016 ^ i7) * 15035) ^ 1709349460;
                        i9 = iM113016 ^ 1860674827;
                        this = this;
                        menuInflater4 = menuInflater3;
                    }
                    break;
                case 864460169:
                case 1210907359:
                    C0526.m2437();
                    if (C0671.m3008() >= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡܿ")) * 79;
                        i = ((iM11306 ^ i7) * 12359) ^ 711477129;
                        i2 = -306796871;
                    } else {
                        iM11306 = (C19806.m45029("ܶۘ") + i6) * (-21);
                        i = ((iM11306 ^ i7) * 31001) ^ 1486110131;
                        i2 = 271457978;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 873697316:
                case 1182484280:
                    i11 = 52218;
                    int iM113017 = (ThreadFactoryC3888.m11306("۫ܺ") + i6) * (-123);
                    i9 = iM113017 ^ (-1641197283);
                    sArr3 = sArr3;
                    menuInflater4 = menuInflater4;
                    i8 = ((iM113017 ^ i7) * (-5113)) ^ (-239148390);
                    menu2 = menu;
                    break;
                case 1321186074:
                case 1928154966:
                    i11 = 24895;
                    int iM113018 = (ThreadFactoryC3888.m11306("۫ܺ") + i6) * (-123);
                    i9 = iM113018 ^ (-1641197283);
                    sArr3 = sArr3;
                    menuInflater4 = menuInflater4;
                    i8 = ((iM113018 ^ i7) * (-5113)) ^ (-239148390);
                    menu2 = menu;
                    break;
                default:
                    strM6685 = C2124.m6685(f68821, 363, 3, i11);
                    if (!C3743.f13569) {
                        s2 = s3;
                        sArr2 = sArr3;
                        menuInflater2 = menuInflater4;
                        iM11308 = C19806.m45029("ۧ᩷") ^ i7;
                        i8 = ((iM11308 ^ i6) * (-21329)) ^ 265386640;
                        i4 = -1618263005;
                        i9 = iM11308 ^ i4;
                        menu2 = menu;
                        menuInflater4 = menuInflater2;
                        sArr3 = sArr2;
                        s3 = s2;
                        this = this;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i7;
                        i = ((iM11306 ^ i6) * 19293) ^ (-1260942841);
                        i2 = -1955723918;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ca, code lost:
    
        if (l.C2642.f10294 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        if (l.C1460.f5948 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0104, code lost:
    
        r26 = r12;
        r27 = r14;
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (l.C1066.m4023() > 0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r38) {
        /*
            Method dump skipped, instruction units count: 2336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC21135.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[PHI: r2
      0x00e1: PHI (r2v4 android.content.Intent) = (r2v3 android.content.Intent), (r2v2 android.content.Intent), (r2v2 android.content.Intent) binds: [B:31:0x00df, B:22:0x008b, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c5 A[PHI: r7 r8
      0x01c5: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:52:0x01c3, B:17:0x006c, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:52:0x01c3, B:17:0x006c, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021a A[PHI: r5 r12 r13
      0x021a: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:60:0x0218, B:26:0x00aa, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:60:0x0218, B:26:0x00aa, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:60:0x0218, B:26:0x00aa, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r4 r11
      0x0249: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:64:0x0247, B:15:0x0068, B:12:0x0060, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:64:0x0247, B:15:0x0068, B:12:0x0060, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x027f A[PHI: r6 r9 r18
      0x027f: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:68:0x027d, B:56:0x01f8, B:48:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:68:0x027d, B:56:0x01f8, B:48:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:68:0x027d, B:56:0x01f8, B:48:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final void finish() {
        int iM11306;
        int i;
        int i2;
        int i3 = C3535.f13026;
        int i4 = C1419.f5860;
        int iM45029 = (C19806.m45029("ۧ۟") ^ i3) * 89;
        int i5 = ((iM45029 ^ i4) * (-6045)) ^ 2083507857;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1794232568);
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 783923637;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 27473) >> 31));
            switch (i13) {
                case -2037056477:
                case 534946282:
                    i10 = 60998;
                    iM11306 = (C19806.m45029("᩶֡") + i3) * 75;
                    i = ((iM11306 ^ i4) * 14221) ^ 335145506;
                    i2 = -1668259504;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1959529026:
                case 974293272:
                    if (this.f68826) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۠ۙ")) * (-27);
                        i = ((iM11306 ^ i3) * 7057) ^ 483227616;
                        i2 = -621529739;
                    } else {
                        iM11306 = (C19806.m45029("᩺ܰ") + i4) * (-9);
                        i = ((iM11306 ^ i3) * 4761) ^ 311577974;
                        i2 = -1829672335;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1908466784:
                case 1377438780:
                    C2788.m8472();
                    if (C0278.f1572 > 0) {
                        iM11306 = (i4 - C19806.m45029("۬ۢ")) * (-97);
                        i = ((iM11306 ^ i3) * (-20217)) ^ 365112690;
                        i2 = 350841669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 10625) ^ (-1564209773);
                        i2 = -1301830088;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1879423079:
                case -887751108:
                    C0526.m2437();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 10625) ^ (-1564209773);
                        i2 = -1301830088;
                    } else {
                        iM11306 = (C19806.m45029("᩻ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 27049) ^ 522163180;
                        i2 = -1518431190;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1645227030:
                case -1564342768:
                    intent = new Intent();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("᩻ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 27049) ^ 522163180;
                        i2 = -1518431190;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩹") + i3) * (-43);
                        i = ((iM11306 ^ i4) * 8361) ^ (-1515550683);
                        i2 = 49461741;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1528479533:
                case 46887518:
                    c = 'o';
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i4 - C19806.m45029("۬ۢ")) * (-97);
                        i = ((iM11306 ^ i3) * (-20217)) ^ 365112690;
                        i2 = 350841669;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܰ۟")) * (-47);
                        i = ((iM11306 ^ i3) * 17771) ^ 1892209577;
                        i2 = 364340142;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1512447618:
                case 1220110830:
                    setResult(1, intent);
                    iM11306 = (C19806.m45029("᩺ܰ") + i4) * (-9);
                    i = ((iM11306 ^ i3) * 4761) ^ 311577974;
                    i2 = -1829672335;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1339587937:
                case 1857516620:
                    intent.putExtra(ThreadFactoryC3888.m11312(sArr2, i11, i12, i10), m47571());
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("᩻ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 27049) ^ 522163180;
                        i2 = -1518431190;
                    } else {
                        iM11306 = C19806.m45029("֫ۚ") ^ i4;
                        i = ((iM11306 ^ i3) * 9413) ^ (-1689066622);
                        i2 = -1659251173;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1079287554:
                case -980646069:
                    C1419.m4973();
                    break;
                case -1071642073:
                case -555947927:
                    sArr = f68821;
                    if (C3577.m10565()) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i3;
                        i = ((iM11306 ^ i4) * (-16599)) ^ 257190990;
                        i2 = -83517022;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۤܶ")) * (-37);
                        i = ((iM11306 ^ i3) * (-20159)) ^ (-1982881342);
                        i2 = -722766460;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -806098923:
                case -40405602:
                    i9 = s * s2;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۤܶ")) * (-37);
                        i = ((iM11306 ^ i3) * (-20159)) ^ (-1982881342);
                        i2 = -722766460;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩶") + i3) * (-47);
                        i = ((iM11306 ^ i4) * 21841) ^ (-1759846873);
                        i2 = 76320002;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -763425259:
                case -731083216:
                    s = sArr[c];
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 10625) ^ (-1564209773);
                        i2 = -1301830088;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * 19945) ^ (-41370293);
                        i2 = 673474656;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -554321440:
                case -273423007:
                    super.finish();
                    break;
                case -465914357:
                case 2080889712:
                    i10 = 47396;
                    iM11306 = (C19806.m45029("᩶֡") + i3) * 75;
                    i = ((iM11306 ^ i4) * 14221) ^ 335145506;
                    i2 = -1668259504;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -309889549:
                case 1123546193:
                    if (C3535.m10431() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۨۛ")) * (-47);
                        i = ((iM11306 ^ i4) * (-4897)) ^ 678411295;
                        i2 = -1603206745;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۬ۢ")) * (-97);
                        i = ((iM11306 ^ i3) * (-20217)) ^ 365112690;
                        i2 = 350841669;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -43867909:
                case 616790569:
                    i8 = i7 * i7;
                    s2 = 2;
                    if (C1937.m6279() >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۨۛ")) * (-47);
                        i = ((iM11306 ^ i4) * (-4897)) ^ 678411295;
                        i2 = -1603206745;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i4;
                        i = ((iM11306 ^ i3) * 27465) ^ 1184963747;
                        i2 = 441506786;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -41472130:
                case 593875676:
                    i7 = s + 1;
                    if (RunnableC1564.m5345()) {
                        iM11306 = (i4 - C19806.m45029("ۤܶ")) * (-37);
                        i = ((iM11306 ^ i3) * (-20159)) ^ (-1982881342);
                        i2 = -722766460;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֫᩻")) * 73;
                        i = ((iM11306 ^ i4) * (-30229)) ^ (-1227797363);
                        i2 = -1412047396;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 317415437:
                case 1791045560:
                    i11 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i12 = 4;
                    if (RunnableC1564.m5345()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 10625) ^ (-1564209773);
                        i2 = -1301830088;
                    } else {
                        iM11306 = C19806.m45029("᩸ᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20275)) ^ 2147147606;
                        i2 = -1156303926;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 442054969:
                case 1756914686:
                    C0278.m1789();
                    C2704.m8255();
                    iM11306 = (i3 - C19806.m45029("ۨۛ")) * (-47);
                    i = ((iM11306 ^ i4) * (-4897)) ^ 678411295;
                    i2 = -1603206745;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1586739151:
                case 1629777411:
                    if (i8 - (i9 + 1) < 0) {
                        iM11306 = C19806.m45029("ܺ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * 15193) ^ (-1736447453);
                        i2 = -1448662921;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * (-115);
                        i = ((iM11306 ^ i4) * 7367) ^ (-763329545);
                        i2 = -245953214;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr2 = f68821;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i4 - C19806.m45029("۬ۢ")) * (-97);
                        i = ((iM11306 ^ i3) * (-20217)) ^ 365112690;
                        i2 = 350841669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ֡") ^ i3;
                        i = ((iM11306 ^ i4) * 27475) ^ (-1895796566);
                        i2 = 1292601074;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x04b4 A[PHI: r3 r20 r21 r30
      0x04b4: PHI (r3v36 java.lang.String) = (r3v2 java.lang.String), (r3v38 java.lang.String) binds: [B:107:0x049e, B:97:0x0402] A[DONT_GENERATE, DONT_INLINE]
      0x04b4: PHI (r20v53 l.ܿ۬ۨ) = (r20v3 l.ܿ۬ۨ), (r20v54 l.ܿ۬ۨ) binds: [B:107:0x049e, B:97:0x0402] A[DONT_GENERATE, DONT_INLINE]
      0x04b4: PHI (r21v53 l.ܿ۬ۨ) = (r21v3 l.ܿ۬ۨ), (r21v54 l.ܿ۬ۨ) binds: [B:107:0x049e, B:97:0x0402] A[DONT_GENERATE, DONT_INLINE]
      0x04b4: PHI (r30v69 l.ۖ۠᩺) = (r30v6 l.ۖ۠᩺), (r30v70 l.ۖ۠᩺) binds: [B:107:0x049e, B:97:0x0402] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0156  */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C17367 c17367;
        int iM45029;
        int i;
        int i2;
        C20556 c20556;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int iM11307;
        int i6;
        int i7;
        C2414 c2414;
        boolean z;
        short[] sArr;
        C20556 c20557;
        int i8;
        int iM11308;
        int i9;
        int iM11309;
        int i10;
        int i11;
        int iM113010;
        int i12;
        int i13;
        int iM113011;
        int i14;
        int i15;
        bundle = bundle;
        int i16 = 1148344114;
        int i17 = C2871.f10837;
        int i18 = C0629.f2722;
        int iM450211 = (C19806.m45029("۫ۢ") ^ i17) * (-109);
        int i19 = ((iM450211 ^ i18) * (-20585)) ^ (-242596599);
        int i20 = iM450211 ^ 1728997070;
        C6111 c6111 = null;
        Intent intentM6287 = null;
        C20556 c20558 = null;
        InterfaceC6025 interfaceC6025 = null;
        String str = null;
        short[] sArr2 = null;
        int i21 = 0;
        boolean z2 = false;
        int iM450212 = 0;
        int i22 = 0;
        int i23 = 0;
        C20556 c20559 = null;
        String strM2421 = null;
        Intent intentM18982 = null;
        C2414 c2415 = null;
        short[] sArr3 = null;
        boolean z3 = false;
        String str2 = null;
        C17367 c17368 = null;
        C17367 c17369 = null;
        byte[] bArr = null;
        byte[] bArrM22381 = null;
        TextView textViewM49629 = null;
        String strM10571 = null;
        int intExtra = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * 26651) >> 31));
            switch (i16) {
                case -2137115867:
                case 1344464334:
                    c2415 = c2415;
                    C17367 c173610 = c17368;
                    c17369 = c17369;
                    c17367 = c173610;
                    intExtra = intentM6287.getIntExtra(C1668.m5577(f68821, 238, 6, i21), -1);
                    if (intExtra != 0) {
                        iM45029 = C19806.m45029("ᩴ֡") ^ i17;
                        i = ((iM45029 ^ i18) * 26381) ^ 1923408001;
                        i2 = 2032673214;
                    } else {
                        iM45029 = C19806.m45029("۟ۚ") ^ i17;
                        i = ((iM45029 ^ i18) * (-14833)) ^ (-1520492441);
                        i2 = -1394223425;
                    }
                    C2414 c2416 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c2416;
                    C17367 c173611 = c17369;
                    c17368 = c17367;
                    c17369 = c173611;
                    break;
                case -2112933900:
                case 694050930:
                    super.finish();
                    break;
                case -1978073145:
                case 1256350453:
                    ThreadFactoryC3888.m11300();
                    if (C3577.f13150 < 0) {
                        str = str;
                        c2415 = c2415;
                        z2 = z2;
                        iM450212 = iM450212;
                        z3 = z3;
                        c20558 = c20558;
                        strM10571 = strM10571;
                        textViewM49629 = textViewM49629;
                        C17367 c173612 = c17368;
                        c17369 = c17369;
                        c17367 = c173612;
                        iM450210 = (i17 - ThreadFactoryC3888.m11306("ۧ۫")) * 69;
                        i3 = ((iM450210 ^ i18) * 7975) ^ 1681629040;
                        i4 = 1437780108;
                        i7 = iM450210 ^ i4;
                        iM450212 = iM450212;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        z2 = z2;
                        i20 = i7;
                        i19 = i3;
                        c20558 = c20558;
                        str = str;
                        z3 = z3;
                        C17367 c173613 = c17369;
                        c17368 = c17367;
                        c17369 = c173613;
                    } else {
                        iM113011 = (ThreadFactoryC3888.m11306("᩻ۜ") + i18) * (-93);
                        i14 = ((iM113011 ^ i17) * (-28111)) ^ (-2011001015);
                        i15 = 786283892;
                        i20 = iM113011 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -1952936382:
                case 762192106:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0216.f1393 == 0) {
                        iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                        i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                        i15 = -1212167173;
                    } else {
                        iM113011 = C19806.m45029("ۚۗ") ^ i18;
                        i14 = ((iM113011 ^ i17) * (-29185)) ^ (-1085737264);
                        i15 = 988653805;
                    }
                    i20 = iM113011 ^ i15;
                    i19 = i14;
                    break;
                case -1877350260:
                case 956606609:
                    c17367 = c17368;
                    i21 = 39113;
                    iM450210 = C19806.m45029("ۘۡ") ^ i17;
                    i3 = ((iM450210 ^ i18) * 24009) ^ 852028684;
                    i4 = 154029083;
                    i7 = iM450210 ^ i4;
                    iM450212 = iM450212;
                    textViewM49629 = textViewM49629;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    z2 = z2;
                    i20 = i7;
                    i19 = i3;
                    c20558 = c20558;
                    str = str;
                    z3 = z3;
                    C17367 c173614 = c17369;
                    c17368 = c17367;
                    c17369 = c173614;
                    break;
                case -1869980830:
                case -1529823002:
                    C1875.m6086();
                    C1937.m6279();
                    break;
                case -1747049388:
                case 585419893:
                    if (C19806.f63586) {
                        iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                        i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                        i15 = -1212167173;
                    } else {
                        iM113011 = (ThreadFactoryC3888.m11306("᩻ۜ") + i18) * (-93);
                        i14 = ((iM113011 ^ i17) * (-28111)) ^ (-2011001015);
                        i15 = 786283892;
                    }
                    i20 = iM113011 ^ i15;
                    i19 = i14;
                    break;
                case -1728921477:
                case -395639003:
                    str = str;
                    c2415 = c2415;
                    z2 = z2;
                    z3 = z3;
                    c20558 = c20558;
                    strM10571 = strM10571;
                    C17367 c173615 = c17368;
                    c17369 = c17369;
                    c17367 = c173615;
                    textViewM49629 = textViewM49629;
                    textViewM49629.setTextSize(18.0f);
                    C6111 c6112 = (C6111) C2332.m7083(this, C19806.m45029(C1668.m5577(f68821, 123, 3, i21)) ^ 2127070016);
                    this.f68829 = c6112;
                    if (C3743.m10966() > 0) {
                        int iM113012 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i17;
                        i3 = ((iM113012 ^ i18) * (-10159)) ^ 755792861;
                        i7 = iM113012 ^ (-839321005);
                        c6111 = c6112;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        z2 = z2;
                        i20 = i7;
                        i19 = i3;
                        c20558 = c20558;
                        str = str;
                        z3 = z3;
                        C17367 c173616 = c17369;
                        c17368 = c17367;
                        c17369 = c173616;
                    } else {
                        c6111 = c6112;
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i17;
                        i19 = ((iM11306 ^ i18) * (-31875)) ^ (-1654765432);
                        i5 = 963135014;
                        i13 = iM11306 ^ i5;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                        z3 = z3;
                        C17367 c173617 = c17369;
                        c17368 = c17367;
                        c17369 = c173617;
                    }
                    break;
                case -1468458737:
                case 1524497141:
                    str = str;
                    c2415 = c2415;
                    z2 = z2;
                    iM450212 = iM450212;
                    z3 = z3;
                    c20558 = c20558;
                    strM10571 = strM10571;
                    textViewM49629 = textViewM49629;
                    C17367 c173618 = c17368;
                    c17369 = c17369;
                    c17367 = c173618;
                    short s = f68821[116];
                    int i24 = 61080 * s;
                    int i25 = s + 15270;
                    if ((i25 * i25) - i24 < 0) {
                        iM450210 = C19806.m45029("ܺۡ") ^ i18;
                        i3 = ((iM450210 ^ i17) * (-13761)) ^ (-1653580532);
                        i4 = -2089361745;
                    } else {
                        iM450210 = (i17 - C19806.m45029("᩺ܿ")) * (-15);
                        i3 = ((iM450210 ^ i18) * 30177) ^ (-1897546666);
                        i4 = -1489523988;
                    }
                    i7 = iM450210 ^ i4;
                    iM450212 = iM450212;
                    textViewM49629 = textViewM49629;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    z2 = z2;
                    i20 = i7;
                    i19 = i3;
                    c20558 = c20558;
                    str = str;
                    z3 = z3;
                    C17367 c173619 = c17369;
                    c17368 = c17367;
                    c17369 = c173619;
                    break;
                case -1369866698:
                case 277970885:
                    super.finish();
                    break;
                case -1143044706:
                case 989927835:
                    str = str;
                    c2415 = c2415;
                    z2 = z2;
                    z3 = z3;
                    c20558 = c20558;
                    strM10571 = strM10571;
                    textViewM49629 = textViewM49629;
                    C17367 c173620 = c17368;
                    c17369 = c17369;
                    c17367 = c173620;
                    super.onCreate(bundle);
                    m31023();
                    C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    AbstractC19432 c19725 = new C19725(this);
                    RunnableC3388.m10051(onBackPressedDispatcher);
                    onBackPressedDispatcher.m34905(c19725);
                    iM450212 = C19806.m45029(C3660.m10790(f68821, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i21)) ^ 2126478930;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i18 - C19806.m45029("ܳۗ")) * (-109);
                        i19 = ((iM11306 ^ i17) * 15409) ^ 342435902;
                        i5 = 870249351;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۧ") ^ i18) * 57;
                        i19 = ((iM11306 ^ i17) * 21003) ^ 1956115755;
                        i5 = -294257073;
                    }
                    i13 = iM11306 ^ i5;
                    textViewM49629 = textViewM49629;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    str = str;
                    z2 = z2;
                    i20 = i13;
                    c20558 = c20558;
                    z3 = z3;
                    C17367 c1736110 = c17369;
                    c17368 = c17367;
                    c17369 = c1736110;
                    break;
                case -1112104751:
                case -759997124:
                    str = str;
                    c2415 = c2415;
                    z2 = z2;
                    iM450212 = iM450212;
                    z3 = z3;
                    c20558 = c20558;
                    strM10571 = strM10571;
                    textViewM49629 = textViewM49629;
                    C17367 c173621 = c17368;
                    c17369 = c17369;
                    c17367 = c173621;
                    RunnableC0195.m1436(this, iM450212);
                    C6938 c6938 = (C6938) C2332.m7083(this, C19806.m45029(C1398.m4892(f68821, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i21)) ^ 2100361354);
                    this.f41645 = c6938;
                    C0278.m1782(this, c6938);
                    if (C3535.f13026 <= 0) {
                        iM450210 = (i17 - ThreadFactoryC3888.m11306("ۧ۫")) * 69;
                        i3 = ((iM450210 ^ i18) * 7975) ^ 1681629040;
                        i4 = 1437780108;
                    } else {
                        iM450210 = (C19806.m45029("᩵ܶ") + i17) * 51;
                        i3 = ((iM450210 ^ i18) * (-9179)) ^ 435673668;
                        i4 = 1494843818;
                    }
                    i7 = iM450210 ^ i4;
                    iM450212 = iM450212;
                    textViewM49629 = textViewM49629;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    z2 = z2;
                    i20 = i7;
                    i19 = i3;
                    c20558 = c20558;
                    str = str;
                    z3 = z3;
                    C17367 c1736111 = c17369;
                    c17368 = c17367;
                    c17369 = c1736111;
                    break;
                case -1042020450:
                case -188732195:
                    c2415 = c2415;
                    C17367 c173622 = c17368;
                    c17369 = c17369;
                    c17367 = c173622;
                    this.f68828 = RunnableC0195.m1433(interfaceC6025, C1875.m6105(sArr3, 214, 24, i21), null);
                    C6111 c6113 = this.f68829;
                    if (C1025.f4800 < 0) {
                        c6113.m16868(new C9142(strM2421));
                        this.f68827 = ViewOnClickListenerC8374.m21926(this, new InterfaceC1692() { // from class: l.ᩴ᩸ۖ
                            @Override // l.InterfaceC1692
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // l.InterfaceC1692
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo3908(String str3) {
                                int i26 = ActivityC21135.f68820;
                                new C7730(this.f61536, str3).m10243();
                            }
                        });
                        this.f68829.m17065(z2);
                        if (bundle != null) {
                            iM45029 = C19806.m45029("᩵ۗ") ^ i18;
                            i = ((iM45029 ^ i17) * (-10243)) ^ (-963014301);
                            i2 = 1017845200;
                        } else {
                            iM45029 = C19806.m45029("֨ܰ") ^ i18;
                            i = ((iM45029 ^ i17) * (-13915)) ^ 957098283;
                            i2 = -1812900503;
                        }
                        C2414 c2417 = c2415;
                        i20 = iM45029 ^ i2;
                        i19 = i;
                        c2415 = c2417;
                        C17367 c1736112 = c17369;
                        c17368 = c17367;
                        c17369 = c1736112;
                    } else {
                        str = str;
                        z2 = z2;
                        z3 = z3;
                        c20558 = c20558;
                        strM10571 = strM10571;
                        textViewM49629 = textViewM49629;
                        iM11306 = (i18 - C19806.m45029("ܳۗ")) * (-109);
                        i19 = ((iM11306 ^ i17) * 15409) ^ 342435902;
                        i5 = 870249351;
                        i13 = iM11306 ^ i5;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                        z3 = z3;
                        C17367 c1736113 = c17369;
                        c17368 = c17367;
                        c17369 = c1736113;
                    }
                    break;
                case -1041641765:
                case -653079519:
                    if (C3577.f13150 >= 0) {
                        c2414 = c2415;
                        z = z3;
                        c20557 = c20558;
                        sArr = sArr2;
                        C17367 c173623 = c17368;
                        c17369 = c17369;
                        c17367 = c173623;
                        iM11308 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i17;
                        i19 = ((iM11308 ^ i18) * 16653) ^ (-1108451640);
                        i9 = -1970300069;
                        int i26 = iM11308 ^ i9;
                        sArr2 = sArr;
                        c20558 = c20557;
                        c2415 = c2414;
                        i20 = i26;
                        z3 = z;
                        bundle = bundle;
                        C17367 c1736114 = c17369;
                        c17368 = c17367;
                        c17369 = c1736114;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                        i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                        i15 = -1212167173;
                        i20 = iM113011 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -914128537:
                case 53116958:
                    this.f68829.mo16878(c17369);
                    break;
                case -910314806:
                case 2131481519:
                    c2415 = c2415;
                    z3 = z3;
                    c20558 = c20558;
                    C17367 c173624 = c17368;
                    c17369 = c17369;
                    c17367 = c173624;
                    c6111.m16911();
                    m31019(this.f68829);
                    strM10571 = strM10571;
                    str = str;
                    z2 = z2;
                    C20556 c205510 = new C20556(this, this.f68829, C10634.m26821(f68821, 126, 4, i21), new C22673(this));
                    this.f68825 = c205510;
                    if (C3286.m9798() <= 0) {
                        c20559 = c205510;
                        textViewM49629 = textViewM49629;
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i17;
                        i19 = ((iM11306 ^ i18) * (-31875)) ^ (-1654765432);
                        i5 = 963135014;
                        i13 = iM11306 ^ i5;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                    } else {
                        int iM113013 = (i18 - ThreadFactoryC3888.m11306("۬ۢ")) * (-21);
                        c20559 = c205510;
                        c2415 = c2415;
                        str = str;
                        z2 = z2;
                        i20 = iM113013 ^ 1501854526;
                        i19 = ((iM113013 ^ i17) * (-14665)) ^ 162351714;
                        strM10571 = strM10571;
                        c20558 = c20558;
                    }
                    z3 = z3;
                    C17367 c1736115 = c17369;
                    c17368 = c17367;
                    c17369 = c1736115;
                    break;
                case -874837345:
                case -416413761:
                    c2415 = c2415;
                    C17367 c173625 = c17368;
                    c17369 = c17369;
                    c17367 = c173625;
                    if (intExtra != z2) {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܳܳ")) * 99;
                        i = ((iM45029 ^ i18) * (-16563)) ^ 1221003486;
                        i2 = 2027235809;
                    } else {
                        iM45029 = (i18 - ThreadFactoryC3888.m11306("᩻ۡ")) * (-31);
                        i = ((iM45029 ^ i17) * (-29249)) ^ 1696536321;
                        i2 = -554840515;
                    }
                    C2414 c2418 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c2418;
                    C17367 c1736116 = c17369;
                    c17368 = c17367;
                    c17369 = c1736116;
                    break;
                case -725114256:
                case 1117535161:
                    c2415 = c2415;
                    C20556 c205511 = c20558;
                    C17367 c173626 = c17368;
                    c17369 = c17369;
                    c17367 = c173626;
                    c205511.m46369(str2);
                    z3 = z3;
                    this.f68830 = C1937.m6287(this).getBooleanExtra(MenuItemOnMenuItemClickListenerC3244.m9715(f68821, 190, 13, i21), z3);
                    intentM18982 = C7105.m18982(this);
                    if (C1148.f5161 > 0) {
                        int iM113014 = (ThreadFactoryC3888.m11306("᩷ܿ") ^ i17) * 45;
                        int i27 = ((iM113014 ^ i18) * 32295) ^ (-627681590);
                        i8 = iM113014 ^ 1345335041;
                        c20558 = c205511;
                        i19 = i27;
                        z3 = z3;
                        c2415 = c2415;
                        i20 = i8;
                        bundle = bundle;
                        C17367 c1736117 = c17369;
                        c17368 = c17367;
                        c17369 = c1736117;
                    } else {
                        c20558 = c205511;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        iM11307 = (C19806.m45029("ۤۘ") ^ i18) * (-67);
                        i19 = ((iM11307 ^ i17) * (-8273)) ^ (-1488605212);
                        i6 = -1474161429;
                        i13 = iM11307 ^ i6;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                        z3 = z3;
                        C17367 c1736118 = c17369;
                        c17368 = c17367;
                        c17369 = c1736118;
                    }
                    break;
                case -712179909:
                case 1104001307:
                    C0050.m946();
                    if (!C19806.m45024()) {
                        c2415 = c2415;
                        C17367 c173627 = c17368;
                        c17369 = c17369;
                        c17367 = c173627;
                        iM45029 = C19806.m45029("۬᩺") ^ i17;
                        i = ((iM45029 ^ i18) * (-24205)) ^ 860350035;
                        i2 = 623822806;
                        C2414 c2419 = c2415;
                        i20 = iM45029 ^ i2;
                        i19 = i;
                        c2415 = c2419;
                        C17367 c1736119 = c17369;
                        c17368 = c17367;
                        c17369 = c1736119;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                        i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                        i15 = -1212167173;
                        i20 = iM113011 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -701214467:
                case 1733012531:
                    c2414 = c2415;
                    z = z3;
                    C17367 c173628 = c17368;
                    c17369 = c17369;
                    c17367 = c173628;
                    sArr = sArr2;
                    strM2421 = C0526.m2421(intentM6287, C1977.m6363(sArr, 171, 5, i21));
                    String strM2422 = C0526.m2421(intentM6287, C0962.m3747(f68821, PicnicEngine.MAX_AUX_BYTES, 14, i21));
                    setTitle(strM2421);
                    C20556 c205512 = this.f68825;
                    str2 = C2332.m7069(strM2422) ? strM2421 : strM2422;
                    iM11308 = ThreadFactoryC3888.m11306("۬ۤ") ^ i18;
                    c20557 = c205512;
                    i19 = ((iM11308 ^ i17) * 22469) ^ (-447228359);
                    i9 = 1374893573;
                    int i28 = iM11308 ^ i9;
                    sArr2 = sArr;
                    c20558 = c20557;
                    c2415 = c2414;
                    i20 = i28;
                    z3 = z;
                    bundle = bundle;
                    C17367 c17361110 = c17369;
                    c17368 = c17367;
                    c17369 = c17361110;
                    break;
                case -674427374:
                case 504700904:
                    c2415 = c2415;
                    C17367 c173629 = c17368;
                    c17369 = c17369;
                    c17367 = c173629;
                    str = (String) C12670.m31502(C1668.m5577(f68821, 256, 14, i21));
                    if (str == null) {
                        iM45029 = (C19806.m45029("֫ۙ") ^ i18) * (-125);
                        i = ((iM45029 ^ i17) * 12419) ^ 2011244912;
                        i2 = 9708074;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ֡") ^ i17;
                        i = ((iM45029 ^ i18) * 17071) ^ (-810547415);
                        i2 = -63981784;
                    }
                    C2414 c24110 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c24110;
                    C17367 c17361111 = c17369;
                    c17368 = c17367;
                    c17369 = c17361111;
                    break;
                case -619110690:
                case 812926933:
                    c17369 = c17369;
                    C17367 c17367M40441 = C17367.m40441(bArr);
                    boolean zM6907 = C2249.m6907(c17367M40441);
                    this.f68822 = zM6907;
                    if (!zM6907) {
                        c17367 = c17367M40441;
                        iM11309 = (ThreadFactoryC3888.m11306("ۖ۫") + i17) * (-71);
                        i10 = ((iM11309 ^ i18) * 21667) ^ 1833305165;
                        i11 = 844142755;
                        i20 = iM11309 ^ i11;
                        i19 = i10;
                        C17367 c17361112 = c17369;
                        c17368 = c17367;
                        c17369 = c17361112;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۢܰ") ^ i18;
                        c17367 = c17367M40441;
                        i19 = ((iM113010 ^ i17) * 17373) ^ (-179707704);
                        i12 = -645752905;
                        i20 = iM113010 ^ i12;
                        C17367 c17361113 = c17369;
                        c17368 = c17367;
                        c17369 = c17361113;
                    }
                    break;
                case -588021649:
                case 613291093:
                    c2415 = c2415;
                    C17367 c173630 = c17368;
                    c17369 = c17369;
                    c17367 = c173630;
                    this.f68832 = RunnableC3388.m10060(intentM18982, C2788.m8470(f68821, 203, 11, i21));
                    interfaceC6025 = ApplicationC0716.f2992;
                    sArr3 = f68821;
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۬᩺") ^ i17;
                        i = ((iM45029 ^ i18) * (-24205)) ^ 860350035;
                        i2 = 623822806;
                    } else {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i17;
                        i = ((iM45029 ^ i18) * (-12239)) ^ (-1251916668);
                        i2 = 1177748846;
                    }
                    C2414 c24111 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c24111;
                    C17367 c17361114 = c17369;
                    c17368 = c17367;
                    c17369 = c17361114;
                    break;
                case -412046372:
                case 1522345000:
                    C17367 c173631 = c17368;
                    this.f68831 = C3660.m10784(c17369);
                    c17369 = c17369;
                    c17367 = c173631;
                    iM11309 = ThreadFactoryC3888.m11306("۟ۢ") ^ i17;
                    i10 = ((iM11309 ^ i18) * 27961) ^ 1895008106;
                    i11 = -1311094415;
                    i20 = iM11309 ^ i11;
                    i19 = i10;
                    C17367 c17361115 = c17369;
                    c17368 = c17367;
                    c17369 = c17361115;
                    break;
                case -295999153:
                case 949790236:
                    c17367 = c17368;
                    C17367 c17367M40442 = C17367.m40441(bArrM22381);
                    boolean zM6908 = C2249.m6907(c17367M40442);
                    this.f68822 = zM6908;
                    if (!zM6908) {
                        c17369 = c17367M40442;
                        iM11309 = ThreadFactoryC3888.m11306("۟ۢ") ^ i17;
                        i10 = ((iM11309 ^ i18) * 27961) ^ 1895008106;
                        i11 = -1311094415;
                        i20 = iM11309 ^ i11;
                        i19 = i10;
                        C17367 c17361116 = c17369;
                        c17368 = c17367;
                        c17369 = c17361116;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i18;
                        c17369 = c17367M40442;
                        i19 = ((iM113010 ^ i17) * 23697) ^ 2091146119;
                        i12 = 1238500455;
                        i20 = iM113010 ^ i12;
                        C17367 c17361117 = c17369;
                        c17368 = c17367;
                        c17369 = c17361117;
                    }
                    break;
                case -158784733:
                case 687864185:
                    c2415 = c2415;
                    C17367 c173632 = c17368;
                    c17369 = c17369;
                    c17367 = c173632;
                    bArrM22381 = C8603.m22381(bundle, strM10571);
                    if (bArrM22381 == null) {
                        iM45029 = C19806.m45029("ۖۚ") ^ i17;
                        i = ((iM45029 ^ i18) * (-25601)) ^ 883339251;
                        i2 = -300150611;
                    } else {
                        iM45029 = C19806.m45029("᩻۟") ^ i18;
                        i = ((iM45029 ^ i17) * (-20701)) ^ (-1152967305);
                        i2 = 737168668;
                    }
                    C2414 c24112 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c24112;
                    C17367 c17361118 = c17369;
                    c17368 = c17367;
                    c17369 = c17361118;
                    break;
                case -10418275:
                case 45332678:
                    str = str;
                    c2415 = c2415;
                    z2 = z2;
                    z3 = z3;
                    c20558 = c20558;
                    strM10571 = strM10571;
                    C17367 c173633 = c17368;
                    c17369 = c17369;
                    c17367 = c173633;
                    C7105.m18992(this);
                    C0526.m2430(this.f41645, new ViewOnClickListenerC20535(1, this));
                    C7105.m18993(this.f41645, new ViewOnClickListenerC18313(this, 0));
                    textViewM49629 = C22377.m49629(this.f41645);
                    if (RunnableC3388.f12514 >= 0) {
                        iM11307 = (C19806.m45029("ۤۘ") ^ i18) * (-67);
                        i19 = ((iM11307 ^ i17) * (-8273)) ^ (-1488605212);
                        i6 = -1474161429;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i18) * 91;
                        i19 = ((iM11307 ^ i17) * (-14513)) ^ 1869696647;
                        i6 = 1886453920;
                    }
                    i13 = iM11307 ^ i6;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    str = str;
                    z2 = z2;
                    i20 = i13;
                    c20558 = c20558;
                    z3 = z3;
                    C17367 c17361119 = c17369;
                    c17368 = c17367;
                    c17369 = c17361119;
                    break;
                case 10040197:
                case 1267667279:
                    C17367 c173634 = c17369;
                    c17367 = c17368;
                    c17369 = c173634;
                    c2415 = (C2414) C12670.m31502(C3660.m10790(f68821, 288, 14, i21));
                    if (c2415 == null) {
                        iM11309 = (C19806.m45029("ܶ᩷") + i17) * 29;
                        i10 = ((iM11309 ^ i18) * 9307) ^ (-493214884);
                        i11 = 1440683068;
                    } else {
                        iM11309 = (C19806.m45029("ۧ᩵") + i18) * 69;
                        i10 = ((iM11309 ^ i17) * (-31601)) ^ (-2070206284);
                        i11 = 1867433129;
                    }
                    i20 = iM11309 ^ i11;
                    i19 = i10;
                    C17367 c173611110 = c17369;
                    c17368 = c17367;
                    c17369 = c173611110;
                    break;
                case 28603499:
                case 1323269229:
                    C3286.m9797(this.f68829, new C19186(str));
                    break;
                case 111465622:
                case 1338758041:
                    c2415 = c2415;
                    c20556 = c20558;
                    C17367 c173635 = c17368;
                    c17369 = c17369;
                    c17367 = c173635;
                    RunnableC1895.m6165(RunnableC0195.m1436(this, i22 ^ i23), 8);
                    intentM6287 = C1937.m6287(this);
                    this.f68826 = intentM6287.getBooleanExtra(C2871.m8640(f68821, EnumC2300.f8185, 17, i21), false);
                    sArr2 = f68821;
                    if (C3535.f13026 <= 0) {
                        z3 = false;
                        int iM113015 = (i17 - ThreadFactoryC3888.m11306("᩵ۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i29 = ((iM113015 ^ i18) * 13937) ^ (-1015893135);
                        i8 = iM113015 ^ (-1530399110);
                        c20558 = c20556;
                        i19 = i29;
                        c2415 = c2415;
                    } else {
                        int iM450213 = (i17 - C19806.m45029("ܽۤ")) * (-51);
                        int i30 = ((iM450213 ^ i18) * 18509) ^ (-1368641073);
                        i8 = iM450213 ^ 1024576882;
                        c20558 = c20556;
                        i19 = i30;
                        c2415 = c2415;
                        z3 = false;
                    }
                    i20 = i8;
                    bundle = bundle;
                    C17367 c173611111 = c17369;
                    c17368 = c17367;
                    c17369 = c173611111;
                    break;
                case 114621503:
                case 813078857:
                    if (C0671.f2816 != 0) {
                        str = str;
                        c2415 = c2415;
                        z2 = z2;
                        z3 = z3;
                        c20558 = c20558;
                        strM10571 = strM10571;
                        textViewM49629 = textViewM49629;
                        C17367 c173636 = c17368;
                        c17369 = c17369;
                        c17367 = c173636;
                        iM11306 = (i18 - C19806.m45029("ܳۗ")) * (-109);
                        i19 = ((iM11306 ^ i17) * 15409) ^ 342435902;
                        i5 = 870249351;
                        i13 = iM11306 ^ i5;
                        textViewM49629 = textViewM49629;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                        z3 = z3;
                        C17367 c173611112 = c17369;
                        c17368 = c17367;
                        c17369 = c173611112;
                    }
                    c2414 = c2415;
                    z = z3;
                    c20557 = c20558;
                    sArr = sArr2;
                    C17367 c1736210 = c17368;
                    c17369 = c17369;
                    c17367 = c1736210;
                    iM11308 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i17;
                    i19 = ((iM11308 ^ i18) * 16653) ^ (-1108451640);
                    i9 = -1970300069;
                    int i210 = iM11308 ^ i9;
                    sArr2 = sArr;
                    c20558 = c20557;
                    c2415 = c2414;
                    i20 = i210;
                    z3 = z;
                    bundle = bundle;
                    C17367 c173611113 = c17369;
                    c17368 = c17367;
                    c17369 = c173611113;
                    break;
                case 191787744:
                case 1875623620:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!C0797.f3386) {
                        str = str;
                        c2415 = c2415;
                        z2 = z2;
                        z3 = z3;
                        c20558 = c20558;
                        strM10571 = strM10571;
                        C17367 c173637 = c17368;
                        c17369 = c17369;
                        c17367 = c173637;
                        iM11307 = (C19806.m45029("ۤۘ") ^ i18) * (-67);
                        i19 = ((iM11307 ^ i17) * (-8273)) ^ (-1488605212);
                        i6 = -1474161429;
                        i13 = iM11307 ^ i6;
                        c2415 = c2415;
                        strM10571 = strM10571;
                        str = str;
                        z2 = z2;
                        i20 = i13;
                        c20558 = c20558;
                        z3 = z3;
                        C17367 c173611114 = c17369;
                        c17368 = c17367;
                        c17369 = c173611114;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                        i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                        i15 = -1212167173;
                        i20 = iM113011 ^ i15;
                        i19 = i14;
                    }
                    break;
                case 209936094:
                case 589874427:
                    c17367 = c17368;
                    i21 = 42220;
                    iM450210 = C19806.m45029("ۘۡ") ^ i17;
                    i3 = ((iM450210 ^ i18) * 24009) ^ 852028684;
                    i4 = 154029083;
                    i7 = iM450210 ^ i4;
                    iM450212 = iM450212;
                    textViewM49629 = textViewM49629;
                    c2415 = c2415;
                    strM10571 = strM10571;
                    z2 = z2;
                    i20 = i7;
                    i19 = i3;
                    c20558 = c20558;
                    str = str;
                    z3 = z3;
                    C17367 c173611115 = c17369;
                    c17368 = c17367;
                    c17369 = c173611115;
                    break;
                case 315533789:
                case 2092160143:
                    super.finish();
                    break;
                case 331389263:
                case 696427284:
                    if (RunnableC1606.f6488 >= 0) {
                        c2415 = c2415;
                        c20556 = c20558;
                        C17367 c173638 = c17368;
                        c17369 = c17369;
                        c17367 = c173638;
                        int iM113016 = (i17 - ThreadFactoryC3888.m11306("᩵ۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i211 = ((iM113016 ^ i18) * 13937) ^ (-1015893135);
                        i8 = iM113016 ^ (-1530399110);
                        c20558 = c20556;
                        i19 = i211;
                        c2415 = c2415;
                        i20 = i8;
                        bundle = bundle;
                        C17367 c173611116 = c17369;
                        c17368 = c17367;
                        c17369 = c173611116;
                    } else {
                        c2415 = c2415;
                        C17367 c1736211 = c17368;
                        c17369 = c17369;
                        c17367 = c1736211;
                        iM45029 = C19806.m45029("۬᩺") ^ i17;
                        i = ((iM45029 ^ i18) * (-24205)) ^ 860350035;
                        i2 = 623822806;
                        C2414 c24113 = c2415;
                        i20 = iM45029 ^ i2;
                        i19 = i;
                        c2415 = c24113;
                        C17367 c173611117 = c17369;
                        c17368 = c17367;
                        c17369 = c173611117;
                    }
                    break;
                case 360340522:
                case 766952095:
                    super.finish();
                    break;
                case 801635862:
                case 2104224599:
                    c2415 = c2415;
                    C17367 c173639 = c17368;
                    c17369 = c17369;
                    c17367 = c173639;
                    strM10571 = C3577.m10571(f68821, 244, 12, i21);
                    if (C8603.m22380(bundle, strM10571)) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i18;
                        i = ((iM45029 ^ i17) * 31919) ^ 1383222107;
                        i2 = -437901088;
                    } else {
                        iM45029 = C19806.m45029("֨ܰ") ^ i18;
                        i = ((iM45029 ^ i17) * (-13915)) ^ 957098283;
                        i2 = -1812900503;
                    }
                    C2414 c24114 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c24114;
                    C17367 c173611118 = c17369;
                    c17368 = c17367;
                    c17369 = c173611118;
                    break;
                case 879462464:
                case 1837019834:
                    this.f68829.mo16878(c17368);
                    break;
                case 947701515:
                case 1899376199:
                    C2642.m8171();
                    iM113011 = ThreadFactoryC3888.m11306("۟ۘ") ^ i18;
                    i14 = ((iM113011 ^ i17) * 30267) ^ (-1591139857);
                    i15 = -1212167173;
                    i20 = iM113011 ^ i15;
                    i19 = i14;
                    break;
                case 1046639012:
                case 1721303164:
                    c2414 = c2415;
                    z = z3;
                    sArr = sArr2;
                    C17367 c173640 = c17368;
                    c17369 = c17369;
                    c17367 = c173640;
                    c20557 = c20558;
                    c20559.m46370(C2332.m7082(f68821, 130, 21, i21), true);
                    int iM450214 = C19806.m45029(C2642.m8172(f68821, 151, 3, i21));
                    i23 = 2118710938;
                    if (C0278.f1572 <= 0) {
                        i22 = iM450214;
                        z2 = true;
                        iM11308 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i17;
                        i19 = ((iM11308 ^ i18) * 16653) ^ (-1108451640);
                        i9 = -1970300069;
                        int i212 = iM11308 ^ i9;
                        sArr2 = sArr;
                        c20558 = c20557;
                        c2415 = c2414;
                        i20 = i212;
                        z3 = z;
                        bundle = bundle;
                    } else {
                        int iM113017 = (i18 - ThreadFactoryC3888.m11306("᩺ۚ")) * 47;
                        i22 = iM450214;
                        sArr2 = sArr;
                        c20558 = c20557;
                        c2415 = c2414;
                        bundle = bundle;
                        i20 = iM113017 ^ (-551243259);
                        i19 = ((iM113017 ^ i17) * (-10669)) ^ (-1371625153);
                        z3 = z;
                        z2 = true;
                    }
                    C17367 c173611119 = c17369;
                    c17368 = c17367;
                    c17369 = c173611119;
                    break;
                case 1252736229:
                case 1833864955:
                    C17367 c173641 = c17368;
                    c17369 = c17369;
                    c17367 = c173641;
                    if (intExtra != 2) {
                        iM11309 = C19806.m45029("᩶ܰ") ^ i18;
                        i10 = ((iM11309 ^ i17) * (-30613)) ^ (-1716401484);
                        i11 = 1876901681;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ۡ᩸") + i17) * 99;
                        i10 = ((iM11309 ^ i18) * 2215) ^ (-1215206255);
                        i11 = 2025639590;
                    }
                    i20 = iM11309 ^ i11;
                    i19 = i10;
                    C17367 c1736111110 = c17369;
                    c17368 = c17367;
                    c17369 = c1736111110;
                    break;
                case 1350582370:
                case 1559025893:
                    C1668.m5582(C19806.m45029(ThreadFactoryC3888.m11312(f68821, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 3, i21)) ^ 2100831534);
                    super.finish();
                    break;
                case 1378539219:
                case 1434754829:
                    this.f68822 = z2;
                    C1419.m4968(this.f68829, new C19186(RunnableC0195.m1437(c2415.f9693, C2477.m7604(f68821, 302, 54, i21), "")));
                    this.f68831 = (byte) c2415.f9692;
                    break;
                case 1795541964:
                case 2067020547:
                    C17367 c173642 = c17368;
                    c17369 = c17369;
                    c17367 = c173642;
                    c2415 = c2415;
                    bArr = (byte[]) C12670.m31502(C1189.m4365(f68821, BottomAppBarTopEdgeTreatment.ANGLE_UP, 15, i21));
                    if (bArr == null) {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܿۖ")) * 5;
                        i = ((iM45029 ^ i18) * (-25761)) ^ 1551566470;
                        i2 = 1394415094;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩸") ^ i18;
                        i = ((iM45029 ^ i17) * (-19281)) ^ (-773856835);
                        i2 = -931782536;
                    }
                    C2414 c24115 = c2415;
                    i20 = iM45029 ^ i2;
                    i19 = i;
                    c2415 = c24115;
                    C17367 c1736111111 = c17369;
                    c17368 = c17367;
                    c17369 = c1736111111;
                    break;
                default:
                    this.f68831 = C3660.m10784(c17368);
                    C17367 c173643 = c17368;
                    c17369 = c17369;
                    c17367 = c173643;
                    iM11309 = (ThreadFactoryC3888.m11306("ۖ۫") + i17) * (-71);
                    i10 = ((iM11309 ^ i18) * 21667) ^ 1833305165;
                    i11 = 844142755;
                    i20 = iM11309 ^ i11;
                    i19 = i10;
                    C17367 c1736111112 = c17369;
                    c17368 = c17367;
                    c17369 = c1736111112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0370 A[PHI: r5 r13 r14 r15 r16 r18 r19 r20 r21 r23 r28
      0x0370: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r13v20 short[]) = (r13v8 short[]), (r13v10 short[]), (r13v11 short[]), (r13v21 short[]) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v5 short[]) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v5 int) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r18v11 short) = (r18v2 short), (r18v4 short), (r18v10 short), (r18v2 short) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r21v5 int) = (r21v2 int), (r21v2 int), (r21v4 int), (r21v2 int) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r23v3 int) = (r23v2 int), (r23v2 int), (r23v2 int), (r23v5 int) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r28v4 int) = (r28v3 int), (r28v3 int), (r28v3 int), (r28v5 int) binds: [B:81:0x036e, B:73:0x0310, B:70:0x02e4, B:44:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (l.C0216.f1393 == 0) goto L10;
     */
    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC21135.onSaveInstanceState(android.os.Bundle):void");
    }
}
