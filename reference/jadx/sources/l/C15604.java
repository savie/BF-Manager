package l;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15604 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23064 f50713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f50715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f50714 = new Rect();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Rect f50712 = new Rect();

    public C15604(boolean z, InterfaceC23064 interfaceC23064) {
        this.f50715 = z;
        this.f50713 = interfaceC23064;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C13609 c13609 = (C13609) this.f50713;
        c13609.getClass();
        Rect rect = this.f50714;
        ((C19835) obj).m45636(rect);
        c13609.getClass();
        Rect rect2 = this.f50712;
        ((C19835) obj2).m45636(rect2);
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
        boolean z = this.f50715;
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
