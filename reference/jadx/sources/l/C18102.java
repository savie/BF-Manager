package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܿۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18102 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f59241;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f59242;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9897 f59243;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f59244;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f59245;

    public C18102(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, C9897 c9897, Runnable runnable) {
        this.f59244 = abstractActivityC17204;
        this.f59241 = abstractC22044;
        this.f59243 = c9897;
        this.f59242 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f59244);
        c10745.mo25916((Runnable) null);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27391(R.string.MT_Protector);
        c10745.mo25931();
        this.f59245 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        AbstractC22044 abstractC22044 = this.f59241;
        abstractC22044.mo4296();
        abstractC22044.mo49834();
        C9897 c9897 = this.f59243;
        String strM32486 = C13047.m32486(c9897.f31826);
        C24363 c24363M49093 = C21576.m49093();
        C0496 c0496 = new C0496();
        c0496.m2397(strM32486);
        C9444 c9444Execute = c24363M49093.m54450(c0496.m2389()).execute();
        try {
            if (!c9444Execute.m24819()) {
                throw new IOException("Code-" + c9444Execute.m24820() + ": " + c9444Execute.m24825());
            }
            AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
            if (abstractC8699M24818 == null) {
                throw new IOException("Response body is null");
            }
            C3374 c3374 = new C3374(abstractC8699M24818.mo9079());
            C10745 c10745 = this.f59245;
            C17359.requireNonNull(c10745);
            c3374.m11078(new C21151(c10745));
            InputStream inputStreamM23391 = abstractC8699M24818.m23391();
            try {
                BufferedOutputStream bufferedOutputStreamM49869 = abstractC22044.m49869();
                try {
                    byte[] bArr = new byte[512];
                    do {
                        int i = inputStreamM23391.read(bArr);
                        if (i != -1) {
                            c3374.m11079(i);
                            bufferedOutputStreamM49869.write(bArr, 0, i);
                        } else {
                            bufferedOutputStreamM49869.close();
                            inputStreamM23391.close();
                            c9444Execute.close();
                            if (C15022.m36173(abstractC22044.m49865()).equals(c9897.f31825)) {
                                return;
                            }
                            C20327.m46699();
                            throw new C4866("File md5 verification failed");
                        }
                        try {
                            inputStreamM23391.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (!this.f59245.m27399());
                    bufferedOutputStreamM49869.close();
                    inputStreamM23391.close();
                    c9444Execute.close();
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStreamM49869.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM23391.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c9444Execute.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean zM27399 = this.f59245.m27399();
        Runnable runnable = this.f59242;
        if (zM27399) {
            runnable.run();
            return;
        }
        C0949.m3778(this.f59244, this.f59241, this.f59243, runnable);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f59244.m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f59242.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f59245.m27405();
    }
}
