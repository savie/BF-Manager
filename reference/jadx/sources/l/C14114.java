package l;

/* JADX INFO: renamed from: l.ܰ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BF0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14114 extends AbstractC7763 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16956 f46353;

    public C14114(C11312 c11312, C16956 c16956) {
        super(c11312);
        if (c16956 == null) {
            throw new NullPointerException("locals == null");
        }
        this.f46353 = c16956;
    }

    @Override // l.AbstractC7763, l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16438 mo20431(int i) {
        return new C14114(m38701(), this.f46353.m39741(i));
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C14114(m38701(), this.f46353);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16956 m34152() {
        return this.f46353;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        return this.f46353.toString();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        C16956 c16956 = this.f46353;
        int size = c16956.size();
        int iM39743 = c16956.m39743();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < iM39743; i++) {
            C16251 c16251 = c16956.get(i);
            if (c16251 != null) {
                sb.append("\n  ");
                sb.append(C11997.m29882(c16251));
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo29883(C11976 c11976) {
        C11312 c11312M38701 = m38701();
        C16956 c16956 = this.f46353;
        int iM39743 = c16956.m39743();
        C16956 c16957 = new C16956(c11976.m29784());
        for (int i = 0; i < iM39743; i++) {
            C16251 c16251 = c16956.get(i);
            if (c16251 != null) {
                c16957.m39746(c11976.mo15518(c16251));
            }
        }
        c16957.mo9637();
        if (!c16957.equals(c16956)) {
            c16956 = c16957;
        }
        return new C14114(c11312M38701, c16956);
    }
}
