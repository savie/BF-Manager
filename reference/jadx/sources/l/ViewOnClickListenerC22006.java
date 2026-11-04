package l;

import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22006 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70988;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70991;

    public /* synthetic */ ViewOnClickListenerC22006(Object obj, Object obj2, Object obj3, int i) {
        this.f70989 = i;
        this.f70991 = obj;
        this.f70990 = obj2;
        this.f70988 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f70989;
        Object obj = this.f70988;
        Object obj2 = this.f70990;
        Object obj3 = this.f70991;
        switch (i) {
            case 0:
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) obj3;
                SpannableString spannableString = (SpannableString) obj2;
                String str = (String) obj;
                int i2 = ActivityC11563.f36350;
                C18452 c18452 = new C18452(view.getContext(), view, 0);
                C9898 c9898M42995 = c18452.m42995();
                MenuItem menuItemAdd = c9898M42995.add(1, R.string.MT_Protector, 0, R.string.MT_Protector);
                MenuItem menuItemAdd2 = c9898M42995.add(1, R.string.MT_Protector, 0, R.string.MT_Protector);
                MenuItem menuItemAdd3 = c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c9898M42995.setGroupCheckable(1, true, true);
                C18211.m42360(c9898M42995);
                if (ApplicationC17729.f58258.getBoolean("ewse", true)) {
                    menuItemAdd.setChecked(true);
                } else {
                    menuItemAdd2.setChecked(true);
                }
                menuItemAdd3.setCheckable(true);
                menuItemAdd3.setChecked(ApplicationC17729.f58258.getBoolean("ewrp", false));
                c18452.m42994(new C12989(dialogInterfaceC8327, spannableString, str));
                c18452.mo21878();
                C19198.m44471(c18452);
                break;
            default:
                C13334.m32910((C13334) obj3, (Spinner) obj2, (Spinner) obj);
                break;
        }
    }
}
