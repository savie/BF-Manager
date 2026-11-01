package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3322 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12302 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12303 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14095 f12304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22561 f12305;

    public C3322(C14095 c14095) {
        this.f12304 = c14095;
        this.f12305 = new C22561(c14095.f46262);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12302 < this.f12304.f46262.f23647;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f12302;
        this.f12302 = i + 1;
        this.f12303 = i;
        C22561 c22561 = this.f12305;
        c22561.f73533 = i;
        return c22561;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12303 == -1) {
            throw new IllegalStateException();
        }
        this.f12303 = -1;
        C14095 c14095 = this.f12304;
        C7038 c7038 = c14095.f46262;
        int i = c7038.f23647;
        c7038.f23647 = i - 1;
        int i2 = this.f12302;
        int i3 = i2 - 1;
        this.f12302 = i3;
        int i4 = i - i2;
        long[] jArr = c7038.f23649;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c14095.f46262.f23645;
        int i5 = this.f12302;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f12305.f73533 = -1;
        C7038 c7039 = c14095.f46262;
        c7039.f23645[c7039.f23647] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f12304.f46262.f23647;
        while (true) {
            int i2 = this.f12302;
            if (i2 >= i) {
                return;
            }
            this.f12302 = i2 + 1;
            this.f12303 = i2;
            C22561 c22561 = this.f12305;
            c22561.f73533 = i2;
            consumer.accept(c22561);
        }
    }
}
