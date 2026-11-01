package l;

/* JADX INFO: renamed from: l.ۚۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5135 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f17857;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17858;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4429 f17859;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f17860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f17861;

    public C5135(InterfaceC4429 interfaceC4429, C0113 c0113) {
        this.f17859 = interfaceC4429;
        this.f17860 = C0901.m3595(c0113.f1089);
        this.f17857 = c0113.f1087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14293(String str) {
        InterfaceC4429 interfaceC4429 = this.f17859;
        boolean z = this.f17857;
        int i = this.f17860;
        if (i == 2) {
            if (this.f17858 || !z) {
                String str2 = this.f17861;
                if (str2 != null) {
                    interfaceC4429.mo12361(str2);
                    this.f17861 = null;
                }
                interfaceC4429.mo12358();
            }
            this.f17858 = false;
            this.f17861 = str;
            return;
        }
        if (!z || this.f17858) {
            if (i == 0) {
                interfaceC4429.mo12361(str);
            }
            interfaceC4429.mo12358();
            this.f17858 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14291() {
        int i = this.f17860;
        InterfaceC4429 interfaceC4429 = this.f17859;
        boolean z = this.f17857;
        if (i == 2) {
            if (this.f17858 || !z) {
                String str = this.f17861;
                if (str != null) {
                    interfaceC4429.mo12361(str);
                    this.f17861 = null;
                }
                interfaceC4429.mo12358();
                return;
            }
            return;
        }
        if (this.f17858 || !z) {
            interfaceC4429.mo12358();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14292(char c) {
        String str = this.f17861;
        InterfaceC4429 interfaceC4429 = this.f17859;
        if (str != null) {
            interfaceC4429.mo12361(str);
            this.f17861 = null;
        }
        interfaceC4429.mo12359(c);
        this.f17858 = true;
    }
}
