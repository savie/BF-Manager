package l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC6076 extends AbstractC23976 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f20796;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f20797;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3838 f20798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f20799;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC6076(ActivityC3838 activityC3838, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC3838).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f20798 = activityC3838;
        this.f20797 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f20796 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f20799 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC23976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17588(AbstractC23230 abstractC23230) {
        abstractC23230.getClass();
        if (abstractC23230 instanceof C3092) {
            final C3092 c3092Mo10067 = abstractC23230.mo10067();
            Drawable drawable = c3092Mo10067.f10020;
            AbstractC22484 abstractC22484 = c3092Mo10067.f10018;
            this.f20797.setImageDrawable(drawable);
            this.f20796.setText(c3092Mo10067.f10019);
            String strMo31674 = abstractC22484.mo31674();
            boolean zEquals = strMo31674.equals("builtin:toggleComment");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f20799;
            if (zEquals || strMo31674.equals("builtin:shrinkCode") || strMo31674.equals("builtin:formatCode")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.᩵֫ᩴ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2361 c2361BuildDialog = this.f65030.f20798.buildDialog();
                        c2361BuildDialog.m8024(c3092Mo10067.f10019);
                        c2361BuildDialog.m8000(R.string.MT_Protector);
                        c2361BuildDialog.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog.m8016();
                    }
                });
            } else if (abstractC22484 instanceof C19500) {
                final C19500 c19500 = (C19500) abstractC22484;
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickListenerC7178(2, c19500));
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ۨ֫ᩴ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String strM49088;
                        C19500 c19501 = c19500;
                        C18300 c18300M52717 = C23522.m52717(c19501.m45022());
                        if (c18300M52717 != null) {
                            strM49088 = c18300M52717.m42687();
                        } else {
                            strM49088 = C21576.m49088(R.string.MT_Protector);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c19501.m45022()).append((CharSequence) "\n");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) c19501.m45023());
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length, length2, 18);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 18);
                        C2361 c2361BuildDialog = this.f38805.f20798.buildDialog();
                        c2361BuildDialog.m8024(strM49088);
                        c2361BuildDialog.m8008(spannableStringBuilder);
                        c2361BuildDialog.m8026(R.string.MT_Protector, null);
                        C5416.m16141(c2361BuildDialog.m8016());
                        return true;
                    }
                };
            } else {
                imageView.setVisibility(8);
                imageView.setOnClickListener(null);
            }
            this.itemView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f20798.f13074.m30178(this);
        return false;
    }
}
