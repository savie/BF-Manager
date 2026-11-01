package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20553 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f66550;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f66552;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC11617 f66553;

    public C20553(AbstractActivityC12483 abstractActivityC12483, String str) {
        this.f66552 = abstractActivityC12483;
        this.f66551 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10248(this.f66552, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۤ֨᩺
            @Override // java.lang.Runnable
            public final void run() {
                C20553 c20553 = this.f34076;
                c20553.f12806.m40697(new Runnable() { // from class: l.۟֨᩺
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11617 interfaceC11617 = this.f23885.f66553;
                        if (interfaceC11617 != null) {
                            interfaceC11617.cancel();
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String strGroup;
        C6490 c6490 = new C6490();
        c6490.m17683(C0091.f1007);
        String str = this.f66551;
        c6490.m17686(str);
        C22719 c22719M17678 = c6490.m17678();
        InterfaceC11617 interfaceC11617M14157 = C0091.f1006.m14157(c22719M17678);
        this.f66553 = interfaceC11617M14157;
        C18485 c18485Execute = interfaceC11617M14157.execute();
        AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
        InputStream inputStreamM44051 = abstractC19191M42860 != null ? abstractC19191M42860.m44051() : null;
        if (inputStreamM44051 == null) {
            throw new IllegalStateException("Response does not contain body: ".concat(str));
        }
        AbstractC20745 abstractC20745 = C11904.f39939;
        String strM42859 = c18485Execute.m42859("Content-Disposition");
        if (strM42859 != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\"]+)\"?").matcher(strM42859);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = (String) C3012.m8974(1, c22719M17678.m50355().m34736());
            }
        } else {
            strGroup = (String) C3012.m8974(1, c22719M17678.m50355().m34736());
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(strGroup);
        this.f66550 = abstractC20745M46690;
        abstractC20745M46690.m46694(inputStreamM44051);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C5990 c5990M48182;
        C21512 c21512M48160 = C21512.m48160(this.f66550.getName(), true);
        boolean zM48179 = c21512M48160.m48179();
        AbstractActivityC12483 abstractActivityC12483 = this.f66552;
        if (zM48179 && (c5990M48182 = c21512M48160.m48182()) != null) {
            C23630.m52095(abstractActivityC12483, this.f66550, c21512M48160.m48185()).m52101(c5990M48182);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriM46712 = this.f66550.m46712();
        intent.setDataAndType(uriM46712, c21512M48160.m48185());
        intent.addFlags(268435456);
        C21273.m47737(intent, uriM46712);
        abstractActivityC12483.startActivity(intent);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f66552.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
