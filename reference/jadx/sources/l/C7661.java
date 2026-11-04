package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7661 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f25235;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f25236;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9897 f25237;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f25238;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f25239;

    public C7661(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, C9897 c9897, Runnable runnable) {
        this.f25238 = abstractActivityC17204;
        this.f25235 = abstractC22044;
        this.f25237 = c9897;
        this.f25236 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f25238);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27391(R.string.MT_Protector);
        c10745.mo25931();
        this.f25239 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("term/bin");
        abstractC22044M49876.mo4296();
        abstractC22044M49876.m49853();
        C22941 c22941 = new C22941(this.f25235);
        try {
            String strM3776 = C0949.m3776(c22941);
            C3374 c3374 = new C3374(c22941.m51749());
            C10745 c10745 = this.f25239;
            C17359.requireNonNull(c10745);
            c3374.m11078(new C21151(c10745));
            for (C8002 c8002 : c22941.m51742()) {
                c3374.m11079(1);
                if (!c8002.isDirectory()) {
                    String name = c8002.getName();
                    if (name.startsWith(strM3776)) {
                        String strSubstring = name.substring(strM3776.length());
                        if (strSubstring.contains("/")) {
                            continue;
                        } else {
                            System.out.println("Extract: bin/" + strSubstring);
                            AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876(strSubstring);
                            abstractC22044M49877.m49840(c22941.m51727(c8002));
                            if (!new File(abstractC22044M49877.mo4278()).setExecutable(true, false)) {
                                throw new Exception("Set Executable Failed: " + abstractC22044M49877.mo4278());
                            }
                        }
                    }
                }
            }
            C0949.m3775(c22941, null);
            c22941.close();
            AbstractC22044 abstractC22044M49878 = C6382.f21568.m49876("term/version");
            C6178 c6178 = new C6178();
            C9897 c9897 = this.f25237;
            c6178.writeInt(c9897.f31826);
            c6178.m17800(c9897.f31824);
            abstractC22044M49878.mo4296();
            abstractC22044M49878.m49844(c6178);
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ServiceC17530.m41157();
        C20340.m46730();
        this.f25236.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f25238.m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f25236.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f25239.m27405();
    }
}
