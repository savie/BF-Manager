package l;

/* JADX INFO: renamed from: l.᩹ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YL */
/* JADX INFO: loaded from: classes.dex */
public final class C22189 extends AbstractC14738 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Integer f72587;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f72588;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f72589;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72590;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Integer f72591;

    @Override // l.AbstractC19367
    /* JADX INFO: renamed from: ۙ */
    public final void mo3851(InterfaceC10901 interfaceC10901) {
        interfaceC10901.mo27326(this);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Integer m49228() {
        return this.f72591;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49226(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f72587;
        if (num2 == null || num2.intValue() >= num.intValue()) {
            this.f72591 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49223(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f72591;
        if (num2 == null || num.intValue() >= num2.intValue()) {
            this.f72587 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m49221() {
        return this.f72590;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49222(int i) {
        this.f72590 = i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m49225() {
        return this.f72588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49224(String str) {
        this.f72588 = str;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m49229() {
        return this.f72589;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49227(String str) {
        this.f72589 = str;
    }
}
