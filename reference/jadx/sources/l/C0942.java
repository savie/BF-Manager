package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0942 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3479;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC21825 f3480;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9890 f3481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0942 m3762() {
        final C16603 c16603 = new C16603(Pattern.compile("\r\n|\n|\r"));
        C12128.m30306(c16603, "The pattern may not match the empty string: %s", !c16603.m39287("").f80276.matches());
        return new C0942(new InterfaceC9890() { // from class: l.ܰۙܽ
            @Override // l.InterfaceC9890
            /* JADX INFO: renamed from: ۙ */
            public final Iterator mo25700(C0942 c0942, CharSequence charSequence) {
                return new C0196(c0942, charSequence, c16603.m39287(charSequence));
            }
        });
    }

    public C0942(InterfaceC9890 interfaceC9890) {
        AbstractC21825 abstractC21825 = C13879.f44021;
        this.f3481 = interfaceC9890;
        this.f3480 = abstractC21825;
        this.f3479 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0942 m3763(char c) {
        final C10150 c10150 = new C10150(c);
        return new C0942(new InterfaceC9890() { // from class: l.᩶ۙܽ
            @Override // l.InterfaceC9890
            /* JADX INFO: renamed from: ۙ */
            public final Iterator mo25700(C0942 c0942, CharSequence charSequence) {
                return new C18095(c0942, charSequence, c10150);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m3761(C0942 c0942, CharSequence charSequence) {
        return c0942.f3481.mo25700(c0942, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable m3766(CharSequence charSequence) {
        charSequence.getClass();
        return new C7654(this, charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m3767(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo25700 = this.f3481.mo25700(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC0456 abstractC0456 = (AbstractC0456) itMo25700;
            if (abstractC0456.hasNext()) {
                arrayList.add((String) abstractC0456.next());
            } else {
                return C4681.unmodifiableList(arrayList);
            }
        }
    }
}
