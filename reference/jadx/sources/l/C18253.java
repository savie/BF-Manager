package l;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import bin.mt.plus.Features3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ᩳ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18253 extends AbstractC10868 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15432 f58248;

    public C18253(C15432 c15432) {
        super(c15432);
        this.f58248 = c15432;
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final EnumC16512 mo1799(EnumC17217 enumC17217) {
        switch (C21781.f70565[enumC17217.ordinal()]) {
            case 1:
            case 2:
                return EnumC16512.SUPPORTED;
            case 3:
            case 4:
            case 5:
                return EnumC16512.ATOMIC;
            case 6:
            case 7:
            case 8:
                return EnumC16512.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۨ */
    public final void mo8393() throws C20040 {
        AbstractC20745 abstractC20745 = this.f36954;
        try {
            if (this.f58248.f50294.createNewFile()) {
            } else {
                throw C20040.m45395(EnumC17217.CREATE_FILE_EXCLUSIVE, EnumC15807.ALREADY_EXISTS, abstractC20745.mo33986(), (String) null);
            }
        } catch (SecurityException e) {
            throw m42442(EnumC17217.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (IOException e3) {
            throw C20040.m45394(EnumC17217.CREATE_FILE_EXCLUSIVE, abstractC20745.mo33986(), (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۬ */
    public final C5928 mo8394() {
        C15432 c15432 = this.f58248;
        return m42441(c15432, c15432.f50294);
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ᩹ */
    public final List mo8397() throws C20040 {
        AbstractC20745 abstractC20745 = this.f36954;
        C5928 c5928Mo8394 = mo8394();
        EnumC12279 enumC12279 = EnumC12279.DIRECTORY;
        EnumC17217 enumC17217 = EnumC17217.LIST;
        m42443(c5928Mo8394, enumC12279, enumC17217);
        try {
            File[] fileArrListFiles = this.f58248.f50294.listFiles();
            if (fileArrListFiles == null) {
                throw C20040.m45395(enumC17217, EnumC15807.IO_ERROR, abstractC20745.mo33986(), (String) null);
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                C5928 c5928M42441 = m42441(C5553.m15311(file), file);
                if (c5928M42441.m16196() != EnumC12279.MISSING) {
                    arrayList.add(c5928M42441);
                }
            }
            return arrayList;
        } catch (SecurityException e) {
            throw new C20040(EnumC17217.LIST, EnumC15807.PERMISSION_DENIED, abstractC20745.mo33986(), null, C17922.m41615(abstractC20745, new StringBuilder("Checked file operation LIST failed for ")), e);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ */
    public final void mo8395() throws C20040 {
        try {
            Os.mkdir(this.f58248.f50294.getPath(), SecP521R1Field.P16);
        } catch (ErrnoException e) {
            throw C20040.m45393(EnumC17217.CREATE_DIRECTORY_SINGLE, this.f36954.mo33986(), (String) null, e);
        } catch (SecurityException e2) {
            throw m42442(EnumC17217.CREATE_DIRECTORY_SINGLE, (String) null, e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۚ */
    public final void mo8392() throws C20040 {
        C5928 c5928Mo8394 = mo8394();
        EnumC12279 enumC12279M16196 = c5928Mo8394.m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 == enumC12279) {
            throw C20040.m45395(EnumC17217.DELETE_FILE_OR_LINK, EnumC15807.NOT_FOUND, abstractC20745.mo33986(), (String) null);
        }
        if (c5928Mo8394.m16196() != EnumC12279.REGULAR) {
            throw C20040.m45395(EnumC17217.DELETE_FILE_OR_LINK, EnumC15807.NOT_REGULAR_FILE, abstractC20745.mo33986(), (String) null);
        }
        try {
            Os.remove(this.f58248.f50294.getPath());
        } catch (ErrnoException e) {
            throw C20040.m45393(EnumC17217.DELETE_FILE_OR_LINK, abstractC20745.mo33986(), (String) null, e);
        } catch (SecurityException e2) {
            throw m42442(EnumC17217.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۖ */
    public final void mo8390() throws C20040 {
        m42443(mo8394(), EnumC12279.DIRECTORY, EnumC17217.DELETE_EMPTY_DIRECTORY);
        try {
            Os.remove(this.f58248.f50294.getPath());
        } catch (ErrnoException e) {
            throw C20040.m45393(EnumC17217.DELETE_EMPTY_DIRECTORY, this.f36954.mo33986(), (String) null, e);
        } catch (SecurityException e2) {
            throw m42442(EnumC17217.DELETE_EMPTY_DIRECTORY, (String) null, e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final void mo8391(AbstractC20745 abstractC20745) throws C20040 {
        EnumC17217 enumC17217 = EnumC17217.RENAME_NO_REPLACE;
        boolean zMo36912 = abstractC20745.mo36912();
        AbstractC20745 abstractC20746 = this.f36954;
        if (!zMo36912) {
            throw C20040.m45395(enumC17217, EnumC15807.CROSS_BACKEND, abstractC20746.mo33986(), abstractC20745.mo33986());
        }
        C15432 c15432Mo36913 = abstractC20745.mo36913();
        String strMo33986 = abstractC20745.mo33986();
        EnumC12279 enumC12279M16196 = mo8394().m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        if (enumC12279M16196 != enumC12279) {
            c15432Mo36913.getClass();
            if (new C18253(c15432Mo36913).mo8394().m16196() != enumC12279) {
                throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20746.mo33986(), abstractC20745.mo33986());
            }
            m42444(c15432Mo36913, enumC17217);
            return;
        }
        throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20746.mo33986(), strMo33986);
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ */
    public final void mo8396(AbstractC20745 abstractC20745) throws C20040 {
        EnumC17217 enumC17217 = EnumC17217.REPLACE;
        boolean zMo36912 = abstractC20745.mo36912();
        AbstractC20745 abstractC20746 = this.f36954;
        if (!zMo36912) {
            throw C20040.m45395(enumC17217, EnumC15807.CROSS_BACKEND, abstractC20746.mo33986(), abstractC20745.mo33986());
        }
        C15432 c15432Mo36913 = abstractC20745.mo36913();
        String strMo33986 = abstractC20745.mo33986();
        if (mo8394().m16196() != EnumC12279.MISSING) {
            m42444(c15432Mo36913, enumC17217);
            return;
        }
        throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20746.mo33986(), strMo33986);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42444(C15432 c15432, EnumC17217 enumC17217) throws C20040 {
        C15432 c15433 = this.f58248;
        long jM36914 = c15433.m36914(c15432);
        try {
            Os.rename(c15433.f50294.getPath(), c15432.f50294.getPath());
            File file = c15432.f50294;
            if (jM36914 < 0) {
                return;
            }
            try {
                if (file.setLastModified(jM36914)) {
                    return;
                }
                file.toString();
            } catch (RuntimeException unused) {
                C13638.toString(file);
            }
        } catch (ErrnoException e) {
            throw C20040.m45393(enumC17217, this.f36954.mo33986(), c15432.mo33986(), e);
        } catch (SecurityException e2) {
            throw m42442(enumC17217, c15432.mo33986(), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5928 m42441(AbstractC20745 abstractC20745, File file) throws C20040 {
        EnumC12279 enumC12279;
        try {
            long[] jArrM58 = Features3.m58(file.getPath());
            int i = OsConstants.S_IFMT & ((int) jArrM58[0]);
            if (i == OsConstants.S_IFREG) {
                enumC12279 = EnumC12279.REGULAR;
            } else {
                enumC12279 = i == OsConstants.S_IFDIR ? EnumC12279.DIRECTORY : EnumC12279.OTHER;
            }
            EnumC12279 enumC122710 = enumC12279;
            return new C5928(abstractC20745, enumC122710, enumC122710 == EnumC12279.DIRECTORY ? -1L : jArrM58[1], jArrM58[2], null);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.ENOENT) {
                return C5928.m16193(abstractC20745);
            }
            throw C20040.m45393(EnumC17217.STAT, abstractC20745.mo33986(), (String) null, e);
        } catch (SecurityException e2) {
            throw new C20040(EnumC17217.STAT, EnumC15807.PERMISSION_DENIED, abstractC20745.mo33986(), null, C17922.m41615(abstractC20745, new StringBuilder("Checked file operation STAT failed for ")), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42443(C5928 c5928, EnumC12279 enumC12279, EnumC17217 enumC17217) throws C20040 {
        EnumC15807 enumC15807;
        EnumC12279 enumC12279M16196 = c5928.m16196();
        EnumC12279 enumC122710 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 == enumC122710) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20745.mo33986(), (String) null);
        }
        if (c5928.m16196() != enumC12279) {
            if (enumC12279 == EnumC12279.DIRECTORY) {
                enumC15807 = EnumC15807.NOT_DIRECTORY;
            } else {
                enumC15807 = EnumC15807.NOT_REGULAR_FILE;
            }
            throw C20040.m45395(enumC17217, enumC15807, abstractC20745.mo33986(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20040 m42442(EnumC17217 enumC17217, String str, SecurityException securityException) {
        EnumC15807 enumC15807 = EnumC15807.PERMISSION_DENIED;
        AbstractC20745 abstractC20745 = this.f36954;
        String strMo33986 = abstractC20745.mo33986();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC17217);
        sb.append(" failed for ");
        return new C20040(enumC17217, enumC15807, strMo33986, str, C17922.m41615(abstractC20745, sb), securityException);
    }
}
