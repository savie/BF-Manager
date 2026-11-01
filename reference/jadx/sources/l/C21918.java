package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21918 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18390 f71107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f71108;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f71109;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21918(C18390 c18390, C17684 c17684, int i) {
        super(c17684, i);
        this.f71107 = c18390;
        this.f71110 = -1;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5043(C18825 c18825) {
        C11770 c11770;
        int i;
        C18390 c18390 = this.f71107;
        C7807 c7807 = c18390.f58632;
        do {
            int i2 = this.f71109 + 1;
            this.f71109 = i2;
            if (i2 > c7807.f25684) {
                m25170();
                return null;
            }
            Iterator it = c18390.f58635;
            c11770 = new C11770(c7807.f25683, c18825, c7807, this.f71108, c18390.f58634, c18390.f58637, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11770.f39507;
            this.f71108 = i;
            if (!c18390.f58636) {
                break;
            }
        } while (this.f71110 == i);
        this.f71110 = i;
        return c11770;
    }
}
