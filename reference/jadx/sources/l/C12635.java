package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12635 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17573 f42214;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12260 f42215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f42216;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4603 f42217;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        this.f42214.m40872(c2401.f9658, this.f42217, this.f42216, this.f42215, false);
        mo7248(c2401.f9659);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        this.f42214.m40872(c22179.f72546, this.f42217, this.f42216, this.f42215, true);
        m49334(c22179.f72547);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        C21825 c21825 = c18961.f61400;
        InterfaceC12260 interfaceC12260 = this.f42215;
        C17573 c17573 = this.f42214;
        c17573.m40872(c21825, this.f42217, this.f42216, interfaceC12260, false);
        Iterator it = c18961.f61401.iterator();
        while (it.hasNext()) {
            c17573.m40872((C21825) it.next(), this.f42217, this.f42216, this.f42215, false);
        }
        mo7248(c18961.f61402);
        m49334(c18961.f61399);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        mo7248(c23195.f75267);
        mo7248(c23195.f75266);
        m49334(c23195.f75269);
        mo7248(c23195.f75262);
        m49334(c23195.f75270);
        m49334(c23195.f75264);
        mo7248(c23195.f75265);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        InterfaceC12260 interfaceC12260 = this.f42215;
        this.f42215 = c6656;
        try {
            AbstractC23903 abstractC23903 = this.f42216;
            if (abstractC23903 != null && abstractC23903.f77452 == EnumC10477.f35878) {
                mo7248(c6656.f22476);
                mo7248(c6656.f22477);
            }
            mo7248(c6656.f22481);
        } finally {
            this.f42215 = interfaceC12260;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        mo7248(c8378.f29093);
        m49334(c8378.f29096);
        if (c8378.f29098 == null) {
            mo7248(c8378.f29095);
        }
        m49334(c8378.f29099);
    }

    public C12635(C17573 c17573, C4603 c4603, AbstractC23903 abstractC23903, InterfaceC12260 interfaceC12260) {
        this.f42214 = c17573;
        this.f42217 = c4603;
        this.f42216 = abstractC23903;
        this.f42215 = interfaceC12260;
    }
}
