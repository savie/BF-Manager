package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19908 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64058 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f64059;

    public C19908(C2009 c2009) {
        this.f64059 = c2009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45840() {
        this.f64058 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM45839 = m45839();
        if (i2 < iM45839) {
            return 1;
        }
        return i2 - iM45839 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C2009 c2009 = this.f64059;
        if (i == 0) {
            return new C4992(LayoutInflater.from(c2009.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC22892(c2009, LayoutInflater.from(c2009.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC5738(c2009, LayoutInflater.from(c2009.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, @SuppressLint({C25227.TAG}) int i) {
        if (i == 0) {
            ((C4992) abstractC11800).f17351.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM45839 = m45839();
        C2009 c2009 = this.f64059;
        if (i2 >= iM45839) {
            int i3 = i2 - iM45839;
            if (i3 == 0) {
                C4992 c4992 = (C4992) abstractC11800;
                if (c2009.f6683) {
                    c4992.f17351.setText(c2009.getString(R.string.MT_Protector, c2009.f6688));
                    return;
                } else {
                    c4992.f17351.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC5738 viewOnClickListenerC5738 = (ViewOnClickListenerC5738) abstractC11800;
            List list = c2009.f6682;
            if (c2009.f6683) {
                i4 = c2009.f6685[i4];
            }
            C13984 c13984 = (C13984) list.get(i4);
            viewOnClickListenerC5738.f19754 = c13984;
            TextView textView = viewOnClickListenerC5738.f19756;
            textView.setText(C18969.m44060(150, c13984.m34072()));
            if (c13984.f44335) {
                textView.setTextColor(C3296.f10768);
                return;
            } else {
                textView.setTextColor(C3296.f10751);
                return;
            }
        }
        ViewOnClickListenerC22892 viewOnClickListenerC22892 = (ViewOnClickListenerC22892) abstractC11800;
        viewOnClickListenerC22892.f74373 = i2;
        ImageView imageView = viewOnClickListenerC22892.f74374;
        TextView textView2 = viewOnClickListenerC22892.f74371;
        if (c2009.f6683 && c2009.f6691 == 0 && i2 == 2) {
            viewOnClickListenerC22892.f74373 = 3;
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
            if (c2009.f6683) {
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
        if (this.f64058) {
            this.f64058 = false;
            C20163 c20163 = new C20163(C3296.f10761);
            c20163.m46374(1000);
            View view = viewOnClickListenerC22892.f74372;
            int i5 = C22666.f73603;
            view.setBackground(c20163);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        C2009 c2009 = this.f64059;
        if (c2009.f6682 == null) {
            return 0;
        }
        if (c2009.f6682.isEmpty()) {
            return m45839() + 1;
        }
        return m45839() + 2 + (c2009.f6683 ? c2009.f6691 : c2009.f6682.size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m45839() {
        C2009 c2009 = this.f64059;
        int i = 1;
        if (c2009.f6682 == null || c2009.f6682.isEmpty()) {
            return 1;
        }
        if (c2009.f6683 && c2009.f6691 == 0) {
            i = 0;
        }
        return !c2009.f6690 ? i + 2 : i + 3;
    }
}
