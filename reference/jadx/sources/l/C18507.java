package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18507 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19213 f58947;

    public C18507(C19213 c19213) {
        this.f58947 = c19213;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C19213 c19213 = this.f58947;
        return C16458.m38721(AbstractC22433.of((Object) c19213.f62052.iterator(), (Object) c19213.f62050.iterator()), AbstractC10959.m27714());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C19213 c19213 = this.f58947;
        return c19213.f62050.size() + c19213.f62052.size();
    }
}
