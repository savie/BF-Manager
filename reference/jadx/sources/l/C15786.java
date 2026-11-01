package l;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15786 extends AbstractC10868 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17196 f51128;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC10868 f51129;

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final EnumC16512 mo1799(EnumC17217 enumC17217) {
        C13465.m32966(enumC17217, "operation");
        EnumC16512 enumC16512Mo1799 = this.f51129.mo1799(enumC17217);
        C13465.m32967(enumC16512Mo1799, "capability(...)");
        return enumC16512Mo1799;
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final void mo8391(AbstractC20745 abstractC20745) throws C20040 {
        C17196 c17196 = this.f51128;
        C13465.m32966(abstractC20745, "target");
        EnumC17217 enumC17217 = EnumC17217.RENAME_NO_REPLACE;
        m37546(enumC17217, abstractC20745.mo33986());
        AbstractC20745 abstractC20745M37545 = m37545(abstractC20745, enumC17217);
        String strMo33986 = abstractC20745.mo33986();
        try {
            this.f51129.mo8391(abstractC20745M37545);
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), strMo33986, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), strMo33986, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + (strMo33986 == null ? "" : " -> ".concat(strMo33986)), e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ */
    public final void mo8396(AbstractC20745 abstractC20745) throws C20040 {
        C17196 c17196 = this.f51128;
        C13465.m32966(abstractC20745, "target");
        EnumC17217 enumC17217 = EnumC17217.REPLACE;
        m37546(enumC17217, abstractC20745.mo33986());
        AbstractC20745 abstractC20745M37545 = m37545(abstractC20745, enumC17217);
        String strMo33986 = abstractC20745.mo33986();
        try {
            this.f51129.mo8396(abstractC20745M37545);
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), strMo33986, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), strMo33986, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + (strMo33986 == null ? "" : " -> ".concat(strMo33986)), e2);
        }
    }

    public C15786(C17196 c17196, AbstractC20745 abstractC20745) {
        super(c17196);
        this.f51128 = c17196;
        this.f51129 = abstractC20745.mo33989();
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۬ */
    public final C5928 mo8394() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.STAT;
        m37546(enumC17217, null);
        try {
            C5928 c5928Mo8394 = this.f51129.mo8394();
            C13465.m32967(c5928Mo8394, "stat(...)");
            return m37543(c17196, c5928Mo8394);
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ᩹ */
    public final List mo8397() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.LIST;
        m37546(enumC17217, null);
        try {
            List<C5928> listMo8397 = this.f51129.mo8397();
            C13465.m32967(listMo8397, "list(...)");
            ArrayList arrayList = new ArrayList(C4892.m13614((Iterable) listMo8397));
            for (C5928 c5928 : listMo8397) {
                C13465.m32962(c5928);
                AbstractC20745 abstractC20745M16195 = c5928.m16195();
                C13465.m32967(abstractC20745M16195, "getFile(...)");
                arrayList.add(m37543(m37544(c17196, abstractC20745M16195), c5928));
            }
            return arrayList;
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ֨ */
    public final List mo8389() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.LIST;
        m37546(enumC17217, null);
        try {
            List<C5928> listMo8389 = this.f51129.mo8389();
            C13465.m32967(listMo8389, "listForMutation(...)");
            ArrayList arrayList = new ArrayList(C4892.m13614((Iterable) listMo8389));
            for (C5928 c5928 : listMo8389) {
                C13465.m32962(c5928);
                AbstractC20745 abstractC20745M16195 = c5928.m16195();
                C13465.m32967(abstractC20745M16195, "getFile(...)");
                arrayList.add(m37543(m37544(c17196, abstractC20745M16195), c5928));
            }
            return arrayList;
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۨ */
    public final void mo8393() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.CREATE_FILE_EXCLUSIVE;
        m37546(enumC17217, null);
        try {
            this.f51129.mo8393();
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ */
    public final void mo8395() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.CREATE_DIRECTORY_SINGLE;
        m37546(enumC17217, null);
        try {
            this.f51129.mo8395();
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۚ */
    public final void mo8392() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.DELETE_FILE_OR_LINK;
        m37546(enumC17217, null);
        try {
            this.f51129.mo8392();
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۖ */
    public final void mo8390() throws C20040 {
        C17196 c17196 = this.f51128;
        EnumC17217 enumC17217 = EnumC17217.DELETE_EMPTY_DIRECTORY;
        m37546(enumC17217, null);
        try {
            this.f51129.mo8390();
        } catch (C5595 e) {
            throw new C20040(enumC17217, EnumC15807.PERMISSION_DENIED, c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986(), e);
        } catch (C20040 e2) {
            throw new C20040(enumC17217, e2.m45399(), c17196.mo33986(), null, "Checked file operation " + enumC17217 + " failed for " + c17196.mo33986() + "", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final AbstractC20745 m37545(AbstractC20745 abstractC20745, EnumC17217 enumC17217) throws C20040 {
        C17196 c17196 = abstractC20745 instanceof C17196 ? (C17196) abstractC20745 : null;
        if (c17196 == null) {
            throw C20040.m45395(enumC17217, EnumC15807.CROSS_BACKEND, this.f51128.mo33986(), abstractC20745.mo33986());
        }
        AbstractC20745 abstractC20745M40115 = C17196.m40115(c17196);
        if (abstractC20745M40115 != null) {
            return abstractC20745M40115;
        }
        throw m27227(enumC17217, ((C17196) abstractC20745).mo33986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17196 m37544(C17196 c17196, AbstractC20745 abstractC20745) throws C20040 {
        if (abstractC20745 instanceof C17196) {
            return (C17196) abstractC20745;
        }
        if (!(abstractC20745 instanceof C13357)) {
            throw C20040.m45395(EnumC17217.LIST, EnumC15807.IO_ERROR, c17196.mo33986(), (String) null);
        }
        C13357 c13357 = (C13357) abstractC20745;
        String name = c13357.getName();
        C17196 c17197 = new C17196(new File(c17196.f54832, name), C1679.m5594(c17196.f54829, "/", name), c17196.m40128());
        c17197.f54830 = c13357;
        return c17197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5928 m37543(AbstractC20745 abstractC20745, C5928 c5928) {
        return new C5928(abstractC20745, c5928.m16196(), c5928.m16197(), c5928.m16198(), c5928.m16194());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m37546(EnumC17217 enumC17217, String str) throws C20040 {
        if (mo1799(enumC17217) == EnumC16512.UNSUPPORTED) {
            throw m27227(enumC17217, str);
        }
    }
}
