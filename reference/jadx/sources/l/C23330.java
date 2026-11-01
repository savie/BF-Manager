package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23330 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15569 f75608;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9510 f75609;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f75610;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75611;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75612;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9510 f75613;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23330(C15569 c15569, C17684 c17684, int i, InterfaceC9510 interfaceC9510, InterfaceC9510 interfaceC9511) {
        super(c17684, i);
        this.f75608 = c15569;
        this.f75609 = interfaceC9510;
        this.f75613 = interfaceC9511;
        this.f75612 = -1;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5043(C18825 c18825) {
        C11770 c11770;
        int i;
        do {
            int i2 = this.f75611 + 1;
            this.f75611 = i2;
            C15569 c15569 = this.f75608;
            C7807 c7807 = c15569.f50630;
            if (i2 > c7807.f25691) {
                c7807.f25686 = c18825.m43447();
                m25170();
                return null;
            }
            Iterator it = c15569.f50628;
            c11770 = new C11770(c7807.f25683, c18825, c7807, this.f75610, this.f75609, this.f75613, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11770.f39507;
            this.f75610 = i;
            if (!c15569.f50629) {
                break;
            }
        } while (this.f75612 == i);
        this.f75612 = i;
        return c11770;
    }
}
