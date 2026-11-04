package l;

/* JADX INFO: renamed from: l.ۢۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes4.dex */
public final class C10056 extends AbstractC22803 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1108 f32241;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10056(C1108 c1108, C24975 c24975, int i, int i2, int i3) {
        super(c24975, i, i2);
        this.f32241 = c1108;
        this.f32242 = i3;
    }

    @Override // l.AbstractC22803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25986(C8565 c8565, int i) {
        if (i == this.f32242 - 1) {
            return new C21574(c8565);
        }
        return new C9310(this.f32241.f3927, c8565);
    }
}
