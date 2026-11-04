package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12548 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40316 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24483 f40317;

    public C12548(C24483 c24483) {
        this.f40317 = c24483;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40316 < this.f40317.f79456.f15714;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f40317.f79456.f15715;
        int i = this.f40316;
        this.f40316 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f40316;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C24483 c24483 = this.f40317;
        C4345 c4345 = c24483.f79456;
        int i2 = c4345.f15714 - i;
        long[] jArr = c4345.f15719;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c24483.f79456.f15715;
        int i3 = this.f40316;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C4345 c4346 = c24483.f79456;
        int i4 = c4346.f15714 - 1;
        c4346.f15714 = i4;
        this.f40316--;
        c4346.f15715[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C4345 c4345 = this.f40317.f79456;
        Object[] objArr = c4345.f15715;
        int i = c4345.f15714;
        while (true) {
            int i2 = this.f40316;
            if (i2 >= i) {
                return;
            }
            this.f40316 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
