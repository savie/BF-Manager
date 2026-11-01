package l;

import com.alipay.sdk.m.w.a;

/* JADX INFO: renamed from: l.֡ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C0309 extends AbstractC16579 implements InterfaceC8399, InterfaceC7299 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f1653;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f1654;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C21825 f1655;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21825 f1657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21825 f1658;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21825 f1659;

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1937() {
        return true;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1939() {
        return true;
    }

    @Override // l.AbstractC16579, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo1941() {
        return 7;
    }

    @Override // l.InterfaceC8399
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC0618 mo1935() {
        return this.f53222;
    }

    public C0309(AbstractC0618 abstractC0618, AbstractC16579 abstractC16579, C21825 c21825) {
        this(abstractC16579, c21825, abstractC0618, C3794.f13674);
    }

    public C0309(AbstractC16579 abstractC16579, C21825 c21825, AbstractC0618 abstractC0618, C3794 c3794) {
        super(abstractC0618, c3794);
        this.f1656 = -1;
        this.f1653 = abstractC16579;
        this.f1655 = c21825;
        this.f1659 = null;
        this.f1654 = null;
        this.f1658 = null;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0309 mo1929(C3794 c3794) {
        return new C15833(this, this.f1653, this.f1655, this.f53222, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC6617 mo1933() {
        return EnumC6617.CLASS;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo1768(this, obj);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo1930(Object obj) {
        return new C20066(mo1934(), this.f1655, this.f53222, this.f53221, obj);
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!mo1934().m39001(EnumC6617.CLASS) || this.f53222.f77448.f77452 != EnumC10477.f35865) {
            m39000(sb, false);
            sb.append(m1924((AbstractC23903) this.f53222, true));
        } else {
            sb.append(mo1934().toString());
            sb.append(".");
            m39000(sb, false);
            sb.append(m1924((AbstractC23903) this.f53222, false));
        }
        if (mo1938().m48595()) {
            sb.append('<');
            sb.append(mo1938().m48590(","));
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m1924(AbstractC23903 abstractC23903, boolean z) {
        String strM46158;
        if (abstractC23903.f77453.isEmpty() && (abstractC23903.mo20276() & 16777216) != 0) {
            StringBuilder sb = new StringBuilder(this.f1654.toString());
            for (C21825 c21825 = this.f1658; c21825.m48595(); c21825 = c21825.f70877) {
                sb.append(a.p);
                sb.append(((AbstractC16579) c21825.f70876).toString());
            }
            return sb.toString();
        }
        if (!abstractC23903.f77453.isEmpty()) {
            return z ? abstractC23903.mo20270().toString() : abstractC23903.f77453.toString();
        }
        C0309 c0309 = (C0309) this.f53222.f77449;
        if (c0309 == null) {
            strM46158 = C20414.m46158("anonymous.class", null);
        } else {
            C21825 c21826 = c0309.f1658;
            strM46158 = (c21826 == null || !c21826.m48595()) ? C20414.m46158("anonymous.class", c0309.f1654) : C20414.m46158("anonymous.class", c0309.f1658.f70876);
        }
        if (!AbstractC16579.f53216) {
            return strM46158;
        }
        StringBuilder sbM23356 = C9023.m23356(strM46158);
        sbM23356.append(String.valueOf(abstractC23903.hashCode()));
        return sbM23356.toString();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C21825 mo1938() {
        if (this.f1655 == null) {
            mo1940();
            if (this.f1655 == null) {
                this.f1655 = C21825.m48588();
            }
        }
        return this.f1655;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo1934() {
        return this.f1653;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo1927(AbstractC16579 abstractC16579) {
        this.f1653 = abstractC16579;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21825 mo1943() {
        if (this.f1659 == null) {
            this.f1659 = mo1938().m48594(mo1934().mo1943());
        }
        return this.f1659;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1926() {
        if (mo1934().mo1926() || AbstractC16579.m38998(mo1938())) {
            return true;
        }
        AbstractC16579 abstractC16579 = this.f53222.f77449;
        return this != abstractC16579 && abstractC16579.mo1926();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1942() {
        return mo1943().f70877 != null;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1936() {
        AbstractC16579 abstractC16579 = this.f53222.f77449;
        return this != abstractC16579 && abstractC16579.mo1943().m48595() && mo1943().isEmpty();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1932(AbstractC16579 abstractC16579) {
        if (abstractC16579.m39004(this)) {
            return true;
        }
        if (mo1942() && (mo1934().mo1932(abstractC16579) || AbstractC16579.m38996(abstractC16579, mo1938()))) {
            return true;
        }
        if (mo12731()) {
            return this.f1654.mo1932(abstractC16579) || AbstractC16579.m38996(abstractC16579, this.f1658);
        }
        return false;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo1940() {
        this.f53222.mo49994();
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19688 mo1931() {
        this.f53222.m52718();
        return this.f53222.f77452 == EnumC10477.f35865 ? EnumC19688.DECLARED : EnumC19688.ERROR;
    }
}
