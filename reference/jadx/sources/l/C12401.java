package l;

/* JADX INFO: renamed from: l.ۨܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8FE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12401 extends AbstractC22033 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public RunnableC5051 f39897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30873(RunnableC5051 runnableC5051) {
        m49809("ffmpegJNI");
        this.f39897 = runnableC5051;
    }

    @Override // l.AbstractC22033
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30872(String str) {
        if (this.f39897 == null) {
            System.loadLibrary(str);
        } else {
            C24690.m55038();
        }
    }
}
