package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩻۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C23544 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC12075 f76250;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23232 f76251;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f76252;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16881 f76253;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7522 f76254;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f76255;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f76256;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f76257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f76258;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f76259;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f76260;

    public C23544(C20409 c20409, ActivityC11632 activityC11632, C16881 c16881, boolean z, ResultCallback resultCallback) {
        this.f76255 = c20409;
        this.f76258 = activityC11632;
        this.f76253 = c16881;
        this.f76257 = z;
        this.f76256 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f76258, this.f76255.m46053() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        synchronized (this.f76255.f66154) {
            C23232 c23232M46060 = C20409.m46060(this.f76255, (C2063) null);
            this.f76251 = c23232M46060;
            try {
                c23232M46060.f75392.m49637(this.f76253);
                this.f76260 = this.f76253.f53983.mo33991();
                final C16881 c16881 = this.f76253;
                C20409.m46100(new Callable() { // from class: l.ۛ۟ۖ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C23544.m51905(this.f20141, c16881);
                        return null;
                    }
                });
                if (this.f76259) {
                    FutureC12075 futureC12075 = this.f76250;
                    if (futureC12075 != null) {
                        futureC12075.get();
                    }
                    c23232M46060.f75392.m49636();
                    C20409.m46100(new Callable() { // from class: l.ۧ۟ۖ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C23544.m51904(this.f36913);
                            return null;
                        }
                    });
                }
                c23232M46060.close();
            } catch (Throwable th) {
                if (c23232M46060 != null) {
                    try {
                        c23232M46060.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51905(C23544 c23544, C16881 c16881) {
        AbstractC20745 abstractC20745 = c16881.f53983;
        C20409 c20409 = c23544.f76255;
        if (c23544.f76251.m51268()) {
            C23232 c23232 = c23544.f76251;
            boolean zM51267 = c23232.m51267();
            boolean z = false;
            if (c23232.m51268()) {
                if (!zM51267) {
                    c23232.f75391.m17057(true);
                }
                if (zM51267 && c23232.m51268()) {
                    z = true;
                }
            }
            c23544.f76252 = z;
            if (c23544.f76251.m51268()) {
                C20889 c20889M31869 = C12859.m31869(abstractC20745.getName());
                String strM46958 = c20889M31869 == null ? "Text" : c20889M31869.m46958();
                if (SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37286() && !strM46958.equals(c20409.f66135.m46376()) && !strM46958.equals("Text")) {
                    c20409.f66135.m46380(strM46958);
                }
                if (c23544.f76251.m51268()) {
                    C6111 c6111 = c20409.f66125;
                    Bundle bundle = c20409.f16884;
                    c20409.m13342(c20409.m46130(c6111.m17040()));
                    bundle.remove("save_as_path");
                    bundle.putString("filePath", abstractC20745.mo33986());
                    c20409.mo13341("filePath");
                    c20409.f66126 = false;
                    c20409.f66145 = null;
                    c20409.f16887.m18579(c20409.m46130(c20409.f66125.m17040()));
                    c20409.f16887.m18544(c20409.m46149());
                    c20409.f16887.m18543(C20368.f65993);
                    c20409.m13345();
                    c20409.m13340(c23544.f76260);
                    c20409.m13350(true);
                    c23544.f76254 = c23544.f76251.f75391.m17041();
                    if (c20409.f66151 != null) {
                        c23544.f76250 = c20409.m46089();
                    }
                    c23544.f76259 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51904(C23544 c23544) {
        C6111 c6111;
        C20409 c20409 = c23544.f76255;
        if (c20409.f66146 && (c6111 = c20409.f66125) == c23544.f76251.f75391 && c6111.m17000() == c23544.f76251.f75389) {
            c20409.m13342(c20409.m46130(c20409.f66125.m17040()));
            c20409.m46126();
            c20409.f16887.m18579(c20409.m13338());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C6111 c6111;
        if (this.f76259) {
            C15829.m37611(R.string.MT_Protector);
        }
        boolean z = this.f76259;
        C20409 c20409 = this.f76255;
        boolean z2 = z && this.f76252 && (c6111 = c20409.f66125) == this.f76251.f75391 && c6111.m17000() == this.f76251.f75389 && this.f76253.f53983.mo33986().equals(c20409.m13346().f53983.mo33986()) && c20409.f66125.m16994(this.f76254) && !c20409.m13338();
        if (this.f76257 && z2) {
            c20409.getClass();
            this.f76258.m29016(c20409);
        }
        ResultCallback resultCallback = this.f76256;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f76255.m46062(exc, this.f76258);
        ResultCallback resultCallback = this.f76256;
        if (resultCallback != null) {
            resultCallback.onFailure(C2641.m8151(exc));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
