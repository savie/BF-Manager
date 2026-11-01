package l;

/* JADX INFO: renamed from: l.᩻ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes.dex */
public class C23498 implements InterfaceC20592 {
    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class clsM29316 = c11730.m29316();
        if (!Enum.class.isAssignableFrom(clsM29316) || clsM29316 == Enum.class) {
            return null;
        }
        if (!clsM29316.isEnum()) {
            clsM29316 = clsM29316.getSuperclass();
        }
        return new C14326(clsM29316);
    }
}
