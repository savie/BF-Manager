package l;

/* JADX INFO: renamed from: l.ۡۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBDL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9099 extends AbstractC5875 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2891 f29568;

    public C9099(C2891 c2891) {
        super("LineNumberTable");
        try {
            if (c2891.m46489()) {
                throw new C12017("lineNumbers.isMutable()", null);
            }
            this.f29568 = c2891;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return (this.f29568.size() * 4) + 8;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2891 m24249() {
        return this.f29568;
    }
}
