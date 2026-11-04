package l;

/* JADX INFO: renamed from: l.ۧܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11755 extends AbstractC5790 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC25138 f38003;

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Object obj;
        FutureC23690 futureC23690;
        InterfaceC25138 interfaceC25138;
        FutureC23690 futureC23691 = this.f19885;
        if (futureC23691 != null && (obj = futureC23691.f76816) != null && (futureC23690 = this.f19886) != null && (interfaceC25138 = this.f38003) != null) {
            if (futureC23690.m52941(obj, interfaceC25138, i > 0 ? null : this)) {
                this.f19885 = null;
                this.f19886 = null;
                this.f38003 = null;
                return futureC23690.m52934(futureC23691, i);
            }
        }
        return null;
    }
}
