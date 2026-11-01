package l;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩵ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q86R */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC19181 implements InterfaceC8598 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f61951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f61953;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f61954;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f61950 = new C21297("DOUBLE", 0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC19181[] f61952 = m44035();

    /* JADX INFO: renamed from: ۙ */
    public abstract /* synthetic */ Number mo20826(C5379 c5379);

    public EnumC19181(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC19181(String str, int i, C21297 c21297) {
        this(str, i);
    }

    public static EnumC19181 valueOf(String str) {
        return (EnumC19181) Enum.valueOf(EnumC19181.class, str);
    }

    public static EnumC19181[] values() {
        return (EnumC19181[]) f61952.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC19181[] m44035() {
        return new EnumC19181[]{f61950, f61953, f61951, f61954};
    }

    static {
        final String str = "LAZILY_PARSED_NUMBER";
        final int i = 1;
        f61953 = new EnumC19181(str, i) { // from class: l.ᩳۖ᩸
            {
                C21297 c21297 = null;
            }

            @Override // l.EnumC19181, l.InterfaceC8598
            /* JADX INFO: renamed from: ۙ */
            public Number mo20826(C5379 c5379) {
                return new C9304(c5379.m14922());
            }
        };
        final String str2 = "LONG_OR_DOUBLE";
        final int i2 = 2;
        f61951 = new EnumC19181(str2, i2) { // from class: l.ᩴۖ᩸
            {
                C21297 c21297 = null;
            }

            @Override // l.EnumC19181, l.InterfaceC8598
            /* JADX INFO: renamed from: ۙ */
            public Number mo20826(C5379 c5379) throws IOException {
                String strM14922 = c5379.m14922();
                if (strM14922.indexOf(46) >= 0) {
                    return m42848(strM14922, c5379);
                }
                try {
                    return Long.valueOf(Long.parseLong(strM14922));
                } catch (NumberFormatException unused) {
                    return m42848(strM14922, c5379);
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private Number m42848(String str3, C5379 c5379) throws C13141 {
                try {
                    Double dValueOf = Double.valueOf(str3);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || c5379.m14915()) {
                        return dValueOf;
                    }
                    throw new C13141("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c5379.m14928());
                } catch (NumberFormatException e) {
                    StringBuilder sbM30914 = C12441.m30914("Cannot parse ", str3, "; at path ");
                    sbM30914.append(c5379.m14928());
                    throw new C13537(sbM30914.toString(), e);
                }
            }
        };
        final String str3 = "BIG_DECIMAL";
        final int i3 = 3;
        f61954 = new EnumC19181(str3, i3) { // from class: l.۠ۖ᩸
            {
                C21297 c21297 = null;
            }

            @Override // l.EnumC19181, l.InterfaceC8598
            /* JADX INFO: renamed from: ۙ */
            public BigDecimal mo20826(C5379 c5379) throws IOException {
                String strM14922 = c5379.m14922();
                try {
                    return C12914.m31999(strM14922);
                } catch (NumberFormatException e) {
                    StringBuilder sbM30914 = C12441.m30914("Cannot parse ", strM14922, "; at path ");
                    sbM30914.append(c5379.m14928());
                    throw new C13537(sbM30914.toString(), e);
                }
            }
        };
    }
}
