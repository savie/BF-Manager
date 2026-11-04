package l;

/* JADX INFO: renamed from: l.᩷ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O60F */
/* JADX INFO: loaded from: classes.dex */
public final class C21885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23754 f69737;

    static {
        C9449 c9449 = new C9449();
        c9449.m24829((Integer) 0, "static-put");
        c9449.m24829((Integer) 1, "static-get");
        c9449.m24829((Integer) 2, "instance-put");
        c9449.m24829((Integer) 3, "instance-get");
        c9449.m24829((Integer) 4, "invoke-static");
        c9449.m24829((Integer) 5, "invoke-instance");
        c9449.m24829((Integer) 6, "invoke-constructor");
        c9449.m24829((Integer) 7, "invoke-direct");
        c9449.m24829((Integer) 8, "invoke-interface");
        f69737 = c9449.mo14570();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49574(int i) {
        String str = (String) f69737.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new C4731(null, "Invalid method handle type: %d", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49573(String str) {
        Integer num = (Integer) f69737.mo23396().get(str);
        if (num == null) {
            throw new C23044(null, "Invalid method handle type: %s", str);
        }
        return num.intValue();
    }
}
