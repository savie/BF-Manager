package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4201 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC6361 f15261;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23253 f15262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f15263;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13375 f15265;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f15264 = new ForegroundColorSpan(C20368.f65970);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f15267 = new ForegroundColorSpan(C20368.f65970);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RelativeSizeSpan[] f15266 = {new RelativeSizeSpan(0.92f), new RelativeSizeSpan(0.84f), new RelativeSizeSpan(0.76f), new RelativeSizeSpan(0.68f), new RelativeSizeSpan(0.6f)};

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C4201(ViewOnClickListenerC23253 viewOnClickListenerC23253, ViewOnClickListenerC6361 viewOnClickListenerC6361) {
        this.f15262 = viewOnClickListenerC23253;
        this.f15261 = viewOnClickListenerC6361;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f15263;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f15263.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeSizeSpan[] relativeSizeSpanArr;
        if (view == null) {
            view = LayoutInflater.from(this.f15261).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        SpannableString spannableString = (SpannableString) this.f15263.get(i);
        RelativeSizeSpan[] relativeSizeSpanArr2 = (RelativeSizeSpan[]) spannableString.getSpans(0, spannableString.length(), RelativeSizeSpan.class);
        if (relativeSizeSpanArr2 != null && relativeSizeSpanArr2.length > 0) {
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr2) {
                spannableString.removeSpan(relativeSizeSpan);
            }
        }
        if (this.f15265.f44310 > 0) {
            int length = spannableString.length();
            int i2 = this.f15265.f44310;
            if (length >= i2) {
                int i3 = 0;
                while (true) {
                    relativeSizeSpanArr = this.f15266;
                    if (i3 >= relativeSizeSpanArr.length - 1 || i2 <= 0) {
                        break;
                    }
                    spannableString.setSpan(relativeSizeSpanArr[i3], Math.max(0, i2 - 5), i2, 33);
                    i2 -= 5;
                    i3++;
                }
                if (i2 > 0) {
                    spannableString.setSpan(relativeSizeSpanArr[relativeSizeSpanArr.length - 1], 0, i2, 33);
                }
            }
            if (spannableString.length() / 2 < this.f15265.f44310) {
                textView.setEllipsize(TextUtils.TruncateAt.START);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setText(spannableString);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f15265 == null) {
            this.f15265 = new C13375(this);
        }
        return this.f15265;
    }
}
