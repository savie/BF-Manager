package l;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes.dex */
public final class C22201 extends AbstractC15042 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6055 f72633;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1033 f72634;

    public C22201(C1033 c1033) {
        this.f72634 = c1033;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b9 A[Catch: ۛ۫ۡ -> 0x02cf, TryCatch #5 {ۛ۫ۡ -> 0x02cf, blocks: (B:107:0x024c, B:109:0x0256, B:110:0x025d, B:126:0x02af, B:127:0x02b3, B:129:0x02b9, B:130:0x02bc, B:117:0x0276, B:118:0x0294, B:120:0x0298, B:122:0x029e, B:123:0x02a1, B:124:0x02a5, B:125:0x02aa), top: B:163:0x024c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231 A[Catch: ۛ۫ۡ -> 0x0247, TryCatch #11 {ۛ۫ۡ -> 0x0247, blocks: (B:72:0x01c0, B:74:0x01c8, B:75:0x01cf, B:96:0x0227, B:97:0x022b, B:99:0x0231, B:100:0x0234, B:83:0x01ea, B:84:0x01fe, B:86:0x0202, B:88:0x0208, B:89:0x020c, B:90:0x0210, B:92:0x0216, B:93:0x0219, B:94:0x021d, B:95:0x0223), top: B:174:0x01c0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21536 m49324(EnumC13776 enumC13776) {
        EnumC11659 enumC11659M34786;
        C15187 c15187M34791;
        AbstractC21536 c19088;
        double d;
        long jDoubleToLongBits;
        AbstractC21536 c1448;
        float f;
        int iFloatToIntBits;
        C15187 c15187M34802;
        C15187 c15187M34803;
        long j;
        C6055 c6055;
        AbstractC21536 c20499 = null;
        this.f72633 = null;
        int i = C22803.f74198[enumC13776.ordinal()];
        int i2 = 0;
        C1033 c1033 = this.f72634;
        switch (i) {
            case 1:
            case 2:
                try {
                    c1033.f16199.m31848(EnumC20934.f68034);
                    break;
                } catch (C6055 e) {
                    this.f72633 = e;
                }
                c20499 = new C20499(c1033.f16199.f42724);
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                try {
                    C12842 c12842 = c1033.f16199;
                    if (c12842.f42721 == EnumC20934.f68206) {
                        c12842.m31840();
                        c1033.f16199.f42733 = true;
                    }
                    C12842 c12843 = c1033.f16199;
                    i2 = c12843.f42723 * c12843.f42726;
                    c12843.m31848(EnumC20934.f68154);
                    break;
                } catch (C6055 e2) {
                    this.f72633 = e2;
                }
                c20499 = new C23322(enumC13776, Integer.valueOf(i2));
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 13:
            case 14:
                try {
                    C12842 c12844 = c1033.f16199;
                    c12844.f42733 = false;
                    if (c12844.f42721 == EnumC20934.f68206) {
                        c12844.m31840();
                        c1033.f16199.f42733 = true;
                    }
                    int i3 = C13735.f45289[c1033.f16199.f42721.ordinal()];
                    try {
                        if (i3 == 6) {
                            f = (float) c1033.f16199.f42716;
                        } else if (i3 == 8) {
                            f = c1033.f16199.f42718;
                        } else {
                            if (i3 == 12) {
                                C12842 c12845 = c1033.f16199;
                                if (c12845.f42733) {
                                    iFloatToIntBits = c12845.f42726;
                                } else {
                                    f = c12845.f42726;
                                }
                                if (c1033.f16199.f42723 == -1) {
                                    iFloatToIntBits ^= Integer.MIN_VALUE;
                                }
                                c1448 = new C7093(Integer.valueOf(iFloatToIntBits));
                                c1033.f16199.m31840();
                                c20499 = c1448;
                                c6055 = this.f72633;
                                if (c6055 == null) {
                                    return c20499;
                                }
                                throw c6055;
                            }
                            if (i3 == 20) {
                                f = Float.POSITIVE_INFINITY;
                            } else {
                                if (i3 != 21) {
                                    c1033.f16198.m2152(new C12365(1, this));
                                    c1033.f16198.mo2149(c1033.f16199.f42728, "\"{0}\" token is expected", "<Float>");
                                    throw new C6055();
                                }
                                f = Float.NaN;
                            }
                        }
                        c1033.f16199.m31840();
                        c20499 = c1448;
                    } catch (C6055 e3) {
                        e = e3;
                        c20499 = c1448;
                        this.f72633 = e;
                    }
                    iFloatToIntBits = Float.floatToIntBits(f);
                    if (c1033.f16199.f42723 == -1) {
                        iFloatToIntBits ^= Integer.MIN_VALUE;
                    }
                    c1448 = new C7093(Integer.valueOf(iFloatToIntBits));
                } catch (C6055 e4) {
                    e = e4;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 15:
            case 16:
                try {
                    C12842 c12846 = c1033.f16199;
                    if (c12846.f42721 == EnumC20934.f68206) {
                        c12846.m31840();
                        c1033.f16199.f42733 = true;
                    }
                    int i4 = C13735.f45289[c1033.f16199.f42721.ordinal()];
                    try {
                        if (i4 == 6) {
                            d = c1033.f16199.f42716;
                        } else {
                            if (i4 != 8) {
                                if (i4 == 10) {
                                    C12842 c12847 = c1033.f16199;
                                    if (c12847.f42733) {
                                        jDoubleToLongBits = c12847.f42731;
                                    } else {
                                        d = c12847.f42731;
                                    }
                                } else if (i4 == 12) {
                                    C12842 c12848 = c1033.f16199;
                                    if (c12848.f42733) {
                                        jDoubleToLongBits = c12848.f42726;
                                    } else {
                                        d = c12848.f42726;
                                    }
                                } else if (i4 == 20) {
                                    d = Double.POSITIVE_INFINITY;
                                } else {
                                    if (i4 != 21) {
                                        c1033.f16198.mo2149(c1033.f16199.f42728, "\"{0}\" token is expected", "Double");
                                        throw new C6055();
                                    }
                                    d = Double.NaN;
                                }
                                if (c1033.f16199.f42723 == -1) {
                                    jDoubleToLongBits ^= Long.MIN_VALUE;
                                }
                                c1448 = new C1448(Long.valueOf(jDoubleToLongBits));
                                c1033.f16199.m31840();
                                c20499 = c1448;
                                c6055 = this.f72633;
                                if (c6055 == null) {
                                    return c20499;
                                }
                                throw c6055;
                            }
                            d = c1033.f16199.f42718;
                        }
                        c1033.f16199.m31840();
                        c20499 = c1448;
                    } catch (C6055 e5) {
                        e = e5;
                        c20499 = c1448;
                        this.f72633 = e;
                    }
                    jDoubleToLongBits = Double.doubleToLongBits(d);
                    if (c1033.f16199.f42723 == -1) {
                        jDoubleToLongBits ^= Long.MIN_VALUE;
                    }
                    c1448 = new C1448(Long.valueOf(jDoubleToLongBits));
                } catch (C6055 e6) {
                    e = e6;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 17:
            case 18:
                try {
                    C12842 c12849 = c1033.f16199;
                    if (c12849.f42721 == EnumC20934.f68206) {
                        c12849.m31840();
                        c1033.f16199.f42733 = true;
                    }
                    int i5 = C13735.f45289[c1033.f16199.f42721.ordinal()];
                    if (i5 == 10) {
                        j = c1033.f16199.f42731;
                    } else {
                        if (i5 != 12) {
                            c1033.f16198.mo2149(c1033.f16199.f42722, "\"{0}\" token is expected", "Integer");
                            throw new C6055();
                        }
                        j = c1033.f16199.f42726;
                    }
                    C18382 c18382 = new C18382(Long.valueOf(j * ((long) c1033.f16199.f42723)));
                    try {
                        c1033.f16199.m31840();
                        c20499 = c18382;
                    } catch (C6055 e7) {
                        e = e7;
                        c20499 = c18382;
                        this.f72633 = e;
                    }
                } catch (C6055 e8) {
                    e = e8;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 19:
                try {
                    c15187M34802 = c1033.f16200.m34802();
                    break;
                } catch (C6055 e9) {
                    this.f72633 = e9;
                    c15187M34802 = null;
                }
                if (this.f72633 == null) {
                    c20499 = new C19794(EnumC13776.f45423, c15187M34802);
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 20:
            case 21:
                try {
                    c15187M34803 = c1033.f16200.m34802();
                    break;
                } catch (C6055 e10) {
                    this.f72633 = e10;
                    c15187M34803 = null;
                }
                if (this.f72633 == null) {
                    c20499 = new C16266(c15187M34803);
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 22:
            case 23:
                try {
                    c1448 = new C22616(c1033.f16200.m34792(true));
                    c20499 = c1448;
                } catch (C6055 e11) {
                    this.f72633 = e11;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 24:
            case 25:
                c20499 = m49325(EnumC13776.f45431);
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 26:
            case 27:
                c20499 = m49325(EnumC13776.f45408);
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 28:
            case 29:
                c20499 = m49325(EnumC13776.f45428);
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 30:
                try {
                    C15187 c15187M34804 = c1033.f16200.m34802();
                    c1033.f16199.m31848(EnumC20934.f68046);
                    c19088 = new C10622(c15187M34804, c1033.f16200.m34802());
                    c20499 = c19088;
                } catch (C6055 e12) {
                    this.f72633 = e12;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 31:
                try {
                    C12842 c128410 = c1033.f16199;
                    if (c128410.f42721 == EnumC20934.f68154) {
                        enumC11659M34786 = C2485.m7621(c128410.f42726);
                        c1033.f16199.m31840();
                        c1033.f16199.m31848(EnumC20934.f68046);
                        C12842 c128411 = c1033.f16199;
                        if (c128411.f42721 == EnumC20934.f68161) {
                            c15187M34791 = c1033.f16200.f47348.m31654(c128411.f42726);
                            c1033.f16199.m31840();
                        } else {
                            c15187M34791 = c1033.f16200.m34791(enumC11659M34786);
                        }
                    } else {
                        enumC11659M34786 = c1033.f16200.m34786();
                        c1033.f16199.m31848(EnumC20934.f68046);
                        C12842 c128412 = c1033.f16199;
                        if (c128412.f42721 == EnumC20934.f68161) {
                            c15187M34791 = c1033.f16200.f47348.m31654(c128412.f42726);
                            c1033.f16199.m31840();
                        } else {
                            c15187M34791 = c1033.f16200.m34791(enumC11659M34786);
                        }
                    }
                    c19088 = new C19088(enumC11659M34786, c15187M34791);
                    c20499 = c19088;
                } catch (C6055 e13) {
                    this.f72633 = e13;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 32:
                c20499 = (C13444) m49323(new C11618());
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 33:
                c20499 = (C21910) m49323(new C2444());
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 34:
                try {
                    c1448 = new C7799(EnumC13776.f45424, c1033.f16200.m34797());
                    c20499 = c1448;
                } catch (C6055 e14) {
                    this.f72633 = e14;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            case 35:
                try {
                    c1448 = new C9211(EnumC13776.f45430, c1033.f16200.m34799());
                    c20499 = c1448;
                } catch (C6055 e15) {
                    this.f72633 = e15;
                }
                c6055 = this.f72633;
                if (c6055 == null) {
                    return c20499;
                }
                throw c6055;
            default:
                throw new RuntimeException(C16523.m38890("The Constant Type \"", enumC13776.m33533(), "\" does not have a corresponding visitor function."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[Catch: ۛ۫ۡ -> 0x00dc, TryCatch #0 {ۛ۫ۡ -> 0x00dc, blocks: (B:3:0x0003, B:5:0x0016, B:9:0x0030, B:17:0x0078, B:19:0x0080, B:20:0x0099, B:33:0x00c4, B:34:0x00db, B:27:0x00ab, B:28:0x00b1, B:29:0x00b9, B:8:0x001e, B:10:0x003a, B:12:0x004a, B:15:0x0059, B:16:0x006e), top: B:38:0x0003 }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21204 m49325(EnumC13776 enumC13776) {
        C15187 c15187M5531;
        C21204 c15561;
        C1033 c1033 = this.f72634;
        C21204 c21204 = null;
        try {
            EnumC20934 enumC20934 = c1033.f16199.f42721;
            C15187 c15187M34792 = c1033.f16200.m34792(false);
            C12842 c12842 = c1033.f16199;
            if (c12842.f42721 == EnumC20934.f68045) {
                c12842.m31840();
                if (enumC20934 != EnumC20934.f68161) {
                    C12738 c12738 = c1033.f16200.f47348;
                    EnumC13776 enumC13777 = EnumC13776.f45400;
                    c12738.getClass();
                    c15187M34792 = c12738.m31658((AbstractC21536) new C5682(enumC13777, c15187M34792));
                }
                C15187 c15187 = c15187M34792;
                c15187M34792 = c1033.f16200.m34802();
                c15187M5531 = c15187;
            } else if (c1033.f16200.f47341.f31850.m5531().mo32563() || c1033.f16200.f47341.f31850.m5531().f49578 == null) {
                c15187M5531 = c1033.f16200.f47341.f31850.m5531();
            } else {
                C14441 c14441 = c1033.f16200;
                c15187M5531 = c14441.f47348.m31658(c14441.f47341.f31850.m5531().f49578);
            }
            C12842 c12843 = c1033.f16199;
            if (c12843.f42721 == EnumC20934.f68046) {
                c12843.m31840();
                C14441 c14442 = c1033.f16200;
                C12738 c12739 = c14442.f47348;
                EnumC13776 enumC13778 = EnumC13776.f45398;
                C15187 c15187M34802 = c14442.m34802();
                c12739.getClass();
                c15187M34792 = c12739.m31658((AbstractC21536) new C21204(enumC13778, c15187M34792, c15187M34802));
            }
            int i = C13735.f45288[enumC13776.ordinal()];
            if (i == 1) {
                c15561 = new C15561(EnumC13776.f45428, c15187M5531, c15187M34792);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        c15561 = new C4270(c15187M5531, c15187M34792);
                    }
                    if (c21204 != null) {
                        return c21204;
                    }
                    c1033.f16198.mo2150("Invalid type of Constant Pool Constant {0}", enumC13776.m33533());
                    C6055 c6055 = new C6055();
                    c6055.m16453();
                    throw c6055;
                }
                c15561 = new C8505(EnumC13776.f45431, c15187M5531, c15187M34792);
            }
            c21204 = c15561;
            if (c21204 != null) {
                return c21204;
            }
            c1033.f16198.mo2150("Invalid type of Constant Pool Constant {0}", enumC13776.m33533());
            C6055 c6056 = new C6055();
            c6056.m16453();
            throw c6056;
        } catch (C6055 e) {
            this.f72633 = e;
            return c21204;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: ۛ۫ۡ -> 0x0118, TryCatch #0 {ۛ۫ۡ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[Catch: ۛ۫ۡ -> 0x0118, TryCatch #0 {ۛ۫ۡ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[Catch: ۛ۫ۡ -> 0x0118, TryCatch #0 {ۛ۫ۡ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2859 m49323(BiFunction biFunction) {
        C12842 c12842;
        C12842 c12843;
        C15187 c15187M31658;
        C1033 c1033 = this.f72634;
        try {
            C12842 c12844 = c1033.f16199;
            if (c12844.f42721 == EnumC20934.f68154) {
                int i = c12844.f42726;
                c12844.m31840();
                c1033.f16199.m31848(EnumC20934.f68046);
                C12842 c12845 = c1033.f16199;
                if (c12845.f42721 != EnumC20934.f68161) {
                    c1033.f16198.m2152(new Supplier() { // from class: l.ۚۢۡ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return "token=" + this.f18251.f72634.f16199.f42721;
                        }
                    });
                    c1033.f16198.mo2149(c1033.f16199.f42728, "\"{0}\" token is expected", "<CPINDEX>");
                    throw new C6055();
                }
                int i2 = c12845.f42726;
                c12845.m31840();
                C6574 c6574 = new C6574();
                c6574.f22129 = null;
                c6574.f22130 = new ArrayList();
                c6574.f43854 = i;
                return (C2859) biFunction.apply(c6574, c1033.f16200.f47348.m31654(i2));
            }
            C15187 c15187M31659 = c1033.f16200.f47348.m31658(c1033.m3882(EnumC13776.f45409));
            c1033.f16199.m31848(EnumC20934.f68046);
            C15187 c15187M316510 = c1033.f16200.f47348.m31658(c1033.m3882(EnumC13776.f45398));
            if (c1033.f16199.f42721 == EnumC20934.f68039) {
                c1033.m3887();
                c1033.f16199.m31840();
            }
            ArrayList arrayList = new ArrayList(256);
            while (true) {
                if (c1033.f4820 > 0) {
                    C12842 c12846 = c1033.f16199;
                    EnumC20934 enumC20934 = c12846.f42721;
                    EnumC20934 enumC20935 = EnumC20934.f68195;
                    if (enumC20934 == enumC20935) {
                        c1033.m3884();
                        c1033.f16199.m31840();
                        break;
                    }
                    if (enumC20934 == EnumC20934.f68171) {
                        c12846.m31848(enumC20935);
                    }
                    c12842 = c1033.f16199;
                    if (c12842.f42721 == EnumC20934.f68072) {
                        c12842.m31840();
                    }
                    c12843 = c1033.f16199;
                    if (c12843.f42721 == EnumC20934.f68161) {
                        int i3 = c12843.f42726;
                        c12843.m31840();
                        c15187M31658 = c1033.f16200.f47348.m31654(i3);
                    } else {
                        c15187M31658 = c1033.f16200.f47348.m31658(c1033.m3883(null, null, false, true));
                    }
                    arrayList.add(c15187M31658);
                } else {
                    if (c1033.f16199.f42721 == EnumC20934.f68171) {
                        break;
                    }
                    c12842 = c1033.f16199;
                    if (c12842.f42721 == EnumC20934.f68072) {
                        c12842.m31840();
                    }
                    c12843 = c1033.f16199;
                    if (c12843.f42721 == EnumC20934.f68161) {
                        int i4 = c12843.f42726;
                        c12843.m31840();
                        c15187M31658 = c1033.f16200.f47348.m31654(i4);
                    } else {
                        c15187M31658 = c1033.f16200.f47348.m31658(c1033.m3883(null, null, false, true));
                    }
                    arrayList.add(c15187M31658);
                }
            }
            if (c1033.f4820 == 0) {
                c1033.f16199.m31843(EnumC20934.f68171);
            }
            C6574 c6575 = new C6574(c15187M31659, arrayList);
            c1033.f16200.f47341.m24124(c6575);
            return (C2859) biFunction.apply(c6575, c15187M316510);
        } catch (C6055 e) {
            this.f72633 = e;
            return null;
        }
    }
}
