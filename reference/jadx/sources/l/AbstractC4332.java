package l;

/* JADX INFO: renamed from: l.ۙ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7W7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4332 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15527;

    public /* synthetic */ AbstractC4332(int i) {
        this.f15527 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo12167(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC3382 mo6344(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6345(InterfaceC12061 interfaceC12061, C6205 c6205);

    public String toString() {
        switch (this.f15527) {
            case 0:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8325 m12166(C17684 c17684, int i, int i2) {
        switch (i) {
            case 0:
                return new C17270(c17684, i2);
            case 1:
                return new C5981(c17684, i2);
            case 2:
                return c17684.m41186(i2);
            case 3:
                return c17684.m41202(i2);
            case 4:
                return new C0336(c17684, i2);
            case 5:
                return new C7392(c17684, i2);
            case 6:
                return new C15860(c17684, i2);
            default:
                throw new C20749(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
