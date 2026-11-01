package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0334 implements InterfaceC15277, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1742 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12330 f1743;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo1416());
    }

    public C0334(C12330 c12330) {
        this.f1743 = c12330;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1742 < this.f1743.f41219.f47387;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f1743.f41219.f47389;
        int i = this.f1742;
        this.f1742 = i + 1;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1742;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C12330 c12330 = this.f1743;
        C14447 c14447 = c12330.f41219;
        int i2 = c14447.f47387 - i;
        char[] cArr = c14447.f47389;
        System.arraycopy(cArr, i, cArr, i - 1, i2);
        char[] cArr2 = c12330.f41219.f47385;
        int i3 = this.f1742;
        System.arraycopy(cArr2, i3, cArr2, i3 - 1, i2);
        c12330.f41219.f47387--;
        this.f1742--;
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f1743.f41219;
        char[] cArr = c14447.f47389;
        int i = c14447.f47387;
        while (true) {
            int i2 = this.f1742;
            if (i2 >= i) {
                return;
            }
            this.f1742 = i2 + 1;
            interfaceC1164.mo4297(cArr[i2]);
        }
    }
}
