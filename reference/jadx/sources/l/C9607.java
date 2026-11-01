package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۢ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9607 implements InterfaceC16662 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4397 f32370 = new C1844(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f32371;

    public C9607(AbstractC20745 abstractC20745) {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        this.f32371 = c1388M46710;
        c1388M46710.setLength(0L);
    }

    @Override // l.InterfaceC16662
    public final void write(byte[] bArr) {
        C1388 c1388 = this.f32371;
        c1388.getClass();
        c1388.write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC16662
    public final void seek(long j) {
        this.f32371.seek(j);
    }

    @Override // l.InterfaceC16662
    public final long getPosition() {
        return this.f32371.getFilePointer();
    }

    @Override // l.InterfaceC16662
    public final void writeByte(int i) {
        this.f32371.write(i);
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo24508(int i) {
        this.f32371.m4871(i);
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24501(char c) {
        this.f32371.m4863(c);
    }

    @Override // l.InterfaceC16662
    public final void writeInt(int i) {
        this.f32371.writeInt(i);
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24506(int[] iArr) {
        for (int i : iArr) {
            this.f32371.writeInt(i);
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24505(short s) {
        C1388 c1388 = this.f32371;
        c1388.write(s & 255);
        c1388.write((s >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24507(byte[] bArr) {
        int length = bArr.length;
        C1388 c1388 = this.f32371;
        c1388.writeInt(length);
        c1388.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24503(CharSequence charSequence) {
        C1388 c1388 = this.f32371;
        if (charSequence == null) {
            c1388.writeInt(0);
            return;
        }
        c1388.writeInt(C23967.m52794(charSequence));
        try {
            C23967.m52799(this.f32370, charSequence, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24504(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        C1388 c1388 = this.f32371;
        c1388.getClass();
        c1388.write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24502(int i, String str) {
        C1388 c1388;
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (true) {
            int length = charArray.length;
            c1388 = this.f32371;
            if (i2 >= length || i == 0) {
                break;
            }
            c1388.m4863(charArray[i2]);
            i--;
            i2++;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c1388.m4863((char) 0);
        }
    }

    @Override // l.InterfaceC16662
    public final void skipBytes(int i) {
        C1388 c1388 = this.f32371;
        int iSkipBytes = i - c1388.skipBytes(i);
        for (int i2 = 0; i2 < iSkipBytes; i2++) {
            c1388.write(0);
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public final void mo24500() {
        skipBytes(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32371.close();
    }
}
