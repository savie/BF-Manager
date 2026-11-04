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

/* JADX INFO: renamed from: l.֨᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1416 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Bitmap f4996;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f4997;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Bitmap f4998;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Bitmap f4999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bitmap f5000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Bitmap f5001;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Bitmap f5002;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f5003;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1416(ActivityC22957 activityC22957) {
        this.f4997 = activityC22957;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        int iM19160 = C6907.m19160(32.0f);
        int iM19161 = C6907.m19160(16.0f);
        int iM19162 = C6907.m19160(15.0f);
        paint.setStyle(Paint.Style.FILL);
        if (C3296.f10755) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C6907.m19161(20.0f));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM19162;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        String[] strArr = {"C", "S", "I", "F", "M", "J"};
        Bitmap[] bitmapArr = new Bitmap[6];
        int i = 0;
        for (int i2 = 6; i < i2; i2 = 6) {
            paint.setColor(activityC22957.f74572[i].mo36859());
            paint2.setColor(activityC22957.f74572[i].mo36860());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19160, iM19160, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f5 = iM19161;
            canvas.drawCircle(f5, f5, f3, paint);
            canvas.drawText(strArr[i], f5, f4, paint2);
            bitmapArr[i] = bitmapCreateBitmap;
            i++;
        }
        this.f5000 = bitmapArr[0];
        this.f4999 = bitmapArr[1];
        this.f5003 = bitmapArr[2];
        this.f5001 = bitmapArr[3];
        this.f5002 = bitmapArr[4];
        this.f4998 = bitmapArr[5];
        AbstractC23597 abstractC23597 = C20613.f66104;
        paint.setColor(abstractC23597.mo36859());
        this.f4996 = Bitmap.createBitmap(iM19160, iM19160, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.f4996);
        float f6 = iM19161;
        canvas2.drawCircle(f6, f6, f3, paint);
        Drawable drawableM49058 = C21576.m49058(R.drawable.MT_Protector);
        int i3 = (iM19160 - iM19161) / 2;
        int i4 = iM19161 + i3;
        drawableM49058.setBounds(i3, i3, i4, i4);
        drawableM49058.setTint(abstractC23597.mo36860());
        drawableM49058.draw(canvas2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC22957 activityC22957 = this.f4997;
        switch (C3653.f12496[activityC22957.f74569.m20286().ordinal()]) {
            case 1:
                return 2;
            case 2:
                if (activityC22957.f74569.f24305 == null) {
                    return 0;
                }
                return activityC22957.f74569.f24305.f71553.size() + activityC22957.f74569.f24305.f71550.size();
            case 3:
                return ((C16989) activityC22957.f74569.f24321.peek()).f55522.size();
            case 4:
                return 4;
            case 5:
                return activityC22957.f74569.f24320.size() + activityC22957.f74569.f24311.size();
            case 6:
                return ((C16989) activityC22957.f74569.f24318.peek()).f55522.size();
            case 7:
                boolean z = activityC22957.f74569.f24304;
                C7382 c7382 = activityC22957.f74569;
                return z ? c7382.f24301 : c7382.f24303.length;
            case 8:
                return activityC22957.f74569.f24308.size() + activityC22957.f74569.f24313.size();
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ActivityC22957 activityC22957 = this.f4997;
        View view2 = view;
        if (view == null) {
            View viewInflate = activityC22957.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
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
        switch (C3653.f12496[activityC22957.f74569.m20286().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f5000);
                } else if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f4999);
                    return view2;
                }
                return view2;
            case 2:
                if (i < activityC22957.f74569.f24305.f71550.size()) {
                    textView.setText(((C22211) activityC22957.f74569.f24305.f71550.get(i)).f71551);
                    imageView.setImageBitmap(this.f4996);
                    return view2;
                }
                textView.setText((CharSequence) activityC22957.f74569.f24305.f71553.get(i - activityC22957.f74569.f24305.f71550.size()));
                imageView.setImageBitmap(this.f5000);
                return view2;
            case 3:
                String strM46860 = ((C4072) ((C16989) activityC22957.f74569.f24321.peek()).f55522.get(i)).m13151().m46860();
                textView.setText(strM46860.substring(1, strM46860.length() - 1));
                imageView.setImageBitmap(this.f5000);
                return view2;
            case 4:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f5003);
                    return view2;
                }
                if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f5001);
                    return view2;
                }
                if (i == 2) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f5002);
                    return view2;
                }
                if (i == 3) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f4998);
                    return view2;
                }
                return view2;
            case 5:
                textView2.setVisibility(0);
                if (i >= activityC22957.f74569.f24311.size()) {
                    arrayList = activityC22957.f74569.f24320;
                    i -= activityC22957.f74569.f24311.size();
                } else {
                    arrayList = activityC22957.f74569.f24311;
                }
                C12275 c12275 = (C12275) arrayList.get(i);
                textView.setText(c12275.f39463.f19210.m10827());
                textView2.setText(c12275.f39463.f19208.m39476());
                imageView.setImageBitmap(this.f5002);
                return view2;
            case 6:
                textView2.setVisibility(0);
                C12275 c12276 = (C12275) ((C16989) activityC22957.f74569.f24318.peek()).f55522.get(i);
                textView.setText(c12276.f39463.f19210.m10827());
                textView2.setText(c12276.f39463.f19208.m39476());
                imageView.setImageBitmap(this.f5002);
                return view2;
            case 7:
                C3282[] c3282Arr = activityC22957.f74569.f24303;
                if (activityC22957.f74569.f24304) {
                    i = activityC22957.f74569.f24307[i];
                }
                textView.setText(c3282Arr[i].m10827());
                imageView.setVisibility(8);
                return view2;
            case 8:
                textView2.setVisibility(0);
                if (i >= activityC22957.f74569.f24313.size()) {
                    arrayList2 = activityC22957.f74569.f24308;
                    i -= activityC22957.f74569.f24313.size();
                } else {
                    arrayList2 = activityC22957.f74569.f24313;
                }
                C20480 c20480 = (C20480) arrayList2.get(i);
                textView.setText(c20480.f65617.f43034.m10827());
                textView2.setText(c20480.f65617.f43033.m46860());
                imageView.setImageBitmap(this.f5001);
                return view2;
            default:
                return view2;
        }
    }
}
