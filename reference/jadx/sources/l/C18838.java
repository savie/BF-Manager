package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18838 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9887 f61194;

    public C18838(C9887 c9887) {
        this.f61194 = c9887;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61193 < this.f61194.f31798;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f61193;
        this.f61193 = i + 1;
        return Integer.valueOf(this.f61194.f31799.f43256.m15137(i, false));
    }
}
