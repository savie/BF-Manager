package l;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩸ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22506 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72809;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72811 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72812;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72814;

    public /* synthetic */ RunnableC22506(ActivityC11563 activityC11563, Context context, Intent intent, int i, AbstractC22044 abstractC22044) {
        this.f72814 = activityC11563;
        this.f72812 = context;
        this.f72810 = intent;
        this.f72809 = i;
        this.f72813 = abstractC22044;
    }

    public /* synthetic */ RunnableC22506(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, C13511 c13511, int i, String str, C8614 c8614) {
        this.f72814 = dialogInterfaceOnClickListenerC14300;
        this.f72812 = c13511;
        this.f72809 = i;
        this.f72810 = str;
        this.f72813 = c8614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean zM52478;
        int i = this.f72811;
        Object obj = this.f72813;
        Object obj2 = this.f72810;
        Object obj3 = this.f72812;
        Object obj4 = this.f72814;
        switch (i) {
            case 0:
                DialogInterfaceOnClickListenerC14300.m34717((DialogInterfaceOnClickListenerC14300) obj4, (C13511) obj3, this.f72809, (String) obj2, (C8614) obj);
                break;
            default:
                final ActivityC11563 activityC11563 = (ActivityC11563) obj4;
                Context context = (Context) obj3;
                final Intent intent = (Intent) obj2;
                final AbstractC22044 abstractC22044 = (AbstractC22044) obj;
                int i2 = ActivityC11563.f36350;
                try {
                    zM52478 = ActivityC23324.m52478(context, intent);
                } catch (Exception unused) {
                    zM52478 = false;
                }
                final int i3 = this.f72809;
                C21576.m49068(new Runnable() { // from class: l.᩸ۤ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC11563.m29086(activityC11563, i3, zM52478, abstractC22044, intent);
                    }
                });
                break;
        }
    }
}
