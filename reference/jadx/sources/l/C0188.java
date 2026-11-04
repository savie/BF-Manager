package l;

/* JADX INFO: renamed from: l.֡ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45MR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0188 extends AbstractC12384 implements InterfaceC12778 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f1287 = EnumC7011.Format22b;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f1288;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f1289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f1290;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", " + mo1545();
    }

    public C0188(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18435(i);
        this.f1288 = i;
        C6544.m18435(i2);
        this.f1289 = i2;
        if (i3 >= -128 && i3 <= 127) {
            this.f1290 = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i3)));
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1542() {
        return this.f1288;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo1541() {
        return this.f1289;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo1546() {
        return this.f1290;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo1545() {
        return this.f1290;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC7011 mo1544() {
        return f1287;
    }
}
