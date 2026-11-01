package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩵۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19479 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62698 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f62699;

    public C19479(C20890 c20890) {
        this.f62699 = c20890;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44542() {
        this.f62698 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM44541 = m44541();
        if (i2 < iM44541) {
            return 1;
        }
        return i2 - iM44541 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20890 c20890 = this.f62699;
        if (i == 0) {
            return new C21595(LayoutInflater.from(c20890.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC8190(c20890, LayoutInflater.from(c20890.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC7484(c20890, LayoutInflater.from(c20890.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, @SuppressLint({C17492.TAG}) int i) {
        if (i == 0) {
            ((C21595) abstractC12554).f70058.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM44541 = m44541();
        C20890 c20890 = this.f62699;
        if (i2 >= iM44541) {
            int i3 = i2 - iM44541;
            if (i3 == 0) {
                C21595 c21595 = (C21595) abstractC12554;
                if (c20890.f67867) {
                    c21595.f70058.setText(c20890.getString(R.string.MT_Protector, c20890.f67866));
                    return;
                } else {
                    c21595.f70058.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC7484 viewOnClickListenerC7484 = (ViewOnClickListenerC7484) abstractC12554;
            List list = c20890.f67864;
            if (c20890.f67867) {
                i4 = c20890.f67868[i4];
            }
            C15246 c15246 = (C15246) list.get(i4);
            viewOnClickListenerC7484.f24931 = c15246;
            TextView textView = viewOnClickListenerC7484.f24932;
            textView.setText(C13012.m32189(150, c15246.m36517()));
            if (c15246.f49711) {
                textView.setTextColor(C20368.f65973);
                return;
            } else {
                textView.setTextColor(C20368.f65976);
                return;
            }
        }
        ViewOnClickListenerC8190 viewOnClickListenerC8190 = (ViewOnClickListenerC8190) abstractC12554;
        viewOnClickListenerC8190.f28545 = i2;
        ImageView imageView = viewOnClickListenerC8190.f28549;
        TextView textView2 = viewOnClickListenerC8190.f28546;
        if (c20890.f67867 && c20890.f67872 == 0 && i2 == 2) {
            viewOnClickListenerC8190.f28545 = 3;
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
            if (c20890.f67867) {
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
        if (this.f62698) {
            this.f62698 = false;
            C19764 c19764 = new C19764(C20368.f65992);
            c19764.m44952(1000);
            View view = viewOnClickListenerC8190.f28547;
            int i5 = C5031.f17539;
            view.setBackground(c19764);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        C20890 c20890 = this.f62699;
        if (c20890.f67864 == null) {
            return 0;
        }
        if (c20890.f67864.isEmpty()) {
            return m44541() + 1;
        }
        return m44541() + 2 + (c20890.f67867 ? c20890.f67872 : c20890.f67864.size());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m44541() {
        C20890 c20890 = this.f62699;
        int i = 1;
        if (c20890.f67864 == null || c20890.f67864.isEmpty()) {
            return 1;
        }
        if (c20890.f67867 && c20890.f67872 == 0) {
            i = 0;
        }
        return !c20890.f67873 ? i + 2 : i + 3;
    }
}
