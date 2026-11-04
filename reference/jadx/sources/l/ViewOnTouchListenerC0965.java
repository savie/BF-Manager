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

/* JADX INFO: renamed from: l.֨ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC0965 extends AbstractC13642 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f3524;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f3525;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4584 f3526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f3527;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0965(ActivityC4584 activityC4584, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC4584).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f3526 = activityC4584;
        this.f3525 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f3524 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f3527 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC13642
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3834(AbstractC18118 abstractC18118) {
        abstractC18118.getClass();
        if (abstractC18118 instanceof C0219) {
            C0219 c0219Mo1672 = abstractC18118.mo1672();
            Drawable drawable = c0219Mo1672.f1425;
            AbstractC22484 abstractC22484 = c0219Mo1672.f1423;
            this.f3525.setImageDrawable(drawable);
            this.f3524.setText(c0219Mo1672.f1424);
            String strMo31674 = abstractC22484.mo31674();
            strMo31674.getClass();
            boolean zEquals = strMo31674.equals("builtin:systemTranslate");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f3527;
            if (zEquals) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۚᩴ
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [int[], java.io.Serializable, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayList = (ArrayList) C21036.m48076();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        String string = ApplicationC17729.f58258.getString("stid", null);
                        ?? r1 = {0};
                        if (!TextUtils.isEmpty(string)) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (((InterfaceC24020) arrayList.get(i)).mo12513().equals(string)) {
                                    r1[0] = i;
                                    break;
                                }
                            }
                        }
                        PackageManager packageManagerM49081 = C21576.m49081();
                        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            charSequenceArr[i2] = ((InterfaceC24020) arrayList.get(i2)).mo12514(packageManagerM49081);
                        }
                        C2361 c2361BuildDialog = this.f25271.f3526.buildDialog();
                        c2361BuildDialog.m8021(R.string.MT_Protector);
                        c2361BuildDialog.m8013(charSequenceArr, r1[0], new DialogInterfaceOnClickListenerC0212(1, r1));
                        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2690(arrayList, r1, 1));
                        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog.m8016();
                    }
                });
            } else if (strMo31674.equals("builtin:function")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۚᩴ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2361 c2361BuildDialog = this.f61244.f3526.buildDialog();
                        c2361BuildDialog.m8021(R.string.MT_Protector);
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
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ۢۚᩴ
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
                        C2361 c2361BuildDialog = this.f31841.f3526.buildDialog();
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
        this.f3526.f16300.m30178(this);
        return false;
    }
}
