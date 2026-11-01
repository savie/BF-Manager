package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13618 {
    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33300(InterfaceC11501 interfaceC11501, Consumer consumer) {
        InterfaceC17767 c18473;
        if (consumer instanceof InterfaceC17767) {
            c18473 = (InterfaceC17767) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c18473 = new C18473(consumer);
        }
        return interfaceC11501.tryAdvance((Object) c18473);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33299(InterfaceC11501 interfaceC11501, Consumer consumer) {
        InterfaceC17767 c18473;
        if (consumer instanceof InterfaceC17767) {
            c18473 = (InterfaceC17767) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c18473 = new C18473(consumer);
        }
        interfaceC11501.forEachRemaining((Object) c18473);
    }
}
