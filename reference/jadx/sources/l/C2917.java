package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2917 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C11827 f9535 = C11827.m29677();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f9534 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9628 f9536 = null;

    /* JADX WARN: Code duplicated, block: B:109:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9556(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        C1426 c1426M5161;
        int i3;
        C1426 c1426;
        int i4;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f9536 == null) {
            synchronized (f9534) {
                if (!z) {
                    if (f9536 != null) {
                        return;
                    }
                    i = 0;
                    try {
                        assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                        try {
                            if (assetFileDescriptorOpenFd.getLength() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th) {
                            if (assetFileDescriptorOpenFd == null) {
                                throw th;
                            }
                            try {
                                assetFileDescriptorOpenFd.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException unused) {
                        z2 = false;
                    }
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28 && i2 != 30) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists() || length2 <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        try {
                            long jM9554 = m9554(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    c1426M5161 = C1426.m5161(file3);
                                } catch (IOException unused2) {
                                    m9555();
                                    return;
                                }
                            } else {
                                c1426M5161 = null;
                            }
                            if (c1426M5161 == null && c1426M5161.f5018 == jM9554 && (i4 = c1426M5161.f5017) != 2) {
                                i = i4;
                            } else if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                            if (z && z4 && i != 1) {
                                i = 2;
                            }
                            if (c1426M5161 == null && c1426M5161.f5017 == 2 && i == 1 && length2 < c1426M5161.f5016) {
                                i3 = 3;
                            } else {
                                i3 = i;
                            }
                            c1426 = new C1426(1, i3, jM9554, length);
                            if (c1426M5161 != null || !c1426M5161.equals(c1426)) {
                                try {
                                    c1426.m5162(file3);
                                } catch (IOException unused3) {
                                }
                            }
                            m9555();
                            return;
                        } catch (PackageManager.NameNotFoundException unused4) {
                            m9555();
                            return;
                        }
                    }
                    m9555();
                    return;
                }
                i = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                assetFileDescriptorOpenFd.close();
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jM9555 = m9554(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        c1426M5161 = C1426.m5161(file3);
                    } else {
                        c1426M5161 = null;
                    }
                    if (c1426M5161 == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (c1426M5161 == null) {
                        i3 = i;
                    } else {
                        i3 = i;
                    }
                    c1426 = new C1426(1, i3, jM9555, length);
                    if (c1426M5161 != null) {
                        c1426.m5162(file3);
                    } else {
                        c1426.m5162(file3);
                    }
                    m9555();
                    return;
                }
                m9555();
                return;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9628 m9555() {
        C9628 c9628 = new C9628();
        f9536 = c9628;
        f9535.m29678(c9628);
        return f9536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m9554(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C10374.m26679(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
