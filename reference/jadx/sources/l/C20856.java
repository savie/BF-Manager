package l;

/* JADX INFO: renamed from: l.᩵᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5E7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20856 extends AbstractC5106 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f66762;

    public C20856(AbstractC11071[] abstractC11071Arr, String str) {
        super(EnumC22260.FILLED_ARRAY, abstractC11071Arr);
        this.f66762 = str;
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C20856(m15447(), this.f66762);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C20856(m15449(c5194), this.f66762);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        AbstractC11071[] abstractC11071Arr;
        StringBuilder sbM27333 = C10732.m27333("new ");
        sbM27333.append(C2211.m7539(this.f66762));
        sbM27333.append("[]{");
        int i = 0;
        while (true) {
            abstractC11071Arr = this.f17809;
            if (i >= abstractC11071Arr.length) {
                break;
            }
            sbM27333.append(abstractC11071Arr[i]);
            sbM27333.append(", ");
            i++;
        }
        if (abstractC11071Arr.length > 0) {
            sbM27333.setLength(sbM27333.length() - 2);
        }
        sbM27333.append('}');
        return sbM27333.toString();
    }
}
