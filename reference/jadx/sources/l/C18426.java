package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1T8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18426 implements InterfaceC10666, InterfaceC5726 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f58748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f58749;

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5136() {
        return false;
    }

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo5137() {
        return false;
    }

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo5138() {
        return true;
    }

    public C18426(long j, byte[] bArr) throws C6782 {
        this.f58748 = j;
        if (bArr.length == 0) {
            this.f58749 = 0;
            return;
        }
        if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f58749 = i;
            return;
        }
        throw new C6782("Unsupported BCJ filter properties");
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ */
    public final int mo23780() {
        int i = C1137.f5105;
        return 5;
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo23781(InputStream inputStream, C17720 c17720) {
        InterfaceC10748 c17097;
        int i = this.f58749;
        long j = this.f58748;
        if (j == 4) {
            c17097 = new C23448(i);
        } else if (j == 5) {
            c17097 = new C12159(i);
        } else if (j == 6) {
            c17097 = new C16392(i);
        } else if (j == 7) {
            c17097 = new C19920(i);
        } else if (j == 8) {
            c17097 = new C0163(i);
        } else if (j == 9) {
            c17097 = new C5808(i);
        } else if (j == 10) {
            c17097 = new C15687(i);
        } else {
            c17097 = j == 11 ? new C17097(i) : null;
        }
        return new C1137(inputStream, c17097);
    }
}
