package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15247 implements InterfaceC7696 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f49713;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22492 f49714;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21596 f49715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21596 f49716;

    public C15247(C0429 c0429, C22492 c22492, C21596 c21596, C21596 c21597) {
        this.f49713 = c0429;
        this.f49714 = c22492;
        this.f49715 = c21596;
        this.f49716 = c21597;
    }

    @Override // l.InterfaceC7696
    /* JADX INFO: renamed from: ۙ */
    public final void mo20330(C22492 c22492) {
        C0429 c0429 = this.f49713;
        C22492 c22493 = this.f49714;
        C6171.m17176(c22493 == c22492);
        try {
            C21596 c21596 = this.f49715;
            C11867 c11867M49464 = c21596 != null ? new C22302(c0429, c22493).m49464(c21596) : null;
            C21596 c21597 = this.f49716;
            C11867 c11867M49465 = c21597 != null ? new C22302(c0429, c22493).m49464(c21597) : null;
            c22492.mo2884().m38258(c11867M49464);
            c22492.mo2884().m38254(c11867M49465);
        } catch (Exception e) {
            throw new C4146(c22492, new Supplier() { // from class: l.᩺۬۟
                @Override // java.util.function.Supplier
                public final Object get() {
                    C23549 c23549 = this.f74771.f49713.f1980;
                    String message = e.getMessage();
                    C14377 c14377 = C14707.f48054;
                    return c23549.m51910(new C14377("compiler", "exception.message", message));
                }
            }, c0429.f1992);
        }
    }
}
