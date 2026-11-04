package l;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Xml;
import android.view.accessibility.AccessibilityNodeInfo;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ܺ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6EN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55898;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f55900 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f55899 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17147 m40289(String str) throws XmlPullParserException, IOException {
        LinkedHashMap linkedHashMap;
        if (str.length() > 16777216) {
            throw new IOException("Snapshot exceeds XML size limit");
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        C17147 c17147 = new C17147();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int iNextToken = xmlPullParserNewPullParser.nextToken();
            ArrayList arrayList2 = c17147.f55900;
            if (iNextToken == 1) {
                if (z && arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    return c17147;
                }
                throw new IOException("Empty or incomplete snapshot");
            }
            if (iNextToken == 10) {
                throw new IOException("DOCTYPE is not allowed");
            }
            if (iNextToken == 2) {
                if (xmlPullParserNewPullParser.getDepth() == 1 && "hierarchy".equals(xmlPullParserNewPullParser.getName()) && !z2) {
                    z2 = true;
                } else {
                    if (!z2 || z || !"node".equals(xmlPullParserNewPullParser.getName())) {
                        throw new IOException("Unexpected snapshot element");
                    }
                    if (arrayList.size() >= 128 || arrayList2.size() >= 5000) {
                        throw new IOException("Snapshot exceeds tree limit");
                    }
                    C25353 c25353 = new C25353(arrayList.isEmpty() ? -1 : ((Integer) j$$ExternalSyntheticOutline0.m(arrayList, 1)).intValue());
                    int i = 0;
                    while (true) {
                        int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                        linkedHashMap = c25353.f81866;
                        if (i >= attributeCount) {
                            break;
                        }
                        linkedHashMap.put(xmlPullParserNewPullParser.getAttributeName(i), xmlPullParserNewPullParser.getAttributeValue(i));
                        i++;
                    }
                    String str2 = (String) linkedHashMap.get("bounds");
                    if (str2 == null || linkedHashMap.get(Name.LABEL) == null || linkedHashMap.get("package") == null) {
                        throw new IOException("Missing required node attributes");
                    }
                    int iIndexOf = str2.indexOf(44);
                    int iIndexOf2 = str2.indexOf("][");
                    int i2 = iIndexOf2 + 2;
                    int iIndexOf3 = str2.indexOf(44, i2);
                    try {
                        if (!str2.startsWith("[") || !str2.endsWith("]") || iIndexOf < 2 || iIndexOf2 <= iIndexOf || iIndexOf3 <= i2) {
                            throw new NumberFormatException();
                        }
                        Integer.parseInt(str2.substring(1, iIndexOf));
                        Integer.parseInt(str2.substring(iIndexOf + 1, iIndexOf2));
                        Integer.parseInt(str2.substring(i2, iIndexOf3));
                        Integer.parseInt(str2.substring(iIndexOf3 + 1, str2.length() - 1));
                        arrayList.add(Integer.valueOf(arrayList2.size()));
                        arrayList2.add(c25353);
                        c17147.f55898 = Math.max(c17147.f55898, arrayList.size());
                        String str3 = (String) linkedHashMap.get("package");
                        if (!str3.isEmpty()) {
                            c17147.f55899.add(str3);
                        }
                    } catch (NumberFormatException e) {
                        throw new IOException("Invalid node bounds", e);
                    }
                }
            } else if (iNextToken == 3) {
                if ("node".equals(xmlPullParserNewPullParser.getName())) {
                    C2764.m9138(arrayList, 1);
                } else if ("hierarchy".equals(xmlPullParserNewPullParser.getName())) {
                    z = true;
                }
            } else if (iNextToken == 4 || iNextToken == 5) {
                if (!xmlPullParserNewPullParser.getText().trim().isEmpty()) {
                    throw new IOException("Unexpected snapshot text");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40288(AccessibilityNodeInfo accessibilityNodeInfo) throws IOException {
        if (accessibilityNodeInfo == null) {
            throw new IOException("Active window root is null");
        }
        try {
            C2232 c2232 = new C2232();
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            xmlSerializerNewSerializer.setOutput(c2232);
            xmlSerializerNewSerializer.startDocument(a.D, Boolean.TRUE);
            xmlSerializerNewSerializer.startTag(null, "hierarchy");
            m40290(xmlSerializerNewSerializer, accessibilityNodeInfo, 0, 1, new C11926());
            xmlSerializerNewSerializer.endTag(null, "hierarchy");
            xmlSerializerNewSerializer.endDocument();
            return c2232.toString();
        } finally {
            accessibilityNodeInfo.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40290(XmlSerializer xmlSerializer, AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2, C11926 c11926) throws IOException {
        int i3 = c11926.f38421 + 1;
        c11926.f38421 = i3;
        if (i3 > 5000 || i2 > 128) {
            throw new IOException("Accessibility snapshot exceeds tree or size limit");
        }
        if (SystemClock.uptimeMillis() >= c11926.f38422 || Thread.currentThread().isInterrupted()) {
            throw new IOException("Accessibility capture timed out or was interrupted");
        }
        xmlSerializer.startTag(null, "node");
        xmlSerializer.attribute(null, "index", Integer.toString(i));
        m40291(xmlSerializer, "package", accessibilityNodeInfo.getPackageName());
        m40291(xmlSerializer, Name.LABEL, accessibilityNodeInfo.getClassName());
        m40291(xmlSerializer, "resource-id", accessibilityNodeInfo.getViewIdResourceName());
        m40291(xmlSerializer, TextBundle.TEXT_ENTRY, accessibilityNodeInfo.getText());
        m40291(xmlSerializer, "content-desc", accessibilityNodeInfo.getContentDescription());
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        xmlSerializer.attribute(null, "bounds", rect.toShortString());
        xmlSerializer.attribute(null, "clickable", Boolean.toString(accessibilityNodeInfo.isClickable()));
        xmlSerializer.attribute(null, "long-clickable", Boolean.toString(accessibilityNodeInfo.isLongClickable()));
        xmlSerializer.attribute(null, "enabled", Boolean.toString(accessibilityNodeInfo.isEnabled()));
        xmlSerializer.attribute(null, "checkable", Boolean.toString(accessibilityNodeInfo.isCheckable()));
        xmlSerializer.attribute(null, "checked", Boolean.toString(accessibilityNodeInfo.isChecked()));
        xmlSerializer.attribute(null, "focusable", Boolean.toString(accessibilityNodeInfo.isFocusable()));
        xmlSerializer.attribute(null, "focused", Boolean.toString(accessibilityNodeInfo.isFocused()));
        xmlSerializer.attribute(null, "scrollable", Boolean.toString(accessibilityNodeInfo.isScrollable()));
        xmlSerializer.attribute(null, "selected", Boolean.toString(accessibilityNodeInfo.isSelected()));
        xmlSerializer.attribute(null, "password", Boolean.toString(accessibilityNodeInfo.isPassword()));
        xmlSerializer.attribute(null, "visible-to-user", Boolean.toString(accessibilityNodeInfo.isVisibleToUser()));
        C18419.m42938(xmlSerializer, accessibilityNodeInfo);
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i4);
            if (child == null) {
                throw new IOException("Accessibility child disappeared during capture");
            }
            try {
                m40290(xmlSerializer, child, i4, i2 + 1, c11926);
                child.recycle();
            } catch (Throwable th) {
                child.recycle();
                throw th;
            }
        }
        xmlSerializer.endTag(null, "node");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40291(XmlSerializer xmlSerializer, String str, CharSequence charSequence) throws IOException {
        String string;
        int i;
        if (charSequence != null && charSequence.length() > 16777216) {
            throw new IOException("Accessibility attribute exceeds size limit");
        }
        if (charSequence == null) {
            string = "";
        } else {
            int i2 = 0;
            StringBuilder sb = null;
            while (i2 < charSequence.length()) {
                char cCharAt = charSequence.charAt(i2);
                boolean z = Character.isHighSurrogate(cCharAt) && (i = i2 + 1) < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i));
                boolean z2 = z || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || (cCharAt >= ' ' && cCharAt < 65534 && !Character.isSurrogate(cCharAt));
                if (!z2 && sb == null) {
                    sb = new StringBuilder(charSequence.length());
                    sb.append(charSequence, 0, i2);
                }
                if (sb != null) {
                    if (!z2) {
                        cCharAt = 65533;
                    }
                    sb.append(cCharAt);
                    if (z) {
                        sb.append(charSequence.charAt(i2 + 1));
                    }
                }
                if (z) {
                    i2++;
                }
                i2++;
            }
            string = sb == null ? charSequence.toString() : sb.toString();
        }
        xmlSerializer.attribute(null, str, string);
    }
}
