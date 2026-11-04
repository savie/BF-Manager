package l;

/* JADX INFO: renamed from: l.᩷ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB9H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21976 {
    /* JADX INFO: renamed from: ۙ */
    public abstract C20946 mo21960(C20946 c20946);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo21458(String str);

    /* JADX INFO: renamed from: ᩷ */
    public void mo27982(C21383 c21383) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo9647(C21383 c21383) {
        mo27982(c21383);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17037(AbstractC0500 abstractC0500) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo6609(C21383 c21383, C7958 c7958) {
        mo17037(c7958);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo6610(C21383 c21383, C18399 c18399) {
        mo17037(c18399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0063 m49712(C0063 c0063) {
        int size = c0063.size();
        C0063 c0064 = new C0063(size);
        for (int i = 0; i < size; i++) {
            c0064.m31604(i, mo21960(c0063.m31619get(i)));
        }
        c0064.mo15005();
        return c0064.equals(c0063) ? c0063 : c0064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16791 m49710(C24975 c24975, C8565 c8565) {
        int iM23001 = c8565.m23001();
        try {
            int iM22997 = c8565.m22997();
            int i = iM22997 & 31;
            int i2 = iM22997 >>> 5;
            if (i == 0) {
                C6544.m18430(i2, 0);
                return new C6746((byte) c8565.m22980());
            }
            if (i == 6) {
                C6544.m18430(i2, 7);
                return new C1525(c8565.m23004(i2 + 1));
            }
            if (i == 2) {
                C6544.m18430(i2, 1);
                return new C14202((short) c8565.m22989(i2 + 1));
            }
            if (i == 3) {
                C6544.m18430(i2, 1);
                return new C24646((char) c8565.m22992(i2 + 1));
            }
            if (i == 4) {
                C6544.m18430(i2, 3);
                return new C10473(c8565.m22989(i2 + 1));
            }
            if (i == 16) {
                C6544.m18430(i2, 3);
                return new C19424(Float.intBitsToFloat(c8565.m22999(i2 + 1)));
            }
            if (i == 17) {
                C6544.m18430(i2, 7);
                return new C4508(Double.longBitsToDouble(c8565.m22994(i2 + 1)));
            }
            switch (i) {
                case 21:
                    C6544.m18430(i2, 3);
                    return new C20565(c24975, c8565, i2);
                case 22:
                    C6544.m18430(i2, 3);
                    return new C3411(c24975, c8565, i2);
                case 23:
                    C6544.m18430(i2, 3);
                    return new C12360(c24975, c8565, i2);
                case 24:
                    C6544.m18430(i2, 3);
                    return new C6395(c24975, c8565, i2);
                case 25:
                    C6544.m18430(i2, 3);
                    return new C16089(c24975, c8565, i2);
                case 26:
                    C6544.m18430(i2, 3);
                    return new C23549(c24975, c8565, i2);
                case 27:
                    C6544.m18430(i2, 3);
                    return new C17581(c24975, c8565, i2);
                case 28:
                    C6544.m18430(i2, 0);
                    return new C16835(c24975, c8565);
                case 29:
                    C6544.m18430(i2, 0);
                    return new C11614(c24975, c8565);
                case 30:
                    C6544.m18430(i2, 0);
                    return C7491.f24771;
                case 31:
                    C6544.m18430(i2, 1);
                    return i2 == 1 ? C12711.f40702 : C12711.f40703;
                default:
                    throw new C23044(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
            }
        } catch (Exception e) {
            throw C23044.m51951(e, "Error while reading encoded value at offset 0x%x", Integer.valueOf(iM23001));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49711(C8565 c8565) {
        int iM23001 = c8565.m23001();
        try {
            int iM22997 = c8565.m22997();
            int i = iM22997 & 31;
            if (i == 0) {
                c8565.m22982();
                return;
            }
            if (i != 6 && i != 2 && i != 3 && i != 4 && i != 16 && i != 17) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                    case 28:
                        int iM22996 = c8565.m22996();
                        for (int i2 = 0; i2 < iM22996; i2++) {
                            m49711(c8565);
                        }
                        return;
                    case 29:
                        C11614.m29184(c8565);
                        return;
                    case 30:
                    case 31:
                        return;
                    default:
                        throw new C23044(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                }
            }
            c8565.m22984((iM22997 >>> 5) + 1);
        } catch (Exception e) {
            throw C23044.m51951(e, "Error while skipping encoded value at offset 0x%x", Integer.valueOf(iM23001));
        }
    }
}
