package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7924 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19213 f26023;

    public C7924(C19213 c19213) {
        this.f26023 = c19213;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C19213 c19213 = this.f26023;
        return C16458.m38721(AbstractC22433.of(c19213.f62046.iterator(), c19213.f62042.iterator()), AbstractC10959.m27714());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C19213 c19213 = this.f26023;
        return c19213.f62042.size() + c19213.f62046.size();
    }
}
