package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19413 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20824 f62568;

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C19413(C20824 c20824) {
        this.f62568 = c20824;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20824 c20824 = this.f62568;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c20824.f67672);
        if (i == 0) {
            return new C8124(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C7418(c20824, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        String str;
        String string;
        C20824 c20824 = this.f62568;
        if (i == 0) {
            ((TextView) abstractC12554.itemView.findViewById(R.id.MT_Protector)).setText(c20824.f67674);
            return;
        }
        C9422 c9422 = (C9422) c20824.f67671.get(i - 1);
        C7418 c7418 = (C7418) abstractC12554;
        TextView textView = c7418.f24698;
        boolean zM24180 = c9422.m24180();
        EnumC23533 enumC23533 = c9422.f31924;
        textView.setText(zM24180 ? c20824.f67672.getString(R.string.MT_Protector) : c9422.f31925);
        TextView textView2 = c7418.f24697;
        if (c9422.m24180()) {
            string = c20824.m46831(enumC23533);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c20824.m46831(enumC23533));
            sb.append(" · ");
            sb.append(c20824.f67672.getString(c9422.f31923 == EnumC13197.FILE ? R.string.MT_Protector : R.string.MT_Protector));
            if (c9422.f31926) {
                str = "";
            } else {
                str = " · " + c20824.f67672.getString(R.string.MT_Protector);
            }
            sb.append(str);
            string = sb.toString();
        }
        textView2.setText(string);
        c7418.f24699.setVisibility(c9422.m24180() ? 4 : 0);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f62568.f67671.size() + 1;
    }
}
