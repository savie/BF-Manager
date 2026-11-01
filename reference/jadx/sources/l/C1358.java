package l;

import bin.mt.plus.R;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֨᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C1358 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23229 f5690;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f5691;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f5692;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5693;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f5694;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5696;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f5697;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f5699;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f5700;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5701;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f5702;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22380 f5703;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f5704;

    public C1358(C20409 c20409, int i, InterfaceC2916 interfaceC2916, String str, ActivityC11632 activityC11632, boolean z, boolean z2, int i2, String str2, boolean z3, String str3) {
        this.f5692 = c20409;
        this.f5698 = i;
        this.f5702 = interfaceC2916;
        this.f5695 = str;
        this.f5704 = activityC11632;
        this.f5694 = z;
        this.f5700 = z2;
        this.f5701 = i2;
        this.f5693 = str2;
        this.f5699 = z3;
        this.f5696 = str3;
        this.f5690 = C23229.m51233(c20409.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C22380 c22380M49633;
        C2063 c2063 = new C2063(0, this.f5698, false, 0, null, null, null);
        C20409 c20409 = this.f5692;
        C14393 c14393 = c20409.f66151;
        String str = this.f5695;
        if (c14393 == null) {
            c22380M49633 = C22380.m49631(this.f5702, str, c2063, -1, null);
        } else {
            c22380M49633 = C22380.m49633(c20409.f66151, str, c2063);
        }
        this.f5703 = c22380M49633;
        m10246(this.f5704, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f5697 = C11904.f39939.m46688(this.f5694 ? ".mhtml" : ".html");
        synchronized (this.f5692.f66154) {
            C22380 c22380 = this.f5703;
            try {
                if (this.f5700) {
                    C9388 c9388M49635 = c22380.m49635(this.f5701);
                    this.f5691 = c9388M49635.m24082();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f5697.mo33976(false), StandardCharsets.UTF_8));
                    try {
                        C14119.m34157(c9388M49635, this.f5693, this.f5699, this.f5704.getAssets(), bufferedWriter, this.f5704.getString(R.string.MT_Protector));
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
                    c22380.m49638(this.f5697);
                }
                if (c22380 != null) {
                    c22380.close();
                }
            } catch (Throwable th3) {
                if (c22380 != null) {
                    try {
                        c22380.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f5690.m51236()) {
            boolean z = this.f5700;
            String str = this.f5693;
            String str2 = this.f5696;
            ActivityC11632 activityC11632 = this.f5704;
            if (z) {
                ActivityC10181.m25923(activityC11632, str2, str, this.f5697, this.f5691);
            } else {
                ActivityC10181.m25924(activityC11632, str2, str, this.f5694, this.f5697);
            }
            this.f5697 = null;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f5690.m51236()) {
            if (exc instanceof C4945) {
                C15829.m37611(R.string.MT_Protector);
            } else {
                this.f5692.m46062(exc, this.f5704);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C22380 c22380 = this.f5703;
        if (c22380 != null) {
            c22380.close();
        }
        AbstractC20745 abstractC20745 = this.f5697;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
        m10251();
    }
}
