package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.ܺۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15725 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f51021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0201 f51022;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C15725(ViewOnClickListenerC0201 viewOnClickListenerC0201) {
        this.f51022 = viewOnClickListenerC0201;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37451(String str) {
        this.f51021 = str;
        m37450();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37450() {
        String str = this.f51021;
        ViewOnClickListenerC0201 viewOnClickListenerC0201 = this.f51022;
        if (str == null || str.isEmpty()) {
            ((ArrayList) viewOnClickListenerC0201.f1338).clear();
            ((ArrayList) viewOnClickListenerC0201.f1338).addAll(viewOnClickListenerC0201.f1354);
            ((ArrayList) viewOnClickListenerC0201.f1347).clear();
            ((ArrayList) viewOnClickListenerC0201.f1347).addAll(viewOnClickListenerC0201.f1353);
            notifyDataSetChanged();
            return;
        }
        ((ArrayList) viewOnClickListenerC0201.f1347).clear();
        ((ArrayList) viewOnClickListenerC0201.f1338).clear();
        try {
            String str2 = this.f51021;
            for (Object obj : viewOnClickListenerC0201.f1353) {
                if (ViewOnClickListenerC0201.m1489(viewOnClickListenerC0201, obj, str2)) {
                    ((ArrayList) viewOnClickListenerC0201.f1347).add(obj);
                }
            }
            for (C6799 c6799 : viewOnClickListenerC0201.f1354) {
                if (C6851.m18463((CharSequence) c6799.m18401(), (CharSequence) str2)) {
                    ((ArrayList) viewOnClickListenerC0201.f1338).add(c6799);
                }
            }
        } catch (ConcurrentModificationException unused) {
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ViewOnClickListenerC0201 viewOnClickListenerC0201 = this.f51022;
        return ((ArrayList) (viewOnClickListenerC0201.f1356 ? viewOnClickListenerC0201.f1338 : viewOnClickListenerC0201.f1347)).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ViewOnClickListenerC0201 viewOnClickListenerC0201 = this.f51022;
        return ((ArrayList) (viewOnClickListenerC0201.f1356 ? viewOnClickListenerC0201.f1338 : viewOnClickListenerC0201.f1347)).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C19958 c19958;
        if (view != null) {
            c19958 = (C19958) view.getTag();
        } else {
            view = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c19958 = new C19958();
            c19958.f63917 = (TextView) view.findViewById(R.id.textView);
            c19958.f63916 = (TextView) view.findViewById(R.id.textView2);
            c19958.f63918 = (ImageView) view.findViewById(R.id.icon);
            view.setTag(c19958);
        }
        ViewOnClickListenerC0201 viewOnClickListenerC0201 = this.f51022;
        if (viewOnClickListenerC0201.f1356) {
            C6799 c6799 = (C6799) ((ArrayList) viewOnClickListenerC0201.f1338).get(i);
            if (c6799 == viewOnClickListenerC0201.f1346) {
                view.setBackgroundColor(C20368.f65992);
            } else {
                view.setBackgroundColor(0);
            }
            c19958.f63918.setImageBitmap(viewOnClickListenerC0201.f1342);
            c19958.f63917.setText(C13012.m32189(200, c6799.m18401().replace('\n', ' ').replace('\r', ' ')));
            c19958.f63917.setSingleLine(false);
            c19958.f63916.setVisibility(8);
        } else {
            Object obj = ((ArrayList) viewOnClickListenerC0201.f1347).get(i);
            if (obj == viewOnClickListenerC0201.f1343.mo10751()) {
                view.setBackgroundColor(C20368.f65992);
            } else {
                view.setBackgroundColor(0);
            }
            c19958.f63917.setSingleLine(true);
            c19958.f63916.setVisibility(0);
            if (obj instanceof C23028) {
                C23028 c23028 = (C23028) obj;
                c19958.f63918.setImageBitmap(viewOnClickListenerC0201.f1350);
                c19958.f63917.setText(C13012.m32189(100, c23028.m50965()));
                c19958.f63916.setText(C13012.m32189(200, c23028.m50962()));
            } else if (obj instanceof C22322) {
                C22322 c22322 = (C22322) obj;
                c19958.f63918.setImageBitmap(viewOnClickListenerC0201.f1345);
                c19958.f63917.setText(C13012.m32189(100, c22322.m49491()));
                c19958.f63916.setText(C13012.m32189(200, c22322.m49492()));
            } else {
                C1154 c1154 = (C1154) obj;
                c19958.f63918.setImageBitmap(viewOnClickListenerC0201.f1341);
                c19958.f63917.setText(C13012.m32189(100, c1154.m4250()));
                c19958.f63916.setText(C13012.m32189(200, c1154.m4253()));
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = viewOnClickListenerC0201.f1340.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
