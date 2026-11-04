package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C5701 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1972 f19683;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f19684;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    public C5701(C1972 c1972) {
        this.f19683 = c1972;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C1972 c1972 = this.f19683;
        this.f19684 = C25093.m55913(c1972.f6619, c1972.f6614, c1972.f6618);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C1972 c1972 = this.f19683;
        C4955 c4955 = c1972.f6615;
        C25093 c25093 = c1972.f6619;
        if (c25093.f81151 || !c25093.f81140.m22434()) {
            return;
        }
        c1972.f6621 = false;
        c1972.f6623 = true;
        c4955.f17245 = this.f19684;
        c4955.m15157();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C1972 c1972 = this.f19683;
        C25093 c25093 = c1972.f6619;
        if (c25093.f81151 || !c25093.f81140.m22434()) {
            return;
        }
        c1972.f6621 = false;
        c1972.f6617 = true;
        c1972.m6792();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C1972 c1972 = this.f19683;
        C25093 c25093 = c1972.f6619;
        if (c25093.f81146 == c1972) {
            c25093.f81146 = null;
        }
        C25093.m55929(c25093);
    }
}
