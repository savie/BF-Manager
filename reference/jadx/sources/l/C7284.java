package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7284 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5003 f23994;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19919 f23997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23996 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23995 = -1;

    public C7284(C5003 c5003) {
        this.f23994 = c5003;
        this.f23997 = new C19919(c5003.f17370);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23996 < this.f23994.f17370.f6731;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23996;
        this.f23996 = i + 1;
        this.f23995 = i;
        C19919 c19919 = this.f23997;
        c19919.f64081 = i;
        return c19919;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23995 == -1) {
            throw new IllegalStateException();
        }
        this.f23995 = -1;
        C5003 c5003 = this.f23994;
        C2020 c2020 = c5003.f17370;
        int i = c2020.f6731;
        c2020.f6731 = i - 1;
        int i2 = this.f23996;
        int i3 = i2 - 1;
        this.f23996 = i3;
        int i4 = i - i2;
        char[] cArr = c2020.f6736;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c5003.f17370.f6732;
        int i5 = this.f23996;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f23997.f64081 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f23994.f17370.f6731;
        while (true) {
            int i2 = this.f23996;
            if (i2 >= i) {
                return;
            }
            this.f23996 = i2 + 1;
            this.f23995 = i2;
            C19919 c19919 = this.f23997;
            c19919.f64081 = i2;
            consumer.accept(c19919);
        }
    }
}
