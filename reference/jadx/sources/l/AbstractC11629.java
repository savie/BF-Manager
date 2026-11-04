package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۧ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11629 extends AbstractC0540 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0443 f36470;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14612 f36471;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f36472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f36473;

    public AbstractC11629(C3523 c3523) {
        super(c3523);
        this.f36472 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29204(boolean z) {
        this.f36473 = z;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29211() {
        return this.f36473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29203(C14612 c14612) {
        this.f36471 = c14612;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m29217() {
        C14612 c14612 = this.f36471;
        return c14612 == null || c14612.m35254(this.f2260.mo5263(1).mo23442());
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29216() {
        C14612 c14612 = this.f36471;
        return c14612 == null || c14612.m35256(this.f2260.mo5263(1).mo23442());
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m29207() {
        boolean zM29198;
        int iMo11537 = this.f2260.mo11537(1);
        if (iMo11537 == 45 && this.f2260.mo11537(2) == 23 && m29213()) {
            return false;
        }
        if (iMo11537 == 40) {
            zM29198 = m29216();
        } else {
            if (iMo11537 != 44 || !m29217()) {
                return true;
            }
            zM29198 = m29198(this.f2260.mo11537(2));
        }
        return !zM29198;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m29198(int i) {
        if (i != 5 && i != 6 && i != 7 && i != 100 && i != 101 && i != 125 && i != 126 && i != 133 && i != 134) {
            switch (i) {
                case 11:
                case 16:
                case 23:
                case 25:
                case 28:
                case 30:
                case 32:
                case 35:
                case 37:
                case 89:
                case 91:
                    break;
                case 115:
                    return this.f36473;
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 138:
                                case 139:
                                case 140:
                                    break;
                                default:
                                    return i >= 40 && i <= 83 && i != 43;
                            }
                        case 84:
                        case 85:
                        case HRSS1373Polynomial.K /* 86 */:
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            return true;
                    }
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m29209() {
        return m29197(this.f2260.mo5263(1), this.f2260.mo5263(2));
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29220() {
        int i = this.f2260.mo11537(1) == 44 ? 2 : 1;
        return this.f2260.mo11537(i) == 83 && m29197(this.f2260.mo5263(1), this.f2260.mo5263(i + 1));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m29214() {
        return m29197(this.f2260.mo5263(1), this.f2260.mo5263(2));
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29218() {
        return m29197(this.f2260.mo5263(1), this.f2260.mo5263(2));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m29208() {
        return this.f36473 && this.f2260.mo11537(1) != 91;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m29202() {
        int i = 3;
        if (this.f2260.mo11537(2) == 89) {
            int i2 = 1;
            while (i2 != 0) {
                int i3 = i + 1;
                int iMo11537 = this.f2260.mo11537(i);
                if (iMo11537 == -1) {
                    return false;
                }
                if (iMo11537 == 89) {
                    i2++;
                } else if (iMo11537 == 90) {
                    i2--;
                }
                i = i3;
            }
        }
        return this.f2260.mo11537(i) == 87;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29205() {
        boolean z = false;
        if (this.f36473 && this.f2260.mo11537(1) == 115) {
            int iIndex = this.f2260.index();
            Boolean bool = (Boolean) this.f36472.get(Integer.valueOf(iIndex));
            if (bool != null) {
                return bool.booleanValue();
            }
            this.f36472.put(Integer.valueOf(iIndex), Boolean.FALSE);
            try {
                C1935 c1935 = new C1935(this.f2260);
                if (this.f36470 == null) {
                    this.f36470 = new C0443(C1935.f6495);
                }
                c1935.m24867(new C1189(c1935, this.f36470));
                c1935.f36473 = true;
                c1935.f36471 = this.f36471;
                c1935.f36472 = this.f36472;
                c1935.f36470 = this.f36470;
                c1935.m2519();
                c1935.m24869();
                c1935.m2515(new C11726());
                c1935.m6668();
                int iMo11537 = this.f2260.mo11537(1);
                if (iMo11537 == 87 || iMo11537 == 7) {
                    z = true;
                } else if (iMo11537 != 115 && iMo11537 != 116 && iMo11537 != 125 && iMo11537 != 126) {
                    if (m29201() && iMo11537 != 26 && iMo11537 != 27 && iMo11537 != 64 && iMo11537 != 65 && iMo11537 != 103) {
                        switch (iMo11537) {
                            default:
                                switch (iMo11537) {
                                    default:
                                        if (!m29198(iMo11537)) {
                                        }
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                        z = true;
                                        break;
                                }
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                            case 108:
                            case 109:
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                            case 114:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                }
            } catch (C0738 unused) {
            } catch (Throwable th) {
                this.f2260.mo11530(iIndex);
                throw th;
            }
            this.f2260.mo11530(iIndex);
            this.f36472.put(Integer.valueOf(iIndex), Boolean.valueOf(z));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m29212() {
        switch (this.f2260.mo11537(1)) {
            case 5:
            case 6:
            case 7:
            case 16:
            case 28:
            case 30:
            case 32:
            case 35:
            case 37:
            case 84:
            case 85:
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
            case 89:
            case 100:
            case 101:
            case q.h /* 125 */:
            case 126:
            case 133:
            case 134:
            case 138:
            case 139:
                return 36;
            case 8:
            case 13:
            case 29:
            case 33:
                return 26;
            case 11:
                return this.f36473 ? -1 : 16;
            case 12:
                if (this.f36473) {
                    return -1;
                }
                return 3;
            case 17:
            case 22:
            case 38:
                return 22;
            case 19:
                return 33;
            case 23:
                return this.f36473 ? -1 : 13;
            case 24:
                return 21;
            case 31:
                return 23;
            case 34:
                return 25;
            case 36:
                return 3;
            case 41:
                if (this.f2260.mo11537(2) == 140 && this.f2260.mo11537(3) == 135 && m29197(this.f2260.mo5263(1), this.f2260.mo5263(2))) {
                    return 3;
                }
                return -1;
            case 91:
                return 2;
            case 140:
                return this.f2260.mo11537(2) == 95 ? 70 : 36;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29206() {
        int iMo11537 = this.f2260.mo11537(1);
        if (iMo11537 != 125 && iMo11537 != 126 && iMo11537 != 127) {
            return false;
        }
        int iMo11538 = this.f2260.mo11537(2);
        if (iMo11538 != 5 && iMo11538 != 6 && iMo11538 != 32 && iMo11538 != 138 && iMo11538 != 140) {
            switch (iMo11538) {
                case 84:
                case 85:
                case HRSS1373Polynomial.K /* 86 */:
                    break;
                default:
                    return false;
            }
        }
        int iMo11539 = this.f2260.mo11537(3);
        if (iMo11539 != 88 && iMo11539 != 90 && iMo11539 != 103 && iMo11539 != 136) {
            switch (iMo11539) {
                default:
                    switch (iMo11539) {
                        default:
                            switch (iMo11539) {
                                case q.h /* 125 */:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                    break;
                                default:
                                    return false;
                            }
                        case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                        case 108:
                        case 109:
                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        case 114:
                            return true;
                    }
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m29200() {
        int iMo11537 = this.f2260.mo11537(1);
        if (iMo11537 != 7 && iMo11537 != 87 && iMo11537 != 89) {
            if (iMo11537 == 115) {
                return this.f36473 ? 0 : 2;
            }
            if (iMo11537 != 133) {
                if (iMo11537 != 97 && iMo11537 != 98) {
                    return 2;
                }
            } else if (!this.f36473 || !m29201()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m29219(int i) {
        int i2 = 1;
        while (i2 < i) {
            int iMo23440 = this.f2260.mo5263(i2).mo23440() + 1;
            i2++;
            if (iMo23440 != this.f2260.mo5263(i2).mo23442()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29213() {
        return this.f2260.mo11537(1) == 45 && m29197(this.f2260.mo5263(1), this.f2260.mo5263(2));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29215() {
        int iMo11537;
        if (!m29201() || (iMo11537 = this.f2260.mo11537(1)) == 93 || iMo11537 == 92) {
            return 2;
        }
        return m29198(iMo11537) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m29201() {
        return m29197(this.f2260.mo5263(-1), this.f2260.mo5263(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m29197(InterfaceC8743 interfaceC8743, InterfaceC8743 interfaceC8744) {
        if (interfaceC8743 != null) {
            for (int iMo23438 = interfaceC8743.mo23438() + 1; iMo23438 < interfaceC8744.mo23438(); iMo23438++) {
                String text = this.f2260.m11534(iMo23438).getText();
                for (int i = 0; i < text.length(); i++) {
                    char cCharAt = text.charAt(i);
                    if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m29210() {
        return this.f2260.mo11537(1) == -1 || this.f2260.mo11537(1) == 92 || !m29201();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m29199() {
        return ((this.f2260.mo11537(1) == 45 && this.f2260.mo11537(2) == 23 && m29213()) || this.f2260.mo11537(1) == 91 || this.f2260.mo11537(1) == 23 || this.f2260.mo11537(1) == 11) ? false : true;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC8743 mo2527() {
        C7155.m19727();
        return super.mo2527();
    }
}
