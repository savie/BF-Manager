package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.۫ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12548 extends AbstractC7060 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C2338 f42007;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0927 f42008;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f42009;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f42010;

    public AbstractC12548(C4943 c4943) {
        super(c4943);
        this.f42010 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31225(boolean z) {
        this.f42009 = z;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31231() {
        return this.f42009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31224(C2338 c2338) {
        this.f42007 = c2338;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m31238() {
        C2338 c2338 = this.f42007;
        return c2338 == null || c2338.m7094(this.f23703.mo13724(1).mo22508());
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31227() {
        C2338 c2338 = this.f42007;
        return c2338 == null || c2338.m7096(this.f23703.mo13724(1).mo22508());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m31232() {
        boolean zM31218;
        int iMo11332 = this.f23703.mo11332(1);
        if (iMo11332 == 40) {
            zM31218 = m31227();
        } else {
            if (iMo11332 != 44 || !m31238()) {
                return true;
            }
            zM31218 = m31218(this.f23703.mo11332(2));
        }
        return !zM31218;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m31218(int i) {
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
                    return this.f42009;
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m31240() {
        return m31217(this.f23703.mo13724(1), this.f23703.mo13724(2));
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31222() {
        int i = this.f23703.mo11332(1) == 44 ? 2 : 1;
        return this.f23703.mo11332(i) == 83 && m31217(this.f23703.mo13724(1), this.f23703.mo13724(i + 1));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m31219() {
        return m31217(this.f23703.mo13724(1), this.f23703.mo13724(2));
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31233() {
        return m31217(this.f23703.mo13724(1), this.f23703.mo13724(2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31220() {
        return this.f42009 && this.f23703.mo11332(1) != 91;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31239() {
        int i = 3;
        if (this.f23703.mo11332(2) == 89) {
            int i2 = 1;
            while (i2 != 0) {
                int i3 = i + 1;
                int iMo11332 = this.f23703.mo11332(i);
                if (iMo11332 == -1) {
                    return false;
                }
                if (iMo11332 == 89) {
                    i2++;
                } else if (iMo11332 == 90) {
                    i2--;
                }
                i = i3;
            }
        }
        return this.f23703.mo11332(i) == 87;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31226() {
        boolean z = false;
        if (this.f42009 && this.f23703.mo11332(1) == 115) {
            int iIndex = this.f23703.index();
            Boolean bool = (Boolean) this.f42010.get(Integer.valueOf(iIndex));
            if (bool != null) {
                return bool.booleanValue();
            }
            this.f42010.put(Integer.valueOf(iIndex), Boolean.FALSE);
            try {
                C16781 c16781 = new C16781(this.f23703);
                if (this.f42008 == null) {
                    this.f42008 = new C0927(C16781.f53714);
                }
                c16781.m43802(new C22801(c16781, this.f42008));
                c16781.f42009 = true;
                c16781.f42007 = this.f42007;
                c16781.f42010 = this.f42010;
                c16781.f42008 = this.f42008;
                c16781.m18917();
                c16781.m43805();
                c16781.m18910(new C10797());
                c16781.m39372();
                int iMo11332 = this.f23703.mo11332(1);
                if (iMo11332 == 87 || iMo11332 == 7) {
                    z = true;
                } else if (iMo11332 != 115 && iMo11332 != 116 && iMo11332 != 125 && iMo11332 != 126) {
                    if (m31234() && iMo11332 != 26 && iMo11332 != 27 && iMo11332 != 64 && iMo11332 != 65 && iMo11332 != 103) {
                        switch (iMo11332) {
                            default:
                                switch (iMo11332) {
                                    default:
                                        if (!m31218(iMo11332)) {
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
            } catch (C6520 unused) {
            } catch (Throwable th) {
                this.f23703.mo11329(iIndex);
                throw th;
            }
            this.f23703.mo11329(iIndex);
            this.f42010.put(Integer.valueOf(iIndex), Boolean.valueOf(z));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m31223() {
        switch (this.f23703.mo11332(1)) {
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
                return this.f42009 ? -1 : 16;
            case 12:
                if (this.f42009) {
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
                return this.f42009 ? -1 : 13;
            case 24:
                return 21;
            case 31:
                return 23;
            case 34:
                return 25;
            case 36:
                return 3;
            case 41:
                if (this.f23703.mo11332(2) == 140 && this.f23703.mo11332(3) == 135 && m31217(this.f23703.mo13724(1), this.f23703.mo13724(2))) {
                    return 3;
                }
                return -1;
            case 91:
                return 2;
            case 140:
                return this.f23703.mo11332(2) == 95 ? 70 : 36;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m31229() {
        int iMo11332 = this.f23703.mo11332(1);
        if (iMo11332 != 125 && iMo11332 != 126 && iMo11332 != 127) {
            return false;
        }
        int iMo11333 = this.f23703.mo11332(2);
        if (iMo11333 != 5 && iMo11333 != 6 && iMo11333 != 32 && iMo11333 != 138 && iMo11333 != 140) {
            switch (iMo11333) {
                case 84:
                case 85:
                case HRSS1373Polynomial.K /* 86 */:
                    break;
                default:
                    return false;
            }
        }
        int iMo11334 = this.f23703.mo11332(3);
        if (iMo11334 != 88 && iMo11334 != 90 && iMo11334 != 103 && iMo11334 != 136) {
            switch (iMo11334) {
                default:
                    switch (iMo11334) {
                        default:
                            switch (iMo11334) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31230() {
        int iMo11332 = this.f23703.mo11332(1);
        if (iMo11332 != 7 && iMo11332 != 87 && iMo11332 != 89) {
            if (iMo11332 == 115) {
                return this.f42009 ? 0 : 2;
            }
            if (iMo11332 != 133) {
                if (iMo11332 != 97 && iMo11332 != 98) {
                    return 2;
                }
            } else if (!this.f42009 || !m31234()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m31221(int i) {
        int i2 = 1;
        while (i2 < i) {
            int iMo22510 = this.f23703.mo13724(i2).mo22510() + 1;
            i2++;
            if (iMo22510 != this.f23703.mo13724(i2).mo22508()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m31235() {
        return this.f23703.mo11332(1) == 45 && m31217(this.f23703.mo13724(1), this.f23703.mo13724(2));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m31237() {
        int iMo11332;
        if (!m31234() || (iMo11332 = this.f23703.mo11332(1)) == 93 || iMo11332 == 92) {
            return 2;
        }
        return m31218(iMo11332) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31234() {
        return m31217(this.f23703.mo13724(-1), this.f23703.mo13724(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31217(InterfaceC19761 interfaceC19761, InterfaceC19761 interfaceC19762) {
        if (interfaceC19761 != null) {
            for (int iMo22511 = interfaceC19761.mo22511() + 1; iMo22511 < interfaceC19762.mo22511(); iMo22511++) {
                String text = this.f23703.m13722(iMo22511).getText();
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

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m31228() {
        return this.f23703.mo11332(1) == -1 || this.f23703.mo11332(1) == 92 || !m31234();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31236() {
        return ((this.f23703.mo11332(1) == 45 && this.f23703.mo11332(2) == 23 && m31235()) || this.f23703.mo11332(1) == 91 || this.f23703.mo11332(1) == 23 || this.f23703.mo11332(1) == 11) ? false : true;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC19761 mo18924() {
        C18567.m42975();
        return super.mo18924();
    }
}
