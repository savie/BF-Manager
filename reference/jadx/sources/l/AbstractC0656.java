package l;

import android.content.Intent;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֡᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0656 extends AbstractC17902 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2773 = 0;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f2774;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f2776;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f2777;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f2778;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f2780;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f2783;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f2787;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2786 = false;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2775 = false;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2782 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2784 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2781 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2785 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2779 = new AtomicBoolean();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2976(Intent intent) {
        super.mo2976(intent);
        this.f2787 = m41565("ARG_MSG_FROM");
        this.f2774 = m41565("ARG_MSG_TO");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483) {
        C4785 c4785 = new C4785(abstractActivityC12483);
        c4785.m13289(new RunnableC10098(4, this));
        c4785.m13288(new ViewOnClickListenerC8105(4, c4785));
        c4785.m13286(this.f2787);
        c4785.m13298(this.f2774);
        m41568().m44959(c4785.m13293(), new C2685(1, this, c4785));
        c4785.m13297();
        return c4785.m13293();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2973(AbstractC0656 abstractC0656, final C4785 c4785) {
        if (abstractC0656.m41582()) {
            c4785.m13292(abstractC0656.m41586());
        }
        if (abstractC0656.m41589()) {
            if (abstractC0656.f2786) {
                c4785.m13296(abstractC0656.m41576());
            } else {
                c4785.m13294(abstractC0656.m41576());
            }
        }
        if (abstractC0656.f2785.compareAndSet(true, false)) {
            c4785.m13290(abstractC0656.f2775);
        }
        if (abstractC0656.f2782.compareAndSet(true, false)) {
            c4785.m13281(abstractC0656.mo2978());
        }
        if (abstractC0656.f2784.compareAndSet(true, false)) {
            c4785.m13285(abstractC0656.f2780);
        }
        if (abstractC0656.f2781.compareAndSet(true, false)) {
            final boolean z = abstractC0656.f2786;
            Runnable runnable = new Runnable() { // from class: l.ܳ۫ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C4785.m13279(c4785, z);
                }
            };
            if (C13890.m33728()) {
                runnable.run();
            } else {
                C16737.m39273(runnable);
            }
        }
        if (abstractC0656.f2779.compareAndSet(true, false)) {
            c4785.m13286(abstractC0656.f2787);
            c4785.m13298(abstractC0656.f2774);
        }
        c4785.m13284(abstractC0656.m41564());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo2982(CharSequence charSequence) {
        super.mo41554(charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2974(boolean z) {
        this.f2775 = z;
        this.f2785.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo2983(C3761 c3761) {
        this.f2777 = c3761.m10990();
        this.f2776 = c3761.m10991();
        this.f2778 = c3761.m10997();
        this.f2783 = c3761.m10995();
        this.f2782.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public String mo2978() {
        int i = this.f2777;
        long j = this.f2778;
        long j2 = j - this.f2783;
        if (i == 1) {
            return C1791.m5863(j2) + "/" + C1791.m5863(j);
        }
        return (i - this.f2776) + " (" + C1791.m5863(j2) + "/" + C1791.m5863(j) + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2975(long j) {
        this.f2780 = j;
        this.f2784.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final long m2979() {
        return this.f2780;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2980(boolean z) {
        this.f2786 = z;
        this.f2781.set(true);
        m41552();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2977(String str, String str2) {
        this.f2787 = str;
        this.f2774 = str2;
        this.f2779.set(true);
        m41552();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void mo2984() {
        super.mo2984();
        this.f2782.set(true);
        this.f2784.set(true);
        this.f2781.set(true);
        this.f2785.set(true);
        this.f2779.set(true);
    }
}
