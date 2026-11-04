package l;

/* JADX INFO: renamed from: l.۟ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C7681 extends AbstractC6935 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f25274;

    @Override // l.AbstractC6935
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6935 mo1678() {
        AbstractC6935.m19218(this.f25274);
        return this;
    }

    public C7681() {
        super(EnumC8426.Comment);
        this.f25274 = new StringBuilder();
    }

    public final String toString() {
        return "<!--" + this.f25274.toString() + "-->";
    }
}
