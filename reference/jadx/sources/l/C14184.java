package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۬᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14184 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21799 f44847;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f44848;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9118 f44849;

    public C14184(AbstractActivityC17204 abstractActivityC17204, C21799 c21799) {
        this.f44848 = abstractActivityC17204;
        this.f44847 = c21799;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f44848, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        try {
            try {
                m34479();
                if (this.f7780.m33196()) {
                    C9118 c9118 = this.f44849;
                    if (c9118 == null || !c9118.m27208()) {
                        return;
                    }
                } else {
                    try {
                        this.f7780.m33186(R.string.MT_Protector);
                        m34478();
                        if (this.f7780.m33196()) {
                            C9118 c9119 = this.f44849;
                            if (c9119 == null || !c9119.m27208()) {
                                return;
                            }
                        } else {
                            this.f7780.m33195(R.string.MT_Protector);
                            this.f44849.mo3701();
                            this.f44849.m6110();
                            if (this.f44849.m36451() != 226) {
                                throw new Exception(this.f44849.m36450());
                            }
                            C9118 c91110 = this.f44849;
                            if (c91110 == null || !c91110.m27208()) {
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
                    this.f44849.mo6118();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C9118 c91111 = this.f44849;
                if (c91111 != null && c91111.m27208()) {
                    try {
                        this.f44849.mo6118();
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
    private void m34479() throws IOException {
        C9118 c9118 = new C9118(null);
        this.f44849 = c9118;
        C21799 c21799 = this.f44847;
        c9118.m36448(c21799.f69521);
        C9118 c9119 = this.f44849;
        Charset.forName(c21799.f69521);
        c9119.getClass();
        this.f44849.m27200(c21799.f69524, c21799.f69525);
        if (c21799.f69522) {
            this.f44849.m6093();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34478() throws C4866 {
        C21799 c21799 = this.f44847;
        String str = c21799.f69523;
        String str2 = c21799.f69526;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f44849.m6113(str, str2)) {
            return;
        }
        StringBuilder sbM10405 = C3188.m10405(C21576.m49088(R.string.MT_Protector), ": ");
        sbM10405.append(this.f44849.m36450());
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
        this.f44848.m40401(exc, (DialogInterface.OnDismissListener) null);
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
