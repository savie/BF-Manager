package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5S8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5483 extends AbstractC19825 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f18868;

    public C5483() {
        super(EnumC2890.TABLE_SWITCH, null);
    }

    public C5483(AbstractC7124 abstractC7124, int i, C17002[] c17002Arr, C17002 c17002) {
        super(EnumC2890.TABLE_SWITCH, abstractC7124);
        this.f18868 = i;
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
        return new C5483(this.f6011.mo3325(c10527), this.f18868, c17002Arr, c10527.mo2550(this.f63629));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f6011);
        sb.append(") {");
        for (int i = 0; i < this.f63630.length; i++) {
            sb.append("\n case ");
            sb.append(this.f18868 + i);
            sb.append(": GOTO ");
            sb.append(this.f63630[i].m39782());
            sb.append(l.b);
        }
        sb.append("\n default : GOTO ");
        sb.append(this.f63629.m39782());
        sb.append(";\n}");
        return sb.toString();
    }
}
