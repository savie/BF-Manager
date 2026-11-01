package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes5.dex */
public final class C15983 implements InterfaceC15277, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f51758;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0459 f51759;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51761;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19947 f51762;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51763 = -1;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo1416());
    }

    public C15983(C0459 c0459) {
        this.f51759 = c0459;
        this.f51761 = c0459.f2073;
        this.f51760 = c0459.f2074;
        this.f51758 = c0459.f2076;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51760 != 0;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        int i;
        char c;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f51760--;
        C0459 c0459 = this.f51759;
        char[] cArr = c0459.f2072;
        if (this.f51758) {
            this.f51758 = false;
            int i2 = c0459.f2073;
            this.f51763 = i2;
            return cArr[i2];
        }
        do {
            i = this.f51761 - 1;
            this.f51761 = i;
            if (i < 0) {
                this.f51763 = Integer.MIN_VALUE;
                return this.f51762.getChar((-i) - 1);
            }
            c = cArr[i];
        } while (c == 0);
        this.f51763 = i;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        char c;
        int i = this.f51763;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C0459 c0459 = this.f51759;
        int i2 = c0459.f2073;
        if (i == i2) {
            c0459.f2076 = false;
            c0459.f2072[i2] = 0;
        } else {
            int i3 = this.f51761;
            if (i3 >= 0) {
                char[] cArr = c0459.f2072;
                loop0: while (true) {
                    int i4 = (i + 1) & c0459.f2077;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM25125 = C9927.m25125((int) c);
                            int i5 = c0459.f2077;
                            int i6 = iM25125 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f51762 == null) {
                            this.f51762 = new C19947(2);
                        }
                        this.f51762.mo2291(cArr[i4]);
                    }
                    cArr[i] = c;
                    i = i4;
                }
                cArr[i] = 0;
            } else {
                c0459.mo2289(this.f51762.getChar((-i3) - 1));
                this.f51763 = -1;
                return;
            }
        }
        c0459.f2074--;
        this.f51763 = -1;
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C0459 c0459 = this.f51759;
        char[] cArr = c0459.f2072;
        if (this.f51758) {
            this.f51758 = false;
            int i = c0459.f2073;
            this.f51763 = i;
            interfaceC1164.mo4297(cArr[i]);
            this.f51760--;
        }
        while (this.f51760 != 0) {
            int i2 = this.f51761 - 1;
            this.f51761 = i2;
            if (i2 < 0) {
                this.f51763 = Integer.MIN_VALUE;
                interfaceC1164.mo4297(this.f51762.getChar((-i2) - 1));
                this.f51760--;
            } else {
                char c = cArr[i2];
                if (c != 0) {
                    this.f51763 = i2;
                    interfaceC1164.mo4297(c);
                    this.f51760--;
                }
            }
        }
    }
}
