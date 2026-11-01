package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۢ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9888 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f33757;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4718 f33758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6130 f33759;

    public C9888(AbstractActivityC12483 abstractActivityC12483, C4718 c4718) {
        this.f33757 = abstractActivityC12483;
        this.f33758 = c4718;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f33757, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        try {
            try {
                m25031();
                if (this.f12806.m40693()) {
                    C6130 c6130 = this.f33759;
                    if (c6130 == null || !c6130.m23280()) {
                        return;
                    }
                } else {
                    try {
                        this.f12806.m40695(R.string.MT_Protector);
                        m25030();
                        if (this.f12806.m40693()) {
                            C6130 c6131 = this.f33759;
                            if (c6131 == null || !c6131.m23280()) {
                                return;
                            }
                        } else {
                            this.f12806.m40703(R.string.MT_Protector);
                            this.f33759.mo17117();
                            this.f33759.m39229();
                            if (this.f33759.m47139() != 226) {
                                throw new Exception(this.f33759.m47142());
                            }
                            C6130 c6132 = this.f33759;
                            if (c6132 == null || !c6132.m23280()) {
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
                    this.f33759.mo23286();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C6130 c6133 = this.f33759;
                if (c6133 != null && c6133.m23280()) {
                    try {
                        this.f33759.mo23286();
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
    private void m25031() throws IOException {
        C6130 c6130 = new C6130(null);
        this.f33759 = c6130;
        C4718 c4718 = this.f33758;
        c6130.m47138(c4718.f16651);
        C6130 c6131 = this.f33759;
        Charset.forName(c4718.f16651);
        c6131.getClass();
        this.f33759.m23272(c4718.f16652, c4718.f16654);
        if (c4718.f16653) {
            this.f33759.m39223();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m25030() throws C4987 {
        C4718 c4718 = this.f33758;
        String str = c4718.f16655;
        String str2 = c4718.f16650;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f33759.m39238(str, str2)) {
            return;
        }
        StringBuilder sbM8976 = C3012.m8976(C16737.m39288(R.string.MT_Protector), ": ");
        sbM8976.append(this.f33759.m47142());
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
        this.f33757.m31002(exc, (DialogInterface.OnDismissListener) null);
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
