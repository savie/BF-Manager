package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18783 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60900 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f60901 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19489 f60902;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20900 f60903;

    public C18783(C19489 c19489) {
        this.f60902 = c19489;
        this.f60903 = new C20900(c19489.f62716);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60900 < this.f60902.f62716.f53437;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f60900;
        this.f60900 = i + 1;
        this.f60901 = i;
        C20900 c20900 = this.f60903;
        c20900.f67924 = i;
        return c20900;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f60901 == -1) {
            throw new IllegalStateException();
        }
        this.f60901 = -1;
        C19489 c19489 = this.f60902;
        C16667 c16667 = c19489.f62716;
        int i = c16667.f53437;
        c16667.f53437 = i - 1;
        int i2 = this.f60900;
        int i3 = i2 - 1;
        this.f60900 = i3;
        int i4 = i - i2;
        int[] iArr = c16667.f53439;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c19489.f62716.f53435;
        int i5 = this.f60900;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f60903.f67924 = -1;
        C16667 c16668 = c19489.f62716;
        c16668.f53435[c16668.f53437] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f60902.f62716.f53437;
        while (true) {
            int i2 = this.f60900;
            if (i2 >= i) {
                return;
            }
            this.f60900 = i2 + 1;
            this.f60901 = i2;
            C20900 c20900 = this.f60903;
            c20900.f67924 = i2;
            consumer.accept(c20900);
        }
    }
}
