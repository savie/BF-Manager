package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BB0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18884 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61299;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9012 f61300;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0985 f61301;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0063 f61302;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo18812();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18884 mo18813(C0063 c0063);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18884 mo14214(C0985 c0985);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8329(C15000 c15000);

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo8330();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo8331();

    /* JADX INFO: renamed from: ᩷ */
    public abstract AbstractC18884 mo8332(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20901 m43794(C9012 c9012, C20946 c20946, C20946 c20947) {
        C0985 c0985;
        boolean z = c20946.m47901() == 1;
        boolean zM15374 = c20946.getType().m15374();
        int iM47903 = c20946.m47903();
        if ((c20947.m47903() | iM47903) < 16) {
            if (zM15374) {
                c0985 = C9187.f29852;
            } else {
                c0985 = z ? C9187.f29862 : C9187.f29945;
            }
        } else if (iM47903 < 256) {
            if (zM15374) {
                c0985 = C9187.f29887;
            } else {
                c0985 = z ? C9187.f29812 : C9187.f29895;
            }
        } else if (zM15374) {
            c0985 = C9187.f29842;
        } else {
            c0985 = z ? C9187.f29802 : C9187.f29925;
        }
        return new C20901(c0985, c9012, C0063.m1031(c20946, c20947));
    }

    public AbstractC18884(C0985 c0985, C9012 c9012, C0063 c0063) {
        if (c0985 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c9012 == null) {
            throw new NullPointerException("position == null");
        }
        if (c0063 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f61299 = -1;
        this.f61301 = c0985;
        this.f61300 = c9012;
        this.f61302 = c0063;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m43807());
        sb.append(' ');
        sb.append(this.f61300);
        sb.append(": ");
        sb.append(this.f61301.m3864());
        C0063 c0063 = this.f61302;
        if (c0063.size() != 0) {
            sb.append(c0063.m31595(" ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String strMo18812 = mo18812();
        if (strMo18812 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo18812);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43801() {
        return this.f61299 >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m43804() {
        int i = this.f61299;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0985 m43802() {
        return this.f61301;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9012 m43799() {
        return this.f61300;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0063 m43795() {
        return this.f61302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18884 mo43797(C22985 c22985) {
        return mo18813(c22985.m49712(this.f61302));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC18884 m43800(BitSet bitSet) {
        return mo18813(this.f61302.m1037(this.f61301.m3865(), bitSet));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC18884 m43803() {
        return mo18813(this.f61302.m1037(this.f61301.m3865(), (BitSet) null));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20901 m43805(BitSet bitSet) {
        if (!this.f61301.m3865() || bitSet.get(0)) {
            return null;
        }
        C20946 c20946M31619get = this.f61302.m31619get(0);
        return m43794(this.f61300, c20946M31619get, c20946M31619get.m47899(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.֡֡ܺ, l.۫֨ܺ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.BitSet] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43806(BitSet bitSet) {
        ?? M3865 = this.f61301.m3865();
        ?? r1 = this.f61302;
        int size = r1.size();
        int iM47901 = 0;
        int iM47902 = (M3865 == 0 || bitSet.get(0)) ? 0 : r1.m31619get(0).m47901();
        while (M3865 < size) {
            if (!bitSet.get(M3865)) {
                iM47901 = r1.m31619get(M3865).m47901() + iM47901;
            }
            M3865++;
        }
        return Math.max(iM47901, iM47902);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8442 m43796(BitSet bitSet) {
        boolean z = bitSet.get(0);
        C0985 c0985 = this.f61301;
        if (c0985.m3865()) {
            bitSet.set(0);
        }
        C0063 c0063M1035 = this.f61302.m1035(bitSet);
        if (c0985.m3865()) {
            bitSet.set(0, z);
        }
        if (c0063M1035.size() == 0) {
            return null;
        }
        return new C8442(this.f61300, c0063M1035);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m43807() {
        int i = this.f61299;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : C5306.m15938(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43798(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f61299 = i;
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo37455() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ۤ */
    public String mo37450() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
