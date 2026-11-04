package l;

/* JADX INFO: renamed from: l.ۚܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5704 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16672 f19698;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f19699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f19700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9431 f19701;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24132 f19702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17088 f19703;

    public C5704(C7941 c7941, C24132 c24132, InterfaceC19106 interfaceC19106, C16672 c16672, C9431 c9431, C17088 c17088) {
        this.f19699 = c7941;
        this.f19702 = c24132;
        this.f19700 = interfaceC19106;
        this.f19698 = c16672;
        this.f19701 = c9431;
        this.f19703 = c17088;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m16743() {
        C7941 c7941 = this.f19699;
        if (c7941.f26384 != null || !c7941.f26388) {
            return false;
        }
        C24132 c24132 = c7941.f26387;
        C24132 c24133 = this.f19702;
        return c24132 == c24133 && c24133.m54021() == this.f19700 && this.f19701.f30601.mo4294().equals(c7941.m19934().f30601.mo4294());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16742() {
        if (m16743()) {
            C17088 c17088 = this.f19703;
            C7941 c7941 = this.f19699;
            boolean zM40251 = c17088.m40251(c7941.f26391);
            C24132 c24132 = this.f19702;
            boolean z = zM40251 && c24132.m53942(this.f19698);
            if (m16743()) {
                c7941.m19932(c7941.m21640(c24132.m53890()));
                c7941.f23993.m29412(c7941.m19933() || c7941.f26404);
                c7941.m21515();
            }
            if (z && m16743()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19703.close();
    }
}
