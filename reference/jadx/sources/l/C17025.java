package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17025 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17771 f55611;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C17025(C17771 c17771) {
        this.f55611 = c17771;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C17771 c17771 = this.f55611;
        if (!c17771.f58344) {
            return Math.min(100, c17771.f58348.m38619()) + (c17771.f58348.m38619() > 10 ? 1 : 0);
        }
        if (c17771.f58350) {
            if (c17771.f58343.isEmpty()) {
                return 2;
            }
            return c17771.f58343.size() + 1;
        }
        if (c17771.f58348.m38619() == 0) {
            return 2;
        }
        return Math.min(100, c17771.f58348.m38619()) + 1 + (c17771.f58348.m38619() > 10 ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC25231 viewOnClickListenerC25231;
        C17771 c17771 = this.f55611;
        if (view == null) {
            view = LayoutInflater.from(c17771.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
            viewOnClickListenerC25231 = new ViewOnClickListenerC25231(c17771, view);
            view.setTag(viewOnClickListenerC25231);
        } else {
            viewOnClickListenerC25231 = (ViewOnClickListenerC25231) view.getTag();
        }
        if (c17771.f58350) {
            if (c17771.f58343.isEmpty() && i == 0) {
                String strM49088 = C21576.m49088(R.string.MT_Protector);
                viewOnClickListenerC25231.f81490 = 4;
                viewOnClickListenerC25231.f81494.setVisibility(4);
                TextView textView = viewOnClickListenerC25231.f81493;
                textView.setText(strM49088);
                textView.setTextColor(C3296.f10779);
                return view;
            }
            if (i >= c17771.f58343.size()) {
                viewOnClickListenerC25231.m56295(3);
                return view;
            }
            C9984 c9984 = (C9984) c17771.f58343.get(i);
            viewOnClickListenerC25231.f81490 = 1;
            viewOnClickListenerC25231.f81492 = i;
            viewOnClickListenerC25231.f81497 = c9984;
            viewOnClickListenerC25231.f81494.setVisibility(4);
            String strM25828 = c9984.m25828();
            TextView textView2 = viewOnClickListenerC25231.f81493;
            textView2.setText(strM25828);
            textView2.setTextColor(C3296.f10751);
            return view;
        }
        if (!c17771.f58344) {
            if (i >= 10 && i == Math.min(100, c17771.f58348.m38619())) {
                viewOnClickListenerC25231.m56295(5);
                return view;
            }
            viewOnClickListenerC25231.m56296(i, c17771.f58348.m38612(i));
            return view;
        }
        if (c17771.f58348.m38619() == 0) {
            if (i == 0) {
                viewOnClickListenerC25231.m56295(2);
                return view;
            }
            String strM49089 = C21576.m49088(R.string.MT_Protector);
            viewOnClickListenerC25231.f81490 = 4;
            viewOnClickListenerC25231.f81494.setVisibility(4);
            TextView textView3 = viewOnClickListenerC25231.f81493;
            textView3.setText(strM49089);
            textView3.setTextColor(C3296.f10779);
            return view;
        }
        if (i == 0) {
            viewOnClickListenerC25231.m56295(2);
            return view;
        }
        int i2 = i - 1;
        if (i2 >= 10 && i2 == Math.min(100, c17771.f58348.m38619())) {
            viewOnClickListenerC25231.m56295(5);
            return view;
        }
        viewOnClickListenerC25231.m56296(i2, c17771.f58348.m38612(i2));
        return view;
    }
}
