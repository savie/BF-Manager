package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3462 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Bitmap f12731;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Bitmap f12732;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f12733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Bitmap f12734;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Bitmap f12735;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Bitmap f12736;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Bitmap f12737;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f12738;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C3462(ActivityC3588 activityC3588) {
        this.f12733 = activityC3588;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        int iM33769 = C13932.m33769(32.0f);
        int iM337610 = C13932.m33769(16.0f);
        int iM337611 = C13932.m33769(15.0f);
        paint.setStyle(Paint.Style.FILL);
        if (C20368.f65967) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13932.m33770(20.0f));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM337611;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        String[] strArr = {"C", "S", "I", "F", "M", "J"};
        Bitmap[] bitmapArr = new Bitmap[6];
        int i = 0;
        for (int i2 = 6; i < i2; i2 = 6) {
            paint.setColor(activityC3588.f13207[i].mo38326());
            paint2.setColor(activityC3588.f13207[i].mo38328());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM33769, iM33769, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f5 = iM337610;
            canvas.drawCircle(f5, f5, f3, paint);
            canvas.drawText(strArr[i], f5, f4, paint2);
            bitmapArr[i] = bitmapCreateBitmap;
            i++;
        }
        this.f12735 = bitmapArr[0];
        this.f12732 = bitmapArr[1];
        this.f12738 = bitmapArr[2];
        this.f12731 = bitmapArr[3];
        this.f12737 = bitmapArr[4];
        this.f12734 = bitmapArr[5];
        AbstractC16214 abstractC16214 = C0690.f2885;
        paint.setColor(abstractC16214.mo38326());
        this.f12736 = Bitmap.createBitmap(iM33769, iM33769, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.f12736);
        float f6 = iM337610;
        canvas2.drawCircle(f6, f6, f3, paint);
        Drawable drawableM39263 = C16737.m39263(R.drawable.MT_Protector);
        int i3 = (iM33769 - iM337610) / 2;
        int i4 = iM337610 + i3;
        drawableM39263.setBounds(i3, i3, i4, i4);
        drawableM39263.setTint(abstractC16214.mo38328());
        drawableM39263.draw(canvas2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC3588 activityC3588 = this.f12733;
        switch (C21102.f68739[activityC3588.f13204.m6777().ordinal()]) {
            case 1:
                return 2;
            case 2:
                if (activityC3588.f13204.f7897 == null) {
                    return 0;
                }
                return activityC3588.f13204.f7897.f3087.size() + activityC3588.f13204.f7897.f3084.size();
            case 3:
                return ((C19112) activityC3588.f13204.f7912.peek()).f61749.size();
            case 4:
                return 4;
            case 5:
                return activityC3588.f13204.f7892.size() + activityC3588.f13204.f7894.size();
            case 6:
                return ((C19112) activityC3588.f13204.f7890.peek()).f61749.size();
            case 7:
                boolean z = activityC3588.f13204.f7895;
                C2177 c2177 = activityC3588.f13204;
                return z ? c2177.f7899 : c2177.f7898.length;
            case 8:
                return activityC3588.f13204.f7914.size() + activityC3588.f13204.f7903.size();
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ActivityC3588 activityC3588 = this.f12733;
        View view2 = view;
        if (view == null) {
            View viewInflate = activityC3588.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            View viewFindViewById = viewInflate.findViewById(R.id.textView1);
            viewInflate.setTag(viewFindViewById);
            View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
            viewFindViewById.setTag(viewFindViewById2);
            viewFindViewById2.setTag(viewInflate.findViewById(R.id.textView2));
            view2 = viewInflate;
        }
        TextView textView = (TextView) view2.getTag();
        ImageView imageView = (ImageView) textView.getTag();
        TextView textView2 = (TextView) imageView.getTag();
        imageView.setVisibility(0);
        textView2.setVisibility(8);
        switch (C21102.f68739[activityC3588.f13204.m6777().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12735);
                } else if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12732);
                    return view2;
                }
                return view2;
            case 2:
                if (i < activityC3588.f13204.f7897.f3084.size()) {
                    textView.setText(((C0766) activityC3588.f13204.f7897.f3084.get(i)).f3082);
                    imageView.setImageBitmap(this.f12736);
                    return view2;
                }
                textView.setText((CharSequence) activityC3588.f13204.f7897.f3087.get(i - activityC3588.f13204.f7897.f3084.size()));
                imageView.setImageBitmap(this.f12735);
                return view2;
            case 3:
                String strM6314 = ((C13929) ((C19112) activityC3588.f13204.f7912.peek()).f61749.get(i)).m33765().m6314();
                textView.setText(strM6314.substring(1, strM6314.length() - 1));
                imageView.setImageBitmap(this.f12735);
                return view2;
            case 4:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12738);
                    return view2;
                }
                if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12731);
                    return view2;
                }
                if (i == 2) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12737);
                    return view2;
                }
                if (i == 3) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f12734);
                    return view2;
                }
                return view2;
            case 5:
                textView2.setVisibility(0);
                if (i >= activityC3588.f13204.f7894.size()) {
                    arrayList = activityC3588.f13204.f7892;
                    i -= activityC3588.f13204.f7894.size();
                } else {
                    arrayList = activityC3588.f13204.f7894;
                }
                C9841 c9841 = (C9841) arrayList.get(i);
                textView.setText(c9841.f33621.f65771.m35176());
                textView2.setText(c9841.f33621.f65772.m40672());
                imageView.setImageBitmap(this.f12737);
                return view2;
            case 6:
                textView2.setVisibility(0);
                C9841 c9842 = (C9841) ((C19112) activityC3588.f13204.f7890.peek()).f61749.get(i);
                textView.setText(c9842.f33621.f65771.m35176());
                textView2.setText(c9842.f33621.f65772.m40672());
                imageView.setImageBitmap(this.f12737);
                return view2;
            case 7:
                C14655[] c14655Arr = activityC3588.f13204.f7898;
                if (activityC3588.f13204.f7895) {
                    i = activityC3588.f13204.f7891[i];
                }
                textView.setText(c14655Arr[i].m35176());
                imageView.setVisibility(8);
                return view2;
            case 8:
                textView2.setVisibility(0);
                if (i >= activityC3588.f13204.f7903.size()) {
                    arrayList2 = activityC3588.f13204.f7914;
                    i -= activityC3588.f13204.f7903.size();
                } else {
                    arrayList2 = activityC3588.f13204.f7903;
                }
                C2078 c2078 = (C2078) arrayList2.get(i);
                textView.setText(c2078.f7681.f61164.m35176());
                textView2.setText(c2078.f7681.f61160.m6314());
                imageView.setImageBitmap(this.f12731);
                return view2;
            default:
                return view2;
        }
    }
}
