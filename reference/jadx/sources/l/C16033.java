package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C16033 extends AbstractC1118 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52014;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0701 f52015;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21943 f52016;

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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14124 m38191(C0701 c0701, ArrayList arrayList, C21943 c21943) {
        return new C17525(c0701, arrayList, c21943);
    }

    public C16033(C7830 c7830, C0701 c0701, ArrayList arrayList, C21943 c21943) {
        super(c7830);
        this.f52014 = arrayList;
        this.f52016 = c21943;
        this.f52015 = c0701;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11902 mo4151() {
        return new C1864(m4149());
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC10066 mo4155() {
        return EnumC10066.READY_TO_COMPARE;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۚ */
    public final C0701 mo4148() {
        return this.f52015;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1118 mo4154(C7830 c7830) {
        return new C16033(c7830, this.f52015, this.f52014, this.f52016);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21943 m38193() {
        return this.f52016;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m38192() {
        return this.f52014;
    }
}
