package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.ۗۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3217 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f10484;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC12166 f10485;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C3217(ViewOnClickListenerC12166 viewOnClickListenerC12166) {
        this.f10485 = viewOnClickListenerC12166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10559(String str) {
        this.f10484 = str;
        m10558();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10558() {
        String str = this.f10484;
        ViewOnClickListenerC12166 viewOnClickListenerC12166 = this.f10485;
        if (str == null || str.isEmpty()) {
            ((ArrayList) viewOnClickListenerC12166.f39116).clear();
            ((ArrayList) viewOnClickListenerC12166.f39116).addAll(viewOnClickListenerC12166.f39121);
            ((ArrayList) viewOnClickListenerC12166.f39115).clear();
            ((ArrayList) viewOnClickListenerC12166.f39115).addAll(viewOnClickListenerC12166.f39105);
            notifyDataSetChanged();
            return;
        }
        ((ArrayList) viewOnClickListenerC12166.f39115).clear();
        ((ArrayList) viewOnClickListenerC12166.f39116).clear();
        try {
            String str2 = this.f10484;
            for (Object obj : viewOnClickListenerC12166.f39105) {
                if (ViewOnClickListenerC12166.m30382(viewOnClickListenerC12166, obj, str2)) {
                    ((ArrayList) viewOnClickListenerC12166.f39115).add(obj);
                }
            }
            for (C7449 c7449 : viewOnClickListenerC12166.f39121) {
                if (C24276.m54287(c7449.m20407(), str2)) {
                    ((ArrayList) viewOnClickListenerC12166.f39116).add(c7449);
                }
            }
        } catch (ConcurrentModificationException unused) {
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ViewOnClickListenerC12166 viewOnClickListenerC12166 = this.f10485;
        return ((ArrayList) (viewOnClickListenerC12166.f39119 ? viewOnClickListenerC12166.f39116 : viewOnClickListenerC12166.f39115)).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ViewOnClickListenerC12166 viewOnClickListenerC12166 = this.f10485;
        return ((ArrayList) (viewOnClickListenerC12166.f39119 ? viewOnClickListenerC12166.f39116 : viewOnClickListenerC12166.f39115)).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C20371 c20371;
        if (view != null) {
            c20371 = (C20371) view.getTag();
        } else {
            view = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c20371 = new C20371();
            c20371.f65330 = (TextView) view.findViewById(R.id.textView);
            c20371.f65329 = (TextView) view.findViewById(R.id.textView2);
            c20371.f65331 = (ImageView) view.findViewById(R.id.icon);
            view.setTag(c20371);
        }
        ViewOnClickListenerC12166 viewOnClickListenerC12166 = this.f10485;
        if (viewOnClickListenerC12166.f39119) {
            C7449 c7449 = (C7449) ((ArrayList) viewOnClickListenerC12166.f39116).get(i);
            if (c7449 == viewOnClickListenerC12166.f39106) {
                view.setBackgroundColor(C3296.f10761);
            } else {
                view.setBackgroundColor(0);
            }
            c20371.f65331.setImageBitmap(viewOnClickListenerC12166.f39108);
            c20371.f65330.setText(C18969.m44060(200, c7449.m20407().replace('\n', ' ').replace('\r', ' ')));
            c20371.f65330.setSingleLine(false);
            c20371.f65329.setVisibility(8);
        } else {
            Object obj = ((ArrayList) viewOnClickListenerC12166.f39115).get(i);
            if (obj == viewOnClickListenerC12166.f39122.mo14424()) {
                view.setBackgroundColor(C3296.f10761);
            } else {
                view.setBackgroundColor(0);
            }
            c20371.f65330.setSingleLine(true);
            c20371.f65329.setVisibility(0);
            if (obj instanceof C14160) {
                C14160 c14160 = (C14160) obj;
                c20371.f65331.setImageBitmap(viewOnClickListenerC12166.f39124);
                c20371.f65330.setText(C18969.m44060(100, c14160.m34388()));
                c20371.f65329.setText(C18969.m44060(200, c14160.m34389()));
            } else if (obj instanceof C1483) {
                C1483 c1483 = (C1483) obj;
                c20371.f65331.setImageBitmap(viewOnClickListenerC12166.f39110);
                c20371.f65330.setText(C18969.m44060(100, c1483.m5284()));
                c20371.f65329.setText(C18969.m44060(200, c1483.m5277()));
            } else {
                C9685 c9685 = (C9685) obj;
                c20371.f65331.setImageBitmap(viewOnClickListenerC12166.f39117);
                c20371.f65330.setText(C18969.m44060(100, c9685.m25271()));
                c20371.f65329.setText(C18969.m44060(200, c9685.m25272()));
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = viewOnClickListenerC12166.f39125.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
