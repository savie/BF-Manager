package l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC1596 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC8552 f5495;

    public /* synthetic */ ViewOnLongClickListenerC1596(AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        this.f5495 = abstractDialogInterfaceOnClickListenerC8552;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String strM49080 = C21576.m49080();
        if (!TextUtils.isEmpty(strM49080)) {
            InterfaceC19106 interfaceC19106M22947 = this.f5495.m22947();
            interfaceC19106M22947.replace(0, interfaceC19106M22947.length(), strM49080);
            Selection.setSelection(interfaceC19106M22947, strM49080.length());
            return true;
        }
        C22673.m51152(R.string.MT_Protector);
        return false;
    }
}
