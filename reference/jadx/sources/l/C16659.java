package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܽ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f53410 = new AtomicReference();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC12426 f53411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12426 m39124() {
        if (f53411 == null) {
            synchronized (C16659.class) {
                if (f53411 == null) {
                    InterfaceC0430 interfaceC0430 = (InterfaceC0430) f53410.get();
                    InterfaceC12426 interfaceC12426M2252 = interfaceC0430 != null ? interfaceC0430.m2252() : null;
                    if (interfaceC12426M2252 == null) {
                        interfaceC12426M2252 = new C7300();
                    }
                    f53411 = interfaceC12426M2252;
                }
            }
        }
        return f53411;
    }
}
