package l;

/* JADX INFO: renamed from: l.֫᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes3.dex */
public class C2142 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 f7073;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 f7074;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 f7075;

    public C2142(InterfaceC11836 interfaceC11836, InterfaceC11836 interfaceC11837, InterfaceC11836 interfaceC11838) {
        this.f7073 = interfaceC11836;
        this.f7075 = interfaceC11837;
        this.f7074 = interfaceC11838;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2142)) {
            return false;
        }
        C2142 c2142 = (C2142) obj;
        return C17359.equals(this.f7073, c2142.f7073) && C17359.equals(this.f7075, c2142.f7075) && C17359.equals(this.f7074, c2142.f7074);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 m7398() {
        return this.f7073;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 mo7397() {
        return this.f7075;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11836 mo7399() {
        return this.f7074;
    }

    public final int hashCode() {
        return C17359.hash(this.f7073, this.f7075, this.f7074);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(((C25263) this.f7074).get()), Long.valueOf(((C25263) this.f7075).get()), Long.valueOf(((C25263) this.f7073).get()));
    }
}
