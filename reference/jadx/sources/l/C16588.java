package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16588 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53666;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f53667;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f53668;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6595 f53669;

    public C16588(AbstractActivityC17204 abstractActivityC17204, String str) {
        this.f53667 = abstractActivityC17204;
        this.f53666 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8193(this.f53667, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۧۘ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C16588 c16588 = this.f35779;
                c16588.f7780.m33188(new Runnable() { // from class: l.᩻ۘ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6595 interfaceC6595 = c16588.f53669;
                        if (interfaceC6595 != null) {
                            interfaceC6595.cancel();
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String strGroup;
        C0496 c0496 = new C0496();
        c0496.m2394(C23302.f75464);
        String str = this.f53666;
        c0496.m2397(str);
        C7954 c7954M2389 = c0496.m2389();
        InterfaceC6595 interfaceC6595M54450 = C23302.f75465.m54450(c7954M2389);
        this.f53669 = interfaceC6595M54450;
        C9444 c9444Execute = interfaceC6595M54450.execute();
        AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
        InputStream inputStreamM23391 = abstractC8699M24818 != null ? abstractC8699M24818.m23391() : null;
        if (inputStreamM23391 == null) {
            throw new IllegalStateException("Response does not contain body: ".concat(str));
        }
        AbstractC22044 abstractC22044 = C6382.f21565;
        String strM24817 = c9444Execute.m24817("Content-Disposition");
        if (strM24817 != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\"]+)\"?").matcher(strM24817);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = (String) C7750.m21093(1, c7954M2389.m21649().m39870());
            }
        } else {
            strGroup = (String) C7750.m21093(1, c7954M2389.m21649().m39870());
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(strGroup);
        this.f53668 = abstractC22044M49876;
        abstractC22044M49876.m49840(inputStreamM23391);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C23296 c23296M23973;
        C8969 c8969M23952 = C8969.m23952(this.f53668.getName(), true);
        boolean zM23970 = c8969M23952.m23970();
        AbstractActivityC17204 abstractActivityC17204 = this.f53667;
        if (zM23970 && (c23296M23973 = c8969M23952.m23973()) != null) {
            C20312.m46653(abstractActivityC17204, this.f53668, c8969M23952.m23975()).m46659(c23296M23973);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriM49878 = this.f53668.m49878();
        intent.setDataAndType(uriM49878, c8969M23952.m23975());
        intent.addFlags(268435456);
        C1112.m4126(intent, uriM49878);
        abstractActivityC17204.startActivity(intent);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f53667.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
