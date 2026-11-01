package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۛۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6041 implements InterfaceC21563 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f20512;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f20513;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9570 f20514;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f20515;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC7808 f20516;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f20517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11748 f20518;

    public C6041(C9570 c9570, C11748 c11748, Set set, Set set2, Set set3, EnumC7808 enumC7808, Set set4) {
        this.f20514 = c9570;
        this.f20518 = c11748;
        this.f20517 = set;
        this.f20515 = set2;
        this.f20512 = set3;
        this.f20516 = enumC7808;
        this.f20513 = set4;
    }

    @Override // l.InterfaceC21563
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo16392(C11748 c11748) {
        C9570 c9570 = this.f20514;
        C20858 c20858M46890 = c9570.f69299;
        C11748 c11749 = this.f20518;
        if (!c11749.m29356(c11748)) {
            c20858M46890 = c20858M46890.m46890(c11748);
        }
        if (!c11749.m29359(c11748)) {
            c9570 = (C9570) c20858M46890.m46891(c11748.m29357());
        }
        return C9570.m24425(c9570, c11748, this.f20517, this.f20515, this.f20512, this.f20516, this.f20513);
    }
}
