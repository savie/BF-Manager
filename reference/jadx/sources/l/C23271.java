package l;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23271 implements AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C9160.f31137;
        ViewOnClickListenerC8454 viewOnClickListenerC8454 = (ViewOnClickListenerC8454) view.getTag();
        C9160 c9160 = viewOnClickListenerC8454.f29329;
        int i3 = viewOnClickListenerC8454.f29332;
        if (i3 == 0) {
            c9160.f31146.mo16989((CharSequence) viewOnClickListenerC8454.f29333);
            c9160.f31146.mo17029(c9160.f31146.m16842());
            c9160.f31141.dismiss();
            return;
        }
        if (i3 == 1) {
            c9160.f31146.mo16989((CharSequence) viewOnClickListenerC8454.f29334.m9860());
            c9160.f31146.mo17029(c9160.f31146.m16842());
            c9160.f31141.dismiss();
            return;
        }
        if (i3 == 2) {
            c9160.f31138 = true;
            ListView listViewMo17704 = c9160.f31141.mo17704();
            C13638.requireNonNull(listViewMo17704);
            listViewMo17704.setSelector(new ColorDrawable(0));
            c9160.m23511();
            C16737.m39267(500L, new RunnableC10138(3, listViewMo17704));
            return;
        }
        if (i3 == 3) {
            c9160.getContext().startActivity(new Intent(c9160.getContext(), (Class<?>) ActivityC7042.class));
            c9160.f31141.dismiss();
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new IllegalArgumentException();
            }
            C19037 c19037 = new C19037(viewOnClickListenerC8454, (AbstractActivityC12483) C8703.m22527(c9160.getContext()));
            c19037.m40376(R.string.MT_Protector);
            c19037.m40353(R.string.MT_Protector);
            c19037.m40367(C16737.m39288(R.string.MT_Protector));
            c19037.m40350(2);
            c19037.m40375(2);
            c19037.m40340();
            c19037.m40368(true);
        }
    }
}
