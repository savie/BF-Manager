package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P97N */
/* JADX INFO: loaded from: classes3.dex */
public final class C12502 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22149 f41802;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView[] f41803;

    public C12502(C11545 c11545) {
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        this.f41802 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31051() {
        this.f41802.m49139();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31055(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory() || !(interfaceC2557 instanceof C6151)) {
            throw new IllegalArgumentException();
        }
        C6151 c6151 = (C6151) interfaceC2557;
        String name = c6151.getName();
        C22149 c22149 = this.f41802;
        c22149.m49151(name, (ViewOnLongClickListenerC10944) null);
        c22149.m49150(m31050(c6151.getParent()), (View.OnLongClickListener) null);
        c22149.m49148(R.string.MT_Protector);
        c22149.m49157(c6151.getSize());
        C16137 c16137M17155 = c6151.m17155();
        if (c16137M17155 != null) {
            c22149.m49162(c16137M17155.m38202());
            c22149.m49142(R.string.MT_Protector, C5319.m14744(c16137M17155.m38208()));
            c22149.m49142(R.string.MT_Protector, C6730.m18162(C11904.f39934.mo33986(), c16137M17155.m38199()));
        } else {
            c22149.m49162(c6151.getTime());
        }
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31056(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985() || !(interfaceC2557 instanceof C6151)) {
            throw new IllegalArgumentException();
        }
        C6151 c6151 = (C6151) interfaceC2557;
        String name = c6151.getName();
        C22149 c22149 = this.f41802;
        c22149.m49151(name, (ViewOnLongClickListenerC10944) null);
        c22149.m49150(m31050(c6151.getParent()), (View.OnLongClickListener) null);
        c22149.m49148(R.string.MT_Protector);
        c22149.m49157(0L);
        C16137 c16137M17155 = c6151.m17155();
        if (c16137M17155 != null) {
            c22149.m49162(c16137M17155.m38202());
            c22149.m49142(R.string.MT_Protector, C5319.m14744(c16137M17155.m38208()));
            c22149.m49142(R.string.MT_Protector, C6730.m18162(C11904.f39934.mo33986(), c16137M17155.m38199()));
        } else {
            c22149.m49162(c6151.getTime());
        }
        c22149.m49143(R.string.MT_Protector, new C9023()).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C13958(5));
        c22149.m49140();
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31054(String str, List list) {
        C22149 c22149 = this.f41802;
        c22149.m49152(list);
        c22149.m49150(m31050(str), (View.OnLongClickListener) null);
        c22149.m49157(0L);
        c22149.m49143(R.string.MT_Protector, new C5800(4)).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C12441(9));
        c22149.m49140();
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31050(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        if (strM28608.length() > 1 && strM28608.indexOf(47, 1) == strM28608.length() - 1) {
            strM28608 = "/";
        }
        C23791 c23791M35096 = C14619.m35096(strM28608);
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        if (c23791M35096 == null) {
            return strM39288.concat("/");
        }
        StringBuilder sbM23356 = C9023.m23356(strM39288);
        sbM23356.append(c23791M35096.m52326());
        return sbM23356.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31053(DialogInterface.OnDismissListener onDismissListener) {
        this.f41802.m49149(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31052(int i, int i2, long j) {
        if (this.f41803 == null) {
            C22149 c22149 = this.f41802;
            this.f41803 = new TextView[]{c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600()};
        }
        C15052.m36042(this.f41803[0], j);
        this.f41803[1].setText(String.valueOf(i));
        this.f41803[2].setText(String.valueOf(i2));
    }
}
