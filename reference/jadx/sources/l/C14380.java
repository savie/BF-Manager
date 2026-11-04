package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9R4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14380 implements InterfaceC23332 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7669 f45333 = new C3940(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f45334;

    public C14380(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        this.f45334 = c13961M49855;
        c13961M49855.setLength(0L);
    }

    @Override // l.InterfaceC23332
    public final void write(byte[] bArr) {
        C13961 c13961 = this.f45334;
        c13961.getClass();
        c13961.write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC23332
    public final void seek(long j) {
        this.f45334.seek(j);
    }

    @Override // l.InterfaceC23332
    public final long getPosition() {
        return this.f45334.getFilePointer();
    }

    @Override // l.InterfaceC23332
    public final void writeByte(int i) {
        this.f45334.write(i);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ᩻ */
    public final void mo17812(int i) {
        this.f45334.m34036(i);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17801(char c) {
        this.f45334.m34034(c);
    }

    @Override // l.InterfaceC23332
    public final void writeInt(int i) {
        this.f45334.writeInt(i);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ */
    public final void mo17790(int[] iArr) {
        for (int i : iArr) {
            this.f45334.writeInt(i);
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ */
    public final void mo17788(short s) {
        C13961 c13961 = this.f45334;
        c13961.write(s & 255);
        c13961.write((s >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34818(byte[] bArr) {
        int length = bArr.length;
        C13961 c13961 = this.f45334;
        c13961.writeInt(length);
        c13961.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34816(CharSequence charSequence) {
        C13961 c13961 = this.f45334;
        if (charSequence == null) {
            c13961.writeInt(0);
            return;
        }
        c13961.writeInt(C21443.m48759(charSequence));
        try {
            C21443.m48764(this.f45333, charSequence, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34817(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        C13961 c13961 = this.f45334;
        c13961.getClass();
        c13961.write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ */
    public final void mo17783(int i, String str) {
        C13961 c13961;
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (true) {
            int length = charArray.length;
            c13961 = this.f45334;
            if (i2 >= length || i == 0) {
                break;
            }
            c13961.m34034(charArray[i2]);
            i--;
            i2++;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c13961.m34034((char) 0);
        }
    }

    @Override // l.InterfaceC23332
    public final void skipBytes(int i) {
        C13961 c13961 = this.f45334;
        int iSkipBytes = i - c13961.skipBytes(i);
        for (int i2 = 0; i2 < iSkipBytes; i2++) {
            c13961.write(0);
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۧۤ */
    public final void mo17795() {
        skipBytes(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45334.close();
    }
}
