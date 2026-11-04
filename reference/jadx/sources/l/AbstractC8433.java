package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8V1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8433 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C25368 f27594;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27595;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f27596;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f27597 = new ArrayList(1);

    public AbstractC8433(boolean z) {
        this.f27596 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22621(C25368 c25368) {
        for (int i = 0; i < this.f27595; i++) {
            ((InterfaceC4639) this.f27597.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22619(C25368 c25368) {
        this.f27594 = c25368;
        for (int i = 0; i < this.f27595; i++) {
            ((InterfaceC4639) this.f27597.get(i)).mo11749(c25368, this.f27596);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22622(int i) {
        C25368 c25368 = this.f27594;
        String str = C7116.f23455;
        for (int i2 = 0; i2 < this.f27595; i2++) {
            ((InterfaceC4639) this.f27597.get(i2)).mo11747(c25368, this.f27596, i);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public Map mo10893() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m22620() {
        C25368 c25368 = this.f27594;
        String str = C7116.f23455;
        for (int i = 0; i < this.f27595; i++) {
            ((InterfaceC4639) this.f27597.get(i)).mo11746(c25368, this.f27596);
        }
        this.f27594 = null;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        ArrayList arrayList = this.f27597;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
        this.f27595++;
    }
}
