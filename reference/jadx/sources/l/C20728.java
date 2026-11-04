package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VN */
/* JADX INFO: loaded from: classes5.dex */
public class C20728 extends C20048 implements InterfaceC5066, InterfaceC1425, InterfaceC11252 {
    public static final long serialVersionUID = 484863569441792249L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f66416;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Map f66417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f66418;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66419;

    public C20728() {
    }

    public C20728(String str, Exception exc) {
        super(str, exc);
        this.f66419 = -1073741823;
    }

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < 71; i++) {
            map.put(Integer.valueOf(InterfaceC5066.f17652[i]), InterfaceC5066.f17651[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < 41; i2++) {
            int[][] iArr = InterfaceC1425.f5015;
            map2.put(Integer.valueOf(iArr[i2][0]), Integer.valueOf(iArr[i2][1]));
            String str = (String) map.get(Integer.valueOf(iArr[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(iArr[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f66417 = C4681.unmodifiableMap(map);
        f66418 = C4681.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            map3.put(Integer.valueOf(InterfaceC11252.f35529[i3]), InterfaceC11252.f35528[i3]);
        }
        f66416 = C4681.unmodifiableMap(map3);
    }

    public C20728(String str) {
        super(str);
        this.f66419 = -1073741823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47405(int i) {
        String str = (String) f66417.get(Integer.valueOf(i));
        return str == null ? "0x".concat(C6033.m17503(i, 8)) : str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47407(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(i);
        Map map = f66418;
        if (map.containsKey(numValueOf)) {
            return ((Integer) map.get(Integer.valueOf(i))).intValue();
        }
        return -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20728(int i, boolean z) {
        String strM47405;
        if (z) {
            strM47405 = (String) f66416.get(Integer.valueOf(i));
            if (strM47405 == null) {
                strM47405 = "W".concat(C6033.m17503(i, 8));
            }
        } else {
            strM47405 = m47405(i);
        }
        super(strM47405);
        this.f66419 = z ? i : m47407(i);
    }

    public C20728(int i) {
        super(m47405(i), null);
        this.f66419 = m47407(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47408() {
        return this.f66419;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20728 m47406(C20048 c20048) {
        if (c20048 instanceof C20728) {
            return (C20728) c20048;
        }
        return new C20728(c20048.getMessage(), c20048);
    }
}
