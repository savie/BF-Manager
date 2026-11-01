package l;

/* JADX INFO: renamed from: l.᩺ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes.dex */
public final class C23059 extends AbstractC20611 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15298 f74907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23059(C15298 c15298, C17684 c17684, int i, int i2, int i3) {
        super(c17684, i, i2);
        this.f74907 = c15298;
        this.f74906 = i3;
    }

    @Override // l.AbstractC20611
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15967(C18825 c18825, int i) {
        if (i == this.f74906 - 1) {
            return new C5690(c18825);
        }
        return new C21647(this.f74907.f49838, c18825);
    }
}
