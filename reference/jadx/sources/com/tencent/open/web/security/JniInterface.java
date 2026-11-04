package com.tencent.open.web.security;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import l.C1867;
import l.C21587;
import l.C5596;
import l.C8658;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class JniInterface {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f897;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m919() {
        if (f897) {
            return;
        }
        try {
            Context contextM16575 = C5596.m16575();
            if (contextM16575 == null) {
                C21587.m49113("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + C8658.f28264);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(contextM16575.getFilesDir().toString());
            sb.append("/");
            String str = C8658.f28264;
            sb.append(str);
            File file = new File(sb.toString());
            if (!file.exists()) {
                C21587.m49113("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + str);
            } else {
                if (!m920(contextM16575, file)) {
                    C21587.m49113("openSDK_LOG.JniInterface", "-->fail, because checkMD5 fail:" + str);
                    return;
                }
                System.load(contextM16575.getFilesDir().toString() + "/" + str);
                f897 = true;
                StringBuilder sb2 = new StringBuilder("-->load lib success:");
                sb2.append(str);
                C21587.m49113("openSDK_LOG.JniInterface", sb2.toString());
            }
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.JniInterface", "-->load lib error:" + C8658.f28264, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m920(Context context, File file) {
        Throwable th;
        FileInputStream fileInputStream;
        InputStream inputStream = null;
        strM6413 = null;
        strM6413 = null;
        String strM6413 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(C8658.f28263);
            try {
                String strM6414 = C1867.m6413(inputStreamOpen);
                if (strM6414 == null || strM6414.isEmpty()) {
                    C21587.m49113("openSDK_LOG.JniInterface", "checkMD5 assets md5 is null");
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    if (file.exists()) {
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                strM6413 = C1867.m6413(fileInputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    C21587.m49112("MD5Utils", "md5 file error", th);
                                    if (fileInputStream != null) {
                                    }
                                    if (strM6413 != null) {
                                        boolean zEquals = strM6414.equals(strM6413);
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        return zEquals;
                                    }
                                    C21587.m49113("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    return false;
                                } catch (Throwable th3) {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                        }
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (strM6413 != null && !strM6413.isEmpty()) {
                        boolean zEquals2 = strM6414.equals(strM6413);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return zEquals2;
                    }
                    C21587.m49113("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
                return false;
            } catch (Throwable th5) {
                th = th5;
                inputStream = inputStreamOpen;
                try {
                    C21587.m49112("openSDK_LOG.JniInterface", "checkMD5 exception", th);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    C21587.m49116("openSDK_LOG.JniInterface", "checkMD5 return false");
                    return false;
                } catch (Throwable th6) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
