package l;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8XX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8946 extends AbstractC17412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Resources f30669;

    public C8946(Resources resources) {
        this.f30669 = resources;
    }

    @Override // l.AbstractC17412
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable mo23247(InputStream inputStream) {
        try {
            return new BitmapDrawable(this.f30669, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }
}
