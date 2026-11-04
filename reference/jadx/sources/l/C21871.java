package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩷ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9WP */
/* JADX INFO: loaded from: classes.dex */
public final class C21871 implements InterfaceC17064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f69707;

    public C21871(String str) {
        this.f69707 = str;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return (this.f69707.length() * 2) + 4;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2319(3, i, bArr);
        int i2 = i + 2;
        byte[] bytes = this.f69707.getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        C0481.m2319(0L, length, bArr);
        return (length + 2) - i;
    }
}
