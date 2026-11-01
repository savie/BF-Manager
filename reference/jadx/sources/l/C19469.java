package l;

/* JADX INFO: renamed from: l.᩵۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O60F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19469 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21707 f62682;

    static {
        C17349 c17349 = new C17349();
        c17349.m40378((Integer) 0, "static-put");
        c17349.m40378((Integer) 1, "static-get");
        c17349.m40378((Integer) 2, "instance-put");
        c17349.m40378((Integer) 3, "instance-get");
        c17349.m40378((Integer) 4, "invoke-static");
        c17349.m40378((Integer) 5, "invoke-instance");
        c17349.m40378((Integer) 6, "invoke-constructor");
        c17349.m40378((Integer) 7, "invoke-direct");
        c17349.m40378((Integer) 8, "invoke-interface");
        f62682 = c17349.mo32742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44527(int i) {
        String str = (String) f62682.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new C8180(null, "Invalid method handle type: %d", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44526(String str) {
        Integer num = (Integer) f62682.mo27750().get(str);
        if (num == null) {
            throw new C20749(null, "Invalid method handle type: %s", str);
        }
        return num.intValue();
    }
}
