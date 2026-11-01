package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18077 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19489 f57840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20900 f57841;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f57839 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57838 = 0;

    public C18077(C19489 c19489) {
        this.f57840 = c19489;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57838 < this.f57840.f62716.f53437;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C16667 c16667 = this.f57840.f62716;
        int i = this.f57838;
        this.f57838 = i + 1;
        this.f57839 = i;
        C20900 c20900 = new C20900(c16667, i);
        this.f57841 = c20900;
        return c20900;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f57839 == -1) {
            throw new IllegalStateException();
        }
        this.f57839 = -1;
        C19489 c19489 = this.f57840;
        C16667 c16667 = c19489.f62716;
        int i = c16667.f53437;
        c16667.f53437 = i - 1;
        int i2 = this.f57838;
        int i3 = i2 - 1;
        this.f57838 = i3;
        int i4 = i - i2;
        int[] iArr = c16667.f53439;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c19489.f62716.f53435;
        int i5 = this.f57838;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f57841.f67924 = -1;
        C16667 c16668 = c19489.f62716;
        c16668.f53435[c16668.f53437] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C19489 c19489 = this.f57840;
        int i = c19489.f62716.f53437;
        while (true) {
            int i2 = this.f57838;
            if (i2 >= i) {
                return;
            }
            C16667 c16667 = c19489.f62716;
            this.f57838 = i2 + 1;
            this.f57839 = i2;
            C20900 c20900 = new C20900(c16667, i2);
            this.f57841 = c20900;
            consumer.accept(c20900);
        }
    }
}
