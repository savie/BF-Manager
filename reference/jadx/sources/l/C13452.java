package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13452 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f44500;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44501;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f44502;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44503;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13556 f44504;

    public C13452(C7807 c7807, AbstractC13556 abstractC13556, int i, Iterator it, boolean z) {
        this.f44502 = c7807;
        this.f44504 = abstractC13556;
        this.f44501 = i;
        this.f44500 = it;
        this.f44503 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC9510 interfaceC9510Mo12235 = this.f44504.mo12235();
        C7807 c7807 = this.f44502;
        return new C1456(this, c7807.f25683, c7807.f25689, AbstractC14967.m35949(c7807.f25683, this.f44501), interfaceC9510Mo12235);
    }
}
