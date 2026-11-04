package l;

import android.content.Context;
import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16582 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInstaller m39252(IPackageInstaller iPackageInstaller, String str, String str2, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Integer.TYPE;
        if (i2 >= 31) {
            return (PackageInstaller) PackageInstaller.class.getConstructor(IPackageInstaller.class, String.class, String.class, cls).newInstance(iPackageInstaller, str, str2, Integer.valueOf(i));
        }
        return i2 >= 26 ? (PackageInstaller) PackageInstaller.class.getConstructor(IPackageInstaller.class, String.class, cls).newInstance(iPackageInstaller, str, Integer.valueOf(i)) : (PackageInstaller) PackageInstaller.class.getConstructor(Context.class, PackageManager.class, IPackageInstaller.class, String.class, cls).newInstance(C21576.m49084(), C21576.m49081(), iPackageInstaller, str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInstaller.Session m39250(IPackageInstallerSession iPackageInstallerSession) {
        return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(iPackageInstallerSession);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInstaller.SessionParams m39251() throws IllegalAccessException {
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        int iIntValue = ((Integer) PackageInstaller.SessionParams.class.getDeclaredField("installFlags").get(sessionParams)).intValue();
        int i = 1048710 | iIntValue;
        if (Build.VERSION.SDK_INT >= 34) {
            i = 17825926 | iIntValue;
        }
        if (Process.myUserHandle().hashCode() != 0) {
            i |= 64;
        }
        PackageInstaller.SessionParams.class.getDeclaredField("installFlags").set(sessionParams, Integer.valueOf(i));
        return sessionParams;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m39255() {
        return C24788.m55314();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39254(int i, String str) throws C4866 {
        if (!str.isEmpty() && !C24788.f80232.isPackageAvailable(str, i)) {
            throw new C4866(C21576.m49059(R.string.MT_Protector, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39253(PackageInstaller.SessionParams sessionParams, String str, String str2) throws IllegalAccessException {
        if (str2.isEmpty()) {
            return str;
        }
        if (!C17394.m40858(str2)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            sessionParams.setInstallerPackageName(str2);
            return str;
        }
        if (i < 28) {
            return str2;
        }
        PackageInstaller.SessionParams.class.getDeclaredField("installerPackageName").set(sessionParams, str2);
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m39256() {
        return C1667.m5993();
    }
}
