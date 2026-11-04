package l;

import android.content.AttributionSource;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextParams;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes4.dex */
public class C19041 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f61674 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorC0396 f61675 = new ExecutorC0396();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61676 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f61677;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final File f61678;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f61679;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final File f61680;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Resources f61681;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final File f61682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f61683;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final File f61684;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final File f61685;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Signature f61686;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final File f61687;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final File f61688;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final File f61689;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final File f61690;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final File f61691;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context f61692;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final WindowManagerC2633 f61693;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19041 f61694;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f61695;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19041 f61696;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f61697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f61698;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ContentResolver f61699;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final File f61700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final File f61701;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7854 f61702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f61703;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final File f61704;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10090 f61705;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final File f61706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f61707;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ApplicationInfo f61708;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final File f61709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AssetManager f61710;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9344 f61711;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final File f61712;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f61713;

    @InterfaceC19352
    public boolean canLoadUnsafeResources() {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingOrSelfPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingOrSelfUriPermission(Uri uri, int i) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingUriPermission(Uri uri, int i) {
        return -1;
    }

    public final int checkContentUriPermissionFull(Uri uri, int i, int i2, int i3) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkPermission(String str, int i, int i2) {
        return -1;
    }

    @InterfaceC19352
    public int checkPermission(String str, int i, int i2, IBinder iBinder) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkSelfPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkUriPermission(Uri uri, int i, int i2, int i3) {
        return -1;
    }

    @InterfaceC19352
    public int checkUriPermission(Uri uri, int i, int i2, int i3, IBinder iBinder) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkUriPermission(Uri uri, String str, String str2, int i, int i2, int i3) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void clearWallpaper() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createAttributionContext(String str) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContext(ContextParams contextParams) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceContext(int i) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createWindowContext(int i, Bundle bundle) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createWindowContext(Display display, int i, Bundle bundle) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AttributionSource getAttributionSource() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getAttributionTag() {
        return null;
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public Display getDisplay() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isRestricted() {
        return true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveDatabaseFrom(Context context, String str) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context context, String str) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void removeStickyBroadcast(Intent intent) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setWallpaper(Bitmap bitmap) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setWallpaper(InputStream inputStream) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean stopService(Intent intent) {
        return false;
    }

    @InterfaceC19352
    public boolean stopServiceAsUser(Intent intent, UserHandle userHandle) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }

    @InterfaceC19352
    public void updateDisplay(int i) {
    }

    public C19041(Context context, File file, Signature signature, C10090 c10090, File file2, File file3, String str) {
        this(C7854.m21376(context, file), file, signature, c10090, file2, file3, str, false);
    }

    public C19041(C7854 c7854, File file, Signature signature, C10090 c10090, File file2, File file3, String str, boolean z) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        String str2;
        int i;
        int iIndexOf;
        super(null);
        this.f61695 = new ConcurrentMapC17249();
        this.f61702 = c7854;
        this.f61705 = c10090;
        this.f61686 = signature;
        this.f61713 = z;
        File canonicalFile = file.getCanonicalFile();
        this.f61683 = canonicalFile;
        this.f61700 = file2.getCanonicalFile();
        File canonicalFile2 = file3.getCanonicalFile();
        this.f61706 = canonicalFile2;
        canonicalFile2 = z ? new File(canonicalFile2, "device_protected").getCanonicalFile() : canonicalFile2;
        this.f61685 = canonicalFile2;
        File file4 = new File(canonicalFile2, "files");
        this.f61701 = file4;
        File file5 = new File(canonicalFile2, "no_backup");
        File file6 = new File(canonicalFile2, "cache");
        File file7 = new File(canonicalFile2, "code_cache");
        File file8 = new File(canonicalFile2, "obb");
        File file9 = new File(canonicalFile2, "databases");
        this.f61679 = file9;
        File file10 = new File(canonicalFile2, "shared_prefs");
        m44145(canonicalFile2);
        m44145(file4);
        m44145(file5);
        m44145(file6);
        m44145(file7);
        m44145(file8);
        m44145(file9);
        m44145(file10);
        PackageInfo packageInfoM21377 = C7854.m21377(c7854);
        ApplicationInfo applicationInfo = packageInfoM21377.applicationInfo;
        this.f61708 = applicationInfo;
        applicationInfo.flags |= 8388608;
        String str3 = applicationInfo.packageName;
        this.f61712 = new File(C14442.m34865("/data/app/", str3, "-1/base.apk"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ZipFile zipFile = new ZipFile(canonicalFile);
            try {
                for (ZipEntry zipEntry : Collections.list(zipFile.entries())) {
                    if (!zipEntry.isDirectory()) {
                        String name = zipEntry.getName();
                        if (name.startsWith("lib/") && (iIndexOf = name.indexOf(47, 4)) > 4) {
                            String strSubstring = name.substring(4, iIndexOf);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "mips64":
                                case "x86_64":
                                case "armeabi":
                                case "x86":
                                case "mips":
                                case "armeabi-v7a":
                                case "arm64-v8a":
                                    linkedHashSet.add(strSubstring);
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                        }
                    }
                }
                zipFile.close();
                if (str != null && linkedHashSet.contains(str)) {
                    str2 = str;
                } else if (linkedHashSet.isEmpty()) {
                    String[] strArr = Build.SUPPORTED_ABIS;
                    str2 = strArr.length > 0 ? strArr[0] : "arm64-v8a";
                } else {
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str4 = strArr2[i2];
                            if (linkedHashSet.contains(str4)) {
                                str2 = str4;
                            } else {
                                i2++;
                            }
                        } else {
                            str2 = (String) linkedHashSet.iterator().next();
                        }
                    }
                }
                this.f61697 = str2;
                File file11 = new File(ExternalValue$$ExternalSyntheticOutline0.m("/data/app/", str3, "-1/lib/", str2));
                File file12 = new File(C25272.m56409("/data/data/", str3));
                this.f61703 = file12;
                File file13 = new File(C25272.m56409("/data/user/0/", str3));
                this.f61707 = file13;
                File file14 = new File(C25272.m56409("/data/user_de/0/", str3));
                this.f61689 = file14;
                this.f61687 = new File(file12, "files");
                this.f61684 = new File(file12, "no_backup");
                this.f61682 = new File(file12, "cache");
                this.f61698 = new File(file12, "code_cache");
                this.f61709 = new File(file12, "obb");
                this.f61677 = new File(file12, "databases");
                this.f61678 = new File(file14, "files");
                this.f61690 = new File(file14, "no_backup");
                this.f61688 = new File(file14, "cache");
                this.f61704 = new File(file14, "code_cache");
                this.f61680 = new File(file14, "obb");
                this.f61691 = new File(file14, "databases");
                this.f61708.uid = Process.myUid();
                ApplicationInfo applicationInfo2 = this.f61708;
                applicationInfo2.processName = str3;
                applicationInfo2.nativeLibraryDir = file11.getPath();
                this.f61708.sourceDir = this.f61712.getPath();
                this.f61708.publicSourceDir = this.f61712.getPath();
                this.f61708.dataDir = (this.f61713 ? file14 : file12).getPath();
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f61708.deviceProtectedDataDir = file14.getPath();
                    ApplicationInfo applicationInfo3 = this.f61708;
                    String path = file13.getPath();
                    try {
                        Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                        declaredField.setAccessible(true);
                        declaredField.set(applicationInfo3, path);
                    } catch (Throwable unused) {
                    }
                }
                c10090.m26049(this.f61708);
                if (signature != null) {
                    i = 1;
                    packageInfoM21377.signatures = new Signature[]{signature};
                } else {
                    i = 1;
                }
                AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                this.f61710 = assetManager;
                Class[] clsArr = new Class[i];
                clsArr[0] = String.class;
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", clsArr);
                Object[] objArr = new Object[i];
                objArr[0] = this.f61683.getPath();
                declaredMethod.invoke(assetManager, objArr);
                Resources resources = new Resources(assetManager, C7854.m21378(c7854), C7854.m21375(c7854));
                this.f61681 = resources;
                this.f61711 = new C9344(packageInfoM21377, this.f61708, resources, str3);
                this.f61699 = new C1142(this);
                this.f61693 = new WindowManagerC2633();
            } catch (Throwable th) {
                try {
                    zipFile.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m44150() {
        return this.f61697;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f61710;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f61681;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.f61711;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ContentResolver getContentResolver() {
        return this.f61699;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Looper getMainLooper() {
        return Looper.getMainLooper();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Executor getMainExecutor() {
        return f61675;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44149(Context context) {
        this.f61692 = context;
        C19041 c19041 = this.f61694;
        if (c19041 != null) {
            c19041.f61692 = context;
        }
        C19041 c19042 = this.f61696;
        if (c19042 != null) {
            c19042.f61692 = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context context = this.f61692;
        return context != null ? context : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File m44148() {
        return this.f61707;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File m44151() {
        return this.f61689;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.f61681.newTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f61705;
    }

    @InterfaceC19352
    public Context createApplicationContext(ApplicationInfo applicationInfo, int i) throws PackageManager.NameNotFoundException {
        if (applicationInfo == null || !this.f61708.packageName.equals(applicationInfo.packageName)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.f61708.packageName.equals(str)) {
            return this;
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    @InterfaceC19352
    public String getBasePackageName() {
        return this.f61708.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public String getOpPackageName() {
        return this.f61708.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return this.f61708.packageName;
    }

    @InterfaceC19352
    public String reloadSharedPreferences() {
        return this.f61708.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return this.f61708;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageResourcePath() {
        return this.f61712.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageCodePath() {
        return this.f61712.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileInputStream openFileInput(String str) {
        return new FileInputStream(m44143(this.f61701, str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileOutputStream openFileOutput(String str, int i) {
        File fileM44143 = m44143(this.f61701, str);
        File parentFile = fileM44143.getParentFile();
        if (parentFile != null) {
            m44145(parentFile);
        }
        return new FileOutputStream(fileM44143, (i & 32768) != 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteFile(String str) {
        return m44143(this.f61701, str).delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] fileList() {
        String[] list = this.f61701.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        String strM56409 = C25272.m56409("app_", str);
        m44145(m44143(this.f61685, strM56409));
        return m44143(this.f61713 ? this.f61689 : this.f61703, strM56409);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        m44145(this.f61679);
        return m44143(this.f61713 ? this.f61691 : this.f61677, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] databaseList() {
        String[] list = this.f61679.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteDatabase(String str) {
        File file = this.f61679;
        m44145(file);
        File fileM44143 = m44143(file, str);
        return new File(fileM44143.getPath() + "-shm").delete() | fileM44143.delete() | new File(fileM44143.getPath() + "-journal").delete() | new File(fileM44143.getPath() + "-wal").delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        File file = this.f61679;
        m44145(file);
        return SQLiteDatabase.openOrCreateDatabase(m44143(file, str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        File file = this.f61679;
        m44145(file);
        return SQLiteDatabase.openOrCreateDatabase(m44143(file, str).getPath(), cursorFactory, databaseErrorHandler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.f61713 ? this.f61688 : this.f61682;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCodeCacheDir() {
        return this.f61713 ? this.f61704 : this.f61698;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDataDir() {
        return this.f61713 ? this.f61689 : this.f61703;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalCacheDir() {
        return this.f61713 ? this.f61688 : this.f61682;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        return new File[]{this.f61713 ? this.f61688 : this.f61682};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        return this.f61713 ? this.f61678 : this.f61687;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(String str) {
        return new File[]{this.f61713 ? this.f61678 : this.f61687};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalMediaDirs() {
        return new File[]{this.f61713 ? this.f61678 : this.f61687};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFileStreamPath(String str) {
        return m44143(this.f61713 ? this.f61678 : this.f61687, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.f61713 ? this.f61678 : this.f61687;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getNoBackupFilesDir() {
        return this.f61713 ? this.f61690 : this.f61684;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getObbDir() {
        return this.f61713 ? this.f61680 : this.f61709;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getObbDirs() {
        return new File[]{this.f61713 ? this.f61680 : this.f61709};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m44142(PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        ProviderInfo[] providerInfoArr;
        long jLongValue;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m44147(packageInfo.activities);
        packageInfo2.receivers = m44147(packageInfo.receivers);
        ServiceInfo[] serviceInfoArr2 = packageInfo.services;
        if (serviceInfoArr2 == null) {
            serviceInfoArr = null;
        } else {
            serviceInfoArr = new ServiceInfo[serviceInfoArr2.length];
            for (int i = 0; i < serviceInfoArr2.length; i++) {
                serviceInfoArr[i] = serviceInfoArr2[i] == null ? null : new ServiceInfo(serviceInfoArr2[i]);
            }
        }
        packageInfo2.services = serviceInfoArr;
        ProviderInfo[] providerInfoArr2 = packageInfo.providers;
        if (providerInfoArr2 == null) {
            providerInfoArr = null;
        } else {
            providerInfoArr = new ProviderInfo[providerInfoArr2.length];
            for (int i2 = 0; i2 < providerInfoArr2.length; i2++) {
                providerInfoArr[i2] = providerInfoArr2[i2] == null ? null : new ProviderInfo(providerInfoArr2[i2]);
            }
        }
        packageInfo2.providers = providerInfoArr;
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        packageInfo2.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
        String[] strArr = packageInfo.requestedPermissions;
        packageInfo2.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
        int[] iArr = packageInfo.requestedPermissionsFlags;
        packageInfo2.requestedPermissionsFlags = iArr == null ? null : (int[]) iArr.clone();
        int[] iArr2 = packageInfo.gids;
        packageInfo2.gids = iArr2 == null ? null : (int[]) iArr2.clone();
        Signature[] signatureArr = packageInfo.signatures;
        packageInfo2.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.versionCode = packageInfo.versionCode;
        packageInfo2.versionName = packageInfo.versionName;
        try {
            Field field = PackageInfo.class.getField("signingInfo");
            field.set(packageInfo2, field.get(packageInfo));
        } catch (Throwable unused) {
        }
        try {
            Field field2 = PackageInfo.class.getField("baseRevisionCode");
            field2.setInt(packageInfo2, field2.getInt(packageInfo));
        } catch (Throwable unused2) {
        }
        try {
            jLongValue = ((Number) PackageInfo.class.getMethod("getLongVersionCode", null).invoke(packageInfo, null)).longValue();
        } catch (Throwable unused3) {
            jLongValue = packageInfo.versionCode;
        }
        try {
            PackageInfo.class.getMethod("setLongVersionCode", Long.TYPE).invoke(packageInfo2, Long.valueOf(jLongValue));
        } catch (Throwable unused4) {
            packageInfo2.versionCode = (int) jLongValue;
        }
        return packageInfo2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo[] m44147(ActivityInfo[] activityInfoArr) {
        if (activityInfoArr == null) {
            return null;
        }
        ActivityInfo[] activityInfoArr2 = new ActivityInfo[activityInfoArr.length];
        for (int i = 0; i < activityInfoArr.length; i++) {
            activityInfoArr2[i] = activityInfoArr[i] == null ? null : new ActivityInfo(activityInfoArr[i]);
        }
        return activityInfoArr2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        throw m44144("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        throw m44144("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        throw m44144("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        throw m44144("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        throw m44144("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        throw m44144("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent) {
        throw m44144("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent, String str) {
        throw m44144("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str) {
        throw m44144("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m44144("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m44144("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        throw m44144("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m44144("sendOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcast(Intent intent) {
        throw m44144("sendStickyBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m44144("sendStickyOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m44144("sendStickyBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m44144("sendStickyOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw m44144("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        throw m44144("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        throw m44144("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        throw m44144("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startService(Intent intent) {
        throw m44144("startService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        throw m44144("startForegroundService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        throw m44144("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags) {
        throw m44144("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        throw m44144("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, Context.BindServiceFlags bindServiceFlags, Executor executor, ServiceConnection serviceConnection) {
        throw m44144("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindIsolatedService(Intent intent, int i, String str, Executor executor, ServiceConnection serviceConnection) {
        throw m44144("bindIsolatedService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void updateServiceGroup(ServiceConnection serviceConnection, int i, int i2) {
        throw m44144("updateServiceGroup");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        throw m44144("startInstrumentation");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (str.equals("window")) {
            return this.f61693;
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getSystemServiceName(Class cls) {
        if (WindowManager.class.isAssignableFrom(cls)) {
            return "window";
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforcePermission(String str, int i, int i2, String str2) {
        throw m44144("enforcePermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingPermission(String str, String str2) {
        throw m44144("enforceCallingPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfPermission(String str, String str2) {
        throw m44144("enforceCallingOrSelfPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void grantUriPermission(String str, Uri uri, int i) {
        throw m44144("grantUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(Uri uri, int i) {
        throw m44144("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(String str, Uri uri, int i) {
        throw m44144("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeSelfPermissionsOnKill(Collection collection) {
        throw m44144("revokeSelfPermissionsOnKill");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
        throw m44144("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingUriPermission(Uri uri, int i, String str) {
        throw m44144("enforceCallingUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        throw m44144("enforceCallingOrSelfUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        throw m44144("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        if (!this.f61713) {
            if (this.f61694 == null) {
                try {
                    C19041 c19041 = new C19041(this.f61702, this.f61683, this.f61686, this.f61705, this.f61700, this.f61706, this.f61697, true);
                    this.f61694 = c19041;
                    c19041.f61696 = this;
                    Context context = this.f61692;
                    if (context != null) {
                        c19041.f61692 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f61694;
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return this.f61713;
    }

    @InterfaceC19352
    public File getPreloadsFileCache() {
        return getCacheDir();
    }

    @InterfaceC19352
    public void startActivityAsUser(Intent intent, UserHandle userHandle) {
        throw m44144("startActivityAsUser");
    }

    @InterfaceC19352
    public void startActivityAsUser(Intent intent, Bundle bundle, UserHandle userHandle) {
        throw m44144("startActivityAsUser");
    }

    @InterfaceC19352
    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        throw m44144("startActivityForResult");
    }

    @InterfaceC19352
    public int startActivitiesAsUser(Intent[] intentArr, Bundle bundle, UserHandle userHandle) {
        throw m44144("startActivitiesAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, UserHandle userHandle) {
        throw m44144("bindServiceAsUser");
    }

    @InterfaceC19352
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, Handler handler, UserHandle userHandle) {
        throw m44144("bindServiceAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, UserHandle userHandle) {
        throw m44144("bindServiceAsUser");
    }

    @InterfaceC19352
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, Handler handler, UserHandle userHandle) {
        throw m44144("bindServiceAsUser");
    }

    @InterfaceC19352
    public void sendBroadcastMultiplePermissions(Intent intent, String[] strArr) {
        throw m44144("sendBroadcastMultiplePermissions");
    }

    @InterfaceC19352
    public void sendBroadcastAsUserMultiplePermissions(Intent intent, UserHandle userHandle, String[] strArr) {
        throw m44144("sendBroadcastAsUserMultiplePermissions");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        throw m44144("sendBroadcast");
    }

    @InterfaceC19352
    public void sendBroadcast(Intent intent, String str, int i) {
        throw m44144("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC19352
    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        throw m44144("sendOrderedBroadcast");
    }

    @InterfaceC19352
    public void sendOrderedBroadcast(Intent intent, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m44144("sendOrderedBroadcast");
    }

    @InterfaceC19352
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, Bundle bundle) {
        throw m44144("sendBroadcastAsUser");
    }

    @InterfaceC19352
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i) {
        throw m44144("sendBroadcastAsUser");
    }

    @InterfaceC19352
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m44144("sendOrderedBroadcastAsUser");
    }

    @InterfaceC19352
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle2) {
        throw m44144("sendOrderedBroadcastAsUser");
    }

    @InterfaceC19352
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle, Bundle bundle) {
        throw m44144("sendStickyBroadcastAsUser");
    }

    @InterfaceC19352
    public Intent registerReceiverAsUser(BroadcastReceiver broadcastReceiver, UserHandle userHandle, IntentFilter intentFilter, String str, Handler handler) {
        throw m44144("registerReceiverAsUser");
    }

    @InterfaceC19352
    public ComponentName startForegroundServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m44144("startForegroundServiceAsUser");
    }

    @InterfaceC19352
    public ComponentName startServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m44144("startServiceAsUser");
    }

    @InterfaceC19352
    public Context createPackageContextAsUser(String str, int i, UserHandle userHandle) throws PackageManager.NameNotFoundException {
        createPackageContext(str, i);
        return this;
    }

    @InterfaceC19352
    public Context createCredentialProtectedStorageContext() {
        if (this.f61713) {
            if (this.f61696 == null) {
                try {
                    C19041 c19041 = new C19041(this.f61702, this.f61683, this.f61686, this.f61705, this.f61700, this.f61706, this.f61697, false);
                    this.f61696 = c19041;
                    c19041.f61694 = this;
                    Context context = this.f61692;
                    if (context != null) {
                        c19041.f61692 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f61696;
        }
        return this;
    }

    @InterfaceC19352
    public boolean isCredentialProtectedStorage() {
        return !this.f61713;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkCallingOrSelfUriPermissions(List list, int i) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkCallingUriPermissions(List list, int i) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkUriPermissions(List list, int i, int i2, int i3) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SecurityException m44144(String str) {
        return new SecurityException("Decryptor context denied: ".concat(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return this.f61695.remove(str) != null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return (SharedPreferences) C23217.computeIfAbsent(this.f61695, str, new C13105(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44145(File file) {
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r3.startsWith(r2 + java.io.File.separator) != false) goto L6;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m44143(java.io.File r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L33
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L33
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Exception -> L33
            java.io.File r1 = r4.getCanonicalFile()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = r0.getPath()     // Catch: java.lang.Exception -> L33
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L33
            if (r1 != 0) goto L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r1.<init>()     // Catch: java.lang.Exception -> L33
            r1.append(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L33
            r1.append(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L33
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L33
            if (r1 == 0) goto L34
        L32:
            return r0
        L33:
        L34:
            if (r5 != 0) goto L39
            java.lang.String r5 = ""
            goto L42
        L39:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.lang.String r5 = r0.getName()
        L42:
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19041.m44143(java.io.File, java.lang.String):java.io.File");
    }
}
