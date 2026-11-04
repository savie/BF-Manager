package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6525 extends AbstractC10408 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C25042[] f21937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f21938;

    @Override // l.InterfaceC16090
    public final int[] getStyle() {
        return null;
    }

    public C6525(String str, C25042[] c25042Arr) {
        this.f21938 = str;
        this.f21937 = (C25042[]) Arrays.copyOf(c25042Arr, c25042Arr.length);
    }

    @Override // l.InterfaceC16090
    public final String getValue() {
        return this.f21938;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ܿۙ */
    public final C25042[] mo8826() {
        C25042[] c25042Arr = this.f21937;
        if (c25042Arr == null) {
            return null;
        }
        return (C25042[]) Arrays.copyOf(c25042Arr, c25042Arr.length);
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۜۙ */
    public final C25042[] mo8824() {
        return m26720(mo8826());
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۠ۙ */
    public final boolean mo8825() {
        C25042[] c25042Arr = this.f21937;
        return c25042Arr != null && c25042Arr.length > 0;
    }
}
