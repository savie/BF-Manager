package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10578 extends AbstractC19529 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f33597 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15053 f33598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21767 f33599;

    public C10578(C15053 c15053) {
        this.f33598 = c15053;
    }

    @Override // l.AbstractC19529
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27034(C21767 c21767) {
        C21767 c21768 = this.f33599;
        if (c21767 == c21768) {
            C21767 c21769 = c21768.f69414;
            this.f33599 = c21769;
            this.f33597 = c21769 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f33597) {
            return this.f33598.f49122 != null;
        }
        C21767 c21767 = this.f33599;
        return (c21767 == null || c21767.f69415 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f33597) {
            this.f33597 = false;
            this.f33599 = this.f33598.f49122;
        } else {
            C21767 c21767 = this.f33599;
            this.f33599 = c21767 != null ? c21767.f69415 : null;
        }
        return this.f33599;
    }
}
