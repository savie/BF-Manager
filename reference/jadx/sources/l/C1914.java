package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes3.dex */
public final class C1914 extends C4151 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C2375 f6439;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C18783 f6440;

    public C1914(C1914 c1914, C16083 c16083, Resources resources) {
        super(c1914, c16083, resources);
        if (c1914 != null) {
            this.f14105 = c1914.f14105;
        } else {
            this.f14105 = new int[this.f65832.length][];
        }
        if (c1914 != null) {
            this.f6440 = c1914.f6440;
            this.f6439 = c1914.f6439;
        } else {
            this.f6440 = new C18783();
            this.f6439 = new C2375();
        }
    }

    @Override // l.C4151, l.AbstractC20559
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo6582() {
        this.f6440 = this.f6440.clone();
        this.f6439 = this.f6439.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6581(int i, int i2, Drawable drawable, boolean z) {
        int iM47127 = m47127(drawable);
        long j = i;
        long j2 = i2;
        long j3 = (j << 32) | j2;
        long j4 = z ? 8589934592L : 0L;
        long j5 = iM47127;
        this.f6440.m43575(j3, Long.valueOf(j5 | j4));
        if (z) {
            this.f6440.m43575(j | (j2 << 32), Long.valueOf(Blake2xsDigest.MAX_NUMBER_BLOCKS | j5 | j4));
        }
        return iM47127;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C16083(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C16083(this, resources);
    }
}
