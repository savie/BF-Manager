package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes.dex */
public final class C22625 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73720;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73721;

    static {
        HashMap map = new HashMap();
        f73721 = map;
        HashMap map2 = new HashMap();
        f73720 = map2;
        map2.put(C17221.class, new C6023());
        map2.put(C4010.class, new C14491());
        map2.put(C4449.class, new C1789());
        C9552 c9552 = new C9552();
        map2.put(C5317.class, c9552);
        map.put(C5317.class, c9552);
        C3200 c3200 = new C3200();
        map2.put(C22251.class, c3200);
        map.put(C22251.class, c3200);
        map.put(C6728.class, new C4985());
        map2.put(C1323.class, new C14159());
        map2.put(C17874.class, new C12042());
        map.put(C22957.class, new C2868());
        map2.put(C5487.class, new C8846());
        C10257 c10257 = new C10257();
        map2.put(C13453.class, c10257);
        map.put(C13453.class, c10257);
        map2.put(C4961.class, new C7434());
        map2.put(C20149.class, new C20840());
        map2.put(C1083.class, new C15902());
        map2.put(C13079.class, new C20135());
        map2.put(C15196.class, new C0378());
        map2.put(C21545.class, new C16607());
        map2.put(C18017.class, new C12374());
        map2.put(C4279.class, new C17312());
        map.put(C7102.class, new C10963());
        map.put(C1457.class, new C23663());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8140 m50147(InterfaceC23331 interfaceC23331) {
        Class<?> cls = interfaceC23331.getClass();
        InterfaceC8140 interfaceC8140 = (InterfaceC8140) f73721.get(cls);
        if (interfaceC8140 != null) {
            return interfaceC8140;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18723 m50148() {
        InterfaceC18723 interfaceC18723 = (InterfaceC18723) f73720.get(C21545.class);
        if (interfaceC18723 != null) {
            return interfaceC18723;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + C21545.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m50146(byte[] bArr, InterfaceC18723 interfaceC18723) {
        return new C5691(bArr, interfaceC18723);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50149(C7102 c7102, C19240 c19240) {
        c19240.m27381((byte) 0);
        c19240.m27383(7, new byte[]{0, 0, 0, 0, 0, 0, 0});
        c19240.m27392(0L);
        c19240.m27398(((long) c7102.m18977()) * 2);
        byte[] bytes = c7102.m18976().getBytes(C7393.f24570);
        c19240.m27383(bytes.length, bytes);
    }
}
