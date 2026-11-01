package l;

/* JADX INFO: renamed from: l.ۤۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9998 extends AbstractC9293 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21825 f34166;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f34167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f34168;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9998(C13609 c13609, EnumC5992 enumC5992, C14232 c14232) {
        super(c13609, enumC5992, c14232);
        this.f34168 = c13609;
        this.f34166 = C21825.m48588();
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ܰ */
    public final void mo1181(C21825 c21825) {
        this.f34166 = this.f34166.m48594(c21825);
        boolean z = this.f34167;
        if (z) {
            return;
        }
        this.f34167 = true;
        while (this.f34166.m48595()) {
            try {
                C21825 c21826 = this.f34166;
                C4603 c4603 = (C4603) c21826.f70876;
                this.f34166 = c21826.f70877;
                super.mo1181(C21825.of((Object) c4603));
            } catch (Throwable th) {
                this.f34167 = z;
                throw th;
            }
        }
        this.f34167 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25266(C22492 c22492, C4603 c4603) {
        C0309 c0309 = (C0309) c22492.f77449;
        C13609 c13609 = this.f34168;
        C6263 c6263 = new C6263(262160L, c13609.f44901.f77533, c22492.f77449, c22492);
        c6263.f21226 = 0;
        Object obj = c4603.f16299;
        ((C22990) obj).f74722.mo24224(c6263);
        if ((c22492.f77447 & 512) == 0 && c0309.f1654.m39001(EnumC6617.CLASS)) {
            C6263 c6264 = new C6263(262160L, c13609.f44901.f77638, c0309.f1654, c22492);
            c6264.f21226 = 0;
            ((C22990) obj).f74722.mo24224(c6264);
        }
    }
}
