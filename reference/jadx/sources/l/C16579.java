package l;

/* JADX INFO: renamed from: l.ܺۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16579 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f53655;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f53656;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16579 f53657 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f53658;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53659;

    public C16579(int i, int i2, int i3, int i4) {
        this.f53656 = i;
        this.f53659 = i2;
        this.f53658 = i4;
        this.f53655 = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("change[inserted=");
        sb.append(this.f53658);
        sb.append(", deleted=");
        sb.append(this.f53655);
        sb.append(", line0=");
        sb.append(this.f53656);
        sb.append(", line1=");
        return C12669.m31437(this.f53659, "]", sb);
    }
}
