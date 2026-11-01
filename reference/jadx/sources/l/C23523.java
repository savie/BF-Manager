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

/* JADX INFO: renamed from: l.᩻ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes.dex */
public class C23523 extends ContextWrapper {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76125 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f76128;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23523 f76129;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f76130;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AssetManager f76131;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f76132;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final File f76133;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f76134;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final File f76135;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14351 f76136;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final File f76137;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23523 f76138;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final File f76139;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Resources f76140;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f76141;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final File f76142;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Signature f76143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f76144;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Context f76145;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final WindowManagerC3060 f76146;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final File f76147;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final File f76148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ApplicationInfo f76149;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final File f76150;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final File f76151;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final File f76152;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final File f76153;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f76154;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f76155;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final File f76156;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9412 f76157;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final File f76158;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f76159;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f76160;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10823 f76161;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ContentResolver f76162;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f76163;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final File f76164;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f76127 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorC5883 f76126 = new ExecutorC5883();

    @InterfaceC16341
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

    @InterfaceC16341
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

    @InterfaceC16341
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
    @InterfaceC16341
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

    @InterfaceC16341
    public boolean stopServiceAsUser(Intent intent, UserHandle userHandle) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }

    @InterfaceC16341
    public void updateDisplay(int i) {
    }

    public C23523(Context context, File file, Signature signature, C14351 c14351, File file2, File file3, String str) {
        this(C10823.m27136(context, file), file, signature, c14351, file2, file3, str, false);
    }

    public C23523(C10823 c10823, File file, Signature signature, C14351 c14351, File file2, File file3, String str, boolean z) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        String str2;
        int i;
        int iIndexOf;
        super(null);
        this.f76141 = new ConcurrentMapC13783();
        this.f76161 = c10823;
        this.f76136 = c14351;
        this.f76143 = signature;
        this.f76163 = z;
        File canonicalFile = file.getCanonicalFile();
        this.f76134 = canonicalFile;
        this.f76156 = file2.getCanonicalFile();
        File canonicalFile2 = file3.getCanonicalFile();
        this.f76158 = canonicalFile2;
        canonicalFile2 = z ? new File(canonicalFile2, "device_protected").getCanonicalFile() : canonicalFile2;
        this.f76148 = canonicalFile2;
        File file4 = new File(canonicalFile2, "files");
        this.f76152 = file4;
        File file5 = new File(canonicalFile2, "no_backup");
        File file6 = new File(canonicalFile2, "cache");
        File file7 = new File(canonicalFile2, "code_cache");
        File file8 = new File(canonicalFile2, "obb");
        File file9 = new File(canonicalFile2, "databases");
        this.f76133 = file9;
        File file10 = new File(canonicalFile2, "shared_prefs");
        m51811(canonicalFile2);
        m51811(file4);
        m51811(file5);
        m51811(file6);
        m51811(file7);
        m51811(file8);
        m51811(file9);
        m51811(file10);
        PackageInfo packageInfoM27137 = C10823.m27137(c10823);
        ApplicationInfo applicationInfo = packageInfoM27137.applicationInfo;
        this.f76149 = applicationInfo;
        applicationInfo.flags |= 8388608;
        String str3 = applicationInfo.packageName;
        this.f76139 = new File(C16523.m38890("/data/app/", str3, "-1/base.apk"));
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
                this.f76132 = str2;
                File file11 = new File(C7997.m21055("/data/app/", str3, "-1/lib/", str2));
                File file12 = new File(C0252.m1693("/data/data/", str3));
                this.f76128 = file12;
                File file13 = new File(C0252.m1693("/data/user/0/", str3));
                this.f76159 = file13;
                File file14 = new File(C0252.m1693("/data/user_de/0/", str3));
                this.f76130 = file14;
                this.f76142 = new File(file12, "files");
                this.f76135 = new File(file12, "no_backup");
                this.f76160 = new File(file12, "cache");
                this.f76153 = new File(file12, "code_cache");
                this.f76150 = new File(file12, "obb");
                this.f76154 = new File(file12, "databases");
                this.f76144 = new File(file14, "files");
                this.f76164 = new File(file14, "no_backup");
                this.f76147 = new File(file14, "cache");
                this.f76155 = new File(file14, "code_cache");
                this.f76151 = new File(file14, "obb");
                this.f76137 = new File(file14, "databases");
                this.f76149.uid = Process.myUid();
                ApplicationInfo applicationInfo2 = this.f76149;
                applicationInfo2.processName = str3;
                applicationInfo2.nativeLibraryDir = file11.getPath();
                this.f76149.sourceDir = this.f76139.getPath();
                this.f76149.publicSourceDir = this.f76139.getPath();
                this.f76149.dataDir = (this.f76163 ? file14 : file12).getPath();
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f76149.deviceProtectedDataDir = file14.getPath();
                    ApplicationInfo applicationInfo3 = this.f76149;
                    String path = file13.getPath();
                    try {
                        Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                        declaredField.setAccessible(true);
                        declaredField.set(applicationInfo3, path);
                    } catch (Throwable unused) {
                    }
                }
                c14351.m34591(this.f76149);
                if (signature != null) {
                    i = 1;
                    packageInfoM27137.signatures = new Signature[]{signature};
                } else {
                    i = 1;
                }
                AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                this.f76131 = assetManager;
                Class[] clsArr = new Class[i];
                clsArr[0] = String.class;
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", clsArr);
                Object[] objArr = new Object[i];
                objArr[0] = this.f76134.getPath();
                declaredMethod.invoke(assetManager, objArr);
                Resources resources = new Resources(assetManager, C10823.m27138(c10823), C10823.m27135(c10823));
                this.f76140 = resources;
                this.f76157 = new C9412(packageInfoM27137, this.f76149, resources, str3);
                this.f76162 = new C1649(this);
                this.f76146 = new WindowManagerC3060();
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m51816() {
        return this.f76132;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f76131;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f76140;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.f76157;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ContentResolver getContentResolver() {
        return this.f76162;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Looper getMainLooper() {
        return Looper.getMainLooper();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Executor getMainExecutor() {
        return f76126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51815(Context context) {
        this.f76145 = context;
        C23523 c23523 = this.f76138;
        if (c23523 != null) {
            c23523.f76145 = context;
        }
        C23523 c23524 = this.f76129;
        if (c23524 != null) {
            c23524.f76145 = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context context = this.f76145;
        return context != null ? context : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File m51814() {
        return this.f76159;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File m51817() {
        return this.f76130;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.f76140.newTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f76136;
    }

    @InterfaceC16341
    public Context createApplicationContext(ApplicationInfo applicationInfo, int i) throws PackageManager.NameNotFoundException {
        if (applicationInfo == null || !this.f76149.packageName.equals(applicationInfo.packageName)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.f76149.packageName.equals(str)) {
            return this;
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    @InterfaceC16341
    public String getBasePackageName() {
        return this.f76149.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC16341
    public String getOpPackageName() {
        return this.f76149.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return this.f76149.packageName;
    }

    @InterfaceC16341
    public String reloadSharedPreferences() {
        return this.f76149.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return this.f76149;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageResourcePath() {
        return this.f76139.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageCodePath() {
        return this.f76139.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileInputStream openFileInput(String str) {
        return new FileInputStream(m51809(this.f76152, str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileOutputStream openFileOutput(String str, int i) {
        File fileM51809 = m51809(this.f76152, str);
        File parentFile = fileM51809.getParentFile();
        if (parentFile != null) {
            m51811(parentFile);
        }
        return new FileOutputStream(fileM51809, (i & 32768) != 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteFile(String str) {
        return m51809(this.f76152, str).delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] fileList() {
        String[] list = this.f76152.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        String strM1693 = C0252.m1693("app_", str);
        m51811(m51809(this.f76148, strM1693));
        return m51809(this.f76163 ? this.f76130 : this.f76128, strM1693);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        m51811(this.f76133);
        return m51809(this.f76163 ? this.f76137 : this.f76154, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] databaseList() {
        String[] list = this.f76133.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteDatabase(String str) {
        File file = this.f76133;
        m51811(file);
        File fileM51809 = m51809(file, str);
        return new File(fileM51809.getPath() + "-shm").delete() | fileM51809.delete() | new File(fileM51809.getPath() + "-journal").delete() | new File(fileM51809.getPath() + "-wal").delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        File file = this.f76133;
        m51811(file);
        return SQLiteDatabase.openOrCreateDatabase(m51809(file, str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        File file = this.f76133;
        m51811(file);
        return SQLiteDatabase.openOrCreateDatabase(m51809(file, str).getPath(), cursorFactory, databaseErrorHandler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.f76163 ? this.f76147 : this.f76160;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCodeCacheDir() {
        return this.f76163 ? this.f76155 : this.f76153;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDataDir() {
        return this.f76163 ? this.f76130 : this.f76128;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalCacheDir() {
        return this.f76163 ? this.f76147 : this.f76160;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        return new File[]{this.f76163 ? this.f76147 : this.f76160};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        return this.f76163 ? this.f76144 : this.f76142;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(String str) {
        return new File[]{this.f76163 ? this.f76144 : this.f76142};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalMediaDirs() {
        return new File[]{this.f76163 ? this.f76144 : this.f76142};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFileStreamPath(String str) {
        return m51809(this.f76163 ? this.f76144 : this.f76142, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.f76163 ? this.f76144 : this.f76142;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getNoBackupFilesDir() {
        return this.f76163 ? this.f76164 : this.f76135;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getObbDir() {
        return this.f76163 ? this.f76151 : this.f76150;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getObbDirs() {
        return new File[]{this.f76163 ? this.f76151 : this.f76150};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m51808(PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        ProviderInfo[] providerInfoArr;
        long jLongValue;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m51813(packageInfo.activities);
        packageInfo2.receivers = m51813(packageInfo.receivers);
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
    public static ActivityInfo[] m51813(ActivityInfo[] activityInfoArr) {
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
        throw m51810("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        throw m51810("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        throw m51810("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        throw m51810("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        throw m51810("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        throw m51810("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent) {
        throw m51810("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent, String str) {
        throw m51810("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str) {
        throw m51810("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m51810("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m51810("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        throw m51810("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m51810("sendOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcast(Intent intent) {
        throw m51810("sendStickyBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m51810("sendStickyOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m51810("sendStickyBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m51810("sendStickyOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw m51810("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        throw m51810("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        throw m51810("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        throw m51810("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startService(Intent intent) {
        throw m51810("startService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        throw m51810("startForegroundService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        throw m51810("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags) {
        throw m51810("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        throw m51810("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, Context.BindServiceFlags bindServiceFlags, Executor executor, ServiceConnection serviceConnection) {
        throw m51810("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindIsolatedService(Intent intent, int i, String str, Executor executor, ServiceConnection serviceConnection) {
        throw m51810("bindIsolatedService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void updateServiceGroup(ServiceConnection serviceConnection, int i, int i2) {
        throw m51810("updateServiceGroup");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        throw m51810("startInstrumentation");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (str.equals("window")) {
            return this.f76146;
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
        throw m51810("enforcePermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingPermission(String str, String str2) {
        throw m51810("enforceCallingPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfPermission(String str, String str2) {
        throw m51810("enforceCallingOrSelfPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void grantUriPermission(String str, Uri uri, int i) {
        throw m51810("grantUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(Uri uri, int i) {
        throw m51810("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(String str, Uri uri, int i) {
        throw m51810("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeSelfPermissionsOnKill(Collection collection) {
        throw m51810("revokeSelfPermissionsOnKill");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
        throw m51810("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingUriPermission(Uri uri, int i, String str) {
        throw m51810("enforceCallingUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        throw m51810("enforceCallingOrSelfUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        throw m51810("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        if (!this.f76163) {
            if (this.f76138 == null) {
                try {
                    C23523 c23523 = new C23523(this.f76161, this.f76134, this.f76143, this.f76136, this.f76156, this.f76158, this.f76132, true);
                    this.f76138 = c23523;
                    c23523.f76129 = this;
                    Context context = this.f76145;
                    if (context != null) {
                        c23523.f76145 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f76138;
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return this.f76163;
    }

    @InterfaceC16341
    public File getPreloadsFileCache() {
        return getCacheDir();
    }

    @InterfaceC16341
    public void startActivityAsUser(Intent intent, UserHandle userHandle) {
        throw m51810("startActivityAsUser");
    }

    @InterfaceC16341
    public void startActivityAsUser(Intent intent, Bundle bundle, UserHandle userHandle) {
        throw m51810("startActivityAsUser");
    }

    @InterfaceC16341
    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        throw m51810("startActivityForResult");
    }

    @InterfaceC16341
    public int startActivitiesAsUser(Intent[] intentArr, Bundle bundle, UserHandle userHandle) {
        throw m51810("startActivitiesAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC16341
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, UserHandle userHandle) {
        throw m51810("bindServiceAsUser");
    }

    @InterfaceC16341
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, Handler handler, UserHandle userHandle) {
        throw m51810("bindServiceAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC16341
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, UserHandle userHandle) {
        throw m51810("bindServiceAsUser");
    }

    @InterfaceC16341
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, Handler handler, UserHandle userHandle) {
        throw m51810("bindServiceAsUser");
    }

    @InterfaceC16341
    public void sendBroadcastMultiplePermissions(Intent intent, String[] strArr) {
        throw m51810("sendBroadcastMultiplePermissions");
    }

    @InterfaceC16341
    public void sendBroadcastAsUserMultiplePermissions(Intent intent, UserHandle userHandle, String[] strArr) {
        throw m51810("sendBroadcastAsUserMultiplePermissions");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC16341
    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        throw m51810("sendBroadcast");
    }

    @InterfaceC16341
    public void sendBroadcast(Intent intent, String str, int i) {
        throw m51810("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC16341
    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        throw m51810("sendOrderedBroadcast");
    }

    @InterfaceC16341
    public void sendOrderedBroadcast(Intent intent, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m51810("sendOrderedBroadcast");
    }

    @InterfaceC16341
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, Bundle bundle) {
        throw m51810("sendBroadcastAsUser");
    }

    @InterfaceC16341
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i) {
        throw m51810("sendBroadcastAsUser");
    }

    @InterfaceC16341
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m51810("sendOrderedBroadcastAsUser");
    }

    @InterfaceC16341
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle2) {
        throw m51810("sendOrderedBroadcastAsUser");
    }

    @InterfaceC16341
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle, Bundle bundle) {
        throw m51810("sendStickyBroadcastAsUser");
    }

    @InterfaceC16341
    public Intent registerReceiverAsUser(BroadcastReceiver broadcastReceiver, UserHandle userHandle, IntentFilter intentFilter, String str, Handler handler) {
        throw m51810("registerReceiverAsUser");
    }

    @InterfaceC16341
    public ComponentName startForegroundServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m51810("startForegroundServiceAsUser");
    }

    @InterfaceC16341
    public ComponentName startServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m51810("startServiceAsUser");
    }

    @InterfaceC16341
    public Context createPackageContextAsUser(String str, int i, UserHandle userHandle) throws PackageManager.NameNotFoundException {
        createPackageContext(str, i);
        return this;
    }

    @InterfaceC16341
    public Context createCredentialProtectedStorageContext() {
        if (this.f76163) {
            if (this.f76129 == null) {
                try {
                    C23523 c23523 = new C23523(this.f76161, this.f76134, this.f76143, this.f76136, this.f76156, this.f76158, this.f76132, false);
                    this.f76129 = c23523;
                    c23523.f76138 = this;
                    Context context = this.f76145;
                    if (context != null) {
                        c23523.f76145 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f76129;
        }
        return this;
    }

    @InterfaceC16341
    public boolean isCredentialProtectedStorage() {
        return !this.f76163;
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
    public static SecurityException m51810(String str) {
        return new SecurityException("Decryptor context denied: ".concat(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return this.f76141.remove(str) != null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return (SharedPreferences) C2492.computeIfAbsent(this.f76141, str, new C13688(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51811(File file) {
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
    public static java.io.File m51809(java.io.File r4, java.lang.String r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: l.C23523.m51809(java.io.File, java.lang.String):java.io.File");
    }
}
