package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12001 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m30185(InterfaceC6036 interfaceC6036) {
        return Integer.valueOf(interfaceC6036.nextInt());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30186(InterfaceC6036 interfaceC6036, Consumer consumer) {
        IntConsumer c23190;
        if (consumer instanceof IntConsumer) {
            c23190 = (IntConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23190 = new C23190(consumer);
        }
        interfaceC6036.forEachRemaining(c23190);
    }
}
