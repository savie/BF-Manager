package l;

/* JADX INFO: renamed from: l.ܺ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1570 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15592 extends AbstractC9242 {
    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4777 mo985(C10527 c10527) {
        return new C15592(this.f16795, this.f31402.mo3325(c10527), this.f31401.mo3325(c10527));
    }

    public final String toString() {
        int i = C20530.f66510[this.f16795.ordinal()];
        if (i == 1) {
            return this.f31402 + " = " + this.f31401;
        }
        if (i == 2 || i == 3) {
            return this.f31402 + " := " + this.f31401;
        }
        if (i == 4) {
            return this.f31402 + " <- " + this.f31401;
        }
        return super.toString();
    }

    public C15592(EnumC2890 enumC2890, AbstractC7124 abstractC7124, AbstractC7124 abstractC7125) {
        super(enumC2890, EnumC19699.E2);
        this.f31402 = abstractC7124;
        this.f31401 = abstractC7125;
    }
}
