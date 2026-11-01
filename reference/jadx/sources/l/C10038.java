package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10038 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7474 f34264;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34265;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f34266;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f34267;

    public C10038(C23444 c23444, String str) {
        this.f34266 = c23444;
        this.f34265 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C23444 c23444 = this.f34266;
        c23444.f75915.m16854(c23444.f75895, true, false);
        c23444.f75891 = true;
        c23444.f75890 = false;
        c23444.f75905.m46369(".smali");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        C23444 c23444 = this.f34266;
        c23444.f75912.m17521();
        if (c23444.f75898) {
            this.f34264 = C7474.m19963(c23444.f75896.m16574(c23444.f75896.m16526(c23444.m51659())).f28708);
            C13626 c13626M50132 = c23444.m50132(c23444.f75896.m47183());
            if (c13626M50132.m33326()) {
                try {
                    if (C23444.m51622(c23444, C17367.m40441(c13626M50132.m33327()))) {
                        this.f34267 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c23444.f75898) {
                String strM16578 = c23444.f75896.m16578(this.f34265);
                if (c23444.f75898) {
                    C6111 c6111 = c23444.f75915;
                    c6111.m16883(c23444.m50130(c23444.f75896.m47183()).m33318(), strM16578);
                    if (c23444.f75898) {
                        while (c23444.f75898 && c6111.m16973()) {
                            SystemClock.sleep(10L);
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C23444 c23444 = this.f34266;
        if (c23444.f75898) {
            c23444.f75915.m16876(new C21990((ActivityC5677) c23444.requireActivity(), this.f34264));
            if (this.f34267) {
                c23444.f75915.m16919();
                if (c23444.f75900 != null) {
                    c23444.f75900.setEnabled(!c23444.f75915.m17004());
                    c23444.f75903.setChecked(c23444.f75915.m17004());
                }
                C23444.m51650(c23444);
                c23444.f75915.invalidate();
            } else {
                c23444.f75915.m16902();
                c23444.f75915.m17057(false);
                c23444.f75915.m16949();
            }
            c23444.f73689.putBoolean("changed", c23444.f75915.m17040());
            try {
                c23444.m50128(c23444.f75896.m47183());
            } catch (IOException unused) {
            }
            C16737.m39274(new Runnable() { // from class: l.ۡۘۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C23444 c23445 = this.f29774.f34266;
                    c23445.f75902 = true;
                    if (c23445.f75898) {
                        C23444.m51643(c23445);
                    }
                }
            }, 200L);
            c23444.f75915.requestFocus();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C23444 c23444 = this.f34266;
        c23444.f75911.m42627((Throwable) exc);
        c23444.f75890 = true;
        if (c23444.f75898) {
            c23444.f75915.mo16989((CharSequence) exc.toString());
            c23444.f75915.m17065(true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C23444 c23444 = this.f34266;
        if (c23444.f75898) {
            c23444.f75915.m16854(c23444.f75895, false, !c23444.f75890);
        }
        c23444.f75891 = false;
        c23444.f75901 = true;
    }
}
