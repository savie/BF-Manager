package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13956 implements InterfaceC8605 {
    public static final C14702 a = new C14702();
    public static final C17906 b = new C17906();
    public static final C18652 c = new C18652();
    public static final C22382 d = new C22382();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract void M(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143);

    public abstract boolean N(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143);

    public abstract InterfaceC13409 Q(InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction);

    public abstract long R(InterfaceC8409 interfaceC8409);

    public abstract InterfaceC4262 c0(long j, IntFunction intFunction);

    public abstract InterfaceC18873 e0();

    public abstract InterfaceC15143 f0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143);

    public abstract InterfaceC15143 g0(InterfaceC15143 interfaceC15143);

    public abstract InterfaceC8409 h0(InterfaceC8409 interfaceC8409);

    @Override // l.InterfaceC8605
    public /* synthetic */ int j() {
        return 0;
    }

    public static C15801 W(Function function) {
        C15801 c15801 = new C15801();
        c15801.b = function;
        return c15801;
    }

    public static C15602 d0(EnumC17381 enumC17381, Predicate predicate) {
        C17359.requireNonNull(predicate);
        C17359.requireNonNull(enumC17381);
        return new C15602(EnumC14154.REFERENCE, enumC17381, new C23764(enumC17381, predicate, 3));
    }

    public static AbstractC7245 P(EnumC14154 enumC14154) {
        int i = AbstractC12663.a[enumC14154.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + enumC14154);
    }

    public static C15602 a0(EnumC17381 enumC17381, IntPredicate intPredicate) {
        C17359.requireNonNull(intPredicate);
        C17359.requireNonNull(enumC17381);
        return new C15602(EnumC14154.INT_VALUE, enumC17381, new C23764(enumC17381, intPredicate, 1));
    }

    public static InterfaceC13409 F(InterfaceC13409 interfaceC13409, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC13409.count()) {
            return interfaceC13409;
        }
        InterfaceC8409 interfaceC8409Spliterator = interfaceC13409.spliterator();
        long j3 = j2 - j;
        InterfaceC4262 interfaceC4262G = G(j3, intFunction);
        interfaceC4262G.c(j3);
        for (int i = 0; i < j && interfaceC8409Spliterator.tryAdvance(new C13189(10)); i++) {
        }
        if (j2 == interfaceC13409.count()) {
            interfaceC8409Spliterator.forEachRemaining(interfaceC4262G);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC8409Spliterator.tryAdvance(interfaceC4262G); i2++) {
            }
        }
        interfaceC4262G.end();
        return interfaceC4262G.build();
    }

    public static AbstractC1477 L(EnumC14154 enumC14154, InterfaceC13409 interfaceC13409, InterfaceC13409 interfaceC134010) {
        int i = AbstractC12663.a[enumC14154.ordinal()];
        if (i == 1) {
            return new C7860(interfaceC13409, interfaceC134010);
        }
        if (i == 2) {
            return new C19288((InterfaceC2792) interfaceC13409, (InterfaceC2792) interfaceC134010);
        }
        if (i == 3) {
            return new C22777((InterfaceC6478) interfaceC13409, (InterfaceC6478) interfaceC134010);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC14154);
        }
        return new C3626((InterfaceC2047) interfaceC13409, (InterfaceC2047) interfaceC134010);
    }

    public static C15602 b0(EnumC17381 enumC17381, LongPredicate longPredicate) {
        C17359.requireNonNull(longPredicate);
        C17359.requireNonNull(enumC17381);
        return new C15602(EnumC14154.LONG_VALUE, enumC17381, new C23764(enumC17381, longPredicate, 0));
    }

    public static void t() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C15602 Z(EnumC17381 enumC17381, DoublePredicate doublePredicate) {
        C17359.requireNonNull(doublePredicate);
        C17359.requireNonNull(enumC17381);
        return new C15602(EnumC14154.DOUBLE_VALUE, enumC17381, new C23764(enumC17381, doublePredicate, 2));
    }

    public static void u() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC4262 G(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C11741(j, intFunction);
        }
        return new C22603();
    }

    public static void m() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void p(InterfaceC12334 interfaceC12334, Integer num) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC12334.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC12334.accept(num.intValue());
    }

    public static void r(InterfaceC1148 interfaceC1148, Long l2) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC1148.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC1148.accept(l2.longValue());
    }

    public static InterfaceC17160 X(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C2003();
        }
        return new C8758(j);
    }

    public static void n(InterfaceC13080 interfaceC13080, Double d2) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC13080.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC13080.accept(d2.doubleValue());
    }

    public static InterfaceC21636 Y(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C15558();
        }
        return new C0886(j);
    }

    public static Object[] v(InterfaceC9459 interfaceC9459, IntFunction intFunction) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC9459.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC9459.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC9459.count());
        interfaceC9459.k(objArr, 0);
        return objArr;
    }

    public static InterfaceC5228 O(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C0228();
        }
        return new C15889(j);
    }

    public static InterfaceC13409 H(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        long jR = abstractC13956.R(interfaceC8409);
        if (jR < 0 || !interfaceC8409.hasCharacteristics(16384)) {
            C11083 c11083 = new C11083();
            c11083.a = intFunction;
            InterfaceC13409 interfaceC13409 = (InterfaceC13409) new C9834(abstractC13956, interfaceC8409, c11083, new C13189(18), 3).invoke();
            return z ? S(interfaceC13409, intFunction) : interfaceC13409;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jR);
        new C3385(interfaceC8409, abstractC13956, objArr).invoke();
        return new C15055(objArr);
    }

    public static void A(InterfaceC2792 interfaceC2792, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC2792.g((IntConsumer) consumer);
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(interfaceC2792.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC7664) interfaceC2792.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void x(InterfaceC2792 interfaceC2792, Integer[] numArr, int i) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC2792.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC2792.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static InterfaceC2792 D(InterfaceC2792 interfaceC2792, long j, long j2) {
        if (j == 0 && j2 == interfaceC2792.count()) {
            return interfaceC2792;
        }
        long j3 = j2 - j;
        InterfaceC7664 interfaceC7664 = (InterfaceC7664) interfaceC2792.spliterator();
        InterfaceC17160 interfaceC17160X = X(j3);
        interfaceC17160X.c(j3);
        for (int i = 0; i < j && interfaceC7664.tryAdvance((IntConsumer) new C24422(0)); i++) {
        }
        if (j2 == interfaceC2792.count()) {
            interfaceC7664.forEachRemaining((IntConsumer) interfaceC17160X);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC7664.tryAdvance((IntConsumer) interfaceC17160X); i2++) {
            }
        }
        interfaceC17160X.end();
        return interfaceC17160X.build();
    }

    public static InterfaceC2792 J(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, boolean z) {
        long jR = abstractC13956.R(interfaceC8409);
        if (jR < 0 || !interfaceC8409.hasCharacteristics(16384)) {
            InterfaceC2792 interfaceC2792 = (InterfaceC2792) new C9834(abstractC13956, interfaceC8409, new C13189(14), new C13189(15), 1).invoke();
            return z ? U(interfaceC2792) : interfaceC2792;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jR];
        new C10337(interfaceC8409, abstractC13956, iArr).invoke();
        return new C4284(iArr);
    }

    public static InterfaceC6478 K(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, boolean z) {
        long jR = abstractC13956.R(interfaceC8409);
        if (jR < 0 || !interfaceC8409.hasCharacteristics(16384)) {
            InterfaceC6478 interfaceC6478 = (InterfaceC6478) new C9834(abstractC13956, interfaceC8409, new C13189(16), new C13189(17), 2).invoke();
            return z ? V(interfaceC6478) : interfaceC6478;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jR];
        new C19793(interfaceC8409, abstractC13956, jArr).invoke();
        return new C12072(jArr);
    }

    public static void B(InterfaceC6478 interfaceC6478, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC6478.g((LongConsumer) consumer);
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(interfaceC6478.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC9900) interfaceC6478.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void y(InterfaceC6478 interfaceC6478, Long[] lArr, int i) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC6478.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC6478.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static InterfaceC6478 E(InterfaceC6478 interfaceC6478, long j, long j2) {
        if (j == 0 && j2 == interfaceC6478.count()) {
            return interfaceC6478;
        }
        long j3 = j2 - j;
        InterfaceC9900 interfaceC9900 = (InterfaceC9900) interfaceC6478.spliterator();
        InterfaceC21636 interfaceC21636Y = Y(j3);
        interfaceC21636Y.c(j3);
        for (int i = 0; i < j && interfaceC9900.tryAdvance((LongConsumer) new C5732(0)); i++) {
        }
        if (j2 == interfaceC6478.count()) {
            interfaceC9900.forEachRemaining((LongConsumer) interfaceC21636Y);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC9900.tryAdvance((LongConsumer) interfaceC21636Y); i2++) {
            }
        }
        interfaceC21636Y.end();
        return interfaceC21636Y.build();
    }

    public static InterfaceC2047 I(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, boolean z) {
        long jR = abstractC13956.R(interfaceC8409);
        if (jR < 0 || !interfaceC8409.hasCharacteristics(16384)) {
            InterfaceC2047 interfaceC2047 = (InterfaceC2047) new C9834(abstractC13956, interfaceC8409, new C13189(12), new C13189(13), 0).invoke();
            return z ? T(interfaceC2047) : interfaceC2047;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jR];
        new C20780(interfaceC8409, abstractC13956, dArr).invoke();
        return new C10668(dArr);
    }

    public static InterfaceC13409 S(InterfaceC13409 interfaceC13409, IntFunction intFunction) {
        if (interfaceC13409.o() <= 0) {
            return interfaceC13409;
        }
        long jCount = interfaceC13409.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C0753(interfaceC13409, objArr).invoke();
        return new C15055(objArr);
    }

    public static void z(InterfaceC2047 interfaceC2047, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC2047.g((DoubleConsumer) consumer);
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(interfaceC2047.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC3012) interfaceC2047.spliterator()).forEachRemaining(consumer);
        }
    }

    public static InterfaceC2792 U(InterfaceC2792 interfaceC2792) {
        if (interfaceC2792.o() <= 0) {
            return interfaceC2792;
        }
        long jCount = interfaceC2792.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C7686(interfaceC2792, iArr).invoke();
        return new C4284(iArr);
    }

    public static void w(InterfaceC2047 interfaceC2047, Double[] dArr, int i) {
        if (AbstractC24095.a) {
            AbstractC24095.a(interfaceC2047.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC2047.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static InterfaceC2047 C(InterfaceC2047 interfaceC2047, long j, long j2) {
        if (j == 0 && j2 == interfaceC2047.count()) {
            return interfaceC2047;
        }
        long j3 = j2 - j;
        InterfaceC3012 interfaceC3012 = (InterfaceC3012) interfaceC2047.spliterator();
        InterfaceC5228 interfaceC5228O = O(j3);
        interfaceC5228O.c(j3);
        for (int i = 0; i < j && interfaceC3012.tryAdvance((DoubleConsumer) new C8736(0)); i++) {
        }
        if (j2 == interfaceC2047.count()) {
            interfaceC3012.forEachRemaining((DoubleConsumer) interfaceC5228O);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC3012.tryAdvance((DoubleConsumer) interfaceC5228O); i2++) {
            }
        }
        interfaceC5228O.end();
        return interfaceC5228O.build();
    }

    public static InterfaceC6478 V(InterfaceC6478 interfaceC6478) {
        if (interfaceC6478.o() <= 0) {
            return interfaceC6478;
        }
        long jCount = interfaceC6478.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C11193(interfaceC6478, jArr).invoke();
        return new C12072(jArr);
    }

    public static InterfaceC2047 T(InterfaceC2047 interfaceC2047) {
        if (interfaceC2047.o() <= 0) {
            return interfaceC2047;
        }
        long jCount = interfaceC2047.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C23349(interfaceC2047, dArr).invoke();
        return new C10668(dArr);
    }

    @Override // l.InterfaceC8605
    public Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        InterfaceC18873 interfaceC18873E0 = e0();
        abstractC15470.f0(interfaceC8409, interfaceC18873E0);
        return interfaceC18873E0.get();
    }

    @Override // l.InterfaceC8605
    public Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        return ((InterfaceC18873) new C21438(this, abstractC13956, interfaceC8409).invoke()).get();
    }
}
