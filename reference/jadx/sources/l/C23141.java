package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Process;

/* JADX INFO: renamed from: l.᩸᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23141 implements InterfaceC20903 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f75022;

    @Override // l.InterfaceC20903
    /* JADX INFO: renamed from: ۙ */
    public final PackageInstaller.Session mo37456(PackageInstaller.SessionParams sessionParams) throws C4866 {
        IPackageInstaller iPackageInstallerM55314 = C24788.m55314();
        boolean z = C12797.m31705() == 0;
        C6733 c6733 = this.f75022;
        String packageName = z ? c6733.f22436.getPackageName() : "com.android.shell";
        int iHashCode = z ? Process.myUserHandle().hashCode() : 0;
        C16582.m39254(iHashCode, c6733.f22437);
        return C16582.m39250(IPackageInstallerSession.Stub.asInterface(new C5340(iPackageInstallerM55314.openSession(C16582.m39252(iPackageInstallerM55314, C16582.m39253(sessionParams, packageName, c6733.f22437), Build.VERSION.SDK_INT >= 31 ? c6733.f22436.getAttributionTag() : null, iHashCode).createSession(sessionParams)).asBinder())));
    }

    public C23141(C6733 c6733) {
        this.f75022 = c6733;
    }

    @Override // l.InterfaceC20903
    /* JADX INFO: renamed from: ۙ */
    public final void mo37457() {
        this.f75022.m18826(EnumC16427.SHIZUKU);
    }
}
