package l;

import java.io.File;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.۬ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13581 extends AbstractC11101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43137;

    public C13581(File file) {
        this.f43137 = file.getPath();
    }

    @Override // l.AbstractC11101
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo15528() {
        return new GifInfoHandle(this.f43137);
    }
}
