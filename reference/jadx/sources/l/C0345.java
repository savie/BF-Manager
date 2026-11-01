package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;

/* JADX INFO: renamed from: l.֡ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0345 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f1759 = IPackageManager.Stub.asInterface(new C9231(C22406.m49685("package")));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m2003() {
        return IPackageInstaller.Stub.asInterface(new C9231(f1759.getPackageInstaller().asBinder()));
    }
}
