package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11356 f5753;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f5754;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2407 f5755;

    public C1662(AbstractActivityC17204 abstractActivityC17204, C11356 c11356) {
        this.f5754 = abstractActivityC17204;
        this.f5753 = c11356;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f5754, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        try {
            try {
                m5964();
                if (this.f7780.m33196()) {
                    C2407 c2407 = this.f5755;
                    if (c2407 == null || !c2407.m27208()) {
                        return;
                    }
                } else {
                    try {
                        this.f7780.m33186(R.string.MT_Protector);
                        m5963();
                        if (this.f7780.m33196()) {
                            C2407 c2408 = this.f5755;
                            if (c2408 == null || !c2408.m27208()) {
                                return;
                            }
                        } else {
                            this.f7780.m33195(R.string.MT_Protector);
                            this.f5755.mo3701();
                            this.f5755.m6110();
                            if (this.f5755.m36451() != 226) {
                                throw new Exception(this.f5755.m36450());
                            }
                            C2407 c2409 = this.f5755;
                            if (c2409 == null || !c2409.m27208()) {
                                return;
                            }
                        }
                    } catch (C3090 e) {
                        throw e;
                    } catch (C4866 e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                }
                try {
                    this.f5755.mo6118();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C2407 c24010 = this.f5755;
                if (c24010 != null && c24010.m27208()) {
                    try {
                        this.f5755.mo6118();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m5964() throws IOException {
        C11356 c11356 = this.f5753;
        C2407 c2407 = new C2407(!c11356.f35766, null);
        this.f5755 = c2407;
        c2407.m8152(c11356.f35763);
        this.f5755.m36448(c11356.f35760);
        C2407 c2408 = this.f5755;
        Charset.forName(c11356.f35760);
        c2408.getClass();
        this.f5755.m27200(c11356.f35764, c11356.f35762);
        if (c11356.f35767) {
            this.f5755.m6093();
            this.f5755.m46789();
            this.f5755.m46790();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5963() throws C4866 {
        C11356 c11356 = this.f5753;
        String str = c11356.f35761;
        String str2 = c11356.f35765;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f5755.m6113(str, str2)) {
            return;
        }
        StringBuilder sbM10405 = C3188.m10405(C21576.m49088(R.string.MT_Protector), ": ");
        sbM10405.append(this.f5755.m36450());
        throw new C4866(sbM10405.toString());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f5754.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f7780.m33196()) {
            return;
        }
        m8196();
    }
}
