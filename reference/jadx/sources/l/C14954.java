package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14954 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48778 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f48779;

    public C14954(C7898 c7898) {
        this.f48779 = c7898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35895() {
        this.f48778 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM35894 = m35894();
        if (i2 < iM35894) {
            return 1;
        }
        return i2 - iM35894 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7898 c7898 = this.f48779;
        if (i == 0) {
            return new C12837(LayoutInflater.from(c7898.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC22715(c7898, LayoutInflater.from(c7898.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC18481(c7898, LayoutInflater.from(c7898.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, @SuppressLint({C17492.TAG}) int i) {
        if (i == 0) {
            ((C12837) abstractC12554).f42711.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM35894 = m35894();
        C7898 c7898 = this.f48779;
        if (i2 >= iM35894) {
            int i3 = i2 - iM35894;
            if (i3 == 0) {
                C12837 c12837 = (C12837) abstractC12554;
                if (c7898.f25964) {
                    c12837.f42711.setText(c7898.getString(R.string.MT_Protector, c7898.f25963));
                    return;
                } else {
                    c12837.f42711.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC18481 viewOnClickListenerC18481 = (ViewOnClickListenerC18481) abstractC12554;
            List list = c7898.f25968;
            if (c7898.f25964) {
                i4 = c7898.f25965[i4];
            }
            C0841 c0841 = (C0841) list.get(i4);
            viewOnClickListenerC18481.f58898 = c0841;
            TextView textView = viewOnClickListenerC18481.f58899;
            textView.setText(C13012.m32189(150, c0841.m3454()));
            if (c0841.f3484) {
                textView.setTextColor(C20368.f65973);
                return;
            } else {
                textView.setTextColor(C20368.f65976);
                return;
            }
        }
        ViewOnClickListenerC22715 viewOnClickListenerC22715 = (ViewOnClickListenerC22715) abstractC12554;
        viewOnClickListenerC22715.f73996 = i2;
        ImageView imageView = viewOnClickListenerC22715.f74000;
        TextView textView2 = viewOnClickListenerC22715.f73997;
        if (c7898.f25964 && c7898.f25969 == 0 && i2 == 2) {
            viewOnClickListenerC22715.f73996 = 3;
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
            if (c7898.f25964) {
                textView2.setText(R.string.MT_Protector);
                return;
            } else {
                textView2.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i2 != 3) {
            throw new RuntimeException(C8479.m22141(i2, "MenuType = "));
        }
        if (this.f48778) {
            this.f48778 = false;
            C19764 c19764 = new C19764(C20368.f65992);
            c19764.m44952(1000);
            View view = viewOnClickListenerC22715.f73998;
            int i5 = C5031.f17539;
            view.setBackground(c19764);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        C7898 c7898 = this.f48779;
        if (c7898.f25968 == null) {
            return 0;
        }
        if (c7898.f25968.isEmpty()) {
            return m35894() + 1;
        }
        return m35894() + 2 + (c7898.f25964 ? c7898.f25969 : c7898.f25968.size());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m35894() {
        C7898 c7898 = this.f48779;
        int i = 1;
        if (c7898.f25968 == null || c7898.f25968.isEmpty()) {
            return 1;
        }
        if (c7898.f25964 && c7898.f25969 == 0) {
            i = 0;
        }
        return !c7898.f25961 ? i + 2 : i + 3;
    }
}
