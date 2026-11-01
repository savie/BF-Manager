package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7101 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23787;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23788;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f23789;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f23790;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13556 f23791;

    public C7101(C7807 c7807, AbstractC13556 abstractC13556, int i, Iterator it, boolean z) {
        this.f23789 = c7807;
        this.f23791 = abstractC13556;
        this.f23787 = i;
        this.f23790 = it;
        this.f23788 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4278(this, this.f23789.f25683, this.f23787, this.f23791.mo12235());
    }
}
