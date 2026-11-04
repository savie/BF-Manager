package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11802 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17769 f38119;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38120 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38121 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20753 f38122;

    public C11802(C17769 c17769) {
        this.f38119 = c17769;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38121 < this.f38119.f58340.f15714;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4345 c4345 = this.f38119.f58340;
        int i = this.f38121;
        this.f38121 = i + 1;
        this.f38120 = i;
        C20753 c20753 = new C20753(c4345, i);
        this.f38122 = c20753;
        return c20753;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f38120 == -1) {
            throw new IllegalStateException();
        }
        this.f38120 = -1;
        C17769 c17769 = this.f38119;
        C4345 c4345 = c17769.f58340;
        int i = c4345.f15714;
        c4345.f15714 = i - 1;
        int i2 = this.f38121;
        int i3 = i2 - 1;
        this.f38121 = i3;
        int i4 = i - i2;
        long[] jArr = c4345.f15719;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c17769.f58340.f15715;
        int i5 = this.f38121;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f38122.f66497 = -1;
        C4345 c4346 = c17769.f58340;
        c4346.f15715[c4346.f15714] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C17769 c17769 = this.f38119;
        int i = c17769.f58340.f15714;
        while (true) {
            int i2 = this.f38121;
            if (i2 >= i) {
                return;
            }
            C4345 c4345 = c17769.f58340;
            this.f38121 = i2 + 1;
            this.f38120 = i2;
            C20753 c20753 = new C20753(c4345, i2);
            this.f38122 = c20753;
            consumer.accept(c20753);
        }
    }
}
