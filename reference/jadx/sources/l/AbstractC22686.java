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

/* JADX INFO: renamed from: l.᩺֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22686 implements InterfaceC3647 {
    public static final C15519 a = new C15519();
    public static final C0203 b = new C0203();
    public static final C4934 c = new C4934();
    public static final C21370 d = new C21370();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract void M(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171);

    public abstract boolean N(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171);

    public abstract InterfaceC8616 Q(InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction);

    public abstract long R(InterfaceC20693 interfaceC20693);

    public abstract InterfaceC23280 c0(long j, IntFunction intFunction);

    public abstract InterfaceC2319 e0();

    public abstract InterfaceC19171 f0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171);

    public abstract InterfaceC19171 g0(InterfaceC19171 interfaceC19171);

    public abstract InterfaceC20693 h0(InterfaceC20693 interfaceC20693);

    @Override // l.InterfaceC3647
    public /* synthetic */ int j() {
        return 0;
    }

    public static C5295 W(Function function) {
        C5295 c5295 = new C5295(11);
        c5295.b = function;
        return c5295;
    }

    public static C11251 d0(EnumC0120 enumC0120, Predicate predicate) {
        C13638.requireNonNull(predicate);
        C13638.requireNonNull(enumC0120);
        return new C11251(EnumC22761.REFERENCE, enumC0120, new C12447(enumC0120, predicate, 3));
    }

    public static AbstractC6457 P(EnumC22761 enumC22761) {
        int i = AbstractC10733.a[enumC22761.ordinal()];
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
        throw new IllegalStateException("Unknown shape " + enumC22761);
    }

    public static C11251 a0(EnumC0120 enumC0120, IntPredicate intPredicate) {
        C13638.requireNonNull(intPredicate);
        C13638.requireNonNull(enumC0120);
        return new C11251(EnumC22761.INT_VALUE, enumC0120, new C12447(enumC0120, intPredicate, 1));
    }

    public static InterfaceC8616 F(InterfaceC8616 interfaceC8616, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC8616.count()) {
            return interfaceC8616;
        }
        InterfaceC20693 interfaceC20693Spliterator = interfaceC8616.spliterator();
        long j3 = j2 - j;
        InterfaceC23280 interfaceC23280G = G(j3, intFunction);
        interfaceC23280G.c(j3);
        for (int i = 0; i < j && interfaceC20693Spliterator.tryAdvance(new C1040(10)); i++) {
        }
        if (j2 == interfaceC8616.count()) {
            interfaceC20693Spliterator.forEachRemaining(interfaceC23280G);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC20693Spliterator.tryAdvance(interfaceC23280G); i2++) {
            }
        }
        interfaceC23280G.end();
        return interfaceC23280G.build();
    }

    public static AbstractC22055 L(EnumC22761 enumC22761, InterfaceC8616 interfaceC8616, InterfaceC8616 interfaceC8617) {
        int i = AbstractC10733.a[enumC22761.ordinal()];
        if (i == 1) {
            return new C11410(interfaceC8616, interfaceC8617);
        }
        if (i == 2) {
            return new C2505((InterfaceC13036) interfaceC8616, (InterfaceC13036) interfaceC8617);
        }
        if (i == 3) {
            return new C18734((InterfaceC23620) interfaceC8616, (InterfaceC23620) interfaceC8617);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC22761);
        }
        return new C17385((InterfaceC7163) interfaceC8616, (InterfaceC7163) interfaceC8617);
    }

    public static C11251 b0(EnumC0120 enumC0120, LongPredicate longPredicate) {
        C13638.requireNonNull(longPredicate);
        C13638.requireNonNull(enumC0120);
        return new C11251(EnumC22761.LONG_VALUE, enumC0120, new C12447(enumC0120, longPredicate, 0));
    }

    public static void t() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C11251 Z(EnumC0120 enumC0120, DoublePredicate doublePredicate) {
        C13638.requireNonNull(doublePredicate);
        C13638.requireNonNull(enumC0120);
        return new C11251(EnumC22761.DOUBLE_VALUE, enumC0120, new C12447(enumC0120, doublePredicate, 2));
    }

    public static void u() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC23280 G(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C20569(j, intFunction);
        }
        return new C18465();
    }

    public static void m() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void p(InterfaceC10974 interfaceC10974, Integer num) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC10974.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC10974.accept(num.intValue());
    }

    public static void r(InterfaceC21993 interfaceC21993, Long l2) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC21993.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC21993.accept(l2.longValue());
    }

    public static InterfaceC19960 X(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C7391();
        }
        return new C3862(j);
    }

    public static void n(InterfaceC8857 interfaceC8857, Double d2) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC8857.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC8857.accept(d2.doubleValue());
    }

    public static InterfaceC3025 Y(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C19502();
        }
        return new C22324(j);
    }

    public static Object[] v(InterfaceC0853 interfaceC0853, IntFunction intFunction) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC0853.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC0853.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC0853.count());
        interfaceC0853.k(objArr, 0);
        return objArr;
    }

    public static InterfaceC15021 O(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C13610();
        }
        return new C16349(j);
    }

    public static InterfaceC8616 H(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        long jR = abstractC22686.R(interfaceC20693);
        if (jR < 0 || !interfaceC20693.hasCharacteristics(16384)) {
            C11741 c11741 = new C11741();
            c11741.a = intFunction;
            InterfaceC8616 interfaceC8616 = (InterfaceC8616) new C5390(abstractC22686, interfaceC20693, c11741, new C1040(18), 3).invoke();
            return z ? S(interfaceC8616, intFunction) : interfaceC8616;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jR);
        new C17323(interfaceC20693, abstractC22686, objArr).invoke();
        return new C19233(objArr);
    }

    public static void A(InterfaceC13036 interfaceC13036, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC13036.g((IntConsumer) consumer);
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(interfaceC13036.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC18576) interfaceC13036.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void x(InterfaceC13036 interfaceC13036, Integer[] numArr, int i) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC13036.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC13036.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static InterfaceC13036 D(InterfaceC13036 interfaceC13036, long j, long j2) {
        if (j == 0 && j2 == interfaceC13036.count()) {
            return interfaceC13036;
        }
        long j3 = j2 - j;
        InterfaceC18576 interfaceC18576 = (InterfaceC18576) interfaceC13036.spliterator();
        InterfaceC19960 interfaceC19960X = X(j3);
        interfaceC19960X.c(j3);
        for (int i = 0; i < j && interfaceC18576.tryAdvance((IntConsumer) new C14220(0)); i++) {
        }
        if (j2 == interfaceC13036.count()) {
            interfaceC18576.forEachRemaining((IntConsumer) interfaceC19960X);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC18576.tryAdvance((IntConsumer) interfaceC19960X); i2++) {
            }
        }
        interfaceC19960X.end();
        return interfaceC19960X.build();
    }

    public static InterfaceC13036 J(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, boolean z) {
        long jR = abstractC22686.R(interfaceC20693);
        if (jR < 0 || !interfaceC20693.hasCharacteristics(16384)) {
            InterfaceC13036 interfaceC13036 = (InterfaceC13036) new C5390(abstractC22686, interfaceC20693, new C1040(14), new C1040(15), 1).invoke();
            return z ? U(interfaceC13036) : interfaceC13036;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jR];
        new C5328(interfaceC20693, abstractC22686, iArr).invoke();
        return new C1518(iArr);
    }

    public static InterfaceC23620 K(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, boolean z) {
        long jR = abstractC22686.R(interfaceC20693);
        if (jR < 0 || !interfaceC20693.hasCharacteristics(16384)) {
            InterfaceC23620 interfaceC23620 = (InterfaceC23620) new C5390(abstractC22686, interfaceC20693, new C1040(16), new C1040(17), 2).invoke();
            return z ? V(interfaceC23620) : interfaceC23620;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jR];
        new C8151(interfaceC20693, abstractC22686, jArr).invoke();
        return new C10767(jArr);
    }

    public static void B(InterfaceC23620 interfaceC23620, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC23620.g((LongConsumer) consumer);
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(interfaceC23620.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC19282) interfaceC23620.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void y(InterfaceC23620 interfaceC23620, Long[] lArr, int i) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC23620.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC23620.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static InterfaceC23620 E(InterfaceC23620 interfaceC23620, long j, long j2) {
        if (j == 0 && j2 == interfaceC23620.count()) {
            return interfaceC23620;
        }
        long j3 = j2 - j;
        InterfaceC19282 interfaceC19282 = (InterfaceC19282) interfaceC23620.spliterator();
        InterfaceC3025 interfaceC3025Y = Y(j3);
        interfaceC3025Y.c(j3);
        for (int i = 0; i < j && interfaceC19282.tryAdvance((LongConsumer) new C10214(0)); i++) {
        }
        if (j2 == interfaceC23620.count()) {
            interfaceC19282.forEachRemaining((LongConsumer) interfaceC3025Y);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC19282.tryAdvance((LongConsumer) interfaceC3025Y); i2++) {
            }
        }
        interfaceC3025Y.end();
        return interfaceC3025Y.build();
    }

    public static InterfaceC7163 I(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, boolean z) {
        long jR = abstractC22686.R(interfaceC20693);
        if (jR < 0 || !interfaceC20693.hasCharacteristics(16384)) {
            InterfaceC7163 interfaceC7163 = (InterfaceC7163) new C5390(abstractC22686, interfaceC20693, new C1040(12), new C1040(13), 0).invoke();
            return z ? T(interfaceC7163) : interfaceC7163;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jR];
        new C6096(interfaceC20693, abstractC22686, dArr).invoke();
        return new C17759(dArr);
    }

    public static InterfaceC8616 S(InterfaceC8616 interfaceC8616, IntFunction intFunction) {
        if (interfaceC8616.o() <= 0) {
            return interfaceC8616;
        }
        long jCount = interfaceC8616.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C14108(interfaceC8616, objArr).invoke();
        return new C19233(objArr);
    }

    public static void z(InterfaceC7163 interfaceC7163, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC7163.g((DoubleConsumer) consumer);
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(interfaceC7163.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC7535) interfaceC7163.spliterator()).forEachRemaining(consumer);
        }
    }

    public static InterfaceC13036 U(InterfaceC13036 interfaceC13036) {
        if (interfaceC13036.o() <= 0) {
            return interfaceC13036;
        }
        long jCount = interfaceC13036.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C11493(interfaceC13036, iArr).invoke();
        return new C1518(iArr);
    }

    public static void w(InterfaceC7163 interfaceC7163, Double[] dArr, int i) {
        if (AbstractC14233.a) {
            AbstractC14233.a(interfaceC7163.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC7163.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static InterfaceC7163 C(InterfaceC7163 interfaceC7163, long j, long j2) {
        if (j == 0 && j2 == interfaceC7163.count()) {
            return interfaceC7163;
        }
        long j3 = j2 - j;
        InterfaceC7535 interfaceC7535 = (InterfaceC7535) interfaceC7163.spliterator();
        InterfaceC15021 interfaceC15021O = O(j3);
        interfaceC15021O.c(j3);
        for (int i = 0; i < j && interfaceC7535.tryAdvance((DoubleConsumer) new C3634(0)); i++) {
        }
        if (j2 == interfaceC7163.count()) {
            interfaceC7535.forEachRemaining((DoubleConsumer) interfaceC15021O);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC7535.tryAdvance((DoubleConsumer) interfaceC15021O); i2++) {
            }
        }
        interfaceC15021O.end();
        return interfaceC15021O.build();
    }

    public static InterfaceC23620 V(InterfaceC23620 interfaceC23620) {
        if (interfaceC23620.o() <= 0) {
            return interfaceC23620;
        }
        long jCount = interfaceC23620.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C17842(interfaceC23620, jArr).invoke();
        return new C10767(jArr);
    }

    public static InterfaceC7163 T(InterfaceC7163 interfaceC7163) {
        if (interfaceC7163.o() <= 0) {
            return interfaceC7163;
        }
        long jCount = interfaceC7163.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C12116(interfaceC7163, dArr).invoke();
        return new C17759(dArr);
    }

    @Override // l.InterfaceC3647
    public Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        InterfaceC2319 interfaceC2319E0 = e0();
        abstractC5752.f0(interfaceC20693, interfaceC2319E0);
        return interfaceC2319E0.get();
    }

    @Override // l.InterfaceC3647
    public Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        return ((InterfaceC2319) new C2929(this, abstractC22686, interfaceC20693).invoke()).get();
    }
}
