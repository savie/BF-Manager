package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5528 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22462 f18949;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f18950;

    public C5528(AbstractActivityC12483 abstractActivityC12483, C22462 c22462) {
        this.f18950 = abstractActivityC12483;
        this.f18949 = c22462;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f18950, this.f18949.f73322 != -1 ? R.string.MT_Protector : R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        C3073 c3073M1328;
        C3073 c3073M1329;
        C3073 c3073M13210;
        C22462 c22462 = this.f18949;
        if (c22462.f73322 != -1) {
            C21735 c21735M49962 = c22462.m49962();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C0168 c0168 = new C0168();
            try {
                c3073M1329 = c0168.m1328(c21735M49962.f70451, c21735M49962.f70445, c21735M49962.f70447);
                C6939.m18688(c3073M1329);
                try {
                    if (c21735M49962.f70446) {
                        c3073M1329.m9234(c21735M49962.f70450, c21735M49962.m48498());
                    } else {
                        c3073M1329.m9244(c21735M49962.f70448);
                    }
                    boolean z = c21735M49962.f70446;
                    c3073M1329.m9240(new C10468(z ? null : c21735M49962.f70448, z ? c21735M49962.m48498() : null));
                    c3073M1329.m9233(new Runnable() { // from class: l.ۨᩴ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5528.m15228(this.f39847, atomicBoolean);
                        }
                    });
                    try {
                        c3073M1329.m9232();
                        if (this.f12806.m40693()) {
                            c3073M1329.m9247();
                            return;
                        }
                        int iM9230 = c3073M1329.m9230("127.0.0.1", 0, c22462.f73323, c22462.f73329);
                        atomicBoolean.set(false);
                        this.f12806.m40695(R.string.MT_Protector);
                        c3073M13210 = c0168.m1328(iM9230, c22462.f73326, "127.0.0.1");
                        C6939.m18688(c3073M13210);
                        try {
                            if (c22462.f73321) {
                                c3073M13210.m9234(c22462.f73325, c22462.f73330.isEmpty() ? null : c22462.f73330);
                            } else {
                                c3073M13210.m9244(c22462.f73328);
                            }
                            boolean z2 = c22462.f73321;
                            c3073M13210.m9240(new C10468(z2 ? null : c22462.f73328, (!z2 || c22462.f73330.isEmpty()) ? null : c22462.f73330));
                            c3073M13210.m9233(new Runnable() { // from class: l.ۖᩴ֨
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C5528.m15229(this.f10409, atomicBoolean);
                                }
                            });
                            try {
                                c3073M13210.m9232();
                                this.f12806.m40703(R.string.MT_Protector);
                                C4670 c4670 = (C4670) c3073M13210.m9246("sftp");
                                c4670.m12929(Charset.forName(c22462.f73324));
                                c4670.mo19045(b.j0);
                                c4670.m12926(".");
                                c3073M1329.m9247();
                                c3073M13210.m9247();
                            } catch (IOException e) {
                                if (atomicBoolean.get()) {
                                    throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e.getMessage(), e);
                                }
                                throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e.getMessage(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (c3073M1329 != null) {
                                c3073M1329.m9247();
                            }
                            if (c3073M13210 != null) {
                                c3073M13210.m9247();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        if (atomicBoolean.get()) {
                            throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                        }
                        throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c3073M13210 = null;
                    if (c3073M1329 != null) {
                        c3073M1329.m9247();
                    }
                    if (c3073M13210 != null) {
                        c3073M13210.m9247();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c3073M1329 = null;
            }
        } else {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            try {
                c3073M1328 = new C0168().m1328(c22462.f73323, c22462.f73326, c22462.f73329);
                C6939.m18688(c3073M1328);
                try {
                    if (c22462.f73321) {
                        c3073M1328.m9234(c22462.f73325, c22462.f73330.isEmpty() ? null : c22462.f73330);
                    } else {
                        c3073M1328.m9244(c22462.f73328);
                    }
                    boolean z3 = c22462.f73321;
                    c3073M1328.m9240(new C10468(z3 ? null : c22462.f73328, (!z3 || c22462.f73330.isEmpty()) ? null : c22462.f73330));
                    c3073M1328.m9233(new Runnable() { // from class: l.ܰᩴ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5528.m15230(this.f46000, atomicBoolean2);
                        }
                    });
                    try {
                        c3073M1328.m9232();
                        if (this.f12806.m40693()) {
                            c3073M1328.m9247();
                            return;
                        }
                        this.f12806.m40703(R.string.MT_Protector);
                        C4670 c4671 = (C4670) c3073M1328.m9246("sftp");
                        c4671.m12929(Charset.forName(c22462.f73324));
                        c4671.mo19045(b.j0);
                        c4671.m12926(".");
                        c3073M1328.m9247();
                    } catch (IOException e3) {
                        if (atomicBoolean2.get()) {
                            throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                        }
                        throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c3073M1328 != null) {
                        c3073M1328.m9247();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c3073M1328 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15230(C5528 c5528, AtomicBoolean atomicBoolean) {
        c5528.f12806.m40695(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15228(C5528 c5528, AtomicBoolean atomicBoolean) {
        c5528.f12806.m40695(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15229(C5528 c5528, AtomicBoolean atomicBoolean) {
        c5528.f12806.m40695(R.string.MT_Protector);
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
        this.f18950.m31002(exc, (DialogInterface.OnDismissListener) null);
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
