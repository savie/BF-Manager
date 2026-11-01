package bin.mt.plus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import l.AbstractC0464;
import l.AbstractC20745;
import l.ActivityC10181;
import l.ActivityC11632;
import l.ActivityC1609;
import l.ActivityC20904;
import l.ActivityC3541;
import l.ActivityC4866;
import l.C0050;
import l.C0216;
import l.C0278;
import l.C0526;
import l.C0629;
import l.C0671;
import l.C0797;
import l.C0817;
import l.C0962;
import l.C1025;
import l.C10634;
import l.C1066;
import l.C1148;
import l.C11692;
import l.C1398;
import l.C1419;
import l.C1460;
import l.C1461;
import l.C1668;
import l.C1875;
import l.C1937;
import l.C1977;
import l.C19806;
import l.C2124;
import l.C2249;
import l.C2332;
import l.C2477;
import l.C2642;
import l.C2788;
import l.C2871;
import l.C3286;
import l.C3535;
import l.C3577;
import l.C3660;
import l.C3722;
import l.C3743;
import l.C7105;
import l.CallableC1627;
import l.RunnableC0195;
import l.RunnableC1564;
import l.RunnableC1606;
import l.RunnableC1895;
import l.RunnableC3388;
import l.ThreadFactoryC3888;
import l.ViewOnClickListenerC4514;
import l.ViewOnLayoutChangeListenerC3333;
import l.ViewTreeObserverOnPreDrawListenerC3327;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ShortcutActivity extends ActivityC4866 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f66;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean f67;

    /* JADX INFO: renamed from: ᩵᩸ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f68 = {5391, 30918, 30941, 30938, 30919, 30913, 30934, 30912, 30913, 30918, 8416, 11699, -12049, -6663, -20382, -20359, -20359, -20358, -20421, -20359, -20378, -20365, -20380, -20361, -20382, -20353, -20359, -20360, -20381, -20378, -20366, -20361, -20382, -20365, -20390, -20361, -20364, -20365, -20358, -20361, -20363, -20363, -20365, -20360, -20382, -20395, -20359, -20358, -20359, -20380, -20385, -20363, -20359, -20360, -20368, -20359, -20358, -20366, -20365, -20380, -20395, -20359, -20358, -20359, -20380, -20385, -20363, -20359, -20360, 14847, 9006, -5529, 15473, -14305, -6529, -20353, -20379, -20398, -20353, -20380, 5187, 26285, 26290, 26279, 26288, 26275, 26294, 26283, 26285, 26284, 26290, 26275, 26294, 26282, 26294, 26285, 26285, 26286, 26351, 26279, 26298, 26294, 26288, 26275, 26273, 26294, 26351, 26275, 26290, 26281, 26279, 26278, 26283, 26294, 26351, 26294, 26279, 26298, 26294, 26294, 26285, 26285, 26286, 26351, 26275, 26290, 26281, 26351, 26287, 26273, 26290, 26294, 26285, 26285, 26286, 26351, 26287, 26295, 26289, 26283, 26273, 26351, 26290, 26286, 26275, 26299, 26279, 26288, 26290, 26288, 26279, 26292, 26283, 26279, 26293, 26351, 26282, 26294, 26287, 26286, 26285, 26290, 26279, 26284, 26351, 26284, 26289, 26286, 26285, 26273, 26275, 26294, 26279, 26351, 26273, 26286, 26283, 26273, 26281, 26294, 26285, 26285, 26286, 26351, 26273, 26285, 26286, 26285, 26288, 26351, 26290, 26283, 26273, 26281, 26279, 26288, 26286, 26285, 26273, 26275, 26294, 26279, 26294, 26285, 26285, 26286, 26351, 26294, 26279, 26288, 26287, 26283, 26284, 26275, 26286, 26294, 26285, 26285, 26286, 26351, 26289, 26283, 26277, 26284, 26275, 26294, 26295, 26288, 26279, 26351, 26281, 26279, 26299, 26294, 26285, 26285, 26286, 26351, 26275, 26273, 26294, 26283, 26292, 26283, 26294, 26299, 26351, 26288, 26279, 26273, 26285, 26288, 26278, 26277, 26285, 26294, 26285, 26351, 26285, 26288, 26351, 26286, 26285, 26273, 26275, 26294, 26279, 26294, 26285, 26285, 26286, 26351, 26290, 26286, 26295, 26277, 26283, 26284, 26351, 26287, 26275, 26284, 26275, 26277, 26279, 26294, 26285, 26285, 26286, 26351, 26289, 26294, 26288, 26279, 26275, 26287, 26351, 26287, 26279, 26278, 26283, 26275, 26277, 26285, 26294, 26285, 26294, 26285, 26285, 26286, 26351, 26289, 26287, 26275, 26286, 26283, 26351, 26291, 26295, 26279, 26288, 26299, 26279, 26298, 26279, 26273, 26351, 26289, 26273, 26288, 26283, 26290, 26294, 26294, 26285, 26285, 26286, 26351, 26294, 26295, 26294, 26285, 26288, 26283, 26275, 26286, 26294, 26285, 26285, 26286, 26351, 26288, 26279, 26287, 26285, 26294, 26279, 26351, 26290, 26275, 26299, 26286, 26285, 26275, 26278, 26294, 26285, 26285, 26286, 26351, 26288, 26279, 26287, 26285, 26294, 26279, 26351, 26287, 26275, 26284, 26275, 26277, 26279, 26294, 26285, 26285, 26286, 26351, 26273, 26285, 26287, 26287, 26285, 26284, 26351, 26290, 26275, 26289, 26289, 26293, 26285, 26288, 26278, 26289, 26294, 26285, 26285, 26286, 26351, 26288, 26279, 26273, 26299, 26273, 26286, 26279, 26351, 26272, 26283, 26284, 26294, 26285, 26285, 26286, 26351, 26275, 26290, 26290, 26351, 26290, 26288, 26285, 26294, 26279, 26273, 26294, 26294, 26285, 26285, 26286, 26351, 26294, 26279, 26298, 26294, 26351, 26279, 26278, 26283, 26294, 26285, 26288, 26275, 26284, 26278, 26288, 26285, 26283, 26278, 26348, 26283, 26284, 26294, 26279, 26284, 26294, 26348, 26275, 26273, 26294, 26283, 26285, 26284, 26348, 26260, 26251, 26247, 26261, 26289, 26282, 26285, 26288, 26294, 26273, 26295, 26294};

    /* JADX WARN: Code duplicated, block: B:77:0x0405 A[PHI: r36
      0x0405: PHI (r36v6 java.lang.String) = (r36v1 java.lang.String), (r36v2 java.lang.String), (r36v4 java.lang.String), (r36v1 java.lang.String) binds: [B:75:0x03ed, B:62:0x034d, B:51:0x02cc, B:42:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x04aa A[PHI: r33
      0x04aa: PHI (r33v3 java.lang.String) = (r33v1 java.lang.String), (r33v2 java.lang.String), (r33v4 java.lang.String) binds: [B:89:0x0493, B:80:0x0423, B:69:0x039e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01ac, code lost:
    
        if (l.C1460.m5050() == 0) goto L22;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m138(l.AbstractActivityC12483 r82, boolean r83) {
        /*
            Method dump skipped, instruction units count: 5520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.plus.ShortcutActivity.m138(l.۫ܶۘ, boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:205:0x076e. Please report as an issue. */
    @Override // l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int iM11308;
        int i5;
        ShortcutActivity shortcutActivity = this;
        String strM2421 = null;
        String strM2422 = null;
        int i6 = 0;
        Class<ActivityC11632> cls = null;
        boolean z = false;
        int i7 = 0;
        boolean zM2315 = false;
        boolean zM5058 = false;
        boolean zM2316 = false;
        boolean zM5059 = false;
        boolean zM50510 = false;
        boolean zM2317 = false;
        boolean zM50511 = false;
        boolean zM50512 = false;
        boolean zM2318 = false;
        boolean zM2319 = false;
        boolean zM50513 = false;
        boolean zM50514 = false;
        boolean zM50515 = false;
        boolean zM23110 = false;
        boolean zM50516 = false;
        boolean zM50517 = false;
        boolean zM23111 = false;
        boolean zM23112 = false;
        boolean zM23113 = false;
        boolean zM50518 = false;
        boolean zM50519 = false;
        boolean zM50520 = false;
        boolean zM23114 = false;
        boolean zM50521 = false;
        boolean zM50522 = false;
        boolean zM1432 = false;
        boolean zM1433 = false;
        boolean zM7069 = false;
        int i8 = 749612862;
        int i9 = C2249.f8050;
        int i10 = RunnableC1606.f6488;
        int iM11309 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i9;
        int i11 = ((iM11309 ^ i10) * 703) ^ (-783444089);
        int i12 = iM11309 ^ 6251572;
        int i13 = 0;
        boolean zM70610 = false;
        Intent intent = null;
        int iM113010 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-28331)) >> 31));
            switch (i8) {
                case -2143750921:
                case -437891565:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50521) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i10) * (-55);
                        i = ((iM11306 ^ i9) * 12557) ^ 1484854959;
                        i2 = -1638319542;
                        zM2315 = zM2315;
                        String str2 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str2;
                    }
                    break;
                case -2125660075:
                case -1779001446:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent2 = new Intent(shortcutActivity, (Class<?>) ActivityC1609.class);
                    C2871.m8643(intent2, i7);
                    RunnableC1606.m5467(shortcutActivity, intent2);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -2111330544:
                case 1873381795:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50510) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i9;
                        i = ((iM11306 ^ i10) * (-9339)) ^ 1698850494;
                        i2 = -1275233539;
                        zM2315 = zM2315;
                        String str3 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str3;
                    }
                    break;
                case -2081362970:
                case -596312979:
                    zM2315 = zM2315;
                    zM50517 = C1460.m5058(strM2421, C2642.m8172(f68, 302, 4, i13));
                    iM11308 = (i10 - ThreadFactoryC3888.m11306("֫۬")) * 57;
                    i4 = ((iM11308 ^ i9) * (-31035)) ^ (-1325905619);
                    i5 = 406284349;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -2059207738:
                case -1186610443:
                    zM2315 = zM2315;
                    zM50516 = C1460.m5058(strM2421, C0962.m3747(f68, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 17, i13));
                    iM11308 = (ThreadFactoryC3888.m11306("ۢ᩵") ^ i10) * (-103);
                    i4 = ((iM11308 ^ i9) * (-7637)) ^ 1115076633;
                    i5 = 372476160;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -2030283175:
                case 365848129:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM5058) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i10;
                        i = ((iM11306 ^ i9) * (-26361)) ^ 2033151481;
                        i2 = 579041535;
                        zM2315 = zM2315;
                        String str4 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str4;
                    }
                    break;
                case -2016520485:
                case -1968099315:
                    ActivityC10181.m25929(shortcutActivity, strM2422);
                    zM2315 = zM2315;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -2016231569:
                case -971027121:
                    C0216.m1586(this);
                    return;
                case -2012197709:
                case 212256010:
                    zM2315 = zM2315;
                    zM23110 = AbstractC0464.m2315(strM2421, C2642.m8172(f68, 267, 18, i13));
                    iM11308 = (i9 - ThreadFactoryC3888.m11306("۬᩷")) * 45;
                    i4 = ((iM11308 ^ i10) * 32253) ^ 1565987686;
                    i5 = -1611874363;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -2003761845:
                case 872579843:
                    zM2315 = zM2315;
                    zM50521 = C1460.m5058(strM2421, RunnableC0195.m1429(f68, 420, 16, i13));
                    iM11308 = C19806.m45029("ᩳۢ") ^ i9;
                    i4 = ((iM11308 ^ i10) * (-5229)) ^ 908609804;
                    i5 = 629548467;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1903251669:
                case 1319521873:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM23110) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (C19806.m45029("ܰܶ") + i9) * 57;
                        i = ((iM11306 ^ i10) * 6505) ^ (-1054974830);
                        i2 = 1461541208;
                        zM2315 = zM2315;
                        String str5 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str5;
                    }
                    break;
                case -1895152341:
                case -516251364:
                    i13 = 26306;
                    iM11307 = (i9 - ThreadFactoryC3888.m11306("֨᩺")) * 61;
                    i11 = ((iM11307 ^ i10) * (-24939)) ^ 1340076865;
                    i3 = -384112325;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1837499266:
                case 936771646:
                    try {
                        Main.m66(shortcutActivity, intent.getExtras(), z);
                        break;
                    } catch (Exception unused) {
                    }
                    zM2315 = zM2315;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1831685185:
                case -1085858756:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent3 = new Intent(shortcutActivity, cls);
                    C2871.m8643(intent3, i7);
                    C1977.m6359(intent3, i6);
                    RunnableC1606.m5467(shortcutActivity, intent3);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1810529001:
                case 616625720:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50512) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str6 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str6;
                    }
                    break;
                case -1772386925:
                case -1194820386:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50516) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str7 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str7;
                    }
                    break;
                case -1771475314:
                case -220801879:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50519) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str8 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str8;
                    }
                    break;
                case -1771245638:
                case -858394779:
                    zM2315 = zM2315;
                    zM5058 = C1460.m5058(strM2421, C2871.m8640(f68, UMErrorCode.E_UM_BE_JSON_FAILED, 9, i13));
                    iM11308 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i10;
                    i4 = ((iM11308 ^ i9) * 30379) ^ 54908578;
                    i5 = -98923776;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1711491863:
                case 719706270:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM1432) {
                        iM11306 = C19806.m45029("۟᩻") ^ i9;
                        i = ((iM11306 ^ i10) * 10959) ^ (-798423514);
                        i2 = -641144586;
                        zM2315 = zM2315;
                        String str9 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str9;
                    } else {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    }
                    break;
                case -1709100287:
                case -1600034329:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50520) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str10 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str10;
                    }
                    break;
                case -1665240340:
                case -331427029:
                    zM2315 = zM2315;
                    zM2318 = AbstractC0464.m2315(strM2421, C3660.m10790(f68, 196, 6, i13));
                    iM11308 = (C19806.m45029("֡ܳ") + i9) * (-55);
                    i4 = ((iM11308 ^ i10) * (-21369)) ^ 824886195;
                    i5 = -834356836;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1656266839:
                case -397231635:
                    zM2315 = zM2315;
                    zM5059 = C1460.m5058(strM2421, C0050.m940(f68, 131, 17, i13));
                    iM11308 = (i10 - C19806.m45029("ܿۢ")) * (-65);
                    i4 = ((iM11308 ^ i9) * 12385) ^ 1632775870;
                    i5 = 365137086;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1645029871:
                case 1808449982:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent4 = new Intent(shortcutActivity, (Class<?>) ViewOnLayoutChangeListenerC3333.class);
                    C1977.m6359(intent4, i7);
                    C2477.m7599(shortcutActivity, intent4);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1621246957:
                case 282708209:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM2316) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str11 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str11;
                    }
                    break;
                case -1494151924:
                case 2039311447:
                    zM2315 = zM2315;
                    zM50514 = C1460.m5058(strM2421, C1419.m4969(f68, 233, 20, i13));
                    iM11308 = ThreadFactoryC3888.m11306("ܳۗ") ^ i9;
                    i4 = ((iM11308 ^ i10) * 3903) ^ (-1929849788);
                    i5 = 359010739;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1453421095:
                case 62570618:
                    zM2315 = zM2315;
                    strM2421 = strM2421;
                    zM50522 = C1460.m5058(strM2421, C1460.m5047(f68, 436, 16, i13));
                    iM11308 = C19806.m45029("᩺ۛ") ^ i10;
                    i4 = ((iM11308 ^ i9) * 23381) ^ (-1362755871);
                    i5 = 1394738739;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1450976986:
                case -1169816133:
                    zM2315 = zM2315;
                    zM50513 = C1460.m5058(strM2421, C0797.m3361(f68, 215, 18, i13));
                    iM11308 = (i9 - ThreadFactoryC3888.m11306("ۙ۟")) * (-99);
                    i4 = ((iM11308 ^ i10) * 21519) ^ 1503989864;
                    i5 = 1572365398;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1434039654:
                case 635930236:
                    zM2315 = zM2315;
                    zM23111 = AbstractC0464.m2315(strM2421, C2871.m8640(f68, 306, 16, i13));
                    iM11308 = C19806.m45029("ᩴ۠") ^ i9;
                    i4 = ((iM11308 ^ i10) * 14685) ^ (-137757536);
                    i5 = -821423136;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1283559465:
                case 1473080363:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50511) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("۠ۜ")) * 89;
                        i = ((iM11306 ^ i10) * (-27689)) ^ (-721215654);
                        i2 = 506410795;
                        zM2315 = zM2315;
                        String str12 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str12;
                    }
                    break;
                case -1262729261:
                case -60409891:
                    zM2315 = zM2315;
                    zM23112 = AbstractC0464.m2315(strM2421, C7105.m18989(f68, 322, 11, i13));
                    iM11308 = C19806.m45029("᩻ܰ") ^ i10;
                    i4 = ((iM11308 ^ i9) * 3375) ^ (-275473250);
                    i5 = 46813067;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1249471288:
                case 79414552:
                    str = strM2421;
                    zM2315 = zM2315;
                    Main.m66(shortcutActivity, intent.getExtras(), z);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1169646802:
                case 1290474155:
                    i13 = 33175;
                    iM11307 = (i9 - ThreadFactoryC3888.m11306("֨᩺")) * 61;
                    i11 = ((iM11307 ^ i10) * (-24939)) ^ 1340076865;
                    i3 = -384112325;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1124668598:
                case 904810725:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50522) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ᩳ") ^ i10;
                        i = ((iM11306 ^ i9) * 22879) ^ (-1212501833);
                        i2 = 2097556380;
                        zM2315 = zM2315;
                        String str13 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str13;
                    }
                    break;
                case -1097485906:
                case -821838670:
                    str = strM2421;
                    zM2315 = zM2315;
                    throw new RuntimeException();
                case -1093967099:
                case -640976178:
                    zM2315 = zM2315;
                    zM50511 = C1460.m5058(strM2421, ViewTreeObserverOnPreDrawListenerC3327.m9869(f68, 167, 12, i13));
                    iM11308 = (i10 - C19806.m45029("۟᩶")) * (-103);
                    i4 = ((iM11308 ^ i9) * 2045) ^ 2118291394;
                    i5 = 871794734;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1091004920:
                case -112202006:
                    zM2315 = zM2315;
                    zM50510 = C1460.m5058(strM2421, RunnableC1895.m6164(f68, 148, 12, i13));
                    iM11308 = (ThreadFactoryC3888.m11306("ᩴۡ") + i9) * (-7);
                    i4 = ((iM11308 ^ i10) * (-21659)) ^ (-1152235257);
                    i5 = -761552673;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1069756849:
                case 299047509:
                    zM2315 = zM2315;
                    short s = f68[80];
                    int i14 = (s * s) + 260273689;
                    int i15 = s + 16133;
                    if ((i15 * i15) - (i14 + i14) <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۛܳ") + i9) * (-57);
                        i11 = ((iM11307 ^ i10) * 19855) ^ (-499418704);
                        i3 = -1497647238;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܰۜ") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-8517)) ^ 354392636;
                        i3 = -1556340257;
                    }
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -1058317320:
                case 865169690:
                    zM2315 = zM2315;
                    if (zM70610) {
                        iM11308 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i10;
                        i4 = ((iM11308 ^ i9) * 22479) ^ (-420265909);
                        i5 = -888237805;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۤ֫") ^ i9;
                        i4 = ((iM11308 ^ i10) * 5605) ^ (-917733794);
                        i5 = -1921522555;
                    }
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -1001118317:
                case -421369016:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50513) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str14 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str14;
                    }
                    break;
                case -994878599:
                case 618298385:
                    zM2315 = zM2315;
                    C0278.m1783(this);
                    iM11308 = ThreadFactoryC3888.m11306("ۗۡ") ^ i9;
                    i4 = ((iM11308 ^ i10) * 5189) ^ 109490388;
                    i5 = 1042021040;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -968193588:
                case 258635875:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM23111) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str15 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str15;
                    }
                    break;
                case -936466720:
                case -571400516:
                    zM2315 = zM2315;
                    zM23113 = AbstractC0464.m2315(strM2421, C0050.m940(f68, 333, 13, i13));
                    iM11308 = (i9 - C19806.m45029("۠ۨ")) * (-31);
                    i4 = ((iM11308 ^ i10) * (-14227)) ^ (-1710927299);
                    i5 = 1555996092;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -888882409:
                case 668549692:
                    zM2315 = zM2315;
                    zM2317 = AbstractC0464.m2315(strM2421, C0962.m3747(f68, DHParameters.DEFAULT_MINIMUM_LENGTH, 7, i13));
                    iM11308 = ThreadFactoryC3888.m11306("ۙ֡") ^ i9;
                    i4 = ((iM11308 ^ i10) * (-957)) ^ 1936173897;
                    i5 = 751606313;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -850114489:
                case 250220127:
                    str = strM2421;
                    zM2315 = zM2315;
                    zM1432 = RunnableC0195.m1432(strM2422);
                    iM11306 = (i9 - C19806.m45029("ܳ᩻")) * 27;
                    i = ((iM11306 ^ i10) * (-15039)) ^ 1069659410;
                    i2 = -744229612;
                    zM2315 = zM2315;
                    String str16 = str;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    strM2421 = str16;
                    break;
                case -826709027:
                case 1773020758:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM7069) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-31757)) ^ 2027526129;
                        i2 = 1555650605;
                        zM2315 = zM2315;
                        String str17 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str17;
                    } else {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    }
                    break;
                case -785852691:
                case -113326112:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM23114) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i10;
                        i = ((iM11306 ^ i9) * (-13889)) ^ 1664524363;
                        i2 = 1515303554;
                        zM2315 = zM2315;
                        String str18 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str18;
                    }
                    break;
                case -742689123:
                case 194717420:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50518) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i10;
                        i = ((iM11306 ^ i9) * (-13889)) ^ 1664524363;
                        i2 = 1515303554;
                        zM2315 = zM2315;
                        String str19 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str19;
                    }
                    break;
                case -722860748:
                case 1752641569:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM2319) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۘ᩶")) * 123;
                        i = ((iM11306 ^ i9) * 30641) ^ (-1968114482);
                        i2 = -1582086705;
                        zM2315 = zM2315;
                        String str110 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str110;
                    }
                    break;
                case -721049896:
                case 383842961:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50514) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str111 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str111;
                    }
                    break;
                case -620552976:
                case 1245159456:
                    zM2315 = zM2315;
                    zM2316 = AbstractC0464.m2315(strM2421, C0278.m1774(f68, 119, 12, i13));
                    iM11308 = C19806.m45029("ۧܺ") ^ i9;
                    i4 = ((iM11308 ^ i10) * (-9399)) ^ 115134278;
                    i5 = 1597911119;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -551696415:
                case 988461531:
                    zM2315 = zM2315;
                    zM50520 = C1460.m5058(strM2421, C2477.m7604(f68, 383, 21, i13));
                    iM11308 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i10;
                    i4 = ((iM11308 ^ i9) * (-22601)) ^ 1529637155;
                    i5 = 1333154027;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -530097095:
                case 1228412419:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent5 = new Intent(shortcutActivity, (Class<?>) ActivityC20904.class);
                    C1977.m6359(intent5, i7);
                    RunnableC1606.m5467(shortcutActivity, intent5);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -516613905:
                case -65674288:
                    str = strM2421;
                    zM2315 = zM2315;
                    zM7069 = C2332.m7069(strM2422);
                    iM11306 = (C19806.m45029("ᩴۙ") ^ i9) * 73;
                    i = ((iM11306 ^ i10) * (-22783)) ^ (-277412087);
                    i2 = -1294955508;
                    zM2315 = zM2315;
                    String str112 = str;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    strM2421 = str112;
                    break;
                case -499281721:
                case 803344385:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50515) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("۠ۜ")) * 89;
                        i = ((iM11306 ^ i10) * (-27689)) ^ (-721215654);
                        i2 = 506410795;
                        zM2315 = zM2315;
                        String str113 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str113;
                    }
                    break;
                case -475075063:
                case 1870550293:
                    zM2315 = zM2315;
                    zM50518 = C1460.m5058(strM2421, C3535.m10423(f68, 346, 19, i13));
                    iM11308 = (C19806.m45029("۫ۗ") ^ i10) * 5;
                    i4 = ((iM11308 ^ i9) * 14467) ^ 1428404048;
                    i5 = 2089308025;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -439330074:
                case 430659301:
                    try {
                        Intent intent6 = new Intent(shortcutActivity, cls);
                        C2871.m8643(intent6, i7);
                        C2871.m8643(intent6, i6);
                        try {
                            str = strM2421;
                            zM2315 = zM2315;
                            try {
                                intent6.setAction(C1398.m4892(f68, 452, 26, i13));
                                intent6.setData(Uri.fromFile(new File(strM2422)));
                                intent6.putExtra(CallableC1627.m5502(f68, 478, 8, i13), z);
                                RunnableC1606.m5467(shortcutActivity, intent6);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            str = strM2421;
                            zM2315 = zM2315;
                        }
                        strM2421 = str;
                    } catch (Exception unused4) {
                        zM2315 = zM2315;
                    }
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -426440281:
                case 1289158034:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent7 = new Intent(shortcutActivity, (Class<?>) ActivityC3541.class);
                    C2871.m8643(intent7, i7);
                    C2477.m7599(shortcutActivity, intent7);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case -391293637:
                case 1500782965:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM23113) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i9 - C19806.m45029("᩹֨")) * 45;
                        i = ((iM11306 ^ i10) * (-541)) ^ (-959783342);
                        i2 = 813911193;
                        zM2315 = zM2315;
                        String str114 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str114;
                    }
                    break;
                case -324070738:
                case 896765754:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM2317) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i10;
                        i = ((iM11306 ^ i9) * (-13889)) ^ 1664524363;
                        i2 = 1515303554;
                        zM2315 = zM2315;
                        String str115 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str115;
                    }
                    break;
                case -316758714:
                case 365466982:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM23112) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str116 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str116;
                    }
                    break;
                case -206650813:
                case 1293184685:
                    zM2315 = zM2315;
                    iM113010 = ThreadFactoryC3888.m11306(strM2421);
                    iM11308 = ThreadFactoryC3888.m11306("ܳۤ") ^ i10;
                    i4 = ((iM11308 ^ i9) * 31461) ^ (-1286627329);
                    i5 = -2063345561;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case -65799165:
                case 786091975:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM2315) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۗ") + i9) * (-37);
                        i = ((iM11306 ^ i10) * (-20071)) ^ 1088580165;
                        i2 = 897596950;
                        zM2315 = zM2315;
                        String str117 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str117;
                    }
                    break;
                case -25661131:
                case 169258992:
                    return;
                case -19863274:
                case 1046526290:
                    zM2315 = zM2315;
                    super.onCreate(bundle);
                    iM11307 = C19806.m45029("۬ᩴ") ^ i10;
                    i11 = ((iM11307 ^ i9) * (-29917)) ^ 1825305820;
                    i3 = -913587341;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case 67465852:
                case 625385051:
                    str = strM2421;
                    zM2315 = zM2315;
                    Intent intent8 = new Intent(shortcutActivity, (Class<?>) ViewOnClickListenerC4514.class);
                    C1977.m6359(intent8, i7);
                    C2477.m7599(shortcutActivity, intent8);
                    strM2421 = str;
                    iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                    i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                    i3 = 1528610606;
                    i12 = iM11307 ^ i3;
                    shortcutActivity = this;
                    zM2315 = zM2315;
                    break;
                case 263108565:
                case 1034580719:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM5059) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۧ") ^ i10) * 73;
                        i = ((iM11306 ^ i9) * (-1151)) ^ (-112723244);
                        i2 = -624420087;
                        zM2315 = zM2315;
                        String str118 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str118;
                    }
                    break;
                case 276136907:
                case 706829704:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM1433) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֨") ^ i10;
                        i = ((iM11306 ^ i9) * (-15895)) ^ 99086700;
                        i2 = 1701198536;
                        zM2315 = zM2315;
                        String str119 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str119;
                    } else {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    }
                    break;
                case 410248506:
                case 973099033:
                    zM2315 = zM2315;
                    zM50515 = C1460.m5058(strM2421, ThreadFactoryC3888.m11312(f68, 253, 14, i13));
                    iM11308 = C19806.m45029("֨ۚ") ^ i10;
                    i4 = ((iM11308 ^ i9) * (-21083)) ^ (-1630909569);
                    i5 = 233500717;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case 453189413:
                case 981895819:
                    zM2315 = zM2315;
                    zM2319 = AbstractC0464.m2315(strM2421, RunnableC0195.m1429(f68, 202, 13, i13));
                    iM11308 = C19806.m45029("ܺ۟") ^ i10;
                    i4 = ((iM11308 ^ i9) * 29669) ^ 143642959;
                    i5 = -2019557348;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case 471412400:
                case 1583424462:
                    zM2315 = zM2315;
                    zM50512 = C1460.m5058(strM2421, C19806.m45020(f68, 179, 17, i13));
                    iM11308 = (i10 - C19806.m45029("᩵ܺ")) * (-21);
                    i4 = ((iM11308 ^ i9) * (-3339)) ^ 333522489;
                    i5 = -946161018;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case 581951761:
                case 1690750581:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM2318) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("۠ۜ")) * 89;
                        i = ((iM11306 ^ i10) * (-27689)) ^ (-721215654);
                        i2 = 506410795;
                        zM2315 = zM2315;
                        String str1110 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str1110;
                    }
                    break;
                case 643622051:
                case 1106370914:
                    zM2315 = zM2315;
                    Intent intentM18982 = C7105.m18982(this);
                    try {
                        strM2421 = C0526.m2421(intentM18982, C2788.m8470(f68, 81, 9, i13));
                        strM2422 = C0526.m2421(intentM18982, C2124.m6685(f68, 90, 4, i13));
                        zM70610 = C2332.m7069(strM2421);
                        int iM113011 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i10;
                        i4 = ((iM113011 ^ i9) * 1103) ^ 1809556026;
                        i12 = iM113011 ^ 792703295;
                        shortcutActivity = this;
                        intent = intentM18982;
                        i11 = i4;
                    } catch (Exception unused5) {
                        intent = intentM18982;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                    }
                    zM2315 = zM2315;
                    break;
                case 747742879:
                case 1939695098:
                    str = strM2421;
                    zM2315 = zM2315;
                    zM1433 = RunnableC0195.m1432(strM2422);
                    iM11306 = (i10 - ThreadFactoryC3888.m11306("᩷۬")) * (-11);
                    i = ((iM11306 ^ i9) * 22893) ^ 1101142579;
                    i2 = -1582771564;
                    zM2315 = zM2315;
                    String str1111 = str;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    strM2421 = str1111;
                    break;
                case 1227375551:
                case 2127643650:
                    str = strM2421;
                    zM2315 = zM2315;
                    if (!zM50517) {
                        strM2421 = str;
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                        zM2315 = zM2315;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("۠ۜ")) * 89;
                        i = ((iM11306 ^ i10) * (-27689)) ^ (-721215654);
                        i2 = 506410795;
                        zM2315 = zM2315;
                        String str1112 = str;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        strM2421 = str1112;
                    }
                    break;
                case 1366859873:
                case 1923443763:
                    zM2315 = zM2315;
                    zM50519 = C1460.m5058(strM2421, RunnableC0195.m1429(f68, 365, 18, i13));
                    iM11308 = ThreadFactoryC3888.m11306("᩷ۤ") ^ i9;
                    i4 = ((iM11308 ^ i10) * (-10673)) ^ (-267520255);
                    i5 = 850837131;
                    i12 = iM11308 ^ i5;
                    i11 = i4;
                    zM2315 = zM2315;
                    break;
                case 1500951215:
                case 2001312766:
                    zM2315 = AbstractC0464.m2315(strM2421, C2477.m7604(f68, 94, 16, i13));
                    int iM113012 = ThreadFactoryC3888.m11306("ۙ֫") ^ i9;
                    i12 = iM113012 ^ 1014002846;
                    i11 = ((iM113012 ^ i10) * 10751) ^ (-1257521025);
                    break;
                case 1792338094:
                case 2071921199:
                    zM2315 = zM2315;
                    i6 = 67108864;
                    cls = ActivityC11632.class;
                    z = true;
                    i7 = 268435456;
                    switch (iM113010) {
                        case -2122614245:
                            iM11308 = (C19806.m45029("᩺ۜ") ^ i9) * (-31);
                            i4 = ((iM11308 ^ i10) * (-32487)) ^ 1056690876;
                            i5 = -316300414;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1912197360:
                            iM11308 = (ThreadFactoryC3888.m11306("ۛ᩻") ^ i10) * 45;
                            i4 = ((iM11308 ^ i9) * (-5945)) ^ (-1862604098);
                            i5 = -469711459;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1756800204:
                            iM11308 = (i9 - ThreadFactoryC3888.m11306("ܰۤ")) * 5;
                            i4 = ((iM11308 ^ i10) * (-4133)) ^ 94846325;
                            i5 = 451872343;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1510480482:
                            iM11308 = (C19806.m45029("۟ۛ") + i10) * 15;
                            i4 = ((iM11308 ^ i9) * (-3525)) ^ (-1946166507);
                            i5 = -1862981851;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1409195376:
                            iM11308 = (i9 - C19806.m45029("ۛܰ")) * 51;
                            i4 = ((iM11308 ^ i10) * 8637) ^ (-442452708);
                            i5 = -312090106;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1263242200:
                            iM11308 = (C19806.m45029("᩵֫") ^ i10) * (-123);
                            i4 = ((iM11308 ^ i9) * 30649) ^ (-1135525750);
                            i5 = -479697286;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1212308659:
                            iM11308 = C19806.m45029("۬ۖ") ^ i10;
                            i4 = ((iM11308 ^ i9) * (-29903)) ^ (-721519994);
                            i5 = 1360816311;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1119104947:
                            iM11308 = C19806.m45029("᩵ۖ") ^ i9;
                            i4 = ((iM11308 ^ i10) * (-21647)) ^ 1275712296;
                            i5 = -596032290;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -1097461934:
                            iM11308 = ThreadFactoryC3888.m11306("ۗ᩻") ^ i9;
                            i4 = ((iM11308 ^ i10) * (-7499)) ^ (-423967032);
                            i5 = 744320192;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -785778927:
                            iM11308 = (i10 - ThreadFactoryC3888.m11306("ۜᩳ")) * q.h;
                            i4 = ((iM11308 ^ i9) * (-6473)) ^ (-1934345424);
                            i5 = 15480344;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -667500459:
                            iM11308 = (C19806.m45029("۫ᩴ") ^ i9) * 123;
                            i4 = ((iM11308 ^ i10) * (-14401)) ^ 1734823771;
                            i5 = -711418151;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -593404262:
                            iM11308 = (ThreadFactoryC3888.m11306("ۗ۬") ^ i10) * (-49);
                            i4 = ((iM11308 ^ i9) * (-16597)) ^ (-663775905);
                            i5 = 1851508532;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -560080238:
                            iM11308 = ThreadFactoryC3888.m11306("᩸ۗ") ^ i9;
                            i4 = ((iM11308 ^ i10) * (-2545)) ^ (-1139755845);
                            i5 = -94356951;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -474293814:
                            iM11308 = ThreadFactoryC3888.m11306("ۜܺ") ^ i10;
                            i4 = ((iM11308 ^ i9) * 10551) ^ (-1506139594);
                            i5 = -479082484;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case -244759188:
                            iM11308 = ThreadFactoryC3888.m11306("ۧۢ") ^ i10;
                            i4 = ((iM11308 ^ i9) * 31739) ^ 1371914199;
                            i5 = 1452460278;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 3178851:
                            iM11308 = C19806.m45029("᩹۟") ^ i9;
                            i4 = ((iM11308 ^ i10) * (-16317)) ^ (-779217064);
                            i5 = 1133543695;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 24954378:
                            iM11308 = (i10 - ThreadFactoryC3888.m11306("ۘۚ")) * 83;
                            i4 = ((iM11308 ^ i9) * 7741) ^ (-1478514433);
                            i5 = 1748364536;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 35253639:
                            iM11308 = (ThreadFactoryC3888.m11306("֨ۛ") ^ i9) * (-39);
                            i4 = ((iM11308 ^ i10) * 31057) ^ (-430672534);
                            i5 = 75204399;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 588746739:
                            iM11308 = C19806.m45029("᩻ۘ") ^ i9;
                            i4 = ((iM11308 ^ i10) * 28357) ^ (-1091549202);
                            i5 = 139381810;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 594671580:
                            iM11308 = ThreadFactoryC3888.m11306("ܿܿ") ^ i10;
                            i4 = ((iM11308 ^ i9) * (-28535)) ^ 296863123;
                            i5 = -2136382419;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 1041335639:
                            iM11308 = C19806.m45029("ܰ᩷") ^ i9;
                            i4 = ((iM11308 ^ i10) * 26379) ^ (-2012624894);
                            i5 = -1860499383;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 1634302827:
                            iM11308 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * 15;
                            i4 = ((iM11308 ^ i9) * (-21765)) ^ 1349276573;
                            i5 = -763076917;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 1721154072:
                            iM11308 = C19806.m45029("ۗ۠") ^ i9;
                            i4 = ((iM11308 ^ i10) * (-2555)) ^ 506053958;
                            i5 = -1899979799;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 1841977966:
                            iM11308 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i10;
                            i4 = ((iM11308 ^ i9) * 22199) ^ 1767115787;
                            i5 = -606703943;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        case 2116182360:
                            iM11308 = (i10 - ThreadFactoryC3888.m11306("ۖܽ")) * 123;
                            i4 = ((iM11308 ^ i9) * (-13659)) ^ 309137111;
                            i5 = -1793825838;
                            i12 = iM11308 ^ i5;
                            i11 = i4;
                            break;
                        default:
                            iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                            i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                            i3 = 1528610606;
                            i12 = iM11307 ^ i3;
                            shortcutActivity = this;
                            break;
                    }
                    zM2315 = zM2315;
                    break;
                default:
                    zM2315 = zM2315;
                    try {
                        zM23114 = AbstractC0464.m2315(strM2421, C3743.m10964(f68, 404, 16, i13));
                        iM11308 = C19806.m45029("ۢۘ") ^ i9;
                        i4 = ((iM11308 ^ i10) * (-32483)) ^ (-971026544);
                        i5 = 962415289;
                        i12 = iM11308 ^ i5;
                        i11 = i4;
                    } catch (Exception unused6) {
                        iM11307 = (i9 - C19806.m45029("ܶۘ")) * (-91);
                        i11 = ((iM11307 ^ i10) * 23193) ^ 1954483889;
                        i3 = 1528610606;
                        i12 = iM11307 ^ i3;
                        shortcutActivity = this;
                    }
                    zM2315 = zM2315;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m139() {
        boolean zM29203 = false;
        int i = -1958418114;
        int i2 = C1668.f6641;
        int i3 = C1148.f5161;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۠")) * 123;
        int i4 = ((iM11306 ^ i2) * 24481) ^ 653333563;
        int i5 = -109938177;
        while (true) {
            i = ((((i ^ i2) * 15319) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1970214119:
                case -774834022:
                    if (C2788.f10625 < 0) {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ۟") + i3) * (-115);
                        i4 = ((iM11306 ^ i2) * 10557) ^ (-1028582220);
                        i5 = 1847559156;
                    }
                    break;
                case -1829814095:
                case 1893980862:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3827) ^ (-1560408934);
                        i5 = 501932605;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i2) * (-61);
                        i4 = ((iM11306 ^ i3) * (-12241)) ^ 1577055733;
                        i5 = -47756799;
                    }
                    break;
                case -1827969774:
                case -546870160:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    } else {
                        iM11306 = C19806.m45029("᩺۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21625)) ^ (-41282040);
                        i5 = -771662889;
                    }
                    break;
                case -1809092799:
                case 2042424841:
                    f67 = C2788.m8473(zM29203);
                    iM11306 = (C19806.m45029("ܿ֨") ^ i3) * 77;
                    i4 = ((iM11306 ^ i2) * (-16355)) ^ (-1215562864);
                    i5 = -1235849146;
                    break;
                case -1734279621:
                case -466037681:
                    RunnableC1895.m6170();
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3827) ^ (-1560408934);
                        i5 = 501932605;
                    } else {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    }
                    break;
                case -1705678447:
                case 645549791:
                    zM29203 = C11692.m29203(C0050.m939());
                    if (C0671.f2816 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨֡") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * 12725) ^ (-1322104339);
                        i5 = -1736191995;
                    } else {
                        iM11306 = (C19806.m45029("ۧܿ") ^ i2) * 35;
                        i4 = ((iM11306 ^ i3) * (-4971)) ^ 802020669;
                        i5 = 324687260;
                    }
                    break;
                case -1691567033:
                case 1230878454:
                    C2477.m7593();
                    C1419.m4973();
                    iM11306 = (ThreadFactoryC3888.m11306("ۤ۟") + i3) * (-115);
                    i4 = ((iM11306 ^ i2) * 10557) ^ (-1028582220);
                    i5 = 1847559156;
                    break;
                case -1548322747:
                case -1168854213:
                    if (f67 == null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * 743) ^ 195058107;
                        i5 = 50232245;
                    } else {
                        iM11306 = (C19806.m45029("ܿ֨") ^ i3) * 77;
                        i4 = ((iM11306 ^ i2) * (-16355)) ^ (-1215562864);
                        i5 = -1235849146;
                    }
                    break;
                case -1486019299:
                case 1598275738:
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ۜ᩵") ^ i2) * 45;
                        i4 = ((iM11306 ^ i3) * 11723) ^ 1296132190;
                        i5 = 1478355958;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۠") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * 14881) ^ (-806037218);
                        i5 = 7613184;
                    }
                    break;
                case -1295925706:
                case -636160905:
                    if (C3577.m10565()) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30609) ^ 1891674665;
                        i5 = 1902425544;
                    } else {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    }
                    break;
                case -925797275:
                case -126913160:
                    C1148.m4232();
                    if (C1066.f4915 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨֡") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * 12725) ^ (-1322104339);
                        i5 = -1736191995;
                    } else {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    }
                    break;
                case -870955506:
                case 548755627:
                    C1461.m5080();
                    return false;
                case -547814640:
                case 62005573:
                    return ViewTreeObserverOnPreDrawListenerC3327.m9873(f67);
                case -434198434:
                case -265550474:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ܽۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11739) ^ 1511177744;
                        i5 = 207009683;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15393)) ^ (-940538488);
                        i5 = 1472169704;
                    }
                    break;
                case 449584124:
                case 852932303:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("۬᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22779)) ^ 1823082196;
                        i5 = 806828173;
                    } else {
                        iM11306 = (C19806.m45029("ۜ᩵") ^ i2) * 45;
                        i4 = ((iM11306 ^ i3) * 11723) ^ 1296132190;
                        i5 = 1478355958;
                    }
                    break;
                case 671883286:
                case 1063389409:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ۟") + i3) * (-115);
                        i4 = ((iM11306 ^ i2) * 10557) ^ (-1028582220);
                        i5 = 1847559156;
                    } else {
                        iM11306 = C19806.m45029("ۜ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2637)) ^ (-13229229);
                        i5 = -312686822;
                    }
                    break;
                case 977355630:
                case 1165528301:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ۜ᩵") ^ i2) * 45;
                        i4 = ((iM11306 ^ i3) * 11723) ^ 1296132190;
                        i5 = 1478355958;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۚ") ^ i3) * 115;
                        i4 = ((iM11306 ^ i2) * 30689) ^ (-565136750);
                        i5 = -2044006437;
                    }
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3827) ^ (-1560408934);
                        i5 = 501932605;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩷") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * 12419) ^ (-886416780);
                        i5 = 75759935;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01f2 A[PHI: r9 r13
      0x01f2: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:59:0x01f0, B:55:0x01d3, B:39:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:59:0x01f0, B:55:0x01d3, B:39:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0228 A[PHI: r1 r6
      0x0228: PHI (r1v2 short[]) = (r1v1 short[]), (r1v1 short[]), (r1v3 short[]) binds: [B:64:0x0226, B:62:0x021d, B:22:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r6v4 l.᩷۠ۚ) = (r6v3 l.᩷۠ۚ), (r6v3 l.᩷۠ۚ), (r6v5 l.᩷۠ۚ) binds: [B:64:0x0226, B:62:0x021d, B:22:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x023b A[PHI: r0 r7
      0x023b: PHI (r0v9 short[]) = (r0v3 short[]), (r0v3 short[]), (r0v7 short[]), (r0v3 short[]) binds: [B:64:0x0226, B:30:0x00f4, B:26:0x00d8, B:13:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r7v4 char) = (r7v1 char), (r7v1 char), (r7v2 char), (r7v1 char) binds: [B:64:0x0226, B:30:0x00f4, B:26:0x00d8, B:13:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025c A[PHI: r10 r15
      0x025c: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:51:0x01b5, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r15v2 int) = (r15v1 int), (r15v4 int) binds: [B:51:0x01b5, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (l.C1668.f6641 >= 0) goto L66;
     */
    static {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.plus.ShortcutActivity.<clinit>():void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m141(String str) throws Throwable {
        int iM11306;
        int i;
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20745M5585 = null;
        Bitmap bitmap = null;
        BufferedInputStream bufferedInputStreamM46719 = null;
        Bitmap bitmapDecodeStream = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = -1263743448;
        int i3 = C1419.f5860;
        int i4 = C1025.f4800;
        int iM11307 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i3;
        int i5 = ((iM11307 ^ i4) * (-2643)) ^ (-1351656447);
        int i6 = 775118258;
        while (true) {
            int i7 = iM11307 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 27503) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2021162932:
                    case -1789387675:
                    case -171970866:
                    case 1727998300:
                        return bitmap;
                    case -1981202072:
                    case -998258636:
                        if (C1460.m5050() == 0) {
                            iM11307 = (i4 - ThreadFactoryC3888.m11306("ۜܽ")) * (-71);
                            i5 = ((iM11307 ^ i3) * (-31601)) ^ 471030344;
                            i6 = 730327022;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-25897)) ^ 1409790923;
                        i6 = 638893197;
                        break;
                    case -1885128066:
                    case 1705372262:
                        ThreadFactoryC3888.m11300();
                        C2477.m7593();
                        iM11307 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 13073) ^ 1980535523;
                        i6 = -1581220729;
                        break;
                    case -1818451131:
                    case 547824810:
                        try {
                            bufferedInputStreamM46719.close();
                            iM11307 = (i4 - ThreadFactoryC3888.m11306("᩹᩷")) * 47;
                            i5 = ((iM11307 ^ i3) * (-6059)) ^ 441858128;
                            i6 = 1526657600;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iM11307 = (ThreadFactoryC3888.m11306("ۗۤ") + i3) * (-33);
                            i5 = ((iM11307 ^ i4) * (-4937)) ^ 1780918480;
                            i6 = -2086231150;
                        }
                        break;
                    case -1624501131:
                    case -1168843783:
                        abstractC20745M5585 = C1668.m5585(abstractC20745, str);
                        if (C3577.f13150 < 0) {
                            iM11307 = (C19806.m45029("᩻᩷") + i4) * 81;
                            i5 = ((iM11307 ^ i3) * 8481) ^ (-1112821300);
                            i6 = 413530452;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-25897)) ^ 1409790923;
                        i6 = 638893197;
                        break;
                        break;
                    case -1385474588:
                    case 895873552:
                        if (C1875.f7103 < 0) {
                            iM11307 = C19806.m45029("᩷᩸") ^ i4;
                            i5 = ((iM11307 ^ i3) * 10233) ^ 1202921311;
                            i6 = 426928167;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۨۘ") ^ i3;
                        i5 = ((iM11307 ^ i4) * 691) ^ (-156006321);
                        i6 = -218897441;
                        break;
                    case -1268748765:
                    case 1137103553:
                        return bitmapDecodeStream;
                    case -1215860683:
                    case 1543764592:
                        if (!RunnableC1564.f6300) {
                            iM11307 = (i3 - ThreadFactoryC3888.m11306("۠ۚ")) * (-55);
                            i5 = ((iM11307 ^ i4) * 7585) ^ 1503636226;
                            i6 = -412267330;
                            break;
                        }
                        iM11307 = (C19806.m45029("ۤ᩹") ^ i4) * (-85);
                        i5 = ((iM11307 ^ i3) * 22721) ^ (-486747366);
                        i6 = -1587217723;
                        break;
                    case -1121280954:
                    case 461222328:
                        if (C2249.f8050 < 0) {
                            iM11307 = C19806.m45029("֫֡") ^ i4;
                            i5 = ((iM11307 ^ i3) * 10619) ^ 1065360279;
                            i6 = -1321394717;
                            break;
                        }
                        iM11307 = (C19806.m45029("ܿۘ") + i4) * 19;
                        i5 = ((iM11307 ^ i3) * 6823) ^ 2020043318;
                        i6 = -219847898;
                        break;
                    case -910110199:
                    case 1190262242:
                        if (C2871.f10837 < 0) {
                            iM11307 = C19806.m45029("ܿ᩶") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-24775)) ^ (-250324555);
                            i6 = -1773790596;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-25897)) ^ 1409790923;
                        i6 = 638893197;
                        break;
                        break;
                    case -891768122:
                    case 183408959:
                        throw th;
                    case -843458655:
                    case -169595605:
                        try {
                            C0629.m2911(th, th2);
                            iM11307 = (i4 - ThreadFactoryC3888.m11306("᩹᩷")) * 47;
                            i5 = ((iM11307 ^ i3) * (-6059)) ^ 441858128;
                            i6 = 1526657600;
                        } catch (Exception unused) {
                            iM11307 = ThreadFactoryC3888.m11306("۬֡") ^ i3;
                            i5 = ((iM11307 ^ i4) * 26203) ^ (-1064822229);
                            i6 = 538917761;
                        }
                        break;
                    case -545206381:
                    case -39815874:
                        if (C1398.m4895() > 0) {
                            iM11307 = C19806.m45029("ۗܳ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 30843) ^ 1547007071;
                            i6 = 1878264255;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۨۘ") ^ i3;
                        i5 = ((iM11307 ^ i4) * 691) ^ (-156006321);
                        i6 = -218897441;
                        break;
                        break;
                    case -393398953:
                    case 694025850:
                        C0629.m2907();
                        if (C1977.f7413 <= 0) {
                            iM11307 = (C19806.m45029("ۤ᩹") ^ i4) * (-85);
                            i5 = ((iM11307 ^ i3) * 22721) ^ (-486747366);
                            i6 = -1587217723;
                            break;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 13073) ^ 1980535523;
                        i6 = -1581220729;
                        break;
                        break;
                    case -156891615:
                    case 1840017744:
                        if (!C19806.f63586) {
                            iM11307 = (C19806.m45029("ܿۘ") + i4) * 19;
                            i5 = ((iM11307 ^ i3) * 6823) ^ 2020043318;
                            i6 = -219847898;
                            break;
                            break;
                        }
                        iM11307 = (C19806.m45029("֨ۧ") + i3) * 69;
                        i5 = ((iM11307 ^ i4) * (-26917)) ^ (-184997813);
                        i6 = 2094963082;
                        break;
                    case 301951183:
                    case 1716940546:
                        if (ViewTreeObserverOnPreDrawListenerC3327.m9876(abstractC20745M5585)) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۙ") ^ i3) * 77;
                            i5 = ((iM11306 ^ i4) * 2123) ^ 1155805606;
                            i = 1567241083;
                        } else {
                            iM11306 = (C19806.m45029("᩻ۚ") + i4) * 25;
                            i5 = ((iM11306 ^ i3) * (-29621)) ^ 1512912156;
                            i = 122590338;
                        }
                        i7 = iM11306 ^ i;
                        bitmap = null;
                        break;
                    case 341678427:
                    case 1724301221:
                        if (C0671.f2816 != 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ۨۘ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 691) ^ (-156006321);
                            i6 = -218897441;
                            break;
                            break;
                        }
                        iM11307 = (C19806.m45029("ܿۘ") + i4) * 19;
                        i5 = ((iM11307 ^ i3) * 6823) ^ 2020043318;
                        i6 = -219847898;
                        break;
                        break;
                    case 348878702:
                    case 1903342568:
                        C3722.m10894();
                        C0216.m1591();
                        return null;
                    case 473141023:
                    case 1501895840:
                        bufferedInputStreamM46719 = abstractC20745M5585.m46719();
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM46719);
                            bufferedInputStreamM46719.close();
                            iM11307 = (ThreadFactoryC3888.m11306("ۧ᩹") + i4) * 43;
                            i5 = ((iM11307 ^ i3) * (-18999)) ^ 433193531;
                            i6 = 1305105194;
                        } catch (Throwable th4) {
                            th = th4;
                            iM11307 = C19806.m45029("ܰۧ") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-13685)) ^ (-1777591559);
                            i6 = -184039321;
                        }
                        break;
                    case 531999158:
                    case 1139206161:
                        if (C0629.f2722 > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܳۚ") ^ i4;
                            i5 = ((iM11307 ^ i3) * 23977) ^ 1692301511;
                            i6 = -1934432072;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 13073) ^ 1980535523;
                        i6 = -1581220729;
                        break;
                        break;
                    case 659764821:
                    case 2094822181:
                        if (C1025.f4800 < 0) {
                            iM11307 = (C19806.m45029("ܿۘ") + i4) * 19;
                            i5 = ((iM11307 ^ i3) * 6823) ^ 2020043318;
                            i6 = -219847898;
                            break;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 13073) ^ 1980535523;
                        i6 = -1581220729;
                        break;
                        break;
                    case 1636588666:
                    case 1844848636:
                        if (C0278.m1789() > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-1073)) ^ (-1908710143);
                            i6 = 299841768;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 13073) ^ 1980535523;
                        i6 = -1581220729;
                        break;
                        break;
                    default:
                        abstractC20745 = f66;
                        if (!C1668.m5583()) {
                            iM11307 = (C19806.m45029("ۤ᩹") ^ i4) * (-85);
                            i5 = ((iM11307 ^ i3) * 22721) ^ (-486747366);
                            i6 = -1587217723;
                            break;
                            break;
                        }
                        iM11307 = (ThreadFactoryC3888.m11306("᩹֡") ^ i3) * (-21);
                        i5 = ((iM11307 ^ i4) * (-4979)) ^ 64198507;
                        i6 = -994684768;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m137(String str, Bitmap bitmap) throws Throwable {
        BufferedOutputStream bufferedOutputStreamM46708 = null;
        Throwable th = null;
        Object th2 = null;
        int i = -424779291;
        int i2 = RunnableC0195.f1321;
        int i3 = C3722.f13525;
        int iM45029 = C19806.m45029("ۨۜ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-24967)) ^ (-1732570779);
        int i5 = -1263542831;
        while (true) {
            i = ((((i ^ i3) * 31015) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2130694963:
                case 1847886555:
                    AbstractC20745 abstractC20745 = f66;
                    ViewTreeObserverOnPreDrawListenerC3327.m9871(abstractC20745);
                    bufferedOutputStreamM46708 = C1668.m5585(abstractC20745, str).m46708();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStreamM46708);
                        C3286.m9794(bufferedOutputStreamM46708);
                        iM45029 = C19806.m45029("ۖۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23875)) ^ (-196985639);
                        i5 = -837867399;
                    } catch (Throwable th3) {
                        th = th3;
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۢ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 24635) ^ 639984494;
                        i5 = -41252419;
                    }
                    break;
                case -1953032997:
                case 1659178780:
                    if (C2642.m8171() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-26699)) ^ (-2114890134);
                        i5 = -1249305524;
                    } else {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                        i5 = -1366082828;
                    }
                    break;
                case -1947348683:
                case 217311480:
                    C1066.m4023();
                    C3577.m10565();
                    return;
                case -1818527221:
                case -344865432:
                    return;
                case -1767378938:
                case 393926518:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                        i5 = -1366082828;
                    } else {
                        iM45029 = C19806.m45029("ܿۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12975)) ^ 1787254753;
                        i5 = -1933547660;
                    }
                    break;
                case -1715928641:
                case 1850256143:
                    C10634.m26820();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("ۡۘ") ^ i2) * (-71);
                        i4 = ((iM45029 ^ i3) * 18687) ^ 1566406885;
                        i5 = -1746916761;
                    } else {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11841)) ^ 9549297;
                        i5 = 999930390;
                    }
                    break;
                case -1598071548:
                case 1272445012:
                    RunnableC1564.m5345();
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11841)) ^ 9549297;
                        i5 = 999930390;
                    } else {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                        i5 = -1366082828;
                    }
                    break;
                case -1557353940:
                case 1621176346:
                    RunnableC1606.m5473();
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19653) ^ (-1897049884);
                        i5 = -1360411569;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24519) ^ 970691642;
                        i5 = -2068062207;
                    }
                    break;
                case -1525323502:
                case 63528425:
                    if (RunnableC3388.m10064()) {
                        iM45029 = (C19806.m45029("֫ۜ") + i2) * 85;
                        i4 = ((iM45029 ^ i3) * 23445) ^ 2088000785;
                        i5 = -1674258836;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24519) ^ 970691642;
                        i5 = -2068062207;
                    }
                    break;
                case -1508939551:
                case -263036914:
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-26699)) ^ (-2114890134);
                        i5 = -1249305524;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤܶ")) * 109;
                        i4 = ((iM45029 ^ i3) * (-4669)) ^ (-1819649257);
                        i5 = -1285198402;
                    }
                    break;
                case -1447119061:
                case 1255236870:
                    if (C1668.m5583()) {
                        iM45029 = (C19806.m45029("ۖۙ") ^ i2) * (-45);
                        i4 = ((iM45029 ^ i3) * (-31711)) ^ 590853614;
                        i5 = 1975911310;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19653) ^ (-1897049884);
                        i5 = -1360411569;
                    }
                    break;
                case -1317219954:
                case 1271552496:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19653) ^ (-1897049884);
                        i5 = -1360411569;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5705) ^ (-1448361788);
                        i5 = -398531908;
                    }
                    break;
                case -985597813:
                case 909526954:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۖ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1703) ^ 720605485;
                        i5 = -1127747593;
                    } else {
                        iM45029 = C19806.m45029("۬᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2003) ^ 1129744176;
                        i5 = -1535186404;
                    }
                    break;
                case -957076366:
                case 246924912:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24519) ^ 970691642;
                        i5 = -2068062207;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۤ") + i3) * 83;
                        i4 = ((iM45029 ^ i2) * 17613) ^ (-203620617);
                        i5 = -1960885318;
                    }
                    break;
                case -887936860:
                case 403311939:
                    if (C1419.f5860 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19653) ^ (-1897049884);
                        i5 = -1360411569;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֨") ^ i2) * (-107);
                        i4 = ((iM45029 ^ i3) * 13219) ^ 1225778982;
                        i5 = 1124592420;
                    }
                    break;
                case -831290343:
                case -138664625:
                    try {
                        C3286.m9794(bufferedOutputStreamM46708);
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24927)) ^ 2130805967;
                        i5 = -329311152;
                    } catch (Throwable th4) {
                        th2 = th4;
                        iM45029 = C19806.m45029("ۛ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1773)) ^ 1756533060;
                        i5 = 174322186;
                    }
                    break;
                case -100134440:
                case 1997620943:
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                        i5 = -1366082828;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۘ᩻")) * 11;
                        i4 = ((iM45029 ^ i2) * 3481) ^ 974844337;
                        i5 = 1815102803;
                    }
                    break;
                case -81052478:
                case 1273746154:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-26699)) ^ (-2114890134);
                        i5 = -1249305524;
                    } else {
                        iM45029 = (C19806.m45029("ۖܳ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * 11157) ^ (-1480271673);
                        i5 = -1432254474;
                    }
                    break;
                case 379812933:
                case 1334449074:
                    throw th;
                case 387885450:
                case 518476188:
                    if (C1025.f4800 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24519) ^ 970691642;
                        i5 = -2068062207;
                    } else {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                        i5 = -1366082828;
                    }
                    break;
                case 661458386:
                case 1218202135:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C0278.m1789();
                    iM45029 = C19806.m45029("ۡۜ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 3785) ^ (-1630573969);
                    i5 = -1366082828;
                    break;
                case 669920890:
                case 1179306302:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("ۡۘ") ^ i2) * (-71);
                        i4 = ((iM45029 ^ i3) * 18687) ^ 1566406885;
                        i5 = -1746916761;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27543) ^ 393920823;
                        i5 = 1857323452;
                    }
                    break;
                case 874236596:
                case 1885590808:
                    return;
                case 953169313:
                case 1925928531:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11841)) ^ 9549297;
                        i5 = 999930390;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") ^ i2) * 25;
                        i4 = ((iM45029 ^ i3) * 14551) ^ (-1035137387);
                        i5 = -906473188;
                    }
                    break;
                default:
                    try {
                        C0629.m2911(th, th2);
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24927)) ^ 2130805967;
                        i5 = -329311152;
                    } catch (Exception unused) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۛܳ")) * 77;
                        i4 = ((iM45029 ^ i2) * 23487) ^ (-2070651141);
                        i5 = 920085282;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m140(String str) {
        RunnableC3388.m10052(C1668.m5585(f66, str));
    }
}
