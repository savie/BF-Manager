package l;

/* JADX INFO: renamed from: l.᩸ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21616 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C14690 f70110 = C14690.m35218(8, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC13150 f70111;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo10751();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10752(int i, int i2, InterfaceC3976 interfaceC3976);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10753(C6094 c6094, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo30284(C23229 c23229);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48325(CharSequence charSequence) {
        C6222 c6222Matcher = f70110.matcher(charSequence);
        if (c6222Matcher.find()) {
            return c6222Matcher.group(2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36571(InterfaceC13150 interfaceC13150) {
        this.f70111 = interfaceC13150;
    }
}
