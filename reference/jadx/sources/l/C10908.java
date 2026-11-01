package l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10908 extends C9886 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9497 f37105;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10908(C9497 c9497) {
        super(C9886.m24978("<>"));
        this.f37105 = c9497;
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemViewType(int i) {
        C9497 c9497 = this.f37105;
        if (!c9497.f32138.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c9497.f32138.size()) {
                return 1;
            }
            i = i2 - c9497.f32138.size();
        }
        if (i == 0) {
            return 2;
        }
        return super.getItemViewType(i - 1);
    }

    @Override // l.C9886, l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewM24439 = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
            ((TextView) viewM24439.findViewById(R.id.textView)).setText(R.string.MT_Protector);
            viewM24439.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.ܿۢۘ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C10908 c10908 = this.f54989;
                    C16195 c16195 = new C16195(c10908.f37105.requireContext(), view, 0);
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c16195.m38296(new InterfaceC21133() { // from class: l.ۛۢۘ
                        @Override // l.InterfaceC21133
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c10908.f37105.f32142.m21607();
                            return true;
                        }
                    });
                    c16195.m38297();
                }
            });
            return new C12319(viewM24439);
        }
        if (i == 1) {
            return new ViewOnClickListenerC1734(this.f37105, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM244310 = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM244310.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C12319(viewM244310);
    }

    @Override // l.C9886, l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C9497 c9497 = this.f37105;
        if (!c9497.f32138.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c9497.f32138.size()) {
                ((ViewOnClickListenerC1734) abstractC12554).m5748((String) c9497.f32138.get(i2));
                return;
            }
            i = i2 - c9497.f32138.size();
        }
        if (i > 0) {
            super.onBindViewHolder(abstractC12554, i - 1);
        }
    }

    @Override // l.C9886, l.AbstractC0414
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount > 0) {
            itemCount++;
        }
        C9497 c9497 = this.f37105;
        return !c9497.f32138.isEmpty() ? c9497.f32138.size() + 1 + itemCount : itemCount;
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۬ */
    public final int mo14206() {
        C9497 c9497 = this.f37105;
        if (c9497.f32138.isEmpty()) {
            return 1;
        }
        return c9497.f32138.size() + 2;
    }
}
