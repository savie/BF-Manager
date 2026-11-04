package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۘ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3802 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f12995;

    public C3802(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        this.f12995 = viewOnClickListenerC11499;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC14242 viewOnClickListenerC14242 = (ViewOnClickListenerC14242) abstractC11800;
        C15243.m36590(viewOnClickListenerC14242, "holder");
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f12995;
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) viewOnClickListenerC11499.f36195.get(i);
        C15243.m36590(interfaceC2386, "<set-?>");
        viewOnClickListenerC14242.f45001 = interfaceC2386;
        viewOnClickListenerC14242.m34567().setText(interfaceC2386.getName());
        if (interfaceC2386.mo8103()) {
            viewOnClickListenerC14242.m34567().setTextColor(C3296.f10768);
        } else {
            viewOnClickListenerC14242.m34567().setTextColor(C3296.f10751);
        }
        if (interfaceC2386.mo8092()) {
            viewOnClickListenerC14242.m34570().setText("");
        } else {
            String strM50714 = C22482.m50714(interfaceC2386.getTime(), (viewOnClickListenerC11499.f36190 & 1) != 0, true);
            if (interfaceC2386.mo8102()) {
                strM50714 = C20196.m46451(strM50714, EnumC7687.f25319, C8311.m22390(interfaceC2386.getSize()));
            }
            viewOnClickListenerC14242.m34570().setText(strM50714);
        }
        C11983 icon = interfaceC2386.getIcon();
        if (icon != null) {
            viewOnClickListenerC14242.m34566().setImageDrawable(icon.m30080());
        }
        viewOnClickListenerC11499.f36178.m22361(viewOnClickListenerC14242);
        ViewOnClickListenerC11499.m28913(viewOnClickListenerC11499, viewOnClickListenerC14242);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15243.m36590(viewGroup, "parent");
        return new ViewOnClickListenerC14242(this.f12995, viewGroup);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f12995.f36195.size();
    }
}
