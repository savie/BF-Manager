package l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes4.dex */
public class C17568 extends ContentProvider {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Set f57087 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f57086 = C21576.m49092().concat(".fp");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String[] f57088 = {"_display_name", "_size"};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41233(ArrayList arrayList) {
        Set hashSet;
        if (arrayList == null || arrayList.isEmpty()) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(arrayList);
        }
        f57087 = hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m41230(String str) {
        if (!f57087.isEmpty()) {
            m41233((ArrayList) null);
        }
        return new Uri.Builder().scheme("content").authority(f57086).path(str).build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m41231(AbstractC22044 abstractC22044) {
        if (C21576.f68932.getBoolean("apk_installation_prevents_deletion", false)) {
            String strEncodeToString = Base64.encodeToString(abstractC22044.m49881().getBytes(StandardCharsets.UTF_8), 11);
            long jCurrentTimeMillis = System.currentTimeMillis();
            return m41230(String.format("%s%08X/%s/%s", "/NOT_DELETE/", Long.valueOf(((long) ((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32)))) & 4294967295L), strEncodeToString, abstractC22044.getName()));
        }
        return m41230(abstractC22044.mo4294());
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (!providerInfo.authority.equals(f57086)) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m41232(Uri uri) {
        String strSubstring;
        String path = uri.getPath();
        C17359.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            path = path.substring(21);
            int iLastIndexOf = path.lastIndexOf(47);
            if (iLastIndexOf > 0) {
                strSubstring = path.substring(iLastIndexOf);
                path = path.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
            }
            try {
                path = new String(Base64.decode(path, 11), StandardCharsets.UTF_8) + strSubstring;
            } catch (Throwable unused) {
            }
        }
        return C14584.m35193(path, new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        C17359.toString(uri);
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        AbstractC22044 abstractC22044M41232 = m41232(uri);
        if (strArr == null) {
            strArr = f57088;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                String str3 = strArr[i2];
                str3.getClass();
                switch (str3) {
                    case "_display_name":
                        strArr3[i3] = "_display_name";
                        i = i3 + 1;
                        objArr[i3] = abstractC22044M41232.getName();
                        break;
                    case "_data":
                        String path = uri.getPath();
                        C17359.requireNonNull(path);
                        if (!path.startsWith("/NOT_DELETE/") && !f57087.contains(uri)) {
                            strArr3[i3] = "_data";
                            i = i3 + 1;
                            objArr[i3] = abstractC22044M41232.mo4294();
                            break;
                        }
                        i2++;
                        break;
                    case "_size":
                        strArr3[i3] = "_size";
                        i = i3 + 1;
                        objArr[i3] = Long.valueOf(abstractC22044M41232.mo4285());
                        break;
                    default:
                        continue;
                        i2++;
                        break;
                }
                i3 = i;
                i2++;
            } else {
                String[] strArr4 = new String[i3];
                System.arraycopy(strArr3, 0, strArr4, 0, i3);
                Object[] objArr2 = new Object[i3];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
                matrixCursor.addRow(objArr2);
                return matrixCursor;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        C17359.toString(uri);
        AbstractC22044 abstractC22044M41232 = m41232(uri);
        int iLastIndexOf = abstractC22044M41232.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(abstractC22044M41232.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        C17359.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            return 1;
        }
        return C14584.m35193(path, new String[0]).mo4296() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m41234(AbstractC22044 abstractC22044) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Object systemService = C21576.m49084().getSystemService("storage");
        if (!(systemService instanceof StorageManager)) {
            return null;
        }
        StorageManager storageManager = (StorageManager) systemService;
        long jMo4285 = abstractC22044.mo4285();
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            return storageManager.openProxyFileDescriptor(268435456, new ProxyFileDescriptorCallbackC16822(jMo4285, c13961M49855), C5261.m15838());
        } catch (IOException unused) {
            C20244.m46520(c13961M49855);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        C17359.toString(uri);
        try {
            AbstractC22044 abstractC22044M41232 = m41232(uri);
            ParcelFileDescriptor parcelFileDescriptorMo4279 = abstractC22044M41232.mo4279(str);
            if (parcelFileDescriptorMo4279 != null) {
                return parcelFileDescriptorMo4279;
            }
            ParcelFileDescriptor parcelFileDescriptorM41234 = m41234(abstractC22044M41232);
            if (parcelFileDescriptorM41234 != null) {
                return parcelFileDescriptorM41234;
            }
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            C5261.f18540.execute(new RunnableC25028(0, abstractC22044M41232.mo4290(), new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1])));
            return parcelFileDescriptorArrCreatePipe[0];
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(e2.getMessage());
            fileNotFoundException.initCause(e2);
            throw fileNotFoundException;
        }
    }
}
