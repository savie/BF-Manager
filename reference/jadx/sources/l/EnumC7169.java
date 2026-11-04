package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 l.ۜ۬ܽ, still in use, count: 1, list:
  (r0v0 l.ۜ۬ܽ) from 0x002f: FILLED_NEW_ARRAY (r1v1 l.ۜ۬ܽ), (r0v0 l.ۜ۬ܽ), (r5v1 l.ۜ۬ܽ), (r4v1 l.ۜ۬ܽ) A[WRAPPED] elemType: l.ۜ۬ܽ
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۜ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z23J */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7169 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC7169[] f23689;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f23692;

    public static EnumC7169 valueOf(String str) {
        return (EnumC7169) Enum.valueOf(EnumC7169.class, str);
    }

    public static EnumC7169[] values() {
        return (EnumC7169[]) f23691.clone();
    }

    static {
        f23689 = new EnumC7169[]{enumC7169, new EnumC7169(1), enumC7169, new EnumC7169(3)};
    }

    public EnumC7169(int i) {
        super(str, i);
        this.f23692 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m19741() {
        return this.f23692;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7169 m19739(int i) {
        if (i >= 0) {
            EnumC7169[] enumC7169Arr = f23689;
            if (i < enumC7169Arr.length) {
                return enumC7169Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
