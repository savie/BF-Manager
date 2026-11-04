package l;

/* JADX INFO: renamed from: l.ܽۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes5.dex */
public final class C17569 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f57089;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57090;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f57091;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11129((Object) this.f57089);
        c3399.m11138(this.f57090);
        c3399.m11129((Object) this.f57091);
        String str = this.f57089;
        if (str != null) {
            c3399 = c3399.f11057;
            c3399.m11130(str);
        }
        String str2 = this.f57091;
        if (str2 != null) {
            c3399.f11057.m11130(str2);
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) {
        c3399.m11136(4);
        int iM11127 = c3399.m11127();
        this.f57090 = c3399.m11127();
        int iM11128 = c3399.m11127();
        if (iM11127 != 0) {
            c3399 = c3399.f11057;
            this.f57089 = c3399.m11137();
        }
        if (iM11128 != 0) {
            this.f57091 = c3399.f11057.m11137();
        }
    }
}
