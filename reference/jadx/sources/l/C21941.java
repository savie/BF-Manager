package l;

/* JADX INFO: renamed from: l.᩹֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 157Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C21941 extends AbstractC8536 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f71170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f71171;

    public C21941(String str, int i, AbstractC7124[] abstractC7124Arr) {
        super(EnumC9947.NEW_MUTI_ARRAY, abstractC7124Arr);
        this.f71171 = str;
        this.f71170 = i;
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C21941(this.f71171, this.f71170, m22290());
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C21941(this.f71171, this.f71170, m22291(c10527));
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        StringBuilder sb = new StringBuilder("new ");
        sb.append(C19378.m44398(this.f71171));
        for (AbstractC7124 abstractC7124 : this.f29544) {
            sb.append('[');
            sb.append(abstractC7124);
            sb.append(']');
        }
        for (int length = this.f29544.length; length < this.f71170; length++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
