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

/* JADX INFO: renamed from: l.ۧۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10721 extends C9886 implements InterfaceC2207 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23421 f36552;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f36553;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f36554;

    @Override // l.C9886
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo14208() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10721(C23421 c23421) {
        super(C9886.m24978("<>"));
        this.f36552 = c23421;
        this.f36554 = C13932.m33769(17.0f);
        this.f36553 = C13932.m33769(20.0f);
        m25001((InterfaceC2207) this);
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ */
    public final int mo14202(int i) {
        return i == 0 ? this.f36553 : this.f33750 * i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m26946() {
        C23421 c23421 = this.f36552;
        if (c23421.f75831.isEmpty()) {
            return 1;
        }
        int i = ((C10617) c23421.f75831.peek()).m26801() > 0 ? 3 : 1;
        if (c23421.f75831.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m26947() {
        int iM26946 = m26946();
        if (iM26946 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM26946 + 2);
        }
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemCount() {
        if (this.f36552.f75831.isEmpty()) {
            return 2;
        }
        return m26946() + 2 + super.getItemCount();
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM26946 = m26946();
        if (i2 < iM26946) {
            return 2;
        }
        int i3 = i2 - iM26946;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C9886, l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C20598(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C20598(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC12132(this.f36552, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.C9886, l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int i2;
        if (i == 0) {
            ((C20598) abstractC12554).f67114.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM26946 = m26946();
        C23421 c23421 = this.f36552;
        if (i4 >= iM26946) {
            int i5 = i4 - iM26946;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC12554, i5 - 1);
                return;
            }
            C20598 c20598 = (C20598) abstractC12554;
            C10617 c10617 = (C10617) c23421.f75831.peek();
            c20598.f67114.setText(c23421.getString(R.string.MT_Protector, Integer.valueOf(c10617.m26801())) + " - " + c10617.m26800());
            c20598.f67113.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۗۘ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C10721 c10721 = this.f54488;
                    C16195 c16195 = new C16195(c10721.f36552.requireContext(), view, 0);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38296(new InterfaceC21133() { // from class: l.ۛۗۘ
                        @Override // l.InterfaceC21133
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C23421 c23422 = c10721.f36552;
                            int itemId = menuItem.getItemId();
                            if (itemId == R.string.MT_Protector) {
                                c23422.f75834.m25014();
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c23422.f75834.m25008(true);
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c23422.f75834.m25014();
                                c23422.f75834.m25008(false);
                            }
                            return true;
                        }
                    });
                    c16195.m38297();
                }
            });
            return;
        }
        ViewOnClickListenerC12132 viewOnClickListenerC12132 = (ViewOnClickListenerC12132) abstractC12554;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c23421.f75831.isEmpty()) {
            if (((C10617) c23421.f75831.peek()).m26801() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c23421.f75831.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC12132.f40626 = i3;
        TextView textView = viewOnClickListenerC12132.f40625;
        ImageView imageView = viewOnClickListenerC12132.f40624;
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

    @Override // l.C9886
    /* JADX INFO: renamed from: ۬ */
    public final int mo14206() {
        return m26946() + 2;
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ܰ */
    public final int mo14207(String str) {
        C9206 c9206M26798 = ((C10617) this.f36552.f75831.peek()).m26798(str);
        if (c9206M26798 == null) {
            return 0;
        }
        return c9206M26798.f31291.size();
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12554 mo14203(ViewGroup viewGroup) {
        C23421 c23421 = this.f36552;
        View viewInflate = LayoutInflater.from(c23421.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f33750 + this.f36554;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC7192(c23421, viewInflate);
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ */
    public final void mo14204(AbstractC12554 abstractC12554, String str, int i) {
        ViewOnClickListenerC7192 viewOnClickListenerC7192 = (ViewOnClickListenerC7192) abstractC12554;
        C23421 c23421 = this.f36552;
        C9206 c9206M26798 = ((C10617) c23421.f75831.peek()).m26798(str);
        C8500 c8500 = (C8500) c9206M26798.f31291.get(i);
        SpannableString spannableString = new SpannableString(c8500.f29472);
        spannableString.setSpan(new BackgroundColorSpan(C20368.f65970 & (-1593835521)), c8500.f29468, c8500.f29471, 33);
        viewOnClickListenerC7192.f24000.setText(spannableString);
        viewOnClickListenerC7192.f24001 = c9206M26798;
        viewOnClickListenerC7192.f23997 = c8500;
        viewOnClickListenerC7192.f23999 = i;
        TextPaint paint = viewOnClickListenerC7192.f24000.getPaint();
        if (c23421.f75837 == null || c23421.f75837.m21609(str)) {
            if (((C10617) c23421.f75831.peek()).f36281.contains(str + " " + i)) {
                viewOnClickListenerC7192.f24000.setTextColor(C20368.f66009);
                viewOnClickListenerC7192.f24000.setAlpha(0.8f);
            } else {
                viewOnClickListenerC7192.f24000.setTextColor(C20368.f65976);
                viewOnClickListenerC7192.f24000.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC7192.f24000.setTextColor(C20368.f66009);
        viewOnClickListenerC7192.f24000.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // l.InterfaceC2207
    /* JADX INFO: renamed from: ۙ */
    public final void mo6817(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C23421 c23421 = this.f36552;
        if (c23421.f75837 == null || c23421.f75837.m21609(str)) {
            if (((C10617) c23421.f75831.peek()).f36281.contains(str)) {
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
