package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֡۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0417 implements InterfaceC11002 {
    public static final EnumC0417 JULIAN_DAY;
    public static final EnumC0417 MODIFIED_JULIAN_DAY;
    public static final EnumC0417 RATA_DIE;
    public static final /* synthetic */ EnumC0417[] d;
    public static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient C1828 b;
    public final transient long c;

    @Override // l.InterfaceC11002
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC0417 valueOf(String str) {
        return (EnumC0417) Enum.valueOf(EnumC0417.class, str);
    }

    public static EnumC0417[] values() {
        return (EnumC0417[]) d.clone();
    }

    static {
        EnumC22996 enumC22996 = EnumC22996.DAYS;
        EnumC22996 enumC22997 = EnumC22996.FOREVER;
        EnumC0417 enumC0417 = new EnumC0417("JULIAN_DAY", 0, "JulianDay", enumC22996, enumC22997, 2440588L);
        JULIAN_DAY = enumC0417;
        EnumC0417 enumC0418 = new EnumC0417("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", enumC22996, enumC22997, 40587L);
        MODIFIED_JULIAN_DAY = enumC0418;
        EnumC0417 enumC0419 = new EnumC0417("RATA_DIE", 2, "RataDie", enumC22996, enumC22997, 719163L);
        RATA_DIE = enumC0419;
        d = new EnumC0417[]{enumC0417, enumC0418, enumC0419};
    }

    public EnumC0417(String str, int i, String str2, EnumC22996 enumC22996, EnumC22996 enumC22997, long j) {
        super(str, i);
        this.a = str2;
        this.b = C1828.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // l.InterfaceC11002
    public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
        if (!this.b.e(j)) {
            throw new C15464("Invalid value: " + this.a + " " + j);
        }
        return interfaceC15235.c(AbstractC1726.R(j, this.c), EnumC18762.EPOCH_DAY);
    }

    @Override // l.InterfaceC11002
    public final C1828 s() {
        return this.b;
    }

    @Override // l.InterfaceC11002
    public final boolean l(InterfaceC21584 interfaceC21584) {
        return interfaceC21584.e(EnumC18762.EPOCH_DAY);
    }

    @Override // l.InterfaceC11002
    public final C1828 m(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584.e(EnumC18762.EPOCH_DAY)) {
            return this.b;
        }
        throw new C15464("Unsupported field: " + this);
    }

    @Override // l.InterfaceC11002
    public final long C(InterfaceC21584 interfaceC21584) {
        return interfaceC21584.G(EnumC18762.EPOCH_DAY) + this.c;
    }

    @Override // l.InterfaceC11002
    public final InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC21233 interfaceC21233R = AbstractC14884.r(c11832);
        EnumC5481 enumC5482 = EnumC5481.LENIENT;
        long j = this.c;
        if (enumC5481 == enumC5482) {
            return interfaceC21233R.j(AbstractC1726.R(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return interfaceC21233R.j(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
