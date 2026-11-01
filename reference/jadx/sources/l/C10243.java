package l;

/* JADX INFO: renamed from: l.ۤۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10243 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f34939;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10243(ActivityC5677 activityC5677) {
        super(true);
        this.f34939 = activityC5677;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ActivityC5677 activityC5677 = this.f34939;
        if (activityC5677.f19384.m40473(8388611)) {
            if (activityC5677.f19371.m28846()) {
                activityC5677.f19371.m28844(true);
                return;
            } else {
                activityC5677.f19384.m40477(8388611);
                return;
            }
        }
        if (activityC5677.f19362 != -1 && activityC5677.f19362 < activityC5677.f19367.size()) {
            InterfaceC17422 interfaceC17422 = (ComponentCallbacksC22654) activityC5677.f19367.get(activityC5677.f19362);
            if ((interfaceC17422 instanceof InterfaceC19601) && ((InterfaceC19601) interfaceC17422).mo3616()) {
                return;
            }
        }
        if (!activityC5677.f19372.isEmpty()) {
            String str = (String) activityC5677.f19372.pop();
            for (int i = 0; i < activityC5677.f19367.size(); i++) {
                if (((AbstractC22611) activityC5677.f19367.get(i)).m50129().equals(str)) {
                    ActivityC5677.m15589(activityC5677, i, false);
                    return;
                }
            }
            ActivityC5677.m15589(activityC5677, 0, false);
            return;
        }
        activityC5677.m15662(true);
    }
}
