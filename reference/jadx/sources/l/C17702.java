package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17702 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C11899 f56212 = C11899.m29685();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f56211 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21230 f56213 = null;

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41237(Context context, boolean z) {
        int i;
        File file;
        int i2;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        C14881 c14881M35577;
        int i3;
        C14881 c14881;
        int i4;
        if (z || f56213 == null) {
            synchronized (f56211) {
                if (!z) {
                    if (f56213 != null) {
                        return;
                    }
                    i = Build.VERSION.SDK_INT;
                    if (i >= 28 && i != 30) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        i2 = 0;
                        if (file.exists() || length2 <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        try {
                            long jM41235 = m41235(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    c14881M35577 = C14881.m35577(file3);
                                } catch (IOException unused) {
                                    m41236();
                                    return;
                                }
                            } else {
                                c14881M35577 = null;
                            }
                            if (c14881M35577 == null && c14881M35577.f48640 == jM41235 && (i4 = c14881M35577.f48639) != 2) {
                                i2 = i4;
                            } else if (z2) {
                                i2 = 1;
                            } else if (z3) {
                                i2 = 2;
                            }
                            if (z && z3 && i2 != 1) {
                                i2 = 2;
                            }
                            if (c14881M35577 == null && c14881M35577.f48639 == 2 && i2 == 1 && length2 < c14881M35577.f48638) {
                                i3 = 3;
                            } else {
                                i3 = i2;
                            }
                            c14881 = new C14881(1, i3, jM41235, length);
                            if (c14881M35577 != null || !c14881M35577.equals(c14881)) {
                                try {
                                    c14881.m35578(file3);
                                } catch (IOException unused2) {
                                }
                            }
                            m41236();
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            m41236();
                            return;
                        }
                    }
                    m41236();
                    return;
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    i2 = 0;
                    if (file.exists()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    long jM41236 = m41235(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        c14881M35577 = C14881.m35577(file3);
                    } else {
                        c14881M35577 = null;
                    }
                    if (c14881M35577 == null) {
                        if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (c14881M35577 == null) {
                        i3 = i2;
                    } else {
                        i3 = i2;
                    }
                    c14881 = new C14881(1, i3, jM41236, length);
                    if (c14881M35577 != null) {
                        c14881.m35578(file3);
                    } else {
                        c14881.m35578(file3);
                    }
                    m41236();
                    return;
                }
                m41236();
                return;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21230 m41236() {
        C21230 c21230 = new C21230();
        f56213 = c21230;
        f56212.m29686(c21230);
        return f56213;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41235(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C22642.m50177(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
