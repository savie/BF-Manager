package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5845 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f19816;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19817;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5845(ActivityC19749 activityC19749, ActivityC19749 activityC197410, int i) {
        super(activityC197410, -1);
        this.f19816 = activityC19749;
        this.f19817 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (!strM40352.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C21159("…", new C13607(22), null));
            List listM20409 = C7754.m20409();
            int i = this.f19817 + 1;
            ((ArrayList) listM20409).add(i, new C9166(strM40352, arrayList));
            C7754.m20408();
            ActivityC19749 activityC19749 = this.f19816;
            activityC19749.m44942();
            activityC19749.f63464.m44413(i);
        }
        m40364();
    }
}
