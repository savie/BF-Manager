package l;

import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533 extends AbstractC15465 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f12132 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3533 m11560() {
        return new C3533();
    }

    public C3533() {
        if (!AbstractC20687.m47325()) {
            throw new IllegalStateException("`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
        }
    }

    @Override // l.AbstractC15465
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo9838(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            try {
                C17311 c17311 = new C17311(byteArrayOutputStream.toByteArray());
                if (!this.f12132) {
                    c17311.stop();
                }
                return c17311;
            } catch (IOException e) {
                throw new IllegalStateException("Exception creating GifDrawable", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Cannot read GIF input-stream", e2);
        }
    }
}
