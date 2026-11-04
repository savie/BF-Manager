package l;

import android.content.res.Resources;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩷᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes.dex */
public final class C22290 extends AbstractC11101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72169;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Resources f72170;

    public C22290(int i, Resources resources) {
        this.f72170 = resources;
        this.f72169 = i;
    }

    @Override // l.AbstractC11101
    /* JADX INFO: renamed from: ۙ */
    public final GifInfoHandle mo15528() {
        return new GifInfoHandle(this.f72170.openRawResourceFd(this.f72169));
    }
}
