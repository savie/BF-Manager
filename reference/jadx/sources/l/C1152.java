package l;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: l.֨ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1152 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5386 f5169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f5171;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Rect f5168 = new Rect();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f5170 = new Rect();

    public C1152(boolean z, InterfaceC5386 interfaceC5386) {
        this.f5171 = z;
        this.f5169 = interfaceC5386;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C4680 c4680 = (C4680) this.f5169;
        c4680.getClass();
        Rect rect = this.f5168;
        ((C22006) obj).m48841(rect);
        c4680.getClass();
        Rect rect2 = this.f5170;
        ((C22006) obj2).m48841(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f5171;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
