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

/* JADX INFO: renamed from: l.ۖۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2647 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f8454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f8455 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8456;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8457;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C2647(String str) {
        this.f8454 = str;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8455.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView c5752 = (TextView) view;
        if (c5752 == null) {
            c5752 = new C5752(viewGroup.getContext());
            c5752.setTextSize(15.0f);
            c5752.setTextColor(C3296.f10751);
            int i2 = this.f8457;
            int i3 = this.f8456;
            c5752.setPadding(i2, i3, i2, i3);
            c5752.setLineSpacing(0.0f, 1.05f);
        }
        C10676 c10676 = (C10676) this.f8455.get(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c10676.m27217()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f8454).append((CharSequence) "://").append((CharSequence) c10676.m27215()).append((CharSequence) ":").append((CharSequence) String.valueOf(c10676.m27216()));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C6907.m19161(12.0f)), length, length2, 33);
        c5752.setText(spannableStringBuilder);
        return c5752;
    }
}
