package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܿۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17330 implements InterfaceC21563 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f55139;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f55140;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9570 f55141;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f55142;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC7808 f55143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f55144;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11748 f55145;

    public C17330(C9570 c9570, C11748 c11748, Set set, Set set2, Set set3, EnumC7808 enumC7808, Set set4) {
        this.f55141 = c9570;
        this.f55145 = c11748;
        this.f55144 = set;
        this.f55142 = set2;
        this.f55139 = set3;
        this.f55143 = enumC7808;
        this.f55140 = set4;
    }

    @Override // l.InterfaceC21563
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16392(C11748 c11748) {
        C9570 c9570 = this.f55141;
        C20858 c20858M46890 = c9570.f69299;
        C11748 c11749 = this.f55145;
        if (!c11749.m29356(c11748)) {
            c20858M46890 = c20858M46890.m46890(c11748);
        }
        if (!c11749.m29359(c11748)) {
            c9570 = (C9570) c20858M46890.m46891(c11748.m29357());
        }
        C9570 c9571 = c9570;
        if (c11749.equals(c11748)) {
            return null;
        }
        return C9570.m24425(c9571, c11748, this.f55144, this.f55142, this.f55139, this.f55143, this.f55140);
    }
}
