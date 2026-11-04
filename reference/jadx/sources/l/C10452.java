package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes4.dex */
public class C10452 extends AbstractC16610 {

    /* JADX INFO: renamed from: ᩸֨᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f33257 = {9062, -6605, -6623, -6602, -6619, -6655, -6605, -6640, -6623, -6604, -6616, -6615, -6610, -6608, -6603, -6604, -6640, -6623, -6604, -6616, -6543, -6615, -6610, -6608, -6603, -6604, -6640, -6623, -6604, -6616, -6542, -6615, -6620, -6542, -6610, -6623, -6611, -6619, -6615, -6617, -6610, -6609, -6606, -6619, -6655, -6620, -6620, -6641, -6606, -6652, -6619, -6612, -6615, -6610, -6618, -6609, -6546, -6614, -6605, -6609, -6610, -6602, -6619, -6606, -6605, -6615, -6609, -6610, -6653, -6609, -6620, -6619, -6618, -6615, -6612, -6619, -6542, -6618, -6615, -6612, -6619, -6543, -6623, -6600, -6611, -6612, -6604, -6599, -6608, -6619, -6622, -6545, -6623, -6545, -31842, -25747, 28159, 30824, -27120, -29659, -26902, 30435, 26653, -26208, -28346, 30608};

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f33258;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f33259;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f33260 = new AtomicInteger();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f33261;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f33262;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 193121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public l.C12187 mo2531() {
        /*
            Method dump skipped, instruction units count: 19312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10452.mo2531():l.ۨۜۧ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m26874(C22941 c22941, C21246 c21246, String str) throws Throwable {
        C14955 c14955M35973 = C14955.m35973(c22941.m51727(c22941.m51724(str)));
        c14955M35973.m35986(c21246, this.f33261, this.f33258);
        return c14955M35973.m35993();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        this.f33259 = true;
        m26875(main, c12187);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26875(ContextWrapper contextWrapper, C12187 c12187) {
        if (c12187.m30474()) {
            if (this.f33260.get() == 0) {
                this.f33262.mo4296();
                C22673.m51159(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC16677.class);
                intent.setData(this.f33262.m49836());
                intent.putExtra("savedAsPath", m43865("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044;
        if (!this.f33259) {
            m26875(C21576.m49084(), c12187);
        }
        if (!c12187.m30474() && (abstractC22044 = this.f33262) != null) {
            abstractC22044.mo4296();
        }
        AbstractC22044 abstractC22045 = this.f33258;
        if (abstractC22045 != null) {
            abstractC22045.mo4296();
        }
        C6331.m18055();
    }
}
