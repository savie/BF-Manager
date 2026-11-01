package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes.dex */
public final class C23682 implements InterfaceC10007, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1808 f76616;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76617 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76618 = 0;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8596.m22379(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C23682(C1808 c1808) {
        this.f76616 = c1808;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76618 < this.f76616.f6965;
    }

    @Override // l.InterfaceC10007
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f76616.f6964;
        int i = this.f76618;
        this.f76618 = i + 1;
        this.f76617 = i;
        return fArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f76617 == -1) {
            throw new IllegalStateException();
        }
        this.f76617 = -1;
        C1808 c1808 = this.f76616;
        int i = c1808.f6965;
        c1808.f6965 = i - 1;
        int i2 = this.f76618;
        int i3 = i2 - 1;
        this.f76618 = i3;
        float[] fArr = c1808.f6964;
        System.arraycopy(fArr, i2, fArr, i3, i - i2);
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ۨ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC17767 interfaceC17767) {
        C1808 c1808 = this.f76616;
        float[] fArr = c1808.f6964;
        while (true) {
            int i = this.f76618;
            if (i >= c1808.f6965) {
                return;
            }
            this.f76618 = i + 1;
            interfaceC17767.mo35707(fArr[i]);
        }
    }
}
