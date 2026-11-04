package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.֫ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1667 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f5768 = IPackageManager.Stub.asInterface(Dhizuku.binderWrapper(C23240.m52219("package")));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m5993() {
        return IPackageInstaller.Stub.asInterface(Dhizuku.binderWrapper(f5768.getPackageInstaller().asBinder()));
    }
}
