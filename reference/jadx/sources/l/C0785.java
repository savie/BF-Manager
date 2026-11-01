package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C0785 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22659 f3364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f3365;

    public C0785(C22659 c22659, Iterator it) {
        this.f3364 = c22659;
        this.f3365 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3365.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C15604.m37269(this.f3364.f73809, this.f3365.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3365.remove();
    }
}
