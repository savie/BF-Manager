package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10785 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f36738;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10785(ActivityC19749 activityC19749, ActivityC19749 activityC197410) {
        super(activityC197410, -1);
        this.f36738 = activityC19749;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (!strM40352.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C21159("…", new C13607(22), null));
            ((ArrayList) C7754.m20409()).add(new C9166(strM40352, arrayList));
            C7754.m20408();
            ActivityC19749 activityC19749 = this.f36738;
            activityC19749.m44942();
            activityC19749.f63464.m44413(activityC19749.f63470.size() - 1);
        }
        m40364();
    }
}
