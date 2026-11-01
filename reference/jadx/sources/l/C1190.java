package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֨ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1190 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f5285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13186 f5286;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11070 f5287;

    public C1190(AbstractActivityC12483 abstractActivityC12483, C13186 c13186) {
        this.f5285 = abstractActivityC12483;
        this.f5286 = c13186;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f5285, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        try {
            try {
                m4374();
                if (this.f12806.m40693()) {
                    C11070 c11070 = this.f5287;
                    if (c11070 == null || !c11070.m23280()) {
                        return;
                    }
                } else {
                    try {
                        this.f12806.m40695(R.string.MT_Protector);
                        m4373();
                        if (this.f12806.m40693()) {
                            C11070 c11071 = this.f5287;
                            if (c11071 == null || !c11071.m23280()) {
                                return;
                            }
                        } else {
                            this.f12806.m40703(R.string.MT_Protector);
                            this.f5287.mo17117();
                            this.f5287.m39229();
                            if (this.f5287.m47139() != 226) {
                                throw new Exception(this.f5287.m47142());
                            }
                            C11070 c11072 = this.f5287;
                            if (c11072 == null || !c11072.m23280()) {
                                return;
                            }
                        }
                    } catch (C4987 e) {
                        throw e;
                    } catch (C8142 e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                }
                try {
                    this.f5287.mo23286();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C11070 c11073 = this.f5287;
                if (c11073 != null && c11073.m23280()) {
                    try {
                        this.f5287.mo23286();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            throw new Exception(C16737.m39288(R.string.MT_Protector) + ": " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m4374() throws IOException {
        C13186 c13186 = this.f5286;
        C11070 c11070 = new C11070(!c13186.f43893, null);
        this.f5287 = c11070;
        c11070.m27915(c13186.f43887);
        this.f5287.m47138(c13186.f43889);
        C11070 c11071 = this.f5287;
        Charset.forName(c13186.f43889);
        c11071.getClass();
        this.f5287.m23272(c13186.f43894, c13186.f43891);
        if (c13186.f43888) {
            this.f5287.m39223();
            this.f5287.m24609();
            this.f5287.m24605();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m4373() throws C4987 {
        C13186 c13186 = this.f5286;
        String str = c13186.f43892;
        String str2 = c13186.f43890;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f5287.m39238(str, str2)) {
            return;
        }
        StringBuilder sbM8976 = C3012.m8976(C16737.m39288(R.string.MT_Protector), ": ");
        sbM8976.append(this.f5287.m47142());
        throw new C4987(sbM8976.toString());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f5285.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f12806.m40693()) {
            return;
        }
        m10251();
    }
}
