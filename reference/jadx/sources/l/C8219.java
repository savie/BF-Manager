package l;

/* JADX INFO: renamed from: l.۟᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8219 implements InterfaceC24457, InterfaceC18696 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19406 f27057;

    public C8219(C19406 c19406) {
        this.f27057 = c19406;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C19406 c19406 = this.f27057;
        c19406.f62731.m6378(j);
        c19406.f62720.mo12113(c19406.f62731);
        c19406.f62720.mo12115(j4);
        c19406.f62720.setProgress(c19406.f62731.m6380());
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C19406 c19406 = this.f27057;
        return c19406.f62720.mo924() || c19406.f62722.get() != null;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f27057.f62726;
    }

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final void mo3465() {
        C19406 c19406 = this.f27057;
        String str = (String) c19406.f62724.get();
        if (str != null) {
            c19406.f62720.setName(str);
        }
    }

    @Override // l.InterfaceC18696
    public final void cancel() {
        this.f27057.f62720.mo12112();
    }
}
