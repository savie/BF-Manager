package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֫ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1932 implements Iterator {
    public int a = 0;
    public final /* synthetic */ C15174 b;

    public C1932(C15174 c15174) {
        this.b = c15174;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a < this.b.c.size()) {
            C15174 name = this.b.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
