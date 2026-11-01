package l;

import java.io.IOException;
import java.io.StringWriter;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F2DJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2721 extends AbstractC14696 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f10463;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10464;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f10465;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f10466;

    public C2721(Map map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.f10465 = new HashMap();
        this.f10463 = new HashSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            this.f10465.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
            this.f10463.add(Character.valueOf(((CharSequence) entry.getKey()).charAt(0)));
            int length = ((CharSequence) entry.getKey()).length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f10464 = i;
        this.f10466 = i2;
    }

    @Override // l.AbstractC14696
    /* JADX INFO: renamed from: ۙ */
    public final int mo4663(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f10463.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f10466;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f10464) {
            String str = (String) this.f10465.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
