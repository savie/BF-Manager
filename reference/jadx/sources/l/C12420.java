package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12420 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17358 f41454;

    public C12420(C17358 c17358) {
        this.f41454 = c17358;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C17358 c17358 = this.f41454;
        if (c17358.f55223) {
            return;
        }
        if (c17358.f55228.f62830 >= 8388608) {
            C17358.m40386(c17358);
        } else {
            c17358.f55228.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C17358 c17358 = this.f41454;
        if (c17358.f55223) {
            return;
        }
        if (i2 > 8388608 - c17358.f55228.f62830) {
            C17358.m40386(c17358);
        } else {
            c17358.f55228.write(bArr, i, i2);
        }
    }
}
