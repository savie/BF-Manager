package l;

/* JADX INFO: renamed from: l.ܺۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15894 extends C8838 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f51481;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10955 f51482;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21825 f51483;

    @Override // l.C8838, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15894(C10955 c10955) {
        super(c10955);
        this.f51482 = c10955;
    }

    @Override // l.C8838, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        AbstractC16579 abstractC16579 = c22489.f30190;
        if ((abstractC16579 == null || !abstractC16579.mo1926()) && !this.f51481) {
            C21825 c21825 = this.f30372;
            C21825 c21826 = this.f30373;
            C19003 c19003 = this.f60692;
            this.f51481 = true;
            try {
                this.f60692 = new C19003();
                this.f30372 = C21825.of((Object) this.f51482.f37253.f14302);
                this.f30373 = C21825.m48588();
                mo7248(c22489.f73408);
                this.f51483 = this.f30373;
            } finally {
                this.f60692 = c19003;
                this.f30372 = c21825;
                this.f30373 = c21826;
                this.f51481 = false;
            }
        }
    }
}
