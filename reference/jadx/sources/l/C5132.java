package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5132 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15218 f17845;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18538 f17846;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f17847;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7955 f17848;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f17849;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11690 f17850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17851;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17852;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2516 f17853;

    public C5132(ViewOnClickListenerC7955 viewOnClickListenerC7955, C18538 c18538, C2516 c2516, byte[] bArr, int i, C13026 c13026) {
        this.f17848 = viewOnClickListenerC7955;
        this.f17846 = c18538;
        this.f17853 = c2516;
        this.f17847 = bArr;
        this.f17851 = i;
        this.f17849 = c13026;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C18538 c18538 = this.f17846;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f17848;
        ViewOnClickListenerC7955.m21000(viewOnClickListenerC7955, c18538);
        this.f17850 = this.f17853.m7806();
        m10248(viewOnClickListenerC7955.f26140, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۨۙ᩹
            @Override // java.lang.Runnable
            public final void run() {
                C5132.m14290(this.f38651);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14290(C5132 c5132) {
        c5132.f12806.m40697((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m14289() {
        C17485 c17485 = this.f12806;
        if (this.f17846.mo2357()) {
            return true;
        }
        return c17485 != null && c17485.m40693();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        try {
            this.f17845 = this.f17850.m29189(new InterfaceC5614() { // from class: l.ۖۙ᩹
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f8224.m14289();
                }
            });
            ViewOnClickListenerC7955.m21001(this.f17850);
            C15218 c15218 = this.f17845;
            InterfaceC5614 interfaceC5614 = new InterfaceC5614() { // from class: l.ۖۙ᩹
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f8224.m14289();
                }
            };
            byte[] bArr = this.f17847;
            int iM36425 = c15218.m36425(bArr, this.f17851, interfaceC5614);
            this.f17852 = iM36425;
            if (iM36425 != -1 || m14289()) {
                return;
            }
            this.f17852 = this.f17845.m36425(bArr, 0, new InterfaceC5614() { // from class: l.ۖۙ᩹
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f8224.m14289();
                }
            });
        } catch (Throwable th) {
            ViewOnClickListenerC7955.m21001(this.f17850);
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws IOException {
        C2516 c2516 = this.f17853;
        C15218 c15218 = this.f17845;
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = this.f17848;
        if (ViewOnClickListenerC7955.m21004(viewOnClickListenerC7955, c2516, c15218) && !m14289()) {
            int i = this.f17852;
            if (i == -1) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            int length = this.f17847.length;
            int length2 = this.f17845.length();
            long j = ((long) i) + ((long) length);
            if (i >= 0 && length > 0 && j <= length2) {
                int i2 = ((int) j) - 1;
                viewOnClickListenerC7955.f26141 = new C3720(this.f17853, this.f17845.m36426(), this.f17852, i2);
                this.f17849.m32225(this.f17852, i2);
                return;
            }
            throw new IOException("Search result exceeds snapshot length");
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof C1105) {
            return;
        }
        ViewOnClickListenerC7955.m20999(this.f17848, this.f17849, this.f17853, exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ViewOnClickListenerC7955.m21001(this.f17850);
        C15218 c15218 = this.f17845;
        if (c15218 != null) {
            try {
                c15218.close();
            } catch (IOException unused) {
            }
        }
        m10251();
        ViewOnClickListenerC7955.m21005(this.f17848, this.f17846);
    }
}
