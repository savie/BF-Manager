package l;

/* JADX INFO: renamed from: l.ܳۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14327 extends C1706 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f46942;

    @Override // l.C1706, l.InterfaceC14429
    /* JADX INFO: renamed from: ۙ */
    public final void mo5680(C2473 c2473, AbstractC19367 abstractC19367) {
        if (abstractC19367 instanceof C16128) {
            int i = this.f46942 + 1;
            this.f46942 = i;
            if (i > 100000) {
                throw new C3036();
            }
        }
        super.mo5680(c2473, abstractC19367);
    }
}
