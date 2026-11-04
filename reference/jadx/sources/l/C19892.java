package l;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19892 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15416 f63998;

    public C19892(C15416 c15416) {
        this.f63998 = c15416;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f63998.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f63998.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C15416 c15416 = this.f63998;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.values().iterator();
        }
        return new C14056(c15416);
    }
}
