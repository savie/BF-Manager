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

/* JADX INFO: renamed from: l.ܰ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 19NA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14849 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4409 f48546 = new C24547();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35779(PackageInfo packageInfo, File file) {
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
    public static void m35777(Context context) {
        m35778(context, new ExecutorC20817(), f48546, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35778(Context context, Executor executor, InterfaceC4409 interfaceC4409, boolean z) {
        boolean zM41686;
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
                                interfaceC4409.mo14028(2, null);
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
                    C2917.m9556(context, false);
                    return;
                }
            }
            context.getPackageName();
            C17833 c17833 = new C17833(assets, executor, interfaceC4409, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (c17833.m41683()) {
                C17833 c17833M41685 = c17833.m41685();
                c17833M41685.m41684();
                zM41686 = c17833M41685.m41686();
                if (zM41686) {
                    m35779(packageInfo, filesDir);
                }
            } else {
                zM41686 = false;
            }
            if (zM41686 && z) {
                z3 = true;
            }
            C2917.m9556(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC4409.mo14028(7, e);
            C2917.m9556(context, false);
        }
    }
}
