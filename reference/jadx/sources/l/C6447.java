package l;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6447 extends AbstractC11601 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18379 f21685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11601 f21686;

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15330 mo8788(EnumC5636 enumC5636) {
        C15243.m36590(enumC5636, "operation");
        EnumC15330 enumC15330Mo8788 = this.f21686.mo8788(enumC5636);
        C15243.m36591(enumC15330Mo8788, "capability(...)");
        return enumC15330Mo8788;
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final void mo8789(AbstractC22044 abstractC22044) throws C22790 {
        C18379 c18379 = this.f21685;
        C15243.m36590(abstractC22044, "target");
        EnumC5636 enumC5636 = EnumC5636.RENAME_NO_REPLACE;
        m18237(enumC5636, abstractC22044.mo4294());
        AbstractC22044 abstractC22044M18236 = m18236(abstractC22044, enumC5636);
        String strMo4294 = abstractC22044.mo4294();
        try {
            this.f21686.mo8789(abstractC22044M18236);
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), strMo4294, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), strMo4294, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + (strMo4294 == null ? "" : " -> ".concat(strMo4294)), e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8795(AbstractC22044 abstractC22044) throws C22790 {
        C18379 c18379 = this.f21685;
        C15243.m36590(abstractC22044, "target");
        EnumC5636 enumC5636 = EnumC5636.REPLACE;
        m18237(enumC5636, abstractC22044.mo4294());
        AbstractC22044 abstractC22044M18236 = m18236(abstractC22044, enumC5636);
        String strMo4294 = abstractC22044.mo4294();
        try {
            this.f21686.mo8795(abstractC22044M18236);
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), strMo4294, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), strMo4294, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + (strMo4294 == null ? "" : " -> ".concat(strMo4294)), e2);
        }
    }

    public C6447(C18379 c18379, AbstractC22044 abstractC22044) {
        super(c18379);
        this.f21685 = c18379;
        this.f21686 = abstractC22044.mo4298();
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۚ */
    public final C1907 mo8790() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.STAT;
        m18237(enumC5636, null);
        try {
            C1907 c1907Mo8790 = this.f21686.mo8790();
            C15243.m36591(c1907Mo8790, "stat(...)");
            return m18234(c18379, c1907Mo8790);
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ܳ */
    public final List mo8792() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.LIST;
        m18237(enumC5636, null);
        try {
            List<C1907> listMo8792 = this.f21686.mo8792();
            C15243.m36591(listMo8792, "list(...)");
            ArrayList arrayList = new ArrayList(C7743.m21084((Iterable) listMo8792));
            for (C1907 c1907 : listMo8792) {
                C15243.m36586(c1907);
                AbstractC22044 abstractC22044M6565 = c1907.m6565();
                C15243.m36591(abstractC22044M6565, "getFile(...)");
                arrayList.add(m18234(m18235(c18379, abstractC22044M6565), c1907));
            }
            return arrayList;
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۫ */
    public final List mo14281() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.LIST;
        m18237(enumC5636, null);
        try {
            List<C1907> listMo14281 = this.f21686.mo14281();
            C15243.m36591(listMo14281, "listForMutation(...)");
            ArrayList arrayList = new ArrayList(C7743.m21084((Iterable) listMo14281));
            for (C1907 c1907 : listMo14281) {
                C15243.m36586(c1907);
                AbstractC22044 abstractC22044M6565 = c1907.m6565();
                C15243.m36591(abstractC22044M6565, "getFile(...)");
                arrayList.add(m18234(m18235(c18379, abstractC22044M6565), c1907));
            }
            return arrayList;
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۤ */
    public final void mo8791() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.CREATE_FILE_EXCLUSIVE;
        m18237(enumC5636, null);
        try {
            this.f21686.mo8791();
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8794() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.CREATE_DIRECTORY_SINGLE;
        m18237(enumC5636, null);
        try {
            this.f21686.mo8794();
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8793() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.DELETE_FILE_OR_LINK;
        m18237(enumC5636, null);
        try {
            this.f21686.mo8793();
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩸ */
    public final void mo8796() throws C22790 {
        C18379 c18379 = this.f21685;
        EnumC5636 enumC5636 = EnumC5636.DELETE_EMPTY_DIRECTORY;
        m18237(enumC5636, null);
        try {
            this.f21686.mo8796();
        } catch (C11118 e) {
            throw new C22790(enumC5636, EnumC10855.PERMISSION_DENIED, c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294(), e);
        } catch (C22790 e2) {
            throw new C22790(enumC5636, e2.m51409(), c18379.mo4294(), null, "Checked file operation " + enumC5636 + " failed for " + c18379.mo4294() + "", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final AbstractC22044 m18236(AbstractC22044 abstractC22044, EnumC5636 enumC5636) throws C22790 {
        C18379 c18379 = abstractC22044 instanceof C18379 ? (C18379) abstractC22044 : null;
        if (c18379 == null) {
            throw C22790.m51406(enumC5636, EnumC10855.CROSS_BACKEND, this.f21685.mo4294(), abstractC22044.mo4294());
        }
        AbstractC22044 abstractC22044M42878 = C18379.m42878(c18379);
        if (abstractC22044M42878 != null) {
            return abstractC22044M42878;
        }
        throw m29162(enumC5636, ((C18379) abstractC22044).mo4294());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18379 m18235(C18379 c18379, AbstractC22044 abstractC22044) throws C22790 {
        if (abstractC22044 instanceof C18379) {
            return (C18379) abstractC22044;
        }
        if (!(abstractC22044 instanceof C15593)) {
            throw C22790.m51406(EnumC5636.LIST, EnumC10855.IO_ERROR, c18379.mo4294(), (String) null);
        }
        C15593 c15593 = (C15593) abstractC22044;
        String name = c15593.getName();
        C18379 c183710 = new C18379(new File(c18379.f59885, name), C20196.m46451(c18379.f59880, "/", name), c18379.m42887());
        c183710.f59882 = c15593;
        return c183710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1907 m18234(AbstractC22044 abstractC22044, C1907 c1907) {
        return new C1907(abstractC22044, c1907.m6567(), c1907.m6566(), c1907.m6568(), c1907.m6569());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m18237(EnumC5636 enumC5636, String str) throws C22790 {
        if (mo8788(enumC5636) == EnumC15330.UNSUPPORTED) {
            throw m29162(enumC5636, str);
        }
    }
}
