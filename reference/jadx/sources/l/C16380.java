package l;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܶ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16380 extends AbstractC8922 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f53171 = new Object();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f53172;

    public C16380(Object obj) {
        super(EnumC22260.CONSTANT);
        this.f53172 = obj;
    }

    @Override // l.AbstractC8922, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C16380(this.f53172);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C16380(this.f53172);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        Object obj = this.f53172;
        if (f53171 == obj) {
            return "null";
        }
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            if (obj instanceof Float) {
                return this.f53172.toString() + "F";
            }
            if (!(obj instanceof Long)) {
                return obj.toString();
            }
            return this.f53172.toString() + "L";
        }
        int i = 0;
        if (!(obj instanceof String)) {
            if (obj instanceof C15855) {
                return C2211.m7539(((C15855) this.f53172).f51558) + ".class";
            }
            if (!obj.getClass().isArray()) {
                return "" + this.f53172;
            }
            StringBuilder sbM27333 = C10732.m27333("[");
            int length = Array.getLength(this.f53172);
            while (i < length) {
                sbM27333.append(Array.get(this.f53172, i));
                sbM27333.append(",");
                i++;
            }
            if (length > 0) {
                sbM27333.setLength(sbM27333.length() - 1);
            }
            sbM27333.append("]");
            return sbM27333.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("\"");
        String str = (String) this.f53172;
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
