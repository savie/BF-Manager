package l;

/* JADX INFO: renamed from: l.ۗᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4TR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3609 extends AbstractC21597 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20763 f12368;

    public C3609(C13304 c13304, int i, int i2, int i3) {
        super(c13304);
        this.f69000 = i;
        this.f68997 = i2;
        this.f68999 = i3;
    }

    public C3609(C13304 c13304, String str, C25042[] c25042Arr, int i) {
        super(c13304);
        this.f12368 = ((C23001) super.mo11705()).mo15675().m31248(str, c25042Arr);
        this.f68997 = 3;
        this.f68999 = i;
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    public final int getValue() {
        C20763 c20763;
        if (mo16635() == 3 && (c20763 = this.f12368) != null) {
            return c20763.m47469();
        }
        return super.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11706(int i) {
        this.f69000 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m11709(int i) {
        if (i != 3 && this.f12368 != null) {
            this.f12368 = null;
        }
        this.f68997 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11711(int i) {
        this.f68999 = i;
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    /* JADX INFO: renamed from: ᩴ᩷ */
    public final C20763 mo11710() {
        C20763 c20763 = this.f12368;
        if (c20763 != null) {
            return c20763;
        }
        throw new RuntimeException("stringItem == null");
    }

    @Override // l.AbstractC21597
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 mo11705() {
        return (C23001) super.mo11705();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11707(String str, C25042[] c25042Arr) {
        this.f12368 = ((C23001) super.mo11705()).mo15675().m31248(str, c25042Arr);
        this.f68997 = 3;
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10869 mo11708() {
        return (C25239) super.mo11708();
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    public final InterfaceC8697 getEntry() {
        return (C13304) super.getEntry();
    }

    @Override // l.AbstractC21597, l.InterfaceC5650
    public final C13304 getEntry() {
        return (C13304) super.getEntry();
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11704() {
        C13304 c13304 = (C13304) super.getEntry();
        int iMo18154 = c13304.mo18154();
        for (int i = 0; i < iMo18154; i++) {
            if (c13304.getValue(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
