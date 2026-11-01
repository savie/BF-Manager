package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16579 extends AbstractC9855 implements InterfaceC9105, InterfaceC15767 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3794 f53221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f53222;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C14422 f53219 = new C22888();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C14422 f53218 = new C15127();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C14422 f53217 = new C21476();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean f53216 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C10394 f53220 = new C17948();

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֡ */
    public AbstractC16579 mo5593() {
        return this;
    }

    /* JADX INFO: renamed from: ֨ۙ */
    public boolean mo1926() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC16579 mo16234() {
        return this;
    }

    /* JADX INFO: renamed from: ۖۙ */
    public AbstractC16579 mo18112() {
        return null;
    }

    /* JADX INFO: renamed from: ۗ */
    public AbstractC16579 mo16235() {
        return null;
    }

    /* JADX INFO: renamed from: ۘۙ */
    public boolean mo9479() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC16579 mo1929(C3794 c3794);

    /* JADX INFO: renamed from: ۙۙ */
    public abstract EnumC6617 mo1933();

    /* JADX INFO: renamed from: ۛ */
    public AbstractC16579 mo1934() {
        return null;
    }

    /* JADX INFO: renamed from: ۜۙ */
    public boolean mo9480() {
        return false;
    }

    /* JADX INFO: renamed from: ۟ۙ */
    public boolean mo2034() {
        return false;
    }

    /* JADX INFO: renamed from: ۠ۙ */
    public boolean mo9481() {
        return false;
    }

    /* JADX INFO: renamed from: ۡۙ */
    public boolean mo1936() {
        return false;
    }

    /* JADX INFO: renamed from: ۤۙ */
    public boolean mo1937() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo39002() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public AbstractC16579 mo2035(AbstractC16579 abstractC16579) {
        return this;
    }

    /* JADX INFO: renamed from: ۫ */
    public Object mo24292() {
        return null;
    }

    /* JADX INFO: renamed from: ۬ۙ */
    public boolean mo2036() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo39006() {
        return this;
    }

    /* JADX INFO: renamed from: ܶۙ */
    public boolean mo1939() {
        return this instanceof C10188;
    }

    /* JADX INFO: renamed from: ܺۙ */
    public boolean mo2037() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo1940() {
    }

    /* JADX INFO: renamed from: ᩳۙ */
    public boolean mo1942() {
        return false;
    }

    /* JADX INFO: renamed from: ᩴۙ */
    public boolean mo14987() {
        return this instanceof C10229;
    }

    /* JADX INFO: renamed from: ᩵ۙ */
    public boolean mo9482() {
        return this instanceof C4583;
    }

    /* JADX INFO: renamed from: ᩶ۙ */
    public boolean mo2408() {
        return this instanceof C5289;
    }

    /* JADX INFO: renamed from: ᩷ۙ */
    public boolean mo9483() {
        return false;
    }

    /* JADX INFO: renamed from: ᩸ۙ */
    public boolean mo9484() {
        return false;
    }

    /* JADX INFO: renamed from: ᩹ۙ */
    public boolean mo12731() {
        return this instanceof C23594;
    }

    public AbstractC16579(AbstractC0618 abstractC0618, C3794 c3794) {
        C6171.m17171(c3794);
        this.f53222 = abstractC0618;
        this.f53221 = c3794;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3794 m39010() {
        return this.f53221;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12968 m38999(EnumC0972 enumC0972) {
        C3794 c3794 = this.f53221;
        if (c3794 != null) {
            return c3794.m11037(enumC0972);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo1941() {
        throw new AssertionError("Invalid pool entry");
    }

    @Override // l.InterfaceC15767
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18742(C23800 c23800) {
        return new C11100(this, c23800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39001(EnumC6617 enumC6617) {
        return enumC6617 == mo1933();
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo1767(obj, this);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1930(Object obj) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39009() {
        return this.f53221 == C3794.f13674 ? this : mo5593();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39003() {
        return mo2408() ? (AbstractC16579) mo1928(f53220, (Object) null) : this;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m39007() {
        return (AbstractC16579) mo1928(f53220, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo29058(C21825 c21825) {
        return mo1929(this.f53221.m11036(new C22140(c21825)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39000(StringBuilder sb, boolean z) {
        C22140 c22140 = (C22140) m38999(EnumC0972.ANNOTATIONS);
        if (c22140 == null || c22140.m49099().isEmpty()) {
            return;
        }
        if (z) {
            sb.append(" ");
        }
        sb.append(m39008());
        sb.append(" ");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21825 m39008() {
        C22140 c22140 = (C22140) m38999(EnumC0972.ANNOTATIONS);
        return c22140 == null ? C21825.m48588() : c22140.m49099();
    }

    public String toString() {
        AbstractC11242 abstractC11242;
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        AbstractC0618 abstractC0618 = this.f53222;
        if (abstractC0618 == null || (abstractC11242 = abstractC0618.f77453) == null) {
            sb.append("<none>");
        } else {
            sb.append(abstractC11242.toString());
        }
        if (f53216 && m39001(EnumC6617.TYPEVAR)) {
            sb.append(hashCode());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m38994(C21825 c21825) {
        if (c21825.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC16579) c21825.f70876).toString());
        while (true) {
            c21825 = c21825.f70877;
            if (c21825.m48595()) {
                sb.append(",");
                sb.append(((AbstractC16579) c21825.f70876).toString());
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ֡ۙ */
    public String mo9478() {
        Object objMo24292 = mo24292();
        C6171.m17171(objMo24292);
        return objMo24292.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39004(AbstractC16579 abstractC16579) {
        return m39009().equals(abstractC16579.m39009());
    }

    /* JADX INFO: renamed from: ۨۙ */
    public C21825 mo1938() {
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ۢ */
    public C21825 mo33523() {
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ܰۙ */
    public C21825 mo33524() {
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ᩷ */
    public C21825 mo1943() {
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m38998(C21825 c21825) {
        while (c21825.m48595()) {
            if (((AbstractC16579) c21825.f70876).mo1926()) {
                return true;
            }
            c21825 = c21825.f70877;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺ۙ */
    public boolean mo16236() {
        return (this.f53222.mo20276() & 512) != 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo1932(AbstractC16579 abstractC16579) {
        return abstractC16579.m39004(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38996(AbstractC16579 abstractC16579, C21825 c21825) {
        while (c21825.f70877 != null) {
            if (((AbstractC16579) c21825.f70876).mo1932(abstractC16579)) {
                return true;
            }
            c21825 = c21825.f70877;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39005(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            if (mo1932((AbstractC16579) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38997(C21825 c21825, C21825 c21826) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            if (((AbstractC16579) it.next()).m39005(c21826)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m38995(C21825 c21825, C2860 c2860) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) it.next();
            if (c2860.test(abstractC16579)) {
                c19003.m43723(abstractC16579);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ᩶ */
    public C13757 mo27295() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractC0618 mo33525() {
        return this.f53222;
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC19688 mo1931() {
        return EnumC19688.OTHER;
    }

    /* JADX INFO: renamed from: ۚۙ */
    public boolean mo30563() {
        return mo1936();
    }
}
