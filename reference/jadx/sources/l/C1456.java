package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13452 f5938;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9510 f5939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f5940;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5941;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f5942;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14967 f5943;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456(C13452 c13452, C17684 c17684, int i, AbstractC14967 abstractC14967, InterfaceC9510 interfaceC9510) {
        super(c17684, i);
        this.f5938 = c13452;
        this.f5943 = abstractC14967;
        this.f5939 = interfaceC9510;
        this.f5940 = -1;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5043(C18825 c18825) {
        C11335 c11335;
        int i;
        do {
            int i2 = this.f5941 + 1;
            this.f5941 = i2;
            C13452 c13452 = this.f5938;
            C7807 c7807 = c13452.f44502;
            if (i2 > c7807.f25694) {
                c7807.f25687 = c18825.m43447();
                m25170();
                return null;
            }
            Iterator it = c13452.f44500;
            c11335 = new C11335(c7807.f25683, c18825, c7807, this.f5942, this.f5943, this.f5939, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11335.f38244;
            this.f5942 = i;
            if (!c13452.f44503) {
                break;
            }
        } while (this.f5940 == i);
        this.f5940 = i;
        return c11335;
    }
}
