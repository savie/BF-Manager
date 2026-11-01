package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15569 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f50628;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50629;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f50630;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50631;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13556 f50632;

    public C15569(C7807 c7807, AbstractC13556 abstractC13556, int i, Iterator it, boolean z) {
        this.f50630 = c7807;
        this.f50632 = abstractC13556;
        this.f50631 = i;
        this.f50628 = it;
        this.f50629 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC13556 abstractC13556 = this.f50632;
        return new C23330(this, this.f50630.f25683, this.f50631, abstractC13556.mo12234(), abstractC13556.mo12232());
    }
}
