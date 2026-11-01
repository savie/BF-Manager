package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H7IS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8493 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22191(final InterfaceC19782 interfaceC19782, Object... objArr) {
        InterfaceC21192 interfaceC21192M38403 = C16254.m38403(C11397.of(objArr));
        final C20487 c20487 = new C20487();
        C16254 c16254 = (C16254) interfaceC21192M38403;
        c16254.getClass();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        ((InterfaceC5046) c16254.m38404()).forEach(new Consumer() { // from class: l.۟᩺᩵
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC19782 interfaceC19783 = interfaceC19782;
                AtomicInteger atomicInteger2 = atomicInteger;
                try {
                    interfaceC19783.accept(obj);
                } catch (IOException e) {
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() == null) {
                        atomicReference2.set(new ArrayList());
                    }
                    ((List) atomicReference2.get()).add((IOException) c20487.apply(Integer.valueOf(atomicInteger2.get()), e));
                }
                atomicInteger2.incrementAndGet();
            }
        });
        List list = (List) atomicReference.get();
        int i = C17892.f56661;
        if (!((list != null ? list.size() : 0) == 0)) {
            throw new C17892(null, list);
        }
    }
}
