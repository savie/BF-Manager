package l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O9SL */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23089 extends C22383 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6860 f75028;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f75029;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String[] f75030;

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public void mo51097() {
    }

    /* JADX INFO: renamed from: ۗܰ */
    public boolean mo40900() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC23089 mo32854(File file, Uri uri);

    /* JADX INFO: renamed from: ۙ */
    public void mo40904(File file, Uri uri, boolean z) {
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۧۙ */
    public final boolean mo46715() {
        return true;
    }

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public boolean mo51100() {
        return false;
    }

    public AbstractC23089(File file, Uri uri) {
        super(uri);
        this.f75029 = file;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20745 mo24641() {
        return mo32854(this.f75029.getAbsoluteFile(), mo40127());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo24643() {
        return this.f75029.getAbsolutePath();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo33978() {
        if (C13890.m33728()) {
            return ((Boolean) C22383.m49650(new Callable() { // from class: l.ۘܺۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC23089 abstractC23089 = this.f14925;
                    return Boolean.valueOf(!abstractC23089.mo33975() && abstractC23089.m51096());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return !mo33975() && m51096();
    }

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    private boolean m51096() {
        AbstractC20745 abstractC20745M46689 = m46689();
        if (abstractC20745M46689 != null && abstractC20745M46689.mo40126()) {
            Uri uriMo40127 = abstractC20745M46689.mo40127();
            File file = this.f75029;
            Uri uriM4803 = C1361.m4803(uriMo40127, "*/*", file.getName());
            if (uriM4803 != null) {
                if (C13638.equals(C22529.m50045(uriM4803), file.getName())) {
                    return true;
                }
                if (C13638.equals(C1361.m4806(uriM4803), file.getName())) {
                    mo49659(uriM4803, false);
                    return true;
                }
                C1361.m4807(uriM4803);
            }
        }
        return false;
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo33987() {
        if (C13890.m33728()) {
            return ((Boolean) C22383.m49650(new Callable() { // from class: l.֨ܺۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f5345.m51094());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m51094();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC10868 mo33989() {
        return new C21677(this);
    }

    /* JADX INFO: renamed from: ۫ܰ */
    public AbstractC23089 mo32857() {
        AbstractC20745 abstractC20745M46689 = m46689();
        if (abstractC20745M46689 instanceof AbstractC23089) {
            return (AbstractC23089) abstractC20745M46689;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public boolean m51094() {
        Uri uriM50041;
        File file;
        Uri uriM4803;
        if (mo33975()) {
            return mo33974();
        }
        AbstractC20745 abstractC20745M46711 = m46711();
        if (abstractC20745M46711 instanceof AbstractC23089) {
            AbstractC23089 abstractC23089 = (AbstractC23089) abstractC20745M46711;
            if (abstractC23089.m51094()) {
                uriM50041 = abstractC23089.mo40127();
                file = this.f75029;
                uriM4803 = C1361.m4803(uriM50041, "vnd.android.document/directory", file.getName());
                if (uriM4803 != null) {
                    if (C13638.equals(C22529.m50045(uriM4803), file.getName())) {
                        return true;
                    }
                    if (C13638.equals(C1361.m4806(uriM4803), file.getName())) {
                        mo49659(uriM4803, true);
                        return true;
                    }
                    C1361.m4807(uriM4803);
                }
            }
        } else if (abstractC20745M46711.mo33987()) {
            uriM50041 = C22529.m50041(mo40127());
            file = this.f75029;
            uriM4803 = C1361.m4803(uriM50041, "vnd.android.document/directory", file.getName());
            if (uriM4803 != null) {
                if (C13638.equals(C22529.m50045(uriM4803), file.getName())) {
                    return true;
                }
                if (C13638.equals(C1361.m4806(uriM4803), file.getName())) {
                    mo49659(uriM4803, true);
                    return true;
                }
                C1361.m4807(uriM4803);
            }
        }
        return false;
    }

    @Override // l.C22383, l.AbstractC20745
    public final String getName() {
        return this.f75029.getName();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ */
    public final String mo33986() {
        return this.f75029.getPath();
    }

    @Override // l.C22383, l.AbstractC20745
    public final String getParent() {
        return this.f75029.getParent();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public boolean mo33975() {
        if (this.f75028 != null) {
            return true;
        }
        return super.mo33975();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ */
    public boolean mo33971() {
        C6860 c6860 = this.f75028;
        if (c6860 != null) {
            return !c6860.f23139;
        }
        return super.mo33971();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ */
    public boolean mo33974() {
        C6860 c6860 = this.f75028;
        if (c6860 != null) {
            return c6860.f23139;
        }
        return super.mo33974();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ */
    public long mo33964() {
        C6860 c6860 = this.f75028;
        if (c6860 != null) {
            return c6860.f23138;
        }
        return super.mo33964();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ */
    public long mo33991() {
        C6860 c6860 = this.f75028;
        if (c6860 != null) {
            return c6860.f23140;
        }
        return super.mo33991();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24647() {
        if (C1361.m4807(mo40127())) {
            mo40897();
            return true;
        }
        if (!mo33974()) {
            return false;
        }
        Iterator it = ((ArrayList) mo33983(true)).iterator();
        while (it.hasNext()) {
            if (!((AbstractC23089) ((AbstractC20745) it.next())).m51092()) {
                return false;
            }
        }
        if (!C1361.m4807(mo40127())) {
            return false;
        }
        mo40897();
        return true;
    }

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    private boolean m51092() {
        if (mo33974()) {
            Iterator it = ((ArrayList) mo33983(true)).iterator();
            while (it.hasNext()) {
                if (!((AbstractC23089) ((AbstractC20745) it.next())).m51092()) {
                    return false;
                }
            }
        }
        if (!C1361.m4807(mo40127())) {
            return false;
        }
        mo40897();
        return true;
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo24646(final AbstractC20745 abstractC20745) {
        if (C13890.m33728()) {
            return ((Boolean) C22383.m49650(new Callable() { // from class: l.۬ܺۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f43965.m51099(abstractC20745));
                }
            }, Boolean.FALSE, OpenAuthTask.Duplex)).booleanValue();
        }
        return m51099(abstractC20745);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51099(AbstractC20745 abstractC20745) {
        Uri uriMoveDocument;
        if (abstractC20745.mo46715()) {
            AbstractC23089 abstractC23089 = (AbstractC23089) abstractC20745;
            File file = abstractC23089.f75029;
            if (C13638.equals(mo32859(), abstractC23089.mo32859()) && (!abstractC23089.mo33975() || abstractC23089.mo24647())) {
                File file2 = this.f75029;
                try {
                    if (C13638.equals(file2.getParent(), file.getParent())) {
                        String name = file.getName();
                        Uri uriRenameDocument = DocumentsContract.renameDocument(C16737.m39259(), mo40127(), name);
                        if (uriRenameDocument != null) {
                            if (C22529.m50045(uriRenameDocument).equals(name)) {
                                mo40897();
                                return true;
                            }
                            if (C13638.equals(C1361.m4806(uriRenameDocument), name)) {
                                mo40897();
                                return true;
                            }
                            DocumentsContract.renameDocument(C16737.m39259(), uriRenameDocument, file2.getName());
                            return false;
                        }
                    } else {
                        AbstractC20745 abstractC20745M46689 = m46689();
                        AbstractC20745 abstractC20745M466810 = abstractC23089.m46689();
                        if (abstractC20745M46689 != null && abstractC20745M466810 != null && (uriMoveDocument = DocumentsContract.moveDocument(C16737.m39259(), mo40127(), abstractC20745M46689.mo40127(), abstractC20745M466810.mo40127())) != null) {
                            if (C22529.m50045(uriMoveDocument).equals(file.getName())) {
                                mo40897();
                                return true;
                            }
                            if (C13638.equals(C1361.m4806(uriMoveDocument), file.getName())) {
                                mo40897();
                                return true;
                            }
                            DocumentsContract.moveDocument(C16737.m39259(), uriMoveDocument, abstractC20745M466810.mo40127(), abstractC20745M46689.mo40127());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ܰ */
    public String mo32859() {
        Uri uriMo40127 = mo40127();
        return new Uri.Builder().scheme("content").authority(uriMo40127.getAuthority()).appendPath("tree").appendPath(uriMo40127.getPathSegments().get(1)).build().toString();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final List mo33983(boolean z) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolverM39259 = C16737.m39259();
        Uri uriM50042 = C22529.m50042(mo40127());
        String[] strArrMo40907 = this.f75030;
        if (strArrMo40907 == null) {
            strArrMo40907 = mo40907();
            this.f75030 = strArrMo40907;
        }
        try {
            Cursor cursorQuery = contentResolverM39259.query(uriM50042, strArrMo40907, null, null, null);
            try {
                if (cursorQuery == null) {
                    mo51097();
                    if (cursorQuery != null) {
                    }
                    return arrayList;
                }
                HashSet hashSet = mo51100() ? new HashSet() : null;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (z || !string2.startsWith(".")) {
                        if (hashSet == null || hashSet.add(string2)) {
                            File file = new File(this.f75029, string2);
                            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(mo40127(), string);
                            AbstractC20745 abstractC20745Mo40903 = mo40903(file, uriBuildDocumentUriUsingTree, cursorQuery);
                            mo40904(file, uriBuildDocumentUriUsingTree, abstractC20745Mo40903.mo33974());
                            arrayList.add(abstractC20745Mo40903);
                        }
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
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧܰ */
    public String[] mo40907() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ܿܰ */
    public String[] mo40910() {
        return new String[]{"mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ۙ */
    public C5928 mo40902(Cursor cursor) {
        return m51098(cursor, 0, 1, 2);
    }

    /* JADX INFO: renamed from: ܰ */
    public C5928 mo40909(Cursor cursor) {
        return m51098(cursor, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5928 m51098(Cursor cursor, int i, int i2, int i3) {
        EnumC12279 enumC12279;
        String string = cursor.isNull(i) ? null : cursor.getString(i);
        if ("vnd.android.document/directory".equals(string)) {
            enumC12279 = EnumC12279.DIRECTORY;
        } else if (string == null || string.isEmpty()) {
            enumC12279 = EnumC12279.OTHER;
        } else {
            enumC12279 = EnumC12279.REGULAR;
        }
        EnumC12279 enumC122710 = enumC12279;
        return new C5928(this, enumC122710, (enumC122710 == EnumC12279.DIRECTORY || cursor.isNull(i2)) ? -1L : cursor.getLong(i2), cursor.isNull(i3) ? -1L : cursor.getLong(i3), null);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20745 mo40903(File file, Uri uri, Cursor cursor) {
        AbstractC23089 abstractC23089Mo32854 = mo32854(file, uri);
        C6860 c6860 = new C6860();
        c6860.f23139 = "vnd.android.document/directory".equals(cursor.isNull(2) ? null : cursor.getString(2));
        c6860.f23138 = cursor.isNull(3) ? -1L : cursor.getLong(3);
        c6860.f23140 = cursor.isNull(4) ? -1L : cursor.getLong(4);
        abstractC23089Mo32854.f75028 = c6860;
        return abstractC23089Mo32854;
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۨ */
    public final OutputStream mo33976(boolean z) throws FileNotFoundException {
        if (mo33975() || m51096()) {
            return C16737.m39259().openOutputStream(mo40127(), z ? "wa" : "wt");
        }
        throw new FileNotFoundException(mo40127().toString());
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC21850 mo33966(String str) throws FileNotFoundException {
        if (!str.equals("r") && !mo33975() && !m51096()) {
            throw new FileNotFoundException(mo40127().toString());
        }
        return C19734.m44888(mo40127(), str);
    }

    @Override // l.C22383
    /* JADX INFO: renamed from: ֡ܰ */
    public void mo40897() {
        super.mo40897();
        this.f75028 = null;
    }
}
