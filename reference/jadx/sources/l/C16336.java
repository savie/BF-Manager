package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܽ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C16336 extends AbstractC21502 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC21502
    public final Object[] t() {
        return new long[8][];
    }

    @Override // l.AbstractC21502
    public final void p(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC21502
    public final int q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            C7993.a((C17746) spliterator(), consumer);
        }
    }

    @Override // l.AbstractC21502
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        u();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC19282 interfaceC19282Spliterator = spliterator();
        C13638.requireNonNull(interfaceC19282Spliterator);
        return new C2111(interfaceC19282Spliterator);
    }

    @Override // l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC19282 spliterator() {
        return new C17746(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
