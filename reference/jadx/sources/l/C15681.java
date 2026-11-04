package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.ܳ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15681 implements InterfaceC20903 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f50987;

    @Override // l.InterfaceC20903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PackageInstaller.Session mo37456(PackageInstaller.SessionParams sessionParams) {
        IPackageInstaller iPackageInstallerM5993 = C1667.m5993();
        this.f50987.m18821();
        return C16582.m39250(IPackageInstallerSession.Stub.asInterface(Dhizuku.binderWrapper(iPackageInstallerM5993.openSession(C16582.m39252(iPackageInstallerM5993, Dhizuku.getOwnerPackageName(), null, 0).createSession(sessionParams)).asBinder())));
    }

    public C15681(C6733 c6733) {
        this.f50987 = c6733;
    }

    @Override // l.InterfaceC20903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37457() {
        this.f50987.m18826(EnumC16427.DHIZUKU);
    }
}
