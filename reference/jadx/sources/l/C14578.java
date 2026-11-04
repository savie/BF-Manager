package l;

/* JADX INFO: renamed from: l.ܰۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14578 extends AbstractC21292 {
    @Override // l.AbstractC21292
    /* JADX INFO: renamed from: ۙ */
    public final int mo13267(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(((String) charSequence2).toString(), i);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder) charSequence).indexOf(((String) charSequence2).toString(), i);
        }
        if (charSequence instanceof StringBuffer) {
            return ((StringBuffer) charSequence).indexOf(((String) charSequence2).toString(), i);
        }
        return ((String) charSequence).toString().indexOf(((String) charSequence2).toString(), i);
    }
}
