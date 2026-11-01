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

/* JADX INFO: renamed from: l.ۚۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5098 extends C9886 implements InterfaceC2207 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22032 f17770;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f17772 = C13932.m33769(17.0f);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f17771 = C13932.m33769(20.0f);

    @Override // l.C9886
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo14208() {
        return true;
    }

    public C5098(C22032 c22032) {
        this.f17770 = c22032;
        m25001((InterfaceC2207) this);
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14202(int i) {
        return i == 0 ? this.f17771 : this.f33750 * i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m14201() {
        C22032 c22032 = this.f17770;
        if (c22032.f71403.isEmpty()) {
            return 1;
        }
        int i = ((C10617) c22032.f71403.peek()).m26801() > 0 ? 3 : 1;
        if (c22032.f71403.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14205() {
        int iM14201 = m14201();
        if (iM14201 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM14201 + 2);
        }
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemCount() {
        if (this.f17770.f71403.isEmpty()) {
            return 2;
        }
        return m14201() + 2 + super.getItemCount();
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM14201 = m14201();
        if (i2 < iM14201) {
            return 2;
        }
        int i3 = i2 - iM14201;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C9886, l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C14541(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C14541(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC13566(this.f17770, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.C9886, l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int i2;
        if (i == 0) {
            ((C14541) abstractC12554).f47615.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM14201 = m14201();
        C22032 c22032 = this.f17770;
        if (i4 >= iM14201) {
            int i5 = i4 - iM14201;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC12554, i5 - 1);
                return;
            }
            C14541 c14541 = (C14541) abstractC12554;
            final C10617 c10617 = (C10617) c22032.f71403.peek();
            c14541.f47615.setText(c22032.getString(R.string.MT_Protector, Integer.valueOf(c10617.m26801())) + " - " + C13012.m32189(300, c10617.m26800()));
            c14541.f47614.setOnClickListener(new View.OnClickListener() { // from class: l.ۨۘۜ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C5098 c5098 = this.f38527;
                    C16195 c16195 = new C16195(c5098.f17770.requireContext(), view, 0);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    final C10617 c10618 = c10617;
                    c16195.m38296(new InterfaceC21133() { // from class: l.ۖۘۜ
                        @Override // l.InterfaceC21133
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C5098.m14200(c5098, c10618, menuItem);
                            return true;
                        }
                    });
                    c16195.m38297();
                }
            });
            return;
        }
        ViewOnClickListenerC13566 viewOnClickListenerC13566 = (ViewOnClickListenerC13566) abstractC12554;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c22032.f71403.isEmpty()) {
            if (((C10617) c22032.f71403.peek()).m26801() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c22032.f71403.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC13566.f44756 = i3;
        TextView textView = viewOnClickListenerC13566.f44755;
        ImageView imageView = viewOnClickListenerC13566.f44754;
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
                throw new RuntimeException(C8479.m22141(i3, "MenuType = "));
            }
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14200(C5098 c5098, C10617 c10617, MenuItem menuItem) {
        C22032 c22032 = c5098.f17770;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c22032.f71406.m25014();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c22032.f71406.m25008(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c22032.f71406.m25014();
            c22032.f71406.m25008(false);
        } else if (itemId == R.string.MT_Protector) {
            C16737.m39272((CharSequence) C9030.stream(c10617.m26797()).sorted().map(new C12291(1)).collect(C1890.joining("\n")));
        }
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo14206() {
        return m14201() + 2;
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo14207(String str) {
        C9206 c9206M26798 = ((C10617) this.f17770.f71403.peek()).m26798(str);
        if (c9206M26798 == null) {
            return 0;
        }
        return c9206M26798.f31291.size();
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12554 mo14203(ViewGroup viewGroup) {
        C22032 c22032 = this.f17770;
        View viewInflate = LayoutInflater.from(c22032.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f33750 + this.f17772;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC23713(c22032, viewInflate);
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14204(AbstractC12554 abstractC12554, String str, int i) {
        ViewOnClickListenerC23713 viewOnClickListenerC23713 = (ViewOnClickListenerC23713) abstractC12554;
        C22032 c22032 = this.f17770;
        C9206 c9206M26798 = ((C10617) c22032.f71403.peek()).m26798(str);
        C8500 c8500 = (C8500) c9206M26798.f31291.get(i);
        SpannableString spannableString = new SpannableString(c8500.f29472);
        spannableString.setSpan(new BackgroundColorSpan(C20368.f65970 & (-1593835521)), c8500.f29468, c8500.f29471, 33);
        viewOnClickListenerC23713.f76743.setText(spannableString);
        viewOnClickListenerC23713.f76742 = c9206M26798;
        viewOnClickListenerC23713.f76740 = c8500;
        viewOnClickListenerC23713.f76744 = i;
        TextPaint paint = viewOnClickListenerC23713.f76743.getPaint();
        if (c22032.f71407 == null || c22032.f71407.m16563(str)) {
            if (((C10617) c22032.f71403.peek()).f36281.contains(str + " " + i)) {
                viewOnClickListenerC23713.f76743.setTextColor(C20368.f66009);
                viewOnClickListenerC23713.f76743.setAlpha(0.8f);
            } else {
                viewOnClickListenerC23713.f76743.setTextColor(C20368.f65976);
                viewOnClickListenerC23713.f76743.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC23713.f76743.setTextColor(C20368.f66009);
        viewOnClickListenerC23713.f76743.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // l.InterfaceC2207
    /* JADX INFO: renamed from: ۙ */
    public final void mo6817(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C22032 c22032 = this.f17770;
        if (c22032.f71407 == null || c22032.f71407.m16563(str)) {
            if (((C10617) c22032.f71403.peek()).f36281.contains(str)) {
                textView.setTextColor(C20368.f66009);
                textView.setAlpha(0.8f);
            } else {
                textView.setTextColor(C20368.f65976);
                textView.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        textView.setTextColor(C20368.f66009);
        textView.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }
}
