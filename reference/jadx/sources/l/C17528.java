package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56975 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC17249 f56976 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41146(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        if (i != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41149(Context context, String str) {
        String strM41145 = m41145();
        if (context != null && str != null && strM41145 != null && !"com.tencent.mobileqq".equals(str)) {
            "com.tencent.tim".equals(str);
        }
        PackageInfo packageInfoM41154 = m41154(context, str);
        if (packageInfoM41154 == null) {
            C21587.m49116("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return packageInfoM41154.versionName;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static PackageInfo m41154(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (C17528.class) {
            ConcurrentMapC17249 concurrentMapC17249 = f56976;
            if (concurrentMapC17249.containsKey(str)) {
                C3930 c3930 = (C3930) concurrentMapC17249.get(str);
                if (c3930 == null) {
                    C21587.m49116("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = c3930.f13420;
                if (packageInfo == null) {
                    C21587.m49116("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            }
            PackageInfo packageInfoM41153 = m41153(context, str);
            concurrentMapC17249.put(str, new C3930(packageInfoM41153));
            return packageInfoM41153;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m41153(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                C21587.m49116("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            }
            return packageInfo;
        } catch (Exception e) {
            if (e instanceof PackageManager.NameNotFoundException) {
                C21587.m49116("openSDK_LOG.SystemUtils", "realGetPackageInfo NameNotFoundException. packageName= " + str);
                return null;
            }
            C21587.m49112("openSDK_LOG.SystemUtils", "realGetPackageInfo Exception. packageName= " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41144(String str, String str2) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i) {
            return 1;
        }
        return strArrSplit2.length > i ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41152(Context context, Intent intent) {
        boolean z = false;
        if (context != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                C21587.m49113("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String strM41149 = m41149(context, packageName);
            if (strM41149 != null && !strM41149.isEmpty()) {
                z = true;
            }
            C21587.m49113("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + strM41149);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41148(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.SystemUtils", "getAppName exception", th);
            try {
                int i = applicationInfo.labelRes;
                return i <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
            } catch (Throwable th2) {
                C21587.m49112("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th2);
                return "";
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41151(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        C21587.m49113("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: ".concat(str));
        Context contextM16575 = C5596.m16575();
        if (contextM16575 == null) {
            C21587.m49113("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return;
        }
        SharedPreferences sharedPreferences = contextM16575.getSharedPreferences("secure_lib", 0);
        File file = new File(contextM16575.getFilesDir(), str2);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        } else {
            int i = sharedPreferences.getInt("version", 0);
            C21587.m49113("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: 6 | oldVersion: " + i);
            if (6 == i) {
                return;
            }
        }
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpen = contextM16575.getAssets().open(str);
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = contextM16575.openFileOutput(str2, 0);
                    try {
                        m41150(inputStreamOpen, fileOutputStreamOpenFileOutput);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt("version", 6);
                        editorEdit.commit();
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStreamOpenFileOutput;
                        FileOutputStream fileOutputStream4 = fileOutputStream2;
                        inputStream = inputStreamOpen;
                        fileOutputStream = fileOutputStream4;
                        try {
                            C21587.m49112("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (fileOutputStream == null) {
                            } else {
                                fileOutputStream.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused5) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream3 = fileOutputStreamOpenFileOutput;
                        FileOutputStream fileOutputStream5 = fileOutputStream3;
                        inputStream = inputStreamOpen;
                        fileOutputStream = fileOutputStream5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused6) {
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41150(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                fileOutputStream.write(bArr, 0, i);
                j += (long) i;
            } else {
                C21587.m49113("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m41155(Context context) {
        m41145();
        boolean z = m41154(context, "com.tencent.mobileqq") != null;
        C21587.m49113("openSDK_LOG.SystemUtils", "isQQInstalled " + z);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41147(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            C21587.m49113("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            C21587.m49112("openSDK_LOG.SystemUtils", "NameNotFoundException", e);
            return null;
        } catch (Exception e2) {
            C21587.m49112("openSDK_LOG.SystemUtils", "Exception", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41145() {
        String strM7505 = C2196.m7505();
        if (strM7505 != null && !strM7505.isEmpty()) {
            return strM7505;
        }
        C21587.m49116("openSDK_LOG.SystemUtils", "getAppId error: " + strM7505);
        return strM7505;
    }
}
