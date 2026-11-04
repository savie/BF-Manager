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

/* JADX INFO: renamed from: l.۫ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13249 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15486 f42334;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f42335;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2063 f42336;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC12508 f42338;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f42337 = new ForegroundColorSpan(C3296.f10738);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f42340 = new ForegroundColorSpan(C3296.f10738);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public RelativeSizeSpan[] f42339 = {new RelativeSizeSpan(0.92f), new RelativeSizeSpan(0.84f), new RelativeSizeSpan(0.76f), new RelativeSizeSpan(0.68f), new RelativeSizeSpan(0.6f)};

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C13249(ViewOnClickListenerC2063 viewOnClickListenerC2063, ViewOnClickListenerC12508 viewOnClickListenerC12508) {
        this.f42336 = viewOnClickListenerC2063;
        this.f42338 = viewOnClickListenerC12508;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f42335;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f42335.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeSizeSpan[] relativeSizeSpanArr;
        if (view == null) {
            view = LayoutInflater.from(this.f42338).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        SpannableString spannableString = (SpannableString) this.f42335.get(i);
        RelativeSizeSpan[] relativeSizeSpanArr2 = (RelativeSizeSpan[]) spannableString.getSpans(0, spannableString.length(), RelativeSizeSpan.class);
        if (relativeSizeSpanArr2 != null && relativeSizeSpanArr2.length > 0) {
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr2) {
                spannableString.removeSpan(relativeSizeSpan);
            }
        }
        if (this.f42334.f50412 > 0) {
            int length = spannableString.length();
            int i2 = this.f42334.f50412;
            if (length >= i2) {
                int i3 = 0;
                while (true) {
                    relativeSizeSpanArr = this.f42339;
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
            if (spannableString.length() / 2 < this.f42334.f50412) {
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
        if (this.f42334 == null) {
            this.f42334 = new C15486(this);
        }
        return this.f42334;
    }
}
