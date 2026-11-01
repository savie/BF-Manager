package com.tencent.open.web.security;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import l.C1791;
import l.C23099;
import l.C23805;
import l.C7328;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class JniInterface {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f907;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m925() {
        if (f907) {
            return;
        }
        try {
            Context contextM5862 = C1791.m5862();
            if (contextM5862 == null) {
                C23099.m51113("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + C7328.f24362);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(contextM5862.getFilesDir().toString());
            sb.append("/");
            String str = C7328.f24362;
            sb.append(str);
            File file = new File(sb.toString());
            if (!file.exists()) {
                C23099.m51113("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + str);
            } else {
                if (!m926(contextM5862, file)) {
                    C23099.m51113("openSDK_LOG.JniInterface", "-->fail, because checkMD5 fail:" + str);
                    return;
                }
                System.load(contextM5862.getFilesDir().toString() + "/" + str);
                f907 = true;
                StringBuilder sb2 = new StringBuilder("-->load lib success:");
                sb2.append(str);
                C23099.m51113("openSDK_LOG.JniInterface", sb2.toString());
            }
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.JniInterface", "-->load lib error:" + C7328.f24362, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m926(Context context, File file) {
        Throwable th;
        FileInputStream fileInputStream;
        InputStream inputStream = null;
        strM52452 = null;
        strM52452 = null;
        String strM52452 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(C7328.f24361);
            try {
                String strM52453 = C23805.m52452(inputStreamOpen);
                if (strM52453 == null || strM52453.isEmpty()) {
                    C23099.m51113("openSDK_LOG.JniInterface", "checkMD5 assets md5 is null");
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
                                strM52452 = C23805.m52452(fileInputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    C23099.m51111("MD5Utils", "md5 file error", th);
                                    if (fileInputStream != null) {
                                    }
                                    if (strM52452 != null) {
                                        boolean zEquals = strM52453.equals(strM52452);
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        return zEquals;
                                    }
                                    C23099.m51113("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
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
                    if (strM52452 != null && !strM52452.isEmpty()) {
                        boolean zEquals2 = strM52453.equals(strM52452);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return zEquals2;
                    }
                    C23099.m51113("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
                return false;
            } catch (Throwable th5) {
                th = th5;
                inputStream = inputStreamOpen;
                try {
                    C23099.m51111("openSDK_LOG.JniInterface", "checkMD5 exception", th);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    C23099.m51115("openSDK_LOG.JniInterface", "checkMD5 return false");
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
