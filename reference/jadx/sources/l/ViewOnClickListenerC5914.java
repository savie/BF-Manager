package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۚ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC5914 extends AbstractActivityC17204 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f20232;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f20233;

    /* JADX INFO: renamed from: ᩷ܰۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f20234 = {5949, -24533, -20911, 20807, 2769, 17240, 22541, 16847, 21867, 23908, 17884, 21809, -21731, -17168, 19128, 23940, -19080, 23268, 17200, 28273, -17602, 17553, 32318, 19239, 28346, 27791, -18613, 23615, -19771, -18051, -19399, 26378, -23791, -18986, 16539, 19679, -22706, -23158, 18828, 18091, 25277, -17184, -22901, -17327, -18679, -22164, 24535, 7830, 6531, 8926, 11789, 10870, 6749, -6956, 31887, 31889, 6452, 6905, -1752, -647, 29069, 2754, 9956, 212, 9957, 212, 20438, 28071, 21051, 1876, 32342, 24754, -19826, -24848, -32569, -27500, 9895, 16114, -15747, 12134, 15446, 9110, 15429, 21125, 21122, 21148, 21145, 21144, 21171, 21121, 21129, 21144, 21124, 21123, 21128, 2990, 24709, 18977, 23774, 29683, -19823, 25261, -19195, 20333, 18375, 18700, 23558, 23281, -18320, 24109, -23787, -19047, 22003, 28515, 26991, 20149, 18552, 27243, -18133, 25637, -24424, -18707, 27514, 18625, 22921, -20377, 18854, 26830, -19835, 28303, 24273, -18993, 15781, 15780, 15779, 15778, 15777, 15776, 15791, 15790, 15830, 15829, 15828, 15827, 15826, 15825, 15824, 15839, 15837, 15836, 15835, 15834, 15833, 15815, 15814, 15813, 15812, 15811, 15810, 15809, 15808, 15823, 15822, 15821, 15862, 15861, 15860, 15859, 15858, 15857, 15856, 15871, 15869, 15868, 15867, 15866, 15865, 15847, 15846, 15845, 15844, 15843, 15842, 15841, 15840, 15855, 15854, 15853, 21991, -18313, -18106, 15773, -18825, -23550, 26972, 15845, 15858, 15857, 15858, 15845, 15845, 15862, 15867, 15828, 15864, 15859, 15858, 6213, -5492, -5477, -5480, -5477, -5492, -5492, -5473, -5486, -5443, -5487, -5478, -5477, 5392, 26810, -25034, -18155, -27614, -16951, -32053, -16996, -17403, -30116, -30271, 27927, -17277, 4174, -20097, -20160, -20139, -20130, -20122, -20135, -20160, -20111, -20141, -20156, -20135, -20154, -20135, -20156, -20151, 4350, -17704, 21842, 23360, -12378, -12337, -12338, -12343, -12344, -12341, -12342, -12347, -12348, -12356, -12336, -12363, -12361, -12336, -12365, -12371, -12336, -12377, -12384, -12410, -12340, -12337, -12416, -22706, -16498, 16818, -12297, -18417, 22288, 22440, 17384, -26568, 18686, 22884, 22097, 19187, -22630, 19741, -22097, 19417, -20549, -22016, -12360, -12401, -12401, -12398, -12401, -12324, -25011, 22068, 17497};

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20235 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public TextView f20236;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C20084 f20237;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f20238;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f20239;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f20240;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public boolean f20241;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C24720 f20242;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        short[] sArr2 = null;
        int i3 = 0;
        int i4 = 1830331814;
        int i5 = AbstractC0641.f2496;
        int i6 = C11235.f35427;
        int iM3169 = (C0773.m3169("ۡܿ") ^ i6) * 63;
        int i7 = ((iM3169 ^ i5) * 27943) ^ (-2146966719);
        int i8 = -964682301;
        while (true) {
            i4 = ((((i4 ^ i5) * (-30971)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1847936941:
                case 1369839844:
                    if ((s * s3) - i > 0) {
                        iM3169 = (C0619.m2761("ܺ֫") + i6) * (-53);
                        i7 = ((iM3169 ^ i5) * (-8449)) ^ (-1852786095);
                        i8 = 538086931;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֨") ^ i6;
                        i7 = ((iM3169 ^ i5) * 18305) ^ 1512435094;
                        i8 = -1582132921;
                    }
                    break;
                case -1810053050:
                case 1469717902:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("ۖۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-9263)) ^ 1380989949;
                        i8 = -1331142968;
                    } else {
                        iM3169 = C0619.m2761("۠۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23721)) ^ 1633733646;
                        i8 = 1865209830;
                    }
                    break;
                case -1747730480:
                case -436625896:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۖۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-9263)) ^ 1380989949;
                        i8 = -1331142968;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ᩳ᩺")) * 63;
                        i7 = ((iM3169 ^ i5) * 21999) ^ (-313275970);
                        i8 = 1741547193;
                    }
                    break;
                case -1545786461:
                case 861117318:
                    i2 = 45360;
                    iM3169 = C0773.m3169("ۤۚ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 9465) ^ (-1547853827);
                    i8 = 1774362757;
                    break;
                case -1454404015:
                case -85445774:
                    AbstractC3624.m11755();
                    C2419.m8174();
                    return null;
                case -1298199362:
                case 2039114589:
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0773.m3169("۟ۘ") + i6) * 29;
                        i7 = ((iM3169 ^ i5) * 26027) ^ (-504817114);
                        i8 = -402034198;
                    } else {
                        iM3169 = (C0773.m3169("ۖۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-9263)) ^ 1380989949;
                        i8 = -1331142968;
                    }
                    break;
                case -1226219548:
                case -898305202:
                    i2 = 51037;
                    iM3169 = C0773.m3169("ۤۚ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 9465) ^ (-1547853827);
                    i8 = 1774362757;
                    break;
                case -1210300405:
                case 1737271895:
                    if (!C1783.m6232()) {
                        iM3169 = (C0773.m3169("ۖۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-9263)) ^ 1380989949;
                        i8 = -1331142968;
                    } else {
                        iM3169 = (C0619.m2761("ۚ۟") ^ i5) * 35;
                        i7 = ((iM3169 ^ i6) * 7927) ^ (-1437998844);
                        i8 = 1382436180;
                    }
                    break;
                case -1147681623:
                case 1067107114:
                    int i9 = s + s2;
                    i = i9 * i9;
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-9283)) ^ (-1661534589);
                        i8 = -2080079893;
                    } else {
                        iM3169 = (C0619.m2761("ۚ۟") ^ i5) * 35;
                        i7 = ((iM3169 ^ i6) * 7927) ^ (-1437998844);
                        i8 = 1382436180;
                    }
                    break;
                case -952567951:
                case -510082413:
                    return RunnableC0334.m2049(sArr2, i3, 15, i2);
                case -871944847:
                case 511962279:
                    C4282.m13644();
                    iM3169 = (C0619.m2761("ۚ۟") ^ i5) * 35;
                    i7 = ((iM3169 ^ i6) * 7927) ^ (-1437998844);
                    i8 = 1382436180;
                    break;
                case -795170955:
                case 1864315841:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-24307)) ^ 463086090;
                        i8 = -177328245;
                    } else {
                        iM3169 = C0773.m3169("ܿ֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-15429)) ^ (-613541593);
                        i8 = -640841844;
                    }
                    break;
                case -484972287:
                case 462537388:
                    sArr2 = f20234;
                    i3 = 234;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-24307)) ^ 463086090;
                        i8 = -177328245;
                    } else {
                        iM3169 = C0619.m2761("ۤܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15539) ^ (-908082043);
                        i8 = 1937386780;
                    }
                    break;
                case -480721259:
                case 920513320:
                    sArr = f20234;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("۟ۘ") + i6) * 29;
                        i7 = ((iM3169 ^ i5) * 26027) ^ (-504817114);
                        i8 = -402034198;
                    } else {
                        iM3169 = (i6 - C0773.m3169("۠ۚ")) * (-25);
                        i7 = ((iM3169 ^ i5) * 23131) ^ 1068627992;
                        i8 = -924759049;
                    }
                    break;
                case -428002466:
                case 249549649:
                    s = sArr[c];
                    s2 = 19766;
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0773.m3169("᩻᩸") ^ i5) * 17;
                        i7 = ((iM3169 ^ i6) * 16821) ^ 928886628;
                        i8 = -1965323999;
                    } else {
                        iM3169 = C0619.m2761("᩵۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * 5959) ^ (-187743624);
                        i8 = -1253282349;
                    }
                    break;
                case 317219099:
                case 1125626090:
                    c = 233;
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("ᩴ֡") + i5) * 43;
                        i7 = ((iM3169 ^ i6) * 22643) ^ 1716330780;
                        i8 = -1273500437;
                    } else {
                        iM3169 = (C0619.m2761("ۚ۟") ^ i5) * 35;
                        i7 = ((iM3169 ^ i6) * 7927) ^ (-1437998844);
                        i8 = 1382436180;
                    }
                    break;
                case 357806380:
                case 1269942771:
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-24307)) ^ 463086090;
                        i8 = -177328245;
                    } else {
                        iM3169 = (C0619.m2761("ۚ۟") ^ i5) * 35;
                        i7 = ((iM3169 ^ i6) * 7927) ^ (-1437998844);
                        i8 = 1382436180;
                    }
                    break;
                case 384209151:
                case 1445073842:
                    s3 = 79064;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-24307)) ^ 463086090;
                        i8 = -177328245;
                    } else {
                        iM3169 = C0773.m3169("ۢᩴ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 26431) ^ (-195813573);
                        i8 = 454017651;
                    }
                    break;
                default:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0773.m3169("ۖۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-9263)) ^ 1380989949;
                        i8 = -1331142968;
                    } else {
                        iM3169 = (C0619.m2761("ۢᩳ") ^ i6) * (-101);
                        i7 = ((iM3169 ^ i5) * 29147) ^ 489120479;
                        i8 = 1541726729;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01b7 A[PHI: r3 r4 r11 r17
      0x01b7: PHI (r3v3 short) = (r3v2 short), (r3v1 short) binds: [B:51:0x01b5, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r4v3 short) = (r4v2 short), (r4v1 short) binds: [B:51:0x01b5, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:51:0x01b5, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r17v13 int) = (r17v8 int), (r17v14 int) binds: [B:51:0x01b5, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241 A[PHI: r1 r17
      0x0241: PHI (r1v4 short[]) = (r1v1 short[]), (r1v2 short[]), (r1v1 short[]) binds: [B:63:0x023f, B:59:0x021f, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r17v23 int) = (r17v5 int), (r17v6 int), (r17v24 int) binds: [B:63:0x023f, B:59:0x021f, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0274 A[PHI: r5 r6 r7 r9 r10 r17
      0x0274: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r17v17 int) = (r17v4 int), (r17v9 int), (r17v10 int), (r17v12 int), (r17v20 int) binds: [B:67:0x0272, B:47:0x018f, B:43:0x016c, B:25:0x00a3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (l.C3448.f11240 >= 0) goto L7;
     */
    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC5914.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x017a A[PHI: r6
      0x017a: PHI (r6v9 l.᩻ۜ֫) = (r6v4 l.᩻ۜ֫), (r6v5 l.᩻ۜ֫), (r6v4 l.᩻ۜ֫) binds: [B:55:0x0178, B:23:0x005d, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17159(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        int iM2761;
        int i;
        int i2 = -847207022;
        int i3 = C1826.f6190;
        int i4 = C3448.f11240;
        int iM2762 = (C0619.m2761("֡ۘ") + i4) * 91;
        int i5 = ((iM2762 ^ i3) * (-29213)) ^ 184558020;
        int i6 = 1437890454;
        while (true) {
            int i7 = iM2762 ^ i6;
            RunnableC24862 runnableC24862 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 27757) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2090942082:
                    case 836247650:
                        int i8 = 2;
                        if (!C3077.f9998) {
                        }
                        runnableC24862 = new RunnableC24862(i8, abstractActivityC17204);
                        if (RunnableC0334.f1808 <= 0) {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i3) * (-63);
                            i5 = ((iM2761 ^ i4) * (-15557)) ^ (-280755939);
                            i = -1919385239;
                        } else {
                            iM2761 = C0619.m2761("ۙ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-629)) ^ 670700049;
                            i = -785575860;
                        }
                        i7 = iM2761 ^ i;
                        break;
                        break;
                    case -2063571291:
                    case -943524999:
                        if (C2485.f7950 != 0) {
                            iM2761 = C0619.m2761("ۖۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 139) ^ 918718314;
                            i = 2027010251;
                        } else {
                            iM2761 = C0619.m2761("ۗ֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19597)) ^ 1163716878;
                            i = 98980710;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1904908849:
                    case -1528518188:
                        if (C0269.f1558 <= 0) {
                            iM2761 = C0619.m2761("ۖۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 139) ^ 918718314;
                            i = 2027010251;
                        } else {
                            iM2761 = (i3 - C0619.m2761("ۘܽ")) * q.h;
                            i5 = ((iM2761 ^ i4) * (-13357)) ^ (-229431520);
                            i = 2111940589;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1869029722:
                    case -943183838:
                        C1321.m4852();
                        break;
                    case -1784327055:
                    case -675239010:
                        if (C1080.f3865 >= 0) {
                            iM2761 = (C0619.m2761("ۗܳ") ^ i4) * (-91);
                            i5 = ((iM2761 ^ i3) * (-221)) ^ (-2084492743);
                            i = 159236621;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ۡۗ")) * (-47);
                            i5 = ((iM2761 ^ i3) * 16667) ^ 660324679;
                            i = -1242022070;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1552021935:
                    case 953788320:
                        break;
                    case -1493469265:
                    case -1363594606:
                        if (RunnableC3646.f12471) {
                            iM2761 = (C0619.m2761("ۗܳ") ^ i4) * (-91);
                            i5 = ((iM2761 ^ i3) * (-221)) ^ (-2084492743);
                            i = 159236621;
                        } else {
                            iM2761 = C0619.m2761("ۖۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 139) ^ 918718314;
                            i = 2027010251;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1439954730:
                    case -842844642:
                        if (C4282.f15546 > 0) {
                            iM2761 = (i3 - C0619.m2761("ۢ᩹")) * 9;
                            i5 = ((iM2761 ^ i4) * 341) ^ (-599851007);
                            i = 1539755790;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1245131413:
                    case -834227855:
                        C2419.m8178(runnableC24862, 300L);
                        iM2761 = C0773.m3169("ۘ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * 11281) ^ 1850343767;
                        i = -795820031;
                        i7 = iM2761 ^ i;
                        break;
                    case -922785031:
                    case 1687547471:
                        if (C1826.f6190 <= 0) {
                        }
                        iM2761 = C0619.m2761("ۖۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 139) ^ 918718314;
                        i = 2027010251;
                        i7 = iM2761 ^ i;
                        break;
                    case -828716994:
                    case 1484304547:
                        if (C0950.f3488 < 0) {
                            iM2761 = C0619.m2761("ۧ֨") ^ i3;
                            i5 = ((iM2761 ^ i4) * 22907) ^ (-1428198469);
                            i = -359625335;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -660992496:
                    case -278463782:
                        if (C1542.f5343 > 0) {
                            iM2761 = (C0619.m2761("᩶ۤ") ^ i4) * (-73);
                            i5 = ((iM2761 ^ i3) * (-6329)) ^ (-664867516);
                            i = -1698174309;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 533532131:
                    case 1050579095:
                        if (C1519.f5300 >= 0) {
                            iM2761 = (C0773.m3169("᩷ܺ") + i3) * 13;
                            i5 = ((iM2761 ^ i4) * (-29901)) ^ 41449199;
                            i = 1533661461;
                        } else {
                            RunnableC1848.m6363(abstractActivityC17204, new Intent(abstractActivityC17204, (Class<?>) ViewOnClickListenerC5914.class));
                            if (z) {
                                iM2761 = C0619.m2761("ۗ᩶") ^ i4;
                                i5 = ((iM2761 ^ i3) * 23149) ^ (-854338950);
                                i = 1796707239;
                            } else {
                                iM2761 = C0773.m3169("ۘ۟") ^ i4;
                                i5 = ((iM2761 ^ i3) * 11281) ^ 1850343767;
                                i = -795820031;
                            }
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1243055727:
                    case 1746461518:
                        C17202.m40372();
                        C1564.m5509();
                        iM2761 = C0619.m2761("ۖۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 139) ^ 918718314;
                        i = 2027010251;
                        i7 = iM2761 ^ i;
                        break;
                    case 1627633973:
                    case 2132545332:
                        if (C3448.f11240 >= 0) {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i3) * (-63);
                            i5 = ((iM2761 ^ i4) * (-15557)) ^ (-280755939);
                            i = -1919385239;
                        } else {
                            iM2761 = C0773.m3169("ۢܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-27939)) ^ 53462104;
                            i = 1113942241;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        C1783.m6232();
                        if (C1519.f5300 >= 0) {
                            iM2761 = (C0619.m2761("ۗܳ") ^ i4) * (-91);
                            i5 = ((iM2761 ^ i3) * (-221)) ^ (-2084492743);
                            i = 159236621;
                        } else {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i3) * (-63);
                            i5 = ((iM2761 ^ i4) * (-15557)) ^ (-280755939);
                            i = -1919385239;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM2762 = (C0619.m2761("ۗۤ") ^ i3) * (-115);
            i5 = ((iM2762 ^ i4) * (-17197)) ^ (-1297910643);
            i6 = -424683795;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static CharSequence m17168(boolean z) {
        int iM3169;
        int i;
        int i2;
        int i3;
        int iM31610;
        int i4;
        int i5;
        int iM2761;
        int i6;
        int i7;
        UnderlineSpan underlineSpan = null;
        int length = 0;
        int i8 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -754719421;
        int i14 = C1826.f6190;
        int i15 = C1564.f5401;
        int iM2762 = C0619.m2761("᩸᩶") ^ i15;
        int i16 = ((iM2762 ^ i14) * (-1553)) ^ 1168764060;
        int i17 = iM2762 ^ (-2002715078);
        while (true) {
            SpannableString spannableString = null;
            while (true) {
                i13 = i17 ^ (i16 & (((i13 ^ i14) * 19385) >> 31));
                switch (i13) {
                    case -2113151015:
                    case -24459176:
                        underlineSpan = underlineSpan;
                        String strM33137 = z ? C13473.m33137(f20234, 64, 2, i12) : C2702.m8881(f20234, 62, 2, i12);
                        short[] sArr2 = f20234;
                        if (C3492.f12043 > 0) {
                            i8 = i8;
                            int iM31611 = C0773.m3169(C2023.m6966(sArr2, 66, 3, i12));
                            if (C2310.f7472 < 0) {
                                String strM1244 = AbstractC0116.m1244(iM31611 ^ 2116326213);
                                if (C3998.f13671 == 0) {
                                    String strM4946 = C1343.m4946(strM33137, strM1244);
                                    if (C2287.m7745() <= 0) {
                                        iM31610 = C0773.m3169("ܽ۟") ^ i15;
                                        i4 = ((iM31610 ^ i14) * 17295) ^ 1318436045;
                                        i5 = 1802056297;
                                        i17 = iM31610 ^ i5;
                                        i16 = i4;
                                        underlineSpan = underlineSpan;
                                        length = length;
                                        i8 = i8;
                                        break;
                                    } else {
                                        SpannableString spannableString2 = new SpannableString(strM4946);
                                        underlineSpan = new UnderlineSpan();
                                        if (AbstractC3624.m11755() == 0) {
                                            int iM2763 = C0619.m2761("ۖۖ") ^ i15;
                                            i17 = 1557817932 ^ iM2763;
                                            spannableString = spannableString2;
                                            i16 = ((iM2763 ^ i14) * 1045) ^ (-218292285);
                                            length = length;
                                            i8 = i8;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                underlineSpan = underlineSpan;
                            }
                            int iM2764 = C0619.m2761("ۘܿ") ^ i14;
                            i17 = iM2764 ^ 1521216851;
                            i16 = ((iM2764 ^ i15) * 14227) ^ (-1893143836);
                            length = length;
                            i8 = i8;
                        } else {
                            i8 = i8;
                        }
                        iM31610 = (C0619.m2761("ۜ֡") ^ i14) * (-7);
                        i4 = ((iM31610 ^ i15) * (-10605)) ^ 2136524196;
                        i5 = -931645685;
                        i17 = iM31610 ^ i5;
                        i16 = i4;
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        break;
                    case -2059109551:
                    case 707209511:
                        SpannableString spannableString3 = spannableString;
                        spannableString3.setSpan(underlineSpan, 2, length, 17);
                        if (C18978.m44085()) {
                            iM2761 = C0773.m3169("۫ܰ") ^ i15;
                            i6 = ((iM2761 ^ i14) * (-15847)) ^ (-1979151646);
                            i7 = -1052338342;
                        } else {
                            iM2761 = (C0619.m2761("ۗܳ") + i14) * 91;
                            i6 = ((iM2761 ^ i15) * (-7921)) ^ 1409019427;
                            i7 = -812651599;
                        }
                        spannableString = spannableString3;
                        i17 = iM2761 ^ i7;
                        i16 = i6;
                        i8 = 2;
                        break;
                    case -1815262504:
                    case 642601279:
                        spannableString = spannableString;
                        length = spannableString.length();
                        if (C2966.m9664()) {
                            int iM2765 = C0619.m2761("ܿۨ") ^ i15;
                            underlineSpan = underlineSpan;
                            i = ((iM2765 ^ i14) * (-4181)) ^ 1876238313;
                            i3 = iM2765 ^ (-2917013);
                        } else {
                            underlineSpan = underlineSpan;
                            i8 = i8;
                            int iM31612 = (i14 - C0773.m3169("ܿܽ")) * 7;
                            i = ((iM31612 ^ i15) * (-31993)) ^ 1913523145;
                            i3 = iM31612 ^ (-546008822);
                            i8 = i8;
                        }
                        SpannableString spannableString4 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString4;
                        break;
                    case -1159995105:
                    case 301872280:
                        if (C3033.f9831 < 0) {
                            length = length;
                            i8 = i8;
                            int iM2766 = C0619.m2761("ۘܿ") ^ i14;
                            i17 = iM2766 ^ 1521216851;
                            i16 = ((iM2766 ^ i15) * 14227) ^ (-1893143836);
                            length = length;
                            i8 = i8;
                        }
                        int iM31613 = (C0773.m3169("ᩴᩳ") + i15) * 51;
                        i17 = iM31613 ^ 1091299065;
                        i16 = ((iM31613 ^ i14) * 8351) ^ (-1396589465);
                        break;
                    case -1143887028:
                    case 1755189543:
                        return spannableString.subSequence(i8, spannableString.length());
                    case -1031899547:
                    case 1806429758:
                        i12 = 244;
                        iM3169 = (i14 - C0773.m3169("֨ۤ")) * (-107);
                        i = ((iM3169 ^ i15) * (-8589)) ^ (-758882083);
                        i2 = 720744927;
                        i3 = iM3169 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString5 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString5;
                        break;
                    case -802316179:
                    case 1720974989:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i18 = s + s2;
                        if (i11 - (i18 * i18) >= 0) {
                            iM3169 = (C0619.m2761("᩶ۡ") + i14) * 115;
                            i = ((iM3169 ^ i15) * 10765) ^ (-1501768134);
                            i2 = -1776839821;
                        } else {
                            iM3169 = (C0773.m3169("ۢۧ") ^ i15) * (-25);
                            i = ((iM3169 ^ i14) * (-6845)) ^ 1242226754;
                            i2 = 470155912;
                        }
                        i3 = iM3169 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString6 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString6;
                        break;
                    case -752549426:
                    case -171005031:
                        C0619.m2763();
                        return null;
                    case -620270681:
                    case 456978546:
                        i12 = 59133;
                        iM3169 = (i14 - C0773.m3169("֨ۤ")) * (-107);
                        i = ((iM3169 ^ i15) * (-8589)) ^ (-758882083);
                        i2 = 720744927;
                        i3 = iM3169 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString7 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString7;
                        break;
                    case -413851299:
                    case -231452297:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        sArr = f20234;
                        c = a.h;
                        if (!C2878.f9462) {
                            iM3169 = C0773.m3169("᩸ۢ") ^ i14;
                            i = ((iM3169 ^ i15) * 25359) ^ (-44835147);
                            i2 = 506326846;
                            i3 = iM3169 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString8 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString8;
                        } else {
                            underlineSpan = underlineSpan;
                            int iM2767 = C0619.m2761("ۘܿ") ^ i14;
                            i17 = iM2767 ^ 1521216851;
                            i16 = ((iM2767 ^ i15) * 14227) ^ (-1893143836);
                            length = length;
                            i8 = i8;
                        }
                        break;
                    case 306744000:
                    case 1335060925:
                        return spannableString;
                    case 491423029:
                    case 1619317800:
                        if (C23916.f77426 <= 0) {
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                            iM31610 = (C0619.m2761("ۜ֡") ^ i14) * (-7);
                            i4 = ((iM31610 ^ i15) * (-10605)) ^ 2136524196;
                            i5 = -931645685;
                            i17 = iM31610 ^ i5;
                            i16 = i4;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        int iM31614 = (C0773.m3169("ᩴᩳ") + i15) * 51;
                        i17 = iM31614 ^ 1091299065;
                        i16 = ((iM31614 ^ i14) * 8351) ^ (-1396589465);
                        break;
                    case 769752847:
                    case 2010907623:
                        C1542.m5459();
                        C1542.m5459();
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        iM31610 = (C0619.m2761("ۜ֡") ^ i14) * (-7);
                        i4 = ((iM31610 ^ i15) * (-10605)) ^ 2136524196;
                        i5 = -931645685;
                        i17 = iM31610 ^ i5;
                        i16 = i4;
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        break;
                    case 1045300691:
                    case 1242813054:
                        C1564.m5509();
                        if (C1343.f4799 == 0) {
                            i8 = i8;
                            spannableString = spannableString;
                            underlineSpan = underlineSpan;
                            int iM31615 = (i14 - C0773.m3169("ܿܽ")) * 7;
                            i = ((iM31615 ^ i15) * (-31993)) ^ 1913523145;
                            i3 = iM31615 ^ (-546008822);
                            i8 = i8;
                            SpannableString spannableString9 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString9;
                        } else {
                            int iM31616 = (C0773.m3169("ᩴᩳ") + i15) * 51;
                            i17 = iM31616 ^ 1091299065;
                            i16 = ((iM31616 ^ i14) * 8351) ^ (-1396589465);
                        }
                        break;
                    case 1054157015:
                    case 1528442781:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i19 = i9 + i10;
                        i11 = i19 + i19;
                        s2 = 7639;
                        if (RunnableC0334.f1808 > 0) {
                            iM3169 = C0773.m3169("ۨܳ") ^ i15;
                            i = ((iM3169 ^ i14) * 31091) ^ 551300877;
                            i2 = 470073973;
                            i3 = iM3169 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString10 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString10;
                        } else {
                            underlineSpan = underlineSpan;
                            int iM2768 = C0619.m2761("ۘܿ") ^ i14;
                            i17 = iM2768 ^ 1521216851;
                            i16 = ((iM2768 ^ i15) * 14227) ^ (-1893143836);
                            length = length;
                            i8 = i8;
                        }
                        break;
                    case 1380425124:
                    case 2060183475:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        s = sArr[c];
                        if (C3099.f10023 > 0) {
                            iM3169 = C0619.m2761("ۘ᩸") ^ i15;
                            i = ((iM3169 ^ i14) * (-25299)) ^ (-554499269);
                            i2 = 2049349952;
                            i3 = iM3169 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString11 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString11;
                        } else {
                            length = length;
                            int iM31617 = (i14 - C0773.m3169("ܿܽ")) * 7;
                            i = ((iM31617 ^ i15) * (-31993)) ^ 1913523145;
                            i3 = iM31617 ^ (-546008822);
                            i8 = i8;
                            SpannableString spannableString12 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString12;
                        }
                        break;
                    default:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        i9 = s * s;
                        i10 = 58354321;
                        if (C3492.f12043 > 0) {
                            iM3169 = C0773.m3169("ۨ֨") ^ i14;
                            i = ((iM3169 ^ i15) * (-15153)) ^ (-2043147802);
                            i2 = 1073727418;
                            i3 = iM3169 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString13 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString13;
                        } else {
                            iM31610 = C0773.m3169("ܽ۟") ^ i15;
                            i4 = ((iM31610 ^ i14) * 17295) ^ 1318436045;
                            i5 = 1802056297;
                            i17 = iM31610 ^ i5;
                            i16 = i4;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        break;
                }
            }
        }
    }

    public ViewOnClickListenerC5914() {
        ArrayList arrayList = null;
        int i = -1951411831;
        int i2 = C1564.f5401;
        int i3 = C1321.f4751;
        int iM2761 = C0619.m2761("۟֫") ^ i3;
        int i4 = ((iM2761 ^ i2) * 14037) ^ 1133219841;
        int i5 = 741536236;
        while (true) {
            i = ((((i ^ i2) * 30381) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2060688227:
                case -1969941774:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0773.m3169("֨᩶") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-30283)) ^ 1890494409;
                        i5 = 1374942770;
                    } else {
                        iM2761 = C0773.m3169("֫ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14193) ^ (-600863585);
                        i5 = -146300215;
                    }
                    break;
                case -1984856178:
                case -1770694822:
                    this.f20242 = C24720.m55197();
                    return;
                case -1968507845:
                case -1169720562:
                    arrayList = new ArrayList();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i2 - C0619.m2761("۬۬")) * 77;
                        i4 = ((iM2761 ^ i3) * (-8837)) ^ 2035106601;
                        i5 = 921244188;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֨ܺ")) * (-65);
                        i4 = ((iM2761 ^ i3) * 14277) ^ (-1770095589);
                        i5 = 1521641474;
                    }
                    break;
                case -1868021595:
                case 1762387777:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (i2 - C0619.m2761("۬۬")) * 77;
                        i4 = ((iM2761 ^ i3) * (-8837)) ^ 2035106601;
                        i5 = 921244188;
                    } else {
                        iM2761 = C0773.m3169("ۡۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31523)) ^ 631364380;
                        i5 = 488274861;
                    }
                    break;
                case -1209723066:
                case -377138869:
                    C1080.m4050();
                    iM2761 = C0773.m3169("ܶ֡") ^ i3;
                    i4 = ((iM2761 ^ i2) * 27331) ^ 1334736457;
                    i5 = 1610724221;
                    break;
                case -1204321139:
                case -963016403:
                    C2287.m7745();
                    throw new RuntimeException();
                case -1149077312:
                case -638520710:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20673) ^ (-1814256114);
                        i5 = 1399723936;
                    } else {
                        iM2761 = (C0773.m3169("᩶۫") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * (-9329)) ^ (-2080869264);
                        i5 = 627414517;
                    }
                    break;
                case -1046142312:
                case 1546640357:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20673) ^ (-1814256114);
                        i5 = 1399723936;
                    } else {
                        iM2761 = C0619.m2761("ۚۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24759) ^ 1444690487;
                        i5 = 579351831;
                    }
                    break;
                case -677121771:
                case 186304302:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (i2 - C0619.m2761("۬۬")) * 77;
                        i4 = ((iM2761 ^ i3) * (-8837)) ^ 2035106601;
                        i5 = 921244188;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩹") + i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-18833)) ^ (-260400545);
                        i5 = -760824890;
                    }
                    break;
                case -563479946:
                case 762970287:
                    this.f20238 = arrayList;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("֨᩶") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-30283)) ^ 1890494409;
                        i5 = 1374942770;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3741)) ^ 843474951;
                        i5 = -215587548;
                    }
                    break;
                case -187378315:
                case 1373621035:
                    if (C17202.f56030) {
                        iM2761 = (i2 - C0619.m2761("ۧۛ")) * 19;
                        i4 = ((iM2761 ^ i3) * 11431) ^ 628947614;
                        i5 = 1883159500;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۬۬")) * 77;
                        i4 = ((iM2761 ^ i3) * (-8837)) ^ 2035106601;
                        i5 = 921244188;
                    }
                    break;
                case 124315576:
                case 1603642483:
                    C1826.m6301();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20673) ^ (-1814256114);
                        i5 = 1399723936;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۫᩺")) * 93;
                        i4 = ((iM2761 ^ i3) * (-11605)) ^ (-1477937101);
                        i5 = -2055644429;
                    }
                    break;
                case 229387719:
                case 1407545137:
                    if (!C2354.m7983()) {
                        iM2761 = C0773.m3169("ܶ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27331) ^ 1334736457;
                        i5 = 1610724221;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۬۬")) * 77;
                        i4 = ((iM2761 ^ i3) * (-8837)) ^ 2035106601;
                        i5 = 921244188;
                    }
                    break;
                case 917052911:
                case 996833859:
                    if (C0773.m3161() != 0) {
                        iM2761 = C0773.m3169("ܶ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27331) ^ 1334736457;
                        i5 = 1610724221;
                    } else {
                        iM2761 = C0619.m2761("ۢۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21533) ^ (-124003390);
                        i5 = -1389048605;
                    }
                    break;
                case 1265395479:
                case 1478430698:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20673) ^ (-1814256114);
                        i5 = 1399723936;
                    } else {
                        iM2761 = C0773.m3169("۟ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23273) ^ (-322305959);
                        i5 = -1645052195;
                    }
                    break;
                default:
                    C1564.m5509();
                    if (C3998.f13671 != 0) {
                        iM2761 = (i2 - C0773.m3169("۫᩺")) * 93;
                        i4 = ((iM2761 ^ i3) * (-11605)) ^ (-1477937101);
                        i5 = -2055644429;
                    } else {
                        iM2761 = C0773.m3169("ܶ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27331) ^ 1334736457;
                        i5 = 1610724221;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:79:0x036d A[PHI: r8 r21 r33
      0x036d: PHI (r8v4 android.view.View) = (r8v3 android.view.View), (r8v1 android.view.View), (r8v1 android.view.View) binds: [B:77:0x0356, B:73:0x031e, B:60:0x0287] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r21v6 l.ᩴ᩷ۧ) = (r21v1 l.ᩴ᩷ۧ), (r21v2 l.ᩴ᩷ۧ), (r21v1 l.ᩴ᩷ۧ) binds: [B:77:0x0356, B:73:0x031e, B:60:0x0287] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r33v31 int) = (r33v27 int), (r33v29 int), (r33v33 int) binds: [B:77:0x0356, B:73:0x031e, B:60:0x0287] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public void m17160() {
        TextView textView;
        int i;
        String str;
        String str2;
        int i2;
        int iM3169;
        int i3;
        short[] sArr;
        int i4;
        View view;
        int iM2761;
        int i5;
        int i6;
        int i7;
        int iM31610;
        int i8;
        int i9;
        String strM11765;
        int iM31611;
        int i10;
        int i11;
        int iM2762;
        int i12;
        int iM2763;
        int i13;
        int i14;
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = this;
        TextView textView2 = null;
        String str3 = null;
        View viewM9476 = null;
        int i15 = 0;
        C20084 c20084 = null;
        String strM5510 = null;
        int iM2764 = 0;
        int iM2765 = 0;
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = -1608848575;
        int i19 = C1564.f5401;
        int i20 = C1321.f4751;
        int iM31612 = C0773.m3169("ܳۜ") ^ i19;
        int i21 = ((iM31612 ^ i20) * (-20227)) ^ (-1341047770);
        int i22 = iM31612 ^ (-1204005263);
        TextView textView3 = null;
        Resources resources = null;
        Long lM12001 = null;
        Button button = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean zM44085 = false;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        Object[] objArr = null;
        View viewM9477 = null;
        View viewM9478 = null;
        String strM44074 = null;
        View viewM5518 = null;
        View viewM9479 = null;
        long jM44076 = 0;
        int i32 = 0;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 22901) >> 31));
            switch (i18) {
                case -2123869232:
                case 680162640:
                    resources = resources;
                    i7 = i27;
                    strM11765 = AbstractC3624.m11765(C0773.m3169(C1080.m4056(f20234, 14, 3, i26)) ^ 2127529077);
                    str3 = strM11765;
                    iM31610 = (C0619.m2761("ᩳ֨") + i19) * (-43);
                    i8 = ((iM31610 ^ i20) * 22231) ^ (-1401880282);
                    i9 = -1575926625;
                    i22 = iM31610 ^ i9;
                    i21 = i8;
                    i27 = i7;
                    viewM9478 = viewM9478;
                    resources = resources;
                    i24 = i24;
                    break;
                case -1855522002:
                case 656859183:
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr = sArr3;
                    i4 = i30;
                    view = viewM9478;
                    textView3 = (TextView) C2878.m9476(viewOnClickListenerC5914, iM2764 ^ 2123362192);
                    strM44074 = C18978.m44074();
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i19;
                        i5 = ((iM2761 ^ i20) * (-13449)) ^ (-1868760738);
                        i6 = 712986381;
                    } else {
                        iM2761 = (i20 - C0619.m2761("᩹۟")) * 91;
                        i5 = ((iM2761 ^ i19) * (-19165)) ^ (-138517087);
                        i6 = -1690632771;
                    }
                    i22 = iM2761 ^ i6;
                    i21 = i5;
                    viewM9478 = view;
                    i30 = i4;
                    sArr3 = sArr;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    break;
                case -1851525785:
                case -1408518742:
                    i24 = i24;
                    textView = textView3;
                    resources = resources;
                    i = i27;
                    viewM9478 = viewM9478;
                    str = strM44074;
                    C23916.m53425(textView, str);
                    sArr3 = f20234;
                    i30 = 11;
                    i31 = 3;
                    if (C3734.f12817 < 0) {
                        textView3 = textView;
                        int iM2766 = C0619.m2761("ܳܿ") ^ i19;
                        str2 = str;
                        i22 = iM2766 ^ 603850685;
                        i21 = ((iM2766 ^ i20) * (-8273)) ^ (-222878426);
                        i27 = i;
                        viewM9478 = viewM9478;
                        resources = resources;
                        i24 = i24;
                        TextView textView4 = textView3;
                        strM44074 = str2;
                        textView3 = textView4;
                    } else {
                        int iM31613 = C0773.m3169("ܰ᩷") ^ i20;
                        TextView textView5 = textView;
                        i21 = ((iM31613 ^ i19) * (-7701)) ^ (-1358368619);
                        i22 = iM31613 ^ (-1359526067);
                        i27 = i;
                        textView3 = textView5;
                        strM44074 = str;
                        viewM9478 = viewM9478;
                        resources = resources;
                        i24 = i24;
                    }
                    break;
                case -1838866750:
                case 455750470:
                    i15 = 0;
                    iM3169 = (i20 - C0773.m3169("ᩳۧ")) * 27;
                    i2 = ((iM3169 ^ i19) * 12795) ^ 1247065390;
                    i3 = -1662425019;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -1820631279:
                case -1485650244:
                    i23 = i23;
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr2 = sArr2;
                    i29 = i29;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str4 = strM44074;
                    textView3 = textView3;
                    str2 = str4;
                    viewM9477 = C2878.m9476(viewOnClickListenerC5914, C0619.m2761(strM5510) ^ 2125512882);
                    if (AbstractC0641.f2496 >= 0) {
                        iM2763 = (i19 - C0773.m3169("ۡܰ")) * 101;
                        i13 = ((iM2763 ^ i20) * (-10617)) ^ (-1672727877);
                        i14 = 224521914;
                    } else {
                        iM2763 = C0619.m2761("֫۬") ^ i20;
                        i13 = ((iM2763 ^ i19) * 22965) ^ (-1616313936);
                        i14 = -921574945;
                    }
                    i22 = iM2763 ^ i14;
                    i21 = i13;
                    i29 = i29;
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr2 = sArr2;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView6 = textView3;
                    strM44074 = str2;
                    textView3 = textView6;
                    break;
                case -1782909906:
                case 1935982496:
                    C0269.m1775();
                    if (C13473.f42873 == 0) {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        sArr = sArr3;
                        i4 = i30;
                        view = viewM9478;
                        iM2761 = C0619.m2761("᩸ۨ") ^ i19;
                        i5 = ((iM2761 ^ i20) * (-13449)) ^ (-1868760738);
                        i6 = 712986381;
                        i22 = iM2761 ^ i6;
                        i21 = i5;
                        viewM9478 = view;
                        i30 = i4;
                        sArr3 = sArr;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    } else {
                        iM31611 = C0619.m2761("۠᩻") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-27783)) ^ (-1307235890);
                        i11 = 1369504635;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    }
                    break;
                case -1757369075:
                case -736708847:
                    i24 = i24;
                    C2485.m8358(viewM9479, i25);
                    iM2765 = C0619.m2761(C2834.m9343(f20234, 35, 3, i26));
                    i16 = 2128717728;
                    if (C3492.f12043 > 0) {
                        iM3169 = C0773.m3169("᩺᩶") ^ i20;
                        i2 = ((iM3169 ^ i19) * (-5581)) ^ 666078489;
                        i3 = -1763029459;
                        i22 = iM3169 ^ i3;
                        i21 = i2;
                        i24 = i24;
                    } else {
                        resources = resources;
                        i27 = i27;
                        sArr2 = sArr2;
                        i29 = i29;
                        sArr3 = sArr3;
                        i30 = i30;
                        viewM9478 = viewM9478;
                        String str5 = strM44074;
                        textView3 = textView3;
                        str2 = str5;
                        iM2763 = (i19 - C0773.m3169("ۡܰ")) * 101;
                        i13 = ((iM2763 ^ i20) * (-10617)) ^ (-1672727877);
                        i14 = 224521914;
                        i22 = iM2763 ^ i14;
                        i21 = i13;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView7 = textView3;
                        strM44074 = str2;
                        textView3 = textView7;
                    }
                    break;
                case -1746605904:
                case 1413820744:
                    i23 = i23;
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr2 = sArr2;
                    i29 = i29;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str6 = strM44074;
                    textView3 = textView3;
                    str2 = str6;
                    zM44085 = C18978.m44085();
                    strM5510 = C1564.m5510(f20234, 5, 3, i26);
                    if (AbstractC3624.f12429 > 0) {
                        iM2762 = (C0619.m2761("ۙۨ") ^ i19) * (-65);
                        i21 = ((iM2762 ^ i20) * 32447) ^ (-1877818996);
                        i12 = 2028525784;
                        i22 = iM2762 ^ i12;
                        viewOnClickListenerC5914 = this;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView8 = textView3;
                        strM44074 = str2;
                        textView3 = textView8;
                    } else {
                        i29 = i29;
                        sArr2 = sArr2;
                        int iM31614 = C0773.m3169("ۖᩴ") ^ i19;
                        i21 = ((iM31614 ^ i20) * 6081) ^ (-488367999);
                        i22 = iM31614 ^ (-1826816110);
                        viewOnClickListenerC5914 = this;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView9 = textView3;
                        strM44074 = str2;
                        textView3 = textView9;
                    }
                    break;
                case -1660660989:
                case 2041575833:
                    C1080.m4060(button, C0619.m2761(C3734.m12149(f20234, 38, 3, i26)) ^ 2126621505);
                    iM3169 = (C0619.m2761("ۨ۫") ^ i19) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM3169 ^ i20) * (-23221)) ^ (-1600102139);
                    i3 = -1214785784;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -1395221435:
                case 1626446477:
                    C1080.m4060(button, C0619.m2761(C2878.m9486(f20234, 44, 3, i26)) ^ 2098747190);
                    iM3169 = (C0619.m2761("ۨ۫") ^ i19) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM3169 ^ i20) * (-23221)) ^ (-1600102139);
                    i3 = -1214785784;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -1352921798:
                case 645142900:
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str7 = strM44074;
                    textView3 = textView3;
                    str2 = str7;
                    i23 = i23;
                    short[] sArr4 = sArr2;
                    i29 = i29;
                    iM2764 = C0619.m2761(RunnableC3646.m11809(sArr4, i29, 3, i26));
                    if (C17202.f56030) {
                        sArr2 = sArr4;
                        iM2763 = C0619.m2761("ۘܶ") ^ i20;
                        i13 = ((iM2763 ^ i19) * 2725) ^ (-1015624017);
                        i14 = -2118196214;
                    } else {
                        iM2763 = C0773.m3169("ܳۡ") ^ i19;
                        sArr2 = sArr4;
                        i13 = ((iM2763 ^ i20) * (-5723)) ^ 1729676369;
                        i14 = 58935580;
                    }
                    i22 = iM2763 ^ i14;
                    i21 = i13;
                    i29 = i29;
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr2 = sArr2;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView10 = textView3;
                    strM44074 = str2;
                    textView3 = textView10;
                    break;
                case -1350884079:
                case 19347943:
                    viewM9478 = viewM9478;
                    i24 = i24;
                    i27 = i27;
                    jM44076 = (C18978.m44076() - C2834.m9342()) / 86400000;
                    Resources resourcesM49055 = C21576.m49055();
                    if (C1080.f3865 < 0) {
                        int iM2767 = (C0619.m2761("ۨۘ") + i19) * (-71);
                        i2 = ((iM2767 ^ i20) * 12021) ^ (-329796987);
                        i22 = iM2767 ^ (-133839492);
                        i27 = i27;
                        viewM9478 = viewM9478;
                        resources = resourcesM49055;
                        i21 = i2;
                        i24 = i24;
                    } else {
                        resources = resourcesM49055;
                        String str8 = strM44074;
                        textView3 = textView3;
                        str2 = str8;
                        int iM31615 = C0773.m3169("ۖᩴ") ^ i19;
                        i21 = ((iM31615 ^ i20) * 6081) ^ (-488367999);
                        i22 = iM31615 ^ (-1826816110);
                        viewOnClickListenerC5914 = this;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView11 = textView3;
                        strM44074 = str2;
                        textView3 = textView11;
                    }
                    break;
                case -1173075440:
                case 1119855611:
                    C1080.m4060(button, C0773.m3169(C2288.m7761(f20234, 41, 3, i26)) ^ 2100633628);
                    iM3169 = (C0619.m2761("ۨ۫") ^ i19) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM3169 ^ i20) * (-23221)) ^ (-1600102139);
                    i3 = -1214785784;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -1103737183:
                case 141517169:
                    C17202.m40372();
                    if (!C0619.f2439) {
                        iM31611 = C0619.m2761("۠᩻") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-27783)) ^ (-1307235890);
                        i11 = 1369504635;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    } else {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        sArr2 = sArr2;
                        i29 = i29;
                        sArr3 = sArr3;
                        i30 = i30;
                        viewM9478 = viewM9478;
                        String str9 = strM44074;
                        textView3 = textView3;
                        str2 = str9;
                        iM2763 = (i19 - C0773.m3169("ۡܰ")) * 101;
                        i13 = ((iM2763 ^ i20) * (-10617)) ^ (-1672727877);
                        i14 = 224521914;
                        i22 = iM2763 ^ i14;
                        i21 = i13;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView12 = textView3;
                        strM44074 = str2;
                        textView3 = textView12;
                    }
                    break;
                case -1028959797:
                case -178877616:
                    i23 = i23;
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr2 = sArr2;
                    i29 = i29;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str10 = strM44074;
                    textView3 = textView3;
                    str2 = str10;
                    short s2 = f20234[4];
                    int i33 = s2 + 15082;
                    if (C3099.f10023 <= 0) {
                        s = s2;
                        i17 = i33;
                        iM2762 = C0773.m3169("֫ܿ") ^ i20;
                        i21 = ((iM2762 ^ i19) * (-13395)) ^ 1227944914;
                        i12 = -217066105;
                        i22 = iM2762 ^ i12;
                        viewOnClickListenerC5914 = this;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    } else {
                        int iM31616 = C0773.m3169("ۤܶ") ^ i19;
                        s = s2;
                        int i34 = ((iM31616 ^ i20) * 11653) ^ (-779996345);
                        i22 = iM31616 ^ 1209257444;
                        i17 = i33;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        i21 = i34;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        viewOnClickListenerC5914 = this;
                    }
                    TextView textView13 = textView3;
                    strM44074 = str2;
                    textView3 = textView13;
                    break;
                case -1017359619:
                case 1614547955:
                    i32 = 0;
                    iM3169 = (C0619.m2761("ۚܶ") ^ i19) * (-81);
                    i2 = ((iM3169 ^ i20) * 17807) ^ (-7225240);
                    i3 = -403247438;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -1004382465:
                case 784979434:
                    i24 = i24;
                    if (C3077.m10037()) {
                        iM3169 = (C0619.m2761("ۡ֨") + i20) * (-75);
                        i2 = ((iM3169 ^ i19) * 21293) ^ 2103843853;
                        i3 = 1342701511;
                    } else {
                        iM3169 = C0773.m3169("ۤ᩺") ^ i19;
                        i2 = ((iM3169 ^ i20) * 19815) ^ (-1287722823);
                        i3 = -1065133131;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -978582462:
                case 128378295:
                    i24 = i24;
                    resources = resources;
                    viewM9478 = viewM9478;
                    long j = jM44076;
                    i27 = (int) j;
                    lM12001 = C3690.m12001(j);
                    Object[] objArr2 = new Object[1];
                    if (C0269.f1558 > 0) {
                        int iM2768 = (i20 - C0619.m2761("۫ۨ")) * (-53);
                        i21 = ((iM2768 ^ i19) * (-7433)) ^ 1253459620;
                        i22 = iM2768 ^ (-1018945943);
                        viewM9478 = viewM9478;
                        objArr = objArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    } else {
                        objArr = objArr2;
                        String str11 = strM44074;
                        textView3 = textView3;
                        str2 = str11;
                        iM2762 = C0773.m3169("֫ܿ") ^ i20;
                        i21 = ((iM2762 ^ i19) * (-13395)) ^ 1227944914;
                        i12 = -217066105;
                        i22 = iM2762 ^ i12;
                        viewOnClickListenerC5914 = this;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView14 = textView3;
                        strM44074 = str2;
                        textView3 = textView14;
                    }
                    break;
                case -975085628:
                case 428141843:
                    i24 = i24;
                    resources = resources;
                    i7 = i27;
                    viewM9478 = viewM9478;
                    if (C3077.m10037()) {
                        iM31610 = C0773.m3169("ۖۡ") ^ i19;
                        i8 = ((iM31610 ^ i20) * (-8001)) ^ (-1660509493);
                        i9 = -705946007;
                    } else {
                        iM31610 = C0773.m3169("ܳܺ") ^ i20;
                        i8 = ((iM31610 ^ i19) * 31647) ^ 1669119109;
                        i9 = -1128423477;
                    }
                    i22 = iM31610 ^ i9;
                    i21 = i8;
                    i27 = i7;
                    viewM9478 = viewM9478;
                    resources = resources;
                    i24 = i24;
                    break;
                case -974967177:
                case 537906980:
                    i24 = i24;
                    C23916.m53425(textView2, str3);
                    viewM9476 = C2878.m9476(viewOnClickListenerC5914, C0773.m3169(C1826.m6310(f20234, 23, 3, i26)) ^ 2128354204);
                    if (zM44085) {
                        iM3169 = (C0773.m3169("ᩴۤ") ^ i19) * 91;
                        i2 = ((iM3169 ^ i20) * (-12083)) ^ 962080003;
                        i3 = 1311583589;
                    } else {
                        iM3169 = (C0619.m2761("ۜܽ") + i20) * (-93);
                        i2 = ((iM3169 ^ i19) * (-16225)) ^ (-1558108227);
                        i3 = -398200490;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -936592891:
                case 1526555908:
                    i24 = -14540254;
                    iM31611 = (C0773.m3169("ۛܽ") + i20) * (-127);
                    i10 = ((iM31611 ^ i19) * (-4077)) ^ (-671134286);
                    i11 = -324968167;
                    i22 = iM31611 ^ i11;
                    i21 = i10;
                    break;
                case -935734952:
                case 1500053602:
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    short[] sArr5 = sArr3;
                    int i35 = i31;
                    View view2 = viewM9478;
                    int i36 = i30;
                    TextView textView15 = (TextView) C1564.m5518(viewOnClickListenerC5914, C0773.m3169(C1542.m5471(sArr5, i36, i35, i26)) ^ 2122381781);
                    i28 = 0;
                    if (!C18978.m44085()) {
                        int iM31617 = C0773.m3169("᩶ᩳ") ^ i19;
                        i22 = iM31617 ^ (-1082789686);
                        i21 = ((iM31617 ^ i20) * (-9721)) ^ (-138410012);
                        i31 = i35;
                        viewM9478 = view2;
                        i30 = i36;
                        sArr3 = sArr5;
                        textView2 = textView15;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    } else {
                        int iM31618 = C0773.m3169("ܳ֫") ^ i20;
                        i21 = ((iM31618 ^ i19) * 21287) ^ 67063536;
                        i22 = iM31618 ^ 670066803;
                        i30 = i36;
                        i31 = i35;
                        i27 = i27;
                        viewM9478 = view2;
                        sArr3 = sArr5;
                        textView2 = textView15;
                        resources = resources;
                        i24 = i24;
                    }
                    break;
                case -859443618:
                case 126855011:
                    i24 = i24;
                    C20084 c20085 = viewOnClickListenerC5914.f20237;
                    if (c20085 != null) {
                        int iM2769 = (C0619.m2761("֫ۗ") ^ i20) * (-127);
                        i22 = iM2769 ^ 1910469516;
                        c20084 = c20085;
                        i21 = ((iM2769 ^ i19) * 31043) ^ (-79700823);
                    } else {
                        c20084 = c20085;
                        iM3169 = C0773.m3169("᩵ܰ") ^ i20;
                        i2 = ((iM3169 ^ i19) * 14223) ^ (-220831291);
                        i3 = -262244361;
                        i22 = iM3169 ^ i3;
                        i21 = i2;
                    }
                    i24 = i24;
                    break;
                case -774866541:
                case 227218877:
                    i24 = i24;
                    C13473.m33140(viewM5518, i32);
                    viewM9479 = C2878.m9476(viewOnClickListenerC5914, C0619.m2761(C3033.m9847(f20234, 32, 3, i26)) ^ 2101310484);
                    if (zM44085) {
                        iM3169 = C0773.m3169("᩵ܰ") ^ i20;
                        i2 = ((iM3169 ^ i19) * 14223) ^ (-220831291);
                        i3 = -262244361;
                    } else {
                        iM3169 = C0619.m2761("֫᩶") ^ i19;
                        i2 = ((iM3169 ^ i20) * 6309) ^ (-1636542606);
                        i3 = -1236089402;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -747771665:
                case 812768874:
                    i24 = i24;
                    button = (Button) C2878.m9476(viewOnClickListenerC5914, iM2765 ^ i16);
                    C23916.m53431(button, !zM44085);
                    if (zM44085) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i20;
                        i2 = ((iM3169 ^ i19) * 30707) ^ (-666789009);
                        i3 = 1000104647;
                    } else {
                        iM3169 = C0773.m3169("ᩴ۟") ^ i19;
                        i2 = ((iM3169 ^ i20) * (-5991)) ^ (-2011122690);
                        i3 = -1095332441;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -604356593:
                case 1455789015:
                    i24 = i24;
                    i25 = 8;
                    iM3169 = C0619.m2761("۟ۙ") ^ i19;
                    i2 = ((iM3169 ^ i20) * 17405) ^ (-402717994);
                    i3 = -1367241352;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -591077964:
                case 539999125:
                    i15 = 8;
                    iM3169 = (i20 - C0773.m3169("ᩳۧ")) * 27;
                    i2 = ((iM3169 ^ i19) * 12795) ^ 1247065390;
                    i3 = -1662425019;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -562346586:
                case 725087571:
                    C2485.m8357();
                    C3779.m12264();
                    break;
                case -411663074:
                case 733748731:
                    i24 = i24;
                    if (c20084.f64549) {
                        i25 = i28;
                        iM3169 = C0619.m2761("۟ۙ") ^ i19;
                        i2 = ((iM3169 ^ i20) * 17405) ^ (-402717994);
                        i3 = -1367241352;
                    } else {
                        iM3169 = C0773.m3169("᩵ܰ") ^ i20;
                        i2 = ((iM3169 ^ i19) * 14223) ^ (-220831291);
                        i3 = -262244361;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case -389000528:
                case 1280005776:
                    str2 = strM44074;
                    i26 = 12585;
                    iM2762 = (C0619.m2761("ۛ᩹") ^ i20) * 11;
                    i21 = ((iM2762 ^ i19) * (-11057)) ^ (-1958495292);
                    i12 = 2093945343;
                    i22 = iM2762 ^ i12;
                    viewOnClickListenerC5914 = this;
                    i29 = i29;
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr2 = sArr2;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView16 = textView3;
                    strM44074 = str2;
                    textView3 = textView16;
                    break;
                case -376704897:
                case 1489392616:
                    if (!C2878.f9462) {
                        iM31611 = (C0619.m2761("ۖ֫") + i20) * (-15);
                        i10 = ((iM31611 ^ i19) * (-12391)) ^ (-550674519);
                        i11 = 1806758882;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    } else {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        sArr = sArr3;
                        i4 = i30;
                        view = viewM9478;
                        iM2761 = C0619.m2761("᩸ۨ") ^ i19;
                        i5 = ((iM2761 ^ i20) * (-13449)) ^ (-1868760738);
                        i6 = 712986381;
                        i22 = iM2761 ^ i6;
                        i21 = i5;
                        viewM9478 = view;
                        i30 = i4;
                        sArr3 = sArr;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    }
                    break;
                case -334826084:
                case 1358232942:
                    C2966.m9664();
                    C1343.m4943();
                    iM31611 = C0619.m2761("۠᩻") ^ i19;
                    i10 = ((iM31611 ^ i20) * (-27783)) ^ (-1307235890);
                    i11 = 1369504635;
                    i22 = iM31611 ^ i11;
                    i21 = i10;
                    break;
                case -33961408:
                case 847573125:
                    i23 = i23;
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr2 = sArr2;
                    i29 = i29;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str12 = strM44074;
                    textView3 = textView3;
                    str2 = str12;
                    int i37 = (s * s) + 227466724;
                    if ((i17 * i17) - (i37 + i37) <= 0) {
                        iM2762 = (C0773.m3169("ۚ᩺") ^ i20) * 57;
                        i21 = ((iM2762 ^ i19) * 19669) ^ 1666588112;
                        i12 = 1537760531;
                    } else {
                        iM2762 = C0619.m2761("᩺᩻") ^ i19;
                        i21 = ((iM2762 ^ i20) * (-29605)) ^ (-1259894528);
                        i12 = 1056559618;
                    }
                    i22 = iM2762 ^ i12;
                    viewOnClickListenerC5914 = this;
                    i29 = i29;
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr2 = sArr2;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView17 = textView3;
                    strM44074 = str2;
                    textView3 = textView17;
                    break;
                case 16459204:
                case 1189902392:
                    if (zM44085) {
                        iM31611 = C0773.m3169("۠۠") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-31745)) ^ 1325973946;
                        i11 = 1925513401;
                    } else {
                        iM31611 = C0773.m3169("ۤۤ") ^ i20;
                        i10 = ((iM31611 ^ i19) * 31501) ^ 1549191849;
                        i11 = 1857337854;
                    }
                    i22 = iM31611 ^ i11;
                    i21 = i10;
                    break;
                case 139607306:
                case 894288264:
                    i24 = -12303292;
                    iM31611 = (C0773.m3169("ۛܽ") + i20) * (-127);
                    i10 = ((iM31611 ^ i19) * (-4077)) ^ (-671134286);
                    i11 = -324968167;
                    i22 = iM31611 ^ i11;
                    i21 = i10;
                    break;
                case 163501682:
                case 1998176286:
                    if (!RunnableC1848.f6235) {
                        iM31611 = C0619.m2761("۠᩻") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-27783)) ^ (-1307235890);
                        i11 = 1369504635;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    } else {
                        i24 = i24;
                        textView = textView3;
                        resources = resources;
                        i = i27;
                        viewM9478 = viewM9478;
                        str = strM44074;
                        int iM31619 = C0773.m3169("ܰ᩷") ^ i20;
                        TextView textView18 = textView;
                        i21 = ((iM31619 ^ i19) * (-7701)) ^ (-1358368619);
                        i22 = iM31619 ^ (-1359526067);
                        i27 = i;
                        textView3 = textView18;
                        strM44074 = str;
                        viewM9478 = viewM9478;
                        resources = resources;
                        i24 = i24;
                    }
                    break;
                case 202439704:
                case 1357616590:
                    C0487.m2356();
                    if (C3734.f12817 < 0) {
                        iM31611 = (C0773.m3169("ۘ۠") + i20) * 17;
                        i10 = ((iM31611 ^ i19) * (-26201)) ^ 1407804268;
                        i11 = 428586177;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    } else {
                        i24 = i24;
                        textView = textView3;
                        resources = resources;
                        i = i27;
                        viewM9478 = viewM9478;
                        str = strM44074;
                        int iM316110 = C0773.m3169("ܰ᩷") ^ i20;
                        TextView textView19 = textView;
                        i21 = ((iM316110 ^ i19) * (-7701)) ^ (-1358368619);
                        i22 = iM316110 ^ (-1359526067);
                        i27 = i;
                        textView3 = textView19;
                        strM44074 = str;
                        viewM9478 = viewM9478;
                        resources = resources;
                        i24 = i24;
                    }
                    break;
                case 220280280:
                case 1587007468:
                    i24 = i24;
                    C13473.m33140(viewM9476, i15);
                    viewM9478 = C2878.m9476(viewOnClickListenerC5914, C0773.m3169(C0773.m3166(f20234, 26, 3, i26)) ^ 2097950473);
                    if (zM44085) {
                        iM3169 = C0619.m2761("ܽۜ") ^ i20;
                        i2 = ((iM3169 ^ i19) * (-16865)) ^ (-1010330798);
                        i3 = -1817843888;
                    } else {
                        iM3169 = (C0619.m2761("ܿۗ") ^ i19) * 47;
                        i2 = ((iM3169 ^ i20) * (-12529)) ^ (-348545411);
                        i3 = -413858668;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case 222788232:
                case 1871284229:
                    i23 = i23;
                    i24 = i24;
                    resources = resources;
                    i27 = i27;
                    sArr3 = sArr3;
                    i30 = i30;
                    viewM9478 = viewM9478;
                    String str13 = strM44074;
                    textView3 = textView3;
                    str2 = str13;
                    C2354.m7978((TextView) viewM9477, C0773.m3167());
                    sArr2 = f20234;
                    i29 = 8;
                    if (RunnableC1848.m6360()) {
                        int iM316111 = C0773.m3169("ۖᩴ") ^ i19;
                        i21 = ((iM316111 ^ i20) * 6081) ^ (-488367999);
                        i22 = iM316111 ^ (-1826816110);
                        viewOnClickListenerC5914 = this;
                    } else {
                        int iM31620 = (i19 - C0773.m3169("᩸۫")) * 79;
                        i22 = iM31620 ^ (-173321036);
                        i21 = ((iM31620 ^ i20) * (-11645)) ^ (-1368756225);
                    }
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView110 = textView3;
                    strM44074 = str2;
                    textView3 = textView110;
                    break;
                case 282117421:
                case 1680721131:
                    i32 = 8;
                    iM3169 = (C0619.m2761("ۚܶ") ^ i19) * (-81);
                    i2 = ((iM3169 ^ i20) * 17807) ^ (-7225240);
                    i3 = -403247438;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case 331997198:
                case 1726954449:
                    i23 = 0;
                    iM3169 = (C0619.m2761("۠ۡ") + i19) * (-113);
                    i2 = ((iM3169 ^ i20) * (-5005)) ^ (-784030522);
                    i3 = -10872998;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case 438675159:
                case 866825187:
                    resources = resources;
                    i7 = i27;
                    strM11765 = AbstractC3624.m11765(C0773.m3169(C13473.m33137(f20234, 17, 3, i26)) ^ 2125516855);
                    str3 = strM11765;
                    iM31610 = (C0619.m2761("ᩳ֨") + i19) * (-43);
                    i8 = ((iM31610 ^ i20) * 22231) ^ (-1401880282);
                    i9 = -1575926625;
                    i22 = iM31610 ^ i9;
                    i21 = i8;
                    i27 = i7;
                    viewM9478 = viewM9478;
                    resources = resources;
                    i24 = i24;
                    break;
                case 500061398:
                case 1508755173:
                    i24 = i24;
                    C13473.m33140(viewM9478, i23);
                    viewM5518 = C1564.m5518(viewOnClickListenerC5914, C0619.m2761(C1783.m6233(f20234, 29, 3, i26)) ^ 2098869942);
                    if (zM44085) {
                        iM3169 = C0619.m2761("ۖ᩵") ^ i20;
                        i2 = ((iM3169 ^ i19) * 15437) ^ (-1856495443);
                        i3 = -1236732919;
                    } else {
                        iM3169 = (C0773.m3169("ۨܺ") + i20) * (-71);
                        i2 = ((iM3169 ^ i19) * 1839) ^ (-1874654588);
                        i3 = -1419728682;
                    }
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case 893247252:
                case 2034498223:
                    i23 = 8;
                    iM3169 = (C0619.m2761("۠ۡ") + i19) * (-113);
                    i2 = ((iM3169 ^ i20) * (-5005)) ^ (-784030522);
                    i3 = -10872998;
                    i22 = iM3169 ^ i3;
                    i21 = i2;
                    i24 = i24;
                    break;
                case 1103335843:
                case 1637728184:
                    objArr[i28] = lM12001;
                    resources = resources;
                    i7 = i27;
                    strM11765 = resources.getQuantityString(C0773.m3169(C2023.m6966(f20234, 20, 3, i26)) ^ 2097541282, i7, objArr);
                    str3 = strM11765;
                    iM31610 = (C0619.m2761("ᩳ֨") + i19) * (-43);
                    i8 = ((iM31610 ^ i20) * 22231) ^ (-1401880282);
                    i9 = -1575926625;
                    i22 = iM31610 ^ i9;
                    i21 = i8;
                    i27 = i7;
                    viewM9478 = viewM9478;
                    resources = resources;
                    i24 = i24;
                    break;
                case 1148026096:
                case 1685107267:
                    str2 = strM44074;
                    i26 = 27467;
                    iM2762 = (C0619.m2761("ۛ᩹") ^ i20) * 11;
                    i21 = ((iM2762 ^ i19) * (-11057)) ^ (-1958495292);
                    i12 = 2093945343;
                    i22 = iM2762 ^ i12;
                    viewOnClickListenerC5914 = this;
                    i29 = i29;
                    viewM9478 = viewM9478;
                    i30 = i30;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr2 = sArr2;
                    resources = resources;
                    i27 = i27;
                    i24 = i24;
                    TextView textView111 = textView3;
                    strM44074 = str2;
                    textView3 = textView111;
                    break;
                case 1436007432:
                case 1676536662:
                    C1826.m6301();
                    if (!C3077.f9998) {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        sArr = sArr3;
                        i4 = i30;
                        view = viewM9478;
                        iM2761 = C0619.m2761("᩸ۨ") ^ i19;
                        i5 = ((iM2761 ^ i20) * (-13449)) ^ (-1868760738);
                        i6 = 712986381;
                        i22 = iM2761 ^ i6;
                        i21 = i5;
                        viewM9478 = view;
                        i30 = i4;
                        sArr3 = sArr;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    } else {
                        iM31611 = C0773.m3169("۬֡") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-20457)) ^ 681582389;
                        i11 = 166953510;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    }
                    break;
                case 1464785906:
                case 1573047088:
                    if (C1564.f5401 > 0) {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        viewM9478 = viewM9478;
                        String str14 = strM44074;
                        textView3 = textView3;
                        str2 = str14;
                        iM2762 = C0773.m3169("֫ܿ") ^ i20;
                        i21 = ((iM2762 ^ i19) * (-13395)) ^ 1227944914;
                        i12 = -217066105;
                        i22 = iM2762 ^ i12;
                        viewOnClickListenerC5914 = this;
                        i29 = i29;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr2 = sArr2;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView112 = textView3;
                        strM44074 = str2;
                        textView3 = textView112;
                    } else {
                        iM31611 = C0619.m2761("۠᩻") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-27783)) ^ (-1307235890);
                        i11 = 1369504635;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                    }
                    break;
                case 2008049518:
                case 2031373985:
                    C3998.m12920();
                    if (C2023.m6964() <= 0) {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        viewM9478 = viewM9478;
                        String str15 = strM44074;
                        textView3 = textView3;
                        str2 = str15;
                        int iM316112 = C0773.m3169("ۖᩴ") ^ i19;
                        i21 = ((iM316112 ^ i20) * 6081) ^ (-488367999);
                        i22 = iM316112 ^ (-1826816110);
                        viewOnClickListenerC5914 = this;
                        viewM9478 = viewM9478;
                        i30 = i30;
                        sArr3 = sArr3;
                        i23 = i23;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                        TextView textView113 = textView3;
                        strM44074 = str2;
                        textView3 = textView113;
                    } else {
                        i24 = i24;
                        resources = resources;
                        i27 = i27;
                        sArr = sArr3;
                        i4 = i30;
                        view = viewM9478;
                        iM2761 = C0619.m2761("᩸ۨ") ^ i19;
                        i5 = ((iM2761 ^ i20) * (-13449)) ^ (-1868760738);
                        i6 = 712986381;
                        i22 = iM2761 ^ i6;
                        i21 = i5;
                        viewM9478 = view;
                        i30 = i4;
                        sArr3 = sArr;
                        resources = resources;
                        i27 = i27;
                        i24 = i24;
                    }
                    break;
                default:
                    C2966.m9667(button, i24);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0320 A[PHI: r2 r3 r4 r13 r26
      0x0320: PHI (r2v9 android.widget.LinearLayout) = (r2v4 android.widget.LinearLayout), (r2v2 android.widget.LinearLayout), (r2v2 android.widget.LinearLayout) binds: [B:68:0x031e, B:64:0x02f2, B:15:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r3v5 java.util.ArrayList) = (r3v2 java.util.ArrayList), (r3v3 java.util.ArrayList), (r3v2 java.util.ArrayList) binds: [B:68:0x031e, B:64:0x02f2, B:15:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r4v5 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:68:0x031e, B:64:0x02f2, B:15:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r13v38 short[]) = (r13v9 short[]), (r13v10 short[]), (r13v39 short[]) binds: [B:68:0x031e, B:64:0x02f2, B:15:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r26v32 java.lang.String) = (r26v8 java.lang.String), (r26v9 java.lang.String), (r26v33 java.lang.String) binds: [B:68:0x031e, B:64:0x02f2, B:15:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public void m17163() {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        int i4;
        int iM2763;
        int i5;
        int i6;
        int iM2764;
        int i7;
        int i8;
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = this;
        int i9 = C3033.f9831;
        int i10 = AbstractC0641.f2496;
        int iM3169 = (i10 - C0773.m3169("۫ۖ")) * (-47);
        int i11 = ((iM3169 ^ i9) * (-26967)) ^ (-258168725);
        ArrayList arrayList = null;
        Iterator itM53423 = null;
        C15608 c15608 = null;
        StringBuilder sb = null;
        String str = null;
        String strM9937 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM3169 ^ (-1101264648);
        LinearLayout linearLayout = null;
        int iM8177 = 0;
        boolean z = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z2 = false;
        short s = 0;
        short s2 = 0;
        int iM2765 = 0;
        boolean z3 = false;
        int i16 = 1630712094;
        C8667 c8667 = null;
        int i17 = 0;
        while (true) {
            i16 = i12 ^ (i11 & (((i16 ^ i9) * 6901) >> 31));
            switch (i16) {
                case -2123542940:
                case -222057386:
                    str = str;
                    sArr = sArr;
                    linearLayout = (LinearLayout) C1564.m5518(viewOnClickListenerC5914, iM2765 ^ 2123197490);
                    if (C1826.f6190 <= 0) {
                        iM2763 = (C0773.m3169("ܳ۟") ^ i10) * 93;
                        i5 = ((iM2763 ^ i9) * 21417) ^ 183272230;
                        i6 = 761545147;
                    } else {
                        iM2763 = (C0619.m2761("ܳ᩶") ^ i10) * (-117);
                        i5 = ((iM2763 ^ i9) * (-27831)) ^ (-728755398);
                        i6 = -2021115133;
                    }
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -1983598536:
                case 2117725314:
                    str = str;
                    ((C8667) C1542.m5457(arrayList, i13)).m23339(z);
                    m17165();
                    sArr = f20234;
                    if (C0773.m3161() == 0) {
                        iM2764 = (C0619.m2761("֫ܽ") + i9) * 47;
                        i5 = ((iM2764 ^ i10) * (-27837)) ^ (-1507470115);
                        i7 = -1174393779;
                        i8 = iM2764 ^ i7;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    } else {
                        int iM31610 = C0773.m3169("᩸᩸") ^ i9;
                        i11 = ((iM31610 ^ i10) * 30591) ^ (-2041973580);
                        i4 = iM31610 ^ (-2043243924);
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1845671461:
                case 201147896:
                    str = str;
                    sArr = sArr;
                    arrayList = viewOnClickListenerC5914.f20238;
                    C2834.m9332(arrayList);
                    linearLayout.removeAllViews();
                    iM8177 = C2419.m8177(16.0f);
                    if (C2834.f9334 <= 0) {
                        iM2763 = (C0773.m3169("ܳ۟") ^ i10) * 93;
                        i5 = ((iM2763 ^ i9) * 21417) ^ 183272230;
                        i6 = 761545147;
                    } else {
                        iM2763 = (C0619.m2761("ۤۛ") + i10) * 39;
                        i5 = ((iM2763 ^ i9) * 11843) ^ 142153181;
                        i6 = 1297198197;
                    }
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -1745893360:
                case 1618709063:
                    str = str;
                    c8667 = new C8667(viewOnClickListenerC5914);
                    sb = new StringBuilder();
                    i14 = c15608.f50722;
                    if (C1564.f5401 <= 0) {
                        iM2764 = (C0619.m2761("ۢ᩺") ^ i10) * 73;
                        i5 = ((iM2764 ^ i9) * (-14639)) ^ 863579347;
                        i7 = 592502980;
                    } else {
                        iM2764 = (C0773.m3169("֨᩵") ^ i9) * (-83);
                        i5 = ((iM2764 ^ i10) * (-15429)) ^ (-261571108);
                        i7 = -1810587761;
                    }
                    i8 = iM2764 ^ i7;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -1497367017:
                case 1122984701:
                    C20932.m47848();
                    break;
                case -1351311596:
                case -736740229:
                    str = str;
                    C3779.m12269(sb, i14);
                    sArr2 = f20234;
                    i17 = 54;
                    if (C3690.f12684 <= 0) {
                        iM2764 = (i9 - C0619.m2761("֨ᩳ")) * 67;
                        i5 = ((iM2764 ^ i10) * (-18727)) ^ 1875922746;
                        i7 = -602310505;
                    } else {
                        iM2764 = (C0773.m3169("᩹ۚ") ^ i10) * 79;
                        i5 = ((iM2764 ^ i9) * 21509) ^ (-1453671134);
                        i7 = -1504911262;
                    }
                    i8 = iM2764 ^ i7;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -1282666775:
                case 952272822:
                    str = str;
                    sArr = sArr;
                    strM9937 = RunnableC3055.m9937(sArr, 51, 3, i15);
                    if (RunnableC0334.f1808 > 0) {
                        iM2763 = C0619.m2761("ۚۙ") ^ i9;
                        i5 = ((iM2763 ^ i10) * 2715) ^ (-517204625);
                        i6 = -1441870538;
                        i8 = iM2763 ^ i6;
                        sArr = sArr;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    } else {
                        iM2761 = C0773.m3169("۟ܶ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 6985) ^ (-215797019);
                        i = -2101418574;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1271008256:
                case 1845487922:
                    str = str;
                    sArr = sArr;
                    i13 = 0;
                    if (C1826.m6317(itM53423)) {
                        iM2763 = (C0773.m3169("ۜܽ") + i10) * (-97);
                        i5 = ((iM2763 ^ i9) * 11871) ^ 865470669;
                        i6 = -1217642905;
                    } else {
                        iM2763 = (i10 - C0773.m3169("ۨ᩶")) * (-107);
                        i5 = ((iM2763 ^ i9) * (-23047)) ^ 606525204;
                        i6 = 1893363468;
                    }
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -1248905922:
                case 1620831933:
                    C0773.m3161();
                    if (C23916.f77426 > 0) {
                        str = str;
                        int iM31611 = C0773.m3169("᩸᩸") ^ i9;
                        i11 = ((iM31611 ^ i10) * 30591) ^ (-2041973580);
                        i4 = iM31611 ^ (-2043243924);
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM2763 = (C0773.m3169("ܳ۟") ^ i10) * 93;
                        i5 = ((iM2763 ^ i9) * 21417) ^ 183272230;
                        i6 = 761545147;
                        i8 = iM2763 ^ i6;
                        sArr = sArr;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    }
                    break;
                case -1218141206:
                case -615684835:
                    i15 = 31905;
                    iM2761 = C0619.m2761("ۡ᩹") ^ i9;
                    i11 = ((iM2761 ^ i10) * 21281) ^ 702532064;
                    i = -713829139;
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    str = str;
                    i12 = i4;
                    viewOnClickListenerC5914 = this;
                    break;
                case -741154454:
                case 1667574366:
                    str = str;
                    c15608 = (C15608) C0950.m3796(itM53423);
                    if (z3) {
                        iM2764 = (i10 - C0773.m3169("֡ۡ")) * (-41);
                        i5 = ((iM2764 ^ i9) * 1663) ^ (-1562308240);
                        i7 = 728285774;
                    } else {
                        iM2764 = (C0619.m2761("ۙۙ") + i9) * 79;
                        i5 = ((iM2764 ^ i10) * 3229) ^ (-228796462);
                        i7 = 59661128;
                    }
                    i8 = iM2764 ^ i7;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -705064742:
                case 1776942790:
                    if (C1542.f5343 > 0) {
                        str = str;
                        iM2764 = (i9 - C0619.m2761("֨ᩳ")) * 67;
                        i5 = ((iM2764 ^ i10) * (-18727)) ^ 1875922746;
                        i7 = -602310505;
                        i8 = iM2764 ^ i7;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    }
                    str = str;
                    sArr = sArr;
                    iM2763 = (C0773.m3169("ܳ۟") ^ i10) * 93;
                    i5 = ((iM2763 ^ i9) * 21417) ^ 183272230;
                    i6 = 761545147;
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -493077183:
                case 150782563:
                    i15 = 22076;
                    iM2761 = C0619.m2761("ۡ᩹") ^ i9;
                    i11 = ((iM2761 ^ i10) * 21281) ^ 702532064;
                    i = -713829139;
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    str = str;
                    i12 = i4;
                    viewOnClickListenerC5914 = this;
                    break;
                case -475023016:
                case 113048350:
                    linearLayout.addView(new Space(viewOnClickListenerC5914), iM8177, z ? 1 : 0);
                    z2 = z3;
                    iM2764 = C0773.m3169("᩺ۢ") ^ i10;
                    i5 = ((iM2764 ^ i9) * 20903) ^ (-1218460217);
                    i7 = -357751779;
                    i8 = iM2764 ^ i7;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case -394212656:
                case 1820687724:
                    z2 = false;
                    iM2764 = C0773.m3169("᩺ۢ") ^ i10;
                    i5 = ((iM2764 ^ i9) * 20903) ^ (-1218460217);
                    i7 = -357751779;
                    i8 = iM2764 ^ i7;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case 141274231:
                case 916557877:
                    C2354.m7983();
                    if (RunnableC0334.f1808 <= 0) {
                        str = str;
                        iM2764 = (C0619.m2761("ۢ᩺") ^ i10) * 73;
                        i5 = ((iM2764 ^ i9) * (-14639)) ^ 863579347;
                        i7 = 592502980;
                        i8 = iM2764 ^ i7;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    } else {
                        str = str;
                        int iM31612 = C0773.m3169("᩸᩸") ^ i9;
                        i11 = ((iM31612 ^ i10) * 30591) ^ (-2041973580);
                        i4 = iM31612 ^ (-2043243924);
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 282148007:
                case 443678154:
                    C3998.m12920();
                    str = str;
                    sArr = sArr;
                    iM2763 = (C0773.m3169("ܳ۟") ^ i10) * 93;
                    i5 = ((iM2763 ^ i9) * 21417) ^ 183272230;
                    i6 = 761545147;
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                case 489219327:
                case 984553727:
                    str = str;
                    sArr = sArr;
                    m17160();
                    iM2765 = C0619.m2761(C2287.m7749(f20234, 48, 3, i15));
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("۟ܶ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 6985) ^ (-215797019);
                        i = -2101418574;
                    } else {
                        iM2761 = C0773.m3169("ۜ᩻") ^ i9;
                        i11 = ((iM2761 ^ i10) * 9715) ^ 845800279;
                        i = 1857127121;
                    }
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    str = str;
                    i12 = i4;
                    viewOnClickListenerC5914 = this;
                    break;
                case 589993665:
                case 1018040751:
                    str = str;
                    sArr = sArr;
                    s2 = f20234[47];
                    s = 5647;
                    if (!C2023.f6737) {
                        iM2761 = (i10 - C0619.m2761("ᩳܿ")) * 91;
                        i11 = ((iM2761 ^ i9) * 23987) ^ (-200756128);
                        i = -333793591;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    } else {
                        sArr = sArr;
                        int iM31613 = C0773.m3169("᩸᩸") ^ i9;
                        i11 = ((iM31613 ^ i10) * 30591) ^ (-2041973580);
                        i4 = iM31613 ^ (-2043243924);
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 772105105:
                case 1171404195:
                    C2354.m7978((TextView) C2878.m9476(viewOnClickListenerC5914, C0619.m2761(strM9937) ^ 2119765602), viewOnClickListenerC5914.f20237.f64551);
                    break;
                case 803122315:
                case 1392021750:
                    c8667.m23342(str);
                    c8667.m23347(c15608.f50725);
                    c8667.m23348(c15608.f50724);
                    c8667.setTag(c15608);
                    if (C2287.f7432 < 0) {
                        C2375.m8066(linearLayout, c8667, new LinearLayout.LayoutParams(i13, -2, 1.0f));
                        C1519.m5406(arrayList, c8667);
                        C11235.m28299(c8667, viewOnClickListenerC5914);
                        z3 = z2;
                        iM2763 = (C0619.m2761("᩷ۤ") ^ i9) * (-87);
                        i5 = ((iM2763 ^ i10) * 1889) ^ 1412411743;
                        i6 = -820806273;
                        i8 = iM2763 ^ i6;
                        sArr = sArr;
                        str = str;
                        i12 = i8;
                        i11 = i5;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM2761 = C0773.m3169("۟ܶ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 6985) ^ (-215797019);
                        i = -2101418574;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 861656590:
                case 2121479455:
                    C1783.m6234(sb, C2023.m6966(sArr2, i17, 2, i15));
                    c8667.m23338(C2023.m6952(sb));
                    str = c15608.f50723;
                    if (AbstractC0641.m2813() > 0) {
                        int iM31614 = (C0773.m3169("ۢۗ") + i9) * (-101);
                        i5 = ((iM31614 ^ i10) * (-20397)) ^ 284447848;
                        i12 = iM31614 ^ 255303155;
                        i11 = i5;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM2761 = C0773.m3169("۟ܶ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 6985) ^ (-215797019);
                        i = -2101418574;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        str = str;
                        i12 = i4;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 1238307432:
                case 1811595658:
                    itM53423 = C23916.m53423(viewOnClickListenerC5914.f20237.f64552);
                    z = true;
                    z3 = true;
                    iM2763 = (C0619.m2761("᩷ۤ") ^ i9) * (-87);
                    i5 = ((iM2763 ^ i10) * 1889) ^ 1412411743;
                    i6 = -820806273;
                    i8 = iM2763 ^ i6;
                    sArr = sArr;
                    str = str;
                    i12 = i8;
                    i11 = i5;
                    break;
                default:
                    str = str;
                    sArr = sArr;
                    int i18 = s2 + s;
                    short s3 = s2;
                    if ((i18 * i18) - (s3 * 22588) >= 0) {
                        iM2762 = C0773.m3169("᩹ᩳ") ^ i9;
                        i2 = ((iM2762 ^ i10) * (-16147)) ^ (-1594784531);
                        i3 = 1488703322;
                    } else {
                        iM2762 = C0619.m2761("ۙۤ") ^ i10;
                        i2 = ((iM2762 ^ i9) * 27553) ^ (-1848895119);
                        i3 = 1749644184;
                    }
                    i4 = iM2762 ^ i3;
                    s2 = s3;
                    i11 = i2;
                    sArr = sArr;
                    str = str;
                    i12 = i4;
                    viewOnClickListenerC5914 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01e4 A[PHI: r2 r4 r5 r10 r11 r13 r15
      0x01e4: PHI (r2v3 int) = (r2v1 int), (r2v2 int), (r2v1 int), (r2v1 int) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r4v3 l.۠ۖۧ) = (r4v2 l.۠ۖۧ), (r4v2 l.۠ۖۧ), (r4v2 l.۠ۖۧ), (r4v4 l.۠ۖۧ) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r5v3 android.widget.TextView) = 
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v5 android.widget.TextView)
     binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r13v4 l.֨ۙۧ) = (r13v2 l.֨ۙۧ), (r13v2 l.֨ۙۧ), (r13v3 l.֨ۙۧ), (r13v2 l.֨ۙۧ) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:91:0x01e4, B:49:0x01e2, B:41:0x0195, B:30:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m17172() {
        int iM2761;
        int i;
        int i2;
        short[] sArr;
        int iM2762;
        int i3;
        int i4;
        int iM2763;
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = this;
        int i5 = RunnableC3055.f9898;
        int i6 = C3690.f12684;
        int iM3169 = (i5 - C0773.m3169("ۤۤ")) * 127;
        int i7 = ((iM3169 ^ i6) * 12855) ^ (-411716622);
        TextView textView = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i8 = iM3169 ^ 2016924372;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int iM31610 = 0;
        int iM31611 = 0;
        int i12 = 0;
        int i13 = 0;
        DialogInterfaceOnClickListenerC0936 dialogInterfaceOnClickListenerC0936 = null;
        short s = 0;
        int i14 = 0;
        int i15 = -1396967879;
        int i16 = 0;
        DialogInterfaceC8327 dialogInterfaceC8327M4860 = null;
        C2361 c2361 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i6) * 12629) >> 31));
            switch (i15) {
                case -1882209640:
                case -1283171709:
                    iM31611 = C0773.m3169(C0619.m2756(f20234, 230, 3, i13));
                    if (C2966.f9654 < 0) {
                        iM2761 = C0773.m3169("᩶۟") ^ i5;
                        i = ((iM2761 ^ i6) * 11429) ^ (-1627094974);
                        i2 = -96542182;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        int iM2764 = C0619.m2761("֨֡") ^ i5;
                        i7 = ((iM2764 ^ i6) * (-31467)) ^ (-51162439);
                        i8 = iM2764 ^ (-298897046);
                        dialogInterfaceOnClickListenerC0936 = null;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1782689990:
                case 1016593988:
                    C3099.m10082(c2361, 2129789786 ^ iM31610);
                    int i17 = 0;
                    if (C1321.f4751 < 0) {
                        dialogInterfaceOnClickListenerC0936 = new DialogInterfaceOnClickListenerC0936(viewOnClickListenerC5914, i17);
                        sArr4 = f20234;
                        i12 = 227;
                        if (C3779.f12953 <= 0) {
                            iM2761 = C0619.m2761("ۜᩳ") ^ i6;
                            i = ((iM2761 ^ i5) * (-30901)) ^ 1164099031;
                            i2 = 12523818;
                        } else {
                            iM2761 = (C0773.m3169("ܶ᩵") ^ i6) * 71;
                            i = ((iM2761 ^ i5) * 12795) ^ 93687201;
                            i2 = -547738147;
                        }
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        int iM2765 = C0619.m2761("֨֡") ^ i5;
                        i7 = ((iM2765 ^ i6) * (-31467)) ^ (-51162439);
                        i8 = iM2765 ^ (-298897046);
                        dialogInterfaceOnClickListenerC0936 = null;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1769075252:
                case 1748282722:
                    InterfaceC18625 interfaceC18625M3048 = AbstractC0726.m3048(dialogInterfaceC8327M4860.m22422());
                    if (!C2023.f6737) {
                        interfaceC18625M3048.mo22096(new C11133(true).m52419());
                        interfaceC18625M3048.build().mo3052(textView, C2023.m6952(RunnableC3646.m11805(textView)));
                    }
                    int iM2766 = C0619.m2761("֨֡") ^ i5;
                    i7 = ((iM2766 ^ i6) * (-31467)) ^ (-51162439);
                    i8 = iM2766 ^ (-298897046);
                    dialogInterfaceOnClickListenerC0936 = null;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1430119996:
                case 2144027530:
                    C2419.m8168(c2361, C0773.m3169(C3492.m11486(sArr4, i12, 3, i13)) ^ 2119875476, dialogInterfaceOnClickListenerC0936);
                    if (viewOnClickListenerC5914.f20241) {
                        iM2761 = (i6 - C0773.m3169("᩻ۘ")) * (-37);
                        i = ((iM2761 ^ i5) * (-24391)) ^ 208695574;
                        i2 = 1422620146;
                    } else {
                        iM2761 = C0773.m3169("֫ۚ") ^ i5;
                        i = ((iM2761 ^ i6) * 6127) ^ (-1589264992);
                        i2 = 559306656;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1297484931:
                case 1960794611:
                    C2023.m6964();
                    break;
                case -1196754259:
                case 1267499142:
                    C13473.m33136(c2361, i10 ^ i11);
                    sArr3 = f20234;
                    i9 = BERTags.FLAGS;
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ۨ᩵") ^ i5) * (-117);
                        i = ((iM2761 ^ i6) * 3683) ^ 1045702704;
                        i2 = 758613134;
                    } else {
                        iM2761 = C0619.m2761("ۜᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-30901)) ^ 1164099031;
                        i2 = 12523818;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -884336981:
                case 774155246:
                    dialogInterfaceC8327M4860 = C1321.m4860(c2361);
                    C5416.m16141(dialogInterfaceC8327M4860);
                    textView = (TextView) dialogInterfaceC8327M4860.m22423(R.id.message);
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ۜᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-30901)) ^ 1164099031;
                        i2 = 12523818;
                    } else {
                        iM2761 = C0619.m2761("ۢۛ") ^ i5;
                        i = ((iM2761 ^ i6) * (-20723)) ^ (-236838761);
                        i2 = 2089952881;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -533745211:
                case -91428195:
                    i13 = 22315;
                    int iM31612 = C0773.m3169("۟᩸") ^ i6;
                    i8 = iM31612 ^ 230466754;
                    i7 = ((iM31612 ^ i5) * (-6147)) ^ 464369121;
                    sArr2 = sArr2;
                    viewOnClickListenerC5914 = this;
                    break;
                case 270610103:
                case 1811091412:
                    C3033.m9848(c2361, 2121149014 ^ iM31611, null);
                    iM2761 = C0773.m3169("֫ۚ") ^ i5;
                    i = ((iM2761 ^ i6) * 6127) ^ (-1589264992);
                    i2 = 559306656;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 451190891:
                case 590389604:
                    i13 = 59690;
                    int iM31613 = C0773.m3169("۟᩸") ^ i6;
                    i8 = iM31613 ^ 230466754;
                    i7 = ((iM31613 ^ i5) * (-6147)) ^ 464369121;
                    sArr2 = sArr2;
                    viewOnClickListenerC5914 = this;
                    break;
                case 461503838:
                case 1539748904:
                    sArr = sArr2;
                    s = f20234[220];
                    i14 = s * 2;
                    if (C13473.f42873 == 0) {
                        iM2762 = C0619.m2761("᩸۫") ^ i5;
                        i7 = ((iM2762 ^ i6) * (-22389)) ^ 604132385;
                        i3 = -1107094150;
                        i8 = iM2762 ^ i3;
                        viewOnClickListenerC5914 = this;
                        sArr2 = sArr;
                    } else {
                        sArr2 = sArr;
                        int iM2767 = C0619.m2761("֨֡") ^ i5;
                        i7 = ((iM2767 ^ i6) * (-31467)) ^ (-51162439);
                        i8 = iM2767 ^ (-298897046);
                        dialogInterfaceOnClickListenerC0936 = null;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 722960227:
                case 1261822660:
                    RunnableC1848.m6360();
                    C2288.m7767();
                    iM2763 = i10;
                    sArr = sArr2;
                    i4 = i16;
                    int iM2768 = (C0619.m2761("ܿ֫") ^ i6) * 115;
                    int i18 = iM2763;
                    i7 = ((iM2768 ^ i5) * 26315) ^ (-1744855730);
                    i8 = iM2768 ^ 866861367;
                    i16 = i4;
                    i10 = i18;
                    sArr2 = sArr;
                    break;
                case 738675821:
                case 1215312884:
                    iM31610 = C0773.m3169(C2310.m7803(sArr3, i9, 3, i13));
                    if (C1343.f4799 == 0) {
                        iM2761 = C0773.m3169("ۢܿ") ^ i6;
                        i = ((iM2761 ^ i5) * 1529) ^ 1624989135;
                        i2 = 40133561;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        int iM2769 = C0619.m2761("֨֡") ^ i5;
                        i7 = ((iM2769 ^ i6) * (-31467)) ^ (-51162439);
                        i8 = iM2769 ^ (-298897046);
                        dialogInterfaceOnClickListenerC0936 = null;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 860818139:
                case 942244883:
                    int i19 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(viewOnClickListenerC5914);
                    sArr2 = f20234;
                    i16 = 221;
                    if (!C1146.m4231()) {
                        int iM27610 = C0619.m2761("֨֡") ^ i5;
                        i7 = ((iM27610 ^ i6) * (-31467)) ^ (-51162439);
                        i8 = iM27610 ^ (-298897046);
                        dialogInterfaceOnClickListenerC0936 = null;
                        viewOnClickListenerC5914 = this;
                    } else {
                        iM2761 = C0773.m3169("᩹ۧ") ^ i5;
                        i = ((iM2761 ^ i6) * (-14239)) ^ (-1269178288);
                        i2 = -597574345;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
                case 914256189:
                case 1821766727:
                    sArr = sArr2;
                    i4 = i16;
                    iM2763 = C0619.m2761(C2310.m7803(sArr, i4, 3, i13));
                    if (RunnableC1848.f6235) {
                        i11 = 2129073928;
                        int iM27611 = (C0619.m2761("ܿ֫") ^ i6) * 115;
                        int i110 = iM2763;
                        i7 = ((iM27611 ^ i5) * 26315) ^ (-1744855730);
                        i8 = iM27611 ^ 866861367;
                        i16 = i4;
                        i10 = i110;
                        sArr2 = sArr;
                    } else {
                        int iM27612 = (C0619.m2761("֡ᩳ") ^ i6) * 65;
                        int i20 = ((iM27612 ^ i5) * 13499) ^ 608064185;
                        i8 = iM27612 ^ 1132401855;
                        i16 = i4;
                        sArr2 = sArr;
                        i10 = iM2763;
                        i7 = i20;
                        i11 = 2129073928;
                    }
                    break;
                case 1001747899:
                case 1045215069:
                    C17202.m40372();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ۤۛ") ^ i5;
                        i = ((iM2761 ^ i6) * 32607) ^ (-1433017302);
                        i2 = -1056222064;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        iM2763 = i10;
                        sArr = sArr2;
                        i4 = i16;
                        int iM27613 = (C0619.m2761("ܿ֫") ^ i6) * 115;
                        int i111 = iM2763;
                        i7 = ((iM27613 ^ i5) * 26315) ^ (-1744855730);
                        i8 = iM27613 ^ 866861367;
                        i16 = i4;
                        i10 = i111;
                        sArr2 = sArr;
                    }
                    break;
                case 1004172625:
                case 1411176845:
                    sArr = sArr2;
                    int i21 = s + 1;
                    if ((i14 + 1) - (i21 * i21) > 0) {
                        iM2762 = (C0619.m2761("۠ᩳ") + i5) * (-33);
                        i7 = ((iM2762 ^ i6) * 32439) ^ (-961130153);
                        i3 = 682220692;
                    } else {
                        iM2762 = C0773.m3169("᩺֫") ^ i6;
                        i7 = ((iM2762 ^ i5) * (-12693)) ^ (-222451384);
                        i3 = 499178101;
                    }
                    i8 = iM2762 ^ i3;
                    viewOnClickListenerC5914 = this;
                    sArr2 = sArr;
                    break;
                case 1567281588:
                case 1693266022:
                    if (!C17202.f56030) {
                        iM2761 = C0619.m2761("ۜᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-30901)) ^ 1164099031;
                        i2 = 12523818;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        iM2763 = i10;
                        sArr = sArr2;
                        i4 = i16;
                        int iM27614 = (C0619.m2761("ܿ֫") ^ i6) * 115;
                        int i112 = iM2763;
                        i7 = ((iM27614 ^ i5) * 26315) ^ (-1744855730);
                        i8 = iM27614 ^ 866861367;
                        i16 = i4;
                        i10 = i112;
                        sArr2 = sArr;
                    }
                    break;
                default:
                    C2966.m9664();
                    if (!C1343.m4943()) {
                        iM2763 = i10;
                        sArr = sArr2;
                        i4 = i16;
                        int iM27615 = (C0619.m2761("ܿ֫") ^ i6) * 115;
                        int i113 = iM2763;
                        i7 = ((iM27615 ^ i5) * 26315) ^ (-1744855730);
                        i8 = iM27615 ^ 866861367;
                        i16 = i4;
                        i10 = i113;
                        sArr2 = sArr;
                    } else {
                        iM2761 = (C0773.m3169("ܶ֫") + i6) * 95;
                        i = ((iM2761 ^ i5) * 23083) ^ (-960156905);
                        i2 = 947347757;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator itM4942 = null;
        C8667 c8667 = null;
        boolean z = false;
        int i = -2085086678;
        int i2 = C0950.f3488;
        int i3 = AbstractC0641.f2496;
        int iM2761 = (C0619.m2761("᩺ܿ") ^ i2) * (-95);
        int i4 = ((iM2761 ^ i3) * (-6977)) ^ 1488042807;
        int i5 = -1161773155;
        while (true) {
            i = ((((i ^ i3) * (-1309)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2041699265:
                case -169984481:
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8579) ^ (-1384218557);
                        i5 = 1828242042;
                    } else {
                        iM2761 = (C0619.m2761("ܿܶ") ^ i3) * 81;
                        i4 = ((iM2761 ^ i2) * (-9595)) ^ (-1190786528);
                        i5 = 309218930;
                    }
                    break;
                case -1977045965:
                case -151109077:
                    C2878.m9491();
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("ۛܶ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 8579) ^ (-1384218557);
                    i5 = 1828242042;
                    break;
                case -1832329011:
                case -539874622:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1397)) ^ (-538042898);
                        i5 = 298522324;
                    } else {
                        iM2761 = C0619.m2761("ۙܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31255) ^ 1044828464;
                        i5 = 2036293408;
                    }
                    break;
                case -1803689293:
                case -688351220:
                    c8667.m23339(z);
                    iM2761 = C0619.m2761("ܽܳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-981)) ^ 78842746;
                    i5 = 633262930;
                    break;
                case -1692501668:
                case 191353022:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4809)) ^ (-710544252);
                        i5 = 1660326801;
                    } else {
                        iM2761 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8579) ^ (-1384218557);
                        i5 = 1828242042;
                    }
                    break;
                case -1583578484:
                case 199276040:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4809)) ^ (-710544252);
                        i5 = 1660326801;
                    } else {
                        iM2761 = C0619.m2761("ۡۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29213)) ^ 207810760;
                        i5 = -1918571420;
                    }
                    break;
                case -1582671606:
                case 752622443:
                    c8667 = (C8667) C0950.m3796(itM4942);
                    if (c8667 == view) {
                        iM2761 = C0619.m2761("ۤ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7397) ^ (-695849594);
                        i5 = -470971251;
                    } else {
                        iM2761 = (C0773.m3169("۟ۨ") ^ i2) * 89;
                        i4 = ((iM2761 ^ i3) * (-14469)) ^ (-1790822783);
                        i5 = -667773250;
                    }
                    break;
                case -1561035336:
                case -1331376483:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1397)) ^ (-538042898);
                        i5 = 298522324;
                    } else {
                        iM2761 = C0619.m2761("ۨۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15751) ^ 1183569851;
                        i5 = 1450979913;
                    }
                    break;
                case -1511550380:
                case -1351900874:
                    if (C3998.m12923(itM4942)) {
                        iM2761 = C0773.m3169("ۧۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22379) ^ (-1440359089);
                        i5 = -1509338547;
                    } else {
                        iM2761 = C0773.m3169("֨᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30965)) ^ (-357632045);
                        i5 = 1719109959;
                    }
                    break;
                case -1395209993:
                case 1446813635:
                    z = false;
                    iM2761 = C0619.m2761("᩹ۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-27361)) ^ (-2005171745);
                    i5 = 1104164190;
                    break;
                case -1051232105:
                case 189367064:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4809)) ^ (-710544252);
                        i5 = 1660326801;
                    } else {
                        iM2761 = C0619.m2761("᩺ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4183)) ^ (-393453715);
                        i5 = 1754906892;
                    }
                    break;
                case -947837970:
                case -245573959:
                    break;
                case -913672346:
                case 1562928468:
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("᩻ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1925) ^ (-1823886518);
                        i5 = 673371127;
                    } else {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1397)) ^ (-538042898);
                        i5 = 298522324;
                    }
                    break;
                case -854905771:
                case 1160471578:
                    if (C3998.m12920()) {
                        iM2761 = C0619.m2761("ᩳܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3509) ^ 1123493634;
                        i5 = 98586054;
                    } else {
                        iM2761 = (C0619.m2761("ܿܶ") ^ i3) * 81;
                        i4 = ((iM2761 ^ i2) * (-9595)) ^ (-1190786528);
                        i5 = 309218930;
                    }
                    break;
                case -590097204:
                case 1170787201:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ܿܶ") ^ i3) * 81;
                        i4 = ((iM2761 ^ i2) * (-9595)) ^ (-1190786528);
                        i5 = 309218930;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܳ֨")) * (-17);
                        i4 = ((iM2761 ^ i2) * 17151) ^ 1467606341;
                        i5 = 1719451551;
                    }
                    break;
                case -571998747:
                case -344270038:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("ܿܶ") ^ i3) * 81;
                        i4 = ((iM2761 ^ i2) * (-9595)) ^ (-1190786528);
                        i5 = 309218930;
                    } else {
                        iM2761 = C0619.m2761("ۧ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16891) ^ (-1779076655);
                        i5 = 1205756419;
                    }
                    break;
                case -498112258:
                case -265135075:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("᩹۬") + i3) * 109;
                        i4 = ((iM2761 ^ i2) * 13329) ^ 1988849221;
                        i5 = -1803970158;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨ᩳ")) * 33;
                        i4 = ((iM2761 ^ i3) * (-11423)) ^ 1794817758;
                        i5 = 961319680;
                    }
                    break;
                case -386931654:
                case -209055313:
                    itM4942 = C1343.m4942(this.f20238);
                    iM2761 = C0619.m2761("ܽܳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-981)) ^ 78842746;
                    i5 = 633262930;
                    break;
                case -70021139:
                case 1709231873:
                    C0269.m1775();
                    C3099.m10095();
                    break;
                case 134521239:
                case 1765337453:
                    z = true;
                    iM2761 = C0619.m2761("᩹ۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-27361)) ^ (-2005171745);
                    i5 = 1104164190;
                    break;
                case 211270196:
                case 445621843:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4809)) ^ (-710544252);
                        i5 = 1660326801;
                    } else {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9625) ^ (-1291734171);
                        i5 = 1255100717;
                    }
                    break;
                default:
                    if (RunnableC3055.m9933() == 0) {
                        iM2761 = (C0773.m3169("᩹۬") + i3) * 109;
                        i4 = ((iM2761 ^ i2) * 13329) ^ 1988849221;
                        i5 = -1803970158;
                    } else {
                        iM2761 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8579) ^ (-1384218557);
                        i5 = 1828242042;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0678 A[PHI: r1 r10 r19 r29 r30 r31
      0x0678: PHI (r1v95 android.widget.EditText) = (r1v88 android.widget.EditText), (r1v90 android.widget.EditText), (r1v96 android.widget.EditText) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r10v54 java.lang.StringBuilder) = (r10v42 java.lang.StringBuilder), (r10v44 java.lang.StringBuilder), (r10v55 java.lang.StringBuilder) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r19v22 int) = (r19v17 int), (r19v19 int), (r19v23 int) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r29v38 int) = (r29v32 int), (r29v34 int), (r29v39 int) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r30v28 int) = (r30v23 int), (r30v25 int), (r30v29 int) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r31v25 boolean) = (r31v16 boolean), (r31v22 boolean), (r31v26 boolean) binds: [B:127:0x0661, B:115:0x05c4, B:94:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0142 A[PHI: r2
      0x0142: PHI (r2v168 int) = (r2v2 int), (r2v2 int), (r2v157 int), (r2v2 int) binds: [B:185:0x0142, B:183:0x0142, B:39:0x0140, B:14:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (l.C2287.f7432 < 0) goto L22;
     */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m17173() {
        /*
            Method dump skipped, instruction units count: 2408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC5914.m17173():void");
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02c7 A[PHI: r5 r6 r16
      0x02c7: PHI (r5v3 short[]) = (r5v2 short[]), (r5v4 short[]) binds: [B:72:0x02c5, B:56:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r6v3 char) = (r6v2 char), (r6v4 char) binds: [B:72:0x02c5, B:56:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r16v13 int) = (r16v9 int), (r16v14 int) binds: [B:72:0x02c5, B:56:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0318 A[PHI: r4 r7 r8 r10 r11 r12 r16
      0x0318: PHI (r4v8 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r7v7 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r8v7 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r10v7 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r11v7 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r12v7 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r16v33 int) = (r16v7 int), (r16v8 int), (r16v10 int), (r16v15 int), (r16v20 int), (r16v34 int) binds: [B:80:0x0316, B:76:0x02f9, B:68:0x02a4, B:52:0x0220, B:41:0x0191, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x034b A[PHI: r16
      0x034b: PHI (r16v24 int) = (r16v6 int), (r16v11 int), (r16v12 int), (r16v25 int) binds: [B:84:0x0349, B:64:0x0282, B:60:0x0263, B:17:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17158(ViewOnClickListenerC5914 viewOnClickListenerC5914, final PopupWindow popupWindow, int i, String str, View view) {
        int iM2761;
        int i2;
        int i3;
        int iM3169;
        int i4;
        final ViewOnClickListenerC5914 viewOnClickListenerC5915 = viewOnClickListenerC5914;
        int i5 = RunnableC0334.f1808;
        int i6 = C2354.f7599;
        int iM2762 = (i5 - C0619.m2761("ᩳۜ")) * (-85);
        int i7 = ((iM2762 ^ i6) * (-4349)) ^ (-1857522114);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2762 ^ (-2097616657);
        int iM13536 = 0;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1931982987;
        while (true) {
            int i14 = i8 ^ (i7 & (((i13 ^ i6) * 6975) >> 31));
            switch (i14) {
                case -2021248783:
                case -1577922516:
                    i14 = i14;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                    } else {
                        iM3169 = C0619.m2761("ۤᩳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 17461) ^ (-1657397065);
                        i4 = -218878643;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -2010132851:
                case 51190400:
                    i10 = 52475;
                    iM3169 = (C0773.m3169("ܽۜ") + i6) * (-95);
                    i7 = ((iM3169 ^ i5) * (-8101)) ^ (-58762198);
                    i4 = 100048037;
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -1785578285:
                case 1911095113:
                    viewOnClickListenerC5915.f20239 = true;
                    C3448.m11245(new C22322(viewOnClickListenerC5915, str, C0619.m2752(), i));
                    break;
                case -1663233051:
                case 278383448:
                    i14 = i14;
                    if (i9 - (49464 * s) < 0) {
                        iM3169 = (C0773.m3169("ۡ֨") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * 16587) ^ (-740640526);
                        i4 = -2014309160;
                    } else {
                        iM3169 = (C0619.m2761("ۜۤ") ^ i5) * (-127);
                        i7 = ((iM3169 ^ i6) * (-19495)) ^ (-1694518606);
                        i4 = -570208438;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -1431698707:
                case -57045915:
                    i14 = i14;
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i7 = ((iM3169 ^ i5) * 11987) ^ 104008880;
                        i4 = 1477010723;
                    } else {
                        iM3169 = C0773.m3169("֡ۤ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 32021) ^ 323937818;
                        i4 = -754527588;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -1293553642:
                case -823791250:
                    i10 = 36515;
                    iM3169 = (C0773.m3169("ܽۜ") + i6) * (-95);
                    i7 = ((iM3169 ^ i5) * (-8101)) ^ (-58762198);
                    i4 = 100048037;
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -1045346644:
                case -782988444:
                    i14 = i14;
                    s = sArr[c];
                    int i15 = s + 12366;
                    i9 = i15 * i15;
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                    } else {
                        iM3169 = C0619.m2761("ۤ۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * 32265) ^ 542729862;
                        i4 = 213763593;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -943427248:
                case 1554476395:
                    i14 = i14;
                    sArr = f20234;
                    c = 0;
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ܿ֨") + i5) * (-11);
                        i7 = ((iM3169 ^ i6) * 26037) ^ (-1487398336);
                        i4 = 1896309076;
                    } else {
                        iM3169 = (C0619.m2761("ܿۧ") ^ i6) * (-61);
                        i7 = ((iM3169 ^ i5) * 29189) ^ 258672261;
                        i4 = -1102713668;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -932602435:
                case 128865230:
                    i14 = i14;
                    C3779.m12264();
                    C1564.m5509();
                    iM3169 = C0773.m3169("᩺۠") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                    i4 = -1080244264;
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -872256302:
                case 648194292:
                    C1321.m4852();
                    if (C2375.f7641 <= 0) {
                        i14 = i14;
                        iM2761 = (C0773.m3169("۫ۧ") ^ i5) * (-33);
                        i2 = ((iM2761 ^ i6) * 25353) ^ 1059574487;
                        i3 = -58701114;
                    } else {
                        iM2761 = (C0619.m2761("۫ۛ") + i5) * (-53);
                        i14 = i14;
                        i2 = ((iM2761 ^ i6) * (-18959)) ^ 106165143;
                        i3 = -2052238705;
                    }
                    int i16 = i14;
                    i8 = iM2761 ^ i3;
                    i7 = i2;
                    i13 = i16;
                    break;
                case -865327441:
                case 805303790:
                    C2287.m7745();
                    break;
                case -624212735:
                case -269308583:
                    i14 = i14;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i7 = ((iM3169 ^ i5) * 11987) ^ 104008880;
                        i4 = 1477010723;
                    } else {
                        iM3169 = C0619.m2761("᩺ܺ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-1077)) ^ (-1384155794);
                        i4 = -859547397;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -435523084:
                case 1508178132:
                    C3076.m10030(viewOnClickListenerC5915, iM13536, i, str, new InterfaceC19479(viewOnClickListenerC5915) { // from class: l.ۛۙۧ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC5914 f20990;

                        {
                            int i17 = 884690906;
                            int i18 = C2702.f8586;
                            int i19 = C1321.f4751;
                            int iM31610 = C0773.m3169("᩻᩷") ^ i19;
                            int i20 = ((iM31610 ^ i18) * (-8791)) ^ 471229703;
                            int i21 = 483481640;
                            while (true) {
                                i17 = ((((i17 ^ i18) * 1077) >> 31) & i20) ^ (iM31610 ^ i21);
                                switch (i17) {
                                    case -2095393182:
                                    case 665349716:
                                        C2288.m7767();
                                        throw new RuntimeException();
                                    case -2070187845:
                                    case 1993743144:
                                        if (C1146.f4234 >= 0) {
                                            iM31610 = (C0773.m3169("ۜ᩵") + i18) * 77;
                                            i20 = ((iM31610 ^ i19) * 7231) ^ 1809525075;
                                            i21 = -1717851882;
                                        } else {
                                            iM31610 = C0619.m2761("᩵᩷") ^ i19;
                                            i20 = ((iM31610 ^ i18) * 14155) ^ (-658877904);
                                            i21 = -741507516;
                                        }
                                        break;
                                    case -1905005214:
                                    case 2129702437:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        } else {
                                            iM31610 = C0773.m3169("ۡۛ") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-8271)) ^ (-2051781404);
                                            i21 = 963292568;
                                        }
                                        break;
                                    case -1762825893:
                                    case -1169504241:
                                        this.f20990 = viewOnClickListenerC5915;
                                        if (C4238.f15451 >= 0) {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        } else {
                                            iM31610 = C0619.m2761("᩹۬") ^ i18;
                                            i20 = ((iM31610 ^ i19) * (-22503)) ^ (-293267289);
                                            i21 = 1052493575;
                                        }
                                        break;
                                    case -1611485447:
                                    case 2138398160:
                                        if (C2878.f9462) {
                                            iM31610 = C0773.m3169("ۢ᩶") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-18111)) ^ (-1816858907);
                                            i21 = -2127536389;
                                        } else {
                                            iM31610 = (C0619.m2761("֨᩺") + i18) * (-35);
                                            i20 = ((iM31610 ^ i19) * 29679) ^ (-1049268194);
                                            i21 = -1018503954;
                                        }
                                        break;
                                    case -1601663654:
                                    case 1882816838:
                                        if (C3099.m10095()) {
                                            iM31610 = C0619.m2761("֨ܺ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * 21837) ^ (-265053234);
                                            i21 = 461680669;
                                        } else {
                                            iM31610 = C0773.m3169("᩵ܶ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * (-7875)) ^ (-1573791144);
                                            i21 = -1830452470;
                                        }
                                        break;
                                    case -891846194:
                                    case 147226840:
                                        return;
                                    case -641741303:
                                    case 1328601452:
                                        if (C2485.f7950 != 0) {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        } else {
                                            iM31610 = C0619.m2761("᩻ۡ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * 6967) ^ (-45757397);
                                            i21 = -387624672;
                                        }
                                        break;
                                    case -628596777:
                                    case 1011433729:
                                        if (C11235.f35427 >= 0) {
                                            iM31610 = C0773.m3169("ۢ᩶") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-18111)) ^ (-1816858907);
                                            i21 = -2127536389;
                                        } else {
                                            iM31610 = (C0619.m2761("᩵ۗ") + i19) * 31;
                                            i20 = ((iM31610 ^ i18) * 8629) ^ (-478119571);
                                            i21 = -1585224715;
                                        }
                                        break;
                                    case -605002376:
                                    case -320890075:
                                        if (C2834.f9334 <= 0) {
                                            iM31610 = C0619.m2761("֨ܺ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * 21837) ^ (-265053234);
                                            i21 = 461680669;
                                        } else {
                                            iM31610 = C0773.m3169("ۨᩳ") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-1139)) ^ 236180682;
                                            i21 = 1817161278;
                                        }
                                        break;
                                    case -513822910:
                                    case 1345861383:
                                        if (C3734.m12152() < 0) {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        } else {
                                            iM31610 = C0619.m2761("᩶᩻") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-19187)) ^ 56053678;
                                            i21 = -1142667932;
                                        }
                                        break;
                                    case 330686266:
                                    case 1968631709:
                                        if (C1321.f4751 >= 0) {
                                            iM31610 = C0619.m2761("֨ܺ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * 21837) ^ (-265053234);
                                            i21 = 461680669;
                                        } else {
                                            iM31610 = C0619.m2761("᩺ۡ") ^ i19;
                                            i20 = ((iM31610 ^ i18) * 32413) ^ (-1251785083);
                                            i21 = -374653520;
                                        }
                                        break;
                                    case 494916826:
                                    case 650965870:
                                        C4238.m13540();
                                        if (!C17202.m40372()) {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        } else {
                                            iM31610 = C0773.m3169("ۢ᩶") ^ i19;
                                            i20 = ((iM31610 ^ i18) * (-18111)) ^ (-1816858907);
                                            i21 = -2127536389;
                                        }
                                        break;
                                    case 515011180:
                                    case 1407902003:
                                        if (C1542.f5343 > 0) {
                                            iM31610 = (C0773.m3169("ۜ᩵") + i18) * 77;
                                            i20 = ((iM31610 ^ i19) * 7231) ^ 1809525075;
                                            i21 = -1717851882;
                                        } else {
                                            iM31610 = (i18 - C0773.m3169("ۖۙ")) * (-69);
                                            i20 = ((iM31610 ^ i19) * 28705) ^ (-920686702);
                                            i21 = 201101784;
                                        }
                                        break;
                                    case 1906970939:
                                    case 2027531313:
                                        RunnableC0334.m2063();
                                        RunnableC3646.m11813();
                                        iM31610 = C0773.m3169("ۢ᩶") ^ i19;
                                        i20 = ((iM31610 ^ i18) * (-18111)) ^ (-1816858907);
                                        i21 = -2127536389;
                                        break;
                                    default:
                                        if (C1519.m5403()) {
                                            iM31610 = (C0619.m2761("ۢܰ") + i18) * (-119);
                                            i20 = ((iM31610 ^ i19) * 32471) ^ (-767365200);
                                            i21 = -629658376;
                                        } else {
                                            iM31610 = C0619.m2761("֨ܺ") ^ i18;
                                            i20 = ((iM31610 ^ i19) * 21837) ^ (-265053234);
                                            i21 = 461680669;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC19479
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo4064() {
                            PopupWindow popupWindow2 = null;
                            C17930 c17930 = null;
                            Object obj = null;
                            final ViewOnClickListenerC5914 viewOnClickListenerC5916 = null;
                            int i17 = -271990040;
                            int i18 = C3448.f11240;
                            int i19 = C3033.f9831;
                            int iM2763 = (C0619.m2761("ۤۘ") ^ i18) * (-123);
                            int i20 = ((iM2763 ^ i19) * 14581) ^ 849488296;
                            int i21 = 1232255122;
                            while (true) {
                                i17 = ((((i17 ^ i19) * (-30073)) >> 31) & i20) ^ (iM2763 ^ i21);
                                switch (i17) {
                                    case -2082154595:
                                    case 682312049:
                                        if (C2375.f7641 <= 0) {
                                            iM2763 = (i19 - C0773.m3169("ܰۛ")) * (-103);
                                            i20 = ((iM2763 ^ i18) * 14477) ^ 2107543447;
                                            i21 = 1912287247;
                                        } else {
                                            iM2763 = (i18 - C0619.m2761("ۨۡ")) * (-25);
                                            i20 = ((iM2763 ^ i19) * 8573) ^ 1405898320;
                                            i21 = -646215189;
                                        }
                                        break;
                                    case -1986420240:
                                    case -1164416563:
                                        if (C23916.f77426 <= 0) {
                                            iM2763 = (C0619.m2761("ۘ۠") ^ i18) * 109;
                                            i20 = ((iM2763 ^ i19) * 5443) ^ (-2042049541);
                                            i21 = -353866784;
                                        } else {
                                            iM2763 = (C0619.m2761("۫᩻") ^ i18) * 91;
                                            i20 = ((iM2763 ^ i19) * (-23501)) ^ (-1845067734);
                                            i21 = 1379221881;
                                        }
                                        break;
                                    case -1543672305:
                                    case 1714072670:
                                        C2023.m6964();
                                        iM2763 = (C0619.m2761("ۘ۠") ^ i18) * 109;
                                        i20 = ((iM2763 ^ i19) * 5443) ^ (-2042049541);
                                        i21 = -353866784;
                                        break;
                                    case -1479001405:
                                    case -856198357:
                                        if (C3734.f12817 < 0) {
                                            C0269.m1789(c17930, viewOnClickListenerC5916, new InterfaceC16438() { // from class: l.᩶ۙۧ

                                                /* JADX INFO: renamed from: ۛܽ᩷, reason: not valid java name and contains not printable characters */
                                                private static final short[] f67325 = {6661, -29206, 30024, 31975};

                                                /* JADX WARN: Code duplicated, block: B:51:0x0196 A[PHI: r6 r9 r10 r11
                                                  0x0196: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:50:0x0194, B:30:0x00c7, B:9:0x0042, B:93:0x0196] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0196: PHI (r9v4 short[]) = (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:50:0x0194, B:30:0x00c7, B:9:0x0042, B:93:0x0196] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0196: PHI (r10v4 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:50:0x0194, B:30:0x00c7, B:9:0x0042, B:93:0x0196] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0196: PHI (r11v4 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:50:0x0194, B:30:0x00c7, B:9:0x0042, B:93:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:57:0x01e1 A[PHI: r3 r4 r7
                                                  0x01e1: PHI (r3v2 short) = (r3v1 short), (r3v1 short), (r3v1 short), (r3v3 short) binds: [B:46:0x0176, B:15:0x0056, B:12:0x004b, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01e1: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int) binds: [B:46:0x0176, B:15:0x0056, B:12:0x004b, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01e1: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:46:0x0176, B:15:0x0056, B:12:0x004b, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:61:0x0214 A[PHI: r2 r5 r16
                                                  0x0214: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:60:0x0212, B:54:0x01c9, B:26:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0214: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:60:0x0212, B:54:0x01c9, B:26:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0214: PHI (r16v2 int) = (r16v1 int), (r16v1 int), (r16v3 int) binds: [B:60:0x0212, B:54:0x01c9, B:26:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:65:0x0248 A[PHI: r1
                                                  0x0248: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:64:0x0246, B:17:0x005a, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:69:0x0279  */
                                                @Override // l.InterfaceC16438
                                                /* JADX INFO: renamed from: ۙ */
                                                public final void mo1486(Object obj2) {
                                                    int iM31610;
                                                    int i22;
                                                    int i23;
                                                    short[] sArr3 = null;
                                                    char c2 = 0;
                                                    short s2 = 0;
                                                    int i24 = 0;
                                                    int i25 = 0;
                                                    int i26 = 0;
                                                    short s3 = 0;
                                                    int i27 = 0;
                                                    short[] sArr4 = null;
                                                    int i28 = 0;
                                                    int i29 = 0;
                                                    int i30 = -893536298;
                                                    int i31 = C2354.f7599;
                                                    int i32 = C3779.f12953;
                                                    int iM2764 = (C0619.m2761("᩹᩶") ^ i32) * (-57);
                                                    int i33 = ((iM2764 ^ i31) * (-3223)) ^ 1556966354;
                                                    int i34 = iM2764 ^ 764654541;
                                                    int iM2765 = 0;
                                                    while (true) {
                                                        i30 = i34 ^ (i33 & (((i30 ^ i31) * (-28267)) >> 31));
                                                        switch (i30) {
                                                            case -1998482948:
                                                            case -25681483:
                                                                sArr4 = f67325;
                                                                i28 = 1;
                                                                i29 = 3;
                                                                if (C1080.m4050()) {
                                                                    iM31610 = (i31 - C0619.m2761("᩹ܽ")) * (-115);
                                                                    i22 = ((iM31610 ^ i32) * (-14457)) ^ 1695733355;
                                                                    i23 = -381042617;
                                                                } else {
                                                                    iM31610 = (C0773.m3169("᩷᩶") ^ i31) * 7;
                                                                    i22 = ((iM31610 ^ i32) * (-19919)) ^ (-413655912);
                                                                    i23 = 529136143;
                                                                }
                                                                int i35 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i35;
                                                                break;
                                                            case -1846828128:
                                                            case 297142199:
                                                                if (C2375.f7641 <= 0) {
                                                                    iM31610 = C0619.m2761("ᩳۙ") ^ i32;
                                                                    i22 = ((iM31610 ^ i31) * 14219) ^ (-1010462209);
                                                                    i23 = 644863500;
                                                                } else {
                                                                    iM31610 = (i31 - C0773.m3169("ۚ۬")) * (-81);
                                                                    i22 = ((iM31610 ^ i32) * 1913) ^ 122986202;
                                                                    i23 = -1079955220;
                                                                }
                                                                int i36 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i36;
                                                                break;
                                                            case -1822003924:
                                                            case 1604148875:
                                                                c2 = 0;
                                                                if (C2485.f7950 != 0) {
                                                                    iM31610 = (C0619.m2761("ۛ᩸") + i32) * (-97);
                                                                    i22 = ((iM31610 ^ i31) * (-29689)) ^ (-606092568);
                                                                    i23 = 1858663557;
                                                                } else {
                                                                    iM31610 = (i31 - C0773.m3169("ᩴۛ")) * (-127);
                                                                    i22 = ((iM31610 ^ i32) * (-20341)) ^ 556523551;
                                                                    i23 = 585742899;
                                                                }
                                                                int i37 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i37;
                                                                break;
                                                            case -1778071853:
                                                            case -901059477:
                                                                i27 = 4152;
                                                                iM31610 = C0773.m3169("ܶܶ") ^ i31;
                                                                i22 = ((iM31610 ^ i32) * (-17329)) ^ 1245854618;
                                                                i23 = -2103613937;
                                                                int i38 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i38;
                                                                break;
                                                            case -1760878115:
                                                            case -1643786953:
                                                                break;
                                                            case -1737579864:
                                                            case -224149215:
                                                                s3 = 8216;
                                                                if (C1343.f4799 != 0) {
                                                                    iM31610 = (C0773.m3169("᩵ۚ") + i31) * 89;
                                                                    i22 = ((iM31610 ^ i32) * (-18679)) ^ 2141131953;
                                                                    i23 = -524206723;
                                                                } else {
                                                                    iM31610 = C0773.m3169("ۙ֡") ^ i31;
                                                                    i22 = ((iM31610 ^ i32) * 22593) ^ 1042016513;
                                                                    i23 = -632985732;
                                                                }
                                                                int i39 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i39;
                                                                break;
                                                            case -1448093732:
                                                            case 1917022656:
                                                                i25 = 67502656;
                                                                if (RunnableC3055.m9933() != 0) {
                                                                    iM31610 = (C0619.m2761("ۛ᩸") + i32) * (-97);
                                                                    i22 = ((iM31610 ^ i31) * (-29689)) ^ (-606092568);
                                                                    i23 = 1858663557;
                                                                } else {
                                                                    iM31610 = C0619.m2761("ۜܺ") ^ i31;
                                                                    i22 = ((iM31610 ^ i32) * (-15807)) ^ 1328501655;
                                                                    i23 = -1222820110;
                                                                }
                                                                int i310 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i310;
                                                                break;
                                                            case -1359531296:
                                                            case -297570674:
                                                                sArr3 = f67325;
                                                                if (C11235.f35427 >= 0) {
                                                                    iM31610 = (C0619.m2761("᩻ܽ") + i32) * (-125);
                                                                    i22 = ((iM31610 ^ i31) * 15883) ^ 695478732;
                                                                    i23 = -1275175826;
                                                                } else {
                                                                    iM31610 = (i32 - C0619.m2761("ۢۢ")) * 29;
                                                                    i22 = ((iM31610 ^ i31) * 2923) ^ (-379025603);
                                                                    i23 = 625953522;
                                                                }
                                                                int i311 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i311;
                                                                break;
                                                            case -1242674276:
                                                            case 1793488999:
                                                                i27 = 32137;
                                                                iM31610 = C0773.m3169("ܶܶ") ^ i31;
                                                                i22 = ((iM31610 ^ i32) * (-17329)) ^ 1245854618;
                                                                i23 = -2103613937;
                                                                int i312 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i312;
                                                                break;
                                                            case -1233254319:
                                                            case -314635994:
                                                                C2023.m6964();
                                                                if (C3998.f13671 != 0) {
                                                                    iM31610 = (C0773.m3169("᩵ۚ") + i31) * 89;
                                                                    i22 = ((iM31610 ^ i32) * (-18679)) ^ 2141131953;
                                                                    i23 = -524206723;
                                                                } else {
                                                                    iM31610 = C0619.m2761("ᩳۙ") ^ i32;
                                                                    i22 = ((iM31610 ^ i31) * 14219) ^ (-1010462209);
                                                                    i23 = 644863500;
                                                                }
                                                                int i313 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i313;
                                                                break;
                                                            case -987335646:
                                                            case 485902438:
                                                                C3690.m11987();
                                                                C2419.m8174();
                                                                break;
                                                            case -856322606:
                                                            case -767300944:
                                                                C3077.m10041();
                                                                C4282.m13644();
                                                                iM31610 = (C0619.m2761("᩻ܽ") + i32) * (-125);
                                                                i22 = ((iM31610 ^ i31) * 15883) ^ 695478732;
                                                                i23 = -1275175826;
                                                                int i314 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i314;
                                                                break;
                                                            case -821666821:
                                                            case -94219946:
                                                                iM2765 = C0619.m2761(C2702.m8881(sArr4, i28, i29, i27));
                                                                if (C20932.m47848() != 0) {
                                                                    iM31610 = (C0619.m2761("ۛ᩸") + i32) * (-97);
                                                                    i22 = ((iM31610 ^ i31) * (-29689)) ^ (-606092568);
                                                                    i23 = 1858663557;
                                                                } else {
                                                                    iM31610 = C0773.m3169("ܶۛ") ^ i32;
                                                                    i22 = ((iM31610 ^ i31) * 19371) ^ 1061359568;
                                                                    i23 = -821723205;
                                                                }
                                                                int i315 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i315;
                                                                break;
                                                            case -814482823:
                                                            case -425869080:
                                                                C2966.m9668(iM2765 ^ 2102341445);
                                                                if (C3099.f10023 <= 0) {
                                                                    iM31610 = (C0773.m3169("᩷᩶") ^ i31) * 7;
                                                                    i22 = ((iM31610 ^ i32) * (-19919)) ^ (-413655912);
                                                                    i23 = 529136143;
                                                                    int i316 = i22;
                                                                    i34 = iM31610 ^ i23;
                                                                    i33 = i316;
                                                                } else {
                                                                    int iM2766 = (C0619.m2761("ۡ᩸") ^ i31) * 39;
                                                                    i33 = ((iM2766 ^ i32) * (-2073)) ^ 1715363820;
                                                                    i34 = iM2766 ^ (-472269551);
                                                                }
                                                                break;
                                                            case -747375925:
                                                            case 1243985668:
                                                                int i40 = s2 + s3;
                                                                if (i26 - (i40 * i40) < 0) {
                                                                    iM31610 = (C0619.m2761("᩻ܰ") ^ i32) * 69;
                                                                    i22 = ((iM31610 ^ i31) * (-24823)) ^ (-1530839284);
                                                                    i23 = 1543780872;
                                                                } else {
                                                                    iM31610 = (i32 - C0619.m2761("ۧܰ")) * (-91);
                                                                    i22 = ((iM31610 ^ i31) * 17661) ^ 1960575637;
                                                                    i23 = -43250934;
                                                                }
                                                                int i317 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i317;
                                                                break;
                                                            case -458323349:
                                                            case 1378045992:
                                                                if (C13473.f42873 != 0) {
                                                                    iM31610 = C0619.m2761("ᩳۙ") ^ i32;
                                                                    i22 = ((iM31610 ^ i31) * 14219) ^ (-1010462209);
                                                                    i23 = 644863500;
                                                                } else {
                                                                    iM31610 = (C0773.m3169("᩷᩶") ^ i31) * 7;
                                                                    i22 = ((iM31610 ^ i32) * (-19919)) ^ (-413655912);
                                                                    i23 = 529136143;
                                                                }
                                                                int i318 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i318;
                                                                break;
                                                            case 200442815:
                                                            case 318605663:
                                                                int i41 = ViewOnClickListenerC5914.f20235;
                                                                if (C3076.m10031((C24706) obj2)) {
                                                                    iM31610 = (i32 - C0619.m2761("᩵ܶ")) * (-77);
                                                                    i22 = ((iM31610 ^ i31) * 12447) ^ 1458757544;
                                                                    i23 = -154691821;
                                                                } else {
                                                                    iM31610 = C0619.m2761("ۜۡ") ^ i31;
                                                                    i22 = ((iM31610 ^ i32) * (-31201)) ^ 465881047;
                                                                    i23 = 124515272;
                                                                }
                                                                int i319 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i319;
                                                                break;
                                                            case 267695612:
                                                            case 862733859:
                                                                RunnableC3055.m9933();
                                                                if (RunnableC3646.m11813() != 0) {
                                                                    iM31610 = (C0619.m2761("᩻ܽ") + i32) * (-125);
                                                                    i22 = ((iM31610 ^ i31) * 15883) ^ 695478732;
                                                                    i23 = -1275175826;
                                                                } else {
                                                                    iM31610 = (C0773.m3169("᩵ۚ") + i31) * 89;
                                                                    i22 = ((iM31610 ^ i32) * (-18679)) ^ 2141131953;
                                                                    i23 = -524206723;
                                                                }
                                                                int i3110 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i3110;
                                                                break;
                                                            case 488288992:
                                                            case 1719313309:
                                                                C4238.m13537(viewOnClickListenerC5916);
                                                                iM31610 = C0619.m2761("ۜۡ") ^ i31;
                                                                i22 = ((iM31610 ^ i32) * (-31201)) ^ 465881047;
                                                                i23 = 124515272;
                                                                int i3111 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i3111;
                                                                break;
                                                            case 662564028:
                                                            case 1845945939:
                                                                int i42 = i24 + i25;
                                                                i26 = i42 + i42;
                                                                if (C11235.f35427 >= 0) {
                                                                    iM31610 = (C0773.m3169("᩷᩶") ^ i31) * 7;
                                                                    i22 = ((iM31610 ^ i32) * (-19919)) ^ (-413655912);
                                                                    i23 = 529136143;
                                                                } else {
                                                                    iM31610 = C0619.m2761("ܰ᩶") ^ i32;
                                                                    i22 = ((iM31610 ^ i31) * 5601) ^ (-1280192919);
                                                                    i23 = -616865455;
                                                                }
                                                                int i3112 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i3112;
                                                                break;
                                                            default:
                                                                s2 = sArr3[c2];
                                                                i24 = s2 * s2;
                                                                if (C13473.f42873 != 0) {
                                                                    iM31610 = (C0773.m3169("᩵ۚ") + i31) * 89;
                                                                    i22 = ((iM31610 ^ i32) * (-18679)) ^ 2141131953;
                                                                    i23 = -524206723;
                                                                } else {
                                                                    iM31610 = (C0619.m2761("ܳۧ") + i32) * 83;
                                                                    i22 = ((iM31610 ^ i31) * (-18567)) ^ 1697242338;
                                                                    i23 = -721399006;
                                                                }
                                                                int i3113 = i22;
                                                                i34 = iM31610 ^ i23;
                                                                i33 = i3113;
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                }
                                            });
                                            return C11471.f36082;
                                        }
                                        iM2763 = (i19 - C0773.m3169("ܰۛ")) * (-103);
                                        i20 = ((iM2763 ^ i18) * 14477) ^ 2107543447;
                                        i21 = 1912287247;
                                        break;
                                    case -1464529670:
                                    case -534186304:
                                        c17930 = C3076.f9993;
                                        obj = null;
                                        if (C1564.m5509() <= 0) {
                                            iM2763 = (i19 - C0773.m3169("ۨܰ")) * (-67);
                                            i20 = ((iM2763 ^ i18) * (-4595)) ^ (-1414718931);
                                            i21 = -387847490;
                                        } else {
                                            iM2763 = C0773.m3169("᩷֡") ^ i19;
                                            i20 = ((iM2763 ^ i18) * (-27743)) ^ (-2038900007);
                                            i21 = 739010960;
                                        }
                                        break;
                                    case -1454921159:
                                    case 229199606:
                                        C3099.m10095();
                                        return null;
                                    case -1069849621:
                                    case -899940887:
                                        if (C2834.f9334 <= 0) {
                                            iM2763 = (C0619.m2761("ᩳܳ") + i18) * 11;
                                            i20 = ((iM2763 ^ i19) * (-4131)) ^ (-1035801895);
                                            i21 = 1488178061;
                                        } else {
                                            iM2763 = (C0619.m2761("۫ۜ") + i19) * (-53);
                                            i20 = ((iM2763 ^ i18) * (-6375)) ^ 328702636;
                                            i21 = 1689700666;
                                        }
                                        break;
                                    case -955507278:
                                    case 254885480:
                                        RunnableC3055.m9933();
                                        if (C1080.f3865 < 0) {
                                            iM2763 = (C0619.m2761("ᩳܳ") + i18) * 11;
                                            i20 = ((iM2763 ^ i19) * (-4131)) ^ (-1035801895);
                                            i21 = 1488178061;
                                        } else {
                                            iM2763 = (C0619.m2761("ۘ۠") ^ i18) * 109;
                                            i20 = ((iM2763 ^ i19) * 5443) ^ (-2042049541);
                                            i21 = -353866784;
                                        }
                                        break;
                                    case -803129339:
                                    case -780304668:
                                        if (C1826.f6190 <= 0) {
                                            iM2763 = (i19 - C0773.m3169("ܰۛ")) * (-103);
                                            i20 = ((iM2763 ^ i18) * 14477) ^ 2107543447;
                                            i21 = 1912287247;
                                        } else {
                                            iM2763 = (C0619.m2761("ۘ۠") ^ i18) * 109;
                                            i20 = ((iM2763 ^ i19) * 5443) ^ (-2042049541);
                                            i21 = -353866784;
                                        }
                                        break;
                                    case -800499731:
                                    case 1001872773:
                                        if (C1080.f3865 < 0) {
                                            iM2763 = (i19 - C0773.m3169("ۨܰ")) * (-67);
                                            i20 = ((iM2763 ^ i18) * (-4595)) ^ (-1414718931);
                                            i21 = -387847490;
                                        } else {
                                            iM2763 = (C0619.m2761("ᩳܳ") + i18) * 11;
                                            i20 = ((iM2763 ^ i19) * (-4131)) ^ (-1035801895);
                                            i21 = 1488178061;
                                        }
                                        break;
                                    case -745928979:
                                    case 1582239748:
                                        viewOnClickListenerC5916 = this.f20990;
                                        c17930.m40349((InterfaceC11217) viewOnClickListenerC5916);
                                        if (C0487.f2131 <= 0) {
                                            iM2763 = (i19 - C0773.m3169("ۨܰ")) * (-67);
                                            i20 = ((iM2763 ^ i18) * (-4595)) ^ (-1414718931);
                                            i21 = -387847490;
                                        } else {
                                            iM2763 = (C0619.m2761("֫ۖ") + i19) * 65;
                                            i20 = ((iM2763 ^ i18) * (-20273)) ^ 1860863605;
                                            i21 = 736367710;
                                        }
                                        break;
                                    case -135558576:
                                    case 768394120:
                                        int i22 = ViewOnClickListenerC5914.f20235;
                                        if (C0269.f1558 <= 0) {
                                            iM2763 = (C0773.m3169("ܶۗ") ^ i18) * (-87);
                                            i20 = ((iM2763 ^ i19) * (-26451)) ^ (-751799047);
                                            i21 = 883260378;
                                        } else {
                                            iM2763 = (i19 - C0773.m3169("ۙܿ")) * (-41);
                                            i20 = ((iM2763 ^ i18) * (-1101)) ^ 1001448770;
                                            i21 = -1119210675;
                                        }
                                        break;
                                    case 1542972:
                                    case 1091098295:
                                        popupWindow2.dismiss();
                                        if (C3099.f10023 <= 0) {
                                            iM2763 = (C0619.m2761("ۘ۠") ^ i18) * 109;
                                            i20 = ((iM2763 ^ i19) * 5443) ^ (-2042049541);
                                            i21 = -353866784;
                                        } else {
                                            iM2763 = (i19 - C0619.m2761("۠ܰ")) * (-119);
                                            i20 = ((iM2763 ^ i18) * (-23101)) ^ (-1739695202);
                                            i21 = 1631134698;
                                        }
                                        break;
                                    case 683111816:
                                    case 864552243:
                                        popupWindow2 = popupWindow;
                                        if (C20932.m47848() != 0) {
                                            iM2763 = (C0773.m3169("ܶۗ") ^ i18) * (-87);
                                            i20 = ((iM2763 ^ i19) * (-26451)) ^ (-751799047);
                                            i21 = 883260378;
                                        } else {
                                            iM2763 = C0773.m3169("ۛۖ") ^ i18;
                                            i20 = ((iM2763 ^ i19) * (-32677)) ^ 1325176678;
                                            i21 = -396432191;
                                        }
                                        break;
                                    default:
                                        c17930.mo40353(obj);
                                        if (C4238.f15451 >= 0) {
                                            iM2763 = (C0773.m3169("ܶۗ") ^ i18) * (-87);
                                            i20 = ((iM2763 ^ i19) * (-26451)) ^ (-751799047);
                                            i21 = 883260378;
                                        } else {
                                            iM2763 = (C0619.m2761("᩵ܳ") + i18) * 75;
                                            i20 = ((iM2763 ^ i19) * 11977) ^ (-320486945);
                                            i21 = -586764351;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -424044240:
                case 1800455622:
                    i14 = i14;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩹ۗ")) * (-33);
                        i7 = ((iM3169 ^ i5) * (-11799)) ^ (-66231660);
                        i4 = -477143201;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -290231123:
                case -225571577:
                    i14 = i14;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i7 = ((iM3169 ^ i5) * 11987) ^ 104008880;
                        i4 = 1477010723;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩵ۗ")) * 27;
                        i7 = ((iM3169 ^ i6) * 29405) ^ 1355425195;
                        i4 = 1159334854;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -287563573:
                case 1063175577:
                    i14 = i14;
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i7 = ((iM3169 ^ i5) * 11987) ^ 104008880;
                        i4 = 1477010723;
                        i13 = i14;
                        i8 = iM3169 ^ i4;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    }
                    iM3169 = C0773.m3169("᩺۠") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                    i4 = -1080244264;
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -234183472:
                case 293766519:
                    i14 = i14;
                    if (iM13536 == (C0773.m3169(C2287.m7749(sArr2, i11, i12, i10)) ^ 2125400831)) {
                        int iM31610 = (C0773.m3169("᩵۟") + i6) * (-63);
                        i13 = i14;
                        i8 = iM31610 ^ 444826350;
                        i7 = ((iM31610 ^ i5) * (-12285)) ^ 1915806351;
                    } else {
                        iM3169 = C0619.m2761("ۚۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 26267) ^ (-430060881);
                        i4 = 1986700070;
                        i13 = i14;
                        i8 = iM3169 ^ i4;
                    }
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -200884456:
                case 793832860:
                    i14 = i14;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                    } else {
                        iM3169 = (C0773.m3169("ۧۢ") + i6) * 47;
                        i7 = ((iM3169 ^ i5) * (-30757)) ^ (-1562509308);
                        i4 = 1870209288;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case 305892646:
                case 1466019528:
                    C1542.m5468(viewOnClickListenerC5915, C13047.m32487(i, ""));
                    break;
                case 462323000:
                case 1522482970:
                    i14 = i14;
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0773.m3169("۫ۧ") ^ i5) * (-33);
                        i2 = ((iM2761 ^ i6) * 25353) ^ 1059574487;
                        i3 = -58701114;
                        int i17 = i14;
                        i8 = iM2761 ^ i3;
                        i7 = i2;
                        i13 = i17;
                    } else {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                        i13 = i14;
                        i8 = iM3169 ^ i4;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    }
                    break;
                case 561791895:
                case 919465126:
                    i14 = i14;
                    if (C1564.m5512(str)) {
                        iM2761 = (C0619.m2761("ۖ֡") ^ i5) * 37;
                        i2 = ((iM2761 ^ i6) * (-23653)) ^ 297828290;
                        i3 = -1816067556;
                    } else {
                        iM2761 = (C0619.m2761("ܿۘ") + i6) * (-73);
                        i2 = ((iM2761 ^ i5) * 28503) ^ 366743546;
                        i3 = -1514947802;
                    }
                    int i18 = i14;
                    i8 = iM2761 ^ i3;
                    i7 = i2;
                    i13 = i18;
                    break;
                case 749157632:
                case 1777352586:
                    i14 = i14;
                    iM13536 = C4238.m13536(view);
                    sArr2 = f20234;
                    i11 = 1;
                    i12 = 3;
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("᩺۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29769)) ^ 1153133502;
                        i4 = -1080244264;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۛۡ")) * (-111);
                        i7 = ((iM3169 ^ i6) * 9953) ^ (-1503023250);
                        i4 = -1549983730;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case 859884548:
                case 1829870836:
                    i14 = i14;
                    popupWindow.dismiss();
                    if (viewOnClickListenerC5915.f20239) {
                        iM2761 = C0773.m3169("᩶ܳ") ^ i5;
                        i2 = ((iM2761 ^ i6) * (-22575)) ^ 1068824306;
                        i3 = 1474812608;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩺") + i5) * (-37);
                        i2 = ((iM2761 ^ i6) * (-20015)) ^ 732273297;
                        i3 = 442624423;
                    }
                    int i19 = i14;
                    i8 = iM2761 ^ i3;
                    i7 = i2;
                    i13 = i19;
                    break;
                case 1653920978:
                case 1790916597:
                    i14 = i14;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ܿۧ") ^ i6) * (-61);
                        i7 = ((iM3169 ^ i5) * 29189) ^ 258672261;
                        i4 = -1102713668;
                    } else {
                        iM3169 = C0773.m3169("᩷ܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 811) ^ (-1456806458);
                        i4 = 451684554;
                    }
                    i13 = i14;
                    i8 = iM3169 ^ i4;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int iM2761;
        int i2;
        int i3;
        View view;
        int i4;
        int iM3169;
        int i5;
        TextView textView;
        int i6;
        short[] sArr;
        short[] sArr2;
        int iM2762;
        int i7;
        TextView textView2;
        TextView textView3;
        View view2;
        int i8;
        short[] sArr3;
        short[] sArr4;
        int i9;
        int i10;
        C25227 c25227;
        TextView textView4;
        int i11;
        TextView textView5;
        int i12;
        C25227 c25228;
        StringBuilder sb;
        int i13;
        int i14;
        short[] sArr5;
        int i15;
        View view3;
        View view4;
        int i16;
        View view5;
        short[] sArr6;
        TextView textView6;
        int iM31610;
        TextView textView7;
        int i17;
        int i18;
        final View view6;
        TextView textView8;
        View view7;
        int i19;
        C20084 c20084;
        int iM31611;
        int i20;
        int i21;
        int i22;
        int iM2763;
        int i23;
        int i24;
        int iM2764;
        int i25;
        int i26;
        bundle = bundle;
        int i27 = 1994271828;
        int i28 = C3448.f11240;
        int i29 = C1146.f4234;
        int iM2765 = C0619.m2761("ۖۙ") ^ i29;
        int i30 = ((iM2765 ^ i28) * 5801) ^ 1955314442;
        int i31 = iM2765 ^ (-1119256441);
        View view8 = null;
        StringBuilder sb2 = null;
        String str = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        View viewM9476 = null;
        C25227 c25229 = null;
        View view9 = null;
        String strM1236 = null;
        short[] sArr11 = null;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        TextView textView9 = null;
        TextView textView10 = null;
        InputFilter.AllCaps allCaps = null;
        DigitsKeyListener digitsKeyListener = null;
        EditText editText = null;
        C20084 c20085 = null;
        short[] sArr12 = null;
        while (true) {
            i27 = i31 ^ (i30 & (((i27 ^ i28) * 29835) >> 31));
            switch (i27) {
                case -2127573937:
                case -1383399394:
                    textView8 = textView10;
                    i43 = i43;
                    c25229 = c25229;
                    view7 = view9;
                    int i45 = i44;
                    sb2 = sb2;
                    View view10 = view8;
                    final RunnableC20835 runnableC20835 = new RunnableC20835(c25229, view7, view10, i45);
                    i19 = i45;
                    int i46 = i37;
                    i37 = i46;
                    view = view10;
                    C1564.m5518(this, i46).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ᩳۙۧ
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            runnableC20835.run();
                        }
                    });
                    c25229.addOnScrollListener(new C2427(runnableC20835));
                    c20084 = (C20084) new C16196(this).m38422(C20084.class);
                    this.f20237 = c20084;
                    if (bundle != null) {
                        iM31611 = (C0773.m3169("ܳܽ") ^ i28) * 89;
                        i20 = ((iM31611 ^ i29) * 21387) ^ (-807413018);
                        i21 = -731351121;
                    } else {
                        iM31611 = (C0619.m2761("ۛ۟") + i28) * 41;
                        i20 = ((iM31611 ^ i29) * 12363) ^ (-313698720);
                        i21 = 2033725768;
                    }
                    i31 = iM31611 ^ i21;
                    i44 = i19;
                    textView10 = textView8;
                    view9 = view7;
                    c20085 = c20084;
                    i30 = i20;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i47 = i37;
                    view8 = view;
                    i37 = i47;
                    break;
                case -2096838176:
                case 772373046:
                    C11235.m28309();
                    if (C1564.f5401 <= 0) {
                        textView4 = textView10;
                        i43 = i43;
                        view6 = viewM9476;
                        c25229 = c25229;
                        sb2 = sb2;
                        i38 = i38;
                        i11 = i39;
                        int i48 = i44;
                        view9 = view9;
                        i4 = i48;
                        int iM2766 = (C0619.m2761("᩻ۗ") ^ i28) * (-81);
                        int i49 = ((iM2766 ^ i29) * (-6001)) ^ 1695617724;
                        i31 = iM2766 ^ (-847826270);
                        bundle = bundle;
                        viewM9476 = view6;
                        i30 = i49;
                        i39 = i11;
                        textView10 = textView4;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        View view11 = view9;
                        i44 = i4;
                        view9 = view11;
                    } else {
                        textView5 = textView10;
                        i12 = i43;
                        textView6 = textView9;
                        view5 = viewM9476;
                        c25228 = c25229;
                        sArr6 = sArr8;
                        sb = sb2;
                        i13 = i38;
                        i14 = i39;
                        sArr5 = sArr9;
                        View view12 = view8;
                        i15 = i37;
                        view3 = view12;
                        int i50 = i44;
                        view4 = view9;
                        i16 = i50;
                        iM31610 = (C0773.m3169("ܽ᩸") ^ i29) * (-115);
                        textView7 = textView6;
                        i17 = ((iM31610 ^ i28) * (-3073)) ^ 460563354;
                        i18 = 1672046238;
                        i31 = iM31610 ^ i18;
                        sArr8 = sArr6;
                        sArr9 = sArr5;
                        textView10 = textView5;
                        i30 = i17;
                        i39 = i14;
                        bundle = bundle;
                        i38 = i13;
                        sb2 = sb;
                        c25229 = c25228;
                        i43 = i12;
                        TextView textView11 = textView7;
                        viewM9476 = view5;
                        textView9 = textView11;
                        int i51 = i15;
                        view8 = view3;
                        i37 = i51;
                        View view13 = view4;
                        i44 = i16;
                        view9 = view13;
                    }
                    break;
                case -2067483977:
                case 1424154922:
                    textView = textView10;
                    i43 = i43;
                    textView9 = textView9;
                    viewM9476 = viewM9476;
                    c25229 = c25229;
                    sb2 = sb2;
                    i6 = i36;
                    i38 = i38;
                    i39 = i39;
                    sArr = sArr8;
                    sArr2 = sArr9;
                    View view14 = view8;
                    i37 = i37;
                    view = view14;
                    int i52 = i44;
                    view9 = view9;
                    i4 = i52;
                    C1564.m5518(this, C0773.m3169(AbstractC0116.m1236(f20234, 96, 3, i33)) ^ 2120302814);
                    sArr7 = f20234;
                    i40 = 99;
                    iM2762 = (i29 - C0619.m2761("ۢܽ")) * (-49);
                    i30 = ((iM2762 ^ i28) * 32131) ^ (-837261913);
                    i7 = 2122882869;
                    i31 = iM2762 ^ i7;
                    sArr8 = sArr;
                    i36 = i6;
                    sArr9 = sArr2;
                    textView10 = textView;
                    viewM9476 = viewM9476;
                    i39 = i39;
                    textView9 = textView9;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i53 = i37;
                    view8 = view;
                    i37 = i53;
                    View view15 = view9;
                    i44 = i4;
                    view9 = view15;
                    break;
                case -1914508121:
                case -1150821715:
                    textView4 = textView10;
                    i43 = i43;
                    c25229 = c25229;
                    View view16 = view9;
                    view = view8;
                    i4 = i44;
                    sb2 = sb2;
                    i38 = i38;
                    i11 = i39;
                    int iM31612 = C0773.m3169(str) ^ 2118606125;
                    i37 = iM31612;
                    view9 = view16;
                    view6 = viewM9476;
                    C22666.m51097(findViewById(iM31612), new InterfaceC22491() { // from class: l.۟ۙۧ
                        /* JADX WARN: Code duplicated, block: B:57:0x01cc A[PHI: r1 r5
                          0x01cc: PHI (r1v4 l.۫ᩳ) = (r1v1 l.۫ᩳ), (r1v3 l.۫ᩳ), (r1v1 l.۫ᩳ), (r1v1 l.۫ᩳ) binds: [B:56:0x01ca, B:44:0x0155, B:35:0x00e5, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
                          0x01cc: PHI (r5v4 int) = (r5v1 int), (r5v1 int), (r5v3 int), (r5v1 int) binds: [B:56:0x01ca, B:44:0x0155, B:35:0x00e5, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:61:0x0203 A[PHI: r2 r3
                          0x0203: PHI (r2v2 l.۫ᩳ) = (r2v1 l.۫ᩳ), (r2v1 l.۫ᩳ), (r2v1 l.۫ᩳ), (r2v4 l.۫ᩳ) binds: [B:60:0x0201, B:52:0x01aa, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
                          0x0203: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v3 int) binds: [B:60:0x0201, B:52:0x01aa, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // l.InterfaceC22491
                        public final C3977 onApplyWindowInsets(View view17, C3977 c3977) {
                            int iM2767;
                            int i54;
                            int i55;
                            C13275 c13275M12817 = null;
                            C13275 c13275M12818 = null;
                            int i56 = 0;
                            int i57 = 0;
                            int iM7764 = 0;
                            View view18 = null;
                            ViewGroup.LayoutParams layoutParamsM6240 = null;
                            int i58 = 0;
                            int i59 = 1984062233;
                            int i60 = C4238.f15451;
                            int i61 = C1564.f5401;
                            int iM31613 = C0773.m3169("ۧᩳ") ^ i61;
                            int i62 = ((iM31613 ^ i60) * (-2979)) ^ 409031666;
                            int i63 = iM31613 ^ 378195133;
                            while (true) {
                                i59 = ((((i59 ^ i60) * 21219) >> 31) & i62) ^ i63;
                                switch (i59) {
                                    case -2008423842:
                                    case -424344187:
                                        if (C3099.f10023 <= 0) {
                                            iM2767 = (C0619.m2761("᩸ۖ") ^ i60) * (-43);
                                            i54 = ((iM2767 ^ i61) * (-17269)) ^ 1911522130;
                                            i55 = -1338382436;
                                        } else {
                                            iM2767 = (i61 - C0619.m2761("ۜۚ")) * 77;
                                            i54 = ((iM2767 ^ i60) * 15625) ^ 352890039;
                                            i55 = -2108546658;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case -1701351115:
                                    case 2042090800:
                                        C2023.m6964();
                                        iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                        i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                        i55 = -928190854;
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case -1570979126:
                                    case 848785811:
                                        layoutParamsM6240.height = i58;
                                        view18.requestLayout();
                                        return c3977;
                                    case -1536427678:
                                    case 1234058042:
                                        iM7764 = C2288.m7764(c13275M12817.f42405, c13275M12818.f42405);
                                        if (C0269.f1558 <= 0) {
                                            iM2767 = (C0619.m2761("᩸ۖ") ^ i60) * (-43);
                                            i54 = ((iM2767 ^ i61) * (-17269)) ^ 1911522130;
                                            i55 = -1338382436;
                                        } else {
                                            iM2767 = C0773.m3169("ۢ֡") ^ i60;
                                            i54 = ((iM2767 ^ i61) * (-5797)) ^ (-1181449588);
                                            i55 = -434348691;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case -1500869641:
                                    case 1283034523:
                                        i57 = c13275M12817.f42406;
                                        if (C3690.f12684 <= 0) {
                                            iM2767 = (i60 - C0773.m3169("ᩴ᩹")) * 57;
                                            i54 = ((iM2767 ^ i61) * 23145) ^ (-623704846);
                                            i55 = -135579764;
                                        } else {
                                            iM2767 = C0619.m2761("֫ۘ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * 23775) ^ (-1682346927);
                                            i55 = 857304068;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case -1277244802:
                                    case 1401229060:
                                        view18 = view6;
                                        layoutParamsM6240 = C1783.m6240(view18);
                                        i58 = c13275M12817.f42408;
                                        if (C3690.f12684 <= 0) {
                                            iM2767 = C0619.m2761("ۤۨ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * (-3993)) ^ 1959276513;
                                            i55 = 1759631073;
                                            i63 = iM2767 ^ i55;
                                            i62 = i54;
                                        } else {
                                            int iM31614 = (C0773.m3169("᩷ۚ") ^ i61) * 85;
                                            i63 = iM31614 ^ (-2114207709);
                                            i62 = ((iM31614 ^ i60) * 27061) ^ (-1607558540);
                                        }
                                        break;
                                    case -804907427:
                                    case -324193:
                                        C2023.m6964();
                                        if (C2834.f9334 > 0) {
                                            iM2767 = C0619.m2761("ۤۜ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * 16275) ^ (-172442685);
                                            i55 = -536851202;
                                            i63 = iM2767 ^ i55;
                                            i62 = i54;
                                        }
                                        iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                        i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                        i55 = -928190854;
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case -773307442:
                                    case 1813896546:
                                        if (C2354.m7983()) {
                                            iM2767 = (i60 - C0619.m2761("֫۟")) * (-9);
                                            i54 = ((iM2767 ^ i61) * 22939) ^ 1860369675;
                                            i55 = 1965048134;
                                        } else {
                                            iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                            i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                            i55 = -928190854;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 157243223:
                                    case 946769213:
                                        c13275M12817 = c3977.m12817(7);
                                        if (C1542.f5343 <= 0) {
                                            iM2767 = (C0619.m2761("᩸ۖ") ^ i60) * (-43);
                                            i54 = ((iM2767 ^ i61) * (-17269)) ^ 1911522130;
                                            i55 = -1338382436;
                                        } else {
                                            iM2767 = (C0619.m2761("ᩳۡ") ^ i60) * 77;
                                            i54 = ((iM2767 ^ i61) * 2961) ^ 1559870315;
                                            i55 = -314476117;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 309783510:
                                    case 1180756005:
                                        if (C13473.f42873 == 0) {
                                            iM2767 = (C0619.m2761("᩸ۖ") ^ i60) * (-43);
                                            i54 = ((iM2767 ^ i61) * (-17269)) ^ 1911522130;
                                            i55 = -1338382436;
                                            i63 = iM2767 ^ i55;
                                            i62 = i54;
                                        }
                                        iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                        i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                        i55 = -928190854;
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 336118901:
                                    case 1269500594:
                                        int i64 = ViewOnClickListenerC5914.f20235;
                                        if (C3033.f9831 >= 0) {
                                            iM2767 = C0619.m2761("ۤۜ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * 16275) ^ (-172442685);
                                            i55 = -536851202;
                                        } else {
                                            iM2767 = C0773.m3169("֨ۘ") ^ i60;
                                            i54 = ((iM2767 ^ i61) * 11) ^ (-195735772);
                                            i55 = -1898379740;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 1206913744:
                                    case 1353431739:
                                        view17.setPadding(i56, 0, i57, iM7764);
                                        if (C1564.f5401 <= 0) {
                                            iM2767 = C0619.m2761("ۤۨ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * (-3993)) ^ 1959276513;
                                            i55 = 1759631073;
                                        } else {
                                            iM2767 = C0619.m2761("ۘᩴ") ^ i60;
                                            i54 = ((iM2767 ^ i61) * (-5435)) ^ (-1339932700);
                                            i55 = -449651535;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 1433931584:
                                    case 1564408943:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                            i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                            i55 = -928190854;
                                        } else {
                                            iM2767 = (i61 - C0619.m2761("۟᩵")) * 61;
                                            i54 = ((iM2767 ^ i60) * (-3187)) ^ 1550039015;
                                            i55 = 2120004155;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    case 1449667025:
                                    case 2115702301:
                                        C1826.m6301();
                                        return null;
                                    case 1509627144:
                                    case 1702393461:
                                        C2419.m8174();
                                        if (RunnableC0334.f1808 > 0) {
                                            iM2767 = C0619.m2761("ۤۨ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * (-3993)) ^ 1959276513;
                                            i55 = 1759631073;
                                            i63 = iM2767 ^ i55;
                                            i62 = i54;
                                        }
                                        iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                        i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                        i55 = -928190854;
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                    default:
                                        c13275M12818 = c3977.m12817(8);
                                        i56 = c13275M12817.f42407;
                                        if (RunnableC1848.f6235) {
                                            iM2767 = C0619.m2761("۫ۙ") ^ i60;
                                            i54 = ((iM2767 ^ i61) * 1923) ^ 2082380976;
                                            i55 = -928190854;
                                        } else {
                                            iM2767 = C0773.m3169("ۚᩳ") ^ i61;
                                            i54 = ((iM2767 ^ i60) * 28663) ^ 36212169;
                                            i55 = 921600753;
                                        }
                                        i63 = iM2767 ^ i55;
                                        i62 = i54;
                                        break;
                                }
                            }
                        }
                    });
                    sArr10 = f20234;
                    if (C13473.f42873 == 0) {
                        int iM2767 = (C0619.m2761("ܳܳ") + i28) * (-125);
                        i31 = iM2767 ^ (-218766937);
                        viewM9476 = view6;
                        i30 = ((iM2767 ^ i29) * 20947) ^ 623413359;
                        i39 = i11;
                        textView10 = textView4;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        int i54 = i37;
                        view8 = view;
                        i37 = i54;
                        View view17 = view9;
                        i44 = i4;
                        view9 = view17;
                    } else {
                        view8 = view;
                        i37 = i37;
                        int iM2768 = (C0619.m2761("᩻ۗ") ^ i28) * (-81);
                        int i410 = ((iM2768 ^ i29) * (-6001)) ^ 1695617724;
                        i31 = iM2768 ^ (-847826270);
                        bundle = bundle;
                        viewM9476 = view6;
                        i30 = i410;
                        i39 = i11;
                        textView10 = textView4;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        View view18 = view9;
                        i44 = i4;
                        view9 = view18;
                    }
                    break;
                case -1827664966:
                case 2110054883:
                    m17163();
                    break;
                case -1714205974:
                case 1635485621:
                    textView = textView10;
                    sb2 = sb2;
                    View view19 = view9;
                    i38 = i38;
                    i4 = i44;
                    i39 = i39;
                    View view20 = view8;
                    i37 = i37;
                    view = view20;
                    short[] sArr13 = sArr10;
                    c25227 = (C25227) C1564.m5518(this, C0619.m2761(C0862.m3500(sArr13, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i33)) ^ 2119217575);
                    i43 = 3;
                    c25227.setLayoutManager(new C19458((Context) this, 3));
                    C3998.m12927(c25227, new C23068(this, this));
                    C18597.m43181(c25227);
                    if (C4282.f15546 > 0) {
                        int iM31613 = C0773.m3169("֨֫") ^ i29;
                        int i55 = ((iM31613 ^ i28) * (-7877)) ^ 2106460160;
                        i31 = iM31613 ^ (-610895010);
                        sArr10 = sArr13;
                        i44 = i4;
                        i39 = i39;
                        textView10 = textView;
                        view9 = view19;
                        i38 = i38;
                        i30 = i55;
                        sb2 = sb2;
                        i43 = 3;
                        c25229 = c25227;
                        bundle = bundle;
                        int i411 = i37;
                        view8 = view;
                        i37 = i411;
                    } else {
                        view9 = view19;
                        sArr10 = sArr13;
                        textView9 = textView9;
                        viewM9476 = viewM9476;
                        sArr2 = sArr9;
                        i6 = i36;
                        sArr = sArr8;
                        int iM2769 = C0619.m2761("ᩴ֨") ^ i29;
                        i31 = iM2769 ^ (-2017492059);
                        i30 = ((iM2769 ^ i28) * 22503) ^ 1298538757;
                        sArr8 = sArr;
                        i36 = i6;
                        sArr9 = sArr2;
                        textView10 = textView;
                        viewM9476 = viewM9476;
                        i39 = i39;
                        textView9 = textView9;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25227;
                        bundle = bundle;
                        int i56 = i37;
                        view8 = view;
                        i37 = i56;
                        View view110 = view9;
                        i44 = i4;
                        view9 = view110;
                    }
                    break;
                case -1645706346:
                case 1181197436:
                    textView2 = textView10;
                    i43 = i43;
                    textView3 = textView9;
                    view2 = viewM9476;
                    c25229 = c25229;
                    sb2 = sb2;
                    i38 = i38;
                    i8 = i39;
                    sArr3 = sArr8;
                    short[] sArr14 = sArr9;
                    View view21 = view8;
                    i37 = i37;
                    view = view21;
                    int i57 = i44;
                    view9 = view9;
                    i4 = i57;
                    short[] sArr15 = sArr7;
                    int i58 = i40;
                    View viewM9477 = C2878.m9476(this, C0773.m3169(AbstractC3624.m11769(sArr15, i58, 3, i33)) ^ 2117990226);
                    sArr4 = sArr15;
                    i9 = i58;
                    int i59 = 5;
                    if (C2966.f9654 < 0) {
                        C2375.m8070(viewM9477, new ViewOnClickListenerC1342(i59, this));
                        int iM31614 = C0773.m3169(C3033.m9847(f20234, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i33)) ^ 2097485466;
                        int iM31615 = (C0773.m3169("ۤۖ") + i28) * (-3);
                        i31 = iM31615 ^ 99813795;
                        i30 = ((iM31615 ^ i29) * 21109) ^ (-556777656);
                        sArr8 = sArr3;
                        viewM9476 = view2;
                        sArr9 = sArr14;
                        textView10 = textView2;
                        textView9 = textView3;
                        sArr7 = sArr4;
                        i40 = i9;
                        i36 = iM31614;
                        i39 = i8;
                        bundle = bundle;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        int i510 = i37;
                        view8 = view;
                        i37 = i510;
                        View view111 = view9;
                        i44 = i4;
                        view9 = view111;
                    } else {
                        i10 = i4;
                        sArr9 = sArr14;
                        int iM27610 = (i28 - C0619.m2761("ۢᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i30 = ((iM27610 ^ i29) * 5865) ^ (-2072730027);
                        i31 = iM27610 ^ (-244486839);
                        bundle = bundle;
                        sArr8 = sArr3;
                        i36 = i36;
                        i39 = i8;
                        view9 = view9;
                        sArr7 = sArr4;
                        i40 = i9;
                        i44 = i10;
                        i38 = i38;
                        viewM9476 = view2;
                        sb2 = sb2;
                        textView10 = textView2;
                        textView9 = textView3;
                        c25229 = c25229;
                        i43 = i43;
                        int i412 = i37;
                        view8 = view;
                        i37 = i412;
                    }
                    break;
                case -1489011047:
                case 426198530:
                    textView2 = textView10;
                    i43 = i43;
                    View view22 = viewM9476;
                    c25229 = c25229;
                    view9 = view9;
                    sb2 = sb2;
                    i38 = i38;
                    i8 = i39;
                    View view23 = view8;
                    i37 = i37;
                    view = view23;
                    i10 = 1;
                    this.f20241 = !C18978.m44085();
                    C24969.m55775(this);
                    sArr9 = f20234;
                    i41 = UMErrorCode.E_UM_BE_CREATE_FAILED;
                    if (RunnableC3055.f9898 < 0) {
                        int iM27611 = C0619.m2761("᩻᩶") ^ i29;
                        int i60 = ((iM27611 ^ i28) * 20487) ^ 1174059154;
                        i31 = iM27611 ^ (-860492836);
                        bundle = bundle;
                        viewM9476 = view22;
                        i30 = i60;
                        i39 = i8;
                        view9 = view9;
                        textView10 = textView2;
                        i44 = 1;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        int i413 = i37;
                        view8 = view;
                        i37 = i413;
                    } else {
                        textView3 = textView9;
                        sArr4 = sArr7;
                        i9 = i40;
                        sArr3 = sArr8;
                        view2 = view22;
                        int iM27612 = (i28 - C0619.m2761("ۢᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i30 = ((iM27612 ^ i29) * 5865) ^ (-2072730027);
                        i31 = iM27612 ^ (-244486839);
                        bundle = bundle;
                        sArr8 = sArr3;
                        i36 = i36;
                        i39 = i8;
                        view9 = view9;
                        sArr7 = sArr4;
                        i40 = i9;
                        i44 = i10;
                        i38 = i38;
                        viewM9476 = view2;
                        sb2 = sb2;
                        textView10 = textView2;
                        textView9 = textView3;
                        c25229 = c25229;
                        i43 = i43;
                        int i414 = i37;
                        view8 = view;
                        i37 = i414;
                    }
                    break;
                case -1439743236:
                case 1122969950:
                    TextView textView12 = textView10;
                    i43 = i43;
                    TextView textView13 = textView9;
                    c25229 = c25229;
                    StringBuilder sb3 = sb2;
                    View view24 = view8;
                    i37 = i37;
                    view = view24;
                    int i61 = i44;
                    view9 = view9;
                    i4 = i61;
                    this.f20236 = textView13;
                    C2375.m8070(textView13, new ViewOnClickListenerC11237(2, this));
                    C2354.m7978(this.f20236, m17168(false));
                    int iM31616 = C0773.m3169("ۛۗ") ^ i28;
                    int i62 = ((iM31616 ^ i29) * 25707) ^ 211100211;
                    i31 = iM31616 ^ (-248634888);
                    bundle = bundle;
                    viewM9476 = viewM9476;
                    textView9 = textView13;
                    i30 = i62;
                    sb2 = sb3;
                    sArr9 = sArr9;
                    textView10 = textView12;
                    i38 = 2;
                    i39 = 0;
                    c25229 = c25229;
                    i43 = i43;
                    int i511 = i37;
                    view8 = view;
                    i37 = i511;
                    View view112 = view9;
                    i44 = i4;
                    view9 = view112;
                    break;
                case -1301462292:
                case 1207539424:
                    view = view8;
                    i4 = i44;
                    i33 = 15767;
                    iM3169 = C0619.m2761("ܿᩴ") ^ i28;
                    i30 = ((iM3169 ^ i29) * 23113) ^ 1527927154;
                    i5 = -1761784868;
                    i31 = iM3169 ^ i5;
                    sArr8 = sArr8;
                    i36 = i36;
                    sArr9 = sArr9;
                    textView10 = textView10;
                    sArr7 = sArr7;
                    i40 = i40;
                    viewM9476 = viewM9476;
                    i39 = i39;
                    textView9 = textView9;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i512 = i37;
                    view8 = view;
                    i37 = i512;
                    View view113 = view9;
                    i44 = i4;
                    view9 = view113;
                    break;
                case -1224985618:
                case 2094004869:
                    TextView textView14 = textView10;
                    i43 = i43;
                    c25229 = c25229;
                    sb2 = sb2;
                    i38 = i38;
                    i8 = i39;
                    View view25 = view8;
                    i37 = i37;
                    view = view25;
                    int i63 = i44;
                    view9 = view9;
                    i4 = i63;
                    short[] sArr16 = sArr9;
                    int i64 = i41;
                    viewM9476 = C2878.m9476(this, C0619.m2761(C1146.m4222(sArr16, i64, 3, i33)) ^ 2097263379);
                    String strM12149 = C3734.m12149(f20234, 114, 3, i33);
                    int iM27613 = C0619.m2761("ᩴ֫") ^ i28;
                    i31 = iM27613 ^ 1705535926;
                    i30 = ((iM27613 ^ i29) * (-26855)) ^ 1857073105;
                    i41 = i64;
                    sArr9 = sArr16;
                    textView10 = textView14;
                    str = strM12149;
                    i39 = i8;
                    bundle = bundle;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i513 = i37;
                    view8 = view;
                    i37 = i513;
                    View view114 = view9;
                    i44 = i4;
                    view9 = view114;
                    break;
                case -1203189198:
                case 2028320697:
                    textView5 = textView10;
                    i12 = i43;
                    c25228 = c25229;
                    sb = sb2;
                    i13 = i38;
                    i14 = i39;
                    sArr5 = sArr9;
                    View view26 = view8;
                    i15 = i37;
                    view3 = view26;
                    int i65 = i44;
                    view4 = view9;
                    i16 = i65;
                    view5 = viewM9476;
                    sArr6 = sArr8;
                    textView6 = (TextView) C2878.m9476(this, C0619.m2761(C2966.m9670(sArr6, 108, 3, i33)) ^ 2097765583);
                    if (C2287.f7432 >= 0) {
                        iM31610 = (C0773.m3169("ܽ᩸") ^ i29) * (-115);
                        textView7 = textView6;
                        i17 = ((iM31610 ^ i28) * (-3073)) ^ 460563354;
                        i18 = 1672046238;
                    } else {
                        iM31610 = (C0773.m3169("ᩳ֨") + i29) * (-127);
                        textView7 = textView6;
                        i17 = ((iM31610 ^ i28) * (-17475)) ^ (-1199041009);
                        i18 = 819979593;
                    }
                    i31 = iM31610 ^ i18;
                    sArr8 = sArr6;
                    sArr9 = sArr5;
                    textView10 = textView5;
                    i30 = i17;
                    i39 = i14;
                    bundle = bundle;
                    i38 = i13;
                    sb2 = sb;
                    c25229 = c25228;
                    i43 = i12;
                    TextView textView15 = textView7;
                    viewM9476 = view5;
                    textView9 = textView15;
                    int i514 = i15;
                    view8 = view3;
                    i37 = i514;
                    View view115 = view4;
                    i44 = i16;
                    view9 = view115;
                    break;
                case -1192189535:
                case 624261470:
                    C3448.m11245(new C6902(this, (C20168) C1321.m4858(this)));
                    break;
                case -1121929141:
                case 1654684487:
                    textView4 = textView10;
                    i43 = i43;
                    int i66 = i37;
                    c25229 = c25229;
                    View view27 = view9;
                    i4 = i44;
                    sb2 = sb2;
                    View viewM9478 = C2878.m9476(this, C0773.m3169(C13473.m33137(f20234, 123, 3, i33)) ^ 2127503819);
                    if (!C2966.m9664()) {
                        view9 = view27;
                        view6 = viewM9476;
                        i37 = i66;
                        i38 = i38;
                        i11 = i39;
                        view8 = viewM9478;
                        int iM27614 = (C0619.m2761("᩻ۗ") ^ i28) * (-81);
                        int i415 = ((iM27614 ^ i29) * (-6001)) ^ 1695617724;
                        i31 = iM27614 ^ (-847826270);
                        bundle = bundle;
                        viewM9476 = view6;
                        i30 = i415;
                        i39 = i11;
                        textView10 = textView4;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        View view116 = view9;
                        i44 = i4;
                        view9 = view116;
                    } else {
                        int iM27615 = (i28 - C0619.m2761("֨ᩳ")) * 123;
                        int i67 = ((iM27615 ^ i29) * (-11383)) ^ (-1441630782);
                        i31 = iM27615 ^ 438526838;
                        i44 = i4;
                        i37 = i66;
                        textView10 = textView4;
                        view8 = viewM9478;
                        view9 = view27;
                        i30 = i67;
                        sb2 = sb2;
                        bundle = bundle;
                        c25229 = c25229;
                        i43 = i43;
                    }
                    break;
                case -824498646:
                case 981516062:
                    C3077.m10039(C0619.m2761(C3690.m11996(f20234, 126, 3, i33)) ^ 2125273564);
                    C0950.m3790(this);
                    break;
                case -621571045:
                case 113457756:
                    C3779.m12264();
                    C2354.m7983();
                    break;
                case -209886300:
                case 1504516579:
                    i22 = i43;
                    textView = textView10;
                    digitsKeyListener = DigitsKeyListener.getInstance(AbstractC0641.m2820(f20234, 132, 56, i33));
                    allCaps = new InputFilter.AllCaps();
                    if (C3448.m11248() == 0) {
                        iM2763 = (C0773.m3169("ܶܺ") ^ i28) * (-35);
                        i23 = ((iM2763 ^ i29) * (-9029)) ^ 727694275;
                        i24 = 127909586;
                        i31 = iM2763 ^ i24;
                        i30 = i23;
                        i43 = i22;
                        textView10 = textView;
                    } else {
                        i43 = i22;
                        textView9 = textView9;
                        viewM9476 = viewM9476;
                        c25227 = c25229;
                        sb2 = sb2;
                        i6 = i36;
                        i38 = i38;
                        i39 = i39;
                        sArr = sArr8;
                        sArr2 = sArr9;
                        View view28 = view8;
                        i37 = i37;
                        view = view28;
                        int i68 = i44;
                        view9 = view9;
                        i4 = i68;
                        int iM27616 = C0619.m2761("ᩴ֨") ^ i29;
                        i31 = iM27616 ^ (-2017492059);
                        i30 = ((iM27616 ^ i28) * 22503) ^ 1298538757;
                        sArr8 = sArr;
                        i36 = i6;
                        sArr9 = sArr2;
                        textView10 = textView;
                        viewM9476 = viewM9476;
                        i39 = i39;
                        textView9 = textView9;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25227;
                        bundle = bundle;
                        int i515 = i37;
                        view8 = view;
                        i37 = i515;
                        View view117 = view9;
                        i44 = i4;
                        view9 = view117;
                    }
                    break;
                case 126618755:
                case 979835464:
                    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(12);
                    i43 = i43;
                    InputFilter[] inputFilterArr = new InputFilter[i43];
                    inputFilterArr[i39] = digitsKeyListener;
                    inputFilterArr[i44] = allCaps;
                    inputFilterArr[i38] = lengthFilter;
                    editText.setFilters(inputFilterArr);
                    C2354.m7978(editText, this.f20237.f64550);
                    sArr11 = f20234;
                    i34 = 188;
                    i35 = 3;
                    if (C20932.f66974 <= 0) {
                        iM2764 = C0773.m3169("ۜܶ") ^ i29;
                        i25 = ((iM2764 ^ i28) * 26657) ^ 1486826216;
                        i26 = 863849528;
                    } else {
                        iM2764 = C0619.m2761("ۤۤ") ^ i29;
                        i25 = ((iM2764 ^ i28) * (-8587)) ^ (-806319524);
                        i26 = -549605411;
                    }
                    i31 = iM2764 ^ i26;
                    i30 = i25;
                    i43 = i43;
                    break;
                case 221250630:
                case 622176947:
                    textView10 = textView10;
                    i43 = i43;
                    textView9 = textView9;
                    viewM9476 = viewM9476;
                    c25229 = c25229;
                    sArr7 = sArr7;
                    i40 = i40;
                    sb2 = sb2;
                    i36 = i36;
                    i38 = i38;
                    i39 = i39;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    View view29 = view8;
                    i37 = i37;
                    view = view29;
                    int i69 = i44;
                    view9 = view9;
                    i4 = i69;
                    short s = f20234[95];
                    int i70 = s * 18760;
                    int i71 = s + 4690;
                    if ((i71 * i71) - i70 >= 0) {
                        iM3169 = C0773.m3169("۬᩻") ^ i29;
                        i30 = ((iM3169 ^ i28) * 20619) ^ 500484565;
                        i5 = 34926049;
                    } else {
                        iM3169 = (C0773.m3169("ۛᩴ") + i28) * 33;
                        i30 = ((iM3169 ^ i29) * 23683) ^ (-65993399);
                        i5 = -2087524117;
                    }
                    i31 = iM3169 ^ i5;
                    sArr8 = sArr8;
                    i36 = i36;
                    sArr9 = sArr9;
                    textView10 = textView10;
                    sArr7 = sArr7;
                    i40 = i40;
                    viewM9476 = viewM9476;
                    i39 = i39;
                    textView9 = textView9;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i516 = i37;
                    view8 = view;
                    i37 = i516;
                    View view118 = view9;
                    i44 = i4;
                    view9 = view118;
                    break;
                case 252523582:
                case 875738210:
                    textView4 = textView10;
                    i43 = i43;
                    c25229 = c25229;
                    sb2 = sb2;
                    i38 = i38;
                    i11 = i39;
                    View view30 = view8;
                    i37 = i37;
                    view = view30;
                    int i72 = i44;
                    view9 = view9;
                    i4 = i72;
                    C11235.m28299(C2878.m9476(this, C0773.m3169(strM1236) ^ 2127294721), new View.OnClickListener() { // from class: l.֡ۙۧ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view31) {
                            ViewOnClickListenerC5914.m17169(this.f1291);
                        }
                    });
                    m17160();
                    sArr8 = f20234;
                    int iM31617 = C0773.m3169("ۨܳ") ^ i29;
                    i30 = ((iM31617 ^ i28) * (-15075)) ^ 504779928;
                    i31 = iM31617 ^ 137447803;
                    viewM9476 = viewM9476;
                    sArr9 = sArr9;
                    textView9 = textView9;
                    i39 = i11;
                    textView10 = textView4;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i517 = i37;
                    view8 = view;
                    i37 = i517;
                    View view119 = view9;
                    i44 = i4;
                    view9 = view119;
                    break;
                case 254914468:
                case 1293709924:
                    if (RunnableC3055.m9933() != 0) {
                        textView = textView10;
                        textView9 = textView9;
                        viewM9476 = viewM9476;
                        c25227 = c25229;
                        sb2 = sb2;
                        i6 = i36;
                        i38 = i38;
                        i39 = i39;
                        sArr = sArr8;
                        sArr2 = sArr9;
                        View view210 = view8;
                        i37 = i37;
                        view = view210;
                        int i610 = i44;
                        view9 = view9;
                        i4 = i610;
                        int iM27617 = C0619.m2761("ᩴ֨") ^ i29;
                        i31 = iM27617 ^ (-2017492059);
                        i30 = ((iM27617 ^ i28) * 22503) ^ 1298538757;
                        sArr8 = sArr;
                        i36 = i6;
                        sArr9 = sArr2;
                        textView10 = textView;
                        viewM9476 = viewM9476;
                        i39 = i39;
                        textView9 = textView9;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25227;
                        bundle = bundle;
                        int i518 = i37;
                        view8 = view;
                        i37 = i518;
                        View view1110 = view9;
                        i44 = i4;
                        view9 = view1110;
                    } else {
                        textView5 = textView10;
                        i12 = i43;
                        textView6 = textView9;
                        view5 = viewM9476;
                        c25228 = c25229;
                        sArr6 = sArr8;
                        sb = sb2;
                        i13 = i38;
                        i14 = i39;
                        sArr5 = sArr9;
                        View view120 = view8;
                        i15 = i37;
                        view3 = view120;
                        int i519 = i44;
                        view4 = view9;
                        i16 = i519;
                        iM31610 = (C0773.m3169("ܽ᩸") ^ i29) * (-115);
                        textView7 = textView6;
                        i17 = ((iM31610 ^ i28) * (-3073)) ^ 460563354;
                        i18 = 1672046238;
                        i31 = iM31610 ^ i18;
                        sArr8 = sArr6;
                        sArr9 = sArr5;
                        textView10 = textView5;
                        i30 = i17;
                        i39 = i14;
                        bundle = bundle;
                        i38 = i13;
                        sb2 = sb;
                        c25229 = c25228;
                        i43 = i12;
                        TextView textView16 = textView7;
                        viewM9476 = view5;
                        textView9 = textView16;
                        int i5110 = i15;
                        view8 = view3;
                        i37 = i5110;
                        View view1111 = view4;
                        i44 = i16;
                        view9 = view1111;
                    }
                    break;
                case 367585091:
                case 982366367:
                    int i73 = i43;
                    c20085.f64550 = bundle.getString(C0773.m3166(f20234, 195, 12, i33), "");
                    c20084 = c20085;
                    c25229 = c25229;
                    view7 = view9;
                    i19 = i44;
                    i43 = i73;
                    textView8 = textView10;
                    sb2 = sb2;
                    View view31 = view8;
                    i37 = i37;
                    view = view31;
                    iM31611 = (C0619.m2761("ۛ۟") + i28) * 41;
                    i20 = ((iM31611 ^ i29) * 12363) ^ (-313698720);
                    i21 = 2033725768;
                    i31 = iM31611 ^ i21;
                    i44 = i19;
                    textView10 = textView8;
                    view9 = view7;
                    c20085 = c20084;
                    i30 = i20;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i416 = i37;
                    view8 = view;
                    i37 = i416;
                    break;
                case 592248054:
                case 990232036:
                    if (C3690.f12684 > 0) {
                        i43 = i43;
                        iM2764 = C0773.m3169("ۜܶ") ^ i29;
                        i25 = ((iM2764 ^ i28) * 26657) ^ 1486826216;
                        i26 = 863849528;
                        i31 = iM2764 ^ i26;
                        i30 = i25;
                        i43 = i43;
                    } else {
                        textView4 = textView10;
                        i43 = i43;
                        view6 = viewM9476;
                        c25229 = c25229;
                        sb2 = sb2;
                        i38 = i38;
                        i11 = i39;
                        int i417 = i44;
                        view9 = view9;
                        i4 = i417;
                        int iM27618 = (C0619.m2761("᩻ۗ") ^ i28) * (-81);
                        int i418 = ((iM27618 ^ i29) * (-6001)) ^ 1695617724;
                        i31 = iM27618 ^ (-847826270);
                        bundle = bundle;
                        viewM9476 = view6;
                        i30 = i418;
                        i39 = i11;
                        textView10 = textView4;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        View view1112 = view9;
                        i44 = i4;
                        view9 = view1112;
                    }
                    break;
                case 723112036:
                case 2125728879:
                    textView10 = textView10;
                    i43 = i43;
                    textView9 = textView9;
                    viewM9476 = viewM9476;
                    c25229 = c25229;
                    sArr7 = sArr7;
                    i40 = i40;
                    sb2 = sb2;
                    i36 = i36;
                    i38 = i38;
                    i39 = i39;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    View view32 = view8;
                    i37 = i37;
                    view = view32;
                    int i74 = i44;
                    view9 = view9;
                    i4 = i74;
                    super.onCreate(bundle);
                    if (C2702.m8873()) {
                        iM3169 = C0619.m2761("ۢ֡") ^ i29;
                        i30 = ((iM3169 ^ i28) * 6873) ^ 1992249534;
                        i5 = -459577897;
                    } else {
                        iM3169 = C0773.m3169("ۧᩳ") ^ i29;
                        i30 = ((iM3169 ^ i28) * (-12567)) ^ 340627772;
                        i5 = -1963388560;
                    }
                    i31 = iM3169 ^ i5;
                    sArr8 = sArr8;
                    i36 = i36;
                    sArr9 = sArr9;
                    textView10 = textView10;
                    sArr7 = sArr7;
                    i40 = i40;
                    viewM9476 = viewM9476;
                    i39 = i39;
                    textView9 = textView9;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i5111 = i37;
                    view8 = view;
                    i37 = i5111;
                    View view1113 = view9;
                    i44 = i4;
                    view9 = view1113;
                    break;
                case 739137873:
                case 1121139995:
                    textView = textView10;
                    i43 = i43;
                    int i75 = i36;
                    TextView textView17 = textView9;
                    viewM9476 = viewM9476;
                    c25229 = c25229;
                    sArr = sArr8;
                    sb2 = sb2;
                    i38 = i38;
                    i39 = i39;
                    sArr2 = sArr9;
                    View view33 = view8;
                    i37 = i37;
                    view = view33;
                    int i76 = i44;
                    view9 = view9;
                    i4 = i76;
                    i6 = i75;
                    C11235.m28299(C1564.m5518(this, i75), new View.OnClickListener() { // from class: l.ܿۙۧ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view34) {
                            int i77 = 1582526427;
                            int i78 = C2419.f7754;
                            int i79 = AbstractC0641.f2496;
                            int iM27619 = C0619.m2761("ᩳ֨") ^ i78;
                            int i80 = ((iM27619 ^ i79) * 7675) ^ 2124395878;
                            int i81 = 1195737102;
                            while (true) {
                                i77 = ((((i77 ^ i79) * (-23823)) >> 31) & i80) ^ (iM27619 ^ i81);
                                switch (i77) {
                                    case -2074945306:
                                    case -1987040168:
                                        C0862.m3503();
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM27619 = (C0619.m2761("ۖܳ") ^ i78) * (-93);
                                            i80 = ((iM27619 ^ i79) * (-18527)) ^ (-1533133649);
                                            i81 = -1621308688;
                                        } else {
                                            iM27619 = C0619.m2761("ۜ۟") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 24299) ^ 718465466;
                                            i81 = -679185450;
                                        }
                                        break;
                                    case -1738066484:
                                    case -14304762:
                                        if (C1826.m6301() >= 0) {
                                            iM27619 = (C0619.m2761("ۙ᩹") + i79) * 43;
                                            i80 = ((iM27619 ^ i78) * (-29833)) ^ (-1794496316);
                                            i81 = 536313450;
                                        } else {
                                            iM27619 = C0619.m2761("۠֫") ^ i78;
                                            i80 = ((iM27619 ^ i79) * (-30339)) ^ (-314102799);
                                            i81 = 630199618;
                                        }
                                        break;
                                    case -1625681540:
                                    case 1308571532:
                                        C4282.m13644();
                                        if (C1321.f4751 >= 0) {
                                            iM27619 = C0773.m3169("۫ۖ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-12571)) ^ (-1856360415);
                                            i81 = 243765343;
                                        } else {
                                            iM27619 = C0619.m2761("ۜ۟") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 24299) ^ 718465466;
                                            i81 = -679185450;
                                        }
                                        break;
                                    case -1377366525:
                                    case -106275435:
                                        if (C2375.m8065() <= 0) {
                                            iM27619 = C0773.m3169("ܺ۠") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-31245)) ^ (-801183202);
                                            i81 = 912032648;
                                        } else {
                                            iM27619 = (C0773.m3169("ۚۙ") + i79) * 85;
                                            i80 = ((iM27619 ^ i78) * (-273)) ^ (-195914146);
                                            i81 = -1466874153;
                                        }
                                        break;
                                    case -1314729070:
                                    case 1406257805:
                                        if (C2878.f9462) {
                                            iM27619 = C0619.m2761("ۜ۟") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 24299) ^ 718465466;
                                            i81 = -679185450;
                                        } else {
                                            iM27619 = C0619.m2761("᩵ۧ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-5865)) ^ (-726136804);
                                            i81 = 1362114936;
                                        }
                                        break;
                                    case -1131810660:
                                    case 942324600:
                                        C1321.m4852();
                                        C2702.m8876();
                                        break;
                                    case -818841583:
                                    case 1813277992:
                                        if (C3448.f11240 >= 0) {
                                            iM27619 = (C0619.m2761("ۖܳ") ^ i78) * (-93);
                                            i80 = ((iM27619 ^ i79) * (-18527)) ^ (-1533133649);
                                            i81 = -1621308688;
                                        } else {
                                            iM27619 = C0619.m2761("᩺ܰ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * 30591) ^ (-1053823455);
                                            i81 = -259376063;
                                        }
                                        break;
                                    case -711123644:
                                    case 751434883:
                                        if (C2966.m9664()) {
                                            iM27619 = C0619.m2761("۟ۖ") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 10785) ^ 1969792613;
                                            i81 = -1467346788;
                                        } else {
                                            iM27619 = C0773.m3169("۫ۖ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-12571)) ^ (-1856360415);
                                            i81 = 243765343;
                                        }
                                        break;
                                    case -478010090:
                                    case 2052887109:
                                        if (C11235.f35427 >= 0) {
                                            iM27619 = C0773.m3169("۫ۖ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-12571)) ^ (-1856360415);
                                            i81 = 243765343;
                                        } else {
                                            iM27619 = C0773.m3169("᩺᩵") ^ i78;
                                            i80 = ((iM27619 ^ i79) * (-16881)) ^ 1732096810;
                                            i81 = -1531088334;
                                        }
                                        break;
                                    case -202924587:
                                    case 23108429:
                                        if (C1564.f5401 <= 0) {
                                            iM27619 = C0619.m2761("ۜ۟") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 24299) ^ 718465466;
                                            i81 = -679185450;
                                        } else {
                                            iM27619 = C0773.m3169("ܺ۠") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-31245)) ^ (-801183202);
                                            i81 = 912032648;
                                        }
                                        break;
                                    case -28295624:
                                    case 1432207884:
                                        this.f59188.m17173();
                                        break;
                                    case 520703767:
                                    case 919412130:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM27619 = C0619.m2761("ۜ۟") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 24299) ^ 718465466;
                                            i81 = -679185450;
                                        } else {
                                            iM27619 = (C0619.m2761("᩵ۨ") + i79) * (-55);
                                            i80 = ((iM27619 ^ i78) * 30847) ^ 1527748771;
                                            i81 = 1074037418;
                                        }
                                        break;
                                    case 553454273:
                                    case 1460836139:
                                        if (C2419.m8174() >= 0) {
                                            iM27619 = (C0619.m2761("ۙ᩹") + i79) * 43;
                                            i80 = ((iM27619 ^ i78) * (-29833)) ^ (-1794496316);
                                            i81 = 536313450;
                                        } else {
                                            iM27619 = C0773.m3169("ۜۗ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-2995)) ^ 1265782829;
                                            i81 = 313686853;
                                        }
                                        break;
                                    case 1605282045:
                                    case 1802474823:
                                        int i82 = ViewOnClickListenerC5914.f20235;
                                        if (C1542.m5459() >= 0) {
                                            iM27619 = (C0619.m2761("ۙ᩹") + i79) * 43;
                                            i80 = ((iM27619 ^ i78) * (-29833)) ^ (-1794496316);
                                            i81 = 536313450;
                                        } else {
                                            iM27619 = C0619.m2761("ۛ֨") ^ i78;
                                            i80 = ((iM27619 ^ i79) * (-9393)) ^ (-90546417);
                                            i81 = 1982277023;
                                        }
                                        break;
                                    case 1609787871:
                                    case 1765397772:
                                        C1080.m4050();
                                        C3690.m11987();
                                        iM27619 = C0773.m3169("ܺ۠") ^ i79;
                                        i80 = ((iM27619 ^ i78) * (-31245)) ^ (-801183202);
                                        i81 = 912032648;
                                        break;
                                    default:
                                        if (C1146.f4234 >= 0) {
                                            iM27619 = C0773.m3169("۫ۖ") ^ i79;
                                            i80 = ((iM27619 ^ i78) * (-12571)) ^ (-1856360415);
                                            i81 = 243765343;
                                        } else {
                                            iM27619 = C0773.m3169("ۖۜ") ^ i78;
                                            i80 = ((iM27619 ^ i79) * 9051) ^ 8971583;
                                            i81 = -1095104786;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    textView9 = textView17;
                    strM1236 = AbstractC0116.m1236(f20234, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i33);
                    if (C4238.m13540() > 0) {
                        iM2762 = C0619.m2761("ܺۨ") ^ i28;
                        i30 = ((iM2762 ^ i29) * 14959) ^ 653598794;
                        i7 = -595857878;
                        i31 = iM2762 ^ i7;
                        sArr8 = sArr;
                        i36 = i6;
                        sArr9 = sArr2;
                        textView10 = textView;
                        viewM9476 = viewM9476;
                        i39 = i39;
                        textView9 = textView9;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25229;
                        i43 = i43;
                        int i5112 = i37;
                        view8 = view;
                        i37 = i5112;
                        View view1114 = view9;
                        i44 = i4;
                        view9 = view1114;
                    } else {
                        c25227 = c25229;
                        i43 = i43;
                        int iM27619 = C0619.m2761("ᩴ֨") ^ i29;
                        i31 = iM27619 ^ (-2017492059);
                        i30 = ((iM27619 ^ i28) * 22503) ^ 1298538757;
                        sArr8 = sArr;
                        i36 = i6;
                        sArr9 = sArr2;
                        textView10 = textView;
                        viewM9476 = viewM9476;
                        i39 = i39;
                        textView9 = textView9;
                        i38 = i38;
                        sb2 = sb2;
                        c25229 = c25227;
                        bundle = bundle;
                        int i5113 = i37;
                        view8 = view;
                        i37 = i5113;
                        View view1115 = view9;
                        i44 = i4;
                        view9 = view1115;
                    }
                    break;
                case 935715859:
                case 1285480038:
                    C2419.m8174();
                    C0950.m3785();
                    textView5 = textView10;
                    i12 = i43;
                    textView6 = textView9;
                    view5 = viewM9476;
                    c25228 = c25229;
                    sArr6 = sArr8;
                    sb = sb2;
                    i13 = i38;
                    i14 = i39;
                    sArr5 = sArr9;
                    View view121 = view8;
                    i15 = i37;
                    view3 = view121;
                    int i5114 = i44;
                    view4 = view9;
                    i16 = i5114;
                    iM31610 = (C0773.m3169("ܽ᩸") ^ i29) * (-115);
                    textView7 = textView6;
                    i17 = ((iM31610 ^ i28) * (-3073)) ^ 460563354;
                    i18 = 1672046238;
                    i31 = iM31610 ^ i18;
                    sArr8 = sArr6;
                    sArr9 = sArr5;
                    textView10 = textView5;
                    i30 = i17;
                    i39 = i14;
                    bundle = bundle;
                    i38 = i13;
                    sb2 = sb;
                    c25229 = c25228;
                    i43 = i12;
                    TextView textView18 = textView7;
                    viewM9476 = view5;
                    textView9 = textView18;
                    int i5115 = i15;
                    view8 = view3;
                    i37 = i5115;
                    View view1116 = view4;
                    i44 = i16;
                    view9 = view1116;
                    break;
                case 1017153338:
                case 1254779090:
                    textView = textView10;
                    i22 = i43;
                    editText = (EditText) C1564.m5518(this, C0773.m3169(C2485.m8350(f20234, 129, 3, i33)) ^ 2119073335);
                    iM2763 = C0619.m2761("ܶܽ") ^ i29;
                    i23 = ((iM2763 ^ i28) * (-17973)) ^ 906788806;
                    i24 = 1124391777;
                    i31 = iM2763 ^ i24;
                    i30 = i23;
                    i43 = i22;
                    textView10 = textView;
                    break;
                case 1165965687:
                case 1866739039:
                    i = i43;
                    textView10 = (TextView) C1564.m5518(this, C0619.m2761(C0619.m2756(sArr11, i34, i35, i33)) ^ 2123547581);
                    sb2 = new StringBuilder(C1783.m6233(f20234, 191, 1, i33));
                    sArr12 = f20234;
                    i32 = 192;
                    i42 = 3;
                    if (C0950.m3785() == 0) {
                        iM2761 = C0619.m2761("ܽ۠") ^ i28;
                        i2 = ((iM2761 ^ i29) * 2675) ^ 1765976934;
                        i3 = 30359309;
                        i31 = iM2761 ^ i3;
                        i30 = i2;
                        i43 = i;
                    } else {
                        i43 = i;
                        iM2764 = C0773.m3169("ۜܶ") ^ i29;
                        i25 = ((iM2764 ^ i28) * 26657) ^ 1486826216;
                        i26 = 863849528;
                        i31 = iM2764 ^ i26;
                        i30 = i25;
                        i43 = i43;
                    }
                    break;
                case 1268161578:
                case 1915942804:
                    view = view8;
                    i4 = i44;
                    i33 = 29398;
                    iM3169 = C0619.m2761("ܿᩴ") ^ i28;
                    i30 = ((iM3169 ^ i29) * 23113) ^ 1527927154;
                    i5 = -1761784868;
                    i31 = iM3169 ^ i5;
                    sArr8 = sArr8;
                    i36 = i36;
                    sArr9 = sArr9;
                    textView10 = textView10;
                    sArr7 = sArr7;
                    i40 = i40;
                    viewM9476 = viewM9476;
                    i39 = i39;
                    textView9 = textView9;
                    i38 = i38;
                    sb2 = sb2;
                    c25229 = c25229;
                    i43 = i43;
                    int i5116 = i37;
                    view8 = view;
                    i37 = i5116;
                    View view1117 = view9;
                    i44 = i4;
                    view9 = view1117;
                    break;
                case 1810862175:
                case 1860657698:
                    i43 = i43;
                    c25229 = c25229;
                    int i77 = i39;
                    StringBuilder sb4 = sb2;
                    int i78 = i38;
                    View view34 = view8;
                    i37 = i37;
                    view = view34;
                    C22666.m51101(c25229, i77, i78);
                    View viewM5518 = C1564.m5518(this, C0773.m3169(C1542.m5471(f20234, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i33)) ^ 2102711482);
                    int iM31618 = (C0773.m3169("֨ۜ") + i29) * 115;
                    i31 = iM31618 ^ 611806981;
                    i30 = ((iM31618 ^ i28) * (-597)) ^ 394323776;
                    i44 = i44;
                    i39 = i77;
                    textView10 = textView10;
                    view9 = viewM5518;
                    i38 = i78;
                    sb2 = sb4;
                    bundle = bundle;
                    c25229 = c25229;
                    i43 = i43;
                    int i419 = i37;
                    view8 = view;
                    i37 = i419;
                    break;
                default:
                    i = i43;
                    C1783.m6234(sb2, C3779.m12271(this, C0773.m3169(C2310.m7803(sArr12, i32, i42, i33)) ^ 2100430873));
                    C2354.m7978(textView10, C1080.m4058(sb2));
                    C3077.m10043(textView10, C3296.f10774);
                    editText.addTextChangedListener(new C8393(this));
                    if (this.f20237.f64552 == null) {
                        iM2761 = C0619.m2761("ܿܶ") ^ i28;
                        i2 = ((iM2761 ^ i29) * 12331) ^ 1288938158;
                        i3 = 1354365648;
                    } else {
                        iM2761 = C0619.m2761("ᩳۛ") ^ i29;
                        i2 = ((iM2761 ^ i28) * (-25787)) ^ (-1086172347);
                        i3 = -843152087;
                    }
                    i31 = iM2761 ^ i3;
                    i30 = i2;
                    i43 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01e8 A[PHI: r6 r7 r9
      0x01e8: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:51:0x01d0, B:31:0x00f1, B:28:0x00cf, B:110:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x01d0, B:31:0x00f1, B:28:0x00cf, B:110:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:51:0x01d0, B:31:0x00f1, B:28:0x00cf, B:110:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x020c A[PHI: r4 r5 r11
      0x020c: PHI (r4v4 float) = (r4v3 float), (r4v2 float), (r4v2 float) binds: [B:55:0x020a, B:43:0x018b, B:39:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r5v4 float) = (r5v3 float), (r5v2 float), (r5v2 float) binds: [B:55:0x020a, B:43:0x018b, B:39:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:55:0x020a, B:43:0x018b, B:39:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0338 A[PHI: r16 r17 r26
      0x0338: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:84:0x0336, B:70:0x02a9, B:15:0x0091, B:126:0x0338] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short), (r17v2 short) binds: [B:84:0x0336, B:70:0x02a9, B:15:0x0091, B:126:0x0338] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r26v5 java.lang.String) = (r26v3 java.lang.String), (r26v4 java.lang.String), (r26v3 java.lang.String), (r26v3 java.lang.String) binds: [B:84:0x0336, B:70:0x02a9, B:15:0x0091, B:126:0x0338] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x03a1 A[PHI: r13 r14 r15 r18 r19
      0x03a1: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:92:0x039f, B:15:0x0091, B:128:0x03a1] A[DONT_GENERATE, DONT_INLINE]
      0x03a1: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:92:0x039f, B:15:0x0091, B:128:0x03a1] A[DONT_GENERATE, DONT_INLINE]
      0x03a1: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:92:0x039f, B:15:0x0091, B:128:0x03a1] A[DONT_GENERATE, DONT_INLINE]
      0x03a1: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:92:0x039f, B:15:0x0091, B:128:0x03a1] A[DONT_GENERATE, DONT_INLINE]
      0x03a1: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:92:0x039f, B:15:0x0091, B:128:0x03a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = this;
        int i4 = C2375.f7641;
        int i5 = C1146.f4234;
        int iM2763 = C0619.m2761("۠ᩴ") ^ i4;
        int i6 = ((iM2763 ^ i5) * (-22063)) ^ (-1496895867);
        int[] iArr = null;
        String strM28300 = null;
        String strM1236 = null;
        short[] sArr = null;
        int i7 = iM2763 ^ 2030194767;
        View viewFindViewById = null;
        float rawX = 0.0f;
        float rawY = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        char c = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 1411418477;
        short[] sArr2 = null;
        int iM2764 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i5) * 16933) >> 31));
            switch (i16) {
                case -2126611216:
                case -1279288696:
                    C2375.m8065();
                    iM2762 = (C0773.m3169("ۨܰ") ^ i4) * 91;
                    i2 = ((iM2762 ^ i5) * (-13973)) ^ (-1011804854);
                    i3 = 2005991677;
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -2112592374:
                case -199357642:
                    viewFindViewById = viewOnClickListenerC5914.findViewById(C0619.m2761(strM1236) ^ 2125324138);
                    if (viewFindViewById == null) {
                        iM2761 = C0619.m2761("ۛۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15445) ^ (-1480142688);
                        i = 168653744;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    } else {
                        iM2762 = C0773.m3169("ܳܽ") ^ i4;
                        i2 = ((iM2762 ^ i5) * (-11223)) ^ 1915522265;
                        i3 = -990931507;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -2053813312:
                case 988461454:
                    i11 = 21228;
                    iM2761 = (C0619.m2761("ۜܿ") ^ i5) * (-11);
                    i6 = ((iM2761 ^ i4) * (-11401)) ^ (-1150801659);
                    i = -311902458;
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -2018541485:
                case 1175485474:
                    if (motionEvent.getActionMasked() == 0) {
                        iM2761 = (C0773.m3169("ۤۧ") ^ i5) * (-7);
                        i6 = ((iM2761 ^ i4) * 16283) ^ (-48192961);
                        i = 1645859122;
                    } else {
                        iM2761 = C0619.m2761("ۛۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15445) ^ (-1480142688);
                        i = 168653744;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1965391914:
                case 1028599751:
                    i10 = iArr[1];
                    if (rawY >= i10) {
                        iM2762 = (C0773.m3169("ۘ᩷") ^ i5) * (-113);
                        i2 = ((iM2762 ^ i4) * (-21295)) ^ 536588484;
                        i3 = 480339449;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩸") ^ i5;
                        i2 = ((iM2762 ^ i4) * 11659) ^ (-1805095800);
                        i3 = 1321627313;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -1924934732:
                case 1966275870:
                    rawX = motionEvent.getRawX();
                    rawY = motionEvent.getRawY();
                    if (C4238.m13540() <= 0) {
                        iM2762 = C0619.m2761("֫۫") ^ i5;
                        i2 = ((iM2762 ^ i4) * (-26673)) ^ (-1978305321);
                        i3 = -8178790;
                    } else {
                        iM2762 = (C0619.m2761("ۚ֡") ^ i4) * 17;
                        i2 = ((iM2762 ^ i5) * (-12523)) ^ 810456848;
                        i3 = 511055499;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -1875104614:
                case -1082988292:
                    strM28300 = C11235.m28300(f20234, 83, 12, i11);
                    if (C17202.m40372()) {
                        iM2762 = C0619.m2761("ܺ᩺") ^ i4;
                        i2 = ((iM2762 ^ i5) * 32749) ^ 530530202;
                        i3 = -755865099;
                    } else {
                        iM2762 = C0619.m2761("ۧ۬") ^ i4;
                        i2 = ((iM2762 ^ i5) * 30265) ^ 925395469;
                        i3 = -1579830736;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -1866627740:
                case 115896138:
                    if (rawY < C2878.m9482(viewFindViewById) + i10) {
                        iM2761 = C0619.m2761("ۛۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15445) ^ (-1480142688);
                        i = 168653744;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩸") ^ i5;
                        i2 = ((iM2762 ^ i4) * 11659) ^ (-1805095800);
                        i3 = 1321627313;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -1797812742:
                case 1341840184:
                    C0773.m3161();
                    if (C1826.f6190 <= 0) {
                        iM2762 = C0619.m2761("ۧ۬") ^ i4;
                        i2 = ((iM2762 ^ i5) * 30265) ^ 925395469;
                        i3 = -1579830736;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۖۜ")) * 25;
                        i6 = ((iM2761 ^ i4) * 19137) ^ 694514624;
                        i = -1613595019;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1542017367:
                case -1210667252:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("᩻ܿ") + i5) * (-59);
                        i6 = ((iM2761 ^ i4) * (-29017)) ^ (-1354052311);
                        i = -520625226;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") ^ i4) * 47;
                        i6 = ((iM2761 ^ i5) * 13501) ^ (-1377708581);
                        i = -1784855061;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1507064052:
                case -1180178999:
                    ((InputMethodManager) C23916.m53416(viewOnClickListenerC5914, strM28300)).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), i8);
                    iM2761 = C0619.m2761("ۛۚ") ^ i4;
                    i6 = ((iM2761 ^ i5) * 15445) ^ (-1480142688);
                    i = 168653744;
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1460266463:
                case 1124843728:
                    s2 = sArr2[c];
                    i15 = s2 * 2;
                    if (RunnableC3646.f12471) {
                        iM2761 = (i5 - C0773.m3169("ۖۜ")) * 25;
                        i6 = ((iM2761 ^ i4) * 19137) ^ 694514624;
                        i = -1613595019;
                    } else {
                        iM2761 = (C0773.m3169("ۤᩴ") ^ i5) * 81;
                        i6 = ((iM2761 ^ i4) * (-7569)) ^ 1288619620;
                        i = -1475890730;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1435972414:
                case 2127772822:
                    return super.dispatchTouchEvent(motionEvent);
                case -1423293580:
                case 1320468299:
                    strM1236 = AbstractC0116.m1236(f20234, 77, 3, i11);
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("᩻ܿ") + i5) * (-59);
                        i6 = ((iM2761 ^ i4) * (-29017)) ^ (-1354052311);
                        i = -520625226;
                    } else {
                        iM2761 = C0619.m2761("۬ۧ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 4801) ^ 2006727228;
                        i = 846062963;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -1388588281:
                case 1708980483:
                    iArr = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr);
                    if (C3033.f9831 < 0) {
                        iM2762 = (C0773.m3169("ᩳܳ") + i4) * (-31);
                        i2 = ((iM2762 ^ i5) * (-13027)) ^ 1967614021;
                        i3 = -1382735513;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۖۜ")) * 25;
                        i6 = ((iM2761 ^ i4) * 19137) ^ 694514624;
                        i = -1613595019;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -1338906658:
                case 19810750:
                    if (!viewFindViewById.hasFocus()) {
                        iM2761 = C0619.m2761("ۛۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15445) ^ (-1480142688);
                        i = 168653744;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    } else {
                        iM2762 = C0619.m2761("ۘܳ") ^ i5;
                        i2 = ((iM2762 ^ i4) * 3163) ^ 1960295524;
                        i3 = 490886750;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -1290073433:
                case -443428706:
                    i11 = 8963;
                    iM2761 = (C0619.m2761("ۜܿ") ^ i5) * (-11);
                    i6 = ((iM2761 ^ i4) * (-11401)) ^ (-1150801659);
                    i = -311902458;
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case -774100161:
                case -57342826:
                    C2966.m9664();
                    return false;
                case -720635220:
                case 797134223:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i5 - C0773.m3169("ۖۜ")) * 25;
                        i6 = ((iM2761 ^ i4) * 19137) ^ 694514624;
                        i = -1613595019;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    } else {
                        iM2762 = (C0773.m3169("ۨܰ") ^ i4) * 91;
                        i2 = ((iM2762 ^ i5) * (-13973)) ^ (-1011804854);
                        i3 = 2005991677;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -632709729:
                case 302705291:
                    iM2764 = C0619.m2761(C3033.m9847(sArr, i13, i12, i11));
                    if (C3998.m12920()) {
                        iM2762 = (C0773.m3169("᩷᩸") + i5) * (-91);
                        i2 = ((iM2762 ^ i4) * (-29649)) ^ (-726094930);
                        i3 = -1535108864;
                    } else {
                        iM2762 = C0619.m2761("֫۫") ^ i5;
                        i2 = ((iM2762 ^ i4) * (-26673)) ^ (-1978305321);
                        i3 = -8178790;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -592109355:
                case 1470841929:
                    i8 = 0;
                    i9 = iArr[0];
                    if (rawX >= i9) {
                        iM2762 = C0619.m2761("ۙܿ") ^ i4;
                        i2 = ((iM2762 ^ i5) * 21657) ^ 376974272;
                        i3 = 1721153134;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩸") ^ i5;
                        i2 = ((iM2762 ^ i4) * 11659) ^ (-1805095800);
                        i3 = 1321627313;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -514995410:
                case -479490018:
                    C20932.m47848();
                    if (!RunnableC1848.f6235) {
                        iM2762 = (C0773.m3169("ۨܰ") ^ i4) * 91;
                        i2 = ((iM2762 ^ i5) * (-13973)) ^ (-1011804854);
                        i3 = 2005991677;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܿ") + i5) * (-59);
                        i6 = ((iM2761 ^ i4) * (-29017)) ^ (-1354052311);
                        i = -520625226;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case -416378289:
                case 1827109643:
                    C2287.m7751(C2878.m9476(viewOnClickListenerC5914, 2124928897 ^ iM2764));
                    if (C1519.f5300 >= 0) {
                        iM2762 = C0619.m2761("֫۫") ^ i5;
                        i2 = ((iM2762 ^ i4) * (-26673)) ^ (-1978305321);
                        i3 = -8178790;
                    } else {
                        iM2762 = (C0773.m3169("ۜܰ") ^ i5) * (-19);
                        i2 = ((iM2762 ^ i4) * (-23075)) ^ (-55162739);
                        i3 = 1992768900;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case -20979867:
                case 1119317506:
                    sArr = f20234;
                    i13 = 80;
                    i12 = 3;
                    if (C0773.f2792 > 0) {
                        iM2762 = (C0773.m3169("۬۬") + i4) * 75;
                        i2 = ((iM2762 ^ i5) * (-21489)) ^ (-1949107701);
                        i3 = 796690808;
                        i7 = iM2762 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") ^ i4) * 47;
                        i6 = ((iM2761 ^ i5) * 13501) ^ (-1377708581);
                        i = -1784855061;
                        i7 = iM2761 ^ i;
                        viewOnClickListenerC5914 = this;
                    }
                    break;
                case 232532898:
                case 361413176:
                    sArr2 = f20234;
                    c = 'L';
                    if (C3492.m11488()) {
                        iM2761 = (i4 - C0619.m2761("۬᩷")) * (-121);
                        i6 = ((iM2761 ^ i5) * (-20033)) ^ 953973745;
                        i = 1808522019;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") ^ i4) * 47;
                        i6 = ((iM2761 ^ i5) * 13501) ^ (-1377708581);
                        i = -1784855061;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                case 306772369:
                case 1576015460:
                    if (rawX < C0773.m3158(viewFindViewById) + i9) {
                        iM2762 = (C0773.m3169("۟۟") + i5) * 65;
                        i2 = ((iM2762 ^ i4) * (-31687)) ^ (-1347667950);
                        i3 = -230187611;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩸") ^ i5;
                        i2 = ((iM2762 ^ i4) * 11659) ^ (-1805095800);
                        i3 = 1321627313;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i2;
                    break;
                case 1633317637:
                case 2122818148:
                    i14 = i15 + 1;
                    s = 1;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("᩻ܿ") + i5) * (-59);
                        i6 = ((iM2761 ^ i4) * (-29017)) ^ (-1354052311);
                        i = -520625226;
                    } else {
                        iM2761 = C0619.m2761("ܿۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 6309) ^ (-355959394);
                        i = 1594034295;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
                default:
                    int i17 = s2 + s;
                    if (i14 - (i17 * i17) > 0) {
                        iM2761 = C0773.m3169("۟֡") ^ i4;
                        i6 = ((iM2761 ^ i5) * 31989) ^ 1988551060;
                        i = -1857053115;
                    } else {
                        iM2761 = (C0773.m3169("ۗܿ") ^ i4) * 37;
                        i6 = ((iM2761 ^ i5) * (-23013)) ^ 1521705507;
                        i = 1639201237;
                    }
                    i7 = iM2761 ^ i;
                    viewOnClickListenerC5914 = this;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x015d A[PHI: r3 r4 r5 r10 r11 r12
      0x015d: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r4v4 l.ۢۙۧ) = (r4v2 l.ۢۙۧ), (r4v2 l.ۢۙۧ), (r4v3 l.ۢۙۧ), (r4v2 l.ۢۙۧ) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r5v4 l.֫֫۫) = (r5v2 l.֫֫۫), (r5v2 l.֫֫۫), (r5v3 l.֫֫۫), (r5v2 l.֫֫۫) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:41:0x015b, B:37:0x0137, B:33:0x0114, B:29:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01af A[PHI: r15 r24
      0x01af: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:93:0x01af, B:46:0x01ad, B:20:0x00ab, B:17:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r24v20 int) = (r24v3 int), (r24v15 int), (r24v3 int), (r24v3 int) binds: [B:93:0x01af, B:46:0x01ad, B:20:0x00ab, B:17:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m17169(ViewOnClickListenerC5914 viewOnClickListenerC5914) {
        int i;
        short s;
        int iM2761;
        int i2;
        int iM3169;
        int i3;
        int iM31610;
        int i4;
        int i5;
        int i6;
        int iM2762;
        int i7;
        ViewOnClickListenerC5914 viewOnClickListenerC5915 = viewOnClickListenerC5914;
        int i8 = RunnableC0334.f1808;
        int i9 = C2702.f8586;
        int iM31611 = (C0773.m3169("ۚ᩷") ^ i8) * (-119);
        int i10 = ((iM31611 ^ i9) * 12979) ^ (-226933390);
        ViewOnLongClickListenerC1596 viewOnLongClickListenerC1596 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM31611 ^ (-729856244);
        C5168 c5168 = null;
        int iM2763 = 0;
        int iM31612 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i16 = -900409444;
        int i17 = 0;
        ViewOnClickListenerC9884 viewOnClickListenerC9884 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i9) * (-30959)) >> 31));
            switch (i16) {
                case -2110279893:
                case 1177525106:
                    c5168.m22957(i18);
                    c5168.m22918();
                    if (C3998.f13671 != 0) {
                        iM31610 = C0773.m3169("ۚܳ") ^ i9;
                        i4 = ((iM31610 ^ i8) * 897) ^ (-1880251497);
                        i5 = -1902478039;
                    } else {
                        iM31610 = C0619.m2761("ۘ᩻") ^ i8;
                        i4 = ((iM31610 ^ i9) * (-29035)) ^ 466926830;
                        i5 = -1907212893;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -2046938377:
                case 1007662828:
                    iM2763 = 2127569232 ^ C0619.m2761(C20932.m47853(sArr2, i12, i13, i14));
                    if (C1146.f4234 < 0) {
                        iM31610 = C0773.m3169("ܳ֨") ^ i8;
                        i4 = ((iM31610 ^ i9) * 9555) ^ (-79212673);
                        i5 = -889906572;
                        i11 = iM31610 ^ i5;
                        i10 = i4;
                    } else {
                        i = i17;
                        iM3169 = C0619.m2761("᩵ۤ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 17479) ^ 410312426;
                        i3 = -1725430960;
                        i6 = iM3169 ^ i3;
                        i17 = i;
                        i11 = i6;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    }
                    break;
                case -1954825785:
                case 1178544982:
                    i14 = 62784;
                    iM2762 = (i8 - C0619.m2761("᩺ۘ")) * (-9);
                    i4 = ((iM2762 ^ i9) * 27997) ^ (-789287987);
                    i7 = 463061575;
                    int i20 = iM2762 ^ i7;
                    i17 = i17;
                    i11 = i20;
                    i10 = i4;
                    break;
                case -1926886186:
                case -947108346:
                    C4282.m13644();
                    break;
                case -1867670198:
                case 973941015:
                    i15 = 70;
                    i17 = 3;
                    if (C2485.f7950 != 0) {
                        iM31610 = (C0773.m3169("ᩴ᩹") + i9) * (-53);
                        i4 = ((iM31610 ^ i8) * (-13861)) ^ (-1858177284);
                        i5 = -1921202083;
                    } else {
                        iM31610 = C0619.m2761("ܿۛ") ^ i8;
                        i4 = ((iM31610 ^ i9) * 737) ^ (-1707712225);
                        i5 = -264354924;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -1830676623:
                case -957071092:
                    if (!C3077.m10041()) {
                        iM31610 = (C0773.m3169("ᩴ᩹") + i9) * (-53);
                        i4 = ((iM31610 ^ i8) * (-13861)) ^ (-1858177284);
                        i5 = -1921202083;
                        i11 = iM31610 ^ i5;
                        i10 = i4;
                    } else {
                        s = s2;
                        i = i17;
                        iM2761 = C0773.m3169("᩷ܶ") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-31041)) ^ (-1109820288);
                        i2 = 1060138448;
                        i6 = iM2761 ^ i2;
                        s2 = s;
                        i17 = i;
                        i11 = i6;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    }
                    break;
                case -1760423945:
                case 407267122:
                    i = i17;
                    int i21 = s2 + s3;
                    s = s2;
                    if ((i21 * i21) - (s * 31340) >= 0) {
                        iM2761 = C0773.m3169("ܿ۫") ^ i9;
                        i10 = ((iM2761 ^ i8) * (-22037)) ^ (-142118050);
                        i2 = 1671061911;
                    } else {
                        iM2761 = C0773.m3169("۫ۚ") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-20651)) ^ (-1429489283);
                        i2 = -1094411705;
                    }
                    i6 = iM2761 ^ i2;
                    s2 = s;
                    i17 = i;
                    i11 = i6;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -1472787043:
                case 1874738981:
                    c5168.m22945(iM31612 ^ i19);
                    c5168.m22950();
                    i18 = 6;
                    if (C1783.f6087 <= 0) {
                        iM31610 = C0773.m3169("ۚܳ") ^ i9;
                        i4 = ((iM31610 ^ i8) * 897) ^ (-1880251497);
                        i5 = -1902478039;
                    } else {
                        iM31610 = C0773.m3169("᩻ۧ") ^ i9;
                        i4 = ((iM31610 ^ i8) * (-29203)) ^ (-772380278);
                        i5 = -900041893;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -1312109615:
                case -426909674:
                    sArr2 = f20234;
                    i12 = 73;
                    i13 = 3;
                    if (C1826.m6301() >= 0) {
                        iM31610 = C0773.m3169("ۚܳ") ^ i9;
                        i4 = ((iM31610 ^ i8) * 897) ^ (-1880251497);
                        i5 = -1902478039;
                    } else {
                        iM31610 = C0619.m2761("֨ۚ") ^ i8;
                        i4 = ((iM31610 ^ i9) * (-28773)) ^ 644411200;
                        i5 = -1337886198;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -1142084145:
                case 451087665:
                    viewOnClickListenerC9884 = new ViewOnClickListenerC9884(viewOnClickListenerC5915, 0);
                    viewOnLongClickListenerC1596 = null;
                    if (RunnableC1848.f6235) {
                        iM31610 = C0773.m3169("ۚܳ") ^ i9;
                        i4 = ((iM31610 ^ i8) * 897) ^ (-1880251497);
                        i5 = -1902478039;
                    } else {
                        iM31610 = (C0773.m3169("֨۠") + i9) * (-25);
                        i4 = ((iM31610 ^ i8) * (-11785)) ^ 757101250;
                        i5 = 1557354749;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -800014162:
                case 878023974:
                    s = s2;
                    i = i17;
                    sArr3 = f20234;
                    c = 'E';
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("᩷ܶ") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-31041)) ^ (-1109820288);
                        i2 = 1060138448;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܳ") + i8) * (-107);
                        i10 = ((iM2761 ^ i9) * 31317) ^ 107044064;
                        i2 = -1804751054;
                    }
                    i6 = iM2761 ^ i2;
                    s2 = s;
                    i17 = i;
                    i11 = i6;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -783949853:
                case 2134999405:
                    if (C11235.f35427 >= 0) {
                        iM31610 = (C0773.m3169("ᩴ᩹") + i9) * (-53);
                        i4 = ((iM31610 ^ i8) * (-13861)) ^ (-1858177284);
                        i5 = -1921202083;
                    } else {
                        iM31610 = (C0619.m2761("᩷ܳ") ^ i8) * 91;
                        i4 = ((iM31610 ^ i9) * (-19479)) ^ 500936151;
                        i5 = 303375583;
                    }
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -612763110:
                case 319540801:
                    i = i17;
                    s2 = sArr3[c];
                    s3 = 7835;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("᩵ۤ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 17479) ^ 410312426;
                        i3 = -1725430960;
                    } else {
                        iM3169 = (C0773.m3169("֡ۧ") + i9) * 127;
                        i10 = ((iM3169 ^ i8) * 19507) ^ (-438120794);
                        i3 = -149383956;
                    }
                    i6 = iM3169 ^ i3;
                    i17 = i;
                    i11 = i6;
                    viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    break;
                case -451308778:
                case 64232268:
                    break;
                case -128388084:
                case 135200862:
                    C2354.m7983();
                    C0487.m2356();
                    iM31610 = (C0773.m3169("ᩴ᩹") + i9) * (-53);
                    i4 = ((iM31610 ^ i8) * (-13861)) ^ (-1858177284);
                    i5 = -1921202083;
                    i11 = iM31610 ^ i5;
                    i10 = i4;
                    break;
                case -26248724:
                case 737436071:
                    i14 = 60072;
                    iM2762 = (i8 - C0619.m2761("᩺ۘ")) * (-9);
                    i4 = ((iM2762 ^ i9) * 27997) ^ (-789287987);
                    i7 = 463061575;
                    int i22 = iM2762 ^ i7;
                    i17 = i17;
                    i11 = i22;
                    i10 = i4;
                    break;
                case -11927442:
                case 548632003:
                    c5168.m22921(iM2763, viewOnClickListenerC9884, viewOnLongClickListenerC1596);
                    c5168.m22955(false);
                    i17 = i17;
                    iM2762 = C0773.m3169("᩵ܰ") ^ i9;
                    i4 = ((iM2762 ^ i8) * (-19831)) ^ (-1446928590);
                    i7 = 1270466475;
                    int i23 = iM2762 ^ i7;
                    i17 = i17;
                    i11 = i23;
                    i10 = i4;
                    break;
                case 130343168:
                case 1990059234:
                    i17 = i17;
                    if (viewOnClickListenerC5915.f20242.m55199()) {
                        iM2762 = (C0619.m2761("ܽۛ") ^ i9) * (-57);
                        i4 = ((iM2762 ^ i8) * 26451) ^ (-836095772);
                        i7 = -1018547681;
                    } else {
                        iM2762 = C0773.m3169("᩵ܰ") ^ i9;
                        i4 = ((iM2762 ^ i8) * (-19831)) ^ (-1446928590);
                        i7 = 1270466475;
                    }
                    int i24 = iM2762 ^ i7;
                    i17 = i17;
                    i11 = i24;
                    i10 = i4;
                    break;
                case 176990336:
                case 209076756:
                    C1564.m5509();
                    if (C1542.f5343 > 0) {
                        i = i17;
                        iM3169 = C0619.m2761("᩵ۤ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 17479) ^ 410312426;
                        i3 = -1725430960;
                        i6 = iM3169 ^ i3;
                        i17 = i;
                        i11 = i6;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    } else {
                        iM31610 = (C0619.m2761("᩷ܳ") ^ i8) * 91;
                        i4 = ((iM31610 ^ i9) * (-19479)) ^ 500936151;
                        i5 = 303375583;
                        i11 = iM31610 ^ i5;
                        i10 = i4;
                    }
                    break;
                case 483119377:
                case 587050342:
                    int i25 = i17;
                    c5168 = new C5168(viewOnClickListenerC5915, viewOnClickListenerC5915);
                    sArr = f20234;
                    if (C0862.f3233 != 0) {
                        i = i25;
                        iM3169 = C0619.m2761("᩵ۤ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 17479) ^ 410312426;
                        i3 = -1725430960;
                        i6 = iM3169 ^ i3;
                        i17 = i;
                        i11 = i6;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    } else {
                        int iM2764 = (C0619.m2761("ᩴۜ") ^ i8) * (-117);
                        i10 = ((iM2764 ^ i9) * (-18379)) ^ 1142604632;
                        i17 = i25;
                        i11 = iM2764 ^ (-535312537);
                    }
                    break;
                default:
                    int i26 = i17;
                    iM31612 = C0773.m3169(C4282.m13650(sArr, i15, i26, i14));
                    if (C3033.f9831 >= 0) {
                        i = i26;
                        i19 = 2102546988;
                        iM3169 = C0619.m2761("᩵ۤ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 17479) ^ 410312426;
                        i3 = -1725430960;
                        i6 = iM3169 ^ i3;
                        i17 = i;
                        i11 = i6;
                        viewOnClickListenerC5915 = viewOnClickListenerC5914;
                    } else {
                        int iM2765 = C0619.m2761("۟᩸") ^ i9;
                        i17 = i26;
                        i10 = ((iM2765 ^ i8) * (-28185)) ^ (-1185964098);
                        i11 = iM2765 ^ (-531036840);
                        i19 = 2102546988;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17161(ViewOnClickListenerC5914 viewOnClickListenerC5914) {
        TextView textView = null;
        boolean z = false;
        CharSequence charSequenceM17168 = null;
        boolean z2 = false;
        int i = -303767956;
        int i2 = C1542.f5343;
        int i3 = C2966.f9654;
        int iM3169 = (C0773.m3169("᩺ᩳ") ^ i2) * (-93);
        int i4 = ((iM3169 ^ i3) * 31523) ^ 2014860809;
        int i5 = 385142811;
        while (true) {
            i = ((((i ^ i3) * (-18929)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2048844268:
                case 938570806:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܰۗ") ^ i2) * (-65);
                        i4 = ((iM3169 ^ i3) * (-22393)) ^ (-1081467861);
                        i5 = -1212098001;
                    } else {
                        iM3169 = (C0773.m3169("᩷ᩴ") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * 3083) ^ (-1069442099);
                        i5 = 525807776;
                    }
                    break;
                case -1957498476:
                case 1161358234:
                    if (C3690.m11987()) {
                        iM3169 = (C0619.m2761("ܰۗ") ^ i2) * (-65);
                        i4 = ((iM3169 ^ i3) * (-22393)) ^ (-1081467861);
                        i5 = -1212098001;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11037) ^ 1517422780;
                        i5 = -1855928651;
                    }
                    break;
                case -1738697082:
                case 141444720:
                    charSequenceM17168 = m17168(z);
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15541)) ^ (-115512596);
                        i5 = -473837879;
                    } else {
                        iM3169 = C0619.m2761("ۜܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9449) ^ 1535870360;
                        i5 = 268182688;
                    }
                    break;
                case -1715804110:
                case -670942124:
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("ܶ᩺") ^ i3) * 127;
                        i4 = ((iM3169 ^ i2) * (-22189)) ^ 2093400573;
                        i5 = -2113390082;
                    } else {
                        iM3169 = C0619.m2761("۫ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19739) ^ 1742577796;
                        i5 = 1226969324;
                    }
                    break;
                case -1667885225:
                case 558584522:
                    break;
                case -1508718055:
                case 1103549764:
                    textView = viewOnClickListenerC5914.f20236;
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15541)) ^ (-115512596);
                        i5 = -473837879;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩶۟")) * (-127);
                        i4 = ((iM3169 ^ i3) * 27309) ^ 1345671350;
                        i5 = -738919283;
                    }
                    break;
                case -1499562057:
                case 2020396782:
                    viewOnClickListenerC5914.f20241 = z2;
                    if (viewOnClickListenerC5914.f20240) {
                        iM3169 = (i2 - C0773.m3169("ۢܶ")) * (-45);
                        i4 = ((iM3169 ^ i3) * 30187) ^ 816585942;
                        i5 = 1513567155;
                    } else {
                        iM3169 = C0773.m3169("ۨᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8131) ^ (-2119089487);
                        i5 = 25764383;
                    }
                    break;
                case -1432289552:
                case 1395190306:
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("ܰۗ") ^ i2) * (-65);
                        i4 = ((iM3169 ^ i3) * (-22393)) ^ (-1081467861);
                        i5 = -1212098001;
                    } else {
                        iM3169 = (C0619.m2761("ۙ᩶") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-11849)) ^ (-667138428);
                        i5 = 923909683;
                    }
                    break;
                case -901186803:
                case 312780410:
                    z = true;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15541)) ^ (-115512596);
                        i5 = -473837879;
                    } else {
                        iM3169 = C0619.m2761("۟ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27093) ^ 1185696293;
                        i5 = -1787733925;
                    }
                    break;
                case -734197628:
                case 596503340:
                    C3448.m11248();
                    AbstractC3624.m11755();
                    iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                    i4 = ((iM3169 ^ i3) * 11663) ^ (-1889826390);
                    i5 = 322799679;
                    break;
                case -376066662:
                case 420756875:
                    C2485.m8357();
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0619.m2761("ۙ᩶") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-11849)) ^ (-667138428);
                        i5 = 923909683;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11663) ^ (-1889826390);
                        i5 = 322799679;
                    }
                    break;
                case 20887609:
                case 1407997335:
                    C2287.m7745();
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11663) ^ (-1889826390);
                        i5 = 322799679;
                    } else {
                        iM3169 = C0619.m2761("۫ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19739) ^ 1742577796;
                        i5 = 1226969324;
                    }
                    break;
                case 273173215:
                case 876482278:
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("ᩳۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26625) ^ 70618379;
                        i5 = -863771394;
                    } else {
                        iM3169 = (C0619.m2761("ۙ᩶") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-11849)) ^ (-667138428);
                        i5 = 923909683;
                    }
                    break;
                case 598619507:
                case 1184710488:
                    C23916.m53425(textView, charSequenceM17168);
                    z2 = false;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ܰۗ") ^ i2) * (-65);
                        i4 = ((iM3169 ^ i3) * (-22393)) ^ (-1081467861);
                        i5 = -1212098001;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۧۤ")) * 11;
                        i4 = ((iM3169 ^ i2) * (-22637)) ^ (-946922989);
                        i5 = -1204236532;
                    }
                    break;
                case 1136709115:
                case 1460272820:
                    viewOnClickListenerC5914.f20240 = z2;
                    viewOnClickListenerC5914.m17173();
                    iM3169 = C0773.m3169("ۨᩳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 8131) ^ (-2119089487);
                    i5 = 25764383;
                    break;
                case 1240006414:
                case 1417598712:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15541)) ^ (-115512596);
                        i5 = -473837879;
                    } else {
                        iM3169 = C0773.m3169("ۛ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8261) ^ (-328205611);
                        i5 = 374206247;
                    }
                    break;
                case 1568013813:
                case 1888000583:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15541)) ^ (-115512596);
                        i5 = -473837879;
                    } else {
                        iM3169 = C0773.m3169("᩵᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18187) ^ (-986539421);
                        i5 = -1923825219;
                    }
                    break;
                default:
                    C2288.m7767();
                    C1826.m6301();
                    break;
            }
            return;
        }
    }

    static {
        int i = 0;
        int[] iArr = null;
        int i2 = 1087669386;
        int i3 = RunnableC0334.f1808;
        int i4 = C1564.f5401;
        int iM3169 = C0773.m3169("ۙۖ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-31049)) ^ (-792392888);
        int i6 = 1885963554;
        while (true) {
            i2 = ((((i2 ^ i4) * 9065) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1761126348:
                case -231127835:
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0773.m3169("ܿ֡") ^ i4) * (-25);
                        i5 = ((iM3169 ^ i3) * 21433) ^ 1041303750;
                        i6 = 1512996316;
                    } else {
                        iM3169 = C0773.m3169("ܶۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19463) ^ 1222403444;
                        i6 = 838957197;
                    }
                    break;
                case -1473955696:
                case 2061728164:
                    // fill-array-data instruction
                    iArr[0] = 2131231469;
                    iArr[1] = 2131231475;
                    iArr[2] = 2131231476;
                    iArr[3] = 2131231477;
                    iArr[4] = 2131231478;
                    iArr[5] = 2131231479;
                    iArr[6] = 2131231480;
                    iArr[7] = 2131231481;
                    iArr[8] = 2131231482;
                    iArr[9] = 2131231470;
                    iArr[10] = 2131231471;
                    iArr[11] = 2131231472;
                    iArr[12] = 2131231473;
                    iArr[13] = 2131231474;
                    iArr[14] = 2131231483;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ۨܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-18123)) ^ 1061188968;
                        i6 = 1511953472;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܿ᩷")) * (-51);
                        i5 = ((iM3169 ^ i3) * (-19949)) ^ (-1205991063);
                        i6 = -349062020;
                    }
                    break;
                case -1410812011:
                case 1567507627:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-26319)) ^ 1528280138;
                        i6 = -247063379;
                    } else {
                        iM3169 = C0773.m3169("ۨۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20965)) ^ 1344994264;
                        i6 = -2136174009;
                    }
                    break;
                case -1402284103:
                case 1742091511:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩹") ^ i4) * 21;
                        i5 = ((iM3169 ^ i3) * 30531) ^ 1399791729;
                        i6 = -1632247866;
                    } else {
                        iM3169 = (C0773.m3169("۫ۚ") + i4) * 87;
                        i5 = ((iM3169 ^ i3) * 30585) ^ 365168073;
                        i6 = -2021170951;
                    }
                    break;
                case -1145224546:
                case 1219727792:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩹") ^ i4) * 21;
                        i5 = ((iM3169 ^ i3) * 30531) ^ 1399791729;
                        i6 = -1632247866;
                    } else {
                        iM3169 = C0619.m2761("ᩴܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-9855)) ^ (-1156691363);
                        i6 = -1947116125;
                    }
                    break;
                case -1113748241:
                case 1171693808:
                    i = 15;
                    iArr = new int[15];
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-26319)) ^ 1528280138;
                        i6 = -247063379;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * 3133) ^ 991677555;
                        i6 = -1912450420;
                    }
                    break;
                case -1043869565:
                case 175464247:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("ۨۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20965)) ^ 1344994264;
                        i6 = -2136174009;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܰܳ")) * (-117);
                        i5 = ((iM3169 ^ i3) * 16933) ^ (-1127470961);
                        i6 = -2111995596;
                    }
                    break;
                case -990193188:
                case 1419417268:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩹") ^ i4) * 21;
                        i5 = ((iM3169 ^ i3) * 30531) ^ 1399791729;
                        i6 = -1632247866;
                    } else {
                        iM3169 = C0773.m3169("ۨۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20965)) ^ 1344994264;
                        i6 = -2136174009;
                    }
                    break;
                case -524420094:
                case -96751861:
                    C0773.m3161();
                    RunnableC3055.m9933();
                    iM3169 = C0773.m3169("ۨܰ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-18123)) ^ 1061188968;
                    i6 = 1511953472;
                    break;
                case -256535379:
                case 1154774171:
                    int[] iArr2 = new int[i];
                    // fill-array-data instruction
                    iArr2[0] = 2131889452;
                    iArr2[1] = 2131889458;
                    iArr2[2] = 2131889459;
                    iArr2[3] = 2131889460;
                    iArr2[4] = 2131889461;
                    iArr2[5] = 2131889462;
                    iArr2[6] = 2131889463;
                    iArr2[7] = 2131889464;
                    iArr2[8] = 2131889465;
                    iArr2[9] = 2131889453;
                    iArr2[10] = 2131889454;
                    iArr2[11] = 2131889455;
                    iArr2[12] = 2131889456;
                    iArr2[13] = 2131889457;
                    iArr2[14] = 2131889466;
                    f20233 = iArr2;
                    return;
                case -245004453:
                case 408097713:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩹") ^ i4) * 21;
                        i5 = ((iM3169 ^ i3) * 30531) ^ 1399791729;
                        i6 = -1632247866;
                    } else {
                        iM3169 = C0773.m3169("֡᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5227) ^ (-1923834919);
                        i6 = -1714036337;
                    }
                    break;
                case 129916964:
                case 460358374:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("ۨۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20965)) ^ 1344994264;
                        i6 = -2136174009;
                    } else {
                        iM3169 = C0619.m2761("᩸ۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 4783) ^ (-323628068);
                        i6 = 1070176924;
                    }
                    break;
                case 779061591:
                case 1520676679:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-26319)) ^ 1528280138;
                        i6 = -247063379;
                    } else {
                        iM3169 = C0773.m3169("᩻ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17673) ^ 206750986;
                        i6 = -309099976;
                    }
                    break;
                case 1016998010:
                case 2025960291:
                    f20232 = iArr;
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0773.m3169("ܿ֡") ^ i4) * (-25);
                        i5 = ((iM3169 ^ i3) * 21433) ^ 1041303750;
                        i6 = 1512996316;
                    } else {
                        iM3169 = C0619.m2761("ܽ۬") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2541)) ^ (-231109121);
                        i6 = -989164243;
                    }
                    break;
                case 1165101675:
                case 1872869319:
                    C11235.m28309();
                    throw new RuntimeException();
                default:
                    C1146.m4231();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۨۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20965)) ^ 1344994264;
                        i6 = -2136174009;
                    } else {
                        iM3169 = C0773.m3169("ۨܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-18123)) ^ 1061188968;
                        i6 = 1511953472;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public void m17165() {
        /*
            Method dump skipped, instruction units count: 2130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC5914.m17165():void");
    }
}
