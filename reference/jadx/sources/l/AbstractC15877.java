package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15877 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51620;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51621;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51622;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51623;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51624;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51625;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap f51626;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51627;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AbstractC15877 f51628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13857 f51629;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f51630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC23337 f51631;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f51632;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC2671 mo6071(C1112 c1112);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC8637 mo6072(C2083 c2083);

    public /* synthetic */ AbstractC15877(EnumC23337 enumC23337, int i, EnumC13857 enumC13857, Set set, int i2) {
        this(enumC23337, i, enumC13857, set);
    }

    static {
        HashMap map = new HashMap();
        f51626 = map;
        EnumC23337 enumC23337 = EnumC23337.UNIVERSAL;
        EnumC13857 enumC13857 = EnumC13857.PRIMITIVE;
        C19607 c19607 = new C19607(enumC23337, 1, enumC13857);
        f51627 = c19607;
        C15131 c15131 = new C15131(enumC23337, 2, enumC13857);
        f51623 = c15131;
        EnumC13857 enumC13858 = EnumC13857.CONSTRUCTED;
        C12894 c12894 = new C12894(enumC23337, 3, enumC13857, EnumSet.of(enumC13857, enumC13858));
        C5437 c5437 = new C5437(enumC23337, 4, EnumSet.of(enumC13857, enumC13858));
        f51622 = c5437;
        C1708 c1708 = new C1708(enumC23337, 5, enumC13857);
        f51621 = c1708;
        C11402 c11402 = new C11402(enumC23337, 6, enumC13857);
        f51620 = c11402;
        C24829 c24829 = new C24829(enumC23337, 10, enumC13857);
        f51624 = c24829;
        C16623 c16623 = new C16623(enumC23337, 17, enumC13858);
        f51625 = c16623;
        C17369 c17369 = new C17369(enumC23337, 16, enumC13858);
        f51628 = c17369;
        map.put(1, c19607);
        map.put(2, c15131);
        map.put(3, c12894);
        map.put(4, c5437);
        map.put(5, c1708);
        map.put(6, c11402);
        map.put(10, c24829);
        map.put(17, c16623);
        map.put(16, c17369);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC15877(EnumC23337 enumC23337, int i, EnumSet enumSet) {
        EnumC13857 enumC13857 = EnumC13857.PRIMITIVE;
        this(enumC23337, i, enumSet.contains(enumC13857) ? enumC13857 : EnumC13857.CONSTRUCTED, enumSet);
    }

    public AbstractC15877(EnumC23337 enumC23337, int i, EnumC13857 enumC13857) {
        this(enumC23337, i, enumC13857, EnumSet.of(enumC13857));
    }

    public AbstractC15877(EnumC23337 enumC23337, int i, EnumC13857 enumC13857, Set set) {
        this.f51631 = enumC23337;
        this.f51632 = i;
        this.f51630 = set;
        this.f51629 = enumC13857;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15877 m37845(EnumC13857 enumC13857) {
        if (this.f51629 == enumC13857) {
            return this;
        }
        if (!this.f51630.contains(enumC13857)) {
            throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC13857));
        }
        return new C21845(this, this.f51631, this.f51632, enumC13857, this.f51630);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC15877 m37843(EnumC23337 enumC23337, int i) {
        int i2 = C22591.f73040[enumC23337.ordinal()];
        HashMap map = f51626;
        if (i2 == 1) {
            for (AbstractC15877 abstractC15877 : map.values()) {
                if (abstractC15877.f51632 == i && enumC23337 == abstractC15877.f51631) {
                    return abstractC15877;
                }
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            return new C10656(enumC23337, i, EnumSet.of(EnumC13857.PRIMITIVE, EnumC13857.CONSTRUCTED));
        }
        throw new C9382(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC23337, Integer.valueOf(i), map));
    }

    public final int hashCode() {
        return C17359.hash(this.f51631, Integer.valueOf(this.f51632), this.f51629);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37846() {
        return this.f51632;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC23337 m37847() {
        return this.f51631;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13857 m37844() {
        return this.f51629;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37848() {
        return this.f51629 == EnumC13857.CONSTRUCTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC15877 abstractC15877 = (AbstractC15877) obj;
            if (this.f51632 == abstractC15877.f51632 && this.f51631 == abstractC15877.f51631 && this.f51629 == abstractC15877.f51629) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "ASN1Tag[" + this.f51631 + "," + this.f51629 + "," + this.f51632 + ']';
    }
}
