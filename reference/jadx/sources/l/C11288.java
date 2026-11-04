package l;

/* JADX INFO: renamed from: l.ۧ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11288 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f35595;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11288(ActivityC0848 activityC0848) {
        super(true);
        this.f35595 = activityC0848;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC0848 activityC0848 = this.f35595;
        if (activityC0848.f3195.m22057(8388611)) {
            if (activityC0848.f3177.m23776()) {
                activityC0848.f3177.m23774(true);
                return;
            } else {
                activityC0848.f3195.m22037(8388611);
                return;
            }
        }
        if (activityC0848.f3172 != -1 && activityC0848.f3172 < activityC0848.f3173.size()) {
            InterfaceC11217 interfaceC11217 = (ComponentCallbacksC11612) activityC0848.f3173.get(activityC0848.f3172);
            if ((interfaceC11217 instanceof InterfaceC16837) && ((InterfaceC16837) interfaceC11217).mo1437()) {
                return;
            }
        }
        if (!activityC0848.f3175.isEmpty()) {
            String str = (String) activityC0848.f3175.pop();
            for (int i = 0; i < activityC0848.f3173.size(); i++) {
                if (((AbstractC9051) activityC0848.f3173.get(i)).m24161().equals(str)) {
                    ActivityC0848.m3363(activityC0848, i, false);
                    return;
                }
            }
            ActivityC0848.m3363(activityC0848, 0, false);
            return;
        }
        activityC0848.m3453(true);
    }
}
