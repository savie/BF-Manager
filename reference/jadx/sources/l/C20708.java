package l;

import android.content.res.AssetManager;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩷ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20708 extends AbstractC16475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AssetManager f67333;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f67334;

    public C20708(AssetManager assetManager, String str) {
        this.f67333 = assetManager;
        this.f67334 = str;
    }

    @Override // l.AbstractC16475
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo1681() {
        return new GifInfoHandle(this.f67333.openFd(this.f67334));
    }
}
