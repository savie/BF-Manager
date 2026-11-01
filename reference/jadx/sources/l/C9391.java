package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۢۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9391 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC15035 f31784;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f31785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f31786;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f31787;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f31788;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f31789;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22796 f31790;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22090 f31791;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public C9391(View view, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, RunnableC22090 runnableC22090, RunnableC15035 runnableC15035, View[] viewArr, C12543 c12543, RunnableC22796 runnableC22796) {
        this.f31789 = view;
        this.f31786 = abstractActivityC12483;
        this.f31785 = dialogInterfaceC19356;
        this.f31791 = runnableC22090;
        this.f31784 = runnableC15035;
        this.f31787 = viewArr;
        this.f31788 = c12543;
        this.f31790 = runnableC22796;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) throws Throwable {
        View view = this.f31789;
        View viewFindFocus = view.findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
            ((InputMethodManager) this.f31786.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        int position = tab.getPosition();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f31785;
        dialogInterfaceC19356.m44361().setVisibility(position < 2 ? 8 : 0);
        dialogInterfaceC19356.m44361().setText(position == 3 ? R.string.MT_Protector : R.string.MT_Protector);
        if (position == 1) {
            this.f31791.run();
        }
        View[] viewArr = this.f31787;
        if (position == 2) {
            this.f31784.run();
            ((C21423) viewArr[2].findViewById(R.id.MT_Protector)).m47984();
        }
        if (position == 3) {
            this.f31788.m31201();
            ((C21423) viewArr[3].findViewById(R.id.MT_Protector)).m47984();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        if (tab.getPosition() == 0) {
            this.f31790.run();
        }
    }
}
