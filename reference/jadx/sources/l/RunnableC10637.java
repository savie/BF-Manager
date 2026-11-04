package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۤۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10637 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14366[] f33735;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22572 f33736;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f33737;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f33738;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float[] f33739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f33741;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5438 f33742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f33743;

    public RunnableC10637(C22572 c22572, int[] iArr, C14366[] c14366Arr) {
        this.f33736 = c22572;
        this.f33737 = c22572.f43646;
        this.f33738 = c22572.m33631();
        this.f33743 = c22572.f72986.get();
        this.f33741 = iArr;
        this.f33735 = c14366Arr;
        this.f33739 = new float[iArr.length];
        synchronized (c22572.f43640) {
            this.f33742 = c22572.f43640.m16219();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27134() {
        if (this.f33740 || this.f33736.f43653 || this.f33737.mo15344() != this.f33738 || this.f33743 != this.f33736.f72986.get()) {
            throw new CancellationException();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnableC4609;
        final boolean z = false;
        try {
            try {
                m27134();
                C15508 c15508Mo15350 = this.f33737.mo15350();
                try {
                    if (c15508Mo15350.m37177() != this.f33738) {
                        c15508Mo15350.close();
                        runnableC4609 = new RunnableC10002(1, this);
                    } else {
                        c15508Mo15350.m37180(new RunnableC9278(1, this));
                        C15132 c15132 = new C15132(c15508Mo15350);
                        for (int i = 0; i < this.f33741.length; i++) {
                            m27134();
                            this.f33739[i] = this.f33735[i].m34798(c15132, this.f33742);
                        }
                        c15508Mo15350.close();
                        runnableC4609 = new RunnableC4609(1, this);
                    }
                    C21576.m49068(runnableC4609);
                } catch (Throwable th) {
                    try {
                        c15508Mo15350.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Error | RuntimeException unused) {
                runnable = new Runnable() { // from class: l.᩷ۙᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC10637.m27136(this.f69569, z);
                    }
                };
                C21576.m49068(runnable);
            }
        } catch (CancellationException unused2) {
            runnable = new Runnable() { // from class: l.᩷ۙᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC10637.m27136(this.f69569, z);
                }
            };
            C21576.m49068(runnable);
        } catch (Throwable th3) {
            C21576.m49068(new Runnable() { // from class: l.᩷ۙᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC10637.m27136(this.f69569, z);
                }
            });
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27136(RunnableC10637 runnableC10637, boolean z) {
        if (runnableC10637.f33736.f72975 != runnableC10637) {
            return;
        }
        runnableC10637.f33736.f72975 = null;
        C22572 c22572 = runnableC10637.f33736;
        if (c22572.f43659.f78022 == c22572 && c22572.f43646 == runnableC10637.f33737 && !c22572.f43653) {
            if (runnableC10637.f33740 || !runnableC10637.f33736.m33641() || runnableC10637.f33736.m33631() != runnableC10637.f33738 || runnableC10637.f33743 != runnableC10637.f33736.f72986.get()) {
                runnableC10637.f33736.f43659.invalidate();
                return;
            }
            if (z) {
                if (runnableC10637.f33736.f72973 == null) {
                    C22572 c22573 = runnableC10637.f33736;
                    c22573.f72973 = C9891.m25701(c22573.f72979);
                }
                for (int i = 0; i < runnableC10637.f33741.length; i++) {
                    runnableC10637.f33736.f72979.mo25091(runnableC10637.f33739[i], runnableC10637.f33741[i]);
                    runnableC10637.f33736.f72973.m25706(runnableC10637.f33741[i]);
                    C22572 c22574 = runnableC10637.f33736;
                    c22574.f72978 = Math.max(c22574.f72978, runnableC10637.f33739[i]);
                }
                C22572 c22575 = runnableC10637.f33736;
                c22575.f72988 = c22575.f72973.m25705();
                runnableC10637.f33736.f43659.invalidate();
            }
        }
    }
}
