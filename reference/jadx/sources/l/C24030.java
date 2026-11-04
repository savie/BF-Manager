package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes.dex */
public final class C24030 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f77746 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18808 f77747;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f77748;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6130(this, this);
    }

    public C24030(C18808 c18808, Iterator it) {
        this.f77747 = c18808;
        this.f77748 = it;
    }
}
