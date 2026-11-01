package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12894 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7955 f42862;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f42863;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2516 f42864;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18538 f42865;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f42866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21360 f42867;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11690 f42868;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f42869;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15218 f42870;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11615 f42871;

    public C12894(ViewOnClickListenerC7955 viewOnClickListenerC7955, C18538 c18538, C2516 c2516, C11615 c11615, C21360 c21360, byte[] bArr, byte[] bArr2, C13026 c13026) {
        this.f42862 = viewOnClickListenerC7955;
        this.f42865 = c18538;
        this.f42864 = c2516;
        this.f42871 = c11615;
        this.f42867 = c21360;
        this.f42863 = bArr;
        this.f42869 = bArr2;
        this.f42866 = c13026;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C18538 c18538 = this.f42865;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f42862;
        ViewOnClickListenerC7955.m21000(viewOnClickListenerC7955, c18538);
        this.f42868 = this.f42864.m7806();
        m10248(viewOnClickListenerC7955.f26140, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩹ۙ᩹
            @Override // java.lang.Runnable
            public final void run() {
                C12894.m31968(this.f71496);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31968(C12894 c12894) {
        c12894.f12806.m40697((Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31967(C12894 c12894) {
        C17485 c17485 = c12894.f12806;
        if (c12894.f42865.mo2357()) {
            return true;
        }
        return c17485 != null && c17485.m40693();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [l.֨ۙ᩹] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C2516 c2516 = this.f42864;
        C11615 c11615 = this.f42871;
        try {
            boolean zM28948 = c11615.m28948();
            C21360 c21360 = this.f42867;
            if (!zM28948) {
                c21360.f69485 = C22772.m50428();
            } else {
                try {
                    C15218 c15218M29189 = this.f42868.m29189(new InterfaceC5614() { // from class: l.֨ۙ᩹
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return C12894.m31967(this.f3621);
                        }
                    });
                    this.f42870 = c15218M29189;
                    c21360.f69485 = ViewOnClickListenerC7955.m20997(c2516, c15218M29189, this.f42863, this.f42869, new InterfaceC5614() { // from class: l.֨ۙ᩹
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return C12894.m31967(this.f3621);
                        }
                    });
                    c21360.f69487 = c2516.m7808();
                    c11615.m28946();
                } catch (Throwable th) {
                    c11615.m28946();
                    throw th;
                }
            }
            ViewOnClickListenerC7955.m21001(this.f42868);
        } catch (Throwable th2) {
            ViewOnClickListenerC7955.m21001(this.f42868);
            throw th2;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f42871.m28950();
        C21360 c21360 = this.f42867;
        C22772 c22772 = c21360.f69485;
        if (!this.f42862.m21002(this.f42864) || c22772 == null) {
            return;
        }
        long j = c22772.f74148;
        if (c22772.f74146) {
            return;
        }
        if (j == 0) {
            C17485 c17485 = this.f12806;
            if (this.f42865.mo2357()) {
                return;
            }
            if (c17485 == null || !c17485.m40693()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            return;
        }
        if (c21360.f69484) {
            C15829.m37612(1, this.f42866.getContext().getString(R.string.MT_Protector, Long.valueOf(j))).m37622();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof C1105) {
            return;
        }
        ViewOnClickListenerC7955.m20999(this.f42862, this.f42866, this.f42864, exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11615 c11615 = this.f42871;
        c11615.m28946();
        c11615.m28950();
        ViewOnClickListenerC7955.m21001(this.f42868);
        C15218 c15218 = this.f42870;
        if (c15218 != null) {
            try {
                c15218.close();
            } catch (IOException unused) {
            }
        }
        m10251();
        c11615.close();
        ViewOnClickListenerC7955.m21005(this.f42862, this.f42865);
    }
}
