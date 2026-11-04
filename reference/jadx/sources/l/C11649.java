package l;

/* JADX INFO: renamed from: l.ۧ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11649 extends C8781 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12863 f37684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11649(C12863 c12863, C15714 c15714) {
        super(c15714);
        this.f37684 = c12863;
    }

    @Override // l.C8781, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5867(C12598 c12598, Object obj) {
        Void r9 = (Void) obj;
        C1955 c1955 = new C1955(c12598.f40435, c12598.f40431, (AbstractC22295) mo23491(c12598.f40436, r9), m23492(r9, c12598.f40437), c12598);
        c1955.f26658 = c12598.f26658;
        return c1955;
    }

    @Override // l.C8781, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8036 mo5867(C12598 c12598, Object obj) {
        Void r9 = (Void) obj;
        C1955 c1955 = new C1955(c12598.f40435, c12598.f40431, (AbstractC22295) mo23491(c12598.f40436, r9), m23492(r9, c12598.f40437), c12598);
        c1955.f26658 = c12598.f26658;
        return c1955;
    }

    @Override // l.C8781, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C18565 mo5881(C18565 c18565, Void r10) {
        if (C11239.m28349(c18565)) {
            AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c18565.f60321, r10);
            C14769 c14769M23492 = m23492(r10, c18565.f60320);
            AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c18565.f60323, r10);
            C14769 c14769M23493 = m23492(r10, c18565.f60325);
            C15714 c15714 = this.f37684.f41181;
            c15714.f51040 = c18565.f26658;
            return c15714.m37539(abstractC22295, c14769M23492, abstractC22296, c14769M23493, (C7926) null, c18565.f60319 != null || c18565.m43140());
        }
        return super.mo5881(c18565, (Object) r10);
    }
}
