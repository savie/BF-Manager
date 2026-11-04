package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8775 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5003 f28538;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f28539 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f28540 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19919 f28541;

    public C8775(C5003 c5003) {
        this.f28538 = c5003;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28540 < this.f28538.f17370.f6731;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C2020 c2020 = this.f28538.f17370;
        int i = this.f28540;
        this.f28540 = i + 1;
        this.f28539 = i;
        C19919 c19919 = new C19919(c2020, i);
        this.f28541 = c19919;
        return c19919;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f28539 == -1) {
            throw new IllegalStateException();
        }
        this.f28539 = -1;
        C5003 c5003 = this.f28538;
        C2020 c2020 = c5003.f17370;
        int i = c2020.f6731;
        c2020.f6731 = i - 1;
        int i2 = this.f28540;
        int i3 = i2 - 1;
        this.f28540 = i3;
        int i4 = i - i2;
        char[] cArr = c2020.f6736;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c5003.f17370.f6732;
        int i5 = this.f28540;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f28541.f64081 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C5003 c5003 = this.f28538;
        int i = c5003.f17370.f6731;
        while (true) {
            int i2 = this.f28540;
            if (i2 >= i) {
                return;
            }
            C2020 c2020 = c5003.f17370;
            this.f28540 = i2 + 1;
            this.f28539 = i2;
            C19919 c19919 = new C19919(c2020, i2);
            this.f28541 = c19919;
            consumer.accept(c19919);
        }
    }
}
