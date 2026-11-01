package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22610 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73683;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73684;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73686;

    public /* synthetic */ RunnableC22610(Object obj, Object obj2, Object obj3, int i) {
        this.f73684 = i;
        this.f73686 = obj;
        this.f73683 = obj2;
        this.f73685 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73684) {
            case 0:
                C6111.m16669((C6111) this.f73686, (C19186) this.f73683, (C19186) this.f73685);
                break;
            case 1:
                C3449.m10158((C3449) this.f73686, (ArrayList) this.f73683, (C21422) this.f73685);
                break;
            default:
                ViewOnClickListenerC8374.m21946((C17485) this.f73686, (ViewOnClickListenerC8374) this.f73683, (Bundle) this.f73685);
                break;
        }
    }
}
