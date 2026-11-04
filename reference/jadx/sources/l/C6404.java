package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6404 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f21606;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21607;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6404(ActivityC5440 activityC5440, ActivityC5440 activityC5441, int i) {
        super(activityC5441, -1);
        this.f21606 = activityC5440;
        this.f21607 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (!strM22914.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C16626("…", new C19147(22), null));
            List listM55353 = C24832.m55353();
            int i = this.f21607 + 1;
            ((ArrayList) listM55353).add(i, new C1711(strM22914, arrayList));
            C24832.m55356();
            ActivityC5440 activityC5440 = this.f21606;
            activityC5440.m16260();
            activityC5440.f18998.m36527(i);
        }
        m22951();
    }
}
