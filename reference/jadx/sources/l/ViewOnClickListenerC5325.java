package l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5325 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC8552 f18723;

    public /* synthetic */ ViewOnClickListenerC5325(AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, int i) {
        this.f18722 = i;
        this.f18723 = abstractDialogInterfaceOnClickListenerC8552;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18722) {
            case 0:
                String strM49080 = C21576.m49080();
                if (!TextUtils.isEmpty(strM49080)) {
                    InterfaceC19106 interfaceC19106M22947 = this.f18723.m22947();
                    int selectionStart = Selection.getSelectionStart(interfaceC19106M22947);
                    int selectionEnd = Selection.getSelectionEnd(interfaceC19106M22947);
                    if (selectionStart > selectionEnd) {
                        selectionEnd = selectionStart;
                        selectionStart = selectionEnd;
                    }
                    interfaceC19106M22947.replace(selectionStart, selectionEnd, strM49080);
                    Selection.setSelection(interfaceC19106M22947, strM49080.length() + selectionStart);
                } else {
                    C22673.m51152(R.string.MT_Protector);
                }
                break;
            default:
                this.f18723.m22924((CharSequence) C22482.m50718(System.currentTimeMillis()));
                break;
        }
    }
}
