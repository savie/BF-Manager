package l;

import com.amazonaws.auth.AWS4Signer;

/* JADX INFO: renamed from: l.ۢܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC10183 implements InterfaceC2726 {
    NANOS("Nanos", C18257.k(1)),
    MICROS("Micros", C18257.k(1000)),
    MILLIS("Millis", C18257.k(1000000)),
    SECONDS("Seconds", C18257.ofSeconds(1)),
    MINUTES("Minutes", C18257.ofSeconds(60)),
    HOURS("Hours", C18257.ofSeconds(3600)),
    HALF_DAYS("HalfDays", C18257.ofSeconds(43200)),
    DAYS("Days", C18257.ofSeconds(86400)),
    WEEKS("Weeks", C18257.ofSeconds(AWS4Signer.MAX_EXPIRATION_TIME_IN_SECONDS)),
    MONTHS("Months", C18257.ofSeconds(2629746)),
    YEARS("Years", C18257.ofSeconds(31556952)),
    DECADES("Decades", C18257.ofSeconds(315569520)),
    CENTURIES("Centuries", C18257.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", C18257.ofSeconds(31556952000L)),
    ERAS("Eras", C18257.ofSeconds(31556952000000000L)),
    FOREVER("Forever", C18257.ofSeconds(C25227.FOREVER_NS, 999999999));

    public final String a;
    public final C18257 b;

    EnumC10183(String str, C18257 c18257) {
        this.a = str;
        this.b = c18257;
    }

    @Override // l.InterfaceC2726
    public final C18257 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC2726
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // l.InterfaceC2726
    public final InterfaceC1235 j(InterfaceC1235 interfaceC1235, long j) {
        return interfaceC1235.c(j, this);
    }

    @Override // l.InterfaceC2726
    public final long i(InterfaceC1235 interfaceC1235, InterfaceC1235 interfaceC1236) {
        return interfaceC1235.f(interfaceC1236, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
