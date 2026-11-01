package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۧ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11001 extends AbstractC0770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6061 f37428;

    public C11001(C13262 c13262) {
        this.f37428 = new C6061(c13262);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11001 m27751(C0219 c0219) {
        C1266 c1266 = new C1266();
        c1266.m4598(C20368.f66006);
        c1266.m4597();
        c1266.m4601(C13932.m33769(4.0f));
        if (C20368.m45991()) {
            c1266.m4596(-14671840);
            c1266.m4600(-15724528);
            c1266.m4599(-14671840);
        } else {
            c1266.m4596(-1);
            c1266.m4600(-591622);
            c1266.m4599(-1);
        }
        return new C11001(new C13262(c1266));
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3308(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4794.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        if (textView.getTag(R.id.MT_Protector) == null) {
            ViewOnAttachStateChangeListenerC13968 viewOnAttachStateChangeListenerC13968 = new ViewOnAttachStateChangeListenerC13968(textView);
            textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC13968);
            textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC13968);
        }
        C2677 c2677 = new C2677(textView);
        for (Object obj : spans) {
            ((C4794) obj).m13317(c2677);
        }
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ܰ */
    public final void mo1047(TextView textView) {
        this.f37428.m16464();
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1042(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC5500.m15197(textView);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3309(C9490 c9490) {
        c9490.m24310(Collections.singleton(new C12600()));
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1043(InterfaceC0065 interfaceC0065) {
        interfaceC0065.mo983(C10484.class, new C17350());
        C6061 c6061 = this.f37428;
        interfaceC0065.mo983(C7661.class, new C12412(c6061));
        interfaceC0065.mo983(C0604.class, new C16645(c6061));
        interfaceC0065.mo983(C20361.class, new C0416(c6061));
        interfaceC0065.mo983(C16128.class, new C20173(c6061));
    }
}
