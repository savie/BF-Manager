package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9639 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31158;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f31159;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f31160;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f31161;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6460 f31162;

    public C9639(C22737 c22737, AbstractC6460 abstractC6460, int i, Iterator it, boolean z) {
        this.f31160 = c22737;
        this.f31162 = abstractC6460;
        this.f31158 = i;
        this.f31161 = it;
        this.f31159 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC6460 abstractC6460 = this.f31162;
        return new C1437(this, this.f31160.f73785, this.f31158, abstractC6460.mo18262(), abstractC6460.mo18264());
    }
}
