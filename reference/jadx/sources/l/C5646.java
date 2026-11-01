package l;

/* JADX INFO: renamed from: l.ۚ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB9P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5646 extends AbstractC10586 {
    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        return null;
    }

    public C5646(C11312 c11312) {
        super(c11312, C0727.f3015);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo15536() {
        return m38698() & 1;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15535(C2718 c2718) {
        if (mo15536() != 0) {
            c2718.m8297(AbstractC14322.m34563(0, 0));
        }
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C5646(m38701());
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo15537() {
        if (mo15536() == 0) {
            return null;
        }
        return "nop // spacer";
    }
}
