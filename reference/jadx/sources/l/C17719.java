package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17719 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f56254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2196 f56255;

    public C17719(Iterable iterable, InterfaceC2196 interfaceC2196) {
        this.f56254 = iterable;
        this.f56255 = interfaceC2196;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21247(this, this.f56254.iterator());
    }
}
