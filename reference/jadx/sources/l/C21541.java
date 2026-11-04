package l;

/* JADX INFO: renamed from: l.᩶᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C21541 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68814;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14573 f68815 = new C14573(new byte[64], 64);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1150 f68816;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f68817;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f68818;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6867 f68819;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f68820;

    public C21541(InterfaceC6867 interfaceC6867, C1150 c1150) {
        this.f68819 = interfaceC6867;
        this.f68816 = c1150;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48984() {
        this.f68818 = false;
        this.f68819.mo1349();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48985(C21287 c21287) {
        C14573 c14573 = this.f68815;
        c21287.m48490(0, 3, c14573.f45926);
        c14573.m35167(0);
        c14573.m35161(8);
        this.f68820 = c14573.m35162();
        this.f68814 = c14573.m35162();
        c14573.m35161(6);
        c21287.m48490(0, c14573.m35163(8), c14573.f45926);
        c14573.m35167(0);
        this.f68817 = 0L;
        if (this.f68820) {
            c14573.m35161(4);
            long jM35163 = ((long) c14573.m35163(3)) << 30;
            c14573.m35161(1);
            long jM35164 = jM35163 | ((long) (c14573.m35163(15) << 15));
            c14573.m35161(1);
            long jM35165 = jM35164 | ((long) c14573.m35163(15));
            c14573.m35161(1);
            boolean z = this.f68818;
            C1150 c1150 = this.f68816;
            if (!z && this.f68814) {
                c14573.m35161(4);
                long jM35166 = ((long) c14573.m35163(3)) << 30;
                c14573.m35161(1);
                long jM35167 = jM35166 | ((long) (c14573.m35163(15) << 15));
                c14573.m35161(1);
                long jM35168 = ((long) c14573.m35163(15)) | jM35167;
                c14573.m35161(1);
                c1150.m4249(jM35168);
                this.f68818 = true;
            }
            this.f68817 = c1150.m4249(jM35165);
        }
        long j = this.f68817;
        InterfaceC6867 interfaceC6867 = this.f68819;
        interfaceC6867.mo1350(4, j);
        interfaceC6867.mo1352(c21287);
        interfaceC6867.mo1353(false);
    }
}
