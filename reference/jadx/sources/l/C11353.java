package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۨ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19NA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11353 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13470 f38305 = new C4296();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28434(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28432(Context context) {
        m28433(context, new ExecutorC2053(), f38305, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28433(Context context, Executor executor, InterfaceC13470 interfaceC13470, boolean z) {
        boolean zM17359;
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = j == packageInfo.lastUpdateTime;
                            if (z2) {
                                interfaceC13470.mo12096(2, null);
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    context.getPackageName();
                    C17702.m41237(context, false);
                    return;
                }
            }
            context.getPackageName();
            C6287 c6287 = new C6287(assets, executor, interfaceC13470, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (c6287.m17360()) {
                C6287 c6287M17362 = c6287.m17362();
                c6287M17362.m17361();
                zM17359 = c6287M17362.m17359();
                if (zM17359) {
                    m28434(packageInfo, filesDir);
                }
            } else {
                zM17359 = false;
            }
            if (zM17359 && z) {
                z3 = true;
            }
            C17702.m41237(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC13470.mo12096(7, e);
            C17702.m41237(context, false);
        }
    }
}
