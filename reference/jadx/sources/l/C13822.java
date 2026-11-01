package l;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13822 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11705 f45632;

    public C13822(C11705 c11705) {
        this.f45632 = c11705;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f45632.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f45632.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C11705 c11705 = this.f45632;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.values().iterator();
        }
        return new C14652(c11705);
    }
}
