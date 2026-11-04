package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8894 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f29064;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29065;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3476 f29066;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f29067;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29068;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC3476 f29069;

    public C8894(C22737 c22737, AbstractC6460 abstractC6460, int i, Iterator it, boolean z) {
        this.f29067 = c22737;
        this.f29065 = i;
        this.f29064 = it;
        this.f29068 = z;
        this.f29066 = abstractC6460.mo18262();
        this.f29069 = abstractC6460.mo18264();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2928(this, this.f29067.f73785, this.f29065);
    }
}
