package l;

import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.֫ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1655 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19554 m5943(String str) {
        int iIndexOf = str.indexOf(":");
        String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        return (InterfaceC19554) C12465.stream(C4937.spliterator(ServiceLoader.load(InterfaceC12841.class, C21527.class.getClassLoader())), false).filter(new C5384(strSubstring)).findFirst().flatMap(new C7873(strSubstring, iIndexOf != -1 ? str.substring(iIndexOf + 1) : "")).orElse(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m5944(String str, InterfaceC12841 interfaceC12841) {
        InterfaceC20670 interfaceC20670Stream = C12465.stream(C4937.spliterator(interfaceC12841.m31887()), false);
        C17359.requireNonNull(str);
        return interfaceC20670Stream.anyMatch(new C7844(str, 2));
    }
}
