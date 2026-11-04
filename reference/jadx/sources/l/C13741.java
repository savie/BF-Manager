package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.۬ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes4.dex */
public class C13741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10562 f43603;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f43604;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public short f43605;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f43606;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public short f43607;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f43608;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f43609;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f43610;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7776 f43611;

    public C13741(C10562 c10562, C7776 c7776) {
        this.f43603 = c10562;
        this.f43611 = c7776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33588(C13741 c13741) {
        this.f43610 = c13741.f43610;
        this.f43606 = c13741.f43606;
        this.f43607 = (short) 0;
        this.f43609 = c13741.f43609;
        this.f43608 = c13741.f43608;
        this.f43605 = c13741.f43605;
        this.f43604 = c13741.f43604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33577(C23243 c23243, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m33578(c23243, C3105.m10134((String) obj).m10138(), 0);
        }
        C10562 c10562 = (C10562) obj;
        if ((c10562.f33569 & 4) != 0) {
            return c23243.m52239(c10562.f33559, "") | 12582912;
        }
        return c23243.m52241(c10562) | 16777216;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33578(C23243 c23243, String str, int i) {
        int iM52258;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return c23243.m52258(C1402.m5124(1, i + 1, str)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 == 'F') {
                            iM52258 = 4194306;
                        } else if (cCharAt2 == 'L') {
                            iM52258 = c23243.m52258(C1402.m5124(1, i2 + 1, str)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iM52258 = 4194316;
                        } else if (cCharAt2 == 'Z') {
                            iM52258 = 4194313;
                        } else if (cCharAt2 == 'I') {
                            iM52258 = 4194305;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM52258 = 4194314;
                                    break;
                                case 'C':
                                    iM52258 = 4194315;
                                    break;
                                case 'D':
                                    iM52258 = 4194307;
                                    break;
                                default:
                                    throw new IllegalArgumentException(C25272.m56409("Invalid descriptor fragment: ", str.substring(i2)));
                            }
                        } else {
                            iM52258 = 4194308;
                        }
                        return iM52258 | ((i2 - i) << 26);
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException(C25272.m56409("Invalid descriptor: ", str.substring(i)));
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33589(C23243 c23243, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f43610 = iArr;
        this.f43606 = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = c23243.m52258(c23243.m52260()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C3105 c3105 : C3105.m10135(str)) {
            int iM33578 = m33578(c23243, c3105.m10138(), 0);
            int[] iArr2 = this.f43610;
            int i4 = i3 + 1;
            iArr2[i3] = iM33578;
            if (iM33578 == 4194308 || iM33578 == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f43610[i3] = 4194304;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33590(C23243 c23243, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f43610[i3] = m33577(c23243, objArr[i4]);
            if (objArr[i4] == 4 || objArr[i4] == 3) {
                i3 += 2;
                this.f43610[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f43610;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (objArr2[i7] == 4 || objArr2[i7] == 3) {
                i6++;
            }
        }
        this.f43606 = this.f43611.m21147(i6 + i2);
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f43606[i8] = m33577(c23243, objArr2[i9]);
            if (objArr2[i9] == 4 || objArr2[i9] == 3) {
                i8 += 2;
                this.f43606[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.f43605 = (short) 0;
        this.f43604 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33586() {
        return this.f43606.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m33574(int i) {
        int[] iArr = this.f43609;
        if (iArr == null || i >= iArr.length) {
            return i | 20971520;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 20971520 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33585(int i, int i2) {
        int[] iArr = this.f43609;
        C7776 c7776 = this.f43611;
        if (iArr == null) {
            this.f43609 = c7776.m21147(10);
        }
        int length = this.f43609.length;
        if (i >= length) {
            int[] iArrM21147 = c7776.m21147(Math.max(i + 1, length * 2));
            System.arraycopy(this.f43609, 0, iArrM21147, 0, length);
            this.f43609 = iArrM21147;
        }
        this.f43609[i] = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33582(int i) {
        int[] iArr = this.f43608;
        C7776 c7776 = this.f43611;
        if (iArr == null) {
            this.f43608 = c7776.m21147(10);
        }
        int length = this.f43608.length;
        short s = this.f43605;
        if (s >= length) {
            int[] iArrM21147 = c7776.m21147(Math.max(s + 1, length * 2));
            System.arraycopy(this.f43608, 0, iArrM21147, 0, length);
            this.f43608 = iArrM21147;
        }
        int[] iArr2 = this.f43608;
        short s2 = this.f43605;
        short s3 = (short) (s2 + 1);
        this.f43605 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f43607 + s3);
        C10562 c10562 = this.f43603;
        if (s4 > c10562.f33565) {
            c10562.f33565 = s4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33580(C23243 c23243, String str) {
        int iM33578 = m33578(c23243, str, str.charAt(0) == '(' ? C3105.m10132(str) : 0);
        if (iM33578 != 0) {
            m33582(iM33578);
            if (iM33578 == 4194308 || iM33578 == 4194307) {
                m33582(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m33583() {
        short s = this.f43605;
        if (s > 0) {
            int[] iArr = this.f43608;
            short s2 = (short) (s - 1);
            this.f43605 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f43607 - 1);
        this.f43607 = s3;
        return (-s3) | 25165824;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33584(int i) {
        short s = this.f43605;
        if (s >= i) {
            this.f43605 = (short) (s - i);
        } else {
            this.f43607 = (short) (this.f43607 - (i - s));
            this.f43605 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33579(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m33584((C3105.m10131(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m33584(2);
        } else {
            m33584(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:11:0x0017->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m33576(C23243 c23243, int i) {
        int i2;
        int iM52258;
        int i3;
        int[] iArr = this.f43604;
        if (iArr != null && (i == 4194310 || (i3 = (-4194304) & i) == 12582912 || i3 == 16777216)) {
            int i4 = 0;
            int i5 = iArr[0];
            while (i4 < i5) {
                i4++;
                int i6 = this.f43604[i4];
                int i7 = (-67108864) & i6;
                int i8 = 62914560 & i6;
                int i9 = i6 & 1048575;
                if (i8 == 20971520) {
                    i2 = this.f43610[i9];
                } else {
                    if (i8 == 25165824) {
                        int[] iArr2 = this.f43606;
                        i2 = iArr2[iArr2.length - i9];
                    }
                    if (i == i6) {
                        if (i == 4194310) {
                            iM52258 = c23243.m52258(c23243.m52260());
                        } else {
                            iM52258 = c23243.m52258(c23243.m52255(i & 1048575).f53504);
                        }
                        return iM52258 | 8388608;
                    }
                }
                i6 = i2 + i7;
                if (i == i6) {
                    if (i == 4194310) {
                        iM52258 = c23243.m52258(c23243.m52260());
                    } else {
                        iM52258 = c23243.m52258(c23243.m52255(i & 1048575).f53504);
                    }
                    return iM52258 | 8388608;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:145:0x0243  */
    /* JADX WARN: Code duplicated, block: B:159:0x0283  */
    /* JADX WARN: Code duplicated, block: B:163:0x0297  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX INFO: renamed from: ۙ */
    public void mo24455(int i, int i2, AbstractC16529 abstractC16529, C23243 c23243) {
        switch (i) {
            case 0:
                return;
            case 1:
                m33582(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                m33582(4194305);
                return;
            case 9:
            case 10:
                m33582(4194308);
                m33582(4194304);
                return;
            case 11:
            case 12:
            case 13:
                m33582(4194306);
                return;
            case 14:
            case 15:
                m33582(4194307);
                m33582(4194304);
                return;
            case 18:
                int i3 = abstractC16529.f53505;
                switch (i3) {
                    case 3:
                        m33582(4194305);
                        return;
                    case 4:
                        m33582(4194306);
                        return;
                    case 5:
                        m33582(4194308);
                        m33582(4194304);
                        return;
                    case 6:
                        m33582(4194307);
                        m33582(4194304);
                        return;
                    case 7:
                        m33582(8388608 | c23243.m52258("java/lang/Class"));
                        return;
                    case 8:
                        m33582(8388608 | c23243.m52258("java/lang/String"));
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m33582(8388608 | c23243.m52258("java/lang/invoke/MethodHandle"));
                                return;
                            case 16:
                                m33582(8388608 | c23243.m52258("java/lang/invoke/MethodType"));
                                return;
                            case 17:
                                m33580(c23243, abstractC16529.f53504);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        m33582(4194305);
                        return;
                    case 22:
                        m33582(4194308);
                        m33582(4194304);
                        return;
                    case 23:
                        m33582(4194306);
                        return;
                    case 24:
                        m33582(4194307);
                        m33582(4194304);
                        return;
                    case 25:
                        m33582(m33574(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m33584(2);
                                m33582(4194305);
                                return;
                            case 47:
                                m33584(2);
                                m33582(4194308);
                                m33582(4194304);
                                return;
                            case 48:
                                m33584(2);
                                m33582(4194306);
                                return;
                            case 49:
                                m33584(2);
                                m33582(4194307);
                                m33582(4194304);
                                return;
                            case 50:
                                m33584(1);
                                int iM33583 = m33583();
                                if (iM33583 != 4194309) {
                                    iM33583 -= 67108864;
                                }
                                m33582(iM33583);
                                return;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                m33585(i2, m33583());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM33574 = m33574(i4);
                                    if (iM33574 == 4194308 || iM33574 == 4194307) {
                                        m33585(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iM33574 & 62914560;
                                    if (i5 == 20971520 || i5 == 25165824) {
                                        m33585(i4, iM33574 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                m33584(1);
                                m33585(i2, m33583());
                                m33585(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM33575 = m33574(i6);
                                    if (iM33575 == 4194308 || iM33575 == 4194307) {
                                        m33585(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iM33575 & 62914560;
                                    if (i7 == 20971520 || i7 == 25165824) {
                                        m33585(i6, iM33575 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.K /* 86 */:
                                        m33584(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m33584(4);
                                        return;
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 153:
                                    case EnumC24309.f78687 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                        m33584(2);
                                        return;
                                    case 89:
                                        int iM33584 = m33583();
                                        m33582(iM33584);
                                        m33582(iM33584);
                                        return;
                                    case 90:
                                        int iM33585 = m33583();
                                        int iM33586 = m33583();
                                        m33582(iM33585);
                                        m33582(iM33586);
                                        m33582(iM33585);
                                        return;
                                    case 91:
                                        int iM33587 = m33583();
                                        int iM33588 = m33583();
                                        int iM33589 = m33583();
                                        m33582(iM33587);
                                        m33582(iM33589);
                                        m33582(iM33588);
                                        m33582(iM33587);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        int iM335810 = m33583();
                                        int iM335811 = m33583();
                                        m33582(iM335811);
                                        m33582(iM335810);
                                        m33582(iM335811);
                                        m33582(iM335810);
                                        return;
                                    case 93:
                                        int iM335812 = m33583();
                                        int iM335813 = m33583();
                                        int iM335814 = m33583();
                                        m33582(iM335813);
                                        m33582(iM335812);
                                        m33582(iM335814);
                                        m33582(iM335813);
                                        m33582(iM335812);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        int iM335815 = m33583();
                                        int iM335816 = m33583();
                                        int iM335817 = m33583();
                                        int iM335818 = m33583();
                                        m33582(iM335816);
                                        m33582(iM335815);
                                        m33582(iM335818);
                                        m33582(iM335817);
                                        m33582(iM335816);
                                        m33582(iM335815);
                                        return;
                                    case 95:
                                        int iM335819 = m33583();
                                        int iM335820 = m33583();
                                        m33582(iM335819);
                                        m33582(iM335820);
                                        return;
                                    case 96:
                                    case 100:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case 108:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        m33584(2);
                                        m33582(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m33584(4);
                                        m33582(4194308);
                                        m33582(4194304);
                                        return;
                                    case 98:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case 114:
                                    case 137:
                                    case 144:
                                        m33584(2);
                                        m33582(4194306);
                                        return;
                                    case q.f /* 99 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m33584(4);
                                        m33582(4194307);
                                        m33582(4194304);
                                        return;
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 123:
                                    case q.h /* 125 */:
                                        m33584(3);
                                        m33582(4194308);
                                        m33582(4194304);
                                        return;
                                    case 132:
                                        m33585(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        m33584(1);
                                        m33582(4194308);
                                        m33582(4194304);
                                        return;
                                    case 134:
                                        m33584(1);
                                        m33582(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        m33584(1);
                                        m33582(4194307);
                                        m33582(4194304);
                                        return;
                                    case 138:
                                        m33584(2);
                                        m33582(4194307);
                                        m33582(4194304);
                                        return;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m33584(1);
                                        m33582(4194305);
                                        return;
                                    case 143:
                                        m33584(2);
                                        m33582(4194308);
                                        m33582(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m33584(4);
                                        m33582(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        m33580(c23243, abstractC16529.f53504);
                                        return;
                                    case 179:
                                        m33579(abstractC16529.f53504);
                                        return;
                                    case 180:
                                        m33584(1);
                                        m33580(c23243, abstractC16529.f53504);
                                        return;
                                    case 181:
                                        m33579(abstractC16529.f53504);
                                        m33583();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m33579(abstractC16529.f53504);
                                        if (i != 184) {
                                            int iM335821 = m33583();
                                            if (i == 183 && abstractC16529.f53508.charAt(0) == '<') {
                                                int[] iArr = this.f43604;
                                                C7776 c7776 = this.f43611;
                                                if (iArr == null) {
                                                    this.f43604 = c7776.m21147(3);
                                                }
                                                int[] iArr2 = this.f43604;
                                                int i8 = iArr2[0];
                                                int length = iArr2.length;
                                                int i9 = length - 1;
                                                if (i8 >= i9) {
                                                    int[] iArrM21147 = c7776.m21147(Math.max(i8 + 2, (i9 * 2) + 1));
                                                    System.arraycopy(this.f43604, 0, iArrM21147, 0, length);
                                                    this.f43604 = iArrM21147;
                                                }
                                                int[] iArr3 = this.f43604;
                                                iArr3[i8 + 1] = iM335821;
                                                iArr3[0] = iArr3[0] + 1;
                                            }
                                        }
                                        m33580(c23243, abstractC16529.f53504);
                                        return;
                                    case 186:
                                        m33579(abstractC16529.f53504);
                                        m33580(c23243, abstractC16529.f53504);
                                        return;
                                    case 187:
                                        m33582(c23243.m52239(i2, abstractC16529.f53504) | 12582912);
                                        return;
                                    case 188:
                                        m33583();
                                        switch (i2) {
                                            case 4:
                                                m33582(71303177);
                                                return;
                                            case 5:
                                                m33582(71303179);
                                                return;
                                            case 6:
                                                m33582(71303170);
                                                return;
                                            case 7:
                                                m33582(71303171);
                                                return;
                                            case 8:
                                                m33582(71303178);
                                                return;
                                            case 9:
                                                m33582(71303180);
                                                return;
                                            case 10:
                                                m33582(71303169);
                                                return;
                                            case 11:
                                                m33582(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = abstractC16529.f53504;
                                        m33583();
                                        if (str.charAt(0) == '[') {
                                            m33580(c23243, "[".concat(str));
                                            return;
                                        } else {
                                            m33582(c23243.m52258(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = abstractC16529.f53504;
                                        m33583();
                                        if (str2.charAt(0) == '[') {
                                            m33580(c23243, str2);
                                            return;
                                        } else {
                                            m33582(c23243.m52258(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m33584(i2);
                                                m33580(c23243, abstractC16529.f53504);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m33584(1);
                                return;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m33575(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f43610[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f43606[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33591(C23243 c23243, C13741 c13741, int i) {
        boolean zM33581;
        int iM33576;
        int i2;
        int length = this.f43610.length;
        int length2 = this.f43606.length;
        int[] iArr = c13741.f43610;
        C7776 c7776 = this.f43611;
        boolean zM33582 = true;
        int i3 = 0;
        if (iArr == null) {
            c13741.f43610 = c7776.m21147(length);
            zM33581 = true;
        } else {
            zM33581 = false;
        }
        int i4 = 0;
        while (i4 < length) {
            int[] iArr2 = this.f43609;
            if (iArr2 == null || i4 >= iArr2.length || (i2 = iArr2[i4]) == 0) {
                iM33576 = this.f43610[i4];
            } else {
                iM33576 = m33575(i2, length2);
            }
            if (this.f43604 != null) {
                iM33576 = m33576(c23243, iM33576);
            }
            zM33581 |= m33581(c23243, iM33576, c13741.f43610, i4);
            i4++;
        }
        if (i > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                zM33581 |= m33581(c23243, this.f43610[i5], c13741.f43610, i5);
            }
            if (c13741.f43606 == null) {
                c13741.f43606 = c7776.m21147(1);
            } else {
                zM33582 = zM33581;
            }
            boolean zM33583 = m33581(c23243, i, c13741.f43606, 0) | zM33582;
            c7776.m21148((length + 1 + length) * 50);
            return zM33583;
        }
        int length3 = this.f43606.length + this.f43607;
        if (c13741.f43606 == null) {
            c13741.f43606 = c7776.m21147(this.f43605 + length3);
        } else {
            zM33582 = zM33581;
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int iM33577 = this.f43606[i6];
            if (this.f43604 != null) {
                iM33577 = m33576(c23243, iM33577);
            }
            zM33582 |= m33581(c23243, iM33577, c13741.f43606, i6);
        }
        int i7 = length + length3;
        while (true) {
            short s = this.f43605;
            if (i3 < s) {
                int iM33575 = m33575(this.f43608[i3], length2);
                if (this.f43604 != null) {
                    iM33575 = m33576(c23243, iM33575);
                }
                zM33582 |= m33581(c23243, iM33575, c13741.f43606, length3 + i3);
                i3++;
            } else {
                c7776.m21148((i7 + s) * 50);
                return zM33582;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33581(C23243 c23243, int i, int[] iArr, int i2) {
        int iMin;
        int iM52258;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iM52238 = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & 62914560) == 8388608) {
                    if (i5 != 0 && (i & 62914560) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | 8388608;
                    iM52258 = c23243.m52258("java/lang/Object");
                    iM52238 = iMin | iM52258;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iM52238 = (i & (-67108864)) | 8388608 | c23243.m52238(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iM52258 = c23243.m52258("java/lang/Object");
                iM52238 = iMin | iM52258;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iM52238 = i;
        }
        if (iM52238 == i3) {
            return false;
        }
        iArr[i2] = iM52238;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33587(C12800 c12800) {
        int i;
        int[] iArr = this.f43610;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            int i5 = 0;
            do {
                int i6 = 2;
                if (i3 >= iArr.length) {
                    break loop0;
                }
                i = iArr[i3];
                if (i != 4194308 && i != 4194307) {
                    i6 = 1;
                }
                i3 += i6;
                i5++;
            } while (i == 4194304);
            i4 += i5;
        }
        int[] iArr2 = this.f43606;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c12800.m31738(this.f43603.f33559, i4, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c12800.m31746(i10, i13);
            i4 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 > 0) {
                int i15 = iArr2[i2];
                i2 += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
                c12800.m31746(i10, i15);
                i10++;
                i8 = i14;
            } else {
                c12800.m31742();
                return;
            }
        }
    }
}
