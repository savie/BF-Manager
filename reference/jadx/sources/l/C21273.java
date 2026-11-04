package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f67835;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f67836;

    static {
        HashMap map = new HashMap();
        f67836 = map;
        HashMap map2 = new HashMap();
        f67835 = map2;
        map2.put(C14301.class, new C25003());
        map2.put(C6929.class, new C16051());
        map2.put(C12556.class, new C23511());
        C3373 c3373 = new C3373();
        map2.put(C14275.class, c3373);
        map.put(C14275.class, c3373);
        C20527 c20527 = new C20527();
        map2.put(C20989.class, c20527);
        map.put(C20989.class, c20527);
        map.put(C18751.class, new C12322());
        map2.put(C12295.class, new C6357());
        map2.put(C6790.class, new C24257());
        map.put(C9800.class, new C4119());
        map2.put(C18856.class, new C4865());
        C22019 c22019 = new C22019();
        map2.put(C0390.class, c22019);
        map.put(C0390.class, c22019);
        map2.put(C7106.class, new C10830());
        map2.put(C5224.class, new C22765());
        map2.put(C18005.class, new C19781());
        map2.put(C0106.class, new C15305());
        map2.put(C0852.class, new C13068());
        map2.put(C9055.class, new C5611());
        map2.put(C2344.class, new C1882());
        map2.put(C7848.class, new C11576());
        map.put(C19035.class, new C16797());
        map.put(C18289.class, new C17543());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6819 m48447(InterfaceC10084 interfaceC10084) {
        Class<?> cls = interfaceC10084.getClass();
        InterfaceC6819 interfaceC6819 = (InterfaceC6819) f67836.get(cls);
        if (interfaceC6819 != null) {
            return interfaceC6819;
        }
        throw new IllegalArgumentException(C24966.m55772(cls, "FileInformationClass not supported - "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8310 m48448() {
        InterfaceC8310 interfaceC8310 = (InterfaceC8310) f67835.get(C9055.class);
        if (interfaceC8310 != null) {
            return interfaceC8310;
        }
        throw new IllegalArgumentException(C24966.m55772(C9055.class, "FileInformationClass not supported - "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m48446(byte[] bArr, InterfaceC8310 interfaceC8310) {
        return new C14559(bArr, interfaceC8310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48449(C19035 c19035, C7453 c7453) {
        c7453.m56005((byte) 0);
        c7453.m56007(7, new byte[]{0, 0, 0, 0, 0, 0, 0});
        c7453.m56014(0L);
        c7453.m56025(((long) c19035.m44121()) * 2);
        byte[] bytes = c19035.m44120().getBytes(C22150.f71350);
        c7453.m56007(bytes.length, bytes);
    }
}
