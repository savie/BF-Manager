package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14800 extends AbstractC15546 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f48421;

    public C14800() {
        super(EnumC20768.TABLE_SWITCH, null);
    }

    public C14800(AbstractC11071 abstractC11071, int i, C11817[] c11817Arr, C11817 c11817) {
        super(EnumC20768.TABLE_SWITCH, abstractC11071);
        this.f48421 = i;
        this.f50568 = c11817Arr;
        this.f50567 = c11817;
    }

    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo2797(C5194 c5194) {
        int length = this.f50568.length;
        C11817[] c11817Arr = new C11817[length];
        for (int i = 0; i < length; i++) {
            c11817Arr[i] = c5194.mo15614(this.f50568[i]);
        }
        return new C14800(this.f76980.mo5237(c5194), this.f48421, c11817Arr, c5194.mo15614(this.f50567));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f76980);
        sb.append(") {");
        for (int i = 0; i < this.f50568.length; i++) {
            sb.append("\n case ");
            sb.append(this.f48421 + i);
            sb.append(": GOTO ");
            sb.append(this.f50568[i].m29665());
            sb.append(l.b);
        }
        sb.append("\n default : GOTO ");
        sb.append(this.f50567.m29665());
        sb.append(";\n}");
        return sb.toString();
    }
}
