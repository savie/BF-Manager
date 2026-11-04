package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܶܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f52539 = new AtomicReference();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC23646 f52540;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23646 m38412() {
        if (f52540 == null) {
            synchronized (C16186.class) {
                if (f52540 == null) {
                    InterfaceC17678 interfaceC17678 = (InterfaceC17678) f52539.get();
                    InterfaceC23646 interfaceC23646M41344 = interfaceC17678 != null ? interfaceC17678.m41344() : null;
                    if (interfaceC23646M41344 == null) {
                        interfaceC23646M41344 = new C1646();
                    }
                    f52540 = interfaceC23646M41344;
                }
            }
        }
        return f52540;
    }
}
