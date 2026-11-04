package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N3YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12684 implements PluginPreference.Builder {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Class f40635;

    /* JADX INFO: renamed from: ۤᩳۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f40636 = {5472, -31649, -31640, -31643, -31620, -31636, -31703, -31642, -31633, -31703, -31703, -31638, -31640, -31641, -31703, -31641, -31642, -31619, -31703, -31637, -31636, -31703, -31641, -31620, -31643, -31643, 5600, 26666, 26679, 26666, 26674, 26683, 5838, -30517, -30506, -30517, -30509, -30502, -30508, -30502, -30522, 1271, 8955, 8934, 8955, 8931, 8938, 8932, 8938, 8950, 3285, -27092, -27087, -27092, -27084, -27075, -27085, -27075, -27103, 635, -24069, -24090, -24069, -24093, -24086, -24092, -24086, -24074, 4600, 13083, 13062, 13083, 13059, 13066, 2396, -7723, -7736, -7723, -7731, -7740, -7734, -7740, -7720};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginContext f40637;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LocalString f40638;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f40639;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f40640;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceChangeListener f40641;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f40642;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceScreenCreatedListener f40643;

    static {
        ClassNotFoundException e = null;
        int i = 39834106;
        int i2 = C1321.f4751;
        int i3 = C3448.f11240;
        int iM3169 = (C0773.m3169("ۛۢ") + i3) * 71;
        int i4 = ((iM3169 ^ i2) * (-27241)) ^ (-507427718);
        int i5 = -785548524;
        while (true) {
            i = ((((i ^ i2) * (-16277)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1810056812:
                case -635007162:
                    C2354.m7983();
                    throw new RuntimeException();
                case -1744080398:
                case -1513644166:
                    return;
                case -1579180443:
                case 237190109:
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("ۖ۟") ^ i3) * 27;
                        i4 = ((iM3169 ^ i2) * 32149) ^ 1248126985;
                        i5 = -1597799192;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5767)) ^ 585663159;
                        i5 = 2092867757;
                    }
                    break;
                case -1113763697:
                case 1133692117:
                    try {
                        int i6 = ActivityC10667.f33847;
                        f40635 = ActivityC10667.class;
                        iM3169 = C0773.m3169("ۨ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1303)) ^ (-293087633);
                        i5 = 1301205838;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        iM3169 = C0773.m3169("ܽ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1955) ^ (-175326931);
                        i5 = 1118478284;
                    }
                    break;
                case -545371811:
                case -371710286:
                    C3448.m11248();
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܳ۬")) * (-47);
                        i4 = ((iM3169 ^ i3) * 30525) ^ (-1267196408);
                        i5 = -2130261740;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩺ۡ")) * (-63);
                        i4 = ((iM3169 ^ i2) * (-3465)) ^ 159269298;
                        i5 = -1549673848;
                    }
                    break;
                case -466442248:
                case -71731165:
                    if (!C3077.m10041()) {
                        if (C4282.m13644()) {
                            if (C0269.f1558 > 0 && !RunnableC1848.m6360()) {
                                if (C2419.m8174() < 0) {
                                    if (C3779.f12953 > 0) {
                                        if (C1321.m4852()) {
                                            if (C2834.f9334 <= 0) {
                                                iM3169 = (C0619.m2761("ۖ۟") ^ i3) * 27;
                                                i4 = ((iM3169 ^ i2) * 32149) ^ 1248126985;
                                                i5 = -1597799192;
                                            } else if (C1826.f6190 > 0 && C2310.m7813() > 0) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                    }
                                }
                                iM3169 = C0619.m2761("ۤۜ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 12515) ^ (-1743291657);
                                i5 = 122133862;
                            }
                            break;
                        }
                        iM3169 = (i3 - C0619.m2761("᩺ۡ")) * (-63);
                        i4 = ((iM3169 ^ i2) * (-3465)) ^ 159269298;
                        i5 = -1549673848;
                        break;
                    }
                    iM3169 = (i2 - C0619.m2761("ܳ۬")) * (-47);
                    i4 = ((iM3169 ^ i3) * 30525) ^ (-1267196408);
                    i5 = -2130261740;
                    break;
                case -350224874:
                case 561865226:
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۨ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5767)) ^ 585663159;
                        i5 = 2092867757;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩺ۡ")) * (-63);
                        i4 = ((iM3169 ^ i2) * (-3465)) ^ 159269298;
                        i5 = -1549673848;
                    }
                    break;
                default:
                    C3734.m12152();
                    C2310.m7813();
                    iM3169 = C0619.m2761("ۨ᩸") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-5767)) ^ 585663159;
                    i5 = 2092867757;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0201 A[PHI: r2 r4 r7 r8
      0x0201: PHI (r2v4 l.ۛ᩺֫) = (r2v2 l.ۛ᩺֫), (r2v2 l.ۛ᩺֫), (r2v3 l.ۛ᩺֫), (r2v2 l.ۛ᩺֫) binds: [B:57:0x01ff, B:49:0x01bb, B:35:0x0113, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:57:0x01ff, B:49:0x01bb, B:35:0x0113, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:57:0x01ff, B:49:0x01bb, B:35:0x0113, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:57:0x01ff, B:49:0x01bb, B:35:0x0113, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0262 A[PHI: r5 r6 r11
      0x0262: PHI (r5v5 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:65:0x0260, B:53:0x01de, B:31:0x00f1, B:88:0x0262] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r6v5 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:65:0x0260, B:53:0x01de, B:31:0x00f1, B:88:0x0262] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r11v5 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:65:0x0260, B:53:0x01de, B:31:0x00f1, B:88:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (l.C13473.f42873 != 0) goto L12;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Header addHeader(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12684.addHeader(java.lang.CharSequence):bin.mt.plugin.api.preference.PluginPreference$Header");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01f8 A[PHI: r2 r5 r6 r7 r16
      0x01f8: PHI (r2v3 l.۟᩺֫) = (r2v2 l.۟᩺֫), (r2v2 l.۟᩺֫), (r2v4 l.۟᩺֫) binds: [B:54:0x01f6, B:50:0x01d2, B:35:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:54:0x01f6, B:50:0x01d2, B:35:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x01f6, B:50:0x01d2, B:35:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:54:0x01f6, B:50:0x01d2, B:35:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r16v12 int) = (r16v5 int), (r16v6 int), (r16v13 int) binds: [B:54:0x01f6, B:50:0x01d2, B:35:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x024f A[PHI: r3 r10 r16
      0x024f: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:62:0x024d, B:31:0x00f5, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:62:0x024d, B:31:0x00f5, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r16v16 int) = (r16v3 int), (r16v14 int), (r16v18 int) binds: [B:62:0x024d, B:31:0x00f5, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0282 A[PHI: r4 r11 r12 r16
      0x0282: PHI (r4v6 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:66:0x0280, B:58:0x022e, B:27:0x00d4, B:10:0x005e, B:87:0x0282] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r11v6 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:66:0x0280, B:58:0x022e, B:27:0x00d4, B:10:0x005e, B:87:0x0282] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r12v6 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:66:0x0280, B:58:0x022e, B:27:0x00d4, B:10:0x005e, B:87:0x0282] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r16v27 int) = (r16v2 int), (r16v4 int), (r16v15 int), (r16v17 int), (r16v28 int) binds: [B:66:0x0280, B:58:0x022e, B:27:0x00d4, B:10:0x005e, B:87:0x0282] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (l.RunnableC3055.f9898 < 0) goto L14;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Text addText(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12684.addText(java.lang.CharSequence):bin.mt.plugin.api.preference.PluginPreference$Text");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bc A[PHI: r10 r13 r14
      0x01bc: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01ba, B:35:0x011c, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:50:0x01ba, B:35:0x011c, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:50:0x01ba, B:35:0x011c, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0219 A[PHI: r3 r4 r6 r7 r12 r15
      0x0219: PHI (r3v4 l.ۛ᩺֫) = (r3v2 l.ۛ᩺֫), (r3v3 l.ۛ᩺֫), (r3v2 l.ۛ᩺֫), (r3v2 l.ۛ᩺֫) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:58:0x0217, B:39:0x0141, B:31:0x00f9, B:27:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x024c A[PHI: r8 r9 r20
      0x024c: PHI (r8v7 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:62:0x024a, B:54:0x01f3, B:14:0x006b, B:89:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r9v7 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:62:0x024a, B:54:0x01f3, B:14:0x006b, B:89:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r20v8 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:62:0x024a, B:54:0x01f3, B:14:0x006b, B:89:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Header addHeader(CharSequence charSequence, String str) {
        int iM2761;
        int i;
        int i2;
        String str2 = str;
        int i3 = C3734.f12817;
        int i4 = C1826.f6190;
        int iM3169 = C0773.m3169("ܽܿ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 28951) ^ 903620113;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM3169 ^ 1516211560;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1778615479;
        String strM3780 = null;
        C6719 c6719 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-22163)) >> 31));
            switch (i12) {
                case -1961138555:
                case -1340230436:
                    c6719 = new C6719();
                    sArr2 = f40636;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("֡᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 11045) ^ (-1030712402);
                        i2 = 5295095;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩸") ^ i4;
                        i = ((iM2761 ^ i3) * (-1987)) ^ (-2087446397);
                        i2 = 1860343195;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1907233576:
                case 1689596132:
                    AbstractC0116.m1243();
                    if (C2485.m8357() <= 0) {
                        int iM31610 = (C0773.m3169("ۙᩴ") + i3) * (-81);
                        i = ((iM31610 ^ i4) * 24039) ^ 395802595;
                        i6 = iM31610 ^ 2134635905;
                    } else {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23387)) ^ 73901443;
                        i2 = -1838137994;
                        i6 = iM2761 ^ i2;
                        str2 = str;
                    }
                    i5 = i;
                    break;
                case -1779140639:
                case -820008634:
                    C20932.m47848();
                    if (C1542.f5343 <= 0) {
                        int iM31611 = (C0773.m3169("ۙᩴ") + i3) * (-81);
                        i = ((iM31611 ^ i4) * 24039) ^ 395802595;
                        i6 = iM31611 ^ 2134635905;
                    } else {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 28047) ^ 386787136;
                        i2 = -631906634;
                        i6 = iM2761 ^ i2;
                        str2 = str;
                    }
                    i5 = i;
                    break;
                case -1605261915:
                case 859306188:
                    s = sArr[32];
                    s2 = 1;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("֡᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 11045) ^ (-1030712402);
                        i2 = 5295095;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i4;
                        i = ((iM2761 ^ i3) * 9357) ^ 675034199;
                        i2 = 940906639;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1459635887:
                case 1170826479:
                    i9 = 1252;
                    iM2761 = C0619.m2761("֡۠") ^ i3;
                    i = ((iM2761 ^ i4) * (-11731)) ^ 1311484020;
                    i2 = 504044899;
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1437008947:
                case 1229408355:
                    C3077.m10041();
                    C4238.m13540();
                    return null;
                case -1399885927:
                case 275381526:
                    c6719.f48739 = charSequence;
                    c6719.f48737 = str2;
                    RunnableC0334.m2054(this.f40642, c6719);
                    return c6719;
                case -1367634997:
                case -748651251:
                    m31477(charSequence, C0487.m2361(sArr2, i10, i11, i9));
                    sArr3 = f40636;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("֡᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 11045) ^ (-1030712402);
                        i2 = 5295095;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩹") + i3) * q.h;
                        i = ((iM2761 ^ i4) * 2147) ^ 96160730;
                        i2 = -1396657704;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1339575510:
                case -30868423:
                    sArr = f40636;
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 28047) ^ 386787136;
                        i2 = -631906634;
                    } else {
                        iM2761 = (C0773.m3169("۠֫") + i4) * (-69);
                        i = ((iM2761 ^ i3) * 19191) ^ 1079596832;
                        i2 = 1840230307;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1141492624:
                case 1873229073:
                    i8 = s * s3;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23387)) ^ 73901443;
                        i2 = -1838137994;
                    } else {
                        iM2761 = (C0619.m2761("ܳܶ") ^ i3) * 39;
                        i = ((iM2761 ^ i4) * 9601) ^ 906633188;
                        i2 = 1318114545;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -868644383:
                case 1559286038:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    s3 = 2;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 28047) ^ 386787136;
                        i2 = -631906634;
                    } else {
                        iM2761 = (C0619.m2761("۠֡") + i3) * (-7);
                        i = ((iM2761 ^ i4) * 15519) ^ 1577880754;
                        i2 = 1467115994;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -816864141:
                case 394078918:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0773.m3169("ۢ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-27725)) ^ (-1745019534);
                        i2 = -1409662552;
                    } else {
                        iM2761 = C0619.m2761("᩺۬") ^ i3;
                        i = ((iM2761 ^ i4) * (-24607)) ^ 1720329855;
                        i2 = 624182817;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -68751929:
                case 373578354:
                    if (i7 - (i8 + 1) < 0) {
                        iM2761 = C0619.m2761("ۡ۬") ^ i4;
                        i = ((iM2761 ^ i3) * (-29869)) ^ (-2028371375);
                        i2 = -870689123;
                    } else {
                        iM2761 = C0619.m2761("ܳܿ") ^ i4;
                        i = ((iM2761 ^ i3) * (-15847)) ^ (-1430793862);
                        i2 = 1980693019;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -66751224:
                case 317403024:
                    i9 = 35007;
                    iM2761 = C0619.m2761("֡۠") ^ i3;
                    i = ((iM2761 ^ i4) * (-11731)) ^ 1311484020;
                    i2 = 504044899;
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 123979881:
                case 1200189490:
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("ۢ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-27725)) ^ (-1745019534);
                        i2 = -1409662552;
                        i6 = iM2761 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                    i = ((iM2761 ^ i4) * 28047) ^ 386787136;
                    i2 = -631906634;
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 159074055:
                case 1701389024:
                    strM3780 = C0950.m3780(sArr3, 38, 3, i9);
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("֡᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 11045) ^ (-1030712402);
                        i2 = 5295095;
                    } else {
                        iM2761 = C0773.m3169("ۛ֨") ^ i4;
                        i = ((iM2761 ^ i3) * (-1407)) ^ (-129426774);
                        i2 = -2136607812;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 168255449:
                case 1990791317:
                    i10 = 33;
                    i11 = 5;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23387)) ^ 73901443;
                        i2 = -1838137994;
                    } else {
                        iM2761 = C0619.m2761("᩷᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 22539) ^ 1316526067;
                        i2 = 1182006613;
                    }
                    i6 = iM2761 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 1329998627:
                case 1662824397:
                    C0773.m3161();
                    int iM31612 = (C0773.m3169("ۙᩴ") + i3) * (-81);
                    i = ((iM31612 ^ i4) * 24039) ^ 395802595;
                    i6 = iM31612 ^ 2134635905;
                    i5 = i;
                    break;
                default:
                    m31477(str2, strM3780);
                    if (C13473.m33144()) {
                        int iM31613 = C0773.m3169("ۖᩳ") ^ i4;
                        i6 = iM31613 ^ 1955340460;
                        i5 = ((iM31613 ^ i3) * 31803) ^ (-1000978626);
                        str2 = str;
                    } else {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 28047) ^ 386787136;
                        i2 = -631906634;
                        i6 = iM2761 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x021f A[PHI: r6 r7 r8
      0x021f: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:57:0x021d, B:53:0x01fa, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:57:0x021d, B:53:0x01fa, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:57:0x021d, B:53:0x01fa, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0288 A[PHI: r3 r4 r9
      0x0288: PHI (r3v4 l.᩶᩺֫) = (r3v2 l.᩶᩺֫), (r3v2 l.᩶᩺֫), (r3v3 l.᩶᩺֫), (r3v2 l.᩶᩺֫) binds: [B:65:0x0286, B:49:0x01d4, B:38:0x015a, B:30:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r4v4 java.util.ArrayList) = (r4v2 java.util.ArrayList), (r4v2 java.util.ArrayList), (r4v3 java.util.ArrayList), (r4v2 java.util.ArrayList) binds: [B:65:0x0286, B:49:0x01d4, B:38:0x015a, B:30:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:65:0x0286, B:49:0x01d4, B:38:0x015a, B:30:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (l.C3033.f9831 >= 0) goto L10;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.List addList(java.lang.CharSequence r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12684.addList(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$List");
    }

    public C12684(PluginContext pluginContext) {
        ArrayList arrayList = null;
        int i = -37457050;
        int i2 = C1146.f4234;
        int i3 = C2310.f7472;
        int iM2761 = (C0619.m2761("ܶᩴ") ^ i2) * (-103);
        int i4 = ((iM2761 ^ i3) * 7689) ^ 1559525519;
        int i5 = -838938400;
        while (true) {
            i = ((((i ^ i3) * (-23283)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2029639051:
                case -473911330:
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0773.m3169("᩶֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15973)) ^ (-249137552);
                        i5 = 1790778503;
                    } else {
                        iM2761 = C0619.m2761("ۨᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16201) ^ 1489770011;
                        i5 = 1853623097;
                    }
                    break;
                case -1899344098:
                case 854833532:
                    arrayList = new ArrayList();
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("֫֫") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-23433)) ^ (-1574776600);
                        i5 = -682424064;
                    } else {
                        iM2761 = C0619.m2761("ᩴۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14363)) ^ 2098744750;
                        i5 = 697547594;
                    }
                    break;
                case -1751932205:
                case -136118107:
                    if (C17202.f56030) {
                        iM2761 = (i2 - C0619.m2761("֡۟")) * (-81);
                        i4 = ((iM2761 ^ i3) * (-15135)) ^ 1434355556;
                        i5 = 173704581;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֫᩹")) * 55;
                        i4 = ((iM2761 ^ i3) * (-1451)) ^ (-1618862075);
                        i5 = 1237156851;
                    }
                    break;
                case -1604697729:
                case 278488259:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6279) ^ (-1162452723);
                        i5 = 1497826185;
                    } else {
                        iM2761 = C0773.m3169("᩶֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15973)) ^ (-249137552);
                        i5 = 1790778503;
                    }
                    break;
                case -1131663829:
                case 1454416641:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("֫֫") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-23433)) ^ (-1574776600);
                        i5 = -682424064;
                    } else {
                        iM2761 = (C0773.m3169("֫ᩳ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * 7725) ^ (-1918616984);
                        i5 = -370137509;
                    }
                    break;
                case -570055241:
                case 1336639715:
                    if (C17202.f56030) {
                        iM2761 = (C0619.m2761("ۡܶ") + i3) * (-25);
                        i4 = ((iM2761 ^ i2) * 28967) ^ 916775800;
                        i5 = 1142149965;
                    } else {
                        iM2761 = C0619.m2761("ܰ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6279) ^ (-1162452723);
                        i5 = 1497826185;
                    }
                    break;
                case -548137030:
                case -6124829:
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0773.m3169("᩶֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15973)) ^ (-249137552);
                        i5 = 1790778503;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۛܰ")) * (-39);
                        i4 = ((iM2761 ^ i3) * (-2547)) ^ 344475207;
                        i5 = 2111482805;
                    }
                    break;
                case -381765577:
                case 1509370091:
                    C3077.m10041();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩶֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15973)) ^ (-249137552);
                        i5 = 1790778503;
                    } else {
                        iM2761 = (C0619.m2761("֫֫") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-23433)) ^ (-1574776600);
                        i5 = -682424064;
                    }
                    break;
                case -379334928:
                case 743085656:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i2 - C0773.m3169("֫᩹")) * 55;
                        i4 = ((iM2761 ^ i3) * (-1451)) ^ (-1618862075);
                        i5 = 1237156851;
                    } else {
                        iM2761 = C0773.m3169("ۜۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27547)) ^ 1844147166;
                        i5 = -1915643853;
                    }
                    break;
                case 16591482:
                case 66449111:
                    C0773.m3161();
                    C23916.m53419();
                    iM2761 = (C0773.m3169("֫ᩳ") ^ i3) * 93;
                    i4 = ((iM2761 ^ i2) * 7725) ^ (-1918616984);
                    i5 = -370137509;
                    break;
                case 50023581:
                case 742057443:
                    this.f40642 = arrayList;
                    this.f40637 = pluginContext;
                    return;
                case 204208603:
                case 1618906608:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("֫ᩳ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * 7725) ^ (-1918616984);
                        i5 = -370137509;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۛ") ^ i3) * (-99);
                        i4 = ((iM2761 ^ i2) * (-5727)) ^ 78775992;
                        i5 = -585547607;
                    }
                    break;
                case 596124057:
                case 1301510488:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6279) ^ (-1162452723);
                        i5 = 1497826185;
                    } else {
                        iM2761 = C0773.m3169("֨֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30267)) ^ 400546988;
                        i5 = 905056647;
                    }
                    break;
                case 964714582:
                case 1179559581:
                    C3033.m9845();
                    throw new RuntimeException();
                case 1300536811:
                case 1541621990:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i2 - C0773.m3169("֫᩹")) * 55;
                        i4 = ((iM2761 ^ i3) * (-1451)) ^ (-1618862075);
                        i5 = 1237156851;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11041) ^ (-250580078);
                        i5 = -1673304106;
                    }
                    break;
                default:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("֫֫") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-23433)) ^ (-1574776600);
                        i5 = -682424064;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۨܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * (-30941)) ^ 718196019;
                        i5 = 1316036224;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ef A[PHI: r10 r11
      0x00ef: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:32:0x00ed, B:20:0x007d, B:14:0x005a, B:12:0x0056, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:32:0x00ed, B:20:0x007d, B:14:0x005a, B:12:0x0056, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ba A[PHI: r6 r12
      0x01ba: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:51:0x01b8, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:51:0x01b8, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ee A[PHI: r5 r7
      0x01ee: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:55:0x01ec, B:47:0x0198, B:12:0x0056, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:55:0x01ec, B:47:0x0198, B:12:0x0056, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x021c  */
    /* JADX WARN: Code duplicated, block: B:64:0x024a A[PHI: r3 r4 r9
      0x024a: PHI (r3v4 l.۟᩺֫) = (r3v2 l.۟᩺֫), (r3v3 l.۟᩺֫), (r3v2 l.۟᩺֫), (r3v2 l.۟᩺֫) binds: [B:63:0x0248, B:36:0x0122, B:24:0x00a8, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:63:0x0248, B:36:0x0122, B:24:0x00a8, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:63:0x0248, B:36:0x0122, B:24:0x00a8, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Text addText(CharSequence charSequence, String str) {
        int iM2761;
        int i;
        int i2 = C0269.f1558;
        int i3 = C3099.f10023;
        int iM3169 = C0773.m3169("᩸ᩴ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 15263) ^ (-1866692983);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i5 = iM3169 ^ 632506948;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 932333707;
        String strM10092 = null;
        C8210 c8210 = null;
        while (true) {
            i10 = i5 ^ (i4 & (((i10 ^ i3) * 14605) >> 31));
            switch (i10) {
                case -2041437542:
                case 668968472:
                    i6 = (s * s) + 105822369;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۖ֡") + i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-20713)) ^ 661937311;
                        i = -689399445;
                    } else {
                        iM2761 = (C0773.m3169("۬᩹") + i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 24689) ^ 665611918;
                        i = 1139137935;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -2021597422:
                case -276672400:
                    C2354.m7983();
                    if (C3448.m11248() == 0) {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3823) ^ (-940365617);
                        i = 229274732;
                    } else {
                        iM2761 = (C0619.m2761("ۖ֡") + i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-20713)) ^ 661937311;
                        i = -689399445;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1938274251:
                case -309593499:
                    i7 = 14128;
                    iM2761 = (C0619.m2761("ܰܺ") ^ i3) * (-125);
                    i4 = ((iM2761 ^ i2) * 15123) ^ 1242658397;
                    i = -405678220;
                    i5 = iM2761 ^ i;
                    break;
                case -1893989866:
                case 105855626:
                    sArr = f40636;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0619.m2761("ۖ֡") + i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-20713)) ^ 661937311;
                        i = -689399445;
                    } else {
                        iM2761 = C0619.m2761("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28403)) ^ 479968386;
                        i = -704217814;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1648661087:
                case -212793142:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3823) ^ (-940365617);
                        i = 229274732;
                    } else {
                        iM2761 = C0619.m2761("ۨۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7421) ^ (-1671975428);
                        i = -539821701;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1590107764:
                case -303535816:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("᩵᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27983) ^ (-217049053);
                        i = -602612108;
                    } else {
                        iM2761 = (C0773.m3169("ۢۤ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * (-20021)) ^ 1073523667;
                        i = -973611875;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1580467561:
                case 321488962:
                    i8 = 75;
                    i9 = 5;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3823) ^ (-940365617);
                        i = 229274732;
                    } else {
                        iM2761 = C0619.m2761("֡֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20951) ^ 2120117516;
                        i = 1619463011;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1410221809:
                case 1338058582:
                    m31477(charSequence, C1542.m5471(sArr2, i8, i9, i7));
                    sArr3 = f40636;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩻") ^ i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14941) ^ (-113013446);
                        i = 2001304959;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۖܰ")) * (-55);
                        i4 = ((iM2761 ^ i2) * (-22263)) ^ (-1406184677);
                        i = 523299867;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -1359871285:
                case 585892715:
                    C0773.m3161();
                    C2375.m8065();
                    return null;
                case -1352460440:
                case 265217694:
                    if (i6 - (s * 20574) < 0) {
                        iM2761 = C0619.m2761("ۜۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21143)) ^ 2123145266;
                        i = -1556214879;
                    } else {
                        iM2761 = (C0773.m3169("۫ܺ") + i2) * q.h;
                        i4 = ((iM2761 ^ i3) * 32543) ^ (-1030892264);
                        i = 1226061466;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -752701295:
                case -108648406:
                    C1542.m5459();
                    C0773.m3161();
                    iM2761 = C0773.m3169("ۜᩴ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 3823) ^ (-940365617);
                    i = 229274732;
                    i5 = iM2761 ^ i;
                    break;
                case -724188267:
                case 183934119:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۨۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7421) ^ (-1671975428);
                        i = -539821701;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙܿ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i2) * (-23971)) ^ 1708443383;
                        i = -1502406600;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -685564442:
                case 1608548630:
                    m31477(str, strM10092);
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3823) ^ (-940365617);
                        i = 229274732;
                        i5 = iM2761 ^ i;
                    } else {
                        int iM31610 = (C0773.m3169("ۨܿ") ^ i3) * 77;
                        int i11 = ((iM31610 ^ i2) * 24907) ^ (-1474077851);
                        i5 = iM31610 ^ 1953385900;
                        i4 = i11;
                    }
                    break;
                case -455363471:
                case 950061762:
                    c8210.f48739 = charSequence;
                    c8210.f48737 = str;
                    C1519.m5406(this.f40642, c8210);
                    return c8210;
                case -413517258:
                case -113225618:
                    s = sArr[74];
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۢܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21971)) ^ 1465748022;
                        i = -570424191;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩻") ^ i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14941) ^ (-113013446);
                        i = 2001304959;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case -347688537:
                case 426496983:
                    strM10092 = C3099.m10092(sArr3, 80, 3, i7);
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("ۨۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7421) ^ (-1671975428);
                        i = -539821701;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31129)) ^ (-1821482250);
                        i = 1889986970;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case 943315152:
                case 1808135532:
                    c8210 = new C8210();
                    sArr2 = f40636;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ۨۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7421) ^ (-1671975428);
                        i = -539821701;
                    } else {
                        iM2761 = C0619.m2761("ۡᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14463) ^ 552682755;
                        i = -107352158;
                    }
                    i5 = iM2761 ^ i;
                    break;
                case 1559278348:
                case 1818178788:
                    i7 = 57761;
                    iM2761 = (C0619.m2761("ܰܺ") ^ i3) * (-125);
                    i4 = ((iM2761 ^ i2) * 15123) ^ 1242658397;
                    i = -405678220;
                    i5 = iM2761 ^ i;
                    break;
                default:
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (C0619.m2761("ۖ֡") + i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-20713)) ^ 661937311;
                        i = -689399445;
                    } else {
                        iM2761 = C0773.m3169("᩵᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27983) ^ (-217049053);
                        i = -602612108;
                    }
                    i5 = iM2761 ^ i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final void setLocalString(LocalString localString) {
        this.f40638 = localString;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder title(CharSequence charSequence) {
        this.f40639 = charSequence;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01de A[PHI: r9 r14
      0x01de: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:53:0x01dc, B:34:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r14v3 short[]) = (r14v2 short[]), (r14v4 short[]) binds: [B:53:0x01dc, B:34:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025e A[PHI: r8 r19
      0x025e: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x025c, B:57:0x021a, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:65:0x025c, B:57:0x021a, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0289 A[PHI: r3 r6 r7 r11
      0x0289: PHI (r3v4 l.֡᩺֫) = (r3v2 l.֡᩺֫), (r3v3 l.֡᩺֫), (r3v2 l.֡᩺֫), (r3v2 l.֡᩺֫) binds: [B:61:0x023d, B:42:0x015c, B:15:0x0065, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:61:0x023d, B:42:0x015c, B:15:0x0065, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:61:0x023d, B:42:0x015c, B:15:0x0065, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:61:0x023d, B:42:0x015c, B:15:0x0065, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Switch addSwitch(CharSequence charSequence, String str) {
        int iM2761;
        int i;
        int i2;
        str = str;
        int i3 = C2354.f7599;
        int i4 = C4238.f15451;
        int iM2762 = C0619.m2761("᩹ܽ") ^ i3;
        int i5 = ((iM2762 ^ i4) * (-4827)) ^ 1101894909;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2762 ^ 1353205013;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1097803765;
        String strM3780 = null;
        C0752 c0752 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 18043) >> 31));
            switch (i12) {
                case -2104157145:
                case 139538001:
                    C3033.m9845();
                    return null;
                case -2077306479:
                case -115029254:
                    s = sArr[59];
                    i7 = s * s;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ܿᩳ") ^ i4) * (-13);
                        i = ((iM2761 ^ i3) * (-27181)) ^ 134840638;
                        i2 = -987359709;
                    } else {
                        iM2761 = (C0773.m3169("֫ۛ") ^ i3) * (-35);
                        i = ((iM2761 ^ i4) * 31137) ^ 345215063;
                        i2 = 595084618;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1920716049:
                case -7969725:
                    s2 = 3933;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("۫֡") ^ i4) * 109;
                        i = ((iM2761 ^ i3) * 10787) ^ 1771135103;
                        i2 = -1310319576;
                    } else {
                        iM2761 = (C0773.m3169("ܳ۬") ^ i4) * (-61);
                        i = ((iM2761 ^ i3) * 23903) ^ (-576665041);
                        i2 = -1169424823;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1768640338:
                case 686868081:
                    i9 = 49102;
                    iM2761 = (i3 - C0619.m2761("֨ܽ")) * (-3);
                    i = ((iM2761 ^ i4) * 1091) ^ 150644965;
                    i2 = 1845083599;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1510247441:
                case 2106390724:
                    if (C2419.m8174() < 0) {
                        iM2761 = (C0773.m3169("۫֨") + i3) * (-7);
                        i = ((iM2761 ^ i4) * (-8887)) ^ 309540023;
                        i2 = 149549800;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                    i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                    i2 = -602260178;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1393500897:
                case 1313778679:
                    i10 = 60;
                    i11 = 5;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("۫֨") + i3) * (-7);
                        i = ((iM2761 ^ i4) * (-8887)) ^ 309540023;
                        i2 = 149549800;
                    } else {
                        iM2761 = (C0619.m2761("ۚۖ") ^ i4) * 15;
                        i = ((iM2761 ^ i3) * (-12127)) ^ (-149470186);
                        i2 = -809684383;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1329067347:
                case 2108488699:
                    C2288.m7767();
                    if (C3033.f9831 < 0) {
                        iM2761 = (i3 - C0619.m2761("֡ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * 26189) ^ 326814627;
                        i2 = 934350966;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                    i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                    i2 = -602260178;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1164444971:
                case 219552742:
                    strM3780 = C0950.m3780(sArr3, 65, 3, i9);
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i3 - C0619.m2761("֡ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * 26189) ^ 326814627;
                        i2 = 934350966;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۗ") + i4) * (-59);
                        i = ((iM2761 ^ i3) * (-30043)) ^ (-891211467);
                        i2 = -2082432173;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1010022922:
                case -864338983:
                    int i13 = s + s2;
                    if (i8 - (i13 * i13) < 0) {
                        iM2761 = C0773.m3169("ۗܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28929)) ^ 912062430;
                        i2 = 539186881;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۧ")) * (-89);
                        i = ((iM2761 ^ i4) * (-32181)) ^ 1153335803;
                        i2 = -1146241287;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -335084520:
                case 1320082046:
                    c0752.f48739 = charSequence;
                    c0752.f48737 = str;
                    C1519.m5406(this.f40642, c0752);
                    return c0752;
                case -332760106:
                case 1625727995:
                    m31477(str, strM3780);
                    if (C1321.m4852()) {
                        int iM2763 = (i4 - C0619.m2761("ۘܶ")) * (-17);
                        i6 = iM2763 ^ 837059997;
                        i5 = ((iM2763 ^ i3) * (-23705)) ^ (-975847147);
                    } else {
                        iM2761 = (i3 - C0619.m2761("֡ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * 26189) ^ 326814627;
                        i2 = 934350966;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    break;
                case -318424618:
                case 95439533:
                    C3492.m11488();
                    C3690.m11987();
                    iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                    i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                    i2 = -602260178;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -265150589:
                case 1967455764:
                    i9 = 41359;
                    iM2761 = (i3 - C0619.m2761("֨ܽ")) * (-3);
                    i = ((iM2761 ^ i4) * 1091) ^ 150644965;
                    i2 = 1845083599;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 349100454:
                case 1729613715:
                    sArr = f40636;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                        i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                        i2 = -602260178;
                    } else {
                        iM2761 = C0619.m2761("۠ۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-18191)) ^ (-1429975469);
                        i2 = 848900281;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 589019840:
                case 2027412951:
                    c0752 = new C0752();
                    sArr2 = f40636;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("ܿᩳ") ^ i4) * (-13);
                        i = ((iM2761 ^ i3) * (-27181)) ^ 134840638;
                        i2 = -987359709;
                    } else {
                        iM2761 = C0619.m2761("۬ۙ") ^ i3;
                        i = ((iM2761 ^ i4) * 29621) ^ (-1777534964);
                        i2 = -567378166;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1531052231:
                case 2071677274:
                    m31477(charSequence, C2310.m7803(sArr2, i10, i11, i9));
                    sArr3 = f40636;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("۫֡") ^ i4) * 109;
                        i = ((iM2761 ^ i3) * 10787) ^ 1771135103;
                        i2 = -1310319576;
                    } else {
                        iM2761 = (C0619.m2761("ۜۜ") + i3) * 95;
                        i = ((iM2761 ^ i4) * 6597) ^ (-1820186162);
                        i2 = -1629283562;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1617500336:
                case 1860411888:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("ܿᩳ") ^ i4) * (-13);
                        i = ((iM2761 ^ i3) * (-27181)) ^ 134840638;
                        i2 = -987359709;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                    i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                    i2 = -602260178;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1639818826:
                case 1913728724:
                    int i14 = 15468489 + i7;
                    i8 = i14 + i14;
                    if (C1080.m4050()) {
                        iM2761 = C0619.m2761("᩻᩹") ^ i4;
                        i = ((iM2761 ^ i3) * 8611) ^ 1866595769;
                        i2 = 1228019252;
                    } else {
                        iM2761 = (C0773.m3169("ۚ᩵") ^ i3) * 123;
                        i = ((iM2761 ^ i4) * 31805) ^ 138019286;
                        i2 = -602260178;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("ܿᩳ") ^ i4) * (-13);
                        i = ((iM2761 ^ i3) * (-27181)) ^ 134840638;
                        i2 = -987359709;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֨") + i3) * (-51);
                        i = ((iM2761 ^ i4) * (-13611)) ^ 1232407328;
                        i2 = 1537694715;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder subtitle(CharSequence charSequence) {
        this.f40640 = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31477(Object obj, String str) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 113829746;
        int i5 = AbstractC3624.f12429;
        int i6 = C3492.f12043;
        int iM3169 = C0773.m3169("ܶۢ") ^ i6;
        int i7 = ((iM3169 ^ i5) * 3659) ^ 2026756627;
        int i8 = 1152878529;
        while (true) {
            i4 = ((((i4 ^ i5) * 12227) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1944093775:
                case 516172331:
                    C1783.m6232();
                    if (C1564.f5401 > 0) {
                        iM3169 = C0773.m3169("۫ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 7959) ^ (-91422884);
                        i8 = 550713506;
                    } else {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-823)) ^ (-240711731);
                        i8 = 792177807;
                    }
                    break;
                case -1563954982:
                case -1293429817:
                    short[] sArr2 = f40636;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("۫ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 7959) ^ (-91422884);
                        i8 = 550713506;
                    } else if (!C1343.m4943()) {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-823)) ^ (-240711731);
                        i8 = 792177807;
                    } else {
                        String strM13650 = C4282.m13650(sArr2, 1, 9, i3);
                        short[] sArr3 = f40636;
                        if (!RunnableC1848.f6235) {
                            String strM7980 = C2354.m7980(sArr3, 10, 16, i3);
                            if (C3099.f10023 > 0) {
                                throw new NullPointerException(C14442.m34865(strM13650, str, strM7980));
                            }
                        }
                        iM3169 = (i5 - C0773.m3169("᩹֡")) * (-99);
                        i7 = ((iM3169 ^ i6) * 3115) ^ (-1350992336);
                        i8 = 1627159564;
                    }
                    break;
                case -1378689913:
                case 1799278275:
                    if (C3033.m9845() > 0) {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-823)) ^ (-240711731);
                        i8 = 792177807;
                    } else {
                        iM3169 = C0619.m2761("֡֡") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-20253)) ^ (-1969030941);
                        i8 = -339125760;
                    }
                    break;
                case -1314538891:
                case 1414120858:
                    if (obj != null) {
                        iM3169 = (C0619.m2761("᩺᩺") ^ i5) * (-89);
                        i7 = ((iM3169 ^ i6) * (-11389)) ^ 351236438;
                        i8 = -1306458667;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩶") ^ i6) * (-83);
                        i7 = ((iM3169 ^ i5) * (-4691)) ^ 1564064235;
                        i8 = 900432259;
                    }
                    break;
                case -1195258264:
                case 675154387:
                    return;
                case -998512970:
                case 2001461719:
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0619.m2761("۬ܽ") + i6) * (-119);
                        i7 = ((iM3169 ^ i5) * (-28801)) ^ (-2034149382);
                        i8 = 1005156827;
                    } else {
                        iM3169 = C0773.m3169("۫ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 7959) ^ (-91422884);
                        i8 = 550713506;
                    }
                    break;
                case -732909533:
                case -97919226:
                    sArr = f40636;
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0619.m2761("۬ܽ") + i6) * (-119);
                        i7 = ((iM3169 ^ i5) * (-28801)) ^ (-2034149382);
                        i8 = 1005156827;
                    } else {
                        iM3169 = (C0619.m2761("ܺۚ") + i5) * (-67);
                        i7 = ((iM3169 ^ i6) * 27965) ^ 770376767;
                        i8 = -595073427;
                    }
                    break;
                case -597339645:
                case -130059543:
                    C0950.m3785();
                    return;
                case -420254153:
                case 700399536:
                    if (i2 - (s * s2) >= 0) {
                        iM3169 = C0773.m3169("ᩴܽ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 26475) ^ (-731834988);
                        i8 = 84313369;
                    } else {
                        iM3169 = C0773.m3169("᩸ۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 22087) ^ (-188095157);
                        i8 = 992117300;
                    }
                    break;
                case -271913691:
                case 1123508294:
                    s = sArr[c];
                    i = s * s;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i5 - C0773.m3169("᩹֡")) * (-99);
                        i7 = ((iM3169 ^ i6) * 3115) ^ (-1350992336);
                        i8 = 1627159564;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۨ") ^ i6) * 87;
                        i7 = ((iM3169 ^ i5) * 28023) ^ (-1257268169);
                        i8 = -1297529878;
                    }
                    break;
                case -206425422:
                case 395294074:
                    s2 = 27234;
                    if (RunnableC1848.f6235) {
                        iM3169 = (i5 - C0773.m3169("᩹֡")) * (-99);
                        i7 = ((iM3169 ^ i6) * 3115) ^ (-1350992336);
                        i8 = 1627159564;
                    } else {
                        iM3169 = (C0773.m3169("ۖᩴ") ^ i6) * (-99);
                        i7 = ((iM3169 ^ i5) * 14489) ^ 1869651438;
                        i8 = 1846448171;
                    }
                    break;
                case -63505425:
                case 2076918287:
                    c = 0;
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0619.m2761("۬ܽ") + i6) * (-119);
                        i7 = ((iM3169 ^ i5) * (-28801)) ^ (-2034149382);
                        i8 = 1005156827;
                    } else {
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 6183) ^ 1848487596;
                        i8 = 152634518;
                    }
                    break;
                case 385032857:
                case 1881563107:
                    i3 = 33801;
                    iM3169 = C0773.m3169("ܿܰ") ^ i5;
                    i7 = ((iM3169 ^ i6) * (-5325)) ^ (-1440505799);
                    i8 = 530844033;
                    break;
                case 703787824:
                case 1892455068:
                    i3 = 63092;
                    iM3169 = C0773.m3169("ܿܰ") ^ i5;
                    i7 = ((iM3169 ^ i6) * (-5325)) ^ (-1440505799);
                    i8 = 530844033;
                    break;
                case 1017718415:
                case 2060798204:
                    i2 = 185422689 + i;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i5 - C0773.m3169("᩹֡")) * (-99);
                        i7 = ((iM3169 ^ i6) * 3115) ^ (-1350992336);
                        i8 = 1627159564;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩷ۜ")) * 29;
                        i7 = ((iM3169 ^ i6) * (-5605)) ^ (-1940705280);
                        i8 = 1781665187;
                    }
                    break;
                case 1463942500:
                case 1643694834:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("֡֡") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-20253)) ^ (-1969030941);
                        i8 = -339125760;
                    } else {
                        iM3169 = C0619.m2761("᩹֫") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-329)) ^ (-435483198);
                        i8 = -371426915;
                    }
                    break;
                default:
                    C2966.m9664();
                    C1321.m4852();
                    iM3169 = C0619.m2761("֡֡") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-20253)) ^ (-1969030941);
                    i8 = -339125760;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x014f A[PHI: r3 r4 r5
      0x014f: PHI (r3v4 l.᩺᩺֫) = (r3v3 l.᩺᩺֫), (r3v2 l.᩺᩺֫), (r3v2 l.᩺᩺֫) binds: [B:45:0x014d, B:37:0x0108, B:33:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:45:0x014d, B:37:0x0108, B:33:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:45:0x014d, B:37:0x0108, B:33:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[PHI: r8 r11 r12 r13
      0x01e2: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x01e0, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:56:0x01e0, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:56:0x01e0, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:56:0x01e0, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0275 A[PHI: r10
      0x0275: PHI (r10v5 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:66:0x0273, B:41:0x012a, B:11:0x005f, B:89:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (l.C11235.f35427 >= 0) goto L14;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Input addInput(java.lang.CharSequence r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12684.addInput(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$Input");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onPreferenceChange(PluginPreference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f40641 = onPreferenceChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onCreated(PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener) {
        this.f40643 = onPreferenceScreenCreatedListener;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03fb A[PHI: r6 r10 r18
      0x03fb: PHI (r6v41 bin.mt.plugin.api.LocalString) = (r6v30 bin.mt.plugin.api.LocalString), (r6v42 bin.mt.plugin.api.LocalString) binds: [B:110:0x03f9, B:79:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x03fb: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:110:0x03f9, B:79:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x03fb: PHI (r18v23 java.lang.String) = (r18v12 java.lang.String), (r18v24 java.lang.String) binds: [B:110:0x03f9, B:79:0x027f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x04a1 A[PHI: r6 r18
      0x04a1: PHI (r6v58 bin.mt.plugin.api.LocalString) = (r6v26 bin.mt.plugin.api.LocalString), (r6v31 bin.mt.plugin.api.LocalString), (r6v59 bin.mt.plugin.api.LocalString) binds: [B:122:0x049f, B:106:0x03d7, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r18v38 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String), (r18v39 java.lang.String) binds: [B:122:0x049f, B:106:0x03d7, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0203 A[PHI: r2 r15
      0x0203: PHI (r2v83 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v82 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:65:0x01ea, B:56:0x01a4, B:50:0x0165, B:44:0x012d, B:38:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r15v4 java.lang.CharSequence) = 
      (r15v3 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
     binds: [B:65:0x01ea, B:56:0x01a4, B:50:0x0165, B:44:0x012d, B:38:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0341 A[PHI: r6 r18
      0x0341: PHI (r6v36 bin.mt.plugin.api.LocalString) = (r6v35 bin.mt.plugin.api.LocalString), (r6v37 bin.mt.plugin.api.LocalString) binds: [B:94:0x0327, B:91:0x0305] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r18v18 java.lang.String) = (r18v17 java.lang.String), (r18v19 java.lang.String) binds: [B:94:0x0327, B:91:0x0305] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
    
        if (l.C2878.f9462 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (l.C1080.m4050() != false) goto L31;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m31478() {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12684.m31478():java.util.ArrayList");
    }
}
