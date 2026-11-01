package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15527 implements InterfaceC14116, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f50537;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f50538;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        byte bByteValue = ((Byte) obj).byteValue();
        byte[] bArr = this.f50538.f31233;
        int i = this.f50537;
        byte b = bArr[i];
        bArr[i] = bByteValue;
        return Byte.valueOf(b);
    }

    public C15527(C9177 c9177, int i) {
        this.f50538 = c9177;
        this.f50537 = i;
    }

    public C15527(C9177 c9177) {
        this.f50538 = c9177;
    }

    @Override // l.InterfaceC14116
    /* JADX INFO: renamed from: ۙ */
    public final int mo34153() {
        return this.f50538.f31228[this.f50537];
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(this.f50538.f31228[this.f50537]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(this.f50538.f31228[this.f50537]);
    }

    @Override // l.InterfaceC14116
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo34154() {
        return this.f50538.f31233[this.f50537];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Byte.valueOf(this.f50538.f31233[this.f50537]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Byte.valueOf(this.f50538.f31233[this.f50537]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f50538.f31228[this.f50537]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Byte.valueOf(this.f50538.f31233[this.f50537]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C9177 c9177 = this.f50538;
        return c9177.f31228[this.f50537] == ((Integer) entry.getKey()).intValue() && c9177.f31233[this.f50537] == ((Byte) entry.getValue()).byteValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C9177 c9177 = this.f50538;
        int[] iArr = c9177.f31228;
        int i = this.f50537;
        return c9177.f31233[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9177 c9177 = this.f50538;
        sb.append(c9177.f31228[this.f50537]);
        sb.append("=>");
        sb.append((int) c9177.f31233[this.f50537]);
        return sb.toString();
    }
}
