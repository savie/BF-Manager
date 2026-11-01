package l;

import android.content.res.Resources;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.֡ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0246 extends AbstractC16475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Resources f1472;

    public C0246(Resources resources, int i) {
        this.f1472 = resources;
        this.f1471 = i;
    }

    @Override // l.AbstractC16475
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle mo1681() {
        return new GifInfoHandle(this.f1472.openRawResourceFd(this.f1471));
    }
}
