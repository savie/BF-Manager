package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7360 implements InterfaceC3126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f24433;

    @Override // l.InterfaceC3126
    /* JADX INFO: renamed from: ۙ */
    public final PackageInstaller.Session mo9429(PackageInstaller.SessionParams sessionParams) throws C4987 {
        IPackageInstaller iPackageInstallerM2003 = C0345.m2003();
        boolean z = C1468.m5094() == 0;
        C13752 c13752 = this.f24433;
        String packageName = z ? c13752.f45340.getPackageName() : "com.android.shell";
        int iHashCode = z ? Process.myUserHandle().hashCode() : 0;
        String str = c13752.f45342;
        if (str.isEmpty() || C0345.f1759.isPackageAvailable(str, iHashCode)) {
            return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(new C9231(iPackageInstallerM2003.openSession(C16574.m38983(iPackageInstallerM2003, C16574.m38984(sessionParams, packageName, c13752.f45342), Build.VERSION.SDK_INT >= 31 ? c13752.f45340.getAttributionTag() : null, iHashCode).createSession(sessionParams)).asBinder())));
        }
        throw new C4987(C16737.m39264(R.string.MT_Protector, str));
    }

    public C7360(C13752 c13752) {
        this.f24433 = c13752;
    }

    @Override // l.InterfaceC3126
    /* JADX INFO: renamed from: ۙ */
    public final void mo9430() {
        this.f24433.m33511(EnumC23589.SHIZUKU);
    }
}
