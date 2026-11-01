package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7390 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20091 f24564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17268 f24565;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24563 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24562 = 0;

    public C7390(C20091 c20091) {
        this.f24564 = c20091;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24562 < this.f24564.f65270.f47387;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14447 c14447 = this.f24564.f65270;
        int i = this.f24562;
        this.f24562 = i + 1;
        this.f24563 = i;
        C17268 c17268 = new C17268(c14447, i);
        this.f24565 = c17268;
        return c17268;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f24563 == -1) {
            throw new IllegalStateException();
        }
        this.f24563 = -1;
        C20091 c20091 = this.f24564;
        C14447 c14447 = c20091.f65270;
        int i = c14447.f47387;
        c14447.f47387 = i - 1;
        int i2 = this.f24562;
        int i3 = i2 - 1;
        this.f24562 = i3;
        int i4 = i - i2;
        char[] cArr = c14447.f47389;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c20091.f65270.f47385;
        int i5 = this.f24562;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f24565.f55010 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C20091 c20091 = this.f24564;
        int i = c20091.f65270.f47387;
        while (true) {
            int i2 = this.f24562;
            if (i2 >= i) {
                return;
            }
            C14447 c14447 = c20091.f65270;
            this.f24562 = i2 + 1;
            this.f24563 = i2;
            C17268 c17268 = new C17268(c14447, i2);
            this.f24565 = c17268;
            consumer.accept(c17268);
        }
    }
}
