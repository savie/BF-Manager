package l;

/* JADX INFO: renamed from: l.ۤ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10537 extends AbstractC5428 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2596 f33513;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f33514;

    public final String toString() {
        return "MethodReferenceCheck";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10537(C22010 c22010, C2596 c2596) {
        super(c22010);
        this.f33514 = c22010;
        this.f33513 = c2596;
    }

    @Override // l.AbstractC5428
    /* JADX INFO: renamed from: ۙ */
    public final void mo16159(InterfaceC5075 interfaceC5075, boolean z, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C4192 c4192, C1083 c1083) {
        new C12029(this.f33514, abstractC22665, new C21726(this, !c4192.f15333.m46506(), c4192, c1083, z)).mo30220(interfaceC5075, abstractC22664);
    }

    @Override // l.AbstractC5428, l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6919 mo16156(C14769 c14769) {
        return new C14266(this.f33514, c14769);
    }
}
