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
/* JADX INFO: renamed from: l.ۗۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2970 {
    public static final EnumC2970 DISTINCT;
    public static final EnumC2970 ORDERED;
    public static final EnumC2970 SHORT_CIRCUIT;
    public static final EnumC2970 SIZED;
    public static final EnumC2970 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77959l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ EnumC2970[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static EnumC2970 valueOf(String str) {
        return (EnumC2970) Enum.valueOf(EnumC2970.class, str);
    }

    public static EnumC2970[] values() {
        return (EnumC2970[]) v.clone();
    }

    static {
        EnumC19905 enumC19905 = EnumC19905.SPLITERATOR;
        C5295 c5295C = C(enumC19905);
        EnumC19905 enumC19906 = EnumC19905.STREAM;
        c5295C.a(enumC19906);
        EnumC19905 enumC19907 = EnumC19905.OP;
        ((EnumMap) ((Map) c5295C.b)).put(enumC19907, 3);
        EnumC2970 enumC2970 = new EnumC2970("DISTINCT", 0, 0, c5295C);
        DISTINCT = enumC2970;
        C5295 c5295C2 = C(enumC19905);
        c5295C2.a(enumC19906);
        ((EnumMap) ((Map) c5295C2.b)).put(enumC19907, 3);
        EnumC2970 enumC2971 = new EnumC2970("SORTED", 1, 1, c5295C2);
        SORTED = enumC2971;
        C5295 c5295C3 = C(enumC19905);
        c5295C3.a(enumC19906);
        ((EnumMap) ((Map) c5295C3.b)).put(enumC19907, 3);
        EnumC19905 enumC19908 = EnumC19905.TERMINAL_OP;
        ((EnumMap) ((Map) c5295C3.b)).put(enumC19908, 2);
        EnumC19905 enumC19909 = EnumC19905.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) c5295C3.b)).put(enumC19909, 2);
        EnumC2970 enumC2972 = new EnumC2970("ORDERED", 2, 2, c5295C3);
        ORDERED = enumC2972;
        C5295 c5295C4 = C(enumC19905);
        c5295C4.a(enumC19906);
        ((EnumMap) ((Map) c5295C4.b)).put(enumC19907, 2);
        EnumC2970 enumC2973 = new EnumC2970("SIZED", 3, 3, c5295C4);
        SIZED = enumC2973;
        C5295 c5295C5 = C(enumC19907);
        c5295C5.a(enumC19908);
        int i2 = 0;
        EnumC2970 enumC2974 = new EnumC2970("SHORT_CIRCUIT", 4, 12, c5295C5);
        SHORT_CIRCUIT = enumC2974;
        v = new EnumC2970[]{enumC2970, enumC2971, enumC2972, enumC2973, enumC2974};
        f = m(enumC19905);
        g = m(enumC19906);
        h = m(enumC19907);
        m(enumC19908);
        m(enumC19909);
        for (EnumC2970 enumC2975 : values()) {
            i2 |= enumC2975.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        f77959l = i3 | i4;
        EnumC2970 enumC2976 = DISTINCT;
        m = enumC2976.c;
        n = enumC2976.d;
        EnumC2970 enumC2977 = SORTED;
        o = enumC2977.c;
        p = enumC2977.d;
        EnumC2970 enumC2978 = ORDERED;
        q = enumC2978.c;
        r = enumC2978.d;
        EnumC2970 enumC2979 = SIZED;
        s = enumC2979.c;
        t = enumC2979.d;
        u = SHORT_CIRCUIT.c;
    }

    public static C5295 C(EnumC19905 enumC19905) {
        C5295 c5295 = new C5295(15, new EnumMap(EnumC19905.class));
        c5295.a(enumC19905);
        return c5295;
    }

    public EnumC2970(String str, int i2, int i3, C5295 c5295) {
        super(str, i2);
        for (EnumC19905 enumC19905 : EnumC19905.values()) {
            C9735.putIfAbsent((Map) c5295.b, enumC19905, 0);
        }
        this.a = (Map) c5295.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public final boolean s(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int m(EnumC19905 enumC19905) {
        int iIntValue = 0;
        for (EnumC2970 enumC2970 : values()) {
            iIntValue |= ((Integer) enumC2970.a.get(enumC19905)).intValue() << enumC2970.b;
        }
        return iIntValue;
    }

    public static int l(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int n(InterfaceC20693 interfaceC20693) {
        int iCharacteristics = interfaceC20693.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || interfaceC20693.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
