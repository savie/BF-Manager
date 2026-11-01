package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19676 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10504 f63171;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63172 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63173 = 0;

    public C19676(C10504 c10504) {
        this.f63171 = c10504;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63173 < this.f63171.f35993;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f63171.f35992;
        int i = this.f63173;
        this.f63173 = i + 1;
        this.f63172 = i;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f63172 == -1) {
            throw new IllegalStateException();
        }
        this.f63172 = -1;
        C10504 c10504 = this.f63171;
        int i = c10504.f35993;
        c10504.f35993 = i - 1;
        int i2 = this.f63173;
        int i3 = i2 - 1;
        this.f63173 = i3;
        Object[] objArr = c10504.f35992;
        System.arraycopy(objArr, i2, objArr, i3, i - i2);
        c10504.f35992[c10504.f35993] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C10504 c10504 = this.f63171;
        Object[] objArr = c10504.f35992;
        while (true) {
            int i = this.f63173;
            if (i >= c10504.f35993) {
                return;
            }
            this.f63173 = i + 1;
            consumer.accept(objArr[i]);
        }
    }
}
