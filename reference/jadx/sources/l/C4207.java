package l;

/* JADX INFO: renamed from: l.ۘܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 73Q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4207 extends AbstractC16139 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21165 f15361;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo13418() {
        return 8;
    }

    public C4207(C21165 c21165) {
        this.f15361 = c21165;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        c10918.m27715().m35279(this.f15361);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        int iM13416 = m13416(c10918);
        C21165 c21165 = this.f15361;
        int iM48270 = c21165.m48270();
        if (c15000.m36116()) {
            c15000.m36111(0, m38318() + ' ' + c21165.toString());
            c15000.m36111(2, "type:     " + C5306.m15934(iM48270) + (" // " + C21165.m48268(iM48270)));
            c15000.m36111(2, "reserved: ".concat(C5306.m15934(0)));
            String str = " // " + c21165.m48271().toString();
            if (c21165.m48273()) {
                c15000.m36111(2, "fieldId:  " + C5306.m15934(iM13416) + str);
            } else {
                c15000.m36111(2, "methodId: " + C5306.m15934(iM13416) + str);
            }
            c15000.m36111(2, "reserved: ".concat(C5306.m15934(0)));
        }
        c15000.m36123(iM48270);
        c15000.m36123(0);
        c15000.m36123(m13416(c10918));
        c15000.m36123(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m13416(C10918 c10918) {
        C21165 c21165 = this.f15361;
        AbstractC13487 abstractC13487M48271 = c21165.m48271();
        if (c21165.m48273()) {
            return c10918.m27705().m29336((C16689) abstractC13487M48271);
        }
        if (c21165.m48272()) {
            if (abstractC13487M48271 instanceof C23403) {
                abstractC13487M48271 = ((C23403) abstractC13487M48271).m52587();
            }
            return c10918.m27707().m42872((AbstractC22657) abstractC13487M48271);
        }
        throw new IllegalStateException("Unhandled invocation type");
    }
}
