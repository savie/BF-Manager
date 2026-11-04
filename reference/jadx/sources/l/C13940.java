package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13940 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44192;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f44193;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44194;

    public C13940(C25350 c25350, String str) {
        this.f44193 = c25350;
        this.f44192 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C25350 c25350 = this.f44193;
        c25350.f81832.m53900(c25350.f81855, true, false);
        c25350.f81843 = true;
        c25350.f81834 = false;
        c25350.f81841.m52807(".xml");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        C25350 c25350 = this.f44193;
        c25350.f81857.m30724();
        if (c25350.f81856) {
            C9378 c9378M24173 = c25350.m24173(c25350.f81831.m11163());
            if (c9378M24173.m24702()) {
                try {
                    if (C25350.m56642(c25350, C20348.m46740(c9378M24173.m24700()))) {
                        this.f44194 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c25350.f81856) {
                String strM29993 = c25350.f81831.m29993(this.f44192);
                if (c25350.f81856) {
                    C24132 c24132 = c25350.f81832;
                    c24132.m53930(c25350.m24166(c25350.f81831.m11163()).m24699(), strM29993);
                    while (c25350.f81856 && c24132.m53884()) {
                        SystemClock.sleep(10L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C25350 c25350 = this.f44193;
        if (c25350.f81856) {
            if (this.f44194) {
                c25350.f81832.m54105();
                if (c25350.f81842 != null) {
                    c25350.f81842.setEnabled(!c25350.f81832.m54083());
                    c25350.f81847.setChecked(c25350.f81832.m54083());
                }
                C25350.m56661(c25350);
                c25350.f81832.invalidate();
            } else {
                c25350.f81832.m54093();
                c25350.f81832.m54016(false);
                c25350.f81832.m54048();
            }
            c25350.f29441.putBoolean("changed", c25350.f81832.m53890());
            try {
                c25350.m24172(c25350.f81831.m11163());
            } catch (IOException unused) {
            }
            C21576.m49069(new Runnable() { // from class: l.ۜܶۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C25350 c25351 = this.f23837.f44193;
                    c25351.f81851 = true;
                    if (c25351.f81856) {
                        C25350.m56655(c25351);
                    }
                }
            }, 200L);
            c25350.m56666();
            c25350.f81832.requestFocus();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C25350 c25350 = this.f44193;
        c25350.f81835.m51299(exc);
        c25350.f81834 = true;
        if (c25350.f81856) {
            c25350.f81832.mo52335((CharSequence) exc.toString());
            c25350.f81832.m54107(true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C25350 c25350 = this.f44193;
        if (c25350.f81856) {
            c25350.f81832.m53900(c25350.f81855, false, !c25350.f81834);
        }
        c25350.f81843 = false;
        c25350.f81854 = true;
    }
}
