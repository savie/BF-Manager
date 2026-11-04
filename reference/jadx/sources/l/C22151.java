package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩷ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22151 extends InflaterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f71351;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f71352;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8002 f71353;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C22151(C8002 c8002, InputStream inputStream, boolean z) {
        super(inputStream, new Inflater(true));
        this.f71353 = c8002;
        this.f71352 = z;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C8002 c8002 = this.f71353;
        boolean z = this.f71352;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && z) {
                m50109();
            }
            return i3;
        } catch (EOFException unused) {
            if (!z) {
                return -1;
            }
            throw new ZipException("Unexpected end of DEFLATE stream (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (ZipException e) {
            C17719.m41496(e, c8002);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50109() throws ZipException {
        if (this.f71351) {
            return;
        }
        if (!((InflaterInputStream) this).inf.finished()) {
            throw new ZipException("Unexpected end of DEFLATE stream (" + this.f71353.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after DEFLATE stream (" + this.f71353.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f71351 = true;
    }
}
