package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19373 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15846 f62438;

    public C19373(C15846 c15846) {
        this.f62438 = c15846;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62437 < this.f62438.f51283;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f62437;
        this.f62437 = i + 1;
        C10201 c10201 = new C10201(this.f62438);
        if (!c10201.m25993(i)) {
            return null;
        }
        C8084 c8084 = new C8084();
        c8084.f28313 = new C15070();
        c8084.f28312 = c10201.m25992();
        c8084.f28311 = c10201.m25990();
        for (int i2 = 0; i2 < c10201.m25994(); i2++) {
            c8084.f28313.add(c10201.m25995(i2));
        }
        return c8084;
    }
}
