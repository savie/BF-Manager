package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0512 implements InterfaceC10772 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24550 f2197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7970 f2198;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7970 f2199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f2200;

    public C0512(C11172 c11172, C24550 c24550, C7970 c7970, C7970 c7971) {
        this.f2200 = c11172;
        this.f2197 = c24550;
        this.f2198 = c7970;
        this.f2199 = c7971;
    }

    @Override // l.InterfaceC10772
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2477(C24550 c24550) {
        C11172 c11172 = this.f2200;
        C24550 c24551 = this.f2197;
        C11972.m30026(c24551 == c24550);
        try {
            C7970 c7970 = this.f2198;
            C23892 c23892M18311 = c7970 != null ? new C6479(c11172, c24551).m18311(c7970) : null;
            C7970 c7971 = this.f2199;
            C23892 c23892M18312 = c7971 != null ? new C6479(c11172, c24551).m18311(c7971) : null;
            c24550.mo51845().m45422(c23892M18311);
            c24550.mo51845().m45418(c23892M18312);
        } catch (Exception e) {
            throw new C21566(c24550, new Supplier() { // from class: l.ܿܶۘ
                @Override // java.util.function.Supplier
                public final Object get() {
                    C19991 c19991 = this.f59975.f2200.f35202;
                    String message = e.getMessage();
                    C15515 c15515 = C19859.f63823;
                    return c19991.m45975(new C15515("compiler", "exception.message", message));
                }
            }, c11172.f35216);
        }
    }
}
