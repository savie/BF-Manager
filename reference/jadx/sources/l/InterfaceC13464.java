package l;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K3ZR */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13464 extends Closeable, Flushable, InterfaceC4996 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    String mo32946(InterfaceC4290 interfaceC4290);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    Iterable mo32947(InterfaceC4290 interfaceC4290, String str, Set set, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    String mo32948(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    ServiceLoader mo32949(InterfaceC4290 interfaceC4290, Class cls);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    InterfaceC2173 mo32950(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    InterfaceC2173 mo32951(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347, InterfaceC3458 interfaceC3458);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    InterfaceC3458 mo32952(InterfaceC4290 interfaceC4290, String str);

    /* JADX INFO: renamed from: ۙ */
    boolean mo10918(Iterator it, String str);

    /* JADX INFO: renamed from: ۙ */
    boolean mo22150(InterfaceC3458 interfaceC3458, InterfaceC3458 interfaceC3459);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    boolean mo32953(InterfaceC4290 interfaceC4290);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    boolean mo32954(InterfaceC4290 interfaceC4290, InterfaceC3458 interfaceC3458);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    ClassLoader mo32955(InterfaceC4290 interfaceC4290);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    Iterable mo32956(InterfaceC4290 interfaceC4290);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    InterfaceC4290 mo32957(InterfaceC4290 interfaceC4290, String str);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    InterfaceC4290 mo32958(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173);
}
