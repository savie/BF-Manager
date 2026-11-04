package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.۟᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BGI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8112 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C21537 f26778 = new C21537();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22460 f26779;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9230 f26780;

    public C8112(C22460 c22460, C9230 c9230) {
        if (c9230 == null) {
            throw new NullPointerException("pool == null");
        }
        this.f26779 = c22460;
        this.f26780 = c9230;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21999() {
        return this.f26779.m50636();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21997() {
        return this.f26779.m50636() + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21998(int i, InterfaceC0654 interfaceC0654) {
        C22460 c22460 = this.f26779;
        if (interfaceC0654 == null) {
            interfaceC0654 = f26778;
        }
        InterfaceC0654 interfaceC0655 = interfaceC0654;
        try {
            int iM50642 = c22460.m50642(i);
            C14823.m35693(iM50642);
            C9230 c9230 = this.f26780;
            switch (iM50642) {
                case 0:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17731);
                    return 1;
                case 1:
                    interfaceC0655.mo2862(18, i, 1, C20419.f65422, 0);
                    return 1;
                case 2:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51767, -1);
                    return 1;
                case 3:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51773, 0);
                    return 1;
                case 4:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51771, 1);
                    return 1;
                case 5:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51766, 2);
                    return 1;
                case 6:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51768, 3);
                    return 1;
                case 7:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51772, 4);
                    return 1;
                case 8:
                    interfaceC0655.mo2862(18, i, 1, C15943.f51770, 5);
                    return 1;
                case 9:
                    interfaceC0655.mo2862(18, i, 1, C4011.f13701, 0);
                    return 1;
                case 10:
                    interfaceC0655.mo2862(18, i, 1, C4011.f13700, 0);
                    return 1;
                case 11:
                    interfaceC0655.mo2862(18, i, 1, C17435.f56701, 0);
                    return 1;
                case 12:
                    interfaceC0655.mo2862(18, i, 1, C17435.f56700, 0);
                    return 1;
                case 13:
                    interfaceC0655.mo2862(18, i, 1, C17435.f56699, 0);
                    return 1;
                case 14:
                    interfaceC0655.mo2862(18, i, 1, C11468.f36058, 0);
                    return 1;
                case 15:
                    interfaceC0655.mo2862(18, i, 1, C11468.f36057, 0);
                    return 1;
                case 16:
                    int iM50637 = c22460.m50637(i + 1);
                    interfaceC0655.mo2862(18, i, 2, C15943.m37967(iM50637), iM50637);
                    return 2;
                case 17:
                    int iM50644 = c22460.m50644(i + 1);
                    interfaceC0655.mo2862(18, i, 3, C15943.m37967(iM50644), iM50644);
                    return 3;
                case 18:
                    AbstractC13487 abstractC13487 = c9230.get(c22460.m50642(i + 1));
                    interfaceC0655.mo2862(18, i, 2, abstractC13487, abstractC13487 instanceof C15943 ? ((C15943) abstractC13487).mo17877() : 0);
                    return 2;
                case 19:
                    AbstractC13487 abstractC13488 = c9230.get(c22460.m50641(i + 1));
                    interfaceC0655.mo2862(18, i, 3, abstractC13488, abstractC13488 instanceof C15943 ? ((C15943) abstractC13488).mo17877() : 0);
                    return 3;
                case 20:
                    interfaceC0655.mo2862(20, i, 3, c9230.get(c22460.m50641(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC0655.mo2861(21, i, 2, c22460.m50642(i + 1), C5085.f17753, 0);
                    return 2;
                case 22:
                    interfaceC0655.mo2861(21, i, 2, c22460.m50642(i + 1), C5085.f17732, 0);
                    return 2;
                case 23:
                    interfaceC0655.mo2861(21, i, 2, c22460.m50642(i + 1), C5085.f17729, 0);
                    return 2;
                case 24:
                    interfaceC0655.mo2861(21, i, 2, c22460.m50642(i + 1), C5085.f17751, 0);
                    return 2;
                case 25:
                    interfaceC0655.mo2861(21, i, 2, c22460.m50642(i + 1), C5085.f17733, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC0655.mo2861(21, i, 1, iM50642 - 26, C5085.f17753, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC0655.mo2861(21, i, 1, iM50642 - 30, C5085.f17732, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC0655.mo2861(21, i, 1, iM50642 - 34, C5085.f17729, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC0655.mo2861(21, i, 1, iM50642 - 38, C5085.f17751, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    interfaceC0655.mo2861(21, i, 1, iM50642 - 42, C5085.f17733, 0);
                    return 1;
                case 46:
                    interfaceC0655.mo2864(46, i, C5085.f17753);
                    return 1;
                case 47:
                    interfaceC0655.mo2864(46, i, C5085.f17732);
                    return 1;
                case 48:
                    interfaceC0655.mo2864(46, i, C5085.f17729);
                    return 1;
                case 49:
                    interfaceC0655.mo2864(46, i, C5085.f17751);
                    return 1;
                case 50:
                    interfaceC0655.mo2864(46, i, C5085.f17733);
                    return 1;
                case 51:
                    interfaceC0655.mo2864(46, i, C5085.f17740);
                    return 1;
                case 52:
                    interfaceC0655.mo2864(46, i, C5085.f17734);
                    return 1;
                case 53:
                    interfaceC0655.mo2864(46, i, C5085.f17726);
                    return 1;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    interfaceC0655.mo2861(54, i, 2, c22460.m50642(i + 1), C5085.f17753, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    interfaceC0655.mo2861(54, i, 2, c22460.m50642(i + 1), C5085.f17732, 0);
                    return 2;
                case 56:
                    interfaceC0655.mo2861(54, i, 2, c22460.m50642(i + 1), C5085.f17729, 0);
                    return 2;
                case 57:
                    interfaceC0655.mo2861(54, i, 2, c22460.m50642(i + 1), C5085.f17751, 0);
                    return 2;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    interfaceC0655.mo2861(54, i, 2, c22460.m50642(i + 1), C5085.f17733, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                case 61:
                case 62:
                    interfaceC0655.mo2861(54, i, 1, iM50642 - 59, C5085.f17753, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    interfaceC0655.mo2861(54, i, 1, iM50642 - 63, C5085.f17732, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC0655.mo2861(54, i, 1, iM50642 - 67, C5085.f17729, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC0655.mo2861(54, i, 1, iM50642 - 71, C5085.f17751, 0);
                    return 1;
                case 75:
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 77:
                case 78:
                    interfaceC0655.mo2861(54, i, 1, iM50642 - 75, C5085.f17733, 0);
                    return 1;
                case 79:
                    interfaceC0655.mo2864(79, i, C5085.f17753);
                    return 1;
                case 80:
                    interfaceC0655.mo2864(79, i, C5085.f17732);
                    return 1;
                case 81:
                    interfaceC0655.mo2864(79, i, C5085.f17729);
                    return 1;
                case 82:
                    interfaceC0655.mo2864(79, i, C5085.f17751);
                    return 1;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    interfaceC0655.mo2864(79, i, C5085.f17733);
                    return 1;
                case 84:
                    interfaceC0655.mo2864(79, i, C5085.f17740);
                    return 1;
                case 85:
                    interfaceC0655.mo2864(79, i, C5085.f17734);
                    return 1;
                case HRSS1373Polynomial.K /* 86 */:
                    interfaceC0655.mo2864(79, i, C5085.f17726);
                    return 1;
                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17731);
                    return 1;
                case 96:
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 116:
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17753);
                    return 1;
                case 97:
                case 101:
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                case 109:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                case 123:
                case q.h /* 125 */:
                case 127:
                case 129:
                case 131:
                    interfaceC0655.mo2864(iM50642 - 1, i, C5085.f17732);
                    return 1;
                case 98:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case 114:
                case 118:
                    interfaceC0655.mo2864(iM50642 - 2, i, C5085.f17729);
                    return 1;
                case q.f /* 99 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case 115:
                case 119:
                    interfaceC0655.mo2864(iM50642 - 3, i, C5085.f17751);
                    return 1;
                case 132:
                    interfaceC0655.mo2861(iM50642, i, 3, c22460.m50642(i + 1), C5085.f17753, c22460.m50637(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17732);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17729);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17751);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17753);
                    return 1;
                case 153:
                case EnumC24309.f78687 /* 154 */:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    interfaceC0655.mo2860(iM50642, i, 3, c22460.m50644(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC0655.mo2861(iM50642, i, 2, c22460.m50642(i + 1), C5085.f17759, 0);
                    return 2;
                case 170:
                    return m21996(i, interfaceC0655);
                case 171:
                    return m21995(i, interfaceC0655);
                case 172:
                    interfaceC0655.mo2864(172, i, C5085.f17753);
                    return 1;
                case 173:
                    interfaceC0655.mo2864(172, i, C5085.f17732);
                    return 1;
                case 174:
                    interfaceC0655.mo2864(172, i, C5085.f17729);
                    return 1;
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    interfaceC0655.mo2864(172, i, C5085.f17751);
                    return 1;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    interfaceC0655.mo2864(172, i, C5085.f17733);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC0655.mo2864(iM50642, i, C5085.f17731);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    interfaceC0655.mo2862(iM50642, i, 3, c9230.get(c22460.m50641(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC0655.mo2862(iM50642, i, 5, c9230.get(c22460.m50641(i + 1)), (c22460.m50642(i + 4) << 8) | c22460.m50642(i + 3));
                    return 5;
                case 186:
                    interfaceC0655.mo2862(iM50642, i, 5, (C3265) c9230.get(c22460.m50641(i + 1)), 0);
                    return 5;
                case 188:
                    return m21993(i, interfaceC0655);
                case 196:
                    return m21994(i, interfaceC0655);
                case 197:
                    interfaceC0655.mo2862(iM50642, i, 4, c9230.get(c22460.m50641(i + 1)), c22460.m50642(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC0655.mo2860(iM50642 == 200 ? 167 : 168, i, 5, c22460.m50643(i + 1) + i);
                    return 5;
                default:
                    interfaceC0655.mo2859(iM50642, i);
                    return 1;
            }
        } catch (C16074 e) {
            e.m12508("...at bytecode offset ".concat(C5306.m15938(i)));
            throw e;
        } catch (RuntimeException e2) {
            C16074 c16074 = new C16074(null, e2);
            c16074.m12508("...at bytecode offset ".concat(C5306.m15938(i)));
            throw c16074;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m21996(int i, InterfaceC0654 interfaceC0654) {
        C22460 c22460;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM50642 = 0;
        while (true) {
            c22460 = this.f26779;
            if (i3 >= i2) {
                break;
            }
            iM50642 = (iM50642 << 8) | c22460.m50642(i3);
            i3++;
        }
        int iM50643 = c22460.m50643(i2) + i;
        int iM50644 = c22460.m50643(i2 + 4);
        int iM50645 = c22460.m50643(i2 + 8);
        int i4 = (iM50645 - iM50644) + 1;
        int i5 = i2 + 12;
        if (iM50644 > iM50645) {
            throw new C16074("low / high inversion", null);
        }
        C20550 c20550 = new C20550(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM50646 = c22460.m50643(i5) + i;
            i5 += 4;
            c20550.add(iM50644 + i6, iM50646);
        }
        c20550.m47114(iM50643);
        c20550.m47110();
        c20550.mo15005();
        int i7 = i5 - i;
        interfaceC0654.mo2865(i, i7, c20550, iM50642);
        return i7;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m21995(int i, InterfaceC0654 interfaceC0654) {
        C22460 c22460;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM50642 = 0;
        while (true) {
            c22460 = this.f26779;
            if (i3 >= i2) {
                break;
            }
            iM50642 = (iM50642 << 8) | c22460.m50642(i3);
            i3++;
        }
        int iM50643 = c22460.m50643(i2) + i;
        int iM50644 = c22460.m50643(i2 + 4);
        int i4 = i2 + 8;
        C20550 c20550 = new C20550(iM50644);
        for (int i5 = 0; i5 < iM50644; i5++) {
            int iM50645 = c22460.m50643(i4);
            int iM50646 = c22460.m50643(i4 + 4) + i;
            i4 += 8;
            c20550.add(iM50645, iM50646);
        }
        c20550.m47114(iM50643);
        c20550.m47110();
        c20550.mo15005();
        int i6 = i4 - i;
        interfaceC0654.mo2865(i, i6, c20550, iM50642);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m21993(int i, InterfaceC0654 interfaceC0654) {
        C1028 c1028;
        int i2;
        C22460 c22460 = this.f26779;
        int iM50642 = c22460.m50642(i + 1);
        switch (iM50642) {
            case 4:
                c1028 = C1028.f3715;
                break;
            case 5:
                c1028 = C1028.f3716;
                break;
            case 6:
                c1028 = C1028.f3721;
                break;
            case 7:
                c1028 = C1028.f3718;
                break;
            case 8:
                c1028 = C1028.f3732;
                break;
            case 9:
                c1028 = C1028.f3728;
                break;
            case 10:
                c1028 = C1028.f3719;
                break;
            case 11:
                c1028 = C1028.f3726;
                break;
            default:
                throw new C16074("bad newarray code ".concat(C5306.m15936(iM50642)), null);
        }
        int iMo2858 = interfaceC0654.mo2858();
        C18553 c18553 = new C18553();
        int i3 = 0;
        if (iMo2858 >= 0) {
            m21998(iMo2858, c18553);
            if ((c18553.f60282 instanceof C15943) && c18553.f60281 + iMo2858 == i) {
                i2 = c18553.f60283;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i4 = i + 2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            while (true) {
                int i5 = i4 + 1;
                if (c22460.m50642(i4) == 89) {
                    m21998(i5, c18553);
                    int i6 = c18553.f60281;
                    if (i6 != 0 && (c18553.f60282 instanceof C15943) && c18553.f60283 == i3) {
                        int i7 = i5 + i6;
                        m21998(i7, c18553);
                        int i8 = c18553.f60281;
                        if (i8 != 0) {
                            AbstractC13487 abstractC13487 = c18553.f60282;
                            if (abstractC13487 instanceof AbstractC24149) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC13487);
                                int i10 = i9 + 1;
                                int iM50643 = c22460.m50642(i9);
                                switch (iM50642) {
                                    case 4:
                                    case 8:
                                        if (iM50643 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM50643 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM50643 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM50643 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM50643 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM50643 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM50643 == 80) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 < 2 || i3 != i2) {
            interfaceC0654.mo2863(i, 2, c1028, (ArrayList) null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC0654.mo2863(i, i11, c1028, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m21994(int i, InterfaceC0654 interfaceC0654) {
        C22460 c22460 = this.f26779;
        int iM50642 = c22460.m50642(i + 1);
        int iM50641 = c22460.m50641(i + 2);
        if (iM50642 == 132) {
            interfaceC0654.mo2861(iM50642, i, 6, iM50641, C5085.f17753, c22460.m50644(i + 4));
            return 6;
        }
        if (iM50642 != 169) {
            switch (iM50642) {
                case 21:
                    interfaceC0654.mo2861(21, i, 4, iM50641, C5085.f17753, 0);
                    return 4;
                case 22:
                    interfaceC0654.mo2861(21, i, 4, iM50641, C5085.f17732, 0);
                    return 4;
                case 23:
                    interfaceC0654.mo2861(21, i, 4, iM50641, C5085.f17729, 0);
                    return 4;
                case 24:
                    interfaceC0654.mo2861(21, i, 4, iM50641, C5085.f17751, 0);
                    return 4;
                case 25:
                    interfaceC0654.mo2861(21, i, 4, iM50641, C5085.f17733, 0);
                    return 4;
                default:
                    switch (iM50642) {
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            interfaceC0654.mo2861(54, i, 4, iM50641, C5085.f17753, 0);
                            return 4;
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            interfaceC0654.mo2861(54, i, 4, iM50641, C5085.f17732, 0);
                            return 4;
                        case 56:
                            interfaceC0654.mo2861(54, i, 4, iM50641, C5085.f17729, 0);
                            return 4;
                        case 57:
                            interfaceC0654.mo2861(54, i, 4, iM50641, C5085.f17751, 0);
                            return 4;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            interfaceC0654.mo2861(54, i, 4, iM50641, C5085.f17733, 0);
                            return 4;
                        default:
                            interfaceC0654.mo2859(196, i);
                            return 1;
                    }
            }
        }
        interfaceC0654.mo2861(iM50642, i, 4, iM50641, C5085.f17759, 0);
        return 4;
    }
}
