package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes.dex */
public final class C21890 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22636 f70724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f70725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f70726 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f70727;

    public C21890(C22636 c22636) {
        this.f70724 = c22636;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f70726 + 1;
        C22636 c22636 = this.f70724;
        return i < c22636.f73528.size() || (!c22636.f73530.isEmpty() && m49585().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f70727 = true;
        int i = this.f70726 + 1;
        this.f70726 = i;
        C22636 c22636 = this.f70724;
        if (i < c22636.f73528.size()) {
            return (Map.Entry) c22636.f73528.get(this.f70726);
        }
        return (Map.Entry) m49585().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f70727) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f70727 = false;
        C22636 c22636 = this.f70724;
        c22636.m51012();
        if (this.f70726 < c22636.f73528.size()) {
            int i = this.f70726;
            this.f70726 = i - 1;
            c22636.m51016(i);
            return;
        }
        m49585().remove();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Iterator m49585() {
        if (this.f70725 == null) {
            this.f70725 = this.f70724.f73530.entrySet().iterator();
        }
        return this.f70725;
    }
}
