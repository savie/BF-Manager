package l;

/* JADX INFO: renamed from: l.ۚ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5667 extends C15420 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f19347;

    public C5667(int i) {
        super(i);
        this.f19347 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15551(int i, C12018 c12018) {
        m36889(i, (InterfaceC23181) c12018);
        this.f19347 = -1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m15555() {
        if (this.f19347 == -1) {
            C2844 c2844 = new C2844();
            m15552(c2844);
            this.f19347 = c2844.m8602();
        }
        return this.f19347;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m15554() {
        int size = size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            C12018 c12018 = (C12018) m15263(i);
            if (c12018 != null) {
                size2 = c12018.m29911().size() + size2;
            }
        }
        return size2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12018 m15553(int i) {
        int iM36887 = m36887(i);
        if (iM36887 >= 0) {
            return (C12018) m15249(iM36887);
        }
        throw new IllegalArgumentException("no such label: ".concat(C22475.m49982(i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15552(InterfaceC23307 interfaceC23307) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((C12018) m15249(i)).m29911().m48687(interfaceC23307);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5667 m15556() {
        C5667 c5667 = new C5667(this);
        c5667.f19347 = this.f19347;
        return c5667;
    }
}
