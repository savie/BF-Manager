package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13600 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15218 f44860;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18538 f44861;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f44862;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7955 f44863;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f44864;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11690 f44865;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f44866;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44867;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2516 f44868;

    public C13600(ViewOnClickListenerC7955 viewOnClickListenerC7955, C18538 c18538, C2516 c2516, byte[] bArr, long j, C13026 c13026) {
        this.f44863 = viewOnClickListenerC7955;
        this.f44861 = c18538;
        this.f44868 = c2516;
        this.f44862 = bArr;
        this.f44866 = j;
        this.f44864 = c13026;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C18538 c18538 = this.f44861;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f44863;
        ViewOnClickListenerC7955.m21000(viewOnClickListenerC7955, c18538);
        this.f44865 = this.f44868.m7806();
        m10248(viewOnClickListenerC7955.f26140, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۗۗۚ
            @Override // java.lang.Runnable
            public final void run() {
                C13600.m33236(this.f11090);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33236(C13600 c13600) {
        c13600.f12806.m40697((Runnable) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33237(C13600 c13600) {
        C17485 c17485 = c13600.f12806;
        if (c13600.f44861.mo2357()) {
            return true;
        }
        return c17485 != null && c17485.m40693();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        try {
            this.f44860 = this.f44865.m29189(new InterfaceC5614() { // from class: l.ۙۙ᩹
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return C13600.m33237(this.f15741);
                }
            });
            ViewOnClickListenerC7955.m21001(this.f44865);
            C15218 c15218 = this.f44860;
            InterfaceC5614 interfaceC5614 = new InterfaceC5614() { // from class: l.ۙۙ᩹
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return C13600.m33237(this.f15741);
                }
            };
            byte[] bArr = this.f44862;
            if (bArr == null || bArr.length == 0) {
                throw new IllegalArgumentException("Search pattern must not be empty");
            }
            long jM20994 = (((long) ViewOnClickListenerC7955.m20994(this.f44866, true)) - ((long) bArr.length)) + 1;
            int iM20994 = jM20994 < 0 ? -1 : ViewOnClickListenerC7955.m20994(jM20994, false);
            InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
            int iM36429 = c15218.m36429(bArr, iM20994, interfaceC5614M29777);
            if (iM36429 == -1 && !interfaceC5614M29777.mo2357()) {
                iM36429 = c15218.m36429(bArr, c15218.length(), interfaceC5614M29777);
            }
            this.f44867 = iM36429;
        } catch (Throwable th) {
            ViewOnClickListenerC7955.m21001(this.f44865);
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws IOException {
        C2516 c2516 = this.f44868;
        C15218 c15218 = this.f44860;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f44863;
        if (ViewOnClickListenerC7955.m21004(viewOnClickListenerC7955, c2516, c15218)) {
            C17485 c17485 = this.f12806;
            if (this.f44861.mo2357()) {
                return;
            }
            if (c17485 == null || !c17485.m40693()) {
                int i = this.f44867;
                if (i == -1) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                int length = this.f44862.length;
                int length2 = this.f44860.length();
                long j = ((long) i) + ((long) length);
                if (i >= 0 && length > 0 && j <= length2) {
                    int i2 = ((int) j) - 1;
                    viewOnClickListenerC7955.f26141 = new C3720(this.f44868, this.f44860.m36426(), this.f44867, i2);
                    this.f44864.m32225(this.f44867, i2);
                    return;
                }
                throw new IOException("Search result exceeds snapshot length");
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof C1105) {
            return;
        }
        ViewOnClickListenerC7955.m20999(this.f44863, this.f44864, this.f44868, exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ViewOnClickListenerC7955.m21001(this.f44865);
        C15218 c15218 = this.f44860;
        if (c15218 != null) {
            try {
                c15218.close();
            } catch (IOException unused) {
            }
        }
        m10251();
        ViewOnClickListenerC7955.m21005(this.f44863, this.f44861);
    }
}
