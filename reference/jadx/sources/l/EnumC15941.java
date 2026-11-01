package l;

/* JADX INFO: renamed from: l.ܺ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15941 implements InterfaceC18056 {
    WEEK_BASED_YEARS("WeekBasedYears", C21813.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", C21813.ofSeconds(7889238));

    public final String a;
    public final C21813 b;

    @Override // l.InterfaceC18056
    public final boolean isDurationEstimated() {
        return true;
    }

    EnumC15941(String str, C21813 c21813) {
        this.a = str;
        this.b = c21813;
    }

    @Override // l.InterfaceC18056
    public final C21813 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC18056
    public final InterfaceC15235 m(InterfaceC15235 interfaceC15235, long j) {
        int i = AbstractC8179.a[ordinal()];
        if (i == 1) {
            EnumC20879 enumC20879 = AbstractC20174.c;
            return interfaceC15235.c(AbstractC1726.P(interfaceC15235.l(enumC20879), j), enumC20879);
        }
        if (i == 2) {
            return interfaceC15235.d(j / 4, EnumC22996.YEARS).d((j % 4) * 3, EnumC22996.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // l.InterfaceC18056
    public final long l(InterfaceC15235 interfaceC15235, InterfaceC15235 interfaceC15236) {
        if (interfaceC15235.getClass() != interfaceC15236.getClass()) {
            return interfaceC15235.g(interfaceC15236, this);
        }
        int i = AbstractC8179.a[ordinal()];
        if (i == 1) {
            EnumC20879 enumC20879 = AbstractC20174.c;
            return AbstractC1726.R(interfaceC15236.G(enumC20879), interfaceC15235.G(enumC20879));
        }
        if (i == 2) {
            return interfaceC15235.g(interfaceC15236, EnumC22996.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
