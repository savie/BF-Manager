package l;

/* JADX INFO: renamed from: l.ۧۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes4.dex */
public class C10838 implements InterfaceC9427 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23538 f36881;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23538 f36882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23538 f36883;

    public C10838(InterfaceC23538 interfaceC23538, InterfaceC23538 interfaceC23539, InterfaceC23538 interfaceC235310) {
        this.f36881 = interfaceC23538;
        this.f36883 = interfaceC23539;
        this.f36882 = interfaceC235310;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10838)) {
            return false;
        }
        C10838 c10838 = (C10838) obj;
        return C13638.equals(this.f36881, c10838.f36881) && C13638.equals(this.f36883, c10838.f36883) && C13638.equals(this.f36882, c10838.f36882);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23538 m27161() {
        return this.f36881;
    }

    @Override // l.InterfaceC9427
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23538 mo24187() {
        return this.f36883;
    }

    @Override // l.InterfaceC9427
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC23538 mo24188() {
        return this.f36882;
    }

    public final int hashCode() {
        return C13638.hash(this.f36881, this.f36883, this.f36882);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(((C14366) this.f36882).get()), Long.valueOf(((C14366) this.f36883).get()), Long.valueOf(((C14366) this.f36881).get()));
    }
}
