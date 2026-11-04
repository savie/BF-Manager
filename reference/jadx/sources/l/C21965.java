package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6BO */
/* JADX INFO: loaded from: classes.dex */
public final class C21965 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f70895;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f70896;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f70897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f70898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f70899;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1345 f70900;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f70901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f70902;

    public C21965(C1345 c1345, String str, List list, AbstractC1566 abstractC1566) {
        this.f70897 = str;
        this.f70899 = str;
        this.f70900 = c1345;
        this.f70902 = list;
        this.f70898 = abstractC1566;
        String strM49690 = m49690(str, list, abstractC1566);
        this.f70896 = strM49690;
        this.f70901 = c1345.m4972() + '.' + strM49690;
        this.f70895 = (c1345.hashCode() * 31) + strM49690.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21965 m49693(C1610 c1610, InterfaceC13890 interfaceC13890) {
        C21965 c21965M14834;
        C4811 c4811M5678 = c1610.m5678();
        int iMo33835 = interfaceC13890.mo33835();
        if (iMo33835 != 0 && (c21965M14834 = c4811M5678.m14834(iMo33835)) != null) {
            return c21965M14834;
        }
        interfaceC13890.mo33834();
        C21965 c21965M14835 = c4811M5678.m14835(new C21965(C1345.m4955(c1610, AbstractC1566.m5535(interfaceC13890.mo33836())), interfaceC13890.getName(), C4123.m13226(interfaceC13890.mo11554(), new C3398(5)), AbstractC1566.m5535(interfaceC13890.mo11553())));
        if (iMo33835 != 0) {
            c4811M5678.m14836(iMo33835, c21965M14835);
        }
        return c21965M14835;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21965 m49691(C1610 c1610, C1345 c1345, String str, List list, AbstractC1566 abstractC1566) {
        return c1610.m5678().m14835(new C21965(c1345, str, list, abstractC1566));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21965 m49692(C1610 c1610, C1345 c1345, String str, InterfaceC7179 interfaceC7179) {
        return m49691(c1610, c1345, str, C4123.m13226(interfaceC7179.mo11554(), new C3398(5)), AbstractC1566.m5535(interfaceC7179.mo11553()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49697(boolean z, boolean z2) {
        return m49690(z ? this.f70899 : this.f70897, this.f70902, z2 ? this.f70898 : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49690(String str, List list, AbstractC1566 abstractC1566) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(C15186.m36535((AbstractC1566) it.next()));
        }
        sb.append(')');
        if (abstractC1566 != null) {
            sb.append(C15186.m36535(abstractC1566));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49704(C21965 c21965) {
        return this.f70902.size() == c21965.f70902.size() && this.f70897.equals(c21965.f70897) && !C17359.equals(this.f70896, c21965.f70896);
    }

    public final String getName() {
        return this.f70897;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m49699() {
        return this.f70900.m4957() + '.' + this.f70897;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49694() {
        return this.f70900.m4957() + '.' + this.f70896;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m49707() {
        return this.f70901;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m49701() {
        return this.f70896;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1345 m49700() {
        return this.f70900;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m49698() {
        return this.f70898;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m49702() {
        return this.f70902;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m49705() {
        return this.f70902.size();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m49703() {
        return this.f70897.equals("<init>");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m49706() {
        return this.f70897.equals("<clinit>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49696() {
        return this.f70899;
    }

    public final int hashCode() {
        return this.f70895;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21965)) {
            return false;
        }
        C21965 c21965 = (C21965) obj;
        return this.f70896.equals(c21965.f70896) && this.f70900.equals(c21965.f70900);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C21965 c21965) {
        int iM4958 = this.f70900.compareTo(c21965.f70900);
        return iM4958 != 0 ? iM4958 : this.f70896.compareTo(c21965.f70896);
    }

    public final String toString() {
        return this.f70900.m4957() + '.' + this.f70897 + '(' + C4123.m13221(this.f70902, ", ") + "):" + this.f70898;
    }
}
