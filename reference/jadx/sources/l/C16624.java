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

/* JADX INFO: renamed from: l.ܽۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BGI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16624 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C15919 f53338 = new C15919();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14009 f53339;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11083 f53340;

    public C16624(C14009 c14009, C11083 c11083) {
        if (c11083 == null) {
            throw new NullPointerException("pool == null");
        }
        this.f53339 = c14009;
        this.f53340 = c11083;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m39090() {
        return this.f53339.m33864();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39088() {
        return this.f53339.m33864() + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39089(int i, InterfaceC0395 interfaceC0395) {
        C14009 c14009 = this.f53339;
        if (interfaceC0395 == null) {
            interfaceC0395 = f53338;
        }
        InterfaceC0395 interfaceC0396 = interfaceC0395;
        try {
            int iM33868 = c14009.m33868(i);
            C20857.m46880(iM33868);
            C11083 c11083 = this.f53340;
            switch (iM33868) {
                case 0:
                    interfaceC0396.mo2128(iM33868, i, C3320.f12280);
                    return 1;
                case 1:
                    interfaceC0396.mo2127(18, i, 1, C8260.f28720, 0);
                    return 1;
                case 2:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70263, -1);
                    return 1;
                case 3:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70267, 0);
                    return 1;
                case 4:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70261, 1);
                    return 1;
                case 5:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70265, 2);
                    return 1;
                case 6:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70264, 3);
                    return 1;
                case 7:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70266, 4);
                    return 1;
                case 8:
                    interfaceC0396.mo2127(18, i, 1, C21665.f70262, 5);
                    return 1;
                case 9:
                    interfaceC0396.mo2127(18, i, 1, C7554.f25057, 0);
                    return 1;
                case 10:
                    interfaceC0396.mo2127(18, i, 1, C7554.f25056, 0);
                    return 1;
                case 11:
                    interfaceC0396.mo2127(18, i, 1, C15316.f49899, 0);
                    return 1;
                case 12:
                    interfaceC0396.mo2127(18, i, 1, C15316.f49897, 0);
                    return 1;
                case 13:
                    interfaceC0396.mo2127(18, i, 1, C15316.f49898, 0);
                    return 1;
                case 14:
                    interfaceC0396.mo2127(18, i, 1, C4025.f14888, 0);
                    return 1;
                case 15:
                    interfaceC0396.mo2127(18, i, 1, C4025.f14887, 0);
                    return 1;
                case 16:
                    int iM33865 = c14009.m33865(i + 1);
                    interfaceC0396.mo2127(18, i, 2, C21665.m48398(iM33865), iM33865);
                    return 2;
                case 17:
                    int iM33863 = c14009.m33863(i + 1);
                    interfaceC0396.mo2127(18, i, 3, C21665.m48398(iM33863), iM33863);
                    return 3;
                case 18:
                    AbstractC9901 abstractC9901 = c11083.get(c14009.m33868(i + 1));
                    interfaceC0396.mo2127(18, i, 2, abstractC9901, abstractC9901 instanceof C21665 ? ((C21665) abstractC9901).mo21658() : 0);
                    return 2;
                case 19:
                    AbstractC9901 abstractC9902 = c11083.get(c14009.m33871(i + 1));
                    interfaceC0396.mo2127(18, i, 3, abstractC9902, abstractC9902 instanceof C21665 ? ((C21665) abstractC9902).mo21658() : 0);
                    return 3;
                case 20:
                    interfaceC0396.mo2127(20, i, 3, c11083.get(c14009.m33871(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC0396.mo2126(21, i, 2, c14009.m33868(i + 1), C3320.f12281, 0);
                    return 2;
                case 22:
                    interfaceC0396.mo2126(21, i, 2, c14009.m33868(i + 1), C3320.f12268, 0);
                    return 2;
                case 23:
                    interfaceC0396.mo2126(21, i, 2, c14009.m33868(i + 1), C3320.f12262, 0);
                    return 2;
                case 24:
                    interfaceC0396.mo2126(21, i, 2, c14009.m33868(i + 1), C3320.f12291, 0);
                    return 2;
                case 25:
                    interfaceC0396.mo2126(21, i, 2, c14009.m33868(i + 1), C3320.f12289, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC0396.mo2126(21, i, 1, iM33868 - 26, C3320.f12281, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC0396.mo2126(21, i, 1, iM33868 - 30, C3320.f12268, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC0396.mo2126(21, i, 1, iM33868 - 34, C3320.f12262, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC0396.mo2126(21, i, 1, iM33868 - 38, C3320.f12291, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    interfaceC0396.mo2126(21, i, 1, iM33868 - 42, C3320.f12289, 0);
                    return 1;
                case 46:
                    interfaceC0396.mo2128(46, i, C3320.f12281);
                    return 1;
                case 47:
                    interfaceC0396.mo2128(46, i, C3320.f12268);
                    return 1;
                case 48:
                    interfaceC0396.mo2128(46, i, C3320.f12262);
                    return 1;
                case 49:
                    interfaceC0396.mo2128(46, i, C3320.f12291);
                    return 1;
                case 50:
                    interfaceC0396.mo2128(46, i, C3320.f12289);
                    return 1;
                case 51:
                    interfaceC0396.mo2128(46, i, C3320.f12258);
                    return 1;
                case 52:
                    interfaceC0396.mo2128(46, i, C3320.f12263);
                    return 1;
                case 53:
                    interfaceC0396.mo2128(46, i, C3320.f12283);
                    return 1;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    interfaceC0396.mo2126(54, i, 2, c14009.m33868(i + 1), C3320.f12281, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    interfaceC0396.mo2126(54, i, 2, c14009.m33868(i + 1), C3320.f12268, 0);
                    return 2;
                case 56:
                    interfaceC0396.mo2126(54, i, 2, c14009.m33868(i + 1), C3320.f12262, 0);
                    return 2;
                case 57:
                    interfaceC0396.mo2126(54, i, 2, c14009.m33868(i + 1), C3320.f12291, 0);
                    return 2;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    interfaceC0396.mo2126(54, i, 2, c14009.m33868(i + 1), C3320.f12289, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                case 61:
                case 62:
                    interfaceC0396.mo2126(54, i, 1, iM33868 - 59, C3320.f12281, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    interfaceC0396.mo2126(54, i, 1, iM33868 - 63, C3320.f12268, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC0396.mo2126(54, i, 1, iM33868 - 67, C3320.f12262, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC0396.mo2126(54, i, 1, iM33868 - 71, C3320.f12291, 0);
                    return 1;
                case 75:
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 77:
                case 78:
                    interfaceC0396.mo2126(54, i, 1, iM33868 - 75, C3320.f12289, 0);
                    return 1;
                case 79:
                    interfaceC0396.mo2128(79, i, C3320.f12281);
                    return 1;
                case 80:
                    interfaceC0396.mo2128(79, i, C3320.f12268);
                    return 1;
                case 81:
                    interfaceC0396.mo2128(79, i, C3320.f12262);
                    return 1;
                case 82:
                    interfaceC0396.mo2128(79, i, C3320.f12291);
                    return 1;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    interfaceC0396.mo2128(79, i, C3320.f12289);
                    return 1;
                case 84:
                    interfaceC0396.mo2128(79, i, C3320.f12258);
                    return 1;
                case 85:
                    interfaceC0396.mo2128(79, i, C3320.f12263);
                    return 1;
                case HRSS1373Polynomial.K /* 86 */:
                    interfaceC0396.mo2128(79, i, C3320.f12283);
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
                    interfaceC0396.mo2128(iM33868, i, C3320.f12280);
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
                    interfaceC0396.mo2128(iM33868, i, C3320.f12281);
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
                    interfaceC0396.mo2128(iM33868 - 1, i, C3320.f12268);
                    return 1;
                case 98:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case 114:
                case 118:
                    interfaceC0396.mo2128(iM33868 - 2, i, C3320.f12262);
                    return 1;
                case q.f /* 99 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case 115:
                case 119:
                    interfaceC0396.mo2128(iM33868 - 3, i, C3320.f12291);
                    return 1;
                case 132:
                    interfaceC0396.mo2126(iM33868, i, 3, c14009.m33868(i + 1), C3320.f12281, c14009.m33865(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC0396.mo2128(iM33868, i, C3320.f12268);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC0396.mo2128(iM33868, i, C3320.f12262);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC0396.mo2128(iM33868, i, C3320.f12291);
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
                    interfaceC0396.mo2128(iM33868, i, C3320.f12281);
                    return 1;
                case 153:
                case EnumC2300.f8185 /* 154 */:
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
                    interfaceC0396.mo2125(iM33868, i, 3, c14009.m33863(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC0396.mo2126(iM33868, i, 2, c14009.m33868(i + 1), C3320.f12288, 0);
                    return 2;
                case 170:
                    return m39084(i, interfaceC0396);
                case 171:
                    return m39087(i, interfaceC0396);
                case 172:
                    interfaceC0396.mo2128(172, i, C3320.f12281);
                    return 1;
                case 173:
                    interfaceC0396.mo2128(172, i, C3320.f12268);
                    return 1;
                case 174:
                    interfaceC0396.mo2128(172, i, C3320.f12262);
                    return 1;
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    interfaceC0396.mo2128(172, i, C3320.f12291);
                    return 1;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    interfaceC0396.mo2128(172, i, C3320.f12289);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC0396.mo2128(iM33868, i, C3320.f12280);
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
                    interfaceC0396.mo2127(iM33868, i, 3, c11083.get(c14009.m33871(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC0396.mo2127(iM33868, i, 5, c11083.get(c14009.m33871(i + 1)), (c14009.m33868(i + 4) << 8) | c14009.m33868(i + 3));
                    return 5;
                case 186:
                    interfaceC0396.mo2127(iM33868, i, 5, (C18843) c11083.get(c14009.m33871(i + 1)), 0);
                    return 5;
                case 188:
                    return m39086(i, interfaceC0396);
                case 196:
                    return m39085(i, interfaceC0396);
                case 197:
                    interfaceC0396.mo2127(iM33868, i, 4, c11083.get(c14009.m33871(i + 1)), c14009.m33868(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC0396.mo2125(iM33868 == 200 ? 167 : 168, i, 5, c14009.m33870(i + 1) + i);
                    return 5;
                default:
                    interfaceC0396.mo2124(iM33868, i);
                    return 1;
            }
        } catch (C21293 e) {
            e.m20021("...at bytecode offset ".concat(C22475.m49978(i)));
            throw e;
        } catch (RuntimeException e2) {
            C21293 c21293 = new C21293(null, e2);
            c21293.m20021("...at bytecode offset ".concat(C22475.m49978(i)));
            throw c21293;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m39084(int i, InterfaceC0395 interfaceC0395) {
        C14009 c14009;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM33868 = 0;
        while (true) {
            c14009 = this.f53339;
            if (i3 >= i2) {
                break;
            }
            iM33868 = (iM33868 << 8) | c14009.m33868(i3);
            i3++;
        }
        int iM33870 = c14009.m33870(i2) + i;
        int iM33871 = c14009.m33870(i2 + 4);
        int iM33872 = c14009.m33870(i2 + 8);
        int i4 = (iM33872 - iM33871) + 1;
        int i5 = i2 + 12;
        if (iM33871 > iM33872) {
            throw new C21293("low / high inversion", null);
        }
        C7888 c7888 = new C7888(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM33873 = c14009.m33870(i5) + i;
            i5 += 4;
            c7888.add(iM33871 + i6, iM33873);
        }
        c7888.m20814(iM33870);
        c7888.m20815();
        c7888.mo9637();
        int i7 = i5 - i;
        interfaceC0395.mo2130(i, i7, c7888, iM33868);
        return i7;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m39087(int i, InterfaceC0395 interfaceC0395) {
        C14009 c14009;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM33868 = 0;
        while (true) {
            c14009 = this.f53339;
            if (i3 >= i2) {
                break;
            }
            iM33868 = (iM33868 << 8) | c14009.m33868(i3);
            i3++;
        }
        int iM33870 = c14009.m33870(i2) + i;
        int iM33871 = c14009.m33870(i2 + 4);
        int i4 = i2 + 8;
        C7888 c7888 = new C7888(iM33871);
        for (int i5 = 0; i5 < iM33871; i5++) {
            int iM33872 = c14009.m33870(i4);
            int iM33873 = c14009.m33870(i4 + 4) + i;
            i4 += 8;
            c7888.add(iM33872, iM33873);
        }
        c7888.m20814(iM33870);
        c7888.m20815();
        c7888.mo9637();
        int i6 = i4 - i;
        interfaceC0395.mo2130(i, i6, c7888, iM33868);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m39086(int i, InterfaceC0395 interfaceC0395) {
        C6143 c6143;
        int i2;
        C14009 c14009 = this.f53339;
        int iM33868 = c14009.m33868(i + 1);
        switch (iM33868) {
            case 4:
                c6143 = C6143.f20976;
                break;
            case 5:
                c6143 = C6143.f20970;
                break;
            case 6:
                c6143 = C6143.f20969;
                break;
            case 7:
                c6143 = C6143.f20975;
                break;
            case 8:
                c6143 = C6143.f20977;
                break;
            case 9:
                c6143 = C6143.f20960;
                break;
            case 10:
                c6143 = C6143.f20965;
                break;
            case 11:
                c6143 = C6143.f20971;
                break;
            default:
                throw new C21293("bad newarray code ".concat(C22475.m49983(iM33868)), null);
        }
        int iMo2123 = interfaceC0395.mo2123();
        C20152 c20152 = new C20152();
        int i3 = 0;
        if (iMo2123 >= 0) {
            m39089(iMo2123, c20152);
            if ((c20152.f65466 instanceof C21665) && c20152.f65465 + iMo2123 == i) {
                i2 = c20152.f65464;
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
                if (c14009.m33868(i4) == 89) {
                    m39089(i5, c20152);
                    int i6 = c20152.f65465;
                    if (i6 != 0 && (c20152.f65466 instanceof C21665) && c20152.f65464 == i3) {
                        int i7 = i5 + i6;
                        m39089(i7, c20152);
                        int i8 = c20152.f65465;
                        if (i8 != 0) {
                            AbstractC9901 abstractC9901 = c20152.f65466;
                            if (abstractC9901 instanceof AbstractC10377) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC9901);
                                int i10 = i9 + 1;
                                int iM33869 = c14009.m33868(i9);
                                switch (iM33868) {
                                    case 4:
                                    case 8:
                                        if (iM33869 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM33869 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM33869 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM33869 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM33869 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM33869 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM33869 == 80) {
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
            interfaceC0395.mo2129(i, 2, c6143, (ArrayList) null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC0395.mo2129(i, i11, c6143, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m39085(int i, InterfaceC0395 interfaceC0395) {
        C14009 c14009 = this.f53339;
        int iM33868 = c14009.m33868(i + 1);
        int iM33871 = c14009.m33871(i + 2);
        if (iM33868 == 132) {
            interfaceC0395.mo2126(iM33868, i, 6, iM33871, C3320.f12281, c14009.m33863(i + 4));
            return 6;
        }
        if (iM33868 != 169) {
            switch (iM33868) {
                case 21:
                    interfaceC0395.mo2126(21, i, 4, iM33871, C3320.f12281, 0);
                    return 4;
                case 22:
                    interfaceC0395.mo2126(21, i, 4, iM33871, C3320.f12268, 0);
                    return 4;
                case 23:
                    interfaceC0395.mo2126(21, i, 4, iM33871, C3320.f12262, 0);
                    return 4;
                case 24:
                    interfaceC0395.mo2126(21, i, 4, iM33871, C3320.f12291, 0);
                    return 4;
                case 25:
                    interfaceC0395.mo2126(21, i, 4, iM33871, C3320.f12289, 0);
                    return 4;
                default:
                    switch (iM33868) {
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            interfaceC0395.mo2126(54, i, 4, iM33871, C3320.f12281, 0);
                            return 4;
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            interfaceC0395.mo2126(54, i, 4, iM33871, C3320.f12268, 0);
                            return 4;
                        case 56:
                            interfaceC0395.mo2126(54, i, 4, iM33871, C3320.f12262, 0);
                            return 4;
                        case 57:
                            interfaceC0395.mo2126(54, i, 4, iM33871, C3320.f12291, 0);
                            return 4;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            interfaceC0395.mo2126(54, i, 4, iM33871, C3320.f12289, 0);
                            return 4;
                        default:
                            interfaceC0395.mo2124(196, i);
                            return 1;
                    }
            }
        }
        interfaceC0395.mo2126(iM33868, i, 4, iM33871, C3320.f12288, 0);
        return 4;
    }
}
