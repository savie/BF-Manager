package l;

import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15702 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20670 m37481(InterfaceC20670... interfaceC20670Arr) {
        C22811 c22811 = new C22811(interfaceC20670Arr.length);
        long j = 0;
        int iCharacteristics = 336;
        boolean zIsParallel = false;
        for (InterfaceC20670 interfaceC20670 : interfaceC20670Arr) {
            zIsParallel |= interfaceC20670.isParallel();
            InterfaceC8409 interfaceC8409Spliterator = interfaceC20670.spliterator();
            c22811.m19805((Object) interfaceC8409Spliterator);
            iCharacteristics &= interfaceC8409Spliterator.characteristics();
            long jEstimateSize = interfaceC8409Spliterator.estimateSize();
            long j2 = j + jEstimateSize;
            j = (((jEstimateSize ^ j) > 0L ? 1 : ((jEstimateSize ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + C25227.FOREVER_NS;
        }
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        abstractC1928M51441.getClass();
        InterfaceC8409 interfaceC8409Spliterator2 = C13629.spliterator(abstractC1928M51441, 1296);
        C10080 c10080 = new C10080(5);
        interfaceC8409Spliterator2.getClass();
        return (InterfaceC20670) C12465.stream(new C9581(null, interfaceC8409Spliterator2, c10080, iCharacteristics, j), zIsParallel).onClose(new RunnableC13815(0, interfaceC20670Arr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15867 m37479(InterfaceC20670 interfaceC20670) {
        InterfaceC8409 interfaceC8409TrySplit;
        final C22416 c22416 = new C22416();
        c22416.f72599 = false;
        c22416.f72600 = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(interfaceC20670.spliterator());
        while (!arrayDeque.isEmpty()) {
            InterfaceC8409 interfaceC8409 = (InterfaceC8409) arrayDeque.removeLast();
            if (interfaceC8409.getExactSizeIfKnown() != 0) {
                if (interfaceC8409.hasCharacteristics(16384)) {
                    do {
                        interfaceC8409TrySplit = interfaceC8409.trySplit();
                        if (interfaceC8409TrySplit == null || interfaceC8409TrySplit.getExactSizeIfKnown() == 0) {
                        }
                        interfaceC8409.forEachRemaining(new Consumer() { // from class: l.ۙ᩻ܽ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C12312.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void n(Object obj) {
                                C22416 c22417 = c22416;
                                c22417.f72599 = true;
                                c22417.f72600 = obj;
                            }
                        });
                        Object obj = c22416.f72600;
                        C17359.requireNonNull(obj);
                        return C15867.of(obj);
                    } while (interfaceC8409.getExactSizeIfKnown() != 0);
                    interfaceC8409 = interfaceC8409TrySplit;
                    interfaceC8409.forEachRemaining(new Consumer() { // from class: l.ۙ᩻ܽ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj2) {
                            C22416 c22417 = c22416;
                            c22417.f72599 = true;
                            c22417.f72600 = obj2;
                        }
                    });
                    Object obj2 = c22416.f72600;
                    C17359.requireNonNull(obj2);
                    return C15867.of(obj2);
                }
                InterfaceC8409 interfaceC8409TrySplit2 = interfaceC8409.trySplit();
                if (interfaceC8409TrySplit2 == null || interfaceC8409TrySplit2.getExactSizeIfKnown() == 0) {
                    interfaceC8409.forEachRemaining(new Consumer() { // from class: l.ۙ᩻ܽ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj3) {
                            C22416 c22417 = c22416;
                            c22417.f72599 = true;
                            c22417.f72600 = obj3;
                        }
                    });
                    if (c22416.f72599) {
                        Object obj3 = c22416.f72600;
                        C17359.requireNonNull(obj3);
                        return C15867.of(obj3);
                    }
                } else {
                    arrayDeque.addLast(interfaceC8409TrySplit2);
                    arrayDeque.addLast(interfaceC8409);
                }
            }
        }
        return C15867.empty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20670 m37480(InterfaceC20670 interfaceC20670, C0747 c0747) {
        interfaceC20670.getClass();
        boolean zIsParallel = interfaceC20670.isParallel();
        InterfaceC8409 interfaceC8409Spliterator = interfaceC20670.spliterator();
        if (!interfaceC8409Spliterator.hasCharacteristics(16384)) {
            return (InterfaceC20670) C12465.stream(new C23162(interfaceC8409Spliterator.estimateSize(), interfaceC8409Spliterator.characteristics() & 80, C13629.iterator(interfaceC8409Spliterator), c0747), zIsParallel).onClose(new RunnableC22487(3, interfaceC20670));
        }
        return (InterfaceC20670) C12465.stream(new C11227(interfaceC8409Spliterator, 0L, c0747), zIsParallel).onClose(new RunnableC22487(3, interfaceC20670));
    }
}
