package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10894 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19987 f34487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f34488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22829 f34489;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C10894(C22829 c22829, C8614 c8614, C19987 c19987) {
        this.f34489 = c22829;
        this.f34488 = c8614;
        this.f34487 = c19987;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f34489.f73990.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15369 c15369;
        C8614 c8614 = this.f34488;
        if (view == null) {
            view = c8614.m23233().getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c15369 = new C15369(0);
            c15369.f50128 = (TextView) view.findViewById(R.id.title);
            c15369.f50129 = (TextView) view.findViewById(R.id.MT_Protector);
            c15369.f50130 = (TextView) view.findViewById(R.id.MT_Protector);
            c15369.f50127 = (ImageView) view.findViewById(R.id.MT_Protector);
            view.setTag(c15369);
        } else {
            c15369 = (C15369) view.getTag();
        }
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        C22829 c22829 = this.f34489;
        if (c22829.f73991.equals(abstractC7364M23213.mo10164())) {
            C1200 c1200 = (C1200) c22829.f73990.get(i);
            c15369.f50128.setText(C18969.m44060(100, c1200.m4418()));
            InterfaceC2386 interfaceC2386M4414 = c1200.m4414();
            StringBuilder sb = new StringBuilder(C22482.m50716(interfaceC2386M4414.getTime()));
            if (interfaceC2386M4414.mo8102()) {
                sb.append(EnumC7687.f25319);
                sb.append(C8311.m22390(interfaceC2386M4414.getSize()));
            }
            c15369.f50129.setText(sb.toString());
            c15369.f50130.setText(C18969.m44066(250, c1200.m4417()));
            c1200.m4416(abstractC7364M23213, c15369.f50127, C13132.f41991, this.f34487);
            view.setAlpha(c1200.f4366 ? 0.5f : 1.0f);
        }
        return view;
    }
}
