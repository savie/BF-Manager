package l;

import java.io.File;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܺۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15770 extends AbstractC16475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f51079;

    public C15770(File file) {
        this.f51079 = file.getPath();
    }

    @Override // l.AbstractC16475
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo1681() {
        return new GifInfoHandle(this.f51079);
    }
}
