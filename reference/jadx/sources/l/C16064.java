package l;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C16064 extends AbstractC0770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51966;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51967 = new ArrayList(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16064 m38067() {
        return new C16064();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38068() {
        this.f51966 = true;
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3310(InterfaceC9944 interfaceC9944) {
        C23825 c23825 = new C23825();
        interfaceC9944.mo25171(C12312.class, new C13823());
        interfaceC9944.mo25171(C5255.class, new C1951());
        interfaceC9944.mo25171(C2036.class, new C11125());
        interfaceC9944.mo25171(C3447.class, new C14653());
        interfaceC9944.mo25171(C22189.class, c23825);
        interfaceC9944.mo25171(C15134.class, c23825);
        interfaceC9944.mo25171(C8078.class, new C4649());
        interfaceC9944.mo25171(C13017.class, new C9714());
        interfaceC9944.mo25171(C21483.class, new C3362());
        interfaceC9944.mo25171(C5961.class, new C11706());
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1042(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C21583.m48296(textView, spannableStringBuilder);
        C8178[] c8178Arr = (C8178[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C8178.class);
        if (c8178Arr != null) {
            for (C8178 c8178 : c8178Arr) {
                spannableStringBuilder.removeSpan(c8178);
            }
        }
        spannableStringBuilder.setSpan(new C8178(textView), 0, spannableStringBuilder.length(), 18);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3308(TextView textView) {
        if (this.f51966 || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1043(InterfaceC0065 interfaceC0065) {
        interfaceC0065.mo983(C17250.class, new C23120(this));
        interfaceC0065.mo983(C12312.class, new C15359());
        interfaceC0065.mo983(C5255.class, new C21708());
        interfaceC0065.mo983(C2036.class, new C18180());
        interfaceC0065.mo983(C3447.class, new C18886());
        interfaceC0065.mo983(C22189.class, new C8303());
        interfaceC0065.mo983(C15134.class, new C19592());
        interfaceC0065.mo983(C22895.class, new C9009());
        interfaceC0065.mo983(C9799.class, new C6185());
        interfaceC0065.mo983(C20778.class, new C6185());
        interfaceC0065.mo983(C8078.class, new C7597());
        interfaceC0065.mo983(C5961.class, new C5480());
        interfaceC0065.mo983(C13017.class, new C22414());
        interfaceC0065.mo983(C20073.class, new C1246());
        interfaceC0065.mo983(C1021.class, new C13242());
        interfaceC0065.mo983(C15840.class, new C4068());
        interfaceC0065.mo983(C21483.class, new C6891());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38066(InterfaceC12061 interfaceC12061, String str, String str2, AbstractC14738 abstractC14738) {
        interfaceC12061.mo29964(abstractC14738);
        int length = interfaceC12061.length();
        C2657 c2657Builder = interfaceC12061.builder();
        c2657Builder.append((char) 160);
        c2657Builder.append('\n');
        interfaceC12061.mo29970().m42698().getClass();
        c2657Builder.append((CharSequence) str2);
        interfaceC12061.mo29968();
        interfaceC12061.builder().append((char) 160);
        AbstractC16769.f53676.m34276(interfaceC12061.mo29965(), str);
        interfaceC12061.mo29967(abstractC14738, length);
        interfaceC12061.mo29969(abstractC14738);
    }
}
