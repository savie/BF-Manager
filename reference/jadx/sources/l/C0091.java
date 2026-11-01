package l;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.n.b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes3.dex */
public class C0091 extends AbstractC0770 implements InterfaceC3618 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C5079 f1006;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C13734 f1007;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f1009;

    public C0091(boolean z) {
        this.f1009 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m1041() {
        return Arrays.asList(new C7472(), C9029.m23360(new C14909()), C11001.m27751(new C0219()), C12474.m30977(new C21258()), C22670.m50203(this), C0811.m3383(new C20878(LinkMovementMethod.getInstance())), this);
    }

    static {
        C2921 c2921 = new C2921(new File(C16737.m39282(), "markwon"));
        C2256 c2256M14172 = C16737.m39297().m14172();
        c2256M14172.m6929(c2921);
        f1006 = c2256M14172.m6922();
        C4560 c4560 = new C4560();
        TimeUnit timeUnit = TimeUnit.DAYS;
        c4560.m12710();
        c4560.m12709();
        f1007 = c4560.m12708();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14883 m1034(Context context, boolean z) {
        InterfaceC22644 interfaceC22644M35579 = AbstractC14883.m35579(context);
        interfaceC22644M35579.mo47705(new C0091(z).m1041());
        return interfaceC22644M35579.build();
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1044(C12536 c12536) {
        c12536.m31162(C13932.m33769(5.0f));
        c12536.m31168();
        c12536.m31173(C20368.f66006);
        boolean z = this.f1009;
        c12536.m31161(!z ? 1 : 0);
        c12536.m31170(C20368.f66006);
        c12536.m31163(1);
        c12536.m31166(!z ? new float[]{1.8f, 1.5f, 1.25f, 1.1f, 1.0f, 0.9f} : new float[]{1.5f, 1.35f, 1.2f, 1.1f, 1.0f, 0.9f});
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1047(TextView textView) {
        this.f1008 = textView == null ? 0 : textView.getLineHeight() - textView.getPaint().getFontMetricsInt(null);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1042(final TextView textView, SpannableStringBuilder spannableStringBuilder) {
        final MovementMethod movementMethod = textView.getMovementMethod();
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: l.۠֨᩺
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                TextView textView2 = textView;
                MovementMethod movementMethod2 = textView2.getMovementMethod();
                MovementMethod movementMethod3 = movementMethod;
                if (movementMethod2 == movementMethod3) {
                    return false;
                }
                textView2.setMovementMethod(movementMethod3);
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float mo1040(AbstractC19367 abstractC19367) {
        if (!(abstractC19367 instanceof C13017)) {
            return 0.4f;
        }
        int iM32196 = ((C13017) abstractC19367).m32196();
        if (iM32196 == 1) {
            return 2.0f;
        }
        if (iM32196 != 2) {
            return iM32196 != 3 ? 0.4f : 0.75f;
        }
        return 1.0f;
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1043(InterfaceC0065 interfaceC0065) {
        interfaceC0065.mo984(new C19142(this));
        interfaceC0065.mo983(C22189.class, new InterfaceC16294() { // from class: l.ᩳ֨᩺
            @Override // l.InterfaceC16294
            /* JADX INFO: renamed from: ۙ */
            public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
                C22189 c22189 = (C22189) abstractC19367;
                this.f56268.m1037(interfaceC12061, c22189.m49225(), c22189.m49229(), c22189);
            }
        });
        interfaceC0065.mo983(C15134.class, new InterfaceC16294() { // from class: l.ᩴ֨᩺
            @Override // l.InterfaceC16294
            /* JADX INFO: renamed from: ۙ */
            public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
                C15134 c15134 = (C15134) abstractC19367;
                this.f58757.m1037(interfaceC12061, null, c15134.m36290(), c15134);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1037(InterfaceC12061 interfaceC12061, String str, String str2, AbstractC14738 abstractC14738) {
        interfaceC12061.mo29964(abstractC14738);
        C2657 c2657Builder = interfaceC12061.builder();
        int length = interfaceC12061.length();
        int iM40660 = interfaceC12061.mo29970().m42692().m40660();
        c2657Builder.append('\n');
        c2657Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM40660 - this.f1008, 0)), c2657Builder.length() - 1, c2657Builder.length(), 33);
        interfaceC12061.mo29970().m42698().getClass();
        c2657Builder.append((CharSequence) str2);
        c2657Builder.append('\n');
        c2657Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM40660 - (this.f1008 * 2), 0)), c2657Builder.length() - 1, c2657Builder.length(), 33);
        AbstractC16769.f53676.m34276(interfaceC12061.mo29965(), str);
        interfaceC12061.mo29967(abstractC14738, length);
        interfaceC12061.mo29969(abstractC14738);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1045(C17704 c17704) {
        c17704.m41248(new C8559(4));
    }

    @Override // l.InterfaceC3618
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1046(View view, String str) {
        if (str.startsWith("open://")) {
            Activity activityM22527 = C8703.m22527(view.getContext());
            if (activityM22527 instanceof AbstractActivityC12483) {
                new C20553((AbstractActivityC12483) activityM22527, C0242.m1616(4, str, new StringBuilder(b.a))).m10243();
            }
            return true;
        }
        if (str.startsWith("copy://")) {
            C16737.m39272((CharSequence) str.substring(7));
            return true;
        }
        if (str.startsWith("toast://")) {
            C15829.m37613((CharSequence) str.substring(8));
            return true;
        }
        if (!str.startsWith("toastl://")) {
            return false;
        }
        C15829.m37619(str.substring(9));
        return true;
    }
}
