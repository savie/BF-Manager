package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۛۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C5848 extends AbstractC21502 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.AbstractC21502
    public final Object[] t() {
        return new double[8][];
    }

    @Override // l.AbstractC21502
    public final void p(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC21502
    public final int q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC14884.b((C19254) spliterator(), consumer);
        }
    }

    @Override // l.AbstractC21502
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        u();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC7535 interfaceC7535Spliterator = spliterator();
        C13638.requireNonNull(interfaceC7535Spliterator);
        return new C12227(interfaceC7535Spliterator);
    }

    @Override // l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC7535 spliterator() {
        return new C19254(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
