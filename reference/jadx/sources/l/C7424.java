package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C7424 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11064 f24436;

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C7424(C11064 c11064) {
        this.f24436 = c11064;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C11064 c11064 = this.f24436;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c11064.f34898);
        if (i == 0) {
            return new C8915(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C22253(c11064, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        String str;
        String string;
        C11064 c11064 = this.f24436;
        if (i == 0) {
            ((TextView) abstractC11800.itemView.findViewById(R.id.MT_Protector)).setText(c11064.f34901);
            return;
        }
        C0911 c0911 = (C0911) c11064.f34897.get(i - 1);
        C22253 c22253 = (C22253) abstractC11800;
        TextView textView = c22253.f71664;
        boolean zM3682 = c0911.m3682();
        EnumC7623 enumC7623 = c0911.f3412;
        textView.setText(zM3682 ? c11064.f34898.getString(R.string.MT_Protector) : c0911.f3413);
        TextView textView2 = c22253.f71663;
        if (c0911.m3682()) {
            string = c11064.m27951(enumC7623);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c11064.m27951(enumC7623));
            sb.append(" · ");
            sb.append(c11064.f34898.getString(c0911.f3415 == EnumC20059.FILE ? R.string.MT_Protector : R.string.MT_Protector));
            if (c0911.f3414) {
                str = "";
            } else {
                str = " · " + c11064.f34898.getString(R.string.MT_Protector);
            }
            sb.append(str);
            string = sb.toString();
        }
        textView2.setText(string);
        c22253.f71665.setVisibility(c0911.m3682() ? 4 : 0);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f24436.f34897.size() + 1;
    }
}
