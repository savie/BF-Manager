package l;

import android.R;
import android.content.DialogInterface;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۖۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2418 extends AbstractC10926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f7746;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f7747;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC10926 f7748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC10926 f7749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f7750;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC10926 f7751;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f7753;

    public C2418(C20348 c20348) {
        super(5);
        this.f7746 = c20348.m46758();
        this.f7752 = c20348.m46758();
        if (c20348.m46753()) {
            this.f7747 = c20348.m46758();
            this.f7749 = c20348.m46753() ? AbstractC10926.m27728(c20348) : null;
        } else {
            this.f7747 = null;
            this.f7749 = null;
        }
        if (c20348.m46753()) {
            this.f7753 = c20348.m46758();
            this.f7748 = c20348.m46753() ? AbstractC10926.m27728(c20348) : null;
        } else {
            this.f7753 = null;
            this.f7748 = null;
        }
        if (c20348.m46753()) {
            this.f7750 = c20348.m46758();
            this.f7751 = c20348.m46753() ? AbstractC10926.m27728(c20348) : null;
        } else {
            this.f7750 = null;
            this.f7751 = null;
        }
    }

    @Override // l.AbstractC10926
    /* JADX INFO: renamed from: ۙ */
    public final void mo1477(final AbstractActivityC17204 abstractActivityC17204) {
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8024(this.f7746);
        c2361BuildDialog.m8008("");
        String str = this.f7747;
        if (str != null) {
            c2361BuildDialog.m8019(str, new DialogInterfaceOnClickListenerC18826(0, this, abstractActivityC17204));
        }
        String str2 = this.f7753;
        if (str2 != null) {
            c2361BuildDialog.m8009(str2, new DialogInterface.OnClickListener() { // from class: l.ۢۘ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2418.m8163(this.f31773, abstractActivityC17204);
                }
            });
        }
        String str3 = this.f7750;
        if (str3 != null) {
            c2361BuildDialog.m8025(str3, new DialogInterface.OnClickListener() { // from class: l.֨ۘ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2418.m8161(this.f3446, abstractActivityC17204);
                }
            });
        }
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C5416.m16144(dialogInterfaceC8327M8016);
        TextView textView = (TextView) dialogInterfaceC8327M8016.m22423(R.id.message);
        textView.setLineSpacing(C6907.m19160(2.0f), 1.0f);
        textView.setTextIsSelectable(true);
        InterfaceC18625 interfaceC18625M3048 = AbstractC0726.m3048(abstractActivityC17204);
        interfaceC18625M3048.mo22096(new C9129(true).m52419());
        interfaceC18625M3048.build().mo3052(textView, this.f7752);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8162(C2418 c2418, AbstractActivityC17204 abstractActivityC17204) {
        AbstractC10926 abstractC10926 = c2418.f7749;
        if (abstractC10926 != null) {
            abstractC10926.mo1477(abstractActivityC17204);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8163(C2418 c2418, AbstractActivityC17204 abstractActivityC17204) {
        AbstractC10926 abstractC10926 = c2418.f7748;
        if (abstractC10926 != null) {
            abstractC10926.mo1477(abstractActivityC17204);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8161(C2418 c2418, AbstractActivityC17204 abstractActivityC17204) {
        AbstractC10926 abstractC10926 = c2418.f7751;
        if (abstractC10926 != null) {
            abstractC10926.mo1477(abstractActivityC17204);
        }
    }
}
