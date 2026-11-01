package l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0856 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC17341 f3507;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String strM39296 = C16737.m39296();
        if (!TextUtils.isEmpty(strM39296)) {
            InterfaceC2916 interfaceC2916M40374 = this.f3507.m40374();
            interfaceC2916M40374.replace(0, interfaceC2916M40374.length(), strM39296);
            Selection.setSelection(interfaceC2916M40374, strM39296.length());
            return true;
        }
        C15829.m37611(R.string.MT_Protector);
        return false;
    }
}
