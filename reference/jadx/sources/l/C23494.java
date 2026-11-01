package l;

/* JADX INFO: renamed from: l.᩻ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BC1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23494 extends AbstractC10586 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19052[] f76075;

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        return null;
    }

    public C23494(C11312 c11312, C0727 c0727) {
        super(c11312, c0727);
        if (c0727.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f76075 = null;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final int mo15536() {
        m51754();
        int iMo15536 = 0;
        for (C19052 c19052 : this.f76075) {
            iMo15536 += c19052.mo15536();
        }
        return iMo15536;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo15535(C2718 c2718) {
        m51754();
        for (C19052 c19052 : this.f76075) {
            c19052.mo15535(c2718);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m51754() {
        if (this.f76075 != null) {
            return;
        }
        C0727 c0727M38695 = m38695();
        int size = c0727M38695.size();
        this.f76075 = new C19052[size];
        int iM38396 = 0;
        for (int i = 0; i < size; i++) {
            C16251 c16251M15275get = c0727M38695.m15275get(i);
            this.f76075[i] = AbstractC16438.m38692(C11312.f38175, C16251.m38381(iM38396, c16251M15275get.getType()), c16251M15275get);
            iM38396 += c16251M15275get.m38396();
        }
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C23494(m38701(), c0727);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        C0727 c0727M38695 = m38695();
        int size = c0727M38695.size();
        StringBuilder sb = new StringBuilder(100);
        int iM38396 = 0;
        for (int i = 0; i < size; i++) {
            C16251 c16251M15275get = c0727M38695.m15275get(i);
            C19052 c19052M38692 = AbstractC16438.m38692(C11312.f38175, C16251.m38381(iM38396, c16251M15275get.getType()), c16251M15275get);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c19052M38692.mo15537());
            iM38396 += c16251M15275get.m38396();
        }
        return sb.toString();
    }
}
