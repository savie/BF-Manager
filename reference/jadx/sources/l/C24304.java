package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public final class C24304 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f78653;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24304(ActivityC5440 activityC5440, ActivityC5440 activityC5441) {
        super(activityC5441, -1);
        this.f78653 = activityC5440;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (!strM22914.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C16626("…", new C19147(22), null));
            ((ArrayList) C24832.m55353()).add(new C1711(strM22914, arrayList));
            C24832.m55356();
            ActivityC5440 activityC5440 = this.f78653;
            activityC5440.m16260();
            activityC5440.f18998.m36527(activityC5440.f19003.size() - 1);
        }
        m22951();
    }
}
