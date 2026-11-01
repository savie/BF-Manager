package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5C37 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8596 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22379(InterfaceC10007 interfaceC10007, Consumer consumer) {
        InterfaceC17767 c18473;
        if (consumer instanceof InterfaceC17767) {
            c18473 = (InterfaceC17767) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c18473 = new C18473(consumer);
        }
        interfaceC10007.forEachRemaining(c18473);
    }
}
