package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۛۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f21377;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1610 f21378;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C18959 m17997(InterfaceC7377 interfaceC7377, boolean z) {
        InterfaceC7925 interfaceC7925Mo20255;
        try {
            if (interfaceC7377.mo20259() != EnumC14088.CALL_SITE) {
                interfaceC7925Mo20255 = null;
            } else {
                InterfaceC11017 interfaceC11017Mo20263 = interfaceC7377.mo20263();
                interfaceC7925Mo20255 = interfaceC11017Mo20263 != null ? (InterfaceC7925) interfaceC11017Mo20263 : interfaceC7377.mo20255();
            }
            if (interfaceC7925Mo20255 == null) {
                throw new C8597("Failed to get call site for insn: " + interfaceC7377);
            }
            interfaceC7925Mo20255.mo2888();
            List listMo2889 = interfaceC7925Mo20255.mo2889();
            boolean zM20599 = C7532.m20599(listMo2889);
            C2551 c2551 = this.f21377;
            if (zM20599) {
                return C7532.m20598(c2551, interfaceC7377, z, listMo2889);
            }
            if (C2211.m7542(listMo2889)) {
                return C2211.m7540(interfaceC7377, listMo2889);
            }
            try {
                return C9768.m25438(c2551, interfaceC7377, z, listMo2889);
            } catch (Exception e) {
                c2551.m31136("Failed to decode invoke-custom: \n" + C4123.m13221(listMo2889, "\n") + ",\n exception: " + C4123.m13224(e));
                C18959 c18959 = new C18959(EnumC24203.NOP, 0);
                c18959.mo17866(EnumC1763.SYNTHETIC);
                c18959.mo17863(C11457.f36007, new C15514("Failed to decode invoke-custom: " + listMo2889, e));
                return c18959;
            }
        } catch (Exception e2) {
            throw new C8597(C16076.m38224(e2, new StringBuilder("'invoke-custom' instruction processing error: ")), e2);
        }
    }

    public C6303(C2551 c2551) {
        this.f21377 = c2551;
        this.f21378 = c2551.mo8527();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17993(C6303 c6303, C18959[] c18959Arr, InterfaceC7377 interfaceC7377) {
        C18959 c18959M17999;
        C2551 c2551 = c6303.f21377;
        int offset = interfaceC7377.getOffset();
        try {
            interfaceC7377.mo20260();
            c18959M17999 = c6303.m17999(interfaceC7377);
        } catch (Exception e) {
            C11457 c11457 = C11457.f36007;
            boolean zMo17867 = c2551.mo17867(c11457);
            C23977.m53506(c2551, "Failed to decode insn: " + interfaceC7377, e);
            if (zMo17867) {
                throw new C8597("Failed to decode insn: " + interfaceC7377, e);
            }
            C18959 c18959 = new C18959(EnumC24203.NOP, 0);
            c18959.mo17863(c11457, new C15514(C16076.m38224(e, new StringBuilder("decode failed: ")), e));
            c18959M17999 = c18959;
        }
        c18959M17999.m44024(offset);
        c18959Arr[offset] = c18959M17999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m17999(InterfaceC7377 interfaceC7377) throws C19039 {
        int i = C12268.f39452[interfaceC7377.mo20254().ordinal()];
        C1610 c1610 = this.f21378;
        C2551 c2551 = this.f21377;
        switch (i) {
            case 1:
                return new C18959(EnumC24203.NOP, 0);
            case 2:
                EnumC24203 enumC24203 = EnumC24203.MOVE_RESULT;
                AbstractC1566 abstractC1566 = AbstractC1566.f5420;
                int i2 = AbstractC16481.f53441;
                C6041 c6041 = new C6041(interfaceC7377.mo20252(0), abstractC1566);
                C18959 c18959 = new C18959(enumC24203, 0);
                c18959.m44031(c6041);
                return c18959;
            case 3:
                AbstractC1566 abstractC1567 = AbstractC1566.f5411;
                int i3 = AbstractC16481.f53441;
                C23195 c23195M52120 = C23195.m52120(interfaceC7377.mo20261(), abstractC1567);
                return m17990(EnumC24203.CONST, new C6041(interfaceC7377.mo20252(0), c23195M52120.getType()), c23195M52120);
            case 4:
                AbstractC1566 abstractC1568 = AbstractC1566.f5425;
                int i4 = AbstractC16481.f53441;
                C23195 c23195M52121 = C23195.m52120(interfaceC7377.mo20261(), abstractC1568);
                return m17990(EnumC24203.CONST, new C6041(interfaceC7377.mo20252(0), c23195M52121.getType()), c23195M52121);
            case 5:
                C5557 c5557 = new C5557(interfaceC7377.mo20250());
                AbstractC1566 abstractC1569 = AbstractC1566.f5417;
                int i5 = AbstractC16481.f53441;
                c5557.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1569));
                return c5557;
            case 6:
                AbstractC1566 abstractC1566M5535 = AbstractC1566.m5535(interfaceC7377.mo20257());
                C13014 c13014 = new C13014(abstractC1566M5535);
                AbstractC1566 abstractC1566M5527 = AbstractC1566.m5527("java.lang.Class", Collections.singletonList(abstractC1566M5535));
                int i6 = AbstractC16481.f53441;
                c13014.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M5527));
                return c13014;
            case 7:
                EnumC24203 enumC24204 = EnumC24203.MOVE;
                AbstractC1566 abstractC15610 = AbstractC1566.f5411;
                int i7 = AbstractC16481.f53441;
                return m17990(enumC24204, new C6041(interfaceC7377.mo20252(0), abstractC15610), new C6041(interfaceC7377.mo20252(1), abstractC15610));
            case 8:
                int iMo20258 = interfaceC7377.mo20258();
                C18959 c189510 = new C18959(EnumC24203.MOVE_MULTI, iMo20258);
                for (int i8 = 0; i8 < iMo20258; i8++) {
                    AbstractC1566 abstractC15611 = AbstractC1566.f5420;
                    int i9 = AbstractC16481.f53441;
                    c189510.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(i8), abstractC15611));
                }
                return c189510;
            case 9:
                EnumC24203 enumC24205 = EnumC24203.MOVE;
                AbstractC1566 abstractC15612 = AbstractC1566.f5425;
                int i10 = AbstractC16481.f53441;
                return m17990(enumC24205, new C6041(interfaceC7377.mo20252(0), abstractC15612), new C6041(interfaceC7377.mo20252(1), abstractC15612));
            case 10:
                EnumC24203 enumC24206 = EnumC24203.MOVE;
                AbstractC1566 abstractC15613 = AbstractC1566.f5410;
                int i11 = AbstractC16481.f53441;
                return m17990(enumC24206, new C6041(interfaceC7377.mo20252(0), abstractC15613), new C6041(interfaceC7377.mo20252(1), abstractC15613));
            case 11:
                return C22711.m51189(interfaceC7377, EnumC19727.ADD, AbstractC1566.f5429);
            case 12:
                return C22711.m51189(interfaceC7377, EnumC19727.ADD, AbstractC1566.f5424);
            case 13:
                return C22711.m51189(interfaceC7377, EnumC19727.ADD, AbstractC1566.f5440);
            case 14:
                return C22711.m51189(interfaceC7377, EnumC19727.ADD, AbstractC1566.f5438);
            case 15:
                return C22711.m51190(interfaceC7377, EnumC19727.ADD, AbstractC1566.f5429);
            case 16:
                return C22711.m51189(interfaceC7377, EnumC19727.SUB, AbstractC1566.f5429);
            case 17:
                EnumC19727 enumC19727 = EnumC19727.SUB;
                AbstractC1566 abstractC15614 = AbstractC1566.f5429;
                int i12 = AbstractC16481.f53441;
                return new C22711(enumC19727, new C6041(interfaceC7377.mo20252(0), abstractC15614), C23195.m52120(interfaceC7377.mo20261(), abstractC15614), new C6041(interfaceC7377.mo20252(1), abstractC15614));
            case 18:
                return C22711.m51189(interfaceC7377, EnumC19727.SUB, AbstractC1566.f5438);
            case 19:
                return C22711.m51189(interfaceC7377, EnumC19727.SUB, AbstractC1566.f5440);
            case 20:
                return C22711.m51189(interfaceC7377, EnumC19727.SUB, AbstractC1566.f5424);
            case 21:
                return C22711.m51189(interfaceC7377, EnumC19727.MUL, AbstractC1566.f5429);
            case 22:
                return C22711.m51189(interfaceC7377, EnumC19727.MUL, AbstractC1566.f5424);
            case 23:
                return C22711.m51189(interfaceC7377, EnumC19727.MUL, AbstractC1566.f5440);
            case 24:
                return C22711.m51189(interfaceC7377, EnumC19727.MUL, AbstractC1566.f5438);
            case 25:
                return C22711.m51190(interfaceC7377, EnumC19727.MUL, AbstractC1566.f5429);
            case 26:
                return C22711.m51189(interfaceC7377, EnumC19727.DIV, AbstractC1566.f5429);
            case 27:
                return C22711.m51189(interfaceC7377, EnumC19727.REM, AbstractC1566.f5429);
            case 28:
                return C22711.m51189(interfaceC7377, EnumC19727.REM, AbstractC1566.f5438);
            case 29:
                return C22711.m51189(interfaceC7377, EnumC19727.REM, AbstractC1566.f5440);
            case 30:
                return C22711.m51189(interfaceC7377, EnumC19727.REM, AbstractC1566.f5424);
            case 31:
                return C22711.m51189(interfaceC7377, EnumC19727.DIV, AbstractC1566.f5424);
            case 32:
                return C22711.m51189(interfaceC7377, EnumC19727.DIV, AbstractC1566.f5440);
            case 33:
                return C22711.m51189(interfaceC7377, EnumC19727.DIV, AbstractC1566.f5438);
            case 34:
                return C22711.m51190(interfaceC7377, EnumC19727.DIV, AbstractC1566.f5429);
            case 35:
                return C22711.m51190(interfaceC7377, EnumC19727.REM, AbstractC1566.f5429);
            case 36:
                return C22711.m51189(interfaceC7377, EnumC19727.AND, AbstractC1566.f5429);
            case 37:
                return C22711.m51190(interfaceC7377, EnumC19727.AND, AbstractC1566.f5429);
            case 38:
                return C22711.m51190(interfaceC7377, EnumC19727.XOR, AbstractC1566.f5429);
            case 39:
                return C22711.m51189(interfaceC7377, EnumC19727.AND, AbstractC1566.f5438);
            case 40:
                return C22711.m51189(interfaceC7377, EnumC19727.OR, AbstractC1566.f5429);
            case 41:
                return C22711.m51190(interfaceC7377, EnumC19727.OR, AbstractC1566.f5429);
            case 42:
                return C22711.m51189(interfaceC7377, EnumC19727.XOR, AbstractC1566.f5429);
            case 43:
                return C22711.m51189(interfaceC7377, EnumC19727.OR, AbstractC1566.f5438);
            case 44:
                return C22711.m51189(interfaceC7377, EnumC19727.XOR, AbstractC1566.f5438);
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return C22711.m51189(interfaceC7377, EnumC19727.USHR, AbstractC1566.f5429);
            case 46:
                return C22711.m51189(interfaceC7377, EnumC19727.USHR, AbstractC1566.f5438);
            case 47:
                return C22711.m51189(interfaceC7377, EnumC19727.SHL, AbstractC1566.f5429);
            case 48:
                return C22711.m51189(interfaceC7377, EnumC19727.SHL, AbstractC1566.f5438);
            case 49:
                return C22711.m51189(interfaceC7377, EnumC19727.SHR, AbstractC1566.f5429);
            case 50:
                return C22711.m51189(interfaceC7377, EnumC19727.SHR, AbstractC1566.f5438);
            case 51:
                return C22711.m51190(interfaceC7377, EnumC19727.SHL, AbstractC1566.f5429);
            case 52:
                return C22711.m51190(interfaceC7377, EnumC19727.SHR, AbstractC1566.f5429);
            case 53:
                return C22711.m51190(interfaceC7377, EnumC19727.USHR, AbstractC1566.f5429);
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return m17987(interfaceC7377, AbstractC1566.f5429);
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return m17987(interfaceC7377, AbstractC1566.f5438);
            case 56:
                return m17987(interfaceC7377, AbstractC1566.f5440);
            case 57:
                return m17987(interfaceC7377, AbstractC1566.f5424);
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                AbstractC1566 abstractC15615 = AbstractC1566.f5429;
                C18959 c189511 = new C18959(EnumC24203.NOT, 1);
                c189511.m44031(AbstractC16481.m39109(interfaceC7377, 0, abstractC15615));
                c189511.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC15615));
                return c189511;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                AbstractC1566 abstractC15616 = AbstractC1566.f5438;
                C18959 c189512 = new C18959(EnumC24203.NOT, 1);
                c189512.m44031(AbstractC16481.m39109(interfaceC7377, 0, abstractC15616));
                c189512.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC15616));
                return c189512;
            case 60:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5421);
            case 61:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5433);
            case 62:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5407);
            case 63:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5440);
            case 64:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5424);
            case 65:
                return m17994(interfaceC7377, AbstractC1566.f5429, AbstractC1566.f5438);
            case 66:
                return m17994(interfaceC7377, AbstractC1566.f5440, AbstractC1566.f5429);
            case 67:
                return m17994(interfaceC7377, AbstractC1566.f5440, AbstractC1566.f5424);
            case 68:
                return m17994(interfaceC7377, AbstractC1566.f5440, AbstractC1566.f5438);
            case 69:
                return m17994(interfaceC7377, AbstractC1566.f5424, AbstractC1566.f5429);
            case 70:
                return m17994(interfaceC7377, AbstractC1566.f5424, AbstractC1566.f5440);
            case 71:
                return m17994(interfaceC7377, AbstractC1566.f5424, AbstractC1566.f5438);
            case 72:
                return m17994(interfaceC7377, AbstractC1566.f5438, AbstractC1566.f5429);
            case 73:
                return m17994(interfaceC7377, AbstractC1566.f5438, AbstractC1566.f5440);
            case 74:
                return m17994(interfaceC7377, AbstractC1566.f5438, AbstractC1566.f5424);
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                return new C17489(interfaceC7377, EnumC15997.EQ);
            case 77:
            case 78:
                return new C17489(interfaceC7377, EnumC15997.NE);
            case 79:
            case 80:
                return new C17489(interfaceC7377, EnumC15997.GT);
            case 81:
            case 82:
                return new C17489(interfaceC7377, EnumC15997.GE);
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
                return new C17489(interfaceC7377, EnumC15997.LT);
            case 85:
            case HRSS1373Polynomial.K /* 86 */:
                return new C17489(interfaceC7377, EnumC15997.LE);
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                return m17989(interfaceC7377, EnumC24203.CMP_L, AbstractC1566.f5438);
            case 88:
                return m17989(interfaceC7377, EnumC24203.CMP_L, AbstractC1566.f5440);
            case 89:
                return m17989(interfaceC7377, EnumC24203.CMP_L, AbstractC1566.f5424);
            case 90:
                return m17989(interfaceC7377, EnumC24203.CMP_G, AbstractC1566.f5440);
            case 91:
                return m17989(interfaceC7377, EnumC24203.CMP_G, AbstractC1566.f5424);
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                return new C16743(interfaceC7377.mo20251());
            case 93:
                c2551.mo17866(EnumC1763.RESOLVE_JAVA_JSR);
                C2312 c2312 = new C2312(interfaceC7377.mo20251());
                AbstractC1566 abstractC15617 = AbstractC1566.f5419;
                int i13 = AbstractC16481.f53441;
                c2312.m44031(new C6041(interfaceC7377.mo20252(0), abstractC15617));
                return c2312;
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                c2551.mo17866(EnumC1763.RESOLVE_JAVA_JSR);
                EnumC24203 enumC24207 = EnumC24203.JAVA_RET;
                AbstractC1566 abstractC15618 = AbstractC1566.f5419;
                int i14 = AbstractC16481.f53441;
                return m17990(enumC24207, (C6041) null, new C6041(interfaceC7377.mo20252(0), abstractC15618));
            case 95:
                EnumC24203 enumC24208 = EnumC24203.THROW;
                AbstractC1566 abstractC15619 = AbstractC1566.f5432;
                int i15 = AbstractC16481.f53441;
                return m17990(enumC24208, (C6041) null, new C6041(interfaceC7377.mo20252(0), abstractC15619));
            case 96:
                c2551.mo17866(EnumC1763.COMPUTE_POST_DOM);
                EnumC24203 enumC24209 = EnumC24203.MOVE_EXCEPTION;
                AbstractC1566 abstractC15620 = AbstractC1566.f5418;
                int i16 = AbstractC16481.f53441;
                C6041 c6042 = new C6041(interfaceC7377.mo20252(0), abstractC15620);
                C18959 c189513 = new C18959(enumC24209, 0);
                c189513.m44031(c6042);
                return c189513;
            case 97:
                return new C18959(EnumC24203.RETURN, 0);
            case 98:
                EnumC24203 enumC242010 = EnumC24203.RETURN;
                AbstractC1566 abstractC1566Mo8519 = c2551.mo8519();
                int i17 = AbstractC16481.f53441;
                return m17990(enumC242010, (C6041) null, new C6041(interfaceC7377.mo20252(0), abstractC1566Mo8519));
            case q.f /* 99 */:
                C3319 c3319 = new C3319(EnumC24203.INSTANCE_OF, AbstractC1566.m5535(interfaceC7377.mo20257()), 1);
                AbstractC1566 abstractC15621 = AbstractC1566.f5436;
                int i18 = AbstractC16481.f53441;
                c3319.m44031(new C6041(interfaceC7377.mo20252(0), abstractC15621));
                c3319.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), AbstractC1566.f5410));
                return c3319;
            case 100:
                AbstractC1566 abstractC1566M5536 = AbstractC1566.m5535(interfaceC7377.mo20257());
                C3319 c33110 = new C3319(EnumC24203.CHECK_CAST, abstractC1566M5536, 1);
                int i19 = AbstractC16481.f53441;
                c33110.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M5536));
                c33110.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(interfaceC7377.mo20258() != 2 ? 0 : 1), AbstractC1566.f5410));
                return c33110;
            case 101:
                C14022 c14022M34143 = C14022.m34143(c1610, interfaceC7377.mo20253());
                C3319 c33111 = new C3319(EnumC24203.IGET, c14022M34143, 1);
                AbstractC1566 abstractC1566M17986 = m17986(c14022M34143);
                int i20 = AbstractC16481.f53441;
                c33111.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M17986));
                c33111.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), c14022M34143.m34148().getType()));
                return c33111;
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                C14022 c14022M34144 = C14022.m34143(c1610, interfaceC7377.mo20253());
                C3319 c33112 = new C3319(EnumC24203.IPUT, c14022M34144, 2);
                AbstractC1566 abstractC1566M17987 = m17986(c14022M34144);
                int i21 = AbstractC16481.f53441;
                c33112.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(0), abstractC1566M17987));
                c33112.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), c14022M34144.m34148().getType()));
                return c33112;
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                C14022 c14022M34145 = C14022.m34143(c1610, interfaceC7377.mo20253());
                C3319 c33113 = new C3319(EnumC24203.SGET, c14022M34145, 0);
                AbstractC1566 abstractC1566M17988 = m17986(c14022M34145);
                int i22 = AbstractC16481.f53441;
                c33113.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M17988));
                return c33113;
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                C14022 c14022M34146 = C14022.m34143(c1610, interfaceC7377.mo20253());
                C3319 c33114 = new C3319(EnumC24203.SPUT, c14022M34146, 1);
                AbstractC1566 abstractC1566M17989 = m17986(c14022M34146);
                int i23 = AbstractC16481.f53441;
                c33114.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(0), abstractC1566M17989));
                return c33114;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                C18959 c189514 = new C18959(EnumC24203.ARRAY_LENGTH, 1);
                AbstractC1566 abstractC15622 = AbstractC1566.f5429;
                int i24 = AbstractC16481.f53441;
                c189514.m44031(new C6041(interfaceC7377.mo20252(0), abstractC15622));
                c189514.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), AbstractC1566.m5528(AbstractC1566.f5420)));
                return c189514;
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return m17988(interfaceC7377, AbstractC1566.f5428, AbstractC1566.f5439);
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                AbstractC1566 abstractC15623 = AbstractC1566.f5436;
                return m17988(interfaceC7377, abstractC15623, abstractC15623);
            case 108:
                return m17988(interfaceC7377, AbstractC1566.f5421, AbstractC1566.f5434);
            case 109:
                AbstractC1566 abstractC15624 = AbstractC1566.f5437;
                return m17988(interfaceC7377, abstractC15624, abstractC15624);
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                AbstractC1566 abstractC15625 = AbstractC1566.f5433;
                return m17988(interfaceC7377, abstractC15625, abstractC15625);
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                AbstractC1566 abstractC15626 = AbstractC1566.f5407;
                return m17988(interfaceC7377, abstractC15626, abstractC15626);
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                AbstractC1566 abstractC15627 = AbstractC1566.f5425;
                return m17988(interfaceC7377, abstractC15627, abstractC15627);
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                AbstractC1566 abstractC15628 = AbstractC1566.f5410;
                return m17988(interfaceC7377, abstractC15628, abstractC15628);
            case 114:
                return m17996(interfaceC7377, AbstractC1566.f5428, AbstractC1566.f5439);
            case 115:
                AbstractC1566 abstractC15629 = AbstractC1566.f5436;
                return m17996(interfaceC7377, abstractC15629, abstractC15629);
            case 116:
                AbstractC1566 abstractC15630 = AbstractC1566.f5421;
                return m17996(interfaceC7377, abstractC15630, abstractC15630);
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                AbstractC1566 abstractC15631 = AbstractC1566.f5437;
                return m17996(interfaceC7377, abstractC15631, abstractC15631);
            case 118:
                AbstractC1566 abstractC15632 = AbstractC1566.f5433;
                return m17996(interfaceC7377, abstractC15632, abstractC15632);
            case 119:
                AbstractC1566 abstractC15633 = AbstractC1566.f5407;
                return m17996(interfaceC7377, abstractC15633, abstractC15633);
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                AbstractC1566 abstractC15634 = AbstractC1566.f5425;
                return m17996(interfaceC7377, abstractC15634, abstractC15634);
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                AbstractC1566 abstractC15635 = AbstractC1566.f5410;
                return m17996(interfaceC7377, abstractC15635, abstractC15635);
            case 122:
                return m17991(interfaceC7377, EnumC0336.STATIC, false);
            case 123:
                return m17991(interfaceC7377, EnumC0336.STATIC, true);
            case 124:
                return m17991(interfaceC7377, EnumC0336.DIRECT, false);
            case q.h /* 125 */:
                return m17991(interfaceC7377, EnumC0336.INTERFACE, false);
            case 126:
                return m17991(interfaceC7377, EnumC0336.SUPER, false);
            case 127:
                return m17991(interfaceC7377, EnumC0336.VIRTUAL, false);
            case 128:
                return m17997(interfaceC7377, false);
            case 129:
                InterfaceC13890 interfaceC13890M19449 = C7106.m19449(interfaceC7377);
                if (interfaceC13890M19449 != null) {
                    C21965 c21965M49693 = C21965.m49693(c1610, interfaceC13890M19449);
                    return new C21219(c21965M49693, interfaceC7377, (c21965M49693.m49703() || C17359.equals(c21965M49693.m49700(), c2551.m8536().m55571())) ? EnumC0336.DIRECT : EnumC0336.SUPER, false);
                }
                throw new C8597("Failed to load method reference for insn: " + interfaceC7377);
            case 130:
                return m17995(interfaceC7377, false);
            case 131:
                return m17991(interfaceC7377, EnumC0336.DIRECT, true);
            case 132:
                return m17991(interfaceC7377, EnumC0336.INTERFACE, true);
            case 133:
                return m17991(interfaceC7377, EnumC0336.SUPER, true);
            case 134:
                return m17991(interfaceC7377, EnumC0336.VIRTUAL, true);
            case 135:
                return m17997(interfaceC7377, true);
            case 136:
                return m17995(interfaceC7377, true);
            case 137:
                AbstractC1566 abstractC1566M5537 = AbstractC1566.m5535(interfaceC7377.mo20257());
                C3319 c33115 = new C3319(EnumC24203.NEW_INSTANCE, abstractC1566M5537, 0);
                int i25 = AbstractC16481.f53441;
                c33115.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M5537));
                return c33115;
            case 138:
                AbstractC1566 abstractC1566M5538 = AbstractC1566.m5535(interfaceC7377.mo20257());
                int iMo20261 = (int) interfaceC7377.mo20261();
                if (iMo20261 != 0) {
                    abstractC1566M5538 = AbstractC1566.m5525(iMo20261, abstractC1566M5538);
                }
                int iMo20259 = interfaceC7377.mo20258();
                C7794 c7794 = new C7794(iMo20259 - 1, abstractC1566M5538);
                int i26 = AbstractC16481.f53441;
                c7794.m44031(new C6041(interfaceC7377.mo20252(0), abstractC1566M5538));
                for (int i27 = 1; i27 < iMo20259; i27++) {
                    c7794.mo44014((AbstractC16481) AbstractC16481.m39108(interfaceC7377.mo20252(i27), AbstractC1566.f5429, true));
                }
                C18170.m42339(c2551, EnumC21154.NEW_ARRAY);
                return c7794;
            case 139:
                AbstractC1566 abstractC15636 = AbstractC1566.f5408;
                int i28 = AbstractC16481.f53441;
                return new C11522(interfaceC7377.mo20251(), new C6041(interfaceC7377.mo20252(0), abstractC15636));
            case 140:
                InterfaceC11017 interfaceC11017Mo20263 = interfaceC7377.mo20263();
                C17359.requireNonNull(interfaceC11017Mo20263);
                return new C1828((InterfaceC22206) interfaceC11017Mo20263);
            case 141:
                return m17992(interfaceC7377, false);
            case 142:
                return m17992(interfaceC7377, true);
            case 143:
                return m17998(interfaceC7377, true);
            case 144:
                return m17998(interfaceC7377, false);
            case 145:
            case 146:
                return new C10030((InterfaceC22952) interfaceC7377.mo20263());
            case 147:
                EnumC24203 enumC242011 = EnumC24203.MONITOR_ENTER;
                AbstractC1566 abstractC15637 = AbstractC1566.f5410;
                int i29 = AbstractC16481.f53441;
                return m17990(enumC242011, (C6041) null, new C6041(interfaceC7377.mo20252(0), abstractC15637));
            case 148:
                EnumC24203 enumC242012 = EnumC24203.MONITOR_EXIT;
                AbstractC1566 abstractC15638 = AbstractC1566.f5410;
                int i30 = AbstractC16481.f53441;
                return m17990(enumC242012, (C6041) null, new C6041(interfaceC7377.mo20252(0), abstractC15638));
            default:
                throw new C19039("Unknown instruction: '" + interfaceC7377 + '\'');
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C1082 m17998(InterfaceC7377 interfaceC7377, boolean z) {
        C1082 c1082 = new C1082(AbstractC16481.m39109(interfaceC7377, 0, AbstractC1566.f5434), interfaceC7377.mo20251(), z);
        InterfaceC11017 interfaceC11017Mo20263 = interfaceC7377.mo20263();
        if (interfaceC11017Mo20263 != null) {
            c1082.m4067(new C10030((InterfaceC22952) interfaceC11017Mo20263), interfaceC7377.mo20251());
        }
        EnumC1763 enumC1763 = EnumC1763.COMPUTE_POST_DOM;
        C2551 c2551 = this.f21377;
        c2551.mo17866(enumC1763);
        C18170.m42339(c2551, EnumC21154.SWITCH);
        return c1082;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m17986(C14022 c14022) {
        C17467 c17467M5670 = this.f21378.m5670(c14022);
        if (c17467M5670 != null) {
            return c17467M5670.getType();
        }
        return c14022.m34149();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24949 m17992(InterfaceC7377 interfaceC7377, boolean z) {
        AbstractC1566 abstractC1566Mo5557 = AbstractC1566.m5535(interfaceC7377.mo20257()).mo5557();
        boolean zM5556 = abstractC1566Mo5557.m5556();
        int iMo20258 = interfaceC7377.mo20258();
        AbstractC16481[] abstractC16481Arr = new AbstractC16481[iMo20258];
        if (z) {
            int iMo20252 = interfaceC7377.mo20252(0);
            for (int i = 0; i < iMo20258; i++) {
                abstractC16481Arr[i] = AbstractC16481.m39108(iMo20252, abstractC1566Mo5557, zM5556);
                iMo20252++;
            }
        } else {
            for (int i2 = 0; i2 < iMo20258; i2++) {
                abstractC16481Arr[i2] = AbstractC16481.m39108(interfaceC7377.mo20252(i2), abstractC1566Mo5557, zM5556);
            }
        }
        C24949 c24949 = new C24949(iMo20258, abstractC1566Mo5557);
        for (int i3 = 0; i3 < iMo20258; i3++) {
            c24949.mo44014(abstractC16481Arr[i3]);
        }
        return c24949;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m17989(InterfaceC7377 interfaceC7377, EnumC24203 enumC24203, AbstractC1566 abstractC1566) {
        C18959 c18959 = new C18959(enumC24203, 2);
        c18959.m44031(AbstractC16481.m39109(interfaceC7377, 0, AbstractC1566.f5429));
        c18959.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC1566));
        c18959.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(2), abstractC1566));
        return c18959;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3319 m17994(InterfaceC7377 interfaceC7377, AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        C3319 c3319 = new C3319(EnumC24203.CAST, abstractC1567, 1);
        c3319.m44031(AbstractC16481.m39109(interfaceC7377, 0, abstractC1567));
        c3319.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC1566));
        return c3319;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C18235 m17995(InterfaceC7377 interfaceC7377, boolean z) {
        InterfaceC13890 interfaceC13890M19449 = C7106.m19449(interfaceC7377);
        if (interfaceC13890M19449 == null) {
            throw new C8597("Failed to load method reference for insn: " + interfaceC7377);
        }
        C1610 c1610 = this.f21378;
        C21965 c21965M49693 = C21965.m49693(c1610, interfaceC13890M19449);
        C3530 c3530Mo20262 = interfaceC7377.mo20262(interfaceC7377.mo20251());
        return new C18235(C21965.m49691(c1610, c21965M49693.m49700(), c21965M49693.getName(), C4123.m13226(c3530Mo20262.mo11554(), new C3398(5)), AbstractC1566.m5535(c3530Mo20262.mo11553())), interfaceC7377, c3530Mo20262, c21965M49693, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21219 m17991(InterfaceC7377 interfaceC7377, EnumC0336 enumC0336, boolean z) {
        InterfaceC13890 interfaceC13890M19449 = C7106.m19449(interfaceC7377);
        if (interfaceC13890M19449 == null) {
            throw new C8597("Failed to load method reference for insn: " + interfaceC7377);
        }
        return new C21219(C21965.m49693(this.f21378, interfaceC13890M19449), interfaceC7377, enumC0336, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m17988(InterfaceC7377 interfaceC7377, AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        C18959 c18959 = new C18959(EnumC24203.AGET, 2);
        c18959.m44031(AbstractC16481.m39111(interfaceC7377, 0, abstractC1567));
        c18959.mo44014((AbstractC16481) AbstractC16481.m39111(interfaceC7377, 1, AbstractC1566.m5528(abstractC1566)));
        c18959.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(2), AbstractC1566.f5434));
        return c18959;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18959 m17996(InterfaceC7377 interfaceC7377, AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        C18959 c18959 = new C18959(EnumC24203.APUT, 3);
        c18959.mo44014((AbstractC16481) AbstractC16481.m39111(interfaceC7377, 1, AbstractC1566.m5528(abstractC1566)));
        c18959.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(2), AbstractC1566.f5434));
        c18959.mo44014((AbstractC16481) AbstractC16481.m39111(interfaceC7377, 0, abstractC1567));
        return c18959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m17987(InterfaceC7377 interfaceC7377, AbstractC1566 abstractC1566) {
        C18959 c18959 = new C18959(EnumC24203.NEG, 1);
        c18959.m44031(AbstractC16481.m39109(interfaceC7377, 0, abstractC1566));
        c18959.mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC1566));
        return c18959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m17990(EnumC24203 enumC24203, C6041 c6041, AbstractC16481 abstractC16481) {
        C18959 c18959 = new C18959(enumC24203, 1);
        c18959.m44031(c6041);
        c18959.mo44014(abstractC16481);
        return c18959;
    }
}
