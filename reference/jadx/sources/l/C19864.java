package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19864 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63895 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f63896;

    public C19864(C1965 c1965) {
        this.f63896 = c1965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45721() {
        this.f63895 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM45720 = m45720();
        if (i2 < iM45720) {
            return 1;
        }
        return i2 - iM45720 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1965 c1965 = this.f63896;
        if (i == 0) {
            return new C4948(LayoutInflater.from(c1965.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC22848(c1965, LayoutInflater.from(c1965.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC5694(c1965, LayoutInflater.from(c1965.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, @SuppressLint({C25227.TAG}) int i) {
        if (i == 0) {
            ((C4948) abstractC11800).f17237.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM45720 = m45720();
        C1965 c1965 = this.f63896;
        if (i2 >= iM45720) {
            int i3 = i2 - iM45720;
            if (i3 == 0) {
                C4948 c4948 = (C4948) abstractC11800;
                if (c1965.f6589) {
                    c4948.f17237.setText(c1965.getString(R.string.MT_Protector, c1965.f6594));
                    return;
                } else {
                    c4948.f17237.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC5694 viewOnClickListenerC5694 = (ViewOnClickListenerC5694) abstractC11800;
            List list = c1965.f6596;
            if (c1965.f6589) {
                i4 = c1965.f6591[i4];
            }
            C13591 c13591 = (C13591) list.get(i4);
            viewOnClickListenerC5694.f19664 = c13591;
            TextView textView = viewOnClickListenerC5694.f19666;
            textView.setText(C18969.m44060(150, c13591.m33319()));
            if (c13591.f43170) {
                textView.setTextColor(C3296.f10768);
                return;
            } else {
                textView.setTextColor(C3296.f10751);
                return;
            }
        }
        ViewOnClickListenerC22848 viewOnClickListenerC22848 = (ViewOnClickListenerC22848) abstractC11800;
        viewOnClickListenerC22848.f74228 = i2;
        ImageView imageView = viewOnClickListenerC22848.f74229;
        TextView textView2 = viewOnClickListenerC22848.f74226;
        if (c1965.f6589 && c1965.f6597 == 0 && i2 == 2) {
            viewOnClickListenerC22848.f74228 = 3;
            i2 = 3;
        }
        if (i2 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView2.setText(R.string.MT_Protector);
            return;
        }
        if (i2 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView2.setText(R.string.MT_Protector);
            return;
        }
        if (i2 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            if (c1965.f6589) {
                textView2.setText(R.string.MT_Protector);
                return;
            } else {
                textView2.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i2 != 3) {
            throw new RuntimeException(C13645.m33382(i2, "MenuType = "));
        }
        if (this.f63895) {
            this.f63895 = false;
            C20163 c20163 = new C20163(C3296.f10761);
            c20163.m46374(1000);
            View view = viewOnClickListenerC22848.f74227;
            int i5 = C22666.f73603;
            view.setBackground(c20163);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        C1965 c1965 = this.f63896;
        if (c1965.f6596 == null) {
            return 0;
        }
        if (c1965.f6596.isEmpty()) {
            return m45720() + 1;
        }
        return m45720() + 2 + (c1965.f6589 ? c1965.f6597 : c1965.f6596.size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m45720() {
        C1965 c1965 = this.f63896;
        int i = 1;
        if (c1965.f6596 == null || c1965.f6596.isEmpty()) {
            return 1;
        }
        if (c1965.f6589 && c1965.f6597 == 0) {
            i = 0;
        }
        return !c1965.f6598 ? i + 2 : i + 3;
    }
}
