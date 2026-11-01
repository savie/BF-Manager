package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7373 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24456 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f24457;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15841 f24458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24459;

    public C7373(C15841 c15841) {
        this.f24458 = c15841;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f24456 + 1;
        C15841 c15841 = this.f24458;
        return i < c15841.f51271.size() || (!c15841.f51273.isEmpty() && m19641().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f24459 = true;
        int i = this.f24456 + 1;
        this.f24456 = i;
        C15841 c15841 = this.f24458;
        if (i < c15841.f51271.size()) {
            return (Map.Entry) c15841.f51271.get(this.f24456);
        }
        return (Map.Entry) m19641().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24459) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24459 = false;
        C15841 c15841 = this.f24458;
        c15841.m37651();
        if (this.f24456 < c15841.f51271.size()) {
            int i = this.f24456;
            this.f24456 = i - 1;
            c15841.m37656(i);
            return;
        }
        m19641().remove();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Iterator m19641() {
        if (this.f24457 == null) {
            this.f24457 = this.f24458.f51273.entrySet().iterator();
        }
        return this.f24457;
    }
}
