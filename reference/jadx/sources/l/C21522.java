package l;

/* JADX INFO: renamed from: l.᩶ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes.dex */
public final class C21522 extends C3622 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14808 f68762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f68764 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f68763 = 0;

    public C21522(C16168 c16168) {
        this.f12426 = c16168.f12426;
        this.f12427 = c16168.f12427;
        this.f12428 = c16168;
        this.f68762 = new C14808(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48933(boolean z) {
        this.f68764 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18847 m48930(EnumC3185 enumC3185) {
        return this.f68762.m35657(enumC3185);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC3185 m48928(boolean z, boolean z2) {
        EnumC3185 enumC3185M30334;
        if (z) {
            enumC3185M30334 = null;
        } else if (z2) {
            enumC3185M30334 = C12134.m30333(this.f12427.f26454);
        } else {
            enumC3185M30334 = C12134.m30334(this.f12427.f26454);
        }
        String.format("\t\tTag: %s ", enumC3185M30334 == null ? "<not found>" : enumC3185M30334);
        return enumC3185M30334;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18847 m48931(EnumC3185 enumC3185, EnumC3185 enumC3186, boolean z, boolean z2) {
        EnumC3185 enumC3185M48928 = m48928(z, z2);
        C17359.toString(enumC3185M48928);
        if (enumC3185M48928 != null) {
            if (enumC3185 != null && !enumC3185M48928.m10397(enumC3185)) {
                if (enumC3186 == null) {
                    if (this.f68764) {
                        throw C14087.m34250(this.f12426, this.f12427.f26464, "Wrong tag: {0} expected", new Object[]{enumC3185.m10400()});
                    }
                    this.f12426.mo4166(this.f12427.f26464, "Wrong tag: {0} expected", enumC3185.m10400());
                } else if (!enumC3185M48928.m10397(enumC3186)) {
                    if (this.f68764) {
                        throw C14087.m34250(this.f12426, this.f12427.f26464, "Wrong tag: Either {0} or {1} expected", new Object[]{enumC3185.m10400(), enumC3186.m10400()});
                    }
                    this.f12426.mo4166(this.f12427.f26464, "Wrong tag: Either {0} or {1} expected", enumC3185.m10400(), enumC3186.m10400());
                }
            }
            this.f12427.m21671();
            enumC3185 = enumC3185M48928;
        } else if (enumC3185 == null) {
            switch (C20776.f66559[this.f12427.f26465.ordinal()]) {
                case 1:
                    enumC3185 = EnumC3185.f10347;
                    break;
                case 2:
                    enumC3185 = EnumC3185.f10355;
                    break;
                case 3:
                    enumC3185 = EnumC3185.f10337;
                    break;
                case 4:
                    enumC3185 = EnumC3185.f10341;
                    break;
                case 5:
                    enumC3185 = EnumC3185.f10354;
                    break;
                case 6:
                    enumC3185 = EnumC3185.f10351;
                    break;
                case 7:
                    enumC3185 = EnumC3185.f10371;
                    break;
                case 8:
                    enumC3185 = EnumC3185.f10368;
                    break;
                case 9:
                    enumC3185 = EnumC3185.f10365;
                    break;
                case 10:
                    enumC3185 = EnumC3185.f10364;
                    break;
                case 11:
                    enumC3185 = EnumC3185.f10359;
                    break;
                case 12:
                    enumC3185 = EnumC3185.f10360;
                    break;
                case 13:
                    enumC3185 = EnumC3185.f10345;
                    break;
                case 14:
                    enumC3185 = EnumC3185.f10357;
                    break;
                case 15:
                    enumC3185 = EnumC3185.f10334;
                    break;
                case 16:
                    enumC3185 = EnumC3185.f10344;
                    break;
                case 17:
                case 18:
                case 19:
                    enumC3185 = EnumC3185.f10363;
                    break;
                default:
                    C1122 c1122 = this.f12426;
                    C7965 c7965 = this.f12427;
                    throw C10185.m26296(c1122, c7965.f26464, "Value expected near \"{0}\"", new Object[]{c7965.f26465.m15646()});
            }
        }
        return this.f68762.m35657(enumC3185);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7660 m48934() {
        AbstractC18847 c0705;
        EnumC3185 enumC3185M48928 = m48928(false, true);
        if (enumC3185M48928 != null && enumC3185M48928.m10401() >= 1) {
            this.f12427.m21671();
            return this.f12428.f52487.m36707(this.f68762.m35657(enumC3185M48928));
        }
        int i = C20776.f66559[this.f12427.f26465.ordinal()];
        if (i == 2) {
            c0705 = new C0705(EnumC3185.f10347, Integer.valueOf(this.f12427.f26459));
        } else if (i == 4) {
            c0705 = new C0705(EnumC3185.f10337, Integer.valueOf(this.f12427.f26459));
        } else if (i == 6) {
            c0705 = new C4434(Long.valueOf(Double.doubleToLongBits(this.f12427.f26456)));
        } else if (i == 8) {
            c0705 = new C18604(Integer.valueOf(Float.floatToIntBits(this.f12427.f26449)));
        } else if (i == 10) {
            c0705 = new C10399(Long.valueOf(this.f12427.f26460));
        } else if (i == 12) {
            c0705 = new C0705(EnumC3185.f10359, Integer.valueOf(this.f12427.f26459));
        } else if (i == 14) {
            c0705 = new C0705(EnumC3185.f10345, Integer.valueOf(this.f12427.f26459));
        } else if (i == 19) {
            String str = this.f12427.f26453;
            if (str.equalsIgnoreCase("true")) {
                c0705 = new C0705(EnumC3185.f10334, 1);
            } else {
                if (!str.equalsIgnoreCase("false")) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
                }
                c0705 = new C0705(EnumC3185.f10334, 0);
            }
        } else if (i == 16) {
            c0705 = new C0705(EnumC3185.f10334, Integer.valueOf(this.f12427.f26459));
        } else {
            if (i != 17) {
                throw C14087.m34250(this.f12426, this.f12427.f26464, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
            }
            c0705 = new C10816(this.f12427.f26453);
        }
        this.f12427.m21671();
        return this.f12428.f52487.m36707(c0705);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m48929(EnumC3185 enumC3185, EnumC3185 enumC3186, boolean z) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21671();
            return this.f12428.f52487.m36703(i);
        }
        return this.f12428.f52487.m36707(m48931(enumC3185, enumC3186, z, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48932() {
        this.f68763--;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48935() {
        this.f68763++;
    }
}
