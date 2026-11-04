package l;

/* JADX INFO: renamed from: l.᩻ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes.dex */
public class C25029 extends AbstractC14080 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f80985;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f80986;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f80987;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f80988;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f80989;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC6383 f80990;

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ۙ */
    public final int mo5132() {
        return 15;
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ܳ */
    public final void mo5133(C3399 c3399) {
        String str = this.f80987;
        c3399.m11129((Object) str);
        if (str != null) {
            c3399.m11130(str);
        }
        c3399.m11138(this.f80985);
        c3399.m11138(this.f80985);
        c3399.m11129(this.f80990);
        AbstractC6383 abstractC6383 = this.f80990;
        if (abstractC6383 != null) {
            c3399 = c3399.f11057;
            abstractC6383.mo6571(c3399);
        }
        c3399.m11138(this.f80989);
        c3399.m11138(this.f80986);
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5135(C3399 c3399) {
        this.f80985 = c3399.m11127();
        c3399.m11127();
        if (c3399.m11127() != 0) {
            if (this.f80990 == null) {
                this.f80990 = new C16077();
            }
            c3399 = c3399.f11057;
            this.f80990.mo6570(c3399);
        }
        c3399.m11127();
        this.f80986 = c3399.m11127();
        this.f80988 = c3399.m11127();
    }
}
