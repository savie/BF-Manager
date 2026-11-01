package l;

/* JADX INFO: renamed from: l.ܳܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FAXN */
/* JADX INFO: loaded from: classes4.dex */
public class C14626 extends C6158 {
    @Override // l.C6158
    /* JADX INFO: renamed from: ۙ */
    public final void mo17161(Throwable th, Throwable th2) {
        C13465.m32966(th, "cause");
        C13465.m32966(th2, "exception");
        Integer num = C23798.f76931;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo17161(th, th2);
        }
    }
}
