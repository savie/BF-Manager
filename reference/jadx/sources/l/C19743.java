package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19743 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f63444;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C19743(C9160 c9160) {
        this.f63444 = c9160;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C9160 c9160 = this.f63444;
        if (!c9160.f31140) {
            return Math.min(100, c9160.f31139.m26736()) + (c9160.f31139.m26736() > 10 ? 1 : 0);
        }
        if (c9160.f31138) {
            if (c9160.f31144.isEmpty()) {
                return 2;
            }
            return c9160.f31144.size() + 1;
        }
        if (c9160.f31139.m26736() == 0) {
            return 2;
        }
        return Math.min(100, c9160.f31139.m26736()) + 1 + (c9160.f31139.m26736() > 10 ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC8454 viewOnClickListenerC8454;
        C9160 c9160 = this.f63444;
        if (view == null) {
            view = LayoutInflater.from(c9160.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
            viewOnClickListenerC8454 = new ViewOnClickListenerC8454(c9160, view);
            view.setTag(viewOnClickListenerC8454);
        } else {
            viewOnClickListenerC8454 = (ViewOnClickListenerC8454) view.getTag();
        }
        if (c9160.f31138) {
            if (c9160.f31144.isEmpty() && i == 0) {
                String strM39288 = C16737.m39288(R.string.MT_Protector);
                viewOnClickListenerC8454.f29332 = 4;
                viewOnClickListenerC8454.f29331.setVisibility(4);
                TextView textView = viewOnClickListenerC8454.f29328;
                textView.setText(strM39288);
                textView.setTextColor(C20368.f66009);
                return view;
            }
            if (i >= c9160.f31144.size()) {
                viewOnClickListenerC8454.m22113(3);
                return view;
            }
            C3326 c3326 = (C3326) c9160.f31144.get(i);
            viewOnClickListenerC8454.f29332 = 1;
            viewOnClickListenerC8454.f29330 = i;
            viewOnClickListenerC8454.f29334 = c3326;
            viewOnClickListenerC8454.f29331.setVisibility(4);
            String strM9858 = c3326.m9858();
            TextView textView2 = viewOnClickListenerC8454.f29328;
            textView2.setText(strM9858);
            textView2.setTextColor(C20368.f65976);
            return view;
        }
        if (!c9160.f31140) {
            if (i >= 10 && i == Math.min(100, c9160.f31139.m26736())) {
                viewOnClickListenerC8454.m22113(5);
                return view;
            }
            viewOnClickListenerC8454.m22114(i, c9160.f31139.m26731(i));
            return view;
        }
        if (c9160.f31139.m26736() == 0) {
            if (i == 0) {
                viewOnClickListenerC8454.m22113(2);
                return view;
            }
            String strM39289 = C16737.m39288(R.string.MT_Protector);
            viewOnClickListenerC8454.f29332 = 4;
            viewOnClickListenerC8454.f29331.setVisibility(4);
            TextView textView3 = viewOnClickListenerC8454.f29328;
            textView3.setText(strM39289);
            textView3.setTextColor(C20368.f66009);
            return view;
        }
        if (i == 0) {
            viewOnClickListenerC8454.m22113(2);
            return view;
        }
        int i2 = i - 1;
        if (i2 >= 10 && i2 == Math.min(100, c9160.f31139.m26736())) {
            viewOnClickListenerC8454.m22113(5);
            return view;
        }
        viewOnClickListenerC8454.m22114(i2, c9160.f31139.m26731(i2));
        return view;
    }
}
