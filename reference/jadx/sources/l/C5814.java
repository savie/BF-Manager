package l;

/* JADX INFO: renamed from: l.ۛۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public class C5814 extends C1580 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14282 f19742;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5814(C14282 c14282) {
        super(c14282.f46804);
        this.f19742 = c14282;
        this.f6331 = c14282.firstEntry();
    }

    @Override // l.C1580
    /* JADX INFO: renamed from: ۖ */
    public final void mo5384() {
        C7225 c7225M19237 = this.f6334.m19237();
        this.f6334 = c7225M19237;
        C14282 c14282 = this.f19742;
        if (c14282.f46805 || c7225M19237 == null || Integer.compare(c7225M19237.f29881, c14282.f46801) >= 0) {
            return;
        }
        this.f6334 = null;
    }

    @Override // l.C1580
    /* JADX INFO: renamed from: ۨ */
    public final void mo5386() {
        C7225 c7225M19238 = this.f6331.m19238();
        this.f6331 = c7225M19238;
        C14282 c14282 = this.f19742;
        if (c14282.f46802 || c7225M19238 == null || Integer.compare(c7225M19238.f29881, c14282.f46807) < 0) {
            return;
        }
        this.f6331 = null;
    }
}
