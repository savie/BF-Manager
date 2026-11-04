package l;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3ZR */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC16722 extends Closeable, Flushable, InterfaceC23436 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: ۙ */
    Iterable mo6977(InterfaceC24928 interfaceC24928, String str, Set set, boolean z);

    /* JADX INFO: renamed from: ۙ */
    String mo6978(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976);

    /* JADX INFO: renamed from: ۙ */
    ServiceLoader mo6980(InterfaceC24928 interfaceC24928, Class cls);

    /* JADX INFO: renamed from: ۙ */
    InterfaceC11501 mo6982(InterfaceC24928 interfaceC24928, String str);

    /* JADX INFO: renamed from: ۙ */
    InterfaceC15976 mo6983(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468);

    /* JADX INFO: renamed from: ۙ */
    InterfaceC15976 mo6984(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468, InterfaceC11501 interfaceC11501);

    /* JADX INFO: renamed from: ۙ */
    boolean mo26605(Iterator it, String str);

    /* JADX INFO: renamed from: ۙ */
    boolean mo6988(InterfaceC11501 interfaceC11501, InterfaceC11501 interfaceC11502);

    /* JADX INFO: renamed from: ۙ */
    boolean mo6989(InterfaceC24928 interfaceC24928);

    /* JADX INFO: renamed from: ۙ */
    boolean mo6990(InterfaceC24928 interfaceC24928, InterfaceC11501 interfaceC11501);

    /* JADX INFO: renamed from: ۤ */
    ClassLoader mo6991(InterfaceC24928 interfaceC24928);

    /* JADX INFO: renamed from: ᩷ */
    Iterable mo6993(InterfaceC24928 interfaceC24928);

    /* JADX INFO: renamed from: ᩷ */
    InterfaceC24928 mo6994(InterfaceC24928 interfaceC24928, String str);

    /* JADX INFO: renamed from: ᩷ */
    InterfaceC24928 mo6995(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976);

    /* JADX INFO: renamed from: ᩸ */
    String mo6996(InterfaceC24928 interfaceC24928);
}
