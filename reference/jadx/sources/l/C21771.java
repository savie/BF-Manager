package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21771 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70540 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18949 f70541;

    public C21771(C18949 c18949) {
        this.f70541 = c18949;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70540 < this.f70541.f61363.f25321;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f70541.f61363.f25323;
        int i = this.f70540;
        this.f70540 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f70540;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C18949 c18949 = this.f70541;
        C7660 c7660 = c18949.f61363;
        int i2 = c7660.f25321 - i;
        Object[] objArr = c7660.f25323;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c18949.f61363.f25319;
        int i3 = this.f70540;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C7660 c7661 = c18949.f61363;
        int i4 = c7661.f25321 - 1;
        c7661.f25321 = i4;
        this.f70540--;
        c7661.f25323[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C7660 c7660 = this.f70541.f61363;
        Object[] objArr = c7660.f25323;
        int i = c7660.f25321;
        while (true) {
            int i2 = this.f70540;
            if (i2 >= i) {
                return;
            }
            this.f70540 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
