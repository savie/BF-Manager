package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۗۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C3243 extends AbstractC6227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Path f10573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f10574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3989 f10575;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f10576;

    public C3243(C3989 c3989, float f, float f2, Path path) {
        this.f10575 = c3989;
        this.f10574 = f;
        this.f10576 = f2;
        this.f10573 = path;
    }

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10603(AbstractC4735 abstractC4735) {
        return !(abstractC4735 instanceof C21889);
    }

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10602(String str) {
        C3989 c3989 = this.f10575;
        if (c3989.m12896()) {
            Path path = new Path();
            c3989.f13654.f65381.getTextPath(str, 0, str.length(), this.f10574, this.f10576, path);
            this.f10573.addPath(path);
        }
        this.f10574 = c3989.f13654.f65381.measureText(str) + this.f10574;
    }
}
