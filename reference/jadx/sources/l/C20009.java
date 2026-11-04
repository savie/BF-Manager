package l;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20009 implements AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C17771.f58342;
        ViewOnClickListenerC25231 viewOnClickListenerC25231 = (ViewOnClickListenerC25231) view.getTag();
        C17771 c17771 = viewOnClickListenerC25231.f81491;
        int i3 = viewOnClickListenerC25231.f81490;
        if (i3 == 0) {
            c17771.f58352.mo52335((CharSequence) viewOnClickListenerC25231.f81496);
            c17771.f58352.mo52339(c17771.f58352.m54099());
            c17771.f58346.dismiss();
            return;
        }
        if (i3 == 1) {
            c17771.f58352.mo52335((CharSequence) viewOnClickListenerC25231.f81497.m25830());
            c17771.f58352.mo52339(c17771.f58352.m54099());
            c17771.f58346.dismiss();
            return;
        }
        if (i3 == 2) {
            c17771.f58350 = true;
            ListView listViewMo39127 = c17771.f58346.mo39127();
            C17359.requireNonNull(listViewMo39127);
            listViewMo39127.setSelector(new ColorDrawable(0));
            c17771.m41604();
            C21576.m49062(500L, new RunnableC1444(3, listViewMo39127));
            return;
        }
        if (i3 == 3) {
            c17771.getContext().startActivity(new Intent(c17771.getContext(), (Class<?>) ActivityC22993.class));
            c17771.f58346.dismiss();
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new IllegalArgumentException();
            }
            C11804 c11804 = new C11804(viewOnClickListenerC25231, (AbstractActivityC17204) C3200.m10534(c17771.getContext()));
            c11804.m22945(R.string.MT_Protector);
            c11804.m22935(R.string.MT_Protector);
            c11804.m22933(C21576.m49088(R.string.MT_Protector));
            c11804.m22948(2);
            c11804.m22942(2);
            c11804.m22918();
            c11804.m22955(true);
        }
    }
}
