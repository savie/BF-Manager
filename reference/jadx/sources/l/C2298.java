package l;

/* JADX INFO: renamed from: l.ۖۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2298 extends AbstractC18527 {
    public static final C5980 c;
    public static final C5980 d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C11521.of(this.b);
        }
        return null;
    }

    static {
        EnumC22761 enumC22761 = EnumC22761.REFERENCE;
        c = new C5980(true, enumC22761, C11521.empty(), new C13858(18), new C17821(13));
        d = new C5980(false, enumC22761, C11521.empty(), new C13858(18), new C17821(13));
    }
}
