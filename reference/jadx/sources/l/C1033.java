package l;

/* JADX INFO: renamed from: l.֨ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes2.dex */
public final class C1033 extends C4561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f4819 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f4820 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22201 f4821;

    public C1033(C14441 c14441) {
        this.f16198 = c14441.f16198;
        this.f16199 = c14441.f16199;
        this.f16200 = c14441;
        this.f4821 = new C22201(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3885(boolean z) {
        this.f4819 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21536 m3882(EnumC13776 enumC13776) {
        return this.f4821.m49324(enumC13776);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC13776 m3880(boolean z, boolean z2) {
        EnumC13776 enumC13776M7615;
        if (z) {
            enumC13776M7615 = null;
        } else if (z2) {
            enumC13776M7615 = C2485.m7623(this.f16199.f42720);
        } else {
            enumC13776M7615 = C2485.m7615(this.f16199.f42720);
        }
        String.format("\t\tTag: %s ", enumC13776M7615 == null ? "<not found>" : enumC13776M7615);
        return enumC13776M7615;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21536 m3883(EnumC13776 enumC13776, EnumC13776 enumC13777, boolean z, boolean z2) {
        EnumC13776 enumC13776M3880 = m3880(z, z2);
        C13638.toString(enumC13776M3880);
        if (enumC13776M3880 != null) {
            if (enumC13776 != null && !enumC13776M3880.m33536(enumC13776)) {
                if (enumC13777 == null) {
                    if (this.f4819) {
                        throw C0252.m1696(this.f16198, this.f16199.f42728, "Wrong tag: {0} expected", new Object[]{enumC13776.m33538()});
                    }
                    this.f16198.mo2164(this.f16199.f42728, "Wrong tag: {0} expected", enumC13776.m33538());
                } else if (!enumC13776M3880.m33536(enumC13777)) {
                    if (this.f4819) {
                        throw C0252.m1696(this.f16198, this.f16199.f42728, "Wrong tag: Either {0} or {1} expected", new Object[]{enumC13776.m33538(), enumC13777.m33538()});
                    }
                    this.f16198.mo2164(this.f16199.f42728, "Wrong tag: Either {0} or {1} expected", enumC13776.m33538(), enumC13777.m33538());
                }
            }
            this.f16199.m31840();
            enumC13776 = enumC13776M3880;
        } else if (enumC13776 == null) {
            switch (C13735.f45289[this.f16199.f42721.ordinal()]) {
                case 1:
                    enumC13776 = EnumC13776.f45435;
                    break;
                case 2:
                    enumC13776 = EnumC13776.f45402;
                    break;
                case 3:
                    enumC13776 = EnumC13776.f45420;
                    break;
                case 4:
                    enumC13776 = EnumC13776.f45404;
                    break;
                case 5:
                    enumC13776 = EnumC13776.f45399;
                    break;
                case 6:
                    enumC13776 = EnumC13776.f45416;
                    break;
                case 7:
                    enumC13776 = EnumC13776.f45434;
                    break;
                case 8:
                    enumC13776 = EnumC13776.f45401;
                    break;
                case 9:
                    enumC13776 = EnumC13776.f45429;
                    break;
                case 10:
                    enumC13776 = EnumC13776.f45405;
                    break;
                case 11:
                    enumC13776 = EnumC13776.f45422;
                    break;
                case 12:
                    enumC13776 = EnumC13776.f45432;
                    break;
                case 13:
                    enumC13776 = EnumC13776.f45417;
                    break;
                case 14:
                    enumC13776 = EnumC13776.f45433;
                    break;
                case 15:
                    enumC13776 = EnumC13776.f45414;
                    break;
                case 16:
                    enumC13776 = EnumC13776.f45412;
                    break;
                case 17:
                case 18:
                case 19:
                    enumC13776 = EnumC13776.f45426;
                    break;
                default:
                    C18111 c18111 = this.f16198;
                    C12842 c12842 = this.f16199;
                    throw C7997.m21056(c18111, c12842.f42728, "Value expected near \"{0}\"", new Object[]{c12842.f42721.m47092()});
            }
        }
        return this.f4821.m49324(enumC13776);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15187 m3886() {
        AbstractC21536 c23322;
        EnumC13776 enumC13776M3880 = m3880(false, true);
        if (enumC13776M3880 != null && enumC13776M3880.m33539() >= 1) {
            this.f16199.m31840();
            return this.f16200.f47348.m31658(this.f4821.m49324(enumC13776M3880));
        }
        int i = C13735.f45289[this.f16199.f42721.ordinal()];
        if (i == 2) {
            c23322 = new C23322(EnumC13776.f45435, Integer.valueOf(this.f16199.f42726));
        } else if (i == 4) {
            c23322 = new C23322(EnumC13776.f45420, Integer.valueOf(this.f16199.f42726));
        } else if (i == 6) {
            c23322 = new C1448(Long.valueOf(Double.doubleToLongBits(this.f16199.f42716)));
        } else if (i == 8) {
            c23322 = new C7093(Integer.valueOf(Float.floatToIntBits(this.f16199.f42718)));
        } else if (i == 10) {
            c23322 = new C18382(Long.valueOf(this.f16199.f42731));
        } else if (i == 12) {
            c23322 = new C23322(EnumC13776.f45422, Integer.valueOf(this.f16199.f42726));
        } else if (i == 14) {
            c23322 = new C23322(EnumC13776.f45417, Integer.valueOf(this.f16199.f42726));
        } else if (i == 19) {
            String str = this.f16199.f42724;
            if (str.equalsIgnoreCase("true")) {
                c23322 = new C23322(EnumC13776.f45414, 1);
            } else {
                if (!str.equalsIgnoreCase("false")) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
                }
                c23322 = new C23322(EnumC13776.f45414, 0);
            }
        } else if (i == 16) {
            c23322 = new C23322(EnumC13776.f45414, Integer.valueOf(this.f16199.f42726));
        } else {
            if (i != 17) {
                throw C0252.m1696(this.f16198, this.f16199.f42728, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
            }
            c23322 = new C20499(this.f16199.f42724);
        }
        this.f16199.m31840();
        return this.f16200.f47348.m31658(c23322);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m3881(EnumC13776 enumC13776, EnumC13776 enumC13777, boolean z) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31840();
            return this.f16200.f47348.m31654(i);
        }
        return this.f16200.f47348.m31658(m3883(enumC13776, enumC13777, z, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3884() {
        this.f4820--;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3887() {
        this.f4820++;
    }
}
