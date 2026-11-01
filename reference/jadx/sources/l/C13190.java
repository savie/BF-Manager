package l;

import android.graphics.Canvas;
import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.۬ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4S1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13190 implements InterfaceC3685 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3063 f43901;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1194 f43902;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4246 f43903;

    public C13190(C6111 c6111) {
        C0219 c0219 = new C0219();
        this.f43901 = new C3063();
        C4246 c4246 = new C4246(c6111, c0219);
        this.f43903 = c4246;
        this.f43902 = c4246.f15349;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m32649() {
        return this.f43903.m11989();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32620(InterfaceC0507 interfaceC0507) {
        this.f43903.m11966(interfaceC0507);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m32617(InterfaceC0507 interfaceC0507) {
        this.f43903.m11964(interfaceC0507);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32653(InterfaceC0507 interfaceC0507, int i, int i2) {
        this.f43903.m11991(interfaceC0507, i, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m32661(InterfaceC0507 interfaceC0507) {
        this.f43903.m12001(interfaceC0507);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32633(InterfaceC0507 interfaceC0507, int i, int i2) {
        this.f43903.m11972(interfaceC0507, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32627() {
        this.f43903.m11969();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32659() {
        this.f43903.m11998();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32645(InterfaceC0507 interfaceC0507) {
        this.f43903.m11986(interfaceC0507);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32657() {
        this.f43903.m11983();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32632(InterfaceC0507 interfaceC0507) {
        this.f43903.m11971(interfaceC0507);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m32640(InterfaceC0507 interfaceC0507) {
        this.f43903.m11980(interfaceC0507);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m32656() {
        m32659();
        this.f43903.m11997();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m32663() {
        return this.f43903.m11996();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m32642() {
        return this.f43903.m11999();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m32622() {
        return this.f43903.m11995();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m32641(int i, int i2) {
        return this.f43903.m11975(i, i2);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m32648() {
        return this.f43903.m11981();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m32650(int i, int i2) {
        C12942 c12942M12000 = this.f43903.m12000();
        if (c12942M12000 == null || !c12942M12000.m32075(i, i2)) {
            return Collections.EMPTY_LIST;
        }
        C20889 c20889M32072 = c12942M12000.m32072(i, i2);
        return c20889M32072 == null ? Collections.EMPTY_LIST : c20889M32072.m46953();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32634(C11018 c11018) {
        this.f43903.m11974(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32638(C17367 c17367, int i) {
        return this.f43903.m11978(c17367, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32636(CharSequence charSequence) {
        return this.f43903.m11976(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32651(CharSequence charSequence) {
        this.f43903.m11990(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32652(InterfaceC0507 interfaceC0507) {
        if (this.f43903.m11994(interfaceC0507)) {
            m32651((CharSequence) interfaceC0507);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32629(int i, int i2, int i3, CharSequence charSequence) {
        this.f43903.m11970(i, i2, i3, charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m32618(int i, int i2) {
        return this.f43901.m9190(i, i2, this.f43903.m12002());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32624(int i, int i2) {
        return this.f43901.m9180(i, i2, this.f43903.m12002());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22362 m32644(int i, int i2) {
        return this.f43901.m9191(i, i2, this.f43903.m12002());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] m32655(int i) {
        return this.f43901.m9189(i, this.f43903.m12002());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m32623(CharSequence charSequence, int i, int i2, float f, C6585 c6585) {
        return this.f43901.m9179(this.f43903.m12002(), charSequence, i, i2, f, c6585);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۖܶۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12936 m32625(CharSequence charSequence, int i, final int i2, C6585 c6585) {
        final C7027 c7027M12002 = this.f43903.m12002();
        if (c7027M12002 != null && c7027M12002.m18860() != 0) {
            final C2793 c2793 = new C2793();
            c2793.m8488(c7027M12002);
            return c6585.m17860(charSequence, i, i2, 0.0f, (C2605) new IntUnaryOperator() { // from class: l.ۖܶۚ
                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return C15568.$default$andThen(this, intUnaryOperator);
                }

                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return C15568.$default$compose(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    if (i3 < c7027M12002.m18860()) {
                        C2793 c2794 = c2793;
                        if (c2794.m8489(i3)) {
                            return c2794.m8487();
                        }
                    }
                    return i2;
                }
            });
        }
        return c6585.m17860(charSequence, i, i2, 0.0f, (C2605) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32631(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, C4916 c4916, C1590 c1590) {
        C4246 c4246 = this.f43903;
        C3063 c3063 = this.f43901;
        c4246.m11973(c3063, i, i2);
        int i5 = -1;
        try {
            try {
                this.f43901.m9185(c4246.m12002(), canvas, charSequence, i, i2, f, i3, i4, c4916, c1590);
                if (c3063.m9187()) {
                    c3063.m9183(1.0f, 0);
                    c4246.m11982();
                }
                c3063.m9186((C17175) null, -1, -1, 0);
            } catch (Throwable th) {
                th = th;
                i5 = -1;
                c3063.m9186((C17175) null, i5, i5, 0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32630(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, C4916 c4916, C1590 c1590, int[] iArr) {
        this.f43901.m9184(this.f43903.m12002(), canvas, charSequence, i, i2, f, f2, i3, c4916, c1590, iArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m32647(int i) {
        C7027 c7027M12002 = this.f43903.m12002();
        return c7027M12002 != null && c7027M12002.m18865() == 1 && c7027M12002.m18863(0).m37379() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32635(int i, int i2, int i3) {
        return this.f43901.m9188(this.f43903.m12002(), i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32628(float f, int i) {
        this.f43901.m9183(f, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32637(String str) {
        return this.f43903.m11977(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32654(String str) {
        return this.f43903.m11993(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32658() {
        this.f43903.m11984();
    }

    @Override // l.InterfaceC3685
    /* JADX INFO: renamed from: ۙ */
    public final C15682 mo10853(int i, int i2, CharSequence charSequence) {
        C4246 c4246 = this.f43903;
        C12942 c12942M11968 = c4246.m11968();
        C3063 c3063 = this.f43901;
        if (c12942M11968 != null) {
            return c3063.m9182(c12942M11968, charSequence, i, i2);
        }
        return c3063.m9181(c4246.m11963(), charSequence, i, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12942 m32660() {
        return this.f43903.m12000();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m32643() {
        return this.f43903.m11985();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5366 m32619() {
        return this.f43903.m11965();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13128 m32639() {
        return this.f43903.m11979();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20889 m32616() {
        return this.f43903.m11988();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32621(InterfaceC0507 interfaceC0507, int i, int i2) {
        this.f43903.m11967(interfaceC0507, i, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m32662(int i, int i2) {
        return this.f43903.m11992(i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32646(InterfaceC0507 interfaceC0507, int i, int i2) {
        this.f43903.m11987(interfaceC0507, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32615(AbstractActivityC12483 abstractActivityC12483, final InterfaceC0507 interfaceC0507, final int i, final int i2, final int i3) {
        final String string = interfaceC0507.subSequence(i, i2).toString();
        int iM50875 = C23006.m50875(i3, string);
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = new DialogInterfaceOnClickListenerC18046(abstractActivityC12483, (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 11) ? false : true);
        dialogInterfaceOnClickListenerC18046.m42043(new InterfaceC21574() { // from class: l.ۚܶۚ
            @Override // l.InterfaceC21574
            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
            public final void mo14999(int i4) {
                String strM50868 = C23006.m50868(i3, i4, string);
                if (strM50868 != null) {
                    InterfaceC0507 interfaceC0508 = interfaceC0507;
                    int i5 = i;
                    interfaceC0508.replace(i5, i2, strM50868);
                    interfaceC0508.setSelection(strM50868.length() + i5);
                }
            }
        });
        dialogInterfaceOnClickListenerC18046.m42042(iM50875);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m32626(int i) {
        C20889 c20889M32071;
        C12942 c12942M12000 = this.f43903.m12000();
        if (c12942M12000 == null || i < 0 || i >= c12942M12000.m32073() || !c12942M12000.m32075(i, i + 1) || (c20889M32071 = c12942M12000.m32071(c12942M12000.m32066(i))) == null) {
            return null;
        }
        return c20889M32071.m46955(C16387.f52730);
    }
}
