package l;

/* JADX INFO: renamed from: l.᩺ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes2.dex */
public final class C24425 extends AbstractC21597 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C6525 f79291;

    public C24425(C12490 c12490, int i, int i2, int i3, C6525 c6525) {
        super(c12490);
        this.f68999 = i;
        this.f68997 = i2;
        this.f69000 = i3;
        this.f79291 = c6525;
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    /* JADX INFO: renamed from: ᩴ᩷ */
    public final InterfaceC16090 mo11710() {
        return this.f79291;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ֫ۙ */
    public final int mo11704() {
        C12490 c12490 = (C12490) getEntry();
        for (int i = 0; i < c12490.f40102.size(); i++) {
            if (c12490.f40102.get(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
