package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OIS0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9320 extends AbstractC1118 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f30288;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0701 f30289;

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4145() {
        return false;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۫ */
    public final C19017 mo4150() {
        return null;
    }

    public C9320(C7830 c7830, C0701 c0701, List list) {
        super(c7830);
        this.f30289 = c0701;
        this.f30288 = list;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11902 mo4151() {
        return new C24985(m4149());
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC10066 mo4155() {
        return EnumC10066.READY_TO_COMPARE;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۚ */
    public final C0701 mo4148() {
        return this.f30289;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1118 mo4154(C7830 c7830) {
        return new C9320(c7830, this.f30289.m3005(), new ArrayList(this.f30288));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m24556() {
        return this.f30288;
    }
}
