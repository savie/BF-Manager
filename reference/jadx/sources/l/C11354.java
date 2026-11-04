package l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11354 extends C14941 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15829 f35758;

    public C11354(C15829 c15829) {
        this.f35758 = c15829;
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemViewType(int i) {
        C15829 c15829 = this.f35758;
        if (!c15829.f51494.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c15829.f51494.size()) {
                return 1;
            }
            i = i2 - c15829.f51494.size();
        }
        if (i == 0) {
            return 2;
        }
        return super.getItemViewType(i - 1);
    }

    @Override // l.C14941, l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewM21092 = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
            ((TextView) viewM21092.findViewById(R.id.textView)).setText(R.string.MT_Protector);
            viewM21092.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.ۚۘۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C11354 c11354 = this.f18878;
                    C18452 c18452 = new C18452(c11354.f35758.requireContext(), view, 0);
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c18452.m42994(new InterfaceC21436() { // from class: l.֫ۘۧ
                        @Override // l.InterfaceC21436
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c11354.f35758.f51495.m46604();
                            return true;
                        }
                    });
                    c18452.mo21878();
                }
            });
            return new C12846(viewM21092);
        }
        if (i == 1) {
            return new ViewOnClickListenerC17321(this.f35758, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM21093 = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM21093.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C12846(viewM21093);
    }

    @Override // l.C14941, l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C15829 c15829 = this.f35758;
        if (!c15829.f51494.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c15829.f51494.size()) {
                ((ViewOnClickListenerC17321) abstractC11800).m40669((String) c15829.f51494.get(i2));
                return;
            }
            i = i2 - c15829.f51494.size();
        }
        if (i > 0) {
            super.onBindViewHolder(abstractC11800, i - 1);
        }
    }

    @Override // l.C14941, l.AbstractC12964
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount > 0) {
            itemCount++;
        }
        C15829 c15829 = this.f35758;
        return !c15829.f51494.isEmpty() ? c15829.f51494.size() + 1 + itemCount : itemCount;
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo28663() {
        C15829 c15829 = this.f35758;
        if (c15829.f51494.isEmpty()) {
            return 1;
        }
        return c15829.f51494.size() + 2;
    }
}
