package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13097 implements InterfaceC9367, InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1911 f41856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f41855 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41857 = 0;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1165.m4306(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C13097(C1911 c1911) {
        this.f41856 = c1911;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41857 < this.f41856.f6438;
    }

    @Override // l.InterfaceC9367
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f41856.f6437;
        int i = this.f41857;
        this.f41857 = i + 1;
        this.f41855 = i;
        return fArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f41855 == -1) {
            throw new IllegalStateException();
        }
        this.f41855 = -1;
        C1911 c1911 = this.f41856;
        int i = c1911.f6438;
        c1911.f6438 = i - 1;
        int i2 = this.f41857;
        int i3 = i2 - 1;
        this.f41857 = i3;
        float[] fArr = c1911.f6437;
        System.arraycopy(fArr, i2, fArr, i3, i - i2);
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ۤ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC0419 interfaceC0419) {
        C1911 c1911 = this.f41856;
        float[] fArr = c1911.f6437;
        while (true) {
            int i = this.f41857;
            if (i >= c1911.f6438) {
                return;
            }
            this.f41857 = i + 1;
            interfaceC0419.mo2223(fArr[i]);
        }
    }
}
