package l;

/* JADX INFO: renamed from: l.ܰۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13616 implements InterfaceC23411 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0498 f44929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44930;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6143 f44931;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9300 f44932;

    public AbstractC13616(C6143 c6143, int i, C0498 c0498, C9300 c9300) {
        if (c6143 == null) {
            throw new NullPointerException("definingClass == null");
        }
        this.f44931 = c6143;
        this.f44930 = i;
        this.f44929 = c0498;
        this.f44932 = c9300;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f44929.mo2376());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ᩹ */
    public final C6143 mo30828() {
        return this.f44931;
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ۨ */
    public final int mo30824() {
        return this.f44930;
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ۬ */
    public final C0498 mo30825() {
        return this.f44929;
    }

    @Override // l.InterfaceC23411
    public final C17432 getName() {
        return this.f44929.getName();
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ֨ */
    public final C17432 mo30818() {
        return this.f44929.m2380();
    }

    @Override // l.InterfaceC23411
    public final C9300 getAttributes() {
        return this.f44932;
    }
}
