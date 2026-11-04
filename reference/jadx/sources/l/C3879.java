package l;

/* JADX INFO: renamed from: l.ۘۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3879 implements InterfaceC20658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2387 f13231;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21033 f13232;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f13233;

    public C3879(C21033 c21033, C2387 c2387, long j) {
        this.f13232 = c21033;
        this.f13231 = c2387;
        this.f13233 = j;
    }

    @Override // l.InterfaceC20658
    public final void cancel() {
        C21033 c21033 = this.f13232;
        EnumC15700 enumC15700M1341 = c21033.f67214.m42061().m1341();
        C2387 c2387 = this.f13231;
        C10983 c10983 = new C10983(enumC15700M1341, this.f13233, c2387.m8120(), c2387.m8117());
        try {
            c21033.f67212.m46100(Long.valueOf(this.f13233)).m27584(c10983, c2387.m8121());
        } catch (C9469 unused) {
            C21033.f67207.mo13698(c10983, "Failed to send {}");
        }
    }
}
