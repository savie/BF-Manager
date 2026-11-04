package l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6YB */
/* JADX INFO: loaded from: classes.dex */
public final class C25203 extends AbstractC11601 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC2082 f81437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f81438;

    public C25203(AbstractC2082 abstractC2082) {
        super(abstractC2082);
        this.f81437 = abstractC2082;
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15330 mo8788(EnumC5636 enumC5636) {
        if (m56184(this.f81437) && enumC5636 != EnumC5636.STAT && enumC5636 != EnumC5636.LIST) {
            return EnumC15330.UNSUPPORTED;
        }
        switch (C11776.f38049[enumC5636.ordinal()]) {
            case 1:
            case 2:
                return EnumC15330.SUPPORTED;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC15330.BEST_EFFORT;
            case 8:
                return EnumC15330.UNSUPPORTED;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۤ */
    public final void mo8791() throws C22790 {
        EnumC5636 enumC5636 = EnumC5636.CREATE_FILE_EXCLUSIVE;
        m56186(enumC5636);
        EnumC13093 enumC13093M6567 = mo8790().m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 != enumC13093) {
            throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22044.mo4294(), (String) null);
        }
        AbstractC2082 abstractC2082 = this.f81437;
        AbstractC2082 abstractC2082Mo7165 = abstractC2082.mo7165();
        File file = abstractC2082.f6914;
        if (abstractC2082Mo7165 == null) {
            throw m29162(enumC5636, (String) null);
        }
        m56182(new C25203(abstractC2082Mo7165).mo8790(), enumC5636);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C21576.m49091(), C23053.m51956(abstractC2082Mo7165.mo42888()), "*/*", file.getName());
            if (uriCreateDocument == null) {
                throw m56180(enumC5636, (String) null, (Exception) null);
            }
            this.f81438 = uriCreateDocument;
            abstractC2082.mo7464(uriCreateDocument, false);
            if (!C17359.equals(file.getName(), C20069.m46199(uriCreateDocument)) && !C17359.equals(file.getName(), C23053.m51954(uriCreateDocument))) {
                if (!DocumentsContract.deleteDocument(C21576.m49091(), uriCreateDocument)) {
                    throw m56180(enumC5636, (String) null, new IOException("Failed to clean up provider-renamed file"));
                }
                this.f81438 = null;
                throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22044.mo4294(), (String) null);
            }
            this.f81438 = null;
        } catch (SecurityException e) {
            throw m56181(EnumC5636.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m56180(EnumC5636.CREATE_FILE_EXCLUSIVE, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo29163() throws C22790 {
        if (this.f81438 == null) {
            return super.mo29163();
        }
        try {
            if (!DocumentsContract.deleteDocument(C21576.m49091(), this.f81438)) {
                return false;
            }
            this.f81438 = null;
            this.f81437.mo2952();
            return true;
        } catch (SecurityException e) {
            throw m56181(EnumC5636.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (Exception e2) {
            throw m56180(EnumC5636.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۚ */
    public final C1907 mo8790() throws C22790 {
        C1907 c1907Mo2936;
        AbstractC22044 abstractC22044 = this.f36428;
        AbstractC2082 abstractC2082 = this.f81437;
        ContentResolver contentResolverM49091 = C21576.m49091();
        try {
            if (!abstractC2082.mo2949()) {
                return C1907.m6564(abstractC22044);
            }
            Cursor cursorQuery = contentResolverM49091.query(C23053.m51956(abstractC2082.mo42888()), abstractC2082.mo2953(), null, null, null);
            try {
                if (cursorQuery == null) {
                    c1907Mo2936 = m56179();
                    if (cursorQuery != null) {
                    }
                    return c1907Mo2936;
                }
                C20069.m46193(cursorQuery);
                if (!cursorQuery.moveToFirst()) {
                    c1907Mo2936 = abstractC2082 instanceof C2170 ? m56179() : C1907.m6564(abstractC22044);
                } else {
                    c1907Mo2936 = abstractC2082.mo2936(cursorQuery);
                }
                cursorQuery.close();
                return c1907Mo2936;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e) {
            throw m56181(EnumC5636.STAT, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            C22790 c22790M56180 = m56180(EnumC5636.STAT, (String) null, e3);
            if (c22790M56180.m51409() == EnumC10855.NOT_FOUND) {
                return abstractC2082 instanceof C2170 ? m56179() : C1907.m6564(abstractC22044);
            }
            throw c22790M56180;
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final List mo29161(C1907 c1907) {
        if (c1907.m6565() != this.f81437) {
            throw new IllegalArgumentException("Directory snapshot belongs to another file");
        }
        return m56185(c1907);
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۫ */
    public final List mo14281() {
        return m56185(mo8790());
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ܳ */
    public final List mo8792() {
        return m56185(mo8790());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m56185(C1907 c1907) throws C22790 {
        AbstractC2082 abstractC2082 = this.f81437;
        EnumC5636 enumC5636 = EnumC5636.LIST;
        m56182(c1907, enumC5636);
        ContentResolver contentResolverM49091 = C21576.m49091();
        ArrayList arrayList = new ArrayList();
        try {
            Uri uriMo42888 = abstractC2082.mo42888();
            File file = abstractC2082.f6914;
            Cursor cursorQuery = contentResolverM49091.query(C23053.m51952(uriMo42888), abstractC2082.mo2935(), null, null, null);
            try {
                if (cursorQuery == null) {
                    throw m56180(enumC5636, (String) null, (Exception) null);
                }
                C20069.m46193(cursorQuery);
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string == null || string2 == null) {
                        throw m56180(EnumC5636.LIST, (String) null, (Exception) null);
                    }
                    String str = (String) C11392.putIfAbsent(map, string2, string);
                    if (str != null) {
                        if (!str.equals(string)) {
                            throw m56180(EnumC5636.LIST, (String) null, new IOException("Provider returned ambiguous child names"));
                        }
                    } else {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(abstractC2082.mo42888(), string);
                        C1907 c1907Mo2955 = ((AbstractC2082) abstractC2082.mo2939(new File(file, string2), uriBuildDocumentUriUsingTree, cursorQuery)).mo2955(cursorQuery);
                        abstractC2082.mo2940(new File(file, string2), uriBuildDocumentUriUsingTree, c1907Mo2955.m6567() == EnumC13093.DIRECTORY);
                        arrayList.add(c1907Mo2955);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e) {
            throw m56181(EnumC5636.LIST, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m56180(EnumC5636.LIST, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8794() throws C22790 {
        EnumC5636 enumC5636 = EnumC5636.CREATE_DIRECTORY_SINGLE;
        m56186(enumC5636);
        EnumC13093 enumC13093M6567 = mo8790().m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 != enumC13093) {
            throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22044.mo4294(), (String) null);
        }
        AbstractC2082 abstractC2082 = this.f81437;
        AbstractC2082 abstractC2082Mo7165 = abstractC2082.mo7165();
        File file = abstractC2082.f6914;
        if (abstractC2082Mo7165 == null) {
            throw m29162(enumC5636, (String) null);
        }
        m56182(new C25203(abstractC2082Mo7165).mo8790(), enumC5636);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C21576.m49091(), C23053.m51956(abstractC2082Mo7165.mo42888()), "vnd.android.document/directory", file.getName());
            if (uriCreateDocument == null) {
                throw m56180(enumC5636, (String) null, (Exception) null);
            }
            if (!C17359.equals(file.getName(), C20069.m46199(uriCreateDocument)) && !C17359.equals(file.getName(), C23053.m51954(uriCreateDocument))) {
                DocumentsContract.deleteDocument(C21576.m49091(), uriCreateDocument);
                throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22044.mo4294(), (String) null);
            }
            abstractC2082.mo7464(uriCreateDocument, true);
        } catch (SecurityException e) {
            throw m56181(EnumC5636.CREATE_DIRECTORY_SINGLE, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m56180(EnumC5636.CREATE_DIRECTORY_SINGLE, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8793() throws C22790 {
        AbstractC2082 abstractC2082 = this.f81437;
        EnumC5636 enumC5636 = EnumC5636.DELETE_FILE_OR_LINK;
        m56186(enumC5636);
        C1907 c1907Mo8790 = mo8790();
        EnumC13093 enumC13093M6567 = c1907Mo8790.m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 == enumC13093) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22044.mo4294(), (String) null);
        }
        if (c1907Mo8790.m6567() != EnumC13093.REGULAR && c1907Mo8790.m6567() != EnumC13093.LINK) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_REGULAR_FILE, abstractC22044.mo4294(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C21576.m49091(), C23053.m51956(abstractC2082.mo42888()))) {
                throw m56180(enumC5636, (String) null, (Exception) null);
            }
            abstractC2082.mo2952();
        } catch (SecurityException e) {
            throw m56181(EnumC5636.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m56180(EnumC5636.DELETE_FILE_OR_LINK, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩸ */
    public final void mo8796() throws C22790 {
        AbstractC2082 abstractC2082 = this.f81437;
        EnumC5636 enumC5636 = EnumC5636.DELETE_EMPTY_DIRECTORY;
        m56186(enumC5636);
        m56182(mo8790(), enumC5636);
        if (!m56185(mo8790()).isEmpty()) {
            throw C22790.m51406(enumC5636, EnumC10855.DIRECTORY_NOT_EMPTY, this.f36428.mo4294(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C21576.m49091(), C23053.m51956(abstractC2082.mo42888()))) {
                throw m56180(enumC5636, (String) null, (Exception) null);
            }
            abstractC2082.mo2952();
        } catch (SecurityException e) {
            throw m56181(EnumC5636.DELETE_EMPTY_DIRECTORY, (String) null, e);
        } catch (C22790 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m56180(EnumC5636.DELETE_EMPTY_DIRECTORY, (String) null, e3);
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final void mo8789(AbstractC22044 abstractC22044) throws C22790 {
        Uri uriMoveDocument;
        EnumC5636 enumC5636 = EnumC5636.RENAME_NO_REPLACE;
        m56186(enumC5636);
        boolean z = abstractC22044 instanceof AbstractC2082;
        AbstractC22044 abstractC22045 = this.f36428;
        if (z) {
            AbstractC2082 abstractC2082 = (AbstractC2082) abstractC22044;
            File file = abstractC2082.f6914;
            AbstractC2082 abstractC2083 = this.f81437;
            String strMo7167 = abstractC2083.mo7167();
            File file2 = abstractC2083.f6914;
            if (C17359.equals(strMo7167, abstractC2082.mo7167())) {
                if (m56184(abstractC2082)) {
                    throw m29162(enumC5636, file.getPath());
                }
                if (!C17359.equals(file2.getParent(), file.getParent()) && !C17359.equals(file2.getName(), file.getName())) {
                    throw m29162(enumC5636, file.getPath());
                }
                C1907 c1907Mo8790 = mo8790();
                EnumC13093 enumC13093M6567 = c1907Mo8790.m6567();
                EnumC13093 enumC13093 = EnumC13093.MISSING;
                if (enumC13093M6567 == enumC13093) {
                    throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22045.mo4294(), file.getPath());
                }
                if (new C25203(abstractC2082).mo8790().m6567() != enumC13093) {
                    throw C22790.m51406(enumC5636, EnumC10855.ALREADY_EXISTS, abstractC22045.mo4294(), file.getPath());
                }
                AbstractC2082 abstractC2082Mo7165 = abstractC2083.mo7165();
                AbstractC2082 abstractC2082Mo7166 = abstractC2082.mo7165();
                if (abstractC2082Mo7165 == null || abstractC2082Mo7166 == null || !C17359.equals(abstractC2082Mo7165.mo7167(), abstractC2082Mo7166.mo7167())) {
                    throw C22790.m51406(enumC5636, EnumC10855.CROSS_BACKEND, abstractC22045.mo4294(), file.getPath());
                }
                m56182(new C25203(abstractC2082Mo7166).mo8790(), enumC5636);
                ContentResolver contentResolverM49091 = C21576.m49091();
                Uri uriM51956 = C23053.m51956(abstractC2083.mo42888());
                try {
                    if (C17359.equals(file2.getParent(), file.getParent())) {
                        uriMoveDocument = DocumentsContract.renameDocument(contentResolverM49091, uriM51956, file.getName());
                        m56183(enumC5636, uriMoveDocument, file.getName(), ((AbstractC2082) abstractC22044).f6914.getPath());
                    } else {
                        if (Build.VERSION.SDK_INT < 24) {
                            throw m29162(enumC5636, ((AbstractC2082) abstractC22044).f6914.getPath());
                        }
                        uriMoveDocument = DocumentsContract.moveDocument(contentResolverM49091, uriM51956, C23053.m51956(abstractC2082Mo7165.mo42888()), C23053.m51956(abstractC2082Mo7166.mo42888()));
                        m56183(enumC5636, uriMoveDocument, file.getName(), ((AbstractC2082) abstractC22044).f6914.getPath());
                    }
                    abstractC2083.mo2952();
                    abstractC2082.mo7464(uriMoveDocument, c1907Mo8790.m6567() == EnumC13093.DIRECTORY);
                    return;
                } catch (SecurityException e) {
                    throw m56181(EnumC5636.RENAME_NO_REPLACE, file.getPath(), e);
                } catch (UnsupportedOperationException unused) {
                    throw m29162(EnumC5636.RENAME_NO_REPLACE, file.getPath());
                } catch (C22790 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m56180(EnumC5636.RENAME_NO_REPLACE, file.getPath(), e3);
                }
            }
        }
        throw C22790.m51406(enumC5636, EnumC10855.CROSS_BACKEND, abstractC22045.mo4294(), abstractC22044.mo4294());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56183(EnumC5636 enumC5636, Uri uri, String str, String str2) throws C22790 {
        if (uri == null) {
            throw m56180(enumC5636, str2, (Exception) null);
        }
        if (!C17359.equals(str, C20069.m46199(uri)) && !C17359.equals(str, C23053.m51954(uri))) {
            throw m56180(enumC5636, str2, new IOException("Provider returned an unexpected document name"));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C1907 m56179() throws C22790 {
        AbstractC22044 abstractC22044 = this.f36428;
        AbstractC2082 abstractC2082 = this.f81437;
        AbstractC2082 abstractC2082Mo7165 = abstractC2082.mo7165();
        if (abstractC2082Mo7165 != null) {
            try {
                C25203 c25203 = new C25203(abstractC2082Mo7165);
                for (C1907 c1907 : c25203.m56185(c25203.mo8790())) {
                    if (abstractC22044.mo4294().equals(c1907.m6565().mo4294())) {
                        abstractC2082.mo7464(((AbstractC2082) c1907.m6565()).mo42888(), c1907.m6567() == EnumC13093.DIRECTORY);
                        return new C1907(this.f36428, c1907.m6567(), c1907.m6566(), c1907.m6568(), c1907.m6569());
                    }
                }
                return C1907.m6564(abstractC22044);
            } catch (C22790 e) {
                if (e.m51409() == EnumC10855.NOT_FOUND) {
                    return C1907.m6564(abstractC22044);
                }
                throw e;
            }
        }
        throw m56180(EnumC5636.STAT, (String) null, (Exception) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56184(AbstractC2082 abstractC2082) {
        if (!(abstractC2082 instanceof C0678)) {
            return false;
        }
        C0678 c0678 = (C0678) abstractC2082;
        return c0678.f7148 || c0678.m2956();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56186(EnumC5636 enumC5636) throws C22790 {
        if (m56184(this.f81437)) {
            throw m29162(enumC5636, (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56182(C1907 c1907, EnumC5636 enumC5636) throws C22790 {
        if (c1907.m6567() == EnumC13093.MISSING) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, c1907.m6565().mo4294(), (String) null);
        }
        if (c1907.m6567() != EnumC13093.DIRECTORY) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_DIRECTORY, c1907.m6565().mo4294(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22790 m56181(EnumC5636 enumC5636, String str, SecurityException securityException) {
        EnumC10855 enumC10855 = EnumC10855.PERMISSION_DENIED;
        AbstractC22044 abstractC22044 = this.f36428;
        String strMo4294 = abstractC22044.mo4294();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC5636);
        sb.append(" failed for ");
        return new C22790(enumC5636, enumC10855, strMo4294, str, C1402.m5125(abstractC22044, sb), securityException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22790 m56180(EnumC5636 enumC5636, String str, Exception exc) {
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC5636);
        sb.append(" failed for ");
        AbstractC22044 abstractC22044 = this.f36428;
        String strM5125 = C1402.m5125(abstractC22044, sb);
        if (exc == null) {
            return new C22790(enumC5636, EnumC10855.IO_ERROR, abstractC22044.mo4294(), str, strM5125);
        }
        if (!(exc instanceof IOException)) {
            return new C22790(enumC5636, EnumC10855.IO_ERROR, abstractC22044.mo4294(), str, strM5125, exc);
        }
        return C22790.m51405(enumC5636, abstractC22044.mo4294(), str, (IOException) exc);
    }
}
