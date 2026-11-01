package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15386 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21735 f50082;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f50083;

    public C15386(AbstractActivityC12483 abstractActivityC12483, C21735 c21735) {
        this.f50083 = abstractActivityC12483;
        this.f50082 = c21735;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f50083, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        C21735 c21735 = this.f50082;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C3073 c3073 = null;
        try {
            C3073 c3073M1328 = new C0168().m1328(c21735.f70451, c21735.f70445, c21735.f70447);
            C6939.m18688(c3073M1328);
            try {
                if (c21735.f70446) {
                    c3073M1328.m9234(c21735.f70450, c21735.m48498());
                } else {
                    c3073M1328.m9244(c21735.f70448);
                }
                c3073M1328.m9233(new Runnable() { // from class: l.᩺ᩳ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15386.m36822(this.f75144, atomicBoolean);
                    }
                });
                try {
                    c3073M1328.m9232();
                    c3073M1328.m9247();
                } catch (IOException e) {
                    if (!atomicBoolean.get()) {
                        throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e.getMessage(), e);
                    }
                    throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                th = th;
                c3073 = c3073M1328;
                if (c3073 != null) {
                    c3073.m9247();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36822(C15386 c15386, AtomicBoolean atomicBoolean) {
        c15386.f12806.m40695(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f50083.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f12806.m40693()) {
            return;
        }
        m10251();
    }
}
