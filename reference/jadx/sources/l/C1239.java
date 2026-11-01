package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T9NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1239 extends AbstractC13235 implements Iterator, InterfaceC14771 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f5407;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f5408;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5409;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC14771 f5410;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4442(InterfaceC14771 interfaceC14771) {
        this.f5410 = interfaceC14771;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f5409;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m4439();
                }
                Iterator it = this.f5408;
                C13465.m32962(it);
                if (it.hasNext()) {
                    this.f5409 = 2;
                    return true;
                }
                this.f5408 = null;
            }
            this.f5409 = 5;
            InterfaceC14771 interfaceC14771 = this.f5410;
            C13465.m32962(interfaceC14771);
            this.f5410 = null;
            interfaceC14771.mo2097(C7321.f24318);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5409;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f5409 = 1;
            Iterator it = this.f5408;
            C13465.m32962(it);
            return it.next();
        }
        if (i == 3) {
            this.f5409 = 0;
            Object obj = this.f5407;
            this.f5407 = null;
            return obj;
        }
        throw m4439();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final RuntimeException m4439() {
        int i = this.f5409;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5409);
    }

    @Override // l.AbstractC13235
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13214 mo4441(Object obj, InterfaceC14771 interfaceC14771) {
        this.f5407 = obj;
        this.f5409 = 3;
        this.f5410 = interfaceC14771;
        return EnumC13214.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC13235
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4440(Iterator it, InterfaceC14771 interfaceC14771) {
        if (!it.hasNext()) {
            return C7321.f24318;
        }
        this.f5408 = it;
        this.f5409 = 2;
        this.f5410 = interfaceC14771;
        return EnumC13214.COROUTINE_SUSPENDED;
    }

    @Override // l.InterfaceC14771
    /* JADX INFO: renamed from: ۙ */
    public final void mo2097(Object obj) throws Throwable {
        C18610.m43015(obj);
        this.f5409 = 4;
    }

    @Override // l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        return C1218.f5350;
    }
}
