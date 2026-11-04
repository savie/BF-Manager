package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GBZW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20490 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46990(InterfaceC12285 interfaceC12285, Consumer consumer) {
        LongConsumer c23474;
        if (consumer instanceof LongConsumer) {
            c23474 = (LongConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23474 = new C23474(consumer);
        }
        interfaceC12285.forEachRemaining(c23474);
    }
}
