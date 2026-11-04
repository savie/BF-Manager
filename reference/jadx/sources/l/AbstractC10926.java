package l;

/* JADX INFO: renamed from: l.ۤܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10926 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34585;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1477(AbstractActivityC17204 abstractActivityC17204);

    public AbstractC10926(int i) {
        this.f34585 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27729() {
        return this.f34585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC10926 m27728(C20348 c20348) {
        int i = c20348.readByte() & 255;
        if (i == 0) {
            return C0181.f1263;
        }
        switch (i) {
            case 2:
                return new C8384(c20348);
            case 3:
                return new C7639(c20348);
            case 4:
                return new C6893(c20348);
            case 5:
                return new C2418(c20348);
            case 6:
                return new C18080(c20348);
            case 7:
                return new C13604(7);
            case 8:
                return new C22115(c20348);
            default:
                throw new IllegalArgumentException(C13645.m33382(i, "Unknown action: "));
        }
    }
}
