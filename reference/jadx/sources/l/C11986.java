package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFloatingMenu;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.editor.TextEditorToolMenu;
import bin.mt.plugin.api.preference.PluginPreference;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۨ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J2SS */
/* JADX INFO: loaded from: classes.dex */
public final class C11986 {

    /* JADX INFO: renamed from: ܺۢ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f40134;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C14690 f40135;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f40136;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f40137;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f40138;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f40139;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f40140;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f40141;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f40142;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f40143;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f40144;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2455 f40145;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f40146;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10659 f40147;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Drawable f40148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f40149;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f40150;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f40151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f40152;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f40153;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f40154;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f40157;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f40158;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f40159;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m29806();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m29818(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29829() {
        this.f40150 = false;
        this.f40140 = null;
        m29813();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m29844() {
        short s = f40134[963];
        int i = (s * 26624) - ((s * s) + 177209344) > 0 ? 37465 : 51220;
        synchronized (this) {
            if (this.f40139) {
                return this.f40148;
            }
            this.f40139 = true;
            Bitmap bitmapM29803 = m29803(m29805());
            if (bitmapM29803 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapM29803);
                this.f40148 = bitmapDrawable;
                return bitmapDrawable;
            }
            Drawable drawableM39263 = C16737.m39263(ThreadFactoryC3888.m11306(RunnableC1564.m5344(f40134, 964, 3, i)) ^ 2097760420);
            this.f40148 = drawableM39263;
            return drawableM39263;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۖۢ᩺, l.ۧ֨ۘ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29813() {
        Object obj = null;
        ?? r1 = 0;
        int i = 1526990948;
        int i2 = C3535.f13026;
        int i3 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 29857) ^ 1157335465;
        int i5 = -606277951;
        while (true) {
            i = ((((i ^ i3) * 12453) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2143732222:
                case 1958936866:
                    if (obj instanceof C2455) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩶") + i3) * (-91);
                        i4 = ((iM11306 ^ i2) * (-26423)) ^ 708511101;
                        i5 = 1408314124;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12071)) ^ 1037571273;
                        i5 = -231164976;
                    }
                    break;
                case -2076205628:
                case 708070694:
                    obj = this.f40143;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5399) ^ 1878090465;
                        i5 = 1102939412;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩷") ^ i2) * (-97);
                        i4 = ((iM11306 ^ i3) * (-549)) ^ (-970376094);
                        i5 = 1638552945;
                    }
                    break;
                case -2043313912:
                case 900753222:
                    C0050.m944((Closeable) obj);
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26545)) ^ (-906847017);
                        i5 = 1348293069;
                    }
                    break;
                case -1859044020:
                case 604074284:
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14193) ^ 574300157;
                        i5 = 1077857161;
                    } else {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    }
                    break;
                case -1760027544:
                case 264089785:
                    this.f40143 = this.f40149;
                    iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-12071)) ^ 1037571273;
                    i5 = -231164976;
                    break;
                case -1752940162:
                case -1145679426:
                    C0050.m944(this.f40145);
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("᩷ۚ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-28991)) ^ 1272440979;
                        i5 = -511969614;
                    } else {
                        iM11306 = C19806.m45029("ۜܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3309)) ^ 1839483539;
                        i5 = -2116227485;
                    }
                    break;
                case -1433456045:
                case 458471666:
                    if (C10634.m26820()) {
                        iM11306 = C19806.m45029("ۨ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14193) ^ 574300157;
                        i5 = 1077857161;
                    } else {
                        iM11306 = C19806.m45029("ۧᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7203) ^ (-2144417734);
                        i5 = 166848328;
                    }
                    break;
                case -1085430321:
                case 909295646:
                    C2704.m8255();
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12925) ^ (-407412208);
                        i5 = 1184433289;
                    }
                    break;
                case -1076087877:
                case 629281397:
                    C3743.m10966();
                    iM11306 = C19806.m45029("ܶۘ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                    i5 = 387605857;
                    break;
                case -1046784464:
                case 296122829:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5399) ^ 1878090465;
                        i5 = 1102939412;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7383) ^ (-551495705);
                        i5 = -818929562;
                    }
                    break;
                case -897948496:
                case 1585203303:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("᩷ۚ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-28991)) ^ 1272440979;
                        i5 = -511969614;
                    } else {
                        iM11306 = C19806.m45029("᩶᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26275)) ^ 1161554115;
                        i5 = -1357977689;
                    }
                    break;
                case -894337011:
                case 1496585487:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    } else {
                        iM11306 = C19806.m45029("ۢܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16309)) ^ (-1920707227);
                        i5 = 1081391945;
                    }
                    break;
                case -463463188:
                case 396513999:
                    r1 = 0;
                    r1 = 0;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩷ۚ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-28991)) ^ 1272440979;
                        i5 = -511969614;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * (-16441)) ^ (-229261745);
                        i5 = -2063584902;
                    }
                    break;
                case 116423863:
                case 1861143834:
                    this.f40145 = r1;
                    this.f40147 = r1;
                    break;
                case 427418862:
                case 1616866715:
                    C0050.m946();
                    if (C7105.f23796 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5399) ^ 1878090465;
                        i5 = 1102939412;
                    } else {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    }
                    break;
                case 447887271:
                case 1224392476:
                    C3743.m10966();
                    break;
                case 529816523:
                case 1956914826:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = C19806.m45029("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-721563436);
                        i5 = 387605857;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֡ᩳ")) * (-61);
                        i4 = ((iM11306 ^ i2) * 32567) ^ (-1748545024);
                        i5 = 63001668;
                    }
                    break;
                default:
                    if (C0050.m946() <= 0) {
                        iM11306 = (C19806.m45029("᩷ۚ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-28991)) ^ 1272440979;
                        i5 = -511969614;
                    } else {
                        iM11306 = (C19806.m45029("ܽ֫") ^ i2) * (-19);
                        i4 = ((iM11306 ^ i3) * (-13727)) ^ (-129689133);
                        i5 = -1769156193;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m29827() {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int iM11307;
        int i4;
        int i5;
        C11986 c11986 = this;
        int i6 = C1189.f5284;
        int i7 = C3660.f13403;
        int iM450210 = C19806.m45029("᩺ᩴ") ^ i7;
        int i8 = ((iM450210 ^ i6) * 17729) ^ 1755500845;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = iM450210 ^ 1908127193;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1621564379;
        short[] sArr5 = null;
        C2455 c2455M29805 = null;
        while (true) {
            i23 = i9 ^ (i8 & (((i23 ^ i6) * (-15861)) >> 31));
            switch (i23) {
                case -2130004393:
                case -1099195625:
                    sArr = sArr;
                    int i24 = i21 + i22;
                    if ((i24 + i24) - i20 < 0) {
                        iM45029 = (i6 - C19806.m45029("ۢ۠")) * (-93);
                        i = ((iM45029 ^ i7) * (-26263)) ^ (-719393775);
                        i2 = 261071236;
                    } else {
                        iM45029 = (C19806.m45029("ܺ֫") + i7) * 65;
                        i = ((iM45029 ^ i6) * (-22807)) ^ (-783452441);
                        i2 = 2094160710;
                    }
                    int i25 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i25;
                    i8 = i;
                    break;
                case -1897942052:
                case -727445022:
                    sArr = sArr;
                    s = sArr5[c];
                    if (C0278.f1572 <= 0) {
                        iM11307 = C19806.m45029("ܳۙ") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-25711)) ^ 1317815285;
                        i4 = -1552808351;
                    } else {
                        iM11307 = (C19806.m45029("ܶ֫") ^ i7) * (-35);
                        i8 = ((iM11307 ^ i6) * 17621) ^ (-1086978241);
                        i4 = 1386224835;
                    }
                    i5 = iM11307 ^ i4;
                    sArr = sArr;
                    i9 = i5;
                    c11986 = this;
                    break;
                case -1660795841:
                case -576817785:
                    if (!C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i7) * (-61);
                        i = ((iM11306 ^ i6) * 28719) ^ 1584221910;
                        i3 = -2058330000;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        iM11307 = C19806.m45029("ܳۙ") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-25711)) ^ 1317815285;
                        i4 = -1552808351;
                        i5 = iM11307 ^ i4;
                        sArr = sArr;
                        i9 = i5;
                        c11986 = this;
                    }
                    break;
                case -1509029688:
                case 1213604456:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455M29805, C1937.m6288(sArr3, i11, i12, i15)) != null) {
                        iM11306 = (i6 - C19806.m45029("ܶ᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i7) * (-17899)) ^ (-1078942507);
                        i3 = -1504809265;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    }
                    sArr = sArr;
                    iM45029 = C19806.m45029("֡֫") ^ i7;
                    i = ((iM45029 ^ i6) * 11017) ^ (-1934071848);
                    i2 = 1321903551;
                    int i26 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i26;
                    i8 = i;
                    break;
                case -1495219700:
                case 1143602240:
                    C2332.m7079();
                    C2477.m7593();
                    return null;
                case -1441729606:
                case 77266039:
                    sArr3 = f40134;
                    i11 = 929;
                    i12 = 17;
                    if (C3660.f13403 < 0) {
                        iM11306 = C19806.m45029("ܰ۟") ^ i7;
                        i = ((iM11306 ^ i6) * 17531) ^ (-1069579633);
                        i3 = 832621604;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        int iM450211 = C19806.m45029("ܺۡ") ^ i6;
                        i8 = ((iM450211 ^ i7) * (-31157)) ^ (-608118283);
                        i9 = iM450211 ^ 940975786;
                        c11986 = this;
                    }
                    break;
                case -1269767282:
                case 1444175123:
                    short[] sArr6 = sArr;
                    c2455M29805 = m29805();
                    if (c2455M29805 != null) {
                        int iM11308 = (ThreadFactoryC3888.m11306("᩵ۢ") + i7) * 27;
                        i8 = ((iM11308 ^ i6) * (-19957)) ^ 1596599303;
                        sArr = sArr6;
                        i9 = iM11308 ^ (-292601784);
                    } else {
                        sArr = sArr6;
                        iM45029 = C19806.m45029("֡֫") ^ i7;
                        i = ((iM45029 ^ i6) * 11017) ^ (-1934071848);
                        i2 = 1321903551;
                        int i27 = iM45029 ^ i2;
                        sArr = sArr;
                        i9 = i27;
                        i8 = i;
                    }
                    break;
                case -1227658450:
                case 1213233788:
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i7) * (-61);
                        i = ((iM11306 ^ i6) * 28719) ^ 1584221910;
                        i3 = -2058330000;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        iM11307 = C19806.m45029("ᩴ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * 26443) ^ 937727838;
                        i4 = -746286201;
                        i5 = iM11307 ^ i4;
                        sArr = sArr;
                        i9 = i5;
                        c11986 = this;
                    }
                    break;
                case -1117335906:
                case 1022657424:
                    short[] sArr7 = sArr;
                    c11986.f40138 = C2124.m6685(sArr7, i16, i17, i15);
                    sArr = sArr7;
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("۠ۤ")) * (-101);
                    i = ((iM45029 ^ i6) * 21669) ^ 1093829982;
                    i2 = 1080120779;
                    int i28 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i28;
                    i8 = i;
                    break;
                case -969400446:
                case 926932051:
                    c11986.f40138 = C2477.m7604(sArr4, i13, i14, i15);
                    sArr = sArr;
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("۠ۤ")) * (-101);
                    i = ((iM45029 ^ i6) * 21669) ^ 1093829982;
                    i2 = 1080120779;
                    int i29 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i29;
                    i8 = i;
                    break;
                case -819522438:
                case 1674674514:
                    sArr = sArr;
                    c = 903;
                    if (C10634.f36300 >= 0) {
                        iM11307 = C19806.m45029("ᩴ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * 26443) ^ 937727838;
                        i4 = -746286201;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i6;
                        i8 = ((iM11307 ^ i7) * 8845) ^ 1379636421;
                        i4 = -23448776;
                    }
                    i5 = iM11307 ^ i4;
                    sArr = sArr;
                    i9 = i5;
                    c11986 = this;
                    break;
                case -647745322:
                case 1925260566:
                    sArr = f40134;
                    i16 = 904;
                    i17 = 7;
                    if (C1025.m3861() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۗ") ^ i6;
                        i = ((iM11306 ^ i7) * (-21615)) ^ (-1452910575);
                        i3 = -853503374;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        int iM450212 = C19806.m45029("ܺۡ") ^ i6;
                        i8 = ((iM450212 ^ i7) * (-31157)) ^ (-608118283);
                        i9 = iM450212 ^ 940975786;
                        c11986 = this;
                    }
                    break;
                case -614414235:
                case 886882596:
                    if (!C0797.m3359()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i7) * (-61);
                        i = ((iM11306 ^ i6) * 28719) ^ 1584221910;
                        i3 = -2058330000;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        int iM450213 = C19806.m45029("ܺۡ") ^ i6;
                        i8 = ((iM450213 ^ i7) * (-31157)) ^ (-608118283);
                        i9 = iM450213 ^ 940975786;
                        c11986 = this;
                    }
                    break;
                case -548871015:
                case 1577755466:
                    C0797.m3359();
                    sArr = sArr;
                    iM11307 = C19806.m45029("ᩴ᩸") ^ i7;
                    i8 = ((iM11307 ^ i6) * 26443) ^ 937727838;
                    i4 = -746286201;
                    i5 = iM11307 ^ i4;
                    sArr = sArr;
                    i9 = i5;
                    c11986 = this;
                    break;
                case -459434372:
                case 580383240:
                    sArr = sArr;
                    i20 = i19 * i19;
                    i21 = s * s;
                    if (C1148.m4232() > 0) {
                        iM45029 = C19806.m45029("۫ۤ") ^ i7;
                        i = ((iM45029 ^ i6) * 7815) ^ (-307325909);
                        i2 = -388243687;
                        int i210 = iM45029 ^ i2;
                        sArr = sArr;
                        i9 = i210;
                        i8 = i;
                    } else {
                        iM11307 = C19806.m45029("ܳۙ") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-25711)) ^ 1317815285;
                        i4 = -1552808351;
                        i5 = iM11307 ^ i4;
                        sArr = sArr;
                        i9 = i5;
                        c11986 = this;
                    }
                    break;
                case -6121294:
                case 455769112:
                    i15 = 58784;
                    iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺ۬")) * q.h;
                    i = ((iM45029 ^ i7) * 22469) ^ (-650031038);
                    i2 = -1599686719;
                    int i211 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i211;
                    i8 = i;
                    break;
                case 289143864:
                case 1064281844:
                    sArr2 = f40134;
                    i18 = 911;
                    i10 = 18;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i7) * (-61);
                        i = ((iM11306 ^ i6) * 28719) ^ 1584221910;
                        i3 = -2058330000;
                    } else {
                        iM11306 = C19806.m45029("᩷᩷") ^ i6;
                        i = ((iM11306 ^ i7) * 27505) ^ (-1623937449);
                        i3 = 554290520;
                    }
                    i9 = iM11306 ^ i3;
                    i8 = i;
                    break;
                case 292404613:
                case 2138383107:
                    sArr = sArr;
                    i22 = 241429444;
                    if (C0629.f2722 > 0) {
                        iM45029 = C19806.m45029("۬ۜ") ^ i6;
                        i = ((iM45029 ^ i7) * 22291) ^ 427216230;
                        i2 = -834798506;
                        int i212 = iM45029 ^ i2;
                        sArr = sArr;
                        i9 = i212;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        int iM450214 = C19806.m45029("ܺۡ") ^ i6;
                        i8 = ((iM450214 ^ i7) * (-31157)) ^ (-608118283);
                        i9 = iM450214 ^ 940975786;
                        c11986 = this;
                    }
                    break;
                case 297484061:
                case 927578105:
                    sArr = sArr;
                    short s2 = s;
                    int i30 = s2 + 15538;
                    if (C2124.f7782 <= 0) {
                        int iM450215 = C19806.m45029("ۢ᩷") ^ i6;
                        int i31 = ((iM450215 ^ i7) * 11275) ^ (-1416264043);
                        i19 = i30;
                        sArr = sArr;
                        i9 = iM450215 ^ (-1378344861);
                        s = s2;
                        i8 = i31;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("ܶܺ") ^ i6) * (-123);
                        s = s2;
                        i8 = ((iM11309 ^ i7) * 10339) ^ (-1789985622);
                        i5 = iM11309 ^ (-357777355);
                        i19 = i30;
                        sArr = sArr;
                        i9 = i5;
                    }
                    c11986 = this;
                    break;
                case 679984402:
                case 1041804081:
                    sArr4 = f40134;
                    i13 = 946;
                    i14 = 6;
                    if (C7105.f23796 < 0) {
                        iM11306 = C19806.m45029("᩸ۤ") ^ i6;
                        i = ((iM11306 ^ i7) * (-9309)) ^ 1843748555;
                        i3 = 1199201550;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        iM11307 = C19806.m45029("ᩴ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * 26443) ^ 937727838;
                        i4 = -746286201;
                        i5 = iM11307 ^ i4;
                        sArr = sArr;
                        i9 = i5;
                        c11986 = this;
                    }
                    break;
                case 728184000:
                case 1925091842:
                    sArr = sArr;
                    if (c11986.f40138 == null) {
                        iM45029 = (C19806.m45029("ᩴᩳ") + i6) * 77;
                        i = ((iM45029 ^ i7) * 3365) ^ 550190914;
                        i2 = 1913945982;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("۠ۤ")) * (-101);
                        i = ((iM45029 ^ i6) * 21669) ^ 1093829982;
                        i2 = 1080120779;
                    }
                    int i213 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i213;
                    i8 = i;
                    break;
                case 957480765:
                case 1969878182:
                    i15 = 40639;
                    iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺ۬")) * q.h;
                    i = ((iM45029 ^ i7) * 22469) ^ (-650031038);
                    i2 = -1599686719;
                    int i214 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i214;
                    i8 = i;
                    break;
                case 1059445932:
                case 1363949961:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455M29805, AbstractC0464.m2308(sArr2, i18, i10, i15)) == null) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("۟᩸")) * (-3);
                        i = ((iM11306 ^ i6) * 11859) ^ 1909589604;
                        i3 = 1013094101;
                        i9 = iM11306 ^ i3;
                        i8 = i;
                    }
                    sArr = sArr;
                    iM45029 = C19806.m45029("֡֫") ^ i7;
                    i = ((iM45029 ^ i6) * 11017) ^ (-1934071848);
                    i2 = 1321903551;
                    int i215 = iM45029 ^ i2;
                    sArr = sArr;
                    i9 = i215;
                    i8 = i;
                    break;
                case 1607269972:
                case 1757608942:
                    return c11986.f40138;
                default:
                    sArr = sArr;
                    sArr5 = f40134;
                    if (!C0962.f3784) {
                        iM11307 = (i7 - C19806.m45029("᩷ۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM11307 ^ i6) * (-22089)) ^ (-330017735);
                        i4 = 1625400636;
                        i5 = iM11307 ^ i4;
                        sArr = sArr;
                        i9 = i5;
                        c11986 = this;
                    }
                    sArr = sArr;
                    int iM450216 = C19806.m45029("ܺۡ") ^ i6;
                    i8 = ((iM450216 ^ i7) * (-31157)) ^ (-608118283);
                    i9 = iM450216 ^ 940975786;
                    c11986 = this;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m29836() {
        int i = -1511963212;
        int i2 = C2249.f8050;
        int i3 = C3660.f13403;
        int iM11306 = ThreadFactoryC3888.m11306("ۧܳ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-26661)) ^ (-1746285763);
        int i5 = -659180534;
        while (true) {
            i = ((((i ^ i3) * 5753) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1842168213:
                case -1720856781:
                    if (C3660.m10791() != 0) {
                        iM11306 = (i2 - C19806.m45029("ܺᩴ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 22629) ^ 664024670;
                        i5 = -623313197;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ۠") + i3) * (-99);
                        i4 = ((iM11306 ^ i2) * 32115) ^ (-1236170006);
                        i5 = 364545543;
                    }
                    break;
                case -1645264526:
                case -708487542:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16933)) ^ (-95196456);
                        i5 = 146643708;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25597)) ^ (-1633580843);
                        i5 = 1605116247;
                    }
                    break;
                case -1630005713:
                case -1278160322:
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16933)) ^ (-95196456);
                        i5 = 146643708;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    }
                    break;
                case -1613779865:
                case -1318961685:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ܽᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7189) ^ (-2113439085);
                        i5 = 612239787;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-491)) ^ (-1813001463);
                        i5 = 1494120509;
                    }
                    break;
                case -1414409866:
                case 2008652320:
                    if (C2642.m8171() != 0) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = C19806.m45029("ᩳۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32231) ^ 1709412579;
                        i5 = -1105455243;
                    }
                    break;
                case -1347497823:
                case 506131707:
                    C2249.m6915();
                    if (!C0797.f3386) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = C19806.m45029("ܽᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7189) ^ (-2113439085);
                        i5 = 612239787;
                    }
                    break;
                case -1340827384:
                case 688591352:
                    return false;
                case -1301415036:
                case 1190051561:
                    if (this.f40140 != null) {
                        iM11306 = C19806.m45029("᩷᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24449) ^ 762577845;
                        i5 = -1563192391;
                    } else {
                        iM11306 = C19806.m45029("ۙۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17255)) ^ 1097040604;
                        i5 = -1096422501;
                    }
                    break;
                case -1190710223:
                case 1765330258:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܺᩴ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 22629) ^ 664024670;
                        i5 = -623313197;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶܰ")) * (-37);
                        i4 = ((iM11306 ^ i3) * 893) ^ 2008883422;
                        i5 = -169363228;
                    }
                    break;
                case -1176177201:
                case 699469049:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܺᩴ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 22629) ^ 664024670;
                        i5 = -623313197;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10815) ^ 336558340;
                        i5 = 1114357217;
                    }
                    break;
                case -1096669245:
                case -709500346:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = C19806.m45029("᩸۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 403) ^ (-439824162);
                        i5 = -1210453957;
                    }
                    break;
                case -1004459213:
                case -928324183:
                    if (this.f40150) {
                        iM11306 = C19806.m45029("ۤܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4179) ^ (-1493272332);
                        i5 = 1913550372;
                    } else {
                        iM11306 = C19806.m45029("ۙۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17255)) ^ 1097040604;
                        i5 = -1096422501;
                    }
                    break;
                case -964656082:
                case -376818504:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-23459)) ^ 643676850;
                        i5 = 1535847878;
                    }
                    break;
                case -924970682:
                case 2076140445:
                    C1977.m6356();
                    iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                    i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                    i5 = 1970284875;
                    break;
                case -800884125:
                case 897514532:
                    return true;
                case -23236170:
                case 265309462:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27523)) ^ 1175489734;
                        i5 = 688715283;
                    }
                    break;
                case 335938540:
                case 1806466375:
                    C1189.m4368();
                    return false;
                case 416692297:
                case 1338117236:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ۚۘ")) * 87;
                        i4 = ((iM11306 ^ i3) * (-26905)) ^ 934030359;
                        i5 = 1970284875;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3819) ^ 671983139;
                        i5 = 1056898108;
                    }
                    break;
                default:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i2 - C19806.m45029("ܺᩴ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 22629) ^ 664024670;
                        i5 = -623313197;
                    } else {
                        iM11306 = C19806.m45029("ۙܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22919)) ^ (-505107546);
                        i5 = 782880499;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m29838() {
        int i = 0;
        int i2 = 0;
        int i3 = -1924581048;
        int i4 = C2871.f10837;
        int i5 = C1025.f4800;
        int iM45029 = (C19806.m45029("ᩳ᩶") + i4) * (-5);
        int i6 = ((iM45029 ^ i5) * 24455) ^ 1615853591;
        int i7 = 1355989519;
        while (true) {
            i3 = ((((i3 ^ i5) * 30865) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2144605533:
                case 320984257:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i4) * 55;
                        i6 = ((iM45029 ^ i5) * 11867) ^ 237010666;
                        i7 = 993257585;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩻") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-26719)) ^ 1589119241;
                        i7 = -1548928610;
                    }
                    break;
                case -2059542552:
                case -1829547429:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") ^ i5) * 91;
                        i6 = ((iM45029 ^ i4) * 9777) ^ 2046110738;
                        i7 = 80489013;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-12341)) ^ 931815670;
                        i7 = -1346763409;
                    }
                    break;
                case -2036179844:
                case 1773935015:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-18361)) ^ 2117788893;
                        i7 = 803036616;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") ^ i5) * 91;
                        i6 = ((iM45029 ^ i4) * 9777) ^ 2046110738;
                        i7 = 80489013;
                    }
                    break;
                case -1885060474:
                case -1734353917:
                    if (C2477.m7593() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-3217)) ^ 822412085;
                        i7 = 272894217;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۡ᩺")) * (-53);
                        i6 = ((iM45029 ^ i4) * (-20027)) ^ (-598375251);
                        i7 = 1308339726;
                    }
                    break;
                case -1125604997:
                case -772941478:
                    i = this.f40156;
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۨ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-20669)) ^ (-2142069083);
                        i7 = -222831746;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۤ᩶")) * (-43);
                        i6 = ((iM45029 ^ i5) * (-375)) ^ 39012016;
                        i7 = 2121365252;
                    }
                    break;
                case -1123177464:
                case -1057679255:
                    C0526.m2437();
                    C1066.m4023();
                    iM45029 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i4) * 55;
                    i6 = ((iM45029 ^ i5) * 11867) ^ 237010666;
                    i7 = 993257585;
                    break;
                case -1012178953:
                case 485269846:
                    i2 = this.f40144;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۨ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-20669)) ^ (-2142069083);
                        i7 = -222831746;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۤ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 25267) ^ (-2136302272);
                        i7 = -489800803;
                    }
                    break;
                case -570673909:
                case 708350667:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-3217)) ^ 822412085;
                        i7 = 272894217;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i4) * 55;
                        i6 = ((iM45029 ^ i5) * 11867) ^ 237010666;
                        i7 = 993257585;
                    }
                    break;
                case -559514580:
                case 953491627:
                    if (!C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") ^ i5) * 91;
                        i6 = ((iM45029 ^ i4) * 9777) ^ 2046110738;
                        i7 = 80489013;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-3217)) ^ 822412085;
                        i7 = 272894217;
                    }
                    break;
                case -267440487:
                case 722184005:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 10493) ^ (-1513372752);
                        i7 = 1817608608;
                    } else {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 14941) ^ (-810971744);
                        i7 = 1111596536;
                    }
                    break;
                case -9676408:
                case 1895124929:
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("ܿ᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-15715)) ^ (-1479114989);
                        i7 = -1711583535;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 10493) ^ (-1513372752);
                        i7 = 1817608608;
                    }
                    break;
                case 491450862:
                case 1388109506:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 10493) ^ (-1513372752);
                        i7 = 1817608608;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩸") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM45029 ^ i5) * (-10991)) ^ 1019020435;
                        i7 = 1256954253;
                    }
                    break;
                case 534916837:
                case 847189175:
                    return m29797(i, i2, this.f40153);
                case 960264916:
                case 1257731710:
                    C3535.m10431();
                    C1668.m5583();
                    return null;
                case 999466811:
                case 1931229071:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۨ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-20669)) ^ (-2142069083);
                        i7 = -222831746;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܺ") ^ i4) * 37;
                        i6 = ((iM45029 ^ i5) * (-2879)) ^ 115305976;
                        i7 = 527230881;
                    }
                    break;
                default:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C10634.f36300 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 10493) ^ (-1513372752);
                        i7 = 1817608608;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-3217)) ^ 822412085;
                        i7 = 272894217;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x011d A[PHI: r1
      0x011d: PHI (r1v3 java.util.ArrayList) = (r1v2 java.util.ArrayList), (r1v4 java.util.ArrayList) binds: [B:47:0x011b, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x014d A[PHI: r0
      0x014d: PHI (r0v5 boolean) = (r0v2 boolean), (r0v4 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:51:0x014b, B:39:0x00e6, B:16:0x0050, B:13:0x0045, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0177 A[PHI: r8
      0x0177: PHI (r8v6 java.lang.Object) = (r8v4 java.lang.Object), (r8v5 java.lang.Object), (r8v4 java.lang.Object) binds: [B:55:0x0175, B:27:0x0077, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public C11986() {
        int iM11306;
        int i;
        boolean z = false;
        ArrayList arrayList = null;
        int i2 = 1616157536;
        int i3 = C3722.f13525;
        int i4 = C10634.f36300;
        int iM11307 = (ThreadFactoryC3888.m11306("ۜ۟") ^ i3) * (-17);
        int i5 = ((iM11307 ^ i4) * 1301) ^ (-1659962107);
        int i6 = 747925267;
        while (true) {
            int i7 = iM11307 ^ i6;
            Object obj = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 16465) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1494200546:
                    case 1482067661:
                        arrayList = new ArrayList();
                        if (C1668.f6641 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙۗ") ^ i3) * (-67);
                            i5 = ((iM11306 ^ i4) * 22003) ^ (-1543791680);
                            i = 1582141195;
                        } else {
                            iM11306 = (C19806.m45029("ܳۚ") + i3) * (-39);
                            i5 = ((iM11306 ^ i4) * 3613) ^ 374930136;
                            i = -412874644;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1381734702:
                    case 1904576447:
                        C1875.m6086();
                        if (C3535.f13026 <= 0) {
                            iM11306 = C19806.m45029("᩶ۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 31685) ^ 1521130106;
                            i = 332522357;
                        } else {
                            iM11306 = (C19806.m45029("ۧܽ") + i4) * (-99);
                            i5 = ((iM11306 ^ i3) * (-26791)) ^ 1336293774;
                            i = 432707885;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1362724139:
                    case -1271715385:
                        this.f40159 = arrayList;
                        if (C3577.f13150 < 0) {
                            obj = new Object();
                            if (C3577.f13150 >= 0) {
                                iM11306 = (C19806.m45029("ۧܽ") + i4) * (-99);
                                i5 = ((iM11306 ^ i3) * (-26791)) ^ 1336293774;
                                i = 432707885;
                            } else {
                                iM11306 = C19806.m45029("᩵۬") ^ i4;
                                i5 = ((iM11306 ^ i3) * 2687) ^ (-716342962);
                                i = -1017306035;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1310960656:
                    case -221172236:
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = C19806.m45029("᩶ۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 31685) ^ 1521130106;
                            i = 332522357;
                        } else {
                            iM11306 = C19806.m45029("ۡᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 6111) ^ (-214324359);
                            i = 1968677946;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1033979464:
                    case 2041353474:
                        this.f40144 = z ? 1 : 0;
                        if (C7105.f23796 >= 0) {
                            iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 7877) ^ (-295045189);
                            i = 153398222;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷᩸")) * (-37);
                            i5 = ((iM11306 ^ i3) * (-24889)) ^ 1463632159;
                            i = 1016554947;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -856472539:
                    case 2086331185:
                        this.f40149 = obj;
                        this.f40139 = z;
                        return;
                    case -456240131:
                    case 1266454942:
                        C1377.m4833();
                        if (C2477.m7593() >= 0) {
                            iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 7877) ^ (-295045189);
                            i = 153398222;
                        } else {
                            iM11306 = C19806.m45029("᩶ۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 31685) ^ 1521130106;
                            i = 332522357;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -399638186:
                    case 744072951:
                        C1025.m3861();
                        throw new RuntimeException();
                    case -46769760:
                    case 1214532112:
                        if (C1398.f5802 <= 0) {
                            iM11306 = (C19806.m45029("ۧܽ") + i4) * (-99);
                            i5 = ((iM11306 ^ i3) * (-26791)) ^ 1336293774;
                            i = 432707885;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۢۘ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 28239) ^ 1657027245;
                            i = -1801275364;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -16106960:
                    case 140036514:
                        z = false;
                        z = false;
                        if (C0817.m3399()) {
                            iM11306 = C19806.m45029("᩷᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-24047)) ^ 418335801;
                            i = -417087360;
                        } else {
                            iM11306 = C19806.m45029("᩶ۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 31685) ^ 1521130106;
                            i = 332522357;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 299505617:
                    case 976397751:
                        if (C2124.f7782 > 0) {
                            iM11306 = (C19806.m45029("ܽ᩶") ^ i4) * (-5);
                            i5 = ((iM11306 ^ i3) * 12787) ^ (-1515852346);
                            i = -1142823754;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case 443167660:
                    case 917303180:
                        C3743.m10966();
                        C1460.m5050();
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7877) ^ (-295045189);
                        i = 153398222;
                        i7 = iM11306 ^ i;
                        break;
                    case 716272822:
                    case 1344896082:
                        if (C3660.f13403 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙۗ") ^ i3) * (-67);
                            i5 = ((iM11306 ^ i4) * 22003) ^ (-1543791680);
                            i = 1582141195;
                        } else {
                            iM11306 = (C19806.m45029("᩶ܳ") + i4) * 29;
                            i5 = ((iM11306 ^ i3) * (-18593)) ^ (-393199544);
                            i = -1713573633;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 964054928:
                    case 1688038353:
                        C3535.m10431();
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        }
                        iM11306 = C19806.m45029("᩶ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 31685) ^ 1521130106;
                        i = 332522357;
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        this.f40153 = 21;
                        if (!C0797.f3386) {
                            iM11306 = (C19806.m45029("᩸ۨ") + i4) * (-39);
                            i5 = ((iM11306 ^ i3) * (-25747)) ^ 2058939189;
                            i = 411640835;
                            i7 = iM11306 ^ i;
                        }
                        break;
                }
            }
            iM11307 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
            i5 = ((iM11307 ^ i3) * 3205) ^ 1429414936;
            i6 = 1539994328;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29837() {
        m29813();
        this.f40143 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (l.C3577.f13150 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29802(l.C2455 r26) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29802(l.ۖۢ᩺):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0450 A[PHI: r2 r6 r17 r18 r22 r27 r28
      0x0450: PHI (r2v24 int) = (r2v10 int), (r2v19 int), (r2v23 int), (r2v27 int) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r22v3 short) = (r22v2 short), (r22v2 short), (r22v2 short), (r22v5 short) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r27v22 int) = (r27v9 int), (r27v18 int), (r27v21 int), (r27v25 int) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r28v20 l.ۛᩳۨ) = (r28v6 l.ۛᩳۨ), (r28v15 l.ۛᩳۨ), (r28v19 l.ۛᩳۨ), (r28v22 l.ۛᩳۨ) binds: [B:100:0x044e, B:15:0x0094, B:20:0x00be, B:6:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29796(int i) {
        C6222 c6222;
        int iM11306;
        int i2;
        int i3;
        int iM11307;
        int i4;
        C6222 c6223;
        int iM45029;
        int i5;
        int i6;
        C6222 c6224;
        int i7 = 431239372;
        int i8 = C0050.f912;
        int i9 = C1668.f6641;
        int iM11308 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i8;
        int i10 = ((iM11308 ^ i9) * (-23685)) ^ 20024324;
        int i11 = iM11308 ^ (-262232245);
        String strGroup = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = 0;
        C6222 c6222Matcher = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s2 = 0;
        int i21 = 0;
        short[] sArr4 = null;
        String strM931 = null;
        String strM8640 = null;
        String strGroup2 = null;
        int i22 = 0;
        while (true) {
            i7 = i11 ^ ((((i7 ^ i9) * 89) >> 31) & i10);
            switch (i7) {
                case -2142237350:
                case -1409207435:
                    i12 = i12;
                    c6223 = c6222Matcher;
                    i13 = 1;
                    strGroup = c6223.group(1);
                    C1419.m4970(strGroup);
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i5 = ((iM45029 ^ i9) * (-13811)) ^ (-250017902);
                        i6 = 1655253563;
                    } else {
                        iM45029 = (C19806.m45029("᩹۠") + i9) * 83;
                        i5 = ((iM45029 ^ i8) * 26815) ^ 2055313701;
                        i6 = -8472719;
                    }
                    int i23 = i12;
                    i11 = iM45029 ^ i6;
                    i12 = i23;
                    int i24 = i5;
                    c6222Matcher = c6223;
                    i10 = i24;
                    break;
                case -2092000971:
                case -1828825754:
                    c6222 = c6222Matcher;
                    if (C3535.m10420(strGroup2, C3743.m10964(sArr, i16, i17, i14))) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۬") ^ i8;
                        i2 = ((iM11306 ^ i9) * 30461) ^ (-427194493);
                        i3 = 2104887534;
                    } else {
                        strM931 = strGroup2;
                        iM11306 = C19806.m45029("᩷֫") ^ i8;
                        i2 = ((iM11306 ^ i9) * (-6707)) ^ 1492920808;
                        i3 = 1926018538;
                    }
                    c6224 = c6222;
                    i11 = iM11306 ^ i3;
                    i10 = i2;
                    c6222Matcher = c6224;
                    break;
                case -1971518085:
                case 2143720376:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    int i25 = i18 + i19;
                    i20 = i25 + i25;
                    s = 12613;
                    if (C1148.f5161 > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩹ܽ") + i9) * 73;
                        i10 = ((iM11307 ^ i8) * (-6825)) ^ (-2047728409);
                        i4 = -789306179;
                        int i26 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i27 = i12;
                        i11 = i26;
                        i12 = i27;
                    } else {
                        i12 = i12;
                        int iM450210 = (C19806.m45029("֡ۢ") ^ i9) * 49;
                        i11 = iM450210 ^ (-2122460005);
                        i10 = ((iM450210 ^ i8) * 1377) ^ (-1573284881);
                        i12 = i12;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                    }
                    break;
                case -1869355588:
                case 139382550:
                    c6222 = c6222Matcher;
                    strM8640 = C2871.m8640(sArr2, i15, i12, i14);
                    sArr3 = f40134;
                    if (AbstractC0464.m2313() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i8;
                        i2 = ((iM11306 ^ i9) * 8985) ^ (-2049482631);
                        i3 = -1483737259;
                        c6224 = c6222;
                        i11 = iM11306 ^ i3;
                        i10 = i2;
                        c6222Matcher = c6224;
                    } else {
                        i21 = i21;
                        c6222Matcher = c6222;
                        i12 = i12;
                        iM11307 = (ThreadFactoryC3888.m11306("ᩳۜ") ^ i9) * 109;
                        i10 = ((iM11307 ^ i8) * (-8111)) ^ 1028927142;
                        i4 = -1673167637;
                        int i28 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i29 = i12;
                        i11 = i28;
                        i12 = i29;
                    }
                    break;
                case -1784008382:
                case 81485729:
                    i12 = i12;
                    c6222Matcher = f40135.matcher((CharSequence) C0817.m3410(i));
                    if (i >= 26040000) {
                        int iM450211 = C19806.m45029("֡ۜ") ^ i9;
                        i10 = ((iM450211 ^ i8) * 8975) ^ 1985240361;
                        i12 = i12;
                        i11 = iM450211 ^ (-634730912);
                        i21 = 26040000;
                    } else {
                        i21 = 26040000;
                        int iM11309 = ThreadFactoryC3888.m11306("ۚ۠") ^ i8;
                        c6222Matcher = c6222Matcher;
                        i12 = i12;
                        i11 = iM11309 ^ (-1690861756);
                        i10 = ((iM11309 ^ i9) * (-2921)) ^ 1568778866;
                        c6222Matcher = c6222Matcher;
                    }
                    break;
                case -1647754398:
                case 976159092:
                    i14 = 37870;
                    iM11307 = C19806.m45029("ۗۚ") ^ i8;
                    i10 = ((iM11307 ^ i9) * (-22903)) ^ (-1128711059);
                    i4 = 555240924;
                    int i210 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i211 = i12;
                    i11 = i210;
                    i12 = i211;
                    break;
                case -1607818590:
                case -1133050519:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    sArr4 = f40134;
                    c = 'O';
                    if (C1460.f5948 >= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") + i9) * (-121);
                        i10 = ((iM11307 ^ i8) * 14753) ^ 1165942710;
                        i4 = 364892369;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿۨ") ^ i9;
                        i10 = ((iM11307 ^ i8) * 5511) ^ 346982563;
                        i4 = -940134853;
                    }
                    int i212 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i213 = i12;
                    i11 = i212;
                    i12 = i213;
                    break;
                case -1574830269:
                case -341434328:
                    return C7997.m21055(strM8640, strGroup, C3743.m10964(sArr3, 89, 1, i14), strM931);
                case -1440402696:
                case 1180514431:
                    c6223 = c6222Matcher;
                    strGroup2 = c6223.group(i22);
                    C1419.m4970(strGroup2);
                    if (C1189.f5284 > 0) {
                        int iM113010 = (ThreadFactoryC3888.m11306("۟ۘ") + i8) * (-25);
                        c6224 = c6223;
                        i10 = ((iM113010 ^ i9) * (-30585)) ^ 1809716947;
                        i12 = i12;
                        i11 = iM113010 ^ (-843787117);
                        c6222Matcher = c6224;
                    } else {
                        i12 = i12;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i5 = ((iM45029 ^ i9) * (-13811)) ^ (-250017902);
                        i6 = 1655253563;
                        int i214 = i12;
                        i11 = iM45029 ^ i6;
                        i12 = i214;
                        int i215 = i5;
                        c6222Matcher = c6223;
                        i10 = i215;
                    }
                    break;
                case -1317851255:
                case -502421018:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    int i30 = s2 + s;
                    if (i20 - (i30 * i30) >= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܿۧ") ^ i8) * 7;
                        i10 = ((iM11307 ^ i9) * (-18185)) ^ 948728929;
                        i4 = 2091920781;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֫᩷") ^ i9;
                        i10 = ((iM11307 ^ i8) * (-12423)) ^ (-1821745466);
                        i4 = -1386928185;
                    }
                    int i216 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i217 = i12;
                    i11 = i216;
                    i12 = i217;
                    break;
                case -1102077507:
                case 1055200797:
                    c6222 = c6222Matcher;
                    sArr2 = f40134;
                    i15 = 87;
                    i12 = 2;
                    if (C0278.f1572 > 0) {
                        iM11306 = C19806.m45029("ۖܿ") ^ i9;
                        i2 = ((iM11306 ^ i8) * 15611) ^ 1747710973;
                        i3 = 132764170;
                        c6224 = c6222;
                        i11 = iM11306 ^ i3;
                        i10 = i2;
                        c6222Matcher = c6224;
                    } else {
                        i21 = i21;
                        c6222Matcher = c6222;
                        int iM450212 = (C19806.m45029("֡ۢ") ^ i9) * 49;
                        i11 = iM450212 ^ (-2122460005);
                        i10 = ((iM450212 ^ i8) * 1377) ^ (-1573284881);
                        i12 = i12;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                    }
                    break;
                case -1017739282:
                case -23710274:
                    return C0817.m3410(i);
                case -772070234:
                case 1831997148:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    if (i != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۬ܽ") ^ i9) * (-5);
                        i10 = ((iM11307 ^ i8) * (-30247)) ^ 202579026;
                        i4 = -1623771080;
                        int i218 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i219 = i12;
                        i11 = i218;
                        i12 = i219;
                    } else {
                        int iM450213 = (C19806.m45029("۟ۖ") + i9) * (-7);
                        int i31 = ((iM450213 ^ i8) * (-2303)) ^ (-2021951852);
                        int i32 = iM450213 ^ 807477126;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        i10 = i31;
                        i12 = i12;
                        i11 = i32;
                    }
                    break;
                case -685949471:
                case 519084965:
                    i12 = i12;
                    C6222 c6225 = c6222Matcher;
                    i21 = i21;
                    if (i >= i21) {
                        int iM113011 = ThreadFactoryC3888.m11306("ۨۧ") ^ i8;
                        c6222Matcher = c6225;
                        i10 = ((iM113011 ^ i9) * (-7433)) ^ 456556853;
                        i12 = i12;
                        i11 = iM113011 ^ (-1296273246);
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                    } else {
                        c6222Matcher = c6225;
                        int iM450214 = (C19806.m45029("۟ۖ") + i9) * (-7);
                        int i33 = ((iM450214 ^ i8) * (-2303)) ^ (-2021951852);
                        int i34 = iM450214 ^ 807477126;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        i10 = i33;
                        i12 = i12;
                        i11 = i34;
                    }
                    break;
                case -553364028:
                case 1297129380:
                    i12 = i12;
                    c6223 = c6222Matcher;
                    if (!c6223.matches()) {
                        c6222Matcher = c6223;
                        int iM113012 = ThreadFactoryC3888.m11306("ۚ۠") ^ i8;
                        c6222Matcher = c6222Matcher;
                        i12 = i12;
                        i11 = iM113012 ^ (-1690861756);
                        i10 = ((iM113012 ^ i9) * (-2921)) ^ 1568778866;
                        c6222Matcher = c6222Matcher;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩷") ^ i8) * (-81);
                        i5 = ((iM45029 ^ i9) * (-3417)) ^ 1452814372;
                        i6 = 1251046935;
                        int i2110 = i12;
                        i11 = iM45029 ^ i6;
                        i12 = i2110;
                        int i2111 = i5;
                        c6222Matcher = c6223;
                        i10 = i2111;
                    }
                    break;
                case -493243613:
                case 140551433:
                    i12 = i12;
                    c6223 = c6222Matcher;
                    i22 = 2;
                    if (C2788.m8472() == 0) {
                        iM45029 = C19806.m45029("᩸᩵") ^ i9;
                        i5 = ((iM45029 ^ i8) * (-28035)) ^ (-1200974470);
                        i6 = -786130403;
                        int i2112 = i12;
                        i11 = iM45029 ^ i6;
                        i12 = i2112;
                        int i2113 = i5;
                        c6222Matcher = c6223;
                        i10 = i2113;
                    } else {
                        c6222Matcher = c6223;
                        i21 = i21;
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") + i9) * (-121);
                        i10 = ((iM11307 ^ i8) * 14753) ^ 1165942710;
                        i4 = 364892369;
                        int i2114 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i2115 = i12;
                        i11 = i2114;
                        i12 = i2115;
                    }
                    break;
                case -492487051:
                case 1766769246:
                    if (!C2704.f10408) {
                        c6222Matcher = c6222Matcher;
                        i21 = i21;
                        int iM450215 = (C19806.m45029("֡ۢ") ^ i9) * 49;
                        i11 = iM450215 ^ (-2122460005);
                        i10 = ((iM450215 ^ i8) * 1377) ^ (-1573284881);
                        i12 = i12;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                    } else {
                        i12 = i12;
                        c6223 = c6222Matcher;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i5 = ((iM45029 ^ i9) * (-13811)) ^ (-250017902);
                        i6 = 1655253563;
                        int i2116 = i12;
                        i11 = iM45029 ^ i6;
                        i12 = i2116;
                        int i2117 = i5;
                        c6222Matcher = c6223;
                        i10 = i2117;
                    }
                    break;
                case -339961024:
                case 1266105841:
                    return ThreadFactoryC3888.m11312(f40134, 80, 6, i14);
                case 237977271:
                case 2132208901:
                    C0817.m3399();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return null;
                case 431041017:
                case 1114985527:
                    c6222 = c6222Matcher;
                    sArr = f40134;
                    i16 = 86;
                    i17 = 1;
                    if (!C1377.f5749) {
                        c6223 = c6222;
                        i12 = i12;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i5 = ((iM45029 ^ i9) * (-13811)) ^ (-250017902);
                        i6 = 1655253563;
                        int i2118 = i12;
                        i11 = iM45029 ^ i6;
                        i12 = i2118;
                        int i2119 = i5;
                        c6222Matcher = c6223;
                        i10 = i2119;
                    } else {
                        iM11306 = (i9 - C19806.m45029("᩷᩷")) * 75;
                        i2 = ((iM11306 ^ i8) * (-5567)) ^ 1580293317;
                        i3 = -218799213;
                        c6224 = c6222;
                        i11 = iM11306 ^ i3;
                        i10 = i2;
                        c6222Matcher = c6224;
                    }
                    break;
                case 460324281:
                case 1281265336:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    i18 = s2 * s2;
                    i19 = 159087769;
                    if (C3660.m10791() != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ᩳۜ") ^ i9) * 109;
                        i10 = ((iM11307 ^ i8) * (-8111)) ^ 1028927142;
                        i4 = -1673167637;
                    } else {
                        iM11307 = C19806.m45029("۠۟") ^ i8;
                        i10 = ((iM11307 ^ i9) * 12853) ^ (-596500004);
                        i4 = 871158180;
                    }
                    int i21110 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i21111 = i12;
                    i11 = i21110;
                    i12 = i21111;
                    break;
                case 780175505:
                case 1327646130:
                    C3577.m10565();
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("֡۟") + i8) * (-19);
                        c6222 = c6222Matcher;
                        i2 = ((iM11306 ^ i9) * (-4091)) ^ (-1570479724);
                        i3 = 1837218464;
                        c6224 = c6222;
                        i11 = iM11306 ^ i3;
                        i10 = i2;
                        c6222Matcher = c6224;
                    } else {
                        i12 = i12;
                        c6222Matcher = c6222Matcher;
                        i21 = i21;
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") + i9) * (-121);
                        i10 = ((iM11307 ^ i8) * 14753) ^ 1165942710;
                        i4 = 364892369;
                        int i21112 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i21113 = i12;
                        i11 = i21112;
                        i12 = i21113;
                    }
                    break;
                case 828131865:
                case 955613522:
                    c6222 = c6222Matcher;
                    strM931 = C0050.m931(strGroup2, i13);
                    iM11306 = C19806.m45029("᩷֫") ^ i8;
                    i2 = ((iM11306 ^ i9) * (-6707)) ^ 1492920808;
                    i3 = 1926018538;
                    c6224 = c6222;
                    i11 = iM11306 ^ i3;
                    i10 = i2;
                    c6222Matcher = c6224;
                    break;
                case 893953165:
                case 1484019811:
                    c6222 = c6222Matcher;
                    if (C1875.f7103 >= 0) {
                        i21 = i21;
                        c6222Matcher = c6222;
                        i12 = i12;
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") + i9) * (-121);
                        i10 = ((iM11307 ^ i8) * 14753) ^ 1165942710;
                        i4 = 364892369;
                        int i21114 = iM11307 ^ i4;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                        int i21115 = i12;
                        i11 = i21114;
                        i12 = i21115;
                    } else {
                        i21 = i21;
                        c6222Matcher = c6222;
                        int iM450216 = (C19806.m45029("֡ۢ") ^ i9) * 49;
                        i11 = iM450216 ^ (-2122460005);
                        i10 = ((iM450216 ^ i8) * 1377) ^ (-1573284881);
                        i12 = i12;
                        i21 = i21;
                        c6222Matcher = c6222Matcher;
                    }
                    break;
                case 1768462276:
                case 1942057212:
                    c6222 = c6222Matcher;
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    RunnableC1564.m5345();
                    i21 = i21;
                    c6222Matcher = c6222;
                    int iM450217 = (C19806.m45029("֡ۢ") ^ i9) * 49;
                    i11 = iM450217 ^ (-2122460005);
                    i10 = ((iM450217 ^ i8) * 1377) ^ (-1573284881);
                    i12 = i12;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    break;
                case 1771657568:
                case 1792878847:
                    i14 = 51316;
                    iM11307 = C19806.m45029("ۗۚ") ^ i8;
                    i10 = ((iM11307 ^ i9) * (-22903)) ^ (-1128711059);
                    i4 = 555240924;
                    int i21116 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i21117 = i12;
                    i11 = i21116;
                    i12 = i21117;
                    break;
                default:
                    i12 = i12;
                    c6222Matcher = c6222Matcher;
                    i21 = i21;
                    s2 = sArr4[c];
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") + i9) * (-121);
                        i10 = ((iM11307 ^ i8) * 14753) ^ 1165942710;
                        i4 = 364892369;
                    } else {
                        iM11307 = (i8 - C19806.m45029("ۗۜ")) * 3;
                        i10 = ((iM11307 ^ i9) * 25381) ^ (-225878376);
                        i4 = -15548093;
                    }
                    int i21118 = iM11307 ^ i4;
                    i21 = i21;
                    c6222Matcher = c6222Matcher;
                    int i21119 = i12;
                    i11 = i21118;
                    i12 = i21119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0386 A[PHI: r19 r22
      0x0386: PHI (r19v12 ??) = (r19v6 ??), (r19v85 ??), (r19v86 ??) binds: [B:22:0x008b, B:105:0x0384, B:101:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r22v4 java.lang.String) = (r22v0 java.lang.String), (r22v3 java.lang.String), (r22v5 java.lang.String) binds: [B:22:0x008b, B:105:0x0384, B:101:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x03b6 A[PHI: r10 r19 r22
      0x03b6: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:109:0x03b4, B:97:0x0343, B:89:0x0301, B:14:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03b6: PHI (r19v31 ??) = (r19v80 ??), (r19v81 ??), (r19v82 ??), (r19v32 ??) binds: [B:109:0x03b4, B:97:0x0343, B:89:0x0301, B:14:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03b6: PHI (r22v21 java.lang.String) = (r22v2 java.lang.String), (r22v6 java.lang.String), (r22v8 java.lang.String), (r22v22 java.lang.String) binds: [B:109:0x03b4, B:97:0x0343, B:89:0x0301, B:14:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x03e0 A[PHI: r8 r9 r11 r19 r22
      0x03e0: PHI (r8v2 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v3 short[]) binds: [B:93:0x0322, B:85:0x02e0, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x03e0: PHI (r9v3 char) = (r9v2 char), (r9v1 char), (r9v1 char) binds: [B:93:0x0322, B:85:0x02e0, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x03e0: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:93:0x0322, B:85:0x02e0, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x03e0: PHI (r19v33 ??) = (r19v77 ??), (r19v78 ??), (r19v79 ??) binds: [B:93:0x0322, B:85:0x02e0, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x03e0: PHI (r22v23 java.lang.String) = (r22v7 java.lang.String), (r22v9 java.lang.String), (r22v24 java.lang.String) binds: [B:93:0x0322, B:85:0x02e0, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (l.C0962.f3784 != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r19v34 */
    /* JADX WARN: Type inference failed for: r19v42 */
    /* JADX WARN: Type inference failed for: r19v45 */
    /* JADX WARN: Type inference failed for: r19v47 */
    /* JADX WARN: Type inference failed for: r19v48 */
    /* JADX WARN: Type inference failed for: r19v49 */
    /* JADX WARN: Type inference failed for: r19v50 */
    /* JADX WARN: Type inference failed for: r19v51 */
    /* JADX WARN: Type inference failed for: r19v52 */
    /* JADX WARN: Type inference failed for: r19v53 */
    /* JADX WARN: Type inference failed for: r19v54 */
    /* JADX WARN: Type inference failed for: r19v55 */
    /* JADX WARN: Type inference failed for: r19v56 */
    /* JADX WARN: Type inference failed for: r19v57 */
    /* JADX WARN: Type inference failed for: r19v58 */
    /* JADX WARN: Type inference failed for: r19v59 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v60 */
    /* JADX WARN: Type inference failed for: r19v61 */
    /* JADX WARN: Type inference failed for: r19v62 */
    /* JADX WARN: Type inference failed for: r19v63 */
    /* JADX WARN: Type inference failed for: r19v64 */
    /* JADX WARN: Type inference failed for: r19v65 */
    /* JADX WARN: Type inference failed for: r19v66 */
    /* JADX WARN: Type inference failed for: r19v67 */
    /* JADX WARN: Type inference failed for: r19v68 */
    /* JADX WARN: Type inference failed for: r19v69 */
    /* JADX WARN: Type inference failed for: r19v70 */
    /* JADX WARN: Type inference failed for: r19v71 */
    /* JADX WARN: Type inference failed for: r19v72 */
    /* JADX WARN: Type inference failed for: r19v73 */
    /* JADX WARN: Type inference failed for: r19v74 */
    /* JADX WARN: Type inference failed for: r19v75 */
    /* JADX WARN: Type inference failed for: r19v76 */
    /* JADX WARN: Type inference failed for: r19v77 */
    /* JADX WARN: Type inference failed for: r19v78 */
    /* JADX WARN: Type inference failed for: r19v79 */
    /* JADX WARN: Type inference failed for: r19v80 */
    /* JADX WARN: Type inference failed for: r19v81 */
    /* JADX WARN: Type inference failed for: r19v82 */
    /* JADX WARN: Type inference failed for: r19v83 */
    /* JADX WARN: Type inference failed for: r19v84 */
    /* JADX WARN: Type inference failed for: r19v85 */
    /* JADX WARN: Type inference failed for: r19v86 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String, l.ۖۢ᩺] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C2455 m29805() {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29805():l.ۖۢ᩺");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m29809() {
        PluginContext pluginContextM29831 = null;
        String str = null;
        String strM8637 = null;
        int i = 465539499;
        int i2 = C1419.f5860;
        int i3 = C0629.f2722;
        int iM11306 = ThreadFactoryC3888.m11306("۠ܽ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 27821) ^ 693320707;
        int i5 = -2044259703;
        while (true) {
            i = ((((i ^ i3) * 16361) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2132324834:
                case 255679864:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-7851)) ^ 1322983169;
                        i5 = -979592849;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ֡") + i2) * (-127);
                        i4 = ((iM11306 ^ i3) * (-19911)) ^ 194865770;
                        i5 = -232364902;
                    }
                    break;
                case -2043218442:
                case 1206959528:
                    C19806.m45024();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * 27099) ^ 1476690526;
                        i5 = -790957811;
                    } else {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21489)) ^ 23974802;
                        i5 = -886606669;
                    }
                    break;
                case -1889717742:
                case -994208113:
                    C0050.m946();
                    if (!RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * 27099) ^ 1476690526;
                        i5 = -790957811;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-7851)) ^ 1322983169;
                        i5 = -979592849;
                    }
                    break;
                case -1879057830:
                case 1318891201:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-7851)) ^ 1322983169;
                        i5 = -979592849;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12129) ^ (-1443340649);
                        i5 = 845994616;
                    }
                    break;
                case -1860898745:
                case -139768416:
                    str = this.f40141;
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29881) ^ (-883560235);
                        i5 = 287220931;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ۖ")) * (-31);
                        i4 = ((iM11306 ^ i2) * (-1845)) ^ (-729448547);
                        i5 = 203732606;
                    }
                    break;
                case -1488901459:
                case -822075651:
                    C3722.m10894();
                    return null;
                case -1443019369:
                case 496836763:
                    if (C2871.m8641(str) >= 3) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6047)) ^ (-104624884);
                        i5 = -1059084234;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-20309)) ^ 712680793;
                        i5 = -734393952;
                    }
                    break;
                case -1329894005:
                case 512197774:
                    RunnableC3388.m10064();
                    iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 22999) ^ (-2021628502);
                    i5 = -596699887;
                    break;
                case -1045848405:
                case -702492625:
                    if (C0216.m1576(1, str) == '}') {
                        iM11306 = C19806.m45029("᩷۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20359) ^ 1954482126;
                        i5 = 425149437;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-20309)) ^ 712680793;
                        i5 = -734393952;
                    }
                    break;
                case -966965312:
                case -743398416:
                    if (C2871.m8652(str, 0) == '{') {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֡ܳ")) * (-77);
                        i4 = ((iM11306 ^ i3) * 24079) ^ (-1172397280);
                        i5 = 2126140019;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-20309)) ^ 712680793;
                        i5 = -734393952;
                    }
                    break;
                case -929855907:
                case 258142193:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21489)) ^ 23974802;
                        i5 = -886606669;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21781)) ^ 1481929506;
                        i5 = 1281842218;
                    }
                    break;
                case -894024246:
                case 1401407406:
                    pluginContextM29831 = m29831();
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩶") + i3) * (-15);
                        i4 = ((iM11306 ^ i2) * (-30375)) ^ (-1162783901);
                        i5 = 1552117225;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-7851)) ^ 1322983169;
                        i5 = -979592849;
                    }
                    break;
                case -849627941:
                case 1236276641:
                    C1668.m5583();
                    if (C0216.m1591() > 0) {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21489)) ^ 23974802;
                        i5 = -886606669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22999) ^ (-2021628502);
                        i5 = -596699887;
                    }
                    break;
                case -456632358:
                case 1594384940:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-7851)) ^ 1322983169;
                        i5 = -979592849;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩹")) * (-127);
                        i4 = ((iM11306 ^ i3) * (-8729)) ^ (-1853282260);
                        i5 = 1235480244;
                    }
                    break;
                case -399638206:
                case 1073426261:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22999) ^ (-2021628502);
                        i5 = -596699887;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֡") + i3) * (-103);
                        i4 = ((iM11306 ^ i2) * 4993) ^ (-1661225260);
                        i5 = -1973582845;
                    }
                    break;
                case -165160046:
                case 1815874964:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21489)) ^ 23974802;
                        i5 = -886606669;
                    } else {
                        iM11306 = C19806.m45029("۟ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3265)) ^ (-1597550566);
                        i5 = -624817665;
                    }
                    break;
                case 143557968:
                case 1749186229:
                    return str;
                case 171681901:
                case 1851093189:
                    strM8637 = C2871.m8637((C10659) pluginContextM29831, str);
                    if (strM8637 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۟") + i2) * (-119);
                        i4 = ((iM11306 ^ i3) * 28237) ^ 1750173752;
                        i5 = -1820606915;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-20309)) ^ 712680793;
                        i5 = -734393952;
                    }
                    break;
                case 553660866:
                case 2042316181:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * 27099) ^ 1476690526;
                        i5 = -790957811;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21313) ^ 1245274117;
                        i5 = 1032765972;
                    }
                    break;
                case 576810515:
                case 1772434505:
                    return strM8637;
                default:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21489)) ^ 23974802;
                        i5 = -886606669;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫ۡ")) * 57;
                        i4 = ((iM11306 ^ i3) * (-28269)) ^ (-1317025881);
                        i5 = 23340099;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x025a A[PHI: r7 r8 r12 r17 r19
      0x025a: PHI (r7v6 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:65:0x0258, B:53:0x01d5, B:15:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r8v6 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:65:0x0258, B:53:0x01d5, B:15:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r12v6 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:65:0x0258, B:53:0x01d5, B:15:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v34 java.io.InputStream) = (r17v7 java.io.InputStream), (r17v10 java.io.InputStream), (r17v35 java.io.InputStream) binds: [B:65:0x0258, B:53:0x01d5, B:15:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r19v20 l.۫֫᩺) = (r19v3 l.۫֫᩺), (r19v6 l.۫֫᩺), (r3v2 l.۫֫᩺) binds: [B:65:0x0258, B:53:0x01d5, B:15:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b3 A[PHI: r9 r17 r18 r19
      0x02b3: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:73:0x02b1, B:61:0x0234, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r17v30 java.io.InputStream) = (r17v5 java.io.InputStream), (r17v8 java.io.InputStream), (r17v41 java.io.InputStream) binds: [B:73:0x02b1, B:61:0x0234, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:73:0x02b1, B:61:0x0234, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r19v17 l.۫֫᩺) = (r19v1 l.۫֫᩺), (r19v4 l.۫֫᩺), (r19v25 l.۫֫᩺) binds: [B:73:0x02b1, B:61:0x0234, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e7 A[PHI: r6 r17 r19
      0x02e7: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char) binds: [B:77:0x02e5, B:69:0x028f, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r17v28 java.io.InputStream) = (r17v4 java.io.InputStream), (r17v6 java.io.InputStream), (r17v29 java.io.InputStream) binds: [B:77:0x02e5, B:69:0x028f, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r19v15 l.۫֫᩺) = (r19v0 l.۫֫᩺), (r19v2 l.۫֫᩺), (r19v16 l.۫֫᩺) binds: [B:77:0x02e5, B:69:0x028f, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (l.C1461.f5957 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0051, code lost:
    
        if (l.C1937.m6279() >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.io.InputStream m29794(l.C11986 r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29794(l.ۨ᩹ۘ, java.lang.String):java.io.InputStream");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۗۚۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3020 m29798(final C11986 c11986) {
        c11986.m29805();
        return new InterfaceC5719() { // from class: l.ۗۚۘ
            @Override // l.InterfaceC5719
            public final InputStream getAssetsAsStream(String str) {
                return C11986.m29794(this.f11278, str);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29816(C15763 c15763) throws C4987 {
        String str;
        char c;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        short[] sArr;
        String strM3009;
        int i2;
        char c2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        char c3;
        String str12;
        String str13;
        StringBuilder sb;
        StringBuilder sb2;
        String str14;
        char c4;
        String str15;
        String str16;
        String strM6674;
        int iM45029;
        int i3;
        int i4;
        StringBuilder sb3;
        char c5;
        String str17;
        String str18;
        String str19;
        String str20;
        int i5;
        String str21;
        StringBuilder sb4;
        String str22;
        String str23;
        String str24;
        String str25;
        int i6;
        int iM450210;
        int i7;
        int i8;
        int iM11306;
        int i9;
        int iM450211;
        int i10;
        int i11;
        String str26;
        int iM11307;
        int i12;
        int i13;
        this = this;
        c15763 = c15763;
        int i14 = -2138704389;
        int i15 = C2249.f8050;
        int i16 = C3535.f13026;
        int iM11308 = (ThreadFactoryC3888.m11306("ۙ᩺") ^ i15) * 15;
        int i17 = ((iM11308 ^ i16) * 30587) ^ 1765140219;
        int i18 = iM11308 ^ 1044235783;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        StringBuilder sb5 = null;
        short[] sArr2 = null;
        char c6 = 0;
        int i19 = 0;
        String str30 = null;
        String str31 = null;
        Iterator itM10563 = null;
        String str32 = null;
        String strM6675 = null;
        String str33 = null;
        StringBuilder sb6 = null;
        char c7 = 0;
        String name = null;
        StringBuilder sb7 = null;
        String strM3407 = null;
        int i20 = 0;
        String strM6676 = null;
        String str34 = null;
        String strM4904 = null;
        C14103 c14103 = null;
        StringBuilder sb8 = null;
        String strM6677 = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * (-19681)) >> 31));
            switch (i14) {
                case -2133234940:
                case -2088920588:
                    str29 = str29;
                    str8 = str28;
                    sb5 = sb5;
                    sb = sb6;
                    str11 = strM4904;
                    str13 = str30;
                    str6 = str32;
                    str7 = str27;
                    str9 = str33;
                    str10 = str34;
                    c3 = '.';
                    c2 = '/';
                    str12 = name;
                    C2788.m8480(sb, C3535.m10427(str12, '.', '/'));
                    sArr2 = f40134;
                    i19 = 619;
                    if (C0797.f3386) {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩺᩵") ^ i16) * 47;
                        i5 = ((iM11309 ^ i15) * (-26879)) ^ (-2002307636);
                        i18 = iM11309 ^ (-269007033);
                        sb6 = sb;
                        name = str12;
                        strM4904 = str11;
                        str28 = str8;
                        str33 = str9;
                        c7 = c3;
                        str32 = str6;
                        str30 = str13;
                        sb5 = sb5;
                        c6 = c2;
                        i17 = i5;
                        str34 = str10;
                        str27 = str7;
                        str29 = str29;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۡۗ") + i15) * (-99);
                        i18 = iM113010 ^ (-821388630);
                        c15763 = c15763;
                        sb6 = sb;
                        name = str12;
                        strM4904 = str11;
                        i17 = ((iM113010 ^ i16) * (-5065)) ^ 1543374304;
                        str28 = str8;
                        str33 = str9;
                        str34 = str10;
                        c7 = '.';
                        this = this;
                        str27 = str7;
                        str32 = str6;
                        str29 = str29;
                        str30 = str13;
                        sb5 = sb5;
                        c6 = '/';
                    }
                    break;
                case -2120741178:
                case -1741370446:
                    str29 = str29;
                    str26 = strM6676;
                    if (!c15763.m37510(str34, str28)) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۖ۟") + i16) * 99;
                        i12 = ((iM11307 ^ i15) * 8559) ^ 1459395508;
                        i13 = 214605508;
                        strM6676 = str26;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                        str29 = str29;
                    } else {
                        c7 = c7;
                        c6 = c6;
                        str27 = str27;
                        strM6676 = str26;
                        str21 = str28;
                        sb4 = sb5;
                        str23 = str30;
                        int iM450212 = (i16 - C19806.m45029("ܺ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM450212 ^ i15) * 14457) ^ (-1777190290);
                        i18 = iM450212 ^ (-1157926444);
                        c15763 = c15763;
                        str27 = str27;
                        str30 = str23;
                        sb5 = sb4;
                        str29 = str29;
                        c6 = c6;
                        i17 = i6;
                        str28 = str21;
                        c7 = c7;
                    }
                    break;
                case -1917922509:
                case 1832201379:
                    ThreadFactoryC3888.m11300();
                    if (C1937.f7317 < 0) {
                        iM450211 = C19806.m45029("ۙ֨") ^ i16;
                        i10 = ((iM450211 ^ i15) * (-5033)) ^ 2082801262;
                        i11 = 1629779261;
                        i18 = iM450211 ^ i11;
                        i17 = i10;
                    } else {
                        str29 = str29;
                        str26 = strM6676;
                        iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i15;
                        i12 = ((iM11307 ^ i16) * 18233) ^ 470116366;
                        i13 = 1049374431;
                        strM6676 = str26;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                        str29 = str29;
                    }
                    break;
                case -1881938972:
                case -274857101:
                    str29 = str29;
                    c7 = c7;
                    c6 = c6;
                    str27 = str27;
                    str21 = str28;
                    sb4 = sb5;
                    str23 = str30;
                    String str35 = this.f40157;
                    if (str35 == null) {
                        str32 = str35;
                        int iM450213 = (i16 - C19806.m45029("ܺ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM450213 ^ i15) * 14457) ^ (-1777190290);
                        i18 = iM450213 ^ (-1157926444);
                        c15763 = c15763;
                        str27 = str27;
                        str30 = str23;
                        sb5 = sb4;
                        str29 = str29;
                        c6 = c6;
                        i17 = i6;
                        str28 = str21;
                        c7 = c7;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i16;
                        str24 = str35;
                        i3 = ((iM11306 ^ i15) * (-12613)) ^ 1787969709;
                        i9 = -871338359;
                        i18 = iM11306 ^ i9;
                        str27 = str27;
                        str32 = str24;
                        str28 = str21;
                        str29 = str29;
                        c7 = c7;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i3;
                        c15763 = c15763;
                    }
                    break;
                case -1878622021:
                case 1591693253:
                    str29 = str29;
                    str26 = strM6676;
                    if (c15763.m37510(strM6675, str31)) {
                        iM11307 = C19806.m45029("ۡ᩸") ^ i16;
                        i12 = ((iM11307 ^ i15) * 24289) ^ 891267874;
                        i13 = -1207506704;
                    } else {
                        iM11307 = C19806.m45029("ۚۗ") ^ i15;
                        i12 = ((iM11307 ^ i16) * (-10305)) ^ (-995308093);
                        i13 = -1859329121;
                    }
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                case -1815338601:
                case 2102946388:
                    StringBuilder sb9 = new StringBuilder(str29);
                    C1148.m4223(sb9, c14103.f46338);
                    C21157.m47599(C2124.m6674(sb9));
                    String str36 = c14103.f46338;
                    Object[] objArr = new Object[1];
                    if (AbstractC0464.f2088 > 0) {
                        objArr[0] = str36;
                        throw new C4987(C0278.m1786(C19806.m45029(CallableC1627.m5502(f40134, 639, 3, i20)) ^ 2098111368, objArr));
                    }
                    str21 = str28;
                    sb4 = sb5;
                    str22 = str34;
                    str23 = str30;
                    str24 = str32;
                    str25 = str33;
                    int iM450214 = (C19806.m45029("ۨ᩸") + i16) * 69;
                    i3 = ((iM450214 ^ i15) * (-2399)) ^ 307534929;
                    i18 = iM450214 ^ (-262498983);
                    this = this;
                    str28 = str21;
                    str33 = str25;
                    str34 = str22;
                    str27 = str27;
                    c7 = c7;
                    str32 = str24;
                    str29 = str29;
                    str30 = str23;
                    sb5 = sb4;
                    c6 = c6;
                    i17 = i3;
                    c15763 = c15763;
                    break;
                case -1812928528:
                case 1014508367:
                    String str37 = str29;
                    String str38 = str27;
                    StringBuilder sb10 = new StringBuilder(str38);
                    c7 = c7;
                    char c8 = c6;
                    str21 = str28;
                    StringBuilder sb11 = sb5;
                    String str39 = str32;
                    C2788.m8480(sb10, C3535.m10427(str39, c7, c8));
                    String str40 = str30;
                    C1148.m4223(sb10, str40);
                    String strM3408 = C0817.m3407(sb10);
                    if (c15763.m37509(strM3408)) {
                        int iM450215 = C19806.m45029("ۚۛ") ^ i15;
                        i17 = ((iM450215 ^ i16) * (-16197)) ^ (-1912270657);
                        i18 = iM450215 ^ 1482113436;
                        str27 = str38;
                        str30 = str40;
                        sb5 = sb11;
                        str29 = str37;
                        c6 = c8;
                        str34 = strM3408;
                        str32 = str39;
                        str28 = str21;
                        c7 = c7;
                    } else {
                        int iM450216 = (C19806.m45029("۟ᩴ") + i16) * (-77);
                        i18 = iM450216 ^ (-1985560760);
                        str27 = str38;
                        i17 = ((iM450216 ^ i15) * 4277) ^ (-864081267);
                        str28 = str21;
                        str29 = str37;
                        c7 = c7;
                        str30 = str40;
                        sb5 = sb11;
                        c6 = c8;
                        str34 = strM3408;
                        str32 = str39;
                    }
                    break;
                case -1701554417:
                case -282211079:
                    i20 = 24110;
                    int iM113011 = ThreadFactoryC3888.m11306("᩹ᩴ") ^ i15;
                    sb6 = sb6;
                    i2 = ((iM113011 ^ i16) * (-30659)) ^ 1863016971;
                    i18 = iM113011 ^ (-231643294);
                    strM4904 = strM4904;
                    sArr2 = sArr2;
                    i19 = i19;
                    str28 = str28;
                    str33 = str33;
                    str34 = str34;
                    str27 = str27;
                    c7 = c7;
                    str32 = str32;
                    str29 = str29;
                    str30 = str30;
                    sb5 = sb5;
                    c6 = c6;
                    name = name;
                    i17 = i2;
                    this = this;
                    break;
                case -1649670851:
                case -194829700:
                    if (!C3577.m10565()) {
                        iM450211 = C19806.m45029("᩵ۡ") ^ i15;
                        i10 = ((iM450211 ^ i16) * 9323) ^ 1448503876;
                        i11 = -1386920256;
                        i18 = iM450211 ^ i11;
                        i17 = i10;
                    } else {
                        str29 = str29;
                        sb3 = sb7;
                        c5 = c7;
                        c2 = c6;
                        str7 = str27;
                        str17 = str28;
                        sb5 = sb5;
                        str10 = str34;
                        str18 = strM4904;
                        str13 = str30;
                        str19 = str32;
                        str20 = str33;
                        int iM450217 = (C19806.m45029("᩺ᩳ") ^ i15) * 61;
                        i7 = ((iM450217 ^ i16) * (-7181)) ^ 1340581964;
                        i18 = iM450217 ^ (-1989480211);
                        this = this;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str34 = str10;
                        str27 = str7;
                        c7 = c5;
                        str29 = str29;
                        StringBuilder sb12 = sb5;
                        c6 = c2;
                        i17 = i7;
                        str33 = str20;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb12;
                    }
                    break;
                case -1633947841:
                case 1590475519:
                    c14103.m34142(2);
                    StringBuilder sb13 = new StringBuilder(C3722.m10901(f40134, 699, 23, i20));
                    C1148.m4223(sb13, c14103.f46338);
                    C21157.m47599(C2124.m6674(sb13));
                    sb2 = sb7;
                    c4 = c7;
                    c2 = c6;
                    str15 = str27;
                    strM6676 = strM6676;
                    str16 = str30;
                    strM6674 = str28;
                    str14 = strM4904;
                    int iM450218 = C19806.m45029("᩻᩻") ^ i15;
                    i2 = ((iM450218 ^ i16) * (-21055)) ^ 838651793;
                    i18 = iM450218 ^ 481679684;
                    sb7 = sb2;
                    c7 = c4;
                    strM4904 = str14;
                    str28 = strM6674;
                    str33 = str33;
                    str34 = str34;
                    str27 = str15;
                    str32 = str32;
                    str29 = str29;
                    str30 = str16;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i2;
                    this = this;
                    break;
                case -1595712716:
                case 791889878:
                    String str41 = strM6676;
                    StringBuilder sb14 = new StringBuilder(str29);
                    C2788.m8480(sb14, this.f40157);
                    C21157.m47599(C2124.m6674(sb14));
                    String str42 = this.f40157;
                    Object[] objArr2 = new Object[1];
                    if (C1937.f7317 < 0) {
                        objArr2[0] = str42;
                        throw new C4987(C0278.m1786(ThreadFactoryC3888.m11306(RunnableC0195.m1429(f40134, 642, 3, i20)) ^ 2118880289, objArr2));
                    }
                    str29 = str29;
                    str12 = name;
                    sb = sb6;
                    c3 = c7;
                    c2 = c6;
                    str7 = str27;
                    strM6676 = str41;
                    str8 = str28;
                    sb5 = sb5;
                    str10 = str34;
                    str11 = strM4904;
                    str13 = str30;
                    str6 = str32;
                    str9 = str33;
                    int iM113012 = (ThreadFactoryC3888.m11306("᩺᩵") ^ i16) * 47;
                    i5 = ((iM113012 ^ i15) * (-26879)) ^ (-2002307636);
                    i18 = iM113012 ^ (-269007033);
                    sb6 = sb;
                    name = str12;
                    strM4904 = str11;
                    str28 = str8;
                    str33 = str9;
                    c7 = c3;
                    str32 = str6;
                    str30 = str13;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i5;
                    str34 = str10;
                    str27 = str7;
                    str29 = str29;
                    break;
                    break;
                case -1455136598:
                case 1053069517:
                    C0278.m1789();
                    if (RunnableC0195.f1321 < 0) {
                        str29 = str29;
                        sb3 = sb7;
                        c5 = c7;
                        c2 = c6;
                        str7 = str27;
                        str17 = str28;
                        sb5 = sb5;
                        str10 = str34;
                        str18 = strM4904;
                        str13 = str30;
                        str19 = str32;
                        str20 = str33;
                        int iM450219 = (C19806.m45029("᩺ᩳ") ^ i15) * 61;
                        i7 = ((iM450219 ^ i16) * (-7181)) ^ 1340581964;
                        i18 = iM450219 ^ (-1989480211);
                        this = this;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str34 = str10;
                        str27 = str7;
                        c7 = c5;
                        str29 = str29;
                        StringBuilder sb15 = sb5;
                        c6 = c2;
                        i17 = i7;
                        str33 = str20;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb15;
                    } else {
                        str29 = str29;
                        str26 = strM6676;
                        iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i15;
                        i12 = ((iM11307 ^ i16) * 18233) ^ 470116366;
                        i13 = 1049374431;
                        strM6676 = str26;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                        str29 = str29;
                    }
                    break;
                case -1405349790:
                case 844200214:
                    str29 = str29;
                    str = str34;
                    c = c7;
                    char c9 = c6;
                    i = i19;
                    str2 = str28;
                    sb5 = sb5;
                    str3 = strM4904;
                    str30 = str30;
                    str4 = str32;
                    str5 = str33;
                    sArr = sArr2;
                    c6 = c9;
                    strM3009 = C0671.m3009(f40134, 618, 1, i20);
                    StringBuilder sb16 = new StringBuilder(strM3009);
                    name = TranslationEngine.class.getName();
                    if (!C0817.f3443) {
                        sb6 = sb16;
                        int iM450220 = C19806.m45029("ۖۖ") ^ i16;
                        i12 = ((iM450220 ^ i15) * (-20045)) ^ (-1968896175);
                        i18 = iM450220 ^ (-1035148318);
                        this = this;
                        strM4904 = str3;
                        sArr2 = sArr;
                        i19 = i;
                        str28 = str2;
                        str33 = str5;
                        str34 = str;
                        str27 = strM3009;
                        c7 = c;
                        str32 = str4;
                        c15763 = c15763;
                        str30 = str30;
                        sb5 = sb5;
                        c6 = c6;
                        name = name;
                        i17 = i12;
                        str29 = str29;
                    } else {
                        int iM450221 = C19806.m45029("֫۬") ^ i16;
                        sb6 = sb16;
                        i2 = ((iM450221 ^ i15) * 18139) ^ (-2142452933);
                        i18 = iM450221 ^ (-549854790);
                        strM4904 = str3;
                        sArr2 = sArr;
                        i19 = i;
                        str28 = str2;
                        str33 = str5;
                        str34 = str;
                        str29 = str29;
                        str27 = strM3009;
                        c7 = c;
                        str32 = str4;
                        str30 = str30;
                        sb5 = sb5;
                        c6 = c6;
                        name = name;
                        i17 = i2;
                        this = this;
                    }
                    break;
                case -1369271651:
                case -404341928:
                    c14103.m34142(4);
                    StringBuilder sb17 = new StringBuilder(C0671.m3009(f40134, 773, 23, i20));
                    C1148.m4223(sb17, c14103.f46338);
                    C21157.m47599(C0817.m3407(sb17));
                    sb2 = sb7;
                    c4 = c7;
                    c2 = c6;
                    str15 = str27;
                    strM6676 = strM6676;
                    str16 = str30;
                    strM6674 = str28;
                    str14 = strM4904;
                    int iM4502110 = C19806.m45029("᩻᩻") ^ i15;
                    i2 = ((iM4502110 ^ i16) * (-21055)) ^ 838651793;
                    i18 = iM4502110 ^ 481679684;
                    sb7 = sb2;
                    c7 = c4;
                    strM4904 = str14;
                    str28 = strM6674;
                    str33 = str33;
                    str34 = str34;
                    str27 = str15;
                    str32 = str32;
                    str29 = str29;
                    str30 = str16;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i2;
                    this = this;
                    break;
                case -1323248426:
                case 1206943145:
                    str29 = str29;
                    str26 = strM6676;
                    if (c15763.m37510(strM6675, strM6677)) {
                        iM11307 = C19806.m45029("۫ۧ") ^ i15;
                        i12 = ((iM11307 ^ i16) * (-16683)) ^ 91318620;
                        i13 = -1632684340;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩶ۨ") ^ i15) * 71;
                        i12 = ((iM11307 ^ i16) * 20493) ^ (-360675147);
                        i13 = 434771729;
                    }
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                case -1231993263:
                case 2078670133:
                    String str43 = str29;
                    String str44 = name;
                    char c10 = c7;
                    char c11 = c6;
                    String str45 = str27;
                    String str46 = str28;
                    StringBuilder sb18 = sb5;
                    String str47 = str34;
                    String str48 = strM4904;
                    String str49 = str30;
                    String str50 = str32;
                    int i21 = i19;
                    String str51 = str33;
                    short[] sArr3 = sArr2;
                    short s = f40134[617];
                    if (((s * s) + 159365376) - (s * 25248) >= 0) {
                        iM45029 = (i16 - ThreadFactoryC3888.m11306("ۚۡ")) * 37;
                        i3 = ((iM45029 ^ i15) * (-2279)) ^ 1805347977;
                        i4 = 1104980023;
                    } else {
                        iM45029 = (C19806.m45029("۫᩹") + i15) * 75;
                        i3 = ((iM45029 ^ i16) * 28283) ^ 1372479236;
                        i4 = 1020720051;
                    }
                    i18 = iM45029 ^ i4;
                    this = this;
                    strM4904 = str48;
                    sArr2 = sArr3;
                    i19 = i21;
                    str28 = str46;
                    str33 = str51;
                    str34 = str47;
                    str27 = str45;
                    c7 = c10;
                    str32 = str50;
                    str29 = str43;
                    str30 = str49;
                    sb5 = sb18;
                    c6 = c11;
                    name = str44;
                    i17 = i3;
                    c15763 = c15763;
                    break;
                case -1119995827:
                case 2076707284:
                    c14103.m34142(1);
                    StringBuilder sb19 = new StringBuilder(C2704.m8240(f40134, 645, 22, i20));
                    C2788.m8480(sb19, c14103.f46338);
                    C21157.m47599(C2124.m6674(sb19));
                    sb2 = sb7;
                    c4 = c7;
                    c2 = c6;
                    str15 = str27;
                    strM6676 = strM6676;
                    str16 = str30;
                    strM6674 = str28;
                    str14 = strM4904;
                    int iM4502111 = C19806.m45029("᩻᩻") ^ i15;
                    i2 = ((iM4502111 ^ i16) * (-21055)) ^ 838651793;
                    i18 = iM4502111 ^ 481679684;
                    sb7 = sb2;
                    c7 = c4;
                    strM4904 = str14;
                    str28 = strM6674;
                    str33 = str33;
                    str34 = str34;
                    str27 = str15;
                    str32 = str32;
                    str29 = str29;
                    str30 = str16;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i2;
                    this = this;
                    break;
                case -1019653717:
                case 1129801946:
                    str29 = str29;
                    str26 = strM6676;
                    if (c15763.m37510(strM6675, strM3407)) {
                        iM11307 = C19806.m45029("᩵֫") ^ i16;
                        i12 = ((iM11307 ^ i15) * (-27783)) ^ (-1325227262);
                        i13 = 2130213621;
                    } else {
                        iM11307 = (C19806.m45029("ۜۧ") ^ i16) * (-107);
                        i12 = ((iM11307 ^ i15) * 24159) ^ 872746667;
                        i13 = 2096739743;
                    }
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                case -921408831:
                case -288450811:
                    str29 = str29;
                    sb3 = sb7;
                    c5 = c7;
                    c2 = c6;
                    str7 = str27;
                    str17 = str28;
                    sb5 = sb5;
                    str10 = str34;
                    str18 = strM4904;
                    str13 = str30;
                    str19 = str32;
                    str20 = str33;
                    StringBuilder sb20 = new StringBuilder(str7);
                    C1148.m4223(sb20, C3535.m10427(TextEditorFloatingMenu.class.getName(), c5, c2));
                    C2788.m8480(sb20, str13);
                    if (C3535.f13026 > 0) {
                        int iM450222 = (C19806.m45029("᩻ۨ") + i15) * 37;
                        i5 = ((iM450222 ^ i16) * (-10129)) ^ (-164550399);
                        i18 = iM450222 ^ 691498950;
                        sb8 = sb20;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str33 = str20;
                        c7 = c5;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb5;
                        c6 = c2;
                        i17 = i5;
                        str34 = str10;
                        str27 = str7;
                        str29 = str29;
                    } else {
                        sb8 = sb20;
                        int iM4502112 = (C19806.m45029("᩺ᩳ") ^ i15) * 61;
                        i7 = ((iM4502112 ^ i16) * (-7181)) ^ 1340581964;
                        i18 = iM4502112 ^ (-1989480211);
                        this = this;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str34 = str10;
                        str27 = str7;
                        c7 = c5;
                        str29 = str29;
                        StringBuilder sb110 = sb5;
                        c6 = c2;
                        i17 = i7;
                        str33 = str20;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb110;
                    }
                    break;
                case -781538055:
                case 1006761385:
                    if (RunnableC1606.f6488 < 0) {
                        str29 = str29;
                        name = name;
                        c = c7;
                        c6 = c6;
                        strM3009 = str27;
                        str2 = str28;
                        sb5 = sb5;
                        str = str34;
                        str3 = strM4904;
                        str30 = str30;
                        str4 = str32;
                        i = i19;
                        str5 = str33;
                        sArr = sArr2;
                        int iM450223 = C19806.m45029("ۖۖ") ^ i16;
                        i12 = ((iM450223 ^ i15) * (-20045)) ^ (-1968896175);
                        i18 = iM450223 ^ (-1035148318);
                        this = this;
                        strM4904 = str3;
                        sArr2 = sArr;
                        i19 = i;
                        str28 = str2;
                        str33 = str5;
                        str34 = str;
                        str27 = strM3009;
                        c7 = c;
                        str32 = str4;
                        c15763 = c15763;
                        str30 = str30;
                        sb5 = sb5;
                        c6 = c6;
                        name = name;
                        i17 = i12;
                        str29 = str29;
                    } else {
                        str29 = str29;
                        sb3 = sb7;
                        c5 = c7;
                        c2 = c6;
                        str7 = str27;
                        str17 = str28;
                        sb5 = sb5;
                        str10 = str34;
                        str18 = strM4904;
                        str13 = str30;
                        str19 = str32;
                        str20 = str33;
                        int iM4502113 = (C19806.m45029("᩺ᩳ") ^ i15) * 61;
                        i7 = ((iM4502113 ^ i16) * (-7181)) ^ 1340581964;
                        i18 = iM4502113 ^ (-1989480211);
                        this = this;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str34 = str10;
                        str27 = str7;
                        c7 = c5;
                        str29 = str29;
                        StringBuilder sb111 = sb5;
                        c6 = c2;
                        i17 = i7;
                        str33 = str20;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb111;
                    }
                    break;
                case -589969589:
                case 1504147146:
                    char c12 = c7;
                    c2 = c6;
                    String str52 = str27;
                    String str53 = str28;
                    sb5 = sb5;
                    str13 = str30;
                    str19 = str32;
                    boolean zM3748 = C0962.m3748(itM10563);
                    str20 = str33;
                    String str54 = str34;
                    String strM26821 = C10634.m26821(f40134, 620, 19, i20);
                    if (zM3748) {
                        iM450210 = (i15 - C19806.m45029("ۚܶ")) * 5;
                        i7 = ((iM450210 ^ i16) * (-31851)) ^ (-1507190494);
                        i8 = -1568113102;
                    } else {
                        iM450210 = (C19806.m45029("۟۟") ^ i16) * 11;
                        i7 = ((iM450210 ^ i15) * 3411) ^ (-429640327);
                        i8 = -1854270447;
                    }
                    i18 = iM450210 ^ i8;
                    str34 = str54;
                    str27 = str52;
                    str29 = strM26821;
                    str28 = str53;
                    c7 = c12;
                    StringBuilder sb112 = sb5;
                    c6 = c2;
                    i17 = i7;
                    str33 = str20;
                    str32 = str19;
                    str30 = str13;
                    sb5 = sb112;
                    break;
                case -586926863:
                case 415319420:
                    str29 = str29;
                    str26 = strM6676;
                    sb5 = new StringBuilder(C3743.m10964(f40134, 667, 29, i20));
                    str33 = this.f40157;
                    if (C1419.f5860 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i15;
                        i12 = ((iM11307 ^ i16) * 18233) ^ 470116366;
                        i13 = 1049374431;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩻᩷") ^ i16;
                        i12 = ((iM11307 ^ i15) * 19881) ^ 1093869369;
                        i13 = 642271690;
                    }
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                case -538339612:
                case 1966433499:
                    if (C7105.f23796 < 0) {
                        str21 = str28;
                        sb4 = sb5;
                        str22 = str34;
                        str23 = str30;
                        str24 = str32;
                        str25 = str33;
                        int iM4502114 = (C19806.m45029("ۨ᩸") + i16) * 69;
                        i3 = ((iM4502114 ^ i15) * (-2399)) ^ 307534929;
                        i18 = iM4502114 ^ (-262498983);
                        this = this;
                        str28 = str21;
                        str33 = str25;
                        str34 = str22;
                        str27 = str27;
                        c7 = c7;
                        str32 = str24;
                        str29 = str29;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i3;
                        c15763 = c15763;
                    } else {
                        str29 = str29;
                        sb3 = sb7;
                        c5 = c7;
                        c2 = c6;
                        str7 = str27;
                        str17 = str28;
                        sb5 = sb5;
                        str10 = str34;
                        str18 = strM4904;
                        str13 = str30;
                        str19 = str32;
                        str20 = str33;
                        int iM4502115 = (C19806.m45029("᩺ᩳ") ^ i15) * 61;
                        i7 = ((iM4502115 ^ i16) * (-7181)) ^ 1340581964;
                        i18 = iM4502115 ^ (-1989480211);
                        this = this;
                        sb7 = sb3;
                        strM4904 = str18;
                        str28 = str17;
                        str34 = str10;
                        str27 = str7;
                        c7 = c5;
                        str29 = str29;
                        StringBuilder sb113 = sb5;
                        c6 = c2;
                        i17 = i7;
                        str33 = str20;
                        str32 = str19;
                        str30 = str13;
                        sb5 = sb113;
                    }
                    break;
                case -404421014:
                case 112926710:
                    str29 = str29;
                    c7 = c7;
                    c6 = c6;
                    str27 = str27;
                    str21 = str28;
                    sb4 = sb5;
                    str22 = str34;
                    str23 = str30;
                    str24 = str32;
                    str25 = str33;
                    strM3407 = C0817.m3407(sb8);
                    StringBuilder sb21 = new StringBuilder(str27);
                    strM4904 = C1398.m4904(TextEditorToolMenu.class.getName(), c7, c6);
                    if (!C2704.f10408) {
                        sb7 = sb21;
                        int iM4502116 = (C19806.m45029("ۨ᩸") + i16) * 69;
                        i3 = ((iM4502116 ^ i15) * (-2399)) ^ 307534929;
                        i18 = iM4502116 ^ (-262498983);
                        this = this;
                        str28 = str21;
                        str33 = str25;
                        str34 = str22;
                        str27 = str27;
                        c7 = c7;
                        str32 = str24;
                        str29 = str29;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i3;
                        c15763 = c15763;
                    } else {
                        int iM113013 = (i16 - ThreadFactoryC3888.m11306("ۨۤ")) * 53;
                        i6 = ((iM113013 ^ i15) * 27) ^ (-760909596);
                        i18 = iM113013 ^ (-103385223);
                        sb7 = sb21;
                        str33 = str25;
                        str34 = str22;
                        this = this;
                        str27 = str27;
                        str32 = str24;
                        str29 = str29;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i6;
                        str28 = str21;
                        c7 = c7;
                    }
                    break;
                case -395666032:
                case -261851475:
                    return;
                case -314184004:
                case 2041264777:
                    str29 = str29;
                    String str55 = strM6676;
                    C2788.m8480(sb5, str33);
                    C21157.m47599(C0817.m3407(sb5));
                    String str56 = this.f40157;
                    if (!C0962.f3784) {
                        throw new C4987(C0278.m1786(C19806.m45029(C3286.m9788(f40134, 696, 3, i20)) ^ 2102734998, new Object[]{str56}));
                    }
                    strM6676 = str55;
                    str21 = str28;
                    sb4 = sb5;
                    str22 = str34;
                    str23 = str30;
                    str24 = str32;
                    str25 = str33;
                    int iM4502117 = (C19806.m45029("ۨ᩸") + i16) * 69;
                    i3 = ((iM4502117 ^ i15) * (-2399)) ^ 307534929;
                    i18 = iM4502117 ^ (-262498983);
                    this = this;
                    str28 = str21;
                    str33 = str25;
                    str34 = str22;
                    str27 = str27;
                    c7 = c7;
                    str32 = str24;
                    str29 = str29;
                    str30 = str23;
                    sb5 = sb4;
                    c6 = c6;
                    i17 = i3;
                    c15763 = c15763;
                    break;
                    break;
                case -262873255:
                case 1447624507:
                    str29 = str29;
                    char c13 = c7;
                    c2 = c6;
                    str6 = str32;
                    str7 = str27;
                    str8 = str28;
                    sb5 = sb5;
                    str9 = str33;
                    str10 = str34;
                    str11 = strM4904;
                    short[] sArr4 = sArr2;
                    int i22 = i19;
                    String strM1588 = C0216.m1588(sArr4, i22, 1, i20);
                    StringBuilder sb22 = sb6;
                    C1148.m4223(sb22, strM1588);
                    strM6676 = C2124.m6674(sb22);
                    StringBuilder sb23 = new StringBuilder(str7);
                    C1148.m4223(sb23, C1398.m4904(TextEditorFunction.class.getName(), c13, c2));
                    C1148.m4223(sb23, strM1588);
                    strM6677 = C2124.m6674(sb23);
                    if (!C3577.m10565()) {
                        c3 = c13;
                        sArr2 = sArr4;
                        i19 = i22;
                        str12 = name;
                        str13 = strM1588;
                        sb = sb22;
                        int iM113014 = (ThreadFactoryC3888.m11306("᩺᩵") ^ i16) * 47;
                        i5 = ((iM113014 ^ i15) * (-26879)) ^ (-2002307636);
                        i18 = iM113014 ^ (-269007033);
                        sb6 = sb;
                        name = str12;
                        strM4904 = str11;
                        str28 = str8;
                        str33 = str9;
                        c7 = c3;
                        str32 = str6;
                        str30 = str13;
                        sb5 = sb5;
                        c6 = c2;
                        i17 = i5;
                        str34 = str10;
                        str27 = str7;
                        str29 = str29;
                    } else {
                        int iM113015 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i16;
                        i2 = ((iM113015 ^ i15) * 4535) ^ (-1381934690);
                        i18 = iM113015 ^ (-1762169384);
                        strM4904 = str11;
                        sArr2 = sArr4;
                        i19 = i22;
                        str28 = str8;
                        str33 = str9;
                        str34 = str10;
                        str27 = str7;
                        c7 = c13;
                        str32 = str6;
                        str29 = str29;
                        str30 = strM1588;
                        sb6 = sb22;
                        sb5 = sb5;
                        c6 = c2;
                        i17 = i2;
                        this = this;
                    }
                    break;
                case -159703321:
                case 669752946:
                    C2124.m6673();
                    if (C1668.f6641 < 0) {
                        iM450211 = C19806.m45029("ۙ֨") ^ i16;
                        i10 = ((iM450211 ^ i15) * (-5033)) ^ 2082801262;
                        i11 = 1629779261;
                    } else {
                        iM450211 = C19806.m45029("ᩳۜ") ^ i15;
                        i10 = ((iM450211 ^ i16) * 6995) ^ (-759715157);
                        i11 = 285919071;
                    }
                    i18 = iM450211 ^ i11;
                    i17 = i10;
                    break;
                case -17854455:
                case 526853574:
                    C1148.m4232();
                    C1148.m4232();
                    return;
                case 552125766:
                case 1588284626:
                    str29 = str29;
                    sb2 = sb7;
                    str14 = strM4904;
                    c4 = c7;
                    c2 = c6;
                    str15 = str27;
                    str16 = str30;
                    C2788.m8480(sb2, str14);
                    C2788.m8480(sb2, str16);
                    String strM3409 = C0817.m3407(sb2);
                    StringBuilder sb24 = new StringBuilder(str15);
                    C2788.m8480(sb24, C3535.m10427(PluginPreference.class.getName(), c4, c2));
                    C2788.m8480(sb24, str16);
                    strM6674 = C2124.m6674(sb24);
                    itM10563 = C3577.m10563(this.f40159);
                    str31 = strM3409;
                    int iM4502118 = C19806.m45029("᩻᩻") ^ i15;
                    i2 = ((iM4502118 ^ i16) * (-21055)) ^ 838651793;
                    i18 = iM4502118 ^ 481679684;
                    sb7 = sb2;
                    c7 = c4;
                    strM4904 = str14;
                    str28 = strM6674;
                    str33 = str33;
                    str34 = str34;
                    str27 = str15;
                    str32 = str32;
                    str29 = str29;
                    str30 = str16;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i2;
                    this = this;
                    break;
                case 555450172:
                case 797214792:
                    c14103.m34142(3);
                    StringBuilder sb25 = new StringBuilder(RunnableC3388.m10056(f40134, 722, 27, i20));
                    C2788.m8480(sb25, c14103.f46338);
                    C21157.m47599(C0817.m3407(sb25));
                    sb2 = sb7;
                    c4 = c7;
                    c2 = c6;
                    str15 = str27;
                    strM6676 = strM6676;
                    str16 = str30;
                    strM6674 = str28;
                    str14 = strM4904;
                    int iM4502119 = C19806.m45029("᩻᩻") ^ i15;
                    i2 = ((iM4502119 ^ i16) * (-21055)) ^ 838651793;
                    i18 = iM4502119 ^ 481679684;
                    sb7 = sb2;
                    c7 = c4;
                    strM4904 = str14;
                    str28 = strM6674;
                    str33 = str33;
                    str34 = str34;
                    str27 = str15;
                    str32 = str32;
                    str29 = str29;
                    str30 = str16;
                    sb5 = sb5;
                    c6 = c2;
                    i17 = i2;
                    this = this;
                    break;
                case 794750735:
                case 1667511085:
                    str29 = str29;
                    c7 = c7;
                    c6 = c6;
                    str27 = str27;
                    str21 = str28;
                    sb4 = sb5;
                    str23 = str30;
                    str24 = str32;
                    c14103 = (C14103) C0278.m1776(itM10563);
                    String str57 = c14103.f46338;
                    StringBuilder sb26 = new StringBuilder(str27);
                    C1148.m4223(sb26, C1398.m4904(str57, c7, c6));
                    C1148.m4223(sb26, str23);
                    strM6675 = C2124.m6674(sb26);
                    if (!c15763.m37509(strM6675)) {
                        int iM113016 = (ThreadFactoryC3888.m11306("ۢ᩸") + i15) * (-9);
                        i6 = ((iM113016 ^ i16) * (-1875)) ^ 1827188063;
                        i18 = iM113016 ^ (-1347054332);
                        str27 = str27;
                        str32 = str24;
                        str29 = str29;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i6;
                        str28 = str21;
                        c7 = c7;
                    } else {
                        iM11306 = C19806.m45029("ᩳ۫") ^ i15;
                        i3 = ((iM11306 ^ i16) * 14313) ^ (-204898239);
                        i9 = -170814580;
                        i18 = iM11306 ^ i9;
                        str27 = str27;
                        str32 = str24;
                        str28 = str21;
                        str29 = str29;
                        c7 = c7;
                        str30 = str23;
                        sb5 = sb4;
                        c6 = c6;
                        i17 = i3;
                        c15763 = c15763;
                    }
                    break;
                case 900855867:
                case 2027726738:
                    if (c15763.m37510(strM6675, strM6676)) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۤ᩹") + i15) * 75;
                        i10 = ((iM450211 ^ i16) * (-19623)) ^ (-1145381470);
                        i11 = -530511391;
                    } else {
                        iM450211 = C19806.m45029("ۨᩴ") ^ i16;
                        i10 = ((iM450211 ^ i15) * 23067) ^ (-289609493);
                        i11 = -289400763;
                    }
                    i18 = iM450211 ^ i11;
                    i17 = i10;
                    break;
                case 1364158925:
                case 2129726077:
                    str29 = str29;
                    str26 = strM6676;
                    StringBuilder sb27 = new StringBuilder(RunnableC1606.m5481(f40134, 749, 21, i20));
                    C2788.m8480(sb27, c14103.f46338);
                    C21157.m47599(C0817.m3407(sb27));
                    String str58 = c14103.f46338;
                    if (C0278.m1789() > 0) {
                        throw new C4987(C0216.m1574(C19806.m45029(C7105.m18989(f40134, UMWorkDispatch.MSG_DELAY_PROCESS, 3, i20)) ^ 2100660756, new Object[]{str58}));
                    }
                    iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i15;
                    i12 = ((iM11307 ^ i16) * 18233) ^ 470116366;
                    i13 = 1049374431;
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                case 1436054476:
                case 1603127955:
                    C1668.m5583();
                    str29 = str29;
                    str26 = strM6676;
                    iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i15;
                    i12 = ((iM11307 ^ i16) * 18233) ^ 470116366;
                    i13 = 1049374431;
                    strM6676 = str26;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    str29 = str29;
                    break;
                default:
                    i20 = 29266;
                    int iM113017 = ThreadFactoryC3888.m11306("᩹ᩴ") ^ i15;
                    sb6 = sb6;
                    i2 = ((iM113017 ^ i16) * (-30659)) ^ 1863016971;
                    i18 = iM113017 ^ (-231643294);
                    strM4904 = strM4904;
                    sArr2 = sArr2;
                    i19 = i19;
                    str28 = str28;
                    str33 = str33;
                    str34 = str34;
                    str27 = str27;
                    c7 = c7;
                    str32 = str32;
                    str29 = str29;
                    str30 = str30;
                    sb5 = sb5;
                    c6 = c6;
                    name = name;
                    i17 = i2;
                    this = this;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x07ec A[PHI: r2 r3 r5 r6 r18 r19 r20 r21 r25 r26 r27 r28 r29 r31 r32 r36 r38
      0x07ec: PHI (r2v16 short[]) = (r2v14 short[]), (r2v15 short[]), (r2v17 short[]) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r3v15 int) = (r3v13 int), (r3v14 int), (r3v16 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r5v16 int) = (r5v14 int), (r5v15 int), (r5v17 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r6v13 short[]) = (r6v11 short[]), (r6v12 short[]), (r6v14 short[]) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r18v3 short) = (r18v2 short), (r18v1 short), (r18v1 short) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r19v3 int) = (r19v1 int), (r19v2 int), (r19v1 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v3 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r21v2 short) = (r21v1 short), (r21v1 short), (r21v3 short) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r25v15 l.۫֫᩺) = (r25v13 l.۫֫᩺), (r25v14 l.۫֫᩺), (r25v16 l.۫֫᩺) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r26v15 byte[]) = (r26v13 byte[]), (r26v14 byte[]), (r26v16 byte[]) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r27v15 short[]) = (r27v13 short[]), (r27v14 short[]), (r27v16 short[]) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r28v13 android.graphics.BitmapFactory$Options) = 
      (r28v11 android.graphics.BitmapFactory$Options)
      (r28v12 android.graphics.BitmapFactory$Options)
      (r28v14 android.graphics.BitmapFactory$Options)
     binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r29v14 boolean) = (r29v12 boolean), (r29v13 boolean), (r29v15 boolean) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r31v14 int) = (r31v12 int), (r31v13 int), (r31v15 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r32v10 int) = (r32v8 int), (r32v9 int), (r32v11 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r36v18 int) = (r36v16 int), (r36v17 int), (r36v19 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r38v13 int) = (r38v11 int), (r38v12 int), (r38v14 int) binds: [B:138:0x07ea, B:134:0x07b4, B:130:0x0779] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0203  */
    /* JADX WARN: Code duplicated, block: B:52:0x0245  */
    /* JADX WARN: Code duplicated, block: B:59:0x0293 A[PHI: r10
      0x0293: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:57:0x027b, B:50:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0324 A[PHI: r2 r4 r5 r13
      0x0324: PHI (r2v81 android.graphics.BitmapFactory$Options) = 
      (r2v56 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
     binds: [B:73:0x0323, B:65:0x02db, B:62:0x02c3, B:151:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r4v99 boolean) = (r4v77 boolean), (r4v1 boolean), (r4v1 boolean), (r4v1 boolean) binds: [B:73:0x0323, B:65:0x02db, B:62:0x02c3, B:151:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r5v57 byte[]) = (r5v39 byte[]), (r5v1 byte[]), (r5v1 byte[]), (r5v1 byte[]) binds: [B:73:0x0323, B:65:0x02db, B:62:0x02c3, B:151:0x0324] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v5 int) binds: [B:73:0x0323, B:65:0x02db, B:62:0x02c3, B:151:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m29803(C2455 c2455) {
        int i;
        int i2;
        short[] sArr;
        int i3;
        BitmapFactory.Options options;
        byte[] bArr;
        short[] sArr2;
        int i4;
        short[] sArr3;
        int i5;
        C12107 c12107;
        boolean z;
        int i6;
        int iM11306;
        int i7;
        int i8;
        int i9;
        int i10;
        short[] sArr4;
        int i11;
        BitmapFactory.Options options2;
        byte[] bArr2;
        short[] sArr5;
        int i12;
        short[] sArr6;
        int i13;
        C12107 c12108;
        boolean z2;
        int i14;
        int iM45029;
        int i15;
        int i16;
        int i17;
        short[] sArr7;
        int i18;
        BitmapFactory.Options options3;
        byte[] bArr3;
        int i19;
        C12107 c12109;
        boolean z3;
        int i20;
        int i21;
        short[] sArr8;
        int i22;
        int i23;
        short[] sArr9;
        int i24;
        BitmapFactory.Options options4;
        byte[] bArr4;
        short[] sArr10;
        int i25;
        short[] sArr11;
        int i26;
        C12107 c121010;
        boolean z4;
        int iM11307;
        int i27;
        int i28;
        short[] sArr12;
        int i29;
        BitmapFactory.Options options5;
        int i30;
        C12107 c121011;
        boolean z5;
        int i31;
        int i32;
        byte[] bArr5;
        short[] sArr13;
        C12107 c12107M2916;
        int iM450210;
        int i33;
        int i34;
        BitmapFactory.Options options6;
        int i35;
        short[] sArr14;
        int i36;
        int iM11308;
        int i37;
        int i38;
        boolean z6;
        C2455 c2456 = c2455;
        C12107 c121012 = null;
        boolean z7 = false;
        byte[] bArrM44470 = null;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        Bitmap bitmapDecodeByteArray = null;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        short[] sArr15 = null;
        char c = 0;
        short s = 0;
        int i47 = 0;
        int i48 = 0;
        short s2 = 0;
        int i49 = 0;
        int i50 = -1918811288;
        int i51 = C0050.f912;
        int i52 = ThreadFactoryC3888.f14547;
        int iM450211 = (i51 - C19806.m45029("ۘ֫")) * (-97);
        int i53 = ((iM450211 ^ i52) * (-27775)) ^ 1740746559;
        int i54 = iM450211 ^ (-1911504876);
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        Bitmap bitmap = null;
        int i60 = 0;
        int i61 = 0;
        C12107 c12107M6235 = null;
        BitmapFactory.Options options7 = null;
        while (true) {
            i50 = i54 ^ (i53 & (((i50 ^ i52) * 917) >> 31));
            switch (i50) {
                case -2131669344:
                case 1473322314:
                    sArr12 = sArr18;
                    i29 = i59;
                    options5 = options7;
                    short[] sArr19 = sArr17;
                    i30 = i57;
                    c121011 = c121012;
                    z5 = z7 ? 1 : 0;
                    i31 = i55;
                    i32 = i56;
                    bArr5 = bArrM44470;
                    if (c12107M6235 == null) {
                        iM450210 = C19806.m45029("ۡ᩺") ^ i52;
                        sArr13 = sArr19;
                        i33 = ((iM450210 ^ i51) * (-26431)) ^ (-245859269);
                        i34 = -76423294;
                    } else {
                        sArr13 = sArr19;
                        c12107M2916 = c12107M6235;
                        iM450210 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i51;
                        c121011 = c12107M2916;
                        i33 = ((iM450210 ^ i52) * 27435) ^ (-1457764449);
                        i34 = 1378754899;
                    }
                    i54 = iM450210 ^ i34;
                    bArrM44470 = bArr5;
                    i55 = i31;
                    z7 = z5;
                    i57 = i30;
                    i59 = i29;
                    i53 = i33;
                    options7 = options5;
                    sArr18 = sArr12;
                    short[] sArr20 = sArr13;
                    i56 = i32;
                    c121012 = c121011;
                    sArr17 = sArr20;
                    break;
                case -2127436513:
                case 761678498:
                    AbstractC0464.m2313();
                    if (!C7105.m18985()) {
                        iM11308 = (i52 - C19806.m45029("ۖ֫")) * (-9);
                        i37 = ((iM11308 ^ i51) * 29779) ^ 701424969;
                        i38 = 1377937891;
                        i54 = iM11308 ^ i38;
                        i53 = i37;
                    } else {
                        i17 = i55;
                        sArr7 = sArr18;
                        i18 = i59;
                        options3 = options7;
                        bArr3 = bArrM44470;
                        sArr8 = sArr17;
                        i19 = i57;
                        c12109 = c121012;
                        z3 = z7 ? 1 : 0;
                        i20 = i61;
                        int iM450212 = (C19806.m45029("ᩳ۠") + i52) * 3;
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        i55 = i17;
                        i54 = iM450212 ^ 447744550;
                        sArr17 = sArr8;
                        i53 = ((iM450212 ^ i51) * 10843) ^ 444030862;
                        options7 = options3;
                        z7 = z3;
                        i57 = i19;
                        i59 = i18;
                        sArr18 = sArr7;
                    }
                    break;
                case -2085953481:
                case -1750308342:
                    z7 = false;
                    z7 = false;
                    bArrM44470 = C19431.m44470(C2332.m7072(c2456, c121012), 0);
                    try {
                        options7 = new BitmapFactory.Options();
                        i39 = 1;
                        options7.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(bArrM44470, 0, bArrM44470.length, options7);
                        i40 = options7.outWidth;
                        i41 = options7.outHeight;
                        iM11308 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i51;
                        i37 = ((iM11308 ^ i52) * 31651) ^ 1240368504;
                        i38 = -86313859;
                    } catch (IOException unused) {
                        options7 = null;
                        iM11308 = C19806.m45029("ۤۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * (-2561)) ^ (-718572690);
                        i38 = 1871788493;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -2084299627:
                case 1644780395:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    if (i48 - (i49 + 1) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܰ") ^ i51;
                        i53 = ((iM45029 ^ i52) * 19495) ^ 188629607;
                        i15 = 1802387367;
                    } else {
                        iM45029 = C19806.m45029("ۨ֨") ^ i52;
                        i53 = ((iM45029 ^ i51) * (-7497)) ^ 67732991;
                        i15 = -2106646368;
                    }
                    int i62 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i62;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -2072876661:
                case -1686509866:
                    C1937.m6279();
                    C1419.m4973();
                    return null;
                case -2071984728:
                case -943691679:
                    options7.inSampleSize = i39;
                    options7.inPreferredConfig = Bitmap.Config.RGB_565;
                    i43 = i40;
                    i45 = i41;
                    iM11308 = C19806.m45029("ܺۛ") ^ i51;
                    i37 = ((iM11308 ^ i52) * (-29643)) ^ (-1808740318);
                    i38 = 1599444700;
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -2034456119:
                case 972593522:
                    if (i46 <= i42) {
                        iM11308 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * 4977) ^ 1255449783;
                        i38 = 327713703;
                    } else {
                        i43 = i44;
                        i45 = i46;
                        iM11308 = C19806.m45029("ܺۛ") ^ i51;
                        i37 = ((iM11308 ^ i52) * (-29643)) ^ (-1808740318);
                        i38 = 1599444700;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -2028672877:
                case 1212289038:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    i47 = s + 1;
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i52 - C19806.m45029("᩹ᩴ")) * (-31);
                        i53 = ((iM45029 ^ i51) * 1107) ^ (-396775180);
                        i15 = 639930018;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۤ") ^ i52;
                        i53 = ((iM45029 ^ i51) * (-28861)) ^ 701485551;
                        i15 = -194909316;
                    }
                    int i63 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i63;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -2018834279:
                case -1574910278:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    i49 = s * s2;
                    if (C1977.m6356()) {
                        iM45029 = (i51 - C19806.m45029("᩶ۚ")) * (-127);
                        i53 = ((iM45029 ^ i52) * 3055) ^ 1919331103;
                        i15 = -522075776;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۢ") ^ i51;
                        i53 = ((iM45029 ^ i52) * (-1963)) ^ (-2003343646);
                        i15 = -806502851;
                    }
                    int i64 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i64;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -1942672003:
                case -1204203616:
                    c12109 = c121012;
                    bArr3 = bArrM44470;
                    sArr7 = sArr18;
                    int i65 = i59;
                    options3 = options7;
                    i19 = i57;
                    z3 = z7 ? 1 : 0;
                    sArr8 = f40134;
                    i56 = 8;
                    if (C0962.f3784) {
                        i18 = i65;
                        i20 = i61;
                        i17 = 184;
                        int iM450213 = (C19806.m45029("ᩳ۠") + i52) * 3;
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        i55 = i17;
                        i54 = iM450213 ^ 447744550;
                        sArr17 = sArr8;
                        i53 = ((iM450213 ^ i51) * 10843) ^ 444030862;
                        options7 = options3;
                        z7 = z3;
                        i57 = i19;
                        i59 = i18;
                    } else {
                        int iM450214 = (C19806.m45029("ۨ۟") ^ i51) * (-29);
                        int i66 = ((iM450214 ^ i52) * 14703) ^ 252636872;
                        i54 = iM450214 ^ (-1623732916);
                        c121012 = c12109;
                        z7 = z3 ? 1 : 0;
                        i57 = i19;
                        i59 = i65;
                        sArr17 = sArr8;
                        i53 = i66;
                        bArrM44470 = bArr3;
                        options7 = options3;
                        i55 = 184;
                    }
                    sArr18 = sArr7;
                    break;
                case -1791428577:
                case 1045975790:
                    return bitmapDecodeByteArray;
                case -1673484099:
                case -1532598790:
                    C0526.m2437();
                    if (!RunnableC1564.f6300) {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i51;
                        i53 = ((iM45029 ^ i52) * 16205) ^ 555160763;
                        i15 = 1675884967;
                        int i67 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i67;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    } else {
                        iM11308 = (i52 - ThreadFactoryC3888.m11306("ܶۙ")) * 31;
                        i37 = ((iM11308 ^ i51) * 8081) ^ 1276451329;
                        i38 = -293062999;
                        i54 = iM11308 ^ i38;
                        i53 = i37;
                    }
                    break;
                case -1626614566:
                case -1391281601:
                    options6 = options7;
                    boolean z8 = z7 ? 1 : 0;
                    i35 = i59;
                    sArr14 = f40134;
                    i58 = 8;
                    if (C1419.f5860 >= 0) {
                        i36 = 192;
                        z6 = z8;
                        int iM11309 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i52;
                        short[] sArr21 = sArr14;
                        i54 = iM11309 ^ 1223320635;
                        i59 = i35;
                        i53 = ((iM11309 ^ i51) * (-6903)) ^ (-844003025);
                        options7 = options6;
                        sArr18 = sArr21;
                        boolean z9 = z6;
                        i57 = i36;
                        z7 = z9 ? 1 : 0;
                    } else {
                        int iM450215 = (C19806.m45029("ᩳۗ") ^ i52) * 45;
                        i54 = iM450215 ^ (-295320829);
                        i59 = i35;
                        i53 = ((iM450215 ^ i51) * 32499) ^ (-567732311);
                        z7 = z8 ? 1 : 0;
                        i57 = 192;
                        sArr18 = sArr14;
                        options7 = options6;
                    }
                    break;
                case -1579044919:
                case -1225566371:
                    if (i40 > 0) {
                        iM11308 = (C19806.m45029("᩹ܺ") ^ i52) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i37 = ((iM11308 ^ i51) * (-31883)) ^ 2138159723;
                        i38 = 2034606651;
                    } else {
                        iM11308 = C19806.m45029("ۤۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * (-2561)) ^ (-718572690);
                        i38 = 1871788493;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -1576969336:
                case -1366618014:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    i48 = i47 * i47;
                    s2 = 2;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i52 - C19806.m45029("᩹ᩴ")) * (-31);
                        i53 = ((iM45029 ^ i51) * 1107) ^ (-396775180);
                        i15 = 639930018;
                    } else {
                        iM45029 = (i52 - ThreadFactoryC3888.m11306("֡֨")) * 77;
                        i53 = ((iM45029 ^ i51) * 16583) ^ (-1044892779);
                        i15 = 1503303107;
                    }
                    int i68 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i68;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -1484362354:
                case 1148078039:
                    i17 = i55;
                    int i69 = i56;
                    sArr7 = sArr18;
                    i18 = i59;
                    options3 = options7;
                    bArr3 = bArrM44470;
                    short[] sArr22 = sArr17;
                    i19 = i57;
                    c12109 = c121012;
                    z3 = z7 ? 1 : 0;
                    i20 = i61;
                    sArr16 = f40134;
                    i60 = HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        int iM450216 = C19806.m45029("֫ۨ") ^ i51;
                        i21 = ((iM450216 ^ i52) * (-25307)) ^ (-1621564717);
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        sArr17 = sArr22;
                        z7 = z3 ? 1 : 0;
                        i57 = i19;
                        i56 = i69;
                        i55 = i17;
                        i59 = i18;
                        i54 = iM450216 ^ (-110676436);
                        i53 = i21;
                        options7 = options3;
                        sArr18 = sArr7;
                    } else {
                        sArr8 = sArr22;
                        i56 = i69;
                        int iM450217 = (C19806.m45029("ᩳ۠") + i52) * 3;
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        i55 = i17;
                        i54 = iM450217 ^ 447744550;
                        sArr17 = sArr8;
                        i53 = ((iM450217 ^ i51) * 10843) ^ 444030862;
                        options7 = options3;
                        z7 = z3;
                        i57 = i19;
                        i59 = i18;
                        sArr18 = sArr7;
                    }
                    break;
                case -1438713372:
                case 1316462383:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    sArr15 = f40134;
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("֡᩹") ^ i51;
                        i53 = ((iM45029 ^ i52) * 22409) ^ (-2035653846);
                        i15 = -853822460;
                    } else {
                        iM45029 = (C19806.m45029("ᩳᩴ") + i51) * 87;
                        i53 = ((iM45029 ^ i52) * 25293) ^ 1170411660;
                        i15 = -2042483172;
                    }
                    int i610 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i610;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -1401138325:
                case 1681465857:
                    C2871.m8646();
                    if (RunnableC1895.m6170() != 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ܿ۬") + i51) * 45;
                        i37 = ((iM11308 ^ i52) * 17861) ^ 1797749568;
                        i38 = 7236927;
                        i54 = iM11308 ^ i38;
                        i53 = i37;
                    } else {
                        i35 = i59;
                        short[] sArr23 = sArr18;
                        options6 = options7;
                        sArr14 = sArr23;
                        int i70 = i57;
                        z6 = z7 ? 1 : 0;
                        i36 = i70;
                        int iM113010 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i52;
                        short[] sArr24 = sArr14;
                        i54 = iM113010 ^ 1223320635;
                        i59 = i35;
                        i53 = ((iM113010 ^ i51) * (-6903)) ^ (-844003025);
                        options7 = options6;
                        sArr18 = sArr24;
                        boolean z10 = z6;
                        i57 = i36;
                        z7 = z10 ? 1 : 0;
                    }
                    break;
                case -1279841128:
                case -95045239:
                    i42 = 600;
                    if (i40 <= 600) {
                        iM11308 = ThreadFactoryC3888.m11306("֫ۜ") ^ i51;
                        i37 = ((iM11308 ^ i52) * (-23495)) ^ (-183947710);
                        i38 = 85492949;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۫ܳ") ^ i52;
                        i37 = ((iM11308 ^ i51) * 12017) ^ 1103955862;
                        i38 = -1851572275;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -1271990860:
                case 1708900608:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    c = 174;
                    if (C2477.m7593() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i51;
                        i53 = ((iM45029 ^ i52) * 16205) ^ 555160763;
                        i15 = 1675884967;
                    } else {
                        iM45029 = C19806.m45029("ۢܺ") ^ i52;
                        i53 = ((iM45029 ^ i51) * 3843) ^ 533786265;
                        i15 = -1834575304;
                    }
                    int i611 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i611;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -1253238446:
                case 2075346723:
                    i22 = i55;
                    i23 = i56;
                    sArr9 = sArr18;
                    i24 = i59;
                    options4 = options7;
                    bArr4 = bArrM44470;
                    sArr10 = sArr17;
                    i25 = i57;
                    sArr11 = sArr16;
                    i26 = i60;
                    c121010 = c121012;
                    z4 = z7 ? 1 : 0;
                    i61 = 9;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩹") ^ i52;
                        i27 = ((iM11307 ^ i51) * 28475) ^ (-1475661377);
                        i28 = -1659743374;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۬ۙ") ^ i52;
                        i27 = ((iM11307 ^ i51) * 17823) ^ 343363619;
                        i28 = 1726174777;
                    }
                    int i71 = iM11307 ^ i28;
                    sArr16 = sArr11;
                    i60 = i26;
                    bArrM44470 = bArr4;
                    options7 = options4;
                    z7 = z4;
                    i57 = i25;
                    i55 = i22;
                    i59 = i24;
                    i54 = i71;
                    i53 = i27;
                    sArr18 = sArr9;
                    c121012 = c121010;
                    sArr17 = sArr10;
                    i56 = i23;
                    break;
                case -1073618448:
                case -783462672:
                    sArr = sArr18;
                    int i72 = i59;
                    options = options7;
                    short[] sArr25 = sArr17;
                    i4 = i57;
                    c12107 = c121012;
                    z = z7 ? 1 : 0;
                    int i73 = i55;
                    int i74 = i56;
                    bArr = bArrM44470;
                    i3 = i72;
                    sArr2 = sArr25;
                    i2 = i74;
                    i = i73;
                    c12107M6235 = ViewGroupOnHierarchyChangeListenerC1916.m6235(c2456, C1025.m3859(sArr25, i73, i74, i72));
                    sArr3 = sArr16;
                    i5 = i60;
                    i6 = i61;
                    iM11306 = (C19806.m45029("۫᩻") ^ i52) * (-49);
                    i7 = ((iM11306 ^ i51) * (-32303)) ^ 776558645;
                    i8 = -167495188;
                    int i75 = iM11306 ^ i8;
                    sArr16 = sArr3;
                    i61 = i6;
                    i60 = i5;
                    c121012 = c12107;
                    bArrM44470 = bArr;
                    sArr17 = sArr2;
                    options7 = options;
                    i56 = i2;
                    i55 = i;
                    i54 = i75;
                    i53 = i7;
                    sArr18 = sArr;
                    z7 = z;
                    i57 = i4;
                    i59 = i3;
                    break;
                case -1063595325:
                case -150817197:
                    sArr12 = sArr18;
                    int i76 = i57;
                    i29 = i59;
                    options5 = options7;
                    z5 = z7 ? 1 : 0;
                    i30 = i76;
                    c12107M2916 = C0629.m2916(c2456, C1977.m6363(sArr12, i76, i58, i29));
                    i31 = i55;
                    i32 = i56;
                    bArr5 = bArrM44470;
                    sArr13 = sArr17;
                    iM450210 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i51;
                    c121011 = c12107M2916;
                    i33 = ((iM450210 ^ i52) * 27435) ^ (-1457764449);
                    i34 = 1378754899;
                    i54 = iM450210 ^ i34;
                    bArrM44470 = bArr5;
                    i55 = i31;
                    z7 = z5;
                    i57 = i30;
                    i59 = i29;
                    i53 = i33;
                    options7 = options5;
                    sArr18 = sArr12;
                    short[] sArr26 = sArr13;
                    i56 = i32;
                    c121012 = c121011;
                    sArr17 = sArr26;
                    break;
                case -993669980:
                case 2031156544:
                    i9 = i55;
                    i10 = i56;
                    sArr4 = sArr18;
                    i11 = i59;
                    options2 = options7;
                    bArr2 = bArrM44470;
                    sArr5 = sArr17;
                    i12 = i57;
                    sArr6 = sArr16;
                    i13 = i60;
                    c12108 = c121012;
                    z2 = z7 ? 1 : 0;
                    i14 = i61;
                    s = sArr15[c];
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i52 - C19806.m45029("᩹ᩴ")) * (-31);
                        i53 = ((iM45029 ^ i51) * 1107) ^ (-396775180);
                        i15 = 639930018;
                    } else {
                        iM45029 = (C19806.m45029("ۧۙ") ^ i51) * 59;
                        i53 = ((iM45029 ^ i52) * (-17393)) ^ 88270908;
                        i15 = 178854616;
                    }
                    int i612 = iM45029 ^ i15;
                    sArr16 = sArr6;
                    i61 = i14;
                    i60 = i13;
                    c121012 = c12108;
                    bArrM44470 = bArr2;
                    sArr17 = sArr5;
                    options7 = options2;
                    z7 = z2;
                    i57 = i12;
                    i56 = i10;
                    i55 = i9;
                    i59 = i11;
                    i54 = i612;
                    sArr18 = sArr4;
                    c2456 = c2455;
                    break;
                case -958379582:
                case 658799372:
                    i16 = 52115;
                    int iM113011 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i51) * 49;
                    int i77 = ((iM113011 ^ i52) * (-4851)) ^ (-951402975);
                    sArr16 = sArr16;
                    i61 = i61;
                    i60 = i60;
                    c121012 = c121012;
                    bArrM44470 = bArrM44470;
                    sArr17 = sArr17;
                    options7 = options7;
                    i56 = i56;
                    i55 = i55;
                    i54 = iM113011 ^ 1703072597;
                    sArr18 = sArr18;
                    z7 = z7 ? 1 : 0;
                    i57 = i57;
                    i59 = i16;
                    i53 = i77;
                    c2456 = c2455;
                    break;
                case -940003577:
                case 512401598:
                    if (!C1377.f5749) {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = (i51 - C19806.m45029("᩶ۚ")) * (-127);
                        i53 = ((iM45029 ^ i52) * 3055) ^ 1919331103;
                        i15 = -522075776;
                        int i613 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i613;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    } else {
                        i17 = i55;
                        sArr7 = sArr18;
                        i18 = i59;
                        options3 = options7;
                        bArr3 = bArrM44470;
                        sArr8 = sArr17;
                        i19 = i57;
                        c12109 = c121012;
                        z3 = z7 ? 1 : 0;
                        i20 = i61;
                        int iM450218 = (C19806.m45029("ᩳ۠") + i52) * 3;
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        i55 = i17;
                        i54 = iM450218 ^ 447744550;
                        sArr17 = sArr8;
                        i53 = ((iM450218 ^ i51) * 10843) ^ 444030862;
                        options7 = options3;
                        z7 = z3;
                        i57 = i19;
                        i59 = i18;
                        sArr18 = sArr7;
                    }
                    break;
                case -933540452:
                case 503838697:
                    sArr7 = sArr18;
                    int i78 = i59;
                    options3 = options7;
                    int i79 = i57;
                    int i80 = i58;
                    boolean z11 = z7 ? 1 : 0;
                    if (c121012 == null) {
                        int iM113012 = ThreadFactoryC3888.m11306("ۜۘ") ^ i51;
                        i58 = i80;
                        i21 = ((iM113012 ^ i52) * (-7321)) ^ 1652987957;
                        i54 = iM113012 ^ 576992098;
                        z7 = z11 ? 1 : 0;
                        i57 = i79;
                        i59 = i78;
                        i53 = i21;
                        options7 = options3;
                        sArr18 = sArr7;
                    } else {
                        i58 = i80;
                        int iM113013 = ThreadFactoryC3888.m11306("ܿۨ") ^ i51;
                        int i81 = ((iM113013 ^ i52) * 379) ^ (-8760089);
                        i54 = iM113013 ^ (-611969952);
                        options7 = options3;
                        sArr18 = sArr7;
                        i59 = i78;
                        i53 = i81;
                        z7 = z11 ? 1 : 0;
                        i57 = i79;
                    }
                    break;
                case -881778068:
                case 2020898460:
                    if (C1875.f7103 >= 0) {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = C19806.m45029("֡᩹") ^ i51;
                        i53 = ((iM45029 ^ i52) * 22409) ^ (-2035653846);
                        i15 = -853822460;
                        int i614 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i614;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    } else {
                        i17 = i55;
                        sArr7 = sArr18;
                        i18 = i59;
                        options3 = options7;
                        bArr3 = bArrM44470;
                        sArr8 = sArr17;
                        i19 = i57;
                        c12109 = c121012;
                        z3 = z7 ? 1 : 0;
                        i20 = i61;
                        int iM450219 = (C19806.m45029("ᩳ۠") + i52) * 3;
                        i61 = i20;
                        c121012 = c12109;
                        bArrM44470 = bArr3;
                        i55 = i17;
                        i54 = iM450219 ^ 447744550;
                        sArr17 = sArr8;
                        i53 = ((iM450219 ^ i51) * 10843) ^ 444030862;
                        options7 = options3;
                        z7 = z3;
                        i57 = i19;
                        i59 = i18;
                        sArr18 = sArr7;
                    }
                    break;
                case -737382044:
                case -179538566:
                    i16 = 63156;
                    int iM113014 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i51) * 49;
                    int i710 = ((iM113014 ^ i52) * (-4851)) ^ (-951402975);
                    sArr16 = sArr16;
                    i61 = i61;
                    i60 = i60;
                    c121012 = c121012;
                    bArrM44470 = bArrM44470;
                    sArr17 = sArr17;
                    options7 = options7;
                    i56 = i56;
                    i55 = i55;
                    i54 = iM113014 ^ 1703072597;
                    sArr18 = sArr18;
                    z7 = z7 ? 1 : 0;
                    i57 = i57;
                    i59 = i16;
                    i53 = i710;
                    c2456 = c2455;
                    break;
                case -661242177:
                case 215117493:
                    if (C0671.f2816 != 0) {
                        i22 = i55;
                        i23 = i56;
                        sArr9 = sArr18;
                        i24 = i59;
                        options4 = options7;
                        bArr4 = bArrM44470;
                        sArr10 = sArr17;
                        i25 = i57;
                        sArr11 = sArr16;
                        i26 = i60;
                        c121010 = c121012;
                        z4 = z7 ? 1 : 0;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩹") ^ i52;
                        i27 = ((iM11307 ^ i51) * 28475) ^ (-1475661377);
                        i28 = -1659743374;
                        int i711 = iM11307 ^ i28;
                        sArr16 = sArr11;
                        i60 = i26;
                        bArrM44470 = bArr4;
                        options7 = options4;
                        z7 = z4;
                        i57 = i25;
                        i55 = i22;
                        i59 = i24;
                        i54 = i711;
                        i53 = i27;
                        sArr18 = sArr9;
                        c121012 = c121010;
                        sArr17 = sArr10;
                        i56 = i23;
                    } else {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = C19806.m45029("֡᩹") ^ i51;
                        i53 = ((iM45029 ^ i52) * 22409) ^ (-2035653846);
                        i15 = -853822460;
                        int i615 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i615;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    }
                    break;
                case -615066037:
                case 1674292623:
                    C1148.m4232();
                    if (!C3743.f13569) {
                        i35 = i59;
                        short[] sArr27 = sArr18;
                        options6 = options7;
                        sArr14 = sArr27;
                        int i712 = i57;
                        z6 = z7 ? 1 : 0;
                        i36 = i712;
                        int iM113015 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i52;
                        short[] sArr28 = sArr14;
                        i54 = iM113015 ^ 1223320635;
                        i59 = i35;
                        i53 = ((iM113015 ^ i51) * (-6903)) ^ (-844003025);
                        options7 = options6;
                        sArr18 = sArr28;
                        boolean z12 = z6;
                        i57 = i36;
                        z7 = z12 ? 1 : 0;
                    } else {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i51;
                        i53 = ((iM45029 ^ i52) * 16205) ^ 555160763;
                        i15 = 1675884967;
                        int i616 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i616;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    }
                    break;
                case -556471645:
                case 1228057511:
                    if (i41 > i42) {
                        iM11308 = ThreadFactoryC3888.m11306("۫ܳ") ^ i52;
                        i37 = ((iM11308 ^ i51) * 12017) ^ 1103955862;
                        i38 = -1851572275;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * 4977) ^ 1255449783;
                        i38 = 327713703;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case -280804674:
                case 972189627:
                case 993971861:
                case 1850634749:
                    return bitmap;
                case -241958812:
                case 478684916:
                    i = i55;
                    i2 = i56;
                    sArr = sArr18;
                    i3 = i59;
                    options = options7;
                    bArr = bArrM44470;
                    sArr2 = sArr17;
                    i4 = i57;
                    sArr3 = sArr16;
                    i5 = i60;
                    c12107 = c121012;
                    z = z7 ? 1 : 0;
                    i6 = i61;
                    bitmap = null;
                    if (c2456 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۗ") ^ i51;
                        i7 = ((iM11306 ^ i52) * 29449) ^ 469054016;
                        i8 = 1139191597;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i52;
                        i7 = ((iM11306 ^ i51) * 27605) ^ 538090830;
                        i8 = -236642986;
                    }
                    int i713 = iM11306 ^ i8;
                    sArr16 = sArr3;
                    i61 = i6;
                    i60 = i5;
                    c121012 = c12107;
                    bArrM44470 = bArr;
                    sArr17 = sArr2;
                    options7 = options;
                    i56 = i2;
                    i55 = i;
                    i54 = i713;
                    i53 = i7;
                    sArr18 = sArr;
                    z7 = z;
                    i57 = i4;
                    i59 = i3;
                    break;
                case 98560081:
                case 265088046:
                    return bitmap;
                case 153865560:
                case 801756787:
                    C3286.m9798();
                    C0671.m3008();
                    iM11308 = (i52 - ThreadFactoryC3888.m11306("ܶۙ")) * 31;
                    i37 = ((iM11308 ^ i51) * 8081) ^ 1276451329;
                    i38 = -293062999;
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case 204767680:
                case 1233244279:
                    if (i44 <= i42) {
                        iM11308 = ThreadFactoryC3888.m11306("۟ܰ") ^ i51;
                        i37 = ((iM11308 ^ i52) * (-25397)) ^ (-1139014135);
                        i38 = -896078821;
                    } else {
                        i43 = i44;
                        i45 = i46;
                        iM11308 = C19806.m45029("ܺۛ") ^ i51;
                        i37 = ((iM11308 ^ i52) * (-29643)) ^ (-1808740318);
                        i38 = 1599444700;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case 327150046:
                case 1762016194:
                    try {
                        options7.inSampleSize *= 2;
                        i44 = i43 / 2;
                        i46 = i45 / 2;
                        iM11308 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i51;
                        i37 = ((iM11308 ^ i52) * (-8027)) ^ (-141504126);
                        i38 = 1075771285;
                    } catch (IOException unused2) {
                        iM11308 = C19806.m45029("ۤۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * (-2561)) ^ (-718572690);
                        i38 = 1871788493;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case 343960003:
                case 1172845119:
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM44470, z7 ? 1 : 0, bArrM44470.length, options7);
                    iM11308 = C19806.m45029("ۜ᩵") ^ i52;
                    i37 = ((iM11308 ^ i51) * (-15765)) ^ (-1161326373);
                    i38 = 1748711411;
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case 428098645:
                case 749165547:
                    if (C7105.f23796 >= 0) {
                        iM11308 = (i52 - C19806.m45029("ۖ֫")) * (-9);
                        i37 = ((iM11308 ^ i51) * 29779) ^ 701424969;
                        i38 = 1377937891;
                        i54 = iM11308 ^ i38;
                        i53 = i37;
                    } else {
                        i9 = i55;
                        i10 = i56;
                        sArr4 = sArr18;
                        i11 = i59;
                        options2 = options7;
                        bArr2 = bArrM44470;
                        sArr5 = sArr17;
                        i12 = i57;
                        sArr6 = sArr16;
                        i13 = i60;
                        c12108 = c121012;
                        z2 = z7 ? 1 : 0;
                        i14 = i61;
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i51;
                        i53 = ((iM45029 ^ i52) * 16205) ^ 555160763;
                        i15 = 1675884967;
                        int i617 = iM45029 ^ i15;
                        sArr16 = sArr6;
                        i61 = i14;
                        i60 = i13;
                        c121012 = c12108;
                        bArrM44470 = bArr2;
                        sArr17 = sArr5;
                        options7 = options2;
                        z7 = z2;
                        i57 = i12;
                        i56 = i10;
                        i55 = i9;
                        i59 = i11;
                        i54 = i617;
                        sArr18 = sArr4;
                        c2456 = c2455;
                    }
                    break;
                case 780448577:
                case 1623934477:
                    options7.inJustDecodeBounds = z7;
                    iM11308 = (i52 - ThreadFactoryC3888.m11306("۟᩷")) * 87;
                    i37 = ((iM11308 ^ i51) * 5159) ^ (-180930768);
                    i38 = -399136500;
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                case 845013803:
                case 1508582446:
                    if (i41 <= 0) {
                        iM11308 = C19806.m45029("ۤۖ") ^ i52;
                        i37 = ((iM11308 ^ i51) * (-2561)) ^ (-718572690);
                        i38 = 1871788493;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("֡֡") ^ i51;
                        i37 = ((iM11308 ^ i52) * 32233) ^ (-1380308397);
                        i38 = 1655611010;
                    }
                    i54 = iM11308 ^ i38;
                    i53 = i37;
                    break;
                default:
                    i = i55;
                    i2 = i56;
                    sArr = sArr18;
                    int i82 = i59;
                    options = options7;
                    bArr = bArrM44470;
                    sArr2 = sArr17;
                    i4 = i57;
                    sArr3 = sArr16;
                    i5 = i60;
                    c12107 = c121012;
                    z = z7 ? 1 : 0;
                    i6 = i61;
                    C12107 c12107M6236 = ViewGroupOnHierarchyChangeListenerC1916.m6235(c2456, ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr3, i5, i6, i82));
                    if (c12107M6236 == null) {
                        int iM113016 = (ThreadFactoryC3888.m11306("۟ᩳ") + i52) * 29;
                        i3 = i82;
                        i53 = ((iM113016 ^ i51) * (-22909)) ^ (-2090142932);
                        sArr16 = sArr3;
                        i61 = i6;
                        i60 = i5;
                        c121012 = c12107;
                        bArrM44470 = bArr;
                        sArr17 = sArr2;
                        options7 = options;
                        i56 = i2;
                        i55 = i;
                        i54 = iM113016 ^ 1901628728;
                    } else {
                        i3 = i82;
                        c12107M6235 = c12107M6236;
                        iM11306 = (C19806.m45029("۫᩻") ^ i52) * (-49);
                        i7 = ((iM11306 ^ i51) * (-32303)) ^ 776558645;
                        i8 = -167495188;
                        int i714 = iM11306 ^ i8;
                        sArr16 = sArr3;
                        i61 = i6;
                        i60 = i5;
                        c121012 = c12107;
                        bArrM44470 = bArr;
                        sArr17 = sArr2;
                        options7 = options;
                        i56 = i2;
                        i55 = i;
                        i54 = i714;
                        i53 = i7;
                    }
                    sArr18 = sArr;
                    z7 = z;
                    i57 = i4;
                    i59 = i3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m29845() {
        PluginContext pluginContextM29831 = null;
        String str = null;
        String strM6367 = null;
        int i = -1819634486;
        int i2 = C1025.f4800;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("᩶ۙ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-551)) ^ 673138405;
        int i5 = -1966743382;
        while (true) {
            i = ((((i ^ i3) * (-26549)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2122825849:
                case -513750443:
                    return str;
                case -2077949166:
                case 1530614354:
                    C19806.m45024();
                    C3660.m10791();
                    return null;
                case -2072522116:
                case -281704465:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14723)) ^ 1842519588;
                        i5 = 1785472873;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9489)) ^ 746504632;
                        i5 = 310212629;
                    }
                    break;
                case -2070658252:
                case -4916223:
                    if (C1977.m6360(str) >= 3) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14297)) ^ (-1774038705);
                        i5 = 490900853;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30719) ^ 263575076;
                        i5 = -1473858928;
                    }
                    break;
                case -1898370683:
                case -1041030369:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31597)) ^ 855176876;
                        i5 = -852363114;
                    } else {
                        iM45029 = C19806.m45029("ۡ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13555)) ^ 459008306;
                        i5 = -1504402630;
                    }
                    break;
                case -1815824106:
                case -1197149931:
                    return strM6367;
                case -1769978937:
                case 1327143818:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14723)) ^ 1842519588;
                        i5 = 1785472873;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27081) ^ 289958007;
                        i5 = -2144032709;
                    }
                    break;
                case -1584303832:
                case -359553632:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ۧܽ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * (-14967)) ^ 669678488;
                        i5 = 1419097807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20493) ^ (-370452907);
                        i5 = -1158044865;
                    }
                    break;
                case -1546496544:
                case -320569116:
                    C3577.m10565();
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31597)) ^ 855176876;
                        i5 = -852363114;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14723)) ^ 1842519588;
                        i5 = 1785472873;
                    }
                    break;
                case -1159796265:
                case 878783754:
                    C1937.m6279();
                    RunnableC0195.m1431();
                    iM45029 = ThreadFactoryC3888.m11306("ܿܳ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-9489)) ^ 746504632;
                    i5 = 310212629;
                    break;
                case -966835582:
                case -911799688:
                    if (C0216.m1576(1, str) == '}') {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩳ") ^ i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-26835)) ^ (-101138700);
                        i5 = -793678756;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30719) ^ 263575076;
                        i5 = -1473858928;
                    }
                    break;
                case -839892333:
                case 1209062415:
                    if (C1977.m6362(str, 0) == '{') {
                        iM45029 = (C19806.m45029("ᩳۘ") ^ i3) * 59;
                        i4 = ((iM45029 ^ i2) * (-10123)) ^ (-865582661);
                        i5 = 713493162;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30719) ^ 263575076;
                        i5 = -1473858928;
                    }
                    break;
                case -777598716:
                case 1517760326:
                    pluginContextM29831 = m29831();
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("֡᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13241) ^ (-1524068691);
                        i5 = -1119708263;
                    } else {
                        iM45029 = C19806.m45029("۠᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15759)) ^ 1715531399;
                        i5 = 41080698;
                    }
                    break;
                case -758920146:
                case 1155709310:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31597)) ^ 855176876;
                        i5 = -852363114;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܿ")) * 5;
                        i4 = ((iM45029 ^ i2) * 22351) ^ (-1734276438);
                        i5 = -1176636466;
                    }
                    break;
                case -679459161:
                case 2048319543:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14723)) ^ 1842519588;
                        i5 = 1785472873;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܳܽ")) * (-77);
                        i4 = ((iM45029 ^ i3) * (-10289)) ^ (-957045084);
                        i5 = -640773794;
                    }
                    break;
                case -670692399:
                case -479184191:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ᩴۢ") + i3) * (-109);
                        i4 = ((iM45029 ^ i2) * (-21535)) ^ (-1710841658);
                        i5 = 176767500;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14723)) ^ 1842519588;
                        i5 = 1785472873;
                    }
                    break;
                case -446660129:
                case 1140401994:
                    strM6367 = C1977.m6367((C10659) pluginContextM29831, str);
                    if (strM6367 != null) {
                        iM45029 = (i2 - C19806.m45029("ۖ۠")) * 61;
                        i4 = ((iM45029 ^ i3) * 13149) ^ (-654864679);
                        i5 = 704088615;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30719) ^ 263575076;
                        i5 = -1473858928;
                    }
                    break;
                case -205551441:
                case 1563482409:
                    str = this.f40154;
                    if (RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("֡᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13241) ^ (-1524068691);
                        i5 = -1119708263;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15387)) ^ (-767681908);
                        i5 = 788911319;
                    }
                    break;
                case -201023748:
                case -125922933:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ۧܽ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * (-14967)) ^ 669678488;
                        i5 = 1419097807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9489)) ^ 746504632;
                        i5 = 310212629;
                    }
                    break;
                case 312584127:
                case 1994755050:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9489)) ^ 746504632;
                        i5 = 310212629;
                    } else {
                        iM45029 = (C19806.m45029("ۙܽ") ^ i3) * (-79);
                        i4 = ((iM45029 ^ i2) * (-28957)) ^ (-163612363);
                        i5 = 742765933;
                    }
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("֡᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13241) ^ (-1524068691);
                        i5 = -1119708263;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺ᩻")) * 65;
                        i4 = ((iM45029 ^ i3) * (-24169)) ^ 485664595;
                        i5 = 1568603366;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PluginContext m29831() {
        int i = 1674083857;
        int i2 = C3577.f13150;
        int i3 = RunnableC0195.f1321;
        int iM45029 = C19806.m45029("ۡ᩶") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-8647)) ^ 1074495416;
        int i5 = -1108178275;
        while (true) {
            i = ((((i ^ i2) * (-22861)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2059357655:
                case 690729305:
                    if (this.f40147 == null) {
                        iM45029 = (C19806.m45029("᩻ܳ") + i2) * (-23);
                        i4 = ((iM45029 ^ i3) * (-28891)) ^ (-62186413);
                        i5 = -1836347111;
                    } else {
                        iM45029 = C19806.m45029("ۜۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20481) ^ (-595717944);
                        i5 = -450091096;
                    }
                    break;
                case -2050017926:
                case -1675986471:
                    m29802((C2455) null);
                    iM45029 = C19806.m45029("ۜۧ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 20481) ^ (-595717944);
                    i5 = -450091096;
                    break;
                case -1689824385:
                case 1377722598:
                    if (C0817.m3399()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۬") ^ i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-20359)) ^ (-2137339558);
                        i5 = 135182383;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 20441) ^ 1917443766;
                        i5 = -1304459381;
                    }
                    break;
                case -1307512426:
                case -175419246:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27009) ^ 1694744936;
                        i5 = -1481119412;
                    } else {
                        iM45029 = C19806.m45029("ܺۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27731)) ^ 445850640;
                        i5 = -1238162983;
                    }
                    break;
                case -1167304769:
                case -464110799:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4883) ^ (-262323392);
                        i5 = 1322939713;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15829)) ^ (-813402609);
                        i5 = -948804585;
                    }
                    break;
                case -1071908695:
                case -1009724839:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27009) ^ 1694744936;
                        i5 = -1481119412;
                    } else {
                        iM45029 = C19806.m45029("᩵ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24749) ^ (-1395870882);
                        i5 = -1743871908;
                    }
                    break;
                case -895617114:
                case -657082040:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 20441) ^ 1917443766;
                        i5 = -1304459381;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1959) ^ (-371437134);
                        i5 = 1610998500;
                    }
                    break;
                case -528452770:
                case 1178305623:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6819) ^ (-1643350864);
                        i5 = -273596257;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۧۘ")) * 85;
                        i4 = ((iM45029 ^ i3) * 31445) ^ (-2072233559);
                        i5 = -1873353544;
                    }
                    break;
                case -317751331:
                case 392624320:
                    if (!C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 20441) ^ 1917443766;
                        i5 = -1304459381;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32205) ^ (-1830349364);
                        i5 = -1959885577;
                    }
                    break;
                case -142111682:
                case -80909238:
                    C7105.m18985();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32205) ^ (-1830349364);
                        i5 = -1959885577;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6819) ^ (-1643350864);
                        i5 = -273596257;
                    }
                    break;
                case 300097832:
                case 737925112:
                    C1419.m4973();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = ThreadFactoryC3888.m11306("֨ܽ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 6819) ^ (-1643350864);
                    i5 = -273596257;
                    break;
                case 367399253:
                case 602511606:
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6819) ^ (-1643350864);
                        i5 = -273596257;
                    } else {
                        iM45029 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18997)) ^ 848257975;
                        i5 = 1347437854;
                    }
                    break;
                case 505918331:
                case 673795470:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 20441) ^ 1917443766;
                        i5 = -1304459381;
                    } else {
                        iM45029 = C19806.m45029("ۜۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25731) ^ (-398049312);
                        i5 = 547475094;
                    }
                    break;
                case 529101366:
                case 1281630297:
                    C3660.m10791();
                    C1189.m4368();
                    return null;
                case 1004031242:
                case 1849940021:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27009) ^ 1694744936;
                        i5 = -1481119412;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8427) ^ 1312614805;
                        i5 = 529451797;
                    }
                    break;
                case 1031377145:
                case 2053286263:
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4883) ^ (-262323392);
                        i5 = 1322939713;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32205) ^ (-1830349364);
                        i5 = -1959885577;
                    }
                    break;
                case 1190734448:
                case 1265927475:
                    return this.f40147;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27009) ^ 1694744936;
                        i5 = -1481119412;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۟") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * 27097) ^ 2049979123;
                        i5 = -515178154;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a A[PHI: r1
      0x005a: PHI (r1v3 short) = (r1v2 short), (r1v1 short) binds: [B:13:0x0058, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0151 A[PHI: r3 r6
      0x0151: PHI (r3v4 int) = (r3v3 int), (r3v1 int) binds: [B:40:0x014f, B:22:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:40:0x014f, B:22:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x019e A[PHI: r4 r5 r10
      0x019e: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:48:0x019c, B:36:0x012f, B:18:0x0090, B:16:0x0087, B:10:0x0050, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:48:0x019c, B:36:0x012f, B:18:0x0090, B:16:0x0087, B:10:0x0050, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:48:0x019c, B:36:0x012f, B:18:0x0090, B:16:0x0087, B:10:0x0050, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0213 A[PHI: r0 r2 r8 r9 r16
      0x0213: PHI (r0v9 char) = (r0v4 char), (r0v8 char), (r0v4 char), (r0v4 char), (r0v4 char) binds: [B:61:0x0211, B:53:0x01c3, B:44:0x017f, B:26:0x00d3, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r2v3 short) = (r2v2 short), (r2v1 short), (r2v1 short), (r2v1 short), (r2v1 short) binds: [B:61:0x0211, B:53:0x01c3, B:44:0x017f, B:26:0x00d3, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:61:0x0211, B:53:0x01c3, B:44:0x017f, B:26:0x00d3, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:61:0x0211, B:53:0x01c3, B:44:0x017f, B:26:0x00d3, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r16v5 short[]) = (r16v3 short[]), (r16v4 short[]), (r16v3 short[]), (r16v3 short[]), (r16v3 short[]) binds: [B:61:0x0211, B:53:0x01c3, B:44:0x017f, B:26:0x00d3, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM45029;
        int i;
        ApplicationC6132.m17119(115);
        f40134 = new short[]{2789, -3293, -3271, -3248, -3267, -3290, -3278, -3242, -3209, -3248, -3272, -3265, -3242, -3248, -3269, -3290, -3278, -3242, -3294, -3293, -3269, -3248, -3270, -3290, -3278, -3242, -3209, -3270, -3248, -3269, -3290, -3271, -3242, -3294, -3293, -3269, -3248, -3270, -3290, -3278, -3242, -3209, -3248, -3270, -3271, -3242, -3248, -3269, -3290, -3278, -3242, -3209, -3272, -3248, -3269, -3290, -3270, -3242, -3294, -3293, -3248, -3269, -3290, -3278, -3242, -3248, -3269, -3290, -3278, -3242, -3294, 9170, 32607, 32589, 32589, 32603, 32586, 32589, 32529, 3646, -14266, -14246, -14266, -14270, -14246, -14265, -14268, -14266, -14246, -14246, 4722, 29705, 29796, 29821, 29833, 29698, 29818, 29805, 29794, 29705, 29723, 29698, 29800, 29767, 29773, 29787, 29766, 29760, 29773, 29705, 29800, 29767, 29773, 29787, 29766, 29760, 29773, 29833, 29705, 29705, 2577, 23695, 23688, 23698, 23683, 23700, 23680, 23687, 23685, 23683, 23701, 23683, 23688, 23687, 23684, 23690, 23683, 23691, 23682, 23763, 23695, 23688, 23701, 23698, 23687, 23690, 23690, 23712, 23700, 23689, 23691, 23717, 23683, 23688, 23698, 23683, 23700, 9428, 2904, 2911, 2885, 2900, 2883, 2903, 2896, 2898, 2900, 2882, 7779, 24215, 24216, 24221, 24212, 24194, 2968, -13318, -13328, -13316, -13315, -13379, -13340, -13322, -13327, -13341, -13318, -13328, -13316, -13315, -13379, -13341, -13315, -13324, -13318, -13328, -13316, -13315, -13379, -13319, -13341, -13324, 1434, 27377, 27373, 27380, 27366, 27368, 27375, 27346, 27365, 27370, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27377, 27373, 27380, 27366, 27368, 27375, 27346, 27365, 27370, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27297, 27325, 27324, 27297, 27313, 27377, 27373, 27380, 27366, 27368, 27375, 27336, 27333, 27383, 27364, 27379, 27378, 27368, 27374, 27375, 27330, 27374, 27365, 27364, 27383, 27364, 27379, 27378, 27368, 27374, 27375, 27330, 27374, 27365, 27364, 27297, 27325, 27324, 27297, 27313, 27383, 27364, 27379, 27378, 27368, 27374, 27375, 27343, 27360, 27372, 27364, 27375, 27360, 27372, 27364, 27365, 27364, 27378, 27362, 27379, 27368, 27377, 27381, 27368, 27374, 27375, 27372, 27360, 27368, 27375, 27345, 27379, 27364, 27367, 27364, 27379, 27364, 27375, 27362, 27364, 27372, 27368, 27375, 27337, 27374, 27378, 27381, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27372, 27368, 27375, 27328, 27375, 27365, 27379, 27374, 27368, 27365, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27365, 27364, 27385, 27340, 27374, 27365, 27364, 27372, 27368, 27375, 27337, 27374, 27378, 27381, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27297, 27325, 27297, 27313, 27381, 27364, 27378, 27381, 27342, 27375, 27373, 27384, 27372, 27368, 27375, 27328, 27375, 27365, 27379, 27374, 27368, 27365, 27351, 27364, 27379, 27378, 27368, 27374, 27375, 27297, 27325, 27297, 27313, 3136, 22124, 22128, 22121, 22139, 22133, 22130, 22066, 22129, 22120, 22124, 3492, 30945, 30949, 30946, 30925, 30946, 30952, 30974, 30947, 30949, 30952, 30938, 30953, 30974, 30975, 30949, 30947, 30946, 30945, 30949, 30946, 30916, 30947, 30975, 30968, 30938, 30953, 30974, 30975, 30949, 30947, 30946, 30972, 30944, 30969, 30955, 30949, 30946, 30943, 30952, 30951, 30938, 30953, 30974, 30975, 30949, 30947, 30946, 30972, 30944, 30969, 30955, 30949, 30946, 30917, 30920, 30970, 30953, 30974, 30975, 30949, 30947, 30946, 30927, 30947, 30952, 30953, 30970, 30953, 30974, 30975, 30949, 30947, 30946, 30914, 30957, 30945, 30953, 30946, 30957, 30945, 30953, 30952, 30953, 30975, 30959, 30974, 30949, 30972, 30968, 30949, 30947, 30946, 30949, 30946, 30968, 30953, 30974, 30954, 30957, 30959, 30953, 30975, 30945, 30957, 30949, 30946, 30940, 30974, 30953, 30954, 30953, 30974, 30953, 30946, 30959, 30953, 30953, 30946, 30957, 30958, 30944, 30953, 30945, 30952, 30905, 30952, 30953, 30964, 30913, 30947, 30952, 30953, 30968, 30953, 30975, 30968, 30915, 30946, 30944, 30965, 30949, 30946, 30975, 30968, 30957, 30944, 30944, 30922, 30974, 30947, 30945, 30927, 30953, 30946, 30968, 30953, 30974, 7598, -15334, -15354, -15329, -15347, -15357, -15356, -15292, -15353, -15330, -15334, -15351, -15349, -15351, -15358, -15345, -15351, -15354, -15349, -15335, -15335, -15345, -15335, -15292, -15346, -15345, -15342, -15355, -15334, -15330, -15269, -15355, -15334, -15330, -15272, -15355, -15334, -15330, -15272, -15322, -15355, -15349, -15346, -15286, -15348, -15349, -15357, -15354, -15345, -15346, 6633, 24162, 24085, 24080, 24080, 24078, 24173, 24134, 24139, 24141, 24133, 24173, 24130, 24143, 24157, 24157, 24168, 24143, 24135, 24130, 24084, 24078, -11571, 763, -10186, 2322, -12507, -8912, 24080, 24080, 24078, 24186, 24156, 24143, 24128, 24157, 24130, 24143, 24154, 24135, 24129, 24128, 24171, 24128, 24137, 24135, 24128, 24139, 24084, 24078, 24080, 24080, 24078, 24189, 24134, 24129, 24155, 24130, 24138, 24172, 24139, 24190, 24130, 24155, 24137, 24135, 24128, 24190, 24156, 24139, 24136, 24139, 24156, 24139, 24128, 24141, 24139, 24084, 24078, -14732, 1962, 10348, 24080, 24080, 24078, 24186, 24139, 24150, 24154, 24171, 24138, 24135, 24154, 24129, 24156, 24168, 24155, 24128, 24141, 24154, 24135, 24129, 24128, 24084, 24078, 24080, 24080, 24078, 24186, 24139, 24150, 24154, 24171, 24138, 24135, 24154, 24129, 24156, 24168, 24130, 24129, 24143, 24154, 24135, 24128, 24137, 24163, 24139, 24128, 24155, 24084, 24078, 24080, 24080, 24078, 24187, 24128, 24133, 24128, 24129, 24153, 24128, 24167, 24128, 24154, 24139, 24156, 24136, 24143, 24141, 24139, 24084, 24078, -11311, -13356, 1083, 24080, 24080, 24078, 24186, 24139, 24150, 24154, 24171, 24138, 24135, 24154, 24129, 24156, 24186, 24129, 24129, 24130, 24163, 24139, 24128, 24155, 24084, 24078, 6892, -14539, -14535, -14542, -14541, 20155, 18517, 22739, -14539, -14535, -14542, -14541, -14583, -14554, -14537, -14558, -14539, -14530, -14539, -14535, -14542, -14541, -14539, -14535, -14542, -14541, -14583, -14554, -14537, -14558, -14539, -14530, -14539, -14535, -14542, -14541, -14554, -14534, -14557, -14543, -14529, -14536, -14472, -14533, -14558, -14554, -14539, -14535, -14542, -14541, -14583, -14554, -14537, -14558, -14539, -14530, -14554, -14534, -14557, -14543, -14529, -14536, -14472, -14533, -14558, -14554, 2938, -27218, -27204, -27204, -27222, -27205, -27204, -27168, -27161, -27166, -27244, -27218, -27166, -27211, -27246, -27212, -27139, -27165, -27140, -27214, -27161, -27166, -27244, -27250, -27166, -27243, -27246, -27212, -27139, -27165, -27140, -27214, -27162, -27152, -27162, -27152, -27245, -27167, -27230, -27205, -27229, 6182, -6701, -6700, -6702, -6711, -6706, -6713, -6701, -6719, -6701, -6701, -6715, -6700, -6701, -6769, -6701, -6700, -6702, -6711, -6706, -6713, -6701, -6770, -6707, -6700, -6708, -6719, -6701, -6701, -6715, -6700, -6701, -6769, -6669, -6700, -6702, -6711, -6706, -6713, -6770, -6707, -6700, -6708, -6669, -6700, -6702, -6711, -6706, -6713, 8505, -6814, -6786, -6809, -6795, -6789, -6788, -6852, -6785, -6810, -6814, 8401, 19963, -26102, 23162};
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1620093364;
        int i10 = C3722.f13525;
        int i11 = C1419.f5860;
        int iM450210 = C19806.m45029("ۛܳ") ^ i11;
        int i12 = ((iM450210 ^ i10) * (-2425)) ^ (-1289990614);
        int i13 = iM450210 ^ 2001644640;
        short[] sArr2 = null;
        while (true) {
            i9 = ((((i9 ^ i10) * (-30733)) >> 31) & i12) ^ i13;
            switch (i9) {
                case -2036127998:
                case -1405581601:
                    i6 = 62219;
                    iM45029 = (C19806.m45029("۟ܶ") ^ i10) * 47;
                    i12 = ((iM45029 ^ i11) * (-27761)) ^ 1489391172;
                    i = -977588647;
                    i13 = iM45029 ^ i;
                    break;
                case -1910493951:
                case -575293919:
                    s2 = 1169;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۛۚ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 16667) ^ 1507759163;
                        i = -1104053195;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩻") + i10) * (-103);
                        i12 = ((iM45029 ^ i11) * 28417) ^ (-1749277826);
                        i = -1343164332;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case -1714519801:
                case 226577194:
                    if (C1377.f5749) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۘۜ")) * 35;
                        i12 = ((iM45029 ^ i11) * (-18633)) ^ (-11253404);
                        i = -264555474;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i10;
                        i12 = ((iM45029 ^ i11) * 1605) ^ 1139096480;
                        i = 1152805309;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case -1561428318:
                case 1097199392:
                    sArr2 = f40134;
                    c = 0;
                    if (C3743.f13569) {
                        iM45029 = (i11 - C19806.m45029("᩸ۢ")) * 55;
                        i12 = ((iM45029 ^ i10) * (-29021)) ^ (-483621869);
                        i = 2105459831;
                    } else {
                        iM45029 = C19806.m45029("ۛۚ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 16667) ^ 1507759163;
                        i = -1104053195;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case -1023772038:
                case 555496297:
                    f40135 = C14690.m35219(C19806.m45020(sArr, i7, i8, i6));
                    return;
                case -844678450:
                case 1804709392:
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("᩺۫") ^ i11;
                        i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                        i = -1154031519;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i10;
                        i12 = ((iM45029 ^ i11) * 1605) ^ 1139096480;
                        i = 1152805309;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case -803699348:
                case 8933376:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("ۛۚ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 16667) ^ 1507759163;
                        i = -1104053195;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹᩸") + i11) * 83;
                        i12 = ((iM45029 ^ i10) * 7863) ^ (-1336319143);
                        i = 96977598;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case -103761072:
                case 1192381761:
                    int i14 = s + s2;
                    i2 = i14 * i14;
                    if (C2477.m7593() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i10;
                        i12 = ((iM45029 ^ i11) * (-16045)) ^ 182454899;
                        i = 1304588483;
                    } else {
                        iM45029 = C19806.m45029("֫ۡ") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-15129)) ^ 806123458;
                        i = -745139359;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 104246413:
                case 114990069:
                    i3 = s * s;
                    i4 = 1366561;
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩺۫") ^ i11;
                        i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                        i = -1154031519;
                    } else {
                        iM45029 = C19806.m45029("֨֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-1809)) ^ (-1777428846);
                        i = -1741940323;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 315926741:
                case 1802234287:
                    if (i2 - (i5 + i5) > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i10;
                        i12 = ((iM45029 ^ i11) * 32101) ^ (-1794214062);
                        i = 536716716;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩻") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-14483)) ^ (-666141287);
                        i = 2040037329;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 574207185:
                case 1855312554:
                    C0962.m3746();
                    C2332.m7079();
                    throw new RuntimeException();
                case 670465754:
                case 1366691209:
                    sArr = f40134;
                    i7 = 1;
                    if (C0817.m3399()) {
                        iM45029 = C19806.m45029("᩵֡") ^ i11;
                        i12 = ((iM45029 ^ i10) * 3905) ^ 1601332354;
                        i = -533087578;
                    } else {
                        iM45029 = C19806.m45029("ۛۚ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 16667) ^ 1507759163;
                        i = -1104053195;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 820344411:
                case 1301063140:
                    i5 = i3 + i4;
                    if (RunnableC3388.m10064()) {
                        iM45029 = (C19806.m45029("ᩴۚ") + i10) * 9;
                        i12 = ((iM45029 ^ i11) * (-22457)) ^ 1448922092;
                        i = 1129947157;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i10;
                        i12 = ((iM45029 ^ i11) * (-16045)) ^ 182454899;
                        i = 1304588483;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 899320336:
                case 1902565630:
                    i8 = 70;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("۫۬") ^ i10) * (-95);
                        i12 = ((iM45029 ^ i11) * 28575) ^ (-824965972);
                        i = -685990175;
                    } else {
                        iM45029 = C19806.m45029("᩺۫") ^ i11;
                        i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                        i = -1154031519;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 1000220219:
                case 1640719810:
                    C2124.m6673();
                    iM45029 = C19806.m45029("᩺۫") ^ i11;
                    i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                    i = -1154031519;
                    i13 = iM45029 ^ i;
                    break;
                case 1177713445:
                case 1577408011:
                    s = sArr2[c];
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i11 - C19806.m45029("ܰ᩵")) * (-87);
                        i12 = ((iM45029 ^ i10) * (-5129)) ^ 2072880732;
                        i = 47276337;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۛ") ^ i10;
                        i12 = ((iM45029 ^ i11) * 16859) ^ (-191770528);
                        i = -120890725;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 1610062190:
                case 1757191239:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("᩺۫") ^ i11;
                        i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                        i = -1154031519;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ܰ᩵")) * (-87);
                        i12 = ((iM45029 ^ i10) * (-5129)) ^ 2072880732;
                        i = 47276337;
                    }
                    i13 = iM45029 ^ i;
                    break;
                case 1679826124:
                case 1904665137:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = C19806.m45029("᩺۫") ^ i11;
                        i12 = ((iM45029 ^ i10) * 4899) ^ 423334440;
                        i = -1154031519;
                    } else {
                        iM45029 = C19806.m45029("ۛۚ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 16667) ^ 1507759163;
                        i = -1104053195;
                    }
                    i13 = iM45029 ^ i;
                    break;
                default:
                    i6 = 40282;
                    iM45029 = (C19806.m45029("۟ܶ") ^ i10) * 47;
                    i12 = ((iM45029 ^ i11) * (-27761)) ^ 1489391172;
                    i = -977588647;
                    i13 = iM45029 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0492 A[PHI: r6 r7 r9 r10 r14 r15 r16 r19 r20 r21 r22 r23 r24 r25 r29 r30 r31
      0x0492: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v6 java.lang.String) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r7v6 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v2 short[]), (r7v7 short[]) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r9v10 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r10v6 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r14v6 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v7 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r15v6 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v7 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r19v6 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r20v6 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r21v6 int) = (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r22v31 int) = (r22v8 int), (r22v10 int), (r22v25 int), (r22v32 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r23v27 short[]) = (r23v8 short[]), (r23v10 short[]), (r23v20 short[]), (r23v28 short[]) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r24v27 java.lang.String) = (r24v8 java.lang.String), (r24v10 java.lang.String), (r24v20 java.lang.String), (r24v28 java.lang.String) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r25v25 int) = (r25v8 int), (r25v10 int), (r25v20 int), (r25v26 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r29v39 int) = (r29v12 int), (r29v14 int), (r29v28 int), (r29v40 int) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r30v38 short[]) = (r30v9 short[]), (r30v11 short[]), (r30v25 short[]), (r30v39 short[]) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0492: PHI (r31v30 java.lang.String) = (r31v6 java.lang.String), (r31v8 java.lang.String), (r31v25 java.lang.String), (r31v31 java.lang.String) binds: [B:82:0x0490, B:74:0x0408, B:32:0x016a, B:14:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29797(int i, int i2, int i3) {
        String strM29796;
        int iM11306;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10;
        int i11;
        short[] sArr;
        String str;
        String strM5070;
        int i12;
        short[] sArr2;
        int iM11309;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM45029;
        String str2 = null;
        String strM22529 = null;
        String strM6241 = null;
        String strM8249 = null;
        int i17 = 0;
        int i18 = -1325053808;
        int i19 = RunnableC0195.f1321;
        int i20 = C10634.f36300;
        int iM113010 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i19;
        int i21 = ((iM113010 ^ i20) * 6423) ^ (-175547665);
        int i22 = iM113010 ^ 413046964;
        String str3 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        StringBuilder sb = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        short s = 0;
        short s2 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 7465) >> 31));
            switch (i18) {
                case -2058436164:
                case 1416794466:
                    ThreadFactoryC3888.m11300();
                    if (C2332.m7079() > 0) {
                        i23 = i23;
                        str3 = str3;
                        i33 = i33;
                        i32 = i32;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        strM22529 = strM22529;
                        iM11308 = (i19 - C19806.m45029("ܿ᩵")) * (-45);
                        i8 = ((iM11308 ^ i20) * (-22411)) ^ 563196845;
                        i9 = 1103380471;
                        i23 = i23;
                        i22 = iM11308 ^ i9;
                        i21 = i8;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i33;
                        str3 = str3;
                    } else {
                        i23 = i23;
                        strM29796 = str3;
                        i33 = i33;
                        i32 = i32;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        strM22529 = strM22529;
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i20;
                        i4 = ((iM11306 ^ i19) * 6017) ^ (-1984557419);
                        i5 = 472428342;
                        int i34 = i33;
                        str3 = strM29796;
                        i21 = i4;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i34;
                        int i35 = i23;
                        i22 = iM11306 ^ i5;
                        i23 = i35;
                    }
                    break;
                case -1985319305:
                case 2092659761:
                    i17 = 29737;
                    iM11308 = ThreadFactoryC3888.m11306("֨֨") ^ i19;
                    i8 = ((iM11308 ^ i20) * 24109) ^ (-912347960);
                    i9 = -826719427;
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case -1832362887:
                case 766653785:
                    i23 = i23;
                    str3 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    s = sArr3[90];
                    s2 = 15399;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        int iM450210 = (C19806.m45029("ᩳۙ") + i20) * 73;
                        i21 = ((iM450210 ^ i19) * (-19583)) ^ (-49879861);
                        strM22529 = strM22529;
                        i23 = i23;
                        sArr4 = sArr4;
                        i22 = iM450210 ^ 1357244548;
                        sArr5 = sArr5;
                        i32 = i32;
                        sb = null;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i20;
                        i8 = ((iM11308 ^ i19) * 22585) ^ 974314728;
                        i9 = -864833845;
                        i23 = i23;
                        i22 = iM11308 ^ i9;
                        i21 = i8;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                    }
                    i33 = i33;
                    str3 = str3;
                    break;
                case -1685424099:
                case 1991572095:
                    short[] sArr8 = sArr5;
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr8, i24, i25, i17);
                    sArr6 = f40134;
                    i26 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    if (C3286.f12186) {
                        str3 = str3;
                        sArr4 = sArr4;
                        i33 = i33;
                        i23 = 8;
                        strM22529 = strM22529;
                        i32 = i32;
                        sArr5 = sArr8;
                        int iM450211 = (C19806.m45029("ᩳۙ") + i20) * 73;
                        i21 = ((iM450211 ^ i19) * (-19583)) ^ (-49879861);
                        strM22529 = strM22529;
                        i23 = i23;
                        sArr4 = sArr4;
                        i22 = iM450211 ^ 1357244548;
                        sArr5 = sArr5;
                        i32 = i32;
                        sb = null;
                        i33 = i33;
                        str3 = str3;
                    } else {
                        int iM450212 = (C19806.m45029("ܶۨ") + i19) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        sArr5 = sArr8;
                        i21 = ((iM450212 ^ i20) * (-18185)) ^ (-165902703);
                        i22 = iM450212 ^ (-188324706);
                        i23 = 8;
                    }
                    break;
                case -1675103060:
                case 1212269510:
                    return C0817.m3407(sb);
                case -1525729685:
                case -599475576:
                    strM8249 = C2704.m8249(strM22529, strM6241, C0278.m1774(sArr6, i26, i23, i17));
                    sArr7 = f40134;
                    i27 = 118;
                    i28 = 2;
                    if (C3722.f13525 > 0) {
                        iM11307 = C19806.m45029("ܶ᩷") ^ i20;
                        i6 = ((iM11307 ^ i19) * (-25367)) ^ 1948942574;
                        i7 = 1135383726;
                        i22 = iM11307 ^ i7;
                        i21 = i6;
                    } else {
                        i23 = i23;
                        str3 = str3;
                        i33 = i33;
                        i32 = i32;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        strM22529 = strM22529;
                        iM11308 = (i19 - C19806.m45029("ܿ᩵")) * (-45);
                        i8 = ((iM11308 ^ i20) * (-22411)) ^ 563196845;
                        i9 = 1103380471;
                        i23 = i23;
                        i22 = iM11308 ^ i9;
                        i21 = i8;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i33;
                        str3 = str3;
                    }
                    break;
                case -1405620797:
                case -1022367315:
                    i17 = 64359;
                    iM11308 = ThreadFactoryC3888.m11306("֨֨") ^ i19;
                    i8 = ((iM11308 ^ i20) * 24109) ^ (-912347960);
                    i9 = -826719427;
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case -1380122498:
                case 1835802734:
                    i23 = i23;
                    str3 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    if (i == 2) {
                        iM11308 = (ThreadFactoryC3888.m11306("۠᩺") + i19) * 93;
                        i8 = ((iM11308 ^ i20) * 27707) ^ 700599164;
                        i9 = -1972577451;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i20;
                        i8 = ((iM11308 ^ i19) * 16099) ^ 1098852025;
                        i9 = 1281740061;
                    }
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case -1152879178:
                case 1414790710:
                    i23 = i23;
                    str3 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    sArr3 = f40134;
                    if (C2642.m8171() != 0) {
                        iM11308 = (i19 - C19806.m45029("ܿ᩵")) * (-45);
                        i8 = ((iM11308 ^ i20) * (-22411)) ^ 563196845;
                        i9 = 1103380471;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۨ۬") ^ i19;
                        i8 = ((iM11308 ^ i20) * (-6283)) ^ 363547468;
                        i9 = -1905836530;
                    }
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case -1065389114:
                case -1024341947:
                    i23 = i23;
                    strM22529 = strM22529;
                    String str4 = str3;
                    sArr5 = sArr5;
                    C1148.m4223(sb, str4);
                    short[] sArr9 = f40134;
                    i33 = 95;
                    if (CallableC1627.f6528) {
                        int iM450213 = (i20 - C19806.m45029("ᩳۖ")) * 119;
                        int i36 = ((iM450213 ^ i19) * (-10731)) ^ 1636804358;
                        int i37 = iM450213 ^ 396216216;
                        sArr5 = sArr5;
                        i32 = 1;
                        sArr4 = sArr9;
                        i21 = i36;
                        strM22529 = strM22529;
                        str3 = str4;
                        i23 = i23;
                        i22 = i37;
                    } else {
                        sArr4 = sArr9;
                        str3 = str4;
                        i33 = 95;
                        i32 = 1;
                        int iM450214 = (C19806.m45029("ᩳۙ") + i20) * 73;
                        i21 = ((iM450214 ^ i19) * (-19583)) ^ (-49879861);
                        strM22529 = strM22529;
                        i23 = i23;
                        sArr4 = sArr4;
                        i22 = iM450214 ^ 1357244548;
                        sArr5 = sArr5;
                        i32 = i32;
                        sb = null;
                        i33 = i33;
                        str3 = str3;
                    }
                    break;
                case -853398069:
                case -56061244:
                    C1148.m4223(sb, C0962.m3747(sArr7, i27, i28, i17));
                    C1148.m4223(sb, strM8249);
                    C1148.m4223(sb, str2);
                    i10 = i23;
                    String str5 = strM22529;
                    strM5070 = str2;
                    i11 = i33;
                    i12 = i32;
                    sArr = sArr5;
                    sArr2 = sArr4;
                    str = str5;
                    iM11309 = ThreadFactoryC3888.m11306("᩷᩹") ^ i20;
                    i13 = ((iM11309 ^ i19) * 25207) ^ 604922428;
                    i14 = 589317669;
                    int i38 = i10;
                    i22 = iM11309 ^ i14;
                    i21 = i13;
                    i23 = i38;
                    int i39 = i12;
                    i33 = i11;
                    str2 = strM5070;
                    strM22529 = str;
                    sArr4 = sArr2;
                    sArr5 = sArr;
                    i32 = i39;
                    break;
                case -807880504:
                case 1937227123:
                    i23 = i23;
                    str3 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    int i40 = s + s2;
                    i29 = i40 * i40;
                    i30 = s * s;
                    i31 = 237129201;
                    if (CallableC1627.m5507() != 0) {
                        iM11308 = (i19 - C19806.m45029("ܿ᩵")) * (-45);
                        i8 = ((iM11308 ^ i20) * (-22411)) ^ 563196845;
                        i9 = 1103380471;
                    } else {
                        iM11308 = C19806.m45029("ۛۜ") ^ i19;
                        i8 = ((iM11308 ^ i20) * 2495) ^ (-691379540);
                        i9 = -103310277;
                    }
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case -597026029:
                case -211678692:
                    i23 = i23;
                    String str6 = str3;
                    int i41 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    short[] sArr10 = f40134;
                    i33 = i41;
                    if (C1875.f7103 < 0) {
                        sb = new StringBuilder(C10634.m26821(sArr10, 91, 4, i17));
                        strM29796 = m29796(i2);
                        if (C0671.f2816 != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i20;
                            i4 = ((iM11306 ^ i19) * 6017) ^ (-1984557419);
                            i5 = 472428342;
                        } else {
                            iM11306 = (i19 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-41);
                            i4 = ((iM11306 ^ i20) * (-4263)) ^ (-1112461983);
                            i5 = 1513372;
                        }
                        int i310 = i33;
                        str3 = strM29796;
                        i21 = i4;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i310;
                        int i311 = i23;
                        i22 = iM11306 ^ i5;
                        i23 = i311;
                    } else {
                        str3 = str6;
                        int iM450215 = (C19806.m45029("ᩳۙ") + i20) * 73;
                        i21 = ((iM450215 ^ i19) * (-19583)) ^ (-49879861);
                        strM22529 = strM22529;
                        i23 = i23;
                        sArr4 = sArr4;
                        i22 = iM450215 ^ 1357244548;
                        sArr5 = sArr5;
                        i32 = i32;
                        sb = null;
                        i33 = i33;
                        str3 = str3;
                    }
                    break;
                case -565394816:
                case 1484284577:
                    i10 = i23;
                    int i42 = i32;
                    short[] sArr11 = sArr4;
                    i11 = i33;
                    sArr = sArr5;
                    str = strM22529;
                    strM5070 = C1461.m5070(sArr11, i11, i42, i17);
                    C1148.m4223(sb, strM5070);
                    i12 = i42;
                    if (i3 > 21) {
                        iM11309 = ThreadFactoryC3888.m11306("۟ܳ") ^ i19;
                        sArr2 = sArr11;
                        i13 = ((iM11309 ^ i20) * 2511) ^ (-1515253163);
                        i14 = -916661732;
                    } else {
                        sArr2 = sArr11;
                        iM11309 = ThreadFactoryC3888.m11306("᩷᩹") ^ i20;
                        i13 = ((iM11309 ^ i19) * 25207) ^ 604922428;
                        i14 = 589317669;
                    }
                    int i312 = i10;
                    i22 = iM11309 ^ i14;
                    i21 = i13;
                    i23 = i312;
                    int i313 = i12;
                    i33 = i11;
                    str2 = strM5070;
                    strM22529 = str;
                    sArr4 = sArr2;
                    sArr5 = sArr;
                    i32 = i313;
                    break;
                case -209838986:
                case 258554956:
                    return C1377.m4832(f40134, 96, 6, i17);
                case 634353007:
                case 1183486028:
                    C2249.m6915();
                    i23 = i23;
                    strM29796 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i20;
                    i4 = ((iM11306 ^ i19) * 6017) ^ (-1984557419);
                    i5 = 472428342;
                    int i314 = i33;
                    str3 = strM29796;
                    i21 = i4;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i314;
                    int i315 = i23;
                    i22 = iM11306 ^ i5;
                    i23 = i315;
                    break;
                case 699552893:
                case 890645788:
                    ThreadFactoryC3888.m11300();
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = C19806.m45029("᩵ܶ") ^ i20;
                        i16 = ((iM45029 ^ i19) * (-14157)) ^ (-500499995);
                        i15 = -344631704;
                        i22 = iM45029 ^ i15;
                        i21 = i16;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        strM29796 = str3;
                        i33 = i33;
                        i32 = i32;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        strM22529 = strM22529;
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i20;
                        i4 = ((iM11306 ^ i19) * 6017) ^ (-1984557419);
                        i5 = 472428342;
                        int i316 = i33;
                        str3 = strM29796;
                        i21 = i4;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i316;
                        int i317 = i23;
                        i22 = iM11306 ^ i5;
                        i23 = i317;
                    }
                    break;
                case 1088373719:
                case 1120115889:
                    short[] sArr12 = sArr5;
                    i25 = 8;
                    if (C1148.f5161 <= 0) {
                        i23 = i23;
                        str3 = str3;
                        sArr4 = sArr4;
                        i33 = i33;
                        i24 = IShizukuService.Stub.TRANSACTION_attachUserService;
                        strM22529 = strM22529;
                        i32 = i32;
                        sArr5 = sArr12;
                        iM11308 = (i19 - C19806.m45029("ܿ᩵")) * (-45);
                        i8 = ((iM11308 ^ i20) * (-22411)) ^ 563196845;
                        i9 = 1103380471;
                        i23 = i23;
                        i22 = iM11308 ^ i9;
                        i21 = i8;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i33;
                        str3 = str3;
                    } else {
                        int iM113011 = (i19 - ThreadFactoryC3888.m11306("ۡ֡")) * (-93);
                        sArr5 = sArr12;
                        i22 = iM113011 ^ (-534061276);
                        i21 = ((iM113011 ^ i20) * (-13191)) ^ 1646003104;
                        i24 = IShizukuService.Stub.TRANSACTION_attachUserService;
                    }
                    break;
                case 1510117641:
                case 1859633602:
                    i23 = i23;
                    str3 = str3;
                    i33 = i33;
                    i32 = i32;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    strM22529 = strM22529;
                    int i43 = i30 + i31;
                    if ((i43 + i43) - i29 >= 0) {
                        iM11308 = (C19806.m45029("ۖ᩶") + i20) * 7;
                        i8 = ((iM11308 ^ i19) * (-4259)) ^ 1881416160;
                        i9 = 1167204284;
                    } else {
                        iM11308 = (C19806.m45029("ۖܳ") ^ i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM11308 ^ i19) * (-23435)) ^ (-1047469041);
                        i9 = -523115219;
                    }
                    i23 = i23;
                    i22 = iM11308 ^ i9;
                    i21 = i8;
                    strM22529 = strM22529;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i32 = i32;
                    i33 = i33;
                    str3 = str3;
                    break;
                case 1615502746:
                case 1787416699:
                    strM22529 = C8703.m22529(i3, false);
                    sArr5 = f40134;
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("᩵ܶ") ^ i20;
                        i16 = ((iM45029 ^ i19) * (-14157)) ^ (-500499995);
                        i15 = -344631704;
                    } else {
                        iM45029 = (i20 - ThreadFactoryC3888.m11306("۠ܰ")) * (-105);
                        i16 = ((iM45029 ^ i19) * (-13967)) ^ (-1194738504);
                        i15 = -409888966;
                    }
                    i22 = iM45029 ^ i15;
                    i21 = i16;
                    i23 = i23;
                    break;
                case 1690696705:
                case 1917929904:
                    ThreadFactoryC3888.m11300();
                    if (C2124.f7782 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("֨۫") ^ i19) * 123;
                        i6 = ((iM11307 ^ i20) * (-30657)) ^ 1537447878;
                        i7 = -1840622881;
                        i22 = iM11307 ^ i7;
                        i21 = i6;
                    } else {
                        i23 = i23;
                        strM29796 = str3;
                        i33 = i33;
                        i32 = i32;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        strM22529 = strM22529;
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i20;
                        i4 = ((iM11306 ^ i19) * 6017) ^ (-1984557419);
                        i5 = 472428342;
                        int i318 = i33;
                        str3 = strM29796;
                        i21 = i4;
                        strM22529 = strM22529;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i32 = i32;
                        i33 = i318;
                        int i319 = i23;
                        i22 = iM11306 ^ i5;
                        i23 = i319;
                    }
                    break;
                default:
                    C1398.m4895();
                    C3577.m10565();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final PluginPreference m29808(String str) {
        String str2 = null;
        Class clsM51818 = null;
        int i = -674885135;
        int i2 = C3660.f13403;
        int i3 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i2;
        int i4 = ((iM11306 ^ i3) * 8965) ^ (-567630047);
        int i5 = 2142025392;
        while (true) {
            i = ((((i ^ i3) * (-26983)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1892876901:
                case 326481922:
                    if (m29806()) {
                        iM11306 = (C19806.m45029("ۗۜ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 27025) ^ 304660624;
                        i5 = 1450187395;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩷ۡ")) * (-123);
                        i4 = ((iM11306 ^ i3) * (-18727)) ^ (-1116288593);
                        i5 = 1050755119;
                    }
                    break;
                case -1868071017:
                case 1122037771:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = (C19806.m45029("ۘᩴ") + i2) * 23;
                        i4 = ((iM11306 ^ i3) * 21301) ^ 1609334770;
                        i5 = 1027608102;
                    }
                    break;
                case -1784630251:
                case 32866114:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ۘᩴ") + i2) * 23;
                        i4 = ((iM11306 ^ i3) * 21301) ^ 1609334770;
                        i5 = 1027608102;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 143) ^ 221493665;
                        i5 = 962353594;
                    }
                    break;
                case -1731794890:
                case 1331296962:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i2) * (-17);
                        i4 = ((iM11306 ^ i3) * (-2783)) ^ (-288099108);
                        i5 = 2015464762;
                    }
                    break;
                case -1644534993:
                case 51384428:
                    C2477.m7593();
                    return null;
                case -1358786397:
                case 2057653813:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ۘᩴ") + i2) * 23;
                        i4 = ((iM11306 ^ i3) * 21301) ^ 1609334770;
                        i5 = 1027608102;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ֫") + i2) * (-73);
                        i4 = ((iM11306 ^ i3) * (-23699)) ^ (-1278392337);
                        i5 = 1795183385;
                    }
                    break;
                case -1289098872:
                case 1171508382:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ᩵") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 4377) ^ (-1046600388);
                        i5 = 294566835;
                    }
                    break;
                case -1184699588:
                case 339246031:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4927)) ^ (-1415046378);
                        i5 = 885198053;
                    }
                    break;
                case -1068093811:
                case 42521830:
                    C19806.m45024();
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22367)) ^ (-1814167372);
                        i5 = 118064059;
                    } else {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    }
                    break;
                case -1058054308:
                case -22075248:
                    return (PluginPreference) clsM51818.newInstance();
                case -864686932:
                case 507691378:
                    return null;
                case -810495241:
                case 1920544353:
                    C3660.m10791();
                    iM11306 = (C19806.m45029("ۘᩴ") + i2) * 23;
                    i4 = ((iM11306 ^ i3) * 21301) ^ 1609334770;
                    i5 = 1027608102;
                    break;
                case -742928325:
                case 1639866605:
                    if (!RunnableC0195.m1431()) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22367)) ^ (-1814167372);
                        i5 = 118064059;
                    } else {
                        iM11306 = (C19806.m45029("ۧۧ") ^ i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 23119) ^ 855409962;
                        i5 = 952229350;
                    }
                    break;
                case -736489734:
                case 1118128974:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = C19806.m45029("ۧᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30709)) ^ (-403890216);
                        i5 = -448097311;
                    }
                    break;
                case -661001168:
                case 1654678068:
                    if (C2704.f10408) {
                        iM11306 = (i2 - C19806.m45029("᩵ۤ")) * (-69);
                        i4 = ((iM11306 ^ i3) * (-11285)) ^ 841252926;
                        i5 = -1309842593;
                    } else {
                        iM11306 = (C19806.m45029("ۧۧ") ^ i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 23119) ^ 855409962;
                        i5 = 952229350;
                    }
                    break;
                case -402543111:
                case 818763609:
                    if (str == null) {
                        iM11306 = (C19806.m45029("ᩳۗ") + i2) * 33;
                        i4 = ((iM11306 ^ i3) * (-28419)) ^ 1812107525;
                        i5 = -962812933;
                    } else {
                        str2 = str;
                        iM11306 = C19806.m45029("ۚۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12241) ^ 1067730473;
                        i5 = 590203640;
                    }
                    break;
                case 597874006:
                case 1866413410:
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("᩶ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3621)) ^ 53900544;
                        i5 = -2049482470;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܰ") ^ i3) * 51;
                        i4 = ((iM11306 ^ i2) * 1141) ^ (-150644589);
                        i5 = -182115300;
                    }
                    break;
                case 603446148:
                case 2003628432:
                    clsM51818 = C23524.m51818(this.f40140, str2);
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ۧۧ") ^ i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 23119) ^ 855409962;
                        i5 = 952229350;
                    } else {
                        iM11306 = C19806.m45029("ܶܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26929) ^ (-532576547);
                        i5 = -2087273403;
                    }
                    break;
                case 952161537:
                case 1885880244:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("۟᩹") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * 9107) ^ (-387075019);
                        i5 = -2019254381;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") + i2) * 29;
                        i4 = ((iM11306 ^ i3) * (-27683)) ^ (-1556740413);
                        i5 = -1211014383;
                    }
                    break;
                case 1262518044:
                case 1364680782:
                    str2 = this.f40157;
                    iM11306 = C19806.m45029("ۚۧ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 12241) ^ 1067730473;
                    i5 = 590203640;
                    break;
                default:
                    if (str2 != null) {
                        iM11306 = C19806.m45029("۬ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8259) ^ (-128858316);
                        i5 = 1159119630;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩷ۡ")) * (-123);
                        i4 = ((iM11306 ^ i3) * (-18727)) ^ (-1116288593);
                        i5 = 1050755119;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m29795(int i, String str) {
        Iterator itM9863 = null;
        Class cls = null;
        C14103 c14103 = null;
        Exception e = null;
        Class clsM51818 = null;
        int i2 = 1836720444;
        int i3 = C2788.f10625;
        int i4 = C0278.f1572;
        int iM45029 = C19806.m45029("۟۫") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-28631)) ^ 686831585;
        int i6 = 750252593;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-17771)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2138409067:
                    case -772114835:
                        if (C2249.m6915() <= 0) {
                            iM45029 = (C19806.m45029("֨ۨ") ^ i4) * 37;
                            i5 = ((iM45029 ^ i3) * (-27807)) ^ 1642695005;
                            i6 = -2013966483;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * 10559) ^ 1296838267;
                        i6 = -832538911;
                        break;
                    case -2137805971:
                    case -1892865763:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (i3 - C19806.m45029("ۢܺ")) * (-11);
                            i5 = ((iM45029 ^ i4) * (-575)) ^ 50822368;
                            i6 = -1084345634;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩹") ^ i3) * 37;
                        i5 = ((iM45029 ^ i4) * 12329) ^ (-1713410527);
                        i6 = -1391769593;
                        break;
                    case -2031678521:
                    case -1795710317:
                        if (C1460.f5948 < 0) {
                            iM45029 = C19806.m45029("ۗܶ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 23425) ^ 1183285339;
                            i6 = 613110381;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8889) ^ 612761338;
                        i6 = 828322866;
                        break;
                    case -1989324861:
                    case 462320609:
                        C1189.m4368();
                        C0629.m2907();
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8889) ^ 612761338;
                        i6 = 828322866;
                        break;
                        break;
                    case -1926141117:
                    case 599631805:
                        if (!C3286.f12186) {
                            iM45029 = C19806.m45029("ۤ۟") ^ i4;
                            i5 = ((iM45029 ^ i3) * 5605) ^ 43502682;
                            i6 = -1088990814;
                            break;
                        }
                        iM45029 = C19806.m45029("ܰۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30313) ^ (-2094524162);
                        i6 = 1432647908;
                        break;
                    case -1570730306:
                    case -1568543402:
                        if (C3577.f13150 < 0) {
                            iM45029 = (C19806.m45029("ܿۖ") + i4) * (-29);
                            i5 = ((iM45029 ^ i3) * 1067) ^ (-294869680);
                            i6 = 1033750089;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("ۢܺ")) * (-11);
                        i5 = ((iM45029 ^ i4) * (-575)) ^ 50822368;
                        i6 = -1084345634;
                        break;
                        break;
                    case -1478293659:
                    case 2080229343:
                        if (C1937.f7317 < 0) {
                            iM45029 = (i3 - C19806.m45029("ܶ۟")) * 41;
                            i5 = ((iM45029 ^ i4) * 24345) ^ 1401498086;
                            i6 = 681565845;
                            break;
                        }
                        iM45029 = (C19806.m45029("֨ۨ") ^ i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-27807)) ^ 1642695005;
                        i6 = -2013966483;
                        break;
                        break;
                    case -1123854497:
                    case 595022632:
                        return clsM51818;
                    case -977772082:
                    case 506886086:
                        CallableC1627.m5507();
                        if (C3743.m10966() > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                            i5 = ((iM45029 ^ i4) * 10559) ^ 1296838267;
                            i6 = -832538911;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8889) ^ 612761338;
                        i6 = 828322866;
                        break;
                        break;
                    case -886467569:
                    case -111557877:
                        if (C3743.m10966() > 0) {
                            iM45029 = C19806.m45029("ۡۗ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11189)) ^ (-1279999145);
                            i6 = -1164650476;
                            break;
                        }
                        iM45029 = C19806.m45029("ܰۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30313) ^ (-2094524162);
                        i6 = 1432647908;
                        break;
                        break;
                    case -847922177:
                    case 553603689:
                        return cls;
                    case -677274847:
                    case 7754786:
                        m29814(e);
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 32571) ^ (-418433535);
                        i6 = 412642253;
                        break;
                    case -641756717:
                    case 655707006:
                        if (!C1460.m5058(c14103.f46338, str)) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-111);
                            i5 = ((iM45029 ^ i3) * (-703)) ^ 1010658521;
                            i6 = 807274337;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12511) ^ (-52770489);
                        i6 = 892131474;
                        break;
                    case -631480766:
                    case -524219955:
                        if (!m29806()) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 32571) ^ (-418433535);
                            i6 = 412642253;
                            break;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") + i4) * 49;
                        i5 = ((iM45029 ^ i3) * 3165) ^ (-648706818);
                        i6 = 1082939180;
                        break;
                    case -478299744:
                    case 1733358060:
                        try {
                            clsM51818 = C23524.m51818(this.f40140, c14103.f46338);
                            iM45029 = (C19806.m45029("֫᩵") ^ i4) * 91;
                            i5 = ((iM45029 ^ i3) * 4693) ^ 1103169290;
                            i6 = -996681472;
                        } catch (Exception e2) {
                            e = e2;
                            iM45029 = C19806.m45029("۫ᩳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-24751)) ^ (-1576959190);
                            i6 = 38764831;
                        }
                        break;
                    case -255468391:
                    case 1906004360:
                        if (C2249.f8050 < 0) {
                            iM45029 = (C19806.m45029("ۚۚ") ^ i4) * (-59);
                            i5 = ((iM45029 ^ i3) * 25693) ^ 279617349;
                            i6 = -897388286;
                            break;
                        }
                        iM45029 = (C19806.m45029("֨ۨ") ^ i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-27807)) ^ 1642695005;
                        i6 = -2013966483;
                        break;
                        break;
                    case -245013628:
                    case 1036521553:
                        if (!C1461.m5080()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ۠") + i4) * 77;
                            i5 = ((iM45029 ^ i3) * 20935) ^ (-815387095);
                            i6 = 1377882900;
                            break;
                        }
                        iM45029 = (C19806.m45029("֨ۨ") ^ i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-27807)) ^ 1642695005;
                        i6 = -2013966483;
                        break;
                        break;
                    case 7204627:
                    case 1055340966:
                        if (C1977.f7413 > 0) {
                            iM45029 = (i3 - C19806.m45029("ۧ᩵")) * (-77);
                            i5 = ((iM45029 ^ i4) * (-30673)) ^ (-147075983);
                            i6 = -223122547;
                            break;
                        }
                        iM45029 = (C19806.m45029("֨ۨ") ^ i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-27807)) ^ 1642695005;
                        i6 = -2013966483;
                        break;
                        break;
                    case 181560142:
                    case 1727425966:
                        if (!C0962.m3748(itM9863)) {
                            cls = null;
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 32571) ^ (-418433535);
                            i6 = 412642253;
                            break;
                        }
                        int iM11306 = ThreadFactoryC3888.m11306("ܳܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-6341)) ^ 1191179400;
                        i7 = iM11306 ^ (-51377737);
                        cls = null;
                        break;
                        break;
                    case 455109301:
                    case 1440269621:
                        if (C2871.f10837 < 0) {
                            iM45029 = (C19806.m45029("ܶܳ") ^ i3) * 127;
                            i5 = ((iM45029 ^ i4) * (-6099)) ^ (-1660744972);
                            i6 = 44404392;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۚۚ") ^ i4) * (-59);
                        i5 = ((iM45029 ^ i3) * 25693) ^ 279617349;
                        i6 = -897388286;
                        break;
                        break;
                    case 559500137:
                    case 1180797919:
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f40159);
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-111);
                        i5 = ((iM45029 ^ i3) * (-703)) ^ 1010658521;
                        i6 = 807274337;
                        break;
                        break;
                    case 660172496:
                    case 689833276:
                        c14103 = (C14103) C0278.m1776(itM9863);
                        if (c14103.f46339 != i) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-111);
                            i5 = ((iM45029 ^ i3) * (-703)) ^ 1010658521;
                            i6 = 807274337;
                            break;
                            break;
                        }
                        iM45029 = C19806.m45029("ᩳܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 67) ^ 2117073321;
                        i6 = -993285719;
                        break;
                    case 740874506:
                    case 1091137806:
                        C0216.m1591();
                        C0526.m2437();
                        return null;
                    case 1256929220:
                    case 1803643872:
                        if (!RunnableC1564.m5345()) {
                            iM45029 = ThreadFactoryC3888.m11306("֡ܿ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-13475)) ^ 556630214;
                            i6 = 488266186;
                            break;
                        }
                        iM45029 = C19806.m45029("ܰۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30313) ^ (-2094524162);
                        i6 = 1432647908;
                        break;
                        break;
                    default:
                        if (C0050.m946() > 0) {
                            iM45029 = C19806.m45029("ܰۗ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 30313) ^ (-2094524162);
                            i6 = 1432647908;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * 10559) ^ 1296838267;
                        i6 = -832538911;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29814(Throwable th) {
        PluginContext pluginContextM29831 = null;
        int i = 433297301;
        int i2 = C1025.f4800;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("֫ܽ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 18897) ^ 1164362134;
        int i5 = -2083797643;
        while (true) {
            i = ((((i ^ i2) * (-27347)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1830310193:
                case -565188694:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("ۙۢ") + i2) * 33;
                        i4 = ((iM45029 ^ i3) * 27777) ^ (-1940665102);
                        i5 = 829263497;
                    } else {
                        iM45029 = C19806.m45029("᩵۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26879)) ^ 1834166953;
                        i5 = -434006547;
                    }
                    break;
                case -1649790206:
                case 5575738:
                    pluginContextM29831 = m29831();
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8613)) ^ (-133262854);
                        i5 = 945731859;
                    } else {
                        iM45029 = C19806.m45029("ۧᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16043) ^ (-1078942659);
                        i5 = -1928903524;
                    }
                    break;
                case -1611229594:
                case 390960267:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-613)) ^ (-1391909760);
                        i5 = -2126470907;
                    } else {
                        iM45029 = C19806.m45029("۟֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30781)) ^ 1309233225;
                        i5 = 1293622639;
                    }
                    break;
                case -1191136740:
                case 1445304657:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                        i5 = 1956414869;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20029) ^ (-239304161);
                        i5 = -1323522007;
                    }
                    break;
                case -1081014313:
                case 421254669:
                    C1066.m4023();
                    iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                    i5 = 1956414869;
                    break;
                case -970036116:
                case 884487045:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ܺ۬") ^ i3) * (-97);
                        i4 = ((iM45029 ^ i2) * (-9061)) ^ 338301032;
                        i5 = 286759409;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                        i5 = 1956414869;
                    }
                    break;
                case -819535423:
                case 1693546872:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8613)) ^ (-133262854);
                        i5 = 945731859;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳᩴ")) * 101;
                        i4 = ((iM45029 ^ i3) * (-11745)) ^ 1247973129;
                        i5 = 127651426;
                    }
                    break;
                case -752812860:
                case -505741395:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22437)) ^ 1296766378;
                        i5 = 1786710856;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۛ")) * (-113);
                        i4 = ((iM45029 ^ i2) * (-23297)) ^ (-648667867);
                        i5 = -391990017;
                    }
                    break;
                case -386953047:
                case 569843255:
                    if (!C0797.f3386) {
                        iM45029 = (C19806.m45029("ۙۢ") + i2) * 33;
                        i4 = ((iM45029 ^ i3) * 27777) ^ (-1940665102);
                        i5 = 829263497;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-613)) ^ (-1391909760);
                        i5 = -2126470907;
                    }
                    break;
                case 80741867:
                case 2052444623:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8613)) ^ (-133262854);
                        i5 = 945731859;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13759) ^ (-1681497808);
                        i5 = -939566274;
                    }
                    break;
                case 440470859:
                case 1785601560:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                case 898475366:
                case 1491688999:
                    ((C10659) pluginContextM29831).log(th);
                    break;
                case 915626537:
                case 1642574738:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                        i5 = 1956414869;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13413) ^ 1763978324;
                        i5 = 379549379;
                    }
                    break;
                case 1021466542:
                case 1083192738:
                    C3722.m10894();
                    if (C0526.m2437() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22437)) ^ 1296766378;
                        i5 = 1786710856;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                        i5 = 1956414869;
                    }
                    break;
                case 1380505412:
                case 2105619037:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-613)) ^ (-1391909760);
                        i5 = -2126470907;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۤ")) * (-125);
                        i4 = ((iM45029 ^ i2) * 29197) ^ 1449042231;
                        i5 = 1436863615;
                    }
                    break;
                default:
                    if (!C19806.f63586) {
                        iM45029 = (C19806.m45029("ܽ֫") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 18351) ^ (-875648666);
                        i5 = 1956414869;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-613)) ^ (-1391909760);
                        i5 = -2126470907;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m29811() {
        return C0797.m3360(21, this.f40153);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m29821() {
        return this.f40144;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m29839() {
        return this.f40156;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m29843() {
        return this.f40146;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m29823() {
        return this.f40155;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m29840() {
        return this.f40136;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0225 A[PHI: r16
      0x0225: PHI (r16v21 l.᩷۠ۚ) = (r16v4 l.᩷۠ۚ), (r16v5 l.᩷۠ۚ), (r16v22 l.᩷۠ۚ) binds: [B:65:0x0223, B:61:0x0203, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x025a A[PHI: r1 r3 r4 r16
      0x025a: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]) binds: [B:69:0x0258, B:53:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r3v3 short) = (r3v2 short), (r3v4 short) binds: [B:69:0x0258, B:53:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:69:0x0258, B:53:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r16v7 l.᩷۠ۚ) = (r16v3 l.᩷۠ۚ), (r16v8 l.᩷۠ۚ) binds: [B:69:0x0258, B:53:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (l.C1461.f5957 > 0) goto L11;
     */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC20745 m29835() {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29835():l.᩷۠ۚ");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0287  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0131, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0156, code lost:
    
        if (l.C3577.f13150 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0158, code lost:
    
        r36 = r1;
        r5 = r31;
        r0 = r39;
        r31 = r2;
        r39 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0168, code lost:
    
        if (l.AbstractC0464.m2313() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x016f, code lost:
    
        if (l.C0671.m3008() >= 0) goto L34;
     */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m29819() {
        /*
            Method dump skipped, instruction units count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29819():java.util.List");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x017c A[PHI: r3
      0x017c: PHI (r3v4 org.json.JSONArray) = (r3v2 org.json.JSONArray), (r3v2 org.json.JSONArray), (r3v8 org.json.JSONArray) binds: [B:34:0x0112, B:22:0x00a3, B:109:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x019a A[PHI: r8
      0x019a: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:45:0x0198, B:15:0x007b, B:12:0x0075, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x024a A[PHI: r2 r14
      0x024a: PHI (r2v4 l.ۨ᩹ۘ) = (r2v2 l.ۨ᩹ۘ), (r2v3 l.ۨ᩹ۘ), (r2v2 l.ۨ᩹ۘ) binds: [B:60:0x0248, B:49:0x01d0, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:60:0x0248, B:49:0x01d0, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02c7 A[PHI: r10 r11 r21
      0x02c7: PHI (r10v3 short) = (r10v2 short), (r10v4 short) binds: [B:72:0x02c5, B:68:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r11v3 short) = (r11v2 short), (r11v4 short) binds: [B:72:0x02c5, B:68:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:72:0x02c5, B:68:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0317 A[PHI: r6 r7 r12 r13 r16
      0x0317: PHI (r6v4 l.ܰ᩹ۘ) = (r6v2 l.ܰ᩹ۘ), (r6v2 l.ܰ᩹ۘ), (r6v2 l.ܰ᩹ۘ), (r6v3 l.ܰ᩹ۘ), (r6v2 l.ܰ᩹ۘ), (r6v2 l.ܰ᩹ۘ) binds: [B:80:0x0315, B:76:0x02f9, B:64:0x0282, B:30:0x00e0, B:26:0x00b7, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r7v4 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:80:0x0315, B:76:0x02f9, B:64:0x0282, B:30:0x00e0, B:26:0x00b7, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:80:0x0315, B:76:0x02f9, B:64:0x0282, B:30:0x00e0, B:26:0x00b7, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:80:0x0315, B:76:0x02f9, B:64:0x0282, B:30:0x00e0, B:26:0x00b7, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x0315, B:76:0x02f9, B:64:0x0282, B:30:0x00e0, B:26:0x00b7, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11986 m29800(JSONObject jSONObject, C2455 c2455) throws JSONException {
        int iM11306;
        int i;
        int i2;
        int i3 = C3722.f13525;
        int i4 = RunnableC3388.f12514;
        int iM11307 = (ThreadFactoryC3888.m11306("ۡᩴ") + i3) * (-9);
        int i5 = ((iM11307 ^ i4) * (-18359)) ^ 1906402564;
        JSONArray jSONArrayOptJSONArray = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-44353055);
        C11986 c11986 = null;
        int length = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 902661750;
        char c = 0;
        String string = null;
        C14103 c14103 = null;
        int i12 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-1903)) >> 31));
            switch (i11) {
                case -1648465734:
                case 1406969322:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܿ") + i3) * 21;
                        i = ((iM11306 ^ i4) * 18521) ^ (-1951331450);
                        i2 = 973214673;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1588006250:
                case -222513789:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = C19806.m45029("ۜܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24479)) ^ 760171200;
                        i2 = 254583443;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1335000557:
                case -452369249:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("ۜܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24479)) ^ 760171200;
                        i2 = 254583443;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") ^ i4) * 69;
                        i = ((iM11306 ^ i3) * 16827) ^ (-122935541);
                        i2 = 1392968057;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1287220783:
                case 477963022:
                    c11986.f40137 = true;
                    c11986.m29802(c2455);
                    return c11986;
                case -1263875708:
                case 653081837:
                    length = jSONArrayOptJSONArray.length();
                    i12 = 0;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸۟")) * 75;
                    i = ((iM11306 ^ i4) * 32361) ^ 358149367;
                    i2 = -794810571;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1195645876:
                case 710037149:
                    C2249.m6915();
                    C0962.m3746();
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩵") ^ i3;
                    i = ((iM11306 ^ i4) * 18409) ^ (-1742652282);
                    i2 = 671379807;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1151016139:
                case 425492876:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۘ") ^ i3;
                        i = ((iM11306 ^ i4) * (-8853)) ^ (-509604318);
                        i2 = 765200181;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1091832942:
                case 248020548:
                    if (i7 - (i8 + i9) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ۬") ^ i4) * (-125);
                        i = ((iM11306 ^ i3) * 20787) ^ 1449527231;
                        i2 = -1957077220;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-11867)) ^ (-1500158886);
                        i2 = -488257336;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -989376424:
                case 147948298:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۜܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24479)) ^ 760171200;
                        i2 = 254583443;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * 18409) ^ (-1742652282);
                        i2 = 671379807;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -946134438:
                case -800848127:
                    i10 = 37947;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗۨ") + i4) * (-109);
                    i = ((iM11306 ^ i3) * 8105) ^ 1497153599;
                    i2 = -1838601657;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -797234638:
                case 726856535:
                    c11986 = new C11986();
                    c11986.m29804(jSONObject);
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") ^ i4) * 69;
                        i = ((iM11306 ^ i3) * 16827) ^ (-122935541);
                        i2 = 1392968057;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۖ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * 15161) ^ 2011005022;
                        i2 = 38205387;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -689704270:
                case 2136694351:
                    C3660.m10788(c11986.f40159, c14103);
                    i12++;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸۟")) * 75;
                    i = ((iM11306 ^ i4) * 32361) ^ 358149367;
                    i2 = -794810571;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -585059379:
                case 732418692:
                    if (i12 < length) {
                        iM11306 = C19806.m45029("ۜᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-24193)) ^ (-1412694304);
                        i2 = 1185943610;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * 65;
                        i = ((iM11306 ^ i4) * 19607) ^ (-595414772);
                        i2 = -1740108652;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -158744382:
                case 149088813:
                    i9 = 23902321;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") ^ i4) * 69;
                        i = ((iM11306 ^ i3) * 16827) ^ (-122935541);
                        i2 = 1392968057;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۫᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i3) * (-14423)) ^ (-593054977);
                        i2 = 1022078921;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -5356566:
                case 1056854748:
                    sArr2 = f40134;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-123)) ^ (-1713003720);
                        i2 = -192181256;
                    } else {
                        iM11306 = C19806.m45029("ۜܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24479)) ^ 760171200;
                        i2 = 254583443;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 172685504:
                case 695109671:
                    sArr = f40134;
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    } else {
                        iM11306 = (C19806.m45029("۠᩻") + i4) * (-37);
                        i = ((iM11306 ^ i3) * (-11827)) ^ 807736702;
                        i2 = 1825286156;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 226145940:
                case 866267526:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return null;
                case 422950118:
                case 1787529929:
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(AbstractC0464.m2308(sArr2, 158, 10, i10));
                    if (jSONArrayOptJSONArray != null) {
                        int iM45029 = (i4 - C19806.m45029("᩸ۢ")) * 35;
                        i5 = ((iM45029 ^ i3) * (-17599)) ^ (-214685716);
                        i6 = iM45029 ^ 755311643;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * 65;
                        i = ((iM11306 ^ i4) * 19607) ^ (-595414772);
                        i2 = -1740108652;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case 555279428:
                case 1084457886:
                    if (jSONArrayOptJSONArray.isNull(i12)) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * 65;
                        i = ((iM11306 ^ i4) * 19607) ^ (-595414772);
                        i2 = -1740108652;
                    } else {
                        iM11306 = (C19806.m45029("ۖۖ") ^ i3) * (-101);
                        i = ((iM11306 ^ i4) * 1029) ^ 1271842333;
                        i2 = 1427621388;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 579332522:
                case 1643885234:
                    c14103 = new C14103();
                    string = jSONArrayOptJSONArray.getString(i12);
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    } else {
                        iM11306 = C19806.m45029("ܰۚ") ^ i3;
                        i = ((iM11306 ^ i4) * (-8943)) ^ 2141176709;
                        i2 = 269299078;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 896794614:
                case 2123837388:
                    c14103.m34143(string);
                    if (RunnableC0195.m1431()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i4) * 45;
                        i = ((iM11306 ^ i3) * 27949) ^ 874190507;
                        i2 = -1175331589;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21981)) ^ 367020785;
                        i2 = 778935574;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1165084146:
                case 1509638744:
                    c = 157;
                    if (C0629.m2907()) {
                        iM11306 = C19806.m45029("ܺ۟") ^ i3;
                        i = ((iM11306 ^ i4) * 11437) ^ 1162682665;
                        i2 = 2086487497;
                    } else {
                        iM11306 = (C19806.m45029("ܺۖ") + i3) * 75;
                        i = ((iM11306 ^ i4) * (-12493)) ^ (-1314202846);
                        i2 = 1566903748;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1387311929:
                case 1510618699:
                    i10 = 2865;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗۨ") + i4) * (-109);
                    i = ((iM11306 ^ i3) * 8105) ^ 1497153599;
                    i2 = -1838601657;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1495504118:
                case 2109686623:
                    s = sArr[c];
                    s2 = 9778;
                    if (C2642.m8171() != 0) {
                        iM11306 = (C19806.m45029("ܺۖ") + i3) * 75;
                        i = ((iM11306 ^ i4) * (-12493)) ^ (-1314202846);
                        i2 = 1566903748;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ᩴ") + i4) * 37;
                        i = ((iM11306 ^ i3) * (-14067)) ^ 1555061200;
                        i2 = -820208997;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (i12 == length - 1) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * (-14805)) ^ (-1828019497);
                        i2 = -559920669;
                    } else {
                        iM11306 = (C19806.m45029("ۖۖ") ^ i3) * (-101);
                        i = ((iM11306 ^ i4) * 1029) ^ 1271842333;
                        i2 = 1427621388;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m29824() {
        ArrayList arrayList = null;
        Iterator itM10563 = null;
        C14103 c14103 = null;
        boolean z = false;
        int i = 843566172;
        int i2 = RunnableC0195.f1321;
        int i3 = C3535.f13026;
        int iM45029 = C19806.m45029("᩵ۙ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-31239)) ^ (-1887594798);
        int i5 = 576782033;
        while (true) {
            int i6 = iM45029 ^ i5;
            while (true) {
                i = ((((i ^ i3) * 207) >> 31) & i4) ^ i6;
                switch (i) {
                    case -2118773882:
                    case -200773028:
                        arrayList = this.f40159;
                        if (C0671.f2816 == 0) {
                            iM45029 = (C19806.m45029("᩹ۢ") ^ i2) * (-89);
                            i4 = ((iM45029 ^ i3) * (-28531)) ^ 766198049;
                            i5 = -412952519;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۢ")) * 127;
                        i4 = ((iM45029 ^ i2) * (-21365)) ^ 1093023383;
                        i5 = 511361502;
                        break;
                    case -1922892735:
                    case 985057529:
                        C1398.m4895();
                        if (!C0817.m3399()) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۢ")) * 127;
                            i4 = ((iM45029 ^ i2) * (-21365)) ^ 1093023383;
                            i5 = 511361502;
                            break;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("֡ۧ")) * 5;
                        i4 = ((iM45029 ^ i2) * (-31743)) ^ (-1550774550);
                        i5 = 560430177;
                        break;
                    case -1851004747:
                    case -1837765302:
                        C0671.m3008();
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-363)) ^ 468816288;
                        i5 = 2096693492;
                        break;
                    case -1644322623:
                    case -673537773:
                        C2704.m8255();
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        return false;
                    case -1595390412:
                    case -1273108026:
                        if (!C0962.f3784) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ܰ") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-29255)) ^ 875810082;
                            i5 = 2112702040;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("֡ۧ")) * 5;
                        i4 = ((iM45029 ^ i2) * (-31743)) ^ (-1550774550);
                        i5 = 560430177;
                        break;
                        break;
                    case -1431275192:
                    case -1000628006:
                        if (!C1977.m6356()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖܶ") + i3) * 71;
                            i4 = ((iM45029 ^ i2) * 3969) ^ 408602175;
                            i5 = -2073784488;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("֡ۧ")) * 5;
                        i4 = ((iM45029 ^ i2) * (-31743)) ^ (-1550774550);
                        i5 = 560430177;
                        break;
                        break;
                    case -1250912524:
                    case 1184960822:
                        C1148.m4232();
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") + i2) * (-33);
                            i4 = ((iM45029 ^ i3) * (-363)) ^ 468816288;
                            i5 = 2096693492;
                            break;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۢ")) * 127;
                        i4 = ((iM45029 ^ i2) * (-21365)) ^ 1093023383;
                        i5 = 511361502;
                        break;
                        break;
                    case -1105841302:
                    case -1011129248:
                        if (c14103.m34144() != 1) {
                            z = true;
                            iM45029 = (ThreadFactoryC3888.m11306("᩶۫") ^ i2) * (-7);
                            i4 = ((iM45029 ^ i3) * (-13401)) ^ (-1918142037);
                            i5 = -1677475029;
                        }
                        int iM450210 = (i3 - C19806.m45029("᩵ܶ")) * (-3);
                        i4 = ((iM450210 ^ i2) * 9261) ^ (-1844633545);
                        i6 = iM450210 ^ 476824767;
                        z = true;
                        break;
                        break;
                    case -896903022:
                    case 1873864992:
                        if (AbstractC0464.f2088 > 0) {
                            iM45029 = (i2 - C19806.m45029("۠ۧ")) * 87;
                            i4 = ((iM45029 ^ i3) * 31165) ^ 237731885;
                            i5 = 427615762;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("֡ۧ")) * 5;
                        i4 = ((iM45029 ^ i2) * (-31743)) ^ (-1550774550);
                        i5 = 560430177;
                        break;
                        break;
                    case -821845867:
                    case 921519818:
                        itM10563 = C3577.m10563(arrayList);
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۫") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-13401)) ^ (-1918142037);
                        i5 = -1677475029;
                        break;
                    case -821188557:
                    case -543896595:
                        if (C3722.f13525 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") + i3) * (-17);
                            i4 = ((iM45029 ^ i2) * (-4349)) ^ 1530545567;
                            i5 = 1829689222;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۘ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * (-20589)) ^ (-1249959600);
                        i5 = -1013912753;
                        break;
                    case -328235905:
                    case -66897543:
                        return z;
                    case -316303601:
                    case 710323131:
                        if (!C19806.f63586) {
                            iM45029 = ThreadFactoryC3888.m11306("ۘܺ") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-14645)) ^ 1412637384;
                            i5 = -1788166161;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-363)) ^ 468816288;
                        i5 = 2096693492;
                        break;
                        break;
                    case -29696516:
                    case 1059814616:
                        if (!RunnableC1564.f6300) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") + i2) * (-33);
                            i4 = ((iM45029 ^ i3) * (-363)) ^ 468816288;
                            i5 = 2096693492;
                            break;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۘ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * (-20589)) ^ (-1249959600);
                        i5 = -1013912753;
                        break;
                        break;
                    case 78255361:
                    case 1601361263:
                        return false;
                    case 319421729:
                    case 1777996852:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = C19806.m45029("᩷᩺") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-159)) ^ 1397944103;
                            i5 = 1931354967;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-363)) ^ 468816288;
                        i5 = 2096693492;
                        break;
                        break;
                    case 421282077:
                    case 2126624521:
                        if (!C0962.m3748(itM10563)) {
                            iM45029 = (i2 - ThreadFactoryC3888.m11306("֨ܽ")) * 5;
                            i4 = ((iM45029 ^ i3) * (-32411)) ^ (-1207724605);
                            i5 = 1817922521;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("᩵ܰ")) * (-3);
                        i4 = ((iM45029 ^ i2) * 27791) ^ (-1642039458);
                        i5 = -904673006;
                        break;
                    case 571329698:
                    case 1607338657:
                        if (!C2871.m8646()) {
                            iM45029 = C19806.m45029("ۚ۬") ^ i2;
                            i4 = ((iM45029 ^ i3) * 9527) ^ 1750259658;
                            i5 = -1721514504;
                            break;
                        }
                        iM45029 = C19806.m45029("۟ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28275) ^ 1202170020;
                        i5 = 157643557;
                        break;
                    case 631245251:
                    case 754799019:
                        if (C1461.f5957 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۤ") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21163)) ^ (-400606798);
                            i5 = 1826309264;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۘ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * (-20589)) ^ (-1249959600);
                        i5 = -1013912753;
                        break;
                        break;
                    default:
                        c14103 = (C14103) C0278.m1776(itM10563);
                        if (!C0962.f3784) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܿۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i4 = ((iM45029 ^ i3) * (-27123)) ^ 1998621111;
                            i5 = -992518140;
                            break;
                        }
                        iM45029 = C19806.m45029("ۚ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9527) ^ 1750259658;
                        i5 = -1721514504;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m29807() {
        return this.f40157;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m29825() {
        return this.f40158;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m29841() {
        return this.f40151;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01d1 A[PHI: r9 r12 r13 r15
      0x01d1: PHI (r9v3 short[]) = (r9v2 short[]), (r9v4 short[]) binds: [B:46:0x01cf, B:42:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:46:0x01cf, B:42:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:46:0x01cf, B:42:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:46:0x01cf, B:42:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009d, code lost:
    
        if (l.C1875.f7103 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11986 m29799(org.json.JSONObject r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11986.m29799(org.json.JSONObject):l.ۨ᩹ۘ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29817(boolean z) {
        int i = -2133508932;
        int i2 = C3577.f13150;
        int i3 = C1461.f5957;
        int iM11306 = ThreadFactoryC3888.m11306("ۨۖ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 9733) ^ (-1655176060);
        int i5 = -1930654111;
        while (true) {
            i = ((((i ^ i2) * 10137) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1998892476:
                case -1928903017:
                    m29813();
                    iM11306 = C19806.m45029("᩵᩺") ^ i3;
                    i4 = ((iM11306 ^ i2) * 16533) ^ (-322774002);
                    i5 = 140058855;
                    break;
                case -1980121417:
                case 1954429538:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22187)) ^ 1381729780;
                        i5 = 2073511388;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ᩳ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-5897)) ^ 1170594963;
                        i5 = 1087004398;
                    }
                    break;
                case -1894634702:
                case -1726257432:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("۫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10371)) ^ 1970251326;
                        i5 = 231004762;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27445) ^ 752340471;
                        i5 = 1469335153;
                    }
                    break;
                case -1761000417:
                case -394341521:
                    C1148.m4232();
                    C0962.m3746();
                    break;
                case -1672427458:
                case -729190612:
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14963) ^ 1198010149;
                        i5 = 1574270923;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3653) ^ (-15724831);
                        i5 = -1777683772;
                    }
                    break;
                case -1526367850:
                case 1346327521:
                    break;
                case -1417325373:
                case 1027312628:
                    C1377.m4833();
                    if (C10634.f36300 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14963) ^ 1198010149;
                        i5 = 1574270923;
                    } else {
                        iM11306 = C19806.m45029("᩸֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7251)) ^ (-518326362);
                        i5 = -2127308528;
                    }
                    break;
                case -1371154892:
                case 1471233174:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۤ") + i3) * (-115);
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 532795911;
                        i5 = 249661618;
                    } else {
                        iM11306 = C19806.m45029("۫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10371)) ^ 1970251326;
                        i5 = 231004762;
                    }
                    break;
                case -954695635:
                case 802607607:
                    C0671.m3008();
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("᩸֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7251)) ^ (-518326362);
                        i5 = -2127308528;
                    } else {
                        iM11306 = C19806.m45029("۫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10371)) ^ 1970251326;
                        i5 = 231004762;
                    }
                    break;
                case -849749772:
                case 680836573:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22187)) ^ 1381729780;
                        i5 = 2073511388;
                    } else {
                        iM11306 = C19806.m45029("᩸ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16521)) ^ 2069242447;
                        i5 = 808752150;
                    }
                    break;
                case -831733668:
                case -441217526:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("۫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10371)) ^ 1970251326;
                        i5 = 231004762;
                    } else {
                        iM11306 = C19806.m45029("֨ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26033)) ^ (-943998204);
                        i5 = 64393865;
                    }
                    break;
                case -778522292:
                case 632316286:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24513) ^ (-1392727411);
                        i5 = 322422604;
                    } else {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22187)) ^ 1381729780;
                        i5 = 2073511388;
                    }
                    break;
                case -648683901:
                case 513297381:
                    ThreadFactoryC3888.m11300();
                    RunnableC1606.m5473();
                    iM11306 = C19806.m45029("۫֡") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-10371)) ^ 1970251326;
                    i5 = 231004762;
                    break;
                case -644702362:
                case 585326686:
                    if (C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5215) ^ 1729507205;
                        i5 = 881569710;
                    } else {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22187)) ^ 1381729780;
                        i5 = 2073511388;
                    }
                    break;
                case -635538716:
                case 703246760:
                    this.f40137 = z;
                    if (z) {
                        iM11306 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16533) ^ (-322774002);
                        i5 = 140058855;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۜ") ^ i2) * (-51);
                        i4 = ((iM11306 ^ i3) * (-29593)) ^ 693467219;
                        i5 = -1580126105;
                    }
                    break;
                case -514139302:
                case -510802201:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14963) ^ 1198010149;
                        i5 = 1574270923;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22525)) ^ (-653836834);
                        i5 = -203377357;
                    }
                    break;
                case 304664316:
                case 1750242026:
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14963) ^ 1198010149;
                        i5 = 1574270923;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩸") ^ i3) * (-97);
                        i4 = ((iM11306 ^ i2) * (-13885)) ^ 1801427266;
                        i5 = 1493147851;
                    }
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14963) ^ 1198010149;
                        i5 = 1574270923;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۬᩻")) * (-11);
                        i4 = ((iM11306 ^ i3) * 32395) ^ 376175215;
                        i5 = -2002767016;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29801(ArrayList arrayList, int i) {
        Iterator itM10563 = null;
        C14103 c14103 = null;
        Exception e = null;
        int i2 = 1710702978;
        int i3 = C2477.f9839;
        int i4 = RunnableC1606.f6488;
        int iM11306 = (ThreadFactoryC3888.m11306("ܿܳ") + i3) * (-93);
        int i5 = ((iM11306 ^ i4) * 5141) ^ (-1458678131);
        int i6 = 1098998526;
        while (true) {
            i2 = ((((i2 ^ i4) * 16355) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2027571696:
                case 1281214618:
                    C0671.m3008();
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4055) ^ (-1010014733);
                        i6 = -127154791;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9)) ^ 583055551;
                        i6 = -790774943;
                    }
                    break;
                case -2007369605:
                case -1988792770:
                    C0050.m946();
                    iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                    i5 = ((iM11306 ^ i3) * (-9)) ^ 583055551;
                    i6 = -790774943;
                    break;
                case -1979494974:
                case 229440173:
                    c14103 = (C14103) C0278.m1776(itM10563);
                    if (c14103.f46339 == i) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 29437) ^ 1202899124;
                        i6 = -340778764;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۡ") + i4) * (-59);
                        i5 = ((iM11306 ^ i3) * 9609) ^ (-892656681);
                        i6 = -1980159305;
                    }
                    break;
                case -1821768434:
                case 830194697:
                    if (C0962.m3748(itM10563)) {
                        iM11306 = (C19806.m45029("᩸ܿ") + i3) * (-127);
                        i5 = ((iM11306 ^ i4) * (-7597)) ^ (-1707337800);
                        i6 = -602823177;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16795)) ^ 806640881;
                        i6 = 821681123;
                    }
                    break;
                case -1820807924:
                case 2080689321:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9)) ^ 583055551;
                        i6 = -790774943;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17543) ^ 365553640;
                        i6 = 244402292;
                    }
                    break;
                case -1677835103:
                case -1525743972:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9)) ^ 583055551;
                        i6 = -790774943;
                    } else {
                        iM11306 = C19806.m45029("᩸۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-4237)) ^ 446074582;
                        i6 = 495382837;
                    }
                    break;
                case -1325137654:
                case 150234565:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18699)) ^ 1284811386;
                        i6 = -1551186620;
                    } else {
                        iM11306 = (C19806.m45029("ۤᩴ") ^ i3) * 99;
                        i5 = ((iM11306 ^ i4) * 953) ^ (-1144003805);
                        i6 = -1173277508;
                    }
                    break;
                case -1231823654:
                case 1086849119:
                    break;
                case -649875322:
                case 2128468215:
                    if (C1148.m4232() <= 0) {
                        iM11306 = (i4 - C19806.m45029("֫ۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM11306 ^ i3) * 23729) ^ 1107902400;
                        i6 = 465054269;
                    } else {
                        iM11306 = C19806.m45029("ۡܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 21025) ^ (-1459192063);
                        i6 = -1409938098;
                    }
                    break;
                case -607660071:
                case 1046039799:
                    if (C0278.m1789() <= 0) {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4055) ^ (-1010014733);
                        i6 = -127154791;
                    } else {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i4) * 35;
                        i5 = ((iM11306 ^ i3) * (-21955)) ^ (-68512021);
                        i6 = -1737013016;
                    }
                    break;
                case -515494924:
                case 1912568094:
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("᩻ۙ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-20683)) ^ 1228112665;
                        i6 = -946304128;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩵") ^ i3) * (-97);
                        i5 = ((iM11306 ^ i4) * 31173) ^ 1371921488;
                        i6 = -2045218463;
                    }
                    break;
                case -341782532:
                case 1948744547:
                    m29814(e);
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۡ") + i4) * (-59);
                    i5 = ((iM11306 ^ i3) * 9609) ^ (-892656681);
                    i6 = -1980159305;
                    break;
                case -229499771:
                case 1734602601:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25829)) ^ 1224129139;
                        i6 = 1871938664;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֫ۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM11306 ^ i3) * 23729) ^ 1107902400;
                        i6 = 465054269;
                    }
                    break;
                case -137498813:
                case 2086478200:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i4 - C19806.m45029("֫ۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM11306 ^ i3) * 23729) ^ 1107902400;
                        i6 = 465054269;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܽ") ^ i4) * 3;
                        i5 = ((iM11306 ^ i3) * (-7065)) ^ (-735727092);
                        i6 = 2122393249;
                    }
                    break;
                case 73715088:
                case 717962822:
                    if (m29806()) {
                        iM11306 = (C19806.m45029("᩸ۘ") + i4) * 69;
                        i5 = ((iM11306 ^ i3) * 27731) ^ 1176891022;
                        i6 = -1803864816;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۡ") + i4) * (-59);
                        i5 = ((iM11306 ^ i3) * 9609) ^ (-892656681);
                        i6 = -1980159305;
                    }
                    break;
                case 108170276:
                case 1287990673:
                    C7105.m18985();
                    if (!RunnableC1564.m5345()) {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4055) ^ (-1010014733);
                        i6 = -127154791;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18699)) ^ 1284811386;
                        i6 = -1551186620;
                    }
                    break;
                case 305978115:
                case 1192651086:
                    C1398.m4895();
                    if (C1668.f6641 < 0) {
                        iM11306 = (C19806.m45029("᩻ۙ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-20683)) ^ 1228112665;
                        i6 = -946304128;
                    } else {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4055) ^ (-1010014733);
                        i6 = -127154791;
                    }
                    break;
                case 530738462:
                case 1367197239:
                    itM10563 = C3577.m10563(this.f40159);
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۡ") + i4) * (-59);
                    i5 = ((iM11306 ^ i3) * 9609) ^ (-892656681);
                    i6 = -1980159305;
                    break;
                case 637707844:
                case 846257160:
                    try {
                        C2249.m6905(arrayList, C23524.m51818(this.f40140, c14103.f46338));
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۡ") + i4) * (-59);
                        i5 = ((iM11306 ^ i3) * 9609) ^ (-892656681);
                        i6 = -1980159305;
                    } catch (Exception e2) {
                        e = e2;
                        iM11306 = (C19806.m45029("᩷ܶ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM11306 ^ i4) * (-28889)) ^ (-1609731204);
                        i6 = 1823584193;
                    }
                    break;
                case 1057576568:
                case 2099468950:
                    ThreadFactoryC3888.m11300();
                    C1025.m3861();
                    break;
                case 1376906678:
                case 1545575341:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("᩻ۙ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-20683)) ^ 1228112665;
                        i6 = -946304128;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1727) ^ 1567670890;
                        i6 = -481735387;
                    }
                    break;
                default:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("᩻ۙ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-20683)) ^ 1228112665;
                        i6 = -946304128;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۖ") + i4) * (-125);
                        i5 = ((iM11306 ^ i3) * 4179) ^ (-1812361364);
                        i6 = 2026863876;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m29822() {
        return this.f40137;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m29830() {
        return this.f40152;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29820(String str) {
        this.f40152 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29842() {
        return this.f40142;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29834(boolean z) {
        this.f40142 = z;
    }

    public final void finalize() {
        m29813();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class m29832(String str) {
        return m29795(2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m29812(String str) {
        return m29795(3, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Class m29826(String str) {
        return m29795(4, str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29810(ArrayList arrayList) {
        m29801(arrayList, 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29833(ArrayList arrayList) {
        m29801(arrayList, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29815(ArrayList arrayList) {
        m29801(arrayList, 3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29828(ArrayList arrayList) {
        m29801(arrayList, 4);
    }

    public final String toString() {
        int iM45029;
        int i;
        JSONException e = null;
        Iterator itM10563 = null;
        boolean zM5348 = false;
        String str = null;
        String strM3407 = null;
        int i2 = 0;
        int i3 = 80487780;
        int i4 = C2871.f10837;
        int i5 = C1937.f7317;
        int iM450210 = (C19806.m45029("ܶܳ") + i4) * (-61);
        int i6 = ((iM450210 ^ i5) * (-20627)) ^ (-1226668365);
        int i7 = iM450210 ^ (-1034771838);
        JSONArray jSONArray = null;
        JSONObject jSONObject = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-30125)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2054482252:
                case -1976874990:
                    str = this.f40157;
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i4;
                    i6 = (-1829318226) ^ ((iM45029 ^ i5) * 14125);
                    i = -1184755124;
                    i7 = i ^ iM45029;
                    break;
                case -1636008513:
                case 2060324129:
                    try {
                        jSONObject.put(C1937.m6288(f40134, 512, 14, i2), str);
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۫᩹")) * 127;
                        i6 = (-2060317182) ^ ((iM45029 ^ i4) * (-11913));
                        i = 775028770;
                    } catch (JSONException e2) {
                        e = e2;
                        iM45029 = (C19806.m45029("ܿ᩸") + i5) * (-75);
                        i6 = 1436615875 ^ ((iM45029 ^ i4) * (-4609));
                        i = -1686731606;
                    }
                    i7 = i ^ iM45029;
                    break;
                case -1631175911:
                case 559395604:
                    short s = f40134[409];
                    int i8 = 34968 * s;
                    int i9 = s + 8742;
                    if ((i9 * i9) - i8 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۢ") ^ i5;
                        i6 = 761574300 ^ ((iM45029 ^ i4) * 27879);
                        i = 564296198;
                    } else {
                        iM45029 = (C19806.m45029("ۗ۟") ^ i4) * (-89);
                        i6 = (-1909947531) ^ ((iM45029 ^ i5) * (-18563));
                        i = -799860536;
                    }
                    i7 = i ^ iM45029;
                    break;
                case -1594033774:
                case 1187378004:
                    zM5348 = RunnableC1564.m5348(itM10563);
                    iM45029 = C19806.m45029("֡ᩳ") ^ i5;
                    i6 = 1659831852 ^ ((iM45029 ^ i4) * (-20409));
                    i = 20975521;
                    i7 = i ^ iM45029;
                    break;
                case -1333700438:
                case -600523997:
                    jSONObject.put(C1189.m4365(f40134, 502, 10, i2), jSONArray);
                    jSONObject.put(C3722.m10901(f40134, 526, 6, i2), this.f40137);
                    jSONObject.put(RunnableC1564.m5344(f40134, 532, 3, i2), this.f40152);
                    jSONObject.put(C0797.m3361(f40134, 535, 7, i2), this.f40158);
                    jSONObject.put(C0050.m940(f40134, 542, 8, i2), this.f40151);
                    jSONObject.put(C0962.m3747(f40134, 550, 17, i2), this.f40142);
                    strM3407 = C0817.m3407(jSONObject);
                    iM45029 = (C19806.m45029("ۘܳ") ^ i5) * 67;
                    i6 = 934306471 ^ ((iM45029 ^ i4) * (-32741));
                    i = -1403808427;
                    i7 = i ^ iM45029;
                    break;
                case -904055706:
                case -156635378:
                    i2 = 30860;
                    iM45029 = C19806.m45029("ۖۜ") ^ i4;
                    i6 = (-226767538) ^ ((iM45029 ^ i5) * 12997);
                    i = -899876519;
                    i7 = i ^ iM45029;
                    break;
                case -504370919:
                case 1962314772:
                    return C2124.m6674(e);
                case -352538050:
                case 1167927895:
                    if (zM5348) {
                        iM45029 = (i5 - C19806.m45029("ۧۧ")) * (-121);
                        i6 = 570239206 ^ ((iM45029 ^ i4) * (-28237));
                        i = -1820056942;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۘ") ^ i4) * 87;
                        i6 = (-953354141) ^ ((iM45029 ^ i5) * 23117);
                        i = 1428695424;
                    }
                    i7 = i ^ iM45029;
                    break;
                case -238591988:
                case 437865972:
                    i2 = 45431;
                    iM45029 = C19806.m45029("ۖۜ") ^ i4;
                    i6 = (-226767538) ^ ((iM45029 ^ i5) * 12997);
                    i = -899876519;
                    i7 = i ^ iM45029;
                    break;
                case 131123145:
                case 1540291962:
                    C14103 c14103 = (C14103) C0216.m1584(itM10563);
                    jSONArray.put(c14103.m34141());
                    jSONArray.put(c14103.m34144());
                    iM45029 = (C19806.m45029("ܿۜ") + i4) * (-53);
                    i6 = (-299420980) ^ ((iM45029 ^ i5) * (-11405));
                    i = -1294348425;
                    i7 = i ^ iM45029;
                    break;
                case 506596727:
                case 1669386122:
                    return strM3407;
                case 1042862430:
                case 2024550675:
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(C1419.m4969(f40134, 410, 17, i2), this.f40153);
                        jSONObject.put(ViewTreeObserverOnPreDrawListenerC3327.m9869(f40134, 427, 14, i2), this.f40144);
                        jSONObject.put(C0962.m3747(f40134, 441, 16, i2), this.f40156);
                        jSONObject.put(CallableC1627.m5502(f40134, 457, 8, i2), this.f40146);
                        jSONObject.put(C2249.m6918(f40134, 465, 11, i2), this.f40155);
                        jSONObject.put(C1419.m4969(f40134, 476, 11, i2), this.f40136);
                        jSONObject.put(C0817.m3406(f40134, 487, 4, i2), this.f40154);
                        jSONObject.put(C3743.m10964(f40134, 491, 11, i2), this.f40141);
                        try {
                            jSONArray = new JSONArray();
                            itM10563 = C3577.m10563(this.f40159);
                            iM45029 = (C19806.m45029("ܿۜ") + i4) * (-53);
                            i6 = (-299420980) ^ ((iM45029 ^ i5) * (-11405));
                            i = -1294348425;
                        } catch (JSONException e3) {
                            e = e3;
                            jSONArray = null;
                            iM45029 = (C19806.m45029("ܿ᩸") + i5) * (-75);
                            i6 = 1436615875 ^ ((iM45029 ^ i4) * (-4609));
                            i = -1686731606;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        jSONObject = null;
                    }
                    i7 = i ^ iM45029;
                    break;
                default:
                    if (str != null) {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i4;
                        i6 = 1073718575 ^ ((iM45029 ^ i5) * 13059);
                        i = 747590889;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۫᩹")) * 127;
                        i6 = (-2060317182) ^ ((iM45029 ^ i4) * (-11913));
                        i = 775028770;
                    }
                    i7 = i ^ iM45029;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0504 A[PHI: r15 r16 r17 r23
      0x0504: PHI (r15v7 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:121:0x0502, B:100:0x040e, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r16v7 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:121:0x0502, B:100:0x040e, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r17v7 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:121:0x0502, B:100:0x040e, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r23v70 java.lang.String) = (r23v43 java.lang.String), (r23v50 java.lang.String), (r23v71 java.lang.String) binds: [B:121:0x0502, B:100:0x040e, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x057a A[PHI: r3 r18 r19 r23
      0x057a: PHI (r3v9 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String), (r3v2 java.lang.String) binds: [B:130:0x0578, B:104:0x0437, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x057a: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:130:0x0578, B:104:0x0437, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x057a: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:130:0x0578, B:104:0x0437, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x057a: PHI (r23v58 java.lang.String) = (r23v40 java.lang.String), (r23v49 java.lang.String), (r23v59 java.lang.String) binds: [B:130:0x0578, B:104:0x0437, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fc A[PHI: r8
      0x01fc: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:48:0x017c, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025c A[PHI: r7
      0x025c: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:65:0x0244, B:57:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x029a A[PHI: r6
      0x029a: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:69:0x0280, B:62:0x021c, B:55:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e4 A[PHI: r5
      0x02e4: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:77:0x02e2, B:27:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x034c A[PHI: r12
      0x034c: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:85:0x034a, B:73:0x02bc, B:30:0x00e4, B:27:0x00de, B:13:0x00a7, B:177:0x034c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0384 A[PHI: r4
      0x0384: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:89:0x0382, B:13:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m29804(JSONObject jSONObject) throws JSONException {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        String str;
        int i5 = C2477.f9839;
        int i6 = AbstractC0464.f2088;
        int iM450210 = (i6 - C19806.m45029("᩺ܰ")) * 71;
        int i7 = ((iM450210 ^ i5) * (-32583)) ^ (-1860938584);
        short[] sArr = null;
        int i8 = iM450210 ^ 1392755383;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -838762470;
        short s = 0;
        short[] sArr2 = null;
        String strM2906 = null;
        String strM6918 = null;
        String strM18989 = null;
        String strM10056 = null;
        String strM1429 = null;
        String strM6164 = null;
        String strM5577 = null;
        String strM2424 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-10317)) >> 31));
            switch (i14) {
                case -2132847089:
                case 1806962630:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1377.m4833();
                    iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i6;
                    i = ((iM45029 ^ i5) * (-4417)) ^ (-1993342718);
                    i2 = 1843844521;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -2054621790:
                case -115497435:
                    this.f40151 = jSONObject.getBoolean(strM2906);
                    iM45029 = ThreadFactoryC3888.m11306("ۘܺ") ^ i6;
                    i = ((iM45029 ^ i5) * (-5551)) ^ (-1398748123);
                    i2 = 614806777;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -2037443659:
                case 897877823:
                    C3743.m10966();
                    C10634.m26820();
                    return;
                case -1950987640:
                case 2089961125:
                    strM5577 = strM5577;
                    short s2 = sArr2[c];
                    i10 = s2 + 1373;
                    if (RunnableC1564.f6300) {
                        s = s2;
                        iM11306 = C19806.m45029("ۙᩳ") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-10639)) ^ 1932006967;
                        i4 = -1027051075;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                    } else {
                        int iM450211 = (C19806.m45029("۠᩻") + i6) * 127;
                        s = s2;
                        i7 = ((iM450211 ^ i5) * (-1111)) ^ (-775734900);
                        str = strM5577;
                        i8 = iM450211 ^ (-1560777598);
                    }
                    strM5577 = str;
                    break;
                case -1937384432:
                case 1806307196:
                    if (!RunnableC0195.m1431()) {
                        strM5577 = strM5577;
                        iM11306 = (C19806.m45029("ᩳۡ") + i6) * (-121);
                        i3 = ((iM11306 ^ i5) * 32655) ^ 2103435798;
                        i4 = -1694625618;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                        strM5577 = str;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i6;
                        i = ((iM45029 ^ i5) * (-4417)) ^ (-1993342718);
                        i2 = 1843844521;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1877413057:
                case -1457268789:
                    strM1429 = RunnableC0195.m1429(f40134, 299, 14, i9);
                    if (jSONObject.has(strM1429)) {
                        iM45029 = (i5 - C19806.m45029("ۛۘ")) * 9;
                        i = ((iM45029 ^ i6) * 6983) ^ (-2132675814);
                        i2 = -541400077;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("֡۫")) * (-29);
                        i = ((iM45029 ^ i6) * (-19783)) ^ 169572152;
                        i2 = -1769543824;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1861971067:
                case -1416331275:
                    i9 = 27265;
                    iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                    i3 = ((iM11306 ^ i5) * (-18341)) ^ (-76519724);
                    i4 = -1944607218;
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -1649130635:
                case 823973008:
                    int iM6106 = C1875.m6106(jSONObject, strM18989);
                    this.f40153 = iM6106;
                    if (iM6106 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i5;
                        i = ((iM45029 ^ i6) * (-16429)) ^ (-1634672145);
                        i2 = 578900492;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩸") ^ i5) * (-73);
                        i = ((iM45029 ^ i6) * 11075) ^ (-760226793);
                        i2 = -1231762581;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1463452215:
                case -311235881:
                    strM2906 = C0629.m2906(f40134, 369, 8, i9);
                    if (jSONObject.has(strM2906)) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۬") ^ i5;
                        i = ((iM45029 ^ i6) * 21439) ^ 1281909058;
                        i2 = -1993368711;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘܺ") ^ i6;
                        i = ((iM45029 ^ i5) * (-5551)) ^ (-1398748123);
                        i2 = 614806777;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1405767391:
                case -1299295986:
                    this.f40154 = RunnableC1606.m5479(jSONObject, C0962.m3747(sArr, 284, 4, i9));
                    if (!RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("ᩴ۬") ^ i6;
                        i = ((iM45029 ^ i5) * 7863) ^ 1773476607;
                        i2 = -1257330701;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        strM5577 = strM5577;
                        iM11306 = C19806.m45029("ۙᩳ") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-10639)) ^ 1932006967;
                        i4 = -1027051075;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                        strM5577 = str;
                    }
                    break;
                case -1400530012:
                case 1398456107:
                    strM5577 = strM5577;
                    strM2424 = C0526.m2424(f40134, 238, 8, i9);
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ᩳۡ") + i6) * (-121);
                        i3 = ((iM11306 ^ i5) * 32655) ^ 2103435798;
                        i4 = -1694625618;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i5) * q.h;
                        i3 = ((iM11306 ^ i6) * 24959) ^ (-653897841);
                        i4 = 692572675;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -1389448291:
                case -937092872:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i6) * 3251) ^ 1546126490;
                        i2 = -446777881;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1355921268:
                case -1263339076:
                    C0962.m3746();
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܰ") ^ i6;
                        i = ((iM45029 ^ i5) * 15779) ^ (-328614980);
                        i2 = 198301421;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        strM5577 = strM5577;
                        iM11306 = (C19806.m45029("᩶᩶") ^ i5) * 91;
                        i3 = ((iM11306 ^ i6) * (-6265)) ^ (-1652050297);
                        i4 = -1972000986;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                        strM5577 = str;
                    }
                    break;
                case -1292264983:
                case -554316771:
                    if (!C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۚ") ^ i5;
                        i = ((iM45029 ^ i6) * (-18865)) ^ (-745293585);
                        i2 = -915753979;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        strM5577 = strM5577;
                        iM11306 = (C19806.m45029("᩶᩶") ^ i5) * 91;
                        i3 = ((iM11306 ^ i6) * (-6265)) ^ (-1652050297);
                        i4 = -1972000986;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                        strM5577 = str;
                    }
                    break;
                case -1282683087:
                case 1028428974:
                    this.f40141 = C2477.m7600(jSONObject, strM6164);
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩺") ^ i6;
                        i = ((iM45029 ^ i5) * 28573) ^ (-660171539);
                        i2 = -247361912;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1219491159:
                case 158745169:
                    throw new JSONException(C2332.m7082(f40134, 377, 21, i9));
                case -1185191889:
                case 1040488387:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                    } else {
                        iM45029 = C19806.m45029("ۚᩴ") ^ i6;
                        i = ((iM45029 ^ i5) * 7751) ^ (-270587531);
                        i2 = -321871807;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1157300430:
                case 1591526460:
                    strM5577 = C1668.m5577(f40134, 273, 11, i9);
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۚᩴ") ^ i6;
                        i = ((iM45029 ^ i5) * 7751) ^ (-270587531);
                        i2 = -321871807;
                    } else {
                        iM45029 = (C19806.m45029("۫ᩴ") + i5) * 123;
                        i = ((iM45029 ^ i6) * 28689) ^ (-460173853);
                        i2 = -1826114127;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -986116396:
                case -311481812:
                    strM6164 = RunnableC1895.m6164(f40134, 288, 11, i9);
                    if (C1148.f5161 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i6) * 3251) ^ 1546126490;
                        i2 = -446777881;
                    } else {
                        iM45029 = C19806.m45029("ۤܶ") ^ i5;
                        i = ((iM45029 ^ i6) * (-11583)) ^ (-410174268);
                        i2 = -1011215091;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -883276694:
                case 947967985:
                    strM5577 = strM5577;
                    int iM3005 = C0671.m3005(jSONObject, C3743.m10964(f40134, 246, 11, i9));
                    this.f40155 = iM3005;
                    if (iM3005 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۜ") ^ i6;
                        i3 = ((iM11306 ^ i5) * 19593) ^ (-1719248882);
                        i4 = -479890724;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ܿ᩶")) * 51;
                        i3 = ((iM11306 ^ i6) * 6037) ^ (-918701433);
                        i4 = 986616708;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -811037502:
                case 772500458:
                    String strM7600 = C2477.m7600(jSONObject, strM1429);
                    this.f40157 = strM7600;
                    if (C3660.m10786(strM7600)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܿ") + i6) * (-49);
                        i = ((iM45029 ^ i5) * (-12083)) ^ 425759014;
                        i2 = 999416866;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("֡۫")) * (-29);
                        i = ((iM45029 ^ i6) * (-19783)) ^ 169572152;
                        i2 = -1769543824;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -781169021:
                case 837852584:
                    int iM3006 = C0671.m3005(jSONObject, strM10056);
                    this.f40144 = iM3006;
                    if (iM3006 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i6;
                        i = ((iM45029 ^ i5) * (-19559)) ^ 2025899758;
                        i2 = -1678199955;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֫") ^ i6) * (-53);
                        i = ((iM45029 ^ i5) * (-24681)) ^ 1404150641;
                        i2 = 1769027779;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -780605408:
                case 1093738489:
                    strM5577 = strM5577;
                    sArr2 = f40134;
                    c = 200;
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ᩳۡ") + i6) * (-121);
                        i3 = ((iM11306 ^ i5) * 32655) ^ 2103435798;
                        i4 = -1694625618;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۧ") + i5) * (-53);
                        i3 = ((iM11306 ^ i6) * (-21215)) ^ (-202656283);
                        i4 = 1310557543;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -730477944:
                case -256098652:
                    strM5577 = strM5577;
                    int iM6107 = C1875.m6106(jSONObject, C0050.m940(f40134, 201, 16, i9));
                    this.f40156 = iM6107;
                    if (iM6107 > 0) {
                        iM11306 = C19806.m45029("᩶֡") ^ i6;
                        i3 = ((iM11306 ^ i5) * (-30543)) ^ (-536802547);
                        i4 = 188428775;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۤ") ^ i5) * (-79);
                        i3 = ((iM11306 ^ i6) * (-18909)) ^ (-2088046969);
                        i4 = 899942348;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -635734953:
                case -603970692:
                    strM10056 = RunnableC3388.m10056(f40134, 313, 14, i9);
                    if (jSONObject.has(strM10056)) {
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i5;
                        i = ((iM45029 ^ i6) * (-251)) ^ (-1743429287);
                        i2 = 1103287749;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i6;
                        i = ((iM45029 ^ i5) * (-19559)) ^ 2025899758;
                        i2 = -1678199955;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -625191355:
                case 2136987756:
                    throw new JSONException(C2788.m8470(f40134, 351, 18, i9));
                case -563140781:
                case -519152432:
                    strM5577 = strM5577;
                    this.f40146 = RunnableC1606.m5479(jSONObject, strM2424);
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩶") ^ i5) * 91;
                        i3 = ((iM11306 ^ i6) * (-6265)) ^ (-1652050297);
                        i4 = -1972000986;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ܶۡ")) * (-103);
                        i3 = ((iM11306 ^ i5) * 26971) ^ 443376861;
                        i4 = 1210438573;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -517409156:
                case -484500078:
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i6;
                        i = ((iM45029 ^ i5) * (-4417)) ^ (-1993342718);
                        i2 = 1843844521;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -134440650:
                case 670015884:
                    strM5577 = strM5577;
                    int i15 = i12 + i13;
                    if (i11 - (i15 + i15) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۧ") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-2917)) ^ (-30715196);
                        i4 = 22153792;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۢ") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-7419)) ^ 1649058050;
                        i4 = -516590872;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case -72638137:
                case 345121531:
                    this.f40158 = jSONObject.getBoolean(strM6918);
                    iM45029 = (C19806.m45029("۟ۜ") + i5) * (-45);
                    i = ((iM45029 ^ i6) * 14263) ^ (-309221820);
                    i2 = -268542056;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -27623526:
                case 804086864:
                    this.f40157 = null;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("֡۫")) * (-29);
                    i = ((iM45029 ^ i6) * (-19783)) ^ 169572152;
                    i2 = -1769543824;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 186590636:
                case 1387491143:
                    strM6918 = C2249.m6918(f40134, HRSS1373Polynomial.M, 7, i9);
                    if (jSONObject.has(strM6918)) {
                        iM45029 = C19806.m45029("֫֡") ^ i6;
                        i = ((iM45029 ^ i5) * (-4897)) ^ 1288509757;
                        i2 = -1547066570;
                    } else {
                        iM45029 = (C19806.m45029("۟ۜ") + i5) * (-45);
                        i = ((iM45029 ^ i6) * 14263) ^ (-309221820);
                        i2 = -268542056;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 236247545:
                case 1902366856:
                    i9 = 31515;
                    iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                    i3 = ((iM11306 ^ i5) * (-18341)) ^ (-76519724);
                    i4 = -1944607218;
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case 839312117:
                case 1404288014:
                    if (!CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        strM5577 = strM5577;
                        iM11306 = (C19806.m45029("᩶᩶") ^ i5) * 91;
                        i3 = ((iM11306 ^ i6) * (-6265)) ^ (-1652050297);
                        i4 = -1972000986;
                        str = strM5577;
                        i8 = iM11306 ^ i4;
                        i7 = i3;
                        strM5577 = str;
                    }
                    break;
                case 929620780:
                case 1427016843:
                    throw new JSONException(C1668.m5577(f40134, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 21, i9));
                case 1197316738:
                case 2093439164:
                    return;
                case 1603172960:
                case 2073548476:
                    strM5577 = strM5577;
                    i11 = i10 * i10;
                    i12 = s * s;
                    i13 = 1885129;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩶") ^ i5) * 91;
                        i3 = ((iM11306 ^ i6) * (-6265)) ^ (-1652050297);
                        i4 = -1972000986;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i6;
                        i3 = ((iM11306 ^ i5) * 14695) ^ 355012228;
                        i4 = 2140007536;
                    }
                    str = strM5577;
                    i8 = iM11306 ^ i4;
                    i7 = i3;
                    strM5577 = str;
                    break;
                case 1650382357:
                case 2066063868:
                    this.f40136 = C2477.m7600(jSONObject, strM5577);
                    sArr = f40134;
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i5;
                        i = ((iM45029 ^ i6) * 3207) ^ (-476729561);
                        i2 = 461779907;
                    } else {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i6;
                        i = ((iM45029 ^ i5) * 4517) ^ 1268445966;
                        i2 = -195805950;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 1667024977:
                case 1826804748:
                    throw new JSONException(ViewGroupOnHierarchyChangeListenerC1916.m6241(f40134, 257, 16, i9));
                default:
                    strM18989 = C7105.m18989(f40134, 327, 17, i9);
                    if (jSONObject.has(strM18989)) {
                        iM45029 = C19806.m45029("ܿ᩺") ^ i6;
                        i = ((iM45029 ^ i5) * 30065) ^ 1902024535;
                        i2 = 1769904300;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i5;
                        i = ((iM45029 ^ i6) * (-16429)) ^ (-1634672145);
                        i2 = 578900492;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
