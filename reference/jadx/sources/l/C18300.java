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
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.utils.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J2SS */
/* JADX INFO: loaded from: classes.dex */
public final class C18300 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C18415 f59665;

    /* JADX INFO: renamed from: ᩷ۛۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f59666;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f59667;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f59668;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f59669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f59670;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Drawable f59671;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f59672;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20889 f59673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f59674;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22941 f59675;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f59678;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f59679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f59680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f59681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f59682;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f59683;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f59684;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f59686;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f59687;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59688;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Object f59689;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f59690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m42658(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final synchronized void m42661() {
        this.f59680 = false;
        this.f59670 = null;
        m42653();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m42669() {
        short s = f59666[861];
        int i = s + 772;
        int i2 = (s * s) + 595984;
        int i3 = (i2 + i2) - (i * i) >= 0 ? 48251 : 61571;
        synchronized (this) {
            if (this.f59667) {
                return this.f59671;
            }
            this.f59667 = true;
            Bitmap bitmapM42646 = m42646(m42645());
            if (bitmapM42646 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapM42646);
                this.f59671 = bitmapDrawable;
                return bitmapDrawable;
            }
            Drawable drawableM49058 = C21576.m49058(C0773.m3169(C0862.m3500(f59666, 862, 3, i3)) ^ 2098828777);
            this.f59671 = drawableM49058;
            return drawableM49058;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public native synchronized boolean m42673();

    /* JADX WARN: Code duplicated, block: B:62:0x0225 A[PHI: r10 r11 r16 r17 r18
      0x0225: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:59:0x020b, B:6:0x0054, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r11v5 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:59:0x020b, B:6:0x0054, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r16v25 int) = (r16v7 int), (r16v12 int), (r16v32 int) binds: [B:59:0x020b, B:6:0x0054, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r17v29 java.io.InputStream) = (r17v7 java.io.InputStream), (r17v12 java.io.InputStream), (r17v33 java.io.InputStream) binds: [B:59:0x020b, B:6:0x0054, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r18v23 l.۟ܺܺ) = (r18v5 l.۟ܺܺ), (r18v10 l.۟ܺܺ), (r18v24 l.۟ܺܺ) binds: [B:59:0x020b, B:6:0x0054, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ae A[PHI: r6 r9 r16 r17 r18
      0x02ae: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:73:0x02ac, B:65:0x025e, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:73:0x02ac, B:65:0x025e, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r16v15 int) = (r16v4 int), (r16v6 int), (r16v18 int) binds: [B:73:0x02ac, B:65:0x025e, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r17v20 java.io.InputStream) = (r17v4 java.io.InputStream), (r17v6 java.io.InputStream), (r17v23 java.io.InputStream) binds: [B:73:0x02ac, B:65:0x025e, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r18v12 l.۟ܺܺ) = (r18v2 l.۟ܺܺ), (r18v4 l.۟ܺܺ), (r18v17 l.۟ܺܺ) binds: [B:73:0x02ac, B:65:0x025e, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0302 A[PHI: r5 r7 r8 r16 r17 r18
      0x0302: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r16v19 int) = (r16v2 int), (r16v3 int), (r16v5 int), (r16v18 int), (r16v20 int) binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r17v24 java.io.InputStream) = 
      (r17v2 java.io.InputStream)
      (r17v3 java.io.InputStream)
      (r17v5 java.io.InputStream)
      (r17v23 java.io.InputStream)
      (r17v25 java.io.InputStream)
     binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0302: PHI (r18v20 l.۟ܺܺ) = (r18v0 l.۟ܺܺ), (r18v1 l.۟ܺܺ), (r18v3 l.۟ܺܺ), (r18v16 l.۟ܺܺ), (r18v21 l.۟ܺܺ) binds: [B:81:0x0300, B:77:0x02e0, B:69:0x0285, B:36:0x0105, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m42636(C18300 c18300, String str) {
        int iM3169;
        int i;
        int i2;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6;
        int i7 = C2834.f9334;
        int i8 = C2375.f7641;
        int iM31611 = (i8 - C0773.m3169("ۢۡ")) * 119;
        int i9 = ((iM31611 ^ i7) * (-25195)) ^ 1151566946;
        short[] sArr = null;
        int i10 = iM31611 ^ (-581543587);
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = -2118228120;
        InputStream inputStreamM7804 = null;
        C8002 c8002M1239 = null;
        InputStream inputStream = null;
        C22941 c22941 = null;
        while (true) {
            int i16 = i10 ^ (i9 & (((i15 ^ i7) * 10939) >> 31));
            switch (i16) {
                case -2128522326:
                case 1657374230:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    c = 'G';
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۡܰ") ^ i8;
                        i = ((iM3169 ^ i7) * 12537) ^ 762693478;
                        i2 = 1627022924;
                    } else {
                        iM3169 = C0619.m2761("֡֨") ^ i8;
                        i = ((iM3169 ^ i7) * 25897) ^ 485199779;
                        i2 = 443523019;
                    }
                    int i17 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i17;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -2073020784:
                case -1169683393:
                    return inputStream;
                case -2061073358:
                case -1108883021:
                    AbstractC0116.m1243();
                    if (C4238.f15451 < 0) {
                        i16 = i16;
                        iM31610 = C0619.m2761("۬ᩴ") ^ i7;
                        i3 = ((iM31610 ^ i8) * 19055) ^ 1705595139;
                        i5 = 2095390128;
                        i4 = iM31610 ^ i5;
                        i6 = i16;
                        i10 = i4;
                        i9 = i3;
                        i15 = i6;
                    } else {
                        inputStream = inputStream;
                        c8002M1239 = c8002M1239;
                        i16 = i16;
                        iM3169 = C0773.m3169("۟ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                        i2 = 1182436966;
                        int i18 = iM3169 ^ i2;
                        i15 = i16;
                        inputStream = inputStream;
                        i10 = i18;
                        i9 = i;
                        c8002M1239 = c8002M1239;
                    }
                    break;
                case -2029534326:
                case -95783851:
                    return inputStream;
                case -1907950677:
                case -1056720681:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("۟ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                        i2 = 1182436966;
                    } else {
                        iM3169 = C0773.m3169("ܳܶ") ^ i8;
                        i = ((iM3169 ^ i7) * 17315) ^ (-563724396);
                        i2 = -773073172;
                    }
                    int i19 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i19;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -1816851359:
                case -1493481421:
                    C3779.m12264();
                    C2023.m6964();
                    return null;
                case -1758090571:
                case 950698339:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    s2 = 8420;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("᩺᩹") ^ i7) * 5;
                        i = ((iM3169 ^ i8) * (-5911)) ^ (-1102209885);
                        i2 = 831598360;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۨ۟")) * (-99);
                        i = ((iM3169 ^ i8) * 16071) ^ (-399566623);
                        i2 = 1753109005;
                    }
                    int i110 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i110;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -1523211018:
                case -776107780:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    sArr = f59666;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("۟ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                        i2 = 1182436966;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩶") ^ i7;
                        i = ((iM3169 ^ i8) * 19263) ^ (-1001307093);
                        i2 = -832037766;
                    }
                    int i111 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i111;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -1267429697:
                case -228328183:
                    i14 = 5469;
                    iM3169 = C0773.m3169("֨۟") ^ i7;
                    i = ((iM3169 ^ i8) * (-21899)) ^ (-1374705041);
                    i2 = 1881620695;
                    int i112 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i112;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -1252694566:
                case 849658359:
                    C1783.m6232();
                    C0619.m2763();
                    iM31610 = (C0619.m2761("ۜ᩸") ^ i8) * (-27);
                    i16 = i16;
                    i3 = ((iM31610 ^ i7) * 24225) ^ 12700027;
                    i5 = 175354986;
                    i4 = iM31610 ^ i5;
                    i6 = i16;
                    i10 = i4;
                    i9 = i3;
                    i15 = i6;
                    break;
                case -1153533117:
                case -543986195:
                    i16 = i16;
                    try {
                        inputStreamM7804 = C2310.m7804(c22941, c8002M1239);
                        iM31610 = (C0619.m2761("ۘ᩸") + i7) * 95;
                        i3 = ((iM31610 ^ i8) * 15901) ^ (-443703296);
                        i5 = -1218909763;
                    } catch (IOException unused) {
                        iM31610 = (i7 - C0773.m3169("ܿ᩺")) * 45;
                        i3 = ((iM31610 ^ i8) * (-495)) ^ 567765639;
                        i5 = 1434508782;
                    }
                    i4 = iM31610 ^ i5;
                    i6 = i16;
                    i10 = i4;
                    i9 = i3;
                    i15 = i6;
                    break;
                case -611572467:
                case 1051358744:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    int i20 = s + s2;
                    if ((i20 * i20) - i13 <= 0) {
                        iM3169 = C0773.m3169("᩶ۨ") ^ i8;
                        i = ((iM3169 ^ i7) * 14581) ^ 748170721;
                        i2 = -2034347454;
                    } else {
                        iM3169 = C0773.m3169("ۘۙ") ^ i8;
                        i = ((iM3169 ^ i7) * (-31165)) ^ (-702383033);
                        i2 = 1735131246;
                    }
                    int i113 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i113;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -605295571:
                case 1943648584:
                    return inputStreamM7804;
                case -566698391:
                case 1064190768:
                    C8002 c8002 = c8002M1239;
                    i16 = i16;
                    c22941 = c18300.f59675;
                    if (c22941 != null) {
                        int iM31612 = (C0773.m3169("ۖ۠") ^ i7) * (-73);
                        i3 = ((iM31612 ^ i8) * (-3697)) ^ 707047965;
                        i4 = iM31612 ^ 1910898707;
                        inputStream = null;
                        c8002M1239 = c8002;
                        i6 = i16;
                        i10 = i4;
                        i9 = i3;
                        i15 = i6;
                    } else {
                        inputStream = null;
                        c8002M1239 = c8002;
                        int iM2761 = C0619.m2761("۠۬") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-28613)) ^ 1078129368;
                        inputStream = inputStream;
                        i6 = i16;
                        i10 = iM2761 ^ (-203846657);
                        i15 = i6;
                    }
                    break;
                case -490625563:
                case 1015890462:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    i12 = 70896400;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۡܰ") ^ i8;
                        i = ((iM3169 ^ i7) * 12537) ^ 762693478;
                        i2 = 1627022924;
                    } else {
                        iM3169 = (C0619.m2761("ۡᩳ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i7) * 5093) ^ 49366175;
                        i2 = 208608175;
                    }
                    int i114 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i114;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -289228119:
                case 330452758:
                    i14 = 59078;
                    iM3169 = C0773.m3169("֨۟") ^ i7;
                    i = ((iM3169 ^ i8) * (-21899)) ^ (-1374705041);
                    i2 = 1881620695;
                    int i115 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i115;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                case -282789980:
                case 866933096:
                    if (C4282.f15546 <= 0) {
                        inputStream = inputStream;
                        c8002M1239 = c8002M1239;
                        i16 = i16;
                        iM3169 = C0773.m3169("۟ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                        i2 = 1182436966;
                        int i116 = iM3169 ^ i2;
                        i15 = i16;
                        inputStream = inputStream;
                        i10 = i116;
                        i9 = i;
                        c8002M1239 = c8002M1239;
                    } else {
                        iM31610 = (C0619.m2761("ۜ᩸") ^ i8) * (-27);
                        i16 = i16;
                        i3 = ((iM31610 ^ i7) * 24225) ^ 12700027;
                        i5 = 175354986;
                        i4 = iM31610 ^ i5;
                        i6 = i16;
                        i10 = i4;
                        i9 = i3;
                        i15 = i6;
                    }
                    break;
                case 337915482:
                case 1329274026:
                    if (C0269.f1558 <= 0) {
                        inputStream = inputStream;
                        c8002M1239 = c8002M1239;
                        i16 = i16;
                        iM3169 = (C0619.m2761("᩺᩹") ^ i7) * 5;
                        i = ((iM3169 ^ i8) * (-5911)) ^ (-1102209885);
                        i2 = 831598360;
                        int i117 = iM3169 ^ i2;
                        i15 = i16;
                        inputStream = inputStream;
                        i10 = i117;
                        i9 = i;
                        c8002M1239 = c8002M1239;
                    } else {
                        iM31610 = (C0619.m2761("ۜ᩸") ^ i8) * (-27);
                        i16 = i16;
                        i3 = ((iM31610 ^ i7) * 24225) ^ 12700027;
                        i5 = 175354986;
                        i4 = iM31610 ^ i5;
                        i6 = i16;
                        i10 = i4;
                        i9 = i3;
                        i15 = i6;
                    }
                    break;
                case 367612293:
                case 626617369:
                    i16 = i16;
                    short[] sArr2 = f59666;
                    if (C2354.f7599 >= 0) {
                        iM31610 = C0619.m2761("۬ᩴ") ^ i7;
                        i3 = ((iM31610 ^ i8) * 19055) ^ 1705595139;
                        i5 = 2095390128;
                        i4 = iM31610 ^ i5;
                    } else {
                        inputStream = inputStream;
                        if (C1826.f6190 <= 0) {
                            c8002M1239 = c8002M1239;
                            iM3169 = C0773.m3169("۟ۧ") ^ i8;
                            i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                            i2 = 1182436966;
                            int i118 = iM3169 ^ i2;
                            i15 = i16;
                            inputStream = inputStream;
                            i10 = i118;
                            i9 = i;
                            c8002M1239 = c8002M1239;
                        } else {
                            c8002M1239 = c8002M1239;
                            String strM13530 = C4238.m13530(sArr2, 72, 7, i14);
                            if (RunnableC0334.m2063()) {
                                iM3169 = C0773.m3169("ۡܰ") ^ i8;
                                i = ((iM3169 ^ i7) * 12537) ^ 762693478;
                                i2 = 1627022924;
                                int i119 = iM3169 ^ i2;
                                i15 = i16;
                                inputStream = inputStream;
                                i10 = i119;
                                i9 = i;
                                c8002M1239 = c8002M1239;
                            } else {
                                StringBuilder sb = new StringBuilder(strM13530);
                                C3779.m12258(sb, str);
                                c8002M1239 = AbstractC0116.m1239(c22941, C2023.m6952(sb));
                                if (c8002M1239 == null) {
                                    int iM2762 = C0619.m2761("۠۬") ^ i8;
                                    i9 = ((iM2762 ^ i7) * (-28613)) ^ 1078129368;
                                    inputStream = inputStream;
                                    i6 = i16;
                                    i10 = iM2762 ^ (-203846657);
                                    i15 = i6;
                                } else {
                                    int iM31613 = C0773.m3169("ۧ۫") ^ i8;
                                    i3 = ((iM31613 ^ i7) * (-15851)) ^ 1890727935;
                                    i4 = iM31613 ^ (-1421007504);
                                    inputStream = inputStream;
                                }
                            }
                        }
                    }
                    i6 = i16;
                    i10 = i4;
                    i9 = i3;
                    i15 = i6;
                    break;
                case 723372424:
                case 1857142677:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    s = sArr[c];
                    i11 = s * s;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("۟ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-24317)) ^ (-887591954);
                        i2 = 1182436966;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ۘ᩷")) * (-105);
                        i = ((iM3169 ^ i8) * 11781) ^ (-662406931);
                        i2 = -1712854782;
                    }
                    int i1110 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i1110;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
                default:
                    inputStream = inputStream;
                    c8002M1239 = c8002M1239;
                    i16 = i16;
                    int i21 = i11 + i12;
                    i13 = i21 + i21;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("᩺᩹") ^ i7) * 5;
                        i = ((iM3169 ^ i8) * (-5911)) ^ (-1102209885);
                        i2 = 831598360;
                    } else {
                        iM3169 = (C0773.m3169("֡ۢ") ^ i7) * (-33);
                        i = ((iM3169 ^ i8) * 29461) ^ (-358563368);
                        i2 = -12818356;
                    }
                    int i1111 = iM3169 ^ i2;
                    i15 = i16;
                    inputStream = inputStream;
                    i10 = i1111;
                    i9 = i;
                    c8002M1239 = c8002M1239;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42644(C22941 c22941) {
        int i;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short[] sArr2;
        int i8;
        int i9;
        int iM3169;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM31610;
        int i14;
        int iM2761;
        int i15;
        int i16;
        AbstractC22044 abstractC22044M52727 = null;
        int i17 = C2310.f7472;
        int i18 = C3734.f12817;
        int iM31611 = (C0773.m3169("ۨۗ") + i17) * (-101);
        int i19 = ((iM31611 ^ i18) * 17403) ^ 560476102;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i20 = iM31611 ^ 1948683641;
        String str = null;
        char c = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -456563490;
        while (true) {
            i28 = i20 ^ (i19 & (((i28 ^ i18) * (-26017)) >> 31));
            switch (i28) {
                case -2049588118:
                case -1077421827:
                    if (!C0619.f2439) {
                        i7 = i25;
                        sArr2 = sArr4;
                        i8 = i26;
                        i9 = i27;
                        iM31610 = (C0773.m3169("ܺ᩷") + i18) * 99;
                        i13 = ((iM31610 ^ i17) * (-23337)) ^ 309020607;
                        i12 = -397651887;
                        i14 = iM31610 ^ i12;
                        i19 = i13;
                        i25 = i7;
                        sArr4 = sArr2;
                        i26 = i8;
                        i27 = i9;
                        i20 = i14;
                    } else {
                        i = i23;
                        i2 = i25;
                        sArr = sArr4;
                        i5 = i26;
                        i6 = i27;
                        int iM31612 = (C0773.m3169("۫ۨ") + i17) * 101;
                        i3 = ((iM31612 ^ i18) * (-27447)) ^ 720916003;
                        i4 = iM31612 ^ 202835385;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i4;
                        i19 = i3;
                    }
                    break;
                case -1947556072:
                case -816860696:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    i26 = 169;
                    i27 = 5;
                    if (!C2878.f9462) {
                        int iM2762 = C0619.m2761("ܺۨ") ^ i17;
                        i3 = ((iM2762 ^ i18) * (-15539)) ^ 1393025265;
                        i4 = iM2762 ^ (-1523200944);
                        i25 = i2;
                        sArr4 = sArr;
                        i23 = i;
                        i24 = i24;
                        i20 = i4;
                        i19 = i3;
                    } else {
                        int iM31613 = C0773.m3169("۬֫") ^ i18;
                        int i29 = ((iM31613 ^ i17) * 17571) ^ 886943179;
                        i14 = iM31613 ^ (-564399390);
                        i19 = i29;
                        i25 = i2;
                        sArr4 = sArr;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    break;
                case -1870490060:
                case -509443956:
                    i25 = 53851;
                    int iM31614 = C0773.m3169("ۖ᩵") ^ i17;
                    i20 = iM31614 ^ (-1891145670);
                    i19 = ((iM31614 ^ i18) * (-27409)) ^ (-155803782);
                    sArr4 = sArr4;
                    i26 = i26;
                    i27 = i27;
                    i23 = i23;
                    i24 = i24;
                    break;
                case -1578307338:
                case 266907598:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    i5 = i26;
                    i6 = i27;
                    int i30 = i + i24;
                    if ((i30 + i30) - i22 >= 0) {
                        iM3169 = (C0619.m2761("۫᩶") ^ i17) * (-121);
                        i10 = ((iM3169 ^ i18) * 25187) ^ (-991612563);
                        i11 = 1365614314;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i18;
                        i10 = ((iM3169 ^ i17) * (-5993)) ^ 958846207;
                        i11 = -687937259;
                    }
                    i14 = iM3169 ^ i11;
                    i19 = i10;
                    i25 = i2;
                    sArr4 = sArr;
                    i26 = i5;
                    i27 = i6;
                    i23 = i;
                    i24 = i24;
                    i20 = i14;
                    break;
                case -1308362414:
                case 1263263844:
                    AbstractC3624.m11755();
                    C13473.m33144();
                    break;
                case -1177279959:
                case -941080890:
                    if (C11235.f35427 < 0) {
                        i = i23;
                        i2 = i25;
                        sArr = sArr4;
                        i5 = i26;
                        i6 = i27;
                        int iM31615 = (C0773.m3169("۫ۨ") + i17) * 101;
                        i3 = ((iM31615 ^ i18) * (-27447)) ^ 720916003;
                        i4 = iM31615 ^ 202835385;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i4;
                    } else {
                        int iM2763 = C0619.m2761("ۛ᩷") ^ i18;
                        i3 = ((iM2763 ^ i17) * (-22553)) ^ (-2000013613);
                        i20 = iM2763 ^ 718796984;
                    }
                    i19 = i3;
                    break;
                case -801500621:
                case 573303036:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    i5 = i26;
                    i6 = i27;
                    c = 168;
                    if (!C2966.m9664()) {
                        i26 = i5;
                        i27 = i6;
                        int iM31616 = C0773.m3169("۬֫") ^ i18;
                        int i210 = ((iM31616 ^ i17) * 17571) ^ 886943179;
                        i14 = iM31616 ^ (-564399390);
                        i19 = i210;
                        i25 = i2;
                        sArr4 = sArr;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    } else {
                        iM3169 = (i17 - C0773.m3169("۫ۙ")) * (-15);
                        i10 = ((iM3169 ^ i18) * (-11731)) ^ (-2029094264);
                        i11 = 1267854200;
                        i14 = iM3169 ^ i11;
                        i19 = i10;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    break;
                case -661136127:
                case 1303158707:
                    AbstractC0116.m1243();
                    if (C0487.m2356() >= 0) {
                        i = i23;
                        i2 = i25;
                        sArr = sArr4;
                        i5 = i26;
                        i6 = i27;
                        int iM31617 = (C0773.m3169("۫ۨ") + i17) * 101;
                        i3 = ((iM31617 ^ i18) * (-27447)) ^ 720916003;
                        i4 = iM31617 ^ 202835385;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i4;
                        i19 = i3;
                    } else {
                        i = i23;
                        i24 = i24;
                        i2 = i25;
                        sArr = sArr4;
                        int iM31618 = C0773.m3169("۬֫") ^ i18;
                        int i211 = ((iM31618 ^ i17) * 17571) ^ 886943179;
                        i14 = iM31618 ^ (-564399390);
                        i19 = i211;
                        i25 = i2;
                        sArr4 = sArr;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    break;
                case -307146473:
                case 1500876092:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    i5 = i26;
                    i6 = i27;
                    this.f59689 = c22941;
                    str = this.f59672;
                    abstractC22044M52727 = C23522.m52727(str);
                    sArr4 = f59666;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ܺܿ") ^ i17) * (-115);
                        i15 = ((iM2761 ^ i18) * (-19631)) ^ 396410762;
                        i16 = 2127285573;
                    } else {
                        iM2761 = (i18 - C0619.m2761("ܰ۠")) * (-105);
                        i15 = ((iM2761 ^ i17) * 27201) ^ (-1773562010);
                        i16 = 1469303895;
                    }
                    i14 = iM2761 ^ i16;
                    i19 = i15;
                    i25 = i2;
                    i26 = i5;
                    i27 = i6;
                    i23 = i;
                    i24 = i24;
                    i20 = i14;
                    break;
                case 164419297:
                case 705897340:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    i5 = i26;
                    i6 = i27;
                    sArr3 = f59666;
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = (i18 - C0773.m3169("ۚ᩷")) * 41;
                        i10 = ((iM3169 ^ i17) * 6583) ^ 226588412;
                        i11 = 263243791;
                        i14 = iM3169 ^ i11;
                        i19 = i10;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    sArr4 = sArr;
                    iM2761 = (C0619.m2761("ܺܿ") ^ i17) * (-115);
                    i15 = ((iM2761 ^ i18) * (-19631)) ^ 396410762;
                    i16 = 2127285573;
                    i14 = iM2761 ^ i16;
                    i19 = i15;
                    i25 = i2;
                    i26 = i5;
                    i27 = i6;
                    i23 = i;
                    i24 = i24;
                    i20 = i14;
                    break;
                case 175302176:
                case 1095582822:
                    i7 = i25;
                    sArr2 = sArr4;
                    i8 = i26;
                    i9 = i27;
                    i22 = i21 * i21;
                    i23 = s * s;
                    i24 = 15968016;
                    if (C3690.f12684 <= 0) {
                        iM31610 = (C0773.m3169("ܺ᩷") + i18) * 99;
                        i13 = ((iM31610 ^ i17) * (-23337)) ^ 309020607;
                        i12 = -397651887;
                    } else {
                        iM31610 = C0619.m2761("ܽ᩶") ^ i18;
                        i13 = ((iM31610 ^ i17) * (-1825)) ^ (-958458465);
                        i12 = 888980630;
                    }
                    i14 = iM31610 ^ i12;
                    i19 = i13;
                    i25 = i7;
                    sArr4 = sArr2;
                    i26 = i8;
                    i27 = i9;
                    i20 = i14;
                    break;
                case 534011039:
                case 1139722606:
                    i25 = 59078;
                    int iM31619 = C0773.m3169("ۖ᩵") ^ i17;
                    i20 = iM31619 ^ (-1891145670);
                    i19 = ((iM31619 ^ i18) * (-27409)) ^ (-155803782);
                    sArr4 = sArr4;
                    i26 = i26;
                    i27 = i27;
                    i23 = i23;
                    i24 = i24;
                    break;
                case 787149856:
                case 1929847271:
                    AbstractC22044 abstractC22044M7806 = C2310.m7806(abstractC22044M52727, RunnableC1848.m6366(sArr4, i26, i27, i25));
                    if (C1146.f4234 < 0) {
                        i2 = i25;
                        String str2 = this.f59684;
                        sArr = sArr4;
                        int i31 = this.f59669;
                        if (C2419.f7754 < 0) {
                            i5 = i26;
                            int i32 = this.f59685;
                            i6 = i27;
                            String str3 = this.f59682;
                            i = i23;
                            if (!C3690.m11987()) {
                                C11021 c11021 = new C11021(str);
                                if (C3492.f12043 > 0) {
                                    this.f59673 = new C20889(str, str2, i31, i32, str3, abstractC22044M7806, c11021, new C4130(this), new C4130(this));
                                }
                                int iM316110 = (C0773.m3169("۫ۨ") + i17) * 101;
                                i3 = ((iM316110 ^ i18) * (-27447)) ^ 720916003;
                                i4 = iM316110 ^ 202835385;
                                i25 = i2;
                                sArr4 = sArr;
                                i26 = i5;
                                i27 = i6;
                                i23 = i;
                                i24 = i24;
                                i20 = i4;
                                i19 = i3;
                            } else {
                                i24 = i24;
                            }
                        } else {
                            i = i23;
                            i24 = i24;
                            i5 = i26;
                            i6 = i27;
                        }
                        sArr4 = sArr;
                        iM2761 = (C0619.m2761("ܺܿ") ^ i17) * (-115);
                        i15 = ((iM2761 ^ i18) * (-19631)) ^ 396410762;
                        i16 = 2127285573;
                        i14 = iM2761 ^ i16;
                        i19 = i15;
                        i25 = i2;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    } else {
                        i = i23;
                        i24 = i24;
                        i2 = i25;
                        sArr = sArr4;
                        int iM316111 = C0773.m3169("۬֫") ^ i18;
                        int i212 = ((iM316111 ^ i17) * 17571) ^ 886943179;
                        i14 = iM316111 ^ (-564399390);
                        i19 = i212;
                        i25 = i2;
                        sArr4 = sArr;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    break;
                case 948938275:
                case 1801145873:
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    i5 = i26;
                    i6 = i27;
                    s = sArr3[c];
                    i21 = s + 3996;
                    if (C0773.f2792 > 0) {
                        iM3169 = C0619.m2761("᩶᩷") ^ i17;
                        i10 = ((iM3169 ^ i18) * 19813) ^ (-668241085);
                        i11 = -599546952;
                        i14 = iM3169 ^ i11;
                        i19 = i10;
                        i25 = i2;
                        sArr4 = sArr;
                        i26 = i5;
                        i27 = i6;
                        i23 = i;
                        i24 = i24;
                        i20 = i14;
                    }
                    sArr4 = sArr;
                    iM2761 = (C0619.m2761("ܺܿ") ^ i17) * (-115);
                    i15 = ((iM2761 ^ i18) * (-19631)) ^ 396410762;
                    i16 = 2127285573;
                    i14 = iM2761 ^ i16;
                    i19 = i15;
                    i25 = i2;
                    i26 = i5;
                    i27 = i6;
                    i23 = i;
                    i24 = i24;
                    i20 = i14;
                    break;
                default:
                    C2419.m8174();
                    i = i23;
                    i24 = i24;
                    i2 = i25;
                    sArr = sArr4;
                    int iM316112 = C0773.m3169("۬֫") ^ i18;
                    int i213 = ((iM316112 ^ i17) * 17571) ^ 886943179;
                    i14 = iM316112 ^ (-564399390);
                    i19 = i213;
                    i25 = i2;
                    sArr4 = sArr;
                    i23 = i;
                    i24 = i24;
                    i20 = i14;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[PHI: r3 r4 r6 r11 r26
      0x01a1: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]) binds: [B:47:0x019f, B:30:0x00ec, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:47:0x019f, B:30:0x00ec, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:47:0x019f, B:30:0x00ec, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x019f, B:30:0x00ec, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r26v29 short[]) = (r26v24 short[]), (r26v3 short[]), (r26v3 short[]) binds: [B:47:0x019f, B:30:0x00ec, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b8 A[PHI: r19 r21 r25
      0x02b8: PHI (r19v6 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:70:0x02b6, B:6:0x006c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r21v6 short) = (r21v2 short), (r21v3 short), (r21v2 short) binds: [B:70:0x02b6, B:6:0x006c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r25v41 short[]) = (r25v6 short[]), (r25v32 short[]), (r25v42 short[]) binds: [B:70:0x02b6, B:6:0x006c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0310 A[PHI: r17 r18 r20 r25
      0x0310: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:78:0x030e, B:74:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r18v3 short) = (r18v2 short), (r18v4 short) binds: [B:78:0x030e, B:74:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r20v3 short) = (r20v2 short), (r20v4 short) binds: [B:78:0x030e, B:74:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r25v4 short[]) = (r25v3 short[]), (r25v5 short[]) binds: [B:78:0x030e, B:74:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        if (l.RunnableC3055.f9898 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        if (l.C2310.f7472 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m42663() {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18300.m42663():java.lang.String");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m42670() {
        int i = 0;
        int i2 = 0;
        int i3 = 644152294;
        int i4 = C4238.f15451;
        int i5 = AbstractC0641.f2496;
        int iM2761 = (i4 - C0619.m2761("ۗᩴ")) * 51;
        int i6 = ((iM2761 ^ i5) * 26817) ^ 162146174;
        int i7 = 297242509;
        while (true) {
            i3 = ((((i3 ^ i5) * (-19371)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2039378278:
                case 1025473624:
                    C2834.m9344();
                    C3033.m9845();
                    return null;
                case -2001171155:
                case 1387856619:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0773.m3169("ܶ᩷") ^ i5) * 119;
                        i6 = ((iM2761 ^ i4) * 21479) ^ 1723724870;
                        i7 = 256280431;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܳۗ")) * 123;
                        i6 = ((iM2761 ^ i5) * 26297) ^ (-512463568);
                        i7 = 1918686179;
                    }
                    break;
                case -1864229880:
                case 451684832:
                    i2 = this.f59668;
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i5;
                        i6 = ((iM2761 ^ i4) * 6927) ^ (-284201155);
                        i7 = 1734363971;
                    } else {
                        iM2761 = C0773.m3169("۟֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * 18427) ^ (-1029157594);
                        i7 = -1610200565;
                    }
                    break;
                case -1851182273:
                case -1041794293:
                    C2834.m9344();
                    if (C0487.f2131 > 0) {
                        iM2761 = C0773.m3169("ܺܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-25079)) ^ 1379332604;
                        i7 = 78952797;
                    } else {
                        iM2761 = (C0773.m3169("ܶ᩷") ^ i5) * 119;
                        i6 = ((iM2761 ^ i4) * 21479) ^ 1723724870;
                        i7 = 256280431;
                    }
                    break;
                case -1662258261:
                case -1308400824:
                    C2023.m6964();
                    C3492.m11488();
                    iM2761 = (C0773.m3169("ܶ᩷") ^ i5) * 119;
                    i6 = ((iM2761 ^ i4) * 21479) ^ 1723724870;
                    i7 = 256280431;
                    break;
                case -1381136669:
                case 230841120:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ܺܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-25079)) ^ 1379332604;
                        i7 = 78952797;
                    } else {
                        iM2761 = C0773.m3169("ᩳۨ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-29457)) ^ (-400686709);
                        i7 = -1908629176;
                    }
                    break;
                case -1171596355:
                case 622981734:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-10237)) ^ 52334154;
                        i7 = 2001771731;
                    } else {
                        iM2761 = C0773.m3169("ܺܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-25079)) ^ 1379332604;
                        i7 = 78952797;
                    }
                    break;
                case -1040972257:
                case -19528011:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("᩶ܳ") + i5) * 47;
                        i6 = ((iM2761 ^ i4) * 11553) ^ 309237395;
                        i7 = 1492091143;
                    } else {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i5) * 45;
                        i6 = ((iM2761 ^ i4) * 22555) ^ 1845694458;
                        i7 = 2106714015;
                    }
                    break;
                case -1004729098:
                case 82447983:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("ܺۧ") ^ i5) * (-17);
                        i6 = ((iM2761 ^ i4) * 26573) ^ 750087152;
                        i7 = 691423251;
                    } else {
                        iM2761 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-10237)) ^ 52334154;
                        i7 = 2001771731;
                    }
                    break;
                case -978740066:
                case 428635991:
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-10237)) ^ 52334154;
                        i7 = 2001771731;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15253) ^ (-245065575);
                        i7 = 2000929098;
                    }
                    break;
                case -437358791:
                case -306892371:
                    C23916.m53419();
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-10237)) ^ 52334154;
                        i7 = 2001771731;
                    } else {
                        iM2761 = (C0773.m3169("᩶ܳ") + i5) * 47;
                        i6 = ((iM2761 ^ i4) * 11553) ^ 309237395;
                        i7 = 1492091143;
                    }
                    break;
                case -286977310:
                case -243304726:
                    if (C0619.m2763()) {
                        iM2761 = (C0773.m3169("᩶ܳ") + i5) * 47;
                        i6 = ((iM2761 ^ i4) * 11553) ^ 309237395;
                        i7 = 1492091143;
                    } else {
                        iM2761 = (C0773.m3169("ۛۙ") + i4) * (-89);
                        i6 = ((iM2761 ^ i5) * (-7061)) ^ (-2078134724);
                        i7 = 1685700534;
                    }
                    break;
                case 380743051:
                case 1448751979:
                    return m42639(i, i2, this.f59688);
                case 495371943:
                case 1756153466:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩸") ^ i5;
                        i6 = ((iM2761 ^ i4) * 6927) ^ (-284201155);
                        i7 = 1734363971;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31999)) ^ (-447152888);
                        i7 = 1333588598;
                    }
                    break;
                case 2011571145:
                case 2037216897:
                    i = this.f59669;
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ᩳۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-14345)) ^ 1385874228;
                        i7 = -663769636;
                    } else {
                        iM2761 = C0773.m3169("ܺܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-25079)) ^ 1379332604;
                        i7 = 78952797;
                    }
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-10237)) ^ 52334154;
                        i7 = 2001771731;
                    } else {
                        iM2761 = C0773.m3169("᩻ۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-20577)) ^ 10037306;
                        i7 = 454656118;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.᩵᩺֫, l.᩸ܽܺ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42653() {
        Object obj = null;
        ?? r1 = 0;
        int i = 468734582;
        int i2 = C1542.f5343;
        int i3 = C1826.f6190;
        int iM2761 = (C0619.m2761("ۧܺ") ^ i2) * (-49);
        int i4 = ((iM2761 ^ i3) * (-28217)) ^ 1384873741;
        int i5 = -943944167;
        while (true) {
            i = ((((i ^ i3) * 5845) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2103075487:
                case 426364011:
                    C0950.m3785();
                    if (!C2702.m8876()) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6489)) ^ 194942094;
                        i5 = -988157231;
                    } else {
                        iM2761 = C0773.m3169("ܽܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19973) ^ 95225684;
                        i5 = 135160251;
                    }
                    break;
                case -1938242497:
                case -1042655634:
                    C4238.m13540();
                    iM2761 = C0773.m3169("ܳۙ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 6229) ^ (-1223030689);
                    i5 = 1052738950;
                    break;
                case -1817826007:
                case 1515868263:
                    AbstractC3624.m11755();
                    C1783.m6232();
                    break;
                case -1764483491:
                case -1416938082:
                    this.f59675 = r1;
                    this.f59673 = r1;
                    break;
                case -1664898351:
                case -518318789:
                    this.f59689 = this.f59686;
                    iM2761 = (C0773.m3169("ۘۖ") + i2) * (-77);
                    i4 = ((iM2761 ^ i3) * 19975) ^ 490229698;
                    i5 = -717864903;
                    break;
                case -1552550302:
                case 244149664:
                    r1 = 0;
                    r1 = 0;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۧۧ") + i3) * (-101);
                        i4 = ((iM2761 ^ i2) * (-20533)) ^ 1495210801;
                        i5 = 676506902;
                    } else {
                        iM2761 = (C0773.m3169("۠ۢ") ^ i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 19741) ^ 1478432990;
                        i5 = 679701435;
                    }
                    break;
                case -1491934805:
                case 142376233:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ܿ")) * (-95);
                        i4 = ((iM2761 ^ i3) * (-22341)) ^ 1481711135;
                        i5 = 611865875;
                    }
                    break;
                case -1465742787:
                case -20097236:
                    if (obj instanceof C22941) {
                        iM2761 = C0773.m3169("᩵ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32095)) ^ 1428073443;
                        i5 = -14230947;
                    } else {
                        iM2761 = (C0773.m3169("ۘۖ") + i2) * (-77);
                        i4 = ((iM2761 ^ i3) * 19975) ^ 490229698;
                        i5 = -717864903;
                    }
                    break;
                case -1237048963:
                case 784980409:
                    C2419.m8171((Closeable) obj);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24957) ^ 821655958;
                        i5 = -131709999;
                    }
                    break;
                case -1004988221:
                case 727987531:
                    if (C3779.m12264()) {
                        iM2761 = (i3 - C0773.m3169("֫۟")) * (-101);
                        i4 = ((iM2761 ^ i2) * (-11875)) ^ 232696570;
                        i5 = 1077330374;
                    } else {
                        iM2761 = C0773.m3169("ܽܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19973) ^ 95225684;
                        i5 = 135160251;
                    }
                    break;
                case -552585536:
                case 1739418488:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = C0773.m3169("ܶۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18027) ^ (-359819006);
                        i5 = -1767603647;
                    }
                    break;
                case -540695537:
                case 292126382:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9511) ^ 1376425914;
                        i5 = -867745076;
                    }
                    break;
                case -515861687:
                case -510334703:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟ᩴ")) * (-117);
                        i4 = ((iM2761 ^ i2) * (-25785)) ^ (-167454018);
                        i5 = -2080252770;
                    }
                    break;
                case 514833215:
                case 869655304:
                    obj = this.f59689;
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6489)) ^ 194942094;
                        i5 = -988157231;
                    } else {
                        iM2761 = C0773.m3169("᩺ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26775)) ^ 386194123;
                        i5 = -1921260305;
                    }
                    break;
                case 572067321:
                case 1893865088:
                    C0950.m3785();
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ܳۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6229) ^ (-1223030689);
                        i5 = 1052738950;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6489)) ^ 194942094;
                        i5 = -988157231;
                    }
                    break;
                case 945886311:
                case 975335338:
                    C3492.m11480(this.f59675);
                    if (C1783.m6232()) {
                        iM2761 = (i3 - C0619.m2761("ܳܰ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-21607)) ^ 1495845132;
                        i5 = -1361899600;
                    } else {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    }
                    break;
                case 1217114815:
                case 1827386876:
                    if (!C1080.m4050()) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30905)) ^ 540373307;
                        i5 = 964750793;
                    } else {
                        iM2761 = C0773.m3169("ܳۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6229) ^ (-1223030689);
                        i5 = 1052738950;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ܽܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19973) ^ 95225684;
                        i5 = 135160251;
                    } else {
                        iM2761 = C0773.m3169("ᩴۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5495)) ^ 487467292;
                        i5 = -1007359831;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        if (l.C3779.f12953 <= 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18300 m42641(org.json.JSONObject r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18300.m42641(org.json.JSONObject):l.ܿۨ֫");
    }

    /* JADX WARN: Code duplicated, block: B:142:0x07ec A[PHI: r2 r3 r5 r6 r20 r21 r22 r23 r25 r26 r27 r28 r29 r31 r32 r36 r38
      0x07ec: PHI (r2v66 short[]) = (r2v9 short[]), (r2v12 short[]), (r2v13 short[]), (r2v74 short[]) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r3v46 int) = (r3v5 int), (r3v8 int), (r3v9 int), (r3v54 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r5v51 int) = (r5v6 int), (r5v9 int), (r5v10 int), (r5v56 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r6v85 short[]) = (r6v52 short[]), (r6v54 short[]), (r6v55 short[]), (r6v92 short[]) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r20v6 int) = (r20v1 int), (r20v2 int), (r20v1 int), (r20v1 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r21v6 int) = (r21v1 int), (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r22v6 int) = (r22v1 int), (r22v1 int), (r22v2 int), (r22v1 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r23v10 short) = (r23v3 short), (r23v2 short), (r23v2 short), (r23v2 short) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r25v43 l.۟ܺܺ) = (r25v7 l.۟ܺܺ), (r25v10 l.۟ܺܺ), (r25v11 l.۟ܺܺ), (r25v51 l.۟ܺܺ) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r26v44 byte[]) = (r26v7 byte[]), (r26v10 byte[]), (r26v11 byte[]), (r26v52 byte[]) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r27v42 short[]) = (r27v6 short[]), (r27v9 short[]), (r27v10 short[]), (r27v50 short[]) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r28v43 android.graphics.BitmapFactory$Options) = 
      (r28v7 android.graphics.BitmapFactory$Options)
      (r28v10 android.graphics.BitmapFactory$Options)
      (r28v11 android.graphics.BitmapFactory$Options)
      (r28v50 android.graphics.BitmapFactory$Options)
     binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r29v47 boolean) = (r29v7 boolean), (r29v10 boolean), (r29v11 boolean), (r29v55 boolean) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r31v47 int) = (r31v7 int), (r31v10 int), (r31v11 int), (r31v55 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r32v69 int) = (r32v34 int), (r32v36 int), (r32v37 int), (r32v73 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r36v42 int) = (r36v8 int), (r36v11 int), (r36v12 int), (r36v50 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x07ec: PHI (r38v26 int) = (r38v5 int), (r38v7 int), (r38v8 int), (r38v30 int) binds: [B:141:0x07ea, B:133:0x0750, B:129:0x0715, B:25:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0171  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x023e A[PHI: r10
      0x023e: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:58:0x0226, B:51:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02d1 A[PHI: r2 r4 r5 r13
      0x02d1: PHI (r2v75 android.graphics.BitmapFactory$Options) = 
      (r2v4 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
     binds: [B:74:0x02d0, B:66:0x0288, B:63:0x026e, B:156:0x02d1] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r4v95 boolean) = (r4v2 boolean), (r4v1 boolean), (r4v1 boolean), (r4v1 boolean) binds: [B:74:0x02d0, B:66:0x0288, B:63:0x026e, B:156:0x02d1] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r5v57 byte[]) = (r5v3 byte[]), (r5v1 byte[]), (r5v1 byte[]), (r5v1 byte[]) binds: [B:74:0x02d0, B:66:0x0288, B:63:0x026e, B:156:0x02d1] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v5 int) binds: [B:74:0x02d0, B:66:0x0288, B:63:0x026e, B:156:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m42646(C22941 c22941) {
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
        C8002 c8002;
        boolean z;
        int iM3169;
        int i6;
        int i7;
        short[] sArr4;
        int i8;
        BitmapFactory.Options options2;
        short[] sArr5;
        int i9;
        C8002 c8003;
        boolean z2;
        int i10;
        byte[] bArr2;
        int i11;
        int iM2761;
        int i12;
        int i13;
        int i14;
        int i15;
        short[] sArr6;
        int i16;
        BitmapFactory.Options options3;
        byte[] bArr3;
        short[] sArr7;
        int i17;
        short[] sArr8;
        int i18;
        C8002 c8004;
        boolean z3;
        int i19;
        int iM31610;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr4;
        short[] sArr9;
        int i25;
        C8002 c8005;
        boolean z4;
        int i26;
        int iM2762;
        int i27;
        int i28;
        int i29;
        short[] sArr10;
        int i30;
        BitmapFactory.Options options4;
        int i31;
        C8002 c8006;
        boolean z5;
        int i32;
        int i33;
        byte[] bArr5;
        short[] sArr11;
        C8002 c8002M1239;
        int iM31611;
        int i34;
        int i35;
        C22941 c22942 = c22941;
        C8002 c8007 = null;
        boolean z6 = false;
        byte[] bArrM46522 = null;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        Bitmap bitmapDecodeByteArray = null;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        short[] sArr12 = null;
        char c = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 551142570;
        int i49 = C11235.f35427;
        int i50 = C3734.f12817;
        int iM2763 = C0619.m2761("ۙ᩵") ^ i50;
        int i51 = ((iM2763 ^ i49) * (-23569)) ^ 539044528;
        int i52 = iM2763 ^ (-564852451);
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short s = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        Bitmap bitmap = null;
        int i58 = 0;
        int i59 = 0;
        C8002 c8002M12310 = null;
        BitmapFactory.Options options5 = null;
        while (true) {
            i48 = i52 ^ (i51 & (((i48 ^ i49) * 923) >> 31));
            switch (i48) {
                case -2139938468:
                case 625004297:
                    C23916.m53419();
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܽܽ") + i50) * (-35);
                        i6 = ((iM3169 ^ i49) * (-10379)) ^ (-1103992834);
                        i7 = 248837827;
                        i52 = iM3169 ^ i7;
                        i51 = i6;
                    } else {
                        i22 = i53;
                        i23 = i54;
                        sArr4 = sArr15;
                        i24 = i57;
                        options2 = options5;
                        bArr4 = bArrM46522;
                        sArr9 = sArr14;
                        i25 = i55;
                        c8005 = c8007;
                        z4 = z6 ? 1 : 0;
                        i26 = i59;
                        iM2762 = (i50 - C0773.m3169("ᩳ᩺")) * 123;
                        i27 = ((iM2762 ^ i49) * (-28803)) ^ 1643947736;
                        i28 = -1910577810;
                        int i60 = iM2762 ^ i28;
                        i59 = i26;
                        c8007 = c8005;
                        bArrM46522 = bArr4;
                        sArr14 = sArr9;
                        z6 = z4;
                        i55 = i25;
                        i54 = i23;
                        i53 = i22;
                        i57 = i24;
                        i52 = i60;
                        i51 = i27;
                        options5 = options2;
                        sArr15 = sArr4;
                    }
                    break;
                case -2136392693:
                case 538156288:
                    i14 = i53;
                    i15 = i54;
                    sArr6 = sArr15;
                    int i61 = i57;
                    options3 = options5;
                    bArr3 = bArrM46522;
                    sArr7 = sArr14;
                    i17 = i55;
                    sArr8 = sArr13;
                    i18 = i58;
                    c8004 = c8007;
                    z3 = z6 ? 1 : 0;
                    i19 = i59;
                    C8002 c8002M11760 = AbstractC3624.m11760(c22942, C2702.m8881(sArr8, i18, i19, i61));
                    if (c8002M11760 == null) {
                        int iM31612 = C0773.m3169("۟۠") ^ i50;
                        i16 = i61;
                        i51 = ((iM31612 ^ i49) * 29381) ^ 777497755;
                        sArr13 = sArr8;
                        i59 = i19;
                        i58 = i18;
                        c8007 = c8004;
                        bArrM46522 = bArr3;
                        sArr14 = sArr7;
                        options5 = options3;
                        i54 = i15;
                        i53 = i14;
                        i52 = iM31612 ^ 753775098;
                    } else {
                        i16 = i61;
                        c8002M12310 = c8002M11760;
                        iM31610 = C0773.m3169("֨ۗ") ^ i50;
                        i20 = ((iM31610 ^ i49) * 15549) ^ (-1309418772);
                        i21 = 843448339;
                        int i62 = iM31610 ^ i21;
                        sArr13 = sArr8;
                        i59 = i19;
                        i58 = i18;
                        c8007 = c8004;
                        bArrM46522 = bArr3;
                        sArr14 = sArr7;
                        options5 = options3;
                        i54 = i15;
                        i53 = i14;
                        i52 = i62;
                        i51 = i20;
                    }
                    sArr15 = sArr6;
                    z6 = z3;
                    i55 = i17;
                    i57 = i16;
                    break;
                case -2080375602:
                case 1383648077:
                    return bitmap;
                case -2068624438:
                case -1748992024:
                    options5.inSampleSize = i36;
                    options5.inPreferredConfig = Bitmap.Config.RGB_565;
                    i40 = i37;
                    i42 = i38;
                    iM3169 = C0619.m2761("֫᩵") ^ i50;
                    i6 = ((iM3169 ^ i49) * 9523) ^ 810863590;
                    i7 = 782427561;
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -2065732129:
                case 1141871366:
                    sArr6 = sArr15;
                    int i63 = i57;
                    options3 = options5;
                    short[] sArr16 = sArr14;
                    i17 = i55;
                    c8004 = c8007;
                    z3 = z6 ? 1 : 0;
                    int i64 = i53;
                    int i65 = i54;
                    bArr3 = bArrM46522;
                    i16 = i63;
                    sArr7 = sArr16;
                    i15 = i65;
                    i14 = i64;
                    c8002M12310 = AbstractC0116.m1239(c22942, C3033.m9847(sArr16, i64, i65, i63));
                    sArr8 = sArr13;
                    i18 = i58;
                    i19 = i59;
                    iM31610 = C0773.m3169("֨ۗ") ^ i50;
                    i20 = ((iM31610 ^ i49) * 15549) ^ (-1309418772);
                    i21 = 843448339;
                    int i66 = iM31610 ^ i21;
                    sArr13 = sArr8;
                    i59 = i19;
                    i58 = i18;
                    c8007 = c8004;
                    bArrM46522 = bArr3;
                    sArr14 = sArr7;
                    options5 = options3;
                    i54 = i15;
                    i53 = i14;
                    i52 = i66;
                    i51 = i20;
                    sArr15 = sArr6;
                    z6 = z3;
                    i55 = i17;
                    i57 = i16;
                    break;
                case -1874794730:
                case -402285795:
                    if (C23916.f77426 <= 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr15;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM46522;
                        sArr2 = sArr14;
                        i4 = i55;
                        sArr3 = sArr13;
                        i5 = i58;
                        c8002 = c8007;
                        z = z6 ? 1 : 0;
                        i11 = i59;
                        iM2761 = (C0773.m3169("᩺᩷") ^ i49) * 75;
                        i51 = ((iM2761 ^ i50) * (-15531)) ^ 432847907;
                        i12 = 1855844933;
                        i29 = iM2761 ^ i12;
                        sArr13 = sArr3;
                        i59 = i11;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    } else {
                        i22 = i53;
                        i23 = i54;
                        sArr4 = sArr15;
                        i24 = i57;
                        options2 = options5;
                        bArr4 = bArrM46522;
                        sArr9 = sArr14;
                        i25 = i55;
                        c8005 = c8007;
                        z4 = z6 ? 1 : 0;
                        i26 = i59;
                        iM2762 = (i50 - C0773.m3169("ᩳ᩺")) * 123;
                        i27 = ((iM2762 ^ i49) * (-28803)) ^ 1643947736;
                        i28 = -1910577810;
                        int i67 = iM2762 ^ i28;
                        i59 = i26;
                        c8007 = c8005;
                        bArrM46522 = bArr4;
                        sArr14 = sArr9;
                        z6 = z4;
                        i55 = i25;
                        i54 = i23;
                        i53 = i22;
                        i57 = i24;
                        i52 = i67;
                        i51 = i27;
                        options5 = options2;
                        sArr15 = sArr4;
                    }
                    break;
                case -1745315103:
                case -381297352:
                    if (i38 > i39) {
                        iM3169 = (i49 - C0619.m2761("᩸ᩴ")) * 25;
                        i6 = ((iM3169 ^ i50) * 3675) ^ (-203736167);
                        i7 = -1073466512;
                    } else {
                        iM3169 = C0773.m3169("֫ۢ") ^ i49;
                        i6 = ((iM3169 ^ i50) * 31071) ^ (-1644753756);
                        i7 = -1606670411;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -1645371430:
                case 1498952709:
                    sArr4 = sArr15;
                    int i68 = i57;
                    options2 = options5;
                    int i69 = i55;
                    int i70 = i56;
                    Object[] objArr = z6 ? 1 : 0;
                    if (c8007 == null) {
                        int iM2764 = C0619.m2761("ᩳۡ") ^ i49;
                        i56 = i70;
                        i27 = ((iM2764 ^ i50) * (-6469)) ^ (-1270341575);
                        i52 = iM2764 ^ 1989378670;
                        z6 = objArr == true ? 1 : 0;
                        i55 = i69;
                        i57 = i68;
                        i51 = i27;
                        options5 = options2;
                        sArr15 = sArr4;
                    } else {
                        i56 = i70;
                        int iM2765 = (i49 - C0619.m2761("ۘ֫")) * (-5);
                        int i71 = ((iM2765 ^ i50) * 4913) ^ 1490843332;
                        i52 = iM2765 ^ 483279204;
                        options5 = options2;
                        sArr15 = sArr4;
                        i57 = i68;
                        i51 = i71;
                        z6 = objArr == true ? 1 : 0;
                        i55 = i69;
                    }
                    break;
                case -1639999390:
                case -954753290:
                    i14 = i53;
                    i15 = i54;
                    sArr6 = sArr15;
                    i16 = i57;
                    options3 = options5;
                    bArr3 = bArrM46522;
                    sArr7 = sArr14;
                    i17 = i55;
                    sArr8 = sArr13;
                    i18 = i58;
                    c8004 = c8007;
                    z3 = z6 ? 1 : 0;
                    i19 = i59;
                    bitmap = null;
                    if (c22942 == null) {
                        iM31610 = (C0773.m3169("֨᩺") ^ i49) * (-3);
                        i20 = ((iM31610 ^ i50) * (-4653)) ^ 708149686;
                        i21 = -995562336;
                    } else {
                        iM31610 = (i50 - C0773.m3169("᩶ܽ")) * (-49);
                        i20 = ((iM31610 ^ i49) * (-22781)) ^ (-115764740);
                        i21 = 1262007560;
                    }
                    int i610 = iM31610 ^ i21;
                    sArr13 = sArr8;
                    i59 = i19;
                    i58 = i18;
                    c8007 = c8004;
                    bArrM46522 = bArr3;
                    sArr14 = sArr7;
                    options5 = options3;
                    i54 = i15;
                    i53 = i14;
                    i52 = i610;
                    i51 = i20;
                    sArr15 = sArr6;
                    z6 = z3;
                    i55 = i17;
                    i57 = i16;
                    break;
                case -1521497676:
                case 913202759:
                    if (i41 <= i39) {
                        iM3169 = (C0773.m3169("ܿۨ") ^ i50) * (-21);
                        i6 = ((iM3169 ^ i49) * 29549) ^ 2004852126;
                        i7 = -1036491440;
                    } else {
                        i40 = i41;
                        i42 = i43;
                        iM3169 = C0619.m2761("֫᩵") ^ i50;
                        i6 = ((iM3169 ^ i49) * 9523) ^ 810863590;
                        i7 = 782427561;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -1513163065:
                case -918042514:
                    if (i38 <= 0) {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i50;
                        i6 = ((iM3169 ^ i49) * (-12867)) ^ 271204299;
                        i7 = -1022063799;
                    } else {
                        iM3169 = (C0773.m3169("֫ᩴ") + i49) * 11;
                        i6 = ((iM3169 ^ i50) * (-22649)) ^ 392806487;
                        i7 = -1539109766;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -1503146247:
                case 1029112095:
                    z6 = false;
                    z6 = false;
                    bArrM46522 = C20244.m46522(C0269.m1776(c22942, c8007), 0);
                    try {
                        options5 = new BitmapFactory.Options();
                        i36 = 1;
                        options5.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(bArrM46522, 0, bArrM46522.length, options5);
                        i37 = options5.outWidth;
                        i38 = options5.outHeight;
                        iM3169 = (C0773.m3169("ۗ۟") ^ i50) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i49) * (-5969)) ^ (-716922533);
                        i7 = -9723662;
                    } catch (IOException unused) {
                        options5 = null;
                        iM3169 = C0773.m3169("ᩴۢ") ^ i50;
                        i6 = ((iM3169 ^ i49) * (-12867)) ^ 271204299;
                        i7 = -1022063799;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -1487505275:
                case -1324956589:
                    sArr10 = sArr15;
                    i30 = i57;
                    options4 = options5;
                    short[] sArr17 = sArr14;
                    i31 = i55;
                    c8006 = c8007;
                    z5 = z6 ? 1 : 0;
                    i32 = i53;
                    i33 = i54;
                    bArr5 = bArrM46522;
                    if (c8002M12310 == null) {
                        iM31611 = C0773.m3169("᩸ۖ") ^ i50;
                        sArr11 = sArr17;
                        i34 = ((iM31611 ^ i49) * (-29147)) ^ (-422303452);
                        i35 = 1654230874;
                    } else {
                        sArr11 = sArr17;
                        c8002M1239 = c8002M12310;
                        iM31611 = C0773.m3169("ۜ֫") ^ i49;
                        c8006 = c8002M1239;
                        i34 = ((iM31611 ^ i50) * (-4221)) ^ 956116537;
                        i35 = -876946146;
                    }
                    i52 = iM31611 ^ i35;
                    bArrM46522 = bArr5;
                    i53 = i32;
                    z6 = z5;
                    i55 = i31;
                    i57 = i30;
                    i51 = i34;
                    options5 = options4;
                    sArr15 = sArr10;
                    short[] sArr18 = sArr11;
                    i54 = i33;
                    c8007 = c8006;
                    sArr14 = sArr18;
                    break;
                case -1373587861:
                case 387443683:
                    return bitmapDecodeByteArray;
                case -1174559582:
                case 1709348613:
                    c8003 = c8007;
                    bArr2 = bArrM46522;
                    sArr4 = sArr15;
                    i8 = i57;
                    options2 = options5;
                    i9 = i55;
                    z2 = z6 ? 1 : 0;
                    sArr5 = f59666;
                    i10 = 195;
                    i54 = 8;
                    if (C1519.f5300 >= 0) {
                        int iM31613 = (i49 - C0773.m3169("᩸ᩳ")) * (-125);
                        int i72 = ((iM31613 ^ i50) * (-16845)) ^ 1917272483;
                        i52 = iM31613 ^ (-916872745);
                        z6 = z2;
                        i55 = i9;
                        i57 = i8;
                        i51 = i72;
                        bArrM46522 = bArr2;
                        i53 = i10;
                        c8007 = c8003;
                        sArr14 = sArr5;
                        options5 = options2;
                    } else {
                        int iM31614 = C0773.m3169("ܺᩳ") ^ i49;
                        int i73 = ((iM31614 ^ i50) * (-29069)) ^ 176783781;
                        i52 = iM31614 ^ 373138674;
                        c8007 = c8003;
                        z6 = z2 ? 1 : 0;
                        i55 = i9;
                        i57 = i8;
                        sArr14 = sArr5;
                        i51 = i73;
                        bArrM46522 = bArr2;
                        options5 = options2;
                        i53 = 195;
                    }
                    sArr15 = sArr4;
                    break;
                case -1145904838:
                case 481752441:
                    try {
                        options5.inSampleSize *= 2;
                        i41 = i40 / 2;
                        i43 = i42 / 2;
                        iM3169 = C0619.m2761("۫᩹") ^ i49;
                        i6 = ((iM3169 ^ i50) * 19547) ^ 1036391394;
                        i7 = 934087182;
                    } catch (IOException unused2) {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i50;
                        i6 = ((iM3169 ^ i49) * (-12867)) ^ 271204299;
                        i7 = -1022063799;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -996081305:
                case 569976520:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    c = 185;
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("۟᩹") ^ i50) * 69;
                        i51 = ((iM2761 ^ i49) * (-2127)) ^ 1908254791;
                        i12 = 1581830910;
                    } else {
                        iM2761 = (i50 - C0619.m2761("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i51 = ((iM2761 ^ i49) * (-11345)) ^ 1995281829;
                        i12 = 1613711996;
                    }
                    i29 = iM2761 ^ i12;
                    sArr13 = sArr3;
                    i59 = i11;
                    i58 = i5;
                    c8007 = c8002;
                    bArrM46522 = bArr;
                    sArr14 = sArr2;
                    options5 = options;
                    z6 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i29;
                    sArr15 = sArr;
                    c22942 = c22941;
                    break;
                case -933630165:
                case -835197825:
                    C1080.m4050();
                    C1146.m4231();
                    return null;
                case -914509393:
                case -604109045:
                    if (C1783.f6087 > 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr15;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM46522;
                        sArr2 = sArr14;
                        i4 = i55;
                        sArr3 = sArr13;
                        i5 = i58;
                        c8002 = c8007;
                        z = z6 ? 1 : 0;
                        int iM2766 = C0619.m2761("ܳ۠") ^ i50;
                        i51 = ((iM2766 ^ i49) * (-28703)) ^ 1461335647;
                        i29 = iM2766 ^ (-1512993808);
                        sArr13 = sArr3;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    } else {
                        iM3169 = (C0619.m2761("ۜۙ") ^ i50) * q.h;
                        i6 = ((iM3169 ^ i49) * (-10455)) ^ (-83186445);
                        i7 = 335815815;
                        i52 = iM3169 ^ i7;
                        i51 = i6;
                    }
                    break;
                case -839123057:
                case 469108094:
                    i39 = 600;
                    if (i37 <= 600) {
                        iM3169 = C0619.m2761("ۛۜ") ^ i50;
                        i6 = ((iM3169 ^ i49) * 27691) ^ 55758429;
                        i7 = 2085996768;
                    } else {
                        iM3169 = (i49 - C0619.m2761("᩸ᩴ")) * 25;
                        i6 = ((iM3169 ^ i50) * 3675) ^ (-203736167);
                        i7 = -1073466512;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -744837446:
                case 325206536:
                    C1564.m5509();
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("۬֫") + i49) * (-107);
                        i6 = ((iM3169 ^ i50) * 25085) ^ (-1212691004);
                        i7 = -460617761;
                    } else {
                        iM3169 = (i49 - C0619.m2761("ۧۜ")) * (-23);
                        i6 = ((iM3169 ^ i50) * (-29287)) ^ (-1029419478);
                        i7 = 93902268;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -718435492:
                case 1668950829:
                    sArr10 = sArr15;
                    int i74 = i55;
                    i30 = i57;
                    options4 = options5;
                    z5 = z6 ? 1 : 0;
                    i31 = i74;
                    c8002M1239 = AbstractC0116.m1239(c22942, C1343.m4939(sArr10, i74, i56, i30));
                    i32 = i53;
                    i33 = i54;
                    bArr5 = bArrM46522;
                    sArr11 = sArr14;
                    iM31611 = C0773.m3169("ۜ֫") ^ i49;
                    c8006 = c8002M1239;
                    i34 = ((iM31611 ^ i50) * (-4221)) ^ 956116537;
                    i35 = -876946146;
                    i52 = iM31611 ^ i35;
                    bArrM46522 = bArr5;
                    i53 = i32;
                    z6 = z5;
                    i55 = i31;
                    i57 = i30;
                    i51 = i34;
                    options5 = options4;
                    sArr15 = sArr10;
                    short[] sArr19 = sArr11;
                    i54 = i33;
                    c8007 = c8006;
                    sArr14 = sArr19;
                    break;
                case -699383880:
                case -34874534:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    int i75 = i46 + i47;
                    if ((i75 + i75) - i45 < 0) {
                        iM2761 = (C0773.m3169("ۢ᩸") ^ i49) * (-9);
                        i51 = ((iM2761 ^ i50) * (-20081)) ^ 448135640;
                        i12 = -326894160;
                    } else {
                        iM2761 = (i50 - C0619.m2761("ۚ֫")) * 91;
                        i51 = ((iM2761 ^ i49) * 12923) ^ 265565555;
                        i12 = -468571861;
                    }
                    i29 = iM2761 ^ i12;
                    sArr13 = sArr3;
                    i59 = i11;
                    i58 = i5;
                    c8007 = c8002;
                    bArrM46522 = bArr;
                    sArr14 = sArr2;
                    options5 = options;
                    z6 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i29;
                    sArr15 = sArr;
                    c22942 = c22941;
                    break;
                case -675347820:
                case 853451382:
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM46522, z6 ? 1 : 0, bArrM46522.length, options5);
                    iM3169 = C0773.m3169("ܺۚ") ^ i50;
                    i6 = ((iM3169 ^ i49) * 21851) ^ (-1891781865);
                    i7 = -2113420358;
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -602026017:
                case 1084374997:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i59 = 9;
                    if (C2288.m7767()) {
                        int iM2767 = C0619.m2761("ܳ۠") ^ i50;
                        i51 = ((iM2767 ^ i49) * (-28703)) ^ 1461335647;
                        i29 = iM2767 ^ (-1512993808);
                        sArr13 = sArr3;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    } else {
                        int iM2768 = C0619.m2761("۬ۡ") ^ i50;
                        sArr13 = sArr3;
                        i58 = i5;
                        bArrM46522 = bArr;
                        options5 = options;
                        z6 = z ? 1 : 0;
                        i55 = i4;
                        i53 = i;
                        i57 = i3;
                        i52 = iM2768 ^ 364457927;
                        i51 = ((iM2768 ^ i49) * 14069) ^ 220455027;
                        sArr15 = sArr;
                        c8007 = c8002;
                        sArr14 = sArr2;
                        i54 = i2;
                    }
                    break;
                case -589396941:
                case 1152706080:
                    C4238.m13540();
                    C1783.m6232();
                    iM3169 = (i49 - C0619.m2761("ۧۜ")) * (-23);
                    i6 = ((iM3169 ^ i50) * (-29287)) ^ (-1029419478);
                    i7 = 93902268;
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -492526134:
                case 2140404304:
                    C13473.m33144();
                    if (C0773.f2792 > 0) {
                        iM3169 = (i49 - C0619.m2761("ۧۜ")) * (-23);
                        i6 = ((iM3169 ^ i50) * (-29287)) ^ (-1029419478);
                        i7 = 93902268;
                    } else {
                        iM3169 = (C0619.m2761("ۜۙ") ^ i50) * q.h;
                        i6 = ((iM3169 ^ i49) * (-10455)) ^ (-83186445);
                        i7 = 335815815;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -454310266:
                case 1578928584:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    short s2 = s;
                    int i76 = s2 + 16283;
                    if (C0619.f2439) {
                        s = s2;
                        i44 = i76;
                        iM2761 = (i50 - C0619.m2761("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i51 = ((iM2761 ^ i49) * (-11345)) ^ 1995281829;
                        i12 = 1613711996;
                        i29 = iM2761 ^ i12;
                        sArr13 = sArr3;
                        i59 = i11;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                    } else {
                        int iM31615 = (i50 - C0773.m3169("ܰۘ")) * (-75);
                        s = s2;
                        i44 = i76;
                        sArr13 = sArr3;
                        i59 = i11;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        i54 = i2;
                        i53 = i;
                        i51 = ((iM31615 ^ i49) * (-31345)) ^ 1644764936;
                        i52 = iM31615 ^ 1838980325;
                        sArr15 = sArr;
                        z6 = z ? 1 : 0;
                        i55 = i4;
                        i57 = i3;
                    }
                    c22942 = c22941;
                    break;
                case -453067225:
                case 1720877190:
                    if (C2485.f7950 == 0) {
                        i22 = i53;
                        i23 = i54;
                        sArr4 = sArr15;
                        i24 = i57;
                        options2 = options5;
                        bArr4 = bArrM46522;
                        sArr9 = sArr14;
                        i25 = i55;
                        c8005 = c8007;
                        z4 = z6 ? 1 : 0;
                        i26 = i59;
                        iM2762 = (i50 - C0773.m3169("ᩳ᩺")) * 123;
                        i27 = ((iM2762 ^ i49) * (-28803)) ^ 1643947736;
                        i28 = -1910577810;
                        int i611 = iM2762 ^ i28;
                        i59 = i26;
                        c8007 = c8005;
                        bArrM46522 = bArr4;
                        sArr14 = sArr9;
                        z6 = z4;
                        i55 = i25;
                        i54 = i23;
                        i53 = i22;
                        i57 = i24;
                        i52 = i611;
                        i51 = i27;
                        options5 = options2;
                        sArr15 = sArr4;
                    } else {
                        iM3169 = (i49 - C0619.m2761("ۧۜ")) * (-23);
                        i6 = ((iM3169 ^ i50) * (-29287)) ^ (-1029419478);
                        i7 = 93902268;
                        i52 = iM3169 ^ i7;
                        i51 = i6;
                    }
                    break;
                case -343676891:
                case -130645704:
                    options5.inJustDecodeBounds = z6;
                    iM3169 = C0619.m2761("ۚۧ") ^ i50;
                    i6 = ((iM3169 ^ i49) * 23451) ^ 894810129;
                    i7 = 1491855995;
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -333667853:
                case 1586720749:
                    if (i37 > 0) {
                        iM3169 = C0619.m2761("ۜۛ") ^ i49;
                        i6 = ((iM3169 ^ i50) * 29379) ^ (-1909892193);
                        i7 = 1537548357;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i50;
                        i6 = ((iM3169 ^ i49) * (-12867)) ^ 271204299;
                        i7 = -1022063799;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -217414870:
                case 127203904:
                    if (i43 <= i39) {
                        iM3169 = C0773.m3169("֫ۢ") ^ i49;
                        i6 = ((iM3169 ^ i50) * 31071) ^ (-1644753756);
                        i7 = -1606670411;
                    } else {
                        i40 = i41;
                        i42 = i43;
                        iM3169 = C0619.m2761("֫᩵") ^ i50;
                        i6 = ((iM3169 ^ i49) * 9523) ^ 810863590;
                        i7 = 782427561;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case -185133854:
                case 1443331870:
                    return bitmap;
                case -141919555:
                case 1781027398:
                    options = options5;
                    z = z6 ? 1 : 0;
                    int i77 = i57;
                    short[] sArr20 = f59666;
                    i56 = 8;
                    if (C1146.m4231()) {
                        int iM2769 = (i50 - C0619.m2761("ۖ۟")) * (-91);
                        i52 = iM2769 ^ (-696663316);
                        i57 = i77;
                        i51 = ((iM2769 ^ i49) * 16829) ^ 1589329445;
                        z6 = z ? 1 : 0;
                        i55 = 203;
                        sArr15 = sArr20;
                        options5 = options;
                    } else {
                        i3 = i77;
                        sArr = sArr20;
                        i = i53;
                        i2 = i54;
                        sArr3 = sArr13;
                        i4 = 203;
                        bArr = bArrM46522;
                        sArr2 = sArr14;
                        i5 = i58;
                        c8002 = c8007;
                        i11 = i59;
                        iM2761 = (i50 - C0619.m2761("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i51 = ((iM2761 ^ i49) * (-11345)) ^ 1995281829;
                        i12 = 1613711996;
                        i29 = iM2761 ^ i12;
                        sArr13 = sArr3;
                        i59 = i11;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    }
                    break;
                case -112554659:
                case 1930546033:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    s = sArr12[c];
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("᩺᩷") ^ i49) * 75;
                        i51 = ((iM2761 ^ i50) * (-15531)) ^ 432847907;
                        i12 = 1855844933;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܰ") ^ i49) * (-107);
                        i51 = ((iM2761 ^ i50) * (-27357)) ^ 210862455;
                        i12 = -974262910;
                    }
                    i29 = iM2761 ^ i12;
                    sArr13 = sArr3;
                    i59 = i11;
                    i58 = i5;
                    c8007 = c8002;
                    bArrM46522 = bArr;
                    sArr14 = sArr2;
                    options5 = options;
                    z6 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i29;
                    sArr15 = sArr;
                    c22942 = c22941;
                    break;
                case 312449079:
                case 1262823704:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    sArr12 = f59666;
                    if (C1542.f5343 > 0) {
                        iM2761 = C0619.m2761("ۚ᩵") ^ i49;
                        i51 = ((iM2761 ^ i50) * (-21083)) ^ 1200879713;
                        i12 = -1290011833;
                        i29 = iM2761 ^ i12;
                        sArr13 = sArr3;
                        i59 = i11;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    } else {
                        i59 = i11;
                        int iM27610 = C0619.m2761("ܳ۠") ^ i50;
                        i51 = ((iM27610 ^ i49) * (-28703)) ^ 1461335647;
                        i29 = iM27610 ^ (-1512993808);
                        sArr13 = sArr3;
                        i58 = i5;
                        c8007 = c8002;
                        bArrM46522 = bArr;
                        sArr14 = sArr2;
                        options5 = options;
                        z6 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i29;
                        sArr15 = sArr;
                        c22942 = c22941;
                    }
                    break;
                case 414834323:
                case 1921670788:
                    i13 = 19937;
                    int iM27611 = C0619.m2761("ۚᩴ") ^ i49;
                    int i78 = ((iM27611 ^ i50) * 1839) ^ 1255149197;
                    sArr13 = sArr13;
                    i59 = i59;
                    i58 = i58;
                    c8007 = c8007;
                    bArrM46522 = bArrM46522;
                    sArr14 = sArr14;
                    options5 = options5;
                    i54 = i54;
                    i53 = i53;
                    i52 = iM27611 ^ 1442136952;
                    sArr15 = sArr15;
                    z6 = z6 ? 1 : 0;
                    i55 = i55;
                    i57 = i13;
                    i51 = i78;
                    c22942 = c22941;
                    break;
                case 453767939:
                case 1135953137:
                    if (C0862.m3503()) {
                        iM3169 = (C0619.m2761("ܽܽ") + i50) * (-35);
                        i6 = ((iM3169 ^ i49) * (-10379)) ^ (-1103992834);
                        i7 = 248837827;
                    } else {
                        iM3169 = C0773.m3169("ۡܿ") ^ i49;
                        i6 = ((iM3169 ^ i50) * (-23865)) ^ 1449634273;
                        i7 = 1226631201;
                    }
                    i52 = iM3169 ^ i7;
                    i51 = i6;
                    break;
                case 817996612:
                case 2057767675:
                    if (RunnableC3055.f9898 >= 0) {
                        sArr4 = sArr15;
                        i8 = i57;
                        options2 = options5;
                        sArr5 = sArr14;
                        i9 = i55;
                        c8003 = c8007;
                        z2 = z6 ? 1 : 0;
                        i10 = i53;
                        bArr2 = bArrM46522;
                        int iM31616 = (i49 - C0773.m3169("᩸ᩳ")) * (-125);
                        int i79 = ((iM31616 ^ i50) * (-16845)) ^ 1917272483;
                        i52 = iM31616 ^ (-916872745);
                        z6 = z2;
                        i55 = i9;
                        i57 = i8;
                        i51 = i79;
                        bArrM46522 = bArr2;
                        i53 = i10;
                        c8007 = c8003;
                        sArr14 = sArr5;
                        options5 = options2;
                        sArr15 = sArr4;
                    } else {
                        iM3169 = (C0619.m2761("ۜۙ") ^ i50) * q.h;
                        i6 = ((iM3169 ^ i49) * (-10455)) ^ (-83186445);
                        i7 = 335815815;
                        i52 = iM3169 ^ i7;
                        i51 = i6;
                    }
                    break;
                case 861824614:
                case 1205698868:
                    i22 = i53;
                    i23 = i54;
                    sArr4 = sArr15;
                    i24 = i57;
                    options2 = options5;
                    bArr4 = bArrM46522;
                    sArr9 = sArr14;
                    i25 = i55;
                    c8005 = c8007;
                    z4 = z6 ? 1 : 0;
                    i26 = i59;
                    sArr13 = f59666;
                    i58 = 186;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2762 = (i50 - C0773.m3169("ᩳ᩺")) * 123;
                        i27 = ((iM2762 ^ i49) * (-28803)) ^ 1643947736;
                        i28 = -1910577810;
                    } else {
                        iM2762 = (C0619.m2761("ۚۛ") ^ i49) * 71;
                        i27 = ((iM2762 ^ i50) * 6975) ^ (-1282570980);
                        i28 = 1626575372;
                    }
                    int i612 = iM2762 ^ i28;
                    i59 = i26;
                    c8007 = c8005;
                    bArrM46522 = bArr4;
                    sArr14 = sArr9;
                    z6 = z4;
                    i55 = i25;
                    i54 = i23;
                    i53 = i22;
                    i57 = i24;
                    i52 = i612;
                    i51 = i27;
                    options5 = options2;
                    sArr15 = sArr4;
                    break;
                case 969549024:
                case 1680530647:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    i45 = i44 * i44;
                    i46 = s * s;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("᩺᩷") ^ i49) * 75;
                        i51 = ((iM2761 ^ i50) * (-15531)) ^ 432847907;
                        i12 = 1855844933;
                    } else {
                        iM2761 = C0773.m3169("ۛ֡") ^ i50;
                        i51 = ((iM2761 ^ i49) * 2153) ^ (-1917326472);
                        i12 = -219229816;
                    }
                    i29 = iM2761 ^ i12;
                    sArr13 = sArr3;
                    i59 = i11;
                    i58 = i5;
                    c8007 = c8002;
                    bArrM46522 = bArr;
                    sArr14 = sArr2;
                    options5 = options;
                    z6 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i29;
                    sArr15 = sArr;
                    c22942 = c22941;
                    break;
                case 970556460:
                case 1744749847:
                    i = i53;
                    i2 = i54;
                    sArr = sArr15;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM46522;
                    sArr2 = sArr14;
                    i4 = i55;
                    sArr3 = sArr13;
                    i5 = i58;
                    c8002 = c8007;
                    z = z6 ? 1 : 0;
                    i11 = i59;
                    i47 = 265136089;
                    if (C0862.m3503()) {
                        iM2761 = (C0619.m2761("᩶ۛ") ^ i49) * (-83);
                        i51 = ((iM2761 ^ i50) * (-5753)) ^ 2096804830;
                        i12 = -1218806555;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩷") ^ i49) * 75;
                        i51 = ((iM2761 ^ i50) * (-15531)) ^ 432847907;
                        i12 = 1855844933;
                    }
                    i29 = iM2761 ^ i12;
                    sArr13 = sArr3;
                    i59 = i11;
                    i58 = i5;
                    c8007 = c8002;
                    bArrM46522 = bArr;
                    sArr14 = sArr2;
                    options5 = options;
                    z6 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i29;
                    sArr15 = sArr;
                    c22942 = c22941;
                    break;
                case 981844702:
                case 1159494943:
                    i13 = 4475;
                    int iM27612 = C0619.m2761("ۚᩴ") ^ i49;
                    int i710 = ((iM27612 ^ i50) * 1839) ^ 1255149197;
                    sArr13 = sArr13;
                    i59 = i59;
                    i58 = i58;
                    c8007 = c8007;
                    bArrM46522 = bArrM46522;
                    sArr14 = sArr14;
                    options5 = options5;
                    i54 = i54;
                    i53 = i53;
                    i52 = iM27612 ^ 1442136952;
                    sArr15 = sArr15;
                    z6 = z6 ? 1 : 0;
                    i55 = i55;
                    i57 = i13;
                    i51 = i710;
                    c22942 = c22941;
                    break;
                default:
                    return bitmap;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[PHI: r0
      0x00d4: PHI (r0v6 boolean) = (r0v4 boolean), (r0v2 boolean) binds: [B:36:0x00d2, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0150 A[PHI: r8
      0x0150: PHI (r8v8 java.lang.Object) = 
      (r8v4 java.lang.Object)
      (r8v4 java.lang.Object)
      (r8v4 java.lang.Object)
      (r8v5 java.lang.Object)
      (r8v4 java.lang.Object)
      (r8v4 java.lang.Object)
     binds: [B:48:0x014e, B:44:0x0131, B:32:0x00b7, B:24:0x0065, B:12:0x003f, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    public C18300() {
        int iM2761;
        int i;
        boolean z = false;
        ArrayList arrayList = null;
        int i2 = 1155597152;
        int i3 = C1146.f4234;
        int i4 = C0773.f2792;
        int iM3169 = C0773.m3169("ۚᩳ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 16583) ^ (-809818069);
        int i6 = 1723147235;
        while (true) {
            int i7 = iM3169 ^ i6;
            Object obj = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 30355) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1605782574:
                    case 1023974048:
                        if (RunnableC1848.f6235) {
                            iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                            i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                            i = -251710588;
                        } else {
                            iM2761 = (C0619.m2761("ۛ᩸") + i3) * (-67);
                            i5 = ((iM2761 ^ i4) * 29827) ^ 2088742317;
                            i = 434797766;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1551332103:
                    case 1080416607:
                        if (C4282.f15546 <= 0) {
                            iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                            i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                            i = -251710588;
                        } else {
                            iM2761 = (C0619.m2761("ܺ֡") ^ i4) * (-59);
                            i5 = ((iM2761 ^ i3) * (-10755)) ^ (-1243007546);
                            i = -1468442778;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1548747857:
                    case -1298913440:
                        if (C17202.m40372()) {
                            iM2761 = C0619.m2761("ܽۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 12857) ^ (-1342887207);
                            i = 382202811;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                            i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                            i = -251710588;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1523455338:
                    case -703093371:
                        C3492.m11488();
                        C2288.m7767();
                        break;
                    case -944608384:
                    case 579782592:
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (C0619.m2761("ۛ᩸") + i3) * (-67);
                            i5 = ((iM2761 ^ i4) * 29827) ^ 2088742317;
                            i = 434797766;
                        } else {
                            iM2761 = (C0619.m2761("۟᩸") ^ i3) * (-39);
                            i5 = ((iM2761 ^ i4) * (-13553)) ^ (-619892359);
                            i = -1344155357;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -691236040:
                    case 1832840077:
                        this.f59688 = 21;
                        if (C3077.f9998) {
                            iM2761 = (C0619.m2761("ۤܳ") + i4) * 3;
                            i5 = ((iM2761 ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid) ^ 935909902;
                            i = 1968228264;
                        } else {
                            iM2761 = (C0619.m2761("ۛ᩸") + i3) * (-67);
                            i5 = ((iM2761 ^ i4) * 29827) ^ 2088742317;
                            i = 434797766;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -603585226:
                    case 2044414379:
                        z = false;
                        z = false;
                        if (C0773.f2792 <= 0) {
                            iM2761 = (C0619.m2761("ܺ֡") ^ i4) * (-59);
                            i5 = ((iM2761 ^ i3) * (-10755)) ^ (-1243007546);
                            i = -1468442778;
                        } else {
                            iM2761 = (C0773.m3169("ۘۤ") ^ i3) * 81;
                            i5 = ((iM2761 ^ i4) * (-32609)) ^ (-1174497622);
                            i = -393733914;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -425572715:
                    case 1411416757:
                        if (C1519.f5300 < 0) {
                        }
                        iM2761 = (C0619.m2761("ۛ᩸") + i3) * (-67);
                        i5 = ((iM2761 ^ i4) * 29827) ^ 2088742317;
                        i = 434797766;
                        i7 = iM2761 ^ i;
                        break;
                    case -232664680:
                    case 559199029:
                        if (C3448.f11240 < 0) {
                            iM2761 = (i4 - C0619.m2761("۠ᩴ")) * (-15);
                            i5 = ((iM2761 ^ i3) * 8745) ^ (-1557015998);
                            i = -1799163149;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -80162170:
                    case 1751946964:
                        this.f59686 = obj;
                        this.f59667 = z;
                        return;
                    case 892714285:
                    case 1656473431:
                        this.f59690 = arrayList;
                        if (C3099.f10023 > 0) {
                            obj = new Object();
                            if (C2878.f9462) {
                                iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                                i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                                i = -251710588;
                            } else {
                                iM2761 = C0619.m2761("ܶ֨") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-29629)) ^ 1834129753;
                                i = -1985589475;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 965324219:
                    case 1056637320:
                        this.f59668 = z ? 1 : 0;
                        if (RunnableC3646.f12471) {
                            iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                            i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                            i = -251710588;
                        } else {
                            iM2761 = C0773.m3169("᩸᩷") ^ i4;
                            i5 = ((iM2761 ^ i3) * 9759) ^ (-1982543807);
                            i = 58751209;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1657086096:
                    case 1683581999:
                        if (C3077.f9998) {
                            iM2761 = (C0773.m3169("ۨ᩵") ^ i3) * (-51);
                            i5 = ((iM2761 ^ i4) * (-16861)) ^ 27620883;
                            i = 635693083;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ᩳ᩹")) * 27;
                            i5 = ((iM2761 ^ i3) * (-8797)) ^ 1705054265;
                            i = -251710588;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1897746111:
                    case 2045549778:
                        arrayList = new ArrayList();
                        if (C4238.m13540() <= 0) {
                            iM2761 = (i3 - C0773.m3169("ܳ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM2761 ^ i4) * (-22273)) ^ (-655261589);
                            i = 680883397;
                        } else {
                            iM2761 = C0619.m2761("ۧᩴ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 5615) ^ (-1400784224);
                            i = -2058611902;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        C0619.m2763();
                        AbstractC3624.m11755();
                        throw new RuntimeException();
                }
            }
            iM3169 = C0619.m2761("ᩴ۬") ^ i3;
            i5 = ((iM3169 ^ i4) * (-2797)) ^ (-1839538780);
            i6 = 95751441;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PluginContext m42678() {
        int i = 2061298539;
        int i2 = C1080.f3865;
        int i3 = C23916.f77426;
        int iM2761 = (C0619.m2761("ۛ֡") ^ i3) * (-121);
        int i4 = ((iM2761 ^ i2) * 17505) ^ (-1712189048);
        int i5 = -2035654480;
        while (true) {
            i = ((((i ^ i2) * (-14379)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2137707919:
                case -504914920:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    } else {
                        iM2761 = C0773.m3169("ܳܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4695)) ^ 129450807;
                        i5 = -1674439310;
                    }
                    break;
                case -2137523979:
                case 101484443:
                    C3734.m12152();
                    iM2761 = C0773.m3169("۬᩷") ^ i2;
                    i4 = ((iM2761 ^ i3) * 1731) ^ (-1476607794);
                    i5 = 1937721820;
                    break;
                case -2109608504:
                case 498634873:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ᩴ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 21377) ^ (-201138048);
                        i5 = -883710567;
                    }
                    break;
                case -2038189169:
                case -725467058:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֨") ^ i2) * 97;
                        i4 = ((iM2761 ^ i3) * (-795)) ^ 1043278509;
                        i5 = -1929059061;
                    }
                    break;
                case -1988250751:
                case 1687154742:
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("۬᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1731) ^ (-1476607794);
                        i5 = 1937721820;
                    } else {
                        iM2761 = (C0773.m3169("ۢܽ") + i3) * (-57);
                        i4 = ((iM2761 ^ i2) * 30843) ^ 1705860331;
                        i5 = 1671871970;
                    }
                    break;
                case -1893728931:
                case -302164081:
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18761)) ^ 1882535364;
                        i5 = -1504550038;
                    } else {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    }
                    break;
                case -1890459325:
                case 180227274:
                    C0862.m3503();
                    if (!C3099.m10095()) {
                        iM2761 = C0773.m3169("۬᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1731) ^ (-1476607794);
                        i5 = 1937721820;
                    } else {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    }
                    break;
                case -1666061497:
                case 1758040656:
                    if (this.f59673 == null) {
                        iM2761 = (i3 - C0619.m2761("᩸ᩴ")) * (-101);
                        i4 = ((iM2761 ^ i2) * 11133) ^ (-400268874);
                        i5 = 641019323;
                    } else {
                        iM2761 = C0619.m2761("ۗ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20047)) ^ 595710271;
                        i5 = 1992295864;
                    }
                    break;
                case -1496211324:
                case 1356945277:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܽ֨")) * 127;
                        i4 = ((iM2761 ^ i3) * (-401)) ^ (-255943633);
                        i5 = 948084760;
                    }
                    break;
                case -1474695617:
                case -483992082:
                    C1321.m4852();
                    return null;
                case -1395029152:
                case 710150352:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    } else {
                        iM2761 = (C0773.m3169("֫ܳ") ^ i3) * 123;
                        i4 = ((iM2761 ^ i2) * 3381) ^ 204679728;
                        i5 = -1356737818;
                    }
                    break;
                case -1381594695:
                case 329819873:
                    return this.f59673;
                case -1279205521:
                case -271557189:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    } else {
                        iM2761 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16871)) ^ (-342484476);
                        i5 = -1416215071;
                    }
                    break;
                case -800781235:
                case -475331963:
                    m42644((C22941) null);
                    iM2761 = C0619.m2761("ۗ۠") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-20047)) ^ 595710271;
                    i5 = 1992295864;
                    break;
                case -774231104:
                case 736066086:
                    C2354.m7983();
                    if (C3690.f12684 > 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    } else {
                        iM2761 = C0773.m3169("ᩴۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26413)) ^ (-767578478);
                        i5 = 1412730188;
                    }
                    break;
                case -463564436:
                case -215294954:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30453)) ^ (-1796212515);
                        i5 = 1584168608;
                    } else {
                        iM2761 = C0773.m3169("ۢۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14111)) ^ (-1905389329);
                        i5 = 1542693025;
                    }
                    break;
                case 412760475:
                case 1894830078:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    } else {
                        iM2761 = (C0619.m2761("۬ᩴ") + i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-14069)) ^ 1023487351;
                        i5 = -8118460;
                    }
                    break;
                default:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18687) ^ (-111001382);
                        i5 = -1197374283;
                    } else {
                        iM2761 = C0773.m3169("ۨ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25587)) ^ (-758921731);
                        i5 = 180135569;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m42648() {
        m42653();
        this.f59689 = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01d4 A[PHI: r1 r4 r5 r6 r7 r11 r12 r13 r27
      0x01d4: PHI (r1v41 l.ۘܶۤ) = (r1v7 l.ۘܶۤ), (r1v37 l.ۘܶۤ), (r1v38 l.ۘܶۤ), (r1v42 l.ۘܶۤ) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r4v5 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r11v5 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r13v5 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r27v21 int) = (r27v6 int), (r27v18 int), (r27v19 int), (r27v22 int) binds: [B:38:0x0154, B:50:0x01d2, B:46:0x01aa, B:43:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03ba A[PHI: r2 r18 r19 r20 r27
      0x03ba: PHI (r2v13 int) = (r2v10 int), (r2v12 int), (r2v14 int) binds: [B:13:0x0088, B:93:0x03b8, B:89:0x0397] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r18v4 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:13:0x0088, B:93:0x03b8, B:89:0x0397] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r19v3 short) = (r19v2 short), (r19v2 short), (r19v4 short) binds: [B:13:0x0088, B:93:0x03b8, B:89:0x0397] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r20v3 short) = (r20v2 short), (r20v2 short), (r20v4 short) binds: [B:13:0x0088, B:93:0x03b8, B:89:0x0397] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r27v12 int) = (r27v9 int), (r27v11 int), (r27v13 int) binds: [B:13:0x0088, B:93:0x03b8, B:89:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42638(int i) {
        C4245 c4245;
        int iM2761;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int i8;
        int i9 = -10983284;
        int i10 = C20932.f66974;
        int i11 = C3099.f10023;
        int iM2762 = C0619.m2761("᩹ᩴ") ^ i11;
        int i12 = ((iM2762 ^ i10) * 2933) ^ 1872745246;
        int i13 = iM2762 ^ (-1671924339);
        String strGroup = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        C4245 c4245Matcher = null;
        short[] sArr4 = null;
        String strM2824 = null;
        String strM13650 = null;
        String strGroup2 = null;
        int i24 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 30257) >> 31));
            switch (i9) {
                case -2123458048:
                case 812897097:
                    i14 = i14;
                    i23 = i23;
                    i21 = s * s2;
                    i22 = s * s;
                    i20 = 26357956;
                    if (C3492.f12043 <= 0) {
                        iM31610 = C0619.m2761("᩵ۡ") ^ i11;
                        i12 = ((iM31610 ^ i10) * 17981) ^ 2014357;
                        i6 = -2095792080;
                    } else {
                        iM31610 = (C0619.m2761("ܽ֫") + i11) * 127;
                        i12 = ((iM31610 ^ i10) * 6853) ^ (-1400146733);
                        i6 = -1821979400;
                    }
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i25 = i14;
                    i13 = i7;
                    i14 = i25;
                    break;
                case -2093137121:
                case -181217459:
                    i14 = i14;
                    c4245 = c4245Matcher;
                    i15 = 1;
                    strGroup = c4245.group(1);
                    C1321.m4848(strGroup);
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ۗۢ") ^ i10;
                        i2 = ((iM2761 ^ i11) * 4895) ^ 853341384;
                        i3 = -1452172538;
                    } else {
                        iM2761 = C0619.m2761("ۘ֨") ^ i10;
                        i2 = ((iM2761 ^ i11) * 425) ^ 1976491877;
                        i3 = -1635068612;
                    }
                    i7 = iM2761 ^ i3;
                    c4245Matcher = c4245;
                    i12 = i2;
                    int i26 = i14;
                    i13 = i7;
                    i14 = i26;
                    break;
                case -2084730520:
                case 501617080:
                    if (C1826.f6190 <= 0) {
                        i23 = i23;
                        int iM31611 = C0773.m3169("ۗۤ") ^ i11;
                        i13 = iM31611 ^ (-1450529079);
                        i12 = ((iM31611 ^ i10) * 1213) ^ 328933825;
                        i14 = i14;
                        i23 = i23;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ֫") ^ i10) * (-67);
                        i4 = ((iM3169 ^ i11) * (-3047)) ^ 2098113830;
                        i5 = 579806716;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case -2007131577:
                case -1270430615:
                    i14 = i14;
                    c4245 = c4245Matcher;
                    i24 = 2;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ۗۢ") ^ i10;
                        i2 = ((iM2761 ^ i11) * 4895) ^ 853341384;
                        i3 = -1452172538;
                    } else {
                        iM2761 = (i10 - C0619.m2761("᩵ۖ")) * (-61);
                        i2 = ((iM2761 ^ i11) * 351) ^ (-112192828);
                        i3 = -1758446758;
                    }
                    i7 = iM2761 ^ i3;
                    c4245Matcher = c4245;
                    i12 = i2;
                    int i27 = i14;
                    i13 = i7;
                    i14 = i27;
                    break;
                case -1918183344:
                case -610585543:
                    sArr2 = f59666;
                    i19 = 87;
                    i14 = 2;
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0619.m2761("ᩴ֫") ^ i10;
                        i4 = ((iM3169 ^ i11) * 26685) ^ 939267529;
                        i5 = -1906419933;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i23 = i23;
                        int iM31612 = C0773.m3169("ۗۤ") ^ i11;
                        i13 = iM31612 ^ (-1450529079);
                        i12 = ((iM31612 ^ i10) * 1213) ^ 328933825;
                        i14 = i14;
                        i23 = i23;
                    }
                    break;
                case -1916002058:
                case -1005993968:
                    i14 = i14;
                    i23 = i23;
                    sArr4 = f59666;
                    if (!C3077.f9998) {
                        i14 = i14;
                        int iM31613 = C0773.m3169("ۗۤ") ^ i11;
                        i13 = iM31613 ^ (-1450529079);
                        i12 = ((iM31613 ^ i10) * 1213) ^ 328933825;
                        i14 = i14;
                        i23 = i23;
                    } else {
                        iM31610 = C0773.m3169("ܰۛ") ^ i10;
                        i12 = ((iM31610 ^ i11) * 8143) ^ (-1820226774);
                        i6 = 579731891;
                        i7 = iM31610 ^ i6;
                        i23 = i23;
                        int i28 = i14;
                        i13 = i7;
                        i14 = i28;
                    }
                    break;
                case -1891542468:
                case -1533958639:
                    strM13650 = C4282.m13650(sArr2, i19, i14, i16);
                    sArr3 = f59666;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ᩳ֫") ^ i10) * (-67);
                        i4 = ((iM3169 ^ i11) * (-3047)) ^ 2098113830;
                        i5 = 579806716;
                    } else {
                        iM3169 = C0619.m2761("ܺۤ") ^ i11;
                        i4 = ((iM3169 ^ i10) * 957) ^ 1936553446;
                        i5 = -1177664513;
                    }
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -1783022905:
                case 1715332863:
                    sArr = f59666;
                    i17 = 86;
                    i18 = 1;
                    if (C2375.f7641 > 0) {
                        iM3169 = C0773.m3169("֡᩷") ^ i11;
                        i4 = ((iM3169 ^ i10) * (-12971)) ^ (-703494366);
                        i5 = -1003177907;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i14 = i14;
                        c4245 = c4245Matcher;
                        iM2761 = C0619.m2761("ۗۢ") ^ i10;
                        i2 = ((iM2761 ^ i11) * 4895) ^ 853341384;
                        i3 = -1452172538;
                        i7 = iM2761 ^ i3;
                        c4245Matcher = c4245;
                        i12 = i2;
                        int i29 = i14;
                        i13 = i7;
                        i14 = i29;
                    }
                    break;
                case -1780392284:
                case 1523154134:
                    c4245 = c4245Matcher;
                    strGroup2 = c4245.group(i24);
                    C1321.m4848(strGroup2);
                    if (C2966.f9654 < 0) {
                        int iM31614 = (C0773.m3169("ܿᩳ") ^ i11) * 69;
                        int i30 = i14;
                        int i31 = ((iM31614 ^ i10) * 4749) ^ (-766205717);
                        i8 = iM31614 ^ 1537431197;
                        c4245Matcher = c4245;
                        i12 = i31;
                        i14 = i30;
                        i13 = i8;
                    } else {
                        i14 = i14;
                        iM2761 = C0619.m2761("ۗۢ") ^ i10;
                        i2 = ((iM2761 ^ i11) * 4895) ^ 853341384;
                        i3 = -1452172538;
                        i7 = iM2761 ^ i3;
                        c4245Matcher = c4245;
                        i12 = i2;
                        int i210 = i14;
                        i13 = i7;
                        i14 = i210;
                    }
                    break;
                case -1776124458:
                case 1560060773:
                    i14 = i14;
                    i23 = i23;
                    if (i != 0) {
                        iM31610 = C0773.m3169("ᩳۧ") ^ i10;
                        i12 = ((iM31610 ^ i11) * 9087) ^ (-1802645739);
                        i6 = -1215582657;
                        i7 = iM31610 ^ i6;
                        i23 = i23;
                        int i211 = i14;
                        i13 = i7;
                        i14 = i211;
                    } else {
                        int iM2763 = C0619.m2761("ᩴ᩺") ^ i10;
                        int i32 = ((iM2763 ^ i11) * 12371) ^ 73484103;
                        int i33 = iM2763 ^ (-1964572030);
                        i23 = i23;
                        i12 = i32;
                        i14 = i14;
                        i13 = i33;
                    }
                    break;
                case -1671001539:
                case 683510086:
                    if (C20932.m47857(strGroup2, C23916.m53420(sArr, i17, i18, i16))) {
                        iM3169 = (i10 - C0619.m2761("ۙᩳ")) * 75;
                        i4 = ((iM3169 ^ i11) * (-15455)) ^ (-1451070062);
                        i5 = 694243769;
                    } else {
                        strM2824 = strGroup2;
                        iM3169 = C0619.m2761("ᩳۨ") ^ i10;
                        i4 = ((iM3169 ^ i11) * (-20859)) ^ 1760618311;
                        i5 = -1486542336;
                    }
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -1656464274:
                case 1574261970:
                    i14 = i14;
                    c4245Matcher = f59665.matcher((CharSequence) C2288.m7760(i));
                    if (i < 26040000) {
                        i23 = 26040000;
                        int iM31615 = (C0773.m3169("֫֡") + i10) * 33;
                        i4 = ((iM31615 ^ i11) * (-22173)) ^ (-1366491426);
                        i14 = i14;
                        i13 = iM31615 ^ (-442897147);
                        i12 = i4;
                    } else {
                        int iM31616 = (i11 - C0773.m3169("۫ܰ")) * (-45);
                        i12 = ((iM31616 ^ i10) * 20365) ^ (-87768834);
                        i8 = iM31616 ^ (-1830464339);
                        i14 = i14;
                        i23 = 26040000;
                        i13 = i8;
                    }
                    break;
                case -1607957375:
                case 337743065:
                    return C1080.m4056(f59666, 80, 6, i16);
                case -1596350528:
                case 1022452493:
                    strM2824 = AbstractC0641.m2824(strGroup2, i15);
                    iM3169 = C0619.m2761("ᩳۨ") ^ i10;
                    i4 = ((iM3169 ^ i11) * (-20859)) ^ 1760618311;
                    i5 = -1486542336;
                    i13 = iM3169 ^ i5;
                    i12 = i4;
                    break;
                case -1561049258:
                case -1366388243:
                    i16 = 59087;
                    iM31610 = C0619.m2761("ۤ۬") ^ i11;
                    i12 = ((iM31610 ^ i10) * 20459) ^ (-1990262742);
                    i6 = -831497256;
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i212 = i14;
                    i13 = i7;
                    i14 = i212;
                    break;
                case -774054946:
                case -346256553:
                    return C2288.m7760(i);
                case -616234566:
                case -457244740:
                    C3033.m9845();
                    return null;
                case -509845613:
                case -382680720:
                    return ExternalValue$$ExternalSyntheticOutline0.m(strM13650, strGroup, C3033.m9847(sArr3, 89, 1, i16), strM2824);
                case -383991659:
                case -196179996:
                    C0862.m3503();
                    C3448.m11248();
                    i14 = i14;
                    i23 = i23;
                    iM31610 = C0619.m2761("᩵ۡ") ^ i11;
                    i12 = ((iM31610 ^ i10) * 17981) ^ 2014357;
                    i6 = -2095792080;
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i213 = i14;
                    i13 = i7;
                    i14 = i213;
                    break;
                case -344606498:
                case 1218002270:
                    i14 = i14;
                    c4245 = c4245Matcher;
                    if (!c4245.matches()) {
                        c4245Matcher = c4245;
                        int iM31617 = (C0773.m3169("֫֡") + i10) * 33;
                        i4 = ((iM31617 ^ i11) * (-22173)) ^ (-1366491426);
                        i14 = i14;
                        i13 = iM31617 ^ (-442897147);
                        i12 = i4;
                    } else {
                        iM2761 = C0619.m2761("ۨۚ") ^ i11;
                        i2 = ((iM2761 ^ i10) * (-4067)) ^ 2065536287;
                        i3 = -1386155719;
                        i7 = iM2761 ^ i3;
                        c4245Matcher = c4245;
                        i12 = i2;
                        int i214 = i14;
                        i13 = i7;
                        i14 = i214;
                    }
                    break;
                case -237465950:
                case -122289963:
                    if (C2375.m8065() > 0) {
                        i14 = i14;
                        i23 = i23;
                        iM31610 = C0773.m3169("᩸ᩳ") ^ i11;
                        i12 = ((iM31610 ^ i10) * (-4399)) ^ (-414077165);
                        i6 = 824977809;
                        i7 = iM31610 ^ i6;
                        i23 = i23;
                        int i215 = i14;
                        i13 = i7;
                        i14 = i215;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ֫") ^ i10) * (-67);
                        i4 = ((iM3169 ^ i11) * (-3047)) ^ 2098113830;
                        i5 = 579806716;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    }
                    break;
                case -236608377:
                case 1769840108:
                    RunnableC3646.m11813();
                    if (C2878.m9491() > 0) {
                        iM3169 = (C0619.m2761("ᩳ֫") ^ i10) * (-67);
                        i4 = ((iM3169 ^ i11) * (-3047)) ^ 2098113830;
                        i5 = 579806716;
                        i13 = iM3169 ^ i5;
                        i12 = i4;
                    } else {
                        i14 = i14;
                        i23 = i23;
                        iM31610 = C0619.m2761("᩵ۡ") ^ i11;
                        i12 = ((iM31610 ^ i10) * 17981) ^ 2014357;
                        i6 = -2095792080;
                        i7 = iM31610 ^ i6;
                        i23 = i23;
                        int i216 = i14;
                        i13 = i7;
                        i14 = i216;
                    }
                    break;
                case 138554525:
                case 1900945263:
                    i14 = i14;
                    i23 = i23;
                    c = 'O';
                    if (C3779.f12953 <= 0) {
                        iM31610 = C0773.m3169("᩸ᩳ") ^ i11;
                        i12 = ((iM31610 ^ i10) * (-4399)) ^ (-414077165);
                        i6 = 824977809;
                    } else {
                        iM31610 = C0773.m3169("۟ۜ") ^ i11;
                        i12 = ((iM31610 ^ i10) * (-11215)) ^ (-2105351721);
                        i6 = 1325670008;
                    }
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i217 = i14;
                    i13 = i7;
                    i14 = i217;
                    break;
                case 391528227:
                case 904676746:
                    i14 = i14;
                    i23 = i23;
                    s = sArr4[c];
                    s2 = 10268;
                    if (C13473.f42873 != 0) {
                        iM31610 = C0773.m3169("᩸ᩳ") ^ i11;
                        i12 = ((iM31610 ^ i10) * (-4399)) ^ (-414077165);
                        i6 = 824977809;
                    } else {
                        iM31610 = C0773.m3169("᩺ۖ") ^ i10;
                        i12 = ((iM31610 ^ i11) * (-17427)) ^ 1993819258;
                        i6 = -1415485159;
                    }
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i218 = i14;
                    i13 = i7;
                    i14 = i218;
                    break;
                case 630939127:
                case 1642386494:
                    i14 = i14;
                    i23 = i23;
                    C4245 c4246 = c4245Matcher;
                    if (i >= i23) {
                        int iM31618 = C0773.m3169("ܳۜ") ^ i11;
                        c4245Matcher = c4246;
                        i12 = ((iM31618 ^ i10) * 22335) ^ 363185407;
                        i14 = i14;
                        i13 = iM31618 ^ (-1290889256);
                        i23 = i23;
                    } else {
                        c4245Matcher = c4246;
                        int iM2764 = C0619.m2761("ᩴ᩺") ^ i10;
                        int i34 = ((iM2764 ^ i11) * 12371) ^ 73484103;
                        int i35 = iM2764 ^ (-1964572030);
                        i23 = i23;
                        i12 = i34;
                        i14 = i14;
                        i13 = i35;
                    }
                    break;
                case 1123722644:
                case 2064618250:
                    i14 = i14;
                    i23 = i23;
                    if (i21 - (i22 + i20) > 0) {
                        iM31610 = C0773.m3169("ᩳ᩺") ^ i11;
                        i12 = ((iM31610 ^ i10) * 31159) ^ 1712240666;
                        i6 = 276480471;
                    } else {
                        iM31610 = C0619.m2761("֨ۛ") ^ i10;
                        i12 = ((iM31610 ^ i11) * (-1051)) ^ 1666029643;
                        i6 = -2075988133;
                    }
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i219 = i14;
                    i13 = i7;
                    i14 = i219;
                    break;
                default:
                    i16 = 33747;
                    iM31610 = C0619.m2761("ۤ۬") ^ i11;
                    i12 = ((iM31610 ^ i10) * 20459) ^ (-1990262742);
                    i6 = -831497256;
                    i7 = iM31610 ^ i6;
                    i23 = i23;
                    int i2110 = i14;
                    i13 = i7;
                    i14 = i2110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03ab A[PHI: r10 r19 r22
      0x03ab: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:106:0x03a9, B:94:0x0321, B:86:0x02c8, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r19v30 ??) = (r19v79 ??), (r19v80 ??), (r19v81 ??), (r19v33 ??) binds: [B:106:0x03a9, B:94:0x0321, B:86:0x02c8, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r22v22 java.lang.String) = (r22v2 java.lang.String), (r22v5 java.lang.String), (r22v7 java.lang.String), (r22v23 java.lang.String) binds: [B:106:0x03a9, B:94:0x0321, B:86:0x02c8, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x03e1 A[PHI: r8 r14 r19 r22
      0x03e1: PHI (r8v3 short[]) = (r8v2 short[]), (r8v1 short[]), (r8v1 short[]) binds: [B:110:0x03df, B:74:0x0260, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r14v3 int) = (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:110:0x03df, B:74:0x0260, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r19v36 ??) = (r19v77 ??), (r19v78 ??), (r19v41 ??) binds: [B:110:0x03df, B:74:0x0260, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r22v24 java.lang.String) = (r22v1 java.lang.String), (r22v11 java.lang.String), (r22v25 java.lang.String) binds: [B:110:0x03df, B:74:0x0260, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ed A[PHI: r9 r12 r13 r19 r22
      0x02ed: PHI (r9v3 char) = (r9v2 char), (r9v1 char), (r9v1 char) binds: [B:90:0x02eb, B:78:0x0285, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:90:0x02eb, B:78:0x0285, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:90:0x02eb, B:78:0x0285, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r19v28 ??) = (r19v82 ??), (r19v83 ??), (r19v29 ??) binds: [B:90:0x02eb, B:78:0x0285, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r22v20 java.lang.String) = (r22v6 java.lang.String), (r22v10 java.lang.String), (r22v21 java.lang.String) binds: [B:90:0x02eb, B:78:0x0285, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0344 A[PHI: r11 r19 r22
      0x0344: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:98:0x0342, B:82:0x02a7] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r19v14 ??) = (r19v85 ??), (r19v86 ??) binds: [B:98:0x0342, B:82:0x02a7] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r22v8 java.lang.String) = (r22v4 java.lang.String), (r22v9 java.lang.String) binds: [B:98:0x0342, B:82:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (l.C2485.f7950 != 0) goto L26;
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
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v41 */
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
    /* JADX WARN: Type inference failed for: r19v7 */
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
    /* JADX WARN: Type inference failed for: r19v8 */
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
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String, l.᩸ܽܺ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C22941 m42645() {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18300.m42645():l.᩸ܽܺ");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m42687() {
        PluginContext pluginContextM42678 = null;
        String str = null;
        String strM3508 = null;
        int i = -906194600;
        int i2 = C2288.f7433;
        int i3 = C2310.f7472;
        int iM3169 = (C0773.m3169("᩺᩷") + i3) * (-115);
        int i4 = ((iM3169 ^ i2) * 22265) ^ (-1102342222);
        int i5 = -1287225592;
        while (true) {
            i = ((((i ^ i2) * (-27365)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2112007731:
                case -1108557198:
                    return strM3508;
                case -2070435692:
                case -1841414582:
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15921)) ^ (-1351447069);
                        i5 = -1343678214;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷ܰ")) * (-33);
                        i4 = ((iM3169 ^ i3) * (-23985)) ^ 2132845044;
                        i5 = 1532443672;
                    }
                    break;
                case -2011853991:
                case -672331928:
                    return str;
                case -1881664963:
                case 752607391:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-10533)) ^ (-746481223);
                        i5 = -211004489;
                    } else {
                        iM3169 = (C0773.m3169("ܺۙ") ^ i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-26863)) ^ (-1196389185);
                        i5 = -389416764;
                    }
                    break;
                case -1872406729:
                case 91473537:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩻") + i3) * (-49);
                        i4 = ((iM3169 ^ i2) * 17937) ^ (-926652795);
                        i5 = -602525818;
                    } else {
                        iM3169 = (C0619.m2761("ۖۢ") ^ i2) * 29;
                        i4 = ((iM3169 ^ i3) * (-873)) ^ 1954929266;
                        i5 = -1477373447;
                    }
                    break;
                case -1858575921:
                case -117068629:
                    if (C1146.m4221(1, str) == '}') {
                        iM3169 = C0773.m3169("ܽ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28777) ^ 721045799;
                        i5 = 2087691729;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15325)) ^ (-1536410371);
                        i5 = 31449841;
                    }
                    break;
                case -1436724140:
                case -653163541:
                    strM3508 = C0862.m3508((C20889) pluginContextM42678, str);
                    if (strM3508 != null) {
                        iM3169 = (C0773.m3169("ܽ᩻") ^ i2) * (-123);
                        i4 = ((iM3169 ^ i3) * 30253) ^ 303041441;
                        i5 = 2143506557;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15325)) ^ (-1536410371);
                        i5 = 31449841;
                    }
                    break;
                case -1432201628:
                case 961741832:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("᩹ܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-24351)) ^ 1054057180;
                        i5 = -417315270;
                    } else {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-12779)) ^ 542135947;
                        i5 = 1619798029;
                    }
                    break;
                case -1286131512:
                case 914811426:
                    if (C0950.m3785() != 0) {
                        iM3169 = (C0619.m2761("ۨ᩻") + i3) * (-49);
                        i4 = ((iM3169 ^ i2) * 17937) ^ (-926652795);
                        i5 = -602525818;
                    } else {
                        iM3169 = C0619.m2761("ܳ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3475)) ^ (-974474850);
                        i5 = -366103490;
                    }
                    break;
                case -944567887:
                case 9818686:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۨ᩻") + i3) * (-49);
                        i4 = ((iM3169 ^ i2) * 17937) ^ (-926652795);
                        i5 = -602525818;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-24351)) ^ 1054057180;
                        i5 = -417315270;
                    }
                    break;
                case -788931918:
                case 785928275:
                    if (C4282.m13656(str, 0) == '{') {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23789)) ^ 194226372;
                        i5 = -1688948718;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15325)) ^ (-1536410371);
                        i5 = 31449841;
                    }
                    break;
                case -601102254:
                case 876401102:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("᩹ܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-24351)) ^ 1054057180;
                        i5 = -417315270;
                    } else {
                        iM3169 = C0773.m3169("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15921)) ^ (-1351447069);
                        i5 = -1343678214;
                    }
                    break;
                case -444894989:
                case 56954906:
                    C4282.m13644();
                    if (C3492.f12043 > 0) {
                        iM3169 = (C0773.m3169("᩺ᩴ") ^ i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-29251)) ^ 703383337;
                        i5 = -2090888199;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-24351)) ^ 1054057180;
                        i5 = -417315270;
                    }
                    break;
                case -360264362:
                case 487890902:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("᩺ᩴ") ^ i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-29251)) ^ 703383337;
                        i5 = -2090888199;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23883) ^ 1982845281;
                        i5 = 1423410106;
                    }
                    break;
                case -260192625:
                case 1968058774:
                    pluginContextM42678 = m42678();
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("᩺ᩴ") ^ i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-29251)) ^ 703383337;
                        i5 = -2090888199;
                    } else {
                        iM3169 = C0773.m3169("۟ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11561)) ^ (-2117287056);
                        i5 = 2089845117;
                    }
                    break;
                case -201340430:
                case 860116635:
                    if (C3077.m10045(str) >= 3) {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18325) ^ (-2026988897);
                        i5 = -1297561875;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15325)) ^ (-1536410371);
                        i5 = 31449841;
                    }
                    break;
                case 101416810:
                case 881286391:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-10533)) ^ (-746481223);
                        i5 = -211004489;
                    } else {
                        iM3169 = C0619.m2761("ۚᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8355) ^ 1692484332;
                        i5 = 1180152500;
                    }
                    break;
                case 725494296:
                case 2044446905:
                    RunnableC3646.m11813();
                    C0773.m3161();
                    return null;
                case 785499679:
                case 1098495096:
                    C1783.m6232();
                    iM3169 = C0773.m3169("ۖܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-15921)) ^ (-1351447069);
                    i5 = -1343678214;
                    break;
                case 1008688063:
                case 2077005709:
                    str = this.f59684;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-10533)) ^ (-746481223);
                        i5 = -211004489;
                    } else {
                        iM3169 = C0773.m3169("᩵᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27211)) ^ (-1062190007);
                        i5 = 1360346978;
                    }
                    break;
                default:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-10533)) ^ (-746481223);
                        i5 = -211004489;
                    } else {
                        iM3169 = (C0619.m2761("ۚۡ") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * 16347) ^ (-1330566117);
                        i5 = -1173062087;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42654(Throwable th) {
        PluginContext pluginContextM42678 = null;
        int i = 1312306111;
        int i2 = C3099.f10023;
        int i3 = C2288.f7433;
        int iM2761 = C0619.m2761("᩶᩵") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-25727)) ^ (-438437204);
        int i5 = 139794589;
        while (true) {
            i = ((((i ^ i3) * (-14271)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2106703534:
                case 1145830191:
                    C3077.m10041();
                    break;
                case -2069888083:
                case -1146519235:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4089)) ^ 2112959614;
                        i5 = -421794221;
                    }
                    break;
                case -2014761331:
                case 1663593333:
                    C0862.m3503();
                    if (C4238.m13540() > 0) {
                        iM2761 = C0773.m3169("ܶܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9803)) ^ (-1872060379);
                        i5 = -396214112;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    }
                    break;
                case -1983482674:
                case 1681249807:
                    pluginContextM42678 = m42678();
                    if (RunnableC3646.f12471) {
                        iM2761 = (i3 - C0773.m3169("֡ᩴ")) * (-61);
                        i4 = ((iM2761 ^ i2) * 19367) ^ 866622572;
                        i5 = 1648155533;
                    } else {
                        iM2761 = C0619.m2761("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3275)) ^ (-522885307);
                        i5 = 467910641;
                    }
                    break;
                case -1798003514:
                case -1098240073:
                    if (RunnableC1848.m6360()) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰ᩻")) * (-87);
                        i4 = ((iM2761 ^ i2) * (-15659)) ^ 336708759;
                        i5 = 62802554;
                    }
                    break;
                case -1781064296:
                case -1569729221:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = (C0619.m2761("ܶۤ") ^ i2) * 41;
                        i4 = ((iM2761 ^ i3) * (-20825)) ^ 138092369;
                        i5 = 1691012515;
                    }
                    break;
                case -1731668390:
                case 2041660169:
                    ((C20889) pluginContextM42678).log(th);
                    break;
                case -1682665362:
                case 1526457635:
                    if (!RunnableC1848.m6360()) {
                        iM2761 = C0619.m2761("ۨ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16269)) ^ (-436150967);
                        i5 = -440665792;
                    } else {
                        iM2761 = C0773.m3169("ܶܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9803)) ^ (-1872060379);
                        i5 = -396214112;
                    }
                    break;
                case -1460938674:
                case 2032339251:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = C0619.m2761("֫ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5131) ^ 1805071856;
                        i5 = -778815328;
                    }
                    break;
                case -1339007770:
                case -646819372:
                    RunnableC0334.m2063();
                    iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                    i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                    i5 = -956822676;
                    break;
                case -376736503:
                case 1832249523:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16269)) ^ (-436150967);
                        i5 = -440665792;
                    } else {
                        iM2761 = (C0773.m3169("᩷ᩳ") + i3) * 67;
                        i4 = ((iM2761 ^ i2) * (-12867)) ^ (-1311888892);
                        i5 = 347482277;
                    }
                    break;
                case 2445193:
                case 1106013323:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ܶܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9803)) ^ (-1872060379);
                        i5 = -396214112;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܿ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 31199) ^ (-1080288001);
                        i5 = -2111049958;
                    }
                    break;
                case 210323849:
                case 1710454333:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = C0773.m3169("ܰۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30473) ^ (-1593847659);
                        i5 = -1311151581;
                    }
                    break;
                case 1342483620:
                case 1736410988:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("᩸᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11235) ^ 17671322;
                        i5 = 989046835;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16269)) ^ (-436150967);
                        i5 = -440665792;
                    }
                    break;
                case 1654791605:
                case 1769584670:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ܶܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9803)) ^ (-1872060379);
                        i5 = -396214112;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۬ۢ")) * (-13);
                        i4 = ((iM2761 ^ i2) * (-13099)) ^ (-1983877713);
                        i5 = -1166623112;
                    }
                    break;
                default:
                    if (C3492.m11488()) {
                        iM2761 = (i3 - C0773.m3169("֫ۖ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-13299)) ^ 1144136485;
                        i5 = -956822676;
                    } else {
                        iM2761 = (C0773.m3169("ܽܺ") ^ i2) * (-113);
                        i4 = ((iM2761 ^ i3) * (-22053)) ^ 1122480341;
                        i5 = 1497023030;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01df A[PHI: r3 r6 r16
      0x01df: PHI (r3v4 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:58:0x01dd, B:50:0x0197, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:58:0x01dd, B:50:0x0197, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r16v22 l.᩷ۨᩴ) = (r16v5 l.᩷ۨᩴ), (r16v7 l.᩷ۨᩴ), (r16v25 l.᩷ۨᩴ) binds: [B:58:0x01dd, B:50:0x0197, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0232 A[PHI: r7 r9 r16
      0x0232: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:66:0x0230, B:46:0x0170, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r9v5 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:66:0x0230, B:46:0x0170, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r16v23 l.᩷ۨᩴ) = (r16v3 l.᩷ۨᩴ), (r16v8 l.᩷ۨᩴ), (r16v24 l.᩷ۨᩴ) binds: [B:66:0x0230, B:46:0x0170, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x025c A[PHI: r1 r2 r4 r5 r10 r16
      0x025c: PHI (r1v5 short[]) = (r1v2 short[]), (r1v2 short[]), (r1v2 short[]), (r1v8 short[]) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char), (r2v2 char) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v26 l.᩷ۨᩴ) = (r16v4 l.᩷ۨᩴ), (r16v6 l.᩷ۨᩴ), (r16v16 l.᩷ۨᩴ), (r16v29 l.᩷ۨᩴ) binds: [B:62:0x0213, B:54:0x01bc, B:27:0x0095, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (l.C2310.f7472 < 0) goto L19;
     */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC22044 m42671() {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18300.m42671():l.᩷ۨᩴ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C8114 m42640(C18300 c18300) {
        c18300.m42645();
        return new C8114(c18300);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42668() {
        int i = -1988729756;
        int i2 = C3033.f9831;
        int i3 = C1542.f5343;
        int iM3169 = (C0773.m3169("᩻ۚ") ^ i3) * (-71);
        int i4 = ((iM3169 ^ i2) * (-15217)) ^ (-62832201);
        int i5 = 627528755;
        while (true) {
            i = ((((i ^ i2) * (-2981)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2135983216:
                case -219627501:
                    C13473.m33144();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0773.m3169("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24783) ^ 894090463;
                        i5 = 1989227583;
                    } else {
                        iM3169 = C0619.m2761("۫۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6573) ^ 868232411;
                        i5 = -79197746;
                    }
                    break;
                case -2132054520:
                case -1066769344:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-31621)) ^ 1666291810;
                        i5 = 1461897460;
                    } else {
                        iM3169 = C0773.m3169("ۢ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27851) ^ 1423430879;
                        i5 = -11596032;
                    }
                    break;
                case -1864267570:
                case 1886681455:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (i3 - C0619.m2761("ܶ᩵")) * (-97);
                        i4 = ((iM3169 ^ i2) * 26043) ^ (-1184818048);
                        i5 = -1061410592;
                    } else {
                        iM3169 = C0619.m2761("ᩴ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14321)) ^ (-49915505);
                        i5 = 1499768036;
                    }
                    break;
                case -1808133326:
                case -926617932:
                    C3448.m11248();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24783) ^ 894090463;
                        i5 = 1989227583;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۘ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * (-23053)) ^ 616222693;
                        i5 = -434663179;
                    }
                    break;
                case -1523836945:
                case -882267614:
                    if (this.f59680) {
                        iM3169 = C0773.m3169("ۗۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25319)) ^ 1678229036;
                        i5 = -703206282;
                    } else {
                        iM3169 = C0619.m2761("۫ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3631)) ^ (-294121205);
                        i5 = 1170839403;
                    }
                    break;
                case -1324048488:
                case -741281769:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-31621)) ^ 1666291810;
                        i5 = 1461897460;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩷") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 31899) ^ 1684360507;
                        i5 = -157121488;
                    }
                    break;
                case -1244831770:
                case 1934793754:
                    C0950.m3785();
                    C3734.m12152();
                    return false;
                case -1238494446:
                case -334831323:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24783) ^ 894090463;
                        i5 = 1989227583;
                    } else {
                        iM3169 = C0619.m2761("ۨۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8561) ^ 1265469489;
                        i5 = -1425144803;
                    }
                    break;
                case -392484387:
                case 268852784:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-31621)) ^ 1666291810;
                        i5 = 1461897460;
                    } else {
                        iM3169 = C0773.m3169("ۘܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5947) ^ (-1864896932);
                        i5 = -51504399;
                    }
                    break;
                case -351550566:
                case 212372200:
                    return false;
                case -295894667:
                case 322101763:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i3 - C0619.m2761("ܶ᩵")) * (-97);
                        i4 = ((iM3169 ^ i2) * 26043) ^ (-1184818048);
                        i5 = -1061410592;
                    } else {
                        iM3169 = (C0773.m3169("۠ۚ") ^ i3) * 9;
                        i4 = ((iM3169 ^ i2) * (-27265)) ^ 859104537;
                        i5 = 826666345;
                    }
                    break;
                case -251170112:
                case 1154677581:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("᩵ۘ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * (-23053)) ^ 616222693;
                        i5 = -434663179;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۜ") + i3) * (-95);
                        i4 = ((iM3169 ^ i2) * (-11805)) ^ (-681299743);
                        i5 = 1922185736;
                    }
                    break;
                case -248919046:
                case 1826681796:
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("۬᩷") + i3) * 101;
                        i4 = ((iM3169 ^ i2) * 4617) ^ 476514043;
                        i5 = 632757337;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶ᩵")) * (-97);
                        i4 = ((iM3169 ^ i2) * 26043) ^ (-1184818048);
                        i5 = -1061410592;
                    }
                    break;
                case 48341669:
                case 224895389:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩵ۘ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * (-23053)) ^ 616222693;
                        i5 = -434663179;
                    } else {
                        iM3169 = C0619.m2761("֨ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13461) ^ 475370876;
                        i5 = 519396972;
                    }
                    break;
                case 132047914:
                case 470641738:
                    return true;
                case 240339653:
                case 345732869:
                    if (C0487.m2356() < 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-31621)) ^ 1666291810;
                        i5 = 1461897460;
                    } else {
                        iM3169 = C0773.m3169("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24783) ^ 894090463;
                        i5 = 1989227583;
                    }
                    break;
                case 969479484:
                case 1183220710:
                    if (this.f59670 != null) {
                        iM3169 = (i3 - C0773.m3169("ۘܺ")) * 65;
                        i4 = ((iM3169 ^ i2) * 2403) ^ (-1496196416);
                        i5 = -1505430688;
                    } else {
                        iM3169 = C0619.m2761("۫ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3631)) ^ (-294121205);
                        i5 = 1170839403;
                    }
                    break;
                case 1072937770:
                case 1582057860:
                    C11235.m28309();
                    iM3169 = (C0773.m3169("᩵ۘ") ^ i2) * (-41);
                    i4 = ((iM3169 ^ i3) * (-23053)) ^ 616222693;
                    i5 = -434663179;
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24783) ^ 894090463;
                        i5 = 1989227583;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩸") + i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 32727) ^ (-2588301);
                        i5 = 1075624509;
                    }
                    break;
            }
        }
    }

    static {
        ApplicationC23172.m52091(133);
        f59666 = new short[]{3176, 5869, 5879, 5790, 5875, 5864, 5884, 5784, 5817, 5790, 5878, 5873, 5784, 5790, 5877, 5864, 5884, 5784, 5868, 5869, 5877, 5790, 5876, 5864, 5884, 5784, 5817, 5876, 5790, 5877, 5864, 5879, 5784, 5868, 5869, 5877, 5790, 5876, 5864, 5884, 5784, 5817, 5790, 5876, 5879, 5784, 5790, 5877, 5864, 5884, 5784, 5817, 5878, 5790, 5877, 5864, 5876, 5784, 5868, 5869, 5790, 5877, 5864, 5884, 5784, 5790, 5877, 5864, 5884, 5784, 5868, 7287, 5436, 5422, 5422, 5432, 5417, 5422, 5490, 7259, -6403, -6431, -6403, -6407, -6431, -6404, -6401, -6403, -6431, -6431, 9267, 28943, 29026, 29051, 29071, 28932, 29052, 29035, 29028, 28943, 28957, 28932, 29038, 28993, 29003, 29021, 28992, 28998, 29003, 28943, 29038, 28993, 29003, 29021, 28992, 28998, 29003, 29071, 28943, 28943, 2352, 17942, 17937, 17931, 17946, 17933, 17945, 17950, 17948, 17946, 17932, 17946, 17937, 17950, 17949, 17939, 17946, 17938, 17947, 17994, 17942, 17937, 17932, 17931, 17950, 17939, 17939, 17977, 17933, 17936, 17938, 17980, 17946, 17937, 17931, 17946, 17933, 957, 21560, 21567, 21541, 21556, 21539, 21559, 21552, 21554, 21556, 21538, 3519, -11715, -11726, -11721, -11714, -11736, 2994, -1768, -1788, -1763, -1777, -1791, -1786, -1722, -1787, -1764, -1768, 8508, 19848, 19842, 19854, 19855, 19919, 19862, 19844, 19843, 19857, 19848, 19842, 19854, 19855, 19919, 19857, 19855, 19846, 19848, 19842, 19854, 19855, 19919, 19851, 19857, 19846, 6658, -13558, -13546, -13553, -13539, -13549, -13548, -13527, -13538, -13551, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13558, -13546, -13553, -13539, -13549, -13548, -13527, -13538, -13551, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13478, -13498, -13497, -13478, -13494, -13558, -13546, -13553, -13539, -13549, -13548, -13517, -13506, -13556, -13537, -13560, -13559, -13549, -13547, -13548, -13511, -13547, -13538, -13537, -13556, -13537, -13560, -13559, -13549, -13547, -13548, -13511, -13547, -13538, -13537, -13478, -13498, -13497, -13478, -13494, -13556, -13537, -13560, -13559, -13549, -13547, -13548, -13516, -13541, -13545, -13537, -13548, -13541, -13545, -13537, -13538, -13537, -13559, -13543, -13560, -13549, -13558, -13554, -13549, -13547, -13548, -13545, -13541, -13549, -13548, -13526, -13560, -13537, -13540, -13537, -13560, -13537, -13548, -13543, -13537, -13545, -13549, -13548, -13518, -13547, -13559, -13554, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13545, -13549, -13548, -13509, -13548, -13538, -13560, -13547, -13549, -13538, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13538, -13537, -13566, -13513, -13547, -13538, -13537, -13545, -13549, -13548, -13518, -13547, -13559, -13554, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13478, -13498, -13478, -13494, -13554, -13537, -13559, -13554, -13515, -13548, -13546, -13565, -13545, -13549, -13548, -13509, -13548, -13538, -13560, -13547, -13549, -13538, -13524, -13537, -13560, -13559, -13549, -13547, -13548, -13478, -13498, -13478, -13494, 5036, 10747, 10751, 10744, 10711, 10744, 10738, 10724, 10745, 10751, 10738, 10688, 10739, 10724, 10725, 10751, 10745, 10744, 10747, 10751, 10744, 10718, 10745, 10725, 10722, 10688, 10739, 10724, 10725, 10751, 10745, 10744, 10726, 10746, 10723, 10737, 10751, 10744, 10693, 10738, 10749, 10688, 10739, 10724, 10725, 10751, 10745, 10744, 10726, 10746, 10723, 10737, 10751, 10744, 10719, 10706, 10720, 10739, 10724, 10725, 10751, 10745, 10744, 10709, 10745, 10738, 10739, 10720, 10739, 10724, 10725, 10751, 10745, 10744, 10712, 10743, 10747, 10739, 10744, 10743, 10747, 10739, 10738, 10739, 10725, 10741, 10724, 10751, 10726, 10722, 10751, 10745, 10744, 10751, 10744, 10722, 10739, 10724, 10736, 10743, 10741, 10739, 10725, 10747, 10743, 10751, 10744, 10694, 10724, 10739, 10736, 10739, 10724, 10739, 10744, 10741, 10739, 10739, 10744, 10743, 10740, 10746, 10739, 10747, 10738, 10659, 10738, 10739, 10734, 10715, 10745, 10738, 10739, 10722, 10739, 10725, 10722, 10713, 10744, 10746, 10735, 10751, 10744, 10725, 10722, 10743, 10746, 10746, 10704, 10724, 10745, 10747, 10709, 10739, 10744, 10722, 10739, 10724, 7044, 16984, 16943, 16938, 16938, 16948, 16983, 17020, 17009, 17015, 17023, 16983, 17016, 17013, 16999, 16999, 16978, 17013, 17021, 17016, 16942, 16948, 5149, 12880, 15687, 6271, 6791, 15434, 16938, 16938, 16948, 16960, 16998, 17013, 17018, 16999, 17016, 17013, 16992, 17021, 17019, 17018, 16977, 17018, 17011, 17021, 17018, 17009, 16942, 16948, 16938, 16938, 16948, 16967, 17020, 17019, 16993, 17016, 17008, 16982, 17009, 16964, 17016, 16993, 17011, 17021, 17018, 16964, 16998, 17009, 17010, 17009, 16998, 17009, 17018, 17015, 17009, 16942, 16948, 4710, -12961, -16080, 16938, 16938, 16948, 16960, 17009, 17004, 16992, 16977, 17008, 17021, 16992, 17019, 16998, 16978, 16993, 17018, 17015, 16992, 17021, 17019, 17018, 16942, 16948, 16938, 16938, 16948, 16960, 17009, 17004, 16992, 16977, 17008, 17021, 16992, 17019, 16998, 16978, 17016, 17019, 17013, 16992, 17021, 17018, 17011, 16985, 17009, 17018, 16993, 16942, 16948, 16938, 16938, 16948, 16961, 17018, 17023, 17018, 17019, 16995, 17018, 16989, 17018, 16992, 17009, 16998, 17010, 17013, 17015, 17009, 16942, 16948, 10407, -11381, 8707, 16938, 16938, 16948, 16960, 17009, 17004, 16992, 16977, 17008, 17021, 16992, 17019, 16998, 16960, 17019, 17019, 17016, 16985, 17009, 17018, 16993, 16942, 16948, 5079, 10151, 10155, 10144, 10145, 28771, 18297, 30635, 10151, 10155, 10144, 10145, 10139, 10164, 10149, 10160, 10151, 10156, 10151, 10155, 10144, 10145, 10151, 10155, 10144, 10145, 10139, 10164, 10149, 10160, 10151, 10156, 10151, 10155, 10144, 10145, 10164, 10152, 10161, 10147, 10157, 10154, 10218, 10153, 10160, 10164, 10151, 10155, 10144, 10145, 10139, 10164, 10149, 10160, 10151, 10156, 10164, 10152, 10161, 10147, 10157, 10154, 10218, 10153, 10160, 10164, 3576, -16642, -16647, -16641, -16668, -16669, -16662, -16642, -16660, -16642, -16642, -16664, -16647, -16642, -16734, -16642, -16647, -16641, -16668, -16669, -16662, -16642, -16733, -16672, -16647, -16671, -16660, -16642, -16642, -16664, -16647, -16642, -16734, -16674, -16647, -16641, -16668, -16669, -16662, -16733, -16672, -16647, -16671, -16674, -16647, -16641, -16668, -16669, -16662, 2803, 13606, -11519, -13035, 2365, 12150, 12138, 12147, 12129, 12143, 12136, 12072, 12139, 12146, 12150, 9307, 24981, 24969, 24976, 24962, 24972, 24971, 25035, 24968, 24977, 24981, 24966, 24964, 24966, 24973, 24960, 24966, 24969, 24964, 24982, 24982, 24960, 24982, 25035, 24961, 24960, 24989, 24970, 24981, 24977, 25044, 24970, 24981, 24977, 25047, 24970, 24981, 24977, 25047, 25001, 24970, 24964, 24961, 25029, 24963, 24964, 24972, 24969, 24960, 24961, 566, 20496, 20482, 20482, 20500, 20485, 20482, 20574, 20569, 20572, 20522, 20496, 20572, 20491, 20524, 20490, 20547, 20573, 20546, 20492, 20569, 20572, 20522, 20528, 20572, 20523, 20524, 20490, 20547, 20573, 20546, 20492, 20568, 20558, 20568, 20558, 20525, 20575, 20508, 20485, 20509};
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1349466715;
        int i8 = C3492.f12043;
        int i9 = C1783.f6087;
        int iM2761 = (C0619.m2761("ۡ֡") + i9) * (-27);
        int i10 = ((iM2761 ^ i8) * 20587) ^ 775626300;
        int i11 = 1062366695;
        while (true) {
            i7 = ((((i7 ^ i8) * (-9697)) >> 31) & i10) ^ (iM2761 ^ i11);
            switch (i7) {
                case -1760713490:
                case -1672864026:
                    if (C2834.f9334 > 0) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    } else {
                        iM2761 = C0773.m3169("ܿܺ") ^ i8;
                        i10 = ((iM2761 ^ i9) * 14073) ^ (-71201741);
                        i11 = 1954528099;
                    }
                    break;
                case -1584907386:
                case 1737080945:
                    AbstractC3624.m11755();
                    throw new RuntimeException();
                case -1542368687:
                case 158494398:
                    sArr2 = f59666;
                    i5 = 1;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    } else {
                        iM2761 = (C0773.m3169("᩻֫") + i8) * (-35);
                        i10 = ((iM2761 ^ i9) * 21967) ^ (-1365955195);
                        i11 = -229687474;
                    }
                    break;
                case -1375004589:
                case -1231507045:
                    i6 = 70;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    } else {
                        iM2761 = (i9 - C0619.m2761("֡֡")) * (-57);
                        i10 = ((iM2761 ^ i8) * (-14579)) ^ 663026097;
                        i11 = -854727492;
                    }
                    break;
                case -1217304602:
                case 168706336:
                    f59665 = C18415.m42925(C3448.m11252(sArr2, i5, i6, i4));
                    return;
                case -1089382362:
                case -674255579:
                    i3 = 1;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    } else {
                        iM2761 = (i9 - C0773.m3169("֫ᩴ")) * (-81);
                        i10 = ((iM2761 ^ i8) * (-8947)) ^ 383891234;
                        i11 = -1355517831;
                    }
                    break;
                case -1067562731:
                case 973605343:
                    i2 = s * 2;
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    } else {
                        iM2761 = C0619.m2761("ۧ۟") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-7561)) ^ (-1870226078);
                        i11 = -1002836684;
                    }
                    break;
                case -1054700239:
                case -73829633:
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("ۤ֡") ^ i9) * (-97);
                        i10 = ((iM2761 ^ i8) * 6461) ^ (-2044533916);
                        i11 = 2118279155;
                    } else {
                        iM2761 = C0773.m3169("ܿܺ") ^ i8;
                        i10 = ((iM2761 ^ i9) * 14073) ^ (-71201741);
                        i11 = 1954528099;
                    }
                    break;
                case -847755980:
                case 283781505:
                    C4282.m13644();
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("۫ۢ") + i8) * (-105);
                        i10 = ((iM2761 ^ i9) * (-7947)) ^ 2056336832;
                        i11 = 240936401;
                    } else {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i8) * (-117);
                        i10 = ((iM2761 ^ i9) * (-6209)) ^ 1111292816;
                        i11 = 1747747420;
                    }
                    break;
                case -768885094:
                case 714997850:
                    if ((i2 + i3) - i <= 0) {
                        iM2761 = C0619.m2761("ܿ᩻") ^ i9;
                        i10 = ((iM2761 ^ i8) * 6351) ^ (-230223708);
                        i11 = 1961073834;
                    } else {
                        iM2761 = (C0773.m3169("۟ۢ") ^ i8) * 115;
                        i10 = ((iM2761 ^ i9) * (-15613)) ^ 1800066748;
                        i11 = -390196580;
                    }
                    break;
                case -603257496:
                case 1854817273:
                    s2 = 1;
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i9) * (-61);
                        i10 = ((iM2761 ^ i8) * (-25251)) ^ 642327807;
                        i11 = -1649867985;
                    } else {
                        iM2761 = (C0773.m3169("֫֡") + i8) * 11;
                        i10 = ((iM2761 ^ i9) * (-29777)) ^ 1149755668;
                        i11 = -1873116217;
                    }
                    break;
                case -463568018:
                case 1213568606:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i9) * (-61);
                        i10 = ((iM2761 ^ i8) * (-25251)) ^ 642327807;
                        i11 = -1649867985;
                    } else {
                        iM2761 = (C0773.m3169("᩻ܽ") + i8) * 57;
                        i10 = ((iM2761 ^ i9) * 709) ^ (-696524090);
                        i11 = 2042945386;
                    }
                    break;
                case -431726202:
                case 522184002:
                    i4 = 18792;
                    iM2761 = C0773.m3169("ᩳᩳ") ^ i9;
                    i10 = ((iM2761 ^ i8) * (-26949)) ^ (-175262582);
                    i11 = 1128614184;
                    break;
                case -207122824:
                case 322162825:
                    sArr = f59666;
                    c = 0;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i9) * (-61);
                        i10 = ((iM2761 ^ i8) * (-25251)) ^ 642327807;
                        i11 = -1649867985;
                    } else {
                        iM2761 = (i9 - C0619.m2761("֡ܶ")) * 19;
                        i10 = ((iM2761 ^ i8) * (-2993)) ^ (-63498611);
                        i11 = -2108568274;
                    }
                    break;
                case 59223549:
                case 1944858486:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ۤ֡") ^ i9) * (-97);
                        i10 = ((iM2761 ^ i8) * 6461) ^ (-2044533916);
                        i11 = 2118279155;
                    } else {
                        iM2761 = C0773.m3169("ۧ᩹") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-8079)) ^ (-235822131);
                        i11 = 1537473253;
                    }
                    break;
                case 162310313:
                case 1054281280:
                    i4 = 5829;
                    iM2761 = C0773.m3169("ᩳᩳ") ^ i9;
                    i10 = ((iM2761 ^ i8) * (-26949)) ^ (-175262582);
                    i11 = 1128614184;
                    break;
                case 191206201:
                case 1745825798:
                    s = sArr[c];
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("֫᩷") ^ i9;
                        i10 = ((iM2761 ^ i8) * 18339) ^ (-1263982456);
                        i11 = -1774213454;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i9) * (-61);
                        i10 = ((iM2761 ^ i8) * (-25251)) ^ 642327807;
                        i11 = -1649867985;
                    }
                    break;
                case 1274676370:
                case 2093172715:
                    int i12 = s + s2;
                    i = i12 * i12;
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i9) * (-61);
                        i10 = ((iM2761 ^ i8) * (-25251)) ^ 642327807;
                        i11 = -1649867985;
                    } else {
                        iM2761 = (C0619.m2761("ܿۢ") ^ i9) * (-113);
                        i10 = ((iM2761 ^ i8) * 3067) ^ 497224684;
                        i11 = -23898290;
                    }
                    break;
                default:
                    C0950.m3785();
                    iM2761 = C0773.m3169("ܿܺ") ^ i8;
                    i10 = ((iM2761 ^ i9) * 14073) ^ (-71201741);
                    i11 = 1954528099;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x048b A[PHI: r5 r8 r11 r16 r18 r20 r21 r22 r23 r28 r29 r30
      0x048b: PHI (r5v4 java.lang.String) = (r5v1 java.lang.String), (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r8v5 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v6 short[]) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r18v6 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r20v6 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r21v29 int) = (r21v4 int), (r21v6 int), (r21v30 int) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r22v22 short[]) = (r22v5 short[]), (r22v7 short[]), (r22v23 short[]) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r23v25 java.lang.String) = (r23v5 java.lang.String), (r23v7 java.lang.String), (r23v26 java.lang.String) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r28v39 int) = (r28v19 int), (r28v21 int), (r28v40 int) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r29v31 short[]) = (r29v13 short[]), (r29v15 short[]), (r29v32 short[]) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x048b: PHI (r30v25 java.lang.String) = (r30v6 java.lang.String), (r30v8 java.lang.String), (r30v26 java.lang.String) binds: [B:84:0x0489, B:76:0x0402, B:31:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42639(int i, int i2, int i3) {
        short[] sArr;
        int iM2761;
        int i4;
        int i5;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int iM2762;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        String strM6233;
        int iM31610;
        int i13;
        int i14;
        String str3 = null;
        String strM10536 = null;
        String strM1785 = null;
        String strM11812 = null;
        int i15 = 0;
        int i16 = 434782133;
        int i17 = C1146.f4234;
        int i18 = C2834.f9334;
        int iM2763 = (C0619.m2761("۬ۘ") + i18) * 7;
        int i19 = ((iM2763 ^ i17) * (-23553)) ^ 1429892879;
        int i20 = iM2763 ^ 1432916293;
        String str4 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        StringBuilder sb = null;
        int i21 = 0;
        int i22 = 0;
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
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 28583) >> 31));
            switch (i16) {
                case -2041061766:
                case 918431320:
                    C0269.m1775();
                    RunnableC1848.m6360();
                    iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                    i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                    i8 = 2093846590;
                    i20 = iM3169 ^ i8;
                    i19 = i7;
                    i21 = i21;
                    break;
                case -1537084102:
                case -690608769:
                    i21 = i21;
                    str4 = str4;
                    i29 = i29;
                    strM10536 = strM10536;
                    short[] sArr7 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr7;
                    s = sArr4[90];
                    i27 = s * s;
                    if (C11235.f35427 >= 0) {
                        int iM2764 = (C0619.m2761("᩺ܿ") ^ i18) * 61;
                        i19 = ((iM2764 ^ i17) * (-9245)) ^ (-173921698);
                        strM10536 = strM10536;
                        i21 = i21;
                        i20 = iM2764 ^ 817258261;
                        i29 = i29;
                        str4 = str4;
                        sb = null;
                    } else {
                        iM2762 = C0773.m3169("ۜۙ") ^ i17;
                        i9 = ((iM2762 ^ i18) * 18131) ^ 1850685660;
                        i10 = 20934684;
                        i21 = i21;
                        i20 = iM2762 ^ i10;
                        i19 = i9;
                        strM10536 = strM10536;
                        i29 = i29;
                        str4 = str4;
                    }
                    short[] sArr8 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr8;
                    break;
                case -1528280044:
                case 107079534:
                    i21 = i21;
                    str4 = str4;
                    i29 = i29;
                    strM10536 = strM10536;
                    short[] sArr9 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr9;
                    int i31 = s + s2;
                    if ((i31 * i31) - i28 <= 0) {
                        iM2762 = C0619.m2761("ۤᩳ") ^ i17;
                        i9 = ((iM2762 ^ i18) * (-5165)) ^ (-1447306964);
                        i10 = 1613475835;
                    } else {
                        iM2762 = C0619.m2761("᩸᩶") ^ i18;
                        i9 = ((iM2762 ^ i17) * (-1493)) ^ (-121347301);
                        i10 = -1135753433;
                    }
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr10 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr10;
                    break;
                case -1497145139:
                case -629269055:
                    i21 = i21;
                    strM10536 = strM10536;
                    String str5 = str4;
                    sArr = sArr2;
                    C1783.m6234(sb, str5);
                    short[] sArr11 = f59666;
                    i30 = 1;
                    if (C4282.f15546 <= 0) {
                        sArr5 = sArr11;
                        str4 = str5;
                        i6 = 95;
                        int iM31611 = (C0773.m3169("ۛ᩷") ^ i17) * (-97);
                        int i32 = i21;
                        i20 = iM31611 ^ (-193998896);
                        i19 = ((iM31611 ^ i18) * (-10009)) ^ 230892166;
                        i21 = i32;
                        str = strM10536;
                        i29 = i6;
                        strM10536 = str;
                        short[] sArr12 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr12;
                    } else {
                        int iM2765 = (C0619.m2761("ܰ᩷") ^ i17) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i33 = ((iM2765 ^ i18) * (-22659)) ^ (-347836081);
                        int i34 = iM2765 ^ 941167985;
                        sArr2 = sArr;
                        sArr5 = sArr11;
                        i19 = i33;
                        strM10536 = strM10536;
                        i29 = 95;
                        str4 = str5;
                        i21 = i21;
                        i20 = i34;
                    }
                    break;
                case -1408308874:
                case -217629687:
                    sArr = sArr2;
                    i15 = 48722;
                    iM2762 = C0619.m2761("ۢ֨") ^ i17;
                    i9 = ((iM2762 ^ i18) * (-15917)) ^ 1320480757;
                    i10 = 1845140124;
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr13 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr13;
                    break;
                case -1320749725:
                case 1561212802:
                    i21 = i21;
                    str4 = str4;
                    i29 = i29;
                    strM10536 = strM10536;
                    short[] sArr14 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr14;
                    int i35 = i27 + 47141956;
                    i28 = i35 + i35;
                    s2 = 6866;
                    if (C0773.f2792 <= 0) {
                        iM2762 = C0773.m3169("֫᩹") ^ i18;
                        i9 = ((iM2762 ^ i17) * (-20353)) ^ (-2122235339);
                        i10 = 53131959;
                    } else {
                        iM2762 = (i18 - C0773.m3169("᩻֫")) * q.h;
                        i9 = ((iM2762 ^ i17) * (-13235)) ^ 914550944;
                        i10 = 293757524;
                    }
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr15 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr15;
                    break;
                case -957981267:
                case -430858098:
                    short[] sArr16 = sArr2;
                    strM1785 = C0269.m1785(sArr16, i22, i23, i15);
                    sArr3 = f59666;
                    i24 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    if (C2485.m8357() <= 0) {
                        str4 = str4;
                        sArr5 = sArr5;
                        i29 = i29;
                        i21 = 8;
                        sArr = sArr16;
                        strM10536 = strM10536;
                        iM2762 = C0773.m3169("֫᩹") ^ i18;
                        i9 = ((iM2762 ^ i17) * (-20353)) ^ (-2122235339);
                        i10 = 53131959;
                        i21 = i21;
                        i20 = iM2762 ^ i10;
                        i19 = i9;
                        strM10536 = strM10536;
                        i29 = i29;
                        str4 = str4;
                        short[] sArr17 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr17;
                    } else {
                        int iM31612 = C0773.m3169("᩹᩸") ^ i18;
                        sArr2 = sArr16;
                        i19 = ((iM31612 ^ i17) * (-10353)) ^ 1934241334;
                        i20 = iM31612 ^ 1539165109;
                        i21 = 8;
                    }
                    break;
                case -799931914:
                case 464785149:
                    sArr = sArr2;
                    i15 = 28975;
                    iM2762 = C0619.m2761("ۢ֨") ^ i17;
                    i9 = ((iM2762 ^ i18) * (-15917)) ^ 1320480757;
                    i10 = 1845140124;
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr18 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr18;
                    break;
                case -730560300:
                case 649550435:
                    C2354.m7983();
                    if (RunnableC3055.f9898 >= 0) {
                        i21 = i21;
                        int i36 = i29;
                        strM10536 = strM10536;
                        i6 = i36;
                        short[] sArr19 = sArr2;
                        sArr5 = sArr5;
                        sArr = sArr19;
                        int iM31613 = (C0773.m3169("ۛ᩷") ^ i17) * (-97);
                        int i37 = i21;
                        i20 = iM31613 ^ (-193998896);
                        i19 = ((iM31613 ^ i18) * (-10009)) ^ 230892166;
                        i21 = i37;
                        str = strM10536;
                        i29 = i6;
                        strM10536 = str;
                        short[] sArr110 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr110;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                        i20 = iM3169 ^ i8;
                        i19 = i7;
                        i21 = i21;
                    }
                    break;
                case -713447088:
                case -339538532:
                    i21 = i21;
                    String str6 = str4;
                    int i38 = i29;
                    strM10536 = strM10536;
                    short[] sArr20 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr20;
                    short[] sArr21 = f59666;
                    i29 = i38;
                    if (C1146.f4234 < 0) {
                        sb = new StringBuilder(AbstractC0641.m2820(sArr21, 91, 4, i15));
                        String strM42638 = m42638(i2);
                        if (C1519.f5300 >= 0) {
                            i6 = i29;
                            str4 = strM42638;
                            int iM31614 = (C0773.m3169("ۛ᩷") ^ i17) * (-97);
                            int i39 = i21;
                            i20 = iM31614 ^ (-193998896);
                            i19 = ((iM31614 ^ i18) * (-10009)) ^ 230892166;
                            i21 = i39;
                            str = strM10536;
                            i29 = i6;
                            strM10536 = str;
                        } else {
                            int iM2766 = C0619.m2761("᩶ܶ") ^ i18;
                            str4 = strM42638;
                            i19 = ((iM2766 ^ i17) * (-20399)) ^ (-218745602);
                            strM10536 = strM10536;
                            i29 = i29;
                            i20 = iM2766 ^ (-1791716463);
                            i21 = i21;
                        }
                        short[] sArr111 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr111;
                    } else {
                        str4 = str6;
                        int iM2767 = (C0619.m2761("᩺ܿ") ^ i18) * 61;
                        i19 = ((iM2767 ^ i17) * (-9245)) ^ (-173921698);
                        strM10536 = strM10536;
                        i21 = i21;
                        i20 = iM2767 ^ 817258261;
                        i29 = i29;
                        str4 = str4;
                        sb = null;
                        short[] sArr112 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr112;
                    }
                    break;
                case -712237038:
                case -437554006:
                    C2419.m8174();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ᩳܶ") ^ i18) * (-57);
                        i4 = ((iM2761 ^ i17) * 27063) ^ 1697709827;
                        i5 = -567151201;
                        i20 = iM2761 ^ i5;
                        i19 = i4;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                        i20 = iM3169 ^ i8;
                        i19 = i7;
                        i21 = i21;
                    }
                    break;
                case -706467807:
                case 1776291645:
                    return C17202.m40377(f59666, 96, 6, i15);
                case -605550668:
                case 2120390625:
                    i21 = i21;
                    str4 = str4;
                    i29 = i29;
                    strM10536 = strM10536;
                    short[] sArr22 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr22;
                    sArr4 = f59666;
                    if (C3077.m10041()) {
                        iM2762 = C0773.m3169("֫᩹") ^ i18;
                        i9 = ((iM2762 ^ i17) * (-20353)) ^ (-2122235339);
                        i10 = 53131959;
                    } else {
                        iM2762 = (i18 - C0619.m2761("ۙ۠")) * 79;
                        i9 = ((iM2762 ^ i17) * (-10865)) ^ (-1129829906);
                        i10 = -1582473384;
                    }
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr113 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr113;
                    break;
                case -578609256:
                case -343678255:
                    i21 = i21;
                    str4 = str4;
                    i29 = i29;
                    strM10536 = strM10536;
                    short[] sArr23 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr23;
                    if (i == 2) {
                        iM2762 = (i18 - C0619.m2761("۫᩶")) * (-5);
                        i9 = ((iM2762 ^ i17) * (-14409)) ^ (-1833474545);
                        i10 = -1502605402;
                    } else {
                        iM2762 = (C0619.m2761("ۨ᩺") ^ i17) * (-19);
                        i9 = ((iM2762 ^ i18) * 4349) ^ (-299114420);
                        i10 = 221972172;
                    }
                    i21 = i21;
                    i20 = iM2762 ^ i10;
                    i19 = i9;
                    strM10536 = strM10536;
                    i29 = i29;
                    str4 = str4;
                    short[] sArr114 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr114;
                    break;
                case -534883447:
                case 186715376:
                    C1783.m6234(sb, C3492.m11486(sArr6, i25, i26, i15));
                    C3779.m12258(sb, strM11812);
                    C1783.m6234(sb, str3);
                    i11 = i21;
                    String str7 = strM10536;
                    strM6233 = str3;
                    i12 = i29;
                    str2 = str7;
                    short[] sArr24 = sArr2;
                    sArr5 = sArr5;
                    sArr = sArr24;
                    iM31610 = (C0773.m3169("ۖܶ") ^ i18) * 43;
                    i13 = ((iM31610 ^ i17) * (-10469)) ^ (-493538285);
                    i14 = 2112515714;
                    int i40 = i11;
                    i20 = iM31610 ^ i14;
                    i19 = i13;
                    i21 = i40;
                    str = str2;
                    i29 = i12;
                    str3 = strM6233;
                    strM10536 = str;
                    short[] sArr115 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr115;
                    break;
                case -87426109:
                case 280171925:
                    C2419.m8174();
                    C2354.m7983();
                    return null;
                case 332761952:
                case 1762777071:
                    short[] sArr25 = sArr2;
                    i23 = 8;
                    if (C3734.f12817 >= 0) {
                        sArr2 = sArr25;
                        i22 = IShizukuService.Stub.TRANSACTION_attachUserService;
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                        i20 = iM3169 ^ i8;
                        i19 = i7;
                        i21 = i21;
                    } else {
                        int iM2768 = C0619.m2761("᩷ۜ") ^ i17;
                        sArr2 = sArr25;
                        i20 = iM2768 ^ 1445709257;
                        i19 = ((iM2768 ^ i18) * 17977) ^ (-584759620);
                        i22 = IShizukuService.Stub.TRANSACTION_attachUserService;
                    }
                    break;
                case 351744378:
                case 801711823:
                    strM11812 = RunnableC3646.m11812(strM10536, strM1785, C2878.m9486(sArr3, i24, i21, i15));
                    sArr6 = f59666;
                    i25 = 118;
                    i26 = 2;
                    if (!C0619.m2763()) {
                        iM2761 = C0619.m2761("᩻֨") ^ i17;
                        i4 = ((iM2761 ^ i18) * (-19673)) ^ (-1579938560);
                        i5 = 1348744966;
                        i20 = iM2761 ^ i5;
                        i19 = i4;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                        i20 = iM3169 ^ i8;
                        i19 = i7;
                        i21 = i21;
                    }
                    break;
                case 750767314:
                case 1165984359:
                    return C1080.m4058(sb);
                case 1134599032:
                case 1281606985:
                    C0619.m2763();
                    if (C13473.f42873 != 0) {
                        i21 = i21;
                        str4 = str4;
                        i29 = i29;
                        strM10536 = strM10536;
                        short[] sArr26 = sArr2;
                        sArr5 = sArr5;
                        sArr = sArr26;
                        int iM2769 = (C0619.m2761("᩺ܿ") ^ i18) * 61;
                        i19 = ((iM2769 ^ i17) * (-9245)) ^ (-173921698);
                        strM10536 = strM10536;
                        i21 = i21;
                        i20 = iM2769 ^ 817258261;
                        i29 = i29;
                        str4 = str4;
                        sb = null;
                        short[] sArr116 = sArr5;
                        sArr2 = sArr;
                        sArr5 = sArr116;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                        i20 = iM3169 ^ i8;
                        i19 = i7;
                        i21 = i21;
                    }
                    break;
                case 1509723708:
                case 1600574170:
                    i11 = i21;
                    short[] sArr27 = sArr5;
                    i12 = i29;
                    sArr = sArr2;
                    str2 = strM10536;
                    strM6233 = C1783.m6233(sArr27, i12, i30, i15);
                    C3779.m12258(sb, strM6233);
                    if (i3 > 21) {
                        iM31610 = C0773.m3169("ۚۜ") ^ i17;
                        sArr5 = sArr27;
                        i13 = ((iM31610 ^ i18) * 24701) ^ (-541102308);
                        i14 = 794145375;
                    } else {
                        sArr5 = sArr27;
                        iM31610 = (C0773.m3169("ۖܶ") ^ i18) * 43;
                        i13 = ((iM31610 ^ i17) * (-10469)) ^ (-493538285);
                        i14 = 2112515714;
                    }
                    int i41 = i11;
                    i20 = iM31610 ^ i14;
                    i19 = i13;
                    i21 = i41;
                    str = str2;
                    i29 = i12;
                    str3 = strM6233;
                    strM10536 = str;
                    short[] sArr117 = sArr5;
                    sArr2 = sArr;
                    sArr5 = sArr117;
                    break;
                default:
                    strM10536 = C3200.m10536(i3, false);
                    sArr2 = f59666;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۡ᩶") ^ i17) * (-21);
                        i7 = ((iM3169 ^ i18) * 15833) ^ (-628563085);
                        i8 = 2093846590;
                    } else {
                        iM3169 = (C0773.m3169("᩵ܽ") ^ i18) * 59;
                        i7 = ((iM3169 ^ i17) * (-22213)) ^ (-1894142751);
                        i8 = 792671111;
                    }
                    i20 = iM3169 ^ i8;
                    i19 = i7;
                    i21 = i21;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0277  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m42674() {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb;
        String str6;
        int iM3169;
        int i3;
        int i4;
        StringBuilder sb2;
        int iM2761;
        int i5;
        int i6;
        int i7;
        int i8;
        String str7;
        String str8;
        int i9;
        int i10;
        StringBuilder sb3;
        String str9;
        String str10;
        String str11;
        String str12;
        int iM31610;
        String str13;
        int i11;
        int iM31611;
        int i12;
        int i13;
        int i14;
        int iM2762;
        int i15;
        int i16;
        String str14;
        int i17;
        int i18;
        String str15;
        int i19;
        String str16;
        StringBuilder sb4;
        short[] sArr;
        int i20;
        String strM7761;
        int iM31612;
        String str17;
        int i21;
        int i22;
        StringBuilder sb5;
        int iM2763;
        int i23;
        int i24;
        int i25 = C2375.f7641;
        int i26 = AbstractC3624.f12429;
        int iM31613 = C0773.m3169("᩶ۜ") ^ i26;
        int i27 = ((iM31613 ^ i25) * (-23223)) ^ 1440150011;
        C22941 c22941M42645 = null;
        C17159 c17159M47736 = null;
        String strGroup = null;
        String strM40334 = null;
        String strM9931 = null;
        String strM2824 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i28 = iM31613 ^ (-1439174180);
        int i29 = 0;
        String str18 = null;
        int i30 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i31 = 0;
        short s3 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = -2108945874;
        int i35 = 0;
        StringBuilder sb6 = null;
        String str19 = null;
        String str20 = null;
        Matcher matcher = null;
        Iterator itM13647 = null;
        String str21 = null;
        Iterator itM53426 = null;
        Pattern pattern = null;
        String str22 = null;
        String strM42663 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            i34 = i28 ^ (i27 & (((i34 ^ i25) * 31025) >> 31));
            switch (i34) {
                case -2130253830:
                case 1020024114:
                    str = str21;
                    i2 = i33;
                    sb2 = sb6;
                    str3 = strM40334;
                    C3779.m12258(sb2, strM42663);
                    sArr3 = f59666;
                    i35 = 934;
                    if (C1826.f6190 > 0) {
                        int iM31614 = (C0773.m3169("᩸ۖ") + i25) * 43;
                        i5 = ((iM31614 ^ i26) * 20305) ^ 1220919909;
                        i19 = iM31614 ^ (-1343157184);
                        sb6 = sb2;
                        i27 = i5;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = i19;
                        str21 = str15;
                    } else {
                        str6 = strM9931;
                        str2 = str19;
                        i = i32;
                        str4 = str18;
                        str5 = str20;
                        sb = sb2;
                        iM3169 = C0773.m3169("ۡ۬") ^ i26;
                        i3 = ((iM3169 ^ i25) * (-27699)) ^ 1934648334;
                        i4 = -804722885;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    }
                    break;
                case -2058321047:
                case -1471999708:
                    if (C1826.m6317(itM53426)) {
                        iM2763 = C0619.m2761("ۜᩴ") ^ i26;
                        i23 = ((iM2763 ^ i25) * 27905) ^ 370461978;
                        i24 = 410114876;
                    } else {
                        iM2763 = (i25 - C0619.m2761("۬ۢ")) * 123;
                        i23 = ((iM2763 ^ i26) * (-13793)) ^ 818185932;
                        i24 = 31152957;
                    }
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case -2020098845:
                case 1771014154:
                    i7 = 44553;
                    int iM31615 = C0773.m3169("ᩴۖ") ^ i26;
                    i27 = ((iM31615 ^ i25) * 29425) ^ (-1445532370);
                    i8 = iM31615 ^ (-2116530171);
                    strM40334 = strM40334;
                    i33 = i7;
                    strM9931 = strM9931;
                    sb6 = sb6;
                    str20 = str20;
                    str18 = str18;
                    i32 = i32;
                    str19 = str19;
                    str21 = str21;
                    i28 = i8;
                    break;
                case -1968191850:
                case -1172674067:
                    if (C4282.f15546 > 0) {
                        iM2763 = C0619.m2761("ᩴۤ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-6605)) ^ (-1618303911);
                        i24 = -457227907;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    } else {
                        str = str21;
                        str6 = strM9931;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        int iM31616 = (C0773.m3169("ܰ۟") ^ i26) * 79;
                        str20 = str5;
                        str18 = str4;
                        strM40334 = str3;
                        i33 = i2;
                        i32 = i;
                        str19 = str2;
                        str21 = str;
                        i28 = iM31616 ^ 1122740015;
                        i27 = ((iM31616 ^ i25) * 14227) ^ 2116566987;
                        strM9931 = str6;
                        sb6 = null;
                    }
                    break;
                case -1963926518:
                case -1069246195:
                    str = str21;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM9931;
                    int i36 = s + s2;
                    i31 = i36 * i36;
                    s3 = 44832;
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0773.m3169("֨۠") ^ i26;
                        i3 = ((iM3169 ^ i25) * 3669) ^ (-155030948);
                        i4 = -1052615836;
                    } else {
                        iM3169 = (i26 - C0619.m2761("᩹ۜ")) * (-31);
                        i3 = ((iM3169 ^ i25) * 15975) ^ (-1557750161);
                        i4 = -64062587;
                    }
                    strM40334 = str3;
                    i33 = i2;
                    str15 = str;
                    i28 = iM3169 ^ i4;
                    i27 = i3;
                    strM9931 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i32 = i;
                    str19 = str2;
                    str21 = str15;
                    break;
                case -1872564236:
                case -1496713740:
                    if (C3734.m12152() >= 0) {
                        str = str21;
                        i2 = i33;
                        sb2 = sb6;
                        str3 = strM40334;
                        str6 = strM9931;
                        iM2761 = (i25 - C0773.m3169("۠ۛ")) * 75;
                        i5 = ((iM2761 ^ i26) * 16963) ^ 2056179818;
                        i6 = -514573184;
                        i19 = iM2761 ^ i6;
                        strM9931 = str6;
                        sb6 = sb2;
                        i27 = i5;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = i19;
                        str21 = str15;
                    }
                    str = str21;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM9931;
                    iM3169 = C0773.m3169("ۡ۬") ^ i26;
                    i3 = ((iM3169 ^ i25) * (-27699)) ^ 1934648334;
                    i4 = -804722885;
                    strM40334 = str3;
                    i33 = i2;
                    str15 = str;
                    i28 = iM3169 ^ i4;
                    i27 = i3;
                    strM9931 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i32 = i;
                    str19 = str2;
                    str21 = str15;
                    break;
                case -1870640517:
                case -1636814073:
                    str7 = str21;
                    str11 = str18;
                    str12 = str19;
                    str8 = str20;
                    i9 = i32;
                    i10 = i33;
                    sb3 = sb6;
                    str9 = strM40334;
                    str10 = strM9931;
                    if (C1343.m4937(str11, 0) != '{') {
                        i30 = 0;
                        iM31610 = C0619.m2761("᩵۠") ^ i25;
                        str13 = str11;
                        i27 = ((iM31610 ^ i26) * (-25649)) ^ 691086019;
                        i11 = 330408801;
                        strM40334 = str9;
                        i33 = i10;
                        int i37 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = iM31610 ^ i11;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str8;
                        str18 = str13;
                        i32 = i37;
                    } else {
                        int iM2764 = C0619.m2761("۟ۡ") ^ i26;
                        i12 = ((iM2764 ^ i25) * (-10619)) ^ 75613351;
                        i14 = iM2764 ^ 1307432151;
                        i32 = i9;
                        i30 = 0;
                        str19 = str12;
                        str21 = str7;
                        i28 = i14;
                        strM40334 = str9;
                        i33 = i10;
                        String str23 = str8;
                        str18 = str11;
                        i27 = i12;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str23;
                    }
                    break;
                case -1815196635:
                case 660452684:
                    if (C3099.m10097(arrayList)) {
                        iM2763 = (C0619.m2761("ۖᩴ") ^ i25) * 83;
                        i23 = ((iM2763 ^ i26) * (-1231)) ^ 887183169;
                        i24 = 2061571095;
                    } else {
                        iM2763 = C0773.m3169("ᩳۘ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-25559)) ^ (-659727287);
                        i24 = -1235238551;
                    }
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case -1804445578:
                case -160232553:
                    if (C3448.f11240 >= 0) {
                        iM2763 = C0619.m2761("ܳۤ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-27245)) ^ (-1288490964);
                        i24 = 1323280470;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    } else {
                        str = str21;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM9931;
                        iM3169 = C0773.m3169("֨۠") ^ i26;
                        i3 = ((iM3169 ^ i25) * 3669) ^ (-155030948);
                        i4 = -1052615836;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    }
                    break;
                case -1800460839:
                case 747181572:
                    C3779.m12264();
                    C1542.m5459();
                    return null;
                case -1768550486:
                case -848478888:
                    i7 = 20593;
                    int iM31617 = C0773.m3169("ᩴۖ") ^ i26;
                    i27 = ((iM31617 ^ i25) * 29425) ^ (-1445532370);
                    i8 = iM31617 ^ (-2116530171);
                    strM40334 = strM40334;
                    i33 = i7;
                    strM9931 = strM9931;
                    sb6 = sb6;
                    str20 = str20;
                    str18 = str18;
                    i32 = i32;
                    str19 = str19;
                    str21 = str21;
                    i28 = i8;
                    break;
                case -1726824247:
                case -349708049:
                    str = str21;
                    i2 = i33;
                    sb2 = sb6;
                    str3 = strM40334;
                    str6 = strM9931;
                    arrayList = new ArrayList();
                    if (C1321.m4852()) {
                        arrayList2 = new ArrayList();
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (i25 - C0773.m3169("۠ۛ")) * 75;
                            i5 = ((iM2761 ^ i26) * 16963) ^ 2056179818;
                            i6 = -514573184;
                        } else {
                            iM2761 = (i26 - C0619.m2761("᩵۫")) * (-15);
                            i5 = ((iM2761 ^ i25) * 25795) ^ 1029285727;
                            i6 = -863211252;
                        }
                        i19 = iM2761 ^ i6;
                        strM9931 = str6;
                        sb6 = sb2;
                        i27 = i5;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = i19;
                    } else {
                        int iM31618 = C0773.m3169("֡᩻") ^ i26;
                        strM40334 = str3;
                        strM9931 = str6;
                        arrayList2 = null;
                        sb6 = null;
                        i33 = i2;
                        str15 = str;
                        i28 = iM31618 ^ (-417481123);
                        i27 = ((iM31618 ^ i25) * 165) ^ 930413260;
                    }
                    str21 = str15;
                    break;
                case -1631547726:
                case 211227340:
                    Collections.sort(arrayList2);
                    return arrayList2;
                case -1611480269:
                case 1351884120:
                    str14 = str20;
                    i17 = i30;
                    i18 = i32;
                    strM42663 = m42663();
                    strM2824 = str14;
                    int iM31619 = (i26 - C0773.m3169("ۧ֨")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i27 = ((iM31619 ^ i25) * (-22643)) ^ 235862190;
                    i32 = i18;
                    strM9931 = strM9931;
                    sb6 = sb6;
                    str20 = str14;
                    str21 = str21;
                    i28 = iM31619 ^ (-1157750760);
                    i30 = i17;
                    strM40334 = strM40334;
                    i33 = i33;
                    break;
                case -1576918461:
                case -992309246:
                    String str24 = str21;
                    int i38 = i33;
                    StringBuilder sb7 = sb6;
                    String str25 = strM40334;
                    String str26 = strM9931;
                    String str27 = str19;
                    int i39 = i30;
                    String strM5124 = C1402.m5124(i29, i29, str18);
                    int iM28315 = C11235.m28315(strM5124, 58);
                    if (iM28315 != -1) {
                        iM2762 = C0773.m3169("ܰܺ") ^ i25;
                        i15 = ((iM2762 ^ i26) * 6809) ^ (-270541708);
                        i16 = 1239946293;
                    } else {
                        iM2762 = C0619.m2761("ۗܶ") ^ i26;
                        i15 = ((iM2762 ^ i25) * 18951) ^ 1511975359;
                        i16 = 460975533;
                    }
                    int i40 = iM2762 ^ i16;
                    i32 = iM28315;
                    i30 = i39;
                    strM40334 = str25;
                    i33 = i38;
                    i28 = i40;
                    i27 = i15;
                    str21 = str24;
                    str19 = str27;
                    strM9931 = str26;
                    sb6 = sb7;
                    str20 = strM5124;
                    break;
                case -1498969943:
                case -219197181:
                    str7 = str21;
                    str11 = str18;
                    str12 = str19;
                    str8 = str20;
                    i9 = i32;
                    i10 = i33;
                    sb3 = sb6;
                    str9 = strM40334;
                    str10 = strM9931;
                    if (C2966.m9671(str11) < 3) {
                        iM31610 = C0619.m2761("᩵۠") ^ i25;
                        str13 = str11;
                        i27 = ((iM31610 ^ i26) * (-25649)) ^ 691086019;
                        i11 = 330408801;
                        strM40334 = str9;
                        i33 = i10;
                        int i310 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = iM31610 ^ i11;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str8;
                        str18 = str13;
                        i32 = i310;
                    } else {
                        iM31611 = (C0773.m3169("ۘۗ") + i25) * (-115);
                        i12 = ((iM31611 ^ i26) * 11821) ^ 630577046;
                        i13 = -283072669;
                        i14 = iM31611 ^ i13;
                        i32 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = i14;
                        strM40334 = str9;
                        i33 = i10;
                        String str28 = str8;
                        str18 = str11;
                        i27 = i12;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str28;
                    }
                    break;
                case -1483181036:
                case -879919240:
                    C1564.m5509();
                    if (C1321.f4751 >= 0) {
                        iM2763 = C0773.m3169("᩸ܽ") ^ i26;
                        i23 = ((iM2763 ^ i25) * 19565) ^ 754597343;
                        i24 = -543405959;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    } else {
                        str = str21;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM9931;
                        iM3169 = C0773.m3169("ۡ۬") ^ i26;
                        i3 = ((iM3169 ^ i25) * (-27699)) ^ 1934648334;
                        i4 = -804722885;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    }
                    break;
                case -1482456506:
                case 1616684401:
                    str7 = str21;
                    str11 = str18;
                    str12 = str19;
                    str8 = str20;
                    i10 = i33;
                    sb3 = sb6;
                    str9 = strM40334;
                    str10 = strM9931;
                    int i41 = i30;
                    int i42 = i32;
                    c22941M42645 = m42645();
                    if (c22941M42645 == null) {
                        int iM31620 = C0773.m3169("᩺ۘ") ^ i25;
                        i30 = i41;
                        int i43 = ((iM31620 ^ i26) * 23859) ^ (-1888289220);
                        int i44 = iM31620 ^ (-1184140735);
                        i32 = i42;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str8;
                        str18 = str11;
                        i27 = i43;
                        strM40334 = str9;
                        i33 = i10;
                        str19 = str12;
                        str21 = str7;
                        i28 = i44;
                    } else {
                        i30 = i41;
                        iM31611 = C0773.m3169("ۡܿ") ^ i25;
                        i9 = i42;
                        i12 = ((iM31611 ^ i26) * (-22745)) ^ (-1510384262);
                        i13 = -690197948;
                        i14 = iM31611 ^ i13;
                        i32 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = i14;
                        strM40334 = str9;
                        i33 = i10;
                        String str29 = str8;
                        str18 = str11;
                        i27 = i12;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str29;
                    }
                    break;
                case -1393533587:
                case 665798060:
                    if (C3492.f12043 <= 0) {
                        iM2763 = C0619.m2761("ܶ᩷") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-6239)) ^ (-374351878);
                        i24 = 236401827;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    } else {
                        str16 = str21;
                        strM7761 = str22;
                        i33 = i33;
                        sArr = sArr3;
                        sb4 = sb6;
                        strM40334 = strM40334;
                        i20 = i35;
                        iM31612 = C0619.m2761("ۧۜ") ^ i26;
                        str17 = strM7761;
                        i21 = ((iM31612 ^ i25) * 16047) ^ (-903434794);
                        i22 = -2141157273;
                        int i45 = iM31612 ^ i22;
                        sb6 = sb4;
                        i27 = i21;
                        str21 = str16;
                        i28 = i45;
                        sArr3 = sArr;
                        str22 = str17;
                        i35 = i20;
                        strM40334 = strM40334;
                        i33 = i33;
                    }
                    break;
                case -1115449832:
                case 1735134227:
                    return Collections.singletonList(new C14570(str19, str18));
                case -1052318417:
                case 649328880:
                    sb5 = sb6;
                    C3779.m12258(sb5, str22);
                    Pattern patternCompile = Pattern.compile(C2023.m6952(sb5));
                    itM53426 = C23916.m53426(C1080.m4054(c22941M42645));
                    pattern = patternCompile;
                    int iM2765 = (i26 - C0619.m2761("ۗ۫")) * 37;
                    str21 = str21;
                    int i46 = ((iM2765 ^ i25) * 6721) ^ 1898488858;
                    i8 = iM2765 ^ 2088185223;
                    sb6 = sb5;
                    i27 = i46;
                    str21 = str21;
                    i28 = i8;
                    break;
                case -1035494048:
                case -576638870:
                    if (C4238.f15451 >= 0) {
                        str = str21;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM9931;
                        iM3169 = C0773.m3169("ۡ۬") ^ i26;
                        i3 = ((iM3169 ^ i25) * (-27699)) ^ 1934648334;
                        i4 = -804722885;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    } else {
                        str = str21;
                        str6 = strM9931;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        int iM316110 = (C0773.m3169("ܰ۟") ^ i26) * 79;
                        str20 = str5;
                        str18 = str4;
                        strM40334 = str3;
                        i33 = i2;
                        i32 = i;
                        str19 = str2;
                        str21 = str;
                        i28 = iM316110 ^ 1122740015;
                        i27 = ((iM316110 ^ i25) * 14227) ^ 2116566987;
                        strM9931 = str6;
                        sb6 = null;
                    }
                    break;
                case -1033107407:
                case 746703036:
                    strM9931 = RunnableC3055.m9931(strGroup, i29);
                    iM2763 = (C0619.m2761("᩶᩷") ^ i25) * 9;
                    i23 = ((iM2763 ^ i26) * (-20331)) ^ (-951786875);
                    i24 = 77593315;
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case -1031639083:
                case 814511226:
                    c17159M47736 = ((C20889) m42678()).m47736(strM42663);
                    itM13647 = C4282.m13647(arrayList);
                    iM2763 = C0619.m2761("ۛۚ") ^ i25;
                    i23 = ((iM2763 ^ i26) * (-28129)) ^ (-1063404885);
                    i24 = 2042150700;
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case -902414035:
                case 2079014722:
                    str7 = str21;
                    str8 = str20;
                    i9 = i32;
                    i10 = i33;
                    sb3 = sb6;
                    str9 = strM40334;
                    str10 = strM9931;
                    str11 = this.f59683;
                    str12 = "";
                    if (str11 != null) {
                        iM31610 = (i26 - C0773.m3169("֡᩹")) * (-57);
                        str13 = str11;
                        i27 = ((iM31610 ^ i25) * (-26081)) ^ (-1822201293);
                        i11 = -1090881641;
                    } else {
                        iM31610 = C0619.m2761("᩵۠") ^ i25;
                        str13 = str11;
                        i27 = ((iM31610 ^ i26) * (-25649)) ^ 691086019;
                        i11 = 330408801;
                    }
                    strM40334 = str9;
                    i33 = i10;
                    int i311 = i9;
                    str19 = str12;
                    str21 = str7;
                    i28 = iM31610 ^ i11;
                    strM9931 = str10;
                    sb6 = sb3;
                    str20 = str8;
                    str18 = str13;
                    i32 = i311;
                    break;
                case -843653722:
                case 1953140333:
                    return Collections.singletonList(new C14570(str19, str18));
                case -505814736:
                case 1908131766:
                    str = str21;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM9931;
                    sArr2 = f59666;
                    c = 926;
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0773.m3169("ܰ᩹") ^ i25) * 71;
                        i3 = ((iM3169 ^ i26) * (-10623)) ^ (-526284797);
                        i4 = 1178726829;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    } else {
                        int iM316111 = (C0773.m3169("ܰ۟") ^ i26) * 79;
                        str20 = str5;
                        str18 = str4;
                        strM40334 = str3;
                        i33 = i2;
                        i32 = i;
                        str19 = str2;
                        str21 = str;
                        i28 = iM316111 ^ 1122740015;
                        i27 = ((iM316111 ^ i25) * 14227) ^ 2116566987;
                        strM9931 = str6;
                        sb6 = null;
                    }
                    break;
                case -427821373:
                case 394579897:
                    strGroup = matcher.group(i29);
                    if (strGroup == null) {
                        strM9931 = str19;
                        iM2763 = (C0619.m2761("᩶᩷") ^ i25) * 9;
                        i23 = ((iM2763 ^ i26) * (-20331)) ^ (-951786875);
                        i24 = 77593315;
                    } else {
                        iM2763 = C0619.m2761("᩸֫") ^ i26;
                        i23 = ((iM2763 ^ i25) * (-25443)) ^ 578166541;
                        i24 = 1735383365;
                    }
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case -427714657:
                case 847617250:
                    str = str21;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM9931;
                    if ((s * s3) - i31 > 0) {
                        iM3169 = (C0619.m2761("֡֨") ^ i25) * 73;
                        i3 = ((iM3169 ^ i26) * 16085) ^ 1291261117;
                        i4 = -725580243;
                    } else {
                        iM3169 = (C0773.m3169("ۜ֡") ^ i25) * (-79);
                        i3 = ((iM3169 ^ i26) * 27605) ^ 2037869468;
                        i4 = 571008548;
                    }
                    strM40334 = str3;
                    i33 = i2;
                    str15 = str;
                    i28 = iM3169 ^ i4;
                    i27 = i3;
                    strM9931 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i32 = i;
                    str19 = str2;
                    str21 = str15;
                    break;
                case -84912508:
                case 525552283:
                    RunnableC0334.m2054(arrayList, strM9931);
                    sb5 = sb6;
                    int iM2766 = (i26 - C0619.m2761("ۗ۫")) * 37;
                    str21 = str21;
                    int i47 = ((iM2766 ^ i25) * 6721) ^ 1898488858;
                    i8 = iM2766 ^ 2088185223;
                    sb6 = sb5;
                    i27 = i47;
                    str21 = str21;
                    i28 = i8;
                    break;
                case 8706111:
                case 236774749:
                    str16 = str21;
                    sb4 = sb6;
                    i33 = i33;
                    sArr = sArr3;
                    strM40334 = strM40334;
                    i20 = i35;
                    strM7761 = C2288.m7761(sArr, i20, 33, i33);
                    if (C3734.f12817 >= 0) {
                        iM31612 = C0619.m2761("ۧۜ") ^ i26;
                        str17 = strM7761;
                        i21 = ((iM31612 ^ i25) * 16047) ^ (-903434794);
                        i22 = -2141157273;
                    } else {
                        iM31612 = C0773.m3169("ۘۚ") ^ i26;
                        str17 = strM7761;
                        i21 = ((iM31612 ^ i25) * (-16691)) ^ (-1144724894);
                        i22 = -1968499225;
                    }
                    int i48 = iM31612 ^ i22;
                    sb6 = sb4;
                    i27 = i21;
                    str21 = str16;
                    i28 = i48;
                    sArr3 = sArr;
                    str22 = str17;
                    i35 = i20;
                    strM40334 = strM40334;
                    i33 = i33;
                    break;
                case 100672767:
                case 1706832973:
                    str7 = str21;
                    str11 = str18;
                    str12 = str19;
                    str8 = str20;
                    i9 = i32;
                    i10 = i33;
                    sb3 = sb6;
                    str9 = strM40334;
                    str10 = strM9931;
                    i29 = 1;
                    if (C1146.m4221(1, str11) == '}') {
                        iM31611 = C0619.m2761("۬ܺ") ^ i26;
                        i12 = ((iM31611 ^ i25) * (-21371)) ^ 1050542534;
                        i13 = -330402750;
                        i14 = iM31611 ^ i13;
                        i32 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = i14;
                        strM40334 = str9;
                        i33 = i10;
                        String str210 = str8;
                        str18 = str11;
                        i27 = i12;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str210;
                    } else {
                        iM31610 = C0619.m2761("᩵۠") ^ i25;
                        str13 = str11;
                        i27 = ((iM31610 ^ i26) * (-25649)) ^ 691086019;
                        i11 = 330408801;
                        strM40334 = str9;
                        i33 = i10;
                        int i312 = i9;
                        str19 = str12;
                        str21 = str7;
                        i28 = iM31610 ^ i11;
                        strM9931 = str10;
                        sb6 = sb3;
                        str20 = str8;
                        str18 = str13;
                        i32 = i312;
                    }
                    break;
                case 194493612:
                case 1139076836:
                    str21 = (String) C0950.m3796(itM13647);
                    strM40334 = c17159M47736.m40334(strM2824, str21);
                    if (strM40334 != null) {
                        iM2763 = C0773.m3169("᩵ۙ") ^ i25;
                        i23 = ((iM2763 ^ i26) * 12813) ^ (-1915404390);
                        i24 = 1638678705;
                    } else {
                        iM2763 = C0619.m2761("ۛۚ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-28129)) ^ (-1063404885);
                        i24 = 2042150700;
                    }
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case 224849930:
                case 1545640501:
                    if (C3998.m12923(itM13647)) {
                        iM2763 = (i26 - C0773.m3169("᩻ۚ")) * 93;
                        i23 = ((iM2763 ^ i25) * (-27055)) ^ (-2132093138);
                        i24 = -803676901;
                    } else {
                        iM2763 = (C0619.m2761("ۖᩴ") ^ i25) * 83;
                        i23 = ((iM2763 ^ i26) * (-1231)) ^ 887183169;
                        i24 = 2061571095;
                    }
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case 359788492:
                case 935766813:
                    RunnableC0334.m2054(arrayList2, new C14570(str21, strM40334));
                    iM2763 = C0619.m2761("ۛۚ") ^ i25;
                    i23 = ((iM2763 ^ i26) * (-28129)) ^ (-1063404885);
                    i24 = 2042150700;
                    i28 = iM2763 ^ i24;
                    i27 = i23;
                    break;
                case 773259219:
                case 2060016347:
                    if (C3734.f12817 < 0) {
                        str16 = str21;
                        strM7761 = str22;
                        i33 = i33;
                        sArr = sArr3;
                        sb4 = sb6;
                        strM40334 = strM40334;
                        i20 = i35;
                        iM31612 = C0619.m2761("ۧۜ") ^ i26;
                        str17 = strM7761;
                        i21 = ((iM31612 ^ i25) * 16047) ^ (-903434794);
                        i22 = -2141157273;
                        int i49 = iM31612 ^ i22;
                        sb6 = sb4;
                        i27 = i21;
                        str21 = str16;
                        i28 = i49;
                        sArr3 = sArr;
                        str22 = str17;
                        i35 = i20;
                        strM40334 = strM40334;
                        i33 = i33;
                    } else {
                        iM2763 = C0619.m2761("ܳۤ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-27245)) ^ (-1288490964);
                        i24 = 1323280470;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    }
                    break;
                case 774165411:
                case 1026975302:
                    str14 = str20;
                    i17 = i30;
                    i18 = i32;
                    strM42663 = AbstractC3624.m11770(str14, i17, i18);
                    strM2824 = AbstractC0641.m2824(str14, i18 + i29);
                    int iM316112 = (i26 - C0773.m3169("ۧ֨")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i27 = ((iM316112 ^ i25) * (-22643)) ^ 235862190;
                    i32 = i18;
                    strM9931 = strM9931;
                    sb6 = sb6;
                    str20 = str14;
                    str21 = str21;
                    i28 = iM316112 ^ (-1157750760);
                    i30 = i17;
                    strM40334 = strM40334;
                    i33 = i33;
                    break;
                case 804370941:
                case 837279076:
                    str = str21;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM9931;
                    s = sArr2[c];
                    s2 = 11208;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ۡ۬") ^ i26;
                        i3 = ((iM3169 ^ i25) * (-27699)) ^ 1934648334;
                        i4 = -804722885;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i26) * (-21);
                        i3 = ((iM3169 ^ i25) * 23821) ^ (-47969948);
                        i4 = 87973467;
                    }
                    strM40334 = str3;
                    i33 = i2;
                    str15 = str;
                    i28 = iM3169 ^ i4;
                    i27 = i3;
                    strM9931 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i32 = i;
                    str19 = str2;
                    str21 = str15;
                    break;
                case 973199934:
                case 1563895828:
                    if (C0862.f3233 != 0) {
                        str = str21;
                        str2 = str19;
                        i = i32;
                        i2 = i33;
                        str3 = strM40334;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM9931;
                        iM3169 = C0773.m3169("֨۠") ^ i26;
                        i3 = ((iM3169 ^ i25) * 3669) ^ (-155030948);
                        i4 = -1052615836;
                        strM40334 = str3;
                        i33 = i2;
                        str15 = str;
                        i28 = iM3169 ^ i4;
                        i27 = i3;
                        strM9931 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i32 = i;
                        str19 = str2;
                        str21 = str15;
                    } else {
                        iM2763 = C0619.m2761("ᩴۤ") ^ i25;
                        i23 = ((iM2763 ^ i26) * (-6605)) ^ (-1618303911);
                        i24 = -457227907;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    }
                    break;
                case 1103533176:
                case 1688470464:
                    str = str21;
                    i2 = i33;
                    str3 = strM40334;
                    int i50 = i35;
                    short[] sArr4 = f59666;
                    if (RunnableC0334.f1808 > 0) {
                        i35 = i50;
                        str6 = strM9931;
                        String strM4056 = C1080.m4056(sArr4, 927, 7, i2);
                        if (C2966.f9654 < 0) {
                            sb2 = new StringBuilder(strM4056);
                            if (C2310.f7472 < 0) {
                                iM2761 = (C0619.m2761("᩶۟") ^ i25) * (-97);
                                i5 = ((iM2761 ^ i26) * (-17353)) ^ (-16464898);
                                i6 = 956724554;
                                i19 = iM2761 ^ i6;
                                strM9931 = str6;
                                sb6 = sb2;
                                i27 = i5;
                                strM40334 = str3;
                                i33 = i2;
                                str15 = str;
                                i28 = i19;
                            }
                            str21 = str15;
                        } else {
                            str2 = str19;
                            i = i32;
                            str4 = str18;
                            str5 = str20;
                            int iM316113 = (C0773.m3169("ܰ۟") ^ i26) * 79;
                            str20 = str5;
                            str18 = str4;
                            strM40334 = str3;
                            i33 = i2;
                            i32 = i;
                            str19 = str2;
                            str21 = str;
                            i28 = iM316113 ^ 1122740015;
                            i27 = ((iM316113 ^ i25) * 14227) ^ 2116566987;
                            strM9931 = str6;
                            sb6 = null;
                        }
                    } else {
                        i35 = i50;
                        str6 = strM9931;
                    }
                    int iM316114 = C0773.m3169("֡᩻") ^ i26;
                    strM40334 = str3;
                    strM9931 = str6;
                    arrayList2 = null;
                    sb6 = null;
                    i33 = i2;
                    str15 = str;
                    i28 = iM316114 ^ (-417481123);
                    i27 = ((iM316114 ^ i25) * 165) ^ 930413260;
                    str21 = str15;
                    break;
                case 1402740718:
                case 1560595807:
                    matcher = pattern.matcher(C0862.m3495((C8002) C0950.m3796(itM53426)));
                    if (!matcher.matches()) {
                        sb5 = sb6;
                        int iM2767 = (i26 - C0619.m2761("ۗ۫")) * 37;
                        str21 = str21;
                        int i410 = ((iM2767 ^ i25) * 6721) ^ 1898488858;
                        i8 = iM2767 ^ 2088185223;
                        sb6 = sb5;
                        i27 = i410;
                        str21 = str21;
                        i28 = i8;
                    } else {
                        iM2763 = C0619.m2761("᩹᩻") ^ i26;
                        i23 = ((iM2763 ^ i25) * 18425) ^ (-123138701);
                        i24 = -1382968789;
                        i28 = iM2763 ^ i24;
                        i27 = i23;
                    }
                    break;
                default:
                    C4238.m13540();
                    str = str21;
                    str6 = strM9931;
                    str2 = str19;
                    i = i32;
                    i2 = i33;
                    str3 = strM40334;
                    str4 = str18;
                    str5 = str20;
                    int iM316115 = (C0773.m3169("ܰ۟") ^ i26) * 79;
                    str20 = str5;
                    str18 = str4;
                    strM40334 = str3;
                    i33 = i2;
                    i32 = i;
                    str19 = str2;
                    str21 = str;
                    i28 = iM316115 ^ 1122740015;
                    i27 = ((iM316115 ^ i25) * 14227) ^ 2116566987;
                    strM9931 = str6;
                    sb6 = null;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42649() {
        return C2288.m7764(21, this.f59688);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42665() {
        return this.f59668;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m42685() {
        return this.f59669;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m42672() {
        return this.f59672;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42657(boolean z) {
        int i = 1823796413;
        int i2 = C1564.f5401;
        int i3 = AbstractC0641.f2496;
        int iM2761 = C0619.m2761("ۛܰ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-5657)) ^ 281948543;
        int i5 = -1318784502;
        while (true) {
            i = ((((i ^ i3) * 15013) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2068829906:
                case 1381856321:
                    C1343.m4943();
                    C2834.m9344();
                    break;
                case -1972485084:
                case 115659995:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۘ֫") ^ i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-11797)) ^ (-2051964709);
                        i5 = -1479921781;
                    } else {
                        iM2761 = (C0773.m3169("᩻᩺") + i3) * (-27);
                        i4 = ((iM2761 ^ i2) * (-28213)) ^ 2005920754;
                        i5 = -1642322823;
                    }
                    break;
                case -1793491494:
                case -889606271:
                    C0862.m3503();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32105)) ^ (-1916462738);
                        i5 = -1759895563;
                    } else {
                        iM2761 = (C0773.m3169("ۘ֫") ^ i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-11797)) ^ (-2051964709);
                        i5 = -1479921781;
                    }
                    break;
                case -1560151104:
                case 1825375024:
                    this.f59676 = z;
                    if (z) {
                        iM2761 = C0773.m3169("ܶۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-621)) ^ (-67377754);
                        i5 = -1230114327;
                    } else {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22015)) ^ 338288016;
                        i5 = -17123079;
                    }
                    break;
                case -1552673664:
                case 226210910:
                    C2878.m9491();
                    if (C1080.f3865 < 0) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16449) ^ (-97037925);
                        i5 = -1334924877;
                    } else {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32105)) ^ (-1916462738);
                        i5 = -1759895563;
                    }
                    break;
                case -1305622346:
                case 1637354667:
                    C3077.m10041();
                    iM2761 = C0773.m3169("ܺۧ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-26141)) ^ (-1796634645);
                    i5 = -662173858;
                    break;
                case -1187809782:
                case 854654478:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ܿ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16449) ^ (-97037925);
                        i5 = -1334924877;
                    } else {
                        iM2761 = (C0773.m3169("֨۟") + i3) * (-7);
                        i4 = ((iM2761 ^ i2) * 15903) ^ 2072297586;
                        i5 = 117060016;
                    }
                    break;
                case -1025512834:
                case 1953491315:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32105)) ^ (-1916462738);
                        i5 = -1759895563;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܿۤ")) * 95;
                        i4 = ((iM2761 ^ i3) * (-22799)) ^ 465904146;
                        i5 = 124489373;
                    }
                    break;
                case -989596660:
                case 1004962300:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۚܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5365)) ^ 1954499555;
                        i5 = -2018575814;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩸᩷")) * (-59);
                        i4 = ((iM2761 ^ i3) * 12507) ^ 361517826;
                        i5 = -753978444;
                    }
                    break;
                case -873215988:
                case 358621279:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0773.m3169("ۘ֫") ^ i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-11797)) ^ (-2051964709);
                        i5 = -1479921781;
                    } else {
                        iM2761 = C0773.m3169("֫֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15041)) ^ (-1769525924);
                        i5 = -53314557;
                    }
                    break;
                case -868551109:
                case 423795709:
                    break;
                case -378438438:
                case 1949300302:
                    m42653();
                    iM2761 = C0773.m3169("ܶۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-621)) ^ (-67377754);
                    i5 = -1230114327;
                    break;
                case 11280043:
                case 840513999:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32105)) ^ (-1916462738);
                        i5 = -1759895563;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽۚ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-10111)) ^ 1686975709;
                        i5 = 490063632;
                    }
                    break;
                case 853138257:
                case 1809195469:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ۚܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5365)) ^ 1954499555;
                        i5 = -2018575814;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2137) ^ (-2122651930);
                        i5 = -175946751;
                    }
                    break;
                case 1475825533:
                case 2037209487:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۚܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5365)) ^ 1954499555;
                        i5 = -2018575814;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩶") ^ i2) * (-63);
                        i4 = ((iM2761 ^ i3) * (-32113)) ^ (-950740678);
                        i5 = 1843552794;
                    }
                    break;
                case 1567268306:
                case 1980193937:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ۘ֫") ^ i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-11797)) ^ (-2051964709);
                        i5 = -1479921781;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۗ")) * (-53);
                        i4 = ((iM2761 ^ i3) * 9987) ^ 1072289141;
                        i5 = -1398607770;
                    }
                    break;
                case 1706996268:
                case 2136352855:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32105)) ^ (-1916462738);
                        i5 = -1759895563;
                    } else {
                        iM2761 = C0773.m3169("᩺᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26691)) ^ 310359618;
                        i5 = -251991337;
                    }
                    break;
                default:
                    C0862.m3503();
                    if (C23916.f77426 > 0) {
                        iM2761 = (C0773.m3169("ۘ֫") ^ i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-11797)) ^ (-2051964709);
                        i5 = -1479921781;
                    } else {
                        iM2761 = C0773.m3169("ܺۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26141)) ^ (-1796634645);
                        i5 = -662173858;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m42650() {
        return this.f59685;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m42676() {
        return this.f59682;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m42683() {
        PluginContext pluginContextM42678 = null;
        String str = null;
        String strM7742 = null;
        int i = -880336039;
        int i2 = C2287.f7432;
        int i3 = C2375.f7641;
        int iM3169 = C0773.m3169("᩶ۙ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-13051)) ^ (-520380720);
        int i5 = 261605657;
        while (true) {
            i = ((((i ^ i2) * (-24597)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2101694047:
                case 1716053622:
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21827)) ^ 856884216;
                        i5 = -54142884;
                    } else {
                        iM3169 = C0619.m2761("᩷۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31789)) ^ (-772192144);
                        i5 = 509311825;
                    }
                    break;
                case -2076242607:
                case 285085313:
                    C0950.m3785();
                    iM3169 = C0619.m2761("ۧۧ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 8139) ^ (-832302162);
                    i5 = 1342738933;
                    break;
                case -2011452431:
                case 1480061469:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("֫᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3401)) ^ (-116369672);
                        i5 = 1022308865;
                    } else {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    }
                    break;
                case -1908479812:
                case -1712517794:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = C0619.m2761("ۢܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20525)) ^ 1125383085;
                        i5 = -1048821264;
                    }
                    break;
                case -1821158270:
                case -803220708:
                    C2023.m6964();
                    return null;
                case -1350408411:
                case -449051140:
                    if (C2966.m9671(str) >= 3) {
                        iM3169 = C0619.m2761("ܶۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4489) ^ 406349673;
                        i5 = 1520935361;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * (-26121)) ^ 1360600048;
                        i5 = 1540467012;
                    }
                    break;
                case -1277026070:
                case 1787221089:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = (C0619.m2761("ۜ۬") + i2) * 47;
                        i4 = ((iM3169 ^ i3) * (-23383)) ^ 95156860;
                        i5 = 496197193;
                    }
                    break;
                case -1247672035:
                case 334236508:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = C0773.m3169("᩸۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13553)) ^ (-1901876647);
                        i5 = -1214692535;
                    }
                    break;
                case -1235525322:
                case -1124571609:
                    C0950.m3785();
                    if (C1321.f4751 < 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8139) ^ (-832302162);
                        i5 = 1342738933;
                    }
                    break;
                case -1029895097:
                case 932046387:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21827)) ^ 856884216;
                        i5 = -54142884;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ (-2012564242);
                        i5 = 793493767;
                    }
                    break;
                case -940336480:
                case 417295680:
                    C3690.m11987();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21827)) ^ 856884216;
                        i5 = -54142884;
                    } else {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    }
                    break;
                case -915597303:
                case -913356349:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = (C0773.m3169("ۘܶ") ^ i2) * 29;
                        i4 = ((iM3169 ^ i3) * 19955) ^ 1361283451;
                        i5 = -834829428;
                    }
                    break;
                case -575386132:
                case 1155044539:
                    return str;
                case -534507744:
                case 1536533998:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("֫᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3401)) ^ (-116369672);
                        i5 = 1022308865;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۙܶ")) * (-119);
                        i4 = ((iM3169 ^ i2) * (-7243)) ^ 1701921445;
                        i5 = 163554013;
                    }
                    break;
                case -322921003:
                case 1467206547:
                    strM7742 = C2287.m7742((C20889) pluginContextM42678, str);
                    if (strM7742 != null) {
                        iM3169 = C0619.m2761("ۘ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23841) ^ (-1505663661);
                        i5 = 414226792;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * (-26121)) ^ 1360600048;
                        i5 = 1540467012;
                    }
                    break;
                case 464426252:
                case 2068473411:
                    pluginContextM42678 = m42678();
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21827)) ^ 856884216;
                        i5 = -54142884;
                    } else {
                        iM3169 = (C0773.m3169("ۙ۬") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * (-3621)) ^ (-1502688601);
                        i5 = 1604422045;
                    }
                    break;
                case 584471620:
                case 1556183554:
                    if (RunnableC3646.m11801(1, str) == '}') {
                        iM3169 = (C0773.m3169("ۛۨ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-275)) ^ 926044071;
                        i5 = 547040175;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * (-26121)) ^ 1360600048;
                        i5 = 1540467012;
                    }
                    break;
                case 738822194:
                case 1819206577:
                    return strM7742;
                case 779736027:
                case 1593650585:
                    if (C4282.m13656(str, 0) == '{') {
                        iM3169 = C0773.m3169("۫֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19917) ^ (-989170712);
                        i5 = 673133165;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * (-26121)) ^ 1360600048;
                        i5 = 1540467012;
                    }
                    break;
                case 1176079850:
                case 1285511511:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24771) ^ (-1164692701);
                        i5 = -253657271;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩻") + i2) * (-83);
                        i4 = ((iM3169 ^ i3) * (-951)) ^ (-1318533596);
                        i5 = -89071229;
                    }
                    break;
                default:
                    str = this.f59683;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("۫ܺ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-30905)) ^ (-2033347161);
                        i5 = -1744620488;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30857)) ^ 406156119;
                        i5 = 1697344487;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42643(ArrayList arrayList, int i) {
        Iterator itM4942 = null;
        C21284 c21284 = null;
        Exception e = null;
        int i2 = 1224941432;
        int i3 = C0950.f3488;
        int i4 = C4238.f15451;
        int iM2761 = C0619.m2761("۫۬") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-22983)) ^ 1879491158;
        int i6 = 1691568601;
        while (true) {
            i2 = ((((i2 ^ i4) * (-17813)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2068824733:
                case 589832463:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ۛۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1643) ^ 138272215;
                        i6 = -438184305;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۡ֡")) * 15;
                        i5 = ((iM2761 ^ i4) * (-21151)) ^ (-1114165671);
                        i6 = -1621042440;
                    }
                    break;
                case -2031850535:
                case -250068964:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (i3 - C0773.m3169("۫ᩳ")) * (-125);
                        i5 = ((iM2761 ^ i4) * 13659) ^ (-1920288848);
                        i6 = -1567975147;
                    } else {
                        iM2761 = (C0619.m2761("ܿ֫") + i3) * (-39);
                        i5 = ((iM2761 ^ i4) * 5601) ^ (-63703441);
                        i6 = -196989667;
                    }
                    break;
                case -1834494759:
                case -848762610:
                    C2023.m6964();
                    C2878.m9491();
                    break;
                case -1831817439:
                case -912102854:
                    RunnableC0334.m2063();
                    if (C3099.f10023 > 0) {
                        iM2761 = C0619.m2761("ۡۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10801) ^ 522389352;
                        i6 = -1153946231;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۫ᩳ")) * (-125);
                        i5 = ((iM2761 ^ i4) * 13659) ^ (-1920288848);
                        i6 = -1567975147;
                    }
                    break;
                case -1774950594:
                case 1184290984:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("۫ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 319) ^ (-1165647250);
                        i6 = 2132118109;
                    } else {
                        iM2761 = C0619.m2761("۬᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * 25549) ^ 470257686;
                        i6 = -1549181200;
                    }
                    break;
                case -1522912829:
                case -526588026:
                    break;
                case -1275048472:
                case 1155539852:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ۛۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1643) ^ 138272215;
                        i6 = -438184305;
                    } else {
                        iM2761 = C0773.m3169("᩶ᩴ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 3109) ^ (-997306622);
                        i6 = -785958090;
                    }
                    break;
                case -1154212774:
                case -272852898:
                    try {
                        RunnableC0334.m2054(arrayList, C12596.m31304(this.f59670, c21284.f67874));
                        iM2761 = C0619.m2761("᩷ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15485)) ^ 146792094;
                        i6 = -372022374;
                    } catch (Exception e2) {
                        e = e2;
                        iM2761 = (C0619.m2761("ۡܺ") ^ i4) * 13;
                        i5 = ((iM2761 ^ i3) * 12927) ^ (-1747223593);
                        i6 = -1417312936;
                    }
                    break;
                case -321653688:
                case 2123882843:
                    m42654(e);
                    iM2761 = C0619.m2761("᩷ۢ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-15485)) ^ 146792094;
                    i6 = -372022374;
                    break;
                case -290787427:
                case 240797169:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۡۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10801) ^ 522389352;
                        i6 = -1153946231;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܺܰ")) * 51;
                        i5 = ((iM2761 ^ i4) * 9971) ^ 1306613860;
                        i6 = 1963351163;
                    }
                    break;
                case -212035664:
                case -22891923:
                    c21284 = (C21284) C0950.m3796(itM4942);
                    if (c21284.f67875 == i) {
                        iM2761 = C0773.m3169("᩶ۨ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-2603)) ^ 315038939;
                        i6 = -1924955952;
                    } else {
                        iM2761 = C0619.m2761("᩷ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15485)) ^ 146792094;
                        i6 = -372022374;
                    }
                    break;
                case -201850220:
                case -104205178:
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("᩻֫") + i4) * (-103);
                        i5 = ((iM2761 ^ i3) * 27331) ^ 1387239050;
                        i6 = 1688020544;
                    } else {
                        iM2761 = C0773.m3169("ᩳۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-18339)) ^ (-1257649898);
                        i6 = -1192345057;
                    }
                    break;
                case -144833588:
                case 1753646969:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ۡۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10801) ^ 522389352;
                        i6 = -1153946231;
                    } else {
                        iM2761 = C0619.m2761("᩷᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-31801)) ^ (-1744083916);
                        i6 = 1768849647;
                    }
                    break;
                case -100794460:
                case 1737705633:
                    itM4942 = C1343.m4942(this.f59690);
                    iM2761 = C0619.m2761("᩷ۢ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-15485)) ^ 146792094;
                    i6 = -372022374;
                    break;
                case -28944356:
                case 1985807966:
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0773.m3169("᩻֫") + i4) * (-103);
                        i5 = ((iM2761 ^ i3) * 27331) ^ 1387239050;
                        i6 = 1688020544;
                    } else {
                        iM2761 = C0619.m2761("֡ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6161) ^ (-1446805063);
                        i6 = 810804041;
                    }
                    break;
                case 209396901:
                case 1157941947:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("۫ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 319) ^ (-1165647250);
                        i6 = 2132118109;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܺ۬")) * 83;
                        i5 = ((iM2761 ^ i3) * 17303) ^ 1919217481;
                        i6 = 2072718205;
                    }
                    break;
                case 373068246:
                case 443231694:
                    if (m42673()) {
                        iM2761 = (C0619.m2761("ᩴۧ") ^ i3) * (-55);
                        i5 = ((iM2761 ^ i4) * 11601) ^ (-487805286);
                        i6 = 1031192653;
                    } else {
                        iM2761 = C0619.m2761("᩷ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15485)) ^ 146792094;
                        i6 = -372022374;
                    }
                    break;
                case 509932241:
                case 2046849964:
                    C1080.m4050();
                    iM2761 = (i3 - C0773.m3169("۫ᩳ")) * (-125);
                    i5 = ((iM2761 ^ i4) * 13659) ^ (-1920288848);
                    i6 = -1567975147;
                    break;
                case 692913288:
                case 739469244:
                    C2878.m9491();
                    if (C2834.f9334 > 0) {
                        iM2761 = (C0773.m3169("᩻֫") + i4) * (-103);
                        i5 = ((iM2761 ^ i3) * 27331) ^ 1387239050;
                        i6 = 1688020544;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۫ᩳ")) * (-125);
                        i5 = ((iM2761 ^ i4) * 13659) ^ (-1920288848);
                        i6 = -1567975147;
                    }
                    break;
                case 880949713:
                case 1233164719:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("᩻֫") + i4) * (-103);
                        i5 = ((iM2761 ^ i3) * 27331) ^ 1387239050;
                        i6 = 1688020544;
                    } else {
                        iM2761 = C0619.m2761("᩹۫") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17109) ^ (-1164826673);
                        i6 = 839138264;
                    }
                    break;
                case 1493193097:
                case 2130431741:
                    if (C1826.m6317(itM4942)) {
                        iM2761 = (i4 - C0773.m3169("֡ۖ")) * (-29);
                        i5 = ((iM2761 ^ i3) * 26489) ^ (-76420723);
                        i6 = -1106375860;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܽۤ")) * (-41);
                        i5 = ((iM2761 ^ i3) * (-30741)) ^ (-1955339469);
                        i6 = 1548802376;
                    }
                    break;
                default:
                    if (C11235.f35427 < 0) {
                        iM2761 = C0773.m3169("۫ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 319) ^ (-1165647250);
                        i6 = 2132118109;
                    } else {
                        iM2761 = C0619.m2761("ۡۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10801) ^ 522389352;
                        i6 = -1153946231;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42666() {
        ArrayList arrayList = null;
        Iterator itM4942 = null;
        C21284 c21284 = null;
        boolean z = false;
        int i = -330027844;
        int i2 = C2966.f9654;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ۜܳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 16113) ^ (-1563475321);
        int i5 = -595859141;
        while (true) {
            int i6 = iM3169 ^ i5;
            while (true) {
                i = ((((i ^ i2) * (-24775)) >> 31) & i4) ^ i6;
                switch (i) {
                    case -1897122516:
                    case -501691183:
                        C1542.m5459();
                        C3492.m11488();
                        return false;
                    case -1889954488:
                    case -243255957:
                        if (RunnableC0334.f1808 > 0) {
                            iM3169 = C0773.m3169("ۖܿ") ^ i3;
                            i4 = ((iM3169 ^ i2) * 557) ^ 1153946078;
                            i5 = 934221212;
                            break;
                        }
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15091) ^ (-908561340);
                        i5 = 2056662527;
                        break;
                    case -1879075391:
                    case 1248892816:
                        itM4942 = C1343.m4942(arrayList);
                        iM3169 = C0773.m3169("ܺ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3583) ^ (-1251098093);
                        i5 = 901881817;
                        break;
                    case -1869608866:
                    case 759224561:
                        if (C3448.f11240 < 0) {
                            iM3169 = C0619.m2761("֨ܶ") ^ i3;
                            i4 = ((iM3169 ^ i2) * (-25937)) ^ 1487881343;
                            i5 = -1678034923;
                            break;
                        }
                        iM3169 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21993)) ^ 1654960026;
                        i5 = 2050205548;
                        break;
                    case -1858661938:
                    case 1402005613:
                        if (C0950.m3785() == 0) {
                            iM3169 = (C0773.m3169("᩸۟") ^ i3) * (-93);
                            i4 = ((iM3169 ^ i2) * 11761) ^ (-959204315);
                            i5 = 1064060209;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۗۧ") + i3) * (-75);
                        i4 = ((iM3169 ^ i2) * 11393) ^ 646790828;
                        i5 = -1902239620;
                        break;
                    case -1822836189:
                    case 344933879:
                        if (!C1826.m6317(itM4942)) {
                            iM3169 = C0619.m2761("ܺۨ") ^ i3;
                            i4 = ((iM3169 ^ i2) * (-13825)) ^ (-1979090398);
                            i5 = 230116831;
                            break;
                        }
                        iM3169 = C0619.m2761("ۘܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22623) ^ (-1150972414);
                        i5 = -469254497;
                        break;
                    case -1556676283:
                    case -1414130079:
                        if (RunnableC0334.f1808 > 0) {
                            iM3169 = (C0773.m3169("᩵᩺") ^ i2) * (-119);
                            i4 = ((iM3169 ^ i3) * (-3005)) ^ 815478440;
                            i5 = -621024409;
                            break;
                        }
                        iM3169 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21993)) ^ 1654960026;
                        i5 = 2050205548;
                        break;
                        break;
                    case -1422953398:
                    case 874238402:
                        return false;
                    case -1124609838:
                    case 701763367:
                        return z;
                    case -1100463397:
                    case 1399321875:
                        C2834.m9344();
                        C2966.m9664();
                        iM3169 = C0773.m3169("ۖ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17729) ^ (-660428724);
                        i5 = 334703142;
                        break;
                    case -1075431103:
                    case 1492584879:
                        if (C2702.f8586 > 0) {
                            iM3169 = C0619.m2761("ᩴ᩺") ^ i2;
                            i4 = ((iM3169 ^ i3) * (-18703)) ^ 233050178;
                            i5 = 1809611475;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۗۧ") + i3) * (-75);
                        i4 = ((iM3169 ^ i2) * 11393) ^ 646790828;
                        i5 = -1902239620;
                        break;
                        break;
                    case -1003521920:
                    case -702483194:
                        AbstractC0641.m2813();
                        if (C3033.m9845() <= 0) {
                            iM3169 = (C0773.m3169("ۗۧ") + i3) * (-75);
                            i4 = ((iM3169 ^ i2) * 11393) ^ 646790828;
                            i5 = -1902239620;
                            break;
                            break;
                        }
                        iM3169 = C0773.m3169("ۖ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17729) ^ (-660428724);
                        i5 = 334703142;
                        break;
                        break;
                    case -957537931:
                    case 1029919200:
                        if (C0269.f1558 > 0) {
                            iM3169 = C0773.m3169("᩷֡") ^ i2;
                            i4 = ((iM3169 ^ i3) * 18493) ^ (-1843210181);
                            i5 = -680761255;
                            break;
                        }
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15091) ^ (-908561340);
                        i5 = 2056662527;
                        break;
                        break;
                    case -603051739:
                    case 1447930330:
                        C2834.m9344();
                        if (C2966.f9654 < 0) {
                            iM3169 = C0619.m2761("ۡ᩷") ^ i2;
                            i4 = ((iM3169 ^ i3) * (-21993)) ^ 1654960026;
                            i5 = 2050205548;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("ᩴ᩸") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 10173) ^ 157742968;
                        i5 = -1860222315;
                        break;
                    case -416510695:
                    case 694973121:
                        C2878.m9491();
                        if (!C3492.m11488()) {
                            iM3169 = (C0619.m2761("ᩴ᩸") + i3) * (-21);
                            i4 = ((iM3169 ^ i2) * 10173) ^ 157742968;
                            i5 = -1860222315;
                            break;
                            break;
                        }
                        iM3169 = C0773.m3169("ۖ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17729) ^ (-660428724);
                        i5 = 334703142;
                        break;
                        break;
                    case -155127402:
                    case 1008567178:
                        if (C1343.f4799 == 0) {
                            iM3169 = C0619.m2761("۫᩷") ^ i2;
                            i4 = ((iM3169 ^ i3) * 299) ^ (-110686145);
                            i5 = 1822359620;
                            break;
                        }
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15091) ^ (-908561340);
                        i5 = 2056662527;
                        break;
                        break;
                    case -134343577:
                    case 1177707749:
                        if (!RunnableC0334.m2063()) {
                            iM3169 = C0619.m2761("᩹᩺") ^ i2;
                            i4 = ((iM3169 ^ i3) * (-29127)) ^ 1524234805;
                            i5 = 917150851;
                            break;
                        }
                        iM3169 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21993)) ^ 1654960026;
                        i5 = 2050205548;
                        break;
                        break;
                    case 7980856:
                    case 2031657017:
                        c21284 = (C21284) C4238.m13529(itM4942);
                        if (!C2023.f6737) {
                            iM3169 = (C0619.m2761("᩺᩸") + i2) * 115;
                            i4 = ((iM3169 ^ i3) * (-19599)) ^ 115678852;
                            i5 = 197198009;
                            break;
                        }
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15091) ^ (-908561340);
                        i5 = 2056662527;
                        break;
                        break;
                    case 864638063:
                    case 2061757847:
                        arrayList = this.f59690;
                        if (C4238.m13540() > 0) {
                            iM3169 = C0773.m3169("ۢۛ") ^ i3;
                            i4 = ((iM3169 ^ i2) * 13039) ^ (-6900607);
                            i5 = 427702787;
                            break;
                        }
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15091) ^ (-908561340);
                        i5 = 2056662527;
                        break;
                        break;
                    default:
                        if (c21284.m48475() != 1) {
                            z = true;
                            iM3169 = C0773.m3169("ܺ᩻") ^ i3;
                            i4 = ((iM3169 ^ i2) * 3583) ^ (-1251098093);
                            i5 = 901881817;
                            break;
                        }
                        int iM2761 = (C0619.m2761("ᩳۖ") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * 17537) ^ 1745730654;
                        i6 = iM2761 ^ 2095196367;
                        z = true;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m42667() {
        return this.f59681;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m42660() {
        return this.f59678;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m42677() {
        return this.f59677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42656(C25277 c25277) throws C4866 {
        int iM2761;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        short[] sArr;
        int i4;
        String str6;
        StringBuilder sb;
        StringBuilder sb2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        char c;
        char c2;
        String str13;
        StringBuilder sb3;
        char c3;
        String str14;
        String str15;
        String str16;
        String str17;
        int i5;
        int iM3169;
        int i6;
        int i7;
        char c4;
        char c5;
        String str18;
        String str19;
        String str20;
        int i8;
        int iM31610;
        int i9;
        int i10;
        String str21;
        String str22;
        String str23;
        short[] sArr2;
        int i11;
        String strM4939;
        StringBuilder sb4;
        int i12;
        StringBuilder sb5;
        String str24;
        char c6;
        String str25;
        String str26;
        String strM4058;
        int iM2762;
        int i13;
        int iM31611;
        int i14;
        this = this;
        c25277 = c25277;
        int i15 = -581800894;
        int i16 = C2375.f7641;
        int i17 = C0773.f2792;
        int iM2763 = C0619.m2761("ۗ֨") ^ i17;
        int i18 = ((iM2763 ^ i16) * (-1097)) ^ (-259546150);
        int i19 = iM2763 ^ 424250615;
        String strM8166 = null;
        String str27 = null;
        String str28 = null;
        StringBuilder sb6 = null;
        short[] sArr3 = null;
        char c7 = 0;
        int i20 = 0;
        String str29 = null;
        String str30 = null;
        Iterator itM13647 = null;
        String str31 = null;
        String strM6952 = null;
        String str32 = null;
        StringBuilder sb7 = null;
        char c8 = 0;
        String name = null;
        StringBuilder sb8 = null;
        String strM4059 = null;
        int i21 = 0;
        String strM6953 = null;
        String str33 = null;
        String strM13534 = null;
        C21284 c21284 = null;
        StringBuilder sb9 = null;
        String strM6954 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-28615)) >> 31));
            switch (i15) {
                case -2131590359:
                case -345276431:
                    str28 = str28;
                    str = str33;
                    c8 = c8;
                    char c9 = c7;
                    i3 = i20;
                    str2 = str27;
                    sb6 = sb6;
                    str3 = strM13534;
                    str29 = str29;
                    str4 = str31;
                    str5 = str32;
                    sArr = sArr3;
                    c7 = c9;
                    strM8166 = C2419.m8166(f59666, 568, 1, i21);
                    StringBuilder sb10 = new StringBuilder(strM8166);
                    name = TranslationEngine.class.getName();
                    if (C2485.m8357() > 0) {
                        int iM31612 = (C0773.m3169("ۡᩴ") + i16) * 27;
                        sb7 = sb10;
                        i4 = ((iM31612 ^ i17) * (-24487)) ^ 225862925;
                        i19 = iM31612 ^ 603131869;
                        strM13534 = str3;
                        sArr3 = sArr;
                        i20 = i3;
                        str27 = str2;
                        str32 = str5;
                        str33 = str;
                        str28 = str28;
                        strM8166 = strM8166;
                        c8 = c8;
                        str31 = str4;
                        str29 = str29;
                        sb6 = sb6;
                        c7 = c7;
                        name = name;
                        i18 = i4;
                        this = this;
                    } else {
                        sb7 = sb10;
                        int iM2764 = (C0619.m2761("֫ۡ") ^ i16) * 81;
                        i6 = ((iM2764 ^ i17) * 8735) ^ (-1800150399);
                        i19 = iM2764 ^ 1471518248;
                        this = this;
                        strM13534 = str3;
                        sArr3 = sArr;
                        i20 = i3;
                        str27 = str2;
                        str32 = str5;
                        str33 = str;
                        strM8166 = strM8166;
                        c8 = c8;
                        str31 = str4;
                        c25277 = c25277;
                        str29 = str29;
                        sb6 = sb6;
                        c7 = c7;
                        name = name;
                        i18 = i6;
                        str28 = str28;
                    }
                    break;
                case -2080563399:
                case -1818249479:
                    str28 = str28;
                    strM6953 = strM6953;
                    if (!c25277.m56437(str33, str27)) {
                        iM3169 = (C0773.m3169("۬ᩴ") ^ i17) * 35;
                        i6 = ((iM3169 ^ i16) * (-32695)) ^ 230462246;
                        i7 = -383460299;
                        strM6953 = strM6953;
                        i19 = iM3169 ^ i7;
                        i18 = i6;
                        str28 = str28;
                    } else {
                        c4 = c8;
                        c5 = c7;
                        str18 = strM8166;
                        strM6953 = strM6953;
                        str19 = str27;
                        sb6 = sb6;
                        str20 = str29;
                        int iM31613 = (i16 - C0773.m3169("ܺܺ")) * 29;
                        i12 = ((iM31613 ^ i17) * 31405) ^ (-1423704541);
                        i19 = iM31613 ^ 2000155311;
                        c25277 = c25277;
                        strM8166 = str18;
                        str29 = str20;
                        sb6 = sb6;
                        str28 = str28;
                        c7 = c5;
                        i18 = i12;
                        str27 = str19;
                        c8 = c4;
                    }
                    break;
                case -1981094079:
                case 1197290714:
                    C2834.m9344();
                    C2375.m8065();
                    return;
                case -1940853642:
                case 1136169693:
                    str28 = str28;
                    sb5 = sb8;
                    str24 = strM13534;
                    c6 = c8;
                    c5 = c7;
                    str25 = strM8166;
                    str26 = str29;
                    C1783.m6234(sb5, str24);
                    C3779.m12258(sb5, str26);
                    String strM6955 = C2023.m6952(sb5);
                    StringBuilder sb11 = new StringBuilder(str25);
                    C1783.m6234(sb11, C0950.m3787(PluginPreference.class.getName(), c6, c5));
                    C1783.m6234(sb11, str26);
                    strM4058 = C1080.m4058(sb11);
                    itM13647 = C4282.m13647(this.f59690);
                    str30 = strM6955;
                    int iM31614 = C0773.m3169("᩷᩷") ^ i16;
                    i4 = ((iM31614 ^ i17) * (-18275)) ^ 840787506;
                    i19 = iM31614 ^ (-2037489020);
                    sb8 = sb5;
                    c8 = c6;
                    strM13534 = str24;
                    str27 = strM4058;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = str25;
                    str31 = str31;
                    str28 = str28;
                    str29 = str26;
                    sb6 = sb6;
                    c7 = c5;
                    i18 = i4;
                    this = this;
                    break;
                case -1850029082:
                case 1671726111:
                    str28 = str28;
                    c4 = c8;
                    c5 = c7;
                    str18 = strM8166;
                    str19 = str27;
                    sb6 = sb6;
                    str20 = str29;
                    String str34 = this.f59681;
                    if (str34 == null) {
                        str31 = str34;
                        int iM31615 = (i16 - C0773.m3169("ܺܺ")) * 29;
                        i12 = ((iM31615 ^ i17) * 31405) ^ (-1423704541);
                        i19 = iM31615 ^ 2000155311;
                        c25277 = c25277;
                        strM8166 = str18;
                        str29 = str20;
                        sb6 = sb6;
                        str28 = str28;
                        c7 = c5;
                        i18 = i12;
                        str27 = str19;
                        c8 = c4;
                    } else {
                        iM31611 = (C0773.m3169("ۘ᩷") + i17) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str21 = str34;
                        i9 = ((iM31611 ^ i16) * (-31125)) ^ (-346851924);
                        i14 = 1420119814;
                        i19 = iM31611 ^ i14;
                        strM8166 = str18;
                        str31 = str21;
                        str27 = str19;
                        str28 = str28;
                        c8 = c4;
                        str29 = str20;
                        sb6 = sb6;
                        c7 = c5;
                        i18 = i9;
                        c25277 = c25277;
                    }
                    break;
                case -1812330559:
                case 1218760857:
                    if (c25277.m56437(strM6952, strM6953)) {
                        iM2761 = C0773.m3169("ܰۖ") ^ i16;
                        i = ((iM2761 ^ i17) * 28553) ^ (-981228618);
                        i2 = -2023797509;
                    } else {
                        iM2761 = (C0773.m3169("ۖۨ") + i17) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i16) * 7805) ^ 636798846;
                        i2 = -2127670953;
                    }
                    i19 = iM2761 ^ i2;
                    i18 = i;
                    break;
                case -1659161334:
                case 1123847098:
                    RunnableC3055.m9933();
                    if (C3998.f13671 == 0) {
                        str28 = str28;
                        sb3 = sb8;
                        c3 = c8;
                        c2 = c7;
                        str10 = strM8166;
                        str14 = str27;
                        sb = sb6;
                        str12 = str33;
                        str15 = strM13534;
                        str8 = str29;
                        str16 = str31;
                        str17 = str32;
                        int iM31616 = C0773.m3169("᩸۫") ^ i17;
                        i8 = ((iM31616 ^ i16) * 10737) ^ (-288766792);
                        i19 = iM31616 ^ 1215821035;
                        this = this;
                        sb8 = sb3;
                        strM13534 = str15;
                        str27 = str14;
                        str33 = str12;
                        strM8166 = str10;
                        c8 = c3;
                        str28 = str28;
                        StringBuilder sb12 = sb;
                        c7 = c2;
                        i18 = i8;
                        str32 = str17;
                        str31 = str16;
                        str29 = str8;
                        sb6 = sb12;
                    } else {
                        str28 = str28;
                        str13 = name;
                        sb2 = sb7;
                        c = c8;
                        c2 = c7;
                        str10 = strM8166;
                        str6 = str27;
                        sb = sb6;
                        str12 = str33;
                        str7 = strM13534;
                        str8 = str29;
                        str9 = str31;
                        str11 = str32;
                        int iM2765 = C0619.m2761("ۡ᩵") ^ i17;
                        i5 = ((iM2765 ^ i16) * 18257) ^ 1971723583;
                        i19 = iM2765 ^ (-76255140);
                        sb7 = sb2;
                        name = str13;
                        strM13534 = str7;
                        str27 = str6;
                        str32 = str11;
                        c8 = c;
                        str31 = str9;
                        str29 = str8;
                        sb6 = sb;
                        c7 = c2;
                        i18 = i5;
                        str33 = str12;
                        strM8166 = str10;
                        str28 = str28;
                    }
                    break;
                case -1601323148:
                case 437082814:
                    if (C2834.m9344() < 0) {
                        iM2761 = C0619.m2761("ܳ᩻") ^ i16;
                        i = ((iM2761 ^ i17) * (-19805)) ^ (-1415273000);
                        i2 = -372942629;
                        i19 = iM2761 ^ i2;
                        i18 = i;
                    } else {
                        str28 = str28;
                        str13 = name;
                        sb2 = sb7;
                        c = c8;
                        c2 = c7;
                        str10 = strM8166;
                        str6 = str27;
                        sb = sb6;
                        str12 = str33;
                        str7 = strM13534;
                        str8 = str29;
                        str9 = str31;
                        str11 = str32;
                        int iM2766 = C0619.m2761("ۡ᩵") ^ i17;
                        i5 = ((iM2766 ^ i16) * 18257) ^ 1971723583;
                        i19 = iM2766 ^ (-76255140);
                        sb7 = sb2;
                        name = str13;
                        strM13534 = str7;
                        str27 = str6;
                        str32 = str11;
                        c8 = c;
                        str31 = str9;
                        str29 = str8;
                        sb6 = sb;
                        c7 = c2;
                        i18 = i5;
                        str33 = str12;
                        strM8166 = str10;
                        str28 = str28;
                    }
                    break;
                case -1441914894:
                case 15206458:
                    str28 = str28;
                    String str35 = strM6953;
                    StringBuilder sb13 = new StringBuilder(RunnableC3055.m9937(f59666, 699, 21, i21));
                    C3779.m12258(sb13, c21284.f67874);
                    C5448.m16278(C2023.m6952(sb13));
                    String str36 = c21284.f67874;
                    if (C0862.m3503()) {
                        throw new C4866(C17202.m40366(C0773.m3169(C3998.m12925(f59666, c.e, 3, i21)) ^ 2125497606, new Object[]{str36}));
                    }
                    strM4939 = str29;
                    c4 = c8;
                    c5 = c7;
                    str21 = str31;
                    str18 = strM8166;
                    strM6953 = str35;
                    str19 = str27;
                    sb6 = sb6;
                    str22 = str32;
                    str23 = str33;
                    sb4 = sb7;
                    sArr2 = sArr3;
                    i11 = i20;
                    int iM2767 = C0619.m2761("ۤܶ") ^ i17;
                    int i22 = ((iM2767 ^ i16) * (-16917)) ^ (-1609979823);
                    i19 = iM2767 ^ (-1877634894);
                    c25277 = c25277;
                    sb7 = sb4;
                    sArr3 = sArr2;
                    i20 = i11;
                    sb6 = sb6;
                    str32 = str22;
                    str33 = str23;
                    c7 = c5;
                    strM8166 = str18;
                    i18 = i22;
                    str31 = str21;
                    str27 = str19;
                    str28 = str28;
                    str29 = strM4939;
                    c8 = c4;
                    this = this;
                    break;
                case -1383346846:
                case 1809264111:
                    String str37 = str28;
                    String str38 = name;
                    char c10 = c8;
                    char c11 = c7;
                    String str39 = strM8166;
                    String str40 = str27;
                    StringBuilder sb14 = sb6;
                    String str41 = str33;
                    String str42 = strM13534;
                    String str43 = str29;
                    String str44 = str31;
                    int i23 = i20;
                    String str45 = str32;
                    short[] sArr4 = sArr3;
                    short s = f59666[567];
                    if (((s * s) + 640000) - (s * 1600) < 0) {
                        iM31610 = (i16 - C0619.m2761("᩶᩶")) * (-63);
                        i9 = ((iM31610 ^ i17) * 29771) ^ (-829513390);
                        i10 = 665848580;
                    } else {
                        iM31610 = C0773.m3169("۫۫") ^ i17;
                        i9 = ((iM31610 ^ i16) * (-6433)) ^ 1507346955;
                        i10 = 1071206232;
                    }
                    i19 = iM31610 ^ i10;
                    this = this;
                    strM13534 = str42;
                    sArr3 = sArr4;
                    i20 = i23;
                    str27 = str40;
                    str32 = str45;
                    str33 = str41;
                    strM8166 = str39;
                    c8 = c10;
                    str31 = str44;
                    str28 = str37;
                    str29 = str43;
                    sb6 = sb14;
                    c7 = c11;
                    name = str38;
                    i18 = i9;
                    c25277 = c25277;
                    break;
                case -1380543038:
                case -1088837975:
                    str28 = str28;
                    sb3 = sb8;
                    c3 = c8;
                    c2 = c7;
                    str10 = strM8166;
                    str14 = str27;
                    sb = sb6;
                    str12 = str33;
                    str15 = strM13534;
                    str8 = str29;
                    str16 = str31;
                    str17 = str32;
                    StringBuilder sb15 = new StringBuilder(str10);
                    C1783.m6234(sb15, C4238.m13534(TextEditorFloatingMenu.class.getName(), c3, c2));
                    C1783.m6234(sb15, str8);
                    if (C3734.m12152() < 0) {
                        int iM2768 = C0619.m2761("ܿܳ") ^ i16;
                        i5 = ((iM2768 ^ i17) * (-21741)) ^ 1816441420;
                        i19 = iM2768 ^ 1418626777;
                        sb9 = sb15;
                        sb8 = sb3;
                        strM13534 = str15;
                        str27 = str14;
                        str32 = str17;
                        c8 = c3;
                        str31 = str16;
                        str29 = str8;
                        sb6 = sb;
                        c7 = c2;
                        i18 = i5;
                        str33 = str12;
                        strM8166 = str10;
                        str28 = str28;
                    } else {
                        sb9 = sb15;
                        int iM31617 = C0773.m3169("᩸۫") ^ i17;
                        i8 = ((iM31617 ^ i16) * 10737) ^ (-288766792);
                        i19 = iM31617 ^ 1215821035;
                        this = this;
                        sb8 = sb3;
                        strM13534 = str15;
                        str27 = str14;
                        str33 = str12;
                        strM8166 = str10;
                        c8 = c3;
                        str28 = str28;
                        StringBuilder sb16 = sb;
                        c7 = c2;
                        i18 = i8;
                        str32 = str17;
                        str31 = str16;
                        str29 = str8;
                        sb6 = sb16;
                    }
                    break;
                case -1375953993:
                case 384246972:
                    C1542.m5459();
                    if (C0862.f3233 != 0) {
                        int iM2769 = (i17 - C0619.m2761("ۙ۫")) * 71;
                        i6 = ((iM2769 ^ i16) * 27331) ^ (-683387230);
                        i19 = iM2769 ^ 1765479285;
                        i18 = i6;
                        str28 = str28;
                    } else {
                        str28 = str28;
                        sb3 = sb8;
                        c3 = c8;
                        c2 = c7;
                        str10 = strM8166;
                        str14 = str27;
                        sb = sb6;
                        str12 = str33;
                        str15 = strM13534;
                        str8 = str29;
                        str16 = str31;
                        str17 = str32;
                        int iM31618 = C0773.m3169("᩸۫") ^ i17;
                        i8 = ((iM31618 ^ i16) * 10737) ^ (-288766792);
                        i19 = iM31618 ^ 1215821035;
                        this = this;
                        sb8 = sb3;
                        strM13534 = str15;
                        str27 = str14;
                        str33 = str12;
                        strM8166 = str10;
                        c8 = c3;
                        str28 = str28;
                        StringBuilder sb17 = sb;
                        c7 = c2;
                        i18 = i8;
                        str32 = str17;
                        str31 = str16;
                        str29 = str8;
                        sb6 = sb17;
                    }
                    break;
                case -1367152053:
                case 1661174056:
                    str28 = str28;
                    strM6953 = strM6953;
                    if (c25277.m56437(strM6952, strM4059)) {
                        iM3169 = (C0619.m2761("᩸ᩴ") + i17) * (-65);
                        i6 = ((iM3169 ^ i16) * (-23483)) ^ 1487159046;
                        i7 = -1630103124;
                    } else {
                        iM3169 = (C0619.m2761("ܽܳ") ^ i16) * 13;
                        i6 = ((iM3169 ^ i17) * (-5557)) ^ (-1974537347);
                        i7 = -1486807243;
                    }
                    strM6953 = strM6953;
                    i19 = iM3169 ^ i7;
                    i18 = i6;
                    str28 = str28;
                    break;
                case -1294395570:
                case -494193463:
                    C2375.m8065();
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩹ۢ") + i16) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM3169 ^ i17) * (-32171)) ^ 386666944;
                        i7 = 487373884;
                        strM6953 = strM6953;
                        i19 = iM3169 ^ i7;
                        i18 = i6;
                        str28 = str28;
                    }
                    str28 = str28;
                    str13 = name;
                    sb2 = sb7;
                    c = c8;
                    c2 = c7;
                    str10 = strM8166;
                    str6 = str27;
                    sb = sb6;
                    str12 = str33;
                    str7 = strM13534;
                    str8 = str29;
                    str9 = str31;
                    str11 = str32;
                    int iM27610 = C0619.m2761("ۡ᩵") ^ i17;
                    i5 = ((iM27610 ^ i16) * 18257) ^ 1971723583;
                    i19 = iM27610 ^ (-76255140);
                    sb7 = sb2;
                    name = str13;
                    strM13534 = str7;
                    str27 = str6;
                    str32 = str11;
                    c8 = c;
                    str31 = str9;
                    str29 = str8;
                    sb6 = sb;
                    c7 = c2;
                    i18 = i5;
                    str33 = str12;
                    strM8166 = str10;
                    str28 = str28;
                    break;
                case -1270677285:
                case 2050676407:
                    c21284.m48473(3);
                    StringBuilder sb18 = new StringBuilder(C0619.m2756(f59666, 672, 27, i21));
                    C1783.m6234(sb18, c21284.f67874);
                    C5448.m16278(C1080.m4058(sb18));
                    sb5 = sb8;
                    c6 = c8;
                    c5 = c7;
                    str25 = strM8166;
                    strM6953 = strM6953;
                    str26 = str29;
                    strM4058 = str27;
                    str24 = strM13534;
                    int iM31619 = C0773.m3169("᩷᩷") ^ i16;
                    i4 = ((iM31619 ^ i17) * (-18275)) ^ 840787506;
                    i19 = iM31619 ^ (-2037489020);
                    sb8 = sb5;
                    c8 = c6;
                    strM13534 = str24;
                    str27 = strM4058;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = str25;
                    str31 = str31;
                    str28 = str28;
                    str29 = str26;
                    sb6 = sb6;
                    c7 = c5;
                    i18 = i4;
                    this = this;
                    break;
                case -1220413711:
                case 1885470585:
                    str28 = str28;
                    str6 = str27;
                    sb = sb6;
                    sb2 = sb7;
                    str7 = strM13534;
                    str8 = str29;
                    str9 = str31;
                    str10 = strM8166;
                    str11 = str32;
                    str12 = str33;
                    c = '.';
                    c2 = '/';
                    str13 = name;
                    C3779.m12258(sb2, C4238.m13534(str13, '.', '/'));
                    sArr3 = f59666;
                    i20 = 569;
                    if (C2966.f9654 >= 0) {
                        int iM27611 = C0619.m2761("ۡ᩵") ^ i17;
                        i5 = ((iM27611 ^ i16) * 18257) ^ 1971723583;
                        i19 = iM27611 ^ (-76255140);
                        sb7 = sb2;
                        name = str13;
                        strM13534 = str7;
                        str27 = str6;
                        str32 = str11;
                        c8 = c;
                        str31 = str9;
                        str29 = str8;
                        sb6 = sb;
                        c7 = c2;
                        i18 = i5;
                        str33 = str12;
                        strM8166 = str10;
                        str28 = str28;
                    } else {
                        int iM31620 = C0773.m3169("ۗۡ") ^ i17;
                        i19 = iM31620 ^ 1665854803;
                        c25277 = c25277;
                        sb7 = sb2;
                        name = str13;
                        strM13534 = str7;
                        i18 = ((iM31620 ^ i16) * (-23941)) ^ 1936541598;
                        str27 = str6;
                        str32 = str11;
                        str33 = str12;
                        c8 = '.';
                        this = this;
                        strM8166 = str10;
                        str31 = str9;
                        str28 = str28;
                        str29 = str8;
                        sb6 = sb;
                        c7 = '/';
                    }
                    break;
                case -893230791:
                case 599256270:
                    AbstractC0641.m2813();
                    if (C0269.f1558 <= 0) {
                        int iM31621 = C0773.m3169("ۗ᩹") ^ i17;
                        i = ((iM31621 ^ i16) * (-8671)) ^ 1019998465;
                        strM6953 = strM6953;
                        i19 = iM31621 ^ 1696559125;
                        i18 = i;
                    } else {
                        int iM27612 = (i17 - C0619.m2761("ۙ۫")) * 71;
                        i6 = ((iM27612 ^ i16) * 27331) ^ (-683387230);
                        i19 = iM27612 ^ 1765479285;
                        i18 = i6;
                        str28 = str28;
                    }
                    break;
                case -605269542:
                case 1116212534:
                    str28 = str28;
                    strM6953 = strM6953;
                    sb6 = new StringBuilder(C1519.m5399(f59666, 617, 29, i21));
                    str32 = this.f59681;
                    if (!C17202.f56030) {
                        strM6953 = strM6953;
                        str2 = str27;
                        sb6 = sb6;
                        str = str33;
                        str3 = strM13534;
                        str29 = str29;
                        str4 = str31;
                        i3 = i20;
                        str5 = str32;
                        sArr = sArr3;
                        int iM27613 = (C0619.m2761("֫ۡ") ^ i16) * 81;
                        i6 = ((iM27613 ^ i17) * 8735) ^ (-1800150399);
                        i19 = iM27613 ^ 1471518248;
                        this = this;
                        strM13534 = str3;
                        sArr3 = sArr;
                        i20 = i3;
                        str27 = str2;
                        str32 = str5;
                        str33 = str;
                        strM8166 = strM8166;
                        c8 = c8;
                        str31 = str4;
                        c25277 = c25277;
                        str29 = str29;
                        sb6 = sb6;
                        c7 = c7;
                        name = name;
                        i18 = i6;
                        str28 = str28;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩻") ^ i16;
                        i6 = ((iM3169 ^ i17) * (-5395)) ^ 31696228;
                        i7 = 1294714987;
                        strM6953 = strM6953;
                        i19 = iM3169 ^ i7;
                        i18 = i6;
                        str28 = str28;
                    }
                    break;
                case -452537601:
                case -140249656:
                    c21284.m48473(2);
                    StringBuilder sb19 = new StringBuilder(C17202.m40377(f59666, 649, 23, i21));
                    C1783.m6234(sb19, c21284.f67874);
                    C5448.m16278(C2023.m6952(sb19));
                    sb5 = sb8;
                    c6 = c8;
                    c5 = c7;
                    str25 = strM8166;
                    strM6953 = strM6953;
                    str26 = str29;
                    strM4058 = str27;
                    str24 = strM13534;
                    int iM316110 = C0773.m3169("᩷᩷") ^ i16;
                    i4 = ((iM316110 ^ i17) * (-18275)) ^ 840787506;
                    i19 = iM316110 ^ (-2037489020);
                    sb8 = sb5;
                    c8 = c6;
                    strM13534 = str24;
                    str27 = strM4058;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = str25;
                    str31 = str31;
                    str28 = str28;
                    str29 = str26;
                    sb6 = sb6;
                    c7 = c5;
                    i18 = i4;
                    this = this;
                    break;
                case -405925614:
                case 1234440742:
                    str28 = str28;
                    c4 = c8;
                    c5 = c7;
                    str18 = strM8166;
                    str19 = str27;
                    sb6 = sb6;
                    str20 = str29;
                    str21 = str31;
                    c21284 = (C21284) C0950.m3796(itM13647);
                    String str46 = c21284.f67874;
                    StringBuilder sb20 = new StringBuilder(str18);
                    C1783.m6234(sb20, C0950.m3787(str46, c4, c5));
                    C1783.m6234(sb20, str20);
                    strM6952 = C2023.m6952(sb20);
                    if (!c25277.m56436(strM6952)) {
                        int iM27614 = (i16 - C0619.m2761("۬ۚ")) * 43;
                        i12 = ((iM27614 ^ i17) * (-28195)) ^ (-1785672838);
                        i19 = iM27614 ^ 610693066;
                        strM8166 = str18;
                        str31 = str21;
                        str28 = str28;
                        str29 = str20;
                        sb6 = sb6;
                        c7 = c5;
                        i18 = i12;
                        str27 = str19;
                        c8 = c4;
                    } else {
                        iM31611 = (C0619.m2761("ܰ۫") ^ i17) * 63;
                        i9 = ((iM31611 ^ i16) * 1359) ^ 1531437121;
                        i14 = 2108454903;
                        i19 = iM31611 ^ i14;
                        strM8166 = str18;
                        str31 = str21;
                        str27 = str19;
                        str28 = str28;
                        c8 = c4;
                        str29 = str20;
                        sb6 = sb6;
                        c7 = c5;
                        i18 = i9;
                        c25277 = c25277;
                    }
                    break;
                case -257859503:
                case -15336733:
                    StringBuilder sb21 = new StringBuilder(str28);
                    C3779.m12258(sb21, this.f59681);
                    C5448.m16278(C2023.m6952(sb21));
                    String str47 = this.f59681;
                    Object[] objArr = new Object[1];
                    if (C0950.f3488 < 0) {
                        objArr[0] = str47;
                        throw new C4866(C17202.m40366(C0773.m3169(C3690.m11996(f59666, 592, 3, i21)) ^ 2118953627, objArr));
                    }
                    int iM31622 = C0773.m3169("ۗ᩹") ^ i17;
                    i = ((iM31622 ^ i16) * (-8671)) ^ 1019998465;
                    strM6953 = strM6953;
                    i19 = iM31622 ^ 1696559125;
                    i18 = i;
                    break;
                case -229394403:
                case 294791519:
                    char c12 = c8;
                    c2 = c7;
                    String str48 = strM8166;
                    String str49 = str27;
                    sb = sb6;
                    str8 = str29;
                    str16 = str31;
                    boolean zM6317 = C1826.m6317(itM13647);
                    str17 = str32;
                    String str50 = str33;
                    String strM5399 = C1519.m5399(f59666, 570, 19, i21);
                    if (zM6317) {
                        iM2762 = (C0619.m2761("ۙۨ") + i17) * (-103);
                        i8 = ((iM2762 ^ i16) * 31423) ^ 1991553387;
                        i13 = 103503114;
                    } else {
                        iM2762 = C0619.m2761("ܶۢ") ^ i17;
                        i8 = ((iM2762 ^ i16) * 11185) ^ (-435507195);
                        i13 = -484158173;
                    }
                    i19 = iM2762 ^ i13;
                    str33 = str50;
                    strM8166 = str48;
                    str28 = strM5399;
                    str27 = str49;
                    c8 = c12;
                    StringBuilder sb110 = sb;
                    c7 = c2;
                    i18 = i8;
                    str32 = str17;
                    str31 = str16;
                    str29 = str8;
                    sb6 = sb110;
                    break;
                case -209634012:
                case 710780084:
                    c21284.m48473(1);
                    StringBuilder sb22 = new StringBuilder(C2966.m9670(f59666, 595, 22, i21));
                    C3779.m12258(sb22, c21284.f67874);
                    C5448.m16278(C1080.m4058(sb22));
                    sb5 = sb8;
                    c6 = c8;
                    c5 = c7;
                    str25 = strM8166;
                    strM6953 = strM6953;
                    str26 = str29;
                    strM4058 = str27;
                    str24 = strM13534;
                    int iM316111 = C0773.m3169("᩷᩷") ^ i16;
                    i4 = ((iM316111 ^ i17) * (-18275)) ^ 840787506;
                    i19 = iM316111 ^ (-2037489020);
                    sb8 = sb5;
                    c8 = c6;
                    strM13534 = str24;
                    str27 = strM4058;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = str25;
                    str31 = str31;
                    str28 = str28;
                    str29 = str26;
                    sb6 = sb6;
                    c7 = c5;
                    i18 = i4;
                    this = this;
                    break;
                case -129972022:
                case 1296558737:
                    i21 = 16916;
                    int iM31623 = (i17 - C0773.m3169("ܰᩴ")) * (-113);
                    sb7 = sb7;
                    i4 = ((iM31623 ^ i16) * 13013) ^ (-2017206750);
                    i19 = iM31623 ^ (-2095989862);
                    strM13534 = strM13534;
                    sArr3 = sArr3;
                    i20 = i20;
                    str27 = str27;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = strM8166;
                    c8 = c8;
                    str31 = str31;
                    str28 = str28;
                    str29 = str29;
                    sb6 = sb6;
                    c7 = c7;
                    name = name;
                    i18 = i4;
                    this = this;
                    break;
                case -80888609:
                case 431611005:
                    i21 = 49055;
                    int iM31624 = (i17 - C0773.m3169("ܰᩴ")) * (-113);
                    sb7 = sb7;
                    i4 = ((iM31624 ^ i16) * 13013) ^ (-2017206750);
                    i19 = iM31624 ^ (-2095989862);
                    strM13534 = strM13534;
                    sArr3 = sArr3;
                    i20 = i20;
                    str27 = str27;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = strM8166;
                    c8 = c8;
                    str31 = str31;
                    str28 = str28;
                    str29 = str29;
                    sb6 = sb6;
                    c7 = c7;
                    name = name;
                    i18 = i4;
                    this = this;
                    break;
                case -50523051:
                case 1244360154:
                    return;
                case 239716688:
                case 299126544:
                    str28 = str28;
                    c4 = c8;
                    c5 = c7;
                    str21 = str31;
                    str18 = strM8166;
                    str19 = str27;
                    sb6 = sb6;
                    str22 = str32;
                    str23 = str33;
                    String str51 = strM13534;
                    sArr2 = sArr3;
                    i11 = i20;
                    strM4939 = C1343.m4939(sArr2, i11, 1, i21);
                    sb4 = sb7;
                    C3779.m12258(sb4, strM4939);
                    strM6953 = C2023.m6952(sb4);
                    StringBuilder sb23 = new StringBuilder(str18);
                    C1783.m6234(sb23, C0950.m3787(TextEditorFunction.class.getName(), c4, c5));
                    C3779.m12258(sb23, strM4939);
                    strM6954 = C2023.m6952(sb23);
                    if (C11235.f35427 < 0) {
                        int iM31625 = C0773.m3169("᩹ۘ") ^ i16;
                        i4 = ((iM31625 ^ i17) * 927) ^ (-1123733030);
                        i19 = iM31625 ^ (-647284028);
                        strM13534 = str51;
                        sArr3 = sArr2;
                        i20 = i11;
                        str27 = str19;
                        str32 = str22;
                        str33 = str23;
                        strM8166 = str18;
                        c8 = c4;
                        str31 = str21;
                        str28 = str28;
                        str29 = strM4939;
                        sb7 = sb4;
                        sb6 = sb6;
                        c7 = c5;
                        i18 = i4;
                        this = this;
                    } else {
                        strM13534 = str51;
                        int iM27615 = C0619.m2761("ۤܶ") ^ i17;
                        int i24 = ((iM27615 ^ i16) * (-16917)) ^ (-1609979823);
                        i19 = iM27615 ^ (-1877634894);
                        c25277 = c25277;
                        sb7 = sb4;
                        sArr3 = sArr2;
                        i20 = i11;
                        sb6 = sb6;
                        str32 = str22;
                        str33 = str23;
                        c7 = c5;
                        strM8166 = str18;
                        i18 = i24;
                        str31 = str21;
                        str27 = str19;
                        str28 = str28;
                        str29 = strM4939;
                        c8 = c4;
                        this = this;
                    }
                    break;
                case 261836010:
                case 1497786784:
                    c21284.m48473(4);
                    StringBuilder sb24 = new StringBuilder(C3779.m12266(f59666, 723, 23, i21));
                    C3779.m12258(sb24, c21284.f67874);
                    C5448.m16278(C2023.m6952(sb24));
                    sb5 = sb8;
                    c6 = c8;
                    c5 = c7;
                    str25 = strM8166;
                    strM6953 = strM6953;
                    str26 = str29;
                    strM4058 = str27;
                    str24 = strM13534;
                    int iM316112 = C0773.m3169("᩷᩷") ^ i16;
                    i4 = ((iM316112 ^ i17) * (-18275)) ^ 840787506;
                    i19 = iM316112 ^ (-2037489020);
                    sb8 = sb5;
                    c8 = c6;
                    strM13534 = str24;
                    str27 = strM4058;
                    str32 = str32;
                    str33 = str33;
                    strM8166 = str25;
                    str31 = str31;
                    str28 = str28;
                    str29 = str26;
                    sb6 = sb6;
                    c7 = c5;
                    i18 = i4;
                    this = this;
                    break;
                case 390359290:
                case 988460849:
                    C3099.m10095();
                    str28 = str28;
                    str13 = name;
                    sb2 = sb7;
                    c = c8;
                    c2 = c7;
                    str10 = strM8166;
                    str6 = str27;
                    sb = sb6;
                    str12 = str33;
                    str7 = strM13534;
                    str8 = str29;
                    str9 = str31;
                    str11 = str32;
                    int iM27616 = C0619.m2761("ۡ᩵") ^ i17;
                    i5 = ((iM27616 ^ i16) * 18257) ^ 1971723583;
                    i19 = iM27616 ^ (-76255140);
                    sb7 = sb2;
                    name = str13;
                    strM13534 = str7;
                    str27 = str6;
                    str32 = str11;
                    c8 = c;
                    str31 = str9;
                    str29 = str8;
                    sb6 = sb;
                    c7 = c2;
                    i18 = i5;
                    str33 = str12;
                    strM8166 = str10;
                    str28 = str28;
                    break;
                case 394389054:
                case 1723563949:
                    if (C0487.f2131 > 0) {
                        str28 = str28;
                        str2 = str27;
                        sb6 = sb6;
                        str = str33;
                        str3 = strM13534;
                        str29 = str29;
                        str4 = str31;
                        i3 = i20;
                        str5 = str32;
                        sArr = sArr3;
                        int iM27617 = (C0619.m2761("֫ۡ") ^ i16) * 81;
                        i6 = ((iM27617 ^ i17) * 8735) ^ (-1800150399);
                        i19 = iM27617 ^ 1471518248;
                        this = this;
                        strM13534 = str3;
                        sArr3 = sArr;
                        i20 = i3;
                        str27 = str2;
                        str32 = str5;
                        str33 = str;
                        strM8166 = strM8166;
                        c8 = c8;
                        str31 = str4;
                        c25277 = c25277;
                        str29 = str29;
                        sb6 = sb6;
                        c7 = c7;
                        name = name;
                        i18 = i6;
                        str28 = str28;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩻") ^ i16;
                        i = ((iM2761 ^ i17) * (-19805)) ^ (-1415273000);
                        i2 = -372942629;
                        i19 = iM2761 ^ i2;
                        i18 = i;
                    }
                    break;
                case 427657244:
                case 746832392:
                    str28 = str28;
                    strM6953 = strM6953;
                    if (c25277.m56437(strM6952, strM6954)) {
                        iM3169 = (C0773.m3169("۟᩻") + i17) * 77;
                        i6 = ((iM3169 ^ i16) * (-15535)) ^ 1829649903;
                        i7 = -1661697570;
                    } else {
                        iM3169 = C0619.m2761("᩵ܿ") ^ i17;
                        i6 = ((iM3169 ^ i16) * 27267) ^ (-2121596083);
                        i7 = -601904760;
                    }
                    strM6953 = strM6953;
                    i19 = iM3169 ^ i7;
                    i18 = i6;
                    str28 = str28;
                    break;
                case 468796569:
                case 1472467854:
                    String str52 = str28;
                    String str53 = strM8166;
                    StringBuilder sb25 = new StringBuilder(str53);
                    c4 = c8;
                    char c13 = c7;
                    str19 = str27;
                    StringBuilder sb26 = sb6;
                    String str54 = str31;
                    C1783.m6234(sb25, C4238.m13534(str54, c4, c13));
                    String str55 = str29;
                    C3779.m12258(sb25, str55);
                    String strM40510 = C1080.m4058(sb25);
                    if (c25277.m56436(strM40510)) {
                        int iM31626 = C0773.m3169("᩶ܳ") ^ i16;
                        i18 = ((iM31626 ^ i17) * 26621) ^ 1823500601;
                        i19 = iM31626 ^ (-415098371);
                        strM8166 = str53;
                        str29 = str55;
                        sb6 = sb26;
                        str28 = str52;
                        c7 = c13;
                        str33 = strM40510;
                        str31 = str54;
                        str27 = str19;
                        c8 = c4;
                    } else {
                        int iM31627 = C0773.m3169("ۡܰ") ^ i16;
                        i19 = iM31627 ^ (-2072041401);
                        strM8166 = str53;
                        i18 = ((iM31627 ^ i17) * (-31449)) ^ 334443179;
                        str27 = str19;
                        str28 = str52;
                        c8 = c4;
                        str29 = str55;
                        sb6 = sb26;
                        c7 = c13;
                        str33 = strM40510;
                        str31 = str54;
                    }
                    break;
                case 542176628:
                case 2131507828:
                    str28 = str28;
                    c4 = c8;
                    c5 = c7;
                    str18 = strM8166;
                    str19 = str27;
                    sb6 = sb6;
                    str23 = str33;
                    str20 = str29;
                    str21 = str31;
                    str22 = str32;
                    strM4059 = C1080.m4058(sb9);
                    StringBuilder sb27 = new StringBuilder(str18);
                    strM13534 = C4238.m13534(TextEditorToolMenu.class.getName(), c4, c5);
                    if (C1783.f6087 > 0) {
                        int iM31628 = (C0773.m3169("᩹ܰ") ^ i17) * (-111);
                        i12 = ((iM31628 ^ i16) * (-17001)) ^ (-462158678);
                        i19 = iM31628 ^ (-1046523864);
                        sb8 = sb27;
                        str32 = str22;
                        str33 = str23;
                        this = this;
                        strM8166 = str18;
                        str31 = str21;
                        str28 = str28;
                        str29 = str20;
                        sb6 = sb6;
                        c7 = c5;
                        i18 = i12;
                        str27 = str19;
                        c8 = c4;
                    } else {
                        sb8 = sb27;
                        strM4939 = str20;
                        sb4 = sb7;
                        sArr2 = sArr3;
                        i11 = i20;
                        int iM27618 = C0619.m2761("ۤܶ") ^ i17;
                        int i25 = ((iM27618 ^ i16) * (-16917)) ^ (-1609979823);
                        i19 = iM27618 ^ (-1877634894);
                        c25277 = c25277;
                        sb7 = sb4;
                        sArr3 = sArr2;
                        i20 = i11;
                        sb6 = sb6;
                        str32 = str22;
                        str33 = str23;
                        c7 = c5;
                        strM8166 = str18;
                        i18 = i25;
                        str31 = str21;
                        str27 = str19;
                        str28 = str28;
                        str29 = strM4939;
                        c8 = c4;
                        this = this;
                    }
                    break;
                case 542292485:
                case 1210776598:
                    str28 = str28;
                    strM6953 = strM6953;
                    if (c25277.m56437(strM6952, str30)) {
                        iM3169 = C0619.m2761("᩺᩵") ^ i16;
                        i6 = ((iM3169 ^ i17) * (-19113)) ^ 422313623;
                        i7 = 2068223912;
                    } else {
                        iM3169 = C0773.m3169("᩻᩷") ^ i16;
                        i6 = ((iM3169 ^ i17) * 30065) ^ 125582084;
                        i7 = 1949684511;
                    }
                    strM6953 = strM6953;
                    i19 = iM3169 ^ i7;
                    i18 = i6;
                    str28 = str28;
                    break;
                case 972403659:
                case 1897275386:
                    C1783.m6234(sb6, str32);
                    C5448.m16278(C2023.m6952(sb6));
                    String str56 = this.f59681;
                    if (C2288.f7433 > 0) {
                        throw new C4866(C17202.m40366(C0619.m2761(C0773.m3166(f59666, 646, 3, i21)) ^ 2116931686, new Object[]{str56}));
                    }
                    iM3169 = (C0773.m3169("᩹ۢ") + i16) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i6 = ((iM3169 ^ i17) * (-32171)) ^ 386666944;
                    i7 = 487373884;
                    strM6953 = strM6953;
                    i19 = iM3169 ^ i7;
                    i18 = i6;
                    str28 = str28;
                    break;
                default:
                    StringBuilder sb28 = new StringBuilder(str28);
                    C3779.m12258(sb28, c21284.f67874);
                    C5448.m16278(C1080.m4058(sb28));
                    String str57 = c21284.f67874;
                    Object[] objArr2 = new Object[1];
                    if (C2485.f7950 == 0) {
                        objArr2[0] = str57;
                        throw new C4866(C3734.m12148(C0619.m2761(C2966.m9670(f59666, 589, 3, i21)) ^ 2118321685, objArr2));
                    }
                    int iM27619 = (i17 - C0619.m2761("ۙ۫")) * 71;
                    i6 = ((iM27619 ^ i16) * 27331) ^ (-683387230);
                    i19 = iM27619 ^ 1765479285;
                    i18 = i6;
                    str28 = str28;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PluginPreference m42682(String str) {
        String str2 = null;
        Class clsM31304 = null;
        int i = 611412677;
        int i2 = C1542.f5343;
        int i3 = C1146.f4234;
        int iM2761 = (i3 - C0619.m2761("֡᩹")) * 7;
        int i4 = ((iM2761 ^ i2) * (-6287)) ^ 845104095;
        int i5 = -356338796;
        while (true) {
            i = ((((i ^ i2) * (-29869)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2100501510:
                case -126638355:
                    C4238.m13540();
                    if (C2287.f7432 < 0) {
                        iM2761 = (C0619.m2761("ۨ۫") ^ i2) * (-59);
                        i4 = ((iM2761 ^ i3) * (-24055)) ^ (-1669023449);
                        i5 = -307028576;
                    } else {
                        iM2761 = C0773.m3169("۟᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28837) ^ (-1214968971);
                        i5 = 2033044907;
                    }
                    break;
                case -2081429164:
                case 961911626:
                    return (PluginPreference) clsM31304.newInstance();
                case -1927037297:
                case -1695922095:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩵ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6643) ^ 1390498897;
                        i5 = 850822900;
                    } else {
                        iM2761 = C0619.m2761("۠֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25665)) ^ 2132341457;
                        i5 = 1065580933;
                    }
                    break;
                case -1918285283:
                case 285559204:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("۬ۚ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-26885)) ^ 1085711430;
                        i5 = -1318753359;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16229) ^ 1379457793;
                        i5 = 1263350388;
                    }
                    break;
                case -1728280091:
                case 118764311:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩵ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6643) ^ 1390498897;
                        i5 = 850822900;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6621)) ^ 678694178;
                        i5 = 1882502364;
                    }
                    break;
                case -1720608503:
                case 438002795:
                    str2 = this.f59681;
                    iM2761 = (i3 - C0619.m2761("ۙ۫")) * (-87);
                    i4 = ((iM2761 ^ i2) * 19411) ^ (-578516977);
                    i5 = -310384658;
                    break;
                case -1622862649:
                case 965648594:
                    if (str == null) {
                        iM2761 = (i2 - C0773.m3169("۬ۜ")) * 51;
                        i4 = ((iM2761 ^ i3) * 24647) ^ (-905512);
                        i5 = -2074718433;
                    } else {
                        str2 = str;
                        iM2761 = (i3 - C0619.m2761("ۙ۫")) * (-87);
                        i4 = ((iM2761 ^ i2) * 19411) ^ (-578516977);
                        i5 = -310384658;
                    }
                    break;
                case -1510047450:
                case 279045309:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۜᩴ") ^ i3) * 83;
                        i4 = ((iM2761 ^ i2) * 18597) ^ (-391031214);
                        i5 = -1101404417;
                    } else {
                        iM2761 = C0619.m2761("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9491) ^ (-475806957);
                        i5 = -1217506176;
                    }
                    break;
                case -1181998420:
                case 810345213:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۜᩴ") ^ i3) * 83;
                        i4 = ((iM2761 ^ i2) * 18597) ^ (-391031214);
                        i5 = -1101404417;
                    } else {
                        iM2761 = (C0619.m2761("۬ۚ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-26885)) ^ 1085711430;
                        i5 = -1318753359;
                    }
                    break;
                case -998027292:
                case -917607808:
                    return null;
                case -992134111:
                case 350778675:
                    C3690.m11987();
                    C3779.m12264();
                    return null;
                case -956107910:
                case -71840279:
                    if (m42673()) {
                        iM2761 = (C0619.m2761("ܿۘ") ^ i2) * (-51);
                        i4 = ((iM2761 ^ i3) * 32071) ^ 1688405026;
                        i5 = 253913861;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜ۟")) * (-75);
                        i4 = ((iM2761 ^ i2) * 15869) ^ 1114818095;
                        i5 = -2009953489;
                    }
                    break;
                case -755679885:
                case 1854357780:
                    clsM31304 = C12596.m31304(this.f59670, str2);
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۟᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28837) ^ (-1214968971);
                        i5 = 2033044907;
                    } else {
                        iM2761 = C0773.m3169("ۙۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24725)) ^ 1985359356;
                        i5 = -1585656697;
                    }
                    break;
                case -403323930:
                case 1079842591:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("᩵ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6643) ^ 1390498897;
                        i5 = 850822900;
                    } else {
                        iM2761 = C0619.m2761("ۧۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26783)) ^ 1943013230;
                        i5 = -1475449796;
                    }
                    break;
                case -361468738:
                case -230068347:
                    if (str2 != null) {
                        iM2761 = C0619.m2761("ۢܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 579) ^ 1567350577;
                        i5 = -1294544547;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜ۟")) * (-75);
                        i4 = ((iM2761 ^ i2) * 15869) ^ 1114818095;
                        i5 = -2009953489;
                    }
                    break;
                case -80913525:
                case 1693002205:
                    C3077.m10041();
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("۟᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28837) ^ (-1214968971);
                        i5 = 2033044907;
                    } else {
                        iM2761 = (C0619.m2761("۬ۚ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-26885)) ^ 1085711430;
                        i5 = -1318753359;
                    }
                    break;
                case -25408160:
                case 26524453:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("᩵ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6643) ^ 1390498897;
                        i5 = 850822900;
                    } else {
                        iM2761 = C0619.m2761("ܶ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29491) ^ (-1976685061);
                        i5 = 714338362;
                    }
                    break;
                case 36686170:
                case 1167780871:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۨ۫") ^ i2) * (-59);
                        i4 = ((iM2761 ^ i3) * (-24055)) ^ (-1669023449);
                        i5 = -307028576;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۬") ^ i3) * (-113);
                        i4 = ((iM2761 ^ i2) * 31659) ^ 449305251;
                        i5 = 1511601725;
                    }
                    break;
                case 85933886:
                case 410513130:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۟᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28837) ^ (-1214968971);
                        i5 = 2033044907;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21707) ^ 2023635989;
                        i5 = -1222805614;
                    }
                    break;
                case 1276524586:
                case 1994548065:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("۬ۚ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-26885)) ^ 1085711430;
                        i5 = -1318753359;
                    } else {
                        iM2761 = (C0773.m3169("ۧۢ") + i2) * (-17);
                        i4 = ((iM2761 ^ i3) * 19263) ^ 701131438;
                        i5 = -2054351953;
                    }
                    break;
                default:
                    C3779.m12264();
                    iM2761 = (C0619.m2761("۬ۚ") + i3) * 79;
                    i4 = ((iM2761 ^ i2) * (-26885)) ^ 1085711430;
                    i5 = -1318753359;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m42686() {
        return this.f59676;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m42659() {
        return this.f59679;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m42675(String str) {
        this.f59679 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m42651() {
        return this.f59674;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42681(boolean z) {
        this.f59674 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m42637(int i, String str) {
        Iterator itM13647 = null;
        Class cls = null;
        C21284 c21284 = null;
        Exception e = null;
        Class clsM31304 = null;
        int i2 = 1082862328;
        int i3 = C1146.f4234;
        int i4 = C3690.f12684;
        int iM3169 = (C0773.m3169("ۧۜ") + i3) * (-83);
        int i5 = ((iM3169 ^ i4) * (-8533)) ^ 673302071;
        int i6 = -242053155;
        while (true) {
            int i7 = iM3169 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 26411) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2128258521:
                    case 1349439976:
                        if (C0950.f3488 < 0) {
                            iM3169 = (C0773.m3169("ۖܳ") + i3) * (-73);
                            i5 = ((iM3169 ^ i4) * 7397) ^ (-129947283);
                            i6 = 1614278958;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                    case -1995704133:
                    case -1754441975:
                        C1146.m4231();
                        if (AbstractC0116.m1243() == 0) {
                            iM3169 = (C0619.m2761("ܶ֨") + i4) * 53;
                            i5 = ((iM3169 ^ i3) * 8369) ^ 1227661963;
                            i6 = 373677590;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case -1952962054:
                    case 1361511604:
                        return cls;
                    case -1697290905:
                    case 252210719:
                        itM13647 = C4282.m13647(this.f59690);
                        iM3169 = C0619.m2761("ۚܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8341) ^ 1960923511;
                        i6 = 1464962605;
                        break;
                    case -1679905167:
                    case 389673669:
                        if (!m42673()) {
                            iM3169 = (C0619.m2761("᩻ۧ") ^ i4) * 115;
                            i5 = ((iM3169 ^ i3) * (-28387)) ^ (-151301216);
                            i6 = 387981296;
                            break;
                        }
                        iM3169 = (i3 - C0773.m3169("۠᩻")) * 61;
                        i5 = ((iM3169 ^ i4) * 16553) ^ 1260061036;
                        i6 = 1307930793;
                        break;
                    case -1527820264:
                    case 969696150:
                        if (C2310.m7813() > 0) {
                            iM3169 = (C0619.m2761("ۛᩳ") ^ i3) * 127;
                            i5 = ((iM3169 ^ i4) * (-24445)) ^ (-490518389);
                            i6 = 1129977860;
                            break;
                        }
                        iM3169 = (C0619.m2761("ۢܺ") ^ i3) * 63;
                        i5 = ((iM3169 ^ i4) * 2975) ^ (-569600511);
                        i6 = 155447799;
                        break;
                    case -1400352261:
                    case 1008423496:
                        if (!C2419.m8175(c21284.f67874, str)) {
                            iM3169 = C0619.m2761("ۚܺ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 8341) ^ 1960923511;
                            i6 = 1464962605;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("ۨ۬") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 1811) ^ 707573502;
                        i6 = 1491840777;
                        break;
                    case -1238721543:
                    case -27433453:
                        if (C1564.f5401 > 0) {
                            iM3169 = (C0773.m3169("ۛܽ") + i4) * 5;
                            i5 = ((iM3169 ^ i3) * (-22611)) ^ (-1627582225);
                            i6 = -633822250;
                            break;
                        }
                        iM3169 = (C0619.m2761("ܶ֨") + i4) * 53;
                        i5 = ((iM3169 ^ i3) * 8369) ^ 1227661963;
                        i6 = 373677590;
                        break;
                        break;
                    case -1222930973:
                    case 2052894320:
                        if (!RunnableC0334.m2063()) {
                            iM3169 = (C0619.m2761("֡᩸") + i4) * (-103);
                            i5 = ((iM3169 ^ i3) * 1653) ^ 2071336209;
                            i6 = 1789394348;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case -1156395493:
                    case -520342916:
                        if (!C3779.m12264()) {
                            iM3169 = (C0619.m2761("ۢܺ") ^ i3) * 63;
                            i5 = ((iM3169 ^ i4) * 2975) ^ (-569600511);
                            i6 = 155447799;
                            break;
                            break;
                        }
                        iM3169 = C0773.m3169("֡ܿ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19671) ^ 1962132924;
                        i6 = -1083079261;
                        break;
                    case -1068839875:
                    case 479792497:
                        if (RunnableC3055.f9898 >= 0) {
                            iM3169 = (C0619.m2761("᩸ۖ") ^ i3) * 11;
                            i5 = ((iM3169 ^ i4) * 15763) ^ 255829169;
                            i6 = -1732109912;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case -1050137773:
                    case 1270659043:
                        if (C1542.m5459() < 0) {
                            iM3169 = (i3 - C0619.m2761("᩸ᩴ")) * (-93);
                            i5 = ((iM3169 ^ i4) * 32223) ^ 2098450881;
                            i6 = -1250796742;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case -1018382550:
                    case 1688523281:
                        if (C1519.f5300 < 0) {
                            iM3169 = (i4 - C0773.m3169("ᩴۘ")) * (-13);
                            i5 = ((iM3169 ^ i3) * 3975) ^ 495424328;
                            i6 = 1520630973;
                            break;
                        }
                        iM3169 = (C0773.m3169("ܽ֫") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * (-7531)) ^ (-917693220);
                        i6 = 600923969;
                        break;
                    case -923075055:
                    case 226509660:
                        C1321.m4852();
                        C1519.m5403();
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case -854440185:
                    case -150708697:
                        if (C3448.f11240 < 0) {
                            iM3169 = (C0619.m2761("ۜ۬") ^ i4) * (-47);
                            i5 = ((iM3169 ^ i3) * 25809) ^ 1691248145;
                            i6 = -1597608909;
                            break;
                        }
                        iM3169 = (C0619.m2761("᩸ۖ") ^ i3) * 11;
                        i5 = ((iM3169 ^ i4) * 15763) ^ 255829169;
                        i6 = -1732109912;
                        break;
                        break;
                    case -821767166:
                    case 1947109307:
                        if (C4238.f15451 < 0) {
                            iM3169 = (C0619.m2761("ܺᩴ") ^ i4) * (-117);
                            i5 = ((iM3169 ^ i3) * (-1801)) ^ 575677335;
                            i6 = 1086837614;
                            break;
                        }
                        iM3169 = (i4 - C0773.m3169("ᩴۘ")) * (-13);
                        i5 = ((iM3169 ^ i3) * 3975) ^ 495424328;
                        i6 = 1520630973;
                        break;
                        break;
                    case -780082749:
                    case 111679296:
                        if (C1519.f5300 < 0) {
                            iM3169 = (C0773.m3169("۟᩶") + i3) * (-51);
                            i5 = ((iM3169 ^ i4) * (-15445)) ^ (-331775957);
                            i6 = -1723851002;
                            break;
                        }
                        iM3169 = (C0619.m2761("ۢܺ") ^ i3) * 63;
                        i5 = ((iM3169 ^ i4) * 2975) ^ (-569600511);
                        i6 = 155447799;
                        break;
                        break;
                    case -594174446:
                    case -416806001:
                        if (!C3998.m12923(itM13647)) {
                            cls = null;
                            iM3169 = (C0619.m2761("᩻ۧ") ^ i4) * 115;
                            i5 = ((iM3169 ^ i3) * (-28387)) ^ (-151301216);
                            i6 = 387981296;
                            break;
                        }
                        int iM31610 = C0773.m3169("ۨ֡") ^ i3;
                        i5 = ((iM31610 ^ i4) * 31203) ^ (-1933077810);
                        i7 = iM31610 ^ (-550670675);
                        cls = null;
                        break;
                        break;
                    case -429581870:
                    case 36892202:
                        return clsM31304;
                    case -127840993:
                    case 1323470819:
                        if (C20932.m47848() == 0) {
                            iM3169 = C0619.m2761("۫֫") ^ i4;
                            i5 = ((iM3169 ^ i3) * 14661) ^ 412593952;
                            i6 = -1999042887;
                            break;
                        }
                        iM3169 = (i4 - C0773.m3169("ᩴۘ")) * (-13);
                        i5 = ((iM3169 ^ i3) * 3975) ^ 495424328;
                        i6 = 1520630973;
                        break;
                        break;
                    case -20895307:
                    case 1008510666:
                        m42654(e);
                        iM3169 = (C0619.m2761("᩻ۧ") ^ i4) * 115;
                        i5 = ((iM3169 ^ i3) * (-28387)) ^ (-151301216);
                        i6 = 387981296;
                        break;
                        break;
                    case 516825644:
                    case 1676388383:
                        C17202.m40372();
                        if (C1080.f3865 < 0) {
                            iM3169 = (C0773.m3169("ܽ֫") + i3) * 99;
                            i5 = ((iM3169 ^ i4) * (-7531)) ^ (-917693220);
                            i6 = 600923969;
                            break;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۡᩴ") ^ i4) * (-109);
                        i5 = ((iM3169 ^ i3) * 30419) ^ (-1087139272);
                        i6 = 638850909;
                        break;
                        break;
                    case 529230057:
                    case 1867836182:
                        c21284 = (C21284) C0950.m3796(itM13647);
                        if (c21284.f67875 != i) {
                            iM3169 = C0619.m2761("ۚܺ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 8341) ^ 1960923511;
                            i6 = 1464962605;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("ܽ᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13379)) ^ (-362223684);
                        i6 = 48818673;
                        break;
                    case 1095188002:
                    case 2058517869:
                        try {
                            clsM31304 = C12596.m31304(this.f59670, c21284.f67874);
                            iM3169 = (i3 - C0773.m3169("ܿۙ")) * 23;
                            i5 = ((iM3169 ^ i4) * (-19605)) ^ (-1010708944);
                            i6 = -656390126;
                        } catch (Exception e2) {
                            e = e2;
                            iM3169 = (C0773.m3169("ۨۧ") ^ i4) * (-121);
                            i5 = ((iM3169 ^ i3) * 27751) ^ (-147420062);
                            i6 = -1071950228;
                        }
                        break;
                    default:
                        C23916.m53419();
                        return null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x0168 A[PHI: r3
      0x0168: PHI (r3v4 org.json.JSONArray) = (r3v2 org.json.JSONArray), (r3v2 org.json.JSONArray), (r3v8 org.json.JSONArray) binds: [B:33:0x00fe, B:18:0x0075, B:108:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01aa A[PHI: r2
      0x01aa: PHI (r2v4 l.ܿۨ֫) = (r2v3 l.ܿۨ֫), (r2v2 l.ܿۨ֫), (r2v2 l.ܿۨ֫) binds: [B:48:0x01a8, B:13:0x0065, B:5:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0238 A[PHI: r6 r7 r13 r14
      0x0238: PHI (r6v4 l.᩶ۨ֫) = (r6v2 l.᩶ۨ֫), (r6v3 l.᩶ۨ֫), (r6v2 l.᩶ۨ֫), (r6v2 l.᩶ۨ֫) binds: [B:59:0x0236, B:26:0x00ae, B:13:0x0065, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:59:0x0236, B:26:0x00ae, B:13:0x0065, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0236, B:26:0x00ae, B:13:0x0065, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:59:0x0236, B:26:0x00ae, B:13:0x0065, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x028b A[PHI: r8 r10 r11
      0x028b: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:67:0x0289, B:44:0x0182, B:10:0x005f, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:67:0x0289, B:44:0x0182, B:10:0x005f, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:67:0x0289, B:44:0x0182, B:10:0x005f, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02dd A[PHI: r16 r21
      0x02dd: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02db, B:71:0x02bd, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char) binds: [B:75:0x02db, B:71:0x02bd, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x030f A[PHI: r12
      0x030f: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:79:0x030d, B:63:0x026a, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18300 m42642(JSONObject jSONObject, C22941 c22941) throws JSONException {
        int iM2761;
        int i;
        int i2;
        int i3 = C2419.f7754;
        int i4 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("ᩴܰ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 183) ^ (-1056398729);
        JSONArray jSONArrayOptJSONArray = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-750450259);
        C18300 c18300 = null;
        int length = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1661637082;
        char c = 0;
        String string = null;
        C21284 c21284 = null;
        int i12 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 29617) >> 31));
            switch (i11) {
                case -2035444086:
                case 1259245660:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-29189)) ^ (-123266640);
                        i2 = 2016756372;
                    } else {
                        iM2761 = C0619.m2761("ۡܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12893)) ^ 1214673462;
                        i2 = 79798920;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1955808024:
                case -1934180489:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۨ֡") + i4) * 43;
                        i = ((iM2761 ^ i3) * (-21093)) ^ (-1471654959);
                        i2 = -1030388565;
                    } else {
                        iM2761 = C0773.m3169("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-29189)) ^ (-123266640);
                        i2 = 2016756372;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1747728034:
                case 2105892265:
                    c18300 = new C18300();
                    c18300.m42647(jSONObject);
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i4;
                        i = ((iM2761 ^ i3) * 2161) ^ (-615633989);
                        i2 = 2116918402;
                    } else {
                        iM2761 = (C0773.m3169("ۖ֨") ^ i4) * 93;
                        i = ((iM2761 ^ i3) * (-8919)) ^ (-179403935);
                        i2 = -1768702346;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1685014271:
                case -1332863816:
                    sArr = f59666;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("ۡܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12893)) ^ 1214673462;
                        i2 = 79798920;
                    } else {
                        iM2761 = (i4 - C0619.m2761("֨ܰ")) * (-75);
                        i = ((iM2761 ^ i3) * (-30727)) ^ 1791608055;
                        i2 = 413267367;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1632588226:
                case 1892996674:
                    if (i12 == length - 1) {
                        iM2761 = (i3 - C0619.m2761("ܰ᩵")) * (-77);
                        i = ((iM2761 ^ i4) * 5769) ^ 258374924;
                        i2 = -1219878435;
                    } else {
                        iM2761 = (C0773.m3169("᩷֫") ^ i3) * (-109);
                        i = ((iM2761 ^ i4) * (-27653)) ^ (-265306887);
                        i2 = 528137212;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1595116571:
                case -1082477788:
                    if (i12 < length) {
                        iM2761 = (C0619.m2761("۟֨") + i4) * 75;
                        i = ((iM2761 ^ i3) * (-14093)) ^ 1384781819;
                        i2 = -1411069015;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i = ((iM2761 ^ i4) * (-24729)) ^ 678908979;
                        i2 = 1266462674;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1563379071:
                case -135892438:
                    C1519.m5406(c18300.f59690, c21284);
                    i12++;
                    iM2761 = C0773.m3169("ۧ۟") ^ i3;
                    i = ((iM2761 ^ i4) * (-21673)) ^ (-1881495005);
                    i2 = 681275063;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1454735305:
                case 529262786:
                    i8 = i7 * i7;
                    i9 = s * 2;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0619.m2761("ۨ֡") + i4) * 43;
                        i = ((iM2761 ^ i3) * (-21093)) ^ (-1471654959);
                        i2 = -1030388565;
                    } else {
                        iM2761 = C0773.m3169("ۛۘ") ^ i3;
                        i = ((iM2761 ^ i4) * (-17359)) ^ (-919702597);
                        i2 = -2072824530;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1165703619:
                case -1022864002:
                    c18300.f59676 = true;
                    c18300.m42644(c22941);
                    return c18300;
                case -973973174:
                case 1530000155:
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0619.m2761("ܿ֡") ^ i4;
                        i = ((iM2761 ^ i3) * 13859) ^ 1261327114;
                        i2 = 1326484386;
                    } else {
                        iM2761 = C0619.m2761("ۛ֨") ^ i3;
                        i = ((iM2761 ^ i4) * (-18327)) ^ (-441881430);
                        i2 = 333947558;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -746531229:
                case -675140278:
                    c = 157;
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("ۨᩴ") ^ i4;
                        i = ((iM2761 ^ i3) * (-23839)) ^ 646516243;
                        i2 = 1449393638;
                    } else {
                        iM2761 = C0619.m2761("ۡܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12893)) ^ 1214673462;
                        i2 = 79798920;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -396322112:
                case 1390385981:
                    sArr2 = f59666;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-29189)) ^ (-123266640);
                        i2 = 2016756372;
                    } else {
                        iM2761 = C0773.m3169("ۗ۟") ^ i4;
                        i = ((iM2761 ^ i3) * 16163) ^ (-758860997);
                        i2 = 1767549370;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -395738765:
                case 2050199852:
                    C2288.m7767();
                    C0619.m2763();
                    return null;
                case -264087300:
                case 274157968:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i4;
                        i = ((iM2761 ^ i3) * 2161) ^ (-615633989);
                        i2 = 2116918402;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֡") + i4) * 43;
                        i = ((iM2761 ^ i3) * (-21093)) ^ (-1471654959);
                        i2 = -1030388565;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -237817130:
                case 50223109:
                    i7 = s + s2;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("ܿ֡") ^ i4;
                        i = ((iM2761 ^ i3) * 13859) ^ 1261327114;
                        i2 = 1326484386;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 23597) ^ 6130991;
                        i2 = -1386966465;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -192801139:
                case 1059942491:
                    length = jSONArrayOptJSONArray.length();
                    i12 = 0;
                    iM2761 = C0773.m3169("ۧ۟") ^ i3;
                    i = ((iM2761 ^ i4) * (-21673)) ^ (-1881495005);
                    i2 = 681275063;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -144272913:
                case 1771923245:
                    i10 = 49457;
                    iM2761 = C0619.m2761("᩶۠") ^ i3;
                    i = ((iM2761 ^ i4) * (-3701)) ^ (-311317309);
                    i2 = 531051518;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -112564666:
                case 385027421:
                    c21284 = new C21284();
                    string = jSONArrayOptJSONArray.getString(i12);
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۨ֡") + i4) * 43;
                        i = ((iM2761 ^ i3) * (-21093)) ^ (-1471654959);
                        i2 = -1030388565;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۘܶ")) * 33;
                        i = ((iM2761 ^ i3) * 13023) ^ (-598069577);
                        i2 = -1028143612;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -81502785:
                case 1383985366:
                    s = sArr[c];
                    s2 = 1;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-29189)) ^ (-123266640);
                        i2 = 2016756372;
                    } else {
                        iM2761 = C0773.m3169("֫ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 23795) ^ (-986874061);
                        i2 = 2040808906;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -37023857:
                case 1833209582:
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(C2702.m8881(sArr2, 158, 10, i10));
                    if (jSONArrayOptJSONArray != null) {
                        int iM2762 = (i4 - C0619.m2761("ܳ᩷")) * (-89);
                        i5 = ((iM2762 ^ i3) * (-29745)) ^ (-231818840);
                        i6 = iM2762 ^ (-1363287053);
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i = ((iM2761 ^ i4) * (-24729)) ^ 678908979;
                        i2 = 1266462674;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    break;
                case 174099404:
                case 2133241898:
                    i10 = 21585;
                    iM2761 = C0619.m2761("᩶۠") ^ i3;
                    i = ((iM2761 ^ i4) * (-3701)) ^ (-311317309);
                    i2 = 531051518;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 201601017:
                case 2078704441:
                    if ((i9 + 1) - i8 > 0) {
                        iM2761 = (C0619.m2761("ۧ۠") + i3) * 57;
                        i = ((iM2761 ^ i4) * 21763) ^ 1140917991;
                        i2 = 189145894;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩹ۛ")) * 127;
                        i = ((iM2761 ^ i3) * (-25419)) ^ (-1680332966);
                        i2 = 61198602;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 878324213:
                case 1125114594:
                    if (jSONArrayOptJSONArray.isNull(i12)) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i = ((iM2761 ^ i4) * (-24729)) ^ 678908979;
                        i2 = 1266462674;
                    } else {
                        iM2761 = (C0773.m3169("᩷֫") ^ i3) * (-109);
                        i = ((iM2761 ^ i4) * (-27653)) ^ (-265306887);
                        i2 = 528137212;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1163241498:
                case 1453416257:
                    c21284.m48474(string);
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ܿ֡") ^ i4;
                        i = ((iM2761 ^ i3) * 13859) ^ 1261327114;
                        i2 = 1326484386;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۬۫")) * 39;
                        i = ((iM2761 ^ i4) * 18743) ^ (-1275702260);
                        i2 = 1758201644;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    RunnableC0334.m2063();
                    C1321.m4852();
                    iM2761 = C0773.m3169("ۤ᩶") ^ i4;
                    i = ((iM2761 ^ i3) * 2161) ^ (-615633989);
                    i2 = 2116918402;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public final void finalize() {
        m42653();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class m42679(String str) {
        return m42637(2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m42652(String str) {
        return m42637(3, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Class m42662(String str) {
        return m42637(4, str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42684(ArrayList arrayList) {
        m42643(arrayList, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42680(ArrayList arrayList) {
        m42643(arrayList, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42655(ArrayList arrayList) {
        m42643(arrayList, 3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42664(ArrayList arrayList) {
        m42643(arrayList, 4);
    }

    public final String toString() {
        int iM2761;
        int i;
        JSONException e = null;
        Iterator itM4942 = null;
        boolean zM12923 = false;
        String str = null;
        String strM6952 = null;
        int i2 = 0;
        int i3 = 1308120084;
        int i4 = C3033.f9831;
        int i5 = C4238.f15451;
        int iM3169 = C0773.m3169("᩶ۡ") ^ i4;
        int i6 = ((iM3169 ^ i5) * 20591) ^ 215914565;
        int i7 = iM3169 ^ (-750308148);
        JSONArray jSONArray = null;
        JSONObject jSONObject = null;
        while (true) {
            i3 = ((((i3 ^ i5) * 15443) >> 31) & i6) ^ i7;
            switch (i3) {
                case -1899871392:
                case -199882448:
                    return C1080.m4058(e);
                case -1790392283:
                case -630243160:
                    jSONObject.put(C2834.m9343(f59666, 502, 10, i2), jSONArray);
                    jSONObject.put(C1343.m4939(f59666, 526, 6, i2), this.f59676);
                    jSONObject.put(C20932.m47853(f59666, 532, 3, i2), this.f59679);
                    jSONObject.put(C2375.m8069(f59666, 535, 7, i2), this.f59678);
                    jSONObject.put(C1146.m4222(f59666, 542, 8, i2), this.f59677);
                    jSONObject.put(C0619.m2756(f59666, 550, 17, i2), this.f59674);
                    strM6952 = C2023.m6952(jSONObject);
                    iM2761 = (C0773.m3169("۠۬") + i4) * (-19);
                    i6 = 182518637 ^ ((iM2761 ^ i5) * 13281);
                    i = 1954292545;
                    i7 = i ^ iM2761;
                    break;
                case -1744464832:
                case -119229776:
                    i2 = 10646;
                    iM2761 = C0619.m2761("᩻᩷") ^ i4;
                    i6 = 402167397 ^ ((iM2761 ^ i5) * (-27705));
                    i = -181341848;
                    i7 = i ^ iM2761;
                    break;
                case -931742985:
                case 103608622:
                    zM12923 = C3998.m12923(itM4942);
                    iM2761 = C0619.m2761("ۜ۟") ^ i4;
                    i6 = 2082964106 ^ ((iM2761 ^ i5) * 3167);
                    i = -657060036;
                    i7 = i ^ iM2761;
                    break;
                case -635904844:
                case 2122851026:
                    jSONObject.put(C20932.m47853(f59666, 512, 14, i2), str);
                    iM2761 = C0619.m2761("᩹ܽ") ^ i4;
                    i6 = 45634290 ^ ((iM2761 ^ i5) * 6953);
                    i = 2056769643;
                    i7 = i ^ iM2761;
                    break;
                case -13175150:
                case 459314260:
                    i2 = 20845;
                    iM2761 = C0619.m2761("᩻᩷") ^ i4;
                    i6 = 402167397 ^ ((iM2761 ^ i5) * (-27705));
                    i = -181341848;
                    i7 = i ^ iM2761;
                    break;
                case 62847396:
                case 1605759884:
                    if (str != null) {
                        iM2761 = C0773.m3169("۬ۜ") ^ i5;
                        i6 = 1386391311 ^ ((iM2761 ^ i4) * 28723);
                        i = 1823423725;
                    } else {
                        iM2761 = C0619.m2761("᩹ܽ") ^ i4;
                        i6 = 45634290 ^ ((iM2761 ^ i5) * 6953);
                        i = 2056769643;
                    }
                    i7 = i ^ iM2761;
                    break;
                case 405584546:
                case 451911070:
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(C2878.m9486(f59666, 410, 17, i2), this.f59688);
                        jSONObject.put(AbstractC0641.m2820(f59666, 427, 14, i2), this.f59668);
                        jSONObject.put(C1321.m4861(f59666, 441, 16, i2), this.f59669);
                        jSONObject.put(C2834.m9343(f59666, 457, 8, i2), this.f59672);
                        jSONObject.put(C0269.m1785(f59666, 465, 11, i2), this.f59685);
                        jSONObject.put(C2966.m9670(f59666, 476, 11, i2), this.f59682);
                        jSONObject.put(C1343.m4939(f59666, 487, 4, i2), this.f59684);
                        jSONObject.put(C2288.m7761(f59666, 491, 11, i2), this.f59683);
                        try {
                            jSONArray = new JSONArray();
                            itM4942 = C1343.m4942(this.f59690);
                            iM2761 = C0773.m3169("ۜᩴ") ^ i5;
                            i6 = 1891329400 ^ ((iM2761 ^ i4) * 21107);
                            i = -1332010209;
                        } catch (JSONException e2) {
                            e = e2;
                            jSONArray = null;
                            iM2761 = C0619.m2761("֡᩵") ^ i5;
                            i6 = 579260851 ^ ((iM2761 ^ i4) * (-31499));
                            i = 947238589;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        jSONObject = null;
                    }
                    i7 = i ^ iM2761;
                    break;
                case 769457189:
                case 1189422655:
                    return strM6952;
                case 923465493:
                case 1998024351:
                    if (zM12923) {
                        iM2761 = (C0773.m3169("ܳ۫") ^ i5) * 127;
                        i6 = 1036361882 ^ ((iM2761 ^ i4) * (-9107));
                        i = -646951534;
                    } else {
                        iM2761 = (C0619.m2761("۠᩻") + i4) * 73;
                        i6 = 344261510 ^ ((iM2761 ^ i5) * 25141);
                        i = 1261423403;
                    }
                    i7 = i ^ iM2761;
                    break;
                case 1016605773:
                case 2141874128:
                    short s = f59666[409];
                    if (((s * s) + 333500644) - (s * 36524) >= 0) {
                        iM2761 = (C0773.m3169("᩸֡") ^ i4) * 53;
                        i6 = (-923791614) ^ ((iM2761 ^ i5) * 19963);
                        i = 1372912303;
                    } else {
                        iM2761 = (C0619.m2761("ۤۢ") + i5) * 97;
                        i6 = (-856999781) ^ ((iM2761 ^ i4) * 18993);
                        i = 547433491;
                    }
                    i7 = i ^ iM2761;
                    break;
                case 1252008902:
                case 2084958429:
                    C21284 c21284 = (C21284) C0950.m3796(itM4942);
                    jSONArray.put(c21284.m48472());
                    jSONArray.put(c21284.m48475());
                    iM2761 = C0773.m3169("ۜᩴ") ^ i5;
                    i6 = 1891329400 ^ ((iM2761 ^ i4) * 21107);
                    i = -1332010209;
                    i7 = i ^ iM2761;
                    break;
                default:
                    try {
                        str = this.f59681;
                        iM2761 = (C0619.m2761("ܺܽ") + i5) * 37;
                        i6 = (-2070164290) ^ ((iM2761 ^ i4) * 11409);
                        i = 1797503544;
                    } catch (JSONException e4) {
                        e = e4;
                        iM2761 = C0619.m2761("֡᩵") ^ i5;
                        i6 = 579260851 ^ ((iM2761 ^ i4) * (-31499));
                        i = 947238589;
                    }
                    i7 = i ^ iM2761;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0204 A[PHI: r8
      0x0204: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String) binds: [B:62:0x01ec, B:49:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0262 A[PHI: r7
      0x0262: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:69:0x024a, B:58:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02a2 A[PHI: r6
      0x02a2: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:73:0x0288, B:66:0x0224, B:56:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0378 A[PHI: r4 r5
      0x0378: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:81:0x02e8, B:9:0x0075, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0378: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:81:0x02e8, B:9:0x0075, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (l.RunnableC0334.f1808 <= 0) goto L13;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42647(org.json.JSONObject r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18300.m42647(org.json.JSONObject):void");
    }
}
