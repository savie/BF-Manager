package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11978 implements InterfaceC1288, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40120 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5627 f40121;

    @Override // l.InterfaceC12932, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C22456.m49957(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C11978(C5627 c5627) {
        this.f40121 = c5627;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40120 < this.f40121.f19277.f23647;
    }

    @Override // l.InterfaceC12932
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f40121.f19277.f23649;
        int i = this.f40120;
        this.f40120 = i + 1;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f40120;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C5627 c5627 = this.f40121;
        C7038 c7038 = c5627.f19277;
        int i2 = c7038.f23647 - i;
        long[] jArr = c7038.f23649;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c5627.f19277.f23645;
        int i3 = this.f40120;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C7038 c7039 = c5627.f19277;
        int i4 = c7039.f23647 - 1;
        c7039.f23647 = i4;
        this.f40120--;
        c7039.f23645[i4] = null;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(LongConsumer longConsumer) {
        C7038 c7038 = this.f40121.f19277;
        long[] jArr = c7038.f23649;
        int i = c7038.f23647;
        while (true) {
            int i2 = this.f40120;
            if (i2 >= i) {
                return;
            }
            this.f40120 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
