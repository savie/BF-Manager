package l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10042 extends AbstractC8631 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f34305;

    public C10042(C17720 c17720) {
        byte[] bArrMo25183 = c17720.mo25183(65531);
        this.f34305 = bArrMo25183;
        this.f34304 = bArrMo25183.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25391(C17720 c17720) {
        c17720.mo25181(this.f34305);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25390(int i, DataInputStream dataInputStream) throws IOException {
        if (i < 5) {
            throw new C19838();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C19838();
        }
        this.f29781 = dataInputStream.readInt();
        this.f29782 = -1;
        int i2 = i - 5;
        byte[] bArr = this.f34305;
        int length = bArr.length - i2;
        this.f34304 = length;
        dataInputStream.readFully(bArr, length, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m25392() {
        return this.f34304 == this.f34305.length && this.f29781 == 0;
    }

    @Override // l.AbstractC8631
    /* JADX INFO: renamed from: ۙ */
    public final void mo19186() throws C19838 {
        int i = this.f29782;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.f29781 << 8;
                byte[] bArr = this.f34305;
                int i3 = this.f34304;
                this.f34304 = i3 + 1;
                this.f29781 = i2 | (bArr[i3] & 255);
                this.f29782 = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C19838();
            }
        }
    }
}
