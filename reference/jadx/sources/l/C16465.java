package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16465 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53382;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f53383;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23179 f53384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f53385;

    public C16465(ViewOnClickListenerC23179 viewOnClickListenerC23179, C9651 c9651, String str) {
        this.f53384 = viewOnClickListenerC23179;
        this.f53383 = c9651;
        this.f53382 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f53384.f75115);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f53385 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        boolean zM27399 = this.f53385.m27399();
        ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f53384;
        if (!zM27399) {
            C6025 c6025 = viewOnClickListenerC23179.f75111;
            C10745 c10745 = this.f53385;
            AbstractC22044 abstractC22044M12322 = C3787.m12322(c6025);
            AbstractC22044 abstractC22044M49876 = abstractC22044M12322.m49876("packageDone");
            AbstractC22044 abstractC22044M49877 = abstractC22044M12322.m49876("packageDoneTemp");
            if (!abstractC22044M49876.mo2934()) {
                c10745.m27397(R.string.MT_Protector);
                String[] strArrM46447 = C20195.m46447(c6025);
                C24363 c24363 = ServiceC18703.f60805;
                C0496 c0496 = new C0496();
                c0496.m2397(strArrM46447[0]);
                C9444 c9444Execute = c24363.m54450(c0496.m2389()).execute();
                if (!c9444Execute.m24819()) {
                    throw new IOException("Code-" + c9444Execute.m24820() + ": " + c9444Execute.m24825());
                }
                AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
                if (abstractC8699M24818 == null) {
                    throw new IOException("Response body is null");
                }
                C3374 c3374 = new C3374(abstractC8699M24818.mo9079());
                c3374.m11078(new C21151(c10745));
                MessageDigest messageDigestM36174 = C15022.m36174();
                try {
                    InputStream inputStreamM23391 = abstractC8699M24818.m23391();
                    try {
                        OutputStream outputStreamMo4289 = abstractC22044M49877.mo4289(false);
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int i = inputStreamM23391.read(bArr);
                                if (i != -1) {
                                    c3374.m11079(i);
                                    messageDigestM36174.update(bArr, 0, i);
                                    outputStreamMo4289.write(bArr, 0, i);
                                    if (c10745.m27399()) {
                                        outputStreamMo4289.close();
                                        inputStreamM23391.close();
                                        break;
                                    }
                                } else {
                                    if (outputStreamMo4289 != null) {
                                        outputStreamMo4289.close();
                                    }
                                    inputStreamM23391.close();
                                    if (!C15022.m36182(messageDigestM36174.digest()).equals(strArrM46447[1])) {
                                        abstractC22044M49877.mo4296();
                                        throw new IOException("MD5 verification failed");
                                    }
                                    if (abstractC22044M49877.mo4301(abstractC22044M49876)) {
                                        break;
                                    }
                                    abstractC22044M49877.mo4296();
                                    throw new IOException("Rename file fail: " + abstractC22044M49877.mo4294() + " to " + abstractC22044M49876.mo4294());
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo4289 != null) {
                                try {
                                    outputStreamMo4289.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            inputStreamM23391.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception e) {
                    abstractC22044M49877.mo4296();
                    throw e;
                }
            }
        }
        if (this.f53385.m27399()) {
            return;
        }
        ActivityC3041 activityC3041 = viewOnClickListenerC23179.f75115;
        C6025 c6026 = viewOnClickListenerC23179.f75111;
        C9651 c9651 = this.f53383;
        C10745 c10746 = this.f53385;
        c10746.m27397(R.string.MT_Protector);
        AbstractC22044 abstractC22044M12318 = C3787.m12318(c6026);
        AbstractC22044 abstractC22044M12323 = C3787.m12322(c6026);
        AbstractC22044 abstractC22044M49878 = abstractC22044M12323.m49876("packageLocal");
        AbstractC22044 abstractC22044M49879 = abstractC22044M12323.m49876("packageDone");
        AbstractC22044 abstractC22044M498710 = abstractC22044M12323.m49876("packageDone.zip");
        AbstractC22044 abstractC22044M498711 = abstractC22044M12323.m49876("package.apk");
        abstractC22044M12318.mo49834();
        try {
            C3374 c3375 = new C3374(abstractC22044M49879.mo4285());
            c3375.m11078(new C21151(c10746));
            InputStream inputStreamM55007 = C24653.m55007(new C23925(abstractC22044M49879.mo4290(), c3375));
            try {
                OutputStream outputStreamMo42810 = abstractC22044M498710.mo4289(false);
                try {
                    byte[] bArr2 = new byte[1024];
                    do {
                        int i2 = inputStreamM55007.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo42810.write(bArr2, 0, i2);
                        } else {
                            if (outputStreamMo42810 != null) {
                                outputStreamMo42810.close();
                            }
                            inputStreamM55007.close();
                            C25179 c25179 = new C25179(abstractC22044M498711);
                            try {
                                C22941 c22941 = new C22941(abstractC22044M49878);
                                try {
                                    C22941 c22942 = new C22941(abstractC22044M498710);
                                    try {
                                        HashSet hashSet = new HashSet();
                                        Iterator it = c22942.m51742().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C8002 c8002 = (C8002) it.next();
                                                c25179.m56125(c8002);
                                                C5125.m15496(c22942.m51727(c8002), c25179.m56119());
                                                hashSet.add(c8002.getName());
                                                if (c10746.m27399()) {
                                                    c22942.close();
                                                    break;
                                                }
                                            } else {
                                                Iterator it2 = c22941.m51742().iterator();
                                                do {
                                                    if (it2.hasNext()) {
                                                        C8002 c8003 = (C8002) it2.next();
                                                        if (!hashSet.contains(c8003.getName())) {
                                                            c25179.m56126(c8003, c22941);
                                                        }
                                                    } else {
                                                        c22942.close();
                                                        c22941.close();
                                                        c25179.close();
                                                        C0938.m3748(activityC3041, abstractC22044M498711, abstractC22044M12318, c9651, c10746);
                                                    }
                                                } while (!c10746.m27399());
                                                c22942.close();
                                                break;
                                            }
                                        }
                                        c22941.close();
                                        c25179.close();
                                    } catch (Throwable th5) {
                                        try {
                                            c22942.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        c22941.close();
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th9) {
                                try {
                                    c25179.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        }
                        abstractC22044M498710.mo4296();
                        abstractC22044M498711.mo4296();
                    } while (!c10746.m27399());
                    outputStreamMo42810.close();
                    inputStreamM55007.close();
                    abstractC22044M498710.mo4296();
                    abstractC22044M498711.mo4296();
                } catch (Throwable th11) {
                    if (outputStreamMo42810 != null) {
                        try {
                            outputStreamMo42810.close();
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                    }
                    throw th11;
                }
            } catch (Throwable th13) {
                try {
                    inputStreamM55007.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
                throw th13;
            }
        } catch (Throwable th15) {
            abstractC22044M498710.mo4296();
            abstractC22044M498711.mo4296();
            throw th15;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f53385.m27399()) {
            return;
        }
        this.f53384.m52096(this.f53382);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f53384.f75115.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f53385.m27405();
    }
}
