package l;

/* JADX INFO: renamed from: l.֡ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0450 extends AbstractC10766 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f2066;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19524 f2067;

    public final String toString() {
        return "MethodReferenceCheck";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0450(C20145 c20145, C19524 c19524) {
        super(c20145);
        this.f2066 = c20145;
        this.f2067 = c19524;
    }

    @Override // l.AbstractC10766
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2276(InterfaceC12260 interfaceC12260, boolean z, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C12926 c12926, C10391 c10391) {
        new C2504(this.f2066, abstractC165710, new C20207(this, !c12926.f42957.m29178(), c12926, c10391, z)).mo4137(interfaceC12260, abstractC16579);
    }

    @Override // l.AbstractC10766, l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7506 mo2275(C21825 c21825) {
        return new C13089(this.f2066, c21825);
    }
}
