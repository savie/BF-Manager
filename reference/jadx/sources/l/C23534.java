package l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import res.Hex;

/* JADX INFO: renamed from: l.᩹ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23534 implements InterfaceC0654 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1400 f76035 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76036;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12345 f76037;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3396 f76038;

    public C23534(C3396 c3396) {
        this.f76038 = c3396;
        this.f76037 = c3396.f11052;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52741(C1400 c1400) {
        this.f76035 = c1400;
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2859(int i, int i2) {
        throw new C16074("invalid opcode ".concat(C5306.m15936(i)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x0302  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2864(int i, int i2, C5085 c5085) {
        C12345 c12345 = this.f76037;
        if (i == 0) {
            c12345.m30811();
        } else if (i == 190) {
            C5085 c5085M26622 = this.f76035.m5118().m26622(0);
            if (!c5085M26622.m15369() && !c5085M26622.equals(C5085.f17762)) {
                C3396.m11121(this.f76038, "type mismatch: expected array type but encountered " + c5085M26622.mo1843());
                throw null;
            }
            c12345.m30796(this.f76035, C5085.f17733);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c12345.m30811();
                    break;
                case 46:
                    C5085 c5085M11115 = C3396.m11115(c5085, this.f76035.m5118().m26622(1));
                    C5085 c5085M15378 = C5085.f17762;
                    if (c5085M11115 != c5085M15378) {
                        c5085M15378 = c5085M11115.m15378();
                    }
                    c12345.m30797(this.f76035, c5085M11115, C5085.f17753);
                    c5085 = c5085M15378;
                    break;
                case 79:
                    C10348 c10348M5118 = this.f76035.m5118();
                    int i3 = c5085.m15379() ? 2 : 3;
                    C5085 c5085M26623 = c10348M5118.m26622(i3);
                    boolean zM26621 = c10348M5118.m26621(i3);
                    C5085 c5085M11116 = C3396.m11115(c5085, c5085M26623);
                    if (zM26621 && c5085M11116 != (c5085 = C5085.f17762)) {
                        c5085 = c5085M11116.m15378();
                    }
                    c12345.m30798(this.f76035, c5085M11116, C5085.f17753, c5085);
                    break;
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 126:
                case 128:
                case 130:
                    c12345.m30797(this.f76035, c5085, c5085);
                    break;
                case 116:
                    c12345.m30796(this.f76035, c5085);
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                    c12345.m30797(this.f76035, c5085, C5085.f17753);
                    break;
                case 172:
                    C5085 c5085M26624 = c5085 == C5085.f17733 ? this.f76035.m5118().m26622(0) : c5085;
                    c12345.m30796(this.f76035, c5085);
                    m52739(c5085M26624);
                    break;
                case 177:
                    c12345.m30811();
                    m52739(C5085.f17731);
                    break;
                default:
                    int i4 = 17;
                    switch (i) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            if (this.f76035.m5118().m26622(0).m15366()) {
                                throw C3396.m11117();
                            }
                            c12345.m30813(this.f76035, 1);
                            break;
                            break;
                        case 88:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            C10348 c10348M5119 = this.f76035.m5118();
                            if (c10348M5119.m26622(0).m15366()) {
                                c12345.m30813(this.f76035, 1);
                            } else if (c10348M5119.m26622(1).m15379()) {
                                c12345.m30813(this.f76035, 2);
                                i4 = 8481;
                            } else {
                                throw C3396.m11117();
                            }
                            if (i == 92) {
                                c12345.m30812(i4);
                            }
                            break;
                        case 89:
                            if (this.f76035.m5118().m26622(0).m15366()) {
                                throw C3396.m11117();
                            }
                            c12345.m30813(this.f76035, 1);
                            c12345.m30812(17);
                            break;
                            break;
                        case 90:
                            C10348 c10348M51110 = this.f76035.m5118();
                            if (!c10348M51110.m26622(0).m15379() || !c10348M51110.m26622(1).m15379()) {
                                throw C3396.m11117();
                            }
                            c12345.m30813(this.f76035, 2);
                            c12345.m30812(530);
                            break;
                            break;
                        case 91:
                            C10348 c10348M51111 = this.f76035.m5118();
                            if (c10348M51111.m26622(0).m15366()) {
                                throw C3396.m11117();
                            }
                            if (c10348M51111.m26622(1).m15366()) {
                                c12345.m30813(this.f76035, 2);
                                c12345.m30812(530);
                            } else if (c10348M51111.m26622(2).m15379()) {
                                c12345.m30813(this.f76035, 3);
                                c12345.m30812(12819);
                            } else {
                                throw C3396.m11117();
                            }
                            break;
                            break;
                        case 93:
                            C10348 c10348M51112 = this.f76035.m5118();
                            if (c10348M51112.m26622(0).m15366()) {
                                if (c10348M51112.m26622(2).m15366()) {
                                    throw C3396.m11117();
                                }
                                c12345.m30813(this.f76035, 2);
                                c12345.m30812(530);
                            } else {
                                if (c10348M51112.m26622(1).m15366() || c10348M51112.m26622(2).m15366()) {
                                    throw C3396.m11117();
                                }
                                c12345.m30813(this.f76035, 3);
                                c12345.m30812(205106);
                            }
                            break;
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                            C10348 c10348M51113 = this.f76035.m5118();
                            if (c10348M51113.m26622(0).m15366()) {
                                if (c10348M51113.m26622(2).m15366()) {
                                    c12345.m30813(this.f76035, 2);
                                    c12345.m30812(530);
                                } else if (c10348M51113.m26622(3).m15379()) {
                                    c12345.m30813(this.f76035, 3);
                                    c12345.m30812(12819);
                                } else {
                                    throw C3396.m11117();
                                }
                            } else if (c10348M51113.m26622(1).m15379()) {
                                if (c10348M51113.m26622(2).m15366()) {
                                    c12345.m30813(this.f76035, 3);
                                    c12345.m30812(205106);
                                } else if (c10348M51113.m26622(3).m15379()) {
                                    c12345.m30813(this.f76035, 4);
                                    c12345.m30812(4399427);
                                } else {
                                    throw C3396.m11117();
                                }
                            } else {
                                throw C3396.m11117();
                            }
                            break;
                        case 95:
                            C10348 c10348M51114 = this.f76035.m5118();
                            if (!c10348M51114.m26622(0).m15379() || !c10348M51114.m26622(1).m15379()) {
                                throw C3396.m11117();
                            }
                            c12345.m30813(this.f76035, 2);
                            c12345.m30812(18);
                            break;
                            break;
                        case 96:
                            c12345.m30797(this.f76035, c5085, c5085);
                            break;
                        default:
                            switch (i) {
                                case 133:
                                case 134:
                                case 135:
                                case 145:
                                case 146:
                                case 147:
                                    c12345.m30796(this.f76035, C5085.f17753);
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    c12345.m30796(this.f76035, C5085.f17732);
                                    break;
                                case 139:
                                case 140:
                                case 141:
                                    c12345.m30796(this.f76035, C5085.f17729);
                                    break;
                                case 142:
                                case 143:
                                case 144:
                                    c12345.m30796(this.f76035, C5085.f17751);
                                    break;
                                case 148:
                                    C1400 c1400 = this.f76035;
                                    C5085 c5086 = C5085.f17732;
                                    c12345.m30797(c1400, c5086, c5086);
                                    break;
                                case 149:
                                case 150:
                                    C1400 c1401 = this.f76035;
                                    C5085 c5087 = C5085.f17729;
                                    c12345.m30797(c1401, c5087, c5087);
                                    break;
                                case 151:
                                case 152:
                                    C1400 c1402 = this.f76035;
                                    C5085 c5088 = C5085.f17751;
                                    c12345.m30797(c1402, c5088, c5088);
                                    break;
                                default:
                                    mo2859(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c12345.m30796(this.f76035, C5085.f17733);
        }
        c12345.m30800(c5085);
        ((C17566) c12345).mo30795(this.f76035, i2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52739(C5085 c5085) {
        C5085 c5085M19308 = this.f76037.m30804().m19308();
        if (C2083.m7174(c5085M19308, c5085)) {
            return;
        }
        C3396.m11121(this.f76038, "return type mismatch: prototype indicates " + c5085M19308.mo1843() + ", but encountered type " + c5085.mo1843());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۙᩳܺ, short[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.۠᩵ܺ, res.Hex] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2861(int i, int i2, int i3, int i4, C5085 c5085, int i5) {
        C5085 c5086;
        Hex hex;
        boolean z;
        ?? Decode_S;
        ?? M20230 = this.f76038.f11048.m20230(i == 54 ? i3 + i2 : i2, i4);
        if (M20230 != 0) {
            Decode_S = M20230.decode_S(54);
            if (Decode_S.mo8406() != c5085.mo8406()) {
                c5086 = Decode_S;
                hex = M20230;
                c5086 = c5085;
                hex = 0;
            }
        } else {
            c5086 = c5085;
            hex = M20230;
        }
        c5086 = Decode_S;
        hex = M20230;
        C12345 c12345 = this.f76037;
        if (i == 21) {
            c12345.m30794(this.f76035, i4);
            if (hex != 0) {
                z = true;
            } else {
                z = false;
            }
            c12345.m30814(z);
            c12345.m30800(c5085);
        } else if (i == 54) {
            C3046 c3046Decode_I = hex != 0 ? hex.decode_I(54) : 0;
            c12345.m30796(this.f76035, c5085);
            c12345.m30800(c5085);
            c12345.m30792(i4, c5086, c3046Decode_I);
        } else if (i != 132) {
            if (i != 169) {
                mo2859(i, i2);
                throw null;
            }
            c12345.m30794(this.f76035, i4);
            if (hex != 0) {
                z = true;
            } else {
                z = false;
            }
            c12345.m30814(z);
            c12345.m30800(c5085);
        } else {
            C3046 c3046Decode_I2 = hex != 0 ? hex.decode_I(132) : 0;
            c12345.m30794(this.f76035, i4);
            c12345.m30792(i4, c5086, c3046Decode_I2);
            c12345.m30800(c5085);
            c12345.m30812(i5);
            c12345.m30801(C15943.m37967(i5));
        }
        ((C17566) c12345).mo30795(this.f76035, i2, i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2862(int i, int i2, int i3, AbstractC13487 abstractC13487, int i4) {
        AbstractC13487 abstractC13487M10665;
        C3396 c3396 = this.f76038;
        C12345 c12345 = this.f76037;
        if (i == 18 || i == 19) {
            if ((abstractC13487 instanceof C21165) || (abstractC13487 instanceof C7740)) {
                C3396.m11122(c3396, abstractC13487);
            }
            c12345.m30811();
            abstractC13487M10665 = abstractC13487;
        } else if (i != 189) {
            if (i == 197) {
                C5085 c5085 = C5085.f17731;
                int i5 = C6994.f23061;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i6 = 0; i6 < i4; i6++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c5085.m15375());
                c12345.m30799(this.f76035, C6994.m19304(sb.toString()));
                abstractC13487M10665 = abstractC13487;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case 179:
                        c12345.m30796(this.f76035, ((C16689) abstractC13487).getType());
                        abstractC13487M10665 = abstractC13487;
                        break;
                    case 180:
                        c12345.m30796(this.f76035, C5085.f17733);
                        abstractC13487M10665 = abstractC13487;
                        break;
                    case 181:
                        c12345.m30797(this.f76035, C5085.f17733, ((C16689) abstractC13487).getType());
                        abstractC13487M10665 = abstractC13487;
                        break;
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                        boolean z = abstractC13487 instanceof C23403;
                        AbstractC13487 abstractC13488 = abstractC13487;
                        if (z) {
                            C18181 c18181M52587 = ((C23403) abstractC13487).m52587();
                            C3396.m11120(c3396, i, c18181M52587);
                            abstractC13488 = c18181M52587;
                        }
                        if ((abstractC13488 instanceof C18181) && ((C18181) abstractC13488).m51053()) {
                            C3396.m11125(c3396, i);
                        }
                        c12345.m30799(this.f76035, ((C18181) abstractC13488).m51052(i == 184));
                        abstractC13487M10665 = abstractC13488;
                        break;
                    case 186:
                        C3396.m11119(c3396, i);
                        C3265 c3265 = (C3265) abstractC13487;
                        c12345.m30799(this.f76035, c3265.m10662());
                        abstractC13487M10665 = c3265.m10665();
                        break;
                    default:
                        c12345.m30811();
                        abstractC13487M10665 = abstractC13487;
                        break;
                }
            } else {
                c12345.m30796(this.f76035, C5085.f17733);
                abstractC13487M10665 = abstractC13487;
            }
        } else {
            c12345.m30796(this.f76035, C5085.f17753);
            abstractC13487M10665 = abstractC13487;
        }
        c12345.m30812(i4);
        c12345.m30801(abstractC13487M10665);
        ((C17566) c12345).mo30795(this.f76035, i2, i);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2860(int i, int i2, int i3, int i4) {
        C12345 c12345 = this.f76037;
        switch (i) {
            case 153:
            case EnumC24309.f78687 /* 154 */:
            case 155:
            case 156:
            case 157:
            case 158:
                c12345.m30796(this.f76035, C5085.f17753);
                c12345.m30806(i4);
                ((C17566) c12345).mo30795(this.f76035, i2, i);
                return;
            case 159:
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
                C1400 c1400 = this.f76035;
                C5085 c5085 = C5085.f17753;
                c12345.m30797(c1400, c5085, c5085);
                c12345.m30806(i4);
                ((C17566) c12345).mo30795(this.f76035, i2, i);
                return;
            case 165:
            case 166:
                C1400 c1401 = this.f76035;
                C5085 c5086 = C5085.f17733;
                c12345.m30797(c1401, c5086, c5086);
                c12345.m30806(i4);
                ((C17566) c12345).mo30795(this.f76035, i2, i);
                return;
            default:
                switch (i) {
                    case 198:
                    case 199:
                        c12345.m30796(this.f76035, C5085.f17733);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo2859(i, i2);
                        throw null;
                }
                c12345.m30806(i4);
                ((C17566) c12345).mo30795(this.f76035, i2, i);
                return;
            case 167:
            case 168:
                c12345.m30811();
                c12345.m30806(i4);
                ((C17566) c12345).mo30795(this.f76035, i2, i);
                return;
        }
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2865(int i, int i2, C20550 c20550, int i3) {
        C1400 c1400 = this.f76035;
        C5085 c5085 = C5085.f17753;
        C12345 c12345 = this.f76037;
        c12345.m30796(c1400, c5085);
        c12345.m30812(i3);
        c12345.m30802(c20550);
        ((C17566) c12345).mo30795(this.f76035, i, 171);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2863(int i, int i2, C1028 c1028, ArrayList arrayList) {
        C1400 c1400 = this.f76035;
        C5085 c5085 = C5085.f17753;
        C12345 c12345 = this.f76037;
        c12345.m30796(c1400, c5085);
        c12345.m30793(arrayList);
        c12345.m30801((AbstractC13487) c1028);
        ((C17566) c12345).mo30795(this.f76035, i, 188);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52740(int i) {
        this.f76036 = i;
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final int mo2858() {
        return this.f76036;
    }
}
