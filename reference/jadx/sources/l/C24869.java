package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩻ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1XV */
/* JADX INFO: loaded from: classes.dex */
public final class C24869 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55395(InterfaceC23331 interfaceC23331, boolean z, InterfaceC11442 interfaceC11442) {
        switch (C1748.f5958[interfaceC23331.mo30864().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                interfaceC11442.mo2552(((InterfaceC12142) interfaceC23331).mo1542());
                return;
            case 22:
                int iMo1542 = ((InterfaceC12142) interfaceC23331).mo1542();
                if (z) {
                    interfaceC11442.mo2552(iMo1542);
                }
                interfaceC11442.mo2553(iMo1542);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo1542);
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                int iMo1543 = ((InterfaceC12142) interfaceC23331).mo1542();
                interfaceC11442.mo2552(iMo1543);
                interfaceC11442.mo2555(iMo1543 + 1);
                return;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                interfaceC11442.mo2553(((InterfaceC12142) interfaceC23331).mo1542());
                return;
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                int iMo1544 = ((InterfaceC12142) interfaceC23331).mo1542();
                interfaceC11442.mo2553(iMo1544);
                interfaceC11442.mo2554(iMo1544 + 1);
                return;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
                InterfaceC18109 interfaceC18109 = (InterfaceC18109) interfaceC23331;
                int iMo1545 = interfaceC18109.mo1542();
                int iMo1541 = interfaceC18109.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo1545);
                    interfaceC11442.mo2555(iMo1545 + 1);
                }
                interfaceC11442.mo2553(iMo1541);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo1545);
                interfaceC11442.mo2555(iMo1545 + 1);
                return;
            case 62:
            case 63:
            case 64:
                InterfaceC18109 interfaceC181010 = (InterfaceC18109) interfaceC23331;
                int iMo1546 = interfaceC181010.mo1542();
                int iMo1547 = interfaceC181010.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo1546);
                    interfaceC11442.mo2555(iMo1546 + 1);
                }
                interfaceC11442.mo2553(iMo1546);
                int i = iMo1546 + 1;
                interfaceC11442.mo2553(i);
                interfaceC11442.mo2553(iMo1547);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo1546);
                interfaceC11442.mo2555(i);
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                InterfaceC18109 interfaceC181011 = (InterfaceC18109) interfaceC23331;
                int iMo1548 = interfaceC181011.mo1542();
                int iMo1549 = interfaceC181011.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo1548);
                    interfaceC11442.mo2555(iMo1548 + 1);
                }
                interfaceC11442.mo2553(iMo1549);
                interfaceC11442.mo2554(iMo1549 + 1);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo1548);
                interfaceC11442.mo2555(iMo1548 + 1);
                return;
            case 73:
            case 74:
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
            case 85:
                InterfaceC18109 interfaceC181012 = (InterfaceC18109) interfaceC23331;
                int iMo15410 = interfaceC181012.mo1542();
                int iMo15411 = interfaceC181012.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo15410);
                    interfaceC11442.mo2555(iMo15410 + 1);
                }
                interfaceC11442.mo2553(iMo15410);
                int i2 = iMo15410 + 1;
                interfaceC11442.mo2554(i2);
                interfaceC11442.mo2553(iMo15411);
                interfaceC11442.mo2554(iMo15411 + 1);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15410);
                interfaceC11442.mo2555(i2);
                return;
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
            case 88:
            case 89:
            case 90:
            case 91:
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
            case 95:
            case 96:
            case 97:
            case 98:
            case q.f /* 99 */:
            case 100:
            case 101:
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
            case 108:
            case 109:
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
            case 114:
            case 115:
            case 116:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
            case 118:
            case 119:
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
            case 122:
            case 123:
            case 124:
            case q.h /* 125 */:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                InterfaceC18109 interfaceC181013 = (InterfaceC18109) interfaceC23331;
                int iMo15412 = interfaceC181013.mo1542();
                int iMo15413 = interfaceC181013.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo15412);
                }
                interfaceC11442.mo2553(iMo15413);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15412);
                return;
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                InterfaceC18109 interfaceC181014 = (InterfaceC18109) interfaceC23331;
                int iMo15414 = interfaceC181014.mo1542();
                int iMo15415 = interfaceC181014.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo15414);
                }
                interfaceC11442.mo2553(iMo15414);
                interfaceC11442.mo2553(iMo15415);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15414);
                return;
            case 152:
            case 153:
            case EnumC24309.f78687 /* 154 */:
            case 155:
                InterfaceC18109 interfaceC181015 = (InterfaceC18109) interfaceC23331;
                int iMo15416 = interfaceC181015.mo1542();
                int iMo15417 = interfaceC181015.mo1541();
                if (z) {
                    interfaceC11442.mo2552(iMo15416);
                }
                interfaceC11442.mo2553(iMo15417);
                interfaceC11442.mo2554(iMo15417 + 1);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15416);
                return;
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                InterfaceC18109 interfaceC181016 = (InterfaceC18109) interfaceC23331;
                int iMo15418 = interfaceC181016.mo1542();
                int iMo15419 = interfaceC181016.mo1541();
                interfaceC11442.mo2553(iMo15418);
                interfaceC11442.mo2553(iMo15419);
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
                InterfaceC18109 interfaceC181017 = (InterfaceC18109) interfaceC23331;
                int iMo15420 = interfaceC181017.mo1542();
                int iMo15421 = interfaceC181017.mo1541();
                interfaceC11442.mo2553(iMo15420);
                interfaceC11442.mo2554(iMo15420 + 1);
                interfaceC11442.mo2553(iMo15421);
                return;
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                InterfaceC21093 interfaceC21093 = (InterfaceC21093) interfaceC23331;
                int iMo15422 = interfaceC21093.mo1542();
                int iMo15423 = interfaceC21093.mo1541();
                int iMo8187 = interfaceC21093.mo8187();
                if (z) {
                    interfaceC11442.mo2552(iMo15422);
                    interfaceC11442.mo2555(iMo15422 + 1);
                }
                interfaceC11442.mo2553(iMo15423);
                interfaceC11442.mo2554(iMo15423 + 1);
                interfaceC11442.mo2553(iMo8187);
                interfaceC11442.mo2554(iMo8187 + 1);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15422);
                interfaceC11442.mo2555(iMo15422 + 1);
                return;
            case 192:
                InterfaceC21093 interfaceC21094 = (InterfaceC21093) interfaceC23331;
                int iMo15424 = interfaceC21094.mo1542();
                int iMo15425 = interfaceC21094.mo1541();
                int iMo8188 = interfaceC21094.mo8187();
                if (z) {
                    interfaceC11442.mo2552(iMo15424);
                    interfaceC11442.mo2555(iMo15424 + 1);
                }
                interfaceC11442.mo2553(iMo15425);
                interfaceC11442.mo2553(iMo8188);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15424);
                interfaceC11442.mo2555(iMo15424 + 1);
                return;
            case 193:
            case 194:
            case 195:
                InterfaceC21093 interfaceC21095 = (InterfaceC21093) interfaceC23331;
                int iMo15426 = interfaceC21095.mo1542();
                int iMo15427 = interfaceC21095.mo1541();
                int iMo8189 = interfaceC21095.mo8187();
                if (z) {
                    interfaceC11442.mo2552(iMo15426);
                    interfaceC11442.mo2555(iMo15426 + 1);
                }
                interfaceC11442.mo2553(iMo15427);
                interfaceC11442.mo2554(iMo15427 + 1);
                interfaceC11442.mo2553(iMo8189);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15426);
                interfaceC11442.mo2555(iMo15426 + 1);
                return;
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
            case 218:
            case 219:
                InterfaceC21093 interfaceC21096 = (InterfaceC21093) interfaceC23331;
                int iMo15428 = interfaceC21096.mo1542();
                int iMo15429 = interfaceC21096.mo1541();
                int iMo81810 = interfaceC21096.mo8187();
                if (z) {
                    interfaceC11442.mo2552(iMo15428);
                }
                interfaceC11442.mo2553(iMo15429);
                interfaceC11442.mo2553(iMo81810);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15428);
                return;
            case 220:
            case 221:
            case 222:
                InterfaceC21093 interfaceC21097 = (InterfaceC21093) interfaceC23331;
                int iMo15430 = interfaceC21097.mo1542();
                int iMo15431 = interfaceC21097.mo1541();
                int iMo81811 = interfaceC21097.mo8187();
                if (z) {
                    interfaceC11442.mo2552(iMo15430);
                }
                interfaceC11442.mo2553(iMo15431);
                interfaceC11442.mo2554(iMo15431 + 1);
                interfaceC11442.mo2553(iMo81811);
                interfaceC11442.mo2554(iMo81811 + 1);
                if (z) {
                    return;
                }
                interfaceC11442.mo2552(iMo15430);
                return;
            case 223:
            case BERTags.FLAGS /* 224 */:
            case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
            case 226:
            case 227:
            case 228:
                InterfaceC21093 interfaceC21098 = (InterfaceC21093) interfaceC23331;
                int iMo15432 = interfaceC21098.mo1542();
                int iMo15433 = interfaceC21098.mo1541();
                int iMo81812 = interfaceC21098.mo8187();
                interfaceC11442.mo2553(iMo15432);
                interfaceC11442.mo2553(iMo15433);
                interfaceC11442.mo2553(iMo81812);
                return;
            case 229:
                InterfaceC21093 interfaceC21099 = (InterfaceC21093) interfaceC23331;
                int iMo15434 = interfaceC21099.mo1542();
                int iMo15435 = interfaceC21099.mo1541();
                int iMo81813 = interfaceC21099.mo8187();
                interfaceC11442.mo2553(iMo15434);
                interfaceC11442.mo2554(iMo15434 + 1);
                interfaceC11442.mo2553(iMo15435);
                interfaceC11442.mo2553(iMo81813);
                return;
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
                InterfaceC16617 interfaceC16617 = (InterfaceC16617) interfaceC23331;
                int iMo1655 = interfaceC16617.mo1655();
                if (iMo1655 == 1) {
                    interfaceC11442.mo2553(interfaceC16617.mo7063());
                    return;
                }
                if (iMo1655 == 2) {
                    interfaceC11442.mo2553(interfaceC16617.mo7063());
                    interfaceC11442.mo2553(interfaceC16617.mo7065());
                    return;
                }
                if (iMo1655 == 3) {
                    interfaceC11442.mo2553(interfaceC16617.mo7063());
                    interfaceC11442.mo2553(interfaceC16617.mo7065());
                    interfaceC11442.mo2553(interfaceC16617.mo7061());
                    return;
                } else {
                    if (iMo1655 == 4) {
                        interfaceC11442.mo2553(interfaceC16617.mo7063());
                        interfaceC11442.mo2553(interfaceC16617.mo7065());
                        interfaceC11442.mo2553(interfaceC16617.mo7061());
                        interfaceC11442.mo2553(interfaceC16617.mo7062());
                        return;
                    }
                    if (iMo1655 != 5) {
                        return;
                    }
                    interfaceC11442.mo2553(interfaceC16617.mo7063());
                    interfaceC11442.mo2553(interfaceC16617.mo7065());
                    interfaceC11442.mo2553(interfaceC16617.mo7061());
                    interfaceC11442.mo2553(interfaceC16617.mo7062());
                    interfaceC11442.mo2553(interfaceC16617.mo7064());
                    return;
                }
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
                InterfaceC24077 interfaceC24077 = (InterfaceC24077) interfaceC23331;
                int iMo2772 = interfaceC24077.mo2772();
                int iMo1656 = interfaceC24077.mo1655();
                for (int i3 = 0; i3 < iMo1656; i3++) {
                    interfaceC11442.mo2553(iMo2772 + i3);
                }
                return;
            default:
                if ((interfaceC23331 instanceof InterfaceC12142) || (interfaceC23331 instanceof InterfaceC0210)) {
                    throw new RuntimeException(interfaceC23331.mo30864().toString());
                }
                return;
        }
    }
}
