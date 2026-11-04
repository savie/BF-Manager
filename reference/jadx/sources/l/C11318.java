package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۧۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9NL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11318 extends AbstractC24745 implements Iterator, InterfaceC4825 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f35669;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f35670;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f35671;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4825 f35672;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28602(InterfaceC4825 interfaceC4825) {
        this.f35672 = interfaceC4825;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f35669;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m28599();
                }
                Iterator it = this.f35670;
                C15243.m36586(it);
                if (it.hasNext()) {
                    this.f35669 = 2;
                    return true;
                }
                this.f35670 = null;
            }
            this.f35669 = 5;
            InterfaceC4825 interfaceC4825 = this.f35672;
            C15243.m36586(interfaceC4825);
            this.f35672 = null;
            interfaceC4825.mo8188(C11471.f36082);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35669;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f35669 = 1;
            Iterator it = this.f35670;
            C15243.m36586(it);
            return it.next();
        }
        if (i == 3) {
            this.f35669 = 0;
            Object obj = this.f35671;
            this.f35671 = null;
            return obj;
        }
        throw m28599();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final RuntimeException m28599() {
        int i = this.f35669;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f35669);
    }

    @Override // l.AbstractC24745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16757 mo28601(Object obj, InterfaceC4825 interfaceC4825) {
        this.f35671 = obj;
        this.f35669 = 3;
        this.f35672 = interfaceC4825;
        return EnumC16757.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC24745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo28600(Iterator it, InterfaceC4825 interfaceC4825) {
        if (!it.hasNext()) {
            return C11471.f36082;
        }
        this.f35670 = it;
        this.f35669 = 2;
        this.f35672 = interfaceC4825;
        return EnumC16757.COROUTINE_SUSPENDED;
    }

    @Override // l.InterfaceC4825
    /* JADX INFO: renamed from: ۙ */
    public final void mo8188(Object obj) throws Throwable {
        C19676.m45348(obj);
        this.f35669 = 4;
    }

    @Override // l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        return C24963.f80840;
    }
}
