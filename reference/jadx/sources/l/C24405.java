package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5XG */
/* JADX INFO: loaded from: classes.dex */
public final class C24405 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f79197;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4267 f79198;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79199;

    public C24405(C4267 c4267) {
        this.f79198 = c4267;
        long j = c4267.f48050;
        this.f79197 = j == 0 ? 0 : (int) (c4267.f48052 / j);
        this.f79199 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f79199 < this.f79197;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f79199;
        this.f79199 = i + 1;
        C4267 c4267 = this.f79198;
        return new C6505(c4267.f48049, c4267, (int) ((((long) i) * c4267.f48050) + c4267.f48048));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
