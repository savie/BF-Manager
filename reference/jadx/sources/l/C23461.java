package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes.dex */
public final class C23461 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC1587 f75973;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23461(AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587) {
        this.f75973 = abstractDialogInterfaceOnClickListenerC1587;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f75973.f6361.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14289 c14289;
        AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587 = this.f75973;
        if (view == null) {
            view = abstractDialogInterfaceOnClickListenerC1587.f6359.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c14289 = new C14289(view);
            view.setTag(c14289);
        } else {
            c14289 = (C14289) view.getTag();
        }
        c14289.f46821.setText(((C0176) abstractDialogInterfaceOnClickListenerC1587.f6361.get(i)).m1373());
        c14289.f46821.setChecked(abstractDialogInterfaceOnClickListenerC1587.f6358 == i);
        return view;
    }
}
