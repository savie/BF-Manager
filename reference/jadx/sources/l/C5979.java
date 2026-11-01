package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5979 implements InterfaceC15277, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20343 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23619 f20344;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo1416());
    }

    public C5979(C23619 c23619) {
        this.f20344 = c23619;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20343 < this.f20344.f76526.f47387;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f20344.f76526.f47385;
        int i = this.f20343;
        this.f20343 = i + 1;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f20343;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C23619 c23619 = this.f20344;
        C14447 c14447 = c23619.f76526;
        int i2 = c14447.f47387 - i;
        char[] cArr = c14447.f47389;
        System.arraycopy(cArr, i, cArr, i - 1, i2);
        char[] cArr2 = c23619.f76526.f47385;
        int i3 = this.f20343;
        System.arraycopy(cArr2, i3, cArr2, i3 - 1, i2);
        c23619.f76526.f47387--;
        this.f20343--;
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f20344.f76526;
        char[] cArr = c14447.f47385;
        int i = c14447.f47387;
        while (true) {
            int i2 = this.f20343;
            if (i2 >= i) {
                return;
            }
            this.f20343 = i2 + 1;
            interfaceC1164.mo4297(cArr[i2]);
        }
    }
}
