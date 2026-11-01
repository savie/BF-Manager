package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18390 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f58632;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 f58634;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f58635;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f58636;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 f58637;

    public C18390(C7807 c7807, AbstractC13556 abstractC13556, int i, Iterator it, boolean z) {
        this.f58632 = c7807;
        this.f58633 = i;
        this.f58635 = it;
        this.f58636 = z;
        this.f58634 = abstractC13556.mo12234();
        this.f58637 = abstractC13556.mo12232();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21918(this, this.f58632.f25683, this.f58633);
    }
}
