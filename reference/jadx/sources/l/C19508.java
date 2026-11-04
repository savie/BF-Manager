package l;

/* JADX INFO: renamed from: l.ᩴۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19508 extends C2088 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f62958;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19508(ActivityC3846 activityC3846, ActivityC3846 activityC3847) {
        super(activityC3847);
        this.f62958 = activityC3846;
    }

    @Override // l.C2088, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ActivityC3846 activityC3846 = this.f62958;
        if (activityC3846.f13108 != null) {
            activityC3846.f13108.m26205();
        }
        if (activityC3846.f13147 != null) {
            activityC3846.f13147.m20714();
        }
    }
}
