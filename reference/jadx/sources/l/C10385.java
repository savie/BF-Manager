package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10385 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f33019;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f33020;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f33021;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33022;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6460 f33023;

    public C10385(C22737 c22737, AbstractC6460 abstractC6460, int i, Iterator it, boolean z) {
        this.f33021 = c22737;
        this.f33023 = abstractC6460;
        this.f33022 = i;
        this.f33019 = it;
        this.f33020 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19336(this, this.f33021.f73785, this.f33022, this.f33023.mo18263());
    }
}
