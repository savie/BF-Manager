package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14835 extends AbstractC19338 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2133 f48480;

    public C14835(C2133 c2133) {
        this.f48480 = c2133;
    }

    @Override // l.AbstractC19338, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C2133 c2133 = this.f48480;
        return AbstractC15939.m37894(c2133.f7802).m37895(c2133.f7801 + 1).m37896(C9896.f33824).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48480.f7801 + 1;
    }
}
