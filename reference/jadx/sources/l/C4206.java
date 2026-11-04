package l;

/* JADX INFO: renamed from: l.ۘܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4206 extends C1969 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f15359;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f15360;

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo13415() throws C2079 {
        C15723 c15723M22542 = m22542();
        try {
            if (this.f6611) {
                new C14977().mo15880(c15723M22542, this);
            }
            new C1554().m5485(c15723M22542, this, this.f15360, this.f15359);
            if (this.f27476.f29002 != null) {
                ThreadFactoryC11248 threadFactoryC11248M37621 = c15723M22542.m37621();
                Runnable runnable = new Runnable() { // from class: l.᩺ܰܶ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78955.mo6777();
                    }
                };
                threadFactoryC11248M37621.getClass();
                Thread thread = new Thread(runnable);
                this.f27481 = thread;
                thread.setName("Subsystem for " + c15723M22542.f51092);
                this.f27481.start();
            }
        } catch (Exception e) {
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            throw new C2079("ChannelSubsystem", e);
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo13414() {
        C8878 c8878 = this.f27476;
        m22542();
        c8878.f29002 = null;
        C8878 c8879 = this.f27476;
        m22542();
        c8879.f29003 = null;
    }
}
