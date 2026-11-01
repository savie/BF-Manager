package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۚۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5240 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18167;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18168 = 2;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18170;

    public /* synthetic */ RunnableC5240(ActivityC5677 activityC5677, C23444 c23444, boolean z) {
        this.f18170 = c23444;
        this.f18169 = z;
        this.f18167 = activityC5677;
    }

    public /* synthetic */ RunnableC5240(ActivityC11632 activityC11632, Intent intent, boolean z) {
        this.f18170 = activityC11632;
        this.f18167 = intent;
        this.f18169 = z;
    }

    public /* synthetic */ RunnableC5240(boolean z, ViewOnClickListenerC8374 viewOnClickListenerC8374, AbstractC20745 abstractC20745) {
        this.f18169 = z;
        this.f18170 = viewOnClickListenerC8374;
        this.f18167 = abstractC20745;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18168) {
            case 0:
                ActivityC11632.m28986((ActivityC11632) this.f18170, (Intent) this.f18167, this.f18169);
                break;
            case 1:
                ViewOnClickListenerC8374.m21948(this.f18169, (ViewOnClickListenerC8374) this.f18170, (AbstractC20745) this.f18167);
                break;
            default:
                C23444.m51611((ActivityC5677) this.f18167, (C23444) this.f18170, this.f18169);
                break;
        }
    }
}
