package l;

/* JADX INFO: renamed from: l.᩸ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes.dex */
public class C22969 extends C5815 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13272 f74608;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22969(C13272 c13272) {
        super(c13272.f42394);
        this.f74608 = c13272;
        this.f19994 = c13272.firstEntry();
    }

    @Override // l.C5815
    /* JADX INFO: renamed from: ᩸ */
    public final void mo16949() {
        C9630 c9630M25138 = this.f19991.m25138();
        this.f19991 = c9630M25138;
        C13272 c13272 = this.f74608;
        if (c13272.f42396 || c9630M25138 == null || Integer.compare(c9630M25138.f3592, c13272.f42397) >= 0) {
            return;
        }
        this.f19991 = null;
    }

    @Override // l.C5815
    /* JADX INFO: renamed from: ۤ */
    public final void mo16947() {
        C9630 c9630M25136 = this.f19994.m25136();
        this.f19994 = c9630M25136;
        C13272 c13272 = this.f74608;
        if (c13272.f42395 || c9630M25136 == null || Integer.compare(c9630M25136.f3592, c13272.f42398) < 0) {
            return;
        }
        this.f19994 = null;
    }
}
