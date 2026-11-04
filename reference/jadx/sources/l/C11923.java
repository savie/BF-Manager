package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11923 implements InterfaceC17583 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC0848 f38414;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f38416;

    public C11923(ActivityC0848 activityC0848, C25350 c25350, boolean z) {
        this.f38416 = c25350;
        this.f38414 = activityC0848;
        this.f38415 = z;
        if (c25350.f81831 == null) {
            C11967 c11967 = (C11967) ((C22761) new C16196(activityC0848).m38422(C22761.class)).m51322().m40346();
            C17359.requireNonNull(c11967);
            c25350.f81831 = c11967;
        }
        if (c25350.f81857 == null) {
            c25350.f81857 = (C12318) new C16196(activityC0848).m38422(C12318.class);
        }
    }

    @Override // l.InterfaceC17583
    public final String getTitle() {
        return this.f38416.mo1445();
    }

    @Override // l.InterfaceC17583
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29882() {
        if (this.f38416.f81856) {
            C24132 c24132 = this.f38416.f81832;
            m29880(c24132.m54021().toString());
            if (this.f38415) {
                this.f38416.f29441.putBoolean("changed", false);
                C25350 c25350 = this.f38416;
                c25350.m24172(c25350.f81831.m11163());
                InterfaceC19777 interfaceC19777Mo1447 = this.f38416.mo1447();
                if (interfaceC19777Mo1447 != null) {
                    C22366 c22366 = (C22366) interfaceC19777Mo1447;
                    c22366.mo34769();
                    c22366.mo34768();
                }
            }
            c24132.m54103();
            return;
        }
        this.f38416.f81857.m30724();
        C25350 c25351 = this.f38416;
        C9378 c9378M24173 = c25351.m24173(c25351.f81831.m11163());
        C20348 c20348M46740 = C20348.m46740(c9378M24173.m24700());
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253410);
        int i = c20348M46740.readInt();
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253410);
        if (i == this.f38416.f81831.m29987(this.f38416.m56683())) {
            C25350 c25352 = this.f38416;
            m29880(C13731.m33555(c20348M46740, c25352.m24166(c25352.f81831.m11163()).m24699()));
        } else {
            m29880(this.f38416.f81831.m29993(this.f38416.m56683()));
        }
        if (this.f38415) {
            this.f38416.f29441.putBoolean("changed", false);
            C25350 c25353 = this.f38416;
            c25353.m24172(c25353.f81831.m11163());
            C13731.m33552(c20348M46740);
            C6929.m19210(4, this.f38416.f81831.m29987(this.f38416.m56683()), c20348M46740.f65270);
            synchronized (this.f38416) {
                byte[] bArr = c20348M46740.f65270;
                int i2 = C15768.f51344;
                c9378M24173.m24696(C15768.m37706(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29880(String str) throws IOException {
        C25350 c25350 = this.f38416;
        String strM56683 = c25350.m56683();
        c25350.f81831.m30001(strM56683, str);
        if (strM56683.endsWith("package-info") || strM56683.endsWith("type-info")) {
            this.f38414.m3425().m51324();
        }
    }

    @Override // l.InterfaceC17583
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Exception mo29881(Exception exc) {
        int iM24888;
        C25350 c25350 = this.f38416;
        if (!c25350.f81856) {
            return exc instanceof C10254 ? new C17692(c25350.m56683(), (C10254) exc) : exc;
        }
        this.f38414.m40401(exc, (DialogInterface.OnDismissListener) null);
        if ((exc instanceof C10254) && (iM24888 = ((C10254) exc).m26443().m24888()) != -1) {
            c25350.f81832.m54024(iM24888 - 1);
        }
        return null;
    }
}
