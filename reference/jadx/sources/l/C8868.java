package l;

/* JADX INFO: renamed from: l.۠᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8868 implements InterfaceC5140 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19112 f28961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f28962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f28963;

    public C8868(int i, int i2, InterfaceC19112 interfaceC19112) {
        this.f28962 = i;
        this.f28963 = i2;
        this.f28961 = interfaceC19112;
    }

    @Override // l.InterfaceC5140
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC19112 mo15530() {
        return this.f28961;
    }

    @Override // l.InterfaceC5140
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15531() {
        return this.f28962;
    }

    @Override // l.InterfaceC5140
    /* JADX INFO: renamed from: ۙ */
    public final int mo15529() {
        return this.f28963;
    }

    public final String toString() {
        return "Try{" + String.format("0x%04x", Integer.valueOf(this.f28962)) + " - " + String.format("0x%04x", Integer.valueOf(this.f28963)) + ": " + this.f28961 + '}';
    }
}
