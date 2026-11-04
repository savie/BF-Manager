package l;

/* JADX INFO: renamed from: l.᩺᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AVK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24609 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f79716 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f79715 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void m54940();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m54939(C9690 c9690, Object obj, char c) {
        ThreadLocal threadLocal = f79716;
        threadLocal.set(c9690);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f79715;
        threadLocal2.set(chValueOf);
        m54940();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
