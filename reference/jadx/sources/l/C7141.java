package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7141 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayList f23873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f23874;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19136 f23875;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f23876;

    public C7141() {
        super(4, -1);
        this.f23875 = null;
        this.f23876 = null;
        this.f23873 = null;
        this.f23874 = null;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m19044() {
        return this.f23875 == null && this.f23876 == null && this.f23873 == null && this.f23874 == null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m19043() {
        return this.f23875 != null && this.f23876 == null && this.f23873 == null && this.f23874 == null;
    }

    public final int hashCode() {
        C19136 c19136 = this.f23875;
        if (c19136 == null) {
            return 0;
        }
        return c19136.hashCode();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ */
    public final int mo6990(AbstractC12432 abstractC12432) {
        if (!m19043()) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C19136 c19136 = this.f23875;
        C19136 c19137 = ((C7141) abstractC12432).f23875;
        if (c19136 == c19137) {
            c19136.getClass();
            return 0;
        }
        EnumC18075 enumC18075Mo4170 = c19136.mo4170();
        EnumC18075 enumC18075Mo4171 = c19137.mo4170();
        if (enumC18075Mo4170 != enumC18075Mo4171) {
            return enumC18075Mo4170.compareTo(enumC18075Mo4171);
        }
        return c19136.mo6990(c19137);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19038(C1661 c1661, C4669 c4669) {
        if (this.f23875 != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f23875 = new C19136(c1661, c4669);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19041(C23077 c23077, C1661 c1661, C4669 c4669) {
        if (this.f23876 == null) {
            this.f23876 = new ArrayList();
        }
        this.f23876.add(new C22309(c23077, new C19136(c1661, c4669)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19039(C20255 c20255, C1661 c1661, C4669 c4669) {
        if (this.f23873 == null) {
            this.f23873 = new ArrayList();
        }
        this.f23873.add(new C8904(c20255, new C19136(c1661, c4669)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19040(C20255 c20255, C9424 c9424, C4669 c4669) {
        if (this.f23874 == null) {
            this.f23874 = new ArrayList();
        }
        this.f23874.add(new C17370(c20255, c9424, c4669));
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C16665 c16665M12878 = c4669.m12878();
        C19136 c19136 = this.f23875;
        if (c19136 != null) {
            this.f23875 = (C19136) c16665M12878.m39130(c19136);
        }
        ArrayList arrayList = this.f23876;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C22309) it.next()).m49473(c4669);
            }
        }
        ArrayList arrayList2 = this.f23873;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C8904) it2.next()).m23165(c4669);
            }
        }
        ArrayList arrayList3 = this.f23874;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C17370) it3.next()).m40463(c4669);
            }
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        throw new RuntimeException("unsupported");
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo19042(C16665 c16665, int i) {
        m30903(((m19037(this.f23876) + m19037(this.f23873) + m19037(this.f23874)) * 8) + 16);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        C19136 c19136 = this.f23875;
        int iM30904 = c19136 == null ? 0 : c19136.m30904();
        int iM19037 = m19037(this.f23876);
        int iM19038 = m19037(this.f23873);
        int iM19039 = m19037(this.f23874);
        if (zM8288) {
            c2718.m8283(0, m30901() + " annotations directory");
            c2718.m8283(4, "  class_annotations_off: ".concat(C22475.m49978(iM30904)));
            c2718.m8283(4, "  fields_size:           ".concat(C22475.m49978(iM19037)));
            c2718.m8283(4, "  methods_size:          ".concat(C22475.m49978(iM19038)));
            c2718.m8283(4, "  parameters_size:       ".concat(C22475.m49978(iM19039)));
        }
        c2718.m8289(iM30904);
        c2718.m8289(iM19037);
        c2718.m8289(iM19038);
        c2718.m8289(iM19039);
        if (iM19037 != 0) {
            Collections.sort(this.f23876);
            if (zM8288) {
                c2718.m8283(0, "  fields:");
            }
            Iterator it = this.f23876.iterator();
            while (it.hasNext()) {
                ((C22309) it.next()).m49474(c4669, c2718);
            }
        }
        if (iM19038 != 0) {
            Collections.sort(this.f23873);
            if (zM8288) {
                c2718.m8283(0, "  methods:");
            }
            Iterator it2 = this.f23873.iterator();
            while (it2.hasNext()) {
                ((C8904) it2.next()).m23166(c4669, c2718);
            }
        }
        if (iM19039 != 0) {
            Collections.sort(this.f23874);
            if (zM8288) {
                c2718.m8283(0, "  parameters:");
            }
            Iterator it3 = this.f23874.iterator();
            while (it3.hasNext()) {
                ((C17370) it3.next()).m40464(c4669, c2718);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19037(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
