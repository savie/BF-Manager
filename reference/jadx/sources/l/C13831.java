package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۬ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13831 extends AbstractC9051 implements InterfaceC16837 {

    /* JADX INFO: renamed from: ᩺ۙ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f43901 = {1551, -9037, 2620, -537, -29844, -29844, -29844, -29844, -29844, -29844, -29839, -29844, -29844, -29844, -29844, -29839, -29844, -29844, -29844, -29844, -29839, -29844, -29844, -29844, -29844, -29839, -29844, -29844, -29844, -29844, -29844, -29844, -29844, -29844, -29844, -29844, -29844, -29844, 9952, -15905, -15936, -15932, -15889, -15916, -15915, -15928, -15889, -15930, -15915, -15934, -15933, -15911, -15905, -15906, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15933, -15905, -15931, -15934, -15917, -15915, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15908, -15911, -15906, -15915, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15936, -15919, -15934, -15919, -15907, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15936, -15934, -15905, -15908, -15905, -15913, -15931, -15915, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15908, -15905, -15917, -15919, -15908, -15905, -15936, -15932, -15889, -15934, -15907, -15889, -15919, -15936, -15911, -15889, -15907, -15905, -15916, -15936, -15933, -15934, -15911, 3458, -21309, 27764, -18430, -20926, 22093, 17360, -20217, 18417, 17753, -19098, 18289, -17636, 24497, 19780, -16878, -23422, 22304, 20702, -20716, 16938, 25777, 2219, 22505, -27287, 27654, 2430, -12048, 8409, -1623, -14663, -1507, -13924, 10309, 15933, -3410, 8010, 23095, -22534, -19109, 6403, -32324, 18610, 32495, -30565, -26044, -26961, 19350, 18337, 32446, -30657, -27571, -29629, 18353, 29984, 18604, 28564, 18428, -30229, 17885, 32212, -31485, -28278, 27163, 26383, -31889, -25658, 32221, 29484, -26740, 31524, 27308, -27121, -25939, -28496, 32609, -30420, 18772, -26418, 28904, 19405, -25956, -28610, 30829, 30035, -29973, 25850, 27454, 26127, -26404, 20831, -25251, 29646, 29622, -31995, 8142, 8143, 8146, 8074, 8090, 8094, 8090, 8142, 8143, 8146, 8074, 8090, 8094, 8091, 8142, 8143, 8146, 8074, 8090, 8089, 8095, 8142, 8143, 8146, 8074, 8090, 8089, 8093, 8142, 8143, 8146, 8074, 8090, 8089, 8082, 8142, 8143, 8146, 8074, 8090, 8089, 8083, 8133, 8154, 8158, 8181, 8142, 8143, 8146, 8181, 8156, 8143, 8152, 8153, 8131, 8133, 8132, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8153, 8133, 8159, 8152, 8137, 8143, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8134, 8131, 8132, 8143, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8154, 8139, 8152, 8139, 8135, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8154, 8152, 8133, 8134, 8133, 8141, 8159, 8143, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8134, 8133, 8137, 8139, 8134, 8133, 8154, 8158, 8181, 8130, 8139, 8153, 8181, 8139, 8154, 8131, 8181, 8135, 8133, 8142, 8133, 8154, 8158, 8181, 8152, 8135, 8181, 8139, 8154, 8131, 8181, 8135, 8133, 8142, 8154, 8153, 8152, 8131, -32381, 30311, 16527, 19190, 28022, 30414, 4471, 7147, -1035, 12766, 3196, 11207, -12685, -15228, -11337, -10557, 13340, 8197, 10180, 10187, 10177, 10199, 10186, 10188, 10177, 10143, 10198, 10194, 10188, 10193, 10182, 10189, 10176, 10199, 10143, 10143, 8619, 9037, 16017, 1867, 3503, -7597, -2985, -6868, 5484, -6334, 14268, -7861};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC21091 f43902;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22761 f43903;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20283 f43904;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C15179 f43905;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f43906;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public MenuItem f43907;

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo24168() {
        return true;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    public final String mo1443() {
        return null;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo1446() {
        return false;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9150() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011a A[PHI: r7
      0x011a: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:39:0x0118, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x014f A[PHI: r5 r6 r16
      0x014f: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:43:0x014d, B:20:0x006a, B:11:0x0049, B:8:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:43:0x014d, B:20:0x006a, B:11:0x0049, B:8:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v2 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:43:0x014d, B:20:0x006a, B:11:0x0049, B:8:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a5 A[PHI: r2 r3 r4 r9 r10
      0x01a5: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:51:0x01a3, B:47:0x0185, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:51:0x01a3, B:47:0x0185, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:51:0x01a3, B:47:0x0185, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:51:0x01a3, B:47:0x0185, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:51:0x01a3, B:47:0x0185, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ee A[PHI: r11
      0x01ee: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:59:0x01ec, B:55:0x01d1, B:24:0x0086, B:16:0x0053, B:14:0x004f, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x021f A[PHI: r1
      0x021f: PHI (r1v5 short[]) = (r1v3 short[]), (r1v1 short[]) binds: [B:63:0x021d, B:8:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ */
    public final int mo1444() {
        int iM3169;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -73786952;
        int i10 = C0269.f1558;
        int i11 = C2966.f9654;
        int iM31610 = (C0773.m3169("֡ۤ") ^ i11) * (-19);
        int i12 = ((iM31610 ^ i10) * 30965) ^ (-2078436578);
        int i13 = iM31610 ^ (-1778337897);
        String strM2049 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * (-31923)) >> 31));
            switch (i9) {
                case -1827584536:
                case -89167685:
                    i6 = 38192;
                    iM3169 = C0773.m3169("ۗۖ") ^ i11;
                    i = ((iM3169 ^ i10) * 4373) ^ 2044537440;
                    i2 = 1365239626;
                    int i14 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i14;
                    break;
                case -1679105845:
                case 1253544465:
                    C13473.m33144();
                    if (C13473.f42873 != 0) {
                        iM3169 = (i11 - C0619.m2761("ܰᩴ")) * (-33);
                        i = ((iM3169 ^ i10) * (-27557)) ^ (-343144530);
                        i2 = 176698497;
                    } else {
                        iM3169 = (C0773.m3169("֡۬") + i10) * 3;
                        i = ((iM3169 ^ i11) * 25717) ^ 1586324688;
                        i2 = 1529366313;
                    }
                    int i15 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i15;
                    break;
                case -1610644476:
                case -1248880864:
                    if (C3998.f13671 == 0) {
                        iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                        i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                        i2 = 1024502921;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i10;
                        i = ((iM3169 ^ i11) * (-7629)) ^ (-2105342215);
                        i2 = 1594548948;
                    }
                    int i16 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i16;
                    break;
                case -1520884421:
                case 1084109308:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                        i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                        i2 = 1024502921;
                    } else {
                        iM3169 = (C0619.m2761("ۗᩴ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i10) * (-31077)) ^ 1445911532;
                        i2 = -482877514;
                    }
                    int i17 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i17;
                    break;
                case -1403549459:
                case 661613970:
                    if ((i4 + i5) - i3 >= 0) {
                        iM3169 = (C0773.m3169("ᩳ۟") ^ i10) * 123;
                        i = ((iM3169 ^ i11) * (-6971)) ^ (-591259655);
                        i2 = 627342985;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩵") ^ i10) * (-67);
                        i = ((iM3169 ^ i11) * 6323) ^ (-1063054543);
                        i2 = 333262768;
                    }
                    int i18 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i18;
                    break;
                case -1287041584:
                case 1404510232:
                    i6 = 18660;
                    iM3169 = C0773.m3169("ۗۖ") ^ i11;
                    i = ((iM3169 ^ i10) * 4373) ^ 2044537440;
                    i2 = 1365239626;
                    int i19 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i19;
                    break;
                case -1066893913:
                case -542356011:
                    s = sArr[c];
                    s2 = 3574;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i11;
                        i = ((iM3169 ^ i10) * 3759) ^ 38148469;
                        i2 = -676808433;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۚ") + i10) * 9;
                        i = ((iM3169 ^ i11) * (-5967)) ^ (-2083225763);
                        i2 = -12843775;
                    }
                    int i110 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i110;
                    break;
                case -1062595657:
                case 803516642:
                    sArr = f43901;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("֡۬") + i10) * 3;
                        i = ((iM3169 ^ i11) * 25717) ^ 1586324688;
                        i2 = 1529366313;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩷") ^ i11) * 99;
                        i = ((iM3169 ^ i10) * 23323) ^ (-482021890);
                        i2 = 226602732;
                    }
                    int i111 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i111;
                    break;
                case -956819518:
                case 1486179477:
                    i5 = 3193369;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("۟᩻") ^ i10;
                        i = ((iM3169 ^ i11) * (-7629)) ^ (-2105342215);
                        i2 = 1594548948;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ۨۢ")) * (-97);
                        i = ((iM3169 ^ i10) * 25459) ^ (-143646809);
                        i2 = 1344710213;
                    }
                    int i112 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i112;
                    break;
                case -868157354:
                case 651334665:
                    sArr2 = f43901;
                    i7 = 424;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i11;
                        i = ((iM3169 ^ i10) * 3759) ^ 38148469;
                        i2 = -676808433;
                    } else {
                        iM3169 = C0773.m3169("᩷ۗ") ^ i11;
                        i = ((iM3169 ^ i10) * 26989) ^ (-448927138);
                        i2 = -1532344728;
                    }
                    int i113 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i113;
                    break;
                case -829410680:
                case -166596977:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                        i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                        i2 = 1024502921;
                    } else {
                        iM3169 = C0619.m2761("ۛܿ") ^ i10;
                        i = ((iM3169 ^ i11) * 13913) ^ 112179871;
                        i2 = -1977653536;
                    }
                    int i114 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i114;
                    break;
                case -688017481:
                case 779076838:
                    C1783.m6232();
                    if (C3033.f9831 >= 0) {
                        iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                        i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                        i2 = 1024502921;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ܰᩴ")) * (-33);
                        i = ((iM3169 ^ i10) * (-27557)) ^ (-343144530);
                        i2 = 176698497;
                    }
                    int i115 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i115;
                    break;
                case -669450535:
                case 968276203:
                    i8 = 3;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                        i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                        i2 = 1024502921;
                    } else {
                        iM3169 = (C0619.m2761("ܰܶ") ^ i10) * 97;
                        i = ((iM3169 ^ i11) * 26583) ^ (-1589357792);
                        i2 = -593054808;
                    }
                    int i116 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i116;
                    break;
                case -172619833:
                case 890467537:
                    strM2049 = RunnableC0334.m2049(sArr2, i7, i8, i6);
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i11 - C0619.m2761("ܰᩴ")) * (-33);
                        i = ((iM3169 ^ i10) * (-27557)) ^ (-343144530);
                        i2 = 176698497;
                    } else {
                        iM3169 = C0619.m2761("ܽܳ") ^ i11;
                        i = ((iM3169 ^ i10) * 20809) ^ 377946689;
                        i2 = -447235803;
                    }
                    int i117 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i117;
                    break;
                case -165656914:
                case 1884067255:
                    C3492.m11488();
                    C2354.m7983();
                    iM3169 = (i10 - C0773.m3169("֡ۡ")) * 65;
                    i = ((iM3169 ^ i11) * (-30735)) ^ 286466423;
                    i2 = 1024502921;
                    int i118 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i118;
                    break;
                case 43989223:
                case 1328584668:
                    c = 423;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i11;
                        i = ((iM3169 ^ i10) * 3759) ^ 38148469;
                        i2 = -676808433;
                    } else {
                        iM3169 = C0619.m2761("֨᩻") ^ i10;
                        i = ((iM3169 ^ i11) * 22775) ^ (-1063833077);
                        i2 = -253092839;
                    }
                    int i119 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i119;
                    break;
                case 1306287983:
                case 1453619151:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i11 - C0619.m2761("ܰᩴ")) * (-33);
                        i = ((iM3169 ^ i10) * (-27557)) ^ (-343144530);
                        i2 = 176698497;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩹ۜ")) * (-47);
                        i = ((iM3169 ^ i10) * (-7649)) ^ 290519254;
                        i2 = -516257406;
                    }
                    int i1110 = i;
                    i13 = iM3169 ^ i2;
                    i12 = i1110;
                    break;
                case 1363677227:
                case 2018024304:
                    return C0773.m3169(strM2049) ^ 2126800007;
                default:
                    C2702.m8876();
                    return 0;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33760(C13831 c13831) {
        int i = -1179260888;
        int i2 = C2834.f9334;
        int i3 = C1826.f6190;
        int iM2761 = (i3 - C0619.m2761("᩶ܳ")) * (-33);
        int i4 = ((iM2761 ^ i2) * 28953) ^ 883094036;
        int i5 = 423617684;
        while (true) {
            i = ((((i ^ i2) * 16227) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2109886432:
                case -1843960852:
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0773.m3169("֡۠") + i2) * (-117);
                        i4 = ((iM2761 ^ i3) * 24221) ^ (-1790620647);
                        i5 = -2024815389;
                    } else {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    }
                    break;
                case -2034365465:
                case 1701520198:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    } else {
                        iM2761 = C0619.m2761("ܿۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3523)) ^ (-485884043);
                        i5 = -1866331146;
                    }
                    break;
                case -1666255958:
                case -353191342:
                    C1146.m4231();
                    C1146.m4231();
                    break;
                case -1575083453:
                case -1420871194:
                    c13831.m33766();
                    iM2761 = C0773.m3169("᩷᩶") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-16307)) ^ 443322679;
                    i5 = -1414542582;
                    break;
                case -817252814:
                case -461354291:
                    break;
                case -626244384:
                case 882901643:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    } else {
                        iM2761 = (C0773.m3169("ۨ۠") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 6913) ^ (-707912857);
                        i5 = 46200371;
                    }
                    break;
                case -577780175:
                case -207265047:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    } else {
                        iM2761 = (C0773.m3169("ۡۙ") ^ i2) * 89;
                        i4 = ((iM2761 ^ i3) * 7515) ^ 2070172980;
                        i5 = -868956832;
                    }
                    break;
                case -532781487:
                case 644979322:
                    if (c13831.isHidden()) {
                        iM2761 = C0773.m3169("᩷᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16307)) ^ 443322679;
                        i5 = -1414542582;
                    } else {
                        iM2761 = (C0773.m3169("۠ܽ") + i2) * (-55);
                        i4 = ((iM2761 ^ i3) * (-31381)) ^ (-756078909);
                        i5 = 1572184499;
                    }
                    break;
                case -495255397:
                case 1478849715:
                    C13473.m33144();
                    iM2761 = (i2 - C0619.m2761("ᩳۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM2761 ^ i3) * (-19573)) ^ 921499875;
                    i5 = -1021203716;
                    break;
                case -404676926:
                case -224196928:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩶ۤ")) * 97;
                        i4 = ((iM2761 ^ i3) * 10783) ^ 2082035824;
                        i5 = 1024751081;
                    }
                    break;
                case -339948451:
                case 1615758678:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7515)) ^ (-399031009);
                        i5 = -151854037;
                    } else {
                        iM2761 = (C0619.m2761("᩶ܽ") ^ i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-27113)) ^ (-1837037696);
                        i5 = -671959194;
                    }
                    break;
                case -309016917:
                case -198713448:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7515)) ^ (-399031009);
                        i5 = -151854037;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ۬") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * 14119) ^ (-699768237);
                        i5 = 557326236;
                    }
                    break;
                case -93943878:
                case 52556276:
                    if (C2310.f7472 < 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7515)) ^ (-399031009);
                        i5 = -151854037;
                    } else {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    }
                    break;
                case -40794199:
                case 1555104744:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("۫֡") ^ i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-11343)) ^ (-398435332);
                        i5 = 469495174;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֡") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * (-4277)) ^ 754835836;
                        i5 = 1247041650;
                    }
                    break;
                case 836364693:
                case 1587969737:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7515)) ^ (-399031009);
                        i5 = -151854037;
                    } else {
                        iM2761 = (C0773.m3169("ۤ֫") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-8561)) ^ (-1618009192);
                        i5 = -208082779;
                    }
                    break;
                case 1169344358:
                case 1852711781:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3709)) ^ (-2078662635);
                        i5 = -2036415884;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩳۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-19573)) ^ 921499875;
                        i5 = -1021203716;
                    }
                    break;
                case 1753430754:
                case 2146188758:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("֡۠") + i2) * (-117);
                        i4 = ((iM2761 ^ i3) * 24221) ^ (-1790620647);
                        i5 = -2024815389;
                    } else {
                        iM2761 = C0619.m2761("֡ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11315) ^ (-942182431);
                        i5 = 78316520;
                    }
                    break;
                default:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7515)) ^ (-399031009);
                        i5 = -151854037;
                    } else {
                        iM2761 = C0773.m3169("ۘۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14771) ^ 161294587;
                        i5 = -906533570;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7 A[PHI: r7
      0x00a7: PHI (r7v4 l.ܽ᩻ۙ) = (r7v3 l.ܽ᩻ۙ), (r7v2 l.ܽ᩻ۙ), (r7v2 l.ܽ᩻ۙ) binds: [B:22:0x00a5, B:9:0x0056, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0179 A[PHI: r4 r5 r6
      0x0179: PHI (r4v3 l.᩸ۧۧ) = (r4v2 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ), (r4v4 l.᩸ۧۧ) binds: [B:41:0x0177, B:9:0x0056, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r5v3 l.ۤ᩻ۙ) = (r5v2 l.ۤ᩻ۙ), (r5v2 l.ۤ᩻ۙ), (r5v4 l.ۤ᩻ۙ) binds: [B:41:0x0177, B:9:0x0056, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r6v3 l.ܳۜ᩷) = (r6v2 l.ܳۜ᩷), (r6v2 l.ܳۜ᩷), (r6v4 l.ܳۜ᩷) binds: [B:41:0x0177, B:9:0x0056, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0252 A[PHI: r9 r10 r12
      0x0252: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:60:0x0250, B:33:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:60:0x0250, B:33:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r12v4 short) = (r12v3 short), (r12v2 short) binds: [B:60:0x0250, B:33:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        int iM3169;
        int i;
        int i2;
        short[] sArr;
        C13831 c13831 = this;
        int i3 = C4282.f15546;
        int i4 = C1080.f3865;
        int iM2761 = C0619.m2761("ۧۧ") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-25329)) ^ (-2117989464);
        String strM6966 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ 2093133560;
        int iM31610 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1949504664;
        C17930 c17930M51320 = null;
        C15179 c15179 = null;
        InterfaceC11217 viewLifecycleOwner = null;
        C22761 c22761 = null;
        int iM31611 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * (-1699)) >> 31));
            switch (i10) {
                case -2030072642:
                case -1711118146:
                    iM31611 = 2123134368 ^ C0773.m3169(strM6966);
                    if (C0950.f3488 < 0) {
                        iM3169 = C0773.m3169("ۖۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-487)) ^ 1679764387;
                        i2 = -1926471949;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31612 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31612 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31612 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    }
                    break;
                case -1965073464:
                case 1405779012:
                    C2287.m7745();
                    iM3169 = (C0773.m3169("ܰ᩸") + i3) * (-91);
                    i = ((iM3169 ^ i4) * (-1253)) ^ 1489437855;
                    i2 = 2009607221;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1900389692:
                case -452740104:
                    C2702.m8876();
                    C4238.m13540();
                    break;
                case -1855974528:
                case 1737033653:
                    i8 = 61141;
                    iM3169 = (C0773.m3169("۬ۢ") + i3) * (-109);
                    i = ((iM3169 ^ i4) * (-27873)) ^ 356602486;
                    i2 = -2902500;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1707413811:
                case -1522544804:
                    strM6966 = C2023.m6966(f43901, 394, 3, i8);
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("ۖᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-271)) ^ 579931763;
                        i2 = 1097125896;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31613 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31613 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31613 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    }
                    break;
                case -1620718869:
                case -1482414864:
                    sArr = f43901;
                    if (C1783.f6087 > 0) {
                        int iM31614 = (C0773.m3169("ۢ۬") ^ i3) * (-5);
                        i = ((iM31614 ^ i4) * (-10993)) ^ (-1103206517);
                        i6 = iM31614 ^ 982191577;
                        c13831 = this;
                        sArr2 = sArr;
                        i5 = i;
                    } else {
                        int iM31615 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31615 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31615 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    }
                    break;
                case -1572105312:
                case -1450231004:
                    C15179 c151710 = (C15179) C3448.m11246(view, iM31611);
                    c13831.f43905 = c151710;
                    c151710.m36514(c13831.f43902);
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۗۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 31049) ^ (-1293484751);
                        i2 = 150404244;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܳ") + i4) * (-125);
                        i = ((iM3169 ^ i3) * 14739) ^ (-1779422956);
                        i2 = 1687211711;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1442608058:
                case 1276819270:
                    C3099.m10086(c15179);
                    c22761.m51330(viewLifecycleOwner, new C23660(c15179));
                    c17930M51320 = c13831.f43903.m51320();
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۤܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 8701) ^ (-388643359);
                        i2 = 1371132396;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩷᩹")) * (-41);
                        i = ((iM3169 ^ i3) * (-1727)) ^ (-1232180255);
                        i2 = -460092765;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1176257741:
                case -602671876:
                    c13831.f43905.m36513(new C9356(c13831));
                    sArr3 = f43901;
                    i9 = 397;
                    if (!C1519.m5403()) {
                        sArr = sArr2;
                        int iM31616 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31616 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31616 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    } else {
                        iM3169 = C0773.m3169("ܿ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3265) ^ 749512950;
                        i2 = -1083766670;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1158717907:
                case 743807344:
                    if (C2287.f7432 >= 0) {
                        sArr = sArr2;
                        int iM31617 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31617 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31617 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩸") + i3) * (-91);
                        i = ((iM3169 ^ i4) * (-1253)) ^ 1489437855;
                        i2 = 2009607221;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -671564740:
                case 1199422192:
                    if (((s * s) + 64304361) - (s * 16038) >= 0) {
                        iM3169 = (i3 - C0619.m2761("᩻۫")) * 57;
                        i = ((iM3169 ^ i4) * 7479) ^ 880993894;
                        i2 = 1796760855;
                    } else {
                        iM3169 = C0619.m2761("֫᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 7861) ^ 108872132;
                        i2 = -1125147795;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -240953878:
                case 1477307443:
                    C4238.m13540();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0619.m2761("ۤܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 8701) ^ (-388643359);
                        i2 = 1371132396;
                    } else {
                        iM3169 = C0619.m2761("ۗۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 31049) ^ (-1293484751);
                        i2 = 150404244;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -122900108:
                case 1917059836:
                    s = sArr2[393];
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ᩳܶ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i3) * 11249) ^ 775816223;
                        i2 = 1162171097;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܿ᩵")) * (-55);
                        i = ((iM3169 ^ i3) * (-24433)) ^ (-537884363);
                        i2 = 180484574;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 349977565:
                case 1600421152:
                    TabLayout tabLayout = (TabLayout) C2834.m9333(view, iM31610 ^ i7);
                    tabLayout.setupWithViewPager(c13831.f43905);
                    if (C4282.f15546 > 0) {
                        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C2645(c13831));
                        c22761 = c13831.f43903;
                        viewLifecycleOwner = getViewLifecycleOwner();
                        c15179 = c13831.f43905;
                        if (C1542.f5343 <= 0) {
                            iM3169 = C0619.m2761("ۗۨ") ^ i3;
                            i = ((iM3169 ^ i4) * 31049) ^ (-1293484751);
                            i2 = 150404244;
                        } else {
                            iM3169 = C0619.m2761("ܶۡ") ^ i3;
                            i = ((iM3169 ^ i4) * (-7433)) ^ 1230458554;
                            i2 = 1757015608;
                        }
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31618 = C0773.m3169("ۧܽ") ^ i4;
                        i6 = iM31618 ^ 1035511520;
                        sArr2 = sArr;
                        i5 = ((iM31618 ^ i3) * 10423) ^ (-84620463);
                        c13831 = this;
                    }
                    break;
                case 967851433:
                case 1450664087:
                    C2310.m7810(c17930M51320, getViewLifecycleOwner(), new C15916(3, c13831));
                    break;
                case 1285906250:
                case 1448305359:
                    i8 = 18510;
                    iM3169 = (C0773.m3169("۬ۢ") + i3) * (-109);
                    i = ((iM3169 ^ i4) * (-27873)) ^ 356602486;
                    i2 = -2902500;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1485875857:
                case 1677834523:
                    iM31610 = C0773.m3169(C1343.m4939(sArr3, i9, 3, i8));
                    i7 = 2102867185;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("ᩳܶ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i3) * 11249) ^ 775816223;
                        i2 = 1162171097;
                    } else {
                        iM3169 = C0619.m2761("ۤۜ") ^ i3;
                        i = ((iM3169 ^ i4) * 9799) ^ 2115752734;
                        i2 = 813652144;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("ܰ᩸") + i3) * (-91);
                        i = ((iM3169 ^ i4) * (-1253)) ^ 1489437855;
                        i2 = 2009607221;
                    } else {
                        iM3169 = C0619.m2761("ۤܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 8701) ^ (-388643359);
                        i2 = 1371132396;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060 A[PHI: r18
      0x0060: PHI (r18v4 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String) binds: [B:30:0x00de, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x009e A[PHI: r1 r2
      0x009e: PHI (r1v52 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v57 int) binds: [B:17:0x0077, B:13:0x006b, B:9:0x005d, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:17:0x0077, B:13:0x006b, B:9:0x005d, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c5 A[PHI: r7 r8 r9 r13 r17
      0x01c5: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:53:0x01c3, B:49:0x01a2, B:34:0x0102, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:53:0x01c3, B:49:0x01a2, B:34:0x0102, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:53:0x01c3, B:49:0x01a2, B:34:0x0102, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:53:0x01c3, B:49:0x01a2, B:34:0x0102, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r17v17 int) = (r17v8 int), (r17v9 int), (r17v15 int), (r17v18 int) binds: [B:53:0x01c3, B:49:0x01a2, B:34:0x0102, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022a A[PHI: r4 r17 r18
      0x022a: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char) binds: [B:62:0x0228, B:58:0x020b, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r17v21 int) = (r17v6 int), (r17v7 int), (r17v22 int) binds: [B:62:0x0228, B:58:0x020b, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r18v3 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v4 java.lang.String) binds: [B:62:0x0228, B:58:0x020b, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025b A[PHI: r3 r11 r12 r17
      0x025b: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x0259, B:38:0x0128, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:66:0x0259, B:38:0x0128, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:66:0x0259, B:38:0x0128, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r17v19 int) = (r17v5 int), (r17v14 int), (r17v20 int) binds: [B:66:0x0259, B:38:0x0128, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        int iM2761;
        int i;
        int i2;
        int iM2762 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -225278941;
        int i11 = C3099.f10023;
        int i12 = C3033.f9831;
        int iM3169 = C0773.m3169("᩺ܶ") ^ i12;
        int i13 = ((iM3169 ^ i11) * 31577) ^ 1194855882;
        int i14 = iM3169 ^ (-1388501239);
        String strM1785 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 19091) >> 31));
            switch (i10) {
                case -1874778570:
                case -1483555276:
                    iM2762 = C0619.m2761(strM1785);
                    if (AbstractC0116.f1064 <= 0) {
                        i3 = 2127343140;
                        iM2761 = (i11 - C0619.m2761("۫ᩴ")) * (-13);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 4403) ^ 874240293;
                        i2 = -273135136;
                        int i15 = iM2762;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        iM2762 = i15;
                    } else {
                        int iM2763 = (C0619.m2761("۠ᩳ") ^ i12) * 87;
                        i14 = iM2763 ^ 1748156533;
                        i13 = ((iM2763 ^ i11) * 16627) ^ 365387722;
                        i3 = 2127343140;
                    }
                    break;
                case -1855142069:
                case -209739940:
                    C3734.m12152();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (i11 - C0619.m2761("۫ᩴ")) * (-13);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 4403) ^ 874240293;
                        i2 = -273135136;
                    } else {
                        iM2762 = iM2762;
                        iM2761 = C0619.m2761("ܿۡ") ^ i12;
                        i = ((iM2761 ^ i11) * (-2111)) ^ (-867491475);
                        i2 = -531539662;
                    }
                    int i16 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i16;
                    break;
                case -1801441841:
                case 1015849781:
                    iM2762 = iM2762;
                    i4 = s * s2;
                    i5 = s * s;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("۟᩵") ^ i11;
                        i = ((iM2761 ^ i12) * 28035) ^ 589880061;
                        i2 = 1183135059;
                    } else {
                        iM2761 = C0773.m3169("۬۟") ^ i11;
                        i = ((iM2761 ^ i12) * (-12621)) ^ 82624749;
                        i2 = -2140031889;
                    }
                    int i17 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i17;
                    break;
                case -1702397666:
                case -1029744909:
                    i7 = 24331;
                    iM2761 = (i11 - C0773.m3169("ۛ᩹")) * 5;
                    i = ((iM2761 ^ i12) * (-6081)) ^ (-943997285);
                    i2 = 656071266;
                    int i18 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i18;
                    break;
                case -1635720246:
                case -236229841:
                    iM2762 = iM2762;
                    sArr2 = f43901;
                    i8 = 420;
                    if (C4282.m13644()) {
                        iM2761 = (i12 - C0619.m2761("ۡ᩷")) * (-67);
                        i = ((iM2761 ^ i11) * (-25275)) ^ 655911849;
                        i2 = -812546978;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩷") + i12) * (-37);
                        i = ((iM2761 ^ i11) * 27575) ^ (-2126771488);
                        i2 = 1225502121;
                    }
                    int i19 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i19;
                    break;
                case -1580228775:
                case 260939034:
                    C17202.m40372();
                    if (C3448.m11248() == 0) {
                        iM2761 = (i11 - C0619.m2761("۫ᩴ")) * (-13);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 4403) ^ 874240293;
                        i2 = -273135136;
                    } else {
                        iM2762 = iM2762;
                        iM2761 = (C0619.m2761("ۜ᩷") + i12) * (-37);
                        i = ((iM2761 ^ i11) * 27575) ^ (-2126771488);
                        i2 = 1225502121;
                    }
                    int i110 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i110;
                    break;
                case -1185324312:
                case 1818441547:
                    iM2762 = iM2762;
                    c = 419;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i12;
                        i = ((iM2761 ^ i11) * (-2111)) ^ (-867491475);
                        i2 = -531539662;
                    } else {
                        iM2761 = C0619.m2761("ۧۨ") ^ i11;
                        i = ((iM2761 ^ i12) * (-24451)) ^ 494590606;
                        i2 = -707953989;
                    }
                    int i111 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i111;
                    break;
                case -1095201159:
                case 470279214:
                    C0619.m2763();
                    if (C1080.f3865 >= 0) {
                        iM2762 = iM2762;
                        iM2761 = C0773.m3169("۟᩵") ^ i11;
                        i = ((iM2761 ^ i12) * 28035) ^ 589880061;
                        i2 = 1183135059;
                    } else {
                        iM2761 = (i11 - C0619.m2761("۫ᩴ")) * (-13);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 4403) ^ 874240293;
                        i2 = -273135136;
                    }
                    int i112 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i112;
                    break;
                case -1018558325:
                case 945254959:
                    i7 = 7229;
                    iM2761 = (i11 - C0773.m3169("ۛ᩹")) * 5;
                    i = ((iM2761 ^ i12) * (-6081)) ^ (-943997285);
                    i2 = 656071266;
                    int i113 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i113;
                    break;
                case -742472150:
                case 2002622687:
                    iM2762 = iM2762;
                    if ((i5 + i6) - i4 >= 0) {
                        iM2761 = C0619.m2761("᩷ۛ") ^ i12;
                        i = ((iM2761 ^ i11) * 13789) ^ (-1924934619);
                        i2 = 759189021;
                    } else {
                        iM2761 = C0619.m2761("ۤۗ") ^ i11;
                        i = ((iM2761 ^ i12) * 16215) ^ (-1349824787);
                        i2 = -1692914050;
                    }
                    int i114 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i114;
                    break;
                case -668757094:
                case 1203622682:
                    iM2762 = iM2762;
                    i6 = 65934400;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("۟᩵") ^ i11;
                        i = ((iM2761 ^ i12) * 28035) ^ 589880061;
                        i2 = 1183135059;
                    } else {
                        iM2761 = C0619.m2761("ᩴۙ") ^ i12;
                        i = ((iM2761 ^ i11) * 32311) ^ (-511999782);
                        i2 = -1736277616;
                    }
                    int i115 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i115;
                    break;
                case -509911431:
                case -164568198:
                    iM2762 = iM2762;
                    i9 = 3;
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("۟᩵") ^ i11;
                        i = ((iM2761 ^ i12) * 28035) ^ 589880061;
                        i2 = 1183135059;
                    } else {
                        iM2761 = (C0619.m2761("ۨۘ") + i12) * 61;
                        i = ((iM2761 ^ i11) * (-14645)) ^ (-143088196);
                        i2 = 1434114514;
                    }
                    int i116 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i116;
                    break;
                case -372624416:
                case 1926495584:
                    strM1785 = C0269.m1785(sArr2, i8, i9, i7);
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("᩷᩵") + i11) * (-51);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * (-32459)) ^ (-449636524);
                        i2 = -1050812640;
                    } else {
                        iM2762 = iM2762;
                        iM2761 = C0619.m2761("ܿۡ") ^ i12;
                        i = ((iM2761 ^ i11) * (-2111)) ^ (-867491475);
                        i2 = -531539662;
                    }
                    int i117 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i117;
                    break;
                case -342758373:
                case -331634902:
                    return AbstractC0116.m1244(iM2762 ^ i3);
                case -201918442:
                case 1089027140:
                    iM2762 = iM2762;
                    if (C23916.m53419() != 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i12;
                        i = ((iM2761 ^ i11) * (-2111)) ^ (-867491475);
                        i2 = -531539662;
                    } else {
                        iM2761 = C0619.m2761("᩹᩻") ^ i11;
                        i = ((iM2761 ^ i12) * (-21185)) ^ (-1861536047);
                        i2 = 875725551;
                    }
                    int i118 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i118;
                    break;
                case -107480891:
                case 1122123615:
                    iM2762 = iM2762;
                    sArr = f43901;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۜ᩷") + i12) * (-37);
                        i = ((iM2761 ^ i11) * 27575) ^ (-2126771488);
                        i2 = 1225502121;
                    } else {
                        iM2761 = C0619.m2761("۬ۡ") ^ i12;
                        i = ((iM2761 ^ i11) * 15045) ^ (-564509137);
                        i2 = 472516297;
                    }
                    int i119 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i119;
                    break;
                case 517415075:
                case 1192613968:
                    C1542.m5459();
                    C0773.m3161();
                    return null;
                case 1819134695:
                case 1910533301:
                    C1519.m5403();
                    C2023.m6964();
                    iM2762 = iM2762;
                    iM2761 = C0773.m3169("۟᩵") ^ i11;
                    i = ((iM2761 ^ i12) * 28035) ^ 589880061;
                    i2 = 1183135059;
                    int i1110 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1110;
                    break;
                default:
                    iM2762 = iM2762;
                    s = sArr[c];
                    s2 = 16240;
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ᩳۗ") ^ i11) * 23;
                        i = ((iM2761 ^ i12) * (-6761)) ^ 895254027;
                        i2 = 2117370533;
                    } else {
                        iM2761 = C0619.m2761("۬ᩳ") ^ i12;
                        i = ((iM2761 ^ i11) * (-20025)) ^ 2033678999;
                        i2 = -749702760;
                    }
                    int i1111 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1111;
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13831() {
        short[] sArr = null;
        int i = 0;
        int i2 = 1911276110;
        int i3 = C1080.f3865;
        int i4 = C1542.f5343;
        short s = f43901[0];
        int i5 = (s * s) + 190357209;
        int i6 = s + 13797;
        int i7 = (i6 * i6) - (i5 + i5) > 0 ? 11431 : 35676;
        super(C0619.m2761(C20932.m47853(f43901, 1, 3, i7)) ^ 2119645644);
        int iM2761 = C0619.m2761("᩻᩶") ^ i4;
        int i8 = ((iM2761 ^ i3) * 29641) ^ 970165876;
        int i9 = 672389122;
        while (true) {
            i2 = ((((i2 ^ i3) * 27995) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i2) {
                case -1959554090:
                case 1634817909:
                    setHasOptionsMenu(true);
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۗ᩻") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-31153)) ^ 964751759;
                        i9 = 1021476649;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i8 = ((iM2761 ^ i4) * 31779) ^ 361506041;
                        i9 = -484843331;
                    }
                    break;
                case -1917224702:
                case -1769916795:
                    C2023.m6964();
                    if (C23916.f77426 > 0) {
                        iM2761 = C0773.m3169("ۗ᩻") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-31153)) ^ 964751759;
                        i9 = 1021476649;
                    } else {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i8 = ((iM2761 ^ i4) * 5249) ^ 490917210;
                        i9 = 511732950;
                    }
                    break;
                case -1621551403:
                case 1840205009:
                    RunnableC1848.m6360();
                    if (!C2023.f6737) {
                        iM2761 = C0773.m3169("ۗ᩻") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-31153)) ^ 964751759;
                        i9 = 1021476649;
                    } else {
                        iM2761 = C0773.m3169("ۖ۫") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-1735)) ^ 1270036302;
                        i9 = -538956676;
                    }
                    break;
                case -1562344506:
                case -1453817569:
                    if (!C3077.m10041()) {
                        iM2761 = (C0773.m3169("֡֫") ^ i3) * (-7);
                        i8 = ((iM2761 ^ i4) * (-13447)) ^ (-1884218710);
                        i9 = 1837138019;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩻") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-31153)) ^ 964751759;
                        i9 = 1021476649;
                    }
                    break;
                case -1492730600:
                case 1055390007:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("ܺۘ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 1449) ^ (-2019458573);
                        i9 = -533092371;
                    } else {
                        iM2761 = C0619.m2761("ۖۨ") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-27577)) ^ (-1817484645);
                        i9 = -56258650;
                    }
                    break;
                case -1245407912:
                case 1300440537:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i8 = ((iM2761 ^ i4) * 5249) ^ 490917210;
                        i9 = 511732950;
                    } else {
                        iM2761 = (C0619.m2761("۠ۜ") + i3) * 39;
                        i8 = ((iM2761 ^ i4) * 2089) ^ 494787743;
                        i9 = -585944061;
                    }
                    break;
                case -974847019:
                case 715930656:
                    C0619.m2763();
                    throw new RuntimeException();
                case -919181877:
                case 564492402:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ܺۘ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 1449) ^ (-2019458573);
                        i9 = -533092371;
                    } else {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 769) ^ 12195065;
                        i9 = 101858712;
                    }
                    break;
                case -855884850:
                case 1971540353:
                    C2354.m7983();
                    iM2761 = C0773.m3169("᩶֡") ^ i3;
                    i8 = ((iM2761 ^ i4) * 5249) ^ 490917210;
                    i9 = 511732950;
                    break;
                case -777436173:
                case -290155018:
                    m24174(AbstractC0116.m1236(sArr, i, 34, i7));
                    return;
                case -687405659:
                case 244383052:
                    i = 4;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ܺۘ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 1449) ^ (-2019458573);
                        i9 = -533092371;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩺") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-3773)) ^ (-140745128);
                        i9 = -1731692348;
                    }
                    break;
                case -535876654:
                case 2071973370:
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("֡ܶ") ^ i3) * 101;
                        i8 = ((iM2761 ^ i4) * (-23163)) ^ 711089192;
                        i9 = -1372402749;
                    } else {
                        iM2761 = C0619.m2761("ܺۘ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 1449) ^ (-2019458573);
                        i9 = -533092371;
                    }
                    break;
                case -272233079:
                case 1332790806:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۖ۫") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-1735)) ^ 1270036302;
                        i9 = -538956676;
                    } else {
                        iM2761 = C0773.m3169("ۚۘ") ^ i3;
                        i8 = ((iM2761 ^ i4) * (-31073)) ^ (-1367273879);
                        i9 = -444500767;
                    }
                    break;
                case 200096400:
                case 1477675060:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ܺۘ") ^ i4;
                        i8 = ((iM2761 ^ i3) * 1449) ^ (-2019458573);
                        i9 = -533092371;
                    } else {
                        iM2761 = (C0619.m2761("۫ܺ") ^ i4) * (-65);
                        i8 = ((iM2761 ^ i3) * 6805) ^ 244322385;
                        i9 = -1101485457;
                    }
                    break;
                case 947874994:
                case 1376982146:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ۖ۫") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-1735)) ^ 1270036302;
                        i9 = -538956676;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i4;
                        i8 = ((iM2761 ^ i3) * (-7705)) ^ (-1915884627);
                        i9 = 292729171;
                    }
                    break;
                default:
                    sArr = f43901;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("֡֫") ^ i3) * (-7);
                        i8 = ((iM2761 ^ i4) * (-13447)) ^ (-1884218710);
                        i9 = 1837138019;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰۤ")) * (-111);
                        i8 = ((iM2761 ^ i4) * (-29441)) ^ (-1995459263);
                        i9 = -778889416;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af A[PHI: r18
      0x00af: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String) binds: [B:28:0x00ad, B:18:0x0068, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d3 A[PHI: r6 r7 r8 r17
      0x01d3: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:52:0x01d1, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:52:0x01d1, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:52:0x01d1, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r17v10 int) = (r17v9 int), (r17v11 int) binds: [B:52:0x01d1, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0227 A[PHI: r4 r11 r12 r17
      0x0227: PHI (r4v3 char) = (r4v2 char), (r4v1 char) binds: [B:60:0x0225, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r11v2 short[]) = (r11v1 short[]), (r11v3 short[]) binds: [B:60:0x0225, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:60:0x0225, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r17v24 int) = (r17v7 int), (r17v25 int) binds: [B:60:0x0225, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0229 A[PHI: r1 r2 r4 r11 r12
      0x0229: PHI (r1v53 int) = (r1v1 int), (r1v1 int), (r1v47 int), (r1v58 int) binds: [B:16:0x0065, B:13:0x005c, B:61:0x0227, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:16:0x0065, B:13:0x005c, B:61:0x0227, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r4v5 char) = (r4v1 char), (r4v1 char), (r4v3 char), (r4v1 char) binds: [B:16:0x0065, B:13:0x005c, B:61:0x0227, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r11v5 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:16:0x0065, B:13:0x005c, B:61:0x0227, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r12v5 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:16:0x0065, B:13:0x005c, B:61:0x0227, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025e A[PHI: r3 r5 r9 r17
      0x025e: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:65:0x025c, B:56:0x0208, B:44:0x018f, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:65:0x025c, B:56:0x0208, B:44:0x018f, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:65:0x025c, B:56:0x0208, B:44:0x018f, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r17v21 int) = (r17v6 int), (r17v8 int), (r17v12 int), (r17v22 int) binds: [B:65:0x025c, B:56:0x0208, B:44:0x018f, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        int iM3169;
        int i;
        int i2;
        int iM2761 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1922634378;
        int i12 = C11235.f35427;
        int i13 = C3492.f12043;
        int iM2762 = (C0619.m2761("ܿ۟") ^ i12) * 5;
        int i14 = ((iM2762 ^ i13) * 18657) ^ 1391968557;
        int i15 = iM2762 ^ (-297893102);
        String strM9847 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 22685) >> 31));
            switch (i11) {
                case -2095892110:
                case -898202799:
                    iM2761 = iM2761;
                    s = sArr[c];
                    if (C3998.f13671 != 0) {
                        iM3169 = (i12 - C0619.m2761("᩸ۚ")) * (-31);
                        i = ((iM3169 ^ i13) * 9151) ^ 669768646;
                        i2 = 155682332;
                    } else {
                        iM3169 = C0619.m2761("ᩴܽ") ^ i12;
                        i = ((iM3169 ^ i13) * (-31991)) ^ (-1877946397);
                        i2 = -1765698639;
                    }
                    int i16 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i16;
                    break;
                case -1949532801:
                case -835854472:
                    iM2761 = iM2761;
                    c = 427;
                    if (C1564.f5401 <= 0) {
                        iM2761 = iM2761;
                        iM3169 = (C0773.m3169("ۖ۠") + i13) * 53;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * 17861) ^ (-575543066);
                        i2 = 1245927747;
                    } else {
                        iM3169 = C0619.m2761("᩶ۚ") ^ i12;
                        i = ((iM3169 ^ i13) * (-1941)) ^ 1901124464;
                        i2 = 1486326561;
                    }
                    int i17 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i17;
                    break;
                case -1843862725:
                case 69245868:
                    iM2761 = iM2761;
                    i4 = s + 17294;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("֫۠") + i12) * (-101);
                        i = ((iM3169 ^ i13) * 2685) ^ (-384630345);
                        i2 = 1480116728;
                    } else {
                        iM3169 = (C0773.m3169("۬ۛ") + i13) * 91;
                        i = ((iM3169 ^ i12) * 2011) ^ (-326013155);
                        i2 = 1278237259;
                    }
                    int i18 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i18;
                    break;
                case -1675670252:
                case -842910804:
                    iM2761 = C0619.m2761(strM9847);
                    if (RunnableC3055.f9898 >= 0) {
                        i3 = 2121770500;
                        iM3169 = (C0773.m3169("ۖ۠") + i13) * 53;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * 17861) ^ (-575543066);
                        i2 = 1245927747;
                        int i19 = iM2761;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        iM2761 = i19;
                    } else {
                        int iM2763 = C0619.m2761("ۡܽ") ^ i12;
                        i15 = iM2763 ^ 1445436091;
                        i14 = ((iM2763 ^ i13) * 24365) ^ 1509376439;
                        i3 = 2121770500;
                    }
                    break;
                case -1437371456:
                case 803534380:
                    strM9847 = C3033.m9847(sArr2, i9, i10, i8);
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("᩹ۢ") ^ i13;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * (-24695)) ^ (-628540128);
                        i2 = -571011121;
                    } else {
                        iM2761 = iM2761;
                        iM3169 = C0619.m2761("᩵ۚ") ^ i13;
                        i = ((iM3169 ^ i12) * (-95)) ^ 1239590176;
                        i2 = -566782880;
                    }
                    int i110 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i110;
                    break;
                case -1305646507:
                case 575263075:
                    iM2761 = iM2761;
                    i10 = 3;
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("᩸ۖ") + i13) * (-19);
                        i = ((iM3169 ^ i12) * 6323) ^ 42206797;
                        i2 = 1401314240;
                    } else {
                        iM3169 = C0619.m2761("ۜ᩵") ^ i12;
                        i = ((iM3169 ^ i13) * (-30583)) ^ 271524680;
                        i2 = 951168909;
                    }
                    int i111 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i111;
                    break;
                case -1110666706:
                case 1413578475:
                    AbstractC0641.m2813();
                    if (!C2354.m7983()) {
                        iM2761 = iM2761;
                        iM3169 = (C0619.m2761("᩸ۖ") + i13) * (-19);
                        i = ((iM3169 ^ i12) * 6323) ^ 42206797;
                        i2 = 1401314240;
                        int i112 = iM2761;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        iM2761 = i112;
                    }
                    iM2761 = iM2761;
                    iM3169 = (i12 - C0619.m2761("᩸ۚ")) * (-31);
                    i = ((iM3169 ^ i13) * 9151) ^ 669768646;
                    i2 = 155682332;
                    int i113 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i113;
                    break;
                case -994130346:
                case 810593078:
                    iM2761 = iM2761;
                    sArr = f43901;
                    if (RunnableC1848.f6235) {
                        iM3169 = (i12 - C0619.m2761("᩸ۚ")) * (-31);
                        i = ((iM3169 ^ i13) * 9151) ^ 669768646;
                        i2 = 155682332;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i13;
                        i = ((iM3169 ^ i12) * 5381) ^ 1058159807;
                        i2 = -1741049997;
                    }
                    int i114 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i114;
                    break;
                case -993692269:
                case -626333271:
                    return AbstractC0116.m1244(iM2761 ^ i3);
                case -871120719:
                case 1938969356:
                    iM2761 = iM2761;
                    int i20 = i6 + i7;
                    if (i5 - (i20 + i20) <= 0) {
                        iM3169 = C0773.m3169("ۧᩳ") ^ i12;
                        i = ((iM3169 ^ i13) * (-15627)) ^ (-338340580);
                        i2 = -1212751717;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i13;
                        i = ((iM3169 ^ i12) * (-11417)) ^ (-1222327760);
                        i2 = 56478206;
                    }
                    int i115 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i115;
                    break;
                case -838686577:
                case 839466779:
                    C2375.m8065();
                    C2354.m7983();
                    return null;
                case -671961381:
                case 997374379:
                    C11235.m28309();
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۖ۠") + i13) * 53;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * 17861) ^ (-575543066);
                        i2 = 1245927747;
                    } else {
                        iM2761 = iM2761;
                        iM3169 = (i12 - C0619.m2761("᩸ۚ")) * (-31);
                        i = ((iM3169 ^ i13) * 9151) ^ 669768646;
                        i2 = 155682332;
                    }
                    int i116 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i116;
                    break;
                case -223272019:
                case 1069055918:
                    C13473.m33144();
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("᩹ۢ") ^ i13;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * (-24695)) ^ (-628540128);
                        i2 = -571011121;
                    } else {
                        iM3169 = (C0773.m3169("ۖ۠") + i13) * 53;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * 17861) ^ (-575543066);
                        i2 = 1245927747;
                    }
                    int i117 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i117;
                    break;
                case 269146657:
                case 419277087:
                    iM2761 = iM2761;
                    i7 = 299082436;
                    if (C2419.m8174() >= 0) {
                        iM3169 = (i12 - C0619.m2761("᩸ۚ")) * (-31);
                        i = ((iM3169 ^ i13) * 9151) ^ 669768646;
                        i2 = 155682332;
                    } else {
                        iM3169 = C0619.m2761("ۧ֫") ^ i13;
                        i = ((iM3169 ^ i12) * (-4343)) ^ (-1853759812);
                        i2 = -538605604;
                    }
                    int i118 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i118;
                    break;
                case 279452271:
                case 429135388:
                    i8 = 53250;
                    iM3169 = C0773.m3169("֡ۜ") ^ i13;
                    i = ((iM3169 ^ i12) * 18607) ^ 1679771433;
                    i2 = -1816925537;
                    int i119 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i119;
                    break;
                case 626271139:
                case 1472333082:
                    i8 = 48629;
                    iM3169 = C0773.m3169("֡ۜ") ^ i13;
                    i = ((iM3169 ^ i12) * 18607) ^ 1679771433;
                    i2 = -1816925537;
                    int i1110 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i1110;
                    break;
                case 1422404515:
                case 1678999146:
                    iM2761 = iM2761;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("֫۠") + i12) * (-101);
                        i = ((iM3169 ^ i13) * 2685) ^ (-384630345);
                        i2 = 1480116728;
                    } else {
                        iM3169 = (C0619.m2761("᩸֡") + i12) * q.h;
                        i = ((iM3169 ^ i13) * 4273) ^ (-2033631746);
                        i2 = -1442010072;
                    }
                    int i1111 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i1111;
                    break;
                case 1674067629:
                case 1752733740:
                    C0862.m3503();
                    C0487.m2356();
                    iM3169 = C0773.m3169("᩹ۢ") ^ i13;
                    iM2761 = iM2761;
                    i = ((iM3169 ^ i12) * (-24695)) ^ (-628540128);
                    i2 = -571011121;
                    int i1112 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i1112;
                    break;
                default:
                    iM2761 = iM2761;
                    sArr2 = f43901;
                    i9 = 428;
                    if (C3099.f10023 <= 0) {
                        iM2761 = iM2761;
                        iM3169 = (C0773.m3169("ۖ۠") + i13) * 53;
                        iM2761 = iM2761;
                        i = ((iM3169 ^ i12) * 17861) ^ (-575543066);
                        i2 = 1245927747;
                    } else {
                        iM3169 = (i12 - C0619.m2761("᩺ۖ")) * 97;
                        i = ((iM3169 ^ i13) * (-18869)) ^ (-878343123);
                        i2 = -2077094437;
                    }
                    int i1113 = iM2761;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    iM2761 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33764(C13831 c13831, C20283 c20283) {
        MenuItem menuItem = null;
        int i = -598228894;
        int i2 = C2288.f7433;
        int i3 = C3448.f11240;
        int iM2761 = (i3 - C0619.m2761("֡ܳ")) * (-107);
        int i4 = ((iM2761 ^ i2) * 27959) ^ (-953733009);
        int i5 = -891784575;
        while (true) {
            i = ((((i ^ i2) * (-27795)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2096159132:
                case 1506971868:
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("ܶ᩸") + i3) * (-13);
                        i4 = ((iM2761 ^ i2) * (-18265)) ^ (-1083033842);
                        i5 = -1526261451;
                    } else {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14873)) ^ (-1288651133);
                        i5 = -322880013;
                    }
                    break;
                case -2035995475:
                case 1174186162:
                    c13831.f43904 = c20283;
                    menuItem = c13831.f43907;
                    if (menuItem != null) {
                        iM2761 = (C0773.m3169("ܺ֨") ^ i3) * (-59);
                        i4 = ((iM2761 ^ i2) * (-15073)) ^ 1465095680;
                        i5 = -602833127;
                    } else {
                        iM2761 = C0619.m2761("ܶۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9587) ^ (-1600329611);
                        i5 = -1087762049;
                    }
                    break;
                case -2002980589:
                case -1599169500:
                    if (C3998.m12920()) {
                        iM2761 = (i2 - C0619.m2761("ۤܿ")) * (-91);
                        i4 = ((iM2761 ^ i3) * 19591) ^ 984573630;
                        i5 = -823609321;
                    } else {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i2) * 27;
                        i4 = ((iM2761 ^ i3) * (-31707)) ^ (-2048011671);
                        i5 = -529530986;
                    }
                    break;
                case -1986416395:
                case -1138030440:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17339) ^ (-1017061361);
                        i5 = 1495833300;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶ᩷")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-32379)) ^ (-681512454);
                        i5 = 562880672;
                    }
                    break;
                case -1930909414:
                case -1425472463:
                    C13473.m33139(menuItem, c20283.m46599());
                    iM2761 = C0619.m2761("ܶۜ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 9587) ^ (-1600329611);
                    i5 = -1087762049;
                    break;
                case -1858887603:
                case -1372105376:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۘܳ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-27751)) ^ 1676441238;
                        i5 = -607788093;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۖ") + i3) * 3;
                        i4 = ((iM2761 ^ i2) * (-6719)) ^ (-122023991);
                        i5 = 813307952;
                    }
                    break;
                case -1318970028:
                case 538289460:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14873)) ^ (-1288651133);
                        i5 = -322880013;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۘܳ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-27751)) ^ 1676441238;
                        i5 = -607788093;
                    }
                    break;
                case -1292386997:
                case -371457562:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("᩺ۘ") ^ i2) * (-63);
                        i4 = ((iM2761 ^ i3) * (-27059)) ^ (-137960578);
                        i5 = -1575465845;
                    } else {
                        iM2761 = C0773.m3169("ۘܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-309)) ^ (-1908179768);
                        i5 = -453521234;
                    }
                    break;
                case -1095796458:
                case -756526079:
                    if (C0487.m2356() < 0) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17339) ^ (-1017061361);
                        i5 = 1495833300;
                    } else {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14873)) ^ (-1288651133);
                        i5 = -322880013;
                    }
                    break;
                case -1078030490:
                case 934310800:
                    if (C3779.m12264()) {
                        iM2761 = (C0773.m3169("ᩴۗ") + i3) * (-47);
                        i4 = ((iM2761 ^ i2) * 17663) ^ (-180136495);
                        i5 = -1342010305;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17339) ^ (-1017061361);
                        i5 = 1495833300;
                    }
                    break;
                case -1007535139:
                case 1558699159:
                    if (C1519.m5403()) {
                        iM2761 = (i2 - C0773.m3169("۬֫")) * 21;
                        i4 = ((iM2761 ^ i3) * 5275) ^ (-1817548753);
                        i5 = 1530139046;
                    } else {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i2) * 27;
                        i4 = ((iM2761 ^ i3) * (-31707)) ^ (-2048011671);
                        i5 = -529530986;
                    }
                    break;
                case -579284924:
                case 2120558262:
                    break;
                case -416138958:
                case 839875483:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0619.m2761("᩺ۘ") ^ i2) * (-63);
                        i4 = ((iM2761 ^ i3) * (-27059)) ^ (-137960578);
                        i5 = -1575465845;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩶") + i2) * 67;
                        i4 = ((iM2761 ^ i3) * (-21001)) ^ 546940739;
                        i5 = 841386641;
                    }
                    break;
                case -333718539:
                case 597846661:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14873)) ^ (-1288651133);
                        i5 = -322880013;
                    } else {
                        iM2761 = C0773.m3169("ܽۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29161)) ^ (-2623511);
                        i5 = -632938490;
                    }
                    break;
                case 76266427:
                case 1487046603:
                    C11235.m28309();
                    iM2761 = (i2 - C0773.m3169("ۘܳ")) * (-37);
                    i4 = ((iM2761 ^ i3) * (-27751)) ^ 1676441238;
                    i5 = -607788093;
                    break;
                case 293986421:
                case 1125185139:
                    C3033.m9845();
                    break;
                case 1143254103:
                case 1813094536:
                    C3734.m12152();
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("ۧۤ") ^ i2) * 27;
                        i4 = ((iM2761 ^ i3) * (-31707)) ^ (-2048011671);
                        i5 = -529530986;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17339) ^ (-1017061361);
                        i5 = 1495833300;
                    }
                    break;
                default:
                    if (C3779.m12264()) {
                        iM2761 = (C0619.m2761("ܿۡ") ^ i3) * (-113);
                        i4 = ((iM2761 ^ i2) * 24681) ^ 1307562079;
                        i5 = -937407878;
                    } else {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14873)) ^ (-1288651133);
                        i5 = -322880013;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (l.C2310.m7813() <= 0) goto L53;
     */
    @Override // l.ComponentCallbacksC11612
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOptionsMenu(android.view.Menu r26, android.view.MenuInflater r27) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13831.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[PHI: r4
      0x00ae: PHI (r4v4 l.᩸ۧۧ) = (r4v3 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ) binds: [B:37:0x00ac, B:18:0x004e, B:16:0x004b, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5 A[PHI: r2 r3 r5
      0x00f5: PHI (r2v3 l.᩸ۧۧ) = (r2v2 l.᩸ۧۧ), (r2v2 l.᩸ۧۧ), (r2v2 l.᩸ۧۧ), (r2v2 l.᩸ۧۧ), (r2v6 l.᩸ۧۧ) binds: [B:41:0x00de, B:30:0x0082, B:22:0x005e, B:10:0x003d, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r3v4 l.ܽ᩻ۙ) = (r3v3 l.ܽ᩻ۙ), (r3v2 l.ܽ᩻ۙ), (r3v2 l.ܽ᩻ۙ), (r3v2 l.ܽ᩻ۙ), (r3v2 l.ܽ᩻ۙ) binds: [B:41:0x00de, B:30:0x0082, B:22:0x005e, B:10:0x003d, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r5v4 l.ܽ᩻ۙ) = (r5v2 l.ܽ᩻ۙ), (r5v3 l.ܽ᩻ۙ), (r5v2 l.ܽ᩻ۙ), (r5v2 l.ܽ᩻ۙ), (r5v2 l.ܽ᩻ۙ) binds: [B:41:0x00de, B:30:0x0082, B:22:0x005e, B:10:0x003d, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x014a A[PHI: r1 r11
      0x014a: PHI (r1v5 java.lang.Class<l.᩸ۧۧ>) = (r1v4 java.lang.Class<l.᩸ۧۧ>), (r1v2 java.lang.Class<l.᩸ۧۧ>), (r1v2 java.lang.Class<l.᩸ۧۧ>) binds: [B:50:0x0148, B:13:0x0043, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r11v8 l.ܶܺۙ) = (r11v5 l.ܶܺۙ), (r11v4 l.ܶܺۙ), (r11v4 l.ܶܺۙ) binds: [B:50:0x0148, B:13:0x0043, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        Class<C22761> cls = null;
        C22761 c22761 = null;
        C17930 c17930M51321 = null;
        C22761 c22762 = null;
        C17930 c17930M51317 = null;
        int i2 = 1307932381;
        int i3 = C4238.f15451;
        int i4 = C2287.f7432;
        int iM2761 = (C0619.m2761("֫᩶") ^ i4) * (-121);
        int i5 = ((iM2761 ^ i3) * 8611) ^ 1223872931;
        int i6 = 1456472698;
        while (true) {
            int i7 = iM2761 ^ i6;
            C16196 c16196 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 17057) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2000600181:
                    case -1463038699:
                        if (C2375.f7641 > 0) {
                            c16196 = new C16196(AbstractC3624.m11768(this));
                            cls = C22761.class;
                            if (C0950.m3785() != 0) {
                                iM3169 = (C0619.m2761("۫᩹") ^ i4) * 49;
                                i5 = ((iM3169 ^ i3) * 7935) ^ 119834438;
                                i = -983742244;
                            } else {
                                iM3169 = (i3 - C0619.m2761("᩻ۗ")) * (-25);
                                i5 = ((iM3169 ^ i4) * 20085) ^ 1576379778;
                                i = -1320242099;
                            }
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -1905315233:
                    case 949243277:
                        int i8 = 3;
                        if (C2485.f7950 != 0) {
                            iM3169 = (C0619.m2761("ۡۗ") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 2109) ^ (-1381556580);
                            i = 1505379128;
                        } else {
                            C2310.m7810(c17930M51317, this, new C23304(i8, this));
                            if (C0269.m1775() > 0) {
                                this.f43902 = new C1154(this, getChildFragmentManager());
                            }
                            iM3169 = C0619.m2761("ۘۖ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-1931)) ^ (-1324798447);
                            i = -1983112532;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1483581628:
                    case 1842549161:
                        c17930M51317 = c22762.m51317();
                        if (C0619.f2439) {
                            iM3169 = (C0619.m2761("ۡۗ") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 2109) ^ (-1381556580);
                            i = 1505379128;
                        } else {
                            iM3169 = C0773.m3169("ܿܰ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1301) ^ 713368343;
                            i = 953739431;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1403641982:
                    case 573127060:
                        super.onCreate(bundle);
                        if (AbstractC0641.f2496 >= 0) {
                            iM3169 = C0619.m2761("ۘۖ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-1931)) ^ (-1324798447);
                            i = -1983112532;
                        } else {
                            iM3169 = (i4 - C0773.m3169("۬֫")) * 41;
                            i5 = ((iM3169 ^ i3) * (-27853)) ^ (-230558345);
                            i = 191122129;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1049903179:
                    case 117069823:
                        c17930M51321 = c22761.m51321();
                        if (RunnableC3055.f9898 >= 0) {
                            iM3169 = (C0619.m2761("ۡۗ") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 2109) ^ (-1381556580);
                            i = 1505379128;
                        } else {
                            iM3169 = C0619.m2761("᩹۬") ^ i4;
                            i5 = ((iM3169 ^ i3) * 29331) ^ (-675455455);
                            i = -1342065278;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -798298309:
                    case -204812859:
                        if (C3099.f10023 > 0) {
                            iM3169 = (C0619.m2761("ܰܳ") + i4) * 49;
                            i5 = ((iM3169 ^ i3) * (-21065)) ^ 529363122;
                            i = -1052903615;
                        } else {
                            iM3169 = (C0619.m2761("۫᩹") ^ i4) * 49;
                            i5 = ((iM3169 ^ i3) * 7935) ^ 119834438;
                            i = -983742244;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -564647184:
                    case 806686744:
                        int i9 = 1;
                        if (C11235.f35427 >= 0) {
                            iM3169 = C0619.m2761("ۘۖ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-1931)) ^ (-1324798447);
                            i = -1983112532;
                        } else {
                            C0269.m1789(c17930M51321, this, new C9784(i9, this));
                            c22762 = this.f43903;
                            if (C3492.f12043 <= 0) {
                                iM3169 = (C0619.m2761("ܰܳ") + i4) * 49;
                                i5 = ((iM3169 ^ i3) * (-21065)) ^ 529363122;
                                i = -1052903615;
                            } else {
                                iM3169 = C0619.m2761("ۙ᩷") ^ i4;
                                i5 = ((iM3169 ^ i3) * (-10323)) ^ (-140025045);
                                i = -305897186;
                            }
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -354696998:
                    case 1024795041:
                        C3448.m11248();
                        C1321.m4852();
                        iM3169 = (C0619.m2761("ܰܳ") + i4) * 49;
                        i5 = ((iM3169 ^ i3) * (-21065)) ^ 529363122;
                        i = -1052903615;
                        i7 = iM3169 ^ i;
                        break;
                    case -224282740:
                    case 1166848269:
                        C3734.m12152();
                        break;
                    case 622096207:
                    case 1092711147:
                        C4238.m13540();
                        if (C0487.f2131 <= 0) {
                        }
                        iM3169 = (C0619.m2761("ܰܳ") + i4) * 49;
                        i5 = ((iM3169 ^ i3) * (-21065)) ^ 529363122;
                        i = -1052903615;
                        i7 = iM3169 ^ i;
                        break;
                    case 1065090427:
                    case 2113540380:
                        if (C2966.f9654 >= 0) {
                            iM3169 = (C0619.m2761("۫᩹") ^ i4) * 49;
                            i5 = ((iM3169 ^ i3) * 7935) ^ 119834438;
                            i = -983742244;
                        } else {
                            iM3169 = (C0619.m2761("ۡۗ") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 2109) ^ (-1381556580);
                            i = 1505379128;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        c22761 = (C22761) c16196.m38422(cls);
                        this.f43903 = c22761;
                        if (C3099.f10023 <= 0) {
                            iM3169 = (C0619.m2761("ۡۗ") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 2109) ^ (-1381556580);
                            i = 1505379128;
                        } else {
                            iM3169 = (C0773.m3169("᩻᩷") ^ i3) * 7;
                            i5 = ((iM3169 ^ i4) * (-5367)) ^ (-929095872);
                            i = 1065655942;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = C0773.m3169("۬ܶ") ^ i3;
            i5 = ((iM2761 ^ i4) * (-10019)) ^ (-1015553671);
            i6 = 1550590009;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[PHI: r1 r2 r12 r13
      0x00c8: PHI (r1v5 l.ۗ۫ۙ) = (r1v4 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ) binds: [B:28:0x00c6, B:20:0x007f, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:28:0x00c6, B:20:0x007f, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:28:0x00c6, B:20:0x007f, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:28:0x00c6, B:20:0x007f, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ab A[PHI: r3 r9 r10
      0x01ab: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:49:0x01a9, B:45:0x0188, B:24:0x009e, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:49:0x01a9, B:45:0x0188, B:24:0x009e, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:49:0x01a9, B:45:0x0188, B:24:0x009e, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021c A[PHI: r5
      0x021c: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:61:0x021a, B:13:0x0066, B:5:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0251 A[PHI: r6 r7 r8 r18
      0x0251: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:65:0x024f, B:57:0x01fc, B:53:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:65:0x024f, B:57:0x01fc, B:53:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:65:0x024f, B:57:0x01fc, B:53:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:65:0x024f, B:57:0x01fc, B:53:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x027f  */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onHiddenChanged(boolean z) {
        int iM2761;
        int i;
        int i2;
        int i3 = C0773.f2792;
        int i4 = C3099.f10023;
        int iM3169 = (i4 - C0773.m3169("᩶ۙ")) * (-85);
        int i5 = ((iM3169 ^ i3) * (-29247)) ^ (-1781072104);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 390908038;
        ActivityC3409 activityC3409M11768 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1100759373;
        String strM12149 = null;
        int iM31610 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 2929) >> 31));
            switch (i12) {
                case -2143514178:
                case -1929207256:
                    c = 171;
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ܳۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i3) * (-19893)) ^ 1469933721;
                        i2 = -138485898;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܿۚ")) * (-27);
                        i = ((iM2761 ^ i3) * 16755) ^ 613772884;
                        i2 = -1380983657;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2033300906:
                case -535553311:
                    s2 = 4918;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-14591)) ^ 1422642898;
                        i2 = -844217800;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡܶ")) * 85;
                        i = ((iM2761 ^ i4) * (-24329)) ^ (-223528794);
                        i2 = -1057749816;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2030727503:
                case -105469773:
                    super.onHiddenChanged(z);
                    if (z) {
                        iM2761 = (C0773.m3169("֫᩶") ^ i3) * 87;
                        i = ((iM2761 ^ i4) * (-32383)) ^ 448501616;
                        i2 = -869439144;
                    } else {
                        iM2761 = (C0773.m3169("ܳ᩶") ^ i4) * (-43);
                        i = ((iM2761 ^ i3) * (-535)) ^ 1983169301;
                        i2 = -962728405;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1965638470:
                case -900304570:
                    i10 = 12697;
                    iM2761 = C0773.m3169("ۧ۫") ^ i4;
                    i = ((iM2761 ^ i3) * (-12745)) ^ 942117279;
                    i2 = -559437613;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1964167756:
                case 1781623851:
                    activityC3409M11768.setTitle(iM31610);
                    m33766();
                    break;
                case -1928692476:
                case -828319348:
                    int i13 = s + s2;
                    if ((i13 * i13) - i9 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ۘ᩵")) * 99;
                        i = ((iM2761 ^ i3) * 1093) ^ (-973018362);
                        i2 = -303240611;
                    } else {
                        iM2761 = (C0773.m3169("ۚ֡") ^ i3) * (-95);
                        i = ((iM2761 ^ i4) * 14013) ^ (-2052709868);
                        i2 = 1142482054;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1783824787:
                case 1683296463:
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-14591)) ^ 1422642898;
                        i2 = -844217800;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۡ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i4) * (-13833)) ^ (-369270376);
                        i2 = -2081217298;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1456928014:
                case 1663975292:
                    C1542.m5459();
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ۨܰ") ^ i4) * (-15);
                        i = ((iM2761 ^ i3) * 11229) ^ 36836558;
                        i2 = -1465800336;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-14591)) ^ 1422642898;
                        i2 = -844217800;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1161184089:
                case 601626935:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ۨܰ") ^ i4) * (-15);
                        i = ((iM2761 ^ i3) * 11229) ^ 36836558;
                        i2 = -1465800336;
                    } else {
                        iM2761 = (C0619.m2761("֫ۢ") + i3) * 85;
                        i = ((iM2761 ^ i4) * (-10609)) ^ 930787308;
                        i2 = 2085360041;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1137621345:
                case 1922474473:
                    sArr = f43901;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۘۨ") ^ i4;
                        i = ((iM2761 ^ i3) * (-12601)) ^ (-887445058);
                        i2 = -1640076882;
                    } else {
                        iM2761 = (C0773.m3169("۠ۙ") ^ i4) * (-107);
                        i = ((iM2761 ^ i3) * 22033) ^ (-658500364);
                        i2 = -1785237931;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1087318962:
                case 1299310188:
                    RunnableC3055.m9933();
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ܳۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i3) * (-19893)) ^ 1469933721;
                        i2 = -138485898;
                    } else {
                        iM2761 = (C0773.m3169("ۨܰ") ^ i4) * (-15);
                        i = ((iM2761 ^ i3) * 11229) ^ 36836558;
                        i2 = -1465800336;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -965982152:
                case 1444802687:
                    C20932.m47848();
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۨܰ") ^ i4) * (-15);
                        i = ((iM2761 ^ i3) * 11229) ^ 36836558;
                        i2 = -1465800336;
                    } else {
                        iM2761 = C0773.m3169("ۢۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-27963)) ^ (-724310711);
                        i2 = -608719249;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -925196991:
                case -519950608:
                    i8 = 24186724;
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("ۘۨ") ^ i4;
                        i = ((iM2761 ^ i3) * (-12601)) ^ (-887445058);
                        i2 = -1640076882;
                    } else {
                        iM2761 = (C0619.m2761("ۚ֨") + i4) * 41;
                        i = ((iM2761 ^ i3) * (-2593)) ^ (-689509919);
                        i2 = 1094196091;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -368657778:
                case 49815872:
                    s = sArr[c];
                    i7 = s * s;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۘۨ") ^ i4;
                        i = ((iM2761 ^ i3) * (-12601)) ^ (-887445058);
                        i2 = -1640076882;
                    } else {
                        iM2761 = (C0773.m3169("֨᩸") + i3) * (-19);
                        i = ((iM2761 ^ i4) * (-13595)) ^ 1036630430;
                        i2 = -1624489995;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -351097420:
                case 859391464:
                    i10 = 23638;
                    iM2761 = C0773.m3169("ۧ۫") ^ i4;
                    i = ((iM2761 ^ i3) * (-12745)) ^ 942117279;
                    i2 = -559437613;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -324757790:
                case 544105111:
                    activityC3409M11768 = AbstractC3624.m11768(this);
                    sArr2 = f43901;
                    i11 = 172;
                    if (C3492.m11488()) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-7423)) ^ (-551526506);
                        i2 = -1430594886;
                    } else {
                        iM2761 = C0773.m3169("ۢۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-27963)) ^ (-724310711);
                        i2 = -608719249;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -219625538:
                case 781145221:
                    strM12149 = C3734.m12149(sArr2, i11, 3, i10);
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-14591)) ^ 1422642898;
                        i2 = -844217800;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * (-11591)) ^ (-1647090306);
                        i2 = 457068941;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -52501909:
                case 531251573:
                    iM31610 = 2125787237 ^ C0773.m3169(strM12149);
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۢۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-27963)) ^ (-724310711);
                        i2 = -608719249;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-7013)) ^ 1821605132;
                        i2 = 414182852;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 949557422:
                case 1069794166:
                    ((ActivityC0848) AbstractC3624.m11768(this)).m3428((CharSequence) null);
                    break;
                case 2103950860:
                case 2126028600:
                    C1783.m6232();
                    break;
                default:
                    C13473.m33144();
                    iM2761 = (i4 - C0773.m3169("ܳۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2761 ^ i3) * (-19893)) ^ 1469933721;
                    i2 = -138485898;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public void m33766() {
        ActivityC3409 activityC3409M11768 = null;
        ActivityC0848 activityC0848 = null;
        TextView textViewM3433 = null;
        C17930 c17930M51317 = null;
        String str = null;
        int i = -1776590656;
        int i2 = C2354.f7599;
        int i3 = C4282.f15546;
        int iM3169 = (C0773.m3169("ۢۖ") + i3) * (-93);
        int i4 = ((iM3169 ^ i2) * (-11545)) ^ (-529647830);
        int i5 = 738142711;
        while (true) {
            i = ((((i ^ i2) * 26137) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1945676682:
                case 2006765042:
                    str = (String) c17930M51317.m40346();
                    if (str != null) {
                        iM3169 = C0619.m2761("ܳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11107)) ^ (-184555326);
                        i5 = 2046892479;
                    } else {
                        iM3169 = (C0773.m3169("֨ۘ") ^ i3) * (-127);
                        i4 = ((iM3169 ^ i2) * (-8151)) ^ (-1696306094);
                        i5 = -188092909;
                    }
                    break;
                case -1719173687:
                case -658177547:
                    textViewM3433 = activityC0848.m3433();
                    if (this.f43905.m36517() == 0) {
                        iM3169 = C0773.m3169("᩹ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26573)) ^ (-242564033);
                        i5 = 1103002994;
                    } else {
                        iM3169 = (C0773.m3169("֨ۘ") ^ i3) * (-127);
                        i4 = ((iM3169 ^ i2) * (-8151)) ^ (-1696306094);
                        i5 = -188092909;
                    }
                    break;
                case -1681080436:
                case 1595644843:
                    activityC3409M11768 = AbstractC3624.m11768(this);
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-769)) ^ 158567149;
                        i5 = 83645805;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۖ") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * 23659) ^ (-207695567);
                        i5 = 551380174;
                    }
                    break;
                case -1452541647:
                case -1297476468:
                    activityC0848.m3428((CharSequence) this.f43906);
                    break;
                case -1452290949:
                case 1840706548:
                    textViewM3433.setEllipsize(TextUtils.TruncateAt.START);
                    iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-13);
                    i4 = ((iM3169 ^ i2) * 15611) ^ 983070543;
                    i5 = -1864653882;
                    break;
                case -1298300835:
                case -145295664:
                    C23916.m53419();
                    iM3169 = (C0773.m3169("۫ۖ") ^ i2) * 61;
                    i4 = ((iM3169 ^ i3) * 13763) ^ (-13725748);
                    i5 = -1515499010;
                    break;
                case -1285511548:
                case 658380845:
                    activityC0848.m3428((CharSequence) C18969.m44066(100, str));
                    break;
                case -1097608472:
                case -100069546:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۖ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15247)) ^ (-1188348846);
                        i5 = 1731601802;
                    } else {
                        iM3169 = (C0773.m3169("ۨܰ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 17533) ^ 93031308;
                        i5 = -300108324;
                    }
                    break;
                case -1028003375:
                case 197190963:
                    C23916.m53419();
                    break;
                case -879220194:
                case 1452148156:
                    C1321.m4852();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۖ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15247)) ^ (-1188348846);
                        i5 = 1731601802;
                    } else {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i2) * 61;
                        i4 = ((iM3169 ^ i3) * 13763) ^ (-13725748);
                        i5 = -1515499010;
                    }
                    break;
                case -814418053:
                case 1784984639:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-769)) ^ 158567149;
                        i5 = 83645805;
                    } else {
                        iM3169 = (C0619.m2761("۟۟") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * 32245) ^ (-451100887);
                        i5 = -453825771;
                    }
                    break;
                case -774025419:
                case -391816100:
                    c17930M51317 = this.f43903.m51317();
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("ۖ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15247)) ^ (-1188348846);
                        i5 = 1731601802;
                    } else {
                        iM3169 = (C0619.m2761("ᩳۖ") ^ i3) * 19;
                        i4 = ((iM3169 ^ i2) * (-22899)) ^ (-1341260722);
                        i5 = 1005501076;
                    }
                    break;
                case -534618107:
                case 706160357:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i2) * 61;
                        i4 = ((iM3169 ^ i3) * 13763) ^ (-13725748);
                        i5 = -1515499010;
                    } else {
                        iM3169 = C0619.m2761("᩵֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6787) ^ (-1684007594);
                        i5 = -605910236;
                    }
                    break;
                case -362678744:
                case 1466702160:
                    if (textViewM3433 != null) {
                        iM3169 = C0619.m2761("᩹ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4069) ^ 1012808052;
                        i5 = 1226209083;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-13);
                        i4 = ((iM3169 ^ i2) * 15611) ^ 983070543;
                        i5 = -1864653882;
                    }
                    break;
                case -231708612:
                case 1496079885:
                    activityC0848 = (ActivityC0848) activityC3409M11768;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-769)) ^ 158567149;
                        i5 = 83645805;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩵᩸")) * 89;
                        i4 = ((iM3169 ^ i3) * (-9593)) ^ 2059111468;
                        i5 = -386269808;
                    }
                    break;
                case -12448286:
                case 1777995190:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-769)) ^ 158567149;
                        i5 = 83645805;
                    } else {
                        iM3169 = C0773.m3169("᩹ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31325) ^ 92240849;
                        i5 = -573390739;
                    }
                    break;
                case 271456797:
                case 580010956:
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i2) * 61;
                        i4 = ((iM3169 ^ i3) * 13763) ^ (-13725748);
                        i5 = -1515499010;
                    } else {
                        iM3169 = C0619.m2761("֫᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19671) ^ (-1649759709);
                        i5 = 787681622;
                    }
                    break;
                case 303835773:
                case 1072741211:
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-769)) ^ 158567149;
                        i5 = 83645805;
                    } else {
                        iM3169 = C0619.m2761("ܿ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13683) ^ 110382556;
                        i5 = 1595152742;
                    }
                    break;
                case 395598638:
                case 1588982556:
                    textViewM3433.setEllipsize(TextUtils.TruncateAt.END);
                    iM3169 = C0619.m2761("᩻ۖ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-7165)) ^ 353317383;
                    i5 = 956877594;
                    break;
                case 487796895:
                case 871152566:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۧ۠") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 25199) ^ (-1106493500);
                        i5 = 837104500;
                    } else {
                        iM3169 = C0619.m2761("ۖ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15247)) ^ (-1188348846);
                        i5 = 1731601802;
                    }
                    break;
                case 542953754:
                case 549119726:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ۧ۠") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 25199) ^ (-1106493500);
                        i5 = 837104500;
                    } else {
                        iM3169 = C0619.m2761("ܽܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14155)) ^ 983830439;
                        i5 = -1921786212;
                    }
                    break;
                case 635761501:
                case 1303507571:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ۧ۠") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 25199) ^ (-1106493500);
                        i5 = 837104500;
                    } else {
                        iM3169 = C0773.m3169("ܳۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29497)) ^ 837602013;
                        i5 = 103881416;
                    }
                    break;
                default:
                    if (textViewM3433 != null) {
                        iM3169 = C0619.m2761("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7735)) ^ 263739140;
                        i5 = 859243064;
                    } else {
                        iM3169 = C0619.m2761("᩻ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7165)) ^ 353317383;
                        i5 = 956877594;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33761(C13831 c13831, Bundle bundle, Spinner spinner, C1255 c1255, C1255 c1256, C1255 c1257, C1255 c1258, C1255 c1259, C1255 c12510, C1255 c12511) {
        int iM3169;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM2761;
        int i4;
        int i5;
        int i6 = C1146.f4234;
        int i7 = C2354.f7599;
        int iM2762 = C0619.m2761("᩺ۤ") ^ i6;
        int i8 = ((iM2762 ^ i7) * (-25137)) ^ (-1829489785);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i9 = iM2762 ^ (-1229890306);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1749328913;
        int i21 = 0;
        short[] sArr8 = null;
        boolean zM8360 = false;
        while (true) {
            i20 = i9 ^ (i8 & (((i20 ^ i7) * 6877) >> 31));
            switch (i20) {
                case -2015318049:
                case 1133643046:
                    C3492.m11484(bundle, AbstractC3624.m11769(sArr7, i12, i13, i11), C2485.m8360(c12510));
                    c13831.f43904.m46602();
                    zM8360 = C2485.m8360(c12511);
                    if (C23916.f77426 <= 0) {
                        sArr3 = sArr3;
                        i10 = i10;
                        int iM2763 = C0619.m2761("֨ۚ") ^ i6;
                        i4 = ((iM2763 ^ i7) * 11771) ^ (-1918909617);
                        i9 = iM2763 ^ 185992924;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    } else {
                        int iM2764 = C0619.m2761("ܺ۬") ^ i7;
                        i8 = ((iM2764 ^ i6) * (-31279)) ^ (-577891671);
                        i9 = iM2764 ^ 2068155836;
                    }
                    break;
                case -1874870691:
                case 1477111767:
                    i11 = 49584;
                    iM2761 = C0619.m2761("ܺۗ") ^ i7;
                    i4 = ((iM2761 ^ i6) * 27287) ^ 1187668367;
                    i5 = -178822527;
                    i9 = iM2761 ^ i5;
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -1712252726:
                case 234172304:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM8360 = zM8360;
                    i10 = i10;
                    sArr8 = f43901;
                    if (C2419.m8174() < 0) {
                        iM2761 = C0619.m2761("ᩳᩳ") ^ i7;
                        i4 = ((iM2761 ^ i6) * (-5319)) ^ 1263335436;
                        i5 = -884265596;
                        i9 = iM2761 ^ i5;
                        zM8360 = zM8360;
                        sArr2 = sArr2;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    }
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    int iM2765 = C0619.m2761("֨ۚ") ^ i6;
                    i4 = ((iM2765 ^ i7) * 11771) ^ (-1918909617);
                    i9 = iM2765 ^ 185992924;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -1548253821:
                case -713389190:
                    i11 = 13174;
                    iM2761 = C0619.m2761("ܺۗ") ^ i7;
                    i4 = ((iM2761 ^ i6) * 27287) ^ 1187668367;
                    i5 = -178822527;
                    i9 = iM2761 ^ i5;
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -1318082598:
                case 1698139596:
                    zM8360 = zM8360;
                    sArr3 = sArr3;
                    i10 = i10;
                    bundle.putInt(C13473.m33137(f43901, 39, 15, i11), spinner.getSelectedItemPosition());
                    sArr2 = f43901;
                    i18 = 54;
                    if (C3099.f10023 > 0) {
                        iM2761 = (C0773.m3169("ۚܺ") ^ i6) * 47;
                        i4 = ((iM2761 ^ i7) * 12987) ^ 2066979765;
                        i5 = 972243223;
                        i9 = iM2761 ^ i5;
                        zM8360 = zM8360;
                        sArr2 = sArr2;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    }
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    int iM2766 = C0619.m2761("֨ۚ") ^ i6;
                    i4 = ((iM2766 ^ i7) * 11771) ^ (-1918909617);
                    i9 = iM2766 ^ 185992924;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -1150292244:
                case 821656131:
                    C2310.m7813();
                    iM3169 = C0773.m3169("۠֫") ^ i7;
                    i = ((iM3169 ^ i6) * (-14851)) ^ (-1649301199);
                    i2 = -1969233817;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case -935787334:
                case 272210226:
                    C2419.m8170(bundle, C2485.m8350(sArr6, i17, i10, i11), C2485.m8360(c1259));
                    sArr7 = f43901;
                    i12 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i13 = 14;
                    if (AbstractC3624.m11755() == 0) {
                        iM3169 = C0619.m2761("ۗ֨") ^ i6;
                        i = ((iM3169 ^ i7) * 4605) ^ (-1346150034);
                        i2 = 932784236;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr4;
                        sArr3 = sArr3;
                        i3 = i21;
                        int iM31610 = C0773.m3169("ۚۧ") ^ i6;
                        short[] sArr9 = sArr;
                        i8 = ((iM31610 ^ i7) * (-9873)) ^ (-2049032838);
                        i21 = i3;
                        sArr4 = sArr9;
                        i9 = iM31610 ^ (-1045150937);
                        sArr3 = sArr3;
                    }
                    break;
                case -429175681:
                case 1496749043:
                    C3492.m11484(bundle, C2023.m6966(sArr5, i16, 15, i11), C2485.m8360(c1258));
                    sArr6 = f43901;
                    i17 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = 12;
                    if (C3690.f12684 > 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i7;
                        i = ((iM3169 ^ i6) * 31995) ^ 13383976;
                        i2 = 1482281304;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr4;
                        sArr3 = sArr3;
                        i3 = i21;
                        int iM31611 = C0773.m3169("ۚۧ") ^ i6;
                        short[] sArr10 = sArr;
                        i8 = ((iM31611 ^ i7) * (-9873)) ^ (-2049032838);
                        i21 = i3;
                        sArr4 = sArr10;
                        i9 = iM31611 ^ (-1045150937);
                        sArr3 = sArr3;
                    }
                    break;
                case -362029289:
                case -349871394:
                    C6421.m18184(ApplicationC17729.f58258, AbstractC0641.m2820(f43901, 131, 4, i11), zM8360);
                    break;
                case -258079073:
                case 1819874178:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM8360 = zM8360;
                    i10 = i10;
                    if (i19 > 0) {
                        iM2761 = C0619.m2761("ۗ۟") ^ i6;
                        i4 = ((iM2761 ^ i7) * (-16885)) ^ (-1545718033);
                        i5 = -795337028;
                        i9 = iM2761 ^ i5;
                        zM8360 = zM8360;
                        sArr2 = sArr2;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    }
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    int iM2767 = C0619.m2761("֨ۚ") ^ i6;
                    i4 = ((iM2767 ^ i7) * 11771) ^ (-1918909617);
                    i9 = iM2767 ^ 185992924;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -225582941:
                case 1909311080:
                    if (C0950.f3488 >= 0) {
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        zM8360 = zM8360;
                        i10 = i10;
                        iM2761 = (C0773.m3169("ᩴۘ") + i7) * 57;
                        i4 = ((iM2761 ^ i6) * (-7993)) ^ 695842543;
                        i5 = 1593038314;
                        i9 = iM2761 ^ i5;
                        zM8360 = zM8360;
                        sArr2 = sArr2;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    }
                    sArr3 = sArr3;
                    i10 = i10;
                    int iM2768 = C0619.m2761("֨ۚ") ^ i6;
                    i4 = ((iM2768 ^ i7) * 11771) ^ (-1918909617);
                    i9 = iM2768 ^ 185992924;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case -16082091:
                case 343019095:
                    C2419.m8170(bundle, C0862.m3500(sArr4, i14, i15, i11), C2485.m8360(c1257));
                    sArr5 = f43901;
                    i16 = 90;
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("᩺᩻") ^ i6;
                        i = ((iM3169 ^ i7) * (-9389)) ^ (-120218666);
                        i2 = -449539122;
                    } else {
                        iM3169 = C0773.m3169("֡᩸") ^ i6;
                        i = ((iM3169 ^ i7) * (-3013)) ^ (-1926045749);
                        i2 = -380697338;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 113981782:
                case 700240793:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM8360 = zM8360;
                    i10 = i10;
                    i19 = C2288.f7433;
                    iM2761 = C0619.m2761("ܿ᩺") ^ i7;
                    i4 = ((iM2761 ^ i6) * 26667) ^ 1317058078;
                    i5 = -65412855;
                    i9 = iM2761 ^ i5;
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case 256152626:
                case 1431208589:
                    if (C2878.m9491() <= 0) {
                        sArr = sArr4;
                        sArr3 = sArr3;
                        i3 = i21;
                        int iM31612 = C0773.m3169("ۚۧ") ^ i6;
                        short[] sArr11 = sArr;
                        i8 = ((iM31612 ^ i7) * (-9873)) ^ (-2049032838);
                        i21 = i3;
                        sArr4 = sArr11;
                        i9 = iM31612 ^ (-1045150937);
                        sArr3 = sArr3;
                    } else {
                        iM3169 = C0773.m3169("۠֫") ^ i7;
                        i = ((iM3169 ^ i6) * (-14851)) ^ (-1649301199);
                        i2 = -1969233817;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    }
                    break;
                case 298483354:
                case 1529375348:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM8360 = zM8360;
                    i10 = i10;
                    short s = sArr8[38];
                    int i22 = s + 11556;
                    int i23 = (s * s) + 133541136;
                    if ((i22 * i22) - (i23 + i23) > 0) {
                        iM2761 = C0619.m2761("ۗ֡") ^ i6;
                        i4 = ((iM2761 ^ i7) * 25029) ^ 339781601;
                        i5 = 1694698706;
                    } else {
                        iM2761 = (i7 - C0619.m2761("֨֡")) * 91;
                        i4 = ((iM2761 ^ i6) * 9853) ^ (-669404167);
                        i5 = -1042501648;
                    }
                    i9 = iM2761 ^ i5;
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
                case 452932412:
                case 1390655480:
                    C1542.m5459();
                    break;
                case 647701342:
                case 896249095:
                    sArr3 = sArr3;
                    i3 = i21;
                    C3492.m11484(bundle, C2023.m6966(sArr3, i3, 11, i11), C2485.m8360(c1256));
                    sArr = f43901;
                    i15 = 12;
                    if (C3998.f13671 != 0) {
                        i14 = 78;
                        int iM31613 = C0773.m3169("ۚۧ") ^ i6;
                        short[] sArr12 = sArr;
                        i8 = ((iM31613 ^ i7) * (-9873)) ^ (-2049032838);
                        i21 = i3;
                        sArr4 = sArr12;
                        i9 = iM31613 ^ (-1045150937);
                        sArr3 = sArr3;
                    } else {
                        int iM2769 = C0619.m2761("֫ۗ") ^ i7;
                        int i24 = ((iM2769 ^ i6) * (-10911)) ^ 998692700;
                        i21 = i3;
                        i9 = iM2769 ^ 1869227081;
                        sArr4 = sArr;
                        sArr3 = sArr3;
                        i8 = i24;
                        i14 = 78;
                    }
                    break;
                case 727156107:
                case 2028595262:
                    C3998.m12920();
                    if (AbstractC3624.f12429 <= 0) {
                        sArr3 = sArr3;
                        i10 = i10;
                        int iM27610 = C0619.m2761("֨ۚ") ^ i6;
                        i4 = ((iM27610 ^ i7) * 11771) ^ (-1918909617);
                        i9 = iM27610 ^ 185992924;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    } else {
                        iM3169 = C0773.m3169("۠֫") ^ i7;
                        i = ((iM3169 ^ i6) * (-14851)) ^ (-1649301199);
                        i2 = -1969233817;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    }
                    break;
                case 1063324294:
                case 1606207913:
                    short[] sArr13 = sArr2;
                    zM8360 = zM8360;
                    C3492.m11484(bundle, C17202.m40377(sArr13, i18, 13, i11), C2485.m8360(c1255));
                    sArr3 = f43901;
                    i21 = 67;
                    if (RunnableC3646.f12471) {
                        sArr2 = sArr13;
                        sArr3 = sArr3;
                        i10 = i10;
                        iM2761 = (C0773.m3169("ᩴۘ") + i7) * 57;
                        i4 = ((iM2761 ^ i6) * (-7993)) ^ 695842543;
                        i5 = 1593038314;
                        i9 = iM2761 ^ i5;
                        zM8360 = zM8360;
                        sArr2 = sArr2;
                        i8 = i4;
                        i10 = i10;
                        sArr3 = sArr3;
                    } else {
                        int iM31614 = (C0773.m3169("᩷᩷") + i6) * 29;
                        i9 = iM31614 ^ (-662391100);
                        i8 = ((iM31614 ^ i7) * 10167) ^ 2114887551;
                        zM8360 = zM8360;
                        sArr2 = sArr13;
                    }
                    break;
                default:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM8360 = zM8360;
                    i10 = i10;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("ᩴۘ") + i7) * 57;
                        i4 = ((iM2761 ^ i6) * (-7993)) ^ 695842543;
                        i5 = 1593038314;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܺۖ")) * 45;
                        i4 = ((iM2761 ^ i7) * (-24667)) ^ (-2071415124);
                        i5 = -1663178396;
                    }
                    i9 = iM2761 ^ i5;
                    zM8360 = zM8360;
                    sArr2 = sArr2;
                    i8 = i4;
                    i10 = i10;
                    sArr3 = sArr3;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (l.C2354.f7599 < 0) goto L14;
     */
    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1437() {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13831.mo1437():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e3 A[PHI: r13
      0x00e3: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:30:0x00e1, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x021d A[PHI: r1 r6 r12
      0x021d: PHI (r1v4 l.ۗ۫ۙ) = (r1v2 l.ۗ۫ۙ), (r1v3 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ) binds: [B:59:0x021b, B:34:0x011b, B:12:0x0074, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:59:0x021b, B:34:0x011b, B:12:0x0074, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:59:0x021b, B:34:0x011b, B:12:0x0074, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024e A[PHI: r5 r10
      0x024e: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:63:0x024c, B:47:0x01aa, B:17:0x007e, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:63:0x024c, B:47:0x01aa, B:17:0x007e, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x027e A[PHI: r2 r3 r9 r18
      0x027e: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:67:0x027c, B:51:0x01c9, B:26:0x00c2, B:22:0x009f, B:15:0x007a, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:67:0x027c, B:51:0x01c9, B:26:0x00c2, B:22:0x009f, B:15:0x007a, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:67:0x027c, B:51:0x01c9, B:26:0x00c2, B:22:0x009f, B:15:0x007a, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:67:0x027c, B:51:0x01c9, B:26:0x00c2, B:22:0x009f, B:15:0x007a, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0269.f1558;
        int i4 = C2354.f7599;
        int iM2761 = C0619.m2761("ۘ۬") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-11089)) ^ 1768114934;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1738505046);
        ActivityC3409 activityC3409M1234 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1769925142;
        String strM2049 = null;
        int iM2762 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 1917) >> 31));
            switch (i12) {
                case -2124534491:
                case -1620549458:
                    C3734.m12152();
                    C2966.m9664();
                    iM3169 = (C0773.m3169("۬᩶") ^ i3) * 101;
                    i = ((iM3169 ^ i4) * 2891) ^ (-1792476746);
                    i2 = 315284295;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2096153456:
                case 930086251:
                    C13473.m33144();
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    } else {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16413)) ^ 407728985;
                        i2 = -1279391301;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1926809980:
                case -284434756:
                    i11 = 390;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i3 - C0619.m2761("۟۫")) * (-75);
                        i = ((iM3169 ^ i4) * 4025) ^ (-732482020);
                        i2 = -1516314209;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡ֨")) * 89;
                        i = ((iM3169 ^ i4) * 22295) ^ 754809349;
                        i2 = -1435159156;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1922281097:
                case 1545138416:
                    s2 = 17359;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("۬᩶") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * 2891) ^ (-1792476746);
                        i2 = 315284295;
                    } else {
                        iM3169 = C0773.m3169("ۧۜ") ^ i3;
                        i = ((iM3169 ^ i4) * (-4733)) ^ 2004251181;
                        i2 = 1281042661;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1729503229:
                case 6124092:
                    int i13 = i7 + i8;
                    i9 = i13 + i13;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") + i4) * (-125);
                        i = ((iM3169 ^ i3) * (-22513)) ^ (-1367624802);
                        i2 = 232550975;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1661441824:
                case 986086072:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("۬᩶") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * 2891) ^ (-1792476746);
                        i2 = 315284295;
                    } else {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1570678346:
                case -601671989:
                    activityC3409M1234.setTitle(iM2762);
                    m33766();
                    iM3169 = C0773.m3169("᩺᩸") ^ i4;
                    i = ((iM3169 ^ i3) * (-23177)) ^ 1336625212;
                    i2 = -712234288;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1274171890:
                case 340504875:
                    C0487.m2356();
                    C2834.m9344();
                    break;
                case -1245467242:
                case 148497872:
                    c = 389;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("۬᩶") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * 2891) ^ (-1792476746);
                        i2 = 315284295;
                    } else {
                        iM3169 = C0773.m3169("ۤ۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-13339)) ^ 1659262339;
                        i2 = -724988699;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -994820989:
                case -909960046:
                    iM2762 = 2126870680 ^ C0619.m2761(strM2049);
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۚ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 24905) ^ 323199418;
                        i2 = -173965786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -984875532:
                case -857750487:
                    strM2049 = RunnableC0334.m2049(sArr2, i11, 3, i10);
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    } else {
                        iM3169 = (C0773.m3169("۬᩷") + i4) * 119;
                        i = ((iM3169 ^ i3) * (-13149)) ^ 964425063;
                        i2 = -643808626;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -777496703:
                case -439559088:
                    activityC3409M1234 = AbstractC0116.m1234(this);
                    sArr2 = f43901;
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16413)) ^ 407728985;
                        i2 = -1279391301;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۛ") ^ i3) * (-119);
                        i = ((iM3169 ^ i4) * (-3993)) ^ (-171507509);
                        i2 = -374657863;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -775393998:
                case 1709377171:
                    i10 = 44923;
                    iM3169 = (C0773.m3169("ܰܶ") ^ i3) * 79;
                    i = ((iM3169 ^ i4) * (-12559)) ^ (-471685915);
                    i2 = -100858029;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -42738566:
                case 1188407296:
                    i10 = 25468;
                    iM3169 = (C0773.m3169("ܰܶ") ^ i3) * 79;
                    i = ((iM3169 ^ i4) * (-12559)) ^ (-471685915);
                    i2 = -100858029;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 134239790:
                case 2000242477:
                    sArr = f43901;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5041)) ^ (-527877651);
                        i2 = 289339520;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 32429) ^ (-1457502726);
                        i2 = 664765548;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 385471746:
                case 1401489575:
                    i7 = s * s;
                    i8 = 301334881;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۤ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 15533) ^ 637264148;
                        i2 = -975775510;
                    } else {
                        iM3169 = C0773.m3169("۟ܰ") ^ i4;
                        i = ((iM3169 ^ i3) * (-20347)) ^ (-835743351);
                        i2 = -1875007587;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 689928253:
                case 1151949309:
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16413)) ^ 407728985;
                        i2 = -1279391301;
                    } else {
                        iM3169 = (C0773.m3169("᩵ܿ") ^ i3) * (-81);
                        i = ((iM3169 ^ i4) * (-7889)) ^ 1245228288;
                        i2 = 1501450076;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1173318782:
                case 1849015557:
                    break;
                case 1437999467:
                case 1537032121:
                    if (C3998.f13671 == 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16413)) ^ 407728985;
                        i2 = -1279391301;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۟۫")) * (-75);
                        i = ((iM3169 ^ i4) * 4025) ^ (-732482020);
                        i2 = -1516314209;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1567894710:
                case 1866329828:
                    super.onResume();
                    if (isHidden()) {
                        iM3169 = C0773.m3169("᩺᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-23177)) ^ 1336625212;
                        i2 = -712234288;
                    } else {
                        iM3169 = (C0773.m3169("֫ܳ") + i4) * (-61);
                        i = ((iM3169 ^ i3) * (-1007)) ^ 1417026870;
                        i2 = 1230664937;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) >= 0) {
                        iM3169 = (C0773.m3169("ۜ᩵") + i4) * (-61);
                        i = ((iM3169 ^ i3) * (-31029)) ^ (-317246602);
                        i2 = -567208005;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܽ᩺")) * (-89);
                        i = ((iM3169 ^ i4) * 6959) ^ (-105926237);
                        i2 = -181448035;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        if (l.C1146.f4234 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m33763(final l.C13831 r48, final l.ActivityC0848 r49) {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13831.m33763(l.۬ۨۧ, l.֨֫ۧ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33762(C13831 c13831, String str) {
        C20283 c20283 = null;
        List listM46570 = null;
        C20283 c20284 = null;
        int i = 0;
        Object objM11998 = null;
        int i2 = 1530188879;
        int i3 = C0487.f2131;
        int i4 = C0773.f2792;
        int iM3169 = C0773.m3169("ۨۙ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-22845)) ^ 874178657;
        int i6 = -1459036956;
        while (true) {
            i2 = ((((i2 ^ i4) * 7021) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2082029629:
                case -1576811389:
                    break;
                case -1715669062:
                case -1028371364:
                    if (c13831.isHidden()) {
                        iM3169 = C0619.m2761("ۖ۬") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-12389)) ^ (-323857123);
                        i6 = -1250797235;
                    } else {
                        iM3169 = (C0619.m2761("ܿۤ") ^ i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-11267)) ^ 673052743;
                        i6 = -247580763;
                    }
                    break;
                case -1665482876:
                case 1474646066:
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ۧᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20351)) ^ 330204111;
                        i6 = -543559112;
                    } else {
                        iM3169 = (C0619.m2761("ۨܶ") + i3) * 77;
                        i5 = ((iM3169 ^ i4) * 8919) ^ 869081489;
                        i6 = -412171333;
                    }
                    break;
                case -1635865911:
                case 1554533429:
                    if (C3448.m11247(listM46570) == 1) {
                        iM3169 = (C0619.m2761("ۛ۟") ^ i3) * (-89);
                        i5 = ((iM3169 ^ i4) * 22701) ^ (-1119005317);
                        i6 = -2039149311;
                    } else {
                        iM3169 = C0773.m3169("᩹ۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29217)) ^ (-585853674);
                        i6 = 629519687;
                    }
                    break;
                case -1572811625:
                case 1609930213:
                    c20284 = c13831.f43904;
                    i = 0;
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("ܶۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25771) ^ (-595060843);
                        i6 = -822914759;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۙ") + i3) * (-103);
                        i5 = ((iM3169 ^ i4) * (-16747)) ^ 1291085192;
                        i6 = 1103010628;
                    }
                    break;
                case -1404840632:
                case 34781503:
                    c13831.f43906 = c20284.m46569((String) objM11998);
                    iM3169 = C0619.m2761("᩷᩺") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-1273)) ^ 1883817176;
                    i6 = -1339459050;
                    break;
                case -1392018691:
                case -766814353:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ܶۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25771) ^ (-595060843);
                        i6 = -822914759;
                    } else {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28861)) ^ 131521185;
                        i6 = 1189873851;
                    }
                    break;
                case -1099348211:
                case -977914196:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ܰۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30137) ^ 936149594;
                        i6 = 1631644166;
                    } else {
                        iM3169 = (C0773.m3169("ܽۧ") ^ i4) * (-63);
                        i5 = ((iM3169 ^ i3) * 2579) ^ (-1311008637);
                        i6 = 415449381;
                    }
                    break;
                case -849656785:
                case -645730225:
                    if (C0269.m1775() > 0) {
                        iM3169 = C0619.m2761("ᩳۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4125) ^ 1992270815;
                        i6 = 2141015154;
                    } else {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28861)) ^ 131521185;
                        i6 = 1189873851;
                    }
                    break;
                case -777915621:
                case 334161341:
                    objM11998 = C3690.m11998(listM46570, i);
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("ܰۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30137) ^ 936149594;
                        i6 = 1631644166;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۤ") ^ i4) * (-45);
                        i5 = ((iM3169 ^ i3) * 25509) ^ 100135154;
                        i6 = 1981345073;
                    }
                    break;
                case -768219642:
                case -600208156:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28861)) ^ 131521185;
                        i6 = 1189873851;
                    } else {
                        iM3169 = C0619.m2761("ܶܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20579)) ^ 280641838;
                        i6 = -1001434504;
                    }
                    break;
                case -750849062:
                case 1676612171:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ᩳۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4125) ^ 1992270815;
                        i6 = 2141015154;
                    } else {
                        iM3169 = C0619.m2761("֫֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4127)) ^ 440027214;
                        i6 = 597364286;
                    }
                    break;
                case -531790663:
                case 1161864635:
                    listM46570 = c13831.f43904.m46570();
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ᩳۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4125) ^ 1992270815;
                        i6 = 2141015154;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܺ᩹")) * (-65);
                        i5 = ((iM3169 ^ i3) * (-20189)) ^ (-1916801450);
                        i6 = -1163216029;
                    }
                    break;
                case -526792347:
                case -365285099:
                    c20283 = c13831.f43904;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ᩳۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4125) ^ 1992270815;
                        i6 = 2141015154;
                    } else {
                        iM3169 = C0619.m2761("ۡ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21567) ^ 1010358669;
                        i6 = -2073402179;
                    }
                    break;
                case -462408312:
                case 1359332289:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("ܶۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25771) ^ (-595060843);
                        i6 = -822914759;
                    } else {
                        iM3169 = C0619.m2761("ܽۘ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-13981)) ^ 795146472;
                        i6 = 1083502609;
                    }
                    break;
                case -151732162:
                case 108775062:
                    C11972.m30021(c20283);
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۧᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20351)) ^ 330204111;
                        i6 = -543559112;
                    } else {
                        iM3169 = (C0619.m2761("ۨ᩶") + i3) * 65;
                        i5 = ((iM3169 ^ i4) * 543) ^ 752015187;
                        i6 = 340632991;
                    }
                    break;
                case 151480189:
                case 1982941350:
                    C4238.m13540();
                    iM3169 = C0619.m2761("᩵ܽ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-28861)) ^ 131521185;
                    i6 = 1189873851;
                    break;
                case 218107406:
                case 934113669:
                    C3448.m11248();
                    if (C2375.m8065() > 0) {
                        iM3169 = C0619.m2761("ܰۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30137) ^ 936149594;
                        i6 = 1631644166;
                    } else {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28861)) ^ 131521185;
                        i6 = 1189873851;
                    }
                    break;
                case 485995129:
                case 2058767754:
                    c13831.m33766();
                    iM3169 = C0619.m2761("ۖ۬") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-12389)) ^ (-323857123);
                    i6 = -1250797235;
                    break;
                case 686413217:
                case 1369339083:
                    C3779.m12264();
                    break;
                default:
                    c13831.f43906 = str;
                    iM3169 = C0619.m2761("᩷᩺") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-1273)) ^ 1883817176;
                    i6 = -1339459050;
                    break;
            }
            return;
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C1255 c1255;
        int i;
        C1255 c1256;
        DialogInterface.OnClickListener onClickListener;
        Bundle bundle;
        C1255 c1257;
        C2361 c2361;
        short[] sArr;
        Spinner spinner;
        C1255 c1258;
        View view;
        C1255 c1259;
        C1255 c12510;
        C1255 c12511;
        int iM2761;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM2762;
        int iM3169;
        int i6;
        int i7;
        C1255 c12512;
        int iM2763;
        int i8;
        int i9;
        DialogInterface.OnClickListener onClickListener2;
        int i10;
        int i11;
        C1255 c12513;
        C1255 c12514;
        C1255 c12515;
        short[] sArr2;
        int i12;
        int iM2764;
        int i13;
        int i14;
        C1255 c12516;
        int iM2765;
        int i15;
        int i16;
        DialogInterface.OnClickListener onClickListener3;
        Bundle bundle2;
        C1255 c12517;
        C1255 c12518;
        C2361 c2362;
        C1255 c12519;
        C1255 c12520;
        C1255 c12521;
        View viewM2812;
        Spinner spinner2;
        C1255 c12522;
        int i17;
        C1255 c12523;
        View view2;
        DialogInterface.OnClickListener onClickListener4;
        Bundle bundle3;
        C1255 c12524;
        C1255 c12525;
        C2361 c2363;
        Spinner spinner3;
        C1255 c12526;
        C1255 c12527;
        int iM31610;
        int i18;
        int i19;
        C1255 c12528;
        DialogInterface.OnClickListener onClickListener5;
        Bundle bundle4;
        C1255 c12529;
        C2361 c2364;
        C1255 c12530;
        Spinner spinner4;
        C1255 c12531;
        View view3;
        C1255 c12532;
        int i20;
        int i21;
        C1255 c12533;
        C2361 c2365;
        Spinner spinner5;
        C1255 c12534;
        View view4;
        C1255 c12535;
        Bundle bundleM46613;
        int iM2766;
        int i22;
        int i23;
        View view5;
        int i24;
        int i25;
        C1255 c12536;
        int i26;
        View view6;
        C2361 c2366;
        C1255 c12537;
        C1255 c12538;
        Spinner spinner6;
        Bundle bundle5;
        C1255 c12539;
        C1255 c12540;
        C7120 c7120;
        DialogInterface.OnClickListener onClickListener6;
        C1255 c12541;
        int iM2767;
        int i27;
        int i28;
        int iM2768;
        int i29;
        int i30;
        C1255 c12542;
        Bundle bundle6;
        C1255 c12543 = null;
        int i31 = C20932.f66974;
        int i32 = C1564.f5401;
        int iM31611 = (C0773.m3169("ۜ۠") ^ i31) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i33 = ((iM31611 ^ i32) * 2807) ^ 28494761;
        C1255 c12544 = null;
        C1255 c12545 = null;
        C1255 c12546 = null;
        String strM11765 = null;
        String strM1785 = null;
        C7120 c7121 = null;
        C2361 c2367 = null;
        DialogInterface.OnClickListener onClickListener7 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i34 = iM31611 ^ (-378986585);
        int i35 = 0;
        int i36 = 0;
        boolean z = false;
        int i37 = 0;
        int iM2769 = 0;
        int iM27610 = 0;
        int iM31612 = 0;
        int i38 = 0;
        int i39 = 0;
        ActivityC0848 activityC0848 = null;
        C1255 c12547 = null;
        C1255 c12548 = null;
        Bundle bundle7 = null;
        String strM8350 = null;
        ActivityC0848 activityC0849 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i40 = -352041751;
        View view7 = null;
        final C1255 c12549 = null;
        Spinner spinner7 = null;
        C1255 c12550 = null;
        while (true) {
            i40 = i34 ^ (i33 & (((i40 ^ i32) * 22219) >> 31));
            switch (i40) {
                case -2095816953:
                case -865108801:
                    activityC0849.m3458();
                    return z2;
                case -2086795764:
                case -375779675:
                    activityC0849.m3453(z);
                    return z3;
                case -2020674760:
                case 1962446861:
                    activityC0849.m3450();
                    return z3;
                case -2018869949:
                case -1839927778:
                    c12512 = c12545;
                    i35 = i35;
                    c12521 = c12549;
                    c12516 = c12550;
                    View view8 = view7;
                    onClickListener3 = onClickListener7;
                    bundle2 = bundle7;
                    c12517 = c12548;
                    short[] sArr5 = sArr3;
                    int i41 = i38;
                    c12518 = c12543;
                    c2362 = c2367;
                    c12519 = c12547;
                    c12520 = c12544;
                    int i42 = i39;
                    spinner2 = (Spinner) C2834.m9333(view8, C0619.m2761(C1826.m6310(sArr5, i41, i42, i36)) ^ 2102849202);
                    iM2769 = C0619.m2761(C0487.m2361(f43901, 203, 3, i36));
                    if (C0487.f2131 <= 0) {
                        i39 = i42;
                        viewM2812 = view8;
                        sArr3 = sArr5;
                        i38 = i41;
                        int iM27611 = C0619.m2761("ۘܶ") ^ i32;
                        c12549 = c12521;
                        c12548 = c12517;
                        c2367 = c2362;
                        bundle7 = bundle2;
                        i34 = iM27611 ^ (-1030455842);
                        view7 = viewM2812;
                        i33 = ((iM27611 ^ i31) * 8731) ^ (-1376537381);
                        c12544 = c12520;
                        spinner7 = spinner2;
                        c12547 = c12519;
                        c12543 = c12518;
                        onClickListener7 = onClickListener3;
                        c12545 = c12512;
                    } else {
                        int iM27612 = (C0619.m2761("ᩴۖ") ^ i32) * (-113);
                        i39 = i42;
                        c12544 = c12520;
                        c12547 = c12519;
                        c12543 = c12518;
                        c2367 = c2362;
                        onClickListener7 = onClickListener3;
                        bundle7 = bundle2;
                        sArr3 = sArr5;
                        i38 = i41;
                        i34 = iM27612 ^ (-1194401471);
                        i33 = ((iM27612 ^ i31) * (-20137)) ^ (-1120297291);
                        c12548 = c12517;
                        c12545 = c12512;
                        view7 = view8;
                        c12549 = c12521;
                        spinner7 = spinner2;
                    }
                    c12550 = c12516;
                    i35 = i35;
                    break;
                case -1916087133:
                case -1497669440:
                    C17202.m40372();
                    c12536 = c12545;
                    i26 = i35;
                    c12541 = c12550;
                    view6 = view7;
                    c2366 = c2367;
                    c12537 = c12548;
                    c12538 = c12549;
                    spinner6 = spinner7;
                    bundle5 = bundle7;
                    c12539 = c12547;
                    c12540 = c12544;
                    c7120 = c7121;
                    DialogInterface.OnClickListener onClickListener8 = onClickListener7;
                    c12543 = c12543;
                    onClickListener6 = onClickListener8;
                    iM2767 = C0773.m3169("ۢ֫") ^ i32;
                    i27 = ((iM2767 ^ i31) * 13743) ^ 739155501;
                    i28 = 1635154177;
                    i34 = iM2767 ^ i28;
                    c7121 = c7120;
                    c12544 = c12540;
                    c12547 = c12539;
                    c12549 = c12538;
                    bundle7 = bundle5;
                    c12548 = c12537;
                    spinner7 = spinner6;
                    i40 = i40;
                    view7 = view6;
                    c2367 = c2366;
                    i33 = i27;
                    c12550 = c12541;
                    c12545 = c12536;
                    i35 = i26;
                    C1255 c12551 = c12543;
                    onClickListener7 = onClickListener6;
                    c12543 = c12551;
                    break;
                case -1816043730:
                case -446219487:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    z = z;
                    if (i37 == (C0619.m2761(C4238.m13530(f43901, 188, 3, i36)) ^ 2120087766)) {
                        iM3169 = C0619.m2761("ܺ۟") ^ i31;
                        i6 = ((iM3169 ^ i32) * (-15371)) ^ (-1205305032);
                        i7 = 262716136;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۧ") ^ i32) * (-81);
                        i6 = ((iM3169 ^ i31) * (-29987)) ^ 814407031;
                        i7 = -1402107365;
                    }
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -1766488456:
                case 244445882:
                    c12536 = c12545;
                    i26 = i35;
                    C1255 c12552 = c12550;
                    view6 = view7;
                    c2366 = c2367;
                    c12537 = c12548;
                    c12538 = c12549;
                    spinner6 = spinner7;
                    bundle5 = bundle7;
                    c12539 = c12547;
                    c12540 = c12544;
                    c7120 = c7121;
                    DialogInterface.OnClickListener onClickListener9 = onClickListener7;
                    c12543 = c12543;
                    onClickListener6 = onClickListener9;
                    spinner6.setAdapter((SpinnerAdapter) c7120);
                    spinner6.setSelection(C2288.m7764(0, C23916.m53427(6, bundle5.getInt(C0619.m2756(f43901, 272, 15, i36)))));
                    C3448.m11239(c12543, C3099.m10085(bundle5, C0862.m3500(f43901, 287, 13, i36)));
                    c12541 = c12552;
                    C2834.m9338(c12541, C1321.m4854(bundle5, C0773.m3166(f43901, 300, 11, i36)));
                    if (C2354.m7983()) {
                        iM2767 = (C0619.m2761("ܿܰ") ^ i31) * 55;
                        i27 = ((iM2767 ^ i32) * 28031) ^ 278897439;
                        i28 = 705296317;
                    } else {
                        iM2767 = C0773.m3169("ۢ֫") ^ i32;
                        i27 = ((iM2767 ^ i31) * 13743) ^ 739155501;
                        i28 = 1635154177;
                    }
                    i34 = iM2767 ^ i28;
                    c7121 = c7120;
                    c12544 = c12540;
                    c12547 = c12539;
                    c12549 = c12538;
                    bundle7 = bundle5;
                    c12548 = c12537;
                    spinner7 = spinner6;
                    i40 = i40;
                    view7 = view6;
                    c2367 = c2366;
                    i33 = i27;
                    c12550 = c12541;
                    c12545 = c12536;
                    i35 = i26;
                    C1255 c12553 = c12543;
                    onClickListener7 = onClickListener6;
                    c12543 = c12553;
                    break;
                case -1709930401:
                case 627348616:
                    c12545 = c12545;
                    i35 = i35;
                    c12516 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    if (this.f43904 == null) {
                        c12550 = c12516;
                        z = z;
                        iM3169 = C0773.m3169("᩸᩻") ^ i31;
                        i6 = ((iM3169 ^ i32) * 10843) ^ 1629885434;
                        i7 = 167621849;
                        i14 = iM3169 ^ i7;
                        i37 = i37;
                        i39 = i39;
                        c12544 = c12544;
                        c12547 = c12547;
                        c12543 = c12543;
                        onClickListener7 = onClickListener7;
                        sArr3 = sArr3;
                        i38 = i38;
                        z = z;
                        i40 = i40;
                        c12545 = c12545;
                        c12550 = c12550;
                        c12548 = c12548;
                        view7 = view7;
                        c12549 = c12549;
                        spinner7 = spinner7;
                        c2367 = c2367;
                        bundle7 = bundle7;
                        i34 = i14;
                        i33 = i6;
                        i35 = i35;
                    } else {
                        iM2765 = (i32 - C0619.m2761("۟ۛ")) * (-79);
                        i15 = ((iM2765 ^ i31) * 15635) ^ 134052944;
                        i16 = 1642913365;
                        i37 = i37;
                        i39 = i39;
                        c12544 = c12544;
                        c12547 = c12547;
                        c12543 = c12543;
                        onClickListener7 = onClickListener7;
                        sArr3 = sArr3;
                        i38 = i38;
                        c12545 = c12545;
                        c12548 = c12548;
                        view7 = view7;
                        c12549 = c12549;
                        spinner7 = spinner7;
                        c2367 = c2367;
                        bundle7 = bundle7;
                        i34 = iM2765 ^ i16;
                        i33 = i15;
                        c12550 = c12516;
                        i35 = i35;
                    }
                    break;
                case -1702143724:
                case 1302965825:
                    c12545 = c12545;
                    i35 = i35;
                    onClickListener2 = onClickListener7;
                    bundle7 = bundle7;
                    i10 = i37;
                    i11 = i38;
                    c12513 = c12543;
                    c2367 = c2367;
                    c12514 = c12547;
                    spinner7 = spinner7;
                    c12515 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr2 = sArr3;
                    i12 = i39;
                    z2 = true;
                    c12550 = c12550;
                    if (i10 == (C0773.m3169(C4238.m13530(f43901, 191, 3, i36)) ^ 2126160389)) {
                        iM2764 = (C0619.m2761("ۢ᩹") ^ i31) * 85;
                        i6 = ((iM2764 ^ i32) * (-17715)) ^ 705105444;
                        i13 = -1689027996;
                    } else {
                        iM2764 = (C0773.m3169("᩹ۧ") ^ i32) * 65;
                        i6 = ((iM2764 ^ i31) * (-24217)) ^ (-677786651);
                        i13 = 272851823;
                    }
                    i14 = iM2764 ^ i13;
                    i37 = i10;
                    i39 = i12;
                    c12544 = c12515;
                    c12547 = c12514;
                    c12543 = c12513;
                    onClickListener7 = onClickListener2;
                    sArr3 = sArr2;
                    i38 = i11;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -1557468473:
                case 562388233:
                    onClickListener6 = onClickListener7;
                    bundle6 = bundle7;
                    c12542 = c12548;
                    C2834.m9338(c12542, C3099.m10085(bundle6, C3998.m12925(f43901, 365, 14, i36)));
                    int iM27613 = (C0619.m2761("ۨۚ") + i32) * (-27);
                    i29 = ((iM27613 ^ i31) * 12993) ^ 1706976490;
                    i34 = iM27613 ^ (-1122692819);
                    bundle7 = bundle6;
                    c12548 = c12542;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12549 = c12549;
                    i35 = i35;
                    c12550 = c12550;
                    view7 = view7;
                    c2367 = c2367;
                    i33 = i29;
                    c12545 = c12545;
                    C1255 c12554 = c12543;
                    onClickListener7 = onClickListener6;
                    c12543 = c12554;
                    break;
                case -1494587075:
                case -801990187:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener2 = onClickListener7;
                    bundle7 = bundle7;
                    i10 = i37;
                    i11 = i38;
                    c12513 = c12543;
                    c2367 = c2367;
                    c12514 = c12547;
                    spinner7 = spinner7;
                    c12515 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr2 = sArr3;
                    i12 = i39;
                    z = false;
                    if (i10 == (C0619.m2761(C0773.m3166(f43901, 185, 3, i36)) ^ 2101381196)) {
                        iM2764 = C0773.m3169("ۨܿ") ^ i31;
                        i6 = ((iM2764 ^ i32) * 9853) ^ (-1993821708);
                        i13 = -1017767049;
                    } else {
                        iM2764 = C0619.m2761("ᩴ֫") ^ i32;
                        i6 = ((iM2764 ^ i31) * (-17387)) ^ 1148285594;
                        i13 = -380270806;
                    }
                    i14 = iM2764 ^ i13;
                    i37 = i10;
                    i39 = i12;
                    c12544 = c12515;
                    c12547 = c12514;
                    c12543 = c12513;
                    onClickListener7 = onClickListener2;
                    sArr3 = sArr2;
                    i38 = i11;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -1402869505:
                case 1461548033:
                    C2354.m7983();
                    if (C1564.f5401 > 0) {
                        c12512 = c12545;
                        i35 = i35;
                        c12516 = c12550;
                        spinner2 = spinner7;
                        viewM2812 = view7;
                        onClickListener3 = onClickListener7;
                        bundle2 = bundle7;
                        c12517 = c12548;
                        c12521 = c12549;
                        c12518 = c12543;
                        c2362 = c2367;
                        c12519 = c12547;
                        c12520 = c12544;
                        int iM27614 = C0619.m2761("ۘܶ") ^ i32;
                        c12549 = c12521;
                        c12548 = c12517;
                        c2367 = c2362;
                        bundle7 = bundle2;
                        i34 = iM27614 ^ (-1030455842);
                        view7 = viewM2812;
                        i33 = ((iM27614 ^ i31) * 8731) ^ (-1376537381);
                        c12544 = c12520;
                        spinner7 = spinner2;
                        c12547 = c12519;
                        c12543 = c12518;
                        onClickListener7 = onClickListener3;
                        c12545 = c12512;
                        c12550 = c12516;
                        i35 = i35;
                    } else {
                        c12522 = c12545;
                        i17 = i35;
                        c12527 = c12549;
                        c12526 = c12543;
                        view2 = view7;
                        onClickListener4 = onClickListener7;
                        bundle3 = bundle7;
                        c12524 = c12548;
                        c12523 = c12547;
                        c2363 = c2367;
                        c12525 = c12544;
                        spinner3 = spinner7;
                        iM31610 = (C0619.m2761("ۗܳ") ^ i31) * 7;
                        i18 = ((iM31610 ^ i32) * 1221) ^ 1789009623;
                        i19 = -488225590;
                        int i43 = iM31610 ^ i19;
                        c12548 = c12524;
                        spinner7 = spinner3;
                        c2367 = c2363;
                        onClickListener7 = onClickListener4;
                        bundle7 = bundle3;
                        i40 = i40;
                        i34 = i43;
                        view7 = view2;
                        i35 = i17;
                        c12549 = c12527;
                        c12545 = c12522;
                        C1255 c12555 = c12523;
                        c12543 = c12526;
                        i33 = i18;
                        c12544 = c12525;
                        c12547 = c12555;
                    }
                    break;
                case -1393101388:
                case 476391490:
                    C1255 c12556 = c12545;
                    C2834.m9338(c12546, C4238.m13535(ApplicationC17729.f58258, C0619.m2756(f43901, 379, 4, i36), true));
                    C2361 c2361M3794 = C0950.m3794(activityC0848);
                    C1343.m4952(c2361M3794, view7);
                    final C1255 c12557 = c12548;
                    final Bundle bundle8 = bundle7;
                    onClickListener5 = onClickListener;
                    int i44 = i35;
                    final Spinner spinner8 = spinner7;
                    final C1255 c12558 = c12544;
                    final C1255 c12559 = c12543;
                    final C1255 c12560 = c12547;
                    final C1255 c12561 = c12550;
                    C1255 c12562 = c12549;
                    C1255 c12563 = c12550;
                    i20 = i44;
                    c12529 = c12543;
                    spinner4 = spinner7;
                    view5 = view7;
                    final C1255 c12564 = c12546;
                    DialogInterface.OnClickListener onClickListener10 = new DialogInterface.OnClickListener() { // from class: l.ۢۨۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i45) {
                            C13831.m33761(this.f32363, bundle8, spinner8, c12559, c12561, c12549, c12560, c12558, c12557, c12564);
                        }
                    };
                    iM31612 = C0773.m3169(C0487.m2361(f43901, 383, 3, i36));
                    if (C2287.f7432 < 0) {
                        int iM31613 = (C0773.m3169("۫ۖ") + i31) * 27;
                        i24 = ((iM31613 ^ i32) * 2379) ^ (-333279778);
                        i25 = iM31613 ^ (-1171141307);
                        c12543 = c12529;
                        spinner7 = spinner4;
                        onClickListener7 = onClickListener5;
                        c2367 = c2361M3794;
                        c12545 = c12556;
                        c12548 = c12557;
                        c12544 = c12558;
                        c12547 = c12560;
                        c12549 = c12562;
                        i35 = i20;
                        c12550 = c12563;
                        view7 = view5;
                        i34 = i25;
                        i33 = i24;
                    } else {
                        c12545 = c12556;
                        c12532 = c12557;
                        c12544 = c12558;
                        c12530 = c12560;
                        c12531 = c12562;
                        c12528 = c12563;
                        view3 = view5;
                        bundle4 = bundle7;
                        c2364 = c2361M3794;
                        int iM31614 = (i32 - C0773.m3169("ܿ۟")) * 101;
                        c12550 = c12528;
                        c12548 = c12532;
                        i35 = i20;
                        view7 = view3;
                        c12549 = c12531;
                        spinner7 = spinner4;
                        c2367 = c2364;
                        bundle7 = bundle4;
                        i34 = iM31614 ^ (-1602269450);
                        i33 = ((iM31614 ^ i31) * (-10687)) ^ (-2072395657);
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                    }
                    break;
                case -1365609378:
                case 488317135:
                    this.f43904.m11159(activityC0849);
                    return z2;
                case -1328090795:
                case -741722758:
                    c12512 = c12545;
                    int i45 = i35;
                    C1255 c12565 = c12550;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener7;
                    Bundle bundle9 = bundle7;
                    boolean z4 = z;
                    int i46 = i38;
                    C1255 c12566 = c12543;
                    C2361 c2368 = c2367;
                    C1255 c12567 = c12547;
                    Spinner spinner9 = spinner7;
                    C1255 c12568 = c12544;
                    C1255 c12569 = c12549;
                    View view9 = view7;
                    C1255 c12570 = c12548;
                    short[] sArr6 = sArr3;
                    int i47 = i39;
                    activityC0849 = (ActivityC0848) AbstractC3624.m11768(this);
                    int iM33146 = C13473.m33146(menuItem);
                    z3 = true;
                    if (iM33146 == (C0619.m2761(C3033.m9847(f43901, PicnicEngine.MAX_AUX_BYTES, 3, i36)) ^ 2102812277)) {
                        iM2763 = C0619.m2761("۬᩵") ^ i32;
                        i8 = ((iM2763 ^ i31) * (-3397)) ^ (-533251538);
                        i9 = 2005263998;
                    } else {
                        iM2763 = C0619.m2761("ۤ᩻") ^ i32;
                        i8 = ((iM2763 ^ i31) * 30107) ^ (-146499046);
                        i9 = 831850304;
                    }
                    int i48 = iM2763 ^ i9;
                    i37 = iM33146;
                    i33 = i8;
                    i39 = i47;
                    c12544 = c12568;
                    c12547 = c12567;
                    c12543 = c12566;
                    onClickListener7 = onClickListener11;
                    sArr3 = sArr6;
                    i38 = i46;
                    z = z4;
                    i35 = i45;
                    c12550 = c12565;
                    c12548 = c12570;
                    view7 = view9;
                    c12549 = c12569;
                    spinner7 = spinner9;
                    c2367 = c2368;
                    bundle7 = bundle9;
                    i34 = i48;
                    c12545 = c12512;
                    break;
                case -1233038902:
                case 964800949:
                    C2419.m8168(c2367, iM31612 ^ 2102193704, onClickListener7);
                    RunnableC1848.m6359(c2367, C0619.m2761(C2702.m8881(f43901, 386, 3, i36)) ^ 2120007941, null);
                    C2375.m8062(c2367, false);
                    C21232.m48398(C3099.m10090(c2367));
                    i35 = i35;
                    c12550 = c12550;
                    bundle7 = bundle7;
                    c12545 = c12545;
                    z = z;
                    i37 = i37;
                    i38 = i38;
                    onClickListener7 = onClickListener7;
                    c2367 = c2367;
                    c12543 = c12543;
                    spinner7 = spinner7;
                    c12547 = c12547;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    c12544 = c12544;
                    i39 = i39;
                    iM3169 = C0773.m3169("᩸᩻") ^ i31;
                    i6 = ((iM3169 ^ i32) * 10843) ^ 1629885434;
                    i7 = 167621849;
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -1207744717:
                case -1173056752:
                    C4282.m13644();
                    if (C2702.f8586 > 0) {
                        c1255 = c12545;
                        i = i35;
                        c1256 = c12550;
                        onClickListener = onClickListener7;
                        bundle = bundle7;
                        c1257 = c12543;
                        c2361 = c2367;
                        sArr = sArr4;
                        spinner = spinner7;
                        c1258 = c12549;
                        view = view7;
                        c1259 = c12548;
                        C1255 c12571 = c12547;
                        c12510 = c12544;
                        c12511 = c12571;
                        iM2762 = (C0619.m2761("۫᩶") ^ i32) * 61;
                        i5 = ((iM2762 ^ i31) * 15013) ^ 1902875396;
                        i4 = -259220418;
                        int i49 = iM2762 ^ i4;
                        c12550 = c1256;
                        sArr4 = sArr;
                        c12548 = c1259;
                        c12543 = c1257;
                        onClickListener7 = onClickListener;
                        i40 = i40;
                        i35 = i;
                        view7 = view;
                        c12549 = c1258;
                        spinner7 = spinner;
                        c2367 = c2361;
                        bundle7 = bundle;
                        i34 = i49;
                        i33 = i5;
                        c12545 = c1255;
                        C1255 c12572 = c12510;
                        c12547 = c12511;
                        c12544 = c12572;
                    } else {
                        iM2761 = C0773.m3169("᩷ᩴ") ^ i31;
                        i2 = ((iM2761 ^ i32) * 23985) ^ (-2121167848);
                        i3 = -1938495848;
                        i34 = iM2761 ^ i3;
                        i33 = i2;
                        i40 = i40;
                    }
                    break;
                case -1185467456:
                case 38733836:
                    i21 = i35;
                    c12533 = c12550;
                    onClickListener5 = onClickListener7;
                    c2365 = c2367;
                    c12529 = c12543;
                    spinner5 = spinner7;
                    c12530 = c12547;
                    c12534 = c12549;
                    view4 = view7;
                    c12535 = c12544;
                    c12545 = (C1255) C3448.m11246(view4, i21);
                    c12548 = (C1255) C3448.m11246(view4, C0619.m2761(AbstractC0641.m2820(f43901, 221, 3, i36)) ^ 2128050869);
                    c12546 = (C1255) C2834.m9333(view4, C0773.m3169(RunnableC0334.m2049(f43901, BERTags.FLAGS, 3, i36)) ^ 2097975347);
                    bundleM46613 = this.f43904.m46613();
                    if (RunnableC3646.m11813() != 0) {
                        iM2766 = (i31 - C0773.m3169("ۤۨ")) * (-17);
                        i22 = ((iM2766 ^ i32) * 20273) ^ 988429715;
                        i23 = -533278675;
                    } else {
                        iM2766 = (i31 - C0619.m2761("ۜ۟")) * 35;
                        i22 = ((iM2766 ^ i32) * (-1749)) ^ 488091637;
                        i23 = -1167655926;
                    }
                    i34 = iM2766 ^ i23;
                    c12550 = c12533;
                    i35 = i21;
                    i33 = i22;
                    view7 = view4;
                    c12549 = c12534;
                    spinner7 = spinner5;
                    c2367 = c2365;
                    bundle7 = bundleM46613;
                    c12544 = c12535;
                    c12547 = c12530;
                    c12543 = c12529;
                    onClickListener7 = onClickListener5;
                    i40 = i40;
                    break;
                case -982270522:
                case 1799610707:
                    C2419.m8174();
                    if (C0269.f1558 > 0) {
                        c12522 = c12545;
                        i17 = i35;
                        c12527 = c12549;
                        c12526 = c12543;
                        view2 = view7;
                        onClickListener4 = onClickListener7;
                        bundle3 = bundle7;
                        c12524 = c12548;
                        c12523 = c12547;
                        c2363 = c2367;
                        c12525 = c12544;
                        spinner3 = spinner7;
                        iM31610 = (C0619.m2761("ۗܳ") ^ i31) * 7;
                        i18 = ((iM31610 ^ i32) * 1221) ^ 1789009623;
                        i19 = -488225590;
                        int i410 = iM31610 ^ i19;
                        c12548 = c12524;
                        spinner7 = spinner3;
                        c2367 = c2363;
                        onClickListener7 = onClickListener4;
                        bundle7 = bundle3;
                        i40 = i40;
                        i34 = i410;
                        view7 = view2;
                        i35 = i17;
                        c12549 = c12527;
                        c12545 = c12522;
                        C1255 c125510 = c12523;
                        c12543 = c12526;
                        i33 = i18;
                        c12544 = c12525;
                        c12547 = c125510;
                    } else {
                        c12536 = c12545;
                        i26 = i35;
                        c12541 = c12550;
                        view6 = view7;
                        c2366 = c2367;
                        c12537 = c12548;
                        c12538 = c12549;
                        spinner6 = spinner7;
                        bundle5 = bundle7;
                        c12539 = c12547;
                        c12540 = c12544;
                        c7120 = c7121;
                        DialogInterface.OnClickListener onClickListener12 = onClickListener7;
                        c12543 = c12543;
                        onClickListener6 = onClickListener12;
                        iM2767 = C0773.m3169("ۢ֫") ^ i32;
                        i27 = ((iM2767 ^ i31) * 13743) ^ 739155501;
                        i28 = 1635154177;
                        i34 = iM2767 ^ i28;
                        c7121 = c7120;
                        c12544 = c12540;
                        c12547 = c12539;
                        c12549 = c12538;
                        bundle7 = bundle5;
                        c12548 = c12537;
                        spinner7 = spinner6;
                        i40 = i40;
                        view7 = view6;
                        c2367 = c2366;
                        i33 = i27;
                        c12550 = c12541;
                        c12545 = c12536;
                        i35 = i26;
                        C1255 c125511 = c12543;
                        onClickListener7 = onClickListener6;
                        c12543 = c125511;
                    }
                    break;
                case -964687938:
                case -915222843:
                    if (C3779.f12953 <= 0) {
                        i20 = i35;
                        c12528 = c12550;
                        onClickListener5 = onClickListener7;
                        bundle4 = bundle7;
                        c12529 = c12543;
                        c2364 = c2367;
                        c12530 = c12547;
                        spinner4 = spinner7;
                        c12531 = c12549;
                        view3 = view7;
                        c12532 = c12548;
                        int iM31615 = (i32 - C0773.m3169("ܿ۟")) * 101;
                        c12550 = c12528;
                        c12548 = c12532;
                        i35 = i20;
                        view7 = view3;
                        c12549 = c12531;
                        spinner7 = spinner4;
                        c2367 = c2364;
                        bundle7 = bundle4;
                        i34 = iM31615 ^ (-1602269450);
                        i33 = ((iM31615 ^ i31) * (-10687)) ^ (-2072395657);
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                    }
                    iM2761 = C0773.m3169("᩷ᩴ") ^ i31;
                    i2 = ((iM2761 ^ i32) * 23985) ^ (-2121167848);
                    i3 = -1938495848;
                    i34 = iM2761 ^ i3;
                    i33 = i2;
                    i40 = i40;
                    break;
                case -935099454:
                case 549927373:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("۬ᩴ") + i31) * 41;
                        i2 = ((iM2761 ^ i32) * 26851) ^ (-1616490676);
                        i3 = 1989369706;
                        i34 = iM2761 ^ i3;
                        i33 = i2;
                        i40 = i40;
                    } else {
                        c1255 = c12545;
                        i = i35;
                        c1256 = c12550;
                        onClickListener = onClickListener7;
                        bundle = bundle7;
                        c1257 = c12543;
                        c2361 = c2367;
                        sArr = sArr4;
                        spinner = spinner7;
                        c1258 = c12549;
                        view = view7;
                        c1259 = c12548;
                        C1255 c12573 = c12547;
                        c12510 = c12544;
                        c12511 = c12573;
                        iM2762 = (C0619.m2761("۫᩶") ^ i32) * 61;
                        i5 = ((iM2762 ^ i31) * 15013) ^ 1902875396;
                        i4 = -259220418;
                        int i411 = iM2762 ^ i4;
                        c12550 = c1256;
                        sArr4 = sArr;
                        c12548 = c1259;
                        c12543 = c1257;
                        onClickListener7 = onClickListener;
                        i40 = i40;
                        i35 = i;
                        view7 = view;
                        c12549 = c1258;
                        spinner7 = spinner;
                        c2367 = c2361;
                        bundle7 = bundle;
                        i34 = i411;
                        i33 = i5;
                        c12545 = c1255;
                        C1255 c12574 = c12510;
                        c12547 = c12511;
                        c12544 = c12574;
                    }
                    break;
                case -835210825:
                case 1800363409:
                    C1255 c12575 = c12545;
                    int i50 = i35;
                    c12533 = c12550;
                    view5 = view7;
                    C2361 c2369 = c2367;
                    C1255 c12576 = c12548;
                    C1255 c12577 = c12549;
                    spinner5 = spinner7;
                    Bundle bundle10 = bundle7;
                    C1255 c12578 = c12547;
                    c12535 = c12544;
                    DialogInterface.OnClickListener onClickListener13 = onClickListener7;
                    c12529 = c12543;
                    c2365 = c2369;
                    C7120 c7122 = new C7120(requireContext(), new String[]{strM11765, RunnableC0334.m2049(f43901, 244, 7, i36), C2023.m6966(f43901, 251, 7, i36), C11235.m28300(f43901, 258, 7, i36), C1826.m6310(f43901, 265, 7, i36), strM1785, strM8350}, C2419.m8177(42.0f));
                    if (C23916.m53419() != 0) {
                        c7121 = c7122;
                        onClickListener5 = onClickListener13;
                        bundleM46613 = bundle10;
                        c12548 = c12576;
                        c12545 = c12575;
                        i21 = i50;
                        c12530 = c12578;
                        c12534 = c12577;
                        view4 = view5;
                        iM2766 = (i31 - C0773.m3169("ۤۨ")) * (-17);
                        i22 = ((iM2766 ^ i32) * 20273) ^ 988429715;
                        i23 = -533278675;
                        i34 = iM2766 ^ i23;
                        c12550 = c12533;
                        i35 = i21;
                        i33 = i22;
                        view7 = view4;
                        c12549 = c12534;
                        spinner7 = spinner5;
                        c2367 = c2365;
                        bundle7 = bundleM46613;
                        c12544 = c12535;
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                    } else {
                        int iM27615 = C0619.m2761("ᩴܽ") ^ i31;
                        i34 = iM27615 ^ 610140534;
                        i33 = ((iM27615 ^ i32) * (-8145)) ^ 637530515;
                        c7121 = c7122;
                        c12544 = c12535;
                        c12547 = c12578;
                        c12549 = c12577;
                        c12548 = c12576;
                        i40 = i40;
                        c12545 = c12575;
                        view7 = view5;
                        c12550 = c12533;
                        i35 = i50;
                        onClickListener7 = onClickListener13;
                        c12543 = c12529;
                        bundle7 = bundle10;
                        spinner7 = spinner5;
                        c2367 = c2365;
                    }
                    break;
                case -827047033:
                case 1526772233:
                    int i51 = i35;
                    c12510 = c12544;
                    c1256 = c12550;
                    onClickListener = onClickListener7;
                    bundle = bundle7;
                    c1257 = c12543;
                    c2361 = c2367;
                    spinner = spinner7;
                    c1258 = c12549;
                    view = view7;
                    c1259 = c12548;
                    sArr = sArr4;
                    c12511 = (C1255) C3448.m11246(view, C0619.m2761(C1343.m4939(sArr, 212, 3, i36)) ^ 2120050564);
                    i = i51;
                    c1255 = c12545;
                    iM27610 = C0619.m2761(C1783.m6233(f43901, 215, 3, i36));
                    if (C3734.m12152() >= 0) {
                        iM2762 = (C0619.m2761("۫᩶") ^ i32) * 61;
                        i5 = ((iM2762 ^ i31) * 15013) ^ 1902875396;
                        i4 = -259220418;
                    } else {
                        iM2762 = (i32 - C0773.m3169("ۡᩳ")) * 39;
                        i5 = ((iM2762 ^ i31) * 12753) ^ 401763631;
                        i4 = -801768795;
                    }
                    int i412 = iM2762 ^ i4;
                    c12550 = c1256;
                    sArr4 = sArr;
                    c12548 = c1259;
                    c12543 = c1257;
                    onClickListener7 = onClickListener;
                    i40 = i40;
                    i35 = i;
                    view7 = view;
                    c12549 = c1258;
                    spinner7 = spinner;
                    c2367 = c2361;
                    bundle7 = bundle;
                    i34 = i412;
                    i33 = i5;
                    c12545 = c1255;
                    C1255 c12579 = c12510;
                    c12547 = c12511;
                    c12544 = c12579;
                    break;
                case -811165585:
                case 467131569:
                    c12545 = c12545;
                    i35 = i35;
                    C1255 c12580 = c12544;
                    C1255 c12581 = c12547;
                    C1255 c12582 = c12549;
                    c12550 = c12550;
                    view7 = view7;
                    c2367 = c2367;
                    C1255 c12583 = c12548;
                    Spinner spinner10 = spinner7;
                    Bundle bundle11 = bundle7;
                    DialogInterface.OnClickListener onClickListener14 = onClickListener7;
                    c12543 = c12543;
                    onClickListener6 = onClickListener14;
                    C3448.m11239(c12582, C3099.m10085(bundle11, C3779.m12266(f43901, 311, 12, i36)));
                    C2834.m9338(c12581, C1321.m4854(bundle11, C2834.m9343(f43901, 323, 15, i36)));
                    C3448.m11239(c12580, C3099.m10085(bundle11, C3690.m11996(f43901, 338, 12, i36)));
                    if (C1321.m4854(bundle11, C1826.m6310(f43901, 350, 15, i36))) {
                        iM2768 = (i31 - C0773.m3169("ۗ᩻")) * (-3);
                        i29 = ((iM2768 ^ i32) * 15293) ^ (-513526696);
                        i30 = 1578708212;
                    } else {
                        iM2768 = C0619.m2761("ᩴ᩵") ^ i32;
                        i29 = ((iM2768 ^ i31) * (-13443)) ^ 1155003045;
                        i30 = 876536738;
                    }
                    i34 = iM2768 ^ i30;
                    c12544 = c12580;
                    c12547 = c12581;
                    c12549 = c12582;
                    bundle7 = bundle11;
                    c12548 = c12583;
                    spinner7 = spinner10;
                    i35 = i35;
                    c12550 = c12550;
                    view7 = view7;
                    c2367 = c2367;
                    i33 = i29;
                    c12545 = c12545;
                    C1255 c125512 = c12543;
                    onClickListener7 = onClickListener6;
                    c12543 = c125512;
                    break;
                case -806454905:
                case 467747771:
                    AbstractC0641.m2813();
                    C3033.m9845();
                    return false;
                case -610715907:
                case 1552273534:
                    c12522 = c12545;
                    i17 = i35;
                    c12523 = c12547;
                    view2 = view7;
                    onClickListener4 = onClickListener7;
                    bundle3 = bundle7;
                    c12524 = c12548;
                    c12525 = c12544;
                    c2363 = c2367;
                    spinner3 = spinner7;
                    c12526 = (C1255) C3448.m11246(view2, iM2769 ^ 2124562551);
                    c12550 = (C1255) C2834.m9333(view2, C0619.m2761(C2966.m9670(f43901, 206, 3, i36)) ^ 2126675933);
                    c12527 = (C1255) C2834.m9333(view2, C0619.m2761(C3099.m10092(f43901, 209, 3, i36)) ^ 2100263906);
                    sArr4 = f43901;
                    if (C2878.f9462) {
                        iM31610 = (C0619.m2761("ۗܳ") ^ i31) * 7;
                        i18 = ((iM31610 ^ i32) * 1221) ^ 1789009623;
                        i19 = -488225590;
                    } else {
                        iM31610 = C0773.m3169("֫֫") ^ i31;
                        i18 = ((iM31610 ^ i32) * 6691) ^ (-539760052);
                        i19 = -461881758;
                    }
                    int i413 = iM31610 ^ i19;
                    c12548 = c12524;
                    spinner7 = spinner3;
                    c2367 = c2363;
                    onClickListener7 = onClickListener4;
                    bundle7 = bundle3;
                    i40 = i40;
                    i34 = i413;
                    view7 = view2;
                    i35 = i17;
                    c12549 = c12527;
                    c12545 = c12522;
                    C1255 c125513 = c12523;
                    c12543 = c12526;
                    i33 = i18;
                    c12544 = c12525;
                    c12547 = c125513;
                    break;
                case -406028434:
                case 1319783568:
                    c12542 = c12548;
                    bundle6 = bundle7;
                    onClickListener6 = onClickListener7;
                    C2834.m9338(c12542, false);
                    C23916.m53431(c12542, false);
                    C0862.m3504(c12542, 0.75f);
                    int iM27616 = (C0619.m2761("ۨۚ") + i32) * (-27);
                    i29 = ((iM27616 ^ i31) * 12993) ^ 1706976490;
                    i34 = iM27616 ^ (-1122692819);
                    bundle7 = bundle6;
                    c12548 = c12542;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12549 = c12549;
                    i35 = i35;
                    c12550 = c12550;
                    view7 = view7;
                    c2367 = c2367;
                    i33 = i29;
                    c12545 = c12545;
                    C1255 c125514 = c12543;
                    onClickListener7 = onClickListener6;
                    c12543 = c125514;
                    break;
                case -314361308:
                case 1250553074:
                    c12512 = c12545;
                    i35 = i35;
                    c12516 = c12550;
                    onClickListener3 = onClickListener7;
                    bundle2 = bundle7;
                    c12517 = c12548;
                    c12518 = c12543;
                    c2362 = c2367;
                    c12519 = c12547;
                    Spinner spinner11 = spinner7;
                    c12520 = c12544;
                    c12521 = c12549;
                    ActivityC0848 activityC08410 = (ActivityC0848) AbstractC3624.m11768(this);
                    viewM2812 = AbstractC0641.m2812(activityC08410, C0619.m2761(C2834.m9343(f43901, 197, 3, i36)) ^ 2099855265);
                    sArr3 = f43901;
                    i38 = 200;
                    i39 = 3;
                    if (C0773.f2792 > 0) {
                        int iM31616 = (C0773.m3169("ۤܶ") ^ i31) * (-109);
                        activityC0848 = activityC08410;
                        c12550 = c12516;
                        i33 = ((iM31616 ^ i32) * (-24679)) ^ (-497643125);
                        c12549 = c12521;
                        c12548 = c12517;
                        spinner7 = spinner11;
                        c2367 = c2362;
                        bundle7 = bundle2;
                        i35 = i35;
                        view7 = viewM2812;
                        i34 = iM31616 ^ 1085352886;
                        c12544 = c12520;
                        c12547 = c12519;
                        c12543 = c12518;
                        onClickListener7 = onClickListener3;
                        c12545 = c12512;
                    } else {
                        activityC0848 = activityC08410;
                        spinner2 = spinner11;
                        int iM27617 = C0619.m2761("ۘܶ") ^ i32;
                        c12549 = c12521;
                        c12548 = c12517;
                        c2367 = c2362;
                        bundle7 = bundle2;
                        i34 = iM27617 ^ (-1030455842);
                        view7 = viewM2812;
                        i33 = ((iM27617 ^ i31) * 8731) ^ (-1376537381);
                        c12544 = c12520;
                        spinner7 = spinner2;
                        c12547 = c12519;
                        c12543 = c12518;
                        onClickListener7 = onClickListener3;
                        c12545 = c12512;
                        c12550 = c12516;
                        i35 = i35;
                    }
                    break;
                case -213929561:
                case 673598594:
                    i36 = 47857;
                    iM3169 = (C0619.m2761("᩻᩷") + i31) * 5;
                    i6 = ((iM3169 ^ i32) * (-26967)) ^ (-1575931031);
                    i7 = 1724286512;
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -109245996:
                case 939985779:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    z = z;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    if (i37 == (C0773.m3169(C1321.m4861(f43901, 182, 3, i36)) ^ 2118990876)) {
                        iM3169 = (i32 - C0773.m3169("ۜᩴ")) * 77;
                        i6 = ((iM3169 ^ i31) * 23089) ^ 688536527;
                        i7 = -1415681902;
                    } else {
                        iM3169 = (C0619.m2761("֨۟") + i31) * (-41);
                        i6 = ((iM3169 ^ i32) * 25407) ^ (-177071999);
                        i7 = -182179279;
                    }
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case -34604823:
                case 1478547844:
                    C1542.m5459();
                    if (!C3690.m11987()) {
                        c12536 = c12545;
                        i26 = i35;
                        c12541 = c12550;
                        view6 = view7;
                        c2366 = c2367;
                        c12537 = c12548;
                        c12538 = c12549;
                        spinner6 = spinner7;
                        bundle5 = bundle7;
                        c12539 = c12547;
                        c12540 = c12544;
                        c7120 = c7121;
                        DialogInterface.OnClickListener onClickListener15 = onClickListener7;
                        c12543 = c12543;
                        onClickListener6 = onClickListener15;
                        iM2767 = C0773.m3169("ۢ֫") ^ i32;
                        i27 = ((iM2767 ^ i31) * 13743) ^ 739155501;
                        i28 = 1635154177;
                        i34 = iM2767 ^ i28;
                        c7121 = c7120;
                        c12544 = c12540;
                        c12547 = c12539;
                        c12549 = c12538;
                        bundle7 = bundle5;
                        c12548 = c12537;
                        spinner7 = spinner6;
                        i40 = i40;
                        view7 = view6;
                        c2367 = c2366;
                        i33 = i27;
                        c12550 = c12541;
                        c12545 = c12536;
                        i35 = i26;
                        C1255 c125515 = c12543;
                        onClickListener7 = onClickListener6;
                        c12543 = c125515;
                    } else {
                        iM2761 = C0773.m3169("᩷ᩴ") ^ i31;
                        i2 = ((iM2761 ^ i32) * 23985) ^ (-2121167848);
                        i3 = -1938495848;
                        i34 = iM2761 ^ i3;
                        i33 = i2;
                        i40 = i40;
                    }
                    break;
                case 141280881:
                case 1714270418:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    z = z;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    short s = f43901[175];
                    if ((s * 8990) - ((s * s) + 20205025) > 0) {
                        iM3169 = C0619.m2761("ܳۙ") ^ i32;
                        i6 = ((iM3169 ^ i31) * 15085) ^ (-352955819);
                        i7 = -1985432046;
                    } else {
                        iM3169 = C0773.m3169("֨ۘ") ^ i31;
                        i6 = ((iM3169 ^ i32) * (-6709)) ^ 1360330628;
                        i7 = 1871870669;
                    }
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case 219346628:
                case 1080445167:
                    activityC0849.m3454();
                    return z3;
                case 260573714:
                case 1491526463:
                    c12545 = c12545;
                    i35 = i35;
                    c12516 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    i37 = i37;
                    if (i37 == (C0773.m3169(C1783.m6233(f43901, 194, 3, i36)) ^ 2120885014)) {
                        iM2765 = (C0619.m2761("ܽܳ") + i31) * 37;
                        i15 = ((iM2765 ^ i32) * (-17191)) ^ 1471781516;
                        i16 = -472576168;
                    } else {
                        iM2765 = C0773.m3169("ۢۜ") ^ i32;
                        i15 = ((iM2765 ^ i31) * (-8471)) ^ (-1314644237);
                        i16 = 929873044;
                    }
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    c12545 = c12545;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = iM2765 ^ i16;
                    i33 = i15;
                    c12550 = c12516;
                    i35 = i35;
                    break;
                case 293203970:
                case 1308328221:
                    return super.onOptionsItemSelected(menuItem);
                case 447450174:
                case 1163789432:
                    i36 = 8106;
                    iM3169 = (C0619.m2761("᩻᩷") + i31) * 5;
                    i6 = ((iM3169 ^ i32) * (-26967)) ^ (-1575931031);
                    i7 = 1724286512;
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case 496895749:
                case 1258428132:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    z = z;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    if (i37 == (C0773.m3169(C3099.m10092(f43901, 179, 3, i36)) ^ 2101496951)) {
                        iM3169 = (C0773.m3169("ᩴ֡") ^ i32) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM3169 ^ i31) * 12921) ^ (-572949784);
                        i7 = 1108393046;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֨") ^ i31;
                        i6 = ((iM3169 ^ i32) * (-31787)) ^ 408699448;
                        i7 = 315161187;
                    }
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case 590492511:
                case 1378166386:
                    return true;
                case 1004220435:
                case 1142323680:
                    c12545 = c12545;
                    i35 = i35;
                    c12550 = c12550;
                    onClickListener7 = onClickListener7;
                    bundle7 = bundle7;
                    z = z;
                    i37 = i37;
                    i38 = i38;
                    c12543 = c12543;
                    c2367 = c2367;
                    c12547 = c12547;
                    spinner7 = spinner7;
                    c12544 = c12544;
                    c12549 = c12549;
                    view7 = view7;
                    c12548 = c12548;
                    sArr3 = sArr3;
                    i39 = i39;
                    if (this.f43904 == null) {
                        iM3169 = C0773.m3169("᩸᩻") ^ i31;
                        i6 = ((iM3169 ^ i32) * 10843) ^ 1629885434;
                        i7 = 167621849;
                    } else {
                        iM3169 = C0773.m3169("᩺᩺") ^ i31;
                        i6 = ((iM3169 ^ i32) * 16637) ^ (-2131775181);
                        i7 = 227362837;
                    }
                    i14 = iM3169 ^ i7;
                    i37 = i37;
                    i39 = i39;
                    c12544 = c12544;
                    c12547 = c12547;
                    c12543 = c12543;
                    onClickListener7 = onClickListener7;
                    sArr3 = sArr3;
                    i38 = i38;
                    z = z;
                    i40 = i40;
                    c12545 = c12545;
                    c12550 = c12550;
                    c12548 = c12548;
                    view7 = view7;
                    c12549 = c12549;
                    spinner7 = spinner7;
                    c2367 = c2367;
                    bundle7 = bundle7;
                    i34 = i14;
                    i33 = i6;
                    i35 = i35;
                    break;
                case 1235733662:
                case 1669831500:
                    C1255 c12584 = c12545;
                    int i52 = i35;
                    c12533 = c12550;
                    view5 = view7;
                    C1255 c12585 = c12548;
                    C1255 c12586 = c12549;
                    C1255 c12587 = c12547;
                    C1255 c12588 = c12544;
                    DialogInterface.OnClickListener onClickListener16 = onClickListener7;
                    c12529 = c12543;
                    C2361 c23610 = c2367;
                    spinner5 = spinner7;
                    Bundle bundle12 = bundle7;
                    c2365 = c23610;
                    onClickListener5 = onClickListener16;
                    c12530 = c12587;
                    c12534 = c12586;
                    C8611 c8611 = new C8611(c12529, c12533, c12586, c12587, c12588, c12584);
                    RunnableC3055.m9944(c12529, c8611);
                    AbstractC0641.m2810(c12533, c8611);
                    AbstractC0641.m2810(c12534, c8611);
                    AbstractC0641.m2810(c12530, c8611);
                    c12535 = c12588;
                    RunnableC3055.m9944(c12535, c8611);
                    c12545 = c12584;
                    AbstractC0641.m2810(c12545, c8611);
                    strM11765 = AbstractC3624.m11765(C0619.m2761(AbstractC0641.m2820(f43901, 227, 3, i36)) ^ 2125895135);
                    strM1785 = C0269.m1785(f43901, 230, 7, i36);
                    strM8350 = C2485.m8350(f43901, 237, 7, i36);
                    if (C3734.f12817 < 0) {
                        int iM31617 = (C0773.m3169("ۡ֫") + i32) * (-35);
                        i24 = ((iM31617 ^ i31) * (-6891)) ^ 385580762;
                        i25 = iM31617 ^ 1448176408;
                        c12550 = c12533;
                        c12544 = c12535;
                        c12547 = c12530;
                        c12549 = c12534;
                        c12548 = c12585;
                        c12543 = c12529;
                        spinner7 = spinner5;
                        c2367 = c2365;
                        onClickListener7 = onClickListener5;
                        bundle7 = bundle12;
                        i35 = i52;
                        view7 = view5;
                        i34 = i25;
                        i33 = i24;
                    } else {
                        c12548 = c12585;
                        bundleM46613 = bundle12;
                        i21 = i52;
                        view4 = view5;
                        iM2766 = (i31 - C0773.m3169("ۤۨ")) * (-17);
                        i22 = ((iM2766 ^ i32) * 20273) ^ 988429715;
                        i23 = -533278675;
                        i34 = iM2766 ^ i23;
                        c12550 = c12533;
                        i35 = i21;
                        i33 = i22;
                        view7 = view4;
                        c12549 = c12534;
                        spinner7 = spinner5;
                        c2367 = c2365;
                        bundle7 = bundleM46613;
                        c12544 = c12535;
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                    }
                    break;
                case 1308636655:
                case 2093687938:
                    c12528 = c12550;
                    onClickListener5 = onClickListener7;
                    bundle4 = bundle7;
                    c12529 = c12543;
                    c2364 = c2367;
                    c12530 = c12547;
                    spinner4 = spinner7;
                    c12531 = c12549;
                    view3 = view7;
                    c12532 = c12548;
                    c12544 = (C1255) C2834.m9333(view3, iM27610 ^ 2118615955);
                    int iM27618 = C0619.m2761(C0950.m3780(f43901, 218, 3, i36)) ^ 2123964220;
                    if (C2485.f7950 != 0) {
                        i20 = iM27618;
                        int iM31618 = (i32 - C0773.m3169("ܿ۟")) * 101;
                        c12550 = c12528;
                        c12548 = c12532;
                        i35 = i20;
                        view7 = view3;
                        c12549 = c12531;
                        spinner7 = spinner4;
                        c2367 = c2364;
                        bundle7 = bundle4;
                        i34 = iM31618 ^ (-1602269450);
                        i33 = ((iM31618 ^ i31) * (-10687)) ^ (-2072395657);
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                    } else {
                        int iM27619 = C0619.m2761("ۢ۟") ^ i32;
                        int i53 = ((iM27619 ^ i31) * 11575) ^ (-691228783);
                        c12548 = c12532;
                        view7 = view3;
                        c12549 = c12531;
                        spinner7 = spinner4;
                        c2367 = c2364;
                        bundle7 = bundle4;
                        i34 = iM27619 ^ (-1010823602);
                        c12547 = c12530;
                        c12543 = c12529;
                        onClickListener7 = onClickListener5;
                        i40 = i40;
                        i35 = iM27618;
                        i33 = i53;
                        c12550 = c12528;
                    }
                    break;
                default:
                    activityC0849.m3436(new RunnableC4755(1, this, activityC0849));
                    return z3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03c0 A[PHI: r10 r11 r12 r13
      0x03c0: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:103:0x03be, B:95:0x0373, B:75:0x029e, B:71:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r11v4 char) = (r11v2 char), (r11v2 char), (r11v3 char), (r11v2 char) binds: [B:103:0x03be, B:95:0x0373, B:75:0x029e, B:71:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:103:0x03be, B:95:0x0373, B:75:0x029e, B:71:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:103:0x03be, B:95:0x0373, B:75:0x029e, B:71:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[PHI: r9
      0x00f3: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:37:0x00f1, B:15:0x0072, B:120:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0343  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33765(C13831 c13831, boolean[] zArr, String[] strArr, DialogInterfaceC8327 dialogInterfaceC8327, ActivityC0848 activityC0848) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        C13831 c13832 = c13831;
        int i5 = C2287.f7432;
        int i6 = C0773.f2792;
        int iM3169 = (C0773.m3169("֡֨") + i5) * (-109);
        int i7 = ((iM3169 ^ i6) * (-5785)) ^ (-1686644534);
        short[] sArr = null;
        int i8 = iM3169 ^ (-1419477);
        ArrayList arrayList = null;
        boolean z = false;
        int i9 = 0;
        boolean z2 = false;
        char c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1135904340;
        boolean z3 = false;
        String strM2049 = null;
        Exception exc = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-2499)) >> 31));
            switch (i13) {
                case -2144261986:
                case -1974511941:
                    if (RunnableC3646.f12471) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * (-17);
                        i = ((iM2761 ^ i6) * (-27797)) ^ (-147266508);
                        i2 = 312447271;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩶") ^ i5;
                        i = ((iM2761 ^ i6) * (-29335)) ^ (-303464910);
                        i2 = -2045023554;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -2133471628:
                case -1005222746:
                    sArr = f43901;
                    c = 157;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * (-17);
                        i = ((iM2761 ^ i6) * (-27797)) ^ (-147266508);
                        i2 = 312447271;
                    } else {
                        iM2761 = C0619.m2761("ۖܿ") ^ i6;
                        i = ((iM2761 ^ i5) * 21779) ^ (-181904205);
                        i2 = -1732179485;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -2129323602:
                case -271666477:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                        i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                        i2 = -512956492;
                    } else {
                        iM2761 = C0773.m3169("ᩳۡ") ^ i5;
                        i = ((iM2761 ^ i6) * 5581) ^ 25176270;
                        i2 = 749136577;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -2117949486:
                case 405716239:
                    z3 = true;
                    iM2762 = (C0619.m2761("֡᩺") ^ i5) * 97;
                    i3 = ((iM2762 ^ i6) * (-18579)) ^ (-1945779138);
                    i4 = 781645453;
                    i8 = iM2762 ^ i4;
                    i7 = i3;
                    break;
                case -1967525685:
                case -1168259755:
                    AbstractC0116.m1243();
                    if (C0950.f3488 < 0) {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i5;
                        i = ((iM2761 ^ i6) * (-20231)) ^ (-987515616);
                        i2 = -1804818802;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        c13832 = c13831;
                    }
                    iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                    i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                    i2 = -512956492;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1923364376:
                case -715936663:
                    i12 = 3441;
                    iM2761 = (C0619.m2761("ۜܿ") ^ i6) * (-91);
                    i = ((iM2761 ^ i5) * 17733) ^ 1162519826;
                    i2 = 110901331;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1897268997:
                case -362829213:
                    short s = sArr[c];
                    i10 = s * 38780;
                    i11 = s * s;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * (-17);
                        i = ((iM2761 ^ i6) * (-27797)) ^ (-147266508);
                        i2 = 312447271;
                    } else {
                        iM2761 = C0619.m2761("ᩴ֫") ^ i5;
                        i = ((iM2761 ^ i6) * 12729) ^ (-2132788615);
                        i2 = -1092939554;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1773816405:
                case 2974349:
                    if (z2) {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i6;
                        i = ((iM2761 ^ i5) * (-339)) ^ (-1718110783);
                        i2 = 141560596;
                    } else {
                        iM2761 = (i6 - C0619.m2761("᩺ۤ")) * 41;
                        i = ((iM2761 ^ i5) * (-25067)) ^ 1277857667;
                        i2 = 1194464377;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1731764217:
                case -1498592429:
                    c13832.f43903.m51299(exc);
                    break;
                case -1545001164:
                case 179155009:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * (-17);
                        i = ((iM2761 ^ i6) * (-27797)) ^ (-147266508);
                        i2 = 312447271;
                    } else {
                        iM2761 = C0619.m2761("֨᩻") ^ i6;
                        i = ((iM2761 ^ i5) * 2579) ^ 852666612;
                        i2 = -208951084;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1506099499:
                case 911757417:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("֫ۢ") + i5) * 5;
                        i = ((iM2761 ^ i6) * 11445) ^ 415425596;
                        i2 = 1158217596;
                    } else {
                        iM2761 = C0619.m2761("֫ܶ") ^ i5;
                        i = ((iM2761 ^ i6) * (-5083)) ^ 1119179545;
                        i2 = 724848184;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1505687939:
                case -1289130330:
                    i9++;
                    z2 = z3;
                    iM2761 = C0773.m3169("ۧ᩶") ^ i5;
                    i = ((iM2761 ^ i6) * (-3975)) ^ (-1008413117);
                    i2 = -1968217916;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1423743270:
                case -1174107372:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("᩸᩺") ^ i6;
                        i = ((iM2761 ^ i5) * 21781) ^ 1359379989;
                        i2 = 1013915315;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۙۗ")) * (-29);
                        i = ((iM2761 ^ i6) * (-20443)) ^ (-728788678);
                        i2 = -1182896185;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -1397600762:
                case 813034718:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                        i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                        i2 = -512956492;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۢܿ")) * 43;
                        i = ((iM2761 ^ i5) * 26843) ^ 42853795;
                        i2 = 1981900397;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -982427556:
                case 1173302205:
                    C1343.m4943();
                    if (RunnableC3646.f12471) {
                        iM2762 = C0619.m2761("۬᩺") ^ i6;
                        i3 = ((iM2762 ^ i5) * (-28269)) ^ (-477097100);
                        i4 = -926724878;
                    } else {
                        iM2762 = C0773.m3169("۠۠") ^ i6;
                        i3 = ((iM2762 ^ i5) * (-16623)) ^ 1237421302;
                        i4 = 562407816;
                    }
                    i8 = iM2762 ^ i4;
                    i7 = i3;
                    break;
                case -892187102:
                case 951501392:
                    break;
                case -670953674:
                case 179834530:
                    if (i9 < zArr.length) {
                        iM2761 = (i5 - C0619.m2761("֫᩵")) * (-9);
                        i = ((iM2761 ^ i6) * (-12893)) ^ 664112952;
                        i2 = 1057824211;
                    } else {
                        iM2761 = C0773.m3169("֡ۡ") ^ i6;
                        i = ((iM2761 ^ i5) * 1203) ^ 758929510;
                        i2 = -455378846;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -449921691:
                case -25500621:
                    RunnableC0334.m2054(arrayList, strArr[i9]);
                    z3 = z2;
                    iM2762 = (C0619.m2761("֡᩺") ^ i5) * 97;
                    i3 = ((iM2762 ^ i6) * (-18579)) ^ (-1945779138);
                    i4 = 781645453;
                    i8 = iM2762 ^ i4;
                    i7 = i3;
                    break;
                case -263789753:
                case 1324493080:
                    if (C2375.m8065() > 0) {
                        iM2761 = (C0773.m3169("֫ۢ") + i5) * 5;
                        i = ((iM2761 ^ i6) * 11445) ^ 415425596;
                        i2 = 1158217596;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        c13832 = c13831;
                    }
                    iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                    i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                    i2 = -512956492;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case -249955949:
                case 1151568005:
                    C2966.m9668(C0619.m2761(strM2049) ^ 2121591314);
                    break;
                case 17867205:
                case 101456739:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i5;
                        i = ((iM2761 ^ i6) * (-20231)) ^ (-987515616);
                        i2 = -1804818802;
                    } else {
                        iM2761 = C0619.m2761("ۤܶ") ^ i6;
                        i = ((iM2761 ^ i5) * (-3193)) ^ 1193451371;
                        i2 = 2016613434;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 30425748:
                case 1191693537:
                    arrayList = new ArrayList();
                    z = false;
                    i9 = 0;
                    z2 = false;
                    iM2761 = C0773.m3169("ۧ᩶") ^ i5;
                    i = ((iM2761 ^ i6) * (-3975)) ^ (-1008413117);
                    i2 = -1968217916;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 343409441:
                case 1386523863:
                    C3492.m11488();
                    C0619.m2763();
                    iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                    i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                    i2 = -512956492;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 502190254:
                case 1210132251:
                    strM2049 = RunnableC0334.m2049(f43901, 158, 3, i12);
                    if (C0619.f2439) {
                        iM2762 = C0619.m2761("۬᩺") ^ i6;
                        i3 = ((iM2762 ^ i5) * (-28269)) ^ (-477097100);
                        i4 = -926724878;
                    } else {
                        iM2762 = C0619.m2761("ܰ᩸") ^ i5;
                        i3 = ((iM2762 ^ i6) * (-28633)) ^ 1096035662;
                        i4 = 1896783570;
                    }
                    i8 = iM2762 ^ i4;
                    i7 = i3;
                    break;
                case 664653634:
                case 1077907706:
                    if (zArr[i9]) {
                        iM2761 = C0773.m3169("᩷ۤ") ^ i6;
                        i = ((iM2761 ^ i5) * (-17349)) ^ (-1696453822);
                        i2 = -211819466;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩺") + i5) * (-121);
                        i = ((iM2761 ^ i6) * 15909) ^ (-64614247);
                        i2 = -1977262215;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 938554424:
                case 2062458022:
                    try {
                        c13832.f43904.m46579(arrayList);
                        C11235.m28311(dialogInterfaceC8327);
                        try {
                            activityC0848.m3437(z);
                            iM2761 = (i6 - C0619.m2761("ۗ᩷")) * 49;
                            i = ((iM2761 ^ i5) * 23393) ^ 363676066;
                            i2 = 989151227;
                        } catch (Exception e) {
                            e = e;
                            exc = e;
                            iM2761 = C0773.m3169("ۚܺ") ^ i6;
                            i = ((iM2761 ^ i5) * (-24281)) ^ 992960596;
                            i2 = -363216114;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 1053800288:
                case 1696666502:
                    if ((375972100 + i11) - i10 < 0) {
                        iM2761 = C0619.m2761("ۧۨ") ^ i5;
                        i = ((iM2761 ^ i6) * 8363) ^ 412148441;
                        i2 = 1704450875;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܶۗ")) * (-63);
                        i = ((iM2761 ^ i5) * (-30743)) ^ 1017722280;
                        i2 = 1180879264;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
                case 1394281761:
                case 1507902839:
                    if (!C2023.f6737) {
                        iM2762 = C0619.m2761("۬᩺") ^ i6;
                        i3 = ((iM2762 ^ i5) * (-28269)) ^ (-477097100);
                        i4 = -926724878;
                        i8 = iM2762 ^ i4;
                        i7 = i3;
                    } else {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i5;
                        i = ((iM2761 ^ i6) * (-16951)) ^ 323352812;
                        i2 = -512956492;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        c13832 = c13831;
                    }
                    break;
                case 1635271344:
                case 1698594697:
                    C23916.m53419();
                    C2375.m8065();
                    break;
                case 1815791316:
                case 1922128510:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩸᩺") ^ i6;
                        i = ((iM2761 ^ i5) * 21781) ^ 1359379989;
                        i2 = 1013915315;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        c13832 = c13831;
                    } else {
                        iM2762 = C0773.m3169("۠۠") ^ i6;
                        i3 = ((iM2762 ^ i5) * (-16623)) ^ 1237421302;
                        i4 = 562407816;
                        i8 = iM2762 ^ i4;
                        i7 = i3;
                    }
                    break;
                default:
                    i12 = 61375;
                    iM2761 = (C0619.m2761("ۜܿ") ^ i6) * (-91);
                    i = ((iM2761 ^ i5) * 17733) ^ 1162519826;
                    i2 = 110901331;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    c13832 = c13831;
                    break;
            }
            return;
        }
    }
}
