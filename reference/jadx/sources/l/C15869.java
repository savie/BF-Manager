package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.ܺۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15869 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f51348 = IPackageManager.Stub.asInterface(Dhizuku.binderWrapper(C22406.m49685("package")));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m37747() {
        return IPackageInstaller.Stub.asInterface(Dhizuku.binderWrapper(f51348.getPackageInstaller().asBinder()));
    }
}
