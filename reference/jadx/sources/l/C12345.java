package l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۨۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBE3 */
/* JADX INFO: loaded from: classes3.dex */
public class C12345 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39649;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5085 f39650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20550 f39651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f39653;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f39654;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC22239[] f39655;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6994 f39656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39657;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f39658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22239[] f39659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC13487 f39660;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20946 f39661;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30795(C1400 c1400, int i, int i2) {
        InterfaceC22239[] interfaceC22239Arr = this.f39655;
        if (i2 == 0) {
            this.f39657 = 0;
        } else if (i2 == 20) {
            m30803((InterfaceC22239) this.f39660);
        } else if (i2 == 21) {
            m30803(m30791(0));
        } else if (i2 != 171 && i2 != 172) {
            switch (i2) {
                case 0:
                case 79:
                    this.f39657 = 0;
                    break;
                case 18:
                    m30803((InterfaceC22239) this.f39660);
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
                    m30803((InterfaceC22239) this.f39650);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    m30803(m30791(0));
                    break;
                default:
                    switch (i2) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        case 88:
                            this.f39657 = 0;
                            break;
                        case 89:
                        case 90:
                        case 91:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                        case 93:
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                        case 95:
                            this.f39657 = 0;
                            for (int i3 = this.f39654; i3 != 0; i3 >>= 4) {
                                InterfaceC22239 interfaceC22239M30791 = m30791((i3 & 15) - 1);
                                if (interfaceC22239M30791 == null) {
                                    throw new NullPointerException("result == null");
                                }
                                int i4 = this.f39657;
                                interfaceC22239Arr[i4] = interfaceC22239M30791;
                                this.f39657 = i4 + 1;
                            }
                            break;
                        case 96:
                            m30803((InterfaceC22239) this.f39650);
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
                                    m30803((InterfaceC22239) this.f39650);
                                    break;
                                case 153:
                                case EnumC24309.f78687 /* 154 */:
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
                                    this.f39657 = 0;
                                    break;
                                case 168:
                                    m30803(new C10853(this.f39653));
                                    break;
                                default:
                                    switch (i2) {
                                        case 177:
                                        case 179:
                                        case 181:
                                        case 191:
                                        case 194:
                                        case 195:
                                            this.f39657 = 0;
                                            break;
                                        case 178:
                                        case 180:
                                        case 182:
                                        case 184:
                                        case 185:
                                            C5085 type = ((InterfaceC22239) this.f39660).getType();
                                            if (type == C5085.f17731) {
                                                this.f39657 = 0;
                                            } else {
                                                m30803((InterfaceC22239) type);
                                            }
                                            break;
                                        case 183:
                                            C5085 type2 = m30791(0).getType();
                                            if (type2.m15365()) {
                                                c1400.m5115(type2);
                                            }
                                            C5085 type3 = ((InterfaceC22239) this.f39660).getType();
                                            if (type3 == C5085.f17731) {
                                                this.f39657 = 0;
                                            } else {
                                                m30803((InterfaceC22239) type3);
                                            }
                                            break;
                                        case 186:
                                            C5085 c5085M16330 = ((C5503) this.f39660).m16330();
                                            if (c5085M16330 == C5085.f17731) {
                                                this.f39657 = 0;
                                            } else {
                                                m30803((InterfaceC22239) c5085M16330);
                                            }
                                            break;
                                        case 187:
                                            m30803((InterfaceC22239) ((C1028) this.f39660).m3933().m15368(i));
                                            break;
                                        case 188:
                                        case 192:
                                            m30803((InterfaceC22239) ((C1028) this.f39660).m3933());
                                            break;
                                        case 189:
                                            m30803((InterfaceC22239) ((C1028) this.f39660).m3933().m15377());
                                            break;
                                        case 190:
                                            m30803((InterfaceC22239) this.f39650);
                                            break;
                                        case 193:
                                            m30803((InterfaceC22239) C5085.f17753);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 197:
                                                    m30803((InterfaceC22239) ((C1028) this.f39660).m3933());
                                                    break;
                                                case 198:
                                                case 199:
                                                    this.f39657 = 0;
                                                    break;
                                                default:
                                                    throw new RuntimeException("shouldn't happen: ".concat(C5306.m15936(i2)));
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
            this.f39657 = 0;
        }
        int i5 = this.f39657;
        if (i5 < 0) {
            throw new C16074("results never set", null);
        }
        if (i5 == 0) {
            return;
        }
        if (this.f39661 != null) {
            c1400.m5121().mo15002(m30790(false));
            return;
        }
        C10348 c10348M5118 = c1400.m5118();
        for (int i6 = 0; i6 < this.f39657; i6++) {
            if (this.f39652) {
                c10348M5118.m26613();
            }
            c10348M5118.m26617(interfaceC22239Arr[i6]);
        }
    }

    public C12345(C6994 c6994) {
        if (c6994 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f39656 = c6994;
        this.f39659 = new InterfaceC22239[10];
        this.f39655 = new InterfaceC22239[6];
        m30811();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6994 m30804() {
        return this.f39656;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30811() {
        this.f39649 = 0;
        this.f39650 = null;
        this.f39654 = 0;
        this.f39660 = null;
        this.f39653 = 0;
        this.f39651 = null;
        this.f39658 = null;
        this.f39648 = -1;
        this.f39652 = false;
        this.f39661 = null;
        this.f39657 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30813(C1400 c1400, int i) {
        C10348 c10348M5118 = c1400.m5118();
        m30811();
        if (i > this.f39659.length) {
            this.f39659 = new InterfaceC22239[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f39659[i2] = c10348M5118.m26623();
        }
        this.f39649 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30799(C1400 c1400, C6994 c6994) {
        C13705 c13705M19309 = c6994.m19309();
        int size = c13705M19309.size();
        m30813(c1400, size);
        for (int i = 0; i < size; i++) {
            if (!C2083.m7174(c13705M19309.getType(i), this.f39659[i])) {
                throw new C16074("at stack depth " + ((size - 1) - i) + ", expected type " + c13705M19309.getType(i).mo1843() + " but found " + this.f39659[i].getType().mo1843(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30796(C1400 c1400, C5085 c5085) {
        m30813(c1400, 1);
        if (C2083.m7174(c5085, this.f39659[0])) {
            return;
        }
        throw new C16074("expected type " + c5085.mo1843() + " but found " + this.f39659[0].getType().mo1843(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30797(C1400 c1400, C5085 c5085, C5085 c5086) {
        m30813(c1400, 2);
        if (!C2083.m7174(c5085, this.f39659[0])) {
            throw new C16074("expected type " + c5085.mo1843() + " but found " + this.f39659[0].getType().mo1843(), null);
        }
        if (C2083.m7174(c5086, this.f39659[1])) {
            return;
        }
        throw new C16074("expected type " + c5086.mo1843() + " but found " + this.f39659[1].getType().mo1843(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30798(C1400 c1400, C5085 c5085, C5085 c5086, C5085 c5087) {
        m30813(c1400, 3);
        if (!C2083.m7174(c5085, this.f39659[0])) {
            throw new C16074("expected type " + c5085.mo1843() + " but found " + this.f39659[0].getType().mo1843(), null);
        }
        if (!C2083.m7174(c5086, this.f39659[1])) {
            throw new C16074("expected type " + c5086.mo1843() + " but found " + this.f39659[1].getType().mo1843(), null);
        }
        if (C2083.m7174(c5087, this.f39659[2])) {
            return;
        }
        throw new C16074("expected type " + c5087.mo1843() + " but found " + this.f39659[2].getType().mo1843(), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30794(C1400 c1400, int i) {
        m30811();
        this.f39659[0] = c1400.m5121().get(i);
        this.f39649 = 1;
        this.f39648 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30814(boolean z) {
        this.f39652 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30800(C5085 c5085) {
        this.f39650 = c5085;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30812(int i) {
        this.f39654 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30801(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f39660 = abstractC13487;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30806(int i) {
        this.f39653 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30802(C20550 c20550) {
        this.f39651 = c20550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30793(ArrayList arrayList) {
        this.f39658 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30792(int i, C5085 c5085, C3046 c3046) {
        this.f39661 = C20946.m47886(i, c5085, c3046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30789() {
        return this.f39649;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 m30791(int i) {
        if (i >= this.f39649) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f39659[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m30810() {
        return this.f39654;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m30815() {
        return this.f39660;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20550 m30805() {
        return this.f39651;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30809() {
        return this.f39658;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m30808() {
        return this.f39648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m30790(boolean z) {
        if (this.f39661 == null) {
            return null;
        }
        if (this.f39657 != 1) {
            throw new C16074(C8947.m23910(new StringBuilder("local target with "), this.f39657 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC22239 interfaceC22239 = this.f39655[0];
        C5085 type = interfaceC22239.getType();
        C5085 type2 = this.f39661.getType();
        if (type == type2) {
            return z ? this.f39661.m47892(interfaceC22239) : this.f39661;
        }
        if (C2083.m7174(type2, type)) {
            if (type2 == C5085.f17733) {
                this.f39661 = this.f39661.m47892(interfaceC22239);
            }
            return this.f39661;
        }
        throw new C16074("local variable type mismatch: attempt to set or access a value of type " + type.mo1843() + " using a local variable of type " + type2.mo1843() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30803(InterfaceC22239 interfaceC22239) {
        if (interfaceC22239 == null) {
            throw new NullPointerException("result == null");
        }
        this.f39655[0] = interfaceC22239;
        this.f39657 = 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30807() {
        int i = this.f39657;
        if (i >= 0) {
            return i;
        }
        throw new C16074("results never set", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 m30788() {
        if (this.f39657 <= 0) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f39655[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }
}
