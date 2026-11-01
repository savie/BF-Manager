package l;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC2192 extends AbstractC3603 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6426 f7936;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f7937;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f7938;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f7939;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC2192(ActivityC6426 activityC6426, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC6426).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f7936 = activityC6426;
        this.f7937 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f7938 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f7939 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC3603
    /* JADX INFO: renamed from: ۙ */
    public final void mo6660(AbstractC9871 abstractC9871) {
        abstractC9871.getClass();
        if (abstractC9871 instanceof C3519) {
            C3519 c3519Mo10352 = abstractC9871.mo10352();
            Drawable drawable = c3519Mo10352.f12879;
            AbstractC21243 abstractC21243 = c3519Mo10352.f12877;
            this.f7937.setImageDrawable(drawable);
            this.f7938.setText(c3519Mo10352.f12878);
            String strMo20676 = abstractC21243.mo20676();
            strMo20676.getClass();
            boolean zEquals = strMo20676.equals("builtin:systemTranslate");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f7939;
            if (zEquals) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ֨ۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayList = (ArrayList) C22466.m49971();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        String string = ApplicationC0716.f2992.getString("stid", null);
                        int[] iArr = {0};
                        if (!TextUtils.isEmpty(string)) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (((InterfaceC11883) arrayList.get(i)).mo8259().equals(string)) {
                                    iArr[0] = i;
                                    break;
                                }
                            }
                        }
                        PackageManager packageManagerM39292 = C16737.m39292();
                        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            charSequenceArr[i2] = ((InterfaceC11883) arrayList.get(i2)).mo8260(packageManagerM39292);
                        }
                        C8067 c8067BuildDialog = this.f15482.f7936.buildDialog();
                        c8067BuildDialog.m21274(R.string.MT_Protector);
                        c8067BuildDialog.m21266(charSequenceArr, iArr[0], new DialogInterfaceOnClickListenerC23190(1, iArr));
                        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11732(1, arrayList, iArr));
                        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c8067BuildDialog.m21269();
                    }
                });
            } else if (strMo20676.equals("builtin:function")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ܰ֨ۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C8067 c8067BuildDialog = this.f44568.f7936.buildDialog();
                        c8067BuildDialog.m21274(R.string.MT_Protector);
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
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ۨ֨ۚ
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
                        C8067 c8067BuildDialog = this.f38328.f7936.buildDialog();
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
        this.f7936.f21766.m12830(this);
        return false;
    }
}
