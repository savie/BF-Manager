package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J5P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5713 extends AbstractC19825 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f19463;

    public C5713(AbstractC7124 abstractC7124, int[] iArr, C17002[] c17002Arr, C17002 c17002) {
        super(EnumC2890.LOOKUP_SWITCH, abstractC7124);
        this.f19463 = iArr;
        this.f63630 = c17002Arr;
        this.f63629 = c17002;
    }

    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4777 mo985(C10527 c10527) {
        int length = this.f63630.length;
        C17002[] c17002Arr = new C17002[length];
        for (int i = 0; i < length; i++) {
            c17002Arr[i] = c10527.mo2550(this.f63630[i]);
        }
        int[] iArr = this.f19463;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        return new C5713(this.f6011.mo3325(c10527), iArr2, c17002Arr, c10527.mo2550(this.f63629));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f6011);
        sb.append(") {");
        int i = 0;
        while (true) {
            int[] iArr = this.f19463;
            if (i < iArr.length) {
                sb.append("\n case ");
                sb.append(iArr[i]);
                sb.append(": GOTO ");
                sb.append(this.f63630[i].m39782());
                sb.append(l.b);
                i++;
            } else {
                sb.append("\n default : GOTO ");
                sb.append(this.f63629.m39782());
                sb.append(";\n}");
                return sb.toString();
            }
        }
    }
}
