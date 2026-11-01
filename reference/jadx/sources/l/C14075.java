package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B60R */
/* JADX INFO: loaded from: classes4.dex */
public class C14075 extends AbstractC7724 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C19805 f46225 = new C19805(1000);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10547 f46226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC1594 f46227;

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ܰ */
    public final double mo5599() {
        return 100.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14075 m34037(C10547 c10547, int i, InterfaceC1594 interfaceC1594) {
        C14075 c14075 = (C14075) f46225.m45009();
        if (c14075 != null) {
            c14075.f25545 = i;
            c14075.f46226 = c10547;
            c14075.f46227 = interfaceC1594;
            return c14075;
        }
        return new C14075(c10547, i, interfaceC1594);
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۚ */
    public void mo9290() {
        this.f46227 = null;
        this.f46226 = null;
        f46225.m45011(this);
    }

    public C14075(C10547 c10547, int i, InterfaceC1594 interfaceC1594) {
        super(i);
        this.f46226 = c10547;
        this.f46227 = interfaceC1594;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34039(C12283 c12283, InterfaceC7446 interfaceC7446, int i, String str) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c12283.write(str);
                    return;
                }
                throw new RuntimeException();
            }
            InterfaceC18029 interfaceC18029 = (InterfaceC18029) interfaceC7446;
            c12283.write(interfaceC18029.getName());
            c12283.write(40);
            c12283.write(34);
            C9461.m24219(c12283, interfaceC18029.mo19722());
            c12283.write(34);
            c12283.write(", ", 0, 2);
            C22304.m49471(c12283, interfaceC18029.mo19721());
            for (InterfaceC10975 interfaceC10975 : interfaceC18029.mo19720()) {
                c12283.write(", ", 0, 2);
                AbstractC14387.m34621(c12283, interfaceC10975);
            }
            c12283.write(")@", 0, 2);
            if (interfaceC18029.mo19719().mo20681() != 4) {
                throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
            }
            C22304.m49469((Writer) c12283, (InterfaceC8858) interfaceC18029.mo19719().mo20680(), false);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC20852) {
            InterfaceC20852 interfaceC20852 = (InterfaceC20852) interfaceC7446;
            c12283.write(34);
            if (interfaceC20852 instanceof C17270) {
                C17270 c17270 = (C17270) interfaceC20852;
                c17270.f55012.m41192(c17270.f55013, c12283, true);
            } else {
                C9461.m24219(c12283, interfaceC20852.getString());
            }
            c12283.write(34);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC15914) {
            InterfaceC15914 interfaceC15914 = (InterfaceC15914) interfaceC7446;
            if (interfaceC15914 instanceof C5981) {
                C5981 c5981 = (C5981) interfaceC15914;
                c5981.f20345.m41172(c12283, c5981.f20346);
                return;
            } else {
                c12283.write(interfaceC15914.getType());
                return;
            }
        }
        if (interfaceC7446 instanceof InterfaceC18735) {
            C22304.m49470((Writer) c12283, (InterfaceC18735) interfaceC7446, false);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC8858) {
            C22304.m49469((Writer) c12283, (InterfaceC8858) interfaceC7446, false);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC19441) {
            C22304.m49471(c12283, (InterfaceC19441) interfaceC7446);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC8152) {
            C22304.m49468(c12283, (InterfaceC8152) interfaceC7446);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC18029) {
            InterfaceC18029 interfaceC180210 = (InterfaceC18029) interfaceC7446;
            c12283.write(interfaceC180210.getName());
            c12283.write(40);
            c12283.write(34);
            C9461.m24219(c12283, interfaceC180210.mo19722());
            c12283.write(34);
            c12283.write(", ");
            C22304.m49471(c12283, interfaceC180210.mo19721());
            for (InterfaceC10975 interfaceC10976 : interfaceC180210.mo19720()) {
                c12283.write(", ");
                C23365.m51479(c12283, interfaceC10976);
            }
            c12283.write(")@");
            if (interfaceC180210.mo19719().mo20681() == 4) {
                C22304.m49469((Writer) c12283, (InterfaceC8858) interfaceC180210.mo19719().mo20680(), false);
                return;
            }
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        throw new IOException("Unknown reference: " + interfaceC7446);
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
    /* JADX WARN: Code duplicated, block: B:133:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1773(C12283 c12283) throws IOException {
        String str;
        ?? r8;
        String strM26055;
        InterfaceC7446 interfaceC7446;
        String str2;
        boolean z;
        InterfaceC7446 interfaceC7446Mo3896;
        ?? r9;
        int i;
        boolean z2;
        String strM26056;
        InterfaceC1594 interfaceC1594;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r10;
        InterfaceC7446 reference;
        ?? r11;
        String str3;
        EnumC10297 enumC10297Mo5435 = this.f46227.mo5435();
        InterfaceC1594 interfaceC1595 = this.f46227;
        if (interfaceC1595 instanceof InterfaceC19503) {
            int iMo9148 = ((InterfaceC19503) interfaceC1595).mo9148();
            int i8 = C20175.f65488;
            str = "generic-error";
            switch (iMo9148) {
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
                c12283.getClass();
                c12283.write("#was invalid verification error type: ", 0, 38);
                c12283.m30529(iMo9148);
                c12283.write("\n", 0, 1);
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        InterfaceC1594 interfaceC1596 = this.f46227;
        if (interfaceC1596 instanceof InterfaceC13859) {
            InterfaceC13859 interfaceC13859 = (InterfaceC13859) interfaceC1596;
            this.f46226.f36110.getClass();
            try {
                reference = interfaceC13859.getReference();
                try {
                    reference.mo1997();
                    strM26055 = null;
                    interfaceC7446 = reference;
                    r11 = reference instanceof InterfaceC18029;
                    z = false;
                } catch (C10269 e) {
                    e = e;
                    c12283.getClass();
                    c12283.write("#", 0, 1);
                    c12283.write(e.getMessage());
                    c12283.write("\n", 0, 1);
                    strM26055 = e.m26055();
                    z = true;
                    interfaceC7446 = reference;
                    r11 = 2;
                }
            } catch (C10269 e2) {
                e = e2;
                reference = null;
            }
            InterfaceC1594 interfaceC1597 = this.f46227;
            if (interfaceC1597 instanceof InterfaceC17117) {
                try {
                    interfaceC7446Mo3896 = ((InterfaceC17117) interfaceC1597).mo3896();
                    try {
                        interfaceC7446Mo3896.mo1997();
                        str2 = null;
                        r10 = r11;
                        i = 0;
                        String str4 = str2;
                        z2 = z;
                        strM26056 = str4;
                        r9 = r10;
                    } catch (C10269 e3) {
                        e = e3;
                        c12283.getClass();
                        c12283.write("#", 0, 1);
                        c12283.write(e.getMessage());
                        c12283.write("\n", 0, 1);
                        strM26056 = e.m26055();
                        z2 = true;
                        i = 2;
                        r9 = r11;
                    }
                } catch (C10269 e4) {
                    e = e4;
                    interfaceC7446Mo3896 = null;
                }
            } else {
                str2 = null;
                r8 = r11;
            }
            interfaceC1594 = this.f46227;
            if (interfaceC1594 instanceof InterfaceC3274) {
                i7 = C4901.f17184[interfaceC1594.mo5435().ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            throw new C20749(null, "Invalid 31t opcode: %s", this.f46227.mo5435());
                        }
                        try {
                            this.f46226.m26682(m20371() + ((InterfaceC3274) this.f46227).mo8965(), EnumC10297.f35114);
                        } catch (C19719 unused) {
                            c12283.getClass();
                            c12283.write("#invalid payload reference\n", 0, 27);
                            z2 = true;
                        }
                    } else if (this.f46226.m26685(((InterfaceC3274) this.f46227).mo8965() + m20371()) == -1) {
                        c12283.getClass();
                        c12283.write("#invalid payload reference\n", 0, 27);
                        z2 = true;
                    }
                } else if (this.f46226.m26681(((InterfaceC3274) this.f46227).mo8965() + m20371()) == -1) {
                    c12283.getClass();
                    c12283.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            }
            if (enumC10297Mo5435.m26116()) {
                this.f46226.f36110.getClass();
                if (this.f46226.f36110.f66198 >= 14 || (!enumC10297Mo5435.m26119() && enumC10297Mo5435 != EnumC10297.f35288)) {
                    c12283.getClass();
                    c12283.write("#disallowed odex opcode\n", 0, 24);
                    z2 = true;
                }
            }
            if (z2) {
                c12283.getClass();
                c12283.write("#", i2, 1);
            }
            switch (C4901.f17183[this.f46227.mo5435().f35328.ordinal()]) {
                case 1:
                    m34044(c12283);
                    c12283.write(32);
                    mo34041(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104 || this.f46227.mo5435() == EnumC10297.f35299) {
                        c12283.getClass();
                        c12283.write("\nreturn-void", 0, 12);
                        return true;
                    }
                    c12283.getClass();
                    c12283.write("\nnop", 0, 4);
                    return true;
                case 2:
                    if (this.f46227 instanceof InterfaceC21557) {
                        c12283.getClass();
                        c12283.write("#unknown opcode: 0x", 0, 19);
                        c12283.mo6726(((InterfaceC21557) this.f46227).mo44435());
                        c12283.write(10);
                    }
                    m34044(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 3:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 4:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 5:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 6:
                    m34044(c12283);
                    c12283.write(32);
                    c12283.write(str);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 7:
                case 8:
                    m34044(c12283);
                    c12283.write(32);
                    mo34041(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 9:
                case 10:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                    if (this.f46226.f36110.f66203) {
                        if (this.f46227.mo5435().m26114()) {
                            m34038(c12283, ((InterfaceC6802) this.f46227).mo4062());
                        } else if (!m34043(c12283, ((InterfaceC9357) this.f46227).mo4063())) {
                            m34040(c12283, ((InterfaceC9357) this.f46227).mo4063());
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 16:
                case 17:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    mo34041(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 18:
                case 19:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    c12283.write(", ", 0, 2);
                    C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 20:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 21:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    c12283.write(", ", 0, 2);
                    c12283.write("field@0x", 0, 8);
                    c12283.mo6726(((InterfaceC5828) this.f46227).mo11355());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 22:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    c12283.write(", ", 0, 2);
                    mo34041(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 23:
                case 24:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 25:
                    m34044(c12283);
                    c12283.write(32);
                    m34046(c12283);
                    c12283.write(", ", 0, 2);
                    m34048(c12283);
                    c12283.write(", ", 0, 2);
                    m34047(c12283, ((InterfaceC22325) this.f46227).mo26898());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 26:
                    m34044(c12283);
                    c12283.write(32);
                    m34042(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 27:
                    i3 = 0;
                    i4 = 2;
                    m34044(c12283);
                    c12283.write(32);
                    m34042(c12283);
                    c12283.write(", ", i3, i4);
                    c12283.write("inline@", i3, 7);
                    c12283.m30529(((InterfaceC14296) this.f46227).mo14567());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 28:
                    i5 = 0;
                    i6 = 2;
                    m34044(c12283);
                    c12283.write(32);
                    m34042(c12283);
                    c12283.write(", ", i5, i6);
                    c12283.write("vtable@", i5, 7);
                    c12283.m30529(((InterfaceC3979) this.f46227).mo2110());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 29:
                    m34044(c12283);
                    c12283.write(32);
                    m34045(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 30:
                    i3 = 0;
                    i4 = 2;
                    m34044(c12283);
                    c12283.write(32);
                    m34045(c12283);
                    c12283.write(", ", i3, i4);
                    c12283.write("inline@", i3, 7);
                    c12283.m30529(((InterfaceC14296) this.f46227).mo14567());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 31:
                    i5 = 0;
                    i6 = 2;
                    m34044(c12283);
                    c12283.write(32);
                    m34045(c12283);
                    c12283.write(", ", i5, i6);
                    c12283.write("vtable@", i5, 7);
                    c12283.m30529(((InterfaceC3979) this.f46227).mo2110());
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 32:
                    m34044(c12283);
                    c12283.write(32);
                    m34042(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446Mo3896, i, strM26056);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                case 33:
                    m34044(c12283);
                    c12283.write(32);
                    m34045(c12283);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446, r9, strM26055);
                    c12283.write(", ", 0, 2);
                    m34039(c12283, interfaceC7446Mo3896, i, strM26056);
                    if (z2) {
                        return true;
                    }
                    if (this.f46227.mo5435() != EnumC10297.f35104) {
                        break;
                    }
                    c12283.getClass();
                    c12283.write("\nreturn-void", 0, 12);
                    return true;
                default:
                    return false;
            }
        }
        r8 = 0;
        strM26055 = null;
        interfaceC7446 = null;
        str2 = null;
        z = false;
        interfaceC7446Mo3896 = null;
        r10 = r8;
        i = 0;
        String str5 = str2;
        z2 = z;
        strM26056 = str5;
        r9 = r10;
        interfaceC1594 = this.f46227;
        if (interfaceC1594 instanceof InterfaceC3274) {
            i7 = C4901.f17184[interfaceC1594.mo5435().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        throw new C20749(null, "Invalid 31t opcode: %s", this.f46227.mo5435());
                    }
                    this.f46226.m26682(m20371() + ((InterfaceC3274) this.f46227).mo8965(), EnumC10297.f35114);
                } else if (this.f46226.m26685(((InterfaceC3274) this.f46227).mo8965() + m20371()) == -1) {
                    c12283.getClass();
                    c12283.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            } else if (this.f46226.m26681(((InterfaceC3274) this.f46227).mo8965() + m20371()) == -1) {
                c12283.getClass();
                c12283.write("#invalid payload reference\n", 0, 27);
                z2 = true;
            }
        }
        if (enumC10297Mo5435.m26116()) {
            this.f46226.f36110.getClass();
            i2 = this.f46226.f36110.f66198 >= 14 ? 0 : 0;
            c12283.getClass();
            c12283.write("#disallowed odex opcode\n", 0, 24);
            z2 = true;
        }
        if (z2) {
            c12283.getClass();
            c12283.write("#", i2, 1);
        }
        switch (C4901.f17183[this.f46227.mo5435().f35328.ordinal()]) {
            case 1:
                m34044(c12283);
                c12283.write(32);
                mo34041(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 2:
                if (this.f46227 instanceof InterfaceC21557) {
                    c12283.getClass();
                    c12283.write("#unknown opcode: 0x", 0, 19);
                    c12283.mo6726(((InterfaceC21557) this.f46227).mo44435());
                    c12283.write(10);
                }
                m34044(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 3:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 4:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 5:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 6:
                m34044(c12283);
                c12283.write(32);
                c12283.write(str);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 7:
            case 8:
                m34044(c12283);
                c12283.write(32);
                mo34041(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 9:
            case 10:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                if (this.f46226.f36110.f66203) {
                    if (this.f46227.mo5435().m26114()) {
                        m34038(c12283, ((InterfaceC6802) this.f46227).mo4062());
                    } else if (!m34043(c12283, ((InterfaceC9357) this.f46227).mo4063())) {
                        m34040(c12283, ((InterfaceC9357) this.f46227).mo4063());
                    }
                }
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 16:
            case 17:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                mo34041(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 18:
            case 19:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                c12283.write(", ", 0, 2);
                C16896.m39570(c12283, ((InterfaceC6802) this.f46227).mo4062());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 20:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 21:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                c12283.write(", ", 0, 2);
                c12283.write("field@0x", 0, 8);
                c12283.mo6726(((InterfaceC5828) this.f46227).mo11355());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 22:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                c12283.write(", ", 0, 2);
                mo34041(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 23:
            case 24:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 25:
                m34044(c12283);
                c12283.write(32);
                m34046(c12283);
                c12283.write(", ", 0, 2);
                m34048(c12283);
                c12283.write(", ", 0, 2);
                m34047(c12283, ((InterfaceC22325) this.f46227).mo26898());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 26:
                m34044(c12283);
                c12283.write(32);
                m34042(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 27:
                i3 = 0;
                i4 = 2;
                m34044(c12283);
                c12283.write(32);
                m34042(c12283);
                c12283.write(", ", i3, i4);
                c12283.write("inline@", i3, 7);
                c12283.m30529(((InterfaceC14296) this.f46227).mo14567());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 28:
                i5 = 0;
                i6 = 2;
                m34044(c12283);
                c12283.write(32);
                m34042(c12283);
                c12283.write(", ", i5, i6);
                c12283.write("vtable@", i5, 7);
                c12283.m30529(((InterfaceC3979) this.f46227).mo2110());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 29:
                m34044(c12283);
                c12283.write(32);
                m34045(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 30:
                i3 = 0;
                i4 = 2;
                m34044(c12283);
                c12283.write(32);
                m34045(c12283);
                c12283.write(", ", i3, i4);
                c12283.write("inline@", i3, 7);
                c12283.m30529(((InterfaceC14296) this.f46227).mo14567());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 31:
                i5 = 0;
                i6 = 2;
                m34044(c12283);
                c12283.write(32);
                m34045(c12283);
                c12283.write(", ", i5, i6);
                c12283.write("vtable@", i5, 7);
                c12283.m30529(((InterfaceC3979) this.f46227).mo2110());
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 32:
                m34044(c12283);
                c12283.write(32);
                m34042(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446Mo3896, i, strM26056);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            case 33:
                m34044(c12283);
                c12283.write(32);
                m34045(c12283);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446, r9, strM26055);
                c12283.write(", ", 0, 2);
                m34039(c12283, interfaceC7446Mo3896, i, strM26056);
                if (z2) {
                    return true;
                }
                if (this.f46227.mo5435() != EnumC10297.f35104) {
                    break;
                }
                c12283.getClass();
                c12283.write("\nreturn-void", 0, 12);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34044(C12283 c12283) throws IOException {
        c12283.mo6725(this.f46227.mo5435());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo34041(C12283 c12283) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34047(C12283 c12283, int i) throws IOException {
        this.f46226.f36108.m47551(c12283, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34046(C12283 c12283) throws IOException {
        m34047(c12283, ((InterfaceC4685) this.f46227).mo1140());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34048(C12283 c12283) throws IOException {
        m34047(c12283, ((InterfaceC1157) this.f46227).mo1144());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34042(C12283 c12283) throws IOException {
        InterfaceC10768 interfaceC10768 = (InterfaceC10768) this.f46227;
        int iMo2107 = interfaceC10768.mo2107();
        c12283.write(123);
        if (iMo2107 == 1) {
            m34047(c12283, interfaceC10768.mo3085());
        } else if (iMo2107 == 2) {
            m34047(c12283, interfaceC10768.mo3085());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3087());
        } else if (iMo2107 == 3) {
            m34047(c12283, interfaceC10768.mo3085());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3087());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3089());
        } else if (iMo2107 == 4) {
            m34047(c12283, interfaceC10768.mo3085());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3087());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3089());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3086());
        } else if (iMo2107 == 5) {
            m34047(c12283, interfaceC10768.mo3085());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3087());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3089());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3086());
            c12283.write(", ", 0, 2);
            m34047(c12283, interfaceC10768.mo3088());
        }
        c12283.write(q.h);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34045(C12283 c12283) throws IOException {
        InterfaceC11742 interfaceC11742 = (InterfaceC11742) this.f46227;
        int iMo2107 = interfaceC11742.mo2107();
        if (iMo2107 == 0) {
            c12283.getClass();
            c12283.write("{}", 0, 2);
            return;
        }
        int iMo2109 = interfaceC11742.mo2109();
        C21129 c21129 = this.f46226.f36108;
        int i = (iMo2107 + iMo2109) - 1;
        int i2 = c21129.f68803;
        int i3 = c21129.f68802;
        c21129.f68801.getClass();
        int i4 = i3 - i2;
        if (iMo2109 >= i4) {
            c12283.getClass();
            c12283.write("{p", 0, 2);
            c12283.m30529(iMo2109 - i4);
            c12283.write(" .. p", 0, 5);
            c12283.m30529(i - i4);
            c12283.write(q.h);
            return;
        }
        c12283.getClass();
        c12283.write("{v", 0, 2);
        c12283.m30529(iMo2109);
        c12283.write(" .. v", 0, 5);
        c12283.m30529(i);
        c12283.write(q.h);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m34040(C12283 c12283, int i) throws IOException {
        if (C23572.m52003(i)) {
            c12283.getClass();
            c12283.write("  # ", 0, 4);
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fIntBitsToFloat == Float.POSITIVE_INFINITY) {
                c12283.write("Float.POSITIVE_INFINITY", 0, 23);
                return;
            }
            if (fIntBitsToFloat == Float.NEGATIVE_INFINITY) {
                c12283.write("Float.NEGATIVE_INFINITY", 0, 23);
                return;
            }
            if (Float.isNaN(fIntBitsToFloat)) {
                c12283.write("Float.NaN", 0, 9);
                return;
            }
            if (fIntBitsToFloat == Float.MAX_VALUE) {
                c12283.write("Float.MAX_VALUE", 0, 15);
                return;
            }
            if (fIntBitsToFloat == 3.1415927f) {
                c12283.write("(float)Math.PI", 0, 14);
            } else if (fIntBitsToFloat == 2.7182817f) {
                c12283.write("(float)Math.E", 0, 13);
            } else {
                c12283.write(Float.toString(fIntBitsToFloat));
                c12283.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34038(C12283 c12283, long j) throws IOException {
        if (C23572.m52004(j)) {
            c12283.getClass();
            c12283.write("  # ", 0, 4);
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble == Double.POSITIVE_INFINITY) {
                c12283.write("Double.POSITIVE_INFINITY", 0, 24);
                return;
            }
            if (dLongBitsToDouble == Double.NEGATIVE_INFINITY) {
                c12283.write("Double.NEGATIVE_INFINITY", 0, 24);
                return;
            }
            if (Double.isNaN(dLongBitsToDouble)) {
                c12283.write("Double.NaN", 0, 10);
                return;
            }
            if (dLongBitsToDouble == Double.MAX_VALUE) {
                c12283.write("Double.MAX_VALUE", 0, 16);
                return;
            }
            if (dLongBitsToDouble == 3.141592653589793d) {
                c12283.write("Math.PI", 0, 7);
            } else if (dLongBitsToDouble == 2.718281828459045d) {
                c12283.write("Math.E", 0, 6);
            } else {
                c12283.write(Double.toString(dLongBitsToDouble));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34043(C12283 c12283, int i) throws IOException {
        String str = (String) this.f46226.f36110.f66201.get(i);
        if (str == null) {
            return false;
        }
        c12283.getClass();
        c12283.write("    # ", 0, 6);
        c12283.write(str, 0, str.length());
        return true;
    }
}
