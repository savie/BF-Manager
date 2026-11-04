package l;

/* JADX INFO: renamed from: l.֡ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0238 extends AbstractC18883 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f1503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence f1504;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5459 f1505;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5459 f1506;

    public C0238(C5459 c5459, C5459 c54510, CharSequence charSequence, CharSequence charSequence2, InterfaceC21646 interfaceC21646, C15087 c15087) {
        super(charSequence.length(), charSequence2.length(), interfaceC21646, c15087);
        this.f1506 = c5459;
        this.f1505 = c54510;
        this.f1504 = charSequence;
        this.f1503 = charSequence2;
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1719(int i, int i2, int i3, int i4) {
        for (C22547 c22547 : C1730.m6130(this.f1504.subSequence(i, i2), this.f1503.subSequence(i3, i4), this.f61295).mo3131()) {
            int i5 = c22547.f72892;
            this.f61294.m54961(i + i5, c22547.f72894 + i3, c22547.f72891 - i5);
        }
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10612 mo1718(int i) {
        C5459 c5459 = this.f1506;
        return new C10612(c5459.f19056[i], c5459.m16292(i));
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10612 mo1720(int i) {
        C5459 c5459 = this.f1505;
        return new C10612(c5459.f19056[i], c5459.m16292(i));
    }
}
