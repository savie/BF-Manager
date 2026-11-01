package l;

import android.R;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩶ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19974 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63944;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63945;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63946;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63947;

    public /* synthetic */ ViewOnClickListenerC19974(Object obj, Object obj2, Object obj3, int i) {
        this.f63945 = i;
        this.f63947 = obj;
        this.f63944 = obj2;
        this.f63946 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f63945;
        Object obj = this.f63946;
        Object obj2 = this.f63944;
        Object obj3 = this.f63947;
        switch (i) {
            case 0:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj2;
                DialogInterfaceC19356[] dialogInterfaceC19356Arr = (DialogInterfaceC19356[]) obj;
                if (((C22959) obj3).m50802()) {
                    C13955.m33801(abstractActivityC12483, new RunnableC21384(0, dialogInterfaceC19356Arr));
                }
                break;
            case 1:
                final C13026 c13026 = (C13026) obj3;
                final EditText editText = (EditText) obj2;
                final EditText editText2 = (EditText) obj;
                C16195 c16195 = new C16195(view.getContext(), view, 0);
                c16195.m38298().add(0, R.string.selectAll, 0, R.string.selectAll);
                c16195.m38298().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c16195.m38298().add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c16195.m38296(new InterfaceC21133() { // from class: l.۟ۙ᩹
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C15717.m37440(c13026, editText, editText2, menuItem);
                        return true;
                    }
                });
                c16195.m38297();
                break;
            default:
                final DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) obj3;
                final SpannableString spannableString = (SpannableString) obj2;
                final String str = (String) obj;
                int i2 = ActivityC11220.f37969;
                C16195 c16196 = new C16195(view.getContext(), view, 0);
                C12418 c12418M38298 = c16196.m38298();
                MenuItem menuItemAdd = c12418M38298.add(1, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd2 = c12418M38298.add(1, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                MenuItem menuItemAdd3 = c12418M38298.add(0, bin.mt.plus.R.string.MT_Protector, 0, bin.mt.plus.R.string.MT_Protector);
                c12418M38298.setGroupCheckable(1, true, true);
                C20491.m46296(c12418M38298);
                if (ApplicationC0716.f2992.getBoolean("ewse", true)) {
                    menuItemAdd.setChecked(true);
                } else {
                    menuItemAdd2.setChecked(true);
                }
                menuItemAdd3.setCheckable(true);
                menuItemAdd3.setChecked(ApplicationC0716.f2992.getBoolean("ewrp", false));
                c16196.m38296(new InterfaceC21133() { // from class: l.ۡ᩶ۜ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i3 = ActivityC11220.f37969;
                        int itemId = menuItem.getItemId();
                        if (itemId == bin.mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C1679.m5597(ApplicationC0716.f2992, "ewse", true);
                            return true;
                        }
                        if (itemId == bin.mt.plus.R.string.MT_Protector) {
                            menuItem.setChecked(true);
                            C1679.m5597(ApplicationC0716.f2992, "ewse", false);
                            return true;
                        }
                        menuItem.setChecked(!menuItem.isChecked());
                        ApplicationC0716.f2992.edit().putBoolean("ewrp", menuItem.isChecked()).apply();
                        dialogInterfaceC19356.m44371(menuItem.isChecked() ? spannableString : str);
                        return true;
                    }
                });
                c16196.m38297();
                C0671.m3013(c16196);
                break;
        }
    }
}
