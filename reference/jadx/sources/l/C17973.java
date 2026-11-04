package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17973 implements Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Comparator f58897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f58900;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6041 f58901;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f58902;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11260 f58904;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f58899 = new ArrayList(2);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f58903 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22813 f58898 = new C22813();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f58897.compare(this, (C17973) obj);
    }

    static {
        C16980.m40037(C17973.class);
        f58897 = C8627.thenComparingInt(C2661.comparingInt(new C3803()), new C24822(1));
    }

    public C17973(int i, int i2, C6041 c6041) {
        this.f58902 = i;
        this.f58900 = i2;
        this.f58901 = c6041;
        c6041.m17526(this);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m41954() {
        return this.f58902;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m41936() {
        return this.f58900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m41930() {
        return this.f58901;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m41939() {
        C18959 c18959 = this.f58901.f53443;
        if (c18959 != null && c18959.getType() == EnumC24203.PHI) {
            C18981 c18981 = (C18981) c18959;
            if (this.f58903 == null) {
                return Collections.singletonList(c18981);
            }
            ArrayList arrayList = new ArrayList(this.f58903.size() + 1);
            arrayList.add(c18981);
            arrayList.addAll(this.f58903);
            return arrayList;
        }
        ArrayList arrayList2 = this.f58903;
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18959 m41951() {
        return this.f58901.f53443;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m41953() {
        C18959 c18959 = this.f58901.f53443;
        return c18959 != null && c18959.getType() == EnumC24203.PHI;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41949(C6041 c6041) {
        C6041 c6042 = this.f58901;
        if (c6042 == null) {
            this.f58901 = c6041;
        } else if (c6042 != c6041) {
            c6042.m17522();
            this.f58901 = c6041;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList m41946() {
        return this.f58899;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m41952() {
        return this.f58899.size();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m41941() {
        if (m41942()) {
            return this.f58901.f976;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41942() {
        return this.f58901.mo17865(EnumC1763.IMMUTABLE_TYPE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41932(AbstractC1566 abstractC1566) {
        this.f58901.mo17866(EnumC1763.IMMUTABLE_TYPE);
        if (this.f58901.f976.equals(abstractC1566)) {
            return;
        }
        this.f58901.f976 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41948(AbstractC1566 abstractC1566) {
        AbstractC1566 abstractC1566M41941 = m41941();
        if (abstractC1566M41941 != null && !abstractC1566M41941.equals(abstractC1566)) {
            throw new C8597("Can't change immutable type " + abstractC1566M41941 + " to " + abstractC1566 + " for " + this);
        }
        this.f58898.m51444(abstractC1566);
        C11260 c11260 = this.f58904;
        if (c11260 != null) {
            c11260.m28508(abstractC1566);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41938(C6041 c6041) {
        if (c6041.m17530() != null) {
            c6041.m17530().m41933(c6041);
        }
        c6041.m17526(this);
        this.f58899.add(c6041);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41933(C6041 c6041) {
        C1170.removeIf(this.f58899, new C14243(0, c6041));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41935(C18981 c18981) {
        if (this.f58903 == null) {
            this.f58903 = new ArrayList(1);
        }
        this.f58903.add(c18981);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41950(C18981 c18981) {
        ArrayList arrayList = this.f58903;
        if (arrayList != null) {
            C1170.removeIf(arrayList, new C23941(0, c18981));
            if (this.f58903.isEmpty()) {
                this.f58903 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m41937() {
        this.f58903 = null;
        Iterator it = this.f58899.iterator();
        while (it.hasNext()) {
            C18959 c18959 = ((C6041) it.next()).f53443;
            if (c18959 != null && c18959.getType() == EnumC24203.PHI) {
                m41935((C18981) c18959);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18981 m41927() {
        ArrayList arrayList = this.f58903;
        if (arrayList == null || arrayList.size() != 1) {
            return null;
        }
        return (C18981) this.f58903.get(0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m41940() {
        ArrayList arrayList = this.f58903;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m41947() {
        ArrayList arrayList = this.f58903;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41931(String str) {
        if (str != null) {
            C11260 c11260 = this.f58904;
            if (c11260 == null) {
                throw new C8597("CodeVar not initialized for name set in SSAVar: " + this);
            }
            c11260.m28506(str);
        }
    }

    public final String getName() {
        C11260 c11260 = this.f58904;
        if (c11260 == null) {
            return null;
        }
        return c11260.m28513();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22813 m41943() {
        return this.f58898;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11260 m41945() {
        C11260 c11260 = this.f58904;
        if (c11260 != null) {
            return c11260;
        }
        throw new C8597("Code variable not set in " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41934(C11260 c11260) {
        this.f58904 = c11260;
        c11260.m28511(this);
        AbstractC1566 abstractC1566M41941 = m41941();
        if (abstractC1566M41941 != null) {
            c11260.m28508(abstractC1566M41941);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41944() {
        boolean zM41942 = m41942();
        C22813 c22813 = this.f58898;
        if (!zM41942) {
            AbstractC1566 abstractC1566 = AbstractC1566.f5420;
            c22813.m51444(abstractC1566);
            C11260 c11260 = this.f58904;
            if (c11260 != null) {
                c11260.m28508(abstractC1566);
            }
        }
        c22813.m51443().clear();
        this.f58904 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m41928() {
        return this.f58904 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashSet] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41929(C2551 c2551) {
        HashSet hashSet = new HashSet();
        ?? hashSet2 = Collections.EMPTY_SET;
        ArrayList arrayList = this.f58899;
        ArrayList<C6041> arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.add(this.f58901);
        arrayList2.addAll(arrayList);
        if (c2551.mo17867(C11457.f36003)) {
            hashSet2 = new HashSet();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C24466 c24466 = (C24466) ((C6041) it.next()).mo17862((InterfaceC2157) C11457.f36008);
                if (c24466 != null) {
                    hashSet2.add(c24466.m54716());
                    hashSet.add(c24466.m54717());
                }
            }
        }
        for (C6041 c6041 : arrayList2) {
            AbstractC1566 abstractC1566 = c6041.f976;
            if (abstractC1566.mo5564()) {
                hashSet.add(abstractC1566);
            }
            AbstractC1566 type = c6041.getType();
            if (type.mo5564()) {
                hashSet.add(type);
            }
        }
        StringBuilder sb = new StringBuilder("r");
        sb.append(this.f58902);
        sb.append('v');
        sb.append(this.f58900);
        if (!hashSet2.isEmpty()) {
            String str = (String) C1170.stream(hashSet2).sorted().collect(C2025.joining(", ", "[", "]"));
            sb.append(", names: ");
            sb.append(str);
        }
        if (!hashSet.isEmpty()) {
            String str2 = (String) C1170.stream(hashSet).map(new C20957(0)).sorted().collect(C2025.joining(", ", "[", "]"));
            sb.append(", types: ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17973)) {
            return false;
        }
        C17973 c17973 = (C17973) obj;
        return this.f58902 == c17973.f58902 && this.f58900 == c17973.f58900;
    }

    public final int hashCode() {
        return (this.f58902 * 31) + this.f58900;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m41926() {
        return "r" + this.f58902 + 'v' + this.f58900;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(m41926());
        String name = getName();
        int i = C12326.f39603;
        if (name == null || name.isEmpty()) {
            str = "";
        } else {
            str = " '" + getName() + "' ";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f58898.m51445());
        return sb.toString();
    }
}
