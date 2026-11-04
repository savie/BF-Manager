package l;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩶᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21614 {
    public static final EnumC21614 DISTINCT;
    public static final EnumC21614 ORDERED;
    public static final EnumC21614 SHORT_CIRCUIT;
    public static final EnumC21614 SIZED;
    public static final EnumC21614 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f82082l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ EnumC21614[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static EnumC21614 valueOf(String str) {
        return (EnumC21614) Enum.valueOf(EnumC21614.class, str);
    }

    public static EnumC21614[] values() {
        return (EnumC21614[]) v.clone();
    }

    static {
        EnumC17138 enumC17138 = EnumC17138.SPLITERATOR;
        C3249 c3249Z = z(enumC17138);
        EnumC17138 enumC17139 = EnumC17138.STREAM;
        c3249Z.a(enumC17139);
        EnumC17138 enumC171310 = EnumC17138.OP;
        ((EnumMap) ((Map) c3249Z.b)).put(enumC171310, 3);
        EnumC21614 enumC21614 = new EnumC21614("DISTINCT", 0, 0, c3249Z);
        DISTINCT = enumC21614;
        C3249 c3249Z2 = z(enumC17138);
        c3249Z2.a(enumC17139);
        ((EnumMap) ((Map) c3249Z2.b)).put(enumC171310, 3);
        EnumC21614 enumC21615 = new EnumC21614("SORTED", 1, 1, c3249Z2);
        SORTED = enumC21615;
        C3249 c3249Z3 = z(enumC17138);
        c3249Z3.a(enumC17139);
        ((EnumMap) ((Map) c3249Z3.b)).put(enumC171310, 3);
        EnumC17138 enumC171311 = EnumC17138.TERMINAL_OP;
        ((EnumMap) ((Map) c3249Z3.b)).put(enumC171311, 2);
        EnumC17138 enumC171312 = EnumC17138.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) c3249Z3.b)).put(enumC171312, 2);
        EnumC21614 enumC21616 = new EnumC21614("ORDERED", 2, 2, c3249Z3);
        ORDERED = enumC21616;
        C3249 c3249Z4 = z(enumC17138);
        c3249Z4.a(enumC17139);
        ((EnumMap) ((Map) c3249Z4.b)).put(enumC171310, 2);
        EnumC21614 enumC21617 = new EnumC21614("SIZED", 3, 3, c3249Z4);
        SIZED = enumC21617;
        C3249 c3249Z5 = z(enumC171310);
        c3249Z5.a(enumC171311);
        int i2 = 0;
        EnumC21614 enumC21618 = new EnumC21614("SHORT_CIRCUIT", 4, 12, c3249Z5);
        SHORT_CIRCUIT = enumC21618;
        v = new EnumC21614[]{enumC21614, enumC21615, enumC21616, enumC21617, enumC21618};
        f = j(enumC17138);
        g = j(enumC17139);
        h = j(enumC171310);
        j(enumC171311);
        j(enumC171312);
        for (EnumC21614 enumC21619 : values()) {
            i2 |= enumC21619.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        f82082l = i3 | i4;
        EnumC21614 enumC216110 = DISTINCT;
        m = enumC216110.c;
        n = enumC216110.d;
        EnumC21614 enumC216111 = SORTED;
        o = enumC216111.c;
        p = enumC216111.d;
        EnumC21614 enumC216112 = ORDERED;
        q = enumC216112.c;
        r = enumC216112.d;
        EnumC21614 enumC216113 = SIZED;
        s = enumC216113.c;
        t = enumC216113.d;
        u = SHORT_CIRCUIT.c;
    }

    public static C3249 z(EnumC17138 enumC17138) {
        C3249 c3249 = new C3249(16, new EnumMap(EnumC17138.class));
        c3249.a(enumC17138);
        return c3249;
    }

    public EnumC21614(String str, int i2, int i3, C3249 c3249) {
        super(str, i2);
        for (EnumC17138 enumC17138 : EnumC17138.values()) {
            C11392.putIfAbsent((Map) c3249.b, enumC17138, 0);
        }
        this.a = (Map) c3249.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public final boolean p(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int j(EnumC17138 enumC17138) {
        int iIntValue = 0;
        for (EnumC21614 enumC21614 : values()) {
            iIntValue |= ((Integer) enumC21614.a.get(enumC17138)).intValue() << enumC21614.b;
        }
        return iIntValue;
    }

    public static int i(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int k(InterfaceC8409 interfaceC8409) {
        int iCharacteristics = interfaceC8409.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || interfaceC8409.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
