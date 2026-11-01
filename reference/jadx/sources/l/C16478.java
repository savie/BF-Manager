package l;

/* JADX INFO: renamed from: l.ܽۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16478 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f52951;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17183 f52952;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C16478(C17183 c17183, long j) {
        this.f52952 = c17183;
        this.f52951 = j;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f52951;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C17183 c17183 = this.f52952;
        C12950 c12950M51852 = c17183.f54782[0].m51852(j);
        for (int i = 1; i < c17183.f54782.length; i++) {
            C12950 c12950M51853 = c17183.f54782[i].m51852(j);
            if (c12950M51853.f43052.f74277 < c12950M51852.f43052.f74277) {
                c12950M51852 = c12950M51853;
            }
        }
        return c12950M51852;
    }
}
