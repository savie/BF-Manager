package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GAOL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17222 implements InterfaceC15730, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f56123;

    public C17222(int i, int i2) {
        this.f56122 = i;
        this.f56123 = i2;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(mo33344());
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ᩺ */
    public final int mo33344() {
        return this.f56122;
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ۨ */
    public final int mo33342() {
        return this.f56123;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof InterfaceC15730;
        int i = this.f56123;
        int i2 = this.f56122;
        if (z) {
            InterfaceC15730 interfaceC15730 = (InterfaceC15730) obj;
            return i2 == interfaceC15730.mo33344() && i == interfaceC15730.mo33342();
        }
        if (!(obj instanceof InterfaceC0550)) {
            return false;
        }
        InterfaceC0550 interfaceC0550 = (InterfaceC0550) obj;
        return Integer.valueOf(i2).equals(interfaceC0550.mo2556()) && Integer.valueOf(i).equals(interfaceC0550.mo2557());
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ᩵ */
    public final int mo33343() {
        return mo33344();
    }

    public final int hashCode() {
        return (this.f56122 * 19) + this.f56123;
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(mo33343());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f56122);
        sb.append(",");
        return C12669.m31437(this.f56123, ">", sb);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Integer.valueOf(mo33342());
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ۛ */
    public final int mo33341() {
        return mo33342();
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Integer.valueOf(mo33341());
    }
}
