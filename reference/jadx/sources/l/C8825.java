package l;

/* JADX INFO: renamed from: l.۠ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C8825 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19881 f28836;

    public final String toString() {
        return "mainCompleter";
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    public C8825(C19881 c19881) {
        this.f28836 = c19881;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C19881 c19881 = this.f28836;
        C2920 c2920 = (C2920) abstractC11781;
        c19881.f63976.m55958(c2920);
        if (c2920.f38066 == EnumC13603.f43208) {
            c2920.f9543 = C14769.m35543();
            c2920.f9546 = C14769.m35543();
            c2920.f9557 = C14769.m35543();
            c2920.f9551 = C14769.m35543();
            c2920.f9560 = C14769.m35543();
        } else if ((c2920.f38071 & 4503599627370496L) != 0) {
            C19881.m45772(c19881, c2920);
        } else {
            try {
                c2920.f9544.mo29590();
            } catch (C21566 e) {
                c2920.f38066 = EnumC13603.f43208;
                c2920.f9543 = C14769.m35543();
                c2920.f9546 = C14769.m35543();
                c2920.f9557 = C14769.m35543();
                c2920.f9551 = C14769.m35543();
                c2920.f9560 = C14769.m35543();
                c19881.m45757(c2920);
                throw e;
            }
        }
        InterfaceC15976 interfaceC15976 = c2920.f9544.f79575;
        if (interfaceC15976 == null || interfaceC15976.mo10885() == EnumC17468.CLASS) {
            c19881.m45757(c2920);
        }
    }
}
