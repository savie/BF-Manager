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

/* JADX INFO: renamed from: l.ۘۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3923 extends AbstractC11528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0194 f13387;

    public C3923(C0194 c0194) {
        this.f13387 = c0194;
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12626(AbstractC15283 abstractC15283, Object obj) {
        C18093 c18093 = (C18093) obj;
        if (c18093 == null) {
            m12632(abstractC15283);
            return m12630(C23840.m53165(0));
        }
        return m12630(this.f13387.m1558(c18093));
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12627(AbstractC15283 abstractC15283, Object obj, Object obj2) {
        C18093 c18093 = (C18093) obj;
        C18093 c18094 = (C18093) obj2;
        if (c18093 == null || c18094 == null) {
            m12632(abstractC15283);
            return m12630(C23840.m53165(0));
        }
        C0194 c0194 = this.f13387;
        C4448 c4448M1558 = c0194.m1558(c18093);
        C4448 c4448M1559 = c0194.m1558(c18094);
        switch (C14363.f45289[abstractC15283.f49969.ordinal()]) {
            case 98:
                return m12630(new C25332(c4448M1558, c4448M1559, EnumC5940.IF.f20313));
            case q.f /* 99 */:
                return m12630(new C25332(c4448M1558, c4448M1559, "Z"));
            case 100:
                return m12630(new C25332(c4448M1558, c4448M1559, "B"));
            case 101:
                return m12630(new C25332(c4448M1558, c4448M1559, "C"));
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                return m12630(new C25332(c4448M1558, c4448M1559, "L"));
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                return m12630(new C25332(c4448M1558, c4448M1559, "S"));
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return m12630(new C25332(c4448M1558, c4448M1559, EnumC5940.JD.f20313));
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                return m12630(new C17126(EnumC22260.LCMP, c4448M1558, c4448M1559, "J"));
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return m12630(new C17126(EnumC22260.DCMPG, c4448M1558, c4448M1559, "D"));
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return m12630(new C17126(EnumC22260.FCMPG, c4448M1558, c4448M1559, "F"));
            case 108:
                return m12630(new C17126(EnumC22260.DCMPL, c4448M1558, c4448M1559, "D"));
            case 109:
                return m12630(new C17126(EnumC22260.FCMPL, c4448M1558, c4448M1559, "F"));
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "D"));
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "F"));
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "I"));
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "J"));
            case 114:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "D"));
            case 115:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "F"));
            case 116:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "I"));
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "J"));
            case 118:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "D"));
            case 119:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "F"));
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "I"));
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "J"));
            case 122:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "D"));
            case 123:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "F"));
            case 124:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "I"));
            case q.h /* 125 */:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "J"));
            case 126:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "D"));
            case 127:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "F"));
            case 128:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "I"));
            case 129:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "J"));
            case 130:
                return m12630(new C17126(EnumC22260.AND, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case 131:
                return m12630(new C17126(EnumC22260.AND, c4448M1558, c4448M1559, "J"));
            case 132:
                return m12630(new C17126(EnumC22260.OR, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case 133:
                return m12630(new C17126(EnumC22260.OR, c4448M1558, c4448M1559, "J"));
            case 134:
                return m12630(new C17126(EnumC22260.XOR, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case 135:
                return m12630(new C17126(EnumC22260.XOR, c4448M1558, c4448M1559, "J"));
            case 136:
                return m12630(new C17126(EnumC22260.SHL, c4448M1558, c4448M1559, "I"));
            case 137:
                return m12630(new C17126(EnumC22260.SHL, c4448M1558, c4448M1559, "J"));
            case 138:
                return m12630(new C17126(EnumC22260.SHR, c4448M1558, c4448M1559, "I"));
            case 139:
                return m12630(new C17126(EnumC22260.SHR, c4448M1558, c4448M1559, "J"));
            case 140:
                return m12630(new C17126(EnumC22260.USHR, c4448M1558, c4448M1559, "I"));
            case 141:
                return m12630(new C17126(EnumC22260.USHR, c4448M1558, c4448M1559, "J"));
            case 142:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.EQ, c4448M1558, c4448M1559, EnumC5940.ZIL.f20313), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 143:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.GE, c4448M1558, c4448M1559, "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 144:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.GT, c4448M1558, c4448M1559, "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 145:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.LE, c4448M1558, c4448M1559, "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 146:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.LT, c4448M1558, c4448M1559, "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 147:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.NE, c4448M1558, c4448M1559, EnumC5940.ZIL.f20313), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case EnumC24309.f78687 /* 154 */:
                C23315 c23315 = ((C13046) abstractC15283).f41760;
                c0194.m1561(C4360.m13864(new C3702(c4448M1558, c23315.m52462(), c23315.m52460(), c23315.m52461()), c4448M1559));
                return null;
            case 155:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "D"));
            case 156:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "F"));
            case 157:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "I"));
            case 158:
                return m12630(C23840.m53166(c4448M1558, c4448M1559, "J"));
            case 159:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "D"));
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "F"));
            case 161:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "I"));
            case 162:
                return m12630(C23840.m53168(c4448M1559, c4448M1558, "J"));
            case 163:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "D"));
            case 164:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "F"));
            case 165:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "I"));
            case 166:
                return m12630(C23840.m53167(c4448M1558, c4448M1559, "J"));
            case 167:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "D"));
            case 168:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "F"));
            case 169:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "I"));
            case 170:
                return m12630(C23840.m53169(c4448M1558, c4448M1559, "J"));
            case 171:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "D"));
            case 172:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "F"));
            case 173:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "I"));
            case 174:
                return m12630(C23840.m53170(c4448M1558, c4448M1559, "J"));
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                return m12630(new C17126(EnumC22260.AND, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return m12630(new C17126(EnumC22260.AND, c4448M1558, c4448M1559, "J"));
            case 177:
                return m12630(new C17126(EnumC22260.OR, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case 178:
                return m12630(new C17126(EnumC22260.OR, c4448M1558, c4448M1559, "J"));
            case 179:
                return m12630(new C17126(EnumC22260.XOR, c4448M1558, c4448M1559, EnumC5940.ZI.f20313));
            case 180:
                return m12630(new C17126(EnumC22260.XOR, c4448M1558, c4448M1559, "J"));
            case 181:
                return m12630(new C17126(EnumC22260.SHL, c4448M1558, c4448M1559, "I"));
            case 182:
                return m12630(new C17126(EnumC22260.SHL, c4448M1558, c4448M1559, "J"));
            case 183:
                return m12630(new C17126(EnumC22260.SHR, c4448M1558, c4448M1559, "I"));
            case 184:
                return m12630(new C17126(EnumC22260.SHR, c4448M1558, c4448M1559, "J"));
            case 185:
                return m12630(new C17126(EnumC22260.USHR, c4448M1558, c4448M1559, "I"));
            case 186:
                return m12630(new C17126(EnumC22260.USHR, c4448M1558, c4448M1559, "J"));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12628(AbstractC15283 abstractC15283, Object obj, Object obj2, Object obj3) {
        C18093 c18093 = (C18093) obj;
        C18093 c18094 = (C18093) obj2;
        C18093 c18095 = (C18093) obj3;
        if (c18093 == null || c18094 == null || c18095 == null) {
            m12632(abstractC15283);
            return m12630(C23840.m53165(0));
        }
        C0194 c0194 = this.f13387;
        C4448 c4448M1558 = c0194.m1558(c18093);
        C4448 c4448M1559 = c0194.m1558(c18094);
        C4448 c4448M15510 = c0194.m1558(c18095);
        switch (C14363.f45289[abstractC15283.f49969.ordinal()]) {
            case 187:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, EnumC5940.IF.f20313), c4448M15510));
                return null;
            case 188:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, "Z"), c4448M15510));
                return null;
            case 189:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, "B"), c4448M15510));
                return null;
            case 190:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, "C"), c4448M15510));
                return null;
            case 191:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, "L"), c4448M15510));
                return null;
            case 192:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, "S"), c4448M15510));
                return null;
            case 193:
                c0194.m1561(C4360.m13864(new C25332(c4448M1558, c4448M1559, EnumC5940.JD.f20313), c4448M15510));
                return null;
            default:
                return null;
        }
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object mo12631(AbstractC15283 abstractC15283, Object obj) {
        EnumC1114 enumC1114 = abstractC15283.f49969;
        C18093 c18093 = (C18093) obj;
        if (c18093 == null) {
            m12632(abstractC15283);
            return m12630(C23840.m53165(0));
        }
        C0194 c0194 = this.f13387;
        C4448 c4448M1558 = c0194.m1558(c18093);
        String str = "I";
        switch (C14363.f45289[enumC1114.ordinal()]) {
            case 28:
                return m12630(new C2956(EnumC22260.NOT, c4448M1558, "I"));
            case 29:
                return m12630(new C2956(EnumC22260.NOT, c4448M1558, "J"));
            case 30:
                return m12630(new C2956(EnumC22260.NEG, c4448M1558, "D"));
            case 31:
                return m12630(new C2956(EnumC22260.NEG, c4448M1558, "F"));
            case 32:
                return m12630(new C2956(EnumC22260.NEG, c4448M1558, "I"));
            case 33:
                return m12630(new C2956(EnumC22260.NEG, c4448M1558, "J"));
            case 34:
                return m12630(new C17872(c4448M1558, "I", "B"));
            case 35:
                return m12630(new C17872(c4448M1558, "I", "C"));
            case 36:
                return m12630(new C17872(c4448M1558, "I", "D"));
            case 37:
                return m12630(new C17872(c4448M1558, "I", "F"));
            case 38:
                return m12630(new C17872(c4448M1558, "I", "J"));
            case 39:
                return m12630(new C17872(c4448M1558, "I", "S"));
            case 40:
                return m12630(new C17872(c4448M1558, "F", "D"));
            case 41:
                return m12630(new C17872(c4448M1558, "F", "I"));
            case 42:
                return m12630(new C17872(c4448M1558, "F", "J"));
            case 43:
                return m12630(new C17872(c4448M1558, "D", "F"));
            case 44:
                return m12630(new C17872(c4448M1558, "D", "I"));
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return m12630(new C17872(c4448M1558, "D", "J"));
            case 46:
                return m12630(new C17872(c4448M1558, "J", "D"));
            case 47:
                return m12630(new C17872(c4448M1558, "J", "F"));
            case 48:
                return m12630(new C17872(c4448M1558, "J", "I"));
            case 49:
                return m12630(new C2956(EnumC22260.LENGTH, c4448M1558, null));
            case 50:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.EQ, c4448M1558, C23840.m53165(0), EnumC5940.ZIL.f20313), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 51:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.GE, c4448M1558, C23840.m53165(0), "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 52:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.GT, c4448M1558, C23840.m53165(0), "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 53:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.LE, c4448M1558, C23840.m53165(0), "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.LT, c4448M1558, C23840.m53165(0), "I"), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                c0194.m1561(C4360.m13862(new C17126(EnumC22260.NE, c4448M1558, C23840.m53165(0), EnumC5940.ZIL.f20313), c0194.m1559(((C11554) abstractC15283).f36338)));
                return null;
            case 56:
            case 57:
                C17347[] c17347Arr = ((AbstractC10808) abstractC15283).f34296;
                C11817[] c11817Arr = new C11817[c17347Arr.length];
                for (int i = 0; i < c17347Arr.length; i++) {
                    c11817Arr[i] = c0194.m1559(c17347Arr[i]);
                }
                C11817 c11817 = new C11817();
                if (enumC1114 == EnumC1114.f4072) {
                    c0194.m1561(new C14800(c4448M1558, ((C16029) abstractC15283).f51998, c11817Arr, c11817));
                } else {
                    c0194.m1561(new C25244(c4448M1558, ((C23489) abstractC15283).f75949, c11817Arr, c11817));
                }
                c0194.m1561(c11817);
                return null;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                C23315 c23315 = ((C13046) abstractC15283).f41760;
                c0194.m1561(C4360.m13864(new C19364(c23315.m52462(), c23315.m52460(), c23315.m52461()), c4448M1558));
                return null;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                C23315 c23316 = ((C13046) abstractC15283).f41760;
                return m12630(new C3702(c4448M1558, c23316.m52462(), c23316.m52460(), c23316.m52461()));
            case 72:
                return m12630(new C1465(EnumC22260.INSTANCE_OF, c4448M1558, ((C4097) abstractC15283).f13957));
            case 73:
                return m12630(new C1465(EnumC22260.NEW_ARRAY, c4448M1558, ((C4097) abstractC15283).f13957.substring(1)));
            case 74:
                return m12630(new C1465(EnumC22260.CHECK_CAST, c4448M1558, ((C4097) abstractC15283).f13957));
            case 75:
                c0194.m1561(new C18530(EnumC20768.LOCK, c4448M1558));
                return null;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                c0194.m1561(new C18530(EnumC20768.UNLOCK, c4448M1558));
                return null;
            case 77:
                c0194.m1561(C4360.m13863(c4448M1558));
                return null;
            case 78:
            case 79:
                return m12630(C23840.m53166(c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 80:
            case 81:
                return m12630(C23840.m53168(c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                return m12630(C23840.m53167(c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 84:
            case 85:
                return m12630(C23840.m53169(c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                return m12630(C23840.m53170(c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 88:
            case 89:
                int i2 = ((C12300) abstractC15283).f39535;
                C16380 c16380M53165 = C23840.m53165(i2);
                if (i2 >= 0 && i2 <= 1) {
                    str = EnumC5940.ZI.f20313;
                }
                return m12630(new C17126(EnumC22260.AND, c4448M1558, c16380M53165, str));
            case 90:
            case 91:
                int i3 = ((C12300) abstractC15283).f39535;
                C16380 c16380M53166 = C23840.m53165(i3);
                if (i3 >= 0 && i3 <= 1) {
                    str = EnumC5940.ZI.f20313;
                }
                return m12630(new C17126(EnumC22260.OR, c4448M1558, c16380M53166, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
                int i4 = ((C12300) abstractC15283).f39535;
                C16380 c16380M53167 = C23840.m53165(i4);
                if (i4 >= 0 && i4 <= 1) {
                    str = EnumC5940.ZI.f20313;
                }
                return m12630(new C17126(EnumC22260.XOR, c4448M1558, c16380M53167, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                return m12630(new C17126(EnumC22260.SHL, c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 95:
                return m12630(new C17126(EnumC22260.SHR, c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 96:
                return m12630(new C17126(EnumC22260.USHR, c4448M1558, C23840.m53165(((C12300) abstractC15283).f39535), "I"));
            case 97:
                c0194.m1561(new C20022(EnumC20768.FILL_ARRAY_DATA, c4448M1558, new C16380(((C5589) abstractC15283).f19405)));
                return null;
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo12633(AbstractC15283 abstractC15283, Object obj) {
        C18093 c18093 = (C18093) obj;
        if (c18093 == null) {
            m12632(abstractC15283);
            return;
        }
        C0194 c0194 = this.f13387;
        c0194.m1561(new C18530(EnumC20768.RETURN, c0194.m1558(c18093)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18093 m12630(AbstractC11071 abstractC11071) {
        C0194 c0194 = this.f13387;
        C4448 c4448M1556 = c0194.m1556();
        c0194.m1561(C4360.m13864(c4448M1556, abstractC11071));
        return new C18093(c4448M1556);
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12625(AbstractC15283 abstractC15283) {
        switch (C14363.f45289[abstractC15283.f49969.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
                Integer num = (Integer) ((C22743) abstractC15283).f73804;
                num.getClass();
                return m12630(new C16380(num));
            case 11:
            case 12:
            case 13:
            case 14:
                Long l2 = (Long) ((C22743) abstractC15283).f73804;
                l2.getClass();
                return m12630(new C16380(l2));
            case 15:
                return m12630(new C16380((C15855) ((C22743) abstractC15283).f73804));
            case 16:
            case 17:
                return m12630(new C16380((String) ((C22743) abstractC15283).f73804));
            case 18:
                return m12630(new C16380((C20331) ((C22743) abstractC15283).f73804));
            case 19:
                return m12630(new C16380((C12126) ((C22743) abstractC15283).f73804));
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                C23315 c23315 = ((C13046) abstractC15283).f41760;
                return m12630(new C19364(c23315.m52462(), c23315.m52460(), c23315.m52461()));
            case 27:
                return m12630(new C14888(((C4097) abstractC15283).f13957));
            default:
                return null;
        }
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12629(AbstractC15283 abstractC15283, ArrayList arrayList) {
        C6686 c6686;
        EnumC1114 enumC1114 = abstractC15283.f49969;
        Iterator it = arrayList.iterator();
        do {
            int i = 0;
            if (!it.hasNext()) {
                int i2 = C14363.f45289[enumC1114.ordinal()];
                C0194 c0194 = this.f13387;
                switch (i2) {
                    case 204:
                    case 205:
                        C18093 c18093 = new C18093();
                        String strSubstring = ((C1860) abstractC15283).f6262.substring(1);
                        c0194.m1561(C4360.m13864(c0194.m1558(c18093), new C1465(EnumC22260.NEW_ARRAY, C23840.m53165(arrayList.size()), strSubstring)));
                        while (i < arrayList.size()) {
                            c0194.m1561(C4360.m13864(new C25332(c0194.m1558(c18093), C23840.m53165(i), strSubstring), c0194.m1558((C18093) arrayList.get(i))));
                            i++;
                        }
                        return c18093;
                    case 206:
                    case 207:
                        int size = arrayList.size();
                        AbstractC11071[] abstractC11071Arr = new AbstractC11071[size];
                        while (i < size) {
                            abstractC11071Arr[i] = c0194.m1558((C18093) arrayList.get(i));
                            i++;
                        }
                        C24807 c24807 = ((C24981) abstractC15283).f80904;
                        C12651 c12651 = new C12651(EnumC22260.INVOKE_CUSTOM, abstractC11071Arr, c24807);
                        if ("V".equals(c24807.m55324().m30291())) {
                            c0194.m1561(new C0631(c12651));
                            return null;
                        }
                        return m12630(c12651);
                    case 208:
                    case 209:
                        int size2 = arrayList.size();
                        AbstractC11071[] abstractC11071Arr2 = new AbstractC11071[size2];
                        while (i < size2) {
                            abstractC11071Arr2[i] = c0194.m1558((C18093) arrayList.get(i));
                            i++;
                        }
                        C16775 c16775 = (C16775) abstractC15283;
                        C12126 c12126 = c16775.f54144;
                        C24586 c24586 = new C24586(EnumC22260.INVOKE_POLYMORPHIC, abstractC11071Arr2, c12126, c16775.f54145);
                        if ("V".equals(c12126.m30291())) {
                            c0194.m1561(new C0631(c24586));
                            return null;
                        }
                        return m12630(c24586);
                    default:
                        int size3 = arrayList.size();
                        AbstractC11071[] abstractC11071Arr3 = new AbstractC11071[size3];
                        while (i < size3) {
                            abstractC11071Arr3[i] = c0194.m1558((C18093) arrayList.get(i));
                            i++;
                        }
                        C3177 c3177 = ((C17521) abstractC15283).f56955;
                        switch (C14363.f45289[enumC1114.ordinal()]) {
                            case 194:
                            case 195:
                                c6686 = new C6686(EnumC22260.INVOKE_VIRTUAL, abstractC11071Arr3, c3177.m10371(), c3177.m10374(), c3177.m10375(), c3177.m10372());
                                break;
                            case 196:
                            case 197:
                            case 198:
                            case 199:
                                c6686 = new C6686(EnumC22260.INVOKE_SPECIAL, abstractC11071Arr3, c3177.m10371(), c3177.m10374(), c3177.m10375(), c3177.m10372());
                                break;
                            case 200:
                            case 201:
                                c6686 = new C6686(EnumC22260.INVOKE_STATIC, abstractC11071Arr3, c3177.m10371(), c3177.m10374(), c3177.m10375(), c3177.m10372());
                                break;
                            case 202:
                            case 203:
                                c6686 = new C6686(EnumC22260.INVOKE_INTERFACE, abstractC11071Arr3, c3177.m10371(), c3177.m10374(), c3177.m10375(), c3177.m10372());
                                break;
                            default:
                                throw new RuntimeException();
                        }
                        if ("V".equals(c3177.m10372())) {
                            c0194.m1561(new C0631(c6686));
                            return null;
                        }
                        return m12630(c6686);
                }
            }
        } while (((C18093) it.next()) != null);
        m12632(abstractC15283);
        return m12630(C23840.m53165(0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12632(AbstractC15283 abstractC15283) {
        String str;
        int[] iArr = C14363.f45289;
        EnumC1114 enumC1114 = abstractC15283.f49969;
        switch (iArr[enumC1114.ordinal()]) {
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
                str = "can't get operand(s) for " + enumC1114 + ", wrong position ?";
                break;
            default:
                str = "can't get operand(s) for " + enumC1114 + ", out-of-range or not initialized ?";
                break;
        }
        System.err.println("WARN: " + str);
        this.f13387.m1561(C4360.m13863(C23840.m53164(new AbstractC11071[]{new C16380(C25272.m56409("d2j: ", str))}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
    }
}
