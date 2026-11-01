package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C0826 extends AbstractC2679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f3452;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f3453;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 f3454;

    public C0826(int i, String str, Collection collection) {
        this.f3453 = i;
        this.f3452 = str;
        this.f3454 = C3648.m10754(collection);
    }

    @Override // l.InterfaceC3710
    public final int getVisibility() {
        return this.f3453;
    }

    @Override // l.InterfaceC3710
    public final String getType() {
        return this.f3452;
    }

    @Override // l.InterfaceC3710
    public final Set getElements() {
        return this.f3454;
    }
}
