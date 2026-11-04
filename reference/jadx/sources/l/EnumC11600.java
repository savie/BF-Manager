package l;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۧۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q86R */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC11600 implements InterfaceC25027 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f36423;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f36424;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f36427;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f36426 = new C15329("DOUBLE", 0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC11600[] f36425 = m29160();

    /* JADX INFO: renamed from: ۙ */
    public abstract /* synthetic */ Number mo6563(C4208 c4208);

    public EnumC11600(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC11600(String str, int i, C15329 c15329) {
        this(str, i);
    }

    public static EnumC11600 valueOf(String str) {
        return (EnumC11600) Enum.valueOf(EnumC11600.class, str);
    }

    public static EnumC11600[] values() {
        return (EnumC11600[]) f36425.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC11600[] m29160() {
        return new EnumC11600[]{f36426, f36423, f36424, f36427};
    }

    static {
        final String str = "LAZILY_PARSED_NUMBER";
        final int i = 1;
        f36423 = new EnumC11600(str, i) { // from class: l.۫ۨܽ
            {
                C15329 c15329 = null;
            }

            @Override // l.EnumC11600, l.InterfaceC25027
            /* JADX INFO: renamed from: ۙ */
            public Number mo6563(C4208 c4208) {
                return new C1160(c4208.m13453());
            }
        };
        final String str2 = "LONG_OR_DOUBLE";
        final int i2 = 2;
        f36424 = new EnumC11600(str2, i2) { // from class: l.ۚۨܽ
            {
                C15329 c15329 = null;
            }

            @Override // l.EnumC11600, l.InterfaceC25027
            /* JADX INFO: renamed from: ۙ */
            public Number mo6563(C4208 c4208) throws IOException {
                String strM13453 = c4208.m13453();
                if (strM13453.indexOf(46) >= 0) {
                    return m16615(strM13453, c4208);
                }
                try {
                    return Long.valueOf(Long.parseLong(strM13453));
                } catch (NumberFormatException unused) {
                    return m16615(strM13453, c4208);
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private Number m16615(String str3, C4208 c4208) throws C18378 {
                try {
                    Double dValueOf = Double.valueOf(str3);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || c4208.m13439()) {
                        return dValueOf;
                    }
                    throw new C18378("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c4208.m13451());
                } catch (NumberFormatException e) {
                    StringBuilder sbM51387 = C22783.m51387("Cannot parse ", str3, "; at path ");
                    sbM51387.append(c4208.m13451());
                    throw new C1401(sbM51387.toString(), e);
                }
            }
        };
        final String str3 = "BIG_DECIMAL";
        final int i3 = 3;
        f36427 = new EnumC11600(str3, i3) { // from class: l.֫ۨܽ
            {
                C15329 c15329 = null;
            }

            @Override // l.EnumC11600, l.InterfaceC25027
            /* JADX INFO: renamed from: ۙ */
            public BigDecimal mo6563(C4208 c4208) throws IOException {
                String strM13453 = c4208.m13453();
                try {
                    return C10680.m27228(strM13453);
                } catch (NumberFormatException e) {
                    StringBuilder sbM51387 = C22783.m51387("Cannot parse ", strM13453, "; at path ");
                    sbM51387.append(c4208.m13451());
                    throw new C1401(sbM51387.toString(), e);
                }
            }
        };
    }
}
