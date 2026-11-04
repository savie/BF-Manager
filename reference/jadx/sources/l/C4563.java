package l;

/* JADX INFO: renamed from: l.ۙ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAXN */
/* JADX INFO: loaded from: classes3.dex */
public class C4563 extends C8553 {
    @Override // l.C8553
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14339(Throwable th, Throwable th2) {
        C15243.m36590(th, "cause");
        C15243.m36590(th2, "exception");
        Integer num = C13773.f43716;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo14339(th, th2);
        }
    }
}
