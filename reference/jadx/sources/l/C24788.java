package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;

/* JADX INFO: renamed from: l.᩻ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes.dex */
public final class C24788 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f80232 = IPackageManager.Stub.asInterface(new C5340(C23240.m52219("package")));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m55314() {
        return IPackageInstaller.Stub.asInterface(new C5340(f80232.getPackageInstaller().asBinder()));
    }
}
