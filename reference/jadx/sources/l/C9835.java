package l;

/* JADX INFO: renamed from: l.ۢۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27L2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9835 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8344 f31653;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 f31654;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f31655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC8344[] f31656;

    public C9835(C24705 c24705, InterfaceC8344 interfaceC8344, InterfaceC8344[] interfaceC8344Arr) {
        this.f31653 = interfaceC8344;
        this.f31655 = interfaceC8344.mo2971(c24705);
        this.f31656 = interfaceC8344Arr;
        this.f31654 = (C14769) C23654.of((Object[]) interfaceC8344Arr).map(new C16164(2, c24705)).collect(C14769.m35544());
    }

    public final int hashCode() {
        return this.f31654.hashCode() + this.f31655.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9835)) {
            return false;
        }
        C9835 c9835 = (C9835) obj;
        return C17359.equals(this.f31655, c9835.f31655) && C17359.equals(this.f31654, c9835.f31654);
    }
}
