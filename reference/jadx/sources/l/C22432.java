package l;

/* JADX INFO: renamed from: l.᩸֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class C22432 implements InterfaceC11309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f72631;

    public C22432(Runnable runnable) {
        this.f72631 = runnable;
    }

    @Override // l.InterfaceC11309
    public final void onSuccess() {
        C12569.f40362 = false;
        this.f72631.run();
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28582(Exception exc) {
        C12569.f40362 = false;
        return false;
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final void mo28581() {
        C12569.f40362 = false;
    }
}
