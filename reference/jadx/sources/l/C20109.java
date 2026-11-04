package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20109 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11904 f64610;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f64611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25331 f64612;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17103 f64613;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15633 f64614;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64615;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f64616;

    public C20109(C12628 c12628, C15633 c15633, C11904 c11904, C17103 c17103, C25331 c25331, CharSequence charSequence, int i) {
        this.f64611 = c12628;
        this.f64614 = c15633;
        this.f64610 = c11904;
        this.f64613 = c17103;
        this.f64612 = c25331;
        this.f64616 = charSequence;
        this.f64615 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        Context context = this.f64611.getContext();
        if (context instanceof AbstractActivityC17204) {
            final C15633 c15633 = this.f64614;
            m8193((AbstractActivityC17204) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩸᩸ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74883.f7780.m33188(new RunnableC13790(c15633));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m46242() {
        if (this.f64614.mo924()) {
            return true;
        }
        C13511 c13511 = this.f7780;
        return (c13511 != null && c13511.m33196()) || !this.f64610.m29785(this.f64611);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C17103 c17103 = this.f64613;
        if (c17103.m40266()) {
            try {
                if (!m46242()) {
                    this.f64612.f81800 = C17871.m41720(this.f64611, this.f64610, this.f64616, this.f64615, new C11158(this));
                }
            } finally {
                c17103.m40267();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f64613.m40268();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof C9446) {
            return;
        }
        C12628 c12628 = this.f64611;
        if (c12628.f40509.m17213() == this.f64610.f38339) {
            Context context = c12628.getContext();
            if (context instanceof AbstractActivityC17204) {
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) context;
                if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C12562) {
                C22673.m51152(R.string.MT_Protector);
            } else if (exc instanceof IOException) {
                c12628.m31361((IOException) exc);
            } else {
                c12628.m31361(new IOException("Unable to paste external hex text", exc));
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C17103 c17103 = this.f64613;
        c17103.m40267();
        c17103.m40268();
        m8196();
        c17103.close();
    }
}
