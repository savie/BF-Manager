package l;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩺ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public final class C22933 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5562 f74545;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f74546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Paint f74547;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Paint f74548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f74549;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5562 f74550;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74551;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3840 f74552;

    public C22933() {
        Paint paint = new Paint();
        this.f74547 = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f74548 = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f74552 = C3840.m11167();
    }

    public C22933(C22933 c22933) {
        this.f74551 = c22933.f74551;
        this.f74549 = c22933.f74549;
        this.f74547 = new Paint(c22933.f74547);
        this.f74548 = new Paint(c22933.f74548);
        C5562 c5562 = c22933.f74550;
        if (c5562 != null) {
            this.f74550 = new C5562(c5562);
        }
        C5562 c5563 = c22933.f74545;
        if (c5563 != null) {
            this.f74545 = new C5562(c5563);
        }
        this.f74546 = c22933.f74546;
        try {
            this.f74552 = (C3840) c22933.f74552.clone();
        } catch (CloneNotSupportedException unused) {
            this.f74552 = C3840.m11167();
        }
    }
}
