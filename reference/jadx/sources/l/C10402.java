package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۤܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W4KG */
/* JADX INFO: loaded from: classes3.dex */
public class C10402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f35579;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[] f35580;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26297(int i, Object obj) {
        Object[] objArr = this.f35580;
        if (i > objArr.length || i < 0) {
            return;
        }
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26298(AbstractC0523 abstractC0523, AbstractC12807 abstractC12807) {
        ArrayList arrayList;
        int i;
        EnumC21815 enumC21815 = abstractC0523.f2212;
        if (enumC21815 == null) {
            return;
        }
        switch (C8991.f30761[enumC21815.ordinal()]) {
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
                m26297(((C16047) abstractC0523).f51932, abstractC12807.mo15473(abstractC0523));
                this.f35579 = null;
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                m26297(((C16752) abstractC0523).f53634, abstractC12807.mo15473(abstractC0523));
                this.f35579 = null;
                return;
            case 21:
                m26297(((C5587) abstractC0523).f19181, abstractC12807.mo15473(abstractC0523));
                this.f35579 = null;
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                C11938 c11938 = (C11938) abstractC0523;
                m26297(c11938.f40044, abstractC12807.mo15474(abstractC0523, m26296(c11938.f40043)));
                this.f35579 = null;
                return;
            case 31:
            case 32:
            case 33:
            case 34:
                m26297(((C4881) abstractC0523).f17163, abstractC12807.mo15474(abstractC0523, this.f35579));
                this.f35579 = null;
                return;
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
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
                C11938 c11939 = (C11938) abstractC0523;
                m26297(c11939.f40044, abstractC12807.mo15479(abstractC0523, m26296(c11939.f40043)));
                this.f35579 = null;
                return;
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
                abstractC12807.mo15479(abstractC0523, m26296(((C6168) abstractC0523).f21024));
                this.f35579 = null;
                return;
            case 63:
                abstractC12807.mo15479(abstractC0523, m26296(((C9697) abstractC0523).f68332));
                this.f35579 = null;
                return;
            case 64:
                abstractC12807.mo15479(abstractC0523, m26296(((C1934) abstractC0523).f68332));
                this.f35579 = null;
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                abstractC12807.mo15479(abstractC0523, m26296(((C16752) abstractC0523).f53634));
                this.f35579 = null;
                return;
            case 72:
            case 73:
            case 74:
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 77:
            case 78:
                C16752 c16752 = (C16752) abstractC0523;
                m26297(c16752.f53634, abstractC12807.mo15479(abstractC0523, m26296(c16752.f53632)));
                this.f35579 = null;
                return;
            case 79:
            case 80:
                C5587 c5587 = (C5587) abstractC0523;
                m26297(c5587.f19181, abstractC12807.mo15479(abstractC0523, m26296(c5587.f19179)));
                this.f35579 = null;
                return;
            case 81:
                int i2 = ((C5587) abstractC0523).f19181;
                m26297(i2, abstractC12807.mo15479(abstractC0523, m26296(i2)));
                this.f35579 = null;
                return;
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
                abstractC12807.mo15479(abstractC0523, m26296(((C4881) abstractC0523).f17163));
                this.f35579 = null;
                return;
            case 85:
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                abstractC12807.mo15481(abstractC0523, m26296(((C4881) abstractC0523).f17163));
                this.f35579 = null;
                return;
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
                C2764 c2764 = (C2764) abstractC0523;
                m26297(c2764.f10579, abstractC12807.mo15475(abstractC0523, m26296(c2764.f10577), m26296(c2764.f10578)));
                this.f35579 = null;
                return;
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                C6168 c6168 = (C6168) abstractC0523;
                abstractC12807.mo15475(abstractC0523, m26296(c6168.f21024), m26296(c6168.f21022));
                this.f35579 = null;
                return;
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                C16752 c16753 = (C16752) abstractC0523;
                abstractC12807.mo15475(abstractC0523, m26296(c16753.f53632), m26296(c16753.f53634));
                this.f35579 = null;
                return;
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                C2764 c2765 = (C2764) abstractC0523;
                abstractC12807.mo15476(abstractC0523, m26296(c2765.f10577), m26296(c2765.f10578), m26296(c2765.f10579));
                this.f35579 = null;
                return;
            case 152:
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
                AbstractC7579 abstractC7579 = (AbstractC7579) abstractC0523;
                int[] iArr = abstractC7579.f25105;
                C14076 c14076Mo20101 = abstractC7579.mo20101();
                if (enumC21815 == EnumC21815.f70661 || enumC21815 == EnumC21815.f70672 || enumC21815 == EnumC21815.f70748 || enumC21815 == EnumC21815.f70794) {
                    arrayList = new ArrayList(c14076Mo20101.m34051().length);
                    i = 0;
                } else {
                    i = 1;
                    arrayList = new ArrayList(c14076Mo20101.m34051().length + 1);
                    arrayList.add(m26296(iArr[0]));
                }
                for (String str : c14076Mo20101.m34051()) {
                    arrayList.add(m26296(iArr[i]));
                    char cCharAt = str.charAt(0);
                    i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
                }
                this.f35579 = abstractC12807.mo15477(abstractC0523, arrayList);
                return;
            case 166:
            case 167:
                int[] iArr2 = ((C17457) abstractC0523).f55559;
                ArrayList arrayList2 = new ArrayList(iArr2.length);
                for (int i3 : iArr2) {
                    arrayList2.add(m26296(i3));
                }
                this.f35579 = abstractC12807.mo15477(abstractC0523, arrayList2);
                return;
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
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
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                C11938 c119310 = (C11938) abstractC0523;
                int i4 = c119310.f40044;
                m26297(i4, abstractC12807.mo15475(abstractC0523, m26296(i4), m26296(c119310.f40043)));
                this.f35579 = null;
                return;
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
                C14055 c14055 = (C14055) abstractC0523;
                m26297(c14055.f46195, abstractC12807.mo15479(abstractC0523, m26296(c14055.f46196)));
                this.f35579 = null;
                return;
            case 219:
                abstractC12807.mo15479(abstractC0523, m26296(((C12519) abstractC0523).f41885));
                this.f35579 = null;
                return;
            case 220:
            case 221:
            case 222:
            case 223:
            case BERTags.FLAGS /* 224 */:
                this.f35579 = null;
                return;
            default:
                throw new RuntimeException("not support " + enumC21815);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m26296(int i) {
        Object[] objArr = this.f35580;
        if (i > objArr.length || i < 0) {
            return null;
        }
        return objArr[i];
    }
}
