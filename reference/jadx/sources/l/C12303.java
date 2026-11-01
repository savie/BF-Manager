package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VN */
/* JADX INFO: loaded from: classes4.dex */
public class C12303 extends C8484 implements InterfaceC22886, InterfaceC5246, InterfaceC10227 {
    public static final long serialVersionUID = 484863569441792249L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f41132;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f41133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f41134;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41135;

    public C12303() {
    }

    public C12303(String str, Exception exc) {
        super(str, exc);
        this.f41135 = -1073741823;
    }

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < 71; i++) {
            map.put(Integer.valueOf(InterfaceC22886.f74428[i]), InterfaceC22886.f74427[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < 41; i2++) {
            int[][] iArr = InterfaceC5246.f18178;
            map2.put(Integer.valueOf(iArr[i2][0]), Integer.valueOf(iArr[i2][1]));
            String str = (String) map.get(Integer.valueOf(iArr[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(iArr[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f41132 = C0561.unmodifiableMap(map);
        f41134 = C0561.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            map3.put(Integer.valueOf(InterfaceC10227.f34907[i3]), InterfaceC10227.f34906[i3]);
        }
        f41133 = C0561.unmodifiableMap(map3);
    }

    public C12303(String str) {
        super(str);
        this.f41135 = -1073741823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30558(int i) {
        String str = (String) f41132.get(Integer.valueOf(i));
        return str == null ? "0x".concat(C5993.m16280(i, 8)) : str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m30560(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(i);
        Map map = f41134;
        if (map.containsKey(numValueOf)) {
            return ((Integer) map.get(Integer.valueOf(i))).intValue();
        }
        return -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12303(int i, boolean z) {
        String strM30558;
        if (z) {
            strM30558 = (String) f41133.get(Integer.valueOf(i));
            if (strM30558 == null) {
                strM30558 = "W".concat(C5993.m16280(i, 8));
            }
        } else {
            strM30558 = m30558(i);
        }
        super(strM30558);
        this.f41135 = z ? i : m30560(i);
    }

    public C12303(int i) {
        super(m30558(i), null);
        this.f41135 = m30560(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30561() {
        return this.f41135;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12303 m30559(C8484 c8484) {
        if (c8484 instanceof C12303) {
            return (C12303) c8484;
        }
        return new C12303(c8484.getMessage(), c8484);
    }
}
