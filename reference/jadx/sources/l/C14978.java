package l;

/* JADX INFO: renamed from: l.ܳ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C14978 extends C15746 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f48899;

    public C14978(int i) {
        super(i);
        this.f48899 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36041(int i, C22438 c22438) {
        m37667(i, (InterfaceC17238) c22438);
        this.f48899 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36043() {
        if (this.f48899 == -1) {
            C19454 c19454 = new C19454();
            m36042(c19454);
            this.f48899 = c19454.m44961();
        }
        return this.f48899;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m36045() {
        int size = size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            C22438 c22438 = (C22438) m31607(i);
            if (c22438 != null) {
                size2 = c22438.m50596().size() + size2;
            }
        }
        return size2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22438 m36044(int i) {
        int iM37669 = m37669(i);
        if (iM37669 >= 0) {
            return (C22438) m31593(iM37669);
        }
        throw new IllegalArgumentException("no such label: ".concat(C5306.m15934(i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36042(InterfaceC16470 interfaceC16470) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((C22438) m31593(i)).m50596().m37630(interfaceC16470);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14978 m36040() {
        C14978 c14978 = new C14978(this);
        c14978.f48899 = this.f48899;
        return c14978;
    }
}
