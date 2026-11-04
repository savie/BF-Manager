package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes.dex */
public final class C20771 extends AbstractC17787 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66545;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f66546;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66547;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ForegroundColorSpan f66548;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextWatcher f66549;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10942 f66550;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f66551;

    static {
        ApplicationC23172.m52091(147);
    }

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public native void mo41619(CharSequence charSequence, int i, int i2, int i3);

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public final void mo23702(C24132 c24132, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        c24132.m54021().replace(this.f66547, this.f66545, string);
        c24132.mo52339(string.length() + this.f66547);
    }

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo41627(C24132 c24132, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int i = this.f66547;
        InterfaceC19106 interfaceC19106M54022 = c24132.m54021();
        int i2 = this.f66545;
        this.f66550.getClass();
        interfaceC19106M54021.replace(i, C10942.m27757(interfaceC19106M54022, i2), string);
        c24132.mo52339(string.length() + this.f66547);
        return true;
    }

    public C20771(Context context) {
        super(context);
        this.f66548 = new ForegroundColorSpan(C3296.f10738);
        this.f66550 = new C10942();
        this.f66549 = new C3617(this);
    }

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public final void mo41620(C24132 c24132) {
        C15508 c15508Mo15350 = c24132.m54021().mo15350();
        try {
            boolean z = c15508Mo15350.length() > 100000;
            this.f66546 = z;
            this.f66550.m27765(z ? new C21517(100000, c15508Mo15350) : c15508Mo15350);
            c15508Mo15350.close();
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public final C17041 mo23701(int i, CharSequence charSequence) {
        int length;
        C10942 c10942 = this.f66550;
        c10942.getClass();
        final String strM27759 = C10942.m27759(i, charSequence);
        if (strM27759.isEmpty() || this.f66551 < (length = i - strM27759.length())) {
            return null;
        }
        StringBuilder sbM27333 = C10732.m27333(strM27759);
        sbM27333.append(C10942.m27761(i, charSequence));
        final String string = sbM27333.toString();
        InterfaceC20670 interfaceC20670Filter = c10942.m27763().filter(new Predicate() { // from class: l.ܶᩴᩴ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C20771.m47521(this.f52905, string, (C22131) obj);
            }
        });
        final String lowerCase = strM27759.toLowerCase();
        InterfaceC20670 map = interfaceC20670Filter.map(new Function() { // from class: l.ۨᩴᩴ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C4363.m13865(strM27759, lowerCase, (C13312) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).filter(new C0110(1)).sorted(new C6601(0)).map(new Function() { // from class: l.᩹ᩴᩴ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C20771.m47519(this.f76981, (C24501) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
        int i2 = C17041.f55684;
        C17041 c17041 = (C17041) map.collect(C2025.toCollection(new C25247()));
        if (c17041.isEmpty()) {
            return null;
        }
        if (c17041.size() == 1 && ((SpannableString) c17041.get(0)).toString().equals(strM27759)) {
            return null;
        }
        c17041.m40150(length);
        this.f66547 = length;
        this.f66545 = i;
        return c17041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47521(C20771 c20771, String str, C22131 c22131) {
        return !c22131.m32875().equals(str) || c20771.f66550.m27762(c22131) > 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ SpannableString m47519(C20771 c20771, C24501 c24501) {
        ForegroundColorSpan foregroundColorSpan = c20771.f66548;
        SpannableString spannableString = new SpannableString(c24501.f79480);
        boolean z = true;
        int i = -1;
        int i2 = -1;
        for (int i3 : c24501.f79482) {
            if (i == -1) {
                i2 = i3 + 1;
                i = i3;
            } else if (i3 == i2) {
                i2 = i3 + 1;
            } else {
                spannableString.setSpan(z ? foregroundColorSpan : new ForegroundColorSpan(C3296.f10738), i, i2, 33);
                i2 = i3 + 1;
                i = i3;
                z = false;
            }
        }
        if (i != -1) {
            if (!z) {
                foregroundColorSpan = new ForegroundColorSpan(C3296.f10738);
            }
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        return spannableString;
    }
}
