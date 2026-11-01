package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۘۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AO6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3919 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11367(C9151 c9151) throws XmlPullParserException, IOException {
        C15210 c15210 = new C15210();
        c15210.setInput(c9151, "utf-8");
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        while (true) {
            int next = c15210.next();
            if (next == 1) {
                return C6851.m18456(arrayList, "\n");
            }
            if (next == 2) {
                C19443 c19443 = new C19443(c15210.getName());
                if (stack.isEmpty()) {
                    arrayList.add(c19443);
                } else {
                    ((C19443) stack.peek()).mo21467(c19443);
                }
                stack.push(c19443);
                int attributeCount = c15210.getAttributeCount();
                int i = 0;
                while (i < attributeCount) {
                    int iM36418 = c15210.m36418(i);
                    String attributeName = c15210.getAttributeName(i);
                    String attributeValue = c15210.getAttributeValue(i);
                    C15210 c15211 = c15210;
                    Stack stack2 = stack;
                    int i2 = attributeCount;
                    ArrayList arrayList2 = arrayList;
                    int i3 = i;
                    switch (iM36418) {
                        case 16:
                            attributeName = C15489.m37076(attributeName, "-null");
                            attributeValue = "";
                            break;
                        case 32:
                            if (attributeName.endsWith("-null") || attributeName.endsWith("-str") || attributeName.endsWith("-interned") || attributeName.endsWith("-hex") || attributeName.endsWith("-base64") || attributeName.endsWith("-int") || attributeName.endsWith("-long") || attributeName.endsWith("-float") || attributeName.endsWith("-double") || attributeName.endsWith("-bool")) {
                                attributeName = attributeName.concat("-str");
                            }
                            break;
                        case 48:
                            attributeName = C15489.m37076(attributeName, "-interned");
                            break;
                        case 64:
                            attributeName = C15489.m37076(attributeName, "-hex");
                            break;
                        case 80:
                            attributeName = C15489.m37076(attributeName, "-base64");
                            break;
                        case 96:
                            attributeName = C15489.m37076(attributeName, "-int");
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            attributeName = C15489.m37076(attributeName, "-int");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C0242.m1616(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case 128:
                            attributeName = C15489.m37076(attributeName, "-long");
                            break;
                        case 144:
                            attributeName = C15489.m37076(attributeName, "-long");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C0242.m1616(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            attributeName = C15489.m37076(attributeName, "-float");
                            break;
                        case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                            attributeName = C15489.m37076(attributeName, "-double");
                            break;
                        case 192:
                        case 208:
                            attributeName = C15489.m37076(attributeName, "-bool");
                            break;
                    }
                    c19443.mo21465(attributeName, attributeValue);
                    i = i3 + 1;
                    stack = stack2;
                    c15210 = c15211;
                    attributeCount = i2;
                    arrayList = arrayList2;
                }
            } else if (next != 3) {
                if (next == 4 && !stack.isEmpty()) {
                    ((C19443) stack.peek()).mo21467(new C8154(c15210.getText()));
                }
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
            stack = stack;
            c15210 = c15210;
            arrayList = arrayList;
        }
    }
}
