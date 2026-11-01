package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ܰۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H4GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13559 extends InflaterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f44732;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f44733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12107 f44734;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C13559(C12107 c12107, InputStream inputStream, boolean z) {
        super(inputStream, new Inflater(true));
        this.f44734 = c12107;
        this.f44732 = z;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C12107 c12107 = this.f44734;
        boolean z = this.f44732;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && z) {
                m33146();
            }
            return i3;
        } catch (EOFException unused) {
            if (!z) {
                return -1;
            }
            throw new ZipException("Unexpected end of DEFLATE stream (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (ZipException e) {
            C21506.m48152(e, c12107);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33146() throws ZipException {
        if (this.f44733) {
            return;
        }
        if (!((InflaterInputStream) this).inf.finished()) {
            throw new ZipException("Unexpected end of DEFLATE stream (" + this.f44734.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after DEFLATE stream (" + this.f44734.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f44733 = true;
    }
}
