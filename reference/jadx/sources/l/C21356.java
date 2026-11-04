package l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21356 extends C14941 implements InterfaceC19417 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18372 f68021;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f68023 = C6907.m19160(17.0f);

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f68022 = C6907.m19160(20.0f);

    @Override // l.C14941
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo35319() {
        return true;
    }

    public C21356(C18372 c18372) {
        this.f68021 = c18372;
        m35947((InterfaceC19417) this);
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ */
    public final int mo35314(int i) {
        return i == 0 ? this.f68022 : this.f48787 * i;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private int m48577() {
        C18372 c18372 = this.f68021;
        if (c18372.f59864.isEmpty()) {
            return 1;
        }
        int i = ((C1878) c18372.f59864.peek()).m6428() > 0 ? 3 : 1;
        if (c18372.f59864.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48578() {
        int iM48577 = m48577();
        if (iM48577 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM48577 + 2);
        }
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemCount() {
        if (this.f68021.f59864.isEmpty()) {
            return 2;
        }
        return m48577() + 2 + super.getItemCount();
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM48577 = m48577();
        if (i2 < iM48577) {
            return 2;
        }
        int i3 = i2 - iM48577;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C14941, l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C23594(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C23594(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC24340(this.f68021, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.C14941, l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        int i2;
        if (i == 0) {
            ((C23594) abstractC11800).f76599.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM48577 = m48577();
        C18372 c18372 = this.f68021;
        if (i4 >= iM48577) {
            int i5 = i4 - iM48577;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC11800, i5 - 1);
                return;
            }
            C23594 c23594 = (C23594) abstractC11800;
            final C1878 c1878 = (C1878) c18372.f59864.peek();
            c23594.f76599.setText(c18372.getString(R.string.MT_Protector, Integer.valueOf(c1878.m6428())) + " - " + C18969.m44060(300, c1878.m6427()));
            c23594.f76598.setOnClickListener(new View.OnClickListener() { // from class: l.ۘܰۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C21356 c21356 = this.f15353;
                    C18452 c18452 = new C18452(c21356.f68021.requireContext(), view, 0);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    final C1878 c1879 = c1878;
                    c18452.m42994(new InterfaceC21436() { // from class: l.ܰܰۧ
                        @Override // l.InterfaceC21436
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C21356.m48576(c21356, c1879, menuItem);
                            return true;
                        }
                    });
                    c18452.mo21878();
                }
            });
            return;
        }
        ViewOnClickListenerC24340 viewOnClickListenerC24340 = (ViewOnClickListenerC24340) abstractC11800;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c18372.f59864.isEmpty()) {
            if (((C1878) c18372.f59864.peek()).m6428() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c18372.f59864.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC24340.f78953 = i3;
        TextView textView = viewOnClickListenerC24340.f78950;
        ImageView imageView = viewOnClickListenerC24340.f78951;
        if (i3 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (i3 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (i3 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        } else if (i3 == 3) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        } else {
            if (i3 != 4) {
                throw new RuntimeException(C13645.m33382(i3, "MenuType = "));
            }
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48576(C21356 c21356, C1878 c1878, MenuItem menuItem) {
        C18372 c18372 = c21356.f68021;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c18372.f59865.m35953();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c18372.f59865.m35950(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c18372.f59865.m35953();
            c18372.f59865.m35950(false);
        } else if (itemId == R.string.MT_Protector) {
            C21576.m49067((CharSequence) C1170.stream(c1878.m6424()).sorted().map(new C19705(3)).collect(C2025.joining("\n")));
        }
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۚ */
    public final int mo28663() {
        return m48577() + 2;
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ᩷ */
    public final int mo35320(String str) {
        C5607 c5607M6425 = ((C1878) this.f68021.f59864.peek()).m6425(str);
        if (c5607M6425 == null) {
            return 0;
        }
        return c5607M6425.f19434.size();
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11800 mo35315(ViewGroup viewGroup) {
        C18372 c18372 = this.f68021;
        View viewInflate = LayoutInflater.from(c18372.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f48787 + this.f68023;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC16134(c18372, viewInflate);
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ */
    public final void mo35317(AbstractC11800 abstractC11800, String str, int i) {
        ViewOnClickListenerC16134 viewOnClickListenerC16134 = (ViewOnClickListenerC16134) abstractC11800;
        C18372 c18372 = this.f68021;
        C5607 c5607M6425 = ((C1878) c18372.f59864.peek()).m6425(str);
        C15301 c15301 = (C15301) c5607M6425.f19434.get(i);
        SpannableString spannableString = new SpannableString(c15301.f50021);
        spannableString.setSpan(new BackgroundColorSpan(C3296.f10738 & (-1593835521)), c15301.f50016, c15301.f50013, 33);
        viewOnClickListenerC16134.f52417.setText(spannableString);
        viewOnClickListenerC16134.f52419 = c5607M6425;
        viewOnClickListenerC16134.f52420 = c15301;
        viewOnClickListenerC16134.f52421 = i;
        TextPaint paint = viewOnClickListenerC16134.f52417.getPaint();
        if (c18372.f59861 == null || c18372.f59861.m46617(str)) {
            if (((C1878) c18372.f59864.peek()).f6307.contains(str + " " + i)) {
                viewOnClickListenerC16134.f52417.setTextColor(C3296.f10779);
                viewOnClickListenerC16134.f52417.setAlpha(0.8f);
            } else {
                viewOnClickListenerC16134.f52417.setTextColor(C3296.f10751);
                viewOnClickListenerC16134.f52417.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC16134.f52417.setTextColor(C3296.f10779);
        viewOnClickListenerC16134.f52417.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // l.InterfaceC19417
    /* JADX INFO: renamed from: ۙ */
    public final void mo35316(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C18372 c18372 = this.f68021;
        if (c18372.f59861 == null || c18372.f59861.m46617(str)) {
            if (((C1878) c18372.f59864.peek()).f6307.contains(str)) {
                textView.setTextColor(C3296.f10779);
                textView.setAlpha(0.8f);
            } else {
                textView.setTextColor(C3296.f10751);
                textView.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        textView.setTextColor(C3296.f10779);
        textView.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }
}
