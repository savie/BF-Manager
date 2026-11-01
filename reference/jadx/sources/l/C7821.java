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

/* JADX INFO: renamed from: l.۠֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes3.dex */
public class C7821 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public short f25743;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f25744;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C9938 f25745;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25746;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f25747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f25748;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public short f25749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f25750;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f25751;

    public C7821(C9938 c9938) {
        this.f25745 = c9938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20639(C7821 c7821) {
        this.f25748 = c7821.f25748;
        this.f25744 = c7821.f25744;
        this.f25743 = (short) 0;
        this.f25747 = c7821.f25747;
        this.f25751 = c7821.f25751;
        this.f25749 = c7821.f25749;
        this.f25746 = c7821.f25746;
        this.f25750 = c7821.f25750;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20628(C23344 c23344, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m20629(c23344, C14172.m34261((String) obj).m34268(), 0);
        }
        C9938 c9938 = (C9938) obj;
        if ((c9938.f33932 & 4) != 0) {
            return c23344.m51444(c9938.f33927, "") | 12582912;
        }
        return c23344.m51446(c9938) | 16777216;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20629(C23344 c23344, String str, int i) {
        int iM51460;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return c23344.m51460(C20630.m46498(1, i + 1, str)) | 8388608;
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
                            iM51460 = 4194306;
                        } else if (cCharAt2 == 'L') {
                            iM51460 = c23344.m51460(C20630.m46498(1, i2 + 1, str)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iM51460 = 4194316;
                        } else if (cCharAt2 == 'Z') {
                            iM51460 = 4194313;
                        } else if (cCharAt2 == 'I') {
                            iM51460 = 4194305;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM51460 = 4194314;
                                    break;
                                case 'C':
                                    iM51460 = 4194315;
                                    break;
                                case 'D':
                                    iM51460 = 4194307;
                                    break;
                                default:
                                    throw new IllegalArgumentException(C0252.m1693("Invalid descriptor fragment: ", str.substring(i2)));
                            }
                        } else {
                            iM51460 = 4194308;
                        }
                        return iM51460 | ((i2 - i) << 26);
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException(C0252.m1693("Invalid descriptor: ", str.substring(i)));
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20641(C23344 c23344, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f25748 = iArr;
        this.f25744 = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = c23344.m51460(c23344.m51465()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C14172 c14172 : C14172.m34264(str)) {
            int iM20629 = m20629(c23344, c14172.m34268(), 0);
            int[] iArr2 = this.f25748;
            int i4 = i3 + 1;
            iArr2[i3] = iM20629;
            if (iM20629 == 4194308 || iM20629 == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f25748[i3] = 4194304;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20642(C23344 c23344, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f25748[i3] = m20628(c23344, objArr[i4]);
            if (objArr[i4] == 4 || objArr[i4] == 3) {
                i3 += 2;
                this.f25748[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f25748;
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
        this.f25744 = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f25744[i8] = m20628(c23344, objArr2[i9]);
            if (objArr2[i9] == 4 || objArr2[i9] == 3) {
                i8 += 2;
                this.f25744[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.f25749 = (short) 0;
        this.f25746 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20637() {
        return this.f25744.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20625(int i) {
        int[] iArr = this.f25747;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20636(int i, int i2) {
        if (this.f25747 == null) {
            this.f25747 = new int[10];
        }
        int length = this.f25747.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f25747, 0, iArr, 0, length);
            this.f25747 = iArr;
        }
        this.f25747[i] = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m20633(int i) {
        if (this.f25751 == null) {
            this.f25751 = new int[10];
        }
        int length = this.f25751.length;
        short s = this.f25749;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f25751, 0, iArr, 0, length);
            this.f25751 = iArr;
        }
        int[] iArr2 = this.f25751;
        short s2 = this.f25749;
        short s3 = (short) (s2 + 1);
        this.f25749 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f25743 + s3);
        C9938 c9938 = this.f25745;
        if (s4 > c9938.f33933) {
            c9938.f33933 = s4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20631(C23344 c23344, String str) {
        int iM20629 = m20629(c23344, str, str.charAt(0) == '(' ? C14172.m34257(str) : 0);
        if (iM20629 != 0) {
            m20633(iM20629);
            if (iM20629 == 4194308 || iM20629 == 4194307) {
                m20633(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m20634() {
        short s = this.f25749;
        if (s > 0) {
            int[] iArr = this.f25751;
            short s2 = (short) (s - 1);
            this.f25749 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f25743 - 1);
        this.f25743 = s3;
        return (-s3) | 25165824;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20635(int i) {
        short s = this.f25749;
        if (s >= i) {
            this.f25749 = (short) (s - i);
        } else {
            this.f25743 = (short) (this.f25743 - (i - s));
            this.f25749 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20630(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m20635((C14172.m34262(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m20635(2);
        } else {
            m20635(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[LOOP:0: B:9:0x0011->B:25:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x003a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20627(C23344 c23344, int i) {
        int i2;
        int iM51460;
        int i3;
        if (i == 4194310 || (i3 = (-4194304) & i) == 12582912 || i3 == 16777216) {
            for (int i4 = 0; i4 < this.f25746; i4++) {
                int i5 = this.f25750[i4];
                int i6 = (-67108864) & i5;
                int i7 = 62914560 & i5;
                int i8 = i5 & 1048575;
                if (i7 == 20971520) {
                    i2 = this.f25748[i8];
                } else {
                    if (i7 == 25165824) {
                        int[] iArr = this.f25744;
                        i2 = iArr[iArr.length - i8];
                    }
                    if (i == i5) {
                        if (i == 4194310) {
                            iM51460 = c23344.m51460(c23344.m51465());
                        } else {
                            iM51460 = c23344.m51460(c23344.m51462(i & 1048575).f54330);
                        }
                        return iM51460 | 8388608;
                    }
                }
                i5 = i2 + i6;
                if (i == i5) {
                    if (i == 4194310) {
                        iM51460 = c23344.m51460(c23344.m51465());
                    } else {
                        iM51460 = c23344.m51460(c23344.m51462(i & 1048575).f54330);
                    }
                    return iM51460 | 8388608;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0228  */
    /* JADX WARN: Code duplicated, block: B:145:0x0239  */
    /* JADX WARN: Code duplicated, block: B:159:0x0279  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20638(int i, int i2, AbstractC16993 abstractC16993, C23344 c23344) {
        switch (i) {
            case 0:
                return;
            case 1:
                m20633(4194309);
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
                m20633(4194305);
                return;
            case 9:
            case 10:
                m20633(4194308);
                m20633(4194304);
                return;
            case 11:
            case 12:
            case 13:
                m20633(4194306);
                return;
            case 14:
            case 15:
                m20633(4194307);
                m20633(4194304);
                return;
            case 18:
                int i3 = abstractC16993.f54336;
                switch (i3) {
                    case 3:
                        m20633(4194305);
                        return;
                    case 4:
                        m20633(4194306);
                        return;
                    case 5:
                        m20633(4194308);
                        m20633(4194304);
                        return;
                    case 6:
                        m20633(4194307);
                        m20633(4194304);
                        return;
                    case 7:
                        m20633(8388608 | c23344.m51460("java/lang/Class"));
                        return;
                    case 8:
                        m20633(8388608 | c23344.m51460("java/lang/String"));
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m20633(8388608 | c23344.m51460("java/lang/invoke/MethodHandle"));
                                return;
                            case 16:
                                m20633(8388608 | c23344.m51460("java/lang/invoke/MethodType"));
                                return;
                            case 17:
                                m20631(c23344, abstractC16993.f54330);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        m20633(4194305);
                        return;
                    case 22:
                        m20633(4194308);
                        m20633(4194304);
                        return;
                    case 23:
                        m20633(4194306);
                        return;
                    case 24:
                        m20633(4194307);
                        m20633(4194304);
                        return;
                    case 25:
                        m20633(m20625(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m20635(2);
                                m20633(4194305);
                                return;
                            case 47:
                                m20635(2);
                                m20633(4194308);
                                m20633(4194304);
                                return;
                            case 48:
                                m20635(2);
                                m20633(4194306);
                                return;
                            case 49:
                                m20635(2);
                                m20633(4194307);
                                m20633(4194304);
                                return;
                            case 50:
                                m20635(1);
                                int iM20634 = m20634();
                                if (iM20634 != 4194309) {
                                    iM20634 -= 67108864;
                                }
                                m20633(iM20634);
                                return;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                m20636(i2, m20634());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM20625 = m20625(i4);
                                    if (iM20625 == 4194308 || iM20625 == 4194307) {
                                        m20636(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iM20625 & 62914560;
                                    if (i5 == 20971520 || i5 == 25165824) {
                                        m20636(i4, iM20625 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                m20635(1);
                                m20636(i2, m20634());
                                m20636(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM20626 = m20625(i6);
                                    if (iM20626 == 4194308 || iM20626 == 4194307) {
                                        m20636(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iM20626 & 62914560;
                                    if (i7 == 20971520 || i7 == 25165824) {
                                        m20636(i6, iM20626 | 1048576);
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
                                        m20635(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m20635(4);
                                        return;
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 153:
                                    case EnumC2300.f8185 /* 154 */:
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
                                        m20635(2);
                                        return;
                                    case 89:
                                        int iM20635 = m20634();
                                        m20633(iM20635);
                                        m20633(iM20635);
                                        return;
                                    case 90:
                                        int iM20636 = m20634();
                                        int iM20637 = m20634();
                                        m20633(iM20636);
                                        m20633(iM20637);
                                        m20633(iM20636);
                                        return;
                                    case 91:
                                        int iM20638 = m20634();
                                        int iM20639 = m20634();
                                        int iM206310 = m20634();
                                        m20633(iM20638);
                                        m20633(iM206310);
                                        m20633(iM20639);
                                        m20633(iM20638);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        int iM206311 = m20634();
                                        int iM206312 = m20634();
                                        m20633(iM206312);
                                        m20633(iM206311);
                                        m20633(iM206312);
                                        m20633(iM206311);
                                        return;
                                    case 93:
                                        int iM206313 = m20634();
                                        int iM206314 = m20634();
                                        int iM206315 = m20634();
                                        m20633(iM206314);
                                        m20633(iM206313);
                                        m20633(iM206315);
                                        m20633(iM206314);
                                        m20633(iM206313);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        int iM206316 = m20634();
                                        int iM206317 = m20634();
                                        int iM206318 = m20634();
                                        int iM206319 = m20634();
                                        m20633(iM206317);
                                        m20633(iM206316);
                                        m20633(iM206319);
                                        m20633(iM206318);
                                        m20633(iM206317);
                                        m20633(iM206316);
                                        return;
                                    case 95:
                                        int iM206320 = m20634();
                                        int iM206321 = m20634();
                                        m20633(iM206320);
                                        m20633(iM206321);
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
                                        m20635(2);
                                        m20633(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m20635(4);
                                        m20633(4194308);
                                        m20633(4194304);
                                        return;
                                    case 98:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case 114:
                                    case 137:
                                    case 144:
                                        m20635(2);
                                        m20633(4194306);
                                        return;
                                    case q.f /* 99 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m20635(4);
                                        m20633(4194307);
                                        m20633(4194304);
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
                                        m20635(3);
                                        m20633(4194308);
                                        m20633(4194304);
                                        return;
                                    case 132:
                                        m20636(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        m20635(1);
                                        m20633(4194308);
                                        m20633(4194304);
                                        return;
                                    case 134:
                                        m20635(1);
                                        m20633(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        m20635(1);
                                        m20633(4194307);
                                        m20633(4194304);
                                        return;
                                    case 138:
                                        m20635(2);
                                        m20633(4194307);
                                        m20633(4194304);
                                        return;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m20635(1);
                                        m20633(4194305);
                                        return;
                                    case 143:
                                        m20635(2);
                                        m20633(4194308);
                                        m20633(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m20635(4);
                                        m20633(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        m20631(c23344, abstractC16993.f54330);
                                        return;
                                    case 179:
                                        m20630(abstractC16993.f54330);
                                        return;
                                    case 180:
                                        m20635(1);
                                        m20631(c23344, abstractC16993.f54330);
                                        return;
                                    case 181:
                                        m20630(abstractC16993.f54330);
                                        m20634();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m20630(abstractC16993.f54330);
                                        if (i != 184) {
                                            int iM206322 = m20634();
                                            if (i == 183 && abstractC16993.f54331.charAt(0) == '<') {
                                                if (this.f25750 == null) {
                                                    this.f25750 = new int[2];
                                                }
                                                int length = this.f25750.length;
                                                int i8 = this.f25746;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f25750, 0, iArr, 0, length);
                                                    this.f25750 = iArr;
                                                }
                                                int[] iArr2 = this.f25750;
                                                int i9 = this.f25746;
                                                this.f25746 = i9 + 1;
                                                iArr2[i9] = iM206322;
                                            }
                                        }
                                        m20631(c23344, abstractC16993.f54330);
                                        return;
                                    case 186:
                                        m20630(abstractC16993.f54330);
                                        m20631(c23344, abstractC16993.f54330);
                                        return;
                                    case 187:
                                        m20633(c23344.m51444(i2, abstractC16993.f54330) | 12582912);
                                        return;
                                    case 188:
                                        m20634();
                                        switch (i2) {
                                            case 4:
                                                m20633(71303177);
                                                return;
                                            case 5:
                                                m20633(71303179);
                                                return;
                                            case 6:
                                                m20633(71303170);
                                                return;
                                            case 7:
                                                m20633(71303171);
                                                return;
                                            case 8:
                                                m20633(71303178);
                                                return;
                                            case 9:
                                                m20633(71303180);
                                                return;
                                            case 10:
                                                m20633(71303169);
                                                return;
                                            case 11:
                                                m20633(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = abstractC16993.f54330;
                                        m20634();
                                        if (str.charAt(0) == '[') {
                                            m20631(c23344, "[".concat(str));
                                            return;
                                        } else {
                                            m20633(c23344.m51460(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = abstractC16993.f54330;
                                        m20634();
                                        if (str2.charAt(0) == '[') {
                                            m20631(c23344, str2);
                                            return;
                                        } else {
                                            m20633(c23344.m51460(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m20635(i2);
                                                m20631(c23344, abstractC16993.f54330);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m20635(1);
                                return;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20626(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f25748[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f25744[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20643(C23344 c23344, C7821 c7821, int i) {
        boolean zM20632;
        int iM20627;
        int i2;
        int length = this.f25748.length;
        int length2 = this.f25744.length;
        boolean zM20633 = true;
        if (c7821.f25748 == null) {
            c7821.f25748 = new int[length];
            zM20632 = true;
        } else {
            zM20632 = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.f25747;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                iM20627 = this.f25748[i3];
            } else {
                iM20627 = m20626(i2, length2);
            }
            if (this.f25750 != null) {
                iM20627 = m20627(c23344, iM20627);
            }
            zM20632 |= m20632(c23344, iM20627, c7821.f25748, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zM20632 |= m20632(c23344, this.f25748[i4], c7821.f25748, i4);
            }
            if (c7821.f25744 == null) {
                c7821.f25744 = new int[1];
            } else {
                zM20633 = zM20632;
            }
            return m20632(c23344, i, c7821.f25744, 0) | zM20633;
        }
        int length3 = this.f25744.length + this.f25743;
        if (c7821.f25744 == null) {
            c7821.f25744 = new int[this.f25749 + length3];
        } else {
            zM20633 = zM20632;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int iM20628 = this.f25744[i5];
            if (this.f25750 != null) {
                iM20628 = m20627(c23344, iM20628);
            }
            zM20633 |= m20632(c23344, iM20628, c7821.f25744, i5);
        }
        for (int i6 = 0; i6 < this.f25749; i6++) {
            int iM20626 = m20626(this.f25751[i6], length2);
            if (this.f25750 != null) {
                iM20626 = m20627(c23344, iM20626);
            }
            zM20633 |= m20632(c23344, iM20626, c7821.f25744, length3 + i6);
        }
        return zM20633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20632(C23344 c23344, int i, int[] iArr, int i2) {
        int iMin;
        int iM51460;
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
        int iM51443 = 4194304;
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
                    iM51460 = c23344.m51460("java/lang/Object");
                    iM51443 = iMin | iM51460;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iM51443 = (i & (-67108864)) | 8388608 | c23344.m51443(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iM51460 = c23344.m51460("java/lang/Object");
                iM51443 = iMin | iM51460;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iM51443 = i;
        }
        if (iM51443 == i3) {
            return false;
        }
        iArr[i2] = iM51443;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20640(C15583 c15583) {
        int i;
        int[] iArr = this.f25748;
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
        int[] iArr2 = this.f25744;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c15583.m37232(this.f25745.f33927, i4, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c15583.m37236(i10, i13);
            i4 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 > 0) {
                int i15 = iArr2[i2];
                i2 += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
                c15583.m37236(i10, i15);
                i10++;
                i8 = i14;
            } else {
                c15583.m37230();
                return;
            }
        }
    }
}
