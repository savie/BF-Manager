package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21247 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17719 f69205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f69206;

    public C21247(C17719 c17719, Iterator it) {
        this.f69205 = c17719;
        this.f69206 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69206.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C15604.m37269(this.f69205.f56255, this.f69206.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f69206.remove();
    }
}
