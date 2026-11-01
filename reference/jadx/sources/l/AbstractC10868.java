package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10868 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f36954;

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC16512 mo1799(EnumC17217 enumC17217);

    public AbstractC10868(AbstractC20745 abstractC20745) {
        this.f36954 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۬ */
    public C5928 mo8394() {
        throw m27227(EnumC17217.STAT, null);
    }

    /* JADX INFO: renamed from: ᩹ */
    public List mo8397() throws C20040 {
        throw m27227(EnumC17217.LIST, null);
    }

    /* JADX INFO: renamed from: ֨ */
    public List mo8389() {
        return mo8397();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo27226(C5928 c5928) {
        return mo8389();
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo8393() throws C20040 {
        throw m27227(EnumC17217.CREATE_FILE_EXCLUSIVE, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo27228() throws C20040 {
        C5928 c5928Mo8394 = mo8394();
        if (c5928Mo8394.m16196() == EnumC12279.MISSING) {
            return true;
        }
        if (c5928Mo8394.m16196() != EnumC12279.REGULAR || mo1799(EnumC17217.DELETE_FILE_OR_LINK) == EnumC16512.UNSUPPORTED) {
            return false;
        }
        mo8392();
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo8395() throws C20040 {
        throw m27227(EnumC17217.CREATE_DIRECTORY_SINGLE, null);
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo8392() throws C20040 {
        throw m27227(EnumC17217.DELETE_FILE_OR_LINK, null);
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo8390() throws C20040 {
        throw m27227(EnumC17217.DELETE_EMPTY_DIRECTORY, null);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8391(AbstractC20745 abstractC20745) throws C20040 {
        throw m27227(EnumC17217.RENAME_NO_REPLACE, abstractC20745.mo33986());
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo8396(AbstractC20745 abstractC20745) throws C20040 {
        throw m27227(EnumC17217.REPLACE, abstractC20745.mo33986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20040 m27227(EnumC17217 enumC17217, String str) {
        return C20040.m45396(enumC17217, this.f36954.mo33986(), str);
    }
}
