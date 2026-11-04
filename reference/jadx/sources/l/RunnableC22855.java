package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩸ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22855 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f74267 = new WeakHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17328 f74268;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f74269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f74270;

    public RunnableC22855(String str, C17328 c17328, int i) {
        this.f74270 = str;
        this.f74268 = c17328;
        this.f74269 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51574(C25093 c25093) {
        Iterator it = this.f74267.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ImageView imageView = (ImageView) entry.getKey();
            C25093 c25094 = (C25093) ((WeakReference) entry.getValue()).get();
            if (imageView == null || imageView.getTag() != this || c25094 == null || c25094 == c25093 || c25094.f81151 || !c25094.f81140.m22434()) {
                if (imageView != null && imageView.getTag() == this) {
                    imageView.setTag(null);
                }
                it.remove();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableC15902;
        BitmapDrawable bitmapDrawable;
        int i = this.f74269;
        try {
            try {
                Drawable drawableM40673 = this.f74268.m40673(C21576.m49081());
                Resources resourcesM49055 = C21576.m49055();
                ColorMatrixColorFilter colorMatrixColorFilter = RunnableC21479.f68685;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Rect rectCopyBounds = drawableM40673.copyBounds();
                drawableM40673.setBounds(0, 0, i, i);
                drawableM40673.draw(new Canvas(bitmapCreateBitmap));
                drawableM40673.setBounds(rectCopyBounds);
                bitmapDrawable = new BitmapDrawable(resourcesM49055, bitmapCreateBitmap);
            } catch (Throwable th) {
                C21576.m49068(new Runnable() { // from class: l.ۤܰᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34567.m51573((BitmapDrawable) null);
                    }
                });
                throw th;
            }
        } catch (Exception unused) {
            try {
                Drawable drawableM49058 = C21576.m49058(R.drawable.MT_Protector);
                Resources resourcesM49056 = C21576.m49055();
                ColorMatrixColorFilter colorMatrixColorFilter2 = RunnableC21479.f68685;
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Rect rectCopyBounds2 = drawableM49058.copyBounds();
                drawableM49058.setBounds(0, 0, i, i);
                drawableM49058.draw(new Canvas(bitmapCreateBitmap2));
                drawableM49058.setBounds(rectCopyBounds2);
                bitmapDrawable = new BitmapDrawable(resourcesM49056, bitmapCreateBitmap2);
            } catch (Exception unused2) {
                runnableC15902 = new Runnable() { // from class: l.ۤܰᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34567.m51573((BitmapDrawable) null);
                    }
                };
            }
        }
        runnableC15902 = new RunnableC15902(1, this, bitmapDrawable);
        C21576.m49068(runnableC15902);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51573(BitmapDrawable bitmapDrawable) {
        HashMap map = C19871.f63902;
        String str = this.f74270;
        if (map.get(str) != this) {
            return;
        }
        C19871.f63902.remove(str);
        if (bitmapDrawable != null) {
            C19871.f63903.m3589(str, bitmapDrawable);
        }
        WeakHashMap weakHashMap = this.f74267;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            ImageView imageView = (ImageView) entry.getKey();
            C25093 c25093 = (C25093) ((WeakReference) entry.getValue()).get();
            if (imageView != null && imageView.getTag() == this) {
                imageView.setTag(null);
                if (bitmapDrawable != null && c25093 != null && !c25093.f81151 && c25093.f81140.m22434()) {
                    imageView.setImageDrawable(bitmapDrawable);
                }
            }
        }
        weakHashMap.clear();
    }
}
