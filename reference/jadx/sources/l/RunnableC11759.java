package l;

/* JADX INFO: renamed from: l.ۨܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11759 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14852 f39484;

    public RunnableC11759(C14852 c14852, C0219 c0219) {
        this.f39484 = c14852;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final EnumC24024 enumC24024M49542 = EnumC24024.COMMAND_FAILED;
        try {
            enumC24024M49542 = C22342.m49542();
        } catch (Throwable unused) {
        }
        C16737.m39273(new Runnable() { // from class: l.ܰܳۚ
            @Override // java.lang.Runnable
            public final void run() {
                C22342.m49545(this.f45728.f39484, enumC24024M49542);
            }
        });
    }
}
