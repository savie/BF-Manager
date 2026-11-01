package l;

/* JADX INFO: renamed from: l.ܶ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49733;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4217(AbstractActivityC12483 abstractActivityC12483);

    public AbstractC15260(int i) {
        this.f49733 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36536() {
        return this.f49733;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC15260 m36535(C17367 c17367) {
        int i = c17367.readByte() & 255;
        if (i == 0) {
            return C4675.f16540;
        }
        switch (i) {
            case 2:
                return new C1147(c17367);
            case 3:
                return new C13849(c17367);
            case 4:
                return new C13143(c17367);
            case 5:
                return new C22315(c17367);
            case 6:
                return new C2913(c17367);
            case 7:
                return new C3969(7);
            case 8:
                return new C23021(c17367);
            default:
                throw new IllegalArgumentException(C8479.m22141(i, "Unknown action: "));
        }
    }
}
