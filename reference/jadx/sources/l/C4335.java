package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B60R */
/* JADX INFO: loaded from: classes3.dex */
public class C4335 extends AbstractC19734 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C20528 f15698 = new C20528(1000);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22718 f15699;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC23331 f15700;

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double mo13837() {
        return 100.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4335 m13827(C22718 c22718, int i, InterfaceC23331 interfaceC23331) {
        C4335 c4335 = (C4335) f15698.m47061();
        if (c4335 != null) {
            c4335.f63511 = i;
            c4335.f15699 = c22718;
            c4335.f15700 = interfaceC23331;
            return c4335;
        }
        return new C4335(c22718, i, interfaceC23331);
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩴ */
    public void mo2720() {
        this.f15700 = null;
        this.f15699 = null;
        f15698.m47060(this);
    }

    public C4335(C22718 c22718, int i, InterfaceC23331 interfaceC23331) {
        super(i);
        this.f15699 = c22718;
        this.f15700 = interfaceC23331;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13829(C2161 c2161, InterfaceC10824 interfaceC10824, int i, String str) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c2161.write(str);
                    return;
                }
                throw new RuntimeException();
            }
            InterfaceC2338 interfaceC2338 = (InterfaceC2338) interfaceC10824;
            c2161.write(interfaceC2338.getName());
            c2161.write(40);
            c2161.write(34);
            C3652.m11836(c2161, interfaceC2338.mo7877());
            c2161.write(34);
            c2161.write(", ", 0, 2);
            C14684.m35312(c2161, interfaceC2338.mo7878());
            for (InterfaceC16791 interfaceC16791 : interfaceC2338.mo7876()) {
                c2161.write(", ", 0, 2);
                AbstractC3589.m11645(c2161, interfaceC16791);
            }
            c2161.write(")@", 0, 2);
            if (interfaceC2338.mo7875().mo17433() != 4) {
                throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
            }
            C14684.m35309((Writer) c2161, (InterfaceC4859) interfaceC2338.mo7875().mo17434(), false);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC22759) {
            InterfaceC22759 interfaceC22759 = (InterfaceC22759) interfaceC10824;
            c2161.write(34);
            if (interfaceC22759 instanceof C11679) {
                C11679 c11679 = (C11679) interfaceC22759;
                c11679.f37834.m55816(c11679.f37835, c2161, true);
            } else {
                C3652.m11836(c2161, interfaceC22759.getString());
            }
            c2161.write(34);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC19775) {
            InterfaceC19775 interfaceC19775 = (InterfaceC19775) interfaceC10824;
            if (interfaceC19775 instanceof C25106) {
                C25106 c25106 = (C25106) interfaceC19775;
                c25106.f81190.m55787(c2161, c25106.f81191);
                return;
            } else {
                c2161.write(interfaceC19775.getType());
                return;
            }
        }
        if (interfaceC10824 instanceof InterfaceC8304) {
            C14684.m35311((Writer) c2161, (InterfaceC8304) interfaceC10824, false);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC4859) {
            C14684.m35309((Writer) c2161, (InterfaceC4859) interfaceC10824, false);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC13524) {
            C14684.m35312(c2161, (InterfaceC13524) interfaceC10824);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC6813) {
            C14684.m35310(c2161, (InterfaceC6813) interfaceC10824);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC2338) {
            InterfaceC2338 interfaceC2339 = (InterfaceC2338) interfaceC10824;
            c2161.write(interfaceC2339.getName());
            c2161.write(40);
            c2161.write(34);
            C3652.m11836(c2161, interfaceC2339.mo7877());
            c2161.write(34);
            c2161.write(", ");
            C14684.m35312(c2161, interfaceC2339.mo7878());
            for (InterfaceC16791 interfaceC16792 : interfaceC2339.mo7876()) {
                c2161.write(", ");
                C16922.m39904(c2161, interfaceC16792);
            }
            c2161.write(")@");
            if (interfaceC2339.mo7875().mo17433() == 4) {
                C14684.m35309((Writer) c2161, (InterfaceC4859) interfaceC2339.mo7875().mo17434(), false);
                return;
            }
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        throw new IOException("Unknown reference: " + interfaceC10824);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0325  */
    /* JADX WARN: Code duplicated, block: B:102:0x0331  */
    /* JADX WARN: Code duplicated, block: B:103:0x033e  */
    /* JADX WARN: Code duplicated, block: B:105:0x034c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0359  */
    /* JADX WARN: Code duplicated, block: B:107:0x036c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0377  */
    /* JADX WARN: Code duplicated, block: B:109:0x0389  */
    /* JADX WARN: Code duplicated, block: B:110:0x039b  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0239  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0280  */
    /* JADX WARN: Code duplicated, block: B:94:0x0299  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0304  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4982(C2161 c2161) throws IOException {
        String str;
        ?? r8;
        String strM49796;
        InterfaceC10824 interfaceC10824;
        String str2;
        boolean z;
        InterfaceC10824 interfaceC10824Mo2769;
        ?? r9;
        int i;
        boolean z2;
        String strM49797;
        InterfaceC23331 interfaceC23331;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r10;
        InterfaceC10824 reference;
        ?? r11;
        String str3;
        EnumC22631 enumC22631Mo30864 = this.f15700.mo30864();
        InterfaceC23331 interfaceC23332 = this.f15700;
        if (interfaceC23332 instanceof InterfaceC13633) {
            int iMo20338 = ((InterfaceC13633) interfaceC23332).mo20338();
            int i8 = C5477.f19075;
            str = "generic-error";
            switch (iMo20338) {
                case 1:
                    str3 = "generic-error";
                    break;
                case 2:
                    str3 = "no-such-class";
                    break;
                case 3:
                    str3 = "no-such-field";
                    break;
                case 4:
                    str3 = "no-such-method";
                    break;
                case 5:
                    str3 = "illegal-class-access";
                    break;
                case 6:
                    str3 = "illegal-field-access";
                    break;
                case 7:
                    str3 = "illegal-method-access";
                    break;
                case 8:
                    str3 = "class-change-error";
                    break;
                case 9:
                    str3 = "instantiation-error";
                    break;
                default:
                    str3 = null;
                    break;
            }
            if (str3 == null) {
                c2161.getClass();
                c2161.write("#was invalid verification error type: ", 0, 38);
                c2161.m7440(iMo20338);
                c2161.write("\n", 0, 1);
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        InterfaceC23331 interfaceC23333 = this.f15700;
        if (interfaceC23333 instanceof InterfaceC6177) {
            InterfaceC6177 interfaceC6177 = (InterfaceC6177) interfaceC23333;
            this.f15699.f73734.getClass();
            try {
                reference = interfaceC6177.getReference();
                try {
                    reference.mo6806();
                    strM49796 = null;
                    interfaceC10824 = reference;
                    r11 = reference instanceof InterfaceC2338;
                    z = false;
                } catch (C22013 e) {
                    e = e;
                    c2161.getClass();
                    c2161.write("#", 0, 1);
                    c2161.write(e.getMessage());
                    c2161.write("\n", 0, 1);
                    strM49796 = e.m49796();
                    z = true;
                    interfaceC10824 = reference;
                    r11 = 2;
                }
            } catch (C22013 e2) {
                e = e2;
                reference = null;
            }
            InterfaceC23331 interfaceC23334 = this.f15700;
            if (interfaceC23334 instanceof InterfaceC11396) {
                try {
                    interfaceC10824Mo2769 = ((InterfaceC11396) interfaceC23334).mo2769();
                    try {
                        interfaceC10824Mo2769.mo6806();
                        str2 = null;
                        r10 = r11;
                        i = 0;
                        String str4 = str2;
                        z2 = z;
                        strM49797 = str4;
                        r9 = r10;
                    } catch (C22013 e3) {
                        e = e3;
                        c2161.getClass();
                        c2161.write("#", 0, 1);
                        c2161.write(e.getMessage());
                        c2161.write("\n", 0, 1);
                        strM49797 = e.m49796();
                        z2 = true;
                        i = 2;
                        r9 = r11;
                    }
                } catch (C22013 e4) {
                    e = e4;
                    interfaceC10824Mo2769 = null;
                }
            } else {
                str2 = null;
                r8 = r11;
            }
            interfaceC23331 = this.f15700;
            if (interfaceC23331 instanceof InterfaceC20237) {
                i7 = C24473.f79422[interfaceC23331.mo30864().ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            throw new C23044(null, "Invalid 31t opcode: %s", this.f15700.mo30864());
                        }
                        try {
                            this.f15699.m51245(m45442() + ((InterfaceC20237) this.f15700).mo11703(), EnumC22631.f73340);
                        } catch (C21972 unused) {
                            c2161.getClass();
                            c2161.write("#invalid payload reference\n", 0, 27);
                            z2 = true;
                        }
                    } else if (this.f15699.m51248(((InterfaceC20237) this.f15700).mo11703() + m45442()) == -1) {
                        c2161.getClass();
                        c2161.write("#invalid payload reference\n", 0, 27);
                        z2 = true;
                    }
                } else if (this.f15699.m51244(((InterfaceC20237) this.f15700).mo11703() + m45442()) == -1) {
                    c2161.getClass();
                    c2161.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            }
            if (enumC22631Mo30864.m51004()) {
                this.f15699.f73734.getClass();
                if (this.f15699.f73734.f19332 >= 14 || (!enumC22631Mo30864.m51009() && enumC22631Mo30864 != EnumC22631.f73274)) {
                    c2161.getClass();
                    c2161.write("#disallowed odex opcode\n", 0, 24);
                    z2 = true;
                }
            }
            if (z2) {
                c2161.getClass();
                c2161.write("#", i2, 1);
            }
            switch (C24473.f79421[this.f15700.mo30864().f73508.ordinal()]) {
                case 1:
                    m13834(c2161);
                    c2161.write(32);
                    mo2719(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447 || this.f15700.mo30864() == EnumC22631.f73399) {
                        c2161.getClass();
                        c2161.write("\nreturn-void", 0, 12);
                        return true;
                    }
                    c2161.getClass();
                    c2161.write("\nnop", 0, 4);
                    return true;
                case 2:
                    if (this.f15700 instanceof InterfaceC9049) {
                        c2161.getClass();
                        c2161.write("#unknown opcode: 0x", 0, 19);
                        c2161.mo7441(((InterfaceC9049) this.f15700).mo24160());
                        c2161.write(10);
                    }
                    m13834(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 3:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 4:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 5:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 6:
                    m13834(c2161);
                    c2161.write(32);
                    c2161.write(str);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 7:
                case 8:
                    m13834(c2161);
                    c2161.write(32);
                    mo2719(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 9:
                case 10:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                    if (this.f15699.f73734.f19336) {
                        if (this.f15700.mo30864().m51002()) {
                            m13828(c2161, ((InterfaceC18855) this.f15700).mo1545());
                        } else if (!m13831(c2161, ((InterfaceC3193) this.f15700).mo1546())) {
                            m13830(c2161, ((InterfaceC3193) this.f15700).mo1546());
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 16:
                case 17:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    mo2719(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 18:
                case 19:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    c2161.write(", ", 0, 2);
                    C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 20:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 21:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    c2161.write(", ", 0, 2);
                    c2161.write("field@0x", 0, 8);
                    c2161.mo7441(((InterfaceC24823) this.f15700).mo17032());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 22:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    c2161.write(", ", 0, 2);
                    mo2719(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 23:
                case 24:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 25:
                    m13834(c2161);
                    c2161.write(32);
                    m13835(c2161);
                    c2161.write(", ", 0, 2);
                    m13833(c2161);
                    c2161.write(", ", 0, 2);
                    m13836(c2161, ((InterfaceC21093) this.f15700).mo8187());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 26:
                    m13834(c2161);
                    c2161.write(32);
                    m13838(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 27:
                    i3 = 0;
                    i4 = 2;
                    m13834(c2161);
                    c2161.write(32);
                    m13838(c2161);
                    c2161.write(", ", i3, i4);
                    c2161.write("inline@", i3, 7);
                    c2161.m7440(((InterfaceC15871) this.f15700).mo18517());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 28:
                    i5 = 0;
                    i6 = 2;
                    m13834(c2161);
                    c2161.write(32);
                    m13838(c2161);
                    c2161.write(", ", i5, i6);
                    c2161.write("vtable@", i5, 7);
                    c2161.m7440(((InterfaceC7668) this.f15700).mo17155());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 29:
                    m13834(c2161);
                    c2161.write(32);
                    m13832(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 30:
                    i3 = 0;
                    i4 = 2;
                    m13834(c2161);
                    c2161.write(32);
                    m13832(c2161);
                    c2161.write(", ", i3, i4);
                    c2161.write("inline@", i3, 7);
                    c2161.m7440(((InterfaceC15871) this.f15700).mo18517());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 31:
                    i5 = 0;
                    i6 = 2;
                    m13834(c2161);
                    c2161.write(32);
                    m13832(c2161);
                    c2161.write(", ", i5, i6);
                    c2161.write("vtable@", i5, 7);
                    c2161.m7440(((InterfaceC7668) this.f15700).mo17155());
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 32:
                    m13834(c2161);
                    c2161.write(32);
                    m13838(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824Mo2769, i, strM49797);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                case 33:
                    m13834(c2161);
                    c2161.write(32);
                    m13832(c2161);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824, r9, strM49796);
                    c2161.write(", ", 0, 2);
                    m13829(c2161, interfaceC10824Mo2769, i, strM49797);
                    if (z2) {
                        return true;
                    }
                    if (this.f15700.mo30864() != EnumC22631.f73447) {
                        break;
                    }
                    c2161.getClass();
                    c2161.write("\nreturn-void", 0, 12);
                    return true;
                default:
                    return false;
            }
        }
        r8 = 0;
        strM49796 = null;
        interfaceC10824 = null;
        str2 = null;
        z = false;
        interfaceC10824Mo2769 = null;
        r10 = r8;
        i = 0;
        String str5 = str2;
        z2 = z;
        strM49797 = str5;
        r9 = r10;
        interfaceC23331 = this.f15700;
        if (interfaceC23331 instanceof InterfaceC20237) {
            i7 = C24473.f79422[interfaceC23331.mo30864().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        throw new C23044(null, "Invalid 31t opcode: %s", this.f15700.mo30864());
                    }
                    this.f15699.m51245(m45442() + ((InterfaceC20237) this.f15700).mo11703(), EnumC22631.f73340);
                } else if (this.f15699.m51248(((InterfaceC20237) this.f15700).mo11703() + m45442()) == -1) {
                    c2161.getClass();
                    c2161.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            } else if (this.f15699.m51244(((InterfaceC20237) this.f15700).mo11703() + m45442()) == -1) {
                c2161.getClass();
                c2161.write("#invalid payload reference\n", 0, 27);
                z2 = true;
            }
        }
        if (enumC22631Mo30864.m51004()) {
            this.f15699.f73734.getClass();
            i2 = this.f15699.f73734.f19332 >= 14 ? 0 : 0;
            c2161.getClass();
            c2161.write("#disallowed odex opcode\n", 0, 24);
            z2 = true;
        }
        if (z2) {
            c2161.getClass();
            c2161.write("#", i2, 1);
        }
        switch (C24473.f79421[this.f15700.mo30864().f73508.ordinal()]) {
            case 1:
                m13834(c2161);
                c2161.write(32);
                mo2719(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 2:
                if (this.f15700 instanceof InterfaceC9049) {
                    c2161.getClass();
                    c2161.write("#unknown opcode: 0x", 0, 19);
                    c2161.mo7441(((InterfaceC9049) this.f15700).mo24160());
                    c2161.write(10);
                }
                m13834(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 3:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 4:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 5:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 6:
                m13834(c2161);
                c2161.write(32);
                c2161.write(str);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 7:
            case 8:
                m13834(c2161);
                c2161.write(32);
                mo2719(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 9:
            case 10:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                if (this.f15699.f73734.f19336) {
                    if (this.f15700.mo30864().m51002()) {
                        m13828(c2161, ((InterfaceC18855) this.f15700).mo1545());
                    } else if (!m13831(c2161, ((InterfaceC3193) this.f15700).mo1546())) {
                        m13830(c2161, ((InterfaceC3193) this.f15700).mo1546());
                    }
                }
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 16:
            case 17:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                mo2719(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 18:
            case 19:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                c2161.write(", ", 0, 2);
                C11529.m29030(c2161, ((InterfaceC18855) this.f15700).mo1545());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 20:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 21:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                c2161.write(", ", 0, 2);
                c2161.write("field@0x", 0, 8);
                c2161.mo7441(((InterfaceC24823) this.f15700).mo17032());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 22:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                c2161.write(", ", 0, 2);
                mo2719(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 23:
            case 24:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 25:
                m13834(c2161);
                c2161.write(32);
                m13835(c2161);
                c2161.write(", ", 0, 2);
                m13833(c2161);
                c2161.write(", ", 0, 2);
                m13836(c2161, ((InterfaceC21093) this.f15700).mo8187());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 26:
                m13834(c2161);
                c2161.write(32);
                m13838(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 27:
                i3 = 0;
                i4 = 2;
                m13834(c2161);
                c2161.write(32);
                m13838(c2161);
                c2161.write(", ", i3, i4);
                c2161.write("inline@", i3, 7);
                c2161.m7440(((InterfaceC15871) this.f15700).mo18517());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 28:
                i5 = 0;
                i6 = 2;
                m13834(c2161);
                c2161.write(32);
                m13838(c2161);
                c2161.write(", ", i5, i6);
                c2161.write("vtable@", i5, 7);
                c2161.m7440(((InterfaceC7668) this.f15700).mo17155());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 29:
                m13834(c2161);
                c2161.write(32);
                m13832(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 30:
                i3 = 0;
                i4 = 2;
                m13834(c2161);
                c2161.write(32);
                m13832(c2161);
                c2161.write(", ", i3, i4);
                c2161.write("inline@", i3, 7);
                c2161.m7440(((InterfaceC15871) this.f15700).mo18517());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 31:
                i5 = 0;
                i6 = 2;
                m13834(c2161);
                c2161.write(32);
                m13832(c2161);
                c2161.write(", ", i5, i6);
                c2161.write("vtable@", i5, 7);
                c2161.m7440(((InterfaceC7668) this.f15700).mo17155());
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 32:
                m13834(c2161);
                c2161.write(32);
                m13838(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824Mo2769, i, strM49797);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            case 33:
                m13834(c2161);
                c2161.write(32);
                m13832(c2161);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824, r9, strM49796);
                c2161.write(", ", 0, 2);
                m13829(c2161, interfaceC10824Mo2769, i, strM49797);
                if (z2) {
                    return true;
                }
                if (this.f15700.mo30864() != EnumC22631.f73447) {
                    break;
                }
                c2161.getClass();
                c2161.write("\nreturn-void", 0, 12);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m13834(C2161 c2161) throws IOException {
        c2161.mo7436(this.f15700.mo30864());
    }

    /* JADX INFO: renamed from: ۫ */
    public void mo2719(C2161 c2161) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13836(C2161 c2161, int i) throws IOException {
        this.f15699.f73736.m36610(c2161, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13835(C2161 c2161) throws IOException {
        m13836(c2161, ((InterfaceC12142) this.f15700).mo1542());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m13833(C2161 c2161) throws IOException {
        m13836(c2161, ((InterfaceC18109) this.f15700).mo1541());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m13838(C2161 c2161) throws IOException {
        InterfaceC16617 interfaceC16617 = (InterfaceC16617) this.f15700;
        int iMo1655 = interfaceC16617.mo1655();
        c2161.write(123);
        if (iMo1655 == 1) {
            m13836(c2161, interfaceC16617.mo7063());
        } else if (iMo1655 == 2) {
            m13836(c2161, interfaceC16617.mo7063());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7065());
        } else if (iMo1655 == 3) {
            m13836(c2161, interfaceC16617.mo7063());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7065());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7061());
        } else if (iMo1655 == 4) {
            m13836(c2161, interfaceC16617.mo7063());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7065());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7061());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7062());
        } else if (iMo1655 == 5) {
            m13836(c2161, interfaceC16617.mo7063());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7065());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7061());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7062());
            c2161.write(", ", 0, 2);
            m13836(c2161, interfaceC16617.mo7064());
        }
        c2161.write(q.h);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13832(C2161 c2161) throws IOException {
        InterfaceC24077 interfaceC24077 = (InterfaceC24077) this.f15700;
        int iMo1655 = interfaceC24077.mo1655();
        if (iMo1655 == 0) {
            c2161.getClass();
            c2161.write("{}", 0, 2);
            return;
        }
        int iMo2772 = interfaceC24077.mo2772();
        C15258 c15258 = this.f15699.f73736;
        int i = (iMo1655 + iMo2772) - 1;
        int i2 = c15258.f49897;
        int i3 = c15258.f49896;
        c15258.f49895.getClass();
        int i4 = i3 - i2;
        if (iMo2772 >= i4) {
            c2161.getClass();
            c2161.write("{p", 0, 2);
            c2161.m7440(iMo2772 - i4);
            c2161.write(" .. p", 0, 5);
            c2161.m7440(i - i4);
            c2161.write(q.h);
            return;
        }
        c2161.getClass();
        c2161.write("{v", 0, 2);
        c2161.m7440(iMo2772);
        c2161.write(" .. v", 0, 5);
        c2161.m7440(i);
        c2161.write(q.h);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13830(C2161 c2161, int i) throws IOException {
        if (C17822.m41666(i)) {
            c2161.getClass();
            c2161.write("  # ", 0, 4);
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fIntBitsToFloat == Float.POSITIVE_INFINITY) {
                c2161.write("Float.POSITIVE_INFINITY", 0, 23);
                return;
            }
            if (fIntBitsToFloat == Float.NEGATIVE_INFINITY) {
                c2161.write("Float.NEGATIVE_INFINITY", 0, 23);
                return;
            }
            if (Float.isNaN(fIntBitsToFloat)) {
                c2161.write("Float.NaN", 0, 9);
                return;
            }
            if (fIntBitsToFloat == Float.MAX_VALUE) {
                c2161.write("Float.MAX_VALUE", 0, 15);
                return;
            }
            if (fIntBitsToFloat == 3.1415927f) {
                c2161.write("(float)Math.PI", 0, 14);
            } else if (fIntBitsToFloat == 2.7182817f) {
                c2161.write("(float)Math.E", 0, 13);
            } else {
                c2161.write(Float.toString(fIntBitsToFloat));
                c2161.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13828(C2161 c2161, long j) throws IOException {
        if (C17822.m41667(j)) {
            c2161.getClass();
            c2161.write("  # ", 0, 4);
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble == Double.POSITIVE_INFINITY) {
                c2161.write("Double.POSITIVE_INFINITY", 0, 24);
                return;
            }
            if (dLongBitsToDouble == Double.NEGATIVE_INFINITY) {
                c2161.write("Double.NEGATIVE_INFINITY", 0, 24);
                return;
            }
            if (Double.isNaN(dLongBitsToDouble)) {
                c2161.write("Double.NaN", 0, 10);
                return;
            }
            if (dLongBitsToDouble == Double.MAX_VALUE) {
                c2161.write("Double.MAX_VALUE", 0, 16);
                return;
            }
            if (dLongBitsToDouble == 3.141592653589793d) {
                c2161.write("Math.PI", 0, 7);
            } else if (dLongBitsToDouble == 2.718281828459045d) {
                c2161.write("Math.E", 0, 6);
            } else {
                c2161.write(Double.toString(dLongBitsToDouble));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13831(C2161 c2161, int i) throws IOException {
        String str = (String) this.f15699.f73734.f19331.get(i);
        if (str == null) {
            return false;
        }
        c2161.getClass();
        c2161.write("    # ", 0, 6);
        c2161.write(str, 0, str.length());
        return true;
    }
}
