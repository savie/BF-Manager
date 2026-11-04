package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P97N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2363 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5304 f7617;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TextView[] f7618;

    public C2363(C8614 c8614) {
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        this.f7617 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8028() {
        this.f7617.m15931();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8032(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory() || !(interfaceC2386 instanceof C6838)) {
            throw new IllegalArgumentException();
        }
        C6838 c6838 = (C6838) interfaceC2386;
        String name = c6838.getName();
        C5304 c5304 = this.f7617;
        c5304.m15916(name, (ViewOnLongClickListenerC9293) null);
        c5304.m15915(m8027(c6838.getParent()), (View.OnLongClickListener) null);
        c5304.m15913(R.string.MT_Protector);
        c5304.m15922(c6838.getSize());
        C22616 c22616M19056 = c6838.m19056();
        if (c22616M19056 != null) {
            c5304.m15929(c22616M19056.m50959());
            c5304.m15907(R.string.MT_Protector, C22482.m50718(c22616M19056.m50961()));
            c5304.m15907(R.string.MT_Protector, C11293.m28549(C6382.f21566.mo4294(), c22616M19056.m50960()));
        } else {
            c5304.m15929(c6838.getTime());
        }
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8033(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090() || !(interfaceC2386 instanceof C6838)) {
            throw new IllegalArgumentException();
        }
        C6838 c6838 = (C6838) interfaceC2386;
        String name = c6838.getName();
        C5304 c5304 = this.f7617;
        c5304.m15916(name, (ViewOnLongClickListenerC9293) null);
        c5304.m15915(m8027(c6838.getParent()), (View.OnLongClickListener) null);
        c5304.m15913(R.string.MT_Protector);
        c5304.m15922(0L);
        C22616 c22616M19056 = c6838.m19056();
        if (c22616M19056 != null) {
            c5304.m15929(c22616M19056.m50959());
            c5304.m15907(R.string.MT_Protector, C22482.m50718(c22616M19056.m50961()));
            c5304.m15907(R.string.MT_Protector, C11293.m28549(C6382.f21566.mo4294(), c22616M19056.m50960()));
        } else {
            c5304.m15929(c6838.getTime());
        }
        c5304.m15908(R.string.MT_Protector, new ASN1BMPString$$ExternalSyntheticOutline0(3)).m49281(8);
        c5304.m15908(R.string.MT_Protector, new ExternalValue$$ExternalSyntheticOutline0(6));
        c5304.m15905();
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8031(String str, List list) {
        C5304 c5304 = this.f7617;
        c5304.m15917(list);
        c5304.m15915(m8027(str), (View.OnLongClickListener) null);
        c5304.m15922(0L);
        c5304.m15908(R.string.MT_Protector, new C24966(8)).m49281(8);
        c5304.m15908(R.string.MT_Protector, new C20551(4));
        c5304.m15905();
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8027(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        if (strM20187.length() > 1 && strM20187.indexOf(47, 1) == strM20187.length() - 1) {
            strM20187 = "/";
        }
        C4775 c4775M49624 = C21929.m49624(strM20187);
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        if (c4775M49624 == null) {
            return strM49088.concat("/");
        }
        StringBuilder sbM27333 = C10732.m27333(strM49088);
        sbM27333.append(c4775M49624.m14738());
        return sbM27333.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8030(DialogInterface.OnDismissListener onDismissListener) {
        this.f7617.m15914(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8029(int i, int i2, long j) {
        if (this.f7618 == null) {
            C5304 c5304 = this.f7617;
            this.f7618 = new TextView[]{c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282()};
        }
        C16773.m39593(this.f7618[0], j);
        this.f7618[1].setText(String.valueOf(i));
        this.f7618[2].setText(String.valueOf(i2));
    }
}
