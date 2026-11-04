package l;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C4981 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17325;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f17326 = new ArrayList(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4981 m15189() {
        return new C4981();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15190() {
        this.f17325 = true;
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9654(InterfaceC8929 interfaceC8929) {
        C1998 c1998 = new C1998();
        interfaceC8929.mo23841(C11245.class, new C23627());
        interfaceC8929.mo23841(C21467.class, new C25119());
        interfaceC8929.mo23841(C3567.class, new C5727());
        interfaceC8929.mo23841(C12516.class, new C11692());
        interfaceC8929.mo23841(C18483.class, c1998);
        interfaceC8929.mo23841(C9532.class, c1998);
        interfaceC8929.mo23841(C14007.class, new C16167());
        interfaceC8929.mo23841(C8042.class, new C16913());
        interfaceC8929.mo23841(C2821.class, new C17659());
        interfaceC8929.mo23841(C16466.class, new C3489());
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9653(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C7964.m21665(textView, spannableStringBuilder);
        C1252[] c1252Arr = (C1252[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1252.class);
        if (c1252Arr != null) {
            for (C1252 c1252 : c1252Arr) {
                spannableStringBuilder.removeSpan(c1252);
            }
        }
        spannableStringBuilder.setSpan(new C1252(textView), 0, spannableStringBuilder.length(), 18);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9652(TextView textView) {
        if (this.f17325 || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8843(InterfaceC11078 interfaceC11078) {
        interfaceC11078.mo17052(C24672.class, new C18537(this));
        interfaceC11078.mo17052(C11245.class, new C0638());
        interfaceC11078.mo17052(C21467.class, new C8096());
        interfaceC11078.mo17052(C3567.class, new C19283());
        interfaceC11078.mo17052(C12516.class, new C10332());
        interfaceC11078.mo17052(C18483.class, new C1384());
        interfaceC11078.mo17052(C9532.class, new C9586());
        interfaceC11078.mo17052(C1330.class, new C2875());
        interfaceC11078.mo17052(C20721.class, new C13184());
        interfaceC11078.mo17052(C19450.class, new C13184());
        interfaceC11078.mo17052(C14007.class, new C7350());
        interfaceC11078.mo17052(C16466.class, new C12570());
        interfaceC11078.mo17052(C8042.class, new C6605());
        interfaceC11078.mo17052(C12737.class, new C24505());
        interfaceC11078.mo17052(C0584.class, new C4367());
        interfaceC11078.mo17052(C14974.class, new C14807());
        interfaceC11078.mo17052(C2821.class, new C21521());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15188(InterfaceC20029 interfaceC20029, String str, String str2, AbstractC23705 abstractC23705) {
        interfaceC20029.mo7366(abstractC23705);
        int length = interfaceC20029.length();
        C20775 c20775Builder = interfaceC20029.builder();
        c20775Builder.append((char) 160);
        c20775Builder.append('\n');
        interfaceC20029.mo7360().m26735().getClass();
        c20775Builder.append((CharSequence) str2);
        interfaceC20029.mo7362();
        interfaceC20029.builder().append((char) 160);
        AbstractC22881.f74345.m29674(interfaceC20029.mo7334(), str);
        interfaceC20029.mo7340(abstractC23705, length);
        interfaceC20029.mo7363(abstractC23705);
    }
}
