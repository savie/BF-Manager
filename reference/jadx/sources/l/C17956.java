package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17956 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15841 f57431;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f57432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f57433;

    public C17956(C15841 c15841) {
        this.f57431 = c15841;
        this.f57433 = c15841.f51271.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f57433;
        return (i > 0 && i <= this.f57431.f51271.size()) || m41784().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!m41784().hasNext()) {
            List list = this.f57431.f51271;
            int i = this.f57433 - 1;
            this.f57433 = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m41784().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Iterator m41784() {
        if (this.f57432 == null) {
            this.f57432 = this.f57431.f51269.entrySet().iterator();
        }
        return this.f57432;
    }
}
