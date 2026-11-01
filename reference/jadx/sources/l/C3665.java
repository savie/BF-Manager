package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C3665 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11615 f13412;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22717 f13413;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f13414;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6488 f13415;

    public C3665(C22717 c22717, C13026 c13026, C6488 c6488, C11615 c11615) {
        this.f13413 = c22717;
        this.f13414 = c13026;
        this.f13415 = c6488;
        this.f13412 = c11615;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() throws Throwable {
        C13026 c13026 = this.f13414;
        C4558 c4558M33471 = c13026.f43452.m33471();
        C22717 c22717 = this.f13413;
        c22717.f74006 = c4558M33471;
        Context context = c13026.getContext();
        if (c22717.f74006 == null || !(context instanceof AbstractActivityC12483)) {
            return;
        }
        final C6488 c6488 = this.f13415;
        m10248((AbstractActivityC12483) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.۬ۗۚ
            @Override // java.lang.Runnable
            public final void run() {
                this.f42712.f12806.m40697(new RunnableC5077(c6488));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10824(C3665 c3665) {
        if (c3665.f13415.mo2357()) {
            return true;
        }
        C17485 c17485 = c3665.f12806;
        return c17485 != null && c17485.m40693();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C17485 c17485;
        C22717 c22717 = this.f13413;
        C11615 c11615 = this.f13412;
        if (c11615.m28948()) {
            try {
                if (c22717.f74006 != null) {
                    if (!(this.f13415.mo2357() || ((c17485 = this.f12806) != null && c17485.m40693()))) {
                        c22717.f74009 = this.f13414.f43452.m33446(c22717.f74006, new C0843(this));
                        c22717.f74007 = true;
                    }
                }
            } finally {
                c11615.m28946();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f13412.m28950();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof C1105) {
            return;
        }
        C13026 c13026 = this.f13414;
        if (c13026.f43452.m33454(this.f13413.f74006)) {
            Context context = c13026.getContext();
            if (context instanceof AbstractActivityC12483) {
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) context;
                if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C3015) {
                C15829.m37611(R.string.MT_Protector);
            } else if (exc instanceof IOException) {
                c13026.m32228((IOException) exc);
            } else {
                c13026.m32228(new IOException("Unable to paste hex range", exc));
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11615 c11615 = this.f13412;
        c11615.m28946();
        c11615.m28950();
        C22717 c22717 = this.f13413;
        if (c22717.f74006 != null) {
            try {
                c22717.f74006.close();
            } catch (IOException unused) {
            }
        }
        m10251();
        c11615.close();
    }
}
