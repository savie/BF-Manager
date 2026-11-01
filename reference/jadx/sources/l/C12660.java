package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42271;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC14384 f42272;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16893 f42273;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12660 m31454() {
        final C1370 c1370 = new C1370(Pattern.compile("\r\n|\n|\r"));
        C18304.m42514(c1370, "The pattern may not match the empty string: %s", !c1370.m4816("").f73508.matches());
        return new C12660(new InterfaceC16893() { // from class: l.ۤ᩷ܶ
            @Override // l.InterfaceC16893
            /* JADX INFO: renamed from: ۙ */
            public final Iterator mo20370(C12660 c12660, CharSequence charSequence) {
                return new C16188(c12660, charSequence, c1370.m4816(charSequence));
            }
        });
    }

    public C12660(InterfaceC16893 interfaceC16893) {
        AbstractC14384 abstractC14384 = C10856.f36927;
        this.f42273 = interfaceC16893;
        this.f42272 = abstractC14384;
        this.f42271 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12660 m31455(char c) {
        final C20028 c20028 = new C20028(c);
        return new C12660(new InterfaceC16893() { // from class: l.۟᩷ܶ
            @Override // l.InterfaceC16893
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final Iterator mo20370(C12660 c12660, CharSequence charSequence) {
                return new C21126(c12660, charSequence, c20028);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m31453(C12660 c12660, CharSequence charSequence) {
        return c12660.f42273.mo20370(c12660, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable m31458(CharSequence charSequence) {
        charSequence.getClass();
        return new C20421(this, charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m31459(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo20370 = this.f42273.mo20370(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC7327 abstractC7327 = (AbstractC7327) itMo20370;
            if (abstractC7327.hasNext()) {
                arrayList.add((String) abstractC7327.next());
            } else {
                return C0561.unmodifiableList(arrayList);
            }
        }
    }
}
