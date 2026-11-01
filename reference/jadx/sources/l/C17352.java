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

/* JADX INFO: renamed from: l.ܿ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K1XV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17352 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40379(InterfaceC1594 interfaceC1594, boolean z, InterfaceC12414 interfaceC12414) {
        switch (C16647.f53373[interfaceC1594.mo5435().ordinal()]) {
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
                interfaceC12414.mo1606(((InterfaceC4685) interfaceC1594).mo1140());
                return;
            case 22:
                int iMo1140 = ((InterfaceC4685) interfaceC1594).mo1140();
                if (z) {
                    interfaceC12414.mo1606(iMo1140);
                }
                interfaceC12414.mo1609(iMo1140);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo1140);
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                int iMo1141 = ((InterfaceC4685) interfaceC1594).mo1140();
                interfaceC12414.mo1606(iMo1141);
                interfaceC12414.mo1605(iMo1141 + 1);
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
                interfaceC12414.mo1609(((InterfaceC4685) interfaceC1594).mo1140());
                return;
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                int iMo1142 = ((InterfaceC4685) interfaceC1594).mo1140();
                interfaceC12414.mo1609(iMo1142);
                interfaceC12414.mo1610(iMo1142 + 1);
                return;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
                InterfaceC1157 interfaceC1157 = (InterfaceC1157) interfaceC1594;
                int iMo1143 = interfaceC1157.mo1140();
                int iMo1144 = interfaceC1157.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo1143);
                    interfaceC12414.mo1605(iMo1143 + 1);
                }
                interfaceC12414.mo1609(iMo1144);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo1143);
                interfaceC12414.mo1605(iMo1143 + 1);
                return;
            case 62:
            case 63:
            case 64:
                InterfaceC1157 interfaceC1158 = (InterfaceC1157) interfaceC1594;
                int iMo1145 = interfaceC1158.mo1140();
                int iMo1146 = interfaceC1158.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo1145);
                    interfaceC12414.mo1605(iMo1145 + 1);
                }
                interfaceC12414.mo1609(iMo1145);
                int i = iMo1145 + 1;
                interfaceC12414.mo1609(i);
                interfaceC12414.mo1609(iMo1146);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo1145);
                interfaceC12414.mo1605(i);
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                InterfaceC1157 interfaceC1159 = (InterfaceC1157) interfaceC1594;
                int iMo1147 = interfaceC1159.mo1140();
                int iMo1148 = interfaceC1159.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo1147);
                    interfaceC12414.mo1605(iMo1147 + 1);
                }
                interfaceC12414.mo1609(iMo1148);
                interfaceC12414.mo1610(iMo1148 + 1);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo1147);
                interfaceC12414.mo1605(iMo1147 + 1);
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
                InterfaceC1157 interfaceC11510 = (InterfaceC1157) interfaceC1594;
                int iMo1149 = interfaceC11510.mo1140();
                int iMo11410 = interfaceC11510.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo1149);
                    interfaceC12414.mo1605(iMo1149 + 1);
                }
                interfaceC12414.mo1609(iMo1149);
                int i2 = iMo1149 + 1;
                interfaceC12414.mo1610(i2);
                interfaceC12414.mo1609(iMo11410);
                interfaceC12414.mo1610(iMo11410 + 1);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo1149);
                interfaceC12414.mo1605(i2);
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
                InterfaceC1157 interfaceC11511 = (InterfaceC1157) interfaceC1594;
                int iMo11411 = interfaceC11511.mo1140();
                int iMo11412 = interfaceC11511.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo11411);
                }
                interfaceC12414.mo1609(iMo11412);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11411);
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
                InterfaceC1157 interfaceC11512 = (InterfaceC1157) interfaceC1594;
                int iMo11413 = interfaceC11512.mo1140();
                int iMo11414 = interfaceC11512.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo11413);
                }
                interfaceC12414.mo1609(iMo11413);
                interfaceC12414.mo1609(iMo11414);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11413);
                return;
            case 152:
            case 153:
            case EnumC2300.f8185 /* 154 */:
            case 155:
                InterfaceC1157 interfaceC11513 = (InterfaceC1157) interfaceC1594;
                int iMo11415 = interfaceC11513.mo1140();
                int iMo11416 = interfaceC11513.mo1144();
                if (z) {
                    interfaceC12414.mo1606(iMo11415);
                }
                interfaceC12414.mo1609(iMo11416);
                interfaceC12414.mo1610(iMo11416 + 1);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11415);
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
                InterfaceC1157 interfaceC11514 = (InterfaceC1157) interfaceC1594;
                int iMo11417 = interfaceC11514.mo1140();
                int iMo11418 = interfaceC11514.mo1144();
                interfaceC12414.mo1609(iMo11417);
                interfaceC12414.mo1609(iMo11418);
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
                InterfaceC1157 interfaceC11515 = (InterfaceC1157) interfaceC1594;
                int iMo11419 = interfaceC11515.mo1140();
                int iMo11420 = interfaceC11515.mo1144();
                interfaceC12414.mo1609(iMo11419);
                interfaceC12414.mo1610(iMo11419 + 1);
                interfaceC12414.mo1609(iMo11420);
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
                InterfaceC22325 interfaceC22325 = (InterfaceC22325) interfaceC1594;
                int iMo11421 = interfaceC22325.mo1140();
                int iMo11422 = interfaceC22325.mo1144();
                int iMo26898 = interfaceC22325.mo26898();
                if (z) {
                    interfaceC12414.mo1606(iMo11421);
                    interfaceC12414.mo1605(iMo11421 + 1);
                }
                interfaceC12414.mo1609(iMo11422);
                interfaceC12414.mo1610(iMo11422 + 1);
                interfaceC12414.mo1609(iMo26898);
                interfaceC12414.mo1610(iMo26898 + 1);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11421);
                interfaceC12414.mo1605(iMo11421 + 1);
                return;
            case 192:
                InterfaceC22325 interfaceC22326 = (InterfaceC22325) interfaceC1594;
                int iMo11423 = interfaceC22326.mo1140();
                int iMo11424 = interfaceC22326.mo1144();
                int iMo26899 = interfaceC22326.mo26898();
                if (z) {
                    interfaceC12414.mo1606(iMo11423);
                    interfaceC12414.mo1605(iMo11423 + 1);
                }
                interfaceC12414.mo1609(iMo11424);
                interfaceC12414.mo1609(iMo26899);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11423);
                interfaceC12414.mo1605(iMo11423 + 1);
                return;
            case 193:
            case 194:
            case 195:
                InterfaceC22325 interfaceC22327 = (InterfaceC22325) interfaceC1594;
                int iMo11425 = interfaceC22327.mo1140();
                int iMo11426 = interfaceC22327.mo1144();
                int iMo268910 = interfaceC22327.mo26898();
                if (z) {
                    interfaceC12414.mo1606(iMo11425);
                    interfaceC12414.mo1605(iMo11425 + 1);
                }
                interfaceC12414.mo1609(iMo11426);
                interfaceC12414.mo1610(iMo11426 + 1);
                interfaceC12414.mo1609(iMo268910);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11425);
                interfaceC12414.mo1605(iMo11425 + 1);
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
                InterfaceC22325 interfaceC22328 = (InterfaceC22325) interfaceC1594;
                int iMo11427 = interfaceC22328.mo1140();
                int iMo11428 = interfaceC22328.mo1144();
                int iMo268911 = interfaceC22328.mo26898();
                if (z) {
                    interfaceC12414.mo1606(iMo11427);
                }
                interfaceC12414.mo1609(iMo11428);
                interfaceC12414.mo1609(iMo268911);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11427);
                return;
            case 220:
            case 221:
            case 222:
                InterfaceC22325 interfaceC22329 = (InterfaceC22325) interfaceC1594;
                int iMo11429 = interfaceC22329.mo1140();
                int iMo11430 = interfaceC22329.mo1144();
                int iMo268912 = interfaceC22329.mo26898();
                if (z) {
                    interfaceC12414.mo1606(iMo11429);
                }
                interfaceC12414.mo1609(iMo11430);
                interfaceC12414.mo1610(iMo11430 + 1);
                interfaceC12414.mo1609(iMo268912);
                interfaceC12414.mo1610(iMo268912 + 1);
                if (z) {
                    return;
                }
                interfaceC12414.mo1606(iMo11429);
                return;
            case 223:
            case BERTags.FLAGS /* 224 */:
            case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
            case 226:
            case 227:
            case 228:
                InterfaceC22325 interfaceC223210 = (InterfaceC22325) interfaceC1594;
                int iMo11431 = interfaceC223210.mo1140();
                int iMo11432 = interfaceC223210.mo1144();
                int iMo268913 = interfaceC223210.mo26898();
                interfaceC12414.mo1609(iMo11431);
                interfaceC12414.mo1609(iMo11432);
                interfaceC12414.mo1609(iMo268913);
                return;
            case 229:
                InterfaceC22325 interfaceC223211 = (InterfaceC22325) interfaceC1594;
                int iMo11433 = interfaceC223211.mo1140();
                int iMo11434 = interfaceC223211.mo1144();
                int iMo268914 = interfaceC223211.mo26898();
                interfaceC12414.mo1609(iMo11433);
                interfaceC12414.mo1610(iMo11433 + 1);
                interfaceC12414.mo1609(iMo11434);
                interfaceC12414.mo1609(iMo268914);
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
                InterfaceC10768 interfaceC10768 = (InterfaceC10768) interfaceC1594;
                int iMo2107 = interfaceC10768.mo2107();
                if (iMo2107 == 1) {
                    interfaceC12414.mo1609(interfaceC10768.mo3085());
                    return;
                }
                if (iMo2107 == 2) {
                    interfaceC12414.mo1609(interfaceC10768.mo3085());
                    interfaceC12414.mo1609(interfaceC10768.mo3087());
                    return;
                }
                if (iMo2107 == 3) {
                    interfaceC12414.mo1609(interfaceC10768.mo3085());
                    interfaceC12414.mo1609(interfaceC10768.mo3087());
                    interfaceC12414.mo1609(interfaceC10768.mo3089());
                    return;
                } else {
                    if (iMo2107 == 4) {
                        interfaceC12414.mo1609(interfaceC10768.mo3085());
                        interfaceC12414.mo1609(interfaceC10768.mo3087());
                        interfaceC12414.mo1609(interfaceC10768.mo3089());
                        interfaceC12414.mo1609(interfaceC10768.mo3086());
                        return;
                    }
                    if (iMo2107 != 5) {
                        return;
                    }
                    interfaceC12414.mo1609(interfaceC10768.mo3085());
                    interfaceC12414.mo1609(interfaceC10768.mo3087());
                    interfaceC12414.mo1609(interfaceC10768.mo3089());
                    interfaceC12414.mo1609(interfaceC10768.mo3086());
                    interfaceC12414.mo1609(interfaceC10768.mo3088());
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
                InterfaceC11742 interfaceC11742 = (InterfaceC11742) interfaceC1594;
                int iMo2109 = interfaceC11742.mo2109();
                int iMo2108 = interfaceC11742.mo2107();
                for (int i3 = 0; i3 < iMo2108; i3++) {
                    interfaceC12414.mo1609(iMo2109 + i3);
                }
                return;
            default:
                if ((interfaceC1594 instanceof InterfaceC4685) || (interfaceC1594 instanceof InterfaceC13153)) {
                    throw new RuntimeException(interfaceC1594.mo5435().toString());
                }
                return;
        }
    }
}
