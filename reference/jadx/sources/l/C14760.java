package l;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܳ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14760 extends AbstractC18413 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f48275 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f48276;

    public C14760(Object obj) {
        super(EnumC9947.CONSTANT);
        this.f48276 = obj;
    }

    @Override // l.AbstractC18413, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C14760(this.f48276);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C14760(this.f48276);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        Object obj = this.f48276;
        if (f48275 == obj) {
            return "null";
        }
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            if (obj instanceof Float) {
                return this.f48276.toString() + "F";
            }
            if (!(obj instanceof Long)) {
                return obj.toString();
            }
            return this.f48276.toString() + "L";
        }
        int i = 0;
        if (!(obj instanceof String)) {
            if (obj instanceof C1686) {
                return C19378.m44398(((C1686) this.f48276).f6677) + ".class";
            }
            if (!obj.getClass().isArray()) {
                return "" + this.f48276;
            }
            StringBuilder sbM23356 = C9023.m23356("[");
            int length = Array.getLength(this.f48276);
            while (i < length) {
                sbM23356.append(Array.get(this.f48276, i));
                sbM23356.append(",");
                i++;
            }
            if (length > 0) {
                sbM23356.setLength(sbM23356.length() - 1);
            }
            sbM23356.append("]");
            return sbM23356.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("\"");
        String str = (String) this.f48276;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                stringBuffer.append("\\n");
            } else if (cCharAt == '\r') {
                stringBuffer.append("\\r");
            } else if (cCharAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (cCharAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (cCharAt < ' ' || cCharAt > 127) {
                stringBuffer.append("\\u");
                if (cCharAt < 16) {
                    stringBuffer.append("000");
                } else if (cCharAt < 256) {
                    stringBuffer.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
                } else if (cCharAt < 4096) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(cCharAt, 16));
            } else {
                stringBuffer.append(cCharAt);
            }
            i++;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }
}
