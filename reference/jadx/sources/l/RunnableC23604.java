package l;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.᩹ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23604 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f76622;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f76623;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f76624;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C24132 f76625;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f76626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f76627;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f76628;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2170 f76629;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9431 f76630;

    public RunnableC23604(C7941 c7941, C9431 c9431, C2170 c2170) {
        this.f76623 = c7941;
        C24132 c24132 = c7941.f26387;
        this.f76625 = c24132;
        this.f76626 = c24132.m54021();
        this.f76627 = c7941.f23990.getLong("fileTime", -1L);
        this.f76624 = SystemClock.elapsedRealtime();
        this.f76630 = c9431;
        this.f76629 = c2170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52851() {
        try {
            C5261.f18540.execute(this);
        } catch (RejectedExecutionException unused) {
            m52849(null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final C1907 c1907Mo8790 = this.f76629.mo4298().mo8790();
            C21576.m49068(new Runnable() { // from class: l.ܶܰ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52432.m52849(c1907Mo8790);
                }
            });
        } catch (Exception unused) {
            C21576.m49068(new RunnableC15159(1, this));
        } catch (Throwable th) {
            C21576.m49068(new RunnableC15159(1, this));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52849(C1907 c1907) {
        RunnableC23604 runnableC23604;
        boolean z;
        C9431 c9431 = this.f76630;
        C7941 c7941 = this.f76623;
        Bundle bundle = c7941.f23990;
        if (c1907 != null) {
            try {
                if (!this.f76628) {
                    if (!(SystemClock.elapsedRealtime() - this.f76624 >= 2000) && c7941.m21574()) {
                        C24132 c24132 = c7941.f26387;
                        C24132 c24133 = this.f76625;
                        if (c24132 == c24133 && c24133.m54021() == this.f76626 && c9431.f30601.mo4294().equals(c7941.m19934().f30601.mo4294())) {
                            long j = bundle.getLong("fileTime", -1L);
                            long j2 = this.f76627;
                            if (j2 == j && (c7941.f26400 == null || !c7941.f26400.m22434())) {
                                if (c1907.m6567() != EnumC13093.MISSING) {
                                    if (ApplicationC17729.f58262.getBoolean("check_file_time", true) && c1907.m6568() > 0) {
                                        long jM6568 = c1907.m6568();
                                        if (j2 <= 0) {
                                            c7941.m19930(jM6568);
                                        } else if (j2 != jM6568) {
                                            c7941.m21530(c9431, jM6568);
                                        }
                                    }
                                } else if (ApplicationC17729.f58262.getBoolean("check_file_exists", true) && bundle.getBoolean("checkFileExists")) {
                                    c7941.m21529(c9431);
                                }
                                if (runnableC23604 == this) {
                                    if (z) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            } finally {
                if (c7941.f26395 == this) {
                    c7941.f26395 = null;
                    if (this.f76622) {
                        c7941.m21638();
                    }
                }
            }
        }
    }
}
