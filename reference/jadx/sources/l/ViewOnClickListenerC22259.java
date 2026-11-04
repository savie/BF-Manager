package l;

import android.R;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22259 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f71673;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f71675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71676;

    public /* synthetic */ ViewOnClickListenerC22259(Object obj, C23255 c23255, View view, int i) {
        this.f71674 = i;
        this.f71676 = obj;
        this.f71675 = c23255;
        this.f71673 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f71674) {
            case 0:
                final C12628 c12628 = (C12628) this.f71676;
                final C23255 c23255 = (C23255) this.f71673;
                C18452 c18452 = new C18452(view.getContext(), view, 0);
                c18452.m42995().add(0, R.string.selectAll, 0, R.string.selectAll);
                c18452.m42995().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c18452.m42995().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                final C23255 c23256 = this.f71675;
                c18452.m42994(new InterfaceC21436() { // from class: l.᩸ᩴܳ
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C15545.m37230(c12628, c23256, c23255, menuItem);
                        return true;
                    }
                });
                c18452.mo21878();
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f71676;
                TextView textView = (TextView) this.f71673;
                int length = radioButtonArr.length;
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length) {
                        this.f71675.setVisibility(view != radioButtonArr[1] ? 8 : 0);
                        textView.setText((String) view.getTag());
                    } else {
                        RadioButton radioButton = radioButtonArr[i];
                        if (view != radioButton) {
                            z = false;
                        }
                        radioButton.setChecked(z);
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
