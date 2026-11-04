package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15281 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f49942;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11999 f49943;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f49944;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f49944.get(i);
        C8352 c8352 = ((ViewOnTouchListenerC13044) abstractC11800).f41742;
        c8352.m22483().setText(interfaceC2386.mo8100());
        CharSequence charSequenceMo8099 = interfaceC2386.mo8099();
        if (charSequenceMo8099 != null) {
            c8352.m22481().setText(charSequenceMo8099);
        } else if (interfaceC2386.mo8102()) {
            c8352.m22481().setText(C8311.m22390(interfaceC2386.getSize()));
        } else {
            c8352.m22481().setText((CharSequence) null);
        }
        C5752 c5752M22484 = c8352.m22484();
        if (interfaceC2386.mo8107()) {
            c5752M22484.setVisibility(0);
            c5752M22484.setText("->");
        } else if (interfaceC2386.mo8113()) {
            c5752M22484.setVisibility(0);
            c5752M22484.setText("* ");
        } else {
            c5752M22484.setVisibility(4);
            c5752M22484.setText(" ");
        }
        CharSequence charSequenceMo8101 = interfaceC2386.mo8101();
        if (charSequenceMo8101 == null) {
            charSequenceMo8101 = C22482.m50716(interfaceC2386.getTime());
        }
        c8352.m22482().setText(charSequenceMo8101);
        C11983 icon = interfaceC2386.getIcon();
        if (icon != null) {
            c8352.m22485().setImageDrawable(icon.m30080());
        }
    }

    public C15281(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList, C11999 c11999) {
        this.f49942 = abstractActivityC17204;
        this.f49944 = arrayList;
        this.f49943 = c11999;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnTouchListenerC13044 viewOnTouchListenerC13044 = new ViewOnTouchListenerC13044(LayoutInflater.from(this.f49942).inflate(R.layout.MT_Protector, viewGroup, false));
        viewOnTouchListenerC13044.f41743 = this.f49943;
        ViewGroup viewGroup2 = (ViewGroup) viewOnTouchListenerC13044.itemView;
        C8352 c8352 = (C8352) viewGroup2.getChildAt(0);
        viewOnTouchListenerC13044.f41742 = c8352;
        c8352.m22478();
        c8352.m22483().setSingleLine(C17423.f56645 == 1);
        c8352.m22483().setMaxLines(C17423.f56645);
        int i2 = C17423.f56647;
        if (i2 == 1) {
            c8352.m22483().setTextSize(2, 13.0f);
            c8352.m22481().setTextSize(2, 10.0f);
            c8352.m22484().setTextSize(2, 10.0f);
            c8352.m22482().setTextSize(2, 10.0f);
        } else if (i2 == 2) {
            c8352.m22483().setTextSize(2, 15.0f);
            c8352.m22481().setTextSize(2, 11.0f);
            c8352.m22484().setTextSize(2, 11.0f);
            c8352.m22482().setTextSize(2, 11.0f);
        } else if (i2 == 3) {
            c8352.m22483().setTextSize(2, 17.0f);
            c8352.m22481().setTextSize(2, 12.0f);
            c8352.m22484().setTextSize(2, 12.0f);
            c8352.m22482().setTextSize(2, 12.0f);
        }
        View childAt = viewGroup2.getChildAt(1);
        childAt.setAlpha(0.75f);
        childAt.setOnTouchListener(viewOnTouchListenerC13044);
        childAt.setFocusable(true);
        childAt.setClickable(true);
        return viewOnTouchListenerC13044;
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f49944.size();
    }
}
