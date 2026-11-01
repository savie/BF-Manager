package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18208 implements InterfaceC2168, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8331 f58154;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10907 f58155;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C23853 f58156;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16551 f58157;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f58158;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6276 f58159;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f58160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58161;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f58162;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f58163;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12318 f58164;

    public C18208(C6276 c6276, int i) {
        this.f58159 = c6276;
        this.f58158 = i;
    }

    @Override // l.InterfaceC2168
    /* JADX INFO: renamed from: ۙ */
    public final void mo6754(int i, int i2) throws IOException {
        if (i2 >= 0) {
            long j = ((long) i) + ((long) i2);
            C6276 c6276 = this.f58159;
            if (j <= c6276.length()) {
                this.f58162 = i;
                this.f58161 = i2;
                this.f58155 = new C10907(c6276, i, i2, this.f58158);
                return;
            }
        }
        throw new IOException("Invalid migration page range");
    }

    @Override // l.InterfaceC2168
    /* JADX INFO: renamed from: ۙ */
    public final void mo6755(int i, long j, InputStream inputStream) {
        int i2 = this.f58158;
        if (i == 261) {
            this.f58154 = C8331.m21754(i2, j, inputStream);
            return;
        }
        switch (i) {
            case 256:
                this.f58156 = C23853.m52577(i2, j, inputStream);
                break;
            case 257:
                this.f58163 = m42324(j, inputStream);
                this.f58164 = C12318.m30578(new ByteArrayInputStream(this.f58163), j, i2);
                break;
            case 258:
                this.f58160 = m42324(j, inputStream);
                this.f58157 = C16551.m38952(new ByteArrayInputStream(this.f58160), j, i2);
                break;
            default:
                this.f58155.m27338(i, j, inputStream);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m42324(long j, InputStream inputStream) throws IOException {
        if (j < 0 || j > this.f58158) {
            throw new IOException("Migration app field exceeds limit");
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new IOException("Truncated migration app field");
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42329() throws IOException {
        C8331 c8331 = this.f58154;
        if (c8331 == null || this.f58156 == null || this.f58164 == null || this.f58157 == null || this.f58155 == null) {
            throw new IOException("Incomplete migration app fields");
        }
        if ((c8331.m21758() == 0 && this.f58162 != 0) || (this.f58154.m21758() == this.f58154.m21757() - 1 && ((long) this.f58162) + ((long) this.f58161) != this.f58159.length())) {
            throw new IOException("Migration page range disagrees with fragment manifest");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10907 c10907 = this.f58155;
        if (c10907 != null) {
            c10907.close();
        }
    }
}
