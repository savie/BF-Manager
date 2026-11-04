package l;

/* JADX INFO: renamed from: l.֨ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BG9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0897 extends AbstractC5875 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17061 f3329;

    public C0897(C17061 c17061) {
        super("InnerClasses");
        try {
            if (c17061.m46489()) {
                throw new C12017("innerClasses.isMutable()", null);
            }
            this.f3329 = c17061;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return (this.f3329.size() * 8) + 8;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17061 m3633() {
        return this.f3329;
    }
}
