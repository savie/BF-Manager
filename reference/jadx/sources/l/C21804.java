package l;

/* JADX INFO: renamed from: l.᩷ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAQI */
/* JADX INFO: loaded from: classes.dex */
public final class C21804 extends Exception {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f69535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f69536;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public C21804(int i, String str) {
        super(C21576.m49088(i));
        this.f69536 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49454() {
        this.f69534 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49452() {
        this.f69535 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49450() {
        return this.f69536;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49453() {
        return this.f69534;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m49451() {
        return this.f69535;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage() + "\n" + this.f69536;
    }
}
