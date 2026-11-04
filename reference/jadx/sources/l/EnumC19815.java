package l;

/* JADX INFO: renamed from: l.ᩴ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19815 implements InterfaceC2726 {
    WEEK_BASED_YEARS("WeekBasedYears", C18257.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", C18257.ofSeconds(7889238));

    public final String a;
    public final C18257 b;

    @Override // l.InterfaceC2726
    public final boolean isDurationEstimated() {
        return true;
    }

    EnumC19815(String str, C18257 c18257) {
        this.a = str;
        this.b = c18257;
    }

    @Override // l.InterfaceC2726
    public final C18257 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC2726
    public final InterfaceC1235 j(InterfaceC1235 interfaceC1235, long j) {
        int i = AbstractC7201.a[ordinal()];
        if (i == 1) {
            EnumC22799 enumC22799 = AbstractC15339.c;
            return interfaceC1235.b(AbstractC1758.P(interfaceC1235.i(enumC22799), j), enumC22799);
        }
        if (i == 2) {
            return interfaceC1235.c(j / 4, EnumC10183.YEARS).c((j % 4) * 3, EnumC10183.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // l.InterfaceC2726
    public final long i(InterfaceC1235 interfaceC1235, InterfaceC1235 interfaceC1236) {
        if (interfaceC1235.getClass() != interfaceC1236.getClass()) {
            return interfaceC1235.f(interfaceC1236, this);
        }
        int i = AbstractC7201.a[ordinal()];
        if (i == 1) {
            EnumC22799 enumC22799 = AbstractC15339.c;
            return AbstractC1758.R(interfaceC1236.C(enumC22799), interfaceC1235.C(enumC22799));
        }
        if (i == 2) {
            return interfaceC1235.f(interfaceC1236, EnumC10183.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
