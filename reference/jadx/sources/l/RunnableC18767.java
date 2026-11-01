package l;

/* JADX INFO: renamed from: l.ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18767 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12418 f60844;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8184 f60845;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19473 f60846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23707 f60847;

    public RunnableC18767(C8184 c8184, C19473 c19473, C23707 c23707, C12418 c12418) {
        this.f60845 = c8184;
        this.f60846 = c19473;
        this.f60847 = c23707;
        this.f60844 = c12418;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC8890 viewOnKeyListenerC8890 = this.f60845.f28531;
        C19473 c19473 = this.f60846;
        if (c19473 != null) {
            viewOnKeyListenerC8890.f30474 = true;
            c19473.f62690.close(false);
            viewOnKeyListenerC8890.f30474 = false;
        }
        C23707 c23707 = this.f60847;
        if (c23707.isEnabled() && c23707.hasSubMenu()) {
            this.f60844.performItemAction(c23707, 4);
        }
    }
}
