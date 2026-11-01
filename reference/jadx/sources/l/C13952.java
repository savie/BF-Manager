package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13952 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f45906;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6606 f45907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11835 f45908;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C13952(C11835 c11835, C11545 c11545, C6606 c6606) {
        this.f45908 = c11835;
        this.f45906 = c11545;
        this.f45907 = c6606;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f45908.f39735.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C5484 c5484;
        C11545 c11545 = this.f45906;
        if (view == null) {
            view = c11545.m28824().getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c5484 = new C5484(0);
            c5484.f18871 = (TextView) view.findViewById(R.id.MT_Protector);
            c5484.f18872 = (TextView) view.findViewById(R.id.MT_Protector);
            c5484.f18869 = (TextView) view.findViewById(R.id.MT_Protector);
            c5484.f18870 = (ImageView) view.findViewById(R.id.MT_Protector);
            view.setTag(c5484);
        } else {
            c5484 = (C5484) view.getTag();
        }
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        C11835 c11835 = this.f45908;
        if (c11835.f39734.equals(abstractC11462M28817.mo13039())) {
            C6189 c6189 = (C6189) c11835.f39735.get(i);
            c5484.f18871.setText(C13012.m32189(100, c6189.m17198()));
            InterfaceC2557 interfaceC2557M17194 = c6189.m17194();
            StringBuilder sb = new StringBuilder(C5319.m14742(interfaceC2557M17194.getTime()));
            if (interfaceC2557M17194.mo7982()) {
                sb.append(EnumC19730.f63352);
                sb.append(C1791.m5863(interfaceC2557M17194.getSize()));
            }
            c5484.f18872.setText(sb.toString());
            c5484.f18869.setText(C13012.m32191(250, c6189.m17197()));
            c6189.m17196(abstractC11462M28817, c5484.f18870, C22418.f73150, this.f45907);
            view.setAlpha(c6189.f21065 ? 0.5f : 1.0f);
        }
        return view;
    }
}
