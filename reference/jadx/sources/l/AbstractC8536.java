package l;

/* JADX INFO: renamed from: l.ۡ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8536 extends AbstractC7124 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC7124[] f29544;

    @Override // l.AbstractC7124
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final void mo19022(AbstractC7124[] abstractC7124Arr) {
        this.f29544 = abstractC7124Arr;
    }

    public AbstractC8536(EnumC9947 enumC9947, AbstractC7124[] abstractC7124Arr) {
        super(enumC9947, EnumC19699.En);
        this.f29544 = abstractC7124Arr;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC7124[] m22290() {
        int length = this.f29544.length;
        AbstractC7124[] abstractC7124Arr = new AbstractC7124[length];
        for (int i = 0; i < length; i++) {
            AbstractC7124 abstractC7124 = this.f29544[i];
            abstractC7124.getClass();
            abstractC7124Arr[i] = abstractC7124.clone();
        }
        return abstractC7124Arr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7124[] m22291(C10527 c10527) {
        int length = this.f29544.length;
        AbstractC7124[] abstractC7124Arr = new AbstractC7124[length];
        for (int i = 0; i < length; i++) {
            abstractC7124Arr[i] = this.f29544[i].mo3325(c10527);
        }
        return abstractC7124Arr;
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC7124[] mo19023() {
        return this.f29544;
    }
}
