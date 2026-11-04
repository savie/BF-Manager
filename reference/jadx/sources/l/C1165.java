package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5C37 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1165 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4306(InterfaceC9367 interfaceC9367, Consumer consumer) {
        InterfaceC0419 c7877;
        if (consumer instanceof InterfaceC0419) {
            c7877 = (InterfaceC0419) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c7877 = new C7877(consumer);
        }
        interfaceC9367.forEachRemaining(c7877);
    }
}
