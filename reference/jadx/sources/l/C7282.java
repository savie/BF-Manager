package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۟ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C7282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f24206;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10105 f24207;

    /* JADX INFO: renamed from: ܺۢ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f24205 = {8096, -10384, 15797, -12116, -11123, 5687, 4817, 12334, 13087, -8546, 12385, -9379, 15624, 5526, -10738, -11988, 8613, 14874, -10378, 13405, -14832, 15753, -9547, 13960, -12393, 8241, -10860, 8496, 11802, 8138, 7434, -9687, -11918, -8456, 9062, -14346, 8616, 4500, 13798, -12055, 16183, -10020, -11586, -14111, 8512, 7454, -13555, -13865, -9408, -9180, -13468, 8309, -15400, -15330, 11350, -10283, -13338, 11557, -12913, -15508, 15902, 7397, 8723, 11187, 19998, 19983, 19988, 20000, 19980, 19990, 19992, 19985, 19998, 19979, 19978, 19981, 19994, 20000, 19990, 19985, 19993, 19984, 20000, 19978, 19983, 19983, 19994, 19981, 20000, 19996, 19998, 19980, 19994, 19998, 19983, 19988, 20000, 19980, 19990, 19992, 19985, 19998, 19979, 19978, 19981, 19994, 20000, 19990, 19985, 19993, 19984, 20000, 19998, 19995, 19995, 20000, 19996, 19984, 19987, 19984, 19985, 14838, 4639, -16355, 521, 9359, 3003, 29464, 29550, 29557, 29552, 29561, 29445, 29458, 29458, 29455, 29458, 4130, -32112, -25321, -26798, 27788, -29682, 20842, 26468, -31229, 24709, 23662, 32724, 21335, 31515, 23176, -29935, -31060, -27459, 32578, -28370, 28477, 26069, 32424, -27928, 27653, 749, -16639, -30248, 30992, -28112, 26990, 26680, -28046, -30742, -22763, 29102, 31277, 31194, 24851, 28961, -28370, 4023, 1999, 26522, 29722, 28283, 27468, -29946, -31286, -27334, -25127, -27802, 20117, 28333, 28109, 21651, -26331, -30132, 32533, -30204, 30157, 27991, -29887, -27544, 22575, 21627, -30738, -24955, 28788, 21111, -24619, 30845, -32263, 22189, 21266, 27018, 29848, 19993, 23721, 27799, 24954, -30710, 26516, -32476, -26751, 32410, 21699, -30560, 180, 188, 164, 236, 245, 228, 255, 203, 231, 253, 243, 250, 245, 224, 225, 230, 241, 203, 253, 250, 242, 251, 203, 225, 228, 228, 241, 230, 203, 247, 245, 231, 241, 189, -29323, -28814, 25677, 32526, -30081, -30186, 1320, -12131, 3662, -7271, -5322, -11924, -11556, -11134, -6565, 6997, 5485, 2458, -7313, 9013, 13718, 13740, 13730, 13739, 13732, 13745, 13744, 13751, 13728, 13732, 13739, 13729, 13751, 13738, 13740, 13729, 13803, 13740, 13739, 13745, 13728, 13739, 13745, 13803, 13732, 13734, 13745, 13740, 13738, 13739, 13803, 13715, 13708, 13696, 13714, 13751, 13728, 13732, 13729, 13706, 13739, 13737, 13756};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C10157 f24204 = new C10157(50);

    /* JADX WARN: Code duplicated, block: B:117:0x06b0 A[PHI: r2 r6 r13 r14 r15
      0x06b0: PHI (r2v37 l.ܽܰۖ) = (r2v8 l.ܽܰۖ), (r2v10 l.ܽܰۖ), (r2v14 l.ܽܰۖ), (r2v38 l.ܽܰۖ) binds: [B:116:0x06ae, B:108:0x064a, B:96:0x05bd, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x06b0: PHI (r6v34 android.widget.TextView) = 
      (r6v3 android.widget.TextView)
      (r6v5 android.widget.TextView)
      (r6v9 android.widget.TextView)
      (r6v35 android.widget.TextView)
     binds: [B:116:0x06ae, B:108:0x064a, B:96:0x05bd, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x06b0: PHI (r13v37 android.view.View) = (r13v4 android.view.View), (r13v6 android.view.View), (r13v10 android.view.View), (r13v38 android.view.View) binds: [B:116:0x06ae, B:108:0x064a, B:96:0x05bd, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x06b0: PHI (r14v38 l.۟ۛۨ) = (r14v4 l.۟ۛۨ), (r14v6 l.۟ۛۨ), (r14v10 l.۟ۛۨ), (r14v39 l.۟ۛۨ) binds: [B:116:0x06ae, B:108:0x064a, B:96:0x05bd, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x06b0: PHI (r15v35 int) = (r15v4 int), (r15v6 int), (r15v10 int), (r15v36 int) binds: [B:116:0x06ae, B:108:0x064a, B:96:0x05bd, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x071b A[PHI: r2 r6 r13 r14 r15
      0x071b: PHI (r2v11 l.ܽܰۖ) = (r2v6 l.ܽܰۖ), (r2v7 l.ܽܰۖ), (r2v12 l.ܽܰۖ) binds: [B:18:0x008a, B:122:0x0719, B:104:0x0621] A[DONT_GENERATE, DONT_INLINE]
      0x071b: PHI (r6v6 android.widget.TextView) = (r6v1 android.widget.TextView), (r6v2 android.widget.TextView), (r6v7 android.widget.TextView) binds: [B:18:0x008a, B:122:0x0719, B:104:0x0621] A[DONT_GENERATE, DONT_INLINE]
      0x071b: PHI (r13v7 android.view.View) = (r13v2 android.view.View), (r13v3 android.view.View), (r13v8 android.view.View) binds: [B:18:0x008a, B:122:0x0719, B:104:0x0621] A[DONT_GENERATE, DONT_INLINE]
      0x071b: PHI (r14v7 l.۟ۛۨ) = (r14v2 l.۟ۛۨ), (r14v3 l.۟ۛۨ), (r14v8 l.۟ۛۨ) binds: [B:18:0x008a, B:122:0x0719, B:104:0x0621] A[DONT_GENERATE, DONT_INLINE]
      0x071b: PHI (r15v7 int) = (r15v2 int), (r15v3 int), (r15v8 int) binds: [B:18:0x008a, B:122:0x0719, B:104:0x0621] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (l.RunnableC0195.f1321 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m19426(final l.C7282 r24, final l.DialogInterfaceC19356 r25, android.view.View r26, final android.widget.TextView r27, final android.widget.TextView r28, final android.widget.TextView r29, final android.widget.TextView r30, final android.widget.TextView r31, final android.widget.TextView r32, final android.widget.TextView r33, final android.widget.TextView r34, final android.widget.TextView r35, final android.widget.TextView r36, final android.widget.TextView r37, final l.RunnableC13633 r38, android.widget.TextView r39, final android.widget.TextView r40, l.C12562 r41, l.C12562 r42, l.C16674 r43) {
        /*
            Method dump skipped, instruction units count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.m19426(l.۟ۛۨ, l.᩵ۡۜ, android.view.View, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, l.ܰۛۨ, android.widget.TextView, android.widget.TextView, l.۫ᩳ, l.۫ᩳ, l.ܽܰۖ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19419(TextView textView, View view, AbstractC20745 abstractC20745, AbstractActivityC12483 abstractActivityC12483, boolean z, C17155 c17155, InterfaceC5614 interfaceC5614, AtomicBoolean atomicBoolean) {
        StringBuilder sb = null;
        String strM10571 = null;
        short[] sArr = null;
        int i = 0;
        short[] sArr2 = null;
        int i2 = 0;
        int i3 = 1201516402;
        int i4 = C1937.f7317;
        int i5 = C3535.f13026;
        int iM45029 = C19806.m45029("ܰ᩹") ^ i4;
        int i6 = ((iM45029 ^ i5) * (-18167)) ^ (-2135012875);
        int i7 = 325820788;
        while (true) {
            i3 = ((((i3 ^ i5) * 19437) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2135760566:
                case -1166863910:
                    atomicBoolean.set(true);
                    iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i5;
                    i6 = ((iM45029 ^ i4) * 25089) ^ 561712186;
                    i7 = 1859174195;
                    break;
                case -1982736941:
                case 255352380:
                    if (atomicBoolean != null) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i4;
                        i6 = ((iM45029 ^ i5) * 9881) ^ (-1140088827);
                        i7 = 1796103688;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i5;
                        i6 = ((iM45029 ^ i4) * 25089) ^ 561712186;
                        i7 = 1859174195;
                    }
                    break;
                case -1727089136:
                case 979610791:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = (C19806.m45029("ۛ۬") + i5) * (-105);
                        i6 = ((iM45029 ^ i4) * 28733) ^ (-1593616489);
                        i7 = 857049155;
                    }
                    break;
                case -1615274573:
                case 1407385421:
                    C3286.m9798();
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 13713) ^ (-827767304);
                        i7 = -1450027676;
                    }
                    break;
                case -1559128960:
                case -304051641:
                    short s = sArr[124];
                    if (((s * s) + 6682225) - (s * 5170) >= 0) {
                        iM45029 = (C19806.m45029("ᩴ֫") ^ i5) * 19;
                        i6 = ((iM45029 ^ i4) * 10025) ^ (-1401305870);
                        i7 = -983031987;
                    } else {
                        iM45029 = (C19806.m45029("۠᩹") + i4) * (-73);
                        i6 = ((iM45029 ^ i5) * (-14209)) ^ (-1833426477);
                        i7 = 1875429854;
                    }
                    break;
                case -1558284167:
                case 1345675421:
                    strM10571 = C3577.m10571(sArr2, q.h, 1, i);
                    C1148.m4223(sb, strM10571);
                    if (C2871.m8646()) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-23605)) ^ (-1727515837);
                        i7 = 1794647029;
                    } else {
                        iM45029 = (C19806.m45029("۬ܶ") ^ i4) * (-127);
                        i6 = ((iM45029 ^ i5) * 15815) ^ 775874044;
                        i7 = -210324723;
                    }
                    break;
                case -1458588518:
                case -659459019:
                    i = 9397;
                    iM45029 = ThreadFactoryC3888.m11306("ۚܰ") ^ i5;
                    i6 = ((iM45029 ^ i4) * (-32115)) ^ 1079583867;
                    i7 = 1356380597;
                    break;
                case -1456015212:
                case 1500568684:
                    i = 35358;
                    iM45029 = ThreadFactoryC3888.m11306("ۚܰ") ^ i5;
                    i6 = ((iM45029 ^ i4) * (-32115)) ^ 1079583867;
                    i7 = 1356380597;
                    break;
                case -1011744061:
                case 1110370559:
                    RunnableC1606.m5473();
                    C1875.m6086();
                    break;
                case -929187463:
                case -616315472:
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 13713) ^ (-827767304);
                        i7 = -1450027676;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴᩳ") + i4) * 15;
                        i6 = ((iM45029 ^ i5) * 19101) ^ (-706634237);
                        i7 = -1728005587;
                    }
                    break;
                case -728524963:
                case 1650592710:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ܿۜ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-11751)) ^ 1454069696;
                        i7 = -773898569;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩵") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19105) ^ (-1269479231);
                        i7 = -38196546;
                    }
                    break;
                case -636964426:
                case -120115888:
                    i2 = C2124.f7782;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("᩸ۧ")) * 59;
                    i6 = ((iM45029 ^ i4) * (-30429)) ^ (-1795297442);
                    i7 = 1091336797;
                    break;
                case -343948490:
                case 707061558:
                    C3535.m10431();
                    RunnableC1606.m5473();
                    iM45029 = ThreadFactoryC3888.m11306("֡᩷") ^ i4;
                    i6 = ((iM45029 ^ i5) * 13713) ^ (-827767304);
                    i7 = -1450027676;
                    break;
                case -280736018:
                case 1804311415:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 13713) ^ (-827767304);
                        i7 = -1450027676;
                    } else {
                        iM45029 = (C19806.m45029("ۨ۠") ^ i5) * 93;
                        i6 = ((iM45029 ^ i4) * 19681) ^ 177078174;
                        i7 = 578829602;
                    }
                    break;
                case -164524343:
                case 2125935249:
                    sArr = f24205;
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۬") ^ i4) * 41;
                        i6 = ((iM45029 ^ i5) * (-2457)) ^ 382248386;
                        i7 = 1646972716;
                    }
                    break;
                case -155291425:
                case 890971454:
                    ViewTreeObserverOnPreDrawListenerC3327.m9868(sb, abstractC20745.mo33991());
                    C1148.m4223(sb, strM10571);
                    ViewTreeObserverOnPreDrawListenerC3327.m9868(sb, abstractC20745.mo33964());
                    C2332.m7081(new C21393(z, C0817.m3407(sb), abstractC20745, textView, abstractActivityC12483, interfaceC5614, c17155, view, atomicBoolean));
                    break;
                case -31529430:
                case 2033983838:
                    if (!C0629.m2907()) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = C19806.m45029("ܿۜ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-11751)) ^ 1454069696;
                        i7 = -773898569;
                    }
                    break;
                case 784591972:
                case 825473341:
                    sb = new StringBuilder();
                    C1148.m4223(sb, C0629.m2900(abstractC20745));
                    sArr2 = f24205;
                    if (C2124.m6673() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 13713) ^ (-827767304);
                        i7 = -1450027676;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۖ") + i4) * 33;
                        i6 = ((iM45029 ^ i5) * 23163) ^ (-555983929);
                        i7 = -1065973473;
                    }
                    break;
                case 1228718329:
                case 2052277893:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۫۫")) * 29;
                        i6 = ((iM45029 ^ i5) * 20795) ^ 1801015579;
                        i7 = 1527019415;
                    }
                    break;
                case 1457738445:
                case 2091614980:
                    if (i2 <= 0) {
                        iM45029 = C19806.m45029("ܿۜ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-11751)) ^ 1454069696;
                        i7 = -773898569;
                    } else {
                        iM45029 = (C19806.m45029("֫᩻") + i4) * (-69);
                        i6 = ((iM45029 ^ i5) * (-16265)) ^ 684302470;
                        i7 = 679931174;
                    }
                    break;
                case 1568356233:
                case 1871228127:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("۬ܶ") ^ i4) * (-127);
                        i6 = ((iM45029 ^ i5) * 15815) ^ 775874044;
                        i7 = -210324723;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۧ") ^ i5) * (-121);
                        i6 = ((iM45029 ^ i4) * (-1025)) ^ 622367784;
                        i7 = 2049319293;
                    }
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21445)) ^ (-452133553);
                        i7 = -1264644186;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ۠") ^ i5) * (-47);
                        i6 = ((iM45029 ^ i4) * 11) ^ 938063955;
                        i7 = -1379139558;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19421(String str) {
        f24204.m25804(str);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C7282(l.AbstractC20745 r77, l.AbstractActivityC12483 r78, l.C16674 r79) {
        /*
            Method dump skipped, instruction units count: 4440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.<init>(l.᩷۠ۚ, l.۫ܶۘ, l.ܽܰۖ):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19427(l.AbstractActivityC12483 r39, android.view.View r40, java.security.cert.X509Certificate r41) {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.m19427(l.۫ܶۘ, android.view.View, java.security.cert.X509Certificate):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19422(C7282 c7282, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        int i = 1435119709;
        int i2 = C2788.f10625;
        int i3 = C1148.f5161;
        int iM45029 = (i2 - C19806.m45029("ۛ֨")) * 33;
        int i4 = ((iM45029 ^ i3) * 10541) ^ (-780440991);
        int i5 = 652094400;
        while (true) {
            i = ((((i ^ i3) * (-5885)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2020849412:
                case -1058107517:
                    if (!C3286.f12186) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * 53;
                        i4 = ((iM45029 ^ i3) * 8447) ^ 1454667362;
                        i5 = 1773601282;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ᩳ۠")) * 35;
                        i4 = ((iM45029 ^ i2) * 18819) ^ (-1957372273);
                        i5 = 197390937;
                    }
                    break;
                case -1675767696:
                case 402157299:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (C19806.m45029("᩷֡") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-8957)) ^ 1419963970;
                        i5 = 940738259;
                    } else {
                        iM45029 = C19806.m45029("ۗۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9599)) ^ (-1637139132);
                        i5 = -323161974;
                    }
                    break;
                case -1652696322:
                case -1079844687:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ܿ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23745)) ^ 1828683003;
                        i5 = -1549949471;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺۬")) * 53;
                        i4 = ((iM45029 ^ i2) * (-27561)) ^ 1370708215;
                        i5 = -1825407964;
                    }
                    break;
                case -1251078647:
                case 1859000958:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") + i2) * (-5);
                        i4 = ((iM45029 ^ i3) * 29403) ^ 1233787123;
                        i5 = 1329109485;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * 53;
                        i4 = ((iM45029 ^ i3) * 8447) ^ 1454667362;
                        i5 = 1773601282;
                    }
                    break;
                case -1229904142:
                case -600957372:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺۬")) * 53;
                        i4 = ((iM45029 ^ i2) * (-27561)) ^ 1370708215;
                        i5 = -1825407964;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩺") + i3) * 127;
                        i4 = ((iM45029 ^ i2) * (-12139)) ^ 187288774;
                        i5 = 247328860;
                    }
                    break;
                case -554713645:
                case -62560035:
                    C3743.m10966();
                    if (C0216.f1393 == 0) {
                        iM45029 = (C19806.m45029("᩷֡") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-8957)) ^ 1419963970;
                        i5 = 940738259;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * 53;
                        i4 = ((iM45029 ^ i3) * 8447) ^ 1454667362;
                        i5 = 1773601282;
                    }
                    break;
                case -441940408:
                case 1558075185:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ᩳ۠")) * 35;
                        i4 = ((iM45029 ^ i2) * 18819) ^ (-1957372273);
                        i5 = 197390937;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬۠")) * (-5);
                        i4 = ((iM45029 ^ i2) * (-27077)) ^ 457366425;
                        i5 = -82615410;
                    }
                    break;
                case -291870108:
                case 682458675:
                    C2788.m8472();
                    if (C0671.f2816 == 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * 53;
                        i4 = ((iM45029 ^ i3) * 8447) ^ 1454667362;
                        i5 = 1773601282;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30059)) ^ 1217224479;
                        i5 = -130032438;
                    }
                    break;
                case 184923259:
                case 603041223:
                    C1875.m6086();
                    C2124.m6673();
                    iM45029 = (i3 - C19806.m45029("ᩳ۠")) * 35;
                    i4 = ((iM45029 ^ i2) * 18819) ^ (-1957372273);
                    i5 = 197390937;
                    break;
                case 557455433:
                case 800778275:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * 53;
                        i4 = ((iM45029 ^ i3) * 8447) ^ 1454667362;
                        i5 = 1773601282;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21939)) ^ (-1261179713);
                        i5 = 1182741430;
                    }
                    break;
                case 961724604:
                case 1576971689:
                    if (C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺۬")) * 53;
                        i4 = ((iM45029 ^ i2) * (-27561)) ^ 1370708215;
                        i5 = -1825407964;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i3) * (-115);
                        i4 = ((iM45029 ^ i2) * 22903) ^ (-824657002);
                        i5 = -1919430639;
                    }
                    break;
                case 969705563:
                case 1775827035:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺۬")) * 53;
                        i4 = ((iM45029 ^ i2) * (-27561)) ^ 1370708215;
                        i5 = -1825407964;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۗ᩵")) * 19;
                        i4 = ((iM45029 ^ i3) * (-15331)) ^ 1120846746;
                        i5 = 1978294630;
                    }
                    break;
                case 1098078032:
                case 2128035543:
                    C0962.m3746();
                    break;
                case 1422906950:
                case 1882908732:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("᩷֡") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-8957)) ^ 1419963970;
                        i5 = 940738259;
                    } else {
                        iM45029 = C19806.m45029("ܺۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16049)) ^ 584992371;
                        i5 = -1993319680;
                    }
                    break;
                case 1969260955:
                case 2056265295:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ᩳ۠")) * 35;
                        i4 = ((iM45029 ^ i2) * 18819) ^ (-1957372273);
                        i5 = 197390937;
                    } else {
                        iM45029 = C19806.m45029("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10357)) ^ 207095816;
                        i5 = -1038725611;
                    }
                    break;
                default:
                    c7282.f24207.m25716(textView, textView2, textView3, textView4, textView5);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03db A[PHI: r17
      0x03db: PHI (r17v20 java.security.cert.X509Certificate) = 
      (r17v2 java.security.cert.X509Certificate)
      (r17v16 java.security.cert.X509Certificate)
      (r17v21 java.security.cert.X509Certificate)
     binds: [B:37:0x00e7, B:106:0x03d9, B:94:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0476 A[PHI: r17
      0x0476: PHI (r17v17 java.security.cert.X509Certificate) = 
      (r17v10 java.security.cert.X509Certificate)
      (r17v11 java.security.cert.X509Certificate)
      (r17v18 java.security.cert.X509Certificate)
     binds: [B:11:0x005b, B:118:0x0474, B:102:0x03b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x032b A[PHI: r17
      0x032b: PHI (r17v30 java.security.cert.X509Certificate) = (r17v22 java.security.cert.X509Certificate), (r17v33 java.security.cert.X509Certificate) binds: [B:88:0x0314, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19423(C7282 c7282, TextView textView, TextView textView2, TextView textView3, AbstractActivityC12483 abstractActivityC12483, View view, TextView textView4, TextView textView5, TextView textView6, TextView textView7, RunnableC17490 runnableC17490) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        X509Certificate x509Certificate;
        C7282 c7283 = c7282;
        TextView textView8 = textView;
        TextView textView9 = textView7;
        int i5 = C1148.f5161;
        int i6 = C3660.f13403;
        int iM450210 = (C19806.m45029("֨ܿ") ^ i5) * (-25);
        int i7 = ((iM450210 ^ i6) * 12575) ^ (-1258403410);
        String str = null;
        String sigAlgOID = null;
        String strM8546 = null;
        int i8 = iM450210 ^ (-395980304);
        int i9 = 0;
        int i10 = -1015482741;
        X509Certificate x509Certificate2 = null;
        String str2 = null;
        String strM4969 = null;
        boolean zM5058 = false;
        while (true) {
            i10 = i8 ^ (i7 & (((i10 ^ i6) * 30451) >> 31));
            switch (i10) {
                case -2071742258:
                case 768734453:
                    if (zM5058) {
                        int iM11307 = ThreadFactoryC3888.m11306("ܺᩴ") ^ i6;
                        i7 = ((iM11307 ^ i5) * (-20549)) ^ 313226519;
                        i8 = iM11307 ^ 1527536112;
                    } else {
                        str2 = str;
                        int iM11308 = ThreadFactoryC3888.m11306("۠ۨ") ^ i5;
                        x509Certificate = x509Certificate2;
                        i8 = iM11308 ^ 1919172706;
                        i7 = ((iM11308 ^ i6) * 5575) ^ (-933146792);
                        x509Certificate2 = x509Certificate;
                    }
                    break;
                case -1854815701:
                case 727030251:
                    x509Certificate2 = x509Certificate2;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-11037)) ^ (-540837919);
                        i4 = 1084299447;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ᩴۜ")) * 63;
                        i3 = ((iM11306 ^ i6) * 25309) ^ (-1692859063);
                        i4 = -82532519;
                    }
                    int i11 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i11;
                    c7283 = c7282;
                    break;
                case -1832131117:
                case 690005931:
                    C1977.m6356();
                    break;
                case -1756611688:
                case -187145237:
                    x509Certificate2 = x509Certificate2;
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۢ") ^ i5;
                        i3 = ((iM11306 ^ i6) * 2289) ^ (-1172895442);
                        i4 = 1575476298;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֫") ^ i6;
                        i3 = ((iM11306 ^ i5) * 9377) ^ (-1969534742);
                        i4 = 261052767;
                    }
                    int i12 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i12;
                    c7283 = c7282;
                    break;
                case -1742585367:
                case 779219698:
                    x509Certificate2 = x509Certificate2;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i5) * 75;
                        i3 = ((iM11306 ^ i6) * 8115) ^ (-1901477891);
                        i4 = 1140873899;
                    } else {
                        iM11306 = (C19806.m45029("᩸۬") ^ i5) * (-73);
                        i3 = ((iM11306 ^ i6) * (-4317)) ^ (-1550683038);
                        i4 = 1542543604;
                    }
                    int i13 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i13;
                    c7283 = c7282;
                    break;
                case -1685005466:
                case 1635807618:
                    x509Certificate2 = x509Certificate2;
                    strM4969 = C1419.m4969(f24205, 132, 5, i9);
                    C1461.m5083(textView8, strM4969);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView2, strM4969);
                    C1461.m5083(textView3, strM4969);
                    if (!C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i5) * 75;
                        i3 = ((iM11306 ^ i6) * 8115) ^ (-1901477891);
                        i4 = 1140873899;
                        int i14 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i14;
                        c7283 = c7282;
                    } else {
                        int iM450211 = C19806.m45029("ܽۛ") ^ i6;
                        i7 = ((iM450211 ^ i5) * 1193) ^ 652658572;
                        x509Certificate2 = x509Certificate2;
                        i8 = iM450211 ^ (-1295604686);
                        textView9 = textView7;
                    }
                    break;
                case -1300986519:
                case 627597903:
                    C1461.m5083(textView4, strM4969);
                    C3722.m10890(textView5, 8);
                    C3722.m10890(textView6, 8);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView9, strM4969);
                    textView9.setEnabled(false);
                    int iM450212 = (C19806.m45029("ۧ᩻") + i6) * (-125);
                    i7 = ((iM450212 ^ i5) * 8811) ^ (-691272092);
                    textView9 = textView7;
                    x509Certificate = x509Certificate2;
                    i8 = iM450212 ^ (-2009007706);
                    x509Certificate2 = x509Certificate;
                    break;
                case -1298497593:
                case 66731323:
                    if (C0671.f2816 == 0) {
                        iM45029 = C19806.m45029("ܰۚ") ^ i5;
                        i = ((iM45029 ^ i6) * (-17987)) ^ 1400417405;
                        i2 = 875527908;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i5) * 75;
                        i3 = ((iM11306 ^ i6) * 8115) ^ (-1901477891);
                        i4 = 1140873899;
                        int i15 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i15;
                        c7283 = c7282;
                    }
                    break;
                case -1278957218:
                case -1034025196:
                    if (C1461.f5957 > 0) {
                        iM45029 = C19806.m45029("ܽ۫") ^ i6;
                        i = ((iM45029 ^ i5) * 23621) ^ (-2057085714);
                        i2 = -1806369994;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = (i6 - C19806.m45029("᩻᩹")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM11306 ^ i5) * (-24827)) ^ 1317867636;
                        i4 = -1681765150;
                        int i16 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i16;
                        c7283 = c7282;
                    }
                    break;
                case -1154063251:
                case 1719620735:
                    x509Certificate2 = x509Certificate2;
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-24855)) ^ (-1044941182);
                        i4 = 648297365;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۡ") ^ i5;
                        i3 = ((iM11306 ^ i6) * 28341) ^ (-434777863);
                        i4 = -1350690034;
                    }
                    int i17 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i17;
                    c7283 = c7282;
                    break;
                case -1073655111:
                case -892100277:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("۠᩸") + i6) * 101;
                        i = ((iM45029 ^ i5) * 30163) ^ (-86012825);
                        i2 = -1212847268;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i6;
                        i = ((iM45029 ^ i5) * 12077) ^ (-2058306760);
                        i2 = -1097966580;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -861764919:
                case -336809484:
                    try {
                        strM8546 = C2811.m8546(sigAlgOID);
                        iM45029 = (C19806.m45029("᩶ᩴ") + i5) * 91;
                        i = ((iM45029 ^ i6) * 28865) ^ 178247723;
                        i2 = 300232054;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } catch (Exception unused) {
                        int iM11309 = (i5 - ThreadFactoryC3888.m11306("ۜܽ")) * (-75);
                        int i18 = ((iM11309 ^ i6) * (-14209)) ^ (-207407129);
                        i8 = iM11309 ^ (-147613252);
                        c7283 = c7282;
                        textView9 = textView7;
                        i7 = i18;
                        textView8 = textView;
                    }
                    break;
                case -851207967:
                case 1429075009:
                    x509Certificate2 = x509Certificate2;
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-11037)) ^ (-540837919);
                        i4 = 1084299447;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ᩴۧ")) * 5;
                        i3 = ((iM11306 ^ i5) * (-12361)) ^ 1188849690;
                        i4 = 852856316;
                    }
                    int i19 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i19;
                    c7283 = c7282;
                    break;
                case -791829672:
                case -496225672:
                    x509Certificate2 = x509Certificate2;
                    short s = f24205[126];
                    int i20 = s + 1;
                    if (((s * 2) + 1) - (i20 * i20) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۢ") ^ i6;
                        i3 = ((iM11306 ^ i5) * (-9249)) ^ 329871680;
                        i4 = -2017924895;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܿ") ^ i6;
                        i3 = ((iM11306 ^ i5) * (-19799)) ^ 1068889159;
                        i4 = -617011238;
                    }
                    int i110 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i110;
                    c7283 = c7282;
                    break;
                case -469826301:
                case -94689221:
                    X509Certificate x509Certificate3 = x509Certificate2;
                    try {
                        X509Certificate x509Certificate4 = (X509Certificate) CertificateFactory.getInstance(C7105.m18989(f24205, 127, 5, i9)).generateCertificate(new ByteArrayInputStream(c7283.f24206));
                        try {
                            String sigAlgName = x509Certificate4.getSigAlgName();
                            try {
                                sigAlgOID = x509Certificate4.getSigAlgOID();
                                zM5058 = C1460.m5058(sigAlgName, sigAlgOID);
                                int iM450213 = (i5 - C19806.m45029("᩺᩶")) * (-99);
                                i8 = iM450213 ^ 443149073;
                                i7 = ((iM450213 ^ i6) * 26027) ^ (-1734191601);
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                c7283 = c7282;
                                textView8 = textView;
                                textView9 = textView7;
                            } catch (Exception unused2) {
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                int iM113010 = (i5 - ThreadFactoryC3888.m11306("ۜܽ")) * (-75);
                                int i111 = ((iM113010 ^ i6) * (-14209)) ^ (-207407129);
                                i8 = iM113010 ^ (-147613252);
                                c7283 = c7282;
                                textView9 = textView7;
                                i7 = i111;
                                textView8 = textView;
                            }
                        } catch (Exception unused3) {
                            x509Certificate2 = x509Certificate4;
                        }
                    } catch (Exception unused4) {
                        x509Certificate2 = x509Certificate3;
                    }
                    break;
                case -371008360:
                case 269889057:
                    i9 = 65280;
                    iM11306 = ThreadFactoryC3888.m11306("۫ۜ") ^ i5;
                    i3 = ((iM11306 ^ i6) * 28429) ^ (-1155638967);
                    i4 = -2048350067;
                    int i112 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i112;
                    c7283 = c7282;
                    break;
                case -285399897:
                case 576174721:
                    C19806.m45024();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۘ") + i6) * 47;
                        i3 = ((iM11306 ^ i5) * 6259) ^ (-270681589);
                        i4 = 461262216;
                        int i113 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i113;
                        c7283 = c7282;
                    } else {
                        iM45029 = C19806.m45029("ܰۚ") ^ i5;
                        i = ((iM45029 ^ i6) * (-17987)) ^ 1400417405;
                        i2 = 875527908;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                case 232243597:
                case 411078497:
                    try {
                        MenuItemOnMenuItemClickListenerC3244.m9704(textView8, str2);
                        MenuItemOnMenuItemClickListenerC3244.m9704(textView2, C5319.m14739(x509Certificate2.getNotBefore().getTime()));
                        MenuItemOnMenuItemClickListenerC3244.m9704(textView3, C5319.m14739(x509Certificate2.getNotAfter().getTime()));
                        try {
                            m19427(abstractActivityC12483, view, x509Certificate2);
                            int iM450214 = (C19806.m45029("ۧ᩻") + i6) * (-125);
                            i7 = ((iM450214 ^ i5) * 8811) ^ (-691272092);
                            textView9 = textView7;
                            x509Certificate = x509Certificate2;
                            i8 = iM450214 ^ (-2009007706);
                            x509Certificate2 = x509Certificate;
                        } catch (Exception unused5) {
                            int iM113011 = (i5 - ThreadFactoryC3888.m11306("ۜܽ")) * (-75);
                            int i114 = ((iM113011 ^ i6) * (-14209)) ^ (-207407129);
                            i8 = iM113011 ^ (-147613252);
                            c7283 = c7282;
                            textView9 = textView7;
                            i7 = i114;
                            textView8 = textView;
                        }
                    } catch (Exception unused6) {
                        int iM113012 = (i5 - ThreadFactoryC3888.m11306("ۜܽ")) * (-75);
                        int i115 = ((iM113012 ^ i6) * (-14209)) ^ (-207407129);
                        i8 = iM113012 ^ (-147613252);
                        c7283 = c7282;
                        textView9 = textView7;
                        i7 = i115;
                        textView8 = textView;
                        break;
                    }
                    break;
                case 368226371:
                case 1863046112:
                    x509Certificate2 = x509Certificate2;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۢ") ^ i5;
                        i3 = ((iM11306 ^ i6) * 2289) ^ (-1172895442);
                        i4 = 1575476298;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩶") + i5) * 67;
                        i3 = ((iM11306 ^ i6) * (-1373)) ^ 2045602060;
                        i4 = 561186685;
                    }
                    int i116 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i116;
                    c7283 = c7282;
                    break;
                case 612838897:
                case 1740939267:
                    c7283.f24207.m25717(c7283.f24206);
                    runnableC17490.run();
                    break;
                case 741142950:
                case 1297936872:
                    x509Certificate2 = x509Certificate2;
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i6;
                        i3 = ((iM11306 ^ i5) * (-30497)) ^ 699641814;
                        i4 = -716502025;
                    } else {
                        iM11306 = (i6 - C19806.m45029("᩻᩹")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM11306 ^ i5) * (-24827)) ^ 1317867636;
                        i4 = -1681765150;
                    }
                    int i117 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i117;
                    c7283 = c7282;
                    break;
                case 765981122:
                case 1802043233:
                    RunnableC1564.m5345();
                    if (C3535.f13026 > 0) {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = (i6 - C19806.m45029("᩻᩹")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM11306 ^ i5) * (-24827)) ^ 1317867636;
                        i4 = -1681765150;
                        int i118 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i118;
                        c7283 = c7282;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i6;
                        i = ((iM45029 ^ i5) * 12077) ^ (-2058306760);
                        i2 = -1097966580;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                case 813922178:
                case 1268565673:
                    RunnableC0195.m1431();
                    if (AbstractC0464.f2088 <= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i5) * 75;
                        i3 = ((iM11306 ^ i6) * 8115) ^ (-1901477891);
                        i4 = 1140873899;
                        int i119 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i119;
                        c7283 = c7282;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i6;
                        i = ((iM45029 ^ i5) * 12077) ^ (-2058306760);
                        i2 = -1097966580;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                case 832783512:
                case 1122358259:
                    x509Certificate2 = x509Certificate2;
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i6;
                        i3 = ((iM11306 ^ i5) * 19697) ^ (-342435570);
                        i4 = 115292258;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۘ") + i6) * 47;
                        i3 = ((iM11306 ^ i5) * 6259) ^ (-270681589);
                        i4 = 461262216;
                    }
                    int i1110 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1110;
                    c7283 = c7282;
                    break;
                case 901808414:
                case 1946842065:
                    str2 = strM8546 == null ? sigAlgOID : strM8546;
                    int iM113013 = ThreadFactoryC3888.m11306("۠ۨ") ^ i5;
                    x509Certificate = x509Certificate2;
                    i8 = iM113013 ^ 1919172706;
                    i7 = ((iM113013 ^ i6) * 5575) ^ (-933146792);
                    x509Certificate2 = x509Certificate;
                    break;
                case 1027443676:
                case 1873071419:
                    if (C2477.m7593() >= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-11037)) ^ (-540837919);
                        i4 = 1084299447;
                        int i1111 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i1111;
                        c7283 = c7282;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i6;
                        i = ((iM45029 ^ i5) * 12077) ^ (-2058306760);
                        i2 = -1097966580;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                case 1058184772:
                case 1504221365:
                    C2871.m8646();
                    C7105.m18985();
                    iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i6;
                    i = ((iM45029 ^ i5) * 12077) ^ (-2058306760);
                    i2 = -1097966580;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 1200254930:
                case 1285020226:
                    i9 = 29504;
                    iM11306 = ThreadFactoryC3888.m11306("۫ۜ") ^ i5;
                    i3 = ((iM11306 ^ i6) * 28429) ^ (-1155638967);
                    i4 = -2048350067;
                    int i1112 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1112;
                    c7283 = c7282;
                    break;
                case 1494714823:
                case 1748936508:
                    if (RunnableC1606.f6488 >= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۢ") ^ i5;
                        i3 = ((iM11306 ^ i6) * 2289) ^ (-1172895442);
                        i4 = 1575476298;
                        int i1113 = iM11306 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i1113;
                        c7283 = c7282;
                    } else {
                        iM45029 = C19806.m45029("ܽ۫") ^ i6;
                        i = ((iM45029 ^ i5) * 23621) ^ (-2057085714);
                        i2 = -1806369994;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    }
                    break;
                default:
                    x509Certificate2 = x509Certificate2;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i5;
                        i3 = ((iM11306 ^ i6) * (-24855)) ^ (-1044941182);
                        i4 = 648297365;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۧ֫")) * (-11);
                        i3 = ((iM11306 ^ i6) * (-14483)) ^ (-374585026);
                        i4 = -450153632;
                    }
                    int i1114 = iM11306 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1114;
                    c7283 = c7282;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0237 A[PHI: r3 r4 r5
      0x0237: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v8 int) binds: [B:57:0x0235, B:53:0x0215, B:49:0x01f5, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r4v3 android.view.View[]) = (r4v2 android.view.View[]), (r4v2 android.view.View[]), (r4v2 android.view.View[]), (r4v4 android.view.View[]) binds: [B:57:0x0235, B:53:0x0215, B:49:0x01f5, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:57:0x0235, B:53:0x0215, B:49:0x01f5, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0321  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19424(C7282 c7282, ArrayList arrayList, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, RunnableC13633 runnableC13633, View view) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int iM11307;
        int i5;
        int i6;
        Iterator itM10563 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View[] viewArr = null;
        int i10 = 0;
        TextView textView12 = null;
        int i11 = 0;
        boolean z = false;
        int i12 = 1315267367;
        int i13 = C2788.f10625;
        int i14 = C2477.f9839;
        int iM450210 = C19806.m45029("ܰۤ") ^ i14;
        int i15 = ((iM450210 ^ i13) * 9211) ^ (-737177875);
        int i16 = 1622226631;
        while (true) {
            int i17 = iM450210 ^ i16;
            while (true) {
                i12 = ((((i12 ^ i13) * 17597) >> 31) & i15) ^ i17;
                switch (i12) {
                    case -2134341241:
                    case 1590482788:
                        ThreadFactoryC3888.m11300();
                        if (!CallableC1627.f6528) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ᩷") + i13) * (-41);
                            i = ((iM45029 ^ i14) * 16555) ^ (-1141253940);
                            i2 = 1368920348;
                            i17 = iM45029 ^ i2;
                            i15 = i;
                        }
                        iM45029 = C19806.m45029("۠֨") ^ i13;
                        i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                        i2 = 874391203;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -2067886242:
                    case -110849372:
                        if (C1189.m4368() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ᩷") + i13) * (-41);
                            i = ((iM45029 ^ i14) * 16555) ^ (-1141253940);
                            i2 = 1368920348;
                        } else {
                            iM45029 = (i14 - ThreadFactoryC3888.m11306("ۡۗ")) * 19;
                            i = ((iM45029 ^ i13) * (-1459)) ^ 2091170913;
                            i2 = -2061362042;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -1990346308:
                    case -608628842:
                        View view2 = viewArr[i11];
                        AbstractC0464.m2301(view2, 0.0f);
                        view2.animate().alpha(1.0f).setDuration(200L).setStartDelay(i11 * 15).start();
                        i11++;
                        iM11307 = ThreadFactoryC3888.m11306("ۛۢ") ^ i13;
                        i5 = ((iM11307 ^ i14) * 24433) ^ (-498523537);
                        i6 = -1527528252;
                        i17 = iM11307 ^ i6;
                        i15 = i5;
                        break;
                    case -1759345896:
                    case 307014576:
                        if (z) {
                            iM45029 = C19806.m45029("۠֨") ^ i13;
                            i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                            i2 = 874391203;
                        } else {
                            iM45029 = C19806.m45029("۬ۡ") ^ i14;
                            i = ((iM45029 ^ i13) * 8369) ^ (-2120201776);
                            i2 = 1124983300;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -1651765608:
                    case 850834317:
                        if (ThreadFactoryC3888.m11300() <= 0) {
                            iM45029 = C19806.m45029("۠֨") ^ i13;
                            i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                            i2 = 874391203;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۫ܺ") ^ i13;
                            i = ((iM45029 ^ i14) * 17087) ^ 129296130;
                            i2 = -26619099;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -1639545799:
                    case -1124609363:
                        if (C0797.m3359()) {
                            iM45029 = (C19806.m45029("ۜۜ") ^ i13) * (-49);
                            i = ((iM45029 ^ i14) * 27067) ^ (-389160229);
                            i2 = 2133582943;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i14) * q.h;
                            i = ((iM45029 ^ i13) * (-31809)) ^ (-358208345);
                            i2 = -1767574770;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -1639487755:
                    case 1897788789:
                        if (i11 >= i9) {
                            iM450210 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i14;
                            i15 = ((iM450210 ^ i13) * 28601) ^ (-276634320);
                            i16 = -1580237232;
                        } else {
                            iM450210 = C19806.m45029("۟ۛ") ^ i14;
                            i15 = ((iM450210 ^ i13) * (-10725)) ^ (-1917072602);
                            i16 = -1417096540;
                        }
                        break;
                    case -1581308362:
                    case -771837290:
                        runnableC13633.run();
                        break;
                    case -1395278677:
                    case -504359235:
                        C2249.m6915();
                        C2704.m8255();
                        break;
                    case -1169805121:
                    case 318564955:
                        itM10563 = C3577.m10563(arrayList);
                        iM45029 = C19806.m45029("ܳ᩵") ^ i14;
                        i = ((iM45029 ^ i13) * 21549) ^ 465088161;
                        i2 = 1793307280;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -1112916762:
                    case -918440080:
                        c7282.f24206 = (byte[]) ((InterfaceC23949) view.getTag()).get();
                        i9 = 11;
                        viewArr = new View[11];
                        i10 = 0;
                        viewArr[0] = textView;
                        viewArr[i8] = textView2;
                        viewArr[2] = textView3;
                        viewArr[3] = textView4;
                        if (C3660.f13403 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i14) * q.h;
                            i = ((iM45029 ^ i13) * (-31809)) ^ (-358208345);
                            i2 = -1767574770;
                        } else {
                            iM45029 = C19806.m45029("ۡۖ") ^ i14;
                            i = ((iM45029 ^ i13) * (-6161)) ^ (-159345700);
                            i2 = 2126765979;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -957933993:
                    case 378629149:
                        textView12 = (TextView) C0278.m1776(itM10563);
                        if (view == textView12) {
                            iM11307 = ThreadFactoryC3888.m11306("ܶۛ") ^ i13;
                            i5 = ((iM11307 ^ i14) * 18627) ^ (-615745372);
                            i6 = -994440814;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i14;
                            i5 = ((iM11307 ^ i13) * (-7805)) ^ 698797177;
                            i6 = -1935596951;
                        }
                        i17 = iM11307 ^ i6;
                        i15 = i5;
                        break;
                    case -740741886:
                    case 1917020885:
                        if (C7105.m18985()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i14) * q.h;
                            i = ((iM45029 ^ i13) * (-31809)) ^ (-358208345);
                            i2 = -1767574770;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩶᩵") ^ i14;
                            i = ((iM45029 ^ i13) * 19179) ^ (-1606488823);
                            i2 = 1657709066;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -693030258:
                    case 723684393:
                        if (C0797.f3386) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ᩷") + i13) * (-41);
                            i = ((iM45029 ^ i14) * 16555) ^ (-1141253940);
                            i2 = 1368920348;
                        } else {
                            iM45029 = C19806.m45029("ᩴ᩻") ^ i14;
                            i = ((iM45029 ^ i13) * 17441) ^ 1402014602;
                            i2 = -306297103;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -640192174:
                    case 290719009:
                        C1148.m4225(textView12, C20368.f65970);
                        textView12.setTypeface(Typeface.DEFAULT_BOLD);
                        textView12.setPaintFlags(i7);
                        iM45029 = C19806.m45029("ܳ᩵") ^ i14;
                        i = ((iM45029 ^ i13) * 21549) ^ 465088161;
                        i2 = 1793307280;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -613164236:
                    case 276878749:
                        z = RunnableC1564.f6300;
                        iM45029 = (C19806.m45029("ۨۜ") + i13) * (-113);
                        i = ((iM45029 ^ i14) * 5981) ^ (-1843656208);
                        i2 = 101338318;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case -317836471:
                    case 706978668:
                        if (C1977.f7413 <= 0) {
                            iM450210 = (C19806.m45029("᩸᩸") + i13) * (-69);
                            i15 = ((iM450210 ^ i14) * 25741) ^ 750191171;
                            i16 = 257892782;
                        } else {
                            iM450210 = C19806.m45029("ۚ֡") ^ i14;
                            i15 = ((iM450210 ^ i13) * (-16813)) ^ 1677906339;
                            i16 = 1798856986;
                        }
                        break;
                    case -136641601:
                    case 250742112:
                        viewArr[4] = textView5;
                        viewArr[5] = textView6;
                        viewArr[6] = textView7;
                        viewArr[7] = textView8;
                        viewArr[8] = textView9;
                        viewArr[i7] = textView10;
                        viewArr[10] = textView11;
                        i11 = i10;
                        iM11307 = ThreadFactoryC3888.m11306("ۛۢ") ^ i13;
                        i5 = ((iM11307 ^ i14) * 24433) ^ (-498523537);
                        i6 = -1527528252;
                        i17 = iM11307 ^ i6;
                        i15 = i5;
                        break;
                    case -135131050:
                    case -57468793:
                        C1148.m4225(textView12, C20368.f66007);
                        textView12.setTypeface(Typeface.DEFAULT);
                        textView12.setPaintFlags(i8);
                        iM45029 = C19806.m45029("ܳ᩵") ^ i14;
                        i = ((iM45029 ^ i13) * 21549) ^ 465088161;
                        i2 = 1793307280;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case 397332278:
                    case 2042352869:
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i14) * q.h;
                            i = ((iM45029 ^ i13) * (-31809)) ^ (-358208345);
                            i2 = -1767574770;
                        } else {
                            iM45029 = C19806.m45029("ܰ᩸") ^ i13;
                            i = ((iM45029 ^ i14) * 32303) ^ 1647532292;
                            i2 = 1269340071;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case 449990108:
                    case 1512552303:
                        if (C0962.m3748(itM10563)) {
                            iM11306 = C19806.m45029("۟ܳ") ^ i13;
                            i3 = ((iM11306 ^ i14) * 2827) ^ 1741811406;
                            i4 = -1015063809;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i13;
                            i3 = ((iM11306 ^ i14) * 17213) ^ 622663224;
                            i4 = 481060568;
                        }
                        i17 = iM11306 ^ i4;
                        i15 = i3;
                        i7 = 9;
                        i8 = 1;
                        break;
                    case 453623283:
                    case 1147745341:
                        RunnableC3388.m10064();
                        C1377.m4833();
                        iM45029 = C19806.m45029("۠֨") ^ i13;
                        i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                        i2 = 874391203;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case 669435506:
                    case 859584927:
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                            iM45029 = C19806.m45029("۠֨") ^ i13;
                            i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                            i2 = 874391203;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i13) * 77;
                            i = ((iM45029 ^ i14) * 12461) ^ 569639579;
                            i2 = -591080011;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    case 730326108:
                    case 1618865911:
                        if (C3722.m10894() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ᩷") + i13) * (-41);
                            i = ((iM45029 ^ i14) * 16555) ^ (-1141253940);
                            i2 = 1368920348;
                        } else {
                            iM45029 = C19806.m45029("֨᩹") ^ i14;
                            i = ((iM45029 ^ i13) * (-12063)) ^ (-1676559846);
                            i2 = 1738473481;
                        }
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                    default:
                        if (C1148.m4232() > 0) {
                            iM450210 = C19806.m45029("ۚ֡") ^ i14;
                            i15 = ((iM450210 ^ i13) * (-16813)) ^ 1677906339;
                            i16 = 1798856986;
                        }
                        iM45029 = C19806.m45029("۠֨") ^ i13;
                        i = ((iM45029 ^ i14) * (-24281)) ^ 582739078;
                        i2 = 874391203;
                        i17 = iM45029 ^ i2;
                        i15 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02a8 A[PHI: r2 r9 r14 r19 r21
      0x02a8: PHI (r2v3 l.᩷۠ۚ) = (r2v2 l.᩷۠ۚ), (r2v4 l.᩷۠ۚ) binds: [B:76:0x02a6, B:57:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:76:0x02a6, B:57:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r14v3 short[]) = (r14v2 short[]), (r14v4 short[]) binds: [B:76:0x02a6, B:57:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r19v24 java.io.IOException) = (r19v17 java.io.IOException), (r19v25 java.io.IOException) binds: [B:76:0x02a6, B:57:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r21v11 char) = (r21v4 char), (r21v12 char) binds: [B:76:0x02a6, B:57:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0336 A[PHI: r7 r8 r15 r19 r20 r21
      0x0336: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r19v28 java.io.IOException) = (r19v14 java.io.IOException), (r19v16 java.io.IOException), (r19v26 java.io.IOException), (r19v29 java.io.IOException) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r21v15 char) = (r21v2 char), (r21v3 char), (r21v13 char), (r21v16 char) binds: [B:89:0x0334, B:80:0x02de, B:53:0x01a4, B:36:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if (l.C19806.f63586 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        if (l.C1977.f7413 > 0) goto L36;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19430(l.C7282 r23, l.AbstractActivityC12483 r24) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.m19430(l.۟ۛۨ, l.۫ܶۘ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19420(TextView textView, TextView textView2, CharSequence charSequence) {
        int i = 0;
        int i2 = 498765312;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("ۧ᩸") ^ i3;
        int i5 = ((iM45029 ^ i4) * 14383) ^ (-1319585556);
        int i6 = 1419385332;
        while (true) {
            i2 = ((((i2 ^ i4) * 3581) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2128075586:
                case -1091338278:
                    C3722.m10890(textView, i);
                    C3722.m10890(textView2, i);
                    if (charSequence != null) {
                        iM45029 = (C19806.m45029("۫᩻") ^ i4) * (-107);
                        i5 = ((iM45029 ^ i3) * (-25531)) ^ 810840467;
                        i6 = 1681192330;
                    } else {
                        iM45029 = C19806.m45029("֫ۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8817) ^ (-2090464077);
                        i6 = 1081525497;
                    }
                    break;
                case -2024669698:
                case 1466549820:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * 53;
                        i5 = ((iM45029 ^ i4) * (-18007)) ^ 1663065496;
                        i6 = 1763322533;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ۬") + i4) * 127;
                        i5 = ((iM45029 ^ i3) * 4551) ^ 1353743892;
                        i6 = -1981551335;
                    }
                    break;
                case -1960931283:
                case 2011623014:
                    C1025.m3861();
                    break;
                case -1922054982:
                case 2104853332:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ᩴ") ^ i3) * 17;
                        i5 = ((iM45029 ^ i4) * 6993) ^ 1716732321;
                        i6 = 763763350;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۠") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * (-7817)) ^ 752060082;
                        i6 = -25733601;
                    }
                    break;
                case -1861134229:
                case 372040196:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (i4 - C19806.m45029("ܺ۠")) * 123;
                        i5 = ((iM45029 ^ i3) * 7825) ^ 850449281;
                        i6 = -2022319059;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-13005)) ^ (-410740788);
                        i6 = 1991316223;
                    }
                    break;
                case -1822266084:
                case -1505185678:
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("᩻ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-8545)) ^ (-1885169578);
                        i6 = -1347979772;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30145)) ^ 748945264;
                        i6 = -320933749;
                    }
                    break;
                case -1685390015:
                case 999334421:
                    C1461.m5083(textView2, charSequence);
                    iM45029 = C19806.m45029("֫ۜ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 8817) ^ (-2090464077);
                    i6 = 1081525497;
                    break;
                case -1673285345:
                case -747520658:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * 53;
                        i5 = ((iM45029 ^ i4) * (-18007)) ^ 1663065496;
                        i6 = 1763322533;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܰ۬")) * 73;
                        i5 = ((iM45029 ^ i4) * (-7387)) ^ (-2058962423);
                        i6 = 793713714;
                    }
                    break;
                case -1508913374:
                case -39773069:
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30145)) ^ 748945264;
                        i6 = -320933749;
                    } else {
                        iM45029 = C19806.m45029("᩺۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-571)) ^ 1427163064;
                        i6 = 506212362;
                    }
                    break;
                case -1314265791:
                case 899942573:
                    if (charSequence == null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۤ") + i3) * 11;
                        i5 = ((iM45029 ^ i4) * 17253) ^ (-1320146843);
                        i6 = -667087095;
                    } else {
                        iM45029 = C19806.m45029("ܿۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25361) ^ 778965889;
                        i6 = 1164551517;
                    }
                    break;
                case -1277163214:
                case 1843516152:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * 53;
                        i5 = ((iM45029 ^ i4) * (-18007)) ^ 1663065496;
                        i6 = 1763322533;
                    } else {
                        iM45029 = C19806.m45029("ܶۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24793)) ^ 275275778;
                        i6 = 1564325201;
                    }
                    break;
                case -1261081093:
                case 1852691763:
                    i = 8;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩹")) * 75;
                    i5 = ((iM45029 ^ i4) * (-26481)) ^ (-1205703597);
                    i6 = -820423692;
                    break;
                case -1161977811:
                case -975889066:
                    C1025.m3861();
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۠") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * (-7817)) ^ 752060082;
                        i6 = -25733601;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-13005)) ^ (-410740788);
                        i6 = 1991316223;
                    }
                    break;
                case -1138097208:
                case 204443462:
                    i = 0;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩹")) * 75;
                    i5 = ((iM45029 ^ i4) * (-26481)) ^ (-1205703597);
                    i6 = -820423692;
                    break;
                case -811342123:
                case 194878185:
                    C3660.m10791();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ܽܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-13005)) ^ (-410740788);
                        i6 = 1991316223;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * 53;
                        i5 = ((iM45029 ^ i4) * (-18007)) ^ 1663065496;
                        i6 = 1763322533;
                    }
                    break;
                case -719379649:
                case 642838096:
                    if (C1398.f5802 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28147) ^ 1387816820;
                        i6 = 1121694069;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-13005)) ^ (-410740788);
                        i6 = 1991316223;
                    }
                    break;
                case -104347713:
                case 1242338097:
                    if (C3743.m10966() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30145)) ^ 748945264;
                        i6 = -320933749;
                    } else {
                        iM45029 = C19806.m45029("ۜۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6683) ^ (-1629699545);
                        i6 = -118492332;
                    }
                    break;
                case 49898369:
                case 1267124311:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۠") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * (-7817)) ^ 752060082;
                        i6 = -25733601;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i3) * 71;
                        i5 = ((iM45029 ^ i4) * (-14445)) ^ (-2135205291);
                        i6 = 137526412;
                    }
                    break;
                case 154189819:
                case 1133812974:
                    break;
                case 190765363:
                case 1734992774:
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28147) ^ 1387816820;
                        i6 = 1121694069;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۖܺ")) * (-93);
                        i5 = ((iM45029 ^ i3) * (-3165)) ^ 534230773;
                        i6 = -941728289;
                    }
                    break;
                default:
                    C1875.m6086();
                    iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * 53;
                    i5 = ((iM45029 ^ i4) * (-18007)) ^ 1663065496;
                    i6 = 1763322533;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ce, code lost:
    
        if (l.C3660.f13403 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01f6, code lost:
    
        if (l.C0817.f3443 != false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19428(l.AbstractActivityC12483 r50, l.C8694 r51) {
        /*
            Method dump skipped, instruction units count: 3456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.m19428(l.۫ܶۘ, l.ۡۛۨ):void");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0172 A[PHI: r5 r7 r8 r9 r10
      0x0172: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String) binds: [B:37:0x0170, B:25:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r7v6 android.widget.EditText) = (r7v5 android.widget.EditText), (r7v2 android.widget.EditText) binds: [B:37:0x0170, B:25:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:37:0x0170, B:25:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:37:0x0170, B:25:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r10v3 l.۠ۡۜ) = (r10v2 l.۠ۡۜ), (r10v5 l.۠ۡۜ) binds: [B:37:0x0170, B:25:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (l.RunnableC3388.f12514 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (l.C3535.f13026 <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19429(l.AbstractActivityC12483 r27, l.C10105 r28) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7282.m19429(l.۫ܶۘ, l.ۤۛۨ):void");
    }
}
