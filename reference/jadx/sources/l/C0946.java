package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0946 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC2437 f3485;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C0946(AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437) {
        this.f3485 = abstractDialogInterfaceOnClickListenerC2437;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3485.f7813.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C9148 c9148;
        AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437 = this.f3485;
        if (view == null) {
            view = abstractDialogInterfaceOnClickListenerC2437.f7811.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c9148 = new C9148(view);
            view.setTag(c9148);
        } else {
            c9148 = (C9148) view.getTag();
        }
        c9148.f29723.setText(((C18099) abstractDialogInterfaceOnClickListenerC2437.f7813.get(i)).m42221());
        c9148.f29723.setChecked(abstractDialogInterfaceOnClickListenerC2437.f7803 == i);
        return view;
    }
}
