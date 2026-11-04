package l;

import android.content.Intent;
import android.view.View;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: l.֨ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1342 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4798;

    public /* synthetic */ ViewOnClickListenerC1342(int i, Object obj) {
        this.f4797 = i;
        this.f4798 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4797;
        Object obj = this.f4798;
        switch (i) {
            case 0:
                int i2 = C7308.f24048;
                ((C7308) obj).m20013(true);
                break;
            case 1:
                ActivityC2350.m7955((ActivityC2350) obj);
                break;
            case 2:
                C21425.m48740((C21425) obj);
                break;
            case 3:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC3786.class);
                intent.putExtra("fromDialog", true);
                abstractActivityC17204.startActivity(intent);
                break;
            case 4:
                CheckedTextView checkedTextView = (CheckedTextView) obj;
                int i3 = ViewOnClickListenerC7793.f25871;
                checkedTextView.setChecked(!checkedTextView.isChecked());
                break;
            default:
                int i4 = ViewOnClickListenerC5914.f20235;
                ((ViewOnClickListenerC5914) obj).finish();
                break;
        }
    }
}
