package l;

import android.content.res.AssetManager;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۜۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6870 extends AbstractC11101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AssetManager f22823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f22824;

    public C6870(AssetManager assetManager, String str) {
        this.f22823 = assetManager;
        this.f22824 = str;
    }

    @Override // l.AbstractC11101
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo15528() {
        return new GifInfoHandle(this.f22823.openFd(this.f22824));
    }
}
