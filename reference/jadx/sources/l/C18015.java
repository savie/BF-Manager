package l;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18015 extends AbstractC1081 implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18015(C19427[] c19427Arr, int i, int i2, ConcurrentMapC13783 concurrentMapC13783, int i3) {
        super(c19427Arr, i, i2, concurrentMapC13783);
        this.k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                C19427 c19427 = this.b;
                if (c19427 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c19427.b;
                this.j = c19427;
                a();
                return obj;
            default:
                C19427 c19428 = this.b;
                if (c19428 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = c19428.c;
                this.j = c19428;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                break;
        }
        return next();
    }
}
