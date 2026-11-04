package l;

/* JADX INFO: renamed from: l.ۘۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3917 extends AbstractC12384 implements InterfaceC10540 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f13378 = EnumC7011.Format21ih;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f13379;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f13380;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C3917(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18435(i);
        this.f13379 = i;
        if ((65535 & i2) == 0) {
            this.f13380 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f13379;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1546() {
        return this.f13380;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f13380;
    }

    @Override // l.InterfaceC17363
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final short mo12624() {
        return (short) (this.f13380 >>> 16);
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f13378;
    }
}
