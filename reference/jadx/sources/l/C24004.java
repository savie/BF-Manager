package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class C24004 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC9893 f77798;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77799;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f77800;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f77801;

    public C24004(ViewOnClickListenerC9893 viewOnClickListenerC9893, C14558 c14558, String str) {
        this.f77798 = viewOnClickListenerC9893;
        this.f77800 = c14558;
        this.f77799 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f77798.f33775);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f77801 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        boolean zM5824 = this.f77801.m5824();
        ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f77798;
        if (!zM5824) {
            C11780 c11780 = viewOnClickListenerC9893.f33772;
            C1777 c1777 = this.f77801;
            AbstractC20745 abstractC20745M15005 = C5429.m15005(c11780);
            AbstractC20745 abstractC20745M46690 = abstractC20745M15005.m46690("packageDone");
            AbstractC20745 abstractC20745M46691 = abstractC20745M15005.m46690("packageDoneTemp");
            if (!abstractC20745M46690.mo33975()) {
                c1777.m5837(R.string.MT_Protector);
                String[] strArrM13088 = C4723.m13088(c11780);
                C5079 c5079 = ServiceC23069.f74951;
                C6490 c6490 = new C6490();
                c6490.m17686(strArrM13088[0]);
                C18485 c18485Execute = c5079.m14157(c6490.m17678()).execute();
                if (!c18485Execute.m42863()) {
                    throw new IOException("Code-" + c18485Execute.m42858() + ": " + c18485Execute.m42868());
                }
                AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
                if (abstractC19191M42860 == null) {
                    throw new IOException("Response body is null");
                }
                C8516 c8516 = new C8516(abstractC19191M42860.mo5212());
                c8516.m22241(new C1438(c1777));
                MessageDigest messageDigestM49416 = C22253.m49416();
                try {
                    InputStream inputStreamM44051 = abstractC19191M42860.m44051();
                    try {
                        OutputStream outputStreamMo33976 = abstractC20745M46691.mo33976(false);
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int i = inputStreamM44051.read(bArr);
                                if (i != -1) {
                                    c8516.m22242(i);
                                    messageDigestM49416.update(bArr, 0, i);
                                    outputStreamMo33976.write(bArr, 0, i);
                                    if (c1777.m5824()) {
                                        outputStreamMo33976.close();
                                        inputStreamM44051.close();
                                        break;
                                    }
                                } else {
                                    if (outputStreamMo33976 != null) {
                                        outputStreamMo33976.close();
                                    }
                                    inputStreamM44051.close();
                                    if (!C22253.m49424(messageDigestM49416.digest()).equals(strArrM13088[1])) {
                                        abstractC20745M46691.mo24647();
                                        throw new IOException("MD5 verification failed");
                                    }
                                    if (abstractC20745M46691.mo24646(abstractC20745M46690)) {
                                        break;
                                    }
                                    abstractC20745M46691.mo24647();
                                    throw new IOException("Rename file fail: " + abstractC20745M46691.mo33986() + " to " + abstractC20745M46690.mo33986());
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo33976 != null) {
                                try {
                                    outputStreamMo33976.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            inputStreamM44051.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception e) {
                    abstractC20745M46691.mo24647();
                    throw e;
                }
            }
        }
        if (this.f77801.m5824()) {
            return;
        }
        ActivityC3541 activityC3541 = viewOnClickListenerC9893.f33775;
        C11780 c11781 = viewOnClickListenerC9893.f33772;
        C14558 c14558 = this.f77800;
        C1777 c1778 = this.f77801;
        c1778.m5837(R.string.MT_Protector);
        AbstractC20745 abstractC20745M15001 = C5429.m15001(c11781);
        AbstractC20745 abstractC20745M15006 = C5429.m15005(c11781);
        AbstractC20745 abstractC20745M46692 = abstractC20745M15006.m46690("packageLocal");
        AbstractC20745 abstractC20745M46693 = abstractC20745M15006.m46690("packageDone");
        AbstractC20745 abstractC20745M46694 = abstractC20745M15006.m46690("packageDone.zip");
        AbstractC20745 abstractC20745M46695 = abstractC20745M15006.m46690("package.apk");
        abstractC20745M15001.mo46720();
        try {
            C8516 c8517 = new C8516(abstractC20745M46693.mo33964());
            c8517.m22241(new C1438(c1778));
            InputStream inputStreamM26260 = C10362.m26260(new C2606(abstractC20745M46693.mo33970(), c8517));
            try {
                OutputStream outputStreamMo33977 = abstractC20745M46694.mo33976(false);
                try {
                    byte[] bArr2 = new byte[1024];
                    do {
                        int i2 = inputStreamM26260.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo33977.write(bArr2, 0, i2);
                        } else {
                            if (outputStreamMo33977 != null) {
                                outputStreamMo33977.close();
                            }
                            inputStreamM26260.close();
                            C22918 c22918 = new C22918(abstractC20745M46695);
                            try {
                                C2455 c2455 = new C2455(abstractC20745M46692);
                                try {
                                    C2455 c2456 = new C2455(abstractC20745M46694);
                                    try {
                                        HashSet hashSet = new HashSet();
                                        Iterator it = c2456.m7466().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C12107 c12107 = (C12107) it.next();
                                                c22918.m50727(c12107);
                                                C20010.m45301(c2456.m7471(c12107), c22918.m50720());
                                                hashSet.add(c12107.getName());
                                                if (c1778.m5824()) {
                                                    c2456.close();
                                                    break;
                                                }
                                            } else {
                                                Iterator it2 = c2455.m7466().iterator();
                                                do {
                                                    if (it2.hasNext()) {
                                                        C12107 c12108 = (C12107) it2.next();
                                                        if (!hashSet.contains(c12108.getName())) {
                                                            c22918.m50728(c12108, c2455);
                                                        }
                                                    } else {
                                                        c2456.close();
                                                        c2455.close();
                                                        c22918.close();
                                                        C11005.m27759(activityC3541, abstractC20745M46695, abstractC20745M15001, c14558, c1778);
                                                    }
                                                } while (!c1778.m5824());
                                                c2456.close();
                                                break;
                                            }
                                        }
                                        c2455.close();
                                        c22918.close();
                                    } catch (Throwable th5) {
                                        try {
                                            c2456.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        c2455.close();
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th9) {
                                try {
                                    c22918.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        }
                        abstractC20745M46694.mo24647();
                        abstractC20745M46695.mo24647();
                    } while (!c1778.m5824());
                    outputStreamMo33977.close();
                    inputStreamM26260.close();
                    abstractC20745M46694.mo24647();
                    abstractC20745M46695.mo24647();
                } catch (Throwable th11) {
                    if (outputStreamMo33977 != null) {
                        try {
                            outputStreamMo33977.close();
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                    }
                    throw th11;
                }
            } catch (Throwable th13) {
                try {
                    inputStreamM26260.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
                throw th13;
            }
        } catch (Throwable th15) {
            abstractC20745M46694.mo24647();
            abstractC20745M46695.mo24647();
            throw th15;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f77801.m5824()) {
            return;
        }
        this.f77798.m25036(this.f77799);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f77798.f33775.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f77801.m5825();
    }
}
