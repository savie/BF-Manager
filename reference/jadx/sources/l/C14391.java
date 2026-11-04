package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14391 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21105 f45346;

    public C14391(C21105 c21105) {
        this.f45346 = c21105;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C21105 c21105 = this.f45346;
        if (c21105.f67408) {
            return;
        }
        if (c21105.f67405.f32081 >= 8388608) {
            C21105.m48170(c21105);
        } else {
            c21105.f67405.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C21105 c21105 = this.f45346;
        if (c21105.f67408) {
            return;
        }
        if (i2 > 8388608 - c21105.f67405.f32081) {
            C21105.m48170(c21105);
        } else {
            c21105.f67405.write(bArr, i, i2);
        }
    }
}
