package l;

import java.io.InputStream;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۙ᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5136 extends AbstractC11101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f17903;

    public C5136(InputStream inputStream) {
        this.f17903 = inputStream;
    }

    @Override // l.AbstractC11101
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle mo15528() {
        return new GifInfoHandle(this.f17903);
    }
}
