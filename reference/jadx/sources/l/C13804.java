package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13804 {
    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33554(InterfaceC11687 interfaceC11687, Consumer consumer) {
        InterfaceC1164 c13160;
        if (consumer instanceof InterfaceC1164) {
            c13160 = (InterfaceC1164) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c13160 = new C13160(consumer);
        }
        return interfaceC11687.tryAdvance((Object) c13160);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33553(InterfaceC11687 interfaceC11687, Consumer consumer) {
        InterfaceC1164 c13160;
        if (consumer instanceof InterfaceC1164) {
            c13160 = (InterfaceC1164) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c13160 = new C13160(consumer);
        }
        interfaceC11687.forEachRemaining((Object) c13160);
    }
}
