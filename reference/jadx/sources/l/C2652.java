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

/* JADX INFO: renamed from: l.ۖۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2652 extends AbstractC11601 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1161 f8463;

    public C2652(C1161 c1161) {
        super(c1161);
        this.f8463 = c1161;
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15330 mo8788(EnumC5636 enumC5636) {
        switch (C9363.f30425[enumC5636.ordinal()]) {
            case 1:
            case 2:
                return EnumC15330.SUPPORTED;
            case 3:
            case 4:
            case 5:
                return EnumC15330.ATOMIC;
            case 6:
            case 7:
            case 8:
                return EnumC15330.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo8791() throws C22790 {
        AbstractC22044 abstractC22044 = this.f36428;
        try {
            if (this.f8463.f4288.createNewFile()) {
            } else {
                throw C22790.m51406(EnumC5636.CREATE_FILE_EXCLUSIVE, EnumC10855.ALREADY_EXISTS, abstractC22044.mo4294(), (String) null);
            }
        } catch (C22790 e) {
            throw e;
        } catch (IOException e2) {
            throw C22790.m51405(EnumC5636.CREATE_FILE_EXCLUSIVE, abstractC22044.mo4294(), (String) null, e2);
        } catch (SecurityException e3) {
            throw m8785(EnumC5636.CREATE_FILE_EXCLUSIVE, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1907 mo8790() {
        C1161 c1161 = this.f8463;
        return m8784(c1161, c1161.f4288);
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List mo8792() throws C22790 {
        AbstractC22044 abstractC22044 = this.f36428;
        C1907 c1907Mo8790 = mo8790();
        EnumC13093 enumC13093 = EnumC13093.DIRECTORY;
        EnumC5636 enumC5636 = EnumC5636.LIST;
        m8787(c1907Mo8790, enumC13093, enumC5636);
        try {
            File[] fileArrListFiles = this.f8463.f4288.listFiles();
            if (fileArrListFiles == null) {
                throw C22790.m51406(enumC5636, EnumC10855.IO_ERROR, abstractC22044.mo4294(), (String) null);
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                C1907 c1907M8784 = m8784(C14584.m35191(file), file);
                if (c1907M8784.m6567() != EnumC13093.MISSING) {
                    arrayList.add(c1907M8784);
                }
            }
            return arrayList;
        } catch (SecurityException e) {
            throw new C22790(EnumC5636.LIST, EnumC10855.PERMISSION_DENIED, abstractC22044.mo4294(), null, C1402.m5125(abstractC22044, new StringBuilder("Checked file operation LIST failed for ")), e);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8794() throws C22790 {
        try {
            Os.mkdir(this.f8463.f4288.getPath(), SecP521R1Field.P16);
        } catch (ErrnoException e) {
            throw C22790.m51404(EnumC5636.CREATE_DIRECTORY_SINGLE, this.f36428.mo4294(), (String) null, e);
        } catch (SecurityException e2) {
            throw m8785(EnumC5636.CREATE_DIRECTORY_SINGLE, (String) null, e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo8793() throws C22790 {
        C1907 c1907Mo8790 = mo8790();
        EnumC13093 enumC13093M6567 = c1907Mo8790.m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 == enumC13093) {
            throw C22790.m51406(EnumC5636.DELETE_FILE_OR_LINK, EnumC10855.NOT_FOUND, abstractC22044.mo4294(), (String) null);
        }
        if (c1907Mo8790.m6567() != EnumC13093.REGULAR) {
            throw C22790.m51406(EnumC5636.DELETE_FILE_OR_LINK, EnumC10855.NOT_REGULAR_FILE, abstractC22044.mo4294(), (String) null);
        }
        try {
            Os.remove(this.f8463.f4288.getPath());
        } catch (ErrnoException e) {
            throw C22790.m51404(EnumC5636.DELETE_FILE_OR_LINK, abstractC22044.mo4294(), (String) null, e);
        } catch (SecurityException e2) {
            throw m8785(EnumC5636.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo8796() throws C22790 {
        m8787(mo8790(), EnumC13093.DIRECTORY, EnumC5636.DELETE_EMPTY_DIRECTORY);
        try {
            Os.remove(this.f8463.f4288.getPath());
        } catch (ErrnoException e) {
            throw C22790.m51404(EnumC5636.DELETE_EMPTY_DIRECTORY, this.f36428.mo4294(), (String) null, e);
        } catch (SecurityException e2) {
            throw m8785(EnumC5636.DELETE_EMPTY_DIRECTORY, (String) null, e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8789(AbstractC22044 abstractC22044) throws C22790 {
        EnumC5636 enumC5636 = EnumC5636.RENAME_NO_REPLACE;
        boolean zMo4295 = abstractC22044.mo4295();
        AbstractC22044 abstractC22045 = this.f36428;
        if (!zMo4295) {
            throw C22790.m51406(enumC5636, EnumC10855.CROSS_BACKEND, abstractC22045.mo4294(), abstractC22044.mo4294());
        }
        C1161 c1161Mo4275 = abstractC22044.mo4275();
        String strMo4294 = abstractC22044.mo4294();
        EnumC13093 enumC13093M6567 = mo8790().m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        if (enumC13093M6567 != enumC13093) {
            c1161Mo4275.getClass();
            if (new C2652(c1161Mo4275).mo8790().m6567() != enumC13093) {
                throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22045.mo4294(), abstractC22044.mo4294());
            }
            m8786(c1161Mo4275, enumC5636);
            return;
        }
        throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22045.mo4294(), strMo4294);
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8795(AbstractC22044 abstractC22044) throws C22790 {
        EnumC5636 enumC5636 = EnumC5636.REPLACE;
        boolean zMo4295 = abstractC22044.mo4295();
        AbstractC22044 abstractC22045 = this.f36428;
        if (!zMo4295) {
            throw C22790.m51406(enumC5636, EnumC10855.CROSS_BACKEND, abstractC22045.mo4294(), abstractC22044.mo4294());
        }
        C1161 c1161Mo4275 = abstractC22044.mo4275();
        String strMo4294 = abstractC22044.mo4294();
        if (mo8790().m6567() != EnumC13093.MISSING) {
            m8786(c1161Mo4275, enumC5636);
            return;
        }
        throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22045.mo4294(), strMo4294);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8786(C1161 c1161, EnumC5636 enumC5636) throws C22790 {
        C1161 c1162 = this.f8463;
        long jM4288 = c1162.m4288(c1161);
        try {
            Os.rename(c1162.f4288.getPath(), c1161.f4288.getPath());
            File file = c1161.f4288;
            if (jM4288 < 0) {
                return;
            }
            try {
                if (file.setLastModified(jM4288)) {
                    return;
                }
                file.toString();
            } catch (RuntimeException unused) {
                C17359.toString(file);
            }
        } catch (ErrnoException e) {
            throw C22790.m51404(enumC5636, this.f36428.mo4294(), c1161.mo4294(), e);
        } catch (SecurityException e2) {
            throw m8785(enumC5636, c1161.mo4294(), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1907 m8784(AbstractC22044 abstractC22044, File file) throws C22790 {
        EnumC13093 enumC13093;
        try {
            long[] jArrM47 = Features3.m47(file.getPath());
            int i = OsConstants.S_IFMT & ((int) jArrM47[0]);
            if (i == OsConstants.S_IFREG) {
                enumC13093 = EnumC13093.REGULAR;
            } else {
                enumC13093 = i == OsConstants.S_IFDIR ? EnumC13093.DIRECTORY : EnumC13093.OTHER;
            }
            EnumC13093 enumC13094 = enumC13093;
            return new C1907(abstractC22044, enumC13094, enumC13094 == EnumC13093.DIRECTORY ? -1L : jArrM47[1], jArrM47[2], null);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.ENOENT) {
                return C1907.m6564(abstractC22044);
            }
            throw C22790.m51404(EnumC5636.STAT, abstractC22044.mo4294(), (String) null, e);
        } catch (SecurityException e2) {
            throw new C22790(EnumC5636.STAT, EnumC10855.PERMISSION_DENIED, abstractC22044.mo4294(), null, C1402.m5125(abstractC22044, new StringBuilder("Checked file operation STAT failed for ")), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8787(C1907 c1907, EnumC13093 enumC13093, EnumC5636 enumC5636) throws C22790 {
        EnumC10855 enumC10855;
        EnumC13093 enumC13093M6567 = c1907.m6567();
        EnumC13093 enumC13094 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 == enumC13094) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22044.mo4294(), (String) null);
        }
        if (c1907.m6567() != enumC13093) {
            if (enumC13093 == EnumC13093.DIRECTORY) {
                enumC10855 = EnumC10855.NOT_DIRECTORY;
            } else {
                enumC10855 = EnumC10855.NOT_REGULAR_FILE;
            }
            throw C22790.m51406(enumC5636, enumC10855, abstractC22044.mo4294(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22790 m8785(EnumC5636 enumC5636, String str, SecurityException securityException) {
        EnumC10855 enumC10855 = EnumC10855.PERMISSION_DENIED;
        AbstractC22044 abstractC22044 = this.f36428;
        String strMo4294 = abstractC22044.mo4294();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC5636);
        sb.append(" failed for ");
        return new C22790(enumC5636, enumC10855, strMo4294, str, C1402.m5125(abstractC22044, sb), securityException);
    }
}
