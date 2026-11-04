package l;

/* JADX INFO: renamed from: l.᩸ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22515 extends AbstractC23261 {
    public static final C10205 c;
    public static final C10205 d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C15867.of(this.b);
        }
        return null;
    }

    static {
        EnumC14154 enumC14154 = EnumC14154.REFERENCE;
        c = new C10205(true, enumC14154, C15867.empty(), new C22272(18), new C8189(13));
        d = new C10205(false, enumC14154, C15867.empty(), new C22272(18), new C8189(13));
    }
}
