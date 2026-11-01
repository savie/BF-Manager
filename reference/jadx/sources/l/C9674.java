package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9674 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14095 f32608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22561 f32609;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f32607 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32606 = 0;

    public C9674(C14095 c14095) {
        this.f32608 = c14095;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32606 < this.f32608.f46262.f23647;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7038 c7038 = this.f32608.f46262;
        int i = this.f32606;
        this.f32606 = i + 1;
        this.f32607 = i;
        C22561 c22561 = new C22561(c7038, i);
        this.f32609 = c22561;
        return c22561;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f32607 == -1) {
            throw new IllegalStateException();
        }
        this.f32607 = -1;
        C14095 c14095 = this.f32608;
        C7038 c7038 = c14095.f46262;
        int i = c7038.f23647;
        c7038.f23647 = i - 1;
        int i2 = this.f32606;
        int i3 = i2 - 1;
        this.f32606 = i3;
        int i4 = i - i2;
        long[] jArr = c7038.f23649;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c14095.f46262.f23645;
        int i5 = this.f32606;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f32609.f73533 = -1;
        C7038 c7039 = c14095.f46262;
        c7039.f23645[c7039.f23647] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C14095 c14095 = this.f32608;
        int i = c14095.f46262.f23647;
        while (true) {
            int i2 = this.f32606;
            if (i2 >= i) {
                return;
            }
            C7038 c7038 = c14095.f46262;
            this.f32606 = i2 + 1;
            this.f32607 = i2;
            C22561 c22561 = new C22561(c7038, i2);
            this.f32609 = c22561;
            consumer.accept(c22561);
        }
    }
}
