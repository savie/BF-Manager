package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.ܺۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15828 implements InterfaceC3126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f51231;

    @Override // l.InterfaceC3126
    /* JADX INFO: renamed from: ۙ */
    public final PackageInstaller.Session mo9429(PackageInstaller.SessionParams sessionParams) {
        IPackageInstaller iPackageInstallerM37747 = C15869.m37747();
        this.f51231.m33506();
        return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(Dhizuku.binderWrapper(iPackageInstallerM37747.openSession(C16574.m38983(iPackageInstallerM37747, Dhizuku.getOwnerPackageName(), null, 0).createSession(sessionParams)).asBinder())));
    }

    public C15828(C13752 c13752) {
        this.f51231 = c13752;
    }

    @Override // l.InterfaceC3126
    /* JADX INFO: renamed from: ۙ */
    public final void mo9430() {
        this.f51231.m33511(EnumC23589.DHIZUKU);
    }
}
