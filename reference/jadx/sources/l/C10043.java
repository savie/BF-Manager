package l;

import android.view.View;
import android.widget.ProgressBar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AIV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10043 extends C10745 {
    @Override // l.C10745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10745 mo25915(View.OnClickListener onClickListener) {
        throw null;
    }

    public C10043(AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204);
        this.f34128.setVisibility(0);
        this.f34132.setVisibility(0);
    }

    @Override // l.C10745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10745 mo25916(Runnable runnable) {
        super.mo25916((Runnable) null);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25917(Runnable runnable) {
        super.mo25916(runnable);
    }

    @Override // l.C10745
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10745 mo25931() {
        super.mo25931();
        return this;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25932() {
        super.mo25931();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25920(int i) {
        super.m27397(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25926(CharSequence charSequence) {
        super.m27404(charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25929(CharSequence charSequence) {
        super.m27393(charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25927(long j, long j2) {
        super.m27392(j, j2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25925(int i) {
        super.m27403(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25918(ViewOnClickListenerC6407 viewOnClickListenerC6407) {
        super.mo25915((View.OnClickListener) viewOnClickListenerC6407);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25928(final int i) {
        if (C22415.m50557()) {
            this.f34128.setMax(i);
        } else {
            C21576.m49068(new Runnable() { // from class: l.۟ۢᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26013.f34128.setMax(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25919(long j, long j2) {
        if (j2 == 0) {
            m25921(0);
        } else {
            m25921((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m25921(int i) {
        ProgressBar progressBar = this.f34128;
        if (progressBar.getProgress() != i) {
            boolean zM50557 = C22415.m50557();
            AtomicInteger atomicInteger = this.f34135;
            if (zM50557) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m27389();
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m25923() {
        return this.f34128.getProgress();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25924() {
        ProgressBar progressBar = this.f34128;
        if (progressBar.getVisibility() == 8) {
            return;
        }
        if (C22415.m50557()) {
            progressBar.setVisibility(8);
            this.f34132.setVisibility(8);
        } else {
            C21576.m49068(new Runnable() { // from class: l.֡ۢᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C10043 c10043 = this.f1845;
                    c10043.f34128.setVisibility(8);
                    c10043.f34132.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m25930() {
        ProgressBar progressBar = this.f34128;
        if (progressBar.getVisibility() == 0) {
            return;
        }
        if (C22415.m50557()) {
            progressBar.setVisibility(0);
            this.f34132.setVisibility(0);
        } else {
            C21576.m49068(new Runnable() { // from class: l.ܿۢᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C10043 c10043 = this.f59569;
                    c10043.f34128.setVisibility(0);
                    c10043.f34132.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25004 m25922() {
        return new C18994(this);
    }
}
