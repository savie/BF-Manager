package l;

/* JADX INFO: renamed from: l.ܳ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14820 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23992 f48439;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23992 f48440;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48441;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48442;

    public C14820(int i) {
        this.f48442 = i;
        this.f48441 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35506(int i, int i2) {
        int i3 = this.f48442;
        int i4 = this.f48441;
        C23992 c23992 = new C23992(i3, i4, i, i2);
        C23992 c23993 = this.f48439;
        if (c23993 != null) {
            c23993.f77761 = c23992;
        } else {
            this.f48440 = c23992;
        }
        this.f48439 = c23992;
        this.f48442 = i3 + i;
        this.f48441 = i4 + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35505(int i) {
        this.f48442 += i;
        this.f48441 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23992 m35504() {
        return this.f48440;
    }
}
