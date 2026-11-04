package l;

/* JADX INFO: renamed from: l.۟᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8123 implements InterfaceC19112 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26802;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f26803;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f26804;

    public C8123(int i, String[] strArr, int[] iArr) {
        this.f26804 = iArr;
        this.f26803 = strArr;
        this.f26802 = i;
    }

    @Override // l.InterfaceC19112
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] mo22005() {
        return this.f26804;
    }

    @Override // l.InterfaceC19112
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] mo22003() {
        return this.f26803;
    }

    @Override // l.InterfaceC19112
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo22004() {
        return this.f26802;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catch:");
        String[] strArr = this.f26803;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(' ');
            sb.append(strArr[i]);
            sb.append("->");
            sb.append(String.format("0x%04x", Integer.valueOf(this.f26804[i])));
        }
        int i2 = this.f26802;
        if (i2 != -1) {
            sb.append(" all->");
            sb.append(String.format("0x%04x", Integer.valueOf(i2)));
        }
        return sb.toString();
    }
}
