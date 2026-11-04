package l;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.n.b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes.dex */
public class C23302 extends AbstractC24593 implements InterfaceC14195 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C12560 f75464;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C24363 f75465;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f75467;

    public C23302(boolean z) {
        this.f75467 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m52419() {
        return Arrays.asList(new C7218(), C2678.m8841(new C10621()), C5662.m16650(new C13921(1)), C19941.m45865(new C22556()), C21810.m49464(this), C24417.m54638(new C13929(LinkMovementMethod.getInstance())), this);
    }

    static {
        C3611 c3611 = new C3611(new File(C21576.m49074(), "markwon"));
        C6463 c6463M54459 = C21576.m49093().m54459();
        c6463M54459.m18272(c3611);
        f75465 = c6463M54459.m18265();
        C20765 c20765 = new C20765();
        TimeUnit timeUnit = TimeUnit.DAYS;
        c20765.m47472();
        c20765.m47471();
        f75464 = c20765.m47470();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0726 m52413(Context context, boolean z) {
        InterfaceC18625 interfaceC18625M3048 = AbstractC0726.m3048(context);
        interfaceC18625M3048.mo22096(new C23302(z).m52419());
        return interfaceC18625M3048.build();
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public void mo2600(C19897 c19897) {
        c19897.m45829(C6907.m19160(5.0f));
        c19897.m45822();
        c19897.m45825(C3296.f10757);
        boolean z = this.f75467;
        c19897.m45824(!z ? 1 : 0);
        c19897.m45821(C3296.f10757);
        c19897.m45817(1);
        c19897.m45820(!z ? new float[]{1.8f, 1.5f, 1.25f, 1.1f, 1.0f, 0.9f} : new float[]{1.5f, 1.35f, 1.2f, 1.1f, 1.0f, 0.9f});
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9657(TextView textView) {
        this.f75466 = textView == null ? 0 : textView.getLineHeight() - textView.getPaint().getFontMetricsInt(null);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9653(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        textView.setOnTouchListener(new ViewOnTouchListenerC12859(textView, textView.getMovementMethod(), 0));
    }

    /* JADX INFO: renamed from: ۙ */
    public float mo2599(AbstractC4534 abstractC4534) {
        if (!(abstractC4534 instanceof C8042)) {
            return 0.4f;
        }
        int iM21914 = ((C8042) abstractC4534).m21914();
        if (iM21914 == 1) {
            return 2.0f;
        }
        if (iM21914 != 2) {
            return iM21914 != 3 ? 0.4f : 0.75f;
        }
        return 1.0f;
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8843(InterfaceC11078 interfaceC11078) {
        interfaceC11078.mo17053(new C5402(this));
        interfaceC11078.mo17052(C18483.class, new InterfaceC23013() { // from class: l.ᩴۘ᩻
            @Override // l.InterfaceC23013
            /* JADX INFO: renamed from: ۙ */
            public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
                C18483 c18483 = (C18483) abstractC4534;
                this.f63127.m52414(interfaceC20029, c18483.m43073(), c18483.m43077(), c18483);
            }
        });
        interfaceC11078.mo17052(C9532.class, new InterfaceC23013() { // from class: l.ܳۘ᩻
            @Override // l.InterfaceC23013
            /* JADX INFO: renamed from: ۙ */
            public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
                C9532 c9532 = (C9532) abstractC4534;
                this.f49282.m52414(interfaceC20029, null, c9532.m24945(), c9532);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52414(InterfaceC20029 interfaceC20029, String str, String str2, AbstractC23705 abstractC23705) {
        interfaceC20029.mo7366(abstractC23705);
        C20775 c20775Builder = interfaceC20029.builder();
        int length = interfaceC20029.length();
        int iM36935 = interfaceC20029.mo7360().m26734().m36935();
        c20775Builder.append('\n');
        c20775Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM36935 - this.f75466, 0)), c20775Builder.length() - 1, c20775Builder.length(), 33);
        interfaceC20029.mo7360().m26735().getClass();
        c20775Builder.append((CharSequence) str2);
        c20775Builder.append('\n');
        c20775Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM36935 - (this.f75466 * 2), 0)), c20775Builder.length() - 1, c20775Builder.length(), 33);
        AbstractC22881.f74345.m29674(interfaceC20029.mo7334(), str);
        interfaceC20029.mo7340(abstractC23705, length);
        interfaceC20029.mo7363(abstractC23705);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8845(C19371 c19371) {
        c19371.m44806(new C1673(1));
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo30888(View view, String str) {
        if (str.startsWith("open://")) {
            Activity activityM10534 = C3200.m10534(view.getContext());
            if (activityM10534 instanceof AbstractActivityC17204) {
                new C16588((AbstractActivityC17204) activityM10534, ExternalValue$$ExternalSyntheticOutline0.m(4, str, new StringBuilder(b.a))).m8197();
            }
            return true;
        }
        if (str.startsWith("copy://")) {
            C21576.m49067((CharSequence) str.substring(7));
            return true;
        }
        if (str.startsWith("toast://")) {
            C22673.m51154((CharSequence) str.substring(8));
            return true;
        }
        if (!str.startsWith("toastl://")) {
            return false;
        }
        C22673.m51160(str.substring(9));
        return true;
    }
}
