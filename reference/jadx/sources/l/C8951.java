package l;

/* JADX INFO: renamed from: l.۠᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8951 extends AbstractC24527 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7460 f29206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8951(C7460 c7460) {
        super(c7460.f26648);
        this.f29206 = c7460;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8951(C7460 c7460, int i, int i2) {
        super(i, i2);
        this.f29206 = c7460;
    }

    @Override // l.AbstractC24527
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo23938() {
        return this.f29206.f26649;
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char mo23935(int i) {
        return this.f29206.f24582.f44819[i];
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16321 mo23936(int i, int i2) {
        return new C8951(this.f29206, i, i2);
    }

    @Override // l.AbstractC23781, l.InterfaceC9154
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean tryAdvance(InterfaceC12089 interfaceC12089) {
        if (this.f77037 >= mo31302()) {
            return false;
        }
        char[] cArr = this.f29206.f24582.f44819;
        int i = this.f77037;
        this.f77037 = i + 1;
        interfaceC12089.mo10258(cArr[i]);
        return true;
    }

    @Override // l.AbstractC23781, l.AbstractC2809, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        char[] cArr = this.f29206.f24582.f44819;
        int iMo31302 = mo31302();
        while (true) {
            int i = this.f77037;
            if (i >= iMo31302) {
                return;
            }
            this.f77037 = i + 1;
            interfaceC12089.mo10258(cArr[i]);
        }
    }
}
