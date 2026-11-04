package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11601 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f36428;

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC15330 mo8788(EnumC5636 enumC5636);

    public AbstractC11601(AbstractC22044 abstractC22044) {
        this.f36428 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۚ */
    public C1907 mo8790() throws C22790 {
        throw m29162(EnumC5636.STAT, null);
    }

    /* JADX INFO: renamed from: ܳ */
    public List mo8792() throws C22790 {
        throw m29162(EnumC5636.LIST, null);
    }

    /* JADX INFO: renamed from: ۫ */
    public List mo14281() {
        return mo8792();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo29161(C1907 c1907) {
        return mo14281();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo8791() throws C22790 {
        throw m29162(EnumC5636.CREATE_FILE_EXCLUSIVE, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo29163() throws C22790 {
        C1907 c1907Mo8790 = mo8790();
        if (c1907Mo8790.m6567() == EnumC13093.MISSING) {
            return true;
        }
        if (c1907Mo8790.m6567() != EnumC13093.REGULAR || mo8788(EnumC5636.DELETE_FILE_OR_LINK) == EnumC15330.UNSUPPORTED) {
            return false;
        }
        mo8793();
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo8794() throws C22790 {
        throw m29162(EnumC5636.CREATE_DIRECTORY_SINGLE, null);
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo8793() throws C22790 {
        throw m29162(EnumC5636.DELETE_FILE_OR_LINK, null);
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo8796() throws C22790 {
        throw m29162(EnumC5636.DELETE_EMPTY_DIRECTORY, null);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8789(AbstractC22044 abstractC22044) throws C22790 {
        throw m29162(EnumC5636.RENAME_NO_REPLACE, abstractC22044.mo4294());
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo8795(AbstractC22044 abstractC22044) throws C22790 {
        throw m29162(EnumC5636.REPLACE, abstractC22044.mo4294());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22790 m29162(EnumC5636 enumC5636, String str) {
        return C22790.m51407(enumC5636, this.f36428.mo4294(), str);
    }
}
