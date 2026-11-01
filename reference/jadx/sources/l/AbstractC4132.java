package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۘᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M2DV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4132 extends AbstractC14696 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10104(CharSequence charSequence, StringWriter stringWriter);

    @Override // l.AbstractC14696
    /* JADX INFO: renamed from: ۙ */
    public int mo4663(CharSequence charSequence, int i, StringWriter stringWriter) {
        if (i == 0) {
            mo10104(charSequence, stringWriter);
            return Character.codePointCount(charSequence, i, charSequence.length());
        }
        Class<?> cls = getClass();
        throw new IllegalArgumentException((cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName()).concat(".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index."));
    }
}
