package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25244 extends AbstractC15546 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f81569;

    public C25244(AbstractC11071 abstractC11071, int[] iArr, C11817[] c11817Arr, C11817 c11817) {
        super(EnumC20768.LOOKUP_SWITCH, abstractC11071);
        this.f81569 = iArr;
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
        int[] iArr = this.f81569;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        return new C25244(this.f76980.mo5237(c5194), iArr2, c11817Arr, c5194.mo15614(this.f50567));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f76980);
        sb.append(") {");
        int i = 0;
        while (true) {
            int[] iArr = this.f81569;
            if (i < iArr.length) {
                sb.append("\n case ");
                sb.append(iArr[i]);
                sb.append(": GOTO ");
                sb.append(this.f50568[i].m29665());
                sb.append(l.b);
                i++;
            } else {
                sb.append("\n default : GOTO ");
                sb.append(this.f50567.m29665());
                sb.append(";\n}");
                return sb.toString();
            }
        }
    }
}
