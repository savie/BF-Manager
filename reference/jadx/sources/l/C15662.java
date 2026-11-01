package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15662 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11615 f50869;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17072 f50870;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5783 f50871;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f50872;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50873;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19895 f50874;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f50875;

    public C15662(C13026 c13026, C19895 c19895, C17072 c17072, C11615 c11615, C5783 c5783, CharSequence charSequence, int i) {
        this.f50872 = c13026;
        this.f50874 = c19895;
        this.f50870 = c17072;
        this.f50869 = c11615;
        this.f50871 = c5783;
        this.f50875 = charSequence;
        this.f50873 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        Context context = this.f50872.getContext();
        if (context instanceof AbstractActivityC12483) {
            final C19895 c19895 = this.f50874;
            m10248((AbstractActivityC12483) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩷ۗۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67117.f12806.m40697(new RunnableC19189(c19895));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m37332() {
        if (this.f50874.mo2357()) {
            return true;
        }
        C17485 c17485 = this.f12806;
        return (c17485 != null && c17485.m40693()) || !this.f50870.m39857(this.f50872);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C11615 c11615 = this.f50869;
        if (c11615.m28948()) {
            try {
                if (!m37332()) {
                    this.f50871.f19638 = C23423.m51583(this.f50872, this.f50870, this.f50875, this.f50873, new C7194(this));
                }
            } finally {
                c11615.m28946();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f50869.m28950();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof C1105) {
            return;
        }
        C13026 c13026 = this.f50872;
        if (c13026.f43452.m33458() == this.f50870.f54490) {
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
                c13026.m32228(new IOException("Unable to paste external hex text", exc));
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11615 c11615 = this.f50869;
        c11615.m28946();
        c11615.m28950();
        m10251();
        c11615.close();
    }
}
