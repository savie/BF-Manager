package l;

import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4004 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5046 m11498(InterfaceC5046... interfaceC5046Arr) {
        C4793 c4793 = new C4793(interfaceC5046Arr.length);
        long j = 0;
        int iCharacteristics = 336;
        boolean zIsParallel = false;
        for (InterfaceC5046 interfaceC5046 : interfaceC5046Arr) {
            zIsParallel |= interfaceC5046.isParallel();
            InterfaceC20693 interfaceC20693Spliterator = interfaceC5046.spliterator();
            c4793.m52161((Object) interfaceC20693Spliterator);
            iCharacteristics &= interfaceC20693Spliterator.characteristics();
            long jEstimateSize = interfaceC20693Spliterator.estimateSize();
            long j2 = j + jEstimateSize;
            j = (((jEstimateSize ^ j) > 0L ? 1 : ((jEstimateSize ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + C17492.FOREVER_NS;
        }
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        abstractC22433M13309.getClass();
        InterfaceC20693 interfaceC20693Spliterator2 = C19988.spliterator(abstractC22433M13309, 1296);
        C13212 c13212 = new C13212(4);
        interfaceC20693Spliterator2.getClass();
        return (InterfaceC5046) C21980.stream(new C17473(null, interfaceC20693Spliterator2, c13212, iCharacteristics, j), zIsParallel).onClose(new RunnableC11767(0, interfaceC5046Arr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11521 m11499(InterfaceC5046 interfaceC5046) {
        InterfaceC20693 interfaceC20693TrySplit;
        final C5416 c5416 = new C5416();
        c5416.f18704 = false;
        c5416.f18705 = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(interfaceC5046.spliterator());
        while (!arrayDeque.isEmpty()) {
            InterfaceC20693 interfaceC20693 = (InterfaceC20693) arrayDeque.removeLast();
            if (interfaceC20693.getExactSizeIfKnown() != 0) {
                if (interfaceC20693.hasCharacteristics(16384)) {
                    do {
                        interfaceC20693TrySplit = interfaceC20693.trySplit();
                        if (interfaceC20693TrySplit == null || interfaceC20693TrySplit.getExactSizeIfKnown() == 0) {
                        }
                        interfaceC20693.forEachRemaining(new Consumer() { // from class: l.ۖܳܶ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C1455.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void n(Object obj) {
                                C5416 c5417 = c5416;
                                c5417.f18704 = true;
                                c5417.f18705 = obj;
                            }
                        });
                        Object obj = c5416.f18705;
                        C13638.requireNonNull(obj);
                        return C11521.of(obj);
                    } while (interfaceC20693.getExactSizeIfKnown() != 0);
                    interfaceC20693 = interfaceC20693TrySplit;
                    interfaceC20693.forEachRemaining(new Consumer() { // from class: l.ۖܳܶ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj2) {
                            C5416 c5417 = c5416;
                            c5417.f18704 = true;
                            c5417.f18705 = obj2;
                        }
                    });
                    Object obj2 = c5416.f18705;
                    C13638.requireNonNull(obj2);
                    return C11521.of(obj2);
                }
                InterfaceC20693 interfaceC20693TrySplit2 = interfaceC20693.trySplit();
                if (interfaceC20693TrySplit2 == null || interfaceC20693TrySplit2.getExactSizeIfKnown() == 0) {
                    interfaceC20693.forEachRemaining(new Consumer() { // from class: l.ۖܳܶ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj3) {
                            C5416 c5417 = c5416;
                            c5417.f18704 = true;
                            c5417.f18705 = obj3;
                        }
                    });
                    if (c5416.f18704) {
                        Object obj3 = c5416.f18705;
                        C13638.requireNonNull(obj3);
                        return C11521.of(obj3);
                    }
                } else {
                    arrayDeque.addLast(interfaceC20693TrySplit2);
                    arrayDeque.addLast(interfaceC20693);
                }
            }
        }
        return C11521.empty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5046 m11497(InterfaceC5046 interfaceC5046, C4328 c4328) {
        interfaceC5046.getClass();
        boolean zIsParallel = interfaceC5046.isParallel();
        InterfaceC20693 interfaceC20693Spliterator = interfaceC5046.spliterator();
        if (!interfaceC20693Spliterator.hasCharacteristics(16384)) {
            return (InterfaceC5046) C21980.stream(new C1182(interfaceC20693Spliterator.estimateSize(), interfaceC20693Spliterator.characteristics() & 80, C19988.iterator(interfaceC20693Spliterator), c4328), zIsParallel).onClose(new RunnableC8979(3, interfaceC5046));
        }
        return (InterfaceC5046) C21980.stream(new C22350(interfaceC20693Spliterator, 0L, c4328), zIsParallel).onClose(new RunnableC8979(3, interfaceC5046));
    }
}
