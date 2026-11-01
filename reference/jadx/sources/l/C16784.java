package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܽܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T41H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3836 f53763;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C16576 f53762 = new C16576();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Integer f53761 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Integer f53760 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Integer f53759 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16784 m39433(C12343 c12343) {
        C16576 c16576 = f53762;
        C16784 c16784 = (C16784) c12343.m30656(c16576);
        if (c16784 != null) {
            return c16784;
        }
        C16784 c16785 = new C16784();
        c12343.m30659(c16576, c16785);
        c16785.f53763 = C3836.m11131(c12343);
        return c16785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m39432(boolean z) {
        return z ? f53759 : f53760;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39434(int i, AbstractC16579 abstractC16579) {
        C3836 c3836 = this.f53763;
        try {
            Object objMo24292 = abstractC16579.mo24292();
            if (i == 0) {
                return abstractC16579;
            }
            if (i == 257) {
                return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() == 0));
            }
            if (i == 130) {
                return c3836.f14232.mo1930(Integer.valueOf(~((Number) objMo24292).intValue()));
            }
            if (i == 131) {
                return c3836.f14264.mo1930(Long.valueOf(~((Number) objMo24292).longValue()));
            }
            switch (i) {
                case 116:
                    return c3836.f14232.mo1930(Integer.valueOf(-((Number) objMo24292).intValue()));
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    return c3836.f14264.mo1930(Long.valueOf(-((Number) objMo24292).longValue()));
                case 118:
                    return c3836.f14256.mo1930(Float.valueOf(-((Number) objMo24292).floatValue()));
                case 119:
                    return c3836.f14291.mo1930(Double.valueOf(-((Number) objMo24292).doubleValue()));
                default:
                    switch (i) {
                        case 153:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() == 0));
                        case EnumC2300.f8185 /* 154 */:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() != 0));
                        case 155:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() < 0));
                        case 156:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() >= 0));
                        case 157:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() > 0));
                        case 158:
                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() <= 0));
                        default:
                            return null;
                    }
            }
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x049b A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x04b3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x04cb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x04e3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04fb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39435(int i, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C3836 c3836 = this.f53763;
        try {
            if (i > 511) {
                AbstractC16579 abstractC16579M39435 = m39435(i >> 9, abstractC16579, abstractC165710);
                return abstractC16579M39435.mo24292() == null ? abstractC16579M39435 : m39434(i & SecP521R1Field.P16, abstractC16579M39435);
            }
            Object objMo24292 = abstractC16579.mo24292();
            Object objMo24293 = abstractC165710.mo24292();
            if (i == 256) {
                return c3836.f14220.mo1930(abstractC16579.mo9478() + abstractC165710.mo9478());
            }
            if (i == 258) {
                return c3836.f14263.mo1930(m39432((((Number) objMo24292).intValue() & ((Number) objMo24293).intValue()) != 0));
            }
            if (i == 259) {
                return c3836.f14263.mo1930(m39432((((Number) objMo24292).intValue() | ((Number) objMo24293).intValue()) != 0));
            }
            switch (i) {
                case 96:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() + ((Number) objMo24293).intValue()));
                case 97:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() + ((Number) objMo24293).longValue()));
                case 98:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue() + ((Number) objMo24293).floatValue()));
                case q.f /* 99 */:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue() + ((Number) objMo24293).doubleValue()));
                case 100:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() - ((Number) objMo24293).intValue()));
                case 101:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() - ((Number) objMo24293).longValue()));
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue() - ((Number) objMo24293).floatValue()));
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue() - ((Number) objMo24293).doubleValue()));
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() * ((Number) objMo24293).intValue()));
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() * ((Number) objMo24293).longValue()));
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue() * ((Number) objMo24293).floatValue()));
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue() * ((Number) objMo24293).doubleValue()));
                case 108:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() / ((Number) objMo24293).intValue()));
                case 109:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() / ((Number) objMo24293).longValue()));
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue() / ((Number) objMo24293).floatValue()));
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue() / ((Number) objMo24293).doubleValue()));
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() % ((Number) objMo24293).intValue()));
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() % ((Number) objMo24293).longValue()));
                case 114:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue() % ((Number) objMo24293).floatValue()));
                case 115:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue() % ((Number) objMo24293).doubleValue()));
                default:
                    switch (i) {
                        case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                            return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() << ((Number) objMo24293).intValue()));
                        case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() << ((Number) objMo24293).intValue()));
                        case 122:
                            return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() >> ((Number) objMo24293).intValue()));
                        case 123:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() >> ((Number) objMo24293).intValue()));
                        case 124:
                            return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() >>> ((Number) objMo24293).intValue()));
                        case q.h /* 125 */:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() >>> ((Number) objMo24293).intValue()));
                        case 126:
                            return (abstractC16579.m39001(EnumC6617.BOOLEAN) ? c3836.f14263 : c3836.f14232).mo1930(Integer.valueOf(((Number) objMo24292).intValue() & ((Number) objMo24293).intValue()));
                        case 127:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() & ((Number) objMo24293).longValue()));
                        case 128:
                            return (abstractC16579.m39001(EnumC6617.BOOLEAN) ? c3836.f14263 : c3836.f14232).mo1930(Integer.valueOf(((Number) objMo24292).intValue() | ((Number) objMo24293).intValue()));
                        case 129:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() | ((Number) objMo24293).longValue()));
                        case 130:
                            return (abstractC16579.m39001(EnumC6617.BOOLEAN) ? c3836.f14263 : c3836.f14232).mo1930(Integer.valueOf(((Number) objMo24292).intValue() ^ ((Number) objMo24293).intValue()));
                        case 131:
                            return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() ^ ((Number) objMo24293).longValue()));
                        default:
                            Integer num = f53760;
                            Integer num2 = f53759;
                            Integer num3 = f53761;
                            switch (i) {
                                case 148:
                                    if (((Number) objMo24292).longValue() < ((Number) objMo24293).longValue()) {
                                        return c3836.f14232.mo1930(num3);
                                    }
                                    return ((Number) objMo24292).longValue() > ((Number) objMo24293).longValue() ? c3836.f14232.mo1930(num2) : c3836.f14232.mo1930(num);
                                case 149:
                                case 150:
                                    if (((Number) objMo24292).floatValue() < ((Number) objMo24293).floatValue()) {
                                        return c3836.f14232.mo1930(num3);
                                    }
                                    if (((Number) objMo24292).floatValue() > ((Number) objMo24293).floatValue()) {
                                        return c3836.f14232.mo1930(num2);
                                    }
                                    if (((Number) objMo24292).floatValue() == ((Number) objMo24293).floatValue()) {
                                        return c3836.f14232.mo1930(num);
                                    }
                                    return i == 150 ? c3836.f14232.mo1930(num2) : c3836.f14232.mo1930(num3);
                                case 151:
                                case 152:
                                    if (((Number) objMo24292).doubleValue() < ((Number) objMo24293).doubleValue()) {
                                        return c3836.f14232.mo1930(num3);
                                    }
                                    if (((Number) objMo24292).doubleValue() > ((Number) objMo24293).doubleValue()) {
                                        return c3836.f14232.mo1930(num2);
                                    }
                                    if (((Number) objMo24292).doubleValue() == ((Number) objMo24293).doubleValue()) {
                                        return c3836.f14232.mo1930(num);
                                    }
                                    return i == 152 ? c3836.f14232.mo1930(num2) : c3836.f14232.mo1930(num3);
                                default:
                                    switch (i) {
                                        case 159:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() == ((Number) objMo24293).intValue()));
                                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() != ((Number) objMo24293).intValue()));
                                        case 161:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() < ((Number) objMo24293).intValue()));
                                        case 162:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() >= ((Number) objMo24293).intValue()));
                                        case 163:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() > ((Number) objMo24293).intValue()));
                                        case 164:
                                            return c3836.f14263.mo1930(m39432(((Number) objMo24292).intValue() <= ((Number) objMo24293).intValue()));
                                        case 165:
                                            return c3836.f14263.mo1930(m39432(objMo24292.equals(objMo24293)));
                                        case 166:
                                            return c3836.f14263.mo1930(m39432(!objMo24292.equals(objMo24293)));
                                        default:
                                            switch (i) {
                                                case BottomAppBarTopEdgeTreatment.ANGLE_UP /* 270 */:
                                                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() << ((Number) objMo24293).intValue()));
                                                case 271:
                                                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() << ((Number) objMo24293).intValue()));
                                                case 272:
                                                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() >> ((Number) objMo24293).intValue()));
                                                case 273:
                                                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue() >> ((Number) objMo24293).intValue()));
                                                case 274:
                                                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue() >>> ((Number) objMo24293).intValue()));
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39436(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C3836 c3836 = this.f53763;
        if (abstractC16579.f53222.f77449 == abstractC165710.f53222.f77449) {
            return abstractC16579;
        }
        if (abstractC16579.mo9484()) {
            Object objMo24292 = abstractC16579.mo24292();
            switch (C0555.f2330[abstractC165710.mo1933().ordinal()]) {
                case 1:
                    return c3836.f14271.mo1930(Integer.valueOf((byte) ((Number) objMo24292).intValue()));
                case 2:
                    return c3836.f14294.mo1930(Integer.valueOf((char) ((Number) objMo24292).intValue()));
                case 3:
                    return c3836.f14225.mo1930(Integer.valueOf((short) ((Number) objMo24292).intValue()));
                case 4:
                    return c3836.f14232.mo1930(Integer.valueOf(((Number) objMo24292).intValue()));
                case 5:
                    return c3836.f14264.mo1930(Long.valueOf(((Number) objMo24292).longValue()));
                case 6:
                    return c3836.f14256.mo1930(Float.valueOf(((Number) objMo24292).floatValue()));
                case 7:
                    return c3836.f14291.mo1930(Double.valueOf(((Number) objMo24292).doubleValue()));
            }
        }
        return abstractC165710;
    }
}
