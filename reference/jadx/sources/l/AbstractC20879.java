package l;

/* JADX INFO: renamed from: l.᩵᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20879 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f66828 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f66827 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void m47712();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m47711(C9690 c9690, Object obj, char c) {
        ThreadLocal threadLocal = f66828;
        threadLocal.set(c9690);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f66827;
        threadLocal2.set(chValueOf);
        m47712();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
