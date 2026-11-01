package l;

/* JADX INFO: renamed from: l.ۗ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: F5E7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3469 extends AbstractC8536 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f12741;

    public C3469(AbstractC7124[] abstractC7124Arr, String str) {
        super(EnumC9947.FILLED_ARRAY, abstractC7124Arr);
        this.f12741 = str;
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C3469(m22290(), this.f12741);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C3469(m22291(c10527), this.f12741);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        AbstractC7124[] abstractC7124Arr;
        StringBuilder sbM23356 = C9023.m23356("new ");
        sbM23356.append(C19378.m44398(this.f12741));
        sbM23356.append("[]{");
        int i = 0;
        while (true) {
            abstractC7124Arr = this.f29544;
            if (i >= abstractC7124Arr.length) {
                break;
            }
            sbM23356.append(abstractC7124Arr[i]);
            sbM23356.append(", ");
            i++;
        }
        if (abstractC7124Arr.length > 0) {
            sbM23356.setLength(sbM23356.length() - 2);
        }
        sbM23356.append('}');
        return sbM23356.toString();
    }
}
