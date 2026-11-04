package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ܶۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes5.dex */
public final class C15921 extends C23381 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3989 f51727;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Path f51728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15921(C3989 c3989, Path path, float f) {
        super(c3989, f, 0.0f);
        this.f51727 = c3989;
        this.f51728 = path;
    }

    @Override // l.C23381, l.AbstractC6227
    /* JADX INFO: renamed from: ۙ */
    public final void mo10602(String str) {
        C3989 c3989 = this.f51727;
        if (c3989.m12896()) {
            if (c3989.f13654.f65387) {
                c3989.f13651.drawTextOnPath(str, this.f51728, this.f75689, this.f75688, c3989.f13654.f65381);
            }
            if (c3989.f13654.f65383) {
                c3989.f13651.drawTextOnPath(str, this.f51728, this.f75689, this.f75688, c3989.f13654.f65386);
            }
        }
        this.f75689 = c3989.f13654.f65381.measureText(str) + this.f75689;
    }
}
