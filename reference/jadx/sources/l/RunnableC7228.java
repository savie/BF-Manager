package l;

import android.app.Activity;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7228 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24079;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24081;

    public /* synthetic */ RunnableC7228(int i, Object obj, Object obj2) {
        this.f24080 = i;
        this.f24081 = obj;
        this.f24079 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24080;
        int i2 = 0;
        Object obj = this.f24079;
        Object obj2 = this.f24081;
        switch (i) {
            case 0:
                C11545 c11545 = (C11545) obj2;
                RunnableC19223 runnableC19223 = (RunnableC19223) obj;
                if (!c11545.m28800()) {
                    runnableC19223.run();
                } else {
                    C16737.m39274(new RunnableC7228(i2, c11545, runnableC19223), 100L);
                }
                break;
            case 1:
                C19271.m44213((C19271) obj2, (Exception) obj);
                break;
            case 2:
                ActivityC5677.m15596((ActivityC5677) obj2, (C8229) obj);
                break;
            default:
                C11322 c11322 = (C11322) obj2;
                Activity activity = (Activity) obj;
                int i3 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067(activity);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21261(activity.getString(R.string.MT_Protector, "1000+"));
                c8067.m21265(false);
                c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15867(2, c11322));
                c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13249(1, c11322));
                c8067.m21269();
                break;
        }
    }
}
