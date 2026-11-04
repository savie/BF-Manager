package l;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩵ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes5.dex */
public final class C20397 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Paint f65381;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1621 f65382;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65383;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1621 f65384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23424 f65385;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Paint f65386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f65387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65388;

    public C20397() {
        Paint paint = new Paint();
        this.f65381 = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f65386 = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f65385 = C23424.m52623();
    }

    public C20397(C20397 c20397) {
        this.f65387 = c20397.f65387;
        this.f65383 = c20397.f65383;
        this.f65381 = new Paint(c20397.f65381);
        this.f65386 = new Paint(c20397.f65386);
        C1621 c1621 = c20397.f65382;
        if (c1621 != null) {
            this.f65382 = new C1621(c1621);
        }
        C1621 c1622 = c20397.f65384;
        if (c1622 != null) {
            this.f65384 = new C1621(c1622);
        }
        this.f65388 = c20397.f65388;
        try {
            this.f65385 = (C23424) c20397.f65385.clone();
        } catch (CloneNotSupportedException unused) {
            this.f65385 = C23424.m52623();
        }
    }
}
