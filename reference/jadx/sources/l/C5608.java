package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۚ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5608 extends AbstractC12807 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4196 f19210;

    public C5608(C4196 c4196) {
        this.f19210 = c4196;
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15474(AbstractC0523 abstractC0523, Object obj) {
        C13370 c13370 = (C13370) obj;
        if (c13370 == null) {
            m15480(abstractC0523);
            return m15478(C2058.m6556(0));
        }
        return m15478(this.f19210.m11840(c13370));
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15475(AbstractC0523 abstractC0523, Object obj, Object obj2) {
        C13370 c13370 = (C13370) obj;
        C13370 c13371 = (C13370) obj2;
        if (c13370 == null || c13371 == null) {
            m15480(abstractC0523);
            return m15478(C2058.m6556(0));
        }
        C4196 c4196 = this.f19210;
        C2184 c2184M11840 = c4196.m11840(c13370);
        C2184 c2184M11841 = c4196.m11840(c13371);
        switch (C22542.f73511[abstractC0523.f2212.ordinal()]) {
            case 98:
                return m15478(new C6292(c2184M11840, c2184M11841, EnumC12643.IF.f42239));
            case q.f /* 99 */:
                return m15478(new C6292(c2184M11840, c2184M11841, "Z"));
            case 100:
                return m15478(new C6292(c2184M11840, c2184M11841, "B"));
            case 101:
                return m15478(new C6292(c2184M11840, c2184M11841, "C"));
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                return m15478(new C6292(c2184M11840, c2184M11841, "L"));
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                return m15478(new C6292(c2184M11840, c2184M11841, "S"));
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return m15478(new C6292(c2184M11840, c2184M11841, EnumC12643.JD.f42239));
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                return m15478(new C11232(EnumC9947.LCMP, c2184M11840, c2184M11841, "J"));
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return m15478(new C11232(EnumC9947.DCMPG, c2184M11840, c2184M11841, "D"));
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return m15478(new C11232(EnumC9947.FCMPG, c2184M11840, c2184M11841, "F"));
            case 108:
                return m15478(new C11232(EnumC9947.DCMPL, c2184M11840, c2184M11841, "D"));
            case 109:
                return m15478(new C11232(EnumC9947.FCMPL, c2184M11840, c2184M11841, "F"));
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "D"));
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "F"));
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "I"));
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "J"));
            case 114:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "D"));
            case 115:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "F"));
            case 116:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "I"));
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "J"));
            case 118:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "D"));
            case 119:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "F"));
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "I"));
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "J"));
            case 122:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "D"));
            case 123:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "F"));
            case 124:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "I"));
            case q.h /* 125 */:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "J"));
            case 126:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "D"));
            case 127:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "F"));
            case 128:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "I"));
            case 129:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "J"));
            case 130:
                return m15478(new C11232(EnumC9947.AND, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case 131:
                return m15478(new C11232(EnumC9947.AND, c2184M11840, c2184M11841, "J"));
            case 132:
                return m15478(new C11232(EnumC9947.OR, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case 133:
                return m15478(new C11232(EnumC9947.OR, c2184M11840, c2184M11841, "J"));
            case 134:
                return m15478(new C11232(EnumC9947.XOR, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case 135:
                return m15478(new C11232(EnumC9947.XOR, c2184M11840, c2184M11841, "J"));
            case 136:
                return m15478(new C11232(EnumC9947.SHL, c2184M11840, c2184M11841, "I"));
            case 137:
                return m15478(new C11232(EnumC9947.SHL, c2184M11840, c2184M11841, "J"));
            case 138:
                return m15478(new C11232(EnumC9947.SHR, c2184M11840, c2184M11841, "I"));
            case 139:
                return m15478(new C11232(EnumC9947.SHR, c2184M11840, c2184M11841, "J"));
            case 140:
                return m15478(new C11232(EnumC9947.USHR, c2184M11840, c2184M11841, "I"));
            case 141:
                return m15478(new C11232(EnumC9947.USHR, c2184M11840, c2184M11841, "J"));
            case 142:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.EQ, c2184M11840, c2184M11841, EnumC12643.ZIL.f42239), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 143:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.GE, c2184M11840, c2184M11841, "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 144:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.GT, c2184M11840, c2184M11841, "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 145:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.LE, c2184M11840, c2184M11841, "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 146:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.LT, c2184M11840, c2184M11841, "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 147:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.NE, c2184M11840, c2184M11841, EnumC12643.ZIL.f42239), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case EnumC2300.f8185 /* 154 */:
                C9449 c9449 = ((C16752) abstractC0523).f53633;
                c4196.m11844(C2660.m8188(new C9821(c2184M11840, c9449.m24204(), c9449.m24202(), c9449.m24203()), c2184M11841));
                return null;
            case 155:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "D"));
            case 156:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "F"));
            case 157:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "I"));
            case 158:
                return m15478(C2058.m6554(c2184M11840, c2184M11841, "J"));
            case 159:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "D"));
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "F"));
            case 161:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "I"));
            case 162:
                return m15478(C2058.m6557(c2184M11841, c2184M11840, "J"));
            case 163:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "D"));
            case 164:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "F"));
            case 165:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "I"));
            case 166:
                return m15478(C2058.m6558(c2184M11840, c2184M11841, "J"));
            case 167:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "D"));
            case 168:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "F"));
            case 169:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "I"));
            case 170:
                return m15478(C2058.m6559(c2184M11840, c2184M11841, "J"));
            case 171:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "D"));
            case 172:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "F"));
            case 173:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "I"));
            case 174:
                return m15478(C2058.m6553(c2184M11840, c2184M11841, "J"));
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                return m15478(new C11232(EnumC9947.AND, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return m15478(new C11232(EnumC9947.AND, c2184M11840, c2184M11841, "J"));
            case 177:
                return m15478(new C11232(EnumC9947.OR, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case 178:
                return m15478(new C11232(EnumC9947.OR, c2184M11840, c2184M11841, "J"));
            case 179:
                return m15478(new C11232(EnumC9947.XOR, c2184M11840, c2184M11841, EnumC12643.ZI.f42239));
            case 180:
                return m15478(new C11232(EnumC9947.XOR, c2184M11840, c2184M11841, "J"));
            case 181:
                return m15478(new C11232(EnumC9947.SHL, c2184M11840, c2184M11841, "I"));
            case 182:
                return m15478(new C11232(EnumC9947.SHL, c2184M11840, c2184M11841, "J"));
            case 183:
                return m15478(new C11232(EnumC9947.SHR, c2184M11840, c2184M11841, "I"));
            case 184:
                return m15478(new C11232(EnumC9947.SHR, c2184M11840, c2184M11841, "J"));
            case 185:
                return m15478(new C11232(EnumC9947.USHR, c2184M11840, c2184M11841, "I"));
            case 186:
                return m15478(new C11232(EnumC9947.USHR, c2184M11840, c2184M11841, "J"));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15476(AbstractC0523 abstractC0523, Object obj, Object obj2, Object obj3) {
        C13370 c13370 = (C13370) obj;
        C13370 c13371 = (C13370) obj2;
        C13370 c13372 = (C13370) obj3;
        if (c13370 == null || c13371 == null || c13372 == null) {
            m15480(abstractC0523);
            return m15478(C2058.m6556(0));
        }
        C4196 c4196 = this.f19210;
        C2184 c2184M11840 = c4196.m11840(c13370);
        C2184 c2184M11841 = c4196.m11840(c13371);
        C2184 c2184M11842 = c4196.m11840(c13372);
        switch (C22542.f73511[abstractC0523.f2212.ordinal()]) {
            case 187:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, EnumC12643.IF.f42239), c2184M11842));
                return null;
            case 188:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, "Z"), c2184M11842));
                return null;
            case 189:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, "B"), c2184M11842));
                return null;
            case 190:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, "C"), c2184M11842));
                return null;
            case 191:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, "L"), c2184M11842));
                return null;
            case 192:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, "S"), c2184M11842));
                return null;
            case 193:
                c4196.m11844(C2660.m8188(new C6292(c2184M11840, c2184M11841, EnumC12643.JD.f42239), c2184M11842));
                return null;
            default:
                return null;
        }
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo15479(AbstractC0523 abstractC0523, Object obj) {
        EnumC21815 enumC21815 = abstractC0523.f2212;
        C13370 c13370 = (C13370) obj;
        if (c13370 == null) {
            m15480(abstractC0523);
            return m15478(C2058.m6556(0));
        }
        C4196 c4196 = this.f19210;
        C2184 c2184M11840 = c4196.m11840(c13370);
        String str = "I";
        switch (C22542.f73511[enumC21815.ordinal()]) {
            case 28:
                return m15478(new C17707(EnumC9947.NOT, c2184M11840, "I"));
            case 29:
                return m15478(new C17707(EnumC9947.NOT, c2184M11840, "J"));
            case 30:
                return m15478(new C17707(EnumC9947.NEG, c2184M11840, "D"));
            case 31:
                return m15478(new C17707(EnumC9947.NEG, c2184M11840, "F"));
            case 32:
                return m15478(new C17707(EnumC9947.NEG, c2184M11840, "I"));
            case 33:
                return m15478(new C17707(EnumC9947.NEG, c2184M11840, "J"));
            case 34:
                return m15478(new C23932(c2184M11840, "I", "B"));
            case 35:
                return m15478(new C23932(c2184M11840, "I", "C"));
            case 36:
                return m15478(new C23932(c2184M11840, "I", "D"));
            case 37:
                return m15478(new C23932(c2184M11840, "I", "F"));
            case 38:
                return m15478(new C23932(c2184M11840, "I", "J"));
            case 39:
                return m15478(new C23932(c2184M11840, "I", "S"));
            case 40:
                return m15478(new C23932(c2184M11840, "F", "D"));
            case 41:
                return m15478(new C23932(c2184M11840, "F", "I"));
            case 42:
                return m15478(new C23932(c2184M11840, "F", "J"));
            case 43:
                return m15478(new C23932(c2184M11840, "D", "F"));
            case 44:
                return m15478(new C23932(c2184M11840, "D", "I"));
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return m15478(new C23932(c2184M11840, "D", "J"));
            case 46:
                return m15478(new C23932(c2184M11840, "J", "D"));
            case 47:
                return m15478(new C23932(c2184M11840, "J", "F"));
            case 48:
                return m15478(new C23932(c2184M11840, "J", "I"));
            case 49:
                return m15478(new C17707(EnumC9947.LENGTH, c2184M11840, null));
            case 50:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.EQ, c2184M11840, C2058.m6556(0), EnumC12643.ZIL.f42239), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 51:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.GE, c2184M11840, C2058.m6556(0), "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 52:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.GT, c2184M11840, C2058.m6556(0), "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 53:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.LE, c2184M11840, C2058.m6556(0), "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.LT, c2184M11840, C2058.m6556(0), "I"), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                c4196.m11844(C2660.m8189(new C11232(EnumC9947.NE, c2184M11840, C2058.m6556(0), EnumC12643.ZIL.f42239), c4196.m11842(((C6168) abstractC0523).f21023)));
                return null;
            case 56:
            case 57:
                C14388[] c14388Arr = ((AbstractC20985) abstractC0523).f68331;
                C17002[] c17002Arr = new C17002[c14388Arr.length];
                for (int i = 0; i < c14388Arr.length; i++) {
                    c17002Arr[i] = c4196.m11842(c14388Arr[i]);
                }
                C17002 c17002 = new C17002();
                if (enumC21815 == EnumC21815.f70781) {
                    c4196.m11844(new C5483(c2184M11840, ((C1934) abstractC0523).f7312, c17002Arr, c17002));
                } else {
                    c4196.m11844(new C5713(c2184M11840, ((C9697) abstractC0523).f32678, c17002Arr, c17002));
                }
                c4196.m11844(c17002);
                return null;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                C9449 c9449 = ((C16752) abstractC0523).f53633;
                c4196.m11844(C2660.m8188(new C6418(c9449.m24204(), c9449.m24202(), c9449.m24203()), c2184M11840));
                return null;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                C9449 c94410 = ((C16752) abstractC0523).f53633;
                return m15478(new C9821(c2184M11840, c94410.m24204(), c94410.m24202(), c94410.m24203()));
            case 72:
                return m15478(new C14886(EnumC9947.INSTANCE_OF, c2184M11840, ((C5587) abstractC0523).f19180));
            case 73:
                return m15478(new C14886(EnumC9947.NEW_ARRAY, c2184M11840, ((C5587) abstractC0523).f19180.substring(1)));
            case 74:
                return m15478(new C14886(EnumC9947.CHECK_CAST, c2184M11840, ((C5587) abstractC0523).f19180));
            case 75:
                c4196.m11844(new C1249(EnumC2890.LOCK, c2184M11840));
                return null;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                c4196.m11844(new C1249(EnumC2890.UNLOCK, c2184M11840));
                return null;
            case 77:
                c4196.m11844(C2660.m8187(c2184M11840));
                return null;
            case 78:
            case 79:
                return m15478(C2058.m6554(c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 80:
            case 81:
                return m15478(C2058.m6557(c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                return m15478(C2058.m6558(c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 84:
            case 85:
                return m15478(C2058.m6559(c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                return m15478(C2058.m6553(c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 88:
            case 89:
                int i2 = ((C14055) abstractC0523).f46197;
                C14760 c14760M6556 = C2058.m6556(i2);
                if (i2 >= 0 && i2 <= 1) {
                    str = EnumC12643.ZI.f42239;
                }
                return m15478(new C11232(EnumC9947.AND, c2184M11840, c14760M6556, str));
            case 90:
            case 91:
                int i3 = ((C14055) abstractC0523).f46197;
                C14760 c14760M6557 = C2058.m6556(i3);
                if (i3 >= 0 && i3 <= 1) {
                    str = EnumC12643.ZI.f42239;
                }
                return m15478(new C11232(EnumC9947.OR, c2184M11840, c14760M6557, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
                int i4 = ((C14055) abstractC0523).f46197;
                C14760 c14760M6558 = C2058.m6556(i4);
                if (i4 >= 0 && i4 <= 1) {
                    str = EnumC12643.ZI.f42239;
                }
                return m15478(new C11232(EnumC9947.XOR, c2184M11840, c14760M6558, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                return m15478(new C11232(EnumC9947.SHL, c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 95:
                return m15478(new C11232(EnumC9947.SHR, c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 96:
                return m15478(new C11232(EnumC9947.USHR, c2184M11840, C2058.m6556(((C14055) abstractC0523).f46197), "I"));
            case 97:
                c4196.m11844(new C15592(EnumC2890.FILL_ARRAY_DATA, c2184M11840, new C14760(((C12519) abstractC0523).f41886)));
                return null;
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15481(AbstractC0523 abstractC0523, Object obj) {
        C13370 c13370 = (C13370) obj;
        if (c13370 == null) {
            m15480(abstractC0523);
            return;
        }
        C4196 c4196 = this.f19210;
        c4196.m11844(new C1249(EnumC2890.RETURN, c4196.m11840(c13370)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13370 m15478(AbstractC7124 abstractC7124) {
        C4196 c4196 = this.f19210;
        C2184 c2184M11838 = c4196.m11838();
        c4196.m11844(C2660.m8188(c2184M11838, abstractC7124));
        return new C13370(c2184M11838);
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15473(AbstractC0523 abstractC0523) {
        switch (C22542.f73511[abstractC0523.f2212.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
                Integer num = (Integer) ((C16047) abstractC0523).f51931;
                num.getClass();
                return m15478(new C14760(num));
            case 11:
            case 12:
            case 13:
            case 14:
                Long l2 = (Long) ((C16047) abstractC0523).f51931;
                l2.getClass();
                return m15478(new C14760(l2));
            case 15:
                return m15478(new C14760((C1686) ((C16047) abstractC0523).f51931));
            case 16:
            case 17:
                return m15478(new C14760((String) ((C16047) abstractC0523).f51931));
            case 18:
                return m15478(new C14760((C4902) ((C16047) abstractC0523).f51931));
            case 19:
                return m15478(new C14760((C14076) ((C16047) abstractC0523).f51931));
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                C9449 c9449 = ((C16752) abstractC0523).f53633;
                return m15478(new C6418(c9449.m24204(), c9449.m24202(), c9449.m24203()));
            case 27:
                return m15478(new C5007(((C5587) abstractC0523).f19180));
            default:
                return null;
        }
    }

    @Override // l.AbstractC12807
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15477(AbstractC0523 abstractC0523, ArrayList arrayList) {
        C13475 c13475;
        EnumC21815 enumC21815 = abstractC0523.f2212;
        Iterator it = arrayList.iterator();
        do {
            int i = 0;
            if (!it.hasNext()) {
                int i2 = C22542.f73511[enumC21815.ordinal()];
                C4196 c4196 = this.f19210;
                switch (i2) {
                    case 204:
                    case 205:
                        C13370 c13370 = new C13370();
                        String strSubstring = ((C17457) abstractC0523).f55558.substring(1);
                        c4196.m11844(C2660.m8188(c4196.m11840(c13370), new C14886(EnumC9947.NEW_ARRAY, C2058.m6556(arrayList.size()), strSubstring)));
                        while (i < arrayList.size()) {
                            c4196.m11844(C2660.m8188(new C6292(c4196.m11840(c13370), C2058.m6556(i), strSubstring), c4196.m11840((C13370) arrayList.get(i))));
                            i++;
                        }
                        return c13370;
                    case 206:
                    case 207:
                        int size = arrayList.size();
                        AbstractC7124[] abstractC7124Arr = new AbstractC7124[size];
                        while (i < size) {
                            abstractC7124Arr[i] = c4196.m11840((C13370) arrayList.get(i));
                            i++;
                        }
                        C10860 c10860 = ((C11108) abstractC0523).f37696;
                        C4301 c4301 = new C4301(EnumC9947.INVOKE_CUSTOM, abstractC7124Arr, c10860);
                        if ("V".equals(c10860.m27212().m34050())) {
                            c4196.m11844(new C13245(c4301));
                            return null;
                        }
                        return m15478(c4301);
                    case 208:
                    case 209:
                        int size2 = arrayList.size();
                        AbstractC7124[] abstractC7124Arr2 = new AbstractC7124[size2];
                        while (i < size2) {
                            abstractC7124Arr2[i] = c4196.m11840((C13370) arrayList.get(i));
                            i++;
                        }
                        C23808 c23808 = (C23808) abstractC0523;
                        C14076 c14076 = c23808.f76989;
                        C11358 c11358 = new C11358(EnumC9947.INVOKE_POLYMORPHIC, abstractC7124Arr2, c14076, c23808.f76988);
                        if ("V".equals(c14076.m34050())) {
                            c4196.m11844(new C13245(c11358));
                            return null;
                        }
                        return m15478(c11358);
                    default:
                        int size3 = arrayList.size();
                        AbstractC7124[] abstractC7124Arr3 = new AbstractC7124[size3];
                        while (i < size3) {
                            abstractC7124Arr3[i] = c4196.m11840((C13370) arrayList.get(i));
                            i++;
                        }
                        C3097 c3097 = ((C14636) abstractC0523).f47868;
                        switch (C22542.f73511[enumC21815.ordinal()]) {
                            case 194:
                            case 195:
                                c13475 = new C13475(EnumC9947.INVOKE_VIRTUAL, abstractC7124Arr3, c3097.m9294(), c3097.m9295(), c3097.m9291(), c3097.m9296());
                                break;
                            case 196:
                            case 197:
                            case 198:
                            case 199:
                                c13475 = new C13475(EnumC9947.INVOKE_SPECIAL, abstractC7124Arr3, c3097.m9294(), c3097.m9295(), c3097.m9291(), c3097.m9296());
                                break;
                            case 200:
                            case 201:
                                c13475 = new C13475(EnumC9947.INVOKE_STATIC, abstractC7124Arr3, c3097.m9294(), c3097.m9295(), c3097.m9291(), c3097.m9296());
                                break;
                            case 202:
                            case 203:
                                c13475 = new C13475(EnumC9947.INVOKE_INTERFACE, abstractC7124Arr3, c3097.m9294(), c3097.m9295(), c3097.m9291(), c3097.m9296());
                                break;
                            default:
                                throw new RuntimeException();
                        }
                        if ("V".equals(c3097.m9296())) {
                            c4196.m11844(new C13245(c13475));
                            return null;
                        }
                        return m15478(c13475);
                }
            }
        } while (((C13370) it.next()) != null);
        m15480(abstractC0523);
        return m15478(C2058.m6556(0));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15480(AbstractC0523 abstractC0523) {
        String str;
        int[] iArr = C22542.f73511;
        EnumC21815 enumC21815 = abstractC0523.f2212;
        switch (iArr[enumC21815.ordinal()]) {
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
                str = "can't get operand(s) for " + enumC21815 + ", wrong position ?";
                break;
            default:
                str = "can't get operand(s) for " + enumC21815 + ", out-of-range or not initialized ?";
                break;
        }
        System.err.println("WARN: " + str);
        this.f19210.m11844(C2660.m8187(C2058.m6555(new AbstractC7124[]{new C14760(C0252.m1693("d2j: ", str))}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
    }
}
