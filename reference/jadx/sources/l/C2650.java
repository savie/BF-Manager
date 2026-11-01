package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2650 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5473 f10308;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f10309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10310 = -2;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C2650(C5473 c5473) {
        this.f10308 = c5473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m8176() {
        Object objInvoke;
        int i = this.f10310;
        C5473 c5473 = this.f10308;
        if (i == -2) {
            objInvoke = ((C15352) c5473.f18844).f50026;
        } else {
            InterfaceC15456 interfaceC15456 = c5473.f18845;
            Object obj = this.f10309;
            C13465.m32962(obj);
            objInvoke = interfaceC15456.invoke(obj);
        }
        this.f10309 = objInvoke;
        this.f10310 = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10310 < 0) {
            m8176();
        }
        if (this.f10310 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10309;
        C13465.m32963(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f10310 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10310 < 0) {
            m8176();
        }
        return this.f10310 == 1;
    }
}
