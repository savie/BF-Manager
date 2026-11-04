package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13003 extends AbstractC1817 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f41665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f41666;

    public C13003(String str, String str2, String[] strArr) {
        super(str);
        this.f41665 = str2;
        this.f41666 = strArr;
    }

    @Override // l.AbstractC1817
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1817 mo6295(String str) {
        return new C13003(str, this.f41665, this.f41666);
    }

    @Override // l.AbstractC1817
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5546 mo6296() {
        return EnumC5546.METHOD;
    }

    @Override // l.AbstractC1817
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13003)) {
            return false;
        }
        C13003 c13003 = (C13003) obj;
        return this.f41665.equals(c13003.f41665) && this.f6169.equals(c13003.f6169) && Arrays.equals(this.f41666, c13003.f41666);
    }

    @Override // l.AbstractC1817
    public final int hashCode() {
        return C12351.m30817(this.f41665.hashCode() * 17, 31, this.f6169) + Arrays.hashCode(this.f41666);
    }

    @Override // l.AbstractC1817
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41665);
        sb.append(' ');
        sb.append(this.f6169);
        sb.append('(');
        int i = C24276.f78588;
        String[] strArr = this.f41666;
        sb.append(strArr == null ? null : C24276.m54282(strArr.length, String.valueOf(','), strArr));
        sb.append(')');
        return sb.toString();
    }
}
