package l;

/* JADX INFO: renamed from: l.۟ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AVK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7244 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f24138 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f24137 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void m19358();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m19357(C23473 c23473, Object obj, char c) {
        ThreadLocal threadLocal = f24138;
        threadLocal.set(c23473);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f24137;
        threadLocal2.set(chValueOf);
        m19358();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
