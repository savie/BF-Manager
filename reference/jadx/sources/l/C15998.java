package l;

/* JADX INFO: renamed from: l.ܶۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15998 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 f51931;

    public C15998(C17007 c17007) {
        this.f51931 = c17007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38127(AbstractC22295 abstractC22295) {
        C17007 c17007 = this.f51931;
        C23393 c23393M40091 = c17007.m40091();
        long lineNumber = c17007.getLineNumber();
        long jM52574 = c23393M40091.m52574(abstractC22295.f26658);
        long jM52572 = c23393M40091.m52572(abstractC22295.f26658, false);
        if (jM52574 == lineNumber) {
            return String.valueOf(jM52572);
        }
        return jM52574 + ":" + jM52572;
    }
}
