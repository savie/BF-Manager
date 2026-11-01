package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3707 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f13505;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13506;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13507;

    public C3707(C7236 c7236, String str) {
        this.f13505 = c7236;
        this.f13506 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C7236 c7236 = this.f13505;
        c7236.f24106.m16854(c7236.f24097, true, false);
        c7236.f24107 = true;
        c7236.f24111 = false;
        c7236.f24121.m46369(".xml");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        C7236 c7236 = this.f13505;
        c7236.f24120.m17521();
        if (c7236.f24116) {
            C13626 c13626M50132 = c7236.m50132(c7236.f24113.m47183());
            if (c13626M50132.m33326()) {
                try {
                    if (C7236.m19304(c7236, C17367.m40441(c13626M50132.m33327()))) {
                        this.f13507 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c7236.f24116) {
                String strM21568 = c7236.f24113.m21568(this.f13506);
                if (c7236.f24116) {
                    C6111 c6111 = c7236.f24106;
                    c6111.m16883(c7236.m50130(c7236.f24113.m47183()).m33318(), strM21568);
                    while (c7236.f24116 && c6111.m16973()) {
                        SystemClock.sleep(10L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C7236 c7236 = this.f13505;
        if (c7236.f24116) {
            if (this.f13507) {
                c7236.f24106.m16919();
                if (c7236.f24102 != null) {
                    c7236.f24102.setEnabled(!c7236.f24106.m17004());
                    c7236.f24119.setChecked(c7236.f24106.m17004());
                }
                C7236.m19283(c7236);
                c7236.f24106.invalidate();
            } else {
                c7236.f24106.m16902();
                c7236.f24106.m17057(false);
                c7236.f24106.m16949();
            }
            c7236.f73689.putBoolean("changed", c7236.f24106.m17040());
            try {
                c7236.m50128(c7236.f24113.m47183());
            } catch (IOException unused) {
            }
            C16737.m39274(new Runnable() { // from class: l.۬ۙۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C7236 c7237 = this.f42842.f13505;
                    c7237.f24114 = true;
                    if (c7237.f24116) {
                        C7236.m19326(c7237);
                    }
                }
            }, 200L);
            c7236.m19332();
            c7236.f24106.requestFocus();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C7236 c7236 = this.f13505;
        c7236.f24104.m42627((Throwable) exc);
        c7236.f24111 = true;
        if (c7236.f24116) {
            c7236.f24106.mo16989((CharSequence) exc.toString());
            c7236.f24106.m17065(true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C7236 c7236 = this.f13505;
        if (c7236.f24116) {
            c7236.f24106.m16854(c7236.f24097, false, !c7236.f24111);
        }
        c7236.f24107 = false;
        c7236.f24110 = true;
    }
}
