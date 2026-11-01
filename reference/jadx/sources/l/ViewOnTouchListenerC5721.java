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

/* JADX INFO: renamed from: l.ۛ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC5721 extends AbstractC10661 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23361 f19485;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f19486;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f19487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f19488;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC5721(ActivityC23361 activityC23361, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC23361).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f19485 = activityC23361;
        this.f19486 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f19487 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f19488 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC10661
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15777(AbstractC0076 abstractC0076) {
        abstractC0076.getClass();
        if (abstractC0076 instanceof C16305) {
            final C16305 c16305Mo1011 = abstractC0076.mo1011();
            Drawable drawable = c16305Mo1011.f52511;
            AbstractC21243 abstractC21243 = c16305Mo1011.f52509;
            this.f19486.setImageDrawable(drawable);
            this.f19487.setText(c16305Mo1011.f52510);
            String strMo20676 = abstractC21243.mo20676();
            boolean zEquals = strMo20676.equals("builtin:toggleComment");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f19488;
            if (zEquals || strMo20676.equals("builtin:shrinkCode") || strMo20676.equals("builtin:formatCode")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.۫֨ۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C8067 c8067BuildDialog = this.f40406.f19485.buildDialog();
                        c8067BuildDialog.m21277(c16305Mo1011.f52510);
                        c8067BuildDialog.m21253(R.string.MT_Protector);
                        c8067BuildDialog.m21251(R.string.MT_Protector, null);
                        c8067BuildDialog.m21269();
                    }
                });
            } else if (abstractC21243 instanceof C17715) {
                final C17715 c17715 = (C17715) abstractC21243;
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickListenerC19619(1, c17715));
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ܿ֨ۚ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String strM39288;
                        C17715 c17716 = c17715;
                        C11986 c11986M40033 = C17132.m40033(c17716.m41262());
                        if (c11986M40033 != null) {
                            strM39288 = c11986M40033.m29845();
                        } else {
                            strM39288 = C16737.m39288(R.string.MT_Protector);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c17716.m41262()).append((CharSequence) "\n");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) c17716.m41261());
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length, length2, 18);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 18);
                        C8067 c8067BuildDialog = this.f54361.f19485.buildDialog();
                        c8067BuildDialog.m21277(strM39288);
                        c8067BuildDialog.m21261(spannableStringBuilder);
                        c8067BuildDialog.m21251(R.string.MT_Protector, null);
                        C23250.m51307(c8067BuildDialog.m21269());
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
        this.f19485.f75682.m12830(this);
        return false;
    }
}
