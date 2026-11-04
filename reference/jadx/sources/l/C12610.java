package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsProvider;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.webkit.MimeTypeMap;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۨ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9SR */
/* JADX INFO: loaded from: classes4.dex */
public class C12610 extends DocumentsProvider {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f40467 = {"root_id", "mime_types", "flags", "icon", "title", ErrorBundle.SUMMARY_ENTRY, "document_id"};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f40468 = {"document_id", "mime_type", "_display_name", "last_modified", "flags", "_size", "mt_extras"};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f40469;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public File f40470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public File f40471;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public File f40472;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public File f40473;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f40469 = context.getPackageName();
        File parentFile = context.getFilesDir().getParentFile();
        this.f40472 = parentFile;
        String path = parentFile.getPath();
        if (path.startsWith("/data/user/")) {
            this.f40470 = new File(ExternalValue$$ExternalSyntheticOutline0.m(11, path, new StringBuilder("/data/user_de/")));
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            this.f40471 = externalFilesDir.getParentFile();
        }
        this.f40473 = context.getObbDir();
    }

    @Override // android.provider.DocumentsProvider
    public final String createDocument(String str, String str2, String str3) throws FileNotFoundException {
        StringBuilder sb;
        File fileM31326 = m31326(str, true);
        if (fileM31326 != null) {
            File file = new File(fileM31326, str3);
            int i = 2;
            while (file.exists()) {
                StringBuilder sbM10405 = C3188.m10405(str3, " (");
                sbM10405.append(i);
                sbM10405.append(MotionUtils.EASING_TYPE_FORMAT_END);
                file = new File(fileM31326, sbM10405.toString());
                i++;
            }
            try {
                if ("vnd.android.document/directory".equals(str2) ? file.mkdir() : file.createNewFile()) {
                    if (str.endsWith("/")) {
                        sb = new StringBuilder();
                        sb.append(str);
                    } else {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("/");
                    }
                    sb.append(file.getName());
                    return sb.toString();
                }
            } catch (IOException unused) {
            }
        }
        throw new FileNotFoundException(ExternalValue$$ExternalSyntheticOutline0.m("Failed to create document in ", str, " with name ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final void deleteDocument(String str) throws FileNotFoundException {
        File fileM31326 = m31326(str, true);
        if (fileM31326 == null || !m31328(fileM31326)) {
            throw new FileNotFoundException("Failed to delete document ".concat(str));
        }
    }

    @Override // android.provider.DocumentsProvider
    public final String getDocumentType(String str) throws FileNotFoundException {
        File fileM31326 = m31326(str, true);
        return fileM31326 == null ? "vnd.android.document/directory" : m31329(fileM31326);
    }

    @Override // android.provider.DocumentsProvider
    public final String moveDocument(String str, String str2, String str3) throws FileNotFoundException {
        File fileM31326 = m31326(str, true);
        File fileM31327 = m31326(str3, true);
        if (fileM31326 != null && fileM31327 != null) {
            File file = new File(fileM31327, fileM31326.getName());
            if (!file.exists() && fileM31326.renameTo(file)) {
                StringBuilder sbM27333 = str3.endsWith("/") ? C10732.m27333(str3) : C3188.m10405(str3, "/");
                sbM27333.append(file.getName());
                return sbM27333.toString();
            }
        }
        throw new FileNotFoundException(ExternalValue$$ExternalSyntheticOutline0.m("Filed to move document ", str, " to ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final String renameDocument(String str, String str2) throws FileNotFoundException {
        File fileM31326 = m31326(str, true);
        if (fileM31326 == null || !fileM31326.renameTo(new File(fileM31326.getParentFile(), str2))) {
            throw new FileNotFoundException(ExternalValue$$ExternalSyntheticOutline0.m("Failed to rename document ", str, " to ", str2));
        }
        return str.substring(0, str.lastIndexOf(47, str.length() - 2)) + "/" + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private File m31326(String str, boolean z) throws FileNotFoundException {
        String strSubstring;
        if (str.startsWith(this.f40469)) {
            String strSubstring2 = str.substring(this.f40469.length());
            if (strSubstring2.startsWith("/")) {
                strSubstring2 = strSubstring2.substring(1);
            }
            File file = null;
            if (strSubstring2.isEmpty()) {
                return null;
            }
            int iIndexOf = strSubstring2.indexOf(47);
            if (iIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring3 = strSubstring2.substring(0, iIndexOf);
                strSubstring = strSubstring2.substring(iIndexOf + 1);
                strSubstring2 = strSubstring3;
            }
            if (strSubstring2.equalsIgnoreCase(e.m)) {
                file = new File(this.f40472, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("android_data") && this.f40471 != null) {
                file = new File(this.f40471, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("android_obb") && this.f40473 != null) {
                file = new File(this.f40473, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("user_de_data") && this.f40470 != null) {
                file = new File(this.f40470, strSubstring);
            }
            if (file == null) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
            if (!z) {
                return file;
            }
            try {
                Os.lstat(file.getPath());
                return file;
            } catch (Exception unused) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
        }
        throw new FileNotFoundException(str.concat(" not found"));
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryRoots(String[] strArr) {
        ApplicationInfo applicationInfo = getContext().getApplicationInfo();
        String string = applicationInfo.loadLabel(getContext().getPackageManager()).toString();
        if (strArr == null) {
            strArr = f40467;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("root_id", this.f40469);
        rowBuilderNewRow.add("document_id", this.f40469);
        rowBuilderNewRow.add(ErrorBundle.SUMMARY_ENTRY, this.f40469);
        rowBuilderNewRow.add("flags", 17);
        rowBuilderNewRow.add("title", string);
        rowBuilderNewRow.add("mime_types", "*/*");
        rowBuilderNewRow.add("icon", Integer.valueOf(applicationInfo.icon));
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryDocument(String str, String[] strArr) throws FileNotFoundException {
        if (strArr == null) {
            strArr = f40468;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        m31327(matrixCursor, str, null);
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryChildDocuments(String str, String[] strArr, String str2) throws FileNotFoundException {
        if (str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        if (strArr == null) {
            strArr = f40468;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        File fileM31326 = m31326(str, true);
        if (fileM31326 == null) {
            m31327(matrixCursor, str.concat("/data"), this.f40472);
            File file = this.f40471;
            if (file != null && file.exists()) {
                m31327(matrixCursor, str.concat("/android_data"), this.f40471);
            }
            File file2 = this.f40473;
            if (file2 != null && file2.exists()) {
                m31327(matrixCursor, str.concat("/android_obb"), this.f40473);
            }
            File file3 = this.f40470;
            if (file3 != null && file3.exists()) {
                m31327(matrixCursor, str.concat("/user_de_data"), this.f40470);
                return matrixCursor;
            }
        } else {
            File[] fileArrListFiles = fileM31326.listFiles();
            if (fileArrListFiles == null) {
                throw new FileNotFoundException("Failed to list directory ".concat(str));
            }
            for (File file4 : fileArrListFiles) {
                StringBuilder sbM10405 = C3188.m10405(str, "/");
                sbM10405.append(file4.getName());
                m31327(matrixCursor, sbM10405.toString(), file4);
            }
        }
        return matrixCursor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    @Override // android.provider.DocumentsProvider
    public final ParcelFileDescriptor openDocument(String str, String str2, CancellationSignal cancellationSignal) throws FileNotFoundException {
        int i;
        byte b = 0;
        File fileM31326 = m31326(str, false);
        if (fileM31326 == null) {
            throw new FileNotFoundException(str.concat(" not found"));
        }
        str2.getClass();
        switch (str2.hashCode()) {
            case 114:
                if (!str2.equals("r")) {
                    b = -1;
                }
                break;
            case 119:
                if (!str2.equals("w")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3653:
                if (!str2.equals("rw")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3786:
                if (!str2.equals("wa")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3805:
                if (!str2.equals("wt")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 113359:
                if (!str2.equals("rwt")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                i = 268435456;
                break;
            case 1:
            case 4:
                i = 738197504;
                break;
            case 2:
                i = 939524096;
                break;
            case 3:
                i = 704643072;
                break;
            case 5:
                i = 1006632960;
                break;
            default:
                throw new IllegalArgumentException("Invalid mode: ".concat(str2));
        }
        return ParcelFileDescriptor.open(fileM31326, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31328(File file) {
        if (file.isDirectory()) {
            try {
                if ((Os.lstat(file.getPath()).st_mode & 61440) != 40960) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (!m31328(file2)) {
                                return false;
                            }
                        }
                    }
                }
            } catch (ErrnoException unused) {
            }
        }
        return file.delete();
    }

    @Override // android.provider.DocumentsProvider
    public final void removeDocument(String str, String str2) throws FileNotFoundException {
        deleteDocument(str);
    }

    @Override // android.provider.DocumentsProvider
    public final boolean isChildDocument(String str, String str2) {
        return str2.startsWith(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m31329(File file) {
        if (file.isDirectory()) {
            return "vnd.android.document/directory";
        }
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[Catch: Exception -> 0x00dd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:10:0x001d, B:12:0x0031, B:14:0x003b, B:47:0x00d2, B:21:0x0052, B:23:0x005a, B:25:0x0060, B:26:0x0065, B:27:0x0074, B:29:0x007c, B:31:0x0082, B:32:0x0086, B:33:0x008c, B:36:0x0098, B:37:0x00a3, B:39:0x00ab, B:41:0x00b1, B:42:0x00b5, B:43:0x00bb, B:46:0x00c7, B:13:0x0037), top: B:52:0x001d, inners: #1, #2 }] */
    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundleCall = super.call(str, str2, bundle);
        if (bundleCall != null) {
            return bundleCall;
        }
        if (!str.startsWith("mt:")) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        try {
            List<String> pathSegments = ((Uri) bundle.getParcelable("uri")).getPathSegments();
            String str3 = pathSegments.size() >= 4 ? pathSegments.get(3) : pathSegments.get(1);
            int iHashCode = str.hashCode();
            if (iHashCode != -1645162251) {
                if (iHashCode != 214442514) {
                    if (iHashCode == 1713485102 && str.equals("mt:setLastModified")) {
                        File fileM31326 = m31326(str3, true);
                        if (fileM31326 == null) {
                            bundle2.putBoolean(o.c, false);
                        } else {
                            bundle2.putBoolean(o.c, fileM31326.setLastModified(bundle.getLong("time")));
                        }
                    } else {
                        bundle2.putBoolean(o.c, false);
                        bundle2.putString("message", "Unsupported method: ".concat(str));
                    }
                } else if (str.equals("mt:createSymlink")) {
                    File fileM31327 = m31326(str3, false);
                    if (fileM31327 == null) {
                        bundle2.putBoolean(o.c, false);
                    } else {
                        try {
                            Os.symlink(bundle.getString(MotionUtils.EASING_TYPE_PATH), fileM31327.getPath());
                            bundle2.putBoolean(o.c, true);
                        } catch (ErrnoException e) {
                            bundle2.putBoolean(o.c, false);
                            bundle2.putString("message", e.getMessage());
                        }
                    }
                } else {
                    bundle2.putBoolean(o.c, false);
                    bundle2.putString("message", "Unsupported method: ".concat(str));
                }
            } else if (str.equals("mt:setPermissions")) {
                File fileM31328 = m31326(str3, true);
                if (fileM31328 == null) {
                    bundle2.putBoolean(o.c, false);
                } else {
                    try {
                        Os.chmod(fileM31328.getPath(), bundle.getInt("permissions"));
                        bundle2.putBoolean(o.c, true);
                    } catch (ErrnoException e2) {
                        bundle2.putBoolean(o.c, false);
                        bundle2.putString("message", e2.getMessage());
                    }
                }
            } else {
                bundle2.putBoolean(o.c, false);
                bundle2.putString("message", "Unsupported method: ".concat(str));
            }
        } catch (Exception e3) {
            bundle2.putBoolean(o.c, false);
            bundle2.putString("message", e3.toString());
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31327(MatrixCursor matrixCursor, String str, File file) throws FileNotFoundException {
        int i;
        String name;
        boolean z = false;
        if (file == null) {
            file = m31326(str, true);
        }
        if (file == null) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add("document_id", this.f40469);
            rowBuilderNewRow.add("_display_name", this.f40469);
            rowBuilderNewRow.add("_size", 0L);
            rowBuilderNewRow.add("mime_type", "vnd.android.document/directory");
            rowBuilderNewRow.add("last_modified", 0);
            rowBuilderNewRow.add("flags", 0);
            return;
        }
        if (file.isDirectory()) {
            if (file.canWrite()) {
                i = 8;
            } else {
                i = 0;
            }
        } else if (file.canWrite()) {
            i = 2;
        } else {
            i = 0;
        }
        if (file.getParentFile().canWrite()) {
            i |= 68;
        }
        String path = file.getPath();
        if (path.equals(this.f40472.getPath())) {
            name = e.m;
        } else {
            File file2 = this.f40471;
            if (file2 == null || !path.equals(file2.getPath())) {
                File file3 = this.f40473;
                if (file3 == null || !path.equals(file3.getPath())) {
                    File file4 = this.f40470;
                    if (file4 == null || !path.equals(file4.getPath())) {
                        name = file.getName();
                        z = true;
                    } else {
                        name = "user_de_data";
                    }
                } else {
                    name = "android_obb";
                }
            } else {
                name = "android_data";
            }
        }
        MatrixCursor.RowBuilder rowBuilderNewRow2 = matrixCursor.newRow();
        rowBuilderNewRow2.add("document_id", str);
        rowBuilderNewRow2.add("_display_name", name);
        rowBuilderNewRow2.add("_size", Long.valueOf(file.length()));
        rowBuilderNewRow2.add("mime_type", m31329(file));
        rowBuilderNewRow2.add("last_modified", Long.valueOf(file.lastModified()));
        rowBuilderNewRow2.add("flags", Integer.valueOf(i));
        rowBuilderNewRow2.add("mt_path", file.getAbsolutePath());
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                StructStat structStatLstat = Os.lstat(path);
                sb.append(structStatLstat.st_mode);
                sb.append("|");
                sb.append(structStatLstat.st_uid);
                sb.append("|");
                sb.append(structStatLstat.st_gid);
                if ((structStatLstat.st_mode & 61440) == 40960) {
                    sb.append("|");
                    sb.append(Os.readlink(path));
                }
                rowBuilderNewRow2.add("mt_extras", sb.toString());
            } catch (Exception unused) {
            }
        }
    }
}
