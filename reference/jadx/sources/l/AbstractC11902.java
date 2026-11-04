package l;

/* JADX INFO: renamed from: l.ۧ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: JIUK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38331;

    public /* synthetic */ AbstractC11902(int i) {
        this.f38331 = i;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo7536(int i, int i2, byte[] bArr, byte[] bArr2);

    public String toString() {
        switch (this.f38331) {
            case 0:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13679 m29783(C24975 c24975, int i, int i2) {
        switch (i) {
            case 0:
                return new C11679(c24975, i2);
            case 1:
                return new C25106(c24975, i2);
            case 2:
                return c24975.m55798(i2);
            case 3:
                return c24975.m55805(i2);
            case 4:
                return new C13171(c24975, i2);
            case 5:
                return new C10933(c24975, i2);
            case 6:
                return new C19884(c24975, i2);
            default:
                throw new C23044(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
