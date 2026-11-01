package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۛۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6015 extends C22243 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20427;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f20428;

    public C6015(C10955 c10955) {
        super(c10955);
        this.f20428 = new HashSet();
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        this.f20428.add(c2732);
        super.mo3920(c2732);
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        this.f20428.add(c22885);
        super.mo3960(c22885);
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        this.f20428.add(c14398);
        super.mo3944(c14398);
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        this.f20428.add(c16514);
        super.mo3950(c16514);
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        this.f20428.add(c0285);
        super.mo3914(c0285);
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        this.f20427 |= this.f72709 == EnumC12366.f41347 && !this.f20428.contains(c17924.f56927);
        super.mo1066(c17924);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16320() {
        return this.f20427;
    }
}
