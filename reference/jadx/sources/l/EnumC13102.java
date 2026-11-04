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
/* JADX INFO: renamed from: l.۫۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13102 implements InterfaceC16831 {
    public static final EnumC13102 JULIAN_DAY;
    public static final EnumC13102 MODIFIED_JULIAN_DAY;
    public static final EnumC13102 RATA_DIE;
    public static final /* synthetic */ EnumC13102[] d;
    public static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient C23545 b;
    public final transient long c;

    @Override // l.InterfaceC16831
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC13102 valueOf(String str) {
        return (EnumC13102) Enum.valueOf(EnumC13102.class, str);
    }

    public static EnumC13102[] values() {
        return (EnumC13102[]) d.clone();
    }

    static {
        EnumC10183 enumC10183 = EnumC10183.DAYS;
        EnumC10183 enumC10184 = EnumC10183.FOREVER;
        EnumC13102 enumC13102 = new EnumC13102("JULIAN_DAY", 0, "JulianDay", enumC10183, enumC10184, 2440588L);
        JULIAN_DAY = enumC13102;
        EnumC13102 enumC13103 = new EnumC13102("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", enumC10183, enumC10184, 40587L);
        MODIFIED_JULIAN_DAY = enumC13103;
        EnumC13102 enumC13104 = new EnumC13102("RATA_DIE", 2, "RataDie", enumC10183, enumC10184, 719163L);
        RATA_DIE = enumC13104;
        d = new EnumC13102[]{enumC13102, enumC13103, enumC13104};
    }

    public EnumC13102(String str, int i, String str2, EnumC10183 enumC10183, EnumC10183 enumC10184, long j) {
        super(str, i);
        this.a = str2;
        this.b = C23545.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // l.InterfaceC16831
    public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
        if (!this.b.e(j)) {
            throw new C21241("Invalid value: " + this.a + " " + j);
        }
        return interfaceC1235.b(AbstractC1758.R(j, this.c), EnumC8692.EPOCH_DAY);
    }

    @Override // l.InterfaceC16831
    public final C23545 p() {
        return this.b;
    }

    @Override // l.InterfaceC16831
    public final boolean i(InterfaceC9437 interfaceC9437) {
        return interfaceC9437.d(EnumC8692.EPOCH_DAY);
    }

    @Override // l.InterfaceC16831
    public final C23545 j(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437.d(EnumC8692.EPOCH_DAY)) {
            return this.b;
        }
        throw new C21241("Unsupported field: " + this);
    }

    @Override // l.InterfaceC16831
    public final long z(InterfaceC9437 interfaceC9437) {
        return interfaceC9437.C(EnumC8692.EPOCH_DAY) + this.c;
    }

    @Override // l.InterfaceC16831
    public final InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC8912 interfaceC8912R = AbstractC2946.r(c14790);
        EnumC18520 enumC18521 = EnumC18520.LENIENT;
        long j = this.c;
        if (enumC18520 == enumC18521) {
            return interfaceC8912R.h(AbstractC1758.R(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return interfaceC8912R.h(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
