package l;

/* JADX INFO: renamed from: l.ۨۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12177 extends AbstractC23366 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39160;

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo9527();

    @Override // l.AbstractC14083, l.InterfaceC8409
    public final InterfaceC15906 trySplit() {
        InterfaceC15906 interfaceC15906Mo9526;
        int iMo30440 = mo30440();
        int i = this.f75652;
        int iMo30441 = mo30440();
        int i2 = this.f75652;
        int iM18182 = C6421.m18182(iMo30441, i2, 2, i);
        if (iM18182 == i2 || iM18182 == iMo30440) {
            interfaceC15906Mo9526 = null;
        } else {
            if (iM18182 < i2 || iM18182 > iMo30440) {
                StringBuilder sbM12235 = C3769.m12235(iM18182, "splitPoint ", " outside of range of current position ");
                sbM12235.append(this.f75652);
                sbM12235.append(" and range end ");
                sbM12235.append(iMo30440);
                throw new IndexOutOfBoundsException(sbM12235.toString());
            }
            interfaceC15906Mo9526 = mo9526(i2, iM18182);
            this.f75652 = iM18182;
        }
        if (!this.f39159 && interfaceC15906Mo9526 != null) {
            this.f39160 = mo9527();
            this.f39159 = true;
        }
        return interfaceC15906Mo9526;
    }

    public AbstractC12177(int i) {
        super(i);
        this.f39160 = -1;
        this.f39159 = false;
    }

    public AbstractC12177(int i, int i2) {
        super(i);
        this.f39160 = i2;
        this.f39159 = true;
    }

    @Override // l.AbstractC23366
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo30440() {
        return this.f39159 ? this.f39160 : mo9527();
    }
}
