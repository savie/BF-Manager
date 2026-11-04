package l;

/* JADX INFO: renamed from: l.᩵ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20262 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C20262 f65066 = new C20262(true);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20262 f65067 = new C20262(false);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f65068;

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return i + 1;
    }

    public C20262(boolean z) {
        this.f65068 = z;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        c24166.m54138(EnumC6837.VALUE_BOOLEAN.f22727 | ((this.f65068 ? 1 : 0) << 5));
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        boolean z = ((C20262) abstractC14294).f65068;
        boolean z2 = this.f65068;
        if (z2 == z) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_BOOLEAN;
    }

    public final int hashCode() {
        return this.f65068 ? 1 : 0;
    }
}
