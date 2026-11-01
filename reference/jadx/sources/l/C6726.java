package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6726 extends AbstractC1081 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C19427 c19427 = this.b;
        if (c19427 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c19427.b;
        Object obj2 = c19427.c;
        this.j = c19427;
        a();
        return new C8138(obj, obj2, this.i);
    }
}
