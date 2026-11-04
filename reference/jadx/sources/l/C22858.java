package l;

import bin.mt.plus.R;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C22858 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74275;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74276;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74277;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f74278;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74279;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f74280;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74281;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11555 f74282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74283;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17088 f74284;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74285;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74286;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f74287;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74288;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74289;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74290;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f74291;

    public C22858(C7941 c7941, int i, boolean z, InterfaceC19106 interfaceC19106, String str, ActivityC18143 activityC18143, boolean z2, boolean z3, boolean z4, int i2, String str2, boolean z5, String str3) {
        this.f74280 = c7941;
        this.f74286 = i;
        this.f74283 = z;
        this.f74287 = interfaceC19106;
        this.f74281 = str;
        this.f74291 = activityC18143;
        this.f74290 = z2;
        this.f74276 = z3;
        this.f74289 = z4;
        this.f74288 = i2;
        this.f74277 = str2;
        this.f74285 = z5;
        this.f74279 = str3;
        this.f74282 = C11555.m29068(c7941.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C17088 c17088M40244;
        C23056 c23056 = new C23056(0, this.f74286, false, 0, null, null, null);
        boolean z = this.f74283;
        C7941 c7941 = this.f74280;
        if (z) {
            c23056 = c7941.f26391;
        }
        C16320 c16320 = c7941.f26374;
        String str = this.f74281;
        if (c16320 == null) {
            c17088M40244 = C17088.m40243(this.f74287, str, c23056, -1, null);
        } else {
            c17088M40244 = C17088.m40244(c7941.f26374, str, c23056);
        }
        this.f74284 = c17088M40244;
        m8191(this.f74291, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str;
        AbstractC22044 abstractC22044 = C6382.f21565;
        if (this.f74283) {
            str = ".xml";
        } else if (this.f74290) {
            str = ".svg";
        } else {
            str = this.f74276 ? ".mhtml" : ".html";
        }
        this.f74278 = abstractC22044.m49857(str);
        synchronized (this.f74280.f26409) {
            C17088 c17088 = this.f74284;
            try {
                if (this.f74283) {
                    c17088.m40252(this.f74278);
                } else if (this.f74289) {
                    C13812 c13812M40247 = c17088.m40247(this.f74288);
                    this.f74275 = c13812M40247.m33721();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f74278.mo4289(false), StandardCharsets.UTF_8));
                    try {
                        C11224.m28289(c13812M40247, this.f74277, this.f74285, this.f74291.getAssets(), bufferedWriter, this.f74291.getString(R.string.MT_Protector));
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c17088.m40250(this.f74278);
                }
                if (c17088 != null) {
                    c17088.close();
                }
            } catch (Throwable th3) {
                if (c17088 != null) {
                    try {
                        c17088.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f74282.m29071()) {
            boolean z = this.f74283;
            String str = this.f74277;
            ActivityC18143 activityC18143 = this.f74291;
            if (z) {
                ActivityC15913.m37929(activityC18143, this.f74278, str);
            } else if (this.f74290) {
                ActivityC15913.m37885(activityC18143, this.f74278, str);
            } else {
                ActivityC3846.m12398(activityC18143, this.f74279, this.f74277, this.f74276, this.f74278, this.f74289 ? this.f74275 : -1, this.f74280.m19937());
            }
            this.f74278 = null;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f74282.m29071()) {
            if (exc instanceof C22413) {
                C22673.m51152(R.string.MT_Protector);
            } else {
                C7941.m21539(this.f74280, exc, this.f74291);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C17088 c17088 = this.f74284;
        if (c17088 != null) {
            c17088.close();
        }
        if (this.f74278 != null) {
            if (this.f74283) {
                C14584.m35193(this.f74278.mo4294() + ".arsc", new String[0]).mo4296();
            }
            this.f74278.mo4296();
        }
        m8196();
    }
}
