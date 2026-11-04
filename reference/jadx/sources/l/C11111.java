package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11111 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35028;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f35029;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19647 f35030;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f35031;

    public C11111(C16332 c16332, String str) {
        this.f35029 = c16332;
        this.f35028 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C16332 c16332 = this.f35029;
        c16332.f53032.m53900(c16332.f53043, true, false);
        c16332.f53046 = true;
        c16332.f53031 = false;
        c16332.f53025.m52807(".smali");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        C16332 c16332 = this.f35029;
        c16332.f53041.m30724();
        if (c16332.f53026) {
            this.f35030 = C19647.m45292(c16332.f53033.m46609(c16332.f53033.m46600(c16332.m38820())).f23465);
            C9378 c9378M24173 = c16332.m24173(c16332.f53033.m11163());
            if (c9378M24173.m24702()) {
                try {
                    if (C16332.m38782(c16332, C20348.m46740(c9378M24173.m24700()))) {
                        this.f35031 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c16332.f53026) {
                String strM46622 = c16332.f53033.m46622(this.f35028);
                if (c16332.f53026) {
                    C24132 c24132 = c16332.f53032;
                    c24132.m53930(c16332.m24166(c16332.f53033.m11163()).m24699(), strM46622);
                    if (c16332.f53026) {
                        while (c16332.f53026 && c24132.m53884()) {
                            SystemClock.sleep(10L);
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C16332 c16332 = this.f35029;
        if (c16332.f53026) {
            c16332.f53032.m53924(new C8837((ActivityC0848) c16332.requireActivity(), this.f35030));
            if (this.f35031) {
                c16332.f53032.m54105();
                if (c16332.f53023 != null) {
                    c16332.f53023.setEnabled(!c16332.f53032.m54083());
                    c16332.f53028.setChecked(c16332.f53032.m54083());
                }
                C16332.m38807(c16332);
                c16332.f53032.invalidate();
            } else {
                c16332.f53032.m54093();
                c16332.f53032.m54016(false);
                c16332.f53032.m54048();
            }
            c16332.f29441.putBoolean("changed", c16332.f53032.m53890());
            try {
                c16332.m24172(c16332.f53033.m11163());
            } catch (IOException unused) {
            }
            C21576.m49069(new Runnable() { // from class: l.᩷᩶ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C16332 c16333 = this.f72194.f35029;
                    c16333.f53030 = true;
                    if (c16333.f53026) {
                        C16332.m38795(c16333);
                    }
                }
            }, 200L);
            c16332.f53032.requestFocus();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C16332 c16332 = this.f35029;
        c16332.f53044.m51299(exc);
        c16332.f53031 = true;
        if (c16332.f53026) {
            c16332.f53032.mo52335((CharSequence) exc.toString());
            c16332.f53032.m54107(true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C16332 c16332 = this.f35029;
        if (c16332.f53026) {
            c16332.f53032.m53900(c16332.f53043, false, !c16332.f53031);
        }
        c16332.f53046 = false;
        c16332.f53034 = true;
    }
}
