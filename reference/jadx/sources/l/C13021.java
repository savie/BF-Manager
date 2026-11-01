package l;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13021 extends C21487 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Field f43427;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Constructor f43428;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f43429;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean f43430;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13954 f43431;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public WindowInsets f43432;

    public C13021() {
        this.f43432 = m32198();
    }

    public C13021(C15844 c15844) {
        super(c15844);
        this.f43432 = c15844.m37687();
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo32199(C13954 c13954) {
        WindowInsets windowInsets = this.f43432;
        if (windowInsets != null) {
            this.f43432 = windowInsets.replaceSystemWindowInsets(c13954.f45915, c13954.f45912, c13954.f45914, c13954.f45913);
        }
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo32201(C13954 c13954) {
        this.f43431 = c13954;
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15844 mo32200() {
        m48103();
        C15844 c15844M37669 = C15844.m37669(null, this.f43432);
        c15844M37669.m37679(this.f69815);
        c15844M37669.m37677(this.f43431);
        return c15844M37669;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m32198() {
        if (!f43429) {
            try {
                f43427 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f43429 = true;
        }
        Field field = f43427;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f43430) {
            try {
                f43428 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f43430 = true;
        }
        Constructor constructor = f43428;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }
}
