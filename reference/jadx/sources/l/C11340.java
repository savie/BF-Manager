package l;

/* JADX INFO: renamed from: l.ۧۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11340 extends AbstractC3508 {
    public static final long serialVersionUID = 7107973622016897488L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC12457 f35730;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f35731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f35732;

    public C11340(C14168 c14168, String str, String str2, AbstractC12457 abstractC12457) {
        super(c14168);
        this.f35731 = str;
        this.f35732 = str2;
        this.f35730 = abstractC12457;
    }

    @Override // l.AbstractC3508
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16932 mo11500() {
        return (AbstractC16932) getSource();
    }

    @Override // l.AbstractC3508
    /* JADX INFO: renamed from: ۤ */
    public final String mo11501() {
        return this.f35731;
    }

    @Override // l.AbstractC3508
    public final String getName() {
        return this.f35732;
    }

    @Override // java.util.EventObject
    public final String toString() {
        return "[ServiceEventImpl@" + System.identityHashCode(this) + "\n\tname: '" + this.f35732 + "' type: '" + this.f35731 + "' info: '" + this.f35730 + "']";
    }

    @Override // l.AbstractC3508
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC12457 mo11502() {
        return this.f35730;
    }

    @Override // l.AbstractC3508
    public final Object clone() {
        return new C11340((C14168) ((AbstractC16932) getSource()), this.f35731, this.f35732, new C17307(this.f35730));
    }

    @Override // l.AbstractC3508
    public final AbstractC3508 clone() {
        return new C11340((C14168) ((AbstractC16932) getSource()), this.f35731, this.f35732, new C17307(this.f35730));
    }
}
