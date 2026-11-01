package l;

import com.amazonaws.auth.AWS4Signer;

/* JADX INFO: renamed from: l.᩺۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22996 implements InterfaceC18056 {
    NANOS("Nanos", C21813.n(1)),
    MICROS("Micros", C21813.n(1000)),
    MILLIS("Millis", C21813.n(1000000)),
    SECONDS("Seconds", C21813.ofSeconds(1)),
    MINUTES("Minutes", C21813.ofSeconds(60)),
    HOURS("Hours", C21813.ofSeconds(3600)),
    HALF_DAYS("HalfDays", C21813.ofSeconds(43200)),
    DAYS("Days", C21813.ofSeconds(86400)),
    WEEKS("Weeks", C21813.ofSeconds(AWS4Signer.MAX_EXPIRATION_TIME_IN_SECONDS)),
    MONTHS("Months", C21813.ofSeconds(2629746)),
    YEARS("Years", C21813.ofSeconds(31556952)),
    DECADES("Decades", C21813.ofSeconds(315569520)),
    CENTURIES("Centuries", C21813.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", C21813.ofSeconds(31556952000L)),
    ERAS("Eras", C21813.ofSeconds(31556952000000000L)),
    FOREVER("Forever", C21813.s(C17492.FOREVER_NS, 999999999));

    public final String a;
    public final C21813 b;

    EnumC22996(String str, C21813 c21813) {
        this.a = str;
        this.b = c21813;
    }

    @Override // l.InterfaceC18056
    public final C21813 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC18056
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // l.InterfaceC18056
    public final InterfaceC15235 m(InterfaceC15235 interfaceC15235, long j) {
        return interfaceC15235.d(j, this);
    }

    @Override // l.InterfaceC18056
    public final long l(InterfaceC15235 interfaceC15235, InterfaceC15235 interfaceC15236) {
        return interfaceC15235.g(interfaceC15236, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
