package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes.dex */
public final class C12382 extends AbstractC15910 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ForegroundColorSpan f41384;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f41385;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f41386;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41387;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextWatcher f41388;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22696 f41389;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f41390;

    static {
        ApplicationC6132.m17119(116);
    }

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void mo30807(CharSequence charSequence, int i, int i2, int i3);

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30809(C6111 c6111, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        c6111.m17000().replace(this.f41386, this.f41385, string);
        c6111.mo17029(string.length() + this.f41386);
    }

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo30810(C6111 c6111, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int i = this.f41386;
        InterfaceC2916 interfaceC2916M17001 = c6111.m17000();
        int i2 = this.f41385;
        this.f41389.getClass();
        interfaceC2916M17000.replace(i, C22696.m50258(interfaceC2916M17001, i2), string);
        c6111.mo17029(string.length() + this.f41386);
        return true;
    }

    public C12382(Context context) {
        super(context);
        this.f41384 = new ForegroundColorSpan(C20368.f65970);
        this.f41389 = new C22696();
        this.f41388 = new C16615(this);
    }

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30808(C6111 c6111) {
        C3329 c3329Mo2399 = c6111.m17000().mo2399();
        try {
            boolean z = c3329Mo2399.length() > 100000;
            this.f41387 = z;
            this.f41389.m50265(z ? new C1797(100000, c3329Mo2399) : c3329Mo2399);
            c3329Mo2399.close();
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20848 mo30806(int i, CharSequence charSequence) {
        int length;
        C22696 c22696 = this.f41389;
        c22696.getClass();
        final String strM50260 = C22696.m50260(i, charSequence);
        if (strM50260.isEmpty() || this.f41390 < (length = i - strM50260.length())) {
            return null;
        }
        StringBuilder sbM23356 = C9023.m23356(strM50260);
        sbM23356.append(C22696.m50256(i, charSequence));
        final String string = sbM23356.toString();
        InterfaceC5046 interfaceC5046Filter = c22696.m50263().filter(new Predicate() { // from class: l.᩶ۨۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C12382.m30805(this.f65400, string, (C6467) obj);
            }
        });
        final String lowerCase = strM50260.toLowerCase();
        InterfaceC5046 map = interfaceC5046Filter.map(new Function() { // from class: l.ܿۨۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C23671.m52114(strM50260, lowerCase, (C8148) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        }).filter(new C6031()).sorted(new C1522(1)).map(new C0386(0, this));
        int i2 = C20848.f67732;
        C20848 c20848 = (C20848) map.collect(C1890.toCollection(new C7442()));
        if (c20848.isEmpty()) {
            return null;
        }
        if (c20848.size() == 1 && ((SpannableString) c20848.get(0)).toString().equals(strM50260)) {
            return null;
        }
        c20848.m46873(length);
        this.f41386 = length;
        this.f41385 = i;
        return c20848;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m30805(C12382 c12382, String str, C6467 c6467) {
        return !c6467.m21459().equals(str) || c12382.f41389.m50262(c6467) > 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ SpannableString m30803(C12382 c12382, C10971 c10971) {
        ForegroundColorSpan foregroundColorSpan = c12382.f41384;
        SpannableString spannableString = new SpannableString(c10971.f37385);
        boolean z = true;
        int i = -1;
        int i2 = -1;
        for (int i3 : c10971.f37387) {
            if (i == -1) {
                i2 = i3 + 1;
                i = i3;
            } else if (i3 == i2) {
                i2 = i3 + 1;
            } else {
                spannableString.setSpan(z ? foregroundColorSpan : new ForegroundColorSpan(C20368.f65970), i, i2, 33);
                i2 = i3 + 1;
                i = i3;
                z = false;
            }
        }
        if (i != -1) {
            if (!z) {
                foregroundColorSpan = new ForegroundColorSpan(C20368.f65970);
            }
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        return spannableString;
    }
}
