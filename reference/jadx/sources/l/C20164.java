package l;

import android.view.View;
import android.widget.ProgressBar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩶۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AIV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20164 extends C1777 {
    @Override // l.C1777
    /* JADX INFO: renamed from: ۙ */
    public final C1777 mo5827(View.OnClickListener onClickListener) {
        throw null;
    }

    public C20164(AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483);
        this.f6918.setVisibility(0);
        this.f6921.setVisibility(0);
    }

    @Override // l.C1777
    /* JADX INFO: renamed from: ۙ */
    public final C1777 mo5828(Runnable runnable) {
        super.mo5828((Runnable) null);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45589(Runnable runnable) {
        super.mo5828(runnable);
    }

    @Override // l.C1777
    /* JADX INFO: renamed from: ᩺ */
    public final C1777 mo5843() {
        super.mo5843();
        return this;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m45600() {
        super.mo5843();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m45586(int i) {
        super.m5837(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45592(CharSequence charSequence) {
        super.m5841(charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45588(CharSequence charSequence) {
        super.m5832(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45594(long j, long j2) {
        super.m5831(j, j2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45591(int i) {
        super.m5840(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45590(ViewOnClickListenerC21509 viewOnClickListenerC21509) {
        super.mo5827((View.OnClickListener) viewOnClickListenerC21509);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45587(final int i) {
        if (C13890.m33728()) {
            this.f6918.setMax(i);
        } else {
            C16737.m39273(new Runnable() { // from class: l.᩷۫ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67800.f6918.setMax(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45593(long j, long j2) {
        if (j2 == 0) {
            m45599(0);
        } else {
            m45599((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m45599(int i) {
        ProgressBar progressBar = this.f6918;
        if (progressBar.getProgress() != i) {
            boolean zM33728 = C13890.m33728();
            AtomicInteger atomicInteger = this.f6926;
            if (zM33728) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m5826();
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m45595() {
        return this.f6918.getProgress();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45598() {
        ProgressBar progressBar = this.f6918;
        if (progressBar.getVisibility() == 8) {
            return;
        }
        if (C13890.m33728()) {
            progressBar.setVisibility(8);
            this.f6921.setVisibility(8);
        } else {
            C16737.m39273(new Runnable() { // from class: l.۟۫ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C20164 c20164 = this.f24864;
                    c20164.f6918.setVisibility(8);
                    c20164.f6921.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45597() {
        ProgressBar progressBar = this.f6918;
        if (progressBar.getVisibility() == 0) {
            return;
        }
        if (C13890.m33728()) {
            progressBar.setVisibility(0);
            this.f6921.setVisibility(0);
        } else {
            C16737.m39273(new Runnable() { // from class: l.ۤ۫ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C20164 c20164 = this.f35038;
                    c20164.f6918.setVisibility(0);
                    c20164.f6921.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23333 m45596() {
        return new C15931(this);
    }
}
