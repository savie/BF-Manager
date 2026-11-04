package l;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plugin.api.ui.menu.PluginMenu;

/* JADX INFO: renamed from: l.۬ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13768 implements InterfaceC10523, InterfaceC21436 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43695;

    public /* synthetic */ C13768(Object obj, Object obj2) {
        this.f43694 = obj;
        this.f43695 = obj2;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        return C1212.m4432((C1212) this.f43694, (PluginMenu.OnMenuItemClickListener) this.f43695, menuItem);
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        View.OnClickListener onClickListener = (View.OnClickListener) this.f43694;
        String str = (String) this.f43695;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(5);
        if (onClickListener == null) {
            ViewOnClickListenerC15284.m36687(textView, str);
            return;
        }
        textView.setText(str);
        textView.getPaint().setFlags(8);
        textView.getPaint().setAntiAlias(true);
        textView.setOnClickListener(onClickListener);
        ViewOnClickListenerC15284.m36688(textView);
    }
}
