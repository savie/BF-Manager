package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plus.R;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֡ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C611 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0385 implements InterfaceC22760 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m2190(ByteBuffer byteBuffer, boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2191() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2192(ByteBuffer byteBuffer) {
        throw null;
    }

    public String toString() {
        switch (this.f1919) {
            case 4:
                return "dex-input: Dex Input - 'Load DEX files'";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2189(View view) {
        view.setTag(R.id.MT_Protector, new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()));
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        c14270.m34626(((C14270) c19929.m45858()).m34646());
        c19929.m45857(c14270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2187(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        C17359.requireNonNull(tag);
        Rect rect = (Rect) tag;
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2188(View view, int i, int i2, int i3, int i4) {
        if (i == -1) {
            i = view.getPaddingLeft();
        }
        if (i2 == -1) {
            i2 = view.getPaddingTop();
        }
        if (i3 == -1) {
            i3 = view.getPaddingRight();
        }
        if (i4 == -1) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m2186(Context context, int i) {
        return C22884.m51609().m51616(context, i);
    }
}
