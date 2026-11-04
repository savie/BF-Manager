package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8149 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f26900;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26901;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f26902;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f26903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6460 f26904;

    public C8149(C22737 c22737, AbstractC6460 abstractC6460, int i, Iterator it, boolean z) {
        this.f26902 = c22737;
        this.f26904 = abstractC6460;
        this.f26901 = i;
        this.f26903 = it;
        this.f26900 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC3476 interfaceC3476Mo18263 = this.f26904.mo18263();
        C22737 c22737 = this.f26902;
        return new C0691(this, c22737.f73785, c22737.f73778, AbstractC1239.m4473(c22737.f73785, this.f26901), interfaceC3476Mo18263);
    }
}
