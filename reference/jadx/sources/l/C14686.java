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

/* JADX INFO: renamed from: l.ܰܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14686 extends C14941 implements InterfaceC19417 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21400 f48002;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f48003;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f48004;

    @Override // l.C14941
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean mo35319() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14686(C21400 c21400) {
        super(C14941.m35934("<>"));
        this.f48002 = c21400;
        this.f48004 = C6907.m19160(17.0f);
        this.f48003 = C6907.m19160(20.0f);
        m35947((InterfaceC19417) this);
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo35314(int i) {
        return i == 0 ? this.f48003 : this.f48787 * i;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private int m35313() {
        C21400 c21400 = this.f48002;
        if (c21400.f68165.isEmpty()) {
            return 1;
        }
        int i = ((C1878) c21400.f68165.peek()).m6428() > 0 ? 3 : 1;
        if (c21400.f68165.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35318() {
        int iM35313 = m35313();
        if (iM35313 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM35313 + 2);
        }
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemCount() {
        if (this.f48002.f68165.isEmpty()) {
            return 2;
        }
        return m35313() + 2 + super.getItemCount();
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM35313 = m35313();
        if (i2 < iM35313) {
            return 2;
        }
        int i3 = i2 - iM35313;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C14941, l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C16178(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C16178(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC6484(this.f48002, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.C14941, l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        int i2;
        if (i == 0) {
            ((C16178) abstractC11800).f52512.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM35313 = m35313();
        C21400 c21400 = this.f48002;
        if (i4 >= iM35313) {
            int i5 = i4 - iM35313;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC11800, i5 - 1);
                return;
            }
            C16178 c16178 = (C16178) abstractC11800;
            C1878 c1878 = (C1878) c21400.f68165.peek();
            c16178.f52512.setText(c21400.getString(R.string.MT_Protector, Integer.valueOf(c1878.m6428())) + " - " + c1878.m6427());
            c16178.f52511.setOnClickListener(new View.OnClickListener() { // from class: l.᩺ܶۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C14686 c14686 = this.f79106;
                    C18452 c18452 = new C18452(c14686.f48002.requireContext(), view, 0);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42994(new InterfaceC21436() { // from class: l.ۘܶۧ
                        @Override // l.InterfaceC21436
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C21400 c21401 = c14686.f48002;
                            int itemId = menuItem.getItemId();
                            if (itemId == R.string.MT_Protector) {
                                c21401.f68166.m35953();
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c21401.f68166.m35950(true);
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c21401.f68166.m35953();
                                c21401.f68166.m35950(false);
                            }
                            return true;
                        }
                    });
                    c18452.mo21878();
                }
            });
            return;
        }
        ViewOnClickListenerC6484 viewOnClickListenerC6484 = (ViewOnClickListenerC6484) abstractC11800;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c21400.f68165.isEmpty()) {
            if (((C1878) c21400.f68165.peek()).m6428() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c21400.f68165.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC6484.f21800 = i3;
        TextView textView = viewOnClickListenerC6484.f21797;
        ImageView imageView = viewOnClickListenerC6484.f21798;
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

    @Override // l.C14941
    /* JADX INFO: renamed from: ۚ */
    public final int mo28663() {
        return m35313() + 2;
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo35320(String str) {
        C5607 c5607M6425 = ((C1878) this.f48002.f68165.peek()).m6425(str);
        if (c5607M6425 == null) {
            return 0;
        }
        return c5607M6425.f19434.size();
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11800 mo35315(ViewGroup viewGroup) {
        C21400 c21400 = this.f48002;
        View viewInflate = LayoutInflater.from(c21400.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f48787 + this.f48004;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC17670(c21400, viewInflate);
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35317(AbstractC11800 abstractC11800, String str, int i) {
        ViewOnClickListenerC17670 viewOnClickListenerC17670 = (ViewOnClickListenerC17670) abstractC11800;
        C21400 c21400 = this.f48002;
        C5607 c5607M6425 = ((C1878) c21400.f68165.peek()).m6425(str);
        C15301 c15301 = (C15301) c5607M6425.f19434.get(i);
        SpannableString spannableString = new SpannableString(c15301.f50021);
        spannableString.setSpan(new BackgroundColorSpan(C3296.f10738 & (-1593835521)), c15301.f50016, c15301.f50013, 33);
        viewOnClickListenerC17670.f58060.setText(spannableString);
        viewOnClickListenerC17670.f58064 = c5607M6425;
        viewOnClickListenerC17670.f58063 = c15301;
        viewOnClickListenerC17670.f58062 = i;
        TextPaint paint = viewOnClickListenerC17670.f58060.getPaint();
        if (c21400.f68169 == null || c21400.f68169.m30009(str)) {
            if (((C1878) c21400.f68165.peek()).f6307.contains(str + " " + i)) {
                viewOnClickListenerC17670.f58060.setTextColor(C3296.f10779);
                viewOnClickListenerC17670.f58060.setAlpha(0.8f);
            } else {
                viewOnClickListenerC17670.f58060.setTextColor(C3296.f10751);
                viewOnClickListenerC17670.f58060.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC17670.f58060.setTextColor(C3296.f10779);
        viewOnClickListenerC17670.f58060.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // l.InterfaceC19417
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35316(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C21400 c21400 = this.f48002;
        if (c21400.f68169 == null || c21400.f68169.m30009(str)) {
            if (((C1878) c21400.f68165.peek()).f6307.contains(str)) {
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
