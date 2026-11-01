package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4038 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f14926;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f14927;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21678 f14928;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f14929;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f14930;

    public C4038(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, C21678 c21678, Runnable runnable) {
        this.f14926 = abstractActivityC12483;
        this.f14927 = abstractC20745;
        this.f14928 = c21678;
        this.f14929 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f14926);
        c1777.mo5828((Runnable) null);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5830(R.string.MT_Protector);
        c1777.mo5843();
        this.f14930 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        AbstractC20745 abstractC20745 = this.f14927;
        abstractC20745.mo24647();
        abstractC20745.mo46720();
        C21678 c21678 = this.f14928;
        String strM4766 = C1355.m4766(c21678.f70309);
        C5079 c5079M39297 = C16737.m39297();
        C6490 c6490 = new C6490();
        c6490.m17686(strM4766);
        C18485 c18485Execute = c5079M39297.m14157(c6490.m17678()).execute();
        try {
            if (!c18485Execute.m42863()) {
                throw new IOException("Code-" + c18485Execute.m42858() + ": " + c18485Execute.m42868());
            }
            AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
            if (abstractC19191M42860 == null) {
                throw new IOException("Response body is null");
            }
            C8516 c8516 = new C8516(abstractC19191M42860.mo5212());
            C1777 c1777 = this.f14930;
            C13638.requireNonNull(c1777);
            c8516.m22241(new C1438(c1777));
            InputStream inputStreamM44051 = abstractC19191M42860.m44051();
            try {
                BufferedOutputStream bufferedOutputStreamM46708 = abstractC20745.m46708();
                try {
                    byte[] bArr = new byte[512];
                    do {
                        int i = inputStreamM44051.read(bArr);
                        if (i != -1) {
                            c8516.m22242(i);
                            bufferedOutputStreamM46708.write(bArr, 0, i);
                        } else {
                            bufferedOutputStreamM46708.close();
                            inputStreamM44051.close();
                            c18485Execute.close();
                            if (C22253.m49415(abstractC20745.m46727()).equals(c21678.f70313)) {
                                return;
                            }
                            C8416.m22051();
                            throw new C4987("File md5 verification failed");
                        }
                        try {
                            inputStreamM44051.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (!this.f14930.m5824());
                    bufferedOutputStreamM46708.close();
                    inputStreamM44051.close();
                    c18485Execute.close();
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStreamM46708.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM44051.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c18485Execute.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean zM5824 = this.f14930.m5824();
        Runnable runnable = this.f14929;
        if (zM5824) {
            runnable.run();
            return;
        }
        C18150.m42283(this.f14926, this.f14927, this.f14928, runnable);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f14926.m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f14929.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f14930.m5825();
    }
}
