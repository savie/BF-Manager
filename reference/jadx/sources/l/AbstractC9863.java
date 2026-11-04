package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۢۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2DV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9863 extends AbstractC3152 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17737(CharSequence charSequence, StringWriter stringWriter);

    @Override // l.AbstractC3152
    /* JADX INFO: renamed from: ۙ */
    public int mo3683(CharSequence charSequence, int i, StringWriter stringWriter) {
        if (i != 0) {
            Class<?> cls = getClass();
            throw new IllegalArgumentException((cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName()).concat(".translate(final CharSequence input, final int index, final Writer out) cannot handle a non-zero index."));
        }
        mo17737(charSequence, stringWriter);
        return Character.codePointCount(charSequence, i, charSequence.length());
    }
}
