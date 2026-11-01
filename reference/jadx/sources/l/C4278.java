package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4278 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7101 f15416;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9510 f15417;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f15418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15420;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4278(C7101 c7101, C17684 c17684, int i, InterfaceC9510 interfaceC9510) {
        super(c17684, i);
        this.f15416 = c7101;
        this.f15417 = interfaceC9510;
        this.f15418 = -1;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5043(C18825 c18825) {
        C11335 c11335;
        int i;
        do {
            int i2 = this.f15419 + 1;
            this.f15419 = i2;
            C7101 c7101 = this.f15416;
            C7807 c7807 = c7101.f23789;
            if (i2 > c7807.f25685) {
                c7807.f25688 = c18825.m43447();
                m25170();
                return null;
            }
            Iterator it = c7101.f23790;
            c11335 = new C11335(c7807.f25683, c18825, c7807, this.f15420, this.f15417, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11335.f38244;
            this.f15420 = i;
            if (!c7101.f23788) {
                break;
            }
        } while (this.f15418 == i);
        this.f15418 = i;
        return c11335;
    }
}
