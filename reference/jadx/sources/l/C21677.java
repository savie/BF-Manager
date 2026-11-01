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

/* JADX INFO: renamed from: l.᩸ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21677 extends AbstractC10868 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23089 f70307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Uri f70308;

    public C21677(AbstractC23089 abstractC23089) {
        super(abstractC23089);
        this.f70307 = abstractC23089;
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final EnumC16512 mo1799(EnumC17217 enumC17217) {
        if (m48416(this.f70307) && enumC17217 != EnumC17217.STAT && enumC17217 != EnumC17217.LIST) {
            return EnumC16512.UNSUPPORTED;
        }
        switch (C15328.f49925[enumC17217.ordinal()]) {
            case 1:
            case 2:
                return EnumC16512.SUPPORTED;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC16512.BEST_EFFORT;
            case 8:
                return EnumC16512.UNSUPPORTED;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۨ */
    public final void mo8393() throws C20040 {
        EnumC17217 enumC17217 = EnumC17217.CREATE_FILE_EXCLUSIVE;
        m48418(enumC17217);
        EnumC12279 enumC12279M16196 = mo8394().m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 != enumC12279) {
            throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20745.mo33986(), (String) null);
        }
        AbstractC23089 abstractC23089 = this.f70307;
        AbstractC23089 abstractC23089Mo32857 = abstractC23089.mo32857();
        File file = abstractC23089.f75029;
        if (abstractC23089Mo32857 == null) {
            throw m27227(enumC17217, (String) null);
        }
        m48414(new C21677(abstractC23089Mo32857).mo8394(), enumC17217);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C16737.m39259(), C22529.m50046(abstractC23089Mo32857.mo40127()), "*/*", file.getName());
            if (uriCreateDocument == null) {
                throw m48412(enumC17217, (String) null, (Exception) null);
            }
            this.f70308 = uriCreateDocument;
            abstractC23089.mo49659(uriCreateDocument, false);
            if (!C13638.equals(file.getName(), C1361.m4806(uriCreateDocument)) && !C13638.equals(file.getName(), C22529.m50045(uriCreateDocument))) {
                if (!DocumentsContract.deleteDocument(C16737.m39259(), uriCreateDocument)) {
                    throw m48412(enumC17217, (String) null, new IOException("Failed to clean up provider-renamed file"));
                }
                this.f70308 = null;
                throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20745.mo33986(), (String) null);
            }
            this.f70308 = null;
        } catch (SecurityException e) {
            throw m48413(EnumC17217.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m48412(EnumC17217.CREATE_FILE_EXCLUSIVE, (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27228() throws C20040 {
        if (this.f70308 == null) {
            return super.mo27228();
        }
        try {
            if (!DocumentsContract.deleteDocument(C16737.m39259(), this.f70308)) {
                return false;
            }
            this.f70308 = null;
            this.f70307.mo40897();
            return true;
        } catch (SecurityException e) {
            throw m48413(EnumC17217.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (Exception e2) {
            throw m48412(EnumC17217.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۬ */
    public final C5928 mo8394() throws C20040 {
        C5928 c5928Mo40902;
        AbstractC20745 abstractC20745 = this.f36954;
        AbstractC23089 abstractC23089 = this.f70307;
        ContentResolver contentResolverM39259 = C16737.m39259();
        try {
            if (!abstractC23089.mo40900()) {
                return C5928.m16193(abstractC20745);
            }
            Cursor cursorQuery = contentResolverM39259.query(C22529.m50046(abstractC23089.mo40127()), abstractC23089.mo40910(), null, null, null);
            try {
                if (cursorQuery == null) {
                    c5928Mo40902 = m48411();
                    if (cursorQuery != null) {
                    }
                    return c5928Mo40902;
                }
                if (!cursorQuery.moveToFirst()) {
                    c5928Mo40902 = C5928.m16193(abstractC20745);
                } else {
                    c5928Mo40902 = abstractC23089.mo40902(cursorQuery);
                }
                cursorQuery.close();
                return c5928Mo40902;
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
            throw m48413(EnumC17217.STAT, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            C20040 c20040M48412 = m48412(EnumC17217.STAT, (String) null, e3);
            if (c20040M48412.m45399() == EnumC15807.NOT_FOUND) {
                return C5928.m16193(abstractC20745);
            }
            throw c20040M48412;
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final List mo27226(C5928 c5928) {
        if (c5928.m16195() != this.f70307) {
            throw new IllegalArgumentException("Directory snapshot belongs to another file");
        }
        return m48417(c5928);
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ֨ */
    public final List mo8389() {
        return m48417(mo8394());
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ᩹ */
    public final List mo8397() {
        return m48417(mo8394());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m48417(C5928 c5928) throws C20040 {
        AbstractC23089 abstractC23089 = this.f70307;
        EnumC17217 enumC17217 = EnumC17217.LIST;
        m48414(c5928, enumC17217);
        ContentResolver contentResolverM39259 = C16737.m39259();
        ArrayList arrayList = new ArrayList();
        try {
            Uri uriMo40127 = abstractC23089.mo40127();
            File file = abstractC23089.f75029;
            Cursor cursorQuery = contentResolverM39259.query(C22529.m50042(uriMo40127), abstractC23089.mo40907(), null, null, null);
            try {
                if (cursorQuery == null) {
                    throw m48412(enumC17217, (String) null, (Exception) null);
                }
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string == null || string2 == null) {
                        throw m48412(EnumC17217.LIST, (String) null, (Exception) null);
                    }
                    String str = (String) C9735.putIfAbsent(map, string2, string);
                    if (str != null) {
                        if (!str.equals(string)) {
                            throw m48412(EnumC17217.LIST, (String) null, new IOException("Provider returned ambiguous child names"));
                        }
                    } else {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(abstractC23089.mo40127(), string);
                        C5928 c5928Mo40909 = ((AbstractC23089) abstractC23089.mo40903(new File(file, string2), uriBuildDocumentUriUsingTree, cursorQuery)).mo40909(cursorQuery);
                        abstractC23089.mo40904(new File(file, string2), uriBuildDocumentUriUsingTree, c5928Mo40909.m16196() == EnumC12279.DIRECTORY);
                        arrayList.add(c5928Mo40909);
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
            throw m48413(EnumC17217.LIST, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m48412(EnumC17217.LIST, (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ */
    public final void mo8395() throws C20040 {
        EnumC17217 enumC17217 = EnumC17217.CREATE_DIRECTORY_SINGLE;
        m48418(enumC17217);
        EnumC12279 enumC12279M16196 = mo8394().m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 != enumC12279) {
            throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20745.mo33986(), (String) null);
        }
        AbstractC23089 abstractC23089 = this.f70307;
        AbstractC23089 abstractC23089Mo32857 = abstractC23089.mo32857();
        File file = abstractC23089.f75029;
        if (abstractC23089Mo32857 == null) {
            throw m27227(enumC17217, (String) null);
        }
        m48414(new C21677(abstractC23089Mo32857).mo8394(), enumC17217);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C16737.m39259(), C22529.m50046(abstractC23089Mo32857.mo40127()), "vnd.android.document/directory", file.getName());
            if (uriCreateDocument == null) {
                throw m48412(enumC17217, (String) null, (Exception) null);
            }
            if (!C13638.equals(file.getName(), C1361.m4806(uriCreateDocument)) && !C13638.equals(file.getName(), C22529.m50045(uriCreateDocument))) {
                DocumentsContract.deleteDocument(C16737.m39259(), uriCreateDocument);
                throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20745.mo33986(), (String) null);
            }
            abstractC23089.mo49659(uriCreateDocument, true);
        } catch (SecurityException e) {
            throw m48413(EnumC17217.CREATE_DIRECTORY_SINGLE, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m48412(EnumC17217.CREATE_DIRECTORY_SINGLE, (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۚ */
    public final void mo8392() throws C20040 {
        AbstractC23089 abstractC23089 = this.f70307;
        EnumC17217 enumC17217 = EnumC17217.DELETE_FILE_OR_LINK;
        m48418(enumC17217);
        C5928 c5928Mo8394 = mo8394();
        EnumC12279 enumC12279M16196 = c5928Mo8394.m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 == enumC12279) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20745.mo33986(), (String) null);
        }
        if (c5928Mo8394.m16196() != EnumC12279.REGULAR && c5928Mo8394.m16196() != EnumC12279.LINK) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_REGULAR_FILE, abstractC20745.mo33986(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C16737.m39259(), C22529.m50046(abstractC23089.mo40127()))) {
                throw m48412(enumC17217, (String) null, (Exception) null);
            }
            abstractC23089.mo40897();
        } catch (SecurityException e) {
            throw m48413(EnumC17217.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m48412(EnumC17217.DELETE_FILE_OR_LINK, (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۖ */
    public final void mo8390() throws C20040 {
        AbstractC23089 abstractC23089 = this.f70307;
        EnumC17217 enumC17217 = EnumC17217.DELETE_EMPTY_DIRECTORY;
        m48418(enumC17217);
        m48414(mo8394(), enumC17217);
        if (!m48417(mo8394()).isEmpty()) {
            throw C20040.m45395(enumC17217, EnumC15807.DIRECTORY_NOT_EMPTY, this.f36954.mo33986(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C16737.m39259(), C22529.m50046(abstractC23089.mo40127()))) {
                throw m48412(enumC17217, (String) null, (Exception) null);
            }
            abstractC23089.mo40897();
        } catch (SecurityException e) {
            throw m48413(EnumC17217.DELETE_EMPTY_DIRECTORY, (String) null, e);
        } catch (C20040 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m48412(EnumC17217.DELETE_EMPTY_DIRECTORY, (String) null, e3);
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final void mo8391(AbstractC20745 abstractC20745) throws C20040 {
        Uri uriMoveDocument;
        EnumC17217 enumC17217 = EnumC17217.RENAME_NO_REPLACE;
        m48418(enumC17217);
        boolean z = abstractC20745 instanceof AbstractC23089;
        AbstractC20745 abstractC20746 = this.f36954;
        if (z) {
            AbstractC23089 abstractC23089 = (AbstractC23089) abstractC20745;
            File file = abstractC23089.f75029;
            AbstractC23089 abstractC230810 = this.f70307;
            String strMo32859 = abstractC230810.mo32859();
            File file2 = abstractC230810.f75029;
            if (C13638.equals(strMo32859, abstractC23089.mo32859())) {
                if (m48416(abstractC23089)) {
                    throw m27227(enumC17217, file.getPath());
                }
                if (!C13638.equals(file2.getParent(), file.getParent()) && !C13638.equals(file2.getName(), file.getName())) {
                    throw m27227(enumC17217, file.getPath());
                }
                C5928 c5928Mo8394 = mo8394();
                EnumC12279 enumC12279M16196 = c5928Mo8394.m16196();
                EnumC12279 enumC12279 = EnumC12279.MISSING;
                if (enumC12279M16196 == enumC12279) {
                    throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20746.mo33986(), file.getPath());
                }
                if (new C21677(abstractC23089).mo8394().m16196() != enumC12279) {
                    throw C20040.m45395(enumC17217, EnumC15807.ALREADY_EXISTS, abstractC20746.mo33986(), file.getPath());
                }
                AbstractC23089 abstractC23089Mo32857 = abstractC230810.mo32857();
                AbstractC23089 abstractC23089Mo32858 = abstractC23089.mo32857();
                if (abstractC23089Mo32857 == null || abstractC23089Mo32858 == null || !C13638.equals(abstractC23089Mo32857.mo32859(), abstractC23089Mo32858.mo32859())) {
                    throw C20040.m45395(enumC17217, EnumC15807.CROSS_BACKEND, abstractC20746.mo33986(), file.getPath());
                }
                m48414(new C21677(abstractC23089Mo32858).mo8394(), enumC17217);
                ContentResolver contentResolverM39259 = C16737.m39259();
                Uri uriM50046 = C22529.m50046(abstractC230810.mo40127());
                try {
                    if (C13638.equals(file2.getParent(), file.getParent())) {
                        uriMoveDocument = DocumentsContract.renameDocument(contentResolverM39259, uriM50046, file.getName());
                        m48415(enumC17217, uriMoveDocument, file.getName(), ((AbstractC23089) abstractC20745).f75029.getPath());
                    } else {
                        if (Build.VERSION.SDK_INT < 24) {
                            throw m27227(enumC17217, ((AbstractC23089) abstractC20745).f75029.getPath());
                        }
                        uriMoveDocument = DocumentsContract.moveDocument(contentResolverM39259, uriM50046, C22529.m50046(abstractC23089Mo32857.mo40127()), C22529.m50046(abstractC23089Mo32858.mo40127()));
                        m48415(enumC17217, uriMoveDocument, file.getName(), ((AbstractC23089) abstractC20745).f75029.getPath());
                    }
                    abstractC230810.mo40897();
                    abstractC23089.mo49659(uriMoveDocument, c5928Mo8394.m16196() == EnumC12279.DIRECTORY);
                    return;
                } catch (SecurityException e) {
                    throw m48413(EnumC17217.RENAME_NO_REPLACE, file.getPath(), e);
                } catch (UnsupportedOperationException unused) {
                    throw m27227(EnumC17217.RENAME_NO_REPLACE, file.getPath());
                } catch (C20040 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m48412(EnumC17217.RENAME_NO_REPLACE, file.getPath(), e3);
                }
            }
        }
        throw C20040.m45395(enumC17217, EnumC15807.CROSS_BACKEND, abstractC20746.mo33986(), abstractC20745.mo33986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48415(EnumC17217 enumC17217, Uri uri, String str, String str2) throws C20040 {
        if (uri == null) {
            throw m48412(enumC17217, str2, (Exception) null);
        }
        if (!C13638.equals(str, C1361.m4806(uri)) && !C13638.equals(str, C22529.m50045(uri))) {
            throw m48412(enumC17217, str2, new IOException("Provider returned an unexpected document name"));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private C5928 m48411() throws C20040 {
        AbstractC20745 abstractC20745 = this.f36954;
        AbstractC23089 abstractC23089 = this.f70307;
        AbstractC23089 abstractC23089Mo32857 = abstractC23089.mo32857();
        if (abstractC23089Mo32857 == null) {
            throw m48412(EnumC17217.STAT, (String) null, (Exception) null);
        }
        try {
            for (C5928 c5928 : (ArrayList) new C21677(abstractC23089Mo32857).mo8397()) {
                if (abstractC20745.mo33986().equals(c5928.m16195().mo33986())) {
                    abstractC23089.mo49659(((AbstractC23089) c5928.m16195()).mo40127(), c5928.m16196() == EnumC12279.DIRECTORY);
                    return new C5928(this.f36954, c5928.m16196(), c5928.m16197(), c5928.m16198(), c5928.m16194());
                }
            }
            return C5928.m16193(abstractC20745);
        } catch (C20040 e) {
            if (e.m45399() == EnumC15807.NOT_FOUND) {
                return C5928.m16193(abstractC20745);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48416(AbstractC23089 abstractC23089) {
        if (!(abstractC23089 instanceof C17589)) {
            return false;
        }
        C17589 c17589 = (C17589) abstractC23089;
        return c17589.f75397 || c17589.m40906();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48418(EnumC17217 enumC17217) throws C20040 {
        if (m48416(this.f70307)) {
            throw m27227(enumC17217, (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48414(C5928 c5928, EnumC17217 enumC17217) throws C20040 {
        if (c5928.m16196() == EnumC12279.MISSING) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, c5928.m16195().mo33986(), (String) null);
        }
        if (c5928.m16196() != EnumC12279.DIRECTORY) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_DIRECTORY, c5928.m16195().mo33986(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20040 m48413(EnumC17217 enumC17217, String str, SecurityException securityException) {
        EnumC15807 enumC15807 = EnumC15807.PERMISSION_DENIED;
        AbstractC20745 abstractC20745 = this.f36954;
        String strMo33986 = abstractC20745.mo33986();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC17217);
        sb.append(" failed for ");
        return new C20040(enumC17217, enumC15807, strMo33986, str, C17922.m41615(abstractC20745, sb), securityException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20040 m48412(EnumC17217 enumC17217, String str, Exception exc) {
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC17217);
        sb.append(" failed for ");
        AbstractC20745 abstractC20745 = this.f36954;
        String strM41615 = C17922.m41615(abstractC20745, sb);
        if (exc == null) {
            return new C20040(enumC17217, EnumC15807.IO_ERROR, abstractC20745.mo33986(), str, strM41615);
        }
        if (!(exc instanceof IOException)) {
            return new C20040(enumC17217, EnumC15807.IO_ERROR, abstractC20745.mo33986(), str, strM41615, exc);
        }
        return C20040.m45394(enumC17217, abstractC20745.mo33986(), str, (IOException) exc);
    }
}
