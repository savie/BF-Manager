package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14676 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47968;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47969;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47970;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47971;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47972;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47973;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static HashMap f47974;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47975;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final AbstractC14676 f47976;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f47977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19615 f47978;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set f47979;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f47980;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18203 mo2657(C9927 c9927);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18909 mo2658(C7343 c7343);

    public /* synthetic */ AbstractC14676(EnumC1974 enumC1974, int i, EnumC19615 enumC19615, Set set, int i2) {
        this(enumC1974, i, enumC19615, set);
    }

    static {
        HashMap map = new HashMap();
        f47974 = map;
        EnumC1974 enumC1974 = EnumC1974.UNIVERSAL;
        EnumC19615 enumC19615 = EnumC19615.PRIMITIVE;
        C16087 c16087 = new C16087(enumC1974, 1, enumC19615);
        f47970 = c16087;
        C20320 c20320 = new C20320(enumC1974, 2, enumC19615);
        f47968 = c20320;
        EnumC19615 enumC19616 = EnumC19615.CONSTRUCTED;
        C0563 c0563 = new C0563(enumC1974, 3, enumC19615, EnumSet.of(enumC19615, enumC19616));
        C16792 c16792 = new C16792(enumC1974, 4, EnumSet.of(enumC19615, enumC19616));
        f47971 = c16792;
        C12559 c12559 = new C12559(enumC1974, 5, enumC19615);
        f47972 = c12559;
        C17497 c17497 = new C17497(enumC1974, 6, enumC19615);
        f47969 = c17497;
        C6208 c6208 = new C6208(enumC1974, 10, enumC19615);
        f47975 = c6208;
        C11148 c11148 = new C11148(enumC1974, 17, enumC19616);
        f47973 = c11148;
        C23848 c23848 = new C23848(enumC1974, 16, enumC19616);
        f47976 = c23848;
        map.put(1, c16087);
        map.put(2, c20320);
        map.put(3, c0563);
        map.put(4, c16792);
        map.put(5, c12559);
        map.put(6, c17497);
        map.put(10, c6208);
        map.put(17, c11148);
        map.put(16, c23848);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC14676(EnumC1974 enumC1974, int i, EnumSet enumSet) {
        EnumC19615 enumC19615 = EnumC19615.PRIMITIVE;
        this(enumC1974, i, enumSet.contains(enumC19615) ? enumC19615 : EnumC19615.CONSTRUCTED, enumSet);
    }

    public AbstractC14676(EnumC1974 enumC1974, int i, EnumC19615 enumC19615) {
        this(enumC1974, i, enumC19615, EnumSet.of(enumC19615));
    }

    public AbstractC14676(EnumC1974 enumC1974, int i, EnumC19615 enumC19615, Set set) {
        this.f47980 = enumC1974;
        this.f47977 = i;
        this.f47979 = set;
        this.f47978 = enumC19615;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14676 m35210(EnumC19615 enumC19615) {
        if (this.f47978 == enumC19615) {
            return this;
        }
        if (!this.f47979.contains(enumC19615)) {
            throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC19615));
        }
        return new C10443(this, this.f47980, this.f47977, enumC19615, this.f47979);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14676 m35208(EnumC1974 enumC1974, int i) {
        int i2 = C21025.f68462[enumC1974.ordinal()];
        HashMap map = f47974;
        if (i2 == 1) {
            for (AbstractC14676 abstractC14676 : map.values()) {
                if (abstractC14676.f47977 == i && enumC1974 == abstractC14676.f47980) {
                    return abstractC14676;
                }
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            return new C7620(enumC1974, i, EnumSet.of(EnumC19615.PRIMITIVE, EnumC19615.CONSTRUCTED));
        }
        throw new C21731(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC1974, Integer.valueOf(i), map));
    }

    public final int hashCode() {
        return C13638.hash(this.f47980, Integer.valueOf(this.f47977), this.f47978);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35212() {
        return this.f47977;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 m35213() {
        return this.f47980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19615 m35211() {
        return this.f47978;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m35209() {
        return this.f47978 == EnumC19615.CONSTRUCTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC14676 abstractC14676 = (AbstractC14676) obj;
            if (this.f47977 == abstractC14676.f47977 && this.f47980 == abstractC14676.f47980 && this.f47978 == abstractC14676.f47978) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "ASN1Tag[" + this.f47980 + "," + this.f47978 + "," + this.f47977 + ']';
    }
}
