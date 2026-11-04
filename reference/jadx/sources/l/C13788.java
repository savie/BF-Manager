package l;

/* JADX INFO: renamed from: l.۬ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13788 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5191 f43740;

    public /* synthetic */ C13788(EnumC5191 enumC5191, int i) {
        this(enumC5191);
    }

    public C13788(EnumC5191 enumC5191) {
        this.f43740 = enumC5191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13788 m33687(byte b) {
        int i = (b >>> 4) & 7;
        if ((b & 143) > 0) {
            throw new RuntimeException("Reserved fields must be 0");
        }
        return new C13788(EnumC5191.m15610(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33688() {
        return 1 << ((this.f43740.m15612() * 2) + 8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte m33689() {
        return (byte) ((this.f43740.m15612() & 7) << 4);
    }
}
