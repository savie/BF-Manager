package l;

/* JADX INFO: renamed from: l.ܿܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18483 extends AbstractC23705 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f60156;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f60157;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f60158;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Integer f60159;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Integer f60160;

    @Override // l.AbstractC4534
    /* JADX INFO: renamed from: ۙ */
    public final void mo2667(InterfaceC17212 interfaceC17212) {
        interfaceC17212.mo7353(this);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Integer m43074() {
        return this.f60160;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43075(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f60159;
        if (num2 == null || num2.intValue() >= num.intValue()) {
            this.f60160 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43071(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f60160;
        if (num2 == null || num.intValue() >= num2.intValue()) {
            this.f60159 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43069() {
        return this.f60157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43070(int i) {
        this.f60157 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m43073() {
        return this.f60156;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43072(String str) {
        this.f60156 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m43077() {
        return this.f60158;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43076(String str) {
        this.f60158 = str;
    }
}
