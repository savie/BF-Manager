package l;

/* JADX INFO: renamed from: l.᩷ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20706 extends AbstractC17364 {
    public static final long serialVersionUID = 7107973622016897488L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f67329;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11015 f67330;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f67331;

    public C20706(C22823 c22823, String str, String str2, AbstractC11015 abstractC11015) {
        super(c22823);
        this.f67329 = str;
        this.f67331 = str2;
        this.f67330 = abstractC11015;
    }

    @Override // l.AbstractC17364
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20187 mo40398() {
        return (AbstractC20187) getSource();
    }

    @Override // l.AbstractC17364
    /* JADX INFO: renamed from: ۖ */
    public final String mo40397() {
        return this.f67329;
    }

    @Override // l.AbstractC17364
    public final String getName() {
        return this.f67331;
    }

    @Override // java.util.EventObject
    public final String toString() {
        return "[ServiceEventImpl@" + System.identityHashCode(this) + "\n\tname: '" + this.f67331 + "' type: '" + this.f67329 + "' info: '" + this.f67330 + "']";
    }

    @Override // l.AbstractC17364
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC11015 mo40399() {
        return this.f67330;
    }

    @Override // l.AbstractC17364
    public final Object clone() {
        return new C20706((C22823) ((AbstractC20187) getSource()), this.f67329, this.f67331, new C0244(this.f67330));
    }

    @Override // l.AbstractC17364
    public final AbstractC17364 clone() {
        return new C20706((C22823) ((AbstractC20187) getSource()), this.f67329, this.f67331, new C0244(this.f67330));
    }
}
