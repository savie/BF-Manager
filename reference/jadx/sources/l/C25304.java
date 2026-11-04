package l;

/* JADX INFO: renamed from: l.᩻᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04XX */
/* JADX INFO: loaded from: classes2.dex */
public final class C25304 extends AbstractC12384 implements InterfaceC18745 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f81744 = EnumC7011.Format51l;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f81745;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f81746;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C25304(EnumC22631 enumC22631, int i, long j) {
        super(enumC22631);
        C6544.m18435(i);
        this.f81745 = i;
        this.f81746 = j;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f81745;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f81746;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f81744;
    }
}
