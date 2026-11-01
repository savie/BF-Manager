package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;

/* JADX INFO: renamed from: l.֫ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1997 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۛۧ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f7453 = {9345, -8793, 11437, 5911, 376, 23321, 23318, 23313, 23317, 23321, 23308, 23313, 23319, 23318, 1989, 2157, 2146, 2149, 2145, 2157, 2168, 2149, 2147, 2146, 2157, 2144, 2172, 2148, 2157, 2580, -16962, -16975, -16970, -16974, -16962, -16981, -16970, -16976, -16975, 3951, 12217, 12214, 12209, 12213, 12217, 12204, 12209, 12215, 12214, 22489, -19778, 22636, 12257, 12266, 12265, 12269, 12269, 12256, 12268, 12268, 12269, 12184, 12201, 12201, 12278, 12219, 12215, 12213, 12223, 12221, 12204, 12190, 12202, 12215, 12213, 12187, 12217, 12219, 12208, 12221, 12272, 12278, 12278, 12278, 12273, 12201, 12201, 12167, 12201, 12205, 12214, 12265, 12201, 12201, 12167, 12201, 12205, 12214, 12266, 12267, 12264, 12271, 12256, 12265, 12271, 12264, 12269, 12256, 12196, 12208, 12204, 12204, 12200, 12203, 12258, 12279, 12279, 12210, 12201, 12278, 12201, 12201, 12278, 12219, 12215, 12213, 12279, 12263, 12167, 12207, 12206, 12261, 12265, 12264, 12266, 12271, 12286, 12211, 12261, 12186, 12271, 12179, 12265, 12208, 12222, 12179, 12171, 12196, 12205, 12176, 12174, 12200, 12201, 12181, 12264, 12173, 12214, 12205, 12161, 12205, 12208, 12257, 12192, 12173, 12171, 12215, 12177, 12221, 12180, 12269, 12202, 12207, 12182, 12268, 12223, 12217, 12208, 12269, 12269, 12206, 12201, 12201, 12167, 12201, 12205, 12214, 12267, 12266, 12269, 12266, 12266, 12267, 12267, 12256, 12257, 12265, 12196, 12208, 12204, 12204, 12200, 12203, 12258, 12279, 12279, 12210, 12201, 12278, 12201, 12201, 12278, 12219, 12215, 12213, 12279, 12263, 12167, 12207, 12206, 12261, 12265, 12264, 12266, 12271, 12286, 12211, 12261, 12207, 12175, 12265, 12223, 12173, 12206, 12222, 12207, 12196, 12267, 12180, 12160, 12187, 12185, 12269, 12205, 12207, 12168, 12194, 12214, 12220, 12209, 12219, 12162, 12257, 12223, 12220, 12264, 12169, 12221, 12203, 12204, 12172, 12182, 12265, 12168, 12182, 12185, 12176, 12173, 12189, 12201, 12201, 12167, 12219, 12208, 12217, 12214, 12214, 12221, 12212, 12268, 12256, 12271, 12266, 12268, 12268, 12267, 12257, 12266, 12196, 12208, 12204, 12204, 12200, 12203, 12258, 12279, 12279, 12210, 12201, 12278, 12201, 12201, 12278, 12219, 12215, 12213, 12279, 12263, 12167, 12207, 12206, 12261, 12265, 12264, 12266, 12271, 12286, 12211, 12261, 12200, 12175, 12182, 12160, 12217, 12215, 12217, 12188, 12196, 12190, 12219, 12257, 12179, 12181, 12173, 12172, 12190, 12204, 12202, 12211, 12271, 12219, 12222, 12200, 12213, 12214, 12264, 12186, 12209, 12269, 12268, 12171, 12178, 12183, 12214, 12222, 12190, 12217, 12212, 12219, 12161, -21125, 29033, -20676, 22307, -20549, -20684, -22410, -20726, -21075, -18797, -16715, 29572, 32456, -17804, -22648, 18322, -16454, -16921, 31235, -22070, 22807, 12176, 12168, 12172, 12269, 12266, 12177, 12179, 12189, 12161, 12270, 12196, 12208, 12204, 12204, 12200, 12203, 12258, 12279, 12279, 12200, 12220, 12278, 12201, 12201, 12278, 12219, 12215, 12213, 12279, 12203, 12279, 12271, 12269, 12269, 12271, 12203, 12206, 12219, 12221, 12215};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f7454;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14015 f7455;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f7456;

    /* JADX WARN: Code duplicated, block: B:56:0x01d2 A[PHI: r1 r5 r6 r16
      0x01d2: PHI (r1v2 char) = (r1v1 char), (r1v1 char), (r1v1 char), (r1v4 char) binds: [B:45:0x015f, B:41:0x013e, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:45:0x015f, B:41:0x013e, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:45:0x015f, B:41:0x013e, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r16v18 int) = (r16v8 int), (r16v9 int), (r16v17 int), (r16v20 int) binds: [B:45:0x015f, B:41:0x013e, B:10:0x0047, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0229 A[PHI: r4 r16
      0x0229: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:63:0x0227, B:49:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r16v6 int) = (r16v3 int), (r16v7 int) binds: [B:63:0x0227, B:49:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025b A[PHI: r0 r16
      0x025b: PHI (r0v3 short[]) = (r0v1 short[]), (r0v2 short[]), (r0v1 short[]) binds: [B:67:0x0259, B:59:0x0206, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r16v15 int) = (r16v2 int), (r16v4 int), (r16v16 int) binds: [B:67:0x0259, B:59:0x0206, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (l.C3577.f13150 < 0) goto L14;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationRepeat(android.animation.Animator r19) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1997.onAnimationRepeat(android.animation.Animator):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02bf A[PHI: r0 r9 r11 r31
      0x02bf: PHI (r0v113 short[]) = (r0v2 short[]), (r0v122 short[]) binds: [B:42:0x02bd, B:30:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r9v7 short[]) = (r9v6 short[]), (r9v2 short[]) binds: [B:42:0x02bd, B:30:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:42:0x02bd, B:30:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r31v54 java.lang.CharSequence) = (r31v51 java.lang.CharSequence), (r31v58 java.lang.CharSequence) binds: [B:42:0x02bd, B:30:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        CharSequence charSequence;
        int iM45029;
        int i;
        int i2;
        String str;
        int iM11306;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        short[] sArr;
        String str2;
        List list;
        TextView textView;
        List list2;
        AbstractActivityC12483 abstractActivityC12483;
        C8416 c8416;
        C14015 c14015;
        TextView textView2;
        String str3;
        int iM450211;
        int i7;
        int i8;
        short[] sArr2;
        C14015 c14016;
        AbstractActivityC12483 abstractActivityC12484;
        TextView textView3;
        C8416 c8416M22053;
        String str4;
        short[] sArr3;
        String str5;
        TextView textView4;
        List list3;
        AbstractActivityC12483 abstractActivityC12485;
        C8416 c8417;
        C14015 c14017;
        String str6;
        List listM31135;
        int i9;
        int i10;
        short[] sArr4;
        String str7;
        List list4;
        TextView textView5;
        List list5;
        AbstractActivityC12483 abstractActivityC12486;
        C8416 c8418;
        int iM11307;
        int i11;
        int i12;
        AbstractActivityC12483 abstractActivityC12487;
        int iM450212;
        int i13;
        int i14;
        short[] sArr5;
        List list6;
        List list7;
        TextView textView6;
        int i15 = 839048438;
        int i16 = C1668.f6641;
        int i17 = RunnableC3388.f12514;
        int iM11308 = ThreadFactoryC3888.m11306("ۗ۟") ^ i17;
        int i18 = ((iM11308 ^ i16) * 5349) ^ 2117116786;
        int i19 = iM11308 ^ 353683227;
        String str8 = null;
        String strM2308 = null;
        TextView textView7 = null;
        final C14015 c14018 = null;
        final AbstractActivityC12483 abstractActivityC12488 = null;
        short[] sArr6 = null;
        View view = null;
        int i20 = 0;
        int i21 = 0;
        int iM11309 = 0;
        char c = 0;
        TextView textView8 = null;
        C8416 c8419 = null;
        List list8 = null;
        String strM10571 = null;
        List listM31136 = null;
        List list9 = null;
        CharSequence charSequence2 = null;
        int i22 = 0;
        int i23 = 0;
        View viewM8167 = null;
        String strM6288 = null;
        short[] sArr7 = null;
        int i24 = 0;
        String strM8240 = null;
        final List listM31137 = null;
        int i25 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 10477) >> 31));
            switch (i15) {
                case -2108789284:
                case -777278768:
                    sArr = sArr6;
                    str2 = strM6288;
                    String str9 = str8;
                    list = list8;
                    textView = textView7;
                    list2 = list9;
                    abstractActivityC12483 = abstractActivityC12488;
                    c8416 = c8419;
                    c14015 = c14018;
                    textView2 = (TextView) viewM8167;
                    C0674.m3027(textView2);
                    str3 = str9;
                    C1461.m5083(textView2, C1875.m6105(f7453, 52, 16, i22));
                    if (C1875.f7103 >= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۛ֫") + i16) * (-45);
                        i7 = ((iM450211 ^ i17) * (-2661)) ^ (-35968770);
                        i8 = -252065531;
                    } else {
                        iM450211 = (C19806.m45029("᩻ۤ") ^ i16) * (-69);
                        i7 = ((iM450211 ^ i17) * 9427) ^ 836511343;
                        i8 = 1248499061;
                    }
                    int i26 = iM450211 ^ i8;
                    abstractActivityC12488 = abstractActivityC12483;
                    str8 = str3;
                    strM6288 = str2;
                    textView8 = textView2;
                    sArr6 = sArr;
                    i19 = i26;
                    i18 = i7;
                    c14018 = c14015;
                    c8419 = c8416;
                    list9 = list2;
                    textView7 = textView;
                    list8 = list;
                    break;
                case -2029350378:
                case -1947669641:
                    sArr4 = sArr6;
                    list4 = list8;
                    textView5 = textView7;
                    char[] cArr = new char[i20];
                    cArr[i24] = c;
                    List listM31138 = C12529.m31135(strM8240, cArr);
                    int iM450213 = C19806.m45029(C1668.m5577(f7453, 359, 3, i22));
                    if (C1025.f4800 >= 0) {
                        list9 = listM31138;
                        i21 = iM450213;
                        int iM113010 = (i16 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-55);
                        i18 = ((iM113010 ^ i17) * 22699) ^ 1867159095;
                        i14 = iM113010 ^ 1173567226;
                        textView7 = textView5;
                        list8 = list4;
                        short[] sArr8 = sArr4;
                        i19 = i14;
                        sArr6 = sArr8;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i16) * 65;
                        textView7 = textView5;
                        list8 = list4;
                        i21 = iM450213;
                        sArr6 = sArr4;
                        i19 = iM113011 ^ (-901365188);
                        i18 = ((iM113011 ^ i17) * 7453) ^ 597380912;
                        list9 = listM31138;
                    }
                    break;
                case -1961563060:
                case -413918506:
                    sArr6 = sArr6;
                    list8 = list8;
                    textView7 = textView7;
                    list9 = list9;
                    c8419 = c8419;
                    c14018 = c14018;
                    String str10 = str8;
                    abstractActivityC12488 = abstractActivityC12488;
                    textView8 = textView8;
                    strM6288 = strM6288;
                    str = str10;
                    short s = f7453[39];
                    int i27 = s + 1;
                    if ((i27 * i27) - ((s * 2) + 1) < 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i16;
                        i3 = ((iM11306 ^ i17) * (-1647)) ^ 1396054322;
                        i4 = 1830751854;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۫") ^ i17;
                        i3 = ((iM11306 ^ i16) * (-28463)) ^ (-1226285679);
                        i4 = 1891904003;
                    }
                    i6 = iM11306 ^ i4;
                    i18 = i3;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr9 = sArr6;
                    i19 = i6;
                    sArr6 = sArr9;
                    String str11 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str11;
                    break;
                case -1921124735:
                case 1205345819:
                    TextView textView9 = (TextView) C3743.m10957(view, ThreadFactoryC3888.m11306(RunnableC3388.m10056(sArr6, 377, 3, i22)) ^ 2119761312);
                    C0674.m3027(textView9);
                    C7105.m18993(textView9, new View.OnClickListener() { // from class: l.֨ᩳ᩺

                        /* JADX INFO: renamed from: ܰۙ᩶, reason: not valid java name and contains not printable characters */
                        private static final short[] f5541 = {4696, 25260, 25264, 25264, 25268, 25271, 25342, 25323, 25323, 25271, 25260, 25259, 25268, 25322, 25257, 25264, 25322, 25255, 25255, 25323};

                        /* JADX WARN: Code duplicated, block: B:56:0x01cc A[PHI: r2 r6 r16
                          0x01cc: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:55:0x01ca, B:43:0x014d, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
                          0x01cc: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:55:0x01ca, B:43:0x014d, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
                          0x01cc: PHI (r16v13 l.۫ܶۘ) = (r16v5 l.۫ܶۘ), (r16v7 l.۫ܶۘ), (r16v16 l.۫ܶۘ) binds: [B:55:0x01ca, B:43:0x014d, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:69:0x0262 A[PHI: r1 r16
                          0x0262: PHI (r1v4 short[]) = (r1v2 short[]), (r1v3 short[]), (r1v2 short[]) binds: [B:68:0x0260, B:59:0x0201, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
                          0x0262: PHI (r16v19 l.۫ܶۘ) = (r16v3 l.۫ܶۘ), (r16v4 l.۫ܶۘ), (r16v20 l.۫ܶۘ) binds: [B:68:0x0260, B:59:0x0201, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
                        
                            if (l.RunnableC3388.f12514 < 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
                        
                            if (l.C0797.f3386 == false) goto L9;
                         */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r19) {
                            /*
                                Method dump skipped, instruction units count: 804
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1292.onClick(android.view.View):void");
                        }
                    });
                    C2332.m7086(view, view);
                    list8 = list8;
                    textView7 = textView7;
                    sArr6 = sArr6;
                    list9 = list9;
                    c8419 = c8419;
                    c14018 = c14018;
                    String str12 = str8;
                    abstractActivityC12488 = abstractActivityC12488;
                    textView8 = textView8;
                    strM6288 = strM6288;
                    str = str12;
                    iM11306 = ThreadFactoryC3888.m11306("ۚ۟") ^ i17;
                    i3 = ((iM11306 ^ i16) * (-11099)) ^ (-1077093504);
                    i4 = -1294656095;
                    i6 = iM11306 ^ i4;
                    i18 = i3;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr10 = sArr6;
                    i19 = i6;
                    sArr6 = sArr10;
                    String str13 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str13;
                    break;
                case -1919941068:
                case -382545064:
                    sArr4 = sArr6;
                    str7 = str8;
                    list4 = list8;
                    textView5 = textView7;
                    list5 = list9;
                    abstractActivityC12486 = abstractActivityC12488;
                    c8418 = c8419;
                    c14018 = c14018;
                    char[] cArr2 = new char[i20];
                    cArr2[i24] = c;
                    listM31136 = C12529.m31135(strM10571, cArr2);
                    String strM22055 = c8418.m22055(C2124.m6685(f7453, 180, 7, i22), str7);
                    if (strM22055 == null) {
                        iM11307 = ThreadFactoryC3888.m11306("۠ܰ") ^ i17;
                        i11 = ((iM11307 ^ i16) * (-12027)) ^ (-1014996649);
                        i12 = 1113971676;
                    } else {
                        strM2308 = strM22055;
                        iM11307 = (C19806.m45029("ۢۡ") + i17) * (-73);
                        i11 = ((iM11307 ^ i16) * (-32095)) ^ 294378331;
                        i12 = 550358168;
                    }
                    i14 = iM11307 ^ i12;
                    abstractActivityC12488 = abstractActivityC12486;
                    str8 = str7;
                    i18 = i11;
                    c14018 = c14018;
                    c8419 = c8418;
                    list9 = list5;
                    textView7 = textView5;
                    list8 = list4;
                    short[] sArr11 = sArr4;
                    i19 = i14;
                    sArr6 = sArr11;
                    break;
                case -1917638017:
                case -1078159622:
                    sArr5 = sArr6;
                    list6 = list9;
                    list7 = list8;
                    textView6 = (TextView) C2642.m8167(view, i21 ^ 2130467396);
                    C0674.m3027(textView6);
                    charSequence2 = (CharSequence) RunnableC1606.m5478(list7, i24);
                    if (RunnableC0195.f1321 >= 0) {
                        int iM450214 = (i17 - C19806.m45029("ۙۙ")) * (-117);
                        list8 = list7;
                        TextView textView10 = textView6;
                        i18 = ((iM450214 ^ i16) * 21799) ^ 300004473;
                        sArr6 = sArr5;
                        i19 = iM450214 ^ (-1841857243);
                        list9 = list6;
                        textView7 = textView10;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ۧ۫") ^ i17;
                        int i28 = ((iM113012 ^ i16) * 30305) ^ (-2097566576);
                        list8 = list7;
                        i19 = iM113012 ^ 1295710240;
                        sArr6 = sArr5;
                        textView7 = textView6;
                        i18 = i28;
                        list9 = list6;
                    }
                    break;
                case -1861128254:
                case 752170843:
                    C3722.m10890(view, i24);
                    AbstractC0464.m2301(view, 0.0f);
                    break;
                case -1851434504:
                case 918316983:
                    sArr3 = sArr6;
                    str5 = str8;
                    textView4 = textView7;
                    list3 = list9;
                    abstractActivityC12485 = abstractActivityC12488;
                    c8417 = c8419;
                    c14017 = c14018;
                    char[] cArr3 = new char[1];
                    c = '|';
                    cArr3[i24] = '|';
                    str6 = strM6288;
                    listM31135 = C12529.m31135(str6, cArr3);
                    String strM22056 = c8417.m22055(C1668.m5577(f7453, 92, 7, i22), str5);
                    if (strM22056 == null) {
                        int iM450215 = (C19806.m45029("۟᩵") ^ i16) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM450215 ^ i17) * (-16275)) ^ 841118602;
                        i10 = iM450215 ^ (-261063427);
                        strM6288 = str6;
                        c14018 = c14017;
                        i20 = 1;
                    } else {
                        strM10571 = strM22056;
                        i20 = 1;
                        int iM450216 = (C19806.m45029("ۖۧ") + i17) * (-49);
                        i9 = ((iM450216 ^ i16) * (-13829)) ^ (-1071556551);
                        i10 = iM450216 ^ 680856360;
                        strM6288 = str6;
                        c14018 = c14017;
                    }
                    c8419 = c8417;
                    list9 = list3;
                    textView7 = textView4;
                    list8 = listM31135;
                    short[] sArr12 = sArr3;
                    i19 = i10;
                    sArr6 = sArr12;
                    abstractActivityC12487 = abstractActivityC12485;
                    str8 = str5;
                    i18 = i9;
                    abstractActivityC12488 = abstractActivityC12487;
                    break;
                case -1622789029:
                case -1532518215:
                    charSequence = charSequence2;
                    TextView textView11 = (TextView) C3743.m10957(view, i25);
                    C0674.m3027(textView11);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView11, (CharSequence) C2477.m7592(listM31136, i24));
                    C7105.m18993(textView11, new ViewOnClickListenerC11877(c14018, abstractActivityC12488, listM31136));
                    iM11309 = ThreadFactoryC3888.m11306(C0526.m2424(f7453, 365, 3, i22));
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("ۚ۫") ^ i16;
                        i = ((iM45029 ^ i17) * 1927) ^ 92216520;
                        i2 = 2083366918;
                        int i29 = iM45029 ^ i2;
                        charSequence2 = charSequence;
                        i19 = i29;
                        i18 = i;
                    } else {
                        charSequence2 = charSequence;
                        list9 = list9;
                        c8419 = c8419;
                        c14018 = c14018;
                        String str14 = str8;
                        abstractActivityC12488 = abstractActivityC12488;
                        textView8 = textView8;
                        strM6288 = strM6288;
                        str = str14;
                        iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                        i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                        i5 = 1485199948;
                        i6 = iM450210 ^ i5;
                        c14018 = c14018;
                        c8419 = c8419;
                        list9 = list9;
                        textView7 = textView7;
                        list8 = list8;
                        short[] sArr13 = sArr6;
                        i19 = i6;
                        sArr6 = sArr13;
                        String str15 = strM6288;
                        textView8 = textView8;
                        abstractActivityC12488 = abstractActivityC12488;
                        str8 = str;
                        strM6288 = str15;
                    }
                    break;
                case -1587166779:
                case 1190759298:
                    AbstractC0464.m2313();
                    break;
                case -1579340966:
                case 817626009:
                    C2249.m6915();
                    list9 = list9;
                    c8419 = c8419;
                    c14018 = c14018;
                    String str16 = str8;
                    abstractActivityC12488 = abstractActivityC12488;
                    textView8 = textView8;
                    strM6288 = strM6288;
                    str = str16;
                    iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                    i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                    i5 = 1485199948;
                    i6 = iM450210 ^ i5;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr14 = sArr6;
                    i19 = i6;
                    sArr6 = sArr14;
                    String str17 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str17;
                    break;
                case -1538265372:
                case 240123692:
                    C1025.m3861();
                    if (CallableC1627.m5507() != 0) {
                        sArr = sArr6;
                        textView2 = textView8;
                        str2 = strM6288;
                        str3 = str8;
                        list = list8;
                        textView = textView7;
                        list2 = list9;
                        abstractActivityC12483 = abstractActivityC12488;
                        c8416 = c8419;
                        c14015 = c14018;
                        iM450211 = (ThreadFactoryC3888.m11306("ۛ֫") + i16) * (-45);
                        i7 = ((iM450211 ^ i17) * (-2661)) ^ (-35968770);
                        i8 = -252065531;
                        int i210 = iM450211 ^ i8;
                        abstractActivityC12488 = abstractActivityC12483;
                        str8 = str3;
                        strM6288 = str2;
                        textView8 = textView2;
                        sArr6 = sArr;
                        i19 = i210;
                        i18 = i7;
                        c14018 = c14015;
                        c8419 = c8416;
                        list9 = list2;
                        textView7 = textView;
                        list8 = list;
                    } else {
                        sArr4 = sArr6;
                        list4 = list8;
                        textView5 = textView7;
                        int iM113013 = (i16 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-55);
                        i18 = ((iM113013 ^ i17) * 22699) ^ 1867159095;
                        i14 = iM113013 ^ 1173567226;
                        textView7 = textView5;
                        list8 = list4;
                        short[] sArr15 = sArr4;
                        i19 = i14;
                        sArr6 = sArr15;
                    }
                    break;
                case -1437739181:
                case -94029314:
                    str = str8;
                    i22 = 55261;
                    iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i16;
                    i3 = ((iM11306 ^ i17) * (-11879)) ^ 164210690;
                    i4 = -1670596694;
                    i6 = iM11306 ^ i4;
                    i18 = i3;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr16 = sArr6;
                    i19 = i6;
                    sArr6 = sArr16;
                    String str18 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str18;
                    break;
                case -1345862504:
                case 508681968:
                    C1419.m4973();
                    if (!C0962.f3784) {
                        sArr4 = sArr6;
                        list4 = list8;
                        textView5 = textView7;
                        int iM113014 = (i16 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-55);
                        i18 = ((iM113014 ^ i17) * 22699) ^ 1867159095;
                        i14 = iM113014 ^ 1173567226;
                        textView7 = textView5;
                        list8 = list4;
                        short[] sArr17 = sArr4;
                        i19 = i14;
                        sArr6 = sArr17;
                    } else {
                        sArr5 = sArr6;
                        list7 = list8;
                        textView6 = textView7;
                        list6 = list9;
                        int iM450217 = (i17 - C19806.m45029("ۙۙ")) * (-117);
                        list8 = list7;
                        TextView textView12 = textView6;
                        i18 = ((iM450217 ^ i16) * 21799) ^ 300004473;
                        sArr6 = sArr5;
                        i19 = iM450217 ^ (-1841857243);
                        list9 = list6;
                        textView7 = textView12;
                    }
                    break;
                case -1277373489:
                case 1539495024:
                    if (!C3286.f12186) {
                        list9 = list9;
                        c8419 = c8419;
                        c14018 = c14018;
                        String str19 = str8;
                        abstractActivityC12488 = abstractActivityC12488;
                        textView8 = textView8;
                        strM6288 = strM6288;
                        str = str19;
                        iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                        i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                        i5 = 1485199948;
                        i6 = iM450210 ^ i5;
                        c14018 = c14018;
                        c8419 = c8419;
                        list9 = list9;
                        textView7 = textView7;
                        list8 = list8;
                        short[] sArr18 = sArr6;
                        i19 = i6;
                        sArr6 = sArr18;
                        String str110 = strM6288;
                        textView8 = textView8;
                        abstractActivityC12488 = abstractActivityC12488;
                        str8 = str;
                        strM6288 = str110;
                    } else {
                        sArr4 = sArr6;
                        list4 = list8;
                        textView5 = textView7;
                        int iM113015 = (i16 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-55);
                        i18 = ((iM113015 ^ i17) * 22699) ^ 1867159095;
                        i14 = iM113015 ^ 1173567226;
                        textView7 = textView5;
                        list8 = list4;
                        short[] sArr19 = sArr4;
                        i19 = i14;
                        sArr6 = sArr19;
                    }
                    break;
                case -1258078313:
                case -346579000:
                    charSequence = charSequence2;
                    TextView textView13 = (TextView) C2642.m8167(view, iM11309 ^ 2097640549);
                    C0674.m3027(textView13);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView13, (CharSequence) C2477.m7592(listM31137, i24));
                    C7105.m18993(textView13, new View.OnClickListener(c14018, abstractActivityC12488, listM31137) { // from class: l.ۖᩳ᩺

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ AbstractActivityC12483 f10406;

                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ List f10407;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractActivityC12483 abstractActivityC12489 = null;
                            int i30 = -1925853571;
                            int i31 = C3577.f13150;
                            int i32 = C1460.f5948;
                            int iM113016 = (ThreadFactoryC3888.m11306("۬᩷") ^ i32) * (-125);
                            int i33 = ((iM113016 ^ i31) * (-28417)) ^ (-43867670);
                            int i34 = -1195908693;
                            while (true) {
                                i30 = ((((i30 ^ i31) * (-13741)) >> 31) & i33) ^ (iM113016 ^ i34);
                                switch (i30) {
                                    case -2129507013:
                                    case -188277856:
                                        if (C2477.f9839 <= 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("ܳ۫") + i31) * 57;
                                            i33 = ((iM113016 ^ i32) * 28119) ^ 1253567600;
                                            i34 = -1923570972;
                                        } else {
                                            iM113016 = C19806.m45029("۟֫") ^ i32;
                                            i33 = ((iM113016 ^ i31) * 12551) ^ (-34824583);
                                            i34 = -1017361394;
                                        }
                                        break;
                                    case -2042044610:
                                    case 1339886807:
                                        abstractActivityC12489 = this.f10406;
                                        if (C3577.f13150 >= 0) {
                                            iM113016 = C19806.m45029("ܽۡ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-11561)) ^ 1807741160;
                                            i34 = 253800097;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("ۡ֡") ^ i32;
                                            i33 = ((iM113016 ^ i31) * 26601) ^ (-237877701);
                                            i34 = 453500821;
                                        }
                                        break;
                                    case -1864783243:
                                    case -15630141:
                                        C14015.m33887(abstractActivityC12489, this.f10407);
                                        break;
                                    case -1519303594:
                                    case 417393943:
                                        if (C2124.f7782 <= 0) {
                                            iM113016 = C19806.m45029("ܽۡ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-11561)) ^ 1807741160;
                                            i34 = 253800097;
                                        } else {
                                            iM113016 = (ThreadFactoryC3888.m11306("ۨܿ") + i32) * (-77);
                                            i33 = ((iM113016 ^ i31) * 20929) ^ 1741902394;
                                            i34 = 769800865;
                                        }
                                        break;
                                    case -1432205940:
                                    case -348730285:
                                        if (C1875.f7103 >= 0) {
                                            iM113016 = C19806.m45029("۟֡") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-10069)) ^ (-914104208);
                                            i34 = -420206950;
                                        } else {
                                            iM113016 = (C19806.m45029("ܶ᩻") + i32) * 49;
                                            i33 = ((iM113016 ^ i31) * (-28071)) ^ (-650495445);
                                            i34 = -1526932910;
                                        }
                                        break;
                                    case -1304541038:
                                    case 659165972:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM113016 = C19806.m45029("۟֡") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-10069)) ^ (-914104208);
                                            i34 = -420206950;
                                        } else {
                                            iM113016 = C19806.m45029("ۚܺ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * (-809)) ^ (-693946202);
                                            i34 = -403278331;
                                        }
                                        break;
                                    case -1263997037:
                                    case 48396686:
                                        C0817.m3399();
                                        iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                        i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                        i34 = -1334939098;
                                        break;
                                    case -1240760669:
                                    case 2101080054:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113016 = C19806.m45029("ܽۡ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-11561)) ^ 1807741160;
                                            i34 = 253800097;
                                        } else {
                                            iM113016 = (i32 - C19806.m45029("ۢ֡")) * 39;
                                            i33 = ((iM113016 ^ i31) * 21397) ^ 62784999;
                                            i34 = 1866797745;
                                        }
                                        break;
                                    case -1171518931:
                                    case -804777136:
                                        if (C1460.f5948 >= 0) {
                                            iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                            i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                            i34 = -1334939098;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("֡ۧ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 7451) ^ (-192399048);
                                            i34 = 478488587;
                                        }
                                        break;
                                    case -1094329796:
                                    case 312538360:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113016 = (i32 - ThreadFactoryC3888.m11306("ۨ֫")) * 39;
                                            i33 = ((iM113016 ^ i31) * 22901) ^ (-1970978289);
                                            i34 = -1481897710;
                                        } else {
                                            iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                            i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                            i34 = -1334939098;
                                        }
                                        break;
                                    case -626522518:
                                    case 209954969:
                                        if (C1937.f7317 < 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("ܳ۫") + i31) * 57;
                                            i33 = ((iM113016 ^ i32) * 28119) ^ 1253567600;
                                            i34 = -1923570972;
                                        } else {
                                            iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                            i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                            i34 = -1334939098;
                                        }
                                        break;
                                    case -499525142:
                                    case 431955484:
                                        if (C0526.m2437() >= 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("ܳ۫") + i31) * 57;
                                            i33 = ((iM113016 ^ i32) * 28119) ^ 1253567600;
                                            i34 = -1923570972;
                                        } else {
                                            iM113016 = (C19806.m45029("ܰܳ") ^ i31) * 87;
                                            i33 = ((iM113016 ^ i32) * 7035) ^ (-1821186394);
                                            i34 = -1992154168;
                                        }
                                        break;
                                    case -88187593:
                                    case 320502420:
                                        if (C2642.f10294 <= 0) {
                                            iM113016 = C19806.m45029("۟֡") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-10069)) ^ (-914104208);
                                            i34 = -420206950;
                                        } else {
                                            iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                            i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                            i34 = -1334939098;
                                        }
                                        break;
                                    case 118895560:
                                    case 1226117046:
                                        if (C2704.f10408) {
                                            iM113016 = (C19806.m45029("᩶ܿ") + i31) * 75;
                                            i33 = ((iM113016 ^ i32) * (-31527)) ^ 1536240251;
                                            i34 = 1204097825;
                                        } else {
                                            iM113016 = (i31 - C19806.m45029("ۘۘ")) * 67;
                                            i33 = ((iM113016 ^ i32) * (-4265)) ^ 555991446;
                                            i34 = -1334939098;
                                        }
                                        break;
                                    case 812459536:
                                    case 856783007:
                                        C0817.m3399();
                                        C0526.m2437();
                                        break;
                                    default:
                                        if (C1668.f6641 >= 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("ܳ۫") + i31) * 57;
                                            i33 = ((iM113016 ^ i32) * 28119) ^ 1253567600;
                                            i34 = -1923570972;
                                        } else {
                                            iM113016 = (i31 - C19806.m45029("۟ۗ")) * (-59);
                                            i33 = ((iM113016 ^ i32) * (-421)) ^ 1465624208;
                                            i34 = -738841444;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i30 = 928075530;
                            int i31 = C0629.f2722;
                            int i32 = C1461.f5957;
                            int iM113016 = (ThreadFactoryC3888.m11306("ۛܶ") + i32) * (-65);
                            int i33 = ((iM113016 ^ i31) * 1087) ^ 1862046798;
                            int i34 = 952249225;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 14599) >> 31) & i33) ^ (iM113016 ^ i34);
                                switch (i30) {
                                    case -2086535604:
                                    case 984623216:
                                        if (C2249.f8050 >= 0) {
                                            iM113016 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 18723) ^ (-1407709219);
                                            i34 = 1892793951;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("֫۫") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-23643)) ^ 932288251;
                                            i34 = 215200170;
                                        }
                                        break;
                                    case -1916023760:
                                    case 11256127:
                                        if (C2249.f8050 >= 0) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = (C19806.m45029("᩶ۤ") ^ i32) * (-67);
                                            i33 = ((iM113016 ^ i31) * (-1525)) ^ (-85412715);
                                            i34 = -995651929;
                                        }
                                        break;
                                    case -1577385732:
                                    case 1377535120:
                                        if (C2249.f8050 >= 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("᩷ܶ") + i31) * 115;
                                            i33 = ((iM113016 ^ i32) * 24303) ^ 1492756457;
                                            i34 = -1427626267;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("ۡ۟") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-8725)) ^ (-1896738406);
                                            i34 = -1313286027;
                                        }
                                        break;
                                    case -1324763941:
                                    case 86421106:
                                        this.f10407 = listM31137;
                                        return;
                                    case -1227774805:
                                    case 1798701439:
                                        this.f10406 = abstractActivityC12488;
                                        if (C1977.f7413 <= 0) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = C19806.m45029("ܿۖ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 22609) ^ 986165125;
                                            i34 = -575987441;
                                        }
                                        break;
                                    case -979298775:
                                    case -826009924:
                                        if (C19806.f63586) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("᩸۠") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-24451)) ^ 504400988;
                                            i34 = 1364991242;
                                        }
                                        break;
                                    case -619480005:
                                    case -71863235:
                                        C1025.m3861();
                                        if (!RunnableC1895.f7152) {
                                            iM113016 = (ThreadFactoryC3888.m11306("᩷ܶ") + i31) * 115;
                                            i33 = ((iM113016 ^ i32) * 24303) ^ 1492756457;
                                            i34 = -1427626267;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 18723) ^ (-1407709219);
                                            i34 = 1892793951;
                                        }
                                        break;
                                    case -458394930:
                                    case 154803137:
                                        if (C1460.f5948 >= 0) {
                                            iM113016 = ThreadFactoryC3888.m11306("ۚۤ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 21083) ^ (-782261255);
                                            i34 = -931366987;
                                        } else {
                                            iM113016 = C19806.m45029("᩻ܶ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * (-18557)) ^ 1789481496;
                                            i34 = 1098344527;
                                        }
                                        break;
                                    case -420537004:
                                    case 434882494:
                                        if (C1977.f7413 <= 0) {
                                            iM113016 = ThreadFactoryC3888.m11306("ۚۤ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 21083) ^ (-782261255);
                                            i34 = -931366987;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("ۖ֫") ^ i31;
                                            i33 = ((iM113016 ^ i32) * (-3961)) ^ 1530777911;
                                            i34 = 373925667;
                                        }
                                        break;
                                    case -371377720:
                                    case 448329537:
                                        if (C1461.f5957 <= 0) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = (C19806.m45029("ۤۘ") + i31) * (-67);
                                            i33 = ((iM113016 ^ i32) * 16085) ^ (-1517163541);
                                            i34 = -751664600;
                                        }
                                        break;
                                    case -332586688:
                                    case 384980950:
                                        RunnableC1895.m6170();
                                        if (C0278.f1572 <= 0) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * 18723) ^ (-1407709219);
                                            i34 = 1892793951;
                                        }
                                        break;
                                    case -306699317:
                                    case 1673435103:
                                        C19806.m45024();
                                        throw new RuntimeException();
                                    case -109940719:
                                    case 1421228713:
                                        if (C3577.f13150 >= 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("᩷ܶ") + i31) * 115;
                                            i33 = ((iM113016 ^ i32) * 24303) ^ 1492756457;
                                            i34 = -1427626267;
                                        } else {
                                            iM113016 = C19806.m45029("ᩴܺ") ^ i31;
                                            i33 = ((iM113016 ^ i32) * (-17715)) ^ 705331273;
                                            i34 = 232285148;
                                        }
                                        break;
                                    case 373733020:
                                    case 759319539:
                                        C3743.m10966();
                                        if (C1148.m4232() > 0) {
                                            iM113016 = C19806.m45029("᩶ܰ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * (-16431)) ^ (-1227897963);
                                            i34 = -2049898611;
                                        } else {
                                            iM113016 = C19806.m45029("ܰۡ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * 26341) ^ (-442475016);
                                            i34 = -1270285998;
                                        }
                                        break;
                                    case 515147870:
                                    case 1391295098:
                                        if (RunnableC1895.f7152) {
                                            iM113016 = ThreadFactoryC3888.m11306("ۤۜ") ^ i32;
                                            i33 = ((iM113016 ^ i31) * 14669) ^ 1516281948;
                                            i34 = 1489903844;
                                        } else {
                                            iM113016 = (ThreadFactoryC3888.m11306("᩷ܶ") + i31) * 115;
                                            i33 = ((iM113016 ^ i32) * 24303) ^ 1492756457;
                                            i34 = -1427626267;
                                        }
                                        break;
                                    default:
                                        C1066.m4023();
                                        C0962.m3746();
                                        iM113016 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i31;
                                        i33 = ((iM113016 ^ i32) * 18723) ^ (-1407709219);
                                        i34 = 1892793951;
                                        break;
                                }
                            }
                        }
                    });
                    sArr7 = f7453;
                    i23 = 368;
                    if (C2704.m8255() <= 0) {
                        iM45029 = C19806.m45029("᩻ۙ") ^ i16;
                        i = ((iM45029 ^ i17) * 9217) ^ 1168993064;
                        i2 = -1689334919;
                    } else {
                        iM45029 = C19806.m45029("ۗܽ") ^ i16;
                        i = ((iM45029 ^ i17) * (-15175)) ^ 191296480;
                        i2 = 1922927922;
                    }
                    int i211 = iM45029 ^ i2;
                    charSequence2 = charSequence;
                    i19 = i211;
                    i18 = i;
                    break;
                case -1219299187:
                case -289129052:
                    str = str8;
                    i22 = 12248;
                    iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i16;
                    i3 = ((iM11306 ^ i17) * (-11879)) ^ 164210690;
                    i4 = -1670596694;
                    i6 = iM11306 ^ i4;
                    i18 = i3;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr110 = sArr6;
                    i19 = i6;
                    sArr6 = sArr110;
                    String str111 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str111;
                    break;
                case -1173905324:
                case -597297613:
                    sArr4 = sArr6;
                    list4 = list8;
                    textView5 = textView7;
                    list5 = list9;
                    strM2308 = AbstractC0464.m2308(f7453, 278, 81, i22);
                    c8418 = c8419;
                    str7 = str8;
                    c14018 = c14018;
                    abstractActivityC12486 = abstractActivityC12488;
                    iM11307 = (C19806.m45029("ۢۡ") + i17) * (-73);
                    i11 = ((iM11307 ^ i16) * (-32095)) ^ 294378331;
                    i12 = 550358168;
                    i14 = iM11307 ^ i12;
                    abstractActivityC12488 = abstractActivityC12486;
                    str8 = str7;
                    i18 = i11;
                    c14018 = c14018;
                    c8419 = c8418;
                    list9 = list5;
                    textView7 = textView5;
                    list8 = list4;
                    short[] sArr111 = sArr4;
                    i19 = i14;
                    sArr6 = sArr111;
                    break;
                case -776892918:
                case 548619644:
                    sArr4 = sArr6;
                    list4 = list8;
                    textView5 = textView7;
                    list5 = list9;
                    char[] cArr4 = new char[i20];
                    cArr4[i24] = c;
                    listM31137 = C12529.m31135(strM2308, cArr4);
                    c8418 = c8419;
                    str7 = str8;
                    String strM22057 = c8418.m22055(C1461.m5070(f7453, 268, 10, i22), str7);
                    if (strM22057 == null) {
                        iM450212 = C19806.m45029("۫֨") ^ i17;
                        c14018 = c14018;
                        i11 = ((iM450212 ^ i16) * (-953)) ^ 1028618681;
                        i13 = -100136954;
                    } else {
                        strM8240 = strM22057;
                        iM450212 = (ThreadFactoryC3888.m11306("ᩳܽ") + i16) * 69;
                        i11 = ((iM450212 ^ i17) * 5765) ^ (-243251525);
                        i13 = 1376398139;
                    }
                    i14 = iM450212 ^ i13;
                    str8 = str7;
                    i18 = i11;
                    c14018 = c14018;
                    c8419 = c8418;
                    list9 = list5;
                    textView7 = textView5;
                    list8 = list4;
                    short[] sArr112 = sArr4;
                    i19 = i14;
                    sArr6 = sArr112;
                    break;
                case -751118981:
                case 2098248367:
                    TextView textView14 = textView7;
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView14, charSequence2);
                    C14015 c14019 = this.f7455;
                    AbstractActivityC12483 abstractActivityC12489 = this.f7454;
                    sArr5 = sArr6;
                    list7 = list8;
                    C1937.m6291(textView14, new ViewOnClickListenerC18059(c14019, abstractActivityC12489, list7));
                    list6 = list9;
                    int iM450218 = C19806.m45029(RunnableC1606.m5481(f7453, 362, 3, i22)) ^ 2128361303;
                    if (C10634.f36300 < 0) {
                        int iM113016 = (i17 - ThreadFactoryC3888.m11306("ۙ֨")) * (-37);
                        int i30 = ((iM113016 ^ i16) * 22377) ^ (-344748955);
                        list8 = list7;
                        sArr6 = sArr5;
                        i19 = iM113016 ^ (-1229276501);
                        list9 = list6;
                        textView7 = textView14;
                        abstractActivityC12487 = abstractActivityC12489;
                        i25 = iM450218;
                        i18 = i30;
                        c14018 = c14019;
                        abstractActivityC12488 = abstractActivityC12487;
                    } else {
                        c14018 = c14019;
                        abstractActivityC12488 = abstractActivityC12489;
                        i25 = iM450218;
                        textView6 = textView14;
                        int iM450219 = (i17 - C19806.m45029("ۙۙ")) * (-117);
                        list8 = list7;
                        TextView textView15 = textView6;
                        i18 = ((iM450219 ^ i16) * 21799) ^ 300004473;
                        sArr6 = sArr5;
                        i19 = iM450219 ^ (-1841857243);
                        list9 = list6;
                        textView7 = textView15;
                    }
                    break;
                case -437798165:
                case -38256963:
                    charSequence = charSequence2;
                    TextView textView16 = (TextView) C3743.m10957(view, ThreadFactoryC3888.m11306(C1461.m5070(sArr7, i23, 3, i22)) ^ 2103144308);
                    C0674.m3027(textView16);
                    C1461.m5083(textView16, (CharSequence) RunnableC1606.m5478(list9, i24));
                    C7105.m18993(textView16, new ViewOnClickListenerC5526(c14018, abstractActivityC12488, list9));
                    if (C1977.f7413 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") ^ i17) * (-105);
                        i = ((iM45029 ^ i16) * (-20469)) ^ (-1950063523);
                        i2 = -1025213612;
                        int i212 = iM45029 ^ i2;
                        charSequence2 = charSequence;
                        i19 = i212;
                        i18 = i;
                    } else {
                        list = list8;
                        charSequence2 = charSequence;
                        textView = textView7;
                        sArr = sArr6;
                        list2 = list9;
                        textView2 = textView8;
                        str2 = strM6288;
                        c8416 = c8419;
                        str3 = str8;
                        c14015 = c14018;
                        abstractActivityC12483 = abstractActivityC12488;
                        iM450211 = (ThreadFactoryC3888.m11306("ۛ֫") + i16) * (-45);
                        i7 = ((iM450211 ^ i17) * (-2661)) ^ (-35968770);
                        i8 = -252065531;
                        int i213 = iM450211 ^ i8;
                        abstractActivityC12488 = abstractActivityC12483;
                        str8 = str3;
                        strM6288 = str2;
                        textView8 = textView2;
                        sArr6 = sArr;
                        i19 = i213;
                        i18 = i7;
                        c14018 = c14015;
                        c8419 = c8416;
                        list9 = list2;
                        textView7 = textView;
                        list8 = list;
                    }
                    break;
                case -280887306:
                case 1678255524:
                    strM8240 = C2704.m8240(f7453, 380, 40, i22);
                    str7 = str8;
                    list4 = list8;
                    charSequence2 = charSequence2;
                    textView5 = textView7;
                    sArr4 = sArr6;
                    list5 = list9;
                    c8418 = c8419;
                    iM450212 = (ThreadFactoryC3888.m11306("ᩳܽ") + i16) * 69;
                    i11 = ((iM450212 ^ i17) * 5765) ^ (-243251525);
                    i13 = 1376398139;
                    i14 = iM450212 ^ i13;
                    str8 = str7;
                    i18 = i11;
                    c14018 = c14018;
                    c8419 = c8418;
                    list9 = list5;
                    textView7 = textView5;
                    list8 = list4;
                    short[] sArr113 = sArr4;
                    i19 = i14;
                    sArr6 = sArr113;
                    break;
                case -217709840:
                case 19504932:
                    charSequence = charSequence2;
                    TextView textView17 = (TextView) C2642.m8167(view, ThreadFactoryC3888.m11306(C1377.m4832(f7453, 371, 3, i22)) ^ 2118710926);
                    C0674.m3027(textView17);
                    C1937.m6291(textView17, new ViewOnClickListenerC22460(i24, abstractActivityC12488));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۙ") ^ i17;
                        i = ((iM45029 ^ i16) * (-29725)) ^ 458980891;
                        i2 = -898455142;
                        int i214 = iM45029 ^ i2;
                        charSequence2 = charSequence;
                        i19 = i214;
                        i18 = i;
                    } else {
                        charSequence2 = charSequence;
                        list9 = list9;
                        c8419 = c8419;
                        c14018 = c14018;
                        String str112 = str8;
                        abstractActivityC12488 = abstractActivityC12488;
                        textView8 = textView8;
                        strM6288 = strM6288;
                        str = str112;
                        iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                        i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                        i5 = 1485199948;
                        i6 = iM450210 ^ i5;
                        c14018 = c14018;
                        c8419 = c8419;
                        list9 = list9;
                        textView7 = textView7;
                        list8 = list8;
                        short[] sArr114 = sArr6;
                        i19 = i6;
                        sArr6 = sArr114;
                        String str113 = strM6288;
                        textView8 = textView8;
                        abstractActivityC12488 = abstractActivityC12488;
                        str8 = str;
                        strM6288 = str113;
                    }
                    break;
                case -173598018:
                case 1114006184:
                    sArr6 = sArr6;
                    list8 = list8;
                    textView7 = textView7;
                    list9 = list9;
                    c8419 = c8419;
                    c14018 = c14018;
                    String str20 = str8;
                    abstractActivityC12488 = abstractActivityC12488;
                    textView8 = textView8;
                    strM6288 = strM6288;
                    str = str20;
                    viewM8167 = C2642.m8167(view, C19806.m45029(C7105.m18989(f7453, 49, 3, i22)) ^ 2128348834);
                    if (C0526.f2219) {
                        iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                        i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                        i5 = 1485199948;
                    } else {
                        iM450210 = C19806.m45029("۟ܿ") ^ i16;
                        i18 = ((iM450210 ^ i17) * 13127) ^ 1182009004;
                        i5 = 355753219;
                    }
                    i6 = iM450210 ^ i5;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr115 = sArr6;
                    i19 = i6;
                    sArr6 = sArr115;
                    String str114 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str114;
                    break;
                case 35628410:
                case 1416791287:
                    charSequence = charSequence2;
                    TextView textView18 = (TextView) C2642.m8167(view, ThreadFactoryC3888.m11306(C1066.m4040(f7453, 374, 3, i22)) ^ 2123597904);
                    C0674.m3027(textView18);
                    C7105.m18993(textView18, new ViewOnClickListenerC1898(abstractActivityC12488, i20));
                    sArr6 = f7453;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("᩻ۙ") ^ i16;
                        i = ((iM45029 ^ i17) * 9217) ^ 1168993064;
                        i2 = -1689334919;
                    } else {
                        iM45029 = C19806.m45029("֨۟") ^ i16;
                        i = ((iM45029 ^ i17) * (-7695)) ^ (-614027459);
                        i2 = -794671949;
                    }
                    int i215 = iM45029 ^ i2;
                    charSequence2 = charSequence;
                    i19 = i215;
                    i18 = i;
                    break;
                case 204938328:
                case 1534929390:
                    if (!C2704.f10408) {
                        list9 = list9;
                        c8419 = c8419;
                        c14018 = c14018;
                        String str115 = str8;
                        abstractActivityC12488 = abstractActivityC12488;
                        textView8 = textView8;
                        strM6288 = strM6288;
                        str = str115;
                        iM450210 = (C19806.m45029("ۗ֫") ^ i16) * 27;
                        i18 = ((iM450210 ^ i17) * (-24857)) ^ 1209032957;
                        i5 = 1485199948;
                        i6 = iM450210 ^ i5;
                        c14018 = c14018;
                        c8419 = c8419;
                        list9 = list9;
                        textView7 = textView7;
                        list8 = list8;
                        short[] sArr116 = sArr6;
                        i19 = i6;
                        sArr6 = sArr116;
                        String str116 = strM6288;
                        textView8 = textView8;
                        abstractActivityC12488 = abstractActivityC12488;
                        str8 = str;
                        strM6288 = str116;
                    } else {
                        int iM450220 = C19806.m45029("ۙ᩵") ^ i17;
                        i = ((iM450220 ^ i16) * (-19215)) ^ (-965929964);
                        i19 = iM450220 ^ (-1873813457);
                        i18 = i;
                    }
                    break;
                case 537181983:
                case 1715626151:
                    sArr2 = sArr6;
                    c14016 = c14018;
                    abstractActivityC12484 = abstractActivityC12488;
                    String str21 = strM6288;
                    list = list8;
                    textView = textView7;
                    list2 = list9;
                    textView3 = textView8;
                    C1937.m6291(textView3, new ViewOnClickListenerC19638());
                    c8416M22053 = C8416.m22053();
                    C7105.m18988(c8416M22053, C2704.m8240(f7453, 68, 17, i22));
                    String strM22058 = c8416M22053.m22055(ThreadFactoryC3888.m11312(f7453, 85, 7, i22), null);
                    if (strM22058 == null) {
                        int iM113017 = ThreadFactoryC3888.m11306("ۢۖ") ^ i16;
                        strM6288 = str21;
                        textView8 = textView3;
                        abstractActivityC12488 = abstractActivityC12484;
                        str8 = null;
                        list9 = list2;
                        textView7 = textView;
                        list8 = list;
                        c8419 = c8416M22053;
                        sArr6 = sArr2;
                        i19 = iM113017 ^ (-204870849);
                        i18 = ((iM113017 ^ i17) * (-463)) ^ (-680960228);
                        c14018 = c14016;
                    } else {
                        strM6288 = strM22058;
                        str4 = null;
                        int iM450221 = (C19806.m45029("᩵ܽ") + i17) * 95;
                        textView8 = textView3;
                        abstractActivityC12488 = abstractActivityC12484;
                        str8 = str4;
                        i18 = ((iM450221 ^ i16) * 3857) ^ 1443936265;
                        c14018 = c14016;
                        c8419 = c8416M22053;
                        sArr6 = sArr2;
                        i19 = iM450221 ^ (-1791973682);
                        list9 = list2;
                        textView7 = textView;
                        list8 = list;
                    }
                    break;
                case 658270248:
                case 1570230010:
                    sArr3 = sArr6;
                    str5 = str8;
                    listM31135 = list8;
                    textView4 = textView7;
                    list3 = list9;
                    c8417 = c8419;
                    c14017 = c14018;
                    abstractActivityC12485 = abstractActivityC12488;
                    strM10571 = C3577.m10571(f7453, 187, 81, i22);
                    str6 = strM6288;
                    int iM4502110 = (C19806.m45029("ۖۧ") + i17) * (-49);
                    i9 = ((iM4502110 ^ i16) * (-13829)) ^ (-1071556551);
                    i10 = iM4502110 ^ 680856360;
                    strM6288 = str6;
                    c14018 = c14017;
                    c8419 = c8417;
                    list9 = list3;
                    textView7 = textView4;
                    list8 = listM31135;
                    short[] sArr117 = sArr3;
                    i19 = i10;
                    sArr6 = sArr117;
                    abstractActivityC12487 = abstractActivityC12485;
                    str8 = str5;
                    i18 = i9;
                    abstractActivityC12488 = abstractActivityC12487;
                    break;
                case 1689508756:
                case 1764116572:
                    sArr2 = sArr6;
                    str4 = str8;
                    list = list8;
                    textView = textView7;
                    list2 = list9;
                    abstractActivityC12484 = abstractActivityC12488;
                    C8416 c84110 = c8419;
                    c14016 = c14018;
                    strM6288 = C1937.m6288(f7453, 99, 81, i22);
                    c8416M22053 = c84110;
                    textView3 = textView8;
                    int iM450222 = (C19806.m45029("᩵ܽ") + i17) * 95;
                    textView8 = textView3;
                    abstractActivityC12488 = abstractActivityC12484;
                    str8 = str4;
                    i18 = ((iM450222 ^ i16) * 3857) ^ 1443936265;
                    c14018 = c14016;
                    c8419 = c8416M22053;
                    sArr6 = sArr2;
                    i19 = iM450222 ^ (-1791973682);
                    list9 = list2;
                    textView7 = textView;
                    list8 = list;
                    break;
                default:
                    sArr6 = sArr6;
                    list8 = list8;
                    textView7 = textView7;
                    list9 = list9;
                    c8419 = c8419;
                    c14018 = c14018;
                    String str22 = str8;
                    abstractActivityC12488 = abstractActivityC12488;
                    textView8 = textView8;
                    strM6288 = strM6288;
                    str = str22;
                    C2704.m8238(animator, C1066.m4040(f7453, 40, 9, i22));
                    view = this.f7456;
                    i24 = 0;
                    if (view.getTag() == null) {
                        iM11306 = (C19806.m45029("ۗ۫") + i17) * (-115);
                        i3 = ((iM11306 ^ i16) * 29667) ^ 1708592142;
                        i4 = -258600663;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۟") ^ i17;
                        i3 = ((iM11306 ^ i16) * (-11099)) ^ (-1077093504);
                        i4 = -1294656095;
                    }
                    i6 = iM11306 ^ i4;
                    i18 = i3;
                    c14018 = c14018;
                    c8419 = c8419;
                    list9 = list9;
                    textView7 = textView7;
                    list8 = list8;
                    short[] sArr118 = sArr6;
                    i19 = i6;
                    sArr6 = sArr118;
                    String str117 = strM6288;
                    textView8 = textView8;
                    abstractActivityC12488 = abstractActivityC12488;
                    str8 = str;
                    strM6288 = str117;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0219 A[PHI: r3 r6 r17
      0x0219: PHI (r3v4 char) = (r3v3 char), (r3v2 char) binds: [B:58:0x0217, B:50:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:58:0x0217, B:50:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r17v12 java.lang.String) = (r17v10 java.lang.String), (r17v13 java.lang.String) binds: [B:58:0x0217, B:50:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x024e A[PHI: r7 r8 r17 r18
      0x024e: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:62:0x024c, B:46:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:62:0x024c, B:46:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r17v14 java.lang.String) = (r17v9 java.lang.String), (r17v15 java.lang.String) binds: [B:62:0x024c, B:46:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:62:0x024c, B:46:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0286 A[PHI: r4 r5 r9 r11 r12 r13 r17
      0x0286: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r12v8 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r13v8 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r17v28 java.lang.String) = 
      (r17v8 java.lang.String)
      (r17v11 java.lang.String)
      (r17v16 java.lang.String)
      (r17v19 java.lang.String)
      (r17v21 java.lang.String)
      (r17v33 java.lang.String)
     binds: [B:67:0x0284, B:54:0x01f5, B:42:0x018b, B:32:0x0104, B:28:0x00d7, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int iM11306;
        int i;
        int i2;
        String str;
        int iM11307;
        int i3;
        int i4;
        int i5 = C10634.f36300;
        int i6 = RunnableC1606.f6488;
        int iM11308 = ThreadFactoryC3888.m11306("ۨ۠") ^ i6;
        int i7 = ((iM11308 ^ i5) * (-26241)) ^ (-795591022);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM11308 ^ 1415304267;
        String strM10056 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1610435344;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * (-4745)) >> 31));
            switch (i16) {
                case -2145961413:
                case 1447010884:
                    if (C1398.f5802 <= 0) {
                        str = strM10056;
                        i15 = 9;
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                        String str2 = str;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        strM10056 = str2;
                    } else {
                        int iM45029 = (i6 - C19806.m45029("ۖ۠")) * 15;
                        i8 = iM45029 ^ (-1172217656);
                        i7 = ((iM45029 ^ i5) * 13695) ^ (-858205088);
                        i15 = 9;
                    }
                    break;
                case -2007039811:
                case -1212570598:
                    strM10056 = RunnableC3388.m10056(sArr2, i14, i15, i13);
                    if (C10634.f36300 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۚܶ") ^ i6;
                        str = strM10056;
                        i3 = ((iM11307 ^ i5) * (-4025)) ^ (-544843682);
                        i4 = -1358319437;
                        String str3 = str;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        strM10056 = str3;
                    } else {
                        int iM450210 = C19806.m45029("᩻ۜ") ^ i6;
                        i7 = ((iM450210 ^ i5) * (-28731)) ^ 1378371830;
                        i8 = iM450210 ^ 266950727;
                    }
                    break;
                case -1489415360:
                case -1400557706:
                    RunnableC1564.m5345();
                    RunnableC1895.m6170();
                    iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i5;
                    i = ((iM11306 ^ i6) * 17789) ^ (-1267342372);
                    i2 = -930109561;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1426049172:
                case 1571382122:
                    sArr2 = f7453;
                    if (C1937.f7317 >= 0) {
                        str = strM10056;
                        i14 = 5;
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                        String str4 = str;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        strM10056 = str4;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ۗ֫") ^ i5;
                        i8 = iM11309 ^ (-381974629);
                        i7 = ((iM11309 ^ i6) * 22327) ^ (-1291317250);
                        i14 = 5;
                    }
                    break;
                case -1173860439:
                case -909883748:
                    str = strM10056;
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) > 0) {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("ᩳ᩻")) * 53;
                        i3 = ((iM11307 ^ i5) * (-12141)) ^ 828127768;
                        i4 = 1447987638;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۧܺ") ^ i6) * 27;
                        i3 = ((iM11307 ^ i5) * (-26945)) ^ 283437770;
                        i4 = 1972128701;
                    }
                    String str5 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str5;
                    break;
                case -1172839732:
                case -1148395925:
                    str = strM10056;
                    if (C2642.m8171() != 0) {
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                    } else {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("ۨ۫")) * 57;
                        i3 = ((iM11307 ^ i5) * (-29401)) ^ 1952226362;
                        i4 = 1727416619;
                    }
                    String str6 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str6;
                    break;
                case -532826786:
                case -360716526:
                    C2704.m8238(animator, strM10056);
                    this.f7455.f46060 = true;
                    break;
                case -372306323:
                case 1115752111:
                    str = strM10056;
                    s = sArr[c];
                    s2 = 10556;
                    if (C1377.f5749) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܺۢ") + i6) * 57;
                        i3 = ((iM11307 ^ i5) * 19421) ^ 677117810;
                        i4 = 936871339;
                    } else {
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                    }
                    String str7 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str7;
                    break;
                case -246499706:
                case 638161375:
                    i13 = 8618;
                    iM11307 = C19806.m45029("ۧ۟") ^ i5;
                    str = strM10056;
                    i3 = ((iM11307 ^ i6) * (-32397)) ^ (-783169257);
                    i4 = -491961383;
                    String str8 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str8;
                    break;
                case -166164640:
                case 1042418292:
                    i13 = 23416;
                    iM11307 = C19806.m45029("ۧ۟") ^ i5;
                    str = strM10056;
                    i3 = ((iM11307 ^ i6) * (-32397)) ^ (-783169257);
                    i4 = -491961383;
                    String str9 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str9;
                    break;
                case -5167210:
                case 2877766:
                    str = strM10056;
                    sArr = f7453;
                    if (C3660.f13403 >= 0) {
                        strM10056 = str;
                        iM11307 = ThreadFactoryC3888.m11306("ۚܶ") ^ i6;
                        str = strM10056;
                        i3 = ((iM11307 ^ i5) * (-4025)) ^ (-544843682);
                        i4 = -1358319437;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i5) * 27;
                        i3 = ((iM11307 ^ i6) * 13645) ^ 1327533653;
                        i4 = 1364515143;
                    }
                    String str10 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str10;
                    break;
                case 144983686:
                case 1351989867:
                    str = strM10056;
                    i9 = s + s2;
                    if (C1937.f7317 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 349) ^ 690242659;
                        i4 = -886899576;
                    } else {
                        iM11307 = (C19806.m45029("ۙ֨") ^ i6) * 91;
                        i3 = ((iM11307 ^ i5) * 10499) ^ (-1203713141);
                        i4 = 1772555247;
                    }
                    String str11 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str11;
                    break;
                case 415514227:
                case 1997779016:
                    str = strM10056;
                    i12 = 111429136;
                    if (C0817.f3443) {
                        iM11307 = C19806.m45029("ܽ᩵") ^ i5;
                        i3 = ((iM11307 ^ i6) * 9369) ^ 1680511686;
                        i4 = 84691226;
                    } else {
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                    }
                    String str12 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str12;
                    break;
                case 685073250:
                case 1772698715:
                    str = strM10056;
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C0671.m3008() >= 0) {
                        strM10056 = str;
                        iM11307 = ThreadFactoryC3888.m11306("ۚܶ") ^ i6;
                        str = strM10056;
                        i3 = ((iM11307 ^ i5) * (-4025)) ^ (-544843682);
                        i4 = -1358319437;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۨۘ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 19695) ^ 220807862;
                        i4 = -937979693;
                    }
                    String str13 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str13;
                    break;
                case 1297225667:
                case 2005639663:
                    C0962.m3746();
                    break;
                case 1654231206:
                case 2066481065:
                    if (C1668.f6641 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۚܶ") ^ i6;
                        str = strM10056;
                        i3 = ((iM11307 ^ i5) * (-4025)) ^ (-544843682);
                        i4 = -1358319437;
                        String str14 = str;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        strM10056 = str14;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۫") + i5) * (-19);
                        i = ((iM11306 ^ i6) * (-27973)) ^ (-429794249);
                        i2 = 1974028267;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case 1844739239:
                case 1948703795:
                    C0526.m2437();
                    if (C3577.f13150 >= 0) {
                        str = strM10056;
                        iM11307 = C19806.m45029("۬᩷") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-30293)) ^ (-1680648985);
                        i4 = -1924221067;
                        String str15 = str;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        strM10056 = str15;
                    }
                    iM11307 = ThreadFactoryC3888.m11306("ۚܶ") ^ i6;
                    str = strM10056;
                    i3 = ((iM11307 ^ i5) * (-4025)) ^ (-544843682);
                    i4 = -1358319437;
                    String str16 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str16;
                    break;
                case 1949969007:
                case 1972485386:
                    str = strM10056;
                    c = 4;
                    if (RunnableC1564.f6300) {
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 349) ^ 690242659;
                        i4 = -886899576;
                    } else {
                        iM11307 = (C19806.m45029("֡᩺") ^ i5) * (-5);
                        i3 = ((iM11307 ^ i6) * 763) ^ (-200277304);
                        i4 = -1390020789;
                    }
                    String str17 = str;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    strM10056 = str17;
                    break;
                default:
                    C3660.m10791();
                    if (C2642.m8171() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i5;
                        i = ((iM11306 ^ i6) * 17789) ^ (-1267342372);
                        i2 = -930109561;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۫") + i5) * (-19);
                        i = ((iM11306 ^ i6) * (-27973)) ^ (-429794249);
                        i2 = 1974028267;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01a2 A[PHI: r1 r2 r6
      0x01a2: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:59:0x01a0, B:55:0x0183, B:43:0x0117, B:39:0x00f8, B:31:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r2v5 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v4 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:59:0x01a0, B:55:0x0183, B:43:0x0117, B:39:0x00f8, B:31:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:59:0x01a0, B:55:0x0183, B:43:0x0117, B:39:0x00f8, B:31:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d1 A[PHI: r3 r4
      0x01d1: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:63:0x01cf, B:51:0x0168, B:35:0x00d7, B:24:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:63:0x01cf, B:51:0x0168, B:35:0x00d7, B:24:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    public C1997(View view, C14015 c14015, AbstractActivityC12483 abstractActivityC12483) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5 = 0;
        String strM4832 = null;
        int iM450211 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 944015957;
        int i9 = C1398.f5802;
        int i10 = C1937.f7317;
        short s = f7453[0];
        int i11 = s + 1444;
        int i12 = (s * s) + 2085136;
        int i13 = (i12 + i12) - (i11 * i11) >= 0 ? 16800 : 18266;
        int iM11306 = (i10 - ThreadFactoryC3888.m11306("᩺᩺")) * 67;
        int i14 = ((iM11306 ^ i9) * (-25207)) ^ (-920791801);
        int i15 = -212965857;
        while (true) {
            int i16 = iM11306 ^ i15;
            while (true) {
                i8 = ((((i8 ^ i9) * (-16303)) >> 31) & i14) ^ i16;
                switch (i8) {
                    case -1826829061:
                    case 1018725759:
                        if (C7105.f23796 >= 0) {
                            iM450210 = C19806.m45029("۬ۢ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-30241)) ^ 619341963;
                            i4 = -278797352;
                        } else {
                            iM450210 = (i9 - C19806.m45029("ۜۖ")) * (-79);
                            i3 = ((iM450210 ^ i10) * 9707) ^ 901452481;
                            i4 = -1970135255;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1701597718:
                    case -735111366:
                        C3577.m10565();
                        if (C0216.f1393 != 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-25905)) ^ (-1442793352);
                            i4 = -423828396;
                            i16 = iM450210 ^ i4;
                            i14 = i3;
                        }
                        iM450210 = (C19806.m45029("ۨ᩶") ^ i10) * (-9);
                        i3 = ((iM450210 ^ i9) * 27775) ^ (-1095757198);
                        i4 = -1093705857;
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1441395789:
                    case 15371985:
                        i7 = 1;
                        if (RunnableC0195.m1431()) {
                            iM450210 = ThreadFactoryC3888.m11306("᩸᩻") ^ i9;
                            i3 = ((iM450210 ^ i10) * 20485) ^ (-986263715);
                            i4 = 1785228722;
                        } else {
                            iM450210 = C19806.m45029("۬ۢ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-30241)) ^ 619341963;
                            i4 = -278797352;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1393389984:
                    case 1080884778:
                        iM450211 = C19806.m45029(strM4832);
                        i6 = 2103263647;
                        if (C2704.f10408) {
                            iM450210 = C19806.m45029("ۛۗ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-14209)) ^ 618734059;
                            i4 = -839452065;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-25905)) ^ (-1442793352);
                            i4 = -423828396;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1325052397:
                    case 711014637:
                        if (C2642.f10294 <= 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-25905)) ^ (-1442793352);
                            i4 = -423828396;
                        } else {
                            iM450210 = C19806.m45029("ۙ۫") ^ i10;
                            i3 = ((iM450210 ^ i9) * 21203) ^ (-1392665062);
                            i4 = 244491435;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1207066847:
                    case -421325570:
                        i5 = iM450211 ^ i6;
                        if (C0216.f1393 != 0) {
                            iM450210 = C19806.m45029("۬ۢ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-30241)) ^ 619341963;
                            i4 = -278797352;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i10;
                            i3 = ((iM450210 ^ i9) * (-12715)) ^ 959915854;
                            i4 = -756796465;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -1012557056:
                    case 143660154:
                        C3743.m10966();
                        C3286.m9798();
                        throw new RuntimeException();
                    case -999027885:
                    case 465879682:
                        if (!C19806.f63586) {
                        }
                        iM45029 = (C19806.m45029("ۡ᩶") ^ i10) * (-39);
                        i = ((iM45029 ^ i9) * 21087) ^ (-500274629);
                        i2 = -483974030;
                        i16 = iM45029 ^ i2;
                        i14 = i;
                        break;
                        break;
                    case -943721046:
                    case -178041494:
                        RunnableC1606.m5473();
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        }
                        iM450210 = (C19806.m45029("ۨ᩶") ^ i10) * (-9);
                        i3 = ((iM450210 ^ i9) * 27775) ^ (-1095757198);
                        i4 = -1093705857;
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -844456145:
                    case 1615771805:
                        RunnableC1564.m5345();
                        iM450210 = (C19806.m45029("ۨ᩶") ^ i10) * (-9);
                        i3 = ((iM450210 ^ i9) * 27775) ^ (-1095757198);
                        i4 = -1093705857;
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -802130095:
                    case 1042943674:
                        if (RunnableC1606.f6488 >= 0) {
                            iM450210 = C19806.m45029("۬ۢ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-30241)) ^ 619341963;
                            i4 = -278797352;
                        } else {
                            iM450210 = (i10 - ThreadFactoryC3888.m11306("᩻ᩳ")) * 45;
                            i3 = ((iM450210 ^ i9) * 4755) ^ 389495130;
                            i4 = -561053790;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -672366424:
                    case 962108299:
                        this.f7456 = C3743.m10957(view, i5);
                        return;
                    case -507714775:
                    case 1942990173:
                        if (C0797.f3386) {
                            iM450210 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-25905)) ^ (-1442793352);
                            i4 = -423828396;
                        } else {
                            iM450210 = (C19806.m45029("֨ۚ") + i10) * (-13);
                            i3 = ((iM450210 ^ i9) * (-17071)) ^ (-1787712620);
                            i4 = -1804073962;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case -449967372:
                    case 1450622568:
                        sArr = f7453;
                        if (C3535.f13026 <= 0) {
                            iM450210 = (C19806.m45029("ۨ᩶") ^ i10) * (-9);
                            i3 = ((iM450210 ^ i9) * 27775) ^ (-1095757198);
                            i4 = -1093705857;
                        } else {
                            iM450210 = (i9 - C19806.m45029("᩷ۚ")) * 15;
                            i3 = ((iM450210 ^ i10) * 30015) ^ (-1795907241);
                            i4 = -2031665609;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    case 1098782540:
                    case 1819862478:
                        strM4832 = C1377.m4832(sArr, i7, 3, i13);
                        if (RunnableC0195.f1321 >= 0) {
                            iM450210 = C19806.m45029("۬ۢ") ^ i9;
                            i3 = ((iM450210 ^ i10) * (-30241)) ^ 619341963;
                            i4 = -278797352;
                        } else {
                            iM450210 = C19806.m45029("ᩴ۫") ^ i10;
                            i3 = ((iM450210 ^ i9) * 32541) ^ (-1969846559);
                            i4 = 1196278266;
                        }
                        i16 = iM450210 ^ i4;
                        i14 = i3;
                        break;
                    default:
                        this.f7455 = c14015;
                        this.f7454 = abstractActivityC12483;
                        if (AbstractC0464.m2313() != 0) {
                            iM45029 = (C19806.m45029("ۡ᩶") ^ i10) * (-39);
                            i = ((iM45029 ^ i9) * 21087) ^ (-500274629);
                            i2 = -483974030;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") ^ i9) * (-73);
                            i = ((iM45029 ^ i10) * (-26919)) ^ 1605339604;
                            i2 = 1459754724;
                        }
                        i16 = iM45029 ^ i2;
                        i14 = i;
                        break;
                }
            }
            iM11306 = (C19806.m45029("᩷ۢ") + i9) * (-33);
            i14 = ((iM11306 ^ i10) * 11847) ^ (-1246671933);
            i15 = -347420590;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011b A[PHI: r2 r5 r6 r15
      0x011b: PHI (r2v5 float[]) = (r2v3 float[]), (r2v2 float[]), (r2v2 float[]) binds: [B:34:0x0119, B:6:0x005c, B:90:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r5v5 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:34:0x0119, B:6:0x005c, B:90:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:34:0x0119, B:6:0x005c, B:90:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r15v5 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:34:0x0119, B:6:0x005c, B:90:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0243 A[PHI: r3 r4 r9 r10 r17
      0x0243: PHI (r3v4 android.view.View) = (r3v2 android.view.View), (r3v2 android.view.View), (r3v2 android.view.View), (r3v5 android.view.View) binds: [B:62:0x0241, B:54:0x01fe, B:39:0x0154, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r4v3 android.animation.ObjectAnimator) = 
      (r4v2 android.animation.ObjectAnimator)
      (r4v2 android.animation.ObjectAnimator)
      (r4v2 android.animation.ObjectAnimator)
      (r4v4 android.animation.ObjectAnimator)
     binds: [B:62:0x0241, B:54:0x01fe, B:39:0x0154, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:62:0x0241, B:54:0x01fe, B:39:0x0154, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:62:0x0241, B:54:0x01fe, B:39:0x0154, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:62:0x0241, B:54:0x01fe, B:39:0x0154, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0277 A[PHI: r7 r12 r13 r14 r16 r22
      0x0277: PHI (r7v7 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r12v7 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r13v7 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r14v7 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r16v7 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r22v8 int) = (r22v3 int), (r22v4 int), (r22v3 int), (r22v3 int) binds: [B:66:0x0275, B:58:0x0221, B:43:0x017b, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        C1997 c1997 = this;
        int i4 = C1066.f4915;
        int i5 = C3535.f13026;
        int iM11308 = (i5 - ThreadFactoryC3888.m11306("۠ܶ")) * (-41);
        int i6 = ((iM11308 ^ i4) * 26491) ^ 348584275;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM11308 ^ (-1196511312);
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -465257054;
        int i15 = 0;
        ObjectAnimator objectAnimatorM26816 = null;
        View view = null;
        float[] fArr = null;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * (-16465)) >> 31));
            switch (i14) {
                case -2125780960:
                case 1129630333:
                    C2477.m7594(objectAnimatorM26816);
                    C14015 c14015 = c1997.f7455;
                    c14015.f46063 = objectAnimatorM26816;
                    c14015.f46060 = true;
                    break;
                case -1850306807:
                case -1262678532:
                    i11 = 40964;
                    iM11307 = C19806.m45029("᩻ᩴ") ^ i4;
                    i6 = ((iM11307 ^ i5) * (-5931)) ^ (-215794897);
                    i3 = 1684828201;
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case -1774588845:
                case -861851683:
                    objectAnimatorM26816 = C10634.m26816(view, C2249.m6918(sArr3, i8, i9, i11), fArr);
                    if (C0629.f2722 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩶") + i5) * 63;
                        i = ((iM11306 ^ i4) * 14037) ^ 1723974775;
                        i2 = -617286255;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        iM11307 = (C19806.m45029("ܺܳ") + i5) * 7;
                        i6 = ((iM11307 ^ i4) * (-17951)) ^ (-343930640);
                        i3 = 1043644544;
                        i7 = iM11307 ^ i3;
                        c1997 = this;
                    }
                    break;
                case -1695192024:
                case -1496870286:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = (i5 - C19806.m45029("ܺ۠")) * (-45);
                        i6 = ((iM11307 ^ i4) * 4107) ^ (-2087286013);
                        i3 = 258586995;
                        i7 = iM11307 ^ i3;
                        c1997 = this;
                    } else {
                        iM11306 = C19806.m45029("ܶۡ") ^ i4;
                        i = ((iM11306 ^ i5) * 2279) ^ (-1286708510);
                        i2 = -1545493689;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1592576024:
                case 1123632734:
                    if (!C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i4;
                        i = ((iM11306 ^ i5) * 351) ^ 732368049;
                        i2 = 243802878;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        iM11307 = (i5 - C19806.m45029("ܺ۠")) * (-45);
                        i6 = ((iM11307 ^ i4) * 4107) ^ (-2087286013);
                        i3 = 258586995;
                        i7 = iM11307 ^ i3;
                        c1997 = this;
                    }
                    break;
                case -1538261322:
                case 1685867162:
                    s = sArr[c];
                    i15 = s * s;
                    if (C3722.f13525 <= 0) {
                        iM11307 = (i5 - C19806.m45029("ܺ۠")) * (-45);
                        i6 = ((iM11307 ^ i4) * 4107) ^ (-2087286013);
                        i3 = 258586995;
                    } else {
                        iM11307 = (i5 - C19806.m45029("᩷᩻")) * (-103);
                        i6 = ((iM11307 ^ i4) * (-31643)) ^ (-41745857);
                        i3 = 733590864;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case -1323734321:
                case -99175309:
                    i11 = 2060;
                    iM11307 = C19806.m45029("᩻ᩴ") ^ i4;
                    i6 = ((iM11307 ^ i5) * (-5931)) ^ (-215794897);
                    i3 = 1684828201;
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case -966955966:
                case -462740778:
                    C1977.m6356();
                    C3535.m10431();
                    break;
                case -309568872:
                case 883181094:
                    c = 14;
                    if (C1460.f5948 >= 0) {
                        iM11307 = (C19806.m45029("ܺܳ") + i5) * 7;
                        i6 = ((iM11307 ^ i4) * (-17951)) ^ (-343930640);
                        i3 = 1043644544;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿۢ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-13801)) ^ 1663660946;
                        i3 = 1000116486;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case 30610974:
                case 1376939641:
                    sArr2 = f7453;
                    i12 = 15;
                    i13 = 9;
                    if (C3722.f13525 <= 0) {
                        iM11307 = (i5 - C19806.m45029("ܺ۠")) * (-45);
                        i6 = ((iM11307 ^ i4) * 4107) ^ (-2087286013);
                        i3 = 258586995;
                    } else {
                        iM11307 = (i5 - ThreadFactoryC3888.m11306("ܺۗ")) * (-33);
                        i6 = ((iM11307 ^ i4) * 16767) ^ 244650595;
                        i3 = -1512237462;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case 32183316:
                case 386165383:
                    CallableC1627.m5508(animator, C3535.m10423(sArr2, i12, i13, i11));
                    if (C3743.f13569) {
                        int iM45029 = C19806.m45029("ܿᩳ") ^ i4;
                        i7 = iM45029 ^ 121142216;
                        i6 = ((iM45029 ^ i5) * 31899) ^ 576313667;
                    } else {
                        iM11307 = (C19806.m45029("ܺܳ") + i5) * 7;
                        i6 = ((iM11307 ^ i4) * (-17951)) ^ (-343930640);
                        i3 = 1043644544;
                        i7 = iM11307 ^ i3;
                    }
                    c1997 = this;
                    break;
                case 425735126:
                case 1652861362:
                    fArr = new float[]{0.0f, 1.0f};
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i4;
                        i = ((iM11306 ^ i5) * 351) ^ 732368049;
                        i2 = 243802878;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i5;
                        i = ((iM11306 ^ i4) * 20273) ^ (-1849498066);
                        i2 = 646809176;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 496437119:
                case 1042084215:
                    sArr = f7453;
                    if (C3577.f13150 >= 0) {
                        iM11307 = (i5 - C19806.m45029("ܺ۠")) * (-45);
                        i6 = ((iM11307 ^ i4) * 4107) ^ (-2087286013);
                        i3 = 258586995;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۟ܳ") ^ i4) * 81;
                        i6 = ((iM11307 ^ i5) * 31261) ^ (-1248793905);
                        i3 = 74311516;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case 653712180:
                case 902702989:
                    if ((s * s2) - i10 > 0) {
                        iM11307 = (i5 - C19806.m45029("ܰ᩶")) * 93;
                        i6 = ((iM11307 ^ i4) * (-3753)) ^ (-1272724616);
                        i3 = 1169016796;
                    } else {
                        iM11307 = (C19806.m45029("ܺۚ") ^ i4) * 73;
                        i6 = ((iM11307 ^ i5) * (-5335)) ^ 573897525;
                        i3 = -121529587;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case 718781832:
                case 1269855212:
                    C1419.m4973();
                    C1937.m6279();
                    iM11306 = C19806.m45029("ܶۡ") ^ i4;
                    i = ((iM11306 ^ i5) * 2279) ^ (-1286708510);
                    i2 = -1545493689;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 1168421612:
                case 1798624831:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ܶۡ") ^ i4;
                        i = ((iM11306 ^ i5) * 2279) ^ (-1286708510);
                        i2 = -1545493689;
                    } else {
                        iM11306 = C19806.m45029("ܽܺ") ^ i4;
                        i = ((iM11306 ^ i5) * (-27473)) ^ (-1824751346);
                        i2 = -1015325567;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 1168455699:
                case 2130494445:
                    i10 = i15 + 4791721;
                    s2 = 4378;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11307 = (C19806.m45029("ܺܳ") + i5) * 7;
                        i6 = ((iM11307 ^ i4) * (-17951)) ^ (-343930640);
                        i3 = 1043644544;
                    } else {
                        iM11307 = (C19806.m45029("ܳ֫") ^ i4) * (-103);
                        i6 = ((iM11307 ^ i5) * (-5029)) ^ (-889181542);
                        i3 = 617028683;
                    }
                    i7 = iM11307 ^ i3;
                    c1997 = this;
                    break;
                case 1674602856:
                case 2037285133:
                    view = c1997.f7456;
                    if (C1875.f7103 < 0) {
                        iM11306 = C19806.m45029("ᩴ᩷") ^ i5;
                        i = ((iM11306 ^ i4) * 14777) ^ 535810256;
                        i2 = -706432253;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        iM11307 = (C19806.m45029("ܺܳ") + i5) * 7;
                        i6 = ((iM11307 ^ i4) * (-17951)) ^ (-343930640);
                        i3 = 1043644544;
                        i7 = iM11307 ^ i3;
                        c1997 = this;
                    }
                    break;
                default:
                    sArr3 = f7453;
                    i8 = 24;
                    i9 = 5;
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i4;
                        i = ((iM11306 ^ i5) * 351) ^ 732368049;
                        i2 = 243802878;
                    } else {
                        iM11306 = (C19806.m45029("ܺۖ") ^ i4) * (-109);
                        i = ((iM11306 ^ i5) * (-3045)) ^ (-243952419);
                        i2 = 950173029;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }
}
