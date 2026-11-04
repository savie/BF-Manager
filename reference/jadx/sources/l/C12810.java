package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12810 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f41042;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5353 f41043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41044 = -2;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C12810(C5353 c5353) {
        this.f41043 = c5353;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m31772() {
        Object objInvoke;
        int i = this.f41044;
        C5353 c5353 = this.f41043;
        if (i == -2) {
            objInvoke = ((C23253) c5353.f18789).f75336;
        } else {
            InterfaceC3071 interfaceC3071 = c5353.f18790;
            Object obj = this.f41042;
            C15243.m36586(obj);
            objInvoke = interfaceC3071.invoke(obj);
        }
        this.f41042 = objInvoke;
        this.f41044 = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41044 < 0) {
            m31772();
        }
        if (this.f41044 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f41042;
        C15243.m36587(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f41044 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41044 < 0) {
            m31772();
        }
        return this.f41044 == 1;
    }
}
