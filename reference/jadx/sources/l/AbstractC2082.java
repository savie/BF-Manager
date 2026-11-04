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

/* JADX INFO: renamed from: l.֫ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O9SL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2082 extends C22965 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final File f6914;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String[] f6915;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5811 f6916;

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7162() {
        return true;
    }

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo7163() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC2082 mo2937(File file, Uri uri);

    /* JADX INFO: renamed from: ۙ */
    public void mo2940(File file, Uri uri, boolean z) {
    }

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public void mo7166() {
    }

    /* JADX INFO: renamed from: ۬᩷ */
    public boolean mo2949() {
        return true;
    }

    public AbstractC2082(File file, Uri uri) {
        super(uri);
        this.f6914 = file;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC22044 mo4284() {
        return mo2937(this.f6914.getAbsoluteFile(), mo42888());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo4278() {
        return this.f6914.getAbsolutePath();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo4283() {
        if (C22415.m50557()) {
            return ((Boolean) C22965.m51826(new Callable() { // from class: l.۫ܿᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC2082 abstractC2082 = this.f42384;
                    return Boolean.valueOf(!abstractC2082.mo2934() && abstractC2082.m7160());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return !mo2934() && m7160();
    }

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    private boolean m7160() {
        AbstractC22044 abstractC22044M49858 = m49858();
        if (abstractC22044M49858 != null && abstractC22044M49858.mo42886()) {
            Uri uriMo42888 = abstractC22044M49858.mo42888();
            File file = this.f6914;
            Uri uriM46191 = C20069.m46191(uriMo42888, "*/*", file.getName());
            if (uriM46191 != null) {
                if (C17359.equals(C23053.m51954(uriM46191), file.getName())) {
                    return true;
                }
                if (C17359.equals(C20069.m46199(uriM46191), file.getName())) {
                    mo7464(uriM46191, false);
                    return true;
                }
                C20069.m46196(uriM46191);
            }
        }
        return false;
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo4274() {
        if (C22415.m50557()) {
            return ((Boolean) C22965.m51826(new Callable() { // from class: l.ᩴܿᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f64201.m7158());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m7158();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11601 mo4298() {
        return new C25203(this);
    }

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public AbstractC2082 mo7165() {
        AbstractC22044 abstractC22044M49858 = m49858();
        if (abstractC22044M49858 instanceof AbstractC2082) {
            return (AbstractC2082) abstractC22044M49858;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public boolean m7158() {
        Uri uriM51957;
        File file;
        Uri uriM46191;
        if (mo2934()) {
            return mo4281();
        }
        AbstractC22044 abstractC22044M49856 = m49856();
        if (abstractC22044M49856 instanceof AbstractC2082) {
            AbstractC2082 abstractC2082 = (AbstractC2082) abstractC22044M49856;
            if (abstractC2082.m7158()) {
                uriM51957 = abstractC2082.mo42888();
                file = this.f6914;
                uriM46191 = C20069.m46191(uriM51957, "vnd.android.document/directory", file.getName());
                if (uriM46191 != null) {
                    if (C17359.equals(C23053.m51954(uriM46191), file.getName())) {
                        return true;
                    }
                    if (C17359.equals(C20069.m46199(uriM46191), file.getName())) {
                        mo7464(uriM46191, true);
                        return true;
                    }
                    C20069.m46196(uriM46191);
                }
            }
        } else if (abstractC22044M49856.mo4274()) {
            uriM51957 = C23053.m51957(mo42888());
            file = this.f6914;
            uriM46191 = C20069.m46191(uriM51957, "vnd.android.document/directory", file.getName());
            if (uriM46191 != null) {
                if (C17359.equals(C23053.m51954(uriM46191), file.getName())) {
                    return true;
                }
                if (C17359.equals(C20069.m46199(uriM46191), file.getName())) {
                    mo7464(uriM46191, true);
                    return true;
                }
                C20069.m46196(uriM46191);
            }
        }
        return false;
    }

    @Override // l.C22965, l.AbstractC22044
    public final String getName() {
        return this.f6914.getName();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ */
    public final String mo4294() {
        return this.f6914.getPath();
    }

    @Override // l.C22965, l.AbstractC22044
    public final String getParent() {
        return this.f6914.getParent();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2934() {
        if (this.f6916 != null) {
            return true;
        }
        return super.mo2934();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ */
    public boolean mo4304() {
        C5811 c5811 = this.f6916;
        if (c5811 != null) {
            return !c5811.f19981;
        }
        return super.mo4304();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ */
    public boolean mo4281() {
        C5811 c5811 = this.f6916;
        if (c5811 != null) {
            return c5811.f19981;
        }
        return super.mo4281();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ */
    public long mo4285() {
        C5811 c5811 = this.f6916;
        if (c5811 != null) {
            return c5811.f19982;
        }
        return super.mo4285();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ */
    public long mo4286() {
        C5811 c5811 = this.f6916;
        if (c5811 != null) {
            return c5811.f19983;
        }
        return super.mo4286();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo4296() {
        if (C20069.m46196(mo42888())) {
            mo2952();
            return true;
        }
        if (!mo4281()) {
            return false;
        }
        Iterator it = ((ArrayList) mo4299(true)).iterator();
        while (it.hasNext()) {
            if (!((AbstractC2082) ((AbstractC22044) it.next())).m7159()) {
                return false;
            }
        }
        if (!C20069.m46196(mo42888())) {
            return false;
        }
        mo2952();
        return true;
    }

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    private boolean m7159() {
        if (mo4281()) {
            Iterator it = ((ArrayList) mo4299(true)).iterator();
            while (it.hasNext()) {
                if (!((AbstractC2082) ((AbstractC22044) it.next())).m7159()) {
                    return false;
                }
            }
        }
        if (!C20069.m46196(mo42888())) {
            return false;
        }
        mo2952();
        return true;
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4301(final AbstractC22044 abstractC22044) {
        if (C22415.m50557()) {
            return ((Boolean) C22965.m51826(new Callable() { // from class: l.ܳܿᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f50469.m7168(abstractC22044));
                }
            }, Boolean.FALSE, OpenAuthTask.Duplex)).booleanValue();
        }
        return m7168(abstractC22044);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7168(AbstractC22044 abstractC22044) {
        Uri uriMoveDocument;
        if (abstractC22044.mo7162()) {
            AbstractC2082 abstractC2082 = (AbstractC2082) abstractC22044;
            File file = abstractC2082.f6914;
            if (C17359.equals(mo7167(), abstractC2082.mo7167()) && (!abstractC2082.mo2934() || abstractC2082.mo4296())) {
                File file2 = this.f6914;
                try {
                    if (C17359.equals(file2.getParent(), file.getParent())) {
                        String name = file.getName();
                        Uri uriRenameDocument = DocumentsContract.renameDocument(C21576.m49091(), mo42888(), name);
                        if (uriRenameDocument != null) {
                            if (C23053.m51954(uriRenameDocument).equals(name)) {
                                mo2952();
                                return true;
                            }
                            if (C17359.equals(C20069.m46199(uriRenameDocument), name)) {
                                mo2952();
                                return true;
                            }
                            DocumentsContract.renameDocument(C21576.m49091(), uriRenameDocument, file2.getName());
                            return false;
                        }
                    } else {
                        AbstractC22044 abstractC22044M49858 = m49858();
                        AbstractC22044 abstractC22044M49859 = abstractC2082.m49858();
                        if (abstractC22044M49858 != null && abstractC22044M49859 != null && (uriMoveDocument = DocumentsContract.moveDocument(C21576.m49091(), mo42888(), abstractC22044M49858.mo42888(), abstractC22044M49859.mo42888())) != null) {
                            if (C23053.m51954(uriMoveDocument).equals(file.getName())) {
                                mo2952();
                                return true;
                            }
                            if (C17359.equals(C20069.m46199(uriMoveDocument), file.getName())) {
                                mo2952();
                                return true;
                            }
                            DocumentsContract.moveDocument(C21576.m49091(), uriMoveDocument, abstractC22044M49859.mo42888(), abstractC22044M49858.mo42888());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public String mo7167() {
        Uri uriMo42888 = mo42888();
        return new Uri.Builder().scheme("content").authority(uriMo42888.getAuthority()).appendPath("tree").appendPath(uriMo42888.getPathSegments().get(1)).build().toString();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4299(boolean z) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolverM49091 = C21576.m49091();
        Uri uriM51952 = C23053.m51952(mo42888());
        String[] strArrMo2935 = this.f6915;
        if (strArrMo2935 == null) {
            strArrMo2935 = mo2935();
            this.f6915 = strArrMo2935;
        }
        try {
            Cursor cursorQuery = contentResolverM49091.query(uriM51952, strArrMo2935, null, null, null);
            try {
                if (cursorQuery == null) {
                    mo7166();
                    if (cursorQuery != null) {
                    }
                    return arrayList;
                }
                HashSet hashSet = mo7163() ? new HashSet() : null;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (z || !string2.startsWith(".")) {
                        if (hashSet == null || hashSet.add(string2)) {
                            File file = new File(this.f6914, string2);
                            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(mo42888(), string);
                            AbstractC22044 abstractC22044Mo2939 = mo2939(file, uriBuildDocumentUriUsingTree, cursorQuery);
                            mo2940(file, uriBuildDocumentUriUsingTree, abstractC22044Mo2939.mo4281());
                            arrayList.add(abstractC22044Mo2939);
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

    /* JADX INFO: renamed from: ֨᩷ */
    public String[] mo2935() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ᩳ᩷ */
    public String[] mo2953() {
        return new String[]{"mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ۙ */
    public C1907 mo2936(Cursor cursor) {
        return m7164(cursor, 0, 1, 2);
    }

    /* JADX INFO: renamed from: ᩷ */
    public C1907 mo2955(Cursor cursor) {
        return m7164(cursor, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1907 m7164(Cursor cursor, int i, int i2, int i3) {
        EnumC13093 enumC13093;
        String string = cursor.isNull(i) ? null : cursor.getString(i);
        if ("vnd.android.document/directory".equals(string)) {
            enumC13093 = EnumC13093.DIRECTORY;
        } else if (string == null || string.isEmpty()) {
            enumC13093 = EnumC13093.OTHER;
        } else {
            enumC13093 = EnumC13093.REGULAR;
        }
        EnumC13093 enumC13094 = enumC13093;
        return new C1907(this, enumC13094, (enumC13094 == EnumC13093.DIRECTORY || cursor.isNull(i2)) ? -1L : cursor.getLong(i2), cursor.isNull(i3) ? -1L : cursor.getLong(i3), null);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22044 mo2939(File file, Uri uri, Cursor cursor) {
        AbstractC2082 abstractC2082Mo2937 = mo2937(file, uri);
        C5811 c5811 = new C5811();
        c5811.f19981 = "vnd.android.document/directory".equals(cursor.isNull(2) ? null : cursor.getString(2));
        c5811.f19982 = cursor.isNull(3) ? -1L : cursor.getLong(3);
        c5811.f19983 = cursor.isNull(4) ? -1L : cursor.getLong(4);
        abstractC2082Mo2937.f6916 = c5811;
        return abstractC2082Mo2937;
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo4289(boolean z) throws FileNotFoundException {
        if (mo2934() || m7160()) {
            return C21576.m49091().openOutputStream(mo42888(), z ? "wa" : "wt");
        }
        throw new FileNotFoundException(mo42888().toString());
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15475 mo4276(String str) throws FileNotFoundException {
        if (!str.equals("r") && !mo2934() && !m7160()) {
            throw new FileNotFoundException(mo42888().toString());
        }
        return C11746.m29496(mo42888(), str);
    }

    @Override // l.C22965
    /* JADX INFO: renamed from: ܿ᩷ */
    public void mo2952() {
        super.mo2952();
        this.f6916 = null;
    }
}
