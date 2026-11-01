package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2638 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5461 f10284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10286;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10283 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f10285 = 0;

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C2638(C22395 c22395) {
        this.f10286 = c22395.m49667();
        this.f10284 = new C5461(c22395.f73102, c22395.m49665());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10283 < this.f10286;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10285;
        C5461 c5461 = this.f10284;
        c5461.f18828 = i;
        this.f10285 = i + c5461.f18827;
        this.f10283++;
        return c5461;
    }
}
