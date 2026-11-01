package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 l.᩵۟᩸, still in use, count: 1, list:
  (r0v0 l.᩵۟᩸) from 0x002f: FILLED_NEW_ARRAY (r1v1 l.᩵۟᩸), (r0v0 l.᩵۟᩸), (r5v1 l.᩵۟᩸), (r4v1 l.᩵۟᩸) A[WRAPPED] elemType: l.᩵۟᩸
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩵۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z23J */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC19326 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC19326[] f62333;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f62339;

    public static EnumC19326 valueOf(String str) {
        return (EnumC19326) Enum.valueOf(EnumC19326.class, str);
    }

    public static EnumC19326[] values() {
        return (EnumC19326[]) f62338.clone();
    }

    static {
        f62333 = new EnumC19326[]{enumC19326, new EnumC19326(1), enumC19326, new EnumC19326(3)};
    }

    public EnumC19326(int i) {
        super(str, i);
        this.f62339 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m44308() {
        return this.f62339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19326 m44306(int i) {
        if (i >= 0) {
            EnumC19326[] enumC19326Arr = f62333;
            if (i < enumC19326Arr.length) {
                return enumC19326Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
