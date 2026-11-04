package l;

/* JADX INFO: renamed from: l.ۛ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6419 extends AbstractC12384 implements InterfaceC20347 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21335 f21639;

    public AbstractC6419(EnumC22631 enumC22631, C21335 c21335) {
        super(enumC22631);
        this.f21639 = c21335;
    }

    @Override // l.InterfaceC20347
    /* JADX INFO: renamed from: ܽ */
    public final int mo11703() {
        int i = this.f21639.m48561().f30505 - m30863().f30505;
        if (mo3033() == 1) {
            if (i < -128 || i > 127) {
                throw new C23044(null, "Invalid instruction offset: %d. Offset must be in [-128, 127]", Integer.valueOf(i));
            }
        } else if (mo3033() == 2 && (i < -32768 || i > 32767)) {
            throw new C23044(null, "Invalid instruction offset: %d. Offset must be in [-32768, 32767]", Integer.valueOf(i));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21335 m18177() {
        return this.f21639;
    }
}
