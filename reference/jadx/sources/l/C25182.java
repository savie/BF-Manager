package l;

/* JADX INFO: renamed from: l.᩻ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C25182 extends AbstractC5790 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC11711 f81394;

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Object obj;
        FutureC23690 futureC23690;
        InterfaceC11711 interfaceC11711;
        FutureC23690 futureC23691 = this.f19885;
        if (futureC23691 != null && (obj = futureC23691.f76816) != null && (futureC23690 = this.f19886) != null && (interfaceC11711 = this.f81394) != null) {
            if (futureC23690.m52940(obj, interfaceC11711, i > 0 ? null : this)) {
                this.f19885 = null;
                this.f19886 = null;
                this.f81394 = null;
                return futureC23690.m52934(futureC23691, i);
            }
        }
        return null;
    }
}
