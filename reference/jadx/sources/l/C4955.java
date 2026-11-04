package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4955 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f17245;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1972 f17246;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f17247;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f17248;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC11666 viewOnClickListenerC11666 = (ViewOnClickListenerC11666) abstractC11800;
        C22109 c22109 = (C22109) this.f17247.get(i);
        viewOnClickListenerC11666.f37806 = c22109;
        viewOnClickListenerC11666.f37805.setText(c22109.f71256);
        ImageView imageView = viewOnClickListenerC11666.f37808;
        Drawable drawable = c22109.f71258;
        if (drawable != null) {
            C19871.m45730(imageView);
            imageView.setImageDrawable(drawable);
        } else {
            C19871.m45731(c22109.f71253, imageView, this.f17248);
        }
    }

    @Override // l.AbstractC12964
    public final void onViewRecycled(AbstractC11800 abstractC11800) {
        ViewOnClickListenerC11666 viewOnClickListenerC11666 = (ViewOnClickListenerC11666) abstractC11800;
        C19871.m45730(viewOnClickListenerC11666.f37808);
        viewOnClickListenerC11666.f37808.setImageDrawable(null);
        viewOnClickListenerC11666.f37806 = null;
        super.onViewRecycled(viewOnClickListenerC11666);
    }

    public C4955(C25093 c25093, C1972 c1972) {
        this.f17248 = c25093;
        ArrayList arrayList = new ArrayList();
        this.f17245 = arrayList;
        this.f17247 = arrayList;
        this.f17246 = c1972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15157() {
        C17328 c17328;
        C25093 c25093 = this.f17248;
        if (c25093.f81144.isEmpty()) {
            this.f17247 = this.f17245;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C22109 c22109 : this.f17245) {
                if (C24276.m54287(c22109.f71256, c25093.f81144) || ((c17328 = c22109.f71253) != null && C24276.m54287(c17328.m40676(), c25093.f81144))) {
                    arrayList.add(c22109);
                }
            }
            this.f17247 = arrayList;
        }
        notifyDataSetChanged();
        this.f17246.m6792();
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C25093 c25093 = this.f17248;
        return new ViewOnClickListenerC11666(c25093, LayoutInflater.from(c25093.f81138).inflate(R.layout.MT_Protector, viewGroup, false), this.f17246);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f17247.size();
    }
}
