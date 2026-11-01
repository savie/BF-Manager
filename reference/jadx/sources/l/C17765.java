package l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ᩳۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17765 implements InterfaceC0395 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18471 f56353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6040 f56354 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f56355;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19177 f56356;

    public C17765(C18471 c18471) {
        this.f56353 = c18471;
        this.f56356 = c18471.f58864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41333(C6040 c6040) {
        this.f56354 = c6040;
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2124(int i, int i2) {
        throw new C21293("invalid opcode ".concat(C22475.m49983(i)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x0302  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2128(int i, int i2, C3320 c3320) {
        C19177 c19177 = this.f56356;
        if (i == 0) {
            c19177.m44026();
        } else if (i == 190) {
            C3320 c3320M40292 = this.f56354.m16389().m40292(0);
            if (!c3320M40292.m9838() && !c3320M40292.equals(C3320.f12286)) {
                C18471.m42838(this.f56353, "type mismatch: expected array type but encountered " + c3320M40292.mo2376());
                throw null;
            }
            c19177.m44016(this.f56354, C3320.f12289);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c19177.m44026();
                    break;
                case 46:
                    C3320 c3320M42833 = C18471.m42833(c3320, this.f56354.m16389().m40292(1));
                    C3320 c3320M9843 = C3320.f12286;
                    if (c3320M42833 != c3320M9843) {
                        c3320M9843 = c3320M42833.m9843();
                    }
                    c19177.m44017(this.f56354, c3320M42833, C3320.f12281);
                    c3320 = c3320M9843;
                    break;
                case 79:
                    C17329 c17329M16389 = this.f56354.m16389();
                    int i3 = c3320.m9836() ? 2 : 3;
                    C3320 c3320M40293 = c17329M16389.m40292(i3);
                    boolean zM40301 = c17329M16389.m40301(i3);
                    C3320 c3320M42834 = C18471.m42833(c3320, c3320M40293);
                    if (zM40301 && c3320M42834 != (c3320 = C3320.f12286)) {
                        c3320 = c3320M42834.m9843();
                    }
                    c19177.m44018(this.f56354, c3320M42834, C3320.f12281, c3320);
                    break;
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 126:
                case 128:
                case 130:
                    c19177.m44017(this.f56354, c3320, c3320);
                    break;
                case 116:
                    c19177.m44016(this.f56354, c3320);
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                    c19177.m44017(this.f56354, c3320, C3320.f12281);
                    break;
                case 172:
                    C3320 c3320M40294 = c3320 == C3320.f12289 ? this.f56354.m16389().m40292(0) : c3320;
                    c19177.m44016(this.f56354, c3320);
                    m41331(c3320M40294);
                    break;
                case 177:
                    c19177.m44026();
                    m41331(C3320.f12280);
                    break;
                default:
                    int i4 = 17;
                    switch (i) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            if (this.f56354.m16389().m40292(0).m9846()) {
                                throw C18471.m42834();
                            }
                            c19177.m44028(this.f56354, 1);
                            break;
                            break;
                        case 88:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            C17329 c17329M163810 = this.f56354.m16389();
                            if (c17329M163810.m40292(0).m9846()) {
                                c19177.m44028(this.f56354, 1);
                            } else if (c17329M163810.m40292(1).m9836()) {
                                c19177.m44028(this.f56354, 2);
                                i4 = 8481;
                            } else {
                                throw C18471.m42834();
                            }
                            if (i == 92) {
                                c19177.m44027(i4);
                            }
                            break;
                        case 89:
                            if (this.f56354.m16389().m40292(0).m9846()) {
                                throw C18471.m42834();
                            }
                            c19177.m44028(this.f56354, 1);
                            c19177.m44027(17);
                            break;
                            break;
                        case 90:
                            C17329 c17329M163811 = this.f56354.m16389();
                            if (!c17329M163811.m40292(0).m9836() || !c17329M163811.m40292(1).m9836()) {
                                throw C18471.m42834();
                            }
                            c19177.m44028(this.f56354, 2);
                            c19177.m44027(530);
                            break;
                            break;
                        case 91:
                            C17329 c17329M163812 = this.f56354.m16389();
                            if (c17329M163812.m40292(0).m9846()) {
                                throw C18471.m42834();
                            }
                            if (c17329M163812.m40292(1).m9846()) {
                                c19177.m44028(this.f56354, 2);
                                c19177.m44027(530);
                            } else if (c17329M163812.m40292(2).m9836()) {
                                c19177.m44028(this.f56354, 3);
                                c19177.m44027(12819);
                            } else {
                                throw C18471.m42834();
                            }
                            break;
                            break;
                        case 93:
                            C17329 c17329M163813 = this.f56354.m16389();
                            if (c17329M163813.m40292(0).m9846()) {
                                if (c17329M163813.m40292(2).m9846()) {
                                    throw C18471.m42834();
                                }
                                c19177.m44028(this.f56354, 2);
                                c19177.m44027(530);
                            } else {
                                if (c17329M163813.m40292(1).m9846() || c17329M163813.m40292(2).m9846()) {
                                    throw C18471.m42834();
                                }
                                c19177.m44028(this.f56354, 3);
                                c19177.m44027(205106);
                            }
                            break;
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                            C17329 c17329M163814 = this.f56354.m16389();
                            if (c17329M163814.m40292(0).m9846()) {
                                if (c17329M163814.m40292(2).m9846()) {
                                    c19177.m44028(this.f56354, 2);
                                    c19177.m44027(530);
                                } else if (c17329M163814.m40292(3).m9836()) {
                                    c19177.m44028(this.f56354, 3);
                                    c19177.m44027(12819);
                                } else {
                                    throw C18471.m42834();
                                }
                            } else if (c17329M163814.m40292(1).m9836()) {
                                if (c17329M163814.m40292(2).m9846()) {
                                    c19177.m44028(this.f56354, 3);
                                    c19177.m44027(205106);
                                } else if (c17329M163814.m40292(3).m9836()) {
                                    c19177.m44028(this.f56354, 4);
                                    c19177.m44027(4399427);
                                } else {
                                    throw C18471.m42834();
                                }
                            } else {
                                throw C18471.m42834();
                            }
                            break;
                        case 95:
                            C17329 c17329M163815 = this.f56354.m16389();
                            if (!c17329M163815.m40292(0).m9836() || !c17329M163815.m40292(1).m9836()) {
                                throw C18471.m42834();
                            }
                            c19177.m44028(this.f56354, 2);
                            c19177.m44027(18);
                            break;
                            break;
                        case 96:
                            c19177.m44017(this.f56354, c3320, c3320);
                            break;
                        default:
                            switch (i) {
                                case 133:
                                case 134:
                                case 135:
                                case 145:
                                case 146:
                                case 147:
                                    c19177.m44016(this.f56354, C3320.f12281);
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    c19177.m44016(this.f56354, C3320.f12268);
                                    break;
                                case 139:
                                case 140:
                                case 141:
                                    c19177.m44016(this.f56354, C3320.f12262);
                                    break;
                                case 142:
                                case 143:
                                case 144:
                                    c19177.m44016(this.f56354, C3320.f12291);
                                    break;
                                case 148:
                                    C6040 c6040 = this.f56354;
                                    C3320 c3321 = C3320.f12268;
                                    c19177.m44017(c6040, c3321, c3321);
                                    break;
                                case 149:
                                case 150:
                                    C6040 c6041 = this.f56354;
                                    C3320 c3322 = C3320.f12262;
                                    c19177.m44017(c6041, c3322, c3322);
                                    break;
                                case 151:
                                case 152:
                                    C6040 c6042 = this.f56354;
                                    C3320 c3323 = C3320.f12291;
                                    c19177.m44017(c6042, c3323, c3323);
                                    break;
                                default:
                                    mo2124(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c19177.m44016(this.f56354, C3320.f12289);
        }
        c19177.m44012(c3320);
        ((C14944) c19177).mo35693(this.f56354, i2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41331(C3320 c3320) {
        C3320 c3320M6217 = this.f56356.m44025().m6217();
        if (C1791.m5869(c3320M6217, c3320)) {
            return;
        }
        C18471.m42838(this.f56353, "return type mismatch: prototype indicates " + c3320M6217.mo2376() + ", but encountered type " + c3320.mo2376());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2126(int i, int i2, int i3, int i4, C3320 c3320, int i5) {
        C3320 c3320M34929;
        boolean z;
        C19073 c19073M34926;
        C14508 c14508M5897 = this.f56353.f58867.m5897(i == 54 ? i3 + i2 : i2, i4);
        if (c14508M5897 != null) {
            c3320M34929 = c14508M5897.m34929();
            if (c3320M34929.mo9831() != c3320.mo9831()) {
                c3320M34929 = c3320;
                c14508M5897 = null;
            }
        } else {
            c3320M34929 = c3320;
        }
        C19177 c19177 = this.f56356;
        if (i == 21) {
            c19177.m44014(this.f56354, i4);
            if (c14508M5897 != null) {
                z = true;
            } else {
                z = false;
            }
            c19177.m44029(z);
            c19177.m44012(c3320);
        } else if (i == 54) {
            c19073M34926 = c14508M5897 != null ? c14508M5897.m34926() : null;
            c19177.m44016(this.f56354, c3320);
            c19177.m44012(c3320);
            c19177.m44010(i4, c3320M34929, c19073M34926);
        } else if (i != 132) {
            if (i != 169) {
                mo2124(i, i2);
                throw null;
            }
            c19177.m44014(this.f56354, i4);
            if (c14508M5897 != null) {
                z = true;
            } else {
                z = false;
            }
            c19177.m44029(z);
            c19177.m44012(c3320);
        } else {
            c19073M34926 = c14508M5897 != null ? c14508M5897.m34926() : null;
            c19177.m44014(this.f56354, i4);
            c19177.m44010(i4, c3320M34929, c19073M34926);
            c19177.m44012(c3320);
            c19177.m44027(i5);
            c19177.m44020((AbstractC9901) C21665.m48398(i5));
        }
        ((C14944) c19177).mo35693(this.f56354, i2, i);
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
    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2127(int i, int i2, int i3, AbstractC9901 abstractC9901, int i4) {
        AbstractC9901 abstractC9901M43483;
        C18471 c18471 = this.f56353;
        C19177 c19177 = this.f56356;
        if (i == 18 || i == 19) {
            if ((abstractC9901 instanceof C16022) || (abstractC9901 instanceof C16727)) {
                C18471.m42839(c18471, abstractC9901);
            }
            c19177.m44026();
            abstractC9901M43483 = abstractC9901;
        } else if (i != 189) {
            if (i == 197) {
                C3320 c3320 = C3320.f12280;
                int i5 = C1909.f7251;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i6 = 0; i6 < i4; i6++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c3320.m9844());
                c19177.m44015(this.f56354, C1909.m6216(sb.toString()));
                abstractC9901M43483 = abstractC9901;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case 179:
                        c19177.m44016(this.f56354, ((C23077) abstractC9901).getType());
                        abstractC9901M43483 = abstractC9901;
                        break;
                    case 180:
                        c19177.m44016(this.f56354, C3320.f12289);
                        abstractC9901M43483 = abstractC9901;
                        break;
                    case 181:
                        c19177.m44017(this.f56354, C3320.f12289, ((C23077) abstractC9901).getType());
                        abstractC9901M43483 = abstractC9901;
                        break;
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                        boolean z = abstractC9901 instanceof C18137;
                        AbstractC9901 abstractC9902 = abstractC9901;
                        if (z) {
                            C20255 c20255M42224 = ((C18137) abstractC9901).m42224();
                            C18471.m42837(c18471, i, c20255M42224);
                            abstractC9902 = c20255M42224;
                        }
                        if ((abstractC9902 instanceof C20255) && ((C20255) abstractC9902).m29455()) {
                            C18471.m42842(c18471, i);
                        }
                        c19177.m44015(this.f56354, ((C20255) abstractC9902).m29453(i == 184));
                        abstractC9901M43483 = abstractC9902;
                        break;
                    case 186:
                        C18471.m42836(c18471, i);
                        C18843 c18843 = (C18843) abstractC9901;
                        c19177.m44015(this.f56354, c18843.m43482());
                        abstractC9901M43483 = c18843.m43483();
                        break;
                    default:
                        c19177.m44026();
                        abstractC9901M43483 = abstractC9901;
                        break;
                }
            } else {
                c19177.m44016(this.f56354, C3320.f12289);
                abstractC9901M43483 = abstractC9901;
            }
        } else {
            c19177.m44016(this.f56354, C3320.f12281);
            abstractC9901M43483 = abstractC9901;
        }
        c19177.m44027(i4);
        c19177.m44020(abstractC9901M43483);
        ((C14944) c19177).mo35693(this.f56354, i2, i);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2125(int i, int i2, int i3, int i4) {
        C19177 c19177 = this.f56356;
        switch (i) {
            case 153:
            case EnumC2300.f8185 /* 154 */:
            case 155:
            case 156:
            case 157:
            case 158:
                c19177.m44016(this.f56354, C3320.f12281);
                c19177.m44024(i4);
                ((C14944) c19177).mo35693(this.f56354, i2, i);
                return;
            case 159:
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
                C6040 c6040 = this.f56354;
                C3320 c3320 = C3320.f12281;
                c19177.m44017(c6040, c3320, c3320);
                c19177.m44024(i4);
                ((C14944) c19177).mo35693(this.f56354, i2, i);
                return;
            case 165:
            case 166:
                C6040 c6041 = this.f56354;
                C3320 c3321 = C3320.f12289;
                c19177.m44017(c6041, c3321, c3321);
                c19177.m44024(i4);
                ((C14944) c19177).mo35693(this.f56354, i2, i);
                return;
            default:
                switch (i) {
                    case 198:
                    case 199:
                        c19177.m44016(this.f56354, C3320.f12289);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo2124(i, i2);
                        throw null;
                }
                c19177.m44024(i4);
                ((C14944) c19177).mo35693(this.f56354, i2, i);
                return;
            case 167:
            case 168:
                c19177.m44026();
                c19177.m44024(i4);
                ((C14944) c19177).mo35693(this.f56354, i2, i);
                return;
        }
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2130(int i, int i2, C7888 c7888, int i3) {
        C6040 c6040 = this.f56354;
        C3320 c3320 = C3320.f12281;
        C19177 c19177 = this.f56356;
        c19177.m44016(c6040, c3320);
        c19177.m44027(i3);
        c19177.m44019(c7888);
        ((C14944) c19177).mo35693(this.f56354, i, 171);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2129(int i, int i2, C6143 c6143, ArrayList arrayList) {
        C6040 c6040 = this.f56354;
        C3320 c3320 = C3320.f12281;
        C19177 c19177 = this.f56356;
        c19177.m44016(c6040, c3320);
        c19177.m44011(arrayList);
        c19177.m44020((AbstractC9901) c6143);
        ((C14944) c19177).mo35693(this.f56354, i, 188);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41332(int i) {
        this.f56355 = i;
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final int mo2123() {
        return this.f56355;
    }
}
