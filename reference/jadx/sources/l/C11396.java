package l;

import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11396 extends AbstractC17412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f38398 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11396 m28503() {
        return new C11396();
    }

    public C11396() {
        if (!AbstractC2222.m6843()) {
            throw new IllegalStateException("`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
        }
    }

    @Override // l.AbstractC17412
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo23247(InputStream inputStream) {
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
                C4479 c4479 = new C4479(byteArrayOutputStream.toByteArray());
                if (!this.f38398) {
                    c4479.stop();
                }
                return c4479;
            } catch (IOException e) {
                throw new IllegalStateException("Exception creating GifDrawable", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Cannot read GIF input-stream", e2);
        }
    }
}
