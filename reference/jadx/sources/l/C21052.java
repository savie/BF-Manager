package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21052 extends AbstractC3152 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f67281;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f67282;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f67283;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BitSet f67284;

    public C21052(Map map) {
        C17359.requireNonNull(map, "lookupMap");
        this.f67281 = new HashMap();
        this.f67284 = new BitSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            this.f67281.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
            this.f67284.set(((CharSequence) entry.getKey()).charAt(0));
            int length = ((CharSequence) entry.getKey()).length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f67282 = i;
        this.f67283 = i2;
    }

    @Override // l.AbstractC3152
    /* JADX INFO: renamed from: ۙ */
    public final int mo3683(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (this.f67284.get(charSequence.charAt(i))) {
            int length = this.f67283;
            if (i + length > charSequence.length()) {
                length = charSequence.length() - i;
            }
            while (length >= this.f67282) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i + length);
                String str = (String) this.f67281.get(charSequenceSubSequence.toString());
                if (str != null) {
                    stringWriter.write(str);
                    return Character.codePointCount(charSequenceSubSequence, 0, charSequenceSubSequence.length());
                }
                length--;
            }
        }
        return 0;
    }
}
