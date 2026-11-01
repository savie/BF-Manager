package l;

/* JADX INFO: renamed from: l.᩵ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19522 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC8939 f62769;

    public /* synthetic */ C19522(EnumC8939 enumC8939, int i) {
        this(enumC8939);
    }

    public C19522(EnumC8939 enumC8939) {
        this.f62769 = enumC8939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19522 m44579(byte b) {
        int i = (b >>> 4) & 7;
        if ((b & 143) > 0) {
            throw new RuntimeException("Reserved fields must be 0");
        }
        return new C19522(EnumC8939.m23224(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44580() {
        return 1 << ((this.f62769.m23226() * 2) + 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m44581() {
        return (byte) ((this.f62769.m23226() & 7) << 4);
    }
}
