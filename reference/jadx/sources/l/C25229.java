package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes.dex */
public final class C25229 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17769 f81486;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20753 f81489;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f81488 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f81487 = -1;

    public C25229(C17769 c17769) {
        this.f81486 = c17769;
        this.f81489 = new C20753(c17769.f58340);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81488 < this.f81486.f58340.f15714;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f81488;
        this.f81488 = i + 1;
        this.f81487 = i;
        C20753 c20753 = this.f81489;
        c20753.f66497 = i;
        return c20753;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f81487 == -1) {
            throw new IllegalStateException();
        }
        this.f81487 = -1;
        C17769 c17769 = this.f81486;
        C4345 c4345 = c17769.f58340;
        int i = c4345.f15714;
        c4345.f15714 = i - 1;
        int i2 = this.f81488;
        int i3 = i2 - 1;
        this.f81488 = i3;
        int i4 = i - i2;
        long[] jArr = c4345.f15719;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c17769.f58340.f15715;
        int i5 = this.f81488;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f81489.f66497 = -1;
        C4345 c4346 = c17769.f58340;
        c4346.f15715[c4346.f15714] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f81486.f58340.f15714;
        while (true) {
            int i2 = this.f81488;
            if (i2 >= i) {
                return;
            }
            this.f81488 = i2 + 1;
            this.f81487 = i2;
            C20753 c20753 = this.f81489;
            c20753.f66497 = i2;
            consumer.accept(c20753);
        }
    }
}
