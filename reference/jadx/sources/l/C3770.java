package l;

/* JADX INFO: renamed from: l.ۗ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3770 extends C24654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24654 f12907;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2346 f12908;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public C3770(C24654 c24654, C2346 c2346) {
        super(new C6754(C2346.m7915(), c2346, c24654.f79807, 0), 0);
        this.f12907 = c24654;
        this.f12908 = c2346;
    }

    @Override // l.C24654, l.InterfaceC6821
    /* JADX INFO: renamed from: ۙ */
    public final C2346 mo4358(Integer num) {
        C2346 c2346Mo4358;
        C2346 c2346 = this.f12908;
        if (c2346.m7918(num) && (c2346Mo4358 = this.f12907.mo4358(num)) != null) {
            return c2346Mo4358.m7923(c2346);
        }
        return null;
    }

    @Override // l.C24654
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12238(C2346 c2346) {
        C2346 c2347 = this.f12908;
        C12128.m30310(c2347.m7919(c2346), "Cannot add range %s to subRangeSet(%s)", c2346, c2347);
        this.f12907.mo12238(c2346);
    }

    @Override // l.C24654
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo12240(Integer num) {
        return this.f12908.m7918(num) && this.f12907.mo12240(num);
    }

    @Override // l.C24654
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6821 mo12239(C2346 c2346) {
        C2346 c2347 = this.f12908;
        if (c2346.m7919(c2347)) {
            return this;
        }
        if (c2346.m7921(c2347)) {
            return new C3770(this, c2347.m7923(c2346));
        }
        return C1182.m4355();
    }
}
