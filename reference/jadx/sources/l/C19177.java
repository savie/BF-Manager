package l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.᩵ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBE3 */
/* JADX INFO: loaded from: classes4.dex */
public class C19177 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f61929;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC9901 f61930;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f61931;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61932;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f61933;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f61934;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7888 f61935;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3320 f61936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC4919[] f61937;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1909 f61938;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4919[] f61939;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f61940;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f61941;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16251 f61942;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX INFO: renamed from: ۙ */
    public void mo35693(C6040 c6040, int i, int i2) {
        InterfaceC4919[] interfaceC4919Arr = this.f61939;
        if (i2 == 0) {
            this.f61940 = 0;
        } else if (i2 == 20) {
            m44013((InterfaceC4919) this.f61930);
        } else if (i2 == 21) {
            m44013(m44008(0));
        } else if (i2 != 171 && i2 != 172) {
            switch (i2) {
                case 0:
                case 79:
                    this.f61940 = 0;
                    break;
                case 18:
                    m44013((InterfaceC4919) this.f61930);
                    break;
                case 46:
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
                    m44013((InterfaceC4919) this.f61936);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    m44013(m44008(0));
                    break;
                default:
                    switch (i2) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        case 88:
                            this.f61940 = 0;
                            break;
                        case 89:
                        case 90:
                        case 91:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                        case 93:
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                        case 95:
                            this.f61940 = 0;
                            for (int i3 = this.f61941; i3 != 0; i3 >>= 4) {
                                InterfaceC4919 interfaceC4919M44008 = m44008((i3 & 15) - 1);
                                if (interfaceC4919M44008 == null) {
                                    throw new NullPointerException("result == null");
                                }
                                int i4 = this.f61940;
                                interfaceC4919Arr[i4] = interfaceC4919M44008;
                                this.f61940 = i4 + 1;
                            }
                            break;
                        case 96:
                            m44013((InterfaceC4919) this.f61936);
                            break;
                        default:
                            switch (i2) {
                                case 132:
                                case 133:
                                case 134:
                                case 135:
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
                                case 152:
                                    m44013((InterfaceC4919) this.f61936);
                                    break;
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
                                case 169:
                                    this.f61940 = 0;
                                    break;
                                case 168:
                                    m44013(new C13533(this.f61929));
                                    break;
                                default:
                                    switch (i2) {
                                        case 177:
                                        case 179:
                                        case 181:
                                        case 191:
                                        case 194:
                                        case 195:
                                            this.f61940 = 0;
                                            break;
                                        case 178:
                                        case 180:
                                        case 182:
                                        case 184:
                                        case 185:
                                            C3320 type = ((InterfaceC4919) this.f61930).getType();
                                            if (type == C3320.f12280) {
                                                this.f61940 = 0;
                                            } else {
                                                m44013((InterfaceC4919) type);
                                            }
                                            break;
                                        case 183:
                                            C3320 type2 = m44008(0).getType();
                                            if (type2.m9842()) {
                                                c6040.m16385(type2);
                                            }
                                            C3320 type3 = ((InterfaceC4919) this.f61930).getType();
                                            if (type3 == C3320.f12280) {
                                                this.f61940 = 0;
                                            } else {
                                                m44013((InterfaceC4919) type3);
                                            }
                                            break;
                                        case 186:
                                            C3320 c3320M4398 = ((C1203) this.f61930).m4398();
                                            if (c3320M4398 == C3320.f12280) {
                                                this.f61940 = 0;
                                            } else {
                                                m44013((InterfaceC4919) c3320M4398);
                                            }
                                            break;
                                        case 187:
                                            m44013((InterfaceC4919) ((C6143) this.f61930).m17128().m9833(i));
                                            break;
                                        case 188:
                                        case 192:
                                            m44013((InterfaceC4919) ((C6143) this.f61930).m17128());
                                            break;
                                        case 189:
                                            m44013((InterfaceC4919) ((C6143) this.f61930).m17128().m9839());
                                            break;
                                        case 190:
                                            m44013((InterfaceC4919) this.f61936);
                                            break;
                                        case 193:
                                            m44013((InterfaceC4919) C3320.f12281);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 197:
                                                    m44013((InterfaceC4919) ((C6143) this.f61930).m17128());
                                                    break;
                                                case 198:
                                                case 199:
                                                    this.f61940 = 0;
                                                    break;
                                                default:
                                                    throw new RuntimeException("shouldn't happen: ".concat(C22475.m49983(i2)));
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            this.f61940 = 0;
        }
        int i5 = this.f61940;
        if (i5 < 0) {
            throw new C21293("results never set", null);
        }
        if (i5 == 0) {
            return;
        }
        if (this.f61942 != null) {
            c6040.m16391().mo9632(m44009(false));
            return;
        }
        C17329 c17329M16389 = c6040.m16389();
        for (int i6 = 0; i6 < this.f61940; i6++) {
            if (this.f61934) {
                c17329M16389.m40302();
            }
            c17329M16389.m40295(interfaceC4919Arr[i6]);
        }
    }

    public C19177(C1909 c1909) {
        if (c1909 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f61938 = c1909;
        this.f61937 = new InterfaceC4919[10];
        this.f61939 = new InterfaceC4919[6];
        m44026();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1909 m44025() {
        return this.f61938;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44026() {
        this.f61932 = 0;
        this.f61936 = null;
        this.f61941 = 0;
        this.f61930 = null;
        this.f61929 = 0;
        this.f61935 = null;
        this.f61933 = null;
        this.f61931 = -1;
        this.f61934 = false;
        this.f61942 = null;
        this.f61940 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44028(C6040 c6040, int i) {
        C17329 c17329M16389 = c6040.m16389();
        m44026();
        if (i > this.f61937.length) {
            this.f61937 = new InterfaceC4919[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f61937[i2] = c17329M16389.m40297();
        }
        this.f61932 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44015(C6040 c6040, C1909 c1909) {
        C9672 c9672M6222 = c1909.m6222();
        int size = c9672M6222.size();
        m44028(c6040, size);
        for (int i = 0; i < size; i++) {
            if (!C1791.m5869(c9672M6222.getType(i), this.f61937[i])) {
                throw new C21293("at stack depth " + ((size - 1) - i) + ", expected type " + c9672M6222.getType(i).mo2376() + " but found " + this.f61937[i].getType().mo2376(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44016(C6040 c6040, C3320 c3320) {
        m44028(c6040, 1);
        if (C1791.m5869(c3320, this.f61937[0])) {
            return;
        }
        throw new C21293("expected type " + c3320.mo2376() + " but found " + this.f61937[0].getType().mo2376(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44017(C6040 c6040, C3320 c3320, C3320 c3321) {
        m44028(c6040, 2);
        if (!C1791.m5869(c3320, this.f61937[0])) {
            throw new C21293("expected type " + c3320.mo2376() + " but found " + this.f61937[0].getType().mo2376(), null);
        }
        if (C1791.m5869(c3321, this.f61937[1])) {
            return;
        }
        throw new C21293("expected type " + c3321.mo2376() + " but found " + this.f61937[1].getType().mo2376(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44018(C6040 c6040, C3320 c3320, C3320 c3321, C3320 c3322) {
        m44028(c6040, 3);
        if (!C1791.m5869(c3320, this.f61937[0])) {
            throw new C21293("expected type " + c3320.mo2376() + " but found " + this.f61937[0].getType().mo2376(), null);
        }
        if (!C1791.m5869(c3321, this.f61937[1])) {
            throw new C21293("expected type " + c3321.mo2376() + " but found " + this.f61937[1].getType().mo2376(), null);
        }
        if (C1791.m5869(c3322, this.f61937[2])) {
            return;
        }
        throw new C21293("expected type " + c3322.mo2376() + " but found " + this.f61937[2].getType().mo2376(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44014(C6040 c6040, int i) {
        m44026();
        this.f61937[0] = c6040.m16391().get(i);
        this.f61932 = 1;
        this.f61931 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44029(boolean z) {
        this.f61934 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44012(C3320 c3320) {
        this.f61936 = c3320;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44027(int i) {
        this.f61941 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44020(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f61930 = abstractC9901;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44024(int i) {
        this.f61929 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44019(C7888 c7888) {
        this.f61935 = c7888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44011(ArrayList arrayList) {
        this.f61933 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44010(int i, C3320 c3320, C19073 c19073) {
        this.f61942 = C16251.m38384(i, c3320, c19073);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44007() {
        return this.f61932;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 m44008(int i) {
        if (i >= this.f61932) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f61937[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m44021() {
        return this.f61941;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m44005() {
        return this.f61930;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7888 m44023() {
        return this.f61935;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList m44030() {
        return this.f61933;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m44004() {
        return this.f61931;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m44009(boolean z) {
        if (this.f61942 == null) {
            return null;
        }
        if (this.f61940 != 1) {
            throw new C21293(C22697.m50267(new StringBuilder("local target with "), this.f61940 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC4919 interfaceC4919 = this.f61939[0];
        C3320 type = interfaceC4919.getType();
        C3320 type2 = this.f61942.getType();
        if (type == type2) {
            return z ? this.f61942.m38390(interfaceC4919) : this.f61942;
        }
        if (C1791.m5869(type2, type)) {
            if (type2 == C3320.f12289) {
                this.f61942 = this.f61942.m38390(interfaceC4919);
            }
            return this.f61942;
        }
        throw new C21293("local variable type mismatch: attempt to set or access a value of type " + type.mo2376() + " using a local variable of type " + type2.mo2376() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44013(InterfaceC4919 interfaceC4919) {
        if (interfaceC4919 == null) {
            throw new NullPointerException("result == null");
        }
        this.f61939[0] = interfaceC4919;
        this.f61940 = 1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m44022() {
        int i = this.f61940;
        if (i >= 0) {
            return i;
        }
        throw new C21293("results never set", null);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 m44006() {
        if (this.f61940 <= 0) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f61939[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }
}
