package l;

/* JADX INFO: renamed from: l.ܶۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes5.dex */
public final class C15120 extends C18601 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10181 f49389;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15120(ActivityC10181 activityC10181, ActivityC10181 activityC10182) {
        super(activityC10182);
        this.f49389 = activityC10181;
    }

    @Override // l.C18601, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ActivityC10181 activityC10181 = this.f49389;
        if (activityC10181.f34786 != null) {
            activityC10181.f34786.m1845();
        }
    }
}
