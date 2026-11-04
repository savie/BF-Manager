package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֫ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1850 implements Iterator {
    public int a = 0;
    public final /* synthetic */ C21149 b;

    public C1850(C21149 c21149) {
        this.b = c21149;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a < this.b.c.size()) {
            C21149 name = this.b.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
