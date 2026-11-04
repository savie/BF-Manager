package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۚ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes3.dex */
public final class C5662 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13119 f19544;

    public C5662(C4170 c4170) {
        this.f19544 = new C13119(c4170);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5662 m16650(C13921 c13921) {
        C24308 c24308 = new C24308();
        c24308.m54343(C3296.f10757);
        c24308.m54342();
        c24308.m54346(C6907.m19160(4.0f));
        if (C3296.m10878()) {
            c24308.m54347(-14671840);
            c24308.m54344(-15724528);
            c24308.m54345(-14671840);
        } else {
            c24308.m54347(-1);
            c24308.m54344(-591622);
            c24308.m54345(-1);
        }
        return new C5662(new C4170(c24308));
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9652(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C16102.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        if (textView.getTag(R.id.MT_Protector) == null) {
            ViewOnAttachStateChangeListenerC23562 viewOnAttachStateChangeListenerC23562 = new ViewOnAttachStateChangeListenerC23562(textView);
            textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC23562);
            textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC23562);
        }
        C20578 c20578 = new C20578(textView);
        for (Object obj : spans) {
            ((C16102) obj).m38261(c20578);
        }
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9657(TextView textView) {
        this.f19544.m32597();
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9653(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC12373.m30854(textView);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9656(C11991 c11991) {
        c11991.m30141(Collections.singleton(new C16881()));
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8843(InterfaceC11078 interfaceC11078) {
        interfaceC11078.mo17052(C19865.class, new C15356());
        C13119 c13119 = this.f19544;
        interfaceC11078.mo17052(C15389.class, new C19832(c13119));
        interfaceC11078.mo17052(C11660.class, new C22816(c13119));
        interfaceC11078.mo17052(C1966.class, new C10881(c13119));
        interfaceC11078.mo17052(C5695.class, new C22070(c13119));
    }
}
