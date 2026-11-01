package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20796 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67621 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f67622 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20091 f67623;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17268 f67624;

    public C20796(C20091 c20091) {
        this.f67623 = c20091;
        this.f67624 = new C17268(c20091.f65270);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67621 < this.f67623.f65270.f47387;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f67621;
        this.f67621 = i + 1;
        this.f67622 = i;
        C17268 c17268 = this.f67624;
        c17268.f55010 = i;
        return c17268;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f67622 == -1) {
            throw new IllegalStateException();
        }
        this.f67622 = -1;
        C20091 c20091 = this.f67623;
        C14447 c14447 = c20091.f65270;
        int i = c14447.f47387;
        c14447.f47387 = i - 1;
        int i2 = this.f67621;
        int i3 = i2 - 1;
        this.f67621 = i3;
        int i4 = i - i2;
        char[] cArr = c14447.f47389;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c20091.f65270.f47385;
        int i5 = this.f67621;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f67624.f55010 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f67623.f65270.f47387;
        while (true) {
            int i2 = this.f67621;
            if (i2 >= i) {
                return;
            }
            this.f67621 = i2 + 1;
            this.f67622 = i2;
            C17268 c17268 = this.f67624;
            c17268.f55010 = i2;
            consumer.accept(c17268);
        }
    }
}
