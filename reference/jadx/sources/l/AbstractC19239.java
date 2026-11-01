package l;

/* JADX INFO: renamed from: l.᩵ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19239 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f62176 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f62175 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void m44193();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m44192(C23473 c23473, Object obj, char c) {
        ThreadLocal threadLocal = f62176;
        threadLocal.set(c23473);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f62175;
        threadLocal2.set(chValueOf);
        m44193();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
