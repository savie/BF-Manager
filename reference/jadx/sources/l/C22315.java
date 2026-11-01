package l;

import android.R;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22315 extends AbstractC15260 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC15260 f72870;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f72871;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f72872;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC15260 f72873;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC15260 f72874;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f72875;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f72876;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f72877;

    public C22315(C17367 c17367) {
        super(5);
        this.f72872 = c17367.m40458();
        this.f72876 = c17367.m40458();
        if (c17367.m40461()) {
            this.f72875 = c17367.m40458();
            this.f72870 = c17367.m40461() ? AbstractC15260.m36535(c17367) : null;
        } else {
            this.f72875 = null;
            this.f72870 = null;
        }
        if (c17367.m40461()) {
            this.f72871 = c17367.m40458();
            this.f72874 = c17367.m40461() ? AbstractC15260.m36535(c17367) : null;
        } else {
            this.f72871 = null;
            this.f72874 = null;
        }
        if (c17367.m40461()) {
            this.f72877 = c17367.m40458();
            this.f72873 = c17367.m40461() ? AbstractC15260.m36535(c17367) : null;
        } else {
            this.f72877 = null;
            this.f72873 = null;
        }
    }

    @Override // l.AbstractC15260
    /* JADX INFO: renamed from: ۙ */
    public final void mo4217(AbstractActivityC12483 abstractActivityC12483) {
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21277(this.f72872);
        c8067BuildDialog.m21261("");
        String str = this.f72875;
        if (str != null) {
            c8067BuildDialog.m21272(str, new DialogInterfaceOnClickListenerC14537(5, this, abstractActivityC12483));
        }
        String str2 = this.f72871;
        if (str2 != null) {
            c8067BuildDialog.m21262(str2, new DialogInterfaceOnClickListenerC11732(0, this, abstractActivityC12483));
        }
        String str3 = this.f72877;
        if (str3 != null) {
            c8067BuildDialog.m21278(str3, new DialogInterfaceOnClickListenerC2558(0, this, abstractActivityC12483));
        }
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C23250.m51309(dialogInterfaceC19356M21269);
        TextView textView = (TextView) dialogInterfaceC19356M21269.m44364(R.id.message);
        textView.setLineSpacing(C13932.m33769(2.0f), 1.0f);
        textView.setTextIsSelectable(true);
        InterfaceC22644 interfaceC22644M35579 = AbstractC14883.m35579(abstractActivityC12483);
        interfaceC22644M35579.mo47705(new C5381(true).m1041());
        interfaceC22644M35579.build().mo20653(textView, this.f72876);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49478(C22315 c22315, AbstractActivityC12483 abstractActivityC12483) {
        AbstractC15260 abstractC15260 = c22315.f72870;
        if (abstractC15260 != null) {
            abstractC15260.mo4217(abstractActivityC12483);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49479(C22315 c22315, AbstractActivityC12483 abstractActivityC12483) {
        AbstractC15260 abstractC15260 = c22315.f72874;
        if (abstractC15260 != null) {
            abstractC15260.mo4217(abstractActivityC12483);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49477(C22315 c22315, AbstractActivityC12483 abstractActivityC12483) {
        AbstractC15260 abstractC15260 = c22315.f72873;
        if (abstractC15260 != null) {
            abstractC15260.mo4217(abstractActivityC12483);
        }
    }
}
