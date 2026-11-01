package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۛ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5926 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f20186;

    public C5926(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        this.f20186 = viewOnClickListenerC8374;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC10866 viewOnClickListenerC10866 = (ViewOnClickListenerC10866) abstractC12554;
        C13465.m32966(viewOnClickListenerC10866, "holder");
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f20186;
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) viewOnClickListenerC8374.f29058.get(i);
        C13465.m32966(interfaceC2557, "<set-?>");
        viewOnClickListenerC10866.f36952 = interfaceC2557;
        viewOnClickListenerC10866.m27225().setText(interfaceC2557.getName());
        if (interfaceC2557.mo7983()) {
            viewOnClickListenerC10866.m27225().setTextColor(C20368.f65973);
        } else {
            viewOnClickListenerC10866.m27225().setTextColor(C20368.f65976);
        }
        if (interfaceC2557.mo7969()) {
            viewOnClickListenerC10866.m27220().setText("");
        } else {
            String strM14740 = C5319.m14740(interfaceC2557.getTime(), (viewOnClickListenerC8374.f29077 & 1) != 0, true);
            if (interfaceC2557.mo7982()) {
                strM14740 = C1679.m5594(strM14740, EnumC19730.f63352, C1791.m5863(interfaceC2557.getSize()));
            }
            viewOnClickListenerC10866.m27220().setText(strM14740);
        }
        C14600 icon = interfaceC2557.getIcon();
        if (icon != null) {
            viewOnClickListenerC10866.m27223().setImageDrawable(icon.m35074());
        }
        viewOnClickListenerC8374.f29051.m8338(viewOnClickListenerC10866);
        ViewOnClickListenerC8374.m21941(viewOnClickListenerC8374, viewOnClickListenerC10866);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13465.m32966(viewGroup, "parent");
        return new ViewOnClickListenerC10866(this.f20186, viewGroup);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f20186.f29058.size();
    }
}
