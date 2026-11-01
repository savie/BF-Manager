package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes.dex */
public final class C23439 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75870;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f75871 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f75872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75873;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23439(String str) {
        this.f75872 = str;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f75871.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView c22357 = (TextView) view;
        if (c22357 == null) {
            c22357 = new C22357(viewGroup.getContext());
            c22357.setTextSize(15.0f);
            c22357.setTextColor(C20368.f65976);
            int i2 = this.f75873;
            int i3 = this.f75870;
            c22357.setPadding(i2, i3, i2, i3);
            c22357.setLineSpacing(0.0f, 1.05f);
        }
        C13644 c13644 = (C13644) this.f75871.get(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c13644.m33345()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f75872).append((CharSequence) "://").append((CharSequence) c13644.m33343()).append((CharSequence) ":").append((CharSequence) String.valueOf(c13644.m33344()));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13932.m33770(12.0f)), length, length2, 33);
        c22357.setText(spannableStringBuilder);
        return c22357;
    }
}
