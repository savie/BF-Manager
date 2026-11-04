package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAO9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17813 {
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m41658(InterfaceC16321 interfaceC16321, Consumer consumer) {
        InterfaceC12089 c6124;
        if (consumer instanceof InterfaceC12089) {
            c6124 = (InterfaceC12089) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c6124 = new C6124(consumer);
        }
        return interfaceC16321.tryAdvance((Object) c6124);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41657(InterfaceC16321 interfaceC16321, Consumer consumer) {
        InterfaceC12089 c6124;
        if (consumer instanceof InterfaceC12089) {
            c6124 = (InterfaceC12089) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c6124 = new C6124(consumer);
        }
        interfaceC16321.forEachRemaining((Object) c6124);
    }
}
