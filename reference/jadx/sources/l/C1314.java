package l;

import android.graphics.Canvas;
import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.֨ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1314 implements InterfaceC2630 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14715 f4724;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10262 f4725;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2783 f4726;

    public C1314(C24132 c24132) {
        C13921 c13921 = new C13921(1);
        this.f4724 = new C14715();
        C2783 c2783 = new C2783(c24132, c13921);
        this.f4726 = c2783;
        this.f4725 = c2783.f9168;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m4828() {
        return this.f4726.m9241();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4837(InterfaceC9629 interfaceC9629) {
        this.f4726.m9248(interfaceC9629);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m4818(InterfaceC9629 interfaceC9629) {
        this.f4726.m9232(interfaceC9629);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4832(InterfaceC9629 interfaceC9629, int i, int i2) {
        this.f4726.m9243(interfaceC9629, i, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4820(InterfaceC9629 interfaceC9629) {
        this.f4726.m9234(interfaceC9629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4804(InterfaceC9629 interfaceC9629, int i, int i2) {
        this.f4726.m9217(interfaceC9629, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4797() {
        this.f4726.m9213();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4824() {
        this.f4726.m9240();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4813(InterfaceC9629 interfaceC9629) {
        this.f4726.m9227(interfaceC9629);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m4822() {
        this.f4726.m9230();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4803(InterfaceC9629 interfaceC9629) {
        this.f4726.m9216(interfaceC9629);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m4826(InterfaceC9629 interfaceC9629) {
        this.f4726.m9239(interfaceC9629);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m4823() {
        m4824();
        this.f4726.m9250();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m4840() {
        return this.f4726.m9235();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4816() {
        return this.f4726.m9237();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4791() {
        return this.f4726.m9236();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m4827(int i, int i2) {
        return this.f4726.m9219(i, i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m4810() {
        return this.f4726.m9229();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m4829(int i, int i2) {
        C9736 c9736M9233 = this.f4726.m9233();
        if (c9736M9233 == null || !c9736M9233.m25367(i, i2)) {
            return Collections.EMPTY_LIST;
        }
        C16800 c16800M25362 = c9736M9233.m25362(i, i2);
        return c16800M25362 == null ? Collections.EMPTY_LIST : c16800M25362.m39676();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4802(C6178 c6178) {
        this.f4726.m9215(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4809(C20348 c20348, int i) {
        return this.f4726.m9223(c20348, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4806(CharSequence charSequence) {
        return this.f4726.m9220(charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4830(CharSequence charSequence) {
        this.f4726.m9242(charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4831(InterfaceC9629 interfaceC9629) {
        if (this.f4726.m9246(interfaceC9629)) {
            m4830((CharSequence) interfaceC9629);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4799(int i, int i2, int i3, CharSequence charSequence) {
        this.f4726.m9214(i, i2, i3, charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4835(int i, int i2) {
        return this.f4724.m35401(i, i2, this.f4726.m9251());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m4793(int i, int i2) {
        return this.f4724.m35391(i, i2, this.f4726.m9251());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19213 m4812(int i, int i2) {
        return this.f4724.m35402(i, i2, this.f4726.m9251());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m4834(int i) {
        return this.f4724.m35400(i, this.f4726.m9251());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m4792(CharSequence charSequence, int i, int i2, float f, C5438 c5438) {
        return this.f4724.m35390(this.f4726.m9251(), charSequence, i, i2, f, c5438);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.֡ܽᩴ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19608 m4796(int i, final int i2, C5438 c5438, CharSequence charSequence) {
        final C1270 c1270M9251 = this.f4726.m9251();
        if (c1270M9251 != null && c1270M9251.m4628() != 0) {
            final C21407 c21407 = new C21407();
            c21407.m48710(c1270M9251);
            return c5438.m16196(charSequence, i, i2, 0.0f, (C0568) new IntUnaryOperator() { // from class: l.֡ܽᩴ
                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return C21263.$default$andThen(this, intUnaryOperator);
                }

                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return C21263.$default$compose(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    if (i3 < c1270M9251.m4628()) {
                        C21407 c21408 = c21407;
                        if (c21408.m48711(i3)) {
                            return c21408.m48709();
                        }
                    }
                    return i2;
                }
            });
        }
        return c5438.m16196(charSequence, i, i2, 0.0f, (C0568) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4801(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, C10232 c10232, C14540 c14540) {
        C2783 c2783 = this.f4726;
        C14715 c14715 = this.f4724;
        c2783.m9218(c14715, i, i2);
        int i5 = -1;
        try {
            try {
                this.f4724.m35396(c2783.m9251(), canvas, charSequence, i, i2, f, i3, i4, c10232, c14540);
                if (c14715.m35398()) {
                    c14715.m35394(1.0f, 0);
                    c2783.m9212();
                }
                c14715.m35397((C23667) null, -1, -1, 0);
            } catch (Throwable th) {
                th = th;
                i5 = -1;
                c14715.m35397((C23667) null, i5, i5, 0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4800(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, C10232 c10232, C14540 c14540, int[] iArr) {
        this.f4724.m35395(this.f4726.m9251(), canvas, charSequence, i, i2, f, f2, i3, c10232, c14540, iArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4815(int i) {
        C1270 c1270M9251 = this.f4726.m9251();
        return c1270M9251 != null && c1270M9251.m4633() == 1 && c1270M9251.m4631(0).m30045() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4805(int i, int i2, int i3) {
        return this.f4724.m35399(this.f4726.m9251(), i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4798(float f, int i) {
        this.f4724.m35394(f, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4807(String str) {
        return this.f4726.m9221(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4833(String str) {
        return this.f4726.m9245(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4808(C16800 c16800) {
        return this.f4726.m9222(c16800);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m4839() {
        this.f4726.m9225();
    }

    @Override // l.InterfaceC2630
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 mo4795(int i, int i2, CharSequence charSequence) {
        C2783 c2783 = this.f4726;
        C9736 c9736M9211 = c2783.m9211();
        C14715 c14715 = this.f4724;
        if (c9736M9211 != null) {
            return c14715.m35393(c9736M9211, charSequence, i, i2);
        }
        return c14715.m35392(c2783.m9231(), charSequence, i, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9736 m4819() {
        return this.f4726.m9233();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m4811() {
        return this.f4726.m9226();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0855 m4836() {
        return this.f4726.m9247();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 m4825() {
        return this.f4726.m9238();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16800 m4817() {
        return this.f4726.m9224();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4838(InterfaceC9629 interfaceC9629, int i, int i2) {
        this.f4726.m9249(interfaceC9629, i, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m4821(int i, int i2) {
        return this.f4726.m9244(i, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4814(InterfaceC9629 interfaceC9629, int i, int i2) {
        this.f4726.m9228(interfaceC9629, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4790(AbstractActivityC17204 abstractActivityC17204, final InterfaceC9629 interfaceC9629, final int i, final int i2, final int i3) {
        final String string = interfaceC9629.subSequence(i, i2).toString();
        int iM14918 = C4868.m14918(i3, string);
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = new DialogInterfaceOnClickListenerC6316(abstractActivityC17204, (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 11) ? false : true);
        dialogInterfaceOnClickListenerC6316.m18031(new InterfaceC12281() { // from class: l.۟ܽᩴ
            @Override // l.InterfaceC12281
            /* JADX INFO: renamed from: ۙ */
            public final void mo17031(int i4) {
                String strM14910 = C4868.m14910(i3, i4, string);
                if (strM14910 != null) {
                    InterfaceC9629 interfaceC96210 = interfaceC9629;
                    int i5 = i;
                    interfaceC96210.replace(i5, i2, strM14910);
                    interfaceC96210.setSelection(strM14910.length() + i5);
                }
            }
        });
        dialogInterfaceOnClickListenerC6316.m18030(iM14918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m4794(int i) {
        C16800 c16800M25361;
        C9736 c9736M9233 = this.f4726.m9233();
        if (c9736M9233 == null || i < 0 || i >= c9736M9233.m25365() || !c9736M9233.m25367(i, i + 1) || (c16800M25361 = c9736M9233.m25361(c9736M9233.m25357(i))) == null) {
            return null;
        }
        return c16800M25361.m39679(C17941.f58779);
    }
}
