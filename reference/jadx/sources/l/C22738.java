package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩸ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AO6 */
/* JADX INFO: loaded from: classes.dex */
public final class C22738 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51276(C25173 c25173) throws XmlPullParserException, IOException {
        C13041 c13041 = new C13041();
        c13041.setInput(c25173, "utf-8");
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        while (true) {
            int next = c13041.next();
            if (next == 1) {
                return C24276.m54283(arrayList, "\n");
            }
            if (next == 2) {
                C16770 c16770 = new C16770(c13041.getName());
                if (stack.isEmpty()) {
                    arrayList.add(c16770);
                } else {
                    ((C16770) stack.peek()).mo39583(c16770);
                }
                stack.push(c16770);
                int attributeCount = c13041.getAttributeCount();
                int i = 0;
                while (i < attributeCount) {
                    int iM32464 = c13041.m32464(i);
                    String attributeName = c13041.getAttributeName(i);
                    String attributeValue = c13041.getAttributeValue(i);
                    C13041 c13042 = c13041;
                    Stack stack2 = stack;
                    int i2 = attributeCount;
                    ArrayList arrayList2 = arrayList;
                    int i3 = i;
                    switch (iM32464) {
                        case 16:
                            attributeName = C14483.m34972(attributeName, "-null");
                            attributeValue = "";
                            break;
                        case 32:
                            if (attributeName.endsWith("-null") || attributeName.endsWith("-str") || attributeName.endsWith("-interned") || attributeName.endsWith("-hex") || attributeName.endsWith("-base64") || attributeName.endsWith("-int") || attributeName.endsWith("-long") || attributeName.endsWith("-float") || attributeName.endsWith("-double") || attributeName.endsWith("-bool")) {
                                attributeName = attributeName.concat("-str");
                            }
                            break;
                        case 48:
                            attributeName = C14483.m34972(attributeName, "-interned");
                            break;
                        case 64:
                            attributeName = C14483.m34972(attributeName, "-hex");
                            break;
                        case 80:
                            attributeName = C14483.m34972(attributeName, "-base64");
                            break;
                        case 96:
                            attributeName = C14483.m34972(attributeName, "-int");
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            attributeName = C14483.m34972(attributeName, "-int");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : ExternalValue$$ExternalSyntheticOutline0.m(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case 128:
                            attributeName = C14483.m34972(attributeName, "-long");
                            break;
                        case 144:
                            attributeName = C14483.m34972(attributeName, "-long");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : ExternalValue$$ExternalSyntheticOutline0.m(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            attributeName = C14483.m34972(attributeName, "-float");
                            break;
                        case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                            attributeName = C14483.m34972(attributeName, "-double");
                            break;
                        case 192:
                        case 208:
                            attributeName = C14483.m34972(attributeName, "-bool");
                            break;
                    }
                    c16770.mo39581(attributeName, attributeValue);
                    i = i3 + 1;
                    stack = stack2;
                    c13041 = c13042;
                    attributeCount = i2;
                    arrayList = arrayList2;
                }
            } else if (next != 3) {
                if (next == 4 && !stack.isEmpty()) {
                    ((C16770) stack.peek()).mo39583(new C24976(c13041.getText()));
                }
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
            stack = stack;
            c13041 = c13041;
            arrayList = arrayList;
        }
    }
}
