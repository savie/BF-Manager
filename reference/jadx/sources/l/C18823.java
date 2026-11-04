package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ᩳۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18823 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5704 f61169;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9431 f61170;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16672 f61171;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f61172;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FutureC23690 f61173;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f61174;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f61175;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f61176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f61177;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f61178;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f61179;

    public C18823(C7941 c7941, ActivityC18143 activityC18143, C9431 c9431, boolean z, ResultCallback resultCallback) {
        this.f61176 = c7941;
        this.f61177 = activityC18143;
        this.f61170 = c9431;
        this.f61178 = z;
        this.f61175 = resultCallback;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f61177, this.f61176.m21611() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        synchronized (this.f61176.f26409) {
            C5704 c5704M21522 = C7941.m21522(this.f61176, (C23056) null);
            this.f61169 = c5704M21522;
            try {
                c5704M21522.f19703.m40249(this.f61170);
                this.f61179 = this.f61170.f30601.mo4286();
                final C9431 c9431 = this.f61170;
                C7941.m21599(new Callable() { // from class: l.֡ۘ᩸
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C18823.m43685(this.f1259, c9431);
                        return null;
                    }
                });
                if (this.f61174) {
                    FutureC23690 futureC23690 = this.f61173;
                    if (futureC23690 != null) {
                        futureC23690.get();
                    }
                    c5704M21522.f19703.m40248();
                    C7941.m21599(new Callable() { // from class: l.۟ۘ᩸
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C18823.m43684(this.f25199);
                            return null;
                        }
                    });
                }
                c5704M21522.close();
            } catch (Throwable th) {
                if (c5704M21522 != null) {
                    try {
                        c5704M21522.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43685(C18823 c18823, C9431 c9431) {
        AbstractC22044 abstractC22044 = c9431.f30601;
        C7941 c7941 = c18823.f61176;
        if (c18823.f61169.m16743()) {
            C5704 c5704 = c18823.f61169;
            boolean zM16742 = c5704.m16742();
            boolean z = false;
            if (c5704.m16743()) {
                if (!zM16742) {
                    c5704.f19702.m54016(true);
                }
                if (zM16742 && c5704.m16743()) {
                    z = true;
                }
            }
            c18823.f61172 = z;
            if (c18823.f61169.m16743()) {
                C16800 c16800M24626 = C9341.m24626(abstractC22044.getName());
                String strM39683 = c16800M24626 == null ? "Text" : c16800M24626.m39683();
                if (SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11215() && !strM39683.equals(c7941.f26385.m52818()) && !strM39683.equals("Text")) {
                    c7941.f26385.m52822(strM39683);
                }
                if (c18823.f61169.m16743()) {
                    C24132 c24132 = c7941.f26387;
                    Bundle bundle = c7941.f23990;
                    c7941.m19932(c7941.m21640(c24132.m53890()));
                    bundle.remove("save_as_path");
                    bundle.putString("filePath", abstractC22044.mo4294());
                    c7941.mo19931("filePath");
                    c7941.f26404 = false;
                    c7941.m21579();
                    c7941.f26376 = null;
                    c7941.f23993.m29412(c7941.m21640(c7941.f26387.m53890()));
                    c7941.f23993.m29394(c7941.m21637());
                    c7941.f23993.m29393(C3296.f10762);
                    c7941.m19928();
                    c7941.m19930(c18823.f61179);
                    c7941.m19945(true);
                    c18823.f61171 = c18823.f61169.f19702.m54042();
                    if (c7941.f26374 != null) {
                        c18823.f61173 = c7941.m21512();
                    }
                    c18823.f61174 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43684(C18823 c18823) {
        C24132 c24132;
        C7941 c7941 = c18823.f61176;
        if (c7941.f26388 && (c24132 = c7941.f26387) == c18823.f61169.f19702 && c24132.m54021() == c18823.f61169.f19700) {
            c7941.m19932(c7941.m21640(c7941.f26387.m53890()));
            c7941.m21515();
            c7941.f23993.m29412(c7941.m19933());
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C24132 c24132;
        if (this.f61174) {
            C22673.m51152(R.string.MT_Protector);
        }
        boolean z = this.f61174;
        C7941 c7941 = this.f61176;
        boolean z2 = z && this.f61172 && (c24132 = c7941.f26387) == this.f61169.f19702 && c24132.m54021() == this.f61169.f19700 && this.f61170.f30601.mo4294().equals(c7941.m19934().f30601.mo4294()) && c7941.f26387.m54081(this.f61171) && !c7941.m19933();
        if (this.f61178 && z2) {
            c7941.getClass();
            this.f61177.m42295(c7941);
        }
        ResultCallback resultCallback = this.f61175;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C7941.m21539(this.f61176, exc, this.f61177);
        ResultCallback resultCallback = this.f61175;
        if (resultCallback != null) {
            resultCallback.onFailure(C22327.m50390(exc));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
