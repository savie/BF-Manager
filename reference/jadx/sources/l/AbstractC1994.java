package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.֫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M2E0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1994 extends AbstractC14696 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo6410(int i, StringWriter stringWriter);

    @Override // l.AbstractC14696
    /* JADX INFO: renamed from: ۙ */
    public final int mo4663(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo6410(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
