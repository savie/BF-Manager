package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12963 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f43073;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17901 f43074;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f43075;

    public C12963(C17901 c17901) {
        this.f43074 = c17901;
        this.f43075 = c17901.f56681;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        Drawable drawable;
        ViewOnClickListenerC21429 viewOnClickListenerC21429 = (ViewOnClickListenerC21429) abstractC12554;
        C22841 c22841 = (C22841) this.f43075.get(i);
        viewOnClickListenerC21429.f69686 = c22841;
        viewOnClickListenerC21429.f69687.setText(c22841.f74300);
        ImageView imageView = viewOnClickListenerC21429.f69688;
        Drawable drawable2 = c22841.f74303;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
            return;
        }
        String strM30649 = c22841.f74301.m30649();
        synchronized (C17901.f56679) {
            drawable = (Drawable) C17901.f56679.m25800(strM30649);
            c22841.f74303 = drawable;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        imageView.setTag(c22841.f74301);
        RunnableC6612 runnableC6612 = c22841.f74305;
        if (runnableC6612.f22267) {
            return;
        }
        runnableC6612.f22267 = true;
        runnableC6612.f22268 = imageView;
        C4716.f16636.execute(runnableC6612);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32096(String str) {
        this.f43073 = str;
        m32095();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32095() {
        String str = this.f43073;
        C17901 c17901 = this.f43074;
        if (str == null || str.isEmpty()) {
            this.f43075 = c17901.f56681;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C22841 c22841 : (ArrayList) c17901.f56681) {
            if (C6851.m18463((CharSequence) c22841.f74300, (CharSequence) str)) {
                arrayList.add(c22841);
            } else {
                C12341 c12341 = c22841.f74301;
                if (c12341 != null && C6851.m18463((CharSequence) c12341.m30651(), (CharSequence) str)) {
                    arrayList.add(c22841);
                }
            }
        }
        this.f43075 = arrayList;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C17901 c17901 = this.f43074;
        return new ViewOnClickListenerC21429(c17901, LayoutInflater.from(c17901.f56683).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f43075.size();
    }
}
