package l;

/* JADX INFO: renamed from: l.֫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5VJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1478 extends AbstractC11833 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C1478 f6008 = new C1478(true);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C1478 f6009 = new C1478(false);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f6010;

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return i + 1;
    }

    public C1478(boolean z) {
        this.f6010 = z;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        c4651.m12841(EnumC18182.VALUE_BOOLEAN.f58128 | ((this.f6010 ? 1 : 0) << 5));
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        boolean z = ((C1478) abstractC11833).f6010;
        boolean z2 = this.f6010;
        if (z2 == z) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_BOOLEAN;
    }

    public final int hashCode() {
        return this.f6010 ? 1 : 0;
    }
}
