package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V52N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6890 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f23198;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo18502(Object obj);

    public AbstractC6890(Object obj) {
        this.f23198 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23198 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f23198;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f23198 = mo18502(obj);
        return obj;
    }
}
