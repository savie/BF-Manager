package l;

import java.io.InputStream;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩶ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20003 extends AbstractC16475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f64024;

    public C20003(InputStream inputStream) {
        this.f64024 = inputStream;
    }

    @Override // l.AbstractC16475
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo1681() {
        return new GifInfoHandle(this.f64024);
    }
}
