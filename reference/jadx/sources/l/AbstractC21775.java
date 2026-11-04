package l;

/* JADX INFO: renamed from: l.᩷ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21775 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18415 f69426 = C18415.m42924(8, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2974 f69427;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo14424();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14425(int i, int i2, InterfaceC8940 interfaceC8940);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14427(C11555 c11555);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14428(C20283 c20283, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49367(CharSequence charSequence) {
        C4245 c4245Matcher = f69426.matcher(charSequence);
        if (c4245Matcher.find()) {
            return c4245Matcher.group(2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14426(InterfaceC2974 interfaceC2974) {
        this.f69427 = interfaceC2974;
    }
}
