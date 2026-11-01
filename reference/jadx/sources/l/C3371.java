package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C3371 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4452 f12490;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20306 f12491;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3371(C4452 c4452, AbstractActivityC12483 abstractActivityC12483, C20306 c20306) {
        super(abstractActivityC12483, -1);
        this.f12490 = c4452;
        this.f12491 = c20306;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        m40364();
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            return;
        }
        C20306 c20306 = this.f12491;
        if (strM40352.equals(c20306.f65781)) {
            return;
        }
        try {
            c20306.f65778.m46735(strM40352);
        } catch (IOException unused) {
        }
        C4452 c4452 = this.f12490;
        c4452.f15847 = c4452.f15846.m2562();
        c4452.f15850.notifyDataSetChanged();
    }
}
