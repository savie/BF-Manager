package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۘ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4263 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15391;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15392;

    public /* synthetic */ RunnableC4263(int i, Object obj) {
        this.f15391 = i;
        this.f15392 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15391;
        Object obj = this.f15392;
        switch (i) {
            case 0:
                ServiceC8498.m22211((ServiceC8498) obj);
                return;
            case 1:
                C0550.m2567((C0550) obj);
                return;
            case 2:
                ((AbstractActivityC5788) obj).f19661.m23201();
                return;
            case 3:
                ((ActivityC19749) obj).m44917();
                return;
            case 4:
                ((AbstractViewOnClickListenerC14664) obj).m35194();
                return;
            case 5:
                final ActivityC10957 activityC10957 = (ActivityC10957) obj;
                int i2 = ActivityC10957.f37270;
                C16737.m39273(new Runnable() { // from class: l.ܰۛ۬
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC10957.m27615(activityC10957);
                    }
                });
                return;
            case 6:
                ((C9886) obj).notifyDataSetChanged();
                return;
            case 7:
                C19729.m44853((C19729) obj);
                return;
            case 8:
                ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = (ViewOnLayoutChangeListenerC3333) obj;
                int i3 = ViewOnLayoutChangeListenerC3333.f12350;
                if (C4744.f16694) {
                    DialogInterfaceOnClickListenerC14147.m34221(viewOnLayoutChangeListenerC3333, "term_api29_limit", viewOnLayoutChangeListenerC3333.getString(R.string.MT_Protector), true);
                }
                viewOnLayoutChangeListenerC3333.runOnUiThread(new RunnableC2749(3, viewOnLayoutChangeListenerC3333, new RunnableC21384(4, viewOnLayoutChangeListenerC3333)));
                return;
            case 9:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"));
                    context.startActivity(intent);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException("Unable to open OPPO floating window settings", e);
                }
            default:
                ((SearchView) obj).lambda$clearFocusAndHideKeyboard$9();
                return;
        }
    }
}
