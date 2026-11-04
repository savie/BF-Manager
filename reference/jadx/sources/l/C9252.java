package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9252 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f30109;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22636 f30110;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30111;

    public C9252(C22636 c22636) {
        this.f30110 = c22636;
        this.f30111 = c22636.f73528.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f30111;
        return (i > 0 && i <= this.f30110.f73528.size()) || m24436().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!m24436().hasNext()) {
            List list = this.f30110.f73528;
            int i = this.f30111 - 1;
            this.f30111 = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m24436().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Iterator m24436() {
        if (this.f30109 == null) {
            this.f30109 = this.f30110.f73527.entrySet().iterator();
        }
        return this.f30109;
    }
}
