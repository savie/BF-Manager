package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7IS */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19295 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44661(final InterfaceC10344 interfaceC10344, Object... objArr) {
        InterfaceC2887 interfaceC2887M23720 = C8853.m23720(C23654.of(objArr));
        final C7362 c7362 = new C7362();
        C8853 c8853 = (C8853) interfaceC2887M23720;
        c8853.getClass();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        ((InterfaceC20670) c8853.m23721()).forEach(new Consumer() { // from class: l.ۡ᩵ۨ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC10344 interfaceC10345 = interfaceC10344;
                AtomicInteger atomicInteger2 = atomicInteger;
                try {
                    interfaceC10345.accept(obj);
                } catch (IOException e) {
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() == null) {
                        atomicReference2.set(new ArrayList());
                    }
                    ((List) atomicReference2.get()).add((IOException) c7362.apply(Integer.valueOf(atomicInteger2.get()), e));
                }
                atomicInteger2.incrementAndGet();
            }
        });
        List list = (List) atomicReference.get();
        int i = C18792.f61026;
        if (!((list != null ? list.size() : 0) == 0)) {
            throw new C18792(null, list);
        }
    }
}
