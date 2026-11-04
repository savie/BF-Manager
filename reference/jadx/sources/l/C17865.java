package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܽ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17865 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f58559;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f58560;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f58561;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5582 f58562;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21244 f58563;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f58564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC13039 f58565;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f58566;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public C17865(View view, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327, RunnableC21244 runnableC21244, RunnableC5582 runnableC5582, View[] viewArr, C8893 c8893, RunnableC13039 runnableC13039) {
        this.f58560 = view;
        this.f58559 = abstractActivityC17204;
        this.f58566 = dialogInterfaceC8327;
        this.f58563 = runnableC21244;
        this.f58562 = runnableC5582;
        this.f58564 = viewArr;
        this.f58561 = c8893;
        this.f58565 = runnableC13039;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        View view = this.f58560;
        View viewFindFocus = view.findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
            ((InputMethodManager) this.f58559.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        int position = tab.getPosition();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f58566;
        dialogInterfaceC8327.m22440().setVisibility(position < 2 ? 8 : 0);
        dialogInterfaceC8327.m22440().setText(position == 3 ? R.string.MT_Protector : R.string.MT_Protector);
        if (position == 1) {
            this.f58563.run();
        }
        View[] viewArr = this.f58564;
        if (position == 2) {
            this.f58562.run();
            ((C5817) viewArr[2].findViewById(R.id.MT_Protector)).m16966();
        }
        if (position == 3) {
            this.f58561.m23809();
            ((C5817) viewArr[3].findViewById(R.id.MT_Protector)).m16966();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        if (tab.getPosition() == 0) {
            this.f58565.run();
        }
    }
}
