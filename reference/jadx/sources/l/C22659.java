package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes.dex */
public final class C22659 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2196 f73809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f73810;

    public C22659(Set set, InterfaceC2196 interfaceC2196) {
        this.f73810 = set;
        this.f73809 = interfaceC2196;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0785(this, this.f73810.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73810.size();
    }
}
